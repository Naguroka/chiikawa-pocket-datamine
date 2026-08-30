package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Qc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0953Qc {
    public static byte[] A05;
    public java.util.concurrent.Executor A00 = com.facebook.ads.redexgen.core.M8.A06;
    public final com.facebook.ads.redexgen.core.C1199Zs A01;
    public final com.facebook.ads.redexgen.core.MR A02;
    public final com.facebook.ads.redexgen.core.N9 A03;
    public final java.lang.String A04;

    static {
        A04();
    }

    public static java.lang.String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 76);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A04() {
        A05 = new byte[]{5, 20, 20, 13, 8, 19, 31, 31, 27, 30, -27, -38, -38, 34, 34, 34, -39, -48, 30, -39, 17, 12, 14, 16, 13, 26, 26, 22, -39, 14, 26, 24, -38, 12, 32, 15, 20, 16, 25, 14, 16, 10, 25, 16, 31, 34, 26, 29, 22, -38, 30, 16, 29, 33, 16, 29, 10, 30, 20, 15, 16, 10, 29, 16, 34, 12, 29, 15, -31, -19, -19, -23, -20, -77, -88, -88, -16, -16, -16, -89, -33, -38, -36, -34, -37, -24, -24, -28, -89, -36, -24, -26, -88, -38, -18, -35, -30, -34, -25, -36, -34, -40, -25, -34, -19, -16, -24, -21, -28, -88, -20, -34, -21, -17, -34, -21, -40, -20, -30, -35, -34, -40, -21, -34, -16, -38, -21, -35, 20, 7, 31, 35, 24, 19, 42, 47, 35, 30};
    }

    public C0953Qc(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.redexgen.core.N9 n9, java.lang.String str, com.facebook.ads.redexgen.core.MR mr) {
        this.A01 = c1199Zs;
        this.A03 = n9;
        this.A04 = str;
        this.A02 = mr;
    }

    public static java.lang.String A03(com.facebook.ads.RewardData rewardData, java.lang.String str, java.lang.String str2) {
        java.lang.String urlPrefix;
        if (rewardData != null) {
            java.lang.String serverSideProxyURL = com.facebook.ads.AdSettings.getUrlPrefix();
            if (serverSideProxyURL == null || serverSideProxyURL.isEmpty()) {
                urlPrefix = A02(68, 60, 45);
            } else {
                java.lang.String urlPrefix2 = A02(5, 63, 95);
                urlPrefix = java.lang.String.format(java.util.Locale.US, urlPrefix2, serverSideProxyURL);
            }
            android.net.Uri uriA00 = com.facebook.ads.redexgen.core.L5.A00(urlPrefix);
            android.net.Uri.Builder uriBuilder = new android.net.Uri.Builder();
            java.lang.String urlPrefix3 = uriA00.getScheme();
            uriBuilder.scheme(urlPrefix3);
            java.lang.String urlPrefix4 = uriA00.getAuthority();
            uriBuilder.authority(urlPrefix4);
            java.lang.String urlPrefix5 = uriA00.getPath();
            uriBuilder.path(urlPrefix5);
            java.lang.String urlPrefix6 = uriA00.getQuery();
            uriBuilder.query(urlPrefix6);
            java.lang.String urlPrefix7 = uriA00.getFragment();
            uriBuilder.fragment(urlPrefix7);
            java.lang.String serverSideProxyURL2 = A02(134, 4, 110);
            java.lang.String urlPrefix8 = rewardData.getUserID();
            uriBuilder.appendQueryParameter(serverSideProxyURL2, urlPrefix8);
            java.lang.String serverSideProxyURL3 = A02(128, 2, 88);
            java.lang.String urlPrefix9 = rewardData.getCurrency();
            uriBuilder.appendQueryParameter(serverSideProxyURL3, urlPrefix9);
            java.lang.String urlPrefix10 = A02(130, 4, 99);
            uriBuilder.appendQueryParameter(urlPrefix10, str);
            java.lang.String urlPrefix11 = A02(0, 5, 88);
            uriBuilder.appendQueryParameter(urlPrefix11, str2);
            java.lang.String urlPrefix12 = uriBuilder.build().toString();
            return urlPrefix12;
        }
        return null;
    }

    public final void A05() {
        if (!android.text.TextUtils.isEmpty(this.A04)) {
            com.facebook.ads.redexgen.core.SA sa = new com.facebook.ads.redexgen.core.SA(this.A01, new java.util.HashMap());
            sa.A07(new com.facebook.ads.redexgen.core.TG(this));
            sa.executeOnExecutor(this.A00, this.A04);
        }
    }
}
