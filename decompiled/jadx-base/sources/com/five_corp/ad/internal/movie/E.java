package com.five_corp.ad.internal.movie;

/* JADX INFO: loaded from: classes4.dex */
public final class E implements com.five_corp.ad.internal.movie.G, android.media.MediaPlayer.OnInfoListener, android.media.MediaPlayer.OnPreparedListener, android.media.MediaPlayer.OnCompletionListener, android.media.MediaPlayer.OnErrorListener, com.five_corp.ad.internal.movie.L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.five_corp.ad.internal.movie.F f1955a;
    public final com.five_corp.ad.internal.cache.o b;
    public final com.five_corp.ad.internal.view.D c;
    public final com.five_corp.ad.internal.movie.M d;
    public final android.os.Handler e;
    public int g;
    public android.media.MediaPlayer h;
    public boolean j;
    public int k;
    public int l;
    public final java.lang.Object f = new java.lang.Object();
    public int i = 0;

    public E(com.five_corp.ad.internal.movie.F f, com.five_corp.ad.internal.cache.o oVar, com.five_corp.ad.internal.view.D d, android.view.TextureView textureView, com.five_corp.ad.internal.logger.a aVar) {
        android.os.Handler handler = new android.os.Handler(android.os.Looper.getMainLooper());
        this.e = handler;
        this.f1955a = f;
        this.b = oVar;
        this.c = d;
        com.five_corp.ad.internal.movie.M m = new com.five_corp.ad.internal.movie.M(textureView, aVar);
        this.d = m;
        m.a(this, handler);
        this.k = 0;
        this.j = true;
        this.g = 1;
        this.l = 0;
    }

    @Override // com.five_corp.ad.internal.movie.G
    public final int a() {
        synchronized (this.f) {
            if (this.g != 7) {
                return this.i;
            }
            return this.h.getCurrentPosition();
        }
    }

    @Override // com.five_corp.ad.internal.movie.G
    public final void b() {
        synchronized (this.f) {
            if (this.g == 10) {
                return;
            }
            this.i = 0;
            this.g = 1;
            release();
            prepare();
        }
    }

    @Override // com.five_corp.ad.internal.movie.L
    public final void c() {
        release();
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(android.media.MediaPlayer mediaPlayer) {
        synchronized (this.f) {
            this.i = this.k;
            this.g = 9;
        }
        com.five_corp.ad.internal.view.D d = this.c;
        d.e.post(new com.five_corp.ad.internal.view.z(d));
        this.d.a();
        this.e.post(new com.five_corp.ad.internal.movie.A(this));
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(android.media.MediaPlayer mediaPlayer, int i, int i2) {
        int i3;
        if (i == -38 && i2 == 0 && (i3 = this.l) < 3) {
            this.l = i3 + 1;
            release();
            prepare();
        } else {
            this.e.post(new com.five_corp.ad.internal.movie.y(this, new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.l0, java.lang.String.format("what: %d, extra: %d, retry: %d", java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(this.l)), null, null)));
        }
        return true;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(android.media.MediaPlayer mediaPlayer, int i, int i2) {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x002d  */
    /* JADX WARN: Code duplicated, block: B:19:0x0030  */
    /* JADX WARN: Code duplicated, block: B:22:0x0036  */
    /* JADX WARN: Code duplicated, block: B:23:0x0046 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x0048  */
    /* JADX WARN: Code duplicated, block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(android.media.MediaPlayer mediaPlayer) {
        int i;
        int i2;
        float f;
        int duration = mediaPlayer.getDuration();
        synchronized (this.f) {
            this.k = duration;
            this.h = mediaPlayer;
            boolean z = this.j;
            int iA = com.five_corp.ad.e.a(this.g);
            if (iA != 0) {
                switch (iA) {
                    case 2:
                        i = 8;
                        this.g = i;
                        i2 = this.g;
                        mediaPlayer.seekTo(this.i);
                        if (z) {
                            f = 1.0f;
                        } else {
                            f = 0.0f;
                        }
                        mediaPlayer.setVolume(f, f);
                        if (i2 == 7) {
                            mediaPlayer.start();
                            com.five_corp.ad.internal.view.D d = this.c;
                            d.e.post(new com.five_corp.ad.internal.view.x(d));
                            return;
                        } else {
                            if (i2 == 8) {
                                this.e.post(new com.five_corp.ad.internal.movie.z(this));
                                return;
                            }
                            return;
                        }
                    case 3:
                        return;
                    case 4:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        break;
                    case 5:
                        i = 7;
                        this.g = i;
                        i2 = this.g;
                        mediaPlayer.seekTo(this.i);
                        if (z) {
                            f = 1.0f;
                        } else {
                            f = 0.0f;
                        }
                        mediaPlayer.setVolume(f, f);
                        if (i2 == 7) {
                            mediaPlayer.start();
                            com.five_corp.ad.internal.view.D d2 = this.c;
                            d2.e.post(new com.five_corp.ad.internal.view.x(d2));
                            return;
                        } else {
                            if (i2 == 8) {
                                this.e.post(new com.five_corp.ad.internal.movie.z(this));
                                return;
                            }
                            return;
                        }
                    default:
                        i2 = this.g;
                        mediaPlayer.seekTo(this.i);
                        if (z) {
                            f = 1.0f;
                        } else {
                            f = 0.0f;
                        }
                        mediaPlayer.setVolume(f, f);
                        if (i2 == 7) {
                            mediaPlayer.start();
                            com.five_corp.ad.internal.view.D d3 = this.c;
                            d3.e.post(new com.five_corp.ad.internal.view.x(d3));
                            return;
                        } else {
                            if (i2 == 8) {
                                this.e.post(new com.five_corp.ad.internal.movie.z(this));
                                return;
                            }
                            return;
                        }
                }
            }
            com.five_corp.ad.internal.movie.D.a(this.g);
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x001d  */
    @Override // com.five_corp.ad.internal.movie.G
    public final void pause() {
        int i;
        int i2;
        synchronized (this.f) {
            android.media.MediaPlayer mediaPlayer = this.h;
            int iA = com.five_corp.ad.e.a(this.g);
            if (iA != 0) {
                switch (iA) {
                    case 3:
                    case 7:
                    case 8:
                    case 9:
                        break;
                    case 4:
                    case 5:
                        i = 4;
                        this.g = i;
                        i2 = this.g;
                        if (i2 == 8) {
                            this.i = mediaPlayer.getCurrentPosition();
                            mediaPlayer.pause();
                        }
                        com.five_corp.ad.internal.view.D d = this.c;
                        d.e.post(new com.five_corp.ad.internal.view.y(d));
                        this.e.post(new com.five_corp.ad.internal.movie.C(this));
                        return;
                    case 6:
                        i = 8;
                        this.g = i;
                        i2 = this.g;
                        if (i2 == 8) {
                            this.i = mediaPlayer.getCurrentPosition();
                            mediaPlayer.pause();
                        }
                        com.five_corp.ad.internal.view.D d2 = this.c;
                        d2.e.post(new com.five_corp.ad.internal.view.y(d2));
                        this.e.post(new com.five_corp.ad.internal.movie.C(this));
                        return;
                    default:
                        i2 = this.g;
                        if (i2 == 8) {
                            this.i = mediaPlayer.getCurrentPosition();
                            mediaPlayer.pause();
                        }
                        com.five_corp.ad.internal.view.D d3 = this.c;
                        d3.e.post(new com.five_corp.ad.internal.view.y(d3));
                        this.e.post(new com.five_corp.ad.internal.movie.C(this));
                        return;
                }
            }
        }
    }

    @Override // com.five_corp.ad.internal.movie.G
    public final void prepare() {
        synchronized (this.f) {
            int i = this.g;
            if (i != 1) {
                com.five_corp.ad.internal.movie.D.a(i);
            } else {
                this.g = 2;
                this.d.b();
            }
        }
    }

    @Override // com.five_corp.ad.internal.movie.G
    public final void release() {
        android.media.MediaPlayer mediaPlayer;
        int i;
        int i2;
        synchronized (this.f) {
            mediaPlayer = this.h;
            i = this.g;
            this.h = null;
            switch (com.five_corp.ad.e.a(i)) {
                case 1:
                case 2:
                    i2 = 2;
                    this.g = i2;
                    break;
                case 3:
                case 7:
                    i2 = 4;
                    this.g = i2;
                    break;
                case 4:
                case 5:
                case 6:
                    i2 = 5;
                    this.g = i2;
                    break;
            }
        }
        if (mediaPlayer == null) {
            return;
        }
        int currentPosition = i == 7 ? mediaPlayer.getCurrentPosition() : 0;
        mediaPlayer.setSurface(null);
        mediaPlayer.reset();
        mediaPlayer.release();
        if (i == 7) {
            synchronized (this.f) {
                this.i = currentPosition;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x001f  */
    /* JADX WARN: Code duplicated, block: B:18:0x002f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0031  */
    /* JADX WARN: Code duplicated, block: B:29:? A[RETURN, SYNTHETIC] */
    @Override // com.five_corp.ad.internal.movie.G
    public final void start() {
        int i;
        int i2;
        synchronized (this.f) {
            android.media.MediaPlayer mediaPlayer = this.h;
            int iA = com.five_corp.ad.e.a(this.g);
            if (iA != 0) {
                switch (iA) {
                    case 3:
                        i = 5;
                        this.g = i;
                        i2 = this.g;
                        if (i2 == 5) {
                            this.d.b();
                            this.e.post(new com.five_corp.ad.internal.movie.B(this));
                            return;
                        } else {
                            if (i2 == 7) {
                                mediaPlayer.start();
                                com.five_corp.ad.internal.view.D d = this.c;
                                d.e.post(new com.five_corp.ad.internal.view.x(d));
                                this.e.post(new com.five_corp.ad.internal.movie.B(this));
                                return;
                            }
                            return;
                        }
                    case 4:
                    case 5:
                    case 6:
                        return;
                    case 7:
                        i = 7;
                        this.g = i;
                        i2 = this.g;
                        if (i2 == 5) {
                            this.d.b();
                            this.e.post(new com.five_corp.ad.internal.movie.B(this));
                            return;
                        } else {
                            if (i2 == 7) {
                                mediaPlayer.start();
                                com.five_corp.ad.internal.view.D d2 = this.c;
                                d2.e.post(new com.five_corp.ad.internal.view.x(d2));
                                this.e.post(new com.five_corp.ad.internal.movie.B(this));
                                return;
                            }
                            return;
                        }
                    case 8:
                    case 9:
                        break;
                    default:
                        i2 = this.g;
                        if (i2 == 5) {
                            this.d.b();
                            this.e.post(new com.five_corp.ad.internal.movie.B(this));
                            return;
                        } else {
                            if (i2 == 7) {
                                mediaPlayer.start();
                                com.five_corp.ad.internal.view.D d3 = this.c;
                                d3.e.post(new com.five_corp.ad.internal.view.x(d3));
                                this.e.post(new com.five_corp.ad.internal.movie.B(this));
                                return;
                            }
                            return;
                        }
                }
            }
            com.five_corp.ad.internal.movie.D.a(this.g);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:19:0x0041 A[Catch: IllegalStateException -> 0x006b, IOException -> 0x007e, TryCatch #4 {IOException -> 0x007e, IllegalStateException -> 0x006b, blocks: (B:17:0x0023, B:19:0x0041, B:21:0x0055, B:22:0x0063, B:28:0x006a), top: B:41:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:21:0x0055 A[Catch: IllegalStateException -> 0x006b, IOException -> 0x007e, TryCatch #4 {IOException -> 0x007e, IllegalStateException -> 0x006b, blocks: (B:17:0x0023, B:19:0x0041, B:21:0x0055, B:22:0x0063, B:28:0x006a), top: B:41:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0064 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.five_corp.ad.internal.movie.L
    public final void a(android.view.Surface surface) {
        android.media.MediaPlayer mediaPlayer;
        com.five_corp.ad.internal.util.g gVarE;
        synchronized (this.f) {
            this.h = null;
            int i = 6;
            switch (com.five_corp.ad.e.a(this.g)) {
                case 0:
                case 3:
                case 8:
                case 9:
                    return;
                case 1:
                case 2:
                    i = 3;
                    this.g = i;
                    try {
                        mediaPlayer = new android.media.MediaPlayer();
                        mediaPlayer.setSurface(surface);
                        mediaPlayer.setOnInfoListener(this);
                        mediaPlayer.setOnPreparedListener(this);
                        mediaPlayer.setOnCompletionListener(this);
                        mediaPlayer.setOnErrorListener(this);
                        gVarE = this.b.e();
                        if (!gVarE.f2085a) {
                            this.e.post(new com.five_corp.ad.internal.movie.y(this, new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.o0, null, null, gVarE.b)));
                            return;
                        }
                        mediaPlayer.setDataSource(this.b.c());
                        mediaPlayer.prepareAsync();
                        synchronized (this.f) {
                            this.h = mediaPlayer;
                            break;
                        }
                        return;
                    } catch (java.io.IOException e) {
                        this.e.post(new com.five_corp.ad.internal.movie.y(this, new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.j0, null, e, null)));
                        return;
                    } catch (java.lang.IllegalStateException e2) {
                        this.e.post(new com.five_corp.ad.internal.movie.y(this, new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.k0, null, e2, null)));
                        return;
                    }
                case 4:
                    this.g = i;
                    mediaPlayer = new android.media.MediaPlayer();
                    mediaPlayer.setSurface(surface);
                    mediaPlayer.setOnInfoListener(this);
                    mediaPlayer.setOnPreparedListener(this);
                    mediaPlayer.setOnCompletionListener(this);
                    mediaPlayer.setOnErrorListener(this);
                    gVarE = this.b.e();
                    if (!gVarE.f2085a) {
                        this.e.post(new com.five_corp.ad.internal.movie.y(this, new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.o0, null, null, gVarE.b)));
                        return;
                    }
                    mediaPlayer.setDataSource(this.b.c());
                    mediaPlayer.prepareAsync();
                    synchronized (this.f) {
                        this.h = mediaPlayer;
                        return;
                    }
                case 5:
                case 6:
                    com.five_corp.ad.internal.movie.D.a(this.g);
                    this.g = i;
                    mediaPlayer = new android.media.MediaPlayer();
                    mediaPlayer.setSurface(surface);
                    mediaPlayer.setOnInfoListener(this);
                    mediaPlayer.setOnPreparedListener(this);
                    mediaPlayer.setOnCompletionListener(this);
                    mediaPlayer.setOnErrorListener(this);
                    gVarE = this.b.e();
                    if (!gVarE.f2085a) {
                        this.e.post(new com.five_corp.ad.internal.movie.y(this, new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.o0, null, null, gVarE.b)));
                        return;
                    }
                    mediaPlayer.setDataSource(this.b.c());
                    mediaPlayer.prepareAsync();
                    synchronized (this.f) {
                        this.h = mediaPlayer;
                        return;
                    }
                case 7:
                    this.g = 4;
                    return;
                default:
                    mediaPlayer = new android.media.MediaPlayer();
                    mediaPlayer.setSurface(surface);
                    mediaPlayer.setOnInfoListener(this);
                    mediaPlayer.setOnPreparedListener(this);
                    mediaPlayer.setOnCompletionListener(this);
                    mediaPlayer.setOnErrorListener(this);
                    gVarE = this.b.e();
                    if (!gVarE.f2085a) {
                        this.e.post(new com.five_corp.ad.internal.movie.y(this, new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.o0, null, null, gVarE.b)));
                        return;
                    }
                    mediaPlayer.setDataSource(this.b.c());
                    mediaPlayer.prepareAsync();
                    synchronized (this.f) {
                        this.h = mediaPlayer;
                        return;
                    }
            }
        }
    }

    @Override // com.five_corp.ad.internal.movie.G
    public final void a(boolean z) {
        synchronized (this.f) {
            android.media.MediaPlayer mediaPlayer = this.h;
            this.j = z;
            int i = this.g;
            if (i == 8 || i == 7) {
                float f = z ? 1.0f : 0.0f;
                mediaPlayer.setVolume(f, f);
            }
        }
    }
}
