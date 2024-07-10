package com.example.common.util;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * 通用的实体类 Builder 模式构建器
 * SysUser user = EntityBuilder.of(SysUser::new).with(SysUser::setOrgName,"orgNama").with(SysUser::setUserId,"1").build();
 */
public class EntityBuilder<T> {

    private final Supplier<T> instantiator;
    private final List<Consumer<T>> modifiers = new ArrayList<>();
    public EntityBuilder(Supplier<T> instantiator) {
        this.instantiator = instantiator;
    }
    public static <T> EntityBuilder<T> of(Supplier<T> instantiator) {
        return new EntityBuilder<>(instantiator);
    }
    public <P1> EntityBuilder<T> with(Consumer1<T, P1> consumer, P1 p1) {
        Consumer<T> c = instance -> consumer.accept(instance, p1);
        modifiers.add(c);
        return this;
    }
    public <P1, P2> EntityBuilder<T> with(Consumer2<T, P1, P2> consumer, P1 p1, P2 p2) {
        Consumer<T> c = instance -> consumer.accept(instance, p1, p2);
        modifiers.add(c);
        return this;
    }
    public <P1, P2, P3> EntityBuilder<T> with(Consumer3<T, P1, P2, P3> consumer, P1 p1, P2 p2, P3 p3) {
        Consumer<T> c = instance -> consumer.accept(instance, p1, p2, p3);
        modifiers.add(c);
        return this;
    }
    public T build() {
        T value = instantiator.get();
        modifiers.forEach(modifier -> modifier.accept(value));
        modifiers.clear();
        return value;
    }
    /**
     * 1 参数 Consumer
     */
    @FunctionalInterface
    public interface Consumer1<T, P1> {
        void accept(T t, P1 p1);
    }
    /**
     * 2 参数 Consumer
     */
    @FunctionalInterface
    public interface Consumer2<T, P1, P2> {
        void accept(T t, P1 p1, P2 p2);
    }
    /**
     * 3 参数 Consumer
     */
    @FunctionalInterface
    public interface Consumer3<T, P1, P2, P3> {
        void accept(T t, P1 p1, P2 p2, P3 p3);
    }

}
