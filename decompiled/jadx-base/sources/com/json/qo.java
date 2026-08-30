package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\n\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/ironsource/qo;", "", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", "b", "isImmersive", "flags", "", "toString", "hashCode", "other", "equals", "Z", "d", "()Z", "I", "c", "()I", "<init>", "(ZI)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class qo {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean isImmersive;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int flags;

    /* JADX WARN: Multi-variable type inference failed */
    public qo() {
        this(false, 0 == true ? 1 : 0, 3, null);
    }

    public qo(boolean z, int i) {
        this.isImmersive = z;
        this.flags = i;
    }

    public /* synthetic */ qo(boolean z, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? com.google.android.gms.drive.DriveFile.MODE_READ_WRITE : i);
    }

    public static /* synthetic */ com.json.qo a(com.json.qo qoVar, boolean z, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            z = qoVar.isImmersive;
        }
        if ((i2 & 2) != 0) {
            i = qoVar.flags;
        }
        return qoVar.a(z, i);
    }

    public final com.json.qo a(boolean isImmersive, int flags) {
        return new com.json.qo(isImmersive, flags);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getIsImmersive() {
        return this.isImmersive;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getFlags() {
        return this.flags;
    }

    public final int c() {
        return this.flags;
    }

    public final boolean d() {
        return this.isImmersive;
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.json.qo)) {
            return false;
        }
        com.json.qo qoVar = (com.json.qo) other;
        return this.isImmersive == qoVar.isImmersive && this.flags == qoVar.flags;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z = this.isImmersive;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (r0 * 31) + java.lang.Integer.hashCode(this.flags);
    }

    public java.lang.String toString() {
        return "OpenUrlConfigurations(isImmersive=" + this.isImmersive + ", flags=" + this.flags + ')';
    }
}
