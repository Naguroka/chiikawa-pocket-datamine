package okio;

/* JADX INFO: compiled from: GzipSource.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\b\u0010\u0014\u001a\u00020\u000eH\u0016J\b\u0010\u0015\u001a\u00020\u000eH\u0002J\b\u0010\u0016\u001a\u00020\u000eH\u0002J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0018H\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0016J \u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u0018H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lokio/GzipSource;", "Lokio/Source;", "source", "(Lokio/Source;)V", "crc", "Ljava/util/zip/CRC32;", "inflater", "Ljava/util/zip/Inflater;", "inflaterSource", "Lokio/InflaterSource;", "section", "", "Lokio/RealBufferedSource;", "checkEqual", "", "name", "", "expected", "", "actual", "close", "consumeHeader", "consumeTrailer", "read", "", "sink", "Lokio/Buffer;", "byteCount", "timeout", "Lokio/Timeout;", "updateCrc", "buffer", androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.S_WAVE_OFFSET, "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class GzipSource implements okio.Source {
    private final java.util.zip.CRC32 crc;
    private final java.util.zip.Inflater inflater;
    private final okio.InflaterSource inflaterSource;
    private byte section;
    private final okio.RealBufferedSource source;

    public GzipSource(okio.Source source) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        okio.RealBufferedSource realBufferedSource = new okio.RealBufferedSource(source);
        this.source = realBufferedSource;
        java.util.zip.Inflater inflater = new java.util.zip.Inflater(true);
        this.inflater = inflater;
        this.inflaterSource = new okio.InflaterSource((okio.BufferedSource) realBufferedSource, inflater);
        this.crc = new java.util.zip.CRC32();
    }

    @Override // okio.Source
    public long read(okio.Buffer sink, long byteCount) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "sink");
        if (!(byteCount >= 0)) {
            throw new java.lang.IllegalArgumentException(("byteCount < 0: " + byteCount).toString());
        }
        if (byteCount == 0) {
            return 0L;
        }
        if (this.section == 0) {
            consumeHeader();
            this.section = (byte) 1;
        }
        if (this.section == 1) {
            long size = sink.size();
            long j = this.inflaterSource.read(sink, byteCount);
            if (j != -1) {
                updateCrc(sink, size, j);
                return j;
            }
            this.section = (byte) 2;
        }
        if (this.section == 2) {
            consumeTrailer();
            this.section = (byte) 3;
            if (!this.source.exhausted()) {
                throw new java.io.IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    private final void consumeHeader() throws java.io.IOException {
        this.source.require(10L);
        byte b = this.source.bufferField.getByte(3L);
        boolean z = ((b >> 1) & 1) == 1;
        if (z) {
            updateCrc(this.source.bufferField, 0L, 10L);
        }
        checkEqual("ID1ID2", 8075, this.source.readShort());
        this.source.skip(8L);
        if (((b >> 2) & 1) == 1) {
            this.source.require(2L);
            if (z) {
                updateCrc(this.source.bufferField, 0L, 2L);
            }
            long shortLe = this.source.bufferField.readShortLe() & kotlin.UShort.MAX_VALUE;
            this.source.require(shortLe);
            if (z) {
                updateCrc(this.source.bufferField, 0L, shortLe);
            }
            this.source.skip(shortLe);
        }
        if (((b >> 3) & 1) == 1) {
            long jIndexOf = this.source.indexOf((byte) 0);
            if (jIndexOf == -1) {
                throw new java.io.EOFException();
            }
            if (z) {
                updateCrc(this.source.bufferField, 0L, jIndexOf + 1);
            }
            this.source.skip(jIndexOf + 1);
        }
        if (((b >> 4) & 1) == 1) {
            long jIndexOf2 = this.source.indexOf((byte) 0);
            if (jIndexOf2 == -1) {
                throw new java.io.EOFException();
            }
            if (z) {
                updateCrc(this.source.bufferField, 0L, jIndexOf2 + 1);
            }
            this.source.skip(jIndexOf2 + 1);
        }
        if (z) {
            checkEqual("FHCRC", this.source.readShortLe(), (short) this.crc.getValue());
            this.crc.reset();
        }
    }

    private final void consumeTrailer() throws java.io.IOException {
        checkEqual("CRC", this.source.readIntLe(), (int) this.crc.getValue());
        checkEqual("ISIZE", this.source.readIntLe(), (int) this.inflater.getBytesWritten());
    }

    @Override // okio.Source
    public okio.Timeout timeout() {
        return this.source.timeout();
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        this.inflaterSource.close();
    }

    private final void updateCrc(okio.Buffer buffer, long offset, long byteCount) {
        okio.Segment segment = buffer.head;
        kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
        while (offset >= segment.limit - segment.pos) {
            offset -= (long) (segment.limit - segment.pos);
            segment = segment.next;
            kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
        }
        while (byteCount > 0) {
            int i = (int) (((long) segment.pos) + offset);
            int iMin = (int) java.lang.Math.min(segment.limit - i, byteCount);
            this.crc.update(segment.data, i, iMin);
            byteCount -= (long) iMin;
            segment = segment.next;
            kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
            offset = 0;
        }
    }

    private final void checkEqual(java.lang.String name, int expected, int actual) throws java.io.IOException {
        if (actual == expected) {
            return;
        }
        java.lang.String str = java.lang.String.format("%s: actual 0x%08x != expected 0x%08x", java.util.Arrays.copyOf(new java.lang.Object[]{name, java.lang.Integer.valueOf(actual), java.lang.Integer.valueOf(expected)}, 3));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "format(this, *args)");
        throw new java.io.IOException(str);
    }
}
