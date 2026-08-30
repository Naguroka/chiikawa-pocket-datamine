package com.json.adapters.ironsource.nativeAd;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0003J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR(\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/ironsource/adapters/ironsource/nativeAd/IronSourceNativeAdViewBinder;", "Lcom/ironsource/mediationsdk/adunit/adapter/internal/nativead/AdapterNativeAdViewBinder;", "Landroid/widget/FrameLayout$LayoutParams;", "getPrivacyIconLayoutParams", "Landroid/view/View;", "nativeAdView", "", "setNativeAdView", "Lcom/ironsource/oh;", "nativeAd", "Lcom/ironsource/oh;", "Lcom/ironsource/mediationsdk/adunit/adapter/utility/NativeAdProperties;", "nativeAdProperties", "Lcom/ironsource/mediationsdk/adunit/adapter/utility/NativeAdProperties;", "Lcom/ironsource/lh;", "<set-?>", "networkNativeAdView", "Lcom/ironsource/lh;", "getNetworkNativeAdView", "()Lcom/ironsource/lh;", "<init>", "(Lcom/ironsource/oh;Lcom/ironsource/mediationsdk/adunit/adapter/utility/NativeAdProperties;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class IronSourceNativeAdViewBinder extends com.json.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder {
    private final com.json.oh nativeAd;
    private final com.json.mediationsdk.adunit.adapter.utility.NativeAdProperties nativeAdProperties;
    private com.json.lh networkNativeAdView;

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.json.mediationsdk.adunit.adapter.utility.AdOptionsPosition.values().length];
            try {
                iArr[com.json.mediationsdk.adunit.adapter.utility.AdOptionsPosition.TOP_LEFT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.json.mediationsdk.adunit.adapter.utility.AdOptionsPosition.TOP_RIGHT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.json.mediationsdk.adunit.adapter.utility.AdOptionsPosition.BOTTOM_LEFT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.json.mediationsdk.adunit.adapter.utility.AdOptionsPosition.BOTTOM_RIGHT.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public IronSourceNativeAdViewBinder(com.json.oh nativeAd, com.json.mediationsdk.adunit.adapter.utility.NativeAdProperties nativeAdProperties) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nativeAd, "nativeAd");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nativeAdProperties, "nativeAdProperties");
        this.nativeAd = nativeAd;
        this.nativeAdProperties = nativeAdProperties;
    }

    private final android.widget.FrameLayout.LayoutParams getPrivacyIconLayoutParams() {
        int i;
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -2);
        int i2 = com.ironsource.adapters.ironsource.nativeAd.IronSourceNativeAdViewBinder.WhenMappings.$EnumSwitchMapping$0[this.nativeAdProperties.getAdOptionsPosition().ordinal()];
        if (i2 == 1) {
            i = 51;
        } else if (i2 == 2) {
            i = 53;
        } else if (i2 == 3) {
            i = 83;
        } else {
            if (i2 != 4) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            i = 85;
        }
        layoutParams.gravity = i;
        return layoutParams;
    }

    @Override // com.json.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinderInterface
    public com.json.lh getNetworkNativeAdView() {
        return this.networkNativeAdView;
    }

    @Override // com.json.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinderInterface
    public void setNativeAdView(android.view.View nativeAdView) {
        if (nativeAdView == null) {
            com.json.mediationsdk.logger.IronLog.INTERNAL.error("nativeAdView is null");
            return;
        }
        if (this.nativeAd.b() == null) {
            com.json.mediationsdk.logger.IronLog.INTERNAL.error("nativeAd.adData is null");
            return;
        }
        com.json.mediationsdk.ads.nativead.LevelPlayMediaView mediaView = getNativeAdViewHolder().getMediaView();
        if (mediaView != null) {
            com.json.mh mhVarB = this.nativeAd.b();
            kotlin.jvm.internal.Intrinsics.checkNotNull(mhVarB);
            android.webkit.WebView webViewL = mhVarB.l();
            if (webViewL != null) {
                mediaView.addView(webViewL, new android.view.ViewGroup.LayoutParams(-1, -1));
            }
        }
        com.json.mh mhVarB2 = this.nativeAd.b();
        kotlin.jvm.internal.Intrinsics.checkNotNull(mhVarB2);
        android.view.View viewM = mhVarB2.m();
        viewM.setId(com.json.sdk.mediation.R.id.privacy_icon_button);
        viewM.setLayoutParams(getPrivacyIconLayoutParams());
        android.content.Context context = nativeAdView.getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "context");
        com.json.lh lhVar = new com.json.lh(context);
        lhVar.addView(nativeAdView);
        lhVar.addView(viewM);
        this.networkNativeAdView = lhVar;
        com.json.lh networkNativeAdView = getNetworkNativeAdView();
        kotlin.jvm.internal.Intrinsics.checkNotNull(networkNativeAdView);
        this.nativeAd.a(new com.json.ph(networkNativeAdView, getNativeAdViewHolder().getTitleView(), getNativeAdViewHolder().getAdvertiserView(), getNativeAdViewHolder().getIconView(), getNativeAdViewHolder().getBodyView(), getNativeAdViewHolder().getMediaView(), getNativeAdViewHolder().getCallToActionView(), viewM));
    }
}
