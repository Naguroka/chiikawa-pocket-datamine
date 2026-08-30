package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdwr implements com.google.android.gms.internal.ads.zzher {
    private final com.google.android.gms.internal.ads.zzhfj zza;

    public zzdwr(com.google.android.gms.internal.ads.zzhfj zzhfjVar) {
        this.zza = zzhfjVar;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0054  */
    /* JADX WARN: Code duplicated, block: B:18:0x003f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0039  */
    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final /* bridge */ /* synthetic */ java.lang.Object zzb() {
        java.lang.String strValueOf;
        com.google.android.gms.internal.ads.zzfcj zzfcjVarZza = ((com.google.android.gms.internal.ads.zzcvk) this.zza).zza();
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzhb)).booleanValue()) {
            java.lang.String str = zzfcjVarZza.zzd.zzx;
            if (!android.text.TextUtils.isEmpty(str)) {
                try {
                    strValueOf = new org.json.JSONObject(str).getString("request_id");
                    if (android.text.TextUtils.isEmpty(strValueOf)) {
                        if (zzfcjVarZza.zzd.zzs != null) {
                            try {
                                strValueOf = new org.json.JSONObject(zzfcjVarZza.zzd.zzs.zza).getString("request_id");
                                if (android.text.TextUtils.isEmpty(strValueOf)) {
                                    strValueOf = java.lang.String.valueOf(com.google.android.gms.ads.internal.client.zzbc.zze().nextInt() & Integer.MAX_VALUE);
                                }
                            } catch (org.json.JSONException unused) {
                            }
                        } else {
                            strValueOf = java.lang.String.valueOf(com.google.android.gms.ads.internal.client.zzbc.zze().nextInt() & Integer.MAX_VALUE);
                        }
                    }
                } catch (org.json.JSONException unused2) {
                }
            } else if (zzfcjVarZza.zzd.zzs != null) {
                strValueOf = new org.json.JSONObject(zzfcjVarZza.zzd.zzs.zza).getString("request_id");
                if (android.text.TextUtils.isEmpty(strValueOf)) {
                    strValueOf = java.lang.String.valueOf(com.google.android.gms.ads.internal.client.zzbc.zze().nextInt() & Integer.MAX_VALUE);
                }
            } else {
                strValueOf = java.lang.String.valueOf(com.google.android.gms.ads.internal.client.zzbc.zze().nextInt() & Integer.MAX_VALUE);
            }
        } else {
            strValueOf = java.lang.String.valueOf(com.google.android.gms.ads.internal.client.zzbc.zze().nextInt() & Integer.MAX_VALUE);
        }
        com.google.android.gms.internal.ads.zzhez.zzb(strValueOf);
        return strValueOf;
    }
}
