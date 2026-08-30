package okhttp3.internal.ws;

/* JADX INFO: compiled from: WebSocketWriter.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u0018\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!J\u0018\u0010\"\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020!H\u0002J\u0016\u0010%\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u001f2\u0006\u0010'\u001a\u00020!J\u000e\u0010(\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020!J\u000e\u0010)\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020!R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lokhttp3/internal/ws/WebSocketWriter;", "Ljava/io/Closeable;", "isClient", "", "sink", "Lokio/BufferedSink;", "random", "Ljava/util/Random;", "perMessageDeflate", "noContextTakeover", "minimumDeflateSize", "", "(ZLokio/BufferedSink;Ljava/util/Random;ZZJ)V", "maskCursor", "Lokio/Buffer$UnsafeCursor;", "maskKey", "", "messageBuffer", "Lokio/Buffer;", "messageDeflater", "Lokhttp3/internal/ws/MessageDeflater;", "getRandom", "()Ljava/util/Random;", "getSink", "()Lokio/BufferedSink;", "sinkBuffer", "writerClosed", "close", "", "writeClose", "code", "", "reason", "Lokio/ByteString;", "writeControlFrame", "opcode", "payload", "writeMessageFrame", "formatOpcode", "data", "writePing", "writePong", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class WebSocketWriter implements java.io.Closeable {
    private final boolean isClient;
    private final okio.Buffer.UnsafeCursor maskCursor;
    private final byte[] maskKey;
    private final okio.Buffer messageBuffer;
    private okhttp3.internal.ws.MessageDeflater messageDeflater;
    private final long minimumDeflateSize;
    private final boolean noContextTakeover;
    private final boolean perMessageDeflate;
    private final java.util.Random random;
    private final okio.BufferedSink sink;
    private final okio.Buffer sinkBuffer;
    private boolean writerClosed;

    public WebSocketWriter(boolean z, okio.BufferedSink sink, java.util.Random random, boolean z2, boolean z3, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "sink");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(random, "random");
        this.isClient = z;
        this.sink = sink;
        this.random = random;
        this.perMessageDeflate = z2;
        this.noContextTakeover = z3;
        this.minimumDeflateSize = j;
        this.messageBuffer = new okio.Buffer();
        this.sinkBuffer = sink.getBuffer();
        this.maskKey = z ? new byte[4] : null;
        this.maskCursor = z ? new okio.Buffer.UnsafeCursor() : null;
    }

    public final okio.BufferedSink getSink() {
        return this.sink;
    }

    public final java.util.Random getRandom() {
        return this.random;
    }

    public final void writePing(okio.ByteString payload) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payload, "payload");
        writeControlFrame(9, payload);
    }

    public final void writePong(okio.ByteString payload) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payload, "payload");
        writeControlFrame(10, payload);
    }

    public final void writeClose(int code, okio.ByteString reason) throws java.io.IOException {
        okio.ByteString byteString = okio.ByteString.EMPTY;
        if (code != 0 || reason != null) {
            if (code != 0) {
                okhttp3.internal.ws.WebSocketProtocol.INSTANCE.validateCloseCode(code);
            }
            okio.Buffer buffer = new okio.Buffer();
            buffer.writeShort(code);
            if (reason != null) {
                buffer.write(reason);
            }
            byteString = buffer.readByteString();
        }
        try {
            writeControlFrame(8, byteString);
        } finally {
            this.writerClosed = true;
        }
    }

    private final void writeControlFrame(int opcode, okio.ByteString payload) throws java.io.IOException {
        if (this.writerClosed) {
            throw new java.io.IOException("closed");
        }
        int size = payload.size();
        if (!(((long) size) <= 125)) {
            throw new java.lang.IllegalArgumentException("Payload size must be less than or equal to 125".toString());
        }
        this.sinkBuffer.writeByte(opcode | 128);
        if (this.isClient) {
            this.sinkBuffer.writeByte(size | 128);
            java.util.Random random = this.random;
            byte[] bArr = this.maskKey;
            kotlin.jvm.internal.Intrinsics.checkNotNull(bArr);
            random.nextBytes(bArr);
            this.sinkBuffer.write(this.maskKey);
            if (size > 0) {
                long size2 = this.sinkBuffer.size();
                this.sinkBuffer.write(payload);
                okio.Buffer buffer = this.sinkBuffer;
                okio.Buffer.UnsafeCursor unsafeCursor = this.maskCursor;
                kotlin.jvm.internal.Intrinsics.checkNotNull(unsafeCursor);
                buffer.readAndWriteUnsafe(unsafeCursor);
                this.maskCursor.seek(size2);
                okhttp3.internal.ws.WebSocketProtocol.INSTANCE.toggleMask(this.maskCursor, this.maskKey);
                this.maskCursor.close();
            }
        } else {
            this.sinkBuffer.writeByte(size);
            this.sinkBuffer.write(payload);
        }
        this.sink.flush();
    }

    public final void writeMessageFrame(int formatOpcode, okio.ByteString data) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
        if (this.writerClosed) {
            throw new java.io.IOException("closed");
        }
        this.messageBuffer.write(data);
        int i = formatOpcode | 128;
        if (this.perMessageDeflate && data.size() >= this.minimumDeflateSize) {
            okhttp3.internal.ws.MessageDeflater messageDeflater = this.messageDeflater;
            if (messageDeflater == null) {
                messageDeflater = new okhttp3.internal.ws.MessageDeflater(this.noContextTakeover);
                this.messageDeflater = messageDeflater;
            }
            messageDeflater.deflate(this.messageBuffer);
            i |= 64;
        }
        long size = this.messageBuffer.size();
        this.sinkBuffer.writeByte(i);
        int i2 = this.isClient ? 128 : 0;
        if (size <= 125) {
            this.sinkBuffer.writeByte(((int) size) | i2);
        } else if (size <= okhttp3.internal.ws.WebSocketProtocol.PAYLOAD_SHORT_MAX) {
            this.sinkBuffer.writeByte(i2 | 126);
            this.sinkBuffer.writeShort((int) size);
        } else {
            this.sinkBuffer.writeByte(i2 | 127);
            this.sinkBuffer.writeLong(size);
        }
        if (this.isClient) {
            java.util.Random random = this.random;
            byte[] bArr = this.maskKey;
            kotlin.jvm.internal.Intrinsics.checkNotNull(bArr);
            random.nextBytes(bArr);
            this.sinkBuffer.write(this.maskKey);
            if (size > 0) {
                okio.Buffer buffer = this.messageBuffer;
                okio.Buffer.UnsafeCursor unsafeCursor = this.maskCursor;
                kotlin.jvm.internal.Intrinsics.checkNotNull(unsafeCursor);
                buffer.readAndWriteUnsafe(unsafeCursor);
                this.maskCursor.seek(0L);
                okhttp3.internal.ws.WebSocketProtocol.INSTANCE.toggleMask(this.maskCursor, this.maskKey);
                this.maskCursor.close();
            }
        }
        this.sinkBuffer.write(this.messageBuffer, size);
        this.sink.emit();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.lang.Throwable {
        okhttp3.internal.ws.MessageDeflater messageDeflater = this.messageDeflater;
        if (messageDeflater != null) {
            messageDeflater.close();
        }
    }
}
