package com.google.common.hash;

/* JADX INFO: loaded from: classes5.dex */
@com.google.errorprone.annotations.Immutable
@com.google.common.hash.ElementTypesAreNonnullByDefault
final class MacHashFunction extends com.google.common.hash.AbstractHashFunction {
    private final int bits;
    private final java.security.Key key;
    private final javax.crypto.Mac prototype;
    private final boolean supportsClone;
    private final java.lang.String toString;

    MacHashFunction(java.lang.String algorithmName, java.security.Key key, java.lang.String toString) {
        javax.crypto.Mac mac = getMac(algorithmName, key);
        this.prototype = mac;
        this.key = (java.security.Key) com.google.common.base.Preconditions.checkNotNull(key);
        this.toString = (java.lang.String) com.google.common.base.Preconditions.checkNotNull(toString);
        this.bits = mac.getMacLength() * 8;
        this.supportsClone = supportsClone(mac);
    }

    @Override // com.google.common.hash.HashFunction
    public int bits() {
        return this.bits;
    }

    private static boolean supportsClone(javax.crypto.Mac mac) {
        try {
            mac.clone();
            return true;
        } catch (java.lang.CloneNotSupportedException unused) {
            return false;
        }
    }

    private static javax.crypto.Mac getMac(java.lang.String algorithmName, java.security.Key key) {
        try {
            javax.crypto.Mac mac = javax.crypto.Mac.getInstance(algorithmName);
            mac.init(key);
            return mac;
        } catch (java.security.InvalidKeyException e) {
            throw new java.lang.IllegalArgumentException(e);
        } catch (java.security.NoSuchAlgorithmException e2) {
            throw new java.lang.IllegalStateException(e2);
        }
    }

    @Override // com.google.common.hash.HashFunction
    public com.google.common.hash.Hasher newHasher() {
        if (this.supportsClone) {
            try {
                return new com.google.common.hash.MacHashFunction.MacHasher((javax.crypto.Mac) this.prototype.clone());
            } catch (java.lang.CloneNotSupportedException unused) {
            }
        }
        return new com.google.common.hash.MacHashFunction.MacHasher(getMac(this.prototype.getAlgorithm(), this.key));
    }

    public java.lang.String toString() {
        return this.toString;
    }

    private static final class MacHasher extends com.google.common.hash.AbstractByteHasher {
        private boolean done;
        private final javax.crypto.Mac mac;

        private MacHasher(javax.crypto.Mac mac) {
            this.mac = mac;
        }

        @Override // com.google.common.hash.AbstractByteHasher
        protected void update(byte b) {
            checkNotDone();
            this.mac.update(b);
        }

        @Override // com.google.common.hash.AbstractByteHasher
        protected void update(byte[] b) {
            checkNotDone();
            this.mac.update(b);
        }

        @Override // com.google.common.hash.AbstractByteHasher
        protected void update(byte[] b, int off, int len) {
            checkNotDone();
            this.mac.update(b, off, len);
        }

        @Override // com.google.common.hash.AbstractByteHasher
        protected void update(java.nio.ByteBuffer bytes) {
            checkNotDone();
            com.google.common.base.Preconditions.checkNotNull(bytes);
            this.mac.update(bytes);
        }

        private void checkNotDone() {
            com.google.common.base.Preconditions.checkState(!this.done, "Cannot re-use a Hasher after calling hash() on it");
        }

        @Override // com.google.common.hash.Hasher
        public com.google.common.hash.HashCode hash() {
            checkNotDone();
            this.done = true;
            return com.google.common.hash.HashCode.fromBytesNoCopy(this.mac.doFinal());
        }
    }
}
