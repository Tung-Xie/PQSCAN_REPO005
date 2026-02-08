# PQSCAN_REPO005: Polyglot Legacy Stack

## 📌 專案簡介
本專案為 **跨語言 (Python & Java)** 混合環境，模擬企業級舊型系統。旨在驗證掃描器能否在同一專案中同時識別不同程式語言的加密資產。

## 🔍 CBOM 掃描亮點 (需偵測項目)
- **跨語言支援**: 同時包含 `.py` 與 `.java` 檔案。
- **加密資產 (Cryptographic Assets)**:
  - **Python**: `SHA1`, `RC4` (皆為不安全資產)。
  - **Java**: `RSA-512` (密鑰長度過短), `Diffie-Hellman-Group1`.

## 🛠️ 技術棧
- Language: Python, Java
- Security Level: **Critical (High Risk)**
- 
