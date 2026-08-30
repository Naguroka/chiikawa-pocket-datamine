package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdmh {
    private final com.google.android.gms.internal.ads.zzfcj zza;
    private final java.util.concurrent.Executor zzb;
    private final com.google.android.gms.internal.ads.zzdow zzc;
    private final com.google.android.gms.internal.ads.zzdnr zzd;
    private final android.content.Context zze;
    private final com.google.android.gms.internal.ads.zzdrw zzf;
    private final com.google.android.gms.internal.ads.zzfja zzg;
    private final com.google.android.gms.internal.ads.zzebk zzh;

    public zzdmh(com.google.android.gms.internal.ads.zzfcj zzfcjVar, java.util.concurrent.Executor executor, com.google.android.gms.internal.ads.zzdow zzdowVar, android.content.Context context, com.google.android.gms.internal.ads.zzdrw zzdrwVar, com.google.android.gms.internal.ads.zzfja zzfjaVar, com.google.android.gms.internal.ads.zzebk zzebkVar, com.google.android.gms.internal.ads.zzdnr zzdnrVar) {
        this.zza = zzfcjVar;
        this.zzb = executor;
        this.zzc = zzdowVar;
        this.zze = context;
        this.zzf = zzdrwVar;
        this.zzg = zzfjaVar;
        this.zzh = zzebkVar;
        this.zzd = zzdnrVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void zzh(com.google.android.gms.internal.ads.zzcex zzcexVar) {
        zzj(zzcexVar);
        zzcexVar.zzag("/video", com.google.android.gms.internal.ads.zzbjo.zzl);
        zzcexVar.zzag("/videoMeta", com.google.android.gms.internal.ads.zzbjo.zzm);
        zzcexVar.zzag("/precache", new com.google.android.gms.internal.ads.zzcdf());
        zzcexVar.zzag("/delayPageLoaded", com.google.android.gms.internal.ads.zzbjo.zzp);
        zzcexVar.zzag("/instrument", com.google.android.gms.internal.ads.zzbjo.zzn);
        zzcexVar.zzag("/log", com.google.android.gms.internal.ads.zzbjo.zzg);
        zzcexVar.zzag("/click", new com.google.android.gms.internal.ads.zzbin(null, 0 == true ? 1 : 0));
        if (this.zza.zzb != null) {
            zzcexVar.zzN().zzG(true);
            zzcexVar.zzag("/open", new com.google.android.gms.internal.ads.zzbkb(null, null, null, null, null));
        } else {
            zzcexVar.zzN().zzG(false);
        }
        if (com.google.android.gms.ads.internal.zzv.zzo().zzp(zzcexVar.getContext())) {
            java.util.Map map = new java.util.HashMap();
            if (zzcexVar.zzD() != null) {
                map = zzcexVar.zzD().zzaw;
            }
            zzcexVar.zzag("/logScionEvent", new com.google.android.gms.internal.ads.zzbjv(zzcexVar.getContext(), map));
        }
    }

    private final void zzi(com.google.android.gms.internal.ads.zzcex zzcexVar, com.google.android.gms.internal.ads.zzcaa zzcaaVar) {
        if (this.zza.zza != null && zzcexVar.zzq() != null) {
            zzcexVar.zzq().zzs(this.zza.zza);
        }
        zzcaaVar.zzb();
    }

    private static final void zzj(com.google.android.gms.internal.ads.zzcex zzcexVar) {
        zzcexVar.zzag("/videoClicked", com.google.android.gms.internal.ads.zzbjo.zzh);
        zzcexVar.zzN().zzI(true);
        zzcexVar.zzag("/getNativeAdViewSignals", com.google.android.gms.internal.ads.zzbjo.zzs);
        zzcexVar.zzag("/getNativeClickMeta", com.google.android.gms.internal.ads.zzbjo.zzt);
    }

    public final com.google.common.util.concurrent.ListenableFuture zza(final org.json.JSONObject jSONObject) {
        return com.google.android.gms.internal.ads.zzgch.zzn(com.google.android.gms.internal.ads.zzgch.zzn(com.google.android.gms.internal.ads.zzgch.zzh(null), new com.google.android.gms.internal.ads.zzgbo() { // from class: com.google.android.gms.internal.ads.zzdly
            @Override // com.google.android.gms.internal.ads.zzgbo
            public final com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                return this.zza.zze(obj);
            }
        }, this.zzb), new com.google.android.gms.internal.ads.zzgbo() { // from class: com.google.android.gms.internal.ads.zzdlx
            @Override // com.google.android.gms.internal.ads.zzgbo
            public final com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                return this.zza.zzc(jSONObject, (com.google.android.gms.internal.ads.zzcex) obj);
            }
        }, this.zzb);
    }

    public final com.google.common.util.concurrent.ListenableFuture zzb(final java.lang.String str, final java.lang.String str2, final com.google.android.gms.internal.ads.zzfbo zzfboVar, final com.google.android.gms.internal.ads.zzfbr zzfbrVar, final com.google.android.gms.ads.internal.client.zzs zzsVar) {
        return com.google.android.gms.internal.ads.zzgch.zzn(com.google.android.gms.internal.ads.zzgch.zzh(null), new com.google.android.gms.internal.ads.zzgbo() { // from class: com.google.android.gms.internal.ads.zzdlw
            @Override // com.google.android.gms.internal.ads.zzgbo
            public final com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                return this.zza.zzd(zzsVar, zzfboVar, zzfbrVar, str, str2, obj);
            }
        }, this.zzb);
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzc(org.json.JSONObject jSONObject, final com.google.android.gms.internal.ads.zzcex zzcexVar) throws java.lang.Exception {
        com.google.android.gms.internal.ads.zzblz zzblzVar = this.zza.zzb;
        final com.google.android.gms.internal.ads.zzcaa zzcaaVarZza = com.google.android.gms.internal.ads.zzcaa.zza(zzcexVar);
        if (zzblzVar != null) {
            zzcexVar.zzaj(com.google.android.gms.internal.ads.zzcgr.zzd());
        } else {
            zzcexVar.zzaj(com.google.android.gms.internal.ads.zzcgr.zze());
        }
        zzcexVar.zzN().zzC(new com.google.android.gms.internal.ads.zzcgn() { // from class: com.google.android.gms.internal.ads.zzdma
            @Override // com.google.android.gms.internal.ads.zzcgn
            public final void zza(boolean z, int i, java.lang.String str, java.lang.String str2) {
                this.zza.zzf(zzcexVar, zzcaaVarZza, z, i, str, str2);
            }
        });
        zzcexVar.zzl("google.afma.nativeAds.renderVideo", jSONObject);
        return zzcaaVarZza;
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzd(com.google.android.gms.ads.internal.client.zzs zzsVar, com.google.android.gms.internal.ads.zzfbo zzfboVar, com.google.android.gms.internal.ads.zzfbr zzfbrVar, java.lang.String str, java.lang.String str2, java.lang.Object obj) throws java.lang.Exception {
        final com.google.android.gms.internal.ads.zzcex zzcexVarZza = this.zzc.zza(zzsVar, zzfboVar, zzfbrVar);
        final com.google.android.gms.internal.ads.zzcaa zzcaaVarZza = com.google.android.gms.internal.ads.zzcaa.zza(zzcexVarZza);
        if (this.zza.zzb != null) {
            zzh(zzcexVarZza);
            zzcexVarZza.zzaj(com.google.android.gms.internal.ads.zzcgr.zzd());
        } else {
            com.google.android.gms.internal.ads.zzdno zzdnoVarZzb = this.zzd.zzb();
            zzcexVarZza.zzN().zzV(zzdnoVarZzb, zzdnoVarZzb, zzdnoVarZzb, zzdnoVarZzb, zzdnoVarZzb, false, null, new com.google.android.gms.ads.internal.zzb(this.zze, null, null), null, null, this.zzh, this.zzg, this.zzf, null, zzdnoVarZzb, null, null, null, null);
            zzj(zzcexVarZza);
        }
        zzcexVarZza.zzN().zzC(new com.google.android.gms.internal.ads.zzcgn() { // from class: com.google.android.gms.internal.ads.zzdmb
            @Override // com.google.android.gms.internal.ads.zzcgn
            public final void zza(boolean z, int i, java.lang.String str3, java.lang.String str4) {
                this.zza.zzg(zzcexVarZza, zzcaaVarZza, z, i, str3, str4);
            }
        });
        zzcexVarZza.zzae(str, str2, null);
        return zzcaaVarZza;
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zze(java.lang.Object obj) throws java.lang.Exception {
        com.google.android.gms.internal.ads.zzcex zzcexVarZza = this.zzc.zza(com.google.android.gms.ads.internal.client.zzs.zzc(), null, null);
        final com.google.android.gms.internal.ads.zzcaa zzcaaVarZza = com.google.android.gms.internal.ads.zzcaa.zza(zzcexVarZza);
        zzh(zzcexVarZza);
        zzcexVarZza.zzN().zzJ(new com.google.android.gms.internal.ads.zzcgo() { // from class: com.google.android.gms.internal.ads.zzdlz
            @Override // com.google.android.gms.internal.ads.zzcgo
            public final void zza() {
                zzcaaVarZza.zzb();
            }
        });
        zzcexVarZza.loadUrl((java.lang.String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzdR));
        return zzcaaVarZza;
    }

    final /* synthetic */ void zzf(com.google.android.gms.internal.ads.zzcex zzcexVar, com.google.android.gms.internal.ads.zzcaa zzcaaVar, boolean z, int i, java.lang.String str, java.lang.String str2) {
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzdZ)).booleanValue()) {
            zzi(zzcexVar, zzcaaVar);
            return;
        }
        if (z) {
            zzi(zzcexVar, zzcaaVar);
            return;
        }
        zzcaaVar.zzd(new com.google.android.gms.internal.ads.zzegu(1, "Native Video WebView failed to load. Error code: " + i + ", Description: " + str + ", Failing URL: " + str2));
    }

    final /* synthetic */ void zzg(com.google.android.gms.internal.ads.zzcex zzcexVar, com.google.android.gms.internal.ads.zzcaa zzcaaVar, boolean z, int i, java.lang.String str, java.lang.String str2) {
        if (z) {
            if (this.zza.zza != null && zzcexVar.zzq() != null) {
                zzcexVar.zzq().zzs(this.zza.zza);
            }
            zzcaaVar.zzb();
            return;
        }
        zzcaaVar.zzd(new com.google.android.gms.internal.ads.zzegu(1, "Html video Web View failed to load. Error code: " + i + ", Description: " + str + ", Failing URL: " + str2));
    }
}
