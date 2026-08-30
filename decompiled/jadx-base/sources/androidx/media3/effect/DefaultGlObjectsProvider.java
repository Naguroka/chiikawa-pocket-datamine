package androidx.media3.effect;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultGlObjectsProvider implements androidx.media3.common.GlObjectsProvider {
    private final android.opengl.EGLContext sharedEglContext;

    public DefaultGlObjectsProvider() {
        this(null);
    }

    public DefaultGlObjectsProvider(android.opengl.EGLContext eGLContext) {
        this.sharedEglContext = eGLContext == null ? android.opengl.EGL14.EGL_NO_CONTEXT : eGLContext;
    }

    @Override // androidx.media3.common.GlObjectsProvider
    public android.opengl.EGLContext createEglContext(android.opengl.EGLDisplay eGLDisplay, int i, int[] iArr) throws androidx.media3.common.util.GlUtil.GlException {
        return androidx.media3.common.util.GlUtil.createEglContext(this.sharedEglContext, eGLDisplay, i, iArr);
    }

    @Override // androidx.media3.common.GlObjectsProvider
    public android.opengl.EGLSurface createEglSurface(android.opengl.EGLDisplay eGLDisplay, java.lang.Object obj, int i, boolean z) throws androidx.media3.common.util.GlUtil.GlException {
        return androidx.media3.common.util.GlUtil.createEglSurface(eGLDisplay, obj, i, z);
    }

    @Override // androidx.media3.common.GlObjectsProvider
    public android.opengl.EGLSurface createFocusedPlaceholderEglSurface(android.opengl.EGLContext eGLContext, android.opengl.EGLDisplay eGLDisplay) throws androidx.media3.common.util.GlUtil.GlException {
        return androidx.media3.common.util.GlUtil.createFocusedPlaceholderEglSurface(eGLContext, eGLDisplay);
    }

    @Override // androidx.media3.common.GlObjectsProvider
    public androidx.media3.common.GlTextureInfo createBuffersForTexture(int i, int i2, int i3) throws androidx.media3.common.util.GlUtil.GlException {
        return new androidx.media3.common.GlTextureInfo(i, androidx.media3.common.util.GlUtil.createFboForTexture(i), -1, i2, i3);
    }
}
