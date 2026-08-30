package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdtc {
    private final com.google.android.gms.internal.ads.zzbko zza;

    zzdtc(com.google.android.gms.internal.ads.zzbko zzbkoVar) {
        this.zza = zzbkoVar;
    }

    private final void zzs(com.google.android.gms.internal.ads.zzdta zzdtaVar) throws android.os.RemoteException {
        java.lang.String strZza = com.google.android.gms.internal.ads.zzdta.zza(zzdtaVar);
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Dispatching AFMA event on publisher webview: ".concat(strZza));
        this.zza.zzb(strZza);
    }

    public final void zza() throws android.os.RemoteException {
        zzs(new com.google.android.gms.internal.ads.zzdta(com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase.initializeMethodName, null));
    }

    public final void zzb(long j) throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzdta zzdtaVar = new com.google.android.gms.internal.ads.zzdta("interstitial", null);
        zzdtaVar.zza = java.lang.Long.valueOf(j);
        zzdtaVar.zzc = com.json.ju.f;
        this.zza.zzb(com.google.android.gms.internal.ads.zzdta.zza(zzdtaVar));
    }

    public final void zzc(long j) throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzdta zzdtaVar = new com.google.android.gms.internal.ads.zzdta("interstitial", null);
        zzdtaVar.zza = java.lang.Long.valueOf(j);
        zzdtaVar.zzc = com.json.ju.g;
        zzs(zzdtaVar);
    }

    public final void zzd(long j, int i) throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzdta zzdtaVar = new com.google.android.gms.internal.ads.zzdta("interstitial", null);
        zzdtaVar.zza = java.lang.Long.valueOf(j);
        zzdtaVar.zzc = "onAdFailedToLoad";
        zzdtaVar.zzd = java.lang.Integer.valueOf(i);
        zzs(zzdtaVar);
    }

    public final void zze(long j) throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzdta zzdtaVar = new com.google.android.gms.internal.ads.zzdta("interstitial", null);
        zzdtaVar.zza = java.lang.Long.valueOf(j);
        zzdtaVar.zzc = com.json.ju.j;
        zzs(zzdtaVar);
    }

    public final void zzf(long j) throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzdta zzdtaVar = new com.google.android.gms.internal.ads.zzdta("interstitial", null);
        zzdtaVar.zza = java.lang.Long.valueOf(j);
        zzdtaVar.zzc = "onNativeAdObjectNotAvailable";
        zzs(zzdtaVar);
    }

    public final void zzg(long j) throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzdta zzdtaVar = new com.google.android.gms.internal.ads.zzdta("interstitial", null);
        zzdtaVar.zza = java.lang.Long.valueOf(j);
        zzdtaVar.zzc = com.json.ju.c;
        zzs(zzdtaVar);
    }

    public final void zzh(long j) throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzdta zzdtaVar = new com.google.android.gms.internal.ads.zzdta("creation", null);
        zzdtaVar.zza = java.lang.Long.valueOf(j);
        zzdtaVar.zzc = "nativeObjectCreated";
        zzs(zzdtaVar);
    }

    public final void zzi(long j) throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzdta zzdtaVar = new com.google.android.gms.internal.ads.zzdta("creation", null);
        zzdtaVar.zza = java.lang.Long.valueOf(j);
        zzdtaVar.zzc = "nativeObjectNotCreated";
        zzs(zzdtaVar);
    }

    public final void zzj(long j) throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzdta zzdtaVar = new com.google.android.gms.internal.ads.zzdta("rewarded", null);
        zzdtaVar.zza = java.lang.Long.valueOf(j);
        zzdtaVar.zzc = com.json.ju.f;
        zzs(zzdtaVar);
    }

    public final void zzk(long j) throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzdta zzdtaVar = new com.google.android.gms.internal.ads.zzdta("rewarded", null);
        zzdtaVar.zza = java.lang.Long.valueOf(j);
        zzdtaVar.zzc = "onRewardedAdClosed";
        zzs(zzdtaVar);
    }

    public final void zzl(long j, com.google.android.gms.internal.ads.zzbwm zzbwmVar) throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzdta zzdtaVar = new com.google.android.gms.internal.ads.zzdta("rewarded", null);
        zzdtaVar.zza = java.lang.Long.valueOf(j);
        zzdtaVar.zzc = "onUserEarnedReward";
        zzdtaVar.zze = zzbwmVar.zzf();
        zzdtaVar.zzf = java.lang.Integer.valueOf(zzbwmVar.zze());
        zzs(zzdtaVar);
    }

    public final void zzm(long j, int i) throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzdta zzdtaVar = new com.google.android.gms.internal.ads.zzdta("rewarded", null);
        zzdtaVar.zza = java.lang.Long.valueOf(j);
        zzdtaVar.zzc = "onRewardedAdFailedToLoad";
        zzdtaVar.zzd = java.lang.Integer.valueOf(i);
        zzs(zzdtaVar);
    }

    public final void zzn(long j, int i) throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzdta zzdtaVar = new com.google.android.gms.internal.ads.zzdta("rewarded", null);
        zzdtaVar.zza = java.lang.Long.valueOf(j);
        zzdtaVar.zzc = "onRewardedAdFailedToShow";
        zzdtaVar.zzd = java.lang.Integer.valueOf(i);
        zzs(zzdtaVar);
    }

    public final void zzo(long j) throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzdta zzdtaVar = new com.google.android.gms.internal.ads.zzdta("rewarded", null);
        zzdtaVar.zza = java.lang.Long.valueOf(j);
        zzdtaVar.zzc = "onAdImpression";
        zzs(zzdtaVar);
    }

    public final void zzp(long j) throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzdta zzdtaVar = new com.google.android.gms.internal.ads.zzdta("rewarded", null);
        zzdtaVar.zza = java.lang.Long.valueOf(j);
        zzdtaVar.zzc = "onRewardedAdLoaded";
        zzs(zzdtaVar);
    }

    public final void zzq(long j) throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzdta zzdtaVar = new com.google.android.gms.internal.ads.zzdta("rewarded", null);
        zzdtaVar.zza = java.lang.Long.valueOf(j);
        zzdtaVar.zzc = "onNativeAdObjectNotAvailable";
        zzs(zzdtaVar);
    }

    public final void zzr(long j) throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzdta zzdtaVar = new com.google.android.gms.internal.ads.zzdta("rewarded", null);
        zzdtaVar.zza = java.lang.Long.valueOf(j);
        zzdtaVar.zzc = "onRewardedAdOpened";
        zzs(zzdtaVar);
    }
}
