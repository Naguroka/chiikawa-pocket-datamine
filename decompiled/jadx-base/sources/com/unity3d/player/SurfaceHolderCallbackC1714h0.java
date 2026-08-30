package com.unity3d.player;

/* JADX INFO: renamed from: com.unity3d.player.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
final class SurfaceHolderCallbackC1714h0 implements android.view.SurfaceHolder.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.unity3d.player.C1716i0 f3925a;

    SurfaceHolderCallbackC1714h0(com.unity3d.player.C1716i0 c1716i0) {
        this.f3925a = c1716i0;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(android.view.SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.f3925a.b.updateGLDisplay(0, surfaceHolder.getSurface());
        this.f3925a.b.sendSurfaceChangedEvent();
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(android.view.SurfaceHolder surfaceHolder) {
        this.f3925a.b.updateGLDisplay(0, surfaceHolder.getSurface());
        com.unity3d.player.C1716i0 c1716i0 = this.f3925a;
        com.unity3d.player.K k = c1716i0.c;
        com.unity3d.player.UnityPlayer unityPlayer = c1716i0.b;
        com.unity3d.player.J j = k.b;
        if (j == null || j.getParent() != null) {
            return;
        }
        unityPlayer.addView(k.b);
        unityPlayer.bringChildToFront(k.b);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(android.view.SurfaceHolder surfaceHolder) {
        com.unity3d.player.C1716i0 c1716i0 = this.f3925a;
        com.unity3d.player.K k = c1716i0.c;
        com.unity3d.player.C1709f c1709f = c1716i0.f3927a;
        k.getClass();
        if (com.unity3d.player.PlatformSupport.NOUGAT_SUPPORT && k.f3874a != null) {
            if (k.b == null) {
                k.b = new com.unity3d.player.J(k.f3874a);
            }
            k.b.a(c1709f);
        }
        this.f3925a.b.updateGLDisplay(0, null);
    }
}
