package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzbri implements com.google.android.gms.ads.mediation.MediationAdLoadCallback {
    final /* synthetic */ com.google.android.gms.internal.ads.zzbqr zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzbpk zzb;

    zzbri(com.google.android.gms.internal.ads.zzbrq zzbrqVar, com.google.android.gms.internal.ads.zzbqr zzbqrVar, com.google.android.gms.internal.ads.zzbpk zzbpkVar) {
        this.zza = zzbqrVar;
        this.zzb = zzbpkVar;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(com.google.android.gms.ads.AdError adError) {
        try {
            this.zza.zzf(adError.zza());
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final /* bridge */ /* synthetic */ java.lang.Object onSuccess(java.lang.Object obj) {
        com.google.android.gms.ads.mediation.MediationBannerAd mediationBannerAd = (com.google.android.gms.ads.mediation.MediationBannerAd) obj;
        if (mediationBannerAd != null) {
            try {
                this.zza.zzg(com.google.android.gms.dynamic.ObjectWrapper.wrap(mediationBannerAd.getView()));
            } catch (android.os.RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
            }
            return new com.google.android.gms.internal.ads.zzbrr(this.zzb);
        }
        com.google.android.gms.ads.internal.util.client.zzo.zzj("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
        try {
            this.zza.zze("Adapter returned null.");
            return null;
        } catch (android.os.RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(java.lang.String str) {
        onFailure(new com.google.android.gms.ads.AdError(0, str, com.google.android.gms.ads.AdError.UNDEFINED_DOMAIN));
    }
}
