package com.google.ads.mediation.applovin;

/* JADX INFO: loaded from: classes4.dex */
public class AppLovinInitializer {
    public static final int INITIALIZED = 2;
    public static final int INITIALIZING = 1;
    private static final java.lang.String TAG = "AppLovinInitializer";
    public static final int UNINITIALIZED = 0;
    private static com.google.ads.mediation.applovin.AppLovinInitializer instance;
    private final com.google.ads.mediation.applovin.AppLovinSdkWrapper appLovinSdkWrapper;
    private final java.util.HashMap<java.lang.String, java.lang.Integer> initializationStatus;
    private final java.util.HashMap<java.lang.String, java.util.ArrayList<com.google.ads.mediation.applovin.AppLovinInitializer.OnInitializeSuccessListener>> initializerListeners;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface InitializationStatus {
    }

    public interface OnInitializeSuccessListener {
        void onInitializeSuccess(java.lang.String str);
    }

    private AppLovinInitializer() {
        this.initializationStatus = new java.util.HashMap<>();
        this.initializerListeners = new java.util.HashMap<>();
        this.appLovinSdkWrapper = new com.google.ads.mediation.applovin.AppLovinSdkWrapper();
    }

    AppLovinInitializer(com.google.ads.mediation.applovin.AppLovinSdkWrapper appLovinSdkWrapper) {
        this.initializationStatus = new java.util.HashMap<>();
        this.initializerListeners = new java.util.HashMap<>();
        this.appLovinSdkWrapper = appLovinSdkWrapper;
    }

    public static com.google.ads.mediation.applovin.AppLovinInitializer getInstance() {
        if (instance == null) {
            instance = new com.google.ads.mediation.applovin.AppLovinInitializer();
        }
        return instance;
    }

    public void initialize(android.content.Context context, final java.lang.String str, com.google.ads.mediation.applovin.AppLovinInitializer.OnInitializeSuccessListener onInitializeSuccessListener) {
        if (!this.initializationStatus.containsKey(str)) {
            this.initializationStatus.put(str, 0);
            this.initializerListeners.put(str, new java.util.ArrayList<>());
        }
        java.lang.Integer num = 2;
        if (num.equals(this.initializationStatus.get(str))) {
            onInitializeSuccessListener.onInitializeSuccess(str);
            return;
        }
        this.initializerListeners.get(str).add(onInitializeSuccessListener);
        java.lang.Integer num2 = 1;
        if (num2.equals(this.initializationStatus.get(str))) {
            return;
        }
        this.initializationStatus.put(str, 1);
        android.util.Log.d(TAG, java.lang.String.format("Attempting to initialize SDK with SDK Key: %s", str));
        com.applovin.sdk.AppLovinSdk appLovinSdkWrapper = this.appLovinSdkWrapper.getInstance(str, this.appLovinSdkWrapper.getSdkSettings(context), context);
        appLovinSdkWrapper.setPluginVersion(com.applovin.mediation.BuildConfig.ADAPTER_VERSION);
        appLovinSdkWrapper.setMediationProvider(com.applovin.sdk.AppLovinMediationProvider.ADMOB);
        appLovinSdkWrapper.initializeSdk(new com.applovin.sdk.AppLovinSdk.SdkInitializationListener() { // from class: com.google.ads.mediation.applovin.AppLovinInitializer.1
            @Override // com.applovin.sdk.AppLovinSdk.SdkInitializationListener
            public void onSdkInitialized(com.applovin.sdk.AppLovinSdkConfiguration appLovinSdkConfiguration) {
                com.google.ads.mediation.applovin.AppLovinInitializer.this.initializationStatus.put(str, 2);
                java.util.ArrayList arrayList = (java.util.ArrayList) com.google.ads.mediation.applovin.AppLovinInitializer.this.initializerListeners.get(str);
                if (arrayList != null) {
                    java.util.Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((com.google.ads.mediation.applovin.AppLovinInitializer.OnInitializeSuccessListener) it.next()).onInitializeSuccess(str);
                    }
                    arrayList.clear();
                }
            }
        });
    }

    public com.applovin.sdk.AppLovinSdk retrieveSdk(android.os.Bundle bundle, android.content.Context context) {
        com.applovin.sdk.AppLovinSdk appLovinSdkWrapper;
        java.lang.String string = bundle != null ? bundle.getString(com.applovin.mediation.AppLovinUtils.ServerParameterKeys.SDK_KEY) : null;
        com.applovin.sdk.AppLovinSdkSettings sdkSettings = this.appLovinSdkWrapper.getSdkSettings(context);
        if (!android.text.TextUtils.isEmpty(string)) {
            appLovinSdkWrapper = this.appLovinSdkWrapper.getInstance(string, sdkSettings, context);
        } else {
            appLovinSdkWrapper = this.appLovinSdkWrapper.getInstance(sdkSettings, context);
        }
        appLovinSdkWrapper.setPluginVersion(com.applovin.mediation.BuildConfig.ADAPTER_VERSION);
        appLovinSdkWrapper.setMediationProvider(com.applovin.sdk.AppLovinMediationProvider.ADMOB);
        return appLovinSdkWrapper;
    }
}
