package com.tony.legacy;
import java.security.*;
import javax.crypto.*;
import java.security.spec.ECGenParameterSpec;

public class LegacyService {
    public void initLegacy() throws Exception {
        // [Critical] RSA < 2048 & MD5
        KeyPairGenerator rsa1024 = KeyPairGenerator.getInstance("RSA");
        rsa1024.initialize(1024); 
        MessageDigest md5 = MessageDigest.getInstance("MD5");

        // [High] RSA 2048 & SHA-1
        KeyPairGenerator rsa2048 = KeyPairGenerator.getInstance("RSA");
        rsa2048.initialize(2048);
        MessageDigest sha1 = MessageDigest.getInstance("SHA-1");

        // [Critical/High Curves] 
        // secp160r1 (Critical), secp192r1 (Critical), secp224r1 (High)
        String[] weakCurves = {"secp160r1", "secp192r1", "secp224r1"};
        for (String curve : weakCurves) {
            KeyPairGenerator ecGen = KeyPairGenerator.getInstance("EC");
            ecGen.initialize(new ECGenParameterSpec(curve));
        }
    }
}
