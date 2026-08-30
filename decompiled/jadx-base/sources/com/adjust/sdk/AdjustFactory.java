package com.adjust.sdk;

/* JADX INFO: loaded from: classes3.dex */
public class AdjustFactory {
    private static com.adjust.sdk.IActivityHandler activityHandler = null;
    private static com.adjust.sdk.IAttributionHandler attributionHandler = null;
    private static java.lang.String baseUrl = null;
    private static com.adjust.sdk.network.UtilNetworking.IConnectionOptions connectionOptions = null;
    private static java.lang.String gdprUrl = null;
    private static com.adjust.sdk.network.UtilNetworking.IHttpsURLConnectionProvider httpsURLConnectionProvider = null;
    private static boolean ignoreSystemLifecycleBootstrap = false;
    private static com.adjust.sdk.BackoffStrategy installSessionBackoffStrategy = null;
    private static com.adjust.sdk.ILogger logger = null;
    private static com.adjust.sdk.IPackageHandler packageHandler = null;
    private static com.adjust.sdk.BackoffStrategy packageHandlerBackoffStrategy = null;
    private static com.adjust.sdk.IPurchaseVerificationHandler purchaseVerificationHandler = null;
    private static java.lang.String purchaseVerificationUrl = null;
    private static com.adjust.sdk.BackoffStrategy sdkClickBackoffStrategy = null;
    private static com.adjust.sdk.ISdkClickHandler sdkClickHandler = null;
    private static long sessionInterval = -1;
    private static java.lang.String subscriptionUrl = null;
    private static long subsessionInterval = -1;
    private static long timerInterval = -1;
    private static long timerStart = -1;
    private static boolean tryInstallReferrer = true;

    public static class URLGetConnection {
        javax.net.ssl.HttpsURLConnection httpsURLConnection;
        java.net.URL url;

        public URLGetConnection(javax.net.ssl.HttpsURLConnection httpsURLConnection, java.net.URL url) {
            this.httpsURLConnection = httpsURLConnection;
            this.url = url;
        }
    }

    private static java.lang.String byte2HexFormatted(byte[] bArr) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            java.lang.String hexString = java.lang.Integer.toHexString(b);
            int length = hexString.length();
            if (length == 1) {
                hexString = "0".concat(hexString);
            }
            if (length > 2) {
                hexString = hexString.substring(length - 2, length);
            }
            sb.append(hexString.toUpperCase());
        }
        return sb.toString();
    }

    public static com.adjust.sdk.IActivityHandler getActivityHandler(com.adjust.sdk.AdjustConfig adjustConfig) {
        com.adjust.sdk.IActivityHandler iActivityHandler = activityHandler;
        if (iActivityHandler == null) {
            return com.adjust.sdk.ActivityHandler.getInstance(adjustConfig);
        }
        iActivityHandler.init(adjustConfig);
        return activityHandler;
    }

    public static com.adjust.sdk.IAttributionHandler getAttributionHandler(com.adjust.sdk.IActivityHandler iActivityHandler, boolean z, com.adjust.sdk.network.IActivityPackageSender iActivityPackageSender) {
        com.adjust.sdk.IAttributionHandler iAttributionHandler = attributionHandler;
        if (iAttributionHandler == null) {
            return new com.adjust.sdk.AttributionHandler(iActivityHandler, z, iActivityPackageSender);
        }
        iAttributionHandler.init(iActivityHandler, z, iActivityPackageSender);
        return attributionHandler;
    }

    public static java.lang.String getBaseUrl() {
        return baseUrl;
    }

    public static com.adjust.sdk.network.UtilNetworking.IConnectionOptions getConnectionOptions() {
        com.adjust.sdk.network.UtilNetworking.IConnectionOptions iConnectionOptions = connectionOptions;
        return iConnectionOptions == null ? com.adjust.sdk.network.UtilNetworking.createDefaultConnectionOptions() : iConnectionOptions;
    }

    public static java.lang.String getGdprUrl() {
        return gdprUrl;
    }

    public static com.adjust.sdk.network.UtilNetworking.IHttpsURLConnectionProvider getHttpsURLConnectionProvider() {
        com.adjust.sdk.network.UtilNetworking.IHttpsURLConnectionProvider iHttpsURLConnectionProvider = httpsURLConnectionProvider;
        return iHttpsURLConnectionProvider == null ? com.adjust.sdk.network.UtilNetworking.createDefaultHttpsURLConnectionProvider() : iHttpsURLConnectionProvider;
    }

    public static com.adjust.sdk.BackoffStrategy getInstallSessionBackoffStrategy() {
        com.adjust.sdk.BackoffStrategy backoffStrategy = installSessionBackoffStrategy;
        return backoffStrategy == null ? com.adjust.sdk.BackoffStrategy.SHORT_WAIT : backoffStrategy;
    }

    public static com.adjust.sdk.ILogger getLogger() {
        if (logger == null) {
            logger = new com.adjust.sdk.Logger();
        }
        return logger;
    }

    public static com.adjust.sdk.IPackageHandler getPackageHandler(com.adjust.sdk.IActivityHandler iActivityHandler, android.content.Context context, boolean z, com.adjust.sdk.network.IActivityPackageSender iActivityPackageSender) {
        com.adjust.sdk.IPackageHandler iPackageHandler = packageHandler;
        if (iPackageHandler == null) {
            return new com.adjust.sdk.PackageHandler(iActivityHandler, context, z, iActivityPackageSender);
        }
        iPackageHandler.init(iActivityHandler, context, z, iActivityPackageSender);
        return packageHandler;
    }

    public static com.adjust.sdk.BackoffStrategy getPackageHandlerBackoffStrategy() {
        com.adjust.sdk.BackoffStrategy backoffStrategy = packageHandlerBackoffStrategy;
        return backoffStrategy == null ? com.adjust.sdk.BackoffStrategy.LONG_WAIT : backoffStrategy;
    }

    public static com.adjust.sdk.IPurchaseVerificationHandler getPurchaseVerificationHandler(com.adjust.sdk.IActivityHandler iActivityHandler, boolean z, com.adjust.sdk.network.IActivityPackageSender iActivityPackageSender) {
        com.adjust.sdk.IPurchaseVerificationHandler iPurchaseVerificationHandler = purchaseVerificationHandler;
        if (iPurchaseVerificationHandler == null) {
            return new com.adjust.sdk.PurchaseVerificationHandler(iActivityHandler, z, iActivityPackageSender);
        }
        iPurchaseVerificationHandler.init(iActivityHandler, z, iActivityPackageSender);
        return purchaseVerificationHandler;
    }

    public static java.lang.String getPurchaseVerificationUrl() {
        return purchaseVerificationUrl;
    }

    public static com.adjust.sdk.BackoffStrategy getSdkClickBackoffStrategy() {
        com.adjust.sdk.BackoffStrategy backoffStrategy = sdkClickBackoffStrategy;
        return backoffStrategy == null ? com.adjust.sdk.BackoffStrategy.SHORT_WAIT : backoffStrategy;
    }

    public static com.adjust.sdk.ISdkClickHandler getSdkClickHandler(com.adjust.sdk.IActivityHandler iActivityHandler, boolean z, com.adjust.sdk.network.IActivityPackageSender iActivityPackageSender) {
        com.adjust.sdk.ISdkClickHandler iSdkClickHandler = sdkClickHandler;
        if (iSdkClickHandler == null) {
            return new com.adjust.sdk.SdkClickHandler(iActivityHandler, z, iActivityPackageSender);
        }
        iSdkClickHandler.init(iActivityHandler, z, iActivityPackageSender);
        return sdkClickHandler;
    }

    public static long getSessionInterval() {
        long j = sessionInterval;
        if (j == -1) {
            return 1800000L;
        }
        return j;
    }

    public static java.lang.String getSubscriptionUrl() {
        return subscriptionUrl;
    }

    public static long getSubsessionInterval() {
        long j = subsessionInterval;
        if (j == -1) {
            return 1000L;
        }
        return j;
    }

    public static long getTimerInterval() {
        long j = timerInterval;
        if (j == -1) {
            return 60000L;
        }
        return j;
    }

    public static long getTimerStart() {
        long j = timerStart;
        if (j == -1) {
            return 60000L;
        }
        return j;
    }

    public static boolean getTryInstallReferrer() {
        return tryInstallReferrer;
    }

    public static boolean isSystemLifecycleBootstrapIgnored() {
        return ignoreSystemLifecycleBootstrap;
    }

    public static void setActivityHandler(com.adjust.sdk.IActivityHandler iActivityHandler) {
        activityHandler = iActivityHandler;
    }

    public static void setAttributionHandler(com.adjust.sdk.IAttributionHandler iAttributionHandler) {
        attributionHandler = iAttributionHandler;
    }

    public static void setBaseUrl(java.lang.String str) {
        baseUrl = str;
    }

    public static void setConnectionOptions(com.adjust.sdk.network.UtilNetworking.IConnectionOptions iConnectionOptions) {
        connectionOptions = iConnectionOptions;
    }

    public static void setGdprUrl(java.lang.String str) {
        gdprUrl = str;
    }

    public static void setHttpsURLConnectionProvider(com.adjust.sdk.network.UtilNetworking.IHttpsURLConnectionProvider iHttpsURLConnectionProvider) {
        httpsURLConnectionProvider = iHttpsURLConnectionProvider;
    }

    public static void setIgnoreSystemLifecycleBootstrap(boolean z) {
        ignoreSystemLifecycleBootstrap = z;
    }

    public static void setLogger(com.adjust.sdk.ILogger iLogger) {
        logger = iLogger;
    }

    public static void setPackageHandler(com.adjust.sdk.IPackageHandler iPackageHandler) {
        packageHandler = iPackageHandler;
    }

    public static void setPackageHandlerBackoffStrategy(com.adjust.sdk.BackoffStrategy backoffStrategy) {
        packageHandlerBackoffStrategy = backoffStrategy;
    }

    public static void setPurchaseVerificationUrl(java.lang.String str) {
        purchaseVerificationUrl = str;
    }

    public static void setSdkClickBackoffStrategy(com.adjust.sdk.BackoffStrategy backoffStrategy) {
        sdkClickBackoffStrategy = backoffStrategy;
    }

    public static void setSdkClickHandler(com.adjust.sdk.ISdkClickHandler iSdkClickHandler) {
        sdkClickHandler = iSdkClickHandler;
    }

    public static void setSessionInterval(long j) {
        sessionInterval = j;
    }

    public static void setSubscriptionUrl(java.lang.String str) {
        subscriptionUrl = str;
    }

    public static void setSubsessionInterval(long j) {
        subsessionInterval = j;
    }

    public static void setTimerInterval(long j) {
        timerInterval = j;
    }

    public static void setTimerStart(long j) {
        timerStart = j;
    }

    public static void setTryInstallReferrer(boolean z) {
        tryInstallReferrer = z;
    }

    public static void teardown(android.content.Context context) {
        if (context != null) {
            com.adjust.sdk.ActivityHandler.deleteState(context);
            com.adjust.sdk.PackageHandler.deleteState(context);
        }
        packageHandler = null;
        attributionHandler = null;
        activityHandler = null;
        logger = null;
        sdkClickHandler = null;
        timerInterval = -1L;
        timerStart = -1L;
        sessionInterval = -1L;
        subsessionInterval = -1L;
        sdkClickBackoffStrategy = null;
        packageHandlerBackoffStrategy = null;
        baseUrl = com.adjust.sdk.Constants.BASE_URL;
        gdprUrl = com.adjust.sdk.Constants.GDPR_URL;
        subscriptionUrl = com.adjust.sdk.Constants.SUBSCRIPTION_URL;
        purchaseVerificationUrl = com.adjust.sdk.Constants.PURCHASE_VERIFICATION_URL;
        connectionOptions = null;
        httpsURLConnectionProvider = null;
        tryInstallReferrer = true;
    }
}
