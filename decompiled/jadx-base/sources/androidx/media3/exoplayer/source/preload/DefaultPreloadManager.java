package androidx.media3.exoplayer.source.preload;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultPreloadManager extends androidx.media3.exoplayer.source.preload.BasePreloadManager<java.lang.Integer> {
    private final androidx.media3.exoplayer.source.preload.PreloadMediaSource.Factory preloadMediaSourceFactory;
    private final androidx.media3.exoplayer.RendererCapabilitiesList rendererCapabilitiesList;

    public static class Status implements androidx.media3.exoplayer.source.preload.TargetPreloadStatusControl.PreloadStatus {
        public static final int STAGE_LOADED_TO_POSITION_MS = 2;
        public static final int STAGE_SOURCE_PREPARED = 0;
        public static final int STAGE_TRACKS_SELECTED = 1;
        private final int stage;
        private final long value;

        @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
        @java.lang.annotation.Documented
        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public @interface Stage {
        }

        public Status(int i, long j) {
            this.stage = i;
            this.value = j;
        }

        public Status(int i) {
            this(i, androidx.media3.common.C.TIME_UNSET);
        }

        @Override // androidx.media3.exoplayer.source.preload.TargetPreloadStatusControl.PreloadStatus
        public int getStage() {
            return this.stage;
        }

        @Override // androidx.media3.exoplayer.source.preload.TargetPreloadStatusControl.PreloadStatus
        public long getValue() {
            return this.value;
        }
    }

    public DefaultPreloadManager(androidx.media3.exoplayer.source.preload.TargetPreloadStatusControl<java.lang.Integer> targetPreloadStatusControl, androidx.media3.exoplayer.source.MediaSource.Factory factory, androidx.media3.exoplayer.trackselection.TrackSelector trackSelector, androidx.media3.exoplayer.upstream.BandwidthMeter bandwidthMeter, androidx.media3.exoplayer.RendererCapabilitiesList.Factory factory2, androidx.media3.exoplayer.upstream.Allocator allocator, android.os.Looper looper) {
        super(new androidx.media3.exoplayer.source.preload.DefaultPreloadManager.RankingDataComparator(), targetPreloadStatusControl, factory);
        androidx.media3.exoplayer.RendererCapabilitiesList rendererCapabilitiesListCreateRendererCapabilitiesList = factory2.createRendererCapabilitiesList();
        this.rendererCapabilitiesList = rendererCapabilitiesListCreateRendererCapabilitiesList;
        this.preloadMediaSourceFactory = new androidx.media3.exoplayer.source.preload.PreloadMediaSource.Factory(factory, new androidx.media3.exoplayer.source.preload.DefaultPreloadManager.SourcePreloadControl(), trackSelector, bandwidthMeter, rendererCapabilitiesListCreateRendererCapabilitiesList.getRendererCapabilities(), allocator, looper);
    }

    public void setCurrentPlayingIndex(int i) {
        ((androidx.media3.exoplayer.source.preload.DefaultPreloadManager.RankingDataComparator) this.rankingDataComparator).currentPlayingIndex = i;
    }

    @Override // androidx.media3.exoplayer.source.preload.BasePreloadManager
    public androidx.media3.exoplayer.source.MediaSource createMediaSourceForPreloading(androidx.media3.exoplayer.source.MediaSource mediaSource) {
        return this.preloadMediaSourceFactory.createMediaSource(mediaSource);
    }

    @Override // androidx.media3.exoplayer.source.preload.BasePreloadManager
    protected void preloadSourceInternal(androidx.media3.exoplayer.source.MediaSource mediaSource, long j) {
        androidx.media3.common.util.Assertions.checkArgument(mediaSource instanceof androidx.media3.exoplayer.source.preload.PreloadMediaSource);
        ((androidx.media3.exoplayer.source.preload.PreloadMediaSource) mediaSource).preload(j);
    }

    @Override // androidx.media3.exoplayer.source.preload.BasePreloadManager
    protected void clearSourceInternal(androidx.media3.exoplayer.source.MediaSource mediaSource) {
        androidx.media3.common.util.Assertions.checkArgument(mediaSource instanceof androidx.media3.exoplayer.source.preload.PreloadMediaSource);
        ((androidx.media3.exoplayer.source.preload.PreloadMediaSource) mediaSource).clear();
    }

    @Override // androidx.media3.exoplayer.source.preload.BasePreloadManager
    protected void releaseSourceInternal(androidx.media3.exoplayer.source.MediaSource mediaSource) {
        androidx.media3.common.util.Assertions.checkArgument(mediaSource instanceof androidx.media3.exoplayer.source.preload.PreloadMediaSource);
        ((androidx.media3.exoplayer.source.preload.PreloadMediaSource) mediaSource).releasePreloadMediaSource();
    }

    @Override // androidx.media3.exoplayer.source.preload.BasePreloadManager
    protected void releaseInternal() {
        this.rendererCapabilitiesList.release();
    }

    private static final class RankingDataComparator implements java.util.Comparator<java.lang.Integer> {
        public int currentPlayingIndex = -1;

        @Override // java.util.Comparator
        public int compare(java.lang.Integer num, java.lang.Integer num2) {
            return java.lang.Integer.compare(java.lang.Math.abs(num.intValue() - this.currentPlayingIndex), java.lang.Math.abs(num2.intValue() - this.currentPlayingIndex));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class SourcePreloadControl implements androidx.media3.exoplayer.source.preload.PreloadMediaSource.PreloadControl {
        private SourcePreloadControl() {
        }

        @Override // androidx.media3.exoplayer.source.preload.PreloadMediaSource.PreloadControl
        public boolean onSourcePrepared(androidx.media3.exoplayer.source.preload.PreloadMediaSource preloadMediaSource) {
            return continueOrCompletePreloading(preloadMediaSource, new com.google.common.base.Predicate() { // from class: androidx.media3.exoplayer.source.preload.DefaultPreloadManager$SourcePreloadControl$$ExternalSyntheticLambda0
                @Override // com.google.common.base.Predicate
                public final boolean apply(java.lang.Object obj) {
                    return androidx.media3.exoplayer.source.preload.DefaultPreloadManager.SourcePreloadControl.lambda$onSourcePrepared$0((androidx.media3.exoplayer.source.preload.DefaultPreloadManager.Status) obj);
                }
            }, true);
        }

        static /* synthetic */ boolean lambda$onSourcePrepared$0(androidx.media3.exoplayer.source.preload.DefaultPreloadManager.Status status) {
            return status.getStage() > 0;
        }

        @Override // androidx.media3.exoplayer.source.preload.PreloadMediaSource.PreloadControl
        public boolean onTracksSelected(androidx.media3.exoplayer.source.preload.PreloadMediaSource preloadMediaSource) {
            return continueOrCompletePreloading(preloadMediaSource, new com.google.common.base.Predicate() { // from class: androidx.media3.exoplayer.source.preload.DefaultPreloadManager$SourcePreloadControl$$ExternalSyntheticLambda2
                @Override // com.google.common.base.Predicate
                public final boolean apply(java.lang.Object obj) {
                    return androidx.media3.exoplayer.source.preload.DefaultPreloadManager.SourcePreloadControl.lambda$onTracksSelected$1((androidx.media3.exoplayer.source.preload.DefaultPreloadManager.Status) obj);
                }
            }, false);
        }

        static /* synthetic */ boolean lambda$onTracksSelected$1(androidx.media3.exoplayer.source.preload.DefaultPreloadManager.Status status) {
            return status.getStage() > 1;
        }

        @Override // androidx.media3.exoplayer.source.preload.PreloadMediaSource.PreloadControl
        public boolean onContinueLoadingRequested(androidx.media3.exoplayer.source.preload.PreloadMediaSource preloadMediaSource, final long j) {
            return continueOrCompletePreloading(preloadMediaSource, new com.google.common.base.Predicate() { // from class: androidx.media3.exoplayer.source.preload.DefaultPreloadManager$SourcePreloadControl$$ExternalSyntheticLambda1
                @Override // com.google.common.base.Predicate
                public final boolean apply(java.lang.Object obj) {
                    return androidx.media3.exoplayer.source.preload.DefaultPreloadManager.SourcePreloadControl.lambda$onContinueLoadingRequested$2(j, (androidx.media3.exoplayer.source.preload.DefaultPreloadManager.Status) obj);
                }
            }, false);
        }

        static /* synthetic */ boolean lambda$onContinueLoadingRequested$2(long j, androidx.media3.exoplayer.source.preload.DefaultPreloadManager.Status status) {
            return status.getStage() == 2 && status.getValue() > androidx.media3.common.util.Util.usToMs(j);
        }

        @Override // androidx.media3.exoplayer.source.preload.PreloadMediaSource.PreloadControl
        public void onUsedByPlayer(androidx.media3.exoplayer.source.preload.PreloadMediaSource preloadMediaSource) {
            androidx.media3.exoplayer.source.preload.DefaultPreloadManager.this.onPreloadCompleted(preloadMediaSource);
        }

        @Override // androidx.media3.exoplayer.source.preload.PreloadMediaSource.PreloadControl
        public void onLoadedToTheEndOfSource(androidx.media3.exoplayer.source.preload.PreloadMediaSource preloadMediaSource) {
            androidx.media3.exoplayer.source.preload.DefaultPreloadManager.this.onPreloadCompleted(preloadMediaSource);
        }

        private boolean continueOrCompletePreloading(androidx.media3.exoplayer.source.preload.PreloadMediaSource preloadMediaSource, com.google.common.base.Predicate<androidx.media3.exoplayer.source.preload.DefaultPreloadManager.Status> predicate, boolean z) {
            androidx.media3.exoplayer.source.preload.TargetPreloadStatusControl.PreloadStatus targetPreloadStatus = androidx.media3.exoplayer.source.preload.DefaultPreloadManager.this.getTargetPreloadStatus(preloadMediaSource);
            if (targetPreloadStatus != null) {
                if (predicate.apply((androidx.media3.exoplayer.source.preload.DefaultPreloadManager.Status) androidx.media3.common.util.Assertions.checkNotNull((androidx.media3.exoplayer.source.preload.DefaultPreloadManager.Status) targetPreloadStatus))) {
                    return true;
                }
                if (z) {
                    androidx.media3.exoplayer.source.preload.DefaultPreloadManager.this.clearSourceInternal(preloadMediaSource);
                }
            }
            androidx.media3.exoplayer.source.preload.DefaultPreloadManager.this.onPreloadCompleted(preloadMediaSource);
            return false;
        }
    }
}
