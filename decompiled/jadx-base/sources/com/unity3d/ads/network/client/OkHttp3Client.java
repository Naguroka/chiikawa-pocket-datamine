package com.unity3d.ads.network.client;

/* JADX INFO: compiled from: OkHttp3Client.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u000bJ)\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Lcom/unity3d/ads/network/client/OkHttp3Client;", "Lcom/unity3d/ads/network/HttpClient;", "dispatchers", "Lcom/unity3d/services/core/domain/ISDKDispatchers;", "client", "Lokhttp3/OkHttpClient;", "(Lcom/unity3d/services/core/domain/ISDKDispatchers;Lokhttp3/OkHttpClient;)V", "execute", "Lcom/unity3d/ads/network/model/HttpResponse;", "request", "Lcom/unity3d/ads/network/model/HttpRequest;", "(Lcom/unity3d/ads/network/model/HttpRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "makeRequest", "Lokhttp3/Response;", "Lokhttp3/Request;", "connectTimeout", "", "readTimeout", "(Lokhttp3/Request;JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class OkHttp3Client implements com.unity3d.ads.network.HttpClient {
    private final okhttp3.OkHttpClient client;
    private final com.unity3d.services.core.domain.ISDKDispatchers dispatchers;

    public OkHttp3Client(com.unity3d.services.core.domain.ISDKDispatchers dispatchers, okhttp3.OkHttpClient client) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(client, "client");
        this.dispatchers = dispatchers;
        this.client = client;
    }

    /* JADX INFO: renamed from: com.unity3d.ads.network.client.OkHttp3Client$execute$2, reason: invalid class name */
    /* JADX INFO: compiled from: OkHttp3Client.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/network/model/HttpResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.network.client.OkHttp3Client$execute$2", f = "OkHttp3Client.kt", i = {}, l = {35}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.unity3d.ads.network.model.HttpResponse>, java.lang.Object> {
        final /* synthetic */ com.unity3d.ads.network.model.HttpRequest $request;
        int label;
        final /* synthetic */ com.unity3d.ads.network.client.OkHttp3Client this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(com.unity3d.ads.network.model.HttpRequest httpRequest, com.unity3d.ads.network.client.OkHttp3Client okHttp3Client, kotlin.coroutines.Continuation<? super com.unity3d.ads.network.client.OkHttp3Client.AnonymousClass2> continuation) {
            super(2, continuation);
            this.$request = httpRequest;
            this.this$0 = okHttp3Client;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.unity3d.ads.network.client.OkHttp3Client.AnonymousClass2(this.$request, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.unity3d.ads.network.model.HttpResponse> continuation) {
            return ((com.unity3d.ads.network.client.OkHttp3Client.AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                okhttp3.Request okHttpRequest = com.unity3d.ads.network.mapper.HttpRequestToOkHttpRequestKt.toOkHttpRequest(this.$request);
                this.label = 1;
                obj = this.this$0.makeRequest(okHttpRequest, this.$request.getConnectTimeout(), this.$request.getReadTimeout(), this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            okhttp3.Response response = (okhttp3.Response) obj;
            int iCode = response.code();
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> multimap = response.headers().toMultimap();
            java.lang.String url = response.request().url().getUrl();
            okhttp3.ResponseBody responseBodyBody = response.body();
            java.lang.String strString = responseBodyBody != null ? responseBodyBody.string() : null;
            if (strString == null) {
                strString = "";
            }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(multimap, "toMultimap()");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(url, "toString()");
            return new com.unity3d.ads.network.model.HttpResponse(strString, iCode, multimap, url);
        }
    }

    @Override // com.unity3d.ads.network.HttpClient
    public java.lang.Object execute(com.unity3d.ads.network.model.HttpRequest httpRequest, kotlin.coroutines.Continuation<? super com.unity3d.ads.network.model.HttpResponse> continuation) {
        return kotlinx.coroutines.BuildersKt.withContext(this.dispatchers.getIo(), new com.unity3d.ads.network.client.OkHttp3Client.AnonymousClass2(httpRequest, this, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object makeRequest(okhttp3.Request request, long j, long j2, kotlin.coroutines.Continuation<? super okhttp3.Response> continuation) {
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        this.client.newBuilder().connectTimeout(j, java.util.concurrent.TimeUnit.MILLISECONDS).readTimeout(j2, java.util.concurrent.TimeUnit.MILLISECONDS).build().newCall(request).enqueue(new okhttp3.Callback() { // from class: com.unity3d.ads.network.client.OkHttp3Client$makeRequest$2$1
            @Override // okhttp3.Callback
            public void onResponse(okhttp3.Call call, okhttp3.Response response) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "call");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "response");
                kotlinx.coroutines.CancellableContinuation<okhttp3.Response> cancellableContinuation = cancellableContinuationImpl2;
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                cancellableContinuation.resumeWith(kotlin.Result.m1301constructorimpl(response));
            }

            @Override // okhttp3.Callback
            public void onFailure(okhttp3.Call call, java.io.IOException e) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "call");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(e, "e");
                kotlinx.coroutines.CancellableContinuation<okhttp3.Response> cancellableContinuation = cancellableContinuationImpl2;
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                cancellableContinuation.resumeWith(kotlin.Result.m1301constructorimpl(kotlin.ResultKt.createFailure(e)));
            }
        });
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }
}
