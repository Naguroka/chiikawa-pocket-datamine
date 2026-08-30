package com.json.mediationsdk.ads.nativead;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001DB\u0011\b\u0002\u0012\u0006\u0010A\u001a\u00020@¢\u0006\u0004\bB\u0010CJ\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tJ\b\u0010\r\u001a\u0004\u0018\u00010\fJ\"\u0010\u0014\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u0012\u0010\u0017\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016J\u0012\u0010\u0018\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016J\u0012\u0010\u0019\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u001bR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u001eR\u0018\u0010\"\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010&\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010)\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R(\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010*\u001a\u0004\u0018\u00010\u00128\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0014\u00102\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00105\u001a\u0004\u0018\u00010\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u0016\u00107\u001a\u0004\u0018\u00010\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u00104R\u0016\u00109\u001a\u0004\u0018\u00010\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u00104R\u0016\u0010;\u001a\u0004\u0018\u00010\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u00104R\u0016\u0010?\u001a\u0004\u0018\u00010<8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>¨\u0006E"}, d2 = {"Lcom/ironsource/mediationsdk/ads/nativead/LevelPlayNativeAd;", "Lcom/ironsource/mediationsdk/ads/nativead/interfaces/NativeAdInterface;", "Lcom/ironsource/mediationsdk/ads/nativead/interfaces/NativeAdDataInterface;", "Lcom/ironsource/mediationsdk/ads/nativead/internal/InternalNativeAdListener;", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "b", "loadAd", "destroyAd", "Lcom/ironsource/mediationsdk/ads/nativead/LevelPlayNativeAdListener;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setListener", "Ljava/util/UUID;", "getObjectId", "Lcom/ironsource/mediationsdk/adunit/adapter/utility/AdInfo;", "adInfo", "Lcom/ironsource/mediationsdk/ads/nativead/AdapterNativeAdData;", "adapterNativeAdData", "Lcom/ironsource/mediationsdk/adunit/adapter/internal/nativead/AdapterNativeAdViewBinder;", "nativeAdViewBinder", "onNativeAdLoaded", "Lcom/ironsource/mediationsdk/logger/IronSourceError;", "error", "onNativeAdLoadFailed", "onNativeAdImpression", "onNativeAdClicked", "", "Ljava/lang/String;", "mPlacementName", "Lcom/ironsource/mediationsdk/model/Placement;", "Lcom/ironsource/mediationsdk/model/Placement;", "mPlacement", "c", "Lcom/ironsource/mediationsdk/ads/nativead/LevelPlayNativeAdListener;", "mListener", "Lcom/ironsource/wm;", "d", "Lcom/ironsource/wm;", "mAdManager", "e", "Lcom/ironsource/mediationsdk/ads/nativead/AdapterNativeAdData;", "mAdapterNativeAdData", "<set-?>", "f", "Lcom/ironsource/mediationsdk/adunit/adapter/internal/nativead/AdapterNativeAdViewBinder;", "getNativeAdViewBinder", "()Lcom/ironsource/mediationsdk/adunit/adapter/internal/nativead/AdapterNativeAdViewBinder;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "g", "Ljava/util/concurrent/atomic/AtomicBoolean;", "mWasInitCalled", "getTitle", "()Ljava/lang/String;", com.ironsource.y8.h.D0, "getAdvertiser", com.ironsource.y8.h.F0, "getBody", "body", "getCallToAction", "callToAction", "Lcom/ironsource/mediationsdk/ads/nativead/interfaces/NativeAdDataInterface$Image;", "getIcon", "()Lcom/ironsource/mediationsdk/ads/nativead/interfaces/NativeAdDataInterface$Image;", com.ironsource.y8.h.H0, "Lcom/ironsource/mediationsdk/ads/nativead/LevelPlayNativeAd$Builder;", "builder", "<init>", "(Lcom/ironsource/mediationsdk/ads/nativead/LevelPlayNativeAd$Builder;)V", "Builder", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class LevelPlayNativeAd implements com.json.mediationsdk.ads.nativead.interfaces.NativeAdInterface, com.json.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface, com.json.mediationsdk.ads.nativead.internal.InternalNativeAdListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private java.lang.String mPlacementName;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private com.json.mediationsdk.model.Placement mPlacement;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private com.json.mediationsdk.ads.nativead.LevelPlayNativeAdListener mListener;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private com.json.wm mAdManager;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private com.json.mediationsdk.ads.nativead.AdapterNativeAdData mAdapterNativeAdData;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private com.json.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder nativeAdViewBinder;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final java.util.concurrent.atomic.AtomicBoolean mWasInitCalled;

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u0004\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005J\u0010\u0010\n\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\bJ\u0006\u0010\f\u001a\u00020\u000bR$\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u001a\u001a\u0004\u0018\u00010\u00058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/ironsource/mediationsdk/ads/nativead/LevelPlayNativeAd$Builder;", "", "", com.json.op.d, "withPlacementName", "Lcom/ironsource/mediationsdk/ads/nativead/LevelPlayNativeAdListener;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "withListener", "Landroid/app/Activity;", "activity", "withActivity", "Lcom/ironsource/mediationsdk/ads/nativead/LevelPlayNativeAd;", "build", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/lang/String;", "getMPlacementName$mediationsdk_release", "()Ljava/lang/String;", "setMPlacementName$mediationsdk_release", "(Ljava/lang/String;)V", "mPlacementName", "b", "Lcom/ironsource/mediationsdk/ads/nativead/LevelPlayNativeAdListener;", "getMListener$mediationsdk_release", "()Lcom/ironsource/mediationsdk/ads/nativead/LevelPlayNativeAdListener;", "setMListener$mediationsdk_release", "(Lcom/ironsource/mediationsdk/ads/nativead/LevelPlayNativeAdListener;)V", "mListener", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private java.lang.String mPlacementName;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private com.json.mediationsdk.ads.nativead.LevelPlayNativeAdListener mListener;

        public final com.json.mediationsdk.ads.nativead.LevelPlayNativeAd build() {
            return new com.json.mediationsdk.ads.nativead.LevelPlayNativeAd(this, null);
        }

        /* JADX INFO: renamed from: getMListener$mediationsdk_release, reason: from getter */
        public final com.json.mediationsdk.ads.nativead.LevelPlayNativeAdListener getMListener() {
            return this.mListener;
        }

        /* JADX INFO: renamed from: getMPlacementName$mediationsdk_release, reason: from getter */
        public final java.lang.String getMPlacementName() {
            return this.mPlacementName;
        }

        public final void setMListener$mediationsdk_release(com.json.mediationsdk.ads.nativead.LevelPlayNativeAdListener levelPlayNativeAdListener) {
            this.mListener = levelPlayNativeAdListener;
        }

        public final void setMPlacementName$mediationsdk_release(java.lang.String str) {
            this.mPlacementName = str;
        }

        public final com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAd.Builder withActivity(android.app.Activity activity) {
            com.json.environment.ContextProvider.getInstance().updateActivity(activity);
            com.json.mediationsdk.logger.IronLog.INTERNAL.verbose("activity is updated to: " + (activity != null ? activity.hashCode() : 0));
            return this;
        }

        public final com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAd.Builder withListener(com.json.mediationsdk.ads.nativead.LevelPlayNativeAdListener listener) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
            this.mListener = listener;
            return this;
        }

        public final com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAd.Builder withPlacementName(java.lang.String placementName) {
            this.mPlacementName = placementName;
            return this;
        }
    }

    private LevelPlayNativeAd(com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAd.Builder builder) {
        this.mWasInitCalled = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.mPlacementName = builder.getMPlacementName();
        this.mListener = builder.getMListener();
    }

    public /* synthetic */ LevelPlayNativeAd(com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAd.Builder builder, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }

    private final void a() {
        com.json.mediationsdk.ads.nativead.LevelPlayNativeAdListener levelPlayNativeAdListener = this.mListener;
        if (levelPlayNativeAdListener != null) {
            levelPlayNativeAdListener.onAdLoadFailed(this, com.json.mediationsdk.utils.ErrorBuilder.buildInitFailedError("init() has failed", com.json.mediationsdk.utils.IronSourceConstants.NATIVE_AD_UNIT));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.json.mediationsdk.ads.nativead.LevelPlayNativeAd this$0) {
        kotlin.Unit unit;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.b();
        com.json.wm wmVar = this$0.mAdManager;
        if (wmVar != null) {
            wmVar.a(this$0.mPlacement);
            unit = kotlin.Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            this$0.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.json.mediationsdk.ads.nativead.LevelPlayNativeAd this$0, com.json.mediationsdk.ads.nativead.AdapterNativeAdData adapterNativeAdData, com.json.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder nativeAdViewBinder, com.json.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adapterNativeAdData, "$adapterNativeAdData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nativeAdViewBinder, "$nativeAdViewBinder");
        this$0.mAdapterNativeAdData = adapterNativeAdData;
        this$0.nativeAdViewBinder = nativeAdViewBinder;
        com.json.mediationsdk.ads.nativead.LevelPlayNativeAdListener levelPlayNativeAdListener = this$0.mListener;
        if (levelPlayNativeAdListener != null) {
            levelPlayNativeAdListener.onAdLoaded(this$0, adInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.json.mediationsdk.ads.nativead.LevelPlayNativeAd this$0, com.json.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        com.json.mediationsdk.ads.nativead.LevelPlayNativeAdListener levelPlayNativeAdListener = this$0.mListener;
        if (levelPlayNativeAdListener != null) {
            levelPlayNativeAdListener.onAdClicked(this$0, adInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.json.mediationsdk.ads.nativead.LevelPlayNativeAd this$0, com.json.mediationsdk.logger.IronSourceError ironSourceError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        com.json.mediationsdk.ads.nativead.LevelPlayNativeAdListener levelPlayNativeAdListener = this$0.mListener;
        if (levelPlayNativeAdListener != null) {
            levelPlayNativeAdListener.onAdLoadFailed(this$0, ironSourceError);
        }
    }

    private final void b() {
        if (this.mWasInitCalled.compareAndSet(false, true)) {
            com.json.wm wmVarF = com.json.mediationsdk.p.m().f();
            this.mAdManager = wmVarF;
            if (wmVarF != null) {
                wmVarF.a(this);
                com.json.ym ymVarN = com.json.mediationsdk.p.m().n(this.mPlacementName);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(ymVarN, "getInstance().getNativeAdPlacement(mPlacementName)");
                this.mPlacement = new com.json.mediationsdk.model.Placement(ymVarN);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(com.json.mediationsdk.ads.nativead.LevelPlayNativeAd this$0, com.json.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        com.json.mediationsdk.ads.nativead.LevelPlayNativeAdListener levelPlayNativeAdListener = this$0.mListener;
        if (levelPlayNativeAdListener != null) {
            levelPlayNativeAdListener.onAdImpression(this$0, adInfo);
        }
    }

    @Override // com.json.mediationsdk.ads.nativead.interfaces.NativeAdInterface
    public void destroyAd() {
        com.json.mediationsdk.logger.IronLog.API.info(java.lang.String.valueOf(this));
        try {
            com.json.wm wmVar = this.mAdManager;
            if (wmVar != null) {
                wmVar.M();
            }
        } catch (java.lang.Throwable th) {
            com.json.l9.d().a(th);
            com.json.mediationsdk.logger.IronLog.API.error("destroyNativeAd()");
        }
    }

    @Override // com.json.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    public java.lang.String getAdvertiser() {
        com.json.mediationsdk.ads.nativead.AdapterNativeAdData adapterNativeAdData = this.mAdapterNativeAdData;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getAdvertiser();
        }
        return null;
    }

    @Override // com.json.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    public java.lang.String getBody() {
        com.json.mediationsdk.ads.nativead.AdapterNativeAdData adapterNativeAdData = this.mAdapterNativeAdData;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getBody();
        }
        return null;
    }

    @Override // com.json.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    public java.lang.String getCallToAction() {
        com.json.mediationsdk.ads.nativead.AdapterNativeAdData adapterNativeAdData = this.mAdapterNativeAdData;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getCallToAction();
        }
        return null;
    }

    @Override // com.json.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    public com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface.Image getIcon() {
        com.json.mediationsdk.ads.nativead.AdapterNativeAdData adapterNativeAdData = this.mAdapterNativeAdData;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getIcon();
        }
        return null;
    }

    public final com.json.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder getNativeAdViewBinder() {
        return this.nativeAdViewBinder;
    }

    public final java.util.UUID getObjectId() {
        com.json.wm wmVar = this.mAdManager;
        if (wmVar != null) {
            return wmVar.k();
        }
        return null;
    }

    @Override // com.json.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    public java.lang.String getTitle() {
        com.json.mediationsdk.ads.nativead.AdapterNativeAdData adapterNativeAdData = this.mAdapterNativeAdData;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getTitle();
        }
        return null;
    }

    @Override // com.json.mediationsdk.ads.nativead.interfaces.NativeAdInterface
    public void loadAd() {
        com.json.mediationsdk.logger.IronLog.API.info(java.lang.String.valueOf(this));
        java.lang.String initError = com.json.mediationsdk.p.m().e();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(initError, "initError");
        if (!(initError.length() > 0)) {
            com.json.environment.thread.IronSourceThreadManager.INSTANCE.getInitHandler().post(new java.lang.Runnable() { // from class: com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAd$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.json.mediationsdk.ads.nativead.LevelPlayNativeAd.a(this.f$0);
                }
            });
            return;
        }
        com.json.mediationsdk.ads.nativead.LevelPlayNativeAdListener levelPlayNativeAdListener = this.mListener;
        if (levelPlayNativeAdListener != null) {
            levelPlayNativeAdListener.onAdLoadFailed(this, com.json.mediationsdk.utils.ErrorBuilder.buildInitFailedError("loadAd(): " + initError, com.json.mediationsdk.utils.IronSourceConstants.NATIVE_AD_UNIT));
        }
    }

    @Override // com.json.mediationsdk.ads.nativead.internal.InternalNativeAdListener
    public void onNativeAdClicked(final com.json.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
        com.json.mediationsdk.logger.IronLog.CALLBACK.info(java.lang.String.valueOf(this));
        com.json.environment.thread.IronSourceThreadManager.postOnUiThreadTask$default(com.json.environment.thread.IronSourceThreadManager.INSTANCE, new java.lang.Runnable() { // from class: com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAd$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                com.json.mediationsdk.ads.nativead.LevelPlayNativeAd.a(this.f$0, adInfo);
            }
        }, 0L, 2, null);
    }

    @Override // com.json.mediationsdk.ads.nativead.internal.InternalNativeAdListener
    public void onNativeAdImpression(final com.json.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
        com.json.mediationsdk.logger.IronLog.CALLBACK.info(java.lang.String.valueOf(this));
        com.json.environment.thread.IronSourceThreadManager.postOnUiThreadTask$default(com.json.environment.thread.IronSourceThreadManager.INSTANCE, new java.lang.Runnable() { // from class: com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAd$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                com.json.mediationsdk.ads.nativead.LevelPlayNativeAd.b(this.f$0, adInfo);
            }
        }, 0L, 2, null);
    }

    @Override // com.json.mediationsdk.ads.nativead.internal.InternalNativeAdListener
    public void onNativeAdLoadFailed(final com.json.mediationsdk.logger.IronSourceError error) {
        com.json.mediationsdk.logger.IronLog.CALLBACK.info(java.lang.String.valueOf(this));
        com.json.environment.thread.IronSourceThreadManager.postOnUiThreadTask$default(com.json.environment.thread.IronSourceThreadManager.INSTANCE, new java.lang.Runnable() { // from class: com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAd$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                com.json.mediationsdk.ads.nativead.LevelPlayNativeAd.a(this.f$0, error);
            }
        }, 0L, 2, null);
    }

    @Override // com.json.mediationsdk.ads.nativead.internal.InternalNativeAdListener
    public void onNativeAdLoaded(final com.json.mediationsdk.adunit.adapter.utility.AdInfo adInfo, final com.json.mediationsdk.ads.nativead.AdapterNativeAdData adapterNativeAdData, final com.json.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder nativeAdViewBinder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adapterNativeAdData, "adapterNativeAdData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nativeAdViewBinder, "nativeAdViewBinder");
        com.json.mediationsdk.logger.IronLog.CALLBACK.info(java.lang.String.valueOf(this));
        com.json.environment.thread.IronSourceThreadManager.postOnUiThreadTask$default(com.json.environment.thread.IronSourceThreadManager.INSTANCE, new java.lang.Runnable() { // from class: com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAd$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                com.json.mediationsdk.ads.nativead.LevelPlayNativeAd.a(this.f$0, adapterNativeAdData, nativeAdViewBinder, adInfo);
            }
        }, 0L, 2, null);
    }

    public final void setListener(com.json.mediationsdk.ads.nativead.LevelPlayNativeAdListener listener) {
        this.mListener = listener;
    }
}
