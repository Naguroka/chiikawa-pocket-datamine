package com.unity3d.ads.core.domain;

/* JADX INFO: compiled from: AndroidBuildHeaderBiddingToken.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0002\u0010\u0014J\u0011\u0010\u0015\u001a\u00020\u0016H\u0096Bø\u0001\u0000¢\u0006\u0002\u0010\u0017R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidBuildHeaderBiddingToken;", "Lcom/unity3d/ads/core/domain/BuildHeaderBiddingToken;", "generateId", "Lcom/unity3d/ads/core/domain/GetByteStringId;", "getClientInfo", "Lcom/unity3d/ads/core/domain/GetClientInfo;", "getTimestamps", "Lcom/unity3d/ads/core/domain/GetSharedDataTimestamps;", "getLimitedSessionToken", "Lcom/unity3d/ads/core/domain/GetLimitedSessionToken;", "getInitializationData", "Lcom/unity3d/ads/core/domain/GetInitializationData;", "deviceInfoRepository", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "campaignRepository", "Lcom/unity3d/ads/core/data/repository/CampaignRepository;", "tcfRepository", "Lcom/unity3d/ads/core/data/repository/TcfRepository;", "(Lcom/unity3d/ads/core/domain/GetByteStringId;Lcom/unity3d/ads/core/domain/GetClientInfo;Lcom/unity3d/ads/core/domain/GetSharedDataTimestamps;Lcom/unity3d/ads/core/domain/GetLimitedSessionToken;Lcom/unity3d/ads/core/domain/GetInitializationData;Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/data/repository/CampaignRepository;Lcom/unity3d/ads/core/data/repository/TcfRepository;)V", "invoke", "Lgatewayprotocol/v1/HeaderBiddingTokenOuterClass$HeaderBiddingToken;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidBuildHeaderBiddingToken implements com.unity3d.ads.core.domain.BuildHeaderBiddingToken {
    private final com.unity3d.ads.core.data.repository.CampaignRepository campaignRepository;
    private final com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository;
    private final com.unity3d.ads.core.domain.GetByteStringId generateId;
    private final com.unity3d.ads.core.domain.GetClientInfo getClientInfo;
    private final com.unity3d.ads.core.domain.GetInitializationData getInitializationData;
    private final com.unity3d.ads.core.domain.GetLimitedSessionToken getLimitedSessionToken;
    private final com.unity3d.ads.core.domain.GetSharedDataTimestamps getTimestamps;
    private final com.unity3d.ads.core.data.repository.SessionRepository sessionRepository;
    private final com.unity3d.ads.core.data.repository.TcfRepository tcfRepository;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidBuildHeaderBiddingToken$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidBuildHeaderBiddingToken.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.AndroidBuildHeaderBiddingToken", f = "AndroidBuildHeaderBiddingToken.kt", i = {0, 0, 0, 1, 1, 1, 2, 2}, l = {45, 48, 50}, m = "invoke", n = {"this", "currentTokenCounters", "$this$invoke_u24lambda_u242", "this", "currentTokenCounters", "$this$invoke_u24lambda_u242", "currentTokenCounters", "$this$invoke_u24lambda_u242"}, s = {"L$0", "L$1", "L$3", "L$0", "L$1", "L$3", "L$0", "L$2"})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        java.lang.Object L$3;
        java.lang.Object L$4;
        int label;
        /* synthetic */ java.lang.Object result;

        AnonymousClass1(kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.AndroidBuildHeaderBiddingToken.AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return com.unity3d.ads.core.domain.AndroidBuildHeaderBiddingToken.this.invoke(this);
        }
    }

    public AndroidBuildHeaderBiddingToken(com.unity3d.ads.core.domain.GetByteStringId generateId, com.unity3d.ads.core.domain.GetClientInfo getClientInfo, com.unity3d.ads.core.domain.GetSharedDataTimestamps getTimestamps, com.unity3d.ads.core.domain.GetLimitedSessionToken getLimitedSessionToken, com.unity3d.ads.core.domain.GetInitializationData getInitializationData, com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository, com.unity3d.ads.core.data.repository.SessionRepository sessionRepository, com.unity3d.ads.core.data.repository.CampaignRepository campaignRepository, com.unity3d.ads.core.data.repository.TcfRepository tcfRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(generateId, "generateId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getClientInfo, "getClientInfo");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getTimestamps, "getTimestamps");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getLimitedSessionToken, "getLimitedSessionToken");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getInitializationData, "getInitializationData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceInfoRepository, "deviceInfoRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(campaignRepository, "campaignRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tcfRepository, "tcfRepository");
        this.generateId = generateId;
        this.getClientInfo = getClientInfo;
        this.getTimestamps = getTimestamps;
        this.getLimitedSessionToken = getLimitedSessionToken;
        this.getInitializationData = getInitializationData;
        this.deviceInfoRepository = deviceInfoRepository;
        this.sessionRepository = sessionRepository;
        this.campaignRepository = campaignRepository;
        this.tcfRepository = tcfRepository;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0178 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:50:0x0179  */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // com.unity3d.ads.core.domain.BuildHeaderBiddingToken
    public java.lang.Object invoke(kotlin.coroutines.Continuation<? super gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken> continuation) {
        com.unity3d.ads.core.domain.AndroidBuildHeaderBiddingToken.AnonymousClass1 anonymousClass1;
        com.unity3d.ads.core.data.model.TokenCounters tokenCounters;
        gatewayprotocol.v1.HeaderBiddingTokenKt.Dsl dsl_create;
        gatewayprotocol.v1.HeaderBiddingTokenKt.Dsl dsl;
        com.unity3d.ads.core.domain.AndroidBuildHeaderBiddingToken androidBuildHeaderBiddingToken;
        gatewayprotocol.v1.HeaderBiddingTokenKt.Dsl dsl2;
        gatewayprotocol.v1.HeaderBiddingTokenKt.Dsl dsl3;
        gatewayprotocol.v1.HeaderBiddingTokenKt.Dsl dsl4;
        com.unity3d.ads.core.data.model.TokenCounters tokenCounters2;
        if (continuation instanceof com.unity3d.ads.core.domain.AndroidBuildHeaderBiddingToken.AnonymousClass1) {
            anonymousClass1 = (com.unity3d.ads.core.domain.AndroidBuildHeaderBiddingToken.AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new com.unity3d.ads.core.domain.AndroidBuildHeaderBiddingToken.AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new com.unity3d.ads.core.domain.AndroidBuildHeaderBiddingToken.AnonymousClass1(continuation);
        }
        java.lang.Object objInvoke = anonymousClass1.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i != 0) {
            if (i == 1) {
                dsl_create = (gatewayprotocol.v1.HeaderBiddingTokenKt.Dsl) anonymousClass1.L$4;
                dsl2 = (gatewayprotocol.v1.HeaderBiddingTokenKt.Dsl) anonymousClass1.L$3;
                dsl3 = (gatewayprotocol.v1.HeaderBiddingTokenKt.Dsl) anonymousClass1.L$2;
                tokenCounters = (com.unity3d.ads.core.data.model.TokenCounters) anonymousClass1.L$1;
                androidBuildHeaderBiddingToken = (com.unity3d.ads.core.domain.AndroidBuildHeaderBiddingToken) anonymousClass1.L$0;
                kotlin.ResultKt.throwOnFailure(objInvoke);
                dsl_create.setInitializationData((gatewayprotocol.v1.InitializationDataOuterClass.InitializationData) objInvoke);
                com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository = androidBuildHeaderBiddingToken.deviceInfoRepository;
                anonymousClass1.L$0 = tokenCounters;
                anonymousClass1.L$1 = dsl3;
                anonymousClass1.L$2 = dsl2;
                anonymousClass1.L$3 = dsl2;
                anonymousClass1.L$4 = null;
                anonymousClass1.label = 3;
                objInvoke = deviceInfoRepository.staticDeviceInfo(anonymousClass1);
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
                dsl4 = dsl2;
                dsl_create = dsl4;
                dsl = dsl3;
                tokenCounters2 = tokenCounters;
            } else if (i == 2) {
                dsl_create = (gatewayprotocol.v1.HeaderBiddingTokenKt.Dsl) anonymousClass1.L$4;
                dsl2 = (gatewayprotocol.v1.HeaderBiddingTokenKt.Dsl) anonymousClass1.L$3;
                dsl3 = (gatewayprotocol.v1.HeaderBiddingTokenKt.Dsl) anonymousClass1.L$2;
                tokenCounters = (com.unity3d.ads.core.data.model.TokenCounters) anonymousClass1.L$1;
                androidBuildHeaderBiddingToken = (com.unity3d.ads.core.domain.AndroidBuildHeaderBiddingToken) anonymousClass1.L$0;
                kotlin.ResultKt.throwOnFailure(objInvoke);
                dsl_create.setLimitedSessionToken((gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken) objInvoke);
                com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository2 = androidBuildHeaderBiddingToken.deviceInfoRepository;
                anonymousClass1.L$0 = tokenCounters;
                anonymousClass1.L$1 = dsl3;
                anonymousClass1.L$2 = dsl2;
                anonymousClass1.L$3 = dsl2;
                anonymousClass1.L$4 = null;
                anonymousClass1.label = 3;
                objInvoke = deviceInfoRepository2.staticDeviceInfo(anonymousClass1);
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
                dsl4 = dsl2;
                dsl_create = dsl4;
                dsl = dsl3;
                tokenCounters2 = tokenCounters;
            } else {
                if (i != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                dsl4 = (gatewayprotocol.v1.HeaderBiddingTokenKt.Dsl) anonymousClass1.L$3;
                dsl_create = (gatewayprotocol.v1.HeaderBiddingTokenKt.Dsl) anonymousClass1.L$2;
                dsl = (gatewayprotocol.v1.HeaderBiddingTokenKt.Dsl) anonymousClass1.L$1;
                tokenCounters2 = (com.unity3d.ads.core.data.model.TokenCounters) anonymousClass1.L$0;
                kotlin.ResultKt.throwOnFailure(objInvoke);
            }
            dsl4.setStaticDeviceInfo((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) objInvoke);
            tokenCounters = tokenCounters2;
        } else {
            kotlin.ResultKt.throwOnFailure(objInvoke);
            tokenCounters = this.sessionRepository.getTokenCounters();
            com.google.protobuf.ByteString sessionToken = this.sessionRepository.getSessionToken();
            this.sessionRepository.incrementTokenSequenceNumber();
            gatewayprotocol.v1.HeaderBiddingTokenKt.Dsl.Companion companion = gatewayprotocol.v1.HeaderBiddingTokenKt.Dsl.INSTANCE;
            gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder builderNewBuilder = gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.newBuilder();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
            dsl_create = companion._create(builderNewBuilder);
            dsl_create.setTokenId(this.generateId.invoke());
            dsl_create.setTokenNumber(this.sessionRepository.getHeaderBiddingTokenCounter());
            dsl_create.setClientInfo(this.getClientInfo.invoke());
            dsl_create.setTimestamps(this.getTimestamps.invoke());
            dsl_create.setSessionCounters(this.sessionRepository.getSessionCounters());
            dsl_create.setDynamicDeviceInfo(this.deviceInfoRepository.getDynamicDeviceInfo());
            gatewayprotocol.v1.PiiOuterClass.Pii piiData = this.deviceInfoRepository.getPiiData();
            if (!piiData.getAdvertisingId().isEmpty() || !piiData.getOpenAdvertisingTrackingId().isEmpty()) {
                dsl_create.setPii(piiData);
            }
            dsl_create.setCampaignState(this.campaignRepository.getCampaignState());
            java.lang.String tcfString = this.tcfRepository.getTcfString();
            if (tcfString != null) {
                dsl_create.setTcf(com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toISO8859ByteString(tcfString));
            }
            if (sessionToken.isEmpty()) {
                java.lang.String gameId = this.sessionRepository.getGameId();
                boolean z = false;
                if (gameId != null) {
                    if (gameId.length() > 0) {
                        z = true;
                    }
                }
                if (z) {
                    com.unity3d.ads.core.domain.GetInitializationData getInitializationData = this.getInitializationData;
                    anonymousClass1.L$0 = this;
                    anonymousClass1.L$1 = tokenCounters;
                    anonymousClass1.L$2 = dsl_create;
                    anonymousClass1.L$3 = dsl_create;
                    anonymousClass1.L$4 = dsl_create;
                    anonymousClass1.label = 1;
                    objInvoke = getInitializationData.invoke(anonymousClass1);
                    if (objInvoke == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    androidBuildHeaderBiddingToken = this;
                    dsl2 = dsl_create;
                    dsl3 = dsl2;
                    dsl_create.setInitializationData((gatewayprotocol.v1.InitializationDataOuterClass.InitializationData) objInvoke);
                    com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository3 = androidBuildHeaderBiddingToken.deviceInfoRepository;
                    anonymousClass1.L$0 = tokenCounters;
                    anonymousClass1.L$1 = dsl3;
                    anonymousClass1.L$2 = dsl2;
                    anonymousClass1.L$3 = dsl2;
                    anonymousClass1.L$4 = null;
                    anonymousClass1.label = 3;
                    objInvoke = deviceInfoRepository3.staticDeviceInfo(anonymousClass1);
                    if (objInvoke == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    dsl4 = dsl2;
                    dsl_create = dsl4;
                    dsl = dsl3;
                    tokenCounters2 = tokenCounters;
                    dsl4.setStaticDeviceInfo((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) objInvoke);
                    tokenCounters = tokenCounters2;
                } else {
                    com.unity3d.ads.core.domain.GetLimitedSessionToken getLimitedSessionToken = this.getLimitedSessionToken;
                    anonymousClass1.L$0 = this;
                    anonymousClass1.L$1 = tokenCounters;
                    anonymousClass1.L$2 = dsl_create;
                    anonymousClass1.L$3 = dsl_create;
                    anonymousClass1.L$4 = dsl_create;
                    anonymousClass1.label = 2;
                    objInvoke = getLimitedSessionToken.invoke(anonymousClass1);
                    if (objInvoke == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    androidBuildHeaderBiddingToken = this;
                    dsl2 = dsl_create;
                    dsl3 = dsl2;
                    dsl_create.setLimitedSessionToken((gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken) objInvoke);
                    com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository4 = androidBuildHeaderBiddingToken.deviceInfoRepository;
                    anonymousClass1.L$0 = tokenCounters;
                    anonymousClass1.L$1 = dsl3;
                    anonymousClass1.L$2 = dsl2;
                    anonymousClass1.L$3 = dsl2;
                    anonymousClass1.L$4 = null;
                    anonymousClass1.label = 3;
                    objInvoke = deviceInfoRepository4.staticDeviceInfo(anonymousClass1);
                    if (objInvoke == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    dsl4 = dsl2;
                    dsl_create = dsl4;
                    dsl = dsl3;
                    tokenCounters2 = tokenCounters;
                    dsl4.setStaticDeviceInfo((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) objInvoke);
                    tokenCounters = tokenCounters2;
                }
            } else {
                dsl_create.setSessionToken(this.sessionRepository.getSessionToken());
                dsl_create.setStaticDeviceInfo(this.deviceInfoRepository.cachedStaticDeviceInfo());
                dsl = dsl_create;
            }
        }
        gatewayprotocol.v1.TokenCountersKt.Dsl.Companion companion2 = gatewayprotocol.v1.TokenCountersKt.Dsl.INSTANCE;
        gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.Builder builderNewBuilder2 = gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.newBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builderNewBuilder2, "newBuilder()");
        gatewayprotocol.v1.TokenCountersKt.Dsl dsl_create2 = companion2._create(builderNewBuilder2);
        dsl_create2.setSeq(tokenCounters.getSeq());
        dsl_create2.setWins(tokenCounters.getWins());
        dsl_create2.setStarts(tokenCounters.getStarts());
        dsl_create.setTokenCounters(dsl_create2._build());
        return dsl._build();
    }
}
