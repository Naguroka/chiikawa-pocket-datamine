package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
public final class zzna extends java.util.AbstractList<java.lang.String> implements com.google.android.gms.internal.drive.zzkz, java.util.RandomAccess {
    private final com.google.android.gms.internal.drive.zzkz zzvt;

    public zzna(com.google.android.gms.internal.drive.zzkz zzkzVar) {
        this.zzvt = zzkzVar;
    }

    @Override // com.google.android.gms.internal.drive.zzkz
    public final com.google.android.gms.internal.drive.zzkz zzds() {
        return this;
    }

    @Override // com.google.android.gms.internal.drive.zzkz
    public final java.lang.Object zzao(int i) {
        return this.zzvt.zzao(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzvt.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.util.ListIterator<java.lang.String> listIterator(int i) {
        return new com.google.android.gms.internal.drive.zznb(this, i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final java.util.Iterator<java.lang.String> iterator() {
        return new com.google.android.gms.internal.drive.zznc(this);
    }

    @Override // com.google.android.gms.internal.drive.zzkz
    public final java.util.List<?> zzdr() {
        return this.zzvt.zzdr();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object get(int i) {
        return (java.lang.String) this.zzvt.get(i);
    }
}
