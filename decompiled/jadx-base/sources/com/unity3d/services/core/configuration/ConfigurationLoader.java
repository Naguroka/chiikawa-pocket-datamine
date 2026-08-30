package com.unity3d.services.core.configuration;

/* JADX INFO: loaded from: classes6.dex */
public class ConfigurationLoader implements com.unity3d.services.core.configuration.IConfigurationLoader {
    private final com.unity3d.services.core.configuration.ConfigurationRequestFactory _configurationRequestFactory;
    private final com.unity3d.services.core.network.core.HttpClient _httpClient;
    private final com.unity3d.services.core.configuration.Configuration _localConfiguration;
    private final com.unity3d.services.core.request.metrics.SDKMetricsSender _sdkMetricsSender;

    public ConfigurationLoader(com.unity3d.services.core.configuration.ConfigurationRequestFactory configurationRequestFactory, com.unity3d.services.core.request.metrics.SDKMetricsSender sDKMetricsSender, com.unity3d.services.core.network.core.HttpClient httpClient) {
        this._localConfiguration = configurationRequestFactory.getConfiguration();
        this._configurationRequestFactory = configurationRequestFactory;
        this._sdkMetricsSender = sDKMetricsSender;
        this._httpClient = httpClient;
    }

    @Override // com.unity3d.services.core.configuration.IConfigurationLoader
    public void loadConfiguration(com.unity3d.services.core.configuration.IConfigurationLoaderListener iConfigurationLoaderListener) throws java.lang.Exception {
        try {
            com.unity3d.services.core.network.model.HttpRequest httpRequest = com.unity3d.services.core.network.mapper.WebRequestToHttpRequestKt.toHttpRequest(this._configurationRequestFactory.getWebRequest());
            com.unity3d.services.core.configuration.InitializeEventsMetricSender.getInstance().didConfigRequestStart();
            com.unity3d.services.core.network.model.HttpResponse httpResponseExecuteBlocking = this._httpClient.executeBlocking(httpRequest);
            java.lang.String string = httpResponseExecuteBlocking.getBody().toString();
            if (!(httpResponseExecuteBlocking.getStatusCode() / 100 == 2)) {
                iConfigurationLoaderListener.onError("Non 2xx HTTP status received from ads configuration request.");
                return;
            }
            try {
                this._localConfiguration.handleConfigurationData(new org.json.JSONObject(string), true);
                sendConfigMetrics(this._localConfiguration.getUnifiedAuctionToken(), this._localConfiguration.getStateId());
                iConfigurationLoaderListener.onSuccess(this._localConfiguration);
            } catch (java.lang.Exception unused) {
                iConfigurationLoaderListener.onError("Could not create web request");
            }
        } catch (java.lang.Exception e) {
            iConfigurationLoaderListener.onError("Could not create web request: " + e);
        }
    }

    @Override // com.unity3d.services.core.configuration.IConfigurationLoader
    public com.unity3d.services.core.configuration.Configuration getLocalConfiguration() {
        return this._localConfiguration;
    }

    private void sendConfigMetrics(java.lang.String str, java.lang.String str2) {
        if (str == null || str.isEmpty()) {
            this._sdkMetricsSender.sendMetric(com.unity3d.services.core.request.metrics.TSIMetric.newMissingToken());
        }
        if (str2 == null || str2.isEmpty()) {
            this._sdkMetricsSender.sendMetric(com.unity3d.services.core.request.metrics.TSIMetric.newMissingStateId());
        }
    }
}
