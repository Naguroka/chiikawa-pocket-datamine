package com.google.android.gms.ads.nonagon.signalgeneration;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzw implements com.google.android.gms.internal.ads.zzdee {
    private final com.google.android.gms.internal.ads.zzdrq zza;
    private final com.google.android.gms.ads.nonagon.signalgeneration.zzv zzb;
    private final java.lang.String zzc;
    private final int zzd;

    public zzw(com.google.android.gms.internal.ads.zzdrq zzdrqVar, com.google.android.gms.ads.nonagon.signalgeneration.zzv zzvVar, java.lang.String str, int i) {
        this.zza = zzdrqVar;
        this.zzb = zzvVar;
        this.zzc = str;
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.ads.zzdee
    public final void zze(com.google.android.gms.ads.nonagon.signalgeneration.zzbk zzbkVar) {
        java.lang.String strOptString;
        if (zzbkVar == null || this.zzd == 2) {
            return;
        }
        if (android.text.TextUtils.isEmpty(zzbkVar.zzc)) {
            this.zzb.zzd(this.zzc, zzbkVar.zzb, this.zza);
            return;
        }
        try {
            strOptString = new org.json.JSONObject(zzbkVar.zzc).optString("request_id");
        } catch (org.json.JSONException e) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "RenderSignals.getRequestId");
            strOptString = null;
        }
        if (android.text.TextUtils.isEmpty(strOptString)) {
            return;
        }
        this.zzb.zzd(strOptString, zzbkVar.zzc, this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdee
    public final void zzf(java.lang.String str) {
    }
}
