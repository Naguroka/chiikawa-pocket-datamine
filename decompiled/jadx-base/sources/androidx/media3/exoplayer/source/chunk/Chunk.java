package androidx.media3.exoplayer.source.chunk;

/* JADX INFO: loaded from: classes.dex */
public abstract class Chunk implements androidx.media3.exoplayer.upstream.Loader.Loadable {
    protected final androidx.media3.datasource.StatsDataSource dataSource;
    public final androidx.media3.datasource.DataSpec dataSpec;
    public final long endTimeUs;
    public final long loadTaskId = androidx.media3.exoplayer.source.LoadEventInfo.getNewId();
    public final long startTimeUs;
    public final androidx.media3.common.Format trackFormat;
    public final java.lang.Object trackSelectionData;
    public final int trackSelectionReason;
    public final int type;

    public Chunk(androidx.media3.datasource.DataSource dataSource, androidx.media3.datasource.DataSpec dataSpec, int i, androidx.media3.common.Format format, int i2, java.lang.Object obj, long j, long j2) {
        this.dataSource = new androidx.media3.datasource.StatsDataSource(dataSource);
        this.dataSpec = (androidx.media3.datasource.DataSpec) androidx.media3.common.util.Assertions.checkNotNull(dataSpec);
        this.type = i;
        this.trackFormat = format;
        this.trackSelectionReason = i2;
        this.trackSelectionData = obj;
        this.startTimeUs = j;
        this.endTimeUs = j2;
    }

    public final long getDurationUs() {
        return this.endTimeUs - this.startTimeUs;
    }

    public final long bytesLoaded() {
        return this.dataSource.getBytesRead();
    }

    public final android.net.Uri getUri() {
        return this.dataSource.getLastOpenedUri();
    }

    public final java.util.Map<java.lang.String, java.util.List<java.lang.String>> getResponseHeaders() {
        return this.dataSource.getLastResponseHeaders();
    }
}
