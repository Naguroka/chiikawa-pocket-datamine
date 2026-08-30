package com.amoad;

/* JADX INFO: loaded from: classes3.dex */
final class ai {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    java.lang.ref.WeakReference<android.app.Activity> f201a;
    android.content.Context b;
    java.lang.String c;
    com.amoad.AMoAdView d;
    android.app.Dialog e;
    boolean f;
    boolean g;
    boolean h;
    boolean i;
    android.os.Handler j;
    int k;
    int l;
    int m;
    int n;
    int o;
    int p;
    float q;
    com.amoad.InterstitialAd.OnCloseListener r;
    com.amoad.AdLoadListener s;
    int t;
    com.amoad.a u;
    private com.amoad.AdCallback2 v = new com.amoad.AdCallback2() { // from class: com.amoad.ai.1
        @Override // com.amoad.AdCallback2
        public final void didClick() {
            com.amoad.ai aiVar = com.amoad.ai.this;
            com.amoad.InterstitialAd.OnCloseListener onCloseListener = aiVar.r;
            if (onCloseListener != null) {
                onCloseListener.onClose(com.amoad.InterstitialAd.Result.Click);
            }
            aiVar.b();
            aiVar.a();
        }

        @Override // com.amoad.AdCallback2
        public final void didDismissScreen() {
        }

        @Override // com.amoad.AdCallback
        public final void didFailToReceiveAdWithError() {
            com.amoad.ai.this.f = false;
            com.amoad.ai aiVar = com.amoad.ai.this;
            com.amoad.AdLoadListener adLoadListener = aiVar.s;
            if (adLoadListener != null) {
                adLoadListener.onLoaded(aiVar.c, com.amoad.AdResult.Failure, new com.amoad.AMoAdError(9001, "ネットワークエラー"));
            }
            aiVar.b();
            com.amoad.ai aiVar2 = com.amoad.ai.this;
            com.amoad.InterstitialAd.OnCloseListener onCloseListener = aiVar2.r;
            if (onCloseListener != null) {
                onCloseListener.onClose(com.amoad.InterstitialAd.Result.Failure);
            }
            aiVar2.b();
        }

        @Override // com.amoad.AdCallback2
        public final void didLeaveApplication() {
        }

        @Override // com.amoad.AdCallback2
        public final void didPresentScreen() {
        }

        @Override // com.amoad.AdCallback
        public final void didReceiveAd() {
            com.amoad.ai.this.f = false;
            com.amoad.ai.this.g = true;
            com.amoad.ai aiVar = com.amoad.ai.this;
            com.amoad.AdLoadListener adLoadListener = aiVar.s;
            if (adLoadListener != null) {
                adLoadListener.onLoaded(aiVar.c, com.amoad.AdResult.Success, null);
            }
        }

        @Override // com.amoad.AdCallback
        public final void didReceiveEmptyAd() {
            com.amoad.ai.this.f = false;
            com.amoad.ai aiVar = com.amoad.ai.this;
            com.amoad.AdLoadListener adLoadListener = aiVar.s;
            if (adLoadListener != null) {
                adLoadListener.onLoaded(aiVar.c, com.amoad.AdResult.Empty, new com.amoad.AMoAdError(1002, "配信する広告がありません"));
            }
            aiVar.b();
        }
    };

    ai(java.lang.String str) {
        com.amoad.l.a(str);
        this.c = str;
        this.h = true;
    }

    private int a(float f) {
        return (int) ((f * this.q) + 0.5f);
    }

    static int a(android.content.Context context, java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return 0;
        }
        int iIndexOf = str.indexOf(".");
        if (iIndexOf >= 0) {
            str = str.substring(0, iIndexOf);
        }
        return context.getResources().getIdentifier(str, "drawable", context.getPackageName());
    }

    private android.view.View a(android.app.Activity activity, android.view.View view) {
        boolean zA = com.amoad.l.a(activity);
        android.content.res.Resources resources = activity.getResources();
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(activity);
        frameLayout.setBackgroundColor(android.graphics.Color.parseColor("#A3000000"));
        android.widget.FrameLayout frameLayout2 = new android.widget.FrameLayout(activity);
        frameLayout2.setBackgroundResource(zA ? this.l : this.k);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(a(zA ? 380.0f : 310.0f), a(zA ? 310.0f : 380.0f));
        layoutParams.gravity = 17;
        frameLayout.addView(frameLayout2, layoutParams);
        android.widget.FrameLayout frameLayout3 = new android.widget.FrameLayout(activity);
        android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(a(300.0f), a(250.0f));
        layoutParams2.topMargin = a(zA ? 3.3f : 50.0f);
        layoutParams2.gravity = 49;
        frameLayout2.addView(frameLayout3, layoutParams2);
        android.widget.FrameLayout.LayoutParams layoutParams3 = new android.widget.FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 17;
        frameLayout3.addView(view, layoutParams3);
        android.widget.FrameLayout frameLayout4 = new android.widget.FrameLayout(activity);
        android.widget.FrameLayout.LayoutParams layoutParams4 = new android.widget.FrameLayout.LayoutParams(a(zA ? 420.0f : 320.0f), a(zA ? 320.0f : 420.0f));
        layoutParams4.gravity = 17;
        frameLayout.addView(frameLayout4, layoutParams4);
        android.widget.Button button = new android.widget.Button(activity);
        android.graphics.drawable.StateListDrawable stateListDrawable = new android.graphics.drawable.StateListDrawable();
        stateListDrawable.addState(new int[]{-16842919}, resources.getDrawable(this.m));
        stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, resources.getDrawable(this.n));
        button.setBackgroundDrawable(stateListDrawable);
        button.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.amoad.ai.6
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                com.amoad.ai aiVar = com.amoad.ai.this;
                com.amoad.InterstitialAd.OnCloseListener onCloseListener = aiVar.r;
                if (onCloseListener != null) {
                    onCloseListener.onClose(com.amoad.InterstitialAd.Result.Close);
                }
                aiVar.b();
                aiVar.a();
            }
        });
        android.widget.FrameLayout.LayoutParams layoutParams5 = new android.widget.FrameLayout.LayoutParams(a(40.0f), a(40.0f));
        layoutParams5.gravity = 53;
        frameLayout4.addView(button, layoutParams5);
        android.widget.Button button2 = new android.widget.Button(activity);
        android.graphics.drawable.StateListDrawable stateListDrawable2 = new android.graphics.drawable.StateListDrawable();
        stateListDrawable2.addState(new int[]{-16842919}, resources.getDrawable(this.o));
        stateListDrawable2.addState(new int[]{android.R.attr.state_pressed}, resources.getDrawable(this.p));
        button2.setBackgroundDrawable(stateListDrawable2);
        button2.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.amoad.ai.7
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                if (com.amoad.ai.this.d != null) {
                    com.amoad.ai.this.d.setClickPoint(com.amoad.ai.this.u);
                    com.amoad.ai.this.d.a(com.amoad.ai.this.d.getLinkUrl());
                }
            }
        });
        button2.setOnTouchListener(new android.view.View.OnTouchListener() { // from class: com.amoad.ai.8
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(android.view.View view2, android.view.MotionEvent motionEvent) {
                if (motionEvent.getAction() != 1) {
                    return false;
                }
                com.amoad.ai.this.u = new com.amoad.a(motionEvent.getX(), motionEvent.getY());
                return false;
            }
        });
        android.widget.FrameLayout.LayoutParams layoutParams6 = new android.widget.FrameLayout.LayoutParams(a(280.0f), a(50.0f));
        layoutParams6.gravity = 81;
        layoutParams6.bottomMargin = a(zA ? 3.3f : 15.0f);
        frameLayout2.addView(button2, layoutParams6);
        return frameLayout;
    }

    private void d() {
        this.i = false;
        this.d = null;
        this.e = null;
        this.r = null;
        this.s = null;
        this.f = false;
        this.g = false;
    }

    final void a() {
        if (this.h) {
            a((com.amoad.AdLoadListener) null);
        }
    }

    final void a(int i, int i2) {
        this.o = i;
        this.p = i2;
    }

    final void a(com.amoad.AMoAdView aMoAdView) {
        android.app.Activity activity = this.f201a.get();
        if (activity == null || activity.isFinishing()) {
            d();
            return;
        }
        aMoAdView.setContext(activity);
        android.app.Dialog dialog = new android.app.Dialog(activity, android.R.style.Theme.Black.NoTitleBar.Fullscreen);
        this.e = dialog;
        dialog.getWindow().setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(0));
        this.e.setOwnerActivity(activity);
        this.e.setCanceledOnTouchOutside(false);
        this.e.setCancelable(false);
        this.e.setOnKeyListener(new android.content.DialogInterface.OnKeyListener() { // from class: com.amoad.ai.4
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(android.content.DialogInterface dialogInterface, int i, android.view.KeyEvent keyEvent) {
                return i == 4 || i == 84;
            }
        });
        this.e.setContentView(a(activity, aMoAdView));
        this.j.postDelayed(new java.lang.Runnable() { // from class: com.amoad.ai.5
            @Override // java.lang.Runnable
            public final void run() {
                if (com.amoad.ai.this.e != null) {
                    com.amoad.ai.this.i = true;
                    com.amoad.ai.this.e.show();
                }
            }
        }, 300L);
    }

    final void a(com.amoad.AdLoadListener adLoadListener) {
        this.s = adLoadListener;
        com.amoad.AMoAdView aMoAdView = null;
        if (c()) {
            if (adLoadListener != null) {
                adLoadListener.onLoaded(this.c, com.amoad.AdResult.Success, null);
            }
        } else {
            if (this.f) {
                return;
            }
            this.f = true;
            if (this.b == null) {
                d();
            } else {
                aMoAdView = new com.amoad.AMoAdView(this.b, (byte) 0);
                aMoAdView.setResponsiveStyle(true);
                aMoAdView.setRotation(false);
                aMoAdView.setNetworkTimeoutMillis(this.t);
                aMoAdView.setCallback(this.v);
                aMoAdView.setSid(this.c);
            }
            this.d = aMoAdView;
        }
    }

    final void b() {
        android.app.Dialog dialog = this.e;
        if (dialog != null) {
            dialog.dismiss();
        }
        d();
    }

    final void b(int i, int i2) {
        this.m = i;
        this.n = i2;
    }

    final boolean c() {
        return this.g && this.d != null;
    }
}
