package com.adjust.sdk;

/* JADX INFO: loaded from: classes3.dex */
public class AttributionHandler implements com.adjust.sdk.IAttributionHandler, com.adjust.sdk.network.IActivityPackageSender.ResponseDataCallbackSubscriber {
    private static final java.lang.String ATTRIBUTION_TIMER_NAME = "Attribution timer";
    private java.lang.ref.WeakReference<com.adjust.sdk.IActivityHandler> activityHandlerWeakRef;
    private com.adjust.sdk.network.IActivityPackageSender activityPackageSender;
    private java.lang.String lastInitiatedBy;
    private boolean paused;
    private com.adjust.sdk.ILogger logger = com.adjust.sdk.AdjustFactory.getLogger();
    private com.adjust.sdk.scheduler.ThreadScheduler scheduler = new com.adjust.sdk.scheduler.SingleThreadCachedScheduler("AttributionHandler");
    private com.adjust.sdk.scheduler.TimerOnce timer = new com.adjust.sdk.scheduler.TimerOnce(new com.adjust.sdk.AttributionHandler.a(), ATTRIBUTION_TIMER_NAME);

    public class a implements java.lang.Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.adjust.sdk.AttributionHandler.this.sendAttributionRequest();
        }
    }

    public class b implements java.lang.Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.adjust.sdk.AttributionHandler.this.lastInitiatedBy = com.unity3d.services.core.di.ServiceProvider.NAMED_SDK;
            com.adjust.sdk.AttributionHandler.this.getAttributionI(0L);
        }
    }

    public class c implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.adjust.sdk.SessionResponseData f76a;

        public c(com.adjust.sdk.SessionResponseData sessionResponseData) {
            this.f76a = sessionResponseData;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.adjust.sdk.IActivityHandler iActivityHandler = (com.adjust.sdk.IActivityHandler) com.adjust.sdk.AttributionHandler.this.activityHandlerWeakRef.get();
            if (iActivityHandler == null) {
                return;
            }
            com.adjust.sdk.AttributionHandler.this.checkSessionResponseI(iActivityHandler, this.f76a);
        }
    }

    public class d implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.adjust.sdk.SdkClickResponseData f77a;

        public d(com.adjust.sdk.SdkClickResponseData sdkClickResponseData) {
            this.f77a = sdkClickResponseData;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.adjust.sdk.IActivityHandler iActivityHandler = (com.adjust.sdk.IActivityHandler) com.adjust.sdk.AttributionHandler.this.activityHandlerWeakRef.get();
            if (iActivityHandler == null) {
                return;
            }
            com.adjust.sdk.AttributionHandler.this.checkSdkClickResponseI(iActivityHandler, this.f77a);
        }
    }

    public class e implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.adjust.sdk.AttributionResponseData f78a;

        public e(com.adjust.sdk.AttributionResponseData attributionResponseData) {
            this.f78a = attributionResponseData;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.adjust.sdk.IActivityHandler iActivityHandler = (com.adjust.sdk.IActivityHandler) com.adjust.sdk.AttributionHandler.this.activityHandlerWeakRef.get();
            if (iActivityHandler == null) {
                return;
            }
            com.adjust.sdk.AttributionHandler.this.checkAttributionResponseI(iActivityHandler, this.f78a);
        }
    }

    public class f implements java.lang.Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.adjust.sdk.AttributionHandler.this.sendAttributionRequestI();
        }
    }

    public class g implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.adjust.sdk.ResponseData f80a;

        public g(com.adjust.sdk.ResponseData responseData) {
            this.f80a = responseData;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.adjust.sdk.IActivityHandler iActivityHandler = (com.adjust.sdk.IActivityHandler) com.adjust.sdk.AttributionHandler.this.activityHandlerWeakRef.get();
            if (iActivityHandler == null) {
                return;
            }
            com.adjust.sdk.ResponseData responseData = this.f80a;
            if (responseData.trackingState == com.adjust.sdk.TrackingState.OPTED_OUT) {
                iActivityHandler.gotOptOutResponse();
            } else if (responseData instanceof com.adjust.sdk.AttributionResponseData) {
                com.adjust.sdk.AttributionHandler.this.checkAttributionResponseI(iActivityHandler, (com.adjust.sdk.AttributionResponseData) responseData);
            }
        }
    }

    public AttributionHandler(com.adjust.sdk.IActivityHandler iActivityHandler, boolean z, com.adjust.sdk.network.IActivityPackageSender iActivityPackageSender) {
        init(iActivityHandler, z, iActivityPackageSender);
    }

    private com.adjust.sdk.ActivityPackage buildAndGetAttributionPackage(com.adjust.sdk.ActivityHandler.InternalState internalState) {
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        com.adjust.sdk.IActivityHandler iActivityHandler = this.activityHandlerWeakRef.get();
        com.adjust.sdk.PackageBuilder packageBuilder = new com.adjust.sdk.PackageBuilder(iActivityHandler.getAdjustConfig(), iActivityHandler.getDeviceInfo(), iActivityHandler.getActivityState(), iActivityHandler.getGlobalParameters(), jCurrentTimeMillis);
        packageBuilder.internalState = internalState;
        com.adjust.sdk.ActivityPackage activityPackageBuildAttributionPackage = packageBuilder.buildAttributionPackage(this.lastInitiatedBy);
        this.lastInitiatedBy = null;
        return activityPackageBuildAttributionPackage;
    }

    private void checkAttributionI(com.adjust.sdk.IActivityHandler iActivityHandler, com.adjust.sdk.ResponseData responseData) {
        if (responseData.jsonResponse == null) {
            return;
        }
        java.lang.Long l = responseData.askIn;
        if (l == null || l.longValue() < 0) {
            iActivityHandler.setAskingAttribution(false);
            return;
        }
        iActivityHandler.setAskingAttribution(true);
        this.lastInitiatedBy = "backend";
        getAttributionI(l.longValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkAttributionResponseI(com.adjust.sdk.IActivityHandler iActivityHandler, com.adjust.sdk.AttributionResponseData attributionResponseData) {
        checkAttributionI(iActivityHandler, attributionResponseData);
        checkDeeplinkI(attributionResponseData);
        iActivityHandler.launchAttributionResponseTasks(attributionResponseData);
    }

    private void checkDeeplinkI(com.adjust.sdk.AttributionResponseData attributionResponseData) {
        org.json.JSONObject jSONObjectOptJSONObject;
        java.lang.String strOptString;
        org.json.JSONObject jSONObject = attributionResponseData.jsonResponse;
        if (jSONObject == null || (jSONObjectOptJSONObject = jSONObject.optJSONObject(com.json.z8.ATTRIBUTION)) == null || (strOptString = jSONObjectOptJSONObject.optString(com.adjust.sdk.Constants.DEEPLINK, null)) == null) {
            return;
        }
        attributionResponseData.deeplink = android.net.Uri.parse(strOptString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkSdkClickResponseI(com.adjust.sdk.IActivityHandler iActivityHandler, com.adjust.sdk.SdkClickResponseData sdkClickResponseData) {
        checkAttributionI(iActivityHandler, sdkClickResponseData);
        iActivityHandler.launchSdkClickResponseTasks(sdkClickResponseData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkSessionResponseI(com.adjust.sdk.IActivityHandler iActivityHandler, com.adjust.sdk.SessionResponseData sessionResponseData) {
        checkAttributionI(iActivityHandler, sessionResponseData);
        iActivityHandler.launchSessionResponseTasks(sessionResponseData);
    }

    private java.util.Map<java.lang.String, java.lang.String> generateSendingParametersI() {
        java.util.HashMap map = new java.util.HashMap();
        com.adjust.sdk.PackageBuilder.addString(map, "sent_at", com.adjust.sdk.Util.dateFormatter.format(java.lang.Long.valueOf(java.lang.System.currentTimeMillis())));
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getAttributionI(long j) {
        if (this.timer.getFireIn() > j) {
            return;
        }
        if (j != 0) {
            this.logger.debug("Waiting to query attribution in %s seconds", com.adjust.sdk.Util.SecondsDisplayFormat.format(j / 1000.0d));
        }
        this.timer.startIn(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendAttributionRequest() {
        this.scheduler.submit(new com.adjust.sdk.AttributionHandler.f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendAttributionRequestI() {
        if (this.activityHandlerWeakRef.get().getActivityState().isGdprForgotten) {
            return;
        }
        if (this.paused) {
            this.logger.debug("Attribution handler is paused", new java.lang.Object[0]);
            return;
        }
        com.adjust.sdk.ActivityPackage activityPackageBuildAndGetAttributionPackage = buildAndGetAttributionPackage(this.activityHandlerWeakRef.get().getInternalState());
        this.logger.verbose("%s", activityPackageBuildAndGetAttributionPackage.getExtendedString());
        this.activityPackageSender.sendActivityPackage(activityPackageBuildAndGetAttributionPackage, generateSendingParametersI(), this);
    }

    public void checkAttributionResponse(com.adjust.sdk.AttributionResponseData attributionResponseData) {
        this.scheduler.submit(new com.adjust.sdk.AttributionHandler.e(attributionResponseData));
    }

    @Override // com.adjust.sdk.IAttributionHandler
    public void checkSdkClickResponse(com.adjust.sdk.SdkClickResponseData sdkClickResponseData) {
        this.scheduler.submit(new com.adjust.sdk.AttributionHandler.d(sdkClickResponseData));
    }

    @Override // com.adjust.sdk.IAttributionHandler
    public void checkSessionResponse(com.adjust.sdk.SessionResponseData sessionResponseData) {
        this.scheduler.submit(new com.adjust.sdk.AttributionHandler.c(sessionResponseData));
    }

    @Override // com.adjust.sdk.IAttributionHandler
    public void getAttribution() {
        this.scheduler.submit(new com.adjust.sdk.AttributionHandler.b());
    }

    @Override // com.adjust.sdk.IAttributionHandler
    public void init(com.adjust.sdk.IActivityHandler iActivityHandler, boolean z, com.adjust.sdk.network.IActivityPackageSender iActivityPackageSender) {
        this.activityHandlerWeakRef = new java.lang.ref.WeakReference<>(iActivityHandler);
        this.paused = !z;
        this.activityPackageSender = iActivityPackageSender;
    }

    @Override // com.adjust.sdk.network.IActivityPackageSender.ResponseDataCallbackSubscriber
    public void onResponseDataCallback(com.adjust.sdk.ResponseData responseData) {
        this.scheduler.submit(new com.adjust.sdk.AttributionHandler.g(responseData));
    }

    @Override // com.adjust.sdk.IAttributionHandler
    public void pauseSending() {
        this.paused = true;
    }

    @Override // com.adjust.sdk.IAttributionHandler
    public void resumeSending() {
        this.paused = false;
    }

    @Override // com.adjust.sdk.IAttributionHandler
    public void teardown() {
        this.logger.verbose("AttributionHandler teardown", new java.lang.Object[0]);
        com.adjust.sdk.scheduler.TimerOnce timerOnce = this.timer;
        if (timerOnce != null) {
            timerOnce.teardown();
        }
        com.adjust.sdk.scheduler.ThreadScheduler threadScheduler = this.scheduler;
        if (threadScheduler != null) {
            threadScheduler.teardown();
        }
        java.lang.ref.WeakReference<com.adjust.sdk.IActivityHandler> weakReference = this.activityHandlerWeakRef;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.timer = null;
        this.logger = null;
        this.scheduler = null;
        this.activityHandlerWeakRef = null;
    }
}
