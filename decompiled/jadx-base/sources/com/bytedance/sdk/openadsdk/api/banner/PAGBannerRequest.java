package com.bytedance.sdk.openadsdk.api.banner;

/* JADX INFO: loaded from: classes4.dex */
public class PAGBannerRequest extends com.bytedance.sdk.openadsdk.api.PAGRequest {
    private com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize bg;

    public PAGBannerRequest(com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize pAGBannerSize) {
        this.bg = pAGBannerSize;
    }

    public com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize getAdSize() {
        return this.bg;
    }

    public void setAdSize(com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize pAGBannerSize) {
        this.bg = pAGBannerSize;
    }
}
