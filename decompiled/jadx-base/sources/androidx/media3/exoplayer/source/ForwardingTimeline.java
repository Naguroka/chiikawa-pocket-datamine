package androidx.media3.exoplayer.source;

/* JADX INFO: loaded from: classes.dex */
public abstract class ForwardingTimeline extends androidx.media3.common.Timeline {
    protected final androidx.media3.common.Timeline timeline;

    public ForwardingTimeline(androidx.media3.common.Timeline timeline) {
        this.timeline = timeline;
    }

    @Override // androidx.media3.common.Timeline
    public int getWindowCount() {
        return this.timeline.getWindowCount();
    }

    @Override // androidx.media3.common.Timeline
    public int getNextWindowIndex(int i, int i2, boolean z) {
        return this.timeline.getNextWindowIndex(i, i2, z);
    }

    @Override // androidx.media3.common.Timeline
    public int getPreviousWindowIndex(int i, int i2, boolean z) {
        return this.timeline.getPreviousWindowIndex(i, i2, z);
    }

    @Override // androidx.media3.common.Timeline
    public int getLastWindowIndex(boolean z) {
        return this.timeline.getLastWindowIndex(z);
    }

    @Override // androidx.media3.common.Timeline
    public int getFirstWindowIndex(boolean z) {
        return this.timeline.getFirstWindowIndex(z);
    }

    @Override // androidx.media3.common.Timeline
    public androidx.media3.common.Timeline.Window getWindow(int i, androidx.media3.common.Timeline.Window window, long j) {
        return this.timeline.getWindow(i, window, j);
    }

    @Override // androidx.media3.common.Timeline
    public int getPeriodCount() {
        return this.timeline.getPeriodCount();
    }

    @Override // androidx.media3.common.Timeline
    public androidx.media3.common.Timeline.Period getPeriod(int i, androidx.media3.common.Timeline.Period period, boolean z) {
        return this.timeline.getPeriod(i, period, z);
    }

    @Override // androidx.media3.common.Timeline
    public int getIndexOfPeriod(java.lang.Object obj) {
        return this.timeline.getIndexOfPeriod(obj);
    }

    @Override // androidx.media3.common.Timeline
    public java.lang.Object getUidOfPeriod(int i) {
        return this.timeline.getUidOfPeriod(i);
    }
}
