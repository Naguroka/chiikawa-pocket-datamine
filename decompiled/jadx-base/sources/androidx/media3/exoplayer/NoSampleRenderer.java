package androidx.media3.exoplayer;

/* JADX INFO: loaded from: classes.dex */
public abstract class NoSampleRenderer implements androidx.media3.exoplayer.Renderer, androidx.media3.exoplayer.RendererCapabilities {
    private androidx.media3.exoplayer.RendererConfiguration configuration;
    private int index;
    private int state;
    private androidx.media3.exoplayer.source.SampleStream stream;
    private boolean streamIsFinal;

    @Override // androidx.media3.exoplayer.Renderer
    public final androidx.media3.exoplayer.RendererCapabilities getCapabilities() {
        return this;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public androidx.media3.exoplayer.MediaClock getMediaClock() {
        return null;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public long getReadingPositionUs() {
        return Long.MIN_VALUE;
    }

    @Override // androidx.media3.exoplayer.Renderer, androidx.media3.exoplayer.RendererCapabilities
    public final int getTrackType() {
        return -2;
    }

    @Override // androidx.media3.exoplayer.PlayerMessage.Target
    public void handleMessage(int i, java.lang.Object obj) throws androidx.media3.exoplayer.ExoPlaybackException {
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final boolean hasReadStreamToEnd() {
        return true;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public boolean isEnded() {
        return true;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public boolean isReady() {
        return true;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void maybeThrowStreamError() throws java.io.IOException {
    }

    protected void onDisabled() {
    }

    protected void onEnabled(boolean z) throws androidx.media3.exoplayer.ExoPlaybackException {
    }

    protected void onPositionReset(long j, boolean z) throws androidx.media3.exoplayer.ExoPlaybackException {
    }

    protected void onRendererOffsetChanged(long j) throws androidx.media3.exoplayer.ExoPlaybackException {
    }

    protected void onReset() {
    }

    protected void onStarted() throws androidx.media3.exoplayer.ExoPlaybackException {
    }

    protected void onStopped() {
    }

    @Override // androidx.media3.exoplayer.Renderer
    public void setTimeline(androidx.media3.common.Timeline timeline) {
    }

    @Override // androidx.media3.exoplayer.RendererCapabilities
    public int supportsMixedMimeTypeAdaptation() throws androidx.media3.exoplayer.ExoPlaybackException {
        return 0;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void init(int i, androidx.media3.exoplayer.analytics.PlayerId playerId, androidx.media3.common.util.Clock clock) {
        this.index = i;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final int getState() {
        return this.state;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void enable(androidx.media3.exoplayer.RendererConfiguration rendererConfiguration, androidx.media3.common.Format[] formatArr, androidx.media3.exoplayer.source.SampleStream sampleStream, long j, boolean z, boolean z2, long j2, long j3, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) throws androidx.media3.exoplayer.ExoPlaybackException {
        androidx.media3.common.util.Assertions.checkState(this.state == 0);
        this.configuration = rendererConfiguration;
        this.state = 1;
        onEnabled(z);
        replaceStream(formatArr, sampleStream, j2, j3, mediaPeriodId);
        onPositionReset(j, z);
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void start() throws androidx.media3.exoplayer.ExoPlaybackException {
        androidx.media3.common.util.Assertions.checkState(this.state == 1);
        this.state = 2;
        onStarted();
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void replaceStream(androidx.media3.common.Format[] formatArr, androidx.media3.exoplayer.source.SampleStream sampleStream, long j, long j2, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) throws androidx.media3.exoplayer.ExoPlaybackException {
        androidx.media3.common.util.Assertions.checkState(!this.streamIsFinal);
        this.stream = sampleStream;
        onRendererOffsetChanged(j2);
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final androidx.media3.exoplayer.source.SampleStream getStream() {
        return this.stream;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void setCurrentStreamFinal() {
        this.streamIsFinal = true;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final boolean isCurrentStreamFinal() {
        return this.streamIsFinal;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void resetPosition(long j) throws androidx.media3.exoplayer.ExoPlaybackException {
        this.streamIsFinal = false;
        onPositionReset(j, false);
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void stop() {
        androidx.media3.common.util.Assertions.checkState(this.state == 2);
        this.state = 1;
        onStopped();
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void disable() {
        androidx.media3.common.util.Assertions.checkState(this.state == 1);
        this.state = 0;
        this.stream = null;
        this.streamIsFinal = false;
        onDisabled();
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void reset() {
        androidx.media3.common.util.Assertions.checkState(this.state == 0);
        onReset();
    }

    @Override // androidx.media3.exoplayer.RendererCapabilities
    public int supportsFormat(androidx.media3.common.Format format) throws androidx.media3.exoplayer.ExoPlaybackException {
        return androidx.media3.exoplayer.RendererCapabilities.create(0);
    }

    protected final androidx.media3.exoplayer.RendererConfiguration getConfiguration() {
        return this.configuration;
    }

    protected final int getIndex() {
        return this.index;
    }
}
