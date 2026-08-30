package com.unity3d.services.core.device.reader.builder;

/* JADX INFO: loaded from: classes6.dex */
public class DeviceInfoReaderBuilder {
    private final com.unity3d.services.core.configuration.ConfigurationReader _configurationReader;
    private final com.unity3d.services.core.device.reader.IGameSessionIdReader _gameSessionIdReader;
    private final com.unity3d.services.core.configuration.PrivacyConfigStorage _privacyConfigStorage;

    public DeviceInfoReaderBuilder(com.unity3d.services.core.configuration.ConfigurationReader configurationReader, com.unity3d.services.core.configuration.PrivacyConfigStorage privacyConfigStorage, com.unity3d.services.core.device.reader.IGameSessionIdReader iGameSessionIdReader) {
        this._configurationReader = configurationReader;
        this._privacyConfigStorage = privacyConfigStorage;
        this._gameSessionIdReader = iGameSessionIdReader;
    }

    public com.unity3d.services.core.device.reader.IDeviceInfoReader build() {
        com.unity3d.services.core.device.Storage storage = com.unity3d.services.core.device.StorageManager.getStorage(com.unity3d.services.core.device.StorageManager.StorageType.PRIVATE);
        com.unity3d.services.core.device.Storage storage2 = com.unity3d.services.core.device.StorageManager.getStorage(com.unity3d.services.core.device.StorageManager.StorageType.PUBLIC);
        return new com.unity3d.services.core.device.reader.DeviceInfoReaderWithMetrics(new com.unity3d.services.core.device.reader.DeviceInfoReaderWithFilter(new com.unity3d.services.core.device.reader.DeviceInfoReaderWithPrivacy(new com.unity3d.services.core.device.reader.DeviceInfoReaderWithStorageInfo(new com.unity3d.services.core.device.reader.DeviceInfoReaderWithLifecycle(new com.unity3d.services.core.device.reader.DeviceInfoReaderExtended(new com.unity3d.services.core.device.reader.DeviceInfoReaderWithAuid(new com.unity3d.services.core.device.reader.DeviceInfoReaderWithSessionId(buildWithRequestType(com.unity3d.services.core.configuration.InitRequestType.TOKEN), com.unity3d.services.core.properties.Session.INSTANCE))), com.unity3d.services.core.lifecycle.CachedLifecycle.getLifecycleListener()), getTsiRequestStorageRules(), storage, storage2), this._privacyConfigStorage, new com.unity3d.services.core.device.reader.pii.PiiDataProvider(), new com.unity3d.services.core.device.reader.pii.PiiTrackingStatusReader(new com.unity3d.services.core.misc.JsonStorageAggregator(java.util.Arrays.asList(storage2, storage)))), new com.unity3d.services.core.device.reader.DeviceInfoReaderFilterProvider(storage).getFilterList()), (com.unity3d.services.core.request.metrics.SDKMetricsSender) com.unity3d.services.core.misc.Utilities.getService(com.unity3d.services.core.request.metrics.SDKMetricsSender.class));
    }

    protected com.unity3d.services.core.device.reader.IDeviceInfoReader buildWithRequestType(com.unity3d.services.core.configuration.InitRequestType initRequestType) {
        return new com.unity3d.services.core.device.reader.DeviceInfoReaderWithRequestType(new com.unity3d.services.core.device.reader.MinimalDeviceInfoReader(this._gameSessionIdReader), initRequestType);
    }

    private com.unity3d.services.core.misc.JsonFlattenerRules getTsiRequestStorageRules() {
        return new com.unity3d.services.core.misc.JsonFlattenerRules(java.util.Arrays.asList("privacy", "gdpr", "framework", "adapter", "mediation", "unity", "pipl", "configuration", "user", com.unity3d.services.core.device.reader.JsonStorageKeyNames.UNIFIED_CONFIG_KEY), java.util.Collections.singletonList("value"), java.util.Arrays.asList("ts", "exclude", "pii", "nonBehavioral", "nonbehavioral"));
    }
}
