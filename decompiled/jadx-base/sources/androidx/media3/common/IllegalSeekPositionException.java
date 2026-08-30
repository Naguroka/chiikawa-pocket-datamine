package androidx.media3.common;

/* JADX INFO: loaded from: classes.dex */
public final class IllegalSeekPositionException extends java.lang.IllegalStateException {
    public final long positionMs;
    public final androidx.media3.common.Timeline timeline;
    public final int windowIndex;

    public IllegalSeekPositionException(androidx.media3.common.Timeline timeline, int i, long j) {
        this.timeline = timeline;
        this.windowIndex = i;
        this.positionMs = j;
    }
}
