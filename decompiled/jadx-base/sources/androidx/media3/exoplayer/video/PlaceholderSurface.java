package androidx.media3.exoplayer.video;

/* JADX INFO: loaded from: classes.dex */
public final class PlaceholderSurface extends android.view.Surface {
    private static final java.lang.String TAG = "PlaceholderSurface";
    private static int secureMode;
    private static boolean secureModeInitialized;
    public final boolean secure;
    private final androidx.media3.exoplayer.video.PlaceholderSurface.PlaceholderSurfaceThread thread;
    private boolean threadReleased;

    public static synchronized boolean isSecureSupported(android.content.Context context) {
        if (!secureModeInitialized) {
            secureMode = getSecureMode(context);
            secureModeInitialized = true;
        }
        return secureMode != 0;
    }

    @java.lang.Deprecated
    public static androidx.media3.exoplayer.video.PlaceholderSurface newInstanceV17(android.content.Context context, boolean z) {
        return newInstance(context, z);
    }

    public static androidx.media3.exoplayer.video.PlaceholderSurface newInstance(android.content.Context context, boolean z) {
        androidx.media3.common.util.Assertions.checkState(!z || isSecureSupported(context));
        return new androidx.media3.exoplayer.video.PlaceholderSurface.PlaceholderSurfaceThread().init(z ? secureMode : 0);
    }

    private PlaceholderSurface(androidx.media3.exoplayer.video.PlaceholderSurface.PlaceholderSurfaceThread placeholderSurfaceThread, android.graphics.SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.thread = placeholderSurfaceThread;
        this.secure = z;
    }

    @Override // android.view.Surface
    public void release() {
        super.release();
        synchronized (this.thread) {
            if (!this.threadReleased) {
                this.thread.release();
                this.threadReleased = true;
            }
        }
    }

    private static int getSecureMode(android.content.Context context) {
        if (androidx.media3.common.util.GlUtil.isProtectedContentExtensionSupported(context)) {
            return androidx.media3.common.util.GlUtil.isSurfacelessContextExtensionSupported() ? 1 : 2;
        }
        return 0;
    }

    private static class PlaceholderSurfaceThread extends android.os.HandlerThread implements android.os.Handler.Callback {
        private static final int MSG_INIT = 1;
        private static final int MSG_RELEASE = 2;
        private androidx.media3.common.util.EGLSurfaceTexture eglSurfaceTexture;
        private android.os.Handler handler;
        private java.lang.Error initError;
        private java.lang.RuntimeException initException;
        private androidx.media3.exoplayer.video.PlaceholderSurface surface;

        public PlaceholderSurfaceThread() {
            super("ExoPlayer:PlaceholderSurface");
        }

        public androidx.media3.exoplayer.video.PlaceholderSurface init(int i) {
            boolean z;
            start();
            this.handler = new android.os.Handler(getLooper(), this);
            this.eglSurfaceTexture = new androidx.media3.common.util.EGLSurfaceTexture(this.handler);
            synchronized (this) {
                z = false;
                this.handler.obtainMessage(1, i, 0).sendToTarget();
                while (this.surface == null && this.initException == null && this.initError == null) {
                    try {
                        wait();
                    } catch (java.lang.InterruptedException unused) {
                        z = true;
                    }
                }
            }
            if (z) {
                java.lang.Thread.currentThread().interrupt();
            }
            java.lang.RuntimeException runtimeException = this.initException;
            if (runtimeException != null) {
                throw runtimeException;
            }
            java.lang.Error error = this.initError;
            if (error != null) {
                throw error;
            }
            return (androidx.media3.exoplayer.video.PlaceholderSurface) androidx.media3.common.util.Assertions.checkNotNull(this.surface);
        }

        public void release() {
            androidx.media3.common.util.Assertions.checkNotNull(this.handler);
            this.handler.sendEmptyMessage(2);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(android.os.Message message) {
            int i = message.what;
            try {
                if (i != 1) {
                    if (i != 2) {
                        return true;
                    }
                    try {
                        releaseInternal();
                    } catch (java.lang.Throwable th) {
                        try {
                            androidx.media3.common.util.Log.e(androidx.media3.exoplayer.video.PlaceholderSurface.TAG, "Failed to release placeholder surface", th);
                        } finally {
                            quit();
                        }
                    }
                    return true;
                }
                try {
                    initInternal(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                } catch (androidx.media3.common.util.GlUtil.GlException e) {
                    androidx.media3.common.util.Log.e(androidx.media3.exoplayer.video.PlaceholderSurface.TAG, "Failed to initialize placeholder surface", e);
                    this.initException = new java.lang.IllegalStateException(e);
                    synchronized (this) {
                        notify();
                    }
                } catch (java.lang.Error e2) {
                    androidx.media3.common.util.Log.e(androidx.media3.exoplayer.video.PlaceholderSurface.TAG, "Failed to initialize placeholder surface", e2);
                    this.initError = e2;
                    synchronized (this) {
                        notify();
                    }
                } catch (java.lang.RuntimeException e3) {
                    androidx.media3.common.util.Log.e(androidx.media3.exoplayer.video.PlaceholderSurface.TAG, "Failed to initialize placeholder surface", e3);
                    this.initException = e3;
                    synchronized (this) {
                        notify();
                    }
                }
                return true;
            } catch (java.lang.Throwable th2) {
                synchronized (this) {
                    notify();
                    throw th2;
                }
            }
        }

        private void initInternal(int i) throws androidx.media3.common.util.GlUtil.GlException {
            androidx.media3.common.util.Assertions.checkNotNull(this.eglSurfaceTexture);
            this.eglSurfaceTexture.init(i);
            this.surface = new androidx.media3.exoplayer.video.PlaceholderSurface(this, this.eglSurfaceTexture.getSurfaceTexture(), i != 0);
        }

        private void releaseInternal() {
            androidx.media3.common.util.Assertions.checkNotNull(this.eglSurfaceTexture);
            this.eglSurfaceTexture.release();
        }
    }
}
