package com.adjust.sdk;

/* JADX INFO: loaded from: classes3.dex */
public class Adjust {
    private static com.adjust.sdk.AdjustInstance defaultInstance;

    private Adjust() {
    }

    public static void addGlobalCallbackParameter(java.lang.String str, java.lang.String str2) {
        getDefaultInstance().addGlobalCallbackParameter(str, str2);
    }

    public static void addGlobalPartnerParameter(java.lang.String str, java.lang.String str2) {
        getDefaultInstance().addGlobalPartnerParameter(str, str2);
    }

    public static void disable() {
        getDefaultInstance().disable();
    }

    public static void enable() {
        getDefaultInstance().enable();
    }

    private static android.content.Context extractApplicationContext(android.content.Context context) {
        if (context == null) {
            return null;
        }
        return context.getApplicationContext();
    }

    public static void gdprForgetMe(android.content.Context context) {
        getDefaultInstance().gdprForgetMe(extractApplicationContext(context));
    }

    public static void getAdid(com.adjust.sdk.OnAdidReadListener onAdidReadListener) {
        if (onAdidReadListener == null) {
            com.adjust.sdk.AdjustFactory.getLogger().error("Callback for getting adid can't be null", new java.lang.Object[0]);
        } else {
            getDefaultInstance().getAdid(onAdidReadListener);
        }
    }

    public static void getAmazonAdId(android.content.Context context, com.adjust.sdk.OnAmazonAdIdReadListener onAmazonAdIdReadListener) {
        if (onAmazonAdIdReadListener == null) {
            com.adjust.sdk.AdjustFactory.getLogger().error("onAmazonAdIdReadListener cannot be null", new java.lang.Object[0]);
            return;
        }
        android.content.Context contextExtractApplicationContext = extractApplicationContext(context);
        if (contextExtractApplicationContext == null) {
            com.adjust.sdk.AdjustFactory.getLogger().error("getAmazonAdId: null context", new java.lang.Object[0]);
        } else {
            getDefaultInstance().getAmazonAdId(contextExtractApplicationContext, onAmazonAdIdReadListener);
        }
    }

    public static void getAttribution(com.adjust.sdk.OnAttributionReadListener onAttributionReadListener) {
        if (onAttributionReadListener == null) {
            com.adjust.sdk.AdjustFactory.getLogger().error("Callback for getting attribution can't be null", new java.lang.Object[0]);
        } else {
            getDefaultInstance().getAttribution(onAttributionReadListener);
        }
    }

    public static synchronized com.adjust.sdk.AdjustInstance getDefaultInstance() {
        if (defaultInstance == null) {
            defaultInstance = new com.adjust.sdk.AdjustInstance();
        }
        return defaultInstance;
    }

    public static void getGoogleAdId(android.content.Context context, com.adjust.sdk.OnGoogleAdIdReadListener onGoogleAdIdReadListener) {
        if (onGoogleAdIdReadListener == null) {
            com.adjust.sdk.AdjustFactory.getLogger().error("onGoogleAdIdReadListener cannot be null", new java.lang.Object[0]);
        } else if (context == null) {
            com.adjust.sdk.AdjustFactory.getLogger().error("getGoogleAdId: null context", new java.lang.Object[0]);
        } else {
            com.adjust.sdk.Util.getGoogleAdId(context.getApplicationContext(), onGoogleAdIdReadListener);
        }
    }

    public static void getGooglePlayInstallReferrer(android.content.Context context, com.adjust.sdk.OnGooglePlayInstallReferrerReadListener onGooglePlayInstallReferrerReadListener) {
        if (onGooglePlayInstallReferrerReadListener == null) {
            com.adjust.sdk.AdjustFactory.getLogger().error("onGooglePlayInstallReferrerReadListener cannot be null", new java.lang.Object[0]);
        } else if (context == null) {
            com.adjust.sdk.AdjustFactory.getLogger().error("null context", new java.lang.Object[0]);
        } else {
            getDefaultInstance().getGooglePlayInstallReferrer(context, onGooglePlayInstallReferrerReadListener);
        }
    }

    public static void getLastDeeplink(android.content.Context context, com.adjust.sdk.OnLastDeeplinkReadListener onLastDeeplinkReadListener) {
        if (onLastDeeplinkReadListener == null) {
            com.adjust.sdk.AdjustFactory.getLogger().error("onLastDeeplinkReadListener cannot be null", new java.lang.Object[0]);
        } else if (context == null) {
            com.adjust.sdk.AdjustFactory.getLogger().error("null context", new java.lang.Object[0]);
        } else {
            getDefaultInstance().getLastDeeplink(context, onLastDeeplinkReadListener);
        }
    }

    public static void getSdkVersion(com.adjust.sdk.OnSdkVersionReadListener onSdkVersionReadListener) {
        if (onSdkVersionReadListener == null) {
            com.adjust.sdk.AdjustFactory.getLogger().error("onSdkVersionReadListener cannot be null", new java.lang.Object[0]);
        } else {
            getDefaultInstance().getSdkVersion(onSdkVersionReadListener);
        }
    }

    public static void initSdk(com.adjust.sdk.AdjustConfig adjustConfig) {
        getDefaultInstance().initSdk(adjustConfig);
    }

    public static boolean isAdjustUninstallDetectionPayload(java.util.Map<java.lang.String, java.lang.String> map) {
        return com.adjust.sdk.Util.isAdjustUninstallDetectionPayload(map);
    }

    public static void isEnabled(android.content.Context context, com.adjust.sdk.OnIsEnabledListener onIsEnabledListener) {
        if (context == null) {
            com.adjust.sdk.AdjustFactory.getLogger().error("null context", new java.lang.Object[0]);
        } else if (onIsEnabledListener == null) {
            com.adjust.sdk.AdjustFactory.getLogger().error("Callback for getting isEnabled can't be null", new java.lang.Object[0]);
        } else {
            getDefaultInstance().isEnabled(extractApplicationContext(context), onIsEnabledListener);
        }
    }

    public static void onPause() {
        getDefaultInstance().onPause();
    }

    public static void onResume() {
        getDefaultInstance().onResume();
    }

    public static void processAndResolveDeeplink(com.adjust.sdk.AdjustDeeplink adjustDeeplink, android.content.Context context, com.adjust.sdk.OnDeeplinkResolvedListener onDeeplinkResolvedListener) {
        getDefaultInstance().processAndResolveDeeplink(adjustDeeplink, extractApplicationContext(context), onDeeplinkResolvedListener);
    }

    public static void processDeeplink(com.adjust.sdk.AdjustDeeplink adjustDeeplink, android.content.Context context) {
        getDefaultInstance().processDeeplink(adjustDeeplink, extractApplicationContext(context));
    }

    public static void removeGlobalCallbackParameter(java.lang.String str) {
        getDefaultInstance().removeGlobalCallbackParameter(str);
    }

    public static void removeGlobalCallbackParameters() {
        getDefaultInstance().removeGlobalCallbackParameters();
    }

    public static void removeGlobalPartnerParameter(java.lang.String str) {
        getDefaultInstance().removeGlobalPartnerParameter(str);
    }

    public static void removeGlobalPartnerParameters() {
        getDefaultInstance().removeGlobalPartnerParameters();
    }

    public static void setPushToken(java.lang.String str, android.content.Context context) {
        getDefaultInstance().setPushToken(str, extractApplicationContext(context));
    }

    public static void setReferrer(java.lang.String str, android.content.Context context) {
        getDefaultInstance().sendReferrer(str, extractApplicationContext(context));
    }

    public static void setTestOptions(com.adjust.sdk.AdjustTestOptions adjustTestOptions) {
        java.lang.Boolean bool = adjustTestOptions.teardown;
        if (bool != null && bool.booleanValue()) {
            com.adjust.sdk.AdjustInstance adjustInstance = defaultInstance;
            if (adjustInstance != null) {
                adjustInstance.teardown();
            }
            defaultInstance = null;
            com.adjust.sdk.AdjustFactory.teardown(adjustTestOptions.context);
        }
        getDefaultInstance().setTestOptions(adjustTestOptions);
    }

    public static void switchBackToOnlineMode() {
        getDefaultInstance().switchBackToOnlineMode();
    }

    public static void switchToOfflineMode() {
        getDefaultInstance().switchToOfflineMode();
    }

    public static void trackAdRevenue(com.adjust.sdk.AdjustAdRevenue adjustAdRevenue) {
        getDefaultInstance().trackAdRevenue(adjustAdRevenue);
    }

    public static void trackEvent(com.adjust.sdk.AdjustEvent adjustEvent) {
        getDefaultInstance().trackEvent(adjustEvent);
    }

    public static void trackMeasurementConsent(boolean z) {
        getDefaultInstance().trackMeasurementConsent(z);
    }

    public static void trackPlayStoreSubscription(com.adjust.sdk.AdjustPlayStoreSubscription adjustPlayStoreSubscription) {
        getDefaultInstance().trackPlayStoreSubscription(adjustPlayStoreSubscription);
    }

    public static void trackThirdPartySharing(com.adjust.sdk.AdjustThirdPartySharing adjustThirdPartySharing) {
        getDefaultInstance().trackThirdPartySharing(adjustThirdPartySharing);
    }

    public static void verifyAndTrackPlayStorePurchase(com.adjust.sdk.AdjustEvent adjustEvent, com.adjust.sdk.OnPurchaseVerificationFinishedListener onPurchaseVerificationFinishedListener) {
        getDefaultInstance().verifyAndTrackPlayStorePurchase(adjustEvent, onPurchaseVerificationFinishedListener);
    }

    public static void verifyPlayStorePurchase(com.adjust.sdk.AdjustPlayStorePurchase adjustPlayStorePurchase, com.adjust.sdk.OnPurchaseVerificationFinishedListener onPurchaseVerificationFinishedListener) {
        if (onPurchaseVerificationFinishedListener == null) {
            com.adjust.sdk.AdjustFactory.getLogger().error("Purchase verification aborted because verification callback is null", new java.lang.Object[0]);
        } else {
            getDefaultInstance().verifyPlayStorePurchase(adjustPlayStorePurchase, onPurchaseVerificationFinishedListener);
        }
    }
}
