package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbic extends com.google.android.gms.internal.ads.zzbhg {
    private final com.google.android.gms.ads.formats.OnAdManagerAdViewLoadedListener zza;

    public zzbic(com.google.android.gms.ads.formats.OnAdManagerAdViewLoadedListener onAdManagerAdViewLoadedListener) {
        this.zza = onAdManagerAdViewLoadedListener;
    }

    @Override // com.google.android.gms.internal.ads.zzbhh
    public final void zze(com.google.android.gms.ads.internal.client.zzby zzbyVar, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) {
        if (zzbyVar == null || iObjectWrapper == null) {
            return;
        }
        com.google.android.gms.ads.admanager.AdManagerAdView adManagerAdView = new com.google.android.gms.ads.admanager.AdManagerAdView((android.content.Context) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper));
        try {
            if (zzbyVar.zzi() instanceof com.google.android.gms.ads.internal.client.zzg) {
                com.google.android.gms.ads.internal.client.zzg zzgVar = (com.google.android.gms.ads.internal.client.zzg) zzbyVar.zzi();
                adManagerAdView.setAdListener(zzgVar != null ? zzgVar.zzb() : null);
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
        }
        try {
            if (zzbyVar.zzj() instanceof com.google.android.gms.internal.ads.zzayy) {
                com.google.android.gms.internal.ads.zzayy zzayyVar = (com.google.android.gms.internal.ads.zzayy) zzbyVar.zzj();
                adManagerAdView.setAppEventListener(zzayyVar != null ? zzayyVar.zzb() : null);
            }
        } catch (android.os.RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e2);
        }
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new com.google.android.gms.internal.ads.zzbib(this, adManagerAdView, zzbyVar));
    }
}
