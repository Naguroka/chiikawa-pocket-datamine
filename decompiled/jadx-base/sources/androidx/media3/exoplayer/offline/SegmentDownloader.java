package androidx.media3.exoplayer.offline;

/* JADX INFO: loaded from: classes.dex */
public abstract class SegmentDownloader<M extends androidx.media3.exoplayer.offline.FilterableManifest<M>> implements androidx.media3.exoplayer.offline.Downloader {
    private static final int BUFFER_SIZE_BYTES = 131072;
    public static final long DEFAULT_MAX_MERGED_SEGMENT_START_TIME_DIFF_MS = 20000;
    private final java.util.ArrayList<androidx.media3.common.util.RunnableFutureTask<?, ?>> activeRunnables;
    private final androidx.media3.datasource.cache.Cache cache;
    private final androidx.media3.datasource.cache.CacheDataSource.Factory cacheDataSourceFactory;
    private final androidx.media3.datasource.cache.CacheKeyFactory cacheKeyFactory;
    private final java.util.concurrent.Executor executor;
    private volatile boolean isCanceled;
    private final androidx.media3.datasource.DataSpec manifestDataSpec;
    private final androidx.media3.exoplayer.upstream.ParsingLoadable.Parser<M> manifestParser;
    private final long maxMergedSegmentStartTimeDiffUs;
    private final androidx.media3.common.PriorityTaskManager priorityTaskManager;
    private final java.util.ArrayList<androidx.media3.common.StreamKey> streamKeys;

    protected abstract java.util.List<androidx.media3.exoplayer.offline.SegmentDownloader.Segment> getSegments(androidx.media3.datasource.DataSource dataSource, M m, boolean z) throws java.lang.InterruptedException, java.io.IOException;

    protected static class Segment implements java.lang.Comparable<androidx.media3.exoplayer.offline.SegmentDownloader.Segment> {
        public final androidx.media3.datasource.DataSpec dataSpec;
        public final long startTimeUs;

        public Segment(long j, androidx.media3.datasource.DataSpec dataSpec) {
            this.startTimeUs = j;
            this.dataSpec = dataSpec;
        }

        @Override // java.lang.Comparable
        public int compareTo(androidx.media3.exoplayer.offline.SegmentDownloader.Segment segment) {
            return androidx.media3.common.util.Util.compareLong(this.startTimeUs, segment.startTimeUs);
        }
    }

    @java.lang.Deprecated
    public SegmentDownloader(androidx.media3.common.MediaItem mediaItem, androidx.media3.exoplayer.upstream.ParsingLoadable.Parser<M> parser, androidx.media3.datasource.cache.CacheDataSource.Factory factory, java.util.concurrent.Executor executor) {
        this(mediaItem, parser, factory, executor, 20000L);
    }

    public SegmentDownloader(androidx.media3.common.MediaItem mediaItem, androidx.media3.exoplayer.upstream.ParsingLoadable.Parser<M> parser, androidx.media3.datasource.cache.CacheDataSource.Factory factory, java.util.concurrent.Executor executor, long j) {
        androidx.media3.common.util.Assertions.checkNotNull(mediaItem.localConfiguration);
        this.manifestDataSpec = getCompressibleDataSpec(mediaItem.localConfiguration.uri);
        this.manifestParser = parser;
        this.streamKeys = new java.util.ArrayList<>(mediaItem.localConfiguration.streamKeys);
        this.cacheDataSourceFactory = factory;
        this.executor = executor;
        this.cache = (androidx.media3.datasource.cache.Cache) androidx.media3.common.util.Assertions.checkNotNull(factory.getCache());
        this.cacheKeyFactory = factory.getCacheKeyFactory();
        this.priorityTaskManager = factory.getUpstreamPriorityTaskManager();
        this.activeRunnables = new java.util.ArrayList<>();
        this.maxMergedSegmentStartTimeDiffUs = androidx.media3.common.util.Util.msToUs(j);
    }

    @Override // androidx.media3.exoplayer.offline.Downloader
    public final void download(androidx.media3.exoplayer.offline.Downloader.ProgressListener progressListener) throws java.lang.InterruptedException, java.io.IOException {
        androidx.media3.datasource.cache.CacheDataSource cacheDataSourceCreateDataSourceForDownloading;
        byte[] bArr;
        int i;
        java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque();
        java.util.ArrayDeque arrayDeque2 = new java.util.ArrayDeque();
        androidx.media3.common.PriorityTaskManager priorityTaskManager = this.priorityTaskManager;
        if (priorityTaskManager != null) {
            priorityTaskManager.add(-4000);
        }
        try {
            androidx.media3.datasource.cache.CacheDataSource cacheDataSourceCreateDataSourceForDownloading2 = this.cacheDataSourceFactory.createDataSourceForDownloading();
            androidx.media3.exoplayer.offline.FilterableManifest manifest = getManifest(cacheDataSourceCreateDataSourceForDownloading2, this.manifestDataSpec, false);
            if (!this.streamKeys.isEmpty()) {
                manifest = (androidx.media3.exoplayer.offline.FilterableManifest) manifest.copy(this.streamKeys);
            }
            java.util.List<androidx.media3.exoplayer.offline.SegmentDownloader.Segment> segments = getSegments(cacheDataSourceCreateDataSourceForDownloading2, manifest, false);
            java.util.Collections.sort(segments);
            mergeSegments(segments, this.cacheKeyFactory, this.maxMergedSegmentStartTimeDiffUs);
            int size = segments.size();
            int i2 = 0;
            long j = 0;
            long j2 = 0;
            for (int size2 = segments.size() - 1; size2 >= 0; size2 = i - 1) {
                androidx.media3.datasource.DataSpec dataSpec = segments.get(size2).dataSpec;
                java.lang.String strBuildCacheKey = this.cacheKeyFactory.buildCacheKey(dataSpec);
                long j3 = dataSpec.length;
                if (j3 == -1) {
                    long contentLength = androidx.media3.datasource.cache.ContentMetadata.getContentLength(this.cache.getContentMetadata(strBuildCacheKey));
                    if (contentLength != -1) {
                        j3 = contentLength - dataSpec.position;
                    }
                }
                int i3 = size2;
                long cachedBytes = this.cache.getCachedBytes(strBuildCacheKey, dataSpec.position, j3);
                j2 += cachedBytes;
                if (j3 != -1) {
                    if (j3 == cachedBytes) {
                        i2++;
                        i = i3;
                        segments.remove(i);
                    } else {
                        i = i3;
                    }
                    if (j != -1) {
                        j += j3;
                    }
                } else {
                    i = i3;
                    j = -1;
                }
            }
            androidx.media3.exoplayer.offline.SegmentDownloader.ProgressNotifier progressNotifier = progressListener != null ? new androidx.media3.exoplayer.offline.SegmentDownloader.ProgressNotifier(progressListener, j, size, j2, i2) : null;
            arrayDeque.addAll(segments);
            while (!this.isCanceled && !arrayDeque.isEmpty()) {
                androidx.media3.common.PriorityTaskManager priorityTaskManager2 = this.priorityTaskManager;
                if (priorityTaskManager2 != null) {
                    priorityTaskManager2.proceed(-4000);
                }
                if (!arrayDeque2.isEmpty()) {
                    androidx.media3.exoplayer.offline.SegmentDownloader.SegmentDownloadRunnable segmentDownloadRunnable = (androidx.media3.exoplayer.offline.SegmentDownloader.SegmentDownloadRunnable) arrayDeque2.removeFirst();
                    cacheDataSourceCreateDataSourceForDownloading = segmentDownloadRunnable.dataSource;
                    bArr = segmentDownloadRunnable.temporaryBuffer;
                } else {
                    cacheDataSourceCreateDataSourceForDownloading = this.cacheDataSourceFactory.createDataSourceForDownloading();
                    bArr = new byte[131072];
                }
                androidx.media3.exoplayer.offline.SegmentDownloader.SegmentDownloadRunnable segmentDownloadRunnable2 = new androidx.media3.exoplayer.offline.SegmentDownloader.SegmentDownloadRunnable((androidx.media3.exoplayer.offline.SegmentDownloader.Segment) arrayDeque.removeFirst(), cacheDataSourceCreateDataSourceForDownloading, progressNotifier, bArr);
                addActiveRunnable(segmentDownloadRunnable2);
                this.executor.execute(segmentDownloadRunnable2);
                for (int size3 = this.activeRunnables.size() - 1; size3 >= 0; size3--) {
                    androidx.media3.exoplayer.offline.SegmentDownloader.SegmentDownloadRunnable segmentDownloadRunnable3 = (androidx.media3.exoplayer.offline.SegmentDownloader.SegmentDownloadRunnable) this.activeRunnables.get(size3);
                    if (arrayDeque.isEmpty() || segmentDownloadRunnable3.isDone()) {
                        try {
                            segmentDownloadRunnable3.get();
                            removeActiveRunnable(size3);
                            arrayDeque2.addLast(segmentDownloadRunnable3);
                        } catch (java.util.concurrent.ExecutionException e) {
                            java.lang.Throwable th = (java.lang.Throwable) androidx.media3.common.util.Assertions.checkNotNull(e.getCause());
                            if (th instanceof androidx.media3.common.PriorityTaskManager.PriorityTooLowException) {
                                arrayDeque.addFirst(segmentDownloadRunnable3.segment);
                                removeActiveRunnable(size3);
                                arrayDeque2.addLast(segmentDownloadRunnable3);
                            } else {
                                if (th instanceof java.io.IOException) {
                                    throw ((java.io.IOException) th);
                                }
                                androidx.media3.common.util.Util.sneakyThrow(th);
                            }
                        }
                    }
                }
                segmentDownloadRunnable2.blockUntilStarted();
            }
            for (int i4 = 0; i4 < this.activeRunnables.size(); i4++) {
                this.activeRunnables.get(i4).cancel(true);
            }
            for (int size4 = this.activeRunnables.size() - 1; size4 >= 0; size4--) {
                this.activeRunnables.get(size4).blockUntilFinished();
                removeActiveRunnable(size4);
            }
            androidx.media3.common.PriorityTaskManager priorityTaskManager3 = this.priorityTaskManager;
            if (priorityTaskManager3 != null) {
                priorityTaskManager3.remove(-4000);
            }
        } catch (java.lang.Throwable th2) {
            for (int i5 = 0; i5 < this.activeRunnables.size(); i5++) {
                this.activeRunnables.get(i5).cancel(true);
            }
            for (int size5 = this.activeRunnables.size() - 1; size5 >= 0; size5--) {
                this.activeRunnables.get(size5).blockUntilFinished();
                removeActiveRunnable(size5);
            }
            androidx.media3.common.PriorityTaskManager priorityTaskManager4 = this.priorityTaskManager;
            if (priorityTaskManager4 != null) {
                priorityTaskManager4.remove(-4000);
            }
            throw th2;
        }
    }

    @Override // androidx.media3.exoplayer.offline.Downloader
    public void cancel() {
        synchronized (this.activeRunnables) {
            this.isCanceled = true;
            for (int i = 0; i < this.activeRunnables.size(); i++) {
                this.activeRunnables.get(i).cancel(true);
            }
        }
    }

    @Override // androidx.media3.exoplayer.offline.Downloader
    public final void remove() {
        androidx.media3.datasource.cache.CacheDataSource cacheDataSourceCreateDataSourceForRemovingDownload = this.cacheDataSourceFactory.createDataSourceForRemovingDownload();
        try {
            java.util.List<androidx.media3.exoplayer.offline.SegmentDownloader.Segment> segments = getSegments(cacheDataSourceCreateDataSourceForRemovingDownload, getManifest(cacheDataSourceCreateDataSourceForRemovingDownload, this.manifestDataSpec, true), true);
            for (int i = 0; i < segments.size(); i++) {
                this.cache.removeResource(this.cacheKeyFactory.buildCacheKey(segments.get(i).dataSpec));
            }
        } catch (java.lang.InterruptedException unused) {
            java.lang.Thread.currentThread().interrupt();
        } catch (java.lang.Exception unused2) {
        } finally {
            this.cache.removeResource(this.cacheKeyFactory.buildCacheKey(this.manifestDataSpec));
        }
    }

    protected final M getManifest(final androidx.media3.datasource.DataSource dataSource, final androidx.media3.datasource.DataSpec dataSpec, boolean z) throws java.lang.InterruptedException, java.io.IOException {
        return (M) execute(new androidx.media3.common.util.RunnableFutureTask<M, java.io.IOException>() { // from class: androidx.media3.exoplayer.offline.SegmentDownloader.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.media3.common.util.RunnableFutureTask
            public M doWork() throws java.io.IOException {
                return (M) androidx.media3.exoplayer.upstream.ParsingLoadable.load(dataSource, androidx.media3.exoplayer.offline.SegmentDownloader.this.manifestParser, dataSpec, 4);
            }
        }, z);
    }

    protected final <T> T execute(androidx.media3.common.util.RunnableFutureTask<T, ?> runnableFutureTask, boolean z) throws java.lang.Throwable {
        if (z) {
            runnableFutureTask.run();
            try {
                return runnableFutureTask.get();
            } catch (java.util.concurrent.ExecutionException e) {
                java.lang.Throwable th = (java.lang.Throwable) androidx.media3.common.util.Assertions.checkNotNull(e.getCause());
                if (th instanceof java.io.IOException) {
                    throw ((java.io.IOException) th);
                }
                androidx.media3.common.util.Util.sneakyThrow(e);
            }
        }
        while (!this.isCanceled) {
            androidx.media3.common.PriorityTaskManager priorityTaskManager = this.priorityTaskManager;
            if (priorityTaskManager != null) {
                priorityTaskManager.proceed(-4000);
            }
            addActiveRunnable(runnableFutureTask);
            this.executor.execute(runnableFutureTask);
            try {
                T t = runnableFutureTask.get();
                runnableFutureTask.blockUntilFinished();
                removeActiveRunnable((androidx.media3.common.util.RunnableFutureTask<?, ?>) runnableFutureTask);
                return t;
            } catch (java.util.concurrent.ExecutionException e2) {
                try {
                    java.lang.Throwable th2 = (java.lang.Throwable) androidx.media3.common.util.Assertions.checkNotNull(e2.getCause());
                    if (!(th2 instanceof androidx.media3.common.PriorityTaskManager.PriorityTooLowException)) {
                        if (th2 instanceof java.io.IOException) {
                            throw ((java.io.IOException) th2);
                        }
                        androidx.media3.common.util.Util.sneakyThrow(e2);
                    }
                    runnableFutureTask.blockUntilFinished();
                    removeActiveRunnable((androidx.media3.common.util.RunnableFutureTask<?, ?>) runnableFutureTask);
                } catch (java.lang.Throwable th3) {
                    runnableFutureTask.blockUntilFinished();
                    removeActiveRunnable((androidx.media3.common.util.RunnableFutureTask<?, ?>) runnableFutureTask);
                    throw th3;
                }
            }
        }
        throw new java.lang.InterruptedException();
    }

    protected static androidx.media3.datasource.DataSpec getCompressibleDataSpec(android.net.Uri uri) {
        return new androidx.media3.datasource.DataSpec.Builder().setUri(uri).setFlags(1).build();
    }

    private <T> void addActiveRunnable(androidx.media3.common.util.RunnableFutureTask<T, ?> runnableFutureTask) throws java.lang.InterruptedException {
        synchronized (this.activeRunnables) {
            if (this.isCanceled) {
                throw new java.lang.InterruptedException();
            }
            this.activeRunnables.add(runnableFutureTask);
        }
    }

    private void removeActiveRunnable(androidx.media3.common.util.RunnableFutureTask<?, ?> runnableFutureTask) {
        synchronized (this.activeRunnables) {
            this.activeRunnables.remove(runnableFutureTask);
        }
    }

    private void removeActiveRunnable(int i) {
        synchronized (this.activeRunnables) {
            this.activeRunnables.remove(i);
        }
    }

    private static void mergeSegments(java.util.List<androidx.media3.exoplayer.offline.SegmentDownloader.Segment> list, androidx.media3.datasource.cache.CacheKeyFactory cacheKeyFactory, long j) {
        java.util.HashMap map = new java.util.HashMap();
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            androidx.media3.exoplayer.offline.SegmentDownloader.Segment segment = list.get(i2);
            java.lang.String strBuildCacheKey = cacheKeyFactory.buildCacheKey(segment.dataSpec);
            java.lang.Integer num = (java.lang.Integer) map.get(strBuildCacheKey);
            androidx.media3.exoplayer.offline.SegmentDownloader.Segment segment2 = num == null ? null : list.get(num.intValue());
            if (segment2 == null || segment.startTimeUs > segment2.startTimeUs + j || !canMergeSegments(segment2.dataSpec, segment.dataSpec)) {
                map.put(strBuildCacheKey, java.lang.Integer.valueOf(i));
                list.set(i, segment);
                i++;
            } else {
                list.set(((java.lang.Integer) androidx.media3.common.util.Assertions.checkNotNull(num)).intValue(), new androidx.media3.exoplayer.offline.SegmentDownloader.Segment(segment2.startTimeUs, segment2.dataSpec.subrange(0L, segment.dataSpec.length != -1 ? segment2.dataSpec.length + segment.dataSpec.length : -1L)));
            }
        }
        androidx.media3.common.util.Util.removeRange(list, i, list.size());
    }

    private static boolean canMergeSegments(androidx.media3.datasource.DataSpec dataSpec, androidx.media3.datasource.DataSpec dataSpec2) {
        return dataSpec.uri.equals(dataSpec2.uri) && dataSpec.length != -1 && dataSpec.position + dataSpec.length == dataSpec2.position && androidx.media3.common.util.Util.areEqual(dataSpec.key, dataSpec2.key) && dataSpec.flags == dataSpec2.flags && dataSpec.httpMethod == dataSpec2.httpMethod && dataSpec.httpRequestHeaders.equals(dataSpec2.httpRequestHeaders);
    }

    private static final class SegmentDownloadRunnable extends androidx.media3.common.util.RunnableFutureTask<java.lang.Void, java.io.IOException> {
        private final androidx.media3.datasource.cache.CacheWriter cacheWriter;
        public final androidx.media3.datasource.cache.CacheDataSource dataSource;
        private final androidx.media3.exoplayer.offline.SegmentDownloader.ProgressNotifier progressNotifier;
        public final androidx.media3.exoplayer.offline.SegmentDownloader.Segment segment;
        public final byte[] temporaryBuffer;

        public SegmentDownloadRunnable(androidx.media3.exoplayer.offline.SegmentDownloader.Segment segment, androidx.media3.datasource.cache.CacheDataSource cacheDataSource, androidx.media3.exoplayer.offline.SegmentDownloader.ProgressNotifier progressNotifier, byte[] bArr) {
            this.segment = segment;
            this.dataSource = cacheDataSource;
            this.progressNotifier = progressNotifier;
            this.temporaryBuffer = bArr;
            this.cacheWriter = new androidx.media3.datasource.cache.CacheWriter(cacheDataSource, segment.dataSpec, bArr, progressNotifier);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.media3.common.util.RunnableFutureTask
        public java.lang.Void doWork() throws java.io.IOException {
            this.cacheWriter.cache();
            androidx.media3.exoplayer.offline.SegmentDownloader.ProgressNotifier progressNotifier = this.progressNotifier;
            if (progressNotifier == null) {
                return null;
            }
            progressNotifier.onSegmentDownloaded();
            return null;
        }

        @Override // androidx.media3.common.util.RunnableFutureTask
        protected void cancelWork() {
            this.cacheWriter.cancel();
        }
    }

    private static final class ProgressNotifier implements androidx.media3.datasource.cache.CacheWriter.ProgressListener {
        private long bytesDownloaded;
        private final long contentLength;
        private final androidx.media3.exoplayer.offline.Downloader.ProgressListener progressListener;
        private int segmentsDownloaded;
        private final int totalSegments;

        public ProgressNotifier(androidx.media3.exoplayer.offline.Downloader.ProgressListener progressListener, long j, int i, long j2, int i2) {
            this.progressListener = progressListener;
            this.contentLength = j;
            this.totalSegments = i;
            this.bytesDownloaded = j2;
            this.segmentsDownloaded = i2;
        }

        @Override // androidx.media3.datasource.cache.CacheWriter.ProgressListener
        public void onProgress(long j, long j2, long j3) {
            long j4 = this.bytesDownloaded + j3;
            this.bytesDownloaded = j4;
            this.progressListener.onProgress(this.contentLength, j4, getPercentDownloaded());
        }

        public void onSegmentDownloaded() {
            this.segmentsDownloaded++;
            this.progressListener.onProgress(this.contentLength, this.bytesDownloaded, getPercentDownloaded());
        }

        private float getPercentDownloaded() {
            long j = this.contentLength;
            if (j != -1 && j != 0) {
                return (this.bytesDownloaded * 100.0f) / j;
            }
            int i = this.totalSegments;
            if (i != 0) {
                return (this.segmentsDownloaded * 100.0f) / i;
            }
            return -1.0f;
        }
    }
}
