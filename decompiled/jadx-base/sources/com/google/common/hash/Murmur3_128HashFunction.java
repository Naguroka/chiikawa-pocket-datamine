package com.google.common.hash;

/* JADX INFO: loaded from: classes5.dex */
@com.google.errorprone.annotations.Immutable
@com.google.common.hash.ElementTypesAreNonnullByDefault
final class Murmur3_128HashFunction extends com.google.common.hash.AbstractHashFunction implements java.io.Serializable {
    private static final long serialVersionUID = 0;
    private final int seed;
    static final com.google.common.hash.HashFunction MURMUR3_128 = new com.google.common.hash.Murmur3_128HashFunction(0);
    static final com.google.common.hash.HashFunction GOOD_FAST_HASH_128 = new com.google.common.hash.Murmur3_128HashFunction(com.google.common.hash.Hashing.GOOD_FAST_HASH_SEED);

    @Override // com.google.common.hash.HashFunction
    public int bits() {
        return 128;
    }

    Murmur3_128HashFunction(int seed) {
        this.seed = seed;
    }

    @Override // com.google.common.hash.HashFunction
    public com.google.common.hash.Hasher newHasher() {
        return new com.google.common.hash.Murmur3_128HashFunction.Murmur3_128Hasher(this.seed);
    }

    public java.lang.String toString() {
        return "Hashing.murmur3_128(" + this.seed + ")";
    }

    public boolean equals(@javax.annotation.CheckForNull java.lang.Object object) {
        return (object instanceof com.google.common.hash.Murmur3_128HashFunction) && this.seed == ((com.google.common.hash.Murmur3_128HashFunction) object).seed;
    }

    public int hashCode() {
        return getClass().hashCode() ^ this.seed;
    }

    private static final class Murmur3_128Hasher extends com.google.common.hash.AbstractStreamingHasher {
        private static final long C1 = -8663945395140668459L;
        private static final long C2 = 5545529020109919103L;
        private static final int CHUNK_SIZE = 16;
        private long h1;
        private long h2;
        private int length;

        private static long fmix64(long k) {
            long j = (k ^ (k >>> 33)) * (-49064778989728563L);
            long j2 = (j ^ (j >>> 33)) * (-4265267296055464877L);
            return j2 ^ (j2 >>> 33);
        }

        Murmur3_128Hasher(int seed) {
            super(16);
            long j = seed;
            this.h1 = j;
            this.h2 = j;
            this.length = 0;
        }

        @Override // com.google.common.hash.AbstractStreamingHasher
        protected void process(java.nio.ByteBuffer bb) {
            bmix64(bb.getLong(), bb.getLong());
            this.length += 16;
        }

        private void bmix64(long k1, long k2) {
            long jMixK1 = mixK1(k1) ^ this.h1;
            this.h1 = jMixK1;
            long jRotateLeft = java.lang.Long.rotateLeft(jMixK1, 27);
            long j = this.h2;
            this.h1 = ((jRotateLeft + j) * 5) + 1390208809;
            long jMixK2 = mixK2(k2) ^ j;
            this.h2 = jMixK2;
            this.h2 = ((java.lang.Long.rotateLeft(jMixK2, 31) + this.h1) * 5) + 944331445;
        }

        @Override // com.google.common.hash.AbstractStreamingHasher
        protected void processRemaining(java.nio.ByteBuffer bb) {
            long j;
            long j2;
            long j3;
            long j4;
            long j5;
            long j6;
            long j7;
            long j8;
            long j9;
            long j10;
            long j11;
            long j12;
            long j13;
            long j14;
            this.length += bb.remaining();
            long j15 = 0;
            switch (bb.remaining()) {
                case 1:
                    j = 0;
                    j7 = ((long) com.google.common.primitives.UnsignedBytes.toInt(bb.get(0))) ^ j;
                    this.h1 ^= mixK1(j7);
                    this.h2 ^= mixK2(j15);
                    return;
                case 2:
                    j2 = 0;
                    j = j2 ^ (((long) com.google.common.primitives.UnsignedBytes.toInt(bb.get(1))) << 8);
                    j7 = ((long) com.google.common.primitives.UnsignedBytes.toInt(bb.get(0))) ^ j;
                    this.h1 ^= mixK1(j7);
                    this.h2 ^= mixK2(j15);
                    return;
                case 3:
                    j3 = 0;
                    j2 = j3 ^ (((long) com.google.common.primitives.UnsignedBytes.toInt(bb.get(2))) << 16);
                    j = j2 ^ (((long) com.google.common.primitives.UnsignedBytes.toInt(bb.get(1))) << 8);
                    j7 = ((long) com.google.common.primitives.UnsignedBytes.toInt(bb.get(0))) ^ j;
                    this.h1 ^= mixK1(j7);
                    this.h2 ^= mixK2(j15);
                    return;
                case 4:
                    j4 = 0;
                    j3 = j4 ^ (((long) com.google.common.primitives.UnsignedBytes.toInt(bb.get(3))) << 24);
                    j2 = j3 ^ (((long) com.google.common.primitives.UnsignedBytes.toInt(bb.get(2))) << 16);
                    j = j2 ^ (((long) com.google.common.primitives.UnsignedBytes.toInt(bb.get(1))) << 8);
                    j7 = ((long) com.google.common.primitives.UnsignedBytes.toInt(bb.get(0))) ^ j;
                    this.h1 ^= mixK1(j7);
                    this.h2 ^= mixK2(j15);
                    return;
                case 5:
                    j5 = 0;
                    j4 = j5 ^ (((long) com.google.common.primitives.UnsignedBytes.toInt(bb.get(4))) << 32);
                    j3 = j4 ^ (((long) com.google.common.primitives.UnsignedBytes.toInt(bb.get(3))) << 24);
                    j2 = j3 ^ (((long) com.google.common.primitives.UnsignedBytes.toInt(bb.get(2))) << 16);
                    j = j2 ^ (((long) com.google.common.primitives.UnsignedBytes.toInt(bb.get(1))) << 8);
                    j7 = ((long) com.google.common.primitives.UnsignedBytes.toInt(bb.get(0))) ^ j;
                    this.h1 ^= mixK1(j7);
                    this.h2 ^= mixK2(j15);
                    return;
                case 6:
                    j6 = 0;
                    j5 = j6 ^ (((long) com.google.common.primitives.UnsignedBytes.toInt(bb.get(5))) << 40);
                    j4 = j5 ^ (((long) com.google.common.primitives.UnsignedBytes.toInt(bb.get(4))) << 32);
                    j3 = j4 ^ (((long) com.google.common.primitives.UnsignedBytes.toInt(bb.get(3))) << 24);
                    j2 = j3 ^ (((long) com.google.common.primitives.UnsignedBytes.toInt(bb.get(2))) << 16);
                    j = j2 ^ (((long) com.google.common.primitives.UnsignedBytes.toInt(bb.get(1))) << 8);
                    j7 = ((long) com.google.common.primitives.UnsignedBytes.toInt(bb.get(0))) ^ j;
                    this.h1 ^= mixK1(j7);
                    this.h2 ^= mixK2(j15);
                    return;
                case 7:
                    j6 = (((long) com.google.common.primitives.UnsignedBytes.toInt(bb.get(6))) << 48) ^ 0;
                    j5 = j6 ^ (((long) com.google.common.primitives.UnsignedBytes.toInt(bb.get(5))) << 40);
                    j4 = j5 ^ (((long) com.google.common.primitives.UnsignedBytes.toInt(bb.get(4))) << 32);
                    j3 = j4 ^ (((long) com.google.common.primitives.UnsignedBytes.toInt(bb.get(3))) << 24);
                    j2 = j3 ^ (((long) com.google.common.primitives.UnsignedBytes.toInt(bb.get(2))) << 16);
                    j = j2 ^ (((long) com.google.common.primitives.UnsignedBytes.toInt(bb.get(1))) << 8);
                    j7 = ((long) com.google.common.primitives.UnsignedBytes.toInt(bb.get(0))) ^ j;
                    this.h1 ^= mixK1(j7);
                    this.h2 ^= mixK2(j15);
                    return;
                case 8:
                    j8 = 0;
                    j7 = bb.getLong() ^ 0;
                    j15 = j8;
                    this.h1 ^= mixK1(j7);
                    this.h2 ^= mixK2(j15);
                    return;
                case 9:
                    j9 = 0;
                    j8 = j9 ^ ((long) com.google.common.primitives.UnsignedBytes.toInt(bb.get(8)));
                    j7 = bb.getLong() ^ 0;
                    j15 = j8;
                    this.h1 ^= mixK1(j7);
                    this.h2 ^= mixK2(j15);
                    return;
                case 10:
                    j10 = 0;
                    j9 = j10 ^ (((long) com.google.common.primitives.UnsignedBytes.toInt(bb.get(9))) << 8);
                    j8 = j9 ^ ((long) com.google.common.primitives.UnsignedBytes.toInt(bb.get(8)));
                    j7 = bb.getLong() ^ 0;
                    j15 = j8;
                    this.h1 ^= mixK1(j7);
                    this.h2 ^= mixK2(j15);
                    return;
                case 11:
                    j11 = 0;
                    j10 = j11 ^ (((long) com.google.common.primitives.UnsignedBytes.toInt(bb.get(10))) << 16);
                    j9 = j10 ^ (((long) com.google.common.primitives.UnsignedBytes.toInt(bb.get(9))) << 8);
                    j8 = j9 ^ ((long) com.google.common.primitives.UnsignedBytes.toInt(bb.get(8)));
                    j7 = bb.getLong() ^ 0;
                    j15 = j8;
                    this.h1 ^= mixK1(j7);
                    this.h2 ^= mixK2(j15);
                    return;
                case 12:
                    j12 = 0;
                    j11 = j12 ^ (((long) com.google.common.primitives.UnsignedBytes.toInt(bb.get(11))) << 24);
                    j10 = j11 ^ (((long) com.google.common.primitives.UnsignedBytes.toInt(bb.get(10))) << 16);
                    j9 = j10 ^ (((long) com.google.common.primitives.UnsignedBytes.toInt(bb.get(9))) << 8);
                    j8 = j9 ^ ((long) com.google.common.primitives.UnsignedBytes.toInt(bb.get(8)));
                    j7 = bb.getLong() ^ 0;
                    j15 = j8;
                    this.h1 ^= mixK1(j7);
                    this.h2 ^= mixK2(j15);
                    return;
                case 13:
                    j13 = 0;
                    j12 = j13 ^ (((long) com.google.common.primitives.UnsignedBytes.toInt(bb.get(12))) << 32);
                    j11 = j12 ^ (((long) com.google.common.primitives.UnsignedBytes.toInt(bb.get(11))) << 24);
                    j10 = j11 ^ (((long) com.google.common.primitives.UnsignedBytes.toInt(bb.get(10))) << 16);
                    j9 = j10 ^ (((long) com.google.common.primitives.UnsignedBytes.toInt(bb.get(9))) << 8);
                    j8 = j9 ^ ((long) com.google.common.primitives.UnsignedBytes.toInt(bb.get(8)));
                    j7 = bb.getLong() ^ 0;
                    j15 = j8;
                    this.h1 ^= mixK1(j7);
                    this.h2 ^= mixK2(j15);
                    return;
                case 14:
                    j14 = 0;
                    j13 = j14 ^ (((long) com.google.common.primitives.UnsignedBytes.toInt(bb.get(13))) << 40);
                    j12 = j13 ^ (((long) com.google.common.primitives.UnsignedBytes.toInt(bb.get(12))) << 32);
                    j11 = j12 ^ (((long) com.google.common.primitives.UnsignedBytes.toInt(bb.get(11))) << 24);
                    j10 = j11 ^ (((long) com.google.common.primitives.UnsignedBytes.toInt(bb.get(10))) << 16);
                    j9 = j10 ^ (((long) com.google.common.primitives.UnsignedBytes.toInt(bb.get(9))) << 8);
                    j8 = j9 ^ ((long) com.google.common.primitives.UnsignedBytes.toInt(bb.get(8)));
                    j7 = bb.getLong() ^ 0;
                    j15 = j8;
                    this.h1 ^= mixK1(j7);
                    this.h2 ^= mixK2(j15);
                    return;
                case 15:
                    j14 = (((long) com.google.common.primitives.UnsignedBytes.toInt(bb.get(14))) << 48) ^ 0;
                    j13 = j14 ^ (((long) com.google.common.primitives.UnsignedBytes.toInt(bb.get(13))) << 40);
                    j12 = j13 ^ (((long) com.google.common.primitives.UnsignedBytes.toInt(bb.get(12))) << 32);
                    j11 = j12 ^ (((long) com.google.common.primitives.UnsignedBytes.toInt(bb.get(11))) << 24);
                    j10 = j11 ^ (((long) com.google.common.primitives.UnsignedBytes.toInt(bb.get(10))) << 16);
                    j9 = j10 ^ (((long) com.google.common.primitives.UnsignedBytes.toInt(bb.get(9))) << 8);
                    j8 = j9 ^ ((long) com.google.common.primitives.UnsignedBytes.toInt(bb.get(8)));
                    j7 = bb.getLong() ^ 0;
                    j15 = j8;
                    this.h1 ^= mixK1(j7);
                    this.h2 ^= mixK2(j15);
                    return;
                default:
                    throw new java.lang.AssertionError("Should never get here.");
            }
        }

        @Override // com.google.common.hash.AbstractStreamingHasher
        protected com.google.common.hash.HashCode makeHash() {
            long j = this.h1;
            int i = this.length;
            long j2 = j ^ ((long) i);
            long j3 = this.h2 ^ ((long) i);
            long j4 = j2 + j3;
            this.h1 = j4;
            this.h2 = j3 + j4;
            this.h1 = fmix64(j4);
            long jFmix64 = fmix64(this.h2);
            long j5 = this.h1 + jFmix64;
            this.h1 = j5;
            this.h2 = jFmix64 + j5;
            return com.google.common.hash.HashCode.fromBytesNoCopy(java.nio.ByteBuffer.wrap(new byte[16]).order(java.nio.ByteOrder.LITTLE_ENDIAN).putLong(this.h1).putLong(this.h2).array());
        }

        private static long mixK1(long k1) {
            return java.lang.Long.rotateLeft(k1 * C1, 31) * C2;
        }

        private static long mixK2(long k2) {
            return java.lang.Long.rotateLeft(k2 * C2, 33) * C1;
        }
    }
}
