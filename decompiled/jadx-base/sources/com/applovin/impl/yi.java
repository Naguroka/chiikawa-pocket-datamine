package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
final class yi extends com.applovin.impl.vg implements java.io.Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final com.applovin.impl.vg f1544a;

    public java.lang.String toString() {
        return this.f1544a + ".reverse()";
    }

    yi(com.applovin.impl.vg vgVar) {
        this.f1544a = (com.applovin.impl.vg) com.applovin.exoplayer2.common.base.Preconditions.checkNotNull(vgVar);
    }

    @Override // com.applovin.impl.vg, java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        return this.f1544a.compare(obj2, obj);
    }

    @Override // com.applovin.impl.vg
    public com.applovin.impl.vg c() {
        return this.f1544a;
    }

    public int hashCode() {
        return -this.f1544a.hashCode();
    }

    @Override // java.util.Comparator
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.applovin.impl.yi) {
            return this.f1544a.equals(((com.applovin.impl.yi) obj).f1544a);
        }
        return false;
    }
}
