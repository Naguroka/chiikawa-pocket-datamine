package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1 {
    public static byte[] A02;
    public static java.lang.String[] A03 = {"0aDEHir", "KeFAePI1lGBtE1CqAwqlTmaTiKQi585e", "oL2e04jbfOxdtKuwfeKQnW7E8P42I46y", "aGz9Hcb30XOvVP9HaLLwVPlUk", "Ko6ZwJto5HSbbo1gKWEXYnH6bpNNiPLs", "doxRQxYmnKukwMO8NbdWOtVN68TpFesA", "LAzIqji4IuYx9FVtRgQH7OQvPgoyEYhN", "CzXOhWpOkYu1cjXOwBdQnYqH0"};
    public static final com.facebook.ads.redexgen.core.InterfaceC0650Dn A04;
    public static final java.util.regex.Pattern A05;
    public int A00 = -1;
    public int A01 = -1;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 46);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        byte[] bArr = {-83, 111, -86, 127, 124, -120, -80, 124, -75, -112, 124, -107, -84, -54, -121, -52, 111, 119, -86, 127, 124, -120, -80, 124, -75, -112, 124, -107, -84, -54, -121, -52, 120, 111, 119, -86, 127, 124, -120, -80, 124, -75, -112, 124, -107, -84, -54, -121, -52, 120, -99, -87, -89, 104, -101, -86, -86, -90, -97, 104, -93, -114, -81, -88, -97, -83, -4, -25, 8, 1, -26, -32, -29, -43};
        if (A03[5].charAt(25) != '8') {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr = A03;
        strArr[6] = "VeQWCF02N5mb5X7ahc1LI9FSMTOHD8V3";
        strArr[2] = "hbqvlfSPUh2jdrc5qFStp6bRHKmwzne9";
        A02 = bArr;
    }

    static {
        A01();
        A04 = new com.facebook.ads.redexgen.core.C1170Yp();
        A05 = java.util.regex.Pattern.compile(A00(0, 50, 33));
    }

    private boolean A02(java.lang.String str) {
        java.util.regex.Matcher matcher = A05.matcher(str);
        if (matcher.find()) {
            try {
                int i = java.lang.Integer.parseInt(matcher.group(1), 16);
                int i2 = java.lang.Integer.parseInt(matcher.group(2), 16);
                if (i > 0 || i2 > 0) {
                    this.A00 = i;
                    this.A01 = i2;
                    return true;
                }
                return false;
            } catch (java.lang.NumberFormatException unused) {
                return false;
            }
        }
        return false;
    }

    public final boolean A03() {
        return (this.A00 == -1 || this.A01 == -1) ? false : true;
    }

    public final boolean A04(int i) {
        int encoderPadding = i >> 12;
        int encoderDelay = i & 4095;
        if (encoderPadding > 0 || encoderDelay > 0) {
            this.A00 = encoderPadding;
            this.A01 = encoderDelay;
            return true;
        }
        return false;
    }

    public final boolean A05(com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata metadata) {
        for (int i = 0; i < i; i++) {
            com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata.Entry entryA01 = metadata.A01(i);
            boolean z = entryA01 instanceof com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.CommentFrame;
            java.lang.String strA00 = A00(66, 8, 101);
            if (z) {
                com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.CommentFrame commentFrame = (com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.CommentFrame) entryA01;
                if (strA00.equals(commentFrame.A00)) {
                    boolean zA02 = A02(commentFrame.A02);
                    if (A03[5].charAt(25) != '8') {
                        throw new java.lang.RuntimeException();
                    }
                    java.lang.String[] strArr = A03;
                    strArr[4] = "KQWxn43FztGs1nSTIKFdJKZvnTIiAT7x";
                    strArr[1] = "K3QOntDZZViFMWU0Bvdf3H2DebaVhORR";
                    if (zA02) {
                        return true;
                    }
                } else {
                    continue;
                }
            } else if (entryA01 instanceof com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.InternalFrame) {
                com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.InternalFrame internalFrame = (com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.InternalFrame) entryA01;
                if (A00(50, 16, 12).equals(internalFrame.A01) && strA00.equals(internalFrame.A00) && A02(internalFrame.A02)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }
}
