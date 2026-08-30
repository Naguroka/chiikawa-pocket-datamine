package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzevc implements com.google.android.gms.internal.ads.zzetq {
    final java.lang.String zza;
    final int zzb;

    public zzevc(java.lang.String str, int i) {
        this.zza = str;
        this.zzb = i;
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* synthetic */ void zza(java.lang.Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object obj) {
        org.json.JSONObject jSONObject = (org.json.JSONObject) obj;
        if (android.text.TextUtils.isEmpty(this.zza) || this.zzb == -1) {
            return;
        }
        try {
            org.json.JSONObject jSONObjectZzg = com.google.android.gms.ads.internal.util.zzbs.zzg(jSONObject, "pii");
            jSONObjectZzg.put("pvid", this.zza);
            jSONObjectZzg.put("pvid_s", this.zzb);
        } catch (org.json.JSONException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Failed putting gms core app set ID info.", e);
        }
    }
}
