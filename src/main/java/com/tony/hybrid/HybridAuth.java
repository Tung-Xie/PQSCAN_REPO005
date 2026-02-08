package com.tony.hybrid;
import java.security.Signature;
import java.security.KeyPairGenerator;

public class HybridAuth {
    public void processHybrid() throws Exception {
        // [Critical] 測試混合資產：同時出現 PQC 與 舊版 RSA
        String hybridSig = "MLDSA87_RSA2048"; 
        Signature.getInstance("SHA256withRSA"); // RSA 2048 標記
        KeyPairGenerator.getInstance("ML-DSA-87"); // PQC 標記
        System.out.println("Hybrid Mode: " + hybridSig);
    }
}
