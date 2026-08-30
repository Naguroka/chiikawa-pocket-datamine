package com.onevcat.uniwebview;

/* JADX INFO: loaded from: classes5.dex */
public final class N implements com.onevcat.uniwebview.V1, com.onevcat.uniwebview.Y, com.onevcat.uniwebview.S {
    public static android.widget.FrameLayout s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.app.Activity f3677a;
    public final java.lang.String b;
    public final com.onevcat.uniwebview.c2 c;
    public boolean d;
    public final com.onevcat.uniwebview.X e;
    public com.onevcat.uniwebview.M f;
    public java.lang.String g;
    public boolean h;
    public boolean i;
    public android.view.animation.AnimationSet j;
    public boolean k;
    public boolean l;
    public java.io.ByteArrayOutputStream m;
    public android.graphics.Bitmap n;
    public com.onevcat.uniwebview.C1530b o;
    public final com.onevcat.uniwebview.C1593w p;
    public final com.onevcat.uniwebview.Q q;
    public final android.widget.LinearLayout r;

    public N(android.app.Activity activity, java.lang.String name, com.onevcat.uniwebview.C1542f messageSender, com.onevcat.uniwebview.V1 v1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messageSender, "messageSender");
        this.f3677a = activity;
        this.b = name;
        this.c = messageSender;
        this.d = true;
        com.onevcat.uniwebview.X x = new com.onevcat.uniwebview.X(activity, this);
        this.e = x;
        this.k = true;
        if (s == null) {
            android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(activity);
            frameLayout.setVisibility(4);
            frameLayout.setBackgroundColor(androidx.core.view.ViewCompat.MEASURED_STATE_MASK);
            activity.addContentView(frameLayout, new android.widget.FrameLayout.LayoutParams(-1, -1));
            s = frameLayout;
        }
        x.setX(0.0f);
        x.setY(0.0f);
        x.setVisibility(4);
        x.setId(android.view.View.generateViewId());
        android.widget.FrameLayout frameLayout2 = s;
        kotlin.jvm.internal.Intrinsics.checkNotNull(frameLayout2);
        com.onevcat.uniwebview.C1593w c1593w = new com.onevcat.uniwebview.C1593w(activity, x, frameLayout2, name, messageSender, v1 == null ? this : v1);
        c1593w.setOnTouchListener(new android.view.View.OnTouchListener() { // from class: com.onevcat.uniwebview.N$$ExternalSyntheticLambda0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                return com.onevcat.uniwebview.N.a(this.f$0, view, motionEvent);
            }
        });
        this.p = c1593w;
        com.onevcat.uniwebview.Q q = new com.onevcat.uniwebview.Q(activity);
        q.setDelegate(this);
        q.setLayoutParams(new android.widget.Toolbar.LayoutParams(-1, -2));
        q.setVisibility(8);
        this.q = q;
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(activity);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -1));
        linearLayout.setBackgroundColor(0);
        this.r = linearLayout;
    }

    public final boolean a(int i, int i2, int i3, int i4, float f, float f2, java.lang.String identifier) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(identifier, "identifier");
        if (this.j != null) {
            com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
            c1560l.getClass();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("Trying to animate web view but an other transition animation is not finished yet. Ignore this one.", com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE);
            c1560l.a(com.onevcat.uniwebview.EnumC1557k.CRITICAL, "Trying to animate web view but an other transition animation is not finished yet. Ignore this one.");
            return false;
        }
        float f3 = 1000;
        long j = (long) (f * f3);
        long j2 = (long) (f3 * f2);
        android.view.animation.AnimationSet animationSet = new android.view.animation.AnimationSet(false);
        android.view.animation.TranslateAnimation translateAnimation = new android.view.animation.TranslateAnimation(0.0f, i - this.e.getX(), 0.0f, i2 - this.e.getY());
        translateAnimation.setFillAfter(true);
        translateAnimation.setDuration(j);
        translateAnimation.setStartOffset(j2);
        animationSet.addAnimation(translateAnimation);
        com.onevcat.uniwebview.X x = this.e;
        com.onevcat.uniwebview.C1566n c1566n = new com.onevcat.uniwebview.C1566n(x, x.getWidth(), i3, this.e.getHeight(), i4);
        c1566n.setFillAfter(true);
        c1566n.setDuration(j);
        c1566n.setStartOffset(j2);
        animationSet.addAnimation(c1566n);
        animationSet.setAnimationListener(new com.onevcat.uniwebview.K(this, i, i2, i3, i4, identifier));
        this.e.startAnimation(animationSet);
        return true;
    }

    public final void b() {
        java.lang.Object systemService = this.f3677a.getSystemService("input_method");
        android.view.inputmethod.InputMethodManager inputMethodManager = systemService instanceof android.view.inputmethod.InputMethodManager ? (android.view.inputmethod.InputMethodManager) systemService : null;
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(this.p.getWindowToken(), 0);
        }
    }

    public final float c() {
        return this.e.getAlpha();
    }

    public final void b(boolean z) {
        this.q.setVisibility(z ? 0 : 8);
    }

    public final void c(boolean z) {
        if (this.f == null) {
            this.f = new com.onevcat.uniwebview.M(this.f3677a);
        }
        com.onevcat.uniwebview.M m = this.f;
        if (m != null) {
            m.setCanceledOnTouchOutside(this.d);
        }
        if ((z || this.h) && this.e.getVisibility() == 0) {
            com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
            c1560l.getClass();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("Show progress dialog.", com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE);
            c1560l.a(com.onevcat.uniwebview.EnumC1557k.VERBOSE, "Show progress dialog.");
            com.onevcat.uniwebview.M m2 = this.f;
            if (m2 != null) {
                java.lang.String string = this.g;
                if (string == null) {
                    string = this.f3677a.getResources().getString(com.onevcat.uniwebview.R.string.LOADING);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "activity.resources.getString(R.string.LOADING)");
                }
                m2.setMessage(string);
            }
            com.onevcat.uniwebview.M m3 = this.f;
            if (m3 != null) {
                m3.show();
            }
        }
    }

    public final android.graphics.Bitmap a(android.graphics.Rect rect) {
        if (rect == null) {
            rect = new android.graphics.Rect(0, 0, this.e.getWidth(), this.e.getHeight());
        }
        android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(rect.width(), rect.height(), android.graphics.Bitmap.Config.ARGB_8888);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(r.width(), … Bitmap.Config.ARGB_8888)");
        android.graphics.Canvas canvas = new android.graphics.Canvas(bitmapCreateBitmap);
        canvas.translate(-rect.left, -rect.top);
        this.e.draw(canvas);
        return bitmapCreateBitmap;
    }

    public final void a(boolean z) {
        com.onevcat.uniwebview.M m;
        if ((z || this.h) && (m = this.f) != null && m.isShowing()) {
            com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
            c1560l.getClass();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("Hide progress dialog.", com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE);
            c1560l.a(com.onevcat.uniwebview.EnumC1557k.VERBOSE, "Hide progress dialog.");
            com.onevcat.uniwebview.M m2 = this.f;
            if (m2 != null) {
                m2.dismiss();
            }
        }
    }

    @Override // com.onevcat.uniwebview.V1
    public final void a(java.lang.String str, int i) {
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        java.lang.String message = "onPageFinished. URL: " + str + ", status code: " + i;
        c1560l.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        c1560l.a(com.onevcat.uniwebview.EnumC1557k.INFO, message);
        com.onevcat.uniwebview.Q q = this.q;
        com.onevcat.uniwebview.C1593w c1593w = this.p;
        boolean z = true;
        boolean z2 = c1593w.d.i != null || c1593w.canGoBack();
        com.onevcat.uniwebview.C1593w c1593w2 = this.p;
        com.onevcat.uniwebview.C1593w c1593w3 = c1593w2.d.i;
        if ((c1593w3 == null || !c1593w3.canGoForward()) && !c1593w2.canGoForward()) {
            z = false;
        }
        q.a(z2, z);
        this.i = false;
        a(false);
        java.lang.String strValueOf = java.lang.String.valueOf(i);
        if (str == null) {
            str = "";
        }
        this.c.a(this.p.getName(), com.onevcat.uniwebview.d2.PageFinished, new com.onevcat.uniwebview.Y1("", strValueOf, str, null));
    }

    @Override // com.onevcat.uniwebview.V1
    public final void a(java.lang.String str) {
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        c1560l.a(com.onevcat.uniwebview.EnumC1557k.INFO, com.onevcat.uniwebview.AbstractC1575q.a("onPageStarted: ", str, c1560l, com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE));
        com.onevcat.uniwebview.Q q = this.q;
        com.onevcat.uniwebview.C1593w c1593w = this.p;
        boolean z = c1593w.d.i != null || c1593w.canGoBack();
        com.onevcat.uniwebview.C1593w c1593w2 = this.p;
        com.onevcat.uniwebview.C1593w c1593w3 = c1593w2.d.i;
        q.a(z, (c1593w3 != null && c1593w3.canGoForward()) || c1593w2.canGoForward());
        this.i = true;
        c(false);
        com.onevcat.uniwebview.c2 c2Var = this.c;
        java.lang.String name = this.p.getName();
        com.onevcat.uniwebview.d2 d2Var = com.onevcat.uniwebview.d2.PageStarted;
        if (str == null) {
            str = "";
        }
        c2Var.a(name, d2Var, str);
    }

    @Override // com.onevcat.uniwebview.V1
    public final void a(com.onevcat.uniwebview.Y1 payload) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payload, "payload");
        org.json.JSONObject jSONObject = payload.d;
        java.lang.String string = jSONObject != null ? jSONObject.getString("failingURL") : null;
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        java.lang.String message = "onReceivedError. URL: " + string + ", error code: " + payload.b + ", description: " + payload.c;
        c1560l.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        c1560l.a(com.onevcat.uniwebview.EnumC1557k.CRITICAL, message);
        com.onevcat.uniwebview.Q q = this.q;
        com.onevcat.uniwebview.C1593w c1593w = this.p;
        boolean z = true;
        boolean z2 = c1593w.d.i != null || c1593w.canGoBack();
        com.onevcat.uniwebview.C1593w c1593w2 = this.p;
        com.onevcat.uniwebview.C1593w c1593w3 = c1593w2.d.i;
        if ((c1593w3 == null || !c1593w3.canGoForward()) && !c1593w2.canGoForward()) {
            z = false;
        }
        q.a(z2, z);
        this.i = false;
        a(false);
        this.c.a(this.p.getName(), com.onevcat.uniwebview.d2.PageErrorReceived, payload);
    }

    @Override // com.onevcat.uniwebview.V1
    public final void a() {
        this.i = false;
        a(false);
        this.c.a(this.p.getName(), com.onevcat.uniwebview.d2.WebContentProcessDidTerminate, "");
    }

    public final void a(float f) {
        this.e.setAlpha(kotlin.ranges.RangesKt.coerceIn(f, 0.0f, 1.0f));
    }

    public final void a(int i, int i2, int i3, int i4) {
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        java.lang.String message = "Setting web container frame to {(" + i + ", " + i2 + "), (" + i3 + ", " + i4 + ")}";
        c1560l.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        c1560l.a(com.onevcat.uniwebview.EnumC1557k.VERBOSE, message);
        a(i, i2);
        int iMax = java.lang.Math.max(0, i3);
        int iMax2 = java.lang.Math.max(0, i4);
        android.view.ViewGroup.LayoutParams layoutParams = this.e.getLayoutParams();
        if (layoutParams == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) layoutParams;
        layoutParams2.width = iMax;
        layoutParams2.height = iMax2;
        layoutParams2.gravity = 51;
        this.e.setLayoutParams(layoutParams2);
        com.onevcat.uniwebview.C1530b c1530b = this.o;
        if (c1530b != null) {
            c1530b.g = iMax2;
        }
    }

    public final void a(int i, int i2) {
        this.e.setX(i);
        this.e.setY(i2);
    }

    public final boolean a(final boolean z, boolean z2, int i, float f, final java.lang.String identifier) {
        int i2;
        android.view.animation.AlphaAnimation alphaAnimation;
        int i3;
        android.view.animation.TranslateAnimation translateAnimation;
        int i4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(identifier, "identifier");
        int i5 = 0;
        if (this.p.get_webChromeClient$uniwebview_release().f) {
            android.widget.FrameLayout frameLayout = s;
            if (frameLayout != null) {
                frameLayout.setVisibility(z ? 0 : 4);
            }
            return true;
        }
        boolean z3 = this.e.getVisibility() == 0;
        if (z3 && z) {
            com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
            c1560l.getClass();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("Showing web view is ignored since it is already visible.", com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE);
            c1560l.a(com.onevcat.uniwebview.EnumC1557k.CRITICAL, "Showing web view is ignored since it is already visible.");
            return false;
        }
        if (!z3 && !z) {
            com.onevcat.uniwebview.C1560l c1560l2 = com.onevcat.uniwebview.C1560l.b;
            c1560l2.getClass();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("Hiding web view is ignored since it is already invisible.", com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE);
            c1560l2.a(com.onevcat.uniwebview.EnumC1557k.CRITICAL, "Hiding web view is ignored since it is already invisible.");
            return false;
        }
        if (this.j != null) {
            com.onevcat.uniwebview.C1560l c1560l3 = com.onevcat.uniwebview.C1560l.b;
            c1560l3.getClass();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("Trying to show or hide web view but an other transition animation is not finished yet. Ignore this one.", com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE);
            c1560l3.a(com.onevcat.uniwebview.EnumC1557k.CRITICAL, "Trying to show or hide web view but an other transition animation is not finished yet. Ignore this one.");
            return false;
        }
        if (z) {
            this.e.setVisibility(0);
            if (this.i) {
                c(false);
            }
        } else {
            b();
            a(false);
        }
        this.e.requestLayout();
        int[] iArrB = com.onevcat.uniwebview.AbstractC1533c.b(5);
        int length = iArrB.length;
        int i6 = 0;
        while (true) {
            if (i6 >= length) {
                i2 = 0;
                break;
            }
            i2 = iArrB[i6];
            if (com.onevcat.uniwebview.AbstractC1533c.a(i2) == i) {
                break;
            }
            i6++;
        }
        if (i2 == 0) {
            i2 = 1;
        }
        if ((z2 || i2 != 1) && f > 0.0f) {
            android.view.animation.AnimationSet animationSet = new android.view.animation.AnimationSet(false);
            long j = (long) (f * 1000);
            if (z2) {
                android.view.animation.AlphaAnimation alphaAnimation2 = new android.view.animation.AlphaAnimation(z ? 0.0f : this.e.getAlpha(), z ? this.e.getAlpha() : 0.0f);
                alphaAnimation2.setFillAfter(true);
                alphaAnimation2.setDuration(j);
                alphaAnimation = alphaAnimation2;
            } else {
                alphaAnimation = null;
            }
            if (alphaAnimation != null) {
                animationSet.addAnimation(alphaAnimation);
            }
            android.view.Display defaultDisplay = this.f3677a.getWindow().getWindowManager().getDefaultDisplay();
            android.graphics.Point point = new android.graphics.Point();
            defaultDisplay.getRealSize(point);
            int iA = com.onevcat.uniwebview.AbstractC1533c.a(i2);
            if (iA != 0) {
                if (iA == 1) {
                    i4 = -point.y;
                } else if (iA == 2) {
                    i3 = -point.x;
                } else if (iA == 3) {
                    i4 = point.y;
                } else {
                    if (iA != 4) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    i3 = point.x;
                }
                i5 = i4;
                i3 = 0;
            } else {
                i3 = 0;
            }
            if (z) {
                translateAnimation = new android.view.animation.TranslateAnimation(i3, 0.0f, i5, 0.0f);
            } else {
                if (z) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                translateAnimation = new android.view.animation.TranslateAnimation(0.0f, i3, 0.0f, i5);
            }
            translateAnimation.setFillAfter(true);
            translateAnimation.setDuration(j);
            animationSet.addAnimation(translateAnimation);
            this.j = animationSet;
            animationSet.setAnimationListener(new com.onevcat.uniwebview.L(this, z, identifier));
            this.e.startAnimation(animationSet);
        } else {
            new android.os.Handler().postDelayed(new java.lang.Runnable() { // from class: com.onevcat.uniwebview.N$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    com.onevcat.uniwebview.N.a(this.f$0, z, identifier);
                }
            }, 1L);
        }
        return true;
    }

    public static final void a(com.onevcat.uniwebview.N this$0, boolean z, java.lang.String identifier) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(identifier, "$identifier");
        if (z) {
            this$0.c.a(this$0.p.getName(), com.onevcat.uniwebview.d2.ShowTransitionFinished, identifier);
        } else {
            this$0.e.setVisibility(4);
            this$0.c.a(this$0.p.getName(), com.onevcat.uniwebview.d2.HideTransitionFinished, identifier);
        }
    }

    public static final boolean a(com.onevcat.uniwebview.N this$0, android.view.View view, android.view.MotionEvent motionEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        return !this$0.k;
    }
}
