package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class CJ {
    public static byte[] A0h;
    public static java.lang.String[] A0i = {"TtyepP10CNsDag1URICwE6hIE7CqgYU9", "m8ww6qTIx4g60NbQo6OTNqNVzhOAuvGj", "EAp2sEiLSEmEtd7dtkgY6tYTWEtOHuPW", "eOcWKbTzXtUc2KG9ooLNDV4usHn8wMy9", "WdDLwdg0eIZ6Sa8QKK39no5JkIU2PsyL", "kXwzlIVv1vukuk2UNb3hZ115KjTj8NVB", "XVFUuuGJ", "RAwGWRZpRYUoK5XjDkWZ6kKzFPqgeuVP"};
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public float A08;
    public float A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public int A0G;
    public int A0H;
    public int A0I;
    public int A0J;
    public int A0K;
    public int A0L;
    public int A0M;
    public int A0N;
    public int A0O;
    public int A0P;
    public int A0Q;
    public int A0R;
    public long A0S;
    public long A0T;
    public com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData A0U;
    public com.facebook.ads.redexgen.core.C8 A0V;
    public com.facebook.ads.redexgen.core.C9 A0W;
    public com.facebook.ads.redexgen.core.CK A0X;
    public java.lang.String A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public byte[] A0d;
    public byte[] A0e;
    public byte[] A0f;
    public java.lang.String A0g;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static android.util.Pair<java.lang.String, java.util.List<byte[]>> A00(com.facebook.ads.redexgen.core.I4 i4) throws com.facebook.ads.redexgen.core.A0 {
        try {
            i4.A0Z(16);
            long jA0K = i4.A0K();
            if (jA0K == 1482049860) {
                return new android.util.Pair<>(A01(881, 10, 61), null);
            }
            if (jA0K != 826496599) {
                android.util.Log.w(A01(283, 17, 42), A01(419, 51, 51));
                return new android.util.Pair<>(A01(944, 15, 65), null);
            }
            byte[] bArr = i4.A00;
            for (int iA06 = i4.A06() + 20; iA06 < bArr.length - 4; iA06++) {
                if (bArr[iA06] == 0 && bArr[iA06 + 1] == 0 && bArr[iA06 + 2] == 1 && bArr[iA06 + 3] == 15) {
                    return new android.util.Pair<>(A01(934, 10, 121), java.util.Collections.singletonList(java.util.Arrays.copyOfRange(bArr, iA06, bArr.length)));
                }
            }
            throw new com.facebook.ads.redexgen.core.A0(A01(238, 45, 71));
        } catch (java.lang.ArrayIndexOutOfBoundsException unused) {
            throw new com.facebook.ads.redexgen.core.A0(A01(org.objectweb.asm.Opcodes.L2F, 33, 16));
        }
    }

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A0h, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 31);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A04() {
        A0h = new byte[]{58, 52, 71, 113, 96, 96, 125, 122, 115, 52, 121, 125, 121, 113, 64, 109, 100, 113, 52, 96, 123, 52, 83, 77, 83, 83, 81, 30, 0, 30, 28, 108, 126, 96, 123, 107, 108, 40, 54, 45, kotlin.io.encoding.Base64.padSymbol, 58, 70, 44, 49, 57, 59, 44, 58, 58, 19, 13, 22, 6, 1, 125, 30, 29, 1, 1, 30, 23, 1, 1, 25, 7, 29, 25, 27, 107, 45, 51, 42, 32, 45, 47, 0, 30, 12, 17, 4, 6, 110, 13, 115, 114, 108, 126, 99, 118, 116, 28, 127, 0, 45, 51, 33, okio.Utf8.REPLACEMENT_BYTE, 67, 45, 47, 33, 54, 40, 56, 39, 34, 36, 25, 7, 8, 27, 21, 119, 17, 22, 12, 119, 20, 17, 12, 75, 85, 94, 88, 95, 79, 66, 78, 116, 106, 99, 122, 103, 119, 124, 102, 74, 125, 125, 96, 125, 47, 127, 110, 125, 124, 102, 97, 104, 47, 73, 96, 122, 125, 76, 76, 47, 127, 125, 102, 121, 110, 123, 106, 47, 107, 110, 123, 110, 104, 95, 95, 66, 95, 13, 93, 76, 95, 94, 68, 67, 74, 13, 96, 126, 2, 108, 110, 96, 13, 78, 66, 73, 72, 78, 13, 93, 95, 68, 91, 76, 89, 72, 13, 58, 58, 39, 58, 104, 56, 41, 58, 59, 33, 38, 47, 104, 62, 39, 58, 42, 33, 59, 104, 43, 39, 44, 45, 43, 104, 56, 58, 33, 62, 41, 60, 45, 30, 57, 49, 52, kotlin.io.encoding.Base64.padSymbol, 60, 120, 44, 55, 120, 62, 49, 54, 60, 120, 30, 55, 45, 42, 27, 27, 120, 14, 27, 105, 120, 49, 54, 49, 44, 49, 57, 52, 49, 34, 57, 44, 49, 55, 54, 120, 60, 57, 44, 57, 120, 84, 65, 71, 90, 70, 94, 84, 112, 77, 65, 71, 84, 86, 65, 90, 71, 72, 105, 104, 43, 86, 69, 75, 38, 75, 85, 41, 71, 69, 75, 38, 111, 117, 38, 115, 104, 117, 115, 118, 118, 105, 116, 114, 99, 98, 40, 38, 85, 99, 114, 114, 111, 104, 97, 38, 107, 111, 107, 99, 82, 127, 118, 99, 38, 114, 105, 38, 102, 106, 113, 99, 119, 102, 96, 119, 90, 86, 65, 77, 68, 95, 38, 89, 78, 90, 17, 29, 22, 7, 26, 22, 109, 3, 17, 17, 123, 119, 124, 109, 112, 124, 7, 125, 124, 110, 16, 48, 60, 53, 44, 33, 48, 54, 33, 98, 89, 82, 79, 71, 82, 84, 67, 82, 83, 23, 122, 126, 122, 114, 23, 67, 78, 71, 82, 25, 121, 66, 71, 66, 67, 91, 66, 12, 106, 67, 89, 94, 111, 111, 2, 12, 127, 73, 88, 88, 69, 66, 75, 12, 65, 69, 65, 73, 120, 85, 92, 73, 12, 88, 67, 12, 90, 69, 72, 73, 67, 3, 84, 1, 89, 66, 71, 66, 67, 91, 66, 19, 40, 52, 35, 37, 41, 33, 40, 47, 60, 35, 34, 102, 37, 41, 34, 35, 37, 102, 47, 34, 35, 40, 50, 47, 32, 47, 35, 52, 104, 11, 48, 45, 43, 46, 46, 49, 44, 42, 59, 58, 126, 14, 29, 19, 126, 60, 55, 42, 126, 58, 59, 46, 42, 54, 100, 126, 9, 0, 18, 15, 26, 24, 109, 69, 76, 94, 67, 86, 84, 39, 60, 90, 64, 92, 60, 82, 67, 94, 87, 69, 88, 77, 79, 60, 39, 65, 91, 71, 39, 73, 91, 88, okio.Utf8.REPLACEMENT_BYTE, 54, 36, 57, 44, 46, 93, 70, 32, 58, 38, 70, 40, okio.Utf8.REPLACEMENT_BYTE, 42, 4, 13, 31, 2, 23, 21, 102, 125, 27, 1, 29, 125, 1, 2, 45, 36, 54, 43, 62, 60, 51, 84, 50, 40, 52, 84, 51, 62, 45, 56, 99, 106, 120, 102, 26, 99, 115, 98, 26, 115, 122, 96, 103, 118, 118, 72, 65, 74, 86, 91, 81, 76, 95, 119, 126, 119, 113, 25, 23, 30, 23, 17, 120, 37, 52, 52, 40, 45, 39, 37, 48, 45, 43, 42, 107, 32, 50, 38, 55, 49, 38, 55, 44, kotlin.io.encoding.Base64.padSymbol, kotlin.io.encoding.Base64.padSymbol, 33, 36, 46, 44, 57, 36, 34, 35, 98, kotlin.io.encoding.Base64.padSymbol, 42, 62, 50, 35, 35, okio.Utf8.REPLACEMENT_BYTE, 58, 48, 50, 39, 58, 60, kotlin.io.encoding.Base64.padSymbol, 124, 37, 60, 49, 32, 38, 49, 4, 21, 21, 9, 12, 6, 4, 17, 12, 10, 11, 74, 29, 72, 22, 16, 7, 23, 12, 21, 112, 100, 117, 120, 126, 62, 112, 114, 34, 120, 108, 125, 112, 118, 54, 124, 120, 122, 42, 85, 65, 80, 93, 91, 27, 82, 88, 85, 87, 44, 56, 41, 36, 34, 98, 32, kotlin.io.encoding.Base64.padSymbol, 121, 44, 96, 33, 44, 57, 32, 112, 100, 117, 120, 126, 62, 124, 97, 116, 118, 121, 109, 124, 113, 119, 55, 117, 104, 125, 127, 53, 84, 42, 114, 102, 119, 122, 124, 60, 124, 99, 102, 96, 10, 30, 15, 2, 4, 68, 25, 10, 28, 20, 0, 17, 28, 26, 90, 1, 7, 0, 16, 88, 29, 17, 92, 72, 89, 84, 82, 18, 75, 83, 89, 19, 89, 73, 78, 100, 112, 97, 108, 106, 42, 115, 107, 97, 43, 97, 113, 118, 43, 109, 97, 55, 35, 50, okio.Utf8.REPLACEMENT_BYTE, 57, 121, 32, 57, 36, 52, okio.Utf8.REPLACEMENT_BYTE, 37, 80, 68, 85, 88, 94, 30, 73, 28, 68, 95, 90, 95, 94, 70, 95, 91, 80, 89, 81, 64, 93, 81, 10, 93, 8, 86, 86, 68, 84, 75, 70, 71, 77, 13, 17, 69, 82, 82, 6, 25, 20, 21, 31, 95, 17, 6, 19, 86, 73, 68, 69, 79, 15, 72, 69, 86, 67, 59, 36, 41, 40, 34, 98, 32, kotlin.io.encoding.Base64.padSymbol, 121, 59, 96, 40, 62, 54, 41, 36, 37, 47, 111, 45, 48, 37, 39, 114, 16, 15, 2, 3, 9, 73, 17, 16, 5, 87, 40, 55, 58, 59, 49, 113, 38, 115, 43, 48, 53, 48, 49, 41, 48, 80, 79, 66, 67, 73, 9, 94, 11, 80, 72, 66, 8, 73, 72, 20, 8, 80, 86, 30, 87, 72, 69, 68, 78, 14, 89, 12, 87, 79, 69, 15, 78, 79, 19, 15, 87, 81, 24};
    }

    static {
        A04();
    }

    public CJ() {
        this.A0R = -1;
        this.A0J = -1;
        this.A0I = -1;
        this.A0G = -1;
        this.A0H = 0;
        this.A0e = null;
        this.A0P = -1;
        this.A0b = false;
        this.A0D = -1;
        this.A0E = -1;
        this.A0C = -1;
        this.A0K = 1000;
        this.A0L = 200;
        this.A06 = -1.0f;
        this.A07 = -1.0f;
        this.A04 = -1.0f;
        this.A05 = -1.0f;
        this.A02 = -1.0f;
        this.A03 = -1.0f;
        this.A08 = -1.0f;
        this.A09 = -1.0f;
        this.A00 = -1.0f;
        this.A01 = -1.0f;
        this.A0B = 1;
        this.A0A = -1;
        this.A0O = 8000;
        this.A0S = 0L;
        this.A0T = 0L;
        this.A0Z = true;
        this.A0g = A01(868, 3, 33);
    }

    public /* synthetic */ CJ(com.facebook.ads.redexgen.core.C1159Ye c1159Ye) {
        this();
    }

    public static java.util.List<byte[]> A03(byte[] bArr) throws com.facebook.ads.redexgen.core.A0 {
        java.lang.String strA01 = A01(204, 34, 87);
        try {
            if (bArr[0] == 2) {
                int vorbisInfoLength = 1;
                int i = 0;
                while (bArr[vorbisInfoLength] == -1) {
                    i += 255;
                    vorbisInfoLength++;
                }
                int i2 = vorbisInfoLength + 1;
                int i3 = i + bArr[vorbisInfoLength];
                int i4 = 0;
                while (bArr[i2] == -1) {
                    i4 += 255;
                    i2++;
                }
                int vorbisInfoLength2 = i2 + 1;
                int i5 = i4 + bArr[i2];
                if (bArr[vorbisInfoLength2] == 1) {
                    byte[] bArr2 = new byte[i3];
                    java.lang.System.arraycopy(bArr, vorbisInfoLength2, bArr2, 0, i3);
                    int vorbisInfoLength3 = vorbisInfoLength2 + i3;
                    if (bArr[vorbisInfoLength3] == 3) {
                        int vorbisInfoLength4 = vorbisInfoLength3 + i5;
                        if (bArr[vorbisInfoLength4] == 5) {
                            byte[] bArr3 = new byte[bArr.length - vorbisInfoLength4];
                            java.lang.System.arraycopy(bArr, vorbisInfoLength4, bArr3, 0, bArr.length - vorbisInfoLength4);
                            java.util.ArrayList arrayList = new java.util.ArrayList(2);
                            arrayList.add(bArr2);
                            arrayList.add(bArr3);
                            return arrayList;
                        }
                        throw new com.facebook.ads.redexgen.core.A0(strA01);
                    }
                    throw new com.facebook.ads.redexgen.core.A0(strA01);
                }
                throw new com.facebook.ads.redexgen.core.A0(strA01);
            }
            throw new com.facebook.ads.redexgen.core.A0(strA01);
        } catch (java.lang.ArrayIndexOutOfBoundsException unused) {
            throw new com.facebook.ads.redexgen.core.A0(strA01);
        }
    }

    public static boolean A05(com.facebook.ads.redexgen.core.I4 i4) throws com.facebook.ads.redexgen.core.A0 {
        try {
            int iA0C = i4.A0C();
            java.lang.String[] strArr = A0i;
            java.lang.String str = strArr[0];
            java.lang.String str2 = strArr[5];
            int iCharAt = str.charAt(30);
            int formatTag = str2.charAt(30);
            if (iCharAt != formatTag) {
                java.lang.String[] strArr2 = A0i;
                strArr2[7] = "btDGG2k1MNOxSWFdYkDb2MrpvBIB67jK";
                strArr2[4] = "0Z9O3kQM2sFmRQtnTHMrsNRouk3kcM83";
                if (iA0C == 1) {
                    return true;
                }
                if (iA0C != 65534) {
                    return false;
                }
                i4.A0Y(24);
                long jA0L = i4.A0L();
                long mostSignificantBits = com.facebook.ads.redexgen.core.C1157Yc.A0s.getMostSignificantBits();
                java.lang.String[] strArr3 = A0i;
                java.lang.String str3 = strArr3[0];
                java.lang.String str4 = strArr3[5];
                int iCharAt2 = str3.charAt(30);
                int formatTag2 = str4.charAt(30);
                if (iCharAt2 != formatTag2) {
                    java.lang.String[] strArr4 = A0i;
                    strArr4[1] = "OmasR49I6W1XHsGGoFrlmABzyAa3STQZ";
                    strArr4[3] = "9ywrsCPrxRDqLwPHooYmIZj10ZIoH4sJ";
                    return jA0L == mostSignificantBits && i4.A0L() == com.facebook.ads.redexgen.core.C1157Yc.A0s.getLeastSignificantBits();
                }
            }
            throw new java.lang.RuntimeException();
        } catch (java.lang.ArrayIndexOutOfBoundsException unused) {
            throw new com.facebook.ads.redexgen.core.A0(A01(org.objectweb.asm.Opcodes.TABLESWITCH, 34, 50));
        }
    }

    private byte[] A06() {
        if (this.A06 == -1.0f || this.A07 == -1.0f || this.A04 == -1.0f || this.A05 == -1.0f || this.A02 == -1.0f || this.A03 == -1.0f || this.A08 == -1.0f || this.A09 == -1.0f || this.A00 == -1.0f) {
            return null;
        }
        float f = this.A01;
        java.lang.String[] strArr = A0i;
        if (strArr[1].charAt(16) != strArr[3].charAt(16)) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A0i;
        strArr2[7] = "6JMDZWqFQp2EIdVNUQF4P86Hd3gy2V52";
        strArr2[4] = "MlPD9OYc6mBKgGsKjEpYXPYDnb0BkbFs";
        if (f == -1.0f) {
            return null;
        }
        byte[] bArr = new byte[25];
        java.nio.ByteBuffer hdrStaticInfo = java.nio.ByteBuffer.wrap(bArr);
        hdrStaticInfo.put((byte) 0);
        hdrStaticInfo.putShort((short) ((this.A06 * 50000.0f) + 0.5f));
        hdrStaticInfo.putShort((short) ((this.A07 * 50000.0f) + 0.5f));
        hdrStaticInfo.putShort((short) ((this.A04 * 50000.0f) + 0.5f));
        hdrStaticInfo.putShort((short) ((this.A05 * 50000.0f) + 0.5f));
        hdrStaticInfo.putShort((short) ((this.A02 * 50000.0f) + 0.5f));
        hdrStaticInfo.putShort((short) ((this.A03 * 50000.0f) + 0.5f));
        hdrStaticInfo.putShort((short) ((this.A08 * 50000.0f) + 0.5f));
        hdrStaticInfo.putShort((short) ((this.A09 * 50000.0f) + 0.5f));
        hdrStaticInfo.putShort((short) (this.A00 + 0.5f));
        hdrStaticInfo.putShort((short) (this.A01 + 0.5f));
        hdrStaticInfo.putShort((short) this.A0K);
        hdrStaticInfo.putShort((short) this.A0L);
        return bArr;
    }

    public final void A07() {
        if (this.A0X != null) {
            this.A0X.A02(this);
        }
    }

    public final void A08() {
        if (this.A0X != null) {
            this.A0X.A00();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:103:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:104:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:105:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:106:0x0304  */
    /* JADX WARN: Code duplicated, block: B:107:0x0310  */
    /* JADX WARN: Code duplicated, block: B:108:0x031c  */
    /* JADX WARN: Code duplicated, block: B:110:0x032e  */
    /* JADX WARN: Code duplicated, block: B:111:0x035a  */
    /* JADX WARN: Code duplicated, block: B:113:0x0371  */
    /* JADX WARN: Code duplicated, block: B:115:0x038b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:116:0x038d  */
    /* JADX WARN: Code duplicated, block: B:117:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:120:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:121:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:122:0x0404  */
    /* JADX WARN: Code duplicated, block: B:123:0x0410  */
    /* JADX WARN: Code duplicated, block: B:124:0x041c  */
    /* JADX WARN: Code duplicated, block: B:125:0x042f  */
    /* JADX WARN: Code duplicated, block: B:126:0x043a  */
    /* JADX WARN: Code duplicated, block: B:127:0x0446  */
    /* JADX WARN: Code duplicated, block: B:128:0x0454  */
    /* JADX WARN: Code duplicated, block: B:129:0x0461  */
    /* JADX WARN: Code duplicated, block: B:130:0x0473  */
    /* JADX WARN: Code duplicated, block: B:131:0x04bd  */
    /* JADX WARN: Code duplicated, block: B:132:0x04d1  */
    /* JADX WARN: Code duplicated, block: B:133:0x04dd  */
    /* JADX WARN: Code duplicated, block: B:134:0x04f1  */
    /* JADX WARN: Code duplicated, block: B:135:0x050d  */
    /* JADX WARN: Code duplicated, block: B:136:0x0529  */
    /* JADX WARN: Code duplicated, block: B:138:0x0537  */
    /* JADX WARN: Code duplicated, block: B:139:0x0539  */
    /* JADX WARN: Code duplicated, block: B:140:0x0540  */
    /* JADX WARN: Code duplicated, block: B:141:0x054b  */
    /* JADX WARN: Code duplicated, block: B:142:0x0556  */
    /* JADX WARN: Code duplicated, block: B:145:0x0568  */
    /* JADX WARN: Code duplicated, block: B:148:0x0570  */
    /* JADX WARN: Code duplicated, block: B:150:0x0593  */
    /* JADX WARN: Code duplicated, block: B:153:0x05ba  */
    /* JADX WARN: Code duplicated, block: B:154:0x05cb  */
    /* JADX WARN: Code duplicated, block: B:156:0x05d1  */
    /* JADX WARN: Code duplicated, block: B:158:0x05d6  */
    /* JADX WARN: Code duplicated, block: B:160:0x05da  */
    /* JADX WARN: Code duplicated, block: B:163:0x05e2  */
    /* JADX WARN: Code duplicated, block: B:167:0x05ec  */
    /* JADX WARN: Code duplicated, block: B:172:0x0602  */
    /* JADX WARN: Code duplicated, block: B:174:0x063b  */
    /* JADX WARN: Code duplicated, block: B:175:0x063e  */
    /* JADX WARN: Code duplicated, block: B:176:0x0641  */
    /* JADX WARN: Code duplicated, block: B:178:0x0651  */
    /* JADX WARN: Code duplicated, block: B:179:0x0660  */
    /* JADX WARN: Code duplicated, block: B:181:0x0670  */
    /* JADX WARN: Code duplicated, block: B:182:0x069e  */
    /* JADX WARN: Code duplicated, block: B:184:0x06ae  */
    /* JADX WARN: Code duplicated, block: B:4:0x0018  */
    /* JADX WARN: Code duplicated, block: B:7:0x0039  */
    /* JADX WARN: Code duplicated, block: B:96:0x0297  */
    public final void A09(com.facebook.ads.redexgen.core.InterfaceC0611Bz interfaceC0611Bz, int i) throws com.facebook.ads.redexgen.core.A0 {
        byte b;
        java.lang.String strA01;
        java.lang.String strA02;
        java.lang.String strA03;
        java.lang.String strA04;
        java.lang.String[] strArr;
        int i2;
        int i3;
        com.facebook.ads.internal.exoplayer2.thirdparty.Format formatA0A;
        float f;
        com.facebook.ads.internal.exoplayer2.thirdparty.video.ColorInfo colorInfo;
        int i4;
        int i5;
        java.lang.String string;
        int i6;
        int i7;
        com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData drmInitData;
        java.lang.String str;
        java.lang.String[] strArr2;
        int i8 = -1;
        int iA02 = -1;
        java.util.List listSingletonList = null;
        java.lang.String str2 = this.A0Y;
        switch (str2.hashCode()) {
            case -2095576542:
                if (str2.equals(A01(534, 14, 12))) {
                    b = 5;
                } else {
                    b = -1;
                }
                strA01 = A01(0, 22, 11);
                strA02 = A01(500, 27, 65);
                strA03 = A01(283, 17, 42);
                switch (b) {
                    case 0:
                        strA04 = A01(959, 19, 57);
                        break;
                    case 1:
                        strA04 = A01(978, 19, 62);
                        break;
                    case 2:
                        strA04 = A01(923, 11, 95);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        strA04 = A01(910, 13, 82);
                        if (this.A0d == null) {
                            listSingletonList = java.util.Collections.singletonList(this.A0d);
                        } else {
                            listSingletonList = null;
                        }
                        break;
                    case 6:
                        strA04 = A01(891, 9, 111);
                        com.facebook.ads.redexgen.core.IM imA00 = com.facebook.ads.redexgen.core.IM.A00(new com.facebook.ads.redexgen.core.I4(this.A0d));
                        listSingletonList = imA00.A04;
                        this.A0M = imA00.A02;
                        break;
                    case 7:
                        strA04 = A01(900, 10, 63);
                        com.facebook.ads.redexgen.core.IS isA00 = com.facebook.ads.redexgen.core.IS.A00(new com.facebook.ads.redexgen.core.I4(this.A0d));
                        listSingletonList = isA00.A01;
                        this.A0M = isA00.A00;
                        break;
                    case 8:
                        android.util.Pair<java.lang.String, java.util.List<byte[]>> pairA00 = A00(new com.facebook.ads.redexgen.core.I4(this.A0d));
                        strA04 = (java.lang.String) pairA00.first;
                        listSingletonList = (java.util.List) pairA00.second;
                        break;
                    case 9:
                        strA04 = A01(944, 15, 65);
                        break;
                    case 10:
                        strA04 = A01(841, 12, 73);
                        i8 = 8192;
                        listSingletonList = A03(this.A0d);
                        break;
                    case 11:
                        strA04 = A01(780, 10, 12);
                        i8 = 5760;
                        listSingletonList = new java.util.ArrayList(3);
                        listSingletonList.add(this.A0d);
                        listSingletonList.add(java.nio.ByteBuffer.allocate(8).order(java.nio.ByteOrder.nativeOrder()).putLong(this.A0S).array());
                        listSingletonList.add(java.nio.ByteBuffer.allocate(8).order(java.nio.ByteOrder.nativeOrder()).putLong(this.A0T).array());
                        break;
                    case 12:
                        strA04 = A01(742, 15, 82);
                        listSingletonList = java.util.Collections.singletonList(this.A0d);
                        break;
                    case 13:
                        strA04 = A01(767, 13, 7);
                        i8 = 4096;
                        break;
                    case 14:
                        strA04 = A01(757, 10, 14);
                        i8 = 4096;
                        break;
                    case 15:
                        strA04 = A01(713, 9, 14);
                        break;
                    case 16:
                        strA04 = A01(722, 10, 6);
                        break;
                    case 17:
                        strA04 = A01(799, 13, 106);
                        this.A0X = new com.facebook.ads.redexgen.core.CK();
                        break;
                    case 18:
                    case 19:
                        strA04 = A01(812, 13, 34);
                        break;
                    case 20:
                        strA04 = A01(825, 16, 26);
                        break;
                    case 21:
                        strA04 = A01(732, 10, 43);
                        listSingletonList = java.util.Collections.singletonList(this.A0d);
                        break;
                    case 22:
                        strA04 = A01(790, 9, 116);
                        if (A05(new com.facebook.ads.redexgen.core.I4(this.A0d))) {
                            iA02 = com.facebook.ads.redexgen.core.IK.A02(this.A0A);
                            strArr = A0i;
                            if (strArr[1].charAt(16) != strArr[3].charAt(16)) {
                                if (iA02 == 0) {
                                    iA02 = -1;
                                    strA04 = A01(853, 15, 46);
                                    android.util.Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                                }
                            } else {
                                java.lang.String[] strArr3 = A0i;
                                strArr3[1] = "UnFAd4XuJDxSuzaFoeREgVc6Qs0OmmYm";
                                strArr3[3] = "dBM5Episk82aAApxomIpqdyXT7zAdwmF";
                                if (iA02 == 0) {
                                    iA02 = -1;
                                    strA04 = A01(853, 15, 46);
                                    android.util.Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                                }
                            }
                        } else {
                            strA04 = A01(853, 15, 46);
                            android.util.Log.w(strA03, A01(com.google.android.gms.nearby.messages.Strategy.TTL_SECONDS_DEFAULT, 51, 25) + strA04);
                        }
                        break;
                    case 23:
                        strA04 = A01(790, 9, 116);
                        iA02 = com.facebook.ads.redexgen.core.IK.A02(this.A0A);
                        if (iA02 == 0) {
                            iA02 = -1;
                            strA04 = A01(853, 15, 46);
                            android.util.Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                        }
                        break;
                    case 24:
                        strA04 = A01(693, 20, 122);
                        break;
                    case 25:
                        strA04 = A01(871, 10, 58);
                        break;
                    case 26:
                        strA04 = A01(675, 18, 76);
                        listSingletonList = java.util.Collections.singletonList(this.A0d);
                        break;
                    case 27:
                        strA04 = A01(660, 15, 82);
                        break;
                    case 28:
                        strA04 = A01(641, 19, 91);
                        listSingletonList = java.util.Collections.singletonList(new byte[]{this.A0d[0], this.A0d[1], this.A0d[2], this.A0d[3]});
                        break;
                    default:
                        throw new com.facebook.ads.redexgen.core.A0(A01(470, 30, 89));
                }
                i2 = 0 | (this.A0Z ? 1 : 0) | (this.A0a ? 2 : 0);
                if (com.facebook.ads.redexgen.core.AbstractC0748Hx.A09(strA04)) {
                    i3 = 1;
                    string = java.lang.Integer.toString(i);
                    i6 = this.A0B;
                    i7 = this.A0O;
                    drmInitData = this.A0U;
                    str = this.A0g;
                    strArr2 = A0i;
                    if (strArr2[0].charAt(30) != strArr2[5].charAt(30)) {
                        A0i[2] = "ixQpJ1YMOGXZaJaexLrRt7cPJpDFAOI0";
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A06(string, strA04, null, -1, i8, i6, i7, iA02, listSingletonList, drmInitData, i2, str);
                    } else {
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A06(string, strA04, null, -1, i8, i6, i7, iA02, listSingletonList, drmInitData, i2, str);
                    }
                } else if (com.facebook.ads.redexgen.core.AbstractC0748Hx.A0B(strA04)) {
                    i3 = 2;
                    if (this.A0H == 0) {
                        if (this.A0I == -1) {
                            i4 = this.A0R;
                        } else {
                            i4 = this.A0I;
                        }
                        this.A0I = i4;
                        if (this.A0G == -1) {
                            i5 = this.A0J;
                        } else {
                            i5 = this.A0G;
                        }
                        this.A0G = i5;
                    }
                    f = -1.0f;
                    if (this.A0I != -1 && this.A0G != -1) {
                        f = (this.A0J * this.A0I) / (this.A0R * this.A0G);
                    }
                    colorInfo = null;
                    if (this.A0b) {
                        colorInfo = new com.facebook.ads.internal.exoplayer2.thirdparty.video.ColorInfo(this.A0D, this.A0C, this.A0E, A06());
                    }
                    formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A04(java.lang.Integer.toString(i), strA04, null, -1, i8, this.A0R, this.A0J, -1.0f, listSingletonList, -1, f, this.A0e, this.A0P, colorInfo, this.A0U);
                } else if (A01(693, 20, 122).equals(strA04)) {
                    i3 = 3;
                    formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A01(java.lang.Integer.toString(i), strA04, i2, this.A0g, this.A0U);
                } else if (A01(871, 10, 58).equals(strA04)) {
                    i3 = 3;
                    java.util.ArrayList arrayList = new java.util.ArrayList(2);
                    arrayList.add(com.facebook.ads.redexgen.core.C1157Yc.A0t);
                    arrayList.add(this.A0d);
                    formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A09(java.lang.Integer.toString(i), strA04, null, -1, i2, this.A0g, -1, this.A0U, Long.MAX_VALUE, arrayList);
                } else if (!A01(675, 18, 76).equals(strA04) || A01(660, 15, 82).equals(strA04) || A01(641, 19, 91).equals(strA04)) {
                    i3 = 3;
                    formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A0A(java.lang.Integer.toString(i), strA04, null, -1, i2, listSingletonList, this.A0g, this.A0U);
                } else {
                    throw new com.facebook.ads.redexgen.core.A0(A01(398, 21, 40));
                }
                this.A0W = interfaceC0611Bz.AHA(this.A0N, i3);
                this.A0W.A69(formatA0A);
                return;
            case -2095575984:
                java.lang.String[] strArr4 = A0i;
                if (strArr4[0].charAt(30) != strArr4[5].charAt(30)) {
                    java.lang.String[] strArr5 = A0i;
                    strArr5[0] = "Vajwe03lbxxx2ng8AG7OuN2rjB5kZysw";
                    strArr5[5] = "mCERz4eYFsTt6vkMjwDAmNqaypoTpKnR";
                    if (str2.equals(A01(578, 14, 77))) {
                        b = 3;
                    } else {
                        b = -1;
                    }
                } else if (str2.equals(A01(578, 14, 77))) {
                    b = 3;
                } else {
                    b = -1;
                }
                strA01 = A01(0, 22, 11);
                strA02 = A01(500, 27, 65);
                strA03 = A01(283, 17, 42);
                switch (b) {
                    case 0:
                        strA04 = A01(959, 19, 57);
                        break;
                    case 1:
                        strA04 = A01(978, 19, 62);
                        break;
                    case 2:
                        strA04 = A01(923, 11, 95);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        strA04 = A01(910, 13, 82);
                        if (this.A0d == null) {
                            listSingletonList = java.util.Collections.singletonList(this.A0d);
                        } else {
                            listSingletonList = null;
                        }
                        break;
                    case 6:
                        strA04 = A01(891, 9, 111);
                        com.facebook.ads.redexgen.core.IM imA01 = com.facebook.ads.redexgen.core.IM.A00(new com.facebook.ads.redexgen.core.I4(this.A0d));
                        listSingletonList = imA01.A04;
                        this.A0M = imA01.A02;
                        break;
                    case 7:
                        strA04 = A01(900, 10, 63);
                        com.facebook.ads.redexgen.core.IS isA01 = com.facebook.ads.redexgen.core.IS.A00(new com.facebook.ads.redexgen.core.I4(this.A0d));
                        listSingletonList = isA01.A01;
                        this.A0M = isA01.A00;
                        break;
                    case 8:
                        android.util.Pair<java.lang.String, java.util.List<byte[]>> pairA01 = A00(new com.facebook.ads.redexgen.core.I4(this.A0d));
                        strA04 = (java.lang.String) pairA01.first;
                        listSingletonList = (java.util.List) pairA01.second;
                        break;
                    case 9:
                        strA04 = A01(944, 15, 65);
                        break;
                    case 10:
                        strA04 = A01(841, 12, 73);
                        i8 = 8192;
                        listSingletonList = A03(this.A0d);
                        break;
                    case 11:
                        strA04 = A01(780, 10, 12);
                        i8 = 5760;
                        listSingletonList = new java.util.ArrayList(3);
                        listSingletonList.add(this.A0d);
                        listSingletonList.add(java.nio.ByteBuffer.allocate(8).order(java.nio.ByteOrder.nativeOrder()).putLong(this.A0S).array());
                        listSingletonList.add(java.nio.ByteBuffer.allocate(8).order(java.nio.ByteOrder.nativeOrder()).putLong(this.A0T).array());
                        break;
                    case 12:
                        strA04 = A01(742, 15, 82);
                        listSingletonList = java.util.Collections.singletonList(this.A0d);
                        break;
                    case 13:
                        strA04 = A01(767, 13, 7);
                        i8 = 4096;
                        break;
                    case 14:
                        strA04 = A01(757, 10, 14);
                        i8 = 4096;
                        break;
                    case 15:
                        strA04 = A01(713, 9, 14);
                        break;
                    case 16:
                        strA04 = A01(722, 10, 6);
                        break;
                    case 17:
                        strA04 = A01(799, 13, 106);
                        this.A0X = new com.facebook.ads.redexgen.core.CK();
                        break;
                    case 18:
                    case 19:
                        strA04 = A01(812, 13, 34);
                        break;
                    case 20:
                        strA04 = A01(825, 16, 26);
                        break;
                    case 21:
                        strA04 = A01(732, 10, 43);
                        listSingletonList = java.util.Collections.singletonList(this.A0d);
                        break;
                    case 22:
                        strA04 = A01(790, 9, 116);
                        if (A05(new com.facebook.ads.redexgen.core.I4(this.A0d))) {
                            iA02 = com.facebook.ads.redexgen.core.IK.A02(this.A0A);
                            strArr = A0i;
                            if (strArr[1].charAt(16) != strArr[3].charAt(16)) {
                                if (iA02 == 0) {
                                    iA02 = -1;
                                    strA04 = A01(853, 15, 46);
                                    android.util.Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                                }
                            } else {
                                java.lang.String[] strArr6 = A0i;
                                strArr6[1] = "UnFAd4XuJDxSuzaFoeREgVc6Qs0OmmYm";
                                strArr6[3] = "dBM5Episk82aAApxomIpqdyXT7zAdwmF";
                                if (iA02 == 0) {
                                    iA02 = -1;
                                    strA04 = A01(853, 15, 46);
                                    android.util.Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                                }
                            }
                        } else {
                            strA04 = A01(853, 15, 46);
                            android.util.Log.w(strA03, A01(com.google.android.gms.nearby.messages.Strategy.TTL_SECONDS_DEFAULT, 51, 25) + strA04);
                        }
                        break;
                    case 23:
                        strA04 = A01(790, 9, 116);
                        iA02 = com.facebook.ads.redexgen.core.IK.A02(this.A0A);
                        if (iA02 == 0) {
                            iA02 = -1;
                            strA04 = A01(853, 15, 46);
                            android.util.Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                        }
                        break;
                    case 24:
                        strA04 = A01(693, 20, 122);
                        break;
                    case 25:
                        strA04 = A01(871, 10, 58);
                        break;
                    case 26:
                        strA04 = A01(675, 18, 76);
                        listSingletonList = java.util.Collections.singletonList(this.A0d);
                        break;
                    case 27:
                        strA04 = A01(660, 15, 82);
                        break;
                    case 28:
                        strA04 = A01(641, 19, 91);
                        listSingletonList = java.util.Collections.singletonList(new byte[]{this.A0d[0], this.A0d[1], this.A0d[2], this.A0d[3]});
                        break;
                    default:
                        throw new com.facebook.ads.redexgen.core.A0(A01(470, 30, 89));
                }
                i2 = 0 | (this.A0Z ? 1 : 0) | (this.A0a ? 2 : 0);
                if (com.facebook.ads.redexgen.core.AbstractC0748Hx.A09(strA04)) {
                    i3 = 1;
                    string = java.lang.Integer.toString(i);
                    i6 = this.A0B;
                    i7 = this.A0O;
                    drmInitData = this.A0U;
                    str = this.A0g;
                    strArr2 = A0i;
                    if (strArr2[0].charAt(30) != strArr2[5].charAt(30)) {
                        A0i[2] = "ixQpJ1YMOGXZaJaexLrRt7cPJpDFAOI0";
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A06(string, strA04, null, -1, i8, i6, i7, iA02, listSingletonList, drmInitData, i2, str);
                    } else {
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A06(string, strA04, null, -1, i8, i6, i7, iA02, listSingletonList, drmInitData, i2, str);
                    }
                } else {
                    if (com.facebook.ads.redexgen.core.AbstractC0748Hx.A0B(strA04)) {
                        i3 = 2;
                        if (this.A0H == 0) {
                            if (this.A0I == -1) {
                                i4 = this.A0R;
                            } else {
                                i4 = this.A0I;
                            }
                            this.A0I = i4;
                            if (this.A0G == -1) {
                                i5 = this.A0J;
                            } else {
                                i5 = this.A0G;
                            }
                            this.A0G = i5;
                        }
                        f = -1.0f;
                        if (this.A0I != -1) {
                            f = (this.A0J * this.A0I) / (this.A0R * this.A0G);
                        }
                        colorInfo = null;
                        if (this.A0b) {
                            colorInfo = new com.facebook.ads.internal.exoplayer2.thirdparty.video.ColorInfo(this.A0D, this.A0C, this.A0E, A06());
                        }
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A04(java.lang.Integer.toString(i), strA04, null, -1, i8, this.A0R, this.A0J, -1.0f, listSingletonList, -1, f, this.A0e, this.A0P, colorInfo, this.A0U);
                    } else if (A01(693, 20, 122).equals(strA04)) {
                        i3 = 3;
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A01(java.lang.Integer.toString(i), strA04, i2, this.A0g, this.A0U);
                    } else if (A01(871, 10, 58).equals(strA04)) {
                        i3 = 3;
                        java.util.ArrayList arrayList2 = new java.util.ArrayList(2);
                        arrayList2.add(com.facebook.ads.redexgen.core.C1157Yc.A0t);
                        arrayList2.add(this.A0d);
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A09(java.lang.Integer.toString(i), strA04, null, -1, i2, this.A0g, -1, this.A0U, Long.MAX_VALUE, arrayList2);
                    } else {
                        if (!A01(675, 18, 76).equals(strA04)) {
                        }
                        i3 = 3;
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A0A(java.lang.Integer.toString(i), strA04, null, -1, i2, listSingletonList, this.A0g, this.A0U);
                    }
                    break;
                }
                this.A0W = interfaceC0611Bz.AHA(this.A0N, i3);
                this.A0W.A69(formatA0A);
                return;
            case -1985379776:
                if (str2.equals(A01(94, 8, 115))) {
                    b = 22;
                } else {
                    b = -1;
                }
                strA01 = A01(0, 22, 11);
                strA02 = A01(500, 27, 65);
                strA03 = A01(283, 17, 42);
                switch (b) {
                    case 0:
                        strA04 = A01(959, 19, 57);
                        break;
                    case 1:
                        strA04 = A01(978, 19, 62);
                        break;
                    case 2:
                        strA04 = A01(923, 11, 95);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        strA04 = A01(910, 13, 82);
                        if (this.A0d == null) {
                            listSingletonList = java.util.Collections.singletonList(this.A0d);
                        } else {
                            listSingletonList = null;
                        }
                        break;
                    case 6:
                        strA04 = A01(891, 9, 111);
                        com.facebook.ads.redexgen.core.IM imA02 = com.facebook.ads.redexgen.core.IM.A00(new com.facebook.ads.redexgen.core.I4(this.A0d));
                        listSingletonList = imA02.A04;
                        this.A0M = imA02.A02;
                        break;
                    case 7:
                        strA04 = A01(900, 10, 63);
                        com.facebook.ads.redexgen.core.IS isA02 = com.facebook.ads.redexgen.core.IS.A00(new com.facebook.ads.redexgen.core.I4(this.A0d));
                        listSingletonList = isA02.A01;
                        this.A0M = isA02.A00;
                        break;
                    case 8:
                        android.util.Pair<java.lang.String, java.util.List<byte[]>> pairA02 = A00(new com.facebook.ads.redexgen.core.I4(this.A0d));
                        strA04 = (java.lang.String) pairA02.first;
                        listSingletonList = (java.util.List) pairA02.second;
                        break;
                    case 9:
                        strA04 = A01(944, 15, 65);
                        break;
                    case 10:
                        strA04 = A01(841, 12, 73);
                        i8 = 8192;
                        listSingletonList = A03(this.A0d);
                        break;
                    case 11:
                        strA04 = A01(780, 10, 12);
                        i8 = 5760;
                        listSingletonList = new java.util.ArrayList(3);
                        listSingletonList.add(this.A0d);
                        listSingletonList.add(java.nio.ByteBuffer.allocate(8).order(java.nio.ByteOrder.nativeOrder()).putLong(this.A0S).array());
                        listSingletonList.add(java.nio.ByteBuffer.allocate(8).order(java.nio.ByteOrder.nativeOrder()).putLong(this.A0T).array());
                        break;
                    case 12:
                        strA04 = A01(742, 15, 82);
                        listSingletonList = java.util.Collections.singletonList(this.A0d);
                        break;
                    case 13:
                        strA04 = A01(767, 13, 7);
                        i8 = 4096;
                        break;
                    case 14:
                        strA04 = A01(757, 10, 14);
                        i8 = 4096;
                        break;
                    case 15:
                        strA04 = A01(713, 9, 14);
                        break;
                    case 16:
                        strA04 = A01(722, 10, 6);
                        break;
                    case 17:
                        strA04 = A01(799, 13, 106);
                        this.A0X = new com.facebook.ads.redexgen.core.CK();
                        break;
                    case 18:
                    case 19:
                        strA04 = A01(812, 13, 34);
                        break;
                    case 20:
                        strA04 = A01(825, 16, 26);
                        break;
                    case 21:
                        strA04 = A01(732, 10, 43);
                        listSingletonList = java.util.Collections.singletonList(this.A0d);
                        break;
                    case 22:
                        strA04 = A01(790, 9, 116);
                        if (A05(new com.facebook.ads.redexgen.core.I4(this.A0d))) {
                            iA02 = com.facebook.ads.redexgen.core.IK.A02(this.A0A);
                            strArr = A0i;
                            if (strArr[1].charAt(16) != strArr[3].charAt(16)) {
                                if (iA02 == 0) {
                                    iA02 = -1;
                                    strA04 = A01(853, 15, 46);
                                    android.util.Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                                }
                            } else {
                                java.lang.String[] strArr7 = A0i;
                                strArr7[1] = "UnFAd4XuJDxSuzaFoeREgVc6Qs0OmmYm";
                                strArr7[3] = "dBM5Episk82aAApxomIpqdyXT7zAdwmF";
                                if (iA02 == 0) {
                                    iA02 = -1;
                                    strA04 = A01(853, 15, 46);
                                    android.util.Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                                }
                            }
                        } else {
                            strA04 = A01(853, 15, 46);
                            android.util.Log.w(strA03, A01(com.google.android.gms.nearby.messages.Strategy.TTL_SECONDS_DEFAULT, 51, 25) + strA04);
                        }
                        break;
                    case 23:
                        strA04 = A01(790, 9, 116);
                        iA02 = com.facebook.ads.redexgen.core.IK.A02(this.A0A);
                        if (iA02 == 0) {
                            iA02 = -1;
                            strA04 = A01(853, 15, 46);
                            android.util.Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                        }
                        break;
                    case 24:
                        strA04 = A01(693, 20, 122);
                        break;
                    case 25:
                        strA04 = A01(871, 10, 58);
                        break;
                    case 26:
                        strA04 = A01(675, 18, 76);
                        listSingletonList = java.util.Collections.singletonList(this.A0d);
                        break;
                    case 27:
                        strA04 = A01(660, 15, 82);
                        break;
                    case 28:
                        strA04 = A01(641, 19, 91);
                        listSingletonList = java.util.Collections.singletonList(new byte[]{this.A0d[0], this.A0d[1], this.A0d[2], this.A0d[3]});
                        break;
                    default:
                        throw new com.facebook.ads.redexgen.core.A0(A01(470, 30, 89));
                }
                i2 = 0 | (this.A0Z ? 1 : 0) | (this.A0a ? 2 : 0);
                if (com.facebook.ads.redexgen.core.AbstractC0748Hx.A09(strA04)) {
                    i3 = 1;
                    string = java.lang.Integer.toString(i);
                    i6 = this.A0B;
                    i7 = this.A0O;
                    drmInitData = this.A0U;
                    str = this.A0g;
                    strArr2 = A0i;
                    if (strArr2[0].charAt(30) != strArr2[5].charAt(30)) {
                        A0i[2] = "ixQpJ1YMOGXZaJaexLrRt7cPJpDFAOI0";
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A06(string, strA04, null, -1, i8, i6, i7, iA02, listSingletonList, drmInitData, i2, str);
                    } else {
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A06(string, strA04, null, -1, i8, i6, i7, iA02, listSingletonList, drmInitData, i2, str);
                    }
                } else {
                    if (com.facebook.ads.redexgen.core.AbstractC0748Hx.A0B(strA04)) {
                        i3 = 2;
                        if (this.A0H == 0) {
                            if (this.A0I == -1) {
                                i4 = this.A0R;
                            } else {
                                i4 = this.A0I;
                            }
                            this.A0I = i4;
                            if (this.A0G == -1) {
                                i5 = this.A0J;
                            } else {
                                i5 = this.A0G;
                            }
                            this.A0G = i5;
                        }
                        f = -1.0f;
                        if (this.A0I != -1) {
                            f = (this.A0J * this.A0I) / (this.A0R * this.A0G);
                        }
                        colorInfo = null;
                        if (this.A0b) {
                            colorInfo = new com.facebook.ads.internal.exoplayer2.thirdparty.video.ColorInfo(this.A0D, this.A0C, this.A0E, A06());
                        }
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A04(java.lang.Integer.toString(i), strA04, null, -1, i8, this.A0R, this.A0J, -1.0f, listSingletonList, -1, f, this.A0e, this.A0P, colorInfo, this.A0U);
                    } else if (A01(693, 20, 122).equals(strA04)) {
                        i3 = 3;
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A01(java.lang.Integer.toString(i), strA04, i2, this.A0g, this.A0U);
                    } else if (A01(871, 10, 58).equals(strA04)) {
                        i3 = 3;
                        java.util.ArrayList arrayList3 = new java.util.ArrayList(2);
                        arrayList3.add(com.facebook.ads.redexgen.core.C1157Yc.A0t);
                        arrayList3.add(this.A0d);
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A09(java.lang.Integer.toString(i), strA04, null, -1, i2, this.A0g, -1, this.A0U, Long.MAX_VALUE, arrayList3);
                    } else {
                        if (!A01(675, 18, 76).equals(strA04)) {
                        }
                        i3 = 3;
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A0A(java.lang.Integer.toString(i), strA04, null, -1, i2, listSingletonList, this.A0g, this.A0U);
                    }
                    break;
                }
                this.A0W = interfaceC0611Bz.AHA(this.A0N, i3);
                this.A0W.A69(formatA0A);
                return;
            case -1784763192:
                if (str2.equals(A01(121, 8, 21))) {
                    b = 17;
                } else {
                    b = -1;
                }
                strA01 = A01(0, 22, 11);
                strA02 = A01(500, 27, 65);
                strA03 = A01(283, 17, 42);
                switch (b) {
                    case 0:
                        strA04 = A01(959, 19, 57);
                        break;
                    case 1:
                        strA04 = A01(978, 19, 62);
                        break;
                    case 2:
                        strA04 = A01(923, 11, 95);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        strA04 = A01(910, 13, 82);
                        if (this.A0d == null) {
                            listSingletonList = java.util.Collections.singletonList(this.A0d);
                        } else {
                            listSingletonList = null;
                        }
                        break;
                    case 6:
                        strA04 = A01(891, 9, 111);
                        com.facebook.ads.redexgen.core.IM imA03 = com.facebook.ads.redexgen.core.IM.A00(new com.facebook.ads.redexgen.core.I4(this.A0d));
                        listSingletonList = imA03.A04;
                        this.A0M = imA03.A02;
                        break;
                    case 7:
                        strA04 = A01(900, 10, 63);
                        com.facebook.ads.redexgen.core.IS isA03 = com.facebook.ads.redexgen.core.IS.A00(new com.facebook.ads.redexgen.core.I4(this.A0d));
                        listSingletonList = isA03.A01;
                        this.A0M = isA03.A00;
                        break;
                    case 8:
                        android.util.Pair<java.lang.String, java.util.List<byte[]>> pairA03 = A00(new com.facebook.ads.redexgen.core.I4(this.A0d));
                        strA04 = (java.lang.String) pairA03.first;
                        listSingletonList = (java.util.List) pairA03.second;
                        break;
                    case 9:
                        strA04 = A01(944, 15, 65);
                        break;
                    case 10:
                        strA04 = A01(841, 12, 73);
                        i8 = 8192;
                        listSingletonList = A03(this.A0d);
                        break;
                    case 11:
                        strA04 = A01(780, 10, 12);
                        i8 = 5760;
                        listSingletonList = new java.util.ArrayList(3);
                        listSingletonList.add(this.A0d);
                        listSingletonList.add(java.nio.ByteBuffer.allocate(8).order(java.nio.ByteOrder.nativeOrder()).putLong(this.A0S).array());
                        listSingletonList.add(java.nio.ByteBuffer.allocate(8).order(java.nio.ByteOrder.nativeOrder()).putLong(this.A0T).array());
                        break;
                    case 12:
                        strA04 = A01(742, 15, 82);
                        listSingletonList = java.util.Collections.singletonList(this.A0d);
                        break;
                    case 13:
                        strA04 = A01(767, 13, 7);
                        i8 = 4096;
                        break;
                    case 14:
                        strA04 = A01(757, 10, 14);
                        i8 = 4096;
                        break;
                    case 15:
                        strA04 = A01(713, 9, 14);
                        break;
                    case 16:
                        strA04 = A01(722, 10, 6);
                        break;
                    case 17:
                        strA04 = A01(799, 13, 106);
                        this.A0X = new com.facebook.ads.redexgen.core.CK();
                        break;
                    case 18:
                    case 19:
                        strA04 = A01(812, 13, 34);
                        break;
                    case 20:
                        strA04 = A01(825, 16, 26);
                        break;
                    case 21:
                        strA04 = A01(732, 10, 43);
                        listSingletonList = java.util.Collections.singletonList(this.A0d);
                        break;
                    case 22:
                        strA04 = A01(790, 9, 116);
                        if (A05(new com.facebook.ads.redexgen.core.I4(this.A0d))) {
                            iA02 = com.facebook.ads.redexgen.core.IK.A02(this.A0A);
                            strArr = A0i;
                            if (strArr[1].charAt(16) != strArr[3].charAt(16)) {
                                if (iA02 == 0) {
                                    iA02 = -1;
                                    strA04 = A01(853, 15, 46);
                                    android.util.Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                                }
                            } else {
                                java.lang.String[] strArr8 = A0i;
                                strArr8[1] = "UnFAd4XuJDxSuzaFoeREgVc6Qs0OmmYm";
                                strArr8[3] = "dBM5Episk82aAApxomIpqdyXT7zAdwmF";
                                if (iA02 == 0) {
                                    iA02 = -1;
                                    strA04 = A01(853, 15, 46);
                                    android.util.Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                                }
                            }
                        } else {
                            strA04 = A01(853, 15, 46);
                            android.util.Log.w(strA03, A01(com.google.android.gms.nearby.messages.Strategy.TTL_SECONDS_DEFAULT, 51, 25) + strA04);
                        }
                        break;
                    case 23:
                        strA04 = A01(790, 9, 116);
                        iA02 = com.facebook.ads.redexgen.core.IK.A02(this.A0A);
                        if (iA02 == 0) {
                            iA02 = -1;
                            strA04 = A01(853, 15, 46);
                            android.util.Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                        }
                        break;
                    case 24:
                        strA04 = A01(693, 20, 122);
                        break;
                    case 25:
                        strA04 = A01(871, 10, 58);
                        break;
                    case 26:
                        strA04 = A01(675, 18, 76);
                        listSingletonList = java.util.Collections.singletonList(this.A0d);
                        break;
                    case 27:
                        strA04 = A01(660, 15, 82);
                        break;
                    case 28:
                        strA04 = A01(641, 19, 91);
                        listSingletonList = java.util.Collections.singletonList(new byte[]{this.A0d[0], this.A0d[1], this.A0d[2], this.A0d[3]});
                        break;
                    default:
                        throw new com.facebook.ads.redexgen.core.A0(A01(470, 30, 89));
                }
                i2 = 0 | (this.A0Z ? 1 : 0) | (this.A0a ? 2 : 0);
                if (com.facebook.ads.redexgen.core.AbstractC0748Hx.A09(strA04)) {
                    i3 = 1;
                    string = java.lang.Integer.toString(i);
                    i6 = this.A0B;
                    i7 = this.A0O;
                    drmInitData = this.A0U;
                    str = this.A0g;
                    strArr2 = A0i;
                    if (strArr2[0].charAt(30) != strArr2[5].charAt(30)) {
                        A0i[2] = "ixQpJ1YMOGXZaJaexLrRt7cPJpDFAOI0";
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A06(string, strA04, null, -1, i8, i6, i7, iA02, listSingletonList, drmInitData, i2, str);
                    } else {
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A06(string, strA04, null, -1, i8, i6, i7, iA02, listSingletonList, drmInitData, i2, str);
                    }
                } else {
                    if (com.facebook.ads.redexgen.core.AbstractC0748Hx.A0B(strA04)) {
                        i3 = 2;
                        if (this.A0H == 0) {
                            if (this.A0I == -1) {
                                i4 = this.A0R;
                            } else {
                                i4 = this.A0I;
                            }
                            this.A0I = i4;
                            if (this.A0G == -1) {
                                i5 = this.A0J;
                            } else {
                                i5 = this.A0G;
                            }
                            this.A0G = i5;
                        }
                        f = -1.0f;
                        if (this.A0I != -1) {
                            f = (this.A0J * this.A0I) / (this.A0R * this.A0G);
                        }
                        colorInfo = null;
                        if (this.A0b) {
                            colorInfo = new com.facebook.ads.internal.exoplayer2.thirdparty.video.ColorInfo(this.A0D, this.A0C, this.A0E, A06());
                        }
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A04(java.lang.Integer.toString(i), strA04, null, -1, i8, this.A0R, this.A0J, -1.0f, listSingletonList, -1, f, this.A0e, this.A0P, colorInfo, this.A0U);
                    } else if (A01(693, 20, 122).equals(strA04)) {
                        i3 = 3;
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A01(java.lang.Integer.toString(i), strA04, i2, this.A0g, this.A0U);
                    } else if (A01(871, 10, 58).equals(strA04)) {
                        i3 = 3;
                        java.util.ArrayList arrayList4 = new java.util.ArrayList(2);
                        arrayList4.add(com.facebook.ads.redexgen.core.C1157Yc.A0t);
                        arrayList4.add(this.A0d);
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A09(java.lang.Integer.toString(i), strA04, null, -1, i2, this.A0g, -1, this.A0U, Long.MAX_VALUE, arrayList4);
                    } else {
                        if (!A01(675, 18, 76).equals(strA04)) {
                        }
                        i3 = 3;
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A0A(java.lang.Integer.toString(i), strA04, null, -1, i2, listSingletonList, this.A0g, this.A0U);
                    }
                    break;
                }
                this.A0W = interfaceC0611Bz.AHA(this.A0N, i3);
                this.A0W.A69(formatA0A);
                return;
            case -1730367663:
                if (str2.equals(A01(129, 8, 42))) {
                    b = 10;
                } else {
                    b = -1;
                }
                strA01 = A01(0, 22, 11);
                strA02 = A01(500, 27, 65);
                strA03 = A01(283, 17, 42);
                switch (b) {
                    case 0:
                        strA04 = A01(959, 19, 57);
                        break;
                    case 1:
                        strA04 = A01(978, 19, 62);
                        break;
                    case 2:
                        strA04 = A01(923, 11, 95);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        strA04 = A01(910, 13, 82);
                        if (this.A0d == null) {
                            listSingletonList = java.util.Collections.singletonList(this.A0d);
                        } else {
                            listSingletonList = null;
                        }
                        break;
                    case 6:
                        strA04 = A01(891, 9, 111);
                        com.facebook.ads.redexgen.core.IM imA04 = com.facebook.ads.redexgen.core.IM.A00(new com.facebook.ads.redexgen.core.I4(this.A0d));
                        listSingletonList = imA04.A04;
                        this.A0M = imA04.A02;
                        break;
                    case 7:
                        strA04 = A01(900, 10, 63);
                        com.facebook.ads.redexgen.core.IS isA04 = com.facebook.ads.redexgen.core.IS.A00(new com.facebook.ads.redexgen.core.I4(this.A0d));
                        listSingletonList = isA04.A01;
                        this.A0M = isA04.A00;
                        break;
                    case 8:
                        android.util.Pair<java.lang.String, java.util.List<byte[]>> pairA04 = A00(new com.facebook.ads.redexgen.core.I4(this.A0d));
                        strA04 = (java.lang.String) pairA04.first;
                        listSingletonList = (java.util.List) pairA04.second;
                        break;
                    case 9:
                        strA04 = A01(944, 15, 65);
                        break;
                    case 10:
                        strA04 = A01(841, 12, 73);
                        i8 = 8192;
                        listSingletonList = A03(this.A0d);
                        break;
                    case 11:
                        strA04 = A01(780, 10, 12);
                        i8 = 5760;
                        listSingletonList = new java.util.ArrayList(3);
                        listSingletonList.add(this.A0d);
                        listSingletonList.add(java.nio.ByteBuffer.allocate(8).order(java.nio.ByteOrder.nativeOrder()).putLong(this.A0S).array());
                        listSingletonList.add(java.nio.ByteBuffer.allocate(8).order(java.nio.ByteOrder.nativeOrder()).putLong(this.A0T).array());
                        break;
                    case 12:
                        strA04 = A01(742, 15, 82);
                        listSingletonList = java.util.Collections.singletonList(this.A0d);
                        break;
                    case 13:
                        strA04 = A01(767, 13, 7);
                        i8 = 4096;
                        break;
                    case 14:
                        strA04 = A01(757, 10, 14);
                        i8 = 4096;
                        break;
                    case 15:
                        strA04 = A01(713, 9, 14);
                        break;
                    case 16:
                        strA04 = A01(722, 10, 6);
                        break;
                    case 17:
                        strA04 = A01(799, 13, 106);
                        this.A0X = new com.facebook.ads.redexgen.core.CK();
                        break;
                    case 18:
                    case 19:
                        strA04 = A01(812, 13, 34);
                        break;
                    case 20:
                        strA04 = A01(825, 16, 26);
                        break;
                    case 21:
                        strA04 = A01(732, 10, 43);
                        listSingletonList = java.util.Collections.singletonList(this.A0d);
                        break;
                    case 22:
                        strA04 = A01(790, 9, 116);
                        if (A05(new com.facebook.ads.redexgen.core.I4(this.A0d))) {
                            iA02 = com.facebook.ads.redexgen.core.IK.A02(this.A0A);
                            strArr = A0i;
                            if (strArr[1].charAt(16) != strArr[3].charAt(16)) {
                                if (iA02 == 0) {
                                    iA02 = -1;
                                    strA04 = A01(853, 15, 46);
                                    android.util.Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                                }
                            } else {
                                java.lang.String[] strArr9 = A0i;
                                strArr9[1] = "UnFAd4XuJDxSuzaFoeREgVc6Qs0OmmYm";
                                strArr9[3] = "dBM5Episk82aAApxomIpqdyXT7zAdwmF";
                                if (iA02 == 0) {
                                    iA02 = -1;
                                    strA04 = A01(853, 15, 46);
                                    android.util.Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                                }
                            }
                        } else {
                            strA04 = A01(853, 15, 46);
                            android.util.Log.w(strA03, A01(com.google.android.gms.nearby.messages.Strategy.TTL_SECONDS_DEFAULT, 51, 25) + strA04);
                        }
                        break;
                    case 23:
                        strA04 = A01(790, 9, 116);
                        iA02 = com.facebook.ads.redexgen.core.IK.A02(this.A0A);
                        if (iA02 == 0) {
                            iA02 = -1;
                            strA04 = A01(853, 15, 46);
                            android.util.Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                        }
                        break;
                    case 24:
                        strA04 = A01(693, 20, 122);
                        break;
                    case 25:
                        strA04 = A01(871, 10, 58);
                        break;
                    case 26:
                        strA04 = A01(675, 18, 76);
                        listSingletonList = java.util.Collections.singletonList(this.A0d);
                        break;
                    case 27:
                        strA04 = A01(660, 15, 82);
                        break;
                    case 28:
                        strA04 = A01(641, 19, 91);
                        listSingletonList = java.util.Collections.singletonList(new byte[]{this.A0d[0], this.A0d[1], this.A0d[2], this.A0d[3]});
                        break;
                    default:
                        throw new com.facebook.ads.redexgen.core.A0(A01(470, 30, 89));
                }
                i2 = 0 | (this.A0Z ? 1 : 0) | (this.A0a ? 2 : 0);
                if (com.facebook.ads.redexgen.core.AbstractC0748Hx.A09(strA04)) {
                    i3 = 1;
                    string = java.lang.Integer.toString(i);
                    i6 = this.A0B;
                    i7 = this.A0O;
                    drmInitData = this.A0U;
                    str = this.A0g;
                    strArr2 = A0i;
                    if (strArr2[0].charAt(30) != strArr2[5].charAt(30)) {
                        A0i[2] = "ixQpJ1YMOGXZaJaexLrRt7cPJpDFAOI0";
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A06(string, strA04, null, -1, i8, i6, i7, iA02, listSingletonList, drmInitData, i2, str);
                    } else {
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A06(string, strA04, null, -1, i8, i6, i7, iA02, listSingletonList, drmInitData, i2, str);
                    }
                } else {
                    if (com.facebook.ads.redexgen.core.AbstractC0748Hx.A0B(strA04)) {
                        i3 = 2;
                        if (this.A0H == 0) {
                            if (this.A0I == -1) {
                                i4 = this.A0R;
                            } else {
                                i4 = this.A0I;
                            }
                            this.A0I = i4;
                            if (this.A0G == -1) {
                                i5 = this.A0J;
                            } else {
                                i5 = this.A0G;
                            }
                            this.A0G = i5;
                        }
                        f = -1.0f;
                        if (this.A0I != -1) {
                            f = (this.A0J * this.A0I) / (this.A0R * this.A0G);
                        }
                        colorInfo = null;
                        if (this.A0b) {
                            colorInfo = new com.facebook.ads.internal.exoplayer2.thirdparty.video.ColorInfo(this.A0D, this.A0C, this.A0E, A06());
                        }
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A04(java.lang.Integer.toString(i), strA04, null, -1, i8, this.A0R, this.A0J, -1.0f, listSingletonList, -1, f, this.A0e, this.A0P, colorInfo, this.A0U);
                    } else if (A01(693, 20, 122).equals(strA04)) {
                        i3 = 3;
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A01(java.lang.Integer.toString(i), strA04, i2, this.A0g, this.A0U);
                    } else if (A01(871, 10, 58).equals(strA04)) {
                        i3 = 3;
                        java.util.ArrayList arrayList5 = new java.util.ArrayList(2);
                        arrayList5.add(com.facebook.ads.redexgen.core.C1157Yc.A0t);
                        arrayList5.add(this.A0d);
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A09(java.lang.Integer.toString(i), strA04, null, -1, i2, this.A0g, -1, this.A0U, Long.MAX_VALUE, arrayList5);
                    } else {
                        if (!A01(675, 18, 76).equals(strA04)) {
                        }
                        i3 = 3;
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A0A(java.lang.Integer.toString(i), strA04, null, -1, i2, listSingletonList, this.A0g, this.A0U);
                    }
                    break;
                }
                this.A0W = interfaceC0611Bz.AHA(this.A0N, i3);
                this.A0W.A69(formatA0A);
                return;
            case -1482641358:
                if (str2.equals(A01(76, 9, 94))) {
                    b = 13;
                } else {
                    b = -1;
                }
                strA01 = A01(0, 22, 11);
                strA02 = A01(500, 27, 65);
                strA03 = A01(283, 17, 42);
                switch (b) {
                    case 0:
                        strA04 = A01(959, 19, 57);
                        break;
                    case 1:
                        strA04 = A01(978, 19, 62);
                        break;
                    case 2:
                        strA04 = A01(923, 11, 95);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        strA04 = A01(910, 13, 82);
                        if (this.A0d == null) {
                            listSingletonList = java.util.Collections.singletonList(this.A0d);
                        } else {
                            listSingletonList = null;
                        }
                        break;
                    case 6:
                        strA04 = A01(891, 9, 111);
                        com.facebook.ads.redexgen.core.IM imA05 = com.facebook.ads.redexgen.core.IM.A00(new com.facebook.ads.redexgen.core.I4(this.A0d));
                        listSingletonList = imA05.A04;
                        this.A0M = imA05.A02;
                        break;
                    case 7:
                        strA04 = A01(900, 10, 63);
                        com.facebook.ads.redexgen.core.IS isA05 = com.facebook.ads.redexgen.core.IS.A00(new com.facebook.ads.redexgen.core.I4(this.A0d));
                        listSingletonList = isA05.A01;
                        this.A0M = isA05.A00;
                        break;
                    case 8:
                        android.util.Pair<java.lang.String, java.util.List<byte[]>> pairA05 = A00(new com.facebook.ads.redexgen.core.I4(this.A0d));
                        strA04 = (java.lang.String) pairA05.first;
                        listSingletonList = (java.util.List) pairA05.second;
                        break;
                    case 9:
                        strA04 = A01(944, 15, 65);
                        break;
                    case 10:
                        strA04 = A01(841, 12, 73);
                        i8 = 8192;
                        listSingletonList = A03(this.A0d);
                        break;
                    case 11:
                        strA04 = A01(780, 10, 12);
                        i8 = 5760;
                        listSingletonList = new java.util.ArrayList(3);
                        listSingletonList.add(this.A0d);
                        listSingletonList.add(java.nio.ByteBuffer.allocate(8).order(java.nio.ByteOrder.nativeOrder()).putLong(this.A0S).array());
                        listSingletonList.add(java.nio.ByteBuffer.allocate(8).order(java.nio.ByteOrder.nativeOrder()).putLong(this.A0T).array());
                        break;
                    case 12:
                        strA04 = A01(742, 15, 82);
                        listSingletonList = java.util.Collections.singletonList(this.A0d);
                        break;
                    case 13:
                        strA04 = A01(767, 13, 7);
                        i8 = 4096;
                        break;
                    case 14:
                        strA04 = A01(757, 10, 14);
                        i8 = 4096;
                        break;
                    case 15:
                        strA04 = A01(713, 9, 14);
                        break;
                    case 16:
                        strA04 = A01(722, 10, 6);
                        break;
                    case 17:
                        strA04 = A01(799, 13, 106);
                        this.A0X = new com.facebook.ads.redexgen.core.CK();
                        break;
                    case 18:
                    case 19:
                        strA04 = A01(812, 13, 34);
                        break;
                    case 20:
                        strA04 = A01(825, 16, 26);
                        break;
                    case 21:
                        strA04 = A01(732, 10, 43);
                        listSingletonList = java.util.Collections.singletonList(this.A0d);
                        break;
                    case 22:
                        strA04 = A01(790, 9, 116);
                        if (A05(new com.facebook.ads.redexgen.core.I4(this.A0d))) {
                            iA02 = com.facebook.ads.redexgen.core.IK.A02(this.A0A);
                            strArr = A0i;
                            if (strArr[1].charAt(16) != strArr[3].charAt(16)) {
                                if (iA02 == 0) {
                                    iA02 = -1;
                                    strA04 = A01(853, 15, 46);
                                    android.util.Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                                }
                            } else {
                                java.lang.String[] strArr10 = A0i;
                                strArr10[1] = "UnFAd4XuJDxSuzaFoeREgVc6Qs0OmmYm";
                                strArr10[3] = "dBM5Episk82aAApxomIpqdyXT7zAdwmF";
                                if (iA02 == 0) {
                                    iA02 = -1;
                                    strA04 = A01(853, 15, 46);
                                    android.util.Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                                }
                            }
                        } else {
                            strA04 = A01(853, 15, 46);
                            android.util.Log.w(strA03, A01(com.google.android.gms.nearby.messages.Strategy.TTL_SECONDS_DEFAULT, 51, 25) + strA04);
                        }
                        break;
                    case 23:
                        strA04 = A01(790, 9, 116);
                        iA02 = com.facebook.ads.redexgen.core.IK.A02(this.A0A);
                        if (iA02 == 0) {
                            iA02 = -1;
                            strA04 = A01(853, 15, 46);
                            android.util.Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                        }
                        break;
                    case 24:
                        strA04 = A01(693, 20, 122);
                        break;
                    case 25:
                        strA04 = A01(871, 10, 58);
                        break;
                    case 26:
                        strA04 = A01(675, 18, 76);
                        listSingletonList = java.util.Collections.singletonList(this.A0d);
                        break;
                    case 27:
                        strA04 = A01(660, 15, 82);
                        break;
                    case 28:
                        strA04 = A01(641, 19, 91);
                        listSingletonList = java.util.Collections.singletonList(new byte[]{this.A0d[0], this.A0d[1], this.A0d[2], this.A0d[3]});
                        break;
                    default:
                        throw new com.facebook.ads.redexgen.core.A0(A01(470, 30, 89));
                }
                i2 = 0 | (this.A0Z ? 1 : 0) | (this.A0a ? 2 : 0);
                if (com.facebook.ads.redexgen.core.AbstractC0748Hx.A09(strA04)) {
                    i3 = 1;
                    string = java.lang.Integer.toString(i);
                    i6 = this.A0B;
                    i7 = this.A0O;
                    drmInitData = this.A0U;
                    str = this.A0g;
                    strArr2 = A0i;
                    if (strArr2[0].charAt(30) != strArr2[5].charAt(30)) {
                        A0i[2] = "ixQpJ1YMOGXZaJaexLrRt7cPJpDFAOI0";
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A06(string, strA04, null, -1, i8, i6, i7, iA02, listSingletonList, drmInitData, i2, str);
                    } else {
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A06(string, strA04, null, -1, i8, i6, i7, iA02, listSingletonList, drmInitData, i2, str);
                    }
                } else {
                    if (com.facebook.ads.redexgen.core.AbstractC0748Hx.A0B(strA04)) {
                        i3 = 2;
                        if (this.A0H == 0) {
                            if (this.A0I == -1) {
                                i4 = this.A0R;
                            } else {
                                i4 = this.A0I;
                            }
                            this.A0I = i4;
                            if (this.A0G == -1) {
                                i5 = this.A0J;
                            } else {
                                i5 = this.A0G;
                            }
                            this.A0G = i5;
                        }
                        f = -1.0f;
                        if (this.A0I != -1) {
                            f = (this.A0J * this.A0I) / (this.A0R * this.A0G);
                        }
                        colorInfo = null;
                        if (this.A0b) {
                            colorInfo = new com.facebook.ads.internal.exoplayer2.thirdparty.video.ColorInfo(this.A0D, this.A0C, this.A0E, A06());
                        }
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A04(java.lang.Integer.toString(i), strA04, null, -1, i8, this.A0R, this.A0J, -1.0f, listSingletonList, -1, f, this.A0e, this.A0P, colorInfo, this.A0U);
                    } else if (A01(693, 20, 122).equals(strA04)) {
                        i3 = 3;
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A01(java.lang.Integer.toString(i), strA04, i2, this.A0g, this.A0U);
                    } else if (A01(871, 10, 58).equals(strA04)) {
                        i3 = 3;
                        java.util.ArrayList arrayList6 = new java.util.ArrayList(2);
                        arrayList6.add(com.facebook.ads.redexgen.core.C1157Yc.A0t);
                        arrayList6.add(this.A0d);
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A09(java.lang.Integer.toString(i), strA04, null, -1, i2, this.A0g, -1, this.A0U, Long.MAX_VALUE, arrayList6);
                    } else {
                        if (!A01(675, 18, 76).equals(strA04)) {
                        }
                        i3 = 3;
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A0A(java.lang.Integer.toString(i), strA04, null, -1, i2, listSingletonList, this.A0g, this.A0U);
                    }
                    break;
                }
                this.A0W = interfaceC0611Bz.AHA(this.A0N, i3);
                this.A0W.A69(formatA0A);
                return;
            case -1482641357:
                if (str2.equals(A01(85, 9, 44))) {
                    b = 14;
                } else {
                    b = -1;
                }
                strA01 = A01(0, 22, 11);
                strA02 = A01(500, 27, 65);
                strA03 = A01(283, 17, 42);
                switch (b) {
                    case 0:
                        strA04 = A01(959, 19, 57);
                        break;
                    case 1:
                        strA04 = A01(978, 19, 62);
                        break;
                    case 2:
                        strA04 = A01(923, 11, 95);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        strA04 = A01(910, 13, 82);
                        if (this.A0d == null) {
                            listSingletonList = java.util.Collections.singletonList(this.A0d);
                        } else {
                            listSingletonList = null;
                        }
                        break;
                    case 6:
                        strA04 = A01(891, 9, 111);
                        com.facebook.ads.redexgen.core.IM imA06 = com.facebook.ads.redexgen.core.IM.A00(new com.facebook.ads.redexgen.core.I4(this.A0d));
                        listSingletonList = imA06.A04;
                        this.A0M = imA06.A02;
                        break;
                    case 7:
                        strA04 = A01(900, 10, 63);
                        com.facebook.ads.redexgen.core.IS isA06 = com.facebook.ads.redexgen.core.IS.A00(new com.facebook.ads.redexgen.core.I4(this.A0d));
                        listSingletonList = isA06.A01;
                        this.A0M = isA06.A00;
                        break;
                    case 8:
                        android.util.Pair<java.lang.String, java.util.List<byte[]>> pairA06 = A00(new com.facebook.ads.redexgen.core.I4(this.A0d));
                        strA04 = (java.lang.String) pairA06.first;
                        listSingletonList = (java.util.List) pairA06.second;
                        break;
                    case 9:
                        strA04 = A01(944, 15, 65);
                        break;
                    case 10:
                        strA04 = A01(841, 12, 73);
                        i8 = 8192;
                        listSingletonList = A03(this.A0d);
                        break;
                    case 11:
                        strA04 = A01(780, 10, 12);
                        i8 = 5760;
                        listSingletonList = new java.util.ArrayList(3);
                        listSingletonList.add(this.A0d);
                        listSingletonList.add(java.nio.ByteBuffer.allocate(8).order(java.nio.ByteOrder.nativeOrder()).putLong(this.A0S).array());
                        listSingletonList.add(java.nio.ByteBuffer.allocate(8).order(java.nio.ByteOrder.nativeOrder()).putLong(this.A0T).array());
                        break;
                    case 12:
                        strA04 = A01(742, 15, 82);
                        listSingletonList = java.util.Collections.singletonList(this.A0d);
                        break;
                    case 13:
                        strA04 = A01(767, 13, 7);
                        i8 = 4096;
                        break;
                    case 14:
                        strA04 = A01(757, 10, 14);
                        i8 = 4096;
                        break;
                    case 15:
                        strA04 = A01(713, 9, 14);
                        break;
                    case 16:
                        strA04 = A01(722, 10, 6);
                        break;
                    case 17:
                        strA04 = A01(799, 13, 106);
                        this.A0X = new com.facebook.ads.redexgen.core.CK();
                        break;
                    case 18:
                    case 19:
                        strA04 = A01(812, 13, 34);
                        break;
                    case 20:
                        strA04 = A01(825, 16, 26);
                        break;
                    case 21:
                        strA04 = A01(732, 10, 43);
                        listSingletonList = java.util.Collections.singletonList(this.A0d);
                        break;
                    case 22:
                        strA04 = A01(790, 9, 116);
                        if (A05(new com.facebook.ads.redexgen.core.I4(this.A0d))) {
                            iA02 = com.facebook.ads.redexgen.core.IK.A02(this.A0A);
                            strArr = A0i;
                            if (strArr[1].charAt(16) != strArr[3].charAt(16)) {
                                if (iA02 == 0) {
                                    iA02 = -1;
                                    strA04 = A01(853, 15, 46);
                                    android.util.Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                                }
                            } else {
                                java.lang.String[] strArr11 = A0i;
                                strArr11[1] = "UnFAd4XuJDxSuzaFoeREgVc6Qs0OmmYm";
                                strArr11[3] = "dBM5Episk82aAApxomIpqdyXT7zAdwmF";
                                if (iA02 == 0) {
                                    iA02 = -1;
                                    strA04 = A01(853, 15, 46);
                                    android.util.Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                                }
                            }
                        } else {
                            strA04 = A01(853, 15, 46);
                            android.util.Log.w(strA03, A01(com.google.android.gms.nearby.messages.Strategy.TTL_SECONDS_DEFAULT, 51, 25) + strA04);
                        }
                        break;
                    case 23:
                        strA04 = A01(790, 9, 116);
                        iA02 = com.facebook.ads.redexgen.core.IK.A02(this.A0A);
                        if (iA02 == 0) {
                            iA02 = -1;
                            strA04 = A01(853, 15, 46);
                            android.util.Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                        }
                        break;
                    case 24:
                        strA04 = A01(693, 20, 122);
                        break;
                    case 25:
                        strA04 = A01(871, 10, 58);
                        break;
                    case 26:
                        strA04 = A01(675, 18, 76);
                        listSingletonList = java.util.Collections.singletonList(this.A0d);
                        break;
                    case 27:
                        strA04 = A01(660, 15, 82);
                        break;
                    case 28:
                        strA04 = A01(641, 19, 91);
                        listSingletonList = java.util.Collections.singletonList(new byte[]{this.A0d[0], this.A0d[1], this.A0d[2], this.A0d[3]});
                        break;
                    default:
                        throw new com.facebook.ads.redexgen.core.A0(A01(470, 30, 89));
                }
                i2 = 0 | (this.A0Z ? 1 : 0) | (this.A0a ? 2 : 0);
                if (com.facebook.ads.redexgen.core.AbstractC0748Hx.A09(strA04)) {
                    i3 = 1;
                    string = java.lang.Integer.toString(i);
                    i6 = this.A0B;
                    i7 = this.A0O;
                    drmInitData = this.A0U;
                    str = this.A0g;
                    strArr2 = A0i;
                    if (strArr2[0].charAt(30) != strArr2[5].charAt(30)) {
                        A0i[2] = "ixQpJ1YMOGXZaJaexLrRt7cPJpDFAOI0";
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A06(string, strA04, null, -1, i8, i6, i7, iA02, listSingletonList, drmInitData, i2, str);
                    } else {
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A06(string, strA04, null, -1, i8, i6, i7, iA02, listSingletonList, drmInitData, i2, str);
                    }
                } else {
                    if (com.facebook.ads.redexgen.core.AbstractC0748Hx.A0B(strA04)) {
                        i3 = 2;
                        if (this.A0H == 0) {
                            if (this.A0I == -1) {
                                i4 = this.A0R;
                            } else {
                                i4 = this.A0I;
                            }
                            this.A0I = i4;
                            if (this.A0G == -1) {
                                i5 = this.A0J;
                            } else {
                                i5 = this.A0G;
                            }
                            this.A0G = i5;
                        }
                        f = -1.0f;
                        if (this.A0I != -1) {
                            f = (this.A0J * this.A0I) / (this.A0R * this.A0G);
                        }
                        colorInfo = null;
                        if (this.A0b) {
                            colorInfo = new com.facebook.ads.internal.exoplayer2.thirdparty.video.ColorInfo(this.A0D, this.A0C, this.A0E, A06());
                        }
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A04(java.lang.Integer.toString(i), strA04, null, -1, i8, this.A0R, this.A0J, -1.0f, listSingletonList, -1, f, this.A0e, this.A0P, colorInfo, this.A0U);
                    } else if (A01(693, 20, 122).equals(strA04)) {
                        i3 = 3;
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A01(java.lang.Integer.toString(i), strA04, i2, this.A0g, this.A0U);
                    } else if (A01(871, 10, 58).equals(strA04)) {
                        i3 = 3;
                        java.util.ArrayList arrayList7 = new java.util.ArrayList(2);
                        arrayList7.add(com.facebook.ads.redexgen.core.C1157Yc.A0t);
                        arrayList7.add(this.A0d);
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A09(java.lang.Integer.toString(i), strA04, null, -1, i2, this.A0g, -1, this.A0U, Long.MAX_VALUE, arrayList7);
                    } else {
                        if (!A01(675, 18, 76).equals(strA04)) {
                        }
                        i3 = 3;
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A0A(java.lang.Integer.toString(i), strA04, null, -1, i2, listSingletonList, this.A0g, this.A0U);
                    }
                    break;
                }
                this.A0W = interfaceC0611Bz.AHA(this.A0N, i3);
                this.A0W.A69(formatA0A);
                return;
            case -1373388978:
                if (str2.equals(A01(608, 15, 42))) {
                    b = 8;
                } else {
                    b = -1;
                }
                strA01 = A01(0, 22, 11);
                strA02 = A01(500, 27, 65);
                strA03 = A01(283, 17, 42);
                switch (b) {
                    case 0:
                        strA04 = A01(959, 19, 57);
                        break;
                    case 1:
                        strA04 = A01(978, 19, 62);
                        break;
                    case 2:
                        strA04 = A01(923, 11, 95);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        strA04 = A01(910, 13, 82);
                        if (this.A0d == null) {
                            listSingletonList = java.util.Collections.singletonList(this.A0d);
                        } else {
                            listSingletonList = null;
                        }
                        break;
                    case 6:
                        strA04 = A01(891, 9, 111);
                        com.facebook.ads.redexgen.core.IM imA07 = com.facebook.ads.redexgen.core.IM.A00(new com.facebook.ads.redexgen.core.I4(this.A0d));
                        listSingletonList = imA07.A04;
                        this.A0M = imA07.A02;
                        break;
                    case 7:
                        strA04 = A01(900, 10, 63);
                        com.facebook.ads.redexgen.core.IS isA07 = com.facebook.ads.redexgen.core.IS.A00(new com.facebook.ads.redexgen.core.I4(this.A0d));
                        listSingletonList = isA07.A01;
                        this.A0M = isA07.A00;
                        break;
                    case 8:
                        android.util.Pair<java.lang.String, java.util.List<byte[]>> pairA07 = A00(new com.facebook.ads.redexgen.core.I4(this.A0d));
                        strA04 = (java.lang.String) pairA07.first;
                        listSingletonList = (java.util.List) pairA07.second;
                        break;
                    case 9:
                        strA04 = A01(944, 15, 65);
                        break;
                    case 10:
                        strA04 = A01(841, 12, 73);
                        i8 = 8192;
                        listSingletonList = A03(this.A0d);
                        break;
                    case 11:
                        strA04 = A01(780, 10, 12);
                        i8 = 5760;
                        listSingletonList = new java.util.ArrayList(3);
                        listSingletonList.add(this.A0d);
                        listSingletonList.add(java.nio.ByteBuffer.allocate(8).order(java.nio.ByteOrder.nativeOrder()).putLong(this.A0S).array());
                        listSingletonList.add(java.nio.ByteBuffer.allocate(8).order(java.nio.ByteOrder.nativeOrder()).putLong(this.A0T).array());
                        break;
                    case 12:
                        strA04 = A01(742, 15, 82);
                        listSingletonList = java.util.Collections.singletonList(this.A0d);
                        break;
                    case 13:
                        strA04 = A01(767, 13, 7);
                        i8 = 4096;
                        break;
                    case 14:
                        strA04 = A01(757, 10, 14);
                        i8 = 4096;
                        break;
                    case 15:
                        strA04 = A01(713, 9, 14);
                        break;
                    case 16:
                        strA04 = A01(722, 10, 6);
                        break;
                    case 17:
                        strA04 = A01(799, 13, 106);
                        this.A0X = new com.facebook.ads.redexgen.core.CK();
                        break;
                    case 18:
                    case 19:
                        strA04 = A01(812, 13, 34);
                        break;
                    case 20:
                        strA04 = A01(825, 16, 26);
                        break;
                    case 21:
                        strA04 = A01(732, 10, 43);
                        listSingletonList = java.util.Collections.singletonList(this.A0d);
                        break;
                    case 22:
                        strA04 = A01(790, 9, 116);
                        if (A05(new com.facebook.ads.redexgen.core.I4(this.A0d))) {
                            iA02 = com.facebook.ads.redexgen.core.IK.A02(this.A0A);
                            strArr = A0i;
                            if (strArr[1].charAt(16) != strArr[3].charAt(16)) {
                                if (iA02 == 0) {
                                    iA02 = -1;
                                    strA04 = A01(853, 15, 46);
                                    android.util.Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                                }
                            } else {
                                java.lang.String[] strArr12 = A0i;
                                strArr12[1] = "UnFAd4XuJDxSuzaFoeREgVc6Qs0OmmYm";
                                strArr12[3] = "dBM5Episk82aAApxomIpqdyXT7zAdwmF";
                                if (iA02 == 0) {
                                    iA02 = -1;
                                    strA04 = A01(853, 15, 46);
                                    android.util.Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                                }
                            }
                        } else {
                            strA04 = A01(853, 15, 46);
                            android.util.Log.w(strA03, A01(com.google.android.gms.nearby.messages.Strategy.TTL_SECONDS_DEFAULT, 51, 25) + strA04);
                        }
                        break;
                    case 23:
                        strA04 = A01(790, 9, 116);
                        iA02 = com.facebook.ads.redexgen.core.IK.A02(this.A0A);
                        if (iA02 == 0) {
                            iA02 = -1;
                            strA04 = A01(853, 15, 46);
                            android.util.Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                        }
                        break;
                    case 24:
                        strA04 = A01(693, 20, 122);
                        break;
                    case 25:
                        strA04 = A01(871, 10, 58);
                        break;
                    case 26:
                        strA04 = A01(675, 18, 76);
                        listSingletonList = java.util.Collections.singletonList(this.A0d);
                        break;
                    case 27:
                        strA04 = A01(660, 15, 82);
                        break;
                    case 28:
                        strA04 = A01(641, 19, 91);
                        listSingletonList = java.util.Collections.singletonList(new byte[]{this.A0d[0], this.A0d[1], this.A0d[2], this.A0d[3]});
                        break;
                    default:
                        throw new com.facebook.ads.redexgen.core.A0(A01(470, 30, 89));
                }
                i2 = 0 | (this.A0Z ? 1 : 0) | (this.A0a ? 2 : 0);
                if (com.facebook.ads.redexgen.core.AbstractC0748Hx.A09(strA04)) {
                    i3 = 1;
                    string = java.lang.Integer.toString(i);
                    i6 = this.A0B;
                    i7 = this.A0O;
                    drmInitData = this.A0U;
                    str = this.A0g;
                    strArr2 = A0i;
                    if (strArr2[0].charAt(30) != strArr2[5].charAt(30)) {
                        A0i[2] = "ixQpJ1YMOGXZaJaexLrRt7cPJpDFAOI0";
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A06(string, strA04, null, -1, i8, i6, i7, iA02, listSingletonList, drmInitData, i2, str);
                    } else {
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A06(string, strA04, null, -1, i8, i6, i7, iA02, listSingletonList, drmInitData, i2, str);
                    }
                } else {
                    if (com.facebook.ads.redexgen.core.AbstractC0748Hx.A0B(strA04)) {
                        i3 = 2;
                        if (this.A0H == 0) {
                            if (this.A0I == -1) {
                                i4 = this.A0R;
                            } else {
                                i4 = this.A0I;
                            }
                            this.A0I = i4;
                            if (this.A0G == -1) {
                                i5 = this.A0J;
                            } else {
                                i5 = this.A0G;
                            }
                            this.A0G = i5;
                        }
                        f = -1.0f;
                        if (this.A0I != -1) {
                            f = (this.A0J * this.A0I) / (this.A0R * this.A0G);
                        }
                        colorInfo = null;
                        if (this.A0b) {
                            colorInfo = new com.facebook.ads.internal.exoplayer2.thirdparty.video.ColorInfo(this.A0D, this.A0C, this.A0E, A06());
                        }
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A04(java.lang.Integer.toString(i), strA04, null, -1, i8, this.A0R, this.A0J, -1.0f, listSingletonList, -1, f, this.A0e, this.A0P, colorInfo, this.A0U);
                    } else if (A01(693, 20, 122).equals(strA04)) {
                        i3 = 3;
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A01(java.lang.Integer.toString(i), strA04, i2, this.A0g, this.A0U);
                    } else if (A01(871, 10, 58).equals(strA04)) {
                        i3 = 3;
                        java.util.ArrayList arrayList8 = new java.util.ArrayList(2);
                        arrayList8.add(com.facebook.ads.redexgen.core.C1157Yc.A0t);
                        arrayList8.add(this.A0d);
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A09(java.lang.Integer.toString(i), strA04, null, -1, i2, this.A0g, -1, this.A0U, Long.MAX_VALUE, arrayList8);
                    } else {
                        if (!A01(675, 18, 76).equals(strA04)) {
                        }
                        i3 = 3;
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A0A(java.lang.Integer.toString(i), strA04, null, -1, i2, listSingletonList, this.A0g, this.A0U);
                    }
                    break;
                }
                this.A0W = interfaceC0611Bz.AHA(this.A0N, i3);
                this.A0W.A69(formatA0A);
                return;
            case -933872740:
                if (str2.equals(A01(351, 8, 42))) {
                    b = 28;
                } else {
                    b = -1;
                }
                strA01 = A01(0, 22, 11);
                strA02 = A01(500, 27, 65);
                strA03 = A01(283, 17, 42);
                switch (b) {
                    case 0:
                        strA04 = A01(959, 19, 57);
                        break;
                    case 1:
                        strA04 = A01(978, 19, 62);
                        break;
                    case 2:
                        strA04 = A01(923, 11, 95);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        strA04 = A01(910, 13, 82);
                        if (this.A0d == null) {
                            listSingletonList = java.util.Collections.singletonList(this.A0d);
                        } else {
                            listSingletonList = null;
                        }
                        break;
                    case 6:
                        strA04 = A01(891, 9, 111);
                        com.facebook.ads.redexgen.core.IM imA08 = com.facebook.ads.redexgen.core.IM.A00(new com.facebook.ads.redexgen.core.I4(this.A0d));
                        listSingletonList = imA08.A04;
                        this.A0M = imA08.A02;
                        break;
                    case 7:
                        strA04 = A01(900, 10, 63);
                        com.facebook.ads.redexgen.core.IS isA08 = com.facebook.ads.redexgen.core.IS.A00(new com.facebook.ads.redexgen.core.I4(this.A0d));
                        listSingletonList = isA08.A01;
                        this.A0M = isA08.A00;
                        break;
                    case 8:
                        android.util.Pair<java.lang.String, java.util.List<byte[]>> pairA08 = A00(new com.facebook.ads.redexgen.core.I4(this.A0d));
                        strA04 = (java.lang.String) pairA08.first;
                        listSingletonList = (java.util.List) pairA08.second;
                        break;
                    case 9:
                        strA04 = A01(944, 15, 65);
                        break;
                    case 10:
                        strA04 = A01(841, 12, 73);
                        i8 = 8192;
                        listSingletonList = A03(this.A0d);
                        break;
                    case 11:
                        strA04 = A01(780, 10, 12);
                        i8 = 5760;
                        listSingletonList = new java.util.ArrayList(3);
                        listSingletonList.add(this.A0d);
                        listSingletonList.add(java.nio.ByteBuffer.allocate(8).order(java.nio.ByteOrder.nativeOrder()).putLong(this.A0S).array());
                        listSingletonList.add(java.nio.ByteBuffer.allocate(8).order(java.nio.ByteOrder.nativeOrder()).putLong(this.A0T).array());
                        break;
                    case 12:
                        strA04 = A01(742, 15, 82);
                        listSingletonList = java.util.Collections.singletonList(this.A0d);
                        break;
                    case 13:
                        strA04 = A01(767, 13, 7);
                        i8 = 4096;
                        break;
                    case 14:
                        strA04 = A01(757, 10, 14);
                        i8 = 4096;
                        break;
                    case 15:
                        strA04 = A01(713, 9, 14);
                        break;
                    case 16:
                        strA04 = A01(722, 10, 6);
                        break;
                    case 17:
                        strA04 = A01(799, 13, 106);
                        this.A0X = new com.facebook.ads.redexgen.core.CK();
                        break;
                    case 18:
                    case 19:
                        strA04 = A01(812, 13, 34);
                        break;
                    case 20:
                        strA04 = A01(825, 16, 26);
                        break;
                    case 21:
                        strA04 = A01(732, 10, 43);
                        listSingletonList = java.util.Collections.singletonList(this.A0d);
                        break;
                    case 22:
                        strA04 = A01(790, 9, 116);
                        if (A05(new com.facebook.ads.redexgen.core.I4(this.A0d))) {
                            iA02 = com.facebook.ads.redexgen.core.IK.A02(this.A0A);
                            strArr = A0i;
                            if (strArr[1].charAt(16) != strArr[3].charAt(16)) {
                                if (iA02 == 0) {
                                    iA02 = -1;
                                    strA04 = A01(853, 15, 46);
                                    android.util.Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                                }
                            } else {
                                java.lang.String[] strArr13 = A0i;
                                strArr13[1] = "UnFAd4XuJDxSuzaFoeREgVc6Qs0OmmYm";
                                strArr13[3] = "dBM5Episk82aAApxomIpqdyXT7zAdwmF";
                                if (iA02 == 0) {
                                    iA02 = -1;
                                    strA04 = A01(853, 15, 46);
                                    android.util.Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                                }
                            }
                        } else {
                            strA04 = A01(853, 15, 46);
                            android.util.Log.w(strA03, A01(com.google.android.gms.nearby.messages.Strategy.TTL_SECONDS_DEFAULT, 51, 25) + strA04);
                        }
                        break;
                    case 23:
                        strA04 = A01(790, 9, 116);
                        iA02 = com.facebook.ads.redexgen.core.IK.A02(this.A0A);
                        if (iA02 == 0) {
                            iA02 = -1;
                            strA04 = A01(853, 15, 46);
                            android.util.Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                        }
                        break;
                    case 24:
                        strA04 = A01(693, 20, 122);
                        break;
                    case 25:
                        strA04 = A01(871, 10, 58);
                        break;
                    case 26:
                        strA04 = A01(675, 18, 76);
                        listSingletonList = java.util.Collections.singletonList(this.A0d);
                        break;
                    case 27:
                        strA04 = A01(660, 15, 82);
                        break;
                    case 28:
                        strA04 = A01(641, 19, 91);
                        listSingletonList = java.util.Collections.singletonList(new byte[]{this.A0d[0], this.A0d[1], this.A0d[2], this.A0d[3]});
                        break;
                    default:
                        throw new com.facebook.ads.redexgen.core.A0(A01(470, 30, 89));
                }
                i2 = 0 | (this.A0Z ? 1 : 0) | (this.A0a ? 2 : 0);
                if (com.facebook.ads.redexgen.core.AbstractC0748Hx.A09(strA04)) {
                    i3 = 1;
                    string = java.lang.Integer.toString(i);
                    i6 = this.A0B;
                    i7 = this.A0O;
                    drmInitData = this.A0U;
                    str = this.A0g;
                    strArr2 = A0i;
                    if (strArr2[0].charAt(30) != strArr2[5].charAt(30)) {
                        A0i[2] = "ixQpJ1YMOGXZaJaexLrRt7cPJpDFAOI0";
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A06(string, strA04, null, -1, i8, i6, i7, iA02, listSingletonList, drmInitData, i2, str);
                    } else {
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A06(string, strA04, null, -1, i8, i6, i7, iA02, listSingletonList, drmInitData, i2, str);
                    }
                } else {
                    if (com.facebook.ads.redexgen.core.AbstractC0748Hx.A0B(strA04)) {
                        i3 = 2;
                        if (this.A0H == 0) {
                            if (this.A0I == -1) {
                                i4 = this.A0R;
                            } else {
                                i4 = this.A0I;
                            }
                            this.A0I = i4;
                            if (this.A0G == -1) {
                                i5 = this.A0J;
                            } else {
                                i5 = this.A0G;
                            }
                            this.A0G = i5;
                        }
                        f = -1.0f;
                        if (this.A0I != -1) {
                            f = (this.A0J * this.A0I) / (this.A0R * this.A0G);
                        }
                        colorInfo = null;
                        if (this.A0b) {
                            colorInfo = new com.facebook.ads.internal.exoplayer2.thirdparty.video.ColorInfo(this.A0D, this.A0C, this.A0E, A06());
                        }
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A04(java.lang.Integer.toString(i), strA04, null, -1, i8, this.A0R, this.A0J, -1.0f, listSingletonList, -1, f, this.A0e, this.A0P, colorInfo, this.A0U);
                    } else if (A01(693, 20, 122).equals(strA04)) {
                        i3 = 3;
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A01(java.lang.Integer.toString(i), strA04, i2, this.A0g, this.A0U);
                    } else if (A01(871, 10, 58).equals(strA04)) {
                        i3 = 3;
                        java.util.ArrayList arrayList9 = new java.util.ArrayList(2);
                        arrayList9.add(com.facebook.ads.redexgen.core.C1157Yc.A0t);
                        arrayList9.add(this.A0d);
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A09(java.lang.Integer.toString(i), strA04, null, -1, i2, this.A0g, -1, this.A0U, Long.MAX_VALUE, arrayList9);
                    } else {
                        if (!A01(675, 18, 76).equals(strA04)) {
                        }
                        i3 = 3;
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A0A(java.lang.Integer.toString(i), strA04, null, -1, i2, listSingletonList, this.A0g, this.A0U);
                    }
                    break;
                }
                this.A0W = interfaceC0611Bz.AHA(this.A0N, i3);
                this.A0W.A69(formatA0A);
                return;
            case -538363189:
                if (str2.equals(A01(548, 15, 23))) {
                    b = 4;
                } else {
                    b = -1;
                }
                strA01 = A01(0, 22, 11);
                strA02 = A01(500, 27, 65);
                strA03 = A01(283, 17, 42);
                switch (b) {
                    case 0:
                        strA04 = A01(959, 19, 57);
                        break;
                    case 1:
                        strA04 = A01(978, 19, 62);
                        break;
                    case 2:
                        strA04 = A01(923, 11, 95);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        strA04 = A01(910, 13, 82);
                        if (this.A0d == null) {
                            listSingletonList = java.util.Collections.singletonList(this.A0d);
                        } else {
                            listSingletonList = null;
                        }
                        break;
                    case 6:
                        strA04 = A01(891, 9, 111);
                        com.facebook.ads.redexgen.core.IM imA09 = com.facebook.ads.redexgen.core.IM.A00(new com.facebook.ads.redexgen.core.I4(this.A0d));
                        listSingletonList = imA09.A04;
                        this.A0M = imA09.A02;
                        break;
                    case 7:
                        strA04 = A01(900, 10, 63);
                        com.facebook.ads.redexgen.core.IS isA09 = com.facebook.ads.redexgen.core.IS.A00(new com.facebook.ads.redexgen.core.I4(this.A0d));
                        listSingletonList = isA09.A01;
                        this.A0M = isA09.A00;
                        break;
                    case 8:
                        android.util.Pair<java.lang.String, java.util.List<byte[]>> pairA09 = A00(new com.facebook.ads.redexgen.core.I4(this.A0d));
                        strA04 = (java.lang.String) pairA09.first;
                        listSingletonList = (java.util.List) pairA09.second;
                        break;
                    case 9:
                        strA04 = A01(944, 15, 65);
                        break;
                    case 10:
                        strA04 = A01(841, 12, 73);
                        i8 = 8192;
                        listSingletonList = A03(this.A0d);
                        break;
                    case 11:
                        strA04 = A01(780, 10, 12);
                        i8 = 5760;
                        listSingletonList = new java.util.ArrayList(3);
                        listSingletonList.add(this.A0d);
                        listSingletonList.add(java.nio.ByteBuffer.allocate(8).order(java.nio.ByteOrder.nativeOrder()).putLong(this.A0S).array());
                        listSingletonList.add(java.nio.ByteBuffer.allocate(8).order(java.nio.ByteOrder.nativeOrder()).putLong(this.A0T).array());
                        break;
                    case 12:
                        strA04 = A01(742, 15, 82);
                        listSingletonList = java.util.Collections.singletonList(this.A0d);
                        break;
                    case 13:
                        strA04 = A01(767, 13, 7);
                        i8 = 4096;
                        break;
                    case 14:
                        strA04 = A01(757, 10, 14);
                        i8 = 4096;
                        break;
                    case 15:
                        strA04 = A01(713, 9, 14);
                        break;
                    case 16:
                        strA04 = A01(722, 10, 6);
                        break;
                    case 17:
                        strA04 = A01(799, 13, 106);
                        this.A0X = new com.facebook.ads.redexgen.core.CK();
                        break;
                    case 18:
                    case 19:
                        strA04 = A01(812, 13, 34);
                        break;
                    case 20:
                        strA04 = A01(825, 16, 26);
                        break;
                    case 21:
                        strA04 = A01(732, 10, 43);
                        listSingletonList = java.util.Collections.singletonList(this.A0d);
                        break;
                    case 22:
                        strA04 = A01(790, 9, 116);
                        if (A05(new com.facebook.ads.redexgen.core.I4(this.A0d))) {
                            iA02 = com.facebook.ads.redexgen.core.IK.A02(this.A0A);
                            strArr = A0i;
                            if (strArr[1].charAt(16) != strArr[3].charAt(16)) {
                                if (iA02 == 0) {
                                    iA02 = -1;
                                    strA04 = A01(853, 15, 46);
                                    android.util.Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                                }
                            } else {
                                java.lang.String[] strArr14 = A0i;
                                strArr14[1] = "UnFAd4XuJDxSuzaFoeREgVc6Qs0OmmYm";
                                strArr14[3] = "dBM5Episk82aAApxomIpqdyXT7zAdwmF";
                                if (iA02 == 0) {
                                    iA02 = -1;
                                    strA04 = A01(853, 15, 46);
                                    android.util.Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                                }
                            }
                        } else {
                            strA04 = A01(853, 15, 46);
                            android.util.Log.w(strA03, A01(com.google.android.gms.nearby.messages.Strategy.TTL_SECONDS_DEFAULT, 51, 25) + strA04);
                        }
                        break;
                    case 23:
                        strA04 = A01(790, 9, 116);
                        iA02 = com.facebook.ads.redexgen.core.IK.A02(this.A0A);
                        if (iA02 == 0) {
                            iA02 = -1;
                            strA04 = A01(853, 15, 46);
                            android.util.Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                        }
                        break;
                    case 24:
                        strA04 = A01(693, 20, 122);
                        break;
                    case 25:
                        strA04 = A01(871, 10, 58);
                        break;
                    case 26:
                        strA04 = A01(675, 18, 76);
                        listSingletonList = java.util.Collections.singletonList(this.A0d);
                        break;
                    case 27:
                        strA04 = A01(660, 15, 82);
                        break;
                    case 28:
                        strA04 = A01(641, 19, 91);
                        listSingletonList = java.util.Collections.singletonList(new byte[]{this.A0d[0], this.A0d[1], this.A0d[2], this.A0d[3]});
                        break;
                    default:
                        throw new com.facebook.ads.redexgen.core.A0(A01(470, 30, 89));
                }
                i2 = 0 | (this.A0Z ? 1 : 0) | (this.A0a ? 2 : 0);
                if (com.facebook.ads.redexgen.core.AbstractC0748Hx.A09(strA04)) {
                    i3 = 1;
                    string = java.lang.Integer.toString(i);
                    i6 = this.A0B;
                    i7 = this.A0O;
                    drmInitData = this.A0U;
                    str = this.A0g;
                    strArr2 = A0i;
                    if (strArr2[0].charAt(30) != strArr2[5].charAt(30)) {
                        A0i[2] = "ixQpJ1YMOGXZaJaexLrRt7cPJpDFAOI0";
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A06(string, strA04, null, -1, i8, i6, i7, iA02, listSingletonList, drmInitData, i2, str);
                    } else {
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A06(string, strA04, null, -1, i8, i6, i7, iA02, listSingletonList, drmInitData, i2, str);
                    }
                } else {
                    if (com.facebook.ads.redexgen.core.AbstractC0748Hx.A0B(strA04)) {
                        i3 = 2;
                        if (this.A0H == 0) {
                            if (this.A0I == -1) {
                                i4 = this.A0R;
                            } else {
                                i4 = this.A0I;
                            }
                            this.A0I = i4;
                            if (this.A0G == -1) {
                                i5 = this.A0J;
                            } else {
                                i5 = this.A0G;
                            }
                            this.A0G = i5;
                        }
                        f = -1.0f;
                        if (this.A0I != -1) {
                            f = (this.A0J * this.A0I) / (this.A0R * this.A0G);
                        }
                        colorInfo = null;
                        if (this.A0b) {
                            colorInfo = new com.facebook.ads.internal.exoplayer2.thirdparty.video.ColorInfo(this.A0D, this.A0C, this.A0E, A06());
                        }
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A04(java.lang.Integer.toString(i), strA04, null, -1, i8, this.A0R, this.A0J, -1.0f, listSingletonList, -1, f, this.A0e, this.A0P, colorInfo, this.A0U);
                    } else if (A01(693, 20, 122).equals(strA04)) {
                        i3 = 3;
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A01(java.lang.Integer.toString(i), strA04, i2, this.A0g, this.A0U);
                    } else if (A01(871, 10, 58).equals(strA04)) {
                        i3 = 3;
                        java.util.ArrayList arrayList10 = new java.util.ArrayList(2);
                        arrayList10.add(com.facebook.ads.redexgen.core.C1157Yc.A0t);
                        arrayList10.add(this.A0d);
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A09(java.lang.Integer.toString(i), strA04, null, -1, i2, this.A0g, -1, this.A0U, Long.MAX_VALUE, arrayList10);
                    } else {
                        if (!A01(675, 18, 76).equals(strA04)) {
                        }
                        i3 = 3;
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A0A(java.lang.Integer.toString(i), strA04, null, -1, i2, listSingletonList, this.A0g, this.A0U);
                    }
                    break;
                }
                this.A0W = interfaceC0611Bz.AHA(this.A0N, i3);
                this.A0W.A69(formatA0A);
                return;
            case -538363109:
                if (A0i[2].charAt(8) == '7') {
                    throw new java.lang.RuntimeException();
                }
                A0i[2] = "MxmMeAmCLQ1GBhYuGrrFda3C1qiAYFLr";
                if (str2.equals(A01(563, 15, 118))) {
                    b = 6;
                } else {
                    b = -1;
                }
                strA01 = A01(0, 22, 11);
                strA02 = A01(500, 27, 65);
                strA03 = A01(283, 17, 42);
                switch (b) {
                    case 0:
                        strA04 = A01(959, 19, 57);
                        break;
                    case 1:
                        strA04 = A01(978, 19, 62);
                        break;
                    case 2:
                        strA04 = A01(923, 11, 95);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        strA04 = A01(910, 13, 82);
                        if (this.A0d == null) {
                            listSingletonList = java.util.Collections.singletonList(this.A0d);
                        } else {
                            listSingletonList = null;
                        }
                        break;
                    case 6:
                        strA04 = A01(891, 9, 111);
                        com.facebook.ads.redexgen.core.IM imA010 = com.facebook.ads.redexgen.core.IM.A00(new com.facebook.ads.redexgen.core.I4(this.A0d));
                        listSingletonList = imA010.A04;
                        this.A0M = imA010.A02;
                        break;
                    case 7:
                        strA04 = A01(900, 10, 63);
                        com.facebook.ads.redexgen.core.IS isA010 = com.facebook.ads.redexgen.core.IS.A00(new com.facebook.ads.redexgen.core.I4(this.A0d));
                        listSingletonList = isA010.A01;
                        this.A0M = isA010.A00;
                        break;
                    case 8:
                        android.util.Pair<java.lang.String, java.util.List<byte[]>> pairA010 = A00(new com.facebook.ads.redexgen.core.I4(this.A0d));
                        strA04 = (java.lang.String) pairA010.first;
                        listSingletonList = (java.util.List) pairA010.second;
                        break;
                    case 9:
                        strA04 = A01(944, 15, 65);
                        break;
                    case 10:
                        strA04 = A01(841, 12, 73);
                        i8 = 8192;
                        listSingletonList = A03(this.A0d);
                        break;
                    case 11:
                        strA04 = A01(780, 10, 12);
                        i8 = 5760;
                        listSingletonList = new java.util.ArrayList(3);
                        listSingletonList.add(this.A0d);
                        listSingletonList.add(java.nio.ByteBuffer.allocate(8).order(java.nio.ByteOrder.nativeOrder()).putLong(this.A0S).array());
                        listSingletonList.add(java.nio.ByteBuffer.allocate(8).order(java.nio.ByteOrder.nativeOrder()).putLong(this.A0T).array());
                        break;
                    case 12:
                        strA04 = A01(742, 15, 82);
                        listSingletonList = java.util.Collections.singletonList(this.A0d);
                        break;
                    case 13:
                        strA04 = A01(767, 13, 7);
                        i8 = 4096;
                        break;
                    case 14:
                        strA04 = A01(757, 10, 14);
                        i8 = 4096;
                        break;
                    case 15:
                        strA04 = A01(713, 9, 14);
                        break;
                    case 16:
                        strA04 = A01(722, 10, 6);
                        break;
                    case 17:
                        strA04 = A01(799, 13, 106);
                        this.A0X = new com.facebook.ads.redexgen.core.CK();
                        break;
                    case 18:
                    case 19:
                        strA04 = A01(812, 13, 34);
                        break;
                    case 20:
                        strA04 = A01(825, 16, 26);
                        break;
                    case 21:
                        strA04 = A01(732, 10, 43);
                        listSingletonList = java.util.Collections.singletonList(this.A0d);
                        break;
                    case 22:
                        strA04 = A01(790, 9, 116);
                        if (A05(new com.facebook.ads.redexgen.core.I4(this.A0d))) {
                            iA02 = com.facebook.ads.redexgen.core.IK.A02(this.A0A);
                            strArr = A0i;
                            if (strArr[1].charAt(16) != strArr[3].charAt(16)) {
                                if (iA02 == 0) {
                                    iA02 = -1;
                                    strA04 = A01(853, 15, 46);
                                    android.util.Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                                }
                            } else {
                                java.lang.String[] strArr15 = A0i;
                                strArr15[1] = "UnFAd4XuJDxSuzaFoeREgVc6Qs0OmmYm";
                                strArr15[3] = "dBM5Episk82aAApxomIpqdyXT7zAdwmF";
                                if (iA02 == 0) {
                                    iA02 = -1;
                                    strA04 = A01(853, 15, 46);
                                    android.util.Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                                }
                            }
                        } else {
                            strA04 = A01(853, 15, 46);
                            android.util.Log.w(strA03, A01(com.google.android.gms.nearby.messages.Strategy.TTL_SECONDS_DEFAULT, 51, 25) + strA04);
                        }
                        break;
                    case 23:
                        strA04 = A01(790, 9, 116);
                        iA02 = com.facebook.ads.redexgen.core.IK.A02(this.A0A);
                        if (iA02 == 0) {
                            iA02 = -1;
                            strA04 = A01(853, 15, 46);
                            android.util.Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                        }
                        break;
                    case 24:
                        strA04 = A01(693, 20, 122);
                        break;
                    case 25:
                        strA04 = A01(871, 10, 58);
                        break;
                    case 26:
                        strA04 = A01(675, 18, 76);
                        listSingletonList = java.util.Collections.singletonList(this.A0d);
                        break;
                    case 27:
                        strA04 = A01(660, 15, 82);
                        break;
                    case 28:
                        strA04 = A01(641, 19, 91);
                        listSingletonList = java.util.Collections.singletonList(new byte[]{this.A0d[0], this.A0d[1], this.A0d[2], this.A0d[3]});
                        break;
                    default:
                        throw new com.facebook.ads.redexgen.core.A0(A01(470, 30, 89));
                }
                i2 = 0 | (this.A0Z ? 1 : 0) | (this.A0a ? 2 : 0);
                if (com.facebook.ads.redexgen.core.AbstractC0748Hx.A09(strA04)) {
                    i3 = 1;
                    string = java.lang.Integer.toString(i);
                    i6 = this.A0B;
                    i7 = this.A0O;
                    drmInitData = this.A0U;
                    str = this.A0g;
                    strArr2 = A0i;
                    if (strArr2[0].charAt(30) != strArr2[5].charAt(30)) {
                        A0i[2] = "ixQpJ1YMOGXZaJaexLrRt7cPJpDFAOI0";
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A06(string, strA04, null, -1, i8, i6, i7, iA02, listSingletonList, drmInitData, i2, str);
                    } else {
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A06(string, strA04, null, -1, i8, i6, i7, iA02, listSingletonList, drmInitData, i2, str);
                    }
                } else {
                    if (com.facebook.ads.redexgen.core.AbstractC0748Hx.A0B(strA04)) {
                        i3 = 2;
                        if (this.A0H == 0) {
                            if (this.A0I == -1) {
                                i4 = this.A0R;
                            } else {
                                i4 = this.A0I;
                            }
                            this.A0I = i4;
                            if (this.A0G == -1) {
                                i5 = this.A0J;
                            } else {
                                i5 = this.A0G;
                            }
                            this.A0G = i5;
                        }
                        f = -1.0f;
                        if (this.A0I != -1) {
                            f = (this.A0J * this.A0I) / (this.A0R * this.A0G);
                        }
                        colorInfo = null;
                        if (this.A0b) {
                            colorInfo = new com.facebook.ads.internal.exoplayer2.thirdparty.video.ColorInfo(this.A0D, this.A0C, this.A0E, A06());
                        }
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A04(java.lang.Integer.toString(i), strA04, null, -1, i8, this.A0R, this.A0J, -1.0f, listSingletonList, -1, f, this.A0e, this.A0P, colorInfo, this.A0U);
                    } else if (A01(693, 20, 122).equals(strA04)) {
                        i3 = 3;
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A01(java.lang.Integer.toString(i), strA04, i2, this.A0g, this.A0U);
                    } else if (A01(871, 10, 58).equals(strA04)) {
                        i3 = 3;
                        java.util.ArrayList arrayList11 = new java.util.ArrayList(2);
                        arrayList11.add(com.facebook.ads.redexgen.core.C1157Yc.A0t);
                        arrayList11.add(this.A0d);
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A09(java.lang.Integer.toString(i), strA04, null, -1, i2, this.A0g, -1, this.A0U, Long.MAX_VALUE, arrayList11);
                    } else {
                        if (!A01(675, 18, 76).equals(strA04)) {
                        }
                        i3 = 3;
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A0A(java.lang.Integer.toString(i), strA04, null, -1, i2, listSingletonList, this.A0g, this.A0U);
                    }
                    break;
                }
                this.A0W = interfaceC0611Bz.AHA(this.A0N, i3);
                this.A0W.A69(formatA0A);
                return;
            case -425012669:
                if (str2.equals(A01(390, 8, 124))) {
                    b = 26;
                } else {
                    b = -1;
                }
                strA01 = A01(0, 22, 11);
                strA02 = A01(500, 27, 65);
                strA03 = A01(283, 17, 42);
                switch (b) {
                    case 0:
                        strA04 = A01(959, 19, 57);
                        break;
                    case 1:
                        strA04 = A01(978, 19, 62);
                        break;
                    case 2:
                        strA04 = A01(923, 11, 95);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        strA04 = A01(910, 13, 82);
                        if (this.A0d == null) {
                            listSingletonList = java.util.Collections.singletonList(this.A0d);
                        } else {
                            listSingletonList = null;
                        }
                        break;
                    case 6:
                        strA04 = A01(891, 9, 111);
                        com.facebook.ads.redexgen.core.IM imA011 = com.facebook.ads.redexgen.core.IM.A00(new com.facebook.ads.redexgen.core.I4(this.A0d));
                        listSingletonList = imA011.A04;
                        this.A0M = imA011.A02;
                        break;
                    case 7:
                        strA04 = A01(900, 10, 63);
                        com.facebook.ads.redexgen.core.IS isA011 = com.facebook.ads.redexgen.core.IS.A00(new com.facebook.ads.redexgen.core.I4(this.A0d));
                        listSingletonList = isA011.A01;
                        this.A0M = isA011.A00;
                        break;
                    case 8:
                        android.util.Pair<java.lang.String, java.util.List<byte[]>> pairA011 = A00(new com.facebook.ads.redexgen.core.I4(this.A0d));
                        strA04 = (java.lang.String) pairA011.first;
                        listSingletonList = (java.util.List) pairA011.second;
                        break;
                    case 9:
                        strA04 = A01(944, 15, 65);
                        break;
                    case 10:
                        strA04 = A01(841, 12, 73);
                        i8 = 8192;
                        listSingletonList = A03(this.A0d);
                        break;
                    case 11:
                        strA04 = A01(780, 10, 12);
                        i8 = 5760;
                        listSingletonList = new java.util.ArrayList(3);
                        listSingletonList.add(this.A0d);
                        listSingletonList.add(java.nio.ByteBuffer.allocate(8).order(java.nio.ByteOrder.nativeOrder()).putLong(this.A0S).array());
                        listSingletonList.add(java.nio.ByteBuffer.allocate(8).order(java.nio.ByteOrder.nativeOrder()).putLong(this.A0T).array());
                        break;
                    case 12:
                        strA04 = A01(742, 15, 82);
                        listSingletonList = java.util.Collections.singletonList(this.A0d);
                        break;
                    case 13:
                        strA04 = A01(767, 13, 7);
                        i8 = 4096;
                        break;
                    case 14:
                        strA04 = A01(757, 10, 14);
                        i8 = 4096;
                        break;
                    case 15:
                        strA04 = A01(713, 9, 14);
                        break;
                    case 16:
                        strA04 = A01(722, 10, 6);
                        break;
                    case 17:
                        strA04 = A01(799, 13, 106);
                        this.A0X = new com.facebook.ads.redexgen.core.CK();
                        break;
                    case 18:
                    case 19:
                        strA04 = A01(812, 13, 34);
                        break;
                    case 20:
                        strA04 = A01(825, 16, 26);
                        break;
                    case 21:
                        strA04 = A01(732, 10, 43);
                        listSingletonList = java.util.Collections.singletonList(this.A0d);
                        break;
                    case 22:
                        strA04 = A01(790, 9, 116);
                        if (A05(new com.facebook.ads.redexgen.core.I4(this.A0d))) {
                            iA02 = com.facebook.ads.redexgen.core.IK.A02(this.A0A);
                            strArr = A0i;
                            if (strArr[1].charAt(16) != strArr[3].charAt(16)) {
                                if (iA02 == 0) {
                                    iA02 = -1;
                                    strA04 = A01(853, 15, 46);
                                    android.util.Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                                }
                            } else {
                                java.lang.String[] strArr16 = A0i;
                                strArr16[1] = "UnFAd4XuJDxSuzaFoeREgVc6Qs0OmmYm";
                                strArr16[3] = "dBM5Episk82aAApxomIpqdyXT7zAdwmF";
                                if (iA02 == 0) {
                                    iA02 = -1;
                                    strA04 = A01(853, 15, 46);
                                    android.util.Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                                }
                            }
                        } else {
                            strA04 = A01(853, 15, 46);
                            android.util.Log.w(strA03, A01(com.google.android.gms.nearby.messages.Strategy.TTL_SECONDS_DEFAULT, 51, 25) + strA04);
                        }
                        break;
                    case 23:
                        strA04 = A01(790, 9, 116);
                        iA02 = com.facebook.ads.redexgen.core.IK.A02(this.A0A);
                        if (iA02 == 0) {
                            iA02 = -1;
                            strA04 = A01(853, 15, 46);
                            android.util.Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                        }
                        break;
                    case 24:
                        strA04 = A01(693, 20, 122);
                        break;
                    case 25:
                        strA04 = A01(871, 10, 58);
                        break;
                    case 26:
                        strA04 = A01(675, 18, 76);
                        listSingletonList = java.util.Collections.singletonList(this.A0d);
                        break;
                    case 27:
                        strA04 = A01(660, 15, 82);
                        break;
                    case 28:
                        strA04 = A01(641, 19, 91);
                        listSingletonList = java.util.Collections.singletonList(new byte[]{this.A0d[0], this.A0d[1], this.A0d[2], this.A0d[3]});
                        break;
                    default:
                        throw new com.facebook.ads.redexgen.core.A0(A01(470, 30, 89));
                }
                i2 = 0 | (this.A0Z ? 1 : 0) | (this.A0a ? 2 : 0);
                if (com.facebook.ads.redexgen.core.AbstractC0748Hx.A09(strA04)) {
                    i3 = 1;
                    string = java.lang.Integer.toString(i);
                    i6 = this.A0B;
                    i7 = this.A0O;
                    drmInitData = this.A0U;
                    str = this.A0g;
                    strArr2 = A0i;
                    if (strArr2[0].charAt(30) != strArr2[5].charAt(30)) {
                        A0i[2] = "ixQpJ1YMOGXZaJaexLrRt7cPJpDFAOI0";
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A06(string, strA04, null, -1, i8, i6, i7, iA02, listSingletonList, drmInitData, i2, str);
                    } else {
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A06(string, strA04, null, -1, i8, i6, i7, iA02, listSingletonList, drmInitData, i2, str);
                    }
                } else {
                    if (com.facebook.ads.redexgen.core.AbstractC0748Hx.A0B(strA04)) {
                        i3 = 2;
                        if (this.A0H == 0) {
                            if (this.A0I == -1) {
                                i4 = this.A0R;
                            } else {
                                i4 = this.A0I;
                            }
                            this.A0I = i4;
                            if (this.A0G == -1) {
                                i5 = this.A0J;
                            } else {
                                i5 = this.A0G;
                            }
                            this.A0G = i5;
                        }
                        f = -1.0f;
                        if (this.A0I != -1) {
                            f = (this.A0J * this.A0I) / (this.A0R * this.A0G);
                        }
                        colorInfo = null;
                        if (this.A0b) {
                            colorInfo = new com.facebook.ads.internal.exoplayer2.thirdparty.video.ColorInfo(this.A0D, this.A0C, this.A0E, A06());
                        }
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A04(java.lang.Integer.toString(i), strA04, null, -1, i8, this.A0R, this.A0J, -1.0f, listSingletonList, -1, f, this.A0e, this.A0P, colorInfo, this.A0U);
                    } else if (A01(693, 20, 122).equals(strA04)) {
                        i3 = 3;
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A01(java.lang.Integer.toString(i), strA04, i2, this.A0g, this.A0U);
                    } else if (A01(871, 10, 58).equals(strA04)) {
                        i3 = 3;
                        java.util.ArrayList arrayList12 = new java.util.ArrayList(2);
                        arrayList12.add(com.facebook.ads.redexgen.core.C1157Yc.A0t);
                        arrayList12.add(this.A0d);
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A09(java.lang.Integer.toString(i), strA04, null, -1, i2, this.A0g, -1, this.A0U, Long.MAX_VALUE, arrayList12);
                    } else {
                        if (!A01(675, 18, 76).equals(strA04)) {
                        }
                        i3 = 3;
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A0A(java.lang.Integer.toString(i), strA04, null, -1, i2, listSingletonList, this.A0g, this.A0U);
                    }
                    break;
                }
                this.A0W = interfaceC0611Bz.AHA(this.A0N, i3);
                this.A0W.A69(formatA0A);
                return;
            case -356037306:
                if (str2.equals(A01(50, 14, 77))) {
                    b = 20;
                } else {
                    b = -1;
                }
                strA01 = A01(0, 22, 11);
                strA02 = A01(500, 27, 65);
                strA03 = A01(283, 17, 42);
                switch (b) {
                    case 0:
                        strA04 = A01(959, 19, 57);
                        break;
                    case 1:
                        strA04 = A01(978, 19, 62);
                        break;
                    case 2:
                        strA04 = A01(923, 11, 95);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        strA04 = A01(910, 13, 82);
                        if (this.A0d == null) {
                            listSingletonList = java.util.Collections.singletonList(this.A0d);
                        } else {
                            listSingletonList = null;
                        }
                        break;
                    case 6:
                        strA04 = A01(891, 9, 111);
                        com.facebook.ads.redexgen.core.IM imA012 = com.facebook.ads.redexgen.core.IM.A00(new com.facebook.ads.redexgen.core.I4(this.A0d));
                        listSingletonList = imA012.A04;
                        this.A0M = imA012.A02;
                        break;
                    case 7:
                        strA04 = A01(900, 10, 63);
                        com.facebook.ads.redexgen.core.IS isA012 = com.facebook.ads.redexgen.core.IS.A00(new com.facebook.ads.redexgen.core.I4(this.A0d));
                        listSingletonList = isA012.A01;
                        this.A0M = isA012.A00;
                        break;
                    case 8:
                        android.util.Pair<java.lang.String, java.util.List<byte[]>> pairA012 = A00(new com.facebook.ads.redexgen.core.I4(this.A0d));
                        strA04 = (java.lang.String) pairA012.first;
                        listSingletonList = (java.util.List) pairA012.second;
                        break;
                    case 9:
                        strA04 = A01(944, 15, 65);
                        break;
                    case 10:
                        strA04 = A01(841, 12, 73);
                        i8 = 8192;
                        listSingletonList = A03(this.A0d);
                        break;
                    case 11:
                        strA04 = A01(780, 10, 12);
                        i8 = 5760;
                        listSingletonList = new java.util.ArrayList(3);
                        listSingletonList.add(this.A0d);
                        listSingletonList.add(java.nio.ByteBuffer.allocate(8).order(java.nio.ByteOrder.nativeOrder()).putLong(this.A0S).array());
                        listSingletonList.add(java.nio.ByteBuffer.allocate(8).order(java.nio.ByteOrder.nativeOrder()).putLong(this.A0T).array());
                        break;
                    case 12:
                        strA04 = A01(742, 15, 82);
                        listSingletonList = java.util.Collections.singletonList(this.A0d);
                        break;
                    case 13:
                        strA04 = A01(767, 13, 7);
                        i8 = 4096;
                        break;
                    case 14:
                        strA04 = A01(757, 10, 14);
                        i8 = 4096;
                        break;
                    case 15:
                        strA04 = A01(713, 9, 14);
                        break;
                    case 16:
                        strA04 = A01(722, 10, 6);
                        break;
                    case 17:
                        strA04 = A01(799, 13, 106);
                        this.A0X = new com.facebook.ads.redexgen.core.CK();
                        break;
                    case 18:
                    case 19:
                        strA04 = A01(812, 13, 34);
                        break;
                    case 20:
                        strA04 = A01(825, 16, 26);
                        break;
                    case 21:
                        strA04 = A01(732, 10, 43);
                        listSingletonList = java.util.Collections.singletonList(this.A0d);
                        break;
                    case 22:
                        strA04 = A01(790, 9, 116);
                        if (A05(new com.facebook.ads.redexgen.core.I4(this.A0d))) {
                            iA02 = com.facebook.ads.redexgen.core.IK.A02(this.A0A);
                            strArr = A0i;
                            if (strArr[1].charAt(16) != strArr[3].charAt(16)) {
                                if (iA02 == 0) {
                                    iA02 = -1;
                                    strA04 = A01(853, 15, 46);
                                    android.util.Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                                }
                            } else {
                                java.lang.String[] strArr17 = A0i;
                                strArr17[1] = "UnFAd4XuJDxSuzaFoeREgVc6Qs0OmmYm";
                                strArr17[3] = "dBM5Episk82aAApxomIpqdyXT7zAdwmF";
                                if (iA02 == 0) {
                                    iA02 = -1;
                                    strA04 = A01(853, 15, 46);
                                    android.util.Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                                }
                            }
                        } else {
                            strA04 = A01(853, 15, 46);
                            android.util.Log.w(strA03, A01(com.google.android.gms.nearby.messages.Strategy.TTL_SECONDS_DEFAULT, 51, 25) + strA04);
                        }
                        break;
                    case 23:
                        strA04 = A01(790, 9, 116);
                        iA02 = com.facebook.ads.redexgen.core.IK.A02(this.A0A);
                        if (iA02 == 0) {
                            iA02 = -1;
                            strA04 = A01(853, 15, 46);
                            android.util.Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                        }
                        break;
                    case 24:
                        strA04 = A01(693, 20, 122);
                        break;
                    case 25:
                        strA04 = A01(871, 10, 58);
                        break;
                    case 26:
                        strA04 = A01(675, 18, 76);
                        listSingletonList = java.util.Collections.singletonList(this.A0d);
                        break;
                    case 27:
                        strA04 = A01(660, 15, 82);
                        break;
                    case 28:
                        strA04 = A01(641, 19, 91);
                        listSingletonList = java.util.Collections.singletonList(new byte[]{this.A0d[0], this.A0d[1], this.A0d[2], this.A0d[3]});
                        break;
                    default:
                        throw new com.facebook.ads.redexgen.core.A0(A01(470, 30, 89));
                }
                i2 = 0 | (this.A0Z ? 1 : 0) | (this.A0a ? 2 : 0);
                if (com.facebook.ads.redexgen.core.AbstractC0748Hx.A09(strA04)) {
                    i3 = 1;
                    string = java.lang.Integer.toString(i);
                    i6 = this.A0B;
                    i7 = this.A0O;
                    drmInitData = this.A0U;
                    str = this.A0g;
                    strArr2 = A0i;
                    if (strArr2[0].charAt(30) != strArr2[5].charAt(30)) {
                        A0i[2] = "ixQpJ1YMOGXZaJaexLrRt7cPJpDFAOI0";
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A06(string, strA04, null, -1, i8, i6, i7, iA02, listSingletonList, drmInitData, i2, str);
                    } else {
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A06(string, strA04, null, -1, i8, i6, i7, iA02, listSingletonList, drmInitData, i2, str);
                    }
                } else {
                    if (com.facebook.ads.redexgen.core.AbstractC0748Hx.A0B(strA04)) {
                        i3 = 2;
                        if (this.A0H == 0) {
                            if (this.A0I == -1) {
                                i4 = this.A0R;
                            } else {
                                i4 = this.A0I;
                            }
                            this.A0I = i4;
                            if (this.A0G == -1) {
                                i5 = this.A0J;
                            } else {
                                i5 = this.A0G;
                            }
                            this.A0G = i5;
                        }
                        f = -1.0f;
                        if (this.A0I != -1) {
                            f = (this.A0J * this.A0I) / (this.A0R * this.A0G);
                        }
                        colorInfo = null;
                        if (this.A0b) {
                            colorInfo = new com.facebook.ads.internal.exoplayer2.thirdparty.video.ColorInfo(this.A0D, this.A0C, this.A0E, A06());
                        }
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A04(java.lang.Integer.toString(i), strA04, null, -1, i8, this.A0R, this.A0J, -1.0f, listSingletonList, -1, f, this.A0e, this.A0P, colorInfo, this.A0U);
                    } else if (A01(693, 20, 122).equals(strA04)) {
                        i3 = 3;
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A01(java.lang.Integer.toString(i), strA04, i2, this.A0g, this.A0U);
                    } else if (A01(871, 10, 58).equals(strA04)) {
                        i3 = 3;
                        java.util.ArrayList arrayList13 = new java.util.ArrayList(2);
                        arrayList13.add(com.facebook.ads.redexgen.core.C1157Yc.A0t);
                        arrayList13.add(this.A0d);
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A09(java.lang.Integer.toString(i), strA04, null, -1, i2, this.A0g, -1, this.A0U, Long.MAX_VALUE, arrayList13);
                    } else {
                        if (!A01(675, 18, 76).equals(strA04)) {
                        }
                        i3 = 3;
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A0A(java.lang.Integer.toString(i), strA04, null, -1, i2, listSingletonList, this.A0g, this.A0U);
                    }
                    break;
                }
                this.A0W = interfaceC0611Bz.AHA(this.A0N, i3);
                this.A0W.A69(formatA0A);
                return;
            case 62923557:
                if (str2.equals(A01(22, 5, 13))) {
                    b = 12;
                } else {
                    b = -1;
                }
                strA01 = A01(0, 22, 11);
                strA02 = A01(500, 27, 65);
                strA03 = A01(283, 17, 42);
                switch (b) {
                    case 0:
                        strA04 = A01(959, 19, 57);
                        break;
                    case 1:
                        strA04 = A01(978, 19, 62);
                        break;
                    case 2:
                        strA04 = A01(923, 11, 95);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        strA04 = A01(910, 13, 82);
                        if (this.A0d == null) {
                            listSingletonList = java.util.Collections.singletonList(this.A0d);
                        } else {
                            listSingletonList = null;
                        }
                        break;
                    case 6:
                        strA04 = A01(891, 9, 111);
                        com.facebook.ads.redexgen.core.IM imA013 = com.facebook.ads.redexgen.core.IM.A00(new com.facebook.ads.redexgen.core.I4(this.A0d));
                        listSingletonList = imA013.A04;
                        this.A0M = imA013.A02;
                        break;
                    case 7:
                        strA04 = A01(900, 10, 63);
                        com.facebook.ads.redexgen.core.IS isA013 = com.facebook.ads.redexgen.core.IS.A00(new com.facebook.ads.redexgen.core.I4(this.A0d));
                        listSingletonList = isA013.A01;
                        this.A0M = isA013.A00;
                        break;
                    case 8:
                        android.util.Pair<java.lang.String, java.util.List<byte[]>> pairA013 = A00(new com.facebook.ads.redexgen.core.I4(this.A0d));
                        strA04 = (java.lang.String) pairA013.first;
                        listSingletonList = (java.util.List) pairA013.second;
                        break;
                    case 9:
                        strA04 = A01(944, 15, 65);
                        break;
                    case 10:
                        strA04 = A01(841, 12, 73);
                        i8 = 8192;
                        listSingletonList = A03(this.A0d);
                        break;
                    case 11:
                        strA04 = A01(780, 10, 12);
                        i8 = 5760;
                        listSingletonList = new java.util.ArrayList(3);
                        listSingletonList.add(this.A0d);
                        listSingletonList.add(java.nio.ByteBuffer.allocate(8).order(java.nio.ByteOrder.nativeOrder()).putLong(this.A0S).array());
                        listSingletonList.add(java.nio.ByteBuffer.allocate(8).order(java.nio.ByteOrder.nativeOrder()).putLong(this.A0T).array());
                        break;
                    case 12:
                        strA04 = A01(742, 15, 82);
                        listSingletonList = java.util.Collections.singletonList(this.A0d);
                        break;
                    case 13:
                        strA04 = A01(767, 13, 7);
                        i8 = 4096;
                        break;
                    case 14:
                        strA04 = A01(757, 10, 14);
                        i8 = 4096;
                        break;
                    case 15:
                        strA04 = A01(713, 9, 14);
                        break;
                    case 16:
                        strA04 = A01(722, 10, 6);
                        break;
                    case 17:
                        strA04 = A01(799, 13, 106);
                        this.A0X = new com.facebook.ads.redexgen.core.CK();
                        break;
                    case 18:
                    case 19:
                        strA04 = A01(812, 13, 34);
                        break;
                    case 20:
                        strA04 = A01(825, 16, 26);
                        break;
                    case 21:
                        strA04 = A01(732, 10, 43);
                        listSingletonList = java.util.Collections.singletonList(this.A0d);
                        break;
                    case 22:
                        strA04 = A01(790, 9, 116);
                        if (A05(new com.facebook.ads.redexgen.core.I4(this.A0d))) {
                            iA02 = com.facebook.ads.redexgen.core.IK.A02(this.A0A);
                            strArr = A0i;
                            if (strArr[1].charAt(16) != strArr[3].charAt(16)) {
                                if (iA02 == 0) {
                                    iA02 = -1;
                                    strA04 = A01(853, 15, 46);
                                    android.util.Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                                }
                            } else {
                                java.lang.String[] strArr18 = A0i;
                                strArr18[1] = "UnFAd4XuJDxSuzaFoeREgVc6Qs0OmmYm";
                                strArr18[3] = "dBM5Episk82aAApxomIpqdyXT7zAdwmF";
                                if (iA02 == 0) {
                                    iA02 = -1;
                                    strA04 = A01(853, 15, 46);
                                    android.util.Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                                }
                            }
                        } else {
                            strA04 = A01(853, 15, 46);
                            android.util.Log.w(strA03, A01(com.google.android.gms.nearby.messages.Strategy.TTL_SECONDS_DEFAULT, 51, 25) + strA04);
                        }
                        break;
                    case 23:
                        strA04 = A01(790, 9, 116);
                        iA02 = com.facebook.ads.redexgen.core.IK.A02(this.A0A);
                        if (iA02 == 0) {
                            iA02 = -1;
                            strA04 = A01(853, 15, 46);
                            android.util.Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                        }
                        break;
                    case 24:
                        strA04 = A01(693, 20, 122);
                        break;
                    case 25:
                        strA04 = A01(871, 10, 58);
                        break;
                    case 26:
                        strA04 = A01(675, 18, 76);
                        listSingletonList = java.util.Collections.singletonList(this.A0d);
                        break;
                    case 27:
                        strA04 = A01(660, 15, 82);
                        break;
                    case 28:
                        strA04 = A01(641, 19, 91);
                        listSingletonList = java.util.Collections.singletonList(new byte[]{this.A0d[0], this.A0d[1], this.A0d[2], this.A0d[3]});
                        break;
                    default:
                        throw new com.facebook.ads.redexgen.core.A0(A01(470, 30, 89));
                }
                i2 = 0 | (this.A0Z ? 1 : 0) | (this.A0a ? 2 : 0);
                if (com.facebook.ads.redexgen.core.AbstractC0748Hx.A09(strA04)) {
                    i3 = 1;
                    string = java.lang.Integer.toString(i);
                    i6 = this.A0B;
                    i7 = this.A0O;
                    drmInitData = this.A0U;
                    str = this.A0g;
                    strArr2 = A0i;
                    if (strArr2[0].charAt(30) != strArr2[5].charAt(30)) {
                        A0i[2] = "ixQpJ1YMOGXZaJaexLrRt7cPJpDFAOI0";
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A06(string, strA04, null, -1, i8, i6, i7, iA02, listSingletonList, drmInitData, i2, str);
                    } else {
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A06(string, strA04, null, -1, i8, i6, i7, iA02, listSingletonList, drmInitData, i2, str);
                    }
                } else {
                    if (com.facebook.ads.redexgen.core.AbstractC0748Hx.A0B(strA04)) {
                        i3 = 2;
                        if (this.A0H == 0) {
                            if (this.A0I == -1) {
                                i4 = this.A0R;
                            } else {
                                i4 = this.A0I;
                            }
                            this.A0I = i4;
                            if (this.A0G == -1) {
                                i5 = this.A0J;
                            } else {
                                i5 = this.A0G;
                            }
                            this.A0G = i5;
                        }
                        f = -1.0f;
                        if (this.A0I != -1) {
                            f = (this.A0J * this.A0I) / (this.A0R * this.A0G);
                        }
                        colorInfo = null;
                        if (this.A0b) {
                            colorInfo = new com.facebook.ads.internal.exoplayer2.thirdparty.video.ColorInfo(this.A0D, this.A0C, this.A0E, A06());
                        }
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A04(java.lang.Integer.toString(i), strA04, null, -1, i8, this.A0R, this.A0J, -1.0f, listSingletonList, -1, f, this.A0e, this.A0P, colorInfo, this.A0U);
                    } else if (A01(693, 20, 122).equals(strA04)) {
                        i3 = 3;
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A01(java.lang.Integer.toString(i), strA04, i2, this.A0g, this.A0U);
                    } else if (A01(871, 10, 58).equals(strA04)) {
                        i3 = 3;
                        java.util.ArrayList arrayList14 = new java.util.ArrayList(2);
                        arrayList14.add(com.facebook.ads.redexgen.core.C1157Yc.A0t);
                        arrayList14.add(this.A0d);
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A09(java.lang.Integer.toString(i), strA04, null, -1, i2, this.A0g, -1, this.A0U, Long.MAX_VALUE, arrayList14);
                    } else {
                        if (!A01(675, 18, 76).equals(strA04)) {
                        }
                        i3 = 3;
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A0A(java.lang.Integer.toString(i), strA04, null, -1, i2, listSingletonList, this.A0g, this.A0U);
                    }
                    break;
                }
                this.A0W = interfaceC0611Bz.AHA(this.A0N, i3);
                this.A0W.A69(formatA0A);
                return;
            case 62923603:
                if (str2.equals(A01(27, 5, 64))) {
                    b = 15;
                } else {
                    b = -1;
                }
                strA01 = A01(0, 22, 11);
                strA02 = A01(500, 27, 65);
                strA03 = A01(283, 17, 42);
                switch (b) {
                    case 0:
                        strA04 = A01(959, 19, 57);
                        break;
                    case 1:
                        strA04 = A01(978, 19, 62);
                        break;
                    case 2:
                        strA04 = A01(923, 11, 95);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        strA04 = A01(910, 13, 82);
                        if (this.A0d == null) {
                            listSingletonList = java.util.Collections.singletonList(this.A0d);
                        } else {
                            listSingletonList = null;
                        }
                        break;
                    case 6:
                        strA04 = A01(891, 9, 111);
                        com.facebook.ads.redexgen.core.IM imA014 = com.facebook.ads.redexgen.core.IM.A00(new com.facebook.ads.redexgen.core.I4(this.A0d));
                        listSingletonList = imA014.A04;
                        this.A0M = imA014.A02;
                        break;
                    case 7:
                        strA04 = A01(900, 10, 63);
                        com.facebook.ads.redexgen.core.IS isA014 = com.facebook.ads.redexgen.core.IS.A00(new com.facebook.ads.redexgen.core.I4(this.A0d));
                        listSingletonList = isA014.A01;
                        this.A0M = isA014.A00;
                        break;
                    case 8:
                        android.util.Pair<java.lang.String, java.util.List<byte[]>> pairA014 = A00(new com.facebook.ads.redexgen.core.I4(this.A0d));
                        strA04 = (java.lang.String) pairA014.first;
                        listSingletonList = (java.util.List) pairA014.second;
                        break;
                    case 9:
                        strA04 = A01(944, 15, 65);
                        break;
                    case 10:
                        strA04 = A01(841, 12, 73);
                        i8 = 8192;
                        listSingletonList = A03(this.A0d);
                        break;
                    case 11:
                        strA04 = A01(780, 10, 12);
                        i8 = 5760;
                        listSingletonList = new java.util.ArrayList(3);
                        listSingletonList.add(this.A0d);
                        listSingletonList.add(java.nio.ByteBuffer.allocate(8).order(java.nio.ByteOrder.nativeOrder()).putLong(this.A0S).array());
                        listSingletonList.add(java.nio.ByteBuffer.allocate(8).order(java.nio.ByteOrder.nativeOrder()).putLong(this.A0T).array());
                        break;
                    case 12:
                        strA04 = A01(742, 15, 82);
                        listSingletonList = java.util.Collections.singletonList(this.A0d);
                        break;
                    case 13:
                        strA04 = A01(767, 13, 7);
                        i8 = 4096;
                        break;
                    case 14:
                        strA04 = A01(757, 10, 14);
                        i8 = 4096;
                        break;
                    case 15:
                        strA04 = A01(713, 9, 14);
                        break;
                    case 16:
                        strA04 = A01(722, 10, 6);
                        break;
                    case 17:
                        strA04 = A01(799, 13, 106);
                        this.A0X = new com.facebook.ads.redexgen.core.CK();
                        break;
                    case 18:
                    case 19:
                        strA04 = A01(812, 13, 34);
                        break;
                    case 20:
                        strA04 = A01(825, 16, 26);
                        break;
                    case 21:
                        strA04 = A01(732, 10, 43);
                        listSingletonList = java.util.Collections.singletonList(this.A0d);
                        break;
                    case 22:
                        strA04 = A01(790, 9, 116);
                        if (A05(new com.facebook.ads.redexgen.core.I4(this.A0d))) {
                            iA02 = com.facebook.ads.redexgen.core.IK.A02(this.A0A);
                            strArr = A0i;
                            if (strArr[1].charAt(16) != strArr[3].charAt(16)) {
                                if (iA02 == 0) {
                                    iA02 = -1;
                                    strA04 = A01(853, 15, 46);
                                    android.util.Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                                }
                            } else {
                                java.lang.String[] strArr19 = A0i;
                                strArr19[1] = "UnFAd4XuJDxSuzaFoeREgVc6Qs0OmmYm";
                                strArr19[3] = "dBM5Episk82aAApxomIpqdyXT7zAdwmF";
                                if (iA02 == 0) {
                                    iA02 = -1;
                                    strA04 = A01(853, 15, 46);
                                    android.util.Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                                }
                            }
                        } else {
                            strA04 = A01(853, 15, 46);
                            android.util.Log.w(strA03, A01(com.google.android.gms.nearby.messages.Strategy.TTL_SECONDS_DEFAULT, 51, 25) + strA04);
                        }
                        break;
                    case 23:
                        strA04 = A01(790, 9, 116);
                        iA02 = com.facebook.ads.redexgen.core.IK.A02(this.A0A);
                        if (iA02 == 0) {
                            iA02 = -1;
                            strA04 = A01(853, 15, 46);
                            android.util.Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                        }
                        break;
                    case 24:
                        strA04 = A01(693, 20, 122);
                        break;
                    case 25:
                        strA04 = A01(871, 10, 58);
                        break;
                    case 26:
                        strA04 = A01(675, 18, 76);
                        listSingletonList = java.util.Collections.singletonList(this.A0d);
                        break;
                    case 27:
                        strA04 = A01(660, 15, 82);
                        break;
                    case 28:
                        strA04 = A01(641, 19, 91);
                        listSingletonList = java.util.Collections.singletonList(new byte[]{this.A0d[0], this.A0d[1], this.A0d[2], this.A0d[3]});
                        break;
                    default:
                        throw new com.facebook.ads.redexgen.core.A0(A01(470, 30, 89));
                }
                i2 = 0 | (this.A0Z ? 1 : 0) | (this.A0a ? 2 : 0);
                if (com.facebook.ads.redexgen.core.AbstractC0748Hx.A09(strA04)) {
                    i3 = 1;
                    string = java.lang.Integer.toString(i);
                    i6 = this.A0B;
                    i7 = this.A0O;
                    drmInitData = this.A0U;
                    str = this.A0g;
                    strArr2 = A0i;
                    if (strArr2[0].charAt(30) != strArr2[5].charAt(30)) {
                        A0i[2] = "ixQpJ1YMOGXZaJaexLrRt7cPJpDFAOI0";
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A06(string, strA04, null, -1, i8, i6, i7, iA02, listSingletonList, drmInitData, i2, str);
                    } else {
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A06(string, strA04, null, -1, i8, i6, i7, iA02, listSingletonList, drmInitData, i2, str);
                    }
                } else {
                    if (com.facebook.ads.redexgen.core.AbstractC0748Hx.A0B(strA04)) {
                        i3 = 2;
                        if (this.A0H == 0) {
                            if (this.A0I == -1) {
                                i4 = this.A0R;
                            } else {
                                i4 = this.A0I;
                            }
                            this.A0I = i4;
                            if (this.A0G == -1) {
                                i5 = this.A0J;
                            } else {
                                i5 = this.A0G;
                            }
                            this.A0G = i5;
                        }
                        f = -1.0f;
                        if (this.A0I != -1) {
                            f = (this.A0J * this.A0I) / (this.A0R * this.A0G);
                        }
                        colorInfo = null;
                        if (this.A0b) {
                            colorInfo = new com.facebook.ads.internal.exoplayer2.thirdparty.video.ColorInfo(this.A0D, this.A0C, this.A0E, A06());
                        }
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A04(java.lang.Integer.toString(i), strA04, null, -1, i8, this.A0R, this.A0J, -1.0f, listSingletonList, -1, f, this.A0e, this.A0P, colorInfo, this.A0U);
                    } else if (A01(693, 20, 122).equals(strA04)) {
                        i3 = 3;
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A01(java.lang.Integer.toString(i), strA04, i2, this.A0g, this.A0U);
                    } else if (A01(871, 10, 58).equals(strA04)) {
                        i3 = 3;
                        java.util.ArrayList arrayList15 = new java.util.ArrayList(2);
                        arrayList15.add(com.facebook.ads.redexgen.core.C1157Yc.A0t);
                        arrayList15.add(this.A0d);
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A09(java.lang.Integer.toString(i), strA04, null, -1, i2, this.A0g, -1, this.A0U, Long.MAX_VALUE, arrayList15);
                    } else {
                        if (!A01(675, 18, 76).equals(strA04)) {
                        }
                        i3 = 3;
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A0A(java.lang.Integer.toString(i), strA04, null, -1, i2, listSingletonList, this.A0g, this.A0U);
                    }
                    break;
                }
                this.A0W = interfaceC0611Bz.AHA(this.A0N, i3);
                this.A0W.A69(formatA0A);
                return;
            case 62927045:
                if (str2.equals(A01(32, 5, 32))) {
                    b = 18;
                } else {
                    b = -1;
                }
                strA01 = A01(0, 22, 11);
                strA02 = A01(500, 27, 65);
                strA03 = A01(283, 17, 42);
                switch (b) {
                    case 0:
                        strA04 = A01(959, 19, 57);
                        break;
                    case 1:
                        strA04 = A01(978, 19, 62);
                        break;
                    case 2:
                        strA04 = A01(923, 11, 95);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        strA04 = A01(910, 13, 82);
                        if (this.A0d == null) {
                            listSingletonList = java.util.Collections.singletonList(this.A0d);
                        } else {
                            listSingletonList = null;
                        }
                        break;
                    case 6:
                        strA04 = A01(891, 9, 111);
                        com.facebook.ads.redexgen.core.IM imA015 = com.facebook.ads.redexgen.core.IM.A00(new com.facebook.ads.redexgen.core.I4(this.A0d));
                        listSingletonList = imA015.A04;
                        this.A0M = imA015.A02;
                        break;
                    case 7:
                        strA04 = A01(900, 10, 63);
                        com.facebook.ads.redexgen.core.IS isA015 = com.facebook.ads.redexgen.core.IS.A00(new com.facebook.ads.redexgen.core.I4(this.A0d));
                        listSingletonList = isA015.A01;
                        this.A0M = isA015.A00;
                        break;
                    case 8:
                        android.util.Pair<java.lang.String, java.util.List<byte[]>> pairA015 = A00(new com.facebook.ads.redexgen.core.I4(this.A0d));
                        strA04 = (java.lang.String) pairA015.first;
                        listSingletonList = (java.util.List) pairA015.second;
                        break;
                    case 9:
                        strA04 = A01(944, 15, 65);
                        break;
                    case 10:
                        strA04 = A01(841, 12, 73);
                        i8 = 8192;
                        listSingletonList = A03(this.A0d);
                        break;
                    case 11:
                        strA04 = A01(780, 10, 12);
                        i8 = 5760;
                        listSingletonList = new java.util.ArrayList(3);
                        listSingletonList.add(this.A0d);
                        listSingletonList.add(java.nio.ByteBuffer.allocate(8).order(java.nio.ByteOrder.nativeOrder()).putLong(this.A0S).array());
                        listSingletonList.add(java.nio.ByteBuffer.allocate(8).order(java.nio.ByteOrder.nativeOrder()).putLong(this.A0T).array());
                        break;
                    case 12:
                        strA04 = A01(742, 15, 82);
                        listSingletonList = java.util.Collections.singletonList(this.A0d);
                        break;
                    case 13:
                        strA04 = A01(767, 13, 7);
                        i8 = 4096;
                        break;
                    case 14:
                        strA04 = A01(757, 10, 14);
                        i8 = 4096;
                        break;
                    case 15:
                        strA04 = A01(713, 9, 14);
                        break;
                    case 16:
                        strA04 = A01(722, 10, 6);
                        break;
                    case 17:
                        strA04 = A01(799, 13, 106);
                        this.A0X = new com.facebook.ads.redexgen.core.CK();
                        break;
                    case 18:
                    case 19:
                        strA04 = A01(812, 13, 34);
                        break;
                    case 20:
                        strA04 = A01(825, 16, 26);
                        break;
                    case 21:
                        strA04 = A01(732, 10, 43);
                        listSingletonList = java.util.Collections.singletonList(this.A0d);
                        break;
                    case 22:
                        strA04 = A01(790, 9, 116);
                        if (A05(new com.facebook.ads.redexgen.core.I4(this.A0d))) {
                            iA02 = com.facebook.ads.redexgen.core.IK.A02(this.A0A);
                            strArr = A0i;
                            if (strArr[1].charAt(16) != strArr[3].charAt(16)) {
                                if (iA02 == 0) {
                                    iA02 = -1;
                                    strA04 = A01(853, 15, 46);
                                    android.util.Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                                }
                            } else {
                                java.lang.String[] strArr110 = A0i;
                                strArr110[1] = "UnFAd4XuJDxSuzaFoeREgVc6Qs0OmmYm";
                                strArr110[3] = "dBM5Episk82aAApxomIpqdyXT7zAdwmF";
                                if (iA02 == 0) {
                                    iA02 = -1;
                                    strA04 = A01(853, 15, 46);
                                    android.util.Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                                }
                            }
                        } else {
                            strA04 = A01(853, 15, 46);
                            android.util.Log.w(strA03, A01(com.google.android.gms.nearby.messages.Strategy.TTL_SECONDS_DEFAULT, 51, 25) + strA04);
                        }
                        break;
                    case 23:
                        strA04 = A01(790, 9, 116);
                        iA02 = com.facebook.ads.redexgen.core.IK.A02(this.A0A);
                        if (iA02 == 0) {
                            iA02 = -1;
                            strA04 = A01(853, 15, 46);
                            android.util.Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                        }
                        break;
                    case 24:
                        strA04 = A01(693, 20, 122);
                        break;
                    case 25:
                        strA04 = A01(871, 10, 58);
                        break;
                    case 26:
                        strA04 = A01(675, 18, 76);
                        listSingletonList = java.util.Collections.singletonList(this.A0d);
                        break;
                    case 27:
                        strA04 = A01(660, 15, 82);
                        break;
                    case 28:
                        strA04 = A01(641, 19, 91);
                        listSingletonList = java.util.Collections.singletonList(new byte[]{this.A0d[0], this.A0d[1], this.A0d[2], this.A0d[3]});
                        break;
                    default:
                        throw new com.facebook.ads.redexgen.core.A0(A01(470, 30, 89));
                }
                i2 = 0 | (this.A0Z ? 1 : 0) | (this.A0a ? 2 : 0);
                if (com.facebook.ads.redexgen.core.AbstractC0748Hx.A09(strA04)) {
                    i3 = 1;
                    string = java.lang.Integer.toString(i);
                    i6 = this.A0B;
                    i7 = this.A0O;
                    drmInitData = this.A0U;
                    str = this.A0g;
                    strArr2 = A0i;
                    if (strArr2[0].charAt(30) != strArr2[5].charAt(30)) {
                        A0i[2] = "ixQpJ1YMOGXZaJaexLrRt7cPJpDFAOI0";
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A06(string, strA04, null, -1, i8, i6, i7, iA02, listSingletonList, drmInitData, i2, str);
                    } else {
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A06(string, strA04, null, -1, i8, i6, i7, iA02, listSingletonList, drmInitData, i2, str);
                    }
                } else {
                    if (com.facebook.ads.redexgen.core.AbstractC0748Hx.A0B(strA04)) {
                        i3 = 2;
                        if (this.A0H == 0) {
                            if (this.A0I == -1) {
                                i4 = this.A0R;
                            } else {
                                i4 = this.A0I;
                            }
                            this.A0I = i4;
                            if (this.A0G == -1) {
                                i5 = this.A0J;
                            } else {
                                i5 = this.A0G;
                            }
                            this.A0G = i5;
                        }
                        f = -1.0f;
                        if (this.A0I != -1) {
                            f = (this.A0J * this.A0I) / (this.A0R * this.A0G);
                        }
                        colorInfo = null;
                        if (this.A0b) {
                            colorInfo = new com.facebook.ads.internal.exoplayer2.thirdparty.video.ColorInfo(this.A0D, this.A0C, this.A0E, A06());
                        }
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A04(java.lang.Integer.toString(i), strA04, null, -1, i8, this.A0R, this.A0J, -1.0f, listSingletonList, -1, f, this.A0e, this.A0P, colorInfo, this.A0U);
                    } else if (A01(693, 20, 122).equals(strA04)) {
                        i3 = 3;
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A01(java.lang.Integer.toString(i), strA04, i2, this.A0g, this.A0U);
                    } else if (A01(871, 10, 58).equals(strA04)) {
                        i3 = 3;
                        java.util.ArrayList arrayList16 = new java.util.ArrayList(2);
                        arrayList16.add(com.facebook.ads.redexgen.core.C1157Yc.A0t);
                        arrayList16.add(this.A0d);
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A09(java.lang.Integer.toString(i), strA04, null, -1, i2, this.A0g, -1, this.A0U, Long.MAX_VALUE, arrayList16);
                    } else {
                        if (!A01(675, 18, 76).equals(strA04)) {
                        }
                        i3 = 3;
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A0A(java.lang.Integer.toString(i), strA04, null, -1, i2, listSingletonList, this.A0g, this.A0U);
                    }
                    break;
                }
                this.A0W = interfaceC0611Bz.AHA(this.A0N, i3);
                this.A0W.A69(formatA0A);
                return;
            case 82338133:
                if (str2.equals(A01(com.unity3d.mediation.LevelPlayAdError.ERROR_CODE_SHOW_WHILE_LOAD, 5, 62))) {
                    b = 0;
                } else {
                    b = -1;
                }
                strA01 = A01(0, 22, 11);
                strA02 = A01(500, 27, 65);
                strA03 = A01(283, 17, 42);
                switch (b) {
                    case 0:
                        strA04 = A01(959, 19, 57);
                        break;
                    case 1:
                        strA04 = A01(978, 19, 62);
                        break;
                    case 2:
                        strA04 = A01(923, 11, 95);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        strA04 = A01(910, 13, 82);
                        if (this.A0d == null) {
                            listSingletonList = java.util.Collections.singletonList(this.A0d);
                        } else {
                            listSingletonList = null;
                        }
                        break;
                    case 6:
                        strA04 = A01(891, 9, 111);
                        com.facebook.ads.redexgen.core.IM imA016 = com.facebook.ads.redexgen.core.IM.A00(new com.facebook.ads.redexgen.core.I4(this.A0d));
                        listSingletonList = imA016.A04;
                        this.A0M = imA016.A02;
                        break;
                    case 7:
                        strA04 = A01(900, 10, 63);
                        com.facebook.ads.redexgen.core.IS isA016 = com.facebook.ads.redexgen.core.IS.A00(new com.facebook.ads.redexgen.core.I4(this.A0d));
                        listSingletonList = isA016.A01;
                        this.A0M = isA016.A00;
                        break;
                    case 8:
                        android.util.Pair<java.lang.String, java.util.List<byte[]>> pairA016 = A00(new com.facebook.ads.redexgen.core.I4(this.A0d));
                        strA04 = (java.lang.String) pairA016.first;
                        listSingletonList = (java.util.List) pairA016.second;
                        break;
                    case 9:
                        strA04 = A01(944, 15, 65);
                        break;
                    case 10:
                        strA04 = A01(841, 12, 73);
                        i8 = 8192;
                        listSingletonList = A03(this.A0d);
                        break;
                    case 11:
                        strA04 = A01(780, 10, 12);
                        i8 = 5760;
                        listSingletonList = new java.util.ArrayList(3);
                        listSingletonList.add(this.A0d);
                        listSingletonList.add(java.nio.ByteBuffer.allocate(8).order(java.nio.ByteOrder.nativeOrder()).putLong(this.A0S).array());
                        listSingletonList.add(java.nio.ByteBuffer.allocate(8).order(java.nio.ByteOrder.nativeOrder()).putLong(this.A0T).array());
                        break;
                    case 12:
                        strA04 = A01(742, 15, 82);
                        listSingletonList = java.util.Collections.singletonList(this.A0d);
                        break;
                    case 13:
                        strA04 = A01(767, 13, 7);
                        i8 = 4096;
                        break;
                    case 14:
                        strA04 = A01(757, 10, 14);
                        i8 = 4096;
                        break;
                    case 15:
                        strA04 = A01(713, 9, 14);
                        break;
                    case 16:
                        strA04 = A01(722, 10, 6);
                        break;
                    case 17:
                        strA04 = A01(799, 13, 106);
                        this.A0X = new com.facebook.ads.redexgen.core.CK();
                        break;
                    case 18:
                    case 19:
                        strA04 = A01(812, 13, 34);
                        break;
                    case 20:
                        strA04 = A01(825, 16, 26);
                        break;
                    case 21:
                        strA04 = A01(732, 10, 43);
                        listSingletonList = java.util.Collections.singletonList(this.A0d);
                        break;
                    case 22:
                        strA04 = A01(790, 9, 116);
                        if (A05(new com.facebook.ads.redexgen.core.I4(this.A0d))) {
                            iA02 = com.facebook.ads.redexgen.core.IK.A02(this.A0A);
                            strArr = A0i;
                            if (strArr[1].charAt(16) != strArr[3].charAt(16)) {
                                if (iA02 == 0) {
                                    iA02 = -1;
                                    strA04 = A01(853, 15, 46);
                                    android.util.Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                                }
                            } else {
                                java.lang.String[] strArr111 = A0i;
                                strArr111[1] = "UnFAd4XuJDxSuzaFoeREgVc6Qs0OmmYm";
                                strArr111[3] = "dBM5Episk82aAApxomIpqdyXT7zAdwmF";
                                if (iA02 == 0) {
                                    iA02 = -1;
                                    strA04 = A01(853, 15, 46);
                                    android.util.Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                                }
                            }
                        } else {
                            strA04 = A01(853, 15, 46);
                            android.util.Log.w(strA03, A01(com.google.android.gms.nearby.messages.Strategy.TTL_SECONDS_DEFAULT, 51, 25) + strA04);
                        }
                        break;
                    case 23:
                        strA04 = A01(790, 9, 116);
                        iA02 = com.facebook.ads.redexgen.core.IK.A02(this.A0A);
                        if (iA02 == 0) {
                            iA02 = -1;
                            strA04 = A01(853, 15, 46);
                            android.util.Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                        }
                        break;
                    case 24:
                        strA04 = A01(693, 20, 122);
                        break;
                    case 25:
                        strA04 = A01(871, 10, 58);
                        break;
                    case 26:
                        strA04 = A01(675, 18, 76);
                        listSingletonList = java.util.Collections.singletonList(this.A0d);
                        break;
                    case 27:
                        strA04 = A01(660, 15, 82);
                        break;
                    case 28:
                        strA04 = A01(641, 19, 91);
                        listSingletonList = java.util.Collections.singletonList(new byte[]{this.A0d[0], this.A0d[1], this.A0d[2], this.A0d[3]});
                        break;
                    default:
                        throw new com.facebook.ads.redexgen.core.A0(A01(470, 30, 89));
                }
                i2 = 0 | (this.A0Z ? 1 : 0) | (this.A0a ? 2 : 0);
                if (com.facebook.ads.redexgen.core.AbstractC0748Hx.A09(strA04)) {
                    i3 = 1;
                    string = java.lang.Integer.toString(i);
                    i6 = this.A0B;
                    i7 = this.A0O;
                    drmInitData = this.A0U;
                    str = this.A0g;
                    strArr2 = A0i;
                    if (strArr2[0].charAt(30) != strArr2[5].charAt(30)) {
                        A0i[2] = "ixQpJ1YMOGXZaJaexLrRt7cPJpDFAOI0";
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A06(string, strA04, null, -1, i8, i6, i7, iA02, listSingletonList, drmInitData, i2, str);
                    } else {
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A06(string, strA04, null, -1, i8, i6, i7, iA02, listSingletonList, drmInitData, i2, str);
                    }
                } else {
                    if (com.facebook.ads.redexgen.core.AbstractC0748Hx.A0B(strA04)) {
                        i3 = 2;
                        if (this.A0H == 0) {
                            if (this.A0I == -1) {
                                i4 = this.A0R;
                            } else {
                                i4 = this.A0I;
                            }
                            this.A0I = i4;
                            if (this.A0G == -1) {
                                i5 = this.A0J;
                            } else {
                                i5 = this.A0G;
                            }
                            this.A0G = i5;
                        }
                        f = -1.0f;
                        if (this.A0I != -1) {
                            f = (this.A0J * this.A0I) / (this.A0R * this.A0G);
                        }
                        colorInfo = null;
                        if (this.A0b) {
                            colorInfo = new com.facebook.ads.internal.exoplayer2.thirdparty.video.ColorInfo(this.A0D, this.A0C, this.A0E, A06());
                        }
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A04(java.lang.Integer.toString(i), strA04, null, -1, i8, this.A0R, this.A0J, -1.0f, listSingletonList, -1, f, this.A0e, this.A0P, colorInfo, this.A0U);
                    } else if (A01(693, 20, 122).equals(strA04)) {
                        i3 = 3;
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A01(java.lang.Integer.toString(i), strA04, i2, this.A0g, this.A0U);
                    } else if (A01(871, 10, 58).equals(strA04)) {
                        i3 = 3;
                        java.util.ArrayList arrayList17 = new java.util.ArrayList(2);
                        arrayList17.add(com.facebook.ads.redexgen.core.C1157Yc.A0t);
                        arrayList17.add(this.A0d);
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A09(java.lang.Integer.toString(i), strA04, null, -1, i2, this.A0g, -1, this.A0U, Long.MAX_VALUE, arrayList17);
                    } else {
                        if (!A01(675, 18, 76).equals(strA04)) {
                        }
                        i3 = 3;
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A0A(java.lang.Integer.toString(i), strA04, null, -1, i2, listSingletonList, this.A0g, this.A0U);
                    }
                    break;
                }
                this.A0W = interfaceC0611Bz.AHA(this.A0N, i3);
                this.A0W.A69(formatA0A);
                return;
            case 82338134:
                if (str2.equals(A01(636, 5, 94))) {
                    b = 1;
                } else {
                    b = -1;
                }
                strA01 = A01(0, 22, 11);
                strA02 = A01(500, 27, 65);
                strA03 = A01(283, 17, 42);
                switch (b) {
                    case 0:
                        strA04 = A01(959, 19, 57);
                        break;
                    case 1:
                        strA04 = A01(978, 19, 62);
                        break;
                    case 2:
                        strA04 = A01(923, 11, 95);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        strA04 = A01(910, 13, 82);
                        if (this.A0d == null) {
                            listSingletonList = java.util.Collections.singletonList(this.A0d);
                        } else {
                            listSingletonList = null;
                        }
                        break;
                    case 6:
                        strA04 = A01(891, 9, 111);
                        com.facebook.ads.redexgen.core.IM imA017 = com.facebook.ads.redexgen.core.IM.A00(new com.facebook.ads.redexgen.core.I4(this.A0d));
                        listSingletonList = imA017.A04;
                        this.A0M = imA017.A02;
                        break;
                    case 7:
                        strA04 = A01(900, 10, 63);
                        com.facebook.ads.redexgen.core.IS isA017 = com.facebook.ads.redexgen.core.IS.A00(new com.facebook.ads.redexgen.core.I4(this.A0d));
                        listSingletonList = isA017.A01;
                        this.A0M = isA017.A00;
                        break;
                    case 8:
                        android.util.Pair<java.lang.String, java.util.List<byte[]>> pairA017 = A00(new com.facebook.ads.redexgen.core.I4(this.A0d));
                        strA04 = (java.lang.String) pairA017.first;
                        listSingletonList = (java.util.List) pairA017.second;
                        break;
                    case 9:
                        strA04 = A01(944, 15, 65);
                        break;
                    case 10:
                        strA04 = A01(841, 12, 73);
                        i8 = 8192;
                        listSingletonList = A03(this.A0d);
                        break;
                    case 11:
                        strA04 = A01(780, 10, 12);
                        i8 = 5760;
                        listSingletonList = new java.util.ArrayList(3);
                        listSingletonList.add(this.A0d);
                        listSingletonList.add(java.nio.ByteBuffer.allocate(8).order(java.nio.ByteOrder.nativeOrder()).putLong(this.A0S).array());
                        listSingletonList.add(java.nio.ByteBuffer.allocate(8).order(java.nio.ByteOrder.nativeOrder()).putLong(this.A0T).array());
                        break;
                    case 12:
                        strA04 = A01(742, 15, 82);
                        listSingletonList = java.util.Collections.singletonList(this.A0d);
                        break;
                    case 13:
                        strA04 = A01(767, 13, 7);
                        i8 = 4096;
                        break;
                    case 14:
                        strA04 = A01(757, 10, 14);
                        i8 = 4096;
                        break;
                    case 15:
                        strA04 = A01(713, 9, 14);
                        break;
                    case 16:
                        strA04 = A01(722, 10, 6);
                        break;
                    case 17:
                        strA04 = A01(799, 13, 106);
                        this.A0X = new com.facebook.ads.redexgen.core.CK();
                        break;
                    case 18:
                    case 19:
                        strA04 = A01(812, 13, 34);
                        break;
                    case 20:
                        strA04 = A01(825, 16, 26);
                        break;
                    case 21:
                        strA04 = A01(732, 10, 43);
                        listSingletonList = java.util.Collections.singletonList(this.A0d);
                        break;
                    case 22:
                        strA04 = A01(790, 9, 116);
                        if (A05(new com.facebook.ads.redexgen.core.I4(this.A0d))) {
                            iA02 = com.facebook.ads.redexgen.core.IK.A02(this.A0A);
                            strArr = A0i;
                            if (strArr[1].charAt(16) != strArr[3].charAt(16)) {
                                if (iA02 == 0) {
                                    iA02 = -1;
                                    strA04 = A01(853, 15, 46);
                                    android.util.Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                                }
                            } else {
                                java.lang.String[] strArr112 = A0i;
                                strArr112[1] = "UnFAd4XuJDxSuzaFoeREgVc6Qs0OmmYm";
                                strArr112[3] = "dBM5Episk82aAApxomIpqdyXT7zAdwmF";
                                if (iA02 == 0) {
                                    iA02 = -1;
                                    strA04 = A01(853, 15, 46);
                                    android.util.Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                                }
                            }
                        } else {
                            strA04 = A01(853, 15, 46);
                            android.util.Log.w(strA03, A01(com.google.android.gms.nearby.messages.Strategy.TTL_SECONDS_DEFAULT, 51, 25) + strA04);
                        }
                        break;
                    case 23:
                        strA04 = A01(790, 9, 116);
                        iA02 = com.facebook.ads.redexgen.core.IK.A02(this.A0A);
                        if (iA02 == 0) {
                            iA02 = -1;
                            strA04 = A01(853, 15, 46);
                            android.util.Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                        }
                        break;
                    case 24:
                        strA04 = A01(693, 20, 122);
                        break;
                    case 25:
                        strA04 = A01(871, 10, 58);
                        break;
                    case 26:
                        strA04 = A01(675, 18, 76);
                        listSingletonList = java.util.Collections.singletonList(this.A0d);
                        break;
                    case 27:
                        strA04 = A01(660, 15, 82);
                        break;
                    case 28:
                        strA04 = A01(641, 19, 91);
                        listSingletonList = java.util.Collections.singletonList(new byte[]{this.A0d[0], this.A0d[1], this.A0d[2], this.A0d[3]});
                        break;
                    default:
                        throw new com.facebook.ads.redexgen.core.A0(A01(470, 30, 89));
                }
                i2 = 0 | (this.A0Z ? 1 : 0) | (this.A0a ? 2 : 0);
                if (com.facebook.ads.redexgen.core.AbstractC0748Hx.A09(strA04)) {
                    i3 = 1;
                    string = java.lang.Integer.toString(i);
                    i6 = this.A0B;
                    i7 = this.A0O;
                    drmInitData = this.A0U;
                    str = this.A0g;
                    strArr2 = A0i;
                    if (strArr2[0].charAt(30) != strArr2[5].charAt(30)) {
                        A0i[2] = "ixQpJ1YMOGXZaJaexLrRt7cPJpDFAOI0";
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A06(string, strA04, null, -1, i8, i6, i7, iA02, listSingletonList, drmInitData, i2, str);
                    } else {
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A06(string, strA04, null, -1, i8, i6, i7, iA02, listSingletonList, drmInitData, i2, str);
                    }
                } else {
                    if (com.facebook.ads.redexgen.core.AbstractC0748Hx.A0B(strA04)) {
                        i3 = 2;
                        if (this.A0H == 0) {
                            if (this.A0I == -1) {
                                i4 = this.A0R;
                            } else {
                                i4 = this.A0I;
                            }
                            this.A0I = i4;
                            if (this.A0G == -1) {
                                i5 = this.A0J;
                            } else {
                                i5 = this.A0G;
                            }
                            this.A0G = i5;
                        }
                        f = -1.0f;
                        if (this.A0I != -1) {
                            f = (this.A0J * this.A0I) / (this.A0R * this.A0G);
                        }
                        colorInfo = null;
                        if (this.A0b) {
                            colorInfo = new com.facebook.ads.internal.exoplayer2.thirdparty.video.ColorInfo(this.A0D, this.A0C, this.A0E, A06());
                        }
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A04(java.lang.Integer.toString(i), strA04, null, -1, i8, this.A0R, this.A0J, -1.0f, listSingletonList, -1, f, this.A0e, this.A0P, colorInfo, this.A0U);
                    } else if (A01(693, 20, 122).equals(strA04)) {
                        i3 = 3;
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A01(java.lang.Integer.toString(i), strA04, i2, this.A0g, this.A0U);
                    } else if (A01(871, 10, 58).equals(strA04)) {
                        i3 = 3;
                        java.util.ArrayList arrayList18 = new java.util.ArrayList(2);
                        arrayList18.add(com.facebook.ads.redexgen.core.C1157Yc.A0t);
                        arrayList18.add(this.A0d);
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A09(java.lang.Integer.toString(i), strA04, null, -1, i2, this.A0g, -1, this.A0U, Long.MAX_VALUE, arrayList18);
                    } else {
                        if (!A01(675, 18, 76).equals(strA04)) {
                        }
                        i3 = 3;
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A0A(java.lang.Integer.toString(i), strA04, null, -1, i2, listSingletonList, this.A0g, this.A0U);
                    }
                    break;
                }
                this.A0W = interfaceC0611Bz.AHA(this.A0N, i3);
                this.A0W.A69(formatA0A);
                return;
            case 99146302:
                if (str2.equals(A01(359, 10, 22))) {
                    b = 27;
                } else {
                    b = -1;
                }
                strA01 = A01(0, 22, 11);
                strA02 = A01(500, 27, 65);
                strA03 = A01(283, 17, 42);
                switch (b) {
                    case 0:
                        strA04 = A01(959, 19, 57);
                        break;
                    case 1:
                        strA04 = A01(978, 19, 62);
                        break;
                    case 2:
                        strA04 = A01(923, 11, 95);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        strA04 = A01(910, 13, 82);
                        if (this.A0d == null) {
                            listSingletonList = java.util.Collections.singletonList(this.A0d);
                        } else {
                            listSingletonList = null;
                        }
                        break;
                    case 6:
                        strA04 = A01(891, 9, 111);
                        com.facebook.ads.redexgen.core.IM imA018 = com.facebook.ads.redexgen.core.IM.A00(new com.facebook.ads.redexgen.core.I4(this.A0d));
                        listSingletonList = imA018.A04;
                        this.A0M = imA018.A02;
                        break;
                    case 7:
                        strA04 = A01(900, 10, 63);
                        com.facebook.ads.redexgen.core.IS isA018 = com.facebook.ads.redexgen.core.IS.A00(new com.facebook.ads.redexgen.core.I4(this.A0d));
                        listSingletonList = isA018.A01;
                        this.A0M = isA018.A00;
                        break;
                    case 8:
                        android.util.Pair<java.lang.String, java.util.List<byte[]>> pairA018 = A00(new com.facebook.ads.redexgen.core.I4(this.A0d));
                        strA04 = (java.lang.String) pairA018.first;
                        listSingletonList = (java.util.List) pairA018.second;
                        break;
                    case 9:
                        strA04 = A01(944, 15, 65);
                        break;
                    case 10:
                        strA04 = A01(841, 12, 73);
                        i8 = 8192;
                        listSingletonList = A03(this.A0d);
                        break;
                    case 11:
                        strA04 = A01(780, 10, 12);
                        i8 = 5760;
                        listSingletonList = new java.util.ArrayList(3);
                        listSingletonList.add(this.A0d);
                        listSingletonList.add(java.nio.ByteBuffer.allocate(8).order(java.nio.ByteOrder.nativeOrder()).putLong(this.A0S).array());
                        listSingletonList.add(java.nio.ByteBuffer.allocate(8).order(java.nio.ByteOrder.nativeOrder()).putLong(this.A0T).array());
                        break;
                    case 12:
                        strA04 = A01(742, 15, 82);
                        listSingletonList = java.util.Collections.singletonList(this.A0d);
                        break;
                    case 13:
                        strA04 = A01(767, 13, 7);
                        i8 = 4096;
                        break;
                    case 14:
                        strA04 = A01(757, 10, 14);
                        i8 = 4096;
                        break;
                    case 15:
                        strA04 = A01(713, 9, 14);
                        break;
                    case 16:
                        strA04 = A01(722, 10, 6);
                        break;
                    case 17:
                        strA04 = A01(799, 13, 106);
                        this.A0X = new com.facebook.ads.redexgen.core.CK();
                        break;
                    case 18:
                    case 19:
                        strA04 = A01(812, 13, 34);
                        break;
                    case 20:
                        strA04 = A01(825, 16, 26);
                        break;
                    case 21:
                        strA04 = A01(732, 10, 43);
                        listSingletonList = java.util.Collections.singletonList(this.A0d);
                        break;
                    case 22:
                        strA04 = A01(790, 9, 116);
                        if (A05(new com.facebook.ads.redexgen.core.I4(this.A0d))) {
                            iA02 = com.facebook.ads.redexgen.core.IK.A02(this.A0A);
                            strArr = A0i;
                            if (strArr[1].charAt(16) != strArr[3].charAt(16)) {
                                if (iA02 == 0) {
                                    iA02 = -1;
                                    strA04 = A01(853, 15, 46);
                                    android.util.Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                                }
                            } else {
                                java.lang.String[] strArr113 = A0i;
                                strArr113[1] = "UnFAd4XuJDxSuzaFoeREgVc6Qs0OmmYm";
                                strArr113[3] = "dBM5Episk82aAApxomIpqdyXT7zAdwmF";
                                if (iA02 == 0) {
                                    iA02 = -1;
                                    strA04 = A01(853, 15, 46);
                                    android.util.Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                                }
                            }
                        } else {
                            strA04 = A01(853, 15, 46);
                            android.util.Log.w(strA03, A01(com.google.android.gms.nearby.messages.Strategy.TTL_SECONDS_DEFAULT, 51, 25) + strA04);
                        }
                        break;
                    case 23:
                        strA04 = A01(790, 9, 116);
                        iA02 = com.facebook.ads.redexgen.core.IK.A02(this.A0A);
                        if (iA02 == 0) {
                            iA02 = -1;
                            strA04 = A01(853, 15, 46);
                            android.util.Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                        }
                        break;
                    case 24:
                        strA04 = A01(693, 20, 122);
                        break;
                    case 25:
                        strA04 = A01(871, 10, 58);
                        break;
                    case 26:
                        strA04 = A01(675, 18, 76);
                        listSingletonList = java.util.Collections.singletonList(this.A0d);
                        break;
                    case 27:
                        strA04 = A01(660, 15, 82);
                        break;
                    case 28:
                        strA04 = A01(641, 19, 91);
                        listSingletonList = java.util.Collections.singletonList(new byte[]{this.A0d[0], this.A0d[1], this.A0d[2], this.A0d[3]});
                        break;
                    default:
                        throw new com.facebook.ads.redexgen.core.A0(A01(470, 30, 89));
                }
                i2 = 0 | (this.A0Z ? 1 : 0) | (this.A0a ? 2 : 0);
                if (com.facebook.ads.redexgen.core.AbstractC0748Hx.A09(strA04)) {
                    i3 = 1;
                    string = java.lang.Integer.toString(i);
                    i6 = this.A0B;
                    i7 = this.A0O;
                    drmInitData = this.A0U;
                    str = this.A0g;
                    strArr2 = A0i;
                    if (strArr2[0].charAt(30) != strArr2[5].charAt(30)) {
                        A0i[2] = "ixQpJ1YMOGXZaJaexLrRt7cPJpDFAOI0";
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A06(string, strA04, null, -1, i8, i6, i7, iA02, listSingletonList, drmInitData, i2, str);
                    } else {
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A06(string, strA04, null, -1, i8, i6, i7, iA02, listSingletonList, drmInitData, i2, str);
                    }
                } else {
                    if (com.facebook.ads.redexgen.core.AbstractC0748Hx.A0B(strA04)) {
                        i3 = 2;
                        if (this.A0H == 0) {
                            if (this.A0I == -1) {
                                i4 = this.A0R;
                            } else {
                                i4 = this.A0I;
                            }
                            this.A0I = i4;
                            if (this.A0G == -1) {
                                i5 = this.A0J;
                            } else {
                                i5 = this.A0G;
                            }
                            this.A0G = i5;
                        }
                        f = -1.0f;
                        if (this.A0I != -1) {
                            f = (this.A0J * this.A0I) / (this.A0R * this.A0G);
                        }
                        colorInfo = null;
                        if (this.A0b) {
                            colorInfo = new com.facebook.ads.internal.exoplayer2.thirdparty.video.ColorInfo(this.A0D, this.A0C, this.A0E, A06());
                        }
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A04(java.lang.Integer.toString(i), strA04, null, -1, i8, this.A0R, this.A0J, -1.0f, listSingletonList, -1, f, this.A0e, this.A0P, colorInfo, this.A0U);
                    } else if (A01(693, 20, 122).equals(strA04)) {
                        i3 = 3;
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A01(java.lang.Integer.toString(i), strA04, i2, this.A0g, this.A0U);
                    } else if (A01(871, 10, 58).equals(strA04)) {
                        i3 = 3;
                        java.util.ArrayList arrayList19 = new java.util.ArrayList(2);
                        arrayList19.add(com.facebook.ads.redexgen.core.C1157Yc.A0t);
                        arrayList19.add(this.A0d);
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A09(java.lang.Integer.toString(i), strA04, null, -1, i2, this.A0g, -1, this.A0U, Long.MAX_VALUE, arrayList19);
                    } else {
                        if (!A01(675, 18, 76).equals(strA04)) {
                        }
                        i3 = 3;
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A0A(java.lang.Integer.toString(i), strA04, null, -1, i2, listSingletonList, this.A0g, this.A0U);
                    }
                    break;
                }
                this.A0W = interfaceC0611Bz.AHA(this.A0N, i3);
                this.A0W.A69(formatA0A);
                return;
            case 444813526:
                if (str2.equals(A01(com.json.mediationsdk.logger.IronSourceError.ERROR_BN_BINDING_SKIP_INVISIBLE, 8, 1))) {
                    b = 9;
                } else {
                    b = -1;
                }
                strA01 = A01(0, 22, 11);
                strA02 = A01(500, 27, 65);
                strA03 = A01(283, 17, 42);
                switch (b) {
                    case 0:
                        strA04 = A01(959, 19, 57);
                        break;
                    case 1:
                        strA04 = A01(978, 19, 62);
                        break;
                    case 2:
                        strA04 = A01(923, 11, 95);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        strA04 = A01(910, 13, 82);
                        if (this.A0d == null) {
                            listSingletonList = java.util.Collections.singletonList(this.A0d);
                        } else {
                            listSingletonList = null;
                        }
                        break;
                    case 6:
                        strA04 = A01(891, 9, 111);
                        com.facebook.ads.redexgen.core.IM imA019 = com.facebook.ads.redexgen.core.IM.A00(new com.facebook.ads.redexgen.core.I4(this.A0d));
                        listSingletonList = imA019.A04;
                        this.A0M = imA019.A02;
                        break;
                    case 7:
                        strA04 = A01(900, 10, 63);
                        com.facebook.ads.redexgen.core.IS isA019 = com.facebook.ads.redexgen.core.IS.A00(new com.facebook.ads.redexgen.core.I4(this.A0d));
                        listSingletonList = isA019.A01;
                        this.A0M = isA019.A00;
                        break;
                    case 8:
                        android.util.Pair<java.lang.String, java.util.List<byte[]>> pairA019 = A00(new com.facebook.ads.redexgen.core.I4(this.A0d));
                        strA04 = (java.lang.String) pairA019.first;
                        listSingletonList = (java.util.List) pairA019.second;
                        break;
                    case 9:
                        strA04 = A01(944, 15, 65);
                        break;
                    case 10:
                        strA04 = A01(841, 12, 73);
                        i8 = 8192;
                        listSingletonList = A03(this.A0d);
                        break;
                    case 11:
                        strA04 = A01(780, 10, 12);
                        i8 = 5760;
                        listSingletonList = new java.util.ArrayList(3);
                        listSingletonList.add(this.A0d);
                        listSingletonList.add(java.nio.ByteBuffer.allocate(8).order(java.nio.ByteOrder.nativeOrder()).putLong(this.A0S).array());
                        listSingletonList.add(java.nio.ByteBuffer.allocate(8).order(java.nio.ByteOrder.nativeOrder()).putLong(this.A0T).array());
                        break;
                    case 12:
                        strA04 = A01(742, 15, 82);
                        listSingletonList = java.util.Collections.singletonList(this.A0d);
                        break;
                    case 13:
                        strA04 = A01(767, 13, 7);
                        i8 = 4096;
                        break;
                    case 14:
                        strA04 = A01(757, 10, 14);
                        i8 = 4096;
                        break;
                    case 15:
                        strA04 = A01(713, 9, 14);
                        break;
                    case 16:
                        strA04 = A01(722, 10, 6);
                        break;
                    case 17:
                        strA04 = A01(799, 13, 106);
                        this.A0X = new com.facebook.ads.redexgen.core.CK();
                        break;
                    case 18:
                    case 19:
                        strA04 = A01(812, 13, 34);
                        break;
                    case 20:
                        strA04 = A01(825, 16, 26);
                        break;
                    case 21:
                        strA04 = A01(732, 10, 43);
                        listSingletonList = java.util.Collections.singletonList(this.A0d);
                        break;
                    case 22:
                        strA04 = A01(790, 9, 116);
                        if (A05(new com.facebook.ads.redexgen.core.I4(this.A0d))) {
                            iA02 = com.facebook.ads.redexgen.core.IK.A02(this.A0A);
                            strArr = A0i;
                            if (strArr[1].charAt(16) != strArr[3].charAt(16)) {
                                if (iA02 == 0) {
                                    iA02 = -1;
                                    strA04 = A01(853, 15, 46);
                                    android.util.Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                                }
                            } else {
                                java.lang.String[] strArr114 = A0i;
                                strArr114[1] = "UnFAd4XuJDxSuzaFoeREgVc6Qs0OmmYm";
                                strArr114[3] = "dBM5Episk82aAApxomIpqdyXT7zAdwmF";
                                if (iA02 == 0) {
                                    iA02 = -1;
                                    strA04 = A01(853, 15, 46);
                                    android.util.Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                                }
                            }
                        } else {
                            strA04 = A01(853, 15, 46);
                            android.util.Log.w(strA03, A01(com.google.android.gms.nearby.messages.Strategy.TTL_SECONDS_DEFAULT, 51, 25) + strA04);
                        }
                        break;
                    case 23:
                        strA04 = A01(790, 9, 116);
                        iA02 = com.facebook.ads.redexgen.core.IK.A02(this.A0A);
                        if (iA02 == 0) {
                            iA02 = -1;
                            strA04 = A01(853, 15, 46);
                            android.util.Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                        }
                        break;
                    case 24:
                        strA04 = A01(693, 20, 122);
                        break;
                    case 25:
                        strA04 = A01(871, 10, 58);
                        break;
                    case 26:
                        strA04 = A01(675, 18, 76);
                        listSingletonList = java.util.Collections.singletonList(this.A0d);
                        break;
                    case 27:
                        strA04 = A01(660, 15, 82);
                        break;
                    case 28:
                        strA04 = A01(641, 19, 91);
                        listSingletonList = java.util.Collections.singletonList(new byte[]{this.A0d[0], this.A0d[1], this.A0d[2], this.A0d[3]});
                        break;
                    default:
                        throw new com.facebook.ads.redexgen.core.A0(A01(470, 30, 89));
                }
                i2 = 0 | (this.A0Z ? 1 : 0) | (this.A0a ? 2 : 0);
                if (com.facebook.ads.redexgen.core.AbstractC0748Hx.A09(strA04)) {
                    i3 = 1;
                    string = java.lang.Integer.toString(i);
                    i6 = this.A0B;
                    i7 = this.A0O;
                    drmInitData = this.A0U;
                    str = this.A0g;
                    strArr2 = A0i;
                    if (strArr2[0].charAt(30) != strArr2[5].charAt(30)) {
                        A0i[2] = "ixQpJ1YMOGXZaJaexLrRt7cPJpDFAOI0";
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A06(string, strA04, null, -1, i8, i6, i7, iA02, listSingletonList, drmInitData, i2, str);
                    } else {
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A06(string, strA04, null, -1, i8, i6, i7, iA02, listSingletonList, drmInitData, i2, str);
                    }
                } else {
                    if (com.facebook.ads.redexgen.core.AbstractC0748Hx.A0B(strA04)) {
                        i3 = 2;
                        if (this.A0H == 0) {
                            if (this.A0I == -1) {
                                i4 = this.A0R;
                            } else {
                                i4 = this.A0I;
                            }
                            this.A0I = i4;
                            if (this.A0G == -1) {
                                i5 = this.A0J;
                            } else {
                                i5 = this.A0G;
                            }
                            this.A0G = i5;
                        }
                        f = -1.0f;
                        if (this.A0I != -1) {
                            f = (this.A0J * this.A0I) / (this.A0R * this.A0G);
                        }
                        colorInfo = null;
                        if (this.A0b) {
                            colorInfo = new com.facebook.ads.internal.exoplayer2.thirdparty.video.ColorInfo(this.A0D, this.A0C, this.A0E, A06());
                        }
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A04(java.lang.Integer.toString(i), strA04, null, -1, i8, this.A0R, this.A0J, -1.0f, listSingletonList, -1, f, this.A0e, this.A0P, colorInfo, this.A0U);
                    } else if (A01(693, 20, 122).equals(strA04)) {
                        i3 = 3;
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A01(java.lang.Integer.toString(i), strA04, i2, this.A0g, this.A0U);
                    } else if (A01(871, 10, 58).equals(strA04)) {
                        i3 = 3;
                        java.util.ArrayList arrayList110 = new java.util.ArrayList(2);
                        arrayList110.add(com.facebook.ads.redexgen.core.C1157Yc.A0t);
                        arrayList110.add(this.A0d);
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A09(java.lang.Integer.toString(i), strA04, null, -1, i2, this.A0g, -1, this.A0U, Long.MAX_VALUE, arrayList110);
                    } else {
                        if (!A01(675, 18, 76).equals(strA04)) {
                        }
                        i3 = 3;
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A0A(java.lang.Integer.toString(i), strA04, null, -1, i2, listSingletonList, this.A0g, this.A0U);
                    }
                    break;
                }
                this.A0W = interfaceC0611Bz.AHA(this.A0N, i3);
                this.A0W.A69(formatA0A);
                return;
            case 542569478:
                if (str2.equals(A01(37, 13, 118))) {
                    b = 19;
                } else {
                    b = -1;
                }
                strA01 = A01(0, 22, 11);
                strA02 = A01(500, 27, 65);
                strA03 = A01(283, 17, 42);
                switch (b) {
                    case 0:
                        strA04 = A01(959, 19, 57);
                        break;
                    case 1:
                        strA04 = A01(978, 19, 62);
                        break;
                    case 2:
                        strA04 = A01(923, 11, 95);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        strA04 = A01(910, 13, 82);
                        if (this.A0d == null) {
                            listSingletonList = java.util.Collections.singletonList(this.A0d);
                        } else {
                            listSingletonList = null;
                        }
                        break;
                    case 6:
                        strA04 = A01(891, 9, 111);
                        com.facebook.ads.redexgen.core.IM imA0110 = com.facebook.ads.redexgen.core.IM.A00(new com.facebook.ads.redexgen.core.I4(this.A0d));
                        listSingletonList = imA0110.A04;
                        this.A0M = imA0110.A02;
                        break;
                    case 7:
                        strA04 = A01(900, 10, 63);
                        com.facebook.ads.redexgen.core.IS isA0110 = com.facebook.ads.redexgen.core.IS.A00(new com.facebook.ads.redexgen.core.I4(this.A0d));
                        listSingletonList = isA0110.A01;
                        this.A0M = isA0110.A00;
                        break;
                    case 8:
                        android.util.Pair<java.lang.String, java.util.List<byte[]>> pairA0110 = A00(new com.facebook.ads.redexgen.core.I4(this.A0d));
                        strA04 = (java.lang.String) pairA0110.first;
                        listSingletonList = (java.util.List) pairA0110.second;
                        break;
                    case 9:
                        strA04 = A01(944, 15, 65);
                        break;
                    case 10:
                        strA04 = A01(841, 12, 73);
                        i8 = 8192;
                        listSingletonList = A03(this.A0d);
                        break;
                    case 11:
                        strA04 = A01(780, 10, 12);
                        i8 = 5760;
                        listSingletonList = new java.util.ArrayList(3);
                        listSingletonList.add(this.A0d);
                        listSingletonList.add(java.nio.ByteBuffer.allocate(8).order(java.nio.ByteOrder.nativeOrder()).putLong(this.A0S).array());
                        listSingletonList.add(java.nio.ByteBuffer.allocate(8).order(java.nio.ByteOrder.nativeOrder()).putLong(this.A0T).array());
                        break;
                    case 12:
                        strA04 = A01(742, 15, 82);
                        listSingletonList = java.util.Collections.singletonList(this.A0d);
                        break;
                    case 13:
                        strA04 = A01(767, 13, 7);
                        i8 = 4096;
                        break;
                    case 14:
                        strA04 = A01(757, 10, 14);
                        i8 = 4096;
                        break;
                    case 15:
                        strA04 = A01(713, 9, 14);
                        break;
                    case 16:
                        strA04 = A01(722, 10, 6);
                        break;
                    case 17:
                        strA04 = A01(799, 13, 106);
                        this.A0X = new com.facebook.ads.redexgen.core.CK();
                        break;
                    case 18:
                    case 19:
                        strA04 = A01(812, 13, 34);
                        break;
                    case 20:
                        strA04 = A01(825, 16, 26);
                        break;
                    case 21:
                        strA04 = A01(732, 10, 43);
                        listSingletonList = java.util.Collections.singletonList(this.A0d);
                        break;
                    case 22:
                        strA04 = A01(790, 9, 116);
                        if (A05(new com.facebook.ads.redexgen.core.I4(this.A0d))) {
                            iA02 = com.facebook.ads.redexgen.core.IK.A02(this.A0A);
                            strArr = A0i;
                            if (strArr[1].charAt(16) != strArr[3].charAt(16)) {
                                if (iA02 == 0) {
                                    iA02 = -1;
                                    strA04 = A01(853, 15, 46);
                                    android.util.Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                                }
                            } else {
                                java.lang.String[] strArr115 = A0i;
                                strArr115[1] = "UnFAd4XuJDxSuzaFoeREgVc6Qs0OmmYm";
                                strArr115[3] = "dBM5Episk82aAApxomIpqdyXT7zAdwmF";
                                if (iA02 == 0) {
                                    iA02 = -1;
                                    strA04 = A01(853, 15, 46);
                                    android.util.Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                                }
                            }
                        } else {
                            strA04 = A01(853, 15, 46);
                            android.util.Log.w(strA03, A01(com.google.android.gms.nearby.messages.Strategy.TTL_SECONDS_DEFAULT, 51, 25) + strA04);
                        }
                        break;
                    case 23:
                        strA04 = A01(790, 9, 116);
                        iA02 = com.facebook.ads.redexgen.core.IK.A02(this.A0A);
                        if (iA02 == 0) {
                            iA02 = -1;
                            strA04 = A01(853, 15, 46);
                            android.util.Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                        }
                        break;
                    case 24:
                        strA04 = A01(693, 20, 122);
                        break;
                    case 25:
                        strA04 = A01(871, 10, 58);
                        break;
                    case 26:
                        strA04 = A01(675, 18, 76);
                        listSingletonList = java.util.Collections.singletonList(this.A0d);
                        break;
                    case 27:
                        strA04 = A01(660, 15, 82);
                        break;
                    case 28:
                        strA04 = A01(641, 19, 91);
                        listSingletonList = java.util.Collections.singletonList(new byte[]{this.A0d[0], this.A0d[1], this.A0d[2], this.A0d[3]});
                        break;
                    default:
                        throw new com.facebook.ads.redexgen.core.A0(A01(470, 30, 89));
                }
                i2 = 0 | (this.A0Z ? 1 : 0) | (this.A0a ? 2 : 0);
                if (com.facebook.ads.redexgen.core.AbstractC0748Hx.A09(strA04)) {
                    i3 = 1;
                    string = java.lang.Integer.toString(i);
                    i6 = this.A0B;
                    i7 = this.A0O;
                    drmInitData = this.A0U;
                    str = this.A0g;
                    strArr2 = A0i;
                    if (strArr2[0].charAt(30) != strArr2[5].charAt(30)) {
                        A0i[2] = "ixQpJ1YMOGXZaJaexLrRt7cPJpDFAOI0";
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A06(string, strA04, null, -1, i8, i6, i7, iA02, listSingletonList, drmInitData, i2, str);
                    } else {
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A06(string, strA04, null, -1, i8, i6, i7, iA02, listSingletonList, drmInitData, i2, str);
                    }
                } else {
                    if (com.facebook.ads.redexgen.core.AbstractC0748Hx.A0B(strA04)) {
                        i3 = 2;
                        if (this.A0H == 0) {
                            if (this.A0I == -1) {
                                i4 = this.A0R;
                            } else {
                                i4 = this.A0I;
                            }
                            this.A0I = i4;
                            if (this.A0G == -1) {
                                i5 = this.A0J;
                            } else {
                                i5 = this.A0G;
                            }
                            this.A0G = i5;
                        }
                        f = -1.0f;
                        if (this.A0I != -1) {
                            f = (this.A0J * this.A0I) / (this.A0R * this.A0G);
                        }
                        colorInfo = null;
                        if (this.A0b) {
                            colorInfo = new com.facebook.ads.internal.exoplayer2.thirdparty.video.ColorInfo(this.A0D, this.A0C, this.A0E, A06());
                        }
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A04(java.lang.Integer.toString(i), strA04, null, -1, i8, this.A0R, this.A0J, -1.0f, listSingletonList, -1, f, this.A0e, this.A0P, colorInfo, this.A0U);
                    } else if (A01(693, 20, 122).equals(strA04)) {
                        i3 = 3;
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A01(java.lang.Integer.toString(i), strA04, i2, this.A0g, this.A0U);
                    } else if (A01(871, 10, 58).equals(strA04)) {
                        i3 = 3;
                        java.util.ArrayList arrayList111 = new java.util.ArrayList(2);
                        arrayList111.add(com.facebook.ads.redexgen.core.C1157Yc.A0t);
                        arrayList111.add(this.A0d);
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A09(java.lang.Integer.toString(i), strA04, null, -1, i2, this.A0g, -1, this.A0U, Long.MAX_VALUE, arrayList111);
                    } else {
                        if (!A01(675, 18, 76).equals(strA04)) {
                        }
                        i3 = 3;
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A0A(java.lang.Integer.toString(i), strA04, null, -1, i2, listSingletonList, this.A0g, this.A0U);
                    }
                    break;
                }
                this.A0W = interfaceC0611Bz.AHA(this.A0N, i3);
                this.A0W.A69(formatA0A);
                return;
            case 725957860:
                if (str2.equals(A01(108, 13, 71))) {
                    b = 23;
                } else {
                    b = -1;
                }
                strA01 = A01(0, 22, 11);
                strA02 = A01(500, 27, 65);
                strA03 = A01(283, 17, 42);
                switch (b) {
                    case 0:
                        strA04 = A01(959, 19, 57);
                        break;
                    case 1:
                        strA04 = A01(978, 19, 62);
                        break;
                    case 2:
                        strA04 = A01(923, 11, 95);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        strA04 = A01(910, 13, 82);
                        if (this.A0d == null) {
                            listSingletonList = java.util.Collections.singletonList(this.A0d);
                        } else {
                            listSingletonList = null;
                        }
                        break;
                    case 6:
                        strA04 = A01(891, 9, 111);
                        com.facebook.ads.redexgen.core.IM imA0111 = com.facebook.ads.redexgen.core.IM.A00(new com.facebook.ads.redexgen.core.I4(this.A0d));
                        listSingletonList = imA0111.A04;
                        this.A0M = imA0111.A02;
                        break;
                    case 7:
                        strA04 = A01(900, 10, 63);
                        com.facebook.ads.redexgen.core.IS isA0111 = com.facebook.ads.redexgen.core.IS.A00(new com.facebook.ads.redexgen.core.I4(this.A0d));
                        listSingletonList = isA0111.A01;
                        this.A0M = isA0111.A00;
                        break;
                    case 8:
                        android.util.Pair<java.lang.String, java.util.List<byte[]>> pairA0111 = A00(new com.facebook.ads.redexgen.core.I4(this.A0d));
                        strA04 = (java.lang.String) pairA0111.first;
                        listSingletonList = (java.util.List) pairA0111.second;
                        break;
                    case 9:
                        strA04 = A01(944, 15, 65);
                        break;
                    case 10:
                        strA04 = A01(841, 12, 73);
                        i8 = 8192;
                        listSingletonList = A03(this.A0d);
                        break;
                    case 11:
                        strA04 = A01(780, 10, 12);
                        i8 = 5760;
                        listSingletonList = new java.util.ArrayList(3);
                        listSingletonList.add(this.A0d);
                        listSingletonList.add(java.nio.ByteBuffer.allocate(8).order(java.nio.ByteOrder.nativeOrder()).putLong(this.A0S).array());
                        listSingletonList.add(java.nio.ByteBuffer.allocate(8).order(java.nio.ByteOrder.nativeOrder()).putLong(this.A0T).array());
                        break;
                    case 12:
                        strA04 = A01(742, 15, 82);
                        listSingletonList = java.util.Collections.singletonList(this.A0d);
                        break;
                    case 13:
                        strA04 = A01(767, 13, 7);
                        i8 = 4096;
                        break;
                    case 14:
                        strA04 = A01(757, 10, 14);
                        i8 = 4096;
                        break;
                    case 15:
                        strA04 = A01(713, 9, 14);
                        break;
                    case 16:
                        strA04 = A01(722, 10, 6);
                        break;
                    case 17:
                        strA04 = A01(799, 13, 106);
                        this.A0X = new com.facebook.ads.redexgen.core.CK();
                        break;
                    case 18:
                    case 19:
                        strA04 = A01(812, 13, 34);
                        break;
                    case 20:
                        strA04 = A01(825, 16, 26);
                        break;
                    case 21:
                        strA04 = A01(732, 10, 43);
                        listSingletonList = java.util.Collections.singletonList(this.A0d);
                        break;
                    case 22:
                        strA04 = A01(790, 9, 116);
                        if (A05(new com.facebook.ads.redexgen.core.I4(this.A0d))) {
                            iA02 = com.facebook.ads.redexgen.core.IK.A02(this.A0A);
                            strArr = A0i;
                            if (strArr[1].charAt(16) != strArr[3].charAt(16)) {
                                if (iA02 == 0) {
                                    iA02 = -1;
                                    strA04 = A01(853, 15, 46);
                                    android.util.Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                                }
                            } else {
                                java.lang.String[] strArr116 = A0i;
                                strArr116[1] = "UnFAd4XuJDxSuzaFoeREgVc6Qs0OmmYm";
                                strArr116[3] = "dBM5Episk82aAApxomIpqdyXT7zAdwmF";
                                if (iA02 == 0) {
                                    iA02 = -1;
                                    strA04 = A01(853, 15, 46);
                                    android.util.Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                                }
                            }
                        } else {
                            strA04 = A01(853, 15, 46);
                            android.util.Log.w(strA03, A01(com.google.android.gms.nearby.messages.Strategy.TTL_SECONDS_DEFAULT, 51, 25) + strA04);
                        }
                        break;
                    case 23:
                        strA04 = A01(790, 9, 116);
                        iA02 = com.facebook.ads.redexgen.core.IK.A02(this.A0A);
                        if (iA02 == 0) {
                            iA02 = -1;
                            strA04 = A01(853, 15, 46);
                            android.util.Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                        }
                        break;
                    case 24:
                        strA04 = A01(693, 20, 122);
                        break;
                    case 25:
                        strA04 = A01(871, 10, 58);
                        break;
                    case 26:
                        strA04 = A01(675, 18, 76);
                        listSingletonList = java.util.Collections.singletonList(this.A0d);
                        break;
                    case 27:
                        strA04 = A01(660, 15, 82);
                        break;
                    case 28:
                        strA04 = A01(641, 19, 91);
                        listSingletonList = java.util.Collections.singletonList(new byte[]{this.A0d[0], this.A0d[1], this.A0d[2], this.A0d[3]});
                        break;
                    default:
                        throw new com.facebook.ads.redexgen.core.A0(A01(470, 30, 89));
                }
                i2 = 0 | (this.A0Z ? 1 : 0) | (this.A0a ? 2 : 0);
                if (com.facebook.ads.redexgen.core.AbstractC0748Hx.A09(strA04)) {
                    i3 = 1;
                    string = java.lang.Integer.toString(i);
                    i6 = this.A0B;
                    i7 = this.A0O;
                    drmInitData = this.A0U;
                    str = this.A0g;
                    strArr2 = A0i;
                    if (strArr2[0].charAt(30) != strArr2[5].charAt(30)) {
                        A0i[2] = "ixQpJ1YMOGXZaJaexLrRt7cPJpDFAOI0";
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A06(string, strA04, null, -1, i8, i6, i7, iA02, listSingletonList, drmInitData, i2, str);
                    } else {
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A06(string, strA04, null, -1, i8, i6, i7, iA02, listSingletonList, drmInitData, i2, str);
                    }
                } else {
                    if (com.facebook.ads.redexgen.core.AbstractC0748Hx.A0B(strA04)) {
                        i3 = 2;
                        if (this.A0H == 0) {
                            if (this.A0I == -1) {
                                i4 = this.A0R;
                            } else {
                                i4 = this.A0I;
                            }
                            this.A0I = i4;
                            if (this.A0G == -1) {
                                i5 = this.A0J;
                            } else {
                                i5 = this.A0G;
                            }
                            this.A0G = i5;
                        }
                        f = -1.0f;
                        if (this.A0I != -1) {
                            f = (this.A0J * this.A0I) / (this.A0R * this.A0G);
                        }
                        colorInfo = null;
                        if (this.A0b) {
                            colorInfo = new com.facebook.ads.internal.exoplayer2.thirdparty.video.ColorInfo(this.A0D, this.A0C, this.A0E, A06());
                        }
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A04(java.lang.Integer.toString(i), strA04, null, -1, i8, this.A0R, this.A0J, -1.0f, listSingletonList, -1, f, this.A0e, this.A0P, colorInfo, this.A0U);
                    } else if (A01(693, 20, 122).equals(strA04)) {
                        i3 = 3;
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A01(java.lang.Integer.toString(i), strA04, i2, this.A0g, this.A0U);
                    } else if (A01(871, 10, 58).equals(strA04)) {
                        i3 = 3;
                        java.util.ArrayList arrayList112 = new java.util.ArrayList(2);
                        arrayList112.add(com.facebook.ads.redexgen.core.C1157Yc.A0t);
                        arrayList112.add(this.A0d);
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A09(java.lang.Integer.toString(i), strA04, null, -1, i2, this.A0g, -1, this.A0U, Long.MAX_VALUE, arrayList112);
                    } else {
                        if (!A01(675, 18, 76).equals(strA04)) {
                        }
                        i3 = 3;
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A0A(java.lang.Integer.toString(i), strA04, null, -1, i2, listSingletonList, this.A0g, this.A0U);
                    }
                    break;
                }
                this.A0W = interfaceC0611Bz.AHA(this.A0N, i3);
                this.A0W.A69(formatA0A);
                return;
            case 738597099:
                if (str2.equals(A01(369, 10, 93))) {
                    b = 25;
                } else {
                    b = -1;
                }
                strA01 = A01(0, 22, 11);
                strA02 = A01(500, 27, 65);
                strA03 = A01(283, 17, 42);
                switch (b) {
                    case 0:
                        strA04 = A01(959, 19, 57);
                        break;
                    case 1:
                        strA04 = A01(978, 19, 62);
                        break;
                    case 2:
                        strA04 = A01(923, 11, 95);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        strA04 = A01(910, 13, 82);
                        if (this.A0d == null) {
                            listSingletonList = java.util.Collections.singletonList(this.A0d);
                        } else {
                            listSingletonList = null;
                        }
                        break;
                    case 6:
                        strA04 = A01(891, 9, 111);
                        com.facebook.ads.redexgen.core.IM imA0112 = com.facebook.ads.redexgen.core.IM.A00(new com.facebook.ads.redexgen.core.I4(this.A0d));
                        listSingletonList = imA0112.A04;
                        this.A0M = imA0112.A02;
                        break;
                    case 7:
                        strA04 = A01(900, 10, 63);
                        com.facebook.ads.redexgen.core.IS isA0112 = com.facebook.ads.redexgen.core.IS.A00(new com.facebook.ads.redexgen.core.I4(this.A0d));
                        listSingletonList = isA0112.A01;
                        this.A0M = isA0112.A00;
                        break;
                    case 8:
                        android.util.Pair<java.lang.String, java.util.List<byte[]>> pairA0112 = A00(new com.facebook.ads.redexgen.core.I4(this.A0d));
                        strA04 = (java.lang.String) pairA0112.first;
                        listSingletonList = (java.util.List) pairA0112.second;
                        break;
                    case 9:
                        strA04 = A01(944, 15, 65);
                        break;
                    case 10:
                        strA04 = A01(841, 12, 73);
                        i8 = 8192;
                        listSingletonList = A03(this.A0d);
                        break;
                    case 11:
                        strA04 = A01(780, 10, 12);
                        i8 = 5760;
                        listSingletonList = new java.util.ArrayList(3);
                        listSingletonList.add(this.A0d);
                        listSingletonList.add(java.nio.ByteBuffer.allocate(8).order(java.nio.ByteOrder.nativeOrder()).putLong(this.A0S).array());
                        listSingletonList.add(java.nio.ByteBuffer.allocate(8).order(java.nio.ByteOrder.nativeOrder()).putLong(this.A0T).array());
                        break;
                    case 12:
                        strA04 = A01(742, 15, 82);
                        listSingletonList = java.util.Collections.singletonList(this.A0d);
                        break;
                    case 13:
                        strA04 = A01(767, 13, 7);
                        i8 = 4096;
                        break;
                    case 14:
                        strA04 = A01(757, 10, 14);
                        i8 = 4096;
                        break;
                    case 15:
                        strA04 = A01(713, 9, 14);
                        break;
                    case 16:
                        strA04 = A01(722, 10, 6);
                        break;
                    case 17:
                        strA04 = A01(799, 13, 106);
                        this.A0X = new com.facebook.ads.redexgen.core.CK();
                        break;
                    case 18:
                    case 19:
                        strA04 = A01(812, 13, 34);
                        break;
                    case 20:
                        strA04 = A01(825, 16, 26);
                        break;
                    case 21:
                        strA04 = A01(732, 10, 43);
                        listSingletonList = java.util.Collections.singletonList(this.A0d);
                        break;
                    case 22:
                        strA04 = A01(790, 9, 116);
                        if (A05(new com.facebook.ads.redexgen.core.I4(this.A0d))) {
                            iA02 = com.facebook.ads.redexgen.core.IK.A02(this.A0A);
                            strArr = A0i;
                            if (strArr[1].charAt(16) != strArr[3].charAt(16)) {
                                if (iA02 == 0) {
                                    iA02 = -1;
                                    strA04 = A01(853, 15, 46);
                                    android.util.Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                                }
                            } else {
                                java.lang.String[] strArr117 = A0i;
                                strArr117[1] = "UnFAd4XuJDxSuzaFoeREgVc6Qs0OmmYm";
                                strArr117[3] = "dBM5Episk82aAApxomIpqdyXT7zAdwmF";
                                if (iA02 == 0) {
                                    iA02 = -1;
                                    strA04 = A01(853, 15, 46);
                                    android.util.Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                                }
                            }
                        } else {
                            strA04 = A01(853, 15, 46);
                            android.util.Log.w(strA03, A01(com.google.android.gms.nearby.messages.Strategy.TTL_SECONDS_DEFAULT, 51, 25) + strA04);
                        }
                        break;
                    case 23:
                        strA04 = A01(790, 9, 116);
                        iA02 = com.facebook.ads.redexgen.core.IK.A02(this.A0A);
                        if (iA02 == 0) {
                            iA02 = -1;
                            strA04 = A01(853, 15, 46);
                            android.util.Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                        }
                        break;
                    case 24:
                        strA04 = A01(693, 20, 122);
                        break;
                    case 25:
                        strA04 = A01(871, 10, 58);
                        break;
                    case 26:
                        strA04 = A01(675, 18, 76);
                        listSingletonList = java.util.Collections.singletonList(this.A0d);
                        break;
                    case 27:
                        strA04 = A01(660, 15, 82);
                        break;
                    case 28:
                        strA04 = A01(641, 19, 91);
                        listSingletonList = java.util.Collections.singletonList(new byte[]{this.A0d[0], this.A0d[1], this.A0d[2], this.A0d[3]});
                        break;
                    default:
                        throw new com.facebook.ads.redexgen.core.A0(A01(470, 30, 89));
                }
                i2 = 0 | (this.A0Z ? 1 : 0) | (this.A0a ? 2 : 0);
                if (com.facebook.ads.redexgen.core.AbstractC0748Hx.A09(strA04)) {
                    i3 = 1;
                    string = java.lang.Integer.toString(i);
                    i6 = this.A0B;
                    i7 = this.A0O;
                    drmInitData = this.A0U;
                    str = this.A0g;
                    strArr2 = A0i;
                    if (strArr2[0].charAt(30) != strArr2[5].charAt(30)) {
                        A0i[2] = "ixQpJ1YMOGXZaJaexLrRt7cPJpDFAOI0";
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A06(string, strA04, null, -1, i8, i6, i7, iA02, listSingletonList, drmInitData, i2, str);
                    } else {
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A06(string, strA04, null, -1, i8, i6, i7, iA02, listSingletonList, drmInitData, i2, str);
                    }
                } else {
                    if (com.facebook.ads.redexgen.core.AbstractC0748Hx.A0B(strA04)) {
                        i3 = 2;
                        if (this.A0H == 0) {
                            if (this.A0I == -1) {
                                i4 = this.A0R;
                            } else {
                                i4 = this.A0I;
                            }
                            this.A0I = i4;
                            if (this.A0G == -1) {
                                i5 = this.A0J;
                            } else {
                                i5 = this.A0G;
                            }
                            this.A0G = i5;
                        }
                        f = -1.0f;
                        if (this.A0I != -1) {
                            f = (this.A0J * this.A0I) / (this.A0R * this.A0G);
                        }
                        colorInfo = null;
                        if (this.A0b) {
                            colorInfo = new com.facebook.ads.internal.exoplayer2.thirdparty.video.ColorInfo(this.A0D, this.A0C, this.A0E, A06());
                        }
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A04(java.lang.Integer.toString(i), strA04, null, -1, i8, this.A0R, this.A0J, -1.0f, listSingletonList, -1, f, this.A0e, this.A0P, colorInfo, this.A0U);
                    } else if (A01(693, 20, 122).equals(strA04)) {
                        i3 = 3;
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A01(java.lang.Integer.toString(i), strA04, i2, this.A0g, this.A0U);
                    } else if (A01(871, 10, 58).equals(strA04)) {
                        i3 = 3;
                        java.util.ArrayList arrayList113 = new java.util.ArrayList(2);
                        arrayList113.add(com.facebook.ads.redexgen.core.C1157Yc.A0t);
                        arrayList113.add(this.A0d);
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A09(java.lang.Integer.toString(i), strA04, null, -1, i2, this.A0g, -1, this.A0U, Long.MAX_VALUE, arrayList113);
                    } else {
                        if (!A01(675, 18, 76).equals(strA04)) {
                        }
                        i3 = 3;
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A0A(java.lang.Integer.toString(i), strA04, null, -1, i2, listSingletonList, this.A0g, this.A0U);
                    }
                    break;
                }
                this.A0W = interfaceC0611Bz.AHA(this.A0N, i3);
                this.A0W.A69(formatA0A);
                return;
            case 855502857:
                if (str2.equals(A01(592, 16, 100))) {
                    b = 7;
                } else {
                    b = -1;
                }
                strA01 = A01(0, 22, 11);
                strA02 = A01(500, 27, 65);
                strA03 = A01(283, 17, 42);
                switch (b) {
                    case 0:
                        strA04 = A01(959, 19, 57);
                        break;
                    case 1:
                        strA04 = A01(978, 19, 62);
                        break;
                    case 2:
                        strA04 = A01(923, 11, 95);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        strA04 = A01(910, 13, 82);
                        if (this.A0d == null) {
                            listSingletonList = java.util.Collections.singletonList(this.A0d);
                        } else {
                            listSingletonList = null;
                        }
                        break;
                    case 6:
                        strA04 = A01(891, 9, 111);
                        com.facebook.ads.redexgen.core.IM imA0113 = com.facebook.ads.redexgen.core.IM.A00(new com.facebook.ads.redexgen.core.I4(this.A0d));
                        listSingletonList = imA0113.A04;
                        this.A0M = imA0113.A02;
                        break;
                    case 7:
                        strA04 = A01(900, 10, 63);
                        com.facebook.ads.redexgen.core.IS isA0113 = com.facebook.ads.redexgen.core.IS.A00(new com.facebook.ads.redexgen.core.I4(this.A0d));
                        listSingletonList = isA0113.A01;
                        this.A0M = isA0113.A00;
                        break;
                    case 8:
                        android.util.Pair<java.lang.String, java.util.List<byte[]>> pairA0113 = A00(new com.facebook.ads.redexgen.core.I4(this.A0d));
                        strA04 = (java.lang.String) pairA0113.first;
                        listSingletonList = (java.util.List) pairA0113.second;
                        break;
                    case 9:
                        strA04 = A01(944, 15, 65);
                        break;
                    case 10:
                        strA04 = A01(841, 12, 73);
                        i8 = 8192;
                        listSingletonList = A03(this.A0d);
                        break;
                    case 11:
                        strA04 = A01(780, 10, 12);
                        i8 = 5760;
                        listSingletonList = new java.util.ArrayList(3);
                        listSingletonList.add(this.A0d);
                        listSingletonList.add(java.nio.ByteBuffer.allocate(8).order(java.nio.ByteOrder.nativeOrder()).putLong(this.A0S).array());
                        listSingletonList.add(java.nio.ByteBuffer.allocate(8).order(java.nio.ByteOrder.nativeOrder()).putLong(this.A0T).array());
                        break;
                    case 12:
                        strA04 = A01(742, 15, 82);
                        listSingletonList = java.util.Collections.singletonList(this.A0d);
                        break;
                    case 13:
                        strA04 = A01(767, 13, 7);
                        i8 = 4096;
                        break;
                    case 14:
                        strA04 = A01(757, 10, 14);
                        i8 = 4096;
                        break;
                    case 15:
                        strA04 = A01(713, 9, 14);
                        break;
                    case 16:
                        strA04 = A01(722, 10, 6);
                        break;
                    case 17:
                        strA04 = A01(799, 13, 106);
                        this.A0X = new com.facebook.ads.redexgen.core.CK();
                        break;
                    case 18:
                    case 19:
                        strA04 = A01(812, 13, 34);
                        break;
                    case 20:
                        strA04 = A01(825, 16, 26);
                        break;
                    case 21:
                        strA04 = A01(732, 10, 43);
                        listSingletonList = java.util.Collections.singletonList(this.A0d);
                        break;
                    case 22:
                        strA04 = A01(790, 9, 116);
                        if (A05(new com.facebook.ads.redexgen.core.I4(this.A0d))) {
                            iA02 = com.facebook.ads.redexgen.core.IK.A02(this.A0A);
                            strArr = A0i;
                            if (strArr[1].charAt(16) != strArr[3].charAt(16)) {
                                if (iA02 == 0) {
                                    iA02 = -1;
                                    strA04 = A01(853, 15, 46);
                                    android.util.Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                                }
                            } else {
                                java.lang.String[] strArr118 = A0i;
                                strArr118[1] = "UnFAd4XuJDxSuzaFoeREgVc6Qs0OmmYm";
                                strArr118[3] = "dBM5Episk82aAApxomIpqdyXT7zAdwmF";
                                if (iA02 == 0) {
                                    iA02 = -1;
                                    strA04 = A01(853, 15, 46);
                                    android.util.Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                                }
                            }
                        } else {
                            strA04 = A01(853, 15, 46);
                            android.util.Log.w(strA03, A01(com.google.android.gms.nearby.messages.Strategy.TTL_SECONDS_DEFAULT, 51, 25) + strA04);
                        }
                        break;
                    case 23:
                        strA04 = A01(790, 9, 116);
                        iA02 = com.facebook.ads.redexgen.core.IK.A02(this.A0A);
                        if (iA02 == 0) {
                            iA02 = -1;
                            strA04 = A01(853, 15, 46);
                            android.util.Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                        }
                        break;
                    case 24:
                        strA04 = A01(693, 20, 122);
                        break;
                    case 25:
                        strA04 = A01(871, 10, 58);
                        break;
                    case 26:
                        strA04 = A01(675, 18, 76);
                        listSingletonList = java.util.Collections.singletonList(this.A0d);
                        break;
                    case 27:
                        strA04 = A01(660, 15, 82);
                        break;
                    case 28:
                        strA04 = A01(641, 19, 91);
                        listSingletonList = java.util.Collections.singletonList(new byte[]{this.A0d[0], this.A0d[1], this.A0d[2], this.A0d[3]});
                        break;
                    default:
                        throw new com.facebook.ads.redexgen.core.A0(A01(470, 30, 89));
                }
                i2 = 0 | (this.A0Z ? 1 : 0) | (this.A0a ? 2 : 0);
                if (com.facebook.ads.redexgen.core.AbstractC0748Hx.A09(strA04)) {
                    i3 = 1;
                    string = java.lang.Integer.toString(i);
                    i6 = this.A0B;
                    i7 = this.A0O;
                    drmInitData = this.A0U;
                    str = this.A0g;
                    strArr2 = A0i;
                    if (strArr2[0].charAt(30) != strArr2[5].charAt(30)) {
                        A0i[2] = "ixQpJ1YMOGXZaJaexLrRt7cPJpDFAOI0";
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A06(string, strA04, null, -1, i8, i6, i7, iA02, listSingletonList, drmInitData, i2, str);
                    } else {
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A06(string, strA04, null, -1, i8, i6, i7, iA02, listSingletonList, drmInitData, i2, str);
                    }
                } else {
                    if (com.facebook.ads.redexgen.core.AbstractC0748Hx.A0B(strA04)) {
                        i3 = 2;
                        if (this.A0H == 0) {
                            if (this.A0I == -1) {
                                i4 = this.A0R;
                            } else {
                                i4 = this.A0I;
                            }
                            this.A0I = i4;
                            if (this.A0G == -1) {
                                i5 = this.A0J;
                            } else {
                                i5 = this.A0G;
                            }
                            this.A0G = i5;
                        }
                        f = -1.0f;
                        if (this.A0I != -1) {
                            f = (this.A0J * this.A0I) / (this.A0R * this.A0G);
                        }
                        colorInfo = null;
                        if (this.A0b) {
                            colorInfo = new com.facebook.ads.internal.exoplayer2.thirdparty.video.ColorInfo(this.A0D, this.A0C, this.A0E, A06());
                        }
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A04(java.lang.Integer.toString(i), strA04, null, -1, i8, this.A0R, this.A0J, -1.0f, listSingletonList, -1, f, this.A0e, this.A0P, colorInfo, this.A0U);
                    } else if (A01(693, 20, 122).equals(strA04)) {
                        i3 = 3;
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A01(java.lang.Integer.toString(i), strA04, i2, this.A0g, this.A0U);
                    } else if (A01(871, 10, 58).equals(strA04)) {
                        i3 = 3;
                        java.util.ArrayList arrayList114 = new java.util.ArrayList(2);
                        arrayList114.add(com.facebook.ads.redexgen.core.C1157Yc.A0t);
                        arrayList114.add(this.A0d);
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A09(java.lang.Integer.toString(i), strA04, null, -1, i2, this.A0g, -1, this.A0U, Long.MAX_VALUE, arrayList114);
                    } else {
                        if (!A01(675, 18, 76).equals(strA04)) {
                        }
                        i3 = 3;
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A0A(java.lang.Integer.toString(i), strA04, null, -1, i2, listSingletonList, this.A0g, this.A0U);
                    }
                    break;
                }
                this.A0W = interfaceC0611Bz.AHA(this.A0N, i3);
                this.A0W.A69(formatA0A);
                return;
            case 1422270023:
                if (str2.equals(A01(379, 11, 55))) {
                    b = 24;
                } else {
                    b = -1;
                }
                strA01 = A01(0, 22, 11);
                strA02 = A01(500, 27, 65);
                strA03 = A01(283, 17, 42);
                switch (b) {
                    case 0:
                        strA04 = A01(959, 19, 57);
                        break;
                    case 1:
                        strA04 = A01(978, 19, 62);
                        break;
                    case 2:
                        strA04 = A01(923, 11, 95);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        strA04 = A01(910, 13, 82);
                        if (this.A0d == null) {
                            listSingletonList = java.util.Collections.singletonList(this.A0d);
                        } else {
                            listSingletonList = null;
                        }
                        break;
                    case 6:
                        strA04 = A01(891, 9, 111);
                        com.facebook.ads.redexgen.core.IM imA0114 = com.facebook.ads.redexgen.core.IM.A00(new com.facebook.ads.redexgen.core.I4(this.A0d));
                        listSingletonList = imA0114.A04;
                        this.A0M = imA0114.A02;
                        break;
                    case 7:
                        strA04 = A01(900, 10, 63);
                        com.facebook.ads.redexgen.core.IS isA0114 = com.facebook.ads.redexgen.core.IS.A00(new com.facebook.ads.redexgen.core.I4(this.A0d));
                        listSingletonList = isA0114.A01;
                        this.A0M = isA0114.A00;
                        break;
                    case 8:
                        android.util.Pair<java.lang.String, java.util.List<byte[]>> pairA0114 = A00(new com.facebook.ads.redexgen.core.I4(this.A0d));
                        strA04 = (java.lang.String) pairA0114.first;
                        listSingletonList = (java.util.List) pairA0114.second;
                        break;
                    case 9:
                        strA04 = A01(944, 15, 65);
                        break;
                    case 10:
                        strA04 = A01(841, 12, 73);
                        i8 = 8192;
                        listSingletonList = A03(this.A0d);
                        break;
                    case 11:
                        strA04 = A01(780, 10, 12);
                        i8 = 5760;
                        listSingletonList = new java.util.ArrayList(3);
                        listSingletonList.add(this.A0d);
                        listSingletonList.add(java.nio.ByteBuffer.allocate(8).order(java.nio.ByteOrder.nativeOrder()).putLong(this.A0S).array());
                        listSingletonList.add(java.nio.ByteBuffer.allocate(8).order(java.nio.ByteOrder.nativeOrder()).putLong(this.A0T).array());
                        break;
                    case 12:
                        strA04 = A01(742, 15, 82);
                        listSingletonList = java.util.Collections.singletonList(this.A0d);
                        break;
                    case 13:
                        strA04 = A01(767, 13, 7);
                        i8 = 4096;
                        break;
                    case 14:
                        strA04 = A01(757, 10, 14);
                        i8 = 4096;
                        break;
                    case 15:
                        strA04 = A01(713, 9, 14);
                        break;
                    case 16:
                        strA04 = A01(722, 10, 6);
                        break;
                    case 17:
                        strA04 = A01(799, 13, 106);
                        this.A0X = new com.facebook.ads.redexgen.core.CK();
                        break;
                    case 18:
                    case 19:
                        strA04 = A01(812, 13, 34);
                        break;
                    case 20:
                        strA04 = A01(825, 16, 26);
                        break;
                    case 21:
                        strA04 = A01(732, 10, 43);
                        listSingletonList = java.util.Collections.singletonList(this.A0d);
                        break;
                    case 22:
                        strA04 = A01(790, 9, 116);
                        if (A05(new com.facebook.ads.redexgen.core.I4(this.A0d))) {
                            iA02 = com.facebook.ads.redexgen.core.IK.A02(this.A0A);
                            strArr = A0i;
                            if (strArr[1].charAt(16) != strArr[3].charAt(16)) {
                                if (iA02 == 0) {
                                    iA02 = -1;
                                    strA04 = A01(853, 15, 46);
                                    android.util.Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                                }
                            } else {
                                java.lang.String[] strArr119 = A0i;
                                strArr119[1] = "UnFAd4XuJDxSuzaFoeREgVc6Qs0OmmYm";
                                strArr119[3] = "dBM5Episk82aAApxomIpqdyXT7zAdwmF";
                                if (iA02 == 0) {
                                    iA02 = -1;
                                    strA04 = A01(853, 15, 46);
                                    android.util.Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                                }
                            }
                        } else {
                            strA04 = A01(853, 15, 46);
                            android.util.Log.w(strA03, A01(com.google.android.gms.nearby.messages.Strategy.TTL_SECONDS_DEFAULT, 51, 25) + strA04);
                        }
                        break;
                    case 23:
                        strA04 = A01(790, 9, 116);
                        iA02 = com.facebook.ads.redexgen.core.IK.A02(this.A0A);
                        if (iA02 == 0) {
                            iA02 = -1;
                            strA04 = A01(853, 15, 46);
                            android.util.Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                        }
                        break;
                    case 24:
                        strA04 = A01(693, 20, 122);
                        break;
                    case 25:
                        strA04 = A01(871, 10, 58);
                        break;
                    case 26:
                        strA04 = A01(675, 18, 76);
                        listSingletonList = java.util.Collections.singletonList(this.A0d);
                        break;
                    case 27:
                        strA04 = A01(660, 15, 82);
                        break;
                    case 28:
                        strA04 = A01(641, 19, 91);
                        listSingletonList = java.util.Collections.singletonList(new byte[]{this.A0d[0], this.A0d[1], this.A0d[2], this.A0d[3]});
                        break;
                    default:
                        throw new com.facebook.ads.redexgen.core.A0(A01(470, 30, 89));
                }
                i2 = 0 | (this.A0Z ? 1 : 0) | (this.A0a ? 2 : 0);
                if (com.facebook.ads.redexgen.core.AbstractC0748Hx.A09(strA04)) {
                    i3 = 1;
                    string = java.lang.Integer.toString(i);
                    i6 = this.A0B;
                    i7 = this.A0O;
                    drmInitData = this.A0U;
                    str = this.A0g;
                    strArr2 = A0i;
                    if (strArr2[0].charAt(30) != strArr2[5].charAt(30)) {
                        A0i[2] = "ixQpJ1YMOGXZaJaexLrRt7cPJpDFAOI0";
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A06(string, strA04, null, -1, i8, i6, i7, iA02, listSingletonList, drmInitData, i2, str);
                    } else {
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A06(string, strA04, null, -1, i8, i6, i7, iA02, listSingletonList, drmInitData, i2, str);
                    }
                } else {
                    if (com.facebook.ads.redexgen.core.AbstractC0748Hx.A0B(strA04)) {
                        i3 = 2;
                        if (this.A0H == 0) {
                            if (this.A0I == -1) {
                                i4 = this.A0R;
                            } else {
                                i4 = this.A0I;
                            }
                            this.A0I = i4;
                            if (this.A0G == -1) {
                                i5 = this.A0J;
                            } else {
                                i5 = this.A0G;
                            }
                            this.A0G = i5;
                        }
                        f = -1.0f;
                        if (this.A0I != -1) {
                            f = (this.A0J * this.A0I) / (this.A0R * this.A0G);
                        }
                        colorInfo = null;
                        if (this.A0b) {
                            colorInfo = new com.facebook.ads.internal.exoplayer2.thirdparty.video.ColorInfo(this.A0D, this.A0C, this.A0E, A06());
                        }
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A04(java.lang.Integer.toString(i), strA04, null, -1, i8, this.A0R, this.A0J, -1.0f, listSingletonList, -1, f, this.A0e, this.A0P, colorInfo, this.A0U);
                    } else if (A01(693, 20, 122).equals(strA04)) {
                        i3 = 3;
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A01(java.lang.Integer.toString(i), strA04, i2, this.A0g, this.A0U);
                    } else if (A01(871, 10, 58).equals(strA04)) {
                        i3 = 3;
                        java.util.ArrayList arrayList115 = new java.util.ArrayList(2);
                        arrayList115.add(com.facebook.ads.redexgen.core.C1157Yc.A0t);
                        arrayList115.add(this.A0d);
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A09(java.lang.Integer.toString(i), strA04, null, -1, i2, this.A0g, -1, this.A0U, Long.MAX_VALUE, arrayList115);
                    } else {
                        if (!A01(675, 18, 76).equals(strA04)) {
                        }
                        i3 = 3;
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A0A(java.lang.Integer.toString(i), strA04, null, -1, i2, listSingletonList, this.A0g, this.A0U);
                    }
                    break;
                }
                this.A0W = interfaceC0611Bz.AHA(this.A0N, i3);
                this.A0W.A69(formatA0A);
                return;
            case 1809237540:
                if (str2.equals(A01(com.json.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 7, 64))) {
                    b = 2;
                } else {
                    b = -1;
                }
                strA01 = A01(0, 22, 11);
                strA02 = A01(500, 27, 65);
                strA03 = A01(283, 17, 42);
                switch (b) {
                    case 0:
                        strA04 = A01(959, 19, 57);
                        break;
                    case 1:
                        strA04 = A01(978, 19, 62);
                        break;
                    case 2:
                        strA04 = A01(923, 11, 95);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        strA04 = A01(910, 13, 82);
                        if (this.A0d == null) {
                            listSingletonList = java.util.Collections.singletonList(this.A0d);
                        } else {
                            listSingletonList = null;
                        }
                        break;
                    case 6:
                        strA04 = A01(891, 9, 111);
                        com.facebook.ads.redexgen.core.IM imA0115 = com.facebook.ads.redexgen.core.IM.A00(new com.facebook.ads.redexgen.core.I4(this.A0d));
                        listSingletonList = imA0115.A04;
                        this.A0M = imA0115.A02;
                        break;
                    case 7:
                        strA04 = A01(900, 10, 63);
                        com.facebook.ads.redexgen.core.IS isA0115 = com.facebook.ads.redexgen.core.IS.A00(new com.facebook.ads.redexgen.core.I4(this.A0d));
                        listSingletonList = isA0115.A01;
                        this.A0M = isA0115.A00;
                        break;
                    case 8:
                        android.util.Pair<java.lang.String, java.util.List<byte[]>> pairA0115 = A00(new com.facebook.ads.redexgen.core.I4(this.A0d));
                        strA04 = (java.lang.String) pairA0115.first;
                        listSingletonList = (java.util.List) pairA0115.second;
                        break;
                    case 9:
                        strA04 = A01(944, 15, 65);
                        break;
                    case 10:
                        strA04 = A01(841, 12, 73);
                        i8 = 8192;
                        listSingletonList = A03(this.A0d);
                        break;
                    case 11:
                        strA04 = A01(780, 10, 12);
                        i8 = 5760;
                        listSingletonList = new java.util.ArrayList(3);
                        listSingletonList.add(this.A0d);
                        listSingletonList.add(java.nio.ByteBuffer.allocate(8).order(java.nio.ByteOrder.nativeOrder()).putLong(this.A0S).array());
                        listSingletonList.add(java.nio.ByteBuffer.allocate(8).order(java.nio.ByteOrder.nativeOrder()).putLong(this.A0T).array());
                        break;
                    case 12:
                        strA04 = A01(742, 15, 82);
                        listSingletonList = java.util.Collections.singletonList(this.A0d);
                        break;
                    case 13:
                        strA04 = A01(767, 13, 7);
                        i8 = 4096;
                        break;
                    case 14:
                        strA04 = A01(757, 10, 14);
                        i8 = 4096;
                        break;
                    case 15:
                        strA04 = A01(713, 9, 14);
                        break;
                    case 16:
                        strA04 = A01(722, 10, 6);
                        break;
                    case 17:
                        strA04 = A01(799, 13, 106);
                        this.A0X = new com.facebook.ads.redexgen.core.CK();
                        break;
                    case 18:
                    case 19:
                        strA04 = A01(812, 13, 34);
                        break;
                    case 20:
                        strA04 = A01(825, 16, 26);
                        break;
                    case 21:
                        strA04 = A01(732, 10, 43);
                        listSingletonList = java.util.Collections.singletonList(this.A0d);
                        break;
                    case 22:
                        strA04 = A01(790, 9, 116);
                        if (A05(new com.facebook.ads.redexgen.core.I4(this.A0d))) {
                            iA02 = com.facebook.ads.redexgen.core.IK.A02(this.A0A);
                            strArr = A0i;
                            if (strArr[1].charAt(16) != strArr[3].charAt(16)) {
                                if (iA02 == 0) {
                                    iA02 = -1;
                                    strA04 = A01(853, 15, 46);
                                    android.util.Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                                }
                            } else {
                                java.lang.String[] strArr1110 = A0i;
                                strArr1110[1] = "UnFAd4XuJDxSuzaFoeREgVc6Qs0OmmYm";
                                strArr1110[3] = "dBM5Episk82aAApxomIpqdyXT7zAdwmF";
                                if (iA02 == 0) {
                                    iA02 = -1;
                                    strA04 = A01(853, 15, 46);
                                    android.util.Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                                }
                            }
                        } else {
                            strA04 = A01(853, 15, 46);
                            android.util.Log.w(strA03, A01(com.google.android.gms.nearby.messages.Strategy.TTL_SECONDS_DEFAULT, 51, 25) + strA04);
                        }
                        break;
                    case 23:
                        strA04 = A01(790, 9, 116);
                        iA02 = com.facebook.ads.redexgen.core.IK.A02(this.A0A);
                        if (iA02 == 0) {
                            iA02 = -1;
                            strA04 = A01(853, 15, 46);
                            android.util.Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                        }
                        break;
                    case 24:
                        strA04 = A01(693, 20, 122);
                        break;
                    case 25:
                        strA04 = A01(871, 10, 58);
                        break;
                    case 26:
                        strA04 = A01(675, 18, 76);
                        listSingletonList = java.util.Collections.singletonList(this.A0d);
                        break;
                    case 27:
                        strA04 = A01(660, 15, 82);
                        break;
                    case 28:
                        strA04 = A01(641, 19, 91);
                        listSingletonList = java.util.Collections.singletonList(new byte[]{this.A0d[0], this.A0d[1], this.A0d[2], this.A0d[3]});
                        break;
                    default:
                        throw new com.facebook.ads.redexgen.core.A0(A01(470, 30, 89));
                }
                i2 = 0 | (this.A0Z ? 1 : 0) | (this.A0a ? 2 : 0);
                if (com.facebook.ads.redexgen.core.AbstractC0748Hx.A09(strA04)) {
                    i3 = 1;
                    string = java.lang.Integer.toString(i);
                    i6 = this.A0B;
                    i7 = this.A0O;
                    drmInitData = this.A0U;
                    str = this.A0g;
                    strArr2 = A0i;
                    if (strArr2[0].charAt(30) != strArr2[5].charAt(30)) {
                        A0i[2] = "ixQpJ1YMOGXZaJaexLrRt7cPJpDFAOI0";
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A06(string, strA04, null, -1, i8, i6, i7, iA02, listSingletonList, drmInitData, i2, str);
                    } else {
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A06(string, strA04, null, -1, i8, i6, i7, iA02, listSingletonList, drmInitData, i2, str);
                    }
                } else {
                    if (com.facebook.ads.redexgen.core.AbstractC0748Hx.A0B(strA04)) {
                        i3 = 2;
                        if (this.A0H == 0) {
                            if (this.A0I == -1) {
                                i4 = this.A0R;
                            } else {
                                i4 = this.A0I;
                            }
                            this.A0I = i4;
                            if (this.A0G == -1) {
                                i5 = this.A0J;
                            } else {
                                i5 = this.A0G;
                            }
                            this.A0G = i5;
                        }
                        f = -1.0f;
                        if (this.A0I != -1) {
                            f = (this.A0J * this.A0I) / (this.A0R * this.A0G);
                        }
                        colorInfo = null;
                        if (this.A0b) {
                            colorInfo = new com.facebook.ads.internal.exoplayer2.thirdparty.video.ColorInfo(this.A0D, this.A0C, this.A0E, A06());
                        }
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A04(java.lang.Integer.toString(i), strA04, null, -1, i8, this.A0R, this.A0J, -1.0f, listSingletonList, -1, f, this.A0e, this.A0P, colorInfo, this.A0U);
                    } else if (A01(693, 20, 122).equals(strA04)) {
                        i3 = 3;
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A01(java.lang.Integer.toString(i), strA04, i2, this.A0g, this.A0U);
                    } else if (A01(871, 10, 58).equals(strA04)) {
                        i3 = 3;
                        java.util.ArrayList arrayList116 = new java.util.ArrayList(2);
                        arrayList116.add(com.facebook.ads.redexgen.core.C1157Yc.A0t);
                        arrayList116.add(this.A0d);
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A09(java.lang.Integer.toString(i), strA04, null, -1, i2, this.A0g, -1, this.A0U, Long.MAX_VALUE, arrayList116);
                    } else {
                        if (!A01(675, 18, 76).equals(strA04)) {
                        }
                        i3 = 3;
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A0A(java.lang.Integer.toString(i), strA04, null, -1, i2, listSingletonList, this.A0g, this.A0U);
                    }
                    break;
                }
                this.A0W = interfaceC0611Bz.AHA(this.A0N, i3);
                this.A0W.A69(formatA0A);
                return;
            case 1950749482:
                if (str2.equals(A01(64, 6, 71))) {
                    b = 16;
                } else {
                    b = -1;
                }
                strA01 = A01(0, 22, 11);
                strA02 = A01(500, 27, 65);
                strA03 = A01(283, 17, 42);
                switch (b) {
                    case 0:
                        strA04 = A01(959, 19, 57);
                        break;
                    case 1:
                        strA04 = A01(978, 19, 62);
                        break;
                    case 2:
                        strA04 = A01(923, 11, 95);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        strA04 = A01(910, 13, 82);
                        if (this.A0d == null) {
                            listSingletonList = java.util.Collections.singletonList(this.A0d);
                        } else {
                            listSingletonList = null;
                        }
                        break;
                    case 6:
                        strA04 = A01(891, 9, 111);
                        com.facebook.ads.redexgen.core.IM imA0116 = com.facebook.ads.redexgen.core.IM.A00(new com.facebook.ads.redexgen.core.I4(this.A0d));
                        listSingletonList = imA0116.A04;
                        this.A0M = imA0116.A02;
                        break;
                    case 7:
                        strA04 = A01(900, 10, 63);
                        com.facebook.ads.redexgen.core.IS isA0116 = com.facebook.ads.redexgen.core.IS.A00(new com.facebook.ads.redexgen.core.I4(this.A0d));
                        listSingletonList = isA0116.A01;
                        this.A0M = isA0116.A00;
                        break;
                    case 8:
                        android.util.Pair<java.lang.String, java.util.List<byte[]>> pairA0116 = A00(new com.facebook.ads.redexgen.core.I4(this.A0d));
                        strA04 = (java.lang.String) pairA0116.first;
                        listSingletonList = (java.util.List) pairA0116.second;
                        break;
                    case 9:
                        strA04 = A01(944, 15, 65);
                        break;
                    case 10:
                        strA04 = A01(841, 12, 73);
                        i8 = 8192;
                        listSingletonList = A03(this.A0d);
                        break;
                    case 11:
                        strA04 = A01(780, 10, 12);
                        i8 = 5760;
                        listSingletonList = new java.util.ArrayList(3);
                        listSingletonList.add(this.A0d);
                        listSingletonList.add(java.nio.ByteBuffer.allocate(8).order(java.nio.ByteOrder.nativeOrder()).putLong(this.A0S).array());
                        listSingletonList.add(java.nio.ByteBuffer.allocate(8).order(java.nio.ByteOrder.nativeOrder()).putLong(this.A0T).array());
                        break;
                    case 12:
                        strA04 = A01(742, 15, 82);
                        listSingletonList = java.util.Collections.singletonList(this.A0d);
                        break;
                    case 13:
                        strA04 = A01(767, 13, 7);
                        i8 = 4096;
                        break;
                    case 14:
                        strA04 = A01(757, 10, 14);
                        i8 = 4096;
                        break;
                    case 15:
                        strA04 = A01(713, 9, 14);
                        break;
                    case 16:
                        strA04 = A01(722, 10, 6);
                        break;
                    case 17:
                        strA04 = A01(799, 13, 106);
                        this.A0X = new com.facebook.ads.redexgen.core.CK();
                        break;
                    case 18:
                    case 19:
                        strA04 = A01(812, 13, 34);
                        break;
                    case 20:
                        strA04 = A01(825, 16, 26);
                        break;
                    case 21:
                        strA04 = A01(732, 10, 43);
                        listSingletonList = java.util.Collections.singletonList(this.A0d);
                        break;
                    case 22:
                        strA04 = A01(790, 9, 116);
                        if (A05(new com.facebook.ads.redexgen.core.I4(this.A0d))) {
                            iA02 = com.facebook.ads.redexgen.core.IK.A02(this.A0A);
                            strArr = A0i;
                            if (strArr[1].charAt(16) != strArr[3].charAt(16)) {
                                if (iA02 == 0) {
                                    iA02 = -1;
                                    strA04 = A01(853, 15, 46);
                                    android.util.Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                                }
                            } else {
                                java.lang.String[] strArr1111 = A0i;
                                strArr1111[1] = "UnFAd4XuJDxSuzaFoeREgVc6Qs0OmmYm";
                                strArr1111[3] = "dBM5Episk82aAApxomIpqdyXT7zAdwmF";
                                if (iA02 == 0) {
                                    iA02 = -1;
                                    strA04 = A01(853, 15, 46);
                                    android.util.Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                                }
                            }
                        } else {
                            strA04 = A01(853, 15, 46);
                            android.util.Log.w(strA03, A01(com.google.android.gms.nearby.messages.Strategy.TTL_SECONDS_DEFAULT, 51, 25) + strA04);
                        }
                        break;
                    case 23:
                        strA04 = A01(790, 9, 116);
                        iA02 = com.facebook.ads.redexgen.core.IK.A02(this.A0A);
                        if (iA02 == 0) {
                            iA02 = -1;
                            strA04 = A01(853, 15, 46);
                            android.util.Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                        }
                        break;
                    case 24:
                        strA04 = A01(693, 20, 122);
                        break;
                    case 25:
                        strA04 = A01(871, 10, 58);
                        break;
                    case 26:
                        strA04 = A01(675, 18, 76);
                        listSingletonList = java.util.Collections.singletonList(this.A0d);
                        break;
                    case 27:
                        strA04 = A01(660, 15, 82);
                        break;
                    case 28:
                        strA04 = A01(641, 19, 91);
                        listSingletonList = java.util.Collections.singletonList(new byte[]{this.A0d[0], this.A0d[1], this.A0d[2], this.A0d[3]});
                        break;
                    default:
                        throw new com.facebook.ads.redexgen.core.A0(A01(470, 30, 89));
                }
                i2 = 0 | (this.A0Z ? 1 : 0) | (this.A0a ? 2 : 0);
                if (com.facebook.ads.redexgen.core.AbstractC0748Hx.A09(strA04)) {
                    i3 = 1;
                    string = java.lang.Integer.toString(i);
                    i6 = this.A0B;
                    i7 = this.A0O;
                    drmInitData = this.A0U;
                    str = this.A0g;
                    strArr2 = A0i;
                    if (strArr2[0].charAt(30) != strArr2[5].charAt(30)) {
                        A0i[2] = "ixQpJ1YMOGXZaJaexLrRt7cPJpDFAOI0";
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A06(string, strA04, null, -1, i8, i6, i7, iA02, listSingletonList, drmInitData, i2, str);
                    } else {
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A06(string, strA04, null, -1, i8, i6, i7, iA02, listSingletonList, drmInitData, i2, str);
                    }
                } else {
                    if (com.facebook.ads.redexgen.core.AbstractC0748Hx.A0B(strA04)) {
                        i3 = 2;
                        if (this.A0H == 0) {
                            if (this.A0I == -1) {
                                i4 = this.A0R;
                            } else {
                                i4 = this.A0I;
                            }
                            this.A0I = i4;
                            if (this.A0G == -1) {
                                i5 = this.A0J;
                            } else {
                                i5 = this.A0G;
                            }
                            this.A0G = i5;
                        }
                        f = -1.0f;
                        if (this.A0I != -1) {
                            f = (this.A0J * this.A0I) / (this.A0R * this.A0G);
                        }
                        colorInfo = null;
                        if (this.A0b) {
                            colorInfo = new com.facebook.ads.internal.exoplayer2.thirdparty.video.ColorInfo(this.A0D, this.A0C, this.A0E, A06());
                        }
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A04(java.lang.Integer.toString(i), strA04, null, -1, i8, this.A0R, this.A0J, -1.0f, listSingletonList, -1, f, this.A0e, this.A0P, colorInfo, this.A0U);
                    } else if (A01(693, 20, 122).equals(strA04)) {
                        i3 = 3;
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A01(java.lang.Integer.toString(i), strA04, i2, this.A0g, this.A0U);
                    } else if (A01(871, 10, 58).equals(strA04)) {
                        i3 = 3;
                        java.util.ArrayList arrayList117 = new java.util.ArrayList(2);
                        arrayList117.add(com.facebook.ads.redexgen.core.C1157Yc.A0t);
                        arrayList117.add(this.A0d);
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A09(java.lang.Integer.toString(i), strA04, null, -1, i2, this.A0g, -1, this.A0U, Long.MAX_VALUE, arrayList117);
                    } else {
                        if (!A01(675, 18, 76).equals(strA04)) {
                        }
                        i3 = 3;
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A0A(java.lang.Integer.toString(i), strA04, null, -1, i2, listSingletonList, this.A0g, this.A0U);
                    }
                    break;
                }
                this.A0W = interfaceC0611Bz.AHA(this.A0N, i3);
                this.A0W.A69(formatA0A);
                return;
            case 1950789798:
                if (str2.equals(A01(70, 6, 115))) {
                    b = 21;
                } else {
                    b = -1;
                }
                strA01 = A01(0, 22, 11);
                strA02 = A01(500, 27, 65);
                strA03 = A01(283, 17, 42);
                switch (b) {
                    case 0:
                        strA04 = A01(959, 19, 57);
                        break;
                    case 1:
                        strA04 = A01(978, 19, 62);
                        break;
                    case 2:
                        strA04 = A01(923, 11, 95);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        strA04 = A01(910, 13, 82);
                        if (this.A0d == null) {
                            listSingletonList = java.util.Collections.singletonList(this.A0d);
                        } else {
                            listSingletonList = null;
                        }
                        break;
                    case 6:
                        strA04 = A01(891, 9, 111);
                        com.facebook.ads.redexgen.core.IM imA0117 = com.facebook.ads.redexgen.core.IM.A00(new com.facebook.ads.redexgen.core.I4(this.A0d));
                        listSingletonList = imA0117.A04;
                        this.A0M = imA0117.A02;
                        break;
                    case 7:
                        strA04 = A01(900, 10, 63);
                        com.facebook.ads.redexgen.core.IS isA0117 = com.facebook.ads.redexgen.core.IS.A00(new com.facebook.ads.redexgen.core.I4(this.A0d));
                        listSingletonList = isA0117.A01;
                        this.A0M = isA0117.A00;
                        break;
                    case 8:
                        android.util.Pair<java.lang.String, java.util.List<byte[]>> pairA0117 = A00(new com.facebook.ads.redexgen.core.I4(this.A0d));
                        strA04 = (java.lang.String) pairA0117.first;
                        listSingletonList = (java.util.List) pairA0117.second;
                        break;
                    case 9:
                        strA04 = A01(944, 15, 65);
                        break;
                    case 10:
                        strA04 = A01(841, 12, 73);
                        i8 = 8192;
                        listSingletonList = A03(this.A0d);
                        break;
                    case 11:
                        strA04 = A01(780, 10, 12);
                        i8 = 5760;
                        listSingletonList = new java.util.ArrayList(3);
                        listSingletonList.add(this.A0d);
                        listSingletonList.add(java.nio.ByteBuffer.allocate(8).order(java.nio.ByteOrder.nativeOrder()).putLong(this.A0S).array());
                        listSingletonList.add(java.nio.ByteBuffer.allocate(8).order(java.nio.ByteOrder.nativeOrder()).putLong(this.A0T).array());
                        break;
                    case 12:
                        strA04 = A01(742, 15, 82);
                        listSingletonList = java.util.Collections.singletonList(this.A0d);
                        break;
                    case 13:
                        strA04 = A01(767, 13, 7);
                        i8 = 4096;
                        break;
                    case 14:
                        strA04 = A01(757, 10, 14);
                        i8 = 4096;
                        break;
                    case 15:
                        strA04 = A01(713, 9, 14);
                        break;
                    case 16:
                        strA04 = A01(722, 10, 6);
                        break;
                    case 17:
                        strA04 = A01(799, 13, 106);
                        this.A0X = new com.facebook.ads.redexgen.core.CK();
                        break;
                    case 18:
                    case 19:
                        strA04 = A01(812, 13, 34);
                        break;
                    case 20:
                        strA04 = A01(825, 16, 26);
                        break;
                    case 21:
                        strA04 = A01(732, 10, 43);
                        listSingletonList = java.util.Collections.singletonList(this.A0d);
                        break;
                    case 22:
                        strA04 = A01(790, 9, 116);
                        if (A05(new com.facebook.ads.redexgen.core.I4(this.A0d))) {
                            iA02 = com.facebook.ads.redexgen.core.IK.A02(this.A0A);
                            strArr = A0i;
                            if (strArr[1].charAt(16) != strArr[3].charAt(16)) {
                                if (iA02 == 0) {
                                    iA02 = -1;
                                    strA04 = A01(853, 15, 46);
                                    android.util.Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                                }
                            } else {
                                java.lang.String[] strArr1112 = A0i;
                                strArr1112[1] = "UnFAd4XuJDxSuzaFoeREgVc6Qs0OmmYm";
                                strArr1112[3] = "dBM5Episk82aAApxomIpqdyXT7zAdwmF";
                                if (iA02 == 0) {
                                    iA02 = -1;
                                    strA04 = A01(853, 15, 46);
                                    android.util.Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                                }
                            }
                        } else {
                            strA04 = A01(853, 15, 46);
                            android.util.Log.w(strA03, A01(com.google.android.gms.nearby.messages.Strategy.TTL_SECONDS_DEFAULT, 51, 25) + strA04);
                        }
                        break;
                    case 23:
                        strA04 = A01(790, 9, 116);
                        iA02 = com.facebook.ads.redexgen.core.IK.A02(this.A0A);
                        if (iA02 == 0) {
                            iA02 = -1;
                            strA04 = A01(853, 15, 46);
                            android.util.Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                        }
                        break;
                    case 24:
                        strA04 = A01(693, 20, 122);
                        break;
                    case 25:
                        strA04 = A01(871, 10, 58);
                        break;
                    case 26:
                        strA04 = A01(675, 18, 76);
                        listSingletonList = java.util.Collections.singletonList(this.A0d);
                        break;
                    case 27:
                        strA04 = A01(660, 15, 82);
                        break;
                    case 28:
                        strA04 = A01(641, 19, 91);
                        listSingletonList = java.util.Collections.singletonList(new byte[]{this.A0d[0], this.A0d[1], this.A0d[2], this.A0d[3]});
                        break;
                    default:
                        throw new com.facebook.ads.redexgen.core.A0(A01(470, 30, 89));
                }
                i2 = 0 | (this.A0Z ? 1 : 0) | (this.A0a ? 2 : 0);
                if (com.facebook.ads.redexgen.core.AbstractC0748Hx.A09(strA04)) {
                    i3 = 1;
                    string = java.lang.Integer.toString(i);
                    i6 = this.A0B;
                    i7 = this.A0O;
                    drmInitData = this.A0U;
                    str = this.A0g;
                    strArr2 = A0i;
                    if (strArr2[0].charAt(30) != strArr2[5].charAt(30)) {
                        A0i[2] = "ixQpJ1YMOGXZaJaexLrRt7cPJpDFAOI0";
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A06(string, strA04, null, -1, i8, i6, i7, iA02, listSingletonList, drmInitData, i2, str);
                    } else {
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A06(string, strA04, null, -1, i8, i6, i7, iA02, listSingletonList, drmInitData, i2, str);
                    }
                } else {
                    if (com.facebook.ads.redexgen.core.AbstractC0748Hx.A0B(strA04)) {
                        i3 = 2;
                        if (this.A0H == 0) {
                            if (this.A0I == -1) {
                                i4 = this.A0R;
                            } else {
                                i4 = this.A0I;
                            }
                            this.A0I = i4;
                            if (this.A0G == -1) {
                                i5 = this.A0J;
                            } else {
                                i5 = this.A0G;
                            }
                            this.A0G = i5;
                        }
                        f = -1.0f;
                        if (this.A0I != -1) {
                            f = (this.A0J * this.A0I) / (this.A0R * this.A0G);
                        }
                        colorInfo = null;
                        if (this.A0b) {
                            colorInfo = new com.facebook.ads.internal.exoplayer2.thirdparty.video.ColorInfo(this.A0D, this.A0C, this.A0E, A06());
                        }
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A04(java.lang.Integer.toString(i), strA04, null, -1, i8, this.A0R, this.A0J, -1.0f, listSingletonList, -1, f, this.A0e, this.A0P, colorInfo, this.A0U);
                    } else if (A01(693, 20, 122).equals(strA04)) {
                        i3 = 3;
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A01(java.lang.Integer.toString(i), strA04, i2, this.A0g, this.A0U);
                    } else if (A01(871, 10, 58).equals(strA04)) {
                        i3 = 3;
                        java.util.ArrayList arrayList118 = new java.util.ArrayList(2);
                        arrayList118.add(com.facebook.ads.redexgen.core.C1157Yc.A0t);
                        arrayList118.add(this.A0d);
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A09(java.lang.Integer.toString(i), strA04, null, -1, i2, this.A0g, -1, this.A0U, Long.MAX_VALUE, arrayList118);
                    } else {
                        if (!A01(675, 18, 76).equals(strA04)) {
                        }
                        i3 = 3;
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A0A(java.lang.Integer.toString(i), strA04, null, -1, i2, listSingletonList, this.A0g, this.A0U);
                    }
                    break;
                }
                this.A0W = interfaceC0611Bz.AHA(this.A0N, i3);
                this.A0W.A69(formatA0A);
                return;
            case 1951062397:
                if (str2.equals(A01(102, 6, 104))) {
                    b = 11;
                } else {
                    b = -1;
                }
                strA01 = A01(0, 22, 11);
                strA02 = A01(500, 27, 65);
                strA03 = A01(283, 17, 42);
                switch (b) {
                    case 0:
                        strA04 = A01(959, 19, 57);
                        break;
                    case 1:
                        strA04 = A01(978, 19, 62);
                        break;
                    case 2:
                        strA04 = A01(923, 11, 95);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        strA04 = A01(910, 13, 82);
                        if (this.A0d == null) {
                            listSingletonList = java.util.Collections.singletonList(this.A0d);
                        } else {
                            listSingletonList = null;
                        }
                        break;
                    case 6:
                        strA04 = A01(891, 9, 111);
                        com.facebook.ads.redexgen.core.IM imA0118 = com.facebook.ads.redexgen.core.IM.A00(new com.facebook.ads.redexgen.core.I4(this.A0d));
                        listSingletonList = imA0118.A04;
                        this.A0M = imA0118.A02;
                        break;
                    case 7:
                        strA04 = A01(900, 10, 63);
                        com.facebook.ads.redexgen.core.IS isA0118 = com.facebook.ads.redexgen.core.IS.A00(new com.facebook.ads.redexgen.core.I4(this.A0d));
                        listSingletonList = isA0118.A01;
                        this.A0M = isA0118.A00;
                        break;
                    case 8:
                        android.util.Pair<java.lang.String, java.util.List<byte[]>> pairA0118 = A00(new com.facebook.ads.redexgen.core.I4(this.A0d));
                        strA04 = (java.lang.String) pairA0118.first;
                        listSingletonList = (java.util.List) pairA0118.second;
                        break;
                    case 9:
                        strA04 = A01(944, 15, 65);
                        break;
                    case 10:
                        strA04 = A01(841, 12, 73);
                        i8 = 8192;
                        listSingletonList = A03(this.A0d);
                        break;
                    case 11:
                        strA04 = A01(780, 10, 12);
                        i8 = 5760;
                        listSingletonList = new java.util.ArrayList(3);
                        listSingletonList.add(this.A0d);
                        listSingletonList.add(java.nio.ByteBuffer.allocate(8).order(java.nio.ByteOrder.nativeOrder()).putLong(this.A0S).array());
                        listSingletonList.add(java.nio.ByteBuffer.allocate(8).order(java.nio.ByteOrder.nativeOrder()).putLong(this.A0T).array());
                        break;
                    case 12:
                        strA04 = A01(742, 15, 82);
                        listSingletonList = java.util.Collections.singletonList(this.A0d);
                        break;
                    case 13:
                        strA04 = A01(767, 13, 7);
                        i8 = 4096;
                        break;
                    case 14:
                        strA04 = A01(757, 10, 14);
                        i8 = 4096;
                        break;
                    case 15:
                        strA04 = A01(713, 9, 14);
                        break;
                    case 16:
                        strA04 = A01(722, 10, 6);
                        break;
                    case 17:
                        strA04 = A01(799, 13, 106);
                        this.A0X = new com.facebook.ads.redexgen.core.CK();
                        break;
                    case 18:
                    case 19:
                        strA04 = A01(812, 13, 34);
                        break;
                    case 20:
                        strA04 = A01(825, 16, 26);
                        break;
                    case 21:
                        strA04 = A01(732, 10, 43);
                        listSingletonList = java.util.Collections.singletonList(this.A0d);
                        break;
                    case 22:
                        strA04 = A01(790, 9, 116);
                        if (A05(new com.facebook.ads.redexgen.core.I4(this.A0d))) {
                            iA02 = com.facebook.ads.redexgen.core.IK.A02(this.A0A);
                            strArr = A0i;
                            if (strArr[1].charAt(16) != strArr[3].charAt(16)) {
                                if (iA02 == 0) {
                                    iA02 = -1;
                                    strA04 = A01(853, 15, 46);
                                    android.util.Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                                }
                            } else {
                                java.lang.String[] strArr1113 = A0i;
                                strArr1113[1] = "UnFAd4XuJDxSuzaFoeREgVc6Qs0OmmYm";
                                strArr1113[3] = "dBM5Episk82aAApxomIpqdyXT7zAdwmF";
                                if (iA02 == 0) {
                                    iA02 = -1;
                                    strA04 = A01(853, 15, 46);
                                    android.util.Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                                }
                            }
                        } else {
                            strA04 = A01(853, 15, 46);
                            android.util.Log.w(strA03, A01(com.google.android.gms.nearby.messages.Strategy.TTL_SECONDS_DEFAULT, 51, 25) + strA04);
                        }
                        break;
                    case 23:
                        strA04 = A01(790, 9, 116);
                        iA02 = com.facebook.ads.redexgen.core.IK.A02(this.A0A);
                        if (iA02 == 0) {
                            iA02 = -1;
                            strA04 = A01(853, 15, 46);
                            android.util.Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                        }
                        break;
                    case 24:
                        strA04 = A01(693, 20, 122);
                        break;
                    case 25:
                        strA04 = A01(871, 10, 58);
                        break;
                    case 26:
                        strA04 = A01(675, 18, 76);
                        listSingletonList = java.util.Collections.singletonList(this.A0d);
                        break;
                    case 27:
                        strA04 = A01(660, 15, 82);
                        break;
                    case 28:
                        strA04 = A01(641, 19, 91);
                        listSingletonList = java.util.Collections.singletonList(new byte[]{this.A0d[0], this.A0d[1], this.A0d[2], this.A0d[3]});
                        break;
                    default:
                        throw new com.facebook.ads.redexgen.core.A0(A01(470, 30, 89));
                }
                i2 = 0 | (this.A0Z ? 1 : 0) | (this.A0a ? 2 : 0);
                if (com.facebook.ads.redexgen.core.AbstractC0748Hx.A09(strA04)) {
                    i3 = 1;
                    string = java.lang.Integer.toString(i);
                    i6 = this.A0B;
                    i7 = this.A0O;
                    drmInitData = this.A0U;
                    str = this.A0g;
                    strArr2 = A0i;
                    if (strArr2[0].charAt(30) != strArr2[5].charAt(30)) {
                        A0i[2] = "ixQpJ1YMOGXZaJaexLrRt7cPJpDFAOI0";
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A06(string, strA04, null, -1, i8, i6, i7, iA02, listSingletonList, drmInitData, i2, str);
                    } else {
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A06(string, strA04, null, -1, i8, i6, i7, iA02, listSingletonList, drmInitData, i2, str);
                    }
                } else {
                    if (com.facebook.ads.redexgen.core.AbstractC0748Hx.A0B(strA04)) {
                        i3 = 2;
                        if (this.A0H == 0) {
                            if (this.A0I == -1) {
                                i4 = this.A0R;
                            } else {
                                i4 = this.A0I;
                            }
                            this.A0I = i4;
                            if (this.A0G == -1) {
                                i5 = this.A0J;
                            } else {
                                i5 = this.A0G;
                            }
                            this.A0G = i5;
                        }
                        f = -1.0f;
                        if (this.A0I != -1) {
                            f = (this.A0J * this.A0I) / (this.A0R * this.A0G);
                        }
                        colorInfo = null;
                        if (this.A0b) {
                            colorInfo = new com.facebook.ads.internal.exoplayer2.thirdparty.video.ColorInfo(this.A0D, this.A0C, this.A0E, A06());
                        }
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A04(java.lang.Integer.toString(i), strA04, null, -1, i8, this.A0R, this.A0J, -1.0f, listSingletonList, -1, f, this.A0e, this.A0P, colorInfo, this.A0U);
                    } else if (A01(693, 20, 122).equals(strA04)) {
                        i3 = 3;
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A01(java.lang.Integer.toString(i), strA04, i2, this.A0g, this.A0U);
                    } else if (A01(871, 10, 58).equals(strA04)) {
                        i3 = 3;
                        java.util.ArrayList arrayList119 = new java.util.ArrayList(2);
                        arrayList119.add(com.facebook.ads.redexgen.core.C1157Yc.A0t);
                        arrayList119.add(this.A0d);
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A09(java.lang.Integer.toString(i), strA04, null, -1, i2, this.A0g, -1, this.A0U, Long.MAX_VALUE, arrayList119);
                    } else {
                        if (!A01(675, 18, 76).equals(strA04)) {
                        }
                        i3 = 3;
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A0A(java.lang.Integer.toString(i), strA04, null, -1, i2, listSingletonList, this.A0g, this.A0U);
                    }
                    break;
                }
                this.A0W = interfaceC0611Bz.AHA(this.A0N, i3);
                this.A0W.A69(formatA0A);
                return;
            default:
                b = -1;
                strA01 = A01(0, 22, 11);
                strA02 = A01(500, 27, 65);
                strA03 = A01(283, 17, 42);
                switch (b) {
                    case 0:
                        strA04 = A01(959, 19, 57);
                        break;
                    case 1:
                        strA04 = A01(978, 19, 62);
                        break;
                    case 2:
                        strA04 = A01(923, 11, 95);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        strA04 = A01(910, 13, 82);
                        if (this.A0d == null) {
                            listSingletonList = java.util.Collections.singletonList(this.A0d);
                        } else {
                            listSingletonList = null;
                        }
                        break;
                    case 6:
                        strA04 = A01(891, 9, 111);
                        com.facebook.ads.redexgen.core.IM imA0119 = com.facebook.ads.redexgen.core.IM.A00(new com.facebook.ads.redexgen.core.I4(this.A0d));
                        listSingletonList = imA0119.A04;
                        this.A0M = imA0119.A02;
                        break;
                    case 7:
                        strA04 = A01(900, 10, 63);
                        com.facebook.ads.redexgen.core.IS isA0119 = com.facebook.ads.redexgen.core.IS.A00(new com.facebook.ads.redexgen.core.I4(this.A0d));
                        listSingletonList = isA0119.A01;
                        this.A0M = isA0119.A00;
                        break;
                    case 8:
                        android.util.Pair<java.lang.String, java.util.List<byte[]>> pairA0119 = A00(new com.facebook.ads.redexgen.core.I4(this.A0d));
                        strA04 = (java.lang.String) pairA0119.first;
                        listSingletonList = (java.util.List) pairA0119.second;
                        break;
                    case 9:
                        strA04 = A01(944, 15, 65);
                        break;
                    case 10:
                        strA04 = A01(841, 12, 73);
                        i8 = 8192;
                        listSingletonList = A03(this.A0d);
                        break;
                    case 11:
                        strA04 = A01(780, 10, 12);
                        i8 = 5760;
                        listSingletonList = new java.util.ArrayList(3);
                        listSingletonList.add(this.A0d);
                        listSingletonList.add(java.nio.ByteBuffer.allocate(8).order(java.nio.ByteOrder.nativeOrder()).putLong(this.A0S).array());
                        listSingletonList.add(java.nio.ByteBuffer.allocate(8).order(java.nio.ByteOrder.nativeOrder()).putLong(this.A0T).array());
                        break;
                    case 12:
                        strA04 = A01(742, 15, 82);
                        listSingletonList = java.util.Collections.singletonList(this.A0d);
                        break;
                    case 13:
                        strA04 = A01(767, 13, 7);
                        i8 = 4096;
                        break;
                    case 14:
                        strA04 = A01(757, 10, 14);
                        i8 = 4096;
                        break;
                    case 15:
                        strA04 = A01(713, 9, 14);
                        break;
                    case 16:
                        strA04 = A01(722, 10, 6);
                        break;
                    case 17:
                        strA04 = A01(799, 13, 106);
                        this.A0X = new com.facebook.ads.redexgen.core.CK();
                        break;
                    case 18:
                    case 19:
                        strA04 = A01(812, 13, 34);
                        break;
                    case 20:
                        strA04 = A01(825, 16, 26);
                        break;
                    case 21:
                        strA04 = A01(732, 10, 43);
                        listSingletonList = java.util.Collections.singletonList(this.A0d);
                        break;
                    case 22:
                        strA04 = A01(790, 9, 116);
                        if (A05(new com.facebook.ads.redexgen.core.I4(this.A0d))) {
                            iA02 = com.facebook.ads.redexgen.core.IK.A02(this.A0A);
                            strArr = A0i;
                            if (strArr[1].charAt(16) != strArr[3].charAt(16)) {
                                if (iA02 == 0) {
                                    iA02 = -1;
                                    strA04 = A01(853, 15, 46);
                                    android.util.Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                                }
                            } else {
                                java.lang.String[] strArr1114 = A0i;
                                strArr1114[1] = "UnFAd4XuJDxSuzaFoeREgVc6Qs0OmmYm";
                                strArr1114[3] = "dBM5Episk82aAApxomIpqdyXT7zAdwmF";
                                if (iA02 == 0) {
                                    iA02 = -1;
                                    strA04 = A01(853, 15, 46);
                                    android.util.Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                                }
                            }
                        } else {
                            strA04 = A01(853, 15, 46);
                            android.util.Log.w(strA03, A01(com.google.android.gms.nearby.messages.Strategy.TTL_SECONDS_DEFAULT, 51, 25) + strA04);
                        }
                        break;
                    case 23:
                        strA04 = A01(790, 9, 116);
                        iA02 = com.facebook.ads.redexgen.core.IK.A02(this.A0A);
                        if (iA02 == 0) {
                            iA02 = -1;
                            strA04 = A01(853, 15, 46);
                            android.util.Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                        }
                        break;
                    case 24:
                        strA04 = A01(693, 20, 122);
                        break;
                    case 25:
                        strA04 = A01(871, 10, 58);
                        break;
                    case 26:
                        strA04 = A01(675, 18, 76);
                        listSingletonList = java.util.Collections.singletonList(this.A0d);
                        break;
                    case 27:
                        strA04 = A01(660, 15, 82);
                        break;
                    case 28:
                        strA04 = A01(641, 19, 91);
                        listSingletonList = java.util.Collections.singletonList(new byte[]{this.A0d[0], this.A0d[1], this.A0d[2], this.A0d[3]});
                        break;
                    default:
                        throw new com.facebook.ads.redexgen.core.A0(A01(470, 30, 89));
                }
                i2 = 0 | (this.A0Z ? 1 : 0) | (this.A0a ? 2 : 0);
                if (com.facebook.ads.redexgen.core.AbstractC0748Hx.A09(strA04)) {
                    i3 = 1;
                    string = java.lang.Integer.toString(i);
                    i6 = this.A0B;
                    i7 = this.A0O;
                    drmInitData = this.A0U;
                    str = this.A0g;
                    strArr2 = A0i;
                    if (strArr2[0].charAt(30) != strArr2[5].charAt(30)) {
                        A0i[2] = "ixQpJ1YMOGXZaJaexLrRt7cPJpDFAOI0";
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A06(string, strA04, null, -1, i8, i6, i7, iA02, listSingletonList, drmInitData, i2, str);
                    } else {
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A06(string, strA04, null, -1, i8, i6, i7, iA02, listSingletonList, drmInitData, i2, str);
                    }
                } else {
                    if (com.facebook.ads.redexgen.core.AbstractC0748Hx.A0B(strA04)) {
                        i3 = 2;
                        if (this.A0H == 0) {
                            if (this.A0I == -1) {
                                i4 = this.A0R;
                            } else {
                                i4 = this.A0I;
                            }
                            this.A0I = i4;
                            if (this.A0G == -1) {
                                i5 = this.A0J;
                            } else {
                                i5 = this.A0G;
                            }
                            this.A0G = i5;
                        }
                        f = -1.0f;
                        if (this.A0I != -1) {
                            f = (this.A0J * this.A0I) / (this.A0R * this.A0G);
                        }
                        colorInfo = null;
                        if (this.A0b) {
                            colorInfo = new com.facebook.ads.internal.exoplayer2.thirdparty.video.ColorInfo(this.A0D, this.A0C, this.A0E, A06());
                        }
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A04(java.lang.Integer.toString(i), strA04, null, -1, i8, this.A0R, this.A0J, -1.0f, listSingletonList, -1, f, this.A0e, this.A0P, colorInfo, this.A0U);
                    } else if (A01(693, 20, 122).equals(strA04)) {
                        i3 = 3;
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A01(java.lang.Integer.toString(i), strA04, i2, this.A0g, this.A0U);
                    } else if (A01(871, 10, 58).equals(strA04)) {
                        i3 = 3;
                        java.util.ArrayList arrayList1110 = new java.util.ArrayList(2);
                        arrayList1110.add(com.facebook.ads.redexgen.core.C1157Yc.A0t);
                        arrayList1110.add(this.A0d);
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A09(java.lang.Integer.toString(i), strA04, null, -1, i2, this.A0g, -1, this.A0U, Long.MAX_VALUE, arrayList1110);
                    } else {
                        if (!A01(675, 18, 76).equals(strA04)) {
                        }
                        i3 = 3;
                        formatA0A = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A0A(java.lang.Integer.toString(i), strA04, null, -1, i2, listSingletonList, this.A0g, this.A0U);
                    }
                    break;
                }
                this.A0W = interfaceC0611Bz.AHA(this.A0N, i3);
                this.A0W.A69(formatA0A);
                return;
        }
    }
}
