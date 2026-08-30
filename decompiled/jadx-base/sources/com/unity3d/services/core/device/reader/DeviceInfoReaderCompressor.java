package com.unity3d.services.core.device.reader;

/* JADX INFO: loaded from: classes6.dex */
public class DeviceInfoReaderCompressor implements com.unity3d.services.core.device.reader.IDeviceInfoDataCompressor {
    public final com.unity3d.services.core.device.reader.IDeviceInfoReader _deviceInfoReader;

    public DeviceInfoReaderCompressor(com.unity3d.services.core.device.reader.IDeviceInfoReader iDeviceInfoReader) {
        this._deviceInfoReader = iDeviceInfoReader;
    }

    @Override // com.unity3d.services.core.device.reader.IDeviceInfoDataContainer
    public byte[] getDeviceData() {
        return compressDeviceInfo(getDeviceInfo());
    }

    @Override // com.unity3d.services.core.device.reader.IDeviceInfoDataContainer
    public java.util.Map<java.lang.String, java.lang.Object> getDeviceInfo() {
        return this._deviceInfoReader.getDeviceInfoData();
    }

    @Override // com.unity3d.services.core.device.reader.IDeviceInfoDataCompressor
    public byte[] compressDeviceInfo(java.util.Map<java.lang.String, java.lang.Object> map) {
        if (map != null) {
            java.lang.String string = new org.json.JSONObject(map).toString();
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream(string.length());
            try {
                java.util.zip.GZIPOutputStream gZIPOutputStream = new java.util.zip.GZIPOutputStream(byteArrayOutputStream);
                gZIPOutputStream.write(string.getBytes());
                gZIPOutputStream.flush();
                gZIPOutputStream.close();
                byteArrayOutputStream.close();
                return byteArrayOutputStream.toByteArray();
            } catch (java.io.IOException unused) {
                com.unity3d.services.core.log.DeviceLog.error("Error occurred while trying to compress device data.");
                return null;
            }
        }
        com.unity3d.services.core.log.DeviceLog.error("Invalid DeviceInfoData: Expected non null map provided by reader");
        return null;
    }
}
