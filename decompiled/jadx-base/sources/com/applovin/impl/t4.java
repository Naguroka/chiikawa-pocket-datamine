package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class t4 implements java.lang.Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.Object f1348a = new java.lang.Object();
    private final java.util.Map b = new java.util.HashMap();
    private java.util.Set c = java.util.Collections.emptySet();
    private java.util.List d = java.util.Collections.emptyList();

    public void a(java.lang.Object obj) {
        synchronized (this.f1348a) {
            java.util.ArrayList arrayList = new java.util.ArrayList(this.d);
            arrayList.add(obj);
            this.d = java.util.Collections.unmodifiableList(arrayList);
            java.lang.Integer num = (java.lang.Integer) this.b.get(obj);
            if (num == null) {
                java.util.HashSet hashSet = new java.util.HashSet(this.c);
                hashSet.add(obj);
                this.c = java.util.Collections.unmodifiableSet(hashSet);
            }
            this.b.put(obj, java.lang.Integer.valueOf(num != null ? 1 + num.intValue() : 1));
        }
    }

    public void c(java.lang.Object obj) {
        synchronized (this.f1348a) {
            java.lang.Integer num = (java.lang.Integer) this.b.get(obj);
            if (num == null) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(this.d);
            arrayList.remove(obj);
            this.d = java.util.Collections.unmodifiableList(arrayList);
            if (num.intValue() == 1) {
                this.b.remove(obj);
                java.util.HashSet hashSet = new java.util.HashSet(this.c);
                hashSet.remove(obj);
                this.c = java.util.Collections.unmodifiableSet(hashSet);
            } else {
                this.b.put(obj, java.lang.Integer.valueOf(num.intValue() - 1));
            }
        }
    }

    @Override // java.lang.Iterable
    public java.util.Iterator iterator() {
        java.util.Iterator it;
        synchronized (this.f1348a) {
            it = this.d.iterator();
        }
        return it;
    }

    public int b(java.lang.Object obj) {
        int iIntValue;
        synchronized (this.f1348a) {
            iIntValue = this.b.containsKey(obj) ? ((java.lang.Integer) this.b.get(obj)).intValue() : 0;
        }
        return iIntValue;
    }

    public java.util.Set a() {
        java.util.Set set;
        synchronized (this.f1348a) {
            set = this.c;
        }
        return set;
    }
}
