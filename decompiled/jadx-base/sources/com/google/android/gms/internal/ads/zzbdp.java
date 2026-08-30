package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzbdp extends com.google.android.gms.ads.query.QueryInfoGenerationCallback {
    final /* synthetic */ java.lang.String zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzbdq zzb;

    zzbdp(com.google.android.gms.internal.ads.zzbdq zzbdqVar, java.lang.String str) {
        this.zza = str;
        this.zzb = zzbdqVar;
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onFailure(java.lang.String str) {
        com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to generate query info for Custom Tab error: ".concat(java.lang.String.valueOf(str)));
        try {
            com.google.android.gms.internal.ads.zzbdq zzbdqVar = this.zzb;
            zzbdqVar.zzg.postMessage(zzbdqVar.zzc(this.zza, str).toString(), null);
        } catch (org.json.JSONException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Error creating PACT Error Response JSON: ", e);
        }
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onSuccess(com.google.android.gms.ads.query.QueryInfo queryInfo) {
        java.lang.String query = queryInfo.getQuery();
        try {
            com.google.android.gms.internal.ads.zzbdq zzbdqVar = this.zzb;
            zzbdqVar.zzg.postMessage(zzbdqVar.zzd(this.zza, query).toString(), null);
        } catch (org.json.JSONException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Error creating PACT Signal Response JSON: ", e);
        }
    }
}
