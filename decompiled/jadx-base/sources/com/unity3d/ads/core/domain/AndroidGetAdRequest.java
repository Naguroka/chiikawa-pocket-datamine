package com.unity3d.ads.core.domain;

/* JADX INFO: compiled from: AndroidGetAdRequest.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ+\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096Bø\u0001\u0000¢\u0006\u0002\u0010\u0017R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidGetAdRequest;", "Lcom/unity3d/ads/core/domain/GetAdRequest;", "getUniversalRequestForPayLoad", "Lcom/unity3d/ads/core/domain/GetUniversalRequestForPayLoad;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "deviceInfoRepository", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "campaignRepository", "Lcom/unity3d/ads/core/data/repository/CampaignRepository;", "webViewConfigurationDataSource", "Lcom/unity3d/ads/core/data/datasource/WebviewConfigurationDataSource;", "tcfRepository", "Lcom/unity3d/ads/core/data/repository/TcfRepository;", "(Lcom/unity3d/ads/core/domain/GetUniversalRequestForPayLoad;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;Lcom/unity3d/ads/core/data/repository/CampaignRepository;Lcom/unity3d/ads/core/data/datasource/WebviewConfigurationDataSource;Lcom/unity3d/ads/core/data/repository/TcfRepository;)V", "invoke", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest;", "placement", "", "impressionOpportunity", "Lcom/google/protobuf/ByteString;", "size", "Lgatewayprotocol/v1/AdRequestOuterClass$BannerSize;", "(Ljava/lang/String;Lcom/google/protobuf/ByteString;Lgatewayprotocol/v1/AdRequestOuterClass$BannerSize;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidGetAdRequest implements com.unity3d.ads.core.domain.GetAdRequest {
    private final com.unity3d.ads.core.data.repository.CampaignRepository campaignRepository;
    private final com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository;
    private final com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;
    private final com.unity3d.ads.core.data.repository.SessionRepository sessionRepository;
    private final com.unity3d.ads.core.data.repository.TcfRepository tcfRepository;
    private final com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource webViewConfigurationDataSource;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidGetAdRequest$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidGetAdRequest.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.AndroidGetAdRequest", f = "AndroidGetAdRequest.kt", i = {0, 0, 0, 0, 0, 1, 1, 1}, l = {33, 40, 55}, m = "invoke", n = {"this", "placement", "impressionOpportunity", "size", "$this$invoke_u24lambda_u241", "this", "size", "$this$invoke_u24lambda_u241"}, s = {"L$0", "L$1", "L$2", "L$3", "L$5", "L$0", "L$1", "L$3"})
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

        AnonymousClass1(kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.AndroidGetAdRequest.AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return com.unity3d.ads.core.domain.AndroidGetAdRequest.this.invoke(null, null, null, this);
        }
    }

    public AndroidGetAdRequest(com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad getUniversalRequestForPayLoad, com.unity3d.ads.core.data.repository.SessionRepository sessionRepository, com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository, com.unity3d.ads.core.data.repository.CampaignRepository campaignRepository, com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource webViewConfigurationDataSource, com.unity3d.ads.core.data.repository.TcfRepository tcfRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getUniversalRequestForPayLoad, "getUniversalRequestForPayLoad");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceInfoRepository, "deviceInfoRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(campaignRepository, "campaignRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webViewConfigurationDataSource, "webViewConfigurationDataSource");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tcfRepository, "tcfRepository");
        this.getUniversalRequestForPayLoad = getUniversalRequestForPayLoad;
        this.sessionRepository = sessionRepository;
        this.deviceInfoRepository = deviceInfoRepository;
        this.campaignRepository = campaignRepository;
        this.webViewConfigurationDataSource = webViewConfigurationDataSource;
        this.tcfRepository = tcfRepository;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0103  */
    /* JADX WARN: Code duplicated, block: B:29:0x0109  */
    /* JADX WARN: Code duplicated, block: B:32:0x0119  */
    /* JADX WARN: Code duplicated, block: B:35:0x014e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    @Override // com.unity3d.ads.core.domain.GetAdRequest
    public java.lang.Object invoke(java.lang.String str, com.google.protobuf.ByteString byteString, gatewayprotocol.v1.AdRequestOuterClass.BannerSize bannerSize, kotlin.coroutines.Continuation<? super gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest> continuation) {
        com.unity3d.ads.core.domain.AndroidGetAdRequest.AnonymousClass1 anonymousClass1;
        gatewayprotocol.v1.AdRequestKt.Dsl dsl_create;
        com.google.protobuf.ByteString byteString2;
        gatewayprotocol.v1.AdRequestOuterClass.BannerSize bannerSize2;
        com.unity3d.ads.core.domain.AndroidGetAdRequest androidGetAdRequest;
        gatewayprotocol.v1.AdRequestKt.Dsl dsl;
        java.lang.String str2;
        gatewayprotocol.v1.AdRequestKt.Dsl dsl2;
        gatewayprotocol.v1.AdRequestKt.Dsl dsl3;
        gatewayprotocol.v1.AdRequestKt.Dsl dsl4;
        gatewayprotocol.v1.AdRequestOuterClass.BannerSize bannerSize3;
        gatewayprotocol.v1.AdRequestKt.Dsl dsl5;
        com.unity3d.ads.core.domain.AndroidGetAdRequest androidGetAdRequest2;
        java.lang.String tcfString;
        if (continuation instanceof com.unity3d.ads.core.domain.AndroidGetAdRequest.AnonymousClass1) {
            anonymousClass1 = (com.unity3d.ads.core.domain.AndroidGetAdRequest.AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new com.unity3d.ads.core.domain.AndroidGetAdRequest.AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new com.unity3d.ads.core.domain.AndroidGetAdRequest.AnonymousClass1(continuation);
        }
        java.lang.Object objStaticDeviceInfo = anonymousClass1.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i != 0) {
            if (i == 1) {
                dsl_create = (gatewayprotocol.v1.AdRequestKt.Dsl) anonymousClass1.L$6;
                dsl2 = (gatewayprotocol.v1.AdRequestKt.Dsl) anonymousClass1.L$5;
                gatewayprotocol.v1.AdRequestKt.Dsl dsl6 = (gatewayprotocol.v1.AdRequestKt.Dsl) anonymousClass1.L$4;
                bannerSize2 = (gatewayprotocol.v1.AdRequestOuterClass.BannerSize) anonymousClass1.L$3;
                com.google.protobuf.ByteString byteString3 = (com.google.protobuf.ByteString) anonymousClass1.L$2;
                str2 = (java.lang.String) anonymousClass1.L$1;
                androidGetAdRequest = (com.unity3d.ads.core.domain.AndroidGetAdRequest) anonymousClass1.L$0;
                kotlin.ResultKt.throwOnFailure(objStaticDeviceInfo);
                dsl = dsl6;
                byteString2 = byteString3;
            } else if (i == 2) {
                dsl3 = (gatewayprotocol.v1.AdRequestKt.Dsl) anonymousClass1.L$4;
                dsl4 = (gatewayprotocol.v1.AdRequestKt.Dsl) anonymousClass1.L$3;
                dsl5 = (gatewayprotocol.v1.AdRequestKt.Dsl) anonymousClass1.L$2;
                bannerSize3 = (gatewayprotocol.v1.AdRequestOuterClass.BannerSize) anonymousClass1.L$1;
                androidGetAdRequest2 = (com.unity3d.ads.core.domain.AndroidGetAdRequest) anonymousClass1.L$0;
                kotlin.ResultKt.throwOnFailure(objStaticDeviceInfo);
                dsl3.setWebviewVersion(((com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore) objStaticDeviceInfo).getVersion());
                dsl4.setCampaignState(androidGetAdRequest2.campaignRepository.getCampaignState());
                if (bannerSize3 == null) {
                    dsl4.setAdRequestType(gatewayprotocol.v1.AdRequestOuterClass.AdRequestType.AD_REQUEST_TYPE_FULLSCREEN);
                } else {
                    dsl4.setAdRequestType(gatewayprotocol.v1.AdRequestOuterClass.AdRequestType.AD_REQUEST_TYPE_BANNER);
                    dsl4.setBannerSize(bannerSize3);
                }
                tcfString = androidGetAdRequest2.tcfRepository.getTcfString();
                if (tcfString != null) {
                    dsl4.setTcf(com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toISO8859ByteString(tcfString));
                }
                gatewayprotocol.v1.AdRequestOuterClass.AdRequest adRequest_build = dsl5._build();
                gatewayprotocol.v1.UniversalRequestKt universalRequestKt = gatewayprotocol.v1.UniversalRequestKt.INSTANCE;
                gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl.Companion companion = gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl.INSTANCE;
                gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder builderNewBuilder = gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
                gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl dsl_create2 = companion._create(builderNewBuilder);
                dsl_create2.setAdRequest(adRequest_build);
                gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload payload_build = dsl_create2._build();
                com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad getUniversalRequestForPayLoad = androidGetAdRequest2.getUniversalRequestForPayLoad;
                anonymousClass1.L$0 = null;
                anonymousClass1.L$1 = null;
                anonymousClass1.L$2 = null;
                anonymousClass1.L$3 = null;
                anonymousClass1.L$4 = null;
                anonymousClass1.label = 3;
                objStaticDeviceInfo = getUniversalRequestForPayLoad.invoke(payload_build, anonymousClass1);
                if (objStaticDeviceInfo == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(objStaticDeviceInfo);
            }
            return objStaticDeviceInfo;
        }
        kotlin.ResultKt.throwOnFailure(objStaticDeviceInfo);
        gatewayprotocol.v1.AdRequestKt.Dsl.Companion companion2 = gatewayprotocol.v1.AdRequestKt.Dsl.INSTANCE;
        gatewayprotocol.v1.AdRequestOuterClass.AdRequest.Builder builderNewBuilder2 = gatewayprotocol.v1.AdRequestOuterClass.AdRequest.newBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builderNewBuilder2, "newBuilder()");
        dsl_create = companion2._create(builderNewBuilder2);
        dsl_create.setSessionCounters(this.sessionRepository.getSessionCounters());
        com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository = this.deviceInfoRepository;
        anonymousClass1.L$0 = this;
        anonymousClass1.L$1 = str;
        byteString2 = byteString;
        anonymousClass1.L$2 = byteString2;
        bannerSize2 = bannerSize;
        anonymousClass1.L$3 = bannerSize2;
        anonymousClass1.L$4 = dsl_create;
        anonymousClass1.L$5 = dsl_create;
        anonymousClass1.L$6 = dsl_create;
        anonymousClass1.label = 1;
        objStaticDeviceInfo = deviceInfoRepository.staticDeviceInfo(anonymousClass1);
        if (objStaticDeviceInfo == coroutine_suspended) {
            return coroutine_suspended;
        }
        androidGetAdRequest = this;
        dsl = dsl_create;
        str2 = str;
        dsl2 = dsl;
        dsl_create.setStaticDeviceInfo((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) objStaticDeviceInfo);
        dsl2.setDynamicDeviceInfo(androidGetAdRequest.deviceInfoRepository.getDynamicDeviceInfo());
        dsl2.setImpressionOpportunityId(byteString2);
        dsl2.setPlacementId(str2);
        dsl2.setRequestImpressionConfiguration(true);
        com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource webviewConfigurationDataSource = androidGetAdRequest.webViewConfigurationDataSource;
        anonymousClass1.L$0 = androidGetAdRequest;
        anonymousClass1.L$1 = bannerSize2;
        anonymousClass1.L$2 = dsl;
        anonymousClass1.L$3 = dsl2;
        anonymousClass1.L$4 = dsl2;
        anonymousClass1.L$5 = null;
        anonymousClass1.L$6 = null;
        anonymousClass1.label = 2;
        objStaticDeviceInfo = webviewConfigurationDataSource.get(anonymousClass1);
        if (objStaticDeviceInfo == coroutine_suspended) {
            return coroutine_suspended;
        }
        dsl3 = dsl2;
        dsl4 = dsl3;
        bannerSize3 = bannerSize2;
        dsl5 = dsl;
        androidGetAdRequest2 = androidGetAdRequest;
        dsl3.setWebviewVersion(((com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore) objStaticDeviceInfo).getVersion());
        dsl4.setCampaignState(androidGetAdRequest2.campaignRepository.getCampaignState());
        if (bannerSize3 == null) {
            dsl4.setAdRequestType(gatewayprotocol.v1.AdRequestOuterClass.AdRequestType.AD_REQUEST_TYPE_FULLSCREEN);
        } else {
            dsl4.setAdRequestType(gatewayprotocol.v1.AdRequestOuterClass.AdRequestType.AD_REQUEST_TYPE_BANNER);
            dsl4.setBannerSize(bannerSize3);
        }
        tcfString = androidGetAdRequest2.tcfRepository.getTcfString();
        if (tcfString != null) {
            dsl4.setTcf(com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toISO8859ByteString(tcfString));
        }
        gatewayprotocol.v1.AdRequestOuterClass.AdRequest adRequest_build2 = dsl5._build();
        gatewayprotocol.v1.UniversalRequestKt universalRequestKt2 = gatewayprotocol.v1.UniversalRequestKt.INSTANCE;
        gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl.Companion companion3 = gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl.INSTANCE;
        gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder builderNewBuilder3 = gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builderNewBuilder3, "newBuilder()");
        gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl dsl_create3 = companion3._create(builderNewBuilder3);
        dsl_create3.setAdRequest(adRequest_build2);
        gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload payload_build2 = dsl_create3._build();
        com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad getUniversalRequestForPayLoad2 = androidGetAdRequest2.getUniversalRequestForPayLoad;
        anonymousClass1.L$0 = null;
        anonymousClass1.L$1 = null;
        anonymousClass1.L$2 = null;
        anonymousClass1.L$3 = null;
        anonymousClass1.L$4 = null;
        anonymousClass1.label = 3;
        objStaticDeviceInfo = getUniversalRequestForPayLoad2.invoke(payload_build2, anonymousClass1);
        if (objStaticDeviceInfo == coroutine_suspended) {
            return coroutine_suspended;
        }
        return objStaticDeviceInfo;
    }
}
