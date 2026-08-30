package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b1\u00102J\u001a\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0002J\u0010\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u0007J\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u0007J\u0010\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u0007J\u0006\u0010\t\u001a\u00020\u0005J\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\f0\u000bJ\u0006\u0010\n\u001a\u00020\u0005J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eJ\u0010\u0010\u0006\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010J\u0010\u0010\u0006\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0013J\u0010\u0010\u0006\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0014J\u0016\u0010\u0006\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017J\u0006\u0010\u0006\u001a\u00020\u0019J\u0006\u0010\u001a\u001a\u00020\u0012J\u0010\u0010\u0006\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bJ\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001dJ\u0016\u0010\u0006\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0016\u001a\u00020\u0015J\u0006\u0010\u001f\u001a\u00020\u0012J\u0006\u0010 \u001a\u00020\u000eJ\u0010\u0010\u0006\u001a\u00020\u00122\b\u0010\"\u001a\u0004\u0018\u00010!J\u0006\u0010#\u001a\u00020\u0012J\u0006\u0010$\u001a\u00020\u000eJ\u0010\u0010\t\u001a\u00020\u00122\b\u0010\"\u001a\u0004\u0018\u00010!J \u0010\t\u001a\u00020(2\b\u0010%\u001a\u0004\u0018\u00010\u00022\u0006\u0010&\u001a\u00020\u00192\u0006\u0010'\u001a\u00020\u0019J \u0010\u0006\u001a\u00020)2\b\u0010%\u001a\u0004\u0018\u00010\u00022\u0006\u0010&\u001a\u00020\u00192\u0006\u0010'\u001a\u00020\u0019J\u0016\u0010\u0006\u001a\u00020+2\u0006\u0010\"\u001a\u00020!2\u0006\u0010*\u001a\u00020)J\u0010\u0010\t\u001a\u00020\u00122\b\u0010,\u001a\u0004\u0018\u00010+J\u0010\u0010\u0006\u001a\u00020\u00122\b\u0010,\u001a\u0004\u0018\u00010+J\u000e\u0010\t\u001a\u00020\u00122\u0006\u0010-\u001a\u00020\u0002J\u0016\u0010\u0006\u001a\u00020\u00122\u0006\u0010.\u001a\u00020\u00192\u0006\u0010/\u001a\u00020\u0005J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u00100\u001a\u00020\u0002¨\u00063"}, d2 = {"Lcom/ironsource/hu;", "", "", com.json.xt.b, "sdkVersion", "Lorg/json/JSONObject;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Landroid/content/Context;", "context", "b", "c", "Ljava/util/concurrent/ConcurrentHashMap;", "", "d", "", "isDemandOnlyMode", "Lcom/ironsource/mediationsdk/sdk/LevelPlayInterstitialListener;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "Lcom/ironsource/mediationsdk/sdk/LevelPlayRewardedVideoBaseListener;", "Lcom/ironsource/mediationsdk/sdk/LevelPlayBannerListener;", "Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;", "adUnit", "Lcom/ironsource/au;", "loadAdConfig", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, "Lcom/ironsource/mediationsdk/model/Placement;", "placement", "Lcom/ironsource/mediationsdk/model/NetworkSettings;", "networkSettings", "g", "e", "Landroid/app/Activity;", "activity", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_HLS, "f", "description", "width", "height", "Lcom/unity3d/mediation/LevelPlayAdSize;", "Lcom/ironsource/mediationsdk/ISBannerSize;", "size", "Lcom/ironsource/mediationsdk/IronSourceBannerLayout;", "banner", com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE, "eventId", "data", com.ironsource.y8.h.W, "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class hu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final com.json.hu f2727a = new com.json.hu();

    private hu() {
    }

    private final org.json.JSONObject a(java.lang.String adapterVersion, java.lang.String sdkVersion) {
        return new org.json.JSONObject(kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.json.xt.b, adapterVersion), kotlin.TuplesKt.to("sdkVersion", sdkVersion)));
    }

    public final int a() {
        return com.json.im.INSTANCE.d().f().j();
    }

    public final com.json.mediationsdk.ISBannerSize a(java.lang.String description, int width, int height) {
        return new com.json.mediationsdk.ISBannerSize(description, width, height);
    }

    public final com.json.mediationsdk.IronSourceBannerLayout a(android.app.Activity activity, com.json.mediationsdk.ISBannerSize size) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(size, "size");
        com.json.mediationsdk.IronSourceBannerLayout ironSourceBannerLayoutB = com.json.mediationsdk.p.m().b(activity, size);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(ironSourceBannerLayoutB, "getInstance().createBanner(activity, size)");
        return ironSourceBannerLayoutB;
    }

    public final java.lang.String a(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        return com.json.z3.a(context, c(context));
    }

    public final java.lang.String a(com.json.mediationsdk.model.NetworkSettings networkSettings) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkSettings, "networkSettings");
        java.lang.String providerDefaultInstance = networkSettings.getProviderDefaultInstance();
        return providerDefaultInstance == null ? new java.lang.String() : providerDefaultInstance;
    }

    public final java.lang.String a(com.json.mediationsdk.model.Placement placement) {
        java.lang.String str;
        return (placement == null || (str = placement.getCom.ironsource.op.d java.lang.String()) == null) ? new java.lang.String() : str;
    }

    public final java.lang.String a(java.lang.String key) {
        java.util.List listSplit$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        try {
            if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) key, (java.lang.CharSequence) "-", false, 2, (java.lang.Object) null)) {
                java.lang.String str = (java.lang.String) kotlin.collections.CollectionsKt.last(kotlin.text.StringsKt.split$default((java.lang.CharSequence) key, new java.lang.String[]{"-"}, false, 0, 6, (java.lang.Object) null));
                if (!kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) "_", false, 2, (java.lang.Object) null)) {
                    return str;
                }
                listSplit$default = kotlin.text.StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{"_"}, false, 0, 6, (java.lang.Object) null);
            } else {
                if (!kotlin.text.StringsKt.contains$default((java.lang.CharSequence) key, (java.lang.CharSequence) "_", false, 2, (java.lang.Object) null)) {
                    return key;
                }
                listSplit$default = kotlin.text.StringsKt.split$default((java.lang.CharSequence) key, new java.lang.String[]{"_"}, false, 0, 6, (java.lang.Object) null);
            }
            return (java.lang.String) kotlin.collections.CollectionsKt.first(listSplit$default);
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(e.getMessage());
            return key;
        }
    }

    public final org.json.JSONObject a(boolean isDemandOnlyMode) {
        org.json.JSONObject mediationAdditionalData = com.json.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(isDemandOnlyMode);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(mediationAdditionalData, "getMediationAdditionalData(isDemandOnlyMode)");
        return mediationAdditionalData;
    }

    public final void a(int eventId, org.json.JSONObject data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
        com.json.wq.i().a(new com.json.wb(eventId, data));
    }

    public final void a(android.app.Activity activity) {
        if (activity != null) {
            com.json.mediationsdk.IronSource.showInterstitial(activity);
        } else {
            com.json.mediationsdk.IronSource.showInterstitial();
        }
    }

    public final void a(com.ironsource.mediationsdk.IronSource.AD_UNIT adUnit, com.json.au loadAdConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadAdConfig, "loadAdConfig");
        com.json.mediationsdk.p.m().a(adUnit, loadAdConfig);
    }

    public final void a(com.json.mediationsdk.IronSourceBannerLayout banner) {
        com.json.mediationsdk.IronSource.destroyBanner(banner);
    }

    public final void a(com.json.mediationsdk.sdk.LevelPlayBannerListener listener) {
        com.json.q5.a().b(listener);
    }

    public final void a(com.json.mediationsdk.sdk.LevelPlayInterstitialListener listener) {
        com.json.ng.a().b(listener);
    }

    public final void a(com.json.mediationsdk.sdk.LevelPlayRewardedVideoBaseListener listener) {
        com.json.zp.a().b(listener);
    }

    public final boolean a(com.json.mediationsdk.model.NetworkSettings networkSettings, com.ironsource.mediationsdk.IronSource.AD_UNIT adUnit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkSettings, "networkSettings");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        return networkSettings.isBidder(adUnit);
    }

    public final com.unity3d.mediation.LevelPlayAdSize b(java.lang.String description, int width, int height) {
        if ((description == null || description.length() == 0) || kotlin.jvm.internal.Intrinsics.areEqual(description, "CUSTOM")) {
            return com.unity3d.mediation.LevelPlayAdSize.INSTANCE.createCustomSize(width, height);
        }
        return kotlin.jvm.internal.Intrinsics.areEqual(description, com.json.mediationsdk.l.c) ? com.unity3d.mediation.LevelPlayAdSize.MEDIUM_RECTANGLE : com.unity3d.mediation.LevelPlayAdSize.INSTANCE.createAdSize$mediationsdk_release(description);
    }

    public final java.lang.String b(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        return com.json.z3.b(context, c(context));
    }

    public final org.json.JSONObject b() {
        org.json.JSONObject jSONObjectB = com.json.zd.a().b();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObjectB, "getProperties().toJSON()");
        return jSONObjectB;
    }

    public final void b(android.app.Activity activity) {
        if (activity != null) {
            com.json.mediationsdk.IronSource.showRewardedVideo(activity);
        } else {
            com.json.mediationsdk.IronSource.showRewardedVideo();
        }
    }

    public final void b(com.json.mediationsdk.IronSourceBannerLayout banner) {
        com.json.mediationsdk.IronSource.loadBanner(banner);
    }

    public final void b(java.lang.String message) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        com.json.mediationsdk.logger.IronLog.INTERNAL.error(message);
    }

    public final java.lang.String c(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        return com.json.z3.g(context);
    }

    public final org.json.JSONObject c() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.json.mediationsdk.adunit.adapter.internal.AdapterBaseWrapper> networkAdaptersMap = com.json.mediationsdk.c.b().d();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(networkAdaptersMap, "networkAdaptersMap");
            for (java.util.Map.Entry<java.lang.String, com.json.mediationsdk.adunit.adapter.internal.AdapterBaseWrapper> entry : networkAdaptersMap.entrySet()) {
                if (entry.getValue().getAdapterBaseInterface() != null) {
                    com.json.hu huVar = f2727a;
                    java.lang.String key = entry.getKey();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "entry.key");
                    java.lang.String strA = huVar.a(key);
                    com.json.mediationsdk.adunit.adapter.internal.AdapterBaseInterface adapterBaseInterface = entry.getValue().getAdapterBaseInterface();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adapterBaseInterface, "entry.value.adapterBaseInterface");
                    java.lang.String adapterVersion = adapterBaseInterface.getAdapterVersion();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adapterVersion, "adapterBaseInterface.adapterVersion");
                    jSONObject.putOpt(strA, huVar.a(adapterVersion, adapterBaseInterface.getNetworkSDKVersion()));
                }
            }
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
        }
        return jSONObject;
    }

    public final java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.List<java.lang.String>> d() {
        java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.List<java.lang.String>> concurrentHashMap = new java.util.concurrent.ConcurrentHashMap<>();
        concurrentHashMap.putAll(com.json.mediationsdk.c.b().c());
        concurrentHashMap.putAll(com.json.lk.b().c());
        return concurrentHashMap;
    }

    public final boolean e() {
        return com.json.mediationsdk.IronSource.isInterstitialReady();
    }

    public final boolean f() {
        return com.json.mediationsdk.IronSource.isRewardedVideoAvailable();
    }

    public final void g() {
        com.json.mediationsdk.IronSource.loadInterstitial();
    }

    public final void h() {
        com.json.mediationsdk.IronSource.loadRewardedVideo();
    }

    public final void i() {
        com.json.mediationsdk.p.m().R();
    }
}
