package androidx.media3.exoplayer.analytics;

/* JADX INFO: loaded from: classes.dex */
public interface AnalyticsCollector extends androidx.media3.common.Player.Listener, androidx.media3.exoplayer.source.MediaSourceEventListener, androidx.media3.exoplayer.upstream.BandwidthMeter.EventListener, androidx.media3.exoplayer.drm.DrmSessionEventListener {
    void addListener(androidx.media3.exoplayer.analytics.AnalyticsListener analyticsListener);

    void notifySeekStarted();

    void onAudioCodecError(java.lang.Exception exc);

    void onAudioDecoderInitialized(java.lang.String str, long j, long j2);

    void onAudioDecoderReleased(java.lang.String str);

    void onAudioDisabled(androidx.media3.exoplayer.DecoderCounters decoderCounters);

    void onAudioEnabled(androidx.media3.exoplayer.DecoderCounters decoderCounters);

    void onAudioInputFormatChanged(androidx.media3.common.Format format, androidx.media3.exoplayer.DecoderReuseEvaluation decoderReuseEvaluation);

    void onAudioPositionAdvancing(long j);

    void onAudioSinkError(java.lang.Exception exc);

    void onAudioTrackInitialized(androidx.media3.exoplayer.audio.AudioSink.AudioTrackConfig audioTrackConfig);

    void onAudioTrackReleased(androidx.media3.exoplayer.audio.AudioSink.AudioTrackConfig audioTrackConfig);

    void onAudioUnderrun(int i, long j, long j2);

    void onDroppedFrames(int i, long j);

    void onRenderedFirstFrame(java.lang.Object obj, long j);

    void onVideoCodecError(java.lang.Exception exc);

    void onVideoDecoderInitialized(java.lang.String str, long j, long j2);

    void onVideoDecoderReleased(java.lang.String str);

    void onVideoDisabled(androidx.media3.exoplayer.DecoderCounters decoderCounters);

    void onVideoEnabled(androidx.media3.exoplayer.DecoderCounters decoderCounters);

    void onVideoFrameProcessingOffset(long j, int i);

    void onVideoInputFormatChanged(androidx.media3.common.Format format, androidx.media3.exoplayer.DecoderReuseEvaluation decoderReuseEvaluation);

    void release();

    void removeListener(androidx.media3.exoplayer.analytics.AnalyticsListener analyticsListener);

    void setPlayer(androidx.media3.common.Player player, android.os.Looper looper);

    void updateMediaPeriodQueueInfo(java.util.List<androidx.media3.exoplayer.source.MediaSource.MediaPeriodId> list, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId);
}
