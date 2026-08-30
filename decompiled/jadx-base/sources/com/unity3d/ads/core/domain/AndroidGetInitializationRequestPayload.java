package com.unity3d.ads.core.domain;

/* JADX INFO: compiled from: AndroidGetInitializationRequestPayload.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0011\u0010\u000b\u001a\u00020\fH\u0096Bø\u0001\u0000¢\u0006\u0002\u0010\rR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidGetInitializationRequestPayload;", "Lcom/unity3d/ads/core/domain/GetInitializationRequestPayload;", "getClientInfo", "Lcom/unity3d/ads/core/domain/GetClientInfo;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "deviceInfoRepository", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "legacyUserConsentRepository", "Lcom/unity3d/ads/core/data/repository/LegacyUserConsentRepository;", "(Lcom/unity3d/ads/core/domain/GetClientInfo;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;Lcom/unity3d/ads/core/data/repository/LegacyUserConsentRepository;)V", "invoke", "Lgatewayprotocol/v1/InitializationRequestOuterClass$InitializationRequest;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidGetInitializationRequestPayload implements com.unity3d.ads.core.domain.GetInitializationRequestPayload {
    private final com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository;
    private final com.unity3d.ads.core.domain.GetClientInfo getClientInfo;
    private final com.unity3d.ads.core.data.repository.LegacyUserConsentRepository legacyUserConsentRepository;
    private final com.unity3d.ads.core.data.repository.SessionRepository sessionRepository;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidGetInitializationRequestPayload.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload", f = "AndroidGetInitializationRequestPayload.kt", i = {0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6}, l = {22, 30, 31, 42, 47, 52, 57}, m = "invoke", n = {"this", "$this$invoke_u24lambda_u244", "this", "$this$invoke_u24lambda_u244", "$this$invoke_u24lambda_u244_u24lambda_u242", "this", "$this$invoke_u24lambda_u244", "$this$invoke_u24lambda_u244_u24lambda_u242", "this", "$this$invoke_u24lambda_u244", "this", "$this$invoke_u24lambda_u244", "this", "$this$invoke_u24lambda_u244", "this", "$this$invoke_u24lambda_u244"}, s = {"L$0", "L$2", "L$0", "L$2", "L$5", "L$0", "L$2", "L$5", "L$0", "L$2", "L$0", "L$2", "L$0", "L$2", "L$0", "L$2"})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        java.lang.Object L$3;
        java.lang.Object L$4;
        java.lang.Object L$5;
        java.lang.Object L$6;
        int label;
        /* synthetic */ java.lang.Object result;

        AnonymousClass1(kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload.AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload.this.invoke(this);
        }
    }

    public AndroidGetInitializationRequestPayload(com.unity3d.ads.core.domain.GetClientInfo getClientInfo, com.unity3d.ads.core.data.repository.SessionRepository sessionRepository, com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository, com.unity3d.ads.core.data.repository.LegacyUserConsentRepository legacyUserConsentRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getClientInfo, "getClientInfo");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceInfoRepository, "deviceInfoRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(legacyUserConsentRepository, "legacyUserConsentRepository");
        this.getClientInfo = getClientInfo;
        this.sessionRepository = sessionRepository;
        this.deviceInfoRepository = deviceInfoRepository;
        this.legacyUserConsentRepository = legacyUserConsentRepository;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0105  */
    /* JADX WARN: Code duplicated, block: B:37:0x0136  */
    /* JADX WARN: Code duplicated, block: B:40:0x018c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:41:0x018d  */
    /* JADX WARN: Code duplicated, block: B:44:0x01b4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:45:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:48:0x025c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:49:0x025d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0264  */
    /* JADX WARN: Code duplicated, block: B:55:0x0278 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:58:0x0280  */
    /* JADX WARN: Code duplicated, block: B:60:0x0286  */
    /* JADX WARN: Code duplicated, block: B:62:0x0289  */
    /* JADX WARN: Code duplicated, block: B:65:0x029d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:66:0x029e  */
    /* JADX WARN: Code duplicated, block: B:69:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:72:0x02bb A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:73:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:76:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:79:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    @Override // com.unity3d.ads.core.domain.GetInitializationRequestPayload
    public java.lang.Object invoke(kotlin.coroutines.Continuation<? super gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest> continuation) {
        com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload.AnonymousClass1 anonymousClass1;
        gatewayprotocol.v1.InitializationRequestKt.Dsl dsl_create;
        boolean z;
        com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload androidGetInitializationRequestPayload;
        gatewayprotocol.v1.InitializationRequestKt.Dsl dsl;
        gatewayprotocol.v1.InitializationRequestKt.Dsl dsl2;
        java.lang.String analyticsUserId;
        gatewayprotocol.v1.InitializationDeviceInfoKt.Dsl dsl_create2;
        gatewayprotocol.v1.InitializationDeviceInfoKt.Dsl dsl3;
        gatewayprotocol.v1.InitializationRequestKt.Dsl dsl4;
        com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload androidGetInitializationRequestPayload2;
        gatewayprotocol.v1.InitializationDeviceInfoKt.Dsl dsl5;
        gatewayprotocol.v1.InitializationRequestKt.Dsl dsl6;
        gatewayprotocol.v1.InitializationDeviceInfoKt.Dsl dsl7;
        gatewayprotocol.v1.InitializationRequestKt.Dsl dsl8;
        gatewayprotocol.v1.InitializationRequestKt.Dsl dsl9;
        com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload androidGetInitializationRequestPayload3;
        com.google.protobuf.ByteString byteString;
        java.lang.String str;
        java.lang.String str2;
        com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload androidGetInitializationRequestPayload4;
        com.google.protobuf.ByteString byteString2;
        gatewayprotocol.v1.InitializationRequestKt.Dsl dsl10;
        gatewayprotocol.v1.InitializationRequestKt.Dsl dsl11;
        com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload androidGetInitializationRequestPayload5;
        com.google.protobuf.ByteString byteString3;
        java.lang.String legacyFlowUserConsent;
        if (continuation instanceof com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload.AnonymousClass1) {
            anonymousClass1 = (com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload.AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload.AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload.AnonymousClass1(continuation);
        }
        java.lang.Object idfi = anonymousClass1.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (anonymousClass1.label) {
            case 0:
                kotlin.ResultKt.throwOnFailure(idfi);
                gatewayprotocol.v1.InitializationRequestKt.Dsl.Companion companion = gatewayprotocol.v1.InitializationRequestKt.Dsl.INSTANCE;
                gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest.Builder builderNewBuilder = gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest.newBuilder();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
                dsl_create = companion._create(builderNewBuilder);
                com.unity3d.services.core.device.Storage storage = com.unity3d.services.core.device.StorageManager.getStorage(com.unity3d.services.core.device.StorageManager.StorageType.PRIVATE);
                if (storage.readStorage()) {
                    java.lang.Object obj = storage.get("configuration.hasInitialized");
                    java.lang.Boolean bool = obj instanceof java.lang.Boolean ? (java.lang.Boolean) obj : null;
                    if (bool != null ? bool.booleanValue() : false) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
                dsl_create.setIsFirstInit(!z);
                dsl_create.setClientInfo(this.getClientInfo.invoke());
                com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository = this.deviceInfoRepository;
                anonymousClass1.L$0 = this;
                anonymousClass1.L$1 = dsl_create;
                anonymousClass1.L$2 = dsl_create;
                anonymousClass1.L$3 = dsl_create;
                anonymousClass1.label = 1;
                idfi = deviceInfoRepository.getIdfi(anonymousClass1);
                if (idfi == coroutine_suspended) {
                    return coroutine_suspended;
                }
                androidGetInitializationRequestPayload = this;
                dsl = dsl_create;
                dsl2 = dsl;
                dsl_create.setIdfi((java.lang.String) idfi);
                analyticsUserId = androidGetInitializationRequestPayload.deviceInfoRepository.getAnalyticsUserId();
                if (analyticsUserId != null) {
                    dsl.setAnalyticsUserId(analyticsUserId);
                }
                dsl.setSessionId(androidGetInitializationRequestPayload.sessionRepository.getSessionId());
                gatewayprotocol.v1.InitializationDeviceInfoKt.Dsl.Companion companion2 = gatewayprotocol.v1.InitializationDeviceInfoKt.Dsl.INSTANCE;
                gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo.Builder builderNewBuilder2 = gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo.newBuilder();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builderNewBuilder2, "newBuilder()");
                dsl_create2 = companion2._create(builderNewBuilder2);
                dsl_create2.setBundleId(androidGetInitializationRequestPayload.deviceInfoRepository.getAppName());
                dsl_create2.setDeviceModel(androidGetInitializationRequestPayload.deviceInfoRepository.getModel());
                dsl_create2.setDeviceMake(androidGetInitializationRequestPayload.deviceInfoRepository.getManufacturer());
                dsl_create2.setOsVersion(androidGetInitializationRequestPayload.deviceInfoRepository.getOsVersion());
                com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository2 = androidGetInitializationRequestPayload.deviceInfoRepository;
                anonymousClass1.L$0 = androidGetInitializationRequestPayload;
                anonymousClass1.L$1 = dsl2;
                anonymousClass1.L$2 = dsl;
                anonymousClass1.L$3 = dsl_create2;
                anonymousClass1.L$4 = dsl;
                anonymousClass1.L$5 = dsl_create2;
                anonymousClass1.L$6 = dsl_create2;
                anonymousClass1.label = 2;
                idfi = deviceInfoRepository2.staticDeviceInfo(anonymousClass1);
                if (idfi == coroutine_suspended) {
                    return coroutine_suspended;
                }
                dsl3 = dsl_create2;
                dsl4 = dsl2;
                androidGetInitializationRequestPayload2 = androidGetInitializationRequestPayload;
                dsl5 = dsl3;
                dsl6 = dsl;
                dsl_create2.setTotalDiskSpace(((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) idfi).getTotalDiskSpace());
                com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository3 = androidGetInitializationRequestPayload2.deviceInfoRepository;
                anonymousClass1.L$0 = androidGetInitializationRequestPayload2;
                anonymousClass1.L$1 = dsl4;
                anonymousClass1.L$2 = dsl6;
                anonymousClass1.L$3 = dsl5;
                anonymousClass1.L$4 = dsl;
                anonymousClass1.L$5 = dsl3;
                anonymousClass1.L$6 = dsl3;
                anonymousClass1.label = 3;
                idfi = deviceInfoRepository3.staticDeviceInfo(anonymousClass1);
                if (idfi == coroutine_suspended) {
                    return coroutine_suspended;
                }
                dsl7 = dsl3;
                dsl7.setTotalRamMemory(((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) idfi).getTotalRamMemory());
                dsl3.setCurrentUiTheme(androidGetInitializationRequestPayload2.deviceInfoRepository.getCurrentUiTheme());
                java.lang.String networkOperator = androidGetInitializationRequestPayload2.deviceInfoRepository.getDynamicDeviceInfo().getNetworkOperator();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(networkOperator, "deviceInfoRepository.dyn…eviceInfo.networkOperator");
                dsl3.setNetworkOperator(networkOperator);
                dsl3.setBatteryLevel(androidGetInitializationRequestPayload2.deviceInfoRepository.getDynamicDeviceInfo().getBatteryLevel());
                dsl3.setBatteryStatus(androidGetInitializationRequestPayload2.deviceInfoRepository.getDynamicDeviceInfo().getBatteryStatus());
                dsl3.setSystemBootTime(androidGetInitializationRequestPayload2.deviceInfoRepository.getSystemBootTime());
                java.lang.String language = androidGetInitializationRequestPayload2.deviceInfoRepository.getDynamicDeviceInfo().getLanguage();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(language, "deviceInfoRepository.dynamicDeviceInfo.language");
                dsl3.setLanguage(language);
                dsl3.setLocalList(kotlin.collections.CollectionsKt.joinToString$default(androidGetInitializationRequestPayload2.deviceInfoRepository.getLocaleList(), ",", null, null, 0, null, null, 62, null));
                dsl3.setConnectionType(androidGetInitializationRequestPayload2.deviceInfoRepository.getConnectionTypeStr());
                dsl.setDeviceInfo(dsl5._build());
                com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository4 = androidGetInitializationRequestPayload2.deviceInfoRepository;
                anonymousClass1.L$0 = androidGetInitializationRequestPayload2;
                anonymousClass1.L$1 = dsl4;
                anonymousClass1.L$2 = dsl6;
                anonymousClass1.L$3 = null;
                anonymousClass1.L$4 = null;
                anonymousClass1.L$5 = null;
                anonymousClass1.L$6 = null;
                anonymousClass1.label = 4;
                idfi = deviceInfoRepository4.getAuidByteString(anonymousClass1);
                if (idfi == coroutine_suspended) {
                    return coroutine_suspended;
                }
                dsl8 = dsl6;
                dsl9 = dsl4;
                androidGetInitializationRequestPayload3 = androidGetInitializationRequestPayload2;
                byteString = (com.google.protobuf.ByteString) idfi;
                if (byteString != null) {
                    dsl8.setAuid(byteString);
                }
                com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository5 = androidGetInitializationRequestPayload3.deviceInfoRepository;
                anonymousClass1.L$0 = androidGetInitializationRequestPayload3;
                anonymousClass1.L$1 = dsl9;
                anonymousClass1.L$2 = dsl8;
                anonymousClass1.label = 5;
                idfi = deviceInfoRepository5.getAuidString(anonymousClass1);
                if (idfi == coroutine_suspended) {
                    return coroutine_suspended;
                }
                str = (java.lang.String) idfi;
                str2 = str;
                if (!(str2 != null || str2.length() == 0)) {
                    dsl8.setAuidString(str);
                }
                com.unity3d.ads.core.data.repository.SessionRepository sessionRepository = androidGetInitializationRequestPayload3.sessionRepository;
                anonymousClass1.L$0 = androidGetInitializationRequestPayload3;
                anonymousClass1.L$1 = dsl9;
                anonymousClass1.L$2 = dsl8;
                anonymousClass1.label = 6;
                idfi = sessionRepository.getPrivacy(anonymousClass1);
                if (idfi == coroutine_suspended) {
                    return coroutine_suspended;
                }
                androidGetInitializationRequestPayload4 = androidGetInitializationRequestPayload3;
                byteString2 = (com.google.protobuf.ByteString) idfi;
                if (!byteString2.isEmpty()) {
                    dsl8.setPrivacy(byteString2);
                }
                com.unity3d.ads.core.data.repository.SessionRepository sessionRepository2 = androidGetInitializationRequestPayload4.sessionRepository;
                anonymousClass1.L$0 = androidGetInitializationRequestPayload4;
                anonymousClass1.L$1 = dsl9;
                anonymousClass1.L$2 = dsl8;
                anonymousClass1.label = 7;
                idfi = sessionRepository2.getGatewayCache(anonymousClass1);
                if (idfi == coroutine_suspended) {
                    return coroutine_suspended;
                }
                dsl10 = dsl8;
                dsl11 = dsl9;
                androidGetInitializationRequestPayload5 = androidGetInitializationRequestPayload4;
                byteString3 = (com.google.protobuf.ByteString) idfi;
                if (!byteString3.isEmpty()) {
                    dsl10.setCache(byteString3);
                }
                legacyFlowUserConsent = androidGetInitializationRequestPayload5.legacyUserConsentRepository.getLegacyFlowUserConsent();
                if (legacyFlowUserConsent != null) {
                    dsl10.setLegacyFlowUserConsent(legacyFlowUserConsent);
                }
                return dsl11._build();
            case 1:
                dsl_create = (gatewayprotocol.v1.InitializationRequestKt.Dsl) anonymousClass1.L$3;
                dsl = (gatewayprotocol.v1.InitializationRequestKt.Dsl) anonymousClass1.L$2;
                dsl2 = (gatewayprotocol.v1.InitializationRequestKt.Dsl) anonymousClass1.L$1;
                androidGetInitializationRequestPayload = (com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload) anonymousClass1.L$0;
                kotlin.ResultKt.throwOnFailure(idfi);
                dsl_create.setIdfi((java.lang.String) idfi);
                analyticsUserId = androidGetInitializationRequestPayload.deviceInfoRepository.getAnalyticsUserId();
                if (analyticsUserId != null) {
                    dsl.setAnalyticsUserId(analyticsUserId);
                }
                dsl.setSessionId(androidGetInitializationRequestPayload.sessionRepository.getSessionId());
                gatewayprotocol.v1.InitializationDeviceInfoKt.Dsl.Companion companion3 = gatewayprotocol.v1.InitializationDeviceInfoKt.Dsl.INSTANCE;
                gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo.Builder builderNewBuilder3 = gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo.newBuilder();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builderNewBuilder3, "newBuilder()");
                dsl_create2 = companion3._create(builderNewBuilder3);
                dsl_create2.setBundleId(androidGetInitializationRequestPayload.deviceInfoRepository.getAppName());
                dsl_create2.setDeviceModel(androidGetInitializationRequestPayload.deviceInfoRepository.getModel());
                dsl_create2.setDeviceMake(androidGetInitializationRequestPayload.deviceInfoRepository.getManufacturer());
                dsl_create2.setOsVersion(androidGetInitializationRequestPayload.deviceInfoRepository.getOsVersion());
                com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository6 = androidGetInitializationRequestPayload.deviceInfoRepository;
                anonymousClass1.L$0 = androidGetInitializationRequestPayload;
                anonymousClass1.L$1 = dsl2;
                anonymousClass1.L$2 = dsl;
                anonymousClass1.L$3 = dsl_create2;
                anonymousClass1.L$4 = dsl;
                anonymousClass1.L$5 = dsl_create2;
                anonymousClass1.L$6 = dsl_create2;
                anonymousClass1.label = 2;
                idfi = deviceInfoRepository6.staticDeviceInfo(anonymousClass1);
                if (idfi == coroutine_suspended) {
                    return coroutine_suspended;
                }
                dsl3 = dsl_create2;
                dsl4 = dsl2;
                androidGetInitializationRequestPayload2 = androidGetInitializationRequestPayload;
                dsl5 = dsl3;
                dsl6 = dsl;
                dsl_create2.setTotalDiskSpace(((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) idfi).getTotalDiskSpace());
                com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository7 = androidGetInitializationRequestPayload2.deviceInfoRepository;
                anonymousClass1.L$0 = androidGetInitializationRequestPayload2;
                anonymousClass1.L$1 = dsl4;
                anonymousClass1.L$2 = dsl6;
                anonymousClass1.L$3 = dsl5;
                anonymousClass1.L$4 = dsl;
                anonymousClass1.L$5 = dsl3;
                anonymousClass1.L$6 = dsl3;
                anonymousClass1.label = 3;
                idfi = deviceInfoRepository7.staticDeviceInfo(anonymousClass1);
                if (idfi == coroutine_suspended) {
                    return coroutine_suspended;
                }
                dsl7 = dsl3;
                dsl7.setTotalRamMemory(((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) idfi).getTotalRamMemory());
                dsl3.setCurrentUiTheme(androidGetInitializationRequestPayload2.deviceInfoRepository.getCurrentUiTheme());
                java.lang.String networkOperator2 = androidGetInitializationRequestPayload2.deviceInfoRepository.getDynamicDeviceInfo().getNetworkOperator();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(networkOperator2, "deviceInfoRepository.dyn…eviceInfo.networkOperator");
                dsl3.setNetworkOperator(networkOperator2);
                dsl3.setBatteryLevel(androidGetInitializationRequestPayload2.deviceInfoRepository.getDynamicDeviceInfo().getBatteryLevel());
                dsl3.setBatteryStatus(androidGetInitializationRequestPayload2.deviceInfoRepository.getDynamicDeviceInfo().getBatteryStatus());
                dsl3.setSystemBootTime(androidGetInitializationRequestPayload2.deviceInfoRepository.getSystemBootTime());
                java.lang.String language2 = androidGetInitializationRequestPayload2.deviceInfoRepository.getDynamicDeviceInfo().getLanguage();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(language2, "deviceInfoRepository.dynamicDeviceInfo.language");
                dsl3.setLanguage(language2);
                dsl3.setLocalList(kotlin.collections.CollectionsKt.joinToString$default(androidGetInitializationRequestPayload2.deviceInfoRepository.getLocaleList(), ",", null, null, 0, null, null, 62, null));
                dsl3.setConnectionType(androidGetInitializationRequestPayload2.deviceInfoRepository.getConnectionTypeStr());
                dsl.setDeviceInfo(dsl5._build());
                com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository8 = androidGetInitializationRequestPayload2.deviceInfoRepository;
                anonymousClass1.L$0 = androidGetInitializationRequestPayload2;
                anonymousClass1.L$1 = dsl4;
                anonymousClass1.L$2 = dsl6;
                anonymousClass1.L$3 = null;
                anonymousClass1.L$4 = null;
                anonymousClass1.L$5 = null;
                anonymousClass1.L$6 = null;
                anonymousClass1.label = 4;
                idfi = deviceInfoRepository8.getAuidByteString(anonymousClass1);
                if (idfi == coroutine_suspended) {
                    return coroutine_suspended;
                }
                dsl8 = dsl6;
                dsl9 = dsl4;
                androidGetInitializationRequestPayload3 = androidGetInitializationRequestPayload2;
                byteString = (com.google.protobuf.ByteString) idfi;
                if (byteString != null) {
                    dsl8.setAuid(byteString);
                }
                com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository9 = androidGetInitializationRequestPayload3.deviceInfoRepository;
                anonymousClass1.L$0 = androidGetInitializationRequestPayload3;
                anonymousClass1.L$1 = dsl9;
                anonymousClass1.L$2 = dsl8;
                anonymousClass1.label = 5;
                idfi = deviceInfoRepository9.getAuidString(anonymousClass1);
                if (idfi == coroutine_suspended) {
                    return coroutine_suspended;
                }
                str = (java.lang.String) idfi;
                str2 = str;
                if (!(str2 != null || str2.length() == 0)) {
                    dsl8.setAuidString(str);
                }
                com.unity3d.ads.core.data.repository.SessionRepository sessionRepository3 = androidGetInitializationRequestPayload3.sessionRepository;
                anonymousClass1.L$0 = androidGetInitializationRequestPayload3;
                anonymousClass1.L$1 = dsl9;
                anonymousClass1.L$2 = dsl8;
                anonymousClass1.label = 6;
                idfi = sessionRepository3.getPrivacy(anonymousClass1);
                if (idfi == coroutine_suspended) {
                    return coroutine_suspended;
                }
                androidGetInitializationRequestPayload4 = androidGetInitializationRequestPayload3;
                byteString2 = (com.google.protobuf.ByteString) idfi;
                if (!byteString2.isEmpty()) {
                    dsl8.setPrivacy(byteString2);
                }
                com.unity3d.ads.core.data.repository.SessionRepository sessionRepository4 = androidGetInitializationRequestPayload4.sessionRepository;
                anonymousClass1.L$0 = androidGetInitializationRequestPayload4;
                anonymousClass1.L$1 = dsl9;
                anonymousClass1.L$2 = dsl8;
                anonymousClass1.label = 7;
                idfi = sessionRepository4.getGatewayCache(anonymousClass1);
                if (idfi == coroutine_suspended) {
                    return coroutine_suspended;
                }
                dsl10 = dsl8;
                dsl11 = dsl9;
                androidGetInitializationRequestPayload5 = androidGetInitializationRequestPayload4;
                byteString3 = (com.google.protobuf.ByteString) idfi;
                if (!byteString3.isEmpty()) {
                    dsl10.setCache(byteString3);
                }
                legacyFlowUserConsent = androidGetInitializationRequestPayload5.legacyUserConsentRepository.getLegacyFlowUserConsent();
                if (legacyFlowUserConsent != null) {
                    dsl10.setLegacyFlowUserConsent(legacyFlowUserConsent);
                }
                return dsl11._build();
            case 2:
                dsl_create2 = (gatewayprotocol.v1.InitializationDeviceInfoKt.Dsl) anonymousClass1.L$6;
                dsl3 = (gatewayprotocol.v1.InitializationDeviceInfoKt.Dsl) anonymousClass1.L$5;
                dsl = (gatewayprotocol.v1.InitializationRequestKt.Dsl) anonymousClass1.L$4;
                dsl5 = (gatewayprotocol.v1.InitializationDeviceInfoKt.Dsl) anonymousClass1.L$3;
                dsl6 = (gatewayprotocol.v1.InitializationRequestKt.Dsl) anonymousClass1.L$2;
                dsl4 = (gatewayprotocol.v1.InitializationRequestKt.Dsl) anonymousClass1.L$1;
                androidGetInitializationRequestPayload2 = (com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload) anonymousClass1.L$0;
                kotlin.ResultKt.throwOnFailure(idfi);
                dsl_create2.setTotalDiskSpace(((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) idfi).getTotalDiskSpace());
                com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository10 = androidGetInitializationRequestPayload2.deviceInfoRepository;
                anonymousClass1.L$0 = androidGetInitializationRequestPayload2;
                anonymousClass1.L$1 = dsl4;
                anonymousClass1.L$2 = dsl6;
                anonymousClass1.L$3 = dsl5;
                anonymousClass1.L$4 = dsl;
                anonymousClass1.L$5 = dsl3;
                anonymousClass1.L$6 = dsl3;
                anonymousClass1.label = 3;
                idfi = deviceInfoRepository10.staticDeviceInfo(anonymousClass1);
                if (idfi == coroutine_suspended) {
                    return coroutine_suspended;
                }
                dsl7 = dsl3;
                dsl7.setTotalRamMemory(((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) idfi).getTotalRamMemory());
                dsl3.setCurrentUiTheme(androidGetInitializationRequestPayload2.deviceInfoRepository.getCurrentUiTheme());
                java.lang.String networkOperator3 = androidGetInitializationRequestPayload2.deviceInfoRepository.getDynamicDeviceInfo().getNetworkOperator();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(networkOperator3, "deviceInfoRepository.dyn…eviceInfo.networkOperator");
                dsl3.setNetworkOperator(networkOperator3);
                dsl3.setBatteryLevel(androidGetInitializationRequestPayload2.deviceInfoRepository.getDynamicDeviceInfo().getBatteryLevel());
                dsl3.setBatteryStatus(androidGetInitializationRequestPayload2.deviceInfoRepository.getDynamicDeviceInfo().getBatteryStatus());
                dsl3.setSystemBootTime(androidGetInitializationRequestPayload2.deviceInfoRepository.getSystemBootTime());
                java.lang.String language3 = androidGetInitializationRequestPayload2.deviceInfoRepository.getDynamicDeviceInfo().getLanguage();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(language3, "deviceInfoRepository.dynamicDeviceInfo.language");
                dsl3.setLanguage(language3);
                dsl3.setLocalList(kotlin.collections.CollectionsKt.joinToString$default(androidGetInitializationRequestPayload2.deviceInfoRepository.getLocaleList(), ",", null, null, 0, null, null, 62, null));
                dsl3.setConnectionType(androidGetInitializationRequestPayload2.deviceInfoRepository.getConnectionTypeStr());
                dsl.setDeviceInfo(dsl5._build());
                com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository11 = androidGetInitializationRequestPayload2.deviceInfoRepository;
                anonymousClass1.L$0 = androidGetInitializationRequestPayload2;
                anonymousClass1.L$1 = dsl4;
                anonymousClass1.L$2 = dsl6;
                anonymousClass1.L$3 = null;
                anonymousClass1.L$4 = null;
                anonymousClass1.L$5 = null;
                anonymousClass1.L$6 = null;
                anonymousClass1.label = 4;
                idfi = deviceInfoRepository11.getAuidByteString(anonymousClass1);
                if (idfi == coroutine_suspended) {
                    return coroutine_suspended;
                }
                dsl8 = dsl6;
                dsl9 = dsl4;
                androidGetInitializationRequestPayload3 = androidGetInitializationRequestPayload2;
                byteString = (com.google.protobuf.ByteString) idfi;
                if (byteString != null) {
                    dsl8.setAuid(byteString);
                }
                com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository12 = androidGetInitializationRequestPayload3.deviceInfoRepository;
                anonymousClass1.L$0 = androidGetInitializationRequestPayload3;
                anonymousClass1.L$1 = dsl9;
                anonymousClass1.L$2 = dsl8;
                anonymousClass1.label = 5;
                idfi = deviceInfoRepository12.getAuidString(anonymousClass1);
                if (idfi == coroutine_suspended) {
                    return coroutine_suspended;
                }
                str = (java.lang.String) idfi;
                str2 = str;
                if (!(str2 != null || str2.length() == 0)) {
                    dsl8.setAuidString(str);
                }
                com.unity3d.ads.core.data.repository.SessionRepository sessionRepository5 = androidGetInitializationRequestPayload3.sessionRepository;
                anonymousClass1.L$0 = androidGetInitializationRequestPayload3;
                anonymousClass1.L$1 = dsl9;
                anonymousClass1.L$2 = dsl8;
                anonymousClass1.label = 6;
                idfi = sessionRepository5.getPrivacy(anonymousClass1);
                if (idfi == coroutine_suspended) {
                    return coroutine_suspended;
                }
                androidGetInitializationRequestPayload4 = androidGetInitializationRequestPayload3;
                byteString2 = (com.google.protobuf.ByteString) idfi;
                if (!byteString2.isEmpty()) {
                    dsl8.setPrivacy(byteString2);
                }
                com.unity3d.ads.core.data.repository.SessionRepository sessionRepository6 = androidGetInitializationRequestPayload4.sessionRepository;
                anonymousClass1.L$0 = androidGetInitializationRequestPayload4;
                anonymousClass1.L$1 = dsl9;
                anonymousClass1.L$2 = dsl8;
                anonymousClass1.label = 7;
                idfi = sessionRepository6.getGatewayCache(anonymousClass1);
                if (idfi == coroutine_suspended) {
                    return coroutine_suspended;
                }
                dsl10 = dsl8;
                dsl11 = dsl9;
                androidGetInitializationRequestPayload5 = androidGetInitializationRequestPayload4;
                byteString3 = (com.google.protobuf.ByteString) idfi;
                if (!byteString3.isEmpty()) {
                    dsl10.setCache(byteString3);
                }
                legacyFlowUserConsent = androidGetInitializationRequestPayload5.legacyUserConsentRepository.getLegacyFlowUserConsent();
                if (legacyFlowUserConsent != null) {
                    dsl10.setLegacyFlowUserConsent(legacyFlowUserConsent);
                }
                return dsl11._build();
            case 3:
                dsl7 = (gatewayprotocol.v1.InitializationDeviceInfoKt.Dsl) anonymousClass1.L$6;
                dsl3 = (gatewayprotocol.v1.InitializationDeviceInfoKt.Dsl) anonymousClass1.L$5;
                dsl = (gatewayprotocol.v1.InitializationRequestKt.Dsl) anonymousClass1.L$4;
                dsl5 = (gatewayprotocol.v1.InitializationDeviceInfoKt.Dsl) anonymousClass1.L$3;
                dsl6 = (gatewayprotocol.v1.InitializationRequestKt.Dsl) anonymousClass1.L$2;
                dsl4 = (gatewayprotocol.v1.InitializationRequestKt.Dsl) anonymousClass1.L$1;
                androidGetInitializationRequestPayload2 = (com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload) anonymousClass1.L$0;
                kotlin.ResultKt.throwOnFailure(idfi);
                dsl7.setTotalRamMemory(((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) idfi).getTotalRamMemory());
                dsl3.setCurrentUiTheme(androidGetInitializationRequestPayload2.deviceInfoRepository.getCurrentUiTheme());
                java.lang.String networkOperator4 = androidGetInitializationRequestPayload2.deviceInfoRepository.getDynamicDeviceInfo().getNetworkOperator();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(networkOperator4, "deviceInfoRepository.dyn…eviceInfo.networkOperator");
                dsl3.setNetworkOperator(networkOperator4);
                dsl3.setBatteryLevel(androidGetInitializationRequestPayload2.deviceInfoRepository.getDynamicDeviceInfo().getBatteryLevel());
                dsl3.setBatteryStatus(androidGetInitializationRequestPayload2.deviceInfoRepository.getDynamicDeviceInfo().getBatteryStatus());
                dsl3.setSystemBootTime(androidGetInitializationRequestPayload2.deviceInfoRepository.getSystemBootTime());
                java.lang.String language4 = androidGetInitializationRequestPayload2.deviceInfoRepository.getDynamicDeviceInfo().getLanguage();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(language4, "deviceInfoRepository.dynamicDeviceInfo.language");
                dsl3.setLanguage(language4);
                dsl3.setLocalList(kotlin.collections.CollectionsKt.joinToString$default(androidGetInitializationRequestPayload2.deviceInfoRepository.getLocaleList(), ",", null, null, 0, null, null, 62, null));
                dsl3.setConnectionType(androidGetInitializationRequestPayload2.deviceInfoRepository.getConnectionTypeStr());
                dsl.setDeviceInfo(dsl5._build());
                com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository13 = androidGetInitializationRequestPayload2.deviceInfoRepository;
                anonymousClass1.L$0 = androidGetInitializationRequestPayload2;
                anonymousClass1.L$1 = dsl4;
                anonymousClass1.L$2 = dsl6;
                anonymousClass1.L$3 = null;
                anonymousClass1.L$4 = null;
                anonymousClass1.L$5 = null;
                anonymousClass1.L$6 = null;
                anonymousClass1.label = 4;
                idfi = deviceInfoRepository13.getAuidByteString(anonymousClass1);
                if (idfi == coroutine_suspended) {
                    return coroutine_suspended;
                }
                dsl8 = dsl6;
                dsl9 = dsl4;
                androidGetInitializationRequestPayload3 = androidGetInitializationRequestPayload2;
                byteString = (com.google.protobuf.ByteString) idfi;
                if (byteString != null) {
                    dsl8.setAuid(byteString);
                }
                com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository14 = androidGetInitializationRequestPayload3.deviceInfoRepository;
                anonymousClass1.L$0 = androidGetInitializationRequestPayload3;
                anonymousClass1.L$1 = dsl9;
                anonymousClass1.L$2 = dsl8;
                anonymousClass1.label = 5;
                idfi = deviceInfoRepository14.getAuidString(anonymousClass1);
                if (idfi == coroutine_suspended) {
                    return coroutine_suspended;
                }
                str = (java.lang.String) idfi;
                str2 = str;
                if (!(str2 != null || str2.length() == 0)) {
                    dsl8.setAuidString(str);
                }
                com.unity3d.ads.core.data.repository.SessionRepository sessionRepository7 = androidGetInitializationRequestPayload3.sessionRepository;
                anonymousClass1.L$0 = androidGetInitializationRequestPayload3;
                anonymousClass1.L$1 = dsl9;
                anonymousClass1.L$2 = dsl8;
                anonymousClass1.label = 6;
                idfi = sessionRepository7.getPrivacy(anonymousClass1);
                if (idfi == coroutine_suspended) {
                    return coroutine_suspended;
                }
                androidGetInitializationRequestPayload4 = androidGetInitializationRequestPayload3;
                byteString2 = (com.google.protobuf.ByteString) idfi;
                if (!byteString2.isEmpty()) {
                    dsl8.setPrivacy(byteString2);
                }
                com.unity3d.ads.core.data.repository.SessionRepository sessionRepository8 = androidGetInitializationRequestPayload4.sessionRepository;
                anonymousClass1.L$0 = androidGetInitializationRequestPayload4;
                anonymousClass1.L$1 = dsl9;
                anonymousClass1.L$2 = dsl8;
                anonymousClass1.label = 7;
                idfi = sessionRepository8.getGatewayCache(anonymousClass1);
                if (idfi == coroutine_suspended) {
                    return coroutine_suspended;
                }
                dsl10 = dsl8;
                dsl11 = dsl9;
                androidGetInitializationRequestPayload5 = androidGetInitializationRequestPayload4;
                byteString3 = (com.google.protobuf.ByteString) idfi;
                if (!byteString3.isEmpty()) {
                    dsl10.setCache(byteString3);
                }
                legacyFlowUserConsent = androidGetInitializationRequestPayload5.legacyUserConsentRepository.getLegacyFlowUserConsent();
                if (legacyFlowUserConsent != null) {
                    dsl10.setLegacyFlowUserConsent(legacyFlowUserConsent);
                }
                return dsl11._build();
            case 4:
                dsl8 = (gatewayprotocol.v1.InitializationRequestKt.Dsl) anonymousClass1.L$2;
                dsl9 = (gatewayprotocol.v1.InitializationRequestKt.Dsl) anonymousClass1.L$1;
                androidGetInitializationRequestPayload3 = (com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload) anonymousClass1.L$0;
                kotlin.ResultKt.throwOnFailure(idfi);
                byteString = (com.google.protobuf.ByteString) idfi;
                if (byteString != null) {
                    dsl8.setAuid(byteString);
                }
                com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository15 = androidGetInitializationRequestPayload3.deviceInfoRepository;
                anonymousClass1.L$0 = androidGetInitializationRequestPayload3;
                anonymousClass1.L$1 = dsl9;
                anonymousClass1.L$2 = dsl8;
                anonymousClass1.label = 5;
                idfi = deviceInfoRepository15.getAuidString(anonymousClass1);
                if (idfi == coroutine_suspended) {
                    return coroutine_suspended;
                }
                str = (java.lang.String) idfi;
                str2 = str;
                if (!(str2 != null || str2.length() == 0)) {
                    dsl8.setAuidString(str);
                }
                com.unity3d.ads.core.data.repository.SessionRepository sessionRepository9 = androidGetInitializationRequestPayload3.sessionRepository;
                anonymousClass1.L$0 = androidGetInitializationRequestPayload3;
                anonymousClass1.L$1 = dsl9;
                anonymousClass1.L$2 = dsl8;
                anonymousClass1.label = 6;
                idfi = sessionRepository9.getPrivacy(anonymousClass1);
                if (idfi == coroutine_suspended) {
                    return coroutine_suspended;
                }
                androidGetInitializationRequestPayload4 = androidGetInitializationRequestPayload3;
                byteString2 = (com.google.protobuf.ByteString) idfi;
                if (!byteString2.isEmpty()) {
                    dsl8.setPrivacy(byteString2);
                }
                com.unity3d.ads.core.data.repository.SessionRepository sessionRepository10 = androidGetInitializationRequestPayload4.sessionRepository;
                anonymousClass1.L$0 = androidGetInitializationRequestPayload4;
                anonymousClass1.L$1 = dsl9;
                anonymousClass1.L$2 = dsl8;
                anonymousClass1.label = 7;
                idfi = sessionRepository10.getGatewayCache(anonymousClass1);
                if (idfi == coroutine_suspended) {
                    return coroutine_suspended;
                }
                dsl10 = dsl8;
                dsl11 = dsl9;
                androidGetInitializationRequestPayload5 = androidGetInitializationRequestPayload4;
                byteString3 = (com.google.protobuf.ByteString) idfi;
                if (!byteString3.isEmpty()) {
                    dsl10.setCache(byteString3);
                }
                legacyFlowUserConsent = androidGetInitializationRequestPayload5.legacyUserConsentRepository.getLegacyFlowUserConsent();
                if (legacyFlowUserConsent != null) {
                    dsl10.setLegacyFlowUserConsent(legacyFlowUserConsent);
                }
                return dsl11._build();
            case 5:
                dsl8 = (gatewayprotocol.v1.InitializationRequestKt.Dsl) anonymousClass1.L$2;
                dsl9 = (gatewayprotocol.v1.InitializationRequestKt.Dsl) anonymousClass1.L$1;
                androidGetInitializationRequestPayload3 = (com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload) anonymousClass1.L$0;
                kotlin.ResultKt.throwOnFailure(idfi);
                str = (java.lang.String) idfi;
                str2 = str;
                if (!(str2 != null || str2.length() == 0)) {
                    dsl8.setAuidString(str);
                }
                com.unity3d.ads.core.data.repository.SessionRepository sessionRepository11 = androidGetInitializationRequestPayload3.sessionRepository;
                anonymousClass1.L$0 = androidGetInitializationRequestPayload3;
                anonymousClass1.L$1 = dsl9;
                anonymousClass1.L$2 = dsl8;
                anonymousClass1.label = 6;
                idfi = sessionRepository11.getPrivacy(anonymousClass1);
                if (idfi == coroutine_suspended) {
                    return coroutine_suspended;
                }
                androidGetInitializationRequestPayload4 = androidGetInitializationRequestPayload3;
                byteString2 = (com.google.protobuf.ByteString) idfi;
                if (!byteString2.isEmpty()) {
                    dsl8.setPrivacy(byteString2);
                }
                com.unity3d.ads.core.data.repository.SessionRepository sessionRepository12 = androidGetInitializationRequestPayload4.sessionRepository;
                anonymousClass1.L$0 = androidGetInitializationRequestPayload4;
                anonymousClass1.L$1 = dsl9;
                anonymousClass1.L$2 = dsl8;
                anonymousClass1.label = 7;
                idfi = sessionRepository12.getGatewayCache(anonymousClass1);
                if (idfi == coroutine_suspended) {
                    return coroutine_suspended;
                }
                dsl10 = dsl8;
                dsl11 = dsl9;
                androidGetInitializationRequestPayload5 = androidGetInitializationRequestPayload4;
                byteString3 = (com.google.protobuf.ByteString) idfi;
                if (!byteString3.isEmpty()) {
                    dsl10.setCache(byteString3);
                }
                legacyFlowUserConsent = androidGetInitializationRequestPayload5.legacyUserConsentRepository.getLegacyFlowUserConsent();
                if (legacyFlowUserConsent != null) {
                    dsl10.setLegacyFlowUserConsent(legacyFlowUserConsent);
                }
                return dsl11._build();
            case 6:
                dsl8 = (gatewayprotocol.v1.InitializationRequestKt.Dsl) anonymousClass1.L$2;
                dsl9 = (gatewayprotocol.v1.InitializationRequestKt.Dsl) anonymousClass1.L$1;
                androidGetInitializationRequestPayload4 = (com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload) anonymousClass1.L$0;
                kotlin.ResultKt.throwOnFailure(idfi);
                byteString2 = (com.google.protobuf.ByteString) idfi;
                if (!byteString2.isEmpty()) {
                    dsl8.setPrivacy(byteString2);
                }
                com.unity3d.ads.core.data.repository.SessionRepository sessionRepository13 = androidGetInitializationRequestPayload4.sessionRepository;
                anonymousClass1.L$0 = androidGetInitializationRequestPayload4;
                anonymousClass1.L$1 = dsl9;
                anonymousClass1.L$2 = dsl8;
                anonymousClass1.label = 7;
                idfi = sessionRepository13.getGatewayCache(anonymousClass1);
                if (idfi == coroutine_suspended) {
                    return coroutine_suspended;
                }
                dsl10 = dsl8;
                dsl11 = dsl9;
                androidGetInitializationRequestPayload5 = androidGetInitializationRequestPayload4;
                byteString3 = (com.google.protobuf.ByteString) idfi;
                if (!byteString3.isEmpty()) {
                    dsl10.setCache(byteString3);
                }
                legacyFlowUserConsent = androidGetInitializationRequestPayload5.legacyUserConsentRepository.getLegacyFlowUserConsent();
                if (legacyFlowUserConsent != null) {
                    dsl10.setLegacyFlowUserConsent(legacyFlowUserConsent);
                }
                return dsl11._build();
            case 7:
                dsl10 = (gatewayprotocol.v1.InitializationRequestKt.Dsl) anonymousClass1.L$2;
                dsl11 = (gatewayprotocol.v1.InitializationRequestKt.Dsl) anonymousClass1.L$1;
                androidGetInitializationRequestPayload5 = (com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload) anonymousClass1.L$0;
                kotlin.ResultKt.throwOnFailure(idfi);
                byteString3 = (com.google.protobuf.ByteString) idfi;
                if (!byteString3.isEmpty()) {
                    dsl10.setCache(byteString3);
                }
                legacyFlowUserConsent = androidGetInitializationRequestPayload5.legacyUserConsentRepository.getLegacyFlowUserConsent();
                if (legacyFlowUserConsent != null) {
                    dsl10.setLegacyFlowUserConsent(legacyFlowUserConsent);
                }
                return dsl11._build();
            default:
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
