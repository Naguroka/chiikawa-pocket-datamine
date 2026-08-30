package com.unity3d.services.core.domain.task;

/* JADX INFO: compiled from: InitializeStateConfigWithLoader.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$doWork$2$1$1", f = "InitializeStateConfigWithLoader.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
final class InitializeStateConfigWithLoader$doWork$2$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<com.unity3d.services.core.configuration.Configuration> $config;
    final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<com.unity3d.services.core.configuration.IConfigurationLoader> $configurationLoader;
    final /* synthetic */ com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader.Params $params;
    int label;
    final /* synthetic */ com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InitializeStateConfigWithLoader$doWork$2$1$1(kotlin.jvm.internal.Ref.ObjectRef<com.unity3d.services.core.configuration.IConfigurationLoader> objectRef, kotlin.jvm.internal.Ref.ObjectRef<com.unity3d.services.core.configuration.Configuration> objectRef2, com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader initializeStateConfigWithLoader, com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader.Params params, kotlin.coroutines.Continuation<? super com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$doWork$2$1$1> continuation) {
        super(2, continuation);
        this.$configurationLoader = objectRef;
        this.$config = objectRef2;
        this.this$0 = initializeStateConfigWithLoader;
        this.$params = params;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$doWork$2$1$1(this.$configurationLoader, this.$config, this.this$0, this.$params, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$doWork$2$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) throws java.lang.Exception {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.unity3d.services.core.configuration.IConfigurationLoader iConfigurationLoader = this.$configurationLoader.element;
        final kotlin.jvm.internal.Ref.ObjectRef<com.unity3d.services.core.configuration.Configuration> objectRef = this.$config;
        final com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader initializeStateConfigWithLoader = this.this$0;
        final com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader.Params params = this.$params;
        iConfigurationLoader.loadConfiguration(new com.unity3d.services.core.configuration.IConfigurationLoaderListener() { // from class: com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$doWork$2$1$1.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.unity3d.services.core.configuration.IConfigurationLoaderListener
            public void onSuccess(com.unity3d.services.core.configuration.Configuration configuration) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configuration, "configuration");
                objectRef.element = configuration;
                objectRef.element.saveToDisk();
                initializeStateConfigWithLoader.tokenStorage.setInitToken(objectRef.element.getUnifiedAuctionToken());
            }

            @Override // com.unity3d.services.core.configuration.IConfigurationLoaderListener
            public void onError(java.lang.String errorMsg) throws com.unity3d.services.core.domain.task.InitializationException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMsg, "errorMsg");
                com.unity3d.services.core.request.metrics.SDKMetricsSender sDKMetricsSender = initializeStateConfigWithLoader.sdkMetricsSender;
                com.unity3d.services.core.request.metrics.Metric metricNewEmergencySwitchOff = com.unity3d.services.core.request.metrics.TSIMetric.newEmergencySwitchOff();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(metricNewEmergencySwitchOff, "newEmergencySwitchOff()");
                sDKMetricsSender.sendMetric(metricNewEmergencySwitchOff);
                throw new com.unity3d.services.core.domain.task.InitializationException(com.unity3d.services.core.configuration.ErrorState.NetworkConfigRequest, new java.lang.Exception(errorMsg), params.getConfig());
            }
        });
        return kotlin.Unit.INSTANCE;
    }
}
