package com.unity3d.player;

/* JADX INFO: renamed from: com.unity3d.player.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
final class C1739u implements android.media.ImageReader.OnImageAvailableListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.unity3d.player.C1743w f3950a;

    C1739u(com.unity3d.player.C1743w c1743w) {
        this.f3950a = c1743w;
    }

    @Override // android.media.ImageReader.OnImageAvailableListener
    public final void onImageAvailable(android.media.ImageReader imageReader) {
        if (com.unity3d.player.C1743w.D.tryAcquire()) {
            android.media.Image imageAcquireNextImage = imageReader.acquireNextImage();
            if (imageAcquireNextImage != null) {
                android.media.Image.Plane[] planes = imageAcquireNextImage.getPlanes();
                if (imageAcquireNextImage.getFormat() == 35 && planes != null && planes.length == 3) {
                    ((com.unity3d.player.Camera2Wrapper) this.f3950a.f3953a).a(planes[0].getBuffer(), planes[1].getBuffer(), planes[2].getBuffer(), planes[0].getRowStride(), planes[1].getRowStride(), planes[1].getPixelStride());
                } else {
                    com.unity3d.player.AbstractC1749z.Log(6, "Camera2: Wrong image format.");
                }
                android.media.Image image = this.f3950a.p;
                if (image != null) {
                    image.close();
                }
                this.f3950a.p = imageAcquireNextImage;
            }
            com.unity3d.player.C1743w.D.release();
        }
    }
}
