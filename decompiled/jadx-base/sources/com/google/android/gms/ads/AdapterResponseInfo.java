package com.google.android.gms.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class AdapterResponseInfo {
    private final com.google.android.gms.ads.internal.client.zzw zza;
    private final com.google.android.gms.ads.AdError zzb;

    private AdapterResponseInfo(com.google.android.gms.ads.internal.client.zzw zzwVar) {
        this.zza = zzwVar;
        com.google.android.gms.ads.internal.client.zze zzeVar = zzwVar.zzc;
        this.zzb = zzeVar == null ? null : zzeVar.zza();
    }

    public static com.google.android.gms.ads.AdapterResponseInfo zza(com.google.android.gms.ads.internal.client.zzw zzwVar) {
        if (zzwVar != null) {
            return new com.google.android.gms.ads.AdapterResponseInfo(zzwVar);
        }
        return null;
    }

    public com.google.android.gms.ads.AdError getAdError() {
        return this.zzb;
    }

    public java.lang.String getAdSourceId() {
        return this.zza.zzf;
    }

    public java.lang.String getAdSourceInstanceId() {
        return this.zza.zzh;
    }

    public java.lang.String getAdSourceInstanceName() {
        return this.zza.zzg;
    }

    public java.lang.String getAdSourceName() {
        return this.zza.zze;
    }

    public java.lang.String getAdapterClassName() {
        return this.zza.zza;
    }

    public android.os.Bundle getCredentials() {
        return this.zza.zzd;
    }

    public long getLatencyMillis() {
        return this.zza.zzb;
    }

    public java.lang.String toString() {
        try {
            return zzb().toString(2);
        } catch (org.json.JSONException unused) {
            return "Error forming toString output.";
        }
    }

    public final org.json.JSONObject zzb() throws org.json.JSONException {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("Adapter", this.zza.zza);
        jSONObject.put("Latency", this.zza.zzb);
        java.lang.String adSourceName = getAdSourceName();
        if (adSourceName == null) {
            jSONObject.put("Ad Source Name", "null");
        } else {
            jSONObject.put("Ad Source Name", adSourceName);
        }
        java.lang.String adSourceId = getAdSourceId();
        if (adSourceId == null) {
            jSONObject.put("Ad Source ID", "null");
        } else {
            jSONObject.put("Ad Source ID", adSourceId);
        }
        java.lang.String adSourceInstanceName = getAdSourceInstanceName();
        if (adSourceInstanceName == null) {
            jSONObject.put("Ad Source Instance Name", "null");
        } else {
            jSONObject.put("Ad Source Instance Name", adSourceInstanceName);
        }
        java.lang.String adSourceInstanceId = getAdSourceInstanceId();
        if (adSourceInstanceId == null) {
            jSONObject.put("Ad Source Instance ID", "null");
        } else {
            jSONObject.put("Ad Source Instance ID", adSourceInstanceId);
        }
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        for (java.lang.String str : this.zza.zzd.keySet()) {
            jSONObject2.put(str, this.zza.zzd.get(str));
        }
        jSONObject.put("Credentials", jSONObject2);
        com.google.android.gms.ads.AdError adError = this.zzb;
        if (adError == null) {
            jSONObject.put("Ad Error", "null");
        } else {
            jSONObject.put("Ad Error", adError.zzb());
        }
        return jSONObject;
    }
}
