package okio;

/* JADX INFO: compiled from: Pipe.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010)\u001a\u00020*J\u000e\u0010+\u001a\u00020*2\u0006\u0010\u001f\u001a\u00020\u0014J\r\u0010\u001f\u001a\u00020\u0014H\u0007¢\u0006\u0002\b,J\r\u0010#\u001a\u00020$H\u0007¢\u0006\u0002\b-J&\u0010.\u001a\u00020**\u00020\u00142\u0017\u0010/\u001a\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020*00¢\u0006\u0002\b1H\u0082\bR\u0014\u0010\u0005\u001a\u00020\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0019\u001a\u00020\u001a¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u001f\u001a\u00020\u00148G¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u001a\u0010 \u001a\u00020\nX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\f\"\u0004\b\"\u0010\u000eR\u0013\u0010#\u001a\u00020$8G¢\u0006\b\n\u0000\u001a\u0004\b#\u0010%R\u001a\u0010&\u001a\u00020\nX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\f\"\u0004\b(\u0010\u000e¨\u00062"}, d2 = {"Lokio/Pipe;", "", "maxBufferSize", "", "(J)V", "buffer", "Lokio/Buffer;", "getBuffer$okio", "()Lokio/Buffer;", "canceled", "", "getCanceled$okio", "()Z", "setCanceled$okio", "(Z)V", "condition", "Ljava/util/concurrent/locks/Condition;", "getCondition", "()Ljava/util/concurrent/locks/Condition;", "foldedSink", "Lokio/Sink;", "getFoldedSink$okio", "()Lokio/Sink;", "setFoldedSink$okio", "(Lokio/Sink;)V", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "getLock", "()Ljava/util/concurrent/locks/ReentrantLock;", "getMaxBufferSize$okio", "()J", "sink", "sinkClosed", "getSinkClosed$okio", "setSinkClosed$okio", "source", "Lokio/Source;", "()Lokio/Source;", "sourceClosed", "getSourceClosed$okio", "setSourceClosed$okio", "cancel", "", "fold", "-deprecated_sink", "-deprecated_source", "forward", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Pipe {
    private final okio.Buffer buffer = new okio.Buffer();
    private boolean canceled;
    private final java.util.concurrent.locks.Condition condition;
    private okio.Sink foldedSink;
    private final java.util.concurrent.locks.ReentrantLock lock;
    private final long maxBufferSize;
    private final okio.Sink sink;
    private boolean sinkClosed;
    private final okio.Source source;
    private boolean sourceClosed;

    public Pipe(long j) {
        this.maxBufferSize = j;
        java.util.concurrent.locks.ReentrantLock reentrantLock = new java.util.concurrent.locks.ReentrantLock();
        this.lock = reentrantLock;
        java.util.concurrent.locks.Condition conditionNewCondition = reentrantLock.newCondition();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(conditionNewCondition, "newCondition(...)");
        this.condition = conditionNewCondition;
        if (!(j >= 1)) {
            throw new java.lang.IllegalArgumentException(("maxBufferSize < 1: " + j).toString());
        }
        this.sink = new okio.Sink() { // from class: okio.Pipe.sink.1
            private final okio.Timeout timeout = new okio.Timeout();

            @Override // okio.Sink
            public void write(okio.Buffer source, long byteCount) {
                okio.Sink foldedSink;
                boolean hasDeadline;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
                java.util.concurrent.locks.ReentrantLock lock = okio.Pipe.this.getLock();
                okio.Pipe pipe = okio.Pipe.this;
                lock.lock();
                try {
                    if (!(!pipe.getSinkClosed())) {
                        throw new java.lang.IllegalStateException("closed".toString());
                    }
                    if (pipe.getCanceled()) {
                        throw new java.io.IOException("canceled");
                    }
                    while (true) {
                        if (byteCount <= 0) {
                            foldedSink = null;
                            break;
                        }
                        foldedSink = pipe.getFoldedSink();
                        if (foldedSink != null) {
                            break;
                        }
                        if (pipe.getSourceClosed()) {
                            throw new java.io.IOException("source is closed");
                        }
                        long maxBufferSize = pipe.getMaxBufferSize() - pipe.getBuffer().size();
                        if (maxBufferSize == 0) {
                            this.timeout.awaitSignal(pipe.getCondition());
                            if (pipe.getCanceled()) {
                                throw new java.io.IOException("canceled");
                            }
                        } else {
                            long jMin = java.lang.Math.min(maxBufferSize, byteCount);
                            pipe.getBuffer().write(source, jMin);
                            byteCount -= jMin;
                            pipe.getCondition().signalAll();
                        }
                    }
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    lock.unlock();
                    if (foldedSink != null) {
                        okio.Pipe pipe2 = okio.Pipe.this;
                        okio.Timeout timeout = foldedSink.getTimeout();
                        okio.Timeout timeout2 = pipe2.sink().getTimeout();
                        long timeoutNanos = timeout.getTimeoutNanos();
                        timeout.timeout(okio.Timeout.INSTANCE.minTimeout(timeout2.getTimeoutNanos(), timeout.getTimeoutNanos()), java.util.concurrent.TimeUnit.NANOSECONDS);
                        if (timeout.getHasDeadline()) {
                            long jDeadlineNanoTime = timeout.deadlineNanoTime();
                            if (timeout2.getHasDeadline()) {
                                timeout.deadlineNanoTime(java.lang.Math.min(timeout.deadlineNanoTime(), timeout2.deadlineNanoTime()));
                            }
                            try {
                                foldedSink.write(source, byteCount);
                                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                                if (hasDeadline) {
                                    return;
                                } else {
                                    return;
                                }
                            } finally {
                                timeout.timeout(timeoutNanos, java.util.concurrent.TimeUnit.NANOSECONDS);
                                if (timeout2.getHasDeadline()) {
                                    timeout.deadlineNanoTime(jDeadlineNanoTime);
                                }
                            }
                        }
                        if (timeout2.getHasDeadline()) {
                            timeout.deadlineNanoTime(timeout2.deadlineNanoTime());
                        }
                        try {
                            foldedSink.write(source, byteCount);
                            kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                        } finally {
                            timeout.timeout(timeoutNanos, java.util.concurrent.TimeUnit.NANOSECONDS);
                            if (timeout2.getHasDeadline()) {
                                timeout.clearDeadline();
                            }
                        }
                    }
                } catch (java.lang.Throwable th) {
                    lock.unlock();
                    throw th;
                }
            }

            @Override // okio.Sink, java.io.Flushable
            public void flush() {
                boolean hasDeadline;
                java.util.concurrent.locks.ReentrantLock lock = okio.Pipe.this.getLock();
                okio.Pipe pipe = okio.Pipe.this;
                lock.lock();
                try {
                    if (!(!pipe.getSinkClosed())) {
                        throw new java.lang.IllegalStateException("closed".toString());
                    }
                    if (pipe.getCanceled()) {
                        throw new java.io.IOException("canceled");
                    }
                    okio.Sink foldedSink = pipe.getFoldedSink();
                    if (foldedSink == null) {
                        if (pipe.getSourceClosed() && pipe.getBuffer().size() > 0) {
                            throw new java.io.IOException("source is closed");
                        }
                        foldedSink = null;
                    }
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    lock.unlock();
                    if (foldedSink != null) {
                        okio.Pipe pipe2 = okio.Pipe.this;
                        okio.Timeout timeout = foldedSink.getTimeout();
                        okio.Timeout timeout2 = pipe2.sink().getTimeout();
                        long timeoutNanos = timeout.getTimeoutNanos();
                        timeout.timeout(okio.Timeout.INSTANCE.minTimeout(timeout2.getTimeoutNanos(), timeout.getTimeoutNanos()), java.util.concurrent.TimeUnit.NANOSECONDS);
                        if (timeout.getHasDeadline()) {
                            long jDeadlineNanoTime = timeout.deadlineNanoTime();
                            if (timeout2.getHasDeadline()) {
                                timeout.deadlineNanoTime(java.lang.Math.min(timeout.deadlineNanoTime(), timeout2.deadlineNanoTime()));
                            }
                            try {
                                foldedSink.flush();
                                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                                if (hasDeadline) {
                                    return;
                                } else {
                                    return;
                                }
                            } finally {
                                timeout.timeout(timeoutNanos, java.util.concurrent.TimeUnit.NANOSECONDS);
                                if (timeout2.getHasDeadline()) {
                                    timeout.deadlineNanoTime(jDeadlineNanoTime);
                                }
                            }
                        }
                        if (timeout2.getHasDeadline()) {
                            timeout.deadlineNanoTime(timeout2.deadlineNanoTime());
                        }
                        try {
                            foldedSink.flush();
                            kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                        } finally {
                            timeout.timeout(timeoutNanos, java.util.concurrent.TimeUnit.NANOSECONDS);
                            if (timeout2.getHasDeadline()) {
                                timeout.clearDeadline();
                            }
                        }
                    }
                } catch (java.lang.Throwable th) {
                    lock.unlock();
                    throw th;
                }
            }

            @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                boolean hasDeadline;
                java.util.concurrent.locks.ReentrantLock lock = okio.Pipe.this.getLock();
                okio.Pipe pipe = okio.Pipe.this;
                lock.lock();
                try {
                    if (pipe.getSinkClosed()) {
                        lock.unlock();
                        return;
                    }
                    okio.Sink foldedSink = pipe.getFoldedSink();
                    if (foldedSink == null) {
                        if (pipe.getSourceClosed() && pipe.getBuffer().size() > 0) {
                            throw new java.io.IOException("source is closed");
                        }
                        pipe.setSinkClosed$okio(true);
                        pipe.getCondition().signalAll();
                        foldedSink = null;
                    }
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    lock.unlock();
                    if (foldedSink != null) {
                        okio.Pipe pipe2 = okio.Pipe.this;
                        okio.Timeout timeout = foldedSink.getTimeout();
                        okio.Timeout timeout2 = pipe2.sink().getTimeout();
                        long timeoutNanos = timeout.getTimeoutNanos();
                        timeout.timeout(okio.Timeout.INSTANCE.minTimeout(timeout2.getTimeoutNanos(), timeout.getTimeoutNanos()), java.util.concurrent.TimeUnit.NANOSECONDS);
                        if (timeout.getHasDeadline()) {
                            long jDeadlineNanoTime = timeout.deadlineNanoTime();
                            if (timeout2.getHasDeadline()) {
                                timeout.deadlineNanoTime(java.lang.Math.min(timeout.deadlineNanoTime(), timeout2.deadlineNanoTime()));
                            }
                            try {
                                foldedSink.close();
                                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                                if (hasDeadline) {
                                    return;
                                } else {
                                    return;
                                }
                            } finally {
                                timeout.timeout(timeoutNanos, java.util.concurrent.TimeUnit.NANOSECONDS);
                                if (timeout2.getHasDeadline()) {
                                    timeout.deadlineNanoTime(jDeadlineNanoTime);
                                }
                            }
                        }
                        if (timeout2.getHasDeadline()) {
                            timeout.deadlineNanoTime(timeout2.deadlineNanoTime());
                        }
                        try {
                            foldedSink.close();
                            kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                        } finally {
                            timeout.timeout(timeoutNanos, java.util.concurrent.TimeUnit.NANOSECONDS);
                            if (timeout2.getHasDeadline()) {
                                timeout.clearDeadline();
                            }
                        }
                    }
                } catch (java.lang.Throwable th) {
                    lock.unlock();
                    throw th;
                }
            }

            @Override // okio.Sink
            /* JADX INFO: renamed from: timeout, reason: from getter */
            public okio.Timeout getTimeout() {
                return this.timeout;
            }
        };
        this.source = new okio.Source() { // from class: okio.Pipe.source.1
            private final okio.Timeout timeout = new okio.Timeout();

            @Override // okio.Source
            public long read(okio.Buffer sink, long byteCount) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "sink");
                java.util.concurrent.locks.ReentrantLock lock = okio.Pipe.this.getLock();
                okio.Pipe pipe = okio.Pipe.this;
                lock.lock();
                try {
                    if (!(!pipe.getSourceClosed())) {
                        throw new java.lang.IllegalStateException("closed".toString());
                    }
                    if (pipe.getCanceled()) {
                        throw new java.io.IOException("canceled");
                    }
                    while (pipe.getBuffer().size() == 0) {
                        if (pipe.getSinkClosed()) {
                            lock.unlock();
                            return -1L;
                        }
                        this.timeout.awaitSignal(pipe.getCondition());
                        if (pipe.getCanceled()) {
                            throw new java.io.IOException("canceled");
                        }
                    }
                    long j2 = pipe.getBuffer().read(sink, byteCount);
                    pipe.getCondition().signalAll();
                    lock.unlock();
                    return j2;
                } catch (java.lang.Throwable th) {
                    lock.unlock();
                    throw th;
                }
            }

            @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                java.util.concurrent.locks.ReentrantLock lock = okio.Pipe.this.getLock();
                okio.Pipe pipe = okio.Pipe.this;
                lock.lock();
                try {
                    pipe.setSourceClosed$okio(true);
                    pipe.getCondition().signalAll();
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                } finally {
                    lock.unlock();
                }
            }

            @Override // okio.Source
            /* JADX INFO: renamed from: timeout, reason: from getter */
            public okio.Timeout getTimeout() {
                return this.timeout;
            }
        };
    }

    /* JADX INFO: renamed from: getMaxBufferSize$okio, reason: from getter */
    public final long getMaxBufferSize() {
        return this.maxBufferSize;
    }

    /* JADX INFO: renamed from: getBuffer$okio, reason: from getter */
    public final okio.Buffer getBuffer() {
        return this.buffer;
    }

    /* JADX INFO: renamed from: getCanceled$okio, reason: from getter */
    public final boolean getCanceled() {
        return this.canceled;
    }

    public final void setCanceled$okio(boolean z) {
        this.canceled = z;
    }

    /* JADX INFO: renamed from: getSinkClosed$okio, reason: from getter */
    public final boolean getSinkClosed() {
        return this.sinkClosed;
    }

    public final void setSinkClosed$okio(boolean z) {
        this.sinkClosed = z;
    }

    /* JADX INFO: renamed from: getSourceClosed$okio, reason: from getter */
    public final boolean getSourceClosed() {
        return this.sourceClosed;
    }

    public final void setSourceClosed$okio(boolean z) {
        this.sourceClosed = z;
    }

    /* JADX INFO: renamed from: getFoldedSink$okio, reason: from getter */
    public final okio.Sink getFoldedSink() {
        return this.foldedSink;
    }

    public final void setFoldedSink$okio(okio.Sink sink) {
        this.foldedSink = sink;
    }

    public final java.util.concurrent.locks.ReentrantLock getLock() {
        return this.lock;
    }

    public final java.util.concurrent.locks.Condition getCondition() {
        return this.condition;
    }

    public final okio.Sink sink() {
        return this.sink;
    }

    public final okio.Source source() {
        return this.source;
    }

    public final void fold(okio.Sink sink) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "sink");
        while (true) {
            java.util.concurrent.locks.ReentrantLock reentrantLock = this.lock;
            reentrantLock.lock();
            try {
                if (!(this.foldedSink == null)) {
                    throw new java.lang.IllegalStateException("sink already folded".toString());
                }
                if (this.canceled) {
                    this.foldedSink = sink;
                    throw new java.io.IOException("canceled");
                }
                if (this.buffer.exhausted()) {
                    this.sourceClosed = true;
                    this.foldedSink = sink;
                    reentrantLock.unlock();
                    return;
                }
                boolean z = this.sinkClosed;
                okio.Buffer buffer = new okio.Buffer();
                okio.Buffer buffer2 = this.buffer;
                buffer.write(buffer2, buffer2.size());
                this.condition.signalAll();
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                reentrantLock.unlock();
                try {
                    sink.write(buffer, buffer.size());
                    if (z) {
                        sink.close();
                    } else {
                        sink.flush();
                    }
                } catch (java.lang.Throwable th) {
                    java.util.concurrent.locks.ReentrantLock reentrantLock2 = this.lock;
                    reentrantLock2.lock();
                    try {
                        this.sourceClosed = true;
                        this.condition.signalAll();
                        kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                        throw th;
                    } finally {
                        reentrantLock2.unlock();
                    }
                }
            } catch (java.lang.Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        }
    }

    private final void forward(okio.Sink sink, kotlin.jvm.functions.Function1<? super okio.Sink, kotlin.Unit> function1) {
        okio.Timeout timeout = sink.getTimeout();
        okio.Timeout timeout2 = sink().getTimeout();
        long timeoutNanos = timeout.getTimeoutNanos();
        timeout.timeout(okio.Timeout.INSTANCE.minTimeout(timeout2.getTimeoutNanos(), timeout.getTimeoutNanos()), java.util.concurrent.TimeUnit.NANOSECONDS);
        if (timeout.getHasDeadline()) {
            long jDeadlineNanoTime = timeout.deadlineNanoTime();
            if (timeout2.getHasDeadline()) {
                timeout.deadlineNanoTime(java.lang.Math.min(timeout.deadlineNanoTime(), timeout2.deadlineNanoTime()));
            }
            try {
                function1.invoke(sink);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                return;
            } finally {
                kotlin.jvm.internal.InlineMarker.finallyStart(1);
                timeout.timeout(timeoutNanos, java.util.concurrent.TimeUnit.NANOSECONDS);
                if (timeout2.getHasDeadline()) {
                    timeout.deadlineNanoTime(jDeadlineNanoTime);
                }
                kotlin.jvm.internal.InlineMarker.finallyEnd(1);
            }
        }
        if (timeout2.getHasDeadline()) {
            timeout.deadlineNanoTime(timeout2.deadlineNanoTime());
        }
        try {
            function1.invoke(sink);
            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
        } finally {
            kotlin.jvm.internal.InlineMarker.finallyStart(1);
            timeout.timeout(timeoutNanos, java.util.concurrent.TimeUnit.NANOSECONDS);
            if (timeout2.getHasDeadline()) {
                timeout.clearDeadline();
            }
            kotlin.jvm.internal.InlineMarker.finallyEnd(1);
        }
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "sink", imports = {}))
    /* JADX INFO: renamed from: -deprecated_sink, reason: not valid java name and from getter */
    public final okio.Sink getSink() {
        return this.sink;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "source", imports = {}))
    /* JADX INFO: renamed from: -deprecated_source, reason: not valid java name and from getter */
    public final okio.Source getSource() {
        return this.source;
    }

    public final void cancel() {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            this.canceled = true;
            this.buffer.clear();
            this.condition.signalAll();
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }
}
