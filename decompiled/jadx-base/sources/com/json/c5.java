package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b(\u0010)J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\"\u0010\u0016\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012\"\u0004\b\u0003\u0010\u0015R\"\u0010\u001a\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\r\u001a\u0004\b\u0018\u0010\u000f\"\u0004\b\u0003\u0010\u0019R.\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u0005\u0010\u001fR$\u0010%\u001a\u0004\u0018\u00010!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\"\u001a\u0004\b\u0017\u0010#\"\u0004\b\u0003\u0010$R.\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u001c\u001a\u0004\b\u0013\u0010\u001e\"\u0004\b\u0003\u0010\u001f¨\u0006*"}, d2 = {"Lcom/ironsource/c5;", "", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", "b", "name", "bidder", "toString", "", "hashCode", "other", "equals", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "Z", "e", "()Z", "c", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, "(Z)V", "useTestAds", "d", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_HLS, "(Ljava/lang/String;)V", "plumbus", "", "Ljava/util/Map;", "f", "()Ljava/util/Map;", "(Ljava/util/Map;)V", "biddingData", "Lcom/ironsource/mediationsdk/h;", "Lcom/ironsource/mediationsdk/h;", "()Lcom/ironsource/mediationsdk/h;", "(Lcom/ironsource/mediationsdk/h;)V", "auctionHistory", "", "additionalData", "<init>", "(Ljava/lang/String;Z)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class c5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final java.lang.String name;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean bidder;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private boolean useTestAds;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private java.lang.String plumbus;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private java.util.Map<java.lang.String, ? extends java.lang.Object> biddingData;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private com.json.mediationsdk.h auctionHistory;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private java.util.Map<java.lang.String, java.lang.Object> additionalData;

    public c5(java.lang.String name, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.bidder = z;
        this.plumbus = "";
        this.biddingData = kotlin.collections.MapsKt.emptyMap();
        this.additionalData = new java.util.HashMap();
    }

    public static /* synthetic */ com.json.c5 a(com.json.c5 c5Var, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c5Var.name;
        }
        if ((i & 2) != 0) {
            z = c5Var.bidder;
        }
        return c5Var.a(str, z);
    }

    public final com.json.c5 a(java.lang.String name, boolean bidder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        return new com.json.c5(name, bidder);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }

    public final void a(com.json.mediationsdk.h hVar) {
        this.auctionHistory = hVar;
    }

    public final void a(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.plumbus = str;
    }

    public final void a(java.util.Map<java.lang.String, java.lang.Object> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.additionalData = map;
    }

    public final void a(boolean z) {
        this.useTestAds = z;
    }

    public final void b(java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.biddingData = map;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getBidder() {
        return this.bidder;
    }

    public final java.util.Map<java.lang.String, java.lang.Object> c() {
        return this.additionalData;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final com.json.mediationsdk.h getAuctionHistory() {
        return this.auctionHistory;
    }

    public final boolean e() {
        return this.bidder;
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.json.c5)) {
            return false;
        }
        com.json.c5 c5Var = (com.json.c5) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.name, c5Var.name) && this.bidder == c5Var.bidder;
    }

    public final java.util.Map<java.lang.String, java.lang.Object> f() {
        return this.biddingData;
    }

    public final java.lang.String g() {
        return this.name;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final java.lang.String getPlumbus() {
        return this.plumbus;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        boolean z = this.bidder;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iHashCode + r1;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getUseTestAds() {
        return this.useTestAds;
    }

    public java.lang.String toString() {
        return "AuctionRequestInstanceInfo(name=" + this.name + ", bidder=" + this.bidder + ')';
    }
}
