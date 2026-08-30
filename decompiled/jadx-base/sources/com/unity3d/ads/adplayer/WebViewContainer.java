package com.unity3d.ads.adplayer;

/* JADX INFO: compiled from: WebViewContainer.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH¦@ø\u0001\u0000¢\u0006\u0002\u0010\rJ\u0011\u0010\u000e\u001a\u00020\bH¦@ø\u0001\u0000¢\u0006\u0002\u0010\u000fJ\u0019\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\fH¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0012J\u0019\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\fH¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0012R\u001a\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Lcom/unity3d/ads/adplayer/WebViewContainer;", "", "lastInputEvent", "Lkotlinx/coroutines/flow/StateFlow;", "Landroid/view/InputEvent;", "getLastInputEvent", "()Lkotlinx/coroutines/flow/StateFlow;", "addJavascriptInterface", "", "webViewBridgeInterface", "Lcom/unity3d/ads/adplayer/WebViewBridge;", "name", "", "(Lcom/unity3d/ads/adplayer/WebViewBridge;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "destroy", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "evaluateJavascript", "script", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadUrl", "url", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface WebViewContainer {
    java.lang.Object addJavascriptInterface(com.unity3d.ads.adplayer.WebViewBridge webViewBridge, java.lang.String str, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    java.lang.Object destroy(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    java.lang.Object evaluateJavascript(java.lang.String str, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    kotlinx.coroutines.flow.StateFlow<android.view.InputEvent> getLastInputEvent();

    java.lang.Object loadUrl(java.lang.String str, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}
