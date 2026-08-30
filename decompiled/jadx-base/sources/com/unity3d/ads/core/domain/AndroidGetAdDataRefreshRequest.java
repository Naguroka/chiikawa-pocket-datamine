package com.unity3d.ads.core.domain;

/* JADX INFO: compiled from: AndroidGetAdDataRefreshRequest.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ!\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0096Bø\u0001\u0000¢\u0006\u0002\u0010\u0010R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidGetAdDataRefreshRequest;", "Lcom/unity3d/ads/core/domain/GetAdDataRefreshRequest;", "getUniversalRequestForPayLoad", "Lcom/unity3d/ads/core/domain/GetUniversalRequestForPayLoad;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "deviceInfoRepository", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "campaignRepository", "Lcom/unity3d/ads/core/data/repository/CampaignRepository;", "(Lcom/unity3d/ads/core/domain/GetUniversalRequestForPayLoad;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;Lcom/unity3d/ads/core/data/repository/CampaignRepository;)V", "invoke", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest;", "opportunityId", "Lcom/google/protobuf/ByteString;", "refreshToken", "(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ByteString;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidGetAdDataRefreshRequest implements com.unity3d.ads.core.domain.GetAdDataRefreshRequest {
    private final com.unity3d.ads.core.data.repository.CampaignRepository campaignRepository;
    private final com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository;
    private final com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;
    private final com.unity3d.ads.core.data.repository.SessionRepository sessionRepository;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidGetAdDataRefreshRequest$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidGetAdDataRefreshRequest.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.AndroidGetAdDataRefreshRequest", f = "AndroidGetAdDataRefreshRequest.kt", i = {0, 0, 0, 0}, l = {25, 34}, m = "invoke", n = {"this", "opportunityId", "refreshToken", "$this$invoke_u24lambda_u240"}, s = {"L$0", "L$1", "L$2", "L$4"})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        java.lang.Object L$3;
        java.lang.Object L$4;
        java.lang.Object L$5;
        int label;
        /* synthetic */ java.lang.Object result;

        AnonymousClass1(kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.AndroidGetAdDataRefreshRequest.AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return com.unity3d.ads.core.domain.AndroidGetAdDataRefreshRequest.this.invoke(null, null, this);
        }
    }

    public AndroidGetAdDataRefreshRequest(com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad getUniversalRequestForPayLoad, com.unity3d.ads.core.data.repository.SessionRepository sessionRepository, com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository, com.unity3d.ads.core.data.repository.CampaignRepository campaignRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getUniversalRequestForPayLoad, "getUniversalRequestForPayLoad");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceInfoRepository, "deviceInfoRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(campaignRepository, "campaignRepository");
        this.getUniversalRequestForPayLoad = getUniversalRequestForPayLoad;
        this.sessionRepository = sessionRepository;
        this.deviceInfoRepository = deviceInfoRepository;
        this.campaignRepository = campaignRepository;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // com.unity3d.ads.core.domain.GetAdDataRefreshRequest
    public java.lang.Object invoke(com.google.protobuf.ByteString byteString, com.google.protobuf.ByteString byteString2, kotlin.coroutines.Continuation<? super gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest> continuation) {
        com.unity3d.ads.core.domain.AndroidGetAdDataRefreshRequest.AnonymousClass1 anonymousClass1;
        com.unity3d.ads.core.domain.AndroidGetAdDataRefreshRequest androidGetAdDataRefreshRequest;
        com.google.protobuf.ByteString byteString3;
        com.google.protobuf.ByteString byteString4;
        gatewayprotocol.v1.AdDataRefreshRequestKt.Dsl dsl;
        gatewayprotocol.v1.AdDataRefreshRequestKt.Dsl dsl2;
        gatewayprotocol.v1.AdDataRefreshRequestKt.Dsl dsl3;
        if (continuation instanceof com.unity3d.ads.core.domain.AndroidGetAdDataRefreshRequest.AnonymousClass1) {
            anonymousClass1 = (com.unity3d.ads.core.domain.AndroidGetAdDataRefreshRequest.AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new com.unity3d.ads.core.domain.AndroidGetAdDataRefreshRequest.AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new com.unity3d.ads.core.domain.AndroidGetAdDataRefreshRequest.AnonymousClass1(continuation);
        }
        java.lang.Object objInvoke = anonymousClass1.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i != 0) {
            if (i == 1) {
                dsl = (gatewayprotocol.v1.AdDataRefreshRequestKt.Dsl) anonymousClass1.L$5;
                dsl2 = (gatewayprotocol.v1.AdDataRefreshRequestKt.Dsl) anonymousClass1.L$4;
                dsl3 = (gatewayprotocol.v1.AdDataRefreshRequestKt.Dsl) anonymousClass1.L$3;
                byteString4 = (com.google.protobuf.ByteString) anonymousClass1.L$2;
                byteString3 = (com.google.protobuf.ByteString) anonymousClass1.L$1;
                androidGetAdDataRefreshRequest = (com.unity3d.ads.core.domain.AndroidGetAdDataRefreshRequest) anonymousClass1.L$0;
                kotlin.ResultKt.throwOnFailure(objInvoke);
            } else {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(objInvoke);
            }
        }
        kotlin.ResultKt.throwOnFailure(objInvoke);
        gatewayprotocol.v1.AdDataRefreshRequestKt.Dsl.Companion companion = gatewayprotocol.v1.AdDataRefreshRequestKt.Dsl.INSTANCE;
        gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequest.Builder builderNewBuilder = gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequest.newBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        gatewayprotocol.v1.AdDataRefreshRequestKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.setSessionCounters(this.sessionRepository.getSessionCounters());
        com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository = this.deviceInfoRepository;
        anonymousClass1.L$0 = this;
        anonymousClass1.L$1 = byteString;
        anonymousClass1.L$2 = byteString2;
        anonymousClass1.L$3 = dsl_create;
        anonymousClass1.L$4 = dsl_create;
        anonymousClass1.L$5 = dsl_create;
        anonymousClass1.label = 1;
        java.lang.Object objStaticDeviceInfo = deviceInfoRepository.staticDeviceInfo(anonymousClass1);
        if (objStaticDeviceInfo == coroutine_suspended) {
            return coroutine_suspended;
        }
        androidGetAdDataRefreshRequest = this;
        byteString3 = byteString;
        byteString4 = byteString2;
        dsl = dsl_create;
        dsl2 = dsl;
        objInvoke = objStaticDeviceInfo;
        dsl3 = dsl2;
        dsl.setStaticDeviceInfo((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) objInvoke);
        dsl2.setDynamicDeviceInfo(androidGetAdDataRefreshRequest.deviceInfoRepository.getDynamicDeviceInfo());
        dsl2.setImpressionOpportunityId(byteString3);
        dsl2.setCampaignState(androidGetAdDataRefreshRequest.campaignRepository.getCampaignState());
        if (!byteString4.isEmpty()) {
            dsl2.setAdDataRefreshToken(byteString4);
        }
        gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequest adDataRefreshRequest_build = dsl3._build();
        gatewayprotocol.v1.UniversalRequestKt universalRequestKt = gatewayprotocol.v1.UniversalRequestKt.INSTANCE;
        gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl.Companion companion2 = gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl.INSTANCE;
        gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder builderNewBuilder2 = gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builderNewBuilder2, "newBuilder()");
        gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl dsl_create2 = companion2._create(builderNewBuilder2);
        dsl_create2.setAdDataRefreshRequest(adDataRefreshRequest_build);
        gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload payload_build = dsl_create2._build();
        com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad getUniversalRequestForPayLoad = androidGetAdDataRefreshRequest.getUniversalRequestForPayLoad;
        anonymousClass1.L$0 = null;
        anonymousClass1.L$1 = null;
        anonymousClass1.L$2 = null;
        anonymousClass1.L$3 = null;
        anonymousClass1.L$4 = null;
        anonymousClass1.L$5 = null;
        anonymousClass1.label = 2;
        objInvoke = getUniversalRequestForPayLoad.invoke(payload_build, anonymousClass1);
        return objInvoke == coroutine_suspended ? coroutine_suspended : objInvoke;
    }
}
