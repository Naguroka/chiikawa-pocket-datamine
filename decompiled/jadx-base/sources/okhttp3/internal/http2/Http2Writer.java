package okhttp3.internal.http2;

/* JADX INFO: compiled from: Http2Writer.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u0000 :2\u00020\u0001:\u0001:B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\b\u0010\u0014\u001a\u00020\u0011H\u0016J\u0006\u0010\u0015\u001a\u00020\u0011J(\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u000f2\b\u0010\u0019\u001a\u0004\u0018\u00010\t2\u0006\u0010\u001a\u001a\u00020\u000fJ(\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u000f2\b\u0010\u001d\u001a\u0004\u0018\u00010\t2\u0006\u0010\u001a\u001a\u00020\u000fJ\u0006\u0010\u001e\u001a\u00020\u0011J&\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u000fJ\u001e\u0010\"\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'J$\u0010(\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u000f2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*J\u0006\u0010,\u001a\u00020\u000fJ\u001e\u0010-\u001a\u00020\u00112\u0006\u0010.\u001a\u00020\u00052\u0006\u0010/\u001a\u00020\u000f2\u0006\u00100\u001a\u00020\u000fJ$\u00101\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u00102\u001a\u00020\u000f2\f\u00103\u001a\b\u0012\u0004\u0012\u00020+0*J\u0016\u00104\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020%J\u000e\u00105\u001a\u00020\u00112\u0006\u00105\u001a\u00020\u0013J\u0016\u00106\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u00107\u001a\u000208J\u0018\u00109\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u000208H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006;"}, d2 = {"Lokhttp3/internal/http2/Http2Writer;", "Ljava/io/Closeable;", "sink", "Lokio/BufferedSink;", "client", "", "(Lokio/BufferedSink;Z)V", "closed", "hpackBuffer", "Lokio/Buffer;", "hpackWriter", "Lokhttp3/internal/http2/Hpack$Writer;", "getHpackWriter", "()Lokhttp3/internal/http2/Hpack$Writer;", "maxFrameSize", "", "applyAndAckSettings", "", "peerSettings", "Lokhttp3/internal/http2/Settings;", "close", "connectionPreface", "data", "outFinished", "streamId", "source", "byteCount", "dataFrame", "flags", "buffer", "flush", "frameHeader", "length", "type", "goAway", "lastGoodStreamId", com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, "Lokhttp3/internal/http2/ErrorCode;", "debugData", "", "headers", "headerBlock", "", "Lokhttp3/internal/http2/Header;", "maxDataLength", "ping", "ack", "payload1", "payload2", "pushPromise", "promisedStreamId", "requestHeaders", "rstStream", "settings", "windowUpdate", "windowSizeIncrement", "", "writeContinuationFrames", "Companion", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Http2Writer implements java.io.Closeable {
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(okhttp3.internal.http2.Http2.class.getName());
    private final boolean client;
    private boolean closed;
    private final okio.Buffer hpackBuffer;
    private final okhttp3.internal.http2.Hpack.Writer hpackWriter;
    private int maxFrameSize;
    private final okio.BufferedSink sink;

    public Http2Writer(okio.BufferedSink sink, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "sink");
        this.sink = sink;
        this.client = z;
        okio.Buffer buffer = new okio.Buffer();
        this.hpackBuffer = buffer;
        this.maxFrameSize = 16384;
        this.hpackWriter = new okhttp3.internal.http2.Hpack.Writer(0, false, buffer, 3, null);
    }

    public final okhttp3.internal.http2.Hpack.Writer getHpackWriter() {
        return this.hpackWriter;
    }

    public final synchronized void connectionPreface() throws java.io.IOException {
        if (this.closed) {
            throw new java.io.IOException("closed");
        }
        if (this.client) {
            java.util.logging.Logger logger2 = logger;
            if (logger2.isLoggable(java.util.logging.Level.FINE)) {
                logger2.fine(okhttp3.internal.Util.format(">> CONNECTION " + okhttp3.internal.http2.Http2.CONNECTION_PREFACE.hex(), new java.lang.Object[0]));
            }
            this.sink.write(okhttp3.internal.http2.Http2.CONNECTION_PREFACE);
            this.sink.flush();
        }
    }

    public final synchronized void applyAndAckSettings(okhttp3.internal.http2.Settings peerSettings) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(peerSettings, "peerSettings");
        if (this.closed) {
            throw new java.io.IOException("closed");
        }
        this.maxFrameSize = peerSettings.getMaxFrameSize(this.maxFrameSize);
        if (peerSettings.getHeaderTableSize() != -1) {
            this.hpackWriter.resizeHeaderTable(peerSettings.getHeaderTableSize());
        }
        frameHeader(0, 0, 4, 1);
        this.sink.flush();
    }

    public final synchronized void pushPromise(int streamId, int promisedStreamId, java.util.List<okhttp3.internal.http2.Header> requestHeaders) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        if (this.closed) {
            throw new java.io.IOException("closed");
        }
        this.hpackWriter.writeHeaders(requestHeaders);
        long size = this.hpackBuffer.size();
        int iMin = (int) java.lang.Math.min(((long) this.maxFrameSize) - 4, size);
        long j = iMin;
        frameHeader(streamId, iMin + 4, 5, size == j ? 4 : 0);
        this.sink.writeInt(promisedStreamId & Integer.MAX_VALUE);
        this.sink.write(this.hpackBuffer, j);
        if (size > j) {
            writeContinuationFrames(streamId, size - j);
        }
    }

    public final synchronized void flush() throws java.io.IOException {
        if (this.closed) {
            throw new java.io.IOException("closed");
        }
        this.sink.flush();
    }

    public final synchronized void rstStream(int streamId, okhttp3.internal.http2.ErrorCode errorCode) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        if (this.closed) {
            throw new java.io.IOException("closed");
        }
        if (!(errorCode.getHttpCode() != -1)) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        frameHeader(streamId, 4, 3, 0);
        this.sink.writeInt(errorCode.getHttpCode());
        this.sink.flush();
    }

    /* JADX INFO: renamed from: maxDataLength, reason: from getter */
    public final int getMaxFrameSize() {
        return this.maxFrameSize;
    }

    public final synchronized void data(boolean outFinished, int streamId, okio.Buffer source, int byteCount) throws java.io.IOException {
        if (this.closed) {
            throw new java.io.IOException("closed");
        }
        dataFrame(streamId, outFinished ? 1 : 0, source, byteCount);
    }

    public final void dataFrame(int streamId, int flags, okio.Buffer buffer, int byteCount) throws java.io.IOException {
        frameHeader(streamId, byteCount, 0, flags);
        if (byteCount > 0) {
            okio.BufferedSink bufferedSink = this.sink;
            kotlin.jvm.internal.Intrinsics.checkNotNull(buffer);
            bufferedSink.write(buffer, byteCount);
        }
    }

    public final synchronized void settings(okhttp3.internal.http2.Settings settings) throws java.io.IOException {
        int i;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settings, "settings");
        if (this.closed) {
            throw new java.io.IOException("closed");
        }
        int i2 = 0;
        frameHeader(0, settings.size() * 6, 4, 0);
        while (i2 < 10) {
            if (settings.isSet(i2)) {
                if (i2 != 4) {
                    i = i2 != 7 ? i2 : 4;
                } else {
                    i = 3;
                }
                this.sink.writeShort(i);
                this.sink.writeInt(settings.get(i2));
            }
            i2++;
        }
        this.sink.flush();
    }

    public final synchronized void ping(boolean ack, int payload1, int payload2) throws java.io.IOException {
        if (this.closed) {
            throw new java.io.IOException("closed");
        }
        frameHeader(0, 8, 6, ack ? 1 : 0);
        this.sink.writeInt(payload1);
        this.sink.writeInt(payload2);
        this.sink.flush();
    }

    public final synchronized void goAway(int lastGoodStreamId, okhttp3.internal.http2.ErrorCode errorCode, byte[] debugData) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debugData, "debugData");
        if (this.closed) {
            throw new java.io.IOException("closed");
        }
        if (!(errorCode.getHttpCode() != -1)) {
            throw new java.lang.IllegalArgumentException("errorCode.httpCode == -1".toString());
        }
        frameHeader(0, debugData.length + 8, 7, 0);
        this.sink.writeInt(lastGoodStreamId);
        this.sink.writeInt(errorCode.getHttpCode());
        if (!(debugData.length == 0)) {
            this.sink.write(debugData);
        }
        this.sink.flush();
    }

    public final synchronized void windowUpdate(int streamId, long windowSizeIncrement) throws java.io.IOException {
        if (this.closed) {
            throw new java.io.IOException("closed");
        }
        if (!(windowSizeIncrement != 0 && windowSizeIncrement <= 2147483647L)) {
            throw new java.lang.IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + windowSizeIncrement).toString());
        }
        frameHeader(streamId, 4, 8, 0);
        this.sink.writeInt((int) windowSizeIncrement);
        this.sink.flush();
    }

    public final void frameHeader(int streamId, int length, int type, int flags) throws java.io.IOException {
        java.util.logging.Logger logger2 = logger;
        if (logger2.isLoggable(java.util.logging.Level.FINE)) {
            logger2.fine(okhttp3.internal.http2.Http2.INSTANCE.frameLog(false, streamId, length, type, flags));
        }
        if (!(length <= this.maxFrameSize)) {
            throw new java.lang.IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.maxFrameSize + ": " + length).toString());
        }
        if (!((Integer.MIN_VALUE & streamId) == 0)) {
            throw new java.lang.IllegalArgumentException(("reserved bit set: " + streamId).toString());
        }
        okhttp3.internal.Util.writeMedium(this.sink, length);
        this.sink.writeByte(type & 255);
        this.sink.writeByte(flags & 255);
        this.sink.writeInt(streamId & Integer.MAX_VALUE);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws java.io.IOException {
        this.closed = true;
        this.sink.close();
    }

    private final void writeContinuationFrames(int streamId, long byteCount) throws java.io.IOException {
        while (byteCount > 0) {
            long jMin = java.lang.Math.min(this.maxFrameSize, byteCount);
            byteCount -= jMin;
            frameHeader(streamId, (int) jMin, 9, byteCount == 0 ? 4 : 0);
            this.sink.write(this.hpackBuffer, jMin);
        }
    }

    public final synchronized void headers(boolean outFinished, int streamId, java.util.List<okhttp3.internal.http2.Header> headerBlock) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headerBlock, "headerBlock");
        if (this.closed) {
            throw new java.io.IOException("closed");
        }
        this.hpackWriter.writeHeaders(headerBlock);
        long size = this.hpackBuffer.size();
        long jMin = java.lang.Math.min(this.maxFrameSize, size);
        int i = size == jMin ? 4 : 0;
        if (outFinished) {
            i |= 1;
        }
        frameHeader(streamId, (int) jMin, 1, i);
        this.sink.write(this.hpackBuffer, jMin);
        if (size > jMin) {
            writeContinuationFrames(streamId, size - jMin);
        }
    }
}
