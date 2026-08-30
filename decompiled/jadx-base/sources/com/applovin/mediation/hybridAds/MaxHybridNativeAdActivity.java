package com.applovin.mediation.hybridAds;

/* JADX INFO: loaded from: classes3.dex */
public class MaxHybridNativeAdActivity extends com.applovin.impl.ad {
    private com.applovin.mediation.nativeAds.MaxNativeAdView f;

    class a implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.applovin.mediation.nativeAds.MaxNativeAd f1589a;

        a(com.applovin.mediation.nativeAds.MaxNativeAd maxNativeAd) {
            this.f1589a = maxNativeAd;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f1589a.prepareForInteraction(com.applovin.mediation.hybridAds.MaxHybridNativeAdActivity.this.f.getClickableViews(), com.applovin.mediation.hybridAds.MaxHybridNativeAdActivity.this.f)) {
                return;
            }
            this.f1589a.prepareViewForInteraction(com.applovin.mediation.hybridAds.MaxHybridNativeAdActivity.this.f);
        }
    }

    @Override // com.applovin.impl.ad, android.app.Activity
    protected void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        a(this.f, "MaxHybridNativeAdActivity");
    }

    public void a(com.applovin.impl.bd bdVar, com.applovin.mediation.nativeAds.MaxNativeAd maxNativeAd, com.applovin.impl.sdk.j jVar, com.applovin.mediation.adapter.listeners.MaxAdapterListener maxAdapterListener) {
        super.a(bdVar, jVar, maxAdapterListener);
        com.applovin.mediation.nativeAds.MaxNativeAdView maxNativeAdView = new com.applovin.mediation.nativeAds.MaxNativeAdView(maxNativeAd, new com.applovin.mediation.nativeAds.MaxNativeAdViewBinder.Builder(com.applovin.sdk.R.layout.max_hybrid_native_ad_view).setTitleTextViewId(com.applovin.sdk.R.id.applovin_native_title_text_view).setBodyTextViewId(com.applovin.sdk.R.id.applovin_native_body_text_view).setAdvertiserTextViewId(com.applovin.sdk.R.id.applovin_native_advertiser_text_view).setIconImageViewId(com.applovin.sdk.R.id.applovin_native_icon_image_view).setMediaContentViewGroupId(com.applovin.sdk.R.id.applovin_native_media_content_view).setOptionsContentViewGroupId(com.applovin.sdk.R.id.applovin_native_options_view).setCallToActionButtonId(com.applovin.sdk.R.id.applovin_native_cta_button).build(), this);
        this.f = maxNativeAdView;
        maxNativeAdView.renderCustomNativeAdView(maxNativeAd);
        com.applovin.mediation.hybridAds.MaxHybridNativeAdActivity.a aVar = new com.applovin.mediation.hybridAds.MaxHybridNativeAdActivity.a(maxNativeAd);
        if (maxNativeAd.shouldPrepareViewForInteractionOnMainThread()) {
            runOnUiThread(aVar);
        } else {
            jVar.i0().a((com.applovin.impl.yl) new com.applovin.impl.jn(jVar, "MaxHybridNativeAdPrepareForInteraction", aVar), com.applovin.impl.tm.b.MEDIATION);
        }
    }
}
