package com.google.android.gms.ads.mediation.customevent;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzb implements com.google.android.gms.ads.mediation.customevent.CustomEventInterstitialListener {
    final /* synthetic */ com.google.android.gms.ads.mediation.customevent.CustomEventAdapter zza;
    private final com.google.android.gms.ads.mediation.customevent.CustomEventAdapter zzb;
    private final com.google.android.gms.ads.mediation.MediationInterstitialListener zzc;

    public zzb(com.google.android.gms.ads.mediation.customevent.CustomEventAdapter customEventAdapter, com.google.android.gms.ads.mediation.customevent.CustomEventAdapter customEventAdapter2, com.google.android.gms.ads.mediation.MediationInterstitialListener mediationInterstitialListener) {
        this.zza = customEventAdapter;
        this.zzb = customEventAdapter2;
        this.zzc = mediationInterstitialListener;
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdClicked() {
        com.google.android.gms.ads.internal.util.client.zzo.zze("Custom event adapter called onAdClicked.");
        this.zzc.onAdClicked(this.zzb);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdClosed() {
        com.google.android.gms.ads.internal.util.client.zzo.zze("Custom event adapter called onAdClosed.");
        this.zzc.onAdClosed(this.zzb);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdFailedToLoad(int i) {
        com.google.android.gms.ads.internal.util.client.zzo.zze("Custom event adapter called onFailedToReceiveAd.");
        this.zzc.onAdFailedToLoad(this.zzb, i);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdLeftApplication() {
        com.google.android.gms.ads.internal.util.client.zzo.zze("Custom event adapter called onAdLeftApplication.");
        this.zzc.onAdLeftApplication(this.zzb);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventInterstitialListener
    public final void onAdLoaded() {
        com.google.android.gms.ads.internal.util.client.zzo.zze("Custom event adapter called onReceivedAd.");
        this.zzc.onAdLoaded(this.zza);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdOpened() {
        com.google.android.gms.ads.internal.util.client.zzo.zze("Custom event adapter called onAdOpened.");
        this.zzc.onAdOpened(this.zzb);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdFailedToLoad(com.google.android.gms.ads.AdError adError) {
        com.google.android.gms.ads.internal.util.client.zzo.zze("Custom event adapter called onFailedToReceiveAd.");
        this.zzc.onAdFailedToLoad(this.zzb, adError);
    }
}
