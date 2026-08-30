package com.unity3d.services.core.network.core;

/* JADX INFO: compiled from: LegacyHttpClient.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\tJ\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lcom/unity3d/services/core/network/core/LegacyHttpClient;", "Lcom/unity3d/services/core/network/core/HttpClient;", "dispatchers", "Lcom/unity3d/services/core/domain/ISDKDispatchers;", "(Lcom/unity3d/services/core/domain/ISDKDispatchers;)V", "execute", "Lcom/unity3d/services/core/network/model/HttpResponse;", "request", "Lcom/unity3d/services/core/network/model/HttpRequest;", "(Lcom/unity3d/services/core/network/model/HttpRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "executeBlocking", "Companion", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LegacyHttpClient implements com.unity3d.services.core.network.core.HttpClient {
    private static final java.lang.String NETWORK_CLIENT_LEGACY = "legacy";
    private final com.unity3d.services.core.domain.ISDKDispatchers dispatchers;

    public LegacyHttpClient(com.unity3d.services.core.domain.ISDKDispatchers dispatchers) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        this.dispatchers = dispatchers;
    }

    /* JADX INFO: renamed from: com.unity3d.services.core.network.core.LegacyHttpClient$executeBlocking$1, reason: invalid class name */
    /* JADX INFO: compiled from: LegacyHttpClient.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/unity3d/services/core/network/model/HttpResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.services.core.network.core.LegacyHttpClient$executeBlocking$1", f = "LegacyHttpClient.kt", i = {}, l = {26}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.unity3d.services.core.network.model.HttpResponse>, java.lang.Object> {
        final /* synthetic */ com.unity3d.services.core.network.model.HttpRequest $request;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(com.unity3d.services.core.network.model.HttpRequest httpRequest, kotlin.coroutines.Continuation<? super com.unity3d.services.core.network.core.LegacyHttpClient.AnonymousClass1> continuation) {
            super(2, continuation);
            this.$request = httpRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.unity3d.services.core.network.core.LegacyHttpClient.this.new AnonymousClass1(this.$request, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.unity3d.services.core.network.model.HttpResponse> continuation) {
            return ((com.unity3d.services.core.network.core.LegacyHttpClient.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                this.label = 1;
                obj = com.unity3d.services.core.network.core.LegacyHttpClient.this.execute(this.$request, this);
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
        return (com.unity3d.services.core.network.model.HttpResponse) kotlinx.coroutines.BuildersKt.runBlocking(this.dispatchers.getIo(), new com.unity3d.services.core.network.core.LegacyHttpClient.AnonymousClass1(request, null));
    }

    /* JADX INFO: renamed from: com.unity3d.services.core.network.core.LegacyHttpClient$execute$2, reason: invalid class name */
    /* JADX INFO: compiled from: LegacyHttpClient.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/unity3d/services/core/network/model/HttpResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.services.core.network.core.LegacyHttpClient$execute$2", f = "LegacyHttpClient.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.unity3d.services.core.network.model.HttpResponse>, java.lang.Object> {
        final /* synthetic */ com.unity3d.services.core.network.model.HttpRequest $request;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(com.unity3d.services.core.network.model.HttpRequest httpRequest, kotlin.coroutines.Continuation<? super com.unity3d.services.core.network.core.LegacyHttpClient.AnonymousClass2> continuation) {
            super(2, continuation);
            this.$request = httpRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.unity3d.services.core.network.core.LegacyHttpClient.AnonymousClass2(this.$request, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.unity3d.services.core.network.model.HttpResponse> continuation) {
            return ((com.unity3d.services.core.network.core.LegacyHttpClient.AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) throws java.lang.Exception {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            com.unity3d.services.core.request.WebRequest webRequest = com.unity3d.services.core.network.mapper.HttpRequestToWebRequestKt.toWebRequest(this.$request);
            java.lang.String strMakeRequest = webRequest.makeRequest();
            int responseCode = webRequest.getResponseCode();
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> headers = webRequest.getHeaders();
            java.lang.String string = webRequest.getUrl().toString();
            if (strMakeRequest == null) {
                strMakeRequest = "";
            }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(headers, "headers");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "toString()");
            return new com.unity3d.services.core.network.model.HttpResponse(strMakeRequest, responseCode, headers, string, null, com.unity3d.services.core.network.core.LegacyHttpClient.NETWORK_CLIENT_LEGACY, 0L, 80, null);
        }
    }

    @Override // com.unity3d.services.core.network.core.HttpClient
    public java.lang.Object execute(com.unity3d.services.core.network.model.HttpRequest httpRequest, kotlin.coroutines.Continuation<? super com.unity3d.services.core.network.model.HttpResponse> continuation) {
        return kotlinx.coroutines.BuildersKt.withContext(this.dispatchers.getIo(), new com.unity3d.services.core.network.core.LegacyHttpClient.AnonymousClass2(httpRequest, null), continuation);
    }
}
