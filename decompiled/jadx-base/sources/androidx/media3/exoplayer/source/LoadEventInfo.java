package androidx.media3.exoplayer.source;

/* JADX INFO: loaded from: classes.dex */
public final class LoadEventInfo {
    private static final java.util.concurrent.atomic.AtomicLong idSource = new java.util.concurrent.atomic.AtomicLong();
    public final long bytesLoaded;
    public final androidx.media3.datasource.DataSpec dataSpec;
    public final long elapsedRealtimeMs;
    public final long loadDurationMs;
    public final long loadTaskId;
    public final java.util.Map<java.lang.String, java.util.List<java.lang.String>> responseHeaders;
    public final android.net.Uri uri;

    public static long getNewId() {
        return idSource.getAndIncrement();
    }

    public LoadEventInfo(long j, androidx.media3.datasource.DataSpec dataSpec, long j2) {
        this(j, dataSpec, dataSpec.uri, java.util.Collections.emptyMap(), j2, 0L, 0L);
    }

    public LoadEventInfo(long j, androidx.media3.datasource.DataSpec dataSpec, android.net.Uri uri, java.util.Map<java.lang.String, java.util.List<java.lang.String>> map, long j2, long j3, long j4) {
        this.loadTaskId = j;
        this.dataSpec = dataSpec;
        this.uri = uri;
        this.responseHeaders = map;
        this.elapsedRealtimeMs = j2;
        this.loadDurationMs = j3;
        this.bytesLoaded = j4;
    }
}
