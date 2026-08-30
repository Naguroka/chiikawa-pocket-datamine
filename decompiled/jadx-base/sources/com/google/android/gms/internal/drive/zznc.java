package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
final class zznc implements java.util.Iterator<java.lang.String> {
    private final /* synthetic */ com.google.android.gms.internal.drive.zzna zzvw;
    private java.util.Iterator<java.lang.String> zzvx;

    zznc(com.google.android.gms.internal.drive.zzna zznaVar) {
        this.zzvw = zznaVar;
        this.zzvx = zznaVar.zzvt.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzvx.hasNext();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ java.lang.String next() {
        return this.zzvx.next();
    }
}
