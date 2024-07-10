package com.example.common.util;

import org.apache.commons.collections4.CollectionUtils;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class TreeUtils {

    /**
     * 将树形结构转换为扁平结构，深度遍历。
     *
     * @param source             源数据
     * @param target             目标容器
     * @param childListFn        递归调用方法
     * @param addTargetCondition 添加到容器的判断方法
     * @param <F>                数据类型
     */
    public static <F> void treeToListDeep(List<F> source, List<F> target, Function<F, List<F>> childListFn, Predicate<F> addTargetCondition) {
        loopTree(source, childListFn, l -> {
            if (addTargetCondition.test(l)) {
                target.add(l);
            }
        });
    }

    /**
     * 将树形结构转换为扁平结构，深度遍历。
     *
     * @param source             源数据
     * @param childListFn        递归调用方法
     * @param addTargetCondition 添加到容器的判断方法
     * @param <F>                数据类型
     * @return                   转换后的列表结构
     */
    public static <F> List<F> treeToListDeep(List<F> source, Function<F, List<F>> childListFn, Predicate<F> addTargetCondition) {
        List<F> target = new ArrayList<>();
        treeToListDeep(source, target, childListFn, addTargetCondition);
        return target;
    }

    /**
     * 将扁平结构转换为树形结构。
     *
     * @param source           源数据
     * @param setChildListFn   设置递归的方法
     * @param idFn             获取id的方法
     * @param pidFn            获取父id的方法
     * @param getRootCondition 获取根节点的方法
     * @param <F>              数据类型
     * @param <T>              ID类型
     * @return 转换后的树形结构
     */
    public static <F, T> List<F> listToTree(List<F> source, BiConsumer<F, List<F>> setChildListFn, Function<F, T> idFn, Function<F, T> pidFn, Predicate<F> getRootCondition) {
        return listToTree(source, setChildListFn, idFn, pidFn, getRootCondition, null);
    }

    /**
     * 将扁平结构转换为树形结构，可进行回调监听。
     *
     * @param source           源数据
     * @param setChildListFn   设置递归的方法
     * @param idFn             获取id的方法
     * @param pidFn            获取父id的方法
     * @param getRootCondition 获取根节点的方法
     * @param listen           回调函数
     * @param <F>              数据类型
     * @param <T>              ID类型
     * @return 转换后的树形结构
     */
    public static <F, T> List<F> listToTree(List<F> source, BiConsumer<F, List<F>> setChildListFn, Function<F, T> idFn, Function<F, T> pidFn, Predicate<F> getRootCondition, BiConsumer<Integer, F> listen) {
        List<F> tree = new ArrayList<>();
        Map<T, List<F>> map = new HashMap<>(source.size());

        // Collect nodes by their parent IDs
        for (F f : source) {
            T parentId = pidFn.apply(f);
            if (getRootCondition.test(f) || parentId == null) {
                // Node is a root node
                tree.add(f);
            } else {
                // Node has a parent, add it to the corresponding list
                List<F> tempList = map.getOrDefault(parentId, new ArrayList<>());
                tempList.add(f);
                map.put(parentId, tempList);
            }
        }

        // Assemble tree structure
        tree.forEach(root -> assembleTree(root, map, setChildListFn, idFn, listen, 0));

        return tree;
    }

    /**
     * 组装树形结构的内部递归方法。
     *
     * @param current        当前节点
     * @param map            以父ID分组的节点Map
     * @param setChildListFn 设置递归的方法
     * @param idFn           获取id的方法
     * @param listen         回调函数
     * @param idx            当前深度
     * @param <F>            数据类型
     * @param <T>            ID类型
     */
    private static <F, T> void assembleTree(F current, Map<T, List<F>> map, BiConsumer<F, List<F>> setChildListFn, Function<F, T> idFn, BiConsumer<Integer, F> listen, int idx) {
        List<F> fs = map.get(idFn.apply(current));
        setChildListFn.accept(current, fs);
        if (CollectionUtils.isNotEmpty(fs)) {
            fs.forEach(l -> assembleTree(l, map, setChildListFn, idFn, listen, idx + 1));
        }
        if (listen != null) {
            listen.accept(idx, current);
        }
    }

    /**
     * 树形结构的简易递归，可以回调当前对象。
     *
     * @param source      源数据
     * @param childListFn 获取子节点的方法
     * @param listen      回调函数
     * @param <F>         数据类型
     */
    public static <F> void loopTree(List<F> source, Function<F, List<F>> childListFn, Consumer<F> listen) {
        loopTree(source, childListFn, listen, null);
    }

    /**
     * 树形结构的简易递归，可以在遍历前后进行回调。
     *
     * @param source      源数据
     * @param childListFn 获取子节点的方法
     * @param preListen   遍历前的回调函数
     * @param postFun     遍历后的回调函数
     * @param <F>         数据类型
     */
    public static <F> void loopTree(List<F> source, Function<F, List<F>> childListFn, Consumer<F> preListen, Consumer<F> postFun) {
        if (CollectionUtils.isEmpty(source)) {
            return;
        }
        source.forEach(l -> {
            Optional.ofNullable(preListen).ifPresent(s -> s.accept(l));
            loopTree(childListFn.apply(l), childListFn, preListen, postFun);
            Optional.ofNullable(postFun).ifPresent(s -> s.accept(l));
        });
    }
}
