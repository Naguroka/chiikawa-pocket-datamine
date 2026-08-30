package com.unity3d.services.core.device.reader;

/* JADX INFO: loaded from: classes6.dex */
public class DeviceInfoReaderExtended implements com.unity3d.services.core.device.reader.IDeviceInfoReader {
    private final com.unity3d.services.core.device.reader.IDeviceInfoReader _deviceInfoReader;

    public DeviceInfoReaderExtended(com.unity3d.services.core.device.reader.IDeviceInfoReader iDeviceInfoReader) {
        this._deviceInfoReader = iDeviceInfoReader;
    }

    @Override // com.unity3d.services.core.device.reader.IDeviceInfoReader
    public java.util.Map<java.lang.String, java.lang.Object> getDeviceInfoData() {
        java.util.Map<java.lang.String, java.lang.Object> deviceInfoData = this._deviceInfoReader.getDeviceInfoData();
        deviceInfoData.put("bundleId", com.unity3d.services.core.properties.ClientProperties.getAppName());
        deviceInfoData.put("encrypted", java.lang.Boolean.valueOf(com.unity3d.services.core.properties.ClientProperties.isAppDebuggable()));
        deviceInfoData.put("rooted", java.lang.Boolean.valueOf(com.unity3d.services.core.device.Device.isRooted()));
        deviceInfoData.put("osVersion", com.unity3d.services.core.device.Device.getOsVersion());
        deviceInfoData.put(com.ironsource.y8.i.l, com.unity3d.services.core.device.Device.getModel());
        deviceInfoData.put("language", java.util.Locale.getDefault().toString());
        deviceInfoData.put(com.ironsource.y8.i.t, com.unity3d.services.core.device.Device.getConnectionType());
        deviceInfoData.put("screenHeight", java.lang.Integer.valueOf(com.unity3d.services.core.device.Device.getScreenHeight()));
        deviceInfoData.put("screenWidth", java.lang.Integer.valueOf(com.unity3d.services.core.device.Device.getScreenWidth()));
        deviceInfoData.put("deviceMake", com.unity3d.services.core.device.Device.getManufacturer());
        deviceInfoData.put("screenDensity", java.lang.Integer.valueOf(com.unity3d.services.core.device.Device.getScreenDensity()));
        deviceInfoData.put("screenSize", java.lang.Integer.valueOf(com.unity3d.services.core.device.Device.getScreenLayout()));
        deviceInfoData.put("limitAdTracking", java.lang.Boolean.valueOf(com.unity3d.services.core.device.Device.isLimitAdTrackingEnabled()));
        deviceInfoData.put("networkOperator", com.unity3d.services.core.device.Device.getNetworkOperator());
        deviceInfoData.put("volume", java.lang.Integer.valueOf(com.unity3d.services.core.device.Device.getStreamVolume(1)));
        deviceInfoData.put("deviceFreeSpace", java.lang.Long.valueOf(com.unity3d.services.core.device.Device.getFreeSpace(com.unity3d.services.core.properties.ClientProperties.getApplicationContext().getCacheDir())));
        deviceInfoData.put("apiLevel", java.lang.String.valueOf(com.unity3d.services.core.device.Device.getApiLevel()));
        deviceInfoData.put("networkType", java.lang.Integer.valueOf(com.unity3d.services.core.device.Device.getNetworkType()));
        deviceInfoData.put("bundleVersion", com.unity3d.services.core.properties.ClientProperties.getAppVersion());
        try {
            deviceInfoData.put("timeZone", java.util.TimeZone.getDefault().getDisplayName(false, 0, java.util.Locale.US));
        } catch (java.lang.AssertionError e) {
            com.unity3d.services.core.log.DeviceLog.error("Could not read timeZone information: %s", e.getMessage());
        }
        deviceInfoData.put("timeZoneOffset", java.lang.Integer.valueOf(java.util.TimeZone.getDefault().getOffset(java.lang.System.currentTimeMillis()) / 1000));
        try {
            deviceInfoData.put("webviewUa", android.webkit.WebSettings.getDefaultUserAgent(com.unity3d.services.core.properties.ClientProperties.getApplicationContext()));
        } catch (java.lang.Exception e2) {
            com.unity3d.services.core.log.DeviceLog.exception("Error getting webview user agent", e2);
        }
        deviceInfoData.put("networkOperatorName", com.unity3d.services.core.device.Device.getNetworkOperatorName());
        deviceInfoData.put("wiredHeadset", java.lang.Boolean.valueOf(com.unity3d.services.core.device.Device.isWiredHeadsetOn()));
        deviceInfoData.put("versionCode", java.lang.Integer.valueOf(com.unity3d.services.core.properties.SdkProperties.getVersionCode()));
        deviceInfoData.put("stores", "google");
        deviceInfoData.put("appStartTime", java.lang.Long.valueOf(com.unity3d.services.core.properties.SdkProperties.getInitializationTimeEpoch() / 1000));
        deviceInfoData.put("sdkVersionName", com.unity3d.services.core.properties.SdkProperties.getVersionName());
        deviceInfoData.put("eventTimeStamp", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() / 1000));
        deviceInfoData.put("cpuCount", java.lang.Long.valueOf(com.unity3d.services.core.device.Device.getCPUCount()));
        deviceInfoData.put("usbConnected", java.lang.Boolean.valueOf(com.unity3d.services.core.device.Device.isUSBConnected()));
        deviceInfoData.put("apkDeveloperSigningCertificateHash", com.unity3d.services.core.device.Device.getCertificateFingerprint());
        deviceInfoData.put("deviceUpTime", java.lang.Long.valueOf(com.unity3d.services.core.device.Device.getUptime()));
        deviceInfoData.put("deviceElapsedRealtime", java.lang.Long.valueOf(com.unity3d.services.core.device.Device.getElapsedRealtime()));
        deviceInfoData.put("adbEnabled", com.unity3d.services.core.device.Device.isAdbEnabled());
        deviceInfoData.put("androidFingerprint", com.unity3d.services.core.device.Device.getFingerprint());
        deviceInfoData.put("batteryStatus", java.lang.Integer.valueOf(com.unity3d.services.core.device.Device.getBatteryStatus()));
        deviceInfoData.put(com.ironsource.y8.i.Y, java.lang.Float.valueOf(com.unity3d.services.core.device.Device.getBatteryLevel()));
        deviceInfoData.put("networkMetered", java.lang.Boolean.valueOf(com.unity3d.services.core.device.Device.getNetworkMetered()));
        deviceInfoData.put("test", java.lang.Boolean.valueOf(com.unity3d.services.core.properties.SdkProperties.isTestMode()));
        deviceInfoData.put("callType", com.unity3d.services.core.configuration.InitRequestType.TOKEN.getCallType());
        return deviceInfoData;
    }
}
