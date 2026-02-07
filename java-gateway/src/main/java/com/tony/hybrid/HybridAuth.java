package com.tony.hybrid;
import java.security.Signature;

public class HybridAuth {
    public void processHybridLogin() throws Exception {
        // [Critical] 混合模式測試 - 含有 RSA2048
        String hybridKex = "MLKEM768_X25519";
        String hybridSig = "MLDSA87_RSA2048";
        
        // 關鍵呼叫：這會讓掃描器偵測到使用了 RSA
        Signature sig = Signature.getInstance("SHA256withRSA");
        
        System.out.println("Executing HybridAuth: " + hybridSig);
    }
}
