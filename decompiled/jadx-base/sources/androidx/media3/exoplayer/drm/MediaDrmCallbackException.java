package androidx.media3.exoplayer.drm;

/* JADX INFO: loaded from: classes.dex */
public final class MediaDrmCallbackException extends java.io.IOException {
    public final long bytesLoaded;
    public final androidx.media3.datasource.DataSpec dataSpec;
    public final java.util.Map<java.lang.String, java.util.List<java.lang.String>> responseHeaders;
    public final android.net.Uri uriAfterRedirects;

    public MediaDrmCallbackException(androidx.media3.datasource.DataSpec dataSpec, android.net.Uri uri, java.util.Map<java.lang.String, java.util.List<java.lang.String>> map, long j, java.lang.Throwable th) {
        super(th);
        this.dataSpec = dataSpec;
        this.uriAfterRedirects = uri;
        this.responseHeaders = map;
        this.bytesLoaded = j;
    }
}
