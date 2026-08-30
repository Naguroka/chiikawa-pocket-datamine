package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdmx implements com.google.android.gms.internal.ads.zzbjp {
    private final com.google.android.gms.internal.ads.zzbha zza;
    private final com.google.android.gms.internal.ads.zzdnl zzb;
    private final com.google.android.gms.internal.ads.zzhel zzc;

    public zzdmx(com.google.android.gms.internal.ads.zzdiq zzdiqVar, com.google.android.gms.internal.ads.zzdif zzdifVar, com.google.android.gms.internal.ads.zzdnl zzdnlVar, com.google.android.gms.internal.ads.zzhel zzhelVar) {
        this.zza = zzdiqVar.zzc(zzdifVar.zzA());
        this.zzb = zzdnlVar;
        this.zzc = zzhelVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjp
    public final void zza(java.lang.Object obj, java.util.Map map) {
        java.lang.String str = (java.lang.String) map.get("asset");
        try {
            this.zza.zze((com.google.android.gms.internal.ads.zzbgq) this.zzc.zzb(), str);
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Failed to call onCustomClick for asset " + str + ".", e);
        }
    }

    public final void zzb() {
        if (this.zza == null) {
            return;
        }
        this.zzb.zzl("/nativeAdCustomClick", this);
    }
}
