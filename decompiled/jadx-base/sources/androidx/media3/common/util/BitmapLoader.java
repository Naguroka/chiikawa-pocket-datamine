package androidx.media3.common.util;

/* JADX INFO: loaded from: classes.dex */
public interface BitmapLoader {
    com.google.common.util.concurrent.ListenableFuture<android.graphics.Bitmap> decodeBitmap(byte[] bArr);

    com.google.common.util.concurrent.ListenableFuture<android.graphics.Bitmap> loadBitmap(android.net.Uri uri);

    boolean supportsMimeType(java.lang.String str);

    default com.google.common.util.concurrent.ListenableFuture<android.graphics.Bitmap> loadBitmapFromMetadata(androidx.media3.common.MediaMetadata mediaMetadata) {
        if (mediaMetadata.artworkData != null) {
            return decodeBitmap(mediaMetadata.artworkData);
        }
        if (mediaMetadata.artworkUri != null) {
            return loadBitmap(mediaMetadata.artworkUri);
        }
        return null;
    }
}
