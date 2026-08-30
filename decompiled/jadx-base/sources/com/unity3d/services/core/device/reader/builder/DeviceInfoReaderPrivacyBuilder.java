package com.unity3d.services.core.device.reader.builder;

/* JADX INFO: loaded from: classes6.dex */
public class DeviceInfoReaderPrivacyBuilder extends com.unity3d.services.core.device.reader.builder.DeviceInfoReaderBuilder {
    public DeviceInfoReaderPrivacyBuilder(com.unity3d.services.core.configuration.ConfigurationReader configurationReader, com.unity3d.services.core.configuration.PrivacyConfigStorage privacyConfigStorage, com.unity3d.services.core.device.reader.IGameSessionIdReader iGameSessionIdReader) {
        super(configurationReader, privacyConfigStorage, iGameSessionIdReader);
    }

    @Override // com.unity3d.services.core.device.reader.builder.DeviceInfoReaderBuilder
    public com.unity3d.services.core.device.reader.IDeviceInfoReader build() {
        com.unity3d.services.core.device.Storage storage = com.unity3d.services.core.device.StorageManager.getStorage(com.unity3d.services.core.device.StorageManager.StorageType.PRIVATE);
        com.unity3d.services.core.device.Storage storage2 = com.unity3d.services.core.device.StorageManager.getStorage(com.unity3d.services.core.device.StorageManager.StorageType.PUBLIC);
        return new com.unity3d.services.core.device.reader.DeviceInfoReaderWithFilter(new com.unity3d.services.core.device.reader.DeviceInfoReaderWithStorageInfo(new com.unity3d.services.core.device.reader.DeviceInfoReaderWithBehavioralFlag(buildWithRequestType(com.unity3d.services.core.configuration.InitRequestType.PRIVACY), new com.unity3d.services.core.device.reader.pii.NonBehavioralFlagReader(new com.unity3d.services.core.misc.JsonStorageAggregator(java.util.Arrays.asList(storage2, storage)))), getPrivacyRequestStorageRules(), storage, storage2), new com.unity3d.services.core.device.reader.DeviceInfoReaderFilterProvider(storage).getFilterList());
    }

    private com.unity3d.services.core.misc.JsonFlattenerRules getPrivacyRequestStorageRules() {
        return new com.unity3d.services.core.misc.JsonFlattenerRules(java.util.Arrays.asList("privacy", "gdpr", "unity", "pipl"), java.util.Collections.singletonList("value"), java.util.Arrays.asList("ts", "exclude", com.ironsource.y8.a.t));
    }
}
