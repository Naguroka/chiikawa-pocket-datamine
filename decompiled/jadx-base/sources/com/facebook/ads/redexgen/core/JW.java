package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class JW implements com.facebook.ads.internal.api.NativeAdViewAttributesApi {
    public static final int A08 = (int) (com.facebook.ads.redexgen.core.LP.A02 * 4.0f);
    public static final int A07 = (int) (com.facebook.ads.redexgen.core.LP.A02 * 1.0f);
    public android.graphics.Typeface A06 = android.graphics.Typeface.create(android.graphics.Typeface.SANS_SERIF, 0);
    public int A00 = -1;
    public int A04 = -14868183;
    public int A05 = -10393744;
    public int A01 = -1;
    public int A03 = -12420889;
    public int A02 = this.A03;

    public final int A00() {
        return this.A00;
    }

    public final int A01() {
        return this.A01;
    }

    public final int A02() {
        return this.A02;
    }

    public final int A03() {
        return this.A03;
    }

    public final int A04(float f) {
        int i = (this.A01 & androidx.core.view.ViewCompat.MEASURED_STATE_MASK) | ((this.A01 ^ (-1)) & androidx.core.view.ViewCompat.MEASURED_SIZE_MASK);
        int textColor = this.A01;
        return com.facebook.ads.redexgen.core.AbstractC03842p.A02(i, textColor, f);
    }

    public final void A05(android.widget.TextView textView) {
        textView.setTextSize(2, 14.0f);
        textView.setTypeface(this.A06, 1);
        textView.setGravity(17);
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setColor(this.A01);
        gradientDrawable.setCornerRadius(A08);
        gradientDrawable.setStroke(A07, this.A02);
        android.graphics.drawable.GradientDrawable gradientDrawable2 = new android.graphics.drawable.GradientDrawable();
        gradientDrawable2.setColor(this.A03);
        gradientDrawable2.setCornerRadius(A08);
        gradientDrawable2.setStroke(A07, this.A02);
        android.graphics.drawable.StateListDrawable stateListDrawable = new android.graphics.drawable.StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, gradientDrawable2);
        stateListDrawable.addState(new int[0], gradientDrawable);
        com.facebook.ads.redexgen.core.M3.A0S(textView, stateListDrawable);
        textView.setTextColor(new android.content.res.ColorStateList(new int[][]{new int[]{android.R.attr.state_pressed}, new int[0]}, new int[]{this.A01, this.A03}));
    }

    public final void A06(android.widget.TextView textView) {
        textView.setTextColor(this.A05);
        textView.setTextSize(14.0f);
        textView.setTypeface(this.A06);
        textView.setEllipsize(android.text.TextUtils.TruncateAt.END);
    }

    public final void A07(android.widget.TextView textView) {
        textView.setTextColor(this.A04);
        textView.setTextSize(16.0f);
        textView.setTypeface(this.A06, 1);
        textView.setEllipsize(android.text.TextUtils.TruncateAt.END);
    }

    public final void A08(android.widget.TextView textView) {
        textView.setTextColor(this.A04);
        textView.setTextSize(16.0f);
        textView.setTypeface(this.A06, 1);
        textView.setEllipsize(android.text.TextUtils.TruncateAt.END);
    }

    public final void A09(com.facebook.ads.AdOptionsView adOptionsView, int i) {
        adOptionsView.setIconColor(this.A04);
        adOptionsView.setIconSizeDp(i);
    }

    @Override // com.facebook.ads.internal.api.NativeAdViewAttributesApi
    public final void setBackgroundColor(int i) {
        this.A00 = i;
    }

    @Override // com.facebook.ads.internal.api.NativeAdViewAttributesApi
    public final void setCTABackgroundColor(int i) {
        this.A01 = i;
    }

    @Override // com.facebook.ads.internal.api.NativeAdViewAttributesApi
    public final void setCTABorderColor(int i) {
        this.A02 = i;
    }

    @Override // com.facebook.ads.internal.api.NativeAdViewAttributesApi
    public final void setCTATextColor(int i) {
        this.A03 = i;
    }

    @Override // com.facebook.ads.internal.api.NativeAdViewAttributesApi
    public final void setPrimaryTextColor(int i) {
        this.A04 = i;
    }

    @Override // com.facebook.ads.internal.api.NativeAdViewAttributesApi
    public final void setSecondaryTextColor(int i) {
        this.A05 = i;
    }

    @Override // com.facebook.ads.internal.api.NativeAdViewAttributesApi
    public final void setTypeface(android.graphics.Typeface typeface) {
        this.A06 = typeface;
    }
}
