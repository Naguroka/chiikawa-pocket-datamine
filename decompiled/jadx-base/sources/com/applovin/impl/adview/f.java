package com.applovin.impl.adview;

/* JADX INFO: loaded from: classes3.dex */
class f extends android.app.Dialog implements com.applovin.impl.s6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.app.Activity f611a;
    private final com.applovin.impl.sdk.j b;
    private final com.applovin.impl.sdk.n c;
    private final com.applovin.impl.adview.b d;
    private final com.applovin.impl.sdk.ad.a f;
    private android.widget.RelativeLayout g;
    private com.applovin.impl.adview.e h;

    class a implements android.view.animation.Animation.AnimationListener {
        a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(android.view.animation.Animation animation) {
            com.applovin.impl.adview.f.this.h.setClickable(true);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(android.view.animation.Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(android.view.animation.Animation animation) {
        }
    }

    f(com.applovin.impl.sdk.ad.a aVar, com.applovin.impl.adview.b bVar, android.app.Activity activity, com.applovin.impl.sdk.j jVar) {
        super(activity, android.R.style.Theme.Translucent.NoTitleBar);
        if (aVar == null) {
            throw new java.lang.IllegalArgumentException("No ad specified");
        }
        if (bVar == null) {
            throw new java.lang.IllegalArgumentException("No main view specified");
        }
        if (jVar == null) {
            throw new java.lang.IllegalArgumentException("No sdk specified");
        }
        if (activity == null) {
            throw new java.lang.IllegalArgumentException("No activity specified");
        }
        this.b = jVar;
        this.c = jVar.I();
        this.f611a = activity;
        this.d = bVar;
        this.f = aVar;
        requestWindowFeature(1);
        setCancelable(false);
    }

    private void d() {
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        this.d.setLayoutParams(layoutParams);
        android.widget.RelativeLayout relativeLayout = new android.widget.RelativeLayout(this.f611a);
        this.g = relativeLayout;
        relativeLayout.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, -1));
        this.g.setBackgroundColor(-1157627904);
        this.g.addView(this.d);
        if (!this.f.r1()) {
            a(this.f.k1());
            g();
        }
        setContentView(this.g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        this.g.removeView(this.d);
        super.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f() {
        try {
            if (this.h == null) {
                a();
            }
            this.h.setVisibility(0);
            this.h.bringToFront();
            android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(300L);
            alphaAnimation.setAnimationListener(new com.applovin.impl.adview.f.a());
            this.h.startAnimation(alphaAnimation);
        } catch (java.lang.Throwable th) {
            if (com.applovin.impl.sdk.n.a()) {
                this.c.a("ExpandedAdDialog", "Unable to fade in close button", th);
            }
            a();
        }
    }

    private void g() {
        this.f611a.runOnUiThread(new java.lang.Runnable() { // from class: com.applovin.impl.adview.f$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.f();
            }
        });
    }

    public com.applovin.impl.adview.b c() {
        return this.d;
    }

    @Override // android.app.Dialog, android.content.DialogInterface, com.applovin.impl.s6
    public void dismiss() {
        this.f611a.runOnUiThread(new java.lang.Runnable() { // from class: com.applovin.impl.adview.f$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.e();
            }
        });
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        this.d.a("javascript:al_onBackPressed();");
        dismiss();
    }

    @Override // android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        d();
    }

    @Override // android.app.Dialog
    protected void onStart() {
        super.onStart();
        try {
            android.view.Window window = getWindow();
            if (window != null) {
                window.setFlags(this.f611a.getWindow().getAttributes().flags, this.f611a.getWindow().getAttributes().flags);
                window.addFlags(16777216);
            } else if (com.applovin.impl.sdk.n.a()) {
                this.c.b("ExpandedAdDialog", "Unable to turn on hardware acceleration - window is null");
            }
        } catch (java.lang.Throwable th) {
            if (com.applovin.impl.sdk.n.a()) {
                this.c.a("ExpandedAdDialog", "Setting window flags failed.", th);
            }
        }
    }

    private void a() {
        this.d.a("javascript:al_onCloseTapped();");
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(android.view.View view) {
        if (this.h.isClickable()) {
            this.h.performClick();
        }
    }

    private void a(com.applovin.impl.adview.e.a aVar) {
        if (this.h != null) {
            if (com.applovin.impl.sdk.n.a()) {
                this.c.k("ExpandedAdDialog", "Attempting to create duplicate close button");
                return;
            }
            return;
        }
        com.applovin.impl.adview.e eVarA = com.applovin.impl.adview.e.a(aVar, this.f611a);
        this.h = eVarA;
        eVarA.setVisibility(8);
        this.h.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.applovin.impl.adview.f$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                this.f$0.a(view);
            }
        });
        this.h.setClickable(false);
        int iA = a(((java.lang.Integer) this.b.a(com.applovin.impl.sj.H1)).intValue());
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(iA, iA);
        layoutParams.addRule(10);
        com.applovin.impl.sdk.j jVar = this.b;
        com.applovin.impl.sj sjVar = com.applovin.impl.sj.K1;
        layoutParams.addRule(((java.lang.Boolean) jVar.a(sjVar)).booleanValue() ? 9 : 11);
        this.h.a(iA);
        int iA2 = a(((java.lang.Integer) this.b.a(com.applovin.impl.sj.J1)).intValue());
        int iA3 = a(((java.lang.Integer) this.b.a(com.applovin.impl.sj.I1)).intValue());
        layoutParams.setMargins(iA3, iA2, iA3, 0);
        this.g.addView(this.h, layoutParams);
        this.h.bringToFront();
        int iA4 = a(((java.lang.Integer) this.b.a(com.applovin.impl.sj.L1)).intValue());
        android.view.View view = new android.view.View(this.f611a);
        view.setBackgroundColor(0);
        int i = iA + iA4;
        android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(i, i);
        layoutParams2.addRule(10);
        layoutParams2.addRule(((java.lang.Boolean) this.b.a(sjVar)).booleanValue() ? 9 : 11);
        layoutParams2.setMargins(iA3 - a(5), iA2 - a(5), iA3 - a(5), 0);
        view.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.applovin.impl.adview.f$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                this.f$0.b(view2);
            }
        });
        this.g.addView(view, layoutParams2);
        view.bringToFront();
    }

    public com.applovin.impl.sdk.ad.a b() {
        return this.f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(android.view.View view) {
        a();
    }

    private int a(int i) {
        return com.applovin.sdk.AppLovinSdkUtils.dpToPx(this.f611a, i);
    }
}
