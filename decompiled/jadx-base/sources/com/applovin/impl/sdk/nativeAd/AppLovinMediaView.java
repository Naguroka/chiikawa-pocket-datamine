package com.applovin.impl.sdk.nativeAd;

/* JADX INFO: loaded from: classes3.dex */
public class AppLovinMediaView extends android.widget.FrameLayout {
    protected final android.widget.ImageView imageView;
    protected final com.applovin.impl.sdk.n logger;
    protected final com.applovin.impl.sdk.j sdk;

    public AppLovinMediaView(com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl appLovinNativeAdImpl, com.applovin.impl.sdk.j jVar, android.content.Context context) {
        super(context);
        setBackgroundColor(androidx.core.view.ViewCompat.MEASURED_STATE_MASK);
        this.sdk = jVar;
        this.logger = jVar.I();
        android.view.LayoutInflater.from(context).inflate(com.applovin.sdk.R.layout.applovin_native_ad_media_view, (android.view.ViewGroup) this, true);
        android.net.Uri mainImageUri = appLovinNativeAdImpl.getMainImageUri();
        com.applovin.impl.aq vastAd = appLovinNativeAdImpl.getVastAd();
        android.net.Uri uriU0 = vastAd != null ? vastAd.u0() : null;
        if (mainImageUri == null && uriU0 == null) {
            throw new java.lang.IllegalStateException("AppLovin native ad missing image AND video resources");
        }
        android.os.StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = android.os.StrictMode.allowThreadDiskReads();
        if (((java.lang.Boolean) jVar.a(com.applovin.impl.sj.I2)).booleanValue()) {
            setOnTouchListener(new com.applovin.impl.adview.AppLovinTouchToClickListener(jVar, com.applovin.impl.sj.m0, context, appLovinNativeAdImpl));
        } else {
            setOnClickListener(appLovinNativeAdImpl);
        }
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.applovin.sdk.R.id.image_view);
        this.imageView = imageView;
        if (mainImageUri != null) {
            com.applovin.impl.sdk.utils.ImageViewUtils.setAndDownscaleImageUri(imageView, mainImageUri);
        }
        android.os.StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
    }

    public void destroy() {
        setOnClickListener(null);
        setOnTouchListener(null);
        removeAllViews();
    }
}
