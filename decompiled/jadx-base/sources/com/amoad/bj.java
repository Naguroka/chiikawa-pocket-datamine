package com.amoad;

/* JADX INFO: loaded from: classes3.dex */
class bj extends android.view.SurfaceView {
    private static final java.lang.String i = "bj";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    android.media.MediaPlayer f282a;
    android.view.SurfaceHolder b;
    boolean c;
    boolean d;
    android.media.MediaPlayer.OnCompletionListener e;
    android.media.MediaPlayer.OnErrorListener f;
    android.media.MediaPlayer.OnSeekCompleteListener g;
    com.amoad.bj.a h;
    private int j;
    private com.amoad.bj.b k;
    private int l;
    private int m;
    private boolean n;
    private boolean o;
    private boolean p;
    private android.content.BroadcastReceiver q;
    private android.view.SurfaceHolder.Callback r;
    private com.amoad.g.a s;

    interface a {
        void a(int i, int i2);
    }

    enum b {
        Error(-1),
        Idle(0),
        Prepared(2),
        Playing(3),
        Paused(4),
        PlaybackCompleted(5);

        private final int g;

        b(int i) {
            this.g = i;
        }
    }

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f291a = 1;
        public static final int b = 2;
        public static final int c = 3;
        public static final int d = 4;
        private static final /* synthetic */ int[] e = {1, 2, 3, 4};
    }

    bj(android.content.Context context) {
        super(context);
        this.j = com.amoad.bj.c.f291a;
        this.k = com.amoad.bj.b.Idle;
        this.q = new android.content.BroadcastReceiver() { // from class: com.amoad.bj.1
            @Override // android.content.BroadcastReceiver
            public final void onReceive(android.content.Context context2, android.content.Intent intent) {
                if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
                    com.amoad.bj.this.n = true;
                    com.amoad.bj.this.a();
                } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                    com.amoad.bj.this.n = false;
                    com.amoad.bj.this.a();
                }
            }
        };
        this.r = new android.view.SurfaceHolder.Callback() { // from class: com.amoad.bj.2
            @Override // android.view.SurfaceHolder.Callback
            public final void surfaceChanged(android.view.SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
            }

            @Override // android.view.SurfaceHolder.Callback
            public final void surfaceCreated(android.view.SurfaceHolder surfaceHolder) {
                com.amoad.bj.this.f282a.setDisplay(surfaceHolder);
                com.amoad.bj.this.b = surfaceHolder;
                com.amoad.bj.this.c = true;
                com.amoad.bj.this.a();
            }

            @Override // android.view.SurfaceHolder.Callback
            public final void surfaceDestroyed(android.view.SurfaceHolder surfaceHolder) {
                com.amoad.bj.this.f282a.setDisplay(null);
                com.amoad.bj.this.b = null;
                com.amoad.bj.this.a();
            }
        };
        this.s = new com.amoad.g.a() { // from class: com.amoad.bj.3
            @Override // com.amoad.g.a
            public final void a(android.view.View view, float f) {
                if (!com.amoad.bj.this.p && f >= 0.5f) {
                    com.amoad.bj.this.p = true;
                    com.amoad.bj.this.a();
                } else {
                    if (!com.amoad.bj.this.p || f >= 0.5f) {
                        return;
                    }
                    com.amoad.bj.this.p = false;
                    com.amoad.bj.this.a();
                }
            }
        };
        this.e = new android.media.MediaPlayer.OnCompletionListener() { // from class: com.amoad.bj.4
            @Override // android.media.MediaPlayer.OnCompletionListener
            public final void onCompletion(android.media.MediaPlayer mediaPlayer) {
                com.amoad.bj.d(com.amoad.bj.this);
                com.amoad.bj.this.a();
            }
        };
        this.f = new android.media.MediaPlayer.OnErrorListener() { // from class: com.amoad.bj.5
            @Override // android.media.MediaPlayer.OnErrorListener
            public final boolean onError(android.media.MediaPlayer mediaPlayer, int i2, int i3) {
                com.amoad.bj.d(com.amoad.bj.this);
                com.amoad.bj.this.a(com.amoad.bj.c.d);
                com.amoad.bj.this.a(com.amoad.bj.b.Error);
                return true;
            }
        };
        this.g = new android.media.MediaPlayer.OnSeekCompleteListener() { // from class: com.amoad.bj.6
            @Override // android.media.MediaPlayer.OnSeekCompleteListener
            public final void onSeekComplete(android.media.MediaPlayer mediaPlayer) {
                com.amoad.bj.this.c = false;
            }
        };
        getHolder().addCallback(this.r);
    }

    private boolean b() {
        return (this.f282a == null || this.k == com.amoad.bj.b.Error || this.k == com.amoad.bj.b.Idle) ? false : true;
    }

    static /* synthetic */ boolean d(com.amoad.bj bjVar) {
        bjVar.d = true;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        com.amoad.bj.b bVar;
        if (b()) {
            if (this.d) {
                this.f282a.pause();
                a(com.amoad.bj.c.d);
                bVar = com.amoad.bj.b.PlaybackCompleted;
            } else if (this.b != null && this.n && this.o && this.p) {
                this.f282a.start();
                a(com.amoad.bj.c.b);
                bVar = com.amoad.bj.b.Playing;
            } else {
                if (this.k == com.amoad.bj.b.Prepared) {
                    this.f282a.start();
                }
                this.f282a.pause();
                a(com.amoad.bj.c.c);
                bVar = com.amoad.bj.b.Paused;
            }
            a(bVar);
            boolean z = this.d;
            if (z || this.c) {
                android.media.MediaPlayer mediaPlayer = this.f282a;
                mediaPlayer.seekTo(z ? mediaPlayer.getDuration() : 0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(final int i2) {
        final int i3 = this.j;
        if (i3 != i2) {
            this.j = i2;
            final com.amoad.bj.a aVar = this.h;
            if (aVar != null) {
                com.amoad.bc.a(getContext(), new java.lang.Runnable() { // from class: com.amoad.bj.7
                    @Override // java.lang.Runnable
                    public final void run() {
                        aVar.a(i3, i2);
                    }
                });
            }
        }
    }

    final void a(int i2, int i3) {
        this.l = i2;
        this.m = i3;
        if (i2 == 0 || i3 == 0) {
            return;
        }
        getHolder().setFixedSize(this.l, this.m);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(com.amoad.bj.b bVar) {
        if (this.k != bVar) {
            this.k = bVar;
        }
    }

    final void a(boolean z) {
        android.media.MediaPlayer mediaPlayer = this.f282a;
        if (mediaPlayer != null) {
            float f = z ? 0.0f : 1.0f;
            mediaPlayer.setVolume(f, f);
        }
    }

    @Override // android.view.SurfaceView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.amoad.g.a(this).a(this.s);
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        getContext().registerReceiver(this.q, intentFilter);
        this.n = ((android.os.PowerManager) getContext().getSystemService("power")).isInteractive();
        this.o = getVisibility() == 0;
    }

    @Override // android.view.SurfaceView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.amoad.g.a(this).b(this.s);
        getContext().unregisterReceiver(this.q);
        this.d = true;
        a();
    }

    @Override // android.view.SurfaceView, android.view.View
    protected void onMeasure(int i2, int i3) {
        int i4;
        int size = android.view.View.MeasureSpec.getSize(i2);
        int size2 = android.view.View.MeasureSpec.getSize(i3);
        int i5 = this.l;
        if (i5 > 0 && (i4 = this.m) > 0) {
            if (i5 * size2 < size * i4) {
                size = (i5 * size2) / i4;
            } else {
                size2 = (i4 * size) / i5;
            }
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    protected void onVisibilityChanged(android.view.View view, int i2) {
        this.o = i2 == 0;
        a();
    }
}
