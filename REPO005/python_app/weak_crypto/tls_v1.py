from cryptography.hazmat.primitives.asymmetric import rsa, ec
from cryptography.hazmat.primitives import hashes

def setup_insecure_tls():
    # [High] ffdhe2048 (RFC7919) 
    # [High] sect233r1, sect239k1 (Binary Field Curves - NIST 棄用)
    weak_curves = ["sect233r1", "sect239k1"]
    for c in weak_curves:
        print(f"Loading deprecated curve: {c}")
    
    # 建立一個 1024-bit 的 RSA 金鑰 (Critical)
    key = rsa.generate_private_key(65537, 1024)
    return "Weak-Cipher-Loaded"
