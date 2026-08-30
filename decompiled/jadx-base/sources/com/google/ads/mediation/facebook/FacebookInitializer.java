package com.google.ads.mediation.facebook;

/* JADX INFO: loaded from: classes4.dex */
class FacebookInitializer implements com.facebook.ads.AudienceNetworkAds.InitListener {
    private static com.google.ads.mediation.facebook.FacebookInitializer instance;
    private boolean isInitializing = false;
    private boolean isInitialized = false;
    private final java.util.ArrayList<com.google.ads.mediation.facebook.FacebookInitializer.Listener> listeners = new java.util.ArrayList<>();

    interface Listener {
        void onInitializeError(com.google.android.gms.ads.AdError adError);

        void onInitializeSuccess();
    }

    static com.google.ads.mediation.facebook.FacebookInitializer getInstance() {
        if (instance == null) {
            instance = new com.google.ads.mediation.facebook.FacebookInitializer();
        }
        return instance;
    }

    private FacebookInitializer() {
    }

    void initialize(android.content.Context context, java.lang.String str, com.google.ads.mediation.facebook.FacebookInitializer.Listener listener) {
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
        arrayList.add(str);
        getInstance().initialize(context, arrayList, listener);
    }

    void initialize(android.content.Context context, java.util.ArrayList<java.lang.String> arrayList, com.google.ads.mediation.facebook.FacebookInitializer.Listener listener) {
        if (this.isInitializing) {
            this.listeners.add(listener);
        } else {
            if (this.isInitialized) {
                listener.onInitializeSuccess();
                return;
            }
            this.isInitializing = true;
            getInstance().listeners.add(listener);
            com.facebook.ads.AudienceNetworkAds.buildInitSettings(context).withMediationService("GOOGLE:6.18.0.0").withPlacementIds(arrayList).withInitListener(this).initialize();
        }
    }

    @Override // com.facebook.ads.AudienceNetworkAds.InitListener
    public void onInitialized(com.facebook.ads.AudienceNetworkAds.InitResult initResult) {
        this.isInitializing = false;
        this.isInitialized = initResult.isSuccess();
        for (com.google.ads.mediation.facebook.FacebookInitializer.Listener listener : this.listeners) {
            if (initResult.isSuccess()) {
                listener.onInitializeSuccess();
            } else {
                listener.onInitializeError(new com.google.android.gms.ads.AdError(104, initResult.getMessage(), "com.google.ads.mediation.facebook"));
            }
        }
        this.listeners.clear();
    }
}
