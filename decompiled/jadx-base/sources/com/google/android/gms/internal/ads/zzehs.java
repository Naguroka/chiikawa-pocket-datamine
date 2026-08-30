package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzehs implements com.google.android.gms.internal.ads.zzdgc {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzdow zzb;
    private final com.google.android.gms.internal.ads.zzfcj zzc;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzd;
    private final com.google.android.gms.internal.ads.zzfbo zze;
    private final com.google.common.util.concurrent.ListenableFuture zzf;
    private final com.google.android.gms.internal.ads.zzcex zzg;
    private final com.google.android.gms.internal.ads.zzbjs zzh;
    private final boolean zzi;
    private final com.google.android.gms.internal.ads.zzebv zzj;
    private final com.google.android.gms.internal.ads.zzdrq zzk;
    private final com.google.android.gms.internal.ads.zzdrw zzl;

    zzehs(android.content.Context context, com.google.android.gms.internal.ads.zzdow zzdowVar, com.google.android.gms.internal.ads.zzfcj zzfcjVar, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel, com.google.android.gms.internal.ads.zzfbo zzfboVar, com.google.common.util.concurrent.ListenableFuture listenableFuture, com.google.android.gms.internal.ads.zzcex zzcexVar, com.google.android.gms.internal.ads.zzbjs zzbjsVar, boolean z, com.google.android.gms.internal.ads.zzebv zzebvVar, com.google.android.gms.internal.ads.zzdrq zzdrqVar, com.google.android.gms.internal.ads.zzdrw zzdrwVar) {
        this.zza = context;
        this.zzb = zzdowVar;
        this.zzc = zzfcjVar;
        this.zzd = versionInfoParcel;
        this.zze = zzfboVar;
        this.zzf = listenableFuture;
        this.zzg = zzcexVar;
        this.zzh = zzbjsVar;
        this.zzi = z;
        this.zzj = zzebvVar;
        this.zzk = zzdrqVar;
        this.zzl = zzdrwVar;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0092  */
    /* JADX WARN: Code duplicated, block: B:19:0x009a  */
    /* JADX WARN: Code duplicated, block: B:22:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:23:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:26:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:27:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:30:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:33:0x00f5  */
    @Override // com.google.android.gms.internal.ads.zzdgc
    public final void zza(boolean z, android.content.Context context, com.google.android.gms.internal.ads.zzcwg zzcwgVar) {
        com.google.android.gms.internal.ads.zzcex zzcexVar;
        com.google.android.gms.internal.ads.zzcex zzcexVar2;
        boolean zZze;
        boolean z2;
        boolean zZzd;
        float fZza;
        com.google.android.gms.internal.ads.zzdob zzdobVar = (com.google.android.gms.internal.ads.zzdob) com.google.android.gms.internal.ads.zzgch.zzq(this.zzf);
        try {
            com.google.android.gms.internal.ads.zzfbo zzfboVar = this.zze;
            if (this.zzg.zzaG()) {
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzaX)).booleanValue()) {
                    final com.google.android.gms.internal.ads.zzcex zzcexVarZza = this.zzb.zza(this.zzc.zze, null, null);
                    com.google.android.gms.internal.ads.zzbkh.zzb(zzcexVarZza, zzdobVar.zzg());
                    final com.google.android.gms.internal.ads.zzdpa zzdpaVar = new com.google.android.gms.internal.ads.zzdpa();
                    zzdpaVar.zza(this.zza, zzcexVarZza.zzF());
                    zzdobVar.zzl().zzi(zzcexVarZza, true, this.zzi ? this.zzh : null, this.zzk.zza());
                    zzcexVarZza.zzN().zzC(new com.google.android.gms.internal.ads.zzcgn() { // from class: com.google.android.gms.internal.ads.zzehq
                        @Override // com.google.android.gms.internal.ads.zzcgn
                        public final void zza(boolean z3, int i, java.lang.String str, java.lang.String str2) {
                            zzdpaVar.zzb();
                            com.google.android.gms.internal.ads.zzcex zzcexVar3 = zzcexVarZza;
                            zzcexVar3.zzab();
                            zzcexVar3.zzN().zzs();
                        }
                    });
                    com.google.android.gms.internal.ads.zzcgp zzcgpVarZzN = zzcexVarZza.zzN();
                    java.util.Objects.requireNonNull(zzcexVarZza);
                    zzcgpVarZzN.zzJ(new com.google.android.gms.internal.ads.zzcgo() { // from class: com.google.android.gms.internal.ads.zzehr
                        @Override // com.google.android.gms.internal.ads.zzcgo
                        public final void zza() {
                            zzcexVarZza.zzaa();
                        }
                    });
                    com.google.android.gms.internal.ads.zzfbt zzfbtVar = zzfboVar.zzs;
                    zzcexVarZza.zzae(zzfbtVar.zzb, zzfbtVar.zza, null);
                    zzcexVar = zzcexVarZza;
                } else {
                    zzcexVar2 = this.zzg;
                }
                zzcexVar.zzaq(true);
                if (this.zzi) {
                    zZze = this.zzh.zze(false);
                } else {
                    zZze = false;
                }
                com.google.android.gms.ads.internal.zzv.zzq();
                android.content.Context context2 = this.zza;
                z2 = this.zzi;
                boolean zZzJ = com.google.android.gms.ads.internal.util.zzs.zzJ(context2);
                if (z2) {
                    zZzd = this.zzh.zzd();
                } else {
                    zZzd = false;
                }
                if (this.zzi) {
                    fZza = this.zzh.zza();
                } else {
                    fZza = 0.0f;
                }
                float f = fZza;
                com.google.android.gms.internal.ads.zzfbo zzfboVar2 = this.zze;
                com.google.android.gms.ads.internal.zzl zzlVar = new com.google.android.gms.ads.internal.zzl(zZze, zZzJ, zZzd, f, -1, z, zzfboVar2.zzO, zzfboVar2.zzP);
                if (zzcwgVar != null) {
                    zzcwgVar.zzf();
                }
                com.google.android.gms.ads.internal.zzv.zzj();
                com.google.android.gms.internal.ads.zzdfr zzdfrVarZzh = zzdobVar.zzh();
                com.google.android.gms.internal.ads.zzfbo zzfboVar3 = this.zze;
                com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel = this.zzd;
                int i = zzfboVar3.zzQ;
                java.lang.String str = zzfboVar3.zzB;
                com.google.android.gms.internal.ads.zzfbt zzfbtVar2 = zzfboVar3.zzs;
                com.google.android.gms.ads.internal.overlay.zzn.zza(context, new com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel(null, zzdfrVarZzh, null, zzcexVar, i, versionInfoParcel, str, zzlVar, zzfbtVar2.zzb, zzfbtVar2.zza, this.zzc.zzf, zzcwgVar, zzfboVar3.zzb() ? this.zzj : null, zzcexVar.zzr()), true, this.zzl);
            }
            zzcexVar2 = this.zzg;
            zzcexVar = zzcexVar2;
            zzcexVar.zzaq(true);
            if (this.zzi) {
                zZze = this.zzh.zze(false);
            } else {
                zZze = false;
            }
            com.google.android.gms.ads.internal.zzv.zzq();
            android.content.Context context3 = this.zza;
            z2 = this.zzi;
            boolean zZzJ2 = com.google.android.gms.ads.internal.util.zzs.zzJ(context3);
            if (z2) {
                zZzd = this.zzh.zzd();
            } else {
                zZzd = false;
            }
            if (this.zzi) {
                fZza = this.zzh.zza();
            } else {
                fZza = 0.0f;
            }
            float f2 = fZza;
            com.google.android.gms.internal.ads.zzfbo zzfboVar4 = this.zze;
            com.google.android.gms.ads.internal.zzl zzlVar2 = new com.google.android.gms.ads.internal.zzl(zZze, zZzJ2, zZzd, f2, -1, z, zzfboVar4.zzO, zzfboVar4.zzP);
            if (zzcwgVar != null) {
                zzcwgVar.zzf();
            }
            com.google.android.gms.ads.internal.zzv.zzj();
            com.google.android.gms.internal.ads.zzdfr zzdfrVarZzh2 = zzdobVar.zzh();
            com.google.android.gms.internal.ads.zzfbo zzfboVar5 = this.zze;
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel2 = this.zzd;
            int i2 = zzfboVar5.zzQ;
            java.lang.String str2 = zzfboVar5.zzB;
            com.google.android.gms.internal.ads.zzfbt zzfbtVar3 = zzfboVar5.zzs;
            if (zzfboVar5.zzb()) {
            }
            com.google.android.gms.ads.internal.overlay.zzn.zza(context, new com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel(null, zzdfrVarZzh2, null, zzcexVar, i2, versionInfoParcel2, str2, zzlVar2, zzfbtVar3.zzb, zzfbtVar3.zza, this.zzc.zzf, zzcwgVar, zzfboVar5.zzb() ? this.zzj : null, zzcexVar.zzr()), true, this.zzl);
        } catch (com.google.android.gms.internal.ads.zzcfj e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
        }
    }
}
