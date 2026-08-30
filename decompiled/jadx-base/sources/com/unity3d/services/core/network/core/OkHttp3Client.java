package com.unity3d.services.core.network.core;

/* JADX INFO: compiled from: OkHttp3Client.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u000bJ\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J1\u0010\r\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Lcom/unity3d/services/core/network/core/OkHttp3Client;", "Lcom/unity3d/services/core/network/core/HttpClient;", "dispatchers", "Lcom/unity3d/services/core/domain/ISDKDispatchers;", "client", "Lokhttp3/OkHttpClient;", "(Lcom/unity3d/services/core/domain/ISDKDispatchers;Lokhttp3/OkHttpClient;)V", "execute", "Lcom/unity3d/services/core/network/model/HttpResponse;", "request", "Lcom/unity3d/services/core/network/model/HttpRequest;", "(Lcom/unity3d/services/core/network/model/HttpRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "executeBlocking", "makeRequest", "Lokhttp3/Response;", "connectTimeout", "", "readTimeout", "writeTimeout", "(Lcom/unity3d/services/core/network/model/HttpRequest;JJJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class OkHttp3Client implements com.unity3d.services.core.network.core.HttpClient {
    public static final java.lang.String MSG_CONNECTION_FAILED = "Network request failed";
    public static final java.lang.String MSG_CONNECTION_TIMEOUT = "Network request timeout";
    public static final java.lang.String NETWORK_CLIENT_OKHTTP = "okhttp";
    private final okhttp3.OkHttpClient client;
    private final com.unity3d.services.core.domain.ISDKDispatchers dispatchers;

    public OkHttp3Client(com.unity3d.services.core.domain.ISDKDispatchers dispatchers, okhttp3.OkHttpClient client) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(client, "client");
        this.dispatchers = dispatchers;
        this.client = client;
    }

    /* JADX INFO: renamed from: com.unity3d.services.core.network.core.OkHttp3Client$executeBlocking$1, reason: invalid class name */
    /* JADX INFO: compiled from: OkHttp3Client.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/unity3d/services/core/network/model/HttpResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.services.core.network.core.OkHttp3Client$executeBlocking$1", f = "OkHttp3Client.kt", i = {}, l = {40}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.unity3d.services.core.network.model.HttpResponse>, java.lang.Object> {
        final /* synthetic */ com.unity3d.services.core.network.model.HttpRequest $request;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(com.unity3d.services.core.network.model.HttpRequest httpRequest, kotlin.coroutines.Continuation<? super com.unity3d.services.core.network.core.OkHttp3Client.AnonymousClass1> continuation) {
            super(2, continuation);
            this.$request = httpRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.unity3d.services.core.network.core.OkHttp3Client.this.new AnonymousClass1(this.$request, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.unity3d.services.core.network.model.HttpResponse> continuation) {
            return ((com.unity3d.services.core.network.core.OkHttp3Client.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                this.label = 1;
                obj = com.unity3d.services.core.network.core.OkHttp3Client.this.execute(this.$request, this);
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
        return (com.unity3d.services.core.network.model.HttpResponse) kotlinx.coroutines.BuildersKt.runBlocking(this.dispatchers.getIo(), new com.unity3d.services.core.network.core.OkHttp3Client.AnonymousClass1(request, null));
    }

    /* JADX INFO: renamed from: com.unity3d.services.core.network.core.OkHttp3Client$execute$2, reason: invalid class name */
    /* JADX INFO: compiled from: OkHttp3Client.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/unity3d/services/core/network/model/HttpResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.services.core.network.core.OkHttp3Client$execute$2", f = "OkHttp3Client.kt", i = {}, l = {51}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.unity3d.services.core.network.model.HttpResponse>, java.lang.Object> {
        final /* synthetic */ com.unity3d.services.core.network.model.HttpRequest $request;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(com.unity3d.services.core.network.model.HttpRequest httpRequest, kotlin.coroutines.Continuation<? super com.unity3d.services.core.network.core.OkHttp3Client.AnonymousClass2> continuation) {
            super(2, continuation);
            this.$request = httpRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.unity3d.services.core.network.core.OkHttp3Client.this.new AnonymousClass2(this.$request, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.unity3d.services.core.network.model.HttpResponse> continuation) {
            return ((com.unity3d.services.core.network.core.OkHttp3Client.AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) throws com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException {
            java.lang.Object objMakeRequest;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.unity3d.services.core.network.core.OkHttp3Client okHttp3Client = com.unity3d.services.core.network.core.OkHttp3Client.this;
                    com.unity3d.services.core.network.model.HttpRequest httpRequest = this.$request;
                    this.label = 1;
                    objMakeRequest = okHttp3Client.makeRequest(httpRequest, httpRequest.getConnectTimeout(), this.$request.getReadTimeout(), this.$request.getWriteTimeout(), this);
                    if (objMakeRequest == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    objMakeRequest = obj;
                }
                okhttp3.Response response = (okhttp3.Response) objMakeRequest;
                if (this.$request.getDownloadDestination() != null) {
                }
                java.lang.Object objString = null;
                if (this.$request.isProtobuf()) {
                    okhttp3.ResponseBody responseBodyBody = response.body();
                    if (responseBodyBody != null) {
                        objString = responseBodyBody.bytes();
                    }
                } else {
                    okhttp3.ResponseBody responseBodyBody2 = response.body();
                    if (responseBodyBody2 != null) {
                        objString = responseBodyBody2.string();
                    }
                }
                java.lang.String str = (java.io.Serializable) objString;
                int iCode = response.code();
                java.util.Map<java.lang.String, java.util.List<java.lang.String>> multimap = response.headers().toMultimap();
                java.lang.String url = response.request().url().getUrl();
                if (str == null) {
                }
                java.lang.String protocol = response.protocol().getProtocol();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(multimap, "toMultimap()");
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(url, "toString()");
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(protocol, "toString()");
                return new com.unity3d.services.core.network.model.HttpResponse(str, iCode, multimap, url, protocol, com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP, 0L, 64, null);
            } catch (java.net.SocketTimeoutException unused) {
                throw new com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException(com.unity3d.services.core.network.core.OkHttp3Client.MSG_CONNECTION_TIMEOUT, null, null, this.$request.getBaseURL(), null, null, com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP, 54, null);
            } catch (java.io.IOException unused2) {
                throw new com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException(com.unity3d.services.core.network.core.OkHttp3Client.MSG_CONNECTION_FAILED, null, null, this.$request.getBaseURL(), null, null, com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP, 54, null);
            }
        }
    }

    @Override // com.unity3d.services.core.network.core.HttpClient
    public java.lang.Object execute(com.unity3d.services.core.network.model.HttpRequest httpRequest, kotlin.coroutines.Continuation<? super com.unity3d.services.core.network.model.HttpResponse> continuation) {
        return kotlinx.coroutines.BuildersKt.withContext(this.dispatchers.getIo(), new com.unity3d.services.core.network.core.OkHttp3Client.AnonymousClass2(httpRequest, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object makeRequest(final com.unity3d.services.core.network.model.HttpRequest httpRequest, long j, long j2, long j3, kotlin.coroutines.Continuation<? super okhttp3.Response> continuation) {
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        this.client.newBuilder().connectTimeout(j, java.util.concurrent.TimeUnit.MILLISECONDS).readTimeout(j2, java.util.concurrent.TimeUnit.MILLISECONDS).writeTimeout(j3, java.util.concurrent.TimeUnit.MILLISECONDS).build().newCall(httpRequest.isProtobuf() ? com.unity3d.services.core.network.mapper.HttpRequestToOkHttpRequestKt.toOkHttpProtoRequest(httpRequest) : com.unity3d.services.core.network.mapper.HttpRequestToOkHttpRequestKt.toOkHttpRequest(httpRequest)).enqueue(new okhttp3.Callback() { // from class: com.unity3d.services.core.network.core.OkHttp3Client$makeRequest$2$1
            @Override // okhttp3.Callback
            public void onResponse(okhttp3.Call call, okhttp3.Response response) {
                okio.BufferedSource bodySource;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "call");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "response");
                try {
                    java.io.File downloadDestination = httpRequest.getDownloadDestination();
                    boolean z = false;
                    if (downloadDestination != null && downloadDestination.exists()) {
                        z = true;
                    }
                    if (z) {
                        okio.BufferedSink bufferedSinkBuffer = okio.Okio.buffer(okio.Okio.sink(downloadDestination));
                        okio.BufferedSink bufferedSink = bufferedSinkBuffer;
                        try {
                            okhttp3.ResponseBody responseBodyBody = response.body();
                            if (responseBodyBody != null && (bodySource = responseBodyBody.getBodySource()) != null) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bodySource, "source()");
                                okio.BufferedSource bufferedSource = bodySource;
                                try {
                                    long jWriteAll = bufferedSinkBuffer.writeAll(bufferedSource);
                                    kotlin.io.CloseableKt.closeFinally(bufferedSource, null);
                                    java.lang.Long.valueOf(jWriteAll);
                                } catch (java.lang.Throwable th) {
                                    try {
                                        throw th;
                                    } catch (java.lang.Throwable th2) {
                                        kotlin.io.CloseableKt.closeFinally(bufferedSource, th);
                                        throw th2;
                                    }
                                }
                            }
                            kotlin.io.CloseableKt.closeFinally(bufferedSink, null);
                        } catch (java.lang.Throwable th3) {
                            try {
                                throw th3;
                            } catch (java.lang.Throwable th4) {
                                kotlin.io.CloseableKt.closeFinally(bufferedSink, th3);
                                throw th4;
                            }
                        }
                    }
                    kotlinx.coroutines.CancellableContinuation<okhttp3.Response> cancellableContinuation = cancellableContinuationImpl2;
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    cancellableContinuation.resumeWith(kotlin.Result.m1301constructorimpl(response));
                } catch (java.lang.Exception e) {
                    kotlinx.coroutines.CancellableContinuation<okhttp3.Response> cancellableContinuation2 = cancellableContinuationImpl2;
                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                    cancellableContinuation2.resumeWith(kotlin.Result.m1301constructorimpl(kotlin.ResultKt.createFailure(e)));
                }
            }

            @Override // okhttp3.Callback
            public void onFailure(okhttp3.Call call, java.io.IOException e) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "call");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(e, "e");
                com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException unityAdsNetworkException = new com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException(com.unity3d.services.core.network.core.OkHttp3Client.MSG_CONNECTION_FAILED, null, null, call.request().url().getUrl(), null, null, com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP, 54, null);
                kotlinx.coroutines.CancellableContinuation<okhttp3.Response> cancellableContinuation = cancellableContinuationImpl2;
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                cancellableContinuation.resumeWith(kotlin.Result.m1301constructorimpl(kotlin.ResultKt.createFailure(unityAdsNetworkException)));
            }
        });
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }
}
