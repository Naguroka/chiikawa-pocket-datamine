package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ob, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC0900Ob {
    public static final int A00 = com.facebook.ads.redexgen.core.M3.A00();

    public static void A00(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, android.view.ViewGroup viewGroup, java.lang.String str) {
        new com.facebook.ads.redexgen.core.AsyncTaskC1068Un(viewGroup, c1199Zs).A07(str);
        android.view.View view = new android.view.View(c1199Zs);
        view.setId(A00);
        view.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        com.facebook.ads.redexgen.core.M3.A0R(view, c1199Zs);
        viewGroup.addView(view, 0);
    }
}
