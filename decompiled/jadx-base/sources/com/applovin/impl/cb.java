package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
class cb extends com.applovin.impl.g implements java.io.Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final java.lang.Object f670a;
    final java.lang.Object b;

    @Override // java.util.Map.Entry
    public final java.lang.Object setValue(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    cb(java.lang.Object obj, java.lang.Object obj2) {
        this.f670a = obj;
        this.b = obj2;
    }

    @Override // com.applovin.impl.g, java.util.Map.Entry
    public final java.lang.Object getKey() {
        return this.f670a;
    }

    @Override // com.applovin.impl.g, java.util.Map.Entry
    public final java.lang.Object getValue() {
        return this.b;
    }
}
