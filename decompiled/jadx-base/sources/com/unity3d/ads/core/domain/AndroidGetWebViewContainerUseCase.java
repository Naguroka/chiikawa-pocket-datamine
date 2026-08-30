package com.unity3d.ads.core.domain;

/* JADX INFO: compiled from: AndroidGetWebViewContainerUseCase.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0002\u0010\u000bJ\u0019\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0097Bø\u0001\u0000¢\u0006\u0002\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidGetWebViewContainerUseCase;", "Lcom/unity3d/ads/core/domain/GetWebViewContainerUseCase;", "context", "Landroid/content/Context;", "androidWebViewClient", "Lcom/unity3d/ads/adplayer/AndroidWebViewClient;", "sendWebViewClientErrorDiagnostics", "Lcom/unity3d/ads/core/domain/SendWebViewClientErrorDiagnostics;", "mainDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "defaultDispatcher", "(Landroid/content/Context;Lcom/unity3d/ads/adplayer/AndroidWebViewClient;Lcom/unity3d/ads/core/domain/SendWebViewClientErrorDiagnostics;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;)V", "invoke", "Lcom/unity3d/ads/adplayer/AndroidWebViewContainer;", "adPlayerScope", "Lkotlinx/coroutines/CoroutineScope;", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidGetWebViewContainerUseCase implements com.unity3d.ads.core.domain.GetWebViewContainerUseCase {
    private final com.unity3d.ads.adplayer.AndroidWebViewClient androidWebViewClient;
    private final android.content.Context context;
    private final kotlinx.coroutines.CoroutineDispatcher defaultDispatcher;
    private final kotlinx.coroutines.CoroutineDispatcher mainDispatcher;
    private final com.unity3d.ads.core.domain.SendWebViewClientErrorDiagnostics sendWebViewClientErrorDiagnostics;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidGetWebViewContainerUseCase.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase", f = "AndroidGetWebViewContainerUseCase.kt", i = {0, 0}, l = {24}, m = "invoke", n = {"this", "adPlayerScope"}, s = {"L$0", "L$1"})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        int label;
        /* synthetic */ java.lang.Object result;

        AnonymousClass1(kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase.AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase.this.invoke(null, this);
        }
    }

    public AndroidGetWebViewContainerUseCase(android.content.Context context, com.unity3d.ads.adplayer.AndroidWebViewClient androidWebViewClient, com.unity3d.ads.core.domain.SendWebViewClientErrorDiagnostics sendWebViewClientErrorDiagnostics, kotlinx.coroutines.CoroutineDispatcher mainDispatcher, kotlinx.coroutines.CoroutineDispatcher defaultDispatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(androidWebViewClient, "androidWebViewClient");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sendWebViewClientErrorDiagnostics, "sendWebViewClientErrorDiagnostics");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mainDispatcher, "mainDispatcher");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultDispatcher, "defaultDispatcher");
        this.context = context;
        this.androidWebViewClient = androidWebViewClient;
        this.sendWebViewClientErrorDiagnostics = sendWebViewClientErrorDiagnostics;
        this.mainDispatcher = mainDispatcher;
        this.defaultDispatcher = defaultDispatcher;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // com.unity3d.ads.core.domain.GetWebViewContainerUseCase
    public java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.unity3d.ads.adplayer.AndroidWebViewContainer> continuation) throws java.lang.Throwable {
        com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase.AnonymousClass1 anonymousClass1;
        com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase androidGetWebViewContainerUseCase;
        if (continuation instanceof com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase.AnonymousClass1) {
            anonymousClass1 = (com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase.AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase.AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase.AnonymousClass1(continuation);
        }
        java.lang.Object objWithContext = anonymousClass1.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(objWithContext);
            kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher = this.mainDispatcher;
            com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase$invoke$webview$1 androidGetWebViewContainerUseCase$invoke$webview$1 = new com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase$invoke$webview$1(this, null);
            anonymousClass1.L$0 = this;
            anonymousClass1.L$1 = coroutineScope;
            anonymousClass1.label = 1;
            objWithContext = kotlinx.coroutines.BuildersKt.withContext(coroutineDispatcher, androidGetWebViewContainerUseCase$invoke$webview$1, anonymousClass1);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
            androidGetWebViewContainerUseCase = this;
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            coroutineScope = (kotlinx.coroutines.CoroutineScope) anonymousClass1.L$1;
            androidGetWebViewContainerUseCase = (com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase) anonymousClass1.L$0;
            kotlin.ResultKt.throwOnFailure(objWithContext);
        }
        return new com.unity3d.ads.adplayer.AndroidWebViewContainer((android.webkit.WebView) objWithContext, androidGetWebViewContainerUseCase.androidWebViewClient, androidGetWebViewContainerUseCase.sendWebViewClientErrorDiagnostics, androidGetWebViewContainerUseCase.mainDispatcher, androidGetWebViewContainerUseCase.defaultDispatcher, coroutineScope);
    }
}
