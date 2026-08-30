package okhttp3.internal.http2;

/* JADX INFO: compiled from: Http2Connection.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u0000 \u0099\u00012\u00020\u0001:\b\u0098\u0001\u0099\u0001\u009a\u0001\u009b\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010P\u001a\u00020QJ\b\u0010R\u001a\u00020QH\u0016J'\u0010R\u001a\u00020Q2\u0006\u0010S\u001a\u00020T2\u0006\u0010U\u001a\u00020T2\b\u0010V\u001a\u0004\u0018\u00010WH\u0000¢\u0006\u0002\bXJ\u0012\u0010Y\u001a\u00020Q2\b\u0010Z\u001a\u0004\u0018\u00010WH\u0002J\u0006\u0010[\u001a\u00020QJ\u0010\u0010\\\u001a\u0004\u0018\u00010B2\u0006\u0010]\u001a\u00020\u0012J\u000e\u0010^\u001a\u00020\t2\u0006\u0010_\u001a\u00020\u0006J&\u0010`\u001a\u00020B2\u0006\u0010a\u001a\u00020\u00122\f\u0010b\u001a\b\u0012\u0004\u0012\u00020d0c2\u0006\u0010e\u001a\u00020\tH\u0002J\u001c\u0010`\u001a\u00020B2\f\u0010b\u001a\b\u0012\u0004\u0012\u00020d0c2\u0006\u0010e\u001a\u00020\tJ\u0006\u0010f\u001a\u00020\u0012J-\u0010g\u001a\u00020Q2\u0006\u0010h\u001a\u00020\u00122\u0006\u0010i\u001a\u00020j2\u0006\u0010k\u001a\u00020\u00122\u0006\u0010l\u001a\u00020\tH\u0000¢\u0006\u0002\bmJ+\u0010n\u001a\u00020Q2\u0006\u0010h\u001a\u00020\u00122\f\u0010b\u001a\b\u0012\u0004\u0012\u00020d0c2\u0006\u0010l\u001a\u00020\tH\u0000¢\u0006\u0002\boJ#\u0010p\u001a\u00020Q2\u0006\u0010h\u001a\u00020\u00122\f\u0010b\u001a\b\u0012\u0004\u0012\u00020d0cH\u0000¢\u0006\u0002\bqJ\u001d\u0010r\u001a\u00020Q2\u0006\u0010h\u001a\u00020\u00122\u0006\u0010s\u001a\u00020TH\u0000¢\u0006\u0002\btJ$\u0010u\u001a\u00020B2\u0006\u0010a\u001a\u00020\u00122\f\u0010b\u001a\b\u0012\u0004\u0012\u00020d0c2\u0006\u0010e\u001a\u00020\tJ\u0015\u0010v\u001a\u00020\t2\u0006\u0010h\u001a\u00020\u0012H\u0000¢\u0006\u0002\bwJ\u0017\u0010x\u001a\u0004\u0018\u00010B2\u0006\u0010h\u001a\u00020\u0012H\u0000¢\u0006\u0002\byJ\r\u0010z\u001a\u00020QH\u0000¢\u0006\u0002\b{J\u000e\u0010|\u001a\u00020Q2\u0006\u0010}\u001a\u00020&J\u000e\u0010~\u001a\u00020Q2\u0006\u0010\u007f\u001a\u00020TJ\u001e\u0010\u0080\u0001\u001a\u00020Q2\t\b\u0002\u0010\u0081\u0001\u001a\u00020\t2\b\b\u0002\u0010E\u001a\u00020FH\u0007J\u0018\u0010\u0082\u0001\u001a\u00020Q2\u0007\u0010\u0083\u0001\u001a\u00020\u0006H\u0000¢\u0006\u0003\b\u0084\u0001J,\u0010\u0085\u0001\u001a\u00020Q2\u0006\u0010h\u001a\u00020\u00122\u0007\u0010\u0086\u0001\u001a\u00020\t2\n\u0010\u0087\u0001\u001a\u0005\u0018\u00010\u0088\u00012\u0006\u0010k\u001a\u00020\u0006J/\u0010\u0089\u0001\u001a\u00020Q2\u0006\u0010h\u001a\u00020\u00122\u0007\u0010\u0086\u0001\u001a\u00020\t2\r\u0010\u008a\u0001\u001a\b\u0012\u0004\u0012\u00020d0cH\u0000¢\u0006\u0003\b\u008b\u0001J\u0007\u0010\u008c\u0001\u001a\u00020QJ\"\u0010\u008c\u0001\u001a\u00020Q2\u0007\u0010\u008d\u0001\u001a\u00020\t2\u0007\u0010\u008e\u0001\u001a\u00020\u00122\u0007\u0010\u008f\u0001\u001a\u00020\u0012J\u0007\u0010\u0090\u0001\u001a\u00020QJ\u001f\u0010\u0091\u0001\u001a\u00020Q2\u0006\u0010h\u001a\u00020\u00122\u0006\u0010\u007f\u001a\u00020TH\u0000¢\u0006\u0003\b\u0092\u0001J\u001f\u0010\u0093\u0001\u001a\u00020Q2\u0006\u0010h\u001a\u00020\u00122\u0006\u0010s\u001a\u00020TH\u0000¢\u0006\u0003\b\u0094\u0001J \u0010\u0095\u0001\u001a\u00020Q2\u0006\u0010h\u001a\u00020\u00122\u0007\u0010\u0096\u0001\u001a\u00020\u0006H\u0000¢\u0006\u0003\b\u0097\u0001R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\rX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u00020\u0012X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u001fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020\u0012X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001b\"\u0004\b$\u0010\u001dR\u0011\u0010%\u001a\u00020&¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u001a\u0010)\u001a\u00020&X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010(\"\u0004\b+\u0010,R\u000e\u0010-\u001a\u00020.X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u000200X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u00102\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u0006@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u001e\u00105\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u0006@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b6\u00104R\u0015\u00107\u001a\u000608R\u00020\u0000¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u000e\u0010;\u001a\u000200X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010<\u001a\u00020=X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R \u0010@\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020B0AX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\u000e\u0010E\u001a\u00020FX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010G\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u0006@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\bH\u00104R\u001e\u0010I\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u0006@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\bJ\u00104R\u0011\u0010K\u001a\u00020L¢\u0006\b\n\u0000\u001a\u0004\bM\u0010NR\u000e\u0010O\u001a\u000200X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u009c\u0001"}, d2 = {"Lokhttp3/internal/http2/Http2Connection;", "Ljava/io/Closeable;", "builder", "Lokhttp3/internal/http2/Http2Connection$Builder;", "(Lokhttp3/internal/http2/Http2Connection$Builder;)V", "awaitPingsSent", "", "awaitPongsReceived", "client", "", "getClient$okhttp", "()Z", "connectionName", "", "getConnectionName$okhttp", "()Ljava/lang/String;", "currentPushRequests", "", "", "degradedPingsSent", "degradedPongDeadlineNs", "degradedPongsReceived", "intervalPingsSent", "intervalPongsReceived", "isShutdown", "lastGoodStreamId", "getLastGoodStreamId$okhttp", "()I", "setLastGoodStreamId$okhttp", "(I)V", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lokhttp3/internal/http2/Http2Connection$Listener;", "getListener$okhttp", "()Lokhttp3/internal/http2/Http2Connection$Listener;", "nextStreamId", "getNextStreamId$okhttp", "setNextStreamId$okhttp", "okHttpSettings", "Lokhttp3/internal/http2/Settings;", "getOkHttpSettings", "()Lokhttp3/internal/http2/Settings;", "peerSettings", "getPeerSettings", "setPeerSettings", "(Lokhttp3/internal/http2/Settings;)V", "pushObserver", "Lokhttp3/internal/http2/PushObserver;", "pushQueue", "Lokhttp3/internal/concurrent/TaskQueue;", "<set-?>", "readBytesAcknowledged", "getReadBytesAcknowledged", "()J", "readBytesTotal", "getReadBytesTotal", "readerRunnable", "Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;", "getReaderRunnable", "()Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;", "settingsListenerQueue", "socket", "Ljava/net/Socket;", "getSocket$okhttp", "()Ljava/net/Socket;", "streams", "", "Lokhttp3/internal/http2/Http2Stream;", "getStreams$okhttp", "()Ljava/util/Map;", "taskRunner", "Lokhttp3/internal/concurrent/TaskRunner;", "writeBytesMaximum", "getWriteBytesMaximum", "writeBytesTotal", "getWriteBytesTotal", "writer", "Lokhttp3/internal/http2/Http2Writer;", "getWriter", "()Lokhttp3/internal/http2/Http2Writer;", "writerQueue", "awaitPong", "", "close", "connectionCode", "Lokhttp3/internal/http2/ErrorCode;", "streamCode", "cause", "Ljava/io/IOException;", "close$okhttp", "failConnection", "e", "flush", "getStream", "id", "isHealthy", "nowNs", "newStream", "associatedStreamId", "requestHeaders", "", "Lokhttp3/internal/http2/Header;", "out", "openStreamCount", "pushDataLater", "streamId", "source", "Lokio/BufferedSource;", "byteCount", "inFinished", "pushDataLater$okhttp", "pushHeadersLater", "pushHeadersLater$okhttp", "pushRequestLater", "pushRequestLater$okhttp", "pushResetLater", com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, "pushResetLater$okhttp", "pushStream", "pushedStream", "pushedStream$okhttp", "removeStream", "removeStream$okhttp", "sendDegradedPingLater", "sendDegradedPingLater$okhttp", "setSettings", "settings", "shutdown", "statusCode", androidx.media3.extractor.text.ttml.TtmlNode.START, "sendConnectionPreface", "updateConnectionFlowControl", "read", "updateConnectionFlowControl$okhttp", "writeData", "outFinished", "buffer", "Lokio/Buffer;", "writeHeaders", "alternating", "writeHeaders$okhttp", "writePing", "reply", "payload1", "payload2", "writePingAndAwaitPong", "writeSynReset", "writeSynReset$okhttp", "writeSynResetLater", "writeSynResetLater$okhttp", "writeWindowUpdateLater", "unacknowledgedBytesRead", "writeWindowUpdateLater$okhttp", "Builder", "Companion", "Listener", "ReaderRunnable", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Http2Connection implements java.io.Closeable {
    public static final int AWAIT_PING = 3;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final okhttp3.internal.http2.Http2Connection.Companion INSTANCE = new okhttp3.internal.http2.Http2Connection.Companion(null);
    private static final okhttp3.internal.http2.Settings DEFAULT_SETTINGS;
    public static final int DEGRADED_PING = 2;
    public static final int DEGRADED_PONG_TIMEOUT_NS = 1000000000;
    public static final int INTERVAL_PING = 1;
    public static final int OKHTTP_CLIENT_WINDOW_SIZE = 16777216;
    private long awaitPingsSent;
    private long awaitPongsReceived;
    private final boolean client;
    private final java.lang.String connectionName;
    private final java.util.Set<java.lang.Integer> currentPushRequests;
    private long degradedPingsSent;
    private long degradedPongDeadlineNs;
    private long degradedPongsReceived;
    private long intervalPingsSent;
    private long intervalPongsReceived;
    private boolean isShutdown;
    private int lastGoodStreamId;
    private final okhttp3.internal.http2.Http2Connection.Listener listener;
    private int nextStreamId;
    private final okhttp3.internal.http2.Settings okHttpSettings;
    private okhttp3.internal.http2.Settings peerSettings;
    private final okhttp3.internal.http2.PushObserver pushObserver;
    private final okhttp3.internal.concurrent.TaskQueue pushQueue;
    private long readBytesAcknowledged;
    private long readBytesTotal;
    private final okhttp3.internal.http2.Http2Connection.ReaderRunnable readerRunnable;
    private final okhttp3.internal.concurrent.TaskQueue settingsListenerQueue;
    private final java.net.Socket socket;
    private final java.util.Map<java.lang.Integer, okhttp3.internal.http2.Http2Stream> streams;
    private final okhttp3.internal.concurrent.TaskRunner taskRunner;
    private long writeBytesMaximum;
    private long writeBytesTotal;
    private final okhttp3.internal.http2.Http2Writer writer;
    private final okhttp3.internal.concurrent.TaskQueue writerQueue;

    /* JADX INFO: compiled from: Http2Connection.kt */
    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH&¨\u0006\r"}, d2 = {"Lokhttp3/internal/http2/Http2Connection$Listener;", "", "()V", "onSettings", "", "connection", "Lokhttp3/internal/http2/Http2Connection;", "settings", "Lokhttp3/internal/http2/Settings;", "onStream", "stream", "Lokhttp3/internal/http2/Http2Stream;", "Companion", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class Listener {
        public static final okhttp3.internal.http2.Http2Connection.Listener REFUSE_INCOMING_STREAMS = new okhttp3.internal.http2.Http2Connection.Listener() { // from class: okhttp3.internal.http2.Http2Connection$Listener$Companion$REFUSE_INCOMING_STREAMS$1
            @Override // okhttp3.internal.http2.Http2Connection.Listener
            public void onStream(okhttp3.internal.http2.Http2Stream stream) throws java.io.IOException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stream, "stream");
                stream.close(okhttp3.internal.http2.ErrorCode.REFUSED_STREAM, null);
            }
        };

        public void onSettings(okhttp3.internal.http2.Http2Connection connection, okhttp3.internal.http2.Settings settings) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connection, "connection");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settings, "settings");
        }

        public abstract void onStream(okhttp3.internal.http2.Http2Stream stream) throws java.io.IOException;
    }

    public final boolean pushedStream$okhttp(int streamId) {
        return streamId != 0 && (streamId & 1) == 0;
    }

    public final void start() throws java.io.IOException {
        start$default(this, false, null, 3, null);
    }

    public final void start(boolean z) throws java.io.IOException {
        start$default(this, z, null, 2, null);
    }

    public Http2Connection(okhttp3.internal.http2.Http2Connection.Builder builder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "builder");
        boolean client = builder.getClient();
        this.client = client;
        this.listener = builder.getListener();
        this.streams = new java.util.LinkedHashMap();
        java.lang.String connectionName$okhttp = builder.getConnectionName$okhttp();
        this.connectionName = connectionName$okhttp;
        this.nextStreamId = builder.getClient() ? 3 : 2;
        okhttp3.internal.concurrent.TaskRunner taskRunner = builder.getTaskRunner();
        this.taskRunner = taskRunner;
        okhttp3.internal.concurrent.TaskQueue taskQueueNewQueue = taskRunner.newQueue();
        this.writerQueue = taskQueueNewQueue;
        this.pushQueue = taskRunner.newQueue();
        this.settingsListenerQueue = taskRunner.newQueue();
        this.pushObserver = builder.getPushObserver();
        okhttp3.internal.http2.Settings settings = new okhttp3.internal.http2.Settings();
        if (builder.getClient()) {
            settings.set(7, 16777216);
        }
        this.okHttpSettings = settings;
        okhttp3.internal.http2.Settings settings2 = DEFAULT_SETTINGS;
        this.peerSettings = settings2;
        this.writeBytesMaximum = settings2.getInitialWindowSize();
        this.socket = builder.getSocket$okhttp();
        this.writer = new okhttp3.internal.http2.Http2Writer(builder.getSink$okhttp(), client);
        this.readerRunnable = new okhttp3.internal.http2.Http2Connection.ReaderRunnable(this, new okhttp3.internal.http2.Http2Reader(builder.getSource$okhttp(), client));
        this.currentPushRequests = new java.util.LinkedHashSet();
        if (builder.getPingIntervalMillis() != 0) {
            final long nanos = java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(builder.getPingIntervalMillis());
            final java.lang.String str = connectionName$okhttp + " ping";
            taskQueueNewQueue.schedule(new okhttp3.internal.concurrent.Task(str) { // from class: okhttp3.internal.http2.Http2Connection$special$$inlined$schedule$1
                @Override // okhttp3.internal.concurrent.Task
                public long runOnce() {
                    boolean z;
                    synchronized (this) {
                        if (this.intervalPongsReceived < this.intervalPingsSent) {
                            z = true;
                        } else {
                            this.intervalPingsSent++;
                            z = false;
                        }
                    }
                    if (z) {
                        this.failConnection(null);
                        return -1L;
                    }
                    this.writePing(false, 1, 0);
                    return nanos;
                }
            }, nanos);
        }
    }

    /* JADX INFO: renamed from: getClient$okhttp, reason: from getter */
    public final boolean getClient() {
        return this.client;
    }

    /* JADX INFO: renamed from: getListener$okhttp, reason: from getter */
    public final okhttp3.internal.http2.Http2Connection.Listener getListener() {
        return this.listener;
    }

    public final java.util.Map<java.lang.Integer, okhttp3.internal.http2.Http2Stream> getStreams$okhttp() {
        return this.streams;
    }

    /* JADX INFO: renamed from: getConnectionName$okhttp, reason: from getter */
    public final java.lang.String getConnectionName() {
        return this.connectionName;
    }

    /* JADX INFO: renamed from: getLastGoodStreamId$okhttp, reason: from getter */
    public final int getLastGoodStreamId() {
        return this.lastGoodStreamId;
    }

    public final void setLastGoodStreamId$okhttp(int i) {
        this.lastGoodStreamId = i;
    }

    /* JADX INFO: renamed from: getNextStreamId$okhttp, reason: from getter */
    public final int getNextStreamId() {
        return this.nextStreamId;
    }

    public final void setNextStreamId$okhttp(int i) {
        this.nextStreamId = i;
    }

    public final okhttp3.internal.http2.Settings getOkHttpSettings() {
        return this.okHttpSettings;
    }

    public final okhttp3.internal.http2.Settings getPeerSettings() {
        return this.peerSettings;
    }

    public final void setPeerSettings(okhttp3.internal.http2.Settings settings) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settings, "<set-?>");
        this.peerSettings = settings;
    }

    public final long getReadBytesTotal() {
        return this.readBytesTotal;
    }

    public final long getReadBytesAcknowledged() {
        return this.readBytesAcknowledged;
    }

    public final long getWriteBytesTotal() {
        return this.writeBytesTotal;
    }

    public final long getWriteBytesMaximum() {
        return this.writeBytesMaximum;
    }

    /* JADX INFO: renamed from: getSocket$okhttp, reason: from getter */
    public final java.net.Socket getSocket() {
        return this.socket;
    }

    public final okhttp3.internal.http2.Http2Writer getWriter() {
        return this.writer;
    }

    public final okhttp3.internal.http2.Http2Connection.ReaderRunnable getReaderRunnable() {
        return this.readerRunnable;
    }

    public final synchronized int openStreamCount() {
        return this.streams.size();
    }

    public final synchronized okhttp3.internal.http2.Http2Stream getStream(int id) {
        return this.streams.get(java.lang.Integer.valueOf(id));
    }

    public final synchronized okhttp3.internal.http2.Http2Stream removeStream$okhttp(int streamId) {
        okhttp3.internal.http2.Http2Stream http2StreamRemove;
        http2StreamRemove = this.streams.remove(java.lang.Integer.valueOf(streamId));
        kotlin.jvm.internal.Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
        notifyAll();
        return http2StreamRemove;
    }

    public final synchronized void updateConnectionFlowControl$okhttp(long read) {
        long j = this.readBytesTotal + read;
        this.readBytesTotal = j;
        long j2 = j - this.readBytesAcknowledged;
        if (j2 >= this.okHttpSettings.getInitialWindowSize() / 2) {
            writeWindowUpdateLater$okhttp(0, j2);
            this.readBytesAcknowledged += j2;
        }
    }

    public final okhttp3.internal.http2.Http2Stream pushStream(int associatedStreamId, java.util.List<okhttp3.internal.http2.Header> requestHeaders, boolean out) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        if (!(!this.client)) {
            throw new java.lang.IllegalStateException("Client cannot push requests.".toString());
        }
        return newStream(associatedStreamId, requestHeaders, out);
    }

    public final okhttp3.internal.http2.Http2Stream newStream(java.util.List<okhttp3.internal.http2.Header> requestHeaders, boolean out) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        return newStream(0, requestHeaders, out);
    }

    private final okhttp3.internal.http2.Http2Stream newStream(int associatedStreamId, java.util.List<okhttp3.internal.http2.Header> requestHeaders, boolean out) throws java.io.IOException {
        int i;
        okhttp3.internal.http2.Http2Stream http2Stream;
        boolean z;
        boolean z2 = !out;
        synchronized (this.writer) {
            synchronized (this) {
                if (this.nextStreamId > 1073741823) {
                    shutdown(okhttp3.internal.http2.ErrorCode.REFUSED_STREAM);
                }
                if (this.isShutdown) {
                    throw new okhttp3.internal.http2.ConnectionShutdownException();
                }
                i = this.nextStreamId;
                this.nextStreamId = i + 2;
                http2Stream = new okhttp3.internal.http2.Http2Stream(i, this, z2, false, null);
                z = !out || this.writeBytesTotal >= this.writeBytesMaximum || http2Stream.getWriteBytesTotal() >= http2Stream.getWriteBytesMaximum();
                if (http2Stream.isOpen()) {
                    this.streams.put(java.lang.Integer.valueOf(i), http2Stream);
                }
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
            if (associatedStreamId == 0) {
                this.writer.headers(z2, i, requestHeaders);
            } else {
                if (!(true ^ this.client)) {
                    throw new java.lang.IllegalArgumentException("client streams shouldn't have associated stream IDs".toString());
                }
                this.writer.pushPromise(associatedStreamId, i, requestHeaders);
            }
            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
        }
        if (z) {
            this.writer.flush();
        }
        return http2Stream;
    }

    public final void writeHeaders$okhttp(int streamId, boolean outFinished, java.util.List<okhttp3.internal.http2.Header> alternating) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(alternating, "alternating");
        this.writer.headers(outFinished, streamId, alternating);
    }

    public final void writeData(int streamId, boolean outFinished, okio.Buffer buffer, long byteCount) throws java.io.IOException {
        long j;
        long j2;
        int iMin;
        long j3;
        if (byteCount == 0) {
            this.writer.data(outFinished, streamId, buffer, 0);
            return;
        }
        while (byteCount > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        j = this.writeBytesTotal;
                        j2 = this.writeBytesMaximum;
                        if (j >= j2) {
                            if (!this.streams.containsKey(java.lang.Integer.valueOf(streamId))) {
                                throw new java.io.IOException("stream closed");
                            }
                            kotlin.jvm.internal.Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
                            wait();
                        }
                    } catch (java.lang.InterruptedException unused) {
                        java.lang.Thread.currentThread().interrupt();
                        throw new java.io.InterruptedIOException();
                    }
                    throw th;
                }
                iMin = java.lang.Math.min((int) java.lang.Math.min(byteCount, j2 - j), this.writer.getMaxFrameSize());
                j3 = iMin;
                this.writeBytesTotal += j3;
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
            byteCount -= j3;
            this.writer.data(outFinished && byteCount == 0, streamId, buffer, iMin);
        }
    }

    public final void writeSynResetLater$okhttp(final int streamId, final okhttp3.internal.http2.ErrorCode errorCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        okhttp3.internal.concurrent.TaskQueue taskQueue = this.writerQueue;
        final java.lang.String str = this.connectionName + '[' + streamId + "] writeSynReset";
        final boolean z = true;
        taskQueue.schedule(new okhttp3.internal.concurrent.Task(str, z) { // from class: okhttp3.internal.http2.Http2Connection$writeSynResetLater$$inlined$execute$default$1
            @Override // okhttp3.internal.concurrent.Task
            public long runOnce() {
                try {
                    this.writeSynReset$okhttp(streamId, errorCode);
                    return -1L;
                } catch (java.io.IOException e) {
                    this.failConnection(e);
                    return -1L;
                }
            }
        }, 0L);
    }

    public final void writeSynReset$okhttp(int streamId, okhttp3.internal.http2.ErrorCode statusCode) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statusCode, "statusCode");
        this.writer.rstStream(streamId, statusCode);
    }

    public final void writeWindowUpdateLater$okhttp(final int streamId, final long unacknowledgedBytesRead) {
        okhttp3.internal.concurrent.TaskQueue taskQueue = this.writerQueue;
        final java.lang.String str = this.connectionName + '[' + streamId + "] windowUpdate";
        final boolean z = true;
        taskQueue.schedule(new okhttp3.internal.concurrent.Task(str, z) { // from class: okhttp3.internal.http2.Http2Connection$writeWindowUpdateLater$$inlined$execute$default$1
            @Override // okhttp3.internal.concurrent.Task
            public long runOnce() {
                try {
                    this.getWriter().windowUpdate(streamId, unacknowledgedBytesRead);
                    return -1L;
                } catch (java.io.IOException e) {
                    this.failConnection(e);
                    return -1L;
                }
            }
        }, 0L);
    }

    public final void writePing(boolean reply, int payload1, int payload2) {
        try {
            this.writer.ping(reply, payload1, payload2);
        } catch (java.io.IOException e) {
            failConnection(e);
        }
    }

    public final void writePingAndAwaitPong() throws java.lang.InterruptedException {
        writePing();
        awaitPong();
    }

    public final void writePing() throws java.lang.InterruptedException {
        synchronized (this) {
            this.awaitPingsSent++;
        }
        writePing(false, 3, 1330343787);
    }

    public final synchronized void awaitPong() throws java.lang.InterruptedException {
        while (this.awaitPongsReceived < this.awaitPingsSent) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
            wait();
        }
    }

    public final void flush() throws java.io.IOException {
        this.writer.flush();
    }

    public final void shutdown(okhttp3.internal.http2.ErrorCode statusCode) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statusCode, "statusCode");
        synchronized (this.writer) {
            kotlin.jvm.internal.Ref.IntRef intRef = new kotlin.jvm.internal.Ref.IntRef();
            synchronized (this) {
                if (this.isShutdown) {
                    return;
                }
                this.isShutdown = true;
                intRef.element = this.lastGoodStreamId;
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                this.writer.goAway(intRef.element, statusCode, okhttp3.internal.Util.EMPTY_BYTE_ARRAY);
                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        close$okhttp(okhttp3.internal.http2.ErrorCode.NO_ERROR, okhttp3.internal.http2.ErrorCode.CANCEL, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void failConnection(java.io.IOException e) {
        close$okhttp(okhttp3.internal.http2.ErrorCode.PROTOCOL_ERROR, okhttp3.internal.http2.ErrorCode.PROTOCOL_ERROR, e);
    }

    public static /* synthetic */ void start$default(okhttp3.internal.http2.Http2Connection http2Connection, boolean z, okhttp3.internal.concurrent.TaskRunner taskRunner, int i, java.lang.Object obj) throws java.io.IOException {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            taskRunner = okhttp3.internal.concurrent.TaskRunner.INSTANCE;
        }
        http2Connection.start(z, taskRunner);
    }

    public final void start(boolean sendConnectionPreface, okhttp3.internal.concurrent.TaskRunner taskRunner) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        if (sendConnectionPreface) {
            this.writer.connectionPreface();
            this.writer.settings(this.okHttpSettings);
            int initialWindowSize = this.okHttpSettings.getInitialWindowSize();
            if (initialWindowSize != 65535) {
                this.writer.windowUpdate(0, initialWindowSize - 65535);
            }
        }
        taskRunner.newQueue().schedule(new okhttp3.internal.concurrent.TaskQueue.AnonymousClass1(this.connectionName, true, this.readerRunnable), 0L);
    }

    public final void setSettings(okhttp3.internal.http2.Settings settings) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settings, "settings");
        synchronized (this.writer) {
            synchronized (this) {
                if (this.isShutdown) {
                    throw new okhttp3.internal.http2.ConnectionShutdownException();
                }
                this.okHttpSettings.merge(settings);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
            this.writer.settings(settings);
            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
        }
    }

    public final synchronized boolean isHealthy(long nowNs) {
        if (this.isShutdown) {
            return false;
        }
        return this.degradedPongsReceived >= this.degradedPingsSent || nowNs < this.degradedPongDeadlineNs;
    }

    public final void sendDegradedPingLater$okhttp() {
        synchronized (this) {
            long j = this.degradedPongsReceived;
            long j2 = this.degradedPingsSent;
            if (j < j2) {
                return;
            }
            this.degradedPingsSent = j2 + 1;
            this.degradedPongDeadlineNs = java.lang.System.nanoTime() + ((long) DEGRADED_PONG_TIMEOUT_NS);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            okhttp3.internal.concurrent.TaskQueue taskQueue = this.writerQueue;
            final java.lang.String str = this.connectionName + " ping";
            final boolean z = true;
            taskQueue.schedule(new okhttp3.internal.concurrent.Task(str, z) { // from class: okhttp3.internal.http2.Http2Connection$sendDegradedPingLater$$inlined$execute$default$1
                @Override // okhttp3.internal.concurrent.Task
                public long runOnce() {
                    this.writePing(false, 2, 0);
                    return -1L;
                }
            }, 0L);
        }
    }

    /* JADX INFO: compiled from: Http2Connection.kt */
    @kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u00107\u001a\u000208J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001eJ.\u0010)\u001a\u00020\u00002\u0006\u0010)\u001a\u00020*2\b\b\u0002\u00109\u001a\u00020\f2\b\b\u0002\u0010/\u001a\u0002002\b\b\u0002\u0010#\u001a\u00020$H\u0007R\u001a\u0010\u0002\u001a\u00020\u0003X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0080.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0018X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u001eX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010#\u001a\u00020$X\u0080.¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001a\u0010)\u001a\u00020*X\u0080.¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001a\u0010/\u001a\u000200X\u0080.¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u00106¨\u0006:"}, d2 = {"Lokhttp3/internal/http2/Http2Connection$Builder;", "", "client", "", "taskRunner", "Lokhttp3/internal/concurrent/TaskRunner;", "(ZLokhttp3/internal/concurrent/TaskRunner;)V", "getClient$okhttp", "()Z", "setClient$okhttp", "(Z)V", "connectionName", "", "getConnectionName$okhttp", "()Ljava/lang/String;", "setConnectionName$okhttp", "(Ljava/lang/String;)V", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lokhttp3/internal/http2/Http2Connection$Listener;", "getListener$okhttp", "()Lokhttp3/internal/http2/Http2Connection$Listener;", "setListener$okhttp", "(Lokhttp3/internal/http2/Http2Connection$Listener;)V", "pingIntervalMillis", "", "getPingIntervalMillis$okhttp", "()I", "setPingIntervalMillis$okhttp", "(I)V", "pushObserver", "Lokhttp3/internal/http2/PushObserver;", "getPushObserver$okhttp", "()Lokhttp3/internal/http2/PushObserver;", "setPushObserver$okhttp", "(Lokhttp3/internal/http2/PushObserver;)V", "sink", "Lokio/BufferedSink;", "getSink$okhttp", "()Lokio/BufferedSink;", "setSink$okhttp", "(Lokio/BufferedSink;)V", "socket", "Ljava/net/Socket;", "getSocket$okhttp", "()Ljava/net/Socket;", "setSocket$okhttp", "(Ljava/net/Socket;)V", "source", "Lokio/BufferedSource;", "getSource$okhttp", "()Lokio/BufferedSource;", "setSource$okhttp", "(Lokio/BufferedSource;)V", "getTaskRunner$okhttp", "()Lokhttp3/internal/concurrent/TaskRunner;", "build", "Lokhttp3/internal/http2/Http2Connection;", "peerName", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        private boolean client;
        public java.lang.String connectionName;
        private okhttp3.internal.http2.Http2Connection.Listener listener;
        private int pingIntervalMillis;
        private okhttp3.internal.http2.PushObserver pushObserver;
        public okio.BufferedSink sink;
        public java.net.Socket socket;
        public okio.BufferedSource source;
        private final okhttp3.internal.concurrent.TaskRunner taskRunner;

        public final okhttp3.internal.http2.Http2Connection.Builder socket(java.net.Socket socket) throws java.io.IOException {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(socket, "socket");
            return socket$default(this, socket, null, null, null, 14, null);
        }

        public final okhttp3.internal.http2.Http2Connection.Builder socket(java.net.Socket socket, java.lang.String peerName) throws java.io.IOException {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(socket, "socket");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(peerName, "peerName");
            return socket$default(this, socket, peerName, null, null, 12, null);
        }

        public final okhttp3.internal.http2.Http2Connection.Builder socket(java.net.Socket socket, java.lang.String peerName, okio.BufferedSource source) throws java.io.IOException {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(socket, "socket");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(peerName, "peerName");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
            return socket$default(this, socket, peerName, source, null, 8, null);
        }

        public Builder(boolean z, okhttp3.internal.concurrent.TaskRunner taskRunner) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
            this.client = z;
            this.taskRunner = taskRunner;
            this.listener = okhttp3.internal.http2.Http2Connection.Listener.REFUSE_INCOMING_STREAMS;
            this.pushObserver = okhttp3.internal.http2.PushObserver.CANCEL;
        }

        /* JADX INFO: renamed from: getClient$okhttp, reason: from getter */
        public final boolean getClient() {
            return this.client;
        }

        public final void setClient$okhttp(boolean z) {
            this.client = z;
        }

        /* JADX INFO: renamed from: getTaskRunner$okhttp, reason: from getter */
        public final okhttp3.internal.concurrent.TaskRunner getTaskRunner() {
            return this.taskRunner;
        }

        public final java.net.Socket getSocket$okhttp() {
            java.net.Socket socket = this.socket;
            if (socket != null) {
                return socket;
            }
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("socket");
            return null;
        }

        public final void setSocket$okhttp(java.net.Socket socket) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(socket, "<set-?>");
            this.socket = socket;
        }

        public final java.lang.String getConnectionName$okhttp() {
            java.lang.String str = this.connectionName;
            if (str != null) {
                return str;
            }
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("connectionName");
            return null;
        }

        public final void setConnectionName$okhttp(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.connectionName = str;
        }

        public final okio.BufferedSource getSource$okhttp() {
            okio.BufferedSource bufferedSource = this.source;
            if (bufferedSource != null) {
                return bufferedSource;
            }
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("source");
            return null;
        }

        public final void setSource$okhttp(okio.BufferedSource bufferedSource) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bufferedSource, "<set-?>");
            this.source = bufferedSource;
        }

        public final okio.BufferedSink getSink$okhttp() {
            okio.BufferedSink bufferedSink = this.sink;
            if (bufferedSink != null) {
                return bufferedSink;
            }
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("sink");
            return null;
        }

        public final void setSink$okhttp(okio.BufferedSink bufferedSink) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bufferedSink, "<set-?>");
            this.sink = bufferedSink;
        }

        /* JADX INFO: renamed from: getListener$okhttp, reason: from getter */
        public final okhttp3.internal.http2.Http2Connection.Listener getListener() {
            return this.listener;
        }

        public final void setListener$okhttp(okhttp3.internal.http2.Http2Connection.Listener listener) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "<set-?>");
            this.listener = listener;
        }

        /* JADX INFO: renamed from: getPushObserver$okhttp, reason: from getter */
        public final okhttp3.internal.http2.PushObserver getPushObserver() {
            return this.pushObserver;
        }

        public final void setPushObserver$okhttp(okhttp3.internal.http2.PushObserver pushObserver) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pushObserver, "<set-?>");
            this.pushObserver = pushObserver;
        }

        /* JADX INFO: renamed from: getPingIntervalMillis$okhttp, reason: from getter */
        public final int getPingIntervalMillis() {
            return this.pingIntervalMillis;
        }

        public final void setPingIntervalMillis$okhttp(int i) {
            this.pingIntervalMillis = i;
        }

        public static /* synthetic */ okhttp3.internal.http2.Http2Connection.Builder socket$default(okhttp3.internal.http2.Http2Connection.Builder builder, java.net.Socket socket, java.lang.String str, okio.BufferedSource bufferedSource, okio.BufferedSink bufferedSink, int i, java.lang.Object obj) throws java.io.IOException {
            if ((i & 2) != 0) {
                str = okhttp3.internal.Util.peerName(socket);
            }
            if ((i & 4) != 0) {
                bufferedSource = okio.Okio.buffer(okio.Okio.source(socket));
            }
            if ((i & 8) != 0) {
                bufferedSink = okio.Okio.buffer(okio.Okio.sink(socket));
            }
            return builder.socket(socket, str, bufferedSource, bufferedSink);
        }

        public final okhttp3.internal.http2.Http2Connection.Builder socket(java.net.Socket socket, java.lang.String peerName, okio.BufferedSource source, okio.BufferedSink sink) throws java.io.IOException {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(socket, "socket");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(peerName, "peerName");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "sink");
            setSocket$okhttp(socket);
            setConnectionName$okhttp(this.client ? okhttp3.internal.Util.okHttpName + ' ' + peerName : "MockWebServer " + peerName);
            setSource$okhttp(source);
            setSink$okhttp(sink);
            return this;
        }

        public final okhttp3.internal.http2.Http2Connection.Builder listener(okhttp3.internal.http2.Http2Connection.Listener listener) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
            this.listener = listener;
            return this;
        }

        public final okhttp3.internal.http2.Http2Connection.Builder pushObserver(okhttp3.internal.http2.PushObserver pushObserver) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pushObserver, "pushObserver");
            this.pushObserver = pushObserver;
            return this;
        }

        public final okhttp3.internal.http2.Http2Connection.Builder pingIntervalMillis(int pingIntervalMillis) {
            this.pingIntervalMillis = pingIntervalMillis;
            return this;
        }

        public final okhttp3.internal.http2.Http2Connection build() {
            return new okhttp3.internal.http2.Http2Connection(this);
        }
    }

    /* JADX INFO: compiled from: Http2Connection.kt */
    @kotlin.Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0086\u0004\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u000f\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\u0003H\u0016J8\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0016\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019J(\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\fH\u0016J \u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\f2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0010H\u0016J.\u0010$\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010%\u001a\u00020\f2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020(0'H\u0016J\t\u0010)\u001a\u00020\u0003H\u0096\u0002J \u0010*\u001a\u00020\u00032\u0006\u0010+\u001a\u00020\u00172\u0006\u0010,\u001a\u00020\f2\u0006\u0010-\u001a\u00020\fH\u0016J(\u0010.\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010/\u001a\u00020\f2\u0006\u00100\u001a\u00020\f2\u0006\u00101\u001a\u00020\u0017H\u0016J&\u00102\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u00103\u001a\u00020\f2\f\u00104\u001a\b\u0012\u0004\u0012\u00020(0'H\u0016J\u0018\u00105\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010!\u001a\u00020\"H\u0016J\u0018\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0018\u00106\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u00107\u001a\u00020\u0014H\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u00068"}, d2 = {"Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;", "Lokhttp3/internal/http2/Http2Reader$Handler;", "Lkotlin/Function0;", "", "reader", "Lokhttp3/internal/http2/Http2Reader;", "(Lokhttp3/internal/http2/Http2Connection;Lokhttp3/internal/http2/Http2Reader;)V", "getReader$okhttp", "()Lokhttp3/internal/http2/Http2Reader;", "ackSettings", "alternateService", "streamId", "", "origin", "", "protocol", "Lokio/ByteString;", "host", org.jacoco.core.runtime.AgentOptions.PORT, "maxAge", "", "applyAndAckSettings", "clearPrevious", "", "settings", "Lokhttp3/internal/http2/Settings;", "data", "inFinished", "source", "Lokio/BufferedSource;", "length", "goAway", "lastGoodStreamId", com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, "Lokhttp3/internal/http2/ErrorCode;", "debugData", "headers", "associatedStreamId", "headerBlock", "", "Lokhttp3/internal/http2/Header;", "invoke", "ping", "ack", "payload1", "payload2", com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, "streamDependency", "weight", "exclusive", "pushPromise", "promisedStreamId", "requestHeaders", "rstStream", "windowUpdate", "windowSizeIncrement", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class ReaderRunnable implements okhttp3.internal.http2.Http2Reader.Handler, kotlin.jvm.functions.Function0<kotlin.Unit> {
        private final okhttp3.internal.http2.Http2Reader reader;
        final /* synthetic */ okhttp3.internal.http2.Http2Connection this$0;

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void ackSettings() {
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void alternateService(int streamId, java.lang.String origin, okio.ByteString protocol, java.lang.String host, int port, long maxAge) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(origin, "origin");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(protocol, "protocol");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(host, "host");
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void priority(int streamId, int streamDependency, int weight, boolean exclusive) {
        }

        public ReaderRunnable(okhttp3.internal.http2.Http2Connection http2Connection, okhttp3.internal.http2.Http2Reader reader) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "reader");
            this.this$0 = http2Connection;
            this.reader = reader;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
            invoke2();
            return kotlin.Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: getReader$okhttp, reason: from getter */
        public final okhttp3.internal.http2.Http2Reader getReader() {
            return this.reader;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public void invoke2() {
            okhttp3.internal.http2.ErrorCode errorCode;
            okhttp3.internal.http2.ErrorCode errorCode2 = okhttp3.internal.http2.ErrorCode.INTERNAL_ERROR;
            okhttp3.internal.http2.ErrorCode errorCode3 = okhttp3.internal.http2.ErrorCode.INTERNAL_ERROR;
            java.io.IOException e = null;
            try {
                try {
                    this.reader.readConnectionPreface(this);
                    while (this.reader.nextFrame(false, this)) {
                    }
                    errorCode2 = okhttp3.internal.http2.ErrorCode.NO_ERROR;
                    errorCode = okhttp3.internal.http2.ErrorCode.CANCEL;
                } catch (java.io.IOException e2) {
                    e = e2;
                    errorCode2 = okhttp3.internal.http2.ErrorCode.PROTOCOL_ERROR;
                    errorCode = okhttp3.internal.http2.ErrorCode.PROTOCOL_ERROR;
                }
                this.this$0.close$okhttp(errorCode2, errorCode, e);
            } finally {
                this.this$0.close$okhttp(errorCode2, errorCode3, e);
                okhttp3.internal.Util.closeQuietly(this.reader);
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void data(boolean inFinished, int streamId, okio.BufferedSource source, int length) throws java.io.IOException {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
            if (this.this$0.pushedStream$okhttp(streamId)) {
                this.this$0.pushDataLater$okhttp(streamId, source, length, inFinished);
                return;
            }
            okhttp3.internal.http2.Http2Stream stream = this.this$0.getStream(streamId);
            if (stream == null) {
                this.this$0.writeSynResetLater$okhttp(streamId, okhttp3.internal.http2.ErrorCode.PROTOCOL_ERROR);
                long j = length;
                this.this$0.updateConnectionFlowControl$okhttp(j);
                source.skip(j);
                return;
            }
            stream.receiveData(source, length);
            if (inFinished) {
                stream.receiveHeaders(okhttp3.internal.Util.EMPTY_HEADERS, true);
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void headers(boolean inFinished, int streamId, int associatedStreamId, java.util.List<okhttp3.internal.http2.Header> headerBlock) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headerBlock, "headerBlock");
            if (this.this$0.pushedStream$okhttp(streamId)) {
                this.this$0.pushHeadersLater$okhttp(streamId, headerBlock, inFinished);
                return;
            }
            final okhttp3.internal.http2.Http2Connection http2Connection = this.this$0;
            synchronized (http2Connection) {
                okhttp3.internal.http2.Http2Stream stream = http2Connection.getStream(streamId);
                if (stream == null) {
                    if (http2Connection.isShutdown) {
                        return;
                    }
                    if (streamId <= http2Connection.getLastGoodStreamId()) {
                        return;
                    }
                    if (streamId % 2 == http2Connection.getNextStreamId() % 2) {
                        return;
                    }
                    final okhttp3.internal.http2.Http2Stream http2Stream = new okhttp3.internal.http2.Http2Stream(streamId, http2Connection, false, inFinished, okhttp3.internal.Util.toHeaders(headerBlock));
                    http2Connection.setLastGoodStreamId$okhttp(streamId);
                    http2Connection.getStreams$okhttp().put(java.lang.Integer.valueOf(streamId), http2Stream);
                    okhttp3.internal.concurrent.TaskQueue taskQueueNewQueue = http2Connection.taskRunner.newQueue();
                    final java.lang.String str = http2Connection.getConnectionName() + '[' + streamId + "] onStream";
                    final boolean z = true;
                    taskQueueNewQueue.schedule(new okhttp3.internal.concurrent.Task(str, z) { // from class: okhttp3.internal.http2.Http2Connection$ReaderRunnable$headers$lambda$2$$inlined$execute$default$1
                        @Override // okhttp3.internal.concurrent.Task
                        public long runOnce() {
                            try {
                                http2Connection.getListener().onStream(http2Stream);
                                return -1L;
                            } catch (java.io.IOException e) {
                                okhttp3.internal.platform.Platform.INSTANCE.get().log("Http2Connection.Listener failure for " + http2Connection.getConnectionName(), 4, e);
                                try {
                                    http2Stream.close(okhttp3.internal.http2.ErrorCode.PROTOCOL_ERROR, e);
                                    return -1L;
                                } catch (java.io.IOException unused) {
                                    return -1L;
                                }
                            }
                        }
                    }, 0L);
                    return;
                }
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                stream.receiveHeaders(okhttp3.internal.Util.toHeaders(headerBlock), inFinished);
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void rstStream(int streamId, okhttp3.internal.http2.ErrorCode errorCode) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorCode, "errorCode");
            if (this.this$0.pushedStream$okhttp(streamId)) {
                this.this$0.pushResetLater$okhttp(streamId, errorCode);
                return;
            }
            okhttp3.internal.http2.Http2Stream http2StreamRemoveStream$okhttp = this.this$0.removeStream$okhttp(streamId);
            if (http2StreamRemoveStream$okhttp != null) {
                http2StreamRemoveStream$okhttp.receiveRstStream(errorCode);
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void settings(final boolean clearPrevious, final okhttp3.internal.http2.Settings settings) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settings, "settings");
            okhttp3.internal.concurrent.TaskQueue taskQueue = this.this$0.writerQueue;
            final java.lang.String str = this.this$0.getConnectionName() + " applyAndAckSettings";
            final boolean z = true;
            taskQueue.schedule(new okhttp3.internal.concurrent.Task(str, z) { // from class: okhttp3.internal.http2.Http2Connection$ReaderRunnable$settings$$inlined$execute$default$1
                @Override // okhttp3.internal.concurrent.Task
                public long runOnce() {
                    this.applyAndAckSettings(clearPrevious, settings);
                    return -1L;
                }
            }, 0L);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void applyAndAckSettings(boolean clearPrevious, okhttp3.internal.http2.Settings settings) {
            T t;
            long initialWindowSize;
            int i;
            okhttp3.internal.http2.Http2Stream[] http2StreamArr;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settings, "settings");
            final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
            okhttp3.internal.http2.Http2Writer writer = this.this$0.getWriter();
            final okhttp3.internal.http2.Http2Connection http2Connection = this.this$0;
            synchronized (writer) {
                synchronized (http2Connection) {
                    okhttp3.internal.http2.Settings peerSettings = http2Connection.getPeerSettings();
                    if (clearPrevious) {
                        t = settings;
                    } else {
                        okhttp3.internal.http2.Settings settings2 = new okhttp3.internal.http2.Settings();
                        settings2.merge(peerSettings);
                        settings2.merge(settings);
                        t = settings2;
                    }
                    objectRef.element = t;
                    initialWindowSize = ((long) ((okhttp3.internal.http2.Settings) objectRef.element).getInitialWindowSize()) - ((long) peerSettings.getInitialWindowSize());
                    http2StreamArr = (initialWindowSize == 0 || http2Connection.getStreams$okhttp().isEmpty()) ? null : (okhttp3.internal.http2.Http2Stream[]) http2Connection.getStreams$okhttp().values().toArray(new okhttp3.internal.http2.Http2Stream[0]);
                    http2Connection.setPeerSettings((okhttp3.internal.http2.Settings) objectRef.element);
                    okhttp3.internal.concurrent.TaskQueue taskQueue = http2Connection.settingsListenerQueue;
                    final java.lang.String str = http2Connection.getConnectionName() + " onSettings";
                    final boolean z = true;
                    taskQueue.schedule(new okhttp3.internal.concurrent.Task(str, z) { // from class: okhttp3.internal.http2.Http2Connection$ReaderRunnable$applyAndAckSettings$lambda$7$lambda$6$$inlined$execute$default$1
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // okhttp3.internal.concurrent.Task
                        public long runOnce() {
                            http2Connection.getListener().onSettings(http2Connection, (okhttp3.internal.http2.Settings) objectRef.element);
                            return -1L;
                        }
                    }, 0L);
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                }
                try {
                    http2Connection.getWriter().applyAndAckSettings((okhttp3.internal.http2.Settings) objectRef.element);
                } catch (java.io.IOException e) {
                    http2Connection.failConnection(e);
                }
                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
            }
            if (http2StreamArr != null) {
                for (okhttp3.internal.http2.Http2Stream http2Stream : http2StreamArr) {
                    synchronized (http2Stream) {
                        http2Stream.addBytesToWriteWindow(initialWindowSize);
                        kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                    }
                }
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void ping(boolean ack, final int payload1, final int payload2) {
            if (!ack) {
                okhttp3.internal.concurrent.TaskQueue taskQueue = this.this$0.writerQueue;
                final java.lang.String str = this.this$0.getConnectionName() + " ping";
                final okhttp3.internal.http2.Http2Connection http2Connection = this.this$0;
                final boolean z = true;
                taskQueue.schedule(new okhttp3.internal.concurrent.Task(str, z) { // from class: okhttp3.internal.http2.Http2Connection$ReaderRunnable$ping$$inlined$execute$default$1
                    @Override // okhttp3.internal.concurrent.Task
                    public long runOnce() {
                        http2Connection.writePing(true, payload1, payload2);
                        return -1L;
                    }
                }, 0L);
                return;
            }
            okhttp3.internal.http2.Http2Connection http2Connection2 = this.this$0;
            synchronized (http2Connection2) {
                try {
                    if (payload1 == 1) {
                        long j = http2Connection2.intervalPongsReceived;
                        http2Connection2.intervalPongsReceived = 1 + j;
                        java.lang.Long.valueOf(j);
                    } else if (payload1 == 2) {
                        long j2 = http2Connection2.degradedPongsReceived;
                        http2Connection2.degradedPongsReceived = 1 + j2;
                        java.lang.Long.valueOf(j2);
                    } else {
                        if (payload1 == 3) {
                            http2Connection2.awaitPongsReceived++;
                            kotlin.jvm.internal.Intrinsics.checkNotNull(http2Connection2, "null cannot be cast to non-null type java.lang.Object");
                            http2Connection2.notifyAll();
                        }
                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void goAway(int lastGoodStreamId, okhttp3.internal.http2.ErrorCode errorCode, okio.ByteString debugData) {
            int i;
            java.lang.Object[] array;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorCode, "errorCode");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debugData, "debugData");
            debugData.size();
            okhttp3.internal.http2.Http2Connection http2Connection = this.this$0;
            synchronized (http2Connection) {
                array = http2Connection.getStreams$okhttp().values().toArray(new okhttp3.internal.http2.Http2Stream[0]);
                http2Connection.isShutdown = true;
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
            for (okhttp3.internal.http2.Http2Stream http2Stream : (okhttp3.internal.http2.Http2Stream[]) array) {
                if (http2Stream.getId() > lastGoodStreamId && http2Stream.isLocallyInitiated()) {
                    http2Stream.receiveRstStream(okhttp3.internal.http2.ErrorCode.REFUSED_STREAM);
                    this.this$0.removeStream$okhttp(http2Stream.getId());
                }
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void windowUpdate(int streamId, long windowSizeIncrement) {
            if (streamId == 0) {
                okhttp3.internal.http2.Http2Connection http2Connection = this.this$0;
                synchronized (http2Connection) {
                    http2Connection.writeBytesMaximum = http2Connection.getWriteBytesMaximum() + windowSizeIncrement;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(http2Connection, "null cannot be cast to non-null type java.lang.Object");
                    http2Connection.notifyAll();
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                }
                return;
            }
            okhttp3.internal.http2.Http2Stream stream = this.this$0.getStream(streamId);
            if (stream != null) {
                synchronized (stream) {
                    stream.addBytesToWriteWindow(windowSizeIncrement);
                    kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                }
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void pushPromise(int streamId, int promisedStreamId, java.util.List<okhttp3.internal.http2.Header> requestHeaders) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
            this.this$0.pushRequestLater$okhttp(promisedStreamId, requestHeaders);
        }
    }

    public final void pushRequestLater$okhttp(final int streamId, final java.util.List<okhttp3.internal.http2.Header> requestHeaders) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        synchronized (this) {
            if (this.currentPushRequests.contains(java.lang.Integer.valueOf(streamId))) {
                writeSynResetLater$okhttp(streamId, okhttp3.internal.http2.ErrorCode.PROTOCOL_ERROR);
                return;
            }
            this.currentPushRequests.add(java.lang.Integer.valueOf(streamId));
            okhttp3.internal.concurrent.TaskQueue taskQueue = this.pushQueue;
            final java.lang.String str = this.connectionName + '[' + streamId + "] onRequest";
            final boolean z = true;
            taskQueue.schedule(new okhttp3.internal.concurrent.Task(str, z) { // from class: okhttp3.internal.http2.Http2Connection$pushRequestLater$$inlined$execute$default$1
                @Override // okhttp3.internal.concurrent.Task
                public long runOnce() {
                    if (!this.pushObserver.onRequest(streamId, requestHeaders)) {
                        return -1L;
                    }
                    try {
                        this.getWriter().rstStream(streamId, okhttp3.internal.http2.ErrorCode.CANCEL);
                        synchronized (this) {
                            this.currentPushRequests.remove(java.lang.Integer.valueOf(streamId));
                        }
                        return -1L;
                    } catch (java.io.IOException unused) {
                        return -1L;
                    }
                }
            }, 0L);
        }
    }

    public final void pushHeadersLater$okhttp(final int streamId, final java.util.List<okhttp3.internal.http2.Header> requestHeaders, final boolean inFinished) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        okhttp3.internal.concurrent.TaskQueue taskQueue = this.pushQueue;
        final java.lang.String str = this.connectionName + '[' + streamId + "] onHeaders";
        final boolean z = true;
        taskQueue.schedule(new okhttp3.internal.concurrent.Task(str, z) { // from class: okhttp3.internal.http2.Http2Connection$pushHeadersLater$$inlined$execute$default$1
            @Override // okhttp3.internal.concurrent.Task
            public long runOnce() {
                boolean zOnHeaders = this.pushObserver.onHeaders(streamId, requestHeaders, inFinished);
                if (zOnHeaders) {
                    try {
                        this.getWriter().rstStream(streamId, okhttp3.internal.http2.ErrorCode.CANCEL);
                    } catch (java.io.IOException unused) {
                        return -1L;
                    }
                }
                if (!zOnHeaders && !inFinished) {
                    return -1L;
                }
                synchronized (this) {
                    this.currentPushRequests.remove(java.lang.Integer.valueOf(streamId));
                }
                return -1L;
            }
        }, 0L);
    }

    public final void pushDataLater$okhttp(final int streamId, okio.BufferedSource source, final int byteCount, final boolean inFinished) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        final okio.Buffer buffer = new okio.Buffer();
        long j = byteCount;
        source.require(j);
        source.read(buffer, j);
        okhttp3.internal.concurrent.TaskQueue taskQueue = this.pushQueue;
        final java.lang.String str = this.connectionName + '[' + streamId + "] onData";
        final boolean z = true;
        taskQueue.schedule(new okhttp3.internal.concurrent.Task(str, z) { // from class: okhttp3.internal.http2.Http2Connection$pushDataLater$$inlined$execute$default$1
            @Override // okhttp3.internal.concurrent.Task
            public long runOnce() {
                try {
                    boolean zOnData = this.pushObserver.onData(streamId, buffer, byteCount, inFinished);
                    if (zOnData) {
                        this.getWriter().rstStream(streamId, okhttp3.internal.http2.ErrorCode.CANCEL);
                    }
                    if (!zOnData && !inFinished) {
                        return -1L;
                    }
                    synchronized (this) {
                        this.currentPushRequests.remove(java.lang.Integer.valueOf(streamId));
                    }
                    return -1L;
                } catch (java.io.IOException unused) {
                    return -1L;
                }
            }
        }, 0L);
    }

    public final void pushResetLater$okhttp(final int streamId, final okhttp3.internal.http2.ErrorCode errorCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        okhttp3.internal.concurrent.TaskQueue taskQueue = this.pushQueue;
        final java.lang.String str = this.connectionName + '[' + streamId + "] onReset";
        final boolean z = true;
        taskQueue.schedule(new okhttp3.internal.concurrent.Task(str, z) { // from class: okhttp3.internal.http2.Http2Connection$pushResetLater$$inlined$execute$default$1
            @Override // okhttp3.internal.concurrent.Task
            public long runOnce() {
                this.pushObserver.onReset(streamId, errorCode);
                synchronized (this) {
                    this.currentPushRequests.remove(java.lang.Integer.valueOf(streamId));
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                }
                return -1L;
            }
        }, 0L);
    }

    /* JADX INFO: compiled from: Http2Connection.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lokhttp3/internal/http2/Http2Connection$Companion;", "", "()V", "AWAIT_PING", "", "DEFAULT_SETTINGS", "Lokhttp3/internal/http2/Settings;", "getDEFAULT_SETTINGS", "()Lokhttp3/internal/http2/Settings;", "DEGRADED_PING", "DEGRADED_PONG_TIMEOUT_NS", "INTERVAL_PING", "OKHTTP_CLIENT_WINDOW_SIZE", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final okhttp3.internal.http2.Settings getDEFAULT_SETTINGS() {
            return okhttp3.internal.http2.Http2Connection.DEFAULT_SETTINGS;
        }
    }

    static {
        okhttp3.internal.http2.Settings settings = new okhttp3.internal.http2.Settings();
        settings.set(7, 65535);
        settings.set(5, 16384);
        DEFAULT_SETTINGS = settings;
    }

    public final void close$okhttp(okhttp3.internal.http2.ErrorCode connectionCode, okhttp3.internal.http2.ErrorCode streamCode, java.io.IOException cause) {
        int i;
        java.lang.Object[] array;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectionCode, "connectionCode");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(streamCode, "streamCode");
        if (!okhttp3.internal.Util.assertionsEnabled || !java.lang.Thread.holdsLock(this)) {
            try {
                shutdown(connectionCode);
            } catch (java.io.IOException unused) {
            }
            synchronized (this) {
                if (!this.streams.isEmpty()) {
                    array = this.streams.values().toArray(new okhttp3.internal.http2.Http2Stream[0]);
                    this.streams.clear();
                } else {
                    array = null;
                }
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
            okhttp3.internal.http2.Http2Stream[] http2StreamArr = (okhttp3.internal.http2.Http2Stream[]) array;
            if (http2StreamArr != null) {
                for (okhttp3.internal.http2.Http2Stream http2Stream : http2StreamArr) {
                    try {
                        http2Stream.close(streamCode, cause);
                    } catch (java.io.IOException unused2) {
                    }
                }
            }
            try {
                this.writer.close();
            } catch (java.io.IOException unused3) {
            }
            try {
                this.socket.close();
            } catch (java.io.IOException unused4) {
            }
            this.writerQueue.shutdown();
            this.pushQueue.shutdown();
            this.settingsListenerQueue.shutdown();
            return;
        }
        throw new java.lang.AssertionError("Thread " + java.lang.Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
    }
}
