package com.adjust.sdk;

/* JADX INFO: loaded from: classes3.dex */
public class PackageHandler implements com.adjust.sdk.IPackageHandler, com.adjust.sdk.network.IActivityPackageSender.ResponseDataCallbackSubscriber {
    private static final java.lang.String PACKAGE_QUEUE_FILENAME = "AdjustIoPackageQueue";
    private static final java.lang.String PACKAGE_QUEUE_NAME = "Package queue";
    private java.lang.ref.WeakReference<com.adjust.sdk.IActivityHandler> activityHandlerWeakRef;
    private com.adjust.sdk.network.IActivityPackageSender activityPackageSender;
    private android.content.Context context;
    private java.util.concurrent.atomic.AtomicBoolean isSending;
    private java.util.List<com.adjust.sdk.ActivityPackage> packageQueue;
    private boolean paused;
    private long retryStartedAtTimeMilliSeconds;
    private com.adjust.sdk.scheduler.ThreadScheduler scheduler = new com.adjust.sdk.scheduler.SingleThreadCachedScheduler("PackageHandler");
    private com.adjust.sdk.ILogger logger = com.adjust.sdk.AdjustFactory.getLogger();
    private com.adjust.sdk.BackoffStrategy backoffStrategy = com.adjust.sdk.AdjustFactory.getPackageHandlerBackoffStrategy();
    private com.adjust.sdk.BackoffStrategy backoffStrategyForInstallSession = com.adjust.sdk.AdjustFactory.getInstallSessionBackoffStrategy();
    private boolean isRetrying = false;
    private double totalWaitTimeSeconds = 0.0d;

    public class a implements java.lang.Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.adjust.sdk.PackageHandler.this.initI();
        }
    }

    public class b implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.adjust.sdk.ActivityPackage f86a;

        public b(com.adjust.sdk.ActivityPackage activityPackage) {
            this.f86a = activityPackage;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.adjust.sdk.PackageHandler.this.addI(this.f86a);
        }
    }

    public class c implements java.lang.Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.adjust.sdk.PackageHandler.this.sendFirstI();
        }
    }

    public class d implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.adjust.sdk.ResponseData f88a;

        public d(com.adjust.sdk.ResponseData responseData) {
            this.f88a = responseData;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.adjust.sdk.PackageHandler.this.sendNextI(this.f88a.continueIn);
        }
    }

    public class e implements java.lang.Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.adjust.sdk.PackageHandler.this.logger.verbose("Package handler can send", new java.lang.Object[0]);
            com.adjust.sdk.PackageHandler.this.isSending.set(false);
            com.adjust.sdk.PackageHandler.this.sendFirstPackage();
        }
    }

    public class f implements java.lang.Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.adjust.sdk.PackageHandler.this.flushI();
        }
    }

    public class g implements java.lang.Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.adjust.sdk.PackageHandler.this.logger.verbose("Package handler finished waiting to continue", new java.lang.Object[0]);
            com.adjust.sdk.PackageHandler.this.isSending.set(false);
            com.adjust.sdk.PackageHandler.this.sendFirstPackage();
        }
    }

    public PackageHandler(com.adjust.sdk.IActivityHandler iActivityHandler, android.content.Context context, boolean z, com.adjust.sdk.network.IActivityPackageSender iActivityPackageSender) {
        init(iActivityHandler, context, z, iActivityPackageSender);
        this.scheduler.submit(new com.adjust.sdk.PackageHandler.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addI(com.adjust.sdk.ActivityPackage activityPackage) {
        if (this.isRetrying) {
            activityPackage.setWaitBeforeSendTimeSeconds(this.totalWaitTimeSeconds - ((java.lang.System.currentTimeMillis() - this.retryStartedAtTimeMilliSeconds) / 1000.0d));
        }
        com.adjust.sdk.PackageBuilder.addLong(activityPackage.getParameters(), "enqueue_size", this.packageQueue.size());
        this.packageQueue.add(activityPackage);
        this.logger.debug("Added package %d (%s)", java.lang.Integer.valueOf(this.packageQueue.size()), activityPackage);
        this.logger.verbose("%s", activityPackage.getExtendedString());
        writePackageQueueI();
    }

    public static java.lang.Boolean deletePackageQueue(android.content.Context context) {
        return java.lang.Boolean.valueOf(context.deleteFile(PACKAGE_QUEUE_FILENAME));
    }

    public static void deleteState(android.content.Context context) {
        deletePackageQueue(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void flushI() {
        this.packageQueue.clear();
        writePackageQueueI();
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

    /* JADX INFO: Access modifiers changed from: private */
    public void initI() {
        this.isSending = new java.util.concurrent.atomic.AtomicBoolean();
        readPackageQueueI();
    }

    private void readPackageQueueI() {
        try {
            this.packageQueue = (java.util.List) com.adjust.sdk.Util.readObject(this.context, PACKAGE_QUEUE_FILENAME, PACKAGE_QUEUE_NAME, java.util.List.class);
        } catch (java.lang.Exception e2) {
            this.logger.error("Failed to read %s file (%s)", PACKAGE_QUEUE_NAME, e2.getMessage());
            this.packageQueue = null;
        }
        java.util.List<com.adjust.sdk.ActivityPackage> list = this.packageQueue;
        if (list != null) {
            this.logger.debug("Package handler read %d packages", java.lang.Integer.valueOf(list.size()));
        } else {
            this.packageQueue = new java.util.ArrayList();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendFirstI() {
        if (this.packageQueue.isEmpty()) {
            return;
        }
        if (this.paused) {
            this.logger.debug("Package handler is paused", new java.lang.Object[0]);
            return;
        }
        if (this.isSending.getAndSet(true)) {
            this.logger.verbose("Package handler is already sending", new java.lang.Object[0]);
            return;
        }
        java.util.Map<java.lang.String, java.lang.String> mapGenerateSendingParametersI = generateSendingParametersI();
        com.adjust.sdk.ActivityPackage activityPackage = this.packageQueue.get(0);
        com.adjust.sdk.PackageBuilder.addLong(mapGenerateSendingParametersI, "retry_count", activityPackage.getRetryCount());
        com.adjust.sdk.PackageBuilder.addLong(mapGenerateSendingParametersI, "first_error", activityPackage.getFirstErrorCode());
        com.adjust.sdk.PackageBuilder.addLong(mapGenerateSendingParametersI, "last_error", activityPackage.getLastErrorCode());
        com.adjust.sdk.PackageBuilder.addDouble(mapGenerateSendingParametersI, "wait_total", this.totalWaitTimeSeconds);
        com.adjust.sdk.PackageBuilder.addDouble(mapGenerateSendingParametersI, "wait_time", activityPackage.getWaitBeforeSendTimeSeconds());
        this.activityPackageSender.sendActivityPackage(activityPackage, mapGenerateSendingParametersI, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendNextI(java.lang.Long l) {
        this.isRetrying = false;
        this.retryStartedAtTimeMilliSeconds = 0L;
        if (this.packageQueue.isEmpty()) {
            this.totalWaitTimeSeconds = 0.0d;
            return;
        }
        this.packageQueue.remove(0);
        writePackageQueueI();
        if (l == null || l.longValue() <= 0) {
            this.logger.verbose("Package handler can send", new java.lang.Object[0]);
            this.isSending.set(false);
            sendFirstI();
        } else {
            com.adjust.sdk.PackageHandler.g gVar = new com.adjust.sdk.PackageHandler.g();
            this.logger.verbose("Waiting for %d seconds before continuing for next package in continue_in", java.lang.Double.valueOf(l.longValue() / 1000.0d));
            this.scheduler.schedule(gVar, l.longValue());
        }
    }

    private void writePackageQueueI() {
        com.adjust.sdk.Util.writeObject(this.packageQueue, this.context, PACKAGE_QUEUE_FILENAME, PACKAGE_QUEUE_NAME);
        this.logger.debug("Package handler wrote %d packages", java.lang.Integer.valueOf(this.packageQueue.size()));
    }

    @Override // com.adjust.sdk.IPackageHandler
    public void addPackage(com.adjust.sdk.ActivityPackage activityPackage) {
        this.scheduler.submit(new com.adjust.sdk.PackageHandler.b(activityPackage));
    }

    @Override // com.adjust.sdk.IPackageHandler
    public void flush() {
        this.scheduler.submit(new com.adjust.sdk.PackageHandler.f());
    }

    @Override // com.adjust.sdk.IPackageHandler
    public void init(com.adjust.sdk.IActivityHandler iActivityHandler, android.content.Context context, boolean z, com.adjust.sdk.network.IActivityPackageSender iActivityPackageSender) {
        this.activityHandlerWeakRef = new java.lang.ref.WeakReference<>(iActivityHandler);
        this.context = context;
        this.paused = !z;
        this.activityPackageSender = iActivityPackageSender;
    }

    @Override // com.adjust.sdk.network.IActivityPackageSender.ResponseDataCallbackSubscriber
    public void onResponseDataCallback(com.adjust.sdk.ResponseData responseData) {
        this.logger.debug("Got response in PackageHandler", new java.lang.Object[0]);
        com.adjust.sdk.IActivityHandler iActivityHandler = this.activityHandlerWeakRef.get();
        if (iActivityHandler != null && responseData.trackingState == com.adjust.sdk.TrackingState.OPTED_OUT) {
            iActivityHandler.gotOptOutResponse();
        }
        if (!responseData.willRetry) {
            this.scheduler.submit(new com.adjust.sdk.PackageHandler.d(responseData));
            if (iActivityHandler != null) {
                iActivityHandler.finishedTrackingActivity(responseData);
                return;
            }
            return;
        }
        if (!this.isRetrying) {
            this.isRetrying = true;
            this.retryStartedAtTimeMilliSeconds = java.lang.System.currentTimeMillis();
        }
        writePackageQueueI();
        if (iActivityHandler != null) {
            iActivityHandler.finishedTrackingActivity(responseData);
        }
        com.adjust.sdk.PackageHandler.e eVar = new com.adjust.sdk.PackageHandler.e();
        java.lang.Long l = responseData.retryIn;
        if (l != null) {
            this.scheduler.schedule(eVar, l.longValue());
            return;
        }
        int iIncreaseRetries = responseData.activityPackage.increaseRetries();
        long waitingTime = com.adjust.sdk.Util.getWaitingTime(iIncreaseRetries, (responseData.activityPackage.getActivityKind() != com.adjust.sdk.ActivityKind.SESSION || com.adjust.sdk.SharedPreferencesManager.getDefaultInstance(this.context).getInstallTracked()) ? this.backoffStrategy : this.backoffStrategyForInstallSession);
        double d2 = waitingTime / 1000.0d;
        java.lang.String str = com.adjust.sdk.Util.SecondsDisplayFormat.format(d2);
        this.totalWaitTimeSeconds += d2;
        this.logger.verbose("Waiting for %s seconds before retrying %s for the %d time", str, responseData.activityPackage.getActivityKind().toString(), java.lang.Integer.valueOf(iIncreaseRetries));
        this.scheduler.schedule(eVar, waitingTime);
        com.adjust.sdk.ActivityPackage activityPackage = responseData.activityPackage;
        activityPackage.setWaitBeforeSendTimeSeconds(activityPackage.getWaitBeforeSendTimeSeconds() + d2);
    }

    @Override // com.adjust.sdk.IPackageHandler
    public void pauseSending() {
        this.paused = true;
    }

    @Override // com.adjust.sdk.IPackageHandler
    public void resumeSending() {
        this.paused = false;
    }

    @Override // com.adjust.sdk.IPackageHandler
    public void sendFirstPackage() {
        this.scheduler.submit(new com.adjust.sdk.PackageHandler.c());
    }

    @Override // com.adjust.sdk.IPackageHandler
    public void teardown() {
        this.logger.verbose("PackageHandler teardown", new java.lang.Object[0]);
        com.adjust.sdk.scheduler.ThreadScheduler threadScheduler = this.scheduler;
        if (threadScheduler != null) {
            threadScheduler.teardown();
        }
        java.lang.ref.WeakReference<com.adjust.sdk.IActivityHandler> weakReference = this.activityHandlerWeakRef;
        if (weakReference != null) {
            weakReference.clear();
        }
        java.util.List<com.adjust.sdk.ActivityPackage> list = this.packageQueue;
        if (list != null) {
            list.clear();
        }
        this.scheduler = null;
        this.activityHandlerWeakRef = null;
        this.packageQueue = null;
        this.isSending = null;
        this.context = null;
        this.logger = null;
        this.backoffStrategy = null;
    }
}
