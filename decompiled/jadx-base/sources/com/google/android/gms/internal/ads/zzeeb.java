package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzeeb implements com.google.android.gms.internal.ads.zzedc {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzcpq zzb;
    private final java.util.concurrent.Executor zzc;

    public zzeeb(android.content.Context context, com.google.android.gms.internal.ads.zzcpq zzcpqVar, java.util.concurrent.Executor executor) {
        this.zza = context;
        this.zzb = zzcpqVar;
        this.zzc = executor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzedc
    public final /* bridge */ /* synthetic */ java.lang.Object zza(com.google.android.gms.internal.ads.zzfca zzfcaVar, final com.google.android.gms.internal.ads.zzfbo zzfboVar, com.google.android.gms.internal.ads.zzecz zzeczVar) throws com.google.android.gms.internal.ads.zzfcq, com.google.android.gms.internal.ads.zzegu {
        final android.view.View viewZza;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzhJ)).booleanValue() && zzfboVar.zzag) {
            com.google.android.gms.internal.ads.zzbpn zzbpnVarZzc = ((com.google.android.gms.internal.ads.zzfdh) zzeczVar.zzb).zzc();
            if (zzbpnVarZzc == null) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad.");
                throw new com.google.android.gms.internal.ads.zzfcq(new java.lang.Exception("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad."));
            }
            try {
                viewZza = (android.view.View) com.google.android.gms.dynamic.ObjectWrapper.unwrap(zzbpnVarZzc.zze());
                boolean zZzf = zzbpnVarZzc.zzf();
                if (viewZza == null) {
                    throw new com.google.android.gms.internal.ads.zzfcq(new java.lang.Exception("BannerAdapterWrapper interscrollerView should not be null"));
                }
                if (zZzf) {
                    try {
                        viewZza = (android.view.View) com.google.android.gms.internal.ads.zzgch.zzn(com.google.android.gms.internal.ads.zzgch.zzh(null), new com.google.android.gms.internal.ads.zzgbo() { // from class: com.google.android.gms.internal.ads.zzedz
                            @Override // com.google.android.gms.internal.ads.zzgbo
                            public final com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                                return this.zza.zzc(viewZza, zzfboVar, obj);
                            }
                        }, com.google.android.gms.internal.ads.zzbzw.zzf).get();
                    } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e) {
                        throw new com.google.android.gms.internal.ads.zzfcq(e);
                    }
                }
            } catch (android.os.RemoteException e2) {
                throw new com.google.android.gms.internal.ads.zzfcq(e2);
            }
        } else {
            viewZza = ((com.google.android.gms.internal.ads.zzfdh) zzeczVar.zzb).zza();
        }
        com.google.android.gms.internal.ads.zzcpq zzcpqVar = this.zzb;
        com.google.android.gms.internal.ads.zzcrp zzcrpVar = new com.google.android.gms.internal.ads.zzcrp(zzfcaVar, zzfboVar, zzeczVar.zza);
        final com.google.android.gms.internal.ads.zzfdh zzfdhVar = (com.google.android.gms.internal.ads.zzfdh) zzeczVar.zzb;
        java.util.Objects.requireNonNull(zzfdhVar);
        com.google.android.gms.internal.ads.zzcon zzconVarZza = zzcpqVar.zza(zzcrpVar, new com.google.android.gms.internal.ads.zzcot(viewZza, null, new com.google.android.gms.internal.ads.zzcqx() { // from class: com.google.android.gms.internal.ads.zzeea
            @Override // com.google.android.gms.internal.ads.zzcqx
            public final com.google.android.gms.ads.internal.client.zzeb zza() {
                return zzfdhVar.zzb();
            }
        }, (com.google.android.gms.internal.ads.zzfbp) zzfboVar.zzu.get(0)));
        zzconVarZza.zzg().zza(viewZza);
        zzconVarZza.zzd().zzo(new com.google.android.gms.internal.ads.zzcma((com.google.android.gms.internal.ads.zzfdh) zzeczVar.zzb), this.zzc);
        ((com.google.android.gms.internal.ads.zzees) zzeczVar.zzc).zzc(zzconVarZza.zzk());
        return zzconVarZza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzedc
    public final void zzb(com.google.android.gms.internal.ads.zzfca zzfcaVar, com.google.android.gms.internal.ads.zzfbo zzfboVar, com.google.android.gms.internal.ads.zzecz zzeczVar) throws com.google.android.gms.internal.ads.zzfcq {
        com.google.android.gms.ads.internal.client.zzs zzsVar;
        com.google.android.gms.ads.internal.client.zzs zzsVar2 = zzfcaVar.zza.zza.zze;
        if (zzsVar2.zzn) {
            zzsVar = new com.google.android.gms.ads.internal.client.zzs(this.zza, com.google.android.gms.ads.zzc.zzd(zzsVar2.zze, zzsVar2.zzb));
        } else {
            zzsVar = (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzhJ)).booleanValue() && zzfboVar.zzag) ? new com.google.android.gms.ads.internal.client.zzs(this.zza, com.google.android.gms.ads.zzc.zze(zzsVar2.zze, zzsVar2.zzb)) : com.google.android.gms.internal.ads.zzfcp.zza(this.zza, zzfboVar.zzu);
        }
        com.google.android.gms.ads.internal.client.zzs zzsVar3 = zzsVar;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzhJ)).booleanValue() && zzfboVar.zzag) {
            java.lang.Object obj = zzeczVar.zzb;
            ((com.google.android.gms.internal.ads.zzfdh) obj).zzn(this.zza, zzsVar3, zzfcaVar.zza.zza.zzd, zzfboVar.zzv.toString(), com.google.android.gms.ads.internal.util.zzbs.zzm(zzfboVar.zzs), (com.google.android.gms.internal.ads.zzbpk) zzeczVar.zzc);
            return;
        }
        java.lang.Object obj2 = zzeczVar.zzb;
        ((com.google.android.gms.internal.ads.zzfdh) obj2).zzm(this.zza, zzsVar3, zzfcaVar.zza.zza.zzd, zzfboVar.zzv.toString(), com.google.android.gms.ads.internal.util.zzbs.zzm(zzfboVar.zzs), (com.google.android.gms.internal.ads.zzbpk) zzeczVar.zzc);
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzc(android.view.View view, com.google.android.gms.internal.ads.zzfbo zzfboVar, java.lang.Object obj) throws java.lang.Exception {
        return com.google.android.gms.internal.ads.zzgch.zzh(com.google.android.gms.internal.ads.zzcql.zza(this.zza, view, zzfboVar));
    }
}
