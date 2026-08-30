package androidx.media3.exoplayer.trackselection;

/* JADX INFO: loaded from: classes.dex */
public final class RandomTrackSelection extends androidx.media3.exoplayer.trackselection.BaseTrackSelection {
    private final java.util.Random random;
    private int selectedIndex;

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public java.lang.Object getSelectionData() {
        return null;
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public int getSelectionReason() {
        return 3;
    }

    public static final class Factory implements androidx.media3.exoplayer.trackselection.ExoTrackSelection.Factory {
        private final java.util.Random random;

        public Factory() {
            this.random = new java.util.Random();
        }

        public Factory(int i) {
            this.random = new java.util.Random(i);
        }

        @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection.Factory
        public androidx.media3.exoplayer.trackselection.ExoTrackSelection[] createTrackSelections(androidx.media3.exoplayer.trackselection.ExoTrackSelection.Definition[] definitionArr, androidx.media3.exoplayer.upstream.BandwidthMeter bandwidthMeter, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, androidx.media3.common.Timeline timeline) {
            return androidx.media3.exoplayer.trackselection.TrackSelectionUtil.createTrackSelectionsForDefinitions(definitionArr, new androidx.media3.exoplayer.trackselection.TrackSelectionUtil.AdaptiveTrackSelectionFactory() { // from class: androidx.media3.exoplayer.trackselection.RandomTrackSelection$Factory$$ExternalSyntheticLambda0
                @Override // androidx.media3.exoplayer.trackselection.TrackSelectionUtil.AdaptiveTrackSelectionFactory
                public final androidx.media3.exoplayer.trackselection.ExoTrackSelection createAdaptiveTrackSelection(androidx.media3.exoplayer.trackselection.ExoTrackSelection.Definition definition) {
                    return this.f$0.m203xa167648d(definition);
                }
            });
        }

        /* JADX INFO: renamed from: lambda$createTrackSelections$0$androidx-media3-exoplayer-trackselection-RandomTrackSelection$Factory, reason: not valid java name */
        /* synthetic */ androidx.media3.exoplayer.trackselection.ExoTrackSelection m203xa167648d(androidx.media3.exoplayer.trackselection.ExoTrackSelection.Definition definition) {
            return new androidx.media3.exoplayer.trackselection.RandomTrackSelection(definition.group, definition.tracks, definition.type, this.random);
        }
    }

    public RandomTrackSelection(androidx.media3.common.TrackGroup trackGroup, int[] iArr, int i, java.util.Random random) {
        super(trackGroup, iArr, i);
        this.random = random;
        this.selectedIndex = random.nextInt(this.length);
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public void updateSelectedTrack(long j, long j2, long j3, java.util.List<? extends androidx.media3.exoplayer.source.chunk.MediaChunk> list, androidx.media3.exoplayer.source.chunk.MediaChunkIterator[] mediaChunkIteratorArr) {
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        int i = 0;
        for (int i2 = 0; i2 < this.length; i2++) {
            if (!isTrackExcluded(i2, jElapsedRealtime)) {
                i++;
            }
        }
        this.selectedIndex = this.random.nextInt(i);
        if (i != this.length) {
            int i3 = 0;
            for (int i4 = 0; i4 < this.length; i4++) {
                if (!isTrackExcluded(i4, jElapsedRealtime)) {
                    int i5 = i3 + 1;
                    if (this.selectedIndex == i3) {
                        this.selectedIndex = i4;
                        return;
                    }
                    i3 = i5;
                }
            }
        }
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public int getSelectedIndex() {
        return this.selectedIndex;
    }
}
