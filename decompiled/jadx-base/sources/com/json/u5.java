package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010(\u001a\u00020'\u0012\u0006\u0010\u001f\u001a\u00020\u001b¢\u0006\u0004\b)\u0010*J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\u0007\u001a\u00020\u0005H\u0002J\b\u0010\b\u001a\u00020\u0005H\u0002J\b\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u000e\u0010\r\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eJ\b\u0010\u0010\u001a\u00020\u0005H\u0014J\b\u0010\u0011\u001a\u00020\u0005H\u0016J\u0018\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\b\u0010\u0017\u001a\u00020\u0005H\u0016J\b\u0010\u0018\u001a\u00020\u0005H\u0016J\b\u0010\u0019\u001a\u00020\u0005H\u0016R$\u0010\u001f\u001a\u0010\u0012\f\u0012\n \u001c*\u0004\u0018\u00010\u001b0\u001b0\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010$\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006+"}, d2 = {"Lcom/ironsource/u5;", "Lcom/ironsource/y;", "Lcom/ironsource/mediationsdk/adunit/adapter/listener/BannerAdListener;", "Lcom/ironsource/mediationsdk/ISBannerSize;", "H", "", "K", "J", "I", "Lcom/unity3d/mediation/LevelPlayAdInfo;", "e", "Lcom/ironsource/g0;", "adInstancePresenter", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/ironsource/kv;", "viewBinder", "z", "b", "Landroid/view/View;", "adView", "Landroid/widget/FrameLayout$LayoutParams;", "frameLayoutParams", "onAdLoadSuccess", com.json.ju.k, com.json.ju.l, com.json.ju.m, "Ljava/lang/ref/WeakReference;", "Lcom/ironsource/w5;", "kotlin.jvm.PlatformType", "v", "Ljava/lang/ref/WeakReference;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "w", "Landroid/view/View;", "x", "Landroid/widget/FrameLayout$LayoutParams;", "bannerLayoutParams", "Lcom/ironsource/t2;", "adTools", "Lcom/ironsource/z;", "instanceData", "<init>", "(Lcom/ironsource/t2;Lcom/ironsource/z;Lcom/ironsource/w5;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class u5 extends com.json.y implements com.json.mediationsdk.adunit.adapter.listener.BannerAdListener {

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private java.lang.ref.WeakReference<com.json.w5> listener;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private android.view.View adView;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private android.widget.FrameLayout.LayoutParams bannerLayoutParams;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u5(com.json.t2 adTools, com.json.z instanceData, com.json.w5 listener) {
        super(adTools, instanceData, listener);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adTools, "adTools");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instanceData, "instanceData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
        this.listener = new java.lang.ref.WeakReference<>(listener);
    }

    private final com.json.mediationsdk.ISBannerSize H() {
        com.json.t2 adTools = getAdTools();
        com.json.t1 t1VarI = getInstanceData().i();
        kotlin.jvm.internal.Intrinsics.checkNotNull(t1VarI, "null cannot be cast to non-null type com.unity3d.mediation.internal.ads.controllers.adunits.data.BannerAdUnitData");
        return adTools.a(((com.json.j6) t1VarI).getAdProperties().getAdSize());
    }

    private final void I() {
        com.json.mediationsdk.model.Placement placementJ = j();
        if (placementJ != null) {
            getAdTools().getEventSender().getAdInteraction().f(placementJ.getCom.ironsource.op.d java.lang.String());
        }
        com.json.w5 w5Var = this.listener.get();
        if (w5Var != null) {
            w5Var.a(this);
        }
    }

    private final void J() {
        com.json.mediationsdk.model.Placement placementJ = j();
        if (placementJ != null) {
            getAdTools().getEventSender().getAdInteraction().c(placementJ.getCom.ironsource.op.d java.lang.String());
        }
        com.json.w5 w5Var = this.listener.get();
        if (w5Var != null) {
            w5Var.b(this);
        }
    }

    private final void K() {
        com.json.mediationsdk.model.Placement placementJ = j();
        if (placementJ != null) {
            getAdTools().getEventSender().getAdInteraction().h(placementJ.getCom.ironsource.op.d java.lang.String());
        }
        com.json.w5 w5Var = this.listener.get();
        if (w5Var != null) {
            w5Var.c(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.json.u5 this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.adView = null;
        this$0.bannerLayoutParams = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.json.u5 this$0, android.view.View adView, android.widget.FrameLayout.LayoutParams frameLayoutParams) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adView, "$adView");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frameLayoutParams, "$frameLayoutParams");
        this$0.adView = adView;
        this$0.bannerLayoutParams = frameLayoutParams;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(final com.json.u5 this$0, com.json.kv viewBinder) {
        android.widget.FrameLayout.LayoutParams layoutParams;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewBinder, "$viewBinder");
        android.view.View view = this$0.adView;
        if (view == null || (layoutParams = this$0.bannerLayoutParams) == null) {
            return;
        }
        viewBinder.a(view, layoutParams, this$0.getAdTools());
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose(com.json.l1.a(this$0.getAdTools(), "Bind banner view", (java.lang.String) null, 2, (java.lang.Object) null));
        this$0.getAdTools().d(new java.lang.Runnable() { // from class: com.ironsource.u5$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.json.u5.e(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(com.json.u5 this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.I();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(com.json.u5 this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.J();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(com.json.u5 this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.K();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(com.json.u5 this$0) {
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        com.json.k0 adInteraction = this$0.getAdTools().getEventSender().getAdInteraction();
        com.json.mediationsdk.model.Placement placementJ = this$0.j();
        if (placementJ == null || (str = placementJ.getCom.ironsource.op.d java.lang.String()) == null) {
            str = "";
        }
        adInteraction.j(str);
    }

    @Override // com.json.y
    public void a(com.json.g0 adInstancePresenter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInstancePresenter, "adInstancePresenter");
        adInstancePresenter.a(this);
    }

    public final void a(final com.json.kv viewBinder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewBinder, "viewBinder");
        com.json.rl.a(getAdTools(), new java.lang.Runnable() { // from class: com.ironsource.u5$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                com.json.u5.a(this.f$0, viewBinder);
            }
        }, 0L, 2, (java.lang.Object) null);
    }

    @Override // com.json.y
    public void b() {
        com.json.mediationsdk.logger.IronLog ironLog = com.json.mediationsdk.logger.IronLog.INTERNAL;
        ironLog.verbose(getInstanceSignature());
        com.json.rl.a(getAdTools(), new java.lang.Runnable() { // from class: com.ironsource.u5$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                com.json.u5.a(this.f$0);
            }
        }, 0L, 2, (java.lang.Object) null);
        if (g() == null) {
            ironLog.warning("adapter == null");
            return;
        }
        try {
            if (g() instanceof com.json.mediationsdk.adunit.adapter.internal.AdapterBannerInterface) {
                java.lang.Object objG = g();
                kotlin.jvm.internal.Intrinsics.checkNotNull(objG, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBannerInterface<*>");
                ((com.json.mediationsdk.adunit.adapter.internal.AdapterBannerInterface) objG).destroyAd(getCurrentAdData());
            } else {
                ironLog.error(a("adapter not instance of AdapterBannerInterface"));
            }
        } catch (java.lang.Throwable th) {
            com.json.l9.d().a(th);
            java.lang.String str = "destroyBanner - exception = " + th.getLocalizedMessage();
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(a(str));
            getAdTools().getEventSender().getTroubleshoot().g(str);
        }
        super.b();
    }

    @Override // com.json.y
    public com.unity3d.mediation.LevelPlayAdInfo e() {
        java.lang.String adUnitId = getInstanceData().i().getAdProperties().getAdUnitId();
        java.lang.String string = getInstanceData().getAdFormat().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "instanceData.adFormat.toString()");
        com.json.mediationsdk.impressionData.ImpressionData impressionDataA = getInstanceData().n().a(k());
        com.json.wl wlVarD = getInstanceData().n().d();
        com.json.t1 t1VarI = getInstanceData().i();
        kotlin.jvm.internal.Intrinsics.checkNotNull(t1VarI, "null cannot be cast to non-null type com.unity3d.mediation.internal.ads.controllers.adunits.data.BannerAdUnitData");
        return new com.unity3d.mediation.LevelPlayAdInfo(adUnitId, string, impressionDataA, wlVarD, ((com.json.j6) t1VarI).getAdProperties().getAdSize(), null, 32, null);
    }

    @Override // com.json.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdLeftApplication() {
        a(new java.lang.Runnable() { // from class: com.ironsource.u5$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                com.json.u5.b(this.f$0);
            }
        });
    }

    @Override // com.json.mediationsdk.adunit.adapter.listener.BannerAdListener, com.json.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdLoadSuccess(final android.view.View adView, final android.widget.FrameLayout.LayoutParams frameLayoutParams) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adView, "adView");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frameLayoutParams, "frameLayoutParams");
        com.json.rl.a(getAdTools(), new java.lang.Runnable() { // from class: com.ironsource.u5$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                com.json.u5.a(this.f$0, adView, frameLayoutParams);
            }
        }, 0L, 2, (java.lang.Object) null);
        super.onAdLoadSuccess();
    }

    @Override // com.json.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdScreenDismissed() {
        a(new java.lang.Runnable() { // from class: com.ironsource.u5$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                com.json.u5.c(this.f$0);
            }
        });
    }

    @Override // com.json.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdScreenPresented() {
        a(new java.lang.Runnable() { // from class: com.ironsource.u5$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                com.json.u5.d(this.f$0);
            }
        });
    }

    @Override // com.json.y
    protected void z() {
        if (!(g() instanceof com.json.mediationsdk.adunit.adapter.internal.AdapterBannerInterface)) {
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(a("adapter not instance of AdapterBannerInterface"));
            return;
        }
        com.json.mediationsdk.adunit.adapter.utility.AdData currentAdData = getCurrentAdData();
        com.json.mediationsdk.ISBannerSize iSBannerSizeH = H();
        java.util.Map<java.lang.String, java.lang.Object> adUnitData = currentAdData.getAdUnitData();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adUnitData, "adData.adUnitData");
        adUnitData.put("bannerLayout", new com.json.mediationsdk.IronSourceBannerLayout(com.json.environment.ContextProvider.getInstance().getCurrentActiveActivity(), iSBannerSizeH));
        java.lang.Object objG = g();
        kotlin.jvm.internal.Intrinsics.checkNotNull(objG, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBannerInterface<com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener>");
        ((com.json.mediationsdk.adunit.adapter.internal.AdapterBannerInterface) objG).loadAd(currentAdData, com.json.environment.ContextProvider.getInstance().getCurrentActiveActivity(), iSBannerSizeH, this);
    }
}
