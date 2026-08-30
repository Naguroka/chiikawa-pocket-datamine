package androidx.media3.datasource.cache;

/* JADX INFO: loaded from: classes.dex */
public final class CacheDataSource implements androidx.media3.datasource.DataSource {
    public static final int CACHE_IGNORED_REASON_ERROR = 0;
    public static final int CACHE_IGNORED_REASON_UNSET_LENGTH = 1;
    private static final int CACHE_NOT_IGNORED = -1;
    public static final int FLAG_BLOCK_ON_CACHE = 1;
    public static final int FLAG_IGNORE_CACHE_FOR_UNSET_LENGTH_REQUESTS = 4;
    public static final int FLAG_IGNORE_CACHE_ON_ERROR = 2;
    private static final long MIN_READ_BEFORE_CHECKING_CACHE = 102400;
    private android.net.Uri actualUri;
    private final boolean blockOnCache;
    private long bytesRemaining;
    private final androidx.media3.datasource.cache.Cache cache;
    private final androidx.media3.datasource.cache.CacheKeyFactory cacheKeyFactory;
    private final androidx.media3.datasource.DataSource cacheReadDataSource;
    private final androidx.media3.datasource.DataSource cacheWriteDataSource;
    private long checkCachePosition;
    private androidx.media3.datasource.DataSource currentDataSource;
    private long currentDataSourceBytesRead;
    private androidx.media3.datasource.DataSpec currentDataSpec;
    private androidx.media3.datasource.cache.CacheSpan currentHoleSpan;
    private boolean currentRequestIgnoresCache;
    private final androidx.media3.datasource.cache.CacheDataSource.EventListener eventListener;
    private final boolean ignoreCacheForUnsetLengthRequests;
    private final boolean ignoreCacheOnError;
    private long readPosition;
    private androidx.media3.datasource.DataSpec requestDataSpec;
    private boolean seenCacheError;
    private long totalCachedBytesRead;
    private final androidx.media3.datasource.DataSource upstreamDataSource;

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface CacheIgnoredReason {
    }

    public interface EventListener {
        void onCacheIgnored(int i);

        void onCachedBytesRead(long j, long j2);
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    public static final class Factory implements androidx.media3.datasource.DataSource.Factory {
        private androidx.media3.datasource.cache.Cache cache;
        private boolean cacheIsReadOnly;
        private androidx.media3.datasource.DataSink.Factory cacheWriteDataSinkFactory;
        private androidx.media3.datasource.cache.CacheDataSource.EventListener eventListener;
        private int flags;
        private androidx.media3.datasource.DataSource.Factory upstreamDataSourceFactory;
        private int upstreamPriority;
        private androidx.media3.common.PriorityTaskManager upstreamPriorityTaskManager;
        private androidx.media3.datasource.DataSource.Factory cacheReadDataSourceFactory = new androidx.media3.datasource.FileDataSource.Factory();
        private androidx.media3.datasource.cache.CacheKeyFactory cacheKeyFactory = androidx.media3.datasource.cache.CacheKeyFactory.DEFAULT;

        public androidx.media3.datasource.cache.CacheDataSource.Factory setCache(androidx.media3.datasource.cache.Cache cache) {
            this.cache = cache;
            return this;
        }

        public androidx.media3.datasource.cache.Cache getCache() {
            return this.cache;
        }

        public androidx.media3.datasource.cache.CacheDataSource.Factory setCacheReadDataSourceFactory(androidx.media3.datasource.DataSource.Factory factory) {
            this.cacheReadDataSourceFactory = factory;
            return this;
        }

        public androidx.media3.datasource.cache.CacheDataSource.Factory setCacheWriteDataSinkFactory(androidx.media3.datasource.DataSink.Factory factory) {
            this.cacheWriteDataSinkFactory = factory;
            this.cacheIsReadOnly = factory == null;
            return this;
        }

        public androidx.media3.datasource.cache.CacheDataSource.Factory setCacheKeyFactory(androidx.media3.datasource.cache.CacheKeyFactory cacheKeyFactory) {
            this.cacheKeyFactory = cacheKeyFactory;
            return this;
        }

        public androidx.media3.datasource.cache.CacheKeyFactory getCacheKeyFactory() {
            return this.cacheKeyFactory;
        }

        public androidx.media3.datasource.cache.CacheDataSource.Factory setUpstreamDataSourceFactory(androidx.media3.datasource.DataSource.Factory factory) {
            this.upstreamDataSourceFactory = factory;
            return this;
        }

        public androidx.media3.datasource.cache.CacheDataSource.Factory setUpstreamPriorityTaskManager(androidx.media3.common.PriorityTaskManager priorityTaskManager) {
            this.upstreamPriorityTaskManager = priorityTaskManager;
            return this;
        }

        public androidx.media3.common.PriorityTaskManager getUpstreamPriorityTaskManager() {
            return this.upstreamPriorityTaskManager;
        }

        public androidx.media3.datasource.cache.CacheDataSource.Factory setUpstreamPriority(int i) {
            this.upstreamPriority = i;
            return this;
        }

        public androidx.media3.datasource.cache.CacheDataSource.Factory setFlags(int i) {
            this.flags = i;
            return this;
        }

        public androidx.media3.datasource.cache.CacheDataSource.Factory setEventListener(androidx.media3.datasource.cache.CacheDataSource.EventListener eventListener) {
            this.eventListener = eventListener;
            return this;
        }

        @Override // androidx.media3.datasource.DataSource.Factory
        public androidx.media3.datasource.cache.CacheDataSource createDataSource() {
            androidx.media3.datasource.DataSource.Factory factory = this.upstreamDataSourceFactory;
            return createDataSourceInternal(factory != null ? factory.createDataSource() : null, this.flags, this.upstreamPriority);
        }

        public androidx.media3.datasource.cache.CacheDataSource createDataSourceForDownloading() {
            androidx.media3.datasource.DataSource.Factory factory = this.upstreamDataSourceFactory;
            return createDataSourceInternal(factory != null ? factory.createDataSource() : null, this.flags | 1, -4000);
        }

        public androidx.media3.datasource.cache.CacheDataSource createDataSourceForRemovingDownload() {
            return createDataSourceInternal(null, this.flags | 1, -4000);
        }

        private androidx.media3.datasource.cache.CacheDataSource createDataSourceInternal(androidx.media3.datasource.DataSource dataSource, int i, int i2) {
            androidx.media3.datasource.DataSink dataSinkCreateDataSink;
            androidx.media3.datasource.cache.Cache cache = (androidx.media3.datasource.cache.Cache) androidx.media3.common.util.Assertions.checkNotNull(this.cache);
            if (this.cacheIsReadOnly || dataSource == null) {
                dataSinkCreateDataSink = null;
            } else {
                androidx.media3.datasource.DataSink.Factory factory = this.cacheWriteDataSinkFactory;
                if (factory != null) {
                    dataSinkCreateDataSink = factory.createDataSink();
                } else {
                    dataSinkCreateDataSink = new androidx.media3.datasource.cache.CacheDataSink.Factory().setCache(cache).createDataSink();
                }
            }
            return new androidx.media3.datasource.cache.CacheDataSource(cache, dataSource, this.cacheReadDataSourceFactory.createDataSource(), dataSinkCreateDataSink, this.cacheKeyFactory, i, this.upstreamPriorityTaskManager, i2, this.eventListener);
        }
    }

    public CacheDataSource(androidx.media3.datasource.cache.Cache cache, androidx.media3.datasource.DataSource dataSource) {
        this(cache, dataSource, 0);
    }

    public CacheDataSource(androidx.media3.datasource.cache.Cache cache, androidx.media3.datasource.DataSource dataSource, int i) {
        this(cache, dataSource, new androidx.media3.datasource.FileDataSource(), new androidx.media3.datasource.cache.CacheDataSink(cache, 5242880L), i, null);
    }

    public CacheDataSource(androidx.media3.datasource.cache.Cache cache, androidx.media3.datasource.DataSource dataSource, androidx.media3.datasource.DataSource dataSource2, androidx.media3.datasource.DataSink dataSink, int i, androidx.media3.datasource.cache.CacheDataSource.EventListener eventListener) {
        this(cache, dataSource, dataSource2, dataSink, i, eventListener, null);
    }

    public CacheDataSource(androidx.media3.datasource.cache.Cache cache, androidx.media3.datasource.DataSource dataSource, androidx.media3.datasource.DataSource dataSource2, androidx.media3.datasource.DataSink dataSink, int i, androidx.media3.datasource.cache.CacheDataSource.EventListener eventListener, androidx.media3.datasource.cache.CacheKeyFactory cacheKeyFactory) {
        this(cache, dataSource, dataSource2, dataSink, cacheKeyFactory, i, null, -1000, eventListener);
    }

    private CacheDataSource(androidx.media3.datasource.cache.Cache cache, androidx.media3.datasource.DataSource dataSource, androidx.media3.datasource.DataSource dataSource2, androidx.media3.datasource.DataSink dataSink, androidx.media3.datasource.cache.CacheKeyFactory cacheKeyFactory, int i, androidx.media3.common.PriorityTaskManager priorityTaskManager, int i2, androidx.media3.datasource.cache.CacheDataSource.EventListener eventListener) {
        this.cache = cache;
        this.cacheReadDataSource = dataSource2;
        this.cacheKeyFactory = cacheKeyFactory == null ? androidx.media3.datasource.cache.CacheKeyFactory.DEFAULT : cacheKeyFactory;
        this.blockOnCache = (i & 1) != 0;
        this.ignoreCacheOnError = (i & 2) != 0;
        this.ignoreCacheForUnsetLengthRequests = (i & 4) != 0;
        if (dataSource != null) {
            dataSource = priorityTaskManager != null ? new androidx.media3.datasource.PriorityDataSource(dataSource, priorityTaskManager, i2) : dataSource;
            this.upstreamDataSource = dataSource;
            this.cacheWriteDataSource = dataSink != null ? new androidx.media3.datasource.TeeDataSource(dataSource, dataSink) : null;
        } else {
            this.upstreamDataSource = androidx.media3.datasource.PlaceholderDataSource.INSTANCE;
            this.cacheWriteDataSource = null;
        }
        this.eventListener = eventListener;
    }

    public androidx.media3.datasource.cache.Cache getCache() {
        return this.cache;
    }

    public androidx.media3.datasource.cache.CacheKeyFactory getCacheKeyFactory() {
        return this.cacheKeyFactory;
    }

    @Override // androidx.media3.datasource.DataSource
    public void addTransferListener(androidx.media3.datasource.TransferListener transferListener) {
        androidx.media3.common.util.Assertions.checkNotNull(transferListener);
        this.cacheReadDataSource.addTransferListener(transferListener);
        this.upstreamDataSource.addTransferListener(transferListener);
    }

    @Override // androidx.media3.datasource.DataSource
    public long open(androidx.media3.datasource.DataSpec dataSpec) throws java.io.IOException {
        long jMin;
        try {
            java.lang.String strBuildCacheKey = this.cacheKeyFactory.buildCacheKey(dataSpec);
            androidx.media3.datasource.DataSpec dataSpecBuild = dataSpec.buildUpon().setKey(strBuildCacheKey).build();
            this.requestDataSpec = dataSpecBuild;
            this.actualUri = getRedirectedUriOrDefault(this.cache, strBuildCacheKey, dataSpecBuild.uri);
            this.readPosition = dataSpec.position;
            int iShouldIgnoreCacheForRequest = shouldIgnoreCacheForRequest(dataSpec);
            boolean z = iShouldIgnoreCacheForRequest != -1;
            this.currentRequestIgnoresCache = z;
            if (z) {
                notifyCacheIgnored(iShouldIgnoreCacheForRequest);
            }
            if (this.currentRequestIgnoresCache) {
                this.bytesRemaining = -1L;
            } else {
                long contentLength = androidx.media3.datasource.cache.ContentMetadata.getContentLength(this.cache.getContentMetadata(strBuildCacheKey));
                this.bytesRemaining = contentLength;
                if (contentLength != -1) {
                    long j = contentLength - dataSpec.position;
                    this.bytesRemaining = j;
                    if (j < 0) {
                        throw new androidx.media3.datasource.DataSourceException(2008);
                    }
                }
            }
            if (dataSpec.length != -1) {
                long j2 = this.bytesRemaining;
                if (j2 == -1) {
                    jMin = dataSpec.length;
                } else {
                    jMin = java.lang.Math.min(j2, dataSpec.length);
                }
                this.bytesRemaining = jMin;
            }
            long j3 = this.bytesRemaining;
            if (j3 > 0 || j3 == -1) {
                openNextSource(dataSpecBuild, false);
            }
            return dataSpec.length != -1 ? dataSpec.length : this.bytesRemaining;
        } catch (java.lang.Throwable th) {
            handleBeforeThrow(th);
            throw th;
        }
    }

    @Override // androidx.media3.common.DataReader
    public int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        if (i2 == 0) {
            return 0;
        }
        if (this.bytesRemaining == 0) {
            return -1;
        }
        androidx.media3.datasource.DataSpec dataSpec = (androidx.media3.datasource.DataSpec) androidx.media3.common.util.Assertions.checkNotNull(this.requestDataSpec);
        androidx.media3.datasource.DataSpec dataSpec2 = (androidx.media3.datasource.DataSpec) androidx.media3.common.util.Assertions.checkNotNull(this.currentDataSpec);
        try {
            if (this.readPosition >= this.checkCachePosition) {
                openNextSource(dataSpec, true);
            }
            int i3 = ((androidx.media3.datasource.DataSource) androidx.media3.common.util.Assertions.checkNotNull(this.currentDataSource)).read(bArr, i, i2);
            if (i3 != -1) {
                if (isReadingFromCache()) {
                    this.totalCachedBytesRead += (long) i3;
                }
                long j = i3;
                this.readPosition += j;
                this.currentDataSourceBytesRead += j;
                long j2 = this.bytesRemaining;
                if (j2 != -1) {
                    this.bytesRemaining = j2 - j;
                }
            } else if (isReadingFromUpstream() && (dataSpec2.length == -1 || this.currentDataSourceBytesRead < dataSpec2.length)) {
                setNoBytesRemainingAndMaybeStoreLength((java.lang.String) androidx.media3.common.util.Util.castNonNull(dataSpec.key));
            } else {
                long j3 = this.bytesRemaining;
                if (j3 <= 0) {
                    if (j3 == -1) {
                    }
                }
                closeCurrentSource();
                openNextSource(dataSpec, false);
                return read(bArr, i, i2);
            }
            return i3;
        } catch (java.lang.Throwable th) {
            handleBeforeThrow(th);
            throw th;
        }
    }

    @Override // androidx.media3.datasource.DataSource
    public android.net.Uri getUri() {
        return this.actualUri;
    }

    @Override // androidx.media3.datasource.DataSource
    public java.util.Map<java.lang.String, java.util.List<java.lang.String>> getResponseHeaders() {
        if (isReadingFromUpstream()) {
            return this.upstreamDataSource.getResponseHeaders();
        }
        return java.util.Collections.emptyMap();
    }

    @Override // androidx.media3.datasource.DataSource
    public void close() throws java.io.IOException {
        this.requestDataSpec = null;
        this.actualUri = null;
        this.readPosition = 0L;
        notifyBytesRead();
        try {
            closeCurrentSource();
        } catch (java.lang.Throwable th) {
            handleBeforeThrow(th);
            throw th;
        }
    }

    private void openNextSource(androidx.media3.datasource.DataSpec dataSpec, boolean z) throws java.io.IOException {
        androidx.media3.datasource.cache.CacheSpan cacheSpanStartReadWrite;
        long jMin;
        androidx.media3.datasource.DataSpec dataSpecBuild;
        androidx.media3.datasource.DataSource dataSource;
        java.lang.String str = (java.lang.String) androidx.media3.common.util.Util.castNonNull(dataSpec.key);
        if (this.currentRequestIgnoresCache) {
            cacheSpanStartReadWrite = null;
        } else if (this.blockOnCache) {
            try {
                cacheSpanStartReadWrite = this.cache.startReadWrite(str, this.readPosition, this.bytesRemaining);
            } catch (java.lang.InterruptedException unused) {
                java.lang.Thread.currentThread().interrupt();
                throw new java.io.InterruptedIOException();
            }
        } else {
            cacheSpanStartReadWrite = this.cache.startReadWriteNonBlocking(str, this.readPosition, this.bytesRemaining);
        }
        if (cacheSpanStartReadWrite == null) {
            dataSource = this.upstreamDataSource;
            dataSpecBuild = dataSpec.buildUpon().setPosition(this.readPosition).setLength(this.bytesRemaining).build();
        } else if (cacheSpanStartReadWrite.isCached) {
            android.net.Uri uriFromFile = android.net.Uri.fromFile((java.io.File) androidx.media3.common.util.Util.castNonNull(cacheSpanStartReadWrite.file));
            long j = cacheSpanStartReadWrite.position;
            long j2 = this.readPosition - j;
            long jMin2 = cacheSpanStartReadWrite.length - j2;
            long j3 = this.bytesRemaining;
            if (j3 != -1) {
                jMin2 = java.lang.Math.min(jMin2, j3);
            }
            dataSpecBuild = dataSpec.buildUpon().setUri(uriFromFile).setUriPositionOffset(j).setPosition(j2).setLength(jMin2).build();
            dataSource = this.cacheReadDataSource;
        } else {
            if (cacheSpanStartReadWrite.isOpenEnded()) {
                jMin = this.bytesRemaining;
            } else {
                jMin = cacheSpanStartReadWrite.length;
                long j4 = this.bytesRemaining;
                if (j4 != -1) {
                    jMin = java.lang.Math.min(jMin, j4);
                }
            }
            dataSpecBuild = dataSpec.buildUpon().setPosition(this.readPosition).setLength(jMin).build();
            dataSource = this.cacheWriteDataSource;
            if (dataSource == null) {
                dataSource = this.upstreamDataSource;
                this.cache.releaseHoleSpan(cacheSpanStartReadWrite);
                cacheSpanStartReadWrite = null;
            }
        }
        this.checkCachePosition = (this.currentRequestIgnoresCache || dataSource != this.upstreamDataSource) ? Long.MAX_VALUE : this.readPosition + MIN_READ_BEFORE_CHECKING_CACHE;
        if (z) {
            androidx.media3.common.util.Assertions.checkState(isBypassingCache());
            if (dataSource == this.upstreamDataSource) {
                return;
            }
            try {
                closeCurrentSource();
            } catch (java.lang.Throwable th) {
                if (((androidx.media3.datasource.cache.CacheSpan) androidx.media3.common.util.Util.castNonNull(cacheSpanStartReadWrite)).isHoleSpan()) {
                    this.cache.releaseHoleSpan(cacheSpanStartReadWrite);
                    throw th;
                }
                throw th;
            }
        }
        if (cacheSpanStartReadWrite != null && cacheSpanStartReadWrite.isHoleSpan()) {
            this.currentHoleSpan = cacheSpanStartReadWrite;
        }
        this.currentDataSource = dataSource;
        this.currentDataSpec = dataSpecBuild;
        this.currentDataSourceBytesRead = 0L;
        long jOpen = dataSource.open(dataSpecBuild);
        androidx.media3.datasource.cache.ContentMetadataMutations contentMetadataMutations = new androidx.media3.datasource.cache.ContentMetadataMutations();
        if (dataSpecBuild.length == -1 && jOpen != -1) {
            this.bytesRemaining = jOpen;
            androidx.media3.datasource.cache.ContentMetadataMutations.setContentLength(contentMetadataMutations, this.readPosition + jOpen);
        }
        if (isReadingFromUpstream()) {
            this.actualUri = dataSource.getUri();
            androidx.media3.datasource.cache.ContentMetadataMutations.setRedirectedUri(contentMetadataMutations, dataSpec.uri.equals(this.actualUri) ^ true ? this.actualUri : null);
        }
        if (isWritingToCache()) {
            this.cache.applyContentMetadataMutations(str, contentMetadataMutations);
        }
    }

    private void setNoBytesRemainingAndMaybeStoreLength(java.lang.String str) throws java.io.IOException {
        this.bytesRemaining = 0L;
        if (isWritingToCache()) {
            androidx.media3.datasource.cache.ContentMetadataMutations contentMetadataMutations = new androidx.media3.datasource.cache.ContentMetadataMutations();
            androidx.media3.datasource.cache.ContentMetadataMutations.setContentLength(contentMetadataMutations, this.readPosition);
            this.cache.applyContentMetadataMutations(str, contentMetadataMutations);
        }
    }

    private static android.net.Uri getRedirectedUriOrDefault(androidx.media3.datasource.cache.Cache cache, java.lang.String str, android.net.Uri uri) {
        android.net.Uri redirectedUri = androidx.media3.datasource.cache.ContentMetadata.getRedirectedUri(cache.getContentMetadata(str));
        return redirectedUri != null ? redirectedUri : uri;
    }

    private boolean isReadingFromUpstream() {
        return !isReadingFromCache();
    }

    private boolean isBypassingCache() {
        return this.currentDataSource == this.upstreamDataSource;
    }

    private boolean isReadingFromCache() {
        return this.currentDataSource == this.cacheReadDataSource;
    }

    private boolean isWritingToCache() {
        return this.currentDataSource == this.cacheWriteDataSource;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void closeCurrentSource() throws java.io.IOException {
        androidx.media3.datasource.DataSource dataSource = this.currentDataSource;
        if (dataSource == null) {
            return;
        }
        try {
            dataSource.close();
        } finally {
            this.currentDataSpec = null;
            this.currentDataSource = null;
            androidx.media3.datasource.cache.CacheSpan cacheSpan = this.currentHoleSpan;
            if (cacheSpan != null) {
                this.cache.releaseHoleSpan(cacheSpan);
                this.currentHoleSpan = null;
            }
        }
    }

    private void handleBeforeThrow(java.lang.Throwable th) {
        if (isReadingFromCache() || (th instanceof androidx.media3.datasource.cache.Cache.CacheException)) {
            this.seenCacheError = true;
        }
    }

    private int shouldIgnoreCacheForRequest(androidx.media3.datasource.DataSpec dataSpec) {
        if (this.ignoreCacheOnError && this.seenCacheError) {
            return 0;
        }
        return (this.ignoreCacheForUnsetLengthRequests && dataSpec.length == -1) ? 1 : -1;
    }

    private void notifyCacheIgnored(int i) {
        androidx.media3.datasource.cache.CacheDataSource.EventListener eventListener = this.eventListener;
        if (eventListener != null) {
            eventListener.onCacheIgnored(i);
        }
    }

    private void notifyBytesRead() {
        androidx.media3.datasource.cache.CacheDataSource.EventListener eventListener = this.eventListener;
        if (eventListener == null || this.totalCachedBytesRead <= 0) {
            return;
        }
        eventListener.onCachedBytesRead(this.cache.getCacheSpace(), this.totalCachedBytesRead);
        this.totalCachedBytesRead = 0L;
    }
}
