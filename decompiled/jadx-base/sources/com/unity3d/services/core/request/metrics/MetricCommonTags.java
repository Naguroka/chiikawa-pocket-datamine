package com.unity3d.services.core.request.metrics;

/* JADX INFO: loaded from: classes6.dex */
public class MetricCommonTags {
    private static final java.lang.String METRIC_COMMON_TAG_CONFIG_SOURCE = "src";
    private static final java.lang.String METRIC_COMMON_TAG_COUNTRY_ISO = "iso";
    private static final java.lang.String METRIC_COMMON_TAG_MEDIATION_ADAPTER = "m_ad_ver";
    private static final java.lang.String METRIC_COMMON_TAG_MEDIATION_NAME = "m_name";
    private static final java.lang.String METRIC_COMMON_TAG_MEDIATION_VERSION = "m_ver";
    private static final java.lang.String METRIC_COMMON_TAG_PLATFORM = "plt";
    public static final java.lang.String METRIC_COMMON_TAG_PLATFORM_ANDROID = "android";
    private static final java.lang.String METRIC_COMMON_TAG_PRIVACY_MODE = "prvc";
    private static final java.lang.String METRIC_COMMON_TAG_SDK_VERSION = "sdk";
    private static final java.lang.String METRIC_COMMON_TAG_SYSTEM_VERSION = "system";
    private static final java.lang.String METRIC_COMMON_TAG_TEST_MODE = "tm";
    private java.lang.String _configSrc;
    private final java.lang.String _countryISO;
    private java.util.Map<java.lang.String, java.lang.String> _experiments;
    private java.lang.String _mediationAdapter;
    private java.lang.String _mediationName;
    private java.lang.String _mediationVersion;
    private final java.lang.String _platform;
    private java.lang.String _privacyMode;
    private final com.unity3d.services.core.misc.IObserver<com.unity3d.services.core.configuration.PrivacyConfig> _privacyObserver;
    private final java.lang.String _sdkVersion;
    private final java.lang.String _systemVersion;
    private final boolean _testMode;

    public MetricCommonTags() {
        com.unity3d.services.core.misc.IObserver<com.unity3d.services.core.configuration.PrivacyConfig> iObserver = new com.unity3d.services.core.misc.IObserver<com.unity3d.services.core.configuration.PrivacyConfig>() { // from class: com.unity3d.services.core.request.metrics.MetricCommonTags.1
            @Override // com.unity3d.services.core.misc.IObserver
            public void updated(com.unity3d.services.core.configuration.PrivacyConfig privacyConfig) {
                com.unity3d.services.core.request.metrics.MetricCommonTags.this._privacyMode = privacyConfig.getPrivacyStatus().toString().toLowerCase();
            }
        };
        this._privacyObserver = iObserver;
        this._countryISO = com.unity3d.services.core.device.Device.getNetworkCountryISO();
        this._platform = "android";
        this._sdkVersion = com.unity3d.services.core.properties.SdkProperties.getVersionName();
        this._systemVersion = com.unity3d.services.core.device.Device.getOsVersion();
        this._privacyMode = com.unity3d.services.core.configuration.PrivacyConfigStorage.getInstance().getPrivacyConfig().getPrivacyStatus().toLowerCase();
        this._testMode = com.unity3d.services.core.properties.SdkProperties.isTestMode();
        com.unity3d.services.core.configuration.PrivacyConfigStorage.getInstance().registerObserver(iObserver);
    }

    public void updateWithConfig(com.unity3d.services.core.configuration.Configuration configuration) {
        this._configSrc = configuration.getSrc();
        if (configuration.getExperiments() != null) {
            this._experiments = configuration.getExperiments().getExperimentTags();
        }
    }

    public java.util.Map<java.lang.String, java.lang.String> toMap() {
        if (mediationIsEmpty()) {
            refreshMediationData();
        }
        java.util.HashMap map = new java.util.HashMap();
        java.lang.String str = this._countryISO;
        if (str != null) {
            map.put(METRIC_COMMON_TAG_COUNTRY_ISO, str);
        }
        java.lang.String str2 = this._platform;
        if (str2 != null) {
            map.put(METRIC_COMMON_TAG_PLATFORM, str2);
        }
        java.lang.String str3 = this._sdkVersion;
        if (str3 != null) {
            map.put("sdk", str3);
        }
        java.lang.String str4 = this._systemVersion;
        if (str4 != null) {
            map.put(METRIC_COMMON_TAG_SYSTEM_VERSION, str4);
        }
        java.lang.String str5 = this._privacyMode;
        if (str5 != null) {
            map.put(METRIC_COMMON_TAG_PRIVACY_MODE, str5);
        }
        java.lang.String str6 = this._configSrc;
        if (str6 != null) {
            map.put(METRIC_COMMON_TAG_CONFIG_SOURCE, str6);
        }
        java.lang.String str7 = this._mediationName;
        if (str7 != null) {
            map.put(METRIC_COMMON_TAG_MEDIATION_NAME, str7);
        }
        java.lang.String str8 = this._mediationVersion;
        if (str8 != null) {
            map.put(METRIC_COMMON_TAG_MEDIATION_VERSION, str8);
        }
        java.lang.String str9 = this._mediationAdapter;
        if (str9 != null) {
            map.put(METRIC_COMMON_TAG_MEDIATION_ADAPTER, str9);
        }
        java.util.Map<java.lang.String, java.lang.String> map2 = this._experiments;
        if (map2 != null) {
            map.putAll(map2);
        }
        map.put(METRIC_COMMON_TAG_TEST_MODE, java.lang.String.valueOf(this._testMode));
        return map;
    }

    public void shutdown() {
        com.unity3d.services.core.configuration.PrivacyConfigStorage.getInstance().unregisterObserver(this._privacyObserver);
    }

    private void refreshMediationData() {
        try {
            com.unity3d.services.core.device.Storage storage = com.unity3d.services.core.device.StorageManager.getStorage(com.unity3d.services.core.device.StorageManager.StorageType.PUBLIC);
            if (storage == null || !storage.initStorage()) {
                return;
            }
            this._mediationName = (java.lang.String) storage.get(com.unity3d.ads.core.data.datasource.AndroidMediationDataSource.MEDIATION_NAME_KEY);
            this._mediationVersion = (java.lang.String) storage.get(com.unity3d.ads.core.data.datasource.AndroidMediationDataSource.MEDIATION_VERSION_KEY);
            this._mediationAdapter = (java.lang.String) storage.get("mediation.adapter_version.value");
        } catch (java.lang.Exception e) {
            com.unity3d.services.core.log.DeviceLog.debug("Failed to refreshMediationData: %s", e.getLocalizedMessage());
        }
    }

    private boolean mediationIsEmpty() {
        java.lang.String str = this._mediationName;
        return str == null || str.isEmpty();
    }
}
