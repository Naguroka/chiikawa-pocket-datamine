package com.unity3d.player;

/* JADX INFO: renamed from: com.unity3d.player.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
final class C1735s extends android.hardware.camera2.CameraCaptureSession.StateCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.unity3d.player.C1743w f3946a;

    C1735s(com.unity3d.player.C1743w c1743w) {
        this.f3946a = c1743w;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigureFailed(android.hardware.camera2.CameraCaptureSession cameraCaptureSession) {
        com.unity3d.player.AbstractC1749z.Log(6, "Camera2: CaptureSession configuration failed.");
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onConfigured(android.hardware.camera2.CameraCaptureSession cameraCaptureSession) {
        java.lang.StringBuilder sbAppend;
        com.unity3d.player.C1743w c1743w = this.f3946a;
        if (c1743w.b == null) {
            return;
        }
        synchronized (c1743w.s) {
            com.unity3d.player.C1743w c1743w2 = this.f3946a;
            c1743w2.r = cameraCaptureSession;
            try {
                try {
                    c1743w2.q = c1743w2.b.createCaptureRequest(1);
                    com.unity3d.player.C1743w c1743w3 = this.f3946a;
                    c1743w3.q.addTarget(c1743w3.v);
                    com.unity3d.player.C1743w c1743w4 = this.f3946a;
                    c1743w4.q.set(android.hardware.camera2.CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, c1743w4.n);
                    this.f3946a.g();
                } catch (java.lang.IllegalStateException e) {
                    sbAppend = new java.lang.StringBuilder("Camera2: IllegalStateException ").append(e);
                    com.unity3d.player.AbstractC1749z.Log(6, sbAppend.toString());
                }
            } catch (android.hardware.camera2.CameraAccessException e2) {
                sbAppend = new java.lang.StringBuilder("Camera2: CameraAccessException ").append(e2);
                com.unity3d.player.AbstractC1749z.Log(6, sbAppend.toString());
            }
        }
    }
}
