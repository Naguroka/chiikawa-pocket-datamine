package com.json.sdk.controller;

/* JADX INFO: loaded from: classes5.dex */
public class ControllerActivity extends android.app.Activity implements com.json.oo, com.json.jv {
    private static final java.lang.String n = "ControllerActivity";
    private static final int o = 1;
    private static java.lang.String p = "removeWebViewContainerView | mContainer is null";
    private static java.lang.String q = "removeWebViewContainerView | view is null";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.lang.String f3273a;
    private com.json.sdk.controller.v b;
    private android.widget.RelativeLayout c;
    private android.widget.FrameLayout d;
    private com.json.Cif e;
    private java.lang.String g;
    private com.json.x2 k;
    private boolean l;
    private boolean m;
    public int currentRequestedRotation = -1;
    private boolean f = false;
    private android.os.Handler h = new android.os.Handler();
    private final java.lang.Runnable i = new com.ironsource.sdk.controller.ControllerActivity.a();
    final android.widget.RelativeLayout.LayoutParams j = new android.widget.RelativeLayout.LayoutParams(-1, -1);

    class a implements java.lang.Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.json.sdk.controller.ControllerActivity.this.getWindow().getDecorView().setSystemUiVisibility(com.json.sdk.utils.SDKUtils.getActivityUIFlags(com.json.sdk.controller.ControllerActivity.this.f));
        }
    }

    class b implements android.view.View.OnSystemUiVisibilityChangeListener {
        b() {
        }

        @Override // android.view.View.OnSystemUiVisibilityChangeListener
        public void onSystemUiVisibilityChange(int i) {
            if ((i & androidx.core.view.InputDeviceCompat.SOURCE_TOUCHSCREEN) == 0) {
                com.json.sdk.controller.ControllerActivity.this.h.removeCallbacks(com.json.sdk.controller.ControllerActivity.this.i);
                com.json.sdk.controller.ControllerActivity.this.h.postDelayed(com.json.sdk.controller.ControllerActivity.this.i, 500L);
            }
        }
    }

    class c implements java.lang.Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.json.sdk.controller.ControllerActivity.this.getWindow().addFlags(128);
        }
    }

    class d implements java.lang.Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.json.sdk.controller.ControllerActivity.this.getWindow().clearFlags(128);
        }
    }

    private android.view.View a(android.view.ViewGroup viewGroup) {
        return d() ? viewGroup.findViewById(1) : com.json.wg.a().a(this.f3273a).getPresentingView();
    }

    private android.widget.FrameLayout a(java.lang.String str) {
        return !b(str) ? this.b.s() : com.json.gw.a(getApplicationContext(), com.json.wg.a().a(str).getPresentingView());
    }

    private void a() {
        runOnUiThread(new com.ironsource.sdk.controller.ControllerActivity.d());
    }

    private void a(java.lang.String str, int i) {
        int i2;
        if (str != null) {
            if (com.ironsource.y8.h.C.equalsIgnoreCase(str)) {
                g();
                return;
            }
            if (com.ironsource.y8.h.D.equalsIgnoreCase(str)) {
                h();
                return;
            }
            if (com.ironsource.y8.h.G.equalsIgnoreCase(str)) {
                if (!this.e.C(this)) {
                    return;
                } else {
                    i2 = 1;
                }
            } else if (getRequestedOrientation() != -1) {
                return;
            } else {
                i2 = 4;
            }
            setRequestedOrientation(i2);
        }
    }

    private void b() {
        java.lang.String str = n;
        com.json.sdk.utils.Logger.i(str, "clearWebviewController");
        com.json.sdk.controller.v vVar = this.b;
        if (vVar == null) {
            com.json.sdk.utils.Logger.i(str, "clearWebviewController, null");
            return;
        }
        vVar.a(com.ironsource.sdk.controller.v.u.Gone);
        this.b.C();
        this.b.D();
        this.b.g(this.g, "onDestroy");
    }

    private boolean b(java.lang.String str) {
        return (android.text.TextUtils.isEmpty(str) || str.equals(java.lang.Integer.toString(1))) ? false : true;
    }

    private void c() {
        android.content.Intent intent = getIntent();
        a(intent.getStringExtra(com.ironsource.y8.h.A), intent.getIntExtra(com.ironsource.y8.h.B, 0));
    }

    private boolean d() {
        return this.f3273a == null;
    }

    private void e() {
        runOnUiThread(new com.ironsource.sdk.controller.ControllerActivity.c());
    }

    private void f() {
        android.view.ViewGroup viewGroup;
        try {
            if (this.c == null) {
                throw new java.lang.Exception(p);
            }
            android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) this.d.getParent();
            android.view.View viewA = a(viewGroup2);
            if (viewA == null) {
                throw new java.lang.Exception(q);
            }
            if (isFinishing() && (viewGroup = (android.view.ViewGroup) viewA.getParent()) != null) {
                viewGroup.removeView(viewA);
            }
            viewGroup2.removeView(this.d);
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            com.json.gh.a(com.json.ar.s, new com.json.bh().a(com.json.zb.A, e.getMessage()).a());
            com.json.sdk.utils.Logger.i(n, "removeWebViewContainerView fail " + e.getMessage());
        }
    }

    private void g() {
        java.lang.String str;
        java.lang.String str2;
        int iJ = this.e.J(this);
        java.lang.String str3 = n;
        com.json.sdk.utils.Logger.i(str3, "setInitiateLandscapeOrientation");
        if (iJ != 0) {
            if (iJ == 2) {
                str2 = "ROTATION_180";
            } else if (iJ == 3) {
                str2 = "ROTATION_270 Right Landscape";
            } else {
                if (iJ != 1) {
                    com.json.sdk.utils.Logger.i(str3, "No Rotation");
                    return;
                }
                str = "ROTATION_90 Left Landscape";
            }
            com.json.sdk.utils.Logger.i(str3, str2);
            setRequestedOrientation(8);
            return;
        }
        str = "ROTATION_0";
        com.json.sdk.utils.Logger.i(str3, str);
        setRequestedOrientation(0);
    }

    private void h() {
        java.lang.String str;
        int iJ = this.e.J(this);
        java.lang.String str2 = n;
        com.json.sdk.utils.Logger.i(str2, "setInitiatePortraitOrientation");
        if (iJ == 0) {
            str = "ROTATION_0";
        } else if (iJ == 2) {
            com.json.sdk.utils.Logger.i(str2, "ROTATION_180");
            setRequestedOrientation(9);
            return;
        } else if (iJ == 1) {
            str = "ROTATION_270 Right Landscape";
        } else {
            if (iJ != 3) {
                com.json.sdk.utils.Logger.i(str2, "No Rotation");
                return;
            }
            str = "ROTATION_90 Left Landscape";
        }
        com.json.sdk.utils.Logger.i(str2, str);
        setRequestedOrientation(1);
    }

    @Override // com.json.oo
    public boolean onBackButtonPressed() {
        onBackPressed();
        return true;
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        com.json.sdk.utils.Logger.i(n, "onBackPressed");
        if (com.json.r5.a().a(this)) {
            return;
        }
        super.onBackPressed();
    }

    @Override // com.json.oo
    public void onCloseRequested() {
        finish();
    }

    @Override // android.app.Activity
    protected void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.e = com.json.im.S().f();
        try {
            new com.json.m(this).a();
            new com.json.l(this).a();
            com.json.sdk.controller.v vVar = (com.json.sdk.controller.v) com.json.qj.b((android.content.Context) this).a().j();
            this.b = vVar;
            vVar.s().setId(1);
            this.b.a((com.json.oo) this);
            this.b.a((com.json.jv) this);
            android.content.Intent intent = getIntent();
            this.g = intent.getStringExtra(com.ironsource.y8.h.m);
            this.f = intent.getBooleanExtra(com.ironsource.y8.h.v, false);
            this.f3273a = intent.getStringExtra("adViewId");
            this.l = false;
            this.m = intent.getBooleanExtra(com.ironsource.y8.h.z0, false);
            if (this.f) {
                getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new com.ironsource.sdk.controller.ControllerActivity.b());
                runOnUiThread(this.i);
            }
            android.widget.RelativeLayout relativeLayout = new android.widget.RelativeLayout(this);
            this.c = relativeLayout;
            setContentView(relativeLayout, this.j);
            this.d = a(this.f3273a);
            if (this.c.findViewById(1) == null && this.d.getParent() != null) {
                finish();
            }
            c();
            this.c.addView(this.d, this.j);
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
            finish();
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        java.lang.String str = n;
        com.json.sdk.utils.Logger.i(str, "onDestroy");
        f();
        if (this.l) {
            return;
        }
        com.json.sdk.utils.Logger.i(str, "onDestroy | destroyedFromBackground");
        b();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, android.view.KeyEvent keyEvent) {
        if (i == 4 && this.b.y()) {
            this.b.x();
            return true;
        }
        if (this.f && (i == 25 || i == 24)) {
            this.h.removeCallbacks(this.i);
            this.h.postDelayed(this.i, 500L);
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // com.json.oo
    public void onOrientationChanged(java.lang.String str, int i) {
        a(str, i);
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        com.json.sdk.utils.Logger.i(n, "onPause, isFinishing=" + isFinishing());
        com.json.sdk.controller.t.a(this);
        com.json.sdk.controller.v vVar = this.b;
        if (vVar != null) {
            vVar.a((android.content.Context) this);
            if (!this.m) {
                this.b.B();
            }
            this.b.a(false, com.ironsource.y8.h.Z);
            this.b.g(this.g, com.ironsource.y8.h.t0);
        }
        if (isFinishing()) {
            this.l = true;
            b();
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        com.json.sdk.utils.Logger.i(n, com.ironsource.y8.h.u0);
        com.json.sdk.controller.v vVar = this.b;
        if (vVar != null) {
            vVar.b(this);
            if (!this.m) {
                this.b.F();
            }
            this.b.a(true, com.ironsource.y8.h.Z);
            this.b.g(this.g, com.ironsource.y8.h.u0);
        }
        com.json.sdk.controller.t.b(this);
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        com.json.sdk.utils.Logger.i(n, "onStart");
        com.json.sdk.controller.v vVar = this.b;
        if (vVar != null) {
            vVar.g(this.g, "onStart");
        }
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        com.json.sdk.utils.Logger.i(n, "onStop");
        com.json.sdk.controller.v vVar = this.b;
        if (vVar != null) {
            vVar.g(this.g, "onStop");
        }
    }

    @Override // android.app.Activity
    protected void onUserLeaveHint() {
        super.onUserLeaveHint();
        com.json.sdk.utils.Logger.i(n, "onUserLeaveHint");
        com.json.sdk.controller.v vVar = this.b;
        if (vVar != null) {
            vVar.g(this.g, "onUserLeaveHint");
        }
    }

    @Override // com.json.jv
    public void onVideoEnded() {
        toggleKeepScreen(false);
    }

    @Override // com.json.jv
    public void onVideoPaused() {
        toggleKeepScreen(false);
    }

    @Override // com.json.jv
    public void onVideoResumed() {
        toggleKeepScreen(true);
    }

    @Override // com.json.jv
    public void onVideoStarted() {
        toggleKeepScreen(true);
    }

    @Override // com.json.jv
    public void onVideoStopped() {
        toggleKeepScreen(false);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (this.f && z) {
            runOnUiThread(this.i);
        }
    }

    @Override // android.app.Activity
    public void setRequestedOrientation(int i) {
        if (this.currentRequestedRotation != i) {
            com.json.sdk.utils.Logger.i(n, "Rotation: Req = " + i + " Curr = " + this.currentRequestedRotation);
            this.currentRequestedRotation = i;
            super.setRequestedOrientation(i);
        }
    }

    public void toggleKeepScreen(boolean z) {
        if (z) {
            e();
        } else {
            a();
        }
    }
}
