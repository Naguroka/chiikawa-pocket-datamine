package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J4\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u000bH\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\bH\u0016J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\bH\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¨\u0006\u0014"}, d2 = {"Lcom/ironsource/nn;", "Lcom/ironsource/mn;", "Lcom/ironsource/jo;", "onNetworkSDKInitListener", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Landroid/content/Context;", "applicationContext", "", com.ironsource.y8.i.g, "userId", "", "initParams", "controllerConfig", "controllerUrl", "b", "", "debugMode", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class nn implements com.json.mn {
    @Override // com.json.mn
    public void a(int debugMode) {
        com.json.sdk.utils.SDKUtils.setDebugMode(debugMode);
    }

    @Override // com.json.mn
    public void a(android.content.Context applicationContext, java.lang.String applicationKey, java.lang.String userId, java.util.Map<java.lang.String, java.lang.String> initParams) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationKey, "applicationKey");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userId, "userId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initParams, "initParams");
        com.json.sdk.IronSourceNetwork.initSDK(applicationContext, applicationKey, userId, initParams);
    }

    @Override // com.json.mn
    public void a(com.json.jo onNetworkSDKInitListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onNetworkSDKInitListener, "onNetworkSDKInitListener");
        com.json.sdk.IronSourceNetwork.addInitListener(onNetworkSDKInitListener);
    }

    @Override // com.json.mn
    public void a(java.lang.String controllerConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(controllerConfig, "controllerConfig");
        com.json.sdk.utils.SDKUtils.setControllerConfig(controllerConfig);
    }

    @Override // com.json.mn
    public void b(java.lang.String controllerUrl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(controllerUrl, "controllerUrl");
        com.json.sdk.utils.SDKUtils.setControllerUrl(controllerUrl);
    }
}
