package com.crypto.legacy;
import java.security.*;
import javax.crypto.*;
public class LegacyApp {
    public void run() throws Exception {
        // PKI and KEX
        KeyPairGenerator rsa = KeyPairGenerator.getInstance("RSA");
        rsa.initialize(1024);
        KeyPairGenerator dsa = KeyPairGenerator.getInstance("DSA");
        dsa.initialize(1024);
        // Cipher: DES and RC4
        Cipher c1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
        Cipher c2 = Cipher.getInstance("RC4");
        // Hash: MD5 and SHA-1
        MessageDigest md1 = MessageDigest.getInstance("MD5");
        MessageDigest md2 = MessageDigest.getInstance("SHA-1");
    }
}
