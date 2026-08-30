package com.unity3d.services.core.device.reader;

/* JADX INFO: loaded from: classes6.dex */
public class DeviceInfoReaderCompressorWithMetrics implements com.unity3d.services.core.device.reader.IDeviceInfoDataCompressor {
    private final com.unity3d.services.core.device.reader.IDeviceInfoDataCompressor _deviceInfoDataCompressor;
    private long _endTime;
    private final com.unity3d.services.core.request.metrics.SDKMetricsSender _sdkMetricsSender;
    private long _startTimeCompression;
    private long _startTimeInfo;

    public DeviceInfoReaderCompressorWithMetrics(com.unity3d.services.core.device.reader.IDeviceInfoDataCompressor iDeviceInfoDataCompressor, com.unity3d.services.core.request.metrics.SDKMetricsSender sDKMetricsSender) {
        this._deviceInfoDataCompressor = iDeviceInfoDataCompressor;
        this._sdkMetricsSender = sDKMetricsSender;
    }

    @Override // com.unity3d.services.core.device.reader.IDeviceInfoDataContainer
    public byte[] getDeviceData() {
        if (this._deviceInfoDataCompressor == null) {
            return new byte[0];
        }
        this._startTimeInfo = java.lang.System.nanoTime();
        byte[] bArrCompressDeviceInfo = compressDeviceInfo(getDeviceInfo());
        sendDeviceInfoMetrics();
        return bArrCompressDeviceInfo;
    }

    @Override // com.unity3d.services.core.device.reader.IDeviceInfoDataContainer
    public java.util.Map<java.lang.String, java.lang.Object> getDeviceInfo() {
        return this._deviceInfoDataCompressor.getDeviceInfo();
    }

    @Override // com.unity3d.services.core.device.reader.IDeviceInfoDataCompressor
    public byte[] compressDeviceInfo(java.util.Map<java.lang.String, java.lang.Object> map) {
        this._startTimeCompression = java.lang.System.nanoTime();
        byte[] bArrCompressDeviceInfo = this._deviceInfoDataCompressor.compressDeviceInfo(map);
        this._endTime = java.lang.System.nanoTime();
        return bArrCompressDeviceInfo;
    }

    private long getDeviceInfoCollectionDuration() {
        return java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(this._startTimeCompression - this._startTimeInfo);
    }

    private long getCompressionDuration() {
        return java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(this._endTime - this._startTimeCompression);
    }

    private void sendDeviceInfoMetrics() {
        this._sdkMetricsSender.sendMetric(com.unity3d.services.core.request.metrics.TSIMetric.newDeviceInfoCollectionLatency(java.lang.Long.valueOf(getDeviceInfoCollectionDuration())));
        this._sdkMetricsSender.sendMetric(com.unity3d.services.core.request.metrics.TSIMetric.newDeviceInfoCompressionLatency(java.lang.Long.valueOf(getCompressionDuration())));
    }
}
