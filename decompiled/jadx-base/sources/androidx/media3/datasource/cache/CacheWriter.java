package androidx.media3.datasource.cache;

/* JADX INFO: loaded from: classes.dex */
public final class CacheWriter {
    public static final int DEFAULT_BUFFER_SIZE_BYTES = 131072;
    private long bytesCached;
    private final androidx.media3.datasource.cache.Cache cache;
    private final java.lang.String cacheKey;
    private final androidx.media3.datasource.cache.CacheDataSource dataSource;
    private final androidx.media3.datasource.DataSpec dataSpec;
    private long endPosition;
    private volatile boolean isCanceled;
    private long nextPosition;
    private final androidx.media3.datasource.cache.CacheWriter.ProgressListener progressListener;
    private final byte[] temporaryBuffer;

    public interface ProgressListener {
        void onProgress(long j, long j2, long j3);
    }

    public CacheWriter(androidx.media3.datasource.cache.CacheDataSource cacheDataSource, androidx.media3.datasource.DataSpec dataSpec, byte[] bArr, androidx.media3.datasource.cache.CacheWriter.ProgressListener progressListener) {
        this.dataSource = cacheDataSource;
        this.cache = cacheDataSource.getCache();
        this.dataSpec = dataSpec;
        this.temporaryBuffer = bArr == null ? new byte[131072] : bArr;
        this.progressListener = progressListener;
        this.cacheKey = cacheDataSource.getCacheKeyFactory().buildCacheKey(dataSpec);
        this.nextPosition = dataSpec.position;
    }

    public void cancel() {
        this.isCanceled = true;
    }

    public void cache() throws java.io.IOException {
        throwIfCanceled();
        this.bytesCached = this.cache.getCachedBytes(this.cacheKey, this.dataSpec.position, this.dataSpec.length);
        if (this.dataSpec.length != -1) {
            this.endPosition = this.dataSpec.position + this.dataSpec.length;
        } else {
            long contentLength = androidx.media3.datasource.cache.ContentMetadata.getContentLength(this.cache.getContentMetadata(this.cacheKey));
            if (contentLength == -1) {
                contentLength = -1;
            }
            this.endPosition = contentLength;
        }
        androidx.media3.datasource.cache.CacheWriter.ProgressListener progressListener = this.progressListener;
        if (progressListener != null) {
            progressListener.onProgress(getLength(), this.bytesCached, 0L);
        }
        while (true) {
            long j = this.endPosition;
            if (j != -1 && this.nextPosition >= j) {
                return;
            }
            throwIfCanceled();
            long j2 = this.endPosition;
            long cachedLength = this.cache.getCachedLength(this.cacheKey, this.nextPosition, j2 == -1 ? Long.MAX_VALUE : j2 - this.nextPosition);
            if (cachedLength > 0) {
                this.nextPosition += cachedLength;
            } else {
                long j3 = -cachedLength;
                if (j3 == Long.MAX_VALUE) {
                    j3 = -1;
                }
                long j4 = this.nextPosition;
                this.nextPosition = j4 + readBlockToCache(j4, j3);
            }
        }
    }

    private long readBlockToCache(long j, long j2) throws java.io.IOException {
        long jOpen;
        boolean z = true;
        boolean z2 = j + j2 == this.endPosition || j2 == -1;
        if (j2 != -1) {
            try {
                jOpen = this.dataSource.open(this.dataSpec.buildUpon().setPosition(j).setLength(j2).build());
            } catch (java.io.IOException unused) {
                androidx.media3.datasource.DataSourceUtil.closeQuietly(this.dataSource);
                z = false;
                jOpen = -1;
            }
        } else {
            z = false;
            jOpen = -1;
        }
        if (!z) {
            throwIfCanceled();
            try {
                jOpen = this.dataSource.open(this.dataSpec.buildUpon().setPosition(j).setLength(-1L).build());
            } catch (java.io.IOException e) {
                androidx.media3.datasource.DataSourceUtil.closeQuietly(this.dataSource);
                throw e;
            }
        }
        if (z2 && jOpen != -1) {
            try {
                onRequestEndPosition(jOpen + j);
            } catch (java.io.IOException e2) {
                androidx.media3.datasource.DataSourceUtil.closeQuietly(this.dataSource);
                throw e2;
            }
        }
        int i = 0;
        int i2 = 0;
        while (i != -1) {
            throwIfCanceled();
            androidx.media3.datasource.cache.CacheDataSource cacheDataSource = this.dataSource;
            byte[] bArr = this.temporaryBuffer;
            i = cacheDataSource.read(bArr, 0, bArr.length);
            if (i != -1) {
                onNewBytesCached(i);
                i2 += i;
            }
        }
        if (z2) {
            onRequestEndPosition(j + ((long) i2));
        }
        this.dataSource.close();
        return i2;
    }

    private void onRequestEndPosition(long j) {
        if (this.endPosition == j) {
            return;
        }
        this.endPosition = j;
        androidx.media3.datasource.cache.CacheWriter.ProgressListener progressListener = this.progressListener;
        if (progressListener != null) {
            progressListener.onProgress(getLength(), this.bytesCached, 0L);
        }
    }

    private void onNewBytesCached(long j) {
        this.bytesCached += j;
        androidx.media3.datasource.cache.CacheWriter.ProgressListener progressListener = this.progressListener;
        if (progressListener != null) {
            progressListener.onProgress(getLength(), this.bytesCached, j);
        }
    }

    private long getLength() {
        long j = this.endPosition;
        if (j == -1) {
            return -1L;
        }
        return j - this.dataSpec.position;
    }

    private void throwIfCanceled() throws java.io.InterruptedIOException {
        if (this.isCanceled) {
            throw new java.io.InterruptedIOException();
        }
    }
}
