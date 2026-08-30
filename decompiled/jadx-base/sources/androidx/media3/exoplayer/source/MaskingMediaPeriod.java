package androidx.media3.exoplayer.source;

/* JADX INFO: loaded from: classes.dex */
public final class MaskingMediaPeriod implements androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.MediaPeriod.Callback {
    private final androidx.media3.exoplayer.upstream.Allocator allocator;
    private androidx.media3.exoplayer.source.MediaPeriod.Callback callback;
    public final androidx.media3.exoplayer.source.MediaSource.MediaPeriodId id;
    private androidx.media3.exoplayer.source.MaskingMediaPeriod.PrepareListener listener;
    private androidx.media3.exoplayer.source.MediaPeriod mediaPeriod;
    private androidx.media3.exoplayer.source.MediaSource mediaSource;
    private boolean notifiedPrepareError;
    private long preparePositionOverrideUs = androidx.media3.common.C.TIME_UNSET;
    private final long preparePositionUs;

    public interface PrepareListener {
        void onPrepareComplete(androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId);

        void onPrepareError(androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, java.io.IOException iOException);
    }

    public MaskingMediaPeriod(androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, androidx.media3.exoplayer.upstream.Allocator allocator, long j) {
        this.id = mediaPeriodId;
        this.allocator = allocator;
        this.preparePositionUs = j;
    }

    public void setPrepareListener(androidx.media3.exoplayer.source.MaskingMediaPeriod.PrepareListener prepareListener) {
        this.listener = prepareListener;
    }

    public long getPreparePositionUs() {
        return this.preparePositionUs;
    }

    public void overridePreparePositionUs(long j) {
        this.preparePositionOverrideUs = j;
    }

    public long getPreparePositionOverrideUs() {
        return this.preparePositionOverrideUs;
    }

    public void setMediaSource(androidx.media3.exoplayer.source.MediaSource mediaSource) {
        androidx.media3.common.util.Assertions.checkState(this.mediaSource == null);
        this.mediaSource = mediaSource;
    }

    public void createPeriod(androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) {
        long preparePositionWithOverride = getPreparePositionWithOverride(this.preparePositionUs);
        androidx.media3.exoplayer.source.MediaPeriod mediaPeriodCreatePeriod = ((androidx.media3.exoplayer.source.MediaSource) androidx.media3.common.util.Assertions.checkNotNull(this.mediaSource)).createPeriod(mediaPeriodId, this.allocator, preparePositionWithOverride);
        this.mediaPeriod = mediaPeriodCreatePeriod;
        if (this.callback != null) {
            mediaPeriodCreatePeriod.prepare(this, preparePositionWithOverride);
        }
    }

    public void releasePeriod() {
        if (this.mediaPeriod != null) {
            ((androidx.media3.exoplayer.source.MediaSource) androidx.media3.common.util.Assertions.checkNotNull(this.mediaSource)).releasePeriod(this.mediaPeriod);
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public void prepare(androidx.media3.exoplayer.source.MediaPeriod.Callback callback, long j) {
        this.callback = callback;
        androidx.media3.exoplayer.source.MediaPeriod mediaPeriod = this.mediaPeriod;
        if (mediaPeriod != null) {
            mediaPeriod.prepare(this, getPreparePositionWithOverride(this.preparePositionUs));
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public void maybeThrowPrepareError() throws java.io.IOException {
        try {
            androidx.media3.exoplayer.source.MediaPeriod mediaPeriod = this.mediaPeriod;
            if (mediaPeriod != null) {
                mediaPeriod.maybeThrowPrepareError();
            } else {
                androidx.media3.exoplayer.source.MediaSource mediaSource = this.mediaSource;
                if (mediaSource != null) {
                    mediaSource.maybeThrowSourceInfoRefreshError();
                }
            }
        } catch (java.io.IOException e) {
            androidx.media3.exoplayer.source.MaskingMediaPeriod.PrepareListener prepareListener = this.listener;
            if (prepareListener == null) {
                throw e;
            }
            if (this.notifiedPrepareError) {
                return;
            }
            this.notifiedPrepareError = true;
            prepareListener.onPrepareError(this.id, e);
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public androidx.media3.exoplayer.source.TrackGroupArray getTrackGroups() {
        return ((androidx.media3.exoplayer.source.MediaPeriod) androidx.media3.common.util.Util.castNonNull(this.mediaPeriod)).getTrackGroups();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long selectTracks(androidx.media3.exoplayer.trackselection.ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, androidx.media3.exoplayer.source.SampleStream[] sampleStreamArr, boolean[] zArr2, long j) {
        long j2 = this.preparePositionOverrideUs;
        long j3 = (j2 == androidx.media3.common.C.TIME_UNSET || j != this.preparePositionUs) ? j : j2;
        this.preparePositionOverrideUs = androidx.media3.common.C.TIME_UNSET;
        return ((androidx.media3.exoplayer.source.MediaPeriod) androidx.media3.common.util.Util.castNonNull(this.mediaPeriod)).selectTracks(exoTrackSelectionArr, zArr, sampleStreamArr, zArr2, j3);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public void discardBuffer(long j, boolean z) {
        ((androidx.media3.exoplayer.source.MediaPeriod) androidx.media3.common.util.Util.castNonNull(this.mediaPeriod)).discardBuffer(j, z);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long readDiscontinuity() {
        return ((androidx.media3.exoplayer.source.MediaPeriod) androidx.media3.common.util.Util.castNonNull(this.mediaPeriod)).readDiscontinuity();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public long getBufferedPositionUs() {
        return ((androidx.media3.exoplayer.source.MediaPeriod) androidx.media3.common.util.Util.castNonNull(this.mediaPeriod)).getBufferedPositionUs();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long seekToUs(long j) {
        return ((androidx.media3.exoplayer.source.MediaPeriod) androidx.media3.common.util.Util.castNonNull(this.mediaPeriod)).seekToUs(j);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long getAdjustedSeekPositionUs(long j, androidx.media3.exoplayer.SeekParameters seekParameters) {
        return ((androidx.media3.exoplayer.source.MediaPeriod) androidx.media3.common.util.Util.castNonNull(this.mediaPeriod)).getAdjustedSeekPositionUs(j, seekParameters);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public long getNextLoadPositionUs() {
        return ((androidx.media3.exoplayer.source.MediaPeriod) androidx.media3.common.util.Util.castNonNull(this.mediaPeriod)).getNextLoadPositionUs();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public void reevaluateBuffer(long j) {
        ((androidx.media3.exoplayer.source.MediaPeriod) androidx.media3.common.util.Util.castNonNull(this.mediaPeriod)).reevaluateBuffer(j);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public boolean continueLoading(androidx.media3.exoplayer.LoadingInfo loadingInfo) {
        androidx.media3.exoplayer.source.MediaPeriod mediaPeriod = this.mediaPeriod;
        return mediaPeriod != null && mediaPeriod.continueLoading(loadingInfo);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public boolean isLoading() {
        androidx.media3.exoplayer.source.MediaPeriod mediaPeriod = this.mediaPeriod;
        return mediaPeriod != null && mediaPeriod.isLoading();
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader.Callback
    public void onContinueLoadingRequested(androidx.media3.exoplayer.source.MediaPeriod mediaPeriod) {
        ((androidx.media3.exoplayer.source.MediaPeriod.Callback) androidx.media3.common.util.Util.castNonNull(this.callback)).onContinueLoadingRequested(this);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod.Callback
    public void onPrepared(androidx.media3.exoplayer.source.MediaPeriod mediaPeriod) {
        ((androidx.media3.exoplayer.source.MediaPeriod.Callback) androidx.media3.common.util.Util.castNonNull(this.callback)).onPrepared(this);
        androidx.media3.exoplayer.source.MaskingMediaPeriod.PrepareListener prepareListener = this.listener;
        if (prepareListener != null) {
            prepareListener.onPrepareComplete(this.id);
        }
    }

    private long getPreparePositionWithOverride(long j) {
        long j2 = this.preparePositionOverrideUs;
        return j2 != androidx.media3.common.C.TIME_UNSET ? j2 : j;
    }
}
