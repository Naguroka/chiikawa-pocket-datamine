package androidx.media3.exoplayer.source;

/* JADX INFO: loaded from: classes.dex */
final class TimeOffsetMediaPeriod implements androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.MediaPeriod.Callback {
    private androidx.media3.exoplayer.source.MediaPeriod.Callback callback;
    private final androidx.media3.exoplayer.source.MediaPeriod mediaPeriod;
    private final long timeOffsetUs;

    public TimeOffsetMediaPeriod(androidx.media3.exoplayer.source.MediaPeriod mediaPeriod, long j) {
        this.mediaPeriod = mediaPeriod;
        this.timeOffsetUs = j;
    }

    public androidx.media3.exoplayer.source.MediaPeriod getWrappedMediaPeriod() {
        return this.mediaPeriod;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public void prepare(androidx.media3.exoplayer.source.MediaPeriod.Callback callback, long j) {
        this.callback = callback;
        this.mediaPeriod.prepare(this, j - this.timeOffsetUs);
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
    public java.util.List<androidx.media3.common.StreamKey> getStreamKeys(java.util.List<androidx.media3.exoplayer.trackselection.ExoTrackSelection> list) {
        return this.mediaPeriod.getStreamKeys(list);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long selectTracks(androidx.media3.exoplayer.trackselection.ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, androidx.media3.exoplayer.source.SampleStream[] sampleStreamArr, boolean[] zArr2, long j) {
        androidx.media3.exoplayer.source.SampleStream[] sampleStreamArr2 = new androidx.media3.exoplayer.source.SampleStream[sampleStreamArr.length];
        int i = 0;
        while (true) {
            androidx.media3.exoplayer.source.SampleStream childStream = null;
            if (i >= sampleStreamArr.length) {
                break;
            }
            androidx.media3.exoplayer.source.TimeOffsetMediaPeriod.TimeOffsetSampleStream timeOffsetSampleStream = (androidx.media3.exoplayer.source.TimeOffsetMediaPeriod.TimeOffsetSampleStream) sampleStreamArr[i];
            if (timeOffsetSampleStream != null) {
                childStream = timeOffsetSampleStream.getChildStream();
            }
            sampleStreamArr2[i] = childStream;
            i++;
        }
        long jSelectTracks = this.mediaPeriod.selectTracks(exoTrackSelectionArr, zArr, sampleStreamArr2, zArr2, j - this.timeOffsetUs);
        for (int i2 = 0; i2 < sampleStreamArr.length; i2++) {
            androidx.media3.exoplayer.source.SampleStream sampleStream = sampleStreamArr2[i2];
            if (sampleStream == null) {
                sampleStreamArr[i2] = null;
            } else {
                androidx.media3.exoplayer.source.SampleStream sampleStream2 = sampleStreamArr[i2];
                if (sampleStream2 == null || ((androidx.media3.exoplayer.source.TimeOffsetMediaPeriod.TimeOffsetSampleStream) sampleStream2).getChildStream() != sampleStream) {
                    sampleStreamArr[i2] = new androidx.media3.exoplayer.source.TimeOffsetMediaPeriod.TimeOffsetSampleStream(sampleStream, this.timeOffsetUs);
                }
            }
        }
        return jSelectTracks + this.timeOffsetUs;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public void discardBuffer(long j, boolean z) {
        this.mediaPeriod.discardBuffer(j - this.timeOffsetUs, z);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long readDiscontinuity() {
        long discontinuity = this.mediaPeriod.readDiscontinuity();
        return discontinuity == androidx.media3.common.C.TIME_UNSET ? androidx.media3.common.C.TIME_UNSET : this.timeOffsetUs + discontinuity;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long seekToUs(long j) {
        return this.mediaPeriod.seekToUs(j - this.timeOffsetUs) + this.timeOffsetUs;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long getAdjustedSeekPositionUs(long j, androidx.media3.exoplayer.SeekParameters seekParameters) {
        return this.mediaPeriod.getAdjustedSeekPositionUs(j - this.timeOffsetUs, seekParameters) + this.timeOffsetUs;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public long getBufferedPositionUs() {
        long bufferedPositionUs = this.mediaPeriod.getBufferedPositionUs();
        if (bufferedPositionUs == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return this.timeOffsetUs + bufferedPositionUs;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public long getNextLoadPositionUs() {
        long nextLoadPositionUs = this.mediaPeriod.getNextLoadPositionUs();
        if (nextLoadPositionUs == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return this.timeOffsetUs + nextLoadPositionUs;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public boolean continueLoading(androidx.media3.exoplayer.LoadingInfo loadingInfo) {
        return this.mediaPeriod.continueLoading(loadingInfo.buildUpon().setPlaybackPositionUs(loadingInfo.playbackPositionUs - this.timeOffsetUs).build());
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public boolean isLoading() {
        return this.mediaPeriod.isLoading();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public void reevaluateBuffer(long j) {
        this.mediaPeriod.reevaluateBuffer(j - this.timeOffsetUs);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod.Callback
    public void onPrepared(androidx.media3.exoplayer.source.MediaPeriod mediaPeriod) {
        ((androidx.media3.exoplayer.source.MediaPeriod.Callback) androidx.media3.common.util.Assertions.checkNotNull(this.callback)).onPrepared(this);
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader.Callback
    public void onContinueLoadingRequested(androidx.media3.exoplayer.source.MediaPeriod mediaPeriod) {
        ((androidx.media3.exoplayer.source.MediaPeriod.Callback) androidx.media3.common.util.Assertions.checkNotNull(this.callback)).onContinueLoadingRequested(this);
    }

    private static final class TimeOffsetSampleStream implements androidx.media3.exoplayer.source.SampleStream {
        private final androidx.media3.exoplayer.source.SampleStream sampleStream;
        private final long timeOffsetUs;

        public TimeOffsetSampleStream(androidx.media3.exoplayer.source.SampleStream sampleStream, long j) {
            this.sampleStream = sampleStream;
            this.timeOffsetUs = j;
        }

        public androidx.media3.exoplayer.source.SampleStream getChildStream() {
            return this.sampleStream;
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public boolean isReady() {
            return this.sampleStream.isReady();
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public void maybeThrowError() throws java.io.IOException {
            this.sampleStream.maybeThrowError();
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public int readData(androidx.media3.exoplayer.FormatHolder formatHolder, androidx.media3.decoder.DecoderInputBuffer decoderInputBuffer, int i) {
            int data = this.sampleStream.readData(formatHolder, decoderInputBuffer, i);
            if (data == -4) {
                decoderInputBuffer.timeUs += this.timeOffsetUs;
            }
            return data;
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public int skipData(long j) {
            return this.sampleStream.skipData(j - this.timeOffsetUs);
        }
    }
}
