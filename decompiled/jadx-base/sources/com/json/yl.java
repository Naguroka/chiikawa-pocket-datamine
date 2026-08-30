package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0013\b\u0080\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\"\u0010#J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J\t\u0010\n\u001a\u00020\bHÆ\u0003J;\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\bHÆ\u0001J\t\u0010\u0010\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\r\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u000e\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u000f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001e\u001a\u0004\b!\u0010 ¨\u0006$"}, d2 = {"Lcom/ironsource/yl;", "", "Lcom/ironsource/ri;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", "b", "", "c", "", "d", "e", "instanceType", "adSourceNameForEvents", "loadTimeoutInMills", "isOneFlow", "isMultipleAdObjects", "toString", "", "hashCode", "other", "equals", "Lcom/ironsource/ri;", "g", "()Lcom/ironsource/ri;", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "J", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_HLS, "()J", "Z", "j", "()Z", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, "<init>", "(Lcom/ironsource/ri;Ljava/lang/String;JZZ)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class yl {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.json.ri instanceType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final java.lang.String adSourceNameForEvents;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final long loadTimeoutInMills;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean isOneFlow;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean isMultipleAdObjects;

    public yl(com.json.ri instanceType, java.lang.String adSourceNameForEvents, long j, boolean z, boolean z2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instanceType, "instanceType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adSourceNameForEvents, "adSourceNameForEvents");
        this.instanceType = instanceType;
        this.adSourceNameForEvents = adSourceNameForEvents;
        this.loadTimeoutInMills = j;
        this.isOneFlow = z;
        this.isMultipleAdObjects = z2;
    }

    public /* synthetic */ yl(com.json.ri riVar, java.lang.String str, long j, boolean z, boolean z2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(riVar, str, j, z, (i & 16) != 0 ? true : z2);
    }

    public static /* synthetic */ com.json.yl a(com.json.yl ylVar, com.json.ri riVar, java.lang.String str, long j, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            riVar = ylVar.instanceType;
        }
        if ((i & 2) != 0) {
            str = ylVar.adSourceNameForEvents;
        }
        java.lang.String str2 = str;
        if ((i & 4) != 0) {
            j = ylVar.loadTimeoutInMills;
        }
        long j2 = j;
        if ((i & 8) != 0) {
            z = ylVar.isOneFlow;
        }
        boolean z3 = z;
        if ((i & 16) != 0) {
            z2 = ylVar.isMultipleAdObjects;
        }
        return ylVar.a(riVar, str2, j2, z3, z2);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final com.json.ri getInstanceType() {
        return this.instanceType;
    }

    public final com.json.yl a(com.json.ri instanceType, java.lang.String adSourceNameForEvents, long loadTimeoutInMills, boolean isOneFlow, boolean isMultipleAdObjects) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instanceType, "instanceType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adSourceNameForEvents, "adSourceNameForEvents");
        return new com.json.yl(instanceType, adSourceNameForEvents, loadTimeoutInMills, isOneFlow, isMultipleAdObjects);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final java.lang.String getAdSourceNameForEvents() {
        return this.adSourceNameForEvents;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getLoadTimeoutInMills() {
        return this.loadTimeoutInMills;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getIsOneFlow() {
        return this.isOneFlow;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getIsMultipleAdObjects() {
        return this.isMultipleAdObjects;
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.json.yl)) {
            return false;
        }
        com.json.yl ylVar = (com.json.yl) other;
        return this.instanceType == ylVar.instanceType && kotlin.jvm.internal.Intrinsics.areEqual(this.adSourceNameForEvents, ylVar.adSourceNameForEvents) && this.loadTimeoutInMills == ylVar.loadTimeoutInMills && this.isOneFlow == ylVar.isOneFlow && this.isMultipleAdObjects == ylVar.isMultipleAdObjects;
    }

    public final java.lang.String f() {
        return this.adSourceNameForEvents;
    }

    public final com.json.ri g() {
        return this.instanceType;
    }

    public final long h() {
        return this.loadTimeoutInMills;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = ((((this.instanceType.hashCode() * 31) + this.adSourceNameForEvents.hashCode()) * 31) + java.lang.Long.hashCode(this.loadTimeoutInMills)) * 31;
        boolean z = this.isOneFlow;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (iHashCode + r1) * 31;
        boolean z2 = this.isMultipleAdObjects;
        return i + (z2 ? 1 : z2);
    }

    public final boolean i() {
        return this.isMultipleAdObjects;
    }

    public final boolean j() {
        return this.isOneFlow;
    }

    public java.lang.String toString() {
        return "LoadTaskConfig(instanceType=" + this.instanceType + ", adSourceNameForEvents=" + this.adSourceNameForEvents + ", loadTimeoutInMills=" + this.loadTimeoutInMills + ", isOneFlow=" + this.isOneFlow + ", isMultipleAdObjects=" + this.isMultipleAdObjects + ')';
    }
}
