package com.google.common.hash;

/* JADX INFO: loaded from: classes5.dex */
@com.google.errorprone.annotations.Immutable
@com.google.common.hash.ElementTypesAreNonnullByDefault
final class MessageDigestHashFunction extends com.google.common.hash.AbstractHashFunction implements java.io.Serializable {
    private final int bytes;
    private final java.security.MessageDigest prototype;
    private final boolean supportsClone;
    private final java.lang.String toString;

    MessageDigestHashFunction(java.lang.String algorithmName, java.lang.String toString) {
        java.security.MessageDigest messageDigest = getMessageDigest(algorithmName);
        this.prototype = messageDigest;
        this.bytes = messageDigest.getDigestLength();
        this.toString = (java.lang.String) com.google.common.base.Preconditions.checkNotNull(toString);
        this.supportsClone = supportsClone(messageDigest);
    }

    MessageDigestHashFunction(java.lang.String algorithmName, int bytes, java.lang.String toString) {
        this.toString = (java.lang.String) com.google.common.base.Preconditions.checkNotNull(toString);
        java.security.MessageDigest messageDigest = getMessageDigest(algorithmName);
        this.prototype = messageDigest;
        int digestLength = messageDigest.getDigestLength();
        com.google.common.base.Preconditions.checkArgument(bytes >= 4 && bytes <= digestLength, "bytes (%s) must be >= 4 and < %s", bytes, digestLength);
        this.bytes = bytes;
        this.supportsClone = supportsClone(messageDigest);
    }

    private static boolean supportsClone(java.security.MessageDigest digest) {
        try {
            digest.clone();
            return true;
        } catch (java.lang.CloneNotSupportedException unused) {
            return false;
        }
    }

    @Override // com.google.common.hash.HashFunction
    public int bits() {
        return this.bytes * 8;
    }

    public java.lang.String toString() {
        return this.toString;
    }

    private static java.security.MessageDigest getMessageDigest(java.lang.String algorithmName) {
        try {
            return java.security.MessageDigest.getInstance(algorithmName);
        } catch (java.security.NoSuchAlgorithmException e) {
            throw new java.lang.AssertionError(e);
        }
    }

    @Override // com.google.common.hash.HashFunction
    public com.google.common.hash.Hasher newHasher() {
        if (this.supportsClone) {
            try {
                return new com.google.common.hash.MessageDigestHashFunction.MessageDigestHasher((java.security.MessageDigest) this.prototype.clone(), this.bytes);
            } catch (java.lang.CloneNotSupportedException unused) {
            }
        }
        return new com.google.common.hash.MessageDigestHashFunction.MessageDigestHasher(getMessageDigest(this.prototype.getAlgorithm()), this.bytes);
    }

    private static final class SerializedForm implements java.io.Serializable {
        private static final long serialVersionUID = 0;
        private final java.lang.String algorithmName;
        private final int bytes;
        private final java.lang.String toString;

        private SerializedForm(java.lang.String algorithmName, int bytes, java.lang.String toString) {
            this.algorithmName = algorithmName;
            this.bytes = bytes;
            this.toString = toString;
        }

        private java.lang.Object readResolve() {
            return new com.google.common.hash.MessageDigestHashFunction(this.algorithmName, this.bytes, this.toString);
        }
    }

    java.lang.Object writeReplace() {
        return new com.google.common.hash.MessageDigestHashFunction.SerializedForm(this.prototype.getAlgorithm(), this.bytes, this.toString);
    }

    private void readObject(java.io.ObjectInputStream stream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Use SerializedForm");
    }

    private static final class MessageDigestHasher extends com.google.common.hash.AbstractByteHasher {
        private final int bytes;
        private final java.security.MessageDigest digest;
        private boolean done;

        private MessageDigestHasher(java.security.MessageDigest digest, int bytes) {
            this.digest = digest;
            this.bytes = bytes;
        }

        @Override // com.google.common.hash.AbstractByteHasher
        protected void update(byte b) {
            checkNotDone();
            this.digest.update(b);
        }

        @Override // com.google.common.hash.AbstractByteHasher
        protected void update(byte[] b, int off, int len) {
            checkNotDone();
            this.digest.update(b, off, len);
        }

        @Override // com.google.common.hash.AbstractByteHasher
        protected void update(java.nio.ByteBuffer bytes) {
            checkNotDone();
            this.digest.update(bytes);
        }

        private void checkNotDone() {
            com.google.common.base.Preconditions.checkState(!this.done, "Cannot re-use a Hasher after calling hash() on it");
        }

        @Override // com.google.common.hash.Hasher
        public com.google.common.hash.HashCode hash() {
            checkNotDone();
            this.done = true;
            if (this.bytes == this.digest.getDigestLength()) {
                return com.google.common.hash.HashCode.fromBytesNoCopy(this.digest.digest());
            }
            return com.google.common.hash.HashCode.fromBytesNoCopy(java.util.Arrays.copyOf(this.digest.digest(), this.bytes));
        }
    }
}
