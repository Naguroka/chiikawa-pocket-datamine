package com.unity3d.services.core.domain.task;

/* JADX INFO: compiled from: InitializeStateConfigWithLoader.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$doWork$2$1$configResult$1$1", f = "InitializeStateConfigWithLoader.kt", i = {}, l = {69}, m = "invokeSuspend", n = {}, s = {})
final class InitializeStateConfigWithLoader$doWork$2$1$configResult$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<java.lang.Integer, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<com.unity3d.services.core.configuration.Configuration> $config;
    final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<com.unity3d.services.core.configuration.IConfigurationLoader> $configurationLoader;
    /* synthetic */ int I$0;
    int label;
    final /* synthetic */ com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InitializeStateConfigWithLoader$doWork$2$1$configResult$1$1(com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader initializeStateConfigWithLoader, kotlin.jvm.internal.Ref.ObjectRef<com.unity3d.services.core.configuration.IConfigurationLoader> objectRef, kotlin.jvm.internal.Ref.ObjectRef<com.unity3d.services.core.configuration.Configuration> objectRef2, kotlin.coroutines.Continuation<? super com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$doWork$2$1$configResult$1$1> continuation) {
        super(2, continuation);
        this.this$0 = initializeStateConfigWithLoader;
        this.$configurationLoader = objectRef;
        this.$config = objectRef2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$doWork$2$1$configResult$1$1 initializeStateConfigWithLoader$doWork$2$1$configResult$1$1 = new com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$doWork$2$1$configResult$1$1(this.this$0, this.$configurationLoader, this.$config, continuation);
        initializeStateConfigWithLoader$doWork$2$1$configResult$1$1.I$0 = ((java.lang.Number) obj).intValue();
        return initializeStateConfigWithLoader$doWork$2$1$configResult$1$1;
    }

    public final java.lang.Object invoke(int i, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$doWork$2$1$configResult$1$1) create(java.lang.Integer.valueOf(i), continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Integer num, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return invoke(num.intValue(), continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            if (this.I$0 > 0) {
                com.unity3d.services.core.configuration.InitializeEventsMetricSender.getInstance().onRetryConfig();
            }
            this.label = 1;
            if (kotlinx.coroutines.BuildersKt.withContext(this.this$0.dispatchers.getIo(), new com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$doWork$2$1$configResult$1$1.AnonymousClass1(this.$configurationLoader, this.$config, this.this$0, null), this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$doWork$2$1$configResult$1$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: InitializeStateConfigWithLoader.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$doWork$2$1$configResult$1$1$1", f = "InitializeStateConfigWithLoader.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<com.unity3d.services.core.configuration.Configuration> $config;
        final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<com.unity3d.services.core.configuration.IConfigurationLoader> $configurationLoader;
        int label;
        final /* synthetic */ com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(kotlin.jvm.internal.Ref.ObjectRef<com.unity3d.services.core.configuration.IConfigurationLoader> objectRef, kotlin.jvm.internal.Ref.ObjectRef<com.unity3d.services.core.configuration.Configuration> objectRef2, com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader initializeStateConfigWithLoader, kotlin.coroutines.Continuation<? super com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$doWork$2$1$configResult$1$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.$configurationLoader = objectRef;
            this.$config = objectRef2;
            this.this$0 = initializeStateConfigWithLoader;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$doWork$2$1$configResult$1$1.AnonymousClass1(this.$configurationLoader, this.$config, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$doWork$2$1$configResult$1$1.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
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
            iConfigurationLoader.loadConfiguration(new com.unity3d.services.core.configuration.IConfigurationLoaderListener() { // from class: com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader.doWork.2.1.configResult.1.1.1.1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.unity3d.services.core.configuration.IConfigurationLoaderListener
                public void onSuccess(com.unity3d.services.core.configuration.Configuration configuration) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configuration, "configuration");
                    objectRef.element = configuration;
                    objectRef.element.saveToDisk();
                    initializeStateConfigWithLoader.tokenStorage.setInitToken(objectRef.element.getUnifiedAuctionToken());
                }

                @Override // com.unity3d.services.core.configuration.IConfigurationLoaderListener
                public void onError(java.lang.String errorMsg) throws com.unity3d.services.core.extensions.AbortRetryException {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMsg, "errorMsg");
                    com.unity3d.services.core.request.metrics.SDKMetricsSender sDKMetricsSender = initializeStateConfigWithLoader.sdkMetricsSender;
                    com.unity3d.services.core.request.metrics.Metric metricNewEmergencySwitchOff = com.unity3d.services.core.request.metrics.TSIMetric.newEmergencySwitchOff();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(metricNewEmergencySwitchOff, "newEmergencySwitchOff()");
                    sDKMetricsSender.sendMetric(metricNewEmergencySwitchOff);
                    throw new com.unity3d.services.core.extensions.AbortRetryException(errorMsg);
                }
            });
            return kotlin.Unit.INSTANCE;
        }
    }
}
