package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
@javax.annotation.ParametersAreNonnullByDefault
public final class zzbkf implements com.google.android.gms.internal.ads.zzbjp {
    private final java.lang.Object zza = new java.lang.Object();
    private final java.util.Map zzb = new java.util.HashMap();

    @Override // com.google.android.gms.internal.ads.zzbjp
    public final void zza(java.lang.Object obj, java.util.Map map) {
        java.lang.String str = (java.lang.String) map.get("id");
        java.lang.String str2 = (java.lang.String) map.get(com.ironsource.y8.f.e);
        java.lang.String str3 = (java.lang.String) map.get("fail_reason");
        java.lang.String str4 = (java.lang.String) map.get("fail_stack");
        java.lang.String str5 = (java.lang.String) map.get("result");
        if (true == android.text.TextUtils.isEmpty(str4)) {
            str3 = "Unknown Fail Reason.";
        }
        java.lang.String strConcat = android.text.TextUtils.isEmpty(str4) ? "" : "\n".concat(java.lang.String.valueOf(str4));
        synchronized (this.zza) {
            com.google.android.gms.internal.ads.zzbke zzbkeVar = (com.google.android.gms.internal.ads.zzbke) this.zzb.remove(str);
            if (zzbkeVar == null) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Received result for unexpected method invocation: " + str);
                return;
            }
            if (!android.text.TextUtils.isEmpty(str2)) {
                zzbkeVar.zza(str3 + strConcat);
                return;
            }
            if (str5 == null) {
                zzbkeVar.zzb(null);
                return;
            }
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str5);
                if (com.google.android.gms.ads.internal.util.zze.zzc()) {
                    com.google.android.gms.ads.internal.util.zze.zza("Result GMSG: " + jSONObject.toString(2));
                }
                zzbkeVar.zzb(jSONObject);
            } catch (org.json.JSONException e) {
                zzbkeVar.zza(e.getMessage());
            }
        }
    }

    public final com.google.common.util.concurrent.ListenableFuture zzb(com.google.android.gms.internal.ads.zzbmw zzbmwVar, java.lang.String str, org.json.JSONObject jSONObject) {
        com.google.android.gms.internal.ads.zzcab zzcabVar = new com.google.android.gms.internal.ads.zzcab();
        com.google.android.gms.ads.internal.zzv.zzq();
        java.lang.String string = java.util.UUID.randomUUID().toString();
        zzc(string, new com.google.android.gms.internal.ads.zzbkd(this, zzcabVar));
        try {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("id", string);
            jSONObject2.put("args", jSONObject);
            zzbmwVar.zzl(str, jSONObject2);
        } catch (java.lang.Exception e) {
            zzcabVar.zzd(e);
        }
        return zzcabVar;
    }

    public final void zzc(java.lang.String str, com.google.android.gms.internal.ads.zzbke zzbkeVar) {
        synchronized (this.zza) {
            this.zzb.put(str, zzbkeVar);
        }
    }
}
