package androidx.media3.session;

/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public final class SimpleBitmapLoader implements androidx.media3.common.util.BitmapLoader {
    private static final com.google.common.base.Supplier<com.google.common.util.concurrent.ListeningExecutorService> DEFAULT_EXECUTOR_SERVICE = com.google.common.base.Suppliers.memoize(new com.google.common.base.Supplier() { // from class: androidx.media3.session.SimpleBitmapLoader$$ExternalSyntheticLambda2
        @Override // com.google.common.base.Supplier
        public final java.lang.Object get() {
            return com.google.common.util.concurrent.MoreExecutors.listeningDecorator(java.util.concurrent.Executors.newSingleThreadExecutor());
        }
    });
    private static final java.lang.String FILE_URI_EXCEPTION_MESSAGE = "Could not read image from file";
    private final com.google.common.util.concurrent.ListeningExecutorService executorService;

    public SimpleBitmapLoader() {
        this((java.util.concurrent.ExecutorService) androidx.media3.common.util.Assertions.checkStateNotNull(DEFAULT_EXECUTOR_SERVICE.get()));
    }

    public SimpleBitmapLoader(java.util.concurrent.ExecutorService executorService) {
        this.executorService = com.google.common.util.concurrent.MoreExecutors.listeningDecorator(executorService);
    }

    @Override // androidx.media3.common.util.BitmapLoader
    public boolean supportsMimeType(java.lang.String str) {
        return androidx.media3.common.util.Util.isBitmapFactorySupportedMimeType(str);
    }

    @Override // androidx.media3.common.util.BitmapLoader
    public com.google.common.util.concurrent.ListenableFuture<android.graphics.Bitmap> decodeBitmap(final byte[] bArr) {
        return this.executorService.submit(new java.util.concurrent.Callable() { // from class: androidx.media3.session.SimpleBitmapLoader$$ExternalSyntheticLambda1
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return androidx.media3.session.SimpleBitmapLoader.decode(bArr);
            }
        });
    }

    @Override // androidx.media3.common.util.BitmapLoader
    public com.google.common.util.concurrent.ListenableFuture<android.graphics.Bitmap> loadBitmap(final android.net.Uri uri) {
        return this.executorService.submit(new java.util.concurrent.Callable() { // from class: androidx.media3.session.SimpleBitmapLoader$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return androidx.media3.session.SimpleBitmapLoader.load(uri);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static android.graphics.Bitmap decode(byte[] bArr) {
        android.graphics.Bitmap bitmapDecodeByteArray = android.graphics.BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        androidx.media3.common.util.Assertions.checkArgument(bitmapDecodeByteArray != null, "Could not decode image data");
        return bitmapDecodeByteArray;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static android.graphics.Bitmap load(android.net.Uri uri) throws java.io.IOException {
        if (com.ironsource.y8.h.b.equals(uri.getScheme())) {
            java.lang.String path = uri.getPath();
            if (path == null) {
                throw new java.lang.IllegalArgumentException(FILE_URI_EXCEPTION_MESSAGE);
            }
            android.graphics.Bitmap bitmapDecodeFile = android.graphics.BitmapFactory.decodeFile(path);
            if (bitmapDecodeFile != null) {
                return bitmapDecodeFile;
            }
            throw new java.lang.IllegalArgumentException(FILE_URI_EXCEPTION_MESSAGE);
        }
        java.net.URLConnection uRLConnectionOpenConnection = new java.net.URL(uri.toString()).openConnection();
        if (!(uRLConnectionOpenConnection instanceof java.net.HttpURLConnection)) {
            throw new java.lang.UnsupportedOperationException("Unsupported scheme: " + uri.getScheme());
        }
        java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) uRLConnectionOpenConnection;
        httpURLConnection.connect();
        int responseCode = httpURLConnection.getResponseCode();
        if (responseCode != 200) {
            throw new java.io.IOException("Invalid response status code: " + responseCode);
        }
        java.io.InputStream inputStream = httpURLConnection.getInputStream();
        try {
            android.graphics.Bitmap bitmapDecode = decode(com.google.common.io.ByteStreams.toByteArray(inputStream));
            if (inputStream != null) {
                inputStream.close();
            }
            return bitmapDecode;
        } catch (java.lang.Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
