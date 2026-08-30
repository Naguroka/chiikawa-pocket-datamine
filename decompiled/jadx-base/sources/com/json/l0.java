package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b0\u00101J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\t\u0010\n\u001a\u00020\tHÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\tHÆ\u0001R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\r\u0010\u000eR\"\u0010\u0015\u001a\u00020\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\n\u0010\u0014R\"\u0010\u001b\u001a\u00020\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\n\u0010\u001aR\"\u0010!\u001a\u00020\u001c8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b\n\u0010 R\"\u0010'\u001a\u00020\"8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010#\u001a\u0004\b$\u0010%\"\u0004\b\n\u0010&R\u0011\u0010(\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0019R\u0011\u0010*\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b)\u0010\u0019R\u0011\u0010-\u001a\u00020+8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010,R\u0011\u0010/\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b.\u0010\u0019¨\u00062"}, d2 = {"Lcom/ironsource/l0;", "", "other", "", "equals", "", "hashCode", "", "toString", "Lcom/ironsource/mj;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, com.ironsource.y8.h.p0, "Lcom/ironsource/mj;", "d", "()Lcom/ironsource/mj;", "Lcom/ironsource/dg;", "b", "Lcom/ironsource/dg;", "e", "()Lcom/ironsource/dg;", "(Lcom/ironsource/dg;)V", "adProvider", "c", "Ljava/lang/String;", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_HLS, "()Ljava/lang/String;", "(Ljava/lang/String;)V", "advertiserBundleId", "Lcom/ironsource/k1;", "Lcom/ironsource/k1;", "f", "()Lcom/ironsource/k1;", "(Lcom/ironsource/k1;)V", "adStatus", "", "D", "j", "()D", "(D)V", "lastStatusUpdateTimeStamp", com.ironsource.sdk.controller.f.b.c, "g", "adUnitId", "Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;", "()Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;", com.json.mediationsdk.impressionData.ImpressionData.IMPRESSION_DATA_KEY_AD_FORMAT, androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, "instanceId", "<init>", "(Lcom/ironsource/mj;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class l0 {
    public static final java.lang.String g = "0";
    public static final java.lang.String h = "0";
    public static final java.lang.String i = "0";
    public static final java.lang.String j = "0";

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.json.mj adInstance;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private com.json.dg adProvider;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private java.lang.String advertiserBundleId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private com.json.k1 adStatus;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private double lastStatusUpdateTimeStamp;

    public l0(com.json.mj adInstance) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        this.adInstance = adInstance;
        this.adProvider = com.json.dg.UnknownProvider;
        this.advertiserBundleId = "0";
        this.adStatus = com.json.k1.LOAD_REQUEST;
        this.lastStatusUpdateTimeStamp = new java.util.Date().getTime() / 1000.0d;
    }

    public static /* synthetic */ com.json.l0 a(com.json.l0 l0Var, com.json.mj mjVar, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            mjVar = l0Var.adInstance;
        }
        return l0Var.a(mjVar);
    }

    public final com.json.l0 a(com.json.mj adInstance) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        return new com.json.l0(adInstance);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final com.json.mj getAdInstance() {
        return this.adInstance;
    }

    public final void a(double d) {
        this.lastStatusUpdateTimeStamp = d;
    }

    public final void a(com.json.dg dgVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dgVar, "<set-?>");
        this.adProvider = dgVar;
    }

    public final void a(com.json.k1 k1Var) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(k1Var, "<set-?>");
        this.adStatus = k1Var;
    }

    public final void a(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.advertiserBundleId = str;
    }

    public final com.ironsource.mediationsdk.IronSource.AD_UNIT b() {
        if (this.adInstance.i()) {
            return com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER;
        }
        return this.adInstance.n() ? com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO : com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL;
    }

    public final java.lang.String c() {
        java.lang.String strE = this.adInstance.e();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strE, "adInstance.id");
        return strE;
    }

    public final com.json.mj d() {
        return this.adInstance;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final com.json.dg getAdProvider() {
        return this.adProvider;
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.json.l0)) {
            return false;
        }
        com.json.l0 l0Var = (com.json.l0) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(c(), l0Var.c()) && kotlin.jvm.internal.Intrinsics.areEqual(g(), l0Var.g()) && b() == l0Var.b() && kotlin.jvm.internal.Intrinsics.areEqual(i(), l0Var.i()) && this.adProvider == l0Var.adProvider && kotlin.jvm.internal.Intrinsics.areEqual(this.advertiserBundleId, l0Var.advertiserBundleId) && this.adStatus == l0Var.adStatus;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final com.json.k1 getAdStatus() {
        return this.adStatus;
    }

    public final java.lang.String g() {
        java.lang.String strC = this.adInstance.c();
        return strC == null ? "0" : strC;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final java.lang.String getAdvertiserBundleId() {
        return this.advertiserBundleId;
    }

    public int hashCode() {
        return java.util.Objects.hash(c(), g(), b(), i(), this.adProvider, this.advertiserBundleId, this.adStatus, java.lang.Double.valueOf(this.lastStatusUpdateTimeStamp));
    }

    public final java.lang.String i() {
        java.lang.String strG = this.adInstance.g();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strG, "adInstance.name");
        return strG;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final double getLastStatusUpdateTimeStamp() {
        return this.lastStatusUpdateTimeStamp;
    }

    public java.lang.String toString() {
        java.lang.String string = new org.json.JSONObject().put(com.ironsource.sdk.controller.f.b.c, c()).put("advertiserBundleId", this.advertiserBundleId).put("adProvider", this.adProvider.ordinal()).put("adStatus", this.adStatus.ordinal()).put("lastStatusUpdateTimeStamp", (long) this.lastStatusUpdateTimeStamp).put("adUnitId", g()).put(com.json.mediationsdk.impressionData.ImpressionData.IMPRESSION_DATA_KEY_AD_FORMAT, b().toString()).put("instanceId", i()).toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "JSONObject()\n        .pu…ceId)\n        .toString()");
        return string;
    }
}
