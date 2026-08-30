package androidx.media3.exoplayer.trackselection;

/* JADX INFO: loaded from: classes.dex */
public final class TrackSelectorResult {
    public final java.lang.Object info;
    public final int length;
    public final androidx.media3.exoplayer.RendererConfiguration[] rendererConfigurations;
    public final androidx.media3.exoplayer.trackselection.ExoTrackSelection[] selections;
    public final androidx.media3.common.Tracks tracks;

    @java.lang.Deprecated
    public TrackSelectorResult(androidx.media3.exoplayer.RendererConfiguration[] rendererConfigurationArr, androidx.media3.exoplayer.trackselection.ExoTrackSelection[] exoTrackSelectionArr, java.lang.Object obj) {
        this(rendererConfigurationArr, exoTrackSelectionArr, androidx.media3.common.Tracks.EMPTY, obj);
    }

    public TrackSelectorResult(androidx.media3.exoplayer.RendererConfiguration[] rendererConfigurationArr, androidx.media3.exoplayer.trackselection.ExoTrackSelection[] exoTrackSelectionArr, androidx.media3.common.Tracks tracks, java.lang.Object obj) {
        androidx.media3.common.util.Assertions.checkArgument(rendererConfigurationArr.length == exoTrackSelectionArr.length);
        this.rendererConfigurations = rendererConfigurationArr;
        this.selections = (androidx.media3.exoplayer.trackselection.ExoTrackSelection[]) exoTrackSelectionArr.clone();
        this.tracks = tracks;
        this.info = obj;
        this.length = rendererConfigurationArr.length;
    }

    public boolean isRendererEnabled(int i) {
        return this.rendererConfigurations[i] != null;
    }

    public boolean isEquivalent(androidx.media3.exoplayer.trackselection.TrackSelectorResult trackSelectorResult) {
        if (trackSelectorResult == null || trackSelectorResult.selections.length != this.selections.length) {
            return false;
        }
        for (int i = 0; i < this.selections.length; i++) {
            if (!isEquivalent(trackSelectorResult, i)) {
                return false;
            }
        }
        return true;
    }

    public boolean isEquivalent(androidx.media3.exoplayer.trackselection.TrackSelectorResult trackSelectorResult, int i) {
        return trackSelectorResult != null && androidx.media3.common.util.Util.areEqual(this.rendererConfigurations[i], trackSelectorResult.rendererConfigurations[i]) && androidx.media3.common.util.Util.areEqual(this.selections[i], trackSelectorResult.selections[i]);
    }
}
