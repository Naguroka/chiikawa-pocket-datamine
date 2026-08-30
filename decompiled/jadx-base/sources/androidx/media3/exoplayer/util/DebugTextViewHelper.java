package androidx.media3.exoplayer.util;

/* JADX INFO: loaded from: classes.dex */
public class DebugTextViewHelper {
    private static final int REFRESH_INTERVAL_MS = 1000;
    private final androidx.media3.exoplayer.ExoPlayer player;
    private boolean started;
    private final android.widget.TextView textView;
    private final androidx.media3.exoplayer.util.DebugTextViewHelper.Updater updater;

    public DebugTextViewHelper(androidx.media3.exoplayer.ExoPlayer exoPlayer, android.widget.TextView textView) {
        androidx.media3.common.util.Assertions.checkArgument(exoPlayer.getApplicationLooper() == android.os.Looper.getMainLooper());
        this.player = exoPlayer;
        this.textView = textView;
        this.updater = new androidx.media3.exoplayer.util.DebugTextViewHelper.Updater();
    }

    public final void start() {
        if (this.started) {
            return;
        }
        this.started = true;
        this.player.addListener(this.updater);
        updateAndPost();
    }

    public final void stop() {
        if (this.started) {
            this.started = false;
            this.player.removeListener(this.updater);
            this.textView.removeCallbacks(this.updater);
        }
    }

    protected final void updateAndPost() {
        this.textView.setText(getDebugString());
        this.textView.removeCallbacks(this.updater);
        this.textView.postDelayed(this.updater, 1000L);
    }

    protected java.lang.String getDebugString() {
        return getPlayerStateString() + getVideoString() + getAudioString();
    }

    protected java.lang.String getPlayerStateString() {
        java.lang.String str;
        int playbackState = this.player.getPlaybackState();
        if (playbackState == 1) {
            str = "idle";
        } else if (playbackState == 2) {
            str = "buffering";
        } else if (playbackState != 3) {
            str = playbackState != 4 ? "unknown" : com.ironsource.y8.h.g0;
        } else {
            str = com.ironsource.y8.h.s;
        }
        return java.lang.String.format("playWhenReady:%s playbackState:%s item:%s", java.lang.Boolean.valueOf(this.player.getPlayWhenReady()), str, java.lang.Integer.valueOf(this.player.getCurrentMediaItemIndex()));
    }

    protected java.lang.String getVideoString() {
        androidx.media3.common.Format videoFormat = this.player.getVideoFormat();
        androidx.media3.common.VideoSize videoSize = this.player.getVideoSize();
        androidx.media3.exoplayer.DecoderCounters videoDecoderCounters = this.player.getVideoDecoderCounters();
        return (videoFormat == null || videoDecoderCounters == null) ? "" : "\n" + videoFormat.sampleMimeType + "(id:" + videoFormat.id + " r:" + videoSize.width + "x" + videoSize.height + getColorInfoString(videoFormat.colorInfo) + getPixelAspectRatioString(videoSize.pixelWidthHeightRatio) + getDecoderCountersBufferCountString(videoDecoderCounters) + " vfpo: " + getVideoFrameProcessingOffsetAverageString(videoDecoderCounters.totalVideoFrameProcessingOffsetUs, videoDecoderCounters.videoFrameProcessingOffsetCount) + ")";
    }

    protected java.lang.String getAudioString() {
        androidx.media3.common.Format audioFormat = this.player.getAudioFormat();
        androidx.media3.exoplayer.DecoderCounters audioDecoderCounters = this.player.getAudioDecoderCounters();
        return (audioFormat == null || audioDecoderCounters == null) ? "" : "\n" + audioFormat.sampleMimeType + "(id:" + audioFormat.id + " hz:" + audioFormat.sampleRate + " ch:" + audioFormat.channelCount + getDecoderCountersBufferCountString(audioDecoderCounters) + ")";
    }

    private static java.lang.String getDecoderCountersBufferCountString(androidx.media3.exoplayer.DecoderCounters decoderCounters) {
        if (decoderCounters == null) {
            return "";
        }
        decoderCounters.ensureUpdated();
        return " sib:" + decoderCounters.skippedInputBufferCount + " sb:" + decoderCounters.skippedOutputBufferCount + " rb:" + decoderCounters.renderedOutputBufferCount + " db:" + decoderCounters.droppedBufferCount + " mcdb:" + decoderCounters.maxConsecutiveDroppedBufferCount + " dk:" + decoderCounters.droppedToKeyframeCount;
    }

    private static java.lang.String getColorInfoString(androidx.media3.common.ColorInfo colorInfo) {
        return (colorInfo == null || !colorInfo.isValid()) ? "" : " colr:" + colorInfo.toLogString();
    }

    private static java.lang.String getPixelAspectRatioString(float f) {
        return (f == -1.0f || f == 1.0f) ? "" : " par:" + java.lang.String.format(java.util.Locale.US, "%.02f", java.lang.Float.valueOf(f));
    }

    private static java.lang.String getVideoFrameProcessingOffsetAverageString(long j, int i) {
        return i == 0 ? "N/A" : java.lang.String.valueOf((long) (j / ((double) i)));
    }

    private final class Updater implements androidx.media3.common.Player.Listener, java.lang.Runnable {
        private Updater() {
        }

        @Override // androidx.media3.common.Player.Listener
        public void onPlaybackStateChanged(int i) {
            androidx.media3.exoplayer.util.DebugTextViewHelper.this.updateAndPost();
        }

        @Override // androidx.media3.common.Player.Listener
        public void onPlayWhenReadyChanged(boolean z, int i) {
            androidx.media3.exoplayer.util.DebugTextViewHelper.this.updateAndPost();
        }

        @Override // androidx.media3.common.Player.Listener
        public void onPositionDiscontinuity(androidx.media3.common.Player.PositionInfo positionInfo, androidx.media3.common.Player.PositionInfo positionInfo2, int i) {
            androidx.media3.exoplayer.util.DebugTextViewHelper.this.updateAndPost();
        }

        @Override // java.lang.Runnable
        public void run() {
            androidx.media3.exoplayer.util.DebugTextViewHelper.this.updateAndPost();
        }
    }
}
