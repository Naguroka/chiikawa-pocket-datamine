package androidx.media3.exoplayer.source;

/* JADX INFO: loaded from: classes.dex */
public final class SingleSampleMediaSource extends androidx.media3.exoplayer.source.BaseMediaSource {
    private final androidx.media3.datasource.DataSource.Factory dataSourceFactory;
    private final androidx.media3.datasource.DataSpec dataSpec;
    private final long durationUs;
    private final androidx.media3.common.Format format;
    private final androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy;
    private final androidx.media3.common.MediaItem mediaItem;
    private final androidx.media3.common.Timeline timeline;
    private androidx.media3.datasource.TransferListener transferListener;
    private final boolean treatLoadErrorsAsEndOfStream;

    @Override // androidx.media3.exoplayer.source.MediaSource
    public void maybeThrowSourceInfoRefreshError() {
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    protected void releaseSourceInternal() {
    }

    public static final class Factory {
        private final androidx.media3.datasource.DataSource.Factory dataSourceFactory;
        private java.lang.Object tag;
        private java.lang.String trackId;
        private androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy = new androidx.media3.exoplayer.upstream.DefaultLoadErrorHandlingPolicy();
        private boolean treatLoadErrorsAsEndOfStream = true;

        public Factory(androidx.media3.datasource.DataSource.Factory factory) {
            this.dataSourceFactory = (androidx.media3.datasource.DataSource.Factory) androidx.media3.common.util.Assertions.checkNotNull(factory);
        }

        public androidx.media3.exoplayer.source.SingleSampleMediaSource.Factory setTag(java.lang.Object obj) {
            this.tag = obj;
            return this;
        }

        @java.lang.Deprecated
        public androidx.media3.exoplayer.source.SingleSampleMediaSource.Factory setTrackId(java.lang.String str) {
            this.trackId = str;
            return this;
        }

        public androidx.media3.exoplayer.source.SingleSampleMediaSource.Factory setLoadErrorHandlingPolicy(androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
            if (loadErrorHandlingPolicy == null) {
                loadErrorHandlingPolicy = new androidx.media3.exoplayer.upstream.DefaultLoadErrorHandlingPolicy();
            }
            this.loadErrorHandlingPolicy = loadErrorHandlingPolicy;
            return this;
        }

        public androidx.media3.exoplayer.source.SingleSampleMediaSource.Factory setTreatLoadErrorsAsEndOfStream(boolean z) {
            this.treatLoadErrorsAsEndOfStream = z;
            return this;
        }

        public androidx.media3.exoplayer.source.SingleSampleMediaSource createMediaSource(androidx.media3.common.MediaItem.SubtitleConfiguration subtitleConfiguration, long j) {
            return new androidx.media3.exoplayer.source.SingleSampleMediaSource(this.trackId, subtitleConfiguration, this.dataSourceFactory, j, this.loadErrorHandlingPolicy, this.treatLoadErrorsAsEndOfStream, this.tag);
        }
    }

    private SingleSampleMediaSource(java.lang.String str, androidx.media3.common.MediaItem.SubtitleConfiguration subtitleConfiguration, androidx.media3.datasource.DataSource.Factory factory, long j, androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy, boolean z, java.lang.Object obj) {
        this.dataSourceFactory = factory;
        this.durationUs = j;
        this.loadErrorHandlingPolicy = loadErrorHandlingPolicy;
        this.treatLoadErrorsAsEndOfStream = z;
        androidx.media3.common.MediaItem mediaItemBuild = new androidx.media3.common.MediaItem.Builder().setUri(android.net.Uri.EMPTY).setMediaId(subtitleConfiguration.uri.toString()).setSubtitleConfigurations(com.google.common.collect.ImmutableList.of(subtitleConfiguration)).setTag(obj).build();
        this.mediaItem = mediaItemBuild;
        this.format = new androidx.media3.common.Format.Builder().setSampleMimeType((java.lang.String) com.google.common.base.MoreObjects.firstNonNull(subtitleConfiguration.mimeType, androidx.media3.common.MimeTypes.TEXT_UNKNOWN)).setLanguage(subtitleConfiguration.language).setSelectionFlags(subtitleConfiguration.selectionFlags).setRoleFlags(subtitleConfiguration.roleFlags).setLabel(subtitleConfiguration.label).setId(subtitleConfiguration.id != null ? subtitleConfiguration.id : str).build();
        this.dataSpec = new androidx.media3.datasource.DataSpec.Builder().setUri(subtitleConfiguration.uri).setFlags(1).build();
        this.timeline = new androidx.media3.exoplayer.source.SinglePeriodTimeline(j, true, false, false, (java.lang.Object) null, mediaItemBuild);
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public androidx.media3.common.MediaItem getMediaItem() {
        return this.mediaItem;
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    protected void prepareSourceInternal(androidx.media3.datasource.TransferListener transferListener) {
        this.transferListener = transferListener;
        refreshSourceInfo(this.timeline);
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public androidx.media3.exoplayer.source.MediaPeriod createPeriod(androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, androidx.media3.exoplayer.upstream.Allocator allocator, long j) {
        return new androidx.media3.exoplayer.source.SingleSampleMediaPeriod(this.dataSpec, this.dataSourceFactory, this.transferListener, this.format, this.durationUs, this.loadErrorHandlingPolicy, createEventDispatcher(mediaPeriodId), this.treatLoadErrorsAsEndOfStream);
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public void releasePeriod(androidx.media3.exoplayer.source.MediaPeriod mediaPeriod) {
        ((androidx.media3.exoplayer.source.SingleSampleMediaPeriod) mediaPeriod).release();
    }
}
