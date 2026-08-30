package okhttp3.internal.http2;

/* JADX INFO: compiled from: Http2Reader.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 #2\u00020\u0001:\u0003#$%B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0016\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010J(\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0002J(\u0010\u0017\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0002J.\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0002J(\u0010\u001c\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0002J(\u0010\u001d\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0002J\u0018\u0010\u001e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0014H\u0002J(\u0010\u001e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0002J(\u0010\u001f\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0002J(\u0010 \u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0002J(\u0010!\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0002J(\u0010\"\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lokhttp3/internal/http2/Http2Reader;", "Ljava/io/Closeable;", "source", "Lokio/BufferedSource;", "client", "", "(Lokio/BufferedSource;Z)V", "continuation", "Lokhttp3/internal/http2/Http2Reader$ContinuationSource;", "hpackReader", "Lokhttp3/internal/http2/Hpack$Reader;", "close", "", "nextFrame", "requireSettings", "handler", "Lokhttp3/internal/http2/Http2Reader$Handler;", "readConnectionPreface", "readData", "length", "", "flags", "streamId", "readGoAway", "readHeaderBlock", "", "Lokhttp3/internal/http2/Header;", "padding", "readHeaders", "readPing", "readPriority", "readPushPromise", "readRstStream", "readSettings", "readWindowUpdate", "Companion", "ContinuationSource", "Handler", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Http2Reader implements java.io.Closeable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final okhttp3.internal.http2.Http2Reader.Companion INSTANCE = new okhttp3.internal.http2.Http2Reader.Companion(null);
    private static final java.util.logging.Logger logger;
    private final boolean client;
    private final okhttp3.internal.http2.Http2Reader.ContinuationSource continuation;
    private final okhttp3.internal.http2.Hpack.Reader hpackReader;
    private final okio.BufferedSource source;

    /* JADX INFO: compiled from: Http2Reader.kt */
    @kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J8\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000eH&J(\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0006H&J \u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\nH&J.\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00062\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH&J \u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u0006H&J(\u0010#\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u0011H&J&\u0010'\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u00062\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH&J\u0018\u0010*\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0018H&J\u0018\u0010+\u001a\u00020\u00032\u0006\u0010,\u001a\u00020\u00112\u0006\u0010+\u001a\u00020-H&J\u0018\u0010.\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u000eH&¨\u00060"}, d2 = {"Lokhttp3/internal/http2/Http2Reader$Handler;", "", "ackSettings", "", "alternateService", "streamId", "", "origin", "", "protocol", "Lokio/ByteString;", "host", org.jacoco.core.runtime.AgentOptions.PORT, "maxAge", "", "data", "inFinished", "", "source", "Lokio/BufferedSource;", "length", "goAway", "lastGoodStreamId", com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, "Lokhttp3/internal/http2/ErrorCode;", "debugData", "headers", "associatedStreamId", "headerBlock", "", "Lokhttp3/internal/http2/Header;", "ping", "ack", "payload1", "payload2", com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, "streamDependency", "weight", "exclusive", "pushPromise", "promisedStreamId", "requestHeaders", "rstStream", "settings", "clearPrevious", "Lokhttp3/internal/http2/Settings;", "windowUpdate", "windowSizeIncrement", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Handler {
        void ackSettings();

        void alternateService(int streamId, java.lang.String origin, okio.ByteString protocol, java.lang.String host, int port, long maxAge);

        void data(boolean inFinished, int streamId, okio.BufferedSource source, int length) throws java.io.IOException;

        void goAway(int lastGoodStreamId, okhttp3.internal.http2.ErrorCode errorCode, okio.ByteString debugData);

        void headers(boolean inFinished, int streamId, int associatedStreamId, java.util.List<okhttp3.internal.http2.Header> headerBlock);

        void ping(boolean ack, int payload1, int payload2);

        void priority(int streamId, int streamDependency, int weight, boolean exclusive);

        void pushPromise(int streamId, int promisedStreamId, java.util.List<okhttp3.internal.http2.Header> requestHeaders) throws java.io.IOException;

        void rstStream(int streamId, okhttp3.internal.http2.ErrorCode errorCode);

        void settings(boolean clearPrevious, okhttp3.internal.http2.Settings settings);

        void windowUpdate(int streamId, long windowSizeIncrement);
    }

    public Http2Reader(okio.BufferedSource source, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        this.source = source;
        this.client = z;
        okhttp3.internal.http2.Http2Reader.ContinuationSource continuationSource = new okhttp3.internal.http2.Http2Reader.ContinuationSource(source);
        this.continuation = continuationSource;
        this.hpackReader = new okhttp3.internal.http2.Hpack.Reader(continuationSource, 4096, 0, 4, null);
    }

    public final void readConnectionPreface(okhttp3.internal.http2.Http2Reader.Handler handler) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handler, "handler");
        if (this.client) {
            if (!nextFrame(true, handler)) {
                throw new java.io.IOException("Required SETTINGS preface not received");
            }
            return;
        }
        okio.ByteString byteString = this.source.readByteString(okhttp3.internal.http2.Http2.CONNECTION_PREFACE.size());
        java.util.logging.Logger logger2 = logger;
        if (logger2.isLoggable(java.util.logging.Level.FINE)) {
            logger2.fine(okhttp3.internal.Util.format("<< CONNECTION " + byteString.hex(), new java.lang.Object[0]));
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(okhttp3.internal.http2.Http2.CONNECTION_PREFACE, byteString)) {
            throw new java.io.IOException("Expected a connection header but was " + byteString.utf8());
        }
    }

    public final boolean nextFrame(boolean requireSettings, okhttp3.internal.http2.Http2Reader.Handler handler) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handler, "handler");
        try {
            this.source.require(9L);
            int medium = okhttp3.internal.Util.readMedium(this.source);
            if (medium > 16384) {
                throw new java.io.IOException("FRAME_SIZE_ERROR: " + medium);
            }
            int iAnd = okhttp3.internal.Util.and(this.source.readByte(), 255);
            int iAnd2 = okhttp3.internal.Util.and(this.source.readByte(), 255);
            int i = this.source.readInt() & Integer.MAX_VALUE;
            java.util.logging.Logger logger2 = logger;
            if (logger2.isLoggable(java.util.logging.Level.FINE)) {
                logger2.fine(okhttp3.internal.http2.Http2.INSTANCE.frameLog(true, i, medium, iAnd, iAnd2));
            }
            if (requireSettings && iAnd != 4) {
                throw new java.io.IOException("Expected a SETTINGS frame but was " + okhttp3.internal.http2.Http2.INSTANCE.formattedType$okhttp(iAnd));
            }
            switch (iAnd) {
                case 0:
                    readData(handler, medium, iAnd2, i);
                    return true;
                case 1:
                    readHeaders(handler, medium, iAnd2, i);
                    return true;
                case 2:
                    readPriority(handler, medium, iAnd2, i);
                    return true;
                case 3:
                    readRstStream(handler, medium, iAnd2, i);
                    return true;
                case 4:
                    readSettings(handler, medium, iAnd2, i);
                    return true;
                case 5:
                    readPushPromise(handler, medium, iAnd2, i);
                    return true;
                case 6:
                    readPing(handler, medium, iAnd2, i);
                    return true;
                case 7:
                    readGoAway(handler, medium, iAnd2, i);
                    return true;
                case 8:
                    readWindowUpdate(handler, medium, iAnd2, i);
                    return true;
                default:
                    this.source.skip(medium);
                    return true;
            }
        } catch (java.io.EOFException unused) {
            return false;
        }
    }

    private final void readHeaders(okhttp3.internal.http2.Http2Reader.Handler handler, int length, int flags, int streamId) throws java.io.IOException {
        if (streamId == 0) {
            throw new java.io.IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        boolean z = (flags & 1) != 0;
        int iAnd = (flags & 8) != 0 ? okhttp3.internal.Util.and(this.source.readByte(), 255) : 0;
        if ((flags & 32) != 0) {
            readPriority(handler, streamId);
            length -= 5;
        }
        handler.headers(z, streamId, -1, readHeaderBlock(INSTANCE.lengthWithoutPadding(length, flags, iAnd), iAnd, flags, streamId));
    }

    private final java.util.List<okhttp3.internal.http2.Header> readHeaderBlock(int length, int padding, int flags, int streamId) throws java.io.IOException {
        this.continuation.setLeft(length);
        okhttp3.internal.http2.Http2Reader.ContinuationSource continuationSource = this.continuation;
        continuationSource.setLength(continuationSource.getLeft());
        this.continuation.setPadding(padding);
        this.continuation.setFlags(flags);
        this.continuation.setStreamId(streamId);
        this.hpackReader.readHeaders();
        return this.hpackReader.getAndResetHeaderList();
    }

    private final void readData(okhttp3.internal.http2.Http2Reader.Handler handler, int length, int flags, int streamId) throws java.io.IOException {
        if (streamId == 0) {
            throw new java.io.IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
        }
        boolean z = (flags & 1) != 0;
        if ((flags & 32) != 0) {
            throw new java.io.IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        int iAnd = (flags & 8) != 0 ? okhttp3.internal.Util.and(this.source.readByte(), 255) : 0;
        handler.data(z, streamId, this.source, INSTANCE.lengthWithoutPadding(length, flags, iAnd));
        this.source.skip(iAnd);
    }

    private final void readPriority(okhttp3.internal.http2.Http2Reader.Handler handler, int length, int flags, int streamId) throws java.io.IOException {
        if (length != 5) {
            throw new java.io.IOException("TYPE_PRIORITY length: " + length + " != 5");
        }
        if (streamId == 0) {
            throw new java.io.IOException("TYPE_PRIORITY streamId == 0");
        }
        readPriority(handler, streamId);
    }

    private final void readPriority(okhttp3.internal.http2.Http2Reader.Handler handler, int streamId) throws java.io.IOException {
        int i = this.source.readInt();
        handler.priority(streamId, i & Integer.MAX_VALUE, okhttp3.internal.Util.and(this.source.readByte(), 255) + 1, (Integer.MIN_VALUE & i) != 0);
    }

    private final void readRstStream(okhttp3.internal.http2.Http2Reader.Handler handler, int length, int flags, int streamId) throws java.io.IOException {
        if (length != 4) {
            throw new java.io.IOException("TYPE_RST_STREAM length: " + length + " != 4");
        }
        if (streamId == 0) {
            throw new java.io.IOException("TYPE_RST_STREAM streamId == 0");
        }
        int i = this.source.readInt();
        okhttp3.internal.http2.ErrorCode errorCodeFromHttp2 = okhttp3.internal.http2.ErrorCode.INSTANCE.fromHttp2(i);
        if (errorCodeFromHttp2 == null) {
            throw new java.io.IOException("TYPE_RST_STREAM unexpected error code: " + i);
        }
        handler.rstStream(streamId, errorCodeFromHttp2);
    }

    private final void readSettings(okhttp3.internal.http2.Http2Reader.Handler handler, int length, int flags, int streamId) throws java.io.IOException {
        if (streamId != 0) {
            throw new java.io.IOException("TYPE_SETTINGS streamId != 0");
        }
        if ((flags & 1) != 0) {
            if (length != 0) {
                throw new java.io.IOException("FRAME_SIZE_ERROR ack frame should be empty!");
            }
            handler.ackSettings();
            return;
        }
        if (length % 6 != 0) {
            throw new java.io.IOException("TYPE_SETTINGS length % 6 != 0: " + length);
        }
        okhttp3.internal.http2.Settings settings = new okhttp3.internal.http2.Settings();
        kotlin.ranges.IntProgression intProgressionStep = kotlin.ranges.RangesKt.step(kotlin.ranges.RangesKt.until(0, length), 6);
        int first = intProgressionStep.getFirst();
        int last = intProgressionStep.getLast();
        int step = intProgressionStep.getStep();
        if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
            while (true) {
                int iAnd = okhttp3.internal.Util.and(this.source.readShort(), 65535);
                int i = this.source.readInt();
                if (iAnd != 2) {
                    if (iAnd == 3) {
                        iAnd = 4;
                    } else if (iAnd != 4) {
                        if (iAnd == 5 && (i < 16384 || i > 16777215)) {
                            throw new java.io.IOException("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: " + i);
                        }
                    } else {
                        if (i < 0) {
                            throw new java.io.IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                        }
                        iAnd = 7;
                    }
                } else if (i != 0 && i != 1) {
                    throw new java.io.IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                }
                settings.set(iAnd, i);
                if (first != last) {
                    first += step;
                }
            }
        }
        handler.settings(false, settings);
    }

    private final void readPushPromise(okhttp3.internal.http2.Http2Reader.Handler handler, int length, int flags, int streamId) throws java.io.IOException {
        if (streamId == 0) {
            throw new java.io.IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        int iAnd = (flags & 8) != 0 ? okhttp3.internal.Util.and(this.source.readByte(), 255) : 0;
        handler.pushPromise(streamId, this.source.readInt() & Integer.MAX_VALUE, readHeaderBlock(INSTANCE.lengthWithoutPadding(length - 4, flags, iAnd), iAnd, flags, streamId));
    }

    private final void readPing(okhttp3.internal.http2.Http2Reader.Handler handler, int length, int flags, int streamId) throws java.io.IOException {
        if (length != 8) {
            throw new java.io.IOException("TYPE_PING length != 8: " + length);
        }
        if (streamId != 0) {
            throw new java.io.IOException("TYPE_PING streamId != 0");
        }
        handler.ping((flags & 1) != 0, this.source.readInt(), this.source.readInt());
    }

    private final void readGoAway(okhttp3.internal.http2.Http2Reader.Handler handler, int length, int flags, int streamId) throws java.io.IOException {
        if (length < 8) {
            throw new java.io.IOException("TYPE_GOAWAY length < 8: " + length);
        }
        if (streamId != 0) {
            throw new java.io.IOException("TYPE_GOAWAY streamId != 0");
        }
        int i = this.source.readInt();
        int i2 = this.source.readInt();
        int i3 = length - 8;
        okhttp3.internal.http2.ErrorCode errorCodeFromHttp2 = okhttp3.internal.http2.ErrorCode.INSTANCE.fromHttp2(i2);
        if (errorCodeFromHttp2 == null) {
            throw new java.io.IOException("TYPE_GOAWAY unexpected error code: " + i2);
        }
        okio.ByteString byteString = okio.ByteString.EMPTY;
        if (i3 > 0) {
            byteString = this.source.readByteString(i3);
        }
        handler.goAway(i, errorCodeFromHttp2, byteString);
    }

    private final void readWindowUpdate(okhttp3.internal.http2.Http2Reader.Handler handler, int length, int flags, int streamId) throws java.io.IOException {
        if (length != 4) {
            throw new java.io.IOException("TYPE_WINDOW_UPDATE length !=4: " + length);
        }
        long jAnd = okhttp3.internal.Util.and(this.source.readInt(), 2147483647L);
        if (jAnd == 0) {
            throw new java.io.IOException("windowSizeIncrement was 0");
        }
        handler.windowUpdate(streamId, jAnd);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        this.source.close();
    }

    /* JADX INFO: compiled from: Http2Reader.kt */
    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001aH\u0016J\b\u0010\u001e\u001a\u00020\u0018H\u0002J\b\u0010\u001f\u001a\u00020 H\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u001a\u0010\u000e\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\b\"\u0004\b\u0010\u0010\nR\u001a\u0010\u0011\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\b\"\u0004\b\u0013\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\b\"\u0004\b\u0016\u0010\n¨\u0006!"}, d2 = {"Lokhttp3/internal/http2/Http2Reader$ContinuationSource;", "Lokio/Source;", "source", "Lokio/BufferedSource;", "(Lokio/BufferedSource;)V", "flags", "", "getFlags", "()I", "setFlags", "(I)V", androidx.media3.extractor.text.ttml.TtmlNode.LEFT, "getLeft", "setLeft", "length", "getLength", "setLength", "padding", "getPadding", "setPadding", "streamId", "getStreamId", "setStreamId", "close", "", "read", "", "sink", "Lokio/Buffer;", "byteCount", "readContinuationHeader", "timeout", "Lokio/Timeout;", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ContinuationSource implements okio.Source {
        private int flags;
        private int left;
        private int length;
        private int padding;
        private final okio.BufferedSource source;
        private int streamId;

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws java.io.IOException {
        }

        public ContinuationSource(okio.BufferedSource source) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
            this.source = source;
        }

        public final int getLength() {
            return this.length;
        }

        public final void setLength(int i) {
            this.length = i;
        }

        public final int getFlags() {
            return this.flags;
        }

        public final void setFlags(int i) {
            this.flags = i;
        }

        public final int getStreamId() {
            return this.streamId;
        }

        public final void setStreamId(int i) {
            this.streamId = i;
        }

        public final int getLeft() {
            return this.left;
        }

        public final void setLeft(int i) {
            this.left = i;
        }

        public final int getPadding() {
            return this.padding;
        }

        public final void setPadding(int i) {
            this.padding = i;
        }

        @Override // okio.Source
        public long read(okio.Buffer sink, long byteCount) throws java.io.IOException {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "sink");
            while (true) {
                int i = this.left;
                if (i == 0) {
                    this.source.skip(this.padding);
                    this.padding = 0;
                    if ((this.flags & 4) != 0) {
                        return -1L;
                    }
                    readContinuationHeader();
                } else {
                    long j = this.source.read(sink, java.lang.Math.min(byteCount, i));
                    if (j == -1) {
                        return -1L;
                    }
                    this.left -= (int) j;
                    return j;
                }
            }
        }

        @Override // okio.Source
        /* JADX INFO: renamed from: timeout */
        public okio.Timeout getTimeout() {
            return this.source.getTimeout();
        }

        private final void readContinuationHeader() throws java.io.IOException {
            int i = this.streamId;
            int medium = okhttp3.internal.Util.readMedium(this.source);
            this.left = medium;
            this.length = medium;
            int iAnd = okhttp3.internal.Util.and(this.source.readByte(), 255);
            this.flags = okhttp3.internal.Util.and(this.source.readByte(), 255);
            if (okhttp3.internal.http2.Http2Reader.INSTANCE.getLogger().isLoggable(java.util.logging.Level.FINE)) {
                okhttp3.internal.http2.Http2Reader.INSTANCE.getLogger().fine(okhttp3.internal.http2.Http2.INSTANCE.frameLog(true, this.streamId, this.length, iAnd, this.flags));
            }
            int i2 = this.source.readInt() & Integer.MAX_VALUE;
            this.streamId = i2;
            if (iAnd != 9) {
                throw new java.io.IOException(iAnd + " != TYPE_CONTINUATION");
            }
            if (i2 != i) {
                throw new java.io.IOException("TYPE_CONTINUATION streamId changed");
            }
        }
    }

    /* JADX INFO: compiled from: Http2Reader.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Lokhttp3/internal/http2/Http2Reader$Companion;", "", "()V", "logger", "Ljava/util/logging/Logger;", "getLogger", "()Ljava/util/logging/Logger;", "lengthWithoutPadding", "", "length", "flags", "padding", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final java.util.logging.Logger getLogger() {
            return okhttp3.internal.http2.Http2Reader.logger;
        }

        public final int lengthWithoutPadding(int length, int flags, int padding) throws java.io.IOException {
            if ((flags & 8) != 0) {
                length--;
            }
            if (padding <= length) {
                return length - padding;
            }
            throw new java.io.IOException("PROTOCOL_ERROR padding " + padding + " > remaining length " + length);
        }
    }

    static {
        java.util.logging.Logger logger2 = java.util.logging.Logger.getLogger(okhttp3.internal.http2.Http2.class.getName());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(logger2, "getLogger(Http2::class.java.name)");
        logger = logger2;
    }
}
