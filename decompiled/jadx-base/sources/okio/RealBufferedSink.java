package okio;

/* JADX INFO: compiled from: RealBufferedSink.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0001H\u0016J\b\u0010\u0011\u001a\u00020\u0001H\u0016J\b\u0010\u0012\u001a\u00020\u000fH\u0016J\b\u0010\u0013\u001a\u00020\rH\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u001eH\u0016J \u0010\u001a\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u001bH\u0016J\u0018\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010 \u001a\u00020!H\u0016J\u0010\u0010\u001a\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020#H\u0016J \u0010\u001a\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020#2\u0006\u0010\u001f\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u001bH\u0016J\u0018\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020$2\u0006\u0010 \u001a\u00020!H\u0016J\u0010\u0010%\u001a\u00020!2\u0006\u0010\u001c\u001a\u00020$H\u0016J\u0010\u0010&\u001a\u00020\u00012\u0006\u0010'\u001a\u00020\u001bH\u0016J\u0010\u0010(\u001a\u00020\u00012\u0006\u0010)\u001a\u00020!H\u0016J\u0010\u0010*\u001a\u00020\u00012\u0006\u0010)\u001a\u00020!H\u0016J\u0010\u0010+\u001a\u00020\u00012\u0006\u0010,\u001a\u00020\u001bH\u0016J\u0010\u0010-\u001a\u00020\u00012\u0006\u0010,\u001a\u00020\u001bH\u0016J\u0010\u0010.\u001a\u00020\u00012\u0006\u0010)\u001a\u00020!H\u0016J\u0010\u0010/\u001a\u00020\u00012\u0006\u0010)\u001a\u00020!H\u0016J\u0010\u00100\u001a\u00020\u00012\u0006\u00101\u001a\u00020\u001bH\u0016J\u0010\u00102\u001a\u00020\u00012\u0006\u00101\u001a\u00020\u001bH\u0016J\u0018\u00103\u001a\u00020\u00012\u0006\u00104\u001a\u00020\u00192\u0006\u00105\u001a\u000206H\u0016J(\u00103\u001a\u00020\u00012\u0006\u00104\u001a\u00020\u00192\u0006\u00107\u001a\u00020\u001b2\u0006\u00108\u001a\u00020\u001b2\u0006\u00105\u001a\u000206H\u0016J\u0010\u00109\u001a\u00020\u00012\u0006\u00104\u001a\u00020\u0019H\u0016J \u00109\u001a\u00020\u00012\u0006\u00104\u001a\u00020\u00192\u0006\u00107\u001a\u00020\u001b2\u0006\u00108\u001a\u00020\u001bH\u0016J\u0010\u0010:\u001a\u00020\u00012\u0006\u0010;\u001a\u00020\u001bH\u0016R\u001b\u0010\u0005\u001a\u00020\u00068Ö\u0002X\u0096\u0004¢\u0006\f\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006<"}, d2 = {"Lokio/RealBufferedSink;", "Lokio/BufferedSink;", "sink", "Lokio/Sink;", "(Lokio/Sink;)V", "buffer", "Lokio/Buffer;", "getBuffer$annotations", "()V", "getBuffer", "()Lokio/Buffer;", "bufferField", "closed", "", "close", "", "emit", "emitCompleteSegments", "flush", "isOpen", "outputStream", "Ljava/io/OutputStream;", "timeout", "Lokio/Timeout;", "toString", "", "write", "", "source", "Ljava/nio/ByteBuffer;", "", androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.S_WAVE_OFFSET, "byteCount", "", "byteString", "Lokio/ByteString;", "Lokio/Source;", "writeAll", "writeByte", "b", "writeDecimalLong", "v", "writeHexadecimalUnsignedLong", "writeInt", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, "writeIntLe", "writeLong", "writeLongLe", "writeShort", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_SS, "writeShortLe", "writeString", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_STRING, com.json.zb.M, "Ljava/nio/charset/Charset;", "beginIndex", "endIndex", "writeUtf8", "writeUtf8CodePoint", "codePoint", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class RealBufferedSink implements okio.BufferedSink {
    public final okio.Buffer bufferField;
    public boolean closed;
    public final okio.Sink sink;

    public static /* synthetic */ void getBuffer$annotations() {
    }

    public RealBufferedSink(okio.Sink sink) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "sink");
        this.sink = sink;
        this.bufferField = new okio.Buffer();
    }

    @Override // okio.BufferedSink
    public okio.Buffer getBuffer() {
        return this.bufferField;
    }

    @Override // okio.BufferedSink
    /* JADX INFO: renamed from: buffer, reason: from getter */
    public okio.Buffer getBufferField() {
        return this.bufferField;
    }

    @Override // okio.BufferedSink
    public okio.BufferedSink writeString(java.lang.String string, java.nio.charset.Charset charset) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(string, "string");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "charset");
        if (!(!this.closed)) {
            throw new java.lang.IllegalStateException("closed".toString());
        }
        this.bufferField.writeString(string, charset);
        return emitCompleteSegments();
    }

    @Override // okio.BufferedSink
    public okio.BufferedSink writeString(java.lang.String string, int beginIndex, int endIndex, java.nio.charset.Charset charset) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(string, "string");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "charset");
        if (!(!this.closed)) {
            throw new java.lang.IllegalStateException("closed".toString());
        }
        this.bufferField.writeString(string, beginIndex, endIndex, charset);
        return emitCompleteSegments();
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(java.nio.ByteBuffer source) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        if (!(!this.closed)) {
            throw new java.lang.IllegalStateException("closed".toString());
        }
        int iWrite = this.bufferField.write(source);
        emitCompleteSegments();
        return iWrite;
    }

    @Override // okio.BufferedSink
    public java.io.OutputStream outputStream() {
        return new java.io.OutputStream() { // from class: okio.RealBufferedSink.outputStream.1
            @Override // java.io.OutputStream
            public void write(int b) throws java.io.IOException {
                if (okio.RealBufferedSink.this.closed) {
                    throw new java.io.IOException("closed");
                }
                okio.RealBufferedSink.this.bufferField.writeByte((int) ((byte) b));
                okio.RealBufferedSink.this.emitCompleteSegments();
            }

            @Override // java.io.OutputStream
            public void write(byte[] data, int offset, int byteCount) throws java.io.IOException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
                if (okio.RealBufferedSink.this.closed) {
                    throw new java.io.IOException("closed");
                }
                okio.RealBufferedSink.this.bufferField.write(data, offset, byteCount);
                okio.RealBufferedSink.this.emitCompleteSegments();
            }

            @Override // java.io.OutputStream, java.io.Flushable
            public void flush() throws java.io.IOException {
                if (okio.RealBufferedSink.this.closed) {
                    return;
                }
                okio.RealBufferedSink.this.flush();
            }

            @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws java.lang.Throwable {
                okio.RealBufferedSink.this.close();
            }

            public java.lang.String toString() {
                return okio.RealBufferedSink.this + ".outputStream()";
            }
        };
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.closed;
    }

    @Override // okio.Sink
    public void write(okio.Buffer source, long byteCount) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        if (!(!this.closed)) {
            throw new java.lang.IllegalStateException("closed".toString());
        }
        this.bufferField.write(source, byteCount);
        emitCompleteSegments();
    }

    @Override // okio.BufferedSink
    public okio.BufferedSink write(okio.ByteString byteString) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "byteString");
        if (!(!this.closed)) {
            throw new java.lang.IllegalStateException("closed".toString());
        }
        this.bufferField.write(byteString);
        return emitCompleteSegments();
    }

    @Override // okio.BufferedSink
    public okio.BufferedSink write(okio.ByteString byteString, int offset, int byteCount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "byteString");
        if (!(!this.closed)) {
            throw new java.lang.IllegalStateException("closed".toString());
        }
        this.bufferField.write(byteString, offset, byteCount);
        return emitCompleteSegments();
    }

    @Override // okio.BufferedSink
    public okio.BufferedSink writeUtf8(java.lang.String string) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(string, "string");
        if (!(!this.closed)) {
            throw new java.lang.IllegalStateException("closed".toString());
        }
        this.bufferField.writeUtf8(string);
        return emitCompleteSegments();
    }

    @Override // okio.BufferedSink
    public okio.BufferedSink writeUtf8(java.lang.String string, int beginIndex, int endIndex) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(string, "string");
        if (!(!this.closed)) {
            throw new java.lang.IllegalStateException("closed".toString());
        }
        this.bufferField.writeUtf8(string, beginIndex, endIndex);
        return emitCompleteSegments();
    }

    @Override // okio.BufferedSink
    public okio.BufferedSink writeUtf8CodePoint(int codePoint) {
        if (!(!this.closed)) {
            throw new java.lang.IllegalStateException("closed".toString());
        }
        this.bufferField.writeUtf8CodePoint(codePoint);
        return emitCompleteSegments();
    }

    @Override // okio.BufferedSink
    public okio.BufferedSink write(byte[] source) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        if (!(!this.closed)) {
            throw new java.lang.IllegalStateException("closed".toString());
        }
        this.bufferField.write(source);
        return emitCompleteSegments();
    }

    @Override // okio.BufferedSink
    public okio.BufferedSink write(byte[] source, int offset, int byteCount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        if (!(!this.closed)) {
            throw new java.lang.IllegalStateException("closed".toString());
        }
        this.bufferField.write(source, offset, byteCount);
        return emitCompleteSegments();
    }

    @Override // okio.BufferedSink
    public long writeAll(okio.Source source) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        long j = 0;
        while (true) {
            long j2 = source.read(this.bufferField, 8192L);
            if (j2 == -1) {
                return j;
            }
            j += j2;
            emitCompleteSegments();
        }
    }

    @Override // okio.BufferedSink
    public okio.BufferedSink write(okio.Source source, long byteCount) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        while (byteCount > 0) {
            long j = source.read(this.bufferField, byteCount);
            if (j == -1) {
                throw new java.io.EOFException();
            }
            byteCount -= j;
            emitCompleteSegments();
        }
        return this;
    }

    @Override // okio.BufferedSink
    public okio.BufferedSink writeByte(int b) {
        if (!(!this.closed)) {
            throw new java.lang.IllegalStateException("closed".toString());
        }
        this.bufferField.writeByte(b);
        return emitCompleteSegments();
    }

    @Override // okio.BufferedSink
    public okio.BufferedSink writeShort(int s) {
        if (!(!this.closed)) {
            throw new java.lang.IllegalStateException("closed".toString());
        }
        this.bufferField.writeShort(s);
        return emitCompleteSegments();
    }

    @Override // okio.BufferedSink
    public okio.BufferedSink writeShortLe(int s) {
        if (!(!this.closed)) {
            throw new java.lang.IllegalStateException("closed".toString());
        }
        this.bufferField.writeShortLe(s);
        return emitCompleteSegments();
    }

    @Override // okio.BufferedSink
    public okio.BufferedSink writeInt(int i) {
        if (!(!this.closed)) {
            throw new java.lang.IllegalStateException("closed".toString());
        }
        this.bufferField.writeInt(i);
        return emitCompleteSegments();
    }

    @Override // okio.BufferedSink
    public okio.BufferedSink writeIntLe(int i) {
        if (!(!this.closed)) {
            throw new java.lang.IllegalStateException("closed".toString());
        }
        this.bufferField.writeIntLe(i);
        return emitCompleteSegments();
    }

    @Override // okio.BufferedSink
    public okio.BufferedSink writeLong(long v) {
        if (!(!this.closed)) {
            throw new java.lang.IllegalStateException("closed".toString());
        }
        this.bufferField.writeLong(v);
        return emitCompleteSegments();
    }

    @Override // okio.BufferedSink
    public okio.BufferedSink writeLongLe(long v) {
        if (!(!this.closed)) {
            throw new java.lang.IllegalStateException("closed".toString());
        }
        this.bufferField.writeLongLe(v);
        return emitCompleteSegments();
    }

    @Override // okio.BufferedSink
    public okio.BufferedSink writeDecimalLong(long v) {
        if (!(!this.closed)) {
            throw new java.lang.IllegalStateException("closed".toString());
        }
        this.bufferField.writeDecimalLong(v);
        return emitCompleteSegments();
    }

    @Override // okio.BufferedSink
    public okio.BufferedSink writeHexadecimalUnsignedLong(long v) {
        if (!(!this.closed)) {
            throw new java.lang.IllegalStateException("closed".toString());
        }
        this.bufferField.writeHexadecimalUnsignedLong(v);
        return emitCompleteSegments();
    }

    @Override // okio.BufferedSink
    public okio.BufferedSink emitCompleteSegments() throws java.io.IOException {
        if (!(!this.closed)) {
            throw new java.lang.IllegalStateException("closed".toString());
        }
        long jCompleteSegmentByteCount = this.bufferField.completeSegmentByteCount();
        if (jCompleteSegmentByteCount > 0) {
            this.sink.write(this.bufferField, jCompleteSegmentByteCount);
        }
        return this;
    }

    @Override // okio.BufferedSink
    public okio.BufferedSink emit() throws java.io.IOException {
        if (!(!this.closed)) {
            throw new java.lang.IllegalStateException("closed".toString());
        }
        long size = this.bufferField.size();
        if (size > 0) {
            this.sink.write(this.bufferField, size);
        }
        return this;
    }

    @Override // okio.BufferedSink, okio.Sink, java.io.Flushable
    public void flush() throws java.io.IOException {
        if (!(!this.closed)) {
            throw new java.lang.IllegalStateException("closed".toString());
        }
        if (this.bufferField.size() > 0) {
            okio.Sink sink = this.sink;
            okio.Buffer buffer = this.bufferField;
            sink.write(buffer, buffer.size());
        }
        this.sink.flush();
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.lang.Throwable {
        if (this.closed) {
            return;
        }
        if (this.bufferField.size() > 0) {
            okio.Sink sink = this.sink;
            okio.Buffer buffer = this.bufferField;
            sink.write(buffer, buffer.size());
        }
        th = null;
        try {
            this.sink.close();
        } catch (java.lang.Throwable th) {
            if (th == null) {
                th = th;
            }
        }
        this.closed = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // okio.Sink
    /* JADX INFO: renamed from: timeout */
    public okio.Timeout getTimeout() {
        return this.sink.getTimeout();
    }

    public java.lang.String toString() {
        return "buffer(" + this.sink + ')';
    }
}
