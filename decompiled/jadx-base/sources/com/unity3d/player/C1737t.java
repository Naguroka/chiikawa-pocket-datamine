package com.unity3d.player;

/* JADX INFO: renamed from: com.unity3d.player.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
final class C1737t extends android.hardware.camera2.CameraDevice.StateCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.unity3d.player.C1743w f3948a;

    C1737t(com.unity3d.player.C1743w c1743w) {
        this.f3948a = c1743w;
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(android.hardware.camera2.CameraDevice cameraDevice) {
        com.unity3d.player.C1743w.D.release();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(android.hardware.camera2.CameraDevice cameraDevice) {
        com.unity3d.player.AbstractC1749z.Log(5, "Camera2: CameraDevice disconnected.");
        this.f3948a.a(cameraDevice);
        com.unity3d.player.C1743w.D.release();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(android.hardware.camera2.CameraDevice cameraDevice, int i) {
        com.unity3d.player.AbstractC1749z.Log(6, "Camera2: Error opeining CameraDevice " + i);
        this.f3948a.a(cameraDevice);
        com.unity3d.player.C1743w.D.release();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(android.hardware.camera2.CameraDevice cameraDevice) {
        this.f3948a.b = cameraDevice;
        com.unity3d.player.C1743w.D.release();
    }
}
