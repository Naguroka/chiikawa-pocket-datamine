package com.unity3d.services.core.configuration;

/* JADX INFO: loaded from: classes6.dex */
public class ConfigurationReader {
    private com.unity3d.services.core.configuration.Configuration _localConfiguration;

    public com.unity3d.services.core.configuration.Configuration getCurrentConfiguration() {
        if (getRemoteConfiguration() != null) {
            return getRemoteConfiguration();
        }
        com.unity3d.services.core.configuration.Configuration localConfiguration = getLocalConfiguration();
        return localConfiguration != null ? localConfiguration : new com.unity3d.services.core.configuration.Configuration();
    }

    private com.unity3d.services.core.configuration.Configuration getRemoteConfiguration() {
        if (com.unity3d.services.core.webview.WebViewApp.getCurrentApp() == null) {
            return null;
        }
        return com.unity3d.services.core.webview.WebViewApp.getCurrentApp().getConfiguration();
    }

    private com.unity3d.services.core.configuration.Configuration getLocalConfiguration() {
        com.unity3d.services.core.configuration.Configuration configuration = this._localConfiguration;
        if (configuration != null) {
            return configuration;
        }
        java.io.File file = new java.io.File(com.unity3d.services.core.properties.SdkProperties.getLocalConfigurationFilepath());
        if (file.exists()) {
            try {
                this._localConfiguration = new com.unity3d.services.core.configuration.Configuration(new org.json.JSONObject(new java.lang.String(com.unity3d.services.core.misc.Utilities.readFileBytes(file))));
            } catch (java.io.IOException | org.json.JSONException unused) {
                com.unity3d.services.core.log.DeviceLog.debug("Unable to read configuration from storage");
                this._localConfiguration = null;
            }
        }
        return this._localConfiguration;
    }
}
