package okio;

/* JADX INFO: compiled from: Buffer.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002\u0090\u0001B\u0005¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0000H\u0016J\u0006\u0010\u0011\u001a\u00020\u0012J\b\u0010\u0013\u001a\u00020\u0000H\u0016J\b\u0010\u0014\u001a\u00020\u0012H\u0016J\u0006\u0010\u0015\u001a\u00020\fJ\u0006\u0010\u0016\u001a\u00020\u0000J$\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\f2\b\b\u0002\u0010\u001b\u001a\u00020\fH\u0007J\u0018\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u001a\u001a\u00020\fJ \u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\fJ\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\b\u0010 \u001a\u00020\u0000H\u0016J\b\u0010!\u001a\u00020\u0000H\u0016J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0096\u0002J\b\u0010&\u001a\u00020#H\u0016J\b\u0010'\u001a\u00020\u0012H\u0016J\u0016\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\fH\u0087\u0002¢\u0006\u0002\b+J\u0015\u0010+\u001a\u00020)2\u0006\u0010,\u001a\u00020\fH\u0007¢\u0006\u0002\b-J\b\u0010.\u001a\u00020/H\u0016J\u0018\u00100\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u00101\u001a\u00020\u001dH\u0002J\u000e\u00102\u001a\u00020\u001d2\u0006\u00101\u001a\u00020\u001dJ\u000e\u00103\u001a\u00020\u001d2\u0006\u00101\u001a\u00020\u001dJ\u000e\u00104\u001a\u00020\u001d2\u0006\u00101\u001a\u00020\u001dJ\u0010\u00105\u001a\u00020\f2\u0006\u00106\u001a\u00020)H\u0016J\u0018\u00105\u001a\u00020\f2\u0006\u00106\u001a\u00020)2\u0006\u00107\u001a\u00020\fH\u0016J \u00105\u001a\u00020\f2\u0006\u00106\u001a\u00020)2\u0006\u00107\u001a\u00020\f2\u0006\u00108\u001a\u00020\fH\u0016J\u0010\u00105\u001a\u00020\f2\u0006\u00109\u001a\u00020\u001dH\u0016J\u0018\u00105\u001a\u00020\f2\u0006\u00109\u001a\u00020\u001d2\u0006\u00107\u001a\u00020\fH\u0016J\u0010\u0010:\u001a\u00020\f2\u0006\u0010;\u001a\u00020\u001dH\u0016J\u0018\u0010:\u001a\u00020\f2\u0006\u0010;\u001a\u00020\u001d2\u0006\u00107\u001a\u00020\fH\u0016J\b\u0010<\u001a\u00020=H\u0016J\b\u0010>\u001a\u00020#H\u0016J\u0006\u0010?\u001a\u00020\u001dJ\b\u0010@\u001a\u00020\u0019H\u0016J\b\u0010A\u001a\u00020\u0001H\u0016J\u0018\u0010B\u001a\u00020#2\u0006\u0010\u001a\u001a\u00020\f2\u0006\u00109\u001a\u00020\u001dH\u0016J(\u0010B\u001a\u00020#2\u0006\u0010\u001a\u001a\u00020\f2\u0006\u00109\u001a\u00020\u001d2\u0006\u0010C\u001a\u00020/2\u0006\u0010\u001b\u001a\u00020/H\u0016J\u0010\u0010D\u001a\u00020/2\u0006\u0010E\u001a\u00020FH\u0016J\u0010\u0010D\u001a\u00020/2\u0006\u0010E\u001a\u00020GH\u0016J \u0010D\u001a\u00020/2\u0006\u0010E\u001a\u00020G2\u0006\u0010\u001a\u001a\u00020/2\u0006\u0010\u001b\u001a\u00020/H\u0016J\u0018\u0010D\u001a\u00020\f2\u0006\u0010E\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\fH\u0016J\u0010\u0010H\u001a\u00020\f2\u0006\u0010E\u001a\u00020IH\u0016J\u0012\u0010J\u001a\u00020K2\b\b\u0002\u0010L\u001a\u00020KH\u0007J\b\u0010M\u001a\u00020)H\u0016J\b\u0010N\u001a\u00020GH\u0016J\u0010\u0010N\u001a\u00020G2\u0006\u0010\u001b\u001a\u00020\fH\u0016J\b\u0010O\u001a\u00020\u001dH\u0016J\u0010\u0010O\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\fH\u0016J\b\u0010P\u001a\u00020\fH\u0016J\u000e\u0010Q\u001a\u00020\u00002\u0006\u0010R\u001a\u00020=J\u0016\u0010Q\u001a\u00020\u00002\u0006\u0010R\u001a\u00020=2\u0006\u0010\u001b\u001a\u00020\fJ \u0010Q\u001a\u00020\u00122\u0006\u0010R\u001a\u00020=2\u0006\u0010\u001b\u001a\u00020\f2\u0006\u0010S\u001a\u00020#H\u0002J\u0010\u0010T\u001a\u00020\u00122\u0006\u0010E\u001a\u00020GH\u0016J\u0018\u0010T\u001a\u00020\u00122\u0006\u0010E\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\fH\u0016J\b\u0010U\u001a\u00020\fH\u0016J\b\u0010V\u001a\u00020/H\u0016J\b\u0010W\u001a\u00020/H\u0016J\b\u0010X\u001a\u00020\fH\u0016J\b\u0010Y\u001a\u00020\fH\u0016J\b\u0010Z\u001a\u00020[H\u0016J\b\u0010\\\u001a\u00020[H\u0016J\u0010\u0010]\u001a\u00020\u001f2\u0006\u0010^\u001a\u00020_H\u0016J\u0018\u0010]\u001a\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\f2\u0006\u0010^\u001a\u00020_H\u0016J\u0012\u0010`\u001a\u00020K2\b\b\u0002\u0010L\u001a\u00020KH\u0007J\b\u0010a\u001a\u00020\u001fH\u0016J\u0010\u0010a\u001a\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\fH\u0016J\b\u0010b\u001a\u00020/H\u0016J\n\u0010c\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010d\u001a\u00020\u001fH\u0016J\u0010\u0010d\u001a\u00020\u001f2\u0006\u0010e\u001a\u00020\fH\u0016J\u0010\u0010f\u001a\u00020#2\u0006\u0010\u001b\u001a\u00020\fH\u0016J\u0010\u0010g\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\fH\u0016J\u0010\u0010h\u001a\u00020/2\u0006\u0010i\u001a\u00020jH\u0016J\u0006\u0010k\u001a\u00020\u001dJ\u0006\u0010l\u001a\u00020\u001dJ\u0006\u0010m\u001a\u00020\u001dJ\r\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0002\bnJ\u0010\u0010o\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\fH\u0016J\u0006\u0010p\u001a\u00020\u001dJ\u000e\u0010p\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020/J\b\u0010q\u001a\u00020rH\u0016J\b\u0010s\u001a\u00020\u001fH\u0016J\u0015\u0010t\u001a\u00020\n2\u0006\u0010u\u001a\u00020/H\u0000¢\u0006\u0002\bvJ\u0010\u0010w\u001a\u00020/2\u0006\u0010x\u001a\u00020FH\u0016J\u0010\u0010w\u001a\u00020\u00002\u0006\u0010x\u001a\u00020GH\u0016J \u0010w\u001a\u00020\u00002\u0006\u0010x\u001a\u00020G2\u0006\u0010\u001a\u001a\u00020/2\u0006\u0010\u001b\u001a\u00020/H\u0016J\u0018\u0010w\u001a\u00020\u00122\u0006\u0010x\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\fH\u0016J\u0010\u0010w\u001a\u00020\u00002\u0006\u0010y\u001a\u00020\u001dH\u0016J \u0010w\u001a\u00020\u00002\u0006\u0010y\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020/2\u0006\u0010\u001b\u001a\u00020/H\u0016J\u0018\u0010w\u001a\u00020\u00002\u0006\u0010x\u001a\u00020z2\u0006\u0010\u001b\u001a\u00020\fH\u0016J\u0010\u0010{\u001a\u00020\f2\u0006\u0010x\u001a\u00020zH\u0016J\u0010\u0010|\u001a\u00020\u00002\u0006\u00106\u001a\u00020/H\u0016J\u0010\u0010}\u001a\u00020\u00002\u0006\u0010~\u001a\u00020\fH\u0016J\u0010\u0010\u007f\u001a\u00020\u00002\u0006\u0010~\u001a\u00020\fH\u0016J\u0012\u0010\u0080\u0001\u001a\u00020\u00002\u0007\u0010\u0081\u0001\u001a\u00020/H\u0016J\u0012\u0010\u0082\u0001\u001a\u00020\u00002\u0007\u0010\u0081\u0001\u001a\u00020/H\u0016J\u0011\u0010\u0083\u0001\u001a\u00020\u00002\u0006\u0010~\u001a\u00020\fH\u0016J\u0011\u0010\u0084\u0001\u001a\u00020\u00002\u0006\u0010~\u001a\u00020\fH\u0016J\u0012\u0010\u0085\u0001\u001a\u00020\u00002\u0007\u0010\u0086\u0001\u001a\u00020/H\u0016J\u0012\u0010\u0087\u0001\u001a\u00020\u00002\u0007\u0010\u0086\u0001\u001a\u00020/H\u0016J\u001a\u0010\u0088\u0001\u001a\u00020\u00002\u0007\u0010\u0089\u0001\u001a\u00020\u001f2\u0006\u0010^\u001a\u00020_H\u0016J,\u0010\u0088\u0001\u001a\u00020\u00002\u0007\u0010\u0089\u0001\u001a\u00020\u001f2\u0007\u0010\u008a\u0001\u001a\u00020/2\u0007\u0010\u008b\u0001\u001a\u00020/2\u0006\u0010^\u001a\u00020_H\u0016J\u001b\u0010\u008c\u0001\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\fH\u0007J\u0012\u0010\u008d\u0001\u001a\u00020\u00002\u0007\u0010\u0089\u0001\u001a\u00020\u001fH\u0016J$\u0010\u008d\u0001\u001a\u00020\u00002\u0007\u0010\u0089\u0001\u001a\u00020\u001f2\u0007\u0010\u008a\u0001\u001a\u00020/2\u0007\u0010\u008b\u0001\u001a\u00020/H\u0016J\u0012\u0010\u008e\u0001\u001a\u00020\u00002\u0007\u0010\u008f\u0001\u001a\u00020/H\u0016R\u0014\u0010\u0006\u001a\u00020\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0000@\u0000X\u0081\u000e¢\u0006\u0002\n\u0000R&\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f8G@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0091\u0001"}, d2 = {"Lokio/Buffer;", "Lokio/BufferedSource;", "Lokio/BufferedSink;", "", "Ljava/nio/channels/ByteChannel;", "()V", "buffer", "getBuffer", "()Lokio/Buffer;", androidx.media3.extractor.text.ttml.TtmlNode.TAG_HEAD, "Lokio/Segment;", "<set-?>", "", "size", "()J", "setSize$okio", "(J)V", "clear", "", "clone", "close", "completeSegmentByteCount", "copy", "copyTo", "out", "Ljava/io/OutputStream;", androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.S_WAVE_OFFSET, "byteCount", "digest", "Lokio/ByteString;", "algorithm", "", "emit", "emitCompleteSegments", "equals", "", "other", "", "exhausted", "flush", "get", "", "pos", "getByte", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "-deprecated_getByte", "hashCode", "", "hmac", com.ironsource.y8.h.W, "hmacSha1", "hmacSha256", "hmacSha512", "indexOf", "b", "fromIndex", "toIndex", "bytes", "indexOfElement", "targetBytes", "inputStream", "Ljava/io/InputStream;", "isOpen", "md5", "outputStream", "peek", "rangeEquals", "bytesOffset", "read", "sink", "Ljava/nio/ByteBuffer;", "", "readAll", "Lokio/Sink;", "readAndWriteUnsafe", "Lokio/Buffer$UnsafeCursor;", "unsafeCursor", "readByte", "readByteArray", "readByteString", "readDecimalLong", "readFrom", "input", "forever", "readFully", "readHexadecimalUnsignedLong", "readInt", "readIntLe", "readLong", "readLongLe", "readShort", "", "readShortLe", "readString", com.json.zb.M, "Ljava/nio/charset/Charset;", "readUnsafe", "readUtf8", "readUtf8CodePoint", "readUtf8Line", "readUtf8LineStrict", "limit", "request", "require", "select", "options", "Lokio/Options;", "sha1", "sha256", "sha512", "-deprecated_size", "skip", "snapshot", "timeout", "Lokio/Timeout;", "toString", "writableSegment", "minimumCapacity", "writableSegment$okio", "write", "source", "byteString", "Lokio/Source;", "writeAll", "writeByte", "writeDecimalLong", "v", "writeHexadecimalUnsignedLong", "writeInt", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, "writeIntLe", "writeLong", "writeLongLe", "writeShort", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_SS, "writeShortLe", "writeString", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_STRING, "beginIndex", "endIndex", "writeTo", "writeUtf8", "writeUtf8CodePoint", "codePoint", "UnsafeCursor", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Buffer implements okio.BufferedSource, okio.BufferedSink, java.lang.Cloneable, java.nio.channels.ByteChannel {
    public okio.Segment head;
    private long size;

    @Override // okio.BufferedSource, okio.BufferedSink
    /* JADX INFO: renamed from: buffer */
    public okio.Buffer getBufferField() {
        return this;
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public final okio.Buffer copyTo(java.io.OutputStream out) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(out, "out");
        return copyTo$default(this, out, 0L, 0L, 6, (java.lang.Object) null);
    }

    public final okio.Buffer copyTo(java.io.OutputStream out, long j) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(out, "out");
        return copyTo$default(this, out, j, 0L, 4, (java.lang.Object) null);
    }

    @Override // okio.BufferedSink
    public okio.Buffer emit() {
        return this;
    }

    @Override // okio.BufferedSink
    public okio.Buffer emitCompleteSegments() {
        return this;
    }

    @Override // okio.BufferedSink, okio.Sink, java.io.Flushable
    public void flush() {
    }

    @Override // okio.BufferedSource, okio.BufferedSink
    public okio.Buffer getBuffer() {
        return this;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    public final okio.Buffer.UnsafeCursor readAndWriteUnsafe() {
        return readAndWriteUnsafe$default(this, null, 1, null);
    }

    public final okio.Buffer.UnsafeCursor readUnsafe() {
        return readUnsafe$default(this, null, 1, null);
    }

    public final okio.Buffer writeTo(java.io.OutputStream out) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(out, "out");
        return writeTo$default(this, out, 0L, 2, null);
    }

    public final long size() {
        return this.size;
    }

    public final void setSize$okio(long j) {
        this.size = j;
    }

    @Override // okio.BufferedSink
    public java.io.OutputStream outputStream() {
        return new java.io.OutputStream() { // from class: okio.Buffer.outputStream.1
            @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }

            @Override // java.io.OutputStream, java.io.Flushable
            public void flush() {
            }

            @Override // java.io.OutputStream
            public void write(int b) {
                okio.Buffer.this.writeByte(b);
            }

            @Override // java.io.OutputStream
            public void write(byte[] data, int offset, int byteCount) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
                okio.Buffer.this.write(data, offset, byteCount);
            }

            public java.lang.String toString() {
                return okio.Buffer.this + ".outputStream()";
            }
        };
    }

    @Override // okio.BufferedSource
    public boolean exhausted() {
        return this.size == 0;
    }

    @Override // okio.BufferedSource
    public void require(long byteCount) throws java.io.EOFException {
        if (this.size < byteCount) {
            throw new java.io.EOFException();
        }
    }

    @Override // okio.BufferedSource
    public boolean request(long byteCount) {
        return this.size >= byteCount;
    }

    @Override // okio.BufferedSource
    public okio.BufferedSource peek() {
        return okio.Okio.buffer(new okio.PeekSource(this));
    }

    @Override // okio.BufferedSource
    public java.io.InputStream inputStream() {
        return new java.io.InputStream() { // from class: okio.Buffer.inputStream.1
            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }

            @Override // java.io.InputStream
            public int read() {
                if (okio.Buffer.this.size() > 0) {
                    return okio.Buffer.this.readByte() & 255;
                }
                return -1;
            }

            @Override // java.io.InputStream
            public int read(byte[] sink, int offset, int byteCount) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "sink");
                return okio.Buffer.this.read(sink, offset, byteCount);
            }

            @Override // java.io.InputStream
            public int available() {
                return (int) java.lang.Math.min(okio.Buffer.this.size(), Integer.MAX_VALUE);
            }

            public java.lang.String toString() {
                return okio.Buffer.this + ".inputStream()";
            }
        };
    }

    public static /* synthetic */ okio.Buffer.UnsafeCursor readUnsafe$default(okio.Buffer buffer, okio.Buffer.UnsafeCursor unsafeCursor, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            unsafeCursor = okio.SegmentedByteString.getDEFAULT__new_UnsafeCursor();
        }
        return buffer.readUnsafe(unsafeCursor);
    }

    public static /* synthetic */ okio.Buffer.UnsafeCursor readAndWriteUnsafe$default(okio.Buffer buffer, okio.Buffer.UnsafeCursor unsafeCursor, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            unsafeCursor = okio.SegmentedByteString.getDEFAULT__new_UnsafeCursor();
        }
        return buffer.readAndWriteUnsafe(unsafeCursor);
    }

    public static /* synthetic */ okio.Buffer copyTo$default(okio.Buffer buffer, java.io.OutputStream outputStream, long j, long j2, int i, java.lang.Object obj) throws java.io.IOException {
        if ((i & 2) != 0) {
            j = 0;
        }
        long j3 = j;
        if ((i & 4) != 0) {
            j2 = buffer.size - j3;
        }
        return buffer.copyTo(outputStream, j3, j2);
    }

    public final okio.Buffer copyTo(java.io.OutputStream out, long offset, long byteCount) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(out, "out");
        okio.SegmentedByteString.checkOffsetAndCount(this.size, offset, byteCount);
        if (byteCount == 0) {
            return this;
        }
        okio.Segment segment = this.head;
        while (true) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
            if (offset < segment.limit - segment.pos) {
                break;
            }
            offset -= (long) (segment.limit - segment.pos);
            segment = segment.next;
        }
        while (byteCount > 0) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
            int i = (int) (((long) segment.pos) + offset);
            int iMin = (int) java.lang.Math.min(segment.limit - i, byteCount);
            out.write(segment.data, i, iMin);
            byteCount -= (long) iMin;
            segment = segment.next;
            offset = 0;
        }
        return this;
    }

    public static /* synthetic */ okio.Buffer copyTo$default(okio.Buffer buffer, okio.Buffer buffer2, long j, long j2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        return buffer.copyTo(buffer2, j, j2);
    }

    public static /* synthetic */ okio.Buffer copyTo$default(okio.Buffer buffer, okio.Buffer buffer2, long j, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        return buffer.copyTo(buffer2, j);
    }

    public final okio.Buffer copyTo(okio.Buffer out, long offset) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(out, "out");
        return copyTo(out, offset, this.size - offset);
    }

    public static /* synthetic */ okio.Buffer writeTo$default(okio.Buffer buffer, java.io.OutputStream outputStream, long j, int i, java.lang.Object obj) throws java.io.IOException {
        if ((i & 2) != 0) {
            j = buffer.size;
        }
        return buffer.writeTo(outputStream, j);
    }

    public final okio.Buffer writeTo(java.io.OutputStream out, long byteCount) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(out, "out");
        okio.SegmentedByteString.checkOffsetAndCount(this.size, 0L, byteCount);
        okio.Segment segment = this.head;
        while (byteCount > 0) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
            int iMin = (int) java.lang.Math.min(byteCount, segment.limit - segment.pos);
            out.write(segment.data, segment.pos, iMin);
            segment.pos += iMin;
            long j = iMin;
            this.size -= j;
            byteCount -= j;
            if (segment.pos == segment.limit) {
                okio.Segment segmentPop = segment.pop();
                this.head = segmentPop;
                okio.SegmentPool.recycle(segment);
                segment = segmentPop;
            }
        }
        return this;
    }

    public final okio.Buffer readFrom(java.io.InputStream input) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "input");
        readFrom(input, Long.MAX_VALUE, true);
        return this;
    }

    public final okio.Buffer readFrom(java.io.InputStream input, long byteCount) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "input");
        if (!(byteCount >= 0)) {
            throw new java.lang.IllegalArgumentException(("byteCount < 0: " + byteCount).toString());
        }
        readFrom(input, byteCount, false);
        return this;
    }

    private final void readFrom(java.io.InputStream input, long byteCount, boolean forever) throws java.io.IOException {
        while (true) {
            if (byteCount <= 0 && !forever) {
                return;
            }
            okio.Segment segmentWritableSegment$okio = writableSegment$okio(1);
            int i = input.read(segmentWritableSegment$okio.data, segmentWritableSegment$okio.limit, (int) java.lang.Math.min(byteCount, 8192 - segmentWritableSegment$okio.limit));
            if (i == -1) {
                if (segmentWritableSegment$okio.pos == segmentWritableSegment$okio.limit) {
                    this.head = segmentWritableSegment$okio.pop();
                    okio.SegmentPool.recycle(segmentWritableSegment$okio);
                }
                if (!forever) {
                    throw new java.io.EOFException();
                }
                return;
            }
            segmentWritableSegment$okio.limit += i;
            long j = i;
            this.size += j;
            byteCount -= j;
        }
    }

    @Override // okio.BufferedSource
    public short readShortLe() throws java.io.EOFException {
        return okio.SegmentedByteString.reverseBytes(readShort());
    }

    @Override // okio.BufferedSource
    public int readIntLe() throws java.io.EOFException {
        return okio.SegmentedByteString.reverseBytes(readInt());
    }

    @Override // okio.BufferedSource
    public long readLongLe() throws java.io.EOFException {
        return okio.SegmentedByteString.reverseBytes(readLong());
    }

    @Override // okio.BufferedSource
    public java.lang.String readUtf8() {
        return readString(this.size, kotlin.text.Charsets.UTF_8);
    }

    @Override // okio.BufferedSource
    public java.lang.String readUtf8(long byteCount) throws java.io.EOFException {
        return readString(byteCount, kotlin.text.Charsets.UTF_8);
    }

    @Override // okio.BufferedSource
    public java.lang.String readString(java.nio.charset.Charset charset) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "charset");
        return readString(this.size, charset);
    }

    @Override // okio.BufferedSource
    public java.lang.String readString(long byteCount, java.nio.charset.Charset charset) throws java.io.EOFException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "charset");
        if (!(byteCount >= 0 && byteCount <= 2147483647L)) {
            throw new java.lang.IllegalArgumentException(("byteCount: " + byteCount).toString());
        }
        if (this.size < byteCount) {
            throw new java.io.EOFException();
        }
        if (byteCount == 0) {
            return "";
        }
        okio.Segment segment = this.head;
        kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
        if (((long) segment.pos) + byteCount > segment.limit) {
            return new java.lang.String(readByteArray(byteCount), charset);
        }
        int i = (int) byteCount;
        java.lang.String str = new java.lang.String(segment.data, segment.pos, i, charset);
        segment.pos += i;
        this.size -= byteCount;
        if (segment.pos == segment.limit) {
            this.head = segment.pop();
            okio.SegmentPool.recycle(segment);
        }
        return str;
    }

    @Override // okio.BufferedSource
    public java.lang.String readUtf8LineStrict() throws java.io.EOFException {
        return readUtf8LineStrict(Long.MAX_VALUE);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(java.nio.ByteBuffer sink) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "sink");
        okio.Segment segment = this.head;
        if (segment == null) {
            return -1;
        }
        int iMin = java.lang.Math.min(sink.remaining(), segment.limit - segment.pos);
        sink.put(segment.data, segment.pos, iMin);
        segment.pos += iMin;
        this.size -= (long) iMin;
        if (segment.pos == segment.limit) {
            this.head = segment.pop();
            okio.SegmentPool.recycle(segment);
        }
        return iMin;
    }

    @Override // okio.BufferedSink
    public okio.Buffer writeUtf8(java.lang.String string) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(string, "string");
        return writeUtf8(string, 0, string.length());
    }

    @Override // okio.BufferedSink
    public okio.Buffer writeString(java.lang.String string, java.nio.charset.Charset charset) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(string, "string");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "charset");
        return writeString(string, 0, string.length(), charset);
    }

    @Override // okio.BufferedSink
    public okio.Buffer writeString(java.lang.String string, int beginIndex, int endIndex, java.nio.charset.Charset charset) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(string, "string");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "charset");
        if (!(beginIndex >= 0)) {
            throw new java.lang.IllegalArgumentException(("beginIndex < 0: " + beginIndex).toString());
        }
        if (!(endIndex >= beginIndex)) {
            throw new java.lang.IllegalArgumentException(("endIndex < beginIndex: " + endIndex + " < " + beginIndex).toString());
        }
        if (!(endIndex <= string.length())) {
            throw new java.lang.IllegalArgumentException(("endIndex > string.length: " + endIndex + " > " + string.length()).toString());
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(charset, kotlin.text.Charsets.UTF_8)) {
            return writeUtf8(string, beginIndex, endIndex);
        }
        java.lang.String strSubstring = string.substring(beginIndex, endIndex);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        byte[] bytes = strSubstring.getBytes(charset);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        return write(bytes, 0, bytes.length);
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(java.nio.ByteBuffer source) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        int iRemaining = source.remaining();
        int i = iRemaining;
        while (i > 0) {
            okio.Segment segmentWritableSegment$okio = writableSegment$okio(1);
            int iMin = java.lang.Math.min(i, 8192 - segmentWritableSegment$okio.limit);
            source.get(segmentWritableSegment$okio.data, segmentWritableSegment$okio.limit, iMin);
            i -= iMin;
            segmentWritableSegment$okio.limit += iMin;
        }
        this.size += (long) iRemaining;
        return iRemaining;
    }

    @Override // okio.BufferedSink
    public okio.Buffer writeShortLe(int s) {
        return writeShort((int) okio.SegmentedByteString.reverseBytes((short) s));
    }

    @Override // okio.BufferedSink
    public okio.Buffer writeIntLe(int i) {
        return writeInt(okio.SegmentedByteString.reverseBytes(i));
    }

    @Override // okio.BufferedSink
    public okio.Buffer writeLongLe(long v) {
        return writeLong(okio.SegmentedByteString.reverseBytes(v));
    }

    @Override // okio.BufferedSource
    public long indexOf(byte b) {
        return indexOf(b, 0L, Long.MAX_VALUE);
    }

    @Override // okio.BufferedSource
    public long indexOf(byte b, long fromIndex) {
        return indexOf(b, fromIndex, Long.MAX_VALUE);
    }

    @Override // okio.BufferedSource
    public long indexOf(okio.ByteString bytes) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bytes, "bytes");
        return indexOf(bytes, 0L);
    }

    @Override // okio.BufferedSource
    public long indexOfElement(okio.ByteString targetBytes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        return indexOfElement(targetBytes, 0L);
    }

    @Override // okio.BufferedSource
    public boolean rangeEquals(long offset, okio.ByteString bytes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bytes, "bytes");
        return rangeEquals(offset, bytes, 0, bytes.size());
    }

    @Override // okio.Source
    public okio.Timeout timeout() {
        return okio.Timeout.NONE;
    }

    public final okio.ByteString md5() {
        return digest("MD5");
    }

    public final okio.ByteString sha1() {
        return digest(com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1);
    }

    public final okio.ByteString sha256() {
        return digest("SHA-256");
    }

    public final okio.ByteString sha512() {
        return digest("SHA-512");
    }

    private final okio.ByteString digest(java.lang.String algorithm) throws java.security.NoSuchAlgorithmException {
        java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance(algorithm);
        okio.Segment segment = this.head;
        if (segment != null) {
            messageDigest.update(segment.data, segment.pos, segment.limit - segment.pos);
            okio.Segment segment2 = segment.next;
            kotlin.jvm.internal.Intrinsics.checkNotNull(segment2);
            while (segment2 != segment) {
                messageDigest.update(segment2.data, segment2.pos, segment2.limit - segment2.pos);
                segment2 = segment2.next;
                kotlin.jvm.internal.Intrinsics.checkNotNull(segment2);
            }
        }
        byte[] bArrDigest = messageDigest.digest();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bArrDigest, "digest(...)");
        return new okio.ByteString(bArrDigest);
    }

    public final okio.ByteString hmacSha1(okio.ByteString key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        return hmac("HmacSHA1", key);
    }

    public final okio.ByteString hmacSha256(okio.ByteString key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        return hmac("HmacSHA256", key);
    }

    public final okio.ByteString hmacSha512(okio.ByteString key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        return hmac("HmacSHA512", key);
    }

    private final okio.ByteString hmac(java.lang.String algorithm, okio.ByteString key) throws java.security.NoSuchAlgorithmException {
        try {
            javax.crypto.Mac mac = javax.crypto.Mac.getInstance(algorithm);
            mac.init(new javax.crypto.spec.SecretKeySpec(key.internalArray$okio(), algorithm));
            okio.Segment segment = this.head;
            if (segment != null) {
                mac.update(segment.data, segment.pos, segment.limit - segment.pos);
                okio.Segment segment2 = segment.next;
                kotlin.jvm.internal.Intrinsics.checkNotNull(segment2);
                while (segment2 != segment) {
                    mac.update(segment2.data, segment2.pos, segment2.limit - segment2.pos);
                    segment2 = segment2.next;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(segment2);
                }
            }
            byte[] bArrDoFinal = mac.doFinal();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bArrDoFinal, "doFinal(...)");
            return new okio.ByteString(bArrDoFinal);
        } catch (java.security.InvalidKeyException e) {
            throw new java.lang.IllegalArgumentException(e);
        }
    }

    public java.lang.String toString() {
        return snapshot().toString();
    }

    public okio.Buffer clone() {
        return copy();
    }

    public final okio.Buffer.UnsafeCursor readUnsafe(okio.Buffer.UnsafeCursor unsafeCursor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unsafeCursor, "unsafeCursor");
        return okio.internal.Buffer.commonReadUnsafe(this, unsafeCursor);
    }

    public final okio.Buffer.UnsafeCursor readAndWriteUnsafe(okio.Buffer.UnsafeCursor unsafeCursor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unsafeCursor, "unsafeCursor");
        return okio.internal.Buffer.commonReadAndWriteUnsafe(this, unsafeCursor);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to operator function", replaceWith = @kotlin.ReplaceWith(expression = "this[index]", imports = {}))
    /* JADX INFO: renamed from: -deprecated_getByte, reason: not valid java name */
    public final byte m3010deprecated_getByte(long index) {
        return getByte(index);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "size", imports = {}))
    /* JADX INFO: renamed from: -deprecated_size, reason: not valid java name and from getter */
    public final long getSize() {
        return this.size;
    }

    /* JADX INFO: compiled from: Buffer.kt */
    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u000e\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\bJ\u0006\u0010\u0018\u001a\u00020\bJ\u000e\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\nJ\u000e\u0010\u001b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0012\u0010\u0013\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lokio/Buffer$UnsafeCursor;", "Ljava/io/Closeable;", "()V", "buffer", "Lokio/Buffer;", "data", "", androidx.media3.extractor.text.ttml.TtmlNode.END, "", androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.S_WAVE_OFFSET, "", "readWrite", "", com.json.y3.i, "Lokio/Segment;", "getSegment$okio", "()Lokio/Segment;", "setSegment$okio", "(Lokio/Segment;)V", androidx.media3.extractor.text.ttml.TtmlNode.START, "close", "", "expandBuffer", "minByteCount", "next", "resizeBuffer", "newSize", "seek", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class UnsafeCursor implements java.io.Closeable {
        public okio.Buffer buffer;
        public byte[] data;
        public boolean readWrite;
        private okio.Segment segment;
        public long offset = -1;
        public int start = -1;
        public int end = -1;

        /* JADX INFO: renamed from: getSegment$okio, reason: from getter */
        public final okio.Segment getSegment() {
            return this.segment;
        }

        public final void setSegment$okio(okio.Segment segment) {
            this.segment = segment;
        }

        public final int next() {
            long j = this.offset;
            okio.Buffer buffer = this.buffer;
            kotlin.jvm.internal.Intrinsics.checkNotNull(buffer);
            if (!(j != buffer.size())) {
                throw new java.lang.IllegalStateException("no more bytes".toString());
            }
            long j2 = this.offset;
            return seek(j2 == -1 ? 0L : j2 + ((long) (this.end - this.start)));
        }

        public final int seek(long offset) {
            okio.Buffer buffer = this.buffer;
            if (buffer == null) {
                throw new java.lang.IllegalStateException("not attached to a buffer".toString());
            }
            if (offset < -1 || offset > buffer.size()) {
                throw new java.lang.ArrayIndexOutOfBoundsException("offset=" + offset + " > size=" + buffer.size());
            }
            if (offset == -1 || offset == buffer.size()) {
                setSegment$okio(null);
                this.offset = offset;
                this.data = null;
                this.start = -1;
                this.end = -1;
                return -1;
            }
            long size = buffer.size();
            okio.Segment segmentPush = buffer.head;
            okio.Segment segment = buffer.head;
            long j = 0;
            if (getSegment() != null) {
                long j2 = this.offset;
                int i = this.start;
                okio.Segment segment2 = getSegment();
                kotlin.jvm.internal.Intrinsics.checkNotNull(segment2);
                long j3 = j2 - ((long) (i - segment2.pos));
                if (j3 > offset) {
                    segment = getSegment();
                    size = j3;
                } else {
                    segmentPush = getSegment();
                    j = j3;
                }
            }
            if (size - offset > offset - j) {
                while (true) {
                    kotlin.jvm.internal.Intrinsics.checkNotNull(segmentPush);
                    if (offset < ((long) (segmentPush.limit - segmentPush.pos)) + j) {
                        break;
                    }
                    j += (long) (segmentPush.limit - segmentPush.pos);
                    segmentPush = segmentPush.next;
                }
            } else {
                while (size > offset) {
                    kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
                    segment = segment.prev;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
                    size -= (long) (segment.limit - segment.pos);
                }
                j = size;
                segmentPush = segment;
            }
            if (this.readWrite) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(segmentPush);
                if (segmentPush.shared) {
                    okio.Segment segmentUnsharedCopy = segmentPush.unsharedCopy();
                    if (buffer.head == segmentPush) {
                        buffer.head = segmentUnsharedCopy;
                    }
                    segmentPush = segmentPush.push(segmentUnsharedCopy);
                    okio.Segment segment3 = segmentPush.prev;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(segment3);
                    segment3.pop();
                }
            }
            setSegment$okio(segmentPush);
            this.offset = offset;
            kotlin.jvm.internal.Intrinsics.checkNotNull(segmentPush);
            this.data = segmentPush.data;
            this.start = segmentPush.pos + ((int) (offset - j));
            int i2 = segmentPush.limit;
            this.end = i2;
            return i2 - this.start;
        }

        public final long resizeBuffer(long newSize) {
            okio.Buffer buffer = this.buffer;
            if (buffer == null) {
                throw new java.lang.IllegalStateException("not attached to a buffer".toString());
            }
            if (!this.readWrite) {
                throw new java.lang.IllegalStateException("resizeBuffer() only permitted for read/write buffers".toString());
            }
            long size = buffer.size();
            int i = 1;
            if (newSize <= size) {
                if (!(newSize >= 0)) {
                    throw new java.lang.IllegalArgumentException(("newSize < 0: " + newSize).toString());
                }
                long j = size - newSize;
                while (j > 0) {
                    okio.Segment segment = buffer.head;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
                    okio.Segment segment2 = segment.prev;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(segment2);
                    long j2 = segment2.limit - segment2.pos;
                    if (j2 <= j) {
                        buffer.head = segment2.pop();
                        okio.SegmentPool.recycle(segment2);
                        j -= j2;
                    } else {
                        segment2.limit -= (int) j;
                        break;
                    }
                }
                setSegment$okio(null);
                this.offset = newSize;
                this.data = null;
                this.start = -1;
                this.end = -1;
            } else if (newSize > size) {
                long j3 = newSize - size;
                boolean z = true;
                while (j3 > 0) {
                    okio.Segment segmentWritableSegment$okio = buffer.writableSegment$okio(i);
                    int iMin = (int) java.lang.Math.min(j3, 8192 - segmentWritableSegment$okio.limit);
                    segmentWritableSegment$okio.limit += iMin;
                    j3 -= (long) iMin;
                    if (z) {
                        setSegment$okio(segmentWritableSegment$okio);
                        this.offset = size;
                        this.data = segmentWritableSegment$okio.data;
                        this.start = segmentWritableSegment$okio.limit - iMin;
                        this.end = segmentWritableSegment$okio.limit;
                        z = false;
                    }
                    i = 1;
                }
            }
            buffer.setSize$okio(newSize);
            return size;
        }

        public final long expandBuffer(int minByteCount) {
            if (!(minByteCount > 0)) {
                throw new java.lang.IllegalArgumentException(("minByteCount <= 0: " + minByteCount).toString());
            }
            if (!(minByteCount <= 8192)) {
                throw new java.lang.IllegalArgumentException(("minByteCount > Segment.SIZE: " + minByteCount).toString());
            }
            okio.Buffer buffer = this.buffer;
            if (buffer == null) {
                throw new java.lang.IllegalStateException("not attached to a buffer".toString());
            }
            if (!this.readWrite) {
                throw new java.lang.IllegalStateException("expandBuffer() only permitted for read/write buffers".toString());
            }
            long size = buffer.size();
            okio.Segment segmentWritableSegment$okio = buffer.writableSegment$okio(minByteCount);
            int i = 8192 - segmentWritableSegment$okio.limit;
            segmentWritableSegment$okio.limit = 8192;
            long j = i;
            buffer.setSize$okio(size + j);
            setSegment$okio(segmentWritableSegment$okio);
            this.offset = size;
            this.data = segmentWritableSegment$okio.data;
            this.start = 8192 - i;
            this.end = 8192;
            return j;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (!(this.buffer != null)) {
                throw new java.lang.IllegalStateException("not attached to a buffer".toString());
            }
            this.buffer = null;
            setSegment$okio(null);
            this.offset = -1L;
            this.data = null;
            this.start = -1;
            this.end = -1;
        }
    }

    public final okio.Buffer copyTo(okio.Buffer out, long offset, long byteCount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(out, "out");
        okio.SegmentedByteString.checkOffsetAndCount(size(), offset, byteCount);
        if (byteCount != 0) {
            out.setSize$okio(out.size() + byteCount);
            okio.Segment segment = this.head;
            while (true) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
                if (offset < segment.limit - segment.pos) {
                    break;
                }
                offset -= (long) (segment.limit - segment.pos);
                segment = segment.next;
            }
            while (byteCount > 0) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
                okio.Segment segmentSharedCopy = segment.sharedCopy();
                segmentSharedCopy.pos += (int) offset;
                segmentSharedCopy.limit = java.lang.Math.min(segmentSharedCopy.pos + ((int) byteCount), segmentSharedCopy.limit);
                okio.Segment segment2 = out.head;
                if (segment2 == null) {
                    segmentSharedCopy.prev = segmentSharedCopy;
                    segmentSharedCopy.next = segmentSharedCopy.prev;
                    out.head = segmentSharedCopy.next;
                } else {
                    kotlin.jvm.internal.Intrinsics.checkNotNull(segment2);
                    okio.Segment segment3 = segment2.prev;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(segment3);
                    segment3.push(segmentSharedCopy);
                }
                byteCount -= (long) (segmentSharedCopy.limit - segmentSharedCopy.pos);
                segment = segment.next;
                offset = 0;
            }
        }
        return this;
    }

    public final long completeSegmentByteCount() {
        long size = size();
        if (size == 0) {
            return 0L;
        }
        okio.Segment segment = this.head;
        kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
        okio.Segment segment2 = segment.prev;
        kotlin.jvm.internal.Intrinsics.checkNotNull(segment2);
        if (segment2.limit < 8192 && segment2.owner) {
            size -= (long) (segment2.limit - segment2.pos);
        }
        return size;
    }

    @Override // okio.BufferedSource
    public byte readByte() throws java.io.EOFException {
        if (size() == 0) {
            throw new java.io.EOFException();
        }
        okio.Segment segment = this.head;
        kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
        int i = segment.pos;
        int i2 = segment.limit;
        int i3 = i + 1;
        byte b = segment.data[i];
        setSize$okio(size() - 1);
        if (i3 == i2) {
            this.head = segment.pop();
            okio.SegmentPool.recycle(segment);
        } else {
            segment.pos = i3;
        }
        return b;
    }

    public final byte getByte(long pos) {
        okio.SegmentedByteString.checkOffsetAndCount(size(), pos, 1L);
        okio.Segment segment = this.head;
        if (segment == null) {
            okio.Segment segment2 = null;
            kotlin.jvm.internal.Intrinsics.checkNotNull(null);
            byte[] bArr = segment2.data;
            throw null;
        }
        if (size() - pos < pos) {
            long size = size();
            while (size > pos) {
                segment = segment.prev;
                kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
                size -= (long) (segment.limit - segment.pos);
            }
            kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
            return segment.data[(int) ((((long) segment.pos) + pos) - size)];
        }
        long j = 0;
        while (true) {
            long j2 = ((long) (segment.limit - segment.pos)) + j;
            if (j2 > pos) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
                return segment.data[(int) ((((long) segment.pos) + pos) - j)];
            }
            segment = segment.next;
            kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
            j = j2;
        }
    }

    @Override // okio.BufferedSource
    public short readShort() throws java.io.EOFException {
        if (size() < 2) {
            throw new java.io.EOFException();
        }
        okio.Segment segment = this.head;
        kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
        int i = segment.pos;
        int i2 = segment.limit;
        if (i2 - i < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        byte[] bArr = segment.data;
        int i3 = i + 1;
        int i4 = i3 + 1;
        int i5 = ((bArr[i] & 255) << 8) | (bArr[i3] & 255);
        setSize$okio(size() - 2);
        if (i4 == i2) {
            this.head = segment.pop();
            okio.SegmentPool.recycle(segment);
        } else {
            segment.pos = i4;
        }
        return (short) i5;
    }

    @Override // okio.BufferedSource
    public int readInt() throws java.io.EOFException {
        if (size() < 4) {
            throw new java.io.EOFException();
        }
        okio.Segment segment = this.head;
        kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
        int i = segment.pos;
        int i2 = segment.limit;
        if (i2 - i < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = segment.data;
        int i3 = i + 1;
        int i4 = i3 + 1;
        int i5 = ((bArr[i] & 255) << 24) | ((bArr[i3] & 255) << 16);
        int i6 = i4 + 1;
        int i7 = i5 | ((bArr[i4] & 255) << 8);
        int i8 = i6 + 1;
        int i9 = i7 | (bArr[i6] & 255);
        setSize$okio(size() - 4);
        if (i8 == i2) {
            this.head = segment.pop();
            okio.SegmentPool.recycle(segment);
        } else {
            segment.pos = i8;
        }
        return i9;
    }

    @Override // okio.BufferedSource
    public long readLong() throws java.io.EOFException {
        if (size() < 8) {
            throw new java.io.EOFException();
        }
        okio.Segment segment = this.head;
        kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
        int i = segment.pos;
        int i2 = segment.limit;
        if (i2 - i < 8) {
            return ((((long) readInt()) & androidx.media3.muxer.Mp4Utils.UNSIGNED_INT_MAX_VALUE) << 32) | (androidx.media3.muxer.Mp4Utils.UNSIGNED_INT_MAX_VALUE & ((long) readInt()));
        }
        byte[] bArr = segment.data;
        int i3 = i + 1;
        long j = (((long) bArr[i]) & 255) << 56;
        int i4 = i3 + 1;
        int i5 = i4 + 1;
        long j2 = j | ((((long) bArr[i3]) & 255) << 48) | ((((long) bArr[i4]) & 255) << 40);
        int i6 = i5 + 1;
        int i7 = i6 + 1;
        long j3 = j2 | ((((long) bArr[i5]) & 255) << 32) | ((((long) bArr[i6]) & 255) << 24);
        int i8 = i7 + 1;
        long j4 = j3 | ((((long) bArr[i7]) & 255) << 16);
        int i9 = i8 + 1;
        long j5 = j4 | ((((long) bArr[i8]) & 255) << 8);
        int i10 = i9 + 1;
        long j6 = j5 | (((long) bArr[i9]) & 255);
        setSize$okio(size() - 8);
        if (i10 == i2) {
            this.head = segment.pop();
            okio.SegmentPool.recycle(segment);
        } else {
            segment.pos = i10;
        }
        return j6;
    }

    @Override // okio.BufferedSource
    public long readDecimalLong() throws java.io.EOFException {
        if (size() == 0) {
            throw new java.io.EOFException();
        }
        int i = 0;
        boolean z = false;
        long j = 0;
        long j2 = -7;
        boolean z2 = false;
        do {
            okio.Segment segment = this.head;
            kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
            byte[] bArr = segment.data;
            int i2 = segment.pos;
            int i3 = segment.limit;
            while (i2 < i3) {
                byte b = bArr[i2];
                if (b >= 48 && b <= 57) {
                    int i4 = 48 - b;
                    if (j < okio.internal.Buffer.OVERFLOW_ZONE || (j == okio.internal.Buffer.OVERFLOW_ZONE && i4 < j2)) {
                        okio.Buffer bufferWriteByte = new okio.Buffer().writeDecimalLong(j).writeByte((int) b);
                        if (!z) {
                            bufferWriteByte.readByte();
                        }
                        throw new java.lang.NumberFormatException("Number too large: " + bufferWriteByte.readUtf8());
                    }
                    j = (j * 10) + ((long) i4);
                } else {
                    if (b != 45 || i != 0) {
                        z2 = true;
                        break;
                    }
                    j2--;
                    z = true;
                }
                i2++;
                i++;
            }
            if (i2 == i3) {
                this.head = segment.pop();
                okio.SegmentPool.recycle(segment);
            } else {
                segment.pos = i2;
            }
            if (z2) {
                break;
            }
        } while (this.head != null);
        setSize$okio(size() - ((long) i));
        if (i >= (z ? 2 : 1)) {
            return z ? j : -j;
        }
        if (size() == 0) {
            throw new java.io.EOFException();
        }
        throw new java.lang.NumberFormatException((z ? "Expected a digit" : "Expected a digit or '-'") + " but was 0x" + okio.SegmentedByteString.toHexString(getByte(0L)));
    }

    @Override // okio.BufferedSource
    public long readHexadecimalUnsignedLong() throws java.io.EOFException {
        int i;
        int i2;
        if (size() == 0) {
            throw new java.io.EOFException();
        }
        int i3 = 0;
        boolean z = false;
        long j = 0;
        do {
            okio.Segment segment = this.head;
            kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
            byte[] bArr = segment.data;
            int i4 = segment.pos;
            int i5 = segment.limit;
            while (i4 < i5) {
                byte b = bArr[i4];
                if (b < 48 || b > 57) {
                    if (b >= 97 && b <= 102) {
                        i = b - 97;
                    } else {
                        if (b < 65 || b > 70) {
                            if (i3 == 0) {
                                throw new java.lang.NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x" + okio.SegmentedByteString.toHexString(b));
                            }
                            z = true;
                            break;
                        }
                        i = b - 65;
                    }
                    i2 = i + 10;
                } else {
                    i2 = b - 48;
                }
                if (((-1152921504606846976L) & j) != 0) {
                    throw new java.lang.NumberFormatException("Number too large: " + new okio.Buffer().writeHexadecimalUnsignedLong(j).writeByte((int) b).readUtf8());
                }
                j = (j << 4) | ((long) i2);
                i4++;
                i3++;
            }
            if (i4 == i5) {
                this.head = segment.pop();
                okio.SegmentPool.recycle(segment);
            } else {
                segment.pos = i4;
            }
            if (z) {
                break;
            }
        } while (this.head != null);
        setSize$okio(size() - ((long) i3));
        return j;
    }

    @Override // okio.BufferedSource
    public okio.ByteString readByteString() {
        return readByteString(size());
    }

    @Override // okio.BufferedSource
    public okio.ByteString readByteString(long byteCount) throws java.io.EOFException {
        if (!(byteCount >= 0 && byteCount <= 2147483647L)) {
            throw new java.lang.IllegalArgumentException(("byteCount: " + byteCount).toString());
        }
        if (size() < byteCount) {
            throw new java.io.EOFException();
        }
        if (byteCount >= 4096) {
            okio.ByteString byteStringSnapshot = snapshot((int) byteCount);
            skip(byteCount);
            return byteStringSnapshot;
        }
        return new okio.ByteString(readByteArray(byteCount));
    }

    @Override // okio.BufferedSource
    public int select(okio.Options options) throws java.io.EOFException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(options, "options");
        int iSelectPrefix$default = okio.internal.Buffer.selectPrefix$default(this, options, false, 2, null);
        if (iSelectPrefix$default == -1) {
            return -1;
        }
        skip(options.getByteStrings()[iSelectPrefix$default].size());
        return iSelectPrefix$default;
    }

    @Override // okio.BufferedSource
    public void readFully(okio.Buffer sink, long byteCount) throws java.io.EOFException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "sink");
        if (size() < byteCount) {
            sink.write(this, size());
            throw new java.io.EOFException();
        }
        sink.write(this, byteCount);
    }

    @Override // okio.BufferedSource
    public long readAll(okio.Sink sink) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "sink");
        long size = size();
        if (size > 0) {
            sink.write(this, size);
        }
        return size;
    }

    @Override // okio.BufferedSource
    public java.lang.String readUtf8Line() throws java.io.EOFException {
        long jIndexOf = indexOf((byte) 10);
        if (jIndexOf != -1) {
            return okio.internal.Buffer.readUtf8Line(this, jIndexOf);
        }
        if (size() != 0) {
            return readUtf8(size());
        }
        return null;
    }

    @Override // okio.BufferedSource
    public java.lang.String readUtf8LineStrict(long limit) throws java.io.EOFException {
        if (!(limit >= 0)) {
            throw new java.lang.IllegalArgumentException(("limit < 0: " + limit).toString());
        }
        long j = limit != Long.MAX_VALUE ? limit + 1 : Long.MAX_VALUE;
        long jIndexOf = indexOf((byte) 10, 0L, j);
        if (jIndexOf != -1) {
            return okio.internal.Buffer.readUtf8Line(this, jIndexOf);
        }
        if (j < size() && getByte(j - 1) == 13 && getByte(j) == 10) {
            return okio.internal.Buffer.readUtf8Line(this, j);
        }
        okio.Buffer buffer = new okio.Buffer();
        copyTo(buffer, 0L, java.lang.Math.min(32, size()));
        throw new java.io.EOFException("\\n not found: limit=" + java.lang.Math.min(size(), limit) + " content=" + buffer.readByteString().hex() + kotlin.text.Typography.ellipsis);
    }

    @Override // okio.BufferedSource
    public int readUtf8CodePoint() throws java.io.EOFException {
        int i;
        int i2;
        int i3;
        if (size() == 0) {
            throw new java.io.EOFException();
        }
        byte b = getByte(0L);
        boolean z = false;
        if ((b & 128) == 0) {
            i = b & 127;
            i3 = 0;
            i2 = 1;
        } else if ((b & 224) == 192) {
            i = b & 31;
            i2 = 2;
            i3 = 128;
        } else if ((b & 240) == 224) {
            i = b & 15;
            i2 = 3;
            i3 = 2048;
        } else {
            if ((b & 248) != 240) {
                skip(1L);
                return okio.Utf8.REPLACEMENT_CODE_POINT;
            }
            i = b & 7;
            i2 = 4;
            i3 = 65536;
        }
        long j = i2;
        if (size() < j) {
            throw new java.io.EOFException("size < " + i2 + ": " + size() + " (to read code point prefixed 0x" + okio.SegmentedByteString.toHexString(b) + ')');
        }
        for (int i4 = 1; i4 < i2; i4++) {
            long j2 = i4;
            byte b2 = getByte(j2);
            if ((b2 & 192) != 128) {
                skip(j2);
                return okio.Utf8.REPLACEMENT_CODE_POINT;
            }
            i = (i << 6) | (b2 & okio.Utf8.REPLACEMENT_BYTE);
        }
        skip(j);
        if (i > 1114111) {
            return okio.Utf8.REPLACEMENT_CODE_POINT;
        }
        if (55296 <= i && i < 57344) {
            z = true;
        }
        return (!z && i >= i3) ? i : okio.Utf8.REPLACEMENT_CODE_POINT;
    }

    @Override // okio.BufferedSource
    public byte[] readByteArray() {
        return readByteArray(size());
    }

    @Override // okio.BufferedSource
    public byte[] readByteArray(long byteCount) throws java.io.EOFException {
        if (!(byteCount >= 0 && byteCount <= 2147483647L)) {
            throw new java.lang.IllegalArgumentException(("byteCount: " + byteCount).toString());
        }
        if (size() < byteCount) {
            throw new java.io.EOFException();
        }
        byte[] bArr = new byte[(int) byteCount];
        readFully(bArr);
        return bArr;
    }

    @Override // okio.BufferedSource
    public int read(byte[] sink) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "sink");
        return read(sink, 0, sink.length);
    }

    @Override // okio.BufferedSource
    public void readFully(byte[] sink) throws java.io.EOFException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "sink");
        int i = 0;
        while (i < sink.length) {
            int i2 = read(sink, i, sink.length - i);
            if (i2 == -1) {
                throw new java.io.EOFException();
            }
            i += i2;
        }
    }

    @Override // okio.BufferedSource
    public int read(byte[] sink, int offset, int byteCount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "sink");
        okio.SegmentedByteString.checkOffsetAndCount(sink.length, offset, byteCount);
        okio.Segment segment = this.head;
        if (segment == null) {
            return -1;
        }
        int iMin = java.lang.Math.min(byteCount, segment.limit - segment.pos);
        kotlin.collections.ArraysKt.copyInto(segment.data, sink, offset, segment.pos, segment.pos + iMin);
        segment.pos += iMin;
        setSize$okio(size() - ((long) iMin));
        if (segment.pos == segment.limit) {
            this.head = segment.pop();
            okio.SegmentPool.recycle(segment);
        }
        return iMin;
    }

    public final void clear() throws java.io.EOFException {
        skip(size());
    }

    @Override // okio.BufferedSource
    public void skip(long byteCount) throws java.io.EOFException {
        while (byteCount > 0) {
            okio.Segment segment = this.head;
            if (segment == null) {
                throw new java.io.EOFException();
            }
            int iMin = (int) java.lang.Math.min(byteCount, segment.limit - segment.pos);
            long j = iMin;
            setSize$okio(size() - j);
            byteCount -= j;
            segment.pos += iMin;
            if (segment.pos == segment.limit) {
                this.head = segment.pop();
                okio.SegmentPool.recycle(segment);
            }
        }
    }

    @Override // okio.BufferedSink
    public okio.Buffer write(okio.ByteString byteString) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "byteString");
        byteString.write$okio(this, 0, byteString.size());
        return this;
    }

    @Override // okio.BufferedSink
    public okio.Buffer write(okio.ByteString byteString, int offset, int byteCount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "byteString");
        byteString.write$okio(this, offset, byteCount);
        return this;
    }

    @Override // okio.BufferedSink
    public okio.Buffer writeUtf8(java.lang.String string, int beginIndex, int endIndex) {
        char cCharAt;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(string, "string");
        if (!(beginIndex >= 0)) {
            throw new java.lang.IllegalArgumentException(("beginIndex < 0: " + beginIndex).toString());
        }
        if (!(endIndex >= beginIndex)) {
            throw new java.lang.IllegalArgumentException(("endIndex < beginIndex: " + endIndex + " < " + beginIndex).toString());
        }
        if (!(endIndex <= string.length())) {
            throw new java.lang.IllegalArgumentException(("endIndex > string.length: " + endIndex + " > " + string.length()).toString());
        }
        while (beginIndex < endIndex) {
            char cCharAt2 = string.charAt(beginIndex);
            if (cCharAt2 < 128) {
                okio.Segment segmentWritableSegment$okio = writableSegment$okio(1);
                byte[] bArr = segmentWritableSegment$okio.data;
                int i = segmentWritableSegment$okio.limit - beginIndex;
                int iMin = java.lang.Math.min(endIndex, 8192 - i);
                int i2 = beginIndex + 1;
                bArr[beginIndex + i] = (byte) cCharAt2;
                while (true) {
                    beginIndex = i2;
                    if (beginIndex >= iMin || (cCharAt = string.charAt(beginIndex)) >= 128) {
                        break;
                    }
                    i2 = beginIndex + 1;
                    bArr[beginIndex + i] = (byte) cCharAt;
                }
                int i3 = (i + beginIndex) - segmentWritableSegment$okio.limit;
                segmentWritableSegment$okio.limit += i3;
                setSize$okio(size() + ((long) i3));
            } else {
                if (cCharAt2 < 2048) {
                    okio.Segment segmentWritableSegment$okio2 = writableSegment$okio(2);
                    segmentWritableSegment$okio2.data[segmentWritableSegment$okio2.limit] = (byte) ((cCharAt2 >> 6) | 192);
                    segmentWritableSegment$okio2.data[segmentWritableSegment$okio2.limit + 1] = (byte) ((cCharAt2 & '?') | 128);
                    segmentWritableSegment$okio2.limit += 2;
                    setSize$okio(size() + 2);
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    okio.Segment segmentWritableSegment$okio3 = writableSegment$okio(3);
                    segmentWritableSegment$okio3.data[segmentWritableSegment$okio3.limit] = (byte) ((cCharAt2 >> '\f') | 224);
                    segmentWritableSegment$okio3.data[segmentWritableSegment$okio3.limit + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    segmentWritableSegment$okio3.data[segmentWritableSegment$okio3.limit + 2] = (byte) ((cCharAt2 & '?') | 128);
                    segmentWritableSegment$okio3.limit += 3;
                    setSize$okio(size() + 3);
                } else {
                    int i4 = beginIndex + 1;
                    char cCharAt3 = i4 < endIndex ? string.charAt(i4) : (char) 0;
                    if (cCharAt2 <= 56319) {
                        if (56320 <= cCharAt3 && cCharAt3 < 57344) {
                            int i5 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                            okio.Segment segmentWritableSegment$okio4 = writableSegment$okio(4);
                            segmentWritableSegment$okio4.data[segmentWritableSegment$okio4.limit] = (byte) ((i5 >> 18) | androidx.media3.extractor.ts.PsExtractor.VIDEO_STREAM_MASK);
                            segmentWritableSegment$okio4.data[segmentWritableSegment$okio4.limit + 1] = (byte) (((i5 >> 12) & 63) | 128);
                            segmentWritableSegment$okio4.data[segmentWritableSegment$okio4.limit + 2] = (byte) (((i5 >> 6) & 63) | 128);
                            segmentWritableSegment$okio4.data[segmentWritableSegment$okio4.limit + 3] = (byte) ((i5 & 63) | 128);
                            segmentWritableSegment$okio4.limit += 4;
                            setSize$okio(size() + 4);
                            beginIndex += 2;
                        }
                    }
                    writeByte(63);
                    beginIndex = i4;
                }
                beginIndex++;
            }
        }
        return this;
    }

    @Override // okio.BufferedSink
    public okio.Buffer writeUtf8CodePoint(int codePoint) {
        if (codePoint < 128) {
            writeByte(codePoint);
        } else if (codePoint < 2048) {
            okio.Segment segmentWritableSegment$okio = writableSegment$okio(2);
            segmentWritableSegment$okio.data[segmentWritableSegment$okio.limit] = (byte) ((codePoint >> 6) | 192);
            segmentWritableSegment$okio.data[segmentWritableSegment$okio.limit + 1] = (byte) ((codePoint & 63) | 128);
            segmentWritableSegment$okio.limit += 2;
            setSize$okio(size() + 2);
        } else {
            boolean z = false;
            if (55296 <= codePoint && codePoint < 57344) {
                z = true;
            }
            if (z) {
                writeByte(63);
            } else if (codePoint < 65536) {
                okio.Segment segmentWritableSegment$okio2 = writableSegment$okio(3);
                segmentWritableSegment$okio2.data[segmentWritableSegment$okio2.limit] = (byte) ((codePoint >> 12) | 224);
                segmentWritableSegment$okio2.data[segmentWritableSegment$okio2.limit + 1] = (byte) (((codePoint >> 6) & 63) | 128);
                segmentWritableSegment$okio2.data[segmentWritableSegment$okio2.limit + 2] = (byte) ((codePoint & 63) | 128);
                segmentWritableSegment$okio2.limit += 3;
                setSize$okio(size() + 3);
            } else if (codePoint <= 1114111) {
                okio.Segment segmentWritableSegment$okio3 = writableSegment$okio(4);
                segmentWritableSegment$okio3.data[segmentWritableSegment$okio3.limit] = (byte) ((codePoint >> 18) | androidx.media3.extractor.ts.PsExtractor.VIDEO_STREAM_MASK);
                segmentWritableSegment$okio3.data[segmentWritableSegment$okio3.limit + 1] = (byte) (((codePoint >> 12) & 63) | 128);
                segmentWritableSegment$okio3.data[segmentWritableSegment$okio3.limit + 2] = (byte) (((codePoint >> 6) & 63) | 128);
                segmentWritableSegment$okio3.data[segmentWritableSegment$okio3.limit + 3] = (byte) ((codePoint & 63) | 128);
                segmentWritableSegment$okio3.limit += 4;
                setSize$okio(size() + 4);
            } else {
                throw new java.lang.IllegalArgumentException("Unexpected code point: 0x" + okio.SegmentedByteString.toHexString(codePoint));
            }
        }
        return this;
    }

    @Override // okio.BufferedSink
    public okio.Buffer write(byte[] source) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        return write(source, 0, source.length);
    }

    @Override // okio.BufferedSink
    public okio.Buffer write(byte[] source, int offset, int byteCount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        long j = byteCount;
        okio.SegmentedByteString.checkOffsetAndCount(source.length, offset, j);
        int i = byteCount + offset;
        while (offset < i) {
            okio.Segment segmentWritableSegment$okio = writableSegment$okio(1);
            int iMin = java.lang.Math.min(i - offset, 8192 - segmentWritableSegment$okio.limit);
            int i2 = offset + iMin;
            kotlin.collections.ArraysKt.copyInto(source, segmentWritableSegment$okio.data, segmentWritableSegment$okio.limit, offset, i2);
            segmentWritableSegment$okio.limit += iMin;
            offset = i2;
        }
        setSize$okio(size() + j);
        return this;
    }

    @Override // okio.BufferedSink
    public long writeAll(okio.Source source) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        long j = 0;
        while (true) {
            long j2 = source.read(this, 8192L);
            if (j2 == -1) {
                return j;
            }
            j += j2;
        }
    }

    @Override // okio.BufferedSink
    public okio.Buffer write(okio.Source source, long byteCount) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        while (byteCount > 0) {
            long j = source.read(this, byteCount);
            if (j == -1) {
                throw new java.io.EOFException();
            }
            byteCount -= j;
        }
        return this;
    }

    @Override // okio.BufferedSink
    public okio.Buffer writeByte(int b) {
        okio.Segment segmentWritableSegment$okio = writableSegment$okio(1);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i = segmentWritableSegment$okio.limit;
        segmentWritableSegment$okio.limit = i + 1;
        bArr[i] = (byte) b;
        setSize$okio(size() + 1);
        return this;
    }

    @Override // okio.BufferedSink
    public okio.Buffer writeShort(int s) {
        okio.Segment segmentWritableSegment$okio = writableSegment$okio(2);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i = segmentWritableSegment$okio.limit;
        int i2 = i + 1;
        bArr[i] = (byte) ((s >>> 8) & 255);
        bArr[i2] = (byte) (s & 255);
        segmentWritableSegment$okio.limit = i2 + 1;
        setSize$okio(size() + 2);
        return this;
    }

    @Override // okio.BufferedSink
    public okio.Buffer writeInt(int i) {
        okio.Segment segmentWritableSegment$okio = writableSegment$okio(4);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i2 = segmentWritableSegment$okio.limit;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i >>> 16) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i >>> 8) & 255);
        bArr[i5] = (byte) (i & 255);
        segmentWritableSegment$okio.limit = i5 + 1;
        setSize$okio(size() + 4);
        return this;
    }

    @Override // okio.BufferedSink
    public okio.Buffer writeLong(long v) {
        okio.Segment segmentWritableSegment$okio = writableSegment$okio(8);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i = segmentWritableSegment$okio.limit;
        int i2 = i + 1;
        bArr[i] = (byte) ((v >>> 56) & 255);
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((v >>> 48) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((v >>> 40) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((v >>> 32) & 255);
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((v >>> 24) & 255);
        int i7 = i6 + 1;
        bArr[i6] = (byte) ((v >>> 16) & 255);
        int i8 = i7 + 1;
        bArr[i7] = (byte) ((v >>> 8) & 255);
        bArr[i8] = (byte) (v & 255);
        segmentWritableSegment$okio.limit = i8 + 1;
        setSize$okio(size() + 8);
        return this;
    }

    @Override // okio.BufferedSink
    public okio.Buffer writeDecimalLong(long v) {
        boolean z;
        if (v == 0) {
            return writeByte(48);
        }
        int i = 1;
        if (v < 0) {
            v = -v;
            if (v < 0) {
                return writeUtf8("-9223372036854775808");
            }
            z = true;
        } else {
            z = false;
        }
        if (v < 100000000) {
            if (v < 10000) {
                if (v >= 100) {
                    i = v < 1000 ? 3 : 4;
                } else if (v >= 10) {
                    i = 2;
                }
            } else if (v < 1000000) {
                i = v < androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US ? 5 : 6;
            } else {
                i = v < 10000000 ? 7 : 8;
            }
        } else if (v < androidx.media3.exoplayer.MediaPeriodQueue.INITIAL_RENDERER_POSITION_OFFSET_US) {
            if (v < okhttp3.internal.connection.RealConnection.IDLE_CONNECTION_HEALTHY_NS) {
                i = v < androidx.media3.common.C.NANOS_PER_SECOND ? 9 : 10;
            } else {
                i = v < 100000000000L ? 11 : 12;
            }
        } else if (v < 1000000000000000L) {
            if (v < 10000000000000L) {
                i = 13;
            } else {
                i = v < 100000000000000L ? 14 : 15;
            }
        } else if (v < 100000000000000000L) {
            i = v < 10000000000000000L ? 16 : 17;
        } else {
            i = v < 1000000000000000000L ? 18 : 19;
        }
        if (z) {
            i++;
        }
        okio.Segment segmentWritableSegment$okio = writableSegment$okio(i);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i2 = segmentWritableSegment$okio.limit + i;
        while (v != 0) {
            long j = 10;
            i2--;
            bArr[i2] = okio.internal.Buffer.getHEX_DIGIT_BYTES()[(int) (v % j)];
            v /= j;
        }
        if (z) {
            bArr[i2 - 1] = 45;
        }
        segmentWritableSegment$okio.limit += i;
        setSize$okio(size() + ((long) i));
        return this;
    }

    @Override // okio.BufferedSink
    public okio.Buffer writeHexadecimalUnsignedLong(long v) {
        if (v == 0) {
            return writeByte(48);
        }
        long j = (v >>> 1) | v;
        long j2 = j | (j >>> 2);
        long j3 = j2 | (j2 >>> 4);
        long j4 = j3 | (j3 >>> 8);
        long j5 = j4 | (j4 >>> 16);
        long j6 = j5 | (j5 >>> 32);
        long j7 = j6 - ((j6 >>> 1) & 6148914691236517205L);
        long j8 = ((j7 >>> 2) & 3689348814741910323L) + (j7 & 3689348814741910323L);
        long j9 = ((j8 >>> 4) + j8) & 1085102592571150095L;
        long j10 = j9 + (j9 >>> 8);
        long j11 = j10 + (j10 >>> 16);
        int i = (int) ((((j11 & 63) + ((j11 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
        okio.Segment segmentWritableSegment$okio = writableSegment$okio(i);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i2 = segmentWritableSegment$okio.limit;
        for (int i3 = (segmentWritableSegment$okio.limit + i) - 1; i3 >= i2; i3--) {
            bArr[i3] = okio.internal.Buffer.getHEX_DIGIT_BYTES()[(int) (15 & v)];
            v >>>= 4;
        }
        segmentWritableSegment$okio.limit += i;
        setSize$okio(size() + ((long) i));
        return this;
    }

    public final okio.Segment writableSegment$okio(int minimumCapacity) {
        if (!(minimumCapacity >= 1 && minimumCapacity <= 8192)) {
            throw new java.lang.IllegalArgumentException("unexpected capacity".toString());
        }
        okio.Segment segment = this.head;
        if (segment == null) {
            okio.Segment segmentTake = okio.SegmentPool.take();
            this.head = segmentTake;
            segmentTake.prev = segmentTake;
            segmentTake.next = segmentTake;
            return segmentTake;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
        okio.Segment segment2 = segment.prev;
        kotlin.jvm.internal.Intrinsics.checkNotNull(segment2);
        return (segment2.limit + minimumCapacity > 8192 || !segment2.owner) ? segment2.push(okio.SegmentPool.take()) : segment2;
    }

    @Override // okio.Sink
    public void write(okio.Buffer source, long byteCount) {
        okio.Segment segment;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        if (!(source != this)) {
            throw new java.lang.IllegalArgumentException("source == this".toString());
        }
        okio.SegmentedByteString.checkOffsetAndCount(source.size(), 0L, byteCount);
        while (byteCount > 0) {
            okio.Segment segment2 = source.head;
            kotlin.jvm.internal.Intrinsics.checkNotNull(segment2);
            int i = segment2.limit;
            okio.Segment segment3 = source.head;
            kotlin.jvm.internal.Intrinsics.checkNotNull(segment3);
            if (byteCount < i - segment3.pos) {
                okio.Segment segment4 = this.head;
                if (segment4 != null) {
                    kotlin.jvm.internal.Intrinsics.checkNotNull(segment4);
                    segment = segment4.prev;
                } else {
                    segment = null;
                }
                if (segment != null && segment.owner) {
                    if ((((long) segment.limit) + byteCount) - ((long) (segment.shared ? 0 : segment.pos)) <= 8192) {
                        okio.Segment segment5 = source.head;
                        kotlin.jvm.internal.Intrinsics.checkNotNull(segment5);
                        segment5.writeTo(segment, (int) byteCount);
                        source.setSize$okio(source.size() - byteCount);
                        setSize$okio(size() + byteCount);
                        return;
                    }
                }
                okio.Segment segment6 = source.head;
                kotlin.jvm.internal.Intrinsics.checkNotNull(segment6);
                source.head = segment6.split((int) byteCount);
            }
            okio.Segment segment7 = source.head;
            kotlin.jvm.internal.Intrinsics.checkNotNull(segment7);
            long j = segment7.limit - segment7.pos;
            source.head = segment7.pop();
            okio.Segment segment8 = this.head;
            if (segment8 == null) {
                this.head = segment7;
                segment7.prev = segment7;
                segment7.next = segment7.prev;
            } else {
                kotlin.jvm.internal.Intrinsics.checkNotNull(segment8);
                okio.Segment segment9 = segment8.prev;
                kotlin.jvm.internal.Intrinsics.checkNotNull(segment9);
                segment9.push(segment7).compact();
            }
            source.setSize$okio(source.size() - j);
            setSize$okio(size() + j);
            byteCount -= j;
        }
    }

    @Override // okio.Source
    public long read(okio.Buffer sink, long byteCount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "sink");
        if (!(byteCount >= 0)) {
            throw new java.lang.IllegalArgumentException(("byteCount < 0: " + byteCount).toString());
        }
        if (size() == 0) {
            return -1L;
        }
        if (byteCount > size()) {
            byteCount = size();
        }
        sink.write(this, byteCount);
        return byteCount;
    }

    @Override // okio.BufferedSource
    public long indexOf(byte b, long fromIndex, long toIndex) {
        okio.Segment segment;
        int i;
        long size = 0;
        boolean z = false;
        if (0 <= fromIndex && fromIndex <= toIndex) {
            z = true;
        }
        if (!z) {
            throw new java.lang.IllegalArgumentException(("size=" + size() + " fromIndex=" + fromIndex + " toIndex=" + toIndex).toString());
        }
        if (toIndex > size()) {
            toIndex = size();
        }
        if (fromIndex == toIndex || (segment = this.head) == null) {
            return -1L;
        }
        if (size() - fromIndex < fromIndex) {
            size = size();
            while (size > fromIndex) {
                segment = segment.prev;
                kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
                size -= (long) (segment.limit - segment.pos);
            }
            if (segment == null) {
                return -1L;
            }
            while (size < toIndex) {
                byte[] bArr = segment.data;
                int iMin = (int) java.lang.Math.min(segment.limit, (((long) segment.pos) + toIndex) - size);
                i = (int) ((((long) segment.pos) + fromIndex) - size);
                while (i < iMin) {
                    if (bArr[i] != b) {
                        i++;
                    }
                }
                size += (long) (segment.limit - segment.pos);
                segment = segment.next;
                kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
                fromIndex = size;
            }
            return -1L;
        }
        while (true) {
            long j = ((long) (segment.limit - segment.pos)) + size;
            if (j > fromIndex) {
                break;
            }
            segment = segment.next;
            kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
            size = j;
        }
        if (segment == null) {
            return -1L;
        }
        while (size < toIndex) {
            byte[] bArr2 = segment.data;
            int iMin2 = (int) java.lang.Math.min(segment.limit, (((long) segment.pos) + toIndex) - size);
            i = (int) ((((long) segment.pos) + fromIndex) - size);
            while (i < iMin2) {
                if (bArr2[i] != b) {
                    i++;
                }
            }
            size += (long) (segment.limit - segment.pos);
            segment = segment.next;
            kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
            fromIndex = size;
        }
        return -1L;
        return ((long) (i - segment.pos)) + size;
    }

    @Override // okio.BufferedSource
    public long indexOf(okio.ByteString bytes, long fromIndex) throws java.io.IOException {
        long j = fromIndex;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (!(bytes.size() > 0)) {
            throw new java.lang.IllegalArgumentException("bytes is empty".toString());
        }
        long j2 = 0;
        if (!(j >= 0)) {
            throw new java.lang.IllegalArgumentException(("fromIndex < 0: " + j).toString());
        }
        okio.Segment segment = this.head;
        if (segment != null) {
            if (size() - j < j) {
                long size = size();
                while (size > j) {
                    segment = segment.prev;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
                    size -= (long) (segment.limit - segment.pos);
                }
                if (segment != null) {
                    byte[] bArrInternalArray$okio = bytes.internalArray$okio();
                    byte b = bArrInternalArray$okio[0];
                    int size2 = bytes.size();
                    long size3 = (size() - ((long) size2)) + 1;
                    while (size < size3) {
                        byte[] bArr = segment.data;
                        long j3 = size;
                        int iMin = (int) java.lang.Math.min(segment.limit, (((long) segment.pos) + size3) - size);
                        for (int i = (int) ((((long) segment.pos) + j) - j3); i < iMin; i++) {
                            if (bArr[i] == b && okio.internal.Buffer.rangeEquals(segment, i + 1, bArrInternalArray$okio, 1, size2)) {
                                return ((long) (i - segment.pos)) + j3;
                            }
                        }
                        size = j3 + ((long) (segment.limit - segment.pos));
                        segment = segment.next;
                        kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
                        j = size;
                    }
                }
            } else {
                while (true) {
                    long j4 = ((long) (segment.limit - segment.pos)) + j2;
                    if (j4 > j) {
                        break;
                    }
                    segment = segment.next;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
                    j2 = j4;
                }
                if (segment != null) {
                    byte[] bArrInternalArray$okio2 = bytes.internalArray$okio();
                    byte b2 = bArrInternalArray$okio2[0];
                    int size4 = bytes.size();
                    long size5 = (size() - ((long) size4)) + 1;
                    while (j2 < size5) {
                        byte[] bArr2 = segment.data;
                        long j5 = size5;
                        int iMin2 = (int) java.lang.Math.min(segment.limit, (((long) segment.pos) + size5) - j2);
                        for (int i2 = (int) ((((long) segment.pos) + j) - j2); i2 < iMin2; i2++) {
                            if (bArr2[i2] == b2 && okio.internal.Buffer.rangeEquals(segment, i2 + 1, bArrInternalArray$okio2, 1, size4)) {
                                return ((long) (i2 - segment.pos)) + j2;
                            }
                        }
                        j2 += (long) (segment.limit - segment.pos);
                        segment = segment.next;
                        kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
                        j = j2;
                        size5 = j5;
                    }
                }
            }
        }
        return -1L;
    }

    @Override // okio.BufferedSource
    public long indexOfElement(okio.ByteString targetBytes, long fromIndex) {
        int i;
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        long size = 0;
        if (!(fromIndex >= 0)) {
            throw new java.lang.IllegalArgumentException(("fromIndex < 0: " + fromIndex).toString());
        }
        okio.Segment segment = this.head;
        if (segment == null) {
            return -1L;
        }
        if (size() - fromIndex < fromIndex) {
            size = size();
            while (size > fromIndex) {
                segment = segment.prev;
                kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
                size -= (long) (segment.limit - segment.pos);
            }
            if (segment == null) {
                return -1L;
            }
            if (targetBytes.size() == 2) {
                byte b = targetBytes.getByte(0);
                byte b2 = targetBytes.getByte(1);
                while (size < size()) {
                    byte[] bArr = segment.data;
                    i = (int) ((((long) segment.pos) + fromIndex) - size);
                    int i3 = segment.limit;
                    while (true) {
                        if (i < i3) {
                            byte b3 = bArr[i];
                            if (b3 == b || b3 == b2) {
                                i2 = segment.pos;
                            } else {
                                i++;
                            }
                        } else {
                            size += (long) (segment.limit - segment.pos);
                            segment = segment.next;
                            kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
                            fromIndex = size;
                        }
                    }
                }
                return -1L;
            }
            byte[] bArrInternalArray$okio = targetBytes.internalArray$okio();
            while (size < size()) {
                byte[] bArr2 = segment.data;
                i = (int) ((((long) segment.pos) + fromIndex) - size);
                int i4 = segment.limit;
                while (true) {
                    if (i < i4) {
                        byte b4 = bArr2[i];
                        int length = bArrInternalArray$okio.length;
                        int i5 = 0;
                        while (true) {
                            if (i5 >= length) {
                                i++;
                            } else if (b4 == bArrInternalArray$okio[i5]) {
                                i2 = segment.pos;
                            } else {
                                i5++;
                            }
                        }
                    } else {
                        size += (long) (segment.limit - segment.pos);
                        segment = segment.next;
                        kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
                        fromIndex = size;
                    }
                }
            }
            return -1L;
        }
        while (true) {
            long j = ((long) (segment.limit - segment.pos)) + size;
            if (j > fromIndex) {
                break;
            }
            segment = segment.next;
            kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
            size = j;
        }
        if (segment == null) {
            return -1L;
        }
        if (targetBytes.size() == 2) {
            byte b5 = targetBytes.getByte(0);
            byte b6 = targetBytes.getByte(1);
            while (size < size()) {
                byte[] bArr3 = segment.data;
                i = (int) ((((long) segment.pos) + fromIndex) - size);
                int i6 = segment.limit;
                while (true) {
                    if (i < i6) {
                        byte b7 = bArr3[i];
                        if (b7 == b5 || b7 == b6) {
                            i2 = segment.pos;
                        } else {
                            i++;
                        }
                    } else {
                        size += (long) (segment.limit - segment.pos);
                        segment = segment.next;
                        kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
                        fromIndex = size;
                    }
                }
            }
            return -1L;
        }
        byte[] bArrInternalArray$okio2 = targetBytes.internalArray$okio();
        while (size < size()) {
            byte[] bArr4 = segment.data;
            i = (int) ((((long) segment.pos) + fromIndex) - size);
            int i7 = segment.limit;
            while (true) {
                if (i < i7) {
                    byte b8 = bArr4[i];
                    int length2 = bArrInternalArray$okio2.length;
                    int i8 = 0;
                    while (true) {
                        if (i8 >= length2) {
                            i++;
                        } else if (b8 == bArrInternalArray$okio2[i8]) {
                            i2 = segment.pos;
                        } else {
                            i8++;
                        }
                    }
                } else {
                    size += (long) (segment.limit - segment.pos);
                    segment = segment.next;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
                    fromIndex = size;
                }
            }
        }
        return -1L;
        return ((long) (i - i2)) + size;
    }

    @Override // okio.BufferedSource
    public boolean rangeEquals(long offset, okio.ByteString bytes, int bytesOffset, int byteCount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (offset < 0 || bytesOffset < 0 || byteCount < 0 || size() - offset < byteCount || bytes.size() - bytesOffset < byteCount) {
            return false;
        }
        for (int i = 0; i < byteCount; i++) {
            if (getByte(((long) i) + offset) != bytes.getByte(bytesOffset + i)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof okio.Buffer) {
            okio.Buffer buffer = (okio.Buffer) other;
            if (size() == buffer.size()) {
                if (size() == 0) {
                    return true;
                }
                okio.Segment segment = this.head;
                kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
                okio.Segment segment2 = buffer.head;
                kotlin.jvm.internal.Intrinsics.checkNotNull(segment2);
                int i = segment.pos;
                int i2 = segment2.pos;
                long j = 0;
                while (j < size()) {
                    long jMin = java.lang.Math.min(segment.limit - i, segment2.limit - i2);
                    long j2 = 0;
                    while (j2 < jMin) {
                        int i3 = i + 1;
                        int i4 = i2 + 1;
                        if (segment.data[i] == segment2.data[i2]) {
                            j2++;
                            i = i3;
                            i2 = i4;
                        }
                    }
                    if (i == segment.limit) {
                        segment = segment.next;
                        kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
                        i = segment.pos;
                    }
                    if (i2 == segment2.limit) {
                        segment2 = segment2.next;
                        kotlin.jvm.internal.Intrinsics.checkNotNull(segment2);
                        i2 = segment2.pos;
                    }
                    j += jMin;
                }
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        okio.Segment segment = this.head;
        if (segment == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = segment.limit;
            for (int i3 = segment.pos; i3 < i2; i3++) {
                i = (i * 31) + segment.data[i3];
            }
            segment = segment.next;
            kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
        } while (segment != this.head);
        return i;
    }

    public final okio.Buffer copy() {
        okio.Buffer buffer = new okio.Buffer();
        if (size() != 0) {
            okio.Segment segment = this.head;
            kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
            okio.Segment segmentSharedCopy = segment.sharedCopy();
            buffer.head = segmentSharedCopy;
            segmentSharedCopy.prev = segmentSharedCopy;
            segmentSharedCopy.next = segmentSharedCopy.prev;
            for (okio.Segment segment2 = segment.next; segment2 != segment; segment2 = segment2.next) {
                okio.Segment segment3 = segmentSharedCopy.prev;
                kotlin.jvm.internal.Intrinsics.checkNotNull(segment3);
                kotlin.jvm.internal.Intrinsics.checkNotNull(segment2);
                segment3.push(segment2.sharedCopy());
            }
            buffer.setSize$okio(size());
        }
        return buffer;
    }

    public final okio.ByteString snapshot() {
        if (!(size() <= 2147483647L)) {
            throw new java.lang.IllegalStateException(("size > Int.MAX_VALUE: " + size()).toString());
        }
        return snapshot((int) size());
    }

    public final okio.ByteString snapshot(int byteCount) {
        if (byteCount == 0) {
            return okio.ByteString.EMPTY;
        }
        okio.SegmentedByteString.checkOffsetAndCount(size(), 0L, byteCount);
        okio.Segment segment = this.head;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i2 < byteCount) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
            if (segment.limit == segment.pos) {
                throw new java.lang.AssertionError("s.limit == s.pos");
            }
            i2 += segment.limit - segment.pos;
            i3++;
            segment = segment.next;
        }
        byte[][] bArr = new byte[i3][];
        int[] iArr = new int[i3 * 2];
        okio.Segment segment2 = this.head;
        int i4 = 0;
        while (i < byteCount) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(segment2);
            bArr[i4] = segment2.data;
            i += segment2.limit - segment2.pos;
            iArr[i4] = java.lang.Math.min(i, byteCount);
            iArr[bArr.length + i4] = segment2.pos;
            segment2.shared = true;
            i4++;
            segment2 = segment2.next;
        }
        return new okio.C1871SegmentedByteString(bArr, iArr);
    }
}
