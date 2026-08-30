package com.unity3d.ads.core.domain;

/* JADX INFO: compiled from: AndroidGetUniversalRequestSharedData.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0011\u0010\r\u001a\u00020\u000eH\u0096Bø\u0001\u0000¢\u0006\u0002\u0010\u000fR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidGetUniversalRequestSharedData;", "Lcom/unity3d/ads/core/domain/GetUniversalRequestSharedData;", "getSharedDataTimestamps", "Lcom/unity3d/ads/core/domain/GetSharedDataTimestamps;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "deviceInfoRepository", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "getLimitedSessionToken", "Lcom/unity3d/ads/core/domain/GetLimitedSessionToken;", "developerConsentRepository", "Lcom/unity3d/ads/core/data/repository/DeveloperConsentRepository;", "(Lcom/unity3d/ads/core/domain/GetSharedDataTimestamps;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;Lcom/unity3d/ads/core/domain/GetLimitedSessionToken;Lcom/unity3d/ads/core/data/repository/DeveloperConsentRepository;)V", "invoke", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$SharedData;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidGetUniversalRequestSharedData implements com.unity3d.ads.core.domain.GetUniversalRequestSharedData {
    private final com.unity3d.ads.core.data.repository.DeveloperConsentRepository developerConsentRepository;
    private final com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository;
    private final com.unity3d.ads.core.domain.GetLimitedSessionToken getLimitedSessionToken;
    private final com.unity3d.ads.core.domain.GetSharedDataTimestamps getSharedDataTimestamps;
    private final com.unity3d.ads.core.data.repository.SessionRepository sessionRepository;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidGetUniversalRequestSharedData$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidGetUniversalRequestSharedData.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.AndroidGetUniversalRequestSharedData", f = "AndroidGetUniversalRequestSharedData.kt", i = {0, 0}, l = {24}, m = "invoke", n = {"this", "$this$invoke_u24lambda_u240"}, s = {"L$0", "L$2"})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        java.lang.Object L$3;
        int label;
        /* synthetic */ java.lang.Object result;

        AnonymousClass1(kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.AndroidGetUniversalRequestSharedData.AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return com.unity3d.ads.core.domain.AndroidGetUniversalRequestSharedData.this.invoke(this);
        }
    }

    public AndroidGetUniversalRequestSharedData(com.unity3d.ads.core.domain.GetSharedDataTimestamps getSharedDataTimestamps, com.unity3d.ads.core.data.repository.SessionRepository sessionRepository, com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository, com.unity3d.ads.core.domain.GetLimitedSessionToken getLimitedSessionToken, com.unity3d.ads.core.data.repository.DeveloperConsentRepository developerConsentRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getSharedDataTimestamps, "getSharedDataTimestamps");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceInfoRepository, "deviceInfoRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getLimitedSessionToken, "getLimitedSessionToken");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(developerConsentRepository, "developerConsentRepository");
        this.getSharedDataTimestamps = getSharedDataTimestamps;
        this.sessionRepository = sessionRepository;
        this.deviceInfoRepository = deviceInfoRepository;
        this.getLimitedSessionToken = getLimitedSessionToken;
        this.developerConsentRepository = developerConsentRepository;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // com.unity3d.ads.core.domain.GetUniversalRequestSharedData
    public java.lang.Object invoke(kotlin.coroutines.Continuation<? super gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData> continuation) {
        com.unity3d.ads.core.domain.AndroidGetUniversalRequestSharedData.AnonymousClass1 anonymousClass1;
        gatewayprotocol.v1.UniversalRequestKt.SharedDataKt.Dsl dsl_create;
        gatewayprotocol.v1.UniversalRequestKt.SharedDataKt.Dsl dsl;
        gatewayprotocol.v1.UniversalRequestKt.SharedDataKt.Dsl dsl2;
        gatewayprotocol.v1.UniversalRequestKt.SharedDataKt.Dsl dsl3;
        com.unity3d.ads.core.domain.AndroidGetUniversalRequestSharedData androidGetUniversalRequestSharedData;
        gatewayprotocol.v1.PiiOuterClass.Pii piiData;
        if (continuation instanceof com.unity3d.ads.core.domain.AndroidGetUniversalRequestSharedData.AnonymousClass1) {
            anonymousClass1 = (com.unity3d.ads.core.domain.AndroidGetUniversalRequestSharedData.AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new com.unity3d.ads.core.domain.AndroidGetUniversalRequestSharedData.AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new com.unity3d.ads.core.domain.AndroidGetUniversalRequestSharedData.AnonymousClass1(continuation);
        }
        java.lang.Object obj = anonymousClass1.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            gatewayprotocol.v1.UniversalRequestKt universalRequestKt = gatewayprotocol.v1.UniversalRequestKt.INSTANCE;
            gatewayprotocol.v1.UniversalRequestKt.SharedDataKt.Dsl.Companion companion = gatewayprotocol.v1.UniversalRequestKt.SharedDataKt.Dsl.INSTANCE;
            gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData.Builder builderNewBuilder = gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData.newBuilder();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
            dsl_create = companion._create(builderNewBuilder);
            com.google.protobuf.ByteString sessionToken = this.sessionRepository.getSessionToken();
            if (!sessionToken.isEmpty()) {
                dsl_create.setSessionToken(sessionToken);
                androidGetUniversalRequestSharedData = this;
                dsl3 = dsl_create;
            } else {
                com.unity3d.ads.core.domain.GetLimitedSessionToken getLimitedSessionToken = this.getLimitedSessionToken;
                anonymousClass1.L$0 = this;
                anonymousClass1.L$1 = dsl_create;
                anonymousClass1.L$2 = dsl_create;
                anonymousClass1.L$3 = dsl_create;
                anonymousClass1.label = 1;
                java.lang.Object objInvoke = getLimitedSessionToken.invoke(anonymousClass1);
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
                dsl = dsl_create;
                dsl2 = dsl;
                dsl3 = dsl2;
                obj = objInvoke;
                androidGetUniversalRequestSharedData = this;
            }
            dsl_create.setTimestamps(androidGetUniversalRequestSharedData.getSharedDataTimestamps.invoke());
            dsl_create.setSdkStartTime(com.unity3d.ads.core.extensions.TimestampExtensionsKt.fromMillis(com.unity3d.services.core.properties.SdkProperties.getInitializationTimeEpoch()));
            dsl_create.setAppStartTime(com.unity3d.ads.core.extensions.TimestampExtensionsKt.fromMillis(com.unity3d.services.core.properties.SdkProperties.getAppInitializationTimeSinceEpoch()));
            dsl_create.setDeveloperConsent(androidGetUniversalRequestSharedData.developerConsentRepository.getDeveloperConsent());
            piiData = androidGetUniversalRequestSharedData.deviceInfoRepository.getPiiData();
            if (piiData.getAdvertisingId().isEmpty() || !piiData.getOpenAdvertisingTrackingId().isEmpty()) {
                dsl_create.setPii(piiData);
            }
            return dsl3._build();
        }
        if (i != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        dsl = (gatewayprotocol.v1.UniversalRequestKt.SharedDataKt.Dsl) anonymousClass1.L$3;
        dsl2 = (gatewayprotocol.v1.UniversalRequestKt.SharedDataKt.Dsl) anonymousClass1.L$2;
        dsl3 = (gatewayprotocol.v1.UniversalRequestKt.SharedDataKt.Dsl) anonymousClass1.L$1;
        androidGetUniversalRequestSharedData = (com.unity3d.ads.core.domain.AndroidGetUniversalRequestSharedData) anonymousClass1.L$0;
        kotlin.ResultKt.throwOnFailure(obj);
        dsl.setLimitedSessionToken((gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken) obj);
        dsl_create = dsl2;
        dsl_create.setTimestamps(androidGetUniversalRequestSharedData.getSharedDataTimestamps.invoke());
        dsl_create.setSdkStartTime(com.unity3d.ads.core.extensions.TimestampExtensionsKt.fromMillis(com.unity3d.services.core.properties.SdkProperties.getInitializationTimeEpoch()));
        dsl_create.setAppStartTime(com.unity3d.ads.core.extensions.TimestampExtensionsKt.fromMillis(com.unity3d.services.core.properties.SdkProperties.getAppInitializationTimeSinceEpoch()));
        dsl_create.setDeveloperConsent(androidGetUniversalRequestSharedData.developerConsentRepository.getDeveloperConsent());
        piiData = androidGetUniversalRequestSharedData.deviceInfoRepository.getPiiData();
        if (piiData.getAdvertisingId().isEmpty()) {
            dsl_create.setPii(piiData);
        } else {
            dsl_create.setPii(piiData);
        }
        return dsl3._build();
    }
}
