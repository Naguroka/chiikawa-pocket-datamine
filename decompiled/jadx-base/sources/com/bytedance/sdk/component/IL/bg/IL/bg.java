package com.bytedance.sdk.component.IL.bg.IL;

/* JADX INFO: loaded from: classes3.dex */
public final class bg implements com.bytedance.sdk.component.IL.bg.IL.IL, com.bytedance.sdk.component.IL.bg.IL.bX, java.lang.Cloneable, java.nio.channels.ByteChannel {
    private static final byte[] bX = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
    long IL;
    com.bytedance.sdk.component.IL.bg.IL.zx bg;

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public void close() {
    }

    @Override // java.io.Flushable
    public void flush() {
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    public boolean bg() {
        return this.IL == 0;
    }

    public byte IL() {
        if (this.IL == 0) {
            throw new java.lang.IllegalStateException("size == 0");
        }
        com.bytedance.sdk.component.IL.bg.IL.zx zxVar = this.bg;
        int i = zxVar.IL;
        int i2 = zxVar.bX;
        int i3 = i + 1;
        byte b = zxVar.bg[i];
        this.IL--;
        if (i3 == i2) {
            this.bg = zxVar.IL();
            com.bytedance.sdk.component.IL.bg.IL.ldr.bg(zxVar);
        } else {
            zxVar.IL = i3;
        }
        return b;
    }

    public java.lang.String bX() {
        try {
            return bg(this.IL, com.bytedance.sdk.component.IL.bg.IL.WR.bg);
        } catch (java.io.EOFException e) {
            throw new java.lang.AssertionError(e);
        }
    }

    public java.lang.String bg(long j, java.nio.charset.Charset charset) throws java.io.EOFException {
        com.bytedance.sdk.component.IL.bg.IL.WR.bg(this.IL, 0L, j);
        if (charset == null) {
            throw new java.lang.IllegalArgumentException("charset == null");
        }
        if (j > 2147483647L) {
            throw new java.lang.IllegalArgumentException("byteCount > Integer.MAX_VALUE: ".concat(java.lang.String.valueOf(j)));
        }
        if (j == 0) {
            return "";
        }
        com.bytedance.sdk.component.IL.bg.IL.zx zxVar = this.bg;
        if (((long) zxVar.IL) + j > zxVar.bX) {
            return new java.lang.String(bg(j), charset);
        }
        java.lang.String str = new java.lang.String(zxVar.bg, zxVar.IL, (int) j, charset);
        zxVar.IL = (int) (((long) zxVar.IL) + j);
        this.IL -= j;
        if (zxVar.IL == zxVar.bX) {
            this.bg = zxVar.IL();
            com.bytedance.sdk.component.IL.bg.IL.ldr.bg(zxVar);
        }
        return str;
    }

    public byte[] bg(long j) throws java.io.EOFException {
        com.bytedance.sdk.component.IL.bg.IL.WR.bg(this.IL, 0L, j);
        if (j > 2147483647L) {
            throw new java.lang.IllegalArgumentException("byteCount > Integer.MAX_VALUE: ".concat(java.lang.String.valueOf(j)));
        }
        byte[] bArr = new byte[(int) j];
        bg(bArr);
        return bArr;
    }

    public void bg(byte[] bArr) throws java.io.EOFException {
        int i = 0;
        while (i < bArr.length) {
            int iBg = bg(bArr, i, bArr.length - i);
            if (iBg == -1) {
                throw new java.io.EOFException();
            }
            i += iBg;
        }
    }

    public int bg(byte[] bArr, int i, int i2) {
        com.bytedance.sdk.component.IL.bg.IL.WR.bg(bArr.length, i, i2);
        com.bytedance.sdk.component.IL.bg.IL.zx zxVar = this.bg;
        if (zxVar == null) {
            return -1;
        }
        int iMin = java.lang.Math.min(i2, zxVar.bX - zxVar.IL);
        java.lang.System.arraycopy(zxVar.bg, zxVar.IL, bArr, i, iMin);
        zxVar.IL += iMin;
        this.IL -= (long) iMin;
        if (zxVar.IL == zxVar.bX) {
            this.bg = zxVar.IL();
            com.bytedance.sdk.component.IL.bg.IL.ldr.bg(zxVar);
        }
        return iMin;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(java.nio.ByteBuffer byteBuffer) throws java.io.IOException {
        com.bytedance.sdk.component.IL.bg.IL.zx zxVar = this.bg;
        if (zxVar == null) {
            return -1;
        }
        int iMin = java.lang.Math.min(byteBuffer.remaining(), zxVar.bX - zxVar.IL);
        byteBuffer.put(zxVar.bg, zxVar.IL, iMin);
        zxVar.IL += iMin;
        this.IL -= (long) iMin;
        if (zxVar.IL == zxVar.bX) {
            this.bg = zxVar.IL();
            com.bytedance.sdk.component.IL.bg.IL.ldr.bg(zxVar);
        }
        return iMin;
    }

    public com.bytedance.sdk.component.IL.bg.IL.bg bg(java.lang.String str) {
        return bg(str, 0, str.length());
    }

    public com.bytedance.sdk.component.IL.bg.IL.bg bg(java.lang.String str, int i, int i2) {
        char cCharAt;
        if (str == null) {
            throw new java.lang.IllegalArgumentException("string == null");
        }
        if (i < 0) {
            throw new java.lang.IllegalArgumentException("beginIndex < 0: ".concat(java.lang.String.valueOf(i)));
        }
        if (i2 < i) {
            throw new java.lang.IllegalArgumentException("endIndex < beginIndex: " + i2 + " < " + i);
        }
        if (i2 > str.length()) {
            throw new java.lang.IllegalArgumentException("endIndex > string.length: " + i2 + " > " + str.length());
        }
        while (i < i2) {
            char cCharAt2 = str.charAt(i);
            if (cCharAt2 < 128) {
                com.bytedance.sdk.component.IL.bg.IL.zx zxVarBX = bX(1);
                byte[] bArr = zxVarBX.bg;
                int i3 = zxVarBX.bX - i;
                int iMin = java.lang.Math.min(i2, 8192 - i3);
                int i4 = i + 1;
                bArr[i + i3] = (byte) cCharAt2;
                while (true) {
                    i = i4;
                    if (i >= iMin || (cCharAt = str.charAt(i)) >= 128) {
                        break;
                    }
                    i4 = i + 1;
                    bArr[i + i3] = (byte) cCharAt;
                }
                int i5 = (i3 + i) - zxVarBX.bX;
                zxVarBX.bX += i5;
                this.IL += (long) i5;
            } else {
                if (cCharAt2 < 2048) {
                    IL((cCharAt2 >> 6) | 192);
                    IL((cCharAt2 & '?') | 128);
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    IL((cCharAt2 >> '\f') | 224);
                    IL(((cCharAt2 >> 6) & 63) | 128);
                    IL((cCharAt2 & '?') | 128);
                } else {
                    int i6 = i + 1;
                    char cCharAt3 = i6 < i2 ? str.charAt(i6) : (char) 0;
                    if (cCharAt2 > 56319 || cCharAt3 < 56320 || cCharAt3 > 57343) {
                        IL(63);
                        i = i6;
                    } else {
                        int i7 = (((cCharAt2 & 10239) << 10) | (9215 & cCharAt3)) + 65536;
                        IL((i7 >> 18) | androidx.media3.extractor.ts.PsExtractor.VIDEO_STREAM_MASK);
                        IL(((i7 >> 12) & 63) | 128);
                        IL(((i7 >> 6) & 63) | 128);
                        IL((i7 & 63) | 128);
                        i += 2;
                    }
                }
                i++;
            }
        }
        return this;
    }

    public com.bytedance.sdk.component.IL.bg.IL.bg bg(int i) {
        if (i < 128) {
            IL(i);
        } else if (i < 2048) {
            IL((i >> 6) | 192);
            IL((i & 63) | 128);
        } else if (i < 65536) {
            if (i >= 55296 && i <= 57343) {
                IL(63);
            } else {
                IL((i >> 12) | 224);
                IL(((i >> 6) & 63) | 128);
                IL((i & 63) | 128);
            }
        } else if (i <= 1114111) {
            IL((i >> 18) | androidx.media3.extractor.ts.PsExtractor.VIDEO_STREAM_MASK);
            IL(((i >> 12) & 63) | 128);
            IL(((i >> 6) & 63) | 128);
            IL((i & 63) | 128);
        } else {
            throw new java.lang.IllegalArgumentException("Unexpected code point: " + java.lang.Integer.toHexString(i));
        }
        return this;
    }

    public com.bytedance.sdk.component.IL.bg.IL.bg bg(java.lang.String str, int i, int i2, java.nio.charset.Charset charset) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("string == null");
        }
        if (i < 0) {
            throw new java.lang.IllegalAccessError("beginIndex < 0: ".concat(java.lang.String.valueOf(i)));
        }
        if (i2 < i) {
            throw new java.lang.IllegalArgumentException("endIndex < beginIndex: " + i2 + " < " + i);
        }
        if (i2 > str.length()) {
            throw new java.lang.IllegalArgumentException("endIndex > string.length: " + i2 + " > " + str.length());
        }
        if (charset == null) {
            throw new java.lang.IllegalArgumentException("charset == null");
        }
        if (charset.equals(com.bytedance.sdk.component.IL.bg.IL.WR.bg)) {
            return bg(str, i, i2);
        }
        byte[] bytes = str.substring(i, i2).getBytes(charset);
        return IL(bytes, 0, bytes.length);
    }

    public com.bytedance.sdk.component.IL.bg.IL.bg IL(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new java.lang.IllegalArgumentException("source == null");
        }
        long j = i2;
        com.bytedance.sdk.component.IL.bg.IL.WR.bg(bArr.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            com.bytedance.sdk.component.IL.bg.IL.zx zxVarBX = bX(1);
            int iMin = java.lang.Math.min(i3 - i, 8192 - zxVarBX.bX);
            java.lang.System.arraycopy(bArr, i, zxVarBX.bg, zxVarBX.bX, iMin);
            i += iMin;
            zxVarBX.bX += iMin;
        }
        this.IL += j;
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(java.nio.ByteBuffer byteBuffer) throws java.io.IOException {
        if (byteBuffer == null) {
            throw new java.lang.IllegalArgumentException("source == null");
        }
        int iRemaining = byteBuffer.remaining();
        int i = iRemaining;
        while (i > 0) {
            com.bytedance.sdk.component.IL.bg.IL.zx zxVarBX = bX(1);
            int iMin = java.lang.Math.min(i, 8192 - zxVarBX.bX);
            byteBuffer.get(zxVarBX.bg, zxVarBX.bX, iMin);
            i -= iMin;
            zxVarBX.bX += iMin;
        }
        this.IL += (long) iRemaining;
        return iRemaining;
    }

    public com.bytedance.sdk.component.IL.bg.IL.bg IL(int i) {
        com.bytedance.sdk.component.IL.bg.IL.zx zxVarBX = bX(1);
        byte[] bArr = zxVarBX.bg;
        int i2 = zxVarBX.bX;
        zxVarBX.bX = i2 + 1;
        bArr[i2] = (byte) i;
        this.IL++;
        return this;
    }

    public com.bytedance.sdk.component.IL.bg.IL.bg IL(long j) {
        if (j == 0) {
            return IL(48);
        }
        int iNumberOfTrailingZeros = (java.lang.Long.numberOfTrailingZeros(java.lang.Long.highestOneBit(j)) / 4) + 1;
        com.bytedance.sdk.component.IL.bg.IL.zx zxVarBX = bX(iNumberOfTrailingZeros);
        byte[] bArr = zxVarBX.bg;
        int i = zxVarBX.bX;
        for (int i2 = (zxVarBX.bX + iNumberOfTrailingZeros) - 1; i2 >= i; i2--) {
            bArr[i2] = bX[(int) (15 & j)];
            j >>>= 4;
        }
        zxVarBX.bX += iNumberOfTrailingZeros;
        this.IL += (long) iNumberOfTrailingZeros;
        return this;
    }

    com.bytedance.sdk.component.IL.bg.IL.zx bX(int i) {
        if (i <= 0 || i > 8192) {
            throw new java.lang.IllegalArgumentException();
        }
        com.bytedance.sdk.component.IL.bg.IL.zx zxVar = this.bg;
        if (zxVar == null) {
            com.bytedance.sdk.component.IL.bg.IL.zx zxVarBg = com.bytedance.sdk.component.IL.bg.IL.ldr.bg();
            this.bg = zxVarBg;
            zxVarBg.iR = zxVarBg;
            zxVarBg.ldr = zxVarBg;
            return zxVarBg;
        }
        com.bytedance.sdk.component.IL.bg.IL.zx zxVar2 = zxVar.iR;
        return (zxVar2.bX + i > 8192 || !zxVar2.zx) ? zxVar2.bg(com.bytedance.sdk.component.IL.bg.IL.ldr.bg()) : zxVar2;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.bytedance.sdk.component.IL.bg.IL.bg)) {
            return false;
        }
        com.bytedance.sdk.component.IL.bg.IL.bg bgVar = (com.bytedance.sdk.component.IL.bg.IL.bg) obj;
        long j = this.IL;
        if (j != bgVar.IL) {
            return false;
        }
        long j2 = 0;
        if (j == 0) {
            return true;
        }
        com.bytedance.sdk.component.IL.bg.IL.zx zxVar = this.bg;
        com.bytedance.sdk.component.IL.bg.IL.zx zxVar2 = bgVar.bg;
        int i = zxVar.IL;
        int i2 = zxVar2.IL;
        while (j2 < this.IL) {
            long jMin = java.lang.Math.min(zxVar.bX - i, zxVar2.bX - i2);
            int i3 = 0;
            while (i3 < jMin) {
                int i4 = i + 1;
                int i5 = i2 + 1;
                if (zxVar.bg[i] != zxVar2.bg[i2]) {
                    return false;
                }
                i3++;
                i = i4;
                i2 = i5;
            }
            if (i == zxVar.bX) {
                zxVar = zxVar.ldr;
                i = zxVar.IL;
            }
            if (i2 == zxVar2.bX) {
                zxVar2 = zxVar2.ldr;
                i2 = zxVar2.IL;
            }
            j2 += jMin;
        }
        return true;
    }

    public int hashCode() {
        com.bytedance.sdk.component.IL.bg.IL.zx zxVar = this.bg;
        if (zxVar == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = zxVar.bX;
            for (int i3 = zxVar.IL; i3 < i2; i3++) {
                i = (i * 31) + zxVar.bg[i3];
            }
            zxVar = zxVar.ldr;
        } while (zxVar != this.bg);
        return i;
    }

    public java.lang.String toString() {
        return zx().toString();
    }

    /* JADX INFO: renamed from: eqN, reason: merged with bridge method [inline-methods] */
    public com.bytedance.sdk.component.IL.bg.IL.bg clone() {
        com.bytedance.sdk.component.IL.bg.IL.bg bgVar = new com.bytedance.sdk.component.IL.bg.IL.bg();
        if (this.IL == 0) {
            return bgVar;
        }
        com.bytedance.sdk.component.IL.bg.IL.zx zxVarBg = this.bg.bg();
        bgVar.bg = zxVarBg;
        zxVarBg.iR = zxVarBg;
        zxVarBg.ldr = zxVarBg;
        com.bytedance.sdk.component.IL.bg.IL.zx zxVar = this.bg;
        while (true) {
            zxVar = zxVar.ldr;
            if (zxVar != this.bg) {
                bgVar.bg.iR.bg(zxVar.bg());
            } else {
                bgVar.IL = this.IL;
                return bgVar;
            }
        }
    }

    public final com.bytedance.sdk.component.IL.bg.IL.eqN zx() {
        long j = this.IL;
        if (j > 2147483647L) {
            throw new java.lang.IllegalArgumentException("size > Integer.MAX_VALUE: " + this.IL);
        }
        return eqN((int) j);
    }

    public final com.bytedance.sdk.component.IL.bg.IL.eqN eqN(int i) {
        if (i == 0) {
            return com.bytedance.sdk.component.IL.bg.IL.eqN.bX;
        }
        return new com.bytedance.sdk.component.IL.bg.IL.iR(this, i);
    }
}
