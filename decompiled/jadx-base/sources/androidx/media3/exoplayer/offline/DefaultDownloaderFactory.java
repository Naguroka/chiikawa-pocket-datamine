package androidx.media3.exoplayer.offline;

/* JADX INFO: loaded from: classes.dex */
public class DefaultDownloaderFactory implements androidx.media3.exoplayer.offline.DownloaderFactory {
    private static final android.util.SparseArray<java.lang.reflect.Constructor<? extends androidx.media3.exoplayer.offline.Downloader>> CONSTRUCTORS = createDownloaderConstructors();
    private final androidx.media3.datasource.cache.CacheDataSource.Factory cacheDataSourceFactory;
    private final java.util.concurrent.Executor executor;

    @java.lang.Deprecated
    public DefaultDownloaderFactory(androidx.media3.datasource.cache.CacheDataSource.Factory factory) {
        this(factory, new androidx.media3.exoplayer.dash.offline.DashDownloader$$ExternalSyntheticLambda0());
    }

    public DefaultDownloaderFactory(androidx.media3.datasource.cache.CacheDataSource.Factory factory, java.util.concurrent.Executor executor) {
        this.cacheDataSourceFactory = (androidx.media3.datasource.cache.CacheDataSource.Factory) androidx.media3.common.util.Assertions.checkNotNull(factory);
        this.executor = (java.util.concurrent.Executor) androidx.media3.common.util.Assertions.checkNotNull(executor);
    }

    @Override // androidx.media3.exoplayer.offline.DownloaderFactory
    public androidx.media3.exoplayer.offline.Downloader createDownloader(androidx.media3.exoplayer.offline.DownloadRequest downloadRequest) {
        int iInferContentTypeForUriAndMimeType = androidx.media3.common.util.Util.inferContentTypeForUriAndMimeType(downloadRequest.uri, downloadRequest.mimeType);
        if (iInferContentTypeForUriAndMimeType == 0 || iInferContentTypeForUriAndMimeType == 1 || iInferContentTypeForUriAndMimeType == 2) {
            return createDownloader(downloadRequest, iInferContentTypeForUriAndMimeType);
        }
        if (iInferContentTypeForUriAndMimeType == 4) {
            return new androidx.media3.exoplayer.offline.ProgressiveDownloader(new androidx.media3.common.MediaItem.Builder().setUri(downloadRequest.uri).setCustomCacheKey(downloadRequest.customCacheKey).build(), this.cacheDataSourceFactory, this.executor);
        }
        throw new java.lang.IllegalArgumentException("Unsupported type: " + iInferContentTypeForUriAndMimeType);
    }

    private androidx.media3.exoplayer.offline.Downloader createDownloader(androidx.media3.exoplayer.offline.DownloadRequest downloadRequest, int i) {
        java.lang.reflect.Constructor<? extends androidx.media3.exoplayer.offline.Downloader> constructor = CONSTRUCTORS.get(i);
        if (constructor == null) {
            throw new java.lang.IllegalStateException("Module missing for content type " + i);
        }
        try {
            return constructor.newInstance(new androidx.media3.common.MediaItem.Builder().setUri(downloadRequest.uri).setStreamKeys(downloadRequest.streamKeys).setCustomCacheKey(downloadRequest.customCacheKey).build(), this.cacheDataSourceFactory, this.executor);
        } catch (java.lang.Exception e) {
            throw new java.lang.IllegalStateException("Failed to instantiate downloader for content type " + i, e);
        }
    }

    private static android.util.SparseArray<java.lang.reflect.Constructor<? extends androidx.media3.exoplayer.offline.Downloader>> createDownloaderConstructors() {
        android.util.SparseArray<java.lang.reflect.Constructor<? extends androidx.media3.exoplayer.offline.Downloader>> sparseArray = new android.util.SparseArray<>();
        try {
            sparseArray.put(0, getDownloaderConstructor(java.lang.Class.forName("androidx.media3.exoplayer.dash.offline.DashDownloader")));
        } catch (java.lang.ClassNotFoundException unused) {
        }
        try {
            sparseArray.put(2, getDownloaderConstructor(java.lang.Class.forName("androidx.media3.exoplayer.hls.offline.HlsDownloader")));
        } catch (java.lang.ClassNotFoundException unused2) {
        }
        try {
            sparseArray.put(1, getDownloaderConstructor(java.lang.Class.forName("androidx.media3.exoplayer.smoothstreaming.offline.SsDownloader")));
        } catch (java.lang.ClassNotFoundException unused3) {
        }
        return sparseArray;
    }

    private static java.lang.reflect.Constructor<? extends androidx.media3.exoplayer.offline.Downloader> getDownloaderConstructor(java.lang.Class<?> cls) {
        try {
            return cls.asSubclass(androidx.media3.exoplayer.offline.Downloader.class).getConstructor(androidx.media3.common.MediaItem.class, androidx.media3.datasource.cache.CacheDataSource.Factory.class, java.util.concurrent.Executor.class);
        } catch (java.lang.NoSuchMethodException e) {
            throw new java.lang.IllegalStateException("Downloader constructor missing", e);
        }
    }
}
