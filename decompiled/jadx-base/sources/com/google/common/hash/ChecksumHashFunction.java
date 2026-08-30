package com.google.common.hash;

/* JADX INFO: loaded from: classes5.dex */
@com.google.errorprone.annotations.Immutable
@com.google.common.hash.ElementTypesAreNonnullByDefault
final class ChecksumHashFunction extends com.google.common.hash.AbstractHashFunction implements java.io.Serializable {
    private static final long serialVersionUID = 0;
    private final int bits;
    private final com.google.common.hash.ImmutableSupplier<? extends java.util.zip.Checksum> checksumSupplier;
    private final java.lang.String toString;

    ChecksumHashFunction(com.google.common.hash.ImmutableSupplier<? extends java.util.zip.Checksum> checksumSupplier, int bits, java.lang.String toString) {
        this.checksumSupplier = (com.google.common.hash.ImmutableSupplier) com.google.common.base.Preconditions.checkNotNull(checksumSupplier);
        com.google.common.base.Preconditions.checkArgument(bits == 32 || bits == 64, "bits (%s) must be either 32 or 64", bits);
        this.bits = bits;
        this.toString = (java.lang.String) com.google.common.base.Preconditions.checkNotNull(toString);
    }

    @Override // com.google.common.hash.HashFunction
    public int bits() {
        return this.bits;
    }

    @Override // com.google.common.hash.HashFunction
    public com.google.common.hash.Hasher newHasher() {
        return new com.google.common.hash.ChecksumHashFunction.ChecksumHasher(this.checksumSupplier.get());
    }

    public java.lang.String toString() {
        return this.toString;
    }

    private final class ChecksumHasher extends com.google.common.hash.AbstractByteHasher {
        private final java.util.zip.Checksum checksum;

        private ChecksumHasher(java.util.zip.Checksum checksum) {
            this.checksum = (java.util.zip.Checksum) com.google.common.base.Preconditions.checkNotNull(checksum);
        }

        @Override // com.google.common.hash.AbstractByteHasher
        protected void update(byte b) {
            this.checksum.update(b);
        }

        @Override // com.google.common.hash.AbstractByteHasher
        protected void update(byte[] bytes, int off, int len) {
            this.checksum.update(bytes, off, len);
        }

        @Override // com.google.common.hash.Hasher
        public com.google.common.hash.HashCode hash() {
            long value = this.checksum.getValue();
            if (com.google.common.hash.ChecksumHashFunction.this.bits == 32) {
                return com.google.common.hash.HashCode.fromInt((int) value);
            }
            return com.google.common.hash.HashCode.fromLong(value);
        }
    }
}
