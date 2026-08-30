package androidx.media3.exoplayer.source.ads;

/* JADX INFO: loaded from: classes.dex */
public final class SinglePeriodAdTimeline extends androidx.media3.exoplayer.source.ForwardingTimeline {
    private final androidx.media3.common.AdPlaybackState adPlaybackState;

    public SinglePeriodAdTimeline(androidx.media3.common.Timeline timeline, androidx.media3.common.AdPlaybackState adPlaybackState) {
        super(timeline);
        androidx.media3.common.util.Assertions.checkState(timeline.getPeriodCount() == 1);
        androidx.media3.common.util.Assertions.checkState(timeline.getWindowCount() == 1);
        this.adPlaybackState = adPlaybackState;
    }

    @Override // androidx.media3.exoplayer.source.ForwardingTimeline, androidx.media3.common.Timeline
    public androidx.media3.common.Timeline.Period getPeriod(int i, androidx.media3.common.Timeline.Period period, boolean z) {
        this.timeline.getPeriod(i, period, z);
        period.set(period.id, period.uid, period.windowIndex, period.durationUs == androidx.media3.common.C.TIME_UNSET ? this.adPlaybackState.contentDurationUs : period.durationUs, period.getPositionInWindowUs(), this.adPlaybackState, period.isPlaceholder);
        return period;
    }
}
