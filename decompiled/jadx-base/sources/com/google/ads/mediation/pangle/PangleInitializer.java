package com.google.ads.mediation.pangle;

/* JADX INFO: loaded from: classes4.dex */
public class PangleInitializer implements com.bytedance.sdk.openadsdk.api.init.PAGSdk.PAGInitCallback {
    private static com.google.ads.mediation.pangle.PangleInitializer instance;
    private final java.util.ArrayList<com.google.ads.mediation.pangle.PangleInitializer.Listener> initListeners;
    private boolean isInitialized;
    private boolean isInitializing;
    private final com.google.ads.mediation.pangle.PangleFactory pangleFactory;
    private final com.google.ads.mediation.pangle.PangleSdkWrapper pangleSdkWrapper;

    public interface Listener {
        void onInitializeError(com.google.android.gms.ads.AdError adError);

        void onInitializeSuccess();
    }

    public static com.google.ads.mediation.pangle.PangleInitializer getInstance() {
        if (instance == null) {
            instance = new com.google.ads.mediation.pangle.PangleInitializer();
        }
        return instance;
    }

    private PangleInitializer() {
        this.isInitializing = false;
        this.isInitialized = false;
        this.initListeners = new java.util.ArrayList<>();
        this.pangleSdkWrapper = new com.google.ads.mediation.pangle.PangleSdkWrapper();
        this.pangleFactory = new com.google.ads.mediation.pangle.PangleFactory();
    }

    public PangleInitializer(com.google.ads.mediation.pangle.PangleSdkWrapper pangleSdkWrapper, com.google.ads.mediation.pangle.PangleFactory pangleFactory) {
        this.isInitializing = false;
        this.isInitialized = false;
        this.initListeners = new java.util.ArrayList<>();
        this.pangleSdkWrapper = pangleSdkWrapper;
        this.pangleFactory = pangleFactory;
    }

    public void initialize(android.content.Context context, java.lang.String str, com.google.ads.mediation.pangle.PangleInitializer.Listener listener) {
        if (android.text.TextUtils.isEmpty(str)) {
            com.google.android.gms.ads.AdError adErrorCreateAdapterError = com.google.ads.mediation.pangle.PangleConstants.createAdapterError(101, "Failed to initialize Pangle SDK. Missing or invalid App ID.");
            android.util.Log.w(com.google.ads.mediation.pangle.PangleMediationAdapter.TAG, adErrorCreateAdapterError.toString());
            listener.onInitializeError(adErrorCreateAdapterError);
        } else if (this.isInitializing) {
            this.initListeners.add(listener);
        } else {
            if (this.isInitialized) {
                listener.onInitializeSuccess();
                return;
            }
            this.isInitializing = true;
            this.initListeners.add(listener);
            this.pangleSdkWrapper.init(context, this.pangleFactory.createPAGConfigBuilder().appId(str).setChildDirected(com.google.ads.mediation.pangle.PanglePrivacyConfig.getCoppa()).setGDPRConsent(com.google.ads.mediation.pangle.PangleMediationAdapter.getGDPRConsent()).setDoNotSell(com.google.ads.mediation.pangle.PangleMediationAdapter.getDoNotSell()).setUserData(java.lang.String.format("[{\"name\":\"mediation\",\"value\":\"google\"},{\"name\":\"adapter_version\",\"value\":\"%s\"}]", com.google.ads.mediation.pangle.BuildConfig.ADAPTER_VERSION)).build(), this);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.init.PAGSdk.PAGInitCallback
    public void success() {
        this.isInitializing = false;
        this.isInitialized = true;
        java.util.Iterator<com.google.ads.mediation.pangle.PangleInitializer.Listener> it = this.initListeners.iterator();
        while (it.hasNext()) {
            it.next().onInitializeSuccess();
        }
        this.initListeners.clear();
    }

    @Override // com.bytedance.sdk.openadsdk.api.init.PAGSdk.PAGInitCallback
    public void fail(int i, java.lang.String str) {
        this.isInitializing = false;
        this.isInitialized = false;
        com.google.android.gms.ads.AdError adErrorCreateSdkError = com.google.ads.mediation.pangle.PangleConstants.createSdkError(i, str);
        java.util.Iterator<com.google.ads.mediation.pangle.PangleInitializer.Listener> it = this.initListeners.iterator();
        while (it.hasNext()) {
            it.next().onInitializeError(adErrorCreateSdkError);
        }
        this.initListeners.clear();
    }
}
