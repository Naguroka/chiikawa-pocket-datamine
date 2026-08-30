package com.unity3d.services.core.domain.task;

/* JADX INFO: compiled from: InitializeStateConfig.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/unity3d/services/core/configuration/Configuration;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.services.core.domain.task.InitializeStateConfig$doWork$2", f = "InitializeStateConfig.kt", i = {0}, l = {32}, m = "invokeSuspend", n = {"configuration"}, s = {"L$0"})
final class InitializeStateConfig$doWork$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Result<? extends com.unity3d.services.core.configuration.Configuration>>, java.lang.Object> {
    final /* synthetic */ com.unity3d.services.core.domain.task.InitializeStateConfig.Params $params;
    java.lang.Object L$0;
    int label;
    final /* synthetic */ com.unity3d.services.core.domain.task.InitializeStateConfig this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InitializeStateConfig$doWork$2(com.unity3d.services.core.domain.task.InitializeStateConfig.Params params, com.unity3d.services.core.domain.task.InitializeStateConfig initializeStateConfig, kotlin.coroutines.Continuation<? super com.unity3d.services.core.domain.task.InitializeStateConfig$doWork$2> continuation) {
        super(2, continuation);
        this.$params = params;
        this.this$0 = initializeStateConfig;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.unity3d.services.core.domain.task.InitializeStateConfig$doWork$2(this.$params, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Result<? extends com.unity3d.services.core.configuration.Configuration>> continuation) {
        return ((com.unity3d.services.core.domain.task.InitializeStateConfig$doWork$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object objM1301constructorimpl;
        java.lang.Object objMo1219invokegIAlus;
        com.unity3d.services.core.configuration.Configuration configuration = "Unity Ads init: load configuration from ";
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            try {
                if (i == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.unity3d.services.core.domain.task.InitializeStateConfig.Params params = this.$params;
                    com.unity3d.services.core.domain.task.InitializeStateConfig initializeStateConfig = this.this$0;
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    com.unity3d.services.core.log.DeviceLog.info("Unity Ads init: load configuration from " + com.unity3d.services.core.properties.SdkProperties.getConfigUrl());
                    com.unity3d.services.core.configuration.Configuration configuration2 = new com.unity3d.services.core.configuration.Configuration(com.unity3d.services.core.properties.SdkProperties.getConfigUrl(), params.getConfig().getExperimentsReader());
                    com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader initializeStateConfigWithLoader = initializeStateConfig.initializeStateConfigWithLoader;
                    com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader.Params params2 = new com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader.Params(configuration2);
                    this.L$0 = configuration2;
                    this.label = 1;
                    objMo1219invokegIAlus = initializeStateConfigWithLoader.mo1219invokegIAlus((com.unity3d.services.core.domain.task.BaseParams) params2, (kotlin.coroutines.Continuation<? super kotlin.Result<? extends com.unity3d.services.core.configuration.Configuration>>) this);
                    configuration = configuration2;
                    if (objMo1219invokegIAlus == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.unity3d.services.core.configuration.Configuration configuration3 = (com.unity3d.services.core.configuration.Configuration) this.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    objMo1219invokegIAlus = ((kotlin.Result) obj).getValue();
                    configuration = configuration3;
                }
                kotlin.ResultKt.throwOnFailure(objMo1219invokegIAlus);
                objM1301constructorimpl = kotlin.Result.m1301constructorimpl((com.unity3d.services.core.configuration.Configuration) objMo1219invokegIAlus);
            } catch (com.unity3d.services.core.request.NetworkIOException e) {
                throw new com.unity3d.services.core.domain.task.InitializationException(com.unity3d.services.core.configuration.ErrorState.NetworkConfigRequest, e, configuration);
            }
        } catch (java.util.concurrent.CancellationException e2) {
            throw e2;
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            objM1301constructorimpl = kotlin.Result.m1301constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        if (kotlin.Result.m1308isSuccessimpl(objM1301constructorimpl)) {
            kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
            objM1301constructorimpl = kotlin.Result.m1301constructorimpl(objM1301constructorimpl);
        } else {
            java.lang.Throwable thM1304exceptionOrNullimpl = kotlin.Result.m1304exceptionOrNullimpl(objM1301constructorimpl);
            if (thM1304exceptionOrNullimpl != null) {
                kotlin.Result.Companion companion4 = kotlin.Result.INSTANCE;
                objM1301constructorimpl = kotlin.Result.m1301constructorimpl(kotlin.ResultKt.createFailure(thM1304exceptionOrNullimpl));
            }
        }
        return kotlin.Result.m1300boximpl(objM1301constructorimpl);
    }
}
