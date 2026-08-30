package com.google.android.gms.ads.mediation.customevent;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzc implements com.google.android.gms.ads.mediation.customevent.CustomEventNativeListener {
    private final com.google.android.gms.ads.mediation.customevent.CustomEventAdapter zza;
    private final com.google.android.gms.ads.mediation.MediationNativeListener zzb;

    public zzc(com.google.android.gms.ads.mediation.customevent.CustomEventAdapter customEventAdapter, com.google.android.gms.ads.mediation.MediationNativeListener mediationNativeListener) {
        this.zza = customEventAdapter;
        this.zzb = mediationNativeListener;
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdClicked() {
        com.google.android.gms.ads.internal.util.client.zzo.zze("Custom event adapter called onAdClicked.");
        this.zzb.onAdClicked(this.zza);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdClosed() {
        com.google.android.gms.ads.internal.util.client.zzo.zze("Custom event adapter called onAdClosed.");
        this.zzb.onAdClosed(this.zza);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdFailedToLoad(int i) {
        com.google.android.gms.ads.internal.util.client.zzo.zze("Custom event adapter called onAdFailedToLoad.");
        this.zzb.onAdFailedToLoad(this.zza, i);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventNativeListener
    public final void onAdImpression() {
        com.google.android.gms.ads.internal.util.client.zzo.zze("Custom event adapter called onAdImpression.");
        this.zzb.onAdImpression(this.zza);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdLeftApplication() {
        com.google.android.gms.ads.internal.util.client.zzo.zze("Custom event adapter called onAdLeftApplication.");
        this.zzb.onAdLeftApplication(this.zza);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventNativeListener
    public final void onAdLoaded(com.google.android.gms.ads.mediation.UnifiedNativeAdMapper unifiedNativeAdMapper) {
        com.google.android.gms.ads.internal.util.client.zzo.zze("Custom event adapter called onAdLoaded.");
        this.zzb.onAdLoaded(this.zza, unifiedNativeAdMapper);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdOpened() {
        com.google.android.gms.ads.internal.util.client.zzo.zze("Custom event adapter called onAdOpened.");
        this.zzb.onAdOpened(this.zza);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdFailedToLoad(com.google.android.gms.ads.AdError adError) {
        com.google.android.gms.ads.internal.util.client.zzo.zze("Custom event adapter called onAdFailedToLoad.");
        this.zzb.onAdFailedToLoad(this.zza, adError);
    }
}
