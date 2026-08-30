package com.unity3d.ads.adplayer;

/* JADX INFO: compiled from: AndroidFullscreenWebViewAdPlayer.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 O2\u00020\u00012\u00020\u0002:\u0001OB5\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\u0011\u0010#\u001a\u00020$H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010%J\t\u0010&\u001a\u00020$H\u0096\u0001J\u0010\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0002J\u0019\u0010+\u001a\u00020$2\u0006\u0010,\u001a\u00020-H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010.J\u0019\u0010/\u001a\u00020$2\u0006\u0010,\u001a\u000200H\u0082@ø\u0001\u0000¢\u0006\u0002\u00101J\u0019\u00102\u001a\u00020$2\u0006\u00103\u001a\u00020\u001eH\u0096Aø\u0001\u0000¢\u0006\u0002\u00104J\u0019\u00105\u001a\u00020$2\u0006\u00106\u001a\u00020\u0006H\u0096Aø\u0001\u0000¢\u0006\u0002\u00107J)\u00108\u001a\u00020$2\u0016\u00109\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010;\u0018\u00010:H\u0096Aø\u0001\u0000¢\u0006\u0002\u0010<J\u0011\u0010=\u001a\u00020$H\u0096Aø\u0001\u0000¢\u0006\u0002\u0010%J\u0019\u0010>\u001a\u00020$2\u0006\u0010?\u001a\u00020@H\u0096Aø\u0001\u0000¢\u0006\u0002\u0010AJ\u0019\u0010B\u001a\u00020$2\u0006\u0010C\u001a\u00020@H\u0096Aø\u0001\u0000¢\u0006\u0002\u0010AJ\u0019\u0010D\u001a\u00020$2\u0006\u00103\u001a\u00020\u001eH\u0096Aø\u0001\u0000¢\u0006\u0002\u00104J\u0019\u0010E\u001a\u00020$2\u0006\u00103\u001a\u00020\u001eH\u0096Aø\u0001\u0000¢\u0006\u0002\u00104J\u0019\u0010F\u001a\u00020$2\u0006\u0010G\u001a\u00020@H\u0096Aø\u0001\u0000¢\u0006\u0002\u0010AJ\u0019\u0010H\u001a\u00020$2\u0006\u0010I\u001a\u00020JH\u0096Aø\u0001\u0000¢\u0006\u0002\u0010KJ\u0010\u0010L\u001a\u00020$2\u0006\u0010M\u001a\u00020NH\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0011X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0014R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0018\u001a\u00020\u0019X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u001c\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001d0\u0011X\u0096\u0005¢\u0006\u0006\u001a\u0004\b \u0010\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006P"}, d2 = {"Lcom/unity3d/ads/adplayer/AndroidFullscreenWebViewAdPlayer;", "Lcom/unity3d/ads/adplayer/AdPlayer;", "Lcom/unity3d/ads/adplayer/FullscreenAdPlayer;", "webViewAdPlayer", "Lcom/unity3d/ads/adplayer/WebViewAdPlayer;", "opportunityId", "", "webViewContainer", "Lcom/unity3d/ads/adplayer/AndroidWebViewContainer;", "deviceInfoRepository", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "openMeasurementRepository", "Lcom/unity3d/ads/core/data/repository/OpenMeasurementRepository;", "(Lcom/unity3d/ads/adplayer/WebViewAdPlayer;Ljava/lang/String;Lcom/unity3d/ads/adplayer/AndroidWebViewContainer;Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/data/repository/OpenMeasurementRepository;)V", "onLoadEvent", "Lkotlinx/coroutines/flow/Flow;", "Lcom/unity3d/ads/adplayer/model/LoadEvent;", "getOnLoadEvent", "()Lkotlinx/coroutines/flow/Flow;", "onShowEvent", "Lcom/unity3d/ads/core/data/model/ShowEvent;", "getOnShowEvent", "scope", "Lkotlinx/coroutines/CoroutineScope;", "getScope", "()Lkotlinx/coroutines/CoroutineScope;", "updateCampaignState", "Lkotlin/Pair;", "", "", "getUpdateCampaignState", "getWebViewContainer", "()Lcom/unity3d/ads/adplayer/AndroidWebViewContainer;", "destroy", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dispatchShowCompleted", "displayEventsRouter", "Lkotlinx/coroutines/Job;", "displayMessage", "Lcom/unity3d/ads/adplayer/DisplayMessage;", "handleSessionChange", "change", "Lcom/unity3d/ads/core/data/model/SessionChange;", "(Lcom/unity3d/ads/core/data/model/SessionChange;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleVolumeSettingsChange", "Lcom/unity3d/ads/core/data/datasource/VolumeSettingsChange;", "(Lcom/unity3d/ads/core/data/datasource/VolumeSettingsChange;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onAllowedPiiChange", "value", "([BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onBroadcastEvent", androidx.core.app.NotificationCompat.CATEGORY_EVENT, "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestShow", "unityAdsShowOptions", "", "", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendActivityDestroyed", "sendFocusChange", "isFocused", "", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendMuteChange", "isMuted", "sendPrivacyFsmChange", "sendUserConsentChange", "sendVisibilityChange", com.json.pg.k, "sendVolumeChange", "volume", "", "(DLkotlin/coroutines/Continuation;)Ljava/lang/Object;", com.json.j5.v, "showOptions", "Lcom/unity3d/ads/adplayer/ShowOptions;", "Companion", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidFullscreenWebViewAdPlayer implements com.unity3d.ads.adplayer.AdPlayer, com.unity3d.ads.adplayer.FullscreenAdPlayer {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.Companion INSTANCE = new com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.Companion(null);
    private static final kotlinx.coroutines.flow.MutableSharedFlow<com.unity3d.ads.adplayer.DisplayMessage> displayMessages = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
    private final com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository;
    private final com.unity3d.ads.core.data.repository.OpenMeasurementRepository openMeasurementRepository;
    private final java.lang.String opportunityId;
    private final com.unity3d.ads.core.data.repository.SessionRepository sessionRepository;
    private final com.unity3d.ads.adplayer.WebViewAdPlayer webViewAdPlayer;
    private final com.unity3d.ads.adplayer.AndroidWebViewContainer webViewContainer;

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$destroy$1, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidFullscreenWebViewAdPlayer.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer", f = "AndroidFullscreenWebViewAdPlayer.kt", i = {0, 1, 2}, l = {98, 103, 107, 109}, m = "destroy", n = {"this", "this", "this"}, s = {"L$0", "L$0", "L$0"})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        int label;
        /* synthetic */ java.lang.Object result;

        AnonymousClass1(kotlin.coroutines.Continuation<? super com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.this.destroy(this);
        }
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public void dispatchShowCompleted() {
        this.webViewAdPlayer.dispatchShowCompleted();
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public kotlinx.coroutines.flow.Flow<com.unity3d.ads.adplayer.model.LoadEvent> getOnLoadEvent() {
        return this.webViewAdPlayer.getOnLoadEvent();
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public kotlinx.coroutines.flow.Flow<com.unity3d.ads.core.data.model.ShowEvent> getOnShowEvent() {
        return this.webViewAdPlayer.getOnShowEvent();
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public kotlinx.coroutines.CoroutineScope getScope() {
        return this.webViewAdPlayer.getScope();
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public kotlinx.coroutines.flow.Flow<kotlin.Pair<byte[], java.lang.Integer>> getUpdateCampaignState() {
        return this.webViewAdPlayer.getUpdateCampaignState();
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public java.lang.Object onAllowedPiiChange(byte[] bArr, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return this.webViewAdPlayer.onAllowedPiiChange(bArr, continuation);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public java.lang.Object onBroadcastEvent(java.lang.String str, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return this.webViewAdPlayer.onBroadcastEvent(str, continuation);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public java.lang.Object requestShow(java.util.Map<java.lang.String, ? extends java.lang.Object> map, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return this.webViewAdPlayer.requestShow(map, continuation);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public java.lang.Object sendActivityDestroyed(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return this.webViewAdPlayer.sendActivityDestroyed(continuation);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public java.lang.Object sendFocusChange(boolean z, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return this.webViewAdPlayer.sendFocusChange(z, continuation);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public java.lang.Object sendMuteChange(boolean z, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return this.webViewAdPlayer.sendMuteChange(z, continuation);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public java.lang.Object sendPrivacyFsmChange(byte[] bArr, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return this.webViewAdPlayer.sendPrivacyFsmChange(bArr, continuation);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public java.lang.Object sendUserConsentChange(byte[] bArr, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return this.webViewAdPlayer.sendUserConsentChange(bArr, continuation);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public java.lang.Object sendVisibilityChange(boolean z, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return this.webViewAdPlayer.sendVisibilityChange(z, continuation);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public java.lang.Object sendVolumeChange(double d, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return this.webViewAdPlayer.sendVolumeChange(d, continuation);
    }

    public AndroidFullscreenWebViewAdPlayer(com.unity3d.ads.adplayer.WebViewAdPlayer webViewAdPlayer, java.lang.String opportunityId, com.unity3d.ads.adplayer.AndroidWebViewContainer webViewContainer, com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository, com.unity3d.ads.core.data.repository.SessionRepository sessionRepository, com.unity3d.ads.core.data.repository.OpenMeasurementRepository openMeasurementRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webViewAdPlayer, "webViewAdPlayer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(opportunityId, "opportunityId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webViewContainer, "webViewContainer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceInfoRepository, "deviceInfoRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(openMeasurementRepository, "openMeasurementRepository");
        this.webViewAdPlayer = webViewAdPlayer;
        this.opportunityId = opportunityId;
        this.webViewContainer = webViewContainer;
        this.deviceInfoRepository = deviceInfoRepository;
        this.sessionRepository = sessionRepository;
        this.openMeasurementRepository = openMeasurementRepository;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public com.unity3d.ads.adplayer.AndroidWebViewContainer getWebViewContainer() {
        return this.webViewContainer;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public void show(com.unity3d.ads.adplayer.ShowOptions showOptions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(showOptions, "showOptions");
        if (!(showOptions instanceof com.unity3d.ads.adplayer.AndroidShowOptions)) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        com.unity3d.ads.adplayer.AndroidShowOptions androidShowOptions = (com.unity3d.ads.adplayer.AndroidShowOptions) showOptions;
        android.content.Context context = androidShowOptions.getContext();
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.unity3d.ads.adplayer.FullScreenWebViewDisplay.class);
        intent.putExtra("opportunityId", this.opportunityId);
        java.util.Map<java.lang.String, java.lang.Object> unityAdsShowOptions = androidShowOptions.getUnityAdsShowOptions();
        if (unityAdsShowOptions != null) {
            intent.putExtra("showOptions", new org.json.JSONObject(unityAdsShowOptions).toString());
        }
        intent.addFlags(268500992);
        intent.putExtra("orientation", context.getResources().getConfiguration().orientation);
        final kotlinx.coroutines.flow.MutableSharedFlow<com.unity3d.ads.adplayer.DisplayMessage> mutableSharedFlow = displayMessages;
        kotlinx.coroutines.flow.FlowKt.launchIn(kotlinx.coroutines.flow.FlowKt.onEach(new kotlinx.coroutines.flow.Flow<com.unity3d.ads.adplayer.DisplayMessage>() { // from class: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$1
            @Override // kotlinx.coroutines.flow.Flow
            public java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super com.unity3d.ads.adplayer.DisplayMessage> flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object objCollect = mutableSharedFlow.collect(new com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$1.AnonymousClass2(flowCollector, this), continuation);
                return objCollect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : kotlin.Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: Emitters.kt */
            @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 8, 0}, xi = 48)
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector $this_unsafeFlow;
                final /* synthetic */ com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer this$0;

                /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$1$2$1, reason: invalid class name */
                /* JADX INFO: compiled from: Emitters.kt */
                @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$1$2", f = "AndroidFullscreenWebViewAdPlayer.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    java.lang.Object L$0;
                    java.lang.Object L$1;
                    int label;
                    /* synthetic */ java.lang.Object result;

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$1.AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector, com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = androidFullscreenWebViewAdPlayer;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0014  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    if (continuation instanceof com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$1.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$1.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label -= Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$1.AnonymousClass2.AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$1.AnonymousClass2.AnonymousClass1(continuation);
                    }
                    java.lang.Object obj2 = anonymousClass1.result;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = anonymousClass1.label;
                    if (i == 0) {
                        kotlin.ResultKt.throwOnFailure(obj2);
                        kotlinx.coroutines.flow.FlowCollector flowCollector = this.$this_unsafeFlow;
                        if (kotlin.jvm.internal.Intrinsics.areEqual(((com.unity3d.ads.adplayer.DisplayMessage) obj).getOpportunityId(), this.this$0.opportunityId)) {
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj2);
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }
        }, new com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.AnonymousClass2(this)), getScope());
        kotlinx.coroutines.flow.FlowKt.launchIn(kotlinx.coroutines.flow.FlowKt.onEach(this.deviceInfoRepository.getVolumeSettingsChange(), new com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.AnonymousClass3(this)), getScope());
        final kotlinx.coroutines.flow.Flow<com.unity3d.ads.core.data.model.ShowEvent> onShowEvent = this.webViewAdPlayer.getOnShowEvent();
        kotlinx.coroutines.flow.FlowKt.launchIn(kotlinx.coroutines.flow.FlowKt.onEach(new kotlinx.coroutines.flow.Flow<com.unity3d.ads.core.data.model.ShowEvent>() { // from class: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$2
            @Override // kotlinx.coroutines.flow.Flow
            public java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super com.unity3d.ads.core.data.model.ShowEvent> flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object objCollect = onShowEvent.collect(new com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$2.AnonymousClass2(flowCollector), continuation);
                return objCollect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : kotlin.Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$2$2, reason: invalid class name */
            /* JADX INFO: compiled from: Emitters.kt */
            @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 8, 0}, xi = 48)
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector $this_unsafeFlow;

                /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$2$2$1, reason: invalid class name */
                /* JADX INFO: compiled from: Emitters.kt */
                @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$2$2", f = "AndroidFullscreenWebViewAdPlayer.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    java.lang.Object L$0;
                    java.lang.Object L$1;
                    int label;
                    /* synthetic */ java.lang.Object result;

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$2.AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0014  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$2.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    if (continuation instanceof com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$2.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$2.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label -= Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$2.AnonymousClass2.AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$2.AnonymousClass2.AnonymousClass1(continuation);
                    }
                    java.lang.Object obj2 = anonymousClass1.result;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = anonymousClass1.label;
                    if (i == 0) {
                        kotlin.ResultKt.throwOnFailure(obj2);
                        kotlinx.coroutines.flow.FlowCollector flowCollector = this.$this_unsafeFlow;
                        com.unity3d.ads.core.data.model.ShowEvent showEvent = (com.unity3d.ads.core.data.model.ShowEvent) obj;
                        if ((showEvent instanceof com.unity3d.ads.core.data.model.ShowEvent.Completed) || (showEvent instanceof com.unity3d.ads.core.data.model.ShowEvent.Error)) {
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj2);
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }
        }, new com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.AnonymousClass5(null)), getScope());
        kotlinx.coroutines.flow.FlowKt.launchIn(kotlinx.coroutines.flow.FlowKt.onEach(this.sessionRepository.getOnChange(), new com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.AnonymousClass6(this)), getScope());
        context.startActivity(intent);
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$2, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidFullscreenWebViewAdPlayer.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* synthetic */ class AnonymousClass2 extends kotlin.jvm.internal.AdaptedFunctionReference implements kotlin.jvm.functions.Function2<com.unity3d.ads.adplayer.DisplayMessage, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object>, kotlin.coroutines.jvm.internal.SuspendFunction {
        AnonymousClass2(java.lang.Object obj) {
            super(2, obj, com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.class, "displayEventsRouter", "displayEventsRouter(Lcom/unity3d/ads/adplayer/DisplayMessage;)Lkotlinx/coroutines/Job;", 12);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(com.unity3d.ads.adplayer.DisplayMessage displayMessage, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.show$displayEventsRouter((com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer) this.receiver, displayMessage, continuation);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ java.lang.Object show$displayEventsRouter(com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer, com.unity3d.ads.adplayer.DisplayMessage displayMessage, kotlin.coroutines.Continuation continuation) {
        androidFullscreenWebViewAdPlayer.displayEventsRouter(displayMessage);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$3, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidFullscreenWebViewAdPlayer.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* synthetic */ class AnonymousClass3 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function2<com.unity3d.ads.core.data.datasource.VolumeSettingsChange, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object>, kotlin.coroutines.jvm.internal.SuspendFunction {
        AnonymousClass3(java.lang.Object obj) {
            super(2, obj, com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.class, "handleVolumeSettingsChange", "handleVolumeSettingsChange(Lcom/unity3d/ads/core/data/datasource/VolumeSettingsChange;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(com.unity3d.ads.core.data.datasource.VolumeSettingsChange volumeSettingsChange, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer) this.receiver).handleVolumeSettingsChange(volumeSettingsChange, continuation);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$5, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidFullscreenWebViewAdPlayer.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", "Lcom/unity3d/ads/core/data/model/ShowEvent;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$5", f = "AndroidFullscreenWebViewAdPlayer.kt", i = {}, l = {72}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass5 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.unity3d.ads.core.data.model.ShowEvent, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int label;

        AnonymousClass5(kotlin.coroutines.Continuation<? super com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.AnonymousClass5> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.this.new AnonymousClass5(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(com.unity3d.ads.core.data.model.ShowEvent showEvent, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.AnonymousClass5) create(showEvent, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.this.destroy(this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$6, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidFullscreenWebViewAdPlayer.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* synthetic */ class AnonymousClass6 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function2<com.unity3d.ads.core.data.model.SessionChange, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object>, kotlin.coroutines.jvm.internal.SuspendFunction {
        AnonymousClass6(java.lang.Object obj) {
            super(2, obj, com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.class, "handleSessionChange", "handleSessionChange(Lcom/unity3d/ads/core/data/model/SessionChange;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(com.unity3d.ads.core.data.model.SessionChange sessionChange, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer) this.receiver).handleSessionChange(sessionChange, continuation);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object handleVolumeSettingsChange(com.unity3d.ads.core.data.datasource.VolumeSettingsChange volumeSettingsChange, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        if (volumeSettingsChange instanceof com.unity3d.ads.core.data.datasource.VolumeSettingsChange.MuteChange) {
            java.lang.Object objSendMuteChange = this.webViewAdPlayer.sendMuteChange(((com.unity3d.ads.core.data.datasource.VolumeSettingsChange.MuteChange) volumeSettingsChange).isMuted(), continuation);
            return objSendMuteChange == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSendMuteChange : kotlin.Unit.INSTANCE;
        }
        if (!(volumeSettingsChange instanceof com.unity3d.ads.core.data.datasource.VolumeSettingsChange.VolumeChange)) {
            return kotlin.Unit.INSTANCE;
        }
        java.lang.Object objSendVolumeChange = this.webViewAdPlayer.sendVolumeChange(((com.unity3d.ads.core.data.datasource.VolumeSettingsChange.VolumeChange) volumeSettingsChange).getVolume(), continuation);
        return objSendVolumeChange == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSendVolumeChange : kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object handleSessionChange(com.unity3d.ads.core.data.model.SessionChange sessionChange, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        if (sessionChange instanceof com.unity3d.ads.core.data.model.SessionChange.UserConsentChange) {
            com.unity3d.ads.adplayer.WebViewAdPlayer webViewAdPlayer = this.webViewAdPlayer;
            byte[] byteArray = ((com.unity3d.ads.core.data.model.SessionChange.UserConsentChange) sessionChange).getValue().toByteArray();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(byteArray, "change.value.toByteArray()");
            java.lang.Object objSendUserConsentChange = webViewAdPlayer.sendUserConsentChange(byteArray, continuation);
            return objSendUserConsentChange == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSendUserConsentChange : kotlin.Unit.INSTANCE;
        }
        if (!(sessionChange instanceof com.unity3d.ads.core.data.model.SessionChange.PrivacyFsmChange)) {
            return kotlin.Unit.INSTANCE;
        }
        com.unity3d.ads.adplayer.WebViewAdPlayer webViewAdPlayer2 = this.webViewAdPlayer;
        byte[] byteArray2 = ((com.unity3d.ads.core.data.model.SessionChange.PrivacyFsmChange) sessionChange).getValue().toByteArray();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(byteArray2, "change.value.toByteArray()");
        java.lang.Object objSendPrivacyFsmChange = webViewAdPlayer2.sendPrivacyFsmChange(byteArray2, continuation);
        return objSendPrivacyFsmChange == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSendPrivacyFsmChange : kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0094 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:0x00a0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // com.unity3d.ads.adplayer.AdPlayer
    public java.lang.Object destroy(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.AnonymousClass1 anonymousClass1;
        com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer;
        com.unity3d.ads.adplayer.AndroidWebViewContainer webViewContainer;
        if (continuation instanceof com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.AnonymousClass1) {
            anonymousClass1 = (com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.AnonymousClass1(continuation);
        }
        java.lang.Object obj = anonymousClass1.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.MutableSharedFlow<com.unity3d.ads.adplayer.DisplayMessage> mutableSharedFlow = displayMessages;
            com.unity3d.ads.adplayer.DisplayMessage.DisplayFinishRequest displayFinishRequest = new com.unity3d.ads.adplayer.DisplayMessage.DisplayFinishRequest(this.opportunityId);
            anonymousClass1.L$0 = this;
            anonymousClass1.label = 1;
            if (mutableSharedFlow.emit(displayFinishRequest, anonymousClass1) == coroutine_suspended) {
                return coroutine_suspended;
            }
            androidFullscreenWebViewAdPlayer = this;
        } else {
            if (i == 1) {
                androidFullscreenWebViewAdPlayer = (com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer) anonymousClass1.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
            } else if (i == 2) {
                androidFullscreenWebViewAdPlayer = (com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer) anonymousClass1.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                webViewContainer = androidFullscreenWebViewAdPlayer.getWebViewContainer();
                anonymousClass1.L$0 = androidFullscreenWebViewAdPlayer;
                anonymousClass1.label = 3;
                if (webViewContainer.destroy(anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                anonymousClass1.L$0 = null;
                anonymousClass1.label = 4;
                if (com.unity3d.ads.adplayer.AdPlayer.DefaultImpls.destroy(androidFullscreenWebViewAdPlayer, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i == 3) {
                androidFullscreenWebViewAdPlayer = (com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer) anonymousClass1.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                anonymousClass1.L$0 = null;
                anonymousClass1.label = 4;
                if (com.unity3d.ads.adplayer.AdPlayer.DefaultImpls.destroy(androidFullscreenWebViewAdPlayer, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 4) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            return kotlin.Unit.INSTANCE;
        }
        if (androidFullscreenWebViewAdPlayer.openMeasurementRepository.hasSessionFinished(com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toISO8859ByteString(androidFullscreenWebViewAdPlayer.opportunityId))) {
            anonymousClass1.L$0 = androidFullscreenWebViewAdPlayer;
            anonymousClass1.label = 2;
            if (kotlinx.coroutines.DelayKt.delay(1000L, anonymousClass1) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        webViewContainer = androidFullscreenWebViewAdPlayer.getWebViewContainer();
        anonymousClass1.L$0 = androidFullscreenWebViewAdPlayer;
        anonymousClass1.label = 3;
        if (webViewContainer.destroy(anonymousClass1) == coroutine_suspended) {
            return coroutine_suspended;
        }
        anonymousClass1.L$0 = null;
        anonymousClass1.label = 4;
        if (com.unity3d.ads.adplayer.AdPlayer.DefaultImpls.destroy(androidFullscreenWebViewAdPlayer, anonymousClass1) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$displayEventsRouter$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: AndroidFullscreenWebViewAdPlayer.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$displayEventsRouter$1", f = "AndroidFullscreenWebViewAdPlayer.kt", i = {}, l = {114, 115, 116, 117, 118, 120}, m = "invokeSuspend", n = {}, s = {})
    static final class C16081 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ com.unity3d.ads.adplayer.DisplayMessage $displayMessage;
        int label;
        final /* synthetic */ com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C16081(com.unity3d.ads.adplayer.DisplayMessage displayMessage, com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer, kotlin.coroutines.Continuation<? super com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.C16081> continuation) {
            super(2, continuation);
            this.$displayMessage = displayMessage;
            this.this$0 = androidFullscreenWebViewAdPlayer;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.C16081(this.$displayMessage, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.C16081) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.unity3d.ads.adplayer.DisplayMessage displayMessage = this.$displayMessage;
                    if (displayMessage instanceof com.unity3d.ads.adplayer.DisplayMessage.DisplayReady) {
                        this.label = 1;
                        if (this.this$0.webViewAdPlayer.requestShow(((com.unity3d.ads.adplayer.DisplayMessage.DisplayReady) this.$displayMessage).getShowOptions(), this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else if (displayMessage instanceof com.unity3d.ads.adplayer.DisplayMessage.WebViewInstanceRequest) {
                        this.label = 2;
                        if (com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.INSTANCE.getDisplayMessages().emit(new com.unity3d.ads.adplayer.DisplayMessage.WebViewInstanceResponse(this.$displayMessage.getOpportunityId(), this.this$0.getWebViewContainer().getWebView()), this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else if (displayMessage instanceof com.unity3d.ads.adplayer.DisplayMessage.VisibilityChanged) {
                        this.label = 3;
                        if (this.this$0.webViewAdPlayer.sendVisibilityChange(((com.unity3d.ads.adplayer.DisplayMessage.VisibilityChanged) this.$displayMessage).getIsVisible(), this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else if (displayMessage instanceof com.unity3d.ads.adplayer.DisplayMessage.FocusChanged) {
                        this.label = 4;
                        if (this.this$0.webViewAdPlayer.sendFocusChange(((com.unity3d.ads.adplayer.DisplayMessage.FocusChanged) this.$displayMessage).getIsFocused(), this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else if (displayMessage instanceof com.unity3d.ads.adplayer.DisplayMessage.DisplayDestroyed) {
                        this.label = 5;
                        if (this.this$0.webViewAdPlayer.sendActivityDestroyed(this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else if (displayMessage instanceof com.unity3d.ads.adplayer.DisplayMessage.DisplayError) {
                        this.label = 6;
                        if (this.this$0.destroy(this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    break;
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    kotlin.ResultKt.throwOnFailure(obj);
                    break;
                default:
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return kotlin.Unit.INSTANCE;
        }
    }

    private final kotlinx.coroutines.Job displayEventsRouter(com.unity3d.ads.adplayer.DisplayMessage displayMessage) {
        return kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(getScope(), null, null, new com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.C16081(displayMessage, this, null), 3, null);
    }

    /* JADX INFO: compiled from: AndroidFullscreenWebViewAdPlayer.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/unity3d/ads/adplayer/AndroidFullscreenWebViewAdPlayer$Companion;", "", "()V", "displayMessages", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/unity3d/ads/adplayer/DisplayMessage;", "getDisplayMessages", "()Lkotlinx/coroutines/flow/MutableSharedFlow;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final kotlinx.coroutines.flow.MutableSharedFlow<com.unity3d.ads.adplayer.DisplayMessage> getDisplayMessages() {
            return com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.displayMessages;
        }
    }
}
