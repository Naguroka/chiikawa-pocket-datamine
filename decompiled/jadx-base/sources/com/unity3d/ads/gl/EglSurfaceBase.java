package com.unity3d.ads.gl;

/* JADX INFO: compiled from: EglSurfaceBase.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\nJ\u0006\u0010\u0010\u001a\u00020\rJ\u0006\u0010\u0011\u001a\u00020\rR\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/unity3d/ads/gl/EglSurfaceBase;", "", "eglCore", "Lcom/unity3d/ads/gl/EglCore;", "(Lcom/unity3d/ads/gl/EglCore;)V", "mEGLSurface", "Landroid/opengl/EGLSurface;", "kotlin.jvm.PlatformType", "mEglCore", "mHeight", "", "mWidth", "createOffscreenSurface", "", "width", "height", "makeCurrent", "releaseEglSurface", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class EglSurfaceBase {
    private android.opengl.EGLSurface mEGLSurface;
    private com.unity3d.ads.gl.EglCore mEglCore;
    private int mHeight;
    private int mWidth;

    protected EglSurfaceBase(com.unity3d.ads.gl.EglCore eglCore) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eglCore, "eglCore");
        this.mEGLSurface = android.opengl.EGL14.EGL_NO_SURFACE;
        this.mWidth = -1;
        this.mHeight = -1;
        this.mEglCore = eglCore;
    }

    public final void createOffscreenSurface(int width, int height) {
        if (!(this.mEGLSurface == android.opengl.EGL14.EGL_NO_SURFACE)) {
            throw new java.lang.IllegalStateException("surface already created".toString());
        }
        this.mEGLSurface = this.mEglCore.createOffscreenSurface(width, height);
        this.mWidth = width;
        this.mHeight = height;
    }

    public final void releaseEglSurface() {
        this.mEglCore.releaseSurface(this.mEGLSurface);
        this.mEGLSurface = android.opengl.EGL14.EGL_NO_SURFACE;
        this.mHeight = -1;
        this.mWidth = -1;
    }

    public final void makeCurrent() {
        this.mEglCore.makeCurrent(this.mEGLSurface);
    }
}
