package com.google.android.gms.internal.drive;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* JADX INFO: loaded from: classes3.dex */
final class zzmk<K, V> implements java.util.Iterator<java.util.Map.Entry<K, V>> {
    private int pos;
    private java.util.Iterator<java.util.Map.Entry<K, V>> zzvj;
    private final /* synthetic */ com.google.android.gms.internal.drive.zzmi zzvk;

    private zzmk(com.google.android.gms.internal.drive.zzmi zzmiVar) {
        this.zzvk = zzmiVar;
        this.pos = zzmiVar.zzve.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.pos;
        return (i > 0 && i <= this.zzvk.zzve.size()) || zzew().hasNext();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException();
    }

    private final java.util.Iterator<java.util.Map.Entry<K, V>> zzew() {
        if (this.zzvj == null) {
            this.zzvj = this.zzvk.zzvh.entrySet().iterator();
        }
        return this.zzvj;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ java.lang.Object next() {
        if (zzew().hasNext()) {
            return zzew().next();
        }
        java.util.List list = this.zzvk.zzve;
        int i = this.pos - 1;
        this.pos = i;
        return (java.util.Map.Entry) list.get(i);
    }

    /* synthetic */ zzmk(com.google.android.gms.internal.drive.zzmi zzmiVar, com.google.android.gms.internal.drive.zzmj zzmjVar) {
        this(zzmiVar);
    }
}
