package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\"\u0010#J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0011\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\t\u0010\n\u001a\u00020\tHÆ\u0003J;\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\tHÆ\u0001J\t\u0010\u0010\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\r\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b \u0010!¨\u0006$"}, d2 = {"Lcom/ironsource/pq;", "Lcom/ironsource/r0;", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_SS, "", "Lcom/ironsource/mediationsdk/model/NetworkSettings;", "t", "Lcom/ironsource/uq;", "u", "", "v", "userId", "providerList", com.json.pg.p, "isManual", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "toString", "", "hashCode", "", "other", "equals", "Ljava/lang/String;", "o", "()Ljava/lang/String;", "Ljava/util/List;", "j", "()Ljava/util/List;", "Lcom/ironsource/uq;", "w", "()Lcom/ironsource/uq;", "Z", "x", "()Z", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/ironsource/uq;Z)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class pq extends com.json.r0 {

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final java.lang.String userId;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private final java.util.List<com.json.mediationsdk.model.NetworkSettings> providerList;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private final com.json.uq configs;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private final boolean isManual;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public pq(java.lang.String str, java.util.List<? extends com.json.mediationsdk.model.NetworkSettings> list, com.json.uq configs, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configs, "configs");
        com.ironsource.mediationsdk.IronSource.AD_UNIT ad_unit = com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO;
        com.json.l5 l5VarK = configs.k();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(l5VarK, "configs.rewardedVideoAuctionSettings");
        super(ad_unit, str, list, l5VarK, configs.g(), configs.h(), configs.j(), configs.b(), configs.c(), com.json.qq.b(configs, z), new com.json.f2(-1L), configs.l(), configs.f(), configs.o(), configs.n(), false, 32768, null);
        this.userId = str;
        this.providerList = list;
        this.configs = configs;
        this.isManual = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.json.pq a(com.json.pq pqVar, java.lang.String str, java.util.List list, com.json.uq uqVar, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = pqVar.userId;
        }
        if ((i & 2) != 0) {
            list = pqVar.providerList;
        }
        if ((i & 4) != 0) {
            uqVar = pqVar.configs;
        }
        if ((i & 8) != 0) {
            z = pqVar.isManual;
        }
        return pqVar.a(str, list, uqVar, z);
    }

    public final com.json.pq a(java.lang.String userId, java.util.List<? extends com.json.mediationsdk.model.NetworkSettings> providerList, com.json.uq configs, boolean isManual) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configs, "configs");
        return new com.json.pq(userId, providerList, configs, isManual);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.json.pq)) {
            return false;
        }
        com.json.pq pqVar = (com.json.pq) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.userId, pqVar.userId) && kotlin.jvm.internal.Intrinsics.areEqual(this.providerList, pqVar.providerList) && kotlin.jvm.internal.Intrinsics.areEqual(this.configs, pqVar.configs) && this.isManual == pqVar.isManual;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v8 */
    public int hashCode() {
        java.lang.String str = this.userId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.util.List<com.json.mediationsdk.model.NetworkSettings> list = this.providerList;
        int iHashCode2 = (((iHashCode + (list != null ? list.hashCode() : 0)) * 31) + this.configs.hashCode()) * 31;
        boolean z = this.isManual;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iHashCode2 + r1;
    }

    @Override // com.json.r0
    public java.util.List<com.json.mediationsdk.model.NetworkSettings> j() {
        return this.providerList;
    }

    @Override // com.json.r0
    /* JADX INFO: renamed from: o, reason: from getter */
    public java.lang.String getUserId() {
        return this.userId;
    }

    public final java.lang.String s() {
        return this.userId;
    }

    public final java.util.List<com.json.mediationsdk.model.NetworkSettings> t() {
        return this.providerList;
    }

    public java.lang.String toString() {
        return "RewardedVideoAdDataManager(userId=" + this.userId + ", providerList=" + this.providerList + ", configs=" + this.configs + ", isManual=" + this.isManual + ')';
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final com.json.uq getConfigs() {
        return this.configs;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final boolean getIsManual() {
        return this.isManual;
    }

    public final com.json.uq w() {
        return this.configs;
    }

    public final boolean x() {
        return this.isManual;
    }
}
