package com.unity3d.ads.adplayer;

/* JADX INFO: compiled from: AndroidEmbeddableWebViewAdPlayer.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0011\u0010\u001f\u001a\u00020 H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010!J\t\u0010\"\u001a\u00020 H\u0096\u0001J\u0019\u0010#\u001a\u00020 2\u0006\u0010$\u001a\u00020\u001aH\u0096Aø\u0001\u0000¢\u0006\u0002\u0010%J\u0019\u0010&\u001a\u00020 2\u0006\u0010'\u001a\u00020\u0006H\u0096Aø\u0001\u0000¢\u0006\u0002\u0010(J)\u0010)\u001a\u00020 2\u0016\u0010*\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010,\u0018\u00010+H\u0096Aø\u0001\u0000¢\u0006\u0002\u0010-J\u0011\u0010.\u001a\u00020 H\u0096Aø\u0001\u0000¢\u0006\u0002\u0010!J\u0019\u0010/\u001a\u00020 2\u0006\u00100\u001a\u000201H\u0096Aø\u0001\u0000¢\u0006\u0002\u00102J\u0019\u00103\u001a\u00020 2\u0006\u00104\u001a\u000201H\u0096Aø\u0001\u0000¢\u0006\u0002\u00102J\u0019\u00105\u001a\u00020 2\u0006\u0010$\u001a\u00020\u001aH\u0096Aø\u0001\u0000¢\u0006\u0002\u0010%J\u0019\u00106\u001a\u00020 2\u0006\u0010$\u001a\u00020\u001aH\u0096Aø\u0001\u0000¢\u0006\u0002\u0010%J\u0019\u00107\u001a\u00020 2\u0006\u00108\u001a\u000201H\u0096Aø\u0001\u0000¢\u0006\u0002\u00102J\u0019\u00109\u001a\u00020 2\u0006\u0010:\u001a\u00020;H\u0096Aø\u0001\u0000¢\u0006\u0002\u0010<J\u0010\u0010=\u001a\u00020 2\u0006\u0010>\u001a\u00020?H\u0016R\u0018\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\rX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0010R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0014\u001a\u00020\u0015X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R$\u0010\u0018\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u00190\rX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0010R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006@"}, d2 = {"Lcom/unity3d/ads/adplayer/AndroidEmbeddableWebViewAdPlayer;", "Lcom/unity3d/ads/adplayer/AdPlayer;", "Lcom/unity3d/ads/adplayer/EmbeddableAdPlayer;", "webViewAdPlayer", "Lcom/unity3d/ads/adplayer/WebViewAdPlayer;", "opportunityId", "", "webViewContainer", "Lcom/unity3d/ads/adplayer/AndroidWebViewContainer;", "openMeasurementRepository", "Lcom/unity3d/ads/core/data/repository/OpenMeasurementRepository;", "(Lcom/unity3d/ads/adplayer/WebViewAdPlayer;Ljava/lang/String;Lcom/unity3d/ads/adplayer/AndroidWebViewContainer;Lcom/unity3d/ads/core/data/repository/OpenMeasurementRepository;)V", "onLoadEvent", "Lkotlinx/coroutines/flow/Flow;", "Lcom/unity3d/ads/adplayer/model/LoadEvent;", "getOnLoadEvent", "()Lkotlinx/coroutines/flow/Flow;", "onShowEvent", "Lcom/unity3d/ads/core/data/model/ShowEvent;", "getOnShowEvent", "scope", "Lkotlinx/coroutines/CoroutineScope;", "getScope", "()Lkotlinx/coroutines/CoroutineScope;", "updateCampaignState", "Lkotlin/Pair;", "", "", "getUpdateCampaignState", "getWebViewContainer", "()Lcom/unity3d/ads/adplayer/AndroidWebViewContainer;", "destroy", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dispatchShowCompleted", "onAllowedPiiChange", "value", "([BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onBroadcastEvent", androidx.core.app.NotificationCompat.CATEGORY_EVENT, "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestShow", "unityAdsShowOptions", "", "", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendActivityDestroyed", "sendFocusChange", "isFocused", "", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendMuteChange", "isMuted", "sendPrivacyFsmChange", "sendUserConsentChange", "sendVisibilityChange", com.json.pg.k, "sendVolumeChange", "volume", "", "(DLkotlin/coroutines/Continuation;)Ljava/lang/Object;", com.json.j5.v, "showOptions", "Lcom/unity3d/ads/adplayer/ShowOptions;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidEmbeddableWebViewAdPlayer implements com.unity3d.ads.adplayer.AdPlayer, com.unity3d.ads.adplayer.EmbeddableAdPlayer {
    private final com.unity3d.ads.core.data.repository.OpenMeasurementRepository openMeasurementRepository;
    private final java.lang.String opportunityId;
    private final com.unity3d.ads.adplayer.WebViewAdPlayer webViewAdPlayer;
    private final com.unity3d.ads.adplayer.AndroidWebViewContainer webViewContainer;

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$destroy$1, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidEmbeddableWebViewAdPlayer.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer", f = "AndroidEmbeddableWebViewAdPlayer.kt", i = {0, 1}, l = {57, 60, 62}, m = "destroy", n = {"this", "this"}, s = {"L$0", "L$0"})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        int label;
        /* synthetic */ java.lang.Object result;

        AnonymousClass1(kotlin.coroutines.Continuation<? super com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer.AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer.this.destroy(this);
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

    public AndroidEmbeddableWebViewAdPlayer(com.unity3d.ads.adplayer.WebViewAdPlayer webViewAdPlayer, java.lang.String opportunityId, com.unity3d.ads.adplayer.AndroidWebViewContainer webViewContainer, com.unity3d.ads.core.data.repository.OpenMeasurementRepository openMeasurementRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webViewAdPlayer, "webViewAdPlayer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(opportunityId, "opportunityId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webViewContainer, "webViewContainer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(openMeasurementRepository, "openMeasurementRepository");
        this.webViewAdPlayer = webViewAdPlayer;
        this.opportunityId = opportunityId;
        this.webViewContainer = webViewContainer;
        this.openMeasurementRepository = openMeasurementRepository;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public com.unity3d.ads.adplayer.AndroidWebViewContainer getWebViewContainer() {
        return this.webViewContainer;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public void show(final com.unity3d.ads.adplayer.ShowOptions showOptions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(showOptions, "showOptions");
        if (!(showOptions instanceof com.unity3d.ads.adplayer.AndroidShowOptions)) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        android.content.Context context = ((com.unity3d.ads.adplayer.AndroidShowOptions) showOptions).getContext();
        com.unity3d.services.banners.BannerView bannerView = com.unity3d.services.banners.BannerViewCache.getInstance().getBannerView(com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toUUID(com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toISO8859ByteString(this.opportunityId)).toString());
        if (bannerView != null) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(kotlinx.coroutines.CoroutineScopeKt.MainScope(), null, null, new com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer.C16071(context, bannerView, null), 3, null);
            final android.webkit.WebView webView = getWebViewContainer().getWebView();
            if (androidx.core.view.ViewCompat.isAttachedToWindow(webView)) {
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.webViewAdPlayer.getScope(), null, null, new com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$2$1(this, showOptions, null), 3, null);
                if (!androidx.core.view.ViewCompat.isAttachedToWindow(webView)) {
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.webViewAdPlayer.getScope(), null, null, new com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$2$2$1(this, null), 3, null);
                } else {
                    webView.addOnAttachStateChangeListener(new com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$lambda$2$$inlined$doOnDetach$1(webView, this));
                }
            } else {
                webView.addOnAttachStateChangeListener(new android.view.View.OnAttachStateChangeListener() { // from class: com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$$inlined$doOnAttach$1
                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewDetachedFromWindow(android.view.View view) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
                    }

                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewAttachedToWindow(android.view.View view) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
                        webView.removeOnAttachStateChangeListener(this);
                        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.webViewAdPlayer.getScope(), null, null, new com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$2$1(this, showOptions, null), 3, null);
                        if (!androidx.core.view.ViewCompat.isAttachedToWindow(view)) {
                            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.webViewAdPlayer.getScope(), null, null, new com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$2$2$1(this, null), 3, null);
                        } else {
                            view.addOnAttachStateChangeListener(new com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$lambda$2$$inlined$doOnDetach$1(view, this));
                        }
                    }
                });
            }
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(kotlinx.coroutines.CoroutineScopeKt.MainScope(), null, null, new com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer.AnonymousClass3(bannerView, this, null), 3, null);
            return;
        }
        throw new java.lang.IllegalStateException(("BannerView not found for opportunityId: " + this.opportunityId).toString());
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: AndroidEmbeddableWebViewAdPlayer.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$1", f = "AndroidEmbeddableWebViewAdPlayer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C16071 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ com.unity3d.services.banners.BannerView $bannerView;
        final /* synthetic */ android.content.Context $context;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C16071(android.content.Context context, com.unity3d.services.banners.BannerView bannerView, kotlin.coroutines.Continuation<? super com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer.C16071> continuation) {
            super(2, continuation);
            this.$context = context;
            this.$bannerView = bannerView;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer.this.new C16071(this.$context, this.$bannerView, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer.C16071) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer.this.getWebViewContainer().getWebView().setLayoutParams(new android.view.ViewGroup.LayoutParams((int) com.unity3d.services.core.misc.ViewUtilities.pxFromDp(this.$context, this.$bannerView.getSize().getWidth()), (int) com.unity3d.services.core.misc.ViewUtilities.pxFromDp(this.$context, this.$bannerView.getSize().getHeight())));
            return kotlin.Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$3, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidEmbeddableWebViewAdPlayer.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$3", f = "AndroidEmbeddableWebViewAdPlayer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass3 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ com.unity3d.services.banners.BannerView $bannerView;
        int label;
        final /* synthetic */ com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(com.unity3d.services.banners.BannerView bannerView, com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer androidEmbeddableWebViewAdPlayer, kotlin.coroutines.Continuation<? super com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer.AnonymousClass3> continuation) {
            super(2, continuation);
            this.$bannerView = bannerView;
            this.this$0 = androidEmbeddableWebViewAdPlayer;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer.AnonymousClass3(this.$bannerView, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer.AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            this.$bannerView.addView(this.this$0.getWebViewContainer().getWebView());
            return kotlin.Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0086 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // com.unity3d.ads.adplayer.AdPlayer
    public java.lang.Object destroy(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer.AnonymousClass1 anonymousClass1;
        com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer androidEmbeddableWebViewAdPlayer;
        if (continuation instanceof com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer.AnonymousClass1) {
            anonymousClass1 = (com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer.AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer.AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer.AnonymousClass1(continuation);
        }
        java.lang.Object obj = anonymousClass1.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.webViewAdPlayer.dispatchShowCompleted();
            if (this.openMeasurementRepository.hasSessionFinished(com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toISO8859ByteString(this.opportunityId))) {
                anonymousClass1.L$0 = this;
                anonymousClass1.label = 1;
                if (kotlinx.coroutines.DelayKt.delay(1000L, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            androidEmbeddableWebViewAdPlayer = this;
        } else {
            if (i == 1) {
                androidEmbeddableWebViewAdPlayer = (com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer) anonymousClass1.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
            } else if (i == 2) {
                androidEmbeddableWebViewAdPlayer = (com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer) anonymousClass1.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                anonymousClass1.L$0 = null;
                anonymousClass1.label = 3;
                if (com.unity3d.ads.adplayer.AdPlayer.DefaultImpls.destroy(androidEmbeddableWebViewAdPlayer, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            return kotlin.Unit.INSTANCE;
        }
        com.unity3d.ads.adplayer.AndroidWebViewContainer webViewContainer = androidEmbeddableWebViewAdPlayer.getWebViewContainer();
        anonymousClass1.L$0 = androidEmbeddableWebViewAdPlayer;
        anonymousClass1.label = 2;
        if (webViewContainer.destroy(anonymousClass1) == coroutine_suspended) {
            return coroutine_suspended;
        }
        anonymousClass1.L$0 = null;
        anonymousClass1.label = 3;
        if (com.unity3d.ads.adplayer.AdPlayer.DefaultImpls.destroy(androidEmbeddableWebViewAdPlayer, anonymousClass1) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return kotlin.Unit.INSTANCE;
    }
}
