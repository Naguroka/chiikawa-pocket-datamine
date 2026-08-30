package com.google.common.hash;

/* JADX INFO: loaded from: classes5.dex */
@com.google.errorprone.annotations.Immutable
@com.google.common.hash.ElementTypesAreNonnullByDefault
final class Murmur3_32HashFunction extends com.google.common.hash.AbstractHashFunction implements java.io.Serializable {
    private static final int C1 = -862048943;
    private static final int C2 = 461845907;
    private static final int CHUNK_SIZE = 4;
    private static final long serialVersionUID = 0;
    private final int seed;
    private final boolean supplementaryPlaneFix;
    static final com.google.common.hash.HashFunction MURMUR3_32 = new com.google.common.hash.Murmur3_32HashFunction(0, false);
    static final com.google.common.hash.HashFunction MURMUR3_32_FIXED = new com.google.common.hash.Murmur3_32HashFunction(0, true);
    static final com.google.common.hash.HashFunction GOOD_FAST_HASH_32 = new com.google.common.hash.Murmur3_32HashFunction(com.google.common.hash.Hashing.GOOD_FAST_HASH_SEED, true);

    /* JADX INFO: Access modifiers changed from: private */
    public static long charToThreeUtf8Bytes(char c) {
        return ((long) (c >>> '\f')) | 224 | ((long) ((((c >>> 6) & 63) | 128) << 8)) | ((long) (((c & '?') | 128) << 16));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long charToTwoUtf8Bytes(char c) {
        return ((long) (c >>> 6)) | 192 | ((long) (((c & '?') | 128) << 8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long codePointToFourUtf8Bytes(int codePoint) {
        return ((long) (codePoint >>> 18)) | 240 | ((((long) ((codePoint >>> 12) & 63)) | 128) << 8) | ((((long) ((codePoint >>> 6) & 63)) | 128) << 16) | ((((long) (codePoint & 63)) | 128) << 24);
    }

    @Override // com.google.common.hash.HashFunction
    public int bits() {
        return 32;
    }

    Murmur3_32HashFunction(int seed, boolean supplementaryPlaneFix) {
        this.seed = seed;
        this.supplementaryPlaneFix = supplementaryPlaneFix;
    }

    @Override // com.google.common.hash.HashFunction
    public com.google.common.hash.Hasher newHasher() {
        return new com.google.common.hash.Murmur3_32HashFunction.Murmur3_32Hasher(this.seed);
    }

    public java.lang.String toString() {
        return "Hashing.murmur3_32(" + this.seed + ")";
    }

    public boolean equals(@javax.annotation.CheckForNull java.lang.Object object) {
        if (!(object instanceof com.google.common.hash.Murmur3_32HashFunction)) {
            return false;
        }
        com.google.common.hash.Murmur3_32HashFunction murmur3_32HashFunction = (com.google.common.hash.Murmur3_32HashFunction) object;
        return this.seed == murmur3_32HashFunction.seed && this.supplementaryPlaneFix == murmur3_32HashFunction.supplementaryPlaneFix;
    }

    public int hashCode() {
        return getClass().hashCode() ^ this.seed;
    }

    @Override // com.google.common.hash.AbstractHashFunction, com.google.common.hash.HashFunction
    public com.google.common.hash.HashCode hashInt(int input) {
        return fmix(mixH1(this.seed, mixK1(input)), 4);
    }

    @Override // com.google.common.hash.AbstractHashFunction, com.google.common.hash.HashFunction
    public com.google.common.hash.HashCode hashLong(long input) {
        return fmix(mixH1(mixH1(this.seed, mixK1((int) input)), mixK1((int) (input >>> 32))), 8);
    }

    @Override // com.google.common.hash.AbstractHashFunction, com.google.common.hash.HashFunction
    public com.google.common.hash.HashCode hashUnencodedChars(java.lang.CharSequence input) {
        int iMixK1 = this.seed;
        for (int i = 1; i < input.length(); i += 2) {
            iMixK1 = mixH1(iMixK1, mixK1(input.charAt(i - 1) | (input.charAt(i) << 16)));
        }
        if ((input.length() & 1) == 1) {
            iMixK1 ^= mixK1(input.charAt(input.length() - 1));
        }
        return fmix(iMixK1, input.length() * 2);
    }

    @Override // com.google.common.hash.AbstractHashFunction, com.google.common.hash.HashFunction
    public com.google.common.hash.HashCode hashString(java.lang.CharSequence input, java.nio.charset.Charset charset) {
        if (com.google.common.base.Charsets.UTF_8.equals(charset)) {
            int length = input.length();
            int iMixH1 = this.seed;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                int i4 = i2 + 4;
                if (i4 > length) {
                    break;
                }
                char cCharAt = input.charAt(i2);
                char cCharAt2 = input.charAt(i2 + 1);
                char cCharAt3 = input.charAt(i2 + 2);
                char cCharAt4 = input.charAt(i2 + 3);
                if (cCharAt >= 128 || cCharAt2 >= 128 || cCharAt3 >= 128 || cCharAt4 >= 128) {
                    break;
                }
                iMixH1 = mixH1(iMixH1, mixK1((cCharAt2 << '\b') | cCharAt | (cCharAt3 << 16) | (cCharAt4 << 24)));
                i3 += 4;
                i2 = i4;
            }
            long jCharToThreeUtf8Bytes = 0;
            while (i2 < length) {
                char cCharAt5 = input.charAt(i2);
                if (cCharAt5 < 128) {
                    jCharToThreeUtf8Bytes |= ((long) cCharAt5) << i;
                    i += 8;
                    i3++;
                } else if (cCharAt5 < 2048) {
                    jCharToThreeUtf8Bytes |= charToTwoUtf8Bytes(cCharAt5) << i;
                    i += 16;
                    i3 += 2;
                } else if (cCharAt5 < 55296 || cCharAt5 > 57343) {
                    jCharToThreeUtf8Bytes |= charToThreeUtf8Bytes(cCharAt5) << i;
                    i += 24;
                    i3 += 3;
                } else {
                    int iCodePointAt = java.lang.Character.codePointAt(input, i2);
                    if (iCodePointAt == cCharAt5) {
                        return hashBytes(input.toString().getBytes(charset));
                    }
                    i2++;
                    jCharToThreeUtf8Bytes |= codePointToFourUtf8Bytes(iCodePointAt) << i;
                    if (this.supplementaryPlaneFix) {
                        i += 32;
                    }
                    i3 += 4;
                }
                if (i >= 32) {
                    iMixH1 = mixH1(iMixH1, mixK1((int) jCharToThreeUtf8Bytes));
                    jCharToThreeUtf8Bytes >>>= 32;
                    i -= 32;
                }
                i2++;
            }
            return fmix(mixK1((int) jCharToThreeUtf8Bytes) ^ iMixH1, i3);
        }
        return hashBytes(input.toString().getBytes(charset));
    }

    @Override // com.google.common.hash.AbstractHashFunction, com.google.common.hash.HashFunction
    public com.google.common.hash.HashCode hashBytes(byte[] input, int off, int len) {
        com.google.common.base.Preconditions.checkPositionIndexes(off, off + len, input.length);
        int iMixH1 = this.seed;
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = i2 + 4;
            if (i3 > len) {
                break;
            }
            iMixH1 = mixH1(iMixH1, mixK1(getIntLittleEndian(input, i2 + off)));
            i2 = i3;
        }
        int i4 = i2;
        int i5 = 0;
        while (i4 < len) {
            i ^= com.google.common.primitives.UnsignedBytes.toInt(input[off + i4]) << i5;
            i4++;
            i5 += 8;
        }
        return fmix(mixK1(i) ^ iMixH1, len);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getIntLittleEndian(byte[] input, int offset) {
        return com.google.common.primitives.Ints.fromBytes(input[offset + 3], input[offset + 2], input[offset + 1], input[offset]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int mixK1(int k1) {
        return java.lang.Integer.rotateLeft(k1 * C1, 15) * C2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int mixH1(int h1, int k1) {
        return (java.lang.Integer.rotateLeft(h1 ^ k1, 13) * 5) - 430675100;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.common.hash.HashCode fmix(int h1, int length) {
        int i = h1 ^ length;
        int i2 = (i ^ (i >>> 16)) * (-2048144789);
        int i3 = (i2 ^ (i2 >>> 13)) * (-1028477387);
        return com.google.common.hash.HashCode.fromInt(i3 ^ (i3 >>> 16));
    }

    private static final class Murmur3_32Hasher extends com.google.common.hash.AbstractHasher {
        private long buffer;
        private int h1;
        private int shift;
        private int length = 0;
        private boolean isDone = false;

        Murmur3_32Hasher(int seed) {
            this.h1 = seed;
        }

        private void update(int nBytes, long update) {
            long j = this.buffer;
            long j2 = update & androidx.media3.muxer.Mp4Utils.UNSIGNED_INT_MAX_VALUE;
            int i = this.shift;
            long j3 = (j2 << i) | j;
            this.buffer = j3;
            int i2 = i + (nBytes * 8);
            this.shift = i2;
            this.length += nBytes;
            if (i2 >= 32) {
                this.h1 = com.google.common.hash.Murmur3_32HashFunction.mixH1(this.h1, com.google.common.hash.Murmur3_32HashFunction.mixK1((int) j3));
                this.buffer >>>= 32;
                this.shift -= 32;
            }
        }

        @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
        public com.google.common.hash.Hasher putByte(byte b) {
            update(1, b & 255);
            return this;
        }

        @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
        public com.google.common.hash.Hasher putBytes(byte[] bytes, int off, int len) {
            com.google.common.base.Preconditions.checkPositionIndexes(off, off + len, bytes.length);
            int i = 0;
            while (true) {
                int i2 = i + 4;
                if (i2 > len) {
                    break;
                }
                update(4, com.google.common.hash.Murmur3_32HashFunction.getIntLittleEndian(bytes, i + off));
                i = i2;
            }
            while (i < len) {
                putByte(bytes[off + i]);
                i++;
            }
            return this;
        }

        @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
        public com.google.common.hash.Hasher putBytes(java.nio.ByteBuffer buffer) {
            java.nio.ByteOrder byteOrderOrder = buffer.order();
            buffer.order(java.nio.ByteOrder.LITTLE_ENDIAN);
            while (buffer.remaining() >= 4) {
                putInt(buffer.getInt());
            }
            while (buffer.hasRemaining()) {
                putByte(buffer.get());
            }
            buffer.order(byteOrderOrder);
            return this;
        }

        @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
        public com.google.common.hash.Hasher putInt(int i) {
            update(4, i);
            return this;
        }

        @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
        public com.google.common.hash.Hasher putLong(long l) {
            update(4, (int) l);
            update(4, l >>> 32);
            return this;
        }

        @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
        public com.google.common.hash.Hasher putChar(char c) {
            update(2, c);
            return this;
        }

        @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
        public com.google.common.hash.Hasher putString(java.lang.CharSequence input, java.nio.charset.Charset charset) {
            if (com.google.common.base.Charsets.UTF_8.equals(charset)) {
                int length = input.length();
                int i = 0;
                while (true) {
                    int i2 = i + 4;
                    if (i2 > length) {
                        break;
                    }
                    char cCharAt = input.charAt(i);
                    char cCharAt2 = input.charAt(i + 1);
                    char cCharAt3 = input.charAt(i + 2);
                    char cCharAt4 = input.charAt(i + 3);
                    if (cCharAt >= 128 || cCharAt2 >= 128 || cCharAt3 >= 128 || cCharAt4 >= 128) {
                        break;
                    }
                    update(4, (cCharAt2 << '\b') | cCharAt | (cCharAt3 << 16) | (cCharAt4 << 24));
                    i = i2;
                }
                while (i < length) {
                    char cCharAt5 = input.charAt(i);
                    if (cCharAt5 < 128) {
                        update(1, cCharAt5);
                    } else if (cCharAt5 < 2048) {
                        update(2, com.google.common.hash.Murmur3_32HashFunction.charToTwoUtf8Bytes(cCharAt5));
                    } else if (cCharAt5 < 55296 || cCharAt5 > 57343) {
                        update(3, com.google.common.hash.Murmur3_32HashFunction.charToThreeUtf8Bytes(cCharAt5));
                    } else {
                        int iCodePointAt = java.lang.Character.codePointAt(input, i);
                        if (iCodePointAt != cCharAt5) {
                            i++;
                            update(4, com.google.common.hash.Murmur3_32HashFunction.codePointToFourUtf8Bytes(iCodePointAt));
                        } else {
                            putBytes(input.subSequence(i, length).toString().getBytes(charset));
                            return this;
                        }
                    }
                    i++;
                }
                return this;
            }
            return super.putString(input, charset);
        }

        @Override // com.google.common.hash.Hasher
        public com.google.common.hash.HashCode hash() {
            com.google.common.base.Preconditions.checkState(!this.isDone);
            this.isDone = true;
            int iMixK1 = this.h1 ^ com.google.common.hash.Murmur3_32HashFunction.mixK1((int) this.buffer);
            this.h1 = iMixK1;
            return com.google.common.hash.Murmur3_32HashFunction.fmix(iMixK1, this.length);
        }
    }
}
