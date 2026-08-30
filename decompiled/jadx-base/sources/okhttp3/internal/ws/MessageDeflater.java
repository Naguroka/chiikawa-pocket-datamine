package okhttp3.internal.ws;

/* JADX INFO: compiled from: MessageDeflater.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u000b\u001a\u00020\fH\u0016J\u000e\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0006J\u0014\u0010\u000f\u001a\u00020\u0003*\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lokhttp3/internal/ws/MessageDeflater;", "Ljava/io/Closeable;", "noContextTakeover", "", "(Z)V", "deflatedBytes", "Lokio/Buffer;", "deflater", "Ljava/util/zip/Deflater;", "deflaterSink", "Lokio/DeflaterSink;", "close", "", "deflate", "buffer", "endsWith", "suffix", "Lokio/ByteString;", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MessageDeflater implements java.io.Closeable {
    private final okio.Buffer deflatedBytes;
    private final java.util.zip.Deflater deflater;
    private final okio.DeflaterSink deflaterSink;
    private final boolean noContextTakeover;

    public MessageDeflater(boolean z) {
        this.noContextTakeover = z;
        okio.Buffer buffer = new okio.Buffer();
        this.deflatedBytes = buffer;
        java.util.zip.Deflater deflater = new java.util.zip.Deflater(-1, true);
        this.deflater = deflater;
        this.deflaterSink = new okio.DeflaterSink((okio.Sink) buffer, deflater);
    }

    public final void deflate(okio.Buffer buffer) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "buffer");
        if (!(this.deflatedBytes.size() == 0)) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        if (this.noContextTakeover) {
            this.deflater.reset();
        }
        this.deflaterSink.write(buffer, buffer.size());
        this.deflaterSink.flush();
        if (endsWith(this.deflatedBytes, okhttp3.internal.ws.MessageDeflaterKt.EMPTY_DEFLATE_BLOCK)) {
            long size = this.deflatedBytes.size() - ((long) 4);
            okio.Buffer.UnsafeCursor andWriteUnsafe$default = okio.Buffer.readAndWriteUnsafe$default(this.deflatedBytes, null, 1, null);
            try {
                andWriteUnsafe$default.resizeBuffer(size);
                kotlin.io.CloseableKt.closeFinally(andWriteUnsafe$default, null);
            } catch (java.lang.Throwable th) {
                try {
                    throw th;
                } catch (java.lang.Throwable th2) {
                    kotlin.io.CloseableKt.closeFinally(andWriteUnsafe$default, th);
                    throw th2;
                }
            }
        } else {
            this.deflatedBytes.writeByte(0);
        }
        okio.Buffer buffer2 = this.deflatedBytes;
        buffer.write(buffer2, buffer2.size());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.lang.Throwable {
        this.deflaterSink.close();
    }

    private final boolean endsWith(okio.Buffer buffer, okio.ByteString byteString) {
        return buffer.rangeEquals(buffer.size() - ((long) byteString.size()), byteString);
    }
}
