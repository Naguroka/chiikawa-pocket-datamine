package com.amoad;

/* JADX INFO: loaded from: classes3.dex */
class ar extends android.view.SurfaceView {
    private static final java.lang.String e = "ar";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    android.media.MediaPlayer f238a;
    float b;
    boolean c;
    com.amoad.ar.a d;
    private android.view.SurfaceHolder f;
    private int g;
    private int h;
    private int i;
    private boolean j;
    private final android.view.SurfaceHolder.Callback k;
    private final android.media.MediaPlayer.OnCompletionListener l;
    private final android.media.MediaPlayer.OnErrorListener m;

    interface a {
        void a();

        void b();

        void c();

        void d();
    }

    ar(android.content.Context context) {
        super(context);
        this.g = 0;
        this.c = false;
        android.view.SurfaceHolder.Callback callback = new android.view.SurfaceHolder.Callback() { // from class: com.amoad.ar.1
            @Override // android.view.SurfaceHolder.Callback
            public final void surfaceChanged(android.view.SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            }

            @Override // android.view.SurfaceHolder.Callback
            public final void surfaceCreated(android.view.SurfaceHolder surfaceHolder) {
                com.amoad.ar.this.f = surfaceHolder;
                if (com.amoad.ar.this.f238a != null) {
                    com.amoad.ar.this.f238a.setDisplay(surfaceHolder);
                }
                if (com.amoad.ar.this.d != null) {
                    com.amoad.ar.this.d.a();
                }
            }

            @Override // android.view.SurfaceHolder.Callback
            public final void surfaceDestroyed(android.view.SurfaceHolder surfaceHolder) {
                com.amoad.ar.this.f = null;
                if (com.amoad.ar.this.f238a != null) {
                    com.amoad.ar.this.f238a.setDisplay(null);
                }
                if (com.amoad.ar.this.d != null) {
                    com.amoad.ar.this.d.b();
                }
            }
        };
        this.k = callback;
        this.l = new android.media.MediaPlayer.OnCompletionListener() { // from class: com.amoad.ar.2
            @Override // android.media.MediaPlayer.OnCompletionListener
            public final void onCompletion(android.media.MediaPlayer mediaPlayer) {
                com.amoad.ar.this.d();
            }
        };
        this.m = new android.media.MediaPlayer.OnErrorListener() { // from class: com.amoad.ar.3
            @Override // android.media.MediaPlayer.OnErrorListener
            public final boolean onError(android.media.MediaPlayer mediaPlayer, int i, int i2) {
                com.amoad.ar.this.b(-1);
                if (com.amoad.ar.this.d == null) {
                    return true;
                }
                com.amoad.ar.this.d.d();
                return true;
            }
        };
        getHolder().addCallback(callback);
        getHolder().setType(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i) {
        if (this.g != i) {
            this.g = i;
        }
    }

    final void a() {
        this.f238a.start();
        b(3);
    }

    final void a(int i) {
        this.f238a.seekTo(i);
    }

    final void a(int i, int i2) {
        this.h = i;
        this.i = i2;
        if (i == 0 || i2 == 0) {
            return;
        }
        getHolder().setFixedSize(this.h, this.i);
    }

    final void a(android.media.MediaPlayer mediaPlayer) {
        if (mediaPlayer == null || !mediaPlayer.equals(this.f238a)) {
            if (this.f238a != null) {
                b(0);
                this.f238a.setOnCompletionListener(null);
                this.f238a.setOnErrorListener(null);
                this.f238a.setDisplay(null);
                this.f238a.pause();
                this.f238a = null;
            }
            if (mediaPlayer != null) {
                this.f238a = mediaPlayer;
                mediaPlayer.setOnCompletionListener(this.l);
                this.f238a.setOnErrorListener(this.m);
                this.f238a.setDisplay(this.f);
                b(2);
                a(mediaPlayer.getVideoWidth(), mediaPlayer.getVideoHeight());
            }
        }
    }

    final void a(boolean z) {
        this.j = z;
        c();
    }

    final void b() {
        if (this.g <= 2) {
            this.f238a.start();
        }
        this.f238a.pause();
        b(4);
    }

    final void c() {
        android.media.MediaPlayer mediaPlayer = this.f238a;
        if (mediaPlayer != null) {
            float f = this.j ? 0.0f : this.b;
            mediaPlayer.setVolume(f, f);
        }
    }

    final void d() {
        b(5);
        com.amoad.ar.a aVar = this.d;
        if (aVar != null) {
            aVar.c();
        }
    }

    final long e() {
        android.media.MediaPlayer mediaPlayer = this.f238a;
        if (mediaPlayer != null) {
            return mediaPlayer.getCurrentPosition();
        }
        return 0L;
    }

    final long f() {
        android.media.MediaPlayer mediaPlayer = this.f238a;
        if (mediaPlayer != null) {
            return mediaPlayer.getDuration();
        }
        return 0L;
    }

    final boolean g() {
        int i;
        return (this.f238a == null || (i = this.g) == -1 || i == 0) ? false : true;
    }

    @Override // android.view.SurfaceView, android.view.View
    protected void onMeasure(int i, int i2) {
        int i3;
        int size = android.view.View.MeasureSpec.getSize(i);
        int size2 = android.view.View.MeasureSpec.getSize(i2);
        int i4 = this.h;
        if (i4 > 0 && (i3 = this.i) > 0) {
            boolean z = this.c;
            if ((z || i4 * size2 >= size * i3) && (!z || i4 * size2 <= size * i3)) {
                size = (i4 * size2) / i3;
            } else {
                size2 = (i3 * size) / i4;
            }
        }
        setMeasuredDimension(size, size2);
    }
}
