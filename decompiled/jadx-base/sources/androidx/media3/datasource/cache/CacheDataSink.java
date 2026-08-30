package androidx.media3.datasource.cache;

/* JADX INFO: loaded from: classes.dex */
public final class CacheDataSink implements androidx.media3.datasource.DataSink {
    public static final int DEFAULT_BUFFER_SIZE = 20480;
    public static final long DEFAULT_FRAGMENT_SIZE = 5242880;
    private static final long MIN_RECOMMENDED_FRAGMENT_SIZE = 2097152;
    private static final java.lang.String TAG = "CacheDataSink";
    private final int bufferSize;
    private androidx.media3.datasource.cache.ReusableBufferedOutputStream bufferedOutputStream;
    private final androidx.media3.datasource.cache.Cache cache;
    private androidx.media3.datasource.DataSpec dataSpec;
    private long dataSpecBytesWritten;
    private long dataSpecFragmentSize;
    private java.io.File file;
    private final long fragmentSize;
    private java.io.OutputStream outputStream;
    private long outputStreamBytesWritten;

    public static final class Factory implements androidx.media3.datasource.DataSink.Factory {
        private androidx.media3.datasource.cache.Cache cache;
        private long fragmentSize = 5242880;
        private int bufferSize = androidx.media3.datasource.cache.CacheDataSink.DEFAULT_BUFFER_SIZE;

        public androidx.media3.datasource.cache.CacheDataSink.Factory setCache(androidx.media3.datasource.cache.Cache cache) {
            this.cache = cache;
            return this;
        }

        public androidx.media3.datasource.cache.CacheDataSink.Factory setFragmentSize(long j) {
            this.fragmentSize = j;
            return this;
        }

        public androidx.media3.datasource.cache.CacheDataSink.Factory setBufferSize(int i) {
            this.bufferSize = i;
            return this;
        }

        @Override // androidx.media3.datasource.DataSink.Factory
        public androidx.media3.datasource.DataSink createDataSink() {
            return new androidx.media3.datasource.cache.CacheDataSink((androidx.media3.datasource.cache.Cache) androidx.media3.common.util.Assertions.checkNotNull(this.cache), this.fragmentSize, this.bufferSize);
        }
    }

    public static final class CacheDataSinkException extends androidx.media3.datasource.cache.Cache.CacheException {
        public CacheDataSinkException(java.io.IOException iOException) {
            super(iOException);
        }
    }

    public CacheDataSink(androidx.media3.datasource.cache.Cache cache, long j) {
        this(cache, j, DEFAULT_BUFFER_SIZE);
    }

    public CacheDataSink(androidx.media3.datasource.cache.Cache cache, long j, int i) {
        androidx.media3.common.util.Assertions.checkState(j > 0 || j == -1, "fragmentSize must be positive or C.LENGTH_UNSET.");
        if (j != -1 && j < 2097152) {
            androidx.media3.common.util.Log.w(TAG, "fragmentSize is below the minimum recommended value of 2097152. This may cause poor cache performance.");
        }
        this.cache = (androidx.media3.datasource.cache.Cache) androidx.media3.common.util.Assertions.checkNotNull(cache);
        this.fragmentSize = j == -1 ? Long.MAX_VALUE : j;
        this.bufferSize = i;
    }

    @Override // androidx.media3.datasource.DataSink
    public void open(androidx.media3.datasource.DataSpec dataSpec) throws androidx.media3.datasource.cache.CacheDataSink.CacheDataSinkException {
        androidx.media3.common.util.Assertions.checkNotNull(dataSpec.key);
        if (dataSpec.length == -1 && dataSpec.isFlagSet(2)) {
            this.dataSpec = null;
            return;
        }
        this.dataSpec = dataSpec;
        this.dataSpecFragmentSize = dataSpec.isFlagSet(4) ? this.fragmentSize : Long.MAX_VALUE;
        this.dataSpecBytesWritten = 0L;
        try {
            openNextOutputStream(dataSpec);
        } catch (java.io.IOException e) {
            throw new androidx.media3.datasource.cache.CacheDataSink.CacheDataSinkException(e);
        }
    }

    @Override // androidx.media3.datasource.DataSink
    public void write(byte[] bArr, int i, int i2) throws androidx.media3.datasource.cache.CacheDataSink.CacheDataSinkException {
        androidx.media3.datasource.DataSpec dataSpec = this.dataSpec;
        if (dataSpec == null) {
            return;
        }
        int i3 = 0;
        while (i3 < i2) {
            try {
                if (this.outputStreamBytesWritten == this.dataSpecFragmentSize) {
                    closeCurrentOutputStream();
                    openNextOutputStream(dataSpec);
                }
                int iMin = (int) java.lang.Math.min(i2 - i3, this.dataSpecFragmentSize - this.outputStreamBytesWritten);
                ((java.io.OutputStream) androidx.media3.common.util.Util.castNonNull(this.outputStream)).write(bArr, i + i3, iMin);
                i3 += iMin;
                long j = iMin;
                this.outputStreamBytesWritten += j;
                this.dataSpecBytesWritten += j;
            } catch (java.io.IOException e) {
                throw new androidx.media3.datasource.cache.CacheDataSink.CacheDataSinkException(e);
            }
        }
    }

    @Override // androidx.media3.datasource.DataSink
    public void close() throws androidx.media3.datasource.cache.CacheDataSink.CacheDataSinkException {
        if (this.dataSpec == null) {
            return;
        }
        try {
            closeCurrentOutputStream();
        } catch (java.io.IOException e) {
            throw new androidx.media3.datasource.cache.CacheDataSink.CacheDataSinkException(e);
        }
    }

    private void openNextOutputStream(androidx.media3.datasource.DataSpec dataSpec) throws java.io.IOException {
        this.file = this.cache.startFile((java.lang.String) androidx.media3.common.util.Util.castNonNull(dataSpec.key), dataSpec.position + this.dataSpecBytesWritten, dataSpec.length != -1 ? java.lang.Math.min(dataSpec.length - this.dataSpecBytesWritten, this.dataSpecFragmentSize) : -1L);
        java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(this.file);
        if (this.bufferSize > 0) {
            androidx.media3.datasource.cache.ReusableBufferedOutputStream reusableBufferedOutputStream = this.bufferedOutputStream;
            if (reusableBufferedOutputStream == null) {
                this.bufferedOutputStream = new androidx.media3.datasource.cache.ReusableBufferedOutputStream(fileOutputStream, this.bufferSize);
            } else {
                reusableBufferedOutputStream.reset(fileOutputStream);
            }
            this.outputStream = this.bufferedOutputStream;
        } else {
            this.outputStream = fileOutputStream;
        }
        this.outputStreamBytesWritten = 0L;
    }

    private void closeCurrentOutputStream() throws java.io.IOException {
        java.io.OutputStream outputStream = this.outputStream;
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.flush();
            androidx.media3.common.util.Util.closeQuietly(this.outputStream);
            this.outputStream = null;
            java.io.File file = (java.io.File) androidx.media3.common.util.Util.castNonNull(this.file);
            this.file = null;
            this.cache.commitFile(file, this.outputStreamBytesWritten);
        } catch (java.lang.Throwable th) {
            androidx.media3.common.util.Util.closeQuietly(this.outputStream);
            this.outputStream = null;
            java.io.File file2 = (java.io.File) androidx.media3.common.util.Util.castNonNull(this.file);
            this.file = null;
            file2.delete();
            throw th;
        }
    }
}
