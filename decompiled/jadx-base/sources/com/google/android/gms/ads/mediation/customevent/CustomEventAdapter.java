package com.google.android.gms.ads.mediation.customevent;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class CustomEventAdapter implements com.google.android.gms.ads.mediation.MediationBannerAdapter, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter {
    static final com.google.android.gms.ads.AdError zza = new com.google.android.gms.ads.AdError(0, "Could not instantiate custom event adapter", com.google.android.gms.ads.MobileAds.ERROR_DOMAIN);
    com.google.android.gms.ads.mediation.customevent.CustomEventBanner zzb;
    com.google.android.gms.ads.mediation.customevent.CustomEventInterstitial zzc;
    com.google.android.gms.ads.mediation.customevent.CustomEventNative zzd;
    private android.view.View zze;

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public android.view.View getBannerView() {
        return this.zze;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onDestroy() {
        com.google.android.gms.ads.mediation.customevent.CustomEventBanner customEventBanner = this.zzb;
        if (customEventBanner != null) {
            customEventBanner.onDestroy();
        }
        com.google.android.gms.ads.mediation.customevent.CustomEventInterstitial customEventInterstitial = this.zzc;
        if (customEventInterstitial != null) {
            customEventInterstitial.onDestroy();
        }
        com.google.android.gms.ads.mediation.customevent.CustomEventNative customEventNative = this.zzd;
        if (customEventNative != null) {
            customEventNative.onDestroy();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onPause() {
        com.google.android.gms.ads.mediation.customevent.CustomEventBanner customEventBanner = this.zzb;
        if (customEventBanner != null) {
            customEventBanner.onPause();
        }
        com.google.android.gms.ads.mediation.customevent.CustomEventInterstitial customEventInterstitial = this.zzc;
        if (customEventInterstitial != null) {
            customEventInterstitial.onPause();
        }
        com.google.android.gms.ads.mediation.customevent.CustomEventNative customEventNative = this.zzd;
        if (customEventNative != null) {
            customEventNative.onPause();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onResume() {
        com.google.android.gms.ads.mediation.customevent.CustomEventBanner customEventBanner = this.zzb;
        if (customEventBanner != null) {
            customEventBanner.onResume();
        }
        com.google.android.gms.ads.mediation.customevent.CustomEventInterstitial customEventInterstitial = this.zzc;
        if (customEventInterstitial != null) {
            customEventInterstitial.onResume();
        }
        com.google.android.gms.ads.mediation.customevent.CustomEventNative customEventNative = this.zzd;
        if (customEventNative != null) {
            customEventNative.onResume();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public void requestBannerAd(android.content.Context context, com.google.android.gms.ads.mediation.MediationBannerListener mediationBannerListener, android.os.Bundle bundle, com.google.android.gms.ads.AdSize adSize, com.google.android.gms.ads.mediation.MediationAdRequest mediationAdRequest, android.os.Bundle bundle2) {
        com.google.android.gms.ads.mediation.customevent.CustomEventBanner customEventBanner = (com.google.android.gms.ads.mediation.customevent.CustomEventBanner) zzb(com.google.android.gms.ads.mediation.customevent.CustomEventBanner.class, bundle.getString("class_name"));
        this.zzb = customEventBanner;
        if (customEventBanner == null) {
            mediationBannerListener.onAdFailedToLoad(this, zza);
            return;
        }
        android.os.Bundle bundle3 = bundle2 == null ? null : bundle2.getBundle(bundle.getString("class_name"));
        com.google.android.gms.ads.mediation.customevent.CustomEventBanner customEventBanner2 = this.zzb;
        customEventBanner2.getClass();
        customEventBanner2.requestBannerAd(context, new com.google.android.gms.ads.mediation.customevent.zza(this, mediationBannerListener), bundle.getString(com.google.android.gms.ads.mediation.MediationConfiguration.CUSTOM_EVENT_SERVER_PARAMETER_FIELD), adSize, mediationAdRequest, bundle3);
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void requestInterstitialAd(android.content.Context context, com.google.android.gms.ads.mediation.MediationInterstitialListener mediationInterstitialListener, android.os.Bundle bundle, com.google.android.gms.ads.mediation.MediationAdRequest mediationAdRequest, android.os.Bundle bundle2) {
        com.google.android.gms.ads.mediation.customevent.CustomEventInterstitial customEventInterstitial = (com.google.android.gms.ads.mediation.customevent.CustomEventInterstitial) zzb(com.google.android.gms.ads.mediation.customevent.CustomEventInterstitial.class, bundle.getString("class_name"));
        this.zzc = customEventInterstitial;
        if (customEventInterstitial == null) {
            mediationInterstitialListener.onAdFailedToLoad(this, zza);
            return;
        }
        android.os.Bundle bundle3 = bundle2 == null ? null : bundle2.getBundle(bundle.getString("class_name"));
        com.google.android.gms.ads.mediation.customevent.CustomEventInterstitial customEventInterstitial2 = this.zzc;
        customEventInterstitial2.getClass();
        customEventInterstitial2.requestInterstitialAd(context, new com.google.android.gms.ads.mediation.customevent.zzb(this, this, mediationInterstitialListener), bundle.getString(com.google.android.gms.ads.mediation.MediationConfiguration.CUSTOM_EVENT_SERVER_PARAMETER_FIELD), mediationAdRequest, bundle3);
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void requestNativeAd(android.content.Context context, com.google.android.gms.ads.mediation.MediationNativeListener mediationNativeListener, android.os.Bundle bundle, com.google.android.gms.ads.mediation.NativeMediationAdRequest nativeMediationAdRequest, android.os.Bundle bundle2) {
        com.google.android.gms.ads.mediation.customevent.CustomEventNative customEventNative = (com.google.android.gms.ads.mediation.customevent.CustomEventNative) zzb(com.google.android.gms.ads.mediation.customevent.CustomEventNative.class, bundle.getString("class_name"));
        this.zzd = customEventNative;
        if (customEventNative == null) {
            mediationNativeListener.onAdFailedToLoad(this, zza);
            return;
        }
        android.os.Bundle bundle3 = bundle2 == null ? null : bundle2.getBundle(bundle.getString("class_name"));
        com.google.android.gms.ads.mediation.customevent.CustomEventNative customEventNative2 = this.zzd;
        customEventNative2.getClass();
        customEventNative2.requestNativeAd(context, new com.google.android.gms.ads.mediation.customevent.zzc(this, mediationNativeListener), bundle.getString(com.google.android.gms.ads.mediation.MediationConfiguration.CUSTOM_EVENT_SERVER_PARAMETER_FIELD), nativeMediationAdRequest, bundle3);
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void showInterstitial() {
        com.google.android.gms.ads.mediation.customevent.CustomEventInterstitial customEventInterstitial = this.zzc;
        if (customEventInterstitial != null) {
            customEventInterstitial.showInterstitial();
        }
    }

    private static java.lang.Object zzb(java.lang.Class cls, java.lang.String str) {
        str.getClass();
        try {
            return cls.cast(java.lang.Class.forName(str).getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]));
        } catch (java.lang.Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not instantiate custom event adapter: " + str + ". " + th.getMessage());
            return null;
        }
    }
}
