package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
abstract class e extends com.applovin.impl.f implements com.applovin.impl.ec {
    protected e(java.util.Map map) {
        super(map);
    }

    @Override // com.applovin.impl.f
    java.util.Collection c(java.util.Collection collection) {
        return java.util.Collections.unmodifiableList((java.util.List) collection);
    }

    @Override // com.applovin.impl.f, com.applovin.impl.tf
    public boolean put(java.lang.Object obj, java.lang.Object obj2) {
        return super.put(obj, obj2);
    }

    @Override // com.applovin.impl.h, com.applovin.impl.tf
    public java.util.Map a() {
        return super.a();
    }

    @Override // com.applovin.impl.h
    public boolean equals(java.lang.Object obj) {
        return super.equals(obj);
    }

    @Override // com.applovin.impl.f
    java.util.Collection a(java.lang.Object obj, java.util.Collection collection) {
        return a(obj, (java.util.List) collection, null);
    }
}
