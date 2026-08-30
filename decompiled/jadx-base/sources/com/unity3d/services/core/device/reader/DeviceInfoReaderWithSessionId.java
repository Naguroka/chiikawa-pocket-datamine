package com.unity3d.services.core.device.reader;

/* JADX INFO: loaded from: classes6.dex */
public class DeviceInfoReaderWithSessionId implements com.unity3d.services.core.device.reader.IDeviceInfoReader {
    private final com.unity3d.services.core.device.reader.IDeviceInfoReader _deviceInfoReader;
    private final com.unity3d.services.core.properties.Session _session;

    public DeviceInfoReaderWithSessionId(com.unity3d.services.core.device.reader.IDeviceInfoReader iDeviceInfoReader, com.unity3d.services.core.properties.Session session) {
        this._deviceInfoReader = iDeviceInfoReader;
        this._session = session;
    }

    @Override // com.unity3d.services.core.device.reader.IDeviceInfoReader
    public java.util.Map<java.lang.String, java.lang.Object> getDeviceInfoData() {
        java.util.Map<java.lang.String, java.lang.Object> deviceInfoData = this._deviceInfoReader.getDeviceInfoData();
        deviceInfoData.put(com.unity3d.services.core.device.reader.JsonStorageKeyNames.SESSION_ID_KEY, this._session.getId());
        return deviceInfoData;
    }
}
