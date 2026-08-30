package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Qd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0954Qd extends android.widget.LinearLayout {
    public C0954Qd(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.NativeBannerAd nativeBannerAd, com.facebook.ads.redexgen.core.JX jx, com.facebook.ads.redexgen.core.JW jw, com.facebook.ads.AdOptionsView adOptionsView) {
        super(c1199Zs);
        android.widget.TextView textView = new android.widget.TextView(getContext());
        jw.A08(textView);
        textView.setText(nativeBannerAd.getAdvertiserName());
        textView.setEllipsize(android.text.TextUtils.TruncateAt.END);
        textView.setMaxLines(1);
        android.widget.TextView textView2 = new android.widget.TextView(getContext());
        jw.A06(textView2);
        textView2.setText(nativeBannerAd.getAdUntrimmedBodyText());
        textView2.setLines(jx == com.facebook.ads.redexgen.core.JX.A07 ? 2 : 1);
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(0, -2);
        layoutParams.weight = 1.0f;
        linearLayout.addView(textView, layoutParams);
        linearLayout.addView(adOptionsView, new android.widget.LinearLayout.LayoutParams(-2, -2));
        setOrientation(1);
        android.view.ViewGroup.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(-1, -2);
        addView(linearLayout, layoutParams2);
        addView(textView2, layoutParams2);
    }
}
