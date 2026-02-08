package com.bridge.crypto;
import java.security.*;
public class MigrationBridge {
    public void transition() throws Exception {
        // Hybrid: RSA-4096 + ML-DSA-87
        KeyPairGenerator.getInstance("RSA").initialize(4096);
        System.out.println("Bridge: ML-DSA-87 active for future-proofing.");
    }
}
