package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Qh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0958Qh extends android.widget.LinearLayout {
    public static final int A00 = (int) (com.facebook.ads.redexgen.core.LP.A02 * 32.0f);
    public static final int A01 = (int) (com.facebook.ads.redexgen.core.LP.A02 * 8.0f);

    public C0958Qh(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.NativeAd nativeAd, com.facebook.ads.redexgen.core.JW jw, com.facebook.ads.redexgen.core.OU ou, com.facebook.ads.AdOptionsView adOptionsView) {
        super(c1199Zs);
        setOrientation(0);
        ou.setFullCircleCorners(true);
        android.widget.LinearLayout.LayoutParams iconViewParams = new android.widget.LinearLayout.LayoutParams(A00, A00);
        iconViewParams.gravity = 16;
        iconViewParams.setMargins(0, 0, A01, 0);
        addView(ou, iconViewParams);
        android.widget.TextView textView = new android.widget.TextView(c1199Zs);
        jw.A08(textView);
        textView.setMaxLines(1);
        textView.setText(nativeAd.getAdvertiserName());
        android.widget.TextView sponsoredTextView = new android.widget.TextView(c1199Zs);
        jw.A06(sponsoredTextView);
        sponsoredTextView.setMaxLines(1);
        sponsoredTextView.setText(nativeAd.getSponsoredTranslation());
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(c1199Zs);
        linearLayout.setOrientation(1);
        android.widget.LinearLayout.LayoutParams iconViewParams2 = new android.widget.LinearLayout.LayoutParams(0, -2);
        iconViewParams2.weight = 1.0f;
        iconViewParams2.gravity = 16;
        android.widget.LinearLayout.LayoutParams textContainerParams = new android.widget.LinearLayout.LayoutParams(-1, -2);
        linearLayout.addView(textView, textContainerParams);
        android.widget.LinearLayout.LayoutParams textContainerParams2 = new android.widget.LinearLayout.LayoutParams(-1, -2);
        linearLayout.addView(sponsoredTextView, textContainerParams2);
        addView(linearLayout, iconViewParams2);
        android.view.ViewGroup.LayoutParams textContainerParams3 = new android.widget.LinearLayout.LayoutParams(-2, -2);
        addView(adOptionsView, textContainerParams3);
    }
}
