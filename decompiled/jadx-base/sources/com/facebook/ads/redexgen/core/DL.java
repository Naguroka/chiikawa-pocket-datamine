package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class DL {
    public static byte[] A07;
    public static java.lang.String[] A08 = {"cBoSy73h12Z", "FF287", "yiDcTrO5oiy9L", "PgfMdTSRvPG0atUIS8Pzxn3kWS0m", "yL", "cWIqYPJMJGop9q0QypPHGYzgP2IwtBiA", "5kOvwODC6jChrN9uRRfJcb98RTG4", "RfkEvBXgrQdDRXJFP9mAr4EwuLKmJYFp"};
    public final android.media.MediaCodecInfo.CodecCapabilities A00;
    public final java.lang.String A01;
    public final java.lang.String A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    public static java.lang.String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 97);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A04() {
        A07 = new byte[]{-52, 32, 27, -52, -89, -101, -95, -107, -48, -47, 3, 3, 5, -3, -11, -12, -35, -15, 8, -45, -8, -15, -2, -2, -11, -4, -47, -12, -6, 5, 3, 4, -3, -11, -2, 4, -54, -80, -65, -15, -15, -13, -21, -29, -30, -47, -13, -18, -18, -19, -16, -14, -98, -39, 38, 62, kotlin.io.encoding.Base64.padSymbol, 66, 58, 28, 72, kotlin.io.encoding.Base64.padSymbol, 62, 60, 34, 71, okio.Utf8.REPLACEMENT_BYTE, 72, -65, -32, -60, -26, -31, -31, -32, -29, -27, -111, -52, 59, -9, -70, -11, 48, 51, 48, okio.Utf8.REPLACEMENT_BYTE, 67, 56, 69, 52, -4, okio.Utf8.REPLACEMENT_BYTE, 59, 48, 72, 49, 48, 50, 58, okio.Utf8.REPLACEMENT_BYTE, 74, 71, 69, 76, 12, 65, okio.Utf8.REPLACEMENT_BYTE, 78, 81, -5, 6, 3, 1, 8, -56, 16, -35, -5, 10, 13, -56, -36, -53, -48, -42, -106, -102, -50, -41, -41, -12, 8, -9, -4, 2, -62, -12, -10, -58, 60, 80, okio.Utf8.REPLACEMENT_BYTE, 68, 74, 10, 60, 72, 77, 8, 82, kotlin.io.encoding.Base64.padSymbol, -40, -20, -37, -32, -26, -90, -36, -40, -38, -86, -1, 19, 2, 7, 13, -51, 4, 10, -1, 1, 33, 53, 36, 41, 47, -17, 39, -9, -15, -15, -19, 33, 44, 33, 55, 2, 22, 5, 10, 16, -48, 8, -40, -46, -46, -50, 14, 13, 2, 24, 30, 50, 33, 38, 44, -20, 36, 48, 42, -26, -6, -23, -18, -12, -76, -14, -11, -71, -26, -78, -15, -26, -7, -14, 32, 52, 35, 40, 46, -18, 44, 47, 36, 38, 46, 66, 49, 54, 60, -4, 60, kotlin.io.encoding.Base64.padSymbol, 66, 64, -35, -15, -32, -27, -21, -85, -18, -35, -13, 64, 84, 67, 72, 78, 14, 85, 78, 81, 65, 72, 82, 1, 6, -1, 12, 12, 3, 10, -31, 13, 19, 12, 18, -52, -1, -31, -1, 14, 17, 38, 43, 36, 49, 49, 40, 47, 6, 50, 56, 49, 55, -15, 38, 36, 51, 54, -44, -39, -46, -33, -33, -42, -35, -76, -32, -26, -33, -27, -97, -28, -26, -31, -31, -32, -29, -27, -99, -111, 42, 54, 43, 44, 42, -11, 52, 48, 52, 44, -25, 48, 60, 49, 50, 48, -5, kotlin.io.encoding.Base64.padSymbol, okio.Utf8.REPLACEMENT_BYTE, 60, 51, 54, 57, 50, 25, 50, 67, 50, 57, -7, -19, 22, 4, 16, 19, 15, 8, -11, 4, 23, 8, -47, 4, -26, 4, 19, 22, -16, -34, -22, -19, -23, -30, -49, -34, -15, -30, -85, -32, -34, -19, -16, 31, 13, 25, 28, 24, 17, -2, 13, 32, 17, -38, 31, 33, 28, 28, 27, 30, 32, -40, -52, 33, 19, 17, 35, 32, 19, -37, 30, 26, 15, 39, 16, 15, 17, 25, 16, 6, 23, 2, -34, 11, 1, -17, -2, 17, 2, -53, 0, -2, 13, 16, 0, -10, 7, -14, -50, -5, -15, -33, -18, 1, -14, -69, -1, -4, 1, -18, 1, -14, -15, -71, -83, -31, -41, -24, -45, -81, -36, -46, -64, -49, -30, -45, -100, -31, -29, -34, -34, -35, -32, -30, -102, -114, 58, 48, 65, 44, 8, 53, 43, 25, 40, 59, 44, -11, kotlin.io.encoding.Base64.padSymbol, 10, 40, 55, 58, 50, 51, 44, 44, 35, 42, 35, 34, -21, 46, 42, 31, 55, 32, 31, 33, 41, 14};
    }

    static {
        A04();
    }

    public DL(java.lang.String str, java.lang.String str2, android.media.MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3) {
        this.A02 = (java.lang.String) com.facebook.ads.redexgen.core.AbstractC0730Hf.A01(str);
        this.A01 = str2;
        this.A00 = codecCapabilities;
        this.A04 = z;
        boolean z4 = true;
        this.A03 = (z2 || codecCapabilities == null || !A07(codecCapabilities)) ? false : true;
        this.A06 = codecCapabilities != null && A0B(codecCapabilities);
        if (!z3 && (codecCapabilities == null || !A09(codecCapabilities))) {
            z4 = false;
        }
        this.A05 = z4;
    }

    public static int A00(java.lang.String str, java.lang.String str2, int i) {
        int i2;
        if (i > 1 || ((com.facebook.ads.redexgen.core.IK.A02 >= 26 && i > 0) || A03(226, 10, 94).equals(str2) || A03(121, 10, 6).equals(str2) || A03(140, 12, 122).equals(str2) || A03(211, 15, 36).equals(str2) || A03(255, 12, 126).equals(str2) || A03(236, 10, 108).equals(str2) || A03(246, 9, 27).equals(str2) || A03(org.objectweb.asm.Opcodes.IF_ICMPGE, 10, 61).equals(str2) || A03(172, 15, 95).equals(str2) || A03(org.objectweb.asm.Opcodes.NEW, 15, 64).equals(str2) || A03(com.ironsource.g3.c.b.c, 9, 92).equals(str2))) {
            return i;
        }
        if (A03(org.objectweb.asm.Opcodes.LXOR, 9, 50).equals(str2)) {
            i2 = 6;
        } else if (A03(org.objectweb.asm.Opcodes.DCMPG, 10, 22).equals(str2)) {
            i2 = 16;
        } else {
            i2 = 30;
        }
        android.util.Log.w(A03(54, 14, 120), A03(9, 29, 47) + str + A03(6, 3, 20) + i + A03(0, 4, 75) + i2 + A03(79, 1, 125));
        return i2;
    }

    public static com.facebook.ads.redexgen.core.DL A01(java.lang.String str) {
        return new com.facebook.ads.redexgen.core.DL(str, null, null, true, false, false);
    }

    public static com.facebook.ads.redexgen.core.DL A02(java.lang.String str, java.lang.String str2, android.media.MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2) {
        return new com.facebook.ads.redexgen.core.DL(str, str2, codecCapabilities, false, z, z2);
    }

    private void A05(java.lang.String str) {
        java.lang.StringBuilder sbAppend = new java.lang.StringBuilder().append(A03(38, 16, 29)).append(str);
        java.lang.String strA03 = A03(80, 3, 57);
        sbAppend.append(strA03).append(this.A02).append(A03(4, 2, 26)).append(this.A01).append(strA03).append(com.facebook.ads.redexgen.core.IK.A04).append(A03(79, 1, 125)).toString();
    }

    private void A06(java.lang.String str) {
        java.lang.StringBuilder sbAppend = new java.lang.StringBuilder().append(A03(68, 11, 16)).append(str);
        java.lang.String strA03 = A03(80, 3, 57);
        sbAppend.append(strA03).append(this.A02).append(A03(4, 2, 26)).append(this.A01).append(strA03).append(com.facebook.ads.redexgen.core.IK.A04).append(A03(79, 1, 125)).toString();
    }

    public static boolean A07(android.media.MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return com.facebook.ads.redexgen.core.IK.A02 >= 19 && A08(codecCapabilities);
    }

    public static boolean A08(android.media.MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(A03(83, 17, 110));
    }

    public static boolean A09(android.media.MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return com.facebook.ads.redexgen.core.IK.A02 >= 21 && A0A(codecCapabilities);
    }

    public static boolean A0A(android.media.MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(A03(406, 15, 77));
    }

    public static boolean A0B(android.media.MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return com.facebook.ads.redexgen.core.IK.A02 >= 21 && A0C(codecCapabilities);
    }

    public static boolean A0C(android.media.MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(A03(496, 17, 93));
    }

    public static boolean A0D(android.media.MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        if (d == -1.0d || d <= 0.0d) {
            return videoCapabilities.isSizeSupported(i, i2);
        }
        return videoCapabilities.areSizeAndRateSupported(i, i2, d);
    }

    public final android.graphics.Point A0E(int i, int i2) {
        if (this.A00 == null) {
            A06(A03(100, 10, 125));
            return null;
        }
        android.media.MediaCodecInfo.VideoCapabilities videoCapabilities = this.A00.getVideoCapabilities();
        if (videoCapabilities == null) {
            A06(A03(110, 11, 57));
            return null;
        }
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        int heightAlignment2 = com.facebook.ads.redexgen.core.IK.A04(i, widthAlignment);
        return new android.graphics.Point(heightAlignment2 * widthAlignment, com.facebook.ads.redexgen.core.IK.A04(i2, heightAlignment) * heightAlignment);
    }

    public final boolean A0F(int i) {
        if (this.A00 == null) {
            A06(A03(285, 17, 98));
            return false;
        }
        android.media.MediaCodecInfo.AudioCapabilities audioCapabilities = this.A00.getAudioCapabilities();
        if (audioCapabilities == null) {
            A06(A03(267, 18, 61));
            return false;
        }
        if (A00(this.A02, this.A01, audioCapabilities.getMaxInputChannelCount()) < i) {
            A06(A03(302, 22, 16) + i);
            return false;
        }
        return true;
    }

    public final boolean A0G(int i) {
        if (this.A00 == null) {
            A06(A03(371, 15, 28));
            return false;
        }
        android.media.MediaCodecInfo.AudioCapabilities audioCapabilities = this.A00.getAudioCapabilities();
        if (audioCapabilities == null) {
            A06(A03(355, 16, 66));
            return false;
        }
        if (!audioCapabilities.isSampleRateSupported(i)) {
            A06(A03(386, 20, 75) + i);
            return false;
        }
        return true;
    }

    public final boolean A0H(int i, int i2, double d) {
        if (this.A00 == null) {
            java.lang.String[] strArr = A08;
            if (strArr[6].length() != strArr[3].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A08;
            strArr2[6] = "R4Mp3flu57xV641JioQUQmYkQ8CC";
            strArr2[3] = "NlGlgawGhreLfBWzu4zzKU5x2rIR";
            A06(A03(421, 16, 60));
            return false;
        }
        android.media.MediaCodecInfo.VideoCapabilities videoCapabilities = this.A00.getVideoCapabilities();
        if (videoCapabilities == null) {
            A06(A03(479, 17, 102));
            return false;
        }
        if (!A0D(videoCapabilities, i, i2, d)) {
            java.lang.String strA03 = A03(androidx.core.view.InputDeviceCompat.SOURCE_DPAD, 1, 53);
            if (i >= i2 || !A0D(videoCapabilities, i2, i, d)) {
                A06(A03(458, 21, 13) + i + strA03 + i2 + strA03 + d);
                return false;
            }
            A05(A03(437, 21, 44) + i + strA03 + i2 + strA03 + d);
            return true;
        }
        return true;
    }

    public final boolean A0I(java.lang.String str) {
        if (str == null || this.A01 == null) {
            return true;
        }
        java.lang.String strA05 = com.facebook.ads.redexgen.core.AbstractC0748Hx.A05(str);
        if (A08[1].length() == 16) {
            throw new java.lang.RuntimeException();
        }
        A08[0] = "tLac0A4cWgd";
        if (strA05 == null) {
            return true;
        }
        boolean zEquals = this.A01.equals(strA05);
        java.lang.String strA03 = A03(4, 2, 26);
        if (!zEquals) {
            A06(A03(324, 11, 102) + str + strA03 + strA05);
            return false;
        }
        android.util.Pair<java.lang.Integer, java.lang.Integer> pairA02 = com.facebook.ads.redexgen.core.DW.A02(str);
        if (pairA02 == null) {
            return true;
        }
        for (android.media.MediaCodecInfo.CodecProfileLevel codecProfileLevel : A0J()) {
            if (codecProfileLevel.profile == ((java.lang.Integer) pairA02.first).intValue() && codecProfileLevel.level >= ((java.lang.Integer) pairA02.second).intValue()) {
                return true;
            }
        }
        A06(A03(335, 20, 108) + str + strA03 + strA05);
        return false;
    }

    public final android.media.MediaCodecInfo.CodecProfileLevel[] A0J() {
        if (this.A00 == null || this.A00.profileLevels == null) {
            return new android.media.MediaCodecInfo.CodecProfileLevel[0];
        }
        return this.A00.profileLevels;
    }
}
