package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.4g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C04264g extends com.facebook.ads.redexgen.core.DP {
    public static byte[] A05;
    public static java.lang.String[] A06 = {"voi9qGMtYtobAgRqg", "i8JJ1VX9T6FbzCMQLBGPbtFPfD02EzPW", "v6oC9E02J21Vr04ahrJngYZMnVV2OVNY", "kicp0KggiDo3q7jvaFg8HsU4Xp8AQowh", "gvZaMgnlealTntma7jKFbyLF1vqDiERO", "AwReB6CJfKDfzaUmGsZwkLBxgWQy6imw", "anDXtkkAhMqJOECaQChOPQ3FzDPKJsLN", "7FMpk05V5nJPRxkKy5zgZ4SKnXISiLM1"};
    public static final java.util.regex.Pattern A07;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public final boolean A04;

    public static java.lang.String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 68);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A03() {
        A05 = new byte[]{-115, -82, -59, -64, -82, -30, -22, -79, -81, -64, -81, -59, -82, -30, -22, -79, -81, -64, -82, -30, -22, -79, -81, -82, -59, -64, -64, 2, -30, -76, -81, -82, -30, -22, -79, -81, -35, -18, 19, 11, 22, 25, 17, 31, 15, -28, -54, -88, -47, -44, -49, -61, -42, -100, -126, -11, 13, 11, 18, 18, 11, 16, 9, -62, 6, 11, 3, 14, 17, 9, 23, 7, -62, 14, 11, 16, 7, -62, 4, 7, 8, 17, 20, 7, -62, 5, 17, 15, 18, 14, 7, 22, 7, -62, 8, 17, 20, 15, 3, 22, -36, -62, -24, 0, -2, 5, 5, -2, 3, -4, -75, -7, -2, -10, 1, 4, -4, 10, -6, -75, 1, -2, 3, -6, -75, 12, -2, 9, -3, -75, -5, -6, 12, -6, 7, -75, -8, 4, 1, 10, 2, 3, 8, -75, 9, -3, -10, 3, -75, -5, 4, 7, 2, -10, 9, -49, -75, -70, -46, -48, -41, -41, -48, -43, -50, -121, -48, -43, -35, -56, -45, -48, -53, -121, -37, -48, -44, -48, -43, -50, -95, -121, 17, 49, 31, 2, 35, 33, 45, 34, 35, 48, 12, -10, 39, 22, 31, 37, 36, 14, -31, -31, -45, -73, -73, -55, 21, 52, -25, -29, -8, 21, 54, -84, -75, -85, -47, -46, -65, -48, -46, 51, 36, 55, 51};
    }

    static {
        A03();
        A07 = java.util.regex.Pattern.compile(A02(1, 35, 66));
    }

    public C04264g() {
        this(null);
    }

    public C04264g(java.util.List<byte[]> list) {
        super(A02(org.objectweb.asm.Opcodes.INVOKEVIRTUAL, 10, 122));
        if (list != null && !list.isEmpty()) {
            this.A04 = true;
            java.lang.String strA0Q = com.facebook.ads.redexgen.core.IK.A0Q(list.get(0));
            java.lang.String formatLine = A02(47, 8, 30);
            com.facebook.ads.redexgen.core.AbstractC0730Hf.A03(strA0Q.startsWith(formatLine));
            A06(strA0Q);
            A04(new com.facebook.ads.redexgen.core.I4(list.get(1)));
            return;
        }
        this.A04 = false;
    }

    public static long A00(java.lang.String str) {
        java.util.regex.Matcher matcher = A07.matcher(str);
        if (!matcher.matches()) {
            return androidx.media3.common.C.TIME_UNSET;
        }
        return (java.lang.Long.parseLong(matcher.group(1)) * 60 * 60 * 1000000) + (java.lang.Long.parseLong(matcher.group(2)) * 60 * 1000000) + (java.lang.Long.parseLong(matcher.group(3)) * 1000000) + (java.lang.Long.parseLong(matcher.group(4)) * 10000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.DP
    /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final com.facebook.ads.redexgen.core.XK A0b(byte[] bArr, int i, boolean z) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.facebook.ads.redexgen.core.C0745Hu c0745Hu = new com.facebook.ads.redexgen.core.C0745Hu();
        com.facebook.ads.redexgen.core.I4 i4 = new com.facebook.ads.redexgen.core.I4(bArr, i);
        if (!this.A04) {
            A04(i4);
        }
        A05(i4, arrayList, c0745Hu);
        com.facebook.ads.redexgen.core.C0693Fs[] c0693FsArr = new com.facebook.ads.redexgen.core.C0693Fs[arrayList.size()];
        arrayList.toArray(c0693FsArr);
        return new com.facebook.ads.redexgen.core.XK(c0693FsArr, c0745Hu.A05());
    }

    private void A04(com.facebook.ads.redexgen.core.I4 i4) {
        java.lang.String strA0P;
        do {
            strA0P = i4.A0P();
            if (strA0P == null) {
                return;
            }
        } while (!strA0P.startsWith(A02(192, 8, 109)));
    }

    private void A05(com.facebook.ads.redexgen.core.I4 i4, java.util.List<com.facebook.ads.redexgen.core.C0693Fs> list, com.facebook.ads.redexgen.core.C0745Hu c0745Hu) {
        while (true) {
            java.lang.String strA0P = i4.A0P();
            if (strA0P != null) {
                if (!this.A04 && strA0P.startsWith(A02(47, 8, 30))) {
                    A06(strA0P);
                } else if (strA0P.startsWith(A02(37, 10, 102))) {
                    A07(strA0P, list, c0745Hu);
                }
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x0040  */
    private void A06(java.lang.String str) {
        java.lang.String[] strArrSplit = android.text.TextUtils.split(str.substring(A02(47, 8, 30).length()), A02(36, 1, 109));
        this.A01 = strArrSplit.length;
        this.A02 = -1;
        this.A00 = -1;
        this.A03 = -1;
        int i = 0;
        while (true) {
            byte b = 0;
            if (i >= this.A01) {
                if (this.A02 != -1) {
                    int i2 = this.A00;
                    java.lang.String[] strArr = A06;
                    if (strArr[4].charAt(9) == strArr[7].charAt(9)) {
                        throw new java.lang.RuntimeException();
                    }
                    A06[3] = "VBU3TrESEVpVzSlZYum2Chs6nvZkrBrf";
                    if (i2 != -1 && this.A03 != -1) {
                        return;
                    }
                }
                this.A01 = 0;
                return;
            }
            java.lang.String strA0M = com.facebook.ads.redexgen.core.IK.A0M(strArrSplit[i].trim());
            switch (strA0M.hashCode()) {
                case 100571:
                    if (!strA0M.equals(A02(213, 3, 3))) {
                        b = -1;
                    } else {
                        b = 1;
                    }
                    break;
                case 3556653:
                    if (!strA0M.equals(A02(221, 4, 123))) {
                        b = -1;
                    } else {
                        b = 2;
                    }
                    break;
                case 109757538:
                    if (!strA0M.equals(A02(216, 5, 26))) {
                        b = -1;
                    }
                    break;
                default:
                    b = -1;
                    break;
            }
            switch (b) {
                case 0:
                    this.A02 = i;
                    break;
                case 1:
                    this.A00 = i;
                    break;
                case 2:
                    this.A03 = i;
                    break;
            }
            i++;
        }
    }

    private void A07(java.lang.String str, java.util.List<com.facebook.ads.redexgen.core.C0693Fs> list, com.facebook.ads.redexgen.core.C0745Hu c0745Hu) {
        int i = this.A01;
        java.lang.String strA02 = A02(org.objectweb.asm.Opcodes.INVOKEVIRTUAL, 10, 122);
        if (i == 0) {
            android.util.Log.w(strA02, A02(55, 47, 94) + str);
            return;
        }
        java.lang.String[] strArrSplit = str.substring(A02(37, 10, 102).length()).split(A02(36, 1, 109), this.A01);
        if (strArrSplit.length != this.A01) {
            android.util.Log.w(strA02, A02(102, 55, 81) + str);
            return;
        }
        long startTimeUs = A00(strArrSplit[this.A02]);
        java.lang.String strA03 = A02(157, 25, 35);
        if (startTimeUs == androidx.media3.common.C.TIME_UNSET) {
            android.util.Log.w(strA02, strA03 + str);
            return;
        }
        long jA00 = androidx.media3.common.C.TIME_UNSET;
        int i2 = this.A00;
        java.lang.String[] strArr = A06;
        if (strArr[1].charAt(27) != strArr[2].charAt(27)) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A06;
        strArr2[6] = "8Z0lGBjOUyAgCpNAkEkptI9cCMl1oL4V";
        strArr2[5] = "T8saQGTCuSxjdg3XY2BQpttDIhhC0C66";
        java.lang.String str2 = strArrSplit[i2];
        if (!str2.trim().isEmpty()) {
            jA00 = A00(str2);
            if (jA00 == androidx.media3.common.C.TIME_UNSET) {
                android.util.Log.w(strA02, strA03 + str);
                return;
            }
        }
        java.lang.String endTimeString = strArrSplit[this.A03].replaceAll(A02(com.ironsource.g3.c.b.g, 7, 117), A02(0, 0, 39));
        java.lang.String strA04 = A02(200, 3, 65);
        java.lang.String strA05 = A02(0, 1, 63);
        list.add(new com.facebook.ads.redexgen.core.C0693Fs(endTimeString.replaceAll(strA04, strA05).replaceAll(A02(com.ironsource.g3.c.b.d, 3, 23), strA05)));
        c0745Hu.A04(startTimeUs);
        if (jA00 != androidx.media3.common.C.TIME_UNSET) {
            list.add(null);
            c0745Hu.A04(jA00);
        }
    }
}
