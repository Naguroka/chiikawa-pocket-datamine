package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzefj implements com.google.android.gms.internal.ads.zzecy {
    private final com.google.android.gms.internal.ads.zzdpm zza;

    public zzefj(com.google.android.gms.internal.ads.zzdpm zzdpmVar) {
        this.zza = zzdpmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzecy
    public final com.google.android.gms.internal.ads.zzecz zza(java.lang.String str, org.json.JSONObject jSONObject) throws com.google.android.gms.internal.ads.zzfcq {
        return new com.google.android.gms.internal.ads.zzecz(this.zza.zzc(str, jSONObject), new com.google.android.gms.internal.ads.zzees(), str);
    }
}
