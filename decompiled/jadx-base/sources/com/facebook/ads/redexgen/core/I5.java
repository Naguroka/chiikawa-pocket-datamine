package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class I5 {
    public static java.lang.String[] A04 = {"oaZzVubNOElt02WGCaqvSJ1WhomZeIvc", "NwYbQLWQDzvN9xZwkujqy0rFcq6udtvI", "H4XFnNQqwOU0BBxHSKtA4senwYzulcFS", "6", "HCjDr2k1", "fTBcqf", "mKK7C24ZHr99ntzK4hjILwnVN9oEe41m", "tX5KRUyTrTKIf2eU3tc1SLWDMoaFB6a3"};
    public int A00;
    public int A01;
    public int A02;
    public byte[] A03;

    public I5(byte[] bArr, int i, int i2) {
        A08(bArr, i, i2);
    }

    private int A00() {
        int i = 0;
        while (!A0A()) {
            i++;
        }
        int i2 = (1 << i) - 1;
        int leadingZeros = i > 0 ? A05(i) : 0;
        return i2 + leadingZeros;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    private void A01() {
        boolean z;
        if (this.A02 >= 0) {
            if (this.A02 >= this.A01) {
                int i = this.A02;
                int i2 = this.A01;
                java.lang.String[] strArr = A04;
                if (strArr[1].charAt(30) != strArr[0].charAt(30)) {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr2 = A04;
                strArr2[1] = "lxsNfGUZSrZFSvWPNZMKZyaq3XZkRgvL";
                strArr2[0] = "zOz33HhI6vVy8NnH7CZd9hDrdqmOlIvR";
                z = i == i2 && this.A00 == 0;
            }
        }
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A04(z);
    }

    private boolean A02(int i) {
        return 2 <= i && i < this.A01 && this.A03[i] == 3 && this.A03[i + (-2)] == 0 && this.A03[i + (-1)] == 0;
    }

    public final int A03() {
        int iA00 = A00();
        int codeNum = iA00 % 2;
        int i = codeNum == 0 ? -1 : 1;
        int codeNum2 = iA00 + 1;
        int i2 = codeNum2 / 2;
        if (A04[5].length() != 6) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr = A04;
        strArr[6] = "Qnd9EPcWsl8U4hISHZt2qAi8nsbxDXMp";
        strArr[7] = "09Jd7FyqOKiNQBHflHU03VyjNv0fpOtt";
        return i * i2;
    }

    public final int A04() {
        return A00();
    }

    public final int A05(int i) {
        int i2 = 0;
        int returnValue = this.A00;
        this.A00 = returnValue + i;
        while (true) {
            int returnValue2 = this.A00;
            int i3 = 2;
            if (returnValue2 <= 8) {
                break;
            }
            int returnValue3 = this.A00;
            this.A00 = returnValue3 - 8;
            byte[] bArr = this.A03;
            int returnValue4 = this.A02;
            int i4 = bArr[returnValue4] & 255;
            int returnValue5 = this.A00;
            i2 |= i4 << returnValue5;
            int i5 = this.A02;
            int returnValue6 = this.A02;
            if (!A02(returnValue6 + 1)) {
                i3 = 1;
            }
            this.A02 = i5 + i3;
        }
        byte[] bArr2 = this.A03;
        int returnValue7 = this.A02;
        int i6 = bArr2[returnValue7] & 255;
        int returnValue8 = this.A00;
        int i7 = i2 | (i6 >> (8 - returnValue8));
        int returnValue9 = (-1) >>> (32 - i);
        int i8 = i7 & returnValue9;
        int returnValue10 = this.A00;
        if (returnValue10 == 8) {
            this.A00 = 0;
            int i9 = this.A02;
            int returnValue11 = this.A02;
            this.A02 = i9 + (A02(returnValue11 + 1) ? 2 : 1);
        }
        A01();
        return i8;
    }

    public final void A06() {
        int i = this.A00 + 1;
        this.A00 = i;
        if (i == 8) {
            this.A00 = 0;
            this.A02 += A02(this.A02 + 1) ? 2 : 1;
        }
        A01();
    }

    public final void A07(int i) {
        int i2 = this.A02;
        int i3 = i / 8;
        int oldByteOffset = this.A02;
        this.A02 = oldByteOffset + i3;
        int numBytes = this.A00;
        int oldByteOffset2 = i3 * 8;
        this.A00 = numBytes + (i - oldByteOffset2);
        int numBytes2 = this.A00;
        if (numBytes2 > 7) {
            int oldByteOffset3 = this.A02;
            this.A02 = oldByteOffset3 + 1;
            int oldByteOffset4 = this.A00;
            this.A00 = oldByteOffset4 - 8;
        }
        int numBytes3 = i2 + 1;
        while (numBytes3 <= oldByteOffset) {
            if (A02(numBytes3)) {
                int oldByteOffset5 = this.A02;
                this.A02 = oldByteOffset5 + 1;
                numBytes3 += 2;
            }
            numBytes3++;
        }
        A01();
    }

    public final void A08(byte[] bArr, int i, int i2) {
        this.A03 = bArr;
        this.A02 = i;
        this.A01 = i2;
        this.A00 = 0;
        A01();
    }

    public final boolean A09() {
        int i = this.A02;
        int i2 = this.A00;
        int i3 = 0;
        while (initialBitOffset < initialByteOffset && !A0A()) {
            i3++;
        }
        int i4 = this.A02;
        int initialByteOffset = this.A01;
        int initialByteOffset2 = i4 == initialByteOffset ? 1 : 0;
        this.A02 = i;
        this.A00 = i2;
        if (initialByteOffset2 != 0) {
            return false;
        }
        int initialByteOffset3 = i3 * 2;
        return A0B(initialByteOffset3 + 1);
    }

    public final boolean A0A() {
        boolean returnValue = (this.A03[this.A02] & (128 >> this.A00)) != 0;
        A06();
        return returnValue;
    }

    public final boolean A0B(int i) {
        int numBytes = this.A02;
        int oldByteOffset = i / 8;
        int i2 = this.A02 + oldByteOffset;
        int newBitOffset = (this.A00 + i) - (oldByteOffset * 8);
        if (newBitOffset > 7) {
            i2++;
            newBitOffset -= 8;
        }
        int i3 = numBytes + 1;
        while (numBytes == 6) {
            java.lang.String[] strArr = A04;
            strArr[4] = "E0yrE6bE";
            strArr[3] = androidx.exifinterface.media.ExifInterface.LATITUDE_SOUTH;
            if (i3 <= i2 && i2 < this.A01) {
                if (A02(i3)) {
                    i2++;
                    int numBytes2 = A04[5].length();
                    if (numBytes2 != 6) {
                        i3 += 2;
                    } else {
                        A04[5] = "J0s770";
                        i3 += 2;
                    }
                }
                i3++;
            } else {
                if (i2 >= this.A01) {
                    return i2 == this.A01 && newBitOffset == 0;
                }
                return true;
            }
        }
        throw new java.lang.RuntimeException();
    }
}
