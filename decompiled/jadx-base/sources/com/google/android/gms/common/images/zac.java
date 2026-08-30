package com.google.android.gms.common.images;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zac implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.common.images.ImageManager zaa;
    private final android.net.Uri zab;
    private final android.graphics.Bitmap zac;
    private final java.util.concurrent.CountDownLatch zad;

    public zac(com.google.android.gms.common.images.ImageManager imageManager, android.net.Uri uri, android.graphics.Bitmap bitmap, boolean z, java.util.concurrent.CountDownLatch countDownLatch) {
        this.zaa = imageManager;
        this.zab = uri;
        this.zac = bitmap;
        this.zad = countDownLatch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.common.internal.Asserts.checkMainThread("OnBitmapLoadedRunnable must be executed in the main thread");
        com.google.android.gms.common.images.ImageManager.ImageReceiver imageReceiver = (com.google.android.gms.common.images.ImageManager.ImageReceiver) this.zaa.zai.remove(this.zab);
        if (imageReceiver != null) {
            java.util.ArrayList arrayList = imageReceiver.zac;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                com.google.android.gms.common.images.zag zagVar = (com.google.android.gms.common.images.zag) arrayList.get(i);
                android.graphics.Bitmap bitmap = this.zac;
                if (bitmap != null) {
                    zagVar.zac(this.zaa.zad, bitmap, false);
                } else {
                    this.zaa.zaj.put(this.zab, java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime()));
                    com.google.android.gms.common.images.ImageManager imageManager = this.zaa;
                    zagVar.zab(imageManager.zad, imageManager.zag, false);
                }
                if (!(zagVar instanceof com.google.android.gms.common.images.zaf)) {
                    this.zaa.zah.remove(zagVar);
                }
            }
        }
        this.zad.countDown();
        synchronized (com.google.android.gms.common.images.ImageManager.zaa) {
            com.google.android.gms.common.images.ImageManager.zab.remove(this.zab);
        }
    }
}
