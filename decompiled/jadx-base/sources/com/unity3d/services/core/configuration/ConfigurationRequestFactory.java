package com.unity3d.services.core.configuration;

/* JADX INFO: loaded from: classes6.dex */
public class ConfigurationRequestFactory {
    private final com.unity3d.services.core.configuration.Configuration _configuration;
    private final com.unity3d.services.core.device.reader.IDeviceInfoDataContainer _deviceInfoDataContainer;

    public ConfigurationRequestFactory(com.unity3d.services.core.configuration.Configuration configuration) {
        this(configuration, null);
    }

    public ConfigurationRequestFactory(com.unity3d.services.core.configuration.Configuration configuration, com.unity3d.services.core.device.reader.IDeviceInfoDataContainer iDeviceInfoDataContainer) {
        this._configuration = configuration;
        this._deviceInfoDataContainer = iDeviceInfoDataContainer;
    }

    public com.unity3d.services.core.configuration.Configuration getConfiguration() {
        return this._configuration;
    }

    public com.unity3d.services.core.request.WebRequest getWebRequest() throws java.net.MalformedURLException {
        java.lang.String configUrl = this._configuration.getConfigUrl();
        if (configUrl == null) {
            throw new java.net.MalformedURLException("Base URL is null");
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(configUrl);
        java.util.HashMap map = new java.util.HashMap();
        map.put(com.google.common.net.HttpHeaders.CONTENT_ENCODING, java.util.Collections.singletonList("gzip"));
        com.unity3d.services.core.request.WebRequest webRequest = new com.unity3d.services.core.request.WebRequest(sb.toString(), "POST", map);
        com.unity3d.services.core.device.reader.IDeviceInfoDataContainer iDeviceInfoDataContainer = this._deviceInfoDataContainer;
        webRequest.setBody(iDeviceInfoDataContainer != null ? iDeviceInfoDataContainer.getDeviceData() : null);
        com.unity3d.services.core.log.DeviceLog.debug("Requesting configuration with: " + ((java.lang.Object) sb));
        return webRequest;
    }
}
