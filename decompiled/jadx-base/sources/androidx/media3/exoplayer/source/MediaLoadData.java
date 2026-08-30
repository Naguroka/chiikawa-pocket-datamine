package androidx.media3.exoplayer.source;

/* JADX INFO: loaded from: classes.dex */
public final class MediaLoadData {
    public final int dataType;
    public final long mediaEndTimeMs;
    public final long mediaStartTimeMs;
    public final androidx.media3.common.Format trackFormat;
    public final java.lang.Object trackSelectionData;
    public final int trackSelectionReason;
    public final int trackType;

    public MediaLoadData(int i) {
        this(i, -1, null, 0, null, androidx.media3.common.C.TIME_UNSET, androidx.media3.common.C.TIME_UNSET);
    }

    public MediaLoadData(int i, int i2, androidx.media3.common.Format format, int i3, java.lang.Object obj, long j, long j2) {
        this.dataType = i;
        this.trackType = i2;
        this.trackFormat = format;
        this.trackSelectionReason = i3;
        this.trackSelectionData = obj;
        this.mediaStartTimeMs = j;
        this.mediaEndTimeMs = j2;
    }
}
