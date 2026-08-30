package com.unity3d.ads.core.domain;

/* JADX INFO: compiled from: CommonInitAwaitingGetHeaderBiddingToken.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0011\u0010&\u001a\u00020'H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010(J\u001b\u0010)\u001a\u00020'2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096Bø\u0001\u0000¢\u0006\u0002\u0010*J\u001e\u0010+\u001a\u00020'2\b\u0010,\u001a\u0004\u0018\u00010-2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-H\u0002J\b\u0010/\u001a\u00020'H\u0002J\u0010\u00100\u001a\u00020'2\u0006\u00101\u001a\u00020-H\u0002R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010!\u001a\u00020\"ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010%\u001a\u0004\b#\u0010$\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00062"}, d2 = {"Lcom/unity3d/ads/core/domain/CommonInitAwaitingGetHeaderBiddingToken;", "Lcom/unity3d/ads/core/domain/GetAsyncHeaderBiddingToken;", "getHeaderBiddingToken", "Lcom/unity3d/ads/core/domain/GetHeaderBiddingToken;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "getInitializationState", "Lcom/unity3d/ads/core/domain/GetInitializationState;", "awaitInitialization", "Lcom/unity3d/ads/core/domain/AwaitInitialization;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "(Lcom/unity3d/ads/core/domain/GetHeaderBiddingToken;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;Lcom/unity3d/ads/core/domain/GetInitializationState;Lcom/unity3d/ads/core/domain/AwaitInitialization;Lcom/unity3d/ads/core/data/repository/SessionRepository;)V", "getAwaitInitialization", "()Lcom/unity3d/ads/core/domain/AwaitInitialization;", "didAwaitInit", "", "getGetHeaderBiddingToken", "()Lcom/unity3d/ads/core/domain/GetHeaderBiddingToken;", "getGetInitializationState", "()Lcom/unity3d/ads/core/domain/GetInitializationState;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/unity3d/ads/IUnityAdsTokenListener;", "getListener", "()Lcom/unity3d/ads/IUnityAdsTokenListener;", "setListener", "(Lcom/unity3d/ads/IUnityAdsTokenListener;)V", "getSendDiagnosticEvent", "()Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "getSessionRepository", "()Lcom/unity3d/ads/core/data/repository/SessionRepository;", "startState", "Lcom/unity3d/ads/core/data/model/InitializationState;", "startTime", "Lkotlin/time/TimeSource$Monotonic$ValueTimeMark;", "getStartTime-z9LOYto", "()J", "J", "fetchToken", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "invoke", "(Lcom/unity3d/ads/IUnityAdsTokenListener;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tokenFailure", "reason", "", "reasonDebug", "tokenStart", "tokenSuccess", "token", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CommonInitAwaitingGetHeaderBiddingToken implements com.unity3d.ads.core.domain.GetAsyncHeaderBiddingToken {
    private final com.unity3d.ads.core.domain.AwaitInitialization awaitInitialization;
    private boolean didAwaitInit;
    private final com.unity3d.ads.core.domain.GetHeaderBiddingToken getHeaderBiddingToken;
    private final com.unity3d.ads.core.domain.GetInitializationState getInitializationState;
    private com.unity3d.ads.IUnityAdsTokenListener listener;
    private final com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent;
    private final com.unity3d.ads.core.data.repository.SessionRepository sessionRepository;
    private com.unity3d.ads.core.data.model.InitializationState startState;
    private final long startTime;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$fetchToken$1, reason: invalid class name */
    /* JADX INFO: compiled from: CommonInitAwaitingGetHeaderBiddingToken.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken", f = "CommonInitAwaitingGetHeaderBiddingToken.kt", i = {0}, l = {81}, m = "fetchToken", n = {"this"}, s = {"L$0"})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        int label;
        /* synthetic */ java.lang.Object result;

        AnonymousClass1(kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken.AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken.this.fetchToken(this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$invoke$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: CommonInitAwaitingGetHeaderBiddingToken.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken", f = "CommonInitAwaitingGetHeaderBiddingToken.kt", i = {0}, l = {56, 73}, m = "invoke", n = {"this"}, s = {"L$0"})
    static final class C16511 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        int label;
        /* synthetic */ java.lang.Object result;

        C16511(kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken.C16511> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken.this.invoke(null, this);
        }
    }

    public CommonInitAwaitingGetHeaderBiddingToken(com.unity3d.ads.core.domain.GetHeaderBiddingToken getHeaderBiddingToken, com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent, com.unity3d.ads.core.domain.GetInitializationState getInitializationState, com.unity3d.ads.core.domain.AwaitInitialization awaitInitialization, com.unity3d.ads.core.data.repository.SessionRepository sessionRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getHeaderBiddingToken, "getHeaderBiddingToken");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getInitializationState, "getInitializationState");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(awaitInitialization, "awaitInitialization");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        this.getHeaderBiddingToken = getHeaderBiddingToken;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.getInitializationState = getInitializationState;
        this.awaitInitialization = awaitInitialization;
        this.sessionRepository = sessionRepository;
        this.startTime = kotlin.time.TimeSource.Monotonic.INSTANCE.m2767markNowz9LOYto();
    }

    public final com.unity3d.ads.core.domain.GetHeaderBiddingToken getGetHeaderBiddingToken() {
        return this.getHeaderBiddingToken;
    }

    public final com.unity3d.ads.core.domain.SendDiagnosticEvent getSendDiagnosticEvent() {
        return this.sendDiagnosticEvent;
    }

    public final com.unity3d.ads.core.domain.GetInitializationState getGetInitializationState() {
        return this.getInitializationState;
    }

    public final com.unity3d.ads.core.domain.AwaitInitialization getAwaitInitialization() {
        return this.awaitInitialization;
    }

    public final com.unity3d.ads.core.data.repository.SessionRepository getSessionRepository() {
        return this.sessionRepository;
    }

    /* JADX INFO: renamed from: getStartTime-z9LOYto, reason: not valid java name and from getter */
    public final long getStartTime() {
        return this.startTime;
    }

    public final com.unity3d.ads.IUnityAdsTokenListener getListener() {
        return this.listener;
    }

    public final void setListener(com.unity3d.ads.IUnityAdsTokenListener iUnityAdsTokenListener) {
        this.listener = iUnityAdsTokenListener;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0090 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // com.unity3d.ads.core.domain.GetAsyncHeaderBiddingToken
    public java.lang.Object invoke(com.unity3d.ads.IUnityAdsTokenListener iUnityAdsTokenListener, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken.C16511 c16511;
        com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken commonInitAwaitingGetHeaderBiddingToken;
        if (continuation instanceof com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken.C16511) {
            c16511 = (com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken.C16511) continuation;
            if ((c16511.label & Integer.MIN_VALUE) != 0) {
                c16511.label -= Integer.MIN_VALUE;
            } else {
                c16511 = new com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken.C16511(continuation);
            }
        } else {
            c16511 = new com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken.C16511(continuation);
        }
        java.lang.Object obj = c16511.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c16511.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.listener = iUnityAdsTokenListener;
            tokenStart();
            if (iUnityAdsTokenListener == null) {
                tokenFailure("listener_null", "IUnityAdsTokenListener is null");
                return kotlin.Unit.INSTANCE;
            }
            if (!this.sessionRepository.getShouldInitialize()) {
                tokenFailure("gateway", "!sessionRepository.shouldInitialize");
                return kotlin.Unit.INSTANCE;
            }
            long getTokenTimeoutMs = this.sessionRepository.getNativeConfiguration().getAdOperations().getGetTokenTimeoutMs();
            try {
                com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken.AnonymousClass2 anonymousClass2 = new com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken.AnonymousClass2(null);
                c16511.L$0 = this;
                c16511.label = 1;
                if (kotlinx.coroutines.TimeoutKt.withTimeout(getTokenTimeoutMs, anonymousClass2, c16511) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } catch (kotlinx.coroutines.TimeoutCancellationException unused) {
                commonInitAwaitingGetHeaderBiddingToken = this;
                c16511.L$0 = null;
                c16511.label = 2;
                if (commonInitAwaitingGetHeaderBiddingToken.fetchToken(c16511) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else if (i == 1) {
            commonInitAwaitingGetHeaderBiddingToken = (com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken) c16511.L$0;
            try {
                kotlin.ResultKt.throwOnFailure(obj);
            } catch (kotlinx.coroutines.TimeoutCancellationException unused2) {
                c16511.L$0 = null;
                c16511.label = 2;
                if (commonInitAwaitingGetHeaderBiddingToken.fetchToken(c16511) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$invoke$2, reason: invalid class name */
    /* JADX INFO: compiled from: CommonInitAwaitingGetHeaderBiddingToken.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$invoke$2", f = "CommonInitAwaitingGetHeaderBiddingToken.kt", i = {}, l = {59, 63, 67}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int label;

        /* JADX INFO: renamed from: com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$invoke$2$WhenMappings */
        /* JADX INFO: compiled from: CommonInitAwaitingGetHeaderBiddingToken.kt */
        @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[com.unity3d.ads.core.data.model.InitializationState.values().length];
                try {
                    iArr[com.unity3d.ads.core.data.model.InitializationState.INITIALIZED.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[com.unity3d.ads.core.data.model.InitializationState.FAILED.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                try {
                    iArr[com.unity3d.ads.core.data.model.InitializationState.NOT_INITIALIZED.ordinal()] = 3;
                } catch (java.lang.NoSuchFieldError unused3) {
                }
                try {
                    iArr[com.unity3d.ads.core.data.model.InitializationState.INITIALIZING.ordinal()] = 4;
                } catch (java.lang.NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        AnonymousClass2(kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken.AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken.AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:23:0x0068  */
        /* JADX WARN: Code duplicated, block: B:24:0x0072  */
        /* JADX WARN: Code duplicated, block: B:26:0x007f A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        if (!com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken.this.getSessionRepository().getShouldInitialize()) {
                            com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken.this.tokenFailure("gateway", "!sessionRepository.shouldInitialize");
                        } else {
                            this.label = 3;
                            if (com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken.this.fetchToken(this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else if (i != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
                kotlin.ResultKt.throwOnFailure(obj);
            } else {
                kotlin.ResultKt.throwOnFailure(obj);
                int i2 = com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken.AnonymousClass2.WhenMappings.$EnumSwitchMapping$0[com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken.this.getGetInitializationState().invoke().ordinal()];
                if (i2 == 1 || i2 == 2) {
                    this.label = 1;
                    if (com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken.this.fetchToken(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i2 == 3 || i2 == 4) {
                    com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken.this.didAwaitInit = true;
                    this.label = 2;
                    if (com.unity3d.ads.core.domain.AwaitInitialization.DefaultImpls.invoke$default(com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken.this.getAwaitInitialization(), 0L, this, 1, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    if (!com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken.this.getSessionRepository().getShouldInitialize()) {
                        com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken.this.tokenFailure("gateway", "!sessionRepository.shouldInitialize");
                    } else {
                        this.label = 3;
                        if (com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken.this.fetchToken(this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
            }
            return kotlin.Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final java.lang.Object fetchToken(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken.AnonymousClass1 anonymousClass1;
        com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken commonInitAwaitingGetHeaderBiddingToken;
        java.lang.String strRetrieveUnityCrashValue;
        java.lang.String str;
        if (continuation instanceof com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken.AnonymousClass1) {
            anonymousClass1 = (com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken.AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken.AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken.AnonymousClass1(continuation);
        }
        java.lang.Object objInvoke = anonymousClass1.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        java.lang.String str2 = null;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(objInvoke);
            try {
                com.unity3d.ads.core.domain.GetHeaderBiddingToken getHeaderBiddingToken = this.getHeaderBiddingToken;
                anonymousClass1.L$0 = this;
                anonymousClass1.label = 1;
                objInvoke = getHeaderBiddingToken.invoke(anonymousClass1);
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
                commonInitAwaitingGetHeaderBiddingToken = this;
            } catch (java.lang.Exception e) {
                e = e;
                commonInitAwaitingGetHeaderBiddingToken = this;
                strRetrieveUnityCrashValue = com.unity3d.ads.core.extensions.ExceptionExtensionsKt.retrieveUnityCrashValue(e);
                str = "uncaught_exception";
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            commonInitAwaitingGetHeaderBiddingToken = (com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken) anonymousClass1.L$0;
            try {
                kotlin.ResultKt.throwOnFailure(objInvoke);
            } catch (java.lang.Exception e2) {
                e = e2;
                strRetrieveUnityCrashValue = com.unity3d.ads.core.extensions.ExceptionExtensionsKt.retrieveUnityCrashValue(e);
                str = "uncaught_exception";
            }
        }
        str = null;
        str2 = (java.lang.String) objInvoke;
        strRetrieveUnityCrashValue = null;
        if (str2 == null) {
            commonInitAwaitingGetHeaderBiddingToken.tokenFailure(str, strRetrieveUnityCrashValue);
        } else {
            commonInitAwaitingGetHeaderBiddingToken.tokenSuccess(str2);
        }
        return kotlin.Unit.INSTANCE;
    }

    private final void tokenSuccess(final java.lang.String token) {
        com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_gateway_token_success_time", java.lang.Double.valueOf(com.unity3d.ads.core.extensions.TimeExtensionsKt.elapsedMillis(kotlin.time.TimeSource.Monotonic.ValueTimeMark.m2768boximpl(this.startTime))), kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("sync", "false"), kotlin.TuplesKt.to("state", java.lang.String.valueOf(this.startState)), kotlin.TuplesKt.to("complete_state", this.getInitializationState.invoke().toString()), kotlin.TuplesKt.to("awaited_init", java.lang.String.valueOf(this.didAwaitInit))), null, null, 24, null);
        com.unity3d.services.core.misc.Utilities.wrapCustomerListener(new java.lang.Runnable() { // from class: com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken.tokenSuccess$lambda$0(this.f$0, token);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void tokenSuccess$lambda$0(com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken this$0, java.lang.String token) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(token, "$token");
        com.unity3d.ads.IUnityAdsTokenListener iUnityAdsTokenListener = this$0.listener;
        if (iUnityAdsTokenListener != null) {
            iUnityAdsTokenListener.onUnityAdsTokenReady(token);
        }
    }

    static /* synthetic */ void tokenFailure$default(com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken commonInitAwaitingGetHeaderBiddingToken, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        commonInitAwaitingGetHeaderBiddingToken.tokenFailure(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void tokenFailure(java.lang.String reason, java.lang.String reasonDebug) {
        com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
        java.lang.Double dValueOf = java.lang.Double.valueOf(com.unity3d.ads.core.extensions.TimeExtensionsKt.elapsedMillis(kotlin.time.TimeSource.Monotonic.ValueTimeMark.m2768boximpl(this.startTime)));
        java.util.Map mapCreateMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
        mapCreateMapBuilder.put("sync", "false");
        mapCreateMapBuilder.put("state", java.lang.String.valueOf(this.startState));
        mapCreateMapBuilder.put("complete_state", this.getInitializationState.invoke().toString());
        mapCreateMapBuilder.put("awaited_init", java.lang.String.valueOf(this.didAwaitInit));
        if (reason != null) {
        }
        if (reasonDebug != null) {
            mapCreateMapBuilder.put("reason_debug", reasonDebug);
        }
        kotlin.Unit unit = kotlin.Unit.INSTANCE;
        com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_gateway_token_failure_time", dValueOf, kotlin.collections.MapsKt.build(mapCreateMapBuilder), null, null, 24, null);
        com.unity3d.services.core.misc.Utilities.wrapCustomerListener(new java.lang.Runnable() { // from class: com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken.tokenFailure$lambda$4(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void tokenFailure$lambda$4(com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        com.unity3d.ads.IUnityAdsTokenListener iUnityAdsTokenListener = this$0.listener;
        if (iUnityAdsTokenListener != null) {
            iUnityAdsTokenListener.onUnityAdsTokenReady(null);
        }
    }

    private final void tokenStart() {
        this.startState = this.getInitializationState.invoke();
        com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_gateway_token_started", null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("sync", "false"), kotlin.TuplesKt.to("state", java.lang.String.valueOf(this.startState))), null, null, 26, null);
    }
}
