package com.applovin.adview;

/* JADX INFO: loaded from: classes3.dex */
public class AppLovinAdView extends android.widget.RelativeLayout {
    public static final java.lang.String NAMESPACE = "http://schemas.applovin.com/android/1.0";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.applovin.impl.adview.a f502a;

    public AppLovinAdView(com.applovin.sdk.AppLovinAdSize appLovinAdSize, android.content.Context context) {
        this(appLovinAdSize, (java.lang.String) null, context);
    }

    private void a(com.applovin.sdk.AppLovinAdSize appLovinAdSize, java.lang.String str, com.applovin.sdk.AppLovinSdk appLovinSdk, android.content.Context context, android.util.AttributeSet attributeSet) {
        if (isInEditMode()) {
            a(attributeSet, context);
            return;
        }
        com.applovin.impl.adview.a aVar = new com.applovin.impl.adview.a();
        this.f502a = aVar;
        aVar.a(this, context, appLovinAdSize, str, appLovinSdk, attributeSet);
    }

    public void destroy() {
        com.applovin.impl.adview.a aVar = this.f502a;
        if (aVar != null) {
            aVar.b();
        }
    }

    public com.applovin.impl.adview.a getController() {
        return this.f502a;
    }

    public com.applovin.sdk.AppLovinAdSize getSize() {
        com.applovin.impl.adview.a aVar = this.f502a;
        if (aVar != null) {
            return aVar.m();
        }
        return null;
    }

    public java.lang.String getZoneId() {
        com.applovin.impl.adview.a aVar = this.f502a;
        if (aVar != null) {
            return aVar.n();
        }
        return null;
    }

    public void loadNextAd() {
        com.applovin.impl.adview.a aVar = this.f502a;
        if (aVar != null) {
            aVar.v();
        } else {
            com.applovin.impl.sdk.n.i("AppLovinSdk", "Unable to load next ad: AppLovinAdView is not initialized.");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.applovin.impl.adview.a aVar = this.f502a;
        if (aVar != null) {
            aVar.B();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        com.applovin.impl.adview.a aVar = this.f502a;
        if (aVar != null) {
            aVar.C();
        }
        super.onDetachedFromWindow();
    }

    public void pause() {
        com.applovin.impl.adview.a aVar = this.f502a;
        if (aVar != null) {
            aVar.F();
        }
    }

    public void renderAd(com.applovin.sdk.AppLovinAd appLovinAd) {
        com.applovin.impl.adview.a aVar = this.f502a;
        if (aVar != null) {
            aVar.c(appLovinAd);
        }
    }

    public void resume() {
        com.applovin.impl.adview.a aVar = this.f502a;
        if (aVar != null) {
            aVar.H();
        }
    }

    public void setAdClickListener(com.applovin.sdk.AppLovinAdClickListener appLovinAdClickListener) {
        com.applovin.impl.adview.a aVar = this.f502a;
        if (aVar != null) {
            aVar.a(appLovinAdClickListener);
        }
    }

    public void setAdDisplayListener(com.applovin.sdk.AppLovinAdDisplayListener appLovinAdDisplayListener) {
        com.applovin.impl.adview.a aVar = this.f502a;
        if (aVar != null) {
            aVar.a(appLovinAdDisplayListener);
        }
    }

    public void setAdLoadListener(com.applovin.sdk.AppLovinAdLoadListener appLovinAdLoadListener) {
        com.applovin.impl.adview.a aVar = this.f502a;
        if (aVar != null) {
            aVar.a(appLovinAdLoadListener);
        }
    }

    public void setAdViewEventListener(com.applovin.adview.AppLovinAdViewEventListener appLovinAdViewEventListener) {
        com.applovin.impl.adview.a aVar = this.f502a;
        if (aVar != null) {
            aVar.a(appLovinAdViewEventListener);
        }
    }

    public void setExtraInfo(java.lang.String str, java.lang.Object obj) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("No key specified");
        }
        com.applovin.impl.adview.a aVar = this.f502a;
        if (aVar != null) {
            aVar.a(str, obj);
        }
    }

    @Override // android.view.View
    public java.lang.String toString() {
        return "AppLovinAdView{zoneId='" + getZoneId() + "\", size=" + getSize() + '}';
    }

    public AppLovinAdView(com.applovin.sdk.AppLovinAdSize appLovinAdSize, java.lang.String str, android.content.Context context) {
        super(context);
        a(appLovinAdSize, str, null, context, null);
    }

    public AppLovinAdView(com.applovin.sdk.AppLovinSdk appLovinSdk, com.applovin.sdk.AppLovinAdSize appLovinAdSize, android.content.Context context) {
        this(appLovinSdk, appLovinAdSize, null, context);
    }

    public AppLovinAdView(com.applovin.sdk.AppLovinSdk appLovinSdk, com.applovin.sdk.AppLovinAdSize appLovinAdSize, java.lang.String str, android.content.Context context) {
        super(context.getApplicationContext());
        a(appLovinAdSize, str, appLovinSdk, context, null);
    }

    public AppLovinAdView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AppLovinAdView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(null, null, null, context, attributeSet);
    }

    private void a(android.util.AttributeSet attributeSet, android.content.Context context) {
        android.util.DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int i = displayMetrics.widthPixels;
        int iApplyDimension = (int) android.util.TypedValue.applyDimension(1, 50.0f, displayMetrics);
        android.widget.TextView textView = new android.widget.TextView(context);
        textView.setBackgroundColor(android.graphics.Color.rgb(220, 220, 220));
        textView.setTextColor(androidx.core.view.ViewCompat.MEASURED_STATE_MASK);
        textView.setText("AppLovin Ad");
        textView.setGravity(17);
        addView(textView, i, iApplyDimension);
    }
}
