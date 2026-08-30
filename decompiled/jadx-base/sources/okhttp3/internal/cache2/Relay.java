package okhttp3.internal.cache2;

/* JADX INFO: compiled from: Relay.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u0000 :2\u00020\u0001:\u0002:;B3\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0002\u0010\u000bJ\u000e\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\u0007J\u0006\u0010\b\u001a\u00020\tJ\b\u00105\u001a\u0004\u0018\u00010\u0005J \u00106\u001a\u0002032\u0006\u00107\u001a\u00020\t2\u0006\u00104\u001a\u00020\u00072\u0006\u00108\u001a\u00020\u0007H\u0002J\u0010\u00109\u001a\u0002032\u0006\u00104\u001a\u00020\u0007H\u0002R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0015R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001d\u001a\u00020\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0011\u0010'\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0011\"\u0004\b*\u0010+R\u001c\u0010,\u001a\u0004\u0018\u00010-X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101¨\u0006<"}, d2 = {"Lokhttp3/internal/cache2/Relay;", "", com.ironsource.y8.h.b, "Ljava/io/RandomAccessFile;", "upstream", "Lokio/Source;", "upstreamPos", "", androidx.media3.extractor.text.ttml.TtmlNode.TAG_METADATA, "Lokio/ByteString;", "bufferMaxSize", "(Ljava/io/RandomAccessFile;Lokio/Source;JLokio/ByteString;J)V", "buffer", "Lokio/Buffer;", "getBuffer", "()Lokio/Buffer;", "getBufferMaxSize", "()J", "complete", "", "getComplete", "()Z", "setComplete", "(Z)V", "getFile", "()Ljava/io/RandomAccessFile;", "setFile", "(Ljava/io/RandomAccessFile;)V", "isClosed", "sourceCount", "", "getSourceCount", "()I", "setSourceCount", "(I)V", "getUpstream", "()Lokio/Source;", "setUpstream", "(Lokio/Source;)V", "upstreamBuffer", "getUpstreamBuffer", "getUpstreamPos", "setUpstreamPos", "(J)V", "upstreamReader", "Ljava/lang/Thread;", "getUpstreamReader", "()Ljava/lang/Thread;", "setUpstreamReader", "(Ljava/lang/Thread;)V", "commit", "", "upstreamSize", "newSource", "writeHeader", "prefix", "metadataSize", "writeMetadata", "Companion", "RelaySource", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Relay {
    private static final long FILE_HEADER_SIZE = 32;
    private static final int SOURCE_FILE = 2;
    private static final int SOURCE_UPSTREAM = 1;
    private final okio.Buffer buffer;
    private final long bufferMaxSize;
    private boolean complete;
    private java.io.RandomAccessFile file;
    private final okio.ByteString metadata;
    private int sourceCount;
    private okio.Source upstream;
    private final okio.Buffer upstreamBuffer;
    private long upstreamPos;
    private java.lang.Thread upstreamReader;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final okhttp3.internal.cache2.Relay.Companion INSTANCE = new okhttp3.internal.cache2.Relay.Companion(null);
    public static final okio.ByteString PREFIX_CLEAN = okio.ByteString.INSTANCE.encodeUtf8("OkHttp cache v1\n");
    public static final okio.ByteString PREFIX_DIRTY = okio.ByteString.INSTANCE.encodeUtf8("OkHttp DIRTY :(\n");

    public /* synthetic */ Relay(java.io.RandomAccessFile randomAccessFile, okio.Source source, long j, okio.ByteString byteString, long j2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(randomAccessFile, source, j, byteString, j2);
    }

    private Relay(java.io.RandomAccessFile randomAccessFile, okio.Source source, long j, okio.ByteString byteString, long j2) {
        this.file = randomAccessFile;
        this.upstream = source;
        this.upstreamPos = j;
        this.metadata = byteString;
        this.bufferMaxSize = j2;
        this.upstreamBuffer = new okio.Buffer();
        this.complete = this.upstream == null;
        this.buffer = new okio.Buffer();
    }

    public final java.io.RandomAccessFile getFile() {
        return this.file;
    }

    public final void setFile(java.io.RandomAccessFile randomAccessFile) {
        this.file = randomAccessFile;
    }

    public final okio.Source getUpstream() {
        return this.upstream;
    }

    public final void setUpstream(okio.Source source) {
        this.upstream = source;
    }

    public final long getUpstreamPos() {
        return this.upstreamPos;
    }

    public final void setUpstreamPos(long j) {
        this.upstreamPos = j;
    }

    public final long getBufferMaxSize() {
        return this.bufferMaxSize;
    }

    public final java.lang.Thread getUpstreamReader() {
        return this.upstreamReader;
    }

    public final void setUpstreamReader(java.lang.Thread thread) {
        this.upstreamReader = thread;
    }

    public final okio.Buffer getUpstreamBuffer() {
        return this.upstreamBuffer;
    }

    public final boolean getComplete() {
        return this.complete;
    }

    public final void setComplete(boolean z) {
        this.complete = z;
    }

    public final okio.Buffer getBuffer() {
        return this.buffer;
    }

    public final int getSourceCount() {
        return this.sourceCount;
    }

    public final void setSourceCount(int i) {
        this.sourceCount = i;
    }

    public final boolean isClosed() {
        return this.file == null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void writeHeader(okio.ByteString prefix, long upstreamSize, long metadataSize) throws java.io.IOException {
        okio.Buffer buffer = new okio.Buffer();
        buffer.write(prefix);
        buffer.writeLong(upstreamSize);
        buffer.writeLong(metadataSize);
        if (!(buffer.size() == 32)) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        java.io.RandomAccessFile randomAccessFile = this.file;
        kotlin.jvm.internal.Intrinsics.checkNotNull(randomAccessFile);
        java.nio.channels.FileChannel channel = randomAccessFile.getChannel();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(channel, "file!!.channel");
        new okhttp3.internal.cache2.FileOperator(channel).write(0L, buffer, 32L);
    }

    private final void writeMetadata(long upstreamSize) throws java.io.IOException {
        okio.Buffer buffer = new okio.Buffer();
        buffer.write(this.metadata);
        java.io.RandomAccessFile randomAccessFile = this.file;
        kotlin.jvm.internal.Intrinsics.checkNotNull(randomAccessFile);
        java.nio.channels.FileChannel channel = randomAccessFile.getChannel();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(channel, "file!!.channel");
        new okhttp3.internal.cache2.FileOperator(channel).write(32 + upstreamSize, buffer, this.metadata.size());
    }

    public final void commit(long upstreamSize) throws java.io.IOException {
        writeMetadata(upstreamSize);
        java.io.RandomAccessFile randomAccessFile = this.file;
        kotlin.jvm.internal.Intrinsics.checkNotNull(randomAccessFile);
        randomAccessFile.getChannel().force(false);
        writeHeader(PREFIX_CLEAN, upstreamSize, this.metadata.size());
        java.io.RandomAccessFile randomAccessFile2 = this.file;
        kotlin.jvm.internal.Intrinsics.checkNotNull(randomAccessFile2);
        randomAccessFile2.getChannel().force(false);
        synchronized (this) {
            this.complete = true;
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
        okio.Source source = this.upstream;
        if (source != null) {
            okhttp3.internal.Util.closeQuietly(source);
        }
        this.upstream = null;
    }

    /* JADX INFO: renamed from: metadata, reason: from getter */
    public final okio.ByteString getMetadata() {
        return this.metadata;
    }

    public final okio.Source newSource() {
        synchronized (this) {
            if (this.file == null) {
                return null;
            }
            this.sourceCount++;
            return new okhttp3.internal.cache2.Relay.RelaySource();
        }
    }

    /* JADX INFO: compiled from: Relay.kt */
    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lokhttp3/internal/cache2/Relay$RelaySource;", "Lokio/Source;", "(Lokhttp3/internal/cache2/Relay;)V", "fileOperator", "Lokhttp3/internal/cache2/FileOperator;", "sourcePos", "", "timeout", "Lokio/Timeout;", "close", "", "read", "sink", "Lokio/Buffer;", "byteCount", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class RelaySource implements okio.Source {
        private okhttp3.internal.cache2.FileOperator fileOperator;
        private long sourcePos;
        private final okio.Timeout timeout = new okio.Timeout();

        public RelaySource() {
            java.io.RandomAccessFile file = okhttp3.internal.cache2.Relay.this.getFile();
            kotlin.jvm.internal.Intrinsics.checkNotNull(file);
            java.nio.channels.FileChannel channel = file.getChannel();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(channel, "file!!.channel");
            this.fileOperator = new okhttp3.internal.cache2.FileOperator(channel);
        }

        @Override // okio.Source
        public long read(okio.Buffer sink, long byteCount) throws java.io.IOException {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "sink");
            char c = 1;
            if (!(this.fileOperator != null)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            okhttp3.internal.cache2.Relay relay = okhttp3.internal.cache2.Relay.this;
            synchronized (relay) {
                while (true) {
                    if (this.sourcePos != relay.getUpstreamPos()) {
                        long upstreamPos = relay.getUpstreamPos() - relay.getBuffer().size();
                        if (this.sourcePos < upstreamPos) {
                            c = 2;
                            break;
                        }
                        long jMin = java.lang.Math.min(byteCount, relay.getUpstreamPos() - this.sourcePos);
                        relay.getBuffer().copyTo(sink, this.sourcePos - upstreamPos, jMin);
                        this.sourcePos += jMin;
                        return jMin;
                    }
                    if (!relay.getComplete()) {
                        if (relay.getUpstreamReader() == null) {
                            relay.setUpstreamReader(java.lang.Thread.currentThread());
                            break;
                        }
                        this.timeout.waitUntilNotified(relay);
                    } else {
                        return -1L;
                    }
                }
                if (c == 2) {
                    long jMin2 = java.lang.Math.min(byteCount, okhttp3.internal.cache2.Relay.this.getUpstreamPos() - this.sourcePos);
                    okhttp3.internal.cache2.FileOperator fileOperator = this.fileOperator;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(fileOperator);
                    fileOperator.read(this.sourcePos + 32, sink, jMin2);
                    this.sourcePos += jMin2;
                    return jMin2;
                }
                try {
                    okio.Source upstream = okhttp3.internal.cache2.Relay.this.getUpstream();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(upstream);
                    long j = upstream.read(okhttp3.internal.cache2.Relay.this.getUpstreamBuffer(), okhttp3.internal.cache2.Relay.this.getBufferMaxSize());
                    if (j == -1) {
                        okhttp3.internal.cache2.Relay relay2 = okhttp3.internal.cache2.Relay.this;
                        relay2.commit(relay2.getUpstreamPos());
                        okhttp3.internal.cache2.Relay relay3 = okhttp3.internal.cache2.Relay.this;
                        synchronized (relay3) {
                            relay3.setUpstreamReader(null);
                            kotlin.jvm.internal.Intrinsics.checkNotNull(relay3, "null cannot be cast to non-null type java.lang.Object");
                            relay3.notifyAll();
                            kotlin.Unit unit = kotlin.Unit.INSTANCE;
                        }
                        return -1L;
                    }
                    long jMin3 = java.lang.Math.min(j, byteCount);
                    okhttp3.internal.cache2.Relay.this.getUpstreamBuffer().copyTo(sink, 0L, jMin3);
                    this.sourcePos += jMin3;
                    okhttp3.internal.cache2.FileOperator fileOperator2 = this.fileOperator;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(fileOperator2);
                    fileOperator2.write(okhttp3.internal.cache2.Relay.this.getUpstreamPos() + 32, okhttp3.internal.cache2.Relay.this.getUpstreamBuffer().clone(), j);
                    okhttp3.internal.cache2.Relay relay4 = okhttp3.internal.cache2.Relay.this;
                    synchronized (relay4) {
                        relay4.getBuffer().write(relay4.getUpstreamBuffer(), j);
                        if (relay4.getBuffer().size() > relay4.getBufferMaxSize()) {
                            relay4.getBuffer().skip(relay4.getBuffer().size() - relay4.getBufferMaxSize());
                        }
                        relay4.setUpstreamPos(relay4.getUpstreamPos() + j);
                        kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                    }
                    okhttp3.internal.cache2.Relay relay5 = okhttp3.internal.cache2.Relay.this;
                    synchronized (relay5) {
                        relay5.setUpstreamReader(null);
                        kotlin.jvm.internal.Intrinsics.checkNotNull(relay5, "null cannot be cast to non-null type java.lang.Object");
                        relay5.notifyAll();
                        kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                    }
                    return jMin3;
                } catch (java.lang.Throwable th) {
                    okhttp3.internal.cache2.Relay relay6 = okhttp3.internal.cache2.Relay.this;
                    synchronized (relay6) {
                        relay6.setUpstreamReader(null);
                        kotlin.jvm.internal.Intrinsics.checkNotNull(relay6, "null cannot be cast to non-null type java.lang.Object");
                        relay6.notifyAll();
                        kotlin.Unit unit4 = kotlin.Unit.INSTANCE;
                        throw th;
                    }
                }
            }
        }

        @Override // okio.Source
        /* JADX INFO: renamed from: timeout, reason: from getter */
        public okio.Timeout getTimeout() {
            return this.timeout;
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws java.io.IOException {
            if (this.fileOperator == null) {
                return;
            }
            java.io.RandomAccessFile randomAccessFile = null;
            this.fileOperator = null;
            okhttp3.internal.cache2.Relay relay = okhttp3.internal.cache2.Relay.this;
            synchronized (relay) {
                relay.setSourceCount(relay.getSourceCount() - 1);
                if (relay.getSourceCount() == 0) {
                    java.io.RandomAccessFile file = relay.getFile();
                    relay.setFile(null);
                    randomAccessFile = file;
                }
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
            if (randomAccessFile != null) {
                okhttp3.internal.Util.closeQuietly(randomAccessFile);
            }
        }
    }

    /* JADX INFO: compiled from: Relay.kt */
    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0004J\u000e\u0010\u0013\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lokhttp3/internal/cache2/Relay$Companion;", "", "()V", "FILE_HEADER_SIZE", "", "PREFIX_CLEAN", "Lokio/ByteString;", "PREFIX_DIRTY", "SOURCE_FILE", "", "SOURCE_UPSTREAM", "edit", "Lokhttp3/internal/cache2/Relay;", com.ironsource.y8.h.b, "Ljava/io/File;", "upstream", "Lokio/Source;", androidx.media3.extractor.text.ttml.TtmlNode.TAG_METADATA, "bufferMaxSize", "read", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final okhttp3.internal.cache2.Relay edit(java.io.File file, okio.Source upstream, okio.ByteString metadata, long bufferMaxSize) throws java.io.IOException {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "file");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(upstream, "upstream");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metadata, "metadata");
            java.io.RandomAccessFile randomAccessFile = new java.io.RandomAccessFile(file, "rw");
            okhttp3.internal.cache2.Relay relay = new okhttp3.internal.cache2.Relay(randomAccessFile, upstream, 0L, metadata, bufferMaxSize, null);
            randomAccessFile.setLength(0L);
            relay.writeHeader(okhttp3.internal.cache2.Relay.PREFIX_DIRTY, -1L, -1L);
            return relay;
        }

        public final okhttp3.internal.cache2.Relay read(java.io.File file) throws java.io.IOException {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "file");
            java.io.RandomAccessFile randomAccessFile = new java.io.RandomAccessFile(file, "rw");
            java.nio.channels.FileChannel channel = randomAccessFile.getChannel();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(channel, "randomAccessFile.channel");
            okhttp3.internal.cache2.FileOperator fileOperator = new okhttp3.internal.cache2.FileOperator(channel);
            okio.Buffer buffer = new okio.Buffer();
            fileOperator.read(0L, buffer, 32L);
            if (!kotlin.jvm.internal.Intrinsics.areEqual(buffer.readByteString(okhttp3.internal.cache2.Relay.PREFIX_CLEAN.size()), okhttp3.internal.cache2.Relay.PREFIX_CLEAN)) {
                throw new java.io.IOException("unreadable cache file");
            }
            long j = buffer.readLong();
            long j2 = buffer.readLong();
            okio.Buffer buffer2 = new okio.Buffer();
            fileOperator.read(j + 32, buffer2, j2);
            return new okhttp3.internal.cache2.Relay(randomAccessFile, null, j, buffer2.readByteString(), 0L, null);
        }
    }
}
