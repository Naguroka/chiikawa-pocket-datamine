package com.unity3d.ads.core.domain.events;

/* JADX INFO: compiled from: GetOperativeEventRequest.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ;\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0086Bø\u0001\u0000¢\u0006\u0002\u0010\u0015R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Lcom/unity3d/ads/core/domain/events/GetOperativeEventRequest;", "", "generateByteStringId", "Lcom/unity3d/ads/core/domain/GetByteStringId;", "deviceInfoRepository", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "campaignRepository", "Lcom/unity3d/ads/core/data/repository/CampaignRepository;", "(Lcom/unity3d/ads/core/domain/GetByteStringId;Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/data/repository/CampaignRepository;)V", "invoke", "Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventRequest;", "operativeEventType", "Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventType;", "loadTrackingToken", "Lcom/google/protobuf/ByteString;", "opportunityId", "additionalEventData", "playerServerId", "", "(Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventType;Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ByteString;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class GetOperativeEventRequest {
    private final com.unity3d.ads.core.data.repository.CampaignRepository campaignRepository;
    private final com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository;
    private final com.unity3d.ads.core.domain.GetByteStringId generateByteStringId;
    private final com.unity3d.ads.core.data.repository.SessionRepository sessionRepository;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.events.GetOperativeEventRequest$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: GetOperativeEventRequest.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.events.GetOperativeEventRequest", f = "GetOperativeEventRequest.kt", i = {0, 0}, l = {35}, m = "invoke", n = {"this", "$this$invoke_u24lambda_u241"}, s = {"L$0", "L$2"})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        java.lang.Object L$3;
        int label;
        /* synthetic */ java.lang.Object result;

        AnonymousClass1(kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.events.GetOperativeEventRequest.AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return com.unity3d.ads.core.domain.events.GetOperativeEventRequest.this.invoke(null, null, null, null, null, this);
        }
    }

    public GetOperativeEventRequest(com.unity3d.ads.core.domain.GetByteStringId generateByteStringId, com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository, com.unity3d.ads.core.data.repository.SessionRepository sessionRepository, com.unity3d.ads.core.data.repository.CampaignRepository campaignRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(generateByteStringId, "generateByteStringId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceInfoRepository, "deviceInfoRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(campaignRepository, "campaignRepository");
        this.generateByteStringId = generateByteStringId;
        this.deviceInfoRepository = deviceInfoRepository;
        this.sessionRepository = sessionRepository;
        this.campaignRepository = campaignRepository;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final java.lang.Object invoke(gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventType operativeEventType, com.google.protobuf.ByteString byteString, com.google.protobuf.ByteString byteString2, com.google.protobuf.ByteString byteString3, java.lang.String str, kotlin.coroutines.Continuation<? super gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest> continuation) {
        com.unity3d.ads.core.domain.events.GetOperativeEventRequest.AnonymousClass1 anonymousClass1;
        com.unity3d.ads.core.domain.events.GetOperativeEventRequest getOperativeEventRequest;
        gatewayprotocol.v1.OperativeEventRequestKt.Dsl dsl;
        gatewayprotocol.v1.OperativeEventRequestKt.Dsl dsl2;
        gatewayprotocol.v1.OperativeEventRequestKt.Dsl dsl3;
        if (continuation instanceof com.unity3d.ads.core.domain.events.GetOperativeEventRequest.AnonymousClass1) {
            anonymousClass1 = (com.unity3d.ads.core.domain.events.GetOperativeEventRequest.AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new com.unity3d.ads.core.domain.events.GetOperativeEventRequest.AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new com.unity3d.ads.core.domain.events.GetOperativeEventRequest.AnonymousClass1(continuation);
        }
        java.lang.Object obj = anonymousClass1.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            gatewayprotocol.v1.OperativeEventRequestKt.Dsl.Companion companion = gatewayprotocol.v1.OperativeEventRequestKt.Dsl.INSTANCE;
            gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder builderNewBuilder = gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.newBuilder();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
            gatewayprotocol.v1.OperativeEventRequestKt.Dsl dsl_create = companion._create(builderNewBuilder);
            dsl_create.setEventId(this.generateByteStringId.invoke());
            dsl_create.setEventType(operativeEventType);
            dsl_create.setImpressionOpportunityId(byteString2);
            dsl_create.setTrackingToken(byteString);
            dsl_create.setAdditionalData(byteString3);
            if (str != null) {
                dsl_create.setSid(str);
            }
            dsl_create.setDynamicDeviceInfo(this.deviceInfoRepository.getDynamicDeviceInfo());
            com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository = this.deviceInfoRepository;
            anonymousClass1.L$0 = this;
            anonymousClass1.L$1 = dsl_create;
            anonymousClass1.L$2 = dsl_create;
            anonymousClass1.L$3 = dsl_create;
            anonymousClass1.label = 1;
            java.lang.Object objStaticDeviceInfo = deviceInfoRepository.staticDeviceInfo(anonymousClass1);
            if (objStaticDeviceInfo == coroutine_suspended) {
                return coroutine_suspended;
            }
            getOperativeEventRequest = this;
            dsl = dsl_create;
            dsl2 = dsl;
            obj = objStaticDeviceInfo;
            dsl3 = dsl2;
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dsl3 = (gatewayprotocol.v1.OperativeEventRequestKt.Dsl) anonymousClass1.L$3;
            dsl = (gatewayprotocol.v1.OperativeEventRequestKt.Dsl) anonymousClass1.L$2;
            dsl2 = (gatewayprotocol.v1.OperativeEventRequestKt.Dsl) anonymousClass1.L$1;
            getOperativeEventRequest = (com.unity3d.ads.core.domain.events.GetOperativeEventRequest) anonymousClass1.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        dsl3.setStaticDeviceInfo((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) obj);
        dsl.setSessionCounters(getOperativeEventRequest.sessionRepository.getSessionCounters());
        dsl.setCampaignState(getOperativeEventRequest.campaignRepository.getCampaignState());
        return dsl2._build();
    }
}
