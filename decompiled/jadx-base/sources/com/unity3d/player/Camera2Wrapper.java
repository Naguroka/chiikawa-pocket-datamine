package com.unity3d.player;

/* JADX INFO: loaded from: classes6.dex */
public class Camera2Wrapper implements com.unity3d.player.a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private android.content.Context f3862a;
    private com.unity3d.player.C1743w b = null;

    public Camera2Wrapper(android.content.Context context) {
        this.f3862a = context;
        initCamera2Jni();
    }

    private final native void deinitCamera2Jni();

    private final native void initCamera2Jni();

    private final native void nativeFrameReady(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i, int i2, int i3);

    private final native void nativeSurfaceTextureReady(java.lang.Object obj);

    public final void a() {
        deinitCamera2Jni();
        closeCamera2();
    }

    public final void a(java.lang.Object obj) {
        nativeSurfaceTextureReady(obj);
    }

    public final void a(java.nio.ByteBuffer byteBuffer, java.nio.ByteBuffer byteBuffer2, java.nio.ByteBuffer byteBuffer3, int i, int i2, int i3) {
        nativeFrameReady(byteBuffer, byteBuffer2, byteBuffer3, i, i2, i3);
    }

    protected void closeCamera2() {
        com.unity3d.player.C1743w c1743w = this.b;
        if (c1743w != null) {
            c1743w.a();
        }
        this.b = null;
    }

    protected int getCamera2Count() {
        return com.unity3d.player.C1743w.a(this.f3862a);
    }

    protected int getCamera2FocalLengthEquivalent(int i) {
        return com.unity3d.player.C1743w.a(this.f3862a, i);
    }

    protected int[] getCamera2Resolutions(int i) {
        return com.unity3d.player.C1743w.b(this.f3862a, i);
    }

    protected int getCamera2SensorOrientation(int i) {
        return com.unity3d.player.C1743w.c(this.f3862a, i);
    }

    protected android.graphics.Rect getFrameSizeCamera2() {
        com.unity3d.player.C1743w c1743w = this.b;
        return c1743w != null ? c1743w.c() : new android.graphics.Rect();
    }

    protected boolean initializeCamera2(int i, int i2, int i3, int i4, int i5, android.view.Surface surface) {
        if (this.b != null || com.unity3d.player.UnityPlayer.currentActivity == null) {
            return false;
        }
        com.unity3d.player.C1743w c1743w = new com.unity3d.player.C1743w(this);
        this.b = c1743w;
        return c1743w.a(this.f3862a, i, i2, i3, i4, i5, surface);
    }

    protected boolean isCamera2AutoFocusPointSupported(int i) {
        return com.unity3d.player.C1743w.d(this.f3862a, i);
    }

    protected boolean isCamera2FrontFacing(int i) {
        return com.unity3d.player.C1743w.e(this.f3862a, i);
    }

    protected void pauseCamera2() {
        com.unity3d.player.C1743w c1743w = this.b;
        if (c1743w != null) {
            c1743w.d();
        }
    }

    protected boolean setAutoFocusPoint(float f, float f2) {
        com.unity3d.player.C1743w c1743w = this.b;
        if (c1743w != null) {
            return c1743w.a(f, f2);
        }
        return false;
    }

    protected void startCamera2() {
        com.unity3d.player.C1743w c1743w = this.b;
        if (c1743w != null) {
            c1743w.h();
        }
    }

    protected void stopCamera2() {
        com.unity3d.player.C1743w c1743w = this.b;
        if (c1743w != null) {
            c1743w.i();
        }
    }
}
