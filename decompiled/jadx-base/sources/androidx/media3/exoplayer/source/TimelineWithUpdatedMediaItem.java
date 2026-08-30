package androidx.media3.exoplayer.source;

/* JADX INFO: loaded from: classes.dex */
public final class TimelineWithUpdatedMediaItem extends androidx.media3.exoplayer.source.ForwardingTimeline {
    private final androidx.media3.common.MediaItem updatedMediaItem;

    public TimelineWithUpdatedMediaItem(androidx.media3.common.Timeline timeline, androidx.media3.common.MediaItem mediaItem) {
        super(timeline);
        this.updatedMediaItem = mediaItem;
    }

    @Override // androidx.media3.exoplayer.source.ForwardingTimeline, androidx.media3.common.Timeline
    public androidx.media3.common.Timeline.Window getWindow(int i, androidx.media3.common.Timeline.Window window, long j) {
        super.getWindow(i, window, j);
        window.mediaItem = this.updatedMediaItem;
        window.tag = this.updatedMediaItem.localConfiguration != null ? this.updatedMediaItem.localConfiguration.tag : null;
        return window;
    }
}
