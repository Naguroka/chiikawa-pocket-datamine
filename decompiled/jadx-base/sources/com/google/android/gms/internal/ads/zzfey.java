package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfey {
    private final com.google.android.gms.internal.ads.zzfer zza;
    private final com.google.common.util.concurrent.ListenableFuture zzb;
    private boolean zzc = false;
    private boolean zzd = false;

    public zzfey(final com.google.android.gms.internal.ads.zzfdw zzfdwVar, final com.google.android.gms.internal.ads.zzfeq zzfeqVar, final com.google.android.gms.internal.ads.zzfer zzferVar) {
        this.zza = zzferVar;
        this.zzb = com.google.android.gms.internal.ads.zzgch.zzf(com.google.android.gms.internal.ads.zzgch.zzn(zzfeqVar.zza(zzferVar), new com.google.android.gms.internal.ads.zzgbo() { // from class: com.google.android.gms.internal.ads.zzfew
            @Override // com.google.android.gms.internal.ads.zzgbo
            public final com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                return this.zza.zzb(zzfeqVar, zzfdwVar, zzferVar, (com.google.android.gms.internal.ads.zzfef) obj);
            }
        }, zzferVar.zzb()), java.lang.Exception.class, new com.google.android.gms.internal.ads.zzgbo() { // from class: com.google.android.gms.internal.ads.zzfex
            @Override // com.google.android.gms.internal.ads.zzgbo
            public final com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                return this.zza.zzc(zzfeqVar, (java.lang.Exception) obj);
            }
        }, zzferVar.zzb());
    }

    public final synchronized com.google.common.util.concurrent.ListenableFuture zza(com.google.android.gms.internal.ads.zzfer zzferVar) {
        if (!this.zzd && !this.zzc && this.zza.zza() != null && zzferVar.zza() != null && this.zza.zza().equals(zzferVar.zza())) {
            this.zzc = true;
            return this.zzb;
        }
        return null;
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzb(com.google.android.gms.internal.ads.zzfeq zzfeqVar, com.google.android.gms.internal.ads.zzfdw zzfdwVar, com.google.android.gms.internal.ads.zzfer zzferVar, com.google.android.gms.internal.ads.zzfef zzfefVar) throws java.lang.Exception {
        synchronized (this) {
            this.zzd = true;
            zzfeqVar.zzb(zzfefVar);
            if (this.zzc) {
                return com.google.android.gms.internal.ads.zzgch.zzh(new com.google.android.gms.internal.ads.zzfep(zzfefVar, zzferVar));
            }
            zzfdwVar.zzd(zzferVar.zza(), zzfefVar);
            return com.google.android.gms.internal.ads.zzgch.zzh(null);
        }
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzc(com.google.android.gms.internal.ads.zzfeq zzfeqVar, java.lang.Exception exc) throws java.lang.Exception {
        synchronized (this) {
            this.zzd = true;
            throw exc;
        }
    }

    public final synchronized void zzd(com.google.android.gms.internal.ads.zzgcd zzgcdVar) {
        com.google.android.gms.internal.ads.zzgch.zzr(com.google.android.gms.internal.ads.zzgch.zzn(this.zzb, new com.google.android.gms.internal.ads.zzgbo() { // from class: com.google.android.gms.internal.ads.zzfev
            @Override // com.google.android.gms.internal.ads.zzgbo
            public final com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                return com.google.android.gms.internal.ads.zzgch.zzi();
            }
        }, this.zza.zzb()), zzgcdVar, this.zza.zzb());
    }
}
