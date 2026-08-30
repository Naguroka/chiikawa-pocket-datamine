package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
@javax.annotation.ParametersAreNonnullByDefault
public final class zzbcj implements android.content.SharedPreferences.OnSharedPreferenceChangeListener {
    private android.content.Context zzg;
    private final java.lang.Object zzb = new java.lang.Object();
    private final android.os.ConditionVariable zzc = new android.os.ConditionVariable();
    private volatile boolean zzd = false;
    volatile boolean zza = false;
    private android.content.SharedPreferences zze = null;
    private android.os.Bundle zzf = new android.os.Bundle();
    private org.json.JSONObject zzh = new org.json.JSONObject();
    private boolean zzi = false;
    private boolean zzj = false;

    private final void zzg(final android.content.SharedPreferences sharedPreferences) {
        if (sharedPreferences == null) {
            return;
        }
        try {
            this.zzh = new org.json.JSONObject((java.lang.String) com.google.android.gms.internal.ads.zzbcn.zza(new com.google.android.gms.internal.ads.zzfvf() { // from class: com.google.android.gms.internal.ads.zzbcg
                @Override // com.google.android.gms.internal.ads.zzfvf
                public final java.lang.Object zza() {
                    return sharedPreferences.getString("flag_configuration", com.applovin.impl.sdk.utils.JsonUtils.EMPTY_JSON);
                }
            }));
        } catch (org.json.JSONException unused) {
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(android.content.SharedPreferences sharedPreferences, java.lang.String str) {
        if ("flag_configuration".equals(str)) {
            zzg(sharedPreferences);
        }
    }

    public final java.lang.Object zza(final com.google.android.gms.internal.ads.zzbcc zzbccVar) {
        if (!this.zzc.block(5000L)) {
            synchronized (this.zzb) {
                if (!this.zza) {
                    throw new java.lang.IllegalStateException("Flags.initialize() was not called!");
                }
            }
        }
        if (!this.zzd || this.zze == null || this.zzj) {
            synchronized (this.zzb) {
                if (this.zzd && this.zze != null && !this.zzj) {
                }
                return zzbccVar.zzk();
            }
        }
        if (zzbccVar.zze() != 2) {
            return (zzbccVar.zze() == 1 && this.zzh.has(zzbccVar.zzl())) ? zzbccVar.zza(this.zzh) : com.google.android.gms.internal.ads.zzbcn.zza(new com.google.android.gms.internal.ads.zzfvf() { // from class: com.google.android.gms.internal.ads.zzbch
                @Override // com.google.android.gms.internal.ads.zzfvf
                public final java.lang.Object zza() {
                    return this.zza.zzc(zzbccVar);
                }
            });
        }
        android.os.Bundle bundle = this.zzf;
        return bundle == null ? zzbccVar.zzk() : zzbccVar.zzb(bundle);
    }

    final /* synthetic */ java.lang.Object zzc(com.google.android.gms.internal.ads.zzbcc zzbccVar) {
        return zzbccVar.zzc(this.zze);
    }

    /* JADX WARN: Code duplicated, block: B:63:0x011d A[Catch: all -> 0x015d, TRY_ENTER, TryCatch #3 {, blocks: (B:7:0x0008, B:9:0x000c, B:11:0x000e, B:13:0x0013, B:14:0x0015, B:16:0x0027, B:17:0x002b, B:18:0x002d, B:38:0x0099, B:39:0x00a0, B:48:0x00d1, B:49:0x00d8, B:63:0x011d, B:64:0x0124, B:72:0x014b, B:73:0x0152, B:76:0x0155, B:77:0x015c, B:20:0x0042, B:23:0x004c, B:27:0x0055, B:30:0x0060, B:31:0x0068, B:33:0x006e, B:35:0x007e, B:37:0x0095, B:41:0x00a2, B:43:0x00a6, B:45:0x00b6, B:47:0x00cd, B:51:0x00da, B:61:0x0119, B:66:0x0126, B:68:0x013d, B:70:0x0141, B:71:0x0144, B:54:0x00eb, B:56:0x00f9, B:58:0x0101, B:59:0x010c), top: B:88:0x0008, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x0126 A[Catch: all -> 0x0154, TRY_ENTER, TryCatch #0 {all -> 0x0154, blocks: (B:20:0x0042, B:23:0x004c, B:27:0x0055, B:30:0x0060, B:31:0x0068, B:33:0x006e, B:35:0x007e, B:37:0x0095, B:41:0x00a2, B:43:0x00a6, B:45:0x00b6, B:47:0x00cd, B:51:0x00da, B:61:0x0119, B:66:0x0126, B:68:0x013d, B:70:0x0141, B:71:0x0144, B:54:0x00eb, B:56:0x00f9, B:58:0x0101, B:59:0x010c), top: B:83:0x0042, outer: #3 }] */
    public final void zzd(android.content.Context context) {
        android.content.SharedPreferences sharedPreferencesZza;
        final android.content.SharedPreferences sharedPreferences;
        android.content.SharedPreferences sharedPreferences2;
        if (this.zzd) {
            return;
        }
        synchronized (this.zzb) {
            if (this.zzd) {
                return;
            }
            if (!this.zza) {
                this.zza = true;
            }
            this.zzi = android.text.TextUtils.equals(context.getPackageName(), "com.google.android.gms");
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.zzg = context;
            try {
                this.zzf = com.google.android.gms.common.wrappers.Wrappers.packageManager(context).getApplicationInfo(this.zzg.getPackageName(), 128).metaData;
            } catch (android.content.pm.PackageManager.NameNotFoundException | java.lang.NullPointerException unused) {
            }
            try {
                android.content.Context context2 = this.zzg;
                android.content.Context remoteContext = com.google.android.gms.common.GooglePlayServicesUtilLight.getRemoteContext(context2);
                if (remoteContext != null || context2 == null || (remoteContext = context2.getApplicationContext()) != null) {
                    context2 = remoteContext;
                }
                if (context2 != null) {
                    com.google.android.gms.ads.internal.client.zzbe.zzb();
                    sharedPreferencesZza = com.google.android.gms.internal.ads.zzbce.zza(context2);
                } else {
                    sharedPreferencesZza = null;
                }
                if (sharedPreferencesZza != null) {
                    com.google.android.gms.internal.ads.zzbfc.zzc(new com.google.android.gms.internal.ads.zzbci(this, sharedPreferencesZza));
                }
                if (!this.zzi && ((java.lang.Long) com.google.android.gms.internal.ads.zzbed.zzd.zze()).longValue() > 0 && com.google.android.gms.internal.ads.zzbbv.zza(this.zzg) >= ((java.lang.Long) com.google.android.gms.internal.ads.zzbed.zzd.zze()).longValue()) {
                    this.zzj = true;
                    this.zzd = true;
                    this.zza = false;
                    this.zzc.open();
                    return;
                }
                if (!this.zzi && ((java.lang.Long) com.google.android.gms.internal.ads.zzbed.zzf.zze()).longValue() > 0 && com.google.android.gms.internal.ads.zzbbv.zzb(this.zzg) >= ((java.lang.Long) com.google.android.gms.internal.ads.zzbed.zzf.zze()).longValue()) {
                    this.zzj = true;
                    this.zzd = true;
                    this.zza = false;
                    this.zzc.open();
                    return;
                }
                android.content.Context context3 = this.zzg;
                if (!((java.lang.Boolean) com.google.android.gms.internal.ads.zzbel.zzg.zze()).booleanValue()) {
                    if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbel.zzh.zze()).booleanValue() && (sharedPreferences = context3.getSharedPreferences(com.applovin.sdk.AppLovinMediationProvider.ADMOB, 0)) != null) {
                        try {
                            if (new org.json.JSONObject((java.lang.String) com.google.android.gms.internal.ads.zzbcn.zza(new com.google.android.gms.internal.ads.zzfvf() { // from class: com.google.android.gms.internal.ads.zzbcf
                                @Override // com.google.android.gms.internal.ads.zzfvf
                                public final java.lang.Object zza() {
                                    return sharedPreferences.getString("app_settings_json", com.applovin.impl.sdk.utils.JsonUtils.EMPTY_JSON);
                                }
                            })).optBoolean("local_flags_enabled")) {
                            }
                        } catch (org.json.JSONException unused2) {
                        }
                    }
                    if (context2 == null) {
                        this.zza = false;
                        this.zzc.open();
                        return;
                    }
                    com.google.android.gms.ads.internal.client.zzbe.zzb();
                    this.zze = com.google.android.gms.internal.ads.zzbce.zza(context2);
                    if (!((java.lang.Boolean) com.google.android.gms.internal.ads.zzbel.zza.zze()).booleanValue() && (sharedPreferences2 = this.zze) != null) {
                        sharedPreferences2.registerOnSharedPreferenceChangeListener(this);
                    }
                    zzg(this.zze);
                    this.zzd = true;
                    this.zza = false;
                    this.zzc.open();
                }
                context2 = this.zzg;
                if (context2 == null) {
                    this.zza = false;
                    this.zzc.open();
                    return;
                }
                com.google.android.gms.ads.internal.client.zzbe.zzb();
                this.zze = com.google.android.gms.internal.ads.zzbce.zza(context2);
                if (!((java.lang.Boolean) com.google.android.gms.internal.ads.zzbel.zza.zze()).booleanValue()) {
                    sharedPreferences2.registerOnSharedPreferenceChangeListener(this);
                }
                zzg(this.zze);
                this.zzd = true;
                this.zza = false;
                this.zzc.open();
            } catch (java.lang.Throwable th) {
                this.zza = false;
                this.zzc.open();
                throw th;
            }
        }
    }

    public final boolean zze() {
        return this.zzj;
    }

    final boolean zzf() {
        return this.zzi;
    }

    public final java.lang.Object zzb(com.google.android.gms.internal.ads.zzbcc zzbccVar) {
        return (this.zzd || this.zza) ? zza(zzbccVar) : zzbccVar.zzk();
    }
}
