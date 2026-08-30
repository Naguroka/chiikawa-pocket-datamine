package androidx.media3.exoplayer.source;

/* JADX INFO: loaded from: classes.dex */
public interface MediaPeriod extends androidx.media3.exoplayer.source.SequenceableLoader {

    public interface Callback extends androidx.media3.exoplayer.source.SequenceableLoader.Callback<androidx.media3.exoplayer.source.MediaPeriod> {
        void onPrepared(androidx.media3.exoplayer.source.MediaPeriod mediaPeriod);
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    boolean continueLoading(androidx.media3.exoplayer.LoadingInfo loadingInfo);

    void discardBuffer(long j, boolean z);

    long getAdjustedSeekPositionUs(long j, androidx.media3.exoplayer.SeekParameters seekParameters);

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    long getBufferedPositionUs();

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    long getNextLoadPositionUs();

    androidx.media3.exoplayer.source.TrackGroupArray getTrackGroups();

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    boolean isLoading();

    void maybeThrowPrepareError() throws java.io.IOException;

    void prepare(androidx.media3.exoplayer.source.MediaPeriod.Callback callback, long j);

    long readDiscontinuity();

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    void reevaluateBuffer(long j);

    long seekToUs(long j);

    long selectTracks(androidx.media3.exoplayer.trackselection.ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, androidx.media3.exoplayer.source.SampleStream[] sampleStreamArr, boolean[] zArr2, long j);

    default java.util.List<androidx.media3.common.StreamKey> getStreamKeys(java.util.List<androidx.media3.exoplayer.trackselection.ExoTrackSelection> list) {
        return java.util.Collections.emptyList();
    }
}
