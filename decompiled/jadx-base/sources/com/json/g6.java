package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019B\t\b\u0010¢\u0006\u0004\b\u0018\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\f\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/ironsource/g6;", "Lcom/ironsource/c1;", "Lcom/unity3d/mediation/LevelPlayAdSize;", "f", "Lcom/unity3d/mediation/LevelPlayAdSize;", "g", "()Lcom/unity3d/mediation/LevelPlayAdSize;", com.ironsource.y8.h.O, "", "Ljava/lang/Boolean;", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_HLS, "()Ljava/lang/Boolean;", "autoRefresh", "", "Ljava/lang/Long;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, "()Ljava/lang/Long;", "refreshInterval", "", "adUnitId", "Lcom/ironsource/mediationsdk/model/Placement;", "placement", "Lcom/ironsource/au;", "testSuiteLoadAdConfig", "<init>", "(Ljava/lang/String;Lcom/ironsource/mediationsdk/model/Placement;Lcom/unity3d/mediation/LevelPlayAdSize;Ljava/lang/Boolean;Ljava/lang/Long;Lcom/ironsource/au;)V", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class g6 extends com.json.c1 {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final com.unity3d.mediation.LevelPlayAdSize adSize;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final java.lang.Boolean autoRefresh;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final java.lang.Long refreshInterval;

    public g6() {
        this("", null, null, null, null, null, 62, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6(java.lang.String adUnitId, com.json.mediationsdk.model.Placement placement, com.unity3d.mediation.LevelPlayAdSize adSize, java.lang.Boolean bool, java.lang.Long l, com.json.au auVar) {
        super(com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER, adUnitId, placement, auVar);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adSize, "adSize");
        this.adSize = adSize;
        this.autoRefresh = bool;
        this.refreshInterval = l;
    }

    public /* synthetic */ g6(java.lang.String str, com.json.mediationsdk.model.Placement placement, com.unity3d.mediation.LevelPlayAdSize levelPlayAdSize, java.lang.Boolean bool, java.lang.Long l, com.json.au auVar, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : placement, (i & 4) != 0 ? com.unity3d.mediation.LevelPlayAdSize.BANNER : levelPlayAdSize, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : l, (i & 32) == 0 ? auVar : null);
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final com.unity3d.mediation.LevelPlayAdSize getAdSize() {
        return this.adSize;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final java.lang.Boolean getAutoRefresh() {
        return this.autoRefresh;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final java.lang.Long getRefreshInterval() {
        return this.refreshInterval;
    }
}
