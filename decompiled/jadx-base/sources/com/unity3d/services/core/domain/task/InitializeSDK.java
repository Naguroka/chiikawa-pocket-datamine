package com.unity3d.services.core.domain.task;

/* JADX INFO: compiled from: InitializeSDK.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001BM\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015¢\u0006\u0002\u0010\u0016J*\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u00182\u0006\u0010\u0019\u001a\u00020\u0002H\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ<\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u00182\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"H\u0082@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b#\u0010$J\b\u0010%\u001a\u00020&H\u0016J\u0019\u0010'\u001a\u00020\u00032\u0006\u0010(\u001a\u00020)H\u0082@ø\u0001\u0002¢\u0006\u0002\u0010*R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006+"}, d2 = {"Lcom/unity3d/services/core/domain/task/InitializeSDK;", "Lcom/unity3d/services/core/domain/task/MetricTask;", "Lcom/unity3d/services/core/domain/task/EmptyParams;", "", "dispatchers", "Lcom/unity3d/services/core/domain/ISDKDispatchers;", "configFileFromLocalStorage", "Lcom/unity3d/services/core/domain/task/ConfigFileFromLocalStorage;", "initializeStateReset", "Lcom/unity3d/services/core/domain/task/InitializeStateReset;", "initializeStateError", "Lcom/unity3d/services/core/domain/task/InitializeStateError;", "initializeStateConfig", "Lcom/unity3d/services/core/domain/task/InitializeStateConfig;", "initializeStateCreate", "Lcom/unity3d/services/core/domain/task/InitializeStateCreate;", "initializeStateLoadCache", "Lcom/unity3d/services/core/domain/task/InitializeStateLoadCache;", "initializeStateLoadWeb", "Lcom/unity3d/services/core/domain/task/InitializeStateLoadWeb;", "initializeStateComplete", "Lcom/unity3d/services/core/domain/task/InitializeStateComplete;", "(Lcom/unity3d/services/core/domain/ISDKDispatchers;Lcom/unity3d/services/core/domain/task/ConfigFileFromLocalStorage;Lcom/unity3d/services/core/domain/task/InitializeStateReset;Lcom/unity3d/services/core/domain/task/InitializeStateError;Lcom/unity3d/services/core/domain/task/InitializeStateConfig;Lcom/unity3d/services/core/domain/task/InitializeStateCreate;Lcom/unity3d/services/core/domain/task/InitializeStateLoadCache;Lcom/unity3d/services/core/domain/task/InitializeStateLoadWeb;Lcom/unity3d/services/core/domain/task/InitializeStateComplete;)V", "doWork", "Lkotlin/Result;", "params", "doWork-gIAlu-s", "(Lcom/unity3d/services/core/domain/task/EmptyParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "executeErrorState", "errorState", "Lcom/unity3d/services/core/configuration/ErrorState;", "taskException", "", "configuration", "Lcom/unity3d/services/core/configuration/Configuration;", "executeErrorState-BWLJW6A", "(Lcom/unity3d/services/core/configuration/ErrorState;Ljava/lang/Throwable;Lcom/unity3d/services/core/configuration/Configuration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMetricName", "", "handleInitializationException", "exception", "Lcom/unity3d/services/core/domain/task/InitializationException;", "(Lcom/unity3d/services/core/domain/task/InitializationException;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class InitializeSDK extends com.unity3d.services.core.domain.task.MetricTask<com.unity3d.services.core.domain.task.EmptyParams, kotlin.Unit> {
    private final com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage configFileFromLocalStorage;
    private final com.unity3d.services.core.domain.ISDKDispatchers dispatchers;
    private final com.unity3d.services.core.domain.task.InitializeStateComplete initializeStateComplete;
    private final com.unity3d.services.core.domain.task.InitializeStateConfig initializeStateConfig;
    private final com.unity3d.services.core.domain.task.InitializeStateCreate initializeStateCreate;
    private final com.unity3d.services.core.domain.task.InitializeStateError initializeStateError;
    private final com.unity3d.services.core.domain.task.InitializeStateLoadCache initializeStateLoadCache;
    private final com.unity3d.services.core.domain.task.InitializeStateLoadWeb initializeStateLoadWeb;
    private final com.unity3d.services.core.domain.task.InitializeStateReset initializeStateReset;

    /* JADX INFO: renamed from: com.unity3d.services.core.domain.task.InitializeSDK$handleInitializationException$1, reason: invalid class name */
    /* JADX INFO: compiled from: InitializeSDK.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.services.core.domain.task.InitializeSDK", f = "InitializeSDK.kt", i = {0}, l = {102}, m = "handleInitializationException", n = {"exception"}, s = {"L$0"})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        int label;
        /* synthetic */ java.lang.Object result;

        AnonymousClass1(kotlin.coroutines.Continuation<? super com.unity3d.services.core.domain.task.InitializeSDK.AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return com.unity3d.services.core.domain.task.InitializeSDK.this.handleInitializationException(null, this);
        }
    }

    @Override // com.unity3d.services.core.domain.task.BaseTask
    /* JADX INFO: renamed from: doWork-gIAlu-s */
    public /* bridge */ /* synthetic */ java.lang.Object mo1218doWorkgIAlus(com.unity3d.services.core.domain.task.BaseParams baseParams, kotlin.coroutines.Continuation continuation) {
        return m1224doWorkgIAlus((com.unity3d.services.core.domain.task.EmptyParams) baseParams, (kotlin.coroutines.Continuation<? super kotlin.Result<kotlin.Unit>>) continuation);
    }

    public InitializeSDK(com.unity3d.services.core.domain.ISDKDispatchers dispatchers, com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage configFileFromLocalStorage, com.unity3d.services.core.domain.task.InitializeStateReset initializeStateReset, com.unity3d.services.core.domain.task.InitializeStateError initializeStateError, com.unity3d.services.core.domain.task.InitializeStateConfig initializeStateConfig, com.unity3d.services.core.domain.task.InitializeStateCreate initializeStateCreate, com.unity3d.services.core.domain.task.InitializeStateLoadCache initializeStateLoadCache, com.unity3d.services.core.domain.task.InitializeStateLoadWeb initializeStateLoadWeb, com.unity3d.services.core.domain.task.InitializeStateComplete initializeStateComplete) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configFileFromLocalStorage, "configFileFromLocalStorage");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initializeStateReset, "initializeStateReset");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initializeStateError, "initializeStateError");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initializeStateConfig, "initializeStateConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initializeStateCreate, "initializeStateCreate");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initializeStateLoadCache, "initializeStateLoadCache");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initializeStateLoadWeb, "initializeStateLoadWeb");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initializeStateComplete, "initializeStateComplete");
        this.dispatchers = dispatchers;
        this.configFileFromLocalStorage = configFileFromLocalStorage;
        this.initializeStateReset = initializeStateReset;
        this.initializeStateError = initializeStateError;
        this.initializeStateConfig = initializeStateConfig;
        this.initializeStateCreate = initializeStateCreate;
        this.initializeStateLoadCache = initializeStateLoadCache;
        this.initializeStateLoadWeb = initializeStateLoadWeb;
        this.initializeStateComplete = initializeStateComplete;
    }

    @Override // com.unity3d.services.core.domain.task.MetricTask
    public java.lang.String getMetricName() {
        return getMetricNameForInitializeTask(com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase.initializeMethodName);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX INFO: renamed from: doWork-gIAlu-s, reason: not valid java name */
    public java.lang.Object m1224doWorkgIAlus(com.unity3d.services.core.domain.task.EmptyParams emptyParams, kotlin.coroutines.Continuation<? super kotlin.Result<kotlin.Unit>> continuation) {
        com.unity3d.services.core.domain.task.InitializeSDK$doWork$1 initializeSDK$doWork$1;
        if (continuation instanceof com.unity3d.services.core.domain.task.InitializeSDK$doWork$1) {
            initializeSDK$doWork$1 = (com.unity3d.services.core.domain.task.InitializeSDK$doWork$1) continuation;
            if ((initializeSDK$doWork$1.label & Integer.MIN_VALUE) != 0) {
                initializeSDK$doWork$1.label -= Integer.MIN_VALUE;
            } else {
                initializeSDK$doWork$1 = new com.unity3d.services.core.domain.task.InitializeSDK$doWork$1(this, continuation);
            }
        } else {
            initializeSDK$doWork$1 = new com.unity3d.services.core.domain.task.InitializeSDK$doWork$1(this, continuation);
        }
        java.lang.Object objWithContext = initializeSDK$doWork$1.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = initializeSDK$doWork$1.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(objWithContext);
            kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher = this.dispatchers.getDefault();
            com.unity3d.services.core.domain.task.InitializeSDK$doWork$2 initializeSDK$doWork$2 = new com.unity3d.services.core.domain.task.InitializeSDK$doWork$2(this, null);
            initializeSDK$doWork$1.label = 1;
            objWithContext = kotlinx.coroutines.BuildersKt.withContext(coroutineDispatcher, initializeSDK$doWork$2, initializeSDK$doWork$1);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(objWithContext);
        }
        return ((kotlin.Result) objWithContext).getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final java.lang.Object handleInitializationException(com.unity3d.services.core.domain.task.InitializationException initializationException, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) throws com.unity3d.services.core.domain.task.InitializationException {
        com.unity3d.services.core.domain.task.InitializeSDK.AnonymousClass1 anonymousClass1;
        if (continuation instanceof com.unity3d.services.core.domain.task.InitializeSDK.AnonymousClass1) {
            anonymousClass1 = (com.unity3d.services.core.domain.task.InitializeSDK.AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new com.unity3d.services.core.domain.task.InitializeSDK.AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new com.unity3d.services.core.domain.task.InitializeSDK.AnonymousClass1(continuation);
        }
        java.lang.Object obj = anonymousClass1.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.unity3d.services.core.domain.task.InitializationException initializationException2 = (com.unity3d.services.core.domain.task.InitializationException) anonymousClass1.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
            ((kotlin.Result) obj).getValue();
            throw initializationException2;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.unity3d.services.core.configuration.ErrorState errorState = initializationException.getErrorState();
        java.lang.Throwable originalException = initializationException.getOriginalException();
        com.unity3d.services.core.configuration.Configuration config = initializationException.getConfig();
        anonymousClass1.L$0 = initializationException;
        anonymousClass1.label = 1;
        if (m1223executeErrorStateBWLJW6A(errorState, originalException, config, anonymousClass1) == coroutine_suspended) {
            return coroutine_suspended;
        }
        throw initializationException;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX INFO: renamed from: executeErrorState-BWLJW6A, reason: not valid java name */
    public final java.lang.Object m1223executeErrorStateBWLJW6A(com.unity3d.services.core.configuration.ErrorState errorState, java.lang.Throwable th, com.unity3d.services.core.configuration.Configuration configuration, kotlin.coroutines.Continuation<? super kotlin.Result<kotlin.Unit>> continuation) {
        com.unity3d.services.core.domain.task.InitializeSDK$executeErrorState$1 initializeSDK$executeErrorState$1;
        if (continuation instanceof com.unity3d.services.core.domain.task.InitializeSDK$executeErrorState$1) {
            initializeSDK$executeErrorState$1 = (com.unity3d.services.core.domain.task.InitializeSDK$executeErrorState$1) continuation;
            if ((initializeSDK$executeErrorState$1.label & Integer.MIN_VALUE) != 0) {
                initializeSDK$executeErrorState$1.label -= Integer.MIN_VALUE;
            } else {
                initializeSDK$executeErrorState$1 = new com.unity3d.services.core.domain.task.InitializeSDK$executeErrorState$1(this, continuation);
            }
        } else {
            initializeSDK$executeErrorState$1 = new com.unity3d.services.core.domain.task.InitializeSDK$executeErrorState$1(this, continuation);
        }
        java.lang.Object obj = initializeSDK$executeErrorState$1.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = initializeSDK$executeErrorState$1.label;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return ((kotlin.Result) obj).getValue();
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.unity3d.services.core.domain.task.InitializeStateError initializeStateError = this.initializeStateError;
        com.unity3d.services.core.domain.task.InitializeStateError.Params params = new com.unity3d.services.core.domain.task.InitializeStateError.Params(errorState, new java.lang.Exception(th != null ? th.getMessage() : null), configuration);
        initializeSDK$executeErrorState$1.label = 1;
        java.lang.Object obj2 = initializeStateError.mo1219invokegIAlus(params, initializeSDK$executeErrorState$1);
        return obj2 == coroutine_suspended ? coroutine_suspended : obj2;
    }
}
