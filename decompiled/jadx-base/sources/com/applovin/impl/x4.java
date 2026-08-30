package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class x4 implements com.applovin.impl.r6.a {
    private static java.lang.ref.WeakReference m;
    private static final java.util.concurrent.atomic.AtomicBoolean n = new java.util.concurrent.atomic.AtomicBoolean();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.j f1486a;
    private final android.content.Context b;
    private final com.applovin.impl.w4 e;
    private com.applovin.impl.r6 g;
    private com.applovin.impl.go h;
    private int i;
    private boolean j;
    private long k;
    private boolean l;
    private final java.util.List c = new java.util.ArrayList(10);
    private final java.lang.Object d = new java.lang.Object();
    private java.lang.ref.WeakReference f = new java.lang.ref.WeakReference(null);

    private android.graphics.drawable.Drawable f() {
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(android.graphics.Color.rgb(5, org.objectweb.asm.Opcodes.LXOR, org.objectweb.asm.Opcodes.TABLESWITCH));
        android.graphics.drawable.GradientDrawable gradientDrawable2 = new android.graphics.drawable.GradientDrawable();
        gradientDrawable2.setShape(1);
        gradientDrawable2.setColor(android.graphics.Color.rgb(2, 98, 127));
        android.graphics.drawable.StateListDrawable stateListDrawable = new android.graphics.drawable.StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, gradientDrawable2);
        stateListDrawable.addState(new int[0], gradientDrawable);
        return stateListDrawable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean h() {
        java.lang.ref.WeakReference weakReference = m;
        return (weakReference == null || weakReference.get() == null) ? false : true;
    }

    public x4(com.applovin.impl.sdk.j jVar) {
        this.f1486a = jVar;
        android.content.Context contextM = com.applovin.impl.sdk.j.m();
        this.b = contextM;
        this.e = new com.applovin.impl.w4(contextM);
    }

    public void l() {
        if (g()) {
            this.j = ((java.lang.Boolean) this.f1486a.a(com.applovin.impl.sj.s1)).booleanValue();
            if (this.g == null) {
                this.g = new com.applovin.impl.r6(this.f1486a, this);
            }
            this.g.a();
        }
    }

    public void k() {
        com.applovin.impl.r6 r6Var = this.g;
        if (r6Var != null) {
            r6Var.b();
        }
    }

    public void d(java.lang.Object obj) {
        if (g() && obj != null) {
            if (!com.applovin.impl.ze.a(obj) || c(obj)) {
                if (com.applovin.impl.ze.b(obj) && c(obj)) {
                    return;
                }
                synchronized (this.d) {
                    this.c.add(0, new com.applovin.impl.v6(obj, java.lang.System.currentTimeMillis()));
                    if (this.c.size() > 10) {
                        java.util.List list = this.c;
                        list.remove(list.size() - 1);
                    }
                }
            }
        }
    }

    public void n() {
        java.util.ArrayList arrayList;
        if (!h() && n.compareAndSet(false, true)) {
            java.lang.Object objA = this.f1486a.B().a();
            if (objA != null) {
                e(objA);
                return;
            }
            synchronized (this.d) {
                arrayList = new java.util.ArrayList(this.c);
            }
            this.e.a(arrayList, this.f1486a);
            if (!this.l) {
                m();
                this.l = true;
            }
            com.applovin.impl.sdk.n.g("AppLovinSdk", "Starting Creative Debugger...");
            com.applovin.impl.r.a(this.b, com.applovin.creative.MaxCreativeDebuggerActivity.class);
            return;
        }
        com.applovin.impl.sdk.n.h("AppLovinSdk", "Creative Debugger is already showing");
    }

    public boolean g() {
        return ((java.lang.Boolean) this.f1486a.a(com.applovin.impl.sj.r1)).booleanValue() && this.f1486a.f0().isCreativeDebuggerEnabled();
    }

    class a extends com.applovin.impl.p {
        a() {
        }

        @Override // com.applovin.impl.p, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
            if (activity instanceof com.applovin.creative.MaxCreativeDebuggerActivity) {
                com.applovin.impl.sdk.n.g("AppLovinSdk", "Started Creative Debugger");
                if (!com.applovin.impl.x4.this.h() || com.applovin.impl.x4.m.get() != activity) {
                    com.applovin.creative.MaxCreativeDebuggerActivity maxCreativeDebuggerActivity = (com.applovin.creative.MaxCreativeDebuggerActivity) activity;
                    java.lang.ref.WeakReference unused = com.applovin.impl.x4.m = new java.lang.ref.WeakReference(maxCreativeDebuggerActivity);
                    maxCreativeDebuggerActivity.a(com.applovin.impl.x4.this.e, com.applovin.impl.x4.this.f1486a.e());
                }
                com.applovin.impl.x4.n.set(false);
            }
        }

        @Override // com.applovin.impl.p, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(android.app.Activity activity) {
            if (activity instanceof com.applovin.creative.MaxCreativeDebuggerActivity) {
                com.applovin.impl.sdk.n.g("AppLovinSdk", "Creative Debugger destroyed");
                java.lang.ref.WeakReference unused = com.applovin.impl.x4.m = null;
            }
        }
    }

    private void m() {
        this.f1486a.e().a(new com.applovin.impl.x4.a());
    }

    class b implements com.applovin.impl.r.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.Object f1488a;

        b(java.lang.Object obj) {
            this.f1488a = obj;
        }

        @Override // com.applovin.impl.r.b
        public void a(com.applovin.creative.MaxCreativeDebuggerDisplayedAdActivity maxCreativeDebuggerDisplayedAdActivity) {
            maxCreativeDebuggerDisplayedAdActivity.a(new com.applovin.impl.v6(this.f1488a, com.applovin.impl.x4.this.f1486a.B().b()), com.applovin.impl.x4.this.f1486a);
            com.applovin.impl.x4.n.set(false);
        }
    }

    private boolean c(java.lang.Object obj) {
        com.applovin.mediation.MaxAdFormat format;
        if (obj instanceof com.applovin.impl.sdk.ad.b) {
            format = ((com.applovin.impl.sdk.ad.b) obj).getAdZone().d();
        } else {
            format = obj instanceof com.applovin.impl.fe ? ((com.applovin.impl.fe) obj).getFormat() : null;
        }
        return format != null && format.isFullscreenAd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j() {
        this.i = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (g() && this.f.get() == null && !h()) {
            android.app.Activity activityB = this.f1486a.e().b();
            if (activityB == null) {
                this.f1486a.I();
                if (com.applovin.impl.sdk.n.a()) {
                    this.f1486a.I().b("AppLovinSdk", "Failed to display Creative Debugger button");
                    return;
                }
                return;
            }
            android.view.View viewFindViewById = activityB.findViewById(android.R.id.content);
            if (viewFindViewById instanceof android.widget.FrameLayout) {
                final android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) viewFindViewById;
                final android.view.View viewA = a(frameLayout, activityB);
                frameLayout.addView(viewA);
                android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setDuration(150L);
                viewA.startAnimation(alphaAnimation);
                final android.view.ViewTreeObserver viewTreeObserver = viewFindViewById.getViewTreeObserver();
                final android.view.ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new android.view.ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.applovin.impl.x4$$ExternalSyntheticLambda2
                    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                    public final void onGlobalLayout() {
                        this.f$0.a(viewA, frameLayout);
                    }
                };
                viewTreeObserver.addOnGlobalLayoutListener(onGlobalLayoutListener);
                com.applovin.sdk.AppLovinSdkUtils.runOnUiThreadDelayed(new java.lang.Runnable() { // from class: com.applovin.impl.x4$$ExternalSyntheticLambda3
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.a(viewA, frameLayout, viewTreeObserver, onGlobalLayoutListener);
                    }
                }, java.util.concurrent.TimeUnit.SECONDS.toMillis(5L));
                this.f = new java.lang.ref.WeakReference(viewA);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i() {
        long seconds = java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(android.os.SystemClock.elapsedRealtime() - this.k);
        if (this.k == 0 || seconds < 10) {
            return;
        }
        this.f1486a.D().a(com.applovin.impl.ka.d, "showingMediationDebuggerFromHoldingCreativeDebuggerButton");
        this.f1486a.T0();
    }

    private android.view.View a(final android.widget.FrameLayout frameLayout, android.app.Activity activity) {
        android.view.View view;
        int iDpToPx = com.applovin.sdk.AppLovinSdkUtils.dpToPx(activity, 40);
        int i = iDpToPx / 10;
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(iDpToPx, iDpToPx, 8388629);
        layoutParams.setMargins(i, i, i, i);
        try {
            android.widget.ImageButton imageButton = new android.widget.ImageButton(activity);
            imageButton.setImageDrawable(activity.getResources().getDrawable(com.applovin.sdk.R.drawable.applovin_ic_white_small));
            imageButton.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
            imageButton.setPadding(i, i, i, i * 2);
            view = imageButton;
        } catch (java.lang.Throwable unused) {
            android.widget.Button button = new android.widget.Button(activity);
            button.setText("ⓘ");
            button.setTextColor(-1);
            button.setAllCaps(false);
            button.setTextSize(2, 20.0f);
            button.setPadding(0, 0, 0, 0);
            view = button;
        }
        view.setLayoutParams(layoutParams);
        view.setBackground(f());
        if (this.j) {
            view.setOnTouchListener(new android.view.View.OnTouchListener() { // from class: com.applovin.impl.x4$$ExternalSyntheticLambda5
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(android.view.View view2, android.view.MotionEvent motionEvent) {
                    return this.f$0.a(frameLayout, view2, motionEvent);
                }
            });
        } else {
            view.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.applovin.impl.x4$$ExternalSyntheticLambda6
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    this.f$0.a(view2);
                }
            });
        }
        if (com.applovin.impl.z3.f()) {
            view.setElevation(com.applovin.sdk.AppLovinSdkUtils.dpToPx(activity, 5));
        }
        return view;
    }

    public java.lang.String b(java.lang.Object obj) {
        org.json.JSONObject jSONObjectA;
        if (obj instanceof com.applovin.impl.sdk.ad.b) {
            return ((com.applovin.impl.sdk.ad.b) obj).getOriginalFullResponse().toString();
        }
        if (!(obj instanceof com.applovin.impl.fe)) {
            return null;
        }
        java.lang.String strD = ((com.applovin.impl.fe) obj).D();
        return (!com.applovin.impl.ze.b(obj) || (jSONObjectA = new com.applovin.impl.w(strD, this.f1486a).a()) == null) ? strD : jSONObjectA.toString();
    }

    private void e(java.lang.Object obj) {
        com.applovin.impl.sdk.n.g("AppLovinSdk", "Starting Creative Debugger for current fullscreen ad...");
        com.applovin.impl.r.a(this.b, com.applovin.creative.MaxCreativeDebuggerDisplayedAdActivity.class, this.f1486a.e(), new com.applovin.impl.x4.b(obj));
    }

    @Override // com.applovin.impl.r6.a
    public void b() {
        if (this.i == 0) {
            this.h = com.applovin.impl.go.a(java.util.concurrent.TimeUnit.SECONDS.toMillis(3L), this.f1486a, new java.lang.Runnable() { // from class: com.applovin.impl.x4$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.j();
                }
            });
        }
        int i = this.i;
        if (i % 2 == 0) {
            this.i = i + 1;
        }
    }

    public void a(com.applovin.impl.v6 v6Var, android.content.Context context, boolean z) {
        java.lang.Object objA = v6Var.a();
        java.lang.String strA = a(v6Var);
        com.applovin.impl.pc pcVar = new com.applovin.impl.pc();
        if (z) {
            pcVar.b("Please describe the issue you had with this ad:\n\n\n\n");
        }
        pcVar.b(strA);
        java.lang.String strB = this.f1486a.v().b(objA);
        if (strB != null) {
            pcVar.a("\nBid Response:\n");
            pcVar.a(strB);
        }
        java.lang.String str = "AppLovin Ad Report";
        android.content.Intent intentCreateChooser = android.content.Intent.createChooser(new android.content.Intent("android.intent.action.SEND").setType(androidx.webkit.internal.AssetHelper.DEFAULT_MIME_TYPE).putExtra("android.intent.extra.SUBJECT", objA instanceof com.applovin.impl.sdk.ad.b ? "AppLovin Ad Report" : "MAX Ad Report").putExtra("android.intent.extra.TEXT", pcVar.toString()).setPackage(null), "Share Ad Report");
        if (z) {
            try {
                android.content.Intent intent = new android.content.Intent("android.intent.action.SENDTO", android.net.Uri.parse(androidx.core.net.MailTo.MAILTO_SCHEME));
                if (!(objA instanceof com.applovin.impl.sdk.ad.b)) {
                    str = "MAX Ad Report";
                }
                context.startActivity(intent.putExtra("android.intent.extra.SUBJECT", str).putExtra("android.intent.extra.TEXT", pcVar.toString()).setPackage("com.google.android.gm"));
                return;
            } catch (android.content.ActivityNotFoundException unused) {
                context.startActivity(intentCreateChooser);
                return;
            }
        }
        context.startActivity(intentCreateChooser);
    }

    private void b(android.view.View view, android.widget.FrameLayout frameLayout) {
        if (this.j) {
            view.setOnTouchListener(null);
            this.k = 0L;
        }
        frameLayout.removeView(view);
        this.f = new java.lang.ref.WeakReference(null);
    }

    public java.lang.String a(com.applovin.impl.v6 v6Var) {
        java.lang.Object objA = v6Var.a();
        com.applovin.impl.pc pcVar = new com.applovin.impl.pc();
        pcVar.b("Ad Info:\n");
        if (objA instanceof com.applovin.impl.sdk.ad.b) {
            com.applovin.impl.sdk.ad.b bVar = (com.applovin.impl.sdk.ad.b) objA;
            pcVar.a(com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.MSG_NETWORK, "APPLOVIN").a(bVar).b(bVar);
        } else if (objA instanceof com.applovin.impl.fe) {
            pcVar.a((com.applovin.impl.fe) objA);
        }
        pcVar.a(this.f1486a);
        pcVar.a("Epoch Timestamp (ms)", java.lang.Long.valueOf(v6Var.b()));
        pcVar.a("\nDebug Info:\n").a("Platform", "fireos".equals(this.f1486a.x().w()) ? "Fire OS" : com.json.y8.d).a("AppLovin SDK Version", com.applovin.sdk.AppLovinSdk.VERSION).a("Plugin Version", this.f1486a.a(com.applovin.impl.sj.K3)).a("App Package Name", this.b.getPackageName()).a("Device", java.lang.String.format("%s %s (%s)", android.os.Build.BRAND, android.os.Build.MODEL, android.os.Build.DEVICE)).a("OS Version", android.os.Build.VERSION.RELEASE).a("AppLovin Random Token", this.f1486a.Z()).a("Ad Review Version", com.applovin.impl.v.b()).a(a(objA)).a("User ID", this.f1486a.o0().c() != null ? this.f1486a.o0().c() : "None").a("MD", this.f1486a.a(com.applovin.impl.sj.v));
        return pcVar.toString();
    }

    private android.os.Bundle a(java.lang.Object obj) {
        this.f1486a.I();
        if (com.applovin.impl.sdk.n.a()) {
            this.f1486a.I().a("CreativeDebuggerService", "Retrieving Ad Review info for ad: " + obj);
        }
        java.lang.String strA = com.applovin.impl.yp.a(obj);
        android.os.Bundle bundleA = this.f1486a.i().a(strA);
        this.f1486a.I();
        if (com.applovin.impl.sdk.n.a()) {
            this.f1486a.I().a("CreativeDebuggerService", "Serve id: " + strA);
        }
        this.f1486a.I();
        if (com.applovin.impl.sdk.n.a()) {
            this.f1486a.I().a("CreativeDebuggerService", "Public data: " + bundleA);
        }
        if (bundleA == null) {
            return null;
        }
        for (java.lang.String str : bundleA.keySet()) {
            java.lang.Object obj2 = bundleA.get(str);
            bundleA.remove(str);
            com.applovin.impl.sdk.utils.BundleUtils.put(com.applovin.impl.sdk.utils.StringUtils.toHumanReadableString(str), obj2, bundleA);
        }
        return bundleA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(android.view.View view, android.widget.FrameLayout frameLayout) {
        if (view.getParent() != null || this.f.get() == null) {
            return;
        }
        frameLayout.addView(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(android.view.View view, android.widget.FrameLayout frameLayout, android.view.ViewTreeObserver viewTreeObserver, android.view.ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (this.k > 0 && this.j) {
            view.setVisibility(4);
        } else {
            b(view, frameLayout);
        }
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean a(android.widget.FrameLayout frameLayout, android.view.View view, android.view.MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.k = android.os.SystemClock.elapsedRealtime();
            com.applovin.sdk.AppLovinSdkUtils.runOnUiThreadDelayed(new java.lang.Runnable() { // from class: com.applovin.impl.x4$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.i();
                }
            }, java.util.concurrent.TimeUnit.SECONDS.toMillis(10L));
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (view.getVisibility() == 0) {
                this.k = 0L;
                n();
            } else {
                b(view, frameLayout);
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(android.view.View view) {
        n();
    }

    @Override // com.applovin.impl.r6.a
    public void a() {
        int i = this.i;
        if (i % 2 == 1) {
            this.i = i + 1;
        }
        if (this.i / 2 == 2) {
            com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(new java.lang.Runnable() { // from class: com.applovin.impl.x4$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.e();
                }
            });
            this.i = 0;
            this.h.a();
        }
    }
}
