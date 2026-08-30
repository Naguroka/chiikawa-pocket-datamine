package com.bytedance.sdk.openadsdk.api;

/* JADX INFO: loaded from: classes4.dex */
public interface PAGLoadCallback<Ad> {
    void onAdLoaded(Ad ad);

    void onError(com.bytedance.sdk.openadsdk.api.model.PAGErrorModel pAGErrorModel);
}
