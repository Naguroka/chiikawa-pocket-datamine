package com.google.android.gms.internal.drive;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* JADX INFO: loaded from: classes3.dex */
class zzmr<K, V> extends java.util.AbstractSet<java.util.Map.Entry<K, V>> {
    private final /* synthetic */ com.google.android.gms.internal.drive.zzmi zzvk;

    private zzmr(com.google.android.gms.internal.drive.zzmi zzmiVar) {
        this.zzvk = zzmiVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public java.util.Iterator<java.util.Map.Entry<K, V>> iterator() {
        return new com.google.android.gms.internal.drive.zzmq(this.zzvk, null);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.zzvk.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(java.lang.Object obj) {
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        java.lang.Object obj2 = this.zzvk.get(entry.getKey());
        java.lang.Object value = entry.getValue();
        if (obj2 != value) {
            return obj2 != null && obj2.equals(value);
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(java.lang.Object obj) {
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.zzvk.remove(entry.getKey());
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.zzvk.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public /* synthetic */ boolean add(java.lang.Object obj) {
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.zzvk.put((java.lang.Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    /* synthetic */ zzmr(com.google.android.gms.internal.drive.zzmi zzmiVar, com.google.android.gms.internal.drive.zzmj zzmjVar) {
        this(zzmiVar);
    }
}
