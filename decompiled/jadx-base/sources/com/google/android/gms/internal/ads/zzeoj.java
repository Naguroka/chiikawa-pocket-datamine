package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzeoj implements com.google.android.gms.internal.ads.zzetr {
    private final java.util.concurrent.atomic.AtomicReference zza = new java.util.concurrent.atomic.AtomicReference();
    private final java.util.concurrent.atomic.AtomicReference zzb = new java.util.concurrent.atomic.AtomicReference(false);
    private final com.google.android.gms.common.util.Clock zzc;
    private final java.util.concurrent.Executor zzd;
    private final com.google.android.gms.internal.ads.zzetr zze;
    private final long zzf;
    private final com.google.android.gms.internal.ads.zzdrw zzg;

    public zzeoj(com.google.android.gms.internal.ads.zzetr zzetrVar, long j, com.google.android.gms.common.util.Clock clock, java.util.concurrent.Executor executor, com.google.android.gms.internal.ads.zzdrw zzdrwVar) {
        this.zzc = clock;
        this.zze = zzetrVar;
        this.zzf = j;
        this.zzd = executor;
        this.zzg = zzdrwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return this.zze.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final com.google.common.util.concurrent.ListenableFuture zzb() {
        com.google.android.gms.internal.ads.zzeoi zzeoiVar;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzlF)).booleanValue()) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzlE)).booleanValue() && !((java.lang.Boolean) this.zzb.getAndSet(true)).booleanValue()) {
                java.util.concurrent.ScheduledExecutorService scheduledExecutorService = com.google.android.gms.internal.ads.zzbzw.zzd;
                java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzeog
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.google.android.gms.internal.ads.zzeoj zzeojVar = this.zza;
                        zzeojVar.zzd.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzeoh
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzeojVar.zzd();
                            }
                        });
                    }
                };
                long j = this.zzf;
                scheduledExecutorService.scheduleWithFixedDelay(runnable, j, j, java.util.concurrent.TimeUnit.MILLISECONDS);
            }
            synchronized (this) {
                zzeoiVar = (com.google.android.gms.internal.ads.zzeoi) this.zza.get();
                if (zzeoiVar == null) {
                    com.google.android.gms.internal.ads.zzeoi zzeoiVar2 = new com.google.android.gms.internal.ads.zzeoi(this.zze.zzb(), this.zzf, this.zzc);
                    this.zza.set(zzeoiVar2);
                    return zzeoiVar2.zza;
                }
                if (!((java.lang.Boolean) this.zzb.get()).booleanValue() && zzeoiVar.zza()) {
                    com.google.common.util.concurrent.ListenableFuture listenableFuture = zzeoiVar.zza;
                    com.google.android.gms.internal.ads.zzetr zzetrVar = this.zze;
                    com.google.android.gms.internal.ads.zzeoi zzeoiVar3 = new com.google.android.gms.internal.ads.zzeoi(zzetrVar.zzb(), this.zzf, this.zzc);
                    this.zza.set(zzeoiVar3);
                    if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzlG)).booleanValue()) {
                        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzlH)).booleanValue()) {
                            com.google.android.gms.internal.ads.zzdrv zzdrvVarZza = this.zzg.zza();
                            zzdrvVarZza.zzb("action", "scs");
                            zzdrvVarZza.zzb("sid", java.lang.String.valueOf(this.zze.zza()));
                            zzdrvVarZza.zzg();
                        }
                        return listenableFuture;
                    }
                    zzeoiVar = zzeoiVar3;
                }
            }
        } else {
            zzeoiVar = (com.google.android.gms.internal.ads.zzeoi) this.zza.get();
            if (zzeoiVar == null || zzeoiVar.zza()) {
                com.google.android.gms.internal.ads.zzetr zzetrVar2 = this.zze;
                com.google.android.gms.internal.ads.zzeoi zzeoiVar4 = new com.google.android.gms.internal.ads.zzeoi(zzetrVar2.zzb(), this.zzf, this.zzc);
                this.zza.set(zzeoiVar4);
                zzeoiVar = zzeoiVar4;
            }
        }
        return zzeoiVar.zza;
    }

    final /* synthetic */ void zzd() {
        this.zza.set(new com.google.android.gms.internal.ads.zzeoi(this.zze.zzb(), this.zzf, this.zzc));
    }
}
