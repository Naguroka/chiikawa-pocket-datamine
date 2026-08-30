package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdrc implements com.google.android.gms.internal.ads.zzcyq, com.google.android.gms.internal.ads.zzcxh, com.google.android.gms.internal.ads.zzcvw, com.google.android.gms.internal.ads.zzdee {
    private final com.google.android.gms.internal.ads.zzdrq zza;
    private final com.google.android.gms.internal.ads.zzdsb zzb;
    private final int zzc;

    zzdrc(com.google.android.gms.internal.ads.zzdrq zzdrqVar, com.google.android.gms.internal.ads.zzdsb zzdsbVar, int i) {
        this.zza = zzdrqVar;
        this.zzb = zzdsbVar;
        this.zzc = i;
    }

    private final void zzc(android.os.Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (java.lang.String str : bundle.keySet()) {
            long j = bundle.getLong(str);
            if (j >= 0) {
                this.zza.zzc(str, java.lang.String.valueOf(j));
            }
        }
    }

    private final void zzd(android.os.Bundle bundle, com.google.android.gms.internal.ads.zzfxn zzfxnVar) {
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzck)).booleanValue() || bundle == null) {
            return;
        }
        bundle.putLong(com.google.android.gms.internal.ads.zzdre.PUBLIC_API_CALLBACK.zza(), com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis());
        if (bundle.containsKey("ls")) {
            this.zza.zzc("ls", true != bundle.getBoolean("ls") ? "0" : "1");
        }
        int size = zzfxnVar.size();
        for (int i = 0; i < size; i++) {
            com.google.android.gms.internal.ads.zzdrf zzdrfVar = (com.google.android.gms.internal.ads.zzdrf) zzfxnVar.get(i);
            long j = bundle.getLong(zzdrfVar.zza().zza(), -1L);
            long j2 = bundle.getLong(zzdrfVar.zzb().zza(), -1L);
            if (j > 0 && j2 > 0) {
                this.zza.zzc(zzdrfVar.zzc(), java.lang.String.valueOf(j2 - j));
            }
        }
        zzc(bundle.getBundle("client_sig_latency_key"));
        zzc(bundle.getBundle("gms_sig_latency_key"));
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzhq)).booleanValue()) {
            if (bundle.containsKey("sod_h")) {
                this.zza.zzc("sod_h", true == bundle.getBoolean("sod_h") ? "1" : "0");
            }
            if (bundle.containsKey("cmr")) {
                this.zza.zzc("cmr", java.lang.String.valueOf(bundle.getInt("cmr")));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcyq
    public final void zzdl(com.google.android.gms.internal.ads.zzbvk zzbvkVar) {
        this.zza.zze(zzbvkVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcyq
    public final void zzdm(com.google.android.gms.internal.ads.zzfca zzfcaVar) {
        this.zza.zzd(zzfcaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcvw
    public final void zzdz(com.google.android.gms.ads.internal.client.zze zzeVar) {
        this.zza.zzb().put("action", "ftl");
        this.zza.zzc("ftl", java.lang.String.valueOf(zzeVar.zza));
        this.zza.zzc("ed", zzeVar.zzc);
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzgY)).booleanValue()) {
            this.zza.zzc("emsg", zzeVar.zzb);
        }
        this.zzb.zzg(this.zza.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzdee
    public final void zze(com.google.android.gms.ads.nonagon.signalgeneration.zzbk zzbkVar) {
        java.lang.String str;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzgM)).booleanValue()) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzhq)).booleanValue()) {
                this.zza.zzb().put("sgw", java.lang.String.valueOf(this.zzc));
            }
            if (zzbkVar == null) {
                this.zza.zzb().put("action", "sgs");
                this.zza.zzb().put("request_id", "-1");
                this.zzb.zzg(this.zza.zzb());
                return;
            }
            com.google.android.gms.internal.ads.zzbvk zzbvkVar = zzbkVar.zzd;
            android.os.Bundle bundle = zzbkVar.zze;
            if (zzbvkVar != null) {
                zzd(zzbvkVar.zzm, com.google.android.gms.internal.ads.zzdrf.zza);
            } else if (bundle != null && !bundle.isEmpty()) {
                zzd(bundle, com.google.android.gms.internal.ads.zzdrf.zza);
            }
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(android.text.TextUtils.isEmpty(zzbkVar.zzc) ? zzbkVar.zzb : zzbkVar.zzc);
                this.zza.zzb().put("action", "sgs");
                java.util.Map mapZzb = this.zza.zzb();
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzjz)).booleanValue()) {
                    try {
                        str = jSONObject.getJSONObject("extras").getBoolean("accept_3p_cookie") ? "1" : "0";
                    } catch (org.json.JSONException e) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzh("Error retrieving JSONObject from the requestJson, ", e);
                        str = "na";
                    }
                } else {
                    str = "na";
                }
                mapZzb.put("tpc", str);
                com.google.android.gms.internal.ads.zzbvk zzbvkVar2 = zzbkVar.zzd;
                if (zzbvkVar2 != null) {
                    this.zza.zze(zzbvkVar2.zza);
                }
                this.zzb.zzg(this.zza.zzb());
            } catch (org.json.JSONException unused) {
                this.zza.zzb().put("action", "sgf");
                this.zza.zzb().put("sgf_reason", "request_invalid");
                this.zzb.zzg(this.zza.zzb());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdee
    public final void zzf(java.lang.String str) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzgM)).booleanValue()) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzhq)).booleanValue()) {
                this.zza.zzb().put("sgw", java.lang.String.valueOf(this.zzc));
            }
            this.zza.zzb().put("action", "sgf");
            this.zza.zzc("sgf_reason", str);
            this.zzb.zzg(this.zza.zzb());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcxh
    public final void zzs() {
        this.zza.zzb().put("action", com.ironsource.y8.h.r);
        zzd(this.zza.zza(), com.google.android.gms.internal.ads.zzdrf.zzb);
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzmw)).booleanValue()) {
            this.zza.zzb().put("mafe", true != androidx.webkit.WebViewFeature.isFeatureSupported("MUTE_AUDIO") ? "0" : "1");
        }
        this.zzb.zzg(this.zza.zzb());
    }
}
