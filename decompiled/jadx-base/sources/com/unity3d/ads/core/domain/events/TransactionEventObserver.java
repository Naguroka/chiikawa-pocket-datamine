package com.unity3d.ads.core.domain.events;

/* JADX INFO: compiled from: TransactionEventObserver.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u0011\u0010\u0012\u001a\u00020\u0013H\u0086Bø\u0001\u0000¢\u0006\u0002\u0010\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Lcom/unity3d/ads/core/domain/events/TransactionEventObserver;", "", "getUniversalRequestForPayLoad", "Lcom/unity3d/ads/core/domain/GetUniversalRequestForPayLoad;", "defaultDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "transactionEventRepository", "Lcom/unity3d/ads/core/data/repository/TransactionEventRepository;", "gatewayClient", "Lcom/unity3d/ads/gatewayclient/GatewayClient;", "getRequestPolicy", "Lcom/unity3d/ads/core/domain/GetRequestPolicy;", "iapTransactionStore", "Lcom/unity3d/ads/core/data/datasource/ByteStringDataSource;", "(Lcom/unity3d/ads/core/domain/GetUniversalRequestForPayLoad;Lkotlinx/coroutines/CoroutineDispatcher;Lcom/unity3d/ads/core/data/repository/TransactionEventRepository;Lcom/unity3d/ads/gatewayclient/GatewayClient;Lcom/unity3d/ads/core/domain/GetRequestPolicy;Lcom/unity3d/ads/core/data/datasource/ByteStringDataSource;)V", "isRunning", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "invoke", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TransactionEventObserver {
    private final kotlinx.coroutines.CoroutineDispatcher defaultDispatcher;
    private final com.unity3d.ads.gatewayclient.GatewayClient gatewayClient;
    private final com.unity3d.ads.core.domain.GetRequestPolicy getRequestPolicy;
    private final com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;
    private final com.unity3d.ads.core.data.datasource.ByteStringDataSource iapTransactionStore;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> isRunning;
    private final com.unity3d.ads.core.data.repository.TransactionEventRepository transactionEventRepository;

    public TransactionEventObserver(com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad getUniversalRequestForPayLoad, kotlinx.coroutines.CoroutineDispatcher defaultDispatcher, com.unity3d.ads.core.data.repository.TransactionEventRepository transactionEventRepository, com.unity3d.ads.gatewayclient.GatewayClient gatewayClient, com.unity3d.ads.core.domain.GetRequestPolicy getRequestPolicy, com.unity3d.ads.core.data.datasource.ByteStringDataSource iapTransactionStore) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getUniversalRequestForPayLoad, "getUniversalRequestForPayLoad");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultDispatcher, "defaultDispatcher");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionEventRepository, "transactionEventRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gatewayClient, "gatewayClient");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getRequestPolicy, "getRequestPolicy");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iapTransactionStore, "iapTransactionStore");
        this.getUniversalRequestForPayLoad = getUniversalRequestForPayLoad;
        this.defaultDispatcher = defaultDispatcher;
        this.transactionEventRepository = transactionEventRepository;
        this.gatewayClient = gatewayClient;
        this.getRequestPolicy = getRequestPolicy;
        this.iapTransactionStore = iapTransactionStore;
        this.isRunning = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(false);
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.events.TransactionEventObserver$invoke$2, reason: invalid class name */
    /* JADX INFO: compiled from: TransactionEventObserver.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.events.TransactionEventObserver$invoke$2", f = "TransactionEventObserver.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int label;

        AnonymousClass2(kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.events.TransactionEventObserver.AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.unity3d.ads.core.domain.events.TransactionEventObserver.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.unity3d.ads.core.domain.events.TransactionEventObserver.AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object value;
            java.lang.Boolean bool;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow = com.unity3d.ads.core.domain.events.TransactionEventObserver.this.isRunning;
                do {
                    value = mutableStateFlow.getValue();
                    bool = (java.lang.Boolean) value;
                    bool.booleanValue();
                } while (!mutableStateFlow.compareAndSet(value, kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true)));
                if (bool.booleanValue()) {
                    return kotlin.Unit.INSTANCE;
                }
                kotlinx.coroutines.flow.FlowKt.launchIn(kotlinx.coroutines.flow.FlowKt.onEach(com.unity3d.ads.core.domain.events.TransactionEventObserver.this.transactionEventRepository.getTransactionEvents(), new com.unity3d.ads.core.domain.events.TransactionEventObserver.AnonymousClass2.C02592(com.unity3d.ads.core.domain.events.TransactionEventObserver.this, null)), kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(com.unity3d.ads.core.domain.events.TransactionEventObserver.this.defaultDispatcher));
                return kotlin.Unit.INSTANCE;
            }
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* JADX INFO: renamed from: com.unity3d.ads.core.domain.events.TransactionEventObserver$invoke$2$2, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: TransactionEventObserver.kt */
        @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "currentTransactionEventRequest", "Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionEventRequest;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.events.TransactionEventObserver$invoke$2$2", f = "TransactionEventObserver.kt", i = {1}, l = {44, 46, 55}, m = "invokeSuspend", n = {"fullRequest"}, s = {"L$0"})
        static final class C02592 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
            /* synthetic */ java.lang.Object L$0;
            int label;
            final /* synthetic */ com.unity3d.ads.core.domain.events.TransactionEventObserver this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C02592(com.unity3d.ads.core.domain.events.TransactionEventObserver transactionEventObserver, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.events.TransactionEventObserver.AnonymousClass2.C02592> continuation) {
                super(2, continuation);
                this.this$0 = transactionEventObserver;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                com.unity3d.ads.core.domain.events.TransactionEventObserver.AnonymousClass2.C02592 c02592 = new com.unity3d.ads.core.domain.events.TransactionEventObserver.AnonymousClass2.C02592(this.this$0, continuation);
                c02592.L$0 = obj;
                return c02592;
            }

            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest transactionEventRequest, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                return ((com.unity3d.ads.core.domain.events.TransactionEventObserver.AnonymousClass2.C02592) create(transactionEventRequest, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
            }

            /* JADX WARN: Code duplicated, block: B:20:0x008a  */
            /* JADX WARN: Code duplicated, block: B:22:0x00b3 A[RETURN] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest universalRequest;
                com.unity3d.ads.core.data.datasource.ByteStringDataSource byteStringDataSource;
                com.google.protobuf.ByteString byteString;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest transactionEventRequest = (gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest) this.L$0;
                    gatewayprotocol.v1.UniversalRequestKt universalRequestKt = gatewayprotocol.v1.UniversalRequestKt.INSTANCE;
                    gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl.Companion companion = gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl.INSTANCE;
                    gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder builderNewBuilder = gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
                    gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl dsl_create = companion._create(builderNewBuilder);
                    dsl_create.setTransactionEventRequest(transactionEventRequest);
                    gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload payload_build = dsl_create._build();
                    this.label = 1;
                    obj = this.this$0.getUniversalRequestForPayLoad.invoke(payload_build, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i == 1) {
                        kotlin.ResultKt.throwOnFailure(obj);
                    } else if (i == 2) {
                        universalRequest = (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest) this.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                        if (((gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) obj).getError() != null) {
                            byteStringDataSource = this.this$0.iapTransactionStore;
                            byteString = universalRequest.getSharedData().getTimestamps().getTimestamp().toByteString();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(byteString, "fullRequest.sharedData.t….timestamp.toByteString()");
                            this.L$0 = null;
                            this.label = 3;
                            if (byteStringDataSource.set(byteString, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else {
                        if (i != 3) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    return kotlin.Unit.INSTANCE;
                }
                universalRequest = (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest) obj;
                this.L$0 = universalRequest;
                this.label = 2;
                obj = com.unity3d.ads.gatewayclient.GatewayClient.DefaultImpls.request$default(this.this$0.gatewayClient, null, universalRequest, this.this$0.getRequestPolicy.invoke(), com.unity3d.ads.core.data.model.OperationType.TRANSACTION_EVENT, this, 1, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                if (((gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) obj).getError() != null) {
                    byteStringDataSource = this.this$0.iapTransactionStore;
                    byteString = universalRequest.getSharedData().getTimestamps().getTimestamp().toByteString();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(byteString, "fullRequest.sharedData.t….timestamp.toByteString()");
                    this.L$0 = null;
                    this.label = 3;
                    if (byteStringDataSource.set(byteString, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return kotlin.Unit.INSTANCE;
            }
        }
    }

    public final java.lang.Object invoke(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) throws java.lang.Throwable {
        java.lang.Object objWithContext = kotlinx.coroutines.BuildersKt.withContext(this.defaultDispatcher, new com.unity3d.ads.core.domain.events.TransactionEventObserver.AnonymousClass2(null), continuation);
        return objWithContext == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : kotlin.Unit.INSTANCE;
    }
}
