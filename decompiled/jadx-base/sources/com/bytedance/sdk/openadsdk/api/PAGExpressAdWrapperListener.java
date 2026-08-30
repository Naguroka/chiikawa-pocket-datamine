package com.bytedance.sdk.openadsdk.api;

/* JADX INFO: loaded from: classes4.dex */
public interface PAGExpressAdWrapperListener extends com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener {
    void onAdDismissed();

    void onAdShow(android.view.View view, int i);

    void onRenderFail(android.view.View view, java.lang.String str, int i);

    void onRenderSuccess(android.view.View view, float f, float f2);
}
