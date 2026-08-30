package androidx.media3.exoplayer.source;

/* JADX INFO: loaded from: classes.dex */
final class MergingMediaPeriod implements androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.MediaPeriod.Callback {
    private androidx.media3.exoplayer.source.MediaPeriod.Callback callback;
    private androidx.media3.exoplayer.source.SequenceableLoader compositeSequenceableLoader;
    private final androidx.media3.exoplayer.source.CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory;
    private final androidx.media3.exoplayer.source.MediaPeriod[] periods;
    private androidx.media3.exoplayer.source.TrackGroupArray trackGroups;
    private final java.util.ArrayList<androidx.media3.exoplayer.source.MediaPeriod> childrenPendingPreparation = new java.util.ArrayList<>();
    private final java.util.HashMap<androidx.media3.common.TrackGroup, androidx.media3.common.TrackGroup> childTrackGroupByMergedTrackGroup = new java.util.HashMap<>();
    private final java.util.IdentityHashMap<androidx.media3.exoplayer.source.SampleStream, java.lang.Integer> streamPeriodIndices = new java.util.IdentityHashMap<>();
    private androidx.media3.exoplayer.source.MediaPeriod[] enabledPeriods = new androidx.media3.exoplayer.source.MediaPeriod[0];

    public MergingMediaPeriod(androidx.media3.exoplayer.source.CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory, long[] jArr, androidx.media3.exoplayer.source.MediaPeriod... mediaPeriodArr) {
        this.compositeSequenceableLoaderFactory = compositeSequenceableLoaderFactory;
        this.periods = mediaPeriodArr;
        this.compositeSequenceableLoader = compositeSequenceableLoaderFactory.empty();
        for (int i = 0; i < mediaPeriodArr.length; i++) {
            if (jArr[i] != 0) {
                this.periods[i] = new androidx.media3.exoplayer.source.TimeOffsetMediaPeriod(mediaPeriodArr[i], jArr[i]);
            }
        }
    }

    public androidx.media3.exoplayer.source.MediaPeriod getChildPeriod(int i) {
        androidx.media3.exoplayer.source.MediaPeriod mediaPeriod = this.periods[i];
        return mediaPeriod instanceof androidx.media3.exoplayer.source.TimeOffsetMediaPeriod ? ((androidx.media3.exoplayer.source.TimeOffsetMediaPeriod) mediaPeriod).getWrappedMediaPeriod() : mediaPeriod;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public void prepare(androidx.media3.exoplayer.source.MediaPeriod.Callback callback, long j) {
        this.callback = callback;
        java.util.Collections.addAll(this.childrenPendingPreparation, this.periods);
        for (androidx.media3.exoplayer.source.MediaPeriod mediaPeriod : this.periods) {
            mediaPeriod.prepare(this, j);
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public void maybeThrowPrepareError() throws java.io.IOException {
        for (androidx.media3.exoplayer.source.MediaPeriod mediaPeriod : this.periods) {
            mediaPeriod.maybeThrowPrepareError();
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public androidx.media3.exoplayer.source.TrackGroupArray getTrackGroups() {
        return (androidx.media3.exoplayer.source.TrackGroupArray) androidx.media3.common.util.Assertions.checkNotNull(this.trackGroups);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long selectTracks(androidx.media3.exoplayer.trackselection.ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, androidx.media3.exoplayer.source.SampleStream[] sampleStreamArr, boolean[] zArr2, long j) {
        java.lang.Integer num;
        int[] iArr = new int[exoTrackSelectionArr.length];
        int[] iArr2 = new int[exoTrackSelectionArr.length];
        int i = 0;
        int i2 = 0;
        while (true) {
            num = null;
            if (i2 >= exoTrackSelectionArr.length) {
                break;
            }
            androidx.media3.exoplayer.source.SampleStream sampleStream = sampleStreamArr[i2];
            num = sampleStream != null ? this.streamPeriodIndices.get(sampleStream) : null;
            iArr[i2] = num == null ? -1 : num.intValue();
            androidx.media3.exoplayer.trackselection.ExoTrackSelection exoTrackSelection = exoTrackSelectionArr[i2];
            if (exoTrackSelection != null) {
                androidx.media3.common.TrackGroup trackGroup = exoTrackSelection.getTrackGroup();
                iArr2[i2] = java.lang.Integer.parseInt(trackGroup.id.substring(0, trackGroup.id.indexOf(":")));
            } else {
                iArr2[i2] = -1;
            }
            i2++;
        }
        this.streamPeriodIndices.clear();
        int length = exoTrackSelectionArr.length;
        androidx.media3.exoplayer.source.SampleStream[] sampleStreamArr2 = new androidx.media3.exoplayer.source.SampleStream[length];
        androidx.media3.exoplayer.source.SampleStream[] sampleStreamArr3 = new androidx.media3.exoplayer.source.SampleStream[exoTrackSelectionArr.length];
        java.lang.Object[] objArr = new androidx.media3.exoplayer.trackselection.ExoTrackSelection[exoTrackSelectionArr.length];
        java.util.ArrayList arrayList = new java.util.ArrayList(this.periods.length);
        long j2 = j;
        int i3 = 0;
        while (i3 < this.periods.length) {
            for (int i4 = i; i4 < exoTrackSelectionArr.length; i4++) {
                sampleStreamArr3[i4] = iArr[i4] == i3 ? sampleStreamArr[i4] : num;
                if (iArr2[i4] == i3) {
                    androidx.media3.exoplayer.trackselection.ExoTrackSelection exoTrackSelection2 = (androidx.media3.exoplayer.trackselection.ExoTrackSelection) androidx.media3.common.util.Assertions.checkNotNull(exoTrackSelectionArr[i4]);
                    objArr[i4] = new androidx.media3.exoplayer.source.MergingMediaPeriod.ForwardingTrackSelection(exoTrackSelection2, (androidx.media3.common.TrackGroup) androidx.media3.common.util.Assertions.checkNotNull(this.childTrackGroupByMergedTrackGroup.get(exoTrackSelection2.getTrackGroup())));
                } else {
                    objArr[i4] = num;
                }
            }
            int i5 = i3;
            java.util.ArrayList arrayList2 = arrayList;
            java.lang.Object[] objArr2 = objArr;
            long jSelectTracks = this.periods[i3].selectTracks(objArr, zArr, sampleStreamArr3, zArr2, j2);
            if (i5 == 0) {
                j2 = jSelectTracks;
            } else if (jSelectTracks != j2) {
                throw new java.lang.IllegalStateException("Children enabled at different positions.");
            }
            boolean z = false;
            for (int i6 = 0; i6 < exoTrackSelectionArr.length; i6++) {
                if (iArr2[i6] == i5) {
                    androidx.media3.exoplayer.source.SampleStream sampleStream2 = (androidx.media3.exoplayer.source.SampleStream) androidx.media3.common.util.Assertions.checkNotNull(sampleStreamArr3[i6]);
                    sampleStreamArr2[i6] = sampleStreamArr3[i6];
                    this.streamPeriodIndices.put(sampleStream2, java.lang.Integer.valueOf(i5));
                    z = true;
                } else if (iArr[i6] == i5) {
                    androidx.media3.common.util.Assertions.checkState(sampleStreamArr3[i6] == 0);
                }
            }
            if (z) {
                arrayList2.add(this.periods[i5]);
            }
            i3 = i5 + 1;
            arrayList = arrayList2;
            objArr = objArr2;
            i = 0;
            num = null;
        }
        int i7 = i;
        java.util.ArrayList arrayList3 = arrayList;
        java.lang.System.arraycopy(sampleStreamArr2, i7, sampleStreamArr, i7, length);
        this.enabledPeriods = (androidx.media3.exoplayer.source.MediaPeriod[]) arrayList3.toArray(new androidx.media3.exoplayer.source.MediaPeriod[i7]);
        this.compositeSequenceableLoader = this.compositeSequenceableLoaderFactory.create(arrayList3, com.google.common.collect.Lists.transform(arrayList3, new com.google.common.base.Function() { // from class: androidx.media3.exoplayer.source.MergingMediaPeriod$$ExternalSyntheticLambda0
            @Override // com.google.common.base.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return ((androidx.media3.exoplayer.source.MediaPeriod) obj).getTrackGroups().getTrackTypes();
            }
        }));
        return j2;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public void discardBuffer(long j, boolean z) {
        for (androidx.media3.exoplayer.source.MediaPeriod mediaPeriod : this.enabledPeriods) {
            mediaPeriod.discardBuffer(j, z);
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public void reevaluateBuffer(long j) {
        this.compositeSequenceableLoader.reevaluateBuffer(j);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public boolean continueLoading(androidx.media3.exoplayer.LoadingInfo loadingInfo) {
        if (!this.childrenPendingPreparation.isEmpty()) {
            int size = this.childrenPendingPreparation.size();
            for (int i = 0; i < size; i++) {
                this.childrenPendingPreparation.get(i).continueLoading(loadingInfo);
            }
            return false;
        }
        return this.compositeSequenceableLoader.continueLoading(loadingInfo);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public boolean isLoading() {
        return this.compositeSequenceableLoader.isLoading();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public long getNextLoadPositionUs() {
        return this.compositeSequenceableLoader.getNextLoadPositionUs();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long readDiscontinuity() {
        long j = -9223372036854775807L;
        for (androidx.media3.exoplayer.source.MediaPeriod mediaPeriod : this.enabledPeriods) {
            long discontinuity = mediaPeriod.readDiscontinuity();
            if (discontinuity == androidx.media3.common.C.TIME_UNSET) {
                if (j != androidx.media3.common.C.TIME_UNSET && mediaPeriod.seekToUs(j) != j) {
                    throw new java.lang.IllegalStateException("Unexpected child seekToUs result.");
                }
            } else if (j == androidx.media3.common.C.TIME_UNSET) {
                for (androidx.media3.exoplayer.source.MediaPeriod mediaPeriod2 : this.enabledPeriods) {
                    if (mediaPeriod2 == mediaPeriod) {
                        break;
                    }
                    if (mediaPeriod2.seekToUs(discontinuity) != discontinuity) {
                        throw new java.lang.IllegalStateException("Unexpected child seekToUs result.");
                    }
                }
                j = discontinuity;
            } else if (discontinuity != j) {
                throw new java.lang.IllegalStateException("Conflicting discontinuities.");
            }
        }
        return j;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public long getBufferedPositionUs() {
        return this.compositeSequenceableLoader.getBufferedPositionUs();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long seekToUs(long j) {
        long jSeekToUs = this.enabledPeriods[0].seekToUs(j);
        int i = 1;
        while (true) {
            androidx.media3.exoplayer.source.MediaPeriod[] mediaPeriodArr = this.enabledPeriods;
            if (i >= mediaPeriodArr.length) {
                return jSeekToUs;
            }
            if (mediaPeriodArr[i].seekToUs(jSeekToUs) != jSeekToUs) {
                throw new java.lang.IllegalStateException("Unexpected child seekToUs result.");
            }
            i++;
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long getAdjustedSeekPositionUs(long j, androidx.media3.exoplayer.SeekParameters seekParameters) {
        androidx.media3.exoplayer.source.MediaPeriod[] mediaPeriodArr = this.enabledPeriods;
        return (mediaPeriodArr.length > 0 ? mediaPeriodArr[0] : this.periods[0]).getAdjustedSeekPositionUs(j, seekParameters);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod.Callback
    public void onPrepared(androidx.media3.exoplayer.source.MediaPeriod mediaPeriod) {
        this.childrenPendingPreparation.remove(mediaPeriod);
        if (!this.childrenPendingPreparation.isEmpty()) {
            return;
        }
        int i = 0;
        for (androidx.media3.exoplayer.source.MediaPeriod mediaPeriod2 : this.periods) {
            i += mediaPeriod2.getTrackGroups().length;
        }
        androidx.media3.common.TrackGroup[] trackGroupArr = new androidx.media3.common.TrackGroup[i];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            androidx.media3.exoplayer.source.MediaPeriod[] mediaPeriodArr = this.periods;
            if (i2 < mediaPeriodArr.length) {
                androidx.media3.exoplayer.source.TrackGroupArray trackGroups = mediaPeriodArr[i2].getTrackGroups();
                int i4 = trackGroups.length;
                int i5 = 0;
                while (i5 < i4) {
                    androidx.media3.common.TrackGroup trackGroup = trackGroups.get(i5);
                    androidx.media3.common.Format[] formatArr = new androidx.media3.common.Format[trackGroup.length];
                    for (int i6 = 0; i6 < trackGroup.length; i6++) {
                        androidx.media3.common.Format format = trackGroup.getFormat(i6);
                        formatArr[i6] = format.buildUpon().setId(i2 + ":" + (format.id == null ? "" : format.id)).build();
                    }
                    androidx.media3.common.TrackGroup trackGroup2 = new androidx.media3.common.TrackGroup(i2 + ":" + trackGroup.id, formatArr);
                    this.childTrackGroupByMergedTrackGroup.put(trackGroup2, trackGroup);
                    trackGroupArr[i3] = trackGroup2;
                    i5++;
                    i3++;
                }
                i2++;
            } else {
                this.trackGroups = new androidx.media3.exoplayer.source.TrackGroupArray(trackGroupArr);
                ((androidx.media3.exoplayer.source.MediaPeriod.Callback) androidx.media3.common.util.Assertions.checkNotNull(this.callback)).onPrepared(this);
                return;
            }
        }
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader.Callback
    public void onContinueLoadingRequested(androidx.media3.exoplayer.source.MediaPeriod mediaPeriod) {
        ((androidx.media3.exoplayer.source.MediaPeriod.Callback) androidx.media3.common.util.Assertions.checkNotNull(this.callback)).onContinueLoadingRequested(this);
    }

    private static final class ForwardingTrackSelection implements androidx.media3.exoplayer.trackselection.ExoTrackSelection {
        private final androidx.media3.common.TrackGroup trackGroup;
        private final androidx.media3.exoplayer.trackselection.ExoTrackSelection trackSelection;

        public ForwardingTrackSelection(androidx.media3.exoplayer.trackselection.ExoTrackSelection exoTrackSelection, androidx.media3.common.TrackGroup trackGroup) {
            this.trackSelection = exoTrackSelection;
            this.trackGroup = trackGroup;
        }

        @Override // androidx.media3.exoplayer.trackselection.TrackSelection
        public int getType() {
            return this.trackSelection.getType();
        }

        @Override // androidx.media3.exoplayer.trackselection.TrackSelection
        public androidx.media3.common.TrackGroup getTrackGroup() {
            return this.trackGroup;
        }

        @Override // androidx.media3.exoplayer.trackselection.TrackSelection
        public int length() {
            return this.trackSelection.length();
        }

        @Override // androidx.media3.exoplayer.trackselection.TrackSelection
        public androidx.media3.common.Format getFormat(int i) {
            return this.trackGroup.getFormat(this.trackSelection.getIndexInTrackGroup(i));
        }

        @Override // androidx.media3.exoplayer.trackselection.TrackSelection
        public int getIndexInTrackGroup(int i) {
            return this.trackSelection.getIndexInTrackGroup(i);
        }

        @Override // androidx.media3.exoplayer.trackselection.TrackSelection
        public int indexOf(androidx.media3.common.Format format) {
            return this.trackSelection.indexOf(this.trackGroup.indexOf(format));
        }

        @Override // androidx.media3.exoplayer.trackselection.TrackSelection
        public int indexOf(int i) {
            return this.trackSelection.indexOf(i);
        }

        @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
        public void enable() {
            this.trackSelection.enable();
        }

        @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
        public void disable() {
            this.trackSelection.disable();
        }

        @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
        public androidx.media3.common.Format getSelectedFormat() {
            return this.trackGroup.getFormat(this.trackSelection.getSelectedIndexInTrackGroup());
        }

        @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
        public int getSelectedIndexInTrackGroup() {
            return this.trackSelection.getSelectedIndexInTrackGroup();
        }

        @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
        public int getSelectedIndex() {
            return this.trackSelection.getSelectedIndex();
        }

        @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
        public int getSelectionReason() {
            return this.trackSelection.getSelectionReason();
        }

        @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
        public java.lang.Object getSelectionData() {
            return this.trackSelection.getSelectionData();
        }

        @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
        public void onPlaybackSpeed(float f) {
            this.trackSelection.onPlaybackSpeed(f);
        }

        @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
        public void onDiscontinuity() {
            this.trackSelection.onDiscontinuity();
        }

        @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
        public void onRebuffer() {
            this.trackSelection.onRebuffer();
        }

        @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
        public void onPlayWhenReadyChanged(boolean z) {
            this.trackSelection.onPlayWhenReadyChanged(z);
        }

        @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
        public void updateSelectedTrack(long j, long j2, long j3, java.util.List<? extends androidx.media3.exoplayer.source.chunk.MediaChunk> list, androidx.media3.exoplayer.source.chunk.MediaChunkIterator[] mediaChunkIteratorArr) {
            this.trackSelection.updateSelectedTrack(j, j2, j3, list, mediaChunkIteratorArr);
        }

        @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
        public int evaluateQueueSize(long j, java.util.List<? extends androidx.media3.exoplayer.source.chunk.MediaChunk> list) {
            return this.trackSelection.evaluateQueueSize(j, list);
        }

        @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
        public boolean shouldCancelChunkLoad(long j, androidx.media3.exoplayer.source.chunk.Chunk chunk, java.util.List<? extends androidx.media3.exoplayer.source.chunk.MediaChunk> list) {
            return this.trackSelection.shouldCancelChunkLoad(j, chunk, list);
        }

        @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
        public boolean excludeTrack(int i, long j) {
            return this.trackSelection.excludeTrack(i, j);
        }

        @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
        public boolean isTrackExcluded(int i, long j) {
            return this.trackSelection.isTrackExcluded(i, j);
        }

        @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
        public long getLatestBitrateEstimate() {
            return this.trackSelection.getLatestBitrateEstimate();
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof androidx.media3.exoplayer.source.MergingMediaPeriod.ForwardingTrackSelection)) {
                return false;
            }
            androidx.media3.exoplayer.source.MergingMediaPeriod.ForwardingTrackSelection forwardingTrackSelection = (androidx.media3.exoplayer.source.MergingMediaPeriod.ForwardingTrackSelection) obj;
            return this.trackSelection.equals(forwardingTrackSelection.trackSelection) && this.trackGroup.equals(forwardingTrackSelection.trackGroup);
        }

        public int hashCode() {
            return ((com.json.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.trackGroup.hashCode()) * 31) + this.trackSelection.hashCode();
        }
    }
}
