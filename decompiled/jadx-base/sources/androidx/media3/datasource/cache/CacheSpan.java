package androidx.media3.datasource.cache;

/* JADX INFO: loaded from: classes.dex */
public class CacheSpan implements java.lang.Comparable<androidx.media3.datasource.cache.CacheSpan> {
    public final java.io.File file;
    public final boolean isCached;
    public final java.lang.String key;
    public final long lastTouchTimestamp;
    public final long length;
    public final long position;

    public CacheSpan(java.lang.String str, long j, long j2) {
        this(str, j, j2, androidx.media3.common.C.TIME_UNSET, null);
    }

    public CacheSpan(java.lang.String str, long j, long j2, long j3, java.io.File file) {
        this.key = str;
        this.position = j;
        this.length = j2;
        this.isCached = file != null;
        this.file = file;
        this.lastTouchTimestamp = j3;
    }

    public boolean isOpenEnded() {
        return this.length == -1;
    }

    public boolean isHoleSpan() {
        return !this.isCached;
    }

    @Override // java.lang.Comparable
    public int compareTo(androidx.media3.datasource.cache.CacheSpan cacheSpan) {
        if (!this.key.equals(cacheSpan.key)) {
            return this.key.compareTo(cacheSpan.key);
        }
        long j = this.position - cacheSpan.position;
        if (j == 0) {
            return 0;
        }
        return j < 0 ? -1 : 1;
    }

    public java.lang.String toString() {
        return com.ironsource.y8.i.d + this.position + ", " + this.length + com.ironsource.y8.i.e;
    }
}
