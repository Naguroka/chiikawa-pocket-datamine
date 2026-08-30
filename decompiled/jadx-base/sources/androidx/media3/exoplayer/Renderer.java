package androidx.media3.exoplayer;

/* JADX INFO: loaded from: classes.dex */
public interface Renderer extends androidx.media3.exoplayer.PlayerMessage.Target {
    public static final long DEFAULT_DURATION_TO_PROGRESS_US = 10000;
    public static final int MSG_CUSTOM_BASE = 10000;
    public static final int MSG_SET_AUDIO_ATTRIBUTES = 3;
    public static final int MSG_SET_AUDIO_SESSION_ID = 10;
    public static final int MSG_SET_AUX_EFFECT_INFO = 6;
    public static final int MSG_SET_CAMERA_MOTION_LISTENER = 8;
    public static final int MSG_SET_CHANGE_FRAME_RATE_STRATEGY = 5;
    public static final int MSG_SET_IMAGE_OUTPUT = 15;
    public static final int MSG_SET_PREFERRED_AUDIO_DEVICE = 12;
    public static final int MSG_SET_PRIORITY = 16;
    public static final int MSG_SET_SCALING_MODE = 4;
    public static final int MSG_SET_SKIP_SILENCE_ENABLED = 9;
    public static final int MSG_SET_VIDEO_EFFECTS = 13;
    public static final int MSG_SET_VIDEO_FRAME_METADATA_LISTENER = 7;
    public static final int MSG_SET_VIDEO_OUTPUT = 1;
    public static final int MSG_SET_VIDEO_OUTPUT_RESOLUTION = 14;
    public static final int MSG_SET_VOLUME = 2;
    public static final int MSG_SET_WAKEUP_LISTENER = 11;
    public static final int STATE_DISABLED = 0;
    public static final int STATE_ENABLED = 1;
    public static final int STATE_STARTED = 2;

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface MessageType {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface State {
    }

    public interface WakeupListener {
        void onSleep();

        void onWakeup();
    }

    void disable();

    void enable(androidx.media3.exoplayer.RendererConfiguration rendererConfiguration, androidx.media3.common.Format[] formatArr, androidx.media3.exoplayer.source.SampleStream sampleStream, long j, boolean z, boolean z2, long j2, long j3, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) throws androidx.media3.exoplayer.ExoPlaybackException;

    default void enableMayRenderStartOfStream() {
    }

    androidx.media3.exoplayer.RendererCapabilities getCapabilities();

    default long getDurationToProgressUs(long j, long j2) {
        return 10000L;
    }

    androidx.media3.exoplayer.MediaClock getMediaClock();

    java.lang.String getName();

    long getReadingPositionUs();

    int getState();

    androidx.media3.exoplayer.source.SampleStream getStream();

    int getTrackType();

    boolean hasReadStreamToEnd();

    void init(int i, androidx.media3.exoplayer.analytics.PlayerId playerId, androidx.media3.common.util.Clock clock);

    boolean isCurrentStreamFinal();

    boolean isEnded();

    boolean isReady();

    void maybeThrowStreamError() throws java.io.IOException;

    default void release() {
    }

    void render(long j, long j2) throws androidx.media3.exoplayer.ExoPlaybackException;

    void replaceStream(androidx.media3.common.Format[] formatArr, androidx.media3.exoplayer.source.SampleStream sampleStream, long j, long j2, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) throws androidx.media3.exoplayer.ExoPlaybackException;

    void reset();

    void resetPosition(long j) throws androidx.media3.exoplayer.ExoPlaybackException;

    void setCurrentStreamFinal();

    default void setPlaybackSpeed(float f, float f2) throws androidx.media3.exoplayer.ExoPlaybackException {
    }

    void setTimeline(androidx.media3.common.Timeline timeline);

    void start() throws androidx.media3.exoplayer.ExoPlaybackException;

    void stop();
}
