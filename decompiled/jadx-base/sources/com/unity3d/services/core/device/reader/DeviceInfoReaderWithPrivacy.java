package com.unity3d.services.core.device.reader;

/* JADX INFO: loaded from: classes6.dex */
public class DeviceInfoReaderWithPrivacy implements com.unity3d.services.core.device.reader.IDeviceInfoReader {
    private final com.unity3d.services.core.device.reader.IDeviceInfoReader _deviceInfoReader;
    private final com.unity3d.services.core.device.reader.pii.PiiDataProvider _piiDataProvider;
    private final com.unity3d.services.core.device.reader.pii.PiiTrackingStatusReader _piiTrackingStatusReader;
    private final com.unity3d.services.core.configuration.PrivacyConfigStorage _privacyConfigStorage;

    public DeviceInfoReaderWithPrivacy(com.unity3d.services.core.device.reader.IDeviceInfoReader iDeviceInfoReader, com.unity3d.services.core.configuration.PrivacyConfigStorage privacyConfigStorage, com.unity3d.services.core.device.reader.pii.PiiDataProvider piiDataProvider, com.unity3d.services.core.device.reader.pii.PiiTrackingStatusReader piiTrackingStatusReader) {
        this._deviceInfoReader = iDeviceInfoReader;
        this._privacyConfigStorage = privacyConfigStorage;
        this._piiDataProvider = piiDataProvider;
        this._piiTrackingStatusReader = piiTrackingStatusReader;
    }

    @Override // com.unity3d.services.core.device.reader.IDeviceInfoReader
    public java.util.Map<java.lang.String, java.lang.Object> getDeviceInfoData() {
        java.util.Map<java.lang.String, java.lang.Object> deviceInfoData = this._deviceInfoReader.getDeviceInfoData();
        com.unity3d.services.core.configuration.PrivacyConfigStorage privacyConfigStorage = this._privacyConfigStorage;
        if (privacyConfigStorage != null && privacyConfigStorage.getPrivacyConfig() != null) {
            if (this._privacyConfigStorage.getPrivacyConfig().allowedToSendPii()) {
                deviceInfoData.putAll(getPiiAttributesFromDevice());
            }
            if (this._privacyConfigStorage.getPrivacyConfig().shouldSendNonBehavioral()) {
                deviceInfoData.put(com.unity3d.services.core.device.reader.JsonStorageKeyNames.USER_NON_BEHAVIORAL_KEY, java.lang.Boolean.valueOf(this._piiTrackingStatusReader.getUserNonBehavioralFlag()));
            }
        }
        return deviceInfoData;
    }

    private java.util.Map<java.lang.String, java.lang.Object> getPiiAttributesFromDevice() {
        java.util.HashMap map = new java.util.HashMap();
        java.lang.String advertisingTrackingId = this._piiDataProvider.getAdvertisingTrackingId();
        if (advertisingTrackingId != null) {
            map.put(com.unity3d.services.core.device.reader.JsonStorageKeyNames.ADVERTISING_TRACKING_ID_NORMALIZED_KEY, advertisingTrackingId);
        }
        return map;
    }
}
