package androidx.media3.exoplayer;

/* JADX INFO: loaded from: classes.dex */
final class PlaylistTimeline extends androidx.media3.exoplayer.AbstractConcatenatedTimeline {
    private final java.util.HashMap<java.lang.Object, java.lang.Integer> childIndexByUid;
    private final int[] firstPeriodInChildIndices;
    private final int[] firstWindowInChildIndices;
    private final int periodCount;
    private final androidx.media3.common.Timeline[] timelines;
    private final java.lang.Object[] uids;
    private final int windowCount;

    public PlaylistTimeline(java.util.Collection<? extends androidx.media3.exoplayer.MediaSourceInfoHolder> collection, androidx.media3.exoplayer.source.ShuffleOrder shuffleOrder) {
        this(getTimelines(collection), getUids(collection), shuffleOrder);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private PlaylistTimeline(androidx.media3.common.Timeline[] timelineArr, java.lang.Object[] objArr, androidx.media3.exoplayer.source.ShuffleOrder shuffleOrder) {
        super(false, shuffleOrder);
        int i = 0;
        int length = timelineArr.length;
        this.timelines = timelineArr;
        this.firstPeriodInChildIndices = new int[length];
        this.firstWindowInChildIndices = new int[length];
        this.uids = objArr;
        this.childIndexByUid = new java.util.HashMap<>();
        int length2 = timelineArr.length;
        int windowCount = 0;
        int periodCount = 0;
        int i2 = 0;
        while (i < length2) {
            androidx.media3.common.Timeline timeline = timelineArr[i];
            this.timelines[i2] = timeline;
            this.firstWindowInChildIndices[i2] = windowCount;
            this.firstPeriodInChildIndices[i2] = periodCount;
            windowCount += timeline.getWindowCount();
            periodCount += this.timelines[i2].getPeriodCount();
            this.childIndexByUid.put(objArr[i2], java.lang.Integer.valueOf(i2));
            i++;
            i2++;
        }
        this.windowCount = windowCount;
        this.periodCount = periodCount;
    }

    java.util.List<androidx.media3.common.Timeline> getChildTimelines() {
        return java.util.Arrays.asList(this.timelines);
    }

    @Override // androidx.media3.exoplayer.AbstractConcatenatedTimeline
    protected int getChildIndexByPeriodIndex(int i) {
        return androidx.media3.common.util.Util.binarySearchFloor(this.firstPeriodInChildIndices, i + 1, false, false);
    }

    @Override // androidx.media3.exoplayer.AbstractConcatenatedTimeline
    protected int getChildIndexByWindowIndex(int i) {
        return androidx.media3.common.util.Util.binarySearchFloor(this.firstWindowInChildIndices, i + 1, false, false);
    }

    @Override // androidx.media3.exoplayer.AbstractConcatenatedTimeline
    protected int getChildIndexByChildUid(java.lang.Object obj) {
        java.lang.Integer num = this.childIndexByUid.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // androidx.media3.exoplayer.AbstractConcatenatedTimeline
    protected androidx.media3.common.Timeline getTimelineByChildIndex(int i) {
        return this.timelines[i];
    }

    @Override // androidx.media3.exoplayer.AbstractConcatenatedTimeline
    protected int getFirstPeriodIndexByChildIndex(int i) {
        return this.firstPeriodInChildIndices[i];
    }

    @Override // androidx.media3.exoplayer.AbstractConcatenatedTimeline
    protected int getFirstWindowIndexByChildIndex(int i) {
        return this.firstWindowInChildIndices[i];
    }

    @Override // androidx.media3.exoplayer.AbstractConcatenatedTimeline
    protected java.lang.Object getChildUidByChildIndex(int i) {
        return this.uids[i];
    }

    @Override // androidx.media3.common.Timeline
    public int getWindowCount() {
        return this.windowCount;
    }

    @Override // androidx.media3.common.Timeline
    public int getPeriodCount() {
        return this.periodCount;
    }

    public androidx.media3.exoplayer.PlaylistTimeline copyWithPlaceholderTimeline(androidx.media3.exoplayer.source.ShuffleOrder shuffleOrder) {
        androidx.media3.common.Timeline[] timelineArr = new androidx.media3.common.Timeline[this.timelines.length];
        for (int i = 0; i < this.timelines.length; i++) {
            timelineArr[i] = new androidx.media3.exoplayer.source.ForwardingTimeline(this.timelines[i]) { // from class: androidx.media3.exoplayer.PlaylistTimeline.1
                private final androidx.media3.common.Timeline.Window window = new androidx.media3.common.Timeline.Window();

                @Override // androidx.media3.exoplayer.source.ForwardingTimeline, androidx.media3.common.Timeline
                public androidx.media3.common.Timeline.Period getPeriod(int i2, androidx.media3.common.Timeline.Period period, boolean z) {
                    androidx.media3.common.Timeline.Period period2 = super.getPeriod(i2, period, z);
                    if (super.getWindow(period2.windowIndex, this.window).isLive()) {
                        period2.set(period.id, period.uid, period.windowIndex, period.durationUs, period.positionInWindowUs, androidx.media3.common.AdPlaybackState.NONE, true);
                    } else {
                        period2.isPlaceholder = true;
                    }
                    return period2;
                }
            };
        }
        return new androidx.media3.exoplayer.PlaylistTimeline(timelineArr, this.uids, shuffleOrder);
    }

    private static java.lang.Object[] getUids(java.util.Collection<? extends androidx.media3.exoplayer.MediaSourceInfoHolder> collection) {
        java.lang.Object[] objArr = new java.lang.Object[collection.size()];
        java.util.Iterator<? extends androidx.media3.exoplayer.MediaSourceInfoHolder> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            objArr[i] = it.next().getUid();
            i++;
        }
        return objArr;
    }

    private static androidx.media3.common.Timeline[] getTimelines(java.util.Collection<? extends androidx.media3.exoplayer.MediaSourceInfoHolder> collection) {
        androidx.media3.common.Timeline[] timelineArr = new androidx.media3.common.Timeline[collection.size()];
        java.util.Iterator<? extends androidx.media3.exoplayer.MediaSourceInfoHolder> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            timelineArr[i] = it.next().getTimeline();
            i++;
        }
        return timelineArr;
    }
}
