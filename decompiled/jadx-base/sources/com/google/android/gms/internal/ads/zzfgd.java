package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfgd {
    final /* synthetic */ com.google.android.gms.internal.ads.zzfgf zza;
    private final java.lang.Object zzb;
    private final java.lang.String zzc;
    private final com.google.common.util.concurrent.ListenableFuture zzd;
    private final java.util.List zze;
    private final com.google.common.util.concurrent.ListenableFuture zzf;

    private zzfgd(com.google.android.gms.internal.ads.zzfgf zzfgfVar, java.lang.Object obj, java.lang.String str, com.google.common.util.concurrent.ListenableFuture listenableFuture, java.util.List list, com.google.common.util.concurrent.ListenableFuture listenableFuture2) {
        this.zza = zzfgfVar;
        this.zzb = obj;
        this.zzc = str;
        this.zzd = listenableFuture;
        this.zze = list;
        this.zzf = listenableFuture2;
    }

    public final com.google.android.gms.internal.ads.zzfft zza() {
        java.lang.Object obj = this.zzb;
        java.lang.String strZzf = this.zzc;
        if (strZzf == null) {
            strZzf = this.zza.zzf(obj);
        }
        final com.google.android.gms.internal.ads.zzfft zzfftVar = new com.google.android.gms.internal.ads.zzfft(obj, strZzf, this.zzf);
        this.zza.zzd.zza(zzfftVar);
        this.zzd.addListener(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzfgb
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zza.zzd.zzc(zzfftVar);
            }
        }, com.google.android.gms.internal.ads.zzbzw.zzg);
        com.google.android.gms.internal.ads.zzgch.zzr(zzfftVar, new com.google.android.gms.internal.ads.zzfgc(this, zzfftVar), com.google.android.gms.internal.ads.zzbzw.zzg);
        return zzfftVar;
    }

    public final com.google.android.gms.internal.ads.zzfgd zzb(java.lang.Object obj) {
        return this.zza.zzb(obj, zza());
    }

    public final com.google.android.gms.internal.ads.zzfgd zzc(java.lang.Class cls, com.google.android.gms.internal.ads.zzgbo zzgboVar) {
        return new com.google.android.gms.internal.ads.zzfgd(this.zza, this.zzb, this.zzc, this.zzd, this.zze, com.google.android.gms.internal.ads.zzgch.zzf(this.zzf, cls, zzgboVar, this.zza.zzb));
    }

    public final com.google.android.gms.internal.ads.zzfgd zzd(final com.google.common.util.concurrent.ListenableFuture listenableFuture) {
        return zzg(new com.google.android.gms.internal.ads.zzgbo() { // from class: com.google.android.gms.internal.ads.zzfga
            @Override // com.google.android.gms.internal.ads.zzgbo
            public final com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                return listenableFuture;
            }
        }, com.google.android.gms.internal.ads.zzbzw.zzg);
    }

    public final com.google.android.gms.internal.ads.zzfgd zze(final com.google.android.gms.internal.ads.zzffr zzffrVar) {
        return zzf(new com.google.android.gms.internal.ads.zzgbo() { // from class: com.google.android.gms.internal.ads.zzffz
            @Override // com.google.android.gms.internal.ads.zzgbo
            public final com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                return com.google.android.gms.internal.ads.zzgch.zzh(zzffrVar.zza(obj));
            }
        });
    }

    public final com.google.android.gms.internal.ads.zzfgd zzf(com.google.android.gms.internal.ads.zzgbo zzgboVar) {
        return zzg(zzgboVar, this.zza.zzb);
    }

    public final com.google.android.gms.internal.ads.zzfgd zzg(com.google.android.gms.internal.ads.zzgbo zzgboVar, java.util.concurrent.Executor executor) {
        return new com.google.android.gms.internal.ads.zzfgd(this.zza, this.zzb, this.zzc, this.zzd, this.zze, com.google.android.gms.internal.ads.zzgch.zzn(this.zzf, zzgboVar, executor));
    }

    public final com.google.android.gms.internal.ads.zzfgd zzh(java.lang.String str) {
        return new com.google.android.gms.internal.ads.zzfgd(this.zza, this.zzb, str, this.zzd, this.zze, this.zzf);
    }

    public final com.google.android.gms.internal.ads.zzfgd zzi(long j, java.util.concurrent.TimeUnit timeUnit) {
        return new com.google.android.gms.internal.ads.zzfgd(this.zza, this.zzb, this.zzc, this.zzd, this.zze, com.google.android.gms.internal.ads.zzgch.zzo(this.zzf, j, timeUnit, this.zza.zzc));
    }
}
