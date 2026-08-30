package androidx.media3.exoplayer.source;

/* JADX INFO: loaded from: classes.dex */
public final class ClippingMediaSource extends androidx.media3.exoplayer.source.WrappingMediaSource {
    private final boolean allowDynamicClippingUpdates;
    private androidx.media3.exoplayer.source.ClippingMediaSource.IllegalClippingException clippingError;
    private androidx.media3.exoplayer.source.ClippingMediaSource.ClippingTimeline clippingTimeline;
    private final boolean enableInitialDiscontinuity;
    private final long endUs;
    private final java.util.ArrayList<androidx.media3.exoplayer.source.ClippingMediaPeriod> mediaPeriods;
    private long periodEndUs;
    private long periodStartUs;
    private final boolean relativeToDefaultPosition;
    private final long startUs;
    private final androidx.media3.common.Timeline.Window window;

    public static final class IllegalClippingException extends java.io.IOException {
        public static final int REASON_INVALID_PERIOD_COUNT = 0;
        public static final int REASON_NOT_SEEKABLE_TO_START = 1;
        public static final int REASON_START_EXCEEDS_END = 2;
        public final int reason;

        @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
        @java.lang.annotation.Documented
        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public @interface Reason {
        }

        private static java.lang.String getReasonDescription(int i) {
            if (i == 0) {
                return "invalid period count";
            }
            if (i != 1) {
                return i != 2 ? "unknown" : "start exceeds end";
            }
            return "not seekable to start";
        }

        public IllegalClippingException(int i) {
            super("Illegal clipping: " + getReasonDescription(i));
            this.reason = i;
        }
    }

    public ClippingMediaSource(androidx.media3.exoplayer.source.MediaSource mediaSource, long j, long j2) {
        this(mediaSource, j, j2, true, false, false);
    }

    public ClippingMediaSource(androidx.media3.exoplayer.source.MediaSource mediaSource, long j) {
        this(mediaSource, 0L, j, true, false, true);
    }

    public ClippingMediaSource(androidx.media3.exoplayer.source.MediaSource mediaSource, long j, long j2, boolean z, boolean z2, boolean z3) {
        super((androidx.media3.exoplayer.source.MediaSource) androidx.media3.common.util.Assertions.checkNotNull(mediaSource));
        androidx.media3.common.util.Assertions.checkArgument(j >= 0);
        this.startUs = j;
        this.endUs = j2;
        this.enableInitialDiscontinuity = z;
        this.allowDynamicClippingUpdates = z2;
        this.relativeToDefaultPosition = z3;
        this.mediaPeriods = new java.util.ArrayList<>();
        this.window = new androidx.media3.common.Timeline.Window();
    }

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource, androidx.media3.exoplayer.source.MediaSource
    public boolean canUpdateMediaItem(androidx.media3.common.MediaItem mediaItem) {
        return getMediaItem().clippingConfiguration.equals(mediaItem.clippingConfiguration) && this.mediaSource.canUpdateMediaItem(mediaItem);
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.MediaSource
    public void maybeThrowSourceInfoRefreshError() throws java.io.IOException {
        androidx.media3.exoplayer.source.ClippingMediaSource.IllegalClippingException illegalClippingException = this.clippingError;
        if (illegalClippingException != null) {
            throw illegalClippingException;
        }
        super.maybeThrowSourceInfoRefreshError();
    }

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource, androidx.media3.exoplayer.source.MediaSource
    public androidx.media3.exoplayer.source.MediaPeriod createPeriod(androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, androidx.media3.exoplayer.upstream.Allocator allocator, long j) {
        androidx.media3.exoplayer.source.ClippingMediaPeriod clippingMediaPeriod = new androidx.media3.exoplayer.source.ClippingMediaPeriod(this.mediaSource.createPeriod(mediaPeriodId, allocator, j), this.enableInitialDiscontinuity, this.periodStartUs, this.periodEndUs);
        this.mediaPeriods.add(clippingMediaPeriod);
        return clippingMediaPeriod;
    }

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource, androidx.media3.exoplayer.source.MediaSource
    public void releasePeriod(androidx.media3.exoplayer.source.MediaPeriod mediaPeriod) {
        androidx.media3.common.util.Assertions.checkState(this.mediaPeriods.remove(mediaPeriod));
        this.mediaSource.releasePeriod(((androidx.media3.exoplayer.source.ClippingMediaPeriod) mediaPeriod).mediaPeriod);
        if (!this.mediaPeriods.isEmpty() || this.allowDynamicClippingUpdates) {
            return;
        }
        refreshClippedTimeline(((androidx.media3.exoplayer.source.ClippingMediaSource.ClippingTimeline) androidx.media3.common.util.Assertions.checkNotNull(this.clippingTimeline)).timeline);
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.BaseMediaSource
    protected void releaseSourceInternal() {
        super.releaseSourceInternal();
        this.clippingError = null;
        this.clippingTimeline = null;
    }

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource
    protected void onChildSourceInfoRefreshed(androidx.media3.common.Timeline timeline) {
        if (this.clippingError != null) {
            return;
        }
        refreshClippedTimeline(timeline);
    }

    private void refreshClippedTimeline(androidx.media3.common.Timeline timeline) {
        long j;
        long j2;
        timeline.getWindow(0, this.window);
        long positionInFirstPeriodUs = this.window.getPositionInFirstPeriodUs();
        if (this.clippingTimeline == null || this.mediaPeriods.isEmpty() || this.allowDynamicClippingUpdates) {
            long j3 = this.startUs;
            long j4 = this.endUs;
            if (this.relativeToDefaultPosition) {
                long defaultPositionUs = this.window.getDefaultPositionUs();
                j3 += defaultPositionUs;
                j4 += defaultPositionUs;
            }
            this.periodStartUs = positionInFirstPeriodUs + j3;
            this.periodEndUs = this.endUs != Long.MIN_VALUE ? positionInFirstPeriodUs + j4 : Long.MIN_VALUE;
            int size = this.mediaPeriods.size();
            for (int i = 0; i < size; i++) {
                this.mediaPeriods.get(i).updateClipping(this.periodStartUs, this.periodEndUs);
            }
            j = j3;
            j2 = j4;
        } else {
            long j5 = this.periodStartUs - positionInFirstPeriodUs;
            j2 = this.endUs != Long.MIN_VALUE ? this.periodEndUs - positionInFirstPeriodUs : Long.MIN_VALUE;
            j = j5;
        }
        try {
            androidx.media3.exoplayer.source.ClippingMediaSource.ClippingTimeline clippingTimeline = new androidx.media3.exoplayer.source.ClippingMediaSource.ClippingTimeline(timeline, j, j2);
            this.clippingTimeline = clippingTimeline;
            refreshSourceInfo(clippingTimeline);
        } catch (androidx.media3.exoplayer.source.ClippingMediaSource.IllegalClippingException e) {
            this.clippingError = e;
            for (int i2 = 0; i2 < this.mediaPeriods.size(); i2++) {
                this.mediaPeriods.get(i2).setClippingError(this.clippingError);
            }
        }
    }

    private static final class ClippingTimeline extends androidx.media3.exoplayer.source.ForwardingTimeline {
        private final long durationUs;
        private final long endUs;
        private final boolean isDynamic;
        private final long startUs;

        public ClippingTimeline(androidx.media3.common.Timeline timeline, long j, long j2) throws androidx.media3.exoplayer.source.ClippingMediaSource.IllegalClippingException {
            super(timeline);
            boolean z = false;
            if (timeline.getPeriodCount() != 1) {
                throw new androidx.media3.exoplayer.source.ClippingMediaSource.IllegalClippingException(0);
            }
            androidx.media3.common.Timeline.Window window = timeline.getWindow(0, new androidx.media3.common.Timeline.Window());
            long jMax = java.lang.Math.max(0L, j);
            if (!window.isPlaceholder && jMax != 0 && !window.isSeekable) {
                throw new androidx.media3.exoplayer.source.ClippingMediaSource.IllegalClippingException(1);
            }
            long jMax2 = j2 == Long.MIN_VALUE ? window.durationUs : java.lang.Math.max(0L, j2);
            if (window.durationUs != androidx.media3.common.C.TIME_UNSET) {
                jMax2 = jMax2 > window.durationUs ? window.durationUs : jMax2;
                if (jMax > jMax2) {
                    throw new androidx.media3.exoplayer.source.ClippingMediaSource.IllegalClippingException(2);
                }
            }
            this.startUs = jMax;
            this.endUs = jMax2;
            this.durationUs = jMax2 == androidx.media3.common.C.TIME_UNSET ? -9223372036854775807L : jMax2 - jMax;
            if (window.isDynamic && (jMax2 == androidx.media3.common.C.TIME_UNSET || (window.durationUs != androidx.media3.common.C.TIME_UNSET && jMax2 == window.durationUs))) {
                z = true;
            }
            this.isDynamic = z;
        }

        @Override // androidx.media3.exoplayer.source.ForwardingTimeline, androidx.media3.common.Timeline
        public androidx.media3.common.Timeline.Window getWindow(int i, androidx.media3.common.Timeline.Window window, long j) {
            this.timeline.getWindow(0, window, 0L);
            window.positionInFirstPeriodUs += this.startUs;
            window.durationUs = this.durationUs;
            window.isDynamic = this.isDynamic;
            if (window.defaultPositionUs != androidx.media3.common.C.TIME_UNSET) {
                window.defaultPositionUs = java.lang.Math.max(window.defaultPositionUs, this.startUs);
                long j2 = this.endUs;
                long jMin = window.defaultPositionUs;
                if (j2 != androidx.media3.common.C.TIME_UNSET) {
                    jMin = java.lang.Math.min(jMin, this.endUs);
                }
                window.defaultPositionUs = jMin;
                window.defaultPositionUs -= this.startUs;
            }
            long jUsToMs = androidx.media3.common.util.Util.usToMs(this.startUs);
            if (window.presentationStartTimeMs != androidx.media3.common.C.TIME_UNSET) {
                window.presentationStartTimeMs += jUsToMs;
            }
            if (window.windowStartTimeMs != androidx.media3.common.C.TIME_UNSET) {
                window.windowStartTimeMs += jUsToMs;
            }
            return window;
        }

        @Override // androidx.media3.exoplayer.source.ForwardingTimeline, androidx.media3.common.Timeline
        public androidx.media3.common.Timeline.Period getPeriod(int i, androidx.media3.common.Timeline.Period period, boolean z) {
            this.timeline.getPeriod(0, period, z);
            long positionInWindowUs = period.getPositionInWindowUs() - this.startUs;
            long j = this.durationUs;
            return period.set(period.id, period.uid, 0, j == androidx.media3.common.C.TIME_UNSET ? -9223372036854775807L : j - positionInWindowUs, positionInWindowUs);
        }
    }
}
