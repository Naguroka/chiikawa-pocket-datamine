package com.unity3d.services.core.device.reader;

/* JADX INFO: loaded from: classes6.dex */
public class DeviceInfoReaderWithFilter implements com.unity3d.services.core.device.reader.IDeviceInfoReader {
    com.unity3d.services.core.device.reader.IDeviceInfoReader _deviceInfoReader;
    java.util.List<java.lang.String> _keysToExclude;

    public DeviceInfoReaderWithFilter(com.unity3d.services.core.device.reader.IDeviceInfoReader iDeviceInfoReader, java.util.List<java.lang.String> list) {
        this._deviceInfoReader = iDeviceInfoReader;
        this._keysToExclude = list;
    }

    @Override // com.unity3d.services.core.device.reader.IDeviceInfoReader
    public java.util.Map<java.lang.String, java.lang.Object> getDeviceInfoData() {
        java.util.Map<java.lang.String, java.lang.Object> deviceInfoData = this._deviceInfoReader.getDeviceInfoData();
        java.util.List<java.lang.String> list = this._keysToExclude;
        if (list != null) {
            java.util.Iterator<java.lang.String> it = list.iterator();
            while (it.hasNext()) {
                deviceInfoData.remove(it.next());
            }
        }
        return deviceInfoData;
    }
}
