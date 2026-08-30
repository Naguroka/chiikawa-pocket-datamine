package com.adjust.sdk;

/* JADX INFO: loaded from: classes3.dex */
public class PurchaseVerificationHandler implements com.adjust.sdk.IPurchaseVerificationHandler {
    private static final double MILLISECONDS_TO_SECONDS_DIVISOR = 1000.0d;
    private static final java.lang.String SCHEDULED_EXECUTOR_SOURCE = "PurchaseVerificationHandler";
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
        public final /* synthetic */ com.adjust.sdk.ActivityPackage f92a;

        public a(com.adjust.sdk.ActivityPackage activityPackage) {
            this.f92a = activityPackage;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.adjust.sdk.PurchaseVerificationHandler.this.packageQueue.add(this.f92a);
            com.adjust.sdk.PurchaseVerificationHandler.this.logger.debug("Added purchase_verification %d", java.lang.Integer.valueOf(com.adjust.sdk.PurchaseVerificationHandler.this.packageQueue.size()));
            com.adjust.sdk.PurchaseVerificationHandler.this.logger.verbose("%s", this.f92a.getExtendedString());
            com.adjust.sdk.PurchaseVerificationHandler.this.sendNextPurchaseVerificationPackage();
        }
    }

    public class b implements java.lang.Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.adjust.sdk.PurchaseVerificationHandler.this.sendNextPurchaseVerificationPackageI();
        }
    }

    public class c implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.adjust.sdk.ActivityPackage f94a;

        public c(com.adjust.sdk.ActivityPackage activityPackage) {
            this.f94a = activityPackage;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.adjust.sdk.PurchaseVerificationHandler.this.sendPurchaseVerificationPackageI(this.f94a);
            com.adjust.sdk.PurchaseVerificationHandler.this.sendNextPurchaseVerificationPackage();
        }
    }

    public PurchaseVerificationHandler(com.adjust.sdk.IActivityHandler iActivityHandler, boolean z, com.adjust.sdk.network.IActivityPackageSender iActivityPackageSender) {
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

    private void retrySendingI(com.adjust.sdk.ActivityPackage activityPackage, java.lang.Long l) {
        if (l == null || l.longValue() <= 0) {
            this.logger.error("Retrying purchase_verification package for the %d time", java.lang.Integer.valueOf(activityPackage.increaseRetries()));
        } else {
            this.lastPackageRetryInMilli = l.longValue();
        }
        sendPurchaseVerificationPackage(activityPackage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendNextPurchaseVerificationPackage() {
        this.scheduler.submit(new com.adjust.sdk.PurchaseVerificationHandler.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendNextPurchaseVerificationPackageI() {
        com.adjust.sdk.IActivityHandler iActivityHandler = this.activityHandlerWeakRef.get();
        if (iActivityHandler.getActivityState() == null || iActivityHandler.getActivityState().isGdprForgotten || this.paused || this.packageQueue.isEmpty()) {
            return;
        }
        com.adjust.sdk.ActivityPackage activityPackageRemove = this.packageQueue.remove(0);
        int retries = activityPackageRemove.getRetries();
        com.adjust.sdk.PurchaseVerificationHandler.c cVar = new com.adjust.sdk.PurchaseVerificationHandler.c(activityPackageRemove);
        long jWaitTime = waitTime(retries);
        if (jWaitTime > 0) {
            this.scheduler.schedule(cVar, jWaitTime);
        } else {
            cVar.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendPurchaseVerificationPackageI(com.adjust.sdk.ActivityPackage activityPackage) {
        com.adjust.sdk.IActivityHandler iActivityHandler = this.activityHandlerWeakRef.get();
        com.adjust.sdk.ResponseData responseDataSendActivityPackageSync = this.activityPackageSender.sendActivityPackageSync(activityPackage, generateSendingParametersI());
        if (responseDataSendActivityPackageSync instanceof com.adjust.sdk.PurchaseVerificationResponseData) {
            com.adjust.sdk.PurchaseVerificationResponseData purchaseVerificationResponseData = (com.adjust.sdk.PurchaseVerificationResponseData) responseDataSendActivityPackageSync;
            if (purchaseVerificationResponseData.willRetry) {
                retrySendingI(activityPackage, responseDataSendActivityPackageSync.retryIn);
                return;
            }
            this.lastPackageRetryInMilli = 0L;
            if (iActivityHandler == null) {
                return;
            }
            if (purchaseVerificationResponseData.trackingState == com.adjust.sdk.TrackingState.OPTED_OUT) {
                iActivityHandler.gotOptOutResponse();
            } else {
                iActivityHandler.finishedTrackingActivity(purchaseVerificationResponseData);
            }
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
        this.logger.verbose("Waiting for %s seconds before retrying purchase_verification for the %d time", com.adjust.sdk.Util.SecondsDisplayFormat.format(waitingTime / MILLISECONDS_TO_SECONDS_DIVISOR), java.lang.Integer.valueOf(i));
        return waitingTime;
    }

    @Override // com.adjust.sdk.IPurchaseVerificationHandler
    public void init(com.adjust.sdk.IActivityHandler iActivityHandler, boolean z, com.adjust.sdk.network.IActivityPackageSender iActivityPackageSender) {
        this.paused = !z;
        this.packageQueue = new java.util.ArrayList();
        this.activityHandlerWeakRef = new java.lang.ref.WeakReference<>(iActivityHandler);
        this.activityPackageSender = iActivityPackageSender;
    }

    @Override // com.adjust.sdk.IPurchaseVerificationHandler
    public void pauseSending() {
        this.paused = true;
    }

    @Override // com.adjust.sdk.IPurchaseVerificationHandler
    public void resumeSending() {
        this.paused = false;
        sendNextPurchaseVerificationPackage();
    }

    @Override // com.adjust.sdk.IPurchaseVerificationHandler
    public void sendPurchaseVerificationPackage(com.adjust.sdk.ActivityPackage activityPackage) {
        this.scheduler.submit(new com.adjust.sdk.PurchaseVerificationHandler.a(activityPackage));
    }

    @Override // com.adjust.sdk.IPurchaseVerificationHandler
    public void teardown() {
        this.logger.verbose("PurchaseVerificationHandler teardown", new java.lang.Object[0]);
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
