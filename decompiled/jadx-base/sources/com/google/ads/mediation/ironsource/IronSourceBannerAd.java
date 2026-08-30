package com.google.ads.mediation.ironsource;

/* JADX INFO: loaded from: classes4.dex */
public class IronSourceBannerAd implements com.google.android.gms.ads.mediation.MediationBannerAd {
    static final java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.ref.WeakReference<com.google.ads.mediation.ironsource.IronSourceBannerAd>> availableBannerInstances = new java.util.concurrent.ConcurrentHashMap<>();
    private static final com.google.ads.mediation.ironsource.IronSourceBannerAdListener ironSourceBannerListener = new com.google.ads.mediation.ironsource.IronSourceBannerAdListener();
    private final com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationBannerAd, com.google.android.gms.ads.mediation.MediationBannerAdCallback> adLoadCallback;
    private final com.google.android.gms.ads.AdSize adSize;
    private com.google.android.gms.ads.mediation.MediationBannerAdCallback bannerAdCallback;
    private com.json.mediationsdk.ISBannerSize bannerSizeIronSource;
    private final android.content.Context context;
    private final java.lang.String instanceID;
    private android.widget.FrameLayout ironSourceAdView;
    private com.json.mediationsdk.demandOnly.ISDemandOnlyBannerLayout ironSourceBannerLayout;

    public IronSourceBannerAd(com.google.android.gms.ads.mediation.MediationBannerAdConfiguration mediationBannerAdConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationBannerAd, com.google.android.gms.ads.mediation.MediationBannerAdCallback> mediationAdLoadCallback) {
        this.instanceID = mediationBannerAdConfiguration.getServerParameters().getString("instanceId", "0");
        this.context = mediationBannerAdConfiguration.getContext();
        this.adSize = mediationBannerAdConfiguration.getAdSize();
        this.adLoadCallback = mediationAdLoadCallback;
    }

    com.google.android.gms.ads.mediation.MediationBannerAdCallback getBannerAdCallback() {
        return this.bannerAdCallback;
    }

    com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationBannerAd, com.google.android.gms.ads.mediation.MediationBannerAdCallback> getAdLoadCallback() {
        return this.adLoadCallback;
    }

    void setBannerAdCallback(com.google.android.gms.ads.mediation.MediationBannerAdCallback mediationBannerAdCallback) {
        this.bannerAdCallback = mediationBannerAdCallback;
    }

    com.json.mediationsdk.demandOnly.ISDemandOnlyBannerLayout getIronSourceBannerLayout() {
        return this.ironSourceBannerLayout;
    }

    android.widget.FrameLayout getIronSourceAdView() {
        return this.ironSourceAdView;
    }

    static com.google.ads.mediation.ironsource.IronSourceBannerAd getFromAvailableInstances(java.lang.String str) {
        java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.ref.WeakReference<com.google.ads.mediation.ironsource.IronSourceBannerAd>> concurrentHashMap = availableBannerInstances;
        if (concurrentHashMap.containsKey(str)) {
            return concurrentHashMap.get(str).get();
        }
        return null;
    }

    static void removeFromAvailableInstances(java.lang.String str) {
        availableBannerInstances.remove(str);
    }

    static void clearAllAvailableInstancesExceptOne(java.lang.String str) {
        for (java.lang.String str2 : availableBannerInstances.keySet()) {
            if (!str2.equals(str)) {
                android.util.Log.d(com.google.ads.mediation.ironsource.IronSourceConstants.TAG, java.lang.String.format("IronSource Banner Destroy ad with instance ID: %s", str2));
                com.json.mediationsdk.IronSource.destroyISDemandOnlyBanner(str2);
                removeFromAvailableInstances(str2);
            }
        }
    }

    public void loadAd() {
        if (isParamsValid()) {
            android.app.Activity activity = (android.app.Activity) this.context;
            availableBannerInstances.put(this.instanceID, new java.lang.ref.WeakReference<>(this));
            this.ironSourceAdView = new android.widget.FrameLayout(this.context);
            com.json.mediationsdk.demandOnly.ISDemandOnlyBannerLayout iSDemandOnlyBannerLayoutCreateBannerForDemandOnly = com.json.mediationsdk.IronSource.createBannerForDemandOnly(activity, this.bannerSizeIronSource);
            this.ironSourceBannerLayout = iSDemandOnlyBannerLayoutCreateBannerForDemandOnly;
            iSDemandOnlyBannerLayoutCreateBannerForDemandOnly.setBannerDemandOnlyListener(ironSourceBannerListener);
            android.util.Log.d(com.google.ads.mediation.ironsource.IronSourceConstants.TAG, java.lang.String.format("Loading IronSource banner ad with instance ID: %s", this.instanceID));
            com.json.mediationsdk.IronSource.loadISDemandOnlyBanner(activity, this.ironSourceBannerLayout, this.instanceID);
        }
    }

    private boolean isParamsValid() {
        com.google.android.gms.ads.AdError adErrorValidateIronSourceAdLoadParams = com.google.ads.mediation.ironsource.IronSourceAdapterUtils.validateIronSourceAdLoadParams(this.context, this.instanceID);
        if (adErrorValidateIronSourceAdLoadParams != null) {
            onAdFailedToLoad(adErrorValidateIronSourceAdLoadParams);
            return false;
        }
        if (!com.google.ads.mediation.ironsource.IronSourceAdapterUtils.canLoadIronSourceAdInstance(this.instanceID, availableBannerInstances)) {
            onAdFailedToLoad(new com.google.android.gms.ads.AdError(103, "An IronSource banner is already loaded for instance ID: " + this.instanceID, "com.google.ads.mediation.ironsource"));
            return false;
        }
        com.json.mediationsdk.ISBannerSize iSBannerSizeFromGoogleAdSize = com.google.ads.mediation.ironsource.IronSourceAdapterUtils.getISBannerSizeFromGoogleAdSize(this.context, this.adSize);
        this.bannerSizeIronSource = iSBannerSizeFromGoogleAdSize;
        if (iSBannerSizeFromGoogleAdSize != null) {
            return true;
        }
        onAdFailedToLoad(new com.google.android.gms.ads.AdError(105, "There is no matching IronSource banner ad size for Google ad size: " + this.adSize, "com.google.ads.mediation.ironsource"));
        return false;
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAd
    public android.view.View getView() {
        return this.ironSourceAdView;
    }

    private void onAdFailedToLoad(com.google.android.gms.ads.AdError adError) {
        android.util.Log.w(com.google.ads.mediation.ironsource.IronSourceConstants.TAG, adError.toString());
        com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationBannerAd, com.google.android.gms.ads.mediation.MediationBannerAdCallback> mediationAdLoadCallback = this.adLoadCallback;
        if (mediationAdLoadCallback != null) {
            mediationAdLoadCallback.onFailure(adError);
        }
    }
}
