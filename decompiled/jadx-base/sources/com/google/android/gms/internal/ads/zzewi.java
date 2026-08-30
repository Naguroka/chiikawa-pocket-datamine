package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzewi implements com.google.android.gms.internal.ads.zzetq {
    private final java.lang.String zza;

    public zzewi(java.lang.String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* synthetic */ void zza(java.lang.Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object obj) {
        org.json.JSONObject jSONObject = (org.json.JSONObject) obj;
        try {
            if (android.text.TextUtils.isEmpty(this.zza)) {
                return;
            }
            com.google.android.gms.ads.internal.util.zzbs.zzg(jSONObject, "pii").put("adsid", this.zza);
        } catch (org.json.JSONException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Failed putting trustless token.", e);
        }
    }
}
