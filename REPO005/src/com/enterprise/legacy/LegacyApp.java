package com.enterprise.legacy;
import java.security.*;
import javax.crypto.*;

public class LegacyApp {
    public void initLegacyCrypto() throws Exception {
        // RSA 1024
        KeyPairGenerator rsaGen = KeyPairGenerator.getInstance("RSA");
        rsaGen.initialize(1024);
        
        // DES, RC4, MD5, SHA-1 實作調用
        Cipher.getInstance("DES");
        Cipher.getInstance("RC4");
        MessageDigest.getInstance("MD5");
        MessageDigest.getInstance("SHA-1");
        
        // RSA 512 (極低強度測試)
        KeyPairGenerator rsaSmall = KeyPairGenerator.getInstance("RSA");
        rsaSmall.initialize(512);
    }
}
