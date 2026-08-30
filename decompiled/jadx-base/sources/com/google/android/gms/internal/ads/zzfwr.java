package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
abstract class zzfwr implements java.util.Iterator {
    int zzb;
    int zzc;
    int zzd = -1;
    final /* synthetic */ com.google.android.gms.internal.ads.zzfww zze;

    /* synthetic */ zzfwr(com.google.android.gms.internal.ads.zzfww zzfwwVar, com.google.android.gms.internal.ads.zzfwv zzfwvVar) {
        this.zze = zzfwwVar;
        this.zzb = zzfwwVar.zzf;
        this.zzc = zzfwwVar.zze();
    }

    private final void zzb() {
        if (this.zze.zzf != this.zzb) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzc >= 0;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        zzb();
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        int i = this.zzc;
        this.zzd = i;
        java.lang.Object objZza = zza(i);
        this.zzc = this.zze.zzf(this.zzc);
        return objZza;
    }

    @Override // java.util.Iterator
    public final void remove() {
        zzb();
        com.google.android.gms.internal.ads.zzfun.zzm(this.zzd >= 0, "no calls to next() since the last call to remove()");
        this.zzb += 32;
        int i = this.zzd;
        com.google.android.gms.internal.ads.zzfww zzfwwVar = this.zze;
        zzfwwVar.remove(com.google.android.gms.internal.ads.zzfww.zzg(zzfwwVar, i));
        this.zzc--;
        this.zzd = -1;
    }

    abstract java.lang.Object zza(int i);
}
