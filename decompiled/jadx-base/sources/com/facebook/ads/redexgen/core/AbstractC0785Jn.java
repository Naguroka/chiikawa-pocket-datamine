package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Jn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC0785Jn {
    public static java.lang.String[] A00 = {"TYvyTugW0LIK7CMS2wYs9G2uUGgA7Dke", "WsEiqL7ZS4BTI966aPHoJ2dPx2Ea0F4I", "bsmL1TSWcO8d5RdSDpnXrtDP3Rd3pXtR", "xkYelsmw9O3RFB2zMTQOqufEggZJfpsf", "Ou1dyJktpNGGcf9tDpPKvHuJxEoqg2O4", "MwtSqX2RTtZq4kMpP", "Xg7OrQNETkr2DWt43s", "zI20iJtpElrzvKbVLZsd1iWpdjTxU8BC"};

    public static com.facebook.ads.redexgen.core.EnumC0783Jl A00(android.util.DisplayMetrics displayMetrics) {
        int i = (int) (displayMetrics.widthPixels / displayMetrics.density);
        int screenWidth = displayMetrics.heightPixels;
        int screenHeight = (int) (screenWidth / displayMetrics.density);
        if (com.facebook.ads.redexgen.core.LQ.A04(i, screenHeight)) {
            return com.facebook.ads.redexgen.core.EnumC0783Jl.A0I;
        }
        if (screenHeight > i) {
            com.facebook.ads.redexgen.core.EnumC0783Jl enumC0783Jl = com.facebook.ads.redexgen.core.EnumC0783Jl.A0K;
            java.lang.String[] strArr = A00;
            java.lang.String str = strArr[5];
            java.lang.String str2 = strArr[6];
            int screenHeight2 = str.length();
            int screenWidth2 = str2.length();
            if (screenHeight2 == screenWidth2) {
                throw new java.lang.RuntimeException();
            }
            A00[7] = "zEjIxhk858iOsdYr9SgRsiKXnD8rO3VU";
            return enumC0783Jl;
        }
        return com.facebook.ads.redexgen.core.EnumC0783Jl.A0H;
    }

    public static void A01(android.util.DisplayMetrics displayMetrics, android.view.View view, com.facebook.ads.redexgen.core.EnumC0781Jj enumC0781Jj) {
        int iCeil;
        int i = (int) (displayMetrics.widthPixels / displayMetrics.density);
        int screenWidth = enumC0781Jj.A04();
        if (i >= screenWidth) {
            iCeil = displayMetrics.widthPixels;
        } else {
            int screenWidth2 = enumC0781Jj.A04();
            iCeil = (int) java.lang.Math.ceil(screenWidth2 * displayMetrics.density);
        }
        int screenWidth3 = enumC0781Jj.A03();
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(iCeil, (int) java.lang.Math.ceil(screenWidth3 * displayMetrics.density));
        layoutParams.addRule(14, -1);
        view.setLayoutParams(layoutParams);
    }
}
