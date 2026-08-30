package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzevs implements com.google.android.gms.internal.ads.zzetq {
    private final java.util.List zza;

    public zzevs(java.util.List list) {
        this.zza = list;
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* synthetic */ void zza(java.lang.Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object obj) {
        try {
            ((org.json.JSONObject) obj).put("eid", android.text.TextUtils.join(",", this.zza));
        } catch (org.json.JSONException unused) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed putting experiment ids.");
        }
    }
}
