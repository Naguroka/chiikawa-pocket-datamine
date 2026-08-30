package com.unity3d.services.core.device.reader;

/* JADX INFO: compiled from: DeviceInfoReaderWithAuid.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0016R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/unity3d/services/core/device/reader/DeviceInfoReaderWithAuid;", "Lcom/unity3d/services/core/device/reader/IDeviceInfoReader;", "_deviceInfoReader", "(Lcom/unity3d/services/core/device/reader/IDeviceInfoReader;)V", "getDeviceInfoData", "", "", "", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DeviceInfoReaderWithAuid implements com.unity3d.services.core.device.reader.IDeviceInfoReader {
    private final com.unity3d.services.core.device.reader.IDeviceInfoReader _deviceInfoReader;

    public DeviceInfoReaderWithAuid(com.unity3d.services.core.device.reader.IDeviceInfoReader _deviceInfoReader) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(_deviceInfoReader, "_deviceInfoReader");
        this._deviceInfoReader = _deviceInfoReader;
    }

    @Override // com.unity3d.services.core.device.reader.IDeviceInfoReader
    public java.util.Map<java.lang.String, java.lang.Object> getDeviceInfoData() {
        java.util.Map<java.lang.String, java.lang.Object> deviceInfoData = this._deviceInfoReader.getDeviceInfoData();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(deviceInfoData, "_deviceInfoReader.deviceInfoData");
        java.lang.String auid = com.unity3d.services.core.device.Device.getAuid();
        if (auid != null) {
            deviceInfoData.put("auid", auid);
        }
        return deviceInfoData;
    }
}
