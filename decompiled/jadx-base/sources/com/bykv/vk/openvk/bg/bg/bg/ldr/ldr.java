package com.bykv.vk.openvk.bg.bg.bg.ldr;

/* JADX INFO: loaded from: classes3.dex */
public class ldr implements android.view.SurfaceHolder.Callback {
    private final java.lang.ref.WeakReference<android.view.SurfaceHolder.Callback> bg;

    public ldr(android.view.SurfaceHolder.Callback callback) {
        this.bg = new java.lang.ref.WeakReference<>(callback);
    }

    public android.view.SurfaceHolder.Callback bg() {
        return this.bg.get();
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(android.view.SurfaceHolder surfaceHolder) {
        android.view.SurfaceHolder.Callback callback = this.bg.get();
        if (callback != null) {
            callback.surfaceCreated(surfaceHolder);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(android.view.SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        android.view.SurfaceHolder.Callback callback = this.bg.get();
        if (callback != null) {
            callback.surfaceChanged(surfaceHolder, i, i2, i3);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(android.view.SurfaceHolder surfaceHolder) {
        android.view.SurfaceHolder.Callback callback = this.bg.get();
        if (callback != null) {
            callback.surfaceDestroyed(surfaceHolder);
        }
    }
}
