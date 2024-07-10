package com.example.common.util;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.security.AlgorithmParameters;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Base64;

public class AESUtils {
    private static final Logger logger = LoggerFactory.getLogger(AESUtils.class);

    private static final String KEY_ALGORITHM = "AES";
    private static final String CHAR_SET = "UTF-8";

    private static final String DETAULT_PWD = "market_aes_pwd";

    /**
     * AES的密钥长度
     */
    private static final Integer SECRET_KEY_LENGTH = 256;
    /**
     * 加解密算法/工作模式/填充方式
     */
    private static final String DEFAULT_CIPHER_ALGORITHM = "AES/ECB/PKCS5Padding";

    /**
     * AES加密操作
     *
     * @param content  待加密内容
     * @param password 加密密码
     * @return 返回Base64转码后的加密数据
     */
    public static String encrypt(String content, String password) {
        if (StringUtils.isAnyEmpty(content, password)) {
            logger.error("AES encryption params is null");
            return null;
        }
        try {
            //创建密码器
            Cipher cipher = Cipher.getInstance(DEFAULT_CIPHER_ALGORITHM);
            byte[] byteContent = content.getBytes(CHAR_SET);
            //初始化为加密密码器
            cipher.init(Cipher.ENCRYPT_MODE, getSecretKey(password));
            byte[] encryptByte = cipher.doFinal(byteContent);
            return Base64.getEncoder().encodeToString(encryptByte);
        } catch (Exception e) {
            logger.error("AES encryption operation has exception,content:{},password:{}", content, password, e);
        }
        return null;
    }

    /**
     * AES解密操作
     *
     * @param encryptContent 加密的密文
     * @param password       解密的密钥
     * @return
     */
    public static String decrypt(String encryptContent, String password) {
        if (StringUtils.isAnyEmpty(encryptContent, password)) {
            logger.error("AES decryption params is null");
            return null;
        }
        Cipher cipher = null;
        try {
            cipher = Cipher.getInstance(DEFAULT_CIPHER_ALGORITHM);
            //设置为解密模式
            cipher.init(Cipher.DECRYPT_MODE, getSecretKey(password));
            //执行解密操作
            byte[] result = cipher.doFinal(Base64.getDecoder().decode(encryptContent));
            return new String(result, CHAR_SET);
        } catch (Exception e) {
            logger.error("AES decryption operation has exception,content:{},password:{}", encryptContent, password, e);
        }
        return null;
    }

    /**
     * AES解密
     *
     * @param data           //密文，被加密的数据
     * @param key            //秘钥
     * @param iv             //偏移量
     * @return
     * @throws Exception
     */
    public static String decrypt(String data, String key, String iv,String cip){
//        initialize();

        //被加密的数据
        byte[] dataByte = org.apache.commons.codec.binary.Base64.decodeBase64(data);
        //加密秘钥
        byte[] keyByte = org.apache.commons.codec.binary.Base64.decodeBase64(key);
        //偏移量
        byte[] ivByte = org.apache.commons.codec.binary.Base64.decodeBase64(iv);


        try {
            Cipher cipher = Cipher.getInstance(cip);

            SecretKeySpec spec = new SecretKeySpec(keyByte, "AES");

            AlgorithmParameters parameters = AlgorithmParameters.getInstance("AES");
            parameters.init(new IvParameterSpec(ivByte));

            cipher.init(Cipher.DECRYPT_MODE, spec, parameters);// 初始化

            byte[] resultByte = cipher.doFinal(dataByte);
            if (null != resultByte && resultByte.length > 0) {
                String result = new String(resultByte, CHAR_SET);
                return result;
            }
            return null;
        } catch (Exception e) {
            logger.error("AES decryption operation has exception: {}", e);
        }

        return null;
    }

    private static SecretKeySpec getSecretKey(final String password) throws NoSuchAlgorithmException {
        //生成指定算法密钥的生成器
        KeyGenerator keyGenerator = KeyGenerator.getInstance(KEY_ALGORITHM);
        keyGenerator.init(SECRET_KEY_LENGTH, new SecureRandom(password.getBytes()));
        //生成密钥
        SecretKey secretKey = keyGenerator.generateKey();
        //转换成AES的密钥
        return new SecretKeySpec(secretKey.getEncoded(), KEY_ALGORITHM);
    }

    /**
     * 默认密码加密
     * @param content
     * @return
     */
    public static String encrypt(String content) {
        String encrypt = encrypt(content, DETAULT_PWD);
        return encrypt;
    }

    /**
     * 默认密码解密
     * @param content
     * @return
     */
    public static String decrypt(String content) {
        String decrypt = decrypt(content, DETAULT_PWD);
        return decrypt;
    }

    public static void main(String[] args) throws Exception {

        String test = encrypt("test");
        System.out.println("加密：" + test);

        String decrypt = decrypt(test);
        System.out.println("解密：" + decrypt);

    }

}
