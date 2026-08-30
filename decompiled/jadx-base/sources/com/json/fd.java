package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u001f\u0012\u0006\u0010+\u001a\u00020*\u0012\u0006\u0010-\u001a\u00020,\u0012\u0006\u0010%\u001a\u00020!¢\u0006\u0004\b.\u0010/J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\u0007\u001a\u00020\u0005H\u0002J\b\u0010\b\u001a\u00020\u0005H\u0002J\b\u0010\t\u001a\u00020\u0005H\u0002J\b\u0010\n\u001a\u00020\u0005H\u0002J\u001a\u0010\u000f\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002J\b\u0010\u0010\u001a\u00020\u0005H\u0002J\u0010\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u000e\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0014J\b\u0010\u0016\u001a\u00020\u0005H\u0014J\u000f\u0010\u0017\u001a\u00020\u0005H\u0010¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0019\u001a\u00020\u0005H\u0016J\u001a\u0010\u001a\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010\u001b\u001a\u00020\u0005H\u0016J\b\u0010\u001c\u001a\u00020\u0005H\u0016J\b\u0010\u001d\u001a\u00020\u0005H\u0016J\b\u0010\u001e\u001a\u00020\u0005H\u0016J\b\u0010\u001f\u001a\u00020\u0005H\u0016R$\u0010%\u001a\u0010\u0012\f\u0012\n \"*\u0004\u0018\u00010!0!0 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010)\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(¨\u00060"}, d2 = {"Lcom/ironsource/fd;", "Lcom/ironsource/y;", "Lcom/ironsource/mediationsdk/adunit/adapter/listener/InterstitialAdListener;", "Lcom/ironsource/mediationsdk/adunit/adapter/listener/RewardedVideoAdListener;", "Lcom/ironsource/mediationsdk/adunit/adapter/internal/listener/AdapterAdRewardListener;", "", "H", "L", "I", "M", "K", "", com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, "", "errorMessage", "b", "J", "Lcom/ironsource/g0;", "adInstancePresenter", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Landroid/app/Activity;", "activity", "z", "c", "()V", com.json.ju.g, com.json.ju.e, "onAdShowSuccess", "onAdVisible", "onAdStarted", "onAdEnded", com.json.ju.i, "Ljava/lang/ref/WeakReference;", "Lcom/ironsource/gd;", "kotlin.jvm.PlatformType", "v", "Ljava/lang/ref/WeakReference;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/ironsource/fb;", "w", "Lcom/ironsource/fb;", "rewardDurationAfterClose", "Lcom/ironsource/t2;", "adTools", "Lcom/ironsource/z;", "instanceData", "<init>", "(Lcom/ironsource/t2;Lcom/ironsource/z;Lcom/ironsource/gd;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class fd extends com.json.y implements com.json.mediationsdk.adunit.adapter.listener.InterstitialAdListener, com.json.mediationsdk.adunit.adapter.listener.RewardedVideoAdListener, com.json.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener {

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private java.lang.ref.WeakReference<com.json.gd> listener;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private com.json.fb rewardDurationAfterClose;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fd(com.json.t2 adTools, com.json.z instanceData, com.json.gd listener) {
        super(adTools, instanceData, listener);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adTools, "adTools");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instanceData, "instanceData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
        this.listener = new java.lang.ref.WeakReference<>(listener);
    }

    private final void H() {
        this.rewardDurationAfterClose = new com.json.fb();
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose(com.json.y.a(this, (java.lang.String) null, 1, (java.lang.Object) null));
        getAdTools().getEventSender().getAdInteraction().a(k(), "");
        com.json.gd gdVar = this.listener.get();
        if (gdVar != null) {
            gdVar.b(this);
        }
        c();
    }

    private final void I() {
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose(com.json.y.a(this, (java.lang.String) null, 1, (java.lang.Object) null));
        getAdTools().getEventSender().getAdInteraction().d(k());
    }

    private final void J() {
        java.util.HashMap map = new java.util.HashMap();
        java.util.Map<java.lang.String, java.lang.String> mapK = getAdTools().k();
        if (mapK != null) {
            for (java.lang.String str : mapK.keySet()) {
                map.put(androidx.media3.datasource.cache.ContentMetadata.KEY_CUSTOM_PREFIX + str, mapK.get(str));
            }
        }
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String strA = getAdTools().a(jCurrentTimeMillis, getInstanceName());
        long jA = com.json.fb.a(this.rewardDurationAfterClose);
        com.unity3d.mediation.rewarded.LevelPlayReward levelPlayRewardA = com.json.im.INSTANCE.d().p().a(k(), getInstanceData().i().getAdProperties().getAdUnitId());
        if (levelPlayRewardA == null) {
            levelPlayRewardA = com.json.ga.INSTANCE.a();
        }
        com.unity3d.mediation.rewarded.LevelPlayReward levelPlayReward = levelPlayRewardA;
        getAdTools().getEventSender().getAdInteraction().a(k(), levelPlayReward.getName(), levelPlayReward.getAmount(), jCurrentTimeMillis, strA, jA, map, getAdTools().j());
        com.json.gd gdVar = this.listener.get();
        if (gdVar != null) {
            gdVar.a(this, levelPlayReward);
        }
    }

    private final void K() {
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose(com.json.y.a(this, (java.lang.String) null, 1, (java.lang.Object) null));
        getAdTools().getEventSender().getAdInteraction().l(k());
        com.json.gd gdVar = this.listener.get();
        if (gdVar != null) {
            gdVar.a(this);
        }
    }

    private final void L() {
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose(com.json.y.a(this, (java.lang.String) null, 1, (java.lang.Object) null));
        getAdTools().getEventSender().getAdInteraction().i(k());
    }

    private final void M() {
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose(com.json.y.a(this, (java.lang.String) null, 1, (java.lang.Object) null));
        getAdTools().getEventSender().getAdInteraction().k(k());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.json.fd this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.H();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.json.fd this$0, int i, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.b(i, str);
    }

    private final void b(int errorCode, java.lang.String errorMessage) {
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose(a("error = " + errorCode + ", " + errorMessage));
        getAdTools().getEventSender().getAdInteraction().a(k(), errorCode, errorMessage, "");
        a(com.ironsource.n1.a.FailedToShow);
        com.json.mediationsdk.logger.IronSourceError ironSourceError = new com.json.mediationsdk.logger.IronSourceError(errorCode, errorMessage);
        com.json.gd gdVar = this.listener.get();
        if (gdVar != null) {
            gdVar.a(this, ironSourceError);
        }
        c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(com.json.fd this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.I();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(com.json.fd this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.J();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(com.json.fd this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.K();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(com.json.fd this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.L();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(com.json.fd this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.M();
    }

    public final void a(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        com.json.mediationsdk.logger.IronLog ironLog = com.json.mediationsdk.logger.IronLog.INTERNAL;
        ironLog.verbose(a("placementName = " + k()));
        try {
            getAdTools().getEventSender().getAdInteraction().a(activity, k());
            if (g() instanceof com.json.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface) {
                java.lang.Object objG = g();
                kotlin.jvm.internal.Intrinsics.checkNotNull(objG, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface<com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener>");
                ((com.json.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface) objG).showAd(getCurrentAdData(), this);
            } else {
                ironLog.error(a("showAd - adapter not instance of AdapterAdFullScreenInterface"));
                getAdTools().getEventSender().getTroubleshoot().g("showAd - adapter not instance of AdapterAdFullScreenInterface");
            }
        } catch (java.lang.Throwable th) {
            com.json.l9.d().a(th);
            java.lang.String str = "showAd - exception = " + th.getMessage();
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(a(str));
            getAdTools().getEventSender().getTroubleshoot().g(str);
            b(com.json.x1.h(getInstanceData().getAdFormat()), str);
        }
    }

    @Override // com.json.y
    public void a(com.json.g0 adInstancePresenter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInstancePresenter, "adInstancePresenter");
        adInstancePresenter.a(this);
    }

    @Override // com.json.y
    public void c() {
        if (com.json.im.INSTANCE.d().d().d()) {
            if (!(g() instanceof com.json.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface)) {
                com.json.mediationsdk.logger.IronLog.INTERNAL.error(a("adapter not instance of AdapterAdFullScreenInterface"));
                return;
            }
            java.lang.Object objG = g();
            kotlin.jvm.internal.Intrinsics.checkNotNull(objG, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface<*>");
            ((com.json.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface) objG).disposeAd(getInstanceData().getAdData());
        }
    }

    @Override // com.json.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdClosed() {
        a(new java.lang.Runnable() { // from class: com.ironsource.fd$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                com.json.fd.a(this.f$0);
            }
        });
    }

    @Override // com.json.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdEnded() {
        a(new java.lang.Runnable() { // from class: com.ironsource.fd$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                com.json.fd.b(this.f$0);
            }
        });
    }

    @Override // com.json.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener
    public void onAdRewarded() {
        a(new java.lang.Runnable() { // from class: com.ironsource.fd$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                com.json.fd.c(this.f$0);
            }
        });
    }

    @Override // com.json.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdShowFailed(final int errorCode, final java.lang.String errorMessage) {
        a(new java.lang.Runnable() { // from class: com.ironsource.fd$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                com.json.fd.a(this.f$0, errorCode, errorMessage);
            }
        });
    }

    @Override // com.json.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdShowSuccess() {
        a(new java.lang.Runnable() { // from class: com.ironsource.fd$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                com.json.fd.d(this.f$0);
            }
        });
    }

    @Override // com.json.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdStarted() {
        a(new java.lang.Runnable() { // from class: com.ironsource.fd$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.json.fd.e(this.f$0);
            }
        });
    }

    @Override // com.json.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdVisible() {
        a(new java.lang.Runnable() { // from class: com.ironsource.fd$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                com.json.fd.f(this.f$0);
            }
        });
    }

    @Override // com.json.y
    protected void z() {
        if (!(g() instanceof com.json.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface)) {
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(a("adapter not instance of AdapterAdFullScreenInterface"));
            return;
        }
        java.lang.Object objG = g();
        kotlin.jvm.internal.Intrinsics.checkNotNull(objG, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface<com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener>");
        ((com.json.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface) objG).loadAd(getInstanceData().getAdData(), com.json.environment.ContextProvider.getInstance().getCurrentActiveActivity(), this);
    }
}
