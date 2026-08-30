package androidx.media3.exoplayer.source;

/* JADX INFO: loaded from: classes.dex */
public class FilteringMediaSource extends androidx.media3.exoplayer.source.WrappingMediaSource {
    private final com.google.common.collect.ImmutableSet<java.lang.Integer> trackTypes;

    public FilteringMediaSource(androidx.media3.exoplayer.source.MediaSource mediaSource, int i) {
        this(mediaSource, com.google.common.collect.ImmutableSet.of(java.lang.Integer.valueOf(i)));
    }

    public FilteringMediaSource(androidx.media3.exoplayer.source.MediaSource mediaSource, java.util.Set<java.lang.Integer> set) {
        super(mediaSource);
        this.trackTypes = com.google.common.collect.ImmutableSet.copyOf((java.util.Collection) set);
    }

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource, androidx.media3.exoplayer.source.MediaSource
    public androidx.media3.exoplayer.source.MediaPeriod createPeriod(androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, androidx.media3.exoplayer.upstream.Allocator allocator, long j) {
        return new androidx.media3.exoplayer.source.FilteringMediaSource.FilteringMediaPeriod(super.createPeriod(mediaPeriodId, allocator, j), this.trackTypes);
    }

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource, androidx.media3.exoplayer.source.MediaSource
    public void releasePeriod(androidx.media3.exoplayer.source.MediaPeriod mediaPeriod) {
        super.releasePeriod(((androidx.media3.exoplayer.source.FilteringMediaSource.FilteringMediaPeriod) mediaPeriod).mediaPeriod);
    }

    private static final class FilteringMediaPeriod implements androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.MediaPeriod.Callback {
        private androidx.media3.exoplayer.source.MediaPeriod.Callback callback;
        private androidx.media3.exoplayer.source.TrackGroupArray filteredTrackGroups;
        public final androidx.media3.exoplayer.source.MediaPeriod mediaPeriod;
        private final com.google.common.collect.ImmutableSet<java.lang.Integer> trackTypes;

        public FilteringMediaPeriod(androidx.media3.exoplayer.source.MediaPeriod mediaPeriod, com.google.common.collect.ImmutableSet<java.lang.Integer> immutableSet) {
            this.mediaPeriod = mediaPeriod;
            this.trackTypes = immutableSet;
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public void prepare(androidx.media3.exoplayer.source.MediaPeriod.Callback callback, long j) {
            this.callback = callback;
            this.mediaPeriod.prepare(this, j);
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public void maybeThrowPrepareError() throws java.io.IOException {
            this.mediaPeriod.maybeThrowPrepareError();
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public androidx.media3.exoplayer.source.TrackGroupArray getTrackGroups() {
            return (androidx.media3.exoplayer.source.TrackGroupArray) androidx.media3.common.util.Assertions.checkNotNull(this.filteredTrackGroups);
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public java.util.List<androidx.media3.common.StreamKey> getStreamKeys(java.util.List<androidx.media3.exoplayer.trackselection.ExoTrackSelection> list) {
            return this.mediaPeriod.getStreamKeys(list);
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public long selectTracks(androidx.media3.exoplayer.trackselection.ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, androidx.media3.exoplayer.source.SampleStream[] sampleStreamArr, boolean[] zArr2, long j) {
            return this.mediaPeriod.selectTracks(exoTrackSelectionArr, zArr, sampleStreamArr, zArr2, j);
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public void discardBuffer(long j, boolean z) {
            this.mediaPeriod.discardBuffer(j, z);
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public long readDiscontinuity() {
            return this.mediaPeriod.readDiscontinuity();
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public long seekToUs(long j) {
            return this.mediaPeriod.seekToUs(j);
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public long getAdjustedSeekPositionUs(long j, androidx.media3.exoplayer.SeekParameters seekParameters) {
            return this.mediaPeriod.getAdjustedSeekPositionUs(j, seekParameters);
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
        public long getBufferedPositionUs() {
            return this.mediaPeriod.getBufferedPositionUs();
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
        public long getNextLoadPositionUs() {
            return this.mediaPeriod.getNextLoadPositionUs();
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
        public boolean continueLoading(androidx.media3.exoplayer.LoadingInfo loadingInfo) {
            return this.mediaPeriod.continueLoading(loadingInfo);
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
        public boolean isLoading() {
            return this.mediaPeriod.isLoading();
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
        public void reevaluateBuffer(long j) {
            this.mediaPeriod.reevaluateBuffer(j);
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod.Callback
        public void onPrepared(androidx.media3.exoplayer.source.MediaPeriod mediaPeriod) {
            androidx.media3.exoplayer.source.TrackGroupArray trackGroups = mediaPeriod.getTrackGroups();
            com.google.common.collect.ImmutableList.Builder builder = com.google.common.collect.ImmutableList.builder();
            for (int i = 0; i < trackGroups.length; i++) {
                androidx.media3.common.TrackGroup trackGroup = trackGroups.get(i);
                if (this.trackTypes.contains(java.lang.Integer.valueOf(trackGroup.type))) {
                    builder.add(trackGroup);
                }
            }
            this.filteredTrackGroups = new androidx.media3.exoplayer.source.TrackGroupArray((androidx.media3.common.TrackGroup[]) builder.build().toArray(new androidx.media3.common.TrackGroup[0]));
            ((androidx.media3.exoplayer.source.MediaPeriod.Callback) androidx.media3.common.util.Assertions.checkNotNull(this.callback)).onPrepared(this);
        }

        @Override // androidx.media3.exoplayer.source.SequenceableLoader.Callback
        public void onContinueLoadingRequested(androidx.media3.exoplayer.source.MediaPeriod mediaPeriod) {
            ((androidx.media3.exoplayer.source.MediaPeriod.Callback) androidx.media3.common.util.Assertions.checkNotNull(this.callback)).onContinueLoadingRequested(this);
        }
    }
}
