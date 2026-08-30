package com.unity3d.ads.adplayer;

/* JADX INFO: compiled from: WebViewBridge.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH&J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\nH&J;\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00102\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\n2\u0012\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0010\"\u00020\u0001H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0014J\u0019\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0017H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0018R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Lcom/unity3d/ads/adplayer/WebViewBridge;", "", "onInvocation", "Lkotlinx/coroutines/flow/SharedFlow;", "Lcom/unity3d/ads/adplayer/Invocation;", "getOnInvocation", "()Lkotlinx/coroutines/flow/SharedFlow;", "handleCallback", "", "callbackId", "", "callbackStatus", "rawParameters", "handleInvocation", com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE, "request", "", "className", "method", "params", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendEvent", androidx.core.app.NotificationCompat.CATEGORY_EVENT, "Lcom/unity3d/ads/adplayer/model/WebViewEvent;", "(Lcom/unity3d/ads/adplayer/model/WebViewEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface WebViewBridge {
    kotlinx.coroutines.flow.SharedFlow<com.unity3d.ads.adplayer.Invocation> getOnInvocation();

    void handleCallback(java.lang.String callbackId, java.lang.String callbackStatus, java.lang.String rawParameters);

    void handleInvocation(java.lang.String message);

    java.lang.Object request(java.lang.String str, java.lang.String str2, java.lang.Object[] objArr, kotlin.coroutines.Continuation<? super java.lang.Object[]> continuation);

    java.lang.Object sendEvent(com.unity3d.ads.adplayer.model.WebViewEvent webViewEvent, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}
