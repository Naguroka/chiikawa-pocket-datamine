package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\"\u0010#J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J\t\u0010\n\u001a\u00020\u0002HÆ\u0003J=\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0010\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0011\u001a\u00020\bHÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u000e\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b!\u0010\u0017¨\u0006$"}, d2 = {"Lcom/ironsource/g5;", "", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lorg/json/JSONObject;", "b", "Lcom/ironsource/j5;", "c", "", "d", "e", "auctionId", "auctionResponseGenericParam", "genericNotifications", "auctionTrial", com.json.mediationsdk.utils.IronSourceConstants.AUCTION_FALLBACK, "toString", "hashCode", "other", "", "equals", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "Lorg/json/JSONObject;", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_HLS, "()Lorg/json/JSONObject;", "Lcom/ironsource/j5;", "j", "()Lcom/ironsource/j5;", "I", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, "()I", "f", "<init>", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/ironsource/j5;ILjava/lang/String;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class g5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final java.lang.String auctionId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final org.json.JSONObject auctionResponseGenericParam;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final com.json.j5 genericNotifications;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int auctionTrial;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final java.lang.String auctionFallback;

    public g5(java.lang.String auctionId, org.json.JSONObject auctionResponseGenericParam, com.json.j5 j5Var, int i, java.lang.String auctionFallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(auctionId, "auctionId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(auctionResponseGenericParam, "auctionResponseGenericParam");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(auctionFallback, "auctionFallback");
        this.auctionId = auctionId;
        this.auctionResponseGenericParam = auctionResponseGenericParam;
        this.genericNotifications = j5Var;
        this.auctionTrial = i;
        this.auctionFallback = auctionFallback;
    }

    public static /* synthetic */ com.json.g5 a(com.json.g5 g5Var, java.lang.String str, org.json.JSONObject jSONObject, com.json.j5 j5Var, int i, java.lang.String str2, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = g5Var.auctionId;
        }
        if ((i2 & 2) != 0) {
            jSONObject = g5Var.auctionResponseGenericParam;
        }
        org.json.JSONObject jSONObject2 = jSONObject;
        if ((i2 & 4) != 0) {
            j5Var = g5Var.genericNotifications;
        }
        com.json.j5 j5Var2 = j5Var;
        if ((i2 & 8) != 0) {
            i = g5Var.auctionTrial;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            str2 = g5Var.auctionFallback;
        }
        return g5Var.a(str, jSONObject2, j5Var2, i3, str2);
    }

    public final com.json.g5 a(java.lang.String auctionId, org.json.JSONObject auctionResponseGenericParam, com.json.j5 genericNotifications, int auctionTrial, java.lang.String auctionFallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(auctionId, "auctionId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(auctionResponseGenericParam, "auctionResponseGenericParam");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(auctionFallback, "auctionFallback");
        return new com.json.g5(auctionId, auctionResponseGenericParam, genericNotifications, auctionTrial, auctionFallback);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final java.lang.String getAuctionId() {
        return this.auctionId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final org.json.JSONObject getAuctionResponseGenericParam() {
        return this.auctionResponseGenericParam;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final com.json.j5 getGenericNotifications() {
        return this.genericNotifications;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getAuctionTrial() {
        return this.auctionTrial;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final java.lang.String getAuctionFallback() {
        return this.auctionFallback;
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.json.g5)) {
            return false;
        }
        com.json.g5 g5Var = (com.json.g5) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.auctionId, g5Var.auctionId) && kotlin.jvm.internal.Intrinsics.areEqual(this.auctionResponseGenericParam, g5Var.auctionResponseGenericParam) && kotlin.jvm.internal.Intrinsics.areEqual(this.genericNotifications, g5Var.genericNotifications) && this.auctionTrial == g5Var.auctionTrial && kotlin.jvm.internal.Intrinsics.areEqual(this.auctionFallback, g5Var.auctionFallback);
    }

    public final java.lang.String f() {
        return this.auctionFallback;
    }

    public final java.lang.String g() {
        return this.auctionId;
    }

    public final org.json.JSONObject h() {
        return this.auctionResponseGenericParam;
    }

    public int hashCode() {
        int iHashCode = ((this.auctionId.hashCode() * 31) + this.auctionResponseGenericParam.hashCode()) * 31;
        com.json.j5 j5Var = this.genericNotifications;
        return ((((iHashCode + (j5Var == null ? 0 : j5Var.hashCode())) * 31) + java.lang.Integer.hashCode(this.auctionTrial)) * 31) + this.auctionFallback.hashCode();
    }

    public final int i() {
        return this.auctionTrial;
    }

    public final com.json.j5 j() {
        return this.genericNotifications;
    }

    public java.lang.String toString() {
        return "AuctionResponseData(auctionId=" + this.auctionId + ", auctionResponseGenericParam=" + this.auctionResponseGenericParam + ", genericNotifications=" + this.genericNotifications + ", auctionTrial=" + this.auctionTrial + ", auctionFallback=" + this.auctionFallback + ')';
    }
}
