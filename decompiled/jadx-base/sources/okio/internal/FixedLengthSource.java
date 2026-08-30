package okio.internal;

/* JADX INFO: compiled from: FixedLengthSource.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0005H\u0016J\u0014\u0010\u000e\u001a\u00020\u000f*\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0005H\u0002R\u000e\u0010\t\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lokio/internal/FixedLengthSource;", "Lokio/ForwardingSource;", "delegate", "Lokio/Source;", "size", "", "truncate", "", "(Lokio/Source;JZ)V", "bytesReceived", "read", "sink", "Lokio/Buffer;", "byteCount", "truncateToSize", "", "newSize", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class FixedLengthSource extends okio.ForwardingSource {
    private long bytesReceived;
    private final long size;
    private final boolean truncate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FixedLengthSource(okio.Source delegate, long j, boolean z) {
        super(delegate);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.size = j;
        this.truncate = z;
    }

    @Override // okio.ForwardingSource, okio.Source
    public long read(okio.Buffer sink, long byteCount) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "sink");
        long j = this.bytesReceived;
        long j2 = this.size;
        if (j > j2) {
            byteCount = 0;
        } else if (this.truncate) {
            long j3 = j2 - j;
            if (j3 == 0) {
                return -1L;
            }
            byteCount = java.lang.Math.min(byteCount, j3);
        }
        long j4 = super.read(sink, byteCount);
        if (j4 != -1) {
            this.bytesReceived += j4;
        }
        long j5 = this.bytesReceived;
        long j6 = this.size;
        if ((j5 >= j6 || j4 != -1) && j5 <= j6) {
            return j4;
        }
        if (j4 > 0 && j5 > j6) {
            truncateToSize(sink, sink.size() - (this.bytesReceived - this.size));
        }
        throw new java.io.IOException("expected " + this.size + " bytes but got " + this.bytesReceived);
    }

    private final void truncateToSize(okio.Buffer buffer, long j) throws java.io.IOException {
        okio.Buffer buffer2 = new okio.Buffer();
        buffer2.writeAll(buffer);
        buffer.write(buffer2, j);
        buffer2.clear();
    }
}
