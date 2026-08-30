package androidx.media3.session;

/* JADX INFO: loaded from: classes.dex */
public final class CacheBitmapLoader implements androidx.media3.common.util.BitmapLoader {
    private final androidx.media3.common.util.BitmapLoader bitmapLoader;
    private androidx.media3.session.CacheBitmapLoader.BitmapLoadRequest lastBitmapLoadRequest;

    public CacheBitmapLoader(androidx.media3.common.util.BitmapLoader bitmapLoader) {
        this.bitmapLoader = bitmapLoader;
    }

    @Override // androidx.media3.common.util.BitmapLoader
    public boolean supportsMimeType(java.lang.String str) {
        return this.bitmapLoader.supportsMimeType(str);
    }

    @Override // androidx.media3.common.util.BitmapLoader
    public com.google.common.util.concurrent.ListenableFuture<android.graphics.Bitmap> decodeBitmap(byte[] bArr) {
        androidx.media3.session.CacheBitmapLoader.BitmapLoadRequest bitmapLoadRequest = this.lastBitmapLoadRequest;
        if (bitmapLoadRequest != null && bitmapLoadRequest.matches(bArr)) {
            return this.lastBitmapLoadRequest.getFuture();
        }
        com.google.common.util.concurrent.ListenableFuture<android.graphics.Bitmap> listenableFutureDecodeBitmap = this.bitmapLoader.decodeBitmap(bArr);
        this.lastBitmapLoadRequest = new androidx.media3.session.CacheBitmapLoader.BitmapLoadRequest(bArr, listenableFutureDecodeBitmap);
        return listenableFutureDecodeBitmap;
    }

    @Override // androidx.media3.common.util.BitmapLoader
    public com.google.common.util.concurrent.ListenableFuture<android.graphics.Bitmap> loadBitmap(android.net.Uri uri) {
        androidx.media3.session.CacheBitmapLoader.BitmapLoadRequest bitmapLoadRequest = this.lastBitmapLoadRequest;
        if (bitmapLoadRequest != null && bitmapLoadRequest.matches(uri)) {
            return this.lastBitmapLoadRequest.getFuture();
        }
        com.google.common.util.concurrent.ListenableFuture<android.graphics.Bitmap> listenableFutureLoadBitmap = this.bitmapLoader.loadBitmap(uri);
        this.lastBitmapLoadRequest = new androidx.media3.session.CacheBitmapLoader.BitmapLoadRequest(uri, listenableFutureLoadBitmap);
        return listenableFutureLoadBitmap;
    }

    private static class BitmapLoadRequest {
        private final byte[] data;
        private final com.google.common.util.concurrent.ListenableFuture<android.graphics.Bitmap> future;
        private final android.net.Uri uri;

        public BitmapLoadRequest(byte[] bArr, com.google.common.util.concurrent.ListenableFuture<android.graphics.Bitmap> listenableFuture) {
            this.data = bArr;
            this.uri = null;
            this.future = listenableFuture;
        }

        public BitmapLoadRequest(android.net.Uri uri, com.google.common.util.concurrent.ListenableFuture<android.graphics.Bitmap> listenableFuture) {
            this.data = null;
            this.uri = uri;
            this.future = listenableFuture;
        }

        public boolean matches(byte[] bArr) {
            byte[] bArr2 = this.data;
            return bArr2 != null && java.util.Arrays.equals(bArr2, bArr);
        }

        public boolean matches(android.net.Uri uri) {
            android.net.Uri uri2 = this.uri;
            return uri2 != null && uri2.equals(uri);
        }

        public com.google.common.util.concurrent.ListenableFuture<android.graphics.Bitmap> getFuture() {
            return (com.google.common.util.concurrent.ListenableFuture) androidx.media3.common.util.Assertions.checkStateNotNull(this.future);
        }
    }
}
