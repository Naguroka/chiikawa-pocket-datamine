package com.unity3d.player;

/* JADX INFO: renamed from: com.unity3d.player.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
final class C1741v implements android.graphics.SurfaceTexture.OnFrameAvailableListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.unity3d.player.C1743w f3952a;

    C1741v(com.unity3d.player.C1743w c1743w) {
        this.f3952a = c1743w;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(android.graphics.SurfaceTexture surfaceTexture) {
        ((com.unity3d.player.Camera2Wrapper) this.f3952a.f3953a).a(surfaceTexture);
    }
}
