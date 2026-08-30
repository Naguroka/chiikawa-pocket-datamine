package androidx.media3.exoplayer.source.preload;

/* JADX INFO: loaded from: classes.dex */
final class PreloadMediaPeriod implements androidx.media3.exoplayer.source.MediaPeriod {
    private androidx.media3.exoplayer.source.MediaPeriod.Callback callback;
    public final androidx.media3.exoplayer.source.MediaPeriod mediaPeriod;
    private androidx.media3.exoplayer.source.preload.PreloadMediaPeriod.PreloadTrackSelectionHolder preloadTrackSelectionHolder;
    private boolean prepareInternalCalled;
    private boolean prepared;

    public PreloadMediaPeriod(androidx.media3.exoplayer.source.MediaPeriod mediaPeriod) {
        this.mediaPeriod = mediaPeriod;
    }

    void preload(androidx.media3.exoplayer.source.MediaPeriod.Callback callback, long j) {
        this.callback = callback;
        if (this.prepared) {
            callback.onPrepared(this);
        }
        if (this.prepareInternalCalled) {
            return;
        }
        prepareInternal(j);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public void prepare(androidx.media3.exoplayer.source.MediaPeriod.Callback callback, long j) {
        this.callback = callback;
        if (this.prepared) {
            callback.onPrepared(this);
        } else {
            if (this.prepareInternalCalled) {
                return;
            }
            prepareInternal(j);
        }
    }

    private void prepareInternal(long j) {
        this.prepareInternalCalled = true;
        this.mediaPeriod.prepare(new androidx.media3.exoplayer.source.MediaPeriod.Callback() { // from class: androidx.media3.exoplayer.source.preload.PreloadMediaPeriod.1
            @Override // androidx.media3.exoplayer.source.SequenceableLoader.Callback
            public void onContinueLoadingRequested(androidx.media3.exoplayer.source.MediaPeriod mediaPeriod) {
                ((androidx.media3.exoplayer.source.MediaPeriod.Callback) androidx.media3.common.util.Assertions.checkNotNull(androidx.media3.exoplayer.source.preload.PreloadMediaPeriod.this.callback)).onContinueLoadingRequested(androidx.media3.exoplayer.source.preload.PreloadMediaPeriod.this);
            }

            @Override // androidx.media3.exoplayer.source.MediaPeriod.Callback
            public void onPrepared(androidx.media3.exoplayer.source.MediaPeriod mediaPeriod) {
                androidx.media3.exoplayer.source.preload.PreloadMediaPeriod.this.prepared = true;
                ((androidx.media3.exoplayer.source.MediaPeriod.Callback) androidx.media3.common.util.Assertions.checkNotNull(androidx.media3.exoplayer.source.preload.PreloadMediaPeriod.this.callback)).onPrepared(androidx.media3.exoplayer.source.preload.PreloadMediaPeriod.this);
            }
        }, j);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public void maybeThrowPrepareError() throws java.io.IOException {
        this.mediaPeriod.maybeThrowPrepareError();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public androidx.media3.exoplayer.source.TrackGroupArray getTrackGroups() {
        return this.mediaPeriod.getTrackGroups();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long selectTracks(androidx.media3.exoplayer.trackselection.ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, androidx.media3.exoplayer.source.SampleStream[] sampleStreamArr, boolean[] zArr2, long j) {
        return selectTracksInternal(exoTrackSelectionArr, zArr, sampleStreamArr, zArr2, j);
    }

    private long selectTracksInternal(androidx.media3.exoplayer.trackselection.ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, androidx.media3.exoplayer.source.SampleStream[] sampleStreamArr, boolean[] zArr2, long j) {
        androidx.media3.exoplayer.source.preload.PreloadMediaPeriod.PreloadTrackSelectionHolder preloadTrackSelectionHolder = this.preloadTrackSelectionHolder;
        if (preloadTrackSelectionHolder == null) {
            return this.mediaPeriod.selectTracks(exoTrackSelectionArr, zArr, sampleStreamArr, zArr2, j);
        }
        androidx.media3.common.util.Assertions.checkState(sampleStreamArr.length == preloadTrackSelectionHolder.streams.length);
        if (j != this.preloadTrackSelectionHolder.trackSelectionPositionUs) {
            for (int i = 0; i < this.preloadTrackSelectionHolder.streams.length; i++) {
                if (this.preloadTrackSelectionHolder.streams[i] != null) {
                    sampleStreamArr[i] = this.preloadTrackSelectionHolder.streams[i];
                    zArr[i] = false;
                }
            }
            this.preloadTrackSelectionHolder = null;
            return this.mediaPeriod.selectTracks(exoTrackSelectionArr, zArr, sampleStreamArr, zArr2, j);
        }
        androidx.media3.exoplayer.source.preload.PreloadMediaPeriod.PreloadTrackSelectionHolder preloadTrackSelectionHolder2 = (androidx.media3.exoplayer.source.preload.PreloadMediaPeriod.PreloadTrackSelectionHolder) androidx.media3.common.util.Assertions.checkNotNull(this.preloadTrackSelectionHolder);
        long j2 = preloadTrackSelectionHolder2.trackSelectionPositionUs;
        boolean[] zArr3 = preloadTrackSelectionHolder2.streamResetFlags;
        if (maybeUpdatePreloadTrackSelectionHolderForReselection(exoTrackSelectionArr, preloadTrackSelectionHolder2)) {
            boolean[] zArr4 = new boolean[zArr3.length];
            long jSelectTracks = this.mediaPeriod.selectTracks(preloadTrackSelectionHolder2.selections, preloadTrackSelectionHolder2.mayRetainStreamFlags, preloadTrackSelectionHolder2.streams, zArr4, preloadTrackSelectionHolder2.trackSelectionPositionUs);
            for (int i2 = 0; i2 < preloadTrackSelectionHolder2.mayRetainStreamFlags.length; i2++) {
                if (preloadTrackSelectionHolder2.mayRetainStreamFlags[i2]) {
                    zArr4[i2] = true;
                }
            }
            zArr3 = zArr4;
            j2 = jSelectTracks;
        }
        java.lang.System.arraycopy(preloadTrackSelectionHolder2.streams, 0, sampleStreamArr, 0, preloadTrackSelectionHolder2.streams.length);
        java.lang.System.arraycopy(zArr3, 0, zArr2, 0, zArr3.length);
        this.preloadTrackSelectionHolder = null;
        return j2;
    }

    private static boolean maybeUpdatePreloadTrackSelectionHolderForReselection(androidx.media3.exoplayer.trackselection.ExoTrackSelection[] exoTrackSelectionArr, androidx.media3.exoplayer.source.preload.PreloadMediaPeriod.PreloadTrackSelectionHolder preloadTrackSelectionHolder) {
        androidx.media3.exoplayer.trackselection.ExoTrackSelection[] exoTrackSelectionArr2 = ((androidx.media3.exoplayer.source.preload.PreloadMediaPeriod.PreloadTrackSelectionHolder) androidx.media3.common.util.Assertions.checkNotNull(preloadTrackSelectionHolder)).selections;
        int i = 0;
        boolean z = false;
        while (i < exoTrackSelectionArr.length) {
            androidx.media3.exoplayer.trackselection.ExoTrackSelection exoTrackSelection = exoTrackSelectionArr[i];
            androidx.media3.exoplayer.trackselection.ExoTrackSelection exoTrackSelection2 = exoTrackSelectionArr2[i];
            if (exoTrackSelection != null || exoTrackSelection2 != null) {
                preloadTrackSelectionHolder.mayRetainStreamFlags[i] = false;
                if (exoTrackSelection == null) {
                    preloadTrackSelectionHolder.selections[i] = null;
                } else if (exoTrackSelection2 == null || !isSameAdaptionSet(exoTrackSelection, exoTrackSelection2)) {
                    preloadTrackSelectionHolder.selections[i] = exoTrackSelection;
                } else if (exoTrackSelection.getTrackGroup().type == 2 || exoTrackSelection.getTrackGroup().type == 1 || exoTrackSelection.getSelectedIndexInTrackGroup() == exoTrackSelection2.getSelectedIndexInTrackGroup()) {
                    preloadTrackSelectionHolder.mayRetainStreamFlags[i] = true;
                } else {
                    preloadTrackSelectionHolder.selections[i] = exoTrackSelection;
                }
                z = true;
            }
            i++;
        }
        return z;
    }

    private static boolean isSameAdaptionSet(androidx.media3.exoplayer.trackselection.ExoTrackSelection exoTrackSelection, androidx.media3.exoplayer.trackselection.ExoTrackSelection exoTrackSelection2) {
        if (!java.util.Objects.equals(exoTrackSelection.getTrackGroup(), exoTrackSelection2.getTrackGroup()) || exoTrackSelection.length() != exoTrackSelection2.length()) {
            return false;
        }
        for (int i = 0; i < exoTrackSelection.length(); i++) {
            if (exoTrackSelection.getIndexInTrackGroup(i) != exoTrackSelection2.getIndexInTrackGroup(i)) {
                return false;
            }
        }
        return true;
    }

    long selectTracksForPreloading(androidx.media3.exoplayer.trackselection.ExoTrackSelection[] exoTrackSelectionArr, long j) {
        androidx.media3.exoplayer.source.SampleStream[] sampleStreamArr = new androidx.media3.exoplayer.source.SampleStream[exoTrackSelectionArr.length];
        boolean[] zArr = new boolean[exoTrackSelectionArr.length];
        boolean[] zArr2 = new boolean[exoTrackSelectionArr.length];
        long jSelectTracksInternal = selectTracksInternal(exoTrackSelectionArr, zArr2, sampleStreamArr, zArr, j);
        this.preloadTrackSelectionHolder = new androidx.media3.exoplayer.source.preload.PreloadMediaPeriod.PreloadTrackSelectionHolder(exoTrackSelectionArr, zArr2, sampleStreamArr, zArr, jSelectTracksInternal);
        return jSelectTracksInternal;
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

    private static class PreloadTrackSelectionHolder {
        public final boolean[] mayRetainStreamFlags;
        public final androidx.media3.exoplayer.trackselection.ExoTrackSelection[] selections;
        public final boolean[] streamResetFlags;
        public final androidx.media3.exoplayer.source.SampleStream[] streams;
        public final long trackSelectionPositionUs;

        public PreloadTrackSelectionHolder(androidx.media3.exoplayer.trackselection.ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, androidx.media3.exoplayer.source.SampleStream[] sampleStreamArr, boolean[] zArr2, long j) {
            this.selections = exoTrackSelectionArr;
            this.mayRetainStreamFlags = zArr;
            this.streams = sampleStreamArr;
            this.streamResetFlags = zArr2;
            this.trackSelectionPositionUs = j;
        }
    }
}
