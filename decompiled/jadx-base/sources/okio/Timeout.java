package okio;

/* JADX INFO: compiled from: Timeout.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\b\u0010\f\u001a\u00020\u0000H\u0016J\b\u0010\r\u001a\u00020\u0000H\u0016J\u0016\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0011J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016J-\u0010\u0012\u001a\u0002H\u0013\"\u0004\b\u0000\u0010\u00132\u0006\u0010\u0014\u001a\u00020\u00002\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00130\u0016H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u0017J\b\u0010\u0018\u001a\u00020\tH\u0016J\u0018\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\u000e\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u0001R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001d"}, d2 = {"Lokio/Timeout;", "", "()V", "deadlineNanoTime", "", "hasDeadline", "", "timeoutNanos", "awaitSignal", "", "condition", "Ljava/util/concurrent/locks/Condition;", "clearDeadline", "clearTimeout", "deadline", "duration", "unit", "Ljava/util/concurrent/TimeUnit;", "intersectWith", "T", "other", "block", "Lkotlin/Function0;", "(Lokio/Timeout;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "throwIfReached", "timeout", "waitUntilNotified", "monitor", "Companion", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class Timeout {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final okio.Timeout.Companion INSTANCE = new okio.Timeout.Companion(null);
    public static final okio.Timeout NONE = new okio.Timeout() { // from class: okio.Timeout$Companion$NONE$1
        @Override // okio.Timeout
        public void throwIfReached() {
        }

        @Override // okio.Timeout
        public okio.Timeout timeout(long timeout, java.util.concurrent.TimeUnit unit) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unit, "unit");
            return this;
        }

        @Override // okio.Timeout
        public okio.Timeout deadlineNanoTime(long deadlineNanoTime) {
            return this;
        }
    };
    private long deadlineNanoTime;
    private boolean hasDeadline;
    private long timeoutNanos;

    public okio.Timeout timeout(long timeout, java.util.concurrent.TimeUnit unit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unit, "unit");
        if (!(timeout >= 0)) {
            throw new java.lang.IllegalArgumentException(("timeout < 0: " + timeout).toString());
        }
        this.timeoutNanos = unit.toNanos(timeout);
        return this;
    }

    /* JADX INFO: renamed from: timeoutNanos, reason: from getter */
    public long getTimeoutNanos() {
        return this.timeoutNanos;
    }

    /* JADX INFO: renamed from: hasDeadline, reason: from getter */
    public boolean getHasDeadline() {
        return this.hasDeadline;
    }

    public long deadlineNanoTime() {
        if (!this.hasDeadline) {
            throw new java.lang.IllegalStateException("No deadline".toString());
        }
        return this.deadlineNanoTime;
    }

    public okio.Timeout deadlineNanoTime(long deadlineNanoTime) {
        this.hasDeadline = true;
        this.deadlineNanoTime = deadlineNanoTime;
        return this;
    }

    public final okio.Timeout deadline(long duration, java.util.concurrent.TimeUnit unit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unit, "unit");
        if (!(duration > 0)) {
            throw new java.lang.IllegalArgumentException(("duration <= 0: " + duration).toString());
        }
        return deadlineNanoTime(java.lang.System.nanoTime() + unit.toNanos(duration));
    }

    public okio.Timeout clearTimeout() {
        this.timeoutNanos = 0L;
        return this;
    }

    public okio.Timeout clearDeadline() {
        this.hasDeadline = false;
        return this;
    }

    public void throwIfReached() throws java.io.IOException {
        if (java.lang.Thread.currentThread().isInterrupted()) {
            throw new java.io.InterruptedIOException("interrupted");
        }
        if (this.hasDeadline && this.deadlineNanoTime - java.lang.System.nanoTime() <= 0) {
            throw new java.io.InterruptedIOException("deadline reached");
        }
    }

    public final void awaitSignal(java.util.concurrent.locks.Condition condition) throws java.io.InterruptedIOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(condition, "condition");
        try {
            boolean hasDeadline = getHasDeadline();
            long timeoutNanos = getTimeoutNanos();
            long jNanoTime = 0;
            if (!hasDeadline && timeoutNanos == 0) {
                condition.await();
                return;
            }
            long jNanoTime2 = java.lang.System.nanoTime();
            if (hasDeadline && timeoutNanos != 0) {
                timeoutNanos = java.lang.Math.min(timeoutNanos, deadlineNanoTime() - jNanoTime2);
            } else if (hasDeadline) {
                timeoutNanos = deadlineNanoTime() - jNanoTime2;
            }
            if (timeoutNanos > 0) {
                condition.await(timeoutNanos, java.util.concurrent.TimeUnit.NANOSECONDS);
                jNanoTime = java.lang.System.nanoTime() - jNanoTime2;
            }
            if (jNanoTime >= timeoutNanos) {
                throw new java.io.InterruptedIOException("timeout");
            }
        } catch (java.lang.InterruptedException unused) {
            java.lang.Thread.currentThread().interrupt();
            throw new java.io.InterruptedIOException("interrupted");
        }
    }

    public final void waitUntilNotified(java.lang.Object monitor) throws java.io.InterruptedIOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(monitor, "monitor");
        try {
            boolean hasDeadline = getHasDeadline();
            long timeoutNanos = getTimeoutNanos();
            long jNanoTime = 0;
            if (!hasDeadline && timeoutNanos == 0) {
                monitor.wait();
                return;
            }
            long jNanoTime2 = java.lang.System.nanoTime();
            if (hasDeadline && timeoutNanos != 0) {
                timeoutNanos = java.lang.Math.min(timeoutNanos, deadlineNanoTime() - jNanoTime2);
            } else if (hasDeadline) {
                timeoutNanos = deadlineNanoTime() - jNanoTime2;
            }
            if (timeoutNanos > 0) {
                long j = timeoutNanos / 1000000;
                monitor.wait(j, (int) (timeoutNanos - (1000000 * j)));
                jNanoTime = java.lang.System.nanoTime() - jNanoTime2;
            }
            if (jNanoTime >= timeoutNanos) {
                throw new java.io.InterruptedIOException("timeout");
            }
        } catch (java.lang.InterruptedException unused) {
            java.lang.Thread.currentThread().interrupt();
            throw new java.io.InterruptedIOException("interrupted");
        }
    }

    public final <T> T intersectWith(okio.Timeout other, kotlin.jvm.functions.Function0<? extends T> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        long timeoutNanos = getTimeoutNanos();
        timeout(INSTANCE.minTimeout(other.getTimeoutNanos(), getTimeoutNanos()), java.util.concurrent.TimeUnit.NANOSECONDS);
        if (getHasDeadline()) {
            long jDeadlineNanoTime = deadlineNanoTime();
            if (other.getHasDeadline()) {
                deadlineNanoTime(java.lang.Math.min(deadlineNanoTime(), other.deadlineNanoTime()));
            }
            try {
                return block.invoke();
            } finally {
                kotlin.jvm.internal.InlineMarker.finallyStart(1);
                timeout(timeoutNanos, java.util.concurrent.TimeUnit.NANOSECONDS);
                if (other.getHasDeadline()) {
                    deadlineNanoTime(jDeadlineNanoTime);
                }
                kotlin.jvm.internal.InlineMarker.finallyEnd(1);
            }
        }
        if (other.getHasDeadline()) {
            deadlineNanoTime(other.deadlineNanoTime());
        }
        try {
            return block.invoke();
        } finally {
            kotlin.jvm.internal.InlineMarker.finallyStart(1);
            timeout(timeoutNanos, java.util.concurrent.TimeUnit.NANOSECONDS);
            if (other.getHasDeadline()) {
                clearDeadline();
            }
            kotlin.jvm.internal.InlineMarker.finallyEnd(1);
        }
    }

    /* JADX INFO: compiled from: Timeout.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lokio/Timeout$Companion;", "", "()V", "NONE", "Lokio/Timeout;", "minTimeout", "", "aNanos", "bNanos", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long minTimeout(long aNanos, long bNanos) {
            return (aNanos != 0 && (bNanos == 0 || aNanos < bNanos)) ? aNanos : bNanos;
        }

        private Companion() {
        }
    }
}
