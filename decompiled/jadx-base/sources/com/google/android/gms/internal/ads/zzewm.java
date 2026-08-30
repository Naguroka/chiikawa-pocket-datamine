package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzewm implements com.google.android.gms.internal.ads.zzetq {
    private final java.util.Map zza;

    public zzewm(java.util.Map map) {
        this.zza = map;
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* synthetic */ void zza(java.lang.Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object obj) {
        try {
            ((org.json.JSONObject) obj).put("video_decoders", com.google.android.gms.ads.internal.client.zzbc.zzb().zzj(this.zza));
        } catch (org.json.JSONException e) {
            com.google.android.gms.ads.internal.util.zze.zza("Could not encode video decoder properties: ".concat(java.lang.String.valueOf(e.getMessage())));
        }
    }
}
