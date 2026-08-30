package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
class zzfwc implements java.util.Iterator {
    final java.util.Iterator zza;
    final java.util.Collection zzb;
    final /* synthetic */ com.google.android.gms.internal.ads.zzfwd zzc;

    zzfwc(com.google.android.gms.internal.ads.zzfwd zzfwdVar) {
        this.zzc = zzfwdVar;
        this.zzb = zzfwdVar.zzb;
        java.util.Collection collection = zzfwdVar.zzb;
        this.zza = collection instanceof java.util.List ? ((java.util.List) collection).listIterator() : collection.iterator();
    }

    zzfwc(com.google.android.gms.internal.ads.zzfwd zzfwdVar, java.util.Iterator it) {
        this.zzc = zzfwdVar;
        this.zzb = zzfwdVar.zzb;
        this.zza = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        zza();
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        zza();
        return this.zza.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.zza.remove();
        this.zzc.zze.zzb--;
        this.zzc.zzc();
    }

    final void zza() {
        this.zzc.zzb();
        if (this.zzc.zzb != this.zzb) {
            throw new java.util.ConcurrentModificationException();
        }
    }
}
