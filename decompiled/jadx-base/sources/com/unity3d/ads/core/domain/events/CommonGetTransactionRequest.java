package com.unity3d.ads.core.domain.events;

/* JADX INFO: compiled from: CommonGetTransactionRequest.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001f\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0096Bø\u0001\u0000¢\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Lcom/unity3d/ads/core/domain/events/CommonGetTransactionRequest;", "Lcom/unity3d/ads/core/domain/events/GetTransactionRequest;", "deviceInfoRepository", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "(Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;)V", "invoke", "Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionEventRequest;", "transactionDataList", "", "Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionData;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CommonGetTransactionRequest implements com.unity3d.ads.core.domain.events.GetTransactionRequest {
    private final com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.events.CommonGetTransactionRequest$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: CommonGetTransactionRequest.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.events.CommonGetTransactionRequest", f = "CommonGetTransactionRequest.kt", i = {0, 0, 0}, l = {14}, m = "invoke", n = {"this", "transactionDataList", "$this$invoke_u24lambda_u240"}, s = {"L$0", "L$1", "L$3"})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        java.lang.Object L$3;
        java.lang.Object L$4;
        int label;
        /* synthetic */ java.lang.Object result;

        AnonymousClass1(kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.events.CommonGetTransactionRequest.AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return com.unity3d.ads.core.domain.events.CommonGetTransactionRequest.this.invoke(null, this);
        }
    }

    public CommonGetTransactionRequest(com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceInfoRepository, "deviceInfoRepository");
        this.deviceInfoRepository = deviceInfoRepository;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // com.unity3d.ads.core.domain.events.GetTransactionRequest
    public java.lang.Object invoke(java.util.List<gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData> list, kotlin.coroutines.Continuation<? super gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest> continuation) {
        com.unity3d.ads.core.domain.events.CommonGetTransactionRequest.AnonymousClass1 anonymousClass1;
        java.util.List<gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData> list2;
        gatewayprotocol.v1.TransactionEventRequestKt.Dsl dsl;
        gatewayprotocol.v1.TransactionEventRequestKt.Dsl dsl2;
        gatewayprotocol.v1.TransactionEventRequestKt.Dsl dsl3;
        com.unity3d.ads.core.domain.events.CommonGetTransactionRequest commonGetTransactionRequest;
        if (continuation instanceof com.unity3d.ads.core.domain.events.CommonGetTransactionRequest.AnonymousClass1) {
            anonymousClass1 = (com.unity3d.ads.core.domain.events.CommonGetTransactionRequest.AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new com.unity3d.ads.core.domain.events.CommonGetTransactionRequest.AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new com.unity3d.ads.core.domain.events.CommonGetTransactionRequest.AnonymousClass1(continuation);
        }
        java.lang.Object obj = anonymousClass1.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            gatewayprotocol.v1.TransactionEventRequestKt.Dsl.Companion companion = gatewayprotocol.v1.TransactionEventRequestKt.Dsl.INSTANCE;
            gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest.Builder builderNewBuilder = gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest.newBuilder();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
            gatewayprotocol.v1.TransactionEventRequestKt.Dsl dsl_create = companion._create(builderNewBuilder);
            com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository = this.deviceInfoRepository;
            anonymousClass1.L$0 = this;
            anonymousClass1.L$1 = list;
            anonymousClass1.L$2 = dsl_create;
            anonymousClass1.L$3 = dsl_create;
            anonymousClass1.L$4 = dsl_create;
            anonymousClass1.label = 1;
            java.lang.Object objStaticDeviceInfo = deviceInfoRepository.staticDeviceInfo(anonymousClass1);
            if (objStaticDeviceInfo == coroutine_suspended) {
                return coroutine_suspended;
            }
            list2 = list;
            dsl = dsl_create;
            dsl2 = dsl;
            dsl3 = dsl2;
            obj = objStaticDeviceInfo;
            commonGetTransactionRequest = this;
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dsl = (gatewayprotocol.v1.TransactionEventRequestKt.Dsl) anonymousClass1.L$4;
            dsl2 = (gatewayprotocol.v1.TransactionEventRequestKt.Dsl) anonymousClass1.L$3;
            dsl3 = (gatewayprotocol.v1.TransactionEventRequestKt.Dsl) anonymousClass1.L$2;
            list2 = (java.util.List) anonymousClass1.L$1;
            commonGetTransactionRequest = (com.unity3d.ads.core.domain.events.CommonGetTransactionRequest) anonymousClass1.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        dsl.setStaticDeviceInfo((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) obj);
        dsl2.setDynamicDeviceInfo(commonGetTransactionRequest.deviceInfoRepository.getDynamicDeviceInfo());
        dsl2.setAppStore(gatewayprotocol.v1.TransactionEventRequestOuterClass.StoreType.STORE_TYPE_GOOGLE_PLAY);
        dsl2.addAllTransactionData(dsl2.getTransactionData(), list2);
        return dsl3._build();
    }
}
