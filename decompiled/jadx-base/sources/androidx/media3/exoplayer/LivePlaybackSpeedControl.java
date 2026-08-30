package androidx.media3.exoplayer;

/* JADX INFO: loaded from: classes.dex */
public interface LivePlaybackSpeedControl {
    float getAdjustedPlaybackSpeed(long j, long j2);

    long getTargetLiveOffsetUs();

    void notifyRebuffer();

    void setLiveConfiguration(androidx.media3.common.MediaItem.LiveConfiguration liveConfiguration);

    void setTargetLiveOffsetOverrideUs(long j);
}
