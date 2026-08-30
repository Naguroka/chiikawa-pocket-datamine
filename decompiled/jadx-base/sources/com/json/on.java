package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u000b¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0005\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u0002R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0014\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0012\u001a\u0004\b\f\u0010\u0013R\u0017\u0010\u0015\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\b\u0010\r\u001a\u0004\b\u0005\u0010\u000f¨\u0006\u0018"}, d2 = {"Lcom/ironsource/on;", "", "Lcom/ironsource/hm;", "Lcom/ironsource/d3;", "mapper", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/ironsource/ys;", "Lcom/ironsource/ys;", "d", "()Lcom/ironsource/ys;", "recordType", "", "b", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "advertiserBundleId", "Lcom/ironsource/dg;", "Lcom/ironsource/dg;", "()Lcom/ironsource/dg;", "adProvider", "adInstanceId", "<init>", "(Lcom/ironsource/ys;Ljava/lang/String;Lcom/ironsource/dg;Ljava/lang/String;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class on {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.json.ys recordType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final java.lang.String advertiserBundleId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final com.json.dg adProvider;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final java.lang.String adInstanceId;

    public on(com.json.ys recordType, java.lang.String advertiserBundleId, com.json.dg adProvider, java.lang.String adInstanceId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recordType, "recordType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(advertiserBundleId, "advertiserBundleId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adProvider, "adProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInstanceId, "adInstanceId");
        this.recordType = recordType;
        this.advertiserBundleId = advertiserBundleId;
        this.adProvider = adProvider;
        this.adInstanceId = adInstanceId;
    }

    public final com.json.d3 a(com.json.hm<com.json.on, com.json.d3> mapper) {
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
    public final java.lang.String getAdvertiserBundleId() {
        return this.advertiserBundleId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final com.json.ys getRecordType() {
        return this.recordType;
    }
}
