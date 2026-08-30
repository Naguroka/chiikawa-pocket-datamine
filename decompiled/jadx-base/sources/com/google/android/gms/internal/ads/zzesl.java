package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzesl implements com.google.android.gms.internal.ads.zzetr {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzgcs zzb;
    private final com.google.android.gms.internal.ads.zzfcj zzc;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzd;

    zzesl(android.content.Context context, com.google.android.gms.internal.ads.zzgcs zzgcsVar, com.google.android.gms.internal.ads.zzfcj zzfcjVar, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel) {
        this.zza = context;
        this.zzb = zzgcsVar;
        this.zzc = zzfcjVar;
        this.zzd = versionInfoParcel;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 53;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final com.google.common.util.concurrent.ListenableFuture zzb() {
        return this.zzb.zzb(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzesk
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return this.zza.zzc();
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0042 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:11:0x0044 A[Catch: IOException -> 0x0126, TryCatch #0 {IOException -> 0x0126, blocks: (B:2:0x0000, B:4:0x0015, B:6:0x0027, B:8:0x0030, B:13:0x0056, B:14:0x007a, B:16:0x008c, B:18:0x00a2, B:20:0x00ab, B:25:0x00d1, B:27:0x00ef, B:28:0x0113, B:30:0x011e, B:23:0x00bf, B:11:0x0044), top: B:35:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:13:0x0056 A[Catch: IOException -> 0x0126, TryCatch #0 {IOException -> 0x0126, blocks: (B:2:0x0000, B:4:0x0015, B:6:0x0027, B:8:0x0030, B:13:0x0056, B:14:0x007a, B:16:0x008c, B:18:0x00a2, B:20:0x00ab, B:25:0x00d1, B:27:0x00ef, B:28:0x0113, B:30:0x011e, B:23:0x00bf, B:11:0x0044), top: B:35:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x00bd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x00bf A[Catch: IOException -> 0x0126, TryCatch #0 {IOException -> 0x0126, blocks: (B:2:0x0000, B:4:0x0015, B:6:0x0027, B:8:0x0030, B:13:0x0056, B:14:0x007a, B:16:0x008c, B:18:0x00a2, B:20:0x00ab, B:25:0x00d1, B:27:0x00ef, B:28:0x0113, B:30:0x011e, B:23:0x00bf, B:11:0x0044), top: B:35:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x00d1 A[Catch: IOException -> 0x0126, TryCatch #0 {IOException -> 0x0126, blocks: (B:2:0x0000, B:4:0x0015, B:6:0x0027, B:8:0x0030, B:13:0x0056, B:14:0x007a, B:16:0x008c, B:18:0x00a2, B:20:0x00ab, B:25:0x00d1, B:27:0x00ef, B:28:0x0113, B:30:0x011e, B:23:0x00bf, B:11:0x0044), top: B:35:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x00ef A[Catch: IOException -> 0x0126, TryCatch #0 {IOException -> 0x0126, blocks: (B:2:0x0000, B:4:0x0015, B:6:0x0027, B:8:0x0030, B:13:0x0056, B:14:0x007a, B:16:0x008c, B:18:0x00a2, B:20:0x00ab, B:25:0x00d1, B:27:0x00ef, B:28:0x0113, B:30:0x011e, B:23:0x00bf, B:11:0x0044), top: B:35:0x0000 }] */
    final /* synthetic */ com.google.android.gms.internal.ads.zzesm zzc() throws java.lang.Exception {
        com.google.android.gms.internal.ads.zzfra zzfraVar;
        boolean z;
        boolean zZze;
        com.google.android.gms.internal.ads.zzfrf zzfrfVarZzi;
        com.google.android.gms.internal.ads.zzfrb zzfrbVarZza;
        try {
            android.content.Context context = this.zza;
            boolean zZzb = this.zzc.zzb();
            com.google.android.gms.internal.ads.zzfra zzfraVar2 = new com.google.android.gms.internal.ads.zzfra();
            com.google.android.gms.internal.ads.zzfra zzfraVar3 = new com.google.android.gms.internal.ads.zzfra();
            boolean zZzd = true;
            if (zZzb) {
                if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzdi)).booleanValue()) {
                    return new com.google.android.gms.internal.ads.zzesm(true);
                }
            }
            if (!zZzb) {
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzde)).booleanValue()) {
                    zzfraVar2 = com.google.android.gms.internal.ads.zzfre.zzj(context).zzh(((java.lang.Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzdp)).longValue(), com.google.android.gms.ads.internal.zzv.zzp().zzi().zzN());
                } else if (zZzb) {
                    if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzdg)).booleanValue()) {
                        zzfraVar2 = com.google.android.gms.internal.ads.zzfre.zzj(context).zzh(((java.lang.Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzdp)).longValue(), com.google.android.gms.ads.internal.zzv.zzp().zzi().zzN());
                    }
                }
            } else if (zZzb) {
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzdg)).booleanValue()) {
                    zzfraVar2 = com.google.android.gms.internal.ads.zzfre.zzj(context).zzh(((java.lang.Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzdp)).longValue(), com.google.android.gms.ads.internal.zzv.zzp().zzi().zzN());
                }
            }
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzdm)).booleanValue()) {
                if (this.zzd.clientJarVersion < ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzdl)).intValue()) {
                    com.google.android.gms.internal.ads.zzfrf.zzi(context).zzj();
                }
            }
            if (zZzb) {
                if (zZzb) {
                    if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzdh)).booleanValue()) {
                        zzfrfVarZzi = com.google.android.gms.internal.ads.zzfrf.zzi(context);
                        zzfrbVarZza = com.google.android.gms.internal.ads.zzfrb.zza(context);
                        if (this.zzd.clientJarVersion >= ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzdl)).intValue()) {
                            zzfraVar3 = zzfrfVarZzi.zzh(((java.lang.Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzdq)).longValue(), com.google.android.gms.ads.internal.zzv.zzp().zzi().zzN());
                            zZzd = zzfrbVarZza.zzd();
                        }
                        zZze = zzfrbVarZza.zze();
                        zzfraVar = zzfraVar3;
                        z = zZzd;
                    }
                }
                zzfraVar = zzfraVar3;
                z = true;
                zZze = true;
            } else {
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzdf)).booleanValue()) {
                    zzfrfVarZzi = com.google.android.gms.internal.ads.zzfrf.zzi(context);
                    zzfrbVarZza = com.google.android.gms.internal.ads.zzfrb.zza(context);
                    if (this.zzd.clientJarVersion >= ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzdl)).intValue()) {
                        zzfraVar3 = zzfrfVarZzi.zzh(((java.lang.Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzdq)).longValue(), com.google.android.gms.ads.internal.zzv.zzp().zzi().zzN());
                        zZzd = zzfrbVarZza.zzd();
                    }
                    zZze = zzfrbVarZza.zze();
                    zzfraVar = zzfraVar3;
                    z = zZzd;
                } else {
                    if (zZzb) {
                        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzdh)).booleanValue()) {
                            zzfrfVarZzi = com.google.android.gms.internal.ads.zzfrf.zzi(context);
                            zzfrbVarZza = com.google.android.gms.internal.ads.zzfrb.zza(context);
                            if (this.zzd.clientJarVersion >= ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzdl)).intValue()) {
                                zzfraVar3 = zzfrfVarZzi.zzh(((java.lang.Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzdq)).longValue(), com.google.android.gms.ads.internal.zzv.zzp().zzi().zzN());
                                zZzd = zzfrbVarZza.zzd();
                            }
                            zZze = zzfrbVarZza.zze();
                            zzfraVar = zzfraVar3;
                            z = zZzd;
                        }
                    }
                    zzfraVar = zzfraVar3;
                    z = true;
                    zZze = true;
                }
            }
            return new com.google.android.gms.internal.ads.zzesm(zzfraVar2, zzfraVar, z, zZze, zZzb);
        } catch (java.io.IOException e) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "PerAppIdSignal");
            return new com.google.android.gms.internal.ads.zzesm(this.zzc.zzb());
        }
    }
}
