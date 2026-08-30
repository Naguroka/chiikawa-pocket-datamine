package com.unity3d.services.core.domain.task;

/* JADX INFO: compiled from: InitializeStateConfigWithLoader.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/unity3d/services/core/configuration/Configuration;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$doWork$2", f = "InitializeStateConfigWithLoader.kt", i = {0, 0, 0, 1, 1, 2}, l = {58, 101, 109}, m = "invokeSuspend", n = {"$this$withContext", "configurationLoader", "config", "configurationLoader", "config", "config"}, s = {"L$0", "L$3", "L$4", "L$2", "L$3", "L$0"})
final class InitializeStateConfigWithLoader$doWork$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Result<? extends com.unity3d.services.core.configuration.Configuration>>, java.lang.Object> {
    final /* synthetic */ com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader.Params $params;
    private /* synthetic */ java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    java.lang.Object L$3;
    java.lang.Object L$4;
    int label;
    final /* synthetic */ com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InitializeStateConfigWithLoader$doWork$2(com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader initializeStateConfigWithLoader, com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader.Params params, kotlin.coroutines.Continuation<? super com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$doWork$2> continuation) {
        super(2, continuation);
        this.this$0 = initializeStateConfigWithLoader;
        this.$params = params;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$doWork$2 initializeStateConfigWithLoader$doWork$2 = new com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$doWork$2(this.this$0, this.$params, continuation);
        initializeStateConfigWithLoader$doWork$2.L$0 = obj;
        return initializeStateConfigWithLoader$doWork$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Result<? extends com.unity3d.services.core.configuration.Configuration>> continuation) {
        return ((com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$doWork$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:53:0x01c0 A[Catch: all -> 0x022e, CancellationException -> 0x025b, TryCatch #7 {CancellationException -> 0x025b, all -> 0x022e, blocks: (B:8:0x001d, B:57:0x01f2, B:63:0x0223, B:51:0x01b8, B:53:0x01c0, B:58:0x01fc, B:59:0x020e, B:50:0x01ae, B:38:0x016c, B:40:0x0175, B:60:0x020f, B:61:0x021c, B:62:0x021d, B:37:0x0162, B:23:0x007e), top: B:87:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:55:0x01ef A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:56:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:58:0x01fc A[Catch: all -> 0x022e, CancellationException -> 0x025b, TryCatch #7 {CancellationException -> 0x025b, all -> 0x022e, blocks: (B:8:0x001d, B:57:0x01f2, B:63:0x0223, B:51:0x01b8, B:53:0x01c0, B:58:0x01fc, B:59:0x020e, B:50:0x01ae, B:38:0x016c, B:40:0x0175, B:60:0x020f, B:61:0x021c, B:62:0x021d, B:37:0x0162, B:23:0x007e), top: B:87:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:69:0x023f  */
    /* JADX WARN: Code duplicated, block: B:70:0x0246  */
    /* JADX WARN: Code duplicated, block: B:72:0x024c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [T, com.unity3d.services.core.configuration.Configuration] */
    /* JADX WARN: Type inference failed for: r5v1, types: [T, com.unity3d.services.core.configuration.ConfigurationLoader] */
    /* JADX WARN: Type inference failed for: r5v2, types: [T, com.unity3d.services.core.configuration.PrivacyConfigurationLoader] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object objM1301constructorimpl;
        java.lang.Throwable thM1304exceptionOrNullimpl;
        kotlin.jvm.internal.Ref.ObjectRef objectRef;
        kotlin.jvm.internal.Ref.ObjectRef objectRef2;
        kotlin.jvm.internal.Ref.ObjectRef objectRef3;
        com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader initializeStateConfigWithLoader;
        com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader.Params params;
        java.lang.Object objM1301constructorimpl2;
        com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader initializeStateConfigWithLoader2;
        com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader.Params params2;
        kotlin.jvm.internal.Ref.ObjectRef objectRef4;
        kotlin.jvm.internal.Ref.ObjectRef objectRef5;
        kotlin.jvm.internal.Ref.ObjectRef objectRef6;
        java.lang.Object value;
        java.lang.Object objM1301constructorimpl3;
        kotlin.jvm.internal.Ref.ObjectRef objectRef7;
        com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader.Params params3;
        kotlinx.coroutines.CoroutineDispatcher io;
        com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$doWork$2$1$1 initializeStateConfigWithLoader$doWork$2$1$1;
        kotlin.jvm.internal.Ref.ObjectRef objectRef8;
        kotlin.jvm.internal.Ref.ObjectRef objectRef9;
        T t;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.L$0;
                com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader initializeStateConfigWithLoader3 = this.this$0;
                com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader.Params params4 = this.$params;
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                com.unity3d.services.core.configuration.PrivacyConfigStorage privacyConfigStorage = com.unity3d.services.core.configuration.PrivacyConfigStorage.getInstance();
                com.unity3d.services.core.device.reader.DeviceInfoDataFactory deviceInfoDataFactory = new com.unity3d.services.core.device.reader.DeviceInfoDataFactory(initializeStateConfigWithLoader3.sdkMetricsSender);
                kotlin.jvm.internal.Ref.ObjectRef objectRef10 = new kotlin.jvm.internal.Ref.ObjectRef();
                objectRef10.element = new com.unity3d.services.core.configuration.ConfigurationLoader(new com.unity3d.services.core.configuration.ConfigurationRequestFactory(params4.getConfig(), deviceInfoDataFactory.getDeviceInfoData(com.unity3d.services.core.configuration.InitRequestType.TOKEN)), initializeStateConfigWithLoader3.sdkMetricsSender, (com.unity3d.services.core.network.core.HttpClient) initializeStateConfigWithLoader3.getServiceProvider().getRegistry().getService("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.services.core.network.core.HttpClient.class)));
                objectRef10.element = new com.unity3d.services.core.configuration.PrivacyConfigurationLoader((com.unity3d.services.core.configuration.IConfigurationLoader) objectRef10.element, new com.unity3d.services.core.configuration.ConfigurationRequestFactory(params4.getConfig(), deviceInfoDataFactory.getDeviceInfoData(com.unity3d.services.core.configuration.InitRequestType.PRIVACY)), privacyConfigStorage, (com.unity3d.services.core.network.core.HttpClient) initializeStateConfigWithLoader3.getServiceProvider().getRegistry().getService("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.services.core.network.core.HttpClient.class)));
                kotlin.jvm.internal.Ref.ObjectRef objectRef11 = new kotlin.jvm.internal.Ref.ObjectRef();
                objectRef11.element = new com.unity3d.services.core.configuration.Configuration();
                try {
                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                    int maxRetries = params4.getConfig().getMaxRetries();
                    double retryScalingFactor = params4.getConfig().getRetryScalingFactor();
                    long retryDelay = params4.getConfig().getRetryDelay();
                    com.unity3d.services.core.domain.task.InitializationException initializationException = new com.unity3d.services.core.domain.task.InitializationException(com.unity3d.services.core.configuration.ErrorState.NetworkConfigRequest, new java.lang.Exception(), params4.getConfig());
                    com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$doWork$2$1$configResult$1$1 initializeStateConfigWithLoader$doWork$2$1$configResult$1$1 = new com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$doWork$2$1$configResult$1$1(initializeStateConfigWithLoader3, objectRef10, objectRef11, null);
                    this.L$0 = coroutineScope;
                    this.L$1 = initializeStateConfigWithLoader3;
                    this.L$2 = params4;
                    this.L$3 = objectRef10;
                    this.L$4 = objectRef11;
                    this.label = 1;
                    objectRef = objectRef10;
                    try {
                        if (com.unity3d.services.core.extensions.TaskExtensionsKt.withRetry(retryDelay, maxRetries, retryScalingFactor, initializationException, initializeStateConfigWithLoader$doWork$2$1$configResult$1$1, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        objectRef2 = objectRef11;
                        objectRef3 = objectRef;
                        initializeStateConfigWithLoader = initializeStateConfigWithLoader3;
                        params = params4;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        objectRef2 = objectRef11;
                        objectRef3 = objectRef;
                        initializeStateConfigWithLoader = initializeStateConfigWithLoader3;
                        params = params4;
                        kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                        objM1301constructorimpl2 = kotlin.Result.m1301constructorimpl(kotlin.ResultKt.createFailure(th));
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    objectRef = objectRef10;
                }
            } else {
                if (i == 1) {
                    objectRef2 = (kotlin.jvm.internal.Ref.ObjectRef) this.L$4;
                    objectRef3 = (kotlin.jvm.internal.Ref.ObjectRef) this.L$3;
                    params = (com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader.Params) this.L$2;
                    initializeStateConfigWithLoader = (com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader) this.L$1;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                        kotlin.Result.Companion companion4 = kotlin.Result.INSTANCE;
                        objM1301constructorimpl2 = kotlin.Result.m1301constructorimpl(kotlin.ResultKt.createFailure(th));
                    }
                } else if (i == 2) {
                    objectRef2 = (kotlin.jvm.internal.Ref.ObjectRef) this.L$4;
                    objectRef6 = (kotlin.jvm.internal.Ref.ObjectRef) this.L$3;
                    objectRef4 = (kotlin.jvm.internal.Ref.ObjectRef) this.L$2;
                    params2 = (com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader.Params) this.L$1;
                    initializeStateConfigWithLoader2 = (com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader) this.L$0;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                        value = ((kotlin.Result) obj).getValue();
                        objM1301constructorimpl3 = kotlin.Result.m1301constructorimpl(kotlin.Result.m1300boximpl(value));
                    } catch (java.lang.Throwable th4) {
                        th = th4;
                        kotlin.Result.Companion companion5 = kotlin.Result.INSTANCE;
                        objM1301constructorimpl3 = kotlin.Result.m1301constructorimpl(kotlin.ResultKt.createFailure(th));
                    }
                    objectRef7 = objectRef6;
                    params3 = params2;
                    if (kotlin.Result.m1308isSuccessimpl(objM1301constructorimpl3)) {
                        com.unity3d.services.core.configuration.InitializeEventsMetricSender.getInstance().onRetryConfig();
                        io = initializeStateConfigWithLoader2.dispatchers.getIo();
                        initializeStateConfigWithLoader$doWork$2$1$1 = new com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$doWork$2$1$1(objectRef4, objectRef7, initializeStateConfigWithLoader2, params3, null);
                        this.L$0 = objectRef7;
                        this.L$1 = objectRef2;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.label = 3;
                        if (kotlinx.coroutines.BuildersKt.withContext(io, initializeStateConfigWithLoader$doWork$2$1$1, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        objectRef8 = objectRef2;
                        objectRef9 = objectRef7;
                    } else {
                        throw new com.unity3d.services.core.domain.task.InitializationException(com.unity3d.services.core.configuration.ErrorState.NetworkConfigRequest, new java.lang.Exception("No connected events within the timeout!"), params3.getConfig());
                    }
                } else {
                    if (i != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    objectRef8 = (kotlin.jvm.internal.Ref.ObjectRef) this.L$1;
                    objectRef9 = (kotlin.jvm.internal.Ref.ObjectRef) this.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                com.unity3d.services.core.configuration.Configuration configuration = (com.unity3d.services.core.configuration.Configuration) objectRef9.element;
                kotlin.jvm.internal.Ref.ObjectRef objectRef12 = objectRef9;
                objectRef2 = objectRef8;
                objectRef5 = objectRef12;
                t = configuration;
                objectRef2.element = t;
                objM1301constructorimpl = kotlin.Result.m1301constructorimpl((com.unity3d.services.core.configuration.Configuration) objectRef5.element);
                if (kotlin.Result.m1308isSuccessimpl(objM1301constructorimpl)) {
                    kotlin.Result.Companion companion6 = kotlin.Result.INSTANCE;
                    objM1301constructorimpl = kotlin.Result.m1301constructorimpl(objM1301constructorimpl);
                } else {
                    thM1304exceptionOrNullimpl = kotlin.Result.m1304exceptionOrNullimpl(objM1301constructorimpl);
                    if (thM1304exceptionOrNullimpl != null) {
                        kotlin.Result.Companion companion7 = kotlin.Result.INSTANCE;
                        objM1301constructorimpl = kotlin.Result.m1301constructorimpl(kotlin.ResultKt.createFailure(thM1304exceptionOrNullimpl));
                    }
                }
                return kotlin.Result.m1300boximpl(objM1301constructorimpl);
            }
            objM1301constructorimpl2 = kotlin.Result.m1301constructorimpl(kotlin.Unit.INSTANCE);
            initializeStateConfigWithLoader2 = initializeStateConfigWithLoader;
            params2 = params;
            objectRef4 = objectRef3;
            if (kotlin.Result.m1307isFailureimpl(objM1301constructorimpl2)) {
                java.lang.Throwable thM1304exceptionOrNullimpl2 = kotlin.Result.m1304exceptionOrNullimpl(objM1301constructorimpl2);
                if (thM1304exceptionOrNullimpl2 instanceof com.unity3d.services.core.extensions.AbortRetryException) {
                    throw new com.unity3d.services.core.domain.task.InitializationException(com.unity3d.services.core.configuration.ErrorState.NetworkConfigRequest, (java.lang.Exception) thM1304exceptionOrNullimpl2, params2.getConfig());
                }
                try {
                    kotlin.Result.Companion companion8 = kotlin.Result.INSTANCE;
                    com.unity3d.services.core.domain.task.InitializeStateNetworkError initializeStateNetworkError = initializeStateConfigWithLoader2.initializeStateNetworkError;
                    com.unity3d.services.core.domain.task.InitializeStateNetworkError.Params params5 = new com.unity3d.services.core.domain.task.InitializeStateNetworkError.Params(params2.getConfig());
                    this.L$0 = initializeStateConfigWithLoader2;
                    this.L$1 = params2;
                    this.L$2 = objectRef4;
                    this.L$3 = objectRef2;
                    this.L$4 = objectRef2;
                    this.label = 2;
                    value = initializeStateNetworkError.mo1219invokegIAlus(params5, this);
                    if (value == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    objectRef6 = objectRef2;
                    objM1301constructorimpl3 = kotlin.Result.m1301constructorimpl(kotlin.Result.m1300boximpl(value));
                    objectRef7 = objectRef6;
                    params3 = params2;
                    if (kotlin.Result.m1308isSuccessimpl(objM1301constructorimpl3)) {
                        com.unity3d.services.core.configuration.InitializeEventsMetricSender.getInstance().onRetryConfig();
                        io = initializeStateConfigWithLoader2.dispatchers.getIo();
                        initializeStateConfigWithLoader$doWork$2$1$1 = new com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$doWork$2$1$1(objectRef4, objectRef7, initializeStateConfigWithLoader2, params3, null);
                        this.L$0 = objectRef7;
                        this.L$1 = objectRef2;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.label = 3;
                        if (kotlinx.coroutines.BuildersKt.withContext(io, initializeStateConfigWithLoader$doWork$2$1$1, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        objectRef8 = objectRef2;
                        objectRef9 = objectRef7;
                        com.unity3d.services.core.configuration.Configuration configuration2 = (com.unity3d.services.core.configuration.Configuration) objectRef9.element;
                        kotlin.jvm.internal.Ref.ObjectRef objectRef13 = objectRef9;
                        objectRef2 = objectRef8;
                        objectRef5 = objectRef13;
                        t = configuration2;
                    } else {
                        throw new com.unity3d.services.core.domain.task.InitializationException(com.unity3d.services.core.configuration.ErrorState.NetworkConfigRequest, new java.lang.Exception("No connected events within the timeout!"), params3.getConfig());
                    }
                } catch (java.lang.Throwable th5) {
                    th = th5;
                    objectRef6 = objectRef2;
                    kotlin.Result.Companion companion9 = kotlin.Result.INSTANCE;
                    objM1301constructorimpl3 = kotlin.Result.m1301constructorimpl(kotlin.ResultKt.createFailure(th));
                }
            } else {
                objectRef5 = objectRef2;
                t = (com.unity3d.services.core.configuration.Configuration) objectRef2.element;
            }
            objectRef2.element = t;
            objM1301constructorimpl = kotlin.Result.m1301constructorimpl((com.unity3d.services.core.configuration.Configuration) objectRef5.element);
        } catch (java.util.concurrent.CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion10 = kotlin.Result.INSTANCE;
            objM1301constructorimpl = kotlin.Result.m1301constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        if (kotlin.Result.m1308isSuccessimpl(objM1301constructorimpl)) {
            kotlin.Result.Companion companion11 = kotlin.Result.INSTANCE;
            objM1301constructorimpl = kotlin.Result.m1301constructorimpl(objM1301constructorimpl);
        } else {
            thM1304exceptionOrNullimpl = kotlin.Result.m1304exceptionOrNullimpl(objM1301constructorimpl);
            if (thM1304exceptionOrNullimpl != null) {
                kotlin.Result.Companion companion12 = kotlin.Result.INSTANCE;
                objM1301constructorimpl = kotlin.Result.m1301constructorimpl(kotlin.ResultKt.createFailure(thM1304exceptionOrNullimpl));
            }
        }
        return kotlin.Result.m1300boximpl(objM1301constructorimpl);
    }
}
