package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzeeq implements com.google.android.gms.internal.ads.zzecw {
    private final com.google.android.gms.internal.ads.zzcpq zza;
    private final com.google.android.gms.internal.ads.zzedx zzb;
    private final com.google.android.gms.internal.ads.zzgcs zzc;
    private final com.google.android.gms.internal.ads.zzcvv zzd;
    private final java.util.concurrent.ScheduledExecutorService zze;
    private final com.google.android.gms.internal.ads.zzdrq zzf;

    public zzeeq(com.google.android.gms.internal.ads.zzcpq zzcpqVar, com.google.android.gms.internal.ads.zzedx zzedxVar, com.google.android.gms.internal.ads.zzcvv zzcvvVar, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, com.google.android.gms.internal.ads.zzgcs zzgcsVar, com.google.android.gms.internal.ads.zzdrq zzdrqVar) {
        this.zza = zzcpqVar;
        this.zzb = zzedxVar;
        this.zzd = zzcvvVar;
        this.zze = scheduledExecutorService;
        this.zzc = zzgcsVar;
        this.zzf = zzdrqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzecw
    public final com.google.common.util.concurrent.ListenableFuture zza(final com.google.android.gms.internal.ads.zzfca zzfcaVar, final com.google.android.gms.internal.ads.zzfbo zzfboVar) {
        return this.zzc.zzb(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzeen
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return this.zza.zzc(zzfcaVar, zzfboVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzecw
    public final boolean zzb(com.google.android.gms.internal.ads.zzfca zzfcaVar, com.google.android.gms.internal.ads.zzfbo zzfboVar) {
        com.google.android.gms.internal.ads.zzbhn zzbhnVarZza = zzfcaVar.zza.zza.zza();
        boolean zZzb = this.zzb.zzb(zzfcaVar, zzfboVar);
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzlQ)).booleanValue()) {
            this.zzf.zzb().put("has_dbl", zzbhnVarZza != null ? "1" : "0");
            this.zzf.zzb().put("crdb", true != zZzb ? "0" : "1");
        }
        return zzbhnVarZza != null && zZzb;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzcom zzc(final com.google.android.gms.internal.ads.zzfca zzfcaVar, final com.google.android.gms.internal.ads.zzfbo zzfboVar) throws java.lang.Exception {
        return this.zza.zzb(new com.google.android.gms.internal.ads.zzcrp(zzfcaVar, zzfboVar, null), new com.google.android.gms.internal.ads.zzcqh(zzfcaVar.zza.zza.zza(), new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzeeo
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzf(zzfcaVar, zzfboVar);
            }
        })).zza();
    }

    final /* synthetic */ void zzf(com.google.android.gms.internal.ads.zzfca zzfcaVar, com.google.android.gms.internal.ads.zzfbo zzfboVar) {
        com.google.android.gms.internal.ads.zzgch.zzr(com.google.android.gms.internal.ads.zzgch.zzo(this.zzb.zza(zzfcaVar, zzfboVar), zzfboVar.zzR, java.util.concurrent.TimeUnit.SECONDS, this.zze), new com.google.android.gms.internal.ads.zzeep(this), this.zzc);
    }
}
