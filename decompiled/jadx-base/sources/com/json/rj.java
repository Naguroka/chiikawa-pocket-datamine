package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0002HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/ironsource/rj;", "", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "b", "advId", "advIdType", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "d", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class rj {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final java.lang.String advId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final java.lang.String advIdType;

    public rj(java.lang.String advId, java.lang.String advIdType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(advId, "advId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(advIdType, "advIdType");
        this.advId = advId;
        this.advIdType = advIdType;
    }

    public static /* synthetic */ com.json.rj a(com.json.rj rjVar, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = rjVar.advId;
        }
        if ((i & 2) != 0) {
            str2 = rjVar.advIdType;
        }
        return rjVar.a(str, str2);
    }

    public final com.json.rj a(java.lang.String advId, java.lang.String advIdType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(advId, "advId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(advIdType, "advIdType");
        return new com.json.rj(advId, advIdType);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final java.lang.String getAdvId() {
        return this.advId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final java.lang.String getAdvIdType() {
        return this.advIdType;
    }

    public final java.lang.String c() {
        return this.advId;
    }

    public final java.lang.String d() {
        return this.advIdType;
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.json.rj)) {
            return false;
        }
        com.json.rj rjVar = (com.json.rj) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.advId, rjVar.advId) && kotlin.jvm.internal.Intrinsics.areEqual(this.advIdType, rjVar.advIdType);
    }

    public int hashCode() {
        return (this.advId.hashCode() * 31) + this.advIdType.hashCode();
    }

    public java.lang.String toString() {
        return "IronSourceAdvId(advId=" + this.advId + ", advIdType=" + this.advIdType + ')';
    }
}
