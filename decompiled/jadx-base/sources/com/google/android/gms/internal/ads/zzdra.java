package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdra implements com.google.android.gms.internal.ads.zzdan, com.google.android.gms.ads.internal.client.zza, com.google.android.gms.internal.ads.zzcwn, com.google.android.gms.internal.ads.zzcvx {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzfdb zzb;
    private final com.google.android.gms.internal.ads.zzdrw zzc;
    private final com.google.android.gms.internal.ads.zzfca zzd;
    private final com.google.android.gms.internal.ads.zzfbo zze;
    private final com.google.android.gms.internal.ads.zzebk zzf;
    private final java.lang.String zzg;
    private java.lang.Boolean zzh;
    private final boolean zzi = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzgF)).booleanValue();

    public zzdra(android.content.Context context, com.google.android.gms.internal.ads.zzfdb zzfdbVar, com.google.android.gms.internal.ads.zzdrw zzdrwVar, com.google.android.gms.internal.ads.zzfca zzfcaVar, com.google.android.gms.internal.ads.zzfbo zzfboVar, com.google.android.gms.internal.ads.zzebk zzebkVar, java.lang.String str) {
        this.zza = context;
        this.zzb = zzfdbVar;
        this.zzc = zzdrwVar;
        this.zzd = zzfcaVar;
        this.zze = zzfboVar;
        this.zzf = zzebkVar;
        this.zzg = str;
    }

    private final com.google.android.gms.internal.ads.zzdrv zzd(java.lang.String str) {
        com.google.android.gms.internal.ads.zzfbz zzfbzVar = this.zzd.zzb;
        com.google.android.gms.internal.ads.zzdrv zzdrvVarZza = this.zzc.zza();
        zzdrvVarZza.zzd(zzfbzVar.zzb);
        zzdrvVarZza.zzc(this.zze);
        zzdrvVarZza.zzb("action", str);
        zzdrvVarZza.zzb(com.google.firebase.analytics.FirebaseAnalytics.Param.AD_FORMAT, this.zzg.toUpperCase(java.util.Locale.ROOT));
        if (!this.zze.zzt.isEmpty()) {
            zzdrvVarZza.zzb("ancn", (java.lang.String) this.zze.zzt.get(0));
        }
        if (this.zze.zzb()) {
            zzdrvVarZza.zzb("device_connectivity", true != com.google.android.gms.ads.internal.zzv.zzp().zzA(this.zza) ? "offline" : androidx.browser.customtabs.CustomTabsCallback.ONLINE_EXTRAS_KEY);
            zzdrvVarZza.zzb("event_timestamp", java.lang.String.valueOf(com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis()));
            zzdrvVarZza.zzb("offline_ad", "1");
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzgM)).booleanValue()) {
            boolean z = com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzf(this.zzd.zza.zza) != 1;
            zzdrvVarZza.zzb("scar", java.lang.String.valueOf(z));
            if (z) {
                com.google.android.gms.ads.internal.client.zzm zzmVar = this.zzd.zza.zza.zzd;
                zzdrvVarZza.zzb("ragent", zzmVar.zzp);
                zzdrvVarZza.zzb("rtype", com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzb(com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzc(zzmVar)));
            }
        }
        return zzdrvVarZza;
    }

    private final void zze(com.google.android.gms.internal.ads.zzdrv zzdrvVar) {
        if (!this.zze.zzb()) {
            zzdrvVar.zzg();
            return;
        }
        this.zzf.zzd(new com.google.android.gms.internal.ads.zzebm(com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis(), this.zzd.zzb.zzb.zzb, zzdrvVar.zze(), 2));
    }

    private final boolean zzf() {
        java.lang.String strZzq;
        if (this.zzh == null) {
            synchronized (this) {
                if (this.zzh == null) {
                    java.lang.String str = (java.lang.String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzbB);
                    com.google.android.gms.ads.internal.zzv.zzq();
                    try {
                        strZzq = com.google.android.gms.ads.internal.util.zzs.zzq(this.zza);
                    } catch (android.os.RemoteException unused) {
                        strZzq = null;
                    }
                    boolean zMatches = false;
                    if (str != null && strZzq != null) {
                        try {
                            zMatches = java.util.regex.Pattern.matches(str, strZzq);
                        } catch (java.lang.RuntimeException e) {
                            com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "CsiActionsListener.isPatternMatched");
                        }
                    }
                    this.zzh = java.lang.Boolean.valueOf(zMatches);
                }
            }
        }
        return this.zzh.booleanValue();
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if (this.zze.zzb()) {
            zze(zzd(com.json.z8.CLICK));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvx
    public final void zza(com.google.android.gms.ads.internal.client.zze zzeVar) {
        com.google.android.gms.ads.internal.client.zze zzeVar2;
        if (this.zzi) {
            com.google.android.gms.internal.ads.zzdrv zzdrvVarZzd = zzd("ifts");
            zzdrvVarZzd.zzb("reason", "adapter");
            int i = zzeVar.zza;
            java.lang.String str = zzeVar.zzb;
            if (zzeVar.zzc.equals(com.google.android.gms.ads.MobileAds.ERROR_DOMAIN) && (zzeVar2 = zzeVar.zzd) != null && !zzeVar2.zzc.equals(com.google.android.gms.ads.MobileAds.ERROR_DOMAIN)) {
                com.google.android.gms.ads.internal.client.zze zzeVar3 = zzeVar.zzd;
                i = zzeVar3.zza;
                str = zzeVar3.zzb;
            }
            if (i >= 0) {
                zzdrvVarZzd.zzb("arec", java.lang.String.valueOf(i));
            }
            java.lang.String strZza = this.zzb.zza(str);
            if (strZza != null) {
                zzdrvVarZzd.zzb("areec", strZza);
            }
            zzdrvVarZzd.zzg();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvx
    public final void zzb() {
        if (this.zzi) {
            com.google.android.gms.internal.ads.zzdrv zzdrvVarZzd = zzd("ifts");
            zzdrvVarZzd.zzb("reason", "blocked");
            zzdrvVarZzd.zzg();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvx
    public final void zzc(com.google.android.gms.internal.ads.zzdgb zzdgbVar) {
        if (this.zzi) {
            com.google.android.gms.internal.ads.zzdrv zzdrvVarZzd = zzd("ifts");
            zzdrvVarZzd.zzb("reason", "exception");
            if (!android.text.TextUtils.isEmpty(zzdgbVar.getMessage())) {
                zzdrvVarZzd.zzb(androidx.core.app.NotificationCompat.CATEGORY_MESSAGE, zzdgbVar.getMessage());
            }
            zzdrvVarZzd.zzg();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdan
    public final void zzi() {
        if (zzf()) {
            zzd("adapter_shown").zzg();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdan
    public final void zzj() {
        if (zzf()) {
            zzd("adapter_impression").zzg();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwn
    public final void zzr() {
        if (zzf() || this.zze.zzb()) {
            zze(zzd("impression"));
        }
    }
}
