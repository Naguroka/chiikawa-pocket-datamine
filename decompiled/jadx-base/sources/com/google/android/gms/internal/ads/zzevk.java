package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzevk implements com.google.android.gms.internal.ads.zzetr {
    private final org.json.JSONObject zza;

    zzevk(android.content.Context context) {
        this.zza = com.google.android.gms.internal.ads.zzbvg.zzc(context, com.google.android.gms.ads.internal.util.client.VersionInfoParcel.forPackage());
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 46;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final com.google.common.util.concurrent.ListenableFuture zzb() {
        return ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzlO)).booleanValue() ? com.google.android.gms.internal.ads.zzgch.zzh(new com.google.android.gms.internal.ads.zzetq() { // from class: com.google.android.gms.internal.ads.zzevi
            @Override // com.google.android.gms.internal.ads.zzetq
            public final /* synthetic */ void zza(java.lang.Object obj) {
            }

            @Override // com.google.android.gms.internal.ads.zzetq
            public final void zzb(java.lang.Object obj) {
            }
        }) : com.google.android.gms.internal.ads.zzgch.zzh(new com.google.android.gms.internal.ads.zzetq() { // from class: com.google.android.gms.internal.ads.zzevj
            @Override // com.google.android.gms.internal.ads.zzetq
            public final /* synthetic */ void zza(java.lang.Object obj) {
            }

            @Override // com.google.android.gms.internal.ads.zzetq
            public final void zzb(java.lang.Object obj) {
                this.zza.zzc((org.json.JSONObject) obj);
            }
        });
    }

    final /* synthetic */ void zzc(org.json.JSONObject jSONObject) {
        try {
            jSONObject.put("gms_sdk_env", this.zza);
        } catch (org.json.JSONException unused) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed putting version constants.");
        }
    }
}
