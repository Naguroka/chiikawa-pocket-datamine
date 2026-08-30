package com.unity3d.ads.core.domain;

/* JADX INFO: compiled from: AndroidGetInitializationCompletedRequest.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0011\u0010\u0007\u001a\u00020\bH\u0096Bø\u0001\u0000¢\u0006\u0002\u0010\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidGetInitializationCompletedRequest;", "Lcom/unity3d/ads/core/domain/GetInitializationCompletedRequest;", "getUniversalRequestForPayLoad", "Lcom/unity3d/ads/core/domain/GetUniversalRequestForPayLoad;", "deviceInfoRepository", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "(Lcom/unity3d/ads/core/domain/GetUniversalRequestForPayLoad;Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;)V", "invoke", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidGetInitializationCompletedRequest implements com.unity3d.ads.core.domain.GetInitializationCompletedRequest {
    private final com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository;
    private final com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidGetInitializationCompletedRequest$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidGetInitializationCompletedRequest.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.AndroidGetInitializationCompletedRequest", f = "AndroidGetInitializationCompletedRequest.kt", i = {0, 0}, l = {16, 24}, m = "invoke", n = {"this", "$this$invoke_u24lambda_u240"}, s = {"L$0", "L$2"})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        java.lang.Object L$3;
        int label;
        /* synthetic */ java.lang.Object result;

        AnonymousClass1(kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.AndroidGetInitializationCompletedRequest.AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return com.unity3d.ads.core.domain.AndroidGetInitializationCompletedRequest.this.invoke(this);
        }
    }

    public AndroidGetInitializationCompletedRequest(com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad getUniversalRequestForPayLoad, com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getUniversalRequestForPayLoad, "getUniversalRequestForPayLoad");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceInfoRepository, "deviceInfoRepository");
        this.getUniversalRequestForPayLoad = getUniversalRequestForPayLoad;
        this.deviceInfoRepository = deviceInfoRepository;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // com.unity3d.ads.core.domain.GetInitializationCompletedRequest
    public java.lang.Object invoke(kotlin.coroutines.Continuation<? super gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest> continuation) {
        com.unity3d.ads.core.domain.AndroidGetInitializationCompletedRequest.AnonymousClass1 anonymousClass1;
        gatewayprotocol.v1.InitializationCompletedEventRequestKt.Dsl dsl_create;
        com.unity3d.ads.core.domain.AndroidGetInitializationCompletedRequest androidGetInitializationCompletedRequest;
        gatewayprotocol.v1.InitializationCompletedEventRequestKt.Dsl dsl;
        gatewayprotocol.v1.InitializationCompletedEventRequestKt.Dsl dsl2;
        if (continuation instanceof com.unity3d.ads.core.domain.AndroidGetInitializationCompletedRequest.AnonymousClass1) {
            anonymousClass1 = (com.unity3d.ads.core.domain.AndroidGetInitializationCompletedRequest.AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new com.unity3d.ads.core.domain.AndroidGetInitializationCompletedRequest.AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new com.unity3d.ads.core.domain.AndroidGetInitializationCompletedRequest.AnonymousClass1(continuation);
        }
        java.lang.Object objStaticDeviceInfo = anonymousClass1.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i != 0) {
            if (i == 1) {
                dsl_create = (gatewayprotocol.v1.InitializationCompletedEventRequestKt.Dsl) anonymousClass1.L$3;
                dsl = (gatewayprotocol.v1.InitializationCompletedEventRequestKt.Dsl) anonymousClass1.L$2;
                dsl2 = (gatewayprotocol.v1.InitializationCompletedEventRequestKt.Dsl) anonymousClass1.L$1;
                androidGetInitializationCompletedRequest = (com.unity3d.ads.core.domain.AndroidGetInitializationCompletedRequest) anonymousClass1.L$0;
                kotlin.ResultKt.throwOnFailure(objStaticDeviceInfo);
            } else {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(objStaticDeviceInfo);
            }
        }
        kotlin.ResultKt.throwOnFailure(objStaticDeviceInfo);
        gatewayprotocol.v1.InitializationCompletedEventRequestKt.Dsl.Companion companion = gatewayprotocol.v1.InitializationCompletedEventRequestKt.Dsl.INSTANCE;
        gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.Builder builderNewBuilder = gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.newBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        dsl_create = companion._create(builderNewBuilder);
        com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository = this.deviceInfoRepository;
        anonymousClass1.L$0 = this;
        anonymousClass1.L$1 = dsl_create;
        anonymousClass1.L$2 = dsl_create;
        anonymousClass1.L$3 = dsl_create;
        anonymousClass1.label = 1;
        objStaticDeviceInfo = deviceInfoRepository.staticDeviceInfo(anonymousClass1);
        if (objStaticDeviceInfo == coroutine_suspended) {
            return coroutine_suspended;
        }
        androidGetInitializationCompletedRequest = this;
        dsl = dsl_create;
        dsl2 = dsl;
        dsl_create.setStaticDeviceInfo((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) objStaticDeviceInfo);
        dsl.setDynamicDeviceInfo(androidGetInitializationCompletedRequest.deviceInfoRepository.getDynamicDeviceInfo());
        gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest initializationCompletedEventRequest_build = dsl2._build();
        gatewayprotocol.v1.UniversalRequestKt universalRequestKt = gatewayprotocol.v1.UniversalRequestKt.INSTANCE;
        gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl.Companion companion2 = gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl.INSTANCE;
        gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder builderNewBuilder2 = gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builderNewBuilder2, "newBuilder()");
        gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl dsl_create2 = companion2._create(builderNewBuilder2);
        dsl_create2.setInitializationCompletedEventRequest(initializationCompletedEventRequest_build);
        gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload payload_build = dsl_create2._build();
        com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad getUniversalRequestForPayLoad = androidGetInitializationCompletedRequest.getUniversalRequestForPayLoad;
        anonymousClass1.L$0 = null;
        anonymousClass1.L$1 = null;
        anonymousClass1.L$2 = null;
        anonymousClass1.L$3 = null;
        anonymousClass1.label = 2;
        objStaticDeviceInfo = getUniversalRequestForPayLoad.invoke(payload_build, anonymousClass1);
        return objStaticDeviceInfo == coroutine_suspended ? coroutine_suspended : objStaticDeviceInfo;
    }
}
