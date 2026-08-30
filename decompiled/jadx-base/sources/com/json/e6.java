package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0011\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J1\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u0007HÆ\u0001J\t\u0010\r\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/ironsource/e6;", "Lcom/ironsource/r0;", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_SS, "", "Lcom/ironsource/mediationsdk/model/NetworkSettings;", "t", "Lcom/ironsource/r6;", "u", "userId", "providerList", com.json.pg.p, androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "toString", "", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "o", "()Ljava/lang/String;", "Ljava/util/List;", "j", "()Ljava/util/List;", "Lcom/ironsource/r6;", "v", "()Lcom/ironsource/r6;", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/ironsource/r6;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class e6 extends com.json.r0 {

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final java.lang.String userId;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private final java.util.List<com.json.mediationsdk.model.NetworkSettings> providerList;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private final com.json.r6 configs;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public e6(java.lang.String str, java.util.List<? extends com.json.mediationsdk.model.NetworkSettings> list, com.json.r6 configs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configs, "configs");
        com.ironsource.mediationsdk.IronSource.AD_UNIT ad_unit = com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER;
        com.json.l5 l5VarD = configs.d();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(l5VarD, "configs.bannerAuctionSettings");
        super(ad_unit, str, list, l5VarD, configs.a(), (int) (configs.b() / ((long) 1000)), configs.c(), configs.f(), -1, com.json.f6.b(configs), new com.json.f2(configs.j()), configs.e(), configs.l(), configs.n(), configs.m(), false, 32768, null);
        this.userId = str;
        this.providerList = list;
        this.configs = configs;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.json.e6 a(com.json.e6 e6Var, java.lang.String str, java.util.List list, com.json.r6 r6Var, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = e6Var.userId;
        }
        if ((i & 2) != 0) {
            list = e6Var.providerList;
        }
        if ((i & 4) != 0) {
            r6Var = e6Var.configs;
        }
        return e6Var.a(str, list, r6Var);
    }

    public final com.json.e6 a(java.lang.String userId, java.util.List<? extends com.json.mediationsdk.model.NetworkSettings> providerList, com.json.r6 configs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configs, "configs");
        return new com.json.e6(userId, providerList, configs);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.json.e6)) {
            return false;
        }
        com.json.e6 e6Var = (com.json.e6) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.userId, e6Var.userId) && kotlin.jvm.internal.Intrinsics.areEqual(this.providerList, e6Var.providerList) && kotlin.jvm.internal.Intrinsics.areEqual(this.configs, e6Var.configs);
    }

    public int hashCode() {
        java.lang.String str = this.userId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.util.List<com.json.mediationsdk.model.NetworkSettings> list = this.providerList;
        return ((iHashCode + (list != null ? list.hashCode() : 0)) * 31) + this.configs.hashCode();
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
        return "BannerAdManagerData(userId=" + this.userId + ", providerList=" + this.providerList + ", configs=" + this.configs + ')';
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final com.json.r6 getConfigs() {
        return this.configs;
    }

    public final com.json.r6 v() {
        return this.configs;
    }
}
