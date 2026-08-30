package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
abstract class zzfzs extends com.google.android.gms.internal.ads.zzfzr implements java.util.ListIterator {
    zzfzs(java.util.ListIterator listIterator) {
        super(listIterator);
    }

    @Override // java.util.ListIterator
    public final void add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return ((java.util.ListIterator) this.zzb).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return ((java.util.ListIterator) this.zzb).nextIndex();
    }

    @Override // java.util.ListIterator
    public final java.lang.Object previous() {
        return zza(((java.util.ListIterator) this.zzb).previous());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return ((java.util.ListIterator) this.zzb).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }
}
