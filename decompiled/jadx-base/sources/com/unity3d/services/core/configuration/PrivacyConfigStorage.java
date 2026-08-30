package com.unity3d.services.core.configuration;

/* JADX INFO: loaded from: classes6.dex */
public class PrivacyConfigStorage extends com.unity3d.services.core.misc.Observable<com.unity3d.services.core.configuration.PrivacyConfig> {
    private static com.unity3d.services.core.configuration.PrivacyConfigStorage _instance;
    private com.unity3d.services.core.configuration.PrivacyConfig _privacyConfig = new com.unity3d.services.core.configuration.PrivacyConfig();

    private PrivacyConfigStorage() {
    }

    public static com.unity3d.services.core.configuration.PrivacyConfigStorage getInstance() {
        if (_instance == null) {
            _instance = new com.unity3d.services.core.configuration.PrivacyConfigStorage();
        }
        return _instance;
    }

    public synchronized com.unity3d.services.core.configuration.PrivacyConfig getPrivacyConfig() {
        return this._privacyConfig;
    }

    @Override // com.unity3d.services.core.misc.Observable
    public synchronized void registerObserver(com.unity3d.services.core.misc.IObserver<com.unity3d.services.core.configuration.PrivacyConfig> iObserver) {
        super.registerObserver(iObserver);
        if (this._privacyConfig.getPrivacyStatus() != com.unity3d.services.core.configuration.PrivacyConfigStatus.UNKNOWN) {
            iObserver.updated(this._privacyConfig);
        }
    }

    public synchronized void setPrivacyConfig(com.unity3d.services.core.configuration.PrivacyConfig privacyConfig) {
        this._privacyConfig = privacyConfig;
        notifyObservers(privacyConfig);
    }
}
