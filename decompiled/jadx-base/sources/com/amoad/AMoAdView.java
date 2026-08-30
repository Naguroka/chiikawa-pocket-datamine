package com.amoad;

/* JADX INFO: loaded from: classes3.dex */
public final class AMoAdView extends android.widget.RelativeLayout {
    private android.app.Dialog A;
    private com.amoad.g.a B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    com.amoad.AdCallback f147a;
    com.amoad.ab b;
    android.os.Handler c;
    private int d;
    private android.content.Context e;
    private java.lang.String f;
    private boolean g;
    private boolean h;
    private com.amoad.AdCallback2 i;
    private android.view.View j;
    private android.view.View k;
    private android.view.View l;
    private boolean m;
    private boolean n;
    private boolean o;
    private float p;
    private int q;
    private int r;
    private boolean s;
    private com.amoad.a t;
    private com.amoad.AMoAdView.RotateTransition u;
    private com.amoad.AMoAdView.ClickTransition v;
    private float w;
    private java.util.Map<java.lang.Class<?>, java.lang.Object> x;
    private com.amoad.AdClickListener y;
    private java.lang.String[] z;

    /* JADX INFO: renamed from: com.amoad.AMoAdView$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f154a;

        static {
            int[] iArr = new int[com.amoad.AMoAdView.RotateTransition.values().length];
            f154a = iArr;
            try {
                iArr[com.amoad.AMoAdView.RotateTransition.ROTATE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f154a[com.amoad.AMoAdView.RotateTransition.SCALE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f154a[com.amoad.AMoAdView.RotateTransition.TRANSLATE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                f154a[com.amoad.AMoAdView.RotateTransition.ALPHA.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                f154a[com.amoad.AMoAdView.RotateTransition.NONE.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
        }
    }

    public enum ClickTransition {
        NONE,
        JUMP
    }

    public enum RotateTransition {
        NONE,
        ALPHA,
        ROTATE,
        SCALE,
        TRANSLATE
    }

    class a implements android.view.View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        java.lang.String f160a;
        boolean b;

        a(java.lang.String str, boolean z) {
            this.f160a = str;
            this.b = z;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            final boolean zA = com.amoad.AMoAdView.a(com.amoad.AMoAdView.this.b);
            if (!this.b) {
                com.amoad.AMoAdView.this.a(this.f160a, zA);
                return;
            }
            android.view.animation.ScaleAnimation scaleAnimation = new android.view.animation.ScaleAnimation(1.0f, 1.3f, 1.0f, 1.3f, 0, com.amoad.AMoAdView.this.getWidth() / 2, 0, com.amoad.AMoAdView.this.getHeight() / 2);
            scaleAnimation.setDuration(1000L);
            scaleAnimation.setAnimationListener(new com.amoad.q() { // from class: com.amoad.AMoAdView.a.1
                @Override // com.amoad.q, android.view.animation.Animation.AnimationListener
                public final void onAnimationEnd(android.view.animation.Animation animation) {
                    com.amoad.AMoAdView.this.a(com.amoad.AMoAdView.a.this.f160a, zA);
                }
            });
            com.amoad.AMoAdView.this.startAnimation(scaleAnimation);
        }
    }

    public AMoAdView(android.content.Context context) {
        super(context);
        this.d = 15000;
        this.g = false;
        this.u = com.amoad.AMoAdView.RotateTransition.NONE;
        this.v = com.amoad.AMoAdView.ClickTransition.NONE;
        this.x = new java.util.HashMap();
        a(context, (android.util.AttributeSet) null, true);
    }

    AMoAdView(android.content.Context context, byte b) {
        super(context);
        this.d = 15000;
        this.g = false;
        this.u = com.amoad.AMoAdView.RotateTransition.NONE;
        this.v = com.amoad.AMoAdView.ClickTransition.NONE;
        this.x = new java.util.HashMap();
        a(context, (android.util.AttributeSet) null, false);
    }

    public AMoAdView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = 15000;
        this.g = false;
        this.u = com.amoad.AMoAdView.RotateTransition.NONE;
        this.v = com.amoad.AMoAdView.ClickTransition.NONE;
        this.x = new java.util.HashMap();
        a(context, attributeSet, true);
    }

    public AMoAdView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = 15000;
        this.g = false;
        this.u = com.amoad.AMoAdView.RotateTransition.NONE;
        this.v = com.amoad.AMoAdView.ClickTransition.NONE;
        this.x = new java.util.HashMap();
        a(context, attributeSet, true);
    }

    private java.lang.Object a(java.lang.Class<?> cls) {
        java.lang.Object obj;
        java.lang.Object adVar;
        java.lang.Object obj2 = this.x.get(cls);
        if (obj2 != null) {
            return obj2;
        }
        if (cls.equals(com.amoad.f.class)) {
            adVar = new com.amoad.f(getContext());
        } else if (cls.equals(com.amoad.bl.class)) {
            adVar = new com.amoad.bl(getContext());
        } else {
            if (!cls.equals(com.amoad.ad.class)) {
                if (cls.equals(android.webkit.WebView.class)) {
                    obj = obj2;
                    android.webkit.WebView webView = new android.webkit.WebView(getContext());
                    webView.setVerticalScrollBarEnabled(false);
                    webView.setHorizontalScrollBarEnabled(false);
                    webView.setOnTouchListener(new android.view.View.OnTouchListener() { // from class: com.amoad.AMoAdView.10
                        @Override // android.view.View.OnTouchListener
                        public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                            return motionEvent.getAction() == 2;
                        }
                    });
                    webView.setOnHoverListener(new android.view.View.OnHoverListener() { // from class: com.amoad.AMoAdView.11
                        @Override // android.view.View.OnHoverListener
                        public final boolean onHover(android.view.View view, android.view.MotionEvent motionEvent) {
                            return motionEvent.getAction() == 7;
                        }
                    });
                    android.webkit.WebSettings settings = webView.getSettings();
                    settings.setCacheMode(1);
                    settings.setAllowFileAccess(true);
                    settings.setJavaScriptEnabled(true);
                    try {
                        settings.getClass().getMethod("setMediaPlaybackRequiresUserGesture", java.lang.Boolean.TYPE).invoke(settings, java.lang.Boolean.FALSE);
                    } catch (java.lang.Exception e) {
                        com.amoad.Logger.w("AMoAdView", e);
                    }
                    settings.setDomStorageEnabled(true);
                    settings.setAppCachePath(getContext().getCacheDir().getAbsolutePath());
                    settings.setAppCacheEnabled(true);
                    adVar = webView;
                }
                obj = obj2;
                return obj;
            }
            adVar = new com.amoad.ad(getContext());
        }
        this.x.put(cls, adVar);
        obj = adVar;
        obj = obj2;
        return obj;
    }

    private static void a(android.content.Context context) {
        if (!(context instanceof android.app.Activity)) {
            throw new java.lang.IllegalArgumentException("com.amoad.AMoAdViewのコンストラクタにContextではなくActivityを渡してください");
        }
    }

    private void a(android.content.Context context, android.util.AttributeSet attributeSet) {
        com.amoad.AMoAdView.RotateTransition rotateTransition;
        java.lang.String attributeValue = attributeSet.getAttributeValue("http://schemas.amoad.com/apk/res/android", "sid");
        if (attributeValue != null && attributeValue.startsWith("@string/")) {
            android.content.res.Resources resources = getResources();
            attributeValue = resources.getString(resources.getIdentifier(attributeValue, androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_STRING, context.getPackageName()));
        }
        setSid(attributeValue);
        setClickTransition("jump".equals(attributeSet.getAttributeValue("http://schemas.amoad.com/apk/res/android", "click_transition")) ? com.amoad.AMoAdView.ClickTransition.JUMP : com.amoad.AMoAdView.ClickTransition.NONE);
        java.lang.String attributeValue2 = attributeSet.getAttributeValue("http://schemas.amoad.com/apk/res/android", "rotate_transition");
        if ("alpha".equals(attributeValue2)) {
            rotateTransition = com.amoad.AMoAdView.RotateTransition.ALPHA;
        } else if ("rotate".equals(attributeValue2)) {
            rotateTransition = com.amoad.AMoAdView.RotateTransition.ROTATE;
        } else if ("scale".equals(attributeValue2)) {
            rotateTransition = com.amoad.AMoAdView.RotateTransition.SCALE;
        } else {
            rotateTransition = "translate".equals(attributeValue2) ? com.amoad.AMoAdView.RotateTransition.TRANSLATE : com.amoad.AMoAdView.RotateTransition.NONE;
        }
        setRotateTransition(rotateTransition);
        setResponsiveStyle(attributeSet.getAttributeBooleanValue("http://schemas.amoad.com/apk/res/android", "responsive_style", false));
    }

    private void a(android.content.Context context, android.util.AttributeSet attributeSet, boolean z) {
        if (z) {
            a(context);
        }
        this.e = context;
        this.c = new android.os.Handler(context.getMainLooper());
        this.w = com.amoad.x.a(context);
        this.k = new com.amoad.ag(context, this.w);
        this.l = new android.view.View(this.e);
        setResponsiveStyle(false);
        setRotation(true);
        if (attributeSet != null) {
            a(context, attributeSet);
        }
    }

    private void a(android.graphics.drawable.Drawable drawable) {
        setBackground(drawable);
    }

    private void a(android.view.View view) {
        if (view.getParent() == null) {
            addView(view);
        } else {
            view.bringToFront();
        }
    }

    static /* synthetic */ void a(com.amoad.AMoAdView aMoAdView, final com.amoad.ab abVar) {
        aMoAdView.getViewTreeObserver().addOnPreDrawListener(new android.view.ViewTreeObserver.OnPreDrawListener() { // from class: com.amoad.AMoAdView.12
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                com.amoad.AMoAdView.this.getViewTreeObserver().removeOnPreDrawListener(this);
                com.amoad.AMoAdView.a(com.amoad.AMoAdView.this, abVar.g, abVar.q);
                com.amoad.AMoAdView.a(com.amoad.AMoAdView.this, abVar.h);
                return true;
            }
        });
    }

    static /* synthetic */ void a(com.amoad.AMoAdView aMoAdView, final java.lang.String str) {
        aMoAdView.c();
        aMoAdView.B = new com.amoad.g.a() { // from class: com.amoad.AMoAdView.3
            private int c = 0;

            @Override // com.amoad.g.a
            public final void a(android.view.View view, float f) {
                if (!com.amoad.AMoAdView.this.isShown() || f < 0.5d) {
                    this.c = 0;
                    return;
                }
                int i = this.c;
                this.c = i + 1;
                if (((long) i) * com.amoad.g.f306a >= com.amoad.g.b) {
                    com.amoad.l.b(com.amoad.AMoAdView.this.e, str);
                    com.amoad.AMoAdView.this.c();
                }
            }
        };
        com.amoad.g.a(aMoAdView).a(aMoAdView.B);
    }

    static /* synthetic */ void a(com.amoad.AMoAdView aMoAdView, final java.lang.String str, long j) {
        com.amoad.bc.a(new android.os.Handler(android.os.Looper.getMainLooper()), new java.lang.Runnable() { // from class: com.amoad.AMoAdView.2
            @Override // java.lang.Runnable
            public final void run() {
                if (com.amoad.AMoAdView.this.isShown()) {
                    com.amoad.l.a(com.amoad.AMoAdView.this.e, str);
                }
            }
        }, j);
    }

    private void a(boolean z) {
        if (this.m != z && z && !android.text.TextUtils.isEmpty(this.f)) {
            com.amoad.n.a().a(this.e, this.f, this);
        }
        this.m = z;
    }

    private boolean a(int i, int i2) {
        if (this.j == null) {
            return false;
        }
        android.graphics.Rect rect = new android.graphics.Rect();
        this.k.getHitRect(rect);
        if (rect.contains(i, i2)) {
            return false;
        }
        android.view.View view = this.j;
        if (view instanceof com.amoad.bl) {
            ((com.amoad.bl) view).a(rect);
            if (rect.contains(i - this.j.getLeft(), i2 - this.j.getTop())) {
                return false;
            }
        }
        this.j.getHitRect(rect);
        return rect.contains(i, i2);
    }

    static /* synthetic */ boolean a(com.amoad.ab abVar) {
        if (abVar != null) {
            return abVar.t ? abVar.r : abVar.s;
        }
        return false;
    }

    private void b() {
        android.app.Dialog dialog = this.A;
        if (dialog != null) {
            dialog.dismiss();
            this.A = null;
        }
    }

    private void b(boolean z) {
        a(z ? new android.graphics.drawable.ColorDrawable(android.graphics.Color.parseColor("#BBFFFFFF")) : null);
    }

    static /* synthetic */ android.view.View c(com.amoad.AMoAdView aMoAdView, final com.amoad.ab abVar) {
        com.amoad.ab.a aVar = abVar.j;
        int i = (int) (abVar.l * aMoAdView.w);
        int i2 = (int) (abVar.m * aMoAdView.w);
        final boolean zEquals = com.amoad.AMoAdView.ClickTransition.JUMP.equals(aMoAdView.v);
        if (aVar instanceof com.amoad.ab.d) {
            if (!android.text.TextUtils.isEmpty(aMoAdView.f)) {
                com.amoad.n.a().a(aMoAdView.f);
            }
            com.amoad.ab.d dVar = (com.amoad.ab.d) aVar;
            com.amoad.f fVar = (com.amoad.f) aMoAdView.a(com.amoad.f.class);
            fVar.setImage(new com.amoad.d(dVar.e, dVar.f));
            fVar.setOnClickListener(aMoAdView.new a(dVar.b, zEquals));
            fVar.a();
            return fVar;
        }
        if (!(aVar instanceof com.amoad.ab.e)) {
            if (aVar instanceof com.amoad.ab.c) {
                if (!android.text.TextUtils.isEmpty(aMoAdView.f)) {
                    com.amoad.n.a().a(aMoAdView.f);
                }
                com.amoad.ab.c cVar = (com.amoad.ab.c) aVar;
                android.webkit.WebView webView = (android.webkit.WebView) aMoAdView.a(android.webkit.WebView.class);
                webView.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(i, i2));
                webView.setWebViewClient(new android.webkit.WebViewClient() { // from class: com.amoad.AMoAdView.8
                    @Override // android.webkit.WebViewClient
                    public final void onLoadResource(android.webkit.WebView webView2, java.lang.String str) {
                        if (str == null || !str.startsWith("https://d.amoad.com/click/")) {
                            return;
                        }
                        webView2.stopLoading();
                        com.amoad.AMoAdView.this.new a(str, zEquals).onClick(webView2);
                    }

                    @Override // android.webkit.WebViewClient
                    public final boolean shouldOverrideUrlLoading(android.webkit.WebView webView2, java.lang.String str) {
                        com.amoad.AMoAdView.this.new a(str, zEquals).onClick(webView2);
                        return true;
                    }
                });
                if (!android.text.TextUtils.isEmpty(cVar.b)) {
                    webView.loadDataWithBaseURL("https://adcloud.jp", cVar.b, "text/html", com.adjust.sdk.Constants.ENCODING, null);
                } else if (!android.text.TextUtils.isEmpty(cVar.f186a)) {
                    webView.loadUrl(cVar.f186a);
                }
                return webView;
            }
            if (!(aVar instanceof com.amoad.ab.b)) {
                return null;
            }
            if (!android.text.TextUtils.isEmpty(aMoAdView.f)) {
                com.amoad.n.a().a(aMoAdView.f);
            }
            com.amoad.ab.b bVar = (com.amoad.ab.b) aVar;
            com.amoad.ad adVar = (com.amoad.ad) aMoAdView.a(com.amoad.ad.class);
            adVar.setOnClickListener(aMoAdView.new a(bVar.d, zEquals));
            int i3 = abVar.l;
            int i4 = abVar.m;
            adVar.f = i3;
            adVar.g = i4;
            adVar.b.setText(bVar.b);
            adVar.f191a.setImageBitmap(bVar.f);
            java.lang.String[] strArrSplit = bVar.f185a.split("-");
            int color = android.graphics.Color.parseColor(strArrSplit[0]);
            adVar.b.setTextColor(color);
            adVar.c.setTextColor(color);
            adVar.setBackgroundDrawable(new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, strArrSplit[2].equals("#FFFFFF") ? adVar.d : adVar.e));
            return adVar;
        }
        if (abVar.t && !android.text.TextUtils.isEmpty(aMoAdView.f)) {
            com.amoad.n.a().a(aMoAdView.f);
        }
        com.amoad.ab.e eVar = (com.amoad.ab.e) aVar;
        com.amoad.bl blVar = (com.amoad.bl) aMoAdView.a(com.amoad.bl.class);
        blVar.f293a.a(eVar.e, eVar.f);
        android.media.MediaPlayer mediaPlayer = eVar.d;
        boolean z = abVar.t;
        com.amoad.bj bjVar = blVar.f293a;
        if (!mediaPlayer.equals(bjVar.f282a)) {
            if (bjVar.f282a != null) {
                bjVar.a(com.amoad.bj.c.f291a);
                bjVar.a(com.amoad.bj.b.Idle);
                bjVar.f282a.setOnSeekCompleteListener(null);
                bjVar.f282a.setOnCompletionListener(null);
                bjVar.f282a.setOnErrorListener(null);
                bjVar.f282a.setDisplay(null);
                bjVar.f282a = null;
            }
            bjVar.f282a = mediaPlayer;
            bjVar.f282a.setOnSeekCompleteListener(bjVar.g);
            bjVar.f282a.setOnCompletionListener(bjVar.e);
            bjVar.f282a.setOnErrorListener(bjVar.f);
            bjVar.f282a.setDisplay(bjVar.b);
            bjVar.a(com.amoad.bj.c.f291a);
            bjVar.a(com.amoad.bj.b.Prepared);
            bjVar.a(mediaPlayer.getVideoWidth(), mediaPlayer.getVideoHeight());
            bjVar.c = true;
        }
        bjVar.d = z;
        bjVar.a();
        blVar.f293a.a(!blVar.b.g);
        blVar.setOnClickListener(aMoAdView.new a(eVar.f188a, false));
        blVar.c = new com.amoad.bl.a() { // from class: com.amoad.AMoAdView.7
            @Override // com.amoad.bl.a
            public final void a() {
                abVar.t = true;
                if (android.text.TextUtils.isEmpty(com.amoad.AMoAdView.this.f)) {
                    return;
                }
                com.amoad.n.a().a(com.amoad.AMoAdView.this.f);
            }
        };
        return blVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        if (this.B != null) {
            com.amoad.g.a(this).b(this.B);
            this.B = null;
        }
    }

    static /* synthetic */ boolean c(com.amoad.AMoAdView aMoAdView) {
        aMoAdView.n = true;
        return true;
    }

    private java.util.List<java.lang.String> getMeasurementLinks() {
        com.amoad.ab.a aVar = this.b.j;
        if (aVar instanceof com.amoad.ab.b) {
            return ((com.amoad.ab.b) aVar).e;
        }
        if (aVar instanceof com.amoad.ab.d) {
            return ((com.amoad.ab.d) aVar).c;
        }
        if (aVar instanceof com.amoad.ab.e) {
            return ((com.amoad.ab.e) aVar).b;
        }
        return null;
    }

    final void a(final com.amoad.ab abVar, final boolean z) {
        com.amoad.Logger.d("AMoAdView", "onAdResponse()" + abVar.hashCode());
        com.amoad.bc.a(this.e, new java.lang.Runnable() { // from class: com.amoad.AMoAdView.6
            @Override // java.lang.Runnable
            public final void run() {
                if (!abVar.equals(com.amoad.AMoAdView.this.b)) {
                    com.amoad.AMoAdView.a(com.amoad.AMoAdView.this, abVar);
                }
                com.amoad.AMoAdView.this.b = abVar;
                com.amoad.AMoAdView.this.o = z;
                com.amoad.AMoAdView aMoAdView = com.amoad.AMoAdView.this;
                aMoAdView.j = com.amoad.AMoAdView.c(aMoAdView, abVar);
                com.amoad.AMoAdView.c(com.amoad.AMoAdView.this);
                com.amoad.AMoAdView.this.requestLayout();
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c0  */
    final void a(java.lang.String str) {
        boolean z;
        java.lang.String string;
        java.lang.String strA;
        com.amoad.AdClickListener adClickListener;
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        this.g = true;
        com.amoad.AdCallback2 adCallback2 = this.i;
        if (adCallback2 != null) {
            adCallback2.didClick();
            this.i.didPresentScreen();
            this.i.didLeaveApplication();
        }
        java.util.List<java.lang.String> measurementLinks = getMeasurementLinks();
        if (measurementLinks == null) {
            if (this.b.p && !android.text.TextUtils.isEmpty(this.b.o)) {
                com.amoad.l.e(this.e, str);
                string = android.net.Uri.parse("market://details?id=" + this.b.o).toString();
            } else {
                z = true;
                string = str;
            }
            strA = com.amoad.l.a(string, this.t, new android.util.Size(getMeasuredWidth(), getMeasuredHeight()));
            if (this.z != null || this.y == null) {
                adClickListener = this.y;
                if (adClickListener != null) {
                    adClickListener.onClick(strA);
                    return;
                }
            } else {
                java.lang.String scheme = android.net.Uri.parse(strA).getScheme();
                for (java.lang.String str2 : this.z) {
                    if (scheme != null && scheme.equals(str2)) {
                        this.y.onClick(strA);
                        return;
                    }
                }
            }
            if (z) {
                com.amoad.l.c(getContext(), str);
            } else {
                com.amoad.l.d(this.e, strA);
            }
        }
        java.util.Iterator<java.lang.String> it = measurementLinks.iterator();
        while (it.hasNext()) {
            com.amoad.l.e(this.e, it.next());
        }
        string = str;
        z = false;
        strA = com.amoad.l.a(string, this.t, new android.util.Size(getMeasuredWidth(), getMeasuredHeight()));
        if (this.z != null) {
            adClickListener = this.y;
            if (adClickListener != null) {
                adClickListener.onClick(strA);
                return;
            }
        } else {
            adClickListener = this.y;
            if (adClickListener != null) {
                adClickListener.onClick(strA);
                return;
            }
        }
        if (z) {
            com.amoad.l.c(getContext(), str);
        } else {
            com.amoad.l.d(this.e, strA);
        }
    }

    final void a(final java.lang.String str, boolean z) {
        if (!z) {
            a(str);
            return;
        }
        b();
        android.app.AlertDialog alertDialogCreate = new android.app.AlertDialog.Builder(this.e).setMessage("リンク先で詳細を確認しますか？").setNegativeButton("キャンセル", (android.content.DialogInterface.OnClickListener) null).setPositiveButton("確認する", new android.content.DialogInterface.OnClickListener() { // from class: com.amoad.AMoAdView.9
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(android.content.DialogInterface dialogInterface, int i) {
                com.amoad.AMoAdView.this.a(str);
            }
        }).create();
        this.A = alertDialogCreate;
        alertDialogCreate.show();
    }

    final synchronized boolean a() {
        return this.h;
    }

    final java.lang.String getLinkUrl() {
        com.amoad.ab abVar = this.b;
        if (abVar == null) {
            return null;
        }
        com.amoad.ab.a aVar = abVar.j;
        if (aVar instanceof com.amoad.ab.d) {
            return ((com.amoad.ab.d) aVar).b;
        }
        if (aVar instanceof com.amoad.ab.e) {
            return ((com.amoad.ab.e) aVar).f188a;
        }
        if (aVar instanceof com.amoad.ab.b) {
            return ((com.amoad.ab.b) aVar).d;
        }
        return null;
    }

    public final java.lang.String getSid() {
        return this.f;
    }

    public final int getmNetworkTimeoutMillis() {
        return this.d;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.amoad.Logger.d("AMoAdView", "onAttachedToWindow()");
        a(isShown());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.amoad.Logger.d("AMoAdView", "onDetachedFromWindow()");
        b();
        c();
        a(false);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x002e  */
    /* JADX WARN: Code duplicated, block: B:20:0x0032  */
    /* JADX WARN: Code duplicated, block: B:22:0x0047  */
    /* JADX WARN: Code duplicated, block: B:23:0x0055  */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        com.amoad.a aVar;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                if (this.s) {
                    this.s = false;
                    b(false);
                    if (a((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        aVar = new com.amoad.a(motionEvent.getX(), motionEvent.getY());
                    } else {
                        aVar = null;
                    }
                    this.t = aVar;
                }
            } else if (action != 2) {
                if (action == 3 || action == 4) {
                    if (this.s) {
                        this.s = false;
                        b(false);
                        if (a((int) motionEvent.getX(), (int) motionEvent.getY())) {
                            aVar = new com.amoad.a(motionEvent.getX(), motionEvent.getY());
                        } else {
                            aVar = null;
                        }
                        this.t = aVar;
                    }
                }
            } else if (this.s && !a((int) motionEvent.getX(), (int) motionEvent.getY())) {
                this.s = false;
                b(false);
            }
        } else if (a((int) motionEvent.getX(), (int) motionEvent.getY())) {
            this.s = true;
            b(true);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        com.amoad.ba baVar;
        android.view.animation.ScaleAnimation scaleAnimation;
        android.view.animation.TranslateAnimation translateAnimation;
        android.view.animation.AlphaAnimation alphaAnimation;
        if ((z || this.n) && this.b != null) {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                android.view.View childAt = getChildAt(childCount);
                if (!childAt.equals(this.j) && !childAt.equals(this.k) && !childAt.equals(this.l)) {
                    removeView(childAt);
                }
            }
            android.view.animation.Animation animation = null;
            if (getBackground() != null) {
                a((android.graphics.drawable.Drawable) null);
            }
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            android.view.View view = this.j;
            if (view != null) {
                a(view);
                this.j.layout(0, 0, measuredWidth, measuredHeight);
            }
            a(this.k);
            android.view.View view2 = this.k;
            view2.layout(measuredWidth - view2.getMeasuredWidth(), 0, measuredWidth, this.k.getMeasuredHeight());
            b(false);
            a(this.l);
            this.l.layout(0, 0, measuredWidth, measuredHeight);
            if (this.o && !(this.j instanceof com.amoad.bl)) {
                com.amoad.AMoAdView.RotateTransition rotateTransition = this.u;
                int width = getWidth();
                int height = getHeight();
                int i5 = com.amoad.AMoAdView.AnonymousClass4.f154a[rotateTransition.ordinal()];
                if (i5 == 1) {
                    baVar = new com.amoad.ba(width / 2, height / 2);
                    baVar.setDuration(androidx.media3.common.C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
                } else if (i5 == 2) {
                    scaleAnimation = new android.view.animation.ScaleAnimation(0.7f, 1.0f, 0.7f, 1.0f, 0, width / 2, 0, height / 2);
                    scaleAnimation.setDuration(1000L);
                } else if (i5 == 3) {
                    translateAnimation = new android.view.animation.TranslateAnimation(0.0f, 0.0f, 200.0f, 0.0f);
                    translateAnimation.setDuration(androidx.media3.common.C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
                } else if (i5 == 4) {
                    alphaAnimation = new android.view.animation.AlphaAnimation(0.0f, 1.0f);
                    alphaAnimation.setDuration(androidx.media3.common.C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
                }
                if (animation != null) {
                    animation = baVar;
                    animation = scaleAnimation;
                    animation = translateAnimation;
                    animation = alphaAnimation;
                    startAnimation(animation);
                }
            }
            animation = baVar;
            animation = scaleAnimation;
            animation = translateAnimation;
            animation = alphaAnimation;
            this.n = false;
        }
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        int minimumWidth;
        int minimumHeight;
        int measuredWidth;
        int measuredHeight;
        com.amoad.ab abVar = this.b;
        if (abVar != null) {
            float f = abVar.j instanceof com.amoad.ab.c ? this.w : this.w * this.p;
            minimumWidth = (int) ((this.b.l * f) + 0.5f);
            minimumHeight = (int) ((this.b.m * f) + 0.5f);
        } else {
            int i3 = this.q;
            int i4 = this.r;
            if (i3 == 0 && i4 == 0) {
                android.graphics.drawable.Drawable background = getBackground();
                if (background != null) {
                    minimumWidth = (int) ((background.getMinimumWidth() * this.p) + 0.5f);
                    minimumHeight = (int) ((background.getMinimumHeight() * this.p) + 0.5f);
                } else {
                    minimumHeight = 0;
                    minimumWidth = 0;
                }
            } else {
                float f2 = this.w;
                float f3 = this.p;
                int i5 = (int) ((i4 * f2 * f3) + 0.5f);
                minimumWidth = (int) ((i3 * f2 * f3) + 0.5f);
                minimumHeight = i5;
            }
        }
        int[] iArr = {minimumWidth, minimumHeight};
        int iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(minimumWidth, 1073741824);
        int iMakeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(iArr[1], 1073741824);
        this.k.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        android.view.View view = this.j;
        if (view != null) {
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            measuredWidth = this.j.getMeasuredWidth();
            measuredHeight = this.j.getMeasuredHeight();
        } else {
            measuredWidth = iArr[0];
            measuredHeight = iArr[1];
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
    }

    @Override // android.view.View
    protected final void onVisibilityChanged(android.view.View view, int i) {
        super.onVisibilityChanged(view, i);
        a(isShown());
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        a(isShown());
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(int i) {
        if (i == 0 && this.g) {
            com.amoad.AdCallback2 adCallback2 = this.i;
            if (adCallback2 != null) {
                adCallback2.didDismissScreen();
            }
            this.g = false;
        }
        super.onWindowVisibilityChanged(i);
        a(isShown());
    }

    final void setAdRequestUrl(java.lang.String str) {
        com.amoad.AMoAdBuildConfig.API_URL_AD = str;
    }

    public final void setCallback(com.amoad.AdCallback adCallback) {
        this.f147a = adCallback;
        if (adCallback instanceof com.amoad.AdCallback2) {
            this.i = (com.amoad.AdCallback2) adCallback;
        }
    }

    public final void setClickListenerWithSchemes(java.lang.String[] strArr, com.amoad.AdClickListener adClickListener) {
        this.y = adClickListener;
        this.z = strArr;
    }

    final void setClickPoint(com.amoad.a aVar) {
        this.t = aVar;
    }

    public final void setClickTransition(com.amoad.AMoAdView.ClickTransition clickTransition) {
        this.v = clickTransition;
    }

    final void setContext(android.content.Context context) {
        this.e = context;
    }

    @Override // android.view.View
    public final void setLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        if (layoutParams.height == -1) {
            layoutParams.height = -2;
        }
        super.setLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void setMinimumHeight(int i) {
        super.setMinimumHeight(i);
        this.r = i;
    }

    @Override // android.view.View
    public final void setMinimumWidth(int i) {
        super.setMinimumWidth(i);
        this.q = i;
    }

    public final void setNetworkTimeoutMillis(int i) {
        if (i > 0) {
            this.d = i;
        }
    }

    public final void setResponsiveStyle(boolean z) {
        this.p = z ? com.amoad.x.a(this.e, this.w) : 1.0f;
        com.amoad.bc.a(this.e, new java.lang.Runnable() { // from class: com.amoad.AMoAdView.1
            @Override // java.lang.Runnable
            public final void run() {
                com.amoad.AMoAdView.this.requestLayout();
            }
        });
    }

    public final void setRotateTransition(com.amoad.AMoAdView.RotateTransition rotateTransition) {
        this.u = rotateTransition;
    }

    final synchronized void setRotation(boolean z) {
        this.h = z;
    }

    public final void setSid(java.lang.String str) {
        setSid(str, false);
    }

    public final void setSid(java.lang.String str, boolean z) {
        com.amoad.Logger.d("AMoAdView", "setSid()".concat(java.lang.String.valueOf(str)));
        if (str == null || !java.util.regex.Pattern.matches("[a-f0-9]{64}", str)) {
            com.amoad.AMoAdLogger.getInstance().e(java.text.MessageFormat.format("sidが不正です。（sid={0}）管理画面から取得したsidを指定してください。", str));
            return;
        }
        if (!android.text.TextUtils.isEmpty(this.f) && !android.text.TextUtils.equals(this.f, str)) {
            com.amoad.n.a().a(this.f, this);
        }
        this.f = str;
        if (z) {
            com.amoad.n.a().b(this.f);
        }
        com.amoad.n.a().a(this.e, str, this);
    }
}
