package com.google.android.gms.common.images;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zaa implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.common.images.ImageManager zaa;
    private final android.net.Uri zab;
    private final android.content.res.AssetFileDescriptor zac;

    public zaa(com.google.android.gms.common.images.ImageManager imageManager, android.net.Uri uri, android.content.res.AssetFileDescriptor assetFileDescriptor) {
        this.zaa = imageManager;
        this.zab = uri;
        this.zac = assetFileDescriptor;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.common.internal.Asserts.checkNotMainThread("LoadBitmapFromDiskRunnable can't be executed in the main thread");
        android.content.res.AssetFileDescriptor assetFileDescriptor = this.zac;
        android.graphics.Bitmap bitmapDecodeStream = null;
        boolean z = false;
        if (assetFileDescriptor != null) {
            try {
                java.io.FileInputStream fileInputStreamCreateInputStream = assetFileDescriptor.createInputStream();
                if (fileInputStreamCreateInputStream != null) {
                    try {
                        bitmapDecodeStream = android.graphics.BitmapFactory.decodeStream(fileInputStreamCreateInputStream);
                    } catch (java.lang.Throwable th) {
                        try {
                            fileInputStreamCreateInputStream.close();
                        } catch (java.lang.Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                if (fileInputStreamCreateInputStream != null) {
                    fileInputStreamCreateInputStream.close();
                }
            } catch (java.io.IOException | java.lang.OutOfMemoryError e) {
                android.util.Log.e("ImageManager", "Error loading bitmap for uri: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(this.zab))), e);
                z = e instanceof java.lang.OutOfMemoryError;
            }
        }
        java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
        com.google.android.gms.common.images.ImageManager imageManager = this.zaa;
        imageManager.zae.post(new com.google.android.gms.common.images.zac(imageManager, this.zab, bitmapDecodeStream, z, countDownLatch));
        try {
            countDownLatch.await();
        } catch (java.lang.InterruptedException unused) {
            android.util.Log.w("ImageManager", "Latch interrupted while posting ".concat(java.lang.String.valueOf(java.lang.String.valueOf(this.zab))));
        }
    }
}
