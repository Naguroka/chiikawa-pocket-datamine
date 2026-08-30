package com.google.android.gms.common.images;

import com.google.android.gms.common.images.ImageManager.ImageReceiver;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zab implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.common.images.ImageManager zaa;
    private final com.google.android.gms.common.images.zag zab;

    public zab(com.google.android.gms.common.images.ImageManager imageManager, com.google.android.gms.common.images.zag zagVar) {
        this.zaa = imageManager;
        this.zab = zagVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.common.internal.Asserts.checkMainThread("LoadImageRunnable must be executed on the main thread");
        com.google.android.gms.common.images.ImageManager.ImageReceiver imageReceiver = (com.google.android.gms.common.images.ImageManager.ImageReceiver) this.zaa.zah.get(this.zab);
        if (imageReceiver != null) {
            com.google.android.gms.common.images.ImageManager imageManager = this.zaa;
            imageManager.zah.remove(this.zab);
            imageReceiver.zac(this.zab);
        }
        com.google.android.gms.common.images.zag zagVar = this.zab;
        com.google.android.gms.common.images.zad zadVar = zagVar.zaa;
        android.net.Uri uri = zadVar.zaa;
        if (uri == null) {
            com.google.android.gms.common.images.ImageManager imageManager2 = this.zaa;
            zagVar.zab(imageManager2.zad, imageManager2.zag, true);
            return;
        }
        java.lang.Long l = (java.lang.Long) this.zaa.zaj.get(uri);
        if (l != null) {
            if (android.os.SystemClock.elapsedRealtime() - l.longValue() < 3600000) {
                com.google.android.gms.common.images.zag zagVar2 = this.zab;
                com.google.android.gms.common.images.ImageManager imageManager3 = this.zaa;
                zagVar2.zab(imageManager3.zad, imageManager3.zag, true);
                return;
            } else {
                com.google.android.gms.common.images.ImageManager imageManager4 = this.zaa;
                imageManager4.zaj.remove(zadVar.zaa);
            }
        }
        this.zab.zaa(null, false, true, false);
        com.google.android.gms.common.images.ImageManager imageManager5 = this.zaa;
        com.google.android.gms.common.images.ImageManager.ImageReceiver imageReceiver2 = (com.google.android.gms.common.images.ImageManager.ImageReceiver) imageManager5.zai.get(zadVar.zaa);
        if (imageReceiver2 == null) {
            com.google.android.gms.common.images.ImageManager.ImageReceiver imageReceiver3 = this.zaa.new ImageReceiver(zadVar.zaa);
            com.google.android.gms.common.images.ImageManager imageManager6 = this.zaa;
            imageManager6.zai.put(zadVar.zaa, imageReceiver3);
            imageReceiver2 = imageReceiver3;
        }
        imageReceiver2.zab(this.zab);
        com.google.android.gms.common.images.zag zagVar3 = this.zab;
        if (!(zagVar3 instanceof com.google.android.gms.common.images.zaf)) {
            this.zaa.zah.put(zagVar3, imageReceiver2);
        }
        synchronized (com.google.android.gms.common.images.ImageManager.zaa) {
            if (!com.google.android.gms.common.images.ImageManager.zab.contains(zadVar.zaa)) {
                com.google.android.gms.common.images.ImageManager.zab.add(zadVar.zaa);
                imageReceiver2.zad();
            }
        }
    }
}
