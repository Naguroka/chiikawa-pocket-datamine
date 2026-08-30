package androidx.media3.exoplayer.source;

/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public final class LoopingMediaSource extends androidx.media3.exoplayer.source.WrappingMediaSource {
    private final java.util.Map<androidx.media3.exoplayer.source.MediaSource.MediaPeriodId, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId> childMediaPeriodIdToMediaPeriodId;
    private final int loopCount;
    private final java.util.Map<androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId> mediaPeriodToChildMediaPeriodId;

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource, androidx.media3.exoplayer.source.MediaSource
    public boolean isSingleWindow() {
        return false;
    }

    public LoopingMediaSource(androidx.media3.exoplayer.source.MediaSource mediaSource) {
        this(mediaSource, Integer.MAX_VALUE);
    }

    public LoopingMediaSource(androidx.media3.exoplayer.source.MediaSource mediaSource, int i) {
        super(new androidx.media3.exoplayer.source.MaskingMediaSource(mediaSource, false));
        androidx.media3.common.util.Assertions.checkArgument(i > 0);
        this.loopCount = i;
        this.childMediaPeriodIdToMediaPeriodId = new java.util.HashMap();
        this.mediaPeriodToChildMediaPeriodId = new java.util.HashMap();
    }

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource, androidx.media3.exoplayer.source.MediaSource
    public androidx.media3.common.Timeline getInitialTimeline() {
        androidx.media3.exoplayer.source.MaskingMediaSource maskingMediaSource = (androidx.media3.exoplayer.source.MaskingMediaSource) this.mediaSource;
        if (this.loopCount != Integer.MAX_VALUE) {
            return new androidx.media3.exoplayer.source.LoopingMediaSource.LoopingTimeline(maskingMediaSource.getTimeline(), this.loopCount);
        }
        return new androidx.media3.exoplayer.source.LoopingMediaSource.InfinitelyLoopingTimeline(maskingMediaSource.getTimeline());
    }

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource, androidx.media3.exoplayer.source.MediaSource
    public androidx.media3.exoplayer.source.MediaPeriod createPeriod(androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, androidx.media3.exoplayer.upstream.Allocator allocator, long j) {
        if (this.loopCount == Integer.MAX_VALUE) {
            return this.mediaSource.createPeriod(mediaPeriodId, allocator, j);
        }
        androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodIdCopyWithPeriodUid = mediaPeriodId.copyWithPeriodUid(androidx.media3.exoplayer.source.LoopingMediaSource.LoopingTimeline.getChildPeriodUidFromConcatenatedUid(mediaPeriodId.periodUid));
        this.childMediaPeriodIdToMediaPeriodId.put(mediaPeriodIdCopyWithPeriodUid, mediaPeriodId);
        androidx.media3.exoplayer.source.MediaPeriod mediaPeriodCreatePeriod = this.mediaSource.createPeriod(mediaPeriodIdCopyWithPeriodUid, allocator, j);
        this.mediaPeriodToChildMediaPeriodId.put(mediaPeriodCreatePeriod, mediaPeriodIdCopyWithPeriodUid);
        return mediaPeriodCreatePeriod;
    }

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource, androidx.media3.exoplayer.source.MediaSource
    public void releasePeriod(androidx.media3.exoplayer.source.MediaPeriod mediaPeriod) {
        this.mediaSource.releasePeriod(mediaPeriod);
        androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodIdRemove = this.mediaPeriodToChildMediaPeriodId.remove(mediaPeriod);
        if (mediaPeriodIdRemove != null) {
            this.childMediaPeriodIdToMediaPeriodId.remove(mediaPeriodIdRemove);
        }
    }

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource
    protected void onChildSourceInfoRefreshed(androidx.media3.common.Timeline timeline) {
        androidx.media3.common.Timeline infinitelyLoopingTimeline;
        if (this.loopCount != Integer.MAX_VALUE) {
            infinitelyLoopingTimeline = new androidx.media3.exoplayer.source.LoopingMediaSource.LoopingTimeline(timeline, this.loopCount);
        } else {
            infinitelyLoopingTimeline = new androidx.media3.exoplayer.source.LoopingMediaSource.InfinitelyLoopingTimeline(timeline);
        }
        refreshSourceInfo(infinitelyLoopingTimeline);
    }

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource
    protected androidx.media3.exoplayer.source.MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) {
        return this.loopCount != Integer.MAX_VALUE ? this.childMediaPeriodIdToMediaPeriodId.get(mediaPeriodId) : mediaPeriodId;
    }

    private static final class LoopingTimeline extends androidx.media3.exoplayer.AbstractConcatenatedTimeline {
        private final int childPeriodCount;
        private final androidx.media3.common.Timeline childTimeline;
        private final int childWindowCount;
        private final int loopCount;

        public LoopingTimeline(androidx.media3.common.Timeline timeline, int i) {
            super(false, new androidx.media3.exoplayer.source.ShuffleOrder.UnshuffledShuffleOrder(i));
            this.childTimeline = timeline;
            int periodCount = timeline.getPeriodCount();
            this.childPeriodCount = periodCount;
            this.childWindowCount = timeline.getWindowCount();
            this.loopCount = i;
            if (periodCount > 0) {
                androidx.media3.common.util.Assertions.checkState(i <= Integer.MAX_VALUE / periodCount, "LoopingMediaSource contains too many periods");
            }
        }

        @Override // androidx.media3.common.Timeline
        public int getWindowCount() {
            return this.childWindowCount * this.loopCount;
        }

        @Override // androidx.media3.common.Timeline
        public int getPeriodCount() {
            return this.childPeriodCount * this.loopCount;
        }

        @Override // androidx.media3.exoplayer.AbstractConcatenatedTimeline
        protected int getChildIndexByPeriodIndex(int i) {
            return i / this.childPeriodCount;
        }

        @Override // androidx.media3.exoplayer.AbstractConcatenatedTimeline
        protected int getChildIndexByWindowIndex(int i) {
            return i / this.childWindowCount;
        }

        @Override // androidx.media3.exoplayer.AbstractConcatenatedTimeline
        protected int getChildIndexByChildUid(java.lang.Object obj) {
            if (obj instanceof java.lang.Integer) {
                return ((java.lang.Integer) obj).intValue();
            }
            return -1;
        }

        @Override // androidx.media3.exoplayer.AbstractConcatenatedTimeline
        protected androidx.media3.common.Timeline getTimelineByChildIndex(int i) {
            return this.childTimeline;
        }

        @Override // androidx.media3.exoplayer.AbstractConcatenatedTimeline
        protected int getFirstPeriodIndexByChildIndex(int i) {
            return i * this.childPeriodCount;
        }

        @Override // androidx.media3.exoplayer.AbstractConcatenatedTimeline
        protected int getFirstWindowIndexByChildIndex(int i) {
            return i * this.childWindowCount;
        }

        @Override // androidx.media3.exoplayer.AbstractConcatenatedTimeline
        protected java.lang.Object getChildUidByChildIndex(int i) {
            return java.lang.Integer.valueOf(i);
        }
    }

    private static final class InfinitelyLoopingTimeline extends androidx.media3.exoplayer.source.ForwardingTimeline {
        public InfinitelyLoopingTimeline(androidx.media3.common.Timeline timeline) {
            super(timeline);
        }

        @Override // androidx.media3.exoplayer.source.ForwardingTimeline, androidx.media3.common.Timeline
        public int getNextWindowIndex(int i, int i2, boolean z) {
            int nextWindowIndex = this.timeline.getNextWindowIndex(i, i2, z);
            return nextWindowIndex == -1 ? getFirstWindowIndex(z) : nextWindowIndex;
        }

        @Override // androidx.media3.exoplayer.source.ForwardingTimeline, androidx.media3.common.Timeline
        public int getPreviousWindowIndex(int i, int i2, boolean z) {
            int previousWindowIndex = this.timeline.getPreviousWindowIndex(i, i2, z);
            return previousWindowIndex == -1 ? getLastWindowIndex(z) : previousWindowIndex;
        }
    }
}
