package androidx.media3.exoplayer.source;

/* JADX INFO: loaded from: classes.dex */
public final class MergingMediaSource extends androidx.media3.exoplayer.source.CompositeMediaSource<java.lang.Integer> {
    private static final int PERIOD_COUNT_UNSET = -1;
    private static final androidx.media3.common.MediaItem PLACEHOLDER_MEDIA_ITEM = new androidx.media3.common.MediaItem.Builder().setMediaId("MergingMediaSource").build();
    private final boolean adjustPeriodTimeOffsets;
    private final boolean clipDurations;
    private final java.util.Map<java.lang.Object, java.lang.Long> clippedDurationsUs;
    private final com.google.common.collect.Multimap<java.lang.Object, androidx.media3.exoplayer.source.ClippingMediaPeriod> clippedMediaPeriods;
    private final androidx.media3.exoplayer.source.CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory;
    private final androidx.media3.exoplayer.source.MediaSource[] mediaSources;
    private androidx.media3.exoplayer.source.MergingMediaSource.IllegalMergeException mergeError;
    private final java.util.ArrayList<androidx.media3.exoplayer.source.MediaSource> pendingTimelineSources;
    private int periodCount;
    private long[][] periodTimeOffsetsUs;
    private final androidx.media3.common.Timeline[] timelines;

    public static final class IllegalMergeException extends java.io.IOException {
        public static final int REASON_PERIOD_COUNT_MISMATCH = 0;
        public final int reason;

        @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
        @java.lang.annotation.Documented
        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public @interface Reason {
        }

        public IllegalMergeException(int i) {
            this.reason = i;
        }
    }

    public MergingMediaSource(androidx.media3.exoplayer.source.MediaSource... mediaSourceArr) {
        this(false, mediaSourceArr);
    }

    public MergingMediaSource(boolean z, androidx.media3.exoplayer.source.MediaSource... mediaSourceArr) {
        this(z, false, mediaSourceArr);
    }

    public MergingMediaSource(boolean z, boolean z2, androidx.media3.exoplayer.source.MediaSource... mediaSourceArr) {
        this(z, z2, new androidx.media3.exoplayer.source.DefaultCompositeSequenceableLoaderFactory(), mediaSourceArr);
    }

    public MergingMediaSource(boolean z, boolean z2, androidx.media3.exoplayer.source.CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory, androidx.media3.exoplayer.source.MediaSource... mediaSourceArr) {
        this.adjustPeriodTimeOffsets = z;
        this.clipDurations = z2;
        this.mediaSources = mediaSourceArr;
        this.compositeSequenceableLoaderFactory = compositeSequenceableLoaderFactory;
        this.pendingTimelineSources = new java.util.ArrayList<>(java.util.Arrays.asList(mediaSourceArr));
        this.periodCount = -1;
        this.timelines = new androidx.media3.common.Timeline[mediaSourceArr.length];
        this.periodTimeOffsetsUs = new long[0][];
        this.clippedDurationsUs = new java.util.HashMap();
        this.clippedMediaPeriods = com.google.common.collect.MultimapBuilder.hashKeys().arrayListValues().build();
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public androidx.media3.common.MediaItem getMediaItem() {
        androidx.media3.exoplayer.source.MediaSource[] mediaSourceArr = this.mediaSources;
        return mediaSourceArr.length > 0 ? mediaSourceArr[0].getMediaItem() : PLACEHOLDER_MEDIA_ITEM;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public boolean canUpdateMediaItem(androidx.media3.common.MediaItem mediaItem) {
        androidx.media3.exoplayer.source.MediaSource[] mediaSourceArr = this.mediaSources;
        return mediaSourceArr.length > 0 && mediaSourceArr[0].canUpdateMediaItem(mediaItem);
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public void updateMediaItem(androidx.media3.common.MediaItem mediaItem) {
        this.mediaSources[0].updateMediaItem(mediaItem);
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.BaseMediaSource
    protected void prepareSourceInternal(androidx.media3.datasource.TransferListener transferListener) {
        super.prepareSourceInternal(transferListener);
        for (int i = 0; i < this.mediaSources.length; i++) {
            prepareChildSource(java.lang.Integer.valueOf(i), this.mediaSources[i]);
        }
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.MediaSource
    public void maybeThrowSourceInfoRefreshError() throws java.io.IOException {
        androidx.media3.exoplayer.source.MergingMediaSource.IllegalMergeException illegalMergeException = this.mergeError;
        if (illegalMergeException != null) {
            throw illegalMergeException;
        }
        super.maybeThrowSourceInfoRefreshError();
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public androidx.media3.exoplayer.source.MediaPeriod createPeriod(androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, androidx.media3.exoplayer.upstream.Allocator allocator, long j) {
        int length = this.mediaSources.length;
        androidx.media3.exoplayer.source.MediaPeriod[] mediaPeriodArr = new androidx.media3.exoplayer.source.MediaPeriod[length];
        int indexOfPeriod = this.timelines[0].getIndexOfPeriod(mediaPeriodId.periodUid);
        for (int i = 0; i < length; i++) {
            mediaPeriodArr[i] = this.mediaSources[i].createPeriod(mediaPeriodId.copyWithPeriodUid(this.timelines[i].getUidOfPeriod(indexOfPeriod)), allocator, j - this.periodTimeOffsetsUs[indexOfPeriod][i]);
        }
        androidx.media3.exoplayer.source.MergingMediaPeriod mergingMediaPeriod = new androidx.media3.exoplayer.source.MergingMediaPeriod(this.compositeSequenceableLoaderFactory, this.periodTimeOffsetsUs[indexOfPeriod], mediaPeriodArr);
        if (!this.clipDurations) {
            return mergingMediaPeriod;
        }
        androidx.media3.exoplayer.source.ClippingMediaPeriod clippingMediaPeriod = new androidx.media3.exoplayer.source.ClippingMediaPeriod(mergingMediaPeriod, true, 0L, ((java.lang.Long) androidx.media3.common.util.Assertions.checkNotNull(this.clippedDurationsUs.get(mediaPeriodId.periodUid))).longValue());
        this.clippedMediaPeriods.put(mediaPeriodId.periodUid, clippingMediaPeriod);
        return clippingMediaPeriod;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public void releasePeriod(androidx.media3.exoplayer.source.MediaPeriod mediaPeriod) {
        if (this.clipDurations) {
            androidx.media3.exoplayer.source.ClippingMediaPeriod clippingMediaPeriod = (androidx.media3.exoplayer.source.ClippingMediaPeriod) mediaPeriod;
            for (java.util.Map.Entry<java.lang.Object, androidx.media3.exoplayer.source.ClippingMediaPeriod> entry : this.clippedMediaPeriods.entries()) {
                if (entry.getValue().equals(clippingMediaPeriod)) {
                    this.clippedMediaPeriods.remove(entry.getKey(), entry.getValue());
                    break;
                }
            }
            mediaPeriod = clippingMediaPeriod.mediaPeriod;
        }
        androidx.media3.exoplayer.source.MergingMediaPeriod mergingMediaPeriod = (androidx.media3.exoplayer.source.MergingMediaPeriod) mediaPeriod;
        int i = 0;
        while (true) {
            androidx.media3.exoplayer.source.MediaSource[] mediaSourceArr = this.mediaSources;
            if (i >= mediaSourceArr.length) {
                return;
            }
            mediaSourceArr[i].releasePeriod(mergingMediaPeriod.getChildPeriod(i));
            i++;
        }
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.BaseMediaSource
    protected void releaseSourceInternal() {
        super.releaseSourceInternal();
        java.util.Arrays.fill(this.timelines, (java.lang.Object) null);
        this.periodCount = -1;
        this.mergeError = null;
        this.pendingTimelineSources.clear();
        java.util.Collections.addAll(this.pendingTimelineSources, this.mediaSources);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media3.exoplayer.source.CompositeMediaSource
    /* JADX INFO: renamed from: onChildSourceInfoRefreshed, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void m179x28f9175(java.lang.Integer num, androidx.media3.exoplayer.source.MediaSource mediaSource, androidx.media3.common.Timeline timeline) {
        if (this.mergeError != null) {
            return;
        }
        if (this.periodCount == -1) {
            this.periodCount = timeline.getPeriodCount();
        } else if (timeline.getPeriodCount() != this.periodCount) {
            this.mergeError = new androidx.media3.exoplayer.source.MergingMediaSource.IllegalMergeException(0);
            return;
        }
        if (this.periodTimeOffsetsUs.length == 0) {
            this.periodTimeOffsetsUs = (long[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Long.TYPE, this.periodCount, this.timelines.length);
        }
        this.pendingTimelineSources.remove(mediaSource);
        this.timelines[num.intValue()] = timeline;
        if (this.pendingTimelineSources.isEmpty()) {
            if (this.adjustPeriodTimeOffsets) {
                computePeriodTimeOffsets();
            }
            androidx.media3.common.Timeline clippedTimeline = this.timelines[0];
            if (this.clipDurations) {
                updateClippedDuration();
                clippedTimeline = new androidx.media3.exoplayer.source.MergingMediaSource.ClippedTimeline(clippedTimeline, this.clippedDurationsUs);
            }
            refreshSourceInfo(clippedTimeline);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media3.exoplayer.source.CompositeMediaSource
    public androidx.media3.exoplayer.source.MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(java.lang.Integer num, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) {
        if (num.intValue() == 0) {
            return mediaPeriodId;
        }
        return null;
    }

    private void computePeriodTimeOffsets() {
        androidx.media3.common.Timeline.Period period = new androidx.media3.common.Timeline.Period();
        for (int i = 0; i < this.periodCount; i++) {
            long j = -this.timelines[0].getPeriod(i, period).getPositionInWindowUs();
            int i2 = 1;
            while (true) {
                androidx.media3.common.Timeline[] timelineArr = this.timelines;
                if (i2 < timelineArr.length) {
                    this.periodTimeOffsetsUs[i][i2] = j - (-timelineArr[i2].getPeriod(i, period).getPositionInWindowUs());
                    i2++;
                }
            }
        }
    }

    private void updateClippedDuration() {
        androidx.media3.common.Timeline[] timelineArr;
        androidx.media3.common.Timeline.Period period = new androidx.media3.common.Timeline.Period();
        for (int i = 0; i < this.periodCount; i++) {
            int i2 = 0;
            long j = Long.MIN_VALUE;
            while (true) {
                timelineArr = this.timelines;
                if (i2 >= timelineArr.length) {
                    break;
                }
                long durationUs = timelineArr[i2].getPeriod(i, period).getDurationUs();
                if (durationUs != androidx.media3.common.C.TIME_UNSET) {
                    long j2 = durationUs + this.periodTimeOffsetsUs[i][i2];
                    if (j == Long.MIN_VALUE || j2 < j) {
                        j = j2;
                    }
                }
                i2++;
            }
            java.lang.Object uidOfPeriod = timelineArr[0].getUidOfPeriod(i);
            this.clippedDurationsUs.put(uidOfPeriod, java.lang.Long.valueOf(j));
            java.util.Iterator<androidx.media3.exoplayer.source.ClippingMediaPeriod> it = this.clippedMediaPeriods.get(uidOfPeriod).iterator();
            while (it.hasNext()) {
                it.next().updateClipping(0L, j);
            }
        }
    }

    private static final class ClippedTimeline extends androidx.media3.exoplayer.source.ForwardingTimeline {
        private final long[] periodDurationsUs;
        private final long[] windowDurationsUs;

        public ClippedTimeline(androidx.media3.common.Timeline timeline, java.util.Map<java.lang.Object, java.lang.Long> map) {
            super(timeline);
            int windowCount = timeline.getWindowCount();
            this.windowDurationsUs = new long[timeline.getWindowCount()];
            androidx.media3.common.Timeline.Window window = new androidx.media3.common.Timeline.Window();
            for (int i = 0; i < windowCount; i++) {
                this.windowDurationsUs[i] = timeline.getWindow(i, window).durationUs;
            }
            int periodCount = timeline.getPeriodCount();
            this.periodDurationsUs = new long[periodCount];
            androidx.media3.common.Timeline.Period period = new androidx.media3.common.Timeline.Period();
            for (int i2 = 0; i2 < periodCount; i2++) {
                timeline.getPeriod(i2, period, true);
                long jLongValue = ((java.lang.Long) androidx.media3.common.util.Assertions.checkNotNull(map.get(period.uid))).longValue();
                this.periodDurationsUs[i2] = jLongValue == Long.MIN_VALUE ? period.durationUs : jLongValue;
                if (period.durationUs != androidx.media3.common.C.TIME_UNSET) {
                    long[] jArr = this.windowDurationsUs;
                    int i3 = period.windowIndex;
                    jArr[i3] = jArr[i3] - (period.durationUs - this.periodDurationsUs[i2]);
                }
            }
        }

        @Override // androidx.media3.exoplayer.source.ForwardingTimeline, androidx.media3.common.Timeline
        public androidx.media3.common.Timeline.Window getWindow(int i, androidx.media3.common.Timeline.Window window, long j) {
            long jMin;
            super.getWindow(i, window, j);
            window.durationUs = this.windowDurationsUs[i];
            if (window.durationUs == androidx.media3.common.C.TIME_UNSET || window.defaultPositionUs == androidx.media3.common.C.TIME_UNSET) {
                jMin = window.defaultPositionUs;
            } else {
                jMin = java.lang.Math.min(window.defaultPositionUs, window.durationUs);
            }
            window.defaultPositionUs = jMin;
            return window;
        }

        @Override // androidx.media3.exoplayer.source.ForwardingTimeline, androidx.media3.common.Timeline
        public androidx.media3.common.Timeline.Period getPeriod(int i, androidx.media3.common.Timeline.Period period, boolean z) {
            super.getPeriod(i, period, z);
            period.durationUs = this.periodDurationsUs[i];
            return period;
        }
    }
}
