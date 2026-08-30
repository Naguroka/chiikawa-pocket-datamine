package com.unity3d.services.core.network.core;

/* JADX INFO: compiled from: CronetClient.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0019\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\rJ\u0010\u0010\u000e\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J\u0006\u0010\u0016\u001a\u00020\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Lcom/unity3d/services/core/network/core/CronetClient;", "Lcom/unity3d/services/core/network/core/HttpClient;", "engine", "Lorg/chromium/net/CronetEngine;", "dispatchers", "Lcom/unity3d/services/core/domain/ISDKDispatchers;", "(Lorg/chromium/net/CronetEngine;Lcom/unity3d/services/core/domain/ISDKDispatchers;)V", "buildUrl", "", "request", "Lcom/unity3d/services/core/network/model/HttpRequest;", "execute", "Lcom/unity3d/services/core/network/model/HttpResponse;", "(Lcom/unity3d/services/core/network/model/HttpRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "executeBlocking", "getContentSize", "", "info", "Lorg/chromium/net/UrlResponseInfo;", "getPriority", "", com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, "shutdown", "", "Companion", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CronetClient implements com.unity3d.services.core.network.core.HttpClient {
    private static final java.lang.String MSG_CONNECTION_FAILED = "Network request failed";
    private static final java.lang.String MSG_CONNECTION_TIMEOUT = "Network request timed out";
    private static final java.lang.String NETWORK_CLIENT_CRONET = "cronet";
    private final com.unity3d.services.core.domain.ISDKDispatchers dispatchers;
    private final org.chromium.net.CronetEngine engine;

    /* JADX INFO: Access modifiers changed from: private */
    public final int getPriority(int priority) {
        if (priority == 0) {
            return 4;
        }
        if (priority != 1) {
            return priority != 2 ? 1 : 2;
        }
        return 3;
    }

    public CronetClient(org.chromium.net.CronetEngine engine, com.unity3d.services.core.domain.ISDKDispatchers dispatchers) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(engine, "engine");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        this.engine = engine;
        this.dispatchers = dispatchers;
    }

    public final void shutdown() {
        this.engine.shutdown();
    }

    /* JADX INFO: renamed from: com.unity3d.services.core.network.core.CronetClient$executeBlocking$1, reason: invalid class name */
    /* JADX INFO: compiled from: CronetClient.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/unity3d/services/core/network/model/HttpResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.services.core.network.core.CronetClient$executeBlocking$1", f = "CronetClient.kt", i = {}, l = {30}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.unity3d.services.core.network.model.HttpResponse>, java.lang.Object> {
        final /* synthetic */ com.unity3d.services.core.network.model.HttpRequest $request;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(com.unity3d.services.core.network.model.HttpRequest httpRequest, kotlin.coroutines.Continuation<? super com.unity3d.services.core.network.core.CronetClient.AnonymousClass1> continuation) {
            super(2, continuation);
            this.$request = httpRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.unity3d.services.core.network.core.CronetClient.this.new AnonymousClass1(this.$request, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.unity3d.services.core.network.model.HttpResponse> continuation) {
            return ((com.unity3d.services.core.network.core.CronetClient.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                this.label = 1;
                obj = com.unity3d.services.core.network.core.CronetClient.this.execute(this.$request, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    @Override // com.unity3d.services.core.network.core.HttpClient
    public com.unity3d.services.core.network.model.HttpResponse executeBlocking(com.unity3d.services.core.network.model.HttpRequest request) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "request");
        return (com.unity3d.services.core.network.model.HttpResponse) kotlinx.coroutines.BuildersKt.runBlocking(this.dispatchers.getIo(), new com.unity3d.services.core.network.core.CronetClient.AnonymousClass1(request, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.String buildUrl(com.unity3d.services.core.network.model.HttpRequest request) {
        return kotlin.text.StringsKt.removeSuffix(kotlin.text.StringsKt.trim(request.getBaseURL(), '/') + '/' + kotlin.text.StringsKt.trim(request.getPath(), '/'), (java.lang.CharSequence) "/");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long getContentSize(org.chromium.net.UrlResponseInfo info) {
        java.lang.String str;
        java.lang.Long longOrNull;
        java.util.List<java.lang.String> list = info.getAllHeaders().get(com.google.common.net.HttpHeaders.CONTENT_LENGTH);
        if (list == null || (str = list.get(0)) == null || (longOrNull = kotlin.text.StringsKt.toLongOrNull(str)) == null) {
            return -1L;
        }
        return longOrNull.longValue();
    }

    @Override // com.unity3d.services.core.network.core.HttpClient
    public java.lang.Object execute(com.unity3d.services.core.network.model.HttpRequest httpRequest, kotlin.coroutines.Continuation<? super com.unity3d.services.core.network.model.HttpResponse> continuation) {
        byte[] bytes;
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        final com.unity3d.services.core.domain.ISDKDispatchers iSDKDispatchers = this.dispatchers;
        final long readTimeout = httpRequest.getReadTimeout();
        final java.io.File downloadDestination = httpRequest.getDownloadDestination();
        com.unity3d.services.core.network.core.UnityAdsUrlRequestCallback unityAdsUrlRequestCallback = new com.unity3d.services.core.network.core.UnityAdsUrlRequestCallback(iSDKDispatchers, readTimeout, downloadDestination) { // from class: com.unity3d.services.core.network.core.CronetClient$execute$2$callback$1
            @Override // com.unity3d.services.core.network.core.UnityAdsUrlRequestCallback
            public void onSucceeded(org.chromium.net.UrlRequest request, org.chromium.net.UrlResponseInfo info, byte[] bodyBytes) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "request");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(info, "info");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bodyBytes, "bodyBytes");
                kotlinx.coroutines.CancellableContinuation<com.unity3d.services.core.network.model.HttpResponse> cancellableContinuation = cancellableContinuationImpl2;
                int httpStatusCode = info.getHttpStatusCode();
                java.util.Map<java.lang.String, java.util.List<java.lang.String>> allHeaders = info.getAllHeaders();
                java.lang.String url = info.getUrl();
                java.lang.String negotiatedProtocol = info.getNegotiatedProtocol();
                long contentSize = this.getContentSize(info);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(allHeaders, "allHeaders");
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(url, "url");
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(negotiatedProtocol, "negotiatedProtocol");
                com.unity3d.services.core.network.model.HttpResponse httpResponse = new com.unity3d.services.core.network.model.HttpResponse(bodyBytes, httpStatusCode, allHeaders, url, negotiatedProtocol, "cronet", contentSize);
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                cancellableContinuation.resumeWith(kotlin.Result.m1301constructorimpl(httpResponse));
            }

            @Override // com.unity3d.services.core.network.core.UnityAdsUrlRequestCallback, org.chromium.net.UrlRequest.Callback
            public void onFailed(org.chromium.net.UrlRequest request, org.chromium.net.UrlResponseInfo info, org.chromium.net.CronetException error) {
                super.onFailed(request, info, error);
                org.chromium.net.NetworkException networkException = error instanceof org.chromium.net.NetworkException ? (org.chromium.net.NetworkException) error : null;
                com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException unityAdsNetworkException = new com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException(com.unity3d.services.core.network.core.OkHttp3Client.MSG_CONNECTION_FAILED, null, info != null ? java.lang.Integer.valueOf(info.getHttpStatusCode()) : null, info != null ? info.getUrl() : null, info != null ? info.getNegotiatedProtocol() : null, networkException != null ? java.lang.Integer.valueOf(networkException.getCronetInternalErrorCode()) : null, "cronet", 2, null);
                kotlinx.coroutines.CancellableContinuation<com.unity3d.services.core.network.model.HttpResponse> cancellableContinuation = cancellableContinuationImpl2;
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                cancellableContinuation.resumeWith(kotlin.Result.m1301constructorimpl(kotlin.ResultKt.createFailure(unityAdsNetworkException)));
            }

            @Override // com.unity3d.services.core.network.core.UnityAdsUrlRequestCallback, org.chromium.net.UrlRequest.Callback
            public void onCanceled(org.chromium.net.UrlRequest request, org.chromium.net.UrlResponseInfo info) {
                super.onCanceled(request, info);
                com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException unityAdsNetworkException = new com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException("Network request timed out", null, null, info != null ? info.getUrl() : null, info != null ? info.getNegotiatedProtocol() : null, null, "cronet", 38, null);
                kotlinx.coroutines.CancellableContinuation<com.unity3d.services.core.network.model.HttpResponse> cancellableContinuation = cancellableContinuationImpl2;
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                cancellableContinuation.resumeWith(kotlin.Result.m1301constructorimpl(kotlin.ResultKt.createFailure(unityAdsNetworkException)));
            }
        };
        org.chromium.net.UrlRequest.Builder builderNewUrlRequestBuilder = this.engine.newUrlRequestBuilder(buildUrl(httpRequest), unityAdsUrlRequestCallback, kotlinx.coroutines.ExecutorsKt.asExecutor(this.dispatchers.getIo()));
        for (java.util.Map.Entry<java.lang.String, java.util.List<java.lang.String>> entry : httpRequest.getHeaders().entrySet()) {
            java.lang.String key = entry.getKey();
            java.util.Iterator<T> it = entry.getValue().iterator();
            while (it.hasNext()) {
                builderNewUrlRequestBuilder.addHeader(key, (java.lang.String) it.next());
            }
        }
        if (httpRequest.getMethod() == com.unity3d.services.core.network.model.RequestType.POST) {
            java.lang.Object body = httpRequest.getBody();
            if (body instanceof byte[]) {
                bytes = (byte[]) httpRequest.getBody();
            } else if (body instanceof java.lang.String) {
                bytes = ((java.lang.String) httpRequest.getBody()).getBytes(kotlin.text.Charsets.ISO_8859_1);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            } else {
                bytes = new byte[0];
            }
            builderNewUrlRequestBuilder.setUploadDataProvider(org.chromium.net.UploadDataProviders.create(bytes), kotlinx.coroutines.ExecutorsKt.asExecutor(this.dispatchers.getIo()));
        }
        final org.chromium.net.UrlRequest req = builderNewUrlRequestBuilder.setHttpMethod(httpRequest.getMethod().toString()).setPriority(getPriority(httpRequest.getPriority())).build();
        cancellableContinuationImpl2.invokeOnCancellation(new kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>() { // from class: com.unity3d.services.core.network.core.CronetClient$execute$2$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Throwable th) {
                invoke2(th);
                return kotlin.Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(java.lang.Throwable th) {
                req.cancel();
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(req, "req");
        unityAdsUrlRequestCallback.startTimer(req);
        req.start();
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }
}
