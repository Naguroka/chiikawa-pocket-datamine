package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Mt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0866Mt extends android.widget.LinearLayout {
    public static final int A03 = (int) (com.facebook.ads.redexgen.core.LP.A02 * 10.0f);
    public static final int A04 = (int) (com.facebook.ads.redexgen.core.LP.A02 * 24.0f);
    public final android.widget.ImageView A00;
    public final com.facebook.ads.redexgen.core.C2S A01;
    public final com.facebook.ads.redexgen.core.C1199Zs A02;

    public C0866Mt(com.facebook.ads.redexgen.core.C1199Zs c1199Zs) {
        super(c1199Zs);
        this.A02 = c1199Zs;
        this.A01 = com.facebook.ads.redexgen.core.C2T.A00(c1199Zs.A01());
        this.A00 = new android.widget.ImageView(c1199Zs);
        A02();
    }

    private void A02() {
        A03(this.A00, com.facebook.ads.redexgen.core.MB.REDESIGN_INFO_ICON);
        setPadding(A03, A03 / 3, A03, A03 / 3);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(A04, A04);
        layoutParams.gravity = 16;
        addView(this.A00, layoutParams);
    }

    public static void A03(android.widget.ImageView imageView, com.facebook.ads.redexgen.core.MB mb) {
        imageView.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
        imageView.setImageBitmap(com.facebook.ads.redexgen.core.MC.A01(mb));
        imageView.setColorFilter(-1);
    }

    public void setAdDetails(com.facebook.ads.redexgen.core.C1Z c1z, java.lang.String str, com.facebook.ads.redexgen.core.JF jf, com.facebook.ads.redexgen.core.MR mr) {
        setOnClickListener(new com.facebook.ads.redexgen.core.ViewOnClickListenerC0865Ms(this, jf, mr, str, c1z));
    }

    public void setIconColors(int i) {
        this.A00.setColorFilter(i);
    }
}
