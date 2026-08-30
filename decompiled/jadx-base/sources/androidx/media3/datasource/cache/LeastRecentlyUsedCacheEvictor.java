package androidx.media3.datasource.cache;

/* JADX INFO: loaded from: classes.dex */
public final class LeastRecentlyUsedCacheEvictor implements androidx.media3.datasource.cache.CacheEvictor {
    private long currentSize;
    private final java.util.TreeSet<androidx.media3.datasource.cache.CacheSpan> leastRecentlyUsed = new java.util.TreeSet<>(new java.util.Comparator() { // from class: androidx.media3.datasource.cache.LeastRecentlyUsedCacheEvictor$$ExternalSyntheticLambda0
        @Override // java.util.Comparator
        public final int compare(java.lang.Object obj, java.lang.Object obj2) {
            return androidx.media3.datasource.cache.LeastRecentlyUsedCacheEvictor.compare((androidx.media3.datasource.cache.CacheSpan) obj, (androidx.media3.datasource.cache.CacheSpan) obj2);
        }
    });
    private final long maxBytes;

    @Override // androidx.media3.datasource.cache.CacheEvictor
    public void onCacheInitialized() {
    }

    @Override // androidx.media3.datasource.cache.CacheEvictor
    public boolean requiresCacheSpanTouches() {
        return true;
    }

    public LeastRecentlyUsedCacheEvictor(long j) {
        this.maxBytes = j;
    }

    @Override // androidx.media3.datasource.cache.CacheEvictor
    public void onStartFile(androidx.media3.datasource.cache.Cache cache, java.lang.String str, long j, long j2) {
        if (j2 != -1) {
            evictCache(cache, j2);
        }
    }

    @Override // androidx.media3.datasource.cache.Cache.Listener
    public void onSpanAdded(androidx.media3.datasource.cache.Cache cache, androidx.media3.datasource.cache.CacheSpan cacheSpan) {
        this.leastRecentlyUsed.add(cacheSpan);
        this.currentSize += cacheSpan.length;
        evictCache(cache, 0L);
    }

    @Override // androidx.media3.datasource.cache.Cache.Listener
    public void onSpanRemoved(androidx.media3.datasource.cache.Cache cache, androidx.media3.datasource.cache.CacheSpan cacheSpan) {
        this.leastRecentlyUsed.remove(cacheSpan);
        this.currentSize -= cacheSpan.length;
    }

    @Override // androidx.media3.datasource.cache.Cache.Listener
    public void onSpanTouched(androidx.media3.datasource.cache.Cache cache, androidx.media3.datasource.cache.CacheSpan cacheSpan, androidx.media3.datasource.cache.CacheSpan cacheSpan2) {
        onSpanRemoved(cache, cacheSpan);
        onSpanAdded(cache, cacheSpan2);
    }

    private void evictCache(androidx.media3.datasource.cache.Cache cache, long j) {
        while (this.currentSize + j > this.maxBytes && !this.leastRecentlyUsed.isEmpty()) {
            cache.removeSpan(this.leastRecentlyUsed.first());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int compare(androidx.media3.datasource.cache.CacheSpan cacheSpan, androidx.media3.datasource.cache.CacheSpan cacheSpan2) {
        if (cacheSpan.lastTouchTimestamp - cacheSpan2.lastTouchTimestamp == 0) {
            return cacheSpan.compareTo(cacheSpan2);
        }
        return cacheSpan.lastTouchTimestamp < cacheSpan2.lastTouchTimestamp ? -1 : 1;
    }
}
