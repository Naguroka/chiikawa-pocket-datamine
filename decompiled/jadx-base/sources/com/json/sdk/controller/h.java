package com.json.sdk.controller;

/* JADX INFO: loaded from: classes5.dex */
public class h extends android.widget.FrameLayout implements com.json.oo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private android.content.Context f3318a;
    private com.json.sdk.controller.v b;
    private final com.json.Cif c;

    class a implements java.lang.Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            android.view.ViewGroup windowDecorViewGroup = com.json.sdk.controller.h.this.getWindowDecorViewGroup();
            if (windowDecorViewGroup != null) {
                windowDecorViewGroup.addView(com.json.sdk.controller.h.this);
            }
        }
    }

    class b implements java.lang.Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            android.view.ViewGroup windowDecorViewGroup = com.json.sdk.controller.h.this.getWindowDecorViewGroup();
            if (windowDecorViewGroup != null) {
                windowDecorViewGroup.removeView(com.json.sdk.controller.h.this);
            }
        }
    }

    public h(android.content.Context context) {
        super(context);
        this.c = com.json.im.S().f();
        this.f3318a = context;
        setClickable(true);
    }

    private void a() {
        ((android.app.Activity) this.f3318a).runOnUiThread(new com.ironsource.sdk.controller.h.a());
    }

    private void a(int i, int i2) {
        try {
            android.content.Context context = this.f3318a;
            if (context != null) {
                int iF = this.c.F(context);
                if (iF == 1) {
                    setPadding(0, i, 0, i2);
                } else if (iF == 2) {
                    setPadding(0, i, i2, 0);
                }
            }
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
        }
    }

    private void b() {
        ((android.app.Activity) this.f3318a).runOnUiThread(new com.ironsource.sdk.controller.h.b());
    }

    private int getNavigationBarPadding() {
        android.app.Activity activity = (android.app.Activity) this.f3318a;
        try {
            android.graphics.Rect rect = new android.graphics.Rect();
            activity.getWindow().getDecorView().getDrawingRect(rect);
            android.graphics.Rect rect2 = new android.graphics.Rect();
            activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect2);
            if (this.c.F(activity) == 1) {
                int i = rect.bottom - rect2.bottom;
                if (i > 0) {
                    return i;
                }
                return 0;
            }
            int i2 = rect.right - rect2.right;
            if (i2 > 0) {
                return i2;
            }
            return 0;
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            return 0;
        }
    }

    private int getStatusBarHeight() {
        int identifier;
        try {
            android.content.Context context = this.f3318a;
            if (context != null && (identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android")) > 0) {
                return this.f3318a.getResources().getDimensionPixelSize(identifier);
            }
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
        }
        return 0;
    }

    private int getStatusBarPadding() {
        int statusBarHeight;
        if (!((((android.app.Activity) this.f3318a).getWindow().getAttributes().flags & 1024) != 0) && (statusBarHeight = getStatusBarHeight()) > 0) {
            return statusBarHeight;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public android.view.ViewGroup getWindowDecorViewGroup() {
        android.app.Activity activity = (android.app.Activity) this.f3318a;
        if (activity != null) {
            return (android.view.ViewGroup) activity.getWindow().getDecorView();
        }
        return null;
    }

    public void a(com.json.sdk.controller.v vVar) {
        this.b = vVar;
        vVar.a(this);
        this.b.E();
        this.f3318a = this.b.q();
        a(getStatusBarPadding(), getNavigationBarPadding());
        a();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.b.F();
        this.b.a(true, com.ironsource.y8.h.Z);
    }

    @Override // com.json.oo
    public boolean onBackButtonPressed() {
        return com.json.r5.a().a((android.app.Activity) this.f3318a);
    }

    @Override // com.json.oo
    public void onCloseRequested() {
        b();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.b.B();
        this.b.a(false, com.ironsource.y8.h.Z);
        com.json.sdk.controller.v vVar = this.b;
        if (vVar != null) {
            vVar.a(com.ironsource.sdk.controller.v.u.Gone);
            this.b.C();
            this.b.D();
        }
        removeAllViews();
    }

    @Override // com.json.oo
    public void onOrientationChanged(java.lang.String str, int i) {
    }
}
