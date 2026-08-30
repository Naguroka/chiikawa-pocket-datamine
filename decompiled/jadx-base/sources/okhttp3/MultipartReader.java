package okhttp3;

/* JADX INFO: compiled from: MultipartReader.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001c2\u00020\u0001:\u0003\u001c\u001d\u001eB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0002J\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bR\u0013\u0010\u0007\u001a\u00020\b8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0018\u00010\u0010R\u00020\u0000X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lokhttp3/MultipartReader;", "Ljava/io/Closeable;", com.json.hs.n, "Lokhttp3/ResponseBody;", "(Lokhttp3/ResponseBody;)V", "source", "Lokio/BufferedSource;", "boundary", "", "(Lokio/BufferedSource;Ljava/lang/String;)V", "()Ljava/lang/String;", "closed", "", "crlfDashDashBoundary", "Lokio/ByteString;", "currentPart", "Lokhttp3/MultipartReader$PartSource;", "dashDashBoundary", "noMoreParts", "partCount", "", "close", "", "currentPartBytesRemaining", "", "maxResult", "nextPart", "Lokhttp3/MultipartReader$Part;", "Companion", "Part", "PartSource", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MultipartReader implements java.io.Closeable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final okhttp3.MultipartReader.Companion INSTANCE = new okhttp3.MultipartReader.Companion(null);
    private static final okio.Options afterBoundaryOptions = okio.Options.INSTANCE.of(okio.ByteString.INSTANCE.encodeUtf8("\r\n"), okio.ByteString.INSTANCE.encodeUtf8("--"), okio.ByteString.INSTANCE.encodeUtf8(" "), okio.ByteString.INSTANCE.encodeUtf8("\t"));
    private final java.lang.String boundary;
    private boolean closed;
    private final okio.ByteString crlfDashDashBoundary;
    private okhttp3.MultipartReader.PartSource currentPart;
    private final okio.ByteString dashDashBoundary;
    private boolean noMoreParts;
    private int partCount;
    private final okio.BufferedSource source;

    public MultipartReader(okio.BufferedSource source, java.lang.String boundary) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(boundary, "boundary");
        this.source = source;
        this.boundary = boundary;
        this.dashDashBoundary = new okio.Buffer().writeUtf8("--").writeUtf8(boundary).readByteString();
        this.crlfDashDashBoundary = new okio.Buffer().writeUtf8("\r\n--").writeUtf8(boundary).readByteString();
    }

    /* JADX INFO: renamed from: boundary, reason: from getter */
    public final java.lang.String getBoundary() {
        return this.boundary;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MultipartReader(okhttp3.ResponseBody response) throws java.io.IOException {
        java.lang.String strParameter;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "response");
        okio.BufferedSource bodySource = response.getBodySource();
        okhttp3.MediaType mediaType = response.get$contentType();
        if (mediaType != null && (strParameter = mediaType.parameter("boundary")) != null) {
            this(bodySource, strParameter);
            return;
        }
        throw new java.net.ProtocolException("expected the Content-Type to have a boundary parameter");
    }

    public final okhttp3.MultipartReader.Part nextPart() throws java.io.IOException {
        if (!(!this.closed)) {
            throw new java.lang.IllegalStateException("closed".toString());
        }
        if (this.noMoreParts) {
            return null;
        }
        if (this.partCount == 0 && this.source.rangeEquals(0L, this.dashDashBoundary)) {
            this.source.skip(this.dashDashBoundary.size());
        } else {
            while (true) {
                long jCurrentPartBytesRemaining = currentPartBytesRemaining(8192L);
                if (jCurrentPartBytesRemaining == 0) {
                    break;
                }
                this.source.skip(jCurrentPartBytesRemaining);
            }
            this.source.skip(this.crlfDashDashBoundary.size());
        }
        boolean z = false;
        while (true) {
            int iSelect = this.source.select(afterBoundaryOptions);
            if (iSelect == -1) {
                throw new java.net.ProtocolException("unexpected characters after boundary");
            }
            if (iSelect == 0) {
                this.partCount++;
                okhttp3.Headers headers = new okhttp3.internal.http1.HeadersReader(this.source).readHeaders();
                okhttp3.MultipartReader.PartSource partSource = new okhttp3.MultipartReader.PartSource();
                this.currentPart = partSource;
                return new okhttp3.MultipartReader.Part(headers, okio.Okio.buffer(partSource));
            }
            if (iSelect == 1) {
                if (z) {
                    throw new java.net.ProtocolException("unexpected characters after boundary");
                }
                if (this.partCount == 0) {
                    throw new java.net.ProtocolException("expected at least 1 part");
                }
                this.noMoreParts = true;
                return null;
            }
            if (iSelect == 2 || iSelect == 3) {
                z = true;
            }
        }
    }

    /* JADX INFO: compiled from: MultipartReader.kt */
    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bH\u0016J\b\u0010\u0003\u001a\u00020\u0004H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lokhttp3/MultipartReader$PartSource;", "Lokio/Source;", "(Lokhttp3/MultipartReader;)V", "timeout", "Lokio/Timeout;", "close", "", "read", "", "sink", "Lokio/Buffer;", "byteCount", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class PartSource implements okio.Source {
        private final okio.Timeout timeout = new okio.Timeout();

        public PartSource() {
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (kotlin.jvm.internal.Intrinsics.areEqual(okhttp3.MultipartReader.this.currentPart, this)) {
                okhttp3.MultipartReader.this.currentPart = null;
            }
        }

        @Override // okio.Source
        public long read(okio.Buffer sink, long byteCount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "sink");
            if (byteCount >= 0) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(okhttp3.MultipartReader.this.currentPart, this)) {
                    okio.Timeout timeout = okhttp3.MultipartReader.this.source.getTimeout();
                    okio.Timeout timeout2 = this.timeout;
                    okhttp3.MultipartReader multipartReader = okhttp3.MultipartReader.this;
                    long timeoutNanos = timeout.getTimeoutNanos();
                    timeout.timeout(okio.Timeout.INSTANCE.minTimeout(timeout2.getTimeoutNanos(), timeout.getTimeoutNanos()), java.util.concurrent.TimeUnit.NANOSECONDS);
                    if (timeout.getHasDeadline()) {
                        long jDeadlineNanoTime = timeout.deadlineNanoTime();
                        if (timeout2.getHasDeadline()) {
                            timeout.deadlineNanoTime(java.lang.Math.min(timeout.deadlineNanoTime(), timeout2.deadlineNanoTime()));
                        }
                        try {
                            long jCurrentPartBytesRemaining = multipartReader.currentPartBytesRemaining(byteCount);
                            return jCurrentPartBytesRemaining == 0 ? -1L : multipartReader.source.read(sink, jCurrentPartBytesRemaining);
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
                        long jCurrentPartBytesRemaining2 = multipartReader.currentPartBytesRemaining(byteCount);
                        return jCurrentPartBytesRemaining2 == 0 ? -1L : multipartReader.source.read(sink, jCurrentPartBytesRemaining2);
                    } finally {
                        timeout.timeout(timeoutNanos, java.util.concurrent.TimeUnit.NANOSECONDS);
                        if (timeout2.getHasDeadline()) {
                            timeout.clearDeadline();
                        }
                    }
                }
                throw new java.lang.IllegalStateException("closed".toString());
            }
            throw new java.lang.IllegalArgumentException(("byteCount < 0: " + byteCount).toString());
        }

        @Override // okio.Source
        /* JADX INFO: renamed from: timeout, reason: from getter */
        public okio.Timeout getTimeout() {
            return this.timeout;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long currentPartBytesRemaining(long maxResult) throws java.io.IOException {
        this.source.require(this.crlfDashDashBoundary.size());
        long jIndexOf = this.source.getBuffer().indexOf(this.crlfDashDashBoundary);
        if (jIndexOf == -1) {
            return java.lang.Math.min(maxResult, (this.source.getBuffer().size() - ((long) this.crlfDashDashBoundary.size())) + 1);
        }
        return java.lang.Math.min(maxResult, jIndexOf);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        if (this.closed) {
            return;
        }
        this.closed = true;
        this.currentPart = null;
        this.source.close();
    }

    /* JADX INFO: compiled from: MultipartReader.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\t\u001a\u00020\nH\u0096\u0001R\u0013\u0010\u0004\u001a\u00020\u00058\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007R\u0013\u0010\u0002\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\b¨\u0006\u000b"}, d2 = {"Lokhttp3/MultipartReader$Part;", "Ljava/io/Closeable;", "headers", "Lokhttp3/Headers;", "body", "Lokio/BufferedSource;", "(Lokhttp3/Headers;Lokio/BufferedSource;)V", "()Lokio/BufferedSource;", "()Lokhttp3/Headers;", "close", "", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Part implements java.io.Closeable {
        private final okio.BufferedSource body;
        private final okhttp3.Headers headers;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.body.close();
        }

        public Part(okhttp3.Headers headers, okio.BufferedSource body) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "headers");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body, "body");
            this.headers = headers;
            this.body = body;
        }

        /* JADX INFO: renamed from: headers, reason: from getter */
        public final okhttp3.Headers getHeaders() {
            return this.headers;
        }

        /* JADX INFO: renamed from: body, reason: from getter */
        public final okio.BufferedSource getBody() {
            return this.body;
        }
    }

    /* JADX INFO: compiled from: MultipartReader.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lokhttp3/MultipartReader$Companion;", "", "()V", "afterBoundaryOptions", "Lokio/Options;", "getAfterBoundaryOptions", "()Lokio/Options;", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final okio.Options getAfterBoundaryOptions() {
            return okhttp3.MultipartReader.afterBoundaryOptions;
        }
    }
}
