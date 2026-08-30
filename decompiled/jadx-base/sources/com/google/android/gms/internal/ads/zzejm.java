package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzejm extends com.google.android.gms.internal.ads.zzbrf {
    private final java.lang.String zza;
    private final com.google.android.gms.internal.ads.zzbrd zzb;
    private final com.google.android.gms.internal.ads.zzcab zzc;
    private final org.json.JSONObject zzd;
    private final long zze;
    private boolean zzf;

    public zzejm(java.lang.String str, com.google.android.gms.internal.ads.zzbrd zzbrdVar, com.google.android.gms.internal.ads.zzcab zzcabVar, long j) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        this.zzd = jSONObject;
        this.zzf = false;
        this.zzc = zzcabVar;
        this.zza = str;
        this.zzb = zzbrdVar;
        this.zze = j;
        try {
            jSONObject.put("adapter_version", zzbrdVar.zzf().toString());
            jSONObject.put("sdk_version", zzbrdVar.zzg().toString());
            jSONObject.put("name", str);
        } catch (android.os.RemoteException | java.lang.NullPointerException | org.json.JSONException unused) {
        }
    }

    public static synchronized void zzb(java.lang.String str, com.google.android.gms.internal.ads.zzcab zzcabVar) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("name", str);
            jSONObject.put("signal_error", "Adapter failed to instantiate");
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzbI)).booleanValue()) {
                jSONObject.put("signal_error_code", 1);
            }
            zzcabVar.zzc(jSONObject);
        } catch (org.json.JSONException unused) {
        }
    }

    private final synchronized void zzh(java.lang.String str, int i) {
        if (this.zzf) {
            return;
        }
        try {
            this.zzd.put("signal_error", str);
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzbJ)).booleanValue()) {
                this.zzd.put("latency", com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime() - this.zze);
            }
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzbI)).booleanValue()) {
                this.zzd.put("signal_error_code", i);
            }
        } catch (org.json.JSONException unused) {
        }
        this.zzc.zzc(this.zzd);
        this.zzf = true;
    }

    public final synchronized void zzc() {
        zzh("Signal collection timeout.", 3);
    }

    public final synchronized void zzd() {
        if (this.zzf) {
            return;
        }
        try {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzbI)).booleanValue()) {
                this.zzd.put("signal_error_code", 0);
            }
        } catch (org.json.JSONException unused) {
        }
        this.zzc.zzc(this.zzd);
        this.zzf = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbrg
    public final synchronized void zze(java.lang.String str) throws android.os.RemoteException {
        if (this.zzf) {
            return;
        }
        if (str == null) {
            zzf("Adapter returned null signals");
            return;
        }
        try {
            this.zzd.put("signals", str);
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzbJ)).booleanValue()) {
                this.zzd.put("latency", com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime() - this.zze);
            }
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzbI)).booleanValue()) {
                this.zzd.put("signal_error_code", 0);
            }
        } catch (org.json.JSONException unused) {
        }
        this.zzc.zzc(this.zzd);
        this.zzf = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbrg
    public final synchronized void zzf(java.lang.String str) throws android.os.RemoteException {
        zzh(str, 2);
    }

    @Override // com.google.android.gms.internal.ads.zzbrg
    public final synchronized void zzg(com.google.android.gms.ads.internal.client.zze zzeVar) throws android.os.RemoteException {
        zzh(zzeVar.zzb, 2);
    }
}
