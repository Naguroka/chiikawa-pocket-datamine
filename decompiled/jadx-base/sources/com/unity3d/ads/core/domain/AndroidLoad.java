package com.unity3d.ads.core.domain;

/* JADX INFO: compiled from: AndroidLoad.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002JC\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010$\u001a\u00020%H\u0096Bø\u0001\u0000¢\u0006\u0002\u0010&R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006'"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidLoad;", "Lcom/unity3d/ads/core/domain/Load;", "defaultDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "getAdRequest", "Lcom/unity3d/ads/core/domain/GetAdRequest;", "getAdPlayerConfigRequest", "Lcom/unity3d/ads/core/domain/GetAdPlayerConfigRequest;", "getRequestPolicy", "Lcom/unity3d/ads/core/domain/GetRequestPolicy;", "handleGatewayAdResponse", "Lcom/unity3d/ads/core/domain/HandleGatewayAdResponse;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "gatewayClient", "Lcom/unity3d/ads/gatewayclient/GatewayClient;", "adRepository", "Lcom/unity3d/ads/core/data/repository/AdRepository;", "(Lkotlinx/coroutines/CoroutineDispatcher;Lcom/unity3d/ads/core/domain/GetAdRequest;Lcom/unity3d/ads/core/domain/GetAdPlayerConfigRequest;Lcom/unity3d/ads/core/domain/GetRequestPolicy;Lcom/unity3d/ads/core/domain/HandleGatewayAdResponse;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/gatewayclient/GatewayClient;Lcom/unity3d/ads/core/data/repository/AdRepository;)V", "incrementLoadRequestAdmCount", "", com.json.y8.v, "", "incrementLoadRequestCount", "invoke", "Lcom/unity3d/ads/core/data/model/LoadResult;", "context", "Landroid/content/Context;", "placement", "", "opportunityId", "Lcom/google/protobuf/ByteString;", "headerBiddingAdMarkup", "Lgatewayprotocol/v1/HeaderBiddingAdMarkupOuterClass$HeaderBiddingAdMarkup;", com.json.h6.u, "Lgatewayprotocol/v1/AdRequestOuterClass$BannerSize;", com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS, "Lcom/unity3d/ads/UnityAdsLoadOptions;", "(Landroid/content/Context;Ljava/lang/String;Lcom/google/protobuf/ByteString;Lgatewayprotocol/v1/HeaderBiddingAdMarkupOuterClass$HeaderBiddingAdMarkup;Lgatewayprotocol/v1/AdRequestOuterClass$BannerSize;Lcom/unity3d/ads/UnityAdsLoadOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidLoad implements com.unity3d.ads.core.domain.Load {
    private final com.unity3d.ads.core.data.repository.AdRepository adRepository;
    private final kotlinx.coroutines.CoroutineDispatcher defaultDispatcher;
    private final com.unity3d.ads.gatewayclient.GatewayClient gatewayClient;
    private final com.unity3d.ads.core.domain.GetAdPlayerConfigRequest getAdPlayerConfigRequest;
    private final com.unity3d.ads.core.domain.GetAdRequest getAdRequest;
    private final com.unity3d.ads.core.domain.GetRequestPolicy getRequestPolicy;
    private final com.unity3d.ads.core.domain.HandleGatewayAdResponse handleGatewayAdResponse;
    private final com.unity3d.ads.core.data.repository.SessionRepository sessionRepository;

    public AndroidLoad(kotlinx.coroutines.CoroutineDispatcher defaultDispatcher, com.unity3d.ads.core.domain.GetAdRequest getAdRequest, com.unity3d.ads.core.domain.GetAdPlayerConfigRequest getAdPlayerConfigRequest, com.unity3d.ads.core.domain.GetRequestPolicy getRequestPolicy, com.unity3d.ads.core.domain.HandleGatewayAdResponse handleGatewayAdResponse, com.unity3d.ads.core.data.repository.SessionRepository sessionRepository, com.unity3d.ads.gatewayclient.GatewayClient gatewayClient, com.unity3d.ads.core.data.repository.AdRepository adRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultDispatcher, "defaultDispatcher");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getAdRequest, "getAdRequest");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getAdPlayerConfigRequest, "getAdPlayerConfigRequest");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getRequestPolicy, "getRequestPolicy");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handleGatewayAdResponse, "handleGatewayAdResponse");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gatewayClient, "gatewayClient");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adRepository, "adRepository");
        this.defaultDispatcher = defaultDispatcher;
        this.getAdRequest = getAdRequest;
        this.getAdPlayerConfigRequest = getAdPlayerConfigRequest;
        this.getRequestPolicy = getRequestPolicy;
        this.handleGatewayAdResponse = handleGatewayAdResponse;
        this.sessionRepository = sessionRepository;
        this.gatewayClient = gatewayClient;
        this.adRepository = adRepository;
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidLoad$invoke$2, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidLoad.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/model/LoadResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.AndroidLoad$invoke$2", f = "AndroidLoad.kt", i = {0, 0, 1, 1, 2, 2, 3, 3}, l = {53, 55, 60, 62, 85, 88}, m = "invokeSuspend", n = {"adType", com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_IS_HEADER_BIDDING, "adType", com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_IS_HEADER_BIDDING, "adType", com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_IS_HEADER_BIDDING, "adType", com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_IS_HEADER_BIDDING}, s = {"L$0", "I$0", "L$0", "I$0", "L$0", "I$0", "L$0", "I$0"})
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.data.model.LoadResult>, java.lang.Object> {
        final /* synthetic */ gatewayprotocol.v1.AdRequestOuterClass.BannerSize $bannerSize;
        final /* synthetic */ android.content.Context $context;
        final /* synthetic */ gatewayprotocol.v1.HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup $headerBiddingAdMarkup;
        final /* synthetic */ com.unity3d.ads.UnityAdsLoadOptions $loadOptions;
        final /* synthetic */ com.google.protobuf.ByteString $opportunityId;
        final /* synthetic */ java.lang.String $placement;
        int I$0;
        java.lang.Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(gatewayprotocol.v1.AdRequestOuterClass.BannerSize bannerSize, gatewayprotocol.v1.HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup headerBiddingAdMarkup, java.lang.String str, com.google.protobuf.ByteString byteString, com.unity3d.ads.UnityAdsLoadOptions unityAdsLoadOptions, android.content.Context context, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.AndroidLoad.AnonymousClass2> continuation) {
            super(2, continuation);
            this.$bannerSize = bannerSize;
            this.$headerBiddingAdMarkup = headerBiddingAdMarkup;
            this.$placement = str;
            this.$opportunityId = byteString;
            this.$loadOptions = unityAdsLoadOptions;
            this.$context = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.unity3d.ads.core.domain.AndroidLoad.this.new AnonymousClass2(this.$bannerSize, this.$headerBiddingAdMarkup, this.$placement, this.$opportunityId, this.$loadOptions, this.$context, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.data.model.LoadResult> continuation) {
            return ((com.unity3d.ads.core.domain.AndroidLoad.AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:30:0x00de A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:38:0x0140 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:41:0x0149  */
        /* JADX WARN: Code duplicated, block: B:43:0x0161  */
        /* JADX WARN: Code duplicated, block: B:45:0x01ca  */
        /* JADX WARN: Code duplicated, block: B:49:0x01f1  */
        /* JADX WARN: Code duplicated, block: B:50:0x01f3  */
        /* JADX WARN: Code duplicated, block: B:53:0x0203 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:56:0x020a  */
        /* JADX WARN: Code duplicated, block: B:58:0x021e A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:61:0x0223  */
        /* JADX WARN: Code duplicated, block: B:62:0x0238  */
        /* JADX WARN: Code duplicated, block: B:63:0x0241  */
        /* JADX WARN: Code duplicated, block: B:66:0x0246  */
        /* JADX WARN: Code duplicated, block: B:69:? A[RETURN, SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType;
            int i;
            java.lang.Object objInvoke;
            java.lang.Object objInvoke2;
            java.lang.Object objRequest$default;
            gatewayprotocol.v1.AdResponseOuterClass.AdResponse adResponse;
            java.lang.Object objRequest$default2;
            boolean z;
            java.lang.Object objInvoke3;
            gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse universalResponse;
            gatewayprotocol.v1.AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse adPlayerConfigResponse;
            gatewayprotocol.v1.AdResponseKt.Dsl dsl_create;
            com.unity3d.ads.core.data.model.LoadResult loadResult;
            java.lang.Object ad;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (!com.unity3d.ads.core.domain.AndroidLoad.this.sessionRepository.isSdkInitialized()) {
                        return new com.unity3d.ads.core.data.model.LoadResult.Failure(com.unity3d.ads.UnityAds.UnityAdsLoadError.INITIALIZE_FAILED, null, null, "not_initialized", null, 22, null);
                    }
                    boolean z2 = this.$bannerSize != null;
                    diagnosticAdType = z2 ? gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType.DIAGNOSTIC_AD_TYPE_BANNER : gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType.DIAGNOSTIC_AD_TYPE_FULLSCREEN;
                    i = !this.$headerBiddingAdMarkup.getAdData().isEmpty() ? 1 : 0;
                    if (i == 0) {
                        com.unity3d.ads.core.domain.AndroidLoad.this.incrementLoadRequestCount(z2);
                        this.L$0 = diagnosticAdType;
                        this.I$0 = i;
                        this.label = 1;
                        objInvoke2 = com.unity3d.ads.core.domain.AndroidLoad.this.getAdRequest.invoke(this.$placement, this.$opportunityId, this.$bannerSize, this);
                        if (objInvoke2 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        com.unity3d.ads.gatewayclient.RequestPolicy requestPolicyInvoke = com.unity3d.ads.core.domain.AndroidLoad.this.getRequestPolicy.invoke();
                        this.L$0 = diagnosticAdType;
                        this.I$0 = i;
                        this.label = 2;
                        objRequest$default = com.unity3d.ads.gatewayclient.GatewayClient.DefaultImpls.request$default(com.unity3d.ads.core.domain.AndroidLoad.this.gatewayClient, null, (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest) objInvoke2, requestPolicyInvoke, com.unity3d.ads.core.data.model.OperationType.LOAD, this, 1, null);
                        if (objRequest$default == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        adResponse = ((gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) objRequest$default).getPayload().getAdResponse();
                        gatewayprotocol.v1.AdResponseOuterClass.AdResponse response = adResponse;
                        gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType2 = diagnosticAdType;
                        com.unity3d.ads.core.domain.HandleGatewayAdResponse handleGatewayAdResponse = com.unity3d.ads.core.domain.AndroidLoad.this.handleGatewayAdResponse;
                        com.unity3d.ads.UnityAdsLoadOptions unityAdsLoadOptions = this.$loadOptions;
                        com.google.protobuf.ByteString byteString = this.$opportunityId;
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(response, "response");
                        android.content.Context context = this.$context;
                        java.lang.String str = this.$placement;
                        if (i != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        this.L$0 = null;
                        this.label = 5;
                        objInvoke3 = handleGatewayAdResponse.invoke(unityAdsLoadOptions, byteString, response, context, str, diagnosticAdType2, z, this);
                        if (objInvoke3 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        loadResult = (com.unity3d.ads.core.data.model.LoadResult) objInvoke3;
                        if (!(loadResult instanceof com.unity3d.ads.core.data.model.LoadResult.Success)) {
                            if (loadResult instanceof com.unity3d.ads.core.data.model.LoadResult.Failure) {
                                return loadResult;
                            }
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        this.label = 6;
                        ad = com.unity3d.ads.core.domain.AndroidLoad.this.adRepository.getAd(this.$opportunityId, this);
                        if (ad == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        com.unity3d.ads.core.data.model.AdObject adObject = (com.unity3d.ads.core.data.model.AdObject) ad;
                        return adObject == null ? new com.unity3d.ads.core.data.model.LoadResult.Failure(com.unity3d.ads.UnityAds.UnityAdsLoadError.INTERNAL_ERROR, com.unity3d.ads.core.data.model.LoadResult.MSG_AD_OBJECT, null, "ad_object_not_found", null, 20, null) : new com.unity3d.ads.core.data.model.LoadResult.Success(adObject);
                    }
                    com.unity3d.ads.core.domain.AndroidLoad.this.incrementLoadRequestAdmCount(z2);
                    com.unity3d.ads.core.domain.GetAdPlayerConfigRequest getAdPlayerConfigRequest = com.unity3d.ads.core.domain.AndroidLoad.this.getAdPlayerConfigRequest;
                    java.lang.String str2 = this.$placement;
                    com.google.protobuf.ByteString byteString2 = this.$opportunityId;
                    com.google.protobuf.ByteString configurationToken = this.$headerBiddingAdMarkup.getConfigurationToken();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(configurationToken, "headerBiddingAdMarkup.configurationToken");
                    this.L$0 = diagnosticAdType;
                    this.I$0 = i;
                    this.label = 3;
                    objInvoke = getAdPlayerConfigRequest.invoke(str2, byteString2, configurationToken, this);
                    if (objInvoke == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    com.unity3d.ads.gatewayclient.RequestPolicy requestPolicyInvoke2 = com.unity3d.ads.core.domain.AndroidLoad.this.getRequestPolicy.invoke();
                    this.L$0 = diagnosticAdType;
                    this.I$0 = i;
                    this.label = 4;
                    objRequest$default2 = com.unity3d.ads.gatewayclient.GatewayClient.DefaultImpls.request$default(com.unity3d.ads.core.domain.AndroidLoad.this.gatewayClient, null, (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest) objInvoke, requestPolicyInvoke2, com.unity3d.ads.core.data.model.OperationType.LOAD_HEADER_BIDDING, this, 1, null);
                    if (objRequest$default2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    universalResponse = (gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) objRequest$default2;
                    if (universalResponse.hasError()) {
                        return new com.unity3d.ads.core.data.model.LoadResult.Failure(com.unity3d.ads.UnityAds.UnityAdsLoadError.INTERNAL_ERROR, com.unity3d.services.UnityAdsConstants.Messages.MSG_INTERNAL_ERROR, null, "gateway", universalResponse.getError().getErrorText(), 4, null);
                    }
                    adPlayerConfigResponse = universalResponse.getPayload().getAdPlayerConfigResponse();
                    gatewayprotocol.v1.HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup headerBiddingAdMarkup = this.$headerBiddingAdMarkup;
                    gatewayprotocol.v1.AdResponseKt.Dsl.Companion companion = gatewayprotocol.v1.AdResponseKt.Dsl.INSTANCE;
                    gatewayprotocol.v1.AdResponseOuterClass.AdResponse.Builder builderNewBuilder = gatewayprotocol.v1.AdResponseOuterClass.AdResponse.newBuilder();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
                    dsl_create = companion._create(builderNewBuilder);
                    com.google.protobuf.ByteString adData = headerBiddingAdMarkup.getAdData();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adData, "headerBiddingAdMarkup.adData");
                    dsl_create.setAdData(adData);
                    dsl_create.setAdDataVersion(headerBiddingAdMarkup.getAdDataVersion());
                    com.google.protobuf.ByteString trackingToken = adPlayerConfigResponse.getTrackingToken();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(trackingToken, "response.trackingToken");
                    dsl_create.setTrackingToken(trackingToken);
                    com.google.protobuf.ByteString impressionConfiguration = adPlayerConfigResponse.getImpressionConfiguration();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(impressionConfiguration, "response.impressionConfiguration");
                    dsl_create.setImpressionConfiguration(impressionConfiguration);
                    dsl_create.setImpressionConfigurationVersion(adPlayerConfigResponse.getImpressionConfigurationVersion());
                    gatewayprotocol.v1.WebviewConfiguration.WebViewConfiguration webviewConfiguration = adPlayerConfigResponse.getWebviewConfiguration();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(webviewConfiguration, "response.webviewConfiguration");
                    dsl_create.setWebviewConfiguration(webviewConfiguration);
                    com.google.protobuf.ByteString adDataRefreshToken = adPlayerConfigResponse.getAdDataRefreshToken();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adDataRefreshToken, "response.adDataRefreshToken");
                    dsl_create.setAdDataRefreshToken(adDataRefreshToken);
                    if (adPlayerConfigResponse.hasError()) {
                        gatewayprotocol.v1.ErrorOuterClass.Error error = adPlayerConfigResponse.getError();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(error, "response.error");
                        dsl_create.setError(error);
                    }
                    adResponse = dsl_create._build();
                    gatewayprotocol.v1.AdResponseOuterClass.AdResponse response2 = adResponse;
                    gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType3 = diagnosticAdType;
                    com.unity3d.ads.core.domain.HandleGatewayAdResponse handleGatewayAdResponse2 = com.unity3d.ads.core.domain.AndroidLoad.this.handleGatewayAdResponse;
                    com.unity3d.ads.UnityAdsLoadOptions unityAdsLoadOptions2 = this.$loadOptions;
                    com.google.protobuf.ByteString byteString3 = this.$opportunityId;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(response2, "response");
                    android.content.Context context2 = this.$context;
                    java.lang.String str3 = this.$placement;
                    if (i != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.L$0 = null;
                    this.label = 5;
                    objInvoke3 = handleGatewayAdResponse2.invoke(unityAdsLoadOptions2, byteString3, response2, context2, str3, diagnosticAdType3, z, this);
                    if (objInvoke3 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    loadResult = (com.unity3d.ads.core.data.model.LoadResult) objInvoke3;
                    if (!(loadResult instanceof com.unity3d.ads.core.data.model.LoadResult.Success)) {
                        if (loadResult instanceof com.unity3d.ads.core.data.model.LoadResult.Failure) {
                            return loadResult;
                        }
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    this.label = 6;
                    ad = com.unity3d.ads.core.domain.AndroidLoad.this.adRepository.getAd(this.$opportunityId, this);
                    if (ad == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    com.unity3d.ads.core.data.model.AdObject adObject2 = (com.unity3d.ads.core.data.model.AdObject) ad;
                    if (adObject2 == null) {
                    }
                case 1:
                    int i2 = this.I$0;
                    diagnosticAdType = (gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType) this.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    i = i2;
                    objInvoke2 = obj;
                    com.unity3d.ads.gatewayclient.RequestPolicy requestPolicyInvoke3 = com.unity3d.ads.core.domain.AndroidLoad.this.getRequestPolicy.invoke();
                    this.L$0 = diagnosticAdType;
                    this.I$0 = i;
                    this.label = 2;
                    objRequest$default = com.unity3d.ads.gatewayclient.GatewayClient.DefaultImpls.request$default(com.unity3d.ads.core.domain.AndroidLoad.this.gatewayClient, null, (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest) objInvoke2, requestPolicyInvoke3, com.unity3d.ads.core.data.model.OperationType.LOAD, this, 1, null);
                    if (objRequest$default == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    adResponse = ((gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) objRequest$default).getPayload().getAdResponse();
                    gatewayprotocol.v1.AdResponseOuterClass.AdResponse response3 = adResponse;
                    gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType4 = diagnosticAdType;
                    com.unity3d.ads.core.domain.HandleGatewayAdResponse handleGatewayAdResponse3 = com.unity3d.ads.core.domain.AndroidLoad.this.handleGatewayAdResponse;
                    com.unity3d.ads.UnityAdsLoadOptions unityAdsLoadOptions3 = this.$loadOptions;
                    com.google.protobuf.ByteString byteString4 = this.$opportunityId;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(response3, "response");
                    android.content.Context context3 = this.$context;
                    java.lang.String str4 = this.$placement;
                    if (i != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.L$0 = null;
                    this.label = 5;
                    objInvoke3 = handleGatewayAdResponse3.invoke(unityAdsLoadOptions3, byteString4, response3, context3, str4, diagnosticAdType4, z, this);
                    if (objInvoke3 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    loadResult = (com.unity3d.ads.core.data.model.LoadResult) objInvoke3;
                    if (!(loadResult instanceof com.unity3d.ads.core.data.model.LoadResult.Success)) {
                        if (loadResult instanceof com.unity3d.ads.core.data.model.LoadResult.Failure) {
                            return loadResult;
                        }
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    this.label = 6;
                    ad = com.unity3d.ads.core.domain.AndroidLoad.this.adRepository.getAd(this.$opportunityId, this);
                    if (ad == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    com.unity3d.ads.core.data.model.AdObject adObject3 = (com.unity3d.ads.core.data.model.AdObject) ad;
                    if (adObject3 == null) {
                    }
                case 2:
                    int i3 = this.I$0;
                    diagnosticAdType = (gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType) this.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    i = i3;
                    objRequest$default = obj;
                    adResponse = ((gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) objRequest$default).getPayload().getAdResponse();
                    gatewayprotocol.v1.AdResponseOuterClass.AdResponse response4 = adResponse;
                    gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType5 = diagnosticAdType;
                    com.unity3d.ads.core.domain.HandleGatewayAdResponse handleGatewayAdResponse4 = com.unity3d.ads.core.domain.AndroidLoad.this.handleGatewayAdResponse;
                    com.unity3d.ads.UnityAdsLoadOptions unityAdsLoadOptions4 = this.$loadOptions;
                    com.google.protobuf.ByteString byteString5 = this.$opportunityId;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(response4, "response");
                    android.content.Context context4 = this.$context;
                    java.lang.String str5 = this.$placement;
                    if (i != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.L$0 = null;
                    this.label = 5;
                    objInvoke3 = handleGatewayAdResponse4.invoke(unityAdsLoadOptions4, byteString5, response4, context4, str5, diagnosticAdType5, z, this);
                    if (objInvoke3 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    loadResult = (com.unity3d.ads.core.data.model.LoadResult) objInvoke3;
                    if (!(loadResult instanceof com.unity3d.ads.core.data.model.LoadResult.Success)) {
                        if (loadResult instanceof com.unity3d.ads.core.data.model.LoadResult.Failure) {
                            return loadResult;
                        }
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    this.label = 6;
                    ad = com.unity3d.ads.core.domain.AndroidLoad.this.adRepository.getAd(this.$opportunityId, this);
                    if (ad == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    com.unity3d.ads.core.data.model.AdObject adObject4 = (com.unity3d.ads.core.data.model.AdObject) ad;
                    if (adObject4 == null) {
                    }
                case 3:
                    int i4 = this.I$0;
                    diagnosticAdType = (gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType) this.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    i = i4;
                    objInvoke = obj;
                    com.unity3d.ads.gatewayclient.RequestPolicy requestPolicyInvoke4 = com.unity3d.ads.core.domain.AndroidLoad.this.getRequestPolicy.invoke();
                    this.L$0 = diagnosticAdType;
                    this.I$0 = i;
                    this.label = 4;
                    objRequest$default2 = com.unity3d.ads.gatewayclient.GatewayClient.DefaultImpls.request$default(com.unity3d.ads.core.domain.AndroidLoad.this.gatewayClient, null, (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest) objInvoke, requestPolicyInvoke4, com.unity3d.ads.core.data.model.OperationType.LOAD_HEADER_BIDDING, this, 1, null);
                    if (objRequest$default2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    universalResponse = (gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) objRequest$default2;
                    if (universalResponse.hasError()) {
                        return new com.unity3d.ads.core.data.model.LoadResult.Failure(com.unity3d.ads.UnityAds.UnityAdsLoadError.INTERNAL_ERROR, com.unity3d.services.UnityAdsConstants.Messages.MSG_INTERNAL_ERROR, null, "gateway", universalResponse.getError().getErrorText(), 4, null);
                    }
                    adPlayerConfigResponse = universalResponse.getPayload().getAdPlayerConfigResponse();
                    gatewayprotocol.v1.HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup headerBiddingAdMarkup2 = this.$headerBiddingAdMarkup;
                    gatewayprotocol.v1.AdResponseKt.Dsl.Companion companion2 = gatewayprotocol.v1.AdResponseKt.Dsl.INSTANCE;
                    gatewayprotocol.v1.AdResponseOuterClass.AdResponse.Builder builderNewBuilder2 = gatewayprotocol.v1.AdResponseOuterClass.AdResponse.newBuilder();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builderNewBuilder2, "newBuilder()");
                    dsl_create = companion2._create(builderNewBuilder2);
                    com.google.protobuf.ByteString adData2 = headerBiddingAdMarkup2.getAdData();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adData2, "headerBiddingAdMarkup.adData");
                    dsl_create.setAdData(adData2);
                    dsl_create.setAdDataVersion(headerBiddingAdMarkup2.getAdDataVersion());
                    com.google.protobuf.ByteString trackingToken2 = adPlayerConfigResponse.getTrackingToken();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(trackingToken2, "response.trackingToken");
                    dsl_create.setTrackingToken(trackingToken2);
                    com.google.protobuf.ByteString impressionConfiguration2 = adPlayerConfigResponse.getImpressionConfiguration();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(impressionConfiguration2, "response.impressionConfiguration");
                    dsl_create.setImpressionConfiguration(impressionConfiguration2);
                    dsl_create.setImpressionConfigurationVersion(adPlayerConfigResponse.getImpressionConfigurationVersion());
                    gatewayprotocol.v1.WebviewConfiguration.WebViewConfiguration webviewConfiguration2 = adPlayerConfigResponse.getWebviewConfiguration();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(webviewConfiguration2, "response.webviewConfiguration");
                    dsl_create.setWebviewConfiguration(webviewConfiguration2);
                    com.google.protobuf.ByteString adDataRefreshToken2 = adPlayerConfigResponse.getAdDataRefreshToken();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adDataRefreshToken2, "response.adDataRefreshToken");
                    dsl_create.setAdDataRefreshToken(adDataRefreshToken2);
                    if (adPlayerConfigResponse.hasError()) {
                        gatewayprotocol.v1.ErrorOuterClass.Error error2 = adPlayerConfigResponse.getError();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(error2, "response.error");
                        dsl_create.setError(error2);
                    }
                    adResponse = dsl_create._build();
                    gatewayprotocol.v1.AdResponseOuterClass.AdResponse response5 = adResponse;
                    gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType6 = diagnosticAdType;
                    com.unity3d.ads.core.domain.HandleGatewayAdResponse handleGatewayAdResponse5 = com.unity3d.ads.core.domain.AndroidLoad.this.handleGatewayAdResponse;
                    com.unity3d.ads.UnityAdsLoadOptions unityAdsLoadOptions5 = this.$loadOptions;
                    com.google.protobuf.ByteString byteString6 = this.$opportunityId;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(response5, "response");
                    android.content.Context context5 = this.$context;
                    java.lang.String str6 = this.$placement;
                    if (i != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.L$0 = null;
                    this.label = 5;
                    objInvoke3 = handleGatewayAdResponse5.invoke(unityAdsLoadOptions5, byteString6, response5, context5, str6, diagnosticAdType6, z, this);
                    if (objInvoke3 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    loadResult = (com.unity3d.ads.core.data.model.LoadResult) objInvoke3;
                    if (!(loadResult instanceof com.unity3d.ads.core.data.model.LoadResult.Success)) {
                        if (loadResult instanceof com.unity3d.ads.core.data.model.LoadResult.Failure) {
                            return loadResult;
                        }
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    this.label = 6;
                    ad = com.unity3d.ads.core.domain.AndroidLoad.this.adRepository.getAd(this.$opportunityId, this);
                    if (ad == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    com.unity3d.ads.core.data.model.AdObject adObject5 = (com.unity3d.ads.core.data.model.AdObject) ad;
                    if (adObject5 == null) {
                    }
                case 4:
                    int i5 = this.I$0;
                    diagnosticAdType = (gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType) this.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    i = i5;
                    objRequest$default2 = obj;
                    universalResponse = (gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) objRequest$default2;
                    if (universalResponse.hasError()) {
                        return new com.unity3d.ads.core.data.model.LoadResult.Failure(com.unity3d.ads.UnityAds.UnityAdsLoadError.INTERNAL_ERROR, com.unity3d.services.UnityAdsConstants.Messages.MSG_INTERNAL_ERROR, null, "gateway", universalResponse.getError().getErrorText(), 4, null);
                    }
                    adPlayerConfigResponse = universalResponse.getPayload().getAdPlayerConfigResponse();
                    gatewayprotocol.v1.HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup headerBiddingAdMarkup3 = this.$headerBiddingAdMarkup;
                    gatewayprotocol.v1.AdResponseKt.Dsl.Companion companion3 = gatewayprotocol.v1.AdResponseKt.Dsl.INSTANCE;
                    gatewayprotocol.v1.AdResponseOuterClass.AdResponse.Builder builderNewBuilder3 = gatewayprotocol.v1.AdResponseOuterClass.AdResponse.newBuilder();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builderNewBuilder3, "newBuilder()");
                    dsl_create = companion3._create(builderNewBuilder3);
                    com.google.protobuf.ByteString adData3 = headerBiddingAdMarkup3.getAdData();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adData3, "headerBiddingAdMarkup.adData");
                    dsl_create.setAdData(adData3);
                    dsl_create.setAdDataVersion(headerBiddingAdMarkup3.getAdDataVersion());
                    com.google.protobuf.ByteString trackingToken3 = adPlayerConfigResponse.getTrackingToken();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(trackingToken3, "response.trackingToken");
                    dsl_create.setTrackingToken(trackingToken3);
                    com.google.protobuf.ByteString impressionConfiguration3 = adPlayerConfigResponse.getImpressionConfiguration();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(impressionConfiguration3, "response.impressionConfiguration");
                    dsl_create.setImpressionConfiguration(impressionConfiguration3);
                    dsl_create.setImpressionConfigurationVersion(adPlayerConfigResponse.getImpressionConfigurationVersion());
                    gatewayprotocol.v1.WebviewConfiguration.WebViewConfiguration webviewConfiguration3 = adPlayerConfigResponse.getWebviewConfiguration();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(webviewConfiguration3, "response.webviewConfiguration");
                    dsl_create.setWebviewConfiguration(webviewConfiguration3);
                    com.google.protobuf.ByteString adDataRefreshToken3 = adPlayerConfigResponse.getAdDataRefreshToken();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adDataRefreshToken3, "response.adDataRefreshToken");
                    dsl_create.setAdDataRefreshToken(adDataRefreshToken3);
                    if (adPlayerConfigResponse.hasError()) {
                        gatewayprotocol.v1.ErrorOuterClass.Error error3 = adPlayerConfigResponse.getError();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(error3, "response.error");
                        dsl_create.setError(error3);
                    }
                    adResponse = dsl_create._build();
                    gatewayprotocol.v1.AdResponseOuterClass.AdResponse response6 = adResponse;
                    gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType7 = diagnosticAdType;
                    com.unity3d.ads.core.domain.HandleGatewayAdResponse handleGatewayAdResponse6 = com.unity3d.ads.core.domain.AndroidLoad.this.handleGatewayAdResponse;
                    com.unity3d.ads.UnityAdsLoadOptions unityAdsLoadOptions6 = this.$loadOptions;
                    com.google.protobuf.ByteString byteString7 = this.$opportunityId;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(response6, "response");
                    android.content.Context context6 = this.$context;
                    java.lang.String str7 = this.$placement;
                    if (i != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.L$0 = null;
                    this.label = 5;
                    objInvoke3 = handleGatewayAdResponse6.invoke(unityAdsLoadOptions6, byteString7, response6, context6, str7, diagnosticAdType7, z, this);
                    if (objInvoke3 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    loadResult = (com.unity3d.ads.core.data.model.LoadResult) objInvoke3;
                    if (!(loadResult instanceof com.unity3d.ads.core.data.model.LoadResult.Success)) {
                        if (loadResult instanceof com.unity3d.ads.core.data.model.LoadResult.Failure) {
                            return loadResult;
                        }
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    this.label = 6;
                    ad = com.unity3d.ads.core.domain.AndroidLoad.this.adRepository.getAd(this.$opportunityId, this);
                    if (ad == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    com.unity3d.ads.core.data.model.AdObject adObject6 = (com.unity3d.ads.core.data.model.AdObject) ad;
                    if (adObject6 == null) {
                    }
                case 5:
                    kotlin.ResultKt.throwOnFailure(obj);
                    objInvoke3 = obj;
                    loadResult = (com.unity3d.ads.core.data.model.LoadResult) objInvoke3;
                    if (!(loadResult instanceof com.unity3d.ads.core.data.model.LoadResult.Success)) {
                        if (loadResult instanceof com.unity3d.ads.core.data.model.LoadResult.Failure) {
                            return loadResult;
                        }
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    this.label = 6;
                    ad = com.unity3d.ads.core.domain.AndroidLoad.this.adRepository.getAd(this.$opportunityId, this);
                    if (ad == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    com.unity3d.ads.core.data.model.AdObject adObject7 = (com.unity3d.ads.core.data.model.AdObject) ad;
                    if (adObject7 == null) {
                    }
                case 6:
                    kotlin.ResultKt.throwOnFailure(obj);
                    ad = obj;
                    com.unity3d.ads.core.data.model.AdObject adObject8 = (com.unity3d.ads.core.data.model.AdObject) ad;
                    if (adObject8 == null) {
                    }
                default:
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Override // com.unity3d.ads.core.domain.Load
    public java.lang.Object invoke(android.content.Context context, java.lang.String str, com.google.protobuf.ByteString byteString, gatewayprotocol.v1.HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup headerBiddingAdMarkup, gatewayprotocol.v1.AdRequestOuterClass.BannerSize bannerSize, com.unity3d.ads.UnityAdsLoadOptions unityAdsLoadOptions, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.data.model.LoadResult> continuation) {
        return kotlinx.coroutines.BuildersKt.withContext(this.defaultDispatcher, new com.unity3d.ads.core.domain.AndroidLoad.AnonymousClass2(bannerSize, headerBiddingAdMarkup, str, byteString, unityAdsLoadOptions, context, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void incrementLoadRequestCount(boolean isBanner) {
        if (isBanner) {
            this.sessionRepository.incrementBannerLoadRequestCount();
        } else {
            this.sessionRepository.incrementLoadRequestCount();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void incrementLoadRequestAdmCount(boolean isBanner) {
        if (isBanner) {
            this.sessionRepository.incrementBannerLoadRequestAdmCount();
        } else {
            this.sessionRepository.incrementLoadRequestAdmCount();
        }
    }
}
