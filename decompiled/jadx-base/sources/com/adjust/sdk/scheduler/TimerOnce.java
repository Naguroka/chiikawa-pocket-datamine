package com.adjust.sdk.scheduler;

/* JADX INFO: loaded from: classes3.dex */
public class TimerOnce {
    private java.lang.Runnable command;
    private com.adjust.sdk.ILogger logger = com.adjust.sdk.AdjustFactory.getLogger();
    private java.lang.String name;
    private com.adjust.sdk.scheduler.FutureScheduler scheduler;
    private java.util.concurrent.ScheduledFuture waitingTask;

    public class a implements java.lang.Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.adjust.sdk.scheduler.TimerOnce.this.logger.verbose("%s fired", com.adjust.sdk.scheduler.TimerOnce.this.name);
            com.adjust.sdk.scheduler.TimerOnce.this.command.run();
            com.adjust.sdk.scheduler.TimerOnce.this.waitingTask = null;
        }
    }

    public TimerOnce(java.lang.Runnable runnable, java.lang.String str) {
        this.name = str;
        this.scheduler = new com.adjust.sdk.scheduler.SingleThreadFutureScheduler(str, true);
        this.command = runnable;
    }

    public void cancel() {
        cancel(false);
    }

    public long getFireIn() {
        java.util.concurrent.ScheduledFuture scheduledFuture = this.waitingTask;
        if (scheduledFuture == null) {
            return 0L;
        }
        return scheduledFuture.getDelay(java.util.concurrent.TimeUnit.MILLISECONDS);
    }

    public void startIn(long j) {
        cancel(false);
        this.logger.verbose("%s starting. Launching in %s seconds", this.name, com.adjust.sdk.Util.SecondsDisplayFormat.format(j / 1000.0d));
        this.waitingTask = this.scheduler.scheduleFuture(new com.adjust.sdk.scheduler.TimerOnce.a(), j);
    }

    public void teardown() {
        cancel(true);
        com.adjust.sdk.scheduler.FutureScheduler futureScheduler = this.scheduler;
        if (futureScheduler != null) {
            futureScheduler.teardown();
        }
        this.scheduler = null;
    }

    private void cancel(boolean z) {
        java.util.concurrent.ScheduledFuture scheduledFuture = this.waitingTask;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(z);
        }
        this.waitingTask = null;
        this.logger.verbose("%s canceled", this.name);
    }
}
