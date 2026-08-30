package okio;

/* JADX INFO: compiled from: Throttler.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u000f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u001d\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\u0014J$\u0010\u0006\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u0004H\u0007J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0019J\u0015\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\u001bJ\f\u0010\u001c\u001a\u00020\u0004*\u00020\u0004H\u0002J\f\u0010\u001d\u001a\u00020\u0004*\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lokio/Throttler;", "", "()V", "allocatedUntil", "", "(J)V", "bytesPerSecond", "condition", "Ljava/util/concurrent/locks/Condition;", "getCondition", "()Ljava/util/concurrent/locks/Condition;", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "getLock", "()Ljava/util/concurrent/locks/ReentrantLock;", "maxByteCount", "waitByteCount", "byteCountOrWaitNanos", "now", "byteCount", "byteCountOrWaitNanos$okio", "", "sink", "Lokio/Sink;", "source", "Lokio/Source;", "take", "take$okio", "bytesToNanos", "nanosToBytes", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Throttler {
    private long allocatedUntil;
    private long bytesPerSecond;
    private final java.util.concurrent.locks.Condition condition;
    private final java.util.concurrent.locks.ReentrantLock lock;
    private long maxByteCount;
    private long waitByteCount;

    public final void bytesPerSecond(long j) {
        bytesPerSecond$default(this, j, 0L, 0L, 6, null);
    }

    public final void bytesPerSecond(long j, long j2) {
        bytesPerSecond$default(this, j, j2, 0L, 4, null);
    }

    public Throttler(long j) {
        this.allocatedUntil = j;
        this.waitByteCount = 8192L;
        this.maxByteCount = 262144L;
        java.util.concurrent.locks.ReentrantLock reentrantLock = new java.util.concurrent.locks.ReentrantLock();
        this.lock = reentrantLock;
        java.util.concurrent.locks.Condition conditionNewCondition = reentrantLock.newCondition();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(conditionNewCondition, "newCondition(...)");
        this.condition = conditionNewCondition;
    }

    public final java.util.concurrent.locks.ReentrantLock getLock() {
        return this.lock;
    }

    public final java.util.concurrent.locks.Condition getCondition() {
        return this.condition;
    }

    public Throttler() {
        this(java.lang.System.nanoTime());
    }

    public static /* synthetic */ void bytesPerSecond$default(okio.Throttler throttler, long j, long j2, long j3, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            j2 = throttler.waitByteCount;
        }
        long j4 = j2;
        if ((i & 4) != 0) {
            j3 = throttler.maxByteCount;
        }
        throttler.bytesPerSecond(j, j4, j3);
    }

    public final void bytesPerSecond(long bytesPerSecond, long waitByteCount, long maxByteCount) {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (!(bytesPerSecond >= 0)) {
                throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(waitByteCount > 0)) {
                throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(maxByteCount >= waitByteCount)) {
                throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
            }
            this.bytesPerSecond = bytesPerSecond;
            this.waitByteCount = waitByteCount;
            this.maxByteCount = maxByteCount;
            this.condition.signalAll();
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            reentrantLock.unlock();
        } catch (java.lang.Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final long take$okio(long byteCount) {
        if (!(byteCount > 0)) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        while (true) {
            try {
                long jByteCountOrWaitNanos$okio = byteCountOrWaitNanos$okio(java.lang.System.nanoTime(), byteCount);
                if (jByteCountOrWaitNanos$okio >= 0) {
                    reentrantLock.unlock();
                    return jByteCountOrWaitNanos$okio;
                }
                this.condition.awaitNanos(-jByteCountOrWaitNanos$okio);
            } catch (java.lang.Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }

    public final long byteCountOrWaitNanos$okio(long now, long byteCount) {
        if (this.bytesPerSecond == 0) {
            return byteCount;
        }
        long jMax = java.lang.Math.max(this.allocatedUntil - now, 0L);
        long jNanosToBytes = this.maxByteCount - nanosToBytes(jMax);
        if (jNanosToBytes >= byteCount) {
            this.allocatedUntil = now + jMax + bytesToNanos(byteCount);
            return byteCount;
        }
        long j = this.waitByteCount;
        if (jNanosToBytes >= j) {
            this.allocatedUntil = now + bytesToNanos(this.maxByteCount);
            return jNanosToBytes;
        }
        long jMin = java.lang.Math.min(j, byteCount);
        long jBytesToNanos = jMax + bytesToNanos(jMin - this.maxByteCount);
        if (jBytesToNanos != 0) {
            return -jBytesToNanos;
        }
        this.allocatedUntil = now + bytesToNanos(this.maxByteCount);
        return jMin;
    }

    private final long nanosToBytes(long j) {
        return (j * this.bytesPerSecond) / androidx.media3.common.C.NANOS_PER_SECOND;
    }

    private final long bytesToNanos(long j) {
        return (j * androidx.media3.common.C.NANOS_PER_SECOND) / this.bytesPerSecond;
    }

    public final okio.Source source(okio.Source source) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        return new okio.ForwardingSource(source) { // from class: okio.Throttler.source.1
            @Override // okio.ForwardingSource, okio.Source
            public long read(okio.Buffer sink, long byteCount) throws java.io.InterruptedIOException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "sink");
                try {
                    return super.read(sink, this.take$okio(byteCount));
                } catch (java.lang.InterruptedException unused) {
                    java.lang.Thread.currentThread().interrupt();
                    throw new java.io.InterruptedIOException("interrupted");
                }
            }
        };
    }

    public final okio.Sink sink(okio.Sink sink) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "sink");
        return new okio.ForwardingSink(sink) { // from class: okio.Throttler.sink.1
            @Override // okio.ForwardingSink, okio.Sink
            public void write(okio.Buffer source, long byteCount) throws java.io.IOException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
                while (byteCount > 0) {
                    try {
                        long jTake$okio = this.take$okio(byteCount);
                        super.write(source, jTake$okio);
                        byteCount -= jTake$okio;
                    } catch (java.lang.InterruptedException unused) {
                        java.lang.Thread.currentThread().interrupt();
                        throw new java.io.InterruptedIOException("interrupted");
                    }
                }
            }
        };
    }
}
