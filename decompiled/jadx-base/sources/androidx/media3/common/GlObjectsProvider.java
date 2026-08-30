package androidx.media3.common;

/* JADX INFO: loaded from: classes.dex */
public interface GlObjectsProvider {
    androidx.media3.common.GlTextureInfo createBuffersForTexture(int i, int i2, int i3) throws androidx.media3.common.util.GlUtil.GlException;

    android.opengl.EGLContext createEglContext(android.opengl.EGLDisplay eGLDisplay, int i, int[] iArr) throws androidx.media3.common.util.GlUtil.GlException;

    android.opengl.EGLSurface createEglSurface(android.opengl.EGLDisplay eGLDisplay, java.lang.Object obj, int i, boolean z) throws androidx.media3.common.util.GlUtil.GlException;

    android.opengl.EGLSurface createFocusedPlaceholderEglSurface(android.opengl.EGLContext eGLContext, android.opengl.EGLDisplay eGLDisplay) throws androidx.media3.common.util.GlUtil.GlException;
}
