package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbvg extends com.google.android.gms.internal.ads.zzbve {
    private final java.lang.Object zza = new java.lang.Object();
    private final android.content.Context zzb;
    private android.content.SharedPreferences zzc;
    private final com.google.android.gms.internal.ads.zzbnw zzd;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zze;

    public zzbvg(android.content.Context context, com.google.android.gms.internal.ads.zzbnw zzbnwVar, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel) {
        this.zzb = context.getApplicationContext();
        this.zze = versionInfoParcel;
        this.zzd = zzbnwVar;
    }

    public static org.json.JSONObject zzc(android.content.Context context, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbel.zzb.zze()).booleanValue()) {
                jSONObject.put(com.ironsource.y8.h.V, context.getPackageName());
            }
            jSONObject.put("js", versionInfoParcel.afmaVersion);
            jSONObject.put("mf", com.google.android.gms.internal.ads.zzbel.zzc.zze());
            jSONObject.put("cl", "697668803");
            jSONObject.put("rapid_rc", "dev");
            jSONObject.put("rapid_rollup", "HEAD");
            jSONObject.put("admob_module_version", 12451000);
            jSONObject.put("dynamite_local_version", com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor.MODULE_VERSION);
            jSONObject.put("dynamite_version", com.google.android.gms.dynamite.DynamiteModule.getRemoteVersion(context, com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor.MODULE_ID));
            jSONObject.put("container_version", 12451000);
        } catch (org.json.JSONException unused) {
        }
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzbve
    public final com.google.common.util.concurrent.ListenableFuture zza() {
        synchronized (this.zza) {
            if (this.zzc == null) {
                this.zzc = this.zzb.getSharedPreferences("google_ads_flags_meta", 0);
            }
        }
        android.content.SharedPreferences sharedPreferences = this.zzc;
        if (com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis() - (sharedPreferences != null ? sharedPreferences.getLong("js_last_update", 0L) : 0L) < ((java.lang.Long) com.google.android.gms.internal.ads.zzbel.zzd.zze()).longValue()) {
            return com.google.android.gms.internal.ads.zzgch.zzh(null);
        }
        return com.google.android.gms.internal.ads.zzgch.zzm(this.zzd.zzb(zzc(this.zzb, this.zze)), new com.google.android.gms.internal.ads.zzfuc() { // from class: com.google.android.gms.internal.ads.zzbvf
            @Override // com.google.android.gms.internal.ads.zzfuc
            public final java.lang.Object apply(java.lang.Object obj) {
                this.zza.zzb((org.json.JSONObject) obj);
                return null;
            }
        }, com.google.android.gms.internal.ads.zzbzw.zzg);
    }

    final /* synthetic */ java.lang.Void zzb(org.json.JSONObject jSONObject) {
        com.google.android.gms.internal.ads.zzbcc zzbccVar = com.google.android.gms.internal.ads.zzbcl.zza;
        com.google.android.gms.ads.internal.client.zzbe.zzb();
        android.content.SharedPreferences sharedPreferencesZza = com.google.android.gms.internal.ads.zzbce.zza(this.zzb);
        if (sharedPreferencesZza == null) {
            return null;
        }
        android.content.SharedPreferences.Editor editorEdit = sharedPreferencesZza.edit();
        com.google.android.gms.ads.internal.client.zzbe.zza();
        int i = com.google.android.gms.internal.ads.zzbeb.zza;
        com.google.android.gms.ads.internal.client.zzbe.zza().zze(editorEdit, 1, jSONObject);
        com.google.android.gms.ads.internal.client.zzbe.zzb();
        editorEdit.commit();
        android.content.SharedPreferences sharedPreferences = this.zzc;
        if (sharedPreferences == null) {
            return null;
        }
        sharedPreferences.edit().putLong("js_last_update", com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis()).apply();
        return null;
    }
}
