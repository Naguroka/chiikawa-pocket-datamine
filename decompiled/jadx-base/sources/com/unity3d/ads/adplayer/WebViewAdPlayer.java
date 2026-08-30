package com.unity3d.ads.adplayer;

/* JADX INFO: compiled from: WebViewAdPlayer.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0006\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010\u0012J\b\u00102\u001a\u00020\u001eH\u0016J\u0019\u00103\u001a\u00020\u001e2\u0006\u00104\u001a\u00020-H\u0096@ø\u0001\u0000¢\u0006\u0002\u00105J\u0019\u00106\u001a\u00020\u001e2\u0006\u00107\u001a\u00020\u0018H\u0096@ø\u0001\u0000¢\u0006\u0002\u00108J)\u00109\u001a\u00020\u001e2\u0016\u0010:\u001a\u0012\u0012\u0004\u0012\u00020\u0018\u0012\u0006\u0012\u0004\u0018\u00010<\u0018\u00010;H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010=J\u0011\u0010>\u001a\u00020\u001eH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010?J\u001f\u0010@\u001a\u00020\u001e2\f\u0010A\u001a\b\u0012\u0004\u0012\u00020C0BH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010DJ\u0019\u0010E\u001a\u00020\u001e2\u0006\u0010F\u001a\u00020\u0015H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010GJ\u0019\u0010H\u001a\u00020\u001e2\u0006\u0010I\u001a\u00020\u0015H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010GJ\u0019\u0010J\u001a\u00020\u001e2\u0006\u00104\u001a\u00020-H\u0096@ø\u0001\u0000¢\u0006\u0002\u00105J\u0019\u0010K\u001a\u00020\u001e2\u0006\u00104\u001a\u00020-H\u0096@ø\u0001\u0000¢\u0006\u0002\u00105J\u0019\u0010L\u001a\u00020\u001e2\u0006\u0010M\u001a\u00020\u0015H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010GJ\u0019\u0010N\u001a\u00020\u001e2\u0006\u0010O\u001a\u00020PH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010QR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001cR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001cR\u0014\u0010#\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u000e\u0010&\u001a\u00020'X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010(\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u001e0)X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010+\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020.0,0\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001cR\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u00101\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006R"}, d2 = {"Lcom/unity3d/ads/adplayer/WebViewAdPlayer;", "Lcom/unity3d/ads/adplayer/AdPlayer;", "bridge", "Lcom/unity3d/ads/adplayer/WebViewBridge;", "deviceInfoRepository", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "executeAdViewerRequest", "Lcom/unity3d/ads/core/domain/ExecuteAdViewerRequest;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "webViewContainer", "Lcom/unity3d/ads/adplayer/WebViewContainer;", "adPlayerScope", "Lkotlinx/coroutines/CoroutineScope;", "(Lcom/unity3d/ads/adplayer/WebViewBridge;Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/domain/ExecuteAdViewerRequest;Lkotlinx/coroutines/CoroutineDispatcher;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;Lcom/unity3d/ads/adplayer/WebViewContainer;Lkotlinx/coroutines/CoroutineScope;)V", "isCompletedManually", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "onBroadcastEvents", "Lkotlinx/coroutines/flow/Flow;", "", "onLoadEvent", "Lcom/unity3d/ads/adplayer/model/LoadEvent;", "getOnLoadEvent", "()Lkotlinx/coroutines/flow/Flow;", "onRequestEvents", "", "getOnRequestEvents", "onShowEvent", "Lcom/unity3d/ads/core/data/model/ShowEvent;", "getOnShowEvent", "scope", "getScope", "()Lkotlinx/coroutines/CoroutineScope;", "scopeCancellationHandler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "storageEventCallback", "Lkotlin/Function1;", "Lcom/unity3d/services/core/device/StorageEventInfo;", "updateCampaignState", "Lkotlin/Pair;", "", "", "getUpdateCampaignState", "getWebViewContainer", "()Lcom/unity3d/ads/adplayer/WebViewContainer;", "dispatchShowCompleted", "onAllowedPiiChange", "value", "([BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onBroadcastEvent", androidx.core.app.NotificationCompat.CATEGORY_EVENT, "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestShow", "unityAdsShowOptions", "", "", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendActivityDestroyed", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendEvent", "getEvent", "Lkotlin/Function0;", "Lcom/unity3d/ads/adplayer/model/WebViewEvent;", "(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendFocusChange", "isFocused", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendMuteChange", "isMuted", "sendPrivacyFsmChange", "sendUserConsentChange", "sendVisibilityChange", com.json.pg.k, "sendVolumeChange", "volume", "", "(DLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class WebViewAdPlayer implements com.unity3d.ads.adplayer.AdPlayer {
    private final com.unity3d.ads.adplayer.WebViewBridge bridge;
    private final com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository;
    private final kotlinx.coroutines.CoroutineDispatcher dispatcher;
    private final com.unity3d.ads.core.domain.ExecuteAdViewerRequest executeAdViewerRequest;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> isCompletedManually;
    private final kotlinx.coroutines.flow.Flow<java.lang.String> onBroadcastEvents;
    private final kotlinx.coroutines.flow.Flow<com.unity3d.ads.adplayer.model.LoadEvent> onLoadEvent;
    private final kotlinx.coroutines.flow.Flow<kotlin.Unit> onRequestEvents;
    private final kotlinx.coroutines.flow.Flow<com.unity3d.ads.core.data.model.ShowEvent> onShowEvent;
    private final kotlinx.coroutines.CoroutineScope scope;
    private final kotlinx.coroutines.CoroutineExceptionHandler scopeCancellationHandler;
    private final com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent;
    private final com.unity3d.ads.core.data.repository.SessionRepository sessionRepository;
    private final kotlin.jvm.functions.Function1<com.unity3d.services.core.device.StorageEventInfo, kotlin.Unit> storageEventCallback;
    private final kotlinx.coroutines.flow.Flow<kotlin.Pair<byte[], java.lang.Integer>> updateCampaignState;
    private final com.unity3d.ads.adplayer.WebViewContainer webViewContainer;

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$requestShow$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: WebViewAdPlayer.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.adplayer.WebViewAdPlayer", f = "WebViewAdPlayer.kt", i = {0, 0, 0, 1, 1, 1}, l = {213, 214, 229}, m = "requestShow", n = {"this", "unityAdsShowOptions", "it", "this", "unityAdsShowOptions", "it"}, s = {"L$0", "L$1", "L$3", "L$0", "L$1", "L$3"})
    static final class C16251 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        java.lang.Object L$3;
        java.lang.Object L$4;
        java.lang.Object L$5;
        int label;
        /* synthetic */ java.lang.Object result;

        C16251(kotlin.coroutines.Continuation<? super com.unity3d.ads.adplayer.WebViewAdPlayer.C16251> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return com.unity3d.ads.adplayer.WebViewAdPlayer.this.requestShow(null, this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$sendEvent$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: WebViewAdPlayer.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.adplayer.WebViewAdPlayer", f = "WebViewAdPlayer.kt", i = {0, 0}, l = {241, 255}, m = "sendEvent", n = {"this", "getEvent"}, s = {"L$0", "L$1"})
    static final class C16271 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        int label;
        /* synthetic */ java.lang.Object result;

        C16271(kotlin.coroutines.Continuation<? super com.unity3d.ads.adplayer.WebViewAdPlayer.C16271> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return com.unity3d.ads.adplayer.WebViewAdPlayer.this.sendEvent(null, this);
        }
    }

    public WebViewAdPlayer(com.unity3d.ads.adplayer.WebViewBridge bridge, com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository, com.unity3d.ads.core.data.repository.SessionRepository sessionRepository, com.unity3d.ads.core.domain.ExecuteAdViewerRequest executeAdViewerRequest, kotlinx.coroutines.CoroutineDispatcher dispatcher, com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent, com.unity3d.ads.adplayer.WebViewContainer webViewContainer, kotlinx.coroutines.CoroutineScope adPlayerScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bridge, "bridge");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceInfoRepository, "deviceInfoRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executeAdViewerRequest, "executeAdViewerRequest");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webViewContainer, "webViewContainer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adPlayerScope, "adPlayerScope");
        this.bridge = bridge;
        this.deviceInfoRepository = deviceInfoRepository;
        this.sessionRepository = sessionRepository;
        this.executeAdViewerRequest = executeAdViewerRequest;
        this.dispatcher = dispatcher;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.webViewContainer = webViewContainer;
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(false);
        this.isCompletedManually = MutableStateFlow;
        kotlin.jvm.functions.Function1<com.unity3d.services.core.device.StorageEventInfo, kotlin.Unit> function1 = new kotlin.jvm.functions.Function1<com.unity3d.services.core.device.StorageEventInfo, kotlin.Unit>() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$storageEventCallback$1
            {
                super(1);
            }

            /* JADX INFO: renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$storageEventCallback$1$1, reason: invalid class name */
            /* JADX INFO: compiled from: WebViewAdPlayer.kt */
            @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$storageEventCallback$1$1", f = "WebViewAdPlayer.kt", i = {}, l = {72}, m = "invokeSuspend", n = {}, s = {})
            static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                final /* synthetic */ com.unity3d.services.core.device.StorageEventInfo $it;
                int label;
                final /* synthetic */ com.unity3d.ads.adplayer.WebViewAdPlayer this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(com.unity3d.ads.adplayer.WebViewAdPlayer webViewAdPlayer, com.unity3d.services.core.device.StorageEventInfo storageEventInfo, kotlin.coroutines.Continuation<? super com.unity3d.ads.adplayer.WebViewAdPlayer$storageEventCallback$1.AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = webViewAdPlayer;
                    this.$it = storageEventInfo;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                    return new com.unity3d.ads.adplayer.WebViewAdPlayer$storageEventCallback$1.AnonymousClass1(this.this$0, this.$it, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                    return ((com.unity3d.ads.adplayer.WebViewAdPlayer$storageEventCallback$1.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        this.label = 1;
                        if (this.this$0.bridge.sendEvent(new com.unity3d.ads.adplayer.model.OnStorageEvent(this.$it.getEventType(), this.$it.getStorageType(), this.$it.getValue()), this) == coroutine_suspended) {
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

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(com.unity3d.services.core.device.StorageEventInfo storageEventInfo) {
                invoke2(storageEventInfo);
                return kotlin.Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(com.unity3d.services.core.device.StorageEventInfo it) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.this$0.getScope(), null, null, new com.unity3d.ads.adplayer.WebViewAdPlayer$storageEventCallback$1.AnonymousClass1(this.this$0, it, null), 3, null);
            }
        };
        this.storageEventCallback = function1;
        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$CoroutineExceptionHandler$1 webViewAdPlayer$special$$inlined$CoroutineExceptionHandler$1 = new com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$CoroutineExceptionHandler$1(kotlinx.coroutines.CoroutineExceptionHandler.INSTANCE, this);
        this.scopeCancellationHandler = webViewAdPlayer$special$$inlined$CoroutineExceptionHandler$1;
        this.scope = kotlinx.coroutines.CoroutineScopeKt.plus(kotlinx.coroutines.CoroutineScopeKt.plus(kotlinx.coroutines.CoroutineScopeKt.plus(adPlayerScope, dispatcher), new kotlinx.coroutines.CoroutineName("WebViewAdPlayer")), webViewAdPlayer$special$$inlined$CoroutineExceptionHandler$1);
        final kotlinx.coroutines.flow.SharedFlow<com.unity3d.ads.adplayer.Invocation> onInvocation = bridge.getOnInvocation();
        final kotlinx.coroutines.flow.Flow<com.unity3d.ads.adplayer.Invocation> flow = new kotlinx.coroutines.flow.Flow<com.unity3d.ads.adplayer.Invocation>() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$1
            @Override // kotlinx.coroutines.flow.Flow
            public java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super com.unity3d.ads.adplayer.Invocation> flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object objCollect = onInvocation.collect(new com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$1.AnonymousClass2(flowCollector), continuation);
                return objCollect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : kotlin.Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: Emitters.kt */
            @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 8, 0}, xi = 48)
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector $this_unsafeFlow;

                /* JADX INFO: renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$1$2$1, reason: invalid class name */
                /* JADX INFO: compiled from: Emitters.kt */
                @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$1$2", f = "WebViewAdPlayer.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
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
                        return com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$1.AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0014  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    if (continuation instanceof com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label -= Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1(continuation);
                    }
                    java.lang.Object obj2 = anonymousClass1.result;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = anonymousClass1.label;
                    if (i == 0) {
                        kotlin.ResultKt.throwOnFailure(obj2);
                        kotlinx.coroutines.flow.FlowCollector flowCollector = this.$this_unsafeFlow;
                        if (kotlin.collections.ArraysKt.contains(com.unity3d.ads.adplayer.WebViewAdPlayerKt.SHOW_EVENTS, ((com.unity3d.ads.adplayer.Invocation) obj).getLocation())) {
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
        };
        this.onShowEvent = kotlinx.coroutines.flow.FlowKt.flowCombine(new kotlinx.coroutines.flow.Flow<com.unity3d.ads.core.data.model.ShowEvent>() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super com.unity3d.ads.core.data.model.ShowEvent> flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object objCollect = flow.collect(new com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$1.AnonymousClass2(flowCollector), continuation);
                return objCollect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : kotlin.Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: Emitters.kt */
            @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 8, 0}, xi = 48)
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector $this_unsafeFlow;

                /* JADX INFO: renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$1$2$1, reason: invalid class name */
                /* JADX INFO: compiled from: Emitters.kt */
                @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$1$2", f = "WebViewAdPlayer.kt", i = {0}, l = {244, 223}, m = "emit", n = {androidx.core.app.NotificationCompat.CATEGORY_EVENT}, s = {"L$1"})
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
                        return com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$1.AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Code duplicated, block: B:50:0x0106 A[RETURN] */
                /* JADX WARN: Code duplicated, block: B:51:0x0107  */
                /* JADX WARN: Code duplicated, block: B:7:0x0014  */
                /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    kotlinx.coroutines.flow.FlowCollector flowCollector;
                    com.unity3d.ads.core.data.model.ShowEvent.CancelTimeout completed;
                    com.unity3d.ads.core.data.model.ShowEvent showEvent;
                    if (continuation instanceof com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label -= Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$1.AnonymousClass2.AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$1.AnonymousClass2.AnonymousClass1(continuation);
                    }
                    java.lang.Object obj2 = anonymousClass1.result;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = anonymousClass1.label;
                    if (i != 0) {
                        if (i == 1) {
                            showEvent = (com.unity3d.ads.core.data.model.ShowEvent) anonymousClass1.L$1;
                            flowCollector = (kotlinx.coroutines.flow.FlowCollector) anonymousClass1.L$0;
                            kotlin.ResultKt.throwOnFailure(obj2);
                        } else {
                            if (i != 2) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.ResultKt.throwOnFailure(obj2);
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                    kotlin.ResultKt.throwOnFailure(obj2);
                    flowCollector = this.$this_unsafeFlow;
                    com.unity3d.ads.adplayer.Invocation invocation = (com.unity3d.ads.adplayer.Invocation) obj;
                    java.lang.String location = invocation.getLocation();
                    switch (location.hashCode()) {
                        case -1250843874:
                            if (location.equals(com.unity3d.ads.adplayer.ExposedFunctionLocation.CANCEL_SHOW_TIMEOUT)) {
                                completed = com.unity3d.ads.core.data.model.ShowEvent.CancelTimeout.INSTANCE;
                                anonymousClass1.L$0 = flowCollector;
                                anonymousClass1.L$1 = completed;
                                anonymousClass1.label = 1;
                                if (com.unity3d.ads.adplayer.Invocation.handle$default(invocation, null, anonymousClass1, 1, null) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                showEvent = completed;
                                break;
                            }
                            throw new java.lang.IllegalStateException("Unexpected location: " + invocation.getLocation());
                        case -928612193:
                            if (location.equals(com.unity3d.ads.adplayer.ExposedFunctionLocation.COMPLETED)) {
                                java.lang.Object objFirst = kotlin.collections.ArraysKt.first(invocation.getParameters());
                                java.lang.String str = objFirst instanceof java.lang.String ? (java.lang.String) objFirst : null;
                                completed = new com.unity3d.ads.core.data.model.ShowEvent.Completed(kotlin.jvm.internal.Intrinsics.areEqual(str, "COMPLETED") ? com.unity3d.ads.adplayer.model.ShowStatus.COMPLETED : kotlin.jvm.internal.Intrinsics.areEqual(str, "SKIPPED") ? com.unity3d.ads.adplayer.model.ShowStatus.SKIPPED : com.unity3d.ads.adplayer.model.ShowStatus.ERROR);
                                anonymousClass1.L$0 = flowCollector;
                                anonymousClass1.L$1 = completed;
                                anonymousClass1.label = 1;
                                if (com.unity3d.ads.adplayer.Invocation.handle$default(invocation, null, anonymousClass1, 1, null) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                showEvent = completed;
                                break;
                            }
                            throw new java.lang.IllegalStateException("Unexpected location: " + invocation.getLocation());
                        case -707523043:
                            if (location.equals(com.unity3d.ads.adplayer.ExposedFunctionLocation.LEFT_APPLICATION)) {
                                completed = com.unity3d.ads.core.data.model.ShowEvent.LeftApplication.INSTANCE;
                                anonymousClass1.L$0 = flowCollector;
                                anonymousClass1.L$1 = completed;
                                anonymousClass1.label = 1;
                                if (com.unity3d.ads.adplayer.Invocation.handle$default(invocation, null, anonymousClass1, 1, null) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                showEvent = completed;
                                break;
                            }
                            throw new java.lang.IllegalStateException("Unexpected location: " + invocation.getLocation());
                        case -497639557:
                            if (location.equals(com.unity3d.ads.adplayer.ExposedFunctionLocation.CLICKED)) {
                                completed = com.unity3d.ads.core.data.model.ShowEvent.Clicked.INSTANCE;
                                anonymousClass1.L$0 = flowCollector;
                                anonymousClass1.L$1 = completed;
                                anonymousClass1.label = 1;
                                if (com.unity3d.ads.adplayer.Invocation.handle$default(invocation, null, anonymousClass1, 1, null) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                showEvent = completed;
                                break;
                            }
                            throw new java.lang.IllegalStateException("Unexpected location: " + invocation.getLocation());
                        case 1039618005:
                            if (location.equals(com.unity3d.ads.adplayer.ExposedFunctionLocation.STARTED)) {
                                completed = com.unity3d.ads.core.data.model.ShowEvent.Started.INSTANCE;
                                anonymousClass1.L$0 = flowCollector;
                                anonymousClass1.L$1 = completed;
                                anonymousClass1.label = 1;
                                if (com.unity3d.ads.adplayer.Invocation.handle$default(invocation, null, anonymousClass1, 1, null) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                showEvent = completed;
                                break;
                            }
                            throw new java.lang.IllegalStateException("Unexpected location: " + invocation.getLocation());
                        case 1306610281:
                            if (location.equals(com.unity3d.ads.adplayer.ExposedFunctionLocation.FAILED)) {
                                java.lang.Object objFirst2 = kotlin.collections.ArraysKt.first(invocation.getParameters());
                                kotlin.jvm.internal.Intrinsics.checkNotNull(objFirst2, "null cannot be cast to non-null type org.json.JSONObject");
                                org.json.JSONObject jSONObject = (org.json.JSONObject) objFirst2;
                                int iOptInt = jSONObject.optInt("code");
                                java.lang.String errorMessage = jSONObject.optString(com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE);
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(errorMessage, "errorMessage");
                                completed = new com.unity3d.ads.core.data.model.ShowEvent.Error(errorMessage, iOptInt, "adviewer");
                                anonymousClass1.L$0 = flowCollector;
                                anonymousClass1.L$1 = completed;
                                anonymousClass1.label = 1;
                                if (com.unity3d.ads.adplayer.Invocation.handle$default(invocation, null, anonymousClass1, 1, null) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                showEvent = completed;
                                break;
                            }
                            throw new java.lang.IllegalStateException("Unexpected location: " + invocation.getLocation());
                        default:
                            throw new java.lang.IllegalStateException("Unexpected location: " + invocation.getLocation());
                    }
                    anonymousClass1.L$0 = null;
                    anonymousClass1.L$1 = null;
                    anonymousClass1.label = 2;
                    if (flowCollector.emit(showEvent, anonymousClass1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }
        }, MutableStateFlow, new com.unity3d.ads.adplayer.WebViewAdPlayer$onShowEvent$3(null));
        final kotlinx.coroutines.flow.SharedFlow<com.unity3d.ads.adplayer.Invocation> onInvocation2 = bridge.getOnInvocation();
        final kotlinx.coroutines.flow.Flow<com.unity3d.ads.adplayer.Invocation> flow2 = new kotlinx.coroutines.flow.Flow<com.unity3d.ads.adplayer.Invocation>() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$2
            @Override // kotlinx.coroutines.flow.Flow
            public java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super com.unity3d.ads.adplayer.Invocation> flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object objCollect = onInvocation2.collect(new com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$2.AnonymousClass2(flowCollector), continuation);
                return objCollect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : kotlin.Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$2$2, reason: invalid class name */
            /* JADX INFO: compiled from: Emitters.kt */
            @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 8, 0}, xi = 48)
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector $this_unsafeFlow;

                /* JADX INFO: renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$2$2$1, reason: invalid class name */
                /* JADX INFO: compiled from: Emitters.kt */
                @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$2$2", f = "WebViewAdPlayer.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
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
                        return com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$2.AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0014  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$2.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    if (continuation instanceof com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$2.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$2.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label -= Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$2.AnonymousClass2.AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$2.AnonymousClass2.AnonymousClass1(continuation);
                    }
                    java.lang.Object obj2 = anonymousClass1.result;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = anonymousClass1.label;
                    if (i == 0) {
                        kotlin.ResultKt.throwOnFailure(obj2);
                        kotlinx.coroutines.flow.FlowCollector flowCollector = this.$this_unsafeFlow;
                        if (kotlin.collections.ArraysKt.contains(com.unity3d.ads.adplayer.WebViewAdPlayerKt.LOAD_EVENTS, ((com.unity3d.ads.adplayer.Invocation) obj).getLocation())) {
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
        };
        this.onLoadEvent = kotlinx.coroutines.flow.FlowKt.take(kotlinx.coroutines.flow.FlowKt.shareIn(new kotlinx.coroutines.flow.Flow<com.unity3d.ads.adplayer.model.LoadEvent>() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$2
            @Override // kotlinx.coroutines.flow.Flow
            public java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super com.unity3d.ads.adplayer.model.LoadEvent> flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object objCollect = flow2.collect(new com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$2.AnonymousClass2(flowCollector), continuation);
                return objCollect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : kotlin.Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$2$2, reason: invalid class name */
            /* JADX INFO: compiled from: Emitters.kt */
            @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 8, 0}, xi = 48)
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector $this_unsafeFlow;

                /* JADX INFO: renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$2$2$1, reason: invalid class name */
                /* JADX INFO: compiled from: Emitters.kt */
                @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$2$2", f = "WebViewAdPlayer.kt", i = {0}, l = {224, 223}, m = "emit", n = {"it"}, s = {"L$1"})
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
                        return com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$2.AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0014  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$2.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    kotlinx.coroutines.flow.FlowCollector flowCollector;
                    com.unity3d.ads.adplayer.Invocation invocation;
                    com.unity3d.ads.adplayer.model.LoadEvent error;
                    if (continuation instanceof com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$2.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$2.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label -= Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$2.AnonymousClass2.AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$2.AnonymousClass2.AnonymousClass1(continuation);
                    }
                    java.lang.Object obj2 = anonymousClass1.result;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = anonymousClass1.label;
                    if (i != 0) {
                        if (i == 1) {
                            invocation = (com.unity3d.ads.adplayer.Invocation) anonymousClass1.L$1;
                            flowCollector = (kotlinx.coroutines.flow.FlowCollector) anonymousClass1.L$0;
                            kotlin.ResultKt.throwOnFailure(obj2);
                        } else {
                            if (i != 2) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.ResultKt.throwOnFailure(obj2);
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                    kotlin.ResultKt.throwOnFailure(obj2);
                    flowCollector = this.$this_unsafeFlow;
                    invocation = (com.unity3d.ads.adplayer.Invocation) obj;
                    anonymousClass1.L$0 = flowCollector;
                    anonymousClass1.L$1 = invocation;
                    anonymousClass1.label = 1;
                    if (com.unity3d.ads.adplayer.Invocation.handle$default(invocation, null, anonymousClass1, 1, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    if (kotlin.jvm.internal.Intrinsics.areEqual(invocation.getLocation(), com.unity3d.ads.adplayer.ExposedFunctionLocation.LOAD_ERROR)) {
                        java.lang.Object objFirst = kotlin.collections.ArraysKt.first(invocation.getParameters());
                        kotlin.jvm.internal.Intrinsics.checkNotNull(objFirst, "null cannot be cast to non-null type org.json.JSONObject");
                        org.json.JSONObject jSONObject = (org.json.JSONObject) objFirst;
                        int iOptInt = jSONObject.optInt("code");
                        java.lang.String errorMessage = jSONObject.optString(com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(errorMessage, "errorMessage");
                        error = new com.unity3d.ads.adplayer.model.LoadEvent.Error(errorMessage, iOptInt);
                    } else {
                        error = com.unity3d.ads.adplayer.model.LoadEvent.Completed.INSTANCE;
                    }
                    anonymousClass1.L$0 = null;
                    anonymousClass1.L$1 = null;
                    anonymousClass1.label = 2;
                    if (flowCollector.emit(error, anonymousClass1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }
        }, getScope(), kotlinx.coroutines.flow.SharingStarted.INSTANCE.getEagerly(), 1), 1);
        final kotlinx.coroutines.flow.SharedFlow<com.unity3d.ads.adplayer.Invocation> onInvocation3 = bridge.getOnInvocation();
        final kotlinx.coroutines.flow.Flow<com.unity3d.ads.adplayer.Invocation> flow3 = new kotlinx.coroutines.flow.Flow<com.unity3d.ads.adplayer.Invocation>() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$3
            @Override // kotlinx.coroutines.flow.Flow
            public java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super com.unity3d.ads.adplayer.Invocation> flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object objCollect = onInvocation3.collect(new com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$3.AnonymousClass2(flowCollector), continuation);
                return objCollect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : kotlin.Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$3$2, reason: invalid class name */
            /* JADX INFO: compiled from: Emitters.kt */
            @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 8, 0}, xi = 48)
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector $this_unsafeFlow;

                /* JADX INFO: renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$3$2$1, reason: invalid class name */
                /* JADX INFO: compiled from: Emitters.kt */
                @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$3$2", f = "WebViewAdPlayer.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
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
                        return com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$3.AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0014  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$3.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    if (continuation instanceof com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$3.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$3.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label -= Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$3.AnonymousClass2.AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$3.AnonymousClass2.AnonymousClass1(continuation);
                    }
                    java.lang.Object obj2 = anonymousClass1.result;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = anonymousClass1.label;
                    if (i == 0) {
                        kotlin.ResultKt.throwOnFailure(obj2);
                        kotlinx.coroutines.flow.FlowCollector flowCollector = this.$this_unsafeFlow;
                        if (kotlin.jvm.internal.Intrinsics.areEqual(((com.unity3d.ads.adplayer.Invocation) obj).getLocation(), com.unity3d.ads.adplayer.ExposedFunctionLocation.UPDATE_CAMPAIGN_STATE)) {
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
        };
        this.updateCampaignState = (kotlinx.coroutines.flow.Flow) new kotlinx.coroutines.flow.Flow<kotlin.Pair<? extends byte[], ? extends java.lang.Integer>>() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$3
            @Override // kotlinx.coroutines.flow.Flow
            public java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super kotlin.Pair<? extends byte[], ? extends java.lang.Integer>> flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object objCollect = flow3.collect(new com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$3.AnonymousClass2(flowCollector), continuation);
                return objCollect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : kotlin.Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$3$2, reason: invalid class name */
            /* JADX INFO: compiled from: Emitters.kt */
            @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 8, 0}, xi = 48)
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector $this_unsafeFlow;

                /* JADX INFO: renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$3$2$1, reason: invalid class name */
                /* JADX INFO: compiled from: Emitters.kt */
                @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$3$2", f = "WebViewAdPlayer.kt", i = {0}, l = {224, 223}, m = "emit", n = {"it"}, s = {"L$1"})
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
                        return com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$3.AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0014  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$3.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    kotlinx.coroutines.flow.FlowCollector flowCollector;
                    com.unity3d.ads.adplayer.Invocation invocation;
                    if (continuation instanceof com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$3.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$3.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label -= Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$3.AnonymousClass2.AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$3.AnonymousClass2.AnonymousClass1(continuation);
                    }
                    java.lang.Object obj2 = anonymousClass1.result;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = anonymousClass1.label;
                    if (i != 0) {
                        if (i == 1) {
                            invocation = (com.unity3d.ads.adplayer.Invocation) anonymousClass1.L$1;
                            flowCollector = (kotlinx.coroutines.flow.FlowCollector) anonymousClass1.L$0;
                            kotlin.ResultKt.throwOnFailure(obj2);
                        } else {
                            if (i != 2) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.ResultKt.throwOnFailure(obj2);
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                    kotlin.ResultKt.throwOnFailure(obj2);
                    flowCollector = this.$this_unsafeFlow;
                    invocation = (com.unity3d.ads.adplayer.Invocation) obj;
                    anonymousClass1.L$0 = flowCollector;
                    anonymousClass1.L$1 = invocation;
                    anonymousClass1.label = 1;
                    if (com.unity3d.ads.adplayer.Invocation.handle$default(invocation, null, anonymousClass1, 1, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    java.lang.Object objFirst = kotlin.collections.ArraysKt.first(invocation.getParameters());
                    kotlin.jvm.internal.Intrinsics.checkNotNull(objFirst, "null cannot be cast to non-null type org.json.JSONObject");
                    org.json.JSONObject jSONObject = (org.json.JSONObject) objFirst;
                    java.lang.String data = jSONObject.optString("data");
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(data, "data");
                    byte[] bytes = data.getBytes(kotlin.text.Charsets.ISO_8859_1);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                    kotlin.Pair pair = kotlin.TuplesKt.to(bytes, kotlin.coroutines.jvm.internal.Boxing.boxInt(jSONObject.optInt("dataVersion")));
                    anonymousClass1.L$0 = null;
                    anonymousClass1.L$1 = null;
                    anonymousClass1.label = 2;
                    if (flowCollector.emit(pair, anonymousClass1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }
        };
        final kotlinx.coroutines.flow.SharedFlow<com.unity3d.ads.adplayer.Invocation> onInvocation4 = bridge.getOnInvocation();
        final kotlinx.coroutines.flow.Flow<com.unity3d.ads.adplayer.Invocation> flow4 = new kotlinx.coroutines.flow.Flow<com.unity3d.ads.adplayer.Invocation>() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$4
            @Override // kotlinx.coroutines.flow.Flow
            public java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super com.unity3d.ads.adplayer.Invocation> flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object objCollect = onInvocation4.collect(new com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$4.AnonymousClass2(flowCollector), continuation);
                return objCollect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : kotlin.Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$4$2, reason: invalid class name */
            /* JADX INFO: compiled from: Emitters.kt */
            @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 8, 0}, xi = 48)
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector $this_unsafeFlow;

                /* JADX INFO: renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$4$2$1, reason: invalid class name */
                /* JADX INFO: compiled from: Emitters.kt */
                @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$4$2", f = "WebViewAdPlayer.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
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
                        return com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$4.AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0014  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$4.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    if (continuation instanceof com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$4.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$4.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label -= Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$4.AnonymousClass2.AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$4.AnonymousClass2.AnonymousClass1(continuation);
                    }
                    java.lang.Object obj2 = anonymousClass1.result;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = anonymousClass1.label;
                    if (i == 0) {
                        kotlin.ResultKt.throwOnFailure(obj2);
                        kotlinx.coroutines.flow.FlowCollector flowCollector = this.$this_unsafeFlow;
                        if (kotlin.jvm.internal.Intrinsics.areEqual(((com.unity3d.ads.adplayer.Invocation) obj).getLocation(), com.unity3d.ads.adplayer.ExposedFunctionLocation.BROADCAST_EVENT)) {
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
        };
        kotlinx.coroutines.flow.Flow<java.lang.String> flow5 = new kotlinx.coroutines.flow.Flow<java.lang.String>() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$4
            @Override // kotlinx.coroutines.flow.Flow
            public java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super java.lang.String> flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object objCollect = flow4.collect(new com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$4.AnonymousClass2(flowCollector), continuation);
                return objCollect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : kotlin.Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$4$2, reason: invalid class name */
            /* JADX INFO: compiled from: Emitters.kt */
            @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 8, 0}, xi = 48)
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector $this_unsafeFlow;

                /* JADX INFO: renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$4$2$1, reason: invalid class name */
                /* JADX INFO: compiled from: Emitters.kt */
                @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$4$2", f = "WebViewAdPlayer.kt", i = {0}, l = {224, 223}, m = "emit", n = {"it"}, s = {"L$1"})
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
                        return com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$4.AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0014  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$4.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    kotlinx.coroutines.flow.FlowCollector flowCollector;
                    com.unity3d.ads.adplayer.Invocation invocation;
                    if (continuation instanceof com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$4.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$4.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label -= Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$4.AnonymousClass2.AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$4.AnonymousClass2.AnonymousClass1(continuation);
                    }
                    java.lang.Object obj2 = anonymousClass1.result;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = anonymousClass1.label;
                    if (i != 0) {
                        if (i == 1) {
                            invocation = (com.unity3d.ads.adplayer.Invocation) anonymousClass1.L$1;
                            flowCollector = (kotlinx.coroutines.flow.FlowCollector) anonymousClass1.L$0;
                            kotlin.ResultKt.throwOnFailure(obj2);
                        } else {
                            if (i != 2) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.ResultKt.throwOnFailure(obj2);
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                    kotlin.ResultKt.throwOnFailure(obj2);
                    flowCollector = this.$this_unsafeFlow;
                    invocation = (com.unity3d.ads.adplayer.Invocation) obj;
                    anonymousClass1.L$0 = flowCollector;
                    anonymousClass1.L$1 = invocation;
                    anonymousClass1.label = 1;
                    if (com.unity3d.ads.adplayer.Invocation.handle$default(invocation, null, anonymousClass1, 1, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    java.lang.String string = kotlin.collections.ArraysKt.first(invocation.getParameters()).toString();
                    anonymousClass1.L$0 = null;
                    anonymousClass1.L$1 = null;
                    anonymousClass1.label = 2;
                    if (flowCollector.emit(string, anonymousClass1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }
        };
        this.onBroadcastEvents = flow5;
        final kotlinx.coroutines.flow.SharedFlow<com.unity3d.ads.adplayer.Invocation> onInvocation5 = bridge.getOnInvocation();
        final kotlinx.coroutines.flow.Flow<com.unity3d.ads.adplayer.Invocation> flow6 = new kotlinx.coroutines.flow.Flow<com.unity3d.ads.adplayer.Invocation>() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$5
            @Override // kotlinx.coroutines.flow.Flow
            public java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super com.unity3d.ads.adplayer.Invocation> flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object objCollect = onInvocation5.collect(new com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$5.AnonymousClass2(flowCollector), continuation);
                return objCollect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : kotlin.Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$5$2, reason: invalid class name */
            /* JADX INFO: compiled from: Emitters.kt */
            @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 8, 0}, xi = 48)
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector $this_unsafeFlow;

                /* JADX INFO: renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$5$2$1, reason: invalid class name */
                /* JADX INFO: compiled from: Emitters.kt */
                @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$5$2", f = "WebViewAdPlayer.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
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
                        return com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$5.AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0014  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$5.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    if (continuation instanceof com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$5.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$5.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label -= Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$5.AnonymousClass2.AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$5.AnonymousClass2.AnonymousClass1(continuation);
                    }
                    java.lang.Object obj2 = anonymousClass1.result;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = anonymousClass1.label;
                    if (i == 0) {
                        kotlin.ResultKt.throwOnFailure(obj2);
                        kotlinx.coroutines.flow.FlowCollector flowCollector = this.$this_unsafeFlow;
                        if (kotlin.collections.ArraysKt.contains(com.unity3d.ads.adplayer.WebViewAdPlayerKt.REQUEST_EVENTS, ((com.unity3d.ads.adplayer.Invocation) obj).getLocation())) {
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
        };
        kotlinx.coroutines.flow.Flow<kotlin.Unit> flow7 = new kotlinx.coroutines.flow.Flow<kotlin.Unit>() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$5
            @Override // kotlinx.coroutines.flow.Flow
            public java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super kotlin.Unit> flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object objCollect = flow6.collect(new com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$5.AnonymousClass2(flowCollector, this), continuation);
                return objCollect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : kotlin.Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$5$2, reason: invalid class name */
            /* JADX INFO: compiled from: Emitters.kt */
            @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 8, 0}, xi = 48)
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector $this_unsafeFlow;
                final /* synthetic */ com.unity3d.ads.adplayer.WebViewAdPlayer this$0;

                /* JADX INFO: renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$5$2$1, reason: invalid class name */
                /* JADX INFO: compiled from: Emitters.kt */
                @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$5$2", f = "WebViewAdPlayer.kt", i = {0, 0, 1, 1, 1, 2, 2, 2}, l = {224, 237, 250, 253, 223}, m = "emit", n = {"this", "it", "this", "url", "id", "this", "url", "id"}, s = {"L$0", "L$2", "L$0", "L$2", "L$3", "L$0", "L$2", "L$3"})
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    java.lang.Object L$0;
                    java.lang.Object L$1;
                    java.lang.Object L$2;
                    java.lang.Object L$3;
                    int label;
                    /* synthetic */ java.lang.Object result;

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$5.AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector, com.unity3d.ads.adplayer.WebViewAdPlayer webViewAdPlayer) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = webViewAdPlayer;
                }

                /* JADX WARN: Code duplicated, block: B:49:0x0115 A[RETURN] */
                /* JADX WARN: Code duplicated, block: B:50:0x0116  */
                /* JADX WARN: Code duplicated, block: B:53:0x0123 A[Catch: Exception -> 0x0079, TryCatch #1 {Exception -> 0x0079, blocks: (B:20:0x005f, B:23:0x0074, B:51:0x0119, B:53:0x0123, B:58:0x0136, B:54:0x0126, B:56:0x012a), top: B:81:0x002c }] */
                /* JADX WARN: Code duplicated, block: B:54:0x0126 A[Catch: Exception -> 0x0079, TryCatch #1 {Exception -> 0x0079, blocks: (B:20:0x005f, B:23:0x0074, B:51:0x0119, B:53:0x0123, B:58:0x0136, B:54:0x0126, B:56:0x012a), top: B:81:0x002c }] */
                /* JADX WARN: Code duplicated, block: B:56:0x012a A[Catch: Exception -> 0x0079, TryCatch #1 {Exception -> 0x0079, blocks: (B:20:0x005f, B:23:0x0074, B:51:0x0119, B:53:0x0123, B:58:0x0136, B:54:0x0126, B:56:0x012a), top: B:81:0x002c }] */
                /* JADX WARN: Code duplicated, block: B:57:0x0135  */
                /* JADX WARN: Code duplicated, block: B:60:0x0178 A[RETURN] */
                /* JADX WARN: Code duplicated, block: B:74:0x01c7 A[RETURN] */
                /* JADX WARN: Code duplicated, block: B:7:0x0018  */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r4v0, types: [int] */
                /* JADX WARN: Type inference failed for: r4v1 */
                /* JADX WARN: Type inference failed for: r4v9 */
                /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object[], java.lang.String[]] */
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$5.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    java.lang.Object obj2;
                    kotlinx.coroutines.flow.FlowCollector flowCollector;
                    kotlinx.coroutines.flow.FlowCollector flowCollector2;
                    kotlin.Unit unit;
                    kotlinx.coroutines.flow.FlowCollector flowCollector3;
                    com.unity3d.ads.adplayer.Invocation invocation;
                    com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$5.AnonymousClass2<T> anonymousClass2;
                    com.unity3d.services.core.network.model.RequestType requestType;
                    java.lang.String str;
                    java.lang.String str2;
                    java.lang.Object body;
                    java.lang.String str3;
                    com.unity3d.ads.adplayer.WebViewBridge webViewBridge;
                    com.unity3d.ads.adplayer.model.OnWebRequestComplete onWebRequestComplete;
                    if (continuation instanceof com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$5.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$5.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label -= Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$5.AnonymousClass2.AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$5.AnonymousClass2.AnonymousClass1(continuation);
                    }
                    java.lang.Object objInvoke = anonymousClass1.result;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    ?? r4 = anonymousClass1.label;
                    try {
                        if (r4 != 0) {
                            if (r4 == 1) {
                                invocation = (com.unity3d.ads.adplayer.Invocation) anonymousClass1.L$2;
                                flowCollector3 = (kotlinx.coroutines.flow.FlowCollector) anonymousClass1.L$1;
                                com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$5.AnonymousClass2<T> anonymousClass3 = (com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$5.AnonymousClass2) anonymousClass1.L$0;
                                kotlin.ResultKt.throwOnFailure(objInvoke);
                                anonymousClass2 = anonymousClass3;
                            } else if (r4 == 2) {
                                str = (java.lang.String) anonymousClass1.L$3;
                                str2 = (java.lang.String) anonymousClass1.L$2;
                                flowCollector2 = (kotlinx.coroutines.flow.FlowCollector) anonymousClass1.L$1;
                                anonymousClass2 = (com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$5.AnonymousClass2) anonymousClass1.L$0;
                                kotlin.ResultKt.throwOnFailure(objInvoke);
                                com.unity3d.services.core.network.model.HttpResponse httpResponse = (com.unity3d.services.core.network.model.HttpResponse) objInvoke;
                                body = httpResponse.getBody();
                                if (body instanceof java.lang.String) {
                                    str3 = (java.lang.String) body;
                                } else if (body instanceof byte[]) {
                                    str3 = new java.lang.String((byte[]) body, kotlin.text.Charsets.UTF_8);
                                } else {
                                    str3 = null;
                                }
                                java.util.List listListOf = kotlin.collections.CollectionsKt.listOf(str, httpResponse.getUrlString(), str3, kotlin.coroutines.jvm.internal.Boxing.boxInt(httpResponse.getStatusCode()), com.unity3d.services.core.network.mapper.HttpResponseHeaderToJSONArrayKt.toResponseHeadersMap(httpResponse.getHeaders()));
                                webViewBridge = anonymousClass2.this$0.bridge;
                                onWebRequestComplete = new com.unity3d.ads.adplayer.model.OnWebRequestComplete(listListOf);
                                anonymousClass1.L$0 = anonymousClass2;
                                anonymousClass1.L$1 = flowCollector2;
                                anonymousClass1.L$2 = str2;
                                anonymousClass1.L$3 = str;
                                anonymousClass1.label = 3;
                                if (webViewBridge.sendEvent(onWebRequestComplete, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                obj2 = null;
                                unit = kotlin.Unit.INSTANCE;
                                anonymousClass1.L$0 = obj2;
                                anonymousClass1.L$1 = obj2;
                                anonymousClass1.L$2 = obj2;
                                anonymousClass1.L$3 = obj2;
                                anonymousClass1.label = 5;
                                if (flowCollector2.emit(unit, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else if (r4 == 3) {
                                flowCollector2 = (kotlinx.coroutines.flow.FlowCollector) anonymousClass1.L$1;
                                kotlin.ResultKt.throwOnFailure(objInvoke);
                                obj2 = null;
                                unit = kotlin.Unit.INSTANCE;
                                anonymousClass1.L$0 = obj2;
                                anonymousClass1.L$1 = obj2;
                                anonymousClass1.L$2 = obj2;
                                anonymousClass1.L$3 = obj2;
                                anonymousClass1.label = 5;
                                if (flowCollector2.emit(unit, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else if (r4 == 4) {
                                flowCollector = (kotlinx.coroutines.flow.FlowCollector) anonymousClass1.L$0;
                                kotlin.ResultKt.throwOnFailure(objInvoke);
                                obj2 = null;
                                flowCollector2 = flowCollector;
                                unit = kotlin.Unit.INSTANCE;
                                anonymousClass1.L$0 = obj2;
                                anonymousClass1.L$1 = obj2;
                                anonymousClass1.L$2 = obj2;
                                anonymousClass1.L$3 = obj2;
                                anonymousClass1.label = 5;
                                if (flowCollector2.emit(unit, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (r4 != 5) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                kotlin.ResultKt.throwOnFailure(objInvoke);
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                        kotlin.ResultKt.throwOnFailure(objInvoke);
                        flowCollector3 = this.$this_unsafeFlow;
                        invocation = (com.unity3d.ads.adplayer.Invocation) obj;
                        anonymousClass1.L$0 = this;
                        anonymousClass1.L$1 = flowCollector3;
                        anonymousClass1.L$2 = invocation;
                        anonymousClass1.label = 1;
                        if (com.unity3d.ads.adplayer.Invocation.handle$default(invocation, null, anonymousClass1, 1, null) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        anonymousClass2 = this;
                        java.lang.Object objFirst = kotlin.collections.ArraysKt.first(invocation.getParameters());
                        kotlin.jvm.internal.Intrinsics.checkNotNull(objFirst, "null cannot be cast to non-null type kotlin.String");
                        java.lang.String str4 = (java.lang.String) objFirst;
                        java.lang.String str5 = (java.lang.String) kotlin.collections.ArraysKt.getOrNull(invocation.getParameters(), 1);
                        java.lang.String location = invocation.getLocation();
                        int iHashCode = location.hashCode();
                        if (iHashCode == -934922905) {
                            if (location.equals(com.unity3d.ads.adplayer.ExposedFunctionLocation.REQUEST_HEAD)) {
                                requestType = com.unity3d.services.core.network.model.RequestType.HEAD;
                                com.unity3d.ads.core.domain.ExecuteAdViewerRequest executeAdViewerRequest = anonymousClass2.this$0.executeAdViewerRequest;
                                java.lang.Object[] parameters = invocation.getParameters();
                                anonymousClass1.L$0 = anonymousClass2;
                                anonymousClass1.L$1 = flowCollector3;
                                anonymousClass1.L$2 = str5;
                                anonymousClass1.L$3 = str4;
                                anonymousClass1.label = 2;
                                objInvoke = executeAdViewerRequest.invoke(requestType, parameters, anonymousClass1);
                                if (objInvoke == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                str = str4;
                                flowCollector2 = flowCollector3;
                                str2 = str5;
                                com.unity3d.services.core.network.model.HttpResponse httpResponse2 = (com.unity3d.services.core.network.model.HttpResponse) objInvoke;
                                body = httpResponse2.getBody();
                                if (body instanceof java.lang.String) {
                                    str3 = (java.lang.String) body;
                                } else if (body instanceof byte[]) {
                                    str3 = new java.lang.String((byte[]) body, kotlin.text.Charsets.UTF_8);
                                } else {
                                    str3 = null;
                                }
                                java.util.List listListOf2 = kotlin.collections.CollectionsKt.listOf(str, httpResponse2.getUrlString(), str3, kotlin.coroutines.jvm.internal.Boxing.boxInt(httpResponse2.getStatusCode()), com.unity3d.services.core.network.mapper.HttpResponseHeaderToJSONArrayKt.toResponseHeadersMap(httpResponse2.getHeaders()));
                                webViewBridge = anonymousClass2.this$0.bridge;
                                onWebRequestComplete = new com.unity3d.ads.adplayer.model.OnWebRequestComplete(listListOf2);
                                anonymousClass1.L$0 = anonymousClass2;
                                anonymousClass1.L$1 = flowCollector2;
                                anonymousClass1.L$2 = str2;
                                anonymousClass1.L$3 = str;
                                anonymousClass1.label = 3;
                                if (webViewBridge.sendEvent(onWebRequestComplete, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                obj2 = null;
                            }
                            throw new java.lang.IllegalStateException("Unexpected location: " + invocation.getLocation());
                        }
                        if (iHashCode == -934674393) {
                            if (location.equals(com.unity3d.ads.adplayer.ExposedFunctionLocation.REQUEST_POST)) {
                                requestType = com.unity3d.services.core.network.model.RequestType.POST;
                                com.unity3d.ads.core.domain.ExecuteAdViewerRequest executeAdViewerRequest2 = anonymousClass2.this$0.executeAdViewerRequest;
                                java.lang.Object[] parameters2 = invocation.getParameters();
                                anonymousClass1.L$0 = anonymousClass2;
                                anonymousClass1.L$1 = flowCollector3;
                                anonymousClass1.L$2 = str5;
                                anonymousClass1.L$3 = str4;
                                anonymousClass1.label = 2;
                                objInvoke = executeAdViewerRequest2.invoke(requestType, parameters2, anonymousClass1);
                                if (objInvoke == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                str = str4;
                                flowCollector2 = flowCollector3;
                                str2 = str5;
                                com.unity3d.services.core.network.model.HttpResponse httpResponse3 = (com.unity3d.services.core.network.model.HttpResponse) objInvoke;
                                body = httpResponse3.getBody();
                                if (body instanceof java.lang.String) {
                                    str3 = (java.lang.String) body;
                                } else if (body instanceof byte[]) {
                                    str3 = new java.lang.String((byte[]) body, kotlin.text.Charsets.UTF_8);
                                } else {
                                    str3 = null;
                                }
                                java.util.List listListOf3 = kotlin.collections.CollectionsKt.listOf(str, httpResponse3.getUrlString(), str3, kotlin.coroutines.jvm.internal.Boxing.boxInt(httpResponse3.getStatusCode()), com.unity3d.services.core.network.mapper.HttpResponseHeaderToJSONArrayKt.toResponseHeadersMap(httpResponse3.getHeaders()));
                                webViewBridge = anonymousClass2.this$0.bridge;
                                onWebRequestComplete = new com.unity3d.ads.adplayer.model.OnWebRequestComplete(listListOf3);
                                anonymousClass1.L$0 = anonymousClass2;
                                anonymousClass1.L$1 = flowCollector2;
                                anonymousClass1.L$2 = str2;
                                anonymousClass1.L$3 = str;
                                anonymousClass1.label = 3;
                                if (webViewBridge.sendEvent(onWebRequestComplete, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                obj2 = null;
                            }
                            throw new java.lang.IllegalStateException("Unexpected location: " + invocation.getLocation());
                        }
                        if (iHashCode == -445801745 && location.equals(com.unity3d.ads.adplayer.ExposedFunctionLocation.REQUEST_GET)) {
                            requestType = com.unity3d.services.core.network.model.RequestType.GET;
                            try {
                                com.unity3d.ads.core.domain.ExecuteAdViewerRequest executeAdViewerRequest3 = anonymousClass2.this$0.executeAdViewerRequest;
                                java.lang.Object[] parameters3 = invocation.getParameters();
                                anonymousClass1.L$0 = anonymousClass2;
                                anonymousClass1.L$1 = flowCollector3;
                                anonymousClass1.L$2 = str5;
                                anonymousClass1.L$3 = str4;
                                anonymousClass1.label = 2;
                                objInvoke = executeAdViewerRequest3.invoke(requestType, parameters3, anonymousClass1);
                                if (objInvoke == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                str = str4;
                                flowCollector2 = flowCollector3;
                                str2 = str5;
                                com.unity3d.services.core.network.model.HttpResponse httpResponse4 = (com.unity3d.services.core.network.model.HttpResponse) objInvoke;
                                body = httpResponse4.getBody();
                                if (body instanceof java.lang.String) {
                                    str3 = (java.lang.String) body;
                                } else if (body instanceof byte[]) {
                                    str3 = new java.lang.String((byte[]) body, kotlin.text.Charsets.UTF_8);
                                } else {
                                    str3 = null;
                                }
                                java.util.List listListOf4 = kotlin.collections.CollectionsKt.listOf(str, httpResponse4.getUrlString(), str3, kotlin.coroutines.jvm.internal.Boxing.boxInt(httpResponse4.getStatusCode()), com.unity3d.services.core.network.mapper.HttpResponseHeaderToJSONArrayKt.toResponseHeadersMap(httpResponse4.getHeaders()));
                                webViewBridge = anonymousClass2.this$0.bridge;
                                onWebRequestComplete = new com.unity3d.ads.adplayer.model.OnWebRequestComplete(listListOf4);
                                anonymousClass1.L$0 = anonymousClass2;
                                anonymousClass1.L$1 = flowCollector2;
                                anonymousClass1.L$2 = str2;
                                anonymousClass1.L$3 = str;
                                anonymousClass1.label = 3;
                                if (webViewBridge.sendEvent(onWebRequestComplete, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                obj2 = null;
                            } catch (java.lang.Exception e) {
                                e = e;
                                r4 = str4;
                                kotlinx.coroutines.flow.FlowCollector flowCollector4 = flowCollector3;
                                ?? r7 = new java.lang.String[3];
                                r7[0] = r4;
                                r7[1] = str5;
                                java.lang.String message = e.getMessage();
                                if (message == null) {
                                    message = "";
                                }
                                r7[2] = message;
                                java.util.List listListOf5 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) r7);
                                com.unity3d.ads.adplayer.WebViewBridge webViewBridge2 = anonymousClass2.this$0.bridge;
                                com.unity3d.ads.adplayer.model.OnWebRequestFailed onWebRequestFailed = new com.unity3d.ads.adplayer.model.OnWebRequestFailed(listListOf5);
                                anonymousClass1.L$0 = flowCollector4;
                                obj2 = null;
                                anonymousClass1.L$1 = null;
                                anonymousClass1.L$2 = null;
                                anonymousClass1.L$3 = null;
                                anonymousClass1.label = 4;
                                if (webViewBridge2.sendEvent(onWebRequestFailed, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                flowCollector = flowCollector4;
                                flowCollector2 = flowCollector;
                            }
                        }
                        throw new java.lang.IllegalStateException("Unexpected location: " + invocation.getLocation());
                    } catch (java.lang.Exception e2) {
                        e = e2;
                    }
                    unit = kotlin.Unit.INSTANCE;
                    anonymousClass1.L$0 = obj2;
                    anonymousClass1.L$1 = obj2;
                    anonymousClass1.L$2 = obj2;
                    anonymousClass1.L$3 = obj2;
                    anonymousClass1.label = 5;
                    if (flowCollector2.emit(unit, anonymousClass1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }
        };
        this.onRequestEvents = flow7;
        com.unity3d.services.core.device.Storage.INSTANCE.addStorageEventCallback(function1);
        kotlinx.coroutines.flow.FlowKt.launchIn(kotlinx.coroutines.flow.FlowKt.onEach(flow5, new com.unity3d.ads.adplayer.WebViewAdPlayer.AnonymousClass1(com.unity3d.ads.adplayer.AdPlayer.INSTANCE.getBroadcastEventChannel())), getScope());
        kotlinx.coroutines.flow.FlowKt.launchIn(flow7, getScope());
        kotlinx.coroutines.flow.FlowKt.launchIn(kotlinx.coroutines.flow.FlowKt.onEach(com.unity3d.ads.adplayer.AdPlayer.INSTANCE.getBroadcastEventChannel(), new com.unity3d.ads.adplayer.WebViewAdPlayer.AnonymousClass2(this)), getScope());
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public java.lang.Object destroy(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return com.unity3d.ads.adplayer.AdPlayer.DefaultImpls.destroy(this, continuation);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public void show(com.unity3d.ads.adplayer.ShowOptions showOptions) {
        com.unity3d.ads.adplayer.AdPlayer.DefaultImpls.show(this, showOptions);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public com.unity3d.ads.adplayer.WebViewContainer getWebViewContainer() {
        return this.webViewContainer;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public kotlinx.coroutines.CoroutineScope getScope() {
        return this.scope;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public kotlinx.coroutines.flow.Flow<com.unity3d.ads.core.data.model.ShowEvent> getOnShowEvent() {
        return this.onShowEvent;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public kotlinx.coroutines.flow.Flow<com.unity3d.ads.adplayer.model.LoadEvent> getOnLoadEvent() {
        return this.onLoadEvent;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public kotlinx.coroutines.flow.Flow<kotlin.Pair<byte[], java.lang.Integer>> getUpdateCampaignState() {
        return this.updateCampaignState;
    }

    public final kotlinx.coroutines.flow.Flow<kotlin.Unit> getOnRequestEvents() {
        return this.onRequestEvents;
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$1, reason: invalid class name */
    /* JADX INFO: compiled from: WebViewAdPlayer.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* synthetic */ class AnonymousClass1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function2<java.lang.String, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object>, kotlin.coroutines.jvm.internal.SuspendFunction {
        AnonymousClass1(java.lang.Object obj) {
            super(2, obj, kotlinx.coroutines.flow.MutableSharedFlow.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.String str, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((kotlinx.coroutines.flow.MutableSharedFlow) this.receiver).emit(str, continuation);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$2, reason: invalid class name */
    /* JADX INFO: compiled from: WebViewAdPlayer.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* synthetic */ class AnonymousClass2 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function2<java.lang.String, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object>, kotlin.coroutines.jvm.internal.SuspendFunction {
        AnonymousClass2(java.lang.Object obj) {
            super(2, obj, com.unity3d.ads.adplayer.WebViewAdPlayer.class, "onBroadcastEvent", "onBroadcastEvent(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.String str, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.unity3d.ads.adplayer.WebViewAdPlayer) this.receiver).onBroadcastEvent(str, continuation);
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0127  */
    /* JADX WARN: Code duplicated, block: B:35:0x013c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0162  */
    /* JADX WARN: Code duplicated, block: B:43:0x018a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:47:0x014f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x0136 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // com.unity3d.ads.adplayer.AdPlayer
    public java.lang.Object requestShow(java.util.Map<java.lang.String, ? extends java.lang.Object> map, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) throws org.json.JSONException {
        com.unity3d.ads.adplayer.WebViewAdPlayer.C16251 c16251;
        org.json.JSONObject jSONObject;
        java.lang.String str;
        com.unity3d.ads.adplayer.WebViewAdPlayer webViewAdPlayer;
        java.util.Map<java.lang.String, ? extends java.lang.Object> map2;
        org.json.JSONObject jSONObject2;
        org.json.JSONObject jSONObject3;
        org.json.JSONObject jSONObject4;
        org.json.JSONObject jSONObject5;
        java.util.Map<java.lang.String, ? extends java.lang.Object> map3;
        com.unity3d.ads.adplayer.WebViewAdPlayer webViewAdPlayer2;
        java.lang.String str2;
        org.json.JSONObject jSONObject6;
        com.unity3d.ads.adplayer.WebViewBridge webViewBridge;
        java.lang.Object[] objArr;
        java.util.LinkedHashMap linkedHashMap;
        if (continuation instanceof com.unity3d.ads.adplayer.WebViewAdPlayer.C16251) {
            c16251 = (com.unity3d.ads.adplayer.WebViewAdPlayer.C16251) continuation;
            if ((c16251.label & Integer.MIN_VALUE) != 0) {
                c16251.label -= Integer.MIN_VALUE;
            } else {
                c16251 = new com.unity3d.ads.adplayer.WebViewAdPlayer.C16251(continuation);
            }
        } else {
            c16251 = new com.unity3d.ads.adplayer.WebViewAdPlayer.C16251(continuation);
        }
        java.lang.Object privacy = c16251.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c16251.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(privacy);
            gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo = this.deviceInfoRepository.getDynamicDeviceInfo();
            jSONObject = new org.json.JSONObject();
            jSONObject.put("orientation", this.deviceInfoRepository.getOrientation());
            jSONObject.put(com.ironsource.y8.i.t, this.deviceInfoRepository.getConnectionTypeStr());
            jSONObject.put("isMuted", this.deviceInfoRepository.getRingerMode() != 2);
            jSONObject.put("volume", dynamicDeviceInfo.getAndroid().getVolume());
            com.unity3d.ads.core.data.repository.SessionRepository sessionRepository = this.sessionRepository;
            c16251.L$0 = this;
            c16251.L$1 = map;
            c16251.L$2 = jSONObject;
            c16251.L$3 = jSONObject;
            str = "privacy";
            c16251.L$4 = "privacy";
            c16251.L$5 = jSONObject;
            c16251.label = 1;
            privacy = sessionRepository.getPrivacy(c16251);
            if (privacy == coroutine_suspended) {
                return coroutine_suspended;
            }
            webViewAdPlayer = this;
            map2 = map;
            jSONObject2 = jSONObject;
            jSONObject3 = jSONObject2;
        } else {
            if (i == 1) {
                jSONObject2 = (org.json.JSONObject) c16251.L$5;
                java.lang.String str3 = (java.lang.String) c16251.L$4;
                org.json.JSONObject jSONObject7 = (org.json.JSONObject) c16251.L$3;
                jSONObject3 = (org.json.JSONObject) c16251.L$2;
                map2 = (java.util.Map) c16251.L$1;
                webViewAdPlayer = (com.unity3d.ads.adplayer.WebViewAdPlayer) c16251.L$0;
                kotlin.ResultKt.throwOnFailure(privacy);
                str = str3;
                jSONObject = jSONObject7;
            } else if (i == 2) {
                jSONObject6 = (org.json.JSONObject) c16251.L$5;
                str2 = (java.lang.String) c16251.L$4;
                jSONObject4 = (org.json.JSONObject) c16251.L$3;
                jSONObject5 = (org.json.JSONObject) c16251.L$2;
                map3 = (java.util.Map) c16251.L$1;
                webViewAdPlayer2 = (com.unity3d.ads.adplayer.WebViewAdPlayer) c16251.L$0;
                kotlin.ResultKt.throwOnFailure(privacy);
                jSONObject6.put(str2, com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toBase64$default((com.google.protobuf.ByteString) privacy, false, 1, null));
                com.google.protobuf.ByteString byteString = webViewAdPlayer2.deviceInfoRepository.getAllowedPii().getValue().toByteString();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(byteString, "deviceInfoRepository.all…dPii.value.toByteString()");
                jSONObject4.put("allowedPii", com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toBase64$default(byteString, false, 1, null));
                if (map3 != null) {
                    linkedHashMap = new java.util.LinkedHashMap();
                    for (java.util.Map.Entry<java.lang.String, ? extends java.lang.Object> entry : map3.entrySet()) {
                        if (!kotlin.jvm.internal.Intrinsics.areEqual(entry.getKey(), "objectId")) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    if (!linkedHashMap.isEmpty()) {
                        jSONObject4.put("showOptions", new org.json.JSONObject(linkedHashMap));
                    }
                }
                webViewBridge = webViewAdPlayer2.bridge;
                objArr = new java.lang.Object[]{jSONObject5};
                c16251.L$0 = null;
                c16251.L$1 = null;
                c16251.L$2 = null;
                c16251.L$3 = null;
                c16251.L$4 = null;
                c16251.L$5 = null;
                c16251.label = 3;
                if (webViewBridge.request(com.ironsource.y8.h.K, com.json.j5.v, objArr, c16251) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(privacy);
            }
            return kotlin.Unit.INSTANCE;
        }
        jSONObject2.put(str, com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toBase64$default((com.google.protobuf.ByteString) privacy, false, 1, null));
        com.unity3d.ads.core.data.repository.SessionRepository sessionRepository2 = webViewAdPlayer.sessionRepository;
        c16251.L$0 = webViewAdPlayer;
        c16251.L$1 = map2;
        c16251.L$2 = jSONObject3;
        c16251.L$3 = jSONObject;
        c16251.L$4 = "privacyFsm";
        c16251.L$5 = jSONObject;
        c16251.label = 2;
        java.lang.Object privacyFsm = sessionRepository2.getPrivacyFsm(c16251);
        if (privacyFsm == coroutine_suspended) {
            return coroutine_suspended;
        }
        jSONObject4 = jSONObject;
        jSONObject5 = jSONObject3;
        map3 = map2;
        webViewAdPlayer2 = webViewAdPlayer;
        str2 = "privacyFsm";
        privacy = privacyFsm;
        jSONObject6 = jSONObject4;
        jSONObject6.put(str2, com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toBase64$default((com.google.protobuf.ByteString) privacy, false, 1, null));
        com.google.protobuf.ByteString byteString2 = webViewAdPlayer2.deviceInfoRepository.getAllowedPii().getValue().toByteString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(byteString2, "deviceInfoRepository.all…dPii.value.toByteString()");
        jSONObject4.put("allowedPii", com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toBase64$default(byteString2, false, 1, null));
        if (map3 != null) {
            linkedHashMap = new java.util.LinkedHashMap();
            while (r15.hasNext()) {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(entry.getKey(), "objectId")) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            if (!linkedHashMap.isEmpty()) {
                jSONObject4.put("showOptions", new org.json.JSONObject(linkedHashMap));
            }
        }
        webViewBridge = webViewAdPlayer2.bridge;
        objArr = new java.lang.Object[]{jSONObject5};
        c16251.L$0 = null;
        c16251.L$1 = null;
        c16251.L$2 = null;
        c16251.L$3 = null;
        c16251.L$4 = null;
        c16251.L$5 = null;
        c16251.label = 3;
        if (webViewBridge.request(com.ironsource.y8.h.K, com.json.j5.v, objArr, c16251) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public void dispatchShowCompleted() {
        this.isCompletedManually.setValue(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    public final java.lang.Object sendEvent(kotlin.jvm.functions.Function0<? extends com.unity3d.ads.adplayer.model.WebViewEvent> function0, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.unity3d.ads.adplayer.WebViewAdPlayer.C16271 c16271;
        kotlin.jvm.functions.Function0<? extends com.unity3d.ads.adplayer.model.WebViewEvent> function1;
        com.unity3d.ads.adplayer.WebViewAdPlayer webViewAdPlayer;
        if (continuation instanceof com.unity3d.ads.adplayer.WebViewAdPlayer.C16271) {
            c16271 = (com.unity3d.ads.adplayer.WebViewAdPlayer.C16271) continuation;
            if ((c16271.label & Integer.MIN_VALUE) != 0) {
                c16271.label -= Integer.MIN_VALUE;
            } else {
                c16271 = new com.unity3d.ads.adplayer.WebViewAdPlayer.C16271(continuation);
            }
        } else {
            c16271 = new com.unity3d.ads.adplayer.WebViewAdPlayer.C16271(continuation);
        }
        java.lang.Object objSingle = c16271.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c16271.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(objSingle);
            kotlinx.coroutines.flow.Flow<com.unity3d.ads.adplayer.model.LoadEvent> onLoadEvent = getOnLoadEvent();
            c16271.L$0 = this;
            function1 = function0;
            c16271.L$1 = function1;
            c16271.label = 1;
            objSingle = kotlinx.coroutines.flow.FlowKt.single(onLoadEvent, c16271);
            if (objSingle == coroutine_suspended) {
                return coroutine_suspended;
            }
            webViewAdPlayer = this;
        } else {
            if (i == 1) {
                function1 = (kotlin.jvm.functions.Function0) c16271.L$1;
                webViewAdPlayer = (com.unity3d.ads.adplayer.WebViewAdPlayer) c16271.L$0;
                kotlin.ResultKt.throwOnFailure(objSingle);
            } else {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(objSingle);
            }
            return kotlin.Unit.INSTANCE;
        }
        com.unity3d.ads.adplayer.model.LoadEvent loadEvent = (com.unity3d.ads.adplayer.model.LoadEvent) objSingle;
        if (loadEvent instanceof com.unity3d.ads.adplayer.model.LoadEvent.Error) {
            com.unity3d.ads.adplayer.model.LoadEvent.Error error = (com.unity3d.ads.adplayer.model.LoadEvent.Error) loadEvent;
            com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(webViewAdPlayer.sendDiagnosticEvent, "bridge_send_event_failed", null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("reason", "adviewer"), kotlin.TuplesKt.to("reason_debug", error.getMessage()), kotlin.TuplesKt.to("reason_code", java.lang.String.valueOf(error.getErrorCode()))), null, null, 26, null);
            return kotlin.Unit.INSTANCE;
        }
        com.unity3d.ads.adplayer.model.WebViewEvent webViewEventInvoke = function1.invoke();
        com.unity3d.ads.adplayer.WebViewBridge webViewBridge = webViewAdPlayer.bridge;
        c16271.L$0 = null;
        c16271.L$1 = null;
        c16271.label = 2;
        if (webViewBridge.sendEvent(webViewEventInvoke, c16271) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public java.lang.Object sendMuteChange(final boolean z, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object objSendEvent = sendEvent(new kotlin.jvm.functions.Function0<com.unity3d.ads.adplayer.model.WebViewEvent>() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer.sendMuteChange.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.adplayer.model.WebViewEvent invoke() {
                return new com.unity3d.ads.adplayer.model.OnMuteChangeEvent(z);
            }
        }, continuation);
        return objSendEvent == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSendEvent : kotlin.Unit.INSTANCE;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public java.lang.Object sendVisibilityChange(final boolean z, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object objSendEvent = sendEvent(new kotlin.jvm.functions.Function0<com.unity3d.ads.adplayer.model.WebViewEvent>() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer.sendVisibilityChange.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.adplayer.model.WebViewEvent invoke() {
                return new com.unity3d.ads.adplayer.model.OnVisibilityChangeEvent(z);
            }
        }, continuation);
        return objSendEvent == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSendEvent : kotlin.Unit.INSTANCE;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public java.lang.Object sendFocusChange(final boolean z, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object objSendEvent = sendEvent(new kotlin.jvm.functions.Function0<com.unity3d.ads.adplayer.model.WebViewEvent>() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer.sendFocusChange.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.adplayer.model.WebViewEvent invoke() {
                return new com.unity3d.ads.adplayer.model.OnFocusChangeEvent(z);
            }
        }, continuation);
        return objSendEvent == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSendEvent : kotlin.Unit.INSTANCE;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public java.lang.Object sendActivityDestroyed(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object objSendEvent = sendEvent(new kotlin.jvm.functions.Function0<com.unity3d.ads.adplayer.model.WebViewEvent>() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer.sendActivityDestroyed.2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.adplayer.model.WebViewEvent invoke() {
                return new com.unity3d.ads.adplayer.model.OnActivityDestroyedEvent();
            }
        }, continuation);
        return objSendEvent == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSendEvent : kotlin.Unit.INSTANCE;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public java.lang.Object sendVolumeChange(final double d, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object objSendEvent = sendEvent(new kotlin.jvm.functions.Function0<com.unity3d.ads.adplayer.model.WebViewEvent>() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer.sendVolumeChange.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.adplayer.model.WebViewEvent invoke() {
                return new com.unity3d.ads.adplayer.model.OnVolumeChangeEvent(d);
            }
        }, continuation);
        return objSendEvent == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSendEvent : kotlin.Unit.INSTANCE;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public java.lang.Object sendUserConsentChange(final byte[] bArr, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object objSendEvent = sendEvent(new kotlin.jvm.functions.Function0<com.unity3d.ads.adplayer.model.WebViewEvent>() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer.sendUserConsentChange.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.adplayer.model.WebViewEvent invoke() {
                java.lang.String strEncodeToString = android.util.Base64.encodeToString(bArr, 2);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strEncodeToString, "encodeToString(value, Base64.NO_WRAP)");
                return new com.unity3d.ads.adplayer.model.OnUserConsentChangeEvent(strEncodeToString);
            }
        }, continuation);
        return objSendEvent == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSendEvent : kotlin.Unit.INSTANCE;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public java.lang.Object sendPrivacyFsmChange(final byte[] bArr, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object objSendEvent = sendEvent(new kotlin.jvm.functions.Function0<com.unity3d.ads.adplayer.model.WebViewEvent>() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer.sendPrivacyFsmChange.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.adplayer.model.WebViewEvent invoke() {
                java.lang.String strEncodeToString = android.util.Base64.encodeToString(bArr, 2);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strEncodeToString, "encodeToString(value, Base64.NO_WRAP)");
                return new com.unity3d.ads.adplayer.model.OnPrivacyFsmChangeEvent(strEncodeToString);
            }
        }, continuation);
        return objSendEvent == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSendEvent : kotlin.Unit.INSTANCE;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public java.lang.Object onBroadcastEvent(final java.lang.String str, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object objSendEvent = sendEvent(new kotlin.jvm.functions.Function0<com.unity3d.ads.adplayer.model.WebViewEvent>() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer.onBroadcastEvent.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.adplayer.model.WebViewEvent invoke() throws org.json.JSONException {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                java.lang.String eventType = jSONObject.getString("eventType");
                java.lang.String strOptString = jSONObject.optString("data");
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(eventType, "eventType");
                return new com.unity3d.ads.adplayer.model.OnBroadcastEvent(eventType, strOptString);
            }
        }, continuation);
        return objSendEvent == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSendEvent : kotlin.Unit.INSTANCE;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public java.lang.Object onAllowedPiiChange(final byte[] bArr, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object objSendEvent = sendEvent(new kotlin.jvm.functions.Function0<com.unity3d.ads.adplayer.model.WebViewEvent>() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer.onAllowedPiiChange.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.adplayer.model.WebViewEvent invoke() {
                java.lang.String strEncodeToString = android.util.Base64.encodeToString(bArr, 2);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strEncodeToString, "encodeToString(value, Base64.NO_WRAP)");
                return new com.unity3d.ads.adplayer.model.OnAllowedPiiChangeEvent(strEncodeToString);
            }
        }, continuation);
        return objSendEvent == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSendEvent : kotlin.Unit.INSTANCE;
    }
}
