package androidx.media3.exoplayer;

/* JADX INFO: loaded from: classes.dex */
final class DefaultMediaClock implements androidx.media3.exoplayer.MediaClock {
    private boolean isUsingStandaloneClock = true;
    private final androidx.media3.exoplayer.DefaultMediaClock.PlaybackParametersListener listener;
    private androidx.media3.exoplayer.MediaClock rendererClock;
    private androidx.media3.exoplayer.Renderer rendererClockSource;
    private final androidx.media3.exoplayer.StandaloneMediaClock standaloneClock;
    private boolean standaloneClockIsStarted;

    public interface PlaybackParametersListener {
        void onPlaybackParametersChanged(androidx.media3.common.PlaybackParameters playbackParameters);
    }

    public DefaultMediaClock(androidx.media3.exoplayer.DefaultMediaClock.PlaybackParametersListener playbackParametersListener, androidx.media3.common.util.Clock clock) {
        this.listener = playbackParametersListener;
        this.standaloneClock = new androidx.media3.exoplayer.StandaloneMediaClock(clock);
    }

    public void start() {
        this.standaloneClockIsStarted = true;
        this.standaloneClock.start();
    }

    public void stop() {
        this.standaloneClockIsStarted = false;
        this.standaloneClock.stop();
    }

    public void resetPosition(long j) {
        this.standaloneClock.resetPosition(j);
    }

    public void onRendererEnabled(androidx.media3.exoplayer.Renderer renderer) throws androidx.media3.exoplayer.ExoPlaybackException {
        androidx.media3.exoplayer.MediaClock mediaClock;
        androidx.media3.exoplayer.MediaClock mediaClock2 = renderer.getMediaClock();
        if (mediaClock2 == null || mediaClock2 == (mediaClock = this.rendererClock)) {
            return;
        }
        if (mediaClock != null) {
            throw androidx.media3.exoplayer.ExoPlaybackException.createForUnexpected(new java.lang.IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
        this.rendererClock = mediaClock2;
        this.rendererClockSource = renderer;
        mediaClock2.setPlaybackParameters(this.standaloneClock.getPlaybackParameters());
    }

    public void onRendererDisabled(androidx.media3.exoplayer.Renderer renderer) {
        if (renderer == this.rendererClockSource) {
            this.rendererClock = null;
            this.rendererClockSource = null;
            this.isUsingStandaloneClock = true;
        }
    }

    public long syncAndGetPositionUs(boolean z) {
        syncClocks(z);
        return getPositionUs();
    }

    @Override // androidx.media3.exoplayer.MediaClock
    public long getPositionUs() {
        if (this.isUsingStandaloneClock) {
            return this.standaloneClock.getPositionUs();
        }
        return ((androidx.media3.exoplayer.MediaClock) androidx.media3.common.util.Assertions.checkNotNull(this.rendererClock)).getPositionUs();
    }

    @Override // androidx.media3.exoplayer.MediaClock
    public boolean hasSkippedSilenceSinceLastCall() {
        if (this.isUsingStandaloneClock) {
            return this.standaloneClock.hasSkippedSilenceSinceLastCall();
        }
        return ((androidx.media3.exoplayer.MediaClock) androidx.media3.common.util.Assertions.checkNotNull(this.rendererClock)).hasSkippedSilenceSinceLastCall();
    }

    @Override // androidx.media3.exoplayer.MediaClock
    public void setPlaybackParameters(androidx.media3.common.PlaybackParameters playbackParameters) {
        androidx.media3.exoplayer.MediaClock mediaClock = this.rendererClock;
        if (mediaClock != null) {
            mediaClock.setPlaybackParameters(playbackParameters);
            playbackParameters = this.rendererClock.getPlaybackParameters();
        }
        this.standaloneClock.setPlaybackParameters(playbackParameters);
    }

    @Override // androidx.media3.exoplayer.MediaClock
    public androidx.media3.common.PlaybackParameters getPlaybackParameters() {
        androidx.media3.exoplayer.MediaClock mediaClock = this.rendererClock;
        if (mediaClock != null) {
            return mediaClock.getPlaybackParameters();
        }
        return this.standaloneClock.getPlaybackParameters();
    }

    private void syncClocks(boolean z) {
        if (shouldUseStandaloneClock(z)) {
            this.isUsingStandaloneClock = true;
            if (this.standaloneClockIsStarted) {
                this.standaloneClock.start();
                return;
            }
            return;
        }
        androidx.media3.exoplayer.MediaClock mediaClock = (androidx.media3.exoplayer.MediaClock) androidx.media3.common.util.Assertions.checkNotNull(this.rendererClock);
        long positionUs = mediaClock.getPositionUs();
        if (this.isUsingStandaloneClock) {
            if (positionUs < this.standaloneClock.getPositionUs()) {
                this.standaloneClock.stop();
                return;
            } else {
                this.isUsingStandaloneClock = false;
                if (this.standaloneClockIsStarted) {
                    this.standaloneClock.start();
                }
            }
        }
        this.standaloneClock.resetPosition(positionUs);
        androidx.media3.common.PlaybackParameters playbackParameters = mediaClock.getPlaybackParameters();
        if (playbackParameters.equals(this.standaloneClock.getPlaybackParameters())) {
            return;
        }
        this.standaloneClock.setPlaybackParameters(playbackParameters);
        this.listener.onPlaybackParametersChanged(playbackParameters);
    }

    private boolean shouldUseStandaloneClock(boolean z) {
        androidx.media3.exoplayer.Renderer renderer = this.rendererClockSource;
        return renderer == null || renderer.isEnded() || (z && this.rendererClockSource.getState() != 2) || (!this.rendererClockSource.isReady() && (z || this.rendererClockSource.hasReadStreamToEnd()));
    }
}
