package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0086\b\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000fB\u001f\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b)\u0010*J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J\t\u0010\u000b\u001a\u00020\nHÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\nHÆ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003R\u001a\u0010\f\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0005\u0010\u001aR\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010&\u001a\u00020\u00108\u0016X\u0096D¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010(\u001a\u00020\u00108\u0016X\u0096D¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b'\u0010%¨\u0006+"}, d2 = {"Lcom/ironsource/cn;", "Lcom/ironsource/t1;", "Lcom/ironsource/mediationsdk/model/NetworkSettings;", com.json.pr.b, "Lorg/json/JSONObject;", "b", "Lcom/ironsource/c1;", "w", "Lcom/ironsource/s1;", "x", "Lcom/ironsource/nm;", "y", "adProperties", "adUnitCommonData", com.json.pg.p, androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", "toString", "", "hashCode", "", "other", "", "equals", "t", "Lcom/ironsource/c1;", "()Lcom/ironsource/c1;", "u", "Lcom/ironsource/s1;", "z", "()Lcom/ironsource/s1;", "v", "Lcom/ironsource/nm;", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "()Lcom/ironsource/nm;", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "adUnitPrefix", "j", "managerName", "<init>", "(Lcom/ironsource/c1;Lcom/ironsource/s1;Lcom/ironsource/nm;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class cn extends com.json.t1 {

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    public static final com.json.cn.Companion INSTANCE = new com.json.cn.Companion(null);

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private final com.json.c1 adProperties;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private final com.json.s1 adUnitCommonData;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private final com.json.nm configs;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final java.lang.String adUnitPrefix;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final java.lang.String managerName;

    /* JADX INFO: renamed from: com.ironsource.cn$a, reason: from kotlin metadata */
    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¨\u0006\n"}, d2 = {"Lcom/ironsource/cn$a;", "", "Lcom/ironsource/c1;", "adProperties", "Lcom/ironsource/al;", "levelPlayConfig", "Lcom/ironsource/cn;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final com.json.cn a(com.json.c1 adProperties, com.json.al levelPlayConfig) {
            java.util.List<com.json.vn> listEmptyList;
            com.json.hs hsVarD;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adProperties, "adProperties");
            com.json.t1.Companion companion = com.json.t1.INSTANCE;
            com.json.p8 p8VarC = (levelPlayConfig == null || (hsVarD = levelPlayConfig.d()) == null) ? null : hsVarD.c();
            com.json.nm nativeAdConfigurations = p8VarC != null ? p8VarC.getNativeAdConfigurations() : null;
            if (nativeAdConfigurations == null) {
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
            return new com.json.cn(adProperties, new com.json.s1(userIdForNetworks, arrayList, lkVarB), nativeAdConfigurations);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cn(com.json.c1 adProperties, com.json.s1 adUnitCommonData, com.json.nm configs) {
        super(adProperties, true, adUnitCommonData.f(), adUnitCommonData.d(), adUnitCommonData.e(), configs.getAuctionSettings(), configs.getAdaptersSmartLoadAmount(), (int) (configs.getAdaptersSmartLoadTimeoutInMills() / ((long) 1000)), configs.getAdapterAdvancedLoading(), configs.getDelayLoadFailure(), -1, new com.json.l2(com.ironsource.l2.a.MANUAL, configs.getAuctionSettings().j(), configs.getAuctionSettings().b(), -1L), configs.getMCollectBiddingDataTimeout(), configs.getMProvidersParallelInit(), configs.getMWaitUntilAllProvidersFinishInit(), configs.getMSharedManagersThread(), false, 65536, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitCommonData, "adUnitCommonData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configs, "configs");
        this.adProperties = adProperties;
        this.adUnitCommonData = adUnitCommonData;
        this.configs = configs;
        this.adUnitPrefix = "NA";
        this.managerName = com.json.bl.MADU_NT_MANAGER_NAME;
    }

    public static /* synthetic */ com.json.cn a(com.json.cn cnVar, com.json.c1 c1Var, com.json.s1 s1Var, com.json.nm nmVar, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            c1Var = cnVar.adProperties;
        }
        if ((i & 2) != 0) {
            s1Var = cnVar.adUnitCommonData;
        }
        if ((i & 4) != 0) {
            nmVar = cnVar.configs;
        }
        return cnVar.a(c1Var, s1Var, nmVar);
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final com.json.nm getConfigs() {
        return this.configs;
    }

    public final com.json.cn a(com.json.c1 adProperties, com.json.s1 adUnitCommonData, com.json.nm configs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitCommonData, "adUnitCommonData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configs, "configs");
        return new com.json.cn(adProperties, adUnitCommonData, configs);
    }

    @Override // com.json.t1
    /* JADX INFO: renamed from: b, reason: from getter */
    public com.json.c1 getAdProperties() {
        return this.adProperties;
    }

    @Override // com.json.t1
    public org.json.JSONObject b(com.json.mediationsdk.model.NetworkSettings providerSettings) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        org.json.JSONObject nativeAdSettings = providerSettings.getNativeAdSettings();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(nativeAdSettings, "providerSettings.nativeAdSettings");
        return nativeAdSettings;
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
        if (!(other instanceof com.json.cn)) {
            return false;
        }
        com.json.cn cnVar = (com.json.cn) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.adProperties, cnVar.adProperties) && kotlin.jvm.internal.Intrinsics.areEqual(this.adUnitCommonData, cnVar.adUnitCommonData) && kotlin.jvm.internal.Intrinsics.areEqual(this.configs, cnVar.configs);
    }

    public int hashCode() {
        return (((this.adProperties.hashCode() * 31) + this.adUnitCommonData.hashCode()) * 31) + this.configs.hashCode();
    }

    @Override // com.json.t1
    /* JADX INFO: renamed from: j, reason: from getter */
    public java.lang.String getManagerName() {
        return this.managerName;
    }

    public java.lang.String toString() {
        return "NativeAdUnitData(adProperties=" + this.adProperties + ", adUnitCommonData=" + this.adUnitCommonData + ", configs=" + this.configs + ')';
    }

    public final com.json.c1 w() {
        return this.adProperties;
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final com.json.s1 getAdUnitCommonData() {
        return this.adUnitCommonData;
    }

    public final com.json.nm y() {
        return this.configs;
    }

    public final com.json.s1 z() {
        return this.adUnitCommonData;
    }
}
