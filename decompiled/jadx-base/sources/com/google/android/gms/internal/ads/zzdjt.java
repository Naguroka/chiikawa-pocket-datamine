package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdjt {
    private final com.google.android.gms.internal.ads.zzdow zza;
    private final com.google.android.gms.internal.ads.zzdnl zzb;
    private final com.google.android.gms.internal.ads.zzcnr zzc;
    private final com.google.android.gms.internal.ads.zzdin zzd;

    public zzdjt(com.google.android.gms.internal.ads.zzdow zzdowVar, com.google.android.gms.internal.ads.zzdnl zzdnlVar, com.google.android.gms.internal.ads.zzcnr zzcnrVar, com.google.android.gms.internal.ads.zzdin zzdinVar) {
        this.zza = zzdowVar;
        this.zzb = zzdnlVar;
        this.zzc = zzcnrVar;
        this.zzd = zzdinVar;
    }

    public final android.view.View zza() throws com.google.android.gms.internal.ads.zzcfj {
        com.google.android.gms.internal.ads.zzcex zzcexVarZza = this.zza.zza(com.google.android.gms.ads.internal.client.zzs.zzc(), null, null);
        zzcexVarZza.zzF().setVisibility(8);
        zzcexVarZza.zzag("/sendMessageToSdk", new com.google.android.gms.internal.ads.zzbjp() { // from class: com.google.android.gms.internal.ads.zzdjn
            @Override // com.google.android.gms.internal.ads.zzbjp
            public final void zza(java.lang.Object obj, java.util.Map map) {
                this.zza.zzb((com.google.android.gms.internal.ads.zzcex) obj, map);
            }
        });
        zzcexVarZza.zzag("/adMuted", new com.google.android.gms.internal.ads.zzbjp() { // from class: com.google.android.gms.internal.ads.zzdjo
            @Override // com.google.android.gms.internal.ads.zzbjp
            public final void zza(java.lang.Object obj, java.util.Map map) {
                this.zza.zzc((com.google.android.gms.internal.ads.zzcex) obj, map);
            }
        });
        this.zzb.zzm(new java.lang.ref.WeakReference(zzcexVarZza), "/loadHtml", new com.google.android.gms.internal.ads.zzbjp() { // from class: com.google.android.gms.internal.ads.zzdjp
            @Override // com.google.android.gms.internal.ads.zzbjp
            public final void zza(java.lang.Object obj, final java.util.Map map) {
                com.google.android.gms.internal.ads.zzcex zzcexVar = (com.google.android.gms.internal.ads.zzcex) obj;
                com.google.android.gms.internal.ads.zzcgp zzcgpVarZzN = zzcexVar.zzN();
                final com.google.android.gms.internal.ads.zzdjt zzdjtVar = this.zza;
                zzcgpVarZzN.zzC(new com.google.android.gms.internal.ads.zzcgn() { // from class: com.google.android.gms.internal.ads.zzdjs
                    @Override // com.google.android.gms.internal.ads.zzcgn
                    public final void zza(boolean z, int i, java.lang.String str, java.lang.String str2) {
                        zzdjtVar.zzd(map, z, i, str, str2);
                    }
                });
                java.lang.String str = (java.lang.String) map.get("overlayHtml");
                java.lang.String str2 = (java.lang.String) map.get("baseUrl");
                if (android.text.TextUtils.isEmpty(str2)) {
                    zzcexVar.loadData(str, "text/html", com.adjust.sdk.Constants.ENCODING);
                } else {
                    zzcexVar.loadDataWithBaseURL(str2, str, "text/html", com.adjust.sdk.Constants.ENCODING, null);
                }
            }
        });
        this.zzb.zzm(new java.lang.ref.WeakReference(zzcexVarZza), "/showOverlay", new com.google.android.gms.internal.ads.zzbjp() { // from class: com.google.android.gms.internal.ads.zzdjq
            @Override // com.google.android.gms.internal.ads.zzbjp
            public final void zza(java.lang.Object obj, java.util.Map map) {
                this.zza.zze((com.google.android.gms.internal.ads.zzcex) obj, map);
            }
        });
        this.zzb.zzm(new java.lang.ref.WeakReference(zzcexVarZza), "/hideOverlay", new com.google.android.gms.internal.ads.zzbjp() { // from class: com.google.android.gms.internal.ads.zzdjr
            @Override // com.google.android.gms.internal.ads.zzbjp
            public final void zza(java.lang.Object obj, java.util.Map map) {
                this.zza.zzf((com.google.android.gms.internal.ads.zzcex) obj, map);
            }
        });
        return zzcexVarZza.zzF();
    }

    final /* synthetic */ void zzb(com.google.android.gms.internal.ads.zzcex zzcexVar, java.util.Map map) {
        this.zzb.zzj("sendMessageToNativeJs", map);
    }

    final /* synthetic */ void zzc(com.google.android.gms.internal.ads.zzcex zzcexVar, java.util.Map map) {
        this.zzd.zzh();
    }

    final /* synthetic */ void zzd(java.util.Map map, boolean z, int i, java.lang.String str, java.lang.String str2) {
        java.util.HashMap map2 = new java.util.HashMap();
        map2.put("messageType", "htmlLoaded");
        map2.put("id", (java.lang.String) map.get("id"));
        this.zzb.zzj("sendMessageToNativeJs", map2);
    }

    final /* synthetic */ void zze(com.google.android.gms.internal.ads.zzcex zzcexVar, java.util.Map map) {
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Showing native ads overlay.");
        zzcexVar.zzF().setVisibility(0);
        this.zzc.zze(true);
    }

    final /* synthetic */ void zzf(com.google.android.gms.internal.ads.zzcex zzcexVar, java.util.Map map) {
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Hiding native ads overlay.");
        zzcexVar.zzF().setVisibility(8);
        this.zzc.zze(false);
    }
}
