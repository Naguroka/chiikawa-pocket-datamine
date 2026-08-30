package com.google.ads.mediation.ironsource;

/* JADX INFO: loaded from: classes4.dex */
public class IronSourceInterstitialAd implements com.google.android.gms.ads.mediation.MediationInterstitialAd {
    static final java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.ref.WeakReference<com.google.ads.mediation.ironsource.IronSourceInterstitialAd>> availableInterstitialInstances = new java.util.concurrent.ConcurrentHashMap<>();
    private static final com.google.ads.mediation.ironsource.IronSourceInterstitialAdListener ironSourceInterstitialListener = new com.google.ads.mediation.ironsource.IronSourceInterstitialAdListener();
    private final android.content.Context context;
    private final java.lang.String instanceID;
    private com.google.android.gms.ads.mediation.MediationInterstitialAdCallback interstitialAdCallback;
    private final com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationInterstitialAd, com.google.android.gms.ads.mediation.MediationInterstitialAdCallback> mediationAdLoadCallback;

    public IronSourceInterstitialAd(com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationInterstitialAd, com.google.android.gms.ads.mediation.MediationInterstitialAdCallback> mediationAdLoadCallback) {
        this.instanceID = mediationInterstitialAdConfiguration.getServerParameters().getString("instanceId", "0");
        this.context = mediationInterstitialAdConfiguration.getContext();
        this.mediationAdLoadCallback = mediationAdLoadCallback;
    }

    static com.google.ads.mediation.ironsource.IronSourceInterstitialAd getFromAvailableInstances(java.lang.String str) {
        java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.ref.WeakReference<com.google.ads.mediation.ironsource.IronSourceInterstitialAd>> concurrentHashMap = availableInterstitialInstances;
        if (concurrentHashMap.containsKey(str)) {
            return concurrentHashMap.get(str).get();
        }
        return null;
    }

    static void removeFromAvailableInstances(java.lang.String str) {
        availableInterstitialInstances.remove(str);
    }

    static com.google.ads.mediation.ironsource.IronSourceInterstitialAdListener getIronSourceInterstitialListener() {
        return ironSourceInterstitialListener;
    }

    com.google.android.gms.ads.mediation.MediationInterstitialAdCallback getInterstitialAdCallback() {
        return this.interstitialAdCallback;
    }

    void setInterstitialAdCallback(com.google.android.gms.ads.mediation.MediationInterstitialAdCallback mediationInterstitialAdCallback) {
        this.interstitialAdCallback = mediationInterstitialAdCallback;
    }

    public com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationInterstitialAd, com.google.android.gms.ads.mediation.MediationInterstitialAdCallback> getMediationAdLoadCallback() {
        return this.mediationAdLoadCallback;
    }

    public void loadWaterfallAd() {
        if (loadValidConfig()) {
            com.json.mediationsdk.IronSource.loadISDemandOnlyInterstitial((android.app.Activity) this.context, this.instanceID);
        }
    }

    private boolean loadValidConfig() {
        if (!isParamsValid()) {
            return false;
        }
        availableInterstitialInstances.put(this.instanceID, new java.lang.ref.WeakReference<>(this));
        android.util.Log.d(com.google.ads.mediation.ironsource.IronSourceConstants.TAG, java.lang.String.format("Loading IronSource interstitial ad with instance ID: %s", this.instanceID));
        return true;
    }

    private boolean isParamsValid() {
        com.google.android.gms.ads.AdError adErrorValidateIronSourceAdLoadParams = com.google.ads.mediation.ironsource.IronSourceAdapterUtils.validateIronSourceAdLoadParams(this.context, this.instanceID);
        if (adErrorValidateIronSourceAdLoadParams != null) {
            onAdFailedToLoad(adErrorValidateIronSourceAdLoadParams);
            return false;
        }
        if (com.google.ads.mediation.ironsource.IronSourceAdapterUtils.canLoadIronSourceAdInstance(this.instanceID, availableInterstitialInstances)) {
            return true;
        }
        onAdFailedToLoad(new com.google.android.gms.ads.AdError(103, java.lang.String.format("An IronSource interstitial ad is already loading for instance ID: %s", this.instanceID), "com.google.ads.mediation.ironsource"));
        return false;
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAd
    public void showAd(android.content.Context context) {
        com.json.mediationsdk.IronSource.showISDemandOnlyInterstitial(this.instanceID);
    }

    private void onAdFailedToLoad(com.google.android.gms.ads.AdError adError) {
        android.util.Log.e(com.google.ads.mediation.ironsource.IronSourceConstants.TAG, adError.toString());
        com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationInterstitialAd, com.google.android.gms.ads.mediation.MediationInterstitialAdCallback> mediationAdLoadCallback = this.mediationAdLoadCallback;
        if (mediationAdLoadCallback != null) {
            mediationAdLoadCallback.onFailure(adError);
        }
    }
}
