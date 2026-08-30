package com.unity3d.services.core.device.reader;

/* JADX INFO: loaded from: classes6.dex */
public class DeviceInfoReaderWithLifecycle implements com.unity3d.services.core.device.reader.IDeviceInfoReader {
    private final com.unity3d.services.core.device.reader.IDeviceInfoReader _deviceInfoReader;
    private final com.unity3d.services.core.lifecycle.LifecycleCache _lifecycleCache;

    public DeviceInfoReaderWithLifecycle(com.unity3d.services.core.device.reader.IDeviceInfoReader iDeviceInfoReader, com.unity3d.services.core.lifecycle.LifecycleCache lifecycleCache) {
        this._deviceInfoReader = iDeviceInfoReader;
        this._lifecycleCache = lifecycleCache;
    }

    @Override // com.unity3d.services.core.device.reader.IDeviceInfoReader
    public java.util.Map<java.lang.String, java.lang.Object> getDeviceInfoData() {
        java.util.Map<java.lang.String, java.lang.Object> deviceInfoData = this._deviceInfoReader.getDeviceInfoData();
        deviceInfoData.put("appActive", java.lang.Boolean.valueOf(this._lifecycleCache.isAppActive()));
        return deviceInfoData;
    }
}
