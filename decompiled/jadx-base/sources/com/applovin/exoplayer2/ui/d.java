package com.applovin.exoplayer2.ui;

/* JADX INFO: loaded from: classes3.dex */
public class d extends android.widget.FrameLayout {
    private final java.lang.String A;
    private final android.graphics.drawable.Drawable B;
    private final android.graphics.drawable.Drawable C;
    private final float D;
    private final float E;
    private final java.lang.String F;
    private final java.lang.String G;
    private com.applovin.impl.qh H;
    private com.applovin.impl.s4 I;
    private boolean J;
    private boolean K;
    private boolean L;
    private boolean M;
    private int N;
    private int O;
    private int P;
    private boolean Q;
    private boolean R;
    private boolean S;
    private boolean T;
    private boolean U;
    private long V;
    private long[] W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.exoplayer2.ui.d.c f561a;
    private boolean[] a0;
    private final java.util.concurrent.CopyOnWriteArrayList b;
    private long[] b0;
    private final android.view.View c;
    private boolean[] c0;
    private final android.view.View d;
    private long d0;
    private long e0;
    private final android.view.View f;
    private long f0;
    private final android.view.View g;
    private final android.view.View h;
    private final android.view.View i;
    private final android.widget.ImageView j;
    private final android.widget.ImageView k;
    private final android.view.View l;
    private final android.widget.TextView m;
    private final android.widget.TextView n;
    private final com.applovin.exoplayer2.ui.i o;
    private final java.lang.StringBuilder p;
    private final java.util.Formatter q;
    private final com.applovin.impl.fo.b r;
    private final com.applovin.impl.fo.d s;
    private final java.lang.Runnable t;
    private final java.lang.Runnable u;
    private final android.graphics.drawable.Drawable v;
    private final android.graphics.drawable.Drawable w;
    private final android.graphics.drawable.Drawable x;
    private final java.lang.String y;
    private final java.lang.String z;

    private static final class b {
        public static boolean a(android.view.View view) {
            return view.isAccessibilityFocused();
        }
    }

    /* JADX INFO: renamed from: com.applovin.exoplayer2.ui.d$d, reason: collision with other inner class name */
    public interface InterfaceC0026d {
    }

    public interface e {
        void d(int i);
    }

    static {
        com.applovin.impl.e8.a("goog.exo.ui");
    }

    public d(android.content.Context context, android.util.AttributeSet attributeSet, int i, android.util.AttributeSet attributeSet2) {
        super(context, attributeSet, i);
        int resourceId = com.applovin.sdk.R.layout.applovin_exo_player_control_view;
        this.N = 5000;
        this.P = 0;
        this.O = 200;
        this.V = androidx.media3.common.C.TIME_UNSET;
        this.Q = true;
        this.R = true;
        this.S = true;
        this.T = true;
        this.U = false;
        if (attributeSet2 != null) {
            android.content.res.TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, com.applovin.sdk.R.styleable.AppLovinPlayerControlView, i, 0);
            try {
                this.N = typedArrayObtainStyledAttributes.getInt(com.applovin.sdk.R.styleable.AppLovinPlayerControlView_al_show_timeout, this.N);
                resourceId = typedArrayObtainStyledAttributes.getResourceId(com.applovin.sdk.R.styleable.AppLovinPlayerControlView_al_controller_layout_id, resourceId);
                this.P = a(typedArrayObtainStyledAttributes, this.P);
                this.Q = typedArrayObtainStyledAttributes.getBoolean(com.applovin.sdk.R.styleable.AppLovinPlayerControlView_al_show_rewind_button, this.Q);
                this.R = typedArrayObtainStyledAttributes.getBoolean(com.applovin.sdk.R.styleable.AppLovinPlayerControlView_al_show_fastforward_button, this.R);
                this.S = typedArrayObtainStyledAttributes.getBoolean(com.applovin.sdk.R.styleable.AppLovinPlayerControlView_al_show_previous_button, this.S);
                this.T = typedArrayObtainStyledAttributes.getBoolean(com.applovin.sdk.R.styleable.AppLovinPlayerControlView_al_show_next_button, this.T);
                this.U = typedArrayObtainStyledAttributes.getBoolean(com.applovin.sdk.R.styleable.AppLovinPlayerControlView_al_show_shuffle_button, this.U);
                setTimeBarMinUpdateInterval(typedArrayObtainStyledAttributes.getInt(com.applovin.sdk.R.styleable.AppLovinPlayerControlView_al_time_bar_min_update_interval, this.O));
                typedArrayObtainStyledAttributes.recycle();
            } catch (java.lang.Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        }
        this.b = new java.util.concurrent.CopyOnWriteArrayList();
        this.r = new com.applovin.impl.fo.b();
        this.s = new com.applovin.impl.fo.d();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        this.p = sb;
        this.q = new java.util.Formatter(sb, java.util.Locale.getDefault());
        this.W = new long[0];
        this.a0 = new boolean[0];
        this.b0 = new long[0];
        this.c0 = new boolean[0];
        com.applovin.exoplayer2.ui.d.c cVar = new com.applovin.exoplayer2.ui.d.c();
        this.f561a = cVar;
        this.I = new com.applovin.impl.t5();
        this.t = new java.lang.Runnable() { // from class: com.applovin.exoplayer2.ui.d$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.k();
            }
        };
        this.u = new java.lang.Runnable() { // from class: com.applovin.exoplayer2.ui.d$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a();
            }
        };
        android.view.LayoutInflater.from(context).inflate(resourceId, this);
        setDescendantFocusability(262144);
        com.applovin.exoplayer2.ui.i iVar = (com.applovin.exoplayer2.ui.i) findViewById(com.applovin.sdk.R.id.al_exo_progress);
        android.view.View viewFindViewById = findViewById(com.applovin.sdk.R.id.al_exo_progress_placeholder);
        if (iVar != null) {
            this.o = iVar;
        } else if (viewFindViewById != null) {
            com.applovin.exoplayer2.ui.b bVar = new com.applovin.exoplayer2.ui.b(context, null, 0, attributeSet2);
            bVar.setId(com.applovin.sdk.R.id.al_exo_progress);
            bVar.setLayoutParams(viewFindViewById.getLayoutParams());
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) viewFindViewById.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById);
            viewGroup.removeView(viewFindViewById);
            viewGroup.addView(bVar, iIndexOfChild);
            this.o = bVar;
        } else {
            this.o = null;
        }
        this.m = (android.widget.TextView) findViewById(com.applovin.sdk.R.id.al_exo_duration);
        this.n = (android.widget.TextView) findViewById(com.applovin.sdk.R.id.al_exo_position);
        com.applovin.exoplayer2.ui.i iVar2 = this.o;
        if (iVar2 != null) {
            iVar2.a(cVar);
        }
        android.view.View viewFindViewById2 = findViewById(com.applovin.sdk.R.id.al_exo_play);
        this.f = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(cVar);
        }
        android.view.View viewFindViewById3 = findViewById(com.applovin.sdk.R.id.al_exo_pause);
        this.g = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(cVar);
        }
        android.view.View viewFindViewById4 = findViewById(com.applovin.sdk.R.id.al_exo_prev);
        this.c = viewFindViewById4;
        if (viewFindViewById4 != null) {
            viewFindViewById4.setOnClickListener(cVar);
        }
        android.view.View viewFindViewById5 = findViewById(com.applovin.sdk.R.id.al_exo_next);
        this.d = viewFindViewById5;
        if (viewFindViewById5 != null) {
            viewFindViewById5.setOnClickListener(cVar);
        }
        android.view.View viewFindViewById6 = findViewById(com.applovin.sdk.R.id.al_exo_rew);
        this.i = viewFindViewById6;
        if (viewFindViewById6 != null) {
            viewFindViewById6.setOnClickListener(cVar);
        }
        android.view.View viewFindViewById7 = findViewById(com.applovin.sdk.R.id.al_exo_ffwd);
        this.h = viewFindViewById7;
        if (viewFindViewById7 != null) {
            viewFindViewById7.setOnClickListener(cVar);
        }
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.applovin.sdk.R.id.al_exo_repeat_toggle);
        this.j = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(cVar);
        }
        android.widget.ImageView imageView2 = (android.widget.ImageView) findViewById(com.applovin.sdk.R.id.al_exo_shuffle);
        this.k = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(cVar);
        }
        android.view.View viewFindViewById8 = findViewById(com.applovin.sdk.R.id.al_exo_vr);
        this.l = viewFindViewById8;
        setShowVrButton(false);
        a(false, false, viewFindViewById8);
        android.content.res.Resources resources = context.getResources();
        this.D = resources.getInteger(com.applovin.sdk.R.integer.al_exo_media_button_opacity_percentage_enabled) / 100.0f;
        this.E = resources.getInteger(com.applovin.sdk.R.integer.al_exo_media_button_opacity_percentage_disabled) / 100.0f;
        this.v = resources.getDrawable(com.applovin.sdk.R.drawable.al_exo_controls_repeat_off);
        this.w = resources.getDrawable(com.applovin.sdk.R.drawable.al_exo_controls_repeat_one);
        this.x = resources.getDrawable(com.applovin.sdk.R.drawable.al_exo_controls_repeat_all);
        this.B = resources.getDrawable(com.applovin.sdk.R.drawable.al_exo_controls_shuffle_on);
        this.C = resources.getDrawable(com.applovin.sdk.R.drawable.al_exo_controls_shuffle_off);
        this.y = resources.getString(com.applovin.sdk.R.string.al_exo_controls_repeat_off_description);
        this.z = resources.getString(com.applovin.sdk.R.string.al_exo_controls_repeat_one_description);
        this.A = resources.getString(com.applovin.sdk.R.string.al_exo_controls_repeat_all_description);
        this.F = resources.getString(com.applovin.sdk.R.string.al_exo_controls_shuffle_on_description);
        this.G = resources.getString(com.applovin.sdk.R.string.al_exo_controls_shuffle_off_description);
    }

    private static boolean a(int i) {
        return i == 90 || i == 89 || i == 85 || i == 79 || i == 126 || i == 127 || i == 87 || i == 88;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        return a(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            removeCallbacks(this.u);
        } else if (motionEvent.getAction() == 1) {
            b();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public int getRepeatToggleModes() {
        return this.P;
    }

    public boolean getShowShuffleButton() {
        return this.U;
    }

    public int getShowTimeoutMs() {
        return this.N;
    }

    public boolean getShowVrButton() {
        android.view.View view = this.l;
        return view != null && view.getVisibility() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.J = true;
        long j = this.V;
        if (j != androidx.media3.common.C.TIME_UNSET) {
            long jUptimeMillis = j - android.os.SystemClock.uptimeMillis();
            if (jUptimeMillis <= 0) {
                a();
            } else {
                postDelayed(this.u, jUptimeMillis);
            }
        } else if (c()) {
            b();
        }
        h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.J = false;
        removeCallbacks(this.t);
        removeCallbacks(this.u);
    }

    public void setPlayer(com.applovin.impl.qh qhVar) {
        boolean z = true;
        com.applovin.impl.b1.b(android.os.Looper.myLooper() == android.os.Looper.getMainLooper());
        if (qhVar != null && qhVar.p() != android.os.Looper.getMainLooper()) {
            z = false;
        }
        com.applovin.impl.b1.a(z);
        com.applovin.impl.qh qhVar2 = this.H;
        if (qhVar2 == qhVar) {
            return;
        }
        if (qhVar2 != null) {
            qhVar2.a(this.f561a);
        }
        this.H = qhVar;
        if (qhVar != null) {
            qhVar.b(this.f561a);
        }
        h();
    }

    public void setProgressUpdateListener(com.applovin.exoplayer2.ui.d.InterfaceC0026d interfaceC0026d) {
    }

    public void setRepeatToggleModes(int i) {
        this.P = i;
        com.applovin.impl.qh qhVar = this.H;
        if (qhVar != null) {
            int iM = qhVar.m();
            if (i == 0 && iM != 0) {
                this.I.a(this.H, 0);
            } else if (i == 1 && iM == 2) {
                this.I.a(this.H, 1);
            } else if (i == 2 && iM == 1) {
                this.I.a(this.H, 2);
            }
        }
        l();
    }

    public void setShowFastForwardButton(boolean z) {
        this.R = z;
        i();
    }

    public void setShowMultiWindowTimeBar(boolean z) {
        this.K = z;
        n();
    }

    public void setShowNextButton(boolean z) {
        this.T = z;
        i();
    }

    public void setShowPreviousButton(boolean z) {
        this.S = z;
        i();
    }

    public void setShowRewindButton(boolean z) {
        this.Q = z;
        i();
    }

    public void setShowShuffleButton(boolean z) {
        this.U = z;
        m();
    }

    public void setShowTimeoutMs(int i) {
        this.N = i;
        if (c()) {
            b();
        }
    }

    public void setShowVrButton(boolean z) {
        android.view.View view = this.l;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
        }
    }

    public void setTimeBarMinUpdateInterval(int i) {
        this.O = com.applovin.impl.xp.a(i, 16, 1000);
    }

    public void setVrButtonListener(android.view.View.OnClickListener onClickListener) {
        android.view.View view = this.l;
        if (view != null) {
            view.setOnClickListener(onClickListener);
            a(getShowVrButton(), onClickListener != null, this.l);
        }
    }

    private void d() {
        android.view.View view;
        android.view.View view2;
        boolean zF = f();
        if (!zF && (view2 = this.f) != null) {
            view2.sendAccessibilityEvent(8);
        } else {
            if (!zF || (view = this.g) == null) {
                return;
            }
            view.sendAccessibilityEvent(8);
        }
    }

    private boolean f() {
        com.applovin.impl.qh qhVar = this.H;
        return (qhVar == null || qhVar.o() == 4 || this.H.o() == 1 || !this.H.l()) ? false : true;
    }

    private void h() {
        j();
        i();
        l();
        m();
        n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        boolean z;
        boolean zB;
        boolean z2;
        boolean z3;
        if (c() && this.J) {
            com.applovin.impl.qh qhVar = this.H;
            boolean z4 = false;
            if (qhVar != null) {
                boolean zB2 = qhVar.b(4);
                boolean zB3 = qhVar.b(6);
                z3 = qhVar.b(10) && this.I.b();
                if (qhVar.b(11) && this.I.a()) {
                    z4 = true;
                }
                zB = qhVar.b(8);
                z = z4;
                z4 = zB3;
                z2 = zB2;
            } else {
                z = false;
                zB = false;
                z2 = false;
                z3 = false;
            }
            a(this.S, z4, this.c);
            a(this.Q, z3, this.i);
            a(this.R, z, this.h);
            a(this.T, zB, this.d);
            com.applovin.exoplayer2.ui.i iVar = this.o;
            if (iVar != null) {
                iVar.setEnabled(z2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        boolean z;
        boolean z2;
        if (c() && this.J) {
            boolean zF = f();
            android.view.View view = this.f;
            boolean z3 = true;
            if (view != null) {
                z = zF && view.isFocused();
                if (com.applovin.impl.xp.f1515a < 21) {
                    z2 = z;
                } else {
                    z2 = zF && com.applovin.exoplayer2.ui.d.b.a(this.f);
                }
                this.f.setVisibility(zF ? 8 : 0);
            } else {
                z = false;
                z2 = false;
            }
            android.view.View view2 = this.g;
            if (view2 != null) {
                z |= !zF && view2.isFocused();
                if (com.applovin.impl.xp.f1515a < 21) {
                    z3 = z;
                } else if (zF || !com.applovin.exoplayer2.ui.d.b.a(this.g)) {
                    z3 = false;
                }
                z2 |= z3;
                this.g.setVisibility(zF ? 0 : 8);
            }
            if (z) {
                e();
            }
            if (z2) {
                d();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        long jG;
        long jS;
        if (c() && this.J) {
            com.applovin.impl.qh qhVar = this.H;
            if (qhVar != null) {
                jG = this.d0 + qhVar.g();
                jS = this.d0 + qhVar.s();
            } else {
                jG = 0;
                jS = 0;
            }
            boolean z = jG != this.e0;
            this.e0 = jG;
            this.f0 = jS;
            android.widget.TextView textView = this.n;
            if (textView != null && !this.M && z) {
                textView.setText(com.applovin.impl.xp.a(this.p, this.q, jG));
            }
            com.applovin.exoplayer2.ui.i iVar = this.o;
            if (iVar != null) {
                iVar.setPosition(jG);
                this.o.setBufferedPosition(jS);
            }
            removeCallbacks(this.t);
            int iO = qhVar == null ? 1 : qhVar.o();
            if (qhVar == null || !qhVar.isPlaying()) {
                if (iO == 4 || iO == 1) {
                    return;
                }
                postDelayed(this.t, 1000L);
                return;
            }
            com.applovin.exoplayer2.ui.i iVar2 = this.o;
            long jMin = java.lang.Math.min(iVar2 != null ? iVar2.getPreferredUpdateDelay() : 1000L, 1000 - (jG % 1000));
            float f = qhVar.a().f1145a;
            postDelayed(this.t, com.applovin.impl.xp.b(f > 0.0f ? (long) (jMin / f) : 1000L, this.O, 1000L));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        android.widget.ImageView imageView;
        if (c() && this.J && (imageView = this.j) != null) {
            if (this.P == 0) {
                a(false, false, (android.view.View) imageView);
                return;
            }
            com.applovin.impl.qh qhVar = this.H;
            if (qhVar == null) {
                a(true, false, (android.view.View) imageView);
                this.j.setImageDrawable(this.v);
                this.j.setContentDescription(this.y);
                return;
            }
            a(true, true, (android.view.View) imageView);
            int iM = qhVar.m();
            if (iM == 0) {
                this.j.setImageDrawable(this.v);
                this.j.setContentDescription(this.y);
            } else if (iM == 1) {
                this.j.setImageDrawable(this.w);
                this.j.setContentDescription(this.z);
            } else if (iM == 2) {
                this.j.setImageDrawable(this.x);
                this.j.setContentDescription(this.A);
            }
            this.j.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        android.widget.ImageView imageView;
        if (c() && this.J && (imageView = this.k) != null) {
            com.applovin.impl.qh qhVar = this.H;
            if (!this.U) {
                a(false, false, (android.view.View) imageView);
                return;
            }
            if (qhVar == null) {
                a(true, false, (android.view.View) imageView);
                this.k.setImageDrawable(this.C);
                this.k.setContentDescription(this.G);
            } else {
                a(true, true, (android.view.View) imageView);
                this.k.setImageDrawable(qhVar.r() ? this.B : this.C);
                this.k.setContentDescription(qhVar.r() ? this.F : this.G);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:40:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d4 A[SYNTHETIC] */
    public void n() {
        int i;
        com.applovin.impl.fo.d dVar;
        long jE;
        long[] jArr;
        int length;
        com.applovin.impl.qh qhVar = this.H;
        if (qhVar == null) {
            return;
        }
        boolean z = true;
        this.L = this.K && a(qhVar.n(), this.s);
        long j = 0;
        this.d0 = 0L;
        com.applovin.impl.fo foVarN = qhVar.n();
        if (foVarN.c()) {
            i = 0;
        } else {
            int iT = qhVar.t();
            boolean z2 = this.L;
            int i2 = z2 ? 0 : iT;
            int iB = z2 ? foVarN.b() - 1 : iT;
            long j2 = 0;
            i = 0;
            while (i2 <= iB) {
                if (i2 == iT) {
                    this.d0 = com.applovin.impl.t2.b(j2);
                }
                foVarN.a(i2, this.s);
                com.applovin.impl.fo.d dVar2 = this.s;
                if (dVar2.o == androidx.media3.common.C.TIME_UNSET) {
                    com.applovin.impl.b1.b(this.L ^ z);
                    break;
                }
                int i3 = dVar2.p;
                while (true) {
                    dVar = this.s;
                    if (i3 <= dVar.q) {
                        foVarN.a(i3, this.r);
                        int iA = this.r.a();
                        for (int iF = this.r.f(); iF < iA; iF++) {
                            long jB = this.r.b(iF);
                            if (jB == Long.MIN_VALUE) {
                                long j3 = this.r.d;
                                if (j3 != androidx.media3.common.C.TIME_UNSET) {
                                    jB = j3;
                                    jE = jB + this.r.e();
                                    if (jE >= 0) {
                                        jArr = this.W;
                                        if (i == jArr.length) {
                                            if (jArr.length == 0) {
                                                length = 1;
                                            } else {
                                                length = jArr.length * 2;
                                            }
                                            this.W = java.util.Arrays.copyOf(jArr, length);
                                            this.a0 = java.util.Arrays.copyOf(this.a0, length);
                                        }
                                        this.W[i] = com.applovin.impl.t2.b(j2 + jE);
                                        this.a0[i] = this.r.e(iF);
                                        i++;
                                    }
                                }
                            } else {
                                jE = jB + this.r.e();
                                if (jE >= 0) {
                                    jArr = this.W;
                                    if (i == jArr.length) {
                                        if (jArr.length == 0) {
                                            length = 1;
                                        } else {
                                            length = jArr.length * 2;
                                        }
                                        this.W = java.util.Arrays.copyOf(jArr, length);
                                        this.a0 = java.util.Arrays.copyOf(this.a0, length);
                                    }
                                    this.W[i] = com.applovin.impl.t2.b(j2 + jE);
                                    this.a0[i] = this.r.e(iF);
                                    i++;
                                }
                            }
                        }
                        i3++;
                    }
                }
                j2 += dVar.o;
                i2++;
                z = true;
            }
            j = j2;
        }
        long jB2 = com.applovin.impl.t2.b(j);
        android.widget.TextView textView = this.m;
        if (textView != null) {
            textView.setText(com.applovin.impl.xp.a(this.p, this.q, jB2));
        }
        com.applovin.exoplayer2.ui.i iVar = this.o;
        if (iVar != null) {
            iVar.setDuration(jB2);
            int length2 = this.b0.length;
            int i4 = i + length2;
            long[] jArr2 = this.W;
            if (i4 > jArr2.length) {
                this.W = java.util.Arrays.copyOf(jArr2, i4);
                this.a0 = java.util.Arrays.copyOf(this.a0, i4);
            }
            java.lang.System.arraycopy(this.b0, 0, this.W, i, length2);
            java.lang.System.arraycopy(this.c0, 0, this.a0, i, length2);
            this.o.a(this.W, this.a0, i4);
        }
        k();
    }

    public void g() {
        if (!c()) {
            setVisibility(0);
            java.util.Iterator it = this.b.iterator();
            while (it.hasNext()) {
                ((com.applovin.exoplayer2.ui.d.e) it.next()).d(getVisibility());
            }
            h();
            e();
            d();
        }
        b();
    }

    private void e() {
        android.view.View view;
        android.view.View view2;
        boolean zF = f();
        if (!zF && (view2 = this.f) != null) {
            view2.requestFocus();
        } else {
            if (!zF || (view = this.g) == null) {
                return;
            }
            view.requestFocus();
        }
    }

    public com.applovin.impl.qh getPlayer() {
        return this.H;
    }

    @java.lang.Deprecated
    public void setControlDispatcher(com.applovin.impl.s4 s4Var) {
        if (this.I != s4Var) {
            this.I = s4Var;
            i();
        }
    }

    private final class c implements com.applovin.impl.qh.e, com.applovin.exoplayer2.ui.i.a, android.view.View.OnClickListener {
        private c() {
        }

        @Override // com.applovin.exoplayer2.ui.i.a
        public void b(com.applovin.exoplayer2.ui.i iVar, long j) {
            if (com.applovin.exoplayer2.ui.d.this.n != null) {
                com.applovin.exoplayer2.ui.d.this.n.setText(com.applovin.impl.xp.a(com.applovin.exoplayer2.ui.d.this.p, com.applovin.exoplayer2.ui.d.this.q, j));
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View view) {
            com.applovin.impl.qh qhVar = com.applovin.exoplayer2.ui.d.this.H;
            if (qhVar == null) {
                return;
            }
            if (com.applovin.exoplayer2.ui.d.this.d == view) {
                com.applovin.exoplayer2.ui.d.this.I.a(qhVar);
                return;
            }
            if (com.applovin.exoplayer2.ui.d.this.c == view) {
                com.applovin.exoplayer2.ui.d.this.I.e(qhVar);
                return;
            }
            if (com.applovin.exoplayer2.ui.d.this.h == view) {
                if (qhVar.o() != 4) {
                    com.applovin.exoplayer2.ui.d.this.I.d(qhVar);
                    return;
                }
                return;
            }
            if (com.applovin.exoplayer2.ui.d.this.i == view) {
                com.applovin.exoplayer2.ui.d.this.I.c(qhVar);
                return;
            }
            if (com.applovin.exoplayer2.ui.d.this.f == view) {
                com.applovin.exoplayer2.ui.d.this.b(qhVar);
                return;
            }
            if (com.applovin.exoplayer2.ui.d.this.g == view) {
                com.applovin.exoplayer2.ui.d.this.a(qhVar);
            } else if (com.applovin.exoplayer2.ui.d.this.j == view) {
                com.applovin.exoplayer2.ui.d.this.I.a(qhVar, com.applovin.impl.ui.a(qhVar.m(), com.applovin.exoplayer2.ui.d.this.P));
            } else if (com.applovin.exoplayer2.ui.d.this.k == view) {
                com.applovin.exoplayer2.ui.d.this.I.a(qhVar, !qhVar.r());
            }
        }

        @Override // com.applovin.impl.qh.e, com.applovin.impl.qh.c
        public void a(com.applovin.impl.qh qhVar, com.applovin.impl.qh.d dVar) {
            if (dVar.a(4, 5)) {
                com.applovin.exoplayer2.ui.d.this.j();
            }
            if (dVar.a(4, 5, 7)) {
                com.applovin.exoplayer2.ui.d.this.k();
            }
            if (dVar.a(8)) {
                com.applovin.exoplayer2.ui.d.this.l();
            }
            if (dVar.a(9)) {
                com.applovin.exoplayer2.ui.d.this.m();
            }
            if (dVar.a(8, 9, 11, 0, 13)) {
                com.applovin.exoplayer2.ui.d.this.i();
            }
            if (dVar.a(11, 0)) {
                com.applovin.exoplayer2.ui.d.this.n();
            }
        }

        @Override // com.applovin.exoplayer2.ui.i.a
        public void a(com.applovin.exoplayer2.ui.i iVar, long j) {
            com.applovin.exoplayer2.ui.d.this.M = true;
            if (com.applovin.exoplayer2.ui.d.this.n != null) {
                com.applovin.exoplayer2.ui.d.this.n.setText(com.applovin.impl.xp.a(com.applovin.exoplayer2.ui.d.this.p, com.applovin.exoplayer2.ui.d.this.q, j));
            }
        }

        @Override // com.applovin.exoplayer2.ui.i.a
        public void a(com.applovin.exoplayer2.ui.i iVar, long j, boolean z) {
            com.applovin.exoplayer2.ui.d.this.M = false;
            if (z || com.applovin.exoplayer2.ui.d.this.H == null) {
                return;
            }
            com.applovin.exoplayer2.ui.d dVar = com.applovin.exoplayer2.ui.d.this;
            dVar.a(dVar.H, j);
        }
    }

    private void c(com.applovin.impl.qh qhVar) {
        int iO = qhVar.o();
        if (iO != 1 && iO != 4 && qhVar.l()) {
            a(qhVar);
        } else {
            b(qhVar);
        }
    }

    public boolean c() {
        return getVisibility() == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(com.applovin.impl.qh qhVar) {
        int iO = qhVar.o();
        if (iO == 1) {
            this.I.b(qhVar);
        } else if (iO == 4) {
            a(qhVar, qhVar.t(), androidx.media3.common.C.TIME_UNSET);
        }
        this.I.b(qhVar, true);
    }

    public void b(com.applovin.exoplayer2.ui.d.e eVar) {
        this.b.remove(eVar);
    }

    private void b() {
        removeCallbacks(this.u);
        if (this.N > 0) {
            long jUptimeMillis = android.os.SystemClock.uptimeMillis();
            long j = this.N;
            this.V = jUptimeMillis + j;
            if (this.J) {
                postDelayed(this.u, j);
                return;
            }
            return;
        }
        this.V = androidx.media3.common.C.TIME_UNSET;
    }

    private static boolean a(com.applovin.impl.fo foVar, com.applovin.impl.fo.d dVar) {
        if (foVar.b() > 100) {
            return false;
        }
        int iB = foVar.b();
        for (int i = 0; i < iB; i++) {
            if (foVar.a(i, dVar).o == androidx.media3.common.C.TIME_UNSET) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.applovin.impl.qh qhVar) {
        this.I.b(qhVar, false);
    }

    private boolean a(com.applovin.impl.qh qhVar, int i, long j) {
        return this.I.a(qhVar, i, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.applovin.impl.qh qhVar, long j) {
        int iT;
        com.applovin.impl.fo foVarN = qhVar.n();
        if (this.L && !foVarN.c()) {
            int iB = foVarN.b();
            iT = 0;
            while (true) {
                long jD = foVarN.a(iT, this.s).d();
                if (j < jD) {
                    break;
                }
                if (iT == iB - 1) {
                    j = jD;
                    break;
                } else {
                    j -= jD;
                    iT++;
                }
            }
        } else {
            iT = qhVar.t();
        }
        a(qhVar, iT, j);
        k();
    }

    public void a(com.applovin.exoplayer2.ui.d.e eVar) {
        com.applovin.impl.b1.a(eVar);
        this.b.add(eVar);
    }

    public void a() {
        if (c()) {
            setVisibility(8);
            java.util.Iterator it = this.b.iterator();
            while (it.hasNext()) {
                ((com.applovin.exoplayer2.ui.d.e) it.next()).d(getVisibility());
            }
            removeCallbacks(this.t);
            removeCallbacks(this.u);
            this.V = androidx.media3.common.C.TIME_UNSET;
        }
    }

    private void a(boolean z, boolean z2, android.view.View view) {
        if (view == null) {
            return;
        }
        view.setEnabled(z2);
        view.setAlpha(z2 ? this.D : this.E);
        view.setVisibility(z ? 0 : 8);
    }

    public boolean a(android.view.KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        com.applovin.impl.qh qhVar = this.H;
        if (qhVar == null || !a(keyCode)) {
            return false;
        }
        if (keyEvent.getAction() != 0) {
            return true;
        }
        if (keyCode == 90) {
            if (qhVar.o() == 4) {
                return true;
            }
            this.I.d(qhVar);
            return true;
        }
        if (keyCode == 89) {
            this.I.c(qhVar);
            return true;
        }
        if (keyEvent.getRepeatCount() != 0) {
            return true;
        }
        if (keyCode == 79 || keyCode == 85) {
            c(qhVar);
            return true;
        }
        if (keyCode == 87) {
            this.I.a(qhVar);
            return true;
        }
        if (keyCode == 88) {
            this.I.e(qhVar);
            return true;
        }
        if (keyCode == 126) {
            b(qhVar);
            return true;
        }
        if (keyCode != 127) {
            return true;
        }
        a(qhVar);
        return true;
    }

    private static int a(android.content.res.TypedArray typedArray, int i) {
        return typedArray.getInt(com.applovin.sdk.R.styleable.AppLovinPlayerControlView_al_repeat_toggle_modes, i);
    }
}
