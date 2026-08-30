package com.google.firebase.crashlytics.internal.send;

/* JADX INFO: loaded from: classes5.dex */
final class ReportQueue {
    private static final int MAX_DELAY_MS = 3600000;
    private static final int MS_PER_MINUTE = 60000;
    private static final int MS_PER_SECOND = 1000;
    private static final int STARTUP_DURATION_MS = 2000;
    private final double base;
    private long lastUpdatedMs;
    private final com.google.firebase.crashlytics.internal.common.OnDemandCounter onDemandCounter;
    private final java.util.concurrent.BlockingQueue<java.lang.Runnable> queue;
    private final int queueCapacity;
    private final double ratePerMinute;
    private final java.util.concurrent.ThreadPoolExecutor singleThreadExecutor;
    private final long startTimeMs;
    private int step;
    private final long stepDurationMs;
    private final com.google.android.datatransport.Transport<com.google.firebase.crashlytics.internal.model.CrashlyticsReport> transport;

    ReportQueue(com.google.android.datatransport.Transport<com.google.firebase.crashlytics.internal.model.CrashlyticsReport> transport, com.google.firebase.crashlytics.internal.settings.Settings settings, com.google.firebase.crashlytics.internal.common.OnDemandCounter onDemandCounter) {
        this(settings.onDemandUploadRatePerMinute, settings.onDemandBackoffBase, ((long) settings.onDemandBackoffStepDurationSeconds) * 1000, transport, onDemandCounter);
    }

    ReportQueue(double d, double d2, long j, com.google.android.datatransport.Transport<com.google.firebase.crashlytics.internal.model.CrashlyticsReport> transport, com.google.firebase.crashlytics.internal.common.OnDemandCounter onDemandCounter) {
        this.ratePerMinute = d;
        this.base = d2;
        this.stepDurationMs = j;
        this.transport = transport;
        this.onDemandCounter = onDemandCounter;
        this.startTimeMs = android.os.SystemClock.elapsedRealtime();
        int i = (int) d;
        this.queueCapacity = i;
        java.util.concurrent.ArrayBlockingQueue arrayBlockingQueue = new java.util.concurrent.ArrayBlockingQueue(i);
        this.queue = arrayBlockingQueue;
        this.singleThreadExecutor = new java.util.concurrent.ThreadPoolExecutor(1, 1, 0L, java.util.concurrent.TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.step = 0;
        this.lastUpdatedMs = 0L;
    }

    com.google.android.gms.tasks.TaskCompletionSource<com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId> enqueueReport(com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId crashlyticsReportWithSessionId, boolean z) {
        synchronized (this.queue) {
            com.google.android.gms.tasks.TaskCompletionSource<com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId> taskCompletionSource = new com.google.android.gms.tasks.TaskCompletionSource<>();
            if (z) {
                this.onDemandCounter.incrementRecordedOnDemandExceptions();
                if (isQueueAvailable()) {
                    com.google.firebase.crashlytics.internal.Logger.getLogger().d("Enqueueing report: " + crashlyticsReportWithSessionId.getSessionId());
                    com.google.firebase.crashlytics.internal.Logger.getLogger().d("Queue size: " + this.queue.size());
                    this.singleThreadExecutor.execute(new com.google.firebase.crashlytics.internal.send.ReportQueue.ReportRunnable(crashlyticsReportWithSessionId, taskCompletionSource));
                    com.google.firebase.crashlytics.internal.Logger.getLogger().d("Closing task for report: " + crashlyticsReportWithSessionId.getSessionId());
                    taskCompletionSource.trySetResult(crashlyticsReportWithSessionId);
                    return taskCompletionSource;
                }
                calcStep();
                com.google.firebase.crashlytics.internal.Logger.getLogger().d("Dropping report due to queue being full: " + crashlyticsReportWithSessionId.getSessionId());
                this.onDemandCounter.incrementDroppedOnDemandExceptions();
                taskCompletionSource.trySetResult(crashlyticsReportWithSessionId);
                return taskCompletionSource;
            }
            sendReport(crashlyticsReportWithSessionId, taskCompletionSource);
            return taskCompletionSource;
        }
    }

    public void flushScheduledReportsIfAble() {
        final java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
        new java.lang.Thread(new java.lang.Runnable() { // from class: com.google.firebase.crashlytics.internal.send.ReportQueue$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m854x23ee29ee(countDownLatch);
            }
        }).start();
        com.google.firebase.crashlytics.internal.common.Utils.awaitUninterruptibly(countDownLatch, 2L, java.util.concurrent.TimeUnit.SECONDS);
    }

    /* JADX INFO: renamed from: lambda$flushScheduledReportsIfAble$0$com-google-firebase-crashlytics-internal-send-ReportQueue, reason: not valid java name */
    /* synthetic */ void m854x23ee29ee(java.util.concurrent.CountDownLatch countDownLatch) {
        try {
            com.google.android.datatransport.runtime.ForcedSender.sendBlocking(this.transport, com.google.android.datatransport.Priority.HIGHEST);
        } catch (java.lang.Exception unused) {
        }
        countDownLatch.countDown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendReport(final com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId crashlyticsReportWithSessionId, final com.google.android.gms.tasks.TaskCompletionSource<com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId> taskCompletionSource) {
        com.google.firebase.crashlytics.internal.Logger.getLogger().d("Sending report through Google DataTransport: " + crashlyticsReportWithSessionId.getSessionId());
        final boolean z = android.os.SystemClock.elapsedRealtime() - this.startTimeMs < 2000;
        this.transport.schedule(com.google.android.datatransport.Event.ofUrgent(crashlyticsReportWithSessionId.getReport()), new com.google.android.datatransport.TransportScheduleCallback() { // from class: com.google.firebase.crashlytics.internal.send.ReportQueue$$ExternalSyntheticLambda0
            @Override // com.google.android.datatransport.TransportScheduleCallback
            public final void onSchedule(java.lang.Exception exc) {
                this.f$0.m855xc033738(taskCompletionSource, z, crashlyticsReportWithSessionId, exc);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$sendReport$1$com-google-firebase-crashlytics-internal-send-ReportQueue, reason: not valid java name */
    /* synthetic */ void m855xc033738(com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource, boolean z, com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId crashlyticsReportWithSessionId, java.lang.Exception exc) {
        if (exc != null) {
            taskCompletionSource.trySetException(exc);
            return;
        }
        if (z) {
            flushScheduledReportsIfAble();
        }
        taskCompletionSource.trySetResult(crashlyticsReportWithSessionId);
    }

    private boolean isQueueAvailable() {
        return this.queue.size() < this.queueCapacity;
    }

    private boolean isQueueFull() {
        return this.queue.size() == this.queueCapacity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public double calcDelay() {
        return java.lang.Math.min(3600000.0d, (60000.0d / this.ratePerMinute) * java.lang.Math.pow(this.base, calcStep()));
    }

    private int calcStep() {
        int iMax;
        if (this.lastUpdatedMs == 0) {
            this.lastUpdatedMs = now();
        }
        int iNow = (int) ((now() - this.lastUpdatedMs) / this.stepDurationMs);
        if (isQueueFull()) {
            iMax = java.lang.Math.min(100, this.step + iNow);
        } else {
            iMax = java.lang.Math.max(0, this.step - iNow);
        }
        if (this.step != iMax) {
            this.step = iMax;
            this.lastUpdatedMs = now();
        }
        return iMax;
    }

    private long now() {
        return java.lang.System.currentTimeMillis();
    }

    private final class ReportRunnable implements java.lang.Runnable {
        private final com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId reportWithSessionId;
        private final com.google.android.gms.tasks.TaskCompletionSource<com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId> tcs;

        private ReportRunnable(com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId crashlyticsReportWithSessionId, com.google.android.gms.tasks.TaskCompletionSource<com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId> taskCompletionSource) {
            this.reportWithSessionId = crashlyticsReportWithSessionId;
            this.tcs = taskCompletionSource;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.google.firebase.crashlytics.internal.send.ReportQueue.this.sendReport(this.reportWithSessionId, this.tcs);
            com.google.firebase.crashlytics.internal.send.ReportQueue.this.onDemandCounter.resetDroppedOnDemandExceptions();
            double dCalcDelay = com.google.firebase.crashlytics.internal.send.ReportQueue.this.calcDelay();
            com.google.firebase.crashlytics.internal.Logger.getLogger().d("Delay for: " + java.lang.String.format(java.util.Locale.US, "%.2f", java.lang.Double.valueOf(dCalcDelay / 1000.0d)) + " s for report: " + this.reportWithSessionId.getSessionId());
            com.google.firebase.crashlytics.internal.send.ReportQueue.sleep(dCalcDelay);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void sleep(double d) {
        try {
            java.lang.Thread.sleep((long) d);
        } catch (java.lang.InterruptedException unused) {
        }
    }
}
