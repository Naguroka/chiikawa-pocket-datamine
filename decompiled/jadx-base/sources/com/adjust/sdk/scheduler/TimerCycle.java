package com.adjust.sdk.scheduler;

/* JADX INFO: loaded from: classes3.dex */
public class TimerCycle {
    private java.lang.Runnable command;
    private long cycleDelay;
    private long initialDelay;
    private boolean isPaused = true;
    private com.adjust.sdk.ILogger logger = com.adjust.sdk.AdjustFactory.getLogger();
    private java.lang.String name;
    private com.adjust.sdk.scheduler.FutureScheduler scheduler;
    private java.util.concurrent.ScheduledFuture waitingTask;

    public class a implements java.lang.Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.adjust.sdk.scheduler.TimerCycle.this.logger.verbose("%s fired", com.adjust.sdk.scheduler.TimerCycle.this.name);
            com.adjust.sdk.scheduler.TimerCycle.this.command.run();
        }
    }

    public TimerCycle(java.lang.Runnable runnable, long j, long j2, java.lang.String str) {
        this.scheduler = new com.adjust.sdk.scheduler.SingleThreadFutureScheduler(str, true);
        this.name = str;
        this.command = runnable;
        this.initialDelay = j;
        this.cycleDelay = j2;
        java.text.DecimalFormat decimalFormat = com.adjust.sdk.Util.SecondsDisplayFormat;
        this.logger.verbose("%s configured to fire after %s seconds of starting and cycles every %s seconds", str, decimalFormat.format(j / 1000.0d), decimalFormat.format(j2 / 1000.0d));
    }

    private void cancel(boolean z) {
        java.util.concurrent.ScheduledFuture scheduledFuture = this.waitingTask;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(z);
        }
        this.waitingTask = null;
    }

    public void start() {
        if (!this.isPaused) {
            this.logger.verbose("%s is already started", this.name);
            return;
        }
        this.logger.verbose("%s starting", this.name);
        this.waitingTask = this.scheduler.scheduleFutureWithFixedDelay(new com.adjust.sdk.scheduler.TimerCycle.a(), this.initialDelay, this.cycleDelay);
        this.isPaused = false;
    }

    public void suspend() {
        if (this.isPaused) {
            this.logger.verbose("%s is already suspended", this.name);
            return;
        }
        this.initialDelay = this.waitingTask.getDelay(java.util.concurrent.TimeUnit.MILLISECONDS);
        this.waitingTask.cancel(false);
        this.logger.verbose("%s suspended with %s seconds left", this.name, com.adjust.sdk.Util.SecondsDisplayFormat.format(this.initialDelay / 1000.0d));
        this.isPaused = true;
    }

    public void teardown() {
        cancel(true);
        com.adjust.sdk.scheduler.FutureScheduler futureScheduler = this.scheduler;
        if (futureScheduler != null) {
            futureScheduler.teardown();
        }
        this.scheduler = null;
    }
}
