package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
final class r2 extends com.applovin.impl.vg implements java.io.Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final com.applovin.exoplayer2.common.base.Function f1210a;
    final com.applovin.impl.vg b;

    public java.lang.String toString() {
        return this.b + ".onResultOf(" + this.f1210a + ")";
    }

    r2(com.applovin.exoplayer2.common.base.Function function, com.applovin.impl.vg vgVar) {
        this.f1210a = (com.applovin.exoplayer2.common.base.Function) com.applovin.exoplayer2.common.base.Preconditions.checkNotNull(function);
        this.b = (com.applovin.impl.vg) com.applovin.exoplayer2.common.base.Preconditions.checkNotNull(vgVar);
    }

    @Override // com.applovin.impl.vg, java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        return this.b.compare(this.f1210a.apply(obj), this.f1210a.apply(obj2));
    }

    @Override // java.util.Comparator
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.applovin.impl.r2)) {
            return false;
        }
        com.applovin.impl.r2 r2Var = (com.applovin.impl.r2) obj;
        return this.f1210a.equals(r2Var.f1210a) && this.b.equals(r2Var.b);
    }

    public int hashCode() {
        return com.applovin.exoplayer2.common.base.Objects.hashCode(this.f1210a, this.b);
    }
}
