package androidx.media3.session;

/* JADX INFO: loaded from: classes.dex */
final class QueueTimeline extends androidx.media3.common.Timeline {
    public static final androidx.media3.session.QueueTimeline DEFAULT = new androidx.media3.session.QueueTimeline(com.google.common.collect.ImmutableList.of(), null);
    private static final java.lang.Object FAKE_WINDOW_UID = new java.lang.Object();
    private final androidx.media3.session.QueueTimeline.QueuedMediaItem fakeQueuedMediaItem;
    private final com.google.common.collect.ImmutableList<androidx.media3.session.QueueTimeline.QueuedMediaItem> queuedMediaItems;

    private QueueTimeline(com.google.common.collect.ImmutableList<androidx.media3.session.QueueTimeline.QueuedMediaItem> immutableList, androidx.media3.session.QueueTimeline.QueuedMediaItem queuedMediaItem) {
        this.queuedMediaItems = immutableList;
        this.fakeQueuedMediaItem = queuedMediaItem;
    }

    public static androidx.media3.session.QueueTimeline create(java.util.List<androidx.media3.session.legacy.MediaSessionCompat.QueueItem> list) {
        com.google.common.collect.ImmutableList.Builder builder = new com.google.common.collect.ImmutableList.Builder();
        for (int i = 0; i < list.size(); i++) {
            androidx.media3.session.legacy.MediaSessionCompat.QueueItem queueItem = list.get(i);
            builder.add(new androidx.media3.session.QueueTimeline.QueuedMediaItem(androidx.media3.session.LegacyConversions.convertToMediaItem(queueItem), queueItem.getQueueId(), androidx.media3.common.C.TIME_UNSET));
        }
        return new androidx.media3.session.QueueTimeline(builder.build(), null);
    }

    public androidx.media3.session.QueueTimeline copy() {
        return new androidx.media3.session.QueueTimeline(this.queuedMediaItems, this.fakeQueuedMediaItem);
    }

    public long getQueueId(int i) {
        if (i < 0 || i >= this.queuedMediaItems.size()) {
            return -1L;
        }
        return this.queuedMediaItems.get(i).queueId;
    }

    public androidx.media3.session.QueueTimeline copyWithFakeMediaItem(androidx.media3.common.MediaItem mediaItem, long j) {
        return new androidx.media3.session.QueueTimeline(this.queuedMediaItems, new androidx.media3.session.QueueTimeline.QueuedMediaItem(mediaItem, -1L, j));
    }

    public androidx.media3.session.QueueTimeline copyWithClearedFakeMediaItem() {
        return new androidx.media3.session.QueueTimeline(this.queuedMediaItems, null);
    }

    public androidx.media3.session.QueueTimeline copyWithNewMediaItem(int i, androidx.media3.common.MediaItem mediaItem, long j) {
        androidx.media3.common.util.Assertions.checkArgument(i < this.queuedMediaItems.size() || (i == this.queuedMediaItems.size() && this.fakeQueuedMediaItem != null));
        if (i == this.queuedMediaItems.size()) {
            return new androidx.media3.session.QueueTimeline(this.queuedMediaItems, new androidx.media3.session.QueueTimeline.QueuedMediaItem(mediaItem, -1L, j));
        }
        long j2 = this.queuedMediaItems.get(i).queueId;
        com.google.common.collect.ImmutableList.Builder builder = new com.google.common.collect.ImmutableList.Builder();
        builder.addAll((java.lang.Iterable) this.queuedMediaItems.subList(0, i));
        builder.add(new androidx.media3.session.QueueTimeline.QueuedMediaItem(mediaItem, j2, j));
        com.google.common.collect.ImmutableList<androidx.media3.session.QueueTimeline.QueuedMediaItem> immutableList = this.queuedMediaItems;
        builder.addAll((java.lang.Iterable) immutableList.subList(i + 1, immutableList.size()));
        return new androidx.media3.session.QueueTimeline(builder.build(), this.fakeQueuedMediaItem);
    }

    public androidx.media3.session.QueueTimeline copyWithNewMediaItems(int i, java.util.List<androidx.media3.common.MediaItem> list) {
        com.google.common.collect.ImmutableList.Builder builder = new com.google.common.collect.ImmutableList.Builder();
        builder.addAll((java.lang.Iterable) this.queuedMediaItems.subList(0, i));
        for (int i2 = 0; i2 < list.size(); i2++) {
            builder.add(new androidx.media3.session.QueueTimeline.QueuedMediaItem(list.get(i2), -1L, androidx.media3.common.C.TIME_UNSET));
        }
        com.google.common.collect.ImmutableList<androidx.media3.session.QueueTimeline.QueuedMediaItem> immutableList = this.queuedMediaItems;
        builder.addAll((java.lang.Iterable) immutableList.subList(i, immutableList.size()));
        return new androidx.media3.session.QueueTimeline(builder.build(), this.fakeQueuedMediaItem);
    }

    public androidx.media3.session.QueueTimeline copyWithRemovedMediaItems(int i, int i2) {
        com.google.common.collect.ImmutableList.Builder builder = new com.google.common.collect.ImmutableList.Builder();
        builder.addAll((java.lang.Iterable) this.queuedMediaItems.subList(0, i));
        com.google.common.collect.ImmutableList<androidx.media3.session.QueueTimeline.QueuedMediaItem> immutableList = this.queuedMediaItems;
        builder.addAll((java.lang.Iterable) immutableList.subList(i2, immutableList.size()));
        return new androidx.media3.session.QueueTimeline(builder.build(), this.fakeQueuedMediaItem);
    }

    public androidx.media3.session.QueueTimeline copyWithMovedMediaItems(int i, int i2, int i3) {
        java.util.ArrayList arrayList = new java.util.ArrayList(this.queuedMediaItems);
        androidx.media3.common.util.Util.moveItems(arrayList, i, i2, i3);
        return new androidx.media3.session.QueueTimeline(com.google.common.collect.ImmutableList.copyOf((java.util.Collection) arrayList), this.fakeQueuedMediaItem);
    }

    public boolean contains(androidx.media3.common.MediaItem mediaItem) {
        androidx.media3.session.QueueTimeline.QueuedMediaItem queuedMediaItem = this.fakeQueuedMediaItem;
        if (queuedMediaItem != null && mediaItem.equals(queuedMediaItem.mediaItem)) {
            return true;
        }
        for (int i = 0; i < this.queuedMediaItems.size(); i++) {
            if (mediaItem.equals(this.queuedMediaItems.get(i).mediaItem)) {
                return true;
            }
        }
        return false;
    }

    public androidx.media3.common.MediaItem getMediaItemAt(int i) {
        if (i >= getWindowCount()) {
            return null;
        }
        return getQueuedMediaItem(i).mediaItem;
    }

    @Override // androidx.media3.common.Timeline
    public int getWindowCount() {
        return this.queuedMediaItems.size() + (this.fakeQueuedMediaItem == null ? 0 : 1);
    }

    @Override // androidx.media3.common.Timeline
    public androidx.media3.common.Timeline.Window getWindow(int i, androidx.media3.common.Timeline.Window window, long j) {
        androidx.media3.session.QueueTimeline.QueuedMediaItem queuedMediaItem = getQueuedMediaItem(i);
        window.set(FAKE_WINDOW_UID, queuedMediaItem.mediaItem, null, androidx.media3.common.C.TIME_UNSET, androidx.media3.common.C.TIME_UNSET, androidx.media3.common.C.TIME_UNSET, true, false, null, 0L, androidx.media3.common.util.Util.msToUs(queuedMediaItem.durationMs), i, i, 0L);
        return window;
    }

    @Override // androidx.media3.common.Timeline
    public int getPeriodCount() {
        return getWindowCount();
    }

    @Override // androidx.media3.common.Timeline
    public androidx.media3.common.Timeline.Period getPeriod(int i, androidx.media3.common.Timeline.Period period, boolean z) {
        androidx.media3.session.QueueTimeline.QueuedMediaItem queuedMediaItem = getQueuedMediaItem(i);
        period.set(java.lang.Long.valueOf(queuedMediaItem.queueId), null, i, androidx.media3.common.util.Util.msToUs(queuedMediaItem.durationMs), 0L);
        return period;
    }

    @Override // androidx.media3.common.Timeline
    public int getIndexOfPeriod(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // androidx.media3.common.Timeline
    public java.lang.Object getUidOfPeriod(int i) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // androidx.media3.common.Timeline
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.media3.session.QueueTimeline)) {
            return false;
        }
        androidx.media3.session.QueueTimeline queueTimeline = (androidx.media3.session.QueueTimeline) obj;
        return com.google.common.base.Objects.equal(this.queuedMediaItems, queueTimeline.queuedMediaItems) && com.google.common.base.Objects.equal(this.fakeQueuedMediaItem, queueTimeline.fakeQueuedMediaItem);
    }

    @Override // androidx.media3.common.Timeline
    public int hashCode() {
        return com.google.common.base.Objects.hashCode(this.queuedMediaItems, this.fakeQueuedMediaItem);
    }

    private androidx.media3.session.QueueTimeline.QueuedMediaItem getQueuedMediaItem(int i) {
        androidx.media3.session.QueueTimeline.QueuedMediaItem queuedMediaItem;
        return (i != this.queuedMediaItems.size() || (queuedMediaItem = this.fakeQueuedMediaItem) == null) ? this.queuedMediaItems.get(i) : queuedMediaItem;
    }

    private static final class QueuedMediaItem {
        public final long durationMs;
        public final androidx.media3.common.MediaItem mediaItem;
        public final long queueId;

        public QueuedMediaItem(androidx.media3.common.MediaItem mediaItem, long j, long j2) {
            this.mediaItem = mediaItem;
            this.queueId = j;
            this.durationMs = j2;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof androidx.media3.session.QueueTimeline.QueuedMediaItem)) {
                return false;
            }
            androidx.media3.session.QueueTimeline.QueuedMediaItem queuedMediaItem = (androidx.media3.session.QueueTimeline.QueuedMediaItem) obj;
            return this.queueId == queuedMediaItem.queueId && this.mediaItem.equals(queuedMediaItem.mediaItem) && this.durationMs == queuedMediaItem.durationMs;
        }

        public int hashCode() {
            long j = this.queueId;
            int iHashCode = (((217 + ((int) (j ^ (j >>> 32)))) * 31) + this.mediaItem.hashCode()) * 31;
            long j2 = this.durationMs;
            return iHashCode + ((int) (j2 ^ (j2 >>> 32)));
        }
    }
}
