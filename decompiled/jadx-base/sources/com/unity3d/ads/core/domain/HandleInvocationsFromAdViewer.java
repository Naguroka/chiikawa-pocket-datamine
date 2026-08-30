package com.unity3d.ads.core.domain;

/* JADX INFO: compiled from: HandleInvocationsFromAdViewer.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0005¢\u0006\u0002\u0010\u0002Jc\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\r2\u001c\u0010\u000e\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u000fH\u0086Bø\u0001\u0000¢\u0006\u0002\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer;", "Lcom/unity3d/services/core/di/IServiceComponent;", "()V", "invoke", "Lkotlinx/coroutines/flow/Flow;", "Lcom/unity3d/ads/adplayer/Invocation;", "onInvocations", "Lkotlinx/coroutines/flow/SharedFlow;", "adData", "", com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_AD_DATA_REFRESH_TOKEN, com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_IMPRESSION_CONFIG, "adObject", "Lcom/unity3d/ads/core/data/model/AdObject;", "onSubscription", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "", "(Lkotlinx/coroutines/flow/SharedFlow;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/unity3d/ads/core/data/model/AdObject;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class HandleInvocationsFromAdViewer implements com.unity3d.services.core.di.IServiceComponent {
    public static final java.lang.String KEY_AD_DATA = "adData";
    public static final java.lang.String KEY_AD_DATA_REFRESH_TOKEN = "adDataRefreshToken";
    public static final java.lang.String KEY_DOWNLOAD_PRIORITY = "priority";
    public static final java.lang.String KEY_DOWNLOAD_URL = "url";
    public static final java.lang.String KEY_IMPRESSION_CONFIG = "impressionConfig";
    public static final java.lang.String KEY_IS_HEADER_BIDDING = "isHeaderBidding";
    public static final java.lang.String KEY_LOAD_OPTIONS = "loadOptions";
    public static final java.lang.String KEY_NATIVE_CONTEXT = "nativeContext";
    public static final java.lang.String KEY_OMID = "openMeasurement";
    public static final java.lang.String KEY_OMJS_SERVICE = "serviceFilePath";
    public static final java.lang.String KEY_OMJS_SESSION = "sessionFilePath";
    public static final java.lang.String KEY_OM_PARTNER = "partnerName";
    public static final java.lang.String KEY_OM_PARTNER_VERSION = "partnerVersion";
    public static final java.lang.String KEY_OM_VERSION = "version";
    public static final java.lang.String KEY_PACKAGE_NAME = "packageName";
    public static final java.lang.String KEY_PRIVACY_UPDATE_CONTENT = "content";
    public static final java.lang.String KEY_PRIVACY_UPDATE_VERSION = "version";
    public static final java.lang.String KEY_TRACKING_TOKEN = "trackingToken";

    @Override // com.unity3d.services.core.di.IServiceComponent
    public com.unity3d.services.core.di.IServiceProvider getServiceProvider() {
        return com.unity3d.services.core.di.IServiceComponent.DefaultImpls.getServiceProvider(this);
    }

    public final java.lang.Object invoke(kotlinx.coroutines.flow.SharedFlow<com.unity3d.ads.adplayer.Invocation> sharedFlow, java.lang.String str, java.lang.String str2, java.lang.String str3, final com.unity3d.ads.core.data.model.AdObject adObject, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function1, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<com.unity3d.ads.adplayer.Invocation>> continuation) {
        final java.lang.String strM1091constructorimpl = com.unity3d.ads.core.data.model.AdData.m1091constructorimpl(str);
        final java.lang.String strM1105constructorimpl = com.unity3d.ads.core.data.model.ImpressionConfig.m1105constructorimpl(str3);
        final java.lang.String strM1098constructorimpl = com.unity3d.ads.core.data.model.AdDataRefreshToken.m1098constructorimpl(str2);
        return kotlinx.coroutines.flow.FlowKt.onEach(kotlinx.coroutines.flow.FlowKt.onSubscription(sharedFlow, new com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.AnonymousClass2(function1, null)), new com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.AnonymousClass3(kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.unity3d.ads.adplayer.ExposedFunctionLocation.GET_AD_CONTEXT, new kotlin.jvm.functions.Function0<com.unity3d.ads.adplayer.ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.adplayer.ExposedFunction invoke() {
                return com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.m1115getAdContextyLuu4LI((com.unity3d.ads.core.domain.AndroidGetAdPlayerContext) this.this$0.getServiceProvider().getRegistry().getService("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.AndroidGetAdPlayerContext.class)), strM1091constructorimpl, strM1105constructorimpl, strM1098constructorimpl, (com.unity3d.ads.core.domain.om.IsOMActivated) this.this$0.getServiceProvider().getRegistry().getService("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.om.IsOMActivated.class)), adObject);
            }
        }), kotlin.TuplesKt.to(com.unity3d.ads.adplayer.ExposedFunctionLocation.GET_CONNECTION_TYPE, new kotlin.jvm.functions.Function0<com.unity3d.ads.adplayer.ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.adplayer.ExposedFunction invoke() {
                return com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.getConnectionType((com.unity3d.ads.core.data.repository.DeviceInfoRepository) this.this$0.getServiceProvider().getRegistry().getService("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.DeviceInfoRepository.class)));
            }
        }), kotlin.TuplesKt.to(com.unity3d.ads.adplayer.ExposedFunctionLocation.GET_DEVICE_VOLUME, new kotlin.jvm.functions.Function0<com.unity3d.ads.adplayer.ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.adplayer.ExposedFunction invoke() {
                return com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.getDeviceVolume((com.unity3d.ads.core.data.repository.DeviceInfoRepository) this.this$0.getServiceProvider().getRegistry().getService("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.DeviceInfoRepository.class)));
            }
        }), kotlin.TuplesKt.to(com.unity3d.ads.adplayer.ExposedFunctionLocation.GET_DEVICE_MAX_VOLUME, new kotlin.jvm.functions.Function0<com.unity3d.ads.adplayer.ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$4
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.adplayer.ExposedFunction invoke() {
                return com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.getDeviceMaxVolume((com.unity3d.ads.core.data.repository.DeviceInfoRepository) this.this$0.getServiceProvider().getRegistry().getService("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.DeviceInfoRepository.class)));
            }
        }), kotlin.TuplesKt.to(com.unity3d.ads.adplayer.ExposedFunctionLocation.GET_SCREEN_HEIGHT, new kotlin.jvm.functions.Function0<com.unity3d.ads.adplayer.ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$5
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.adplayer.ExposedFunction invoke() {
                return com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.getScreenHeight((com.unity3d.ads.core.data.repository.DeviceInfoRepository) this.this$0.getServiceProvider().getRegistry().getService("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.DeviceInfoRepository.class)));
            }
        }), kotlin.TuplesKt.to(com.unity3d.ads.adplayer.ExposedFunctionLocation.GET_SCREEN_WIDTH, new kotlin.jvm.functions.Function0<com.unity3d.ads.adplayer.ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$6
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.adplayer.ExposedFunction invoke() {
                return com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.getScreenWidth((com.unity3d.ads.core.data.repository.DeviceInfoRepository) this.this$0.getServiceProvider().getRegistry().getService("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.DeviceInfoRepository.class)));
            }
        }), kotlin.TuplesKt.to(com.unity3d.ads.adplayer.ExposedFunctionLocation.OPEN_URL, new kotlin.jvm.functions.Function0<com.unity3d.ads.adplayer.ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$7
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.adplayer.ExposedFunction invoke() {
                return com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.openUrl((com.unity3d.ads.core.domain.HandleOpenUrl) this.this$0.getServiceProvider().getRegistry().getService("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.HandleOpenUrl.class)));
            }
        }), kotlin.TuplesKt.to(com.unity3d.ads.adplayer.ExposedFunctionLocation.SEND_OPERATIVE_EVENT, new kotlin.jvm.functions.Function0<com.unity3d.ads.adplayer.ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$8
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.adplayer.ExposedFunction invoke() {
                return com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.sendOperativeEvent((com.unity3d.ads.core.domain.events.GetOperativeEventApi) this.this$0.getServiceProvider().getRegistry().getService("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.events.GetOperativeEventApi.class)), adObject);
            }
        }), kotlin.TuplesKt.to(com.unity3d.ads.adplayer.ExposedFunctionLocation.STORAGE_WRITE, new kotlin.jvm.functions.Function0<com.unity3d.ads.adplayer.ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$9
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.adplayer.ExposedFunction invoke() {
                return com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.writeStorage();
            }
        }), kotlin.TuplesKt.to(com.unity3d.ads.adplayer.ExposedFunctionLocation.STORAGE_READ, new kotlin.jvm.functions.Function0<com.unity3d.ads.adplayer.ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$10
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.adplayer.ExposedFunction invoke() {
                return com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.readStorage();
            }
        }), kotlin.TuplesKt.to(com.unity3d.ads.adplayer.ExposedFunctionLocation.STORAGE_DELETE, new kotlin.jvm.functions.Function0<com.unity3d.ads.adplayer.ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$11
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.adplayer.ExposedFunction invoke() {
                return com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.deleteStorage();
            }
        }), kotlin.TuplesKt.to(com.unity3d.ads.adplayer.ExposedFunctionLocation.STORAGE_CLEAR, new kotlin.jvm.functions.Function0<com.unity3d.ads.adplayer.ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$12
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.adplayer.ExposedFunction invoke() {
                return com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.clearStorage();
            }
        }), kotlin.TuplesKt.to(com.unity3d.ads.adplayer.ExposedFunctionLocation.STORAGE_GET_KEYS, new kotlin.jvm.functions.Function0<com.unity3d.ads.adplayer.ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$13
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.adplayer.ExposedFunction invoke() {
                return com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.getKeysStorage();
            }
        }), kotlin.TuplesKt.to(com.unity3d.ads.adplayer.ExposedFunctionLocation.STORAGE_GET, new kotlin.jvm.functions.Function0<com.unity3d.ads.adplayer.ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$14
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.adplayer.ExposedFunction invoke() {
                return com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.getStorage();
            }
        }), kotlin.TuplesKt.to(com.unity3d.ads.adplayer.ExposedFunctionLocation.STORAGE_SET, new kotlin.jvm.functions.Function0<com.unity3d.ads.adplayer.ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$15
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.adplayer.ExposedFunction invoke() {
                return com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.setStorage();
            }
        }), kotlin.TuplesKt.to(com.unity3d.ads.adplayer.ExposedFunctionLocation.GET_PRIVACY_FSM, new kotlin.jvm.functions.Function0<com.unity3d.ads.adplayer.ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$16
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.adplayer.ExposedFunction invoke() {
                return com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.getPrivacyFsm((com.unity3d.ads.core.data.repository.SessionRepository) this.this$0.getServiceProvider().getRegistry().getService("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.SessionRepository.class)));
            }
        }), kotlin.TuplesKt.to(com.unity3d.ads.adplayer.ExposedFunctionLocation.SET_PRIVACY_FSM, new kotlin.jvm.functions.Function0<com.unity3d.ads.adplayer.ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$17
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.adplayer.ExposedFunction invoke() {
                return com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.setPrivacyFsm((com.unity3d.ads.core.data.repository.SessionRepository) this.this$0.getServiceProvider().getRegistry().getService("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.SessionRepository.class)));
            }
        }), kotlin.TuplesKt.to(com.unity3d.ads.adplayer.ExposedFunctionLocation.GET_PRIVACY, new kotlin.jvm.functions.Function0<com.unity3d.ads.adplayer.ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$18
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.adplayer.ExposedFunction invoke() {
                return com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.getPrivacy((com.unity3d.ads.core.data.repository.SessionRepository) this.this$0.getServiceProvider().getRegistry().getService("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.SessionRepository.class)));
            }
        }), kotlin.TuplesKt.to(com.unity3d.ads.adplayer.ExposedFunctionLocation.SET_PRIVACY, new kotlin.jvm.functions.Function0<com.unity3d.ads.adplayer.ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$19
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.adplayer.ExposedFunction invoke() {
                return com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.setPrivacy((com.unity3d.ads.core.data.repository.SessionRepository) this.this$0.getServiceProvider().getRegistry().getService("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.SessionRepository.class)));
            }
        }), kotlin.TuplesKt.to(com.unity3d.ads.adplayer.ExposedFunctionLocation.GET_ALLOWED_PII, new kotlin.jvm.functions.Function0<com.unity3d.ads.adplayer.ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$20
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.adplayer.ExposedFunction invoke() {
                return com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.getAllowedPii((com.unity3d.ads.core.data.repository.DeviceInfoRepository) this.this$0.getServiceProvider().getRegistry().getService("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.DeviceInfoRepository.class)));
            }
        }), kotlin.TuplesKt.to(com.unity3d.ads.adplayer.ExposedFunctionLocation.SET_ALLOWED_PII, new kotlin.jvm.functions.Function0<com.unity3d.ads.adplayer.ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$21
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.adplayer.ExposedFunction invoke() {
                return com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.setAllowedPii((com.unity3d.ads.core.data.repository.DeviceInfoRepository) this.this$0.getServiceProvider().getRegistry().getService("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.DeviceInfoRepository.class)));
            }
        }), kotlin.TuplesKt.to(com.unity3d.ads.adplayer.ExposedFunctionLocation.GET_SESSION_TOKEN, new kotlin.jvm.functions.Function0<com.unity3d.ads.adplayer.ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$22
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.adplayer.ExposedFunction invoke() {
                return com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.getSessionToken((com.unity3d.ads.core.data.repository.SessionRepository) this.this$0.getServiceProvider().getRegistry().getService("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.SessionRepository.class)));
            }
        }), kotlin.TuplesKt.to(com.unity3d.ads.adplayer.ExposedFunctionLocation.MARK_CAMPAIGN_STATE_SHOWN, new kotlin.jvm.functions.Function0<com.unity3d.ads.adplayer.ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$23
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.adplayer.ExposedFunction invoke() {
                return com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.markCampaignStateShown((com.unity3d.ads.core.data.repository.CampaignRepository) this.this$0.getServiceProvider().getRegistry().getService("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.CampaignRepository.class)), adObject);
            }
        }), kotlin.TuplesKt.to(com.unity3d.ads.adplayer.ExposedFunctionLocation.REFRESH_AD_DATA, new kotlin.jvm.functions.Function0<com.unity3d.ads.adplayer.ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$24
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.adplayer.ExposedFunction invoke() {
                return com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.refreshAdData((com.unity3d.ads.core.domain.Refresh) this.this$0.getServiceProvider().getRegistry().getService("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.Refresh.class)), adObject);
            }
        }), kotlin.TuplesKt.to(com.unity3d.ads.adplayer.ExposedFunctionLocation.UPDATE_TRACKING_TOKEN, new kotlin.jvm.functions.Function0<com.unity3d.ads.adplayer.ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$25
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.adplayer.ExposedFunction invoke() {
                return com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.updateTrackingToken(adObject);
            }
        }), kotlin.TuplesKt.to(com.unity3d.ads.adplayer.ExposedFunctionLocation.SEND_PRIVACY_UPDATE_REQUEST, new kotlin.jvm.functions.Function0<com.unity3d.ads.adplayer.ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$26
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.adplayer.ExposedFunction invoke() {
                return com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.sendPrivacyUpdateRequest((com.unity3d.ads.core.domain.SendPrivacyUpdateRequest) this.this$0.getServiceProvider().getRegistry().getService("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.SendPrivacyUpdateRequest.class)));
            }
        }), kotlin.TuplesKt.to(com.unity3d.ads.adplayer.ExposedFunctionLocation.SEND_DIAGNOSTIC_EVENT, new kotlin.jvm.functions.Function0<com.unity3d.ads.adplayer.ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$27
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.adplayer.ExposedFunction invoke() {
                return com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.sendDiagnosticEvent((com.unity3d.ads.core.domain.SendDiagnosticEvent) this.this$0.getServiceProvider().getRegistry().getService("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.SendDiagnosticEvent.class)), adObject);
            }
        }), kotlin.TuplesKt.to(com.unity3d.ads.adplayer.ExposedFunctionLocation.INCREMENT_BANNER_IMPRESSION_COUNT, new kotlin.jvm.functions.Function0<com.unity3d.ads.adplayer.ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$28
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.adplayer.ExposedFunction invoke() {
                return com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.incrementBannerImpressionCount((com.unity3d.ads.core.data.repository.SessionRepository) this.this$0.getServiceProvider().getRegistry().getService("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.SessionRepository.class)));
            }
        }), kotlin.TuplesKt.to(com.unity3d.ads.adplayer.ExposedFunctionLocation.DOWNLOAD, new kotlin.jvm.functions.Function0<com.unity3d.ads.adplayer.ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$29
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.adplayer.ExposedFunction invoke() {
                return com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.download((com.unity3d.ads.core.domain.CacheFile) this.this$0.getServiceProvider().getRegistry().getService("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.CacheFile.class)), adObject);
            }
        }), kotlin.TuplesKt.to(com.unity3d.ads.adplayer.ExposedFunctionLocation.IS_FILE_CACHED, new kotlin.jvm.functions.Function0<com.unity3d.ads.adplayer.ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$30
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.adplayer.ExposedFunction invoke() {
                return com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.isFileCached((com.unity3d.ads.core.domain.GetIsFileCache) this.this$0.getServiceProvider().getRegistry().getService("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.GetIsFileCache.class)));
            }
        }), kotlin.TuplesKt.to(com.unity3d.ads.adplayer.ExposedFunctionLocation.OM_START_SESSION, new kotlin.jvm.functions.Function0<com.unity3d.ads.adplayer.ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$31
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.adplayer.ExposedFunction invoke() {
                return com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.omStartSession((com.unity3d.ads.core.domain.om.AndroidOmStartSession) this.this$0.getServiceProvider().getRegistry().getService("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.om.AndroidOmStartSession.class)), adObject);
            }
        }), kotlin.TuplesKt.to(com.unity3d.ads.adplayer.ExposedFunctionLocation.OM_FINISH_SESSION, new kotlin.jvm.functions.Function0<com.unity3d.ads.adplayer.ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$32
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.adplayer.ExposedFunction invoke() {
                return com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.omFinishSession((com.unity3d.ads.core.domain.om.OmFinishSession) this.this$0.getServiceProvider().getRegistry().getService("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.om.OmFinishSession.class)), adObject);
            }
        }), kotlin.TuplesKt.to(com.unity3d.ads.adplayer.ExposedFunctionLocation.OM_IMPRESSION, new kotlin.jvm.functions.Function0<com.unity3d.ads.adplayer.ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$33
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.adplayer.ExposedFunction invoke() {
                return com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.omImpression((com.unity3d.ads.core.domain.om.OmImpressionOccurred) this.this$0.getServiceProvider().getRegistry().getService("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.om.OmImpressionOccurred.class)), adObject);
            }
        }), kotlin.TuplesKt.to(com.unity3d.ads.adplayer.ExposedFunctionLocation.OM_GET_DATA, new kotlin.jvm.functions.Function0<com.unity3d.ads.adplayer.ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$34
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.adplayer.ExposedFunction invoke() {
                return com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.omGetData((com.unity3d.ads.core.domain.om.GetOmData) this.this$0.getServiceProvider().getRegistry().getService("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.om.GetOmData.class)));
            }
        }), kotlin.TuplesKt.to(com.unity3d.ads.adplayer.ExposedFunctionLocation.IS_ATTRIBUTION_AVAILABLE, new kotlin.jvm.functions.Function0<com.unity3d.ads.adplayer.ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$35
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.adplayer.ExposedFunction invoke() {
                return com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.isAttributionAvailable((com.unity3d.ads.core.domain.attribution.AndroidAttribution) this.this$0.getServiceProvider().getRegistry().getService("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.attribution.AndroidAttribution.class)));
            }
        }), kotlin.TuplesKt.to(com.unity3d.ads.adplayer.ExposedFunctionLocation.ATTRIBUTION_REGISTER_VIEW, new kotlin.jvm.functions.Function0<com.unity3d.ads.adplayer.ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$36
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.adplayer.ExposedFunction invoke() {
                return com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.attributionRegisterView((com.unity3d.ads.core.domain.attribution.AndroidAttribution) this.this$0.getServiceProvider().getRegistry().getService("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.attribution.AndroidAttribution.class)), adObject);
            }
        }), kotlin.TuplesKt.to(com.unity3d.ads.adplayer.ExposedFunctionLocation.ATTRIBUTION_REGISTER_CLICK, new kotlin.jvm.functions.Function0<com.unity3d.ads.adplayer.ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$37
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.adplayer.ExposedFunction invoke() {
                return com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.attributionRegisterClick((com.unity3d.ads.core.domain.attribution.AndroidAttribution) this.this$0.getServiceProvider().getRegistry().getService("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.attribution.AndroidAttribution.class)), adObject);
            }
        }), kotlin.TuplesKt.to(com.unity3d.ads.adplayer.ExposedFunctionLocation.HEADER_BIDDING_TOKEN_INCREMENT_WINS, new kotlin.jvm.functions.Function0<com.unity3d.ads.adplayer.ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$38
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.adplayer.ExposedFunction invoke() {
                return com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.hbTokenIncrementWins((com.unity3d.ads.core.data.repository.SessionRepository) this.this$0.getServiceProvider().getRegistry().getService("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.SessionRepository.class)));
            }
        }), kotlin.TuplesKt.to(com.unity3d.ads.adplayer.ExposedFunctionLocation.HEADER_BIDDING_TOKEN_INCREMENT_STARTS, new kotlin.jvm.functions.Function0<com.unity3d.ads.adplayer.ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$39
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.adplayer.ExposedFunction invoke() {
                return com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.hbTokenIncrementStarts((com.unity3d.ads.core.data.repository.SessionRepository) this.this$0.getServiceProvider().getRegistry().getService("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.SessionRepository.class)));
            }
        }), kotlin.TuplesKt.to(com.unity3d.ads.adplayer.ExposedFunctionLocation.HEADER_BIDDING_TOKEN_RESET, new kotlin.jvm.functions.Function0<com.unity3d.ads.adplayer.ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$40
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.adplayer.ExposedFunction invoke() {
                return com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.hbTokenReset((com.unity3d.ads.core.data.repository.SessionRepository) this.this$0.getServiceProvider().getRegistry().getService("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.SessionRepository.class)));
            }
        })), null));
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$2, reason: invalid class name */
    /* JADX INFO: compiled from: HandleInvocationsFromAdViewer.kt */
    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/unity3d/ads/adplayer/Invocation;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$2", f = "HandleInvocationsFromAdViewer.kt", i = {}, l = {org.objectweb.asm.Opcodes.DCMPG}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super com.unity3d.ads.adplayer.Invocation>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> $onSubscription;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function1, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.AnonymousClass2> continuation) {
            super(2, continuation);
            this.$onSubscription = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.AnonymousClass2(this.$onSubscription, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super com.unity3d.ads.adplayer.Invocation> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.AnonymousClass2) create(flowCollector, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> function1 = this.$onSubscription;
                this.label = 1;
                if (function1.invoke(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            return kotlin.Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$3, reason: invalid class name */
    /* JADX INFO: compiled from: HandleInvocationsFromAdViewer.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", "Lcom/unity3d/ads/adplayer/Invocation;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$3", f = "HandleInvocationsFromAdViewer.kt", i = {}, l = {156}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass3 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.unity3d.ads.adplayer.Invocation, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ java.util.Map<java.lang.String, kotlin.jvm.functions.Function0<com.unity3d.ads.adplayer.ExposedFunction>> $definition;
        /* synthetic */ java.lang.Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass3(java.util.Map<java.lang.String, ? extends kotlin.jvm.functions.Function0<? extends com.unity3d.ads.adplayer.ExposedFunction>> map, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.AnonymousClass3> continuation) {
            super(2, continuation);
            this.$definition = map;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.AnonymousClass3 anonymousClass3 = new com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.AnonymousClass3(this.$definition, continuation);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(com.unity3d.ads.adplayer.Invocation invocation, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.AnonymousClass3) create(invocation, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            com.unity3d.ads.adplayer.ExposedFunction exposedFunctionInvoke;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.unity3d.ads.adplayer.Invocation invocation = (com.unity3d.ads.adplayer.Invocation) this.L$0;
                kotlin.jvm.functions.Function0<com.unity3d.ads.adplayer.ExposedFunction> function0 = this.$definition.get(invocation.getLocation());
                if (function0 == null || (exposedFunctionInvoke = function0.invoke()) == null) {
                    return kotlin.Unit.INSTANCE;
                }
                this.label = 1;
                if (invocation.handle(new com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.AnonymousClass3.AnonymousClass1(exposedFunctionInvoke, invocation, null), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            return kotlin.Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$3$1, reason: invalid class name */
        /* JADX INFO: compiled from: HandleInvocationsFromAdViewer.kt */
        @kotlin.Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$3$1", f = "HandleInvocationsFromAdViewer.kt", i = {}, l = {156}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super java.lang.Object>, java.lang.Object> {
            final /* synthetic */ com.unity3d.ads.adplayer.ExposedFunction $exposedFunction;
            final /* synthetic */ com.unity3d.ads.adplayer.Invocation $it;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(com.unity3d.ads.adplayer.ExposedFunction exposedFunction, com.unity3d.ads.adplayer.Invocation invocation, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.AnonymousClass3.AnonymousClass1> continuation) {
                super(1, continuation);
                this.$exposedFunction = exposedFunction;
                this.$it = invocation;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
                return new com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.AnonymousClass3.AnonymousClass1(this.$exposedFunction, this.$it, continuation);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlin.coroutines.Continuation<? super java.lang.Object> continuation) {
                return invoke2((kotlin.coroutines.Continuation<java.lang.Object>) continuation);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final java.lang.Object invoke2(kotlin.coroutines.Continuation<java.lang.Object> continuation) {
                return ((com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.AnonymousClass3.AnonymousClass1) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.unity3d.ads.adplayer.ExposedFunction exposedFunction = this.$exposedFunction;
                    java.lang.Object[] parameters = this.$it.getParameters();
                    this.label = 1;
                    obj = exposedFunction.invoke(parameters, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return obj;
            }
        }
    }
}
