package com.applovin.mediation.ads;

/* JADX INFO: loaded from: classes3.dex */
public class MaxAdView extends android.widget.RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.applovin.impl.mediation.ads.MaxAdViewImpl f1584a;
    private android.view.View b;
    private int c;

    public MaxAdView(java.lang.String str, android.content.Context context) {
        this(str, com.applovin.sdk.AppLovinSdk.getInstance(context), context);
    }

    private void a(java.lang.String str, com.applovin.mediation.MaxAdFormat maxAdFormat, int i, com.applovin.sdk.AppLovinSdk appLovinSdk, android.content.Context context) {
        android.view.View view = new android.view.View(context.getApplicationContext());
        this.b = view;
        view.setBackgroundColor(0);
        addView(this.b);
        this.b.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, -1));
        this.c = getVisibility();
        this.f1584a = new com.applovin.impl.mediation.ads.MaxAdViewImpl(str.trim(), maxAdFormat, this, this.b, appLovinSdk.a(), context);
        setGravity(i);
        if (getBackground() instanceof android.graphics.drawable.ColorDrawable) {
            setBackgroundColor(((android.graphics.drawable.ColorDrawable) getBackground()).getColor());
        }
        super.setBackgroundColor(0);
    }

    public void destroy() {
        this.f1584a.logApiCall("destroy()");
        this.f1584a.destroy();
    }

    public com.applovin.mediation.MaxAdFormat getAdFormat() {
        return this.f1584a.getAdFormat();
    }

    public java.lang.String getAdUnitId() {
        return this.f1584a.getAdUnitId();
    }

    public java.lang.String getPlacement() {
        this.f1584a.logApiCall("getPlacement()");
        return this.f1584a.getPlacement();
    }

    public void loadAd() {
        this.f1584a.logApiCall("loadAd()");
        this.f1584a.loadAd();
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (isInEditMode()) {
            return;
        }
        this.f1584a.logApiCall("onWindowVisibilityChanged(visibility=" + i + ")");
        if (this.f1584a != null && com.applovin.impl.zq.a(this.c, i)) {
            this.f1584a.onWindowVisibilityChanged(i);
        }
        this.c = i;
    }

    public void setAdReviewListener(com.applovin.mediation.MaxAdReviewListener maxAdReviewListener) {
        this.f1584a.logApiCall("setAdReviewListener(listener=" + maxAdReviewListener + ")");
        this.f1584a.setAdReviewListener(maxAdReviewListener);
    }

    @Override // android.view.View
    public void setAlpha(float f) {
        this.f1584a.logApiCall("setAlpha(alpha=" + f + ")");
        android.view.View view = this.b;
        if (view != null) {
            view.setAlpha(f);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.f1584a.logApiCall("setBackgroundColor(color=" + i + ")");
        com.applovin.impl.mediation.ads.MaxAdViewImpl maxAdViewImpl = this.f1584a;
        if (maxAdViewImpl != null) {
            maxAdViewImpl.setPublisherBackgroundColor(i);
        }
        android.view.View view = this.b;
        if (view != null) {
            view.setBackgroundColor(i);
        }
    }

    public void setCustomData(java.lang.String str) {
        this.f1584a.logApiCall("setCustomData(value=" + str + ")");
        this.f1584a.setCustomData(str);
    }

    public void setExtraParameter(java.lang.String str, java.lang.String str2) {
        this.f1584a.logApiCall("setExtraParameter(key=" + str + ", value=" + str2 + ")");
        this.f1584a.setExtraParameter(str, str2);
    }

    public void setListener(com.applovin.mediation.MaxAdViewAdListener maxAdViewAdListener) {
        this.f1584a.logApiCall("setListener(listener=" + maxAdViewAdListener + ")");
        this.f1584a.setListener(maxAdViewAdListener);
    }

    public void setLocalExtraParameter(java.lang.String str, java.lang.Object obj) {
        this.f1584a.logApiCall("setLocalExtraParameter(key=" + str + ", value=" + obj + ")");
        this.f1584a.setLocalExtraParameter(str, obj);
    }

    public void setPlacement(java.lang.String str) {
        this.f1584a.logApiCall("setPlacement(placement=" + str + ")");
        this.f1584a.setPlacement(str);
    }

    public void setRequestListener(com.applovin.mediation.MaxAdRequestListener maxAdRequestListener) {
        this.f1584a.logApiCall("setRequestListener(listener=" + maxAdRequestListener + ")");
        this.f1584a.setRequestListener(maxAdRequestListener);
    }

    public void setRevenueListener(com.applovin.mediation.MaxAdRevenueListener maxAdRevenueListener) {
        this.f1584a.logApiCall("setRevenueListener(listener=" + maxAdRevenueListener + ")");
        this.f1584a.setRevenueListener(maxAdRevenueListener);
    }

    public void startAutoRefresh() {
        this.f1584a.logApiCall("startAutoRefresh()");
        this.f1584a.startAutoRefresh();
    }

    public void stopAutoRefresh() {
        this.f1584a.logApiCall("stopAutoRefresh()");
        this.f1584a.stopAutoRefresh();
    }

    @Override // android.view.View
    public java.lang.String toString() {
        com.applovin.impl.mediation.ads.MaxAdViewImpl maxAdViewImpl = this.f1584a;
        return maxAdViewImpl != null ? maxAdViewImpl.toString() : "MaxAdView";
    }

    public MaxAdView(java.lang.String str, com.applovin.sdk.AppLovinSdk appLovinSdk, android.content.Context context) {
        this(str, com.applovin.impl.e0.a(context), appLovinSdk, context);
    }

    public MaxAdView(java.lang.String str, com.applovin.mediation.MaxAdFormat maxAdFormat, android.content.Context context) {
        this(str, maxAdFormat, com.applovin.sdk.AppLovinSdk.getInstance(context), context);
    }

    public MaxAdView(java.lang.String str, com.applovin.mediation.MaxAdFormat maxAdFormat, com.applovin.sdk.AppLovinSdk appLovinSdk, android.content.Context context) {
        super(context.getApplicationContext());
        com.applovin.impl.mediation.ads.a.logApiCall("MaxAdView", "MaxAdView(adUnitId=" + str + ", adFormat=" + maxAdFormat + ", sdk=" + appLovinSdk + ")");
        a(str, maxAdFormat, 49, appLovinSdk, context);
    }

    public MaxAdView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MaxAdView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        com.applovin.mediation.MaxAdFormat maxAdFormatA;
        super(context, attributeSet, i);
        java.lang.String strA = com.applovin.impl.e0.a(context, attributeSet, com.applovin.adview.AppLovinAdView.NAMESPACE, "adUnitId");
        java.lang.String strA2 = com.applovin.impl.e0.a(context, attributeSet, com.applovin.adview.AppLovinAdView.NAMESPACE, com.json.mediationsdk.impressionData.ImpressionData.IMPRESSION_DATA_KEY_AD_FORMAT);
        if (com.applovin.impl.sdk.utils.StringUtils.isValidString(strA2)) {
            maxAdFormatA = com.applovin.mediation.MaxAdFormat.formatFromString(strA2);
        } else {
            maxAdFormatA = com.applovin.impl.e0.a(context);
        }
        com.applovin.mediation.MaxAdFormat maxAdFormat = maxAdFormatA;
        int attributeIntValue = attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 49);
        if (strA != null) {
            if (!android.text.TextUtils.isEmpty(strA)) {
                if (isInEditMode()) {
                    a(context);
                    return;
                } else {
                    a(strA, maxAdFormat, attributeIntValue, com.applovin.sdk.AppLovinSdk.getInstance(context), context);
                    return;
                }
            }
            throw new java.lang.IllegalArgumentException("Empty ad unit ID specified");
        }
        throw new java.lang.IllegalArgumentException("No ad unit ID specified");
    }

    private void a(android.content.Context context) {
        android.util.DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        android.widget.TextView textView = new android.widget.TextView(context);
        textView.setBackgroundColor(android.graphics.Color.rgb(220, 220, 220));
        textView.setTextColor(androidx.core.view.ViewCompat.MEASURED_STATE_MASK);
        textView.setText("AppLovin MAX Ad");
        textView.setGravity(17);
        addView(textView, i, i2);
    }
}
