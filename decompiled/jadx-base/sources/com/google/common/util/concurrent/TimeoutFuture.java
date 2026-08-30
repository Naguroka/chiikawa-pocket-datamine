package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
final class TimeoutFuture<V> extends com.google.common.util.concurrent.FluentFuture.TrustedFuture<V> {

    @javax.annotation.CheckForNull
    private com.google.common.util.concurrent.ListenableFuture<V> delegateRef;

    @javax.annotation.CheckForNull
    private java.util.concurrent.ScheduledFuture<?> timer;

    static <V> com.google.common.util.concurrent.ListenableFuture<V> create(com.google.common.util.concurrent.ListenableFuture<V> delegate, long time, java.util.concurrent.TimeUnit unit, java.util.concurrent.ScheduledExecutorService scheduledExecutor) {
        com.google.common.util.concurrent.TimeoutFuture timeoutFuture = new com.google.common.util.concurrent.TimeoutFuture(delegate);
        com.google.common.util.concurrent.TimeoutFuture.Fire fire = new com.google.common.util.concurrent.TimeoutFuture.Fire(timeoutFuture);
        timeoutFuture.timer = scheduledExecutor.schedule(fire, time, unit);
        delegate.addListener(fire, com.google.common.util.concurrent.MoreExecutors.directExecutor());
        return timeoutFuture;
    }

    private TimeoutFuture(com.google.common.util.concurrent.ListenableFuture<V> delegate) {
        this.delegateRef = (com.google.common.util.concurrent.ListenableFuture) com.google.common.base.Preconditions.checkNotNull(delegate);
    }

    private static final class Fire<V> implements java.lang.Runnable {

        @javax.annotation.CheckForNull
        com.google.common.util.concurrent.TimeoutFuture<V> timeoutFutureRef;

        Fire(com.google.common.util.concurrent.TimeoutFuture<V> timeoutFuture) {
            this.timeoutFutureRef = timeoutFuture;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.google.common.util.concurrent.ListenableFuture<? extends V> listenableFuture;
            com.google.common.util.concurrent.TimeoutFuture<V> timeoutFuture = this.timeoutFutureRef;
            if (timeoutFuture == null || (listenableFuture = ((com.google.common.util.concurrent.TimeoutFuture) timeoutFuture).delegateRef) == null) {
                return;
            }
            this.timeoutFutureRef = null;
            if (!listenableFuture.isDone()) {
                try {
                    java.util.concurrent.ScheduledFuture scheduledFuture = ((com.google.common.util.concurrent.TimeoutFuture) timeoutFuture).timer;
                    ((com.google.common.util.concurrent.TimeoutFuture) timeoutFuture).timer = null;
                    java.lang.String str = "Timed out";
                    if (scheduledFuture != null) {
                        try {
                            long jAbs = java.lang.Math.abs(scheduledFuture.getDelay(java.util.concurrent.TimeUnit.MILLISECONDS));
                            if (jAbs > 10) {
                                str = "Timed out (timeout delayed by " + jAbs + " ms after scheduled time)";
                            }
                        } catch (java.lang.Throwable th) {
                            timeoutFuture.setException(new com.google.common.util.concurrent.TimeoutFuture.TimeoutFutureException(str));
                            throw th;
                        }
                    }
                    timeoutFuture.setException(new com.google.common.util.concurrent.TimeoutFuture.TimeoutFutureException(str + ": " + listenableFuture));
                    listenableFuture.cancel(true);
                    return;
                } catch (java.lang.Throwable th2) {
                    listenableFuture.cancel(true);
                    throw th2;
                }
            }
            timeoutFuture.setFuture(listenableFuture);
        }
    }

    private static final class TimeoutFutureException extends java.util.concurrent.TimeoutException {
        private TimeoutFutureException(java.lang.String message) {
            super(message);
        }

        @Override // java.lang.Throwable
        public synchronized java.lang.Throwable fillInStackTrace() {
            setStackTrace(new java.lang.StackTraceElement[0]);
            return this;
        }
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    @javax.annotation.CheckForNull
    protected java.lang.String pendingToString() {
        com.google.common.util.concurrent.ListenableFuture<V> listenableFuture = this.delegateRef;
        java.util.concurrent.ScheduledFuture<?> scheduledFuture = this.timer;
        if (listenableFuture == null) {
            return null;
        }
        java.lang.String str = "inputFuture=[" + listenableFuture + com.ironsource.y8.i.e;
        if (scheduledFuture == null) {
            return str;
        }
        long delay = scheduledFuture.getDelay(java.util.concurrent.TimeUnit.MILLISECONDS);
        return delay > 0 ? str + ", remaining delay=[" + delay + " ms]" : str;
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    protected void afterDone() {
        maybePropagateCancellationTo(this.delegateRef);
        java.util.concurrent.ScheduledFuture<?> scheduledFuture = this.timer;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.delegateRef = null;
        this.timer = null;
    }
}
