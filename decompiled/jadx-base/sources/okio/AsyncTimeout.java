package okio;

/* JADX INFO: compiled from: AsyncTimeout.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001b\u001cB\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0001J\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\u0004J\u0012\u0010\u000e\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014J\u0010\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0007H\u0002J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0014J\b\u0010\u0015\u001a\u00020\fH\u0014J%\u0010\u0016\u001a\u0002H\u0017\"\u0004\b\u0000\u0010\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00170\u0019H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u001aR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0000X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001d"}, d2 = {"Lokio/AsyncTimeout;", "Lokio/Timeout;", "()V", "inQueue", "", "next", "timeoutAt", "", "access$newTimeoutException", "Ljava/io/IOException;", "cause", "enter", "", "exit", "newTimeoutException", "remainingNanos", "now", "sink", "Lokio/Sink;", "source", "Lokio/Source;", "timedOut", "withTimeout", "T", "block", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Companion", "Watchdog", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class AsyncTimeout extends okio.Timeout {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final okio.AsyncTimeout.Companion INSTANCE = new okio.AsyncTimeout.Companion(null);
    private static final long IDLE_TIMEOUT_MILLIS;
    private static final long IDLE_TIMEOUT_NANOS;
    private static final int TIMEOUT_WRITE_SIZE = 65536;
    private static final java.util.concurrent.locks.Condition condition;
    private static okio.AsyncTimeout head;
    private static final java.util.concurrent.locks.ReentrantLock lock;
    private boolean inQueue;
    private okio.AsyncTimeout next;
    private long timeoutAt;

    protected void timedOut() {
    }

    public final void enter() {
        long jTimeoutNanos = getTimeoutNanos();
        boolean zHasDeadline = getHasDeadline();
        if (jTimeoutNanos != 0 || zHasDeadline) {
            INSTANCE.scheduleTimeout(this, jTimeoutNanos, zHasDeadline);
        }
    }

    public final boolean exit() {
        return INSTANCE.cancelScheduledTimeout(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long remainingNanos(long now) {
        return this.timeoutAt - now;
    }

    public final okio.Sink sink(final okio.Sink sink) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "sink");
        return new okio.Sink() { // from class: okio.AsyncTimeout.sink.1
            @Override // okio.Sink
            public void write(okio.Buffer source, long byteCount) throws java.io.IOException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
                okio.SegmentedByteString.checkOffsetAndCount(source.size(), 0L, byteCount);
                while (true) {
                    long j = 0;
                    if (byteCount <= 0) {
                        return;
                    }
                    okio.Segment segment = source.head;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
                    while (j < 65536) {
                        j += (long) (segment.limit - segment.pos);
                        if (j >= byteCount) {
                            j = byteCount;
                            break;
                        } else {
                            segment = segment.next;
                            kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
                        }
                    }
                    okio.AsyncTimeout asyncTimeout = okio.AsyncTimeout.this;
                    okio.Sink sink2 = sink;
                    asyncTimeout.enter();
                    try {
                        try {
                            sink2.write(source, j);
                            kotlin.Unit unit = kotlin.Unit.INSTANCE;
                            if (asyncTimeout.exit()) {
                                throw asyncTimeout.access$newTimeoutException(null);
                            }
                            byteCount -= j;
                        } catch (java.io.IOException e) {
                            e = e;
                            if (asyncTimeout.exit()) {
                                e = asyncTimeout.access$newTimeoutException(e);
                            }
                            throw e;
                        }
                    } catch (java.lang.Throwable th) {
                        asyncTimeout.exit();
                        throw th;
                    }
                }
            }

            @Override // okio.Sink, java.io.Flushable
            public void flush() throws java.io.IOException {
                okio.AsyncTimeout asyncTimeout = okio.AsyncTimeout.this;
                okio.Sink sink2 = sink;
                asyncTimeout.enter();
                try {
                    try {
                        sink2.flush();
                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                        if (asyncTimeout.exit()) {
                            throw asyncTimeout.access$newTimeoutException(null);
                        }
                    } catch (java.io.IOException e) {
                        e = e;
                        if (asyncTimeout.exit()) {
                            e = asyncTimeout.access$newTimeoutException(e);
                        }
                        throw e;
                    }
                } catch (java.lang.Throwable th) {
                    asyncTimeout.exit();
                    throw th;
                }
            }

            @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws java.io.IOException {
                okio.AsyncTimeout asyncTimeout = okio.AsyncTimeout.this;
                okio.Sink sink2 = sink;
                asyncTimeout.enter();
                try {
                    try {
                        sink2.close();
                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                        if (asyncTimeout.exit()) {
                            throw asyncTimeout.access$newTimeoutException(null);
                        }
                    } catch (java.io.IOException e) {
                        e = e;
                        if (asyncTimeout.exit()) {
                            e = asyncTimeout.access$newTimeoutException(e);
                        }
                        throw e;
                    }
                } catch (java.lang.Throwable th) {
                    asyncTimeout.exit();
                    throw th;
                }
            }

            @Override // okio.Sink
            /* JADX INFO: renamed from: timeout, reason: from getter */
            public okio.AsyncTimeout getThis$0() {
                return okio.AsyncTimeout.this;
            }

            public java.lang.String toString() {
                return "AsyncTimeout.sink(" + sink + ')';
            }
        };
    }

    public final okio.Source source(final okio.Source source) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        return new okio.Source() { // from class: okio.AsyncTimeout.source.1
            @Override // okio.Source
            public long read(okio.Buffer sink, long byteCount) throws java.io.IOException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "sink");
                okio.AsyncTimeout asyncTimeout = okio.AsyncTimeout.this;
                okio.Source source2 = source;
                asyncTimeout.enter();
                try {
                    try {
                        long j = source2.read(sink, byteCount);
                        if (asyncTimeout.exit()) {
                            throw asyncTimeout.access$newTimeoutException(null);
                        }
                        return j;
                    } catch (java.io.IOException e) {
                        e = e;
                        if (asyncTimeout.exit()) {
                            e = asyncTimeout.access$newTimeoutException(e);
                        }
                        throw e;
                    }
                } catch (java.lang.Throwable th) {
                    asyncTimeout.exit();
                    throw th;
                }
            }

            @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws java.io.IOException {
                okio.AsyncTimeout asyncTimeout = okio.AsyncTimeout.this;
                okio.Source source2 = source;
                asyncTimeout.enter();
                try {
                    try {
                        source2.close();
                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                        if (asyncTimeout.exit()) {
                            throw asyncTimeout.access$newTimeoutException(null);
                        }
                    } catch (java.io.IOException e) {
                        e = e;
                        if (asyncTimeout.exit()) {
                            e = asyncTimeout.access$newTimeoutException(e);
                        }
                        throw e;
                    }
                } catch (java.lang.Throwable th) {
                    asyncTimeout.exit();
                    throw th;
                }
            }

            @Override // okio.Source
            /* JADX INFO: renamed from: timeout, reason: from getter */
            public okio.AsyncTimeout getThis$0() {
                return okio.AsyncTimeout.this;
            }

            public java.lang.String toString() {
                return "AsyncTimeout.source(" + source + ')';
            }
        };
    }

    public final <T> T withTimeout(kotlin.jvm.functions.Function0<? extends T> block) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        enter();
        try {
            try {
                T tInvoke = block.invoke();
                kotlin.jvm.internal.InlineMarker.finallyStart(1);
                if (exit()) {
                    throw access$newTimeoutException(null);
                }
                kotlin.jvm.internal.InlineMarker.finallyEnd(1);
                return tInvoke;
            } catch (java.io.IOException e) {
                e = e;
                if (exit()) {
                    e = access$newTimeoutException(e);
                }
                throw e;
            }
        } catch (java.lang.Throwable th) {
            kotlin.jvm.internal.InlineMarker.finallyStart(1);
            exit();
            kotlin.jvm.internal.InlineMarker.finallyEnd(1);
            throw th;
        }
    }

    public final java.io.IOException access$newTimeoutException(java.io.IOException cause) {
        return newTimeoutException(cause);
    }

    protected java.io.IOException newTimeoutException(java.io.IOException cause) {
        java.io.InterruptedIOException interruptedIOException = new java.io.InterruptedIOException("timeout");
        if (cause != null) {
            interruptedIOException.initCause(cause);
        }
        return interruptedIOException;
    }

    /* JADX INFO: compiled from: AsyncTimeout.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0000¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lokio/AsyncTimeout$Watchdog;", "Ljava/lang/Thread;", "()V", "run", "", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class Watchdog extends java.lang.Thread {
        public Watchdog() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (true) {
                try {
                    java.util.concurrent.locks.ReentrantLock lock = okio.AsyncTimeout.INSTANCE.getLock();
                    lock.lock();
                    try {
                        okio.AsyncTimeout asyncTimeoutAwaitTimeout$okio = okio.AsyncTimeout.INSTANCE.awaitTimeout$okio();
                        if (asyncTimeoutAwaitTimeout$okio == okio.AsyncTimeout.head) {
                            okio.AsyncTimeout.Companion companion = okio.AsyncTimeout.INSTANCE;
                            okio.AsyncTimeout.head = null;
                            lock.unlock();
                            return;
                        } else {
                            kotlin.Unit unit = kotlin.Unit.INSTANCE;
                            lock.unlock();
                            if (asyncTimeoutAwaitTimeout$okio != null) {
                                asyncTimeoutAwaitTimeout$okio.timedOut();
                            }
                        }
                    } catch (java.lang.Throwable th) {
                        lock.unlock();
                        throw th;
                    }
                } catch (java.lang.InterruptedException unused) {
                }
            }
        }
    }

    /* JADX INFO: compiled from: AsyncTimeout.kt */
    @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0012\u001a\u0004\u0018\u00010\rH\u0000¢\u0006\u0002\b\u0013J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\rH\u0002J \u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0015H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001b"}, d2 = {"Lokio/AsyncTimeout$Companion;", "", "()V", "IDLE_TIMEOUT_MILLIS", "", "IDLE_TIMEOUT_NANOS", "TIMEOUT_WRITE_SIZE", "", "condition", "Ljava/util/concurrent/locks/Condition;", "getCondition", "()Ljava/util/concurrent/locks/Condition;", androidx.media3.extractor.text.ttml.TtmlNode.TAG_HEAD, "Lokio/AsyncTimeout;", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "getLock", "()Ljava/util/concurrent/locks/ReentrantLock;", "awaitTimeout", "awaitTimeout$okio", "cancelScheduledTimeout", "", "node", "scheduleTimeout", "", "timeoutNanos", "hasDeadline", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final java.util.concurrent.locks.ReentrantLock getLock() {
            return okio.AsyncTimeout.lock;
        }

        public final java.util.concurrent.locks.Condition getCondition() {
            return okio.AsyncTimeout.condition;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void scheduleTimeout(okio.AsyncTimeout node, long timeoutNanos, boolean hasDeadline) {
            java.util.concurrent.locks.ReentrantLock lock = okio.AsyncTimeout.INSTANCE.getLock();
            lock.lock();
            try {
                if (!node.inQueue) {
                    node.inQueue = true;
                    if (okio.AsyncTimeout.head == null) {
                        okio.AsyncTimeout.Companion companion = okio.AsyncTimeout.INSTANCE;
                        okio.AsyncTimeout.head = new okio.AsyncTimeout();
                        new okio.AsyncTimeout.Watchdog().start();
                    }
                    long jNanoTime = java.lang.System.nanoTime();
                    if (timeoutNanos != 0 && hasDeadline) {
                        node.timeoutAt = java.lang.Math.min(timeoutNanos, node.deadlineNanoTime() - jNanoTime) + jNanoTime;
                    } else if (timeoutNanos != 0) {
                        node.timeoutAt = timeoutNanos + jNanoTime;
                    } else if (hasDeadline) {
                        node.timeoutAt = node.deadlineNanoTime();
                    } else {
                        throw new java.lang.AssertionError();
                    }
                    long jRemainingNanos = node.remainingNanos(jNanoTime);
                    okio.AsyncTimeout asyncTimeout = okio.AsyncTimeout.head;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(asyncTimeout);
                    while (asyncTimeout.next != null) {
                        okio.AsyncTimeout asyncTimeout2 = asyncTimeout.next;
                        kotlin.jvm.internal.Intrinsics.checkNotNull(asyncTimeout2);
                        if (jRemainingNanos < asyncTimeout2.remainingNanos(jNanoTime)) {
                            break;
                        }
                        asyncTimeout = asyncTimeout.next;
                        kotlin.jvm.internal.Intrinsics.checkNotNull(asyncTimeout);
                    }
                    node.next = asyncTimeout.next;
                    asyncTimeout.next = node;
                    if (asyncTimeout == okio.AsyncTimeout.head) {
                        okio.AsyncTimeout.INSTANCE.getCondition().signal();
                    }
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    lock.unlock();
                    return;
                }
                throw new java.lang.IllegalStateException("Unbalanced enter/exit".toString());
            } catch (java.lang.Throwable th) {
                lock.unlock();
                throw th;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean cancelScheduledTimeout(okio.AsyncTimeout node) {
            java.util.concurrent.locks.ReentrantLock lock = okio.AsyncTimeout.INSTANCE.getLock();
            lock.lock();
            try {
                if (!node.inQueue) {
                    return false;
                }
                node.inQueue = false;
                for (okio.AsyncTimeout asyncTimeout = okio.AsyncTimeout.head; asyncTimeout != null; asyncTimeout = asyncTimeout.next) {
                    if (asyncTimeout.next == node) {
                        asyncTimeout.next = node.next;
                        node.next = null;
                        return false;
                    }
                }
                return true;
            } finally {
                lock.unlock();
            }
        }

        public final okio.AsyncTimeout awaitTimeout$okio() throws java.lang.InterruptedException {
            okio.AsyncTimeout asyncTimeout = okio.AsyncTimeout.head;
            kotlin.jvm.internal.Intrinsics.checkNotNull(asyncTimeout);
            okio.AsyncTimeout asyncTimeout2 = asyncTimeout.next;
            if (asyncTimeout2 != null) {
                long jRemainingNanos = asyncTimeout2.remainingNanos(java.lang.System.nanoTime());
                if (jRemainingNanos <= 0) {
                    okio.AsyncTimeout asyncTimeout3 = okio.AsyncTimeout.head;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(asyncTimeout3);
                    asyncTimeout3.next = asyncTimeout2.next;
                    asyncTimeout2.next = null;
                    return asyncTimeout2;
                }
                getCondition().await(jRemainingNanos, java.util.concurrent.TimeUnit.NANOSECONDS);
                return null;
            }
            long jNanoTime = java.lang.System.nanoTime();
            getCondition().await(okio.AsyncTimeout.IDLE_TIMEOUT_MILLIS, java.util.concurrent.TimeUnit.MILLISECONDS);
            okio.AsyncTimeout asyncTimeout4 = okio.AsyncTimeout.head;
            kotlin.jvm.internal.Intrinsics.checkNotNull(asyncTimeout4);
            if (asyncTimeout4.next != null || java.lang.System.nanoTime() - jNanoTime < okio.AsyncTimeout.IDLE_TIMEOUT_NANOS) {
                return null;
            }
            return okio.AsyncTimeout.head;
        }
    }

    static {
        java.util.concurrent.locks.ReentrantLock reentrantLock = new java.util.concurrent.locks.ReentrantLock();
        lock = reentrantLock;
        java.util.concurrent.locks.Condition conditionNewCondition = reentrantLock.newCondition();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(conditionNewCondition, "newCondition(...)");
        condition = conditionNewCondition;
        long millis = java.util.concurrent.TimeUnit.SECONDS.toMillis(60L);
        IDLE_TIMEOUT_MILLIS = millis;
        IDLE_TIMEOUT_NANOS = java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(millis);
    }
}
