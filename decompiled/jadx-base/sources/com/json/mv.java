package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0004HÆ\u0003J'\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u0004HÆ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u0018"}, d2 = {"Lcom/ironsource/mv;", "", "Lorg/json/JSONObject;", "g", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "b", "c", com.json.pg.k, com.json.pg.l, com.json.pg.m, "", "toString", "", "hashCode", "other", "equals", "Z", "e", "()Z", "f", "d", "<init>", "(ZZZ)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class mv {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean isVisible;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isWindowVisible;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean isShown;

    public mv(boolean z, boolean z2, boolean z3) {
        this.isVisible = z;
        this.isWindowVisible = z2;
        this.isShown = z3;
    }

    public static /* synthetic */ com.json.mv a(com.json.mv mvVar, boolean z, boolean z2, boolean z3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = mvVar.isVisible;
        }
        if ((i & 2) != 0) {
            z2 = mvVar.isWindowVisible;
        }
        if ((i & 4) != 0) {
            z3 = mvVar.isShown;
        }
        return mvVar.a(z, z2, z3);
    }

    public final com.json.mv a(boolean isVisible, boolean isWindowVisible, boolean isShown) {
        return new com.json.mv(isVisible, isWindowVisible, isShown);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getIsVisible() {
        return this.isVisible;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getIsWindowVisible() {
        return this.isWindowVisible;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getIsShown() {
        return this.isShown;
    }

    public final boolean d() {
        return this.isShown;
    }

    public final boolean e() {
        return this.isVisible;
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.json.mv)) {
            return false;
        }
        com.json.mv mvVar = (com.json.mv) other;
        return this.isVisible == mvVar.isVisible && this.isWindowVisible == mvVar.isWindowVisible && this.isShown == mvVar.isShown;
    }

    public final boolean f() {
        return this.isWindowVisible;
    }

    public final org.json.JSONObject g() throws org.json.JSONException {
        org.json.JSONObject jSONObjectPut = new org.json.JSONObject().put(com.json.pg.k, this.isVisible).put(com.json.pg.l, this.isWindowVisible).put(com.json.pg.m, this.isShown);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObjectPut, "JSONObject()\n        .pu…ts.IS_SHOWN_KEY, isShown)");
        return jSONObjectPut;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    public int hashCode() {
        boolean z = this.isVisible;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        boolean z2 = this.isWindowVisible;
        ?? r2 = z2;
        if (z2) {
            r2 = 1;
        }
        int i2 = (i + r2) * 31;
        boolean z3 = this.isShown;
        return i2 + (z3 ? 1 : z3);
    }

    public java.lang.String toString() {
        return "ViewVisibilityParams(isVisible=" + this.isVisible + ", isWindowVisible=" + this.isWindowVisible + ", isShown=" + this.isShown + ')';
    }
}
