package com.amoad;

/* JADX INFO: loaded from: classes3.dex */
final class NativeVideoView extends android.widget.RelativeLayout implements com.amoad.ar.a {
    private static final java.lang.String j = "NativeVideoView";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    com.amoad.ar f174a;
    com.amoad.bb b;
    com.amoad.b c;
    float d;
    float e;
    boolean f;
    boolean g;
    boolean h;
    com.amoad.NativeVideoView.State i;
    private com.amoad.aw k;
    private android.os.Handler l;
    private final android.view.View.OnClickListener m;
    private float n;
    private boolean o;
    private boolean p;
    private boolean q;
    private boolean r;
    private final com.amoad.g.a s;
    private final android.content.BroadcastReceiver t;
    private com.amoad.aj<com.amoad.NativeVideoView.b> u;
    private com.amoad.bb.a v;
    private com.amoad.aj<com.amoad.NativeVideoView.a> w;
    private java.util.concurrent.ScheduledExecutorService x;
    private long y;

    public enum State {
        Idle,
        Playing,
        Paused,
        PlaybackCompleted,
        Error
    }

    interface a {
        void a();
    }

    interface b {
        void a(com.amoad.NativeVideoView.State state);
    }

    NativeVideoView(android.content.Context context) {
        super(context);
        this.c = com.amoad.b.f266a;
        android.view.View.OnClickListener onClickListener = new android.view.View.OnClickListener() { // from class: com.amoad.NativeVideoView.1
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.amoad.NativeVideoView.this.f();
            }
        };
        this.m = onClickListener;
        this.s = new com.amoad.g.a() { // from class: com.amoad.NativeVideoView.2
            /* JADX WARN: Code duplicated, block: B:34:0x00b4  */
            /* JADX WARN: Code duplicated, block: B:47:0x0105  */
            @Override // com.amoad.g.a
            public final void a(android.view.View view, float f) {
                if (com.amoad.NativeVideoView.this.d >= com.amoad.NativeVideoView.this.e) {
                    if (com.amoad.NativeVideoView.this.r || com.amoad.NativeVideoView.this.n >= f) {
                        if (com.amoad.NativeVideoView.this.r && f < com.amoad.NativeVideoView.this.n && f < com.amoad.NativeVideoView.this.e && com.amoad.NativeVideoView.this.e <= com.amoad.NativeVideoView.this.n) {
                            com.amoad.NativeVideoView.this.r = false;
                            com.amoad.NativeVideoView.this.j();
                        }
                    } else if (com.amoad.NativeVideoView.this.n < com.amoad.NativeVideoView.this.d && com.amoad.NativeVideoView.this.d <= f) {
                        com.amoad.NativeVideoView.this.r = true;
                        com.amoad.NativeVideoView.this.i();
                    }
                } else if (com.amoad.NativeVideoView.this.r || com.amoad.NativeVideoView.this.n >= f) {
                    if (com.amoad.NativeVideoView.this.r && f < com.amoad.NativeVideoView.this.n && ((f < com.amoad.NativeVideoView.this.d && com.amoad.NativeVideoView.this.d <= com.amoad.NativeVideoView.this.n) || (f < com.amoad.NativeVideoView.this.e && com.amoad.NativeVideoView.this.e <= com.amoad.NativeVideoView.this.n))) {
                        com.amoad.NativeVideoView.this.r = false;
                        com.amoad.NativeVideoView.this.j();
                    }
                } else if ((com.amoad.NativeVideoView.this.n < com.amoad.NativeVideoView.this.d && com.amoad.NativeVideoView.this.d <= f) || (com.amoad.NativeVideoView.this.n < com.amoad.NativeVideoView.this.e && com.amoad.NativeVideoView.this.e <= f)) {
                    com.amoad.NativeVideoView.this.r = true;
                    com.amoad.NativeVideoView.this.i();
                }
                com.amoad.NativeVideoView.this.n = f;
            }
        };
        this.t = new android.content.BroadcastReceiver() { // from class: com.amoad.NativeVideoView.3
            @Override // android.content.BroadcastReceiver
            public final void onReceive(android.content.Context context2, android.content.Intent intent) {
                if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
                    com.amoad.NativeVideoView.this.p = true;
                    com.amoad.NativeVideoView.this.i();
                } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                    com.amoad.NativeVideoView.this.p = false;
                    com.amoad.NativeVideoView.this.j();
                }
            }
        };
        this.g = true;
        this.u = new com.amoad.aj<>();
        this.v = new com.amoad.bb.a() { // from class: com.amoad.NativeVideoView.5
            @Override // com.amoad.bb.a
            public final void a(boolean z) {
                com.amoad.NativeVideoView.this.f174a.a(!z);
            }
        };
        this.w = new com.amoad.aj<>();
        com.amoad.ar arVar = new com.amoad.ar(context);
        this.f174a = arVar;
        arVar.d = this;
        addView(this.f174a);
        com.amoad.aw awVar = new com.amoad.aw(context);
        this.k = awVar;
        awVar.setOnClickListener(onClickListener);
        addView(this.k);
        com.amoad.bb bbVar = new com.amoad.bb(context);
        this.b = bbVar;
        bbVar.f = this.v;
        this.b.a(true);
        addView(this.b);
        this.l = new android.os.Handler(android.os.Looper.getMainLooper());
    }

    private void a(com.amoad.NativeVideoView.State state) {
        com.amoad.NativeVideoView.State state2 = this.i;
        if (state2 == state) {
            return;
        }
        this.i = state;
        if (state2 == com.amoad.NativeVideoView.State.Idle && ((android.media.AudioManager) getContext().getSystemService("audio")).isMusicActive()) {
            this.b.a(false);
        }
        if (state == com.amoad.NativeVideoView.State.Playing) {
            k();
        } else {
            l();
        }
        e();
        a(state2, state);
    }

    private void a(final com.amoad.NativeVideoView.State state, final com.amoad.NativeVideoView.State state2) {
        this.u.a(new com.amoad.aj.a<com.amoad.NativeVideoView.b>() { // from class: com.amoad.NativeVideoView.4
            @Override // com.amoad.aj.a
            public final /* synthetic */ void a(com.amoad.NativeVideoView.b bVar) {
                final com.amoad.NativeVideoView.b bVar2 = bVar;
                com.amoad.NativeVideoView.this.l.post(new java.lang.Runnable() { // from class: com.amoad.NativeVideoView.4.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        bVar2.a(state2);
                    }
                });
            }
        });
    }

    static void g() {
        if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper()) {
            throw new java.lang.RuntimeException("Called from wrong thread.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        g();
        if (this.f) {
            f();
        } else {
            j();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        g();
        if (!this.f174a.g() || this.h) {
            return;
        }
        this.f174a.b();
        a(com.amoad.NativeVideoView.State.Paused);
    }

    private void k() {
        if (this.x != null) {
            return;
        }
        java.util.concurrent.ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = java.util.concurrent.Executors.newSingleThreadScheduledExecutor();
        this.x = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
        scheduledExecutorServiceNewSingleThreadScheduledExecutor.scheduleAtFixedRate(new java.lang.Runnable() { // from class: com.amoad.NativeVideoView.6
            @Override // java.lang.Runnable
            public final void run() {
                com.amoad.NativeVideoView.this.m();
                com.amoad.NativeVideoView.this.n();
            }
        }, 0L, 100L, java.util.concurrent.TimeUnit.MILLISECONDS);
    }

    private void l() {
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService = this.x;
        if (scheduledExecutorService == null) {
            return;
        }
        scheduledExecutorService.shutdown();
        this.x = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        this.y = java.lang.Math.max(this.y, this.f174a.e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        this.w.a(new com.amoad.aj.a<com.amoad.NativeVideoView.a>() { // from class: com.amoad.NativeVideoView.7
            @Override // com.amoad.aj.a
            public final /* synthetic */ void a(com.amoad.NativeVideoView.a aVar) {
                final com.amoad.NativeVideoView.a aVar2 = aVar;
                com.amoad.NativeVideoView.this.l.post(new java.lang.Runnable() { // from class: com.amoad.NativeVideoView.7.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        aVar2.a();
                    }
                });
            }
        });
    }

    @Override // com.amoad.ar.a
    public final void a() {
        this.o = true;
        com.amoad.ar arVar = this.f174a;
        arVar.a((int) arVar.e());
        i();
    }

    public final void a(android.media.MediaPlayer mediaPlayer) {
        this.f174a.a(mediaPlayer);
        this.f174a.a(!this.b.g);
        this.y = 0L;
        this.h = false;
        a(com.amoad.NativeVideoView.State.Idle);
        i();
    }

    final boolean a(com.amoad.NativeVideoView.a aVar) {
        return this.w.a(aVar);
    }

    final boolean a(com.amoad.NativeVideoView.b bVar) {
        return this.u.a(bVar);
    }

    @Override // com.amoad.ar.a
    public final void b() {
        this.o = false;
        j();
    }

    final boolean b(com.amoad.NativeVideoView.b bVar) {
        return this.u.b(bVar);
    }

    @Override // com.amoad.ar.a
    public final void c() {
        this.h = true;
        m();
        n();
        a(com.amoad.NativeVideoView.State.PlaybackCompleted);
    }

    @Override // com.amoad.ar.a
    public final void d() {
        a((android.media.MediaPlayer) null);
        a(com.amoad.NativeVideoView.State.Error);
    }

    final void e() {
        boolean z = !this.f && (this.i == com.amoad.NativeVideoView.State.Idle || this.i == com.amoad.NativeVideoView.State.Paused);
        this.k.setVisibility(z ? 0 : 4);
        this.b.setVisibility((z || this.h) ? 4 : 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f() {
        g();
        if (!this.f174a.g() || this.h) {
            return;
        }
        if (!this.o || !this.p || !this.q || !this.r) {
            j();
        } else {
            this.f174a.a();
            a(com.amoad.NativeVideoView.State.Playing);
        }
    }

    public final long h() {
        m();
        return this.h ? this.f174a.f() : this.y;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.amoad.g.a(this).a(this.s);
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        getContext().getApplicationContext().registerReceiver(this.t, intentFilter);
        this.p = ((android.os.PowerManager) getContext().getSystemService("power")).isInteractive();
        this.q = getVisibility() == 0;
        i();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.amoad.g.a(this).b(this.s);
        getContext().getApplicationContext().unregisterReceiver(this.t);
        j();
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        com.amoad.ar arVar = this.f174a;
        int measuredWidth = arVar.getMeasuredWidth();
        int measuredHeight = arVar.getMeasuredHeight();
        int i5 = i3 - i;
        int i6 = (i5 - measuredWidth) / 2;
        int i7 = i4 - i2;
        int i8 = (i7 - measuredHeight) / 2;
        arVar.layout(i6, i8, measuredWidth + i6, measuredHeight + i8);
        com.amoad.aw awVar = this.k;
        int measuredWidth2 = (i5 - awVar.getMeasuredWidth()) / 2;
        int measuredHeight2 = (i7 - awVar.getMeasuredHeight()) / 2;
        awVar.setPadding(measuredWidth2, measuredHeight2, measuredWidth2, measuredHeight2);
        awVar.layout(i, i2, i3, i4);
        com.amoad.AMoAdPlacement aMoAdPlacement = this.c.b == com.amoad.AMoAdPlacement.TOP_LEFT ? com.amoad.AMoAdPlacement.TOP_RIGHT : com.amoad.AMoAdPlacement.TOP_LEFT;
        this.b.a(this.c.c.mSize * 2, this.c.c.mSize * 2);
        aMoAdPlacement.layout(this.b, this.f174a.c ? this : this.f174a);
    }

    @Override // android.view.View
    protected final void onVisibilityChanged(android.view.View view, int i) {
        if (i == 0) {
            this.q = true;
            i();
        } else {
            this.q = false;
            j();
        }
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        super.setVisibility(i);
        this.f174a.setVisibility(i);
    }
}
