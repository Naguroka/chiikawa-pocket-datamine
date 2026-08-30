package com.unity3d.ads.core.utils;

/* JADX INFO: compiled from: ContinuationFromCallback.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J3\u0010\u0006\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\b2\u0016\u0010\t\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00040\n\"\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0002\u0010\u000bJ&\u0010\f\u001a\u00020\u00072\u0016\u0010\t\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00040\n\"\u0004\u0018\u00010\u0004H\u0096\u0002¢\u0006\u0002\u0010\rR\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/unity3d/ads/core/utils/ContinuationFromCallback;", "Lcom/unity3d/services/core/webview/bridge/WebViewCallback;", "continuation", "Lkotlin/coroutines/Continuation;", "", "(Lkotlin/coroutines/Continuation;)V", "error", "", "", "params", "", "(Ljava/lang/Enum;[Ljava/lang/Object;)V", "invoke", "([Ljava/lang/Object;)V", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ContinuationFromCallback extends com.unity3d.services.core.webview.bridge.WebViewCallback {
    private final kotlin.coroutines.Continuation<java.lang.Object> continuation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContinuationFromCallback(kotlin.coroutines.Continuation<java.lang.Object> continuation) {
        super("", 0);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(continuation, "continuation");
        this.continuation = continuation;
    }

    @Override // com.unity3d.services.core.webview.bridge.WebViewCallback
    public void invoke(java.lang.Object... params) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(params, "params");
        kotlin.coroutines.Continuation<java.lang.Object> continuation = this.continuation;
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        continuation.resumeWith(kotlin.Result.m1301constructorimpl(params));
    }

    @Override // com.unity3d.services.core.webview.bridge.WebViewCallback
    public void error(java.lang.Enum<?> error, java.lang.Object... params) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(params, "params");
        kotlin.coroutines.Continuation<java.lang.Object> continuation = this.continuation;
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        continuation.resumeWith(kotlin.Result.m1301constructorimpl(kotlin.ResultKt.createFailure(new com.unity3d.ads.core.data.model.exception.ExposureException("Invocation failed with: " + error, params))));
    }
}
