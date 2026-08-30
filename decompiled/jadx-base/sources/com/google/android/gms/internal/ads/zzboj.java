package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzboj implements com.google.android.gms.internal.ads.zzbke {
    final /* synthetic */ com.google.android.gms.internal.ads.zzbok zza;
    private final com.google.android.gms.internal.ads.zzbnm zzb;
    private final com.google.android.gms.internal.ads.zzcab zzc;

    public zzboj(com.google.android.gms.internal.ads.zzbok zzbokVar, com.google.android.gms.internal.ads.zzbnm zzbnmVar, com.google.android.gms.internal.ads.zzcab zzcabVar) {
        this.zza = zzbokVar;
        this.zzb = zzbnmVar;
        this.zzc = zzcabVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbke
    public final void zza(java.lang.String str) {
        try {
            if (str == null) {
                this.zzc.zzd(new com.google.android.gms.internal.ads.zzbnv());
            } else {
                this.zzc.zzd(new com.google.android.gms.internal.ads.zzbnv(str));
            }
        } catch (java.lang.IllegalStateException unused) {
        } finally {
            this.zzb.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbke
    public final void zzb(org.json.JSONObject jSONObject) {
        try {
            try {
                this.zzc.zzc(this.zza.zza.zza(jSONObject));
            } catch (java.lang.IllegalStateException unused) {
            } catch (org.json.JSONException e) {
                this.zzc.zzd(e);
            }
        } finally {
            this.zzb.zzb();
        }
    }
}
