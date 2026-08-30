package com.adjust.sdk;

/* JADX INFO: loaded from: classes3.dex */
public class ActivityHandler implements com.adjust.sdk.IActivityHandler, com.adjust.sdk.SystemLifecycle.SystemLifecycleCallback {
    private static final java.lang.String ACTIVITY_STATE_NAME = "Activity state";
    private static final java.lang.String ATTRIBUTION_NAME = "Attribution";
    private static long BACKGROUND_TIMER_INTERVAL = 0;
    private static final java.lang.String BACKGROUND_TIMER_NAME = "Background timer";
    private static final java.lang.String DELAY_START_TIMER_NAME = "Delay Start timer";
    private static long FOREGROUND_TIMER_INTERVAL = 0;
    private static final java.lang.String FOREGROUND_TIMER_NAME = "Foreground timer";
    private static long FOREGROUND_TIMER_START = 0;
    private static final java.lang.String GLOBAL_CALLBACK_PARAMETERS_NAME = "Global Callback parameters";
    private static final java.lang.String GLOBAL_PARAMETERS_NAME = "Global parameters";
    private static final java.lang.String GLOBAL_PARTNER_PARAMETERS_NAME = "Global Partner parameters";
    private static long SESSION_INTERVAL = 0;
    private static long SUBSESSION_INTERVAL = 0;
    private static final java.lang.String TIME_TRAVEL = "Time travel!";
    private com.adjust.sdk.ActivityState activityState;
    private com.adjust.sdk.AdjustConfig adjustConfig;
    private com.adjust.sdk.AdjustAttribution attribution;
    private com.adjust.sdk.IAttributionHandler attributionHandler;
    private com.adjust.sdk.scheduler.TimerOnce backgroundTimer;
    private java.lang.String basePath;
    private java.util.ArrayList<com.adjust.sdk.OnAdidReadListener> cachedAdidReadCallbacks = new java.util.ArrayList<>();
    private java.util.ArrayList<com.adjust.sdk.OnAttributionReadListener> cachedAttributionReadCallbacks = new java.util.ArrayList<>();
    private com.adjust.sdk.OnDeeplinkResolvedListener cachedDeeplinkResolutionCallback;
    private com.adjust.sdk.DeviceInfo deviceInfo;
    private com.adjust.sdk.scheduler.ThreadExecutor executor;
    private com.adjust.sdk.scheduler.TimerCycle foregroundTimer;
    private java.lang.String gdprPath;
    private com.adjust.sdk.GlobalParameters globalParameters;
    private com.adjust.sdk.InstallReferrer installReferrer;
    private com.adjust.sdk.ActivityHandler.InternalState internalState;
    private com.adjust.sdk.ILogger logger;
    private com.adjust.sdk.IPackageHandler packageHandler;
    private com.adjust.sdk.IPurchaseVerificationHandler purchaseVerificationHandler;
    private com.adjust.sdk.ISdkClickHandler sdkClickHandler;
    private java.lang.String subscriptionPath;
    private com.adjust.sdk.SystemLifecycle systemLifecycle;

    public class InternalState {
        boolean enabled;
        boolean firstLaunch;
        boolean firstSdkStart;
        java.lang.Boolean foregroundOrElseBackground;
        boolean offline;
        boolean preinstallHasBeenRead;
        boolean sessionResponseProcessed;

        public InternalState() {
        }

        public boolean hasFirstSdkStartNotOcurred() {
            return !this.firstSdkStart;
        }

        public boolean hasFirstSdkStartOcurred() {
            return this.firstSdkStart;
        }

        public boolean hasPreinstallBeenRead() {
            return this.preinstallHasBeenRead;
        }

        public boolean hasSessionResponseNotBeenProcessed() {
            return !this.sessionResponseProcessed;
        }

        public boolean isDisabled() {
            return !this.enabled;
        }

        public boolean isEnabled() {
            return this.enabled;
        }

        public boolean isFirstLaunch() {
            return this.firstLaunch;
        }

        public boolean isInBackground() {
            java.lang.Boolean bool = this.foregroundOrElseBackground;
            return (bool == null || bool.booleanValue()) ? false : true;
        }

        public boolean isInForeground() {
            java.lang.Boolean bool = this.foregroundOrElseBackground;
            return bool != null && bool.booleanValue();
        }

        public boolean isNotFirstLaunch() {
            return !this.firstLaunch;
        }

        public boolean isOffline() {
            return this.offline;
        }

        public boolean isOnline() {
            return !this.offline;
        }
    }

    public class a implements java.lang.Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.adjust.sdk.ActivityHandler.this.sendReftagReferrerI();
        }
    }

    public class a0 implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.adjust.sdk.OnAttributionReadListener f9a;

        public a0(com.adjust.sdk.OnAttributionReadListener onAttributionReadListener) {
            this.f9a = onAttributionReadListener;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f9a.onAttributionRead(com.adjust.sdk.ActivityHandler.this.attribution);
        }
    }

    public class a1 implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ android.net.Uri f10a;
        public final /* synthetic */ long b;

        public a1(android.net.Uri uri, long j) {
            this.f10a = uri;
            this.b = j;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.adjust.sdk.ActivityHandler.this.processDeeplinkI(this.f10a, this.b);
        }
    }

    public class b implements java.lang.Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.adjust.sdk.ActivityHandler.this.sendPreinstallReferrerI();
        }
    }

    public class b0 implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.adjust.sdk.AdjustPlayStorePurchase f12a;
        public final /* synthetic */ com.adjust.sdk.OnPurchaseVerificationFinishedListener b;

        public b0(com.adjust.sdk.AdjustPlayStorePurchase adjustPlayStorePurchase, com.adjust.sdk.OnPurchaseVerificationFinishedListener onPurchaseVerificationFinishedListener) {
            this.f12a = adjustPlayStorePurchase;
            this.b = onPurchaseVerificationFinishedListener;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.adjust.sdk.ActivityHandler.this.verifyPlayStorePurchaseI(this.f12a, this.b);
        }
    }

    public class b1 implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ java.util.ArrayList f13a;
        public final /* synthetic */ java.lang.String b;

        public b1(java.util.ArrayList arrayList, java.lang.String str) {
            this.f13a = arrayList;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            for (com.adjust.sdk.OnAdidReadListener onAdidReadListener : this.f13a) {
                if (onAdidReadListener != null) {
                    onAdidReadListener.onAdidRead(this.b);
                }
            }
        }
    }

    public class c implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.adjust.sdk.ReferrerDetails f14a;
        public final /* synthetic */ java.lang.String b;

        public c(com.adjust.sdk.ReferrerDetails referrerDetails, java.lang.String str) {
            this.f14a = referrerDetails;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.adjust.sdk.ActivityHandler.this.sendInstallReferrerI(this.f14a, this.b);
        }
    }

    public class c0 implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.adjust.sdk.AdjustEvent f15a;
        public final /* synthetic */ com.adjust.sdk.OnPurchaseVerificationFinishedListener b;

        public c0(com.adjust.sdk.AdjustEvent adjustEvent, com.adjust.sdk.OnPurchaseVerificationFinishedListener onPurchaseVerificationFinishedListener) {
            this.f15a = adjustEvent;
            this.b = onPurchaseVerificationFinishedListener;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.adjust.sdk.ActivityHandler.this.verifyAndTrackPlayStorePurchaseI(this.f15a, this.b);
        }
    }

    public class c1 implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ java.util.ArrayList f16a;
        public final /* synthetic */ com.adjust.sdk.AdjustAttribution b;

        public c1(java.util.ArrayList arrayList, com.adjust.sdk.AdjustAttribution adjustAttribution) {
            this.f16a = arrayList;
            this.b = adjustAttribution;
        }

        @Override // java.lang.Runnable
        public final void run() {
            for (com.adjust.sdk.OnAttributionReadListener onAttributionReadListener : this.f16a) {
                if (onAttributionReadListener != null) {
                    onAttributionReadListener.onAttributionRead(this.b);
                }
            }
        }
    }

    public class d implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.adjust.sdk.EventResponseData f17a;

        public d(com.adjust.sdk.EventResponseData eventResponseData) {
            this.f17a = eventResponseData;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.adjust.sdk.ActivityHandler.this.launchEventResponseTasksI(this.f17a);
        }
    }

    public class d0 implements com.adjust.sdk.IRunActivityHandler {
        public d0() {
        }

        @Override // com.adjust.sdk.IRunActivityHandler
        public final void run(com.adjust.sdk.ActivityHandler activityHandler) {
            activityHandler.setEnabledI(com.adjust.sdk.ActivityHandler.this.adjustConfig.startEnabled.booleanValue());
        }
    }

    public class d1 implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f19a;

        public d1(boolean z) {
            this.f19a = z;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.adjust.sdk.ActivityHandler.this.setAskingAttributionI(this.f19a);
        }
    }

    public class e implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.adjust.sdk.SdkClickResponseData f20a;

        public e(com.adjust.sdk.SdkClickResponseData sdkClickResponseData) {
            this.f20a = sdkClickResponseData;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.adjust.sdk.ActivityHandler.this.launchSdkClickResponseTasksI(this.f20a);
        }
    }

    public class e0 implements java.lang.Runnable {
        public e0() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.adjust.sdk.ActivityHandler.this.foregroundTimerFired();
        }
    }

    public class f implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.adjust.sdk.SessionResponseData f22a;

        public f(com.adjust.sdk.SessionResponseData sessionResponseData) {
            this.f22a = sessionResponseData;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.adjust.sdk.ActivityHandler.this.launchSessionResponseTasksI(this.f22a);
        }
    }

    public class f0 implements java.lang.Runnable {
        public f0() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.adjust.sdk.ActivityHandler.this.backgroundTimerFired();
        }
    }

    public class g implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.adjust.sdk.AttributionResponseData f24a;

        public g(com.adjust.sdk.AttributionResponseData attributionResponseData) {
            this.f24a = attributionResponseData;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.adjust.sdk.ActivityHandler.this.launchAttributionResponseTasksI(this.f24a);
        }
    }

    public class g0 implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f25a;

        public g0(boolean z) {
            this.f25a = z;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.adjust.sdk.ActivityHandler.this.setOfflineModeI(this.f25a);
        }
    }

    public class h implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.adjust.sdk.PurchaseVerificationResponseData f26a;

        public h(com.adjust.sdk.PurchaseVerificationResponseData purchaseVerificationResponseData) {
            this.f26a = purchaseVerificationResponseData;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.adjust.sdk.ActivityHandler.this.launchPurchaseVerificationResponseTasksI(this.f26a);
        }
    }

    public class h0 implements com.adjust.sdk.InstallReferrerReadListener {
        public h0() {
        }

        @Override // com.adjust.sdk.InstallReferrerReadListener
        public final void onFail(java.lang.String str) {
            com.adjust.sdk.ActivityHandler.this.logger.debug(str, new java.lang.Object[0]);
        }

        @Override // com.adjust.sdk.InstallReferrerReadListener
        public final void onInstallReferrerRead(com.adjust.sdk.ReferrerDetails referrerDetails, java.lang.String str) {
            com.adjust.sdk.ActivityHandler.this.sendInstallReferrer(referrerDetails, str);
        }
    }

    public class i implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ java.lang.String f28a;
        public final /* synthetic */ java.lang.String b;

        public i(java.lang.String str, java.lang.String str2) {
            this.f28a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.adjust.sdk.ActivityHandler.this.addGlobalCallbackParameterI(this.f28a, this.b);
        }
    }

    public class i0 implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ java.util.ArrayList f29a;
        public final /* synthetic */ com.adjust.sdk.AdjustAttribution b;

        public i0(java.util.ArrayList arrayList, com.adjust.sdk.AdjustAttribution adjustAttribution) {
            this.f29a = arrayList;
            this.b = adjustAttribution;
        }

        @Override // java.lang.Runnable
        public final void run() {
            for (com.adjust.sdk.OnAttributionReadListener onAttributionReadListener : this.f29a) {
                if (onAttributionReadListener != null) {
                    onAttributionReadListener.onAttributionRead(this.b);
                }
            }
        }
    }

    public class j implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ java.lang.String f30a;
        public final /* synthetic */ java.lang.String b;

        public j(java.lang.String str, java.lang.String str2) {
            this.f30a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.adjust.sdk.ActivityHandler.this.addGlobalPartnerParameterI(this.f30a, this.b);
        }
    }

    public class j0 implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ java.util.ArrayList f31a;
        public final /* synthetic */ java.lang.String b;

        public j0(java.util.ArrayList arrayList, java.lang.String str) {
            this.f31a = arrayList;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            for (com.adjust.sdk.OnAdidReadListener onAdidReadListener : this.f31a) {
                if (onAdidReadListener != null) {
                    onAdidReadListener.onAdidRead(this.b);
                }
            }
        }
    }

    public class k implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.adjust.sdk.AdjustEvent f32a;

        public k(com.adjust.sdk.AdjustEvent adjustEvent) {
            this.f32a = adjustEvent;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (com.adjust.sdk.ActivityHandler.this.internalState.hasFirstSdkStartNotOcurred()) {
                com.adjust.sdk.ActivityHandler.this.logger.warn("Event tracked before first activity resumed.\nIf it was triggered in the Application class, it might timestamp or even send an install long before the user opens the app.\nPlease check https://github.com/adjust/android_sdk#can-i-trigger-an-event-at-application-launch for more information.", new java.lang.Object[0]);
                com.adjust.sdk.ActivityHandler.this.startI();
            }
            com.adjust.sdk.ActivityHandler.this.trackEventI(this.f32a);
        }
    }

    public class k0 implements java.lang.Runnable {
        public k0() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.adjust.sdk.ReferrerDetails metaReferrer = com.adjust.sdk.Reflection.getMetaReferrer(com.adjust.sdk.ActivityHandler.this.getContext(), com.adjust.sdk.ActivityHandler.this.adjustConfig.fbAppId, com.adjust.sdk.ActivityHandler.this.logger);
            if (metaReferrer != null) {
                com.adjust.sdk.ActivityHandler.this.sendInstallReferrer(metaReferrer, com.adjust.sdk.Constants.REFERRER_API_META);
            }
        }
    }

    public class l implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ java.lang.String f34a;

        public l(java.lang.String str) {
            this.f34a = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.adjust.sdk.ActivityHandler.this.removeGlobalCallbackParameterI(this.f34a);
        }
    }

    public class l0 implements java.lang.Runnable {
        public l0() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.adjust.sdk.ReferrerDetails huaweiAdsReferrer = com.adjust.sdk.Reflection.getHuaweiAdsReferrer(com.adjust.sdk.ActivityHandler.this.getContext(), com.adjust.sdk.ActivityHandler.this.logger);
            if (huaweiAdsReferrer != null) {
                com.adjust.sdk.ActivityHandler.this.sendInstallReferrer(huaweiAdsReferrer, com.adjust.sdk.Constants.REFERRER_API_HUAWEI_ADS);
            }
        }
    }

    public class m implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ java.lang.String f36a;

        public m(java.lang.String str) {
            this.f36a = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.adjust.sdk.ActivityHandler.this.removeGlobalPartnerParameterI(this.f36a);
        }
    }

    public class m0 implements java.lang.Runnable {
        public m0() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.adjust.sdk.ReferrerDetails huaweiAppGalleryReferrer = com.adjust.sdk.Reflection.getHuaweiAppGalleryReferrer(com.adjust.sdk.ActivityHandler.this.getContext(), com.adjust.sdk.ActivityHandler.this.logger);
            if (huaweiAppGalleryReferrer != null) {
                com.adjust.sdk.ActivityHandler.this.sendInstallReferrer(huaweiAppGalleryReferrer, com.adjust.sdk.Constants.REFERRER_API_HUAWEI_APP_GALLERY);
            }
        }
    }

    public class n implements java.lang.Runnable {
        public n() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.adjust.sdk.ActivityHandler.this.removeGlobalCallbackParametersI();
        }
    }

    public class n0 implements java.lang.Runnable {
        public n0() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.adjust.sdk.ReferrerDetails samsungReferrer = com.adjust.sdk.Reflection.getSamsungReferrer(com.adjust.sdk.ActivityHandler.this.getContext(), com.adjust.sdk.ActivityHandler.this.logger);
            if (samsungReferrer != null) {
                com.adjust.sdk.ActivityHandler.this.sendInstallReferrer(samsungReferrer, com.adjust.sdk.Constants.REFERRER_API_SAMSUNG);
            }
        }
    }

    public class o implements java.lang.Runnable {
        public o() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.adjust.sdk.ActivityHandler.this.removeGlobalPartnerParametersI();
        }
    }

    public class o0 implements java.lang.Runnable {
        public o0() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.adjust.sdk.ReferrerDetails xiaomiReferrer = com.adjust.sdk.Reflection.getXiaomiReferrer(com.adjust.sdk.ActivityHandler.this.getContext(), com.adjust.sdk.ActivityHandler.this.logger);
            if (xiaomiReferrer != null) {
                com.adjust.sdk.ActivityHandler.this.sendInstallReferrer(xiaomiReferrer, com.adjust.sdk.Constants.REFERRER_API_XIAOMI);
            }
        }
    }

    public class p implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f42a;
        public final /* synthetic */ java.lang.String b;

        public p(boolean z, java.lang.String str) {
            this.f42a = z;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (!this.f42a) {
                com.adjust.sdk.SharedPreferencesManager.getDefaultInstance(com.adjust.sdk.ActivityHandler.this.getContext()).savePushToken(this.b);
            }
            if (com.adjust.sdk.ActivityHandler.this.internalState.hasFirstSdkStartNotOcurred()) {
                return;
            }
            com.adjust.sdk.ActivityHandler.this.setPushTokenI(this.b);
        }
    }

    public class p0 implements java.lang.Runnable {
        public p0() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.adjust.sdk.ReferrerDetails vivoReferrer = com.adjust.sdk.Reflection.getVivoReferrer(com.adjust.sdk.ActivityHandler.this.getContext(), com.adjust.sdk.ActivityHandler.this.logger);
            if (vivoReferrer != null) {
                com.adjust.sdk.ActivityHandler.this.sendInstallReferrer(vivoReferrer, com.adjust.sdk.Constants.REFERRER_API_VIVO);
            }
        }
    }

    public class q implements java.lang.Runnable {
        public q() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.adjust.sdk.ActivityHandler.this.gdprForgetMeI();
        }
    }

    public class q0 implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.adjust.sdk.EventResponseData f45a;

        public q0(com.adjust.sdk.EventResponseData eventResponseData) {
            this.f45a = eventResponseData;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (com.adjust.sdk.ActivityHandler.this.adjustConfig == null || com.adjust.sdk.ActivityHandler.this.adjustConfig.onEventTrackingSucceededListener == null) {
                return;
            }
            com.adjust.sdk.ActivityHandler.this.adjustConfig.onEventTrackingSucceededListener.onEventTrackingSucceeded(this.f45a.getSuccessResponseData());
        }
    }

    public class r implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.adjust.sdk.AdjustThirdPartySharing f46a;

        public r(com.adjust.sdk.AdjustThirdPartySharing adjustThirdPartySharing) {
            this.f46a = adjustThirdPartySharing;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.adjust.sdk.ActivityHandler.this.trackThirdPartySharingI(this.f46a);
        }
    }

    public class r0 implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.adjust.sdk.OnIsEnabledListener f47a;

        public r0(com.adjust.sdk.OnIsEnabledListener onIsEnabledListener) {
            this.f47a = onIsEnabledListener;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f47a.onIsEnabledRead(com.adjust.sdk.ActivityHandler.this.isEnabledI());
        }
    }

    public class s implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f48a;

        public s(boolean z) {
            this.f48a = z;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.adjust.sdk.ActivityHandler.this.trackMeasurementConsentI(this.f48a);
        }
    }

    public class s0 implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.adjust.sdk.EventResponseData f49a;

        public s0(com.adjust.sdk.EventResponseData eventResponseData) {
            this.f49a = eventResponseData;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (com.adjust.sdk.ActivityHandler.this.adjustConfig == null || com.adjust.sdk.ActivityHandler.this.adjustConfig.onEventTrackingFailedListener == null) {
                return;
            }
            com.adjust.sdk.ActivityHandler.this.adjustConfig.onEventTrackingFailedListener.onEventTrackingFailed(this.f49a.getFailureResponseData());
        }
    }

    public class t implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.adjust.sdk.AdjustAdRevenue f50a;

        public t(com.adjust.sdk.AdjustAdRevenue adjustAdRevenue) {
            this.f50a = adjustAdRevenue;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.adjust.sdk.ActivityHandler.this.trackAdRevenueI(this.f50a);
        }
    }

    public class t0 implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.adjust.sdk.OnDeeplinkResolvedListener f51a;
        public final /* synthetic */ com.adjust.sdk.SdkClickResponseData b;

        public t0(com.adjust.sdk.OnDeeplinkResolvedListener onDeeplinkResolvedListener, com.adjust.sdk.SdkClickResponseData sdkClickResponseData) {
            this.f51a = onDeeplinkResolvedListener;
            this.b = sdkClickResponseData;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f51a.onDeeplinkResolved(this.b.resolvedDeeplink);
        }
    }

    public class u implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.adjust.sdk.AdjustPlayStoreSubscription f52a;

        public u(com.adjust.sdk.AdjustPlayStoreSubscription adjustPlayStoreSubscription) {
            this.f52a = adjustPlayStoreSubscription;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.adjust.sdk.ActivityHandler.this.trackPlayStoreSubscriptionI(this.f52a);
        }
    }

    public class u0 implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.adjust.sdk.SessionResponseData f53a;

        public u0(com.adjust.sdk.SessionResponseData sessionResponseData) {
            this.f53a = sessionResponseData;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (com.adjust.sdk.ActivityHandler.this.adjustConfig == null || com.adjust.sdk.ActivityHandler.this.adjustConfig.onSessionTrackingSucceededListener == null) {
                return;
            }
            com.adjust.sdk.ActivityHandler.this.adjustConfig.onSessionTrackingSucceededListener.onSessionTrackingSucceeded(this.f53a.getSuccessResponseData());
        }
    }

    public class v implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f54a;

        public v(boolean z) {
            this.f54a = z;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.adjust.sdk.ActivityHandler.this.setEnabledI(this.f54a);
        }
    }

    public class v0 implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.adjust.sdk.SessionResponseData f55a;

        public v0(com.adjust.sdk.SessionResponseData sessionResponseData) {
            this.f55a = sessionResponseData;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (com.adjust.sdk.ActivityHandler.this.adjustConfig == null || com.adjust.sdk.ActivityHandler.this.adjustConfig.onSessionTrackingFailedListener == null) {
                return;
            }
            com.adjust.sdk.ActivityHandler.this.adjustConfig.onSessionTrackingFailedListener.onSessionTrackingFailed(this.f55a.getFailureResponseData());
        }
    }

    public class w implements java.lang.Runnable {
        public w() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.adjust.sdk.ActivityHandler.this.gotOptOutResponseI();
        }
    }

    public class w0 implements java.lang.Runnable {
        public w0() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (com.adjust.sdk.ActivityHandler.this.adjustConfig == null || com.adjust.sdk.ActivityHandler.this.adjustConfig.onAttributionChangedListener == null) {
                return;
            }
            com.adjust.sdk.ActivityHandler.this.adjustConfig.onAttributionChangedListener.onAttributionChanged(com.adjust.sdk.ActivityHandler.this.attribution);
        }
    }

    public class x implements java.lang.Runnable {
        public x() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.adjust.sdk.ActivityHandler.this.foregroundTimerFiredI();
        }
    }

    public class x0 implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.adjust.sdk.PurchaseVerificationResponseData f59a;
        public final /* synthetic */ com.adjust.sdk.AdjustPurchaseVerificationResult b;

        public x0(com.adjust.sdk.PurchaseVerificationResponseData purchaseVerificationResponseData, com.adjust.sdk.AdjustPurchaseVerificationResult adjustPurchaseVerificationResult) {
            this.f59a = purchaseVerificationResponseData;
            this.b = adjustPurchaseVerificationResult;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f59a.activityPackage.getPurchaseVerificationCallback().onVerificationFinished(this.b);
        }
    }

    public class y implements java.lang.Runnable {
        public y() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.adjust.sdk.ActivityHandler.this.backgroundTimerFiredI();
        }
    }

    public class y0 implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ android.net.Uri f61a;
        public final /* synthetic */ android.content.Intent b;

        public y0(android.content.Intent intent, android.net.Uri uri) {
            this.f61a = uri;
            this.b = intent;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (com.adjust.sdk.ActivityHandler.this.adjustConfig == null) {
                return;
            }
            if (com.adjust.sdk.ActivityHandler.this.adjustConfig.onDeferredDeeplinkResponseListener != null ? com.adjust.sdk.ActivityHandler.this.adjustConfig.onDeferredDeeplinkResponseListener.launchReceivedDeeplink(this.f61a) : true) {
                com.adjust.sdk.ActivityHandler.this.launchDeeplinkMain(this.b, this.f61a);
            }
        }
    }

    public class z implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.adjust.sdk.OnAdidReadListener f62a;

        public z(com.adjust.sdk.OnAdidReadListener onAdidReadListener) {
            this.f62a = onAdidReadListener;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f62a.onAdidRead(com.adjust.sdk.ActivityHandler.this.activityState.adid);
        }
    }

    public class z0 implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ android.net.Uri f63a;
        public final /* synthetic */ long b;

        public z0(android.net.Uri uri, long j) {
            this.f63a = uri;
            this.b = j;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.adjust.sdk.ActivityHandler.this.processDeeplinkI(this.f63a, this.b);
        }
    }

    private ActivityHandler(com.adjust.sdk.AdjustConfig adjustConfig) {
        init(adjustConfig);
        com.adjust.sdk.ILogger logger = com.adjust.sdk.AdjustFactory.getLogger();
        this.logger = logger;
        logger.lockLogLevel();
        this.executor = new com.adjust.sdk.scheduler.SingleThreadCachedScheduler("ActivityHandler");
        com.adjust.sdk.ActivityHandler.InternalState internalState = new com.adjust.sdk.ActivityHandler.InternalState();
        this.internalState = internalState;
        java.lang.Boolean bool = adjustConfig.startEnabled;
        internalState.enabled = bool != null ? bool.booleanValue() : true;
        com.adjust.sdk.ActivityHandler.InternalState internalState2 = this.internalState;
        internalState2.offline = adjustConfig.startOffline;
        internalState2.sessionResponseProcessed = false;
        internalState2.firstSdkStart = false;
        internalState2.preinstallHasBeenRead = false;
        this.executor.submit(new java.lang.Runnable() { // from class: com.adjust.sdk.ActivityHandler$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m481lambda$new$1$comadjustsdkActivityHandler();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void backgroundTimerFiredI() {
        if (toSendI()) {
            this.packageHandler.sendFirstPackage();
        }
    }

    private void bootstrapLifecycleI() {
        com.adjust.sdk.SystemLifecycle singletonInstance = com.adjust.sdk.SystemLifecycle.getSingletonInstance();
        this.systemLifecycle = singletonInstance;
        java.util.Iterator<java.lang.String> it = singletonInstance.logMessageList.iterator();
        while (it.hasNext()) {
            this.logger.debug("Lifecycle: %s", it.next());
        }
        this.systemLifecycle.overwriteCallback(this);
        if (com.adjust.sdk.AdjustFactory.isSystemLifecycleBootstrapIgnored()) {
            return;
        }
        this.internalState.foregroundOrElseBackground = this.systemLifecycle.foregroundOrElseBackgroundCached();
        if (this.internalState.isInForeground()) {
            onResumeI();
        }
    }

    private boolean checkActivityStateI(com.adjust.sdk.ActivityState activityState) {
        if (!this.internalState.hasFirstSdkStartNotOcurred()) {
            return true;
        }
        this.logger.error("Sdk did not yet start", new java.lang.Object[0]);
        return false;
    }

    private boolean checkAdjustAdRevenue(com.adjust.sdk.AdjustAdRevenue adjustAdRevenue) {
        if (adjustAdRevenue == null) {
            this.logger.error("Ad revenue object missing", new java.lang.Object[0]);
            return false;
        }
        if (adjustAdRevenue.isValid()) {
            return true;
        }
        this.logger.error("Ad revenue object not initialized correctly", new java.lang.Object[0]);
        return false;
    }

    private void checkAfterNewStartI() {
        checkAfterNewStartI(com.adjust.sdk.SharedPreferencesManager.getDefaultInstance(getContext()));
    }

    private void checkAttributionStateI() {
        if (checkActivityStateI(this.activityState)) {
            if (this.internalState.isFirstLaunch() && this.internalState.hasSessionResponseNotBeenProcessed()) {
                return;
            }
            if (this.attribution == null || this.activityState.askingAttribution) {
                this.attributionHandler.getAttribution();
            }
        }
    }

    private boolean checkEventI(com.adjust.sdk.AdjustEvent adjustEvent) {
        if (adjustEvent == null) {
            this.logger.error("Event missing", new java.lang.Object[0]);
            return false;
        }
        if (adjustEvent.isValid()) {
            return true;
        }
        this.logger.error("Event not initialized correctly", new java.lang.Object[0]);
        return false;
    }

    private void checkForInstallReferrerInfo(com.adjust.sdk.SdkClickResponseData sdkClickResponseData) {
        if (sdkClickResponseData.isInstallReferrer) {
            java.lang.String str = sdkClickResponseData.referrerApi;
            if (str != null && str.equalsIgnoreCase(com.adjust.sdk.Constants.REFERRER_API_HUAWEI_ADS)) {
                com.adjust.sdk.ActivityState activityState = this.activityState;
                activityState.clickTimeHuawei = sdkClickResponseData.clickTime;
                activityState.installBeginHuawei = sdkClickResponseData.installBegin;
                activityState.installReferrerHuawei = sdkClickResponseData.installReferrer;
            } else {
                java.lang.String str2 = sdkClickResponseData.referrerApi;
                if (str2 != null && str2.equalsIgnoreCase(com.adjust.sdk.Constants.REFERRER_API_HUAWEI_APP_GALLERY)) {
                    com.adjust.sdk.ActivityState activityState2 = this.activityState;
                    activityState2.clickTimeHuawei = sdkClickResponseData.clickTime;
                    activityState2.installBeginHuawei = sdkClickResponseData.installBegin;
                    activityState2.installReferrerHuaweiAppGallery = sdkClickResponseData.installReferrer;
                } else {
                    java.lang.String str3 = sdkClickResponseData.referrerApi;
                    if (str3 != null && str3.equalsIgnoreCase(com.adjust.sdk.Constants.REFERRER_API_META)) {
                        com.adjust.sdk.ActivityState activityState3 = this.activityState;
                        activityState3.clickTimeMeta = sdkClickResponseData.clickTime;
                        activityState3.installReferrerMeta = sdkClickResponseData.installReferrer;
                        activityState3.isClickMeta = sdkClickResponseData.isClick;
                    } else {
                        java.lang.String str4 = sdkClickResponseData.referrerApi;
                        if (str4 != null && str4.equalsIgnoreCase(com.adjust.sdk.Constants.REFERRER_API_SAMSUNG)) {
                            com.adjust.sdk.ActivityState activityState4 = this.activityState;
                            activityState4.clickTimeSamsung = sdkClickResponseData.clickTime;
                            activityState4.installBeginSamsung = sdkClickResponseData.installBegin;
                            activityState4.installReferrerSamsung = sdkClickResponseData.installReferrer;
                        } else {
                            java.lang.String str5 = sdkClickResponseData.referrerApi;
                            if (str5 != null && str5.equalsIgnoreCase(com.adjust.sdk.Constants.REFERRER_API_XIAOMI)) {
                                com.adjust.sdk.ActivityState activityState5 = this.activityState;
                                activityState5.clickTimeXiaomi = sdkClickResponseData.clickTime;
                                activityState5.installBeginXiaomi = sdkClickResponseData.installBegin;
                                activityState5.installReferrerXiaomi = sdkClickResponseData.installReferrer;
                                activityState5.clickTimeServerXiaomi = sdkClickResponseData.clickTimeServer;
                                activityState5.installBeginServerXiaomi = sdkClickResponseData.installBeginServer;
                                activityState5.installVersionXiaomi = sdkClickResponseData.installVersion;
                            } else {
                                java.lang.String str6 = sdkClickResponseData.referrerApi;
                                boolean z2 = str6 != null && str6.equalsIgnoreCase(com.adjust.sdk.Constants.REFERRER_API_VIVO);
                                com.adjust.sdk.ActivityState activityState6 = this.activityState;
                                if (z2) {
                                    activityState6.clickTimeVivo = sdkClickResponseData.clickTime;
                                    activityState6.installBeginVivo = sdkClickResponseData.installBegin;
                                    activityState6.installReferrerVivo = sdkClickResponseData.installReferrer;
                                    activityState6.installVersionVivo = sdkClickResponseData.installVersion;
                                } else {
                                    activityState6.clickTime = sdkClickResponseData.clickTime;
                                    activityState6.installBegin = sdkClickResponseData.installBegin;
                                    activityState6.installReferrer = sdkClickResponseData.installReferrer;
                                    activityState6.clickTimeServer = sdkClickResponseData.clickTimeServer;
                                    activityState6.installBeginServer = sdkClickResponseData.installBeginServer;
                                    activityState6.installVersion = sdkClickResponseData.installVersion;
                                    activityState6.googlePlayInstant = sdkClickResponseData.googlePlayInstant;
                                }
                            }
                        }
                    }
                }
            }
            writeActivityStateI();
        }
    }

    private void checkForPreinstallI() {
        com.adjust.sdk.ActivityState activityState = this.activityState;
        if (activityState == null || !activityState.enabled || activityState.isGdprForgotten) {
            return;
        }
        sendPreinstallReferrerI();
        if (this.adjustConfig.isPreinstallTrackingEnabled && !this.internalState.hasPreinstallBeenRead()) {
            java.lang.String str = this.deviceInfo.packageName;
            if (str == null || str.isEmpty()) {
                this.logger.debug("Can't read preinstall payload, invalid package name", new java.lang.Object[0]);
                return;
            }
            com.adjust.sdk.SharedPreferencesManager defaultInstance = com.adjust.sdk.SharedPreferencesManager.getDefaultInstance(getContext());
            long preinstallPayloadReadStatus = defaultInstance.getPreinstallPayloadReadStatus();
            if (com.adjust.sdk.PreinstallUtil.hasAllLocationsBeenRead(preinstallPayloadReadStatus)) {
                this.internalState.preinstallHasBeenRead = true;
                return;
            }
            if (com.adjust.sdk.PreinstallUtil.hasNotBeenRead(com.adjust.sdk.Constants.SYSTEM_PROPERTIES, preinstallPayloadReadStatus)) {
                java.lang.String payloadFromSystemProperty = com.adjust.sdk.PreinstallUtil.getPayloadFromSystemProperty(this.deviceInfo.packageName, this.logger);
                if (payloadFromSystemProperty == null || payloadFromSystemProperty.isEmpty()) {
                    preinstallPayloadReadStatus = com.adjust.sdk.PreinstallUtil.markAsRead(com.adjust.sdk.Constants.SYSTEM_PROPERTIES, preinstallPayloadReadStatus);
                } else {
                    this.sdkClickHandler.sendPreinstallPayload(payloadFromSystemProperty, com.adjust.sdk.Constants.SYSTEM_PROPERTIES);
                }
            }
            if (com.adjust.sdk.PreinstallUtil.hasNotBeenRead(com.adjust.sdk.Constants.SYSTEM_PROPERTIES_REFLECTION, preinstallPayloadReadStatus)) {
                java.lang.String payloadFromSystemPropertyReflection = com.adjust.sdk.PreinstallUtil.getPayloadFromSystemPropertyReflection(this.deviceInfo.packageName, this.logger);
                if (payloadFromSystemPropertyReflection == null || payloadFromSystemPropertyReflection.isEmpty()) {
                    preinstallPayloadReadStatus = com.adjust.sdk.PreinstallUtil.markAsRead(com.adjust.sdk.Constants.SYSTEM_PROPERTIES_REFLECTION, preinstallPayloadReadStatus);
                } else {
                    this.sdkClickHandler.sendPreinstallPayload(payloadFromSystemPropertyReflection, com.adjust.sdk.Constants.SYSTEM_PROPERTIES_REFLECTION);
                }
            }
            if (com.adjust.sdk.PreinstallUtil.hasNotBeenRead(com.adjust.sdk.Constants.SYSTEM_PROPERTIES_PATH, preinstallPayloadReadStatus)) {
                java.lang.String payloadFromSystemPropertyFilePath = com.adjust.sdk.PreinstallUtil.getPayloadFromSystemPropertyFilePath(this.deviceInfo.packageName, this.logger);
                if (payloadFromSystemPropertyFilePath == null || payloadFromSystemPropertyFilePath.isEmpty()) {
                    preinstallPayloadReadStatus = com.adjust.sdk.PreinstallUtil.markAsRead(com.adjust.sdk.Constants.SYSTEM_PROPERTIES_PATH, preinstallPayloadReadStatus);
                } else {
                    this.sdkClickHandler.sendPreinstallPayload(payloadFromSystemPropertyFilePath, com.adjust.sdk.Constants.SYSTEM_PROPERTIES_PATH);
                }
            }
            if (com.adjust.sdk.PreinstallUtil.hasNotBeenRead(com.adjust.sdk.Constants.SYSTEM_PROPERTIES_PATH_REFLECTION, preinstallPayloadReadStatus)) {
                java.lang.String payloadFromSystemPropertyFilePathReflection = com.adjust.sdk.PreinstallUtil.getPayloadFromSystemPropertyFilePathReflection(this.deviceInfo.packageName, this.logger);
                if (payloadFromSystemPropertyFilePathReflection == null || payloadFromSystemPropertyFilePathReflection.isEmpty()) {
                    preinstallPayloadReadStatus = com.adjust.sdk.PreinstallUtil.markAsRead(com.adjust.sdk.Constants.SYSTEM_PROPERTIES_PATH_REFLECTION, preinstallPayloadReadStatus);
                } else {
                    this.sdkClickHandler.sendPreinstallPayload(payloadFromSystemPropertyFilePathReflection, com.adjust.sdk.Constants.SYSTEM_PROPERTIES_PATH_REFLECTION);
                }
            }
            if (com.adjust.sdk.PreinstallUtil.hasNotBeenRead(com.adjust.sdk.Constants.CONTENT_PROVIDER, preinstallPayloadReadStatus)) {
                java.lang.String payloadFromContentProviderDefault = com.adjust.sdk.PreinstallUtil.getPayloadFromContentProviderDefault(this.adjustConfig.context, this.deviceInfo.packageName, this.logger);
                if (payloadFromContentProviderDefault == null || payloadFromContentProviderDefault.isEmpty()) {
                    preinstallPayloadReadStatus = com.adjust.sdk.PreinstallUtil.markAsRead(com.adjust.sdk.Constants.CONTENT_PROVIDER, preinstallPayloadReadStatus);
                } else {
                    this.sdkClickHandler.sendPreinstallPayload(payloadFromContentProviderDefault, com.adjust.sdk.Constants.CONTENT_PROVIDER);
                }
            }
            if (com.adjust.sdk.PreinstallUtil.hasNotBeenRead(com.adjust.sdk.Constants.CONTENT_PROVIDER_INTENT_ACTION, preinstallPayloadReadStatus)) {
                java.util.List<java.lang.String> payloadsFromContentProviderIntentAction = com.adjust.sdk.PreinstallUtil.getPayloadsFromContentProviderIntentAction(this.adjustConfig.context, this.deviceInfo.packageName, this.logger);
                if (payloadsFromContentProviderIntentAction == null || payloadsFromContentProviderIntentAction.isEmpty()) {
                    preinstallPayloadReadStatus = com.adjust.sdk.PreinstallUtil.markAsRead(com.adjust.sdk.Constants.CONTENT_PROVIDER_INTENT_ACTION, preinstallPayloadReadStatus);
                } else {
                    java.util.Iterator<java.lang.String> it = payloadsFromContentProviderIntentAction.iterator();
                    while (it.hasNext()) {
                        this.sdkClickHandler.sendPreinstallPayload(it.next(), com.adjust.sdk.Constants.CONTENT_PROVIDER_INTENT_ACTION);
                    }
                }
            }
            if (com.adjust.sdk.PreinstallUtil.hasNotBeenRead(com.adjust.sdk.Constants.CONTENT_PROVIDER_NO_PERMISSION, preinstallPayloadReadStatus)) {
                java.util.List<java.lang.String> payloadsFromContentProviderNoPermission = com.adjust.sdk.PreinstallUtil.getPayloadsFromContentProviderNoPermission(this.adjustConfig.context, this.deviceInfo.packageName, this.logger);
                if (payloadsFromContentProviderNoPermission == null || payloadsFromContentProviderNoPermission.isEmpty()) {
                    preinstallPayloadReadStatus = com.adjust.sdk.PreinstallUtil.markAsRead(com.adjust.sdk.Constants.CONTENT_PROVIDER_NO_PERMISSION, preinstallPayloadReadStatus);
                } else {
                    java.util.Iterator<java.lang.String> it2 = payloadsFromContentProviderNoPermission.iterator();
                    while (it2.hasNext()) {
                        this.sdkClickHandler.sendPreinstallPayload(it2.next(), com.adjust.sdk.Constants.CONTENT_PROVIDER_NO_PERMISSION);
                    }
                }
            }
            if (com.adjust.sdk.PreinstallUtil.hasNotBeenRead(com.adjust.sdk.Constants.FILE_SYSTEM, preinstallPayloadReadStatus)) {
                java.lang.String payloadFromFileSystem = com.adjust.sdk.PreinstallUtil.getPayloadFromFileSystem(this.deviceInfo.packageName, this.adjustConfig.preinstallFilePath, this.logger);
                if (payloadFromFileSystem == null || payloadFromFileSystem.isEmpty()) {
                    preinstallPayloadReadStatus = com.adjust.sdk.PreinstallUtil.markAsRead(com.adjust.sdk.Constants.FILE_SYSTEM, preinstallPayloadReadStatus);
                } else {
                    this.sdkClickHandler.sendPreinstallPayload(payloadFromFileSystem, com.adjust.sdk.Constants.FILE_SYSTEM);
                }
            }
            defaultInstance.setPreinstallPayloadReadStatus(preinstallPayloadReadStatus);
            this.internalState.preinstallHasBeenRead = true;
        }
    }

    private android.content.Intent createDeeplinkIntentI(android.net.Uri uri) {
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", uri);
        intent.setFlags(268435456);
        intent.setPackage(this.adjustConfig.context.getPackageName());
        return intent;
    }

    public static boolean deleteActivityState(android.content.Context context) {
        return context.deleteFile(com.adjust.sdk.Constants.ACTIVITY_STATE_FILENAME);
    }

    public static boolean deleteAttribution(android.content.Context context) {
        return context.deleteFile(com.adjust.sdk.Constants.ATTRIBUTION_FILENAME);
    }

    public static boolean deleteGlobalCallbackParameters(android.content.Context context) {
        return context.deleteFile(com.adjust.sdk.Constants.GLOBAL_CALLBACK_PARAMETERS_FILENAME);
    }

    public static boolean deleteGlobalPartnerParameters(android.content.Context context) {
        return context.deleteFile(com.adjust.sdk.Constants.GLOBAL_PARTNER_PARAMETERS_FILENAME);
    }

    public static void deleteState(android.content.Context context) {
        deleteActivityState(context);
        deleteAttribution(context);
        deleteGlobalCallbackParameters(context);
        deleteGlobalPartnerParameters(context);
        com.adjust.sdk.SharedPreferencesManager.getDefaultInstance(context).clear();
    }

    private void disableThirdPartySharingForCoppaEnabledI() {
        if (shouldDisableThirdPartySharingWhenCoppaEnabled()) {
            this.activityState.isThirdPartySharingDisabledForCoppa = true;
            writeActivityStateI();
            this.packageHandler.addPackage(new com.adjust.sdk.PackageBuilder(this.adjustConfig, this.deviceInfo, this.activityState, this.globalParameters, java.lang.System.currentTimeMillis()).buildThirdPartySharingPackage(new com.adjust.sdk.AdjustThirdPartySharing(java.lang.Boolean.FALSE)));
            this.packageHandler.sendFirstPackage();
        }
    }

    private void endI() {
        if (!toSendI()) {
            pauseSendingI();
        }
        if (updateActivityStateI(java.lang.System.currentTimeMillis())) {
            writeActivityStateI();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void foregroundTimerFiredI() {
        if (!isEnabledI()) {
            stopForegroundTimerI();
            return;
        }
        if (toSendI()) {
            this.packageHandler.sendFirstPackage();
        }
        if (updateActivityStateI(java.lang.System.currentTimeMillis())) {
            writeActivityStateI();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gdprForgetMeI() {
        if (checkActivityStateI(this.activityState) && isEnabledI()) {
            com.adjust.sdk.ActivityState activityState = this.activityState;
            if (activityState.isGdprForgotten) {
                return;
            }
            activityState.isGdprForgotten = true;
            writeActivityStateI();
            com.adjust.sdk.PackageBuilder packageBuilder = new com.adjust.sdk.PackageBuilder(this.adjustConfig, this.deviceInfo, this.activityState, this.globalParameters, java.lang.System.currentTimeMillis());
            packageBuilder.internalState = this.internalState;
            this.packageHandler.addPackage(packageBuilder.buildGdprPackage());
            com.adjust.sdk.SharedPreferencesManager.getDefaultInstance(getContext()).removeGdprForgetMe();
            this.packageHandler.sendFirstPackage();
        }
    }

    public static com.adjust.sdk.ActivityHandler getInstance(com.adjust.sdk.AdjustConfig adjustConfig) {
        java.util.List<android.app.ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        if (adjustConfig == null) {
            com.adjust.sdk.AdjustFactory.getLogger().error("AdjustConfig missing", new java.lang.Object[0]);
            return null;
        }
        if (!adjustConfig.isValid()) {
            com.adjust.sdk.AdjustFactory.getLogger().error("AdjustConfig not initialized correctly", new java.lang.Object[0]);
            return null;
        }
        if (adjustConfig.processName != null) {
            int iMyPid = android.os.Process.myPid();
            android.app.ActivityManager activityManager = (android.app.ActivityManager) adjustConfig.context.getSystemService("activity");
            if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
                return null;
            }
            for (android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.pid == iMyPid) {
                    if (runningAppProcessInfo.processName.equalsIgnoreCase(adjustConfig.processName)) {
                        break;
                    }
                    com.adjust.sdk.AdjustFactory.getLogger().info("Skipping initialization in background process (%s)", runningAppProcessInfo.processName);
                    return null;
                }
            }
        }
        return new com.adjust.sdk.ActivityHandler(adjustConfig);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gotOptOutResponseI() {
        this.activityState.isGdprForgotten = true;
        writeActivityStateI();
        this.packageHandler.flush();
        setEnabledI(false);
    }

    private void handleAdidCallbackI() {
        com.adjust.sdk.ActivityState activityState;
        this.cachedAdidReadCallbacks.addAll(this.adjustConfig.cachedAdidReadCallbacks);
        this.adjustConfig.cachedAdidReadCallbacks.clear();
        if (this.cachedAdidReadCallbacks.isEmpty() || (activityState = this.activityState) == null || activityState.adid == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(this.cachedAdidReadCallbacks);
        java.lang.String str = this.activityState.adid;
        this.cachedAdidReadCallbacks.clear();
        new android.os.Handler(this.adjustConfig.context.getMainLooper()).post(new com.adjust.sdk.ActivityHandler.j0(arrayList, str));
    }

    private void handleAttributionCallbackI() {
        this.cachedAttributionReadCallbacks.addAll(this.adjustConfig.cachedAttributionReadCallbacks);
        this.adjustConfig.cachedAttributionReadCallbacks.clear();
        if (this.cachedAttributionReadCallbacks.isEmpty() || this.attribution == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(this.cachedAttributionReadCallbacks);
        com.adjust.sdk.AdjustAttribution adjustAttribution = this.attribution;
        this.cachedAttributionReadCallbacks.clear();
        new android.os.Handler(this.adjustConfig.context.getMainLooper()).post(new com.adjust.sdk.ActivityHandler.i0(arrayList, adjustAttribution));
    }

    private boolean hasChangedStateI(boolean z2, boolean z3, java.lang.String str, java.lang.String str2) {
        if (z2 != z3) {
            return true;
        }
        if (z2) {
            this.logger.debug(str, new java.lang.Object[0]);
        } else {
            this.logger.debug(str2, new java.lang.Object[0]);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initI, reason: merged with bridge method [inline-methods] */
    public void m481lambda$new$1$comadjustsdkActivityHandler() {
        java.lang.String pushToken;
        SESSION_INTERVAL = com.adjust.sdk.AdjustFactory.getSessionInterval();
        SUBSESSION_INTERVAL = com.adjust.sdk.AdjustFactory.getSubsessionInterval();
        FOREGROUND_TIMER_INTERVAL = com.adjust.sdk.AdjustFactory.getTimerInterval();
        FOREGROUND_TIMER_START = com.adjust.sdk.AdjustFactory.getTimerStart();
        BACKGROUND_TIMER_INTERVAL = com.adjust.sdk.AdjustFactory.getTimerInterval();
        readAttributionI(this.adjustConfig.context);
        readActivityStateI(this.adjustConfig.context);
        this.globalParameters = new com.adjust.sdk.GlobalParameters();
        readGlobalCallbackParametersI(this.adjustConfig.context);
        readGlobalPartnerParametersI(this.adjustConfig.context);
        com.adjust.sdk.ActivityState activityState = this.activityState;
        if (activityState != null) {
            activityState.setEventDeduplicationIdsMaxSize(this.adjustConfig.getEventDeduplicationIdsMaxSize());
        }
        com.adjust.sdk.AdjustConfig adjustConfig = this.adjustConfig;
        if (adjustConfig.startEnabled != null) {
            adjustConfig.preLaunchActions.preLaunchActionsArray.add(new com.adjust.sdk.ActivityHandler.d0());
        }
        if (this.internalState.hasFirstSdkStartOcurred()) {
            com.adjust.sdk.ActivityHandler.InternalState internalState = this.internalState;
            internalState.enabled = this.activityState.enabled;
            internalState.firstLaunch = false;
        } else {
            this.internalState.firstLaunch = true;
        }
        readConfigFile(this.adjustConfig.context);
        com.adjust.sdk.DeviceInfo deviceInfo = new com.adjust.sdk.DeviceInfo(this.adjustConfig);
        this.deviceInfo = deviceInfo;
        deviceInfo.reloadPlayIds(this.adjustConfig);
        if (this.deviceInfo.playAdId == null) {
            if (com.adjust.sdk.Util.canReadPlayIds(this.adjustConfig)) {
                this.logger.warn("Unable to get Google Play Services Advertising ID at start time", new java.lang.Object[0]);
            } else {
                this.logger.info("Cannot read Google Play Services Advertising ID with COPPA or play store kids app enabled", new java.lang.Object[0]);
            }
            if (this.deviceInfo.androidId == null) {
                if (com.adjust.sdk.Util.canReadNonPlayIds(this.adjustConfig)) {
                    this.logger.error("Unable to get any Device IDs. Please check if Proguard is correctly set with Adjust SDK", new java.lang.Object[0]);
                } else {
                    this.logger.info("Cannot read non Play IDs with COPPA or play store kids app enabled", new java.lang.Object[0]);
                }
            }
        } else {
            this.logger.info("Google Play Services Advertising ID read correctly at start time", new java.lang.Object[0]);
        }
        java.lang.String str = this.adjustConfig.defaultTracker;
        if (str != null) {
            this.logger.info("Default tracker: '%s'", str);
        }
        java.lang.String str2 = this.adjustConfig.pushToken;
        if (str2 != null) {
            this.logger.info("Push token: '%s'", str2);
            if (this.internalState.hasFirstSdkStartOcurred()) {
                setPushToken(this.adjustConfig.pushToken, false);
            } else {
                com.adjust.sdk.SharedPreferencesManager.getDefaultInstance(getContext()).savePushToken(this.adjustConfig.pushToken);
            }
        } else if (this.internalState.hasFirstSdkStartOcurred() && (pushToken = com.adjust.sdk.SharedPreferencesManager.getDefaultInstance(getContext()).getPushToken()) != null) {
            setPushToken(pushToken, true);
        }
        if (this.cachedDeeplinkResolutionCallback == null) {
            this.cachedDeeplinkResolutionCallback = this.adjustConfig.cachedDeeplinkResolutionCallback;
        }
        handleAdidCallbackI();
        handleAttributionCallbackI();
        if (this.internalState.hasFirstSdkStartOcurred() && com.adjust.sdk.SharedPreferencesManager.getDefaultInstance(getContext()).getGdprForgetMe()) {
            gdprForgetMe();
        }
        this.foregroundTimer = new com.adjust.sdk.scheduler.TimerCycle(new com.adjust.sdk.ActivityHandler.e0(), FOREGROUND_TIMER_START, FOREGROUND_TIMER_INTERVAL, FOREGROUND_TIMER_NAME);
        if (this.adjustConfig.isSendingInBackgroundEnabled) {
            this.logger.info("Send in background configured", new java.lang.Object[0]);
            this.backgroundTimer = new com.adjust.sdk.scheduler.TimerOnce(new com.adjust.sdk.ActivityHandler.f0(), BACKGROUND_TIMER_NAME);
        }
        com.adjust.sdk.AdjustConfig adjustConfig2 = this.adjustConfig;
        this.packageHandler = com.adjust.sdk.AdjustFactory.getPackageHandler(this, this.adjustConfig.context, toSendI(false), new com.adjust.sdk.network.ActivityPackageSender(adjustConfig2.urlStrategyDomains, adjustConfig2.useSubdomains, adjustConfig2.basePath, adjustConfig2.gdprPath, adjustConfig2.subscriptionPath, adjustConfig2.purchaseVerificationPath, this.deviceInfo.clientSdk, adjustConfig2.context));
        com.adjust.sdk.AdjustConfig adjustConfig3 = this.adjustConfig;
        this.attributionHandler = com.adjust.sdk.AdjustFactory.getAttributionHandler(this, toSendI(false), new com.adjust.sdk.network.ActivityPackageSender(adjustConfig3.urlStrategyDomains, adjustConfig3.useSubdomains, adjustConfig3.basePath, adjustConfig3.gdprPath, adjustConfig3.subscriptionPath, adjustConfig3.purchaseVerificationPath, this.deviceInfo.clientSdk, adjustConfig3.context));
        com.adjust.sdk.AdjustConfig adjustConfig4 = this.adjustConfig;
        this.sdkClickHandler = com.adjust.sdk.AdjustFactory.getSdkClickHandler(this, toSendI(true), new com.adjust.sdk.network.ActivityPackageSender(adjustConfig4.urlStrategyDomains, adjustConfig4.useSubdomains, adjustConfig4.basePath, adjustConfig4.gdprPath, adjustConfig4.subscriptionPath, adjustConfig4.purchaseVerificationPath, this.deviceInfo.clientSdk, adjustConfig4.context));
        com.adjust.sdk.AdjustConfig adjustConfig5 = this.adjustConfig;
        this.purchaseVerificationHandler = com.adjust.sdk.AdjustFactory.getPurchaseVerificationHandler(this, toSendI(true), new com.adjust.sdk.network.ActivityPackageSender(adjustConfig5.urlStrategyDomains, adjustConfig5.useSubdomains, adjustConfig5.basePath, adjustConfig5.gdprPath, adjustConfig5.subscriptionPath, adjustConfig5.purchaseVerificationPath, this.deviceInfo.clientSdk, adjustConfig5.context));
        this.installReferrer = new com.adjust.sdk.InstallReferrer(this.adjustConfig.context, new com.adjust.sdk.ActivityHandler.h0());
        preLaunchActionsI(this.adjustConfig.preLaunchActions.preLaunchActionsArray);
        sendReftagReferrerI();
        bootstrapLifecycleI();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isEnabledI() {
        com.adjust.sdk.ActivityState activityState = this.activityState;
        return activityState != null ? activityState.enabled : this.internalState.isEnabled();
    }

    private boolean isValidReferrerDetails(com.adjust.sdk.ReferrerDetails referrerDetails) {
        java.lang.String str;
        return (referrerDetails == null || (str = referrerDetails.installReferrer) == null || str.length() == 0) ? false : true;
    }

    private void launchAttributionListenerI(android.os.Handler handler) {
        if (this.adjustConfig.onAttributionChangedListener == null) {
            return;
        }
        handler.post(new com.adjust.sdk.ActivityHandler.w0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void launchAttributionResponseTasksI(com.adjust.sdk.AttributionResponseData attributionResponseData) {
        updateAdidI(attributionResponseData.adid);
        android.os.Handler handler = new android.os.Handler(this.adjustConfig.context.getMainLooper());
        if (updateAttributionI(attributionResponseData.attribution)) {
            launchAttributionListenerI(handler);
        }
        prepareDeeplinkI(attributionResponseData.deeplink, handler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void launchDeeplinkMain(android.content.Intent intent, android.net.Uri uri) {
        if (!(this.adjustConfig.context.getPackageManager().queryIntentActivities(intent, 0).size() > 0)) {
            this.logger.error("Unable to open deferred deeplink (%s)", uri);
        } else {
            this.logger.info("Open deferred deeplink (%s)", uri);
            this.adjustConfig.context.startActivity(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void launchEventResponseTasksI(com.adjust.sdk.EventResponseData eventResponseData) {
        java.lang.Runnable s0Var;
        updateAdidI(eventResponseData.adid);
        android.os.Handler handler = new android.os.Handler(this.adjustConfig.context.getMainLooper());
        boolean z2 = eventResponseData.success;
        if (z2 && this.adjustConfig.onEventTrackingSucceededListener != null) {
            this.logger.debug("Launching success event tracking listener", new java.lang.Object[0]);
            s0Var = new com.adjust.sdk.ActivityHandler.q0(eventResponseData);
        } else {
            if (z2 || this.adjustConfig.onEventTrackingFailedListener == null) {
                return;
            }
            this.logger.debug("Launching failed event tracking listener", new java.lang.Object[0]);
            s0Var = new com.adjust.sdk.ActivityHandler.s0(eventResponseData);
        }
        handler.post(s0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void launchPurchaseVerificationResponseTasksI(com.adjust.sdk.PurchaseVerificationResponseData purchaseVerificationResponseData) {
        com.adjust.sdk.AdjustEvent adjustEvent;
        android.os.Handler handler = new android.os.Handler(this.adjustConfig.context.getMainLooper());
        org.json.JSONObject jSONObject = purchaseVerificationResponseData.jsonResponse;
        handler.post(new com.adjust.sdk.ActivityHandler.x0(purchaseVerificationResponseData, jSONObject == null ? new com.adjust.sdk.AdjustPurchaseVerificationResult("not_verified", 101, purchaseVerificationResponseData.message) : new com.adjust.sdk.AdjustPurchaseVerificationResult(com.adjust.sdk.network.UtilNetworking.extractJsonString(jSONObject, "verification_status"), com.adjust.sdk.network.UtilNetworking.extractJsonInt(jSONObject, "code"), com.adjust.sdk.network.UtilNetworking.extractJsonString(jSONObject, com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE))));
        com.adjust.sdk.ActivityPackage activityPackage = purchaseVerificationResponseData.activityPackage;
        if (activityPackage == null || (adjustEvent = activityPackage.event) == null) {
            return;
        }
        trackEventI(adjustEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void launchSdkClickResponseTasksI(com.adjust.sdk.SdkClickResponseData sdkClickResponseData) {
        updateAdidI(sdkClickResponseData.adid);
        android.os.Handler handler = new android.os.Handler(this.adjustConfig.context.getMainLooper());
        if (updateAttributionI(sdkClickResponseData.attribution)) {
            launchAttributionListenerI(handler);
        }
        if (android.text.TextUtils.isEmpty(sdkClickResponseData.resolvedDeeplink)) {
            return;
        }
        com.adjust.sdk.OnDeeplinkResolvedListener onDeeplinkResolvedListener = this.cachedDeeplinkResolutionCallback;
        this.cachedDeeplinkResolutionCallback = null;
        if (onDeeplinkResolvedListener != null) {
            handler.post(new com.adjust.sdk.ActivityHandler.t0(onDeeplinkResolvedListener, sdkClickResponseData));
        }
    }

    private void launchSessionResponseListenerI(com.adjust.sdk.SessionResponseData sessionResponseData, android.os.Handler handler) {
        java.lang.Runnable v0Var;
        boolean z2 = sessionResponseData.success;
        if (z2 && this.adjustConfig.onSessionTrackingSucceededListener != null) {
            this.logger.debug("Launching success session tracking listener", new java.lang.Object[0]);
            v0Var = new com.adjust.sdk.ActivityHandler.u0(sessionResponseData);
        } else {
            if (z2 || this.adjustConfig.onSessionTrackingFailedListener == null) {
                return;
            }
            this.logger.debug("Launching failed session tracking listener", new java.lang.Object[0]);
            v0Var = new com.adjust.sdk.ActivityHandler.v0(sessionResponseData);
        }
        handler.post(v0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void launchSessionResponseTasksI(com.adjust.sdk.SessionResponseData sessionResponseData) {
        this.logger.debug("Launching SessionResponse tasks", new java.lang.Object[0]);
        updateAdidI(sessionResponseData.adid);
        android.os.Handler handler = new android.os.Handler(this.adjustConfig.context.getMainLooper());
        if (updateAttributionI(sessionResponseData.attribution)) {
            launchAttributionListenerI(handler);
        }
        if (this.attribution == null && !this.activityState.askingAttribution) {
            this.attributionHandler.getAttribution();
        }
        if (sessionResponseData.success) {
            com.adjust.sdk.SharedPreferencesManager.getDefaultInstance(getContext()).setInstallTracked();
        }
        launchSessionResponseListenerI(sessionResponseData, handler);
        this.internalState.sessionResponseProcessed = true;
    }

    private void pauseSendingI() {
        this.attributionHandler.pauseSending();
        this.packageHandler.pauseSending();
        if (toSendI(true)) {
            this.sdkClickHandler.resumeSending();
            this.purchaseVerificationHandler.resumeSending();
        } else {
            this.sdkClickHandler.pauseSending();
            this.purchaseVerificationHandler.pauseSending();
        }
    }

    private boolean pausedI() {
        return pausedI(false);
    }

    private void preLaunchActionsI(java.util.List<com.adjust.sdk.IRunActivityHandler> list) {
        if (list == null) {
            return;
        }
        java.util.Iterator<com.adjust.sdk.IRunActivityHandler> it = list.iterator();
        while (it.hasNext()) {
            it.next().run(this);
        }
    }

    private void prepareDeeplinkI(android.net.Uri uri, android.os.Handler handler) {
        if (uri == null) {
            return;
        }
        this.logger.info("Deferred deeplink received (%s)", uri);
        handler.post(new com.adjust.sdk.ActivityHandler.y0(createDeeplinkIntentI(uri), uri));
    }

    private void processCachedDeeplinkI() {
        if (checkActivityStateI(this.activityState)) {
            com.adjust.sdk.SharedPreferencesManager defaultInstance = com.adjust.sdk.SharedPreferencesManager.getDefaultInstance(getContext());
            java.lang.String deeplinkUrl = defaultInstance.getDeeplinkUrl();
            long deeplinkClickTime = defaultInstance.getDeeplinkClickTime();
            if (deeplinkUrl == null || deeplinkClickTime == -1) {
                return;
            }
            processDeeplink(android.net.Uri.parse(deeplinkUrl), deeplinkClickTime);
            defaultInstance.removeDeeplink();
        }
    }

    private void processCoppaComplianceI() {
        if (this.adjustConfig.coppaComplianceEnabled) {
            disableThirdPartySharingForCoppaEnabledI();
        } else {
            resetThirdPartySharingCoppaActivityStateI();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processDeeplinkI(android.net.Uri uri, long j2) {
        if (isEnabledI()) {
            if (com.adjust.sdk.Util.isUrlFilteredOut(uri)) {
                this.logger.debug("Deeplink (" + uri.toString() + ") processing skipped", new java.lang.Object[0]);
                return;
            }
            com.adjust.sdk.ActivityPackage activityPackageBuildDeeplinkSdkClickPackage = com.adjust.sdk.PackageFactory.buildDeeplinkSdkClickPackage(uri, j2, this.activityState, this.adjustConfig, this.deviceInfo, this.globalParameters, this.internalState);
            if (activityPackageBuildDeeplinkSdkClickPackage == null) {
                return;
            }
            this.sdkClickHandler.sendSdkClick(activityPackageBuildDeeplinkSdkClickPackage);
        }
    }

    private void processSessionI() {
        if (this.activityState.isGdprForgotten) {
            return;
        }
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        com.adjust.sdk.ActivityState activityState = this.activityState;
        long j2 = jCurrentTimeMillis - activityState.lastActivity;
        if (j2 < 0) {
            this.logger.error(TIME_TRAVEL, new java.lang.Object[0]);
            this.activityState.lastActivity = jCurrentTimeMillis;
            writeActivityStateI();
            return;
        }
        if (j2 > SESSION_INTERVAL) {
            trackNewSessionI(jCurrentTimeMillis);
            checkAfterNewStartI();
            return;
        }
        if (j2 <= SUBSESSION_INTERVAL) {
            this.logger.verbose("Time span since last activity too short for a new subsession", new java.lang.Object[0]);
            return;
        }
        int i2 = activityState.subsessionCount + 1;
        activityState.subsessionCount = i2;
        activityState.sessionLength += j2;
        activityState.lastActivity = jCurrentTimeMillis;
        this.logger.verbose("Started subsession %d of session %d", java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(this.activityState.sessionCount));
        writeActivityStateI();
        checkForPreinstallI();
        this.installReferrer.startConnection();
        readInstallReferrerMeta();
        readInstallReferrerHuaweiAds();
        readInstallReferrerHuaweiAppGallery();
        readInstallReferrerSamsung();
        readInstallReferrerXiaomi();
        readInstallReferrerVivo();
    }

    private void readActivityStateI(android.content.Context context) {
        try {
            this.activityState = (com.adjust.sdk.ActivityState) com.adjust.sdk.Util.readObject(context, com.adjust.sdk.Constants.ACTIVITY_STATE_FILENAME, ACTIVITY_STATE_NAME, com.adjust.sdk.ActivityState.class);
        } catch (java.lang.Exception e2) {
            this.logger.error("Failed to read %s file (%s)", ACTIVITY_STATE_NAME, e2.getMessage());
            this.activityState = null;
        }
        if (this.activityState != null) {
            this.internalState.firstSdkStart = true;
        }
    }

    private void readAttributionI(android.content.Context context) {
        try {
            this.attribution = (com.adjust.sdk.AdjustAttribution) com.adjust.sdk.Util.readObject(context, com.adjust.sdk.Constants.ATTRIBUTION_FILENAME, ATTRIBUTION_NAME, com.adjust.sdk.AdjustAttribution.class);
        } catch (java.lang.Exception e2) {
            this.logger.error("Failed to read %s file (%s)", ATTRIBUTION_NAME, e2.getMessage());
            this.attribution = null;
        }
    }

    private void readConfigFile(android.content.Context context) {
        try {
            java.io.InputStream inputStreamOpen = context.getAssets().open("adjust_config.properties");
            java.util.Properties properties = new java.util.Properties();
            properties.load(inputStreamOpen);
            this.logger.verbose("adjust_config.properties file read and loaded", new java.lang.Object[0]);
            java.lang.String property = properties.getProperty("defaultTracker");
            if (property != null) {
                this.adjustConfig.defaultTracker = property;
            }
        } catch (java.lang.Exception e2) {
            this.logger.debug("%s file not found in this app", e2.getMessage());
        }
    }

    private void readGlobalCallbackParametersI(android.content.Context context) {
        try {
            this.globalParameters.callbackParameters = (java.util.Map) com.adjust.sdk.Util.readObject(context, com.adjust.sdk.Constants.GLOBAL_CALLBACK_PARAMETERS_FILENAME, GLOBAL_CALLBACK_PARAMETERS_NAME, java.util.Map.class);
        } catch (java.lang.Exception e2) {
            this.logger.error("Failed to read %s file (%s)", GLOBAL_CALLBACK_PARAMETERS_NAME, e2.getMessage());
            this.globalParameters.callbackParameters = null;
        }
    }

    private void readGlobalPartnerParametersI(android.content.Context context) {
        try {
            this.globalParameters.partnerParameters = (java.util.Map) com.adjust.sdk.Util.readObject(context, com.adjust.sdk.Constants.GLOBAL_PARTNER_PARAMETERS_FILENAME, GLOBAL_PARTNER_PARAMETERS_NAME, java.util.Map.class);
        } catch (java.lang.Exception e2) {
            this.logger.error("Failed to read %s file (%s)", GLOBAL_PARTNER_PARAMETERS_NAME, e2.getMessage());
            this.globalParameters.partnerParameters = null;
        }
    }

    private void readInstallReferrerHuaweiAds() {
        this.executor.submit(new com.adjust.sdk.ActivityHandler.l0());
    }

    private void readInstallReferrerHuaweiAppGallery() {
        this.executor.submit(new com.adjust.sdk.ActivityHandler.m0());
    }

    private void readInstallReferrerMeta() {
        this.executor.submit(new com.adjust.sdk.ActivityHandler.k0());
    }

    private void readInstallReferrerSamsung() {
        this.executor.submit(new com.adjust.sdk.ActivityHandler.n0());
    }

    private void readInstallReferrerVivo() {
        this.executor.submit(new com.adjust.sdk.ActivityHandler.p0());
    }

    private void readInstallReferrerXiaomi() {
        this.executor.submit(new com.adjust.sdk.ActivityHandler.o0());
    }

    private void resetThirdPartySharingCoppaActivityStateI() {
        com.adjust.sdk.ActivityState activityState = this.activityState;
        if (activityState != null && activityState.isThirdPartySharingDisabledForCoppa) {
            activityState.isThirdPartySharingDisabledForCoppa = false;
            writeActivityStateI();
        }
    }

    private void resumeSendingI() {
        this.attributionHandler.resumeSending();
        this.packageHandler.resumeSending();
        this.sdkClickHandler.resumeSending();
        this.purchaseVerificationHandler.resumeSending();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendInstallReferrerI(com.adjust.sdk.ReferrerDetails referrerDetails, java.lang.String str) {
        if (isEnabledI() && isValidReferrerDetails(referrerDetails) && !com.adjust.sdk.Util.isEqualReferrerDetails(referrerDetails, str, this.activityState)) {
            this.sdkClickHandler.sendSdkClick(com.adjust.sdk.PackageFactory.buildInstallReferrerSdkClickPackage(referrerDetails, str, this.activityState, this.adjustConfig, this.deviceInfo, this.globalParameters, this.internalState));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendPreinstallReferrerI() {
        java.lang.String preinstallReferrer;
        if (!isEnabledI() || this.internalState.hasFirstSdkStartNotOcurred() || (preinstallReferrer = com.adjust.sdk.SharedPreferencesManager.getDefaultInstance(getContext()).getPreinstallReferrer()) == null || preinstallReferrer.isEmpty()) {
            return;
        }
        this.sdkClickHandler.sendPreinstallPayload(preinstallReferrer, com.adjust.sdk.Constants.SYSTEM_INSTALLER_REFERRER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendReftagReferrerI() {
        if (isEnabledI() && !this.internalState.hasFirstSdkStartNotOcurred()) {
            this.sdkClickHandler.sendReftagReferrers();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAskingAttributionI(boolean z2) {
        this.activityState.askingAttribution = z2;
        writeActivityStateI();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnabledI(boolean z2) {
        com.adjust.sdk.ActivityState activityState;
        if (hasChangedStateI(isEnabledI(), z2, "Adjust already enabled", "Adjust already disabled")) {
            if (z2 && (activityState = this.activityState) != null && activityState.isGdprForgotten) {
                this.logger.error("Re-enabling SDK not possible for forgotten user", new java.lang.Object[0]);
                return;
            }
            com.adjust.sdk.ActivityHandler.InternalState internalState = this.internalState;
            internalState.enabled = z2;
            if (internalState.hasFirstSdkStartNotOcurred()) {
                updateStatusI(!z2, "Handlers will start as paused due to the SDK being disabled", "Handlers will still start as paused", "Handlers will start as active due to the SDK being enabled");
                return;
            }
            this.activityState.enabled = z2;
            writeActivityStateI();
            if (z2) {
                com.adjust.sdk.SharedPreferencesManager defaultInstance = com.adjust.sdk.SharedPreferencesManager.getDefaultInstance(getContext());
                if (defaultInstance.getGdprForgetMe()) {
                    gdprForgetMeI();
                } else {
                    processCoppaComplianceI();
                    java.util.Iterator<com.adjust.sdk.AdjustThirdPartySharing> it = this.adjustConfig.preLaunchActions.preLaunchAdjustThirdPartySharingArray.iterator();
                    while (it.hasNext()) {
                        trackThirdPartySharingI(it.next());
                    }
                    java.lang.Boolean bool = this.adjustConfig.preLaunchActions.lastMeasurementConsentTracked;
                    if (bool != null) {
                        trackMeasurementConsentI(bool.booleanValue());
                    }
                    this.adjustConfig.preLaunchActions.preLaunchAdjustThirdPartySharingArray = new java.util.ArrayList();
                    this.adjustConfig.preLaunchActions.lastMeasurementConsentTracked = null;
                }
                if (!defaultInstance.getInstallTracked()) {
                    this.logger.debug("Detected that install was not tracked at enable time", new java.lang.Object[0]);
                    trackNewSessionI(java.lang.System.currentTimeMillis());
                }
                checkAfterNewStartI(defaultInstance);
            }
            updateStatusI(!z2, "Pausing handlers due to SDK being disabled", "Handlers remain paused", "Resuming handlers due to SDK being enabled");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOfflineModeI(boolean z2) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        if (hasChangedStateI(this.internalState.isOffline(), z2, "Adjust already in offline mode", "Adjust already in online mode")) {
            com.adjust.sdk.ActivityHandler.InternalState internalState = this.internalState;
            internalState.offline = z2;
            if (internalState.hasFirstSdkStartNotOcurred()) {
                str = "Handlers will still start as paused";
                str2 = "Handlers will start as active due to SDK being online";
                str3 = "Handlers will start paused due to SDK being offline";
            } else {
                str = "Handlers remain paused";
                str2 = "Resuming handlers to put SDK in online mode";
                str3 = "Pausing handlers to put SDK offline mode";
            }
            updateStatusI(z2, str3, str, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPushTokenI(java.lang.String str) {
        if (checkActivityStateI(this.activityState) && isEnabledI()) {
            com.adjust.sdk.ActivityState activityState = this.activityState;
            if (activityState.isGdprForgotten || str == null || str.equals(activityState.pushToken)) {
                return;
            }
            this.activityState.pushToken = str;
            writeActivityStateI();
            com.adjust.sdk.PackageBuilder packageBuilder = new com.adjust.sdk.PackageBuilder(this.adjustConfig, this.deviceInfo, this.activityState, this.globalParameters, java.lang.System.currentTimeMillis());
            packageBuilder.internalState = this.internalState;
            this.packageHandler.addPackage(packageBuilder.buildInfoPackage(com.adjust.sdk.Constants.PUSH));
            com.adjust.sdk.SharedPreferencesManager.getDefaultInstance(getContext()).removePushToken();
            this.packageHandler.sendFirstPackage();
        }
    }

    private boolean shouldDisableThirdPartySharingWhenCoppaEnabled() {
        if (this.activityState == null || !isEnabledI()) {
            return false;
        }
        com.adjust.sdk.ActivityState activityState = this.activityState;
        if (activityState.isGdprForgotten) {
            return false;
        }
        return !activityState.isThirdPartySharingDisabledForCoppa;
    }

    private boolean shouldProcessEventI(java.lang.String str) {
        if (str != null && !str.isEmpty()) {
            if (this.activityState.eventDeduplicationIdExists(str)) {
                this.logger.info("Skipping duplicate event with deduplication ID '%s'", str);
                return false;
            }
            this.activityState.addDeduplicationId(str);
            this.logger.verbose("Added deduplication ID '%s'", str);
        }
        return true;
    }

    private void startBackgroundTimerI() {
        if (this.backgroundTimer != null && toSendI() && this.backgroundTimer.getFireIn() <= 0) {
            this.backgroundTimer.startIn(BACKGROUND_TIMER_INTERVAL);
        }
    }

    private void startFirstSessionI() {
        com.adjust.sdk.ActivityState activityState = new com.adjust.sdk.ActivityState();
        this.activityState = activityState;
        this.internalState.firstSdkStart = true;
        activityState.setEventDeduplicationIdsMaxSize(this.adjustConfig.getEventDeduplicationIdsMaxSize());
        updateHandlersStatusAndSendI();
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        com.adjust.sdk.SharedPreferencesManager defaultInstance = com.adjust.sdk.SharedPreferencesManager.getDefaultInstance(getContext());
        this.activityState.pushToken = defaultInstance.getPushToken();
        if (this.internalState.isEnabled()) {
            if (defaultInstance.getGdprForgetMe()) {
                gdprForgetMeI();
            } else {
                processCoppaComplianceI();
                java.util.Iterator<com.adjust.sdk.AdjustThirdPartySharing> it = this.adjustConfig.preLaunchActions.preLaunchAdjustThirdPartySharingArray.iterator();
                while (it.hasNext()) {
                    trackThirdPartySharingI(it.next());
                }
                java.lang.Boolean bool = this.adjustConfig.preLaunchActions.lastMeasurementConsentTracked;
                if (bool != null) {
                    trackMeasurementConsentI(bool.booleanValue());
                }
                this.adjustConfig.preLaunchActions.preLaunchAdjustThirdPartySharingArray = new java.util.ArrayList();
                this.adjustConfig.preLaunchActions.lastMeasurementConsentTracked = null;
                this.activityState.sessionCount = 1;
                transferSessionPackageI(jCurrentTimeMillis);
                checkAfterNewStartI(defaultInstance);
            }
        }
        this.activityState.resetSessionAttributes(jCurrentTimeMillis);
        this.activityState.enabled = this.internalState.isEnabled();
        writeActivityStateI();
        defaultInstance.removePushToken();
        defaultInstance.removeGdprForgetMe();
        processCachedDeeplinkI();
    }

    private void startForegroundTimerI() {
        if (isEnabledI()) {
            this.foregroundTimer.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startI() {
        if (this.internalState.hasFirstSdkStartNotOcurred()) {
            com.adjust.sdk.AdjustSigner.onResume(this.adjustConfig.logger);
            startFirstSessionI();
            return;
        }
        java.util.Iterator<com.adjust.sdk.AdjustThirdPartySharing> it = this.adjustConfig.preLaunchActions.preLaunchAdjustThirdPartySharingArray.iterator();
        while (it.hasNext()) {
            trackThirdPartySharingI(it.next());
        }
        java.lang.Boolean bool = this.adjustConfig.preLaunchActions.lastMeasurementConsentTracked;
        if (bool != null) {
            trackMeasurementConsentI(bool.booleanValue());
        }
        this.adjustConfig.preLaunchActions.preLaunchAdjustThirdPartySharingArray = new java.util.ArrayList();
        com.adjust.sdk.AdjustConfig adjustConfig = this.adjustConfig;
        adjustConfig.preLaunchActions.lastMeasurementConsentTracked = null;
        if (this.activityState.enabled) {
            com.adjust.sdk.AdjustSigner.onResume(adjustConfig.logger);
            updateHandlersStatusAndSendI();
            processCoppaComplianceI();
            processSessionI();
            checkAttributionStateI();
            processCachedDeeplinkI();
        }
    }

    private void stopBackgroundTimerI() {
        com.adjust.sdk.scheduler.TimerOnce timerOnce = this.backgroundTimer;
        if (timerOnce == null) {
            return;
        }
        timerOnce.cancel();
    }

    private void stopForegroundTimerI() {
        this.foregroundTimer.suspend();
    }

    private void teardownActivityStateS() {
        synchronized (com.adjust.sdk.ActivityState.class) {
            if (this.activityState == null) {
                return;
            }
            this.activityState = null;
        }
    }

    private void teardownAllGlobalParametersS() {
        synchronized (com.adjust.sdk.GlobalParameters.class) {
            if (this.globalParameters == null) {
                return;
            }
            this.globalParameters = null;
        }
    }

    private void teardownAttributionS() {
        synchronized (com.adjust.sdk.AdjustAttribution.class) {
            if (this.attribution == null) {
                return;
            }
            this.attribution = null;
        }
    }

    private boolean toSendI() {
        return toSendI(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void trackAdRevenueI(com.adjust.sdk.AdjustAdRevenue adjustAdRevenue) {
        if (checkActivityStateI(this.activityState) && isEnabledI() && checkAdjustAdRevenue(adjustAdRevenue) && !this.activityState.isGdprForgotten) {
            com.adjust.sdk.PackageBuilder packageBuilder = new com.adjust.sdk.PackageBuilder(this.adjustConfig, this.deviceInfo, this.activityState, this.globalParameters, java.lang.System.currentTimeMillis());
            packageBuilder.internalState = this.internalState;
            this.packageHandler.addPackage(packageBuilder.buildAdRevenuePackage(adjustAdRevenue));
            this.packageHandler.sendFirstPackage();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void trackEventI(com.adjust.sdk.AdjustEvent adjustEvent) {
        if (checkActivityStateI(this.activityState) && isEnabledI() && checkEventI(adjustEvent) && !this.activityState.isGdprForgotten && shouldProcessEventI(adjustEvent.deduplicationId)) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            this.activityState.eventCount++;
            updateActivityStateI(jCurrentTimeMillis);
            com.adjust.sdk.PackageBuilder packageBuilder = new com.adjust.sdk.PackageBuilder(this.adjustConfig, this.deviceInfo, this.activityState, this.globalParameters, jCurrentTimeMillis);
            packageBuilder.internalState = this.internalState;
            this.packageHandler.addPackage(packageBuilder.buildEventPackage(adjustEvent));
            this.packageHandler.sendFirstPackage();
            if (this.adjustConfig.isSendingInBackgroundEnabled && this.internalState.isInBackground()) {
                startBackgroundTimerI();
            }
            writeActivityStateI();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void trackMeasurementConsentI(boolean z2) {
        if (!checkActivityStateI(this.activityState)) {
            this.adjustConfig.preLaunchActions.lastMeasurementConsentTracked = java.lang.Boolean.valueOf(z2);
        } else if (isEnabledI() && !this.activityState.isGdprForgotten) {
            com.adjust.sdk.PackageBuilder packageBuilder = new com.adjust.sdk.PackageBuilder(this.adjustConfig, this.deviceInfo, this.activityState, this.globalParameters, java.lang.System.currentTimeMillis());
            packageBuilder.internalState = this.internalState;
            this.packageHandler.addPackage(packageBuilder.buildMeasurementConsentPackage(z2));
            this.packageHandler.sendFirstPackage();
        }
    }

    private void trackNewSessionI(long j2) {
        com.adjust.sdk.ActivityState activityState = this.activityState;
        long j3 = j2 - activityState.lastActivity;
        activityState.sessionCount++;
        activityState.lastInterval = j3;
        transferSessionPackageI(j2);
        this.activityState.resetSessionAttributes(j2);
        writeActivityStateI();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void trackPlayStoreSubscriptionI(com.adjust.sdk.AdjustPlayStoreSubscription adjustPlayStoreSubscription) {
        if (checkActivityStateI(this.activityState) && isEnabledI() && !this.activityState.isGdprForgotten) {
            com.adjust.sdk.PackageBuilder packageBuilder = new com.adjust.sdk.PackageBuilder(this.adjustConfig, this.deviceInfo, this.activityState, this.globalParameters, java.lang.System.currentTimeMillis());
            packageBuilder.internalState = this.internalState;
            this.packageHandler.addPackage(packageBuilder.buildSubscriptionPackage(adjustPlayStoreSubscription));
            this.packageHandler.sendFirstPackage();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void trackThirdPartySharingI(com.adjust.sdk.AdjustThirdPartySharing adjustThirdPartySharing) {
        if (!checkActivityStateI(this.activityState)) {
            this.adjustConfig.preLaunchActions.preLaunchAdjustThirdPartySharingArray.add(adjustThirdPartySharing);
            return;
        }
        if (isEnabledI() && !this.activityState.isGdprForgotten) {
            if (this.adjustConfig.coppaComplianceEnabled) {
                this.logger.warn("Calling third party sharing API not allowed when COPPA enabled", new java.lang.Object[0]);
                return;
            }
            com.adjust.sdk.PackageBuilder packageBuilder = new com.adjust.sdk.PackageBuilder(this.adjustConfig, this.deviceInfo, this.activityState, this.globalParameters, java.lang.System.currentTimeMillis());
            packageBuilder.internalState = this.internalState;
            this.packageHandler.addPackage(packageBuilder.buildThirdPartySharingPackage(adjustThirdPartySharing));
            this.packageHandler.sendFirstPackage();
        }
    }

    private void transferSessionPackageI(long j2) {
        com.adjust.sdk.PackageBuilder packageBuilder = new com.adjust.sdk.PackageBuilder(this.adjustConfig, this.deviceInfo, this.activityState, this.globalParameters, j2);
        packageBuilder.internalState = this.internalState;
        this.packageHandler.addPackage(packageBuilder.buildSessionPackage());
        this.packageHandler.sendFirstPackage();
    }

    private boolean updateActivityStateI(long j2) {
        if (!checkActivityStateI(this.activityState)) {
            return false;
        }
        com.adjust.sdk.ActivityState activityState = this.activityState;
        long j3 = j2 - activityState.lastActivity;
        if (j3 > SESSION_INTERVAL) {
            return false;
        }
        activityState.lastActivity = j2;
        if (j3 < 0) {
            this.logger.error(TIME_TRAVEL, new java.lang.Object[0]);
            return true;
        }
        activityState.sessionLength += j3;
        activityState.timeSpent += j3;
        return true;
    }

    private void updateAdidI(java.lang.String str) {
        if (str == null) {
            return;
        }
        if (!str.equals(this.activityState.adid)) {
            this.activityState.adid = str;
            writeActivityStateI();
        }
        if (this.cachedAdidReadCallbacks.isEmpty()) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(this.cachedAdidReadCallbacks);
        this.cachedAdidReadCallbacks.clear();
        new android.os.Handler(this.adjustConfig.context.getMainLooper()).post(new com.adjust.sdk.ActivityHandler.b1(arrayList, str));
    }

    private void updateHandlersStatusAndSendI() {
        if (!toSendI()) {
            pauseSendingI();
        } else {
            resumeSendingI();
            this.packageHandler.sendFirstPackage();
        }
    }

    private void updateStatusI(boolean z2, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (z2) {
            this.logger.info(str, new java.lang.Object[0]);
        } else if (!pausedI(false)) {
            this.logger.info(str3, new java.lang.Object[0]);
        } else if (pausedI(true)) {
            this.logger.info(str2, new java.lang.Object[0]);
        } else {
            this.logger.info(str2 + ", except the Sdk Click Handler", new java.lang.Object[0]);
        }
        updateHandlersStatusAndSendI();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void verifyAndTrackPlayStorePurchaseI(com.adjust.sdk.AdjustEvent adjustEvent, com.adjust.sdk.OnPurchaseVerificationFinishedListener onPurchaseVerificationFinishedListener) {
        if (onPurchaseVerificationFinishedListener == null) {
            this.logger.warn("Purchase verification aborted because verification callback is null", new java.lang.Object[0]);
            return;
        }
        if (this.adjustConfig.isDataResidency) {
            this.logger.warn("Purchase verification not available for data residency users right now", new java.lang.Object[0]);
            onPurchaseVerificationFinishedListener.onVerificationFinished(new com.adjust.sdk.AdjustPurchaseVerificationResult("not_verified", 109, "Purchase verification not available for data residency users right now"));
            return;
        }
        if (!checkActivityStateI(this.activityState)) {
            onPurchaseVerificationFinishedListener.onVerificationFinished(new com.adjust.sdk.AdjustPurchaseVerificationResult("not_verified", 102, "Purchase verification aborted because SDK is still not initialized"));
            this.logger.warn("Purchase verification aborted because SDK is still not initialized", new java.lang.Object[0]);
            return;
        }
        if (!isEnabledI()) {
            onPurchaseVerificationFinishedListener.onVerificationFinished(new com.adjust.sdk.AdjustPurchaseVerificationResult("not_verified", 103, "Purchase verification aborted because SDK is disabled"));
            this.logger.warn("Purchase verification aborted because SDK is disabled", new java.lang.Object[0]);
            return;
        }
        if (this.activityState.isGdprForgotten) {
            onPurchaseVerificationFinishedListener.onVerificationFinished(new com.adjust.sdk.AdjustPurchaseVerificationResult("not_verified", 104, "Purchase verification aborted because user is GDPR forgotten"));
            this.logger.warn("Purchase verification aborted because user is GDPR forgotten", new java.lang.Object[0]);
            return;
        }
        if (adjustEvent == null) {
            this.logger.warn("Purchase verification aborted because event instance is null", new java.lang.Object[0]);
            onPurchaseVerificationFinishedListener.onVerificationFinished(new com.adjust.sdk.AdjustPurchaseVerificationResult("not_verified", 106, "Purchase verification aborted because event instance is null"));
            return;
        }
        com.adjust.sdk.ActivityPackage activityPackageBuildVerificationPackage = new com.adjust.sdk.PackageBuilder(this.adjustConfig, this.deviceInfo, this.activityState, this.globalParameters, java.lang.System.currentTimeMillis()).buildVerificationPackage(adjustEvent, onPurchaseVerificationFinishedListener);
        if (activityPackageBuildVerificationPackage == null) {
            this.logger.warn("Purchase verification aborted because verification package is null", new java.lang.Object[0]);
            onPurchaseVerificationFinishedListener.onVerificationFinished(new com.adjust.sdk.AdjustPurchaseVerificationResult("not_verified", 107, "Purchase verification aborted because verification package is null"));
        } else {
            activityPackageBuildVerificationPackage.event = adjustEvent;
            this.purchaseVerificationHandler.sendPurchaseVerificationPackage(activityPackageBuildVerificationPackage);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void verifyPlayStorePurchaseI(com.adjust.sdk.AdjustPlayStorePurchase adjustPlayStorePurchase, com.adjust.sdk.OnPurchaseVerificationFinishedListener onPurchaseVerificationFinishedListener) {
        if (onPurchaseVerificationFinishedListener == null) {
            this.logger.warn("Purchase verification aborted because verification callback is null", new java.lang.Object[0]);
            return;
        }
        if (this.adjustConfig.isDataResidency) {
            this.logger.warn("Purchase verification not available for data residency users right now", new java.lang.Object[0]);
            onPurchaseVerificationFinishedListener.onVerificationFinished(new com.adjust.sdk.AdjustPurchaseVerificationResult("not_verified", 109, "Purchase verification not available for data residency users right now"));
            return;
        }
        if (!checkActivityStateI(this.activityState)) {
            onPurchaseVerificationFinishedListener.onVerificationFinished(new com.adjust.sdk.AdjustPurchaseVerificationResult("not_verified", 102, "Purchase verification aborted because SDK is still not initialized"));
            this.logger.warn("Purchase verification aborted because SDK is still not initialized", new java.lang.Object[0]);
            return;
        }
        if (!isEnabledI()) {
            onPurchaseVerificationFinishedListener.onVerificationFinished(new com.adjust.sdk.AdjustPurchaseVerificationResult("not_verified", 103, "Purchase verification aborted because SDK is disabled"));
            this.logger.warn("Purchase verification aborted because SDK is disabled", new java.lang.Object[0]);
            return;
        }
        if (this.activityState.isGdprForgotten) {
            onPurchaseVerificationFinishedListener.onVerificationFinished(new com.adjust.sdk.AdjustPurchaseVerificationResult("not_verified", 104, "Purchase verification aborted because user is GDPR forgotten"));
            this.logger.warn("Purchase verification aborted because user is GDPR forgotten", new java.lang.Object[0]);
            return;
        }
        if (adjustPlayStorePurchase == null) {
            this.logger.warn("Purchase verification aborted because purchase instance is null", new java.lang.Object[0]);
            onPurchaseVerificationFinishedListener.onVerificationFinished(new com.adjust.sdk.AdjustPurchaseVerificationResult("not_verified", 105, "Purchase verification aborted because purchase instance is null"));
            return;
        }
        com.adjust.sdk.PackageBuilder packageBuilder = new com.adjust.sdk.PackageBuilder(this.adjustConfig, this.deviceInfo, this.activityState, this.globalParameters, java.lang.System.currentTimeMillis());
        packageBuilder.internalState = this.internalState;
        com.adjust.sdk.ActivityPackage activityPackageBuildVerificationPackage = packageBuilder.buildVerificationPackage(adjustPlayStorePurchase, onPurchaseVerificationFinishedListener);
        if (activityPackageBuildVerificationPackage != null) {
            this.purchaseVerificationHandler.sendPurchaseVerificationPackage(activityPackageBuildVerificationPackage);
        } else {
            this.logger.warn("Purchase verification aborted because verification package is null", new java.lang.Object[0]);
            onPurchaseVerificationFinishedListener.onVerificationFinished(new com.adjust.sdk.AdjustPurchaseVerificationResult("not_verified", 106, "Purchase verification aborted because verification package is null"));
        }
    }

    private void writeActivityStateI() {
        synchronized (com.adjust.sdk.ActivityState.class) {
            com.adjust.sdk.ActivityState activityState = this.activityState;
            if (activityState == null) {
                return;
            }
            com.adjust.sdk.Util.writeObject(activityState, this.adjustConfig.context, com.adjust.sdk.Constants.ACTIVITY_STATE_FILENAME, ACTIVITY_STATE_NAME);
        }
    }

    private void writeAttributionI() {
        synchronized (com.adjust.sdk.AdjustAttribution.class) {
            com.adjust.sdk.AdjustAttribution adjustAttribution = this.attribution;
            if (adjustAttribution == null) {
                return;
            }
            com.adjust.sdk.Util.writeObject(adjustAttribution, this.adjustConfig.context, com.adjust.sdk.Constants.ATTRIBUTION_FILENAME, ATTRIBUTION_NAME);
        }
    }

    private void writeGlobalCallbackParametersI() {
        synchronized (com.adjust.sdk.GlobalParameters.class) {
            com.adjust.sdk.GlobalParameters globalParameters = this.globalParameters;
            if (globalParameters == null) {
                return;
            }
            com.adjust.sdk.Util.writeObject(globalParameters.callbackParameters, this.adjustConfig.context, com.adjust.sdk.Constants.GLOBAL_CALLBACK_PARAMETERS_FILENAME, GLOBAL_CALLBACK_PARAMETERS_NAME);
        }
    }

    private void writeGlobalPartnerParametersI() {
        synchronized (com.adjust.sdk.GlobalParameters.class) {
            com.adjust.sdk.GlobalParameters globalParameters = this.globalParameters;
            if (globalParameters == null) {
                return;
            }
            com.adjust.sdk.Util.writeObject(globalParameters.partnerParameters, this.adjustConfig.context, com.adjust.sdk.Constants.GLOBAL_PARTNER_PARAMETERS_FILENAME, GLOBAL_PARTNER_PARAMETERS_NAME);
        }
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void addGlobalCallbackParameter(java.lang.String str, java.lang.String str2) {
        this.executor.submit(new com.adjust.sdk.ActivityHandler.i(str, str2));
    }

    public void addGlobalCallbackParameterI(java.lang.String str, java.lang.String str2) {
        if (com.adjust.sdk.Util.isValidParameter(str, com.ironsource.y8.h.W, "Global Callback") && com.adjust.sdk.Util.isValidParameter(str2, "value", "Global Callback")) {
            com.adjust.sdk.GlobalParameters globalParameters = this.globalParameters;
            if (globalParameters.callbackParameters == null) {
                globalParameters.callbackParameters = new java.util.LinkedHashMap();
            }
            java.lang.String str3 = this.globalParameters.callbackParameters.get(str);
            if (str2.equals(str3)) {
                this.logger.verbose("Key %s already present with the same value", str);
                return;
            }
            if (str3 != null) {
                this.logger.warn("Key %s will be overwritten", str);
            }
            this.globalParameters.callbackParameters.put(str, str2);
            writeGlobalCallbackParametersI();
        }
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void addGlobalPartnerParameter(java.lang.String str, java.lang.String str2) {
        this.executor.submit(new com.adjust.sdk.ActivityHandler.j(str, str2));
    }

    public void addGlobalPartnerParameterI(java.lang.String str, java.lang.String str2) {
        if (com.adjust.sdk.Util.isValidParameter(str, com.ironsource.y8.h.W, "Global Partner") && com.adjust.sdk.Util.isValidParameter(str2, "value", "Global Partner")) {
            com.adjust.sdk.GlobalParameters globalParameters = this.globalParameters;
            if (globalParameters.partnerParameters == null) {
                globalParameters.partnerParameters = new java.util.LinkedHashMap();
            }
            java.lang.String str3 = this.globalParameters.partnerParameters.get(str);
            if (str2.equals(str3)) {
                this.logger.verbose("Key %s already present with the same value", str);
                return;
            }
            if (str3 != null) {
                this.logger.warn("Key %s will be overwritten", str);
            }
            this.globalParameters.partnerParameters.put(str, str2);
            writeGlobalPartnerParametersI();
        }
    }

    public void backgroundTimerFired() {
        this.executor.submit(new com.adjust.sdk.ActivityHandler.y());
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void finishedTrackingActivity(com.adjust.sdk.ResponseData responseData) {
        if (responseData instanceof com.adjust.sdk.SessionResponseData) {
            this.logger.debug("Finished tracking session", new java.lang.Object[0]);
            this.attributionHandler.checkSessionResponse((com.adjust.sdk.SessionResponseData) responseData);
            return;
        }
        if (responseData instanceof com.adjust.sdk.SdkClickResponseData) {
            com.adjust.sdk.SdkClickResponseData sdkClickResponseData = (com.adjust.sdk.SdkClickResponseData) responseData;
            checkForInstallReferrerInfo(sdkClickResponseData);
            this.attributionHandler.checkSdkClickResponse(sdkClickResponseData);
        } else if (responseData instanceof com.adjust.sdk.EventResponseData) {
            launchEventResponseTasks((com.adjust.sdk.EventResponseData) responseData);
        } else if (responseData instanceof com.adjust.sdk.PurchaseVerificationResponseData) {
            launchPurchaseVerificationResponseTasks((com.adjust.sdk.PurchaseVerificationResponseData) responseData);
        }
    }

    public void foregroundTimerFired() {
        this.executor.submit(new com.adjust.sdk.ActivityHandler.x());
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void gdprForgetMe() {
        this.executor.submit(new com.adjust.sdk.ActivityHandler.q());
    }

    @Override // com.adjust.sdk.IActivityHandler
    public com.adjust.sdk.ActivityState getActivityState() {
        return this.activityState;
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void getAdid(com.adjust.sdk.OnAdidReadListener onAdidReadListener) {
        com.adjust.sdk.ActivityState activityState = this.activityState;
        if (activityState != null && activityState.adid != null) {
            new android.os.Handler(this.adjustConfig.context.getMainLooper()).post(new com.adjust.sdk.ActivityHandler.z(onAdidReadListener));
            return;
        }
        if (activityState == null) {
            this.logger.warn("SDK needs to be initialized before getting adid", new java.lang.Object[0]);
        }
        this.cachedAdidReadCallbacks.add(onAdidReadListener);
    }

    @Override // com.adjust.sdk.IActivityHandler
    public com.adjust.sdk.AdjustConfig getAdjustConfig() {
        return this.adjustConfig;
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void getAttribution(com.adjust.sdk.OnAttributionReadListener onAttributionReadListener) {
        if (this.attribution != null) {
            new android.os.Handler(this.adjustConfig.context.getMainLooper()).post(new com.adjust.sdk.ActivityHandler.a0(onAttributionReadListener));
        } else {
            this.cachedAttributionReadCallbacks.add(onAttributionReadListener);
        }
    }

    @Override // com.adjust.sdk.IActivityHandler
    public android.content.Context getContext() {
        return this.adjustConfig.context;
    }

    @Override // com.adjust.sdk.IActivityHandler
    public com.adjust.sdk.DeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    @Override // com.adjust.sdk.IActivityHandler
    public com.adjust.sdk.GlobalParameters getGlobalParameters() {
        return this.globalParameters;
    }

    @Override // com.adjust.sdk.IActivityHandler
    public com.adjust.sdk.ActivityHandler.InternalState getInternalState() {
        return this.internalState;
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void gotOptOutResponse() {
        this.executor.submit(new com.adjust.sdk.ActivityHandler.w());
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void init(com.adjust.sdk.AdjustConfig adjustConfig) {
        this.adjustConfig = adjustConfig;
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void isEnabled(com.adjust.sdk.OnIsEnabledListener onIsEnabledListener) {
        this.executor.submit(new com.adjust.sdk.ActivityHandler.r0(onIsEnabledListener));
    }

    /* JADX INFO: renamed from: lambda$onActivityLifecycle$0$com-adjust-sdk-ActivityHandler, reason: not valid java name */
    /* synthetic */ void m482lambda$onActivityLifecycle$0$comadjustsdkActivityHandler(boolean z2) {
        java.lang.Boolean bool = this.internalState.foregroundOrElseBackground;
        if (bool == null || bool.booleanValue() != z2) {
            this.internalState.foregroundOrElseBackground = java.lang.Boolean.valueOf(z2);
            if (z2) {
                onResumeI();
            } else {
                onPauseI();
            }
        }
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void launchAttributionResponseTasks(com.adjust.sdk.AttributionResponseData attributionResponseData) {
        this.executor.submit(new com.adjust.sdk.ActivityHandler.g(attributionResponseData));
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void launchEventResponseTasks(com.adjust.sdk.EventResponseData eventResponseData) {
        this.executor.submit(new com.adjust.sdk.ActivityHandler.d(eventResponseData));
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void launchPurchaseVerificationResponseTasks(com.adjust.sdk.PurchaseVerificationResponseData purchaseVerificationResponseData) {
        this.executor.submit(new com.adjust.sdk.ActivityHandler.h(purchaseVerificationResponseData));
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void launchSdkClickResponseTasks(com.adjust.sdk.SdkClickResponseData sdkClickResponseData) {
        this.executor.submit(new com.adjust.sdk.ActivityHandler.e(sdkClickResponseData));
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void launchSessionResponseTasks(com.adjust.sdk.SessionResponseData sessionResponseData) {
        this.executor.submit(new com.adjust.sdk.ActivityHandler.f(sessionResponseData));
    }

    @Override // com.adjust.sdk.SystemLifecycle.SystemLifecycleCallback
    public void onActivityLifecycle(final boolean z2) {
        this.executor.submit(new java.lang.Runnable() { // from class: com.adjust.sdk.ActivityHandler$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m482lambda$onActivityLifecycle$0$comadjustsdkActivityHandler(z2);
            }
        });
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void onPause() {
        onActivityLifecycle(false);
    }

    public void onPauseI() {
        stopForegroundTimerI();
        startBackgroundTimerI();
        this.logger.verbose("Subsession end", new java.lang.Object[0]);
        endI();
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void onResume() {
        onActivityLifecycle(true);
    }

    public void onResumeI() {
        stopBackgroundTimerI();
        startForegroundTimerI();
        this.logger.verbose("Subsession start", new java.lang.Object[0]);
        startI();
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void processAndResolveDeeplink(android.net.Uri uri, long j2, com.adjust.sdk.OnDeeplinkResolvedListener onDeeplinkResolvedListener) {
        this.cachedDeeplinkResolutionCallback = onDeeplinkResolvedListener;
        this.executor.submit(new com.adjust.sdk.ActivityHandler.a1(uri, j2));
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void processDeeplink(android.net.Uri uri, long j2) {
        this.executor.submit(new com.adjust.sdk.ActivityHandler.z0(uri, j2));
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void removeGlobalCallbackParameter(java.lang.String str) {
        this.executor.submit(new com.adjust.sdk.ActivityHandler.l(str));
    }

    public void removeGlobalCallbackParameterI(java.lang.String str) {
        if (com.adjust.sdk.Util.isValidParameter(str, com.ironsource.y8.h.W, "Session Callback")) {
            java.util.Map<java.lang.String, java.lang.String> map = this.globalParameters.callbackParameters;
            if (map == null) {
                this.logger.warn("Session Callback parameters are not set", new java.lang.Object[0]);
            } else if (map.remove(str) == null) {
                this.logger.warn("Key %s does not exist", str);
            } else {
                this.logger.debug("Key %s will be removed", str);
                writeGlobalCallbackParametersI();
            }
        }
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void removeGlobalCallbackParameters() {
        this.executor.submit(new com.adjust.sdk.ActivityHandler.n());
    }

    public void removeGlobalCallbackParametersI() {
        if (this.globalParameters.callbackParameters == null) {
            this.logger.warn("Session Callback parameters are not set", new java.lang.Object[0]);
        }
        this.globalParameters.callbackParameters = null;
        writeGlobalCallbackParametersI();
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void removeGlobalPartnerParameter(java.lang.String str) {
        this.executor.submit(new com.adjust.sdk.ActivityHandler.m(str));
    }

    public void removeGlobalPartnerParameterI(java.lang.String str) {
        if (com.adjust.sdk.Util.isValidParameter(str, com.ironsource.y8.h.W, "Session Partner")) {
            java.util.Map<java.lang.String, java.lang.String> map = this.globalParameters.partnerParameters;
            if (map == null) {
                this.logger.warn("Session Partner parameters are not set", new java.lang.Object[0]);
            } else if (map.remove(str) == null) {
                this.logger.warn("Key %s does not exist", str);
            } else {
                this.logger.debug("Key %s will be removed", str);
                writeGlobalPartnerParametersI();
            }
        }
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void removeGlobalPartnerParameters() {
        this.executor.submit(new com.adjust.sdk.ActivityHandler.o());
    }

    public void removeGlobalPartnerParametersI() {
        if (this.globalParameters.partnerParameters == null) {
            this.logger.warn("Session Partner parameters are not set", new java.lang.Object[0]);
        }
        this.globalParameters.partnerParameters = null;
        writeGlobalPartnerParametersI();
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void sendInstallReferrer(com.adjust.sdk.ReferrerDetails referrerDetails, java.lang.String str) {
        this.executor.submit(new com.adjust.sdk.ActivityHandler.c(referrerDetails, str));
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void sendPreinstallReferrer() {
        this.executor.submit(new com.adjust.sdk.ActivityHandler.b());
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void sendReftagReferrer() {
        this.executor.submit(new com.adjust.sdk.ActivityHandler.a());
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void setAskingAttribution(boolean z2) {
        this.executor.submit(new com.adjust.sdk.ActivityHandler.d1(z2));
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void setEnabled(boolean z2) {
        this.executor.submit(new com.adjust.sdk.ActivityHandler.v(z2));
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void setOfflineMode(boolean z2) {
        this.executor.submit(new com.adjust.sdk.ActivityHandler.g0(z2));
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void setPushToken(java.lang.String str, boolean z2) {
        this.executor.submit(new com.adjust.sdk.ActivityHandler.p(z2, str));
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void teardown() {
        com.adjust.sdk.scheduler.TimerOnce timerOnce = this.backgroundTimer;
        if (timerOnce != null) {
            timerOnce.teardown();
        }
        com.adjust.sdk.scheduler.TimerCycle timerCycle = this.foregroundTimer;
        if (timerCycle != null) {
            timerCycle.teardown();
        }
        com.adjust.sdk.scheduler.ThreadExecutor threadExecutor = this.executor;
        if (threadExecutor != null) {
            threadExecutor.teardown();
        }
        com.adjust.sdk.IPackageHandler iPackageHandler = this.packageHandler;
        if (iPackageHandler != null) {
            iPackageHandler.teardown();
        }
        com.adjust.sdk.IAttributionHandler iAttributionHandler = this.attributionHandler;
        if (iAttributionHandler != null) {
            iAttributionHandler.teardown();
        }
        com.adjust.sdk.ISdkClickHandler iSdkClickHandler = this.sdkClickHandler;
        if (iSdkClickHandler != null) {
            iSdkClickHandler.teardown();
        }
        com.adjust.sdk.IPurchaseVerificationHandler iPurchaseVerificationHandler = this.purchaseVerificationHandler;
        if (iPurchaseVerificationHandler != null) {
            iPurchaseVerificationHandler.teardown();
        }
        com.adjust.sdk.GlobalParameters globalParameters = this.globalParameters;
        if (globalParameters != null) {
            java.util.Map<java.lang.String, java.lang.String> map = globalParameters.callbackParameters;
            if (map != null) {
                map.clear();
            }
            java.util.Map<java.lang.String, java.lang.String> map2 = this.globalParameters.partnerParameters;
            if (map2 != null) {
                map2.clear();
            }
        }
        teardownActivityStateS();
        teardownAttributionS();
        teardownAllGlobalParametersS();
        this.packageHandler = null;
        this.logger = null;
        this.foregroundTimer = null;
        this.executor = null;
        this.backgroundTimer = null;
        this.internalState = null;
        this.deviceInfo = null;
        this.adjustConfig = null;
        this.attributionHandler = null;
        this.sdkClickHandler = null;
        this.purchaseVerificationHandler = null;
        this.globalParameters = null;
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void trackAdRevenue(com.adjust.sdk.AdjustAdRevenue adjustAdRevenue) {
        this.executor.submit(new com.adjust.sdk.ActivityHandler.t(adjustAdRevenue));
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void trackEvent(com.adjust.sdk.AdjustEvent adjustEvent) {
        this.executor.submit(new com.adjust.sdk.ActivityHandler.k(adjustEvent));
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void trackMeasurementConsent(boolean z2) {
        this.executor.submit(new com.adjust.sdk.ActivityHandler.s(z2));
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void trackPlayStoreSubscription(com.adjust.sdk.AdjustPlayStoreSubscription adjustPlayStoreSubscription) {
        this.executor.submit(new com.adjust.sdk.ActivityHandler.u(adjustPlayStoreSubscription));
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void trackThirdPartySharing(com.adjust.sdk.AdjustThirdPartySharing adjustThirdPartySharing) {
        this.executor.submit(new com.adjust.sdk.ActivityHandler.r(adjustThirdPartySharing));
    }

    @Override // com.adjust.sdk.IActivityHandler
    public boolean updateAttributionI(com.adjust.sdk.AdjustAttribution adjustAttribution) {
        if (adjustAttribution == null || this.activityState.askingAttribution) {
            return false;
        }
        if (!this.cachedAttributionReadCallbacks.isEmpty()) {
            java.util.ArrayList arrayList = new java.util.ArrayList(this.cachedAttributionReadCallbacks);
            this.cachedAttributionReadCallbacks.clear();
            new android.os.Handler(this.adjustConfig.context.getMainLooper()).post(new com.adjust.sdk.ActivityHandler.c1(arrayList, adjustAttribution));
        }
        if (adjustAttribution.equals(this.attribution)) {
            return false;
        }
        this.attribution = adjustAttribution;
        writeAttributionI();
        return true;
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void verifyAndTrackPlayStorePurchase(com.adjust.sdk.AdjustEvent adjustEvent, com.adjust.sdk.OnPurchaseVerificationFinishedListener onPurchaseVerificationFinishedListener) {
        this.executor.submit(new com.adjust.sdk.ActivityHandler.c0(adjustEvent, onPurchaseVerificationFinishedListener));
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void verifyPlayStorePurchase(com.adjust.sdk.AdjustPlayStorePurchase adjustPlayStorePurchase, com.adjust.sdk.OnPurchaseVerificationFinishedListener onPurchaseVerificationFinishedListener) {
        this.executor.submit(new com.adjust.sdk.ActivityHandler.b0(adjustPlayStorePurchase, onPurchaseVerificationFinishedListener));
    }

    private void checkAfterNewStartI(com.adjust.sdk.SharedPreferencesManager sharedPreferencesManager) {
        java.lang.String pushToken = sharedPreferencesManager.getPushToken();
        if (pushToken != null && !pushToken.equals(this.activityState.pushToken)) {
            setPushToken(pushToken, true);
        }
        if (sharedPreferencesManager.getRawReferrerArray() != null) {
            sendReftagReferrer();
        }
        checkForPreinstallI();
        this.installReferrer.startConnection();
        readInstallReferrerMeta();
        readInstallReferrerHuaweiAds();
        readInstallReferrerHuaweiAppGallery();
        readInstallReferrerSamsung();
        readInstallReferrerXiaomi();
        readInstallReferrerVivo();
    }

    private boolean pausedI(boolean z2) {
        if (z2) {
            return this.internalState.isOffline() || !isEnabledI();
        }
        return this.internalState.isOffline() || !isEnabledI();
    }

    private boolean toSendI(boolean z2) {
        if (pausedI(z2)) {
            return false;
        }
        if (this.adjustConfig.isSendingInBackgroundEnabled) {
            return true;
        }
        return this.internalState.isInForeground();
    }

    @Override // com.adjust.sdk.IActivityHandler
    public boolean isEnabled() {
        return isEnabledI();
    }
}
