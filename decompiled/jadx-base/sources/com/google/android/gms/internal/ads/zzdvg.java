package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdvg implements com.google.android.gms.ads.internal.overlay.zzr, com.google.android.gms.internal.ads.zzcgn {
    private final android.content.Context zza;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzb;
    private com.google.android.gms.internal.ads.zzduv zzc;
    private com.google.android.gms.internal.ads.zzcex zzd;
    private boolean zze;
    private boolean zzf;
    private long zzg;
    private com.google.android.gms.ads.internal.client.zzdl zzh;
    private boolean zzi;

    zzdvg(android.content.Context context, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel) {
        this.zza = context;
        this.zzb = versionInfoParcel;
    }

    private final synchronized boolean zzl(com.google.android.gms.ads.internal.client.zzdl zzdlVar) {
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zziN)).booleanValue()) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Ad inspector had an internal error.");
            try {
                zzdlVar.zze(com.google.android.gms.internal.ads.zzfdk.zzd(16, null, null));
            } catch (android.os.RemoteException unused) {
            }
            return false;
        }
        if (this.zzc == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Ad inspector had an internal error.");
            try {
                com.google.android.gms.ads.internal.zzv.zzp().zzw(new java.lang.NullPointerException("InspectorManager null"), "InspectorUi.shouldOpenUi");
                zzdlVar.zze(com.google.android.gms.internal.ads.zzfdk.zzd(16, null, null));
            } catch (android.os.RemoteException unused2) {
            }
            return false;
        }
        if (!this.zze && !this.zzf) {
            if (com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis() >= this.zzg + ((long) ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zziQ)).intValue())) {
                return true;
            }
        }
        com.google.android.gms.ads.internal.util.client.zzo.zzj("Ad inspector cannot be opened because it is already open.");
        try {
            zzdlVar.zze(com.google.android.gms.internal.ads.zzfdk.zzd(19, null, null));
        } catch (android.os.RemoteException unused3) {
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcgn
    public final synchronized void zza(boolean z, int i, java.lang.String str, java.lang.String str2) {
        if (z) {
            com.google.android.gms.ads.internal.util.zze.zza("Ad inspector loaded.");
            this.zze = true;
            zzk("");
            return;
        }
        com.google.android.gms.ads.internal.util.client.zzo.zzj("Ad inspector failed to load.");
        try {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(new java.lang.Exception("Failed to load UI. Error code: " + i + ", Description: " + str + ", Failing URL: " + str2), "InspectorUi.onAdWebViewFinishedLoading 0");
            com.google.android.gms.ads.internal.client.zzdl zzdlVar = this.zzh;
            if (zzdlVar != null) {
                zzdlVar.zze(com.google.android.gms.internal.ads.zzfdk.zzd(17, null, null));
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "InspectorUi.onAdWebViewFinishedLoading 1");
        }
        this.zzi = true;
        this.zzd.destroy();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdE() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdi() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdo() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzdp() {
        this.zzf = true;
        zzk("");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdr() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzds(int i) {
        this.zzd.destroy();
        if (!this.zzi) {
            com.google.android.gms.ads.internal.util.zze.zza("Inspector closed.");
            com.google.android.gms.ads.internal.client.zzdl zzdlVar = this.zzh;
            if (zzdlVar != null) {
                try {
                    zzdlVar.zze(null);
                } catch (android.os.RemoteException unused) {
                }
            }
        }
        this.zzf = false;
        this.zze = false;
        this.zzg = 0L;
        this.zzi = false;
        this.zzh = null;
    }

    public final android.app.Activity zzg() {
        com.google.android.gms.internal.ads.zzcex zzcexVar = this.zzd;
        if (zzcexVar == null || zzcexVar.zzaE()) {
            return null;
        }
        return this.zzd.zzi();
    }

    public final void zzh(com.google.android.gms.internal.ads.zzduv zzduvVar) {
        this.zzc = zzduvVar;
    }

    final /* synthetic */ void zzi(java.lang.String str) {
        org.json.JSONObject jSONObjectZze = this.zzc.zze();
        if (!android.text.TextUtils.isEmpty(str)) {
            try {
                jSONObjectZze.put("redirectUrl", str);
            } catch (org.json.JSONException unused) {
            }
        }
        this.zzd.zzb("window.inspectorInfo", jSONObjectZze.toString());
    }

    public final synchronized void zzj(com.google.android.gms.ads.internal.client.zzdl zzdlVar, com.google.android.gms.internal.ads.zzbkj zzbkjVar, com.google.android.gms.internal.ads.zzbkc zzbkcVar, com.google.android.gms.internal.ads.zzbjq zzbjqVar) {
        if (zzl(zzdlVar)) {
            try {
                com.google.android.gms.ads.internal.zzv.zzA();
                com.google.android.gms.internal.ads.zzcex zzcexVarZza = com.google.android.gms.internal.ads.zzcfk.zza(this.zza, com.google.android.gms.internal.ads.zzcgr.zza(), "", false, false, null, null, this.zzb, null, null, null, com.google.android.gms.internal.ads.zzbbj.zza(), null, null, null, null);
                this.zzd = zzcexVarZza;
                com.google.android.gms.internal.ads.zzcgp zzcgpVarZzN = zzcexVarZza.zzN();
                if (zzcgpVarZzN == null) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to obtain a web view for the ad inspector");
                    try {
                        com.google.android.gms.ads.internal.zzv.zzp().zzw(new java.lang.NullPointerException("Failed to obtain a web view for the ad inspector"), "InspectorUi.openInspector 2");
                        zzdlVar.zze(com.google.android.gms.internal.ads.zzfdk.zzd(17, "Failed to obtain a web view for the ad inspector", null));
                        return;
                    } catch (android.os.RemoteException e) {
                        com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "InspectorUi.openInspector 3");
                        return;
                    }
                }
                this.zzh = zzdlVar;
                zzcgpVarZzN.zzV(null, null, null, null, null, false, null, null, null, null, null, null, null, zzbkjVar, null, new com.google.android.gms.internal.ads.zzbki(this.zza), zzbkcVar, zzbjqVar, null);
                zzcgpVarZzN.zzC(this);
                this.zzd.loadUrl((java.lang.String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zziO));
                com.google.android.gms.ads.internal.zzv.zzj();
                com.google.android.gms.ads.internal.overlay.zzn.zza(this.zza, new com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel(this, this.zzd, 1, this.zzb), true, null);
                this.zzg = com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis();
            } catch (com.google.android.gms.internal.ads.zzcfj e2) {
                com.google.android.gms.ads.internal.util.client.zzo.zzk("Failed to obtain a web view for the ad inspector", e2);
                try {
                    com.google.android.gms.ads.internal.zzv.zzp().zzw(e2, "InspectorUi.openInspector 0");
                    zzdlVar.zze(com.google.android.gms.internal.ads.zzfdk.zzd(17, "Failed to obtain a web view for the ad inspector", null));
                } catch (android.os.RemoteException e3) {
                    com.google.android.gms.ads.internal.zzv.zzp().zzw(e3, "InspectorUi.openInspector 1");
                }
            }
        }
    }

    public final synchronized void zzk(final java.lang.String str) {
        if (this.zze && this.zzf) {
            com.google.android.gms.internal.ads.zzbzw.zzf.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzdvf
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzi(str);
                }
            });
        }
    }
}
