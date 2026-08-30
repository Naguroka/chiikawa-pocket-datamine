package androidx.media3.exoplayer;

/* JADX INFO: loaded from: classes.dex */
public interface MediaClock {
    androidx.media3.common.PlaybackParameters getPlaybackParameters();

    long getPositionUs();

    default boolean hasSkippedSilenceSinceLastCall() {
        return false;
    }

    void setPlaybackParameters(androidx.media3.common.PlaybackParameters playbackParameters);
}
