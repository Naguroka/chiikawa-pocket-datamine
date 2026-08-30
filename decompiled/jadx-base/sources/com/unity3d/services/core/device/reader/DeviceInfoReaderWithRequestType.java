package com.unity3d.services.core.device.reader;

/* JADX INFO: loaded from: classes6.dex */
public class DeviceInfoReaderWithRequestType implements com.unity3d.services.core.device.reader.IDeviceInfoReader {
    private final com.unity3d.services.core.device.reader.IDeviceInfoReader _deviceInfoReader;
    private final com.unity3d.services.core.configuration.InitRequestType _initRequestType;

    public DeviceInfoReaderWithRequestType(com.unity3d.services.core.device.reader.IDeviceInfoReader iDeviceInfoReader, com.unity3d.services.core.configuration.InitRequestType initRequestType) {
        this._deviceInfoReader = iDeviceInfoReader;
        this._initRequestType = initRequestType;
    }

    @Override // com.unity3d.services.core.device.reader.IDeviceInfoReader
    public java.util.Map<java.lang.String, java.lang.Object> getDeviceInfoData() {
        java.util.Map<java.lang.String, java.lang.Object> deviceInfoData = this._deviceInfoReader.getDeviceInfoData();
        com.unity3d.services.core.configuration.InitRequestType initRequestType = this._initRequestType;
        if (initRequestType != null) {
            deviceInfoData.put("callType", initRequestType.toString().toLowerCase());
        }
        return deviceInfoData;
    }
}
