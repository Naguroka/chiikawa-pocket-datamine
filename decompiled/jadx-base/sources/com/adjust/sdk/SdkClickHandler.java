package com.adjust.sdk;

/* JADX INFO: loaded from: classes3.dex */
public class SdkClickHandler implements com.adjust.sdk.ISdkClickHandler {
    private static final double MILLISECONDS_TO_SECONDS_DIVISOR = 1000.0d;
    private static final java.lang.String SCHEDULED_EXECUTOR_SOURCE = "SdkClickHandler";
    private static final java.lang.String SOURCE_INSTALL_REFERRER = "install_referrer";
    private static final java.lang.String SOURCE_REFTAG = "reftag";
    private java.lang.ref.WeakReference<com.adjust.sdk.IActivityHandler> activityHandlerWeakRef;
    private com.adjust.sdk.network.IActivityPackageSender activityPackageSender;
    private com.adjust.sdk.BackoffStrategy backoffStrategy;
    private long lastPackageRetryInMilli = 0;
    private com.adjust.sdk.ILogger logger;
    private java.util.List<com.adjust.sdk.ActivityPackage> packageQueue;
    private boolean paused;
    private com.adjust.sdk.scheduler.ThreadScheduler scheduler;

    public class a implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.adjust.sdk.ActivityPackage f96a;

        public a(com.adjust.sdk.ActivityPackage activityPackage) {
            this.f96a = activityPackage;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.adjust.sdk.SdkClickHandler.this.packageQueue.add(this.f96a);
            com.adjust.sdk.SdkClickHandler.this.logger.debug("Added sdk_click %d", java.lang.Integer.valueOf(com.adjust.sdk.SdkClickHandler.this.packageQueue.size()));
            com.adjust.sdk.SdkClickHandler.this.logger.verbose("%s", this.f96a.getExtendedString());
            com.adjust.sdk.SdkClickHandler.this.sendNextSdkClick();
        }
    }

    public class b implements java.lang.Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.adjust.sdk.IActivityHandler iActivityHandler = (com.adjust.sdk.IActivityHandler) com.adjust.sdk.SdkClickHandler.this.activityHandlerWeakRef.get();
            com.adjust.sdk.SharedPreferencesManager defaultInstance = com.adjust.sdk.SharedPreferencesManager.getDefaultInstance(iActivityHandler.getContext());
            try {
                org.json.JSONArray rawReferrerArray = defaultInstance.getRawReferrerArray();
                boolean z = false;
                for (int i = 0; i < rawReferrerArray.length(); i++) {
                    org.json.JSONArray jSONArray = rawReferrerArray.getJSONArray(i);
                    if (jSONArray.optInt(2, -1) == 0) {
                        java.lang.String strOptString = jSONArray.optString(0, null);
                        long jOptLong = jSONArray.optLong(1, -1L);
                        jSONArray.put(2, 1);
                        com.adjust.sdk.SdkClickHandler.this.sendSdkClick(com.adjust.sdk.PackageFactory.buildReftagSdkClickPackage(strOptString, jOptLong, iActivityHandler.getActivityState(), iActivityHandler.getAdjustConfig(), iActivityHandler.getDeviceInfo(), iActivityHandler.getGlobalParameters(), iActivityHandler.getInternalState()));
                        z = true;
                    }
                }
                if (z) {
                    defaultInstance.saveRawReferrerArray(rawReferrerArray);
                }
            } catch (org.json.JSONException e) {
                com.adjust.sdk.SdkClickHandler.this.logger.error("Send saved raw referrers error (%s)", e.getMessage());
            }
        }
    }

    public class c implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ java.lang.String f98a;
        public final /* synthetic */ java.lang.String b;

        public c(java.lang.String str, java.lang.String str2) {
            this.f98a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.adjust.sdk.IActivityHandler iActivityHandler = (com.adjust.sdk.IActivityHandler) com.adjust.sdk.SdkClickHandler.this.activityHandlerWeakRef.get();
            if (iActivityHandler == null) {
                return;
            }
            com.adjust.sdk.SdkClickHandler.this.sendSdkClick(com.adjust.sdk.PackageFactory.buildPreinstallSdkClickPackage(this.f98a, this.b, iActivityHandler.getActivityState(), iActivityHandler.getAdjustConfig(), iActivityHandler.getDeviceInfo(), iActivityHandler.getGlobalParameters()));
        }
    }

    public class d implements java.lang.Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.adjust.sdk.SdkClickHandler.this.sendNextSdkClickI();
        }
    }

    public class e implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.adjust.sdk.ActivityPackage f100a;

        public e(com.adjust.sdk.ActivityPackage activityPackage) {
            this.f100a = activityPackage;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.adjust.sdk.SdkClickHandler.this.sendSdkClickI(this.f100a);
            com.adjust.sdk.SdkClickHandler.this.sendNextSdkClick();
        }
    }

    public SdkClickHandler(com.adjust.sdk.IActivityHandler iActivityHandler, boolean z, com.adjust.sdk.network.IActivityPackageSender iActivityPackageSender) {
        init(iActivityHandler, z, iActivityPackageSender);
        this.logger = com.adjust.sdk.AdjustFactory.getLogger();
        this.backoffStrategy = com.adjust.sdk.AdjustFactory.getSdkClickBackoffStrategy();
        this.scheduler = new com.adjust.sdk.scheduler.SingleThreadCachedScheduler(SCHEDULED_EXECUTOR_SOURCE);
    }

    private java.util.Map<java.lang.String, java.lang.String> generateSendingParametersI() {
        java.util.HashMap map = new java.util.HashMap();
        com.adjust.sdk.PackageBuilder.addString(map, "sent_at", com.adjust.sdk.Util.dateFormatter.format(java.lang.Long.valueOf(java.lang.System.currentTimeMillis())));
        int size = this.packageQueue.size() - 1;
        if (size > 0) {
            com.adjust.sdk.PackageBuilder.addLong(map, "queue_size", size);
        }
        return map;
    }

    private void logErrorMessageI(com.adjust.sdk.ActivityPackage activityPackage, java.lang.String str, java.lang.Throwable th) {
        this.logger.error(com.adjust.sdk.Util.formatString("%s. (%s)", activityPackage.getFailureMessage(), com.adjust.sdk.Util.getReasonString(str, th)), new java.lang.Object[0]);
    }

    private void retrySendingI(com.adjust.sdk.ActivityPackage activityPackage, java.lang.Long l) {
        if (l == null || l.longValue() <= 0) {
            this.logger.error("Retrying sdk_click package for the %d time", java.lang.Integer.valueOf(activityPackage.increaseRetries()));
        } else {
            this.lastPackageRetryInMilli = l.longValue();
        }
        sendSdkClick(activityPackage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendNextSdkClick() {
        this.scheduler.submit(new com.adjust.sdk.SdkClickHandler.d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendNextSdkClickI() {
        com.adjust.sdk.IActivityHandler iActivityHandler = this.activityHandlerWeakRef.get();
        if (iActivityHandler.getActivityState() == null || iActivityHandler.getActivityState().isGdprForgotten || this.paused || this.packageQueue.isEmpty()) {
            return;
        }
        com.adjust.sdk.ActivityPackage activityPackageRemove = this.packageQueue.remove(0);
        int retries = activityPackageRemove.getRetries();
        com.adjust.sdk.SdkClickHandler.e eVar = new com.adjust.sdk.SdkClickHandler.e(activityPackageRemove);
        long jWaitTime = waitTime(retries);
        if (jWaitTime > 0) {
            this.scheduler.schedule(eVar, jWaitTime);
        } else {
            eVar.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendSdkClickI(com.adjust.sdk.ActivityPackage activityPackage) {
        long clickTimeInSeconds;
        java.lang.String str;
        long j;
        long installBeginTimeInSeconds;
        long clickTimeServerInSeconds;
        java.lang.String str2;
        java.lang.String installVersion;
        java.lang.Boolean googlePlayInstant;
        java.lang.Boolean isClick;
        java.lang.String str3;
        com.adjust.sdk.IActivityHandler iActivityHandler = this.activityHandlerWeakRef.get();
        java.lang.String str4 = activityPackage.getParameters().get("source");
        boolean z = str4 != null && str4.equals("reftag");
        java.lang.String str5 = activityPackage.getParameters().get("raw_referrer");
        if (z && com.adjust.sdk.SharedPreferencesManager.getDefaultInstance(iActivityHandler.getContext()).getRawReferrer(str5, activityPackage.getClickTimeInMilliseconds()) == null) {
            return;
        }
        boolean z2 = str4 != null && str4.equals("install_referrer");
        if (z2) {
            clickTimeInSeconds = activityPackage.getClickTimeInSeconds();
            installBeginTimeInSeconds = activityPackage.getInstallBeginTimeInSeconds();
            str = activityPackage.getParameters().get(com.adjust.sdk.Constants.REFERRER);
            clickTimeServerInSeconds = activityPackage.getClickTimeServerInSeconds();
            long installBeginTimeServerInSeconds = activityPackage.getInstallBeginTimeServerInSeconds();
            installVersion = activityPackage.getInstallVersion();
            googlePlayInstant = activityPackage.getGooglePlayInstant();
            isClick = activityPackage.getIsClick();
            str2 = activityPackage.getParameters().get("referrer_api");
            j = installBeginTimeServerInSeconds;
        } else {
            clickTimeInSeconds = -1;
            str = null;
            j = -1;
            installBeginTimeInSeconds = -1;
            clickTimeServerInSeconds = -1;
            str2 = null;
            installVersion = null;
            googlePlayInstant = null;
            isClick = null;
        }
        long j2 = j;
        boolean z3 = str4 != null && str4.equals(com.adjust.sdk.Constants.PREINSTALL);
        com.adjust.sdk.ResponseData responseDataSendActivityPackageSync = this.activityPackageSender.sendActivityPackageSync(activityPackage, generateSendingParametersI());
        if (responseDataSendActivityPackageSync instanceof com.adjust.sdk.SdkClickResponseData) {
            com.adjust.sdk.SdkClickResponseData sdkClickResponseData = (com.adjust.sdk.SdkClickResponseData) responseDataSendActivityPackageSync;
            if (sdkClickResponseData.willRetry) {
                retrySendingI(activityPackage, sdkClickResponseData.retryIn);
                return;
            }
            boolean z4 = z3;
            this.lastPackageRetryInMilli = 0L;
            if (iActivityHandler == null) {
                return;
            }
            if (sdkClickResponseData.trackingState == com.adjust.sdk.TrackingState.OPTED_OUT) {
                iActivityHandler.gotOptOutResponse();
                return;
            }
            if (z) {
                com.adjust.sdk.SharedPreferencesManager.getDefaultInstance(iActivityHandler.getContext()).removeRawReferrer(str5, activityPackage.getClickTimeInMilliseconds());
            }
            if (z2) {
                sdkClickResponseData.clickTime = clickTimeInSeconds;
                sdkClickResponseData.installBegin = installBeginTimeInSeconds;
                sdkClickResponseData.installReferrer = str;
                sdkClickResponseData.clickTimeServer = clickTimeServerInSeconds;
                sdkClickResponseData.installBeginServer = j2;
                sdkClickResponseData.installVersion = installVersion;
                sdkClickResponseData.googlePlayInstant = googlePlayInstant;
                sdkClickResponseData.isClick = isClick;
                sdkClickResponseData.referrerApi = str2;
                sdkClickResponseData.isInstallReferrer = true;
            }
            if (z4 && (str3 = activityPackage.getParameters().get("found_location")) != null && !str3.isEmpty()) {
                com.adjust.sdk.SharedPreferencesManager defaultInstance = com.adjust.sdk.SharedPreferencesManager.getDefaultInstance(iActivityHandler.getContext());
                if (com.adjust.sdk.Constants.SYSTEM_INSTALLER_REFERRER.equalsIgnoreCase(str3)) {
                    defaultInstance.removePreinstallReferrer();
                } else {
                    defaultInstance.setPreinstallPayloadReadStatus(com.adjust.sdk.PreinstallUtil.markAsRead(str3, defaultInstance.getPreinstallPayloadReadStatus()));
                }
            }
            iActivityHandler.finishedTrackingActivity(sdkClickResponseData);
        }
    }

    private long waitTime(int i) {
        long j = this.lastPackageRetryInMilli;
        if (j > 0) {
            return j;
        }
        if (i <= 0) {
            return 0L;
        }
        long waitingTime = com.adjust.sdk.Util.getWaitingTime(i, this.backoffStrategy);
        this.logger.verbose("Waiting for %s seconds before retrying sdk_click for the %d time", com.adjust.sdk.Util.SecondsDisplayFormat.format(waitingTime / MILLISECONDS_TO_SECONDS_DIVISOR), java.lang.Integer.valueOf(i));
        return waitingTime;
    }

    @Override // com.adjust.sdk.ISdkClickHandler
    public void init(com.adjust.sdk.IActivityHandler iActivityHandler, boolean z, com.adjust.sdk.network.IActivityPackageSender iActivityPackageSender) {
        this.paused = !z;
        this.packageQueue = new java.util.ArrayList();
        this.activityHandlerWeakRef = new java.lang.ref.WeakReference<>(iActivityHandler);
        this.activityPackageSender = iActivityPackageSender;
    }

    @Override // com.adjust.sdk.ISdkClickHandler
    public void pauseSending() {
        this.paused = true;
    }

    @Override // com.adjust.sdk.ISdkClickHandler
    public void resumeSending() {
        this.paused = false;
        sendNextSdkClick();
    }

    @Override // com.adjust.sdk.ISdkClickHandler
    public void sendPreinstallPayload(java.lang.String str, java.lang.String str2) {
        this.scheduler.submit(new com.adjust.sdk.SdkClickHandler.c(str, str2));
    }

    @Override // com.adjust.sdk.ISdkClickHandler
    public void sendReftagReferrers() {
        this.scheduler.submit(new com.adjust.sdk.SdkClickHandler.b());
    }

    @Override // com.adjust.sdk.ISdkClickHandler
    public void sendSdkClick(com.adjust.sdk.ActivityPackage activityPackage) {
        this.scheduler.submit(new com.adjust.sdk.SdkClickHandler.a(activityPackage));
    }

    @Override // com.adjust.sdk.ISdkClickHandler
    public void teardown() {
        this.logger.verbose("SdkClickHandler teardown", new java.lang.Object[0]);
        com.adjust.sdk.scheduler.ThreadScheduler threadScheduler = this.scheduler;
        if (threadScheduler != null) {
            threadScheduler.teardown();
        }
        java.util.List<com.adjust.sdk.ActivityPackage> list = this.packageQueue;
        if (list != null) {
            list.clear();
        }
        java.lang.ref.WeakReference<com.adjust.sdk.IActivityHandler> weakReference = this.activityHandlerWeakRef;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.logger = null;
        this.packageQueue = null;
        this.backoffStrategy = null;
        this.scheduler = null;
    }
}
