package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzbkd implements com.google.android.gms.internal.ads.zzbke {
    final /* synthetic */ com.google.android.gms.internal.ads.zzcab zza;

    zzbkd(com.google.android.gms.internal.ads.zzbkf zzbkfVar, com.google.android.gms.internal.ads.zzcab zzcabVar) {
        this.zza = zzcabVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbke
    public final void zza(java.lang.String str) {
        this.zza.zzd(new com.google.android.gms.internal.ads.zzbnv(str));
    }

    @Override // com.google.android.gms.internal.ads.zzbke
    public final void zzb(org.json.JSONObject jSONObject) {
        this.zza.zzc(jSONObject);
    }
}
