package com.unity3d.services.core.network.core;

/* JADX INFO: compiled from: CronetEngineBuilderFactory.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/unity3d/services/core/network/core/CronetEngineBuilderFactory;", "", "()V", "createCronetEngineBuilder", "Lorg/chromium/net/CronetEngine$Builder;", "context", "Landroid/content/Context;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CronetEngineBuilderFactory {
    public final org.chromium.net.CronetEngine.Builder createCronetEngineBuilder(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        return new org.chromium.net.CronetEngine.Builder(context);
    }
}
