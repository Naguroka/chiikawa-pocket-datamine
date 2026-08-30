package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0011\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J1\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u0007HÆ\u0001J\t\u0010\r\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/ironsource/xm;", "Lcom/ironsource/r0;", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_SS, "", "Lcom/ironsource/mediationsdk/model/NetworkSettings;", "t", "Lcom/ironsource/nm;", "u", "userId", "providerList", com.json.pg.p, androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "toString", "", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "o", "()Ljava/lang/String;", "Ljava/util/List;", "j", "()Ljava/util/List;", "Lcom/ironsource/nm;", "v", "()Lcom/ironsource/nm;", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/ironsource/nm;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class xm extends com.json.r0 {

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final java.lang.String userId;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private final java.util.List<com.json.mediationsdk.model.NetworkSettings> providerList;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private final com.json.nm configs;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public xm(java.lang.String str, java.util.List<? extends com.json.mediationsdk.model.NetworkSettings> list, com.json.nm configs) {
        super(com.ironsource.mediationsdk.IronSource.AD_UNIT.NATIVE_AD, str, list, configs.getAuctionSettings(), configs.getAdaptersSmartLoadAmount(), (int) (configs.getAdaptersSmartLoadTimeoutInMills() / ((long) 1000)), configs.getAdapterAdvancedLoading(), configs.getDelayLoadFailure(), -1, new com.json.l2(com.ironsource.l2.a.MANUAL, configs.getAuctionSettings().j(), configs.getAuctionSettings().b(), -1L), new com.json.f2(-1L), configs.getMCollectBiddingDataTimeout(), configs.getMProvidersParallelInit(), configs.getMWaitUntilAllProvidersFinishInit(), configs.getMSharedManagersThread(), false, 32768, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configs, "configs");
        this.userId = str;
        this.providerList = list;
        this.configs = configs;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.json.xm a(com.json.xm xmVar, java.lang.String str, java.util.List list, com.json.nm nmVar, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = xmVar.userId;
        }
        if ((i & 2) != 0) {
            list = xmVar.providerList;
        }
        if ((i & 4) != 0) {
            nmVar = xmVar.configs;
        }
        return xmVar.a(str, list, nmVar);
    }

    public final com.json.xm a(java.lang.String userId, java.util.List<? extends com.json.mediationsdk.model.NetworkSettings> providerList, com.json.nm configs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configs, "configs");
        return new com.json.xm(userId, providerList, configs);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.json.xm)) {
            return false;
        }
        com.json.xm xmVar = (com.json.xm) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.userId, xmVar.userId) && kotlin.jvm.internal.Intrinsics.areEqual(this.providerList, xmVar.providerList) && kotlin.jvm.internal.Intrinsics.areEqual(this.configs, xmVar.configs);
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
        return "NativeAdManagerData(userId=" + this.userId + ", providerList=" + this.providerList + ", configs=" + this.configs + ')';
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final com.json.nm getConfigs() {
        return this.configs;
    }

    public final com.json.nm v() {
        return this.configs;
    }
}
