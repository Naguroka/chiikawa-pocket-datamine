package androidx.media3.exoplayer.trackselection;

/* JADX INFO: loaded from: classes.dex */
public abstract class TrackSelector {
    private androidx.media3.exoplayer.upstream.BandwidthMeter bandwidthMeter;
    private androidx.media3.exoplayer.trackselection.TrackSelector.InvalidationListener listener;

    public interface InvalidationListener {
        default void onRendererCapabilitiesChanged(androidx.media3.exoplayer.Renderer renderer) {
        }

        void onTrackSelectionsInvalidated();
    }

    public androidx.media3.exoplayer.RendererCapabilities.Listener getRendererCapabilitiesListener() {
        return null;
    }

    public boolean isSetParametersSupported() {
        return false;
    }

    public abstract void onSelectionActivated(java.lang.Object obj);

    public abstract androidx.media3.exoplayer.trackselection.TrackSelectorResult selectTracks(androidx.media3.exoplayer.RendererCapabilities[] rendererCapabilitiesArr, androidx.media3.exoplayer.source.TrackGroupArray trackGroupArray, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, androidx.media3.common.Timeline timeline) throws androidx.media3.exoplayer.ExoPlaybackException;

    public void setAudioAttributes(androidx.media3.common.AudioAttributes audioAttributes) {
    }

    public void setParameters(androidx.media3.common.TrackSelectionParameters trackSelectionParameters) {
    }

    public void init(androidx.media3.exoplayer.trackselection.TrackSelector.InvalidationListener invalidationListener, androidx.media3.exoplayer.upstream.BandwidthMeter bandwidthMeter) {
        this.listener = invalidationListener;
        this.bandwidthMeter = bandwidthMeter;
    }

    public void release() {
        this.listener = null;
        this.bandwidthMeter = null;
    }

    public androidx.media3.common.TrackSelectionParameters getParameters() {
        return androidx.media3.common.TrackSelectionParameters.DEFAULT_WITHOUT_CONTEXT;
    }

    protected final void invalidate() {
        androidx.media3.exoplayer.trackselection.TrackSelector.InvalidationListener invalidationListener = this.listener;
        if (invalidationListener != null) {
            invalidationListener.onTrackSelectionsInvalidated();
        }
    }

    protected final void invalidateForRendererCapabilitiesChange(androidx.media3.exoplayer.Renderer renderer) {
        androidx.media3.exoplayer.trackselection.TrackSelector.InvalidationListener invalidationListener = this.listener;
        if (invalidationListener != null) {
            invalidationListener.onRendererCapabilitiesChanged(renderer);
        }
    }

    protected final androidx.media3.exoplayer.upstream.BandwidthMeter getBandwidthMeter() {
        return (androidx.media3.exoplayer.upstream.BandwidthMeter) androidx.media3.common.util.Assertions.checkStateNotNull(this.bandwidthMeter);
    }
}
