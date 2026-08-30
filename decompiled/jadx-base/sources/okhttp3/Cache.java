package okhttp3;

/* JADX INFO: compiled from: Cache.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010)\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 C2\u00020\u00012\u00020\u0002:\u0004BCDEB\u0017\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u001f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0016\u0010\u001f\u001a\u00020 2\f\u0010!\u001a\b\u0018\u00010\"R\u00020\fH\u0002J\b\u0010#\u001a\u00020 H\u0016J\u0006\u0010$\u001a\u00020 J\r\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0002\b%J\u0006\u0010&\u001a\u00020 J\b\u0010'\u001a\u00020 H\u0016J\u0017\u0010(\u001a\u0004\u0018\u00010)2\u0006\u0010*\u001a\u00020+H\u0000¢\u0006\u0002\b,J\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010-\u001a\u00020 J\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u0015\u001a\u00020\u0011J\u0017\u0010.\u001a\u0004\u0018\u00010/2\u0006\u00100\u001a\u00020)H\u0000¢\u0006\u0002\b1J\u0015\u00102\u001a\u00020 2\u0006\u0010*\u001a\u00020+H\u0000¢\u0006\u0002\b3J\u0006\u0010\u0016\u001a\u00020\u0011J\u0006\u00104\u001a\u00020\u0006J\r\u00105\u001a\u00020 H\u0000¢\u0006\u0002\b6J\u0015\u00107\u001a\u00020 2\u0006\u00108\u001a\u000209H\u0000¢\u0006\u0002\b:J\u001d\u0010;\u001a\u00020 2\u0006\u0010<\u001a\u00020)2\u0006\u0010=\u001a\u00020)H\u0000¢\u0006\u0002\b>J\f\u0010?\u001a\b\u0012\u0004\u0012\u00020A0@J\u0006\u0010\u0017\u001a\u00020\u0011J\u0006\u0010\u001c\u001a\u00020\u0011R\u0014\u0010\u000b\u001a\u00020\fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0003\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0012\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u00020\u0011X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u0011X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001b¨\u0006F"}, d2 = {"Lokhttp3/Cache;", "Ljava/io/Closeable;", "Ljava/io/Flushable;", "directory", "Ljava/io/File;", "maxSize", "", "(Ljava/io/File;J)V", "fileSystem", "Lokhttp3/internal/io/FileSystem;", "(Ljava/io/File;JLokhttp3/internal/io/FileSystem;)V", "cache", "Lokhttp3/internal/cache/DiskLruCache;", "getCache$okhttp", "()Lokhttp3/internal/cache/DiskLruCache;", "()Ljava/io/File;", "hitCount", "", "isClosed", "", "()Z", "networkCount", "requestCount", "writeAbortCount", "getWriteAbortCount$okhttp", "()I", "setWriteAbortCount$okhttp", "(I)V", "writeSuccessCount", "getWriteSuccessCount$okhttp", "setWriteSuccessCount$okhttp", "abortQuietly", "", "editor", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "close", "delete", "-deprecated_directory", "evictAll", "flush", "get", "Lokhttp3/Response;", "request", "Lokhttp3/Request;", "get$okhttp", com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase.initializeMethodName, "put", "Lokhttp3/internal/cache/CacheRequest;", com.json.hs.n, "put$okhttp", "remove", "remove$okhttp", "size", "trackConditionalCacheHit", "trackConditionalCacheHit$okhttp", "trackResponse", "cacheStrategy", "Lokhttp3/internal/cache/CacheStrategy;", "trackResponse$okhttp", "update", "cached", "network", "update$okhttp", "urls", "", "", "CacheResponseBody", "Companion", "Entry", "RealCacheRequest", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Cache implements java.io.Closeable, java.io.Flushable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final okhttp3.Cache.Companion INSTANCE = new okhttp3.Cache.Companion(null);
    private static final int ENTRY_BODY = 1;
    private static final int ENTRY_COUNT = 2;
    private static final int ENTRY_METADATA = 0;
    private static final int VERSION = 201105;
    private final okhttp3.internal.cache.DiskLruCache cache;
    private int hitCount;
    private int networkCount;
    private int requestCount;
    private int writeAbortCount;
    private int writeSuccessCount;

    @kotlin.jvm.JvmStatic
    public static final java.lang.String key(okhttp3.HttpUrl httpUrl) {
        return INSTANCE.key(httpUrl);
    }

    public Cache(java.io.File directory, long j, okhttp3.internal.io.FileSystem fileSystem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(directory, "directory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        this.cache = new okhttp3.internal.cache.DiskLruCache(fileSystem, directory, VERSION, 2, j, okhttp3.internal.concurrent.TaskRunner.INSTANCE);
    }

    /* JADX INFO: renamed from: getCache$okhttp, reason: from getter */
    public final okhttp3.internal.cache.DiskLruCache getCache() {
        return this.cache;
    }

    /* JADX INFO: renamed from: getWriteSuccessCount$okhttp, reason: from getter */
    public final int getWriteSuccessCount() {
        return this.writeSuccessCount;
    }

    public final void setWriteSuccessCount$okhttp(int i) {
        this.writeSuccessCount = i;
    }

    /* JADX INFO: renamed from: getWriteAbortCount$okhttp, reason: from getter */
    public final int getWriteAbortCount() {
        return this.writeAbortCount;
    }

    public final void setWriteAbortCount$okhttp(int i) {
        this.writeAbortCount = i;
    }

    public final boolean isClosed() {
        return this.cache.isClosed();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Cache(java.io.File directory, long j) {
        this(directory, j, okhttp3.internal.io.FileSystem.SYSTEM);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(directory, "directory");
    }

    public final okhttp3.Response get$okhttp(okhttp3.Request request) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "request");
        try {
            okhttp3.internal.cache.DiskLruCache.Snapshot snapshot = this.cache.get(INSTANCE.key(request.url()));
            if (snapshot == null) {
                return null;
            }
            try {
                okhttp3.Cache.Entry entry = new okhttp3.Cache.Entry(snapshot.getSource(0));
                okhttp3.Response response = entry.response(snapshot);
                if (entry.matches(request, response)) {
                    return response;
                }
                okhttp3.ResponseBody responseBodyBody = response.body();
                if (responseBodyBody != null) {
                    okhttp3.internal.Util.closeQuietly(responseBodyBody);
                }
                return null;
            } catch (java.io.IOException unused) {
                okhttp3.internal.Util.closeQuietly(snapshot);
                return null;
            }
        } catch (java.io.IOException unused2) {
        }
    }

    public final okhttp3.internal.cache.CacheRequest put$okhttp(okhttp3.Response response) {
        okhttp3.internal.cache.DiskLruCache.Editor editorEdit$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "response");
        java.lang.String strMethod = response.request().method();
        if (okhttp3.internal.http.HttpMethod.INSTANCE.invalidatesCache(response.request().method())) {
            try {
                remove$okhttp(response.request());
            } catch (java.io.IOException unused) {
            }
            return null;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(strMethod, "GET")) {
            return null;
        }
        okhttp3.Cache.Companion companion = INSTANCE;
        if (companion.hasVaryAll(response)) {
            return null;
        }
        okhttp3.Cache.Entry entry = new okhttp3.Cache.Entry(response);
        try {
            editorEdit$default = okhttp3.internal.cache.DiskLruCache.edit$default(this.cache, companion.key(response.request().url()), 0L, 2, null);
            if (editorEdit$default == null) {
                return null;
            }
            try {
                entry.writeTo(editorEdit$default);
                return new okhttp3.Cache.RealCacheRequest(this, editorEdit$default);
            } catch (java.io.IOException unused2) {
                abortQuietly(editorEdit$default);
                return null;
            }
        } catch (java.io.IOException unused3) {
            editorEdit$default = null;
        }
    }

    public final void remove$okhttp(okhttp3.Request request) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "request");
        this.cache.remove(INSTANCE.key(request.url()));
    }

    public final void update$okhttp(okhttp3.Response cached, okhttp3.Response network) {
        okhttp3.internal.cache.DiskLruCache.Editor editorEdit;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cached, "cached");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(network, "network");
        okhttp3.Cache.Entry entry = new okhttp3.Cache.Entry(network);
        okhttp3.ResponseBody responseBodyBody = cached.body();
        kotlin.jvm.internal.Intrinsics.checkNotNull(responseBodyBody, "null cannot be cast to non-null type okhttp3.Cache.CacheResponseBody");
        try {
            editorEdit = ((okhttp3.Cache.CacheResponseBody) responseBodyBody).getSnapshot().edit();
            if (editorEdit == null) {
                return;
            }
            try {
                entry.writeTo(editorEdit);
                editorEdit.commit();
            } catch (java.io.IOException unused) {
                abortQuietly(editorEdit);
            }
        } catch (java.io.IOException unused2) {
            editorEdit = null;
        }
    }

    private final void abortQuietly(okhttp3.internal.cache.DiskLruCache.Editor editor) {
        if (editor != null) {
            try {
                editor.abort();
            } catch (java.io.IOException unused) {
            }
        }
    }

    public final void initialize() throws java.io.IOException {
        this.cache.initialize();
    }

    public final void delete() throws java.io.IOException {
        this.cache.delete();
    }

    public final void evictAll() throws java.io.IOException {
        this.cache.evictAll();
    }

    /* JADX INFO: renamed from: okhttp3.Cache$urls$1, reason: invalid class name */
    /* JADX INFO: compiled from: Cache.kt */
    @kotlin.Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0010)\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\t\u0010\t\u001a\u00020\u0004H\u0096\u0002J\t\u0010\n\u001a\u00020\u0002H\u0096\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0005\u001a\f\u0012\b\u0012\u00060\u0006R\u00020\u00070\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0002X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"okhttp3/Cache$urls$1", "", "", "canRemove", "", "delegate", "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "Lokhttp3/internal/cache/DiskLruCache;", "nextUrl", "hasNext", "next", "remove", "", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass1 implements java.util.Iterator<java.lang.String>, kotlin.jvm.internal.markers.KMutableIterator {
        private boolean canRemove;
        private final java.util.Iterator<okhttp3.internal.cache.DiskLruCache.Snapshot> delegate;
        private java.lang.String nextUrl;

        AnonymousClass1(okhttp3.Cache cache) {
            this.delegate = cache.getCache().snapshots();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.nextUrl != null) {
                return true;
            }
            this.canRemove = false;
            while (this.delegate.hasNext()) {
                try {
                    okhttp3.internal.cache.DiskLruCache.Snapshot next = this.delegate.next();
                    try {
                        continue;
                        this.nextUrl = okio.Okio.buffer(next.getSource(0)).readUtf8LineStrict();
                        kotlin.io.CloseableKt.closeFinally(next, null);
                        return true;
                    } catch (java.lang.Throwable th) {
                        try {
                            continue;
                            throw th;
                        } catch (java.lang.Throwable th2) {
                            kotlin.io.CloseableKt.closeFinally(next, th);
                            throw th2;
                        }
                    }
                } catch (java.io.IOException unused) {
                }
            }
            return false;
        }

        @Override // java.util.Iterator
        public java.lang.String next() {
            if (!hasNext()) {
                throw new java.util.NoSuchElementException();
            }
            java.lang.String str = this.nextUrl;
            kotlin.jvm.internal.Intrinsics.checkNotNull(str);
            this.nextUrl = null;
            this.canRemove = true;
            return str;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.canRemove) {
                throw new java.lang.IllegalStateException("remove() before next()".toString());
            }
            this.delegate.remove();
        }
    }

    public final java.util.Iterator<java.lang.String> urls() throws java.io.IOException {
        return new okhttp3.Cache.AnonymousClass1(this);
    }

    public final synchronized int writeAbortCount() {
        return this.writeAbortCount;
    }

    public final synchronized int writeSuccessCount() {
        return this.writeSuccessCount;
    }

    public final long size() throws java.io.IOException {
        return this.cache.size();
    }

    public final long maxSize() {
        return this.cache.getMaxSize();
    }

    @Override // java.io.Flushable
    public void flush() throws java.io.IOException {
        this.cache.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        this.cache.close();
    }

    public final java.io.File directory() {
        return this.cache.getDirectory();
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "directory", imports = {}))
    /* JADX INFO: renamed from: -deprecated_directory, reason: not valid java name */
    public final java.io.File m2885deprecated_directory() {
        return this.cache.getDirectory();
    }

    public final synchronized void trackResponse$okhttp(okhttp3.internal.cache.CacheStrategy cacheStrategy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cacheStrategy, "cacheStrategy");
        this.requestCount++;
        if (cacheStrategy.getNetworkRequest() != null) {
            this.networkCount++;
        } else if (cacheStrategy.getCacheResponse() != null) {
            this.hitCount++;
        }
    }

    public final synchronized void trackConditionalCacheHit$okhttp() {
        this.hitCount++;
    }

    public final synchronized int networkCount() {
        return this.networkCount;
    }

    public final synchronized int hitCount() {
        return this.hitCount;
    }

    public final synchronized int requestCount() {
        return this.requestCount;
    }

    /* JADX INFO: compiled from: Cache.kt */
    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u00060\u0003R\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0006\u001a\u00020\u0007H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0012\u0010\u0002\u001a\u00060\u0003R\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lokhttp3/Cache$RealCacheRequest;", "Lokhttp3/internal/cache/CacheRequest;", "editor", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "Lokhttp3/internal/cache/DiskLruCache;", "(Lokhttp3/Cache;Lokhttp3/internal/cache/DiskLruCache$Editor;)V", "body", "Lokio/Sink;", "cacheOut", "done", "", "getDone", "()Z", "setDone", "(Z)V", "abort", "", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class RealCacheRequest implements okhttp3.internal.cache.CacheRequest {
        private final okio.Sink body;
        private final okio.Sink cacheOut;
        private boolean done;
        private final okhttp3.internal.cache.DiskLruCache.Editor editor;
        final /* synthetic */ okhttp3.Cache this$0;

        public RealCacheRequest(final okhttp3.Cache cache, okhttp3.internal.cache.DiskLruCache.Editor editor) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(editor, "editor");
            this.this$0 = cache;
            this.editor = editor;
            okio.Sink sinkNewSink = editor.newSink(1);
            this.cacheOut = sinkNewSink;
            this.body = new okio.ForwardingSink(sinkNewSink) { // from class: okhttp3.Cache.RealCacheRequest.1
                @Override // okio.ForwardingSink, okio.Sink, java.io.Closeable, java.lang.AutoCloseable
                public void close() throws java.io.IOException {
                    okhttp3.Cache cache2 = cache;
                    okhttp3.Cache.RealCacheRequest realCacheRequest = this;
                    synchronized (cache2) {
                        if (realCacheRequest.getDone()) {
                            return;
                        }
                        realCacheRequest.setDone(true);
                        cache2.setWriteSuccessCount$okhttp(cache2.getWriteSuccessCount() + 1);
                        super.close();
                        this.editor.commit();
                    }
                }
            };
        }

        public final boolean getDone() {
            return this.done;
        }

        public final void setDone(boolean z) {
            this.done = z;
        }

        @Override // okhttp3.internal.cache.CacheRequest
        public void abort() {
            okhttp3.Cache cache = this.this$0;
            synchronized (cache) {
                if (this.done) {
                    return;
                }
                this.done = true;
                cache.setWriteAbortCount$okhttp(cache.getWriteAbortCount() + 1);
                okhttp3.internal.Util.closeQuietly(this.cacheOut);
                try {
                    this.editor.abort();
                } catch (java.io.IOException unused) {
                }
            }
        }

        @Override // okhttp3.internal.cache.CacheRequest
        /* JADX INFO: renamed from: body, reason: from getter */
        public okio.Sink getBody() {
            return this.body;
        }
    }

    /* JADX INFO: compiled from: Cache.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000 /2\u00020\u0001:\u0001/B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u000f\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0016\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 2\u0006\u0010\"\u001a\u00020#H\u0002J\u0012\u0010\u0005\u001a\u00020\u00062\n\u0010$\u001a\u00060%R\u00020&J\u001e\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020!0 H\u0002J\u0012\u0010,\u001a\u00020(2\n\u0010-\u001a\u00060.R\u00020&R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Lokhttp3/Cache$Entry;", "", "rawSource", "Lokio/Source;", "(Lokio/Source;)V", com.json.hs.n, "Lokhttp3/Response;", "(Lokhttp3/Response;)V", "code", "", "handshake", "Lokhttp3/Handshake;", "isHttps", "", "()Z", com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE, "", "protocol", "Lokhttp3/Protocol;", "receivedResponseMillis", "", "requestMethod", "responseHeaders", "Lokhttp3/Headers;", "sentRequestMillis", "url", "Lokhttp3/HttpUrl;", "varyHeaders", "matches", "request", "Lokhttp3/Request;", "readCertificateList", "", "Ljava/security/cert/Certificate;", "source", "Lokio/BufferedSource;", "snapshot", "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "Lokhttp3/internal/cache/DiskLruCache;", "writeCertList", "", "sink", "Lokio/BufferedSink;", "certificates", "writeTo", "editor", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "Companion", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class Entry {
        private final int code;
        private final okhttp3.Handshake handshake;
        private final java.lang.String message;
        private final okhttp3.Protocol protocol;
        private final long receivedResponseMillis;
        private final java.lang.String requestMethod;
        private final okhttp3.Headers responseHeaders;
        private final long sentRequestMillis;
        private final okhttp3.HttpUrl url;
        private final okhttp3.Headers varyHeaders;
        private static final java.lang.String SENT_MILLIS = okhttp3.internal.platform.Platform.INSTANCE.get().getPrefix() + "-Sent-Millis";
        private static final java.lang.String RECEIVED_MILLIS = okhttp3.internal.platform.Platform.INSTANCE.get().getPrefix() + "-Received-Millis";

        private final boolean isHttps() {
            return kotlin.jvm.internal.Intrinsics.areEqual(this.url.scheme(), "https");
        }

        public Entry(okio.Source rawSource) throws java.io.IOException {
            okhttp3.TlsVersion tlsVersionForJavaName;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawSource, "rawSource");
            okio.Source source = rawSource;
            try {
                okio.BufferedSource bufferedSourceBuffer = okio.Okio.buffer(rawSource);
                java.lang.String utf8LineStrict = bufferedSourceBuffer.readUtf8LineStrict();
                okhttp3.HttpUrl httpUrl = okhttp3.HttpUrl.INSTANCE.parse(utf8LineStrict);
                if (httpUrl == null) {
                    java.io.IOException iOException = new java.io.IOException("Cache corruption for " + utf8LineStrict);
                    okhttp3.internal.platform.Platform.INSTANCE.get().log("cache corruption", 5, iOException);
                    throw iOException;
                }
                this.url = httpUrl;
                this.requestMethod = bufferedSourceBuffer.readUtf8LineStrict();
                okhttp3.Headers.Builder builder = new okhttp3.Headers.Builder();
                int int$okhttp = okhttp3.Cache.INSTANCE.readInt$okhttp(bufferedSourceBuffer);
                for (int i = 0; i < int$okhttp; i++) {
                    builder.addLenient$okhttp(bufferedSourceBuffer.readUtf8LineStrict());
                }
                this.varyHeaders = builder.build();
                okhttp3.internal.http.StatusLine statusLine = okhttp3.internal.http.StatusLine.INSTANCE.parse(bufferedSourceBuffer.readUtf8LineStrict());
                this.protocol = statusLine.protocol;
                this.code = statusLine.code;
                this.message = statusLine.message;
                okhttp3.Headers.Builder builder2 = new okhttp3.Headers.Builder();
                int int$okhttp2 = okhttp3.Cache.INSTANCE.readInt$okhttp(bufferedSourceBuffer);
                for (int i2 = 0; i2 < int$okhttp2; i2++) {
                    builder2.addLenient$okhttp(bufferedSourceBuffer.readUtf8LineStrict());
                }
                java.lang.String str = SENT_MILLIS;
                java.lang.String str2 = builder2.get(str);
                java.lang.String str3 = RECEIVED_MILLIS;
                java.lang.String str4 = builder2.get(str3);
                builder2.removeAll(str);
                builder2.removeAll(str3);
                this.sentRequestMillis = str2 != null ? java.lang.Long.parseLong(str2) : 0L;
                this.receivedResponseMillis = str4 != null ? java.lang.Long.parseLong(str4) : 0L;
                this.responseHeaders = builder2.build();
                if (isHttps()) {
                    java.lang.String utf8LineStrict2 = bufferedSourceBuffer.readUtf8LineStrict();
                    if (utf8LineStrict2.length() > 0) {
                        throw new java.io.IOException("expected \"\" but was \"" + utf8LineStrict2 + kotlin.text.Typography.quote);
                    }
                    okhttp3.CipherSuite cipherSuiteForJavaName = okhttp3.CipherSuite.INSTANCE.forJavaName(bufferedSourceBuffer.readUtf8LineStrict());
                    java.util.List<java.security.cert.Certificate> certificateList = readCertificateList(bufferedSourceBuffer);
                    java.util.List<java.security.cert.Certificate> certificateList2 = readCertificateList(bufferedSourceBuffer);
                    if (!bufferedSourceBuffer.exhausted()) {
                        tlsVersionForJavaName = okhttp3.TlsVersion.INSTANCE.forJavaName(bufferedSourceBuffer.readUtf8LineStrict());
                    } else {
                        tlsVersionForJavaName = okhttp3.TlsVersion.SSL_3_0;
                    }
                    this.handshake = okhttp3.Handshake.INSTANCE.get(tlsVersionForJavaName, cipherSuiteForJavaName, certificateList, certificateList2);
                } else {
                    this.handshake = null;
                }
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                kotlin.io.CloseableKt.closeFinally(source, null);
            } catch (java.lang.Throwable th) {
                try {
                    throw th;
                } catch (java.lang.Throwable th2) {
                    kotlin.io.CloseableKt.closeFinally(source, th);
                    throw th2;
                }
            }
        }

        public Entry(okhttp3.Response response) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "response");
            this.url = response.request().url();
            this.varyHeaders = okhttp3.Cache.INSTANCE.varyHeaders(response);
            this.requestMethod = response.request().method();
            this.protocol = response.protocol();
            this.code = response.code();
            this.message = response.message();
            this.responseHeaders = response.headers();
            this.handshake = response.handshake();
            this.sentRequestMillis = response.sentRequestAtMillis();
            this.receivedResponseMillis = response.receivedResponseAtMillis();
        }

        public final void writeTo(okhttp3.internal.cache.DiskLruCache.Editor editor) throws java.io.IOException {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(editor, "editor");
            okio.BufferedSink bufferedSinkBuffer = okio.Okio.buffer(editor.newSink(0));
            try {
                okio.BufferedSink bufferedSink = bufferedSinkBuffer;
                bufferedSink.writeUtf8(this.url.getUrl()).writeByte(10);
                bufferedSink.writeUtf8(this.requestMethod).writeByte(10);
                bufferedSink.writeDecimalLong(this.varyHeaders.size()).writeByte(10);
                int size = this.varyHeaders.size();
                for (int i = 0; i < size; i++) {
                    bufferedSink.writeUtf8(this.varyHeaders.name(i)).writeUtf8(": ").writeUtf8(this.varyHeaders.value(i)).writeByte(10);
                }
                bufferedSink.writeUtf8(new okhttp3.internal.http.StatusLine(this.protocol, this.code, this.message).toString()).writeByte(10);
                bufferedSink.writeDecimalLong(this.responseHeaders.size() + 2).writeByte(10);
                int size2 = this.responseHeaders.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    bufferedSink.writeUtf8(this.responseHeaders.name(i2)).writeUtf8(": ").writeUtf8(this.responseHeaders.value(i2)).writeByte(10);
                }
                bufferedSink.writeUtf8(SENT_MILLIS).writeUtf8(": ").writeDecimalLong(this.sentRequestMillis).writeByte(10);
                bufferedSink.writeUtf8(RECEIVED_MILLIS).writeUtf8(": ").writeDecimalLong(this.receivedResponseMillis).writeByte(10);
                if (isHttps()) {
                    bufferedSink.writeByte(10);
                    okhttp3.Handshake handshake = this.handshake;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(handshake);
                    bufferedSink.writeUtf8(handshake.cipherSuite().javaName()).writeByte(10);
                    writeCertList(bufferedSink, this.handshake.peerCertificates());
                    writeCertList(bufferedSink, this.handshake.localCertificates());
                    bufferedSink.writeUtf8(this.handshake.tlsVersion().javaName()).writeByte(10);
                }
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                kotlin.io.CloseableKt.closeFinally(bufferedSinkBuffer, null);
            } catch (java.lang.Throwable th) {
                try {
                    throw th;
                } catch (java.lang.Throwable th2) {
                    kotlin.io.CloseableKt.closeFinally(bufferedSinkBuffer, th);
                    throw th2;
                }
            }
        }

        private final java.util.List<java.security.cert.Certificate> readCertificateList(okio.BufferedSource source) throws java.io.IOException {
            int int$okhttp = okhttp3.Cache.INSTANCE.readInt$okhttp(source);
            if (int$okhttp == -1) {
                return kotlin.collections.CollectionsKt.emptyList();
            }
            try {
                java.security.cert.CertificateFactory certificateFactory = java.security.cert.CertificateFactory.getInstance(com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource.CERTIFICATE_TYPE_X509);
                java.util.ArrayList arrayList = new java.util.ArrayList(int$okhttp);
                for (int i = 0; i < int$okhttp; i++) {
                    java.lang.String utf8LineStrict = source.readUtf8LineStrict();
                    okio.Buffer buffer = new okio.Buffer();
                    okio.ByteString byteStringDecodeBase64 = okio.ByteString.INSTANCE.decodeBase64(utf8LineStrict);
                    if (byteStringDecodeBase64 == null) {
                        throw new java.io.IOException("Corrupt certificate in cache entry");
                    }
                    buffer.write(byteStringDecodeBase64);
                    arrayList.add(certificateFactory.generateCertificate(buffer.inputStream()));
                }
                return arrayList;
            } catch (java.security.cert.CertificateException e) {
                throw new java.io.IOException(e.getMessage());
            }
        }

        private final void writeCertList(okio.BufferedSink sink, java.util.List<? extends java.security.cert.Certificate> certificates) throws java.io.IOException {
            try {
                sink.writeDecimalLong(certificates.size()).writeByte(10);
                java.util.Iterator<? extends java.security.cert.Certificate> it = certificates.iterator();
                while (it.hasNext()) {
                    byte[] bytes = it.next().getEncoded();
                    okio.ByteString.Companion companion = okio.ByteString.INSTANCE;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "bytes");
                    sink.writeUtf8(okio.ByteString.Companion.of$default(companion, bytes, 0, 0, 3, null).base64()).writeByte(10);
                }
            } catch (java.security.cert.CertificateEncodingException e) {
                throw new java.io.IOException(e.getMessage());
            }
        }

        public final boolean matches(okhttp3.Request request, okhttp3.Response response) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "request");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "response");
            return kotlin.jvm.internal.Intrinsics.areEqual(this.url, request.url()) && kotlin.jvm.internal.Intrinsics.areEqual(this.requestMethod, request.method()) && okhttp3.Cache.INSTANCE.varyMatches(response, this.varyHeaders, request);
        }

        public final okhttp3.Response response(okhttp3.internal.cache.DiskLruCache.Snapshot snapshot) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(snapshot, "snapshot");
            java.lang.String str = this.responseHeaders.get("Content-Type");
            java.lang.String str2 = this.responseHeaders.get(com.google.common.net.HttpHeaders.CONTENT_LENGTH);
            return new okhttp3.Response.Builder().request(new okhttp3.Request.Builder().url(this.url).method(this.requestMethod, null).headers(this.varyHeaders).build()).protocol(this.protocol).code(this.code).message(this.message).headers(this.responseHeaders).body(new okhttp3.Cache.CacheResponseBody(snapshot, str, str2)).handshake(this.handshake).sentRequestAtMillis(this.sentRequestMillis).receivedResponseAtMillis(this.receivedResponseMillis).build();
        }
    }

    /* JADX INFO: compiled from: Cache.kt */
    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B%\u0012\n\u0010\u0002\u001a\u00060\u0003R\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\bJ\b\u0010\u0007\u001a\u00020\rH\u0016J\n\u0010\u0005\u001a\u0004\u0018\u00010\u000eH\u0016J\b\u0010\u000f\u001a\u00020\nH\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0015\u0010\u0002\u001a\u00060\u0003R\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lokhttp3/Cache$CacheResponseBody;", "Lokhttp3/ResponseBody;", "snapshot", "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "Lokhttp3/internal/cache/DiskLruCache;", "contentType", "", "contentLength", "(Lokhttp3/internal/cache/DiskLruCache$Snapshot;Ljava/lang/String;Ljava/lang/String;)V", "bodySource", "Lokio/BufferedSource;", "getSnapshot", "()Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "", "Lokhttp3/MediaType;", "source", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class CacheResponseBody extends okhttp3.ResponseBody {
        private final okio.BufferedSource bodySource;
        private final java.lang.String contentLength;
        private final java.lang.String contentType;
        private final okhttp3.internal.cache.DiskLruCache.Snapshot snapshot;

        public final okhttp3.internal.cache.DiskLruCache.Snapshot getSnapshot() {
            return this.snapshot;
        }

        public CacheResponseBody(okhttp3.internal.cache.DiskLruCache.Snapshot snapshot, java.lang.String str, java.lang.String str2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(snapshot, "snapshot");
            this.snapshot = snapshot;
            this.contentType = str;
            this.contentLength = str2;
            this.bodySource = okio.Okio.buffer(new okio.ForwardingSource(snapshot.getSource(1)) { // from class: okhttp3.Cache.CacheResponseBody.1
                @Override // okio.ForwardingSource, okio.Source, java.io.Closeable, java.lang.AutoCloseable
                public void close() throws java.io.IOException {
                    this.getSnapshot().close();
                    super.close();
                }
            });
        }

        @Override // okhttp3.ResponseBody
        /* JADX INFO: renamed from: contentType */
        public okhttp3.MediaType get$contentType() {
            java.lang.String str = this.contentType;
            if (str != null) {
                return okhttp3.MediaType.INSTANCE.parse(str);
            }
            return null;
        }

        @Override // okhttp3.ResponseBody
        /* JADX INFO: renamed from: contentLength */
        public long getContentLength() {
            java.lang.String str = this.contentLength;
            if (str != null) {
                return okhttp3.internal.Util.toLongOrDefault(str, -1L);
            }
            return -1L;
        }

        @Override // okhttp3.ResponseBody
        /* JADX INFO: renamed from: source, reason: from getter */
        public okio.BufferedSource getBodySource() {
            return this.bodySource;
        }
    }

    /* JADX INFO: compiled from: Cache.kt */
    @kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0015\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH\u0000¢\u0006\u0002\b\u000fJ\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0002J\u001e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u001aJ\n\u0010\u001b\u001a\u00020\u0015*\u00020\u0017J\u0012\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\t0\u001d*\u00020\u0011H\u0002J\n\u0010\u0010\u001a\u00020\u0011*\u00020\u0017R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lokhttp3/Cache$Companion;", "", "()V", "ENTRY_BODY", "", "ENTRY_COUNT", "ENTRY_METADATA", "VERSION", com.ironsource.y8.h.W, "", "url", "Lokhttp3/HttpUrl;", "readInt", "source", "Lokio/BufferedSource;", "readInt$okhttp", "varyHeaders", "Lokhttp3/Headers;", "requestHeaders", "responseHeaders", "varyMatches", "", "cachedResponse", "Lokhttp3/Response;", "cachedRequest", "newRequest", "Lokhttp3/Request;", "hasVaryAll", "varyFields", "", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final java.lang.String key(okhttp3.HttpUrl url) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
            return okio.ByteString.INSTANCE.encodeUtf8(url.getUrl()).md5().hex();
        }

        public final int readInt$okhttp(okio.BufferedSource source) throws java.io.IOException {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
            try {
                long decimalLong = source.readDecimalLong();
                java.lang.String utf8LineStrict = source.readUtf8LineStrict();
                if (decimalLong >= 0 && decimalLong <= 2147483647L) {
                    if (!(utf8LineStrict.length() > 0)) {
                        return (int) decimalLong;
                    }
                }
                throw new java.io.IOException("expected an int but was \"" + decimalLong + utf8LineStrict + kotlin.text.Typography.quote);
            } catch (java.lang.NumberFormatException e) {
                throw new java.io.IOException(e.getMessage());
            }
        }

        public final boolean varyMatches(okhttp3.Response cachedResponse, okhttp3.Headers cachedRequest, okhttp3.Request newRequest) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cachedResponse, "cachedResponse");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cachedRequest, "cachedRequest");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newRequest, "newRequest");
            java.util.Set<java.lang.String> setVaryFields = varyFields(cachedResponse.headers());
            if ((setVaryFields instanceof java.util.Collection) && setVaryFields.isEmpty()) {
                return true;
            }
            for (java.lang.String str : setVaryFields) {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(cachedRequest.values(str), newRequest.headers(str))) {
                    return false;
                }
            }
            return true;
        }

        public final boolean hasVaryAll(okhttp3.Response response) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "<this>");
            return varyFields(response.headers()).contains(androidx.webkit.ProxyConfig.MATCH_ALL_SCHEMES);
        }

        private final java.util.Set<java.lang.String> varyFields(okhttp3.Headers headers) {
            int size = headers.size();
            java.util.TreeSet treeSet = null;
            for (int i = 0; i < size; i++) {
                if (kotlin.text.StringsKt.equals(com.google.common.net.HttpHeaders.VARY, headers.name(i), true)) {
                    java.lang.String strValue = headers.value(i);
                    if (treeSet == null) {
                        treeSet = new java.util.TreeSet(kotlin.text.StringsKt.getCASE_INSENSITIVE_ORDER(kotlin.jvm.internal.StringCompanionObject.INSTANCE));
                    }
                    java.util.Iterator it = kotlin.text.StringsKt.split$default((java.lang.CharSequence) strValue, new char[]{','}, false, 0, 6, (java.lang.Object) null).iterator();
                    while (it.hasNext()) {
                        treeSet.add(kotlin.text.StringsKt.trim((java.lang.CharSequence) it.next()).toString());
                    }
                }
            }
            return treeSet == null ? kotlin.collections.SetsKt.emptySet() : treeSet;
        }

        public final okhttp3.Headers varyHeaders(okhttp3.Response response) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "<this>");
            okhttp3.Response responseNetworkResponse = response.networkResponse();
            kotlin.jvm.internal.Intrinsics.checkNotNull(responseNetworkResponse);
            return varyHeaders(responseNetworkResponse.request().headers(), response.headers());
        }

        private final okhttp3.Headers varyHeaders(okhttp3.Headers requestHeaders, okhttp3.Headers responseHeaders) {
            java.util.Set<java.lang.String> setVaryFields = varyFields(responseHeaders);
            if (setVaryFields.isEmpty()) {
                return okhttp3.internal.Util.EMPTY_HEADERS;
            }
            okhttp3.Headers.Builder builder = new okhttp3.Headers.Builder();
            int size = requestHeaders.size();
            for (int i = 0; i < size; i++) {
                java.lang.String strName = requestHeaders.name(i);
                if (setVaryFields.contains(strName)) {
                    builder.add(strName, requestHeaders.value(i));
                }
            }
            return builder.build();
        }
    }
}
