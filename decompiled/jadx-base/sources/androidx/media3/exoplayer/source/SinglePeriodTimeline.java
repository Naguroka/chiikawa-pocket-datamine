package androidx.media3.exoplayer.source;

/* JADX INFO: loaded from: classes.dex */
public final class SinglePeriodTimeline extends androidx.media3.common.Timeline {
    private final long elapsedRealtimeEpochOffsetMs;
    private final boolean isDynamic;
    private final boolean isSeekable;
    private final androidx.media3.common.MediaItem.LiveConfiguration liveConfiguration;
    private final java.lang.Object manifest;
    private final androidx.media3.common.MediaItem mediaItem;
    private final long periodDurationUs;
    private final long presentationStartTimeMs;
    private final boolean suppressPositionProjection;
    private final long windowDefaultStartPositionUs;
    private final long windowDurationUs;
    private final long windowPositionInPeriodUs;
    private final long windowStartTimeMs;
    private static final java.lang.Object UID = new java.lang.Object();
    private static final androidx.media3.common.MediaItem MEDIA_ITEM = new androidx.media3.common.MediaItem.Builder().setMediaId("SinglePeriodTimeline").setUri(android.net.Uri.EMPTY).build();

    @Override // androidx.media3.common.Timeline
    public int getPeriodCount() {
        return 1;
    }

    @Override // androidx.media3.common.Timeline
    public int getWindowCount() {
        return 1;
    }

    @java.lang.Deprecated
    public SinglePeriodTimeline(long j, boolean z, boolean z2, boolean z3, java.lang.Object obj, java.lang.Object obj2) {
        this(j, j, 0L, 0L, z, z2, z3, obj, obj2);
    }

    public SinglePeriodTimeline(long j, boolean z, boolean z2, boolean z3, java.lang.Object obj, androidx.media3.common.MediaItem mediaItem) {
        this(j, j, 0L, 0L, z, z2, z3, obj, mediaItem);
    }

    @java.lang.Deprecated
    public SinglePeriodTimeline(long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, java.lang.Object obj, java.lang.Object obj2) {
        this(androidx.media3.common.C.TIME_UNSET, androidx.media3.common.C.TIME_UNSET, androidx.media3.common.C.TIME_UNSET, j, j2, j3, j4, z, z2, z3, obj, obj2);
    }

    public SinglePeriodTimeline(long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, java.lang.Object obj, androidx.media3.common.MediaItem mediaItem) {
        this(androidx.media3.common.C.TIME_UNSET, androidx.media3.common.C.TIME_UNSET, androidx.media3.common.C.TIME_UNSET, j, j2, j3, j4, z, z2, false, obj, mediaItem, z3 ? mediaItem.liveConfiguration : null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @java.lang.Deprecated
    public SinglePeriodTimeline(long j, long j2, long j3, long j4, long j5, long j6, long j7, boolean z, boolean z2, boolean z3, java.lang.Object obj, java.lang.Object obj2) {
        androidx.media3.common.MediaItem mediaItem = MEDIA_ITEM;
        this(j, j2, j3, j4, j5, j6, j7, z, z2, false, obj, mediaItem.buildUpon().setTag(obj2).build(), z3 ? mediaItem.liveConfiguration : null);
    }

    @java.lang.Deprecated
    public SinglePeriodTimeline(long j, long j2, long j3, long j4, long j5, long j6, long j7, boolean z, boolean z2, java.lang.Object obj, androidx.media3.common.MediaItem mediaItem, androidx.media3.common.MediaItem.LiveConfiguration liveConfiguration) {
        this(j, j2, j3, j4, j5, j6, j7, z, z2, false, obj, mediaItem, liveConfiguration);
    }

    public SinglePeriodTimeline(long j, long j2, long j3, long j4, long j5, long j6, long j7, boolean z, boolean z2, boolean z3, java.lang.Object obj, androidx.media3.common.MediaItem mediaItem, androidx.media3.common.MediaItem.LiveConfiguration liveConfiguration) {
        this.presentationStartTimeMs = j;
        this.windowStartTimeMs = j2;
        this.elapsedRealtimeEpochOffsetMs = j3;
        this.periodDurationUs = j4;
        this.windowDurationUs = j5;
        this.windowPositionInPeriodUs = j6;
        this.windowDefaultStartPositionUs = j7;
        this.isSeekable = z;
        this.isDynamic = z2;
        this.suppressPositionProjection = z3;
        this.manifest = obj;
        this.mediaItem = (androidx.media3.common.MediaItem) androidx.media3.common.util.Assertions.checkNotNull(mediaItem);
        this.liveConfiguration = liveConfiguration;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002e A[PHI: r1
  0x002e: PHI (r1v2 long) = (r1v1 long), (r1v1 long), (r1v1 long), (r1v10 long) binds: [B:3:0x000d, B:5:0x0011, B:7:0x0017, B:12:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.media3.common.Timeline
    public androidx.media3.common.Timeline.Window getWindow(int i, androidx.media3.common.Timeline.Window window, long j) {
        long j2;
        androidx.media3.common.util.Assertions.checkIndex(i, 0, 1);
        long j3 = this.windowDefaultStartPositionUs;
        if (!this.isDynamic || this.suppressPositionProjection || j == 0) {
            j2 = j3;
        } else {
            long j4 = this.windowDurationUs;
            if (j4 != androidx.media3.common.C.TIME_UNSET) {
                j3 += j;
                if (j3 <= j4) {
                    j2 = j3;
                }
            }
            j2 = -9223372036854775807L;
        }
        return window.set(androidx.media3.common.Timeline.Window.SINGLE_WINDOW_UID, this.mediaItem, this.manifest, this.presentationStartTimeMs, this.windowStartTimeMs, this.elapsedRealtimeEpochOffsetMs, this.isSeekable, this.isDynamic, this.liveConfiguration, j2, this.windowDurationUs, 0, 0, this.windowPositionInPeriodUs);
    }

    @Override // androidx.media3.common.Timeline
    public androidx.media3.common.Timeline.Period getPeriod(int i, androidx.media3.common.Timeline.Period period, boolean z) {
        androidx.media3.common.util.Assertions.checkIndex(i, 0, 1);
        return period.set(null, z ? UID : null, 0, this.periodDurationUs, -this.windowPositionInPeriodUs);
    }

    @Override // androidx.media3.common.Timeline
    public int getIndexOfPeriod(java.lang.Object obj) {
        return UID.equals(obj) ? 0 : -1;
    }

    @Override // androidx.media3.common.Timeline
    public java.lang.Object getUidOfPeriod(int i) {
        androidx.media3.common.util.Assertions.checkIndex(i, 0, 1);
        return UID;
    }
}
