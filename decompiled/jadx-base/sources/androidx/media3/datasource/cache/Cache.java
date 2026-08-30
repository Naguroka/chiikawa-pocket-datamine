package androidx.media3.datasource.cache;

/* JADX INFO: loaded from: classes.dex */
public interface Cache {
    public static final long UID_UNSET = -1;

    public interface Listener {
        void onSpanAdded(androidx.media3.datasource.cache.Cache cache, androidx.media3.datasource.cache.CacheSpan cacheSpan);

        void onSpanRemoved(androidx.media3.datasource.cache.Cache cache, androidx.media3.datasource.cache.CacheSpan cacheSpan);

        void onSpanTouched(androidx.media3.datasource.cache.Cache cache, androidx.media3.datasource.cache.CacheSpan cacheSpan, androidx.media3.datasource.cache.CacheSpan cacheSpan2);
    }

    java.util.NavigableSet<androidx.media3.datasource.cache.CacheSpan> addListener(java.lang.String str, androidx.media3.datasource.cache.Cache.Listener listener);

    void applyContentMetadataMutations(java.lang.String str, androidx.media3.datasource.cache.ContentMetadataMutations contentMetadataMutations) throws androidx.media3.datasource.cache.Cache.CacheException;

    void commitFile(java.io.File file, long j) throws androidx.media3.datasource.cache.Cache.CacheException;

    long getCacheSpace();

    long getCachedBytes(java.lang.String str, long j, long j2);

    long getCachedLength(java.lang.String str, long j, long j2);

    java.util.NavigableSet<androidx.media3.datasource.cache.CacheSpan> getCachedSpans(java.lang.String str);

    androidx.media3.datasource.cache.ContentMetadata getContentMetadata(java.lang.String str);

    java.util.Set<java.lang.String> getKeys();

    long getUid();

    boolean isCached(java.lang.String str, long j, long j2);

    void release();

    void releaseHoleSpan(androidx.media3.datasource.cache.CacheSpan cacheSpan);

    void removeListener(java.lang.String str, androidx.media3.datasource.cache.Cache.Listener listener);

    void removeResource(java.lang.String str);

    void removeSpan(androidx.media3.datasource.cache.CacheSpan cacheSpan);

    java.io.File startFile(java.lang.String str, long j, long j2) throws androidx.media3.datasource.cache.Cache.CacheException;

    androidx.media3.datasource.cache.CacheSpan startReadWrite(java.lang.String str, long j, long j2) throws java.lang.InterruptedException, androidx.media3.datasource.cache.Cache.CacheException;

    androidx.media3.datasource.cache.CacheSpan startReadWriteNonBlocking(java.lang.String str, long j, long j2) throws androidx.media3.datasource.cache.Cache.CacheException;

    public static class CacheException extends java.io.IOException {
        public CacheException(java.lang.String str) {
            super(str);
        }

        public CacheException(java.lang.Throwable th) {
            super(th);
        }

        public CacheException(java.lang.String str, java.lang.Throwable th) {
            super(str, th);
        }
    }
}
