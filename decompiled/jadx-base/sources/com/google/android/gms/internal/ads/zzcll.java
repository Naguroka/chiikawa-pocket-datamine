package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzcll implements com.google.android.gms.internal.ads.zzclb {
    private final com.google.android.gms.internal.ads.zzduv zza;

    zzcll(com.google.android.gms.internal.ads.zzduv zzduvVar) {
        this.zza = zzduvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final void zza(org.json.JSONObject jSONObject) {
        if (jSONObject != null) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzjd)).booleanValue()) {
                this.zza.zzn(jSONObject);
            }
        }
    }
}
