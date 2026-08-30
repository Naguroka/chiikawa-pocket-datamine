package okio;

/* JADX INFO: compiled from: RealBufferedSource.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\rH\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0012H\u0016J \u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0012H\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0012H\u0016J\u0010\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0018H\u0016J\u0018\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0012H\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\rH\u0016J\b\u0010\u001e\u001a\u00020\u0001H\u0016J\u0018\u0010\u001f\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J(\u0010\u001f\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"H\u0016J\u0010\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020&H\u0016J\u0010\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020'H\u0016J \u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020'2\u0006\u0010 \u001a\u00020\"2\u0006\u0010#\u001a\u00020\"H\u0016J\u0018\u0010$\u001a\u00020\u00122\u0006\u0010%\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u0012H\u0016J\u0010\u0010(\u001a\u00020\u00122\u0006\u0010%\u001a\u00020)H\u0016J\b\u0010*\u001a\u00020\u0014H\u0016J\b\u0010+\u001a\u00020'H\u0016J\u0010\u0010+\u001a\u00020'2\u0006\u0010#\u001a\u00020\u0012H\u0016J\b\u0010,\u001a\u00020\u0018H\u0016J\u0010\u0010,\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\u0012H\u0016J\b\u0010-\u001a\u00020\u0012H\u0016J\u0010\u0010.\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020'H\u0016J\u0018\u0010.\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u0012H\u0016J\b\u0010/\u001a\u00020\u0012H\u0016J\b\u00100\u001a\u00020\"H\u0016J\b\u00101\u001a\u00020\"H\u0016J\b\u00102\u001a\u00020\u0012H\u0016J\b\u00103\u001a\u00020\u0012H\u0016J\b\u00104\u001a\u000205H\u0016J\b\u00106\u001a\u000205H\u0016J\u0010\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:H\u0016J\u0018\u00107\u001a\u0002082\u0006\u0010#\u001a\u00020\u00122\u0006\u00109\u001a\u00020:H\u0016J\b\u0010;\u001a\u000208H\u0016J\u0010\u0010;\u001a\u0002082\u0006\u0010#\u001a\u00020\u0012H\u0016J\b\u0010<\u001a\u00020\"H\u0016J\n\u0010=\u001a\u0004\u0018\u000108H\u0016J\b\u0010>\u001a\u000208H\u0016J\u0010\u0010>\u001a\u0002082\u0006\u0010?\u001a\u00020\u0012H\u0016J\u0010\u0010@\u001a\u00020\r2\u0006\u0010#\u001a\u00020\u0012H\u0016J\u0010\u0010A\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\u0012H\u0016J\u0010\u0010B\u001a\u00020\"2\u0006\u0010C\u001a\u00020DH\u0016J\u0010\u0010E\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\u0012H\u0016J\b\u0010F\u001a\u00020GH\u0016J\b\u0010H\u001a\u000208H\u0016R\u001b\u0010\u0005\u001a\u00020\u00068Ö\u0002X\u0096\u0004¢\u0006\f\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006I"}, d2 = {"Lokio/RealBufferedSource;", "Lokio/BufferedSource;", "source", "Lokio/Source;", "(Lokio/Source;)V", "buffer", "Lokio/Buffer;", "getBuffer$annotations", "()V", "getBuffer", "()Lokio/Buffer;", "bufferField", "closed", "", "close", "", "exhausted", "indexOf", "", "b", "", "fromIndex", "toIndex", "bytes", "Lokio/ByteString;", "indexOfElement", "targetBytes", "inputStream", "Ljava/io/InputStream;", "isOpen", "peek", "rangeEquals", androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.S_WAVE_OFFSET, "bytesOffset", "", "byteCount", "read", "sink", "Ljava/nio/ByteBuffer;", "", "readAll", "Lokio/Sink;", "readByte", "readByteArray", "readByteString", "readDecimalLong", "readFully", "readHexadecimalUnsignedLong", "readInt", "readIntLe", "readLong", "readLongLe", "readShort", "", "readShortLe", "readString", "", com.json.zb.M, "Ljava/nio/charset/Charset;", "readUtf8", "readUtf8CodePoint", "readUtf8Line", "readUtf8LineStrict", "limit", "request", "require", "select", "options", "Lokio/Options;", "skip", "timeout", "Lokio/Timeout;", "toString", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class RealBufferedSource implements okio.BufferedSource {
    public final okio.Buffer bufferField;
    public boolean closed;
    public final okio.Source source;

    public static /* synthetic */ void getBuffer$annotations() {
    }

    public RealBufferedSource(okio.Source source) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        this.source = source;
        this.bufferField = new okio.Buffer();
    }

    @Override // okio.BufferedSource, okio.BufferedSink
    public okio.Buffer getBuffer() {
        return this.bufferField;
    }

    @Override // okio.BufferedSource, okio.BufferedSink
    /* JADX INFO: renamed from: buffer, reason: from getter */
    public okio.Buffer getBufferField() {
        return this.bufferField;
    }

    @Override // okio.BufferedSource
    public int read(byte[] sink) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "sink");
        return read(sink, 0, sink.length);
    }

    @Override // okio.BufferedSource
    public java.lang.String readString(long byteCount, java.nio.charset.Charset charset) throws java.io.EOFException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "charset");
        require(byteCount);
        return this.bufferField.readString(byteCount, charset);
    }

    @Override // okio.BufferedSource
    public java.lang.String readUtf8LineStrict() {
        return readUtf8LineStrict(Long.MAX_VALUE);
    }

    @Override // okio.BufferedSource
    public long indexOf(byte b) {
        return indexOf(b, 0L, Long.MAX_VALUE);
    }

    @Override // okio.BufferedSource
    public long indexOf(byte b, long fromIndex) {
        return indexOf(b, fromIndex, Long.MAX_VALUE);
    }

    @Override // okio.BufferedSource
    public long indexOf(okio.ByteString bytes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bytes, "bytes");
        return indexOf(bytes, 0L);
    }

    @Override // okio.BufferedSource
    public long indexOfElement(okio.ByteString targetBytes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        return indexOfElement(targetBytes, 0L);
    }

    @Override // okio.BufferedSource
    public boolean rangeEquals(long offset, okio.ByteString bytes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bytes, "bytes");
        return rangeEquals(offset, bytes, 0, bytes.size());
    }

    @Override // okio.BufferedSource
    public java.io.InputStream inputStream() {
        return new java.io.InputStream() { // from class: okio.RealBufferedSource.inputStream.1
            @Override // java.io.InputStream
            public int read() throws java.io.IOException {
                if (okio.RealBufferedSource.this.closed) {
                    throw new java.io.IOException("closed");
                }
                if (okio.RealBufferedSource.this.bufferField.size() == 0 && okio.RealBufferedSource.this.source.read(okio.RealBufferedSource.this.bufferField, 8192L) == -1) {
                    return -1;
                }
                return okio.RealBufferedSource.this.bufferField.readByte() & 255;
            }

            @Override // java.io.InputStream
            public int read(byte[] data, int offset, int byteCount) throws java.io.IOException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
                if (okio.RealBufferedSource.this.closed) {
                    throw new java.io.IOException("closed");
                }
                okio.SegmentedByteString.checkOffsetAndCount(data.length, offset, byteCount);
                if (okio.RealBufferedSource.this.bufferField.size() == 0 && okio.RealBufferedSource.this.source.read(okio.RealBufferedSource.this.bufferField, 8192L) == -1) {
                    return -1;
                }
                return okio.RealBufferedSource.this.bufferField.read(data, offset, byteCount);
            }

            @Override // java.io.InputStream
            public int available() throws java.io.IOException {
                if (okio.RealBufferedSource.this.closed) {
                    throw new java.io.IOException("closed");
                }
                return (int) java.lang.Math.min(okio.RealBufferedSource.this.bufferField.size(), Integer.MAX_VALUE);
            }

            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws java.io.IOException {
                okio.RealBufferedSource.this.close();
            }

            public java.lang.String toString() {
                return okio.RealBufferedSource.this + ".inputStream()";
            }
        };
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.closed;
    }

    @Override // okio.Source
    public long read(okio.Buffer sink, long byteCount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "sink");
        if (!(byteCount >= 0)) {
            throw new java.lang.IllegalArgumentException(("byteCount < 0: " + byteCount).toString());
        }
        if (!(!this.closed)) {
            throw new java.lang.IllegalStateException("closed".toString());
        }
        if (this.bufferField.size() == 0 && this.source.read(this.bufferField, 8192L) == -1) {
            return -1L;
        }
        return this.bufferField.read(sink, java.lang.Math.min(byteCount, this.bufferField.size()));
    }

    @Override // okio.BufferedSource
    public boolean exhausted() {
        if (!this.closed) {
            return this.bufferField.exhausted() && this.source.read(this.bufferField, 8192L) == -1;
        }
        throw new java.lang.IllegalStateException("closed".toString());
    }

    @Override // okio.BufferedSource
    public void require(long byteCount) throws java.io.EOFException {
        if (!request(byteCount)) {
            throw new java.io.EOFException();
        }
    }

    @Override // okio.BufferedSource
    public boolean request(long byteCount) {
        if (!(byteCount >= 0)) {
            throw new java.lang.IllegalArgumentException(("byteCount < 0: " + byteCount).toString());
        }
        if (!(!this.closed)) {
            throw new java.lang.IllegalStateException("closed".toString());
        }
        while (this.bufferField.size() < byteCount) {
            if (this.source.read(this.bufferField, 8192L) == -1) {
                return false;
            }
        }
        return true;
    }

    @Override // okio.BufferedSource
    public byte readByte() throws java.io.EOFException {
        require(1L);
        return this.bufferField.readByte();
    }

    @Override // okio.BufferedSource
    public okio.ByteString readByteString() throws java.io.IOException {
        this.bufferField.writeAll(this.source);
        return this.bufferField.readByteString();
    }

    @Override // okio.BufferedSource
    public okio.ByteString readByteString(long byteCount) throws java.io.EOFException {
        require(byteCount);
        return this.bufferField.readByteString(byteCount);
    }

    @Override // okio.BufferedSource
    public int select(okio.Options options) throws java.io.EOFException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(options, "options");
        if (!(!this.closed)) {
            throw new java.lang.IllegalStateException("closed".toString());
        }
        do {
            int iSelectPrefix = okio.internal.Buffer.selectPrefix(this.bufferField, options, true);
            if (iSelectPrefix != -2) {
                if (iSelectPrefix == -1) {
                    break;
                }
                this.bufferField.skip(options.getByteStrings()[iSelectPrefix].size());
                return iSelectPrefix;
            }
        } while (this.source.read(this.bufferField, 8192L) != -1);
        return -1;
    }

    @Override // okio.BufferedSource
    public byte[] readByteArray() throws java.io.IOException {
        this.bufferField.writeAll(this.source);
        return this.bufferField.readByteArray();
    }

    @Override // okio.BufferedSource
    public byte[] readByteArray(long byteCount) throws java.io.EOFException {
        require(byteCount);
        return this.bufferField.readByteArray(byteCount);
    }

    @Override // okio.BufferedSource
    public void readFully(byte[] sink) throws java.io.EOFException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "sink");
        try {
            require(sink.length);
            this.bufferField.readFully(sink);
        } catch (java.io.EOFException e) {
            int i = 0;
            while (this.bufferField.size() > 0) {
                okio.Buffer buffer = this.bufferField;
                int i2 = buffer.read(sink, i, (int) buffer.size());
                if (i2 == -1) {
                    throw new java.lang.AssertionError();
                }
                i += i2;
            }
            throw e;
        }
    }

    @Override // okio.BufferedSource
    public int read(byte[] sink, int offset, int byteCount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "sink");
        long j = byteCount;
        okio.SegmentedByteString.checkOffsetAndCount(sink.length, offset, j);
        if (this.bufferField.size() == 0 && this.source.read(this.bufferField, 8192L) == -1) {
            return -1;
        }
        return this.bufferField.read(sink, offset, (int) java.lang.Math.min(j, this.bufferField.size()));
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(java.nio.ByteBuffer sink) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "sink");
        if (this.bufferField.size() == 0 && this.source.read(this.bufferField, 8192L) == -1) {
            return -1;
        }
        return this.bufferField.read(sink);
    }

    @Override // okio.BufferedSource
    public void readFully(okio.Buffer sink, long byteCount) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "sink");
        try {
            require(byteCount);
            this.bufferField.readFully(sink, byteCount);
        } catch (java.io.EOFException e) {
            sink.writeAll(this.bufferField);
            throw e;
        }
    }

    @Override // okio.BufferedSource
    public long readAll(okio.Sink sink) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "sink");
        long j = 0;
        while (this.source.read(this.bufferField, 8192L) != -1) {
            long jCompleteSegmentByteCount = this.bufferField.completeSegmentByteCount();
            if (jCompleteSegmentByteCount > 0) {
                j += jCompleteSegmentByteCount;
                sink.write(this.bufferField, jCompleteSegmentByteCount);
            }
        }
        if (this.bufferField.size() <= 0) {
            return j;
        }
        long size = j + this.bufferField.size();
        okio.Buffer buffer = this.bufferField;
        sink.write(buffer, buffer.size());
        return size;
    }

    @Override // okio.BufferedSource
    public java.lang.String readUtf8() throws java.io.IOException {
        this.bufferField.writeAll(this.source);
        return this.bufferField.readUtf8();
    }

    @Override // okio.BufferedSource
    public java.lang.String readUtf8(long byteCount) throws java.io.EOFException {
        require(byteCount);
        return this.bufferField.readUtf8(byteCount);
    }

    @Override // okio.BufferedSource
    public java.lang.String readString(java.nio.charset.Charset charset) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "charset");
        this.bufferField.writeAll(this.source);
        return this.bufferField.readString(charset);
    }

    @Override // okio.BufferedSource
    public java.lang.String readUtf8Line() {
        long jIndexOf = indexOf((byte) 10);
        if (jIndexOf != -1) {
            return okio.internal.Buffer.readUtf8Line(this.bufferField, jIndexOf);
        }
        if (this.bufferField.size() != 0) {
            return readUtf8(this.bufferField.size());
        }
        return null;
    }

    @Override // okio.BufferedSource
    public java.lang.String readUtf8LineStrict(long limit) throws java.io.EOFException {
        if (!(limit >= 0)) {
            throw new java.lang.IllegalArgumentException(("limit < 0: " + limit).toString());
        }
        long j = limit == Long.MAX_VALUE ? Long.MAX_VALUE : limit + 1;
        long jIndexOf = indexOf((byte) 10, 0L, j);
        if (jIndexOf != -1) {
            return okio.internal.Buffer.readUtf8Line(this.bufferField, jIndexOf);
        }
        if (j < Long.MAX_VALUE && request(j) && this.bufferField.getByte(j - 1) == 13 && request(1 + j) && this.bufferField.getByte(j) == 10) {
            return okio.internal.Buffer.readUtf8Line(this.bufferField, j);
        }
        okio.Buffer buffer = new okio.Buffer();
        okio.Buffer buffer2 = this.bufferField;
        buffer2.copyTo(buffer, 0L, java.lang.Math.min(32, buffer2.size()));
        throw new java.io.EOFException("\\n not found: limit=" + java.lang.Math.min(this.bufferField.size(), limit) + " content=" + buffer.readByteString().hex() + kotlin.text.Typography.ellipsis);
    }

    @Override // okio.BufferedSource
    public int readUtf8CodePoint() throws java.io.EOFException {
        require(1L);
        byte b = this.bufferField.getByte(0L);
        if ((b & 224) == 192) {
            require(2L);
        } else if ((b & 240) == 224) {
            require(3L);
        } else if ((b & 248) == 240) {
            require(4L);
        }
        return this.bufferField.readUtf8CodePoint();
    }

    @Override // okio.BufferedSource
    public short readShort() throws java.io.EOFException {
        require(2L);
        return this.bufferField.readShort();
    }

    @Override // okio.BufferedSource
    public short readShortLe() throws java.io.EOFException {
        require(2L);
        return this.bufferField.readShortLe();
    }

    @Override // okio.BufferedSource
    public int readInt() throws java.io.EOFException {
        require(4L);
        return this.bufferField.readInt();
    }

    @Override // okio.BufferedSource
    public int readIntLe() throws java.io.EOFException {
        require(4L);
        return this.bufferField.readIntLe();
    }

    @Override // okio.BufferedSource
    public long readLong() throws java.io.EOFException {
        require(8L);
        return this.bufferField.readLong();
    }

    @Override // okio.BufferedSource
    public long readLongLe() throws java.io.EOFException {
        require(8L);
        return this.bufferField.readLongLe();
    }

    @Override // okio.BufferedSource
    public long readDecimalLong() throws java.io.EOFException {
        require(1L);
        long j = 0;
        while (true) {
            long j2 = j + 1;
            if (!request(j2)) {
                break;
            }
            byte b = this.bufferField.getByte(j);
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
        return this.bufferField.readDecimalLong();
    }

    @Override // okio.BufferedSource
    public long readHexadecimalUnsignedLong() throws java.io.EOFException {
        require(1L);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (!request(i2)) {
                break;
            }
            byte b = this.bufferField.getByte(i);
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
        return this.bufferField.readHexadecimalUnsignedLong();
    }

    @Override // okio.BufferedSource
    public void skip(long byteCount) throws java.io.EOFException {
        if (!(!this.closed)) {
            throw new java.lang.IllegalStateException("closed".toString());
        }
        while (byteCount > 0) {
            if (this.bufferField.size() == 0 && this.source.read(this.bufferField, 8192L) == -1) {
                throw new java.io.EOFException();
            }
            long jMin = java.lang.Math.min(byteCount, this.bufferField.size());
            this.bufferField.skip(jMin);
            byteCount -= jMin;
        }
    }

    @Override // okio.BufferedSource
    public long indexOf(byte b, long fromIndex, long toIndex) {
        if (!(!this.closed)) {
            throw new java.lang.IllegalStateException("closed".toString());
        }
        if (!(0 <= fromIndex && fromIndex <= toIndex)) {
            throw new java.lang.IllegalArgumentException(("fromIndex=" + fromIndex + " toIndex=" + toIndex).toString());
        }
        while (fromIndex < toIndex) {
            long jIndexOf = this.bufferField.indexOf(b, fromIndex, toIndex);
            if (jIndexOf != -1) {
                return jIndexOf;
            }
            long size = this.bufferField.size();
            if (size >= toIndex || this.source.read(this.bufferField, 8192L) == -1) {
                return -1L;
            }
            fromIndex = java.lang.Math.max(fromIndex, size);
        }
        return -1L;
    }

    @Override // okio.BufferedSource
    public long indexOf(okio.ByteString bytes, long fromIndex) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (!(!this.closed)) {
            throw new java.lang.IllegalStateException("closed".toString());
        }
        while (true) {
            long jIndexOf = this.bufferField.indexOf(bytes, fromIndex);
            if (jIndexOf != -1) {
                return jIndexOf;
            }
            long size = this.bufferField.size();
            if (this.source.read(this.bufferField, 8192L) == -1) {
                return -1L;
            }
            fromIndex = java.lang.Math.max(fromIndex, (size - ((long) bytes.size())) + 1);
        }
    }

    @Override // okio.BufferedSource
    public long indexOfElement(okio.ByteString targetBytes, long fromIndex) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        if (!(!this.closed)) {
            throw new java.lang.IllegalStateException("closed".toString());
        }
        while (true) {
            long jIndexOfElement = this.bufferField.indexOfElement(targetBytes, fromIndex);
            if (jIndexOfElement != -1) {
                return jIndexOfElement;
            }
            long size = this.bufferField.size();
            if (this.source.read(this.bufferField, 8192L) == -1) {
                return -1L;
            }
            fromIndex = java.lang.Math.max(fromIndex, size);
        }
    }

    @Override // okio.BufferedSource
    public boolean rangeEquals(long offset, okio.ByteString bytes, int bytesOffset, int byteCount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (!(!this.closed)) {
            throw new java.lang.IllegalStateException("closed".toString());
        }
        if (offset >= 0 && bytesOffset >= 0 && byteCount >= 0 && bytes.size() - bytesOffset >= byteCount) {
            for (int i = 0; i < byteCount; i++) {
                long j = ((long) i) + offset;
                if (request(1 + j) && this.bufferField.getByte(j) == bytes.getByte(bytesOffset + i)) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // okio.BufferedSource
    public okio.BufferedSource peek() {
        return okio.Okio.buffer(new okio.PeekSource(this));
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        if (this.closed) {
            return;
        }
        this.closed = true;
        this.source.close();
        this.bufferField.clear();
    }

    @Override // okio.Source
    /* JADX INFO: renamed from: timeout */
    public okio.Timeout getTimeout() {
        return this.source.getTimeout();
    }

    public java.lang.String toString() {
        return "buffer(" + this.source + ')';
    }
}
