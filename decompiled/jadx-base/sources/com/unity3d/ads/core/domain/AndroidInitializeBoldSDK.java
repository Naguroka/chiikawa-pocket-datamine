package com.unity3d.ads.core.domain;

/* JADX INFO: compiled from: AndroidInitializeBoldSDK.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 12\u00020\u0001:\u00011B}\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\u0006\u0010\u001e\u001a\u00020\u001f¢\u0006\u0002\u0010 J\b\u0010!\u001a\u00020\"H\u0002J\u001c\u0010#\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020%0$2\u0006\u0010&\u001a\u00020'H\u0002J\u0018\u0010(\u001a\u00020\"2\u0006\u0010)\u001a\u00020*2\u0006\u0010&\u001a\u00020'H\u0002J\u0011\u0010+\u001a\u00020\"H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010,J\u0019\u0010-\u001a\u00020\"2\u0006\u0010)\u001a\u00020*H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010.J\u0011\u0010/\u001a\u00020\"H\u0096Bø\u0001\u0000¢\u0006\u0002\u0010,J\b\u00100\u001a\u00020\"H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u00062"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidInitializeBoldSDK;", "Lcom/unity3d/ads/core/domain/InitializeBoldSDK;", "defaultDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "initializeOM", "Lcom/unity3d/ads/core/domain/om/InitializeOMSDK;", "getInitializeRequest", "Lcom/unity3d/ads/core/domain/GetInitializationRequest;", "getRequestPolicy", "Lcom/unity3d/ads/core/domain/GetRequestPolicy;", "clearCache", "Lcom/unity3d/ads/core/domain/ClearCache;", "handleGatewayInitializationResponse", "Lcom/unity3d/ads/core/domain/HandleGatewayInitializationResponse;", "gatewayClient", "Lcom/unity3d/ads/gatewayclient/GatewayClient;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "eventObservers", "Lcom/unity3d/ads/core/domain/events/EventObservers;", "triggerInitializeListener", "Lcom/unity3d/ads/core/domain/TriggerInitializeListener;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "diagnosticEventRepository", "Lcom/unity3d/ads/core/data/repository/DiagnosticEventRepository;", "storageManager", "Lcom/unity3d/ads/core/data/manager/StorageManager;", "legacyConfigurationReader", "Lcom/unity3d/services/core/configuration/ConfigurationReader;", "sdkPropertiesManager", "Lcom/unity3d/ads/core/data/manager/SDKPropertiesManager;", "(Lkotlinx/coroutines/CoroutineDispatcher;Lcom/unity3d/ads/core/domain/om/InitializeOMSDK;Lcom/unity3d/ads/core/domain/GetInitializationRequest;Lcom/unity3d/ads/core/domain/GetRequestPolicy;Lcom/unity3d/ads/core/domain/ClearCache;Lcom/unity3d/ads/core/domain/HandleGatewayInitializationResponse;Lcom/unity3d/ads/gatewayclient/GatewayClient;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/domain/events/EventObservers;Lcom/unity3d/ads/core/domain/TriggerInitializeListener;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;Lcom/unity3d/ads/core/data/repository/DiagnosticEventRepository;Lcom/unity3d/ads/core/data/manager/StorageManager;Lcom/unity3d/services/core/configuration/ConfigurationReader;Lcom/unity3d/ads/core/data/manager/SDKPropertiesManager;)V", "checkCanInitialize", "", "getTags", "", "", "e", "Lcom/unity3d/ads/core/data/model/exception/InitializationException;", "initializationFailure", "startTime", "Lkotlin/time/TimeMark;", "initializationStart", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initializationSuccess", "(Lkotlin/time/TimeMark;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "invoke", "setupDiagnosticEvents", "Companion", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidInitializeBoldSDK implements com.unity3d.ads.core.domain.InitializeBoldSDK {
    public static final java.lang.String MSG_GATEWAY_DENIED = "Gateway communication failure";
    public static final java.lang.String MSG_NETWORK = "Network";
    public static final java.lang.String MSG_TIMEOUT = "Timeout";
    public static final java.lang.String MSG_UNKNOWN = "Initialization failure";
    private final com.unity3d.ads.core.domain.ClearCache clearCache;
    private final kotlinx.coroutines.CoroutineDispatcher defaultDispatcher;
    private final com.unity3d.ads.core.data.repository.DiagnosticEventRepository diagnosticEventRepository;
    private final com.unity3d.ads.core.domain.events.EventObservers eventObservers;
    private final com.unity3d.ads.gatewayclient.GatewayClient gatewayClient;
    private final com.unity3d.ads.core.domain.GetInitializationRequest getInitializeRequest;
    private final com.unity3d.ads.core.domain.GetRequestPolicy getRequestPolicy;
    private final com.unity3d.ads.core.domain.HandleGatewayInitializationResponse handleGatewayInitializationResponse;
    private final com.unity3d.ads.core.domain.om.InitializeOMSDK initializeOM;
    private final com.unity3d.services.core.configuration.ConfigurationReader legacyConfigurationReader;
    private final com.unity3d.ads.core.data.manager.SDKPropertiesManager sdkPropertiesManager;
    private final com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent;
    private final com.unity3d.ads.core.data.repository.SessionRepository sessionRepository;
    private final com.unity3d.ads.core.data.manager.StorageManager storageManager;
    private final com.unity3d.ads.core.domain.TriggerInitializeListener triggerInitializeListener;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK$initializationSuccess$1, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidInitializeBoldSDK.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.AndroidInitializeBoldSDK", f = "AndroidInitializeBoldSDK.kt", i = {0, 1, 2}, l = {92, 93, 95}, m = "initializationSuccess", n = {"this", "this", "this"}, s = {"L$0", "L$0", "L$0"})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        int label;
        /* synthetic */ java.lang.Object result;

        AnonymousClass1(kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.this.initializationSuccess(null, this);
        }
    }

    public AndroidInitializeBoldSDK(kotlinx.coroutines.CoroutineDispatcher defaultDispatcher, com.unity3d.ads.core.domain.om.InitializeOMSDK initializeOM, com.unity3d.ads.core.domain.GetInitializationRequest getInitializeRequest, com.unity3d.ads.core.domain.GetRequestPolicy getRequestPolicy, com.unity3d.ads.core.domain.ClearCache clearCache, com.unity3d.ads.core.domain.HandleGatewayInitializationResponse handleGatewayInitializationResponse, com.unity3d.ads.gatewayclient.GatewayClient gatewayClient, com.unity3d.ads.core.data.repository.SessionRepository sessionRepository, com.unity3d.ads.core.domain.events.EventObservers eventObservers, com.unity3d.ads.core.domain.TriggerInitializeListener triggerInitializeListener, com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent, com.unity3d.ads.core.data.repository.DiagnosticEventRepository diagnosticEventRepository, com.unity3d.ads.core.data.manager.StorageManager storageManager, com.unity3d.services.core.configuration.ConfigurationReader legacyConfigurationReader, com.unity3d.ads.core.data.manager.SDKPropertiesManager sdkPropertiesManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultDispatcher, "defaultDispatcher");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initializeOM, "initializeOM");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getInitializeRequest, "getInitializeRequest");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getRequestPolicy, "getRequestPolicy");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clearCache, "clearCache");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handleGatewayInitializationResponse, "handleGatewayInitializationResponse");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gatewayClient, "gatewayClient");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventObservers, "eventObservers");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(triggerInitializeListener, "triggerInitializeListener");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(diagnosticEventRepository, "diagnosticEventRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(legacyConfigurationReader, "legacyConfigurationReader");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkPropertiesManager, "sdkPropertiesManager");
        this.defaultDispatcher = defaultDispatcher;
        this.initializeOM = initializeOM;
        this.getInitializeRequest = getInitializeRequest;
        this.getRequestPolicy = getRequestPolicy;
        this.clearCache = clearCache;
        this.handleGatewayInitializationResponse = handleGatewayInitializationResponse;
        this.gatewayClient = gatewayClient;
        this.sessionRepository = sessionRepository;
        this.eventObservers = eventObservers;
        this.triggerInitializeListener = triggerInitializeListener;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.diagnosticEventRepository = diagnosticEventRepository;
        this.storageManager = storageManager;
        this.legacyConfigurationReader = legacyConfigurationReader;
        this.sdkPropertiesManager = sdkPropertiesManager;
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK$invoke$2, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidInitializeBoldSDK.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.AndroidInitializeBoldSDK$invoke$2", f = "AndroidInitializeBoldSDK.kt", i = {0}, l = {58, 72}, m = "invokeSuspend", n = {"startTime"}, s = {"J$0"})
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        long J$0;
        int label;

        AnonymousClass2(kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:21:0x0058 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            long j;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                long jM2767markNowz9LOYto = kotlin.time.TimeSource.Monotonic.INSTANCE.m2767markNowz9LOYto();
                try {
                    this.J$0 = jM2767markNowz9LOYto;
                    this.label = 1;
                    if (kotlinx.coroutines.TimeoutKt.withTimeout(com.unity3d.services.UnityAdsConstants.Timeout.INIT_TIMEOUT_MS, new com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.AnonymousClass2.AnonymousClass1(com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.this, null), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    j = jM2767markNowz9LOYto;
                    this.label = 2;
                    if (com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.this.initializationSuccess(kotlin.time.TimeSource.Monotonic.ValueTimeMark.m2768boximpl(j), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } catch (java.lang.Exception e) {
                    e = e;
                    j = jM2767markNowz9LOYto;
                    com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.this.initializationFailure(kotlin.time.TimeSource.Monotonic.ValueTimeMark.m2768boximpl(j), com.unity3d.ads.core.data.model.exception.InitializationException.INSTANCE.parseFrom(e));
                    return kotlin.Unit.INSTANCE;
                }
            } else if (i == 1) {
                j = this.J$0;
                try {
                    kotlin.ResultKt.throwOnFailure(obj);
                    this.label = 2;
                    if (com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.this.initializationSuccess(kotlin.time.TimeSource.Monotonic.ValueTimeMark.m2768boximpl(j), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } catch (java.lang.Exception e2) {
                    e = e2;
                    com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.this.initializationFailure(kotlin.time.TimeSource.Monotonic.ValueTimeMark.m2768boximpl(j), com.unity3d.ads.core.data.model.exception.InitializationException.INSTANCE.parseFrom(e));
                    return kotlin.Unit.INSTANCE;
                }
            } else {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            return kotlin.Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK$invoke$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: AndroidInitializeBoldSDK.kt */
        @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.AndroidInitializeBoldSDK$invoke$2$1", f = "AndroidInitializeBoldSDK.kt", i = {}, l = {59, 61, 63, 64}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
            int label;
            final /* synthetic */ com.unity3d.ads.core.domain.AndroidInitializeBoldSDK this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(com.unity3d.ads.core.domain.AndroidInitializeBoldSDK androidInitializeBoldSDK, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.AnonymousClass2.AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = androidInitializeBoldSDK;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                return new com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.AnonymousClass2.AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                return ((com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.AnonymousClass2.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
            }

            /* JADX WARN: Code duplicated, block: B:22:0x0078 A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:25:0x0099 A[RETURN] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) throws com.unity3d.ads.core.data.model.exception.InitializationException {
                com.unity3d.ads.core.domain.HandleGatewayInitializationResponse handleGatewayInitializationResponse;
                gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse initializationResponse;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    this.label = 1;
                    if (this.this$0.initializationStart(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i == 1) {
                        kotlin.ResultKt.throwOnFailure(obj);
                    } else if (i == 2) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        com.unity3d.ads.gatewayclient.RequestPolicy requestPolicyInvoke = this.this$0.getRequestPolicy.invoke();
                        this.label = 3;
                        obj = com.unity3d.ads.gatewayclient.GatewayClient.DefaultImpls.request$default(this.this$0.gatewayClient, null, (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest) obj, requestPolicyInvoke, com.unity3d.ads.core.data.model.OperationType.INITIALIZATION, this, 1, null);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        handleGatewayInitializationResponse = this.this$0.handleGatewayInitializationResponse;
                        initializationResponse = ((gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) obj).getPayload().getInitializationResponse();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(initializationResponse, "response.payload.initializationResponse");
                        this.label = 4;
                        if (handleGatewayInitializationResponse.invoke(initializationResponse, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else if (i == 3) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        handleGatewayInitializationResponse = this.this$0.handleGatewayInitializationResponse;
                        initializationResponse = ((gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) obj).getPayload().getInitializationResponse();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(initializationResponse, "response.payload.initializationResponse");
                        this.label = 4;
                        if (handleGatewayInitializationResponse.invoke(initializationResponse, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 4) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    return kotlin.Unit.INSTANCE;
                }
                this.this$0.checkCanInitialize();
                this.label = 2;
                obj = this.this$0.getInitializeRequest.invoke(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                com.unity3d.ads.gatewayclient.RequestPolicy requestPolicyInvoke2 = this.this$0.getRequestPolicy.invoke();
                this.label = 3;
                obj = com.unity3d.ads.gatewayclient.GatewayClient.DefaultImpls.request$default(this.this$0.gatewayClient, null, (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest) obj, requestPolicyInvoke2, com.unity3d.ads.core.data.model.OperationType.INITIALIZATION, this, 1, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                handleGatewayInitializationResponse = this.this$0.handleGatewayInitializationResponse;
                initializationResponse = ((gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) obj).getPayload().getInitializationResponse();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(initializationResponse, "response.payload.initializationResponse");
                this.label = 4;
                if (handleGatewayInitializationResponse.invoke(initializationResponse, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return kotlin.Unit.INSTANCE;
            }
        }
    }

    @Override // com.unity3d.ads.core.domain.InitializeBoldSDK
    public java.lang.Object invoke(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) throws java.lang.Throwable {
        java.lang.Object objWithContext = kotlinx.coroutines.BuildersKt.withContext(this.defaultDispatcher, new com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.AnonymousClass2(null), continuation);
        return objWithContext == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkCanInitialize() throws com.unity3d.ads.core.data.model.exception.InitializationException {
        if (!this.sessionRepository.getShouldInitialize()) {
            throw new com.unity3d.ads.core.data.model.exception.InitializationException(MSG_GATEWAY_DENIED, null, "gateway", "!sessionRepository.shouldInitialize", 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object initializationStart(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.unity3d.services.core.log.DeviceLog.debug("Unity Ads Initialization Start");
        com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_initialization_started", null, null, null, null, 30, null);
        this.sessionRepository.setInitializationState(com.unity3d.ads.core.data.model.InitializationState.INITIALIZING);
        java.lang.Object objInvoke = this.eventObservers.invoke(continuation);
        return objInvoke == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvoke : kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:27:0x0099 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x009a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    public final java.lang.Object initializationSuccess(kotlin.time.TimeMark timeMark, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.AnonymousClass1 anonymousClass1;
        com.unity3d.ads.core.domain.AndroidInitializeBoldSDK androidInitializeBoldSDK;
        com.unity3d.ads.core.data.repository.SessionRepository sessionRepository;
        com.unity3d.ads.core.domain.AndroidInitializeBoldSDK androidInitializeBoldSDK2;
        if (continuation instanceof com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.AnonymousClass1) {
            anonymousClass1 = (com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.AnonymousClass1(continuation);
        }
        java.lang.Object obj = anonymousClass1.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.unity3d.services.core.log.DeviceLog.debug("Unity Ads Initialization Success");
            com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_initialize_task_success_time", kotlin.coroutines.jvm.internal.Boxing.boxDouble(com.unity3d.ads.core.extensions.TimeExtensionsKt.elapsedMillis(timeMark)), null, null, null, 28, null);
            this.storageManager.hasInitialized();
            com.unity3d.ads.core.domain.om.InitializeOMSDK initializeOMSDK = this.initializeOM;
            anonymousClass1.L$0 = this;
            anonymousClass1.label = 1;
            if (initializeOMSDK.invoke(anonymousClass1) == coroutine_suspended) {
                return coroutine_suspended;
            }
            androidInitializeBoldSDK = this;
        } else {
            if (i == 1) {
                androidInitializeBoldSDK = (com.unity3d.ads.core.domain.AndroidInitializeBoldSDK) anonymousClass1.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
            } else if (i == 2) {
                androidInitializeBoldSDK = (com.unity3d.ads.core.domain.AndroidInitializeBoldSDK) anonymousClass1.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                sessionRepository = androidInitializeBoldSDK.sessionRepository;
                anonymousClass1.L$0 = androidInitializeBoldSDK;
                anonymousClass1.label = 3;
                if (sessionRepository.persistNativeConfiguration(anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                androidInitializeBoldSDK2 = androidInitializeBoldSDK;
            } else {
                if (i != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                androidInitializeBoldSDK2 = (com.unity3d.ads.core.domain.AndroidInitializeBoldSDK) anonymousClass1.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
            }
            androidInitializeBoldSDK2.legacyConfigurationReader.getCurrentConfiguration().deleteFromDisk();
            androidInitializeBoldSDK2.sessionRepository.setInitializationState(com.unity3d.ads.core.data.model.InitializationState.INITIALIZED);
            androidInitializeBoldSDK2.sdkPropertiesManager.setInitialized(true);
            androidInitializeBoldSDK2.triggerInitializeListener.success();
            androidInitializeBoldSDK2.setupDiagnosticEvents();
            return kotlin.Unit.INSTANCE;
        }
        com.unity3d.ads.core.domain.ClearCache clearCache = androidInitializeBoldSDK.clearCache;
        anonymousClass1.L$0 = androidInitializeBoldSDK;
        anonymousClass1.label = 2;
        if (clearCache.invoke(anonymousClass1) == coroutine_suspended) {
            return coroutine_suspended;
        }
        sessionRepository = androidInitializeBoldSDK.sessionRepository;
        anonymousClass1.L$0 = androidInitializeBoldSDK;
        anonymousClass1.label = 3;
        if (sessionRepository.persistNativeConfiguration(anonymousClass1) == coroutine_suspended) {
            return coroutine_suspended;
        }
        androidInitializeBoldSDK2 = androidInitializeBoldSDK;
        androidInitializeBoldSDK2.legacyConfigurationReader.getCurrentConfiguration().deleteFromDisk();
        androidInitializeBoldSDK2.sessionRepository.setInitializationState(com.unity3d.ads.core.data.model.InitializationState.INITIALIZED);
        androidInitializeBoldSDK2.sdkPropertiesManager.setInitialized(true);
        androidInitializeBoldSDK2.triggerInitializeListener.success();
        androidInitializeBoldSDK2.setupDiagnosticEvents();
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initializationFailure(kotlin.time.TimeMark startTime, com.unity3d.ads.core.data.model.exception.InitializationException e) {
        com.unity3d.services.core.log.DeviceLog.debug("Unity Ads Initialization Failure: " + e.getMessage());
        com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_initialize_task_failure_time", java.lang.Double.valueOf(com.unity3d.ads.core.extensions.TimeExtensionsKt.elapsedMillis(startTime)), getTags(e), null, null, 24, null);
        this.sessionRepository.setInitializationState(com.unity3d.ads.core.data.model.InitializationState.FAILED);
        this.sdkPropertiesManager.setInitialized(false);
        this.triggerInitializeListener.error(com.unity3d.ads.UnityAds.UnityAdsInitializationError.INTERNAL_ERROR, e.getMessage());
        setupDiagnosticEvents();
    }

    private final java.util.Map<java.lang.String, java.lang.String> getTags(com.unity3d.ads.core.data.model.exception.InitializationException e) {
        java.util.Map mapCreateMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
        mapCreateMapBuilder.put("operation", com.unity3d.ads.core.data.model.OperationType.INITIALIZATION.toString());
        mapCreateMapBuilder.put("reason", e.getReason());
        if (e.getReasonDebug() != null) {
            mapCreateMapBuilder.put("reason_debug", e.getReasonDebug());
        }
        return kotlin.collections.MapsKt.build(mapCreateMapBuilder);
    }

    private final void setupDiagnosticEvents() {
        gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration config = this.sessionRepository.getNativeConfiguration().getDiagnosticEvents();
        com.unity3d.ads.core.data.repository.DiagnosticEventRepository diagnosticEventRepository = this.diagnosticEventRepository;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(config, "config");
        diagnosticEventRepository.configure(config);
    }
}
