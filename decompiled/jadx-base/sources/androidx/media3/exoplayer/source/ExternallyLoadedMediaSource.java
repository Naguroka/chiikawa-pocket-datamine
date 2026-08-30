package androidx.media3.exoplayer.source;

/* JADX INFO: loaded from: classes.dex */
public final class ExternallyLoadedMediaSource extends androidx.media3.exoplayer.source.BaseMediaSource {
    private final androidx.media3.exoplayer.source.ExternalLoader externalLoader;
    private androidx.media3.common.MediaItem mediaItem;
    private final long timelineDurationUs;

    @Override // androidx.media3.exoplayer.source.MediaSource
    public void maybeThrowSourceInfoRefreshError() {
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    protected void releaseSourceInternal() {
    }

    public static final class Factory implements androidx.media3.exoplayer.source.MediaSource.Factory {
        private final androidx.media3.exoplayer.source.ExternalLoader externalLoader;
        private final long timelineDurationUs;

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public int[] getSupportedTypes() {
            return new int[]{4};
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public androidx.media3.exoplayer.source.MediaSource.Factory setDrmSessionManagerProvider(androidx.media3.exoplayer.drm.DrmSessionManagerProvider drmSessionManagerProvider) {
            return this;
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public androidx.media3.exoplayer.source.MediaSource.Factory setLoadErrorHandlingPolicy(androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
            return this;
        }

        public Factory(long j, androidx.media3.exoplayer.source.ExternalLoader externalLoader) {
            this.timelineDurationUs = j;
            this.externalLoader = externalLoader;
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public androidx.media3.exoplayer.source.ExternallyLoadedMediaSource createMediaSource(androidx.media3.common.MediaItem mediaItem) {
            return new androidx.media3.exoplayer.source.ExternallyLoadedMediaSource(mediaItem, this.timelineDurationUs, this.externalLoader);
        }
    }

    private ExternallyLoadedMediaSource(androidx.media3.common.MediaItem mediaItem, long j, androidx.media3.exoplayer.source.ExternalLoader externalLoader) {
        this.mediaItem = mediaItem;
        this.timelineDurationUs = j;
        this.externalLoader = externalLoader;
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    protected void prepareSourceInternal(androidx.media3.datasource.TransferListener transferListener) {
        refreshSourceInfo(new androidx.media3.exoplayer.source.SinglePeriodTimeline(this.timelineDurationUs, true, false, false, (java.lang.Object) null, getMediaItem()));
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public synchronized androidx.media3.common.MediaItem getMediaItem() {
        return this.mediaItem;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public boolean canUpdateMediaItem(androidx.media3.common.MediaItem mediaItem) {
        androidx.media3.common.MediaItem.LocalConfiguration localConfiguration = mediaItem.localConfiguration;
        androidx.media3.common.MediaItem.LocalConfiguration localConfiguration2 = (androidx.media3.common.MediaItem.LocalConfiguration) androidx.media3.common.util.Assertions.checkNotNull(getMediaItem().localConfiguration);
        return localConfiguration != null && localConfiguration.uri.equals(localConfiguration2.uri) && java.util.Objects.equals(localConfiguration.mimeType, localConfiguration2.mimeType) && (localConfiguration.imageDurationMs == androidx.media3.common.C.TIME_UNSET || androidx.media3.common.util.Util.msToUs(localConfiguration.imageDurationMs) == this.timelineDurationUs);
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public synchronized void updateMediaItem(androidx.media3.common.MediaItem mediaItem) {
        this.mediaItem = mediaItem;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public androidx.media3.exoplayer.source.MediaPeriod createPeriod(androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, androidx.media3.exoplayer.upstream.Allocator allocator, long j) {
        androidx.media3.common.MediaItem mediaItem = getMediaItem();
        androidx.media3.common.util.Assertions.checkNotNull(mediaItem.localConfiguration);
        androidx.media3.common.util.Assertions.checkNotNull(mediaItem.localConfiguration.mimeType, "Externally loaded mediaItems require a MIME type.");
        return new androidx.media3.exoplayer.source.ExternallyLoadedMediaPeriod(mediaItem.localConfiguration.uri, mediaItem.localConfiguration.mimeType, this.externalLoader);
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public void releasePeriod(androidx.media3.exoplayer.source.MediaPeriod mediaPeriod) {
        ((androidx.media3.exoplayer.source.ExternallyLoadedMediaPeriod) mediaPeriod).releasePeriod();
    }
}
