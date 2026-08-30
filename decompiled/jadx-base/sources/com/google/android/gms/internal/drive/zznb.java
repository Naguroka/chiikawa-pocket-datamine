package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
final class zznb implements java.util.ListIterator<java.lang.String> {
    private java.util.ListIterator<java.lang.String> zzvu;
    private final /* synthetic */ int zzvv;
    private final /* synthetic */ com.google.android.gms.internal.drive.zzna zzvw;

    zznb(com.google.android.gms.internal.drive.zzna zznaVar, int i) {
        this.zzvw = zznaVar;
        this.zzvv = i;
        this.zzvu = zznaVar.zzvt.listIterator(i);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.zzvu.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.zzvu.hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.zzvu.nextIndex();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.zzvu.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(java.lang.String str) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void set(java.lang.String str) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ java.lang.String previous() {
        return this.zzvu.previous();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* synthetic */ java.lang.Object next() {
        return this.zzvu.next();
    }
}
