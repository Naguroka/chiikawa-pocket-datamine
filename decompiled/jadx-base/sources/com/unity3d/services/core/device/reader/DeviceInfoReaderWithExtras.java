package com.unity3d.services.core.device.reader;

/* JADX INFO: loaded from: classes6.dex */
public class DeviceInfoReaderWithExtras implements com.unity3d.services.core.device.reader.IDeviceInfoReader {
    private final com.unity3d.services.core.device.reader.IDeviceInfoReader _deviceInfoReader;
    private final java.util.Map<java.lang.String, java.lang.String> _extras;

    public DeviceInfoReaderWithExtras(com.unity3d.services.core.device.reader.IDeviceInfoReader iDeviceInfoReader, java.util.Map<java.lang.String, java.lang.String> map) {
        this._deviceInfoReader = iDeviceInfoReader;
        this._extras = map;
    }

    @Override // com.unity3d.services.core.device.reader.IDeviceInfoReader
    public java.util.Map<java.lang.String, java.lang.Object> getDeviceInfoData() {
        java.util.Map<java.lang.String, java.lang.String> map;
        java.util.Map<java.lang.String, java.lang.Object> deviceInfoData = this._deviceInfoReader.getDeviceInfoData();
        if (deviceInfoData != null && (map = this._extras) != null) {
            deviceInfoData.putAll(map);
        }
        return deviceInfoData;
    }
}
