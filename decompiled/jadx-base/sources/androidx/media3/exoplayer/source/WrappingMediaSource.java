package androidx.media3.exoplayer.source;

/* JADX INFO: loaded from: classes.dex */
public abstract class WrappingMediaSource extends androidx.media3.exoplayer.source.CompositeMediaSource<java.lang.Void> {
    private static final java.lang.Void CHILD_SOURCE_ID = null;
    protected final androidx.media3.exoplayer.source.MediaSource mediaSource;

    protected androidx.media3.exoplayer.source.MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) {
        return mediaPeriodId;
    }

    protected long getMediaTimeForChildMediaTime(long j, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) {
        return j;
    }

    protected int getWindowIndexForChildWindowIndex(int i) {
        return i;
    }

    protected WrappingMediaSource(androidx.media3.exoplayer.source.MediaSource mediaSource) {
        this.mediaSource = mediaSource;
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.BaseMediaSource
    protected final void prepareSourceInternal(androidx.media3.datasource.TransferListener transferListener) {
        super.prepareSourceInternal(transferListener);
        prepareSourceInternal();
    }

    protected void prepareSourceInternal() {
        prepareChildSource();
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public androidx.media3.common.Timeline getInitialTimeline() {
        return this.mediaSource.getInitialTimeline();
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public boolean isSingleWindow() {
        return this.mediaSource.isSingleWindow();
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public androidx.media3.common.MediaItem getMediaItem() {
        return this.mediaSource.getMediaItem();
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public boolean canUpdateMediaItem(androidx.media3.common.MediaItem mediaItem) {
        return this.mediaSource.canUpdateMediaItem(mediaItem);
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public void updateMediaItem(androidx.media3.common.MediaItem mediaItem) {
        this.mediaSource.updateMediaItem(mediaItem);
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public androidx.media3.exoplayer.source.MediaPeriod createPeriod(androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, androidx.media3.exoplayer.upstream.Allocator allocator, long j) {
        return this.mediaSource.createPeriod(mediaPeriodId, allocator, j);
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public void releasePeriod(androidx.media3.exoplayer.source.MediaPeriod mediaPeriod) {
        this.mediaSource.releasePeriod(mediaPeriod);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media3.exoplayer.source.CompositeMediaSource
    /* JADX INFO: renamed from: onChildSourceInfoRefreshed, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public final void m179x28f9175(java.lang.Void r1, androidx.media3.exoplayer.source.MediaSource mediaSource, androidx.media3.common.Timeline timeline) {
        onChildSourceInfoRefreshed(timeline);
    }

    protected void onChildSourceInfoRefreshed(androidx.media3.common.Timeline timeline) {
        refreshSourceInfo(timeline);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media3.exoplayer.source.CompositeMediaSource
    public final int getWindowIndexForChildWindowIndex(java.lang.Void r1, int i) {
        return getWindowIndexForChildWindowIndex(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media3.exoplayer.source.CompositeMediaSource
    public final androidx.media3.exoplayer.source.MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(java.lang.Void r1, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) {
        return getMediaPeriodIdForChildMediaPeriodId(mediaPeriodId);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media3.exoplayer.source.CompositeMediaSource
    public final long getMediaTimeForChildMediaTime(java.lang.Void r1, long j, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) {
        return getMediaTimeForChildMediaTime(j, mediaPeriodId);
    }

    protected final void prepareChildSource() {
        prepareChildSource(CHILD_SOURCE_ID, this.mediaSource);
    }

    protected final void enableChildSource() {
        enableChildSource(CHILD_SOURCE_ID);
    }

    protected final void disableChildSource() {
        disableChildSource(CHILD_SOURCE_ID);
    }

    protected final void releaseChildSource() {
        releaseChildSource(CHILD_SOURCE_ID);
    }
}
