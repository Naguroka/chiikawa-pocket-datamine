package com.google.ads.mediation.ironsource;

/* JADX INFO: loaded from: classes4.dex */
public class IronSourceRewardedAd implements com.google.android.gms.ads.mediation.MediationRewardedAd {
    static final java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.ref.WeakReference<com.google.ads.mediation.ironsource.IronSourceRewardedAd>> availableInstances = new java.util.concurrent.ConcurrentHashMap<>();
    private static final com.google.ads.mediation.ironsource.IronSourceRewardedAdListener ironSourceRewardedListener = new com.google.ads.mediation.ironsource.IronSourceRewardedAdListener();
    private final android.content.Context context;
    private final java.lang.String instanceID;
    private final com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationRewardedAd, com.google.android.gms.ads.mediation.MediationRewardedAdCallback> mediationAdLoadCallback;
    private com.google.android.gms.ads.mediation.MediationRewardedAdCallback mediationRewardedAdCallback;

    public IronSourceRewardedAd(com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration mediationRewardedAdConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationRewardedAd, com.google.android.gms.ads.mediation.MediationRewardedAdCallback> mediationAdLoadCallback) {
        this.instanceID = mediationRewardedAdConfiguration.getServerParameters().getString("instanceId", "0");
        this.context = mediationRewardedAdConfiguration.getContext();
        this.mediationAdLoadCallback = mediationAdLoadCallback;
    }

    static com.google.ads.mediation.ironsource.IronSourceRewardedAd getFromAvailableInstances(java.lang.String str) {
        java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.ref.WeakReference<com.google.ads.mediation.ironsource.IronSourceRewardedAd>> concurrentHashMap = availableInstances;
        if (concurrentHashMap.containsKey(str)) {
            return concurrentHashMap.get(str).get();
        }
        return null;
    }

    static void removeFromAvailableInstances(java.lang.String str) {
        availableInstances.remove(str);
    }

    static com.google.ads.mediation.ironsource.IronSourceRewardedAdListener getIronSourceRewardedListener() {
        return ironSourceRewardedListener;
    }

    com.google.android.gms.ads.mediation.MediationRewardedAdCallback getRewardedAdCallback() {
        return this.mediationRewardedAdCallback;
    }

    void setRewardedAdCallback(com.google.android.gms.ads.mediation.MediationRewardedAdCallback mediationRewardedAdCallback) {
        this.mediationRewardedAdCallback = mediationRewardedAdCallback;
    }

    public com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationRewardedAd, com.google.android.gms.ads.mediation.MediationRewardedAdCallback> getMediationAdLoadCallback() {
        return this.mediationAdLoadCallback;
    }

    private boolean loadValidConfig() {
        if (!isParamsValid()) {
            return false;
        }
        availableInstances.put(this.instanceID, new java.lang.ref.WeakReference<>(this));
        android.util.Log.d(com.google.ads.mediation.ironsource.IronSourceConstants.TAG, java.lang.String.format("Loading IronSource rewarded ad with instance ID: %s", this.instanceID));
        return true;
    }

    public void loadWaterfallAd() {
        if (loadValidConfig()) {
            com.json.mediationsdk.IronSource.loadISDemandOnlyRewardedVideo((android.app.Activity) this.context, this.instanceID);
        }
    }

    private boolean isParamsValid() {
        com.google.android.gms.ads.AdError adErrorValidateIronSourceAdLoadParams = com.google.ads.mediation.ironsource.IronSourceAdapterUtils.validateIronSourceAdLoadParams(this.context, this.instanceID);
        if (adErrorValidateIronSourceAdLoadParams != null) {
            onAdFailedToLoad(adErrorValidateIronSourceAdLoadParams);
            return false;
        }
        if (com.google.ads.mediation.ironsource.IronSourceAdapterUtils.canLoadIronSourceAdInstance(this.instanceID, availableInstances)) {
            return true;
        }
        onAdFailedToLoad(new com.google.android.gms.ads.AdError(103, java.lang.String.format("An IronSource Rewarded ad is already loading for instance ID: %s", this.instanceID), "com.google.ads.mediation.ironsource"));
        return false;
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public void showAd(android.content.Context context) {
        android.util.Log.d(com.google.ads.mediation.ironsource.IronSourceConstants.TAG, java.lang.String.format("Showing IronSource rewarded ad for instance ID: %s", this.instanceID));
        com.json.mediationsdk.IronSource.showISDemandOnlyRewardedVideo(this.instanceID);
    }

    private void onAdFailedToLoad(com.google.android.gms.ads.AdError adError) {
        android.util.Log.w(com.google.ads.mediation.ironsource.IronSourceConstants.TAG, adError.toString());
        this.mediationAdLoadCallback.onFailure(adError);
    }
}
