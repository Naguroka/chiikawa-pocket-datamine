package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÂ\u0003J\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0002J\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000fR\u001c\u0010\u0013\u001a\n \u0011*\u0004\u0018\u00010\u00100\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/ironsource/k5;", "", "", "c", "d", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", "b", com.json.j5.s, "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "Lcom/ironsource/mediationsdk/d;", "kotlin.jvm.PlatformType", "Lcom/ironsource/mediationsdk/d;", "auctionDataUtils", "<init>", "(Ljava/lang/String;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class k5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final java.lang.String serverData;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final com.json.mediationsdk.d auctionDataUtils;

    public k5(java.lang.String serverData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serverData, "serverData");
        this.serverData = serverData;
        this.auctionDataUtils = com.json.mediationsdk.d.b();
    }

    public static /* synthetic */ com.json.k5 a(com.json.k5 k5Var, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = k5Var.serverData;
        }
        return k5Var.a(str);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    private final java.lang.String getServerData() {
        return this.serverData;
    }

    public final com.json.k5 a(java.lang.String serverData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serverData, "serverData");
        return new com.json.k5(serverData);
    }

    public final java.lang.String a() {
        java.lang.String strA = this.auctionDataUtils.a(this.serverData);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strA, "auctionDataUtils.getAdmFromServerData(serverData)");
        return strA;
    }

    public final java.util.Map<java.lang.String, java.lang.String> b() {
        java.util.Map<java.lang.String, java.lang.String> mapB = this.auctionDataUtils.b(this.serverData);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(mapB, "auctionDataUtils.getAuct…verDataParams(serverData)");
        return mapB;
    }

    public final java.lang.String d() {
        java.lang.String strC = this.auctionDataUtils.c(this.serverData);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strC, "auctionDataUtils.getDyna…romServerData(serverData)");
        return strC;
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.json.k5) && kotlin.jvm.internal.Intrinsics.areEqual(this.serverData, ((com.json.k5) other).serverData);
    }

    public int hashCode() {
        return this.serverData.hashCode();
    }

    public java.lang.String toString() {
        return "AuctionServerData(serverData=" + this.serverData + ')';
    }
}
