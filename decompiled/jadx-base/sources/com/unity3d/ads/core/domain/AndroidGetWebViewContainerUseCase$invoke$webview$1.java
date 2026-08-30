package com.unity3d.ads.core.domain;

/* JADX INFO: compiled from: AndroidGetWebViewContainerUseCase.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Landroid/webkit/WebView;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase$invoke$webview$1", f = "AndroidGetWebViewContainerUseCase.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
final class AndroidGetWebViewContainerUseCase$invoke$webview$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super android.webkit.WebView>, java.lang.Object> {
    int label;
    final /* synthetic */ com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidGetWebViewContainerUseCase$invoke$webview$1(com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase androidGetWebViewContainerUseCase, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase$invoke$webview$1> continuation) {
        super(2, continuation);
        this.this$0 = androidGetWebViewContainerUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase$invoke$webview$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super android.webkit.WebView> continuation) {
        return ((com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase$invoke$webview$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        android.webkit.WebView webView = new android.webkit.WebView(this.this$0.context);
        com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase androidGetWebViewContainerUseCase = this.this$0;
        android.webkit.WebSettings settings = webView.getSettings();
        settings.setAllowFileAccess(false);
        settings.setBlockNetworkImage(false);
        settings.setBlockNetworkLoads(false);
        settings.setBuiltInZoomControls(false);
        settings.setCacheMode(-1);
        settings.setDatabaseEnabled(false);
        settings.setDisplayZoomControls(false);
        settings.setDomStorageEnabled(false);
        settings.setGeolocationEnabled(false);
        settings.setJavaScriptCanOpenWindowsAutomatically(false);
        settings.setJavaScriptEnabled(true);
        settings.setLoadWithOverviewMode(false);
        settings.setLoadsImagesAutomatically(true);
        settings.setMediaPlaybackRequiresUserGesture(false);
        settings.setMixedContentMode(1);
        settings.setNeedInitialFocus(true);
        settings.setSupportMultipleWindows(false);
        settings.setSupportZoom(false);
        settings.setUseWideViewPort(true);
        settings.setMediaPlaybackRequiresUserGesture(false);
        webView.setWebViewClient(androidGetWebViewContainerUseCase.androidWebViewClient);
        webView.setHorizontalScrollBarEnabled(false);
        webView.setVerticalScrollBarEnabled(false);
        webView.setInitialScale(0);
        webView.setBackgroundColor(0);
        webView.setBackgroundResource(0);
        return webView;
    }
}
