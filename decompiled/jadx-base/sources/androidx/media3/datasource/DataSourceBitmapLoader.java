package androidx.media3.datasource;

/* JADX INFO: loaded from: classes.dex */
public final class DataSourceBitmapLoader implements androidx.media3.common.util.BitmapLoader {
    public static final com.google.common.base.Supplier<com.google.common.util.concurrent.ListeningExecutorService> DEFAULT_EXECUTOR_SERVICE = com.google.common.base.Suppliers.memoize(new com.google.common.base.Supplier() { // from class: androidx.media3.datasource.DataSourceBitmapLoader$$ExternalSyntheticLambda1
        @Override // com.google.common.base.Supplier
        public final java.lang.Object get() {
            return com.google.common.util.concurrent.MoreExecutors.listeningDecorator(java.util.concurrent.Executors.newSingleThreadExecutor());
        }
    });
    private final androidx.media3.datasource.DataSource.Factory dataSourceFactory;
    private final com.google.common.util.concurrent.ListeningExecutorService listeningExecutorService;
    private final android.graphics.BitmapFactory.Options options;

    public DataSourceBitmapLoader(android.content.Context context) {
        this((com.google.common.util.concurrent.ListeningExecutorService) androidx.media3.common.util.Assertions.checkStateNotNull(DEFAULT_EXECUTOR_SERVICE.get()), new androidx.media3.datasource.DefaultDataSource.Factory(context));
    }

    public DataSourceBitmapLoader(com.google.common.util.concurrent.ListeningExecutorService listeningExecutorService, androidx.media3.datasource.DataSource.Factory factory) {
        this(listeningExecutorService, factory, null);
    }

    public DataSourceBitmapLoader(com.google.common.util.concurrent.ListeningExecutorService listeningExecutorService, androidx.media3.datasource.DataSource.Factory factory, android.graphics.BitmapFactory.Options options) {
        this.listeningExecutorService = listeningExecutorService;
        this.dataSourceFactory = factory;
        this.options = options;
    }

    @Override // androidx.media3.common.util.BitmapLoader
    public boolean supportsMimeType(java.lang.String str) {
        return androidx.media3.common.util.Util.isBitmapFactorySupportedMimeType(str);
    }

    @Override // androidx.media3.common.util.BitmapLoader
    public com.google.common.util.concurrent.ListenableFuture<android.graphics.Bitmap> decodeBitmap(final byte[] bArr) {
        return this.listeningExecutorService.submit(new java.util.concurrent.Callable() { // from class: androidx.media3.datasource.DataSourceBitmapLoader$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return this.f$0.m58xcc09b2d8(bArr);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$decodeBitmap$1$androidx-media3-datasource-DataSourceBitmapLoader, reason: not valid java name */
    /* synthetic */ android.graphics.Bitmap m58xcc09b2d8(byte[] bArr) throws java.lang.Exception {
        return androidx.media3.datasource.BitmapUtil.decode(bArr, bArr.length, this.options);
    }

    @Override // androidx.media3.common.util.BitmapLoader
    public com.google.common.util.concurrent.ListenableFuture<android.graphics.Bitmap> loadBitmap(final android.net.Uri uri) {
        return this.listeningExecutorService.submit(new java.util.concurrent.Callable() { // from class: androidx.media3.datasource.DataSourceBitmapLoader$$ExternalSyntheticLambda2
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return this.f$0.m59x731908d1(uri);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$loadBitmap$2$androidx-media3-datasource-DataSourceBitmapLoader, reason: not valid java name */
    /* synthetic */ android.graphics.Bitmap m59x731908d1(android.net.Uri uri) throws java.lang.Exception {
        return load(this.dataSourceFactory.createDataSource(), uri, this.options);
    }

    private static android.graphics.Bitmap load(androidx.media3.datasource.DataSource dataSource, android.net.Uri uri, android.graphics.BitmapFactory.Options options) throws java.io.IOException {
        try {
            dataSource.open(new androidx.media3.datasource.DataSpec(uri));
            byte[] toEnd = androidx.media3.datasource.DataSourceUtil.readToEnd(dataSource);
            return androidx.media3.datasource.BitmapUtil.decode(toEnd, toEnd.length, options);
        } finally {
            dataSource.close();
        }
    }
}
