package androidx.media3.exoplayer.source.preload;

/* JADX INFO: loaded from: classes.dex */
public abstract class BasePreloadManager<T> {
    private final androidx.media3.exoplayer.source.MediaSource.Factory mediaSourceFactory;
    protected final java.util.Comparator<T> rankingDataComparator;
    private final androidx.media3.exoplayer.source.preload.TargetPreloadStatusControl<T> targetPreloadStatusControl;
    private androidx.media3.exoplayer.source.preload.TargetPreloadStatusControl.PreloadStatus targetPreloadStatusOfCurrentPreloadingSource;
    private final java.lang.Object lock = new java.lang.Object();
    private final java.util.Map<androidx.media3.common.MediaItem, androidx.media3.exoplayer.source.preload.BasePreloadManager<T>.MediaSourceHolder> mediaItemMediaSourceHolderMap = new java.util.HashMap();
    private final android.os.Handler startPreloadingHandler = androidx.media3.common.util.Util.createHandlerForCurrentOrMainLooper();
    private final java.util.PriorityQueue<androidx.media3.exoplayer.source.preload.BasePreloadManager<T>.MediaSourceHolder> sourceHolderPriorityQueue = new java.util.PriorityQueue<>();

    protected abstract void clearSourceInternal(androidx.media3.exoplayer.source.MediaSource mediaSource);

    protected androidx.media3.exoplayer.source.MediaSource createMediaSourceForPreloading(androidx.media3.exoplayer.source.MediaSource mediaSource) {
        return mediaSource;
    }

    protected abstract void preloadSourceInternal(androidx.media3.exoplayer.source.MediaSource mediaSource, long j);

    protected void releaseInternal() {
    }

    protected abstract void releaseSourceInternal(androidx.media3.exoplayer.source.MediaSource mediaSource);

    protected boolean shouldStartPreloadingNextSource() {
        return true;
    }

    protected static abstract class BuilderBase<T> {
        protected final androidx.media3.exoplayer.source.MediaSource.Factory mediaSourceFactory;
        protected final java.util.Comparator<T> rankingDataComparator;
        protected final androidx.media3.exoplayer.source.preload.TargetPreloadStatusControl<T> targetPreloadStatusControl;

        public abstract androidx.media3.exoplayer.source.preload.BasePreloadManager<T> build();

        public BuilderBase(java.util.Comparator<T> comparator, androidx.media3.exoplayer.source.preload.TargetPreloadStatusControl<T> targetPreloadStatusControl, androidx.media3.exoplayer.source.MediaSource.Factory factory) {
            this.rankingDataComparator = comparator;
            this.targetPreloadStatusControl = targetPreloadStatusControl;
            this.mediaSourceFactory = factory;
        }
    }

    protected BasePreloadManager(java.util.Comparator<T> comparator, androidx.media3.exoplayer.source.preload.TargetPreloadStatusControl<T> targetPreloadStatusControl, androidx.media3.exoplayer.source.MediaSource.Factory factory) {
        this.rankingDataComparator = comparator;
        this.targetPreloadStatusControl = targetPreloadStatusControl;
        this.mediaSourceFactory = factory;
    }

    public final int getSourceCount() {
        return this.mediaItemMediaSourceHolderMap.size();
    }

    public final void add(androidx.media3.common.MediaItem mediaItem, T t) {
        add(this.mediaSourceFactory.createMediaSource(mediaItem), t);
    }

    public final void add(androidx.media3.exoplayer.source.MediaSource mediaSource, T t) {
        androidx.media3.exoplayer.source.MediaSource mediaSourceCreateMediaSourceForPreloading = createMediaSourceForPreloading(mediaSource);
        this.mediaItemMediaSourceHolderMap.put(mediaSourceCreateMediaSourceForPreloading.getMediaItem(), new androidx.media3.exoplayer.source.preload.BasePreloadManager.MediaSourceHolder(this, mediaSourceCreateMediaSourceForPreloading, t));
    }

    public final void invalidate() {
        synchronized (this.lock) {
            this.sourceHolderPriorityQueue.clear();
            this.sourceHolderPriorityQueue.addAll(this.mediaItemMediaSourceHolderMap.values());
            while (!this.sourceHolderPriorityQueue.isEmpty() && !maybeStartPreloadNextSource()) {
                this.sourceHolderPriorityQueue.poll();
            }
        }
    }

    public final androidx.media3.exoplayer.source.MediaSource getMediaSource(androidx.media3.common.MediaItem mediaItem) {
        if (this.mediaItemMediaSourceHolderMap.containsKey(mediaItem)) {
            return this.mediaItemMediaSourceHolderMap.get(mediaItem).mediaSource;
        }
        return null;
    }

    public final boolean remove(androidx.media3.common.MediaItem mediaItem) {
        if (!this.mediaItemMediaSourceHolderMap.containsKey(mediaItem)) {
            return false;
        }
        androidx.media3.exoplayer.source.MediaSource mediaSource = this.mediaItemMediaSourceHolderMap.get(mediaItem).mediaSource;
        this.mediaItemMediaSourceHolderMap.remove(mediaItem);
        releaseSourceInternal(mediaSource);
        return true;
    }

    public final boolean remove(androidx.media3.exoplayer.source.MediaSource mediaSource) {
        androidx.media3.common.MediaItem mediaItem = mediaSource.getMediaItem();
        if (!this.mediaItemMediaSourceHolderMap.containsKey(mediaItem) || mediaSource != this.mediaItemMediaSourceHolderMap.get(mediaItem).mediaSource) {
            return false;
        }
        this.mediaItemMediaSourceHolderMap.remove(mediaItem);
        releaseSourceInternal(mediaSource);
        return true;
    }

    public final void reset() {
        java.util.Iterator<androidx.media3.exoplayer.source.preload.BasePreloadManager<T>.MediaSourceHolder> it = this.mediaItemMediaSourceHolderMap.values().iterator();
        while (it.hasNext()) {
            releaseSourceInternal(it.next().mediaSource);
        }
        this.mediaItemMediaSourceHolderMap.clear();
        synchronized (this.lock) {
            this.sourceHolderPriorityQueue.clear();
            this.targetPreloadStatusOfCurrentPreloadingSource = null;
        }
    }

    public final void release() {
        reset();
        releaseInternal();
    }

    protected final void onPreloadCompleted(final androidx.media3.exoplayer.source.MediaSource mediaSource) {
        this.startPreloadingHandler.post(new java.lang.Runnable() { // from class: androidx.media3.exoplayer.source.preload.BasePreloadManager$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m197x846d5e27(mediaSource);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$onPreloadCompleted$0$androidx-media3-exoplayer-source-preload-BasePreloadManager, reason: not valid java name */
    /* synthetic */ void m197x846d5e27(androidx.media3.exoplayer.source.MediaSource mediaSource) {
        synchronized (this.lock) {
            if (!this.sourceHolderPriorityQueue.isEmpty() && ((androidx.media3.exoplayer.source.preload.BasePreloadManager.MediaSourceHolder) androidx.media3.common.util.Assertions.checkNotNull(this.sourceHolderPriorityQueue.peek())).mediaSource == mediaSource) {
                do {
                    this.sourceHolderPriorityQueue.poll();
                    if (this.sourceHolderPriorityQueue.isEmpty()) {
                        break;
                    }
                } while (!maybeStartPreloadNextSource());
            }
        }
    }

    protected final androidx.media3.exoplayer.source.preload.TargetPreloadStatusControl.PreloadStatus getTargetPreloadStatus(androidx.media3.exoplayer.source.MediaSource mediaSource) {
        synchronized (this.lock) {
            if (!this.sourceHolderPriorityQueue.isEmpty() && ((androidx.media3.exoplayer.source.preload.BasePreloadManager.MediaSourceHolder) androidx.media3.common.util.Assertions.checkNotNull(this.sourceHolderPriorityQueue.peek())).mediaSource == mediaSource) {
                return this.targetPreloadStatusOfCurrentPreloadingSource;
            }
            return null;
        }
    }

    private boolean maybeStartPreloadNextSource() {
        if (!shouldStartPreloadingNextSource()) {
            return false;
        }
        androidx.media3.exoplayer.source.preload.BasePreloadManager.MediaSourceHolder mediaSourceHolder = (androidx.media3.exoplayer.source.preload.BasePreloadManager.MediaSourceHolder) androidx.media3.common.util.Assertions.checkNotNull(this.sourceHolderPriorityQueue.peek());
        androidx.media3.exoplayer.source.preload.TargetPreloadStatusControl.PreloadStatus targetPreloadStatus = this.targetPreloadStatusControl.getTargetPreloadStatus(mediaSourceHolder.rankingData);
        this.targetPreloadStatusOfCurrentPreloadingSource = targetPreloadStatus;
        if (targetPreloadStatus != null) {
            preloadSourceInternal(mediaSourceHolder.mediaSource, mediaSourceHolder.startPositionUs);
            return true;
        }
        clearSourceInternal(mediaSourceHolder.mediaSource);
        return false;
    }

    private final class MediaSourceHolder implements java.lang.Comparable<androidx.media3.exoplayer.source.preload.BasePreloadManager<T>.MediaSourceHolder> {
        public final androidx.media3.exoplayer.source.MediaSource mediaSource;
        public final T rankingData;
        public final long startPositionUs;

        public MediaSourceHolder(androidx.media3.exoplayer.source.preload.BasePreloadManager basePreloadManager, androidx.media3.exoplayer.source.MediaSource mediaSource, T t) {
            this(mediaSource, t, androidx.media3.common.C.TIME_UNSET);
        }

        public MediaSourceHolder(androidx.media3.exoplayer.source.MediaSource mediaSource, T t, long j) {
            this.mediaSource = mediaSource;
            this.rankingData = t;
            this.startPositionUs = j;
        }

        @Override // java.lang.Comparable
        public int compareTo(androidx.media3.exoplayer.source.preload.BasePreloadManager<T>.MediaSourceHolder mediaSourceHolder) {
            return androidx.media3.exoplayer.source.preload.BasePreloadManager.this.rankingDataComparator.compare(this.rankingData, mediaSourceHolder.rankingData);
        }
    }
}
