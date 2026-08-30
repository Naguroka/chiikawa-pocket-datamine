package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzfya extends java.util.AbstractList implements java.util.RandomAccess, java.io.Serializable {
    final java.util.List zza;
    final com.google.android.gms.internal.ads.zzfuc zzb;

    zzfya(java.util.List list, com.google.android.gms.internal.ads.zzfuc zzfucVar) {
        list.getClass();
        this.zza = list;
        this.zzb = zzfucVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object get(int i) {
        return this.zzb.apply(this.zza.get(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.zza.isEmpty();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final java.util.Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.util.ListIterator listIterator(int i) {
        return new com.google.android.gms.internal.ads.zzfxz(this, this.zza.listIterator(i));
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object remove(int i) {
        return this.zzb.apply(this.zza.remove(i));
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        this.zza.subList(i, i2).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }
}
