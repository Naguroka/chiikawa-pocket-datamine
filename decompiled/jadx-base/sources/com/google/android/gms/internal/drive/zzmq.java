package com.google.android.gms.internal.drive;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* JADX INFO: loaded from: classes3.dex */
final class zzmq<K, V> implements java.util.Iterator<java.util.Map.Entry<K, V>> {
    private int pos;
    private java.util.Iterator<java.util.Map.Entry<K, V>> zzvj;
    private final /* synthetic */ com.google.android.gms.internal.drive.zzmi zzvk;
    private boolean zzvo;

    private zzmq(com.google.android.gms.internal.drive.zzmi zzmiVar) {
        this.zzvk = zzmiVar;
        this.pos = -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.pos + 1 < this.zzvk.zzve.size() || (!this.zzvk.zzvf.isEmpty() && zzew().hasNext());
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.zzvo) {
            throw new java.lang.IllegalStateException("remove() was called before next()");
        }
        this.zzvo = false;
        this.zzvk.zzeu();
        if (this.pos < this.zzvk.zzve.size()) {
            com.google.android.gms.internal.drive.zzmi zzmiVar = this.zzvk;
            int i = this.pos;
            this.pos = i - 1;
            zzmiVar.zzax(i);
            return;
        }
        zzew().remove();
    }

    private final java.util.Iterator<java.util.Map.Entry<K, V>> zzew() {
        if (this.zzvj == null) {
            this.zzvj = this.zzvk.zzvf.entrySet().iterator();
        }
        return this.zzvj;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ java.lang.Object next() {
        this.zzvo = true;
        int i = this.pos + 1;
        this.pos = i;
        if (i >= this.zzvk.zzve.size()) {
            return zzew().next();
        }
        return (java.util.Map.Entry) this.zzvk.zzve.get(this.pos);
    }

    /* synthetic */ zzmq(com.google.android.gms.internal.drive.zzmi zzmiVar, com.google.android.gms.internal.drive.zzmj zzmjVar) {
        this(zzmiVar);
    }
}
