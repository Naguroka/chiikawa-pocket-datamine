package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzeur implements com.google.android.gms.internal.ads.zzetr {
    private final android.content.Context zza;
    private final java.util.concurrent.ScheduledExecutorService zzb;
    private final java.util.concurrent.Executor zzc;
    private final int zzd;
    private final boolean zze;
    private final boolean zzf;
    private final com.google.android.gms.internal.ads.zzbzd zzg;

    zzeur(com.google.android.gms.internal.ads.zzbzd zzbzdVar, android.content.Context context, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, java.util.concurrent.Executor executor, int i, boolean z, boolean z2) {
        this.zzg = zzbzdVar;
        this.zza = context;
        this.zzb = scheduledExecutorService;
        this.zzc = executor;
        this.zzd = i;
        this.zze = z;
        this.zzf = z2;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 40;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final com.google.common.util.concurrent.ListenableFuture zzb() {
        return (com.google.android.gms.internal.ads.zzgby) com.google.android.gms.internal.ads.zzgch.zze((com.google.android.gms.internal.ads.zzgby) com.google.android.gms.internal.ads.zzgch.zzo((com.google.android.gms.internal.ads.zzgby) com.google.android.gms.internal.ads.zzgch.zzm(com.google.android.gms.internal.ads.zzgby.zzu(this.zzg.zza(this.zza, this.zzd)), new com.google.android.gms.internal.ads.zzfuc() { // from class: com.google.android.gms.internal.ads.zzeup
            @Override // com.google.android.gms.internal.ads.zzfuc
            public final java.lang.Object apply(java.lang.Object obj) {
                return this.zza.zzc((com.google.android.gms.ads.identifier.AdvertisingIdClient.Info) obj);
            }
        }, this.zzc), ((java.lang.Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzbe)).longValue(), java.util.concurrent.TimeUnit.MILLISECONDS, this.zzb), java.lang.Throwable.class, new com.google.android.gms.internal.ads.zzfuc() { // from class: com.google.android.gms.internal.ads.zzeuq
            @Override // com.google.android.gms.internal.ads.zzfuc
            public final java.lang.Object apply(java.lang.Object obj) {
                return this.zza.zzd((java.lang.Throwable) obj);
            }
        }, this.zzc);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0031 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:6:0x001b  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    final /* synthetic */ com.google.android.gms.internal.ads.zzeus zzc(com.google.android.gms.ads.identifier.AdvertisingIdClient.Info info) {
        com.google.android.gms.internal.ads.zzfra zzfraVar = new com.google.android.gms.internal.ads.zzfra();
        if (!this.zze) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzdj)).booleanValue()) {
                zzfraVar = com.google.android.gms.internal.ads.zzfre.zzj(this.zza).zzi((java.lang.String) java.util.Objects.requireNonNull(((com.google.android.gms.ads.identifier.AdvertisingIdClient.Info) java.util.Objects.requireNonNull(info)).getId()), this.zza.getPackageName(), ((java.lang.Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzdp)).longValue(), this.zzf);
            } else if (this.zze) {
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzdk)).booleanValue()) {
                    try {
                        zzfraVar = com.google.android.gms.internal.ads.zzfre.zzj(this.zza).zzi((java.lang.String) java.util.Objects.requireNonNull(((com.google.android.gms.ads.identifier.AdvertisingIdClient.Info) java.util.Objects.requireNonNull(info)).getId()), this.zza.getPackageName(), ((java.lang.Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzdp)).longValue(), this.zzf);
                    } catch (java.io.IOException | java.lang.IllegalArgumentException e) {
                        com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "AdIdInfoSignalSource.getPaidV1");
                        zzfraVar = new com.google.android.gms.internal.ads.zzfra();
                    }
                }
            }
        } else if (this.zze) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzdk)).booleanValue()) {
                zzfraVar = com.google.android.gms.internal.ads.zzfre.zzj(this.zza).zzi((java.lang.String) java.util.Objects.requireNonNull(((com.google.android.gms.ads.identifier.AdvertisingIdClient.Info) java.util.Objects.requireNonNull(info)).getId()), this.zza.getPackageName(), ((java.lang.Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzdp)).longValue(), this.zzf);
            }
        }
        return new com.google.android.gms.internal.ads.zzeus(info, null, zzfraVar);
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzeus zzd(java.lang.Throwable th) {
        com.google.android.gms.ads.internal.client.zzbc.zzb();
        android.content.ContentResolver contentResolver = this.zza.getContentResolver();
        return new com.google.android.gms.internal.ads.zzeus(null, contentResolver == null ? null : android.provider.Settings.Secure.getString(contentResolver, "android_id"), new com.google.android.gms.internal.ads.zzfra());
    }
}
