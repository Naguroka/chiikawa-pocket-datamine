package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzdms implements com.google.android.gms.internal.ads.zzbfk {
    final /* synthetic */ java.lang.String zza = com.google.android.gms.ads.nativead.NativeCustomFormatAd.ASSET_NAME_VIDEO;
    final /* synthetic */ com.google.android.gms.internal.ads.zzdmt zzb;

    zzdms(com.google.android.gms.internal.ads.zzdmt zzdmtVar, java.lang.String str) {
        this.zzb = zzdmtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbfk
    public final org.json.JSONObject zza() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbfk
    public final org.json.JSONObject zzb() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbfk
    public final void zzc() {
        com.google.android.gms.internal.ads.zzdmt zzdmtVar = this.zzb;
        if (zzdmtVar.zzd != null) {
            zzdmtVar.zzd.zzF(this.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfk
    public final void zzd(android.view.MotionEvent motionEvent) {
    }
}
