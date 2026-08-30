package okio;

/* JADX INFO: compiled from: JvmOkio.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lokio/OutputStreamSink;", "Lokio/Sink;", "out", "Ljava/io/OutputStream;", "timeout", "Lokio/Timeout;", "(Ljava/io/OutputStream;Lokio/Timeout;)V", "close", "", "flush", "toString", "", "write", "source", "Lokio/Buffer;", "byteCount", "", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class OutputStreamSink implements okio.Sink {
    private final java.io.OutputStream out;
    private final okio.Timeout timeout;

    public OutputStreamSink(java.io.OutputStream out, okio.Timeout timeout) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(out, "out");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeout, "timeout");
        this.out = out;
        this.timeout = timeout;
    }

    @Override // okio.Sink
    public void write(okio.Buffer source, long byteCount) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        okio.SegmentedByteString.checkOffsetAndCount(source.size(), 0L, byteCount);
        while (byteCount > 0) {
            this.timeout.throwIfReached();
            okio.Segment segment = source.head;
            kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
            int iMin = (int) java.lang.Math.min(byteCount, segment.limit - segment.pos);
            this.out.write(segment.data, segment.pos, iMin);
            segment.pos += iMin;
            long j = iMin;
            byteCount -= j;
            source.setSize$okio(source.size() - j);
            if (segment.pos == segment.limit) {
                source.head = segment.pop();
                okio.SegmentPool.recycle(segment);
            }
        }
    }

    @Override // okio.Sink, java.io.Flushable
    public void flush() throws java.io.IOException {
        this.out.flush();
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        this.out.close();
    }

    @Override // okio.Sink
    /* JADX INFO: renamed from: timeout, reason: from getter */
    public okio.Timeout getTimeout() {
        return this.timeout;
    }

    public java.lang.String toString() {
        return "sink(" + this.out + ')';
    }
}
