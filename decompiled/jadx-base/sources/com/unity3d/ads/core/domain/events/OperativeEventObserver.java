package com.unity3d.ads.core.domain.events;

/* JADX INFO: compiled from: OperativeEventObserver.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0011\u0010\u0010\u001a\u00020\u0011H\u0086Bø\u0001\u0000¢\u0006\u0002\u0010\u0012R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Lcom/unity3d/ads/core/domain/events/OperativeEventObserver;", "", "getUniversalRequestForPayLoad", "Lcom/unity3d/ads/core/domain/GetUniversalRequestForPayLoad;", "defaultDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "operativeEventRepository", "Lcom/unity3d/ads/core/data/repository/OperativeEventRepository;", "universalRequestDataSource", "Lcom/unity3d/ads/core/data/datasource/UniversalRequestDataSource;", "backgroundWorker", "Lcom/unity3d/ads/core/domain/work/BackgroundWorker;", "(Lcom/unity3d/ads/core/domain/GetUniversalRequestForPayLoad;Lkotlinx/coroutines/CoroutineDispatcher;Lcom/unity3d/ads/core/data/repository/OperativeEventRepository;Lcom/unity3d/ads/core/data/datasource/UniversalRequestDataSource;Lcom/unity3d/ads/core/domain/work/BackgroundWorker;)V", "isRunning", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "invoke", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class OperativeEventObserver {
    private final com.unity3d.ads.core.domain.work.BackgroundWorker backgroundWorker;
    private final kotlinx.coroutines.CoroutineDispatcher defaultDispatcher;
    private final com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> isRunning;
    private final com.unity3d.ads.core.data.repository.OperativeEventRepository operativeEventRepository;
    private final com.unity3d.ads.core.data.datasource.UniversalRequestDataSource universalRequestDataSource;

    public OperativeEventObserver(com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad getUniversalRequestForPayLoad, kotlinx.coroutines.CoroutineDispatcher defaultDispatcher, com.unity3d.ads.core.data.repository.OperativeEventRepository operativeEventRepository, com.unity3d.ads.core.data.datasource.UniversalRequestDataSource universalRequestDataSource, com.unity3d.ads.core.domain.work.BackgroundWorker backgroundWorker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getUniversalRequestForPayLoad, "getUniversalRequestForPayLoad");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultDispatcher, "defaultDispatcher");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operativeEventRepository, "operativeEventRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(universalRequestDataSource, "universalRequestDataSource");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(backgroundWorker, "backgroundWorker");
        this.getUniversalRequestForPayLoad = getUniversalRequestForPayLoad;
        this.defaultDispatcher = defaultDispatcher;
        this.operativeEventRepository = operativeEventRepository;
        this.universalRequestDataSource = universalRequestDataSource;
        this.backgroundWorker = backgroundWorker;
        this.isRunning = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(false);
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.events.OperativeEventObserver$invoke$2, reason: invalid class name */
    /* JADX INFO: compiled from: OperativeEventObserver.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.events.OperativeEventObserver$invoke$2", f = "OperativeEventObserver.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int label;

        AnonymousClass2(kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.events.OperativeEventObserver.AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.unity3d.ads.core.domain.events.OperativeEventObserver.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.unity3d.ads.core.domain.events.OperativeEventObserver.AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object value;
            java.lang.Boolean bool;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow = com.unity3d.ads.core.domain.events.OperativeEventObserver.this.isRunning;
                do {
                    value = mutableStateFlow.getValue();
                    bool = (java.lang.Boolean) value;
                    bool.booleanValue();
                } while (!mutableStateFlow.compareAndSet(value, kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true)));
                if (bool.booleanValue()) {
                    return kotlin.Unit.INSTANCE;
                }
                kotlinx.coroutines.flow.FlowKt.launchIn(kotlinx.coroutines.flow.FlowKt.onEach(com.unity3d.ads.core.domain.events.OperativeEventObserver.this.operativeEventRepository.getOperativeEvents(), new com.unity3d.ads.core.domain.events.OperativeEventObserver.AnonymousClass2.C02582(com.unity3d.ads.core.domain.events.OperativeEventObserver.this, null)), kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(com.unity3d.ads.core.domain.events.OperativeEventObserver.this.defaultDispatcher));
                return kotlin.Unit.INSTANCE;
            }
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* JADX INFO: renamed from: com.unity3d.ads.core.domain.events.OperativeEventObserver$invoke$2$2, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: OperativeEventObserver.kt */
        @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "operativeEventRequest", "Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventRequest;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.events.OperativeEventObserver$invoke$2$2", f = "OperativeEventObserver.kt", i = {1}, l = {40, 43}, m = "invokeSuspend", n = {"workId"}, s = {"L$0"})
        static final class C02582 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
            /* synthetic */ java.lang.Object L$0;
            int label;
            final /* synthetic */ com.unity3d.ads.core.domain.events.OperativeEventObserver this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C02582(com.unity3d.ads.core.domain.events.OperativeEventObserver operativeEventObserver, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.events.OperativeEventObserver.AnonymousClass2.C02582> continuation) {
                super(2, continuation);
                this.this$0 = operativeEventObserver;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                com.unity3d.ads.core.domain.events.OperativeEventObserver.AnonymousClass2.C02582 c02582 = new com.unity3d.ads.core.domain.events.OperativeEventObserver.AnonymousClass2.C02582(this.this$0, continuation);
                c02582.L$0 = obj;
                return c02582;
            }

            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest operativeEventRequest, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                return ((com.unity3d.ads.core.domain.events.OperativeEventObserver.AnonymousClass2.C02582) create(operativeEventRequest, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                java.lang.String str;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest operativeEventRequest = (gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest) this.L$0;
                    gatewayprotocol.v1.UniversalRequestKt universalRequestKt = gatewayprotocol.v1.UniversalRequestKt.INSTANCE;
                    gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl.Companion companion = gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl.INSTANCE;
                    gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder builderNewBuilder = gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
                    gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl dsl_create = companion._create(builderNewBuilder);
                    dsl_create.setOperativeEvent(operativeEventRequest);
                    gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload payload_build = dsl_create._build();
                    this.label = 1;
                    obj = this.this$0.getUniversalRequestForPayLoad.invoke(payload_build, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i == 1) {
                        kotlin.ResultKt.throwOnFailure(obj);
                    } else {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        str = (java.lang.String) this.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    com.unity3d.ads.core.domain.work.UniversalRequestWorkerData universalRequestWorkerData = new com.unity3d.ads.core.domain.work.UniversalRequestWorkerData(str);
                    com.unity3d.ads.core.domain.work.BackgroundWorker backgroundWorker = this.this$0.backgroundWorker;
                    androidx.work.Constraints constraintsBuild = new androidx.work.Constraints.Builder().setRequiredNetworkType(androidx.work.NetworkType.CONNECTED).build();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(constraintsBuild, "Builder()\n            .s…TED)\n            .build()");
                    androidx.work.OneTimeWorkRequest oneTimeWorkRequestBuild = new androidx.work.OneTimeWorkRequest.Builder(com.unity3d.ads.core.domain.work.OperativeEventJob.class).setConstraints(constraintsBuild).setInputData(universalRequestWorkerData.invoke()).build();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(oneTimeWorkRequestBuild, "OneTimeWorkRequestBuilde…a())\n            .build()");
                    backgroundWorker.getWorkManager().enqueue(oneTimeWorkRequestBuild);
                    return kotlin.Unit.INSTANCE;
                }
                java.lang.String string = java.util.UUID.randomUUID().toString();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "randomUUID().toString()");
                com.unity3d.ads.core.data.datasource.UniversalRequestDataSource universalRequestDataSource = this.this$0.universalRequestDataSource;
                byte[] byteArray = ((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest) obj).toByteArray();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(byteArray, "fullRequest.toByteArray()");
                this.L$0 = string;
                this.label = 2;
                if (universalRequestDataSource.set(string, com.google.protobuf.kotlin.ByteStringsKt.toByteString(byteArray), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                str = string;
                com.unity3d.ads.core.domain.work.UniversalRequestWorkerData universalRequestWorkerData2 = new com.unity3d.ads.core.domain.work.UniversalRequestWorkerData(str);
                com.unity3d.ads.core.domain.work.BackgroundWorker backgroundWorker2 = this.this$0.backgroundWorker;
                androidx.work.Constraints constraintsBuild2 = new androidx.work.Constraints.Builder().setRequiredNetworkType(androidx.work.NetworkType.CONNECTED).build();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(constraintsBuild2, "Builder()\n            .s…TED)\n            .build()");
                androidx.work.OneTimeWorkRequest oneTimeWorkRequestBuild2 = new androidx.work.OneTimeWorkRequest.Builder(com.unity3d.ads.core.domain.work.OperativeEventJob.class).setConstraints(constraintsBuild2).setInputData(universalRequestWorkerData2.invoke()).build();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(oneTimeWorkRequestBuild2, "OneTimeWorkRequestBuilde…a())\n            .build()");
                backgroundWorker2.getWorkManager().enqueue(oneTimeWorkRequestBuild2);
                return kotlin.Unit.INSTANCE;
            }
        }
    }

    public final java.lang.Object invoke(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) throws java.lang.Throwable {
        java.lang.Object objWithContext = kotlinx.coroutines.BuildersKt.withContext(this.defaultDispatcher, new com.unity3d.ads.core.domain.events.OperativeEventObserver.AnonymousClass2(null), continuation);
        return objWithContext == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : kotlin.Unit.INSTANCE;
    }
}
