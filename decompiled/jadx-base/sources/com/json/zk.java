package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010!\u001a\u00020\u001f\u0012\b\u00106\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b7\u00108J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\n\u001a\u00020\tH\u0002J\u0006\u0010\u000b\u001a\u00020\u0007J\u0006\u0010\f\u001a\u00020\u0007J\u0010\u0010\b\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\rJ\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fJ\u000e\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011J\u0006\u0010\u0014\u001a\u00020\u0007J\u0006\u0010\u0015\u001a\u00020\u0007J\b\u0010\u0017\u001a\u00020\u0016H\u0016J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0016H\u0016J\u0012\u0010\b\u001a\u00020\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016J\u0010\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J\u0010\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J\u0010\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0018H\u0016R\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010 R\u0014\u0010$\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010#R$\u0010\u0010\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020\u000f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\f\u0010&\u001a\u0004\b\u001e\u0010'R(\u0010+\u001a\u0004\u0018\u00010\r2\b\u0010%\u001a\u0004\u0018\u00010\r8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001e\u0010(\u001a\u0004\b)\u0010*R$\u0010\u0012\u001a\u00020\u00112\u0006\u0010%\u001a\u00020\u00118\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b)\u0010,\u001a\u0004\b-\u0010.R\u0018\u00100\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010/R\u0018\u00102\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u00101R\u0016\u00105\u001a\u0002038\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0014\u00104¨\u00069"}, d2 = {"Lcom/ironsource/zk;", "Lcom/ironsource/xk;", "Lcom/ironsource/t5;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/ironsource/s5;", "e", "j", "f", "Lcom/unity3d/mediation/banner/LevelPlayBannerAdViewListener;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/unity3d/mediation/LevelPlayAdSize;", com.ironsource.y8.h.O, "", com.json.op.d, "b", "k", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAM_TYPE_LIVE, "", "d", "Lcom/unity3d/mediation/LevelPlayAdInfo;", "adInfo", "isReload", "Lcom/unity3d/mediation/LevelPlayAdError;", "error", "c", "g", "Lcom/ironsource/t6;", "Lcom/ironsource/t6;", "bannerContainer", "Lcom/ironsource/ai;", "Lcom/ironsource/ai;", "testSuiteLoadConfigService", "<set-?>", "Lcom/unity3d/mediation/LevelPlayAdSize;", "()Lcom/unity3d/mediation/LevelPlayAdSize;", "Lcom/unity3d/mediation/banner/LevelPlayBannerAdViewListener;", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_HLS, "()Lcom/unity3d/mediation/banner/LevelPlayBannerAdViewListener;", "bannerListener", "Ljava/lang/String;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, "()Ljava/lang/String;", "Lcom/ironsource/s5;", "bannerAdController", "Ljava/lang/Boolean;", "isAutoRefreshEnabled", "Lcom/ironsource/mediationsdk/model/Placement;", "Lcom/ironsource/mediationsdk/model/Placement;", "bannerPlacement", "attributeSet", "<init>", "(Lcom/ironsource/t6;Landroid/util/AttributeSet;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class zk extends com.json.xk implements com.json.t5 {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final com.json.t6 bannerContainer;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final com.json.ai testSuiteLoadConfigService;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private com.unity3d.mediation.LevelPlayAdSize adSize;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private com.unity3d.mediation.banner.LevelPlayBannerAdViewListener bannerListener;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private java.lang.String placementName;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private com.json.s5 bannerAdController;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private java.lang.Boolean isAutoRefreshEnabled;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private com.json.mediationsdk.model.Placement bannerPlacement;

    @kotlin.Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u0006"}, d2 = {"com/ironsource/zk$a", "Lcom/ironsource/dr;", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", "t", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class a extends com.json.dr {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f3621a;
        final /* synthetic */ java.lang.String b;
        final /* synthetic */ com.json.zk c;

        a(java.lang.String str, java.lang.String str2, com.json.zk zkVar) {
            this.f3621a = str;
            this.b = str2;
            this.c = zkVar;
        }

        @Override // com.json.dr
        public void a() {
            java.lang.String str = this.f3621a;
            if (str != null) {
                this.c.a(str);
            }
            java.lang.String str2 = this.b;
            if (str2 != null) {
                this.c.adSize = com.unity3d.mediation.LevelPlayAdSize.INSTANCE.createAdSize$mediationsdk_release(str2);
            }
        }

        @Override // com.json.dr
        public void a(java.lang.Throwable t) throws java.lang.Throwable {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "t");
            if (t instanceof java.lang.IllegalArgumentException) {
                throw t;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zk(com.json.t6 bannerContainer, android.util.AttributeSet attributeSet) {
        super(new com.json.l1(com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER, com.ironsource.b2.b.MEDIATION));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bannerContainer, "bannerContainer");
        this.bannerContainer = bannerContainer;
        this.testSuiteLoadConfigService = com.json.im.INSTANCE.d().o();
        this.adSize = com.unity3d.mediation.LevelPlayAdSize.BANNER;
        this.placementName = "";
        if (attributeSet != null) {
            android.content.Context context = bannerContainer.getContext();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "bannerContainer.context");
            a(context, attributeSet);
        }
    }

    private final void a(android.content.Context context, android.util.AttributeSet attrs) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, com.json.sdk.mediation.R.styleable.LevelPlayBannerAdView);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…le.LevelPlayBannerAdView)");
        getAdTools().d(new com.ironsource.zk.a(typedArrayObtainStyledAttributes.getString(com.json.sdk.mediation.R.styleable.LevelPlayBannerAdView_adUnitId), typedArrayObtainStyledAttributes.getString(com.json.sdk.mediation.R.styleable.LevelPlayBannerAdView_adSize), this));
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(final com.json.zk this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!this$0.getIsLoadAdCalled()) {
            com.json.mediationsdk.logger.IronLog.INTERNAL.warning(com.json.l1.a(this$0.getAdTools(), "Banner not loaded", (java.lang.String) null, 2, (java.lang.Object) null));
            return;
        }
        if (this$0.bannerAdController == null) {
            com.json.mediationsdk.logger.IronLog.INTERNAL.warning(com.json.l1.a(this$0.getAdTools(), "Banner already destroyed", (java.lang.String) null, 2, (java.lang.Object) null));
            return;
        }
        com.json.rl.a(this$0.getAdTools(), new java.lang.Runnable() { // from class: com.ironsource.zk$$ExternalSyntheticLambda12
            @Override // java.lang.Runnable
            public final void run() {
                com.json.zk.b(this.f$0);
            }
        }, 0L, 2, (java.lang.Object) null);
        com.json.s5 s5Var = this$0.bannerAdController;
        if (s5Var != null) {
            s5Var.k();
        }
        this$0.bannerAdController = null;
        this$0.isAutoRefreshEnabled = null;
        this$0.bannerListener = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.json.zk this$0, com.unity3d.mediation.LevelPlayAdError it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "$it");
        com.unity3d.mediation.banner.LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this$0.bannerListener;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdLoadFailed(it);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.json.zk this$0, com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        com.unity3d.mediation.banner.LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this$0.bannerListener;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdClicked(adInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.json.zk this$0, com.unity3d.mediation.LevelPlayAdInfo adInfo, com.unity3d.mediation.LevelPlayAdError it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "$it");
        com.unity3d.mediation.banner.LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this$0.bannerListener;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdDisplayFailed(adInfo, it);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.json.zk this$0, com.unity3d.mediation.banner.LevelPlayBannerAdViewListener levelPlayBannerAdViewListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.bannerListener = levelPlayBannerAdViewListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.json.zk this$0, java.lang.String placementName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placementName, "$placementName");
        if (this$0.getIsLoadAdCalled()) {
            return;
        }
        this$0.placementName = placementName;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(com.json.zk this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.bannerContainer.removeAllViews();
        android.view.ViewParent parent = this$0.bannerContainer.getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(this$0.bannerContainer);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(com.json.zk this$0, com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        com.unity3d.mediation.banner.LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this$0.bannerListener;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdDisplayed(adInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(com.json.zk this$0, com.unity3d.mediation.LevelPlayAdSize adSize) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adSize, "$adSize");
        if (this$0.getIsLoadAdCalled()) {
            return;
        }
        this$0.adSize = adSize;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(com.json.zk this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.getIsLoadAdCalled()) {
            com.json.mediationsdk.logger.IronLog.INTERNAL.warning(com.json.l1.a(this$0.getAdTools(), "Banner load already called", (java.lang.String) null, 2, (java.lang.Object) null));
            return;
        }
        this$0.a(true);
        if (this$0.d()) {
            com.json.s5 s5VarE = this$0.e();
            java.lang.Boolean bool = this$0.isAutoRefreshEnabled;
            if (bool != null) {
                if (bool.booleanValue()) {
                    s5VarE.q();
                } else {
                    s5VarE.p();
                }
            }
            s5VarE.l();
            this$0.bannerAdController = s5VarE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(com.json.zk this$0, com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        com.unity3d.mediation.banner.LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this$0.bannerListener;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdLeftApplication(adInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(com.json.zk this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        com.json.s5 s5Var = this$0.bannerAdController;
        if (s5Var != null) {
            s5Var.p();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(com.json.zk this$0, com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        com.unity3d.mediation.banner.LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this$0.bannerListener;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdLoaded(adInfo);
        }
    }

    private final com.json.s5 e() {
        com.json.mediationsdk.model.Placement placement;
        this.bannerPlacement = getAdTools().a(this.placementName);
        android.content.Context context = this.bannerContainer.getContext();
        if (context instanceof android.app.Activity) {
            com.json.environment.ContextProvider.getInstance().updateActivity((android.app.Activity) context);
        }
        java.lang.String adUnitId = getAdUnitId();
        com.json.mediationsdk.model.Placement placement2 = this.bannerPlacement;
        com.json.mediationsdk.model.Placement placement3 = null;
        if (placement2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("bannerPlacement");
            placement = null;
        } else {
            placement = placement2;
        }
        com.json.g6 g6Var = new com.json.g6(adUnitId, placement, this.adSize, null, null, this.testSuiteLoadConfigService.getTestSuiteLoadAdConfigInternal(), 24, null);
        a(g6Var);
        com.json.mediationsdk.ISBannerSize iSBannerSizeA = getAdTools().a(g6Var.getCom.ironsource.y8.h.O java.lang.String());
        com.json.xb eventSender = getAdTools().getEventSender();
        com.json.l1 adTools = getAdTools();
        com.json.mediationsdk.model.Placement placement4 = this.bannerPlacement;
        if (placement4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("bannerPlacement");
        } else {
            placement3 = placement4;
        }
        eventSender.a(new com.json.v6(adTools, iSBannerSizeA, placement3.getCom.ironsource.op.d java.lang.String()));
        return new com.json.s5(this, getAdTools(), g6Var, this.bannerContainer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(com.json.zk this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        com.json.s5 s5Var = this$0.bannerAdController;
        if (s5Var != null) {
            s5Var.q();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(com.json.zk this$0, com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        com.unity3d.mediation.banner.LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this$0.bannerListener;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdCollapsed(adInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(com.json.zk this$0, com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        com.unity3d.mediation.banner.LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this$0.bannerListener;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdExpanded(adInfo);
        }
    }

    @Override // com.json.t5
    public void a(final com.unity3d.mediation.LevelPlayAdError error) {
        if (error != null) {
            b(new java.lang.Runnable() { // from class: com.ironsource.zk$$ExternalSyntheticLambda13
                @Override // java.lang.Runnable
                public final void run() {
                    com.json.zk.a(this.f$0, error);
                }
            });
        }
    }

    @Override // com.json.t5
    public void a(final com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        b(new java.lang.Runnable() { // from class: com.ironsource.zk$$ExternalSyntheticLambda9
            @Override // java.lang.Runnable
            public final void run() {
                com.json.zk.f(this.f$0, adInfo);
            }
        });
    }

    @Override // com.json.t5
    public void a(final com.unity3d.mediation.LevelPlayAdInfo adInfo, final com.unity3d.mediation.LevelPlayAdError error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        if (error != null) {
            b(new java.lang.Runnable() { // from class: com.ironsource.zk$$ExternalSyntheticLambda14
                @Override // java.lang.Runnable
                public final void run() {
                    com.json.zk.a(this.f$0, adInfo, error);
                }
            });
        }
    }

    @Override // com.json.t5
    public void a(final com.unity3d.mediation.LevelPlayAdInfo adInfo, boolean isReload) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        b(new java.lang.Runnable() { // from class: com.ironsource.zk$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                com.json.zk.d(this.f$0, adInfo);
            }
        });
    }

    public final void a(final com.unity3d.mediation.LevelPlayAdSize adSize) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adSize, "adSize");
        a(new java.lang.Runnable() { // from class: com.ironsource.zk$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                com.json.zk.b(this.f$0, adSize);
            }
        });
    }

    public final void a(final com.unity3d.mediation.banner.LevelPlayBannerAdViewListener listener) {
        a(new java.lang.Runnable() { // from class: com.ironsource.zk$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                com.json.zk.a(this.f$0, listener);
            }
        });
    }

    public final void b(final java.lang.String placementName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placementName, "placementName");
        a(new java.lang.Runnable() { // from class: com.ironsource.zk$$ExternalSyntheticLambda15
            @Override // java.lang.Runnable
            public final void run() {
                com.json.zk.a(this.f$0, placementName);
            }
        });
    }

    @Override // com.json.t5
    public void c(final com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        b(new java.lang.Runnable() { // from class: com.ironsource.zk$$ExternalSyntheticLambda10
            @Override // java.lang.Runnable
            public final void run() {
                com.json.zk.b(this.f$0, adInfo);
            }
        });
    }

    @Override // com.json.t5
    public void d(final com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        b(new java.lang.Runnable() { // from class: com.ironsource.zk$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                com.json.zk.e(this.f$0, adInfo);
            }
        });
    }

    @Override // com.json.xk
    public boolean d() {
        com.unity3d.mediation.LevelPlayAdError levelPlayAdError;
        if (getAdUnitId().length() == 0) {
            levelPlayAdError = new com.unity3d.mediation.LevelPlayAdError(getAdUnitId(), com.unity3d.mediation.LevelPlayAdError.ERROR_CODE_NO_AD_UNIT_ID_SPECIFIED, "Ad unit ID should be specified");
        } else {
            if (getAdTools().g()) {
                com.json.al alVarA = com.json.im.INSTANCE.d().t().a();
                if (alVarA != null && alVarA.a(getAdUnitId(), com.unity3d.mediation.LevelPlay.AdFormat.BANNER)) {
                    return true;
                }
                com.unity3d.mediation.banner.LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this.bannerListener;
                if (levelPlayBannerAdViewListener != null) {
                    levelPlayBannerAdViewListener.onAdLoadFailed(new com.unity3d.mediation.LevelPlayAdError(getAdUnitId(), com.unity3d.mediation.LevelPlayAdError.ERROR_CODE_INVALID_AD_UNIT_ID, "Invalid ad unit id"));
                }
                return false;
            }
            levelPlayAdError = new com.unity3d.mediation.LevelPlayAdError(getAdUnitId(), com.unity3d.mediation.LevelPlayAdError.ERROR_CODE_LOAD_BEFORE_INIT_SUCCESS_CALLBACK, "load must be called after init success callback");
        }
        a(levelPlayAdError);
        return false;
    }

    @Override // com.json.t5
    public void e(final com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        b(new java.lang.Runnable() { // from class: com.ironsource.zk$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                com.json.zk.a(this.f$0, adInfo);
            }
        });
    }

    public final void f() {
        a(new java.lang.Runnable() { // from class: com.ironsource.zk$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.json.zk.a(this.f$0);
            }
        });
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final com.unity3d.mediation.LevelPlayAdSize getAdSize() {
        return this.adSize;
    }

    @Override // com.json.t5
    public void g(final com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        b(new java.lang.Runnable() { // from class: com.ironsource.zk$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                com.json.zk.c(this.f$0, adInfo);
            }
        });
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final com.unity3d.mediation.banner.LevelPlayBannerAdViewListener getBannerListener() {
        return this.bannerListener;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final java.lang.String getPlacementName() {
        return this.placementName;
    }

    public final void j() {
        a(new java.lang.Runnable() { // from class: com.ironsource.zk$$ExternalSyntheticLambda11
            @Override // java.lang.Runnable
            public final void run() {
                com.json.zk.c(this.f$0);
            }
        });
    }

    public final void k() {
        kotlin.Unit unit;
        if (this.bannerAdController != null) {
            a(new java.lang.Runnable() { // from class: com.ironsource.zk$$ExternalSyntheticLambda8
                @Override // java.lang.Runnable
                public final void run() {
                    com.json.zk.d(this.f$0);
                }
            });
            unit = kotlin.Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            this.isAutoRefreshEnabled = java.lang.Boolean.FALSE;
        }
    }

    public final void l() {
        kotlin.Unit unit;
        if (this.bannerAdController != null) {
            a(new java.lang.Runnable() { // from class: com.ironsource.zk$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    com.json.zk.e(this.f$0);
                }
            });
            unit = kotlin.Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            this.isAutoRefreshEnabled = java.lang.Boolean.TRUE;
        }
    }
}
