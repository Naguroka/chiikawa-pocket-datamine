package com.applovin.mediation.adapter;

/* JADX INFO: loaded from: classes3.dex */
public interface MaxAdapter {

    public enum InitializationStatus {
        NOT_INITIALIZED(-4),
        DOES_NOT_APPLY(-3),
        INITIALIZING(-2),
        INITIALIZED_UNKNOWN(-1),
        INITIALIZED_FAILURE(0),
        INITIALIZED_SUCCESS(1);

        private final int code;

        InitializationStatus(int i) {
            this.code = i;
        }

        public int getCode() {
            return this.code;
        }
    }

    public interface OnCompletionListener {
        void onCompletion(com.applovin.mediation.adapter.MaxAdapter.InitializationStatus initializationStatus, java.lang.String str);
    }

    java.lang.String getAdapterVersion();

    java.lang.String getSdkVersion();

    void initialize(com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters maxAdapterInitializationParameters, android.app.Activity activity, com.applovin.mediation.adapter.MaxAdapter.OnCompletionListener onCompletionListener);

    boolean isBeta();

    void onDestroy();

    java.lang.Boolean shouldCollectSignalsOnUiThread();

    java.lang.Boolean shouldInitializeOnUiThread();

    java.lang.Boolean shouldLoadAdsOnUiThread(com.applovin.mediation.MaxAdFormat maxAdFormat);

    java.lang.Boolean shouldShowAdsOnUiThread(com.applovin.mediation.MaxAdFormat maxAdFormat);
}
