package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzehl implements com.google.android.gms.internal.ads.zzecy {
    private final java.util.Map zza = new java.util.HashMap();
    private final com.google.android.gms.internal.ads.zzdpm zzb;

    public zzehl(com.google.android.gms.internal.ads.zzdpm zzdpmVar) {
        this.zzb = zzdpmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzecy
    public final com.google.android.gms.internal.ads.zzecz zza(java.lang.String str, org.json.JSONObject jSONObject) throws com.google.android.gms.internal.ads.zzfcq {
        com.google.android.gms.internal.ads.zzecz zzeczVar;
        synchronized (this) {
            zzeczVar = (com.google.android.gms.internal.ads.zzecz) this.zza.get(str);
            if (zzeczVar == null) {
                zzeczVar = new com.google.android.gms.internal.ads.zzecz(this.zzb.zzc(str, jSONObject), new com.google.android.gms.internal.ads.zzeet(), str);
                this.zza.put(str, zzeczVar);
            }
        }
        return zzeczVar;
    }
}
