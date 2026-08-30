package androidx.media3.exoplayer;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseRenderer implements androidx.media3.exoplayer.Renderer, androidx.media3.exoplayer.RendererCapabilities {
    private androidx.media3.common.util.Clock clock;
    private androidx.media3.exoplayer.RendererConfiguration configuration;
    private int index;
    private long lastResetPositionUs;
    private androidx.media3.exoplayer.analytics.PlayerId playerId;
    private androidx.media3.exoplayer.RendererCapabilities.Listener rendererCapabilitiesListener;
    private int state;
    private androidx.media3.exoplayer.source.SampleStream stream;
    private androidx.media3.common.Format[] streamFormats;
    private boolean streamIsFinal;
    private long streamOffsetUs;
    private boolean throwRendererExceptionIsExecuting;
    private final int trackType;
    private final java.lang.Object lock = new java.lang.Object();
    private final androidx.media3.exoplayer.FormatHolder formatHolder = new androidx.media3.exoplayer.FormatHolder();
    private long readingPositionUs = Long.MIN_VALUE;
    private androidx.media3.common.Timeline timeline = androidx.media3.common.Timeline.EMPTY;

    @Override // androidx.media3.exoplayer.Renderer
    public final androidx.media3.exoplayer.RendererCapabilities getCapabilities() {
        return this;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public androidx.media3.exoplayer.MediaClock getMediaClock() {
        return null;
    }

    @Override // androidx.media3.exoplayer.PlayerMessage.Target
    public void handleMessage(int i, java.lang.Object obj) throws androidx.media3.exoplayer.ExoPlaybackException {
    }

    protected void onDisabled() {
    }

    protected void onEnabled(boolean z, boolean z2) throws androidx.media3.exoplayer.ExoPlaybackException {
    }

    protected void onInit() {
    }

    protected void onPositionReset(long j, boolean z) throws androidx.media3.exoplayer.ExoPlaybackException {
    }

    protected void onRelease() {
    }

    protected void onReset() {
    }

    protected void onStarted() throws androidx.media3.exoplayer.ExoPlaybackException {
    }

    protected void onStopped() {
    }

    protected void onStreamChanged(androidx.media3.common.Format[] formatArr, long j, long j2, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) throws androidx.media3.exoplayer.ExoPlaybackException {
    }

    protected void onTimelineChanged(androidx.media3.common.Timeline timeline) {
    }

    @Override // androidx.media3.exoplayer.RendererCapabilities
    public int supportsMixedMimeTypeAdaptation() throws androidx.media3.exoplayer.ExoPlaybackException {
        return 0;
    }

    public BaseRenderer(int i) {
        this.trackType = i;
    }

    @Override // androidx.media3.exoplayer.Renderer, androidx.media3.exoplayer.RendererCapabilities
    public final int getTrackType() {
        return this.trackType;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void init(int i, androidx.media3.exoplayer.analytics.PlayerId playerId, androidx.media3.common.util.Clock clock) {
        this.index = i;
        this.playerId = playerId;
        this.clock = clock;
        onInit();
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
        onEnabled(z, z2);
        replaceStream(formatArr, sampleStream, j2, j3, mediaPeriodId);
        resetPosition(j2, z);
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
        if (this.readingPositionUs == Long.MIN_VALUE) {
            this.readingPositionUs = j;
        }
        this.streamFormats = formatArr;
        this.streamOffsetUs = j2;
        onStreamChanged(formatArr, j, j2, mediaPeriodId);
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final androidx.media3.exoplayer.source.SampleStream getStream() {
        return this.stream;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final boolean hasReadStreamToEnd() {
        return this.readingPositionUs == Long.MIN_VALUE;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final long getReadingPositionUs() {
        return this.readingPositionUs;
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
    public final void maybeThrowStreamError() throws java.io.IOException {
        ((androidx.media3.exoplayer.source.SampleStream) androidx.media3.common.util.Assertions.checkNotNull(this.stream)).maybeThrowError();
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void setTimeline(androidx.media3.common.Timeline timeline) {
        if (androidx.media3.common.util.Util.areEqual(this.timeline, timeline)) {
            return;
        }
        this.timeline = timeline;
        onTimelineChanged(timeline);
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void resetPosition(long j) throws androidx.media3.exoplayer.ExoPlaybackException {
        resetPosition(j, false);
    }

    private void resetPosition(long j, boolean z) throws androidx.media3.exoplayer.ExoPlaybackException {
        this.streamIsFinal = false;
        this.lastResetPositionUs = j;
        this.readingPositionUs = j;
        onPositionReset(j, z);
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
        this.formatHolder.clear();
        this.state = 0;
        this.stream = null;
        this.streamFormats = null;
        this.streamIsFinal = false;
        onDisabled();
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void reset() {
        androidx.media3.common.util.Assertions.checkState(this.state == 0);
        this.formatHolder.clear();
        onReset();
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void release() {
        androidx.media3.common.util.Assertions.checkState(this.state == 0);
        onRelease();
    }

    @Override // androidx.media3.exoplayer.RendererCapabilities
    public final void setListener(androidx.media3.exoplayer.RendererCapabilities.Listener listener) {
        synchronized (this.lock) {
            this.rendererCapabilitiesListener = listener;
        }
    }

    @Override // androidx.media3.exoplayer.RendererCapabilities
    public final void clearListener() {
        synchronized (this.lock) {
            this.rendererCapabilitiesListener = null;
        }
    }

    protected final long getLastResetPositionUs() {
        return this.lastResetPositionUs;
    }

    protected final androidx.media3.exoplayer.FormatHolder getFormatHolder() {
        this.formatHolder.clear();
        return this.formatHolder;
    }

    protected final androidx.media3.common.Format[] getStreamFormats() {
        return (androidx.media3.common.Format[]) androidx.media3.common.util.Assertions.checkNotNull(this.streamFormats);
    }

    protected final androidx.media3.exoplayer.RendererConfiguration getConfiguration() {
        return (androidx.media3.exoplayer.RendererConfiguration) androidx.media3.common.util.Assertions.checkNotNull(this.configuration);
    }

    protected final int getIndex() {
        return this.index;
    }

    protected final androidx.media3.exoplayer.analytics.PlayerId getPlayerId() {
        return (androidx.media3.exoplayer.analytics.PlayerId) androidx.media3.common.util.Assertions.checkNotNull(this.playerId);
    }

    protected final androidx.media3.common.util.Clock getClock() {
        return (androidx.media3.common.util.Clock) androidx.media3.common.util.Assertions.checkNotNull(this.clock);
    }

    protected final androidx.media3.common.Timeline getTimeline() {
        return this.timeline;
    }

    protected final androidx.media3.exoplayer.ExoPlaybackException createRendererException(java.lang.Throwable th, androidx.media3.common.Format format, int i) {
        return createRendererException(th, format, false, i);
    }

    protected final androidx.media3.exoplayer.ExoPlaybackException createRendererException(java.lang.Throwable th, androidx.media3.common.Format format, boolean z, int i) {
        int formatSupport;
        if (format == null || this.throwRendererExceptionIsExecuting) {
            formatSupport = 4;
        } else {
            this.throwRendererExceptionIsExecuting = true;
            try {
                formatSupport = androidx.media3.exoplayer.RendererCapabilities.getFormatSupport(supportsFormat(format));
                this.throwRendererExceptionIsExecuting = false;
            } catch (androidx.media3.exoplayer.ExoPlaybackException unused) {
                this.throwRendererExceptionIsExecuting = false;
                formatSupport = 4;
            } catch (java.lang.Throwable th2) {
                this.throwRendererExceptionIsExecuting = false;
                throw th2;
            }
        }
        return androidx.media3.exoplayer.ExoPlaybackException.createForRenderer(th, getName(), getIndex(), format, formatSupport, z, i);
    }

    protected final int readSource(androidx.media3.exoplayer.FormatHolder formatHolder, androidx.media3.decoder.DecoderInputBuffer decoderInputBuffer, int i) {
        int data = ((androidx.media3.exoplayer.source.SampleStream) androidx.media3.common.util.Assertions.checkNotNull(this.stream)).readData(formatHolder, decoderInputBuffer, i);
        if (data == -4) {
            if (decoderInputBuffer.isEndOfStream()) {
                this.readingPositionUs = Long.MIN_VALUE;
                return this.streamIsFinal ? -4 : -3;
            }
            decoderInputBuffer.timeUs += this.streamOffsetUs;
            this.readingPositionUs = java.lang.Math.max(this.readingPositionUs, decoderInputBuffer.timeUs);
        } else if (data == -5) {
            androidx.media3.common.Format format = (androidx.media3.common.Format) androidx.media3.common.util.Assertions.checkNotNull(formatHolder.format);
            if (format.subsampleOffsetUs != Long.MAX_VALUE) {
                formatHolder.format = format.buildUpon().setSubsampleOffsetUs(format.subsampleOffsetUs + this.streamOffsetUs).build();
            }
        }
        return data;
    }

    protected int skipSource(long j) {
        return ((androidx.media3.exoplayer.source.SampleStream) androidx.media3.common.util.Assertions.checkNotNull(this.stream)).skipData(j - this.streamOffsetUs);
    }

    protected final boolean isSourceReady() {
        return hasReadStreamToEnd() ? this.streamIsFinal : ((androidx.media3.exoplayer.source.SampleStream) androidx.media3.common.util.Assertions.checkNotNull(this.stream)).isReady();
    }

    protected final void onRendererCapabilitiesChanged() {
        androidx.media3.exoplayer.RendererCapabilities.Listener listener;
        synchronized (this.lock) {
            listener = this.rendererCapabilitiesListener;
        }
        if (listener != null) {
            listener.onRendererCapabilitiesChanged(this);
        }
    }
}
