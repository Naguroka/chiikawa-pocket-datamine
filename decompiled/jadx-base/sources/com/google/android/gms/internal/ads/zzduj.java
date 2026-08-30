package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzduj implements com.google.android.gms.internal.ads.zzcvw, com.google.android.gms.internal.ads.zzcyq, com.google.android.gms.internal.ads.zzcxl {
    private final com.google.android.gms.internal.ads.zzduv zza;
    private final java.lang.String zzb;
    private final java.lang.String zzc;
    private com.google.android.gms.internal.ads.zzcvm zzf;
    private com.google.android.gms.ads.internal.client.zze zzg;
    private org.json.JSONObject zzk;
    private org.json.JSONObject zzl;
    private boolean zzm;
    private boolean zzn;
    private boolean zzo;
    private java.lang.String zzh = "";
    private java.lang.String zzi = "";
    private java.lang.String zzj = "";
    private int zzd = 0;
    private com.google.android.gms.internal.ads.zzdui zze = com.google.android.gms.internal.ads.zzdui.AD_REQUESTED;

    zzduj(com.google.android.gms.internal.ads.zzduv zzduvVar, com.google.android.gms.internal.ads.zzfcj zzfcjVar, java.lang.String str) {
        this.zza = zzduvVar;
        this.zzc = str;
        this.zzb = zzfcjVar.zzf;
    }

    private static org.json.JSONObject zzh(com.google.android.gms.ads.internal.client.zze zzeVar) throws org.json.JSONException {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("errorDomain", zzeVar.zzc);
        jSONObject.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, zzeVar.zza);
        jSONObject.put("errorDescription", zzeVar.zzb);
        com.google.android.gms.ads.internal.client.zze zzeVar2 = zzeVar.zzd;
        jSONObject.put("underlyingError", zzeVar2 == null ? null : zzh(zzeVar2));
        return jSONObject;
    }

    private final org.json.JSONObject zzi(com.google.android.gms.internal.ads.zzcvm zzcvmVar) throws org.json.JSONException {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("winningAdapterClassName", zzcvmVar.zzg());
        jSONObject.put("responseSecsSinceEpoch", zzcvmVar.zzc());
        jSONObject.put("responseId", zzcvmVar.zzi());
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzje)).booleanValue()) {
            java.lang.String strZzd = zzcvmVar.zzd();
            if (!android.text.TextUtils.isEmpty(strZzd)) {
                com.google.android.gms.ads.internal.util.client.zzo.zze("Bidding data: ".concat(java.lang.String.valueOf(strZzd)));
                jSONObject.put("biddingData", new org.json.JSONObject(strZzd));
            }
        }
        if (!android.text.TextUtils.isEmpty(this.zzh)) {
            jSONObject.put("adRequestUrl", this.zzh);
        }
        if (!android.text.TextUtils.isEmpty(this.zzi)) {
            jSONObject.put("postBody", this.zzi);
        }
        if (!android.text.TextUtils.isEmpty(this.zzj)) {
            jSONObject.put("adResponseBody", this.zzj);
        }
        java.lang.Object obj = this.zzk;
        if (obj != null) {
            jSONObject.put("adResponseHeaders", obj);
        }
        java.lang.Object obj2 = this.zzl;
        if (obj2 != null) {
            jSONObject.put("transactionExtras", obj2);
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzjh)).booleanValue()) {
            jSONObject.put("hasExceededMemoryLimit", this.zzo);
        }
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        for (com.google.android.gms.ads.internal.client.zzw zzwVar : zzcvmVar.zzj()) {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("adapterClassName", zzwVar.zza);
            jSONObject2.put("latencyMillis", zzwVar.zzb);
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzjf)).booleanValue()) {
                jSONObject2.put("credentials", com.google.android.gms.ads.internal.client.zzbc.zzb().zzi(zzwVar.zzd));
            }
            com.google.android.gms.ads.internal.client.zze zzeVar = zzwVar.zzc;
            jSONObject2.put("error", zzeVar == null ? null : zzh(zzeVar));
            jSONArray.put(jSONObject2);
        }
        jSONObject.put("adNetworks", jSONArray);
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzcxl
    public final void zza(com.google.android.gms.internal.ads.zzcqz zzcqzVar) {
        if (this.zza.zzq()) {
            this.zzf = zzcqzVar.zzm();
            this.zze = com.google.android.gms.internal.ads.zzdui.AD_LOADED;
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzjl)).booleanValue()) {
                this.zza.zzf(this.zzb, this);
            }
        }
    }

    public final java.lang.String zzc() {
        return this.zzc;
    }

    public final org.json.JSONObject zzd() throws org.json.JSONException {
        org.json.JSONObject jSONObjectZzi;
        android.os.IBinder iBinder;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("state", this.zze);
        jSONObject.put("format", com.google.android.gms.internal.ads.zzfbo.zza(this.zzd));
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzjl)).booleanValue()) {
            jSONObject.put("isOutOfContext", this.zzm);
            if (this.zzm) {
                jSONObject.put("shown", this.zzn);
            }
        }
        com.google.android.gms.internal.ads.zzcvm zzcvmVar = this.zzf;
        if (zzcvmVar != null) {
            jSONObjectZzi = zzi(zzcvmVar);
        } else {
            com.google.android.gms.ads.internal.client.zze zzeVar = this.zzg;
            org.json.JSONObject jSONObjectZzi2 = null;
            if (zzeVar != null && (iBinder = zzeVar.zze) != null) {
                com.google.android.gms.internal.ads.zzcvm zzcvmVar2 = (com.google.android.gms.internal.ads.zzcvm) iBinder;
                jSONObjectZzi2 = zzi(zzcvmVar2);
                if (zzcvmVar2.zzj().isEmpty()) {
                    org.json.JSONArray jSONArray = new org.json.JSONArray();
                    jSONArray.put(zzh(this.zzg));
                    jSONObjectZzi2.put("errors", jSONArray);
                }
            }
            jSONObjectZzi = jSONObjectZzi2;
        }
        jSONObject.put("responseInfo", jSONObjectZzi);
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzcyq
    public final void zzdl(com.google.android.gms.internal.ads.zzbvk zzbvkVar) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzjl)).booleanValue() || !this.zza.zzq()) {
            return;
        }
        this.zza.zzf(this.zzb, this);
    }

    @Override // com.google.android.gms.internal.ads.zzcyq
    public final void zzdm(com.google.android.gms.internal.ads.zzfca zzfcaVar) {
        if (this.zza.zzq()) {
            if (!zzfcaVar.zzb.zza.isEmpty()) {
                this.zzd = ((com.google.android.gms.internal.ads.zzfbo) zzfcaVar.zzb.zza.get(0)).zzb;
            }
            if (!android.text.TextUtils.isEmpty(zzfcaVar.zzb.zzb.zzl)) {
                this.zzh = zzfcaVar.zzb.zzb.zzl;
            }
            if (!android.text.TextUtils.isEmpty(zzfcaVar.zzb.zzb.zzm)) {
                this.zzi = zzfcaVar.zzb.zzb.zzm;
            }
            if (zzfcaVar.zzb.zzb.zzp.length() > 0) {
                this.zzl = zzfcaVar.zzb.zzb.zzp;
            }
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzjh)).booleanValue()) {
                if (!this.zza.zzs()) {
                    this.zzo = true;
                    return;
                }
                if (!android.text.TextUtils.isEmpty(zzfcaVar.zzb.zzb.zzn)) {
                    this.zzj = zzfcaVar.zzb.zzb.zzn;
                }
                if (zzfcaVar.zzb.zzb.zzo.length() > 0) {
                    this.zzk = zzfcaVar.zzb.zzb.zzo;
                }
                com.google.android.gms.internal.ads.zzduv zzduvVar = this.zza;
                org.json.JSONObject jSONObject = this.zzk;
                int length = jSONObject != null ? jSONObject.toString().length() : 0;
                if (!android.text.TextUtils.isEmpty(this.zzj)) {
                    length += this.zzj.length();
                }
                zzduvVar.zzk(length);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvw
    public final void zzdz(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (this.zza.zzq()) {
            this.zze = com.google.android.gms.internal.ads.zzdui.AD_LOAD_FAILED;
            this.zzg = zzeVar;
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzjl)).booleanValue()) {
                this.zza.zzf(this.zzb, this);
            }
        }
    }

    public final void zze() {
        this.zzm = true;
    }

    public final void zzf() {
        this.zzn = true;
    }

    public final boolean zzg() {
        return this.zze != com.google.android.gms.internal.ads.zzdui.AD_REQUESTED;
    }
}
