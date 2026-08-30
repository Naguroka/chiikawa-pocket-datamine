package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u00032\u00020\u0004BI\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0014\u0010$\u001a\u0010\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010#\u0018\u00010\"\u0012\b\u0010&\u001a\u0004\u0018\u00010%\u0012\u0006\u0010(\u001a\u00020'\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b*\u0010+J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\u000b\u001a\u00020\tH\u0002J\b\u0010\f\u001a\u00020\tH\u0014J\u0006\u0010\r\u001a\u00020\tJ\u0018\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\u000f\u001a\u00020\tH\u0016J\u001c\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016R(\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u00058\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R(\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u00078\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006,"}, d2 = {"Lcom/ironsource/an;", "Lcom/ironsource/n7;", "Lcom/ironsource/o2;", "Lcom/ironsource/mediationsdk/adunit/adapter/listener/NativeAdListener;", "Lcom/ironsource/a2;", "Lcom/ironsource/mediationsdk/ads/nativead/AdapterNativeAdData;", "adapterNativeAdData", "Lcom/ironsource/mediationsdk/adunit/adapter/internal/nativead/AdapterNativeAdViewBinder;", "nativeAdViewBinder", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "J", com.google.android.gms.ads.RequestConfiguration.MAX_AD_CONTENT_RATING_G, "P", "onAdLoadSuccess", com.json.ju.c, "Lcom/ironsource/y1;", androidx.core.app.NotificationCompat.CATEGORY_EVENT, "", "", "", "<set-?>", com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, "Lcom/ironsource/mediationsdk/ads/nativead/AdapterNativeAdData;", "Q", "()Lcom/ironsource/mediationsdk/ads/nativead/AdapterNativeAdData;", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_SS, "Lcom/ironsource/mediationsdk/adunit/adapter/internal/nativead/AdapterNativeAdViewBinder;", "R", "()Lcom/ironsource/mediationsdk/adunit/adapter/internal/nativead/AdapterNativeAdViewBinder;", "Lcom/ironsource/pp;", "threadInterface", "Lcom/ironsource/j1;", "adSmashData", "Lcom/ironsource/mediationsdk/adunit/adapter/internal/BaseAdAdapter;", "Lcom/ironsource/mediationsdk/adunit/adapter/internal/listener/AdapterAdListener;", "adapter", "Lcom/ironsource/mediationsdk/model/Placement;", "placement", "Lcom/ironsource/j5;", "item", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Lcom/ironsource/pp;Lcom/ironsource/j1;Lcom/ironsource/mediationsdk/adunit/adapter/internal/BaseAdAdapter;Lcom/ironsource/mediationsdk/model/Placement;Lcom/ironsource/j5;Lcom/ironsource/o2;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class an extends com.json.n7<com.json.o2> implements com.json.mediationsdk.adunit.adapter.listener.NativeAdListener, com.json.a2 {

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private com.json.mediationsdk.ads.nativead.AdapterNativeAdData adapterNativeAdData;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private com.json.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder nativeAdViewBinder;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public an(com.json.pp threadInterface, com.json.j1 adSmashData, com.json.mediationsdk.adunit.adapter.internal.BaseAdAdapter<?, com.json.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener> baseAdAdapter, com.json.mediationsdk.model.Placement placement, com.json.j5 item, com.json.o2 o2Var) {
        super(threadInterface, adSmashData, baseAdAdapter, new com.json.z2(adSmashData.g(), adSmashData.g().getNativeAdSettings(), com.ironsource.mediationsdk.IronSource.AD_UNIT.NATIVE_AD), item, o2Var);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(threadInterface, "threadInterface");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adSmashData, "adSmashData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "item");
        this.g = placement;
    }

    private final void J() {
        com.json.bv bvVar;
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose(d());
        if (y()) {
            super.onAdOpened();
            return;
        }
        if (this.e != com.ironsource.n7.h.FAILED) {
            kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
            java.lang.String str = java.lang.String.format("unexpected onAdOpened for %s, state - %s", java.util.Arrays.copyOf(new java.lang.Object[]{k(), this.e}, 2));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
            com.json.b2 b2Var = this.d;
            if (b2Var == null || (bvVar = b2Var.k) == null) {
                return;
            }
            bvVar.p(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.json.an this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.J();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.json.an this$0, com.json.mediationsdk.ads.nativead.AdapterNativeAdData adapterNativeAdData, com.json.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder nativeAdViewBinder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adapterNativeAdData, "$adapterNativeAdData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nativeAdViewBinder, "$nativeAdViewBinder");
        this$0.a(adapterNativeAdData, nativeAdViewBinder);
    }

    private final void a(com.json.mediationsdk.ads.nativead.AdapterNativeAdData adapterNativeAdData, com.json.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder nativeAdViewBinder) {
        this.adapterNativeAdData = adapterNativeAdData;
        this.nativeAdViewBinder = nativeAdViewBinder;
        super.onAdLoadSuccess();
    }

    @Override // com.json.n7
    protected void G() {
        com.json.bv bvVar;
        if (!(this.c instanceof com.json.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface)) {
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(a("adapter not instance of AdapterNativeAdInterface"));
            return;
        }
        if (com.json.environment.ContextProvider.getInstance().getCurrentActiveActivity() == null) {
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(a("activity must not be null"));
            com.json.b2 b2Var = this.d;
            if (b2Var == null || (bvVar = b2Var.k) == null) {
                return;
            }
            bvVar.g("activity must not be null");
            return;
        }
        java.lang.Object obj = this.c;
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface<com.ironsource.mediationsdk.adunit.adapter.listener.NativeAdListener>");
        com.json.mediationsdk.adunit.adapter.utility.AdData mCurrentAdData = this.k;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(mCurrentAdData, "mCurrentAdData");
        android.app.Activity currentActiveActivity = com.json.environment.ContextProvider.getInstance().getCurrentActiveActivity();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(currentActiveActivity, "getInstance().currentActiveActivity");
        ((com.json.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface) obj).loadAd(mCurrentAdData, currentActiveActivity, this);
    }

    public final void P() {
        com.json.bv bvVar;
        com.json.vl vlVar;
        com.json.mediationsdk.logger.IronLog ironLog = com.json.mediationsdk.logger.IronLog.INTERNAL;
        ironLog.verbose(k());
        a(com.ironsource.n7.h.NONE);
        java.lang.Object obj = this.c;
        if (obj == null) {
            ironLog.warning("mAdapter == null");
            return;
        }
        try {
            if (obj instanceof com.json.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface<*>");
                com.json.mediationsdk.adunit.adapter.utility.AdData mCurrentAdData = this.k;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(mCurrentAdData, "mCurrentAdData");
                ((com.json.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface) obj).destroyAd(mCurrentAdData);
            } else {
                ironLog.error(a("adapter not instance of AdapterNativeAdInterface"));
            }
        } catch (java.lang.Throwable th) {
            com.json.l9.d().a(th);
            java.lang.String str = "destroyNativeAd - exception = " + th.getLocalizedMessage();
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(a(str));
            com.json.b2 b2Var = this.d;
            if (b2Var != null && (bvVar = b2Var.k) != null) {
                bvVar.g(str);
            }
        }
        com.json.b2 b2Var2 = this.d;
        if (b2Var2 == null || (vlVar = b2Var2.g) == null) {
            return;
        }
        java.lang.Integer sessionDepth = r();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sessionDepth, "sessionDepth");
        vlVar.a(sessionDepth.intValue());
    }

    /* JADX INFO: renamed from: Q, reason: from getter */
    public final com.json.mediationsdk.ads.nativead.AdapterNativeAdData getAdapterNativeAdData() {
        return this.adapterNativeAdData;
    }

    /* JADX INFO: renamed from: R, reason: from getter */
    public final com.json.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder getNativeAdViewBinder() {
        return this.nativeAdViewBinder;
    }

    @Override // com.json.n7, com.json.a2
    public java.util.Map<java.lang.String, java.lang.Object> a(com.json.y1 event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "event");
        java.util.Map<java.lang.String, java.lang.Object> data = super.a(event);
        if (this.g != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(data, "data");
            data.put("placement", j());
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(data, "data");
        return data;
    }

    @Override // com.json.mediationsdk.adunit.adapter.listener.NativeAdListener
    public void onAdLoadSuccess(final com.json.mediationsdk.ads.nativead.AdapterNativeAdData adapterNativeAdData, final com.json.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder nativeAdViewBinder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adapterNativeAdData, "adapterNativeAdData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nativeAdViewBinder, "nativeAdViewBinder");
        if (u().c()) {
            u().a(new java.lang.Runnable() { // from class: com.ironsource.an$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    com.json.an.a(this.f$0, adapterNativeAdData, nativeAdViewBinder);
                }
            });
        } else {
            a(adapterNativeAdData, nativeAdViewBinder);
        }
    }

    @Override // com.json.n7, com.json.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdOpened() {
        if (u().c()) {
            u().a(new java.lang.Runnable() { // from class: com.ironsource.an$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.json.an.a(this.f$0);
                }
            });
        } else {
            J();
        }
    }
}
