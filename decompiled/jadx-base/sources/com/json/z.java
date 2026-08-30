package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\u0006\u0010\u0012\u001a\u00020\u0007\u0012\u0006\u0010\u0013\u001a\u00020\t\u0012\u0006\u0010\u0014\u001a\u00020\u000b\u0012\u0006\u0010\u0015\u001a\u00020\r\u0012\u0006\u0010\u0016\u001a\u00020\u000f¢\u0006\u0004\bR\u0010SJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0005\u001a\u00020\u0006HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\t\u0010\u000e\u001a\u00020\rHÆ\u0003J\t\u0010\u0010\u001a\u00020\u000fHÆ\u0003JE\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\r2\b\b\u0002\u0010\u0016\u001a\u00020\u000fHÆ\u0001J\t\u0010\u0018\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0019\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0011\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0012\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0013\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0014\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0015\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u0016\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u0003\u001a\u00020/8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0017\u00108\u001a\u0002048\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b5\u00107R\u0017\u0010=\u001a\u0002098\u0006¢\u0006\f\n\u0004\b\u001e\u0010:\u001a\u0004\b;\u0010<R\u0017\u0010A\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b'\u0010>\u001a\u0004\b?\u0010@R\u0017\u0010C\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b$\u0010,\u001a\u0004\bB\u0010.R\u0017\u0010E\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\bD\u0010>\u001a\u0004\bD\u0010@R\u0019\u0010G\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b?\u0010)\u001a\u0004\bF\u0010+R\u0017\u0010I\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b*\u0010>\u001a\u0004\bH\u0010@R\u0017\u0010K\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\bB\u0010>\u001a\u0004\bJ\u0010@R\u0017\u0010M\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bF\u0010,\u001a\u0004\bL\u0010.R\u0017\u0010Q\u001a\u00020N8\u0006¢\u0006\f\n\u0004\b;\u0010O\u001a\u0004\b0\u0010P¨\u0006T"}, d2 = {"Lcom/ironsource/z;", "", "Lcom/ironsource/n1$a;", "performance", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/ironsource/t1;", "Lcom/ironsource/mediationsdk/model/NetworkSettings;", "b", "Lcom/ironsource/g5;", "c", "Lcom/ironsource/z2;", "d", "Lcom/ironsource/j5;", "e", "", "f", "adUnitData", com.json.pr.b, "auctionData", "adapterConfig", "auctionResponseItem", "sessionDepth", "", "toString", "hashCode", "other", "", "equals", "Lcom/ironsource/t1;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, "()Lcom/ironsource/t1;", "Lcom/ironsource/mediationsdk/model/NetworkSettings;", "u", "()Lcom/ironsource/mediationsdk/model/NetworkSettings;", "Lcom/ironsource/g5;", "k", "()Lcom/ironsource/g5;", "Lcom/ironsource/z2;", "j", "()Lcom/ironsource/z2;", "Lcom/ironsource/j5;", com.json.zb.q, "()Lcom/ironsource/j5;", "I", "v", "()I", "Lcom/ironsource/f0;", "g", "Lcom/ironsource/f0;", "t", "()Lcom/ironsource/f0;", "Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_HLS, "Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;", "()Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;", com.json.mediationsdk.impressionData.ImpressionData.IMPRESSION_DATA_KEY_AD_FORMAT, "Lorg/json/JSONObject;", "Lorg/json/JSONObject;", "q", "()Lorg/json/JSONObject;", "genericParams", "Ljava/lang/String;", "m", "()Ljava/lang/String;", "auctionId", "o", "auctionTrial", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAM_TYPE_LIVE, com.json.mediationsdk.utils.IronSourceConstants.AUCTION_FALLBACK, androidx.media3.extractor.text.ttml.TtmlNode.TAG_P, "genericNotifications", com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, "instanceName", "w", com.unity3d.ads.metadata.InAppPurchaseMetaData.KEY_SIGNATURE, androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_SS, "instanceType", "Lcom/ironsource/mediationsdk/adunit/adapter/utility/AdData;", "Lcom/ironsource/mediationsdk/adunit/adapter/utility/AdData;", "()Lcom/ironsource/mediationsdk/adunit/adapter/utility/AdData;", "adData", "<init>", "(Lcom/ironsource/t1;Lcom/ironsource/mediationsdk/model/NetworkSettings;Lcom/ironsource/g5;Lcom/ironsource/z2;Lcom/ironsource/j5;I)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.json.t1 adUnitData;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final com.json.mediationsdk.model.NetworkSettings providerSettings;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final com.json.g5 auctionData;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final com.json.z2 adapterConfig;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final com.json.j5 auctionResponseItem;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final int sessionDepth;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final com.json.f0 performance;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final com.ironsource.mediationsdk.IronSource.AD_UNIT adFormat;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final org.json.JSONObject genericParams;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final java.lang.String auctionId;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final int auctionTrial;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final java.lang.String auctionFallback;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final com.json.j5 genericNotifications;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final java.lang.String instanceName;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final java.lang.String signature;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final int instanceType;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final com.json.mediationsdk.adunit.adapter.utility.AdData adData;

    public z(com.json.t1 adUnitData, com.json.mediationsdk.model.NetworkSettings providerSettings, com.json.g5 auctionData, com.json.z2 adapterConfig, com.json.j5 auctionResponseItem, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(auctionData, "auctionData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adapterConfig, "adapterConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(auctionResponseItem, "auctionResponseItem");
        this.adUnitData = adUnitData;
        this.providerSettings = providerSettings;
        this.auctionData = auctionData;
        this.adapterConfig = adapterConfig;
        this.auctionResponseItem = auctionResponseItem;
        this.sessionDepth = i;
        this.performance = new com.json.f0(com.ironsource.n1.a.DidntAttemptToLoad);
        com.ironsource.mediationsdk.IronSource.AD_UNIT adFormat = adUnitData.getAdProperties().getAdFormat();
        this.adFormat = adFormat;
        this.genericParams = auctionData.h();
        this.auctionId = auctionData.g();
        this.auctionTrial = auctionData.i();
        this.auctionFallback = auctionData.f();
        this.genericNotifications = auctionData.j();
        java.lang.String strF = adapterConfig.f();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strF, "adapterConfig.providerName");
        this.instanceName = strF;
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.String str = java.lang.String.format("%s %s", java.util.Arrays.copyOf(new java.lang.Object[]{strF, java.lang.Integer.valueOf(hashCode())}, 2));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
        this.signature = str;
        this.instanceType = adapterConfig.d();
        java.lang.String strK = auctionResponseItem.k();
        java.util.Map<java.lang.String, java.lang.Object> mapA = com.json.hk.a(auctionResponseItem.a());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(mapA, "jsonObjectToMap(auctionResponseItem.adData)");
        mapA.put("adUnit", adFormat);
        java.util.HashMap map = new java.util.HashMap();
        java.util.Map<java.lang.String, java.lang.Object> mapA2 = com.json.hk.a(adapterConfig.c());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(mapA2, "jsonObjectToMap(adapterConfig.adUnitSettings)");
        map.putAll(mapA2);
        mapA.put("userId", adUnitData.getUserId());
        mapA.put("adUnitId", adUnitData.getAdProperties().getAdUnitId());
        mapA.put("isMultipleAdUnits", java.lang.Boolean.TRUE);
        this.adData = new com.json.mediationsdk.adunit.adapter.utility.AdData(strK, map, mapA);
    }

    public static /* synthetic */ com.json.z a(com.json.z zVar, com.json.t1 t1Var, com.json.mediationsdk.model.NetworkSettings networkSettings, com.json.g5 g5Var, com.json.z2 z2Var, com.json.j5 j5Var, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            t1Var = zVar.adUnitData;
        }
        if ((i2 & 2) != 0) {
            networkSettings = zVar.providerSettings;
        }
        com.json.mediationsdk.model.NetworkSettings networkSettings2 = networkSettings;
        if ((i2 & 4) != 0) {
            g5Var = zVar.auctionData;
        }
        com.json.g5 g5Var2 = g5Var;
        if ((i2 & 8) != 0) {
            z2Var = zVar.adapterConfig;
        }
        com.json.z2 z2Var2 = z2Var;
        if ((i2 & 16) != 0) {
            j5Var = zVar.auctionResponseItem;
        }
        com.json.j5 j5Var2 = j5Var;
        if ((i2 & 32) != 0) {
            i = zVar.sessionDepth;
        }
        return zVar.a(t1Var, networkSettings2, g5Var2, z2Var2, j5Var2, i);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final com.json.t1 getAdUnitData() {
        return this.adUnitData;
    }

    public final com.json.z a(com.json.t1 adUnitData, com.json.mediationsdk.model.NetworkSettings providerSettings, com.json.g5 auctionData, com.json.z2 adapterConfig, com.json.j5 auctionResponseItem, int sessionDepth) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(auctionData, "auctionData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adapterConfig, "adapterConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(auctionResponseItem, "auctionResponseItem");
        return new com.json.z(adUnitData, providerSettings, auctionData, adapterConfig, auctionResponseItem, sessionDepth);
    }

    public final void a(com.ironsource.n1.a performance) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(performance, "performance");
        this.performance.b(performance);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final com.json.mediationsdk.model.NetworkSettings getProviderSettings() {
        return this.providerSettings;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final com.json.g5 getAuctionData() {
        return this.auctionData;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final com.json.z2 getAdapterConfig() {
        return this.adapterConfig;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final com.json.j5 getAuctionResponseItem() {
        return this.auctionResponseItem;
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.json.z)) {
            return false;
        }
        com.json.z zVar = (com.json.z) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.adUnitData, zVar.adUnitData) && kotlin.jvm.internal.Intrinsics.areEqual(this.providerSettings, zVar.providerSettings) && kotlin.jvm.internal.Intrinsics.areEqual(this.auctionData, zVar.auctionData) && kotlin.jvm.internal.Intrinsics.areEqual(this.adapterConfig, zVar.adapterConfig) && kotlin.jvm.internal.Intrinsics.areEqual(this.auctionResponseItem, zVar.auctionResponseItem) && this.sessionDepth == zVar.sessionDepth;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getSessionDepth() {
        return this.sessionDepth;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final com.json.mediationsdk.adunit.adapter.utility.AdData getAdData() {
        return this.adData;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final com.ironsource.mediationsdk.IronSource.AD_UNIT getAdFormat() {
        return this.adFormat;
    }

    public int hashCode() {
        return (((((((((this.adUnitData.hashCode() * 31) + this.providerSettings.hashCode()) * 31) + this.auctionData.hashCode()) * 31) + this.adapterConfig.hashCode()) * 31) + this.auctionResponseItem.hashCode()) * 31) + java.lang.Integer.hashCode(this.sessionDepth);
    }

    public final com.json.t1 i() {
        return this.adUnitData;
    }

    public final com.json.z2 j() {
        return this.adapterConfig;
    }

    public final com.json.g5 k() {
        return this.auctionData;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final java.lang.String getAuctionFallback() {
        return this.auctionFallback;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final java.lang.String getAuctionId() {
        return this.auctionId;
    }

    public final com.json.j5 n() {
        return this.auctionResponseItem;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final int getAuctionTrial() {
        return this.auctionTrial;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final com.json.j5 getGenericNotifications() {
        return this.genericNotifications;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final org.json.JSONObject getGenericParams() {
        return this.genericParams;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final java.lang.String getInstanceName() {
        return this.instanceName;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final int getInstanceType() {
        return this.instanceType;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final com.json.f0 getPerformance() {
        return this.performance;
    }

    public java.lang.String toString() {
        return "AdInstanceData(adUnitData=" + this.adUnitData + ", providerSettings=" + this.providerSettings + ", auctionData=" + this.auctionData + ", adapterConfig=" + this.adapterConfig + ", auctionResponseItem=" + this.auctionResponseItem + ", sessionDepth=" + this.sessionDepth + ')';
    }

    public final com.json.mediationsdk.model.NetworkSettings u() {
        return this.providerSettings;
    }

    public final int v() {
        return this.sessionDepth;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final java.lang.String getSignature() {
        return this.signature;
    }
}
