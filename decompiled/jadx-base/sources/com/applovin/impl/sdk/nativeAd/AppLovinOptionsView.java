package com.applovin.impl.sdk.nativeAd;

/* JADX INFO: loaded from: classes3.dex */
public class AppLovinOptionsView extends android.widget.FrameLayout implements android.view.View.OnClickListener {
    private final android.net.Uri privacyDestinationUri;
    private final com.applovin.impl.sdk.j sdk;

    public AppLovinOptionsView(com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl appLovinNativeAdImpl, com.applovin.impl.sdk.j jVar, android.content.Context context) {
        super(context);
        this.sdk = jVar;
        this.privacyDestinationUri = appLovinNativeAdImpl.getPrivacyDestinationUri();
        android.widget.ImageView imageView = new android.widget.ImageView(getContext());
        imageView.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        android.net.Uri privacyIconUri = appLovinNativeAdImpl.getPrivacyIconUri();
        if (privacyIconUri != null) {
            com.applovin.impl.sdk.utils.ImageViewUtils.setImageUri(imageView, privacyIconUri, jVar);
        } else {
            imageView.setImageResource(com.applovin.sdk.R.drawable.applovin_ic_privacy_icon_layered_list);
        }
        addView(imageView);
        setOnClickListener(this);
    }

    public void destroy() {
        setOnClickListener(null);
        removeAllViews();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.applovin.impl.tp.a(this.privacyDestinationUri, com.applovin.impl.sdk.j.m(), this.sdk);
    }
}
