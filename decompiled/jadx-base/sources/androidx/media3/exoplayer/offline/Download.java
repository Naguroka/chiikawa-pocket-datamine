package androidx.media3.exoplayer.offline;

/* JADX INFO: loaded from: classes.dex */
public final class Download {
    public static final int FAILURE_REASON_NONE = 0;
    public static final int FAILURE_REASON_UNKNOWN = 1;
    public static final int STATE_COMPLETED = 3;
    public static final int STATE_DOWNLOADING = 2;
    public static final int STATE_FAILED = 4;
    public static final int STATE_QUEUED = 0;
    public static final int STATE_REMOVING = 5;
    public static final int STATE_RESTARTING = 7;
    public static final int STATE_STOPPED = 1;
    public static final int STOP_REASON_NONE = 0;
    public final long contentLength;
    public final int failureReason;
    final androidx.media3.exoplayer.offline.DownloadProgress progress;
    public final androidx.media3.exoplayer.offline.DownloadRequest request;
    public final long startTimeMs;
    public final int state;
    public final int stopReason;
    public final long updateTimeMs;

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface FailureReason {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface State {
    }

    public Download(androidx.media3.exoplayer.offline.DownloadRequest downloadRequest, int i, long j, long j2, long j3, int i2, int i3) {
        this(downloadRequest, i, j, j2, j3, i2, i3, new androidx.media3.exoplayer.offline.DownloadProgress());
    }

    public Download(androidx.media3.exoplayer.offline.DownloadRequest downloadRequest, int i, long j, long j2, long j3, int i2, int i3, androidx.media3.exoplayer.offline.DownloadProgress downloadProgress) {
        androidx.media3.common.util.Assertions.checkNotNull(downloadProgress);
        androidx.media3.common.util.Assertions.checkArgument((i3 == 0) == (i != 4));
        if (i2 != 0) {
            androidx.media3.common.util.Assertions.checkArgument((i == 2 || i == 0) ? false : true);
        }
        this.request = downloadRequest;
        this.state = i;
        this.startTimeMs = j;
        this.updateTimeMs = j2;
        this.contentLength = j3;
        this.stopReason = i2;
        this.failureReason = i3;
        this.progress = downloadProgress;
    }

    public boolean isTerminalState() {
        int i = this.state;
        return i == 3 || i == 4;
    }

    public long getBytesDownloaded() {
        return this.progress.bytesDownloaded;
    }

    public float getPercentDownloaded() {
        return this.progress.percentDownloaded;
    }
}
