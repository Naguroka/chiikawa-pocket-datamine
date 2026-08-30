package org.objectweb.asm;

/* JADX INFO: loaded from: classes6.dex */
public class ByteVector {
    byte[] data;
    int length;

    public ByteVector() {
        this.data = new byte[64];
    }

    public ByteVector(int i) {
        this.data = new byte[i];
    }

    ByteVector(byte[] bArr) {
        this.data = bArr;
        this.length = bArr.length;
    }

    public org.objectweb.asm.ByteVector putByte(int i) {
        int i2 = this.length;
        int i3 = i2 + 1;
        if (i3 > this.data.length) {
            enlarge(1);
        }
        this.data[i2] = (byte) i;
        this.length = i3;
        return this;
    }

    final org.objectweb.asm.ByteVector put11(int i, int i2) {
        int i3 = this.length;
        if (i3 + 2 > this.data.length) {
            enlarge(2);
        }
        byte[] bArr = this.data;
        int i4 = i3 + 1;
        bArr[i3] = (byte) i;
        bArr[i4] = (byte) i2;
        this.length = i4 + 1;
        return this;
    }

    public org.objectweb.asm.ByteVector putShort(int i) {
        int i2 = this.length;
        if (i2 + 2 > this.data.length) {
            enlarge(2);
        }
        byte[] bArr = this.data;
        int i3 = i2 + 1;
        bArr[i2] = (byte) (i >>> 8);
        bArr[i3] = (byte) i;
        this.length = i3 + 1;
        return this;
    }

    final org.objectweb.asm.ByteVector put12(int i, int i2) {
        int i3 = this.length;
        if (i3 + 3 > this.data.length) {
            enlarge(3);
        }
        byte[] bArr = this.data;
        int i4 = i3 + 1;
        bArr[i3] = (byte) i;
        int i5 = i4 + 1;
        bArr[i4] = (byte) (i2 >>> 8);
        bArr[i5] = (byte) i2;
        this.length = i5 + 1;
        return this;
    }

    final org.objectweb.asm.ByteVector put112(int i, int i2, int i3) {
        int i4 = this.length;
        if (i4 + 4 > this.data.length) {
            enlarge(4);
        }
        byte[] bArr = this.data;
        int i5 = i4 + 1;
        bArr[i4] = (byte) i;
        int i6 = i5 + 1;
        bArr[i5] = (byte) i2;
        int i7 = i6 + 1;
        bArr[i6] = (byte) (i3 >>> 8);
        bArr[i7] = (byte) i3;
        this.length = i7 + 1;
        return this;
    }

    public org.objectweb.asm.ByteVector putInt(int i) {
        int i2 = this.length;
        if (i2 + 4 > this.data.length) {
            enlarge(4);
        }
        byte[] bArr = this.data;
        int i3 = i2 + 1;
        bArr[i2] = (byte) (i >>> 24);
        int i4 = i3 + 1;
        bArr[i3] = (byte) (i >>> 16);
        int i5 = i4 + 1;
        bArr[i4] = (byte) (i >>> 8);
        bArr[i5] = (byte) i;
        this.length = i5 + 1;
        return this;
    }

    final org.objectweb.asm.ByteVector put122(int i, int i2, int i3) {
        int i4 = this.length;
        if (i4 + 5 > this.data.length) {
            enlarge(5);
        }
        byte[] bArr = this.data;
        int i5 = i4 + 1;
        bArr[i4] = (byte) i;
        int i6 = i5 + 1;
        bArr[i5] = (byte) (i2 >>> 8);
        int i7 = i6 + 1;
        bArr[i6] = (byte) i2;
        int i8 = i7 + 1;
        bArr[i7] = (byte) (i3 >>> 8);
        bArr[i8] = (byte) i3;
        this.length = i8 + 1;
        return this;
    }

    public org.objectweb.asm.ByteVector putLong(long j) {
        int i = this.length;
        if (i + 8 > this.data.length) {
            enlarge(8);
        }
        byte[] bArr = this.data;
        int i2 = (int) (j >>> 32);
        int i3 = i + 1;
        bArr[i] = (byte) (i2 >>> 24);
        int i4 = i3 + 1;
        bArr[i3] = (byte) (i2 >>> 16);
        int i5 = i4 + 1;
        bArr[i4] = (byte) (i2 >>> 8);
        int i6 = i5 + 1;
        bArr[i5] = (byte) i2;
        int i7 = (int) j;
        int i8 = i6 + 1;
        bArr[i6] = (byte) (i7 >>> 24);
        int i9 = i8 + 1;
        bArr[i8] = (byte) (i7 >>> 16);
        int i10 = i9 + 1;
        bArr[i9] = (byte) (i7 >>> 8);
        bArr[i10] = (byte) i7;
        this.length = i10 + 1;
        return this;
    }

    public org.objectweb.asm.ByteVector putUTF8(java.lang.String str) {
        int length = str.length();
        if (length > 65535) {
            throw new java.lang.IllegalArgumentException("UTF8 string too large");
        }
        int i = this.length;
        if (i + 2 + length > this.data.length) {
            enlarge(length + 2);
        }
        byte[] bArr = this.data;
        int i2 = i + 1;
        bArr[i] = (byte) (length >>> 8);
        int i3 = i2 + 1;
        bArr[i2] = (byte) length;
        int i4 = 0;
        while (i4 < length) {
            char cCharAt = str.charAt(i4);
            if (cCharAt >= 1 && cCharAt <= 127) {
                bArr[i3] = (byte) cCharAt;
                i4++;
                i3++;
            } else {
                this.length = i3;
                return encodeUtf8(str, i4, 65535);
            }
        }
        this.length = i3;
        return this;
    }

    final org.objectweb.asm.ByteVector encodeUtf8(java.lang.String str, int i, int i2) {
        int i3;
        int length = str.length();
        int i4 = i;
        int i5 = i4;
        while (i4 < length) {
            char cCharAt = str.charAt(i4);
            if (cCharAt < 1 || cCharAt > 127) {
                i5 = cCharAt <= 2047 ? i5 + 2 : i5 + 3;
            } else {
                i5++;
            }
            i4++;
        }
        if (i5 > i2) {
            throw new java.lang.IllegalArgumentException("UTF8 string too large");
        }
        int i6 = this.length;
        int i7 = (i6 - i) - 2;
        if (i7 >= 0) {
            byte[] bArr = this.data;
            bArr[i7] = (byte) (i5 >>> 8);
            bArr[i7 + 1] = (byte) i5;
        }
        if ((i6 + i5) - i > this.data.length) {
            enlarge(i5 - i);
        }
        int i8 = this.length;
        while (i < length) {
            char cCharAt2 = str.charAt(i);
            if (cCharAt2 < 1 || cCharAt2 > 127) {
                if (cCharAt2 <= 2047) {
                    byte[] bArr2 = this.data;
                    int i9 = i8 + 1;
                    bArr2[i8] = (byte) (((cCharAt2 >> 6) & 31) | 192);
                    i8 = i9 + 1;
                    bArr2[i9] = (byte) ((cCharAt2 & '?') | 128);
                } else {
                    byte[] bArr3 = this.data;
                    int i10 = i8 + 1;
                    bArr3[i8] = (byte) (((cCharAt2 >> '\f') & 15) | 224);
                    int i11 = i10 + 1;
                    bArr3[i10] = (byte) (((cCharAt2 >> 6) & 63) | 128);
                    i3 = i11 + 1;
                    bArr3[i11] = (byte) ((cCharAt2 & '?') | 128);
                }
                i++;
            } else {
                i3 = i8 + 1;
                this.data[i8] = (byte) cCharAt2;
            }
            i8 = i3;
            i++;
        }
        this.length = i8;
        return this;
    }

    public org.objectweb.asm.ByteVector putByteArray(byte[] bArr, int i, int i2) {
        if (this.length + i2 > this.data.length) {
            enlarge(i2);
        }
        if (bArr != null) {
            java.lang.System.arraycopy(bArr, i, this.data, this.length, i2);
        }
        this.length += i2;
        return this;
    }

    private void enlarge(int i) {
        byte[] bArr = this.data;
        int length = bArr.length * 2;
        int i2 = this.length;
        int i3 = i + i2;
        if (length <= i3) {
            length = i3;
        }
        byte[] bArr2 = new byte[length];
        java.lang.System.arraycopy(bArr, 0, bArr2, 0, i2);
        this.data = bArr2;
    }
}
