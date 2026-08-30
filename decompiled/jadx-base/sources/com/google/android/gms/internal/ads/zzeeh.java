package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzeeh implements com.google.android.gms.internal.ads.zzedc {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzcpq zzb;
    private android.view.View zzc;
    private com.google.android.gms.internal.ads.zzbpn zzd;

    public zzeeh(android.content.Context context, com.google.android.gms.internal.ads.zzcpq zzcpqVar) {
        this.zza = context;
        this.zzb = zzcpqVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzedc
    public final /* bridge */ /* synthetic */ java.lang.Object zza(com.google.android.gms.internal.ads.zzfca zzfcaVar, final com.google.android.gms.internal.ads.zzfbo zzfboVar, final com.google.android.gms.internal.ads.zzecz zzeczVar) throws com.google.android.gms.internal.ads.zzfcq, com.google.android.gms.internal.ads.zzegu {
        final android.view.View view;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzhJ)).booleanValue() && zzfboVar.zzag) {
            try {
                view = (android.view.View) com.google.android.gms.dynamic.ObjectWrapper.unwrap(this.zzd.zze());
                boolean zZzf = this.zzd.zzf();
                if (view == null) {
                    throw new com.google.android.gms.internal.ads.zzfcq(new java.lang.Exception("BannerRtbAdapterWrapper interscrollerView should not be null"));
                }
                if (zZzf) {
                    try {
                        view = (android.view.View) com.google.android.gms.internal.ads.zzgch.zzn(com.google.android.gms.internal.ads.zzgch.zzh(null), new com.google.android.gms.internal.ads.zzgbo() { // from class: com.google.android.gms.internal.ads.zzeee
                            @Override // com.google.android.gms.internal.ads.zzgbo
                            public final com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                                return this.zza.zzc(view, zzfboVar, obj);
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
            view = this.zzc;
        }
        com.google.android.gms.internal.ads.zzcon zzconVarZza = this.zzb.zza(new com.google.android.gms.internal.ads.zzcrp(zzfcaVar, zzfboVar, zzeczVar.zza), new com.google.android.gms.internal.ads.zzcot(view, null, new com.google.android.gms.internal.ads.zzcqx() { // from class: com.google.android.gms.internal.ads.zzeed
            @Override // com.google.android.gms.internal.ads.zzcqx
            public final com.google.android.gms.ads.internal.client.zzeb zza() throws com.google.android.gms.internal.ads.zzfcq {
                try {
                    return ((com.google.android.gms.internal.ads.zzbrd) zzeczVar.zzb).zze();
                } catch (android.os.RemoteException e3) {
                    throw new com.google.android.gms.internal.ads.zzfcq(e3);
                }
            }
        }, (com.google.android.gms.internal.ads.zzfbp) zzfboVar.zzu.get(0)));
        zzconVarZza.zzg().zza(view);
        ((com.google.android.gms.internal.ads.zzees) zzeczVar.zzc).zzc(zzconVarZza.zzj());
        return zzconVarZza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzedc
    public final void zzb(com.google.android.gms.internal.ads.zzfca zzfcaVar, com.google.android.gms.internal.ads.zzfbo zzfboVar, com.google.android.gms.internal.ads.zzecz zzeczVar) throws com.google.android.gms.internal.ads.zzfcq {
        try {
            ((com.google.android.gms.internal.ads.zzbrd) zzeczVar.zzb).zzq(zzfboVar.zzZ);
            com.google.android.gms.internal.ads.zzeeg zzeegVar = null;
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzhJ)).booleanValue() && zzfboVar.zzag) {
                ((com.google.android.gms.internal.ads.zzbrd) zzeczVar.zzb).zzk(zzfboVar.zzU, zzfboVar.zzv.toString(), zzfcaVar.zza.zza.zzd, com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zza), new com.google.android.gms.internal.ads.zzeef(this, zzeczVar, zzeegVar), (com.google.android.gms.internal.ads.zzbpk) zzeczVar.zzc, zzfcaVar.zza.zza.zze);
            } else {
                ((com.google.android.gms.internal.ads.zzbrd) zzeczVar.zzb).zzj(zzfboVar.zzU, zzfboVar.zzv.toString(), zzfcaVar.zza.zza.zzd, com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zza), new com.google.android.gms.internal.ads.zzeef(this, zzeczVar, zzeegVar), (com.google.android.gms.internal.ads.zzbpk) zzeczVar.zzc, zzfcaVar.zza.zza.zze);
            }
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.internal.ads.zzfcq(e);
        }
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzc(android.view.View view, com.google.android.gms.internal.ads.zzfbo zzfboVar, java.lang.Object obj) throws java.lang.Exception {
        return com.google.android.gms.internal.ads.zzgch.zzh(com.google.android.gms.internal.ads.zzcql.zza(this.zza, view, zzfboVar));
    }
}
