package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzhaa implements java.util.Iterator {
    final /* synthetic */ com.google.android.gms.internal.ads.zzhad zza;
    private int zzb = -1;
    private boolean zzc;
    private java.util.Iterator zzd;

    /* synthetic */ zzhaa(com.google.android.gms.internal.ads.zzhad zzhadVar, com.google.android.gms.internal.ads.zzhac zzhacVar) {
        this.zza = zzhadVar;
    }

    private final java.util.Iterator zza() {
        if (this.zzd == null) {
            this.zzd = this.zza.zzc.entrySet().iterator();
        }
        return this.zzd;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.zzb + 1;
        com.google.android.gms.internal.ads.zzhad zzhadVar = this.zza;
        if (i >= zzhadVar.zzb) {
            return !zzhadVar.zzc.isEmpty() && zza().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ java.lang.Object next() {
        this.zzc = true;
        int i = this.zzb + 1;
        this.zzb = i;
        com.google.android.gms.internal.ads.zzhad zzhadVar = this.zza;
        return i < zzhadVar.zzb ? (com.google.android.gms.internal.ads.zzgzz) zzhadVar.zza[i] : (java.util.Map.Entry) zza().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.zzc) {
            throw new java.lang.IllegalStateException("remove() was called before next()");
        }
        this.zzc = false;
        this.zza.zzo();
        int i = this.zzb;
        com.google.android.gms.internal.ads.zzhad zzhadVar = this.zza;
        if (i >= zzhadVar.zzb) {
            zza().remove();
        } else {
            this.zzb = i - 1;
            zzhadVar.zzm(i);
        }
    }
}
