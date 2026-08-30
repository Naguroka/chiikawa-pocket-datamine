package com.bytedance.sdk.openadsdk.api;

/* JADX INFO: loaded from: classes4.dex */
public interface PAGLoadListener<Ad> extends com.bytedance.sdk.openadsdk.common.ldr {
    void onAdLoaded(Ad ad);

    @Override // com.bytedance.sdk.openadsdk.common.ldr
    void onError(int i, java.lang.String str);
}
