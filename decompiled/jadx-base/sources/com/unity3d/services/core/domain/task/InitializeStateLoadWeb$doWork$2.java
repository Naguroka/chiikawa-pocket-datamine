package com.unity3d.services.core.domain.task;

/* JADX INFO: compiled from: InitializeStateLoadWeb.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/unity3d/services/core/domain/task/InitializeStateLoadWeb$LoadWebResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$2", f = "InitializeStateLoadWeb.kt", i = {0, 0, 1}, l = {46, 64, 71}, m = "invokeSuspend", n = {"$this$withContext", "request", "request"}, s = {"L$0", "L$3", "L$2"})
final class InitializeStateLoadWeb$doWork$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Result<? extends com.unity3d.services.core.domain.task.InitializeStateLoadWeb.LoadWebResult>>, java.lang.Object> {
    final /* synthetic */ com.unity3d.services.core.domain.task.InitializeStateLoadWeb.Params $params;
    private /* synthetic */ java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    java.lang.Object L$3;
    int label;
    final /* synthetic */ com.unity3d.services.core.domain.task.InitializeStateLoadWeb this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InitializeStateLoadWeb$doWork$2(com.unity3d.services.core.domain.task.InitializeStateLoadWeb.Params params, com.unity3d.services.core.domain.task.InitializeStateLoadWeb initializeStateLoadWeb, kotlin.coroutines.Continuation<? super com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$2> continuation) {
        super(2, continuation);
        this.$params = params;
        this.this$0 = initializeStateLoadWeb;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$2 initializeStateLoadWeb$doWork$2 = new com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$2(this.$params, this.this$0, continuation);
        initializeStateLoadWeb$doWork$2.L$0 = obj;
        return initializeStateLoadWeb$doWork$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Result<? extends com.unity3d.services.core.domain.task.InitializeStateLoadWeb.LoadWebResult>> continuation) {
        return invoke2(coroutineScope, (kotlin.coroutines.Continuation<? super kotlin.Result<com.unity3d.services.core.domain.task.InitializeStateLoadWeb.LoadWebResult>>) continuation);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final java.lang.Object invoke2(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Result<com.unity3d.services.core.domain.task.InitializeStateLoadWeb.LoadWebResult>> continuation) {
        return ((com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:48:0x016f A[Catch: all -> 0x01f9, CancellationException -> 0x0226, TryCatch #6 {CancellationException -> 0x0226, all -> 0x01f9, blocks: (B:8:0x001a, B:51:0x0192, B:55:0x01b5, B:57:0x01bf, B:60:0x01ca, B:61:0x01dc, B:63:0x01df, B:64:0x01eb, B:46:0x0169, B:48:0x016f, B:52:0x0195, B:53:0x01a7, B:45:0x015f, B:38:0x012d, B:54:0x01a8, B:37:0x0123, B:23:0x0071, B:13:0x0039, B:43:0x0156, B:40:0x0133), top: B:80:0x000e, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x0191 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:52:0x0195 A[Catch: all -> 0x01f9, CancellationException -> 0x0226, TryCatch #6 {CancellationException -> 0x0226, all -> 0x01f9, blocks: (B:8:0x001a, B:51:0x0192, B:55:0x01b5, B:57:0x01bf, B:60:0x01ca, B:61:0x01dc, B:63:0x01df, B:64:0x01eb, B:46:0x0169, B:48:0x016f, B:52:0x0195, B:53:0x01a7, B:45:0x015f, B:38:0x012d, B:54:0x01a8, B:37:0x0123, B:23:0x0071, B:13:0x0039, B:43:0x0156, B:40:0x0133), top: B:80:0x000e, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x01df A[Catch: all -> 0x01f9, CancellationException -> 0x0226, TryCatch #6 {CancellationException -> 0x0226, all -> 0x01f9, blocks: (B:8:0x001a, B:51:0x0192, B:55:0x01b5, B:57:0x01bf, B:60:0x01ca, B:61:0x01dc, B:63:0x01df, B:64:0x01eb, B:46:0x0169, B:48:0x016f, B:52:0x0195, B:53:0x01a7, B:45:0x015f, B:38:0x012d, B:54:0x01a8, B:37:0x0123, B:23:0x0071, B:13:0x0039, B:43:0x0156, B:40:0x0133), top: B:80:0x000e, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x020a  */
    /* JADX WARN: Code duplicated, block: B:71:0x0211  */
    /* JADX WARN: Code duplicated, block: B:73:0x0217  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.unity3d.services.core.network.model.HttpRequest] */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.unity3d.services.core.domain.task.InitializeStateLoadWeb] */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object objM1301constructorimpl;
        java.lang.Object objM1301constructorimpl2;
        ?? r2;
        ?? r1;
        java.lang.Object objWithContext;
        java.lang.Throwable thM1304exceptionOrNullimpl;
        com.unity3d.services.core.domain.task.InitializeStateLoadWeb.Params params;
        java.lang.String string;
        java.lang.String webViewHash;
        com.unity3d.services.core.network.model.HttpRequest httpRequest;
        com.unity3d.services.core.network.model.HttpRequest httpRequest2;
        com.unity3d.services.core.domain.task.InitializeStateLoadWeb initializeStateLoadWeb;
        java.lang.Object objWithRetry;
        java.lang.Object objM1301constructorimpl3;
        com.unity3d.services.core.domain.task.InitializeStateLoadWeb initializeStateLoadWeb2;
        com.unity3d.services.core.network.model.HttpRequest httpRequest3;
        java.lang.Object value;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r3 = this.label;
        ?? r4 = 1;
        try {
            try {
                if (r3 == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.L$0;
                    com.unity3d.services.core.domain.task.InitializeStateLoadWeb.Params params2 = this.$params;
                    com.unity3d.services.core.domain.task.InitializeStateLoadWeb initializeStateLoadWeb3 = this.this$0;
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    com.unity3d.services.core.log.DeviceLog.info("Unity Ads init: loading webapp from " + params2.getConfig().getWebViewUrl());
                    java.lang.String webViewUrl = params2.getConfig().getWebViewUrl();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(webViewUrl, "params.config.webViewUrl");
                    com.unity3d.services.core.network.model.HttpRequest httpRequest4 = new com.unity3d.services.core.network.model.HttpRequest(webViewUrl, null, com.unity3d.services.core.network.model.RequestType.GET, null, null, null, null, null, null, 0, 0, 0, 0, false, null, null, 0, 131066, null);
                    try {
                        kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                        int maxRetries = params2.getConfig().getMaxRetries();
                        double retryScalingFactor = params2.getConfig().getRetryScalingFactor();
                        long retryDelay = params2.getConfig().getRetryDelay();
                        com.unity3d.services.core.domain.task.InitializationException initializationException = new com.unity3d.services.core.domain.task.InitializationException(com.unity3d.services.core.configuration.ErrorState.NetworkWebviewRequest, new java.lang.Exception(), params2.getConfig());
                        com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$2$1$webViewDataResult$1$1 initializeStateLoadWeb$doWork$2$1$webViewDataResult$1$1 = new com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$2$1$webViewDataResult$1$1(initializeStateLoadWeb3, httpRequest4, null);
                        this.L$0 = coroutineScope;
                        this.L$1 = params2;
                        this.L$2 = initializeStateLoadWeb3;
                        this.L$3 = httpRequest4;
                        this.label = 1;
                        httpRequest = httpRequest4;
                        try {
                            objWithRetry = com.unity3d.services.core.extensions.TaskExtensionsKt.withRetry(retryDelay, maxRetries, retryScalingFactor, initializationException, initializeStateLoadWeb$doWork$2$1$webViewDataResult$1$1, this);
                            if (objWithRetry == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            httpRequest2 = httpRequest;
                            params = params2;
                            initializeStateLoadWeb = initializeStateLoadWeb3;
                        } catch (java.lang.Throwable th) {
                            th = th;
                            httpRequest2 = httpRequest;
                            params = params2;
                            initializeStateLoadWeb = initializeStateLoadWeb3;
                            kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                            objM1301constructorimpl3 = kotlin.Result.m1301constructorimpl(kotlin.ResultKt.createFailure(th));
                            httpRequest3 = httpRequest2;
                            initializeStateLoadWeb2 = initializeStateLoadWeb;
                        }
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        httpRequest = httpRequest4;
                    }
                } else {
                    if (r3 == 1) {
                        httpRequest2 = (com.unity3d.services.core.network.model.HttpRequest) this.L$3;
                        initializeStateLoadWeb = (com.unity3d.services.core.domain.task.InitializeStateLoadWeb) this.L$2;
                        params = (com.unity3d.services.core.domain.task.InitializeStateLoadWeb.Params) this.L$1;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj);
                            objWithRetry = obj;
                            httpRequest2 = httpRequest2;
                            initializeStateLoadWeb = initializeStateLoadWeb;
                        } catch (java.lang.Throwable th3) {
                            th = th3;
                            kotlin.Result.Companion companion4 = kotlin.Result.INSTANCE;
                            objM1301constructorimpl3 = kotlin.Result.m1301constructorimpl(kotlin.ResultKt.createFailure(th));
                            httpRequest3 = httpRequest2;
                            initializeStateLoadWeb2 = initializeStateLoadWeb;
                        }
                    } else if (r3 == 2) {
                        com.unity3d.services.core.network.model.HttpRequest httpRequest5 = (com.unity3d.services.core.network.model.HttpRequest) this.L$2;
                        com.unity3d.services.core.domain.task.InitializeStateLoadWeb initializeStateLoadWeb4 = (com.unity3d.services.core.domain.task.InitializeStateLoadWeb) this.L$1;
                        params = (com.unity3d.services.core.domain.task.InitializeStateLoadWeb.Params) this.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                        value = ((kotlin.Result) obj).getValue();
                        r3 = httpRequest5;
                        r4 = initializeStateLoadWeb4;
                        r3 = httpRequest3;
                        r4 = initializeStateLoadWeb2;
                        objM1301constructorimpl2 = kotlin.Result.m1301constructorimpl(kotlin.Result.m1300boximpl(value));
                        r1 = r3;
                        r2 = r4;
                        if (kotlin.Result.m1308isSuccessimpl(objM1301constructorimpl2)) {
                            kotlinx.coroutines.CoroutineDispatcher io = ((com.unity3d.services.core.domain.task.InitializeStateLoadWeb) r2).dispatchers.getIo();
                            com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$2$1$webViewData$1 initializeStateLoadWeb$doWork$2$1$webViewData$1 = new com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$2$1$webViewData$1(r2, r1, null);
                            this.L$0 = params;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.label = 3;
                            objWithContext = kotlinx.coroutines.BuildersKt.withContext(io, initializeStateLoadWeb$doWork$2$1$webViewData$1, this);
                            if (objWithContext == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            throw new com.unity3d.services.core.domain.task.InitializationException(com.unity3d.services.core.configuration.ErrorState.NetworkWebviewRequest, new java.lang.Exception("No connected events within the timeout!"), params.getConfig());
                        }
                    } else {
                        if (r3 != 3) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.unity3d.services.core.domain.task.InitializeStateLoadWeb.Params params3 = (com.unity3d.services.core.domain.task.InitializeStateLoadWeb.Params) this.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                        params = params3;
                        objWithContext = obj;
                    }
                    string = (java.lang.String) objWithContext;
                    webViewHash = params.getConfig().getWebViewHash();
                    if (webViewHash != null && !kotlin.jvm.internal.Intrinsics.areEqual(com.unity3d.services.core.misc.Utilities.Sha256(string), webViewHash)) {
                        throw new com.unity3d.services.core.domain.task.InitializationException(com.unity3d.services.core.configuration.ErrorState.InvalidHash, new java.lang.Exception("Invalid webViewHash"), params.getConfig());
                    }
                    if (webViewHash != null) {
                        com.unity3d.services.core.misc.Utilities.writeFile(new java.io.File(com.unity3d.services.core.properties.SdkProperties.getLocalWebViewFile()), string);
                    }
                    objM1301constructorimpl = kotlin.Result.m1301constructorimpl(new com.unity3d.services.core.domain.task.InitializeStateLoadWeb.LoadWebResult(params.getConfig(), string));
                    if (kotlin.Result.m1308isSuccessimpl(objM1301constructorimpl)) {
                        kotlin.Result.Companion companion5 = kotlin.Result.INSTANCE;
                        objM1301constructorimpl = kotlin.Result.m1301constructorimpl(objM1301constructorimpl);
                    } else {
                        thM1304exceptionOrNullimpl = kotlin.Result.m1304exceptionOrNullimpl(objM1301constructorimpl);
                        if (thM1304exceptionOrNullimpl != null) {
                            kotlin.Result.Companion companion6 = kotlin.Result.INSTANCE;
                            objM1301constructorimpl = kotlin.Result.m1301constructorimpl(kotlin.ResultKt.createFailure(thM1304exceptionOrNullimpl));
                        }
                    }
                    return kotlin.Result.m1300boximpl(objM1301constructorimpl);
                }
                objM1301constructorimpl3 = kotlin.Result.m1301constructorimpl((com.unity3d.services.core.network.model.HttpResponse) objWithRetry);
                httpRequest3 = httpRequest2;
                initializeStateLoadWeb2 = initializeStateLoadWeb;
                if (kotlin.Result.m1307isFailureimpl(objM1301constructorimpl3)) {
                    kotlin.Result.Companion companion7 = kotlin.Result.INSTANCE;
                    com.unity3d.services.core.domain.task.InitializeStateNetworkError initializeStateNetworkError = initializeStateLoadWeb2.initializeStateNetworkError;
                    com.unity3d.services.core.domain.task.InitializeStateNetworkError.Params params4 = new com.unity3d.services.core.domain.task.InitializeStateNetworkError.Params(params.getConfig());
                    this.L$0 = params;
                    this.L$1 = initializeStateLoadWeb2;
                    this.L$2 = httpRequest3;
                    this.L$3 = null;
                    this.label = 2;
                    value = initializeStateNetworkError.mo1219invokegIAlus(params4, this);
                    if (value == coroutine_suspended) {
                        r3 = httpRequest3;
                        r4 = initializeStateLoadWeb2;
                        return coroutine_suspended;
                    }
                    r3 = httpRequest3;
                    r4 = initializeStateLoadWeb2;
                    objM1301constructorimpl2 = kotlin.Result.m1301constructorimpl(kotlin.Result.m1300boximpl(value));
                    r1 = r3;
                    r2 = r4;
                    if (kotlin.Result.m1308isSuccessimpl(objM1301constructorimpl2)) {
                        kotlinx.coroutines.CoroutineDispatcher io2 = ((com.unity3d.services.core.domain.task.InitializeStateLoadWeb) r2).dispatchers.getIo();
                        com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$2$1$webViewData$1 initializeStateLoadWeb$doWork$2$1$webViewData$2 = new com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$2$1$webViewData$1(r2, r1, null);
                        this.L$0 = params;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.label = 3;
                        objWithContext = kotlinx.coroutines.BuildersKt.withContext(io2, initializeStateLoadWeb$doWork$2$1$webViewData$2, this);
                        if (objWithContext == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        string = (java.lang.String) objWithContext;
                    } else {
                        throw new com.unity3d.services.core.domain.task.InitializationException(com.unity3d.services.core.configuration.ErrorState.NetworkWebviewRequest, new java.lang.Exception("No connected events within the timeout!"), params.getConfig());
                    }
                } else {
                    kotlin.ResultKt.throwOnFailure(objM1301constructorimpl3);
                    string = ((com.unity3d.services.core.network.model.HttpResponse) objM1301constructorimpl3).getBody().toString();
                }
            } catch (java.lang.Throwable th4) {
                kotlin.Result.Companion companion8 = kotlin.Result.INSTANCE;
                objM1301constructorimpl2 = kotlin.Result.m1301constructorimpl(kotlin.ResultKt.createFailure(th4));
                r1 = r3;
                r2 = r4;
            }
            webViewHash = params.getConfig().getWebViewHash();
            if (webViewHash != null) {
                throw new com.unity3d.services.core.domain.task.InitializationException(com.unity3d.services.core.configuration.ErrorState.InvalidHash, new java.lang.Exception("Invalid webViewHash"), params.getConfig());
            }
            if (webViewHash != null) {
                com.unity3d.services.core.misc.Utilities.writeFile(new java.io.File(com.unity3d.services.core.properties.SdkProperties.getLocalWebViewFile()), string);
            }
            objM1301constructorimpl = kotlin.Result.m1301constructorimpl(new com.unity3d.services.core.domain.task.InitializeStateLoadWeb.LoadWebResult(params.getConfig(), string));
        } catch (java.util.concurrent.CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th5) {
            kotlin.Result.Companion companion9 = kotlin.Result.INSTANCE;
            objM1301constructorimpl = kotlin.Result.m1301constructorimpl(kotlin.ResultKt.createFailure(th5));
        }
        if (kotlin.Result.m1308isSuccessimpl(objM1301constructorimpl)) {
            kotlin.Result.Companion companion10 = kotlin.Result.INSTANCE;
            objM1301constructorimpl = kotlin.Result.m1301constructorimpl(objM1301constructorimpl);
        } else {
            thM1304exceptionOrNullimpl = kotlin.Result.m1304exceptionOrNullimpl(objM1301constructorimpl);
            if (thM1304exceptionOrNullimpl != null) {
                kotlin.Result.Companion companion11 = kotlin.Result.INSTANCE;
                objM1301constructorimpl = kotlin.Result.m1301constructorimpl(kotlin.ResultKt.createFailure(thM1304exceptionOrNullimpl));
            }
        }
        return kotlin.Result.m1300boximpl(objM1301constructorimpl);
    }
}
