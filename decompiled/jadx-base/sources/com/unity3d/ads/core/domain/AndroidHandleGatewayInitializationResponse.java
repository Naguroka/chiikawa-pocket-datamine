package com.unity3d.ads.core.domain;

/* JADX INFO: compiled from: AndroidHandleGatewayInitializationResponse.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0019\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0096Bø\u0001\u0000¢\u0006\u0002\u0010\u000fR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidHandleGatewayInitializationResponse;", "Lcom/unity3d/ads/core/domain/HandleGatewayInitializationResponse;", "transactionEventManager", "Lcom/unity3d/ads/core/data/manager/TransactionEventManager;", "triggerInitializationCompletedRequest", "Lcom/unity3d/ads/core/domain/TriggerInitializationCompletedRequest;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "sdkScope", "Lkotlinx/coroutines/CoroutineScope;", "(Lcom/unity3d/ads/core/data/manager/TransactionEventManager;Lcom/unity3d/ads/core/domain/TriggerInitializationCompletedRequest;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lkotlinx/coroutines/CoroutineScope;)V", "invoke", "", com.json.hs.n, "Lgatewayprotocol/v1/InitializationResponseOuterClass$InitializationResponse;", "(Lgatewayprotocol/v1/InitializationResponseOuterClass$InitializationResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidHandleGatewayInitializationResponse implements com.unity3d.ads.core.domain.HandleGatewayInitializationResponse {
    private final kotlinx.coroutines.CoroutineScope sdkScope;
    private final com.unity3d.ads.core.data.repository.SessionRepository sessionRepository;
    private final com.unity3d.ads.core.data.manager.TransactionEventManager transactionEventManager;
    private final com.unity3d.ads.core.domain.TriggerInitializationCompletedRequest triggerInitializationCompletedRequest;

    public AndroidHandleGatewayInitializationResponse(com.unity3d.ads.core.data.manager.TransactionEventManager transactionEventManager, com.unity3d.ads.core.domain.TriggerInitializationCompletedRequest triggerInitializationCompletedRequest, com.unity3d.ads.core.data.repository.SessionRepository sessionRepository, kotlinx.coroutines.CoroutineScope sdkScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionEventManager, "transactionEventManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(triggerInitializationCompletedRequest, "triggerInitializationCompletedRequest");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkScope, "sdkScope");
        this.transactionEventManager = transactionEventManager;
        this.triggerInitializationCompletedRequest = triggerInitializationCompletedRequest;
        this.sessionRepository = sessionRepository;
        this.sdkScope = sdkScope;
    }

    @Override // com.unity3d.ads.core.domain.HandleGatewayInitializationResponse
    public java.lang.Object invoke(gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse initializationResponse, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) throws com.unity3d.ads.core.data.model.exception.GatewayException {
        if (initializationResponse.hasError()) {
            java.lang.String errorText = initializationResponse.getError().getErrorText();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(errorText, "response.error.errorText");
            throw new com.unity3d.ads.core.data.model.exception.GatewayException(errorText, new java.lang.IllegalStateException(initializationResponse.getError().getErrorText()), "gateway_initialization", initializationResponse.getError().getErrorText());
        }
        com.unity3d.ads.core.data.repository.SessionRepository sessionRepository = this.sessionRepository;
        gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration nativeConfiguration = initializationResponse.getNativeConfiguration();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(nativeConfiguration, "response.nativeConfiguration");
        sessionRepository.setNativeConfiguration(nativeConfiguration);
        if (initializationResponse.hasUniversalRequestUrl()) {
            java.lang.String universalRequestUrl = initializationResponse.getUniversalRequestUrl();
            if (!(universalRequestUrl == null || universalRequestUrl.length() == 0)) {
                com.unity3d.ads.core.data.repository.SessionRepository sessionRepository2 = this.sessionRepository;
                java.lang.String universalRequestUrl2 = initializationResponse.getUniversalRequestUrl();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(universalRequestUrl2, "response.universalRequestUrl");
                sessionRepository2.setGatewayUrl(universalRequestUrl2);
            }
        }
        if (initializationResponse.getTriggerInitializationCompletedRequest()) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.sdkScope, null, null, new com.unity3d.ads.core.domain.AndroidHandleGatewayInitializationResponse.AnonymousClass2(null), 3, null);
        }
        if (initializationResponse.getNativeConfiguration().getEnableIapEvent()) {
            this.transactionEventManager.invoke();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidHandleGatewayInitializationResponse$invoke$2, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidHandleGatewayInitializationResponse.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.AndroidHandleGatewayInitializationResponse$invoke$2", f = "AndroidHandleGatewayInitializationResponse.kt", i = {}, l = {34}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int label;

        AnonymousClass2(kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.AndroidHandleGatewayInitializationResponse.AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.unity3d.ads.core.domain.AndroidHandleGatewayInitializationResponse.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.unity3d.ads.core.domain.AndroidHandleGatewayInitializationResponse.AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (com.unity3d.ads.core.domain.AndroidHandleGatewayInitializationResponse.this.triggerInitializationCompletedRequest.invoke(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            return kotlin.Unit.INSTANCE;
        }
    }
}
