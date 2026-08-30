package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
final class x3 extends com.applovin.impl.vg implements java.io.Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final java.util.Comparator f1485a;

    x3(java.util.Comparator comparator) {
        this.f1485a = (java.util.Comparator) com.applovin.exoplayer2.common.base.Preconditions.checkNotNull(comparator);
    }

    @Override // com.applovin.impl.vg, java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        return this.f1485a.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.applovin.impl.x3) {
            return this.f1485a.equals(((com.applovin.impl.x3) obj).f1485a);
        }
        return false;
    }

    public int hashCode() {
        return this.f1485a.hashCode();
    }

    public java.lang.String toString() {
        return this.f1485a.toString();
    }
}
