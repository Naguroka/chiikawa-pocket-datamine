package com.google.android.gms.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class LoadAdError extends com.google.android.gms.ads.AdError {
    private final com.google.android.gms.ads.ResponseInfo zza;

    public LoadAdError(int i, java.lang.String str, java.lang.String str2, com.google.android.gms.ads.AdError adError, com.google.android.gms.ads.ResponseInfo responseInfo) {
        super(i, str, str2, adError);
        this.zza = responseInfo;
    }

    public com.google.android.gms.ads.ResponseInfo getResponseInfo() {
        return this.zza;
    }

    @Override // com.google.android.gms.ads.AdError
    public java.lang.String toString() {
        try {
            return zzb().toString(2);
        } catch (org.json.JSONException unused) {
            return "Error forming toString output.";
        }
    }

    @Override // com.google.android.gms.ads.AdError
    public final org.json.JSONObject zzb() throws org.json.JSONException {
        org.json.JSONObject jSONObjectZzb = super.zzb();
        com.google.android.gms.ads.ResponseInfo responseInfo = getResponseInfo();
        if (responseInfo == null) {
            jSONObjectZzb.put("Response Info", "null");
        } else {
            jSONObjectZzb.put("Response Info", responseInfo.zzd());
        }
        return jSONObjectZzb;
    }
}
