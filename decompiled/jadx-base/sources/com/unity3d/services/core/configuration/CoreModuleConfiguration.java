package com.unity3d.services.core.configuration;

/* JADX INFO: loaded from: classes6.dex */
public class CoreModuleConfiguration implements com.unity3d.services.core.configuration.IModuleConfiguration {
    @Override // com.unity3d.services.core.configuration.IModuleConfiguration
    public java.lang.Class[] getWebAppApiClassList() {
        return new java.lang.Class[]{com.unity3d.services.core.api.Broadcast.class, com.unity3d.services.core.api.Cache.class, com.unity3d.services.core.api.Connectivity.class, com.unity3d.services.core.api.DeviceInfo.class, com.unity3d.services.core.api.ClassDetection.class, com.unity3d.services.core.api.Storage.class, com.unity3d.services.core.api.Sdk.class, com.unity3d.services.core.api.Request.class, com.unity3d.services.core.api.Resolve.class, com.unity3d.services.core.api.Intent.class, com.unity3d.services.core.api.Lifecycle.class, com.unity3d.services.core.api.Preferences.class, com.unity3d.services.core.api.SensorInfo.class, com.unity3d.services.core.api.Permissions.class};
    }

    @Override // com.unity3d.services.core.configuration.IModuleConfiguration
    public boolean resetState(com.unity3d.services.core.configuration.Configuration configuration) {
        com.unity3d.services.core.broadcast.BroadcastMonitor.getInstance().removeAllBroadcastListeners();
        com.unity3d.services.core.cache.CacheThread.cancel();
        com.unity3d.services.core.request.WebRequestThread.cancel();
        com.unity3d.services.core.connectivity.ConnectivityMonitor.stopAll();
        com.unity3d.services.core.device.StorageManager.init(com.unity3d.services.core.properties.ClientProperties.getApplicationContext());
        com.unity3d.services.core.device.AdvertisingId.init(com.unity3d.services.core.properties.ClientProperties.getApplicationContext());
        com.unity3d.services.core.device.OpenAdvertisingId.init(com.unity3d.services.core.properties.ClientProperties.getApplicationContext());
        ((com.unity3d.services.core.device.VolumeChange) com.unity3d.services.core.misc.Utilities.getService(com.unity3d.services.core.device.VolumeChange.class)).clearAllListeners();
        return true;
    }

    @Override // com.unity3d.services.core.configuration.IModuleConfiguration
    public boolean initErrorState(com.unity3d.services.core.configuration.Configuration configuration, com.unity3d.services.core.configuration.ErrorState errorState, final java.lang.String str) {
        final com.unity3d.ads.UnityAds.UnityAdsInitializationError unityAdsInitializationError;
        com.unity3d.services.core.request.metrics.SDKMetrics.setConfiguration(configuration);
        int i = com.unity3d.services.core.configuration.CoreModuleConfiguration.AnonymousClass3.$SwitchMap$com$unity3d$services$core$configuration$ErrorState[errorState.ordinal()];
        if (i == 1) {
            unityAdsInitializationError = com.unity3d.ads.UnityAds.UnityAdsInitializationError.INTERNAL_ERROR;
        } else if (i == 2) {
            unityAdsInitializationError = com.unity3d.ads.UnityAds.UnityAdsInitializationError.AD_BLOCKER_DETECTED;
        } else {
            unityAdsInitializationError = com.unity3d.ads.UnityAds.UnityAdsInitializationError.INTERNAL_ERROR;
            str = "Unity Ads failed to initialize due to internal error";
        }
        com.unity3d.services.core.configuration.InitializationNotificationCenter.getInstance().triggerOnSdkInitializationFailed(str, errorState, 0);
        com.unity3d.services.core.misc.Utilities.runOnUiThread(new java.lang.Runnable() { // from class: com.unity3d.services.core.configuration.CoreModuleConfiguration.1
            @Override // java.lang.Runnable
            public void run() {
                com.unity3d.services.core.properties.SdkProperties.notifyInitializationFailed(unityAdsInitializationError, str);
            }
        });
        return true;
    }

    /* JADX INFO: renamed from: com.unity3d.services.core.configuration.CoreModuleConfiguration$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] $SwitchMap$com$unity3d$services$core$configuration$ErrorState;

        static {
            int[] iArr = new int[com.unity3d.services.core.configuration.ErrorState.values().length];
            $SwitchMap$com$unity3d$services$core$configuration$ErrorState = iArr;
            try {
                iArr[com.unity3d.services.core.configuration.ErrorState.CreateWebApp.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$unity3d$services$core$configuration$ErrorState[com.unity3d.services.core.configuration.ErrorState.InitModules.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }

    @Override // com.unity3d.services.core.configuration.IModuleConfiguration
    public boolean initCompleteState(com.unity3d.services.core.configuration.Configuration configuration) {
        com.unity3d.services.core.request.metrics.SDKMetrics.setConfiguration(configuration);
        com.unity3d.services.core.configuration.InitializationNotificationCenter.getInstance().triggerOnSdkInitialized();
        com.unity3d.services.core.misc.Utilities.runOnUiThread(new java.lang.Runnable() { // from class: com.unity3d.services.core.configuration.CoreModuleConfiguration.2
            @Override // java.lang.Runnable
            public void run() {
                com.unity3d.services.core.properties.SdkProperties.notifyInitializationComplete();
            }
        });
        collectMetrics(configuration);
        return true;
    }

    private void collectMetrics(com.unity3d.services.core.configuration.Configuration configuration) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (com.unity3d.services.core.device.Device.hasX264Decoder()) {
            arrayList.add(new com.unity3d.services.core.request.metrics.Metric("native_device_decoder_x264_success"));
        } else {
            arrayList.add(new com.unity3d.services.core.request.metrics.Metric("native_device_decoder_x264_failure"));
        }
        if (com.unity3d.services.core.device.Device.hasX265Decoder()) {
            arrayList.add(new com.unity3d.services.core.request.metrics.Metric("native_device_decoder_x265_success"));
        } else {
            arrayList.add(new com.unity3d.services.core.request.metrics.Metric("native_device_decoder_x265_failure"));
        }
        if (com.unity3d.services.core.device.Device.hasAV1Decoder()) {
            arrayList.add(new com.unity3d.services.core.request.metrics.Metric("native_device_decoder_av1_success"));
        } else {
            arrayList.add(new com.unity3d.services.core.request.metrics.Metric("native_device_decoder_av1_failure"));
        }
        com.unity3d.services.core.request.metrics.SDKMetricsSender sDKMetricsSender = (com.unity3d.services.core.request.metrics.SDKMetricsSender) com.unity3d.services.core.misc.Utilities.getService(com.unity3d.services.core.request.metrics.SDKMetricsSender.class);
        sDKMetricsSender.sendMetrics(arrayList);
        checkForPC(configuration, sDKMetricsSender);
    }

    private void checkForPC(com.unity3d.services.core.configuration.Configuration configuration, com.unity3d.services.core.request.metrics.SDKMetricsSender sDKMetricsSender) {
        android.content.Context applicationContext;
        if (!configuration.getExperiments().isPCCheckEnabled() || (applicationContext = com.unity3d.services.core.properties.ClientProperties.getApplicationContext()) == null) {
            return;
        }
        if (applicationContext.getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE")) {
            sDKMetricsSender.sendMetric(new com.unity3d.services.core.request.metrics.Metric("native_device_is_pc_success"));
        } else {
            sDKMetricsSender.sendMetric(new com.unity3d.services.core.request.metrics.Metric("native_device_is_pc_failure"));
        }
    }
}
