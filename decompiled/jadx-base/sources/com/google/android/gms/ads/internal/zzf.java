package com.google.android.gms.ads.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
@javax.annotation.ParametersAreNonnullByDefault
public final class zzf {
    private android.content.Context zza;
    private long zzb = 0;

    static final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzd(java.lang.Long l, com.google.android.gms.internal.ads.zzdrw zzdrwVar, com.google.android.gms.internal.ads.zzfhk zzfhkVar, com.google.android.gms.internal.ads.zzfgw zzfgwVar, org.json.JSONObject jSONObject) throws java.lang.Exception {
        boolean zOptBoolean = jSONObject.optBoolean("isSuccessful", false);
        if (zOptBoolean) {
            com.google.android.gms.ads.internal.zzv.zzp().zzi().zzs(jSONObject.getString("appSettingsJson"));
            if (l != null) {
                zzf(zzdrwVar, "cld_s", com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime() - l.longValue());
            }
        }
        zzfgwVar.zzg(zOptBoolean);
        zzfhkVar.zzb(zzfgwVar.zzm());
        return com.google.android.gms.internal.ads.zzgch.zzh(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zzf(com.google.android.gms.internal.ads.zzdrw zzdrwVar, java.lang.String str, long j) {
        if (zzdrwVar != null) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzmy)).booleanValue()) {
                com.google.android.gms.internal.ads.zzdrv zzdrvVarZza = zzdrwVar.zza();
                zzdrvVarZza.zzb("action", "lat_init");
                zzdrvVarZza.zzb(str, java.lang.Long.toString(j));
                zzdrvVarZza.zzg();
            }
        }
    }

    public final void zza(android.content.Context context, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel, java.lang.String str, java.lang.Runnable runnable, com.google.android.gms.internal.ads.zzfhk zzfhkVar, com.google.android.gms.internal.ads.zzdrw zzdrwVar, java.lang.Long l) {
        zzb(context, versionInfoParcel, true, null, str, null, runnable, zzfhkVar, zzdrwVar, l);
    }

    final void zzb(android.content.Context context, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel, boolean z, com.google.android.gms.internal.ads.zzbzg zzbzgVar, java.lang.String str, java.lang.String str2, java.lang.Runnable runnable, final com.google.android.gms.internal.ads.zzfhk zzfhkVar, final com.google.android.gms.internal.ads.zzdrw zzdrwVar, final java.lang.Long l) {
        android.content.pm.PackageInfo packageInfo;
        if (com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime() - this.zzb < 5000) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Not retrying to fetch app settings");
            return;
        }
        this.zzb = com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime();
        if (zzbzgVar != null && !android.text.TextUtils.isEmpty(zzbzgVar.zzc())) {
            if (com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis() - zzbzgVar.zza() <= ((java.lang.Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzej)).longValue() && zzbzgVar.zzi()) {
                return;
            }
        }
        if (context == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Context not provided to fetch application settings");
            return;
        }
        if (android.text.TextUtils.isEmpty(str) && android.text.TextUtils.isEmpty(str2)) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("App settings could not be fetched. Required parameters missing");
            return;
        }
        android.content.Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        this.zza = applicationContext;
        final com.google.android.gms.internal.ads.zzfgw zzfgwVarZza = com.google.android.gms.internal.ads.zzfgv.zza(context, 4);
        zzfgwVarZza.zzi();
        com.google.android.gms.internal.ads.zzbnw zzbnwVarZza = com.google.android.gms.ads.internal.zzv.zzg().zza(this.zza, versionInfoParcel, zzfhkVar).zza("google.afma.config.fetchAppSettings", com.google.android.gms.internal.ads.zzbod.zza, com.google.android.gms.internal.ads.zzbod.zza);
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            if (!android.text.TextUtils.isEmpty(str)) {
                jSONObject.put("app_id", str);
            } else if (!android.text.TextUtils.isEmpty(str2)) {
                jSONObject.put("ad_unit_id", str2);
            }
            jSONObject.put("is_init", z);
            jSONObject.put("pn", context.getPackageName());
            com.google.android.gms.internal.ads.zzbcc zzbccVar = com.google.android.gms.internal.ads.zzbcl.zza;
            jSONObject.put("experiment_ids", android.text.TextUtils.join(",", com.google.android.gms.ads.internal.client.zzbe.zza().zza()));
            jSONObject.put("js", versionInfoParcel.afmaVersion);
            try {
                android.content.pm.ApplicationInfo applicationInfo = this.zza.getApplicationInfo();
                if (applicationInfo != null && (packageInfo = com.google.android.gms.common.wrappers.Wrappers.packageManager(context).getPackageInfo(applicationInfo.packageName, 0)) != null) {
                    jSONObject.put("version", packageInfo.versionCode);
                }
            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                com.google.android.gms.ads.internal.util.zze.zza("Error fetching PackageInfo.");
            }
            com.google.common.util.concurrent.ListenableFuture listenableFutureZzb = zzbnwVarZza.zzb(jSONObject);
            com.google.common.util.concurrent.ListenableFuture listenableFutureZzn = com.google.android.gms.internal.ads.zzgch.zzn(listenableFutureZzb, new com.google.android.gms.internal.ads.zzgbo(this) { // from class: com.google.android.gms.ads.internal.zzd
                @Override // com.google.android.gms.internal.ads.zzgbo
                public final com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                    return com.google.android.gms.ads.internal.zzf.zzd(l, zzdrwVar, zzfhkVar, zzfgwVarZza, (org.json.JSONObject) obj);
                }
            }, com.google.android.gms.internal.ads.zzbzw.zzg);
            if (runnable != null) {
                listenableFutureZzb.addListener(runnable, com.google.android.gms.internal.ads.zzbzw.zzg);
            }
            if (l != null) {
                listenableFutureZzb.addListener(new java.lang.Runnable(this) { // from class: com.google.android.gms.ads.internal.zze
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.google.android.gms.ads.internal.zzf.zzf(zzdrwVar, "cld_r", com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime() - l.longValue());
                    }
                }, com.google.android.gms.internal.ads.zzbzw.zzg);
            }
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzhC)).booleanValue()) {
                com.google.android.gms.internal.ads.zzbzz.zzb(listenableFutureZzn, "ConfigLoader.maybeFetchNewAppSettings");
            } else {
                com.google.android.gms.internal.ads.zzbzz.zza(listenableFutureZzn, "ConfigLoader.maybeFetchNewAppSettings");
            }
        } catch (java.lang.Exception e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Error requesting application settings", e);
            zzfgwVarZza.zzh(e);
            zzfgwVarZza.zzg(false);
            zzfhkVar.zzb(zzfgwVarZza.zzm());
        }
    }

    public final void zzc(android.content.Context context, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel, java.lang.String str, com.google.android.gms.internal.ads.zzbzg zzbzgVar, com.google.android.gms.internal.ads.zzfhk zzfhkVar) {
        zzb(context, versionInfoParcel, false, zzbzgVar, zzbzgVar != null ? zzbzgVar.zzb() : null, str, null, zzfhkVar, null, null);
    }
}
