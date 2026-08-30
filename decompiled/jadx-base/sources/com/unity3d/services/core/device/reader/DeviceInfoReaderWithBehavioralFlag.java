package com.unity3d.services.core.device.reader;

/* JADX INFO: loaded from: classes6.dex */
public class DeviceInfoReaderWithBehavioralFlag implements com.unity3d.services.core.device.reader.IDeviceInfoReader {
    private final com.unity3d.services.core.device.reader.IDeviceInfoReader _deviceInfoReader;
    private final com.unity3d.services.core.device.reader.pii.NonBehavioralFlagReader _nonBehavioralFlagReader;

    public DeviceInfoReaderWithBehavioralFlag(com.unity3d.services.core.device.reader.IDeviceInfoReader iDeviceInfoReader, com.unity3d.services.core.device.reader.pii.NonBehavioralFlagReader nonBehavioralFlagReader) {
        this._deviceInfoReader = iDeviceInfoReader;
        this._nonBehavioralFlagReader = nonBehavioralFlagReader;
    }

    @Override // com.unity3d.services.core.device.reader.IDeviceInfoReader
    public java.util.Map<java.lang.String, java.lang.Object> getDeviceInfoData() {
        java.util.Map<java.lang.String, java.lang.Object> deviceInfoData = this._deviceInfoReader.getDeviceInfoData();
        if (this._nonBehavioralFlagReader.getUserNonBehavioralFlag() != com.unity3d.services.core.device.reader.pii.NonBehavioralFlag.UNKNOWN) {
            deviceInfoData.put(com.unity3d.services.core.device.reader.JsonStorageKeyNames.USER_NON_BEHAVIORAL_KEY, java.lang.Boolean.valueOf(this._nonBehavioralFlagReader.getUserNonBehavioralFlag() == com.unity3d.services.core.device.reader.pii.NonBehavioralFlag.TRUE));
        }
        return deviceInfoData;
    }
}
