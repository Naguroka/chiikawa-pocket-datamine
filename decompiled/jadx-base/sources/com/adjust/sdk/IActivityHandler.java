package com.adjust.sdk;

/* JADX INFO: loaded from: classes3.dex */
public interface IActivityHandler {
    void addGlobalCallbackParameter(java.lang.String str, java.lang.String str2);

    void addGlobalPartnerParameter(java.lang.String str, java.lang.String str2);

    void finishedTrackingActivity(com.adjust.sdk.ResponseData responseData);

    void gdprForgetMe();

    com.adjust.sdk.ActivityState getActivityState();

    void getAdid(com.adjust.sdk.OnAdidReadListener onAdidReadListener);

    com.adjust.sdk.AdjustConfig getAdjustConfig();

    void getAttribution(com.adjust.sdk.OnAttributionReadListener onAttributionReadListener);

    android.content.Context getContext();

    com.adjust.sdk.DeviceInfo getDeviceInfo();

    com.adjust.sdk.GlobalParameters getGlobalParameters();

    com.adjust.sdk.ActivityHandler.InternalState getInternalState();

    void gotOptOutResponse();

    void init(com.adjust.sdk.AdjustConfig adjustConfig);

    void isEnabled(com.adjust.sdk.OnIsEnabledListener onIsEnabledListener);

    boolean isEnabled();

    void launchAttributionResponseTasks(com.adjust.sdk.AttributionResponseData attributionResponseData);

    void launchEventResponseTasks(com.adjust.sdk.EventResponseData eventResponseData);

    void launchPurchaseVerificationResponseTasks(com.adjust.sdk.PurchaseVerificationResponseData purchaseVerificationResponseData);

    void launchSdkClickResponseTasks(com.adjust.sdk.SdkClickResponseData sdkClickResponseData);

    void launchSessionResponseTasks(com.adjust.sdk.SessionResponseData sessionResponseData);

    void onPause();

    void onResume();

    void processAndResolveDeeplink(android.net.Uri uri, long j, com.adjust.sdk.OnDeeplinkResolvedListener onDeeplinkResolvedListener);

    void processDeeplink(android.net.Uri uri, long j);

    void removeGlobalCallbackParameter(java.lang.String str);

    void removeGlobalCallbackParameters();

    void removeGlobalPartnerParameter(java.lang.String str);

    void removeGlobalPartnerParameters();

    void sendInstallReferrer(com.adjust.sdk.ReferrerDetails referrerDetails, java.lang.String str);

    void sendPreinstallReferrer();

    void sendReftagReferrer();

    void setAskingAttribution(boolean z);

    void setEnabled(boolean z);

    void setOfflineMode(boolean z);

    void setPushToken(java.lang.String str, boolean z);

    void teardown();

    void trackAdRevenue(com.adjust.sdk.AdjustAdRevenue adjustAdRevenue);

    void trackEvent(com.adjust.sdk.AdjustEvent adjustEvent);

    void trackMeasurementConsent(boolean z);

    void trackPlayStoreSubscription(com.adjust.sdk.AdjustPlayStoreSubscription adjustPlayStoreSubscription);

    void trackThirdPartySharing(com.adjust.sdk.AdjustThirdPartySharing adjustThirdPartySharing);

    boolean updateAttributionI(com.adjust.sdk.AdjustAttribution adjustAttribution);

    void verifyAndTrackPlayStorePurchase(com.adjust.sdk.AdjustEvent adjustEvent, com.adjust.sdk.OnPurchaseVerificationFinishedListener onPurchaseVerificationFinishedListener);

    void verifyPlayStorePurchase(com.adjust.sdk.AdjustPlayStorePurchase adjustPlayStorePurchase, com.adjust.sdk.OnPurchaseVerificationFinishedListener onPurchaseVerificationFinishedListener);
}
