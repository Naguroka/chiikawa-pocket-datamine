package com.five_corp.ad.internal.movie;

/* JADX INFO: loaded from: classes4.dex */
public final class M implements android.view.TextureView.SurfaceTextureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.five_corp.ad.internal.logger.a f1960a;
    public final java.lang.Object b;
    public android.graphics.SurfaceTexture c;
    public android.view.Surface d;
    public com.five_corp.ad.internal.movie.L e;
    public android.os.Handler f;
    public boolean g;

    public M(android.view.TextureView textureView, com.five_corp.ad.internal.logger.a aVar) {
        java.lang.System.identityHashCode(this);
        this.b = new java.lang.Object();
        this.g = false;
        this.f1960a = aVar;
        textureView.setSurfaceTextureListener(this);
    }

    public final void a() {
        synchronized (this.b) {
            android.view.Surface surface = this.d;
            if (surface == null) {
                return;
            }
            this.d = null;
            com.five_corp.ad.internal.movie.L l = this.e;
            android.os.Handler handler = this.f;
            if (l == null || handler == null) {
                surface.release();
            } else {
                handler.post(new com.five_corp.ad.internal.movie.I(l, surface));
            }
        }
    }

    public final void b() {
        synchronized (this.b) {
            android.view.Surface surface = this.d;
            if (surface != null) {
                this.g = false;
            } else if (this.c == null) {
                this.g = true;
                return;
            } else {
                this.g = false;
                surface = new android.view.Surface(this.c);
                this.d = surface;
            }
            com.five_corp.ad.internal.movie.L l = this.e;
            android.os.Handler handler = this.f;
            if (l == null || handler == null) {
                return;
            }
            handler.post(new com.five_corp.ad.internal.movie.H(l, surface));
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i, int i2) {
        android.view.Surface surface;
        boolean z;
        com.five_corp.ad.internal.movie.L l;
        android.os.Handler handler;
        try {
            synchronized (this.b) {
                this.c = surfaceTexture;
                surface = new android.view.Surface(surfaceTexture);
                this.d = surface;
                z = this.g;
                this.g = false;
                l = this.e;
                handler = this.f;
            }
            if (l == null || handler == null || !z) {
                return;
            }
            handler.post(new com.five_corp.ad.internal.movie.J(l, surface));
        } catch (java.lang.Throwable th) {
            this.f1960a.a(th);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
        try {
            synchronized (this.b) {
                if (this.c != surfaceTexture) {
                    return true;
                }
                this.c = null;
                android.view.Surface surface = this.d;
                if (surface == null) {
                    return true;
                }
                this.d = null;
                com.five_corp.ad.internal.movie.L l = this.e;
                android.os.Handler handler = this.f;
                if (l == null || handler == null) {
                    return true;
                }
                handler.post(new com.five_corp.ad.internal.movie.K(l, surface, surfaceTexture));
                return false;
            }
        } catch (java.lang.Throwable th) {
            this.f1960a.a(th);
            return true;
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, int i, int i2) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surfaceTexture) {
    }

    public final void a(com.five_corp.ad.internal.movie.L l, android.os.Handler handler) {
        synchronized (this.b) {
            this.g = false;
            this.e = l;
            this.f = handler;
        }
    }
}
