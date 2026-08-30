package com.unity3d.ads.core.domain;

/* JADX INFO: compiled from: AndroidGetLimitedSessionToken.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0011\u0010\t\u001a\u00020\nH\u0096Bø\u0001\u0000¢\u0006\u0002\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidGetLimitedSessionToken;", "Lcom/unity3d/ads/core/domain/GetLimitedSessionToken;", "deviceInfoRepository", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "mediationRepository", "Lcom/unity3d/ads/core/data/repository/MediationRepository;", "(Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/data/repository/MediationRepository;)V", "invoke", "Lgatewayprotocol/v1/UniversalRequestOuterClass$LimitedSessionToken;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidGetLimitedSessionToken implements com.unity3d.ads.core.domain.GetLimitedSessionToken {
    private final com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository;
    private final com.unity3d.ads.core.data.repository.MediationRepository mediationRepository;
    private final com.unity3d.ads.core.data.repository.SessionRepository sessionRepository;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidGetLimitedSessionToken$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidGetLimitedSessionToken.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.AndroidGetLimitedSessionToken", f = "AndroidGetLimitedSessionToken.kt", i = {0, 0, 1, 1, 2, 2, 3, 3}, l = {19, 20, 21, 22}, m = "invoke", n = {"this", "$this$invoke_u24lambda_u243", "this", "$this$invoke_u24lambda_u243", "this", "$this$invoke_u24lambda_u243", "this", "$this$invoke_u24lambda_u243"}, s = {"L$0", "L$2", "L$0", "L$2", "L$0", "L$2", "L$0", "L$2"})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        java.lang.Object L$3;
        int label;
        /* synthetic */ java.lang.Object result;

        AnonymousClass1(kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.AndroidGetLimitedSessionToken.AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return com.unity3d.ads.core.domain.AndroidGetLimitedSessionToken.this.invoke(this);
        }
    }

    public AndroidGetLimitedSessionToken(com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository, com.unity3d.ads.core.data.repository.SessionRepository sessionRepository, com.unity3d.ads.core.data.repository.MediationRepository mediationRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceInfoRepository, "deviceInfoRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediationRepository, "mediationRepository");
        this.deviceInfoRepository = deviceInfoRepository;
        this.sessionRepository = sessionRepository;
        this.mediationRepository = mediationRepository;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00ff A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x0100  */
    /* JADX WARN: Code duplicated, block: B:34:0x0124 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x0125  */
    /* JADX WARN: Code duplicated, block: B:38:0x0141  */
    /* JADX WARN: Code duplicated, block: B:46:0x0173  */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // com.unity3d.ads.core.domain.GetLimitedSessionToken
    public java.lang.Object invoke(kotlin.coroutines.Continuation<? super gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken> continuation) {
        com.unity3d.ads.core.domain.AndroidGetLimitedSessionToken.AnonymousClass1 anonymousClass1;
        gatewayprotocol.v1.LimitedSessionTokenKt.Dsl dsl_create;
        com.unity3d.ads.core.domain.AndroidGetLimitedSessionToken androidGetLimitedSessionToken;
        gatewayprotocol.v1.LimitedSessionTokenKt.Dsl dsl;
        gatewayprotocol.v1.LimitedSessionTokenKt.Dsl dsl2;
        gatewayprotocol.v1.LimitedSessionTokenKt.Dsl dsl3;
        gatewayprotocol.v1.LimitedSessionTokenKt.Dsl dsl4;
        gatewayprotocol.v1.LimitedSessionTokenKt.Dsl dsl5;
        com.unity3d.ads.core.domain.AndroidGetLimitedSessionToken androidGetLimitedSessionToken2;
        gatewayprotocol.v1.LimitedSessionTokenKt.Dsl dsl6;
        gatewayprotocol.v1.LimitedSessionTokenKt.Dsl dsl7;
        gatewayprotocol.v1.LimitedSessionTokenKt.Dsl dsl8;
        com.unity3d.ads.core.domain.AndroidGetLimitedSessionToken androidGetLimitedSessionToken3;
        gatewayprotocol.v1.LimitedSessionTokenKt.Dsl dsl9;
        gatewayprotocol.v1.LimitedSessionTokenKt.Dsl dsl10;
        gatewayprotocol.v1.LimitedSessionTokenKt.Dsl dsl11;
        com.unity3d.ads.core.domain.AndroidGetLimitedSessionToken androidGetLimitedSessionToken4;
        java.lang.String gameId;
        java.lang.String name;
        java.lang.String version;
        if (continuation instanceof com.unity3d.ads.core.domain.AndroidGetLimitedSessionToken.AnonymousClass1) {
            anonymousClass1 = (com.unity3d.ads.core.domain.AndroidGetLimitedSessionToken.AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new com.unity3d.ads.core.domain.AndroidGetLimitedSessionToken.AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new com.unity3d.ads.core.domain.AndroidGetLimitedSessionToken.AnonymousClass1(continuation);
        }
        java.lang.Object objStaticDeviceInfo = anonymousClass1.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i != 0) {
            if (i == 1) {
                dsl_create = (gatewayprotocol.v1.LimitedSessionTokenKt.Dsl) anonymousClass1.L$3;
                dsl = (gatewayprotocol.v1.LimitedSessionTokenKt.Dsl) anonymousClass1.L$2;
                dsl2 = (gatewayprotocol.v1.LimitedSessionTokenKt.Dsl) anonymousClass1.L$1;
                androidGetLimitedSessionToken = (com.unity3d.ads.core.domain.AndroidGetLimitedSessionToken) anonymousClass1.L$0;
                kotlin.ResultKt.throwOnFailure(objStaticDeviceInfo);
            } else if (i == 2) {
                dsl3 = (gatewayprotocol.v1.LimitedSessionTokenKt.Dsl) anonymousClass1.L$3;
                dsl4 = (gatewayprotocol.v1.LimitedSessionTokenKt.Dsl) anonymousClass1.L$2;
                dsl5 = (gatewayprotocol.v1.LimitedSessionTokenKt.Dsl) anonymousClass1.L$1;
                androidGetLimitedSessionToken2 = (com.unity3d.ads.core.domain.AndroidGetLimitedSessionToken) anonymousClass1.L$0;
                kotlin.ResultKt.throwOnFailure(objStaticDeviceInfo);
                java.lang.String deviceModel = ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) objStaticDeviceInfo).getDeviceModel();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(deviceModel, "deviceInfoRepository.sta…cDeviceInfo().deviceModel");
                dsl3.setDeviceModel(deviceModel);
                com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository = androidGetLimitedSessionToken2.deviceInfoRepository;
                anonymousClass1.L$0 = androidGetLimitedSessionToken2;
                anonymousClass1.L$1 = dsl5;
                anonymousClass1.L$2 = dsl4;
                anonymousClass1.L$3 = dsl4;
                anonymousClass1.label = 3;
                objStaticDeviceInfo = deviceInfoRepository.staticDeviceInfo(anonymousClass1);
                if (objStaticDeviceInfo == coroutine_suspended) {
                    return coroutine_suspended;
                }
                dsl6 = dsl4;
                dsl7 = dsl6;
                dsl8 = dsl5;
                androidGetLimitedSessionToken3 = androidGetLimitedSessionToken2;
                java.lang.String osVersion = ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) objStaticDeviceInfo).getOsVersion();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(osVersion, "deviceInfoRepository.staticDeviceInfo().osVersion");
                dsl6.setOsVersion(osVersion);
                com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository2 = androidGetLimitedSessionToken3.deviceInfoRepository;
                anonymousClass1.L$0 = androidGetLimitedSessionToken3;
                anonymousClass1.L$1 = dsl8;
                anonymousClass1.L$2 = dsl7;
                anonymousClass1.L$3 = dsl7;
                anonymousClass1.label = 4;
                objStaticDeviceInfo = deviceInfoRepository2.getIdfi(anonymousClass1);
                if (objStaticDeviceInfo == coroutine_suspended) {
                    return coroutine_suspended;
                }
                dsl9 = dsl7;
                dsl10 = dsl9;
                dsl11 = dsl8;
                androidGetLimitedSessionToken4 = androidGetLimitedSessionToken3;
            } else if (i == 3) {
                dsl6 = (gatewayprotocol.v1.LimitedSessionTokenKt.Dsl) anonymousClass1.L$3;
                dsl7 = (gatewayprotocol.v1.LimitedSessionTokenKt.Dsl) anonymousClass1.L$2;
                dsl8 = (gatewayprotocol.v1.LimitedSessionTokenKt.Dsl) anonymousClass1.L$1;
                androidGetLimitedSessionToken3 = (com.unity3d.ads.core.domain.AndroidGetLimitedSessionToken) anonymousClass1.L$0;
                kotlin.ResultKt.throwOnFailure(objStaticDeviceInfo);
                java.lang.String osVersion2 = ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) objStaticDeviceInfo).getOsVersion();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(osVersion2, "deviceInfoRepository.staticDeviceInfo().osVersion");
                dsl6.setOsVersion(osVersion2);
                com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository3 = androidGetLimitedSessionToken3.deviceInfoRepository;
                anonymousClass1.L$0 = androidGetLimitedSessionToken3;
                anonymousClass1.L$1 = dsl8;
                anonymousClass1.L$2 = dsl7;
                anonymousClass1.L$3 = dsl7;
                anonymousClass1.label = 4;
                objStaticDeviceInfo = deviceInfoRepository3.getIdfi(anonymousClass1);
                if (objStaticDeviceInfo == coroutine_suspended) {
                    return coroutine_suspended;
                }
                dsl9 = dsl7;
                dsl10 = dsl9;
                dsl11 = dsl8;
                androidGetLimitedSessionToken4 = androidGetLimitedSessionToken3;
            } else {
                if (i != 4) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                dsl9 = (gatewayprotocol.v1.LimitedSessionTokenKt.Dsl) anonymousClass1.L$3;
                dsl10 = (gatewayprotocol.v1.LimitedSessionTokenKt.Dsl) anonymousClass1.L$2;
                dsl11 = (gatewayprotocol.v1.LimitedSessionTokenKt.Dsl) anonymousClass1.L$1;
                androidGetLimitedSessionToken4 = (com.unity3d.ads.core.domain.AndroidGetLimitedSessionToken) anonymousClass1.L$0;
                kotlin.ResultKt.throwOnFailure(objStaticDeviceInfo);
            }
            dsl9.setIdfi((java.lang.String) objStaticDeviceInfo);
            dsl10.setSdkVersion(41205);
            dsl10.setSdkVersionName("4.12.5");
            gameId = androidGetLimitedSessionToken4.sessionRepository.getGameId();
            if (gameId != null) {
                dsl10.setGameId(gameId);
            }
            dsl10.setPlatform(gatewayprotocol.v1.ClientInfoOuterClass.Platform.PLATFORM_ANDROID);
            dsl10.setMediationProvider(androidGetLimitedSessionToken4.mediationRepository.getMediationProvider().invoke());
            name = androidGetLimitedSessionToken4.mediationRepository.getName();
            if (name != null && dsl10.getMediationProvider() == gatewayprotocol.v1.ClientInfoOuterClass.MediationProvider.MEDIATION_PROVIDER_CUSTOM) {
                dsl10.setCustomMediationName(name);
            }
            version = androidGetLimitedSessionToken4.mediationRepository.getVersion();
            if (version != null) {
                dsl10.setMediationVersion(version);
            }
            return dsl11._build();
        }
        kotlin.ResultKt.throwOnFailure(objStaticDeviceInfo);
        gatewayprotocol.v1.LimitedSessionTokenKt.Dsl.Companion companion = gatewayprotocol.v1.LimitedSessionTokenKt.Dsl.INSTANCE;
        gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken.Builder builderNewBuilder = gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken.newBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        dsl_create = companion._create(builderNewBuilder);
        dsl_create.setSessionId(this.sessionRepository.getSessionId());
        com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository4 = this.deviceInfoRepository;
        anonymousClass1.L$0 = this;
        anonymousClass1.L$1 = dsl_create;
        anonymousClass1.L$2 = dsl_create;
        anonymousClass1.L$3 = dsl_create;
        anonymousClass1.label = 1;
        objStaticDeviceInfo = deviceInfoRepository4.staticDeviceInfo(anonymousClass1);
        if (objStaticDeviceInfo == coroutine_suspended) {
            return coroutine_suspended;
        }
        androidGetLimitedSessionToken = this;
        dsl = dsl_create;
        dsl2 = dsl;
        java.lang.String deviceMake = ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) objStaticDeviceInfo).getDeviceMake();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(deviceMake, "deviceInfoRepository.staticDeviceInfo().deviceMake");
        dsl_create.setDeviceMake(deviceMake);
        com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository5 = androidGetLimitedSessionToken.deviceInfoRepository;
        anonymousClass1.L$0 = androidGetLimitedSessionToken;
        anonymousClass1.L$1 = dsl2;
        anonymousClass1.L$2 = dsl;
        anonymousClass1.L$3 = dsl;
        anonymousClass1.label = 2;
        objStaticDeviceInfo = deviceInfoRepository5.staticDeviceInfo(anonymousClass1);
        if (objStaticDeviceInfo == coroutine_suspended) {
            return coroutine_suspended;
        }
        dsl3 = dsl;
        dsl4 = dsl3;
        dsl5 = dsl2;
        androidGetLimitedSessionToken2 = androidGetLimitedSessionToken;
        java.lang.String deviceModel2 = ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) objStaticDeviceInfo).getDeviceModel();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(deviceModel2, "deviceInfoRepository.sta…cDeviceInfo().deviceModel");
        dsl3.setDeviceModel(deviceModel2);
        com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository6 = androidGetLimitedSessionToken2.deviceInfoRepository;
        anonymousClass1.L$0 = androidGetLimitedSessionToken2;
        anonymousClass1.L$1 = dsl5;
        anonymousClass1.L$2 = dsl4;
        anonymousClass1.L$3 = dsl4;
        anonymousClass1.label = 3;
        objStaticDeviceInfo = deviceInfoRepository6.staticDeviceInfo(anonymousClass1);
        if (objStaticDeviceInfo == coroutine_suspended) {
            return coroutine_suspended;
        }
        dsl6 = dsl4;
        dsl7 = dsl6;
        dsl8 = dsl5;
        androidGetLimitedSessionToken3 = androidGetLimitedSessionToken2;
        java.lang.String osVersion3 = ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) objStaticDeviceInfo).getOsVersion();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(osVersion3, "deviceInfoRepository.staticDeviceInfo().osVersion");
        dsl6.setOsVersion(osVersion3);
        com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository7 = androidGetLimitedSessionToken3.deviceInfoRepository;
        anonymousClass1.L$0 = androidGetLimitedSessionToken3;
        anonymousClass1.L$1 = dsl8;
        anonymousClass1.L$2 = dsl7;
        anonymousClass1.L$3 = dsl7;
        anonymousClass1.label = 4;
        objStaticDeviceInfo = deviceInfoRepository7.getIdfi(anonymousClass1);
        if (objStaticDeviceInfo == coroutine_suspended) {
            return coroutine_suspended;
        }
        dsl9 = dsl7;
        dsl10 = dsl9;
        dsl11 = dsl8;
        androidGetLimitedSessionToken4 = androidGetLimitedSessionToken3;
        dsl9.setIdfi((java.lang.String) objStaticDeviceInfo);
        dsl10.setSdkVersion(41205);
        dsl10.setSdkVersionName("4.12.5");
        gameId = androidGetLimitedSessionToken4.sessionRepository.getGameId();
        if (gameId != null) {
            dsl10.setGameId(gameId);
        }
        dsl10.setPlatform(gatewayprotocol.v1.ClientInfoOuterClass.Platform.PLATFORM_ANDROID);
        dsl10.setMediationProvider(androidGetLimitedSessionToken4.mediationRepository.getMediationProvider().invoke());
        name = androidGetLimitedSessionToken4.mediationRepository.getName();
        if (name != null) {
            dsl10.setCustomMediationName(name);
        }
        version = androidGetLimitedSessionToken4.mediationRepository.getVersion();
        if (version != null) {
            dsl10.setMediationVersion(version);
        }
        return dsl11._build();
    }
}
