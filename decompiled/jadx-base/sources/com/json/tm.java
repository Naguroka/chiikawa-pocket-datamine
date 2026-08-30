package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007J\b\u0010\t\u001a\u00020\u0005H\u0014J\b\u0010\n\u001a\u00020\u0005H\u0016J\u0018\u0010\u000f\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016R(\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R(\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006!"}, d2 = {"Lcom/ironsource/tm;", "Lcom/ironsource/y;", "Lcom/ironsource/mediationsdk/adunit/adapter/listener/NativeAdListener;", "Lcom/ironsource/g0;", "adInstancePresenter", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/ironsource/mm;", "nativeAdBinder", "z", "b", "Lcom/ironsource/mediationsdk/ads/nativead/AdapterNativeAdData;", "adapterNativeAdData", "Lcom/ironsource/mediationsdk/adunit/adapter/internal/nativead/AdapterNativeAdViewBinder;", "nativeAdViewBinder", "onAdLoadSuccess", "<set-?>", "v", "Lcom/ironsource/mediationsdk/ads/nativead/AdapterNativeAdData;", "H", "()Lcom/ironsource/mediationsdk/ads/nativead/AdapterNativeAdData;", "w", "Lcom/ironsource/mediationsdk/adunit/adapter/internal/nativead/AdapterNativeAdViewBinder;", "I", "()Lcom/ironsource/mediationsdk/adunit/adapter/internal/nativead/AdapterNativeAdViewBinder;", "Lcom/ironsource/t2;", "adTools", "Lcom/ironsource/z;", "instanceData", "Lcom/ironsource/c0;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Lcom/ironsource/t2;Lcom/ironsource/z;Lcom/ironsource/c0;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class tm extends com.json.y implements com.json.mediationsdk.adunit.adapter.listener.NativeAdListener {

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private com.json.mediationsdk.ads.nativead.AdapterNativeAdData adapterNativeAdData;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private com.json.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder nativeAdViewBinder;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tm(com.json.t2 adTools, com.json.z instanceData, com.json.c0 listener) {
        super(adTools, instanceData, listener);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adTools, "adTools");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instanceData, "instanceData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
    }

    /* JADX INFO: renamed from: H, reason: from getter */
    public final com.json.mediationsdk.ads.nativead.AdapterNativeAdData getAdapterNativeAdData() {
        return this.adapterNativeAdData;
    }

    /* JADX INFO: renamed from: I, reason: from getter */
    public final com.json.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder getNativeAdViewBinder() {
        return this.nativeAdViewBinder;
    }

    @Override // com.json.y
    public void a(com.json.g0 adInstancePresenter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInstancePresenter, "adInstancePresenter");
        adInstancePresenter.a(this);
    }

    public final void a(com.json.mm nativeAdBinder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nativeAdBinder, "nativeAdBinder");
        nativeAdBinder.a(this.adapterNativeAdData);
        nativeAdBinder.a(this.nativeAdViewBinder);
    }

    @Override // com.json.y
    public void b() {
        com.json.mediationsdk.logger.IronLog ironLog = com.json.mediationsdk.logger.IronLog.INTERNAL;
        ironLog.verbose(getInstanceSignature());
        if (g() == null) {
            ironLog.warning("adapter == null");
            return;
        }
        try {
            if (g() instanceof com.json.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface) {
                java.lang.Object objG = g();
                kotlin.jvm.internal.Intrinsics.checkNotNull(objG, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface<*>");
                ((com.json.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface) objG).destroyAd(getCurrentAdData());
            } else {
                ironLog.error(a("adapter not instance of AdapterNativeAdInterface"));
            }
        } catch (java.lang.Throwable th) {
            com.json.l9.d().a(th);
            java.lang.String str = "destroyNativeAd - exception = " + th.getLocalizedMessage();
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(a(str));
            getAdTools().getEventSender().getTroubleshoot().g(str);
        }
        super.b();
    }

    @Override // com.json.mediationsdk.adunit.adapter.listener.NativeAdListener
    public void onAdLoadSuccess(com.json.mediationsdk.ads.nativead.AdapterNativeAdData adapterNativeAdData, com.json.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder nativeAdViewBinder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adapterNativeAdData, "adapterNativeAdData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nativeAdViewBinder, "nativeAdViewBinder");
        this.adapterNativeAdData = adapterNativeAdData;
        this.nativeAdViewBinder = nativeAdViewBinder;
        super.onAdLoadSuccess();
    }

    @Override // com.json.y
    protected void z() {
        if (!(g() instanceof com.json.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface)) {
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(a("adapter not instance of AdapterNativeAdInterface"));
            return;
        }
        com.json.mediationsdk.adunit.adapter.utility.AdData currentAdData = getCurrentAdData();
        if (com.json.environment.ContextProvider.getInstance().getCurrentActiveActivity() == null) {
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(a("activity must not be null"));
            getAdTools().getEventSender().getTroubleshoot().g("activity must not be null");
            return;
        }
        java.lang.Object objG = g();
        kotlin.jvm.internal.Intrinsics.checkNotNull(objG, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface<com.ironsource.mediationsdk.adunit.adapter.listener.NativeAdListener>");
        android.app.Activity currentActiveActivity = com.json.environment.ContextProvider.getInstance().getCurrentActiveActivity();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(currentActiveActivity, "getInstance().currentActiveActivity");
        ((com.json.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface) objG).loadAd(currentAdData, currentActiveActivity, this);
    }
}
