package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class I3 {
    public static java.lang.String[] A04 = {"aOyC0jDito78Vfy1Nla0i9V", "WNsma8cFvme8ZgwSB3ik3sLylzv2AP1M", "N1cAdaDOGYPovqFEJPANujO1lTrm1R8x", "xPaHXuUuj35IhmxPs2j6NM15pvjyhHn", "toTEFRrlGK8K68MOY9fqi4QHUSJ3AT77", "3Fy1x7yVvr", "zIgtazYEv6wIELQnc0J7ZnYrfidBuPPF", "9uudWy56nH"};
    public byte[] A00;
    public int A01;
    public int A02;
    public int A03;

    public I3() {
    }

    public I3(byte[] bArr) {
        this(bArr, bArr.length);
    }

    public I3(byte[] bArr, int i) {
        this.A00 = bArr;
        this.A02 = i;
    }

    private void A00() {
        boolean z;
        if (this.A03 < 0) {
            z = false;
        } else {
            if (this.A03 >= this.A02) {
                if (this.A03 == this.A02) {
                    int i = this.A01;
                    java.lang.String[] strArr = A04;
                    if (strArr[7].length() != strArr[5].length()) {
                        throw new java.lang.RuntimeException();
                    }
                    java.lang.String[] strArr2 = A04;
                    strArr2[1] = "OSNHTg3ADFpX6DP2tOs0qw9XaKQiTPiw";
                    strArr2[6] = "iVxsD1Hg3ZcKsbvYTUyYIrJOOlBOlPT2";
                    if (i == 0) {
                    }
                }
                z = false;
            }
            z = true;
        }
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A04(z);
    }

    public final int A01() {
        return ((this.A02 - this.A03) * 8) - this.A01;
    }

    public final int A02() {
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A04(this.A01 == 0);
        java.lang.String[] strArr = A04;
        if (strArr[1].charAt(29) != strArr[6].charAt(29)) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A04;
        strArr2[2] = "jrHsHrOWGW7hBouRMSU7ObGjew6g61BB";
        strArr2[4] = "NI1fsHbKGeRDwpNTvWuj4i2Lu559JSow";
        return this.A03;
    }

    public final int A03() {
        return (this.A03 * 8) + this.A01;
    }

    public final int A04(int i) {
        if (i == 0) {
            return 0;
        }
        int i2 = 0;
        this.A01 += i;
        while (this.A01 > 8) {
            this.A01 -= 8;
            byte[] bArr = this.A00;
            int i3 = this.A03;
            this.A03 = i3 + 1;
            java.lang.String[] strArr = A04;
            java.lang.String str = strArr[1];
            java.lang.String str2 = strArr[6];
            int returnValue = str.charAt(29);
            if (returnValue != str2.charAt(29)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A04;
            strArr2[0] = "MXVSoh8UspzU4TwiEjshPf0";
            strArr2[3] = "oJC4aegRhEHHJQ1TmbM9HekITZxf6oV";
            int returnValue2 = bArr[i3] & 255;
            i2 |= returnValue2 << this.A01;
        }
        int returnValue3 = this.A00[this.A03] & 255;
        int i4 = i2 | (returnValue3 >> (8 - this.A01));
        int returnValue4 = 32 - i;
        int i5 = i4 & ((-1) >>> returnValue4);
        if (this.A01 == 8) {
            this.A01 = 0;
            this.A03++;
        }
        A00();
        return i5;
    }

    public final void A05() {
        if (this.A01 == 0) {
            return;
        }
        this.A01 = 0;
        this.A03++;
        A00();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x004e  */
    public final void A06() {
        java.lang.String[] strArr;
        int i = this.A01 + 1;
        this.A01 = i;
        if (i == 8) {
            this.A01 = 0;
            int i2 = this.A03;
            java.lang.String[] strArr2 = A04;
            if (strArr2[0].length() != strArr2[3].length()) {
                java.lang.String[] strArr3 = A04;
                strArr3[0] = "G9t9XacKeYsDGYvG3yWvXBJ";
                strArr3[3] = "28QJLyNvJNS9vIUzrH1yFxCTai7z0pp";
                this.A03 = i2 + 1;
                A00();
                strArr = A04;
                if (strArr[2].charAt(8) == strArr[4].charAt(8)) {
                    java.lang.String[] strArr4 = A04;
                    strArr4[7] = "LCiot4B19T";
                    strArr4[5] = "B1ovW1DrW4";
                    return;
                }
            }
        } else {
            A00();
            strArr = A04;
            if (strArr[2].charAt(8) == strArr[4].charAt(8)) {
                java.lang.String[] strArr5 = A04;
                strArr5[7] = "LCiot4B19T";
                strArr5[5] = "B1ovW1DrW4";
                return;
            }
        }
        throw new java.lang.RuntimeException();
    }

    public final void A07(int i) {
        this.A03 = i / 8;
        this.A01 = i - (this.A03 * 8);
        A00();
    }

    public final void A08(int i) {
        int i2 = i / 8;
        int numBytes = this.A03;
        this.A03 = numBytes + i2;
        int numBytes2 = i2 * 8;
        this.A01 += i - numBytes2;
        if (this.A01 > 7) {
            int numBytes3 = this.A03;
            this.A03 = numBytes3 + 1;
            int numBytes4 = this.A01;
            this.A01 = numBytes4 - 8;
        }
        A00();
    }

    public final void A09(int i) {
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A04(this.A01 == 0);
        this.A03 += i;
        A00();
    }

    public final void A0A(int i, int i2) {
        if (i2 < 32) {
            int remainingBitsToRead = 1 << i2;
            i &= remainingBitsToRead - 1;
        }
        int remainingBitsToRead2 = this.A01;
        int iMin = java.lang.Math.min(8 - remainingBitsToRead2, i2);
        int remainingBitsToRead3 = this.A01;
        int firstByteInputBits = (8 - remainingBitsToRead3) - iMin;
        int remainingBitsToRead4 = this.A01;
        int i3 = androidx.core.view.MotionEventCompat.ACTION_POINTER_INDEX_MASK >> remainingBitsToRead4;
        int remainingBitsToRead5 = 1 << firstByteInputBits;
        int firstByteBitmask = i3 | (remainingBitsToRead5 - 1);
        byte[] bArr = this.A00;
        int i4 = this.A03;
        byte[] bArr2 = this.A00;
        int remainingBitsToRead6 = this.A03;
        bArr[i4] = (byte) (bArr2[remainingBitsToRead6] & firstByteBitmask);
        int remainingBitsToRead7 = i2 - iMin;
        int firstByteBitmask2 = i >>> remainingBitsToRead7;
        byte[] bArr3 = this.A00;
        int i5 = this.A03;
        byte[] bArr4 = this.A00;
        int remainingBitsToRead8 = this.A03;
        bArr3[i5] = (byte) (bArr4[remainingBitsToRead8] | (firstByteBitmask2 << firstByteInputBits));
        int firstByteBitmask3 = i2 - iMin;
        int firstByteRightPaddingSize = this.A03;
        int firstByteRightPaddingSize2 = firstByteRightPaddingSize + 1;
        while (firstByteBitmask3 > 8) {
            int firstByteReadSize = firstByteRightPaddingSize2 + 1;
            int remainingBitsToRead9 = firstByteBitmask3 - 8;
            this.A00[firstByteRightPaddingSize2] = (byte) (i >>> remainingBitsToRead9);
            firstByteBitmask3 -= 8;
            firstByteRightPaddingSize2 = firstByteReadSize;
        }
        int lastByteRightPaddingSize = 8 - firstByteBitmask3;
        byte[] bArr5 = this.A00;
        int firstByteReadSize2 = this.A00[firstByteRightPaddingSize2];
        int remainingBitsToRead10 = 1 << lastByteRightPaddingSize;
        bArr5[firstByteRightPaddingSize2] = (byte) (firstByteReadSize2 & (remainingBitsToRead10 - 1));
        int remainingBitsToRead11 = 1 << firstByteBitmask3;
        int i6 = i & (remainingBitsToRead11 - 1);
        byte[] bArr6 = this.A00;
        int remainingBitsToRead12 = this.A00[firstByteRightPaddingSize2];
        bArr6[firstByteRightPaddingSize2] = (byte) (remainingBitsToRead12 | (i6 << lastByteRightPaddingSize));
        A08(i2);
        A00();
    }

    public final void A0B(byte[] bArr) {
        A0C(bArr, bArr.length);
    }

    public final void A0C(byte[] bArr, int i) {
        this.A00 = bArr;
        this.A03 = 0;
        this.A01 = 0;
        this.A02 = i;
    }

    public final void A0D(byte[] bArr, int i, int i2) {
        int i3 = (i2 >> 3) + i;
        while (i < i3) {
            byte[] bArr2 = this.A00;
            int i4 = this.A03;
            int to = i4 + 1;
            this.A03 = to;
            byte b = bArr2[i4];
            int to2 = this.A01;
            int i5 = b << to2;
            java.lang.String[] strArr = A04;
            java.lang.String str = strArr[0];
            java.lang.String str2 = strArr[3];
            int i6 = str.length();
            int to3 = str2.length();
            if (i6 == to3) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A04;
            strArr2[7] = "lRrfO5MNPl";
            strArr2[5] = "ysAxYtlVgw";
            bArr[i] = (byte) i5;
            byte b2 = bArr[i];
            byte[] bArr3 = this.A00;
            int to4 = this.A03;
            int i7 = 255 & bArr3[to4];
            int to5 = this.A01;
            bArr[i] = (byte) ((i7 >> (8 - to5)) | b2);
            i++;
        }
        int i8 = i2 & 7;
        if (i8 == 0) {
            return;
        }
        int bitsLeft = bArr[i3];
        int to6 = 255 >> i8;
        bArr[i3] = (byte) (bitsLeft & to6);
        int to7 = this.A01;
        if (to7 + i8 > 8) {
            byte b3 = bArr[i3];
            byte[] bArr4 = this.A00;
            int bitsLeft2 = this.A03;
            int to8 = bitsLeft2 + 1;
            this.A03 = to8;
            int bitsLeft3 = bArr4[bitsLeft2] & 255;
            int to9 = this.A01;
            bArr[i3] = (byte) (b3 | (bitsLeft3 << to9));
            int i9 = this.A01 - 8;
            java.lang.String[] strArr3 = A04;
            java.lang.String str3 = strArr3[1];
            java.lang.String str4 = strArr3[6];
            int bitsLeft4 = str3.charAt(29);
            int to10 = str4.charAt(29);
            if (bitsLeft4 != to10) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr4 = A04;
            strArr4[2] = "mxeYc6MaGpVYTevlIGOp44lhNxXcQQDZ";
            strArr4[4] = "UN93G5VTG9KASeEmW9fM92cjrozp12u2";
            this.A01 = i9;
        }
        int to11 = this.A01;
        this.A01 = to11 + i8;
        byte[] bArr5 = this.A00;
        int to12 = this.A03;
        int i10 = 255 & bArr5[to12];
        int to13 = this.A01;
        int i11 = i10 >> (8 - to13);
        int bitsLeft5 = bArr[i3];
        int to14 = 8 - i8;
        bArr[i3] = (byte) (bitsLeft5 | ((byte) (i11 << to14)));
        int to15 = this.A01;
        if (to15 == 8) {
            this.A01 = 0;
            int to16 = this.A03;
            this.A03 = to16 + 1;
        }
        A00();
    }

    public final void A0E(byte[] bArr, int i, int i2) {
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A04(this.A01 == 0);
        java.lang.System.arraycopy(this.A00, this.A03, bArr, i, i2);
        this.A03 += i2;
        A00();
    }

    public final boolean A0F() {
        boolean returnValue = (this.A00[this.A03] & (128 >> this.A01)) != 0;
        A06();
        return returnValue;
    }
}
