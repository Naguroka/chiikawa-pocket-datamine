package com.unity3d.player;

/* JADX INFO: renamed from: com.unity3d.player.r, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
final class C1733r extends android.hardware.camera2.CameraCaptureSession.CaptureCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.unity3d.player.C1743w f3944a;

    C1733r(com.unity3d.player.C1743w c1743w) {
        this.f3944a = c1743w;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureCompleted(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, android.hardware.camera2.CaptureRequest captureRequest, android.hardware.camera2.TotalCaptureResult totalCaptureResult) {
        this.f3944a.a(captureRequest.getTag());
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureFailed(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, android.hardware.camera2.CaptureRequest captureRequest, android.hardware.camera2.CaptureFailure captureFailure) {
        com.unity3d.player.AbstractC1749z.Log(5, "Camera2: Capture session failed " + captureRequest.getTag() + " reason " + captureFailure.getReason());
        this.f3944a.a(captureRequest.getTag());
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureSequenceAborted(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, int i) {
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureSequenceCompleted(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, int i, long j) {
    }
}
