package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
abstract class g implements java.util.Map.Entry {
    g() {
    }

    @Override // java.util.Map.Entry
    public abstract java.lang.Object getKey();

    @Override // java.util.Map.Entry
    public abstract java.lang.Object getValue();

    public java.lang.String toString() {
        return getKey() + com.ironsource.y8.i.b + getValue();
    }

    @Override // java.util.Map.Entry
    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof java.util.Map.Entry)) {
            return false;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        return com.applovin.exoplayer2.common.base.Objects.equal(getKey(), entry.getKey()) && com.applovin.exoplayer2.common.base.Objects.equal(getValue(), entry.getValue());
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        java.lang.Object key = getKey();
        java.lang.Object value = getValue();
        return (key == null ? 0 : key.hashCode()) ^ (value != null ? value.hashCode() : 0);
    }
}
