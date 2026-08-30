package com.unity3d.services.core.device.reader;

/* JADX INFO: loaded from: classes6.dex */
public class DeviceInfoReaderWithMetrics implements com.unity3d.services.core.device.reader.IDeviceInfoReader {
    private final com.unity3d.services.core.device.reader.IDeviceInfoReader _deviceInfoReader;
    private final com.unity3d.services.core.request.metrics.SDKMetricsSender _sdkMetricsSender;

    public DeviceInfoReaderWithMetrics(com.unity3d.services.core.device.reader.IDeviceInfoReader iDeviceInfoReader, com.unity3d.services.core.request.metrics.SDKMetricsSender sDKMetricsSender) {
        this._deviceInfoReader = iDeviceInfoReader;
        this._sdkMetricsSender = sDKMetricsSender;
    }

    @Override // com.unity3d.services.core.device.reader.IDeviceInfoReader
    public java.util.Map<java.lang.String, java.lang.Object> getDeviceInfoData() {
        com.unity3d.services.core.device.reader.IDeviceInfoReader iDeviceInfoReader = this._deviceInfoReader;
        if (iDeviceInfoReader == null) {
            return null;
        }
        java.util.Map<java.lang.String, java.lang.Object> deviceInfoData = iDeviceInfoReader.getDeviceInfoData();
        sendMetrics(deviceInfoData);
        return deviceInfoData;
    }

    private void sendMetrics(java.util.Map<java.lang.String, java.lang.Object> map) {
        if (map != null) {
            java.lang.Object obj = map.get(com.unity3d.services.core.device.reader.JsonStorageKeyNames.GAME_SESSION_ID_NORMALIZED_KEY);
            if ((obj instanceof java.lang.Long) && ((java.lang.Long) obj).longValue() == 0) {
                this._sdkMetricsSender.sendMetric(com.unity3d.services.core.request.metrics.TSIMetric.newMissingGameSessionId());
            }
        }
    }
}
