package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzbpx implements com.google.android.gms.ads.mediation.MediationAdLoadCallback {
    final /* synthetic */ com.google.android.gms.internal.ads.zzbpk zza;
    final /* synthetic */ com.google.android.gms.ads.mediation.Adapter zzb;
    final /* synthetic */ com.google.android.gms.internal.ads.zzbqf zzc;

    zzbpx(com.google.android.gms.internal.ads.zzbqf zzbqfVar, com.google.android.gms.internal.ads.zzbpk zzbpkVar, com.google.android.gms.ads.mediation.Adapter adapter) {
        this.zza = zzbpkVar;
        this.zzb = adapter;
        this.zzc = zzbqfVar;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(com.google.android.gms.ads.AdError adError) {
        try {
            com.google.android.gms.ads.internal.util.client.zzo.zze(this.zzb.getClass().getCanonicalName() + "failed to load mediation ad: ErrorCode = " + adError.getCode() + ". ErrorMessage = " + adError.getMessage() + ". ErrorDomain = " + adError.getDomain());
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
            this.zzc.zzj = (com.google.android.gms.ads.mediation.MediationInterscrollerAd) obj;
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
