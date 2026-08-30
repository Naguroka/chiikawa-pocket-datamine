package com.google.common.hash;

/* JADX INFO: loaded from: classes5.dex */
@com.google.errorprone.annotations.Immutable
@com.google.common.hash.ElementTypesAreNonnullByDefault
final class SipHashFunction extends com.google.common.hash.AbstractHashFunction implements java.io.Serializable {
    static final com.google.common.hash.HashFunction SIP_HASH_24 = new com.google.common.hash.SipHashFunction(2, 4, 506097522914230528L, 1084818905618843912L);
    private static final long serialVersionUID = 0;
    private final int c;
    private final int d;
    private final long k0;
    private final long k1;

    @Override // com.google.common.hash.HashFunction
    public int bits() {
        return 64;
    }

    SipHashFunction(int c, int d, long k0, long k1) {
        com.google.common.base.Preconditions.checkArgument(c > 0, "The number of SipRound iterations (c=%s) during Compression must be positive.", c);
        com.google.common.base.Preconditions.checkArgument(d > 0, "The number of SipRound iterations (d=%s) during Finalization must be positive.", d);
        this.c = c;
        this.d = d;
        this.k0 = k0;
        this.k1 = k1;
    }

    @Override // com.google.common.hash.HashFunction
    public com.google.common.hash.Hasher newHasher() {
        return new com.google.common.hash.SipHashFunction.SipHasher(this.c, this.d, this.k0, this.k1);
    }

    public java.lang.String toString() {
        return "Hashing.sipHash" + this.c + "" + this.d + "(" + this.k0 + ", " + this.k1 + ")";
    }

    public boolean equals(@javax.annotation.CheckForNull java.lang.Object object) {
        if (!(object instanceof com.google.common.hash.SipHashFunction)) {
            return false;
        }
        com.google.common.hash.SipHashFunction sipHashFunction = (com.google.common.hash.SipHashFunction) object;
        return this.c == sipHashFunction.c && this.d == sipHashFunction.d && this.k0 == sipHashFunction.k0 && this.k1 == sipHashFunction.k1;
    }

    public int hashCode() {
        return (int) ((((long) ((getClass().hashCode() ^ this.c) ^ this.d)) ^ this.k0) ^ this.k1);
    }

    private static final class SipHasher extends com.google.common.hash.AbstractStreamingHasher {
        private static final int CHUNK_SIZE = 8;
        private long b;
        private final int c;
        private final int d;
        private long finalM;
        private long v0;
        private long v1;
        private long v2;
        private long v3;

        SipHasher(int c, int d, long k0, long k1) {
            super(8);
            this.b = 0L;
            this.finalM = 0L;
            this.c = c;
            this.d = d;
            this.v0 = 8317987319222330741L ^ k0;
            this.v1 = 7237128888997146477L ^ k1;
            this.v2 = 7816392313619706465L ^ k0;
            this.v3 = 8387220255154660723L ^ k1;
        }

        @Override // com.google.common.hash.AbstractStreamingHasher
        protected void process(java.nio.ByteBuffer buffer) {
            this.b += 8;
            processM(buffer.getLong());
        }

        @Override // com.google.common.hash.AbstractStreamingHasher
        protected void processRemaining(java.nio.ByteBuffer buffer) {
            this.b += (long) buffer.remaining();
            int i = 0;
            while (buffer.hasRemaining()) {
                this.finalM ^= (((long) buffer.get()) & 255) << i;
                i += 8;
            }
        }

        @Override // com.google.common.hash.AbstractStreamingHasher
        protected com.google.common.hash.HashCode makeHash() {
            long j = this.finalM ^ (this.b << 56);
            this.finalM = j;
            processM(j);
            this.v2 ^= 255;
            sipRound(this.d);
            return com.google.common.hash.HashCode.fromLong(((this.v0 ^ this.v1) ^ this.v2) ^ this.v3);
        }

        private void processM(long m) {
            this.v3 ^= m;
            sipRound(this.c);
            this.v0 = m ^ this.v0;
        }

        private void sipRound(int iterations) {
            for (int i = 0; i < iterations; i++) {
                long j = this.v0;
                long j2 = this.v1;
                this.v0 = j + j2;
                this.v2 += this.v3;
                this.v1 = java.lang.Long.rotateLeft(j2, 13);
                long jRotateLeft = java.lang.Long.rotateLeft(this.v3, 16);
                long j3 = this.v1;
                long j4 = this.v0;
                this.v1 = j3 ^ j4;
                this.v3 = jRotateLeft ^ this.v2;
                long jRotateLeft2 = java.lang.Long.rotateLeft(j4, 32);
                long j5 = this.v2;
                long j6 = this.v1;
                this.v2 = j5 + j6;
                this.v0 = jRotateLeft2 + this.v3;
                this.v1 = java.lang.Long.rotateLeft(j6, 17);
                long jRotateLeft3 = java.lang.Long.rotateLeft(this.v3, 21);
                long j7 = this.v1;
                long j8 = this.v2;
                this.v1 = j7 ^ j8;
                this.v3 = jRotateLeft3 ^ this.v0;
                this.v2 = java.lang.Long.rotateLeft(j8, 32);
            }
        }
    }
}
