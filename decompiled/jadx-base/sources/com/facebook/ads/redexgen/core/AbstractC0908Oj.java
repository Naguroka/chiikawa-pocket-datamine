package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Oj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC0908Oj {
    public static byte[] A00;
    public static java.lang.String[] A01 = {"e7juOHCMVCS96MucXvvyM5upzpE0CxcL", "6Axk6XM18YFtFlcC0tEdKqjogVlmemrm", "CHYE97fUe", "94l1C", "pvrd7E3JtMrEOvPAC3lcGaqqDdvc2Rnk", "mswd2ljSuB4EOxjza27Iz7krcpdQKmDN", "x2gmwPWroRNX0socjzMaFBH0Y3mBhUE3", "1dJrelJWCcDuEHtNsp3IaM8Oqex3ZZ7a"};

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 41);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{-73, -32, 10, -73, -32, 5, 10, 11, -8, 5, 11, -73, -2, -8, 4, -4, 10, -73, -8, 3, 3, 6, 14, -4, -5, -47, -73, -121, -80, -38, -121, -80, -43, -38, -37, -56, -43, -37, -121, -50, -56, -44, -52, -38, -95, -121, -57, 14, 22, 22, 14, 19, 12, -57, 13, 8, 19, 19, 9, 8, 10, 18, -57, 28, 25, 19, -57, 8, 29, 8, 16, 19, 8, 9, 19, 12, -31, -57, 79, -104, -94, -126, -93, -98, -95, -108, 105, 79, 90, -95, -9, -22, -27, -26, -16, -95, -10, -13, -19, -95, -22, -12, -95, -17, -10, -19, -19, -69, -95, 4, 16, 14, -49, 7, 2, 4, 6, 3, 16, 16, 12, -49, 12, 2, 21, 2, 15, 2, -42, -41, -46, -43, -56, -35, -34, -39, -36, -49, -55, -33, -36, -42, -55, -31, -49, -52, -55, -48, -53, -42, -42, -52, -53, -51, -43, -30, -43, -48, -47, -37, -53, -31, -34, -40};
        java.lang.String[] strArr = A01;
        if (strArr[5].charAt(19) != strArr[7].charAt(19)) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A01;
        strArr2[3] = "ump74";
        strArr2[2] = "QJx5Vwz5z";
    }

    static {
        A02();
    }

    public static com.facebook.ads.redexgen.core.AbstractC0907Oi A00(com.facebook.ads.redexgen.core.C0911Om c0911Om, android.os.Bundle bundle, boolean z) {
        com.facebook.ads.redexgen.core.AbstractC0907Oi uz;
        c0911Om.A05().A0G().A00(false);
        com.facebook.ads.redexgen.core.C1F c1fA1P = c0911Om.A04().A1P();
        double dA00 = com.facebook.ads.redexgen.core.AbstractC0904Of.A00(c1fA1P);
        boolean isWatchAndBrowse = c0911Om.A04().A1P().A0P();
        boolean zA06 = com.facebook.ads.redexgen.core.AbstractC0904Of.A06(c0911Om.A00(), c0911Om.A01(), dA00);
        com.facebook.ads.redexgen.core.AbstractC03250h abstractC03250hA00 = com.facebook.ads.redexgen.core.C03260i.A00(c0911Om.A05(), c0911Om.A06(), A01(0, 0, 8), com.facebook.ads.redexgen.core.L5.A00(c0911Om.A04().A1P().A0G().A05()), new java.util.HashMap(), c0911Om.A04().A1Q());
        boolean z2 = !android.text.TextUtils.isEmpty(c1fA1P.A0E().A08());
        if (com.facebook.ads.redexgen.core.C0762Im.A1p(c0911Om.A05())) {
            com.facebook.ads.redexgen.core.C1199Zs c1199ZsA05 = c0911Om.A05();
            java.lang.String[] strArr = A01;
            if (strArr[4].charAt(27) == strArr[6].charAt(27)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A01;
            strArr2[5] = "oHCvC4ERmXYMU8sW9KKIPv7pnY2wXb01";
            strArr2[7] = "G3HUaMks2xBdg2z9mSbIts1gYwx1OgmU";
            c1199ZsA05.A0A().AHO(c0911Om.A02(), c0911Om.A04().A1U(), z2);
        }
        boolean zA03 = A03(c0911Om, z2);
        if ((isWatchAndBrowse && (abstractC03250hA00 instanceof com.facebook.ads.redexgen.core.GQ)) || zA03) {
            uz = new com.facebook.ads.redexgen.core.UQ(c0911Om, zA03);
        } else if (z2) {
            uz = new com.facebook.ads.redexgen.core.BX(c0911Om);
        } else if (!z2 && com.facebook.ads.redexgen.core.C0762Im.A2V(c0911Om.A05())) {
            uz = new com.facebook.ads.redexgen.core.BY(c0911Om, zA06);
        } else if (zA06) {
            uz = new com.facebook.ads.redexgen.core.C1057Uc(c0911Om, c0911Om.A00() == 2);
        } else {
            uz = new com.facebook.ads.redexgen.core.UZ(c0911Om, com.facebook.ads.redexgen.core.AbstractC0904Of.A04(dA00));
        }
        if (z) {
            uz.A10(c1fA1P, c0911Om.A04().A1U(), dA00, bundle);
        }
        return uz;
    }

    public static boolean A03(com.facebook.ads.redexgen.core.C0911Om c0911Om, boolean z) {
        boolean z2 = false;
        if (!c0911Om.A04().A1H() || !z) {
            return false;
        }
        android.net.Uri uriA00 = com.facebook.ads.redexgen.core.L5.A00(c0911Om.A04().A1P().A0G().A05());
        java.lang.String authority = uriA00.getAuthority();
        if (android.text.TextUtils.isEmpty(authority)) {
            c0911Om.A05().A0E().AAf();
            return false;
        }
        boolean isInstantGamesEnabled = authority.equals(A01(128, 5, 58));
        boolean isInstantGames = uriA00.getQueryParameter(A01(155, 9, 67)) == null;
        java.lang.String queryParameter = uriA00.getQueryParameter(A01(org.objectweb.asm.Opcodes.I2L, 22, 65));
        boolean isGoogleFallBackUrlAvailable = !android.text.TextUtils.isEmpty(queryParameter) && queryParameter.contains(c0911Om.A04().A0d());
        boolean zEquals = c0911Om.A05().getPackageName().equals(A01(109, 19, 120));
        boolean zA1I = c0911Om.A04().A1I();
        if (isInstantGamesEnabled && isInstantGames && isGoogleFallBackUrlAvailable && (!zEquals || zA1I)) {
            z2 = true;
        }
        if (!z2 && android.os.Build.VERSION.SDK_INT >= 24) {
            c0911Om.A05().A0E().AAe(A01(78, 11, 6) + isInstantGamesEnabled + A01(89, 20, 88) + isInstantGames + A01(46, 32, 126) + isGoogleFallBackUrlAvailable + A01(27, 19, 62) + zEquals + A01(0, 27, 110) + zA1I);
        }
        return z2;
    }
}
