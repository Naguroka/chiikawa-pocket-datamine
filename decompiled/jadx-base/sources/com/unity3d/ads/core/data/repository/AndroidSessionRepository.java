package com.unity3d.ads.core.data.repository;

/* JADX INFO: compiled from: AndroidSessionRepository.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\u0011\u0010f\u001a\u00020\u0010H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010gJ\u0011\u0010h\u001a\u00020\u0010H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010gJ\u0011\u0010i\u001a\u00020\u0010H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010gJ\b\u0010j\u001a\u00020kH\u0016J\b\u0010l\u001a\u00020kH\u0016J\b\u0010m\u001a\u00020kH\u0016J\b\u0010n\u001a\u00020kH\u0016J\b\u0010o\u001a\u00020kH\u0016J\b\u0010p\u001a\u00020kH\u0016J\b\u0010q\u001a\u00020kH\u0016J\b\u0010r\u001a\u00020kH\u0016J\u0011\u0010s\u001a\u00020kH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010gJ\b\u0010t\u001a\u00020kH\u0016J\u0019\u0010u\u001a\u00020k2\u0006\u0010)\u001a\u00020\u0010H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010vJ\u0019\u0010w\u001a\u00020k2\u0006\u0010)\u001a\u00020\u0010H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010vJ\u0019\u0010x\u001a\u00020k2\u0006\u0010)\u001a\u00020\u0010H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010vR\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\b0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00190\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010%\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010*\u001a\u0004\u0018\u00010\u00122\b\u0010)\u001a\u0004\u0018\u00010\u00128V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010/\u001a\u00020\u00102\u0006\u0010)\u001a\u00020\u00108V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b0\u00101\"\u0004\b2\u00103R$\u00104\u001a\u00020\u00122\u0006\u0010)\u001a\u00020\u00128V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b5\u0010,\"\u0004\b6\u0010.R\u0014\u00107\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R$\u0010:\u001a\u00020\u00172\u0006\u0010)\u001a\u00020\u00178V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u0014\u0010?\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0014\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00190\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010B\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010@R\u0014\u0010C\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bC\u0010@R\u0014\u0010D\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bD\u0010@R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010E\u001a\u00020\b2\u0006\u0010)\u001a\u00020\b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00170K8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bL\u0010MR\u001a\u0010N\u001a\b\u0012\u0004\u0012\u00020\u001c0OX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bP\u0010QR\u0014\u0010R\u001a\b\u0012\u0004\u0012\u00020\b0KX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010S\u001a\u00020\u001f2\u0006\u0010)\u001a\u00020\u001f8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\u0014\u0010X\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bY\u00101R$\u0010Z\u001a\u00020\u00102\u0006\u0010)\u001a\u00020\u00108V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b[\u00101\"\u0004\b\\\u00103R$\u0010]\u001a\u00020\u00192\u0006\u0010)\u001a\u00020\u00198V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b^\u0010@\"\u0004\b_\u0010`R$\u0010a\u001a\u00020$2\u0006\u0010)\u001a\u00020$8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bb\u0010c\"\u0004\bd\u0010e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006y"}, d2 = {"Lcom/unity3d/ads/core/data/repository/AndroidSessionRepository;", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "gatewayCacheDataSource", "Lcom/unity3d/ads/core/data/datasource/ByteStringDataSource;", "privacyDataSource", "fsmDataSource", "nativeConfigDataSource", "defaultNativeConfiguration", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeConfiguration;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "(Lcom/unity3d/ads/core/data/datasource/ByteStringDataSource;Lcom/unity3d/ads/core/data/datasource/ByteStringDataSource;Lcom/unity3d/ads/core/data/datasource/ByteStringDataSource;Lcom/unity3d/ads/core/data/datasource/ByteStringDataSource;Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeConfiguration;Lkotlinx/coroutines/CoroutineDispatcher;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;)V", "_currentState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/google/protobuf/ByteString;", "_gameId", "", "_gatewayUrl", "_headerBiddingTokenCounter", "", "_initializationState", "Lcom/unity3d/ads/core/data/model/InitializationState;", "_isTestModeEnabled", "", "_onChange", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/unity3d/ads/core/data/model/SessionChange;", "_sdkConfiguration", "_sessionCounters", "Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;", "_sessionId", "_sessionToken", "_shouldInitialize", "_tokenCounters", "Lcom/unity3d/ads/core/data/model/TokenCounters;", "featureFlags", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$FeatureFlags;", "getFeatureFlags", "()Lgatewayprotocol/v1/NativeConfigurationOuterClass$FeatureFlags;", "value", com.unity3d.ads.core.domain.AndroidGetAdPlayerContext.KEY_GAME_ID, "getGameId", "()Ljava/lang/String;", "setGameId", "(Ljava/lang/String;)V", "gatewayState", "getGatewayState", "()Lcom/google/protobuf/ByteString;", "setGatewayState", "(Lcom/google/protobuf/ByteString;)V", "gatewayUrl", "getGatewayUrl", "setGatewayUrl", "headerBiddingTokenCounter", "getHeaderBiddingTokenCounter", "()I", "initializationState", "getInitializationState", "()Lcom/unity3d/ads/core/data/model/InitializationState;", "setInitializationState", "(Lcom/unity3d/ads/core/data/model/InitializationState;)V", "isDiagnosticsEnabled", "()Z", "isInit", "isOmEnabled", "isSdkInitialized", "isTestModeEnabled", "nativeConfiguration", "getNativeConfiguration", "()Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeConfiguration;", "setNativeConfiguration", "(Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeConfiguration;)V", "observeInitializationState", "Lkotlinx/coroutines/flow/Flow;", "getObserveInitializationState", "()Lkotlinx/coroutines/flow/Flow;", "onChange", "Lkotlinx/coroutines/flow/SharedFlow;", "getOnChange", "()Lkotlinx/coroutines/flow/SharedFlow;", "persistedNativeConfiguration", "sessionCounters", "getSessionCounters", "()Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;", "setSessionCounters", "(Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;)V", com.unity3d.services.core.device.reader.JsonStorageKeyNames.SESSION_ID_KEY, "getSessionId", "sessionToken", "getSessionToken", "setSessionToken", "shouldInitialize", "getShouldInitialize", "setShouldInitialize", "(Z)V", "tokenCounters", "getTokenCounters", "()Lcom/unity3d/ads/core/data/model/TokenCounters;", "setTokenCounters", "(Lcom/unity3d/ads/core/data/model/TokenCounters;)V", "getGatewayCache", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPrivacy", "getPrivacyFsm", "incrementBannerImpressionCount", "", "incrementBannerLoadRequestAdmCount", "incrementBannerLoadRequestCount", "incrementLoadRequestAdmCount", "incrementLoadRequestCount", "incrementTokenSequenceNumber", "incrementTokenStartsCount", "incrementTokenWinsCount", "persistNativeConfiguration", "resetTokenCounters", "setGatewayCache", "(Lcom/google/protobuf/ByteString;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setPrivacy", "setPrivacyFsm", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidSessionRepository implements com.unity3d.ads.core.data.repository.SessionRepository {
    private final kotlinx.coroutines.flow.MutableStateFlow<com.google.protobuf.ByteString> _currentState;
    private kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> _gameId;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> _gatewayUrl;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Integer> _headerBiddingTokenCounter;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.unity3d.ads.core.data.model.InitializationState> _initializationState;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> _isTestModeEnabled;
    private kotlinx.coroutines.flow.MutableSharedFlow<com.unity3d.ads.core.data.model.SessionChange> _onChange;
    private final kotlinx.coroutines.flow.MutableStateFlow<gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration> _sdkConfiguration;
    private final kotlinx.coroutines.flow.MutableStateFlow<gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters> _sessionCounters;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.google.protobuf.ByteString> _sessionId;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.google.protobuf.ByteString> _sessionToken;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> _shouldInitialize;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.unity3d.ads.core.data.model.TokenCounters> _tokenCounters;
    private final com.unity3d.ads.core.data.datasource.ByteStringDataSource fsmDataSource;
    private final com.unity3d.ads.core.data.datasource.ByteStringDataSource gatewayCacheDataSource;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> isInit;
    private final com.unity3d.ads.core.data.datasource.ByteStringDataSource nativeConfigDataSource;
    private final kotlinx.coroutines.flow.SharedFlow<com.unity3d.ads.core.data.model.SessionChange> onChange;
    private final kotlinx.coroutines.flow.Flow<gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration> persistedNativeConfiguration;
    private final com.unity3d.ads.core.data.datasource.ByteStringDataSource privacyDataSource;

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.AndroidSessionRepository$getGatewayCache$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: AndroidSessionRepository.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.data.repository.AndroidSessionRepository", f = "AndroidSessionRepository.kt", i = {}, l = {org.objectweb.asm.Opcodes.MONITORENTER}, m = "getGatewayCache", n = {}, s = {})
    static final class C16451 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        int label;
        /* synthetic */ java.lang.Object result;

        C16451(kotlin.coroutines.Continuation<? super com.unity3d.ads.core.data.repository.AndroidSessionRepository.C16451> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return com.unity3d.ads.core.data.repository.AndroidSessionRepository.this.getGatewayCache(this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.AndroidSessionRepository$getPrivacy$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: AndroidSessionRepository.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.data.repository.AndroidSessionRepository", f = "AndroidSessionRepository.kt", i = {}, l = {org.objectweb.asm.Opcodes.MULTIANEWARRAY}, m = "getPrivacy", n = {}, s = {})
    static final class C16461 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        int label;
        /* synthetic */ java.lang.Object result;

        C16461(kotlin.coroutines.Continuation<? super com.unity3d.ads.core.data.repository.AndroidSessionRepository.C16461> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return com.unity3d.ads.core.data.repository.AndroidSessionRepository.this.getPrivacy(this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.AndroidSessionRepository$getPrivacyFsm$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: AndroidSessionRepository.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.data.repository.AndroidSessionRepository", f = "AndroidSessionRepository.kt", i = {}, l = {com.ironsource.g3.c.b.INSTANCE_LOAD_FAILED}, m = "getPrivacyFsm", n = {}, s = {})
    static final class C16471 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        int label;
        /* synthetic */ java.lang.Object result;

        C16471(kotlin.coroutines.Continuation<? super com.unity3d.ads.core.data.repository.AndroidSessionRepository.C16471> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return com.unity3d.ads.core.data.repository.AndroidSessionRepository.this.getPrivacyFsm(this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.AndroidSessionRepository$setPrivacy$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: AndroidSessionRepository.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.data.repository.AndroidSessionRepository", f = "AndroidSessionRepository.kt", i = {0, 0}, l = {org.objectweb.asm.Opcodes.IFNONNULL, 200}, m = "setPrivacy", n = {"this", "value"}, s = {"L$0", "L$1"})
    static final class C16481 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        int label;
        /* synthetic */ java.lang.Object result;

        C16481(kotlin.coroutines.Continuation<? super com.unity3d.ads.core.data.repository.AndroidSessionRepository.C16481> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return com.unity3d.ads.core.data.repository.AndroidSessionRepository.this.setPrivacy(null, this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.AndroidSessionRepository$setPrivacyFsm$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: AndroidSessionRepository.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.data.repository.AndroidSessionRepository", f = "AndroidSessionRepository.kt", i = {0, 0}, l = {com.ironsource.g3.c.b.INSTANCE_AUCTION_SUCCESS, com.ironsource.g3.c.b.INSTANCE_NOT_FOUND_IN_LOAD}, m = "setPrivacyFsm", n = {"this", "value"}, s = {"L$0", "L$1"})
    static final class C16491 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        int label;
        /* synthetic */ java.lang.Object result;

        C16491(kotlin.coroutines.Continuation<? super com.unity3d.ads.core.data.repository.AndroidSessionRepository.C16491> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return com.unity3d.ads.core.data.repository.AndroidSessionRepository.this.setPrivacyFsm(null, this);
        }
    }

    public AndroidSessionRepository(com.unity3d.ads.core.data.datasource.ByteStringDataSource gatewayCacheDataSource, com.unity3d.ads.core.data.datasource.ByteStringDataSource privacyDataSource, com.unity3d.ads.core.data.datasource.ByteStringDataSource fsmDataSource, com.unity3d.ads.core.data.datasource.ByteStringDataSource nativeConfigDataSource, gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration defaultNativeConfiguration, kotlinx.coroutines.CoroutineDispatcher dispatcher, com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gatewayCacheDataSource, "gatewayCacheDataSource");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(privacyDataSource, "privacyDataSource");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fsmDataSource, "fsmDataSource");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nativeConfigDataSource, "nativeConfigDataSource");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultNativeConfiguration, "defaultNativeConfiguration");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.gatewayCacheDataSource = gatewayCacheDataSource;
        this.privacyDataSource = privacyDataSource;
        this.fsmDataSource = fsmDataSource;
        this.nativeConfigDataSource = nativeConfigDataSource;
        kotlinx.coroutines.flow.MutableStateFlow<gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(defaultNativeConfiguration);
        this._sdkConfiguration = MutableStateFlow;
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> MutableStateFlow2 = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(false);
        this.isInit = MutableStateFlow2;
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(dispatcher), null, null, new com.unity3d.ads.core.data.repository.AndroidSessionRepository.AnonymousClass1(sendDiagnosticEvent, null), 3, null);
        final kotlinx.coroutines.flow.Flow flowFlowCombine = kotlinx.coroutines.flow.FlowKt.flowCombine(MutableStateFlow, MutableStateFlow2, new com.unity3d.ads.core.data.repository.AndroidSessionRepository$persistedNativeConfiguration$1(null));
        final kotlinx.coroutines.flow.Flow<kotlin.Pair<? extends gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration, ? extends java.lang.Boolean>> flow = new kotlinx.coroutines.flow.Flow<kotlin.Pair<? extends gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration, ? extends java.lang.Boolean>>() { // from class: com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$filter$1
            @Override // kotlinx.coroutines.flow.Flow
            public java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super kotlin.Pair<? extends gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration, ? extends java.lang.Boolean>> flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object objCollect = flowFlowCombine.collect(new com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$filter$1.AnonymousClass2(flowCollector), continuation);
                return objCollect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : kotlin.Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$filter$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: Emitters.kt */
            @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 8, 0}, xi = 48)
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector $this_unsafeFlow;

                /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$filter$1$2$1, reason: invalid class name */
                /* JADX INFO: compiled from: Emitters.kt */
                @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$filter$1$2", f = "AndroidSessionRepository.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    java.lang.Object L$0;
                    java.lang.Object L$1;
                    int label;
                    /* synthetic */ java.lang.Object result;

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$filter$1.AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0014  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    if (continuation instanceof com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label -= Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1(continuation);
                    }
                    java.lang.Object obj2 = anonymousClass1.result;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = anonymousClass1.label;
                    if (i == 0) {
                        kotlin.ResultKt.throwOnFailure(obj2);
                        kotlinx.coroutines.flow.FlowCollector flowCollector = this.$this_unsafeFlow;
                        if (((java.lang.Boolean) ((kotlin.Pair) obj).getSecond()).booleanValue()) {
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj2);
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }
        };
        this.persistedNativeConfiguration = new kotlinx.coroutines.flow.Flow<gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration>() { // from class: com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration> flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object objCollect = flow.collect(new com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$map$1.AnonymousClass2(flowCollector), continuation);
                return objCollect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : kotlin.Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: Emitters.kt */
            @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 8, 0}, xi = 48)
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector $this_unsafeFlow;

                /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$map$1$2$1, reason: invalid class name */
                /* JADX INFO: compiled from: Emitters.kt */
                @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$map$1$2", f = "AndroidSessionRepository.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    java.lang.Object L$0;
                    int label;
                    /* synthetic */ java.lang.Object result;

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$map$1.AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0014  */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$map$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    if (continuation instanceof com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label -= Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$map$1.AnonymousClass2.AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$map$1.AnonymousClass2.AnonymousClass1(continuation);
                    }
                    java.lang.Object obj2 = anonymousClass1.result;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = anonymousClass1.label;
                    if (i == 0) {
                        kotlin.ResultKt.throwOnFailure(obj2);
                        kotlinx.coroutines.flow.FlowCollector flowCollector = this.$this_unsafeFlow;
                        java.lang.Object first = ((kotlin.Pair) obj).getFirst();
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(first, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj2);
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }
        };
        kotlinx.coroutines.flow.MutableSharedFlow<com.unity3d.ads.core.data.model.SessionChange> mutableSharedFlowMutableSharedFlow$default = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this._onChange = mutableSharedFlowMutableSharedFlow$default;
        this.onChange = kotlinx.coroutines.flow.FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        java.lang.String gameId = com.unity3d.services.core.properties.ClientProperties.getGameId();
        this._gameId = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(gameId != null ? gameId : null);
        java.util.UUID uuidRandomUUID = java.util.UUID.randomUUID();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID()");
        this._sessionId = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toByteString(uuidRandomUUID));
        this._isTestModeEnabled = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(java.lang.Boolean.valueOf(com.unity3d.services.core.properties.SdkProperties.isTestMode()));
        gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters sessionCountersBuild = gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters.newBuilder().build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sessionCountersBuild, "newBuilder().build()");
        this._sessionCounters = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(sessionCountersBuild);
        this._tokenCounters = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(new com.unity3d.ads.core.data.model.TokenCounters(0, 0, 0));
        com.google.protobuf.ByteString EMPTY = com.google.protobuf.ByteString.EMPTY;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(EMPTY, "EMPTY");
        this._sessionToken = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(EMPTY);
        com.google.protobuf.ByteString EMPTY2 = com.google.protobuf.ByteString.EMPTY;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(EMPTY2, "EMPTY");
        this._currentState = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(EMPTY2);
        this._gatewayUrl = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(com.unity3d.services.UnityAdsConstants.DefaultUrls.GATEWAY_URL);
        this._initializationState = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(com.unity3d.ads.core.data.model.InitializationState.NOT_INITIALIZED);
        this._headerBiddingTokenCounter = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(0);
        this._shouldInitialize = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(true);
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.AndroidSessionRepository$1, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidSessionRepository.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.data.repository.AndroidSessionRepository$1", f = "AndroidSessionRepository.kt", i = {}, l = {48}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ com.unity3d.ads.core.domain.SendDiagnosticEvent $sendDiagnosticEvent;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.data.repository.AndroidSessionRepository.AnonymousClass1> continuation) {
            super(2, continuation);
            this.$sendDiagnosticEvent = sendDiagnosticEvent;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.unity3d.ads.core.data.repository.AndroidSessionRepository.this.new AnonymousClass1(this.$sendDiagnosticEvent, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.unity3d.ads.core.data.repository.AndroidSessionRepository.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    this.label = 1;
                    obj = com.unity3d.ads.core.data.repository.AndroidSessionRepository.this.nativeConfigDataSource.get(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                com.google.protobuf.ByteString data = ((com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore) obj).getData();
                if (!data.isEmpty()) {
                    kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow = com.unity3d.ads.core.data.repository.AndroidSessionRepository.this._sdkConfiguration;
                    gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration from = gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.parseFrom(data);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(from, "parseFrom(data)");
                    mutableStateFlow.setValue(from);
                }
            } catch (java.lang.Exception e) {
                com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent = this.$sendDiagnosticEvent;
                java.lang.String message = e.getMessage();
                if (message == null) {
                    message = "unknown";
                }
                com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_initialize_missed_native_parsing", null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("debugReason", message)), null, null, 26, null);
            }
            com.unity3d.ads.core.data.repository.AndroidSessionRepository.this.isInit.setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true));
            return kotlin.Unit.INSTANCE;
        }
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public kotlinx.coroutines.flow.SharedFlow<com.unity3d.ads.core.data.model.SessionChange> getOnChange() {
        return this.onChange;
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public java.lang.String getGameId() {
        java.lang.String value;
        java.lang.String gameId;
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> mutableStateFlow = this._gameId;
        do {
            value = mutableStateFlow.getValue();
            gameId = com.unity3d.services.core.properties.ClientProperties.getGameId();
            if (gameId == null) {
                gameId = null;
            }
        } while (!mutableStateFlow.compareAndSet(value, gameId));
        return gameId;
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setGameId(java.lang.String str) {
        java.lang.String value;
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> mutableStateFlow = this._gameId;
        do {
            value = mutableStateFlow.getValue();
            com.unity3d.services.core.properties.ClientProperties.setGameId(str);
        } while (!mutableStateFlow.compareAndSet(value, str));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public com.google.protobuf.ByteString getSessionId() {
        return this._sessionId.getValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public boolean isTestModeEnabled() {
        java.lang.Boolean value;
        java.lang.Boolean boolValueOf;
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> mutableStateFlow = this._isTestModeEnabled;
        do {
            value = mutableStateFlow.getValue();
            value.booleanValue();
            boolValueOf = java.lang.Boolean.valueOf(com.unity3d.services.core.properties.SdkProperties.isTestMode());
        } while (!mutableStateFlow.compareAndSet(value, boolValueOf));
        return boolValueOf.booleanValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters getSessionCounters() {
        return this._sessionCounters.getValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setSessionCounters(gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        kotlinx.coroutines.flow.MutableStateFlow<gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters> mutableStateFlow = this._sessionCounters;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), value)) {
        }
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public com.unity3d.ads.core.data.model.TokenCounters getTokenCounters() {
        return this._tokenCounters.getValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setTokenCounters(com.unity3d.ads.core.data.model.TokenCounters value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        kotlinx.coroutines.flow.MutableStateFlow<com.unity3d.ads.core.data.model.TokenCounters> mutableStateFlow = this._tokenCounters;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), value)) {
        }
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementLoadRequestCount() {
        gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters value;
        gatewayprotocol.v1.SessionCountersKt.Dsl dsl_create;
        kotlinx.coroutines.flow.MutableStateFlow<gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters> mutableStateFlow = this._sessionCounters;
        do {
            value = mutableStateFlow.getValue();
            gatewayprotocol.v1.SessionCountersKt.Dsl.Companion companion = gatewayprotocol.v1.SessionCountersKt.Dsl.INSTANCE;
            gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters.Builder builder = value.toBuilder();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builder, "this.toBuilder()");
            dsl_create = companion._create(builder);
            dsl_create.setLoadRequests(dsl_create.getLoadRequests() + 1);
        } while (!mutableStateFlow.compareAndSet(value, dsl_create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementLoadRequestAdmCount() {
        gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters value;
        gatewayprotocol.v1.SessionCountersKt.Dsl dsl_create;
        kotlinx.coroutines.flow.MutableStateFlow<gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters> mutableStateFlow = this._sessionCounters;
        do {
            value = mutableStateFlow.getValue();
            gatewayprotocol.v1.SessionCountersKt.Dsl.Companion companion = gatewayprotocol.v1.SessionCountersKt.Dsl.INSTANCE;
            gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters.Builder builder = value.toBuilder();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builder, "this.toBuilder()");
            dsl_create = companion._create(builder);
            dsl_create.setLoadRequestsAdm(dsl_create.getLoadRequestsAdm() + 1);
        } while (!mutableStateFlow.compareAndSet(value, dsl_create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementBannerLoadRequestCount() {
        gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters value;
        gatewayprotocol.v1.SessionCountersKt.Dsl dsl_create;
        kotlinx.coroutines.flow.MutableStateFlow<gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters> mutableStateFlow = this._sessionCounters;
        do {
            value = mutableStateFlow.getValue();
            gatewayprotocol.v1.SessionCountersKt.Dsl.Companion companion = gatewayprotocol.v1.SessionCountersKt.Dsl.INSTANCE;
            gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters.Builder builder = value.toBuilder();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builder, "this.toBuilder()");
            dsl_create = companion._create(builder);
            dsl_create.setBannerLoadRequests(dsl_create.getBannerLoadRequests() + 1);
        } while (!mutableStateFlow.compareAndSet(value, dsl_create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementBannerLoadRequestAdmCount() {
        gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters value;
        gatewayprotocol.v1.SessionCountersKt.Dsl dsl_create;
        kotlinx.coroutines.flow.MutableStateFlow<gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters> mutableStateFlow = this._sessionCounters;
        do {
            value = mutableStateFlow.getValue();
            gatewayprotocol.v1.SessionCountersKt.Dsl.Companion companion = gatewayprotocol.v1.SessionCountersKt.Dsl.INSTANCE;
            gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters.Builder builder = value.toBuilder();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builder, "this.toBuilder()");
            dsl_create = companion._create(builder);
            dsl_create.setBannerRequestsAdm(dsl_create.getBannerRequestsAdm() + 1);
        } while (!mutableStateFlow.compareAndSet(value, dsl_create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementBannerImpressionCount() {
        gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters value;
        gatewayprotocol.v1.SessionCountersKt.Dsl dsl_create;
        kotlinx.coroutines.flow.MutableStateFlow<gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters> mutableStateFlow = this._sessionCounters;
        do {
            value = mutableStateFlow.getValue();
            gatewayprotocol.v1.SessionCountersKt.Dsl.Companion companion = gatewayprotocol.v1.SessionCountersKt.Dsl.INSTANCE;
            gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters.Builder builder = value.toBuilder();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builder, "this.toBuilder()");
            dsl_create = companion._create(builder);
            dsl_create.setBannerImpressions(dsl_create.getBannerImpressions() + 1);
        } while (!mutableStateFlow.compareAndSet(value, dsl_create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementTokenSequenceNumber() {
        com.unity3d.ads.core.data.model.TokenCounters value;
        com.unity3d.ads.core.data.model.TokenCounters tokenCounters;
        kotlinx.coroutines.flow.MutableStateFlow<com.unity3d.ads.core.data.model.TokenCounters> mutableStateFlow = this._tokenCounters;
        do {
            value = mutableStateFlow.getValue();
            tokenCounters = value;
        } while (!mutableStateFlow.compareAndSet(value, com.unity3d.ads.core.data.model.TokenCounters.copy$default(tokenCounters, tokenCounters.getSeq() + 1, 0, 0, 6, null)));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementTokenWinsCount() {
        com.unity3d.ads.core.data.model.TokenCounters value;
        com.unity3d.ads.core.data.model.TokenCounters tokenCounters;
        kotlinx.coroutines.flow.MutableStateFlow<com.unity3d.ads.core.data.model.TokenCounters> mutableStateFlow = this._tokenCounters;
        do {
            value = mutableStateFlow.getValue();
            tokenCounters = value;
        } while (!mutableStateFlow.compareAndSet(value, com.unity3d.ads.core.data.model.TokenCounters.copy$default(tokenCounters, 0, tokenCounters.getWins() + 1, 0, 5, null)));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementTokenStartsCount() {
        com.unity3d.ads.core.data.model.TokenCounters value;
        com.unity3d.ads.core.data.model.TokenCounters tokenCounters;
        kotlinx.coroutines.flow.MutableStateFlow<com.unity3d.ads.core.data.model.TokenCounters> mutableStateFlow = this._tokenCounters;
        do {
            value = mutableStateFlow.getValue();
            tokenCounters = value;
        } while (!mutableStateFlow.compareAndSet(value, com.unity3d.ads.core.data.model.TokenCounters.copy$default(tokenCounters, 0, 0, tokenCounters.getStarts() + 1, 3, null)));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void resetTokenCounters() {
        kotlinx.coroutines.flow.MutableStateFlow<com.unity3d.ads.core.data.model.TokenCounters> mutableStateFlow = this._tokenCounters;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), new com.unity3d.ads.core.data.model.TokenCounters(0, 0, 0))) {
        }
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public com.google.protobuf.ByteString getSessionToken() {
        return this._sessionToken.getValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setSessionToken(com.google.protobuf.ByteString value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        kotlinx.coroutines.flow.MutableStateFlow<com.google.protobuf.ByteString> mutableStateFlow = this._sessionToken;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), value)) {
        }
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public com.google.protobuf.ByteString getGatewayState() {
        return this._currentState.getValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setGatewayState(com.google.protobuf.ByteString value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        kotlinx.coroutines.flow.MutableStateFlow<com.google.protobuf.ByteString> mutableStateFlow = this._currentState;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), value)) {
        }
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration getNativeConfiguration() {
        if (!this.isInit.getValue().booleanValue()) {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) kotlinx.coroutines.BuildersKt__BuildersKt.runBlocking$default(null, new com.unity3d.ads.core.data.repository.AndroidSessionRepository$nativeConfiguration$1(this, null), 1, null);
        }
        return this._sdkConfiguration.getValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setNativeConfiguration(gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        kotlinx.coroutines.flow.MutableStateFlow<gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration> mutableStateFlow = this._sdkConfiguration;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), value)) {
        }
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public java.lang.String getGatewayUrl() {
        return this._gatewayUrl.getValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setGatewayUrl(java.lang.String value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> mutableStateFlow = this._gatewayUrl;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), value)) {
        }
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public com.unity3d.ads.core.data.model.InitializationState getInitializationState() {
        return this._initializationState.getValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setInitializationState(com.unity3d.ads.core.data.model.InitializationState value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        kotlinx.coroutines.flow.MutableStateFlow<com.unity3d.ads.core.data.model.InitializationState> mutableStateFlow = this._initializationState;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), value)) {
        }
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public kotlinx.coroutines.flow.Flow<com.unity3d.ads.core.data.model.InitializationState> getObserveInitializationState() {
        return this._initializationState;
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public boolean isSdkInitialized() {
        return getInitializationState() == com.unity3d.ads.core.data.model.InitializationState.INITIALIZED;
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public boolean isDiagnosticsEnabled() {
        return getNativeConfiguration().getDiagnosticEvents().getEnabled();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags getFeatureFlags() {
        gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags featureFlags = getNativeConfiguration().getFeatureFlags();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(featureFlags, "nativeConfiguration.featureFlags");
        return featureFlags;
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public int getHeaderBiddingTokenCounter() {
        java.lang.Integer value;
        java.lang.Integer num;
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.Integer> mutableStateFlow = this._headerBiddingTokenCounter;
        do {
            value = mutableStateFlow.getValue();
            num = value;
        } while (!mutableStateFlow.compareAndSet(value, java.lang.Integer.valueOf(num.intValue() + 1)));
        return num.intValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public java.lang.Object getGatewayCache(kotlin.coroutines.Continuation<? super com.google.protobuf.ByteString> continuation) {
        com.unity3d.ads.core.data.repository.AndroidSessionRepository.C16451 c16451;
        if (continuation instanceof com.unity3d.ads.core.data.repository.AndroidSessionRepository.C16451) {
            c16451 = (com.unity3d.ads.core.data.repository.AndroidSessionRepository.C16451) continuation;
            if ((c16451.label & Integer.MIN_VALUE) != 0) {
                c16451.label -= Integer.MIN_VALUE;
            } else {
                c16451 = new com.unity3d.ads.core.data.repository.AndroidSessionRepository.C16451(continuation);
            }
        } else {
            c16451 = new com.unity3d.ads.core.data.repository.AndroidSessionRepository.C16451(continuation);
        }
        java.lang.Object obj = c16451.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c16451.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.unity3d.ads.core.data.datasource.ByteStringDataSource byteStringDataSource = this.gatewayCacheDataSource;
            c16451.label = 1;
            obj = byteStringDataSource.get(c16451);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.google.protobuf.ByteString data = ((com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore) obj).getData();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(data, "gatewayCacheDataSource.get().data");
        return data;
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public java.lang.Object setGatewayCache(com.google.protobuf.ByteString byteString, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object obj = this.gatewayCacheDataSource.set(byteString, continuation);
        return obj == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? obj : kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public java.lang.Object getPrivacy(kotlin.coroutines.Continuation<? super com.google.protobuf.ByteString> continuation) {
        com.unity3d.ads.core.data.repository.AndroidSessionRepository.C16461 c16461;
        if (continuation instanceof com.unity3d.ads.core.data.repository.AndroidSessionRepository.C16461) {
            c16461 = (com.unity3d.ads.core.data.repository.AndroidSessionRepository.C16461) continuation;
            if ((c16461.label & Integer.MIN_VALUE) != 0) {
                c16461.label -= Integer.MIN_VALUE;
            } else {
                c16461 = new com.unity3d.ads.core.data.repository.AndroidSessionRepository.C16461(continuation);
            }
        } else {
            c16461 = new com.unity3d.ads.core.data.repository.AndroidSessionRepository.C16461(continuation);
        }
        java.lang.Object obj = c16461.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c16461.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.unity3d.ads.core.data.datasource.ByteStringDataSource byteStringDataSource = this.privacyDataSource;
            c16461.label = 1;
            obj = byteStringDataSource.get(c16461);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.google.protobuf.ByteString data = ((com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore) obj).getData();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(data, "privacyDataSource.get().data");
        return data;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public java.lang.Object setPrivacy(com.google.protobuf.ByteString byteString, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.unity3d.ads.core.data.repository.AndroidSessionRepository.C16481 c16481;
        com.unity3d.ads.core.data.repository.AndroidSessionRepository androidSessionRepository;
        if (continuation instanceof com.unity3d.ads.core.data.repository.AndroidSessionRepository.C16481) {
            c16481 = (com.unity3d.ads.core.data.repository.AndroidSessionRepository.C16481) continuation;
            if ((c16481.label & Integer.MIN_VALUE) != 0) {
                c16481.label -= Integer.MIN_VALUE;
            } else {
                c16481 = new com.unity3d.ads.core.data.repository.AndroidSessionRepository.C16481(continuation);
            }
        } else {
            c16481 = new com.unity3d.ads.core.data.repository.AndroidSessionRepository.C16481(continuation);
        }
        java.lang.Object obj = c16481.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c16481.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.unity3d.ads.core.data.datasource.ByteStringDataSource byteStringDataSource = this.privacyDataSource;
            c16481.L$0 = this;
            c16481.L$1 = byteString;
            c16481.label = 1;
            if (byteStringDataSource.set(byteString, c16481) == coroutine_suspended) {
                return coroutine_suspended;
            }
            androidSessionRepository = this;
        } else {
            if (i == 1) {
                byteString = (com.google.protobuf.ByteString) c16481.L$1;
                androidSessionRepository = (com.unity3d.ads.core.data.repository.AndroidSessionRepository) c16481.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
            } else {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            return kotlin.Unit.INSTANCE;
        }
        kotlinx.coroutines.flow.MutableSharedFlow<com.unity3d.ads.core.data.model.SessionChange> mutableSharedFlow = androidSessionRepository._onChange;
        com.unity3d.ads.core.data.model.SessionChange.UserConsentChange userConsentChange = new com.unity3d.ads.core.data.model.SessionChange.UserConsentChange(byteString);
        c16481.L$0 = null;
        c16481.L$1 = null;
        c16481.label = 2;
        if (mutableSharedFlow.emit(userConsentChange, c16481) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public java.lang.Object getPrivacyFsm(kotlin.coroutines.Continuation<? super com.google.protobuf.ByteString> continuation) {
        com.unity3d.ads.core.data.repository.AndroidSessionRepository.C16471 c16471;
        if (continuation instanceof com.unity3d.ads.core.data.repository.AndroidSessionRepository.C16471) {
            c16471 = (com.unity3d.ads.core.data.repository.AndroidSessionRepository.C16471) continuation;
            if ((c16471.label & Integer.MIN_VALUE) != 0) {
                c16471.label -= Integer.MIN_VALUE;
            } else {
                c16471 = new com.unity3d.ads.core.data.repository.AndroidSessionRepository.C16471(continuation);
            }
        } else {
            c16471 = new com.unity3d.ads.core.data.repository.AndroidSessionRepository.C16471(continuation);
        }
        java.lang.Object obj = c16471.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c16471.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.unity3d.ads.core.data.datasource.ByteStringDataSource byteStringDataSource = this.fsmDataSource;
            c16471.label = 1;
            obj = byteStringDataSource.get(c16471);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.google.protobuf.ByteString data = ((com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore) obj).getData();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(data, "fsmDataSource.get().data");
        return data;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public java.lang.Object setPrivacyFsm(com.google.protobuf.ByteString byteString, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.unity3d.ads.core.data.repository.AndroidSessionRepository.C16491 c16491;
        com.unity3d.ads.core.data.repository.AndroidSessionRepository androidSessionRepository;
        if (continuation instanceof com.unity3d.ads.core.data.repository.AndroidSessionRepository.C16491) {
            c16491 = (com.unity3d.ads.core.data.repository.AndroidSessionRepository.C16491) continuation;
            if ((c16491.label & Integer.MIN_VALUE) != 0) {
                c16491.label -= Integer.MIN_VALUE;
            } else {
                c16491 = new com.unity3d.ads.core.data.repository.AndroidSessionRepository.C16491(continuation);
            }
        } else {
            c16491 = new com.unity3d.ads.core.data.repository.AndroidSessionRepository.C16491(continuation);
        }
        java.lang.Object obj = c16491.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c16491.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.unity3d.ads.core.data.datasource.ByteStringDataSource byteStringDataSource = this.fsmDataSource;
            c16491.L$0 = this;
            c16491.L$1 = byteString;
            c16491.label = 1;
            if (byteStringDataSource.set(byteString, c16491) == coroutine_suspended) {
                return coroutine_suspended;
            }
            androidSessionRepository = this;
        } else {
            if (i == 1) {
                byteString = (com.google.protobuf.ByteString) c16491.L$1;
                androidSessionRepository = (com.unity3d.ads.core.data.repository.AndroidSessionRepository) c16491.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
            } else {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            return kotlin.Unit.INSTANCE;
        }
        kotlinx.coroutines.flow.MutableSharedFlow<com.unity3d.ads.core.data.model.SessionChange> mutableSharedFlow = androidSessionRepository._onChange;
        com.unity3d.ads.core.data.model.SessionChange.PrivacyFsmChange privacyFsmChange = new com.unity3d.ads.core.data.model.SessionChange.PrivacyFsmChange(byteString);
        c16491.L$0 = null;
        c16491.L$1 = null;
        c16491.label = 2;
        if (mutableSharedFlow.emit(privacyFsmChange, c16491) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public boolean getShouldInitialize() {
        return this._shouldInitialize.getValue().booleanValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setShouldInitialize(boolean z) {
        java.lang.Boolean value;
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> mutableStateFlow = this._shouldInitialize;
        do {
            value = mutableStateFlow.getValue();
            value.booleanValue();
        } while (!mutableStateFlow.compareAndSet(value, java.lang.Boolean.valueOf(z)));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public boolean isOmEnabled() {
        return getNativeConfiguration().getEnableOm();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public java.lang.Object persistNativeConfiguration(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.unity3d.ads.core.data.datasource.ByteStringDataSource byteStringDataSource = this.nativeConfigDataSource;
        com.google.protobuf.ByteString byteString = getNativeConfiguration().toByteString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(byteString, "nativeConfiguration.toByteString()");
        java.lang.Object obj = byteStringDataSource.set(byteString, continuation);
        return obj == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? obj : kotlin.Unit.INSTANCE;
    }
}
