package com.applovin.exoplayer2.ui;

/* JADX INFO: loaded from: classes3.dex */
public class e extends android.widget.FrameLayout {
    private boolean A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.exoplayer2.ui.e.a f563a;
    private final com.applovin.exoplayer2.ui.AspectRatioFrameLayout b;
    private final android.view.View c;
    private final android.view.View d;
    private final boolean f;
    private final android.widget.ImageView g;
    private final com.applovin.exoplayer2.ui.SubtitleView h;
    private final android.view.View i;
    private final android.widget.TextView j;
    private final com.applovin.exoplayer2.ui.d k;
    private final android.widget.FrameLayout l;
    private final android.widget.FrameLayout m;
    private com.applovin.impl.qh n;
    private boolean o;
    private com.applovin.exoplayer2.ui.d.e p;
    private boolean q;
    private android.graphics.drawable.Drawable r;
    private int s;
    private boolean t;
    private java.lang.CharSequence u;
    private int v;
    private boolean w;
    private boolean x;
    private boolean y;
    private int z;

    public e(android.content.Context context) {
        this(context, null);
    }

    private boolean a(int i) {
        return i == 19 || i == 270 || i == 22 || i == 271 || i == 20 || i == 269 || i == 21 || i == 268 || i == 23;
    }

    private boolean m() {
        if (!this.q) {
            return false;
        }
        com.applovin.impl.b1.b(this.g);
        return true;
    }

    private boolean n() {
        if (!this.o) {
            return false;
        }
        com.applovin.impl.b1.b(this.k);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        com.applovin.impl.qh qhVar = this.n;
        if (qhVar != null && qhVar.d()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        boolean zA = a(keyEvent.getKeyCode());
        if (zA && n() && !this.k.c()) {
            a(true);
            return true;
        }
        if (a(keyEvent) || super.dispatchKeyEvent(keyEvent)) {
            a(true);
            return true;
        }
        if (zA && n()) {
            a(true);
        }
        return false;
    }

    public java.util.List<com.applovin.impl.t> getAdOverlayInfos() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.widget.FrameLayout frameLayout = this.m;
        if (frameLayout != null) {
            arrayList.add(new com.applovin.impl.t(frameLayout, 3, "Transparent overlay does not impact viewability"));
        }
        com.applovin.exoplayer2.ui.d dVar = this.k;
        if (dVar != null) {
            arrayList.add(new com.applovin.impl.t(dVar, 0));
        }
        return com.applovin.impl.db.a((java.util.Collection) arrayList);
    }

    public android.view.ViewGroup getAdViewGroup() {
        return (android.view.ViewGroup) com.applovin.impl.b1.a(this.l, "exo_ad_overlay must be present for ad playback");
    }

    public boolean getControllerAutoShow() {
        return this.w;
    }

    public boolean getControllerHideOnTouch() {
        return this.y;
    }

    public int getControllerShowTimeoutMs() {
        return this.v;
    }

    public android.graphics.drawable.Drawable getDefaultArtwork() {
        return this.r;
    }

    public android.widget.FrameLayout getOverlayFrameLayout() {
        return this.m;
    }

    public int getResizeMode() {
        com.applovin.impl.b1.b(this.b);
        return this.b.getResizeMode();
    }

    public com.applovin.exoplayer2.ui.SubtitleView getSubtitleView() {
        return this.h;
    }

    public boolean getUseArtwork() {
        return this.q;
    }

    public boolean getUseController() {
        return this.o;
    }

    public android.view.View getVideoSurfaceView() {
        return this.d;
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (!n() || this.n == null) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.A = true;
            return true;
        }
        if (action != 1 || !this.A) {
            return false;
        }
        this.A = false;
        performClick();
        return true;
    }

    @Override // android.view.View
    public boolean onTrackballEvent(android.view.MotionEvent motionEvent) {
        if (!n() || this.n == null) {
            return false;
        }
        a(true);
        return true;
    }

    @Override // android.view.View
    public boolean performClick() {
        super.performClick();
        return g();
    }

    public void setAspectRatioListener(com.applovin.exoplayer2.ui.AspectRatioFrameLayout.b bVar) {
        com.applovin.impl.b1.b(this.b);
        this.b.setAspectRatioListener(bVar);
    }

    public void setControllerAutoShow(boolean z) {
        this.w = z;
    }

    public void setControllerHideDuringAds(boolean z) {
        this.x = z;
    }

    public void setControllerHideOnTouch(boolean z) {
        com.applovin.impl.b1.b(this.k);
        this.y = z;
        j();
    }

    public void setControllerShowTimeoutMs(int i) {
        com.applovin.impl.b1.b(this.k);
        this.v = i;
        if (this.k.c()) {
            f();
        }
    }

    public void setControllerVisibilityListener(com.applovin.exoplayer2.ui.d.e eVar) {
        com.applovin.impl.b1.b(this.k);
        com.applovin.exoplayer2.ui.d.e eVar2 = this.p;
        if (eVar2 == eVar) {
            return;
        }
        if (eVar2 != null) {
            this.k.b(eVar2);
        }
        this.p = eVar;
        if (eVar != null) {
            this.k.a(eVar);
        }
    }

    public void setCustomErrorMessage(java.lang.CharSequence charSequence) {
        com.applovin.impl.b1.b(this.j != null);
        this.u = charSequence;
        l();
    }

    public void setDefaultArtwork(android.graphics.drawable.Drawable drawable) {
        if (this.r != drawable) {
            this.r = drawable;
            c(false);
        }
    }

    public void setKeepContentOnPlayerReset(boolean z) {
        if (this.t != z) {
            this.t = z;
            c(false);
        }
    }

    public void setPlayer(com.applovin.impl.qh qhVar) {
        com.applovin.impl.b1.b(android.os.Looper.myLooper() == android.os.Looper.getMainLooper());
        com.applovin.impl.b1.a(qhVar == null || qhVar.p() == android.os.Looper.getMainLooper());
        com.applovin.impl.qh qhVar2 = this.n;
        if (qhVar2 == qhVar) {
            return;
        }
        if (qhVar2 != null) {
            qhVar2.a(this.f563a);
            if (qhVar2.b(26)) {
                android.view.View view = this.d;
                if (view instanceof android.view.TextureView) {
                    qhVar2.b((android.view.TextureView) view);
                } else if (view instanceof android.view.SurfaceView) {
                    qhVar2.b((android.view.SurfaceView) view);
                }
            }
        }
        com.applovin.exoplayer2.ui.SubtitleView subtitleView = this.h;
        if (subtitleView != null) {
            subtitleView.setCues(null);
        }
        this.n = qhVar;
        if (n()) {
            this.k.setPlayer(qhVar);
        }
        i();
        l();
        c(true);
        if (qhVar == null) {
            c();
            return;
        }
        if (qhVar.b(26)) {
            android.view.View view2 = this.d;
            if (view2 instanceof android.view.TextureView) {
                qhVar.a((android.view.TextureView) view2);
            } else if (view2 instanceof android.view.SurfaceView) {
                qhVar.a((android.view.SurfaceView) view2);
            }
            h();
        }
        if (this.h != null && qhVar.b(27)) {
            this.h.setCues(qhVar.x());
        }
        qhVar.b(this.f563a);
        a(false);
    }

    public void setRepeatToggleModes(int i) {
        com.applovin.impl.b1.b(this.k);
        this.k.setRepeatToggleModes(i);
    }

    public void setResizeMode(int i) {
        com.applovin.impl.b1.b(this.b);
        this.b.setResizeMode(i);
    }

    public void setShowBuffering(int i) {
        if (this.s != i) {
            this.s = i;
            i();
        }
    }

    public void setShowFastForwardButton(boolean z) {
        com.applovin.impl.b1.b(this.k);
        this.k.setShowFastForwardButton(z);
    }

    public void setShowMultiWindowTimeBar(boolean z) {
        com.applovin.impl.b1.b(this.k);
        this.k.setShowMultiWindowTimeBar(z);
    }

    public void setShowNextButton(boolean z) {
        com.applovin.impl.b1.b(this.k);
        this.k.setShowNextButton(z);
    }

    public void setShowPreviousButton(boolean z) {
        com.applovin.impl.b1.b(this.k);
        this.k.setShowPreviousButton(z);
    }

    public void setShowRewindButton(boolean z) {
        com.applovin.impl.b1.b(this.k);
        this.k.setShowRewindButton(z);
    }

    public void setShowShuffleButton(boolean z) {
        com.applovin.impl.b1.b(this.k);
        this.k.setShowShuffleButton(z);
    }

    public void setShutterBackgroundColor(int i) {
        android.view.View view = this.c;
        if (view != null) {
            view.setBackgroundColor(i);
        }
    }

    public void setUseArtwork(boolean z) {
        com.applovin.impl.b1.b((z && this.g == null) ? false : true);
        if (this.q != z) {
            this.q = z;
            c(false);
        }
    }

    public void setUseController(boolean z) {
        com.applovin.impl.b1.b((z && this.k == null) ? false : true);
        if (this.o == z) {
            return;
        }
        this.o = z;
        if (n()) {
            this.k.setPlayer(this.n);
        } else {
            com.applovin.exoplayer2.ui.d dVar = this.k;
            if (dVar != null) {
                dVar.a();
                this.k.setPlayer(null);
            }
        }
        j();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        android.view.View view = this.d;
        if (view instanceof android.view.SurfaceView) {
            view.setVisibility(i);
        }
    }

    public e(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void b(boolean z) {
        if (n()) {
            this.k.setShowTimeoutMs(z ? 0 : this.v);
            this.k.g();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean d() {
        com.applovin.impl.qh qhVar = this.n;
        return qhVar != null && qhVar.d() && this.n.l();
    }

    private boolean e() {
        com.applovin.impl.qh qhVar = this.n;
        if (qhVar == null) {
            return true;
        }
        int iO = qhVar.o();
        return this.w && (iO == 1 || iO == 4 || !this.n.l());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        com.applovin.impl.qh qhVar = this.n;
        com.applovin.impl.xq xqVarZ = qhVar != null ? qhVar.z() : com.applovin.impl.xq.f;
        int i = xqVarZ.f1516a;
        int i2 = xqVarZ.b;
        int i3 = xqVarZ.c;
        float f = (i2 == 0 || i == 0) ? 0.0f : (i * xqVarZ.d) / i2;
        android.view.View view = this.d;
        if (view instanceof android.view.TextureView) {
            if (f > 0.0f && (i3 == 90 || i3 == 270)) {
                f = 1.0f / f;
            }
            if (this.z != 0) {
                view.removeOnLayoutChangeListener(this.f563a);
            }
            this.z = i3;
            if (i3 != 0) {
                this.d.addOnLayoutChangeListener(this.f563a);
            }
            b((android.view.TextureView) this.d, this.z);
        }
        a(this.b, this.f ? 0.0f : f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:14:0x0020  */
    public void i() {
        boolean z;
        if (this.i != null) {
            com.applovin.impl.qh qhVar = this.n;
            if (qhVar == null || qhVar.o() != 2) {
                z = false;
            } else {
                int i = this.s;
                z = true;
                if (i != 2 && (i != 1 || !this.n.l())) {
                    z = false;
                }
            }
            this.i.setVisibility(z ? 0 : 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        com.applovin.exoplayer2.ui.d dVar = this.k;
        if (dVar == null || !this.o) {
            setContentDescription(null);
        } else if (dVar.getVisibility() == 0) {
            setContentDescription(this.y ? getResources().getString(com.applovin.sdk.R.string.al_exo_controls_hide) : null);
        } else {
            setContentDescription(getResources().getString(com.applovin.sdk.R.string.al_exo_controls_show));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        if (d() && this.x) {
            c();
        } else {
            a(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        android.widget.TextView textView = this.j;
        if (textView != null) {
            java.lang.CharSequence charSequence = this.u;
            if (charSequence != null) {
                textView.setText(charSequence);
                this.j.setVisibility(0);
            } else {
                com.applovin.impl.qh qhVar = this.n;
                if (qhVar != null) {
                    qhVar.c();
                }
                this.j.setVisibility(8);
            }
        }
    }

    public void c() {
        com.applovin.exoplayer2.ui.d dVar = this.k;
        if (dVar != null) {
            dVar.a();
        }
    }

    public void f() {
        b(e());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        int i2;
        boolean z;
        int i3;
        int integer;
        boolean z2;
        boolean z3;
        int i4;
        boolean z4;
        int i5;
        boolean z5;
        int i6;
        boolean z6;
        boolean z7;
        boolean z8;
        int i7;
        boolean z9;
        super(context, attributeSet, i);
        com.applovin.exoplayer2.ui.e.a aVar = new com.applovin.exoplayer2.ui.e.a();
        this.f563a = aVar;
        if (isInEditMode()) {
            this.b = null;
            this.c = null;
            this.d = null;
            this.f = false;
            this.g = null;
            this.h = null;
            this.i = null;
            this.j = null;
            this.k = null;
            this.l = null;
            this.m = null;
            android.widget.ImageView imageView = new android.widget.ImageView(context);
            if (com.applovin.impl.xp.f1515a >= 23) {
                b(getResources(), imageView);
            } else {
                a(getResources(), imageView);
            }
            addView(imageView);
            return;
        }
        int i8 = com.applovin.sdk.R.layout.applovin_exo_player_view;
        if (attributeSet != null) {
            android.content.res.TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, com.applovin.sdk.R.styleable.AppLovinPlayerView, i, 0);
            try {
                boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(com.applovin.sdk.R.styleable.AppLovinPlayerView_al_shutter_background_color);
                int color = typedArrayObtainStyledAttributes.getColor(com.applovin.sdk.R.styleable.AppLovinPlayerView_al_shutter_background_color, 0);
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(com.applovin.sdk.R.styleable.AppLovinPlayerView_al_player_layout_id, i8);
                boolean z10 = typedArrayObtainStyledAttributes.getBoolean(com.applovin.sdk.R.styleable.AppLovinPlayerView_al_use_artwork, true);
                int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(com.applovin.sdk.R.styleable.AppLovinPlayerView_al_default_artwork, 0);
                boolean z11 = typedArrayObtainStyledAttributes.getBoolean(com.applovin.sdk.R.styleable.AppLovinPlayerView_al_use_controller, true);
                int i9 = typedArrayObtainStyledAttributes.getInt(com.applovin.sdk.R.styleable.AppLovinPlayerView_al_surface_type, 1);
                int i10 = typedArrayObtainStyledAttributes.getInt(com.applovin.sdk.R.styleable.AppLovinPlayerView_al_resize_mode, 0);
                int i11 = typedArrayObtainStyledAttributes.getInt(com.applovin.sdk.R.styleable.AppLovinPlayerView_al_show_timeout, 5000);
                boolean z12 = typedArrayObtainStyledAttributes.getBoolean(com.applovin.sdk.R.styleable.AppLovinPlayerView_al_hide_on_touch, true);
                boolean z13 = typedArrayObtainStyledAttributes.getBoolean(com.applovin.sdk.R.styleable.AppLovinPlayerView_al_auto_show, true);
                integer = typedArrayObtainStyledAttributes.getInteger(com.applovin.sdk.R.styleable.AppLovinPlayerView_al_show_buffering, 0);
                this.t = typedArrayObtainStyledAttributes.getBoolean(com.applovin.sdk.R.styleable.AppLovinPlayerView_al_keep_content_on_player_reset, this.t);
                boolean z14 = typedArrayObtainStyledAttributes.getBoolean(com.applovin.sdk.R.styleable.AppLovinPlayerView_al_hide_during_ads, true);
                typedArrayObtainStyledAttributes.recycle();
                z3 = z12;
                z = z13;
                i3 = i10;
                z6 = z11;
                i6 = resourceId2;
                z5 = z10;
                i5 = color;
                z4 = zHasValue;
                i4 = i9;
                i8 = resourceId;
                i2 = i11;
                z2 = z14;
            } catch (java.lang.Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            i2 = 5000;
            z = true;
            i3 = 0;
            integer = 0;
            z2 = true;
            z3 = true;
            i4 = 1;
            z4 = false;
            i5 = 0;
            z5 = true;
            i6 = 0;
            z6 = true;
        }
        android.view.LayoutInflater.from(context).inflate(i8, this);
        setDescendantFocusability(262144);
        com.applovin.exoplayer2.ui.AspectRatioFrameLayout aspectRatioFrameLayout = (com.applovin.exoplayer2.ui.AspectRatioFrameLayout) findViewById(com.applovin.sdk.R.id.al_exo_content_frame);
        this.b = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            a(aspectRatioFrameLayout, i3);
        }
        android.view.View viewFindViewById = findViewById(com.applovin.sdk.R.id.al_exo_shutter);
        this.c = viewFindViewById;
        if (viewFindViewById != null && z4) {
            viewFindViewById.setBackgroundColor(i5);
        }
        if (aspectRatioFrameLayout != null && i4 != 0) {
            android.view.ViewGroup.LayoutParams layoutParams = new android.view.ViewGroup.LayoutParams(-1, -1);
            if (i4 == 2) {
                z7 = true;
                this.d = new android.view.TextureView(context);
            } else {
                if (i4 != 3) {
                    if (i4 != 4) {
                        this.d = new android.view.SurfaceView(context);
                    } else {
                        try {
                            this.d = (android.view.View) java.lang.Class.forName("com.applovin.impl.rq").getConstructor(android.content.Context.class).newInstance(context);
                        } catch (java.lang.Exception e) {
                            throw new java.lang.IllegalStateException("video_decoder_gl_surface_view requires an ExoPlayer dependency", e);
                        }
                    }
                    z7 = true;
                } else {
                    try {
                        z7 = true;
                        this.d = (android.view.View) java.lang.Class.forName("com.applovin.impl.rk").getConstructor(android.content.Context.class).newInstance(context);
                        z9 = true;
                    } catch (java.lang.Exception e2) {
                        throw new java.lang.IllegalStateException("spherical_gl_surface_view requires an ExoPlayer dependency", e2);
                    }
                }
                this.d.setLayoutParams(layoutParams);
                this.d.setOnClickListener(aVar);
                this.d.setClickable(false);
                aspectRatioFrameLayout.addView(this.d, 0);
                z8 = z9;
            }
            z9 = false;
            this.d.setLayoutParams(layoutParams);
            this.d.setOnClickListener(aVar);
            this.d.setClickable(false);
            aspectRatioFrameLayout.addView(this.d, 0);
            z8 = z9;
        } else {
            z7 = true;
            this.d = null;
            z8 = false;
        }
        this.f = z8;
        this.l = (android.widget.FrameLayout) findViewById(com.applovin.sdk.R.id.al_exo_ad_overlay);
        this.m = (android.widget.FrameLayout) findViewById(com.applovin.sdk.R.id.al_exo_overlay);
        android.widget.ImageView imageView2 = (android.widget.ImageView) findViewById(com.applovin.sdk.R.id.al_exo_artwork);
        this.g = imageView2;
        this.q = (!z5 || imageView2 == null) ? false : z7;
        if (i6 != 0) {
            this.r = androidx.core.content.ContextCompat.getDrawable(getContext(), i6);
        }
        com.applovin.exoplayer2.ui.SubtitleView subtitleView = (com.applovin.exoplayer2.ui.SubtitleView) findViewById(com.applovin.sdk.R.id.al_exo_subtitles);
        this.h = subtitleView;
        if (subtitleView != null) {
            subtitleView.c();
            subtitleView.d();
        }
        android.view.View viewFindViewById2 = findViewById(com.applovin.sdk.R.id.al_exo_buffering);
        this.i = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setVisibility(8);
        }
        this.s = integer;
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.applovin.sdk.R.id.al_exo_error_message);
        this.j = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        com.applovin.exoplayer2.ui.d dVar = (com.applovin.exoplayer2.ui.d) findViewById(com.applovin.sdk.R.id.al_exo_controller);
        android.view.View viewFindViewById3 = findViewById(com.applovin.sdk.R.id.al_exo_controller_placeholder);
        if (dVar != null) {
            this.k = dVar;
            i7 = 0;
        } else if (viewFindViewById3 != null) {
            i7 = 0;
            com.applovin.exoplayer2.ui.d dVar2 = new com.applovin.exoplayer2.ui.d(context, null, 0, attributeSet);
            this.k = dVar2;
            dVar2.setId(com.applovin.sdk.R.id.al_exo_controller);
            dVar2.setLayoutParams(viewFindViewById3.getLayoutParams());
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) viewFindViewById3.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById3);
            viewGroup.removeView(viewFindViewById3);
            viewGroup.addView(dVar2, iIndexOfChild);
        } else {
            i7 = 0;
            this.k = null;
        }
        com.applovin.exoplayer2.ui.d dVar3 = this.k;
        this.v = dVar3 != null ? i2 : i7;
        this.y = z3;
        this.w = z;
        this.x = z2;
        this.o = (!z6 || dVar3 == null) ? i7 : z7;
        c();
        j();
        com.applovin.exoplayer2.ui.d dVar4 = this.k;
        if (dVar4 != null) {
            dVar4.a(aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(boolean z) {
        com.applovin.impl.qh qhVar = this.n;
        if (qhVar != null && !qhVar.k().a()) {
            if (z && !this.t) {
                a();
            }
            com.applovin.impl.to toVarA = qhVar.A();
            for (int i = 0; i < toVarA.f1374a; i++) {
                com.applovin.impl.so soVarA = toVarA.a(i);
                if (soVarA != null) {
                    for (int i2 = 0; i2 < soVarA.b(); i2++) {
                        if (com.applovin.impl.hf.e(soVarA.a(i2).m) == 2) {
                            b();
                            return;
                        }
                    }
                }
            }
            a();
            if (m() && (a(qhVar.C()) || a(this.r))) {
                return;
            }
            b();
            return;
        }
        if (this.t) {
            return;
        }
        b();
        a();
    }

    private void b() {
        android.widget.ImageView imageView = this.g;
        if (imageView != null) {
            imageView.setImageResource(android.R.color.transparent);
            this.g.setVisibility(4);
        }
    }

    private static void b(android.content.res.Resources resources, android.widget.ImageView imageView) {
        imageView.setImageDrawable(resources.getDrawable(com.applovin.sdk.R.drawable.applovin_exo_edit_mode_logo, null));
        imageView.setBackgroundColor(resources.getColor(com.applovin.sdk.R.color.al_exo_edit_mode_background_color, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(android.view.TextureView textureView, int i) {
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        float width = textureView.getWidth();
        float height = textureView.getHeight();
        if (width != 0.0f && height != 0.0f && i != 0) {
            float f = width / 2.0f;
            float f2 = height / 2.0f;
            matrix.postRotate(i, f, f2);
            android.graphics.RectF rectF = new android.graphics.RectF(0.0f, 0.0f, width, height);
            android.graphics.RectF rectF2 = new android.graphics.RectF();
            matrix.mapRect(rectF2, rectF);
            matrix.postScale(width / rectF2.width(), height / rectF2.height(), f, f2);
        }
        textureView.setTransform(matrix);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g() {
        if (!n() || this.n == null) {
            return false;
        }
        if (!this.k.c()) {
            a(true);
        } else if (this.y) {
            this.k.a();
        }
        return true;
    }

    public com.applovin.impl.qh getPlayer() {
        return this.n;
    }

    public void setErrorMessageProvider(com.applovin.impl.s7 s7Var) {
        if (s7Var != null) {
            l();
        }
    }

    @java.lang.Deprecated
    public void setControlDispatcher(com.applovin.impl.s4 s4Var) {
        com.applovin.impl.b1.b(this.k);
        this.k.setControlDispatcher(s4Var);
    }

    private boolean a(com.applovin.impl.ud udVar) {
        byte[] bArr = udVar.l;
        if (bArr == null) {
            return false;
        }
        return a(new android.graphics.drawable.BitmapDrawable(getResources(), android.graphics.BitmapFactory.decodeByteArray(bArr, 0, bArr.length)));
    }

    public boolean a(android.view.KeyEvent keyEvent) {
        return n() && this.k.a(keyEvent);
    }

    protected void a(com.applovin.exoplayer2.ui.AspectRatioFrameLayout aspectRatioFrameLayout, float f) {
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setAspectRatio(f);
        }
    }

    private void a(boolean z) {
        if (!(d() && this.x) && n()) {
            boolean z2 = this.k.c() && this.k.getShowTimeoutMs() <= 0;
            boolean zE = e();
            if (z || z2 || zE) {
                b(zE);
            }
        }
    }

    private boolean a(android.graphics.drawable.Drawable drawable) {
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                a(this.b, intrinsicWidth / intrinsicHeight);
                this.g.setImageDrawable(drawable);
                this.g.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    private void a() {
        android.view.View view = this.c;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    private static void a(android.content.res.Resources resources, android.widget.ImageView imageView) {
        imageView.setImageDrawable(resources.getDrawable(com.applovin.sdk.R.drawable.applovin_exo_edit_mode_logo));
        imageView.setBackgroundColor(resources.getColor(com.applovin.sdk.R.color.al_exo_edit_mode_background_color));
    }

    private static void a(com.applovin.exoplayer2.ui.AspectRatioFrameLayout aspectRatioFrameLayout, int i) {
        aspectRatioFrameLayout.setResizeMode(i);
    }

    private final class a implements com.applovin.impl.qh.e, android.view.View.OnLayoutChangeListener, android.view.View.OnClickListener, com.applovin.exoplayer2.ui.d.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.applovin.impl.fo.b f564a = new com.applovin.impl.fo.b();
        private java.lang.Object b;

        public a() {
        }

        @Override // com.applovin.impl.qh.e, com.applovin.impl.qh.c
        public void b(int i) {
            com.applovin.exoplayer2.ui.e.this.i();
            com.applovin.exoplayer2.ui.e.this.l();
            com.applovin.exoplayer2.ui.e.this.k();
        }

        @Override // com.applovin.exoplayer2.ui.d.e
        public void d(int i) {
            com.applovin.exoplayer2.ui.e.this.j();
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View view) {
            com.applovin.exoplayer2.ui.e.this.g();
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(android.view.View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            com.applovin.exoplayer2.ui.e.b((android.view.TextureView) view, com.applovin.exoplayer2.ui.e.this.z);
        }

        @Override // com.applovin.impl.qh.e, com.applovin.impl.qh.c
        public void a(com.applovin.impl.qh.f fVar, com.applovin.impl.qh.f fVar2, int i) {
            if (com.applovin.exoplayer2.ui.e.this.d() && com.applovin.exoplayer2.ui.e.this.x) {
                com.applovin.exoplayer2.ui.e.this.c();
            }
        }

        @Override // com.applovin.impl.qh.e, com.applovin.impl.qh.c
        public void a(com.applovin.impl.po poVar, com.applovin.impl.to toVar) {
            com.applovin.impl.qh qhVar = (com.applovin.impl.qh) com.applovin.impl.b1.a(com.applovin.exoplayer2.ui.e.this.n);
            com.applovin.impl.fo foVarN = qhVar.n();
            if (foVarN.c()) {
                this.b = null;
            } else if (!qhVar.k().a()) {
                this.b = foVarN.a(qhVar.v(), this.f564a, true).b;
            } else {
                java.lang.Object obj = this.b;
                if (obj != null) {
                    int iA = foVarN.a(obj);
                    if (iA != -1) {
                        if (qhVar.t() == foVarN.a(iA, this.f564a).c) {
                            return;
                        }
                    }
                    this.b = null;
                }
            }
            com.applovin.exoplayer2.ui.e.this.c(false);
        }

        @Override // com.applovin.impl.qh.e
        public void a(com.applovin.impl.xq xqVar) {
            com.applovin.exoplayer2.ui.e.this.h();
        }

        @Override // com.applovin.impl.qh.e
        public void a(java.util.List list) {
            if (com.applovin.exoplayer2.ui.e.this.h != null) {
                com.applovin.exoplayer2.ui.e.this.h.setCues(list);
            }
        }

        @Override // com.applovin.impl.qh.e
        public void a() {
            if (com.applovin.exoplayer2.ui.e.this.c != null) {
                com.applovin.exoplayer2.ui.e.this.c.setVisibility(4);
            }
        }

        @Override // com.applovin.impl.qh.e, com.applovin.impl.qh.c
        public void a(boolean z, int i) {
            com.applovin.exoplayer2.ui.e.this.i();
            com.applovin.exoplayer2.ui.e.this.k();
        }
    }
}
