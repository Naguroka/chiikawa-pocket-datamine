package com.google.android.gms.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public class AdError {
    public static final java.lang.String UNDEFINED_DOMAIN = "undefined";
    private final int zza;
    private final java.lang.String zzb;
    private final java.lang.String zzc;
    private final com.google.android.gms.ads.AdError zzd;

    public AdError(int i, java.lang.String str, java.lang.String str2) {
        this(i, str, str2, null);
    }

    public AdError(int i, java.lang.String str, java.lang.String str2, com.google.android.gms.ads.AdError adError) {
        this.zza = i;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = adError;
    }

    public com.google.android.gms.ads.AdError getCause() {
        return this.zzd;
    }

    public int getCode() {
        return this.zza;
    }

    public java.lang.String getDomain() {
        return this.zzc;
    }

    public java.lang.String getMessage() {
        return this.zzb;
    }

    public java.lang.String toString() {
        try {
            return zzb().toString(2);
        } catch (org.json.JSONException unused) {
            return "Error forming toString output.";
        }
    }

    public org.json.JSONObject zzb() throws org.json.JSONException {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("Code", this.zza);
        jSONObject.put("Message", this.zzb);
        jSONObject.put("Domain", this.zzc);
        com.google.android.gms.ads.AdError adError = this.zzd;
        if (adError == null) {
            jSONObject.put("Cause", "null");
        } else {
            jSONObject.put("Cause", adError.zzb());
        }
        return jSONObject;
    }

    public final com.google.android.gms.ads.internal.client.zze zza() {
        com.google.android.gms.ads.internal.client.zze zzeVar;
        com.google.android.gms.ads.AdError adError = this.zzd;
        if (adError == null) {
            zzeVar = null;
        } else {
            java.lang.String str = adError.zzc;
            zzeVar = new com.google.android.gms.ads.internal.client.zze(adError.zza, adError.zzb, str, null, null);
        }
        return new com.google.android.gms.ads.internal.client.zze(this.zza, this.zzb, this.zzc, zzeVar, null);
    }
}
