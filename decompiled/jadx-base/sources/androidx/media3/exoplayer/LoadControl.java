package androidx.media3.exoplayer;

/* JADX INFO: loaded from: classes.dex */
public interface LoadControl {

    @java.lang.Deprecated
    public static final androidx.media3.exoplayer.source.MediaSource.MediaPeriodId EMPTY_MEDIA_PERIOD_ID = new androidx.media3.exoplayer.source.MediaSource.MediaPeriodId(new java.lang.Object());

    androidx.media3.exoplayer.upstream.Allocator getAllocator();

    public static final class Parameters {
        public final long bufferedDurationUs;
        public final androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId;
        public final boolean playWhenReady;
        public final long playbackPositionUs;
        public final float playbackSpeed;
        public final androidx.media3.exoplayer.analytics.PlayerId playerId;
        public final boolean rebuffering;
        public final long targetLiveOffsetUs;
        public final androidx.media3.common.Timeline timeline;

        public Parameters(androidx.media3.exoplayer.analytics.PlayerId playerId, androidx.media3.common.Timeline timeline, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, long j, long j2, float f, boolean z, boolean z2, long j3) {
            this.playerId = playerId;
            this.timeline = timeline;
            this.mediaPeriodId = mediaPeriodId;
            this.playbackPositionUs = j;
            this.bufferedDurationUs = j2;
            this.playbackSpeed = f;
            this.playWhenReady = z;
            this.rebuffering = z2;
            this.targetLiveOffsetUs = j3;
        }
    }

    default void onPrepared(androidx.media3.exoplayer.analytics.PlayerId playerId) {
        onPrepared();
    }

    @java.lang.Deprecated
    default void onPrepared() {
        throw new java.lang.IllegalStateException("onPrepared not implemented");
    }

    default void onTracksSelected(androidx.media3.exoplayer.analytics.PlayerId playerId, androidx.media3.common.Timeline timeline, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, androidx.media3.exoplayer.Renderer[] rendererArr, androidx.media3.exoplayer.source.TrackGroupArray trackGroupArray, androidx.media3.exoplayer.trackselection.ExoTrackSelection[] exoTrackSelectionArr) {
        onTracksSelected(timeline, mediaPeriodId, rendererArr, trackGroupArray, exoTrackSelectionArr);
    }

    @java.lang.Deprecated
    default void onTracksSelected(androidx.media3.common.Timeline timeline, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, androidx.media3.exoplayer.Renderer[] rendererArr, androidx.media3.exoplayer.source.TrackGroupArray trackGroupArray, androidx.media3.exoplayer.trackselection.ExoTrackSelection[] exoTrackSelectionArr) {
        onTracksSelected(rendererArr, trackGroupArray, exoTrackSelectionArr);
    }

    @java.lang.Deprecated
    default void onTracksSelected(androidx.media3.exoplayer.Renderer[] rendererArr, androidx.media3.exoplayer.source.TrackGroupArray trackGroupArray, androidx.media3.exoplayer.trackselection.ExoTrackSelection[] exoTrackSelectionArr) {
        throw new java.lang.IllegalStateException("onTracksSelected not implemented");
    }

    default void onStopped(androidx.media3.exoplayer.analytics.PlayerId playerId) {
        onStopped();
    }

    @java.lang.Deprecated
    default void onStopped() {
        throw new java.lang.IllegalStateException("onStopped not implemented");
    }

    default void onReleased(androidx.media3.exoplayer.analytics.PlayerId playerId) {
        onReleased();
    }

    @java.lang.Deprecated
    default void onReleased() {
        throw new java.lang.IllegalStateException("onReleased not implemented");
    }

    default long getBackBufferDurationUs(androidx.media3.exoplayer.analytics.PlayerId playerId) {
        return getBackBufferDurationUs();
    }

    @java.lang.Deprecated
    default long getBackBufferDurationUs() {
        throw new java.lang.IllegalStateException("getBackBufferDurationUs not implemented");
    }

    default boolean retainBackBufferFromKeyframe(androidx.media3.exoplayer.analytics.PlayerId playerId) {
        return retainBackBufferFromKeyframe();
    }

    @java.lang.Deprecated
    default boolean retainBackBufferFromKeyframe() {
        throw new java.lang.IllegalStateException("retainBackBufferFromKeyframe not implemented");
    }

    default boolean shouldContinueLoading(androidx.media3.exoplayer.LoadControl.Parameters parameters) {
        return shouldContinueLoading(parameters.playbackPositionUs, parameters.bufferedDurationUs, parameters.playbackSpeed);
    }

    @java.lang.Deprecated
    default boolean shouldContinueLoading(long j, long j2, float f) {
        throw new java.lang.IllegalStateException("shouldContinueLoading not implemented");
    }

    default boolean shouldStartPlayback(androidx.media3.exoplayer.LoadControl.Parameters parameters) {
        return shouldStartPlayback(parameters.timeline, parameters.mediaPeriodId, parameters.bufferedDurationUs, parameters.playbackSpeed, parameters.rebuffering, parameters.targetLiveOffsetUs);
    }

    @java.lang.Deprecated
    default boolean shouldStartPlayback(androidx.media3.common.Timeline timeline, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, long j, float f, boolean z, long j2) {
        return shouldStartPlayback(j, f, z, j2);
    }

    @java.lang.Deprecated
    default boolean shouldStartPlayback(long j, float f, boolean z, long j2) {
        throw new java.lang.IllegalStateException("shouldStartPlayback not implemented");
    }
}
