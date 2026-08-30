package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\u0006\u0010\u0013\u001a\u00020\u000b\u0012\u0006\u0010\u0014\u001a\u00020\u000b\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u0006\u0010\u0019\u001a\u00020\u000b¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u0005\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u0002R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0013\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0012\u0010\u000fR\u0017\u0010\u0014\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u0017\u0010\u0018\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0016\u001a\u0004\b\f\u0010\u0017R\u0017\u0010\u0019\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\b\u0010\r\u001a\u0004\b\u0005\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/ironsource/u;", "", "Lcom/ironsource/hm;", "Lcom/ironsource/c2;", "mapper", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/ironsource/ys;", "Lcom/ironsource/ys;", "f", "()Lcom/ironsource/ys;", "recordType", "", "b", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "advertiserBundleId", "c", "e", "networkInstanceId", "adUnitId", "Lcom/ironsource/dg;", "Lcom/ironsource/dg;", "()Lcom/ironsource/dg;", "adProvider", "adInstanceId", "<init>", "(Lcom/ironsource/ys;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ironsource/dg;Ljava/lang/String;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.json.ys recordType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final java.lang.String advertiserBundleId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final java.lang.String networkInstanceId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final java.lang.String adUnitId;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final com.json.dg adProvider;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final java.lang.String adInstanceId;

    public u(com.json.ys recordType, java.lang.String advertiserBundleId, java.lang.String networkInstanceId, java.lang.String adUnitId, com.json.dg adProvider, java.lang.String adInstanceId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recordType, "recordType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(advertiserBundleId, "advertiserBundleId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkInstanceId, "networkInstanceId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adProvider, "adProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInstanceId, "adInstanceId");
        this.recordType = recordType;
        this.advertiserBundleId = advertiserBundleId;
        this.networkInstanceId = networkInstanceId;
        this.adUnitId = adUnitId;
        this.adProvider = adProvider;
        this.adInstanceId = adInstanceId;
    }

    public final com.json.c2 a(com.json.hm<com.json.u, com.json.c2> mapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mapper, "mapper");
        return mapper.a(this);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final java.lang.String getAdInstanceId() {
        return this.adInstanceId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final com.json.dg getAdProvider() {
        return this.adProvider;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final java.lang.String getAdUnitId() {
        return this.adUnitId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final java.lang.String getAdvertiserBundleId() {
        return this.advertiserBundleId;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final java.lang.String getNetworkInstanceId() {
        return this.networkInstanceId;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final com.json.ys getRecordType() {
        return this.recordType;
    }
}
