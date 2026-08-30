package androidx.media3.exoplayer.trackselection;

/* JADX INFO: loaded from: classes.dex */
public final class FixedTrackSelection extends androidx.media3.exoplayer.trackselection.BaseTrackSelection {
    private final java.lang.Object data;
    private final int reason;

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public int getSelectedIndex() {
        return 0;
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public void updateSelectedTrack(long j, long j2, long j3, java.util.List<? extends androidx.media3.exoplayer.source.chunk.MediaChunk> list, androidx.media3.exoplayer.source.chunk.MediaChunkIterator[] mediaChunkIteratorArr) {
    }

    public FixedTrackSelection(androidx.media3.common.TrackGroup trackGroup, int i) {
        this(trackGroup, i, 0);
    }

    public FixedTrackSelection(androidx.media3.common.TrackGroup trackGroup, int i, int i2) {
        this(trackGroup, i, i2, 0, null);
    }

    public FixedTrackSelection(androidx.media3.common.TrackGroup trackGroup, int i, int i2, int i3, java.lang.Object obj) {
        super(trackGroup, new int[]{i}, i2);
        this.reason = i3;
        this.data = obj;
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public int getSelectionReason() {
        return this.reason;
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public java.lang.Object getSelectionData() {
        return this.data;
    }
}
