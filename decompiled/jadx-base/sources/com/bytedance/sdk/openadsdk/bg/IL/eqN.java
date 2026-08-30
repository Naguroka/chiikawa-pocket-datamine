package com.bytedance.sdk.openadsdk.bg.IL;

/* JADX INFO: loaded from: classes4.dex */
public class eqN implements com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData {
    private final com.bytedance.sdk.openadsdk.bg.IL.bg bg;

    public eqN(com.bytedance.sdk.openadsdk.bg.IL.bg bgVar) {
        this.bg = bgVar;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public com.bytedance.sdk.openadsdk.api.nativeAd.PAGImageItem getIcon() {
        com.bytedance.sdk.openadsdk.bg.IL.bg bgVar = this.bg;
        if (bgVar != null) {
            return bgVar.bX();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public java.lang.String getTitle() {
        com.bytedance.sdk.openadsdk.bg.IL.bg bgVar = this.bg;
        if (bgVar != null) {
            return bgVar.eqN();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public java.lang.String getDescription() {
        com.bytedance.sdk.openadsdk.bg.IL.bg bgVar = this.bg;
        if (bgVar != null) {
            return bgVar.zx();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public java.lang.String getButtonText() {
        com.bytedance.sdk.openadsdk.bg.IL.bg bgVar = this.bg;
        if (bgVar != null) {
            return bgVar.ldr();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView getMediaView() {
        com.bytedance.sdk.openadsdk.bg.IL.bg bgVar = this.bg;
        if (bgVar != null) {
            return bgVar.iR();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public android.view.View getAdLogoView() {
        com.bytedance.sdk.openadsdk.bg.IL.bg bgVar = this.bg;
        if (bgVar != null) {
            return bgVar.eo();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData.PAGNativeMediaType getMediaType() {
        if (com.bytedance.sdk.openadsdk.core.model.tuV.zx(this.bg.bg)) {
            return com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData.PAGNativeMediaType.PAGNativeMediaTypeVideo;
        }
        return com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData.PAGNativeMediaType.PAGNativeMediaTypeImage;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public android.view.View getAdChoicesView() {
        com.bytedance.sdk.openadsdk.bg.IL.bg bgVar = this.bg;
        if (bgVar != null) {
            return bgVar.VB();
        }
        return null;
    }
}
