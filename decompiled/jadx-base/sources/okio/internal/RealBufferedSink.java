package okio.internal;

/* JADX INFO: renamed from: okio.internal.-RealBufferedSink, reason: invalid class name */
/* JADX INFO: compiled from: RealBufferedSink.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0080\b\u001a\r\u0010\u0003\u001a\u00020\u0004*\u00020\u0002H\u0080\b\u001a\r\u0010\u0005\u001a\u00020\u0004*\u00020\u0002H\u0080\b\u001a\r\u0010\u0006\u001a\u00020\u0001*\u00020\u0002H\u0080\b\u001a\r\u0010\u0007\u001a\u00020\b*\u00020\u0002H\u0080\b\u001a\r\u0010\t\u001a\u00020\n*\u00020\u0002H\u0080\b\u001a\u0015\u0010\u000b\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\f\u001a\u00020\rH\u0080\b\u001a%\u0010\u000b\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0080\b\u001a\u001d\u0010\u000b\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\f\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0012H\u0080\b\u001a\u0015\u0010\u000b\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0080\b\u001a%\u0010\u000b\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0080\b\u001a\u001d\u0010\u000b\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\f\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u0012H\u0080\b\u001a\u0015\u0010\u0016\u001a\u00020\u0012*\u00020\u00022\u0006\u0010\f\u001a\u00020\u0015H\u0080\b\u001a\u0015\u0010\u0017\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u000fH\u0080\b\u001a\u0015\u0010\u0019\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0012H\u0080\b\u001a\u0015\u0010\u001b\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0012H\u0080\b\u001a\u0015\u0010\u001c\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u000fH\u0080\b\u001a\u0015\u0010\u001e\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u000fH\u0080\b\u001a\u0015\u0010\u001f\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0012H\u0080\b\u001a\u0015\u0010 \u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0012H\u0080\b\u001a\u0015\u0010!\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\"\u001a\u00020\u000fH\u0080\b\u001a\u0015\u0010#\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\"\u001a\u00020\u000fH\u0080\b\u001a\u0015\u0010$\u001a\u00020\u0004*\u00020\u00022\u0006\u0010%\u001a\u00020\nH\u0080\b\u001a%\u0010$\u001a\u00020\u0004*\u00020\u00022\u0006\u0010%\u001a\u00020\n2\u0006\u0010&\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020\u000fH\u0080\b\u001a\u0015\u0010(\u001a\u00020\u0004*\u00020\u00022\u0006\u0010)\u001a\u00020\u000fH\u0080\b¨\u0006*"}, d2 = {"commonClose", "", "Lokio/RealBufferedSink;", "commonEmit", "Lokio/BufferedSink;", "commonEmitCompleteSegments", "commonFlush", "commonTimeout", "Lokio/Timeout;", "commonToString", "", "commonWrite", "source", "", androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.S_WAVE_OFFSET, "", "byteCount", "Lokio/Buffer;", "", "byteString", "Lokio/ByteString;", "Lokio/Source;", "commonWriteAll", "commonWriteByte", "b", "commonWriteDecimalLong", "v", "commonWriteHexadecimalUnsignedLong", "commonWriteInt", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, "commonWriteIntLe", "commonWriteLong", "commonWriteLongLe", "commonWriteShort", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_SS, "commonWriteShortLe", "commonWriteUtf8", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_STRING, "beginIndex", "endIndex", "commonWriteUtf8CodePoint", "codePoint", "okio"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class RealBufferedSink {
    public static final void commonWrite(okio.RealBufferedSink realBufferedSink, okio.Buffer source, long j) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realBufferedSink, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        if (!(!realBufferedSink.closed)) {
            throw new java.lang.IllegalStateException("closed".toString());
        }
        realBufferedSink.bufferField.write(source, j);
        realBufferedSink.emitCompleteSegments();
    }

    public static final okio.BufferedSink commonWrite(okio.RealBufferedSink realBufferedSink, okio.ByteString byteString) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realBufferedSink, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "byteString");
        if (!(!realBufferedSink.closed)) {
            throw new java.lang.IllegalStateException("closed".toString());
        }
        realBufferedSink.bufferField.write(byteString);
        return realBufferedSink.emitCompleteSegments();
    }

    public static final okio.BufferedSink commonWrite(okio.RealBufferedSink realBufferedSink, okio.ByteString byteString, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realBufferedSink, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "byteString");
        if (!(!realBufferedSink.closed)) {
            throw new java.lang.IllegalStateException("closed".toString());
        }
        realBufferedSink.bufferField.write(byteString, i, i2);
        return realBufferedSink.emitCompleteSegments();
    }

    public static final okio.BufferedSink commonWriteUtf8(okio.RealBufferedSink realBufferedSink, java.lang.String string) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realBufferedSink, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(string, "string");
        if (!(!realBufferedSink.closed)) {
            throw new java.lang.IllegalStateException("closed".toString());
        }
        realBufferedSink.bufferField.writeUtf8(string);
        return realBufferedSink.emitCompleteSegments();
    }

    public static final okio.BufferedSink commonWriteUtf8(okio.RealBufferedSink realBufferedSink, java.lang.String string, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realBufferedSink, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(string, "string");
        if (!(!realBufferedSink.closed)) {
            throw new java.lang.IllegalStateException("closed".toString());
        }
        realBufferedSink.bufferField.writeUtf8(string, i, i2);
        return realBufferedSink.emitCompleteSegments();
    }

    public static final okio.BufferedSink commonWriteUtf8CodePoint(okio.RealBufferedSink realBufferedSink, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realBufferedSink, "<this>");
        if (!(!realBufferedSink.closed)) {
            throw new java.lang.IllegalStateException("closed".toString());
        }
        realBufferedSink.bufferField.writeUtf8CodePoint(i);
        return realBufferedSink.emitCompleteSegments();
    }

    public static final okio.BufferedSink commonWrite(okio.RealBufferedSink realBufferedSink, byte[] source) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realBufferedSink, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        if (!(!realBufferedSink.closed)) {
            throw new java.lang.IllegalStateException("closed".toString());
        }
        realBufferedSink.bufferField.write(source);
        return realBufferedSink.emitCompleteSegments();
    }

    public static final okio.BufferedSink commonWrite(okio.RealBufferedSink realBufferedSink, byte[] source, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realBufferedSink, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        if (!(!realBufferedSink.closed)) {
            throw new java.lang.IllegalStateException("closed".toString());
        }
        realBufferedSink.bufferField.write(source, i, i2);
        return realBufferedSink.emitCompleteSegments();
    }

    public static final okio.BufferedSink commonWriteByte(okio.RealBufferedSink realBufferedSink, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realBufferedSink, "<this>");
        if (!(!realBufferedSink.closed)) {
            throw new java.lang.IllegalStateException("closed".toString());
        }
        realBufferedSink.bufferField.writeByte(i);
        return realBufferedSink.emitCompleteSegments();
    }

    public static final okio.BufferedSink commonWriteShort(okio.RealBufferedSink realBufferedSink, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realBufferedSink, "<this>");
        if (!(!realBufferedSink.closed)) {
            throw new java.lang.IllegalStateException("closed".toString());
        }
        realBufferedSink.bufferField.writeShort(i);
        return realBufferedSink.emitCompleteSegments();
    }

    public static final okio.BufferedSink commonWriteShortLe(okio.RealBufferedSink realBufferedSink, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realBufferedSink, "<this>");
        if (!(!realBufferedSink.closed)) {
            throw new java.lang.IllegalStateException("closed".toString());
        }
        realBufferedSink.bufferField.writeShortLe(i);
        return realBufferedSink.emitCompleteSegments();
    }

    public static final okio.BufferedSink commonWriteInt(okio.RealBufferedSink realBufferedSink, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realBufferedSink, "<this>");
        if (!(!realBufferedSink.closed)) {
            throw new java.lang.IllegalStateException("closed".toString());
        }
        realBufferedSink.bufferField.writeInt(i);
        return realBufferedSink.emitCompleteSegments();
    }

    public static final okio.BufferedSink commonWriteIntLe(okio.RealBufferedSink realBufferedSink, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realBufferedSink, "<this>");
        if (!(!realBufferedSink.closed)) {
            throw new java.lang.IllegalStateException("closed".toString());
        }
        realBufferedSink.bufferField.writeIntLe(i);
        return realBufferedSink.emitCompleteSegments();
    }

    public static final okio.BufferedSink commonWriteLong(okio.RealBufferedSink realBufferedSink, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realBufferedSink, "<this>");
        if (!(!realBufferedSink.closed)) {
            throw new java.lang.IllegalStateException("closed".toString());
        }
        realBufferedSink.bufferField.writeLong(j);
        return realBufferedSink.emitCompleteSegments();
    }

    public static final okio.BufferedSink commonWriteLongLe(okio.RealBufferedSink realBufferedSink, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realBufferedSink, "<this>");
        if (!(!realBufferedSink.closed)) {
            throw new java.lang.IllegalStateException("closed".toString());
        }
        realBufferedSink.bufferField.writeLongLe(j);
        return realBufferedSink.emitCompleteSegments();
    }

    public static final okio.BufferedSink commonWriteDecimalLong(okio.RealBufferedSink realBufferedSink, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realBufferedSink, "<this>");
        if (!(!realBufferedSink.closed)) {
            throw new java.lang.IllegalStateException("closed".toString());
        }
        realBufferedSink.bufferField.writeDecimalLong(j);
        return realBufferedSink.emitCompleteSegments();
    }

    public static final okio.BufferedSink commonWriteHexadecimalUnsignedLong(okio.RealBufferedSink realBufferedSink, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realBufferedSink, "<this>");
        if (!(!realBufferedSink.closed)) {
            throw new java.lang.IllegalStateException("closed".toString());
        }
        realBufferedSink.bufferField.writeHexadecimalUnsignedLong(j);
        return realBufferedSink.emitCompleteSegments();
    }

    public static final okio.BufferedSink commonEmitCompleteSegments(okio.RealBufferedSink realBufferedSink) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realBufferedSink, "<this>");
        if (!(!realBufferedSink.closed)) {
            throw new java.lang.IllegalStateException("closed".toString());
        }
        long jCompleteSegmentByteCount = realBufferedSink.bufferField.completeSegmentByteCount();
        if (jCompleteSegmentByteCount > 0) {
            realBufferedSink.sink.write(realBufferedSink.bufferField, jCompleteSegmentByteCount);
        }
        return realBufferedSink;
    }

    public static final okio.BufferedSink commonEmit(okio.RealBufferedSink realBufferedSink) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realBufferedSink, "<this>");
        if (!(!realBufferedSink.closed)) {
            throw new java.lang.IllegalStateException("closed".toString());
        }
        long size = realBufferedSink.bufferField.size();
        if (size > 0) {
            realBufferedSink.sink.write(realBufferedSink.bufferField, size);
        }
        return realBufferedSink;
    }

    public static final void commonFlush(okio.RealBufferedSink realBufferedSink) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realBufferedSink, "<this>");
        if (!(!realBufferedSink.closed)) {
            throw new java.lang.IllegalStateException("closed".toString());
        }
        if (realBufferedSink.bufferField.size() > 0) {
            realBufferedSink.sink.write(realBufferedSink.bufferField, realBufferedSink.bufferField.size());
        }
        realBufferedSink.sink.flush();
    }

    public static final void commonClose(okio.RealBufferedSink realBufferedSink) throws java.lang.Throwable {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realBufferedSink, "<this>");
        if (realBufferedSink.closed) {
            return;
        }
        if (realBufferedSink.bufferField.size() > 0) {
            realBufferedSink.sink.write(realBufferedSink.bufferField, realBufferedSink.bufferField.size());
        }
        th = null;
        try {
            realBufferedSink.sink.close();
        } catch (java.lang.Throwable th) {
            if (th == null) {
                th = th;
            }
        }
        realBufferedSink.closed = true;
        if (th != null) {
            throw th;
        }
    }

    public static final okio.Timeout commonTimeout(okio.RealBufferedSink realBufferedSink) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realBufferedSink, "<this>");
        return realBufferedSink.sink.getTimeout();
    }

    public static final java.lang.String commonToString(okio.RealBufferedSink realBufferedSink) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realBufferedSink, "<this>");
        return "buffer(" + realBufferedSink.sink + ')';
    }

    public static final long commonWriteAll(okio.RealBufferedSink realBufferedSink, okio.Source source) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realBufferedSink, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        long j = 0;
        while (true) {
            long j2 = source.read(realBufferedSink.bufferField, 8192L);
            if (j2 == -1) {
                return j;
            }
            j += j2;
            realBufferedSink.emitCompleteSegments();
        }
    }

    public static final okio.BufferedSink commonWrite(okio.RealBufferedSink realBufferedSink, okio.Source source, long j) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realBufferedSink, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        while (j > 0) {
            long j2 = source.read(realBufferedSink.bufferField, j);
            if (j2 == -1) {
                throw new java.io.EOFException();
            }
            j -= j2;
            realBufferedSink.emitCompleteSegments();
        }
        return realBufferedSink;
    }
}
