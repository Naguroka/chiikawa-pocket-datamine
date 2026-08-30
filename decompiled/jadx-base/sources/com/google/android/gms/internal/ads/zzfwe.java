package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzfwe extends com.google.android.gms.internal.ads.zzfwc implements java.util.ListIterator {
    final /* synthetic */ com.google.android.gms.internal.ads.zzfwf zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzfwe(com.google.android.gms.internal.ads.zzfwf zzfwfVar) {
        super(zzfwfVar);
        this.zzd = zzfwfVar;
    }

    @Override // java.util.ListIterator
    public final void add(java.lang.Object obj) {
        boolean zIsEmpty = this.zzd.isEmpty();
        zza();
        ((java.util.ListIterator) this.zza).add(obj);
        this.zzd.zzf.zzb++;
        if (zIsEmpty) {
            this.zzd.zza();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        zza();
        return ((java.util.ListIterator) this.zza).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        zza();
        return ((java.util.ListIterator) this.zza).nextIndex();
    }

    @Override // java.util.ListIterator
    public final java.lang.Object previous() {
        zza();
        return ((java.util.ListIterator) this.zza).previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        zza();
        return ((java.util.ListIterator) this.zza).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(java.lang.Object obj) {
        zza();
        ((java.util.ListIterator) this.zza).set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfwe(com.google.android.gms.internal.ads.zzfwf zzfwfVar, int i) {
        super(zzfwfVar, ((java.util.List) zzfwfVar.zzb).listIterator(i));
        this.zzd = zzfwfVar;
    }
}
