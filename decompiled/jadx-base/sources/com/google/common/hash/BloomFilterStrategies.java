package com.google.common.hash;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.hash.ElementTypesAreNonnullByDefault
enum BloomFilterStrategies implements com.google.common.hash.BloomFilter.Strategy {
    MURMUR128_MITZ_32 { // from class: com.google.common.hash.BloomFilterStrategies.1
        @Override // com.google.common.hash.BloomFilter.Strategy
        public <T> boolean put(@com.google.common.hash.ParametricNullness T object, com.google.common.hash.Funnel<? super T> funnel, int numHashFunctions, com.google.common.hash.BloomFilterStrategies.LockFreeBitArray bits) {
            long jBitSize = bits.bitSize();
            long jAsLong = com.google.common.hash.Hashing.murmur3_128().hashObject(object, funnel).asLong();
            int i = (int) jAsLong;
            int i2 = (int) (jAsLong >>> 32);
            boolean z = false;
            for (int i3 = 1; i3 <= numHashFunctions; i3++) {
                int i4 = (i3 * i2) + i;
                if (i4 < 0) {
                    i4 = ~i4;
                }
                z |= bits.set(((long) i4) % jBitSize);
            }
            return z;
        }

        @Override // com.google.common.hash.BloomFilter.Strategy
        public <T> boolean mightContain(@com.google.common.hash.ParametricNullness T object, com.google.common.hash.Funnel<? super T> funnel, int numHashFunctions, com.google.common.hash.BloomFilterStrategies.LockFreeBitArray bits) {
            long jBitSize = bits.bitSize();
            long jAsLong = com.google.common.hash.Hashing.murmur3_128().hashObject(object, funnel).asLong();
            int i = (int) jAsLong;
            int i2 = (int) (jAsLong >>> 32);
            for (int i3 = 1; i3 <= numHashFunctions; i3++) {
                int i4 = (i3 * i2) + i;
                if (i4 < 0) {
                    i4 = ~i4;
                }
                if (!bits.get(((long) i4) % jBitSize)) {
                    return false;
                }
            }
            return true;
        }
    },
    MURMUR128_MITZ_64 { // from class: com.google.common.hash.BloomFilterStrategies.2
        @Override // com.google.common.hash.BloomFilter.Strategy
        public <T> boolean put(@com.google.common.hash.ParametricNullness T object, com.google.common.hash.Funnel<? super T> funnel, int numHashFunctions, com.google.common.hash.BloomFilterStrategies.LockFreeBitArray bits) {
            long jBitSize = bits.bitSize();
            byte[] bytesInternal = com.google.common.hash.Hashing.murmur3_128().hashObject(object, funnel).getBytesInternal();
            long jLowerEight = lowerEight(bytesInternal);
            long jUpperEight = upperEight(bytesInternal);
            boolean z = false;
            for (int i = 0; i < numHashFunctions; i++) {
                z |= bits.set((Long.MAX_VALUE & jLowerEight) % jBitSize);
                jLowerEight += jUpperEight;
            }
            return z;
        }

        @Override // com.google.common.hash.BloomFilter.Strategy
        public <T> boolean mightContain(@com.google.common.hash.ParametricNullness T object, com.google.common.hash.Funnel<? super T> funnel, int numHashFunctions, com.google.common.hash.BloomFilterStrategies.LockFreeBitArray bits) {
            long jBitSize = bits.bitSize();
            byte[] bytesInternal = com.google.common.hash.Hashing.murmur3_128().hashObject(object, funnel).getBytesInternal();
            long jLowerEight = lowerEight(bytesInternal);
            long jUpperEight = upperEight(bytesInternal);
            for (int i = 0; i < numHashFunctions; i++) {
                if (!bits.get((Long.MAX_VALUE & jLowerEight) % jBitSize)) {
                    return false;
                }
                jLowerEight += jUpperEight;
            }
            return true;
        }

        private long lowerEight(byte[] bytes) {
            return com.google.common.primitives.Longs.fromBytes(bytes[7], bytes[6], bytes[5], bytes[4], bytes[3], bytes[2], bytes[1], bytes[0]);
        }

        private long upperEight(byte[] bytes) {
            return com.google.common.primitives.Longs.fromBytes(bytes[15], bytes[14], bytes[13], bytes[12], bytes[11], bytes[10], bytes[9], bytes[8]);
        }
    };

    static final class LockFreeBitArray {
        private static final int LONG_ADDRESSABLE_BITS = 6;
        private final com.google.common.hash.LongAddable bitCount;
        final java.util.concurrent.atomic.AtomicLongArray data;

        LockFreeBitArray(long bits) {
            com.google.common.base.Preconditions.checkArgument(bits > 0, "data length is zero!");
            this.data = new java.util.concurrent.atomic.AtomicLongArray(com.google.common.primitives.Ints.checkedCast(com.google.common.math.LongMath.divide(bits, 64L, java.math.RoundingMode.CEILING)));
            this.bitCount = com.google.common.hash.LongAddables.create();
        }

        LockFreeBitArray(long[] data) {
            com.google.common.base.Preconditions.checkArgument(data.length > 0, "data length is zero!");
            this.data = new java.util.concurrent.atomic.AtomicLongArray(data);
            this.bitCount = com.google.common.hash.LongAddables.create();
            long jBitCount = 0;
            for (long j : data) {
                jBitCount += (long) java.lang.Long.bitCount(j);
            }
            this.bitCount.add(jBitCount);
        }

        boolean set(long bitIndex) {
            long j;
            long j2;
            if (get(bitIndex)) {
                return false;
            }
            int i = (int) (bitIndex >>> 6);
            long j3 = 1 << ((int) bitIndex);
            do {
                j = this.data.get(i);
                j2 = j | j3;
                if (j == j2) {
                    return false;
                }
            } while (!this.data.compareAndSet(i, j, j2));
            this.bitCount.increment();
            return true;
        }

        boolean get(long bitIndex) {
            return ((1 << ((int) bitIndex)) & this.data.get((int) (bitIndex >>> 6))) != 0;
        }

        public static long[] toPlainArray(java.util.concurrent.atomic.AtomicLongArray atomicLongArray) {
            int length = atomicLongArray.length();
            long[] jArr = new long[length];
            for (int i = 0; i < length; i++) {
                jArr[i] = atomicLongArray.get(i);
            }
            return jArr;
        }

        long bitSize() {
            return ((long) this.data.length()) * 64;
        }

        long bitCount() {
            return this.bitCount.sum();
        }

        com.google.common.hash.BloomFilterStrategies.LockFreeBitArray copy() {
            return new com.google.common.hash.BloomFilterStrategies.LockFreeBitArray(toPlainArray(this.data));
        }

        void putAll(com.google.common.hash.BloomFilterStrategies.LockFreeBitArray other) {
            com.google.common.base.Preconditions.checkArgument(this.data.length() == other.data.length(), "BitArrays must be of equal length (%s != %s)", this.data.length(), other.data.length());
            for (int i = 0; i < this.data.length(); i++) {
                putData(i, other.data.get(i));
            }
        }

        void putData(int i, long longValue) {
            long j;
            long j2;
            boolean z;
            while (true) {
                j = this.data.get(i);
                j2 = j | longValue;
                if (j == j2) {
                    z = false;
                    break;
                } else if (this.data.compareAndSet(i, j, j2)) {
                    z = true;
                    break;
                }
            }
            if (z) {
                this.bitCount.add(java.lang.Long.bitCount(j2) - java.lang.Long.bitCount(j));
            }
        }

        int dataLength() {
            return this.data.length();
        }

        public boolean equals(@javax.annotation.CheckForNull java.lang.Object o) {
            if (o instanceof com.google.common.hash.BloomFilterStrategies.LockFreeBitArray) {
                return java.util.Arrays.equals(toPlainArray(this.data), toPlainArray(((com.google.common.hash.BloomFilterStrategies.LockFreeBitArray) o).data));
            }
            return false;
        }

        public int hashCode() {
            return java.util.Arrays.hashCode(toPlainArray(this.data));
        }
    }
}
