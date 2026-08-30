package androidx.media3.datasource.cache;

/* JADX INFO: loaded from: classes.dex */
public interface CacheEvictor extends androidx.media3.datasource.cache.Cache.Listener {
    void onCacheInitialized();

    void onStartFile(androidx.media3.datasource.cache.Cache cache, java.lang.String str, long j, long j2);

    boolean requiresCacheSpanTouches();
}
