package androidx.media3.exoplayer.trackselection;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseTrackSelection implements androidx.media3.exoplayer.trackselection.ExoTrackSelection {
    private final long[] excludeUntilTimes;
    private final androidx.media3.common.Format[] formats;
    protected final androidx.media3.common.TrackGroup group;
    private int hashCode;
    protected final int length;
    protected final int[] tracks;
    private final int type;

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public void disable() {
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public void enable() {
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public void onPlaybackSpeed(float f) {
    }

    public BaseTrackSelection(androidx.media3.common.TrackGroup trackGroup, int... iArr) {
        this(trackGroup, iArr, 0);
    }

    public BaseTrackSelection(androidx.media3.common.TrackGroup trackGroup, int[] iArr, int i) {
        int i2 = 0;
        androidx.media3.common.util.Assertions.checkState(iArr.length > 0);
        this.type = i;
        this.group = (androidx.media3.common.TrackGroup) androidx.media3.common.util.Assertions.checkNotNull(trackGroup);
        int length = iArr.length;
        this.length = length;
        this.formats = new androidx.media3.common.Format[length];
        for (int i3 = 0; i3 < iArr.length; i3++) {
            this.formats[i3] = trackGroup.getFormat(iArr[i3]);
        }
        java.util.Arrays.sort(this.formats, new java.util.Comparator() { // from class: androidx.media3.exoplayer.trackselection.BaseTrackSelection$$ExternalSyntheticLambda0
            @Override // java.util.Comparator
            public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                return androidx.media3.exoplayer.trackselection.BaseTrackSelection.lambda$new$0((androidx.media3.common.Format) obj, (androidx.media3.common.Format) obj2);
            }
        });
        this.tracks = new int[this.length];
        while (true) {
            int i4 = this.length;
            if (i2 < i4) {
                this.tracks[i2] = trackGroup.indexOf(this.formats[i2]);
                i2++;
            } else {
                this.excludeUntilTimes = new long[i4];
                return;
            }
        }
    }

    static /* synthetic */ int lambda$new$0(androidx.media3.common.Format format, androidx.media3.common.Format format2) {
        return format2.bitrate - format.bitrate;
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelection
    public final int getType() {
        return this.type;
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelection
    public final androidx.media3.common.TrackGroup getTrackGroup() {
        return this.group;
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelection
    public final int length() {
        return this.tracks.length;
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelection
    public final androidx.media3.common.Format getFormat(int i) {
        return this.formats[i];
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelection
    public final int getIndexInTrackGroup(int i) {
        return this.tracks[i];
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelection
    public final int indexOf(androidx.media3.common.Format format) {
        for (int i = 0; i < this.length; i++) {
            if (this.formats[i] == format) {
                return i;
            }
        }
        return -1;
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelection
    public final int indexOf(int i) {
        for (int i2 = 0; i2 < this.length; i2++) {
            if (this.tracks[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public final androidx.media3.common.Format getSelectedFormat() {
        return this.formats[getSelectedIndex()];
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public final int getSelectedIndexInTrackGroup() {
        return this.tracks[getSelectedIndex()];
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public int evaluateQueueSize(long j, java.util.List<? extends androidx.media3.exoplayer.source.chunk.MediaChunk> list) {
        return list.size();
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public boolean excludeTrack(int i, long j) {
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        boolean zIsTrackExcluded = isTrackExcluded(i, jElapsedRealtime);
        int i2 = 0;
        while (i2 < this.length && !zIsTrackExcluded) {
            zIsTrackExcluded = (i2 == i || isTrackExcluded(i2, jElapsedRealtime)) ? false : true;
            i2++;
        }
        if (!zIsTrackExcluded) {
            return false;
        }
        long[] jArr = this.excludeUntilTimes;
        jArr[i] = java.lang.Math.max(jArr[i], androidx.media3.common.util.Util.addWithOverflowDefault(jElapsedRealtime, j, Long.MAX_VALUE));
        return true;
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public boolean isTrackExcluded(int i, long j) {
        return this.excludeUntilTimes[i] > j;
    }

    public int hashCode() {
        if (this.hashCode == 0) {
            this.hashCode = (java.lang.System.identityHashCode(this.group) * 31) + java.util.Arrays.hashCode(this.tracks);
        }
        return this.hashCode;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        androidx.media3.exoplayer.trackselection.BaseTrackSelection baseTrackSelection = (androidx.media3.exoplayer.trackselection.BaseTrackSelection) obj;
        return this.group.equals(baseTrackSelection.group) && java.util.Arrays.equals(this.tracks, baseTrackSelection.tracks);
    }
}
