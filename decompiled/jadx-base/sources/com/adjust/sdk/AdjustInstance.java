package com.adjust.sdk;

/* JADX INFO: loaded from: classes3.dex */
public class AdjustInstance {
    private com.adjust.sdk.IActivityHandler activityHandler;
    private java.lang.String basePath;
    private com.adjust.sdk.OnDeeplinkResolvedListener cachedDeeplinkResolutionCallback;
    private java.lang.String gdprPath;
    private java.lang.String purchaseVerificationPath;
    private java.lang.String pushToken;
    private java.lang.String subscriptionPath;
    private java.lang.Boolean startEnabled = null;
    private boolean startOffline = false;
    private com.adjust.sdk.AdjustInstance.PreLaunchActions preLaunchActions = new com.adjust.sdk.AdjustInstance.PreLaunchActions();
    private java.util.ArrayList<com.adjust.sdk.OnAdidReadListener> cachedAdidReadCallbacks = new java.util.ArrayList<>();
    private java.util.ArrayList<com.adjust.sdk.OnAttributionReadListener> cachedAttributionReadCallbacks = new java.util.ArrayList<>();

    public static class PreLaunchActions {
        public java.util.List<com.adjust.sdk.IRunActivityHandler> preLaunchActionsArray = new java.util.ArrayList();
        public java.util.List<com.adjust.sdk.AdjustThirdPartySharing> preLaunchAdjustThirdPartySharingArray = new java.util.ArrayList();
        public java.lang.Boolean lastMeasurementConsentTracked = null;
    }

    public class a extends com.adjust.sdk.scheduler.AsyncTaskExecutor<java.lang.Void, android.net.Uri> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ android.content.Context f65a;
        public final /* synthetic */ com.adjust.sdk.OnLastDeeplinkReadListener b;

        public a(android.content.Context context, com.adjust.sdk.OnLastDeeplinkReadListener onLastDeeplinkReadListener) {
            this.f65a = context;
            this.b = onLastDeeplinkReadListener;
        }

        @Override // com.adjust.sdk.scheduler.AsyncTaskExecutor
        public final android.net.Uri doInBackground(java.lang.Void[] voidArr) {
            try {
                return android.net.Uri.parse(com.adjust.sdk.AdjustInstance.this.getCachedDeeplink(this.f65a));
            } catch (java.lang.Exception unused) {
                return null;
            }
        }

        @Override // com.adjust.sdk.scheduler.AsyncTaskExecutor
        public final void onPostExecute(android.net.Uri uri) {
            this.b.onLastDeeplinkRead(uri);
        }
    }

    public class b extends com.adjust.sdk.scheduler.AsyncTaskExecutor<android.content.Context, java.lang.Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.adjust.sdk.OnIsEnabledListener f66a;

        public b(com.adjust.sdk.OnIsEnabledListener onIsEnabledListener) {
            this.f66a = onIsEnabledListener;
        }

        @Override // com.adjust.sdk.scheduler.AsyncTaskExecutor
        public final java.lang.Boolean doInBackground(android.content.Context[] contextArr) {
            return java.lang.Boolean.valueOf(com.adjust.sdk.Util.isEnabledFromActivityStateFile(contextArr[0]));
        }

        @Override // com.adjust.sdk.scheduler.AsyncTaskExecutor
        public final void onPostExecute(java.lang.Boolean bool) {
            this.f66a.onIsEnabledRead(bool.booleanValue());
        }
    }

    public class c implements com.adjust.sdk.IRunActivityHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ java.lang.String f67a;
        public final /* synthetic */ java.lang.String b;

        public c(java.lang.String str, java.lang.String str2) {
            this.f67a = str;
            this.b = str2;
        }

        @Override // com.adjust.sdk.IRunActivityHandler
        public final void run(com.adjust.sdk.ActivityHandler activityHandler) {
            activityHandler.addGlobalCallbackParameterI(this.f67a, this.b);
        }
    }

    public class d implements com.adjust.sdk.IRunActivityHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ java.lang.String f68a;
        public final /* synthetic */ java.lang.String b;

        public d(java.lang.String str, java.lang.String str2) {
            this.f68a = str;
            this.b = str2;
        }

        @Override // com.adjust.sdk.IRunActivityHandler
        public final void run(com.adjust.sdk.ActivityHandler activityHandler) {
            activityHandler.addGlobalPartnerParameterI(this.f68a, this.b);
        }
    }

    public class e implements com.adjust.sdk.IRunActivityHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ java.lang.String f69a;

        public e(java.lang.String str) {
            this.f69a = str;
        }

        @Override // com.adjust.sdk.IRunActivityHandler
        public final void run(com.adjust.sdk.ActivityHandler activityHandler) {
            activityHandler.removeGlobalCallbackParameterI(this.f69a);
        }
    }

    public class f implements com.adjust.sdk.IRunActivityHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ java.lang.String f70a;

        public f(java.lang.String str) {
            this.f70a = str;
        }

        @Override // com.adjust.sdk.IRunActivityHandler
        public final void run(com.adjust.sdk.ActivityHandler activityHandler) {
            activityHandler.removeGlobalPartnerParameterI(this.f70a);
        }
    }

    public class g implements com.adjust.sdk.IRunActivityHandler {
        @Override // com.adjust.sdk.IRunActivityHandler
        public final void run(com.adjust.sdk.ActivityHandler activityHandler) {
            activityHandler.removeGlobalCallbackParametersI();
        }
    }

    public class h implements com.adjust.sdk.IRunActivityHandler {
        @Override // com.adjust.sdk.IRunActivityHandler
        public final void run(com.adjust.sdk.ActivityHandler activityHandler) {
            activityHandler.removeGlobalPartnerParametersI();
        }
    }

    public class i extends com.adjust.sdk.scheduler.AsyncTaskExecutor<java.lang.Void, java.lang.String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.adjust.sdk.OnSdkVersionReadListener f71a;

        public i(com.adjust.sdk.OnSdkVersionReadListener onSdkVersionReadListener) {
            this.f71a = onSdkVersionReadListener;
        }

        @Override // com.adjust.sdk.scheduler.AsyncTaskExecutor
        public final java.lang.String doInBackground(java.lang.Void[] voidArr) {
            return com.adjust.sdk.Util.getSdkVersion();
        }

        @Override // com.adjust.sdk.scheduler.AsyncTaskExecutor
        public final void onPostExecute(java.lang.String str) {
            this.f71a.onSdkVersionRead(str);
        }
    }

    public class j implements com.adjust.sdk.InstallReferrerReadListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.adjust.sdk.OnGooglePlayInstallReferrerReadListener f72a;

        public j(com.adjust.sdk.OnGooglePlayInstallReferrerReadListener onGooglePlayInstallReferrerReadListener) {
            this.f72a = onGooglePlayInstallReferrerReadListener;
        }

        @Override // com.adjust.sdk.InstallReferrerReadListener
        public final void onFail(java.lang.String str) {
            this.f72a.onFail(str);
        }

        @Override // com.adjust.sdk.InstallReferrerReadListener
        public final void onInstallReferrerRead(com.adjust.sdk.ReferrerDetails referrerDetails, java.lang.String str) {
            this.f72a.onInstallReferrerRead(new com.adjust.sdk.GooglePlayInstallReferrerDetails(referrerDetails));
        }
    }

    private void cacheDeeplink(android.net.Uri uri, android.content.Context context) {
        com.adjust.sdk.SharedPreferencesManager.getDefaultInstance(context).cacheDeeplink(uri);
    }

    private boolean checkActivityHandler(java.lang.String str) {
        return checkActivityHandler(str, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.lang.String getCachedDeeplink(android.content.Context context) {
        return com.adjust.sdk.SharedPreferencesManager.getDefaultInstance(context).getCachedDeeplink();
    }

    private boolean isInstanceEnabled() {
        java.lang.Boolean bool = this.startEnabled;
        return bool == null || bool.booleanValue();
    }

    private void saveDeeplink(android.net.Uri uri, long j2, android.content.Context context) {
        com.adjust.sdk.SharedPreferencesManager.getDefaultInstance(context).saveDeeplink(uri, j2);
    }

    private void saveGdprForgetMe(android.content.Context context) {
        com.adjust.sdk.SharedPreferencesManager.getDefaultInstance(context).setGdprForgetMe();
    }

    private void savePreinstallReferrer(java.lang.String str, android.content.Context context) {
        com.adjust.sdk.SharedPreferencesManager.getDefaultInstance(context).savePreinstallReferrer(str);
    }

    private void savePushToken(java.lang.String str, android.content.Context context) {
        com.adjust.sdk.SharedPreferencesManager.getDefaultInstance(context).savePushToken(str);
    }

    private void saveRawReferrer(java.lang.String str, long j2, android.content.Context context) {
        com.adjust.sdk.SharedPreferencesManager.getDefaultInstance(context).saveRawReferrer(str, j2);
    }

    private void setSendingReferrersAsNotSent(final android.content.Context context) {
        new com.adjust.sdk.scheduler.SingleThreadCachedScheduler("AdjustInstance").submit(new java.lang.Runnable() { // from class: com.adjust.sdk.AdjustInstance$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.adjust.sdk.SharedPreferencesManager.getDefaultInstance(context).setSendingReferrersAsNotSent();
            }
        });
    }

    public void addGlobalCallbackParameter(java.lang.String str, java.lang.String str2) {
        if (checkActivityHandler("adding global callback parameter", true)) {
            this.activityHandler.addGlobalCallbackParameter(str, str2);
        } else {
            this.preLaunchActions.preLaunchActionsArray.add(new com.adjust.sdk.AdjustInstance.c(str, str2));
        }
    }

    public void addGlobalPartnerParameter(java.lang.String str, java.lang.String str2) {
        if (checkActivityHandler("adding global partner parameter", true)) {
            this.activityHandler.addGlobalPartnerParameter(str, str2);
        } else {
            this.preLaunchActions.preLaunchActionsArray.add(new com.adjust.sdk.AdjustInstance.d(str, str2));
        }
    }

    public void disable() {
        this.startEnabled = java.lang.Boolean.FALSE;
        if (checkActivityHandler(false, "enabled mode", "disabled mode")) {
            this.activityHandler.setEnabled(false);
        }
    }

    public void enable() {
        this.startEnabled = java.lang.Boolean.TRUE;
        if (checkActivityHandler(true, "enabled mode", "disabled mode")) {
            this.activityHandler.setEnabled(true);
        }
    }

    public void gdprForgetMe(android.content.Context context) {
        saveGdprForgetMe(context);
        if (checkActivityHandler("gdpr", true) && this.activityHandler.isEnabled()) {
            this.activityHandler.gdprForgetMe();
        }
    }

    public void getAdid(com.adjust.sdk.OnAdidReadListener onAdidReadListener) {
        if (checkActivityHandler("getAdid")) {
            this.activityHandler.getAdid(onAdidReadListener);
        } else {
            this.cachedAdidReadCallbacks.add(onAdidReadListener);
        }
    }

    public void getAmazonAdId(android.content.Context context, com.adjust.sdk.OnAmazonAdIdReadListener onAmazonAdIdReadListener) {
        com.adjust.sdk.DeviceInfo.getFireAdvertisingIdBypassConditions(context.getContentResolver(), onAmazonAdIdReadListener);
    }

    public void getAttribution(com.adjust.sdk.OnAttributionReadListener onAttributionReadListener) {
        if (checkActivityHandler("getAttribution")) {
            this.activityHandler.getAttribution(onAttributionReadListener);
        } else {
            this.cachedAttributionReadCallbacks.add(onAttributionReadListener);
        }
    }

    public void getGooglePlayInstallReferrer(android.content.Context context, com.adjust.sdk.OnGooglePlayInstallReferrerReadListener onGooglePlayInstallReferrerReadListener) {
        new com.adjust.sdk.InstallReferrer(context, new com.adjust.sdk.AdjustInstance.j(onGooglePlayInstallReferrerReadListener)).startConnection();
    }

    public void getLastDeeplink(android.content.Context context, com.adjust.sdk.OnLastDeeplinkReadListener onLastDeeplinkReadListener) {
        new com.adjust.sdk.AdjustInstance.a(context, onLastDeeplinkReadListener).execute(new java.lang.Void[0]);
    }

    public void getSdkVersion(com.adjust.sdk.OnSdkVersionReadListener onSdkVersionReadListener) {
        new com.adjust.sdk.AdjustInstance.i(onSdkVersionReadListener).execute(new java.lang.Void[0]);
    }

    public void initSdk(com.adjust.sdk.AdjustConfig adjustConfig) {
        if (!com.adjust.sdk.AdjustSigner.isPresent()) {
            com.adjust.sdk.AdjustFactory.getLogger().error("Missing signature library, SDK can't be initialised", new java.lang.Object[0]);
            return;
        }
        if (adjustConfig == null) {
            com.adjust.sdk.AdjustFactory.getLogger().error("AdjustConfig missing", new java.lang.Object[0]);
            return;
        }
        if (!adjustConfig.isValid()) {
            com.adjust.sdk.AdjustFactory.getLogger().error("AdjustConfig not initialized correctly", new java.lang.Object[0]);
            return;
        }
        if (this.activityHandler != null) {
            com.adjust.sdk.AdjustFactory.getLogger().error("Adjust already initialized", new java.lang.Object[0]);
            return;
        }
        adjustConfig.preLaunchActions = this.preLaunchActions;
        adjustConfig.pushToken = this.pushToken;
        adjustConfig.startEnabled = this.startEnabled;
        adjustConfig.startOffline = this.startOffline;
        adjustConfig.basePath = this.basePath;
        adjustConfig.gdprPath = this.gdprPath;
        adjustConfig.subscriptionPath = this.subscriptionPath;
        adjustConfig.purchaseVerificationPath = this.purchaseVerificationPath;
        adjustConfig.cachedDeeplinkResolutionCallback = this.cachedDeeplinkResolutionCallback;
        adjustConfig.cachedAdidReadCallbacks = this.cachedAdidReadCallbacks;
        adjustConfig.cachedAttributionReadCallbacks = this.cachedAttributionReadCallbacks;
        this.activityHandler = com.adjust.sdk.AdjustFactory.getActivityHandler(adjustConfig);
        setSendingReferrersAsNotSent(adjustConfig.context);
    }

    public void isEnabled(android.content.Context context, com.adjust.sdk.OnIsEnabledListener onIsEnabledListener) {
        if (checkActivityHandler("isEnabled")) {
            this.activityHandler.isEnabled(onIsEnabledListener);
        } else {
            new com.adjust.sdk.AdjustInstance.b(onIsEnabledListener).execute(context);
        }
    }

    public void onPause() {
        if (checkActivityHandler(com.ironsource.y8.h.t0)) {
            this.activityHandler.onPause();
        }
    }

    public void onResume() {
        if (checkActivityHandler(com.ironsource.y8.h.u0)) {
            this.activityHandler.onResume();
        }
    }

    public void processAndResolveDeeplink(com.adjust.sdk.AdjustDeeplink adjustDeeplink, android.content.Context context, com.adjust.sdk.OnDeeplinkResolvedListener onDeeplinkResolvedListener) {
        if (adjustDeeplink == null || !adjustDeeplink.isValid()) {
            com.adjust.sdk.AdjustFactory.getLogger().warn("Skipping deeplink processing (null or empty)", new java.lang.Object[0]);
            return;
        }
        if (onDeeplinkResolvedListener == null) {
            processDeeplink(adjustDeeplink, context);
            return;
        }
        cacheDeeplink(adjustDeeplink.url, context);
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        if (checkActivityHandler("processAndResolveDeeplink", true)) {
            this.activityHandler.processAndResolveDeeplink(adjustDeeplink.url, jCurrentTimeMillis, onDeeplinkResolvedListener);
        } else {
            saveDeeplink(adjustDeeplink.url, jCurrentTimeMillis, context);
            this.cachedDeeplinkResolutionCallback = onDeeplinkResolvedListener;
        }
    }

    public void processDeeplink(com.adjust.sdk.AdjustDeeplink adjustDeeplink, android.content.Context context) {
        if (adjustDeeplink == null || !adjustDeeplink.isValid()) {
            com.adjust.sdk.AdjustFactory.getLogger().warn("Skipping deeplink processing (null or empty)", new java.lang.Object[0]);
            return;
        }
        cacheDeeplink(adjustDeeplink.url, context);
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        if (checkActivityHandler("processDeeplink", true)) {
            this.activityHandler.processDeeplink(adjustDeeplink.url, jCurrentTimeMillis);
        } else {
            saveDeeplink(adjustDeeplink.url, jCurrentTimeMillis, context);
        }
    }

    public void removeGlobalCallbackParameter(java.lang.String str) {
        if (checkActivityHandler("removing global callback parameter", true)) {
            this.activityHandler.removeGlobalCallbackParameter(str);
        } else {
            this.preLaunchActions.preLaunchActionsArray.add(new com.adjust.sdk.AdjustInstance.e(str));
        }
    }

    public void removeGlobalCallbackParameters() {
        if (checkActivityHandler("resetting global callback parameters", true)) {
            this.activityHandler.removeGlobalCallbackParameters();
        } else {
            this.preLaunchActions.preLaunchActionsArray.add(new com.adjust.sdk.AdjustInstance.g());
        }
    }

    public void removeGlobalPartnerParameter(java.lang.String str) {
        if (checkActivityHandler("removing global partner parameter", true)) {
            this.activityHandler.removeGlobalPartnerParameter(str);
        } else {
            this.preLaunchActions.preLaunchActionsArray.add(new com.adjust.sdk.AdjustInstance.f(str));
        }
    }

    public void removeGlobalPartnerParameters() {
        if (checkActivityHandler("resetting global partner parameters", true)) {
            this.activityHandler.removeGlobalPartnerParameters();
        } else {
            this.preLaunchActions.preLaunchActionsArray.add(new com.adjust.sdk.AdjustInstance.h());
        }
    }

    public void sendPreinstallReferrer(java.lang.String str, android.content.Context context) {
        if (str == null || str.length() == 0) {
            com.adjust.sdk.AdjustFactory.getLogger().warn("Skipping SYSTEM_INSTALLER_REFERRER preinstall referrer processing (null or empty)", new java.lang.Object[0]);
            return;
        }
        savePreinstallReferrer(str, context);
        if (checkActivityHandler("preinstall referrer", true) && this.activityHandler.isEnabled()) {
            this.activityHandler.sendPreinstallReferrer();
        }
    }

    public void sendReferrer(java.lang.String str, android.content.Context context) {
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        if (str == null || str.length() == 0) {
            com.adjust.sdk.AdjustFactory.getLogger().warn("Skipping INSTALL_REFERRER intent referrer processing (null or empty)", new java.lang.Object[0]);
            return;
        }
        saveRawReferrer(str, jCurrentTimeMillis, context);
        if (checkActivityHandler(com.adjust.sdk.Constants.REFERRER, true) && this.activityHandler.isEnabled()) {
            this.activityHandler.sendReftagReferrer();
        }
    }

    public void setPushToken(java.lang.String str, android.content.Context context) {
        savePushToken(str, context);
        if (checkActivityHandler("push token", true) && this.activityHandler.isEnabled()) {
            this.activityHandler.setPushToken(str, true);
        }
    }

    public void setTestOptions(com.adjust.sdk.AdjustTestOptions adjustTestOptions) {
        java.lang.String str = adjustTestOptions.basePath;
        if (str != null) {
            this.basePath = str;
        }
        java.lang.String str2 = adjustTestOptions.gdprPath;
        if (str2 != null) {
            this.gdprPath = str2;
        }
        java.lang.String str3 = adjustTestOptions.subscriptionPath;
        if (str3 != null) {
            this.subscriptionPath = str3;
        }
        java.lang.String str4 = adjustTestOptions.purchaseVerificationPath;
        if (str4 != null) {
            this.purchaseVerificationPath = str4;
        }
        java.lang.String str5 = adjustTestOptions.baseUrl;
        if (str5 != null) {
            com.adjust.sdk.AdjustFactory.setBaseUrl(str5);
        }
        java.lang.String str6 = adjustTestOptions.gdprUrl;
        if (str6 != null) {
            com.adjust.sdk.AdjustFactory.setGdprUrl(str6);
        }
        java.lang.String str7 = adjustTestOptions.subscriptionUrl;
        if (str7 != null) {
            com.adjust.sdk.AdjustFactory.setSubscriptionUrl(str7);
        }
        java.lang.String str8 = adjustTestOptions.purchaseVerificationUrl;
        if (str8 != null) {
            com.adjust.sdk.AdjustFactory.setPurchaseVerificationUrl(str8);
        }
        java.lang.Long l = adjustTestOptions.timerIntervalInMilliseconds;
        if (l != null) {
            com.adjust.sdk.AdjustFactory.setTimerInterval(l.longValue());
        }
        if (adjustTestOptions.timerStartInMilliseconds != null) {
            com.adjust.sdk.AdjustFactory.setTimerStart(adjustTestOptions.timerIntervalInMilliseconds.longValue());
        }
        java.lang.Long l2 = adjustTestOptions.sessionIntervalInMilliseconds;
        if (l2 != null) {
            com.adjust.sdk.AdjustFactory.setSessionInterval(l2.longValue());
        }
        java.lang.Long l3 = adjustTestOptions.subsessionIntervalInMilliseconds;
        if (l3 != null) {
            com.adjust.sdk.AdjustFactory.setSubsessionInterval(l3.longValue());
        }
        java.lang.Boolean bool = adjustTestOptions.tryInstallReferrer;
        if (bool != null) {
            com.adjust.sdk.AdjustFactory.setTryInstallReferrer(bool.booleanValue());
        }
        if (adjustTestOptions.noBackoffWait != null) {
            com.adjust.sdk.BackoffStrategy backoffStrategy = com.adjust.sdk.BackoffStrategy.NO_WAIT;
            com.adjust.sdk.AdjustFactory.setPackageHandlerBackoffStrategy(backoffStrategy);
            com.adjust.sdk.AdjustFactory.setSdkClickBackoffStrategy(backoffStrategy);
        }
        java.lang.Boolean bool2 = adjustTestOptions.ignoreSystemLifecycleBootstrap;
        if (bool2 != null) {
            com.adjust.sdk.AdjustFactory.setIgnoreSystemLifecycleBootstrap(bool2.booleanValue());
        }
    }

    public void switchBackToOnlineMode() {
        if (checkActivityHandler(false, "offline mode", "online mode")) {
            this.activityHandler.setOfflineMode(false);
        } else {
            this.startOffline = false;
        }
    }

    public void switchToOfflineMode() {
        if (checkActivityHandler(true, "offline mode", "online mode")) {
            this.activityHandler.setOfflineMode(true);
        } else {
            this.startOffline = true;
        }
    }

    public void teardown() {
        if (checkActivityHandler("teardown")) {
            this.activityHandler.teardown();
            this.activityHandler = null;
        }
    }

    public void trackAdRevenue(com.adjust.sdk.AdjustAdRevenue adjustAdRevenue) {
        if (checkActivityHandler("trackAdRevenue")) {
            this.activityHandler.trackAdRevenue(adjustAdRevenue);
        }
    }

    public void trackEvent(com.adjust.sdk.AdjustEvent adjustEvent) {
        if (checkActivityHandler("trackEvent")) {
            this.activityHandler.trackEvent(adjustEvent);
        }
    }

    public void trackMeasurementConsent(boolean z) {
        if (checkActivityHandler("measurement consent", true)) {
            this.activityHandler.trackMeasurementConsent(z);
        } else {
            this.preLaunchActions.lastMeasurementConsentTracked = java.lang.Boolean.valueOf(z);
        }
    }

    public void trackPlayStoreSubscription(com.adjust.sdk.AdjustPlayStoreSubscription adjustPlayStoreSubscription) {
        if (checkActivityHandler("trackPlayStoreSubscription")) {
            this.activityHandler.trackPlayStoreSubscription(adjustPlayStoreSubscription);
        }
    }

    public void trackThirdPartySharing(com.adjust.sdk.AdjustThirdPartySharing adjustThirdPartySharing) {
        if (checkActivityHandler("third party sharing", true)) {
            this.activityHandler.trackThirdPartySharing(adjustThirdPartySharing);
        } else {
            this.preLaunchActions.preLaunchAdjustThirdPartySharingArray.add(adjustThirdPartySharing);
        }
    }

    public void verifyAndTrackPlayStorePurchase(com.adjust.sdk.AdjustEvent adjustEvent, com.adjust.sdk.OnPurchaseVerificationFinishedListener onPurchaseVerificationFinishedListener) {
        if (checkActivityHandler("verifyAndTrack")) {
            this.activityHandler.verifyAndTrackPlayStorePurchase(adjustEvent, onPurchaseVerificationFinishedListener);
        } else if (onPurchaseVerificationFinishedListener != null) {
            onPurchaseVerificationFinishedListener.onVerificationFinished(new com.adjust.sdk.AdjustPurchaseVerificationResult("not_verified", 100, "SDK needs to be initialized before making purchase verification request"));
        }
    }

    public void verifyPlayStorePurchase(com.adjust.sdk.AdjustPlayStorePurchase adjustPlayStorePurchase, com.adjust.sdk.OnPurchaseVerificationFinishedListener onPurchaseVerificationFinishedListener) {
        if (checkActivityHandler("verifyPurchase")) {
            this.activityHandler.verifyPlayStorePurchase(adjustPlayStorePurchase, onPurchaseVerificationFinishedListener);
        } else {
            onPurchaseVerificationFinishedListener.onVerificationFinished(new com.adjust.sdk.AdjustPurchaseVerificationResult("not_verified", 100, "SDK needs to be initialized before making purchase verification request"));
        }
    }

    private boolean checkActivityHandler(java.lang.String str, boolean z) {
        if (this.activityHandler != null) {
            return true;
        }
        if (str == null) {
            com.adjust.sdk.AdjustFactory.getLogger().error("Adjust not initialized correctly", new java.lang.Object[0]);
            return false;
        }
        if (z) {
            com.adjust.sdk.AdjustFactory.getLogger().warn("Adjust not initialized, but %s saved for launch", str);
        } else {
            com.adjust.sdk.AdjustFactory.getLogger().warn("Adjust not initialized, can't perform %s", str);
        }
        return false;
    }

    private boolean checkActivityHandler(boolean z, java.lang.String str, java.lang.String str2) {
        return z ? checkActivityHandler(str, true) : checkActivityHandler(str2, true);
    }
}
