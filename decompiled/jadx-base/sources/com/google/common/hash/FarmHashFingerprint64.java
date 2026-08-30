package com.google.common.hash;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.hash.ElementTypesAreNonnullByDefault
final class FarmHashFingerprint64 extends com.google.common.hash.AbstractNonStreamingHashFunction {
    static final com.google.common.hash.HashFunction FARMHASH_FINGERPRINT_64 = new com.google.common.hash.FarmHashFingerprint64();
    private static final long K0 = -4348849565147123417L;
    private static final long K1 = -5435081209227447693L;
    private static final long K2 = -7286425919675154353L;

    private static long hashLength16(long u, long v, long mul) {
        long j = (u ^ v) * mul;
        long j2 = ((j ^ (j >>> 47)) ^ v) * mul;
        return (j2 ^ (j2 >>> 47)) * mul;
    }

    private static long shiftMix(long val) {
        return val ^ (val >>> 47);
    }

    @Override // com.google.common.hash.HashFunction
    public int bits() {
        return 64;
    }

    public java.lang.String toString() {
        return "Hashing.farmHashFingerprint64()";
    }

    FarmHashFingerprint64() {
    }

    @Override // com.google.common.hash.AbstractNonStreamingHashFunction, com.google.common.hash.AbstractHashFunction, com.google.common.hash.HashFunction
    public com.google.common.hash.HashCode hashBytes(byte[] input, int off, int len) {
        com.google.common.base.Preconditions.checkPositionIndexes(off, off + len, input.length);
        return com.google.common.hash.HashCode.fromLong(fingerprint(input, off, len));
    }

    static long fingerprint(byte[] bytes, int offset, int length) {
        if (length <= 32) {
            if (length <= 16) {
                return hashLength0to16(bytes, offset, length);
            }
            return hashLength17to32(bytes, offset, length);
        }
        if (length <= 64) {
            return hashLength33To64(bytes, offset, length);
        }
        return hashLength65Plus(bytes, offset, length);
    }

    private static void weakHashLength32WithSeeds(byte[] bytes, int offset, long seedA, long seedB, long[] output) {
        long jLoad64 = com.google.common.hash.LittleEndianByteArray.load64(bytes, offset);
        long jLoad65 = com.google.common.hash.LittleEndianByteArray.load64(bytes, offset + 8);
        long jLoad66 = com.google.common.hash.LittleEndianByteArray.load64(bytes, offset + 16);
        long jLoad67 = com.google.common.hash.LittleEndianByteArray.load64(bytes, offset + 24);
        long j = seedA + jLoad64;
        long j2 = jLoad65 + j + jLoad66;
        long jRotateRight = java.lang.Long.rotateRight(seedB + j + jLoad67, 21) + java.lang.Long.rotateRight(j2, 44);
        output[0] = j2 + jLoad67;
        output[1] = jRotateRight + j;
    }

    private static long hashLength0to16(byte[] bytes, int offset, int length) {
        if (length >= 8) {
            long j = (((long) length) * 2) + K2;
            long jLoad64 = com.google.common.hash.LittleEndianByteArray.load64(bytes, offset) + K2;
            long jLoad65 = com.google.common.hash.LittleEndianByteArray.load64(bytes, (offset + length) - 8);
            return hashLength16((java.lang.Long.rotateRight(jLoad65, 37) * j) + jLoad64, (java.lang.Long.rotateRight(jLoad64, 25) + jLoad65) * j, j);
        }
        if (length >= 4) {
            return hashLength16(((long) length) + ((((long) com.google.common.hash.LittleEndianByteArray.load32(bytes, offset)) & androidx.media3.muxer.Mp4Utils.UNSIGNED_INT_MAX_VALUE) << 3), ((long) com.google.common.hash.LittleEndianByteArray.load32(bytes, (offset + length) - 4)) & androidx.media3.muxer.Mp4Utils.UNSIGNED_INT_MAX_VALUE, ((long) (length * 2)) + K2);
        }
        if (length <= 0) {
            return K2;
        }
        return shiftMix((((long) ((bytes[offset] & 255) + ((bytes[(length >> 1) + offset] & 255) << 8))) * K2) ^ (((long) (length + ((bytes[offset + (length - 1)] & 255) << 2))) * K0)) * K2;
    }

    private static long hashLength17to32(byte[] bytes, int offset, int length) {
        long j = (((long) length) * 2) + K2;
        long jLoad64 = com.google.common.hash.LittleEndianByteArray.load64(bytes, offset) * K1;
        long jLoad65 = com.google.common.hash.LittleEndianByteArray.load64(bytes, offset + 8);
        int i = offset + length;
        long jLoad66 = com.google.common.hash.LittleEndianByteArray.load64(bytes, i - 8) * j;
        return hashLength16((com.google.common.hash.LittleEndianByteArray.load64(bytes, i - 16) * K2) + java.lang.Long.rotateRight(jLoad64 + jLoad65, 43) + java.lang.Long.rotateRight(jLoad66, 30), jLoad66 + jLoad64 + java.lang.Long.rotateRight(jLoad65 + K2, 18), j);
    }

    private static long hashLength33To64(byte[] bytes, int offset, int length) {
        long j = (((long) length) * 2) + K2;
        long jLoad64 = com.google.common.hash.LittleEndianByteArray.load64(bytes, offset) * K2;
        long jLoad65 = com.google.common.hash.LittleEndianByteArray.load64(bytes, offset + 8);
        int i = offset + length;
        long jLoad66 = com.google.common.hash.LittleEndianByteArray.load64(bytes, i - 8) * j;
        long jRotateRight = java.lang.Long.rotateRight(jLoad64 + jLoad65, 43) + java.lang.Long.rotateRight(jLoad66, 30) + (com.google.common.hash.LittleEndianByteArray.load64(bytes, i - 16) * K2);
        long jHashLength16 = hashLength16(jRotateRight, jLoad66 + java.lang.Long.rotateRight(jLoad65 + K2, 18) + jLoad64, j);
        long jLoad67 = com.google.common.hash.LittleEndianByteArray.load64(bytes, offset + 16) * j;
        long jLoad68 = com.google.common.hash.LittleEndianByteArray.load64(bytes, offset + 24);
        long jLoad69 = (jRotateRight + com.google.common.hash.LittleEndianByteArray.load64(bytes, i - 32)) * j;
        return hashLength16(((jHashLength16 + com.google.common.hash.LittleEndianByteArray.load64(bytes, i - 24)) * j) + java.lang.Long.rotateRight(jLoad67 + jLoad68, 43) + java.lang.Long.rotateRight(jLoad69, 30), jLoad67 + java.lang.Long.rotateRight(jLoad68 + jLoad64, 18) + jLoad69, j);
    }

    private static long hashLength65Plus(byte[] bytes, int offset, int length) {
        long j = 81;
        long j2 = (j * K1) + 113;
        long jShiftMix = shiftMix((j2 * K2) + 113) * K2;
        long[] jArr = new long[2];
        long[] jArr2 = new long[2];
        long jLoad64 = (j * K2) + com.google.common.hash.LittleEndianByteArray.load64(bytes, offset);
        int i = length - 1;
        int i2 = offset + ((i / 64) * 64);
        int i3 = i & 63;
        int i4 = (i2 + i3) - 63;
        int i5 = offset;
        while (true) {
            long jRotateRight = java.lang.Long.rotateRight(jLoad64 + j2 + jArr[0] + com.google.common.hash.LittleEndianByteArray.load64(bytes, i5 + 8), 37) * K1;
            long jRotateRight2 = java.lang.Long.rotateRight(j2 + jArr[1] + com.google.common.hash.LittleEndianByteArray.load64(bytes, i5 + 48), 42) * K1;
            long j3 = jRotateRight ^ jArr2[1];
            long jLoad65 = jRotateRight2 + jArr[0] + com.google.common.hash.LittleEndianByteArray.load64(bytes, i5 + 40);
            long jRotateRight3 = java.lang.Long.rotateRight(jShiftMix + jArr2[0], 33) * K1;
            weakHashLength32WithSeeds(bytes, i5, jArr[1] * K1, j3 + jArr2[0], jArr);
            weakHashLength32WithSeeds(bytes, i5 + 32, jRotateRight3 + jArr2[1], jLoad65 + com.google.common.hash.LittleEndianByteArray.load64(bytes, i5 + 16), jArr2);
            int i6 = i5 + 64;
            if (i6 == i2) {
                long j4 = K1 + ((j3 & 255) << 1);
                long j5 = jArr2[0] + ((long) i3);
                jArr2[0] = j5;
                long j6 = jArr[0] + j5;
                jArr[0] = j6;
                jArr2[0] = jArr2[0] + j6;
                long jRotateRight4 = java.lang.Long.rotateRight(jRotateRight3 + jLoad65 + jArr[0] + com.google.common.hash.LittleEndianByteArray.load64(bytes, i4 + 8), 37) * j4;
                long jRotateRight5 = java.lang.Long.rotateRight(jLoad65 + jArr[1] + com.google.common.hash.LittleEndianByteArray.load64(bytes, i4 + 48), 42) * j4;
                long j7 = jRotateRight4 ^ (jArr2[1] * 9);
                long jLoad66 = jRotateRight5 + (jArr[0] * 9) + com.google.common.hash.LittleEndianByteArray.load64(bytes, i4 + 40);
                long jRotateRight6 = java.lang.Long.rotateRight(j3 + jArr2[0], 33) * j4;
                weakHashLength32WithSeeds(bytes, i4, jArr[1] * j4, j7 + jArr2[0], jArr);
                weakHashLength32WithSeeds(bytes, i4 + 32, jRotateRight6 + jArr2[1], jLoad66 + com.google.common.hash.LittleEndianByteArray.load64(bytes, i4 + 16), jArr2);
                return hashLength16(hashLength16(jArr[0], jArr2[0], j4) + (shiftMix(jLoad66) * K0) + j7, hashLength16(jArr[1], jArr2[1], j4) + jRotateRight6, j4);
            }
            i5 = i6;
            jShiftMix = j3;
            j2 = jLoad65;
            jLoad64 = jRotateRight3;
        }
    }
}
