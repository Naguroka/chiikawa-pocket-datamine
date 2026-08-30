package com.adjust.sdk;

/* JADX INFO: loaded from: classes3.dex */
public class AdjustConfig {
    public static final java.lang.String ENVIRONMENT_PRODUCTION = "production";
    public static final java.lang.String ENVIRONMENT_SANDBOX = "sandbox";
    java.lang.String appToken;
    java.lang.String basePath;
    java.util.ArrayList<com.adjust.sdk.OnAdidReadListener> cachedAdidReadCallbacks = new java.util.ArrayList<>();
    java.util.ArrayList<com.adjust.sdk.OnAttributionReadListener> cachedAttributionReadCallbacks = new java.util.ArrayList<>();
    com.adjust.sdk.OnDeeplinkResolvedListener cachedDeeplinkResolutionCallback;
    android.content.Context context;
    boolean coppaComplianceEnabled;
    java.lang.String defaultTracker;
    java.lang.String environment;
    java.lang.Integer eventDeduplicationIdsMaxSize;
    java.lang.String externalDeviceId;
    java.lang.String fbAppId;
    java.lang.String gdprPath;
    java.lang.Boolean isCostDataInAttributionEnabled;
    boolean isDataResidency;
    boolean isDeviceIdsReadingOnceEnabled;
    boolean isPreinstallTrackingEnabled;
    boolean isSendingInBackgroundEnabled;
    com.adjust.sdk.ILogger logger;
    com.adjust.sdk.OnAttributionChangedListener onAttributionChangedListener;
    com.adjust.sdk.OnDeferredDeeplinkResponseListener onDeferredDeeplinkResponseListener;
    com.adjust.sdk.OnEventTrackingFailedListener onEventTrackingFailedListener;
    com.adjust.sdk.OnEventTrackingSucceededListener onEventTrackingSucceededListener;
    com.adjust.sdk.OnSessionTrackingFailedListener onSessionTrackingFailedListener;
    com.adjust.sdk.OnSessionTrackingSucceededListener onSessionTrackingSucceededListener;
    boolean playStoreKidsComplianceEnabled;
    com.adjust.sdk.AdjustInstance.PreLaunchActions preLaunchActions;
    java.lang.String preinstallFilePath;
    java.lang.String processName;
    java.lang.String purchaseVerificationPath;
    java.lang.String pushToken;
    java.lang.String sdkPrefix;
    java.lang.Boolean startEnabled;
    boolean startOffline;
    java.lang.String subscriptionPath;
    java.util.List<java.lang.String> urlStrategyDomains;
    boolean useSubdomains;

    public AdjustConfig(android.content.Context context, java.lang.String str, java.lang.String str2) {
        init(context, str, str2, false);
    }

    private boolean checkAppToken(java.lang.String str) {
        if (str == null) {
            this.logger.error("Missing App Token", new java.lang.Object[0]);
            return false;
        }
        if (str.length() == 12) {
            return true;
        }
        this.logger.error("Malformed App Token '%s'", str);
        return false;
    }

    private boolean checkContext(android.content.Context context) {
        if (context == null) {
            this.logger.error("Missing context", new java.lang.Object[0]);
            return false;
        }
        if (com.adjust.sdk.Util.checkPermission(context, "android.permission.INTERNET")) {
            return true;
        }
        this.logger.error("Missing permission: INTERNET", new java.lang.Object[0]);
        return false;
    }

    private boolean checkEnvironment(java.lang.String str) {
        if (str == null) {
            this.logger.error("Missing environment", new java.lang.Object[0]);
            return false;
        }
        if (str.equals(ENVIRONMENT_SANDBOX)) {
            this.logger.warnInProduction("SANDBOX: Adjust is running in Sandbox mode. Use this setting for testing. Don't forget to set the environment to `production` before publishing!", new java.lang.Object[0]);
            return true;
        }
        if (str.equals(ENVIRONMENT_PRODUCTION)) {
            this.logger.warnInProduction("PRODUCTION: Adjust is running in Production mode. Use this setting only for the build that you want to publish. Set the environment to `sandbox` if you want to test your app!", new java.lang.Object[0]);
            return true;
        }
        this.logger.error("Unknown environment '%s'", str);
        return false;
    }

    private void init(android.content.Context context, java.lang.String str, java.lang.String str2, boolean z) {
        this.logger = com.adjust.sdk.AdjustFactory.getLogger();
        setLogLevel((z && ENVIRONMENT_PRODUCTION.equals(str2)) ? com.adjust.sdk.LogLevel.SUPPRESS : com.adjust.sdk.LogLevel.INFO, str2);
        if (context != null) {
            context = context.getApplicationContext();
        }
        this.context = context;
        this.appToken = str;
        this.environment = str2;
        this.isSendingInBackgroundEnabled = false;
        this.isPreinstallTrackingEnabled = false;
        this.isDeviceIdsReadingOnceEnabled = false;
        this.coppaComplianceEnabled = false;
        this.playStoreKidsComplianceEnabled = false;
    }

    public void enableCoppaCompliance() {
        this.coppaComplianceEnabled = true;
    }

    public void enableCostDataInAttribution() {
        this.isCostDataInAttributionEnabled = java.lang.Boolean.TRUE;
    }

    public void enableDeviceIdsReadingOnce() {
        this.isDeviceIdsReadingOnceEnabled = true;
    }

    public void enablePlayStoreKidsCompliance() {
        this.playStoreKidsComplianceEnabled = true;
    }

    public void enablePreinstallTracking() {
        this.isPreinstallTrackingEnabled = true;
    }

    public void enableSendingInBackground() {
        this.isSendingInBackgroundEnabled = true;
    }

    public java.lang.String getAppToken() {
        return this.appToken;
    }

    public android.content.Context getContext() {
        return this.context;
    }

    public java.lang.Boolean getCostDataInAttributionEnabled() {
        return this.isCostDataInAttributionEnabled;
    }

    public java.lang.String getDefaultTracker() {
        return this.defaultTracker;
    }

    public java.lang.String getEnvironment() {
        return this.environment;
    }

    public java.lang.Integer getEventDeduplicationIdsMaxSize() {
        return this.eventDeduplicationIdsMaxSize;
    }

    public java.lang.String getExternalDeviceId() {
        return this.externalDeviceId;
    }

    public java.lang.String getFbAppId() {
        return this.fbAppId;
    }

    public com.adjust.sdk.ILogger getLogger() {
        return this.logger;
    }

    public com.adjust.sdk.OnAttributionChangedListener getOnAttributionChangedListener() {
        return this.onAttributionChangedListener;
    }

    public com.adjust.sdk.OnDeferredDeeplinkResponseListener getOnDeeplinkResponseListener() {
        return this.onDeferredDeeplinkResponseListener;
    }

    public com.adjust.sdk.OnEventTrackingFailedListener getOnEventTrackingFailedListener() {
        return this.onEventTrackingFailedListener;
    }

    public com.adjust.sdk.OnEventTrackingSucceededListener getOnEventTrackingSucceededListener() {
        return this.onEventTrackingSucceededListener;
    }

    public com.adjust.sdk.OnSessionTrackingFailedListener getOnSessionTrackingFailedListener() {
        return this.onSessionTrackingFailedListener;
    }

    public com.adjust.sdk.OnSessionTrackingSucceededListener getOnSessionTrackingSucceededListener() {
        return this.onSessionTrackingSucceededListener;
    }

    public java.lang.String getPreinstallFilePath() {
        return this.preinstallFilePath;
    }

    public java.lang.String getProcessName() {
        return this.processName;
    }

    public java.lang.String getSdkPrefix() {
        return this.sdkPrefix;
    }

    public java.util.List<java.lang.String> getUrlStrategyDomains() {
        return this.urlStrategyDomains;
    }

    public boolean isCoppaComplianceEnabled() {
        return this.coppaComplianceEnabled;
    }

    public boolean isDeviceIdsReadingOnceEnabled() {
        return this.isDeviceIdsReadingOnceEnabled;
    }

    public boolean isPlayStoreKidsComplianceEnabled() {
        return this.playStoreKidsComplianceEnabled;
    }

    public boolean isPreinstallTrackingEnabled() {
        return this.isPreinstallTrackingEnabled;
    }

    public boolean isSendingInBackgroundEnabled() {
        return this.isSendingInBackgroundEnabled;
    }

    public boolean isValid() {
        return checkAppToken(this.appToken) && checkEnvironment(this.environment) && checkContext(this.context);
    }

    public void setDefaultTracker(java.lang.String str) {
        this.defaultTracker = str;
    }

    public void setEventDeduplicationIdsMaxSize(java.lang.Integer num) {
        this.eventDeduplicationIdsMaxSize = num;
    }

    public void setExternalDeviceId(java.lang.String str) {
        this.externalDeviceId = str;
    }

    public void setFbAppId(java.lang.String str) {
        this.fbAppId = str;
    }

    public void setLogLevel(com.adjust.sdk.LogLevel logLevel) {
        setLogLevel(logLevel, this.environment);
    }

    public void setOnAttributionChangedListener(com.adjust.sdk.OnAttributionChangedListener onAttributionChangedListener) {
        this.onAttributionChangedListener = onAttributionChangedListener;
    }

    public void setOnDeferredDeeplinkResponseListener(com.adjust.sdk.OnDeferredDeeplinkResponseListener onDeferredDeeplinkResponseListener) {
        this.onDeferredDeeplinkResponseListener = onDeferredDeeplinkResponseListener;
    }

    public void setOnEventTrackingFailedListener(com.adjust.sdk.OnEventTrackingFailedListener onEventTrackingFailedListener) {
        this.onEventTrackingFailedListener = onEventTrackingFailedListener;
    }

    public void setOnEventTrackingSucceededListener(com.adjust.sdk.OnEventTrackingSucceededListener onEventTrackingSucceededListener) {
        this.onEventTrackingSucceededListener = onEventTrackingSucceededListener;
    }

    public void setOnSessionTrackingFailedListener(com.adjust.sdk.OnSessionTrackingFailedListener onSessionTrackingFailedListener) {
        this.onSessionTrackingFailedListener = onSessionTrackingFailedListener;
    }

    public void setOnSessionTrackingSucceededListener(com.adjust.sdk.OnSessionTrackingSucceededListener onSessionTrackingSucceededListener) {
        this.onSessionTrackingSucceededListener = onSessionTrackingSucceededListener;
    }

    public void setPreinstallFilePath(java.lang.String str) {
        this.preinstallFilePath = str;
    }

    public void setProcessName(java.lang.String str) {
        this.processName = str;
    }

    public void setSdkPrefix(java.lang.String str) {
        this.sdkPrefix = str;
    }

    public void setUrlStrategy(java.util.List<java.lang.String> list, boolean z, boolean z2) {
        if (list == null || list.isEmpty()) {
            this.logger.error("Invalid URL strategy domains array", new java.lang.Object[0]);
            return;
        }
        this.urlStrategyDomains = list;
        this.useSubdomains = z;
        this.isDataResidency = z2;
    }

    public AdjustConfig(android.content.Context context, java.lang.String str, java.lang.String str2, boolean z) {
        init(context, str, str2, z);
    }

    private void setLogLevel(com.adjust.sdk.LogLevel logLevel, java.lang.String str) {
        this.logger.setLogLevel(logLevel, ENVIRONMENT_PRODUCTION.equals(str));
    }
}
