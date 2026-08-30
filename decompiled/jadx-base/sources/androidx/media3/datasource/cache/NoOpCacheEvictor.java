package androidx.media3.datasource.cache;

/* JADX INFO: loaded from: classes.dex */
public final class NoOpCacheEvictor implements androidx.media3.datasource.cache.CacheEvictor {
    @Override // androidx.media3.datasource.cache.CacheEvictor
    public void onCacheInitialized() {
    }

    @Override // androidx.media3.datasource.cache.Cache.Listener
    public void onSpanAdded(androidx.media3.datasource.cache.Cache cache, androidx.media3.datasource.cache.CacheSpan cacheSpan) {
    }

    @Override // androidx.media3.datasource.cache.Cache.Listener
    public void onSpanRemoved(androidx.media3.datasource.cache.Cache cache, androidx.media3.datasource.cache.CacheSpan cacheSpan) {
    }

    @Override // androidx.media3.datasource.cache.Cache.Listener
    public void onSpanTouched(androidx.media3.datasource.cache.Cache cache, androidx.media3.datasource.cache.CacheSpan cacheSpan, androidx.media3.datasource.cache.CacheSpan cacheSpan2) {
    }

    @Override // androidx.media3.datasource.cache.CacheEvictor
    public void onStartFile(androidx.media3.datasource.cache.Cache cache, java.lang.String str, long j, long j2) {
    }

    @Override // androidx.media3.datasource.cache.CacheEvictor
    public boolean requiresCacheSpanTouches() {
        return false;
    }
}
