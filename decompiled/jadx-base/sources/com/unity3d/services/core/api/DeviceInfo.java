package com.unity3d.services.core.api;

/* JADX INFO: loaded from: classes6.dex */
public class DeviceInfo {
    private static final com.unity3d.services.core.device.VolumeChangeMonitor volumeChangeMonitor = (com.unity3d.services.core.device.VolumeChangeMonitor) com.unity3d.services.core.misc.Utilities.getService(com.unity3d.services.core.device.VolumeChangeMonitor.class);

    public enum StorageType {
        EXTERNAL,
        INTERNAL
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void getAdvertisingTrackingId(com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        webViewCallback.invoke(com.unity3d.services.core.device.Device.getAdvertisingTrackingId());
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void getLimitAdTrackingFlag(com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        webViewCallback.invoke(java.lang.Boolean.valueOf(com.unity3d.services.core.device.Device.isLimitAdTrackingEnabled()));
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void getOpenAdvertisingTrackingId(com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        webViewCallback.invoke(com.unity3d.services.core.device.Device.getOpenAdvertisingTrackingId());
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void getLimitOpenAdTrackingFlag(com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        webViewCallback.invoke(java.lang.Boolean.valueOf(com.unity3d.services.core.device.Device.isLimitOpenAdTrackingEnabled()));
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void getApiLevel(com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        webViewCallback.invoke(java.lang.Integer.valueOf(com.unity3d.services.core.device.Device.getApiLevel()));
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void getExtensionVersion(com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        webViewCallback.invoke(java.lang.Integer.valueOf(com.unity3d.services.core.device.Device.getExtensionVersion()));
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void getOsVersion(com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        webViewCallback.invoke(com.unity3d.services.core.device.Device.getOsVersion());
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void getManufacturer(com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        webViewCallback.invoke(com.unity3d.services.core.device.Device.getManufacturer());
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void getModel(com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        webViewCallback.invoke(com.unity3d.services.core.device.Device.getModel());
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void getScreenLayout(com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        webViewCallback.invoke(java.lang.Integer.valueOf(com.unity3d.services.core.device.Device.getScreenLayout()));
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void getDisplayMetricDensity(com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        webViewCallback.invoke(java.lang.Float.valueOf(com.unity3d.services.core.device.Device.getDisplayMetricDensity()));
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void getScreenDensity(com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        webViewCallback.invoke(java.lang.Integer.valueOf(com.unity3d.services.core.device.Device.getScreenDensity()));
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void getScreenWidth(com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        webViewCallback.invoke(java.lang.Integer.valueOf(com.unity3d.services.core.device.Device.getScreenWidth()));
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void getScreenHeight(com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        webViewCallback.invoke(java.lang.Integer.valueOf(com.unity3d.services.core.device.Device.getScreenHeight()));
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void getTimeZone(java.lang.Boolean bool, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        webViewCallback.invoke(java.util.TimeZone.getDefault().getDisplayName(bool.booleanValue(), 0, java.util.Locale.US));
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void getTimeZoneOffset(com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        webViewCallback.invoke(java.lang.Integer.valueOf(java.util.TimeZone.getDefault().getOffset(java.lang.System.currentTimeMillis()) / 1000));
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void getConnectionType(com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        webViewCallback.invoke(com.unity3d.services.core.device.Device.getConnectionType());
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void getNetworkType(com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        webViewCallback.invoke(java.lang.Integer.valueOf(com.unity3d.services.core.device.Device.getNetworkType()));
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void getNetworkMetered(com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        webViewCallback.invoke(java.lang.Boolean.valueOf(com.unity3d.services.core.device.Device.getNetworkMetered()));
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void getNetworkOperator(com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        webViewCallback.invoke(com.unity3d.services.core.device.Device.getNetworkOperator());
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void getNetworkOperatorName(com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        webViewCallback.invoke(com.unity3d.services.core.device.Device.getNetworkOperatorName());
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void getNetworkCountryISO(com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        webViewCallback.invoke(com.unity3d.services.core.device.Device.getNetworkCountryISO());
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void isRooted(com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        webViewCallback.invoke(java.lang.Boolean.valueOf(com.unity3d.services.core.device.Device.isRooted()));
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void isAdbEnabled(com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        java.lang.Boolean boolIsAdbEnabled = com.unity3d.services.core.device.Device.isAdbEnabled();
        if (boolIsAdbEnabled != null) {
            webViewCallback.invoke(boolIsAdbEnabled);
        } else {
            webViewCallback.error(com.unity3d.services.core.device.DeviceError.COULDNT_GET_ADB_STATUS, new java.lang.Object[0]);
        }
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void getPackageInfo(com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        if (com.unity3d.services.core.properties.ClientProperties.getApplicationContext() != null) {
            java.lang.String appName = com.unity3d.services.core.properties.ClientProperties.getAppName();
            try {
                webViewCallback.invoke(com.unity3d.services.core.device.Device.getPackageInfo(com.unity3d.services.core.properties.ClientProperties.getApplicationContext().getPackageManager()));
                return;
            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                webViewCallback.error(com.unity3d.services.core.device.DeviceError.APPLICATION_INFO_NOT_AVAILABLE, appName);
                return;
            } catch (org.json.JSONException e) {
                webViewCallback.error(com.unity3d.services.core.device.DeviceError.JSON_ERROR, e.getMessage());
                return;
            }
        }
        webViewCallback.error(com.unity3d.services.core.device.DeviceError.APPLICATION_CONTEXT_NULL, new java.lang.Object[0]);
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void getUniqueEventId(com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        webViewCallback.invoke(com.unity3d.services.core.device.Device.getUniqueEventId());
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void getHeadset(com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        webViewCallback.invoke(java.lang.Boolean.valueOf(com.unity3d.services.core.device.Device.isWiredHeadsetOn()));
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void getSystemProperty(java.lang.String str, java.lang.String str2, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        webViewCallback.invoke(com.unity3d.services.core.device.Device.getSystemProperty(str, str2));
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void getRingerMode(com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        int ringerMode = com.unity3d.services.core.device.Device.getRingerMode();
        if (ringerMode > -1) {
            webViewCallback.invoke(java.lang.Integer.valueOf(ringerMode));
            return;
        }
        if (ringerMode == -2) {
            webViewCallback.error(com.unity3d.services.core.device.DeviceError.AUDIOMANAGER_NULL, java.lang.Integer.valueOf(ringerMode));
        } else if (ringerMode == -1) {
            webViewCallback.error(com.unity3d.services.core.device.DeviceError.APPLICATION_CONTEXT_NULL, java.lang.Integer.valueOf(ringerMode));
        } else {
            com.unity3d.services.core.log.DeviceLog.error("Unhandled ringerMode error: " + ringerMode);
        }
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void getSystemLanguage(com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        webViewCallback.invoke(java.util.Locale.getDefault().toString());
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void getDeviceVolume(java.lang.Integer num, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        int streamVolume = com.unity3d.services.core.device.Device.getStreamVolume(num.intValue());
        if (streamVolume > -1) {
            webViewCallback.invoke(java.lang.Integer.valueOf(streamVolume));
            return;
        }
        if (streamVolume == -2) {
            webViewCallback.error(com.unity3d.services.core.device.DeviceError.AUDIOMANAGER_NULL, java.lang.Integer.valueOf(streamVolume));
        } else if (streamVolume == -1) {
            webViewCallback.error(com.unity3d.services.core.device.DeviceError.APPLICATION_CONTEXT_NULL, java.lang.Integer.valueOf(streamVolume));
        } else {
            com.unity3d.services.core.log.DeviceLog.error("Unhandled deviceVolume error: " + streamVolume);
        }
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void getDeviceMaxVolume(java.lang.Integer num, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        int streamMaxVolume = com.unity3d.services.core.device.Device.getStreamMaxVolume(num.intValue());
        if (streamMaxVolume > -1) {
            webViewCallback.invoke(java.lang.Integer.valueOf(streamMaxVolume));
            return;
        }
        if (streamMaxVolume == -2) {
            webViewCallback.error(com.unity3d.services.core.device.DeviceError.AUDIOMANAGER_NULL, java.lang.Integer.valueOf(streamMaxVolume));
        } else if (streamMaxVolume == -1) {
            webViewCallback.error(com.unity3d.services.core.device.DeviceError.APPLICATION_CONTEXT_NULL, java.lang.Integer.valueOf(streamMaxVolume));
        } else {
            com.unity3d.services.core.log.DeviceLog.error("Unhandled deviceMaxVolume error: " + streamMaxVolume);
        }
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void registerVolumeChangeListener(java.lang.Integer num, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        volumeChangeMonitor.registerVolumeChangeListener(num.intValue());
        webViewCallback.invoke(new java.lang.Object[0]);
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void unregisterVolumeChangeListener(java.lang.Integer num, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        volumeChangeMonitor.unregisterVolumeChangeListener(num.intValue());
        webViewCallback.invoke(new java.lang.Object[0]);
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void getScreenBrightness(com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        int screenBrightness = com.unity3d.services.core.device.Device.getScreenBrightness();
        if (screenBrightness > -1) {
            webViewCallback.invoke(java.lang.Integer.valueOf(screenBrightness));
        } else if (screenBrightness == -1) {
            webViewCallback.error(com.unity3d.services.core.device.DeviceError.APPLICATION_CONTEXT_NULL, java.lang.Integer.valueOf(screenBrightness));
        } else {
            com.unity3d.services.core.log.DeviceLog.error("Unhandled screenBrightness error: " + screenBrightness);
        }
    }

    private static com.unity3d.services.core.api.DeviceInfo.StorageType getStorageTypeFromString(java.lang.String str) {
        try {
            return com.unity3d.services.core.api.DeviceInfo.StorageType.valueOf(str);
        } catch (java.lang.IllegalArgumentException e) {
            com.unity3d.services.core.log.DeviceLog.exception("Illegal argument: " + str, e);
            return null;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.services.core.api.DeviceInfo$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$unity3d$services$core$api$DeviceInfo$StorageType;

        static {
            int[] iArr = new int[com.unity3d.services.core.api.DeviceInfo.StorageType.values().length];
            $SwitchMap$com$unity3d$services$core$api$DeviceInfo$StorageType = iArr;
            try {
                iArr[com.unity3d.services.core.api.DeviceInfo.StorageType.INTERNAL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$unity3d$services$core$api$DeviceInfo$StorageType[com.unity3d.services.core.api.DeviceInfo.StorageType.EXTERNAL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }

    private static java.io.File getFileForStorageType(com.unity3d.services.core.api.DeviceInfo.StorageType storageType) {
        int i = com.unity3d.services.core.api.DeviceInfo.AnonymousClass1.$SwitchMap$com$unity3d$services$core$api$DeviceInfo$StorageType[storageType.ordinal()];
        if (i == 1) {
            return com.unity3d.services.core.properties.ClientProperties.getApplicationContext().getCacheDir();
        }
        if (i == 2) {
            return com.unity3d.services.core.properties.ClientProperties.getApplicationContext().getExternalCacheDir();
        }
        com.unity3d.services.core.log.DeviceLog.error("Unhandled storagetype: " + storageType);
        return null;
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void getFreeSpace(java.lang.String str, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        com.unity3d.services.core.api.DeviceInfo.StorageType storageTypeFromString = getStorageTypeFromString(str);
        if (storageTypeFromString == null) {
            webViewCallback.error(com.unity3d.services.core.device.DeviceError.INVALID_STORAGETYPE, str);
            return;
        }
        long freeSpace = com.unity3d.services.core.device.Device.getFreeSpace(getFileForStorageType(storageTypeFromString));
        if (freeSpace > -1) {
            webViewCallback.invoke(java.lang.Long.valueOf(freeSpace));
        } else {
            webViewCallback.error(com.unity3d.services.core.device.DeviceError.COULDNT_GET_STORAGE_LOCATION, java.lang.Long.valueOf(freeSpace));
        }
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void getTotalSpace(java.lang.String str, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        com.unity3d.services.core.api.DeviceInfo.StorageType storageTypeFromString = getStorageTypeFromString(str);
        if (storageTypeFromString == null) {
            webViewCallback.error(com.unity3d.services.core.device.DeviceError.INVALID_STORAGETYPE, str);
            return;
        }
        long totalSpace = com.unity3d.services.core.device.Device.getTotalSpace(getFileForStorageType(storageTypeFromString));
        if (totalSpace > -1) {
            webViewCallback.invoke(java.lang.Long.valueOf(totalSpace));
        } else {
            webViewCallback.error(com.unity3d.services.core.device.DeviceError.COULDNT_GET_STORAGE_LOCATION, java.lang.Long.valueOf(totalSpace));
        }
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void getBatteryLevel(com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        webViewCallback.invoke(java.lang.Float.valueOf(com.unity3d.services.core.device.Device.getBatteryLevel()));
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void getBatteryStatus(com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        webViewCallback.invoke(java.lang.Integer.valueOf(com.unity3d.services.core.device.Device.getBatteryStatus()));
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void getFreeMemory(com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        webViewCallback.invoke(java.lang.Long.valueOf(com.unity3d.services.core.device.Device.getFreeMemory()));
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void getTotalMemory(com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        webViewCallback.invoke(java.lang.Long.valueOf(com.unity3d.services.core.device.Device.getTotalMemory()));
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void getGLVersion(com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        java.lang.String gLVersion = com.unity3d.services.core.device.Device.getGLVersion();
        if (gLVersion != null) {
            webViewCallback.invoke(gLVersion);
        } else {
            webViewCallback.error(com.unity3d.services.core.device.DeviceError.COULDNT_GET_GL_VERSION, new java.lang.Object[0]);
        }
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void getApkDigest(com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        try {
            webViewCallback.invoke(com.unity3d.services.core.device.Device.getApkDigest());
        } catch (java.lang.Exception e) {
            webViewCallback.error(com.unity3d.services.core.device.DeviceError.COULDNT_GET_DIGEST, e.toString());
        }
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void getCertificateFingerprint(com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        java.lang.String certificateFingerprint = com.unity3d.services.core.device.Device.getCertificateFingerprint();
        if (certificateFingerprint != null) {
            webViewCallback.invoke(certificateFingerprint);
        } else {
            webViewCallback.error(com.unity3d.services.core.device.DeviceError.COULDNT_GET_FINGERPRINT, new java.lang.Object[0]);
        }
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void getBoard(com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        webViewCallback.invoke(com.unity3d.services.core.device.Device.getBoard());
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void getBootloader(com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        webViewCallback.invoke(com.unity3d.services.core.device.Device.getBootloader());
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void getBrand(com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        webViewCallback.invoke(com.unity3d.services.core.device.Device.getBrand());
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void getDevice(com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        webViewCallback.invoke(com.unity3d.services.core.device.Device.getDevice());
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void getHardware(com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        webViewCallback.invoke(com.unity3d.services.core.device.Device.getHardware());
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void getHost(com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        webViewCallback.invoke(com.unity3d.services.core.device.Device.getHost());
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void getProduct(com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        webViewCallback.invoke(com.unity3d.services.core.device.Device.getProduct());
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void getFingerprint(com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        webViewCallback.invoke(com.unity3d.services.core.device.Device.getFingerprint());
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void getSupportedAbis(com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.Iterator<java.lang.String> it = com.unity3d.services.core.device.Device.getSupportedAbis().iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        webViewCallback.invoke(jSONArray);
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void getSensorList(com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.List<android.hardware.Sensor> sensorList = com.unity3d.services.core.device.Device.getSensorList();
        if (sensorList != null) {
            for (android.hardware.Sensor sensor : sensorList) {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                try {
                    jSONObject.put("name", sensor.getName());
                    jSONObject.put("type", sensor.getType());
                    jSONObject.put("vendor", sensor.getVendor());
                    jSONObject.put("maximumRange", sensor.getMaximumRange());
                    jSONObject.put("power", sensor.getPower());
                    jSONObject.put("version", sensor.getVersion());
                    jSONObject.put("resolution", sensor.getResolution());
                    jSONObject.put("minDelay", sensor.getMinDelay());
                    jSONArray.put(jSONObject);
                } catch (org.json.JSONException e) {
                    webViewCallback.error(com.unity3d.services.core.device.DeviceError.JSON_ERROR, e.getMessage());
                    return;
                }
            }
        }
        webViewCallback.invoke(jSONArray);
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void getProcessInfo(com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) throws java.lang.Throwable {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        java.util.Map<java.lang.String, java.lang.String> processInfo = com.unity3d.services.core.device.Device.getProcessInfo();
        if (processInfo != null) {
            try {
                if (processInfo.containsKey(com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.KEY_STAT_CONTENT)) {
                    jSONObject.put(com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.KEY_STAT_CONTENT, processInfo.get(com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.KEY_STAT_CONTENT));
                }
                if (processInfo.containsKey("uptime")) {
                    jSONObject.put("uptime", processInfo.get("uptime"));
                }
            } catch (java.lang.Exception e) {
                com.unity3d.services.core.log.DeviceLog.exception("Error while constructing process info", e);
            }
        }
        webViewCallback.invoke(jSONObject);
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void isUSBConnected(com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        webViewCallback.invoke(java.lang.Boolean.valueOf(com.unity3d.services.core.device.Device.isUSBConnected()));
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void getCPUCount(com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        webViewCallback.invoke(java.lang.Long.valueOf(com.unity3d.services.core.device.Device.getCPUCount()));
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void getUptime(com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        webViewCallback.invoke(java.lang.Long.valueOf(com.unity3d.services.core.device.Device.getUptime()));
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void getElapsedRealtime(com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        webViewCallback.invoke(java.lang.Long.valueOf(com.unity3d.services.core.device.Device.getElapsedRealtime()));
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void getBuildId(com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        webViewCallback.invoke(com.unity3d.services.core.device.Device.getBuildId());
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void getBuildVersionIncremental(com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        webViewCallback.invoke(com.unity3d.services.core.device.Device.getBuildVersionIncremental());
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void hasX264HWDecoder(com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        webViewCallback.invoke(java.lang.Boolean.valueOf(com.unity3d.services.core.device.Device.hasX264Decoder()));
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void hasX265HWDecoder(com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        webViewCallback.invoke(java.lang.Boolean.valueOf(com.unity3d.services.core.device.Device.hasX265Decoder()));
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void hasAV1HWDecoder(com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        webViewCallback.invoke(java.lang.Boolean.valueOf(com.unity3d.services.core.device.Device.hasAV1Decoder()));
    }
}
