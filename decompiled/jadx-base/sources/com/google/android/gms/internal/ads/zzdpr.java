package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdpr {
    private org.json.JSONObject zzb;
    private final java.util.concurrent.Executor zzc;
    private boolean zzd;
    private org.json.JSONObject zze;
    private final java.util.Map zza = new java.util.concurrent.ConcurrentHashMap();
    private final java.util.concurrent.atomic.AtomicBoolean zzf = new java.util.concurrent.atomic.AtomicBoolean(false);

    public zzdpr(java.util.concurrent.Executor executor) {
        this.zzc = executor;
    }

    private final void zzg() {
        if (this.zzf.getAndSet(true)) {
            return;
        }
        com.google.android.gms.ads.internal.zzv.zzp().zzi().zzo(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzdpp
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzf();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final synchronized void zze() {
        org.json.JSONObject jSONObjectZzf;
        java.util.Map map;
        this.zzd = true;
        com.google.android.gms.internal.ads.zzbzg zzbzgVarZzg = com.google.android.gms.ads.internal.zzv.zzp().zzi().zzg();
        if (zzbzgVarZzg != null && (jSONObjectZzf = zzbzgVarZzg.zzf()) != null) {
            this.zzb = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzef)).booleanValue() ? jSONObjectZzf.optJSONObject("common_settings") : null;
            this.zze = jSONObjectZzf.optJSONObject("ad_unit_patterns");
            org.json.JSONArray jSONArrayOptJSONArray = jSONObjectZzf.optJSONArray("ad_unit_id_settings");
            if (jSONArrayOptJSONArray != null) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    org.json.JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                    if (jSONObjectOptJSONObject != null) {
                        java.lang.String strOptString = jSONObjectOptJSONObject.optString("ad_unit_id");
                        java.lang.String strOptString2 = jSONObjectOptJSONObject.optString("format");
                        org.json.JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("request_signals");
                        if (strOptString != null && jSONObjectOptJSONObject2 != null && strOptString2 != null) {
                            if (this.zza.containsKey(strOptString2)) {
                                map = (java.util.Map) this.zza.get(strOptString2);
                            } else {
                                java.util.concurrent.ConcurrentHashMap concurrentHashMap = new java.util.concurrent.ConcurrentHashMap();
                                this.zza.put(strOptString2, concurrentHashMap);
                                map = concurrentHashMap;
                            }
                            map.put(strOptString, jSONObjectOptJSONObject2);
                        }
                    }
                }
            }
        }
    }

    @javax.annotation.CheckForNull
    public final org.json.JSONObject zza() {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzef)).booleanValue()) {
            return this.zzb;
        }
        return null;
    }

    @javax.annotation.CheckForNull
    public final org.json.JSONObject zzb(java.lang.String str, java.lang.String str2) {
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzed)).booleanValue() || str == null || str2 == null) {
            return null;
        }
        if (!this.zzd) {
            zze();
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzee)).booleanValue()) {
                zzg();
            }
        }
        java.util.Map map = (java.util.Map) this.zza.get(str2);
        if (map == null) {
            return null;
        }
        org.json.JSONObject jSONObject = (org.json.JSONObject) map.get(str);
        if (jSONObject != null) {
            return jSONObject;
        }
        java.lang.String strZza = com.google.android.gms.internal.ads.zzdpt.zza(this.zze, str, str2);
        if (strZza != null) {
            return (org.json.JSONObject) map.get(strZza);
        }
        return null;
    }

    public final void zzd() {
        zzg();
        this.zzc.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzdpo
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zze();
            }
        });
    }

    final /* synthetic */ void zzf() {
        this.zzc.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzdpq
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zze();
            }
        });
    }
}
