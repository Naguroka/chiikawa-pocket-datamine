package okio.internal;

/* JADX INFO: renamed from: okio.internal.-RealBufferedSource, reason: invalid class name */
/* JADX INFO: compiled from: RealBufferedSource.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000j\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0080\b\u001a\r\u0010\u0003\u001a\u00020\u0004*\u00020\u0002H\u0080\b\u001a%\u0010\u0005\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0080\b\u001a\u001d\u0010\u0005\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u0006H\u0080\b\u001a\u001d\u0010\r\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u0006H\u0080\b\u001a\r\u0010\u000f\u001a\u00020\u0010*\u00020\u0002H\u0080\b\u001a-\u0010\u0011\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0080\b\u001a%\u0010\u0016\u001a\u00020\u0014*\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0080\b\u001a\u001d\u0010\u0016\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u0006H\u0080\b\u001a\u0015\u0010\u001a\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u001bH\u0080\b\u001a\r\u0010\u001c\u001a\u00020\b*\u00020\u0002H\u0080\b\u001a\r\u0010\u001d\u001a\u00020\u0018*\u00020\u0002H\u0080\b\u001a\u0015\u0010\u001d\u001a\u00020\u0018*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0006H\u0080\b\u001a\r\u0010\u001e\u001a\u00020\f*\u00020\u0002H\u0080\b\u001a\u0015\u0010\u001e\u001a\u00020\f*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0006H\u0080\b\u001a\r\u0010\u001f\u001a\u00020\u0006*\u00020\u0002H\u0080\b\u001a\u0015\u0010 \u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0018H\u0080\b\u001a\u001d\u0010 \u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u0006H\u0080\b\u001a\r\u0010!\u001a\u00020\u0006*\u00020\u0002H\u0080\b\u001a\r\u0010\"\u001a\u00020\u0014*\u00020\u0002H\u0080\b\u001a\r\u0010#\u001a\u00020\u0014*\u00020\u0002H\u0080\b\u001a\r\u0010$\u001a\u00020\u0006*\u00020\u0002H\u0080\b\u001a\r\u0010%\u001a\u00020\u0006*\u00020\u0002H\u0080\b\u001a\r\u0010&\u001a\u00020'*\u00020\u0002H\u0080\b\u001a\r\u0010(\u001a\u00020'*\u00020\u0002H\u0080\b\u001a\r\u0010)\u001a\u00020**\u00020\u0002H\u0080\b\u001a\u0015\u0010)\u001a\u00020**\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0006H\u0080\b\u001a\r\u0010+\u001a\u00020\u0014*\u00020\u0002H\u0080\b\u001a\u000f\u0010,\u001a\u0004\u0018\u00010**\u00020\u0002H\u0080\b\u001a\u0015\u0010-\u001a\u00020**\u00020\u00022\u0006\u0010.\u001a\u00020\u0006H\u0080\b\u001a\u0015\u0010/\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0006H\u0080\b\u001a\u0015\u00100\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0006H\u0080\b\u001a\u0015\u00101\u001a\u00020\u0014*\u00020\u00022\u0006\u00102\u001a\u000203H\u0080\b\u001a\u0015\u00104\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0006H\u0080\b\u001a\r\u00105\u001a\u000206*\u00020\u0002H\u0080\b\u001a\r\u00107\u001a\u00020**\u00020\u0002H\u0080\b¨\u00068"}, d2 = {"commonClose", "", "Lokio/RealBufferedSource;", "commonExhausted", "", "commonIndexOf", "", "b", "", "fromIndex", "toIndex", "bytes", "Lokio/ByteString;", "commonIndexOfElement", "targetBytes", "commonPeek", "Lokio/BufferedSource;", "commonRangeEquals", androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.S_WAVE_OFFSET, "bytesOffset", "", "byteCount", "commonRead", "sink", "", "Lokio/Buffer;", "commonReadAll", "Lokio/Sink;", "commonReadByte", "commonReadByteArray", "commonReadByteString", "commonReadDecimalLong", "commonReadFully", "commonReadHexadecimalUnsignedLong", "commonReadInt", "commonReadIntLe", "commonReadLong", "commonReadLongLe", "commonReadShort", "", "commonReadShortLe", "commonReadUtf8", "", "commonReadUtf8CodePoint", "commonReadUtf8Line", "commonReadUtf8LineStrict", "limit", "commonRequest", "commonRequire", "commonSelect", "options", "Lokio/Options;", "commonSkip", "commonTimeout", "Lokio/Timeout;", "commonToString", "okio"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class RealBufferedSource {
    public static final long commonRead(okio.RealBufferedSource realBufferedSource, okio.Buffer sink, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realBufferedSource, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "sink");
        if (!(j >= 0)) {
            throw new java.lang.IllegalArgumentException(("byteCount < 0: " + j).toString());
        }
        if (!(!realBufferedSource.closed)) {
            throw new java.lang.IllegalStateException("closed".toString());
        }
        if (realBufferedSource.bufferField.size() == 0 && realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) == -1) {
            return -1L;
        }
        return realBufferedSource.bufferField.read(sink, java.lang.Math.min(j, realBufferedSource.bufferField.size()));
    }

    public static final boolean commonExhausted(okio.RealBufferedSource realBufferedSource) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realBufferedSource, "<this>");
        if (!realBufferedSource.closed) {
            return realBufferedSource.bufferField.exhausted() && realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) == -1;
        }
        throw new java.lang.IllegalStateException("closed".toString());
    }

    public static final void commonRequire(okio.RealBufferedSource realBufferedSource, long j) throws java.io.EOFException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realBufferedSource, "<this>");
        if (!realBufferedSource.request(j)) {
            throw new java.io.EOFException();
        }
    }

    public static final boolean commonRequest(okio.RealBufferedSource realBufferedSource, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realBufferedSource, "<this>");
        if (!(j >= 0)) {
            throw new java.lang.IllegalArgumentException(("byteCount < 0: " + j).toString());
        }
        if (!(!realBufferedSource.closed)) {
            throw new java.lang.IllegalStateException("closed".toString());
        }
        while (realBufferedSource.bufferField.size() < j) {
            if (realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) == -1) {
                return false;
            }
        }
        return true;
    }

    public static final byte commonReadByte(okio.RealBufferedSource realBufferedSource) throws java.io.EOFException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realBufferedSource, "<this>");
        realBufferedSource.require(1L);
        return realBufferedSource.bufferField.readByte();
    }

    public static final okio.ByteString commonReadByteString(okio.RealBufferedSource realBufferedSource, long j) throws java.io.EOFException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realBufferedSource, "<this>");
        realBufferedSource.require(j);
        return realBufferedSource.bufferField.readByteString(j);
    }

    public static final int commonSelect(okio.RealBufferedSource realBufferedSource, okio.Options options) throws java.io.EOFException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realBufferedSource, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(options, "options");
        if (!(!realBufferedSource.closed)) {
            throw new java.lang.IllegalStateException("closed".toString());
        }
        do {
            int iSelectPrefix = okio.internal.Buffer.selectPrefix(realBufferedSource.bufferField, options, true);
            if (iSelectPrefix != -2) {
                if (iSelectPrefix == -1) {
                    return -1;
                }
                realBufferedSource.bufferField.skip(options.getByteStrings()[iSelectPrefix].size());
                return iSelectPrefix;
            }
        } while (realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) != -1);
        return -1;
    }

    public static final byte[] commonReadByteArray(okio.RealBufferedSource realBufferedSource, long j) throws java.io.EOFException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realBufferedSource, "<this>");
        realBufferedSource.require(j);
        return realBufferedSource.bufferField.readByteArray(j);
    }

    public static final void commonReadFully(okio.RealBufferedSource realBufferedSource, byte[] sink) throws java.io.EOFException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realBufferedSource, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "sink");
        try {
            realBufferedSource.require(sink.length);
            realBufferedSource.bufferField.readFully(sink);
        } catch (java.io.EOFException e) {
            int i = 0;
            while (realBufferedSource.bufferField.size() > 0) {
                int i2 = realBufferedSource.bufferField.read(sink, i, (int) realBufferedSource.bufferField.size());
                if (i2 == -1) {
                    throw new java.lang.AssertionError();
                }
                i += i2;
            }
            throw e;
        }
    }

    public static final int commonRead(okio.RealBufferedSource realBufferedSource, byte[] sink, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realBufferedSource, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "sink");
        long j = i2;
        okio.SegmentedByteString.checkOffsetAndCount(sink.length, i, j);
        if (realBufferedSource.bufferField.size() == 0 && realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) == -1) {
            return -1;
        }
        return realBufferedSource.bufferField.read(sink, i, (int) java.lang.Math.min(j, realBufferedSource.bufferField.size()));
    }

    public static final void commonReadFully(okio.RealBufferedSource realBufferedSource, okio.Buffer sink, long j) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realBufferedSource, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "sink");
        try {
            realBufferedSource.require(j);
            realBufferedSource.bufferField.readFully(sink, j);
        } catch (java.io.EOFException e) {
            sink.writeAll(realBufferedSource.bufferField);
            throw e;
        }
    }

    public static final long commonReadAll(okio.RealBufferedSource realBufferedSource, okio.Sink sink) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realBufferedSource, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "sink");
        long j = 0;
        while (realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) != -1) {
            long jCompleteSegmentByteCount = realBufferedSource.bufferField.completeSegmentByteCount();
            if (jCompleteSegmentByteCount > 0) {
                j += jCompleteSegmentByteCount;
                sink.write(realBufferedSource.bufferField, jCompleteSegmentByteCount);
            }
        }
        if (realBufferedSource.bufferField.size() <= 0) {
            return j;
        }
        long size = j + realBufferedSource.bufferField.size();
        sink.write(realBufferedSource.bufferField, realBufferedSource.bufferField.size());
        return size;
    }

    public static final java.lang.String commonReadUtf8(okio.RealBufferedSource realBufferedSource, long j) throws java.io.EOFException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realBufferedSource, "<this>");
        realBufferedSource.require(j);
        return realBufferedSource.bufferField.readUtf8(j);
    }

    public static final java.lang.String commonReadUtf8Line(okio.RealBufferedSource realBufferedSource) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realBufferedSource, "<this>");
        long jIndexOf = realBufferedSource.indexOf((byte) 10);
        if (jIndexOf != -1) {
            return okio.internal.Buffer.readUtf8Line(realBufferedSource.bufferField, jIndexOf);
        }
        if (realBufferedSource.bufferField.size() != 0) {
            return realBufferedSource.readUtf8(realBufferedSource.bufferField.size());
        }
        return null;
    }

    public static final java.lang.String commonReadUtf8LineStrict(okio.RealBufferedSource realBufferedSource, long j) throws java.io.EOFException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realBufferedSource, "<this>");
        if (!(j >= 0)) {
            throw new java.lang.IllegalArgumentException(("limit < 0: " + j).toString());
        }
        long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        long jIndexOf = realBufferedSource.indexOf((byte) 10, 0L, j2);
        if (jIndexOf != -1) {
            return okio.internal.Buffer.readUtf8Line(realBufferedSource.bufferField, jIndexOf);
        }
        if (j2 < Long.MAX_VALUE && realBufferedSource.request(j2) && realBufferedSource.bufferField.getByte(j2 - 1) == 13 && realBufferedSource.request(1 + j2) && realBufferedSource.bufferField.getByte(j2) == 10) {
            return okio.internal.Buffer.readUtf8Line(realBufferedSource.bufferField, j2);
        }
        okio.Buffer buffer = new okio.Buffer();
        realBufferedSource.bufferField.copyTo(buffer, 0L, java.lang.Math.min(32, realBufferedSource.bufferField.size()));
        throw new java.io.EOFException("\\n not found: limit=" + java.lang.Math.min(realBufferedSource.bufferField.size(), j) + " content=" + buffer.readByteString().hex() + kotlin.text.Typography.ellipsis);
    }

    public static final int commonReadUtf8CodePoint(okio.RealBufferedSource realBufferedSource) throws java.io.EOFException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realBufferedSource, "<this>");
        realBufferedSource.require(1L);
        byte b = realBufferedSource.bufferField.getByte(0L);
        if ((b & 224) == 192) {
            realBufferedSource.require(2L);
        } else if ((b & 240) == 224) {
            realBufferedSource.require(3L);
        } else if ((b & 248) == 240) {
            realBufferedSource.require(4L);
        }
        return realBufferedSource.bufferField.readUtf8CodePoint();
    }

    public static final short commonReadShort(okio.RealBufferedSource realBufferedSource) throws java.io.EOFException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realBufferedSource, "<this>");
        realBufferedSource.require(2L);
        return realBufferedSource.bufferField.readShort();
    }

    public static final short commonReadShortLe(okio.RealBufferedSource realBufferedSource) throws java.io.EOFException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realBufferedSource, "<this>");
        realBufferedSource.require(2L);
        return realBufferedSource.bufferField.readShortLe();
    }

    public static final int commonReadInt(okio.RealBufferedSource realBufferedSource) throws java.io.EOFException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realBufferedSource, "<this>");
        realBufferedSource.require(4L);
        return realBufferedSource.bufferField.readInt();
    }

    public static final int commonReadIntLe(okio.RealBufferedSource realBufferedSource) throws java.io.EOFException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realBufferedSource, "<this>");
        realBufferedSource.require(4L);
        return realBufferedSource.bufferField.readIntLe();
    }

    public static final long commonReadLong(okio.RealBufferedSource realBufferedSource) throws java.io.EOFException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realBufferedSource, "<this>");
        realBufferedSource.require(8L);
        return realBufferedSource.bufferField.readLong();
    }

    public static final long commonReadLongLe(okio.RealBufferedSource realBufferedSource) throws java.io.EOFException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realBufferedSource, "<this>");
        realBufferedSource.require(8L);
        return realBufferedSource.bufferField.readLongLe();
    }

    public static final long commonReadDecimalLong(okio.RealBufferedSource realBufferedSource) throws java.io.EOFException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realBufferedSource, "<this>");
        realBufferedSource.require(1L);
        long j = 0;
        while (true) {
            long j2 = j + 1;
            if (!realBufferedSource.request(j2)) {
                break;
            }
            byte b = realBufferedSource.bufferField.getByte(j);
            if ((b < 48 || b > 57) && !(j == 0 && b == 45)) {
                if (j != 0) {
                    break;
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected a digit or '-' but was 0x");
                java.lang.String string = java.lang.Integer.toString(b, kotlin.text.CharsKt.checkRadix(kotlin.text.CharsKt.checkRadix(16)));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "toString(this, checkRadix(radix))");
                throw new java.lang.NumberFormatException(sb.append(string).toString());
            }
            j = j2;
        }
        return realBufferedSource.bufferField.readDecimalLong();
    }

    public static final long commonReadHexadecimalUnsignedLong(okio.RealBufferedSource realBufferedSource) throws java.io.EOFException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realBufferedSource, "<this>");
        realBufferedSource.require(1L);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (!realBufferedSource.request(i2)) {
                break;
            }
            byte b = realBufferedSource.bufferField.getByte(i);
            if ((b < 48 || b > 57) && ((b < 97 || b > 102) && (b < 65 || b > 70))) {
                if (i != 0) {
                    break;
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected leading [0-9a-fA-F] character but was 0x");
                java.lang.String string = java.lang.Integer.toString(b, kotlin.text.CharsKt.checkRadix(kotlin.text.CharsKt.checkRadix(16)));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "toString(this, checkRadix(radix))");
                throw new java.lang.NumberFormatException(sb.append(string).toString());
            }
            i = i2;
        }
        return realBufferedSource.bufferField.readHexadecimalUnsignedLong();
    }

    public static final void commonSkip(okio.RealBufferedSource realBufferedSource, long j) throws java.io.EOFException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realBufferedSource, "<this>");
        if (!(!realBufferedSource.closed)) {
            throw new java.lang.IllegalStateException("closed".toString());
        }
        while (j > 0) {
            if (realBufferedSource.bufferField.size() == 0 && realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) == -1) {
                throw new java.io.EOFException();
            }
            long jMin = java.lang.Math.min(j, realBufferedSource.bufferField.size());
            realBufferedSource.bufferField.skip(jMin);
            j -= jMin;
        }
    }

    public static final long commonIndexOf(okio.RealBufferedSource realBufferedSource, byte b, long j, long j2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realBufferedSource, "<this>");
        if (!(!realBufferedSource.closed)) {
            throw new java.lang.IllegalStateException("closed".toString());
        }
        if (!(0 <= j && j <= j2)) {
            throw new java.lang.IllegalArgumentException(("fromIndex=" + j + " toIndex=" + j2).toString());
        }
        while (j < j2) {
            long jIndexOf = realBufferedSource.bufferField.indexOf(b, j, j2);
            if (jIndexOf != -1) {
                return jIndexOf;
            }
            long size = realBufferedSource.bufferField.size();
            if (size >= j2 || realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) == -1) {
                break;
            }
            j = java.lang.Math.max(j, size);
        }
        return -1L;
    }

    public static final long commonIndexOf(okio.RealBufferedSource realBufferedSource, okio.ByteString bytes, long j) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realBufferedSource, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (!(!realBufferedSource.closed)) {
            throw new java.lang.IllegalStateException("closed".toString());
        }
        while (true) {
            long jIndexOf = realBufferedSource.bufferField.indexOf(bytes, j);
            if (jIndexOf != -1) {
                return jIndexOf;
            }
            long size = realBufferedSource.bufferField.size();
            if (realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) == -1) {
                return -1L;
            }
            j = java.lang.Math.max(j, (size - ((long) bytes.size())) + 1);
        }
    }

    public static final long commonIndexOfElement(okio.RealBufferedSource realBufferedSource, okio.ByteString targetBytes, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realBufferedSource, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        if (!(!realBufferedSource.closed)) {
            throw new java.lang.IllegalStateException("closed".toString());
        }
        while (true) {
            long jIndexOfElement = realBufferedSource.bufferField.indexOfElement(targetBytes, j);
            if (jIndexOfElement != -1) {
                return jIndexOfElement;
            }
            long size = realBufferedSource.bufferField.size();
            if (realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) == -1) {
                return -1L;
            }
            j = java.lang.Math.max(j, size);
        }
    }

    public static final boolean commonRangeEquals(okio.RealBufferedSource realBufferedSource, long j, okio.ByteString bytes, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realBufferedSource, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (!(!realBufferedSource.closed)) {
            throw new java.lang.IllegalStateException("closed".toString());
        }
        if (j < 0 || i < 0 || i2 < 0 || bytes.size() - i < i2) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            long j2 = ((long) i3) + j;
            if (!realBufferedSource.request(1 + j2) || realBufferedSource.bufferField.getByte(j2) != bytes.getByte(i + i3)) {
                return false;
            }
        }
        return true;
    }

    public static final okio.BufferedSource commonPeek(okio.RealBufferedSource realBufferedSource) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realBufferedSource, "<this>");
        return okio.Okio.buffer(new okio.PeekSource(realBufferedSource));
    }

    public static final void commonClose(okio.RealBufferedSource realBufferedSource) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realBufferedSource, "<this>");
        if (realBufferedSource.closed) {
            return;
        }
        realBufferedSource.closed = true;
        realBufferedSource.source.close();
        realBufferedSource.bufferField.clear();
    }

    public static final okio.Timeout commonTimeout(okio.RealBufferedSource realBufferedSource) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realBufferedSource, "<this>");
        return realBufferedSource.source.getTimeout();
    }

    public static final java.lang.String commonToString(okio.RealBufferedSource realBufferedSource) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realBufferedSource, "<this>");
        return "buffer(" + realBufferedSource.source + ')';
    }

    public static final okio.ByteString commonReadByteString(okio.RealBufferedSource realBufferedSource) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realBufferedSource, "<this>");
        realBufferedSource.bufferField.writeAll(realBufferedSource.source);
        return realBufferedSource.bufferField.readByteString();
    }

    public static final byte[] commonReadByteArray(okio.RealBufferedSource realBufferedSource) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realBufferedSource, "<this>");
        realBufferedSource.bufferField.writeAll(realBufferedSource.source);
        return realBufferedSource.bufferField.readByteArray();
    }

    public static final java.lang.String commonReadUtf8(okio.RealBufferedSource realBufferedSource) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realBufferedSource, "<this>");
        realBufferedSource.bufferField.writeAll(realBufferedSource.source);
        return realBufferedSource.bufferField.readUtf8();
    }
}
