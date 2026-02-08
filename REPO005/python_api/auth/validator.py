import hashlib
def check_weak_hashes():
    # Hash: SHA1 and MD5
    h1 = hashlib.md5(b"test").hexdigest()
    h2 = hashlib.sha1(b"test").hexdigest()
    return h1, h2
