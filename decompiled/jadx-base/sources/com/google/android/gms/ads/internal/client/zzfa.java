package com.google.android.gms.ads.internal.client;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfa {
    private final java.lang.String zza;
    private final android.os.Bundle zzb;
    private final java.lang.String zzc;

    public zzfa(java.lang.String str, android.os.Bundle bundle, java.lang.String str2) {
        this.zza = str;
        this.zzb = bundle;
        this.zzc = str2;
    }

    public final android.os.Bundle zza() {
        return this.zzb;
    }

    public final java.lang.String zzb() {
        return this.zza;
    }

    public final java.lang.String zzc() {
        if (!android.text.TextUtils.isEmpty(this.zzc)) {
            try {
                return new org.json.JSONObject(this.zzc).optString("request_id", "");
            } catch (org.json.JSONException unused) {
            }
        }
        return "";
    }
}
