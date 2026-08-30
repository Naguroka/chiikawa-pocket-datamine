package com.google.android.gms.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class ResponseInfo {
    private final com.google.android.gms.ads.internal.client.zzdy zza;
    private final java.util.List zzb = new java.util.ArrayList();
    private com.google.android.gms.ads.AdapterResponseInfo zzc;

    private ResponseInfo(com.google.android.gms.ads.internal.client.zzdy zzdyVar) {
        this.zza = zzdyVar;
        if (zzdyVar != null) {
            try {
                java.util.List listZzj = zzdyVar.zzj();
                if (listZzj != null) {
                    java.util.Iterator it = listZzj.iterator();
                    while (it.hasNext()) {
                        com.google.android.gms.ads.AdapterResponseInfo adapterResponseInfoZza = com.google.android.gms.ads.AdapterResponseInfo.zza((com.google.android.gms.ads.internal.client.zzw) it.next());
                        if (adapterResponseInfoZza != null) {
                            this.zzb.add(adapterResponseInfoZza);
                        }
                    }
                }
            } catch (android.os.RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Could not forward getAdapterResponseInfo to ResponseInfo.", e);
            }
        }
        com.google.android.gms.ads.internal.client.zzdy zzdyVar2 = this.zza;
        if (zzdyVar2 == null) {
            return;
        }
        try {
            com.google.android.gms.ads.internal.client.zzw zzwVarZzf = zzdyVar2.zzf();
            if (zzwVarZzf != null) {
                this.zzc = com.google.android.gms.ads.AdapterResponseInfo.zza(zzwVarZzf);
            }
        } catch (android.os.RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Could not forward getLoadedAdapterResponse to ResponseInfo.", e2);
        }
    }

    public static com.google.android.gms.ads.ResponseInfo zza(com.google.android.gms.ads.internal.client.zzdy zzdyVar) {
        if (zzdyVar != null) {
            return new com.google.android.gms.ads.ResponseInfo(zzdyVar);
        }
        return null;
    }

    public static com.google.android.gms.ads.ResponseInfo zzb(com.google.android.gms.ads.internal.client.zzdy zzdyVar) {
        return new com.google.android.gms.ads.ResponseInfo(zzdyVar);
    }

    public java.util.List<com.google.android.gms.ads.AdapterResponseInfo> getAdapterResponses() {
        return this.zzb;
    }

    public com.google.android.gms.ads.AdapterResponseInfo getLoadedAdapterResponseInfo() {
        return this.zzc;
    }

    public java.lang.String getMediationAdapterClassName() {
        try {
            com.google.android.gms.ads.internal.client.zzdy zzdyVar = this.zza;
            if (zzdyVar != null) {
                return zzdyVar.zzg();
            }
            return null;
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Could not forward getMediationAdapterClassName to ResponseInfo.", e);
            return null;
        }
    }

    public android.os.Bundle getResponseExtras() {
        try {
            com.google.android.gms.ads.internal.client.zzdy zzdyVar = this.zza;
            if (zzdyVar != null) {
                return zzdyVar.zze();
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Could not forward getResponseExtras to ResponseInfo.", e);
        }
        return new android.os.Bundle();
    }

    public java.lang.String getResponseId() {
        try {
            com.google.android.gms.ads.internal.client.zzdy zzdyVar = this.zza;
            if (zzdyVar != null) {
                return zzdyVar.zzi();
            }
            return null;
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Could not forward getResponseId to ResponseInfo.", e);
            return null;
        }
    }

    public java.lang.String toString() {
        try {
            return zzd().toString(2);
        } catch (org.json.JSONException unused) {
            return "Error forming toString output.";
        }
    }

    public final com.google.android.gms.ads.internal.client.zzdy zzc() {
        return this.zza;
    }

    public final org.json.JSONObject zzd() throws org.json.JSONException {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        java.lang.String responseId = getResponseId();
        if (responseId == null) {
            jSONObject.put("Response ID", "null");
        } else {
            jSONObject.put("Response ID", responseId);
        }
        java.lang.String mediationAdapterClassName = getMediationAdapterClassName();
        if (mediationAdapterClassName == null) {
            jSONObject.put("Mediation Adapter Class Name", "null");
        } else {
            jSONObject.put("Mediation Adapter Class Name", mediationAdapterClassName);
        }
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.Iterator it = this.zzb.iterator();
        while (it.hasNext()) {
            jSONArray.put(((com.google.android.gms.ads.AdapterResponseInfo) it.next()).zzb());
        }
        jSONObject.put("Adapter Responses", jSONArray);
        com.google.android.gms.ads.AdapterResponseInfo adapterResponseInfo = this.zzc;
        if (adapterResponseInfo != null) {
            jSONObject.put("Loaded Adapter Response", adapterResponseInfo.zzb());
        }
        android.os.Bundle responseExtras = getResponseExtras();
        if (responseExtras != null) {
            jSONObject.put("Response Extras", com.google.android.gms.ads.internal.client.zzbc.zzb().zzi(responseExtras));
        }
        return jSONObject;
    }
}
