package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzbor implements com.google.android.gms.internal.ads.zzbke {
    private final com.google.android.gms.internal.ads.zzcab zza;

    public zzbor(com.google.android.gms.internal.ads.zzbos zzbosVar, com.google.android.gms.internal.ads.zzcab zzcabVar) {
        this.zza = zzcabVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbke
    public final void zza(java.lang.String str) {
        try {
            if (str == null) {
                this.zza.zzd(new com.google.android.gms.internal.ads.zzbnv());
            } else {
                this.zza.zzd(new com.google.android.gms.internal.ads.zzbnv(str));
            }
        } catch (java.lang.IllegalStateException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbke
    public final void zzb(org.json.JSONObject jSONObject) {
        try {
            this.zza.zzc(jSONObject);
        } catch (java.lang.IllegalStateException unused) {
        } catch (org.json.JSONException e) {
            this.zza.zzd(e);
        }
    }
}
