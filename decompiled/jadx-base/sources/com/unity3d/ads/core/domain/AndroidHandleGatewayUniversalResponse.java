package com.unity3d.ads.core.domain;

/* JADX INFO: compiled from: AndroidHandleGatewayUniversalResponse.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0096Bø\u0001\u0000¢\u0006\u0002\u0010\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidHandleGatewayUniversalResponse;", "Lcom/unity3d/ads/core/domain/HandleGatewayUniversalResponse;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "deviceInfoRepository", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "(Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;)V", "invoke", "", com.json.hs.n, "Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse;", "(Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidHandleGatewayUniversalResponse implements com.unity3d.ads.core.domain.HandleGatewayUniversalResponse {
    private final com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository;
    private final com.unity3d.ads.core.data.repository.SessionRepository sessionRepository;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidHandleGatewayUniversalResponse$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidHandleGatewayUniversalResponse.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.AndroidHandleGatewayUniversalResponse", f = "AndroidHandleGatewayUniversalResponse.kt", i = {0, 0, 1, 1}, l = {36, 42, 45}, m = "invoke", n = {"this", "mutableData", "this", "mutableData"}, s = {"L$0", "L$1", "L$0", "L$1"})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        int label;
        /* synthetic */ java.lang.Object result;

        AnonymousClass1(kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.AndroidHandleGatewayUniversalResponse.AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return com.unity3d.ads.core.domain.AndroidHandleGatewayUniversalResponse.this.invoke(null, this);
        }
    }

    public AndroidHandleGatewayUniversalResponse(com.unity3d.ads.core.data.repository.SessionRepository sessionRepository, com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceInfoRepository, "deviceInfoRepository");
        this.sessionRepository = sessionRepository;
        this.deviceInfoRepository = deviceInfoRepository;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:46:0x0112 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // com.unity3d.ads.core.domain.HandleGatewayUniversalResponse
    public java.lang.Object invoke(gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse universalResponse, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) throws com.unity3d.ads.core.data.model.exception.GatewayException {
        com.unity3d.ads.core.domain.AndroidHandleGatewayUniversalResponse.AnonymousClass1 anonymousClass1;
        gatewayprotocol.v1.MutableDataOuterClass.MutableData mutableData;
        gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPii value;
        gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPii allowedPii;
        com.unity3d.ads.core.domain.AndroidHandleGatewayUniversalResponse androidHandleGatewayUniversalResponse;
        com.unity3d.ads.core.data.repository.SessionRepository sessionRepository;
        com.google.protobuf.ByteString privacyFsm;
        if (continuation instanceof com.unity3d.ads.core.domain.AndroidHandleGatewayUniversalResponse.AnonymousClass1) {
            anonymousClass1 = (com.unity3d.ads.core.domain.AndroidHandleGatewayUniversalResponse.AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new com.unity3d.ads.core.domain.AndroidHandleGatewayUniversalResponse.AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new com.unity3d.ads.core.domain.AndroidHandleGatewayUniversalResponse.AnonymousClass1(continuation);
        }
        java.lang.Object obj = anonymousClass1.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            if (universalResponse.hasError()) {
                this.sessionRepository.setShouldInitialize(false);
                java.lang.String errorText = universalResponse.getError().getErrorText();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(errorText, "response.error.errorText");
                throw new com.unity3d.ads.core.data.model.exception.GatewayException(errorText, new java.lang.IllegalStateException(universalResponse.getError().getErrorText()), "gateway_universal", universalResponse.getError().getErrorText());
            }
            if (universalResponse.hasMutableData()) {
                mutableData = universalResponse.getMutableData();
                kotlinx.coroutines.flow.MutableStateFlow<gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPii> allowedPii2 = this.deviceInfoRepository.getAllowedPii();
                do {
                    value = allowedPii2.getValue();
                    allowedPii = mutableData.getAllowedPii();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(allowedPii, "mutableData.allowedPii");
                } while (!allowedPii2.compareAndSet(value, allowedPii));
                com.unity3d.ads.core.data.repository.SessionRepository sessionRepository2 = this.sessionRepository;
                com.google.protobuf.ByteString currentState = mutableData.getCurrentState();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(currentState, "mutableData.currentState");
                sessionRepository2.setGatewayState(currentState);
                if (mutableData.hasSessionToken()) {
                    com.unity3d.ads.core.data.repository.SessionRepository sessionRepository3 = this.sessionRepository;
                    com.google.protobuf.ByteString sessionToken = mutableData.getSessionToken();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sessionToken, "mutableData.sessionToken");
                    sessionRepository3.setSessionToken(sessionToken);
                }
                if (mutableData.hasPrivacy()) {
                    com.unity3d.ads.core.data.repository.SessionRepository sessionRepository4 = this.sessionRepository;
                    com.google.protobuf.ByteString privacy = mutableData.getPrivacy();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(privacy, "mutableData.privacy");
                    anonymousClass1.L$0 = this;
                    anonymousClass1.L$1 = mutableData;
                    anonymousClass1.label = 1;
                    if (sessionRepository4.setPrivacy(privacy, anonymousClass1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                androidHandleGatewayUniversalResponse = this;
            }
            return kotlin.Unit.INSTANCE;
        }
        if (i == 1) {
            mutableData = (gatewayprotocol.v1.MutableDataOuterClass.MutableData) anonymousClass1.L$1;
            androidHandleGatewayUniversalResponse = (com.unity3d.ads.core.domain.AndroidHandleGatewayUniversalResponse) anonymousClass1.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
        } else {
            if (i == 2) {
                mutableData = (gatewayprotocol.v1.MutableDataOuterClass.MutableData) anonymousClass1.L$1;
                androidHandleGatewayUniversalResponse = (com.unity3d.ads.core.domain.AndroidHandleGatewayUniversalResponse) anonymousClass1.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                if (mutableData.hasPrivacyFsm()) {
                    sessionRepository = androidHandleGatewayUniversalResponse.sessionRepository;
                    privacyFsm = mutableData.getPrivacyFsm();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(privacyFsm, "mutableData.privacyFsm");
                    anonymousClass1.L$0 = null;
                    anonymousClass1.L$1 = null;
                    anonymousClass1.label = 3;
                    if (sessionRepository.setPrivacyFsm(privacyFsm, anonymousClass1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return kotlin.Unit.INSTANCE;
            }
            if (i != 3) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
        if (mutableData.hasSessionCounters()) {
            com.unity3d.ads.core.data.repository.SessionRepository sessionRepository5 = androidHandleGatewayUniversalResponse.sessionRepository;
            gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters sessionCounters = mutableData.getSessionCounters();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sessionCounters, "mutableData.sessionCounters");
            sessionRepository5.setSessionCounters(sessionCounters);
        }
        if (mutableData.hasCache()) {
            com.unity3d.ads.core.data.repository.SessionRepository sessionRepository6 = androidHandleGatewayUniversalResponse.sessionRepository;
            com.google.protobuf.ByteString cache = mutableData.getCache();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(cache, "mutableData.cache");
            anonymousClass1.L$0 = androidHandleGatewayUniversalResponse;
            anonymousClass1.L$1 = mutableData;
            anonymousClass1.label = 2;
            if (sessionRepository6.setGatewayCache(cache, anonymousClass1) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        if (mutableData.hasPrivacyFsm()) {
            sessionRepository = androidHandleGatewayUniversalResponse.sessionRepository;
            privacyFsm = mutableData.getPrivacyFsm();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(privacyFsm, "mutableData.privacyFsm");
            anonymousClass1.L$0 = null;
            anonymousClass1.L$1 = null;
            anonymousClass1.label = 3;
            if (sessionRepository.setPrivacyFsm(privacyFsm, anonymousClass1) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return kotlin.Unit.INSTANCE;
        }
        return kotlin.Unit.INSTANCE;
    }
}
