package okio;

/* JADX INFO: compiled from: BufferedSink.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\u00020\u0002J\b\u0010\u0003\u001a\u00020\u0004H'J\b\u0010\u0007\u001a\u00020\u0000H&J\b\u0010\b\u001a\u00020\u0000H&J\b\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\fH&J\u0010\u0010\r\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000fH&J \u0010\r\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H&J\u0010\u0010\r\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0014H&J \u0010\r\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H&J\u0018\u0010\r\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0016H&J\u0010\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\u0015H&J\u0010\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0011H&J\u0010\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0016H&J\u0010\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0016H&J\u0010\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u0011H&J\u0010\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u0011H&J\u0010\u0010 \u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0016H&J\u0010\u0010!\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0016H&J\u0010\u0010\"\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u0011H&J\u0010\u0010$\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u0011H&J\u0018\u0010%\u001a\u00020\u00002\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)H&J(\u0010%\u001a\u00020\u00002\u0006\u0010&\u001a\u00020'2\u0006\u0010*\u001a\u00020\u00112\u0006\u0010+\u001a\u00020\u00112\u0006\u0010(\u001a\u00020)H&J\u0010\u0010,\u001a\u00020\u00002\u0006\u0010&\u001a\u00020'H&J \u0010,\u001a\u00020\u00002\u0006\u0010&\u001a\u00020'2\u0006\u0010*\u001a\u00020\u00112\u0006\u0010+\u001a\u00020\u0011H&J\u0010\u0010-\u001a\u00020\u00002\u0006\u0010.\u001a\u00020\u0011H&R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\u0004/ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u00060À\u0006\u0001"}, d2 = {"Lokio/BufferedSink;", "Lokio/Sink;", "Ljava/nio/channels/WritableByteChannel;", "buffer", "Lokio/Buffer;", "getBuffer", "()Lokio/Buffer;", "emit", "emitCompleteSegments", "flush", "", "outputStream", "Ljava/io/OutputStream;", "write", "source", "", androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.S_WAVE_OFFSET, "", "byteCount", "byteString", "Lokio/ByteString;", "Lokio/Source;", "", "writeAll", "writeByte", "b", "writeDecimalLong", "v", "writeHexadecimalUnsignedLong", "writeInt", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, "writeIntLe", "writeLong", "writeLongLe", "writeShort", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_SS, "writeShortLe", "writeString", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_STRING, "", com.json.zb.M, "Ljava/nio/charset/Charset;", "beginIndex", "endIndex", "writeUtf8", "writeUtf8CodePoint", "codePoint", "Lokio/RealBufferedSink;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface BufferedSink extends okio.Sink, java.nio.channels.WritableByteChannel {
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "moved to val: use getBuffer() instead", replaceWith = @kotlin.ReplaceWith(expression = "buffer", imports = {}))
    /* JADX INFO: renamed from: buffer */
    okio.Buffer getBufferField();

    okio.BufferedSink emit() throws java.io.IOException;

    okio.BufferedSink emitCompleteSegments() throws java.io.IOException;

    @Override // okio.Sink, java.io.Flushable
    void flush() throws java.io.IOException;

    okio.Buffer getBuffer();

    java.io.OutputStream outputStream();

    okio.BufferedSink write(okio.ByteString byteString) throws java.io.IOException;

    okio.BufferedSink write(okio.ByteString byteString, int offset, int byteCount) throws java.io.IOException;

    okio.BufferedSink write(okio.Source source, long byteCount) throws java.io.IOException;

    okio.BufferedSink write(byte[] source) throws java.io.IOException;

    okio.BufferedSink write(byte[] source, int offset, int byteCount) throws java.io.IOException;

    long writeAll(okio.Source source) throws java.io.IOException;

    okio.BufferedSink writeByte(int b) throws java.io.IOException;

    okio.BufferedSink writeDecimalLong(long v) throws java.io.IOException;

    okio.BufferedSink writeHexadecimalUnsignedLong(long v) throws java.io.IOException;

    okio.BufferedSink writeInt(int i) throws java.io.IOException;

    okio.BufferedSink writeIntLe(int i) throws java.io.IOException;

    okio.BufferedSink writeLong(long v) throws java.io.IOException;

    okio.BufferedSink writeLongLe(long v) throws java.io.IOException;

    okio.BufferedSink writeShort(int s) throws java.io.IOException;

    okio.BufferedSink writeShortLe(int s) throws java.io.IOException;

    okio.BufferedSink writeString(java.lang.String string, int beginIndex, int endIndex, java.nio.charset.Charset charset) throws java.io.IOException;

    okio.BufferedSink writeString(java.lang.String string, java.nio.charset.Charset charset) throws java.io.IOException;

    okio.BufferedSink writeUtf8(java.lang.String string) throws java.io.IOException;

    okio.BufferedSink writeUtf8(java.lang.String string, int beginIndex, int endIndex) throws java.io.IOException;

    okio.BufferedSink writeUtf8CodePoint(int codePoint) throws java.io.IOException;
}
