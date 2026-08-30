package androidx.media3.exoplayer;

/* JADX INFO: loaded from: classes.dex */
final class PlaybackInfo {
    private static final androidx.media3.exoplayer.source.MediaSource.MediaPeriodId PLACEHOLDER_MEDIA_PERIOD_ID = new androidx.media3.exoplayer.source.MediaSource.MediaPeriodId(new java.lang.Object());
    public volatile long bufferedPositionUs;
    public final long discontinuityStartPositionUs;
    public final boolean isLoading;
    public final androidx.media3.exoplayer.source.MediaSource.MediaPeriodId loadingMediaPeriodId;
    public final androidx.media3.exoplayer.source.MediaSource.MediaPeriodId periodId;
    public final boolean playWhenReady;
    public final int playWhenReadyChangeReason;
    public final androidx.media3.exoplayer.ExoPlaybackException playbackError;
    public final androidx.media3.common.PlaybackParameters playbackParameters;
    public final int playbackState;
    public final int playbackSuppressionReason;
    public volatile long positionUpdateTimeMs;
    public volatile long positionUs;
    public final long requestedContentPositionUs;
    public final boolean sleepingForOffload;
    public final java.util.List<androidx.media3.common.Metadata> staticMetadata;
    public final androidx.media3.common.Timeline timeline;
    public volatile long totalBufferedDurationUs;
    public final androidx.media3.exoplayer.source.TrackGroupArray trackGroups;
    public final androidx.media3.exoplayer.trackselection.TrackSelectorResult trackSelectorResult;

    public static androidx.media3.exoplayer.PlaybackInfo createDummy(androidx.media3.exoplayer.trackselection.TrackSelectorResult trackSelectorResult) {
        androidx.media3.common.Timeline timeline = androidx.media3.common.Timeline.EMPTY;
        androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId = PLACEHOLDER_MEDIA_PERIOD_ID;
        return new androidx.media3.exoplayer.PlaybackInfo(timeline, mediaPeriodId, androidx.media3.common.C.TIME_UNSET, 0L, 1, null, false, androidx.media3.exoplayer.source.TrackGroupArray.EMPTY, trackSelectorResult, com.google.common.collect.ImmutableList.of(), mediaPeriodId, false, 1, 0, androidx.media3.common.PlaybackParameters.DEFAULT, 0L, 0L, 0L, 0L, false);
    }

    public PlaybackInfo(androidx.media3.common.Timeline timeline, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, long j, long j2, int i, androidx.media3.exoplayer.ExoPlaybackException exoPlaybackException, boolean z, androidx.media3.exoplayer.source.TrackGroupArray trackGroupArray, androidx.media3.exoplayer.trackselection.TrackSelectorResult trackSelectorResult, java.util.List<androidx.media3.common.Metadata> list, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId2, boolean z2, int i2, int i3, androidx.media3.common.PlaybackParameters playbackParameters, long j3, long j4, long j5, long j6, boolean z3) {
        this.timeline = timeline;
        this.periodId = mediaPeriodId;
        this.requestedContentPositionUs = j;
        this.discontinuityStartPositionUs = j2;
        this.playbackState = i;
        this.playbackError = exoPlaybackException;
        this.isLoading = z;
        this.trackGroups = trackGroupArray;
        this.trackSelectorResult = trackSelectorResult;
        this.staticMetadata = list;
        this.loadingMediaPeriodId = mediaPeriodId2;
        this.playWhenReady = z2;
        this.playWhenReadyChangeReason = i2;
        this.playbackSuppressionReason = i3;
        this.playbackParameters = playbackParameters;
        this.bufferedPositionUs = j3;
        this.totalBufferedDurationUs = j4;
        this.positionUs = j5;
        this.positionUpdateTimeMs = j6;
        this.sleepingForOffload = z3;
    }

    public static androidx.media3.exoplayer.source.MediaSource.MediaPeriodId getDummyPeriodForEmptyTimeline() {
        return PLACEHOLDER_MEDIA_PERIOD_ID;
    }

    public androidx.media3.exoplayer.PlaybackInfo copyWithNewPosition(androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, long j, long j2, long j3, long j4, androidx.media3.exoplayer.source.TrackGroupArray trackGroupArray, androidx.media3.exoplayer.trackselection.TrackSelectorResult trackSelectorResult, java.util.List<androidx.media3.common.Metadata> list) {
        return new androidx.media3.exoplayer.PlaybackInfo(this.timeline, mediaPeriodId, j2, j3, this.playbackState, this.playbackError, this.isLoading, trackGroupArray, trackSelectorResult, list, this.loadingMediaPeriodId, this.playWhenReady, this.playWhenReadyChangeReason, this.playbackSuppressionReason, this.playbackParameters, this.bufferedPositionUs, j4, j, android.os.SystemClock.elapsedRealtime(), this.sleepingForOffload);
    }

    public androidx.media3.exoplayer.PlaybackInfo copyWithTimeline(androidx.media3.common.Timeline timeline) {
        return new androidx.media3.exoplayer.PlaybackInfo(timeline, this.periodId, this.requestedContentPositionUs, this.discontinuityStartPositionUs, this.playbackState, this.playbackError, this.isLoading, this.trackGroups, this.trackSelectorResult, this.staticMetadata, this.loadingMediaPeriodId, this.playWhenReady, this.playWhenReadyChangeReason, this.playbackSuppressionReason, this.playbackParameters, this.bufferedPositionUs, this.totalBufferedDurationUs, this.positionUs, this.positionUpdateTimeMs, this.sleepingForOffload);
    }

    public androidx.media3.exoplayer.PlaybackInfo copyWithPlaybackState(int i) {
        return new androidx.media3.exoplayer.PlaybackInfo(this.timeline, this.periodId, this.requestedContentPositionUs, this.discontinuityStartPositionUs, i, this.playbackError, this.isLoading, this.trackGroups, this.trackSelectorResult, this.staticMetadata, this.loadingMediaPeriodId, this.playWhenReady, this.playWhenReadyChangeReason, this.playbackSuppressionReason, this.playbackParameters, this.bufferedPositionUs, this.totalBufferedDurationUs, this.positionUs, this.positionUpdateTimeMs, this.sleepingForOffload);
    }

    public androidx.media3.exoplayer.PlaybackInfo copyWithPlaybackError(androidx.media3.exoplayer.ExoPlaybackException exoPlaybackException) {
        return new androidx.media3.exoplayer.PlaybackInfo(this.timeline, this.periodId, this.requestedContentPositionUs, this.discontinuityStartPositionUs, this.playbackState, exoPlaybackException, this.isLoading, this.trackGroups, this.trackSelectorResult, this.staticMetadata, this.loadingMediaPeriodId, this.playWhenReady, this.playWhenReadyChangeReason, this.playbackSuppressionReason, this.playbackParameters, this.bufferedPositionUs, this.totalBufferedDurationUs, this.positionUs, this.positionUpdateTimeMs, this.sleepingForOffload);
    }

    public androidx.media3.exoplayer.PlaybackInfo copyWithIsLoading(boolean z) {
        return new androidx.media3.exoplayer.PlaybackInfo(this.timeline, this.periodId, this.requestedContentPositionUs, this.discontinuityStartPositionUs, this.playbackState, this.playbackError, z, this.trackGroups, this.trackSelectorResult, this.staticMetadata, this.loadingMediaPeriodId, this.playWhenReady, this.playWhenReadyChangeReason, this.playbackSuppressionReason, this.playbackParameters, this.bufferedPositionUs, this.totalBufferedDurationUs, this.positionUs, this.positionUpdateTimeMs, this.sleepingForOffload);
    }

    public androidx.media3.exoplayer.PlaybackInfo copyWithLoadingMediaPeriodId(androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) {
        return new androidx.media3.exoplayer.PlaybackInfo(this.timeline, this.periodId, this.requestedContentPositionUs, this.discontinuityStartPositionUs, this.playbackState, this.playbackError, this.isLoading, this.trackGroups, this.trackSelectorResult, this.staticMetadata, mediaPeriodId, this.playWhenReady, this.playWhenReadyChangeReason, this.playbackSuppressionReason, this.playbackParameters, this.bufferedPositionUs, this.totalBufferedDurationUs, this.positionUs, this.positionUpdateTimeMs, this.sleepingForOffload);
    }

    public androidx.media3.exoplayer.PlaybackInfo copyWithPlayWhenReady(boolean z, int i, int i2) {
        return new androidx.media3.exoplayer.PlaybackInfo(this.timeline, this.periodId, this.requestedContentPositionUs, this.discontinuityStartPositionUs, this.playbackState, this.playbackError, this.isLoading, this.trackGroups, this.trackSelectorResult, this.staticMetadata, this.loadingMediaPeriodId, z, i, i2, this.playbackParameters, this.bufferedPositionUs, this.totalBufferedDurationUs, this.positionUs, this.positionUpdateTimeMs, this.sleepingForOffload);
    }

    public androidx.media3.exoplayer.PlaybackInfo copyWithPlaybackParameters(androidx.media3.common.PlaybackParameters playbackParameters) {
        return new androidx.media3.exoplayer.PlaybackInfo(this.timeline, this.periodId, this.requestedContentPositionUs, this.discontinuityStartPositionUs, this.playbackState, this.playbackError, this.isLoading, this.trackGroups, this.trackSelectorResult, this.staticMetadata, this.loadingMediaPeriodId, this.playWhenReady, this.playWhenReadyChangeReason, this.playbackSuppressionReason, playbackParameters, this.bufferedPositionUs, this.totalBufferedDurationUs, this.positionUs, this.positionUpdateTimeMs, this.sleepingForOffload);
    }

    public androidx.media3.exoplayer.PlaybackInfo copyWithSleepingForOffload(boolean z) {
        return new androidx.media3.exoplayer.PlaybackInfo(this.timeline, this.periodId, this.requestedContentPositionUs, this.discontinuityStartPositionUs, this.playbackState, this.playbackError, this.isLoading, this.trackGroups, this.trackSelectorResult, this.staticMetadata, this.loadingMediaPeriodId, this.playWhenReady, this.playWhenReadyChangeReason, this.playbackSuppressionReason, this.playbackParameters, this.bufferedPositionUs, this.totalBufferedDurationUs, this.positionUs, this.positionUpdateTimeMs, z);
    }

    public androidx.media3.exoplayer.PlaybackInfo copyWithEstimatedPosition() {
        return new androidx.media3.exoplayer.PlaybackInfo(this.timeline, this.periodId, this.requestedContentPositionUs, this.discontinuityStartPositionUs, this.playbackState, this.playbackError, this.isLoading, this.trackGroups, this.trackSelectorResult, this.staticMetadata, this.loadingMediaPeriodId, this.playWhenReady, this.playWhenReadyChangeReason, this.playbackSuppressionReason, this.playbackParameters, this.bufferedPositionUs, this.totalBufferedDurationUs, getEstimatedPositionUs(), android.os.SystemClock.elapsedRealtime(), this.sleepingForOffload);
    }

    public void updatePositionUs(long j) {
        this.positionUs = j;
        this.positionUpdateTimeMs = android.os.SystemClock.elapsedRealtime();
    }

    public long getEstimatedPositionUs() {
        long j;
        long j2;
        if (!isPlaying()) {
            return this.positionUs;
        }
        do {
            j = this.positionUpdateTimeMs;
            j2 = this.positionUs;
        } while (j != this.positionUpdateTimeMs);
        return androidx.media3.common.util.Util.msToUs(androidx.media3.common.util.Util.usToMs(j2) + ((long) ((android.os.SystemClock.elapsedRealtime() - j) * this.playbackParameters.speed)));
    }

    public boolean isPlaying() {
        return this.playbackState == 3 && this.playWhenReady && this.playbackSuppressionReason == 0;
    }
}
