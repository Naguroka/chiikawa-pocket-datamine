package com.unity3d.services.core.device.reader;

/* JADX INFO: loaded from: classes6.dex */
public class DeviceInfoReaderWithStorageInfo implements com.unity3d.services.core.device.reader.IDeviceInfoReader {
    private final com.unity3d.services.core.device.reader.IDeviceInfoReader _deviceInfoReader;
    private final com.unity3d.services.core.misc.JsonFlattenerRules _jsonFlattenerRules;
    private final java.util.List<com.unity3d.services.core.misc.IJsonStorageReader> _storageReaders;

    public DeviceInfoReaderWithStorageInfo(com.unity3d.services.core.device.reader.IDeviceInfoReader iDeviceInfoReader, com.unity3d.services.core.misc.JsonFlattenerRules jsonFlattenerRules, com.unity3d.services.core.misc.IJsonStorageReader... iJsonStorageReaderArr) {
        this._deviceInfoReader = iDeviceInfoReader;
        this._jsonFlattenerRules = jsonFlattenerRules;
        this._storageReaders = java.util.Arrays.asList(iJsonStorageReaderArr);
    }

    @Override // com.unity3d.services.core.device.reader.IDeviceInfoReader
    public java.util.Map<java.lang.String, java.lang.Object> getDeviceInfoData() {
        java.util.Map<java.lang.String, java.lang.Object> deviceInfoData = this._deviceInfoReader.getDeviceInfoData();
        return deviceInfoData != null ? com.unity3d.services.core.misc.Utilities.combineJsonIntoMap(deviceInfoData, new com.unity3d.services.core.misc.JsonFlattener(new com.unity3d.services.core.misc.JsonStorageAggregator(this._storageReaders).getData()).flattenJson(".", this._jsonFlattenerRules)) : deviceInfoData;
    }
}
