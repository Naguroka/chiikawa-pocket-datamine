package com.bytedance.sdk.openadsdk.api.banner;

/* JADX INFO: loaded from: classes4.dex */
public final class PAGBannerSize {
    private final int IL;
    private final int bg;
    public static final com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize BANNER_W_320_H_50 = new com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize(320, 50);
    public static final com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize BANNER_W_300_H_250 = new com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize(com.google.android.gms.nearby.messages.Strategy.TTL_SECONDS_DEFAULT, 250);
    public static final com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize BANNER_W_728_H_90 = new com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize(728, 90);

    public PAGBannerSize(int i, int i2) {
        this.bg = i;
        this.IL = i2;
    }

    public int getWidth() {
        return this.bg;
    }

    public int getHeight() {
        return this.IL;
    }
}
