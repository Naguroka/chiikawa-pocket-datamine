package okhttp3.internal.http2;

/* JADX INFO: compiled from: Http2Stream.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 _2\u00020\u0001:\u0004_`abB1\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\u000e\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020#J\r\u0010C\u001a\u00020AH\u0000¢\u0006\u0002\bDJ\r\u0010E\u001a\u00020AH\u0000¢\u0006\u0002\bFJ\u0018\u0010G\u001a\u00020A2\u0006\u0010H\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015J\u001a\u0010I\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0002J\u000e\u0010J\u001a\u00020A2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010K\u001a\u00020A2\u0006\u0010L\u001a\u00020\nJ\u0006\u0010M\u001a\u00020NJ\u0006\u0010O\u001a\u00020PJ\u0006\u0010,\u001a\u00020QJ\u0016\u0010R\u001a\u00020A2\u0006\u00104\u001a\u00020S2\u0006\u0010T\u001a\u00020\u0003J\u0016\u0010U\u001a\u00020A2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010V\u001a\u00020A2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010W\u001a\u00020\nJ\u0006\u0010L\u001a\u00020\nJ\r\u0010X\u001a\u00020AH\u0000¢\u0006\u0002\bYJ$\u0010Z\u001a\u00020A2\f\u0010[\u001a\b\u0012\u0004\u0012\u00020]0\\2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010^\u001a\u00020\u0007J\u0006\u0010>\u001a\u00020QR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u000f8@X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u001f\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0011\u0010!\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b!\u0010 R$\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020#@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R$\u0010)\u001a\u00020#2\u0006\u0010\"\u001a\u00020#@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010&\"\u0004\b+\u0010(R\u0018\u0010,\u001a\u00060-R\u00020\u0000X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0018\u00100\u001a\u000601R\u00020\u0000X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0018\u00104\u001a\u000605R\u00020\u0000X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R$\u00108\u001a\u00020#2\u0006\u0010\"\u001a\u00020#@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010&\"\u0004\b:\u0010(R$\u0010;\u001a\u00020#2\u0006\u0010\"\u001a\u00020#@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010&\"\u0004\b=\u0010(R\u0018\u0010>\u001a\u00060-R\u00020\u0000X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u0010/¨\u0006c"}, d2 = {"Lokhttp3/internal/http2/Http2Stream;", "", "id", "", "connection", "Lokhttp3/internal/http2/Http2Connection;", "outFinished", "", "inFinished", "headers", "Lokhttp3/Headers;", "(ILokhttp3/internal/http2/Http2Connection;ZZLokhttp3/Headers;)V", "getConnection", "()Lokhttp3/internal/http2/Http2Connection;", com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, "Lokhttp3/internal/http2/ErrorCode;", "getErrorCode$okhttp", "()Lokhttp3/internal/http2/ErrorCode;", "setErrorCode$okhttp", "(Lokhttp3/internal/http2/ErrorCode;)V", "errorException", "Ljava/io/IOException;", "getErrorException$okhttp", "()Ljava/io/IOException;", "setErrorException$okhttp", "(Ljava/io/IOException;)V", "hasResponseHeaders", "headersQueue", "Ljava/util/ArrayDeque;", "getId", "()I", "isLocallyInitiated", "()Z", "isOpen", "<set-?>", "", "readBytesAcknowledged", "getReadBytesAcknowledged", "()J", "setReadBytesAcknowledged$okhttp", "(J)V", "readBytesTotal", "getReadBytesTotal", "setReadBytesTotal$okhttp", "readTimeout", "Lokhttp3/internal/http2/Http2Stream$StreamTimeout;", "getReadTimeout$okhttp", "()Lokhttp3/internal/http2/Http2Stream$StreamTimeout;", "sink", "Lokhttp3/internal/http2/Http2Stream$FramingSink;", "getSink$okhttp", "()Lokhttp3/internal/http2/Http2Stream$FramingSink;", "source", "Lokhttp3/internal/http2/Http2Stream$FramingSource;", "getSource$okhttp", "()Lokhttp3/internal/http2/Http2Stream$FramingSource;", "writeBytesMaximum", "getWriteBytesMaximum", "setWriteBytesMaximum$okhttp", "writeBytesTotal", "getWriteBytesTotal", "setWriteBytesTotal$okhttp", "writeTimeout", "getWriteTimeout$okhttp", "addBytesToWriteWindow", "", "delta", "cancelStreamIfNecessary", "cancelStreamIfNecessary$okhttp", "checkOutNotClosed", "checkOutNotClosed$okhttp", "close", "rstStatusCode", "closeInternal", "closeLater", "enqueueTrailers", "trailers", "getSink", "Lokio/Sink;", "getSource", "Lokio/Source;", "Lokio/Timeout;", "receiveData", "Lokio/BufferedSource;", "length", "receiveHeaders", "receiveRstStream", "takeHeaders", "waitForIo", "waitForIo$okhttp", "writeHeaders", "responseHeaders", "", "Lokhttp3/internal/http2/Header;", "flushHeaders", "Companion", "FramingSink", "FramingSource", "StreamTimeout", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Http2Stream {
    public static final long EMIT_BUFFER_SIZE = 16384;
    private final okhttp3.internal.http2.Http2Connection connection;
    private okhttp3.internal.http2.ErrorCode errorCode;
    private java.io.IOException errorException;
    private boolean hasResponseHeaders;
    private final java.util.ArrayDeque<okhttp3.Headers> headersQueue;
    private final int id;
    private long readBytesAcknowledged;
    private long readBytesTotal;
    private final okhttp3.internal.http2.Http2Stream.StreamTimeout readTimeout;
    private final okhttp3.internal.http2.Http2Stream.FramingSink sink;
    private final okhttp3.internal.http2.Http2Stream.FramingSource source;
    private long writeBytesMaximum;
    private long writeBytesTotal;
    private final okhttp3.internal.http2.Http2Stream.StreamTimeout writeTimeout;

    public Http2Stream(int i, okhttp3.internal.http2.Http2Connection connection, boolean z, boolean z2, okhttp3.Headers headers) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connection, "connection");
        this.id = i;
        this.connection = connection;
        this.writeBytesMaximum = connection.getPeerSettings().getInitialWindowSize();
        java.util.ArrayDeque<okhttp3.Headers> arrayDeque = new java.util.ArrayDeque<>();
        this.headersQueue = arrayDeque;
        this.source = new okhttp3.internal.http2.Http2Stream.FramingSource(connection.getOkHttpSettings().getInitialWindowSize(), z2);
        this.sink = new okhttp3.internal.http2.Http2Stream.FramingSink(z);
        this.readTimeout = new okhttp3.internal.http2.Http2Stream.StreamTimeout();
        this.writeTimeout = new okhttp3.internal.http2.Http2Stream.StreamTimeout();
        if (headers != null) {
            if (!(!isLocallyInitiated())) {
                throw new java.lang.IllegalStateException("locally-initiated streams shouldn't have headers yet".toString());
            }
            arrayDeque.add(headers);
        } else if (!isLocallyInitiated()) {
            throw new java.lang.IllegalStateException("remotely-initiated streams should have headers".toString());
        }
    }

    public final int getId() {
        return this.id;
    }

    public final okhttp3.internal.http2.Http2Connection getConnection() {
        return this.connection;
    }

    public final long getReadBytesTotal() {
        return this.readBytesTotal;
    }

    public final void setReadBytesTotal$okhttp(long j) {
        this.readBytesTotal = j;
    }

    public final long getReadBytesAcknowledged() {
        return this.readBytesAcknowledged;
    }

    public final void setReadBytesAcknowledged$okhttp(long j) {
        this.readBytesAcknowledged = j;
    }

    public final long getWriteBytesTotal() {
        return this.writeBytesTotal;
    }

    public final void setWriteBytesTotal$okhttp(long j) {
        this.writeBytesTotal = j;
    }

    public final long getWriteBytesMaximum() {
        return this.writeBytesMaximum;
    }

    public final void setWriteBytesMaximum$okhttp(long j) {
        this.writeBytesMaximum = j;
    }

    /* JADX INFO: renamed from: getSource$okhttp, reason: from getter */
    public final okhttp3.internal.http2.Http2Stream.FramingSource getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: getSink$okhttp, reason: from getter */
    public final okhttp3.internal.http2.Http2Stream.FramingSink getSink() {
        return this.sink;
    }

    /* JADX INFO: renamed from: getReadTimeout$okhttp, reason: from getter */
    public final okhttp3.internal.http2.Http2Stream.StreamTimeout getReadTimeout() {
        return this.readTimeout;
    }

    /* JADX INFO: renamed from: getWriteTimeout$okhttp, reason: from getter */
    public final okhttp3.internal.http2.Http2Stream.StreamTimeout getWriteTimeout() {
        return this.writeTimeout;
    }

    public final synchronized okhttp3.internal.http2.ErrorCode getErrorCode$okhttp() {
        return this.errorCode;
    }

    public final void setErrorCode$okhttp(okhttp3.internal.http2.ErrorCode errorCode) {
        this.errorCode = errorCode;
    }

    /* JADX INFO: renamed from: getErrorException$okhttp, reason: from getter */
    public final java.io.IOException getErrorException() {
        return this.errorException;
    }

    public final void setErrorException$okhttp(java.io.IOException iOException) {
        this.errorException = iOException;
    }

    public final synchronized boolean isOpen() {
        if (this.errorCode != null) {
            return false;
        }
        return ((this.source.getFinished() || this.source.getClosed()) && (this.sink.getFinished() || this.sink.getClosed()) && this.hasResponseHeaders) ? false : true;
    }

    public final boolean isLocallyInitiated() {
        return this.connection.getClient() == ((this.id & 1) == 1);
    }

    public final synchronized okhttp3.Headers takeHeaders() throws java.io.IOException {
        okhttp3.Headers headersRemoveFirst;
        this.readTimeout.enter();
        while (this.headersQueue.isEmpty() && this.errorCode == null) {
            try {
                waitForIo$okhttp();
            } catch (java.lang.Throwable th) {
                this.readTimeout.exitAndThrowIfTimedOut();
                throw th;
            }
        }
        this.readTimeout.exitAndThrowIfTimedOut();
        if (!this.headersQueue.isEmpty()) {
            headersRemoveFirst = this.headersQueue.removeFirst();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(headersRemoveFirst, "headersQueue.removeFirst()");
        } else {
            java.lang.Throwable streamResetException = this.errorException;
            if (streamResetException == null) {
                okhttp3.internal.http2.ErrorCode errorCode = this.errorCode;
                kotlin.jvm.internal.Intrinsics.checkNotNull(errorCode);
                streamResetException = new okhttp3.internal.http2.StreamResetException(errorCode);
            }
            throw streamResetException;
        }
        return headersRemoveFirst;
    }

    public final synchronized okhttp3.Headers trailers() throws java.io.IOException {
        okhttp3.Headers trailers;
        if (this.source.getFinished() && this.source.getReceiveBuffer().exhausted() && this.source.getReadBuffer().exhausted()) {
            trailers = this.source.getTrailers();
            if (trailers == null) {
                trailers = okhttp3.internal.Util.EMPTY_HEADERS;
            }
        } else {
            if (this.errorCode != null) {
                java.lang.Throwable streamResetException = this.errorException;
                if (streamResetException == null) {
                    okhttp3.internal.http2.ErrorCode errorCode = this.errorCode;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(errorCode);
                    streamResetException = new okhttp3.internal.http2.StreamResetException(errorCode);
                }
                throw streamResetException;
            }
            throw new java.lang.IllegalStateException("too early; can't read the trailers yet");
        }
        return trailers;
    }

    public final void enqueueTrailers(okhttp3.Headers trailers) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trailers, "trailers");
        synchronized (this) {
            boolean z = true;
            if (!(!this.sink.getFinished())) {
                throw new java.lang.IllegalStateException("already finished".toString());
            }
            if (trailers.size() == 0) {
                z = false;
            }
            if (!z) {
                throw new java.lang.IllegalArgumentException("trailers.size() == 0".toString());
            }
            this.sink.setTrailers(trailers);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    public final okio.Timeout readTimeout() {
        return this.readTimeout;
    }

    public final okio.Timeout writeTimeout() {
        return this.writeTimeout;
    }

    public final okio.Source getSource() {
        return this.source;
    }

    public final okio.Sink getSink() {
        synchronized (this) {
            if (!(this.hasResponseHeaders || isLocallyInitiated())) {
                throw new java.lang.IllegalStateException("reply before requesting the sink".toString());
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
        return this.sink;
    }

    public final void close(okhttp3.internal.http2.ErrorCode rstStatusCode, java.io.IOException errorException) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rstStatusCode, "rstStatusCode");
        if (closeInternal(rstStatusCode, errorException)) {
            this.connection.writeSynReset$okhttp(this.id, rstStatusCode);
        }
    }

    public final void closeLater(okhttp3.internal.http2.ErrorCode errorCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        if (closeInternal(errorCode, null)) {
            this.connection.writeSynResetLater$okhttp(this.id, errorCode);
        }
    }

    public final synchronized void receiveRstStream(okhttp3.internal.http2.ErrorCode errorCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        if (this.errorCode == null) {
            this.errorCode = errorCode;
            kotlin.jvm.internal.Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    /* JADX INFO: compiled from: Http2Stream.kt */
    @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0018\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u0003H\u0016J\u001d\u0010\u001f\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020!2\u0006\u0010\u001e\u001a\u00020\u0003H\u0000¢\u0006\u0002\b\"J\b\u0010#\u001a\u00020$H\u0016J\u0010\u0010%\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0003H\u0002R\u001a\u0010\u0007\u001a\u00020\u0005X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006&"}, d2 = {"Lokhttp3/internal/http2/Http2Stream$FramingSource;", "Lokio/Source;", "maxByteCount", "", "finished", "", "(Lokhttp3/internal/http2/Http2Stream;JZ)V", "closed", "getClosed$okhttp", "()Z", "setClosed$okhttp", "(Z)V", "getFinished$okhttp", "setFinished$okhttp", "readBuffer", "Lokio/Buffer;", "getReadBuffer", "()Lokio/Buffer;", "receiveBuffer", "getReceiveBuffer", "trailers", "Lokhttp3/Headers;", "getTrailers", "()Lokhttp3/Headers;", "setTrailers", "(Lokhttp3/Headers;)V", "close", "", "read", "sink", "byteCount", "receive", "source", "Lokio/BufferedSource;", "receive$okhttp", "timeout", "Lokio/Timeout;", "updateConnectionFlowControl", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class FramingSource implements okio.Source {
        private boolean closed;
        private boolean finished;
        private final long maxByteCount;
        private okhttp3.Headers trailers;
        private final okio.Buffer receiveBuffer = new okio.Buffer();
        private final okio.Buffer readBuffer = new okio.Buffer();

        public FramingSource(long j, boolean z) {
            this.maxByteCount = j;
            this.finished = z;
        }

        /* JADX INFO: renamed from: getFinished$okhttp, reason: from getter */
        public final boolean getFinished() {
            return this.finished;
        }

        public final void setFinished$okhttp(boolean z) {
            this.finished = z;
        }

        public final okio.Buffer getReceiveBuffer() {
            return this.receiveBuffer;
        }

        public final okio.Buffer getReadBuffer() {
            return this.readBuffer;
        }

        public final okhttp3.Headers getTrailers() {
            return this.trailers;
        }

        public final void setTrailers(okhttp3.Headers headers) {
            this.trailers = headers;
        }

        /* JADX INFO: renamed from: getClosed$okhttp, reason: from getter */
        public final boolean getClosed() {
            return this.closed;
        }

        public final void setClosed$okhttp(boolean z) {
            this.closed = z;
        }

        @Override // okio.Source
        public long read(okio.Buffer sink, long byteCount) throws java.io.IOException {
            okhttp3.internal.http2.StreamResetException errorException;
            long j;
            boolean z;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "sink");
            long j2 = 0;
            if (!(byteCount >= 0)) {
                throw new java.lang.IllegalArgumentException(("byteCount < 0: " + byteCount).toString());
            }
            while (true) {
                okhttp3.internal.http2.Http2Stream http2Stream = okhttp3.internal.http2.Http2Stream.this;
                synchronized (http2Stream) {
                    http2Stream.getReadTimeout().enter();
                    try {
                        if (http2Stream.getErrorCode$okhttp() == null || this.finished) {
                            errorException = null;
                        } else {
                            errorException = http2Stream.getErrorException();
                            if (errorException == null) {
                                okhttp3.internal.http2.ErrorCode errorCode$okhttp = http2Stream.getErrorCode$okhttp();
                                kotlin.jvm.internal.Intrinsics.checkNotNull(errorCode$okhttp);
                                errorException = new okhttp3.internal.http2.StreamResetException(errorCode$okhttp);
                            }
                        }
                        if (this.closed) {
                            throw new java.io.IOException("stream closed");
                        }
                        if (this.readBuffer.size() > j2) {
                            okio.Buffer buffer = this.readBuffer;
                            j = buffer.read(sink, java.lang.Math.min(byteCount, buffer.size()));
                            http2Stream.setReadBytesTotal$okhttp(http2Stream.getReadBytesTotal() + j);
                            long readBytesTotal = http2Stream.getReadBytesTotal() - http2Stream.getReadBytesAcknowledged();
                            if (errorException == null && readBytesTotal >= http2Stream.getConnection().getOkHttpSettings().getInitialWindowSize() / 2) {
                                http2Stream.getConnection().writeWindowUpdateLater$okhttp(http2Stream.getId(), readBytesTotal);
                                http2Stream.setReadBytesAcknowledged$okhttp(http2Stream.getReadBytesTotal());
                            }
                        } else {
                            if (this.finished || errorException != null) {
                                j = -1;
                            } else {
                                http2Stream.waitForIo$okhttp();
                                j = -1;
                                z = true;
                            }
                            http2Stream.getReadTimeout().exitAndThrowIfTimedOut();
                            kotlin.Unit unit = kotlin.Unit.INSTANCE;
                        }
                        z = false;
                        http2Stream.getReadTimeout().exitAndThrowIfTimedOut();
                        kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                    } catch (java.lang.Throwable th) {
                        http2Stream.getReadTimeout().exitAndThrowIfTimedOut();
                        throw th;
                    }
                }
                if (!z) {
                    if (j != -1) {
                        return j;
                    }
                    if (errorException == null) {
                        return -1L;
                    }
                    throw errorException;
                }
                j2 = 0;
            }
        }

        private final void updateConnectionFlowControl(long read) {
            okhttp3.internal.http2.Http2Stream http2Stream = okhttp3.internal.http2.Http2Stream.this;
            if (!okhttp3.internal.Util.assertionsEnabled || !java.lang.Thread.holdsLock(http2Stream)) {
                okhttp3.internal.http2.Http2Stream.this.getConnection().updateConnectionFlowControl$okhttp(read);
                return;
            }
            throw new java.lang.AssertionError("Thread " + java.lang.Thread.currentThread().getName() + " MUST NOT hold lock on " + http2Stream);
        }

        public final void receive$okhttp(okio.BufferedSource source, long byteCount) throws java.io.IOException {
            boolean z;
            boolean z2;
            boolean z3;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
            okhttp3.internal.http2.Http2Stream http2Stream = okhttp3.internal.http2.Http2Stream.this;
            if (!okhttp3.internal.Util.assertionsEnabled || !java.lang.Thread.holdsLock(http2Stream)) {
                long j = byteCount;
                while (j > 0) {
                    synchronized (okhttp3.internal.http2.Http2Stream.this) {
                        z = this.finished;
                        z2 = true;
                        z3 = this.readBuffer.size() + j > this.maxByteCount;
                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    }
                    if (z3) {
                        source.skip(j);
                        okhttp3.internal.http2.Http2Stream.this.closeLater(okhttp3.internal.http2.ErrorCode.FLOW_CONTROL_ERROR);
                        return;
                    }
                    if (z) {
                        source.skip(j);
                        return;
                    }
                    long j2 = source.read(this.receiveBuffer, j);
                    if (j2 == -1) {
                        throw new java.io.EOFException();
                    }
                    j -= j2;
                    okhttp3.internal.http2.Http2Stream http2Stream2 = okhttp3.internal.http2.Http2Stream.this;
                    synchronized (http2Stream2) {
                        if (this.closed) {
                            this.receiveBuffer.clear();
                        } else {
                            if (this.readBuffer.size() != 0) {
                                z2 = false;
                            }
                            this.readBuffer.writeAll(this.receiveBuffer);
                            if (z2) {
                                kotlin.jvm.internal.Intrinsics.checkNotNull(http2Stream2, "null cannot be cast to non-null type java.lang.Object");
                                http2Stream2.notifyAll();
                            }
                        }
                        kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                    }
                }
                updateConnectionFlowControl(byteCount);
                return;
            }
            throw new java.lang.AssertionError("Thread " + java.lang.Thread.currentThread().getName() + " MUST NOT hold lock on " + http2Stream);
        }

        @Override // okio.Source
        /* JADX INFO: renamed from: timeout */
        public okio.Timeout getTimeout() {
            return okhttp3.internal.http2.Http2Stream.this.getReadTimeout();
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws java.io.IOException {
            long size;
            okhttp3.internal.http2.Http2Stream http2Stream = okhttp3.internal.http2.Http2Stream.this;
            synchronized (http2Stream) {
                this.closed = true;
                size = this.readBuffer.size();
                this.readBuffer.clear();
                kotlin.jvm.internal.Intrinsics.checkNotNull(http2Stream, "null cannot be cast to non-null type java.lang.Object");
                http2Stream.notifyAll();
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
            if (size > 0) {
                updateConnectionFlowControl(size);
            }
            okhttp3.internal.http2.Http2Stream.this.cancelStreamIfNecessary$okhttp();
        }
    }

    /* JADX INFO: compiled from: Http2Stream.kt */
    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0080\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0003H\u0002J\b\u0010\u0018\u001a\u00020\u0015H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0018\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\tR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lokhttp3/internal/http2/Http2Stream$FramingSink;", "Lokio/Sink;", "finished", "", "(Lokhttp3/internal/http2/Http2Stream;Z)V", "closed", "getClosed", "()Z", "setClosed", "(Z)V", "getFinished", "setFinished", "sendBuffer", "Lokio/Buffer;", "trailers", "Lokhttp3/Headers;", "getTrailers", "()Lokhttp3/Headers;", "setTrailers", "(Lokhttp3/Headers;)V", "close", "", "emitFrame", "outFinishedOnLastFrame", "flush", "timeout", "Lokio/Timeout;", "write", "source", "byteCount", "", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class FramingSink implements okio.Sink {
        private boolean closed;
        private boolean finished;
        private final okio.Buffer sendBuffer;
        private okhttp3.Headers trailers;

        public FramingSink(boolean z) {
            this.finished = z;
            this.sendBuffer = new okio.Buffer();
        }

        public /* synthetic */ FramingSink(okhttp3.internal.http2.Http2Stream http2Stream, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z);
        }

        public final boolean getFinished() {
            return this.finished;
        }

        public final void setFinished(boolean z) {
            this.finished = z;
        }

        public final okhttp3.Headers getTrailers() {
            return this.trailers;
        }

        public final void setTrailers(okhttp3.Headers headers) {
            this.trailers = headers;
        }

        public final boolean getClosed() {
            return this.closed;
        }

        public final void setClosed(boolean z) {
            this.closed = z;
        }

        @Override // okio.Sink
        public void write(okio.Buffer source, long byteCount) throws java.io.IOException {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
            okhttp3.internal.http2.Http2Stream http2Stream = okhttp3.internal.http2.Http2Stream.this;
            if (!okhttp3.internal.Util.assertionsEnabled || !java.lang.Thread.holdsLock(http2Stream)) {
                this.sendBuffer.write(source, byteCount);
                while (this.sendBuffer.size() >= 16384) {
                    emitFrame(false);
                }
                return;
            }
            throw new java.lang.AssertionError("Thread " + java.lang.Thread.currentThread().getName() + " MUST NOT hold lock on " + http2Stream);
        }

        private final void emitFrame(boolean outFinishedOnLastFrame) throws java.io.IOException {
            long jMin;
            boolean z;
            okhttp3.internal.http2.Http2Stream http2Stream = okhttp3.internal.http2.Http2Stream.this;
            synchronized (http2Stream) {
                http2Stream.getWriteTimeout().enter();
                while (http2Stream.getWriteBytesTotal() >= http2Stream.getWriteBytesMaximum() && !this.finished && !this.closed && http2Stream.getErrorCode$okhttp() == null) {
                    try {
                        http2Stream.waitForIo$okhttp();
                    } catch (java.lang.Throwable th) {
                        http2Stream.getWriteTimeout().exitAndThrowIfTimedOut();
                        throw th;
                    }
                }
                http2Stream.getWriteTimeout().exitAndThrowIfTimedOut();
                http2Stream.checkOutNotClosed$okhttp();
                jMin = java.lang.Math.min(http2Stream.getWriteBytesMaximum() - http2Stream.getWriteBytesTotal(), this.sendBuffer.size());
                http2Stream.setWriteBytesTotal$okhttp(http2Stream.getWriteBytesTotal() + jMin);
                z = outFinishedOnLastFrame && jMin == this.sendBuffer.size();
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
            okhttp3.internal.http2.Http2Stream.this.getWriteTimeout().enter();
            try {
                okhttp3.internal.http2.Http2Stream.this.getConnection().writeData(okhttp3.internal.http2.Http2Stream.this.getId(), z, this.sendBuffer, jMin);
            } finally {
                okhttp3.internal.http2.Http2Stream.this.getWriteTimeout().exitAndThrowIfTimedOut();
            }
        }

        @Override // okio.Sink, java.io.Flushable
        public void flush() throws java.io.IOException {
            okhttp3.internal.http2.Http2Stream http2Stream = okhttp3.internal.http2.Http2Stream.this;
            if (!okhttp3.internal.Util.assertionsEnabled || !java.lang.Thread.holdsLock(http2Stream)) {
                okhttp3.internal.http2.Http2Stream http2Stream2 = okhttp3.internal.http2.Http2Stream.this;
                synchronized (http2Stream2) {
                    http2Stream2.checkOutNotClosed$okhttp();
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                }
                while (this.sendBuffer.size() > 0) {
                    emitFrame(false);
                    okhttp3.internal.http2.Http2Stream.this.getConnection().flush();
                }
                return;
            }
            throw new java.lang.AssertionError("Thread " + java.lang.Thread.currentThread().getName() + " MUST NOT hold lock on " + http2Stream);
        }

        @Override // okio.Sink
        /* JADX INFO: renamed from: timeout */
        public okio.Timeout getTimeout() {
            return okhttp3.internal.http2.Http2Stream.this.getWriteTimeout();
        }

        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws java.io.IOException {
            okhttp3.internal.http2.Http2Stream http2Stream = okhttp3.internal.http2.Http2Stream.this;
            if (!okhttp3.internal.Util.assertionsEnabled || !java.lang.Thread.holdsLock(http2Stream)) {
                okhttp3.internal.http2.Http2Stream http2Stream2 = okhttp3.internal.http2.Http2Stream.this;
                synchronized (http2Stream2) {
                    if (this.closed) {
                        return;
                    }
                    boolean z = http2Stream2.getErrorCode$okhttp() == null;
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    if (!okhttp3.internal.http2.Http2Stream.this.getSink().finished) {
                        boolean z2 = this.sendBuffer.size() > 0;
                        if (this.trailers != null) {
                            while (this.sendBuffer.size() > 0) {
                                emitFrame(false);
                            }
                            okhttp3.internal.http2.Http2Connection connection = okhttp3.internal.http2.Http2Stream.this.getConnection();
                            int id = okhttp3.internal.http2.Http2Stream.this.getId();
                            okhttp3.Headers headers = this.trailers;
                            kotlin.jvm.internal.Intrinsics.checkNotNull(headers);
                            connection.writeHeaders$okhttp(id, z, okhttp3.internal.Util.toHeaderList(headers));
                        } else if (z2) {
                            while (this.sendBuffer.size() > 0) {
                                emitFrame(true);
                            }
                        } else if (z) {
                            okhttp3.internal.http2.Http2Stream.this.getConnection().writeData(okhttp3.internal.http2.Http2Stream.this.getId(), true, null, 0L);
                        }
                    }
                    synchronized (okhttp3.internal.http2.Http2Stream.this) {
                        this.closed = true;
                        kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                    }
                    okhttp3.internal.http2.Http2Stream.this.getConnection().flush();
                    okhttp3.internal.http2.Http2Stream.this.cancelStreamIfNecessary$okhttp();
                    return;
                }
            }
            throw new java.lang.AssertionError("Thread " + java.lang.Thread.currentThread().getName() + " MUST NOT hold lock on " + http2Stream);
        }
    }

    public final void addBytesToWriteWindow(long delta) {
        this.writeBytesMaximum += delta;
        if (delta > 0) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    public final void checkOutNotClosed$okhttp() throws java.lang.Throwable {
        if (this.sink.getClosed()) {
            throw new java.io.IOException("stream closed");
        }
        if (this.sink.getFinished()) {
            throw new java.io.IOException("stream finished");
        }
        if (this.errorCode != null) {
            java.lang.Throwable streamResetException = this.errorException;
            if (streamResetException == null) {
                okhttp3.internal.http2.ErrorCode errorCode = this.errorCode;
                kotlin.jvm.internal.Intrinsics.checkNotNull(errorCode);
                streamResetException = new okhttp3.internal.http2.StreamResetException(errorCode);
            }
            throw streamResetException;
        }
    }

    /* JADX INFO: compiled from: Http2Stream.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014J\b\u0010\b\u001a\u00020\u0004H\u0014¨\u0006\t"}, d2 = {"Lokhttp3/internal/http2/Http2Stream$StreamTimeout;", "Lokio/AsyncTimeout;", "(Lokhttp3/internal/http2/Http2Stream;)V", "exitAndThrowIfTimedOut", "", "newTimeoutException", "Ljava/io/IOException;", "cause", "timedOut", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class StreamTimeout extends okio.AsyncTimeout {
        public StreamTimeout() {
        }

        @Override // okio.AsyncTimeout
        protected void timedOut() {
            okhttp3.internal.http2.Http2Stream.this.closeLater(okhttp3.internal.http2.ErrorCode.CANCEL);
            okhttp3.internal.http2.Http2Stream.this.getConnection().sendDegradedPingLater$okhttp();
        }

        @Override // okio.AsyncTimeout
        protected java.io.IOException newTimeoutException(java.io.IOException cause) {
            java.net.SocketTimeoutException socketTimeoutException = new java.net.SocketTimeoutException("timeout");
            if (cause != null) {
                socketTimeoutException.initCause(cause);
            }
            return socketTimeoutException;
        }

        public final void exitAndThrowIfTimedOut() throws java.io.IOException {
            if (exit()) {
                throw newTimeoutException(null);
            }
        }
    }

    public final void writeHeaders(java.util.List<okhttp3.internal.http2.Header> responseHeaders, boolean outFinished, boolean flushHeaders) throws java.io.IOException {
        boolean z;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
        if (!okhttp3.internal.Util.assertionsEnabled || !java.lang.Thread.holdsLock(this)) {
            synchronized (this) {
                z = true;
                this.hasResponseHeaders = true;
                if (outFinished) {
                    this.sink.setFinished(true);
                }
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
            if (!flushHeaders) {
                synchronized (this.connection) {
                    if (this.connection.getWriteBytesTotal() < this.connection.getWriteBytesMaximum()) {
                        z = false;
                    }
                    kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                }
                flushHeaders = z;
            }
            this.connection.writeHeaders$okhttp(this.id, outFinished, responseHeaders);
            if (flushHeaders) {
                this.connection.flush();
                return;
            }
            return;
        }
        throw new java.lang.AssertionError("Thread " + java.lang.Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
    }

    private final boolean closeInternal(okhttp3.internal.http2.ErrorCode errorCode, java.io.IOException errorException) {
        if (!okhttp3.internal.Util.assertionsEnabled || !java.lang.Thread.holdsLock(this)) {
            synchronized (this) {
                if (this.errorCode != null) {
                    return false;
                }
                this.errorCode = errorCode;
                this.errorException = errorException;
                kotlin.jvm.internal.Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
                notifyAll();
                if (this.source.getFinished() && this.sink.getFinished()) {
                    return false;
                }
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                this.connection.removeStream$okhttp(this.id);
                return true;
            }
        }
        throw new java.lang.AssertionError("Thread " + java.lang.Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
    }

    public final void receiveData(okio.BufferedSource source, int length) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        if (!okhttp3.internal.Util.assertionsEnabled || !java.lang.Thread.holdsLock(this)) {
            this.source.receive$okhttp(source, length);
            return;
        }
        throw new java.lang.AssertionError("Thread " + java.lang.Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
    }

    public final void receiveHeaders(okhttp3.Headers headers, boolean inFinished) {
        boolean zIsOpen;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "headers");
        if (!okhttp3.internal.Util.assertionsEnabled || !java.lang.Thread.holdsLock(this)) {
            synchronized (this) {
                if (!this.hasResponseHeaders || !inFinished) {
                    this.hasResponseHeaders = true;
                    this.headersQueue.add(headers);
                } else {
                    this.source.setTrailers(headers);
                }
                if (inFinished) {
                    this.source.setFinished$okhttp(true);
                }
                zIsOpen = isOpen();
                kotlin.jvm.internal.Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
                notifyAll();
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
            if (zIsOpen) {
                return;
            }
            this.connection.removeStream$okhttp(this.id);
            return;
        }
        throw new java.lang.AssertionError("Thread " + java.lang.Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
    }

    public final void cancelStreamIfNecessary$okhttp() throws java.io.IOException {
        boolean z;
        boolean zIsOpen;
        if (!okhttp3.internal.Util.assertionsEnabled || !java.lang.Thread.holdsLock(this)) {
            synchronized (this) {
                z = !this.source.getFinished() && this.source.getClosed() && (this.sink.getFinished() || this.sink.getClosed());
                zIsOpen = isOpen();
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
            if (z) {
                close(okhttp3.internal.http2.ErrorCode.CANCEL, null);
                return;
            } else {
                if (zIsOpen) {
                    return;
                }
                this.connection.removeStream$okhttp(this.id);
                return;
            }
        }
        throw new java.lang.AssertionError("Thread " + java.lang.Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
    }

    public final void waitForIo$okhttp() throws java.io.InterruptedIOException {
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
            wait();
        } catch (java.lang.InterruptedException unused) {
            java.lang.Thread.currentThread().interrupt();
            throw new java.io.InterruptedIOException();
        }
    }
}
