package com.unity3d.services;

/* JADX INFO: compiled from: UnityServices.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u001fB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u0002J.\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u001c\u001a\u00020\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0007R*\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0087\u000e¢\u0006\u0012\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u000b\u0010\u0002\u001a\u0004\b\n\u0010\u0007R\u001c\u0010\f\u001a\u00020\u00048\u0006X\u0087D¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u0002\u001a\u0004\b\f\u0010\u0007R\u001a\u0010\u000e\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\u0002\u001a\u0004\b\u0011\u0010\u0012¨\u0006 "}, d2 = {"Lcom/unity3d/services/UnityServices;", "", "()V", "debugMode", "", "getDebugMode$annotations", "getDebugMode", "()Z", "setDebugMode", "(Z)V", "isInitialized", "isInitialized$annotations", "isSupported", "isSupported$annotations", "version", "", "getVersion$annotations", com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge.versionMethodName, "()Ljava/lang/String;", "createExpectedParametersString", "fieldName", "current", "received", com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase.initializeMethodName, "", "context", "Landroid/content/Context;", com.unity3d.ads.core.domain.AndroidGetAdPlayerContext.KEY_GAME_ID, "testMode", "initializationListener", "Lcom/unity3d/ads/IUnityAdsInitializationListener;", "UnityServicesError", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class UnityServices {
    public static final com.unity3d.services.UnityServices INSTANCE = new com.unity3d.services.UnityServices();
    private static final boolean isSupported = true;

    /* JADX INFO: compiled from: UnityServices.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/unity3d/services/UnityServices$UnityServicesError;", "", "(Ljava/lang/String;I)V", "INVALID_ARGUMENT", "INIT_SANITY_CHECK_FAIL", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum UnityServicesError {
        INVALID_ARGUMENT,
        INIT_SANITY_CHECK_FAIL
    }

    /* JADX INFO: compiled from: UnityServices.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.unity3d.services.core.properties.SdkProperties.InitializationState.values().length];
            try {
                iArr[com.unity3d.services.core.properties.SdkProperties.InitializationState.INITIALIZED_SUCCESSFULLY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.unity3d.services.core.properties.SdkProperties.InitializationState.INITIALIZED_FAILED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.unity3d.services.core.properties.SdkProperties.InitializationState.INITIALIZING.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @kotlin.jvm.JvmStatic
    public static /* synthetic */ void getDebugMode$annotations() {
    }

    @kotlin.jvm.JvmStatic
    public static /* synthetic */ void getVersion$annotations() {
    }

    @kotlin.jvm.JvmStatic
    public static /* synthetic */ void isInitialized$annotations() {
    }

    @kotlin.jvm.JvmStatic
    public static /* synthetic */ void isSupported$annotations() {
    }

    private UnityServices() {
    }

    @kotlin.jvm.JvmStatic
    public static final void initialize(android.content.Context context, java.lang.String gameId, boolean testMode, com.unity3d.ads.IUnityAdsInitializationListener initializationListener) {
        java.lang.Integer intOrNull;
        java.lang.String str;
        com.unity3d.services.core.log.DeviceLog.entered();
        if (gameId == null || (intOrNull = kotlin.text.StringsKt.toIntOrNull(gameId)) == null) {
            if (initializationListener != null) {
                initializationListener.onInitializationFailed(com.unity3d.ads.UnityAds.UnityAdsInitializationError.INVALID_ARGUMENT, "gameId \"" + gameId + "\" should be a number.");
                return;
            }
            return;
        }
        intOrNull.intValue();
        if (com.unity3d.services.core.properties.SdkProperties.getCurrentInitializationState() != com.unity3d.services.core.properties.SdkProperties.InitializationState.NOT_INITIALIZED) {
            java.lang.String gameId2 = com.unity3d.services.core.properties.ClientProperties.getGameId();
            boolean zIsTestMode = com.unity3d.services.core.properties.SdkProperties.isTestMode();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            if (gameId2 != null && !kotlin.jvm.internal.Intrinsics.areEqual(gameId2, gameId)) {
                com.unity3d.services.core.configuration.InitializeEventsMetricSender.getInstance().sendMetric(com.unity3d.services.core.request.metrics.InitMetric.newInitGameIdChanged(gameId2, gameId));
                java.lang.StringBuilder sbAppend = sb.append(INSTANCE.createExpectedParametersString("Game ID", gameId2, gameId));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sbAppend, "append(value)");
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sbAppend.append('\n'), "append('\\n')");
            } else {
                com.unity3d.services.core.configuration.InitializeEventsMetricSender.getInstance().sendMetric(com.unity3d.services.core.request.metrics.InitMetric.newInitGameIdSame(gameId2, gameId));
            }
            if (zIsTestMode != testMode) {
                com.unity3d.services.core.configuration.InitializeEventsMetricSender.getInstance().sendMetric(com.unity3d.services.core.request.metrics.InitMetric.newInitTestModeChanged(java.lang.Boolean.valueOf(zIsTestMode), java.lang.Boolean.valueOf(testMode)));
                java.lang.StringBuilder sbAppend2 = sb.append(INSTANCE.createExpectedParametersString("Test Mode", java.lang.Boolean.valueOf(zIsTestMode), java.lang.Boolean.valueOf(testMode)));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sbAppend2, "append(value)");
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sbAppend2.append('\n'), "append('\\n')");
            } else {
                com.unity3d.services.core.configuration.InitializeEventsMetricSender.getInstance().sendMetric(com.unity3d.services.core.request.metrics.InitMetric.newInitTestModeSame(java.lang.Boolean.valueOf(zIsTestMode), java.lang.Boolean.valueOf(testMode)));
            }
            java.lang.String string = sb.toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
            if (string.length() > 0) {
                str = "different parameters: \n" + string;
            } else {
                str = "the same Game ID: " + gameId + " and Test Mode: " + testMode + " values.";
            }
            com.unity3d.services.core.log.DeviceLog.warning("Unity Ads SDK initialize has already been called with " + str + " Responding with first initialization result.");
        }
        com.unity3d.services.core.properties.SdkProperties.addInitializationListener(initializationListener);
        com.unity3d.services.core.properties.SdkProperties.InitializationState currentInitializationState = com.unity3d.services.core.properties.SdkProperties.getCurrentInitializationState();
        int i = currentInitializationState == null ? -1 : com.unity3d.services.UnityServices.WhenMappings.$EnumSwitchMapping$0[currentInitializationState.ordinal()];
        if (i == 1) {
            com.unity3d.services.core.properties.SdkProperties.notifyInitializationComplete();
            return;
        }
        if (i != 2) {
            if (i == 3) {
                return;
            } else {
                com.unity3d.services.core.properties.SdkProperties.setInitializeState(com.unity3d.services.core.properties.SdkProperties.InitializationState.INITIALIZING);
            }
        } else {
            if (!com.unity3d.services.UnityAdsSDK.INSTANCE.isAlternativeFlowEnabled()) {
                com.unity3d.services.core.properties.SdkProperties.notifyInitializationFailed(com.unity3d.ads.UnityAds.UnityAdsInitializationError.INTERNAL_ERROR, "Unity Ads SDK failed to initialize due to previous failed reason");
                return;
            }
            com.unity3d.services.core.properties.SdkProperties.setInitializeState(com.unity3d.services.core.properties.SdkProperties.InitializationState.INITIALIZING);
        }
        com.unity3d.services.core.properties.ClientProperties.setGameId(gameId);
        com.unity3d.services.core.properties.SdkProperties.setTestMode(testMode);
        if (!isSupported) {
            com.unity3d.services.core.log.DeviceLog.error("Error while initializing Unity Services: device is not supported");
            com.unity3d.services.core.properties.SdkProperties.notifyInitializationFailed(com.unity3d.ads.UnityAds.UnityAdsInitializationError.INTERNAL_ERROR, "Unity Ads SDK failed to initialize due to device is not supported");
            return;
        }
        com.unity3d.services.core.properties.SdkProperties.setInitializationTime(com.unity3d.services.core.device.Device.getElapsedRealtime());
        com.unity3d.services.core.properties.SdkProperties.setInitializationTimeSinceEpoch(java.lang.System.currentTimeMillis());
        if (gameId.length() == 0) {
            com.unity3d.services.core.log.DeviceLog.error("Error while initializing Unity Services: empty game ID, halting Unity Ads init");
            com.unity3d.services.core.properties.SdkProperties.notifyInitializationFailed(com.unity3d.ads.UnityAds.UnityAdsInitializationError.INVALID_ARGUMENT, "Unity Ads SDK failed to initialize due to empty game ID");
            return;
        }
        if (context == null) {
            com.unity3d.services.core.log.DeviceLog.error("Error while initializing Unity Services: null context, halting Unity Ads init");
            com.unity3d.services.core.properties.SdkProperties.notifyInitializationFailed(com.unity3d.ads.UnityAds.UnityAdsInitializationError.INVALID_ARGUMENT, "Unity Ads SDK failed to initialize due to null context");
            return;
        }
        if (context instanceof android.app.Application) {
            com.unity3d.services.core.properties.ClientProperties.setApplication((android.app.Application) context);
        } else if (context instanceof android.app.Activity) {
            android.app.Activity activity = (android.app.Activity) context;
            if (activity.getApplication() != null) {
                com.unity3d.services.core.properties.ClientProperties.setApplication(activity.getApplication());
            } else {
                com.unity3d.services.core.log.DeviceLog.error("Error while initializing Unity Services: cannot retrieve application from context, halting Unity Ads init");
                com.unity3d.services.core.properties.SdkProperties.notifyInitializationFailed(com.unity3d.ads.UnityAds.UnityAdsInitializationError.INVALID_ARGUMENT, "Unity Ads SDK failed to initialize due to inability to retrieve application from context");
                return;
            }
        } else {
            com.unity3d.services.core.log.DeviceLog.error("Error while initializing Unity Services: invalid context, halting Unity Ads init");
            com.unity3d.services.core.properties.SdkProperties.notifyInitializationFailed(com.unity3d.ads.UnityAds.UnityAdsInitializationError.INVALID_ARGUMENT, "Unity Ads SDK failed to initialize due to invalid context");
            return;
        }
        com.unity3d.services.core.log.DeviceLog.info("Initializing Unity Services " + com.unity3d.services.core.properties.SdkProperties.getVersionName() + " (" + com.unity3d.services.core.properties.SdkProperties.getVersionCode() + ") with game id " + gameId + " in " + (testMode ? "test mode" : "production mode") + ", session " + com.unity3d.services.core.properties.Session.INSTANCE.getId());
        com.unity3d.services.core.properties.SdkProperties.setDebugMode(com.unity3d.services.core.properties.SdkProperties.getDebugMode());
        if (context.getApplicationContext() != null) {
            com.unity3d.services.core.properties.ClientProperties.setApplicationContext(context.getApplicationContext());
            if (!com.unity3d.services.core.configuration.EnvironmentCheck.isEnvironmentOk()) {
                com.unity3d.services.core.log.DeviceLog.error("Error during Unity Services environment check, halting Unity Services init");
                com.unity3d.services.core.properties.SdkProperties.notifyInitializationFailed(com.unity3d.ads.UnityAds.UnityAdsInitializationError.INTERNAL_ERROR, "Unity Ads SDK failed to initialize due to environment check failed");
                return;
            } else {
                com.unity3d.services.core.log.DeviceLog.info("Unity Services environment check OK");
                com.unity3d.services.core.lifecycle.CachedLifecycle.register();
                com.unity3d.services.UnityAdsSDK.INSTANCE.initialize();
                return;
            }
        }
        com.unity3d.services.core.log.DeviceLog.error("Error while initializing Unity Services: cannot retrieve application context, halting Unity Ads init");
        com.unity3d.services.core.properties.SdkProperties.notifyInitializationFailed(com.unity3d.ads.UnityAds.UnityAdsInitializationError.INVALID_ARGUMENT, "Unity Ads SDK failed to initialize due to inability to retrieve application context");
    }

    public static final boolean isSupported() {
        return isSupported;
    }

    public static final boolean isInitialized() {
        return com.unity3d.services.core.properties.SdkProperties.isInitialized();
    }

    public static final java.lang.String getVersion() {
        java.lang.String versionName = com.unity3d.services.core.properties.SdkProperties.getVersionName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(versionName, "getVersionName()");
        return versionName;
    }

    public static final boolean getDebugMode() {
        return com.unity3d.services.core.properties.SdkProperties.getDebugMode();
    }

    public static final void setDebugMode(boolean z) {
        com.unity3d.services.core.properties.SdkProperties.setDebugMode(z);
    }

    private final java.lang.String createExpectedParametersString(java.lang.String fieldName, java.lang.Object current, java.lang.Object received) {
        return "- " + fieldName + " Current: " + current + " | Received: " + received;
    }
}
