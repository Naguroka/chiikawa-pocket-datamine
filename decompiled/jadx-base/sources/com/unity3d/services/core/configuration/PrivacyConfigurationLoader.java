package com.unity3d.services.core.configuration;

/* JADX INFO: loaded from: classes6.dex */
public class PrivacyConfigurationLoader implements com.unity3d.services.core.configuration.IConfigurationLoader {
    private final com.unity3d.services.core.configuration.IConfigurationLoader _configurationLoader;
    private final com.unity3d.services.core.configuration.ConfigurationRequestFactory _configurationRequestFactory;
    private final com.unity3d.services.core.network.core.HttpClient _httpClient;
    private final com.unity3d.services.core.configuration.PrivacyConfigStorage _privacyConfigStorage;

    public PrivacyConfigurationLoader(com.unity3d.services.core.configuration.IConfigurationLoader iConfigurationLoader, com.unity3d.services.core.configuration.ConfigurationRequestFactory configurationRequestFactory, com.unity3d.services.core.configuration.PrivacyConfigStorage privacyConfigStorage, com.unity3d.services.core.network.core.HttpClient httpClient) {
        this._configurationLoader = iConfigurationLoader;
        this._configurationRequestFactory = configurationRequestFactory;
        this._privacyConfigStorage = privacyConfigStorage;
        this._httpClient = httpClient;
    }

    @Override // com.unity3d.services.core.configuration.IConfigurationLoader
    public void loadConfiguration(com.unity3d.services.core.configuration.IConfigurationLoaderListener iConfigurationLoaderListener) throws java.lang.Exception {
        final java.util.concurrent.atomic.AtomicBoolean atomicBoolean = new java.util.concurrent.atomic.AtomicBoolean(false);
        if (this._privacyConfigStorage.getPrivacyConfig().getPrivacyStatus() == com.unity3d.services.core.configuration.PrivacyConfigStatus.UNKNOWN) {
            load(new com.unity3d.services.core.configuration.IPrivacyConfigurationListener() { // from class: com.unity3d.services.core.configuration.PrivacyConfigurationLoader.1
                @Override // com.unity3d.services.core.configuration.IPrivacyConfigurationListener
                public void onSuccess(com.unity3d.services.core.configuration.PrivacyConfig privacyConfig) {
                    com.unity3d.services.core.configuration.PrivacyConfigurationLoader.this._privacyConfigStorage.setPrivacyConfig(privacyConfig);
                }

                @Override // com.unity3d.services.core.configuration.IPrivacyConfigurationListener
                public void onError(com.unity3d.services.core.configuration.PrivacyCallError privacyCallError, java.lang.String str) {
                    com.unity3d.services.core.log.DeviceLog.warning("Couldn't fetch privacy configuration: " + str);
                    com.unity3d.services.core.configuration.PrivacyConfigurationLoader.this._privacyConfigStorage.setPrivacyConfig(new com.unity3d.services.core.configuration.PrivacyConfig());
                    if (privacyCallError == com.unity3d.services.core.configuration.PrivacyCallError.LOCKED_423) {
                        atomicBoolean.set(true);
                    }
                }
            });
        }
        if (atomicBoolean.get()) {
            throw new com.unity3d.services.core.extensions.AbortRetryException("Game is disabled");
        }
        this._configurationLoader.loadConfiguration(iConfigurationLoaderListener);
    }

    @Override // com.unity3d.services.core.configuration.IConfigurationLoader
    public com.unity3d.services.core.configuration.Configuration getLocalConfiguration() {
        return this._configurationLoader.getLocalConfiguration();
    }

    private void load(com.unity3d.services.core.configuration.IPrivacyConfigurationListener iPrivacyConfigurationListener) throws java.lang.Exception {
        try {
            com.unity3d.services.core.network.model.HttpRequest httpRequest = com.unity3d.services.core.network.mapper.WebRequestToHttpRequestKt.toHttpRequest(this._configurationRequestFactory.getWebRequest());
            com.unity3d.services.core.configuration.InitializeEventsMetricSender.getInstance().didPrivacyConfigRequestStart();
            com.unity3d.services.core.network.model.HttpResponse httpResponseExecuteBlocking = this._httpClient.executeBlocking(httpRequest);
            try {
                if (httpResponseExecuteBlocking.getStatusCode() / 100 == 2) {
                    com.unity3d.services.core.configuration.InitializeEventsMetricSender.getInstance().didPrivacyConfigRequestEnd(true);
                    iPrivacyConfigurationListener.onSuccess(new com.unity3d.services.core.configuration.PrivacyConfig(new org.json.JSONObject(httpResponseExecuteBlocking.getBody().toString())));
                } else if (httpResponseExecuteBlocking.getStatusCode() == 423) {
                    com.unity3d.services.core.configuration.InitializeEventsMetricSender.getInstance().didPrivacyConfigRequestEnd(false);
                    iPrivacyConfigurationListener.onError(com.unity3d.services.core.configuration.PrivacyCallError.LOCKED_423, "Game ID is disabled " + com.unity3d.services.core.properties.ClientProperties.getGameId());
                } else {
                    com.unity3d.services.core.configuration.InitializeEventsMetricSender.getInstance().didPrivacyConfigRequestEnd(false);
                    iPrivacyConfigurationListener.onError(com.unity3d.services.core.configuration.PrivacyCallError.NETWORK_ISSUE, "Privacy request failed with code: " + httpResponseExecuteBlocking.getStatusCode());
                }
            } catch (java.lang.Exception unused) {
                com.unity3d.services.core.configuration.InitializeEventsMetricSender.getInstance().didPrivacyConfigRequestEnd(false);
                iPrivacyConfigurationListener.onError(com.unity3d.services.core.configuration.PrivacyCallError.NETWORK_ISSUE, "Could not create web request");
            }
        } catch (java.lang.Exception e) {
            iPrivacyConfigurationListener.onError(com.unity3d.services.core.configuration.PrivacyCallError.NETWORK_ISSUE, "Could not create web request: " + e);
        }
    }
}
