package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0019\b\u0086\b\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0007B'\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\n\u0012\u0006\u0010\u0012\u001a\u00020\f\u0012\u0006\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b/\u00100J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\t\u001a\u00020\bHÆ\u0003J\t\u0010\u000b\u001a\u00020\nHÆ\u0003J\t\u0010\r\u001a\u00020\fHÆ\u0003J\t\u0010\u000f\u001a\u00020\u000eHÆ\u0003J1\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\n2\b\b\u0002\u0010\u0012\u001a\u00020\f2\b\b\u0002\u0010\u0013\u001a\u00020\u000eHÆ\u0001J\t\u0010\u0015\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0016HÖ\u0001J\u0013\u0010\u001a\u001a\u00020\n2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003R\u001a\u0010\u0010\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0011\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!R\u0017\u0010\u0012\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010,\u001a\u00020\u00148\u0016X\u0096D¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b*\u0010+R\u001a\u0010.\u001a\u00020\u00148\u0016X\u0096D¢\u0006\f\n\u0004\b\r\u0010)\u001a\u0004\b-\u0010+¨\u00061"}, d2 = {"Lcom/ironsource/j6;", "Lcom/ironsource/t1;", "Lcom/ironsource/mediationsdk/model/NetworkSettings;", com.json.pr.b, "Lorg/json/JSONObject;", "b", "Lcom/ironsource/mediationsdk/adunit/adapter/utility/AdData;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/ironsource/g6;", "w", "", "x", "Lcom/ironsource/s1;", "y", "Lcom/ironsource/r6;", "z", "adProperties", "isPublisherLoad", "adUnitCommonData", com.json.pg.p, "", "toString", "", "hashCode", "", "other", "equals", "t", "Lcom/ironsource/g6;", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "()Lcom/ironsource/g6;", "u", "Z", "()Z", "v", "Lcom/ironsource/s1;", "B", "()Lcom/ironsource/s1;", "Lcom/ironsource/r6;", "C", "()Lcom/ironsource/r6;", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "adUnitPrefix", "j", "managerName", "<init>", "(Lcom/ironsource/g6;ZLcom/ironsource/s1;Lcom/ironsource/r6;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class j6 extends com.json.t1 {

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    public static final com.json.j6.Companion INSTANCE = new com.json.j6.Companion(null);

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private final com.json.g6 adProperties;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private final boolean isPublisherLoad;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private final com.json.s1 adUnitCommonData;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final com.json.r6 configs;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final java.lang.String adUnitPrefix;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final java.lang.String managerName;

    /* JADX INFO: renamed from: com.ironsource.j6$a, reason: from kotlin metadata */
    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\f"}, d2 = {"Lcom/ironsource/j6$a;", "", "Lcom/ironsource/g6;", "adProperties", "Lcom/ironsource/al;", "levelPlayConfig", "", "isPublisherLoad", "Lcom/ironsource/j6;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final com.json.j6 a(com.json.g6 adProperties, com.json.al levelPlayConfig, boolean isPublisherLoad) {
            java.util.List<com.json.vn> listEmptyList;
            com.json.hs hsVarD;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adProperties, "adProperties");
            com.json.t1.Companion companion = com.json.t1.INSTANCE;
            com.json.p8 p8VarC = (levelPlayConfig == null || (hsVarD = levelPlayConfig.d()) == null) ? null : hsVarD.c();
            com.json.r6 bannerConfigurations = p8VarC != null ? p8VarC.getBannerConfigurations() : null;
            if (bannerConfigurations == null) {
                throw new java.lang.IllegalStateException("Error getting " + adProperties.getAdFormat() + " configurations");
            }
            if (levelPlayConfig == null || (listEmptyList = levelPlayConfig.c(adProperties.c(), adProperties.getAdUnitId())) == null) {
                listEmptyList = kotlin.collections.CollectionsKt.emptyList();
            }
            java.lang.String userIdForNetworks = com.json.mediationsdk.utils.IronSourceUtils.getUserIdForNetworks();
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(listEmptyList, 10));
            java.util.Iterator<T> it = listEmptyList.iterator();
            while (it.hasNext()) {
                arrayList.add(((com.json.vn) it.next()).f());
            }
            com.json.lk lkVarB = com.json.lk.b();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lkVarB, "getInstance()");
            return new com.json.j6(adProperties, isPublisherLoad, new com.json.s1(userIdForNetworks, arrayList, lkVarB), bannerConfigurations);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public j6(com.json.g6 adProperties, boolean z, com.json.s1 adUnitCommonData, com.json.r6 configs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitCommonData, "adUnitCommonData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configs, "configs");
        java.lang.String strF = adUnitCommonData.f();
        java.util.List<com.json.mediationsdk.model.NetworkSettings> listD = adUnitCommonData.d();
        com.json.lk lkVarE = adUnitCommonData.e();
        com.json.l5 l5VarD = configs.d();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(l5VarD, "configs.bannerAuctionSettings");
        super(adProperties, z, strF, listD, lkVarE, l5VarD, configs.a(), (int) (configs.b() / ((long) 1000)), configs.c(), configs.f(), -1, new com.json.l2(com.ironsource.l2.a.MANUAL_WITH_AUTOMATIC_RELOAD, configs.d().j(), configs.d().b(), 1000 * ((long) configs.h())), configs.e(), configs.l(), configs.n(), configs.m(), false, 65536, null);
        this.adProperties = adProperties;
        this.isPublisherLoad = z;
        this.adUnitCommonData = adUnitCommonData;
        this.configs = configs;
        this.adUnitPrefix = "BN";
        this.managerName = com.json.bl.MADU_BN_MANAGER_NAME;
    }

    public static /* synthetic */ com.json.j6 a(com.json.j6 j6Var, com.json.g6 g6Var, boolean z, com.json.s1 s1Var, com.json.r6 r6Var, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            g6Var = j6Var.adProperties;
        }
        if ((i & 2) != 0) {
            z = j6Var.isPublisherLoad;
        }
        if ((i & 4) != 0) {
            s1Var = j6Var.adUnitCommonData;
        }
        if ((i & 8) != 0) {
            r6Var = j6Var.configs;
        }
        return j6Var.a(g6Var, z, s1Var, r6Var);
    }

    @Override // com.json.t1
    /* JADX INFO: renamed from: A, reason: from getter */
    public com.json.g6 getAdProperties() {
        return this.adProperties;
    }

    /* JADX INFO: renamed from: B, reason: from getter */
    public final com.json.s1 getAdUnitCommonData() {
        return this.adUnitCommonData;
    }

    /* JADX INFO: renamed from: C, reason: from getter */
    public final com.json.r6 getConfigs() {
        return this.configs;
    }

    public final com.json.j6 a(com.json.g6 adProperties, boolean isPublisherLoad, com.json.s1 adUnitCommonData, com.json.r6 configs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitCommonData, "adUnitCommonData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configs, "configs");
        return new com.json.j6(adProperties, isPublisherLoad, adUnitCommonData, configs);
    }

    @Override // com.json.t1
    public com.json.mediationsdk.adunit.adapter.utility.AdData a(com.json.mediationsdk.model.NetworkSettings providerSettings) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        com.json.mediationsdk.adunit.adapter.utility.AdData adDataCreateAdDataForNetworkAdapter = com.json.mediationsdk.adunit.adapter.utility.AdData.createAdDataForNetworkAdapter(b(providerSettings), getAdProperties().getAdFormat(), getUserId(), new com.json.mediationsdk.IronSourceBannerLayout(com.json.environment.ContextProvider.getInstance().getCurrentActiveActivity(), new com.json.i1().b(getAdProperties().getCom.ironsource.y8.h.O java.lang.String())));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adDataCreateAdDataForNetworkAdapter, "createAdDataForNetworkAd…ze(adProperties.adSize)))");
        return adDataCreateAdDataForNetworkAdapter;
    }

    @Override // com.json.t1
    public org.json.JSONObject b(com.json.mediationsdk.model.NetworkSettings providerSettings) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        org.json.JSONObject bannerSettings = providerSettings.getBannerSettings();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bannerSettings, "providerSettings.bannerSettings");
        return bannerSettings;
    }

    @Override // com.json.t1
    /* JADX INFO: renamed from: c, reason: from getter */
    public java.lang.String getAdUnitPrefix() {
        return this.adUnitPrefix;
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.json.j6)) {
            return false;
        }
        com.json.j6 j6Var = (com.json.j6) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.adProperties, j6Var.adProperties) && this.isPublisherLoad == j6Var.isPublisherLoad && kotlin.jvm.internal.Intrinsics.areEqual(this.adUnitCommonData, j6Var.adUnitCommonData) && kotlin.jvm.internal.Intrinsics.areEqual(this.configs, j6Var.configs);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public int hashCode() {
        int iHashCode = this.adProperties.hashCode() * 31;
        boolean z = this.isPublisherLoad;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return ((((iHashCode + r1) * 31) + this.adUnitCommonData.hashCode()) * 31) + this.configs.hashCode();
    }

    @Override // com.json.t1
    /* JADX INFO: renamed from: j, reason: from getter */
    public java.lang.String getManagerName() {
        return this.managerName;
    }

    public java.lang.String toString() {
        return "BannerAdUnitData(adProperties=" + this.adProperties + ", isPublisherLoad=" + this.isPublisherLoad + ", adUnitCommonData=" + this.adUnitCommonData + ", configs=" + this.configs + ')';
    }

    @Override // com.json.t1
    /* JADX INFO: renamed from: u, reason: from getter */
    public boolean getIsPublisherLoad() {
        return this.isPublisherLoad;
    }

    public final com.json.g6 w() {
        return this.adProperties;
    }

    public final boolean x() {
        return this.isPublisherLoad;
    }

    public final com.json.s1 y() {
        return this.adUnitCommonData;
    }

    public final com.json.r6 z() {
        return this.configs;
    }
}
