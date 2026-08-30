package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class I4 {
    public static byte[] A03;
    public static java.lang.String[] A04 = {"BUPkySTcvyKGzFoXb8xNfxJs2vcj6SI6", "", "9t9QVMNm", "OEPmW7llGTv5RugeZAnT8CJpnv71Deb6", "l81c8yE1UXyvzPuTPm0IGIR5VvYUnp6F", "GkKhWAhOLudlAi1KBbGzOYTYZtsrVTXq", "47Bu8gqHgcKZB6yF", "qEfz1IOL"};
    public byte[] A00;
    public int A01;
    public int A02;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 90);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{11, 48, 56, 35, 46, 43, 38, -30, 23, 22, 8, -17, -6, -30, 53, 39, 51, 55, 39, 48, 37, 39, -30, 37, 49, 48, 54, 43, 48, 55, 35, 54, 43, 49, 48, -30, 36, 59, 54, 39, -4, -30, -52, -15, -7, -28, -17, -20, -25, -93, -40, -41, -55, -80, -69, -93, -10, -24, -12, -8, -24, -15, -26, -24, -93, -23, -20, -11, -10, -9, -93, -27, -4, -9, -24, -67, -93, -12, 15, 16, -64, 2, 9, 20, -64, 14, 15, 20, -64, 26, 5, 18, 15, -38, -64, -24, -25, -39, -64, -53};
    }

    static {
        A01();
    }

    public I4() {
    }

    public I4(int i) {
        this.A00 = new byte[i];
        this.A01 = i;
    }

    public I4(byte[] bArr) {
        this.A00 = bArr;
        this.A01 = bArr.length;
    }

    public I4(byte[] bArr, int i) {
        this.A00 = bArr;
        this.A01 = i;
    }

    public final char A02() {
        return (char) (((this.A00[this.A02] & 255) << 8) | (this.A00[this.A02 + 1] & 255));
    }

    public final double A03() {
        return java.lang.Double.longBitsToDouble(A0L());
    }

    public final int A04() {
        return this.A01 - this.A02;
    }

    public final int A05() {
        if (this.A00 == null) {
            return 0;
        }
        return this.A00.length;
    }

    public final int A06() {
        return this.A02;
    }

    public final int A07() {
        return this.A01;
    }

    public final int A08() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        int i2 = (bArr[i] & 255) << 24;
        byte[] bArr2 = this.A00;
        int i3 = this.A02;
        this.A02 = i3 + 1;
        int i4 = i2 | ((bArr2[i3] & 255) << 16);
        byte[] bArr3 = this.A00;
        int i5 = this.A02;
        this.A02 = i5 + 1;
        int i6 = i4 | ((bArr3[i5] & 255) << 8);
        byte[] bArr4 = this.A00;
        int i7 = this.A02;
        this.A02 = i7 + 1;
        return i6 | (bArr4[i7] & 255);
    }

    public final int A09() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        int i2 = ((bArr[i] & 255) << 24) >> 8;
        byte[] bArr2 = this.A00;
        int i3 = this.A02;
        this.A02 = i3 + 1;
        int i4 = i2 | ((bArr2[i3] & 255) << 8);
        byte[] bArr3 = this.A00;
        int i5 = this.A02;
        this.A02 = i5 + 1;
        return i4 | (bArr3[i5] & 255);
    }

    public final int A0A() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        int i2 = bArr[i] & 255;
        byte[] bArr2 = this.A00;
        int i3 = this.A02;
        this.A02 = i3 + 1;
        int i4 = i2 | ((bArr2[i3] & 255) << 8);
        byte[] bArr3 = this.A00;
        int i5 = this.A02;
        this.A02 = i5 + 1;
        int i6 = i4 | ((bArr3[i5] & 255) << 16);
        byte[] bArr4 = this.A00;
        int i7 = this.A02;
        this.A02 = i7 + 1;
        return i6 | ((bArr4[i7] & 255) << 24);
    }

    public final int A0B() {
        int iA0A = A0A();
        if (iA0A >= 0) {
            return iA0A;
        }
        throw new java.lang.IllegalStateException(A00(77, 18, 70) + iA0A);
    }

    public final int A0C() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        int i2 = bArr[i] & 255;
        byte[] bArr2 = this.A00;
        int i3 = this.A02;
        this.A02 = i3 + 1;
        return i2 | ((bArr2[i3] & 255) << 8);
    }

    public final int A0D() {
        int b2 = A0E();
        int b1 = A0E();
        int b4 = A0E();
        int b3 = A0E();
        int b5 = (b2 << 21) | (b1 << 14);
        int b6 = b4 << 7;
        return b5 | b6 | b3;
    }

    public final int A0E() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        return bArr[i] & 255;
    }

    public final int A0F() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        int i2 = (bArr[i] & 255) << 8;
        byte[] bArr2 = this.A00;
        int i3 = this.A02;
        this.A02 = i3 + 1;
        int i4 = i2 | (bArr2[i3] & 255);
        int result = this.A02;
        this.A02 = result + 2;
        return i4;
    }

    public final int A0G() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        int i2 = (bArr[i] & 255) << 16;
        byte[] bArr2 = this.A00;
        int i3 = this.A02;
        this.A02 = i3 + 1;
        int i4 = i2 | ((bArr2[i3] & 255) << 8);
        byte[] bArr3 = this.A00;
        int i5 = this.A02;
        this.A02 = i5 + 1;
        return i4 | (bArr3[i5] & 255);
    }

    public final int A0H() {
        int iA08 = A08();
        if (iA08 >= 0) {
            return iA08;
        }
        throw new java.lang.IllegalStateException(A00(77, 18, 70) + iA08);
    }

    public final int A0I() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        int i2 = (bArr[i] & 255) << 8;
        byte[] bArr2 = this.A00;
        int i3 = this.A02;
        this.A02 = i3 + 1;
        return i2 | (bArr2[i3] & 255);
    }

    public final long A0J() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        long j = ((long) bArr[i]) & 255;
        byte[] bArr2 = this.A00;
        int i2 = this.A02;
        this.A02 = i2 + 1;
        long j2 = j | ((((long) bArr2[i2]) & 255) << 8);
        byte[] bArr3 = this.A00;
        int i3 = this.A02;
        this.A02 = i3 + 1;
        long j3 = j2 | ((((long) bArr3[i3]) & 255) << 16);
        byte[] bArr4 = this.A00;
        int i4 = this.A02;
        this.A02 = i4 + 1;
        long j4 = j3 | ((((long) bArr4[i4]) & 255) << 24);
        byte[] bArr5 = this.A00;
        int i5 = this.A02;
        this.A02 = i5 + 1;
        long j5 = j4 | ((((long) bArr5[i5]) & 255) << 32);
        byte[] bArr6 = this.A00;
        int i6 = this.A02;
        this.A02 = i6 + 1;
        long j6 = j5 | ((((long) bArr6[i6]) & 255) << 40);
        byte[] bArr7 = this.A00;
        int i7 = this.A02;
        this.A02 = i7 + 1;
        long j7 = j6 | ((((long) bArr7[i7]) & 255) << 48);
        byte[] bArr8 = this.A00;
        int i8 = this.A02;
        this.A02 = i8 + 1;
        return j7 | ((255 & ((long) bArr8[i8])) << 56);
    }

    public final long A0K() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        long j = ((long) bArr[i]) & 255;
        byte[] bArr2 = this.A00;
        int i2 = this.A02;
        this.A02 = i2 + 1;
        long j2 = j | ((((long) bArr2[i2]) & 255) << 8);
        byte[] bArr3 = this.A00;
        int i3 = this.A02;
        this.A02 = i3 + 1;
        long j3 = j2 | ((((long) bArr3[i3]) & 255) << 16);
        byte[] bArr4 = this.A00;
        int i4 = this.A02;
        this.A02 = i4 + 1;
        return j3 | ((255 & ((long) bArr4[i4])) << 24);
    }

    public final long A0L() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        long j = (((long) bArr[i]) & 255) << 56;
        byte[] bArr2 = this.A00;
        int i2 = this.A02;
        this.A02 = i2 + 1;
        long j2 = j | ((((long) bArr2[i2]) & 255) << 48);
        byte[] bArr3 = this.A00;
        int i3 = this.A02;
        this.A02 = i3 + 1;
        long j3 = j2 | ((((long) bArr3[i3]) & 255) << 40);
        byte[] bArr4 = this.A00;
        int i4 = this.A02;
        this.A02 = i4 + 1;
        long j4 = j3 | ((((long) bArr4[i4]) & 255) << 32);
        byte[] bArr5 = this.A00;
        int i5 = this.A02;
        this.A02 = i5 + 1;
        long j5 = j4 | ((((long) bArr5[i5]) & 255) << 24);
        byte[] bArr6 = this.A00;
        int i6 = this.A02;
        this.A02 = i6 + 1;
        long j6 = j5 | ((((long) bArr6[i6]) & 255) << 16);
        byte[] bArr7 = this.A00;
        int i7 = this.A02;
        this.A02 = i7 + 1;
        long j7 = j6 | ((((long) bArr7[i7]) & 255) << 8);
        byte[] bArr8 = this.A00;
        int i8 = this.A02;
        this.A02 = i8 + 1;
        return j7 | (255 & ((long) bArr8[i8]));
    }

    public final long A0M() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        long j = (((long) bArr[i]) & 255) << 24;
        byte[] bArr2 = this.A00;
        int i2 = this.A02;
        this.A02 = i2 + 1;
        long j2 = j | ((((long) bArr2[i2]) & 255) << 16);
        byte[] bArr3 = this.A00;
        int i3 = this.A02;
        this.A02 = i3 + 1;
        long j3 = j2 | ((((long) bArr3[i3]) & 255) << 8);
        byte[] bArr4 = this.A00;
        int i4 = this.A02;
        this.A02 = i4 + 1;
        return j3 | (255 & ((long) bArr4[i4]));
    }

    public final long A0N() {
        long jA0L = A0L();
        if (jA0L >= 0) {
            return jA0L;
        }
        throw new java.lang.IllegalStateException(A00(77, 18, 70) + jA0L);
    }

    public final long A0O() {
        byte b;
        int i = 0;
        byte[] bArr = this.A00;
        int length = this.A02;
        long j = bArr[length];
        for (int i2 = 7; i2 >= 0; i2--) {
            int length2 = 1 << i2;
            long j2 = ((long) length2) & j;
            java.lang.String[] strArr = A04;
            java.lang.String str = strArr[3];
            java.lang.String str2 = strArr[0];
            int iCharAt = str.charAt(13);
            int length3 = str2.charAt(13);
            if (iCharAt == length3) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A04;
            strArr2[2] = "8vK315ay";
            strArr2[7] = "jAQDKlNg";
            if (j2 == 0) {
                if (i2 < 6) {
                    int length4 = 1 << i2;
                    j &= (long) (length4 - 1);
                    i = 7 - i2;
                    break;
                }
                if (i2 != 7) {
                    break;
                }
                i = 1;
                break;
            }
        }
        if (i != 0) {
            for (int x = 1; x < i; x++) {
                byte[] bArr2 = this.A00;
                if (A04[4].charAt(3) != 'S') {
                    A04[1] = "x";
                    int length5 = this.A02;
                    b = bArr2[length5 + x];
                    if ((b & 192) == 128) {
                        int length6 = b & okio.Utf8.REPLACEMENT_BYTE;
                        j = (j << 6) | ((long) length6);
                    } else {
                        throw new java.lang.NumberFormatException(A00(0, 42, 104) + j);
                    }
                } else {
                    A04[5] = "n5PcJgzDrPqbI2Nld6vWULHVZbuOfTZA";
                    int length7 = this.A02;
                    b = bArr2[length7 + x];
                    if ((b & 192) == 92) {
                        int length8 = b & okio.Utf8.REPLACEMENT_BYTE;
                        j = (j << 6) | ((long) length8);
                    } else {
                        throw new java.lang.NumberFormatException(A00(0, 42, 104) + j);
                    }
                }
            }
            int length9 = this.A02;
            this.A02 = length9 + i;
            return j;
        }
        throw new java.lang.NumberFormatException(A00(42, 35, 41) + j);
    }

    public final java.lang.String A0P() {
        if (A04() == 0) {
            return null;
        }
        int i = this.A02;
        while (i < lineLimit) {
            int lineLimit = this.A00[i];
            if (com.facebook.ads.redexgen.core.IK.A0d(lineLimit)) {
                break;
            }
            i++;
        }
        int lineLimit2 = this.A02;
        if (i - lineLimit2 >= 3) {
            byte[] bArr = this.A00;
            int lineLimit3 = this.A02;
            if (bArr[lineLimit3] == -17) {
                byte[] bArr2 = this.A00;
                int lineLimit4 = this.A02;
                if (bArr2[lineLimit4 + 1] == -69) {
                    byte[] bArr3 = this.A00;
                    int lineLimit5 = this.A02;
                    if (bArr3[lineLimit5 + 2] == -65) {
                        int lineLimit6 = this.A02;
                        this.A02 = lineLimit6 + 3;
                    }
                }
            }
        }
        byte[] bArr4 = this.A00;
        if (A04[6].length() == 17) {
            throw new java.lang.RuntimeException();
        }
        A04[5] = "0OPZ9wXiOG88J5thRDM8zE849EKoF2PW";
        int i2 = this.A02;
        int lineLimit7 = this.A02;
        java.lang.String strA0R = com.facebook.ads.redexgen.core.IK.A0R(bArr4, i2, i - lineLimit7);
        this.A02 = i;
        int i3 = this.A02;
        int lineLimit8 = this.A01;
        if (i3 == lineLimit8) {
            return strA0R;
        }
        byte[] bArr5 = this.A00;
        int lineLimit9 = this.A02;
        if (bArr5[lineLimit9] == 13) {
            int lineLimit10 = this.A02;
            this.A02 = lineLimit10 + 1;
            int i4 = this.A02;
            int lineLimit11 = this.A01;
            if (i4 == lineLimit11) {
                return strA0R;
            }
        }
        byte[] bArr6 = this.A00;
        int lineLimit12 = this.A02;
        if (bArr6[lineLimit12] == 10) {
            int lineLimit13 = this.A02;
            this.A02 = lineLimit13 + 1;
        }
        return strA0R;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0054  */
    public final java.lang.String A0Q() {
        if (A04() == 0) {
            return null;
        }
        int i = this.A02;
        while (true) {
            int i2 = this.A01;
            if (A04[4].charAt(3) == 'S') {
                throw new java.lang.RuntimeException();
            }
            A04[6] = "7q14VOks0nwB3sOQXz";
            if (i >= i2) {
                break;
            }
            int stringLimit = this.A00[i];
            if (stringLimit == 0) {
                break;
            }
            i++;
        }
        byte[] bArr = this.A00;
        int i3 = this.A02;
        int stringLimit2 = this.A02;
        java.lang.String strA0R = com.facebook.ads.redexgen.core.IK.A0R(bArr, i3, i - stringLimit2);
        this.A02 = i;
        int i4 = this.A02;
        if (A04[1].length() != 11) {
            A04[1] = "UHIahekmnsnG1d53o8blPpYvLvDdhHQg";
            int stringLimit3 = this.A01;
            if (i4 < stringLimit3) {
                int stringLimit4 = this.A02;
                this.A02 = stringLimit4 + 1;
            }
        } else {
            int stringLimit5 = this.A01;
            if (i4 < stringLimit5) {
                int stringLimit6 = this.A02;
                this.A02 = stringLimit6 + 1;
            }
        }
        return strA0R;
    }

    public final java.lang.String A0R(int i) {
        if (i == 0) {
            return A00(0, 0, 111);
        }
        int i2 = i;
        int stringLength = this.A02;
        int lastIndex = (stringLength + i) - 1;
        int stringLength2 = this.A01;
        if (lastIndex < stringLength2) {
            int stringLength3 = this.A00[lastIndex];
            if (stringLength3 == 0) {
                i2--;
            }
        }
        byte[] bArr = this.A00;
        int stringLength4 = this.A02;
        java.lang.String strA0R = com.facebook.ads.redexgen.core.IK.A0R(bArr, stringLength4, i2);
        int stringLength5 = this.A02;
        this.A02 = stringLength5 + i;
        return strA0R;
    }

    public final java.lang.String A0S(int i) {
        return A0T(i, java.nio.charset.Charset.forName(A00(95, 5, 57)));
    }

    public final java.lang.String A0T(int i, java.nio.charset.Charset charset) {
        java.lang.String str = new java.lang.String(this.A00, this.A02, i, charset);
        this.A02 += i;
        return str;
    }

    public final short A0U() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        int i2 = (bArr[i] & 255) << 8;
        byte[] bArr2 = this.A00;
        int i3 = this.A02;
        this.A02 = i3 + 1;
        return (short) (i2 | (bArr2[i3] & 255));
    }

    public final void A0V() {
        this.A02 = 0;
        this.A01 = 0;
    }

    public final void A0W(int i) {
        A0b(A05() < i ? new byte[i] : this.A00, i);
    }

    public final void A0X(int i) {
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A03(i >= 0 && i <= this.A00.length);
        this.A01 = i;
    }

    public final void A0Y(int i) {
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A03(i >= 0 && i <= this.A01);
        this.A02 = i;
    }

    public final void A0Z(int i) {
        A0Y(this.A02 + i);
    }

    public final void A0a(com.facebook.ads.redexgen.core.I3 i3, int i) {
        A0c(i3.A00, 0, i);
        i3.A07(0);
    }

    public final void A0b(byte[] bArr, int i) {
        this.A00 = bArr;
        this.A01 = i;
        this.A02 = 0;
    }

    public final void A0c(byte[] bArr, int i, int i2) {
        java.lang.System.arraycopy(this.A00, this.A02, bArr, i, i2);
        this.A02 += i2;
    }
}
