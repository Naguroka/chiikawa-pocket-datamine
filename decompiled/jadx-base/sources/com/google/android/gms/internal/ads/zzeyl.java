package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzeyl implements com.google.android.gms.internal.ads.zzezf {
    private final com.google.android.gms.internal.ads.zzezf zza;
    private final com.google.android.gms.internal.ads.zzezf zzb;
    private final com.google.android.gms.internal.ads.zzfes zzc;
    private final java.lang.String zzd;
    private com.google.android.gms.internal.ads.zzcuz zze;
    private final java.util.concurrent.Executor zzf;

    public zzeyl(com.google.android.gms.internal.ads.zzezf zzezfVar, com.google.android.gms.internal.ads.zzezf zzezfVar2, com.google.android.gms.internal.ads.zzfes zzfesVar, java.lang.String str, java.util.concurrent.Executor executor) {
        this.zza = zzezfVar;
        this.zzb = zzezfVar2;
        this.zzc = zzfesVar;
        this.zzd = str;
        this.zzf = executor;
    }

    private final com.google.common.util.concurrent.ListenableFuture zzg(com.google.android.gms.internal.ads.zzfef zzfefVar, com.google.android.gms.internal.ads.zzezg zzezgVar) {
        com.google.android.gms.internal.ads.zzcuz zzcuzVar = zzfefVar.zza;
        this.zze = zzcuzVar;
        if (zzfefVar.zzc != null) {
            if (zzcuzVar.zzf() != null) {
                zzfefVar.zzc.zzp().zzl(zzfefVar.zza.zzf());
            }
            return com.google.android.gms.internal.ads.zzgch.zzh(zzfefVar.zzc);
        }
        zzcuzVar.zzb().zzk(zzfefVar.zzb);
        return ((com.google.android.gms.internal.ads.zzeyv) this.zza).zzb(zzezgVar, null, zzfefVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzezf
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final synchronized com.google.android.gms.internal.ads.zzcuz zzd() {
        return this.zze;
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzb(com.google.android.gms.internal.ads.zzezg zzezgVar, com.google.android.gms.internal.ads.zzeyk zzeykVar, com.google.android.gms.internal.ads.zzeze zzezeVar, com.google.android.gms.internal.ads.zzcuz zzcuzVar, com.google.android.gms.internal.ads.zzeyq zzeyqVar) throws java.lang.Exception {
        if (zzeyqVar != null) {
            com.google.android.gms.internal.ads.zzeyk zzeykVar2 = new com.google.android.gms.internal.ads.zzeyk(zzeykVar.zza, zzeykVar.zzb, zzeykVar.zzc, zzeykVar.zzd, zzeykVar.zze, zzeykVar.zzf, zzeyqVar.zza);
            if (zzeyqVar.zzc != null) {
                this.zze = null;
                this.zzc.zze(zzeykVar2);
                return zzg(zzeyqVar.zzc, zzezgVar);
            }
            com.google.common.util.concurrent.ListenableFuture listenableFutureZza = this.zzc.zza(zzeykVar2);
            if (listenableFutureZza != null) {
                this.zze = null;
                return com.google.android.gms.internal.ads.zzgch.zzn(listenableFutureZza, new com.google.android.gms.internal.ads.zzgbo() { // from class: com.google.android.gms.internal.ads.zzeyh
                    @Override // com.google.android.gms.internal.ads.zzgbo
                    public final com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                        return this.zza.zze((com.google.android.gms.internal.ads.zzfep) obj);
                    }
                }, this.zzf);
            }
            this.zzc.zze(zzeykVar2);
            zzezgVar = new com.google.android.gms.internal.ads.zzezg(zzezgVar.zzb, zzeyqVar.zzb);
        }
        com.google.common.util.concurrent.ListenableFuture listenableFutureZzb = ((com.google.android.gms.internal.ads.zzeyv) this.zza).zzb(zzezgVar, zzezeVar, zzcuzVar);
        this.zze = zzcuzVar;
        return listenableFutureZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzezf
    public final /* bridge */ /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzc(com.google.android.gms.internal.ads.zzezg zzezgVar, com.google.android.gms.internal.ads.zzeze zzezeVar, java.lang.Object obj) {
        return zzf(zzezgVar, zzezeVar, null);
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zze(com.google.android.gms.internal.ads.zzfep zzfepVar) throws java.lang.Exception {
        com.google.android.gms.internal.ads.zzfer zzferVar;
        if (zzfepVar == null || zzfepVar.zza == null || (zzferVar = zzfepVar.zzb) == null) {
            throw new com.google.android.gms.internal.ads.zzdvy(1, "Empty prefetch");
        }
        com.google.android.gms.internal.ads.zzbbq.zzb.zzc zzcVarZzd = com.google.android.gms.internal.ads.zzbbq.zzb.zzd();
        com.google.android.gms.internal.ads.zzbbq.zzb.zza.C0180zza c0180zzaZza = com.google.android.gms.internal.ads.zzbbq.zzb.zza.zza();
        c0180zzaZza.zzf(com.google.android.gms.internal.ads.zzbbq.zzb.zzd.IN_MEMORY);
        c0180zzaZza.zzh(com.google.android.gms.internal.ads.zzbbq.zzb.zze.zzi());
        zzcVarZzd.zzd(c0180zzaZza);
        zzfepVar.zza.zza.zzb().zzc().zzm(zzcVarZzd.zzbr());
        return zzg(zzfepVar.zza, ((com.google.android.gms.internal.ads.zzeyk) zzferVar).zzb);
    }

    public final synchronized com.google.common.util.concurrent.ListenableFuture zzf(final com.google.android.gms.internal.ads.zzezg zzezgVar, final com.google.android.gms.internal.ads.zzeze zzezeVar, com.google.android.gms.internal.ads.zzcuz zzcuzVar) {
        com.google.android.gms.internal.ads.zzcuy zzcuyVarZza = zzezeVar.zza(zzezgVar.zzb);
        zzcuyVarZza.zza(new com.google.android.gms.internal.ads.zzeym(this.zzd));
        final com.google.android.gms.internal.ads.zzcuz zzcuzVar2 = (com.google.android.gms.internal.ads.zzcuz) zzcuyVarZza.zzh();
        zzcuzVar2.zzg();
        zzcuzVar2.zzg();
        com.google.android.gms.ads.internal.client.zzm zzmVar = zzcuzVar2.zzg().zzd;
        if (zzmVar.zzs == null && zzmVar.zzx == null) {
            com.google.android.gms.internal.ads.zzfcj zzfcjVarZzg = zzcuzVar2.zzg();
            final com.google.android.gms.internal.ads.zzeyk zzeykVar = new com.google.android.gms.internal.ads.zzeyk(zzezeVar, zzezgVar, zzfcjVarZzg.zzd, zzfcjVarZzg.zzf, this.zzf, zzfcjVarZzg.zzj, null);
            return (com.google.android.gms.internal.ads.zzgby) com.google.android.gms.internal.ads.zzgch.zzn(com.google.android.gms.internal.ads.zzgby.zzu(((com.google.android.gms.internal.ads.zzeyr) this.zzb).zzb(zzezgVar, zzezeVar, zzcuzVar2)), new com.google.android.gms.internal.ads.zzgbo() { // from class: com.google.android.gms.internal.ads.zzeyi
                @Override // com.google.android.gms.internal.ads.zzgbo
                public final com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                    return this.zza.zzb(zzezgVar, zzeykVar, zzezeVar, zzcuzVar2, (com.google.android.gms.internal.ads.zzeyq) obj);
                }
            }, this.zzf);
        }
        this.zze = zzcuzVar2;
        return ((com.google.android.gms.internal.ads.zzeyv) this.zza).zzb(zzezgVar, zzezeVar, zzcuzVar2);
    }
}
