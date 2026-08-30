package androidx.media3.exoplayer.trackselection;

/* JADX INFO: loaded from: classes.dex */
public interface ExoTrackSelection extends androidx.media3.exoplayer.trackselection.TrackSelection {

    public interface Factory {
        androidx.media3.exoplayer.trackselection.ExoTrackSelection[] createTrackSelections(androidx.media3.exoplayer.trackselection.ExoTrackSelection.Definition[] definitionArr, androidx.media3.exoplayer.upstream.BandwidthMeter bandwidthMeter, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, androidx.media3.common.Timeline timeline);
    }

    void disable();

    void enable();

    int evaluateQueueSize(long j, java.util.List<? extends androidx.media3.exoplayer.source.chunk.MediaChunk> list);

    boolean excludeTrack(int i, long j);

    default long getLatestBitrateEstimate() {
        return -2147483647L;
    }

    androidx.media3.common.Format getSelectedFormat();

    int getSelectedIndex();

    int getSelectedIndexInTrackGroup();

    java.lang.Object getSelectionData();

    int getSelectionReason();

    boolean isTrackExcluded(int i, long j);

    default void onDiscontinuity() {
    }

    default void onPlayWhenReadyChanged(boolean z) {
    }

    void onPlaybackSpeed(float f);

    default void onRebuffer() {
    }

    default boolean shouldCancelChunkLoad(long j, androidx.media3.exoplayer.source.chunk.Chunk chunk, java.util.List<? extends androidx.media3.exoplayer.source.chunk.MediaChunk> list) {
        return false;
    }

    void updateSelectedTrack(long j, long j2, long j3, java.util.List<? extends androidx.media3.exoplayer.source.chunk.MediaChunk> list, androidx.media3.exoplayer.source.chunk.MediaChunkIterator[] mediaChunkIteratorArr);

    public static final class Definition {
        private static final java.lang.String TAG = "ETSDefinition";
        public final androidx.media3.common.TrackGroup group;
        public final int[] tracks;
        public final int type;

        public Definition(androidx.media3.common.TrackGroup trackGroup, int... iArr) {
            this(trackGroup, iArr, 0);
        }

        public Definition(androidx.media3.common.TrackGroup trackGroup, int[] iArr, int i) {
            if (iArr.length == 0) {
                androidx.media3.common.util.Log.e(TAG, "Empty tracks are not allowed", new java.lang.IllegalArgumentException());
            }
            this.group = trackGroup;
            this.tracks = iArr;
            this.type = i;
        }
    }
}
