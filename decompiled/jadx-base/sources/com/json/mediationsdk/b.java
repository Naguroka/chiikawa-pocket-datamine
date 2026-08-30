package com.json.mediationsdk;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0082\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0004HÆ\u0003J1\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u0004HÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017¨\u0006\u001c"}, d2 = {"Lcom/ironsource/mediationsdk/b;", "", "Lcom/ironsource/mediationsdk/s$d;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", "b", "c", "d", "sdkState", "isRetryForMoreThan15Secs", "isDemandOnlyInitRequested", "isAdUnitInitRequested", "", "toString", "", "hashCode", "other", "equals", "Lcom/ironsource/mediationsdk/s$d;", "e", "()Lcom/ironsource/mediationsdk/s$d;", "Z", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_HLS, "()Z", "g", "f", "<init>", "(Lcom/ironsource/mediationsdk/s$d;ZZZ)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.ironsource.mediationsdk.s.d sdkState;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isRetryForMoreThan15Secs;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean isDemandOnlyInitRequested;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean isAdUnitInitRequested;

    public b(com.ironsource.mediationsdk.s.d sdkState, boolean z, boolean z2, boolean z3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkState, "sdkState");
        this.sdkState = sdkState;
        this.isRetryForMoreThan15Secs = z;
        this.isDemandOnlyInitRequested = z2;
        this.isAdUnitInitRequested = z3;
    }

    public static /* synthetic */ com.json.mediationsdk.b a(com.json.mediationsdk.b bVar, com.ironsource.mediationsdk.s.d dVar, boolean z, boolean z2, boolean z3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            dVar = bVar.sdkState;
        }
        if ((i & 2) != 0) {
            z = bVar.isRetryForMoreThan15Secs;
        }
        if ((i & 4) != 0) {
            z2 = bVar.isDemandOnlyInitRequested;
        }
        if ((i & 8) != 0) {
            z3 = bVar.isAdUnitInitRequested;
        }
        return bVar.a(dVar, z, z2, z3);
    }

    public final com.json.mediationsdk.b a(com.ironsource.mediationsdk.s.d sdkState, boolean isRetryForMoreThan15Secs, boolean isDemandOnlyInitRequested, boolean isAdUnitInitRequested) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkState, "sdkState");
        return new com.json.mediationsdk.b(sdkState, isRetryForMoreThan15Secs, isDemandOnlyInitRequested, isAdUnitInitRequested);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final com.ironsource.mediationsdk.s.d getSdkState() {
        return this.sdkState;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getIsRetryForMoreThan15Secs() {
        return this.isRetryForMoreThan15Secs;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getIsDemandOnlyInitRequested() {
        return this.isDemandOnlyInitRequested;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getIsAdUnitInitRequested() {
        return this.isAdUnitInitRequested;
    }

    public final com.ironsource.mediationsdk.s.d e() {
        return this.sdkState;
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.json.mediationsdk.b)) {
            return false;
        }
        com.json.mediationsdk.b bVar = (com.json.mediationsdk.b) other;
        return this.sdkState == bVar.sdkState && this.isRetryForMoreThan15Secs == bVar.isRetryForMoreThan15Secs && this.isDemandOnlyInitRequested == bVar.isDemandOnlyInitRequested && this.isAdUnitInitRequested == bVar.isAdUnitInitRequested;
    }

    public final boolean f() {
        return this.isAdUnitInitRequested;
    }

    public final boolean g() {
        return this.isDemandOnlyInitRequested;
    }

    public final boolean h() {
        return this.isRetryForMoreThan15Secs;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = this.sdkState.hashCode() * 31;
        boolean z = this.isRetryForMoreThan15Secs;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (iHashCode + r1) * 31;
        boolean z2 = this.isDemandOnlyInitRequested;
        ?? r2 = z2;
        if (z2) {
            r2 = 1;
        }
        int i2 = (i + r2) * 31;
        boolean z3 = this.isAdUnitInitRequested;
        return i2 + (z3 ? 1 : z3);
    }

    public java.lang.String toString() {
        return "AdUnitInitStateInfo(sdkState=" + this.sdkState + ", isRetryForMoreThan15Secs=" + this.isRetryForMoreThan15Secs + ", isDemandOnlyInitRequested=" + this.isDemandOnlyInitRequested + ", isAdUnitInitRequested=" + this.isAdUnitInitRequested + ')';
    }
}
