package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzbqa implements com.google.android.gms.ads.mediation.MediationAdLoadCallback {
    final /* synthetic */ com.google.android.gms.internal.ads.zzbpk zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzbqf zzb;

    zzbqa(com.google.android.gms.internal.ads.zzbqf zzbqfVar, com.google.android.gms.internal.ads.zzbpk zzbpkVar) {
        this.zza = zzbpkVar;
        this.zzb = zzbqfVar;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(com.google.android.gms.ads.AdError adError) {
        try {
            com.google.android.gms.ads.internal.util.client.zzo.zze(this.zzb.zza.getClass().getCanonicalName() + "failed to loaded mediation ad: ErrorCode = " + adError.getCode() + ". ErrorMessage = " + adError.getMessage() + ". ErrorDomain = " + adError.getDomain());
            this.zza.zzh(adError.zza());
            this.zza.zzi(adError.getCode(), adError.getMessage());
            this.zza.zzg(adError.getCode());
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final /* bridge */ /* synthetic */ java.lang.Object onSuccess(java.lang.Object obj) {
        try {
            this.zzb.zzf = (com.google.android.gms.ads.mediation.MediationInterstitialAd) obj;
            this.zza.zzo();
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
        }
        return new com.google.android.gms.internal.ads.zzbpv(this.zza);
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(java.lang.String str) {
        onFailure(new com.google.android.gms.ads.AdError(0, str, com.google.android.gms.ads.AdError.UNDEFINED_DOMAIN));
    }
}
