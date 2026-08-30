package com.google.android.gms.ads.internal.overlay;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzz {
    private com.google.android.gms.internal.ads.zzftb zzf;
    private com.google.android.gms.internal.ads.zzcex zzc = null;
    private boolean zze = false;
    private java.lang.String zza = null;
    private com.google.android.gms.internal.ads.zzfse zzd = null;
    private java.lang.String zzb = null;

    private final com.google.android.gms.internal.ads.zzftd zzl() {
        com.google.android.gms.internal.ads.zzftc zzftcVarZzc = com.google.android.gms.internal.ads.zzftd.zzc();
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzlq)).booleanValue() || android.text.TextUtils.isEmpty(this.zzb)) {
            java.lang.String str = this.zza;
            if (str != null) {
                zzftcVarZzc.zzb(str);
            } else {
                zzf("Missing session token and/or appId", "onLMDupdate");
            }
        } else {
            zzftcVarZzc.zza(this.zzb);
        }
        return zzftcVarZzc.zzc();
    }

    private final void zzm() {
        if (this.zzf == null) {
            this.zzf = new com.google.android.gms.ads.internal.overlay.zzy(this);
        }
    }

    public final synchronized void zza(com.google.android.gms.internal.ads.zzcex zzcexVar, android.content.Context context) {
        this.zzc = zzcexVar;
        if (!zzk(context)) {
            zzf("Unable to bind", "on_play_store_bind");
            return;
        }
        java.util.HashMap map = new java.util.HashMap();
        map.put("action", "fetch_completed");
        zze("on_play_store_bind", map);
    }

    public final void zzb() {
        com.google.android.gms.internal.ads.zzfse zzfseVar;
        if (!this.zze || (zzfseVar = this.zzd) == null) {
            com.google.android.gms.ads.internal.util.zze.zza("LastMileDelivery not connected");
        } else {
            zzfseVar.zza(zzl(), this.zzf);
            zzd("onLMDOverlayCollapse");
        }
    }

    public final void zzc() {
        com.google.android.gms.internal.ads.zzfse zzfseVar;
        if (!this.zze || (zzfseVar = this.zzd) == null) {
            com.google.android.gms.ads.internal.util.zze.zza("LastMileDelivery not connected");
            return;
        }
        com.google.android.gms.internal.ads.zzfsc zzfscVarZzc = com.google.android.gms.internal.ads.zzfsd.zzc();
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzlq)).booleanValue() || android.text.TextUtils.isEmpty(this.zzb)) {
            java.lang.String str = this.zza;
            if (str != null) {
                zzfscVarZzc.zzb(str);
            } else {
                zzf("Missing session token and/or appId", "onLMDupdate");
            }
        } else {
            zzfscVarZzc.zza(this.zzb);
        }
        zzfseVar.zzb(zzfscVarZzc.zzc(), this.zzf);
    }

    final void zzd(java.lang.String str) {
        zze(str, new java.util.HashMap());
    }

    final void zze(final java.lang.String str, final java.util.Map map) {
        com.google.android.gms.internal.ads.zzbzw.zzf.execute(new java.lang.Runnable() { // from class: com.google.android.gms.ads.internal.overlay.zzx
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzh(str, map);
            }
        });
    }

    final void zzf(java.lang.String str, java.lang.String str2) {
        com.google.android.gms.ads.internal.util.zze.zza(str);
        if (this.zzc != null) {
            java.util.HashMap map = new java.util.HashMap();
            map.put(com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE, str);
            map.put("action", str2);
            zze("onError", map);
        }
    }

    public final void zzg() {
        com.google.android.gms.internal.ads.zzfse zzfseVar;
        if (!this.zze || (zzfseVar = this.zzd) == null) {
            com.google.android.gms.ads.internal.util.zze.zza("LastMileDelivery not connected");
        } else {
            zzfseVar.zzc(zzl(), this.zzf);
            zzd("onLMDOverlayExpand");
        }
    }

    final /* synthetic */ void zzh(java.lang.String str, java.util.Map map) {
        com.google.android.gms.internal.ads.zzcex zzcexVar = this.zzc;
        if (zzcexVar != null) {
            zzcexVar.zzd(str, map);
        }
    }

    final void zzi(com.google.android.gms.internal.ads.zzfta zzftaVar) {
        if (!android.text.TextUtils.isEmpty(zzftaVar.zzb())) {
            if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzlq)).booleanValue()) {
                this.zza = zzftaVar.zzb();
            }
        }
        switch (zzftaVar.zza()) {
            case 8152:
                zzd("onLMDOverlayOpened");
                break;
            case 8153:
                zzd("onLMDOverlayClicked");
                break;
            case 8155:
                zzd("onLMDOverlayClose");
                break;
            case 8157:
                this.zza = null;
                this.zzb = null;
                this.zze = false;
                break;
            case 8160:
            case 8161:
            case 8162:
                java.util.HashMap map = new java.util.HashMap();
                map.put("error", java.lang.String.valueOf(zzftaVar.zza()));
                zze("onLMDOverlayFailedToOpen", map);
                break;
        }
    }

    public final void zzj(com.google.android.gms.internal.ads.zzcex zzcexVar, com.google.android.gms.internal.ads.zzfsy zzfsyVar) {
        if (zzcexVar == null) {
            zzf("adWebview missing", "onLMDShow");
            return;
        }
        this.zzc = zzcexVar;
        if (!this.zze && !zzk(zzcexVar.getContext())) {
            zzf("LMDOverlay not bound", "on_play_store_bind");
            return;
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzlq)).booleanValue()) {
            this.zzb = zzfsyVar.zzh();
        }
        zzm();
        com.google.android.gms.internal.ads.zzfse zzfseVar = this.zzd;
        if (zzfseVar != null) {
            zzfseVar.zzd(zzfsyVar, this.zzf);
        }
    }

    public final synchronized boolean zzk(android.content.Context context) {
        if (!com.google.android.gms.internal.ads.zzftq.zza(context)) {
            return false;
        }
        try {
            this.zzd = com.google.android.gms.internal.ads.zzfsf.zza(context);
        } catch (java.lang.NullPointerException e) {
            com.google.android.gms.ads.internal.util.zze.zza("Error connecting LMD Overlay service");
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "LastMileDeliveryOverlay.bindLastMileDeliveryService");
        }
        if (this.zzd == null) {
            this.zze = false;
            return false;
        }
        zzm();
        this.zze = true;
        return true;
    }
}
