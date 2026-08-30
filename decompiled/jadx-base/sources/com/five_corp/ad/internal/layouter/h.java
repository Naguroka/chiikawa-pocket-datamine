package com.five_corp.ad.internal.layouter;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements com.five_corp.ad.internal.layouter.d, com.five_corp.ad.internal.layouter.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.widget.FrameLayout f1943a;
    public final android.app.Activity b;
    public final com.five_corp.ad.internal.layouter.g c;
    public final com.five_corp.ad.internal.K d;
    public final com.five_corp.ad.internal.cache.f e;
    public final com.five_corp.ad.internal.view.C1519l g;
    public android.widget.ImageView h;
    public android.view.View i;
    public android.view.View j;
    public final com.five_corp.ad.internal.layouter.f m;
    public final com.five_corp.ad.internal.logger.a n;
    public com.five_corp.ad.internal.layouter.i o;
    public final java.util.HashSet f = new java.util.HashSet();
    public android.widget.FrameLayout k = null;
    public final android.widget.FrameLayout.LayoutParams l = new android.widget.FrameLayout.LayoutParams(-1, -1);

    static {
        com.five_corp.ad.internal.layouter.h.class.toString();
    }

    public h(android.widget.FrameLayout frameLayout, com.five_corp.ad.AdActivity adActivity, com.five_corp.ad.internal.K k, com.five_corp.ad.internal.logger.a aVar, android.view.View view, com.five_corp.ad.internal.context.l lVar, com.five_corp.ad.internal.layouter.g gVar, com.five_corp.ad.internal.layouter.f fVar, com.five_corp.ad.internal.viewability.a aVar2, com.five_corp.ad.internal.layouter.k kVar) {
        android.widget.FrameLayout frameLayout2 = new android.widget.FrameLayout(adActivity);
        this.f1943a = frameLayout2;
        this.b = adActivity;
        this.c = gVar;
        this.d = k;
        this.m = fVar;
        this.g = new com.five_corp.ad.internal.view.C1519l(adActivity, aVar, view, this, lVar, null, aVar2, gVar.f, kVar);
        this.h = new android.widget.ImageView(adActivity);
        this.e = lVar.h;
        this.n = aVar;
        this.o = kVar.a(this);
        frameLayout.addView(frameLayout2);
        android.graphics.drawable.BitmapDrawable bitmapDrawableA = com.five_corp.ad.internal.layouter.m.a(lVar.c, adActivity.getResources(), aVar);
        if (bitmapDrawableA != null) {
            android.widget.FrameLayout frameLayout3 = new android.widget.FrameLayout(adActivity);
            frameLayout3.setClickable(false);
            frameLayout3.setFocusable(false);
            frameLayout3.setBackground(bitmapDrawableA);
            frameLayout.addView(frameLayout3);
        }
    }

    public final void a(android.view.View view, com.five_corp.ad.internal.ad.fullscreen.d dVar, int i, int i2) {
        int i3;
        double d;
        double d2;
        int i4;
        if (this.d.f1787a.getResources().getConfiguration().orientation == 1) {
            i3 = (int) (((double) i2) * dVar.f1814a);
            d = i3;
            d2 = dVar.b;
        } else {
            i3 = (int) (((double) i2) * dVar.c);
            d = i3;
            d2 = dVar.d;
        }
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(i3, (int) (d * d2));
        switch (com.five_corp.ad.e.a(i)) {
            case 1:
                i4 = 51;
                break;
            case 2:
                i4 = 53;
                break;
            case 3:
                i4 = 83;
                break;
            case 4:
                i4 = 85;
                break;
            case 5:
                i4 = 49;
                break;
            case 6:
                i4 = 19;
                break;
            case 7:
                i4 = 17;
                break;
            case 8:
                i4 = 21;
                break;
            case 9:
                i4 = 81;
                break;
            default:
                this.f.add(view);
                view.setLayoutParams(layoutParams);
                this.f1943a.addView(view);
        }
        layoutParams.gravity = i4;
        this.f.add(view);
        view.setLayoutParams(layoutParams);
        this.f1943a.addView(view);
    }

    public final void b(android.view.View view) {
        try {
            com.five_corp.ad.internal.layouter.f fVar = this.m;
            boolean zBooleanValue = this.c.f1942a.booleanValue();
            com.five_corp.ad.internal.fullscreen.e eVar = (com.five_corp.ad.internal.fullscreen.e) fVar;
            if (eVar.m.get()) {
                return;
            }
            com.five_corp.ad.f fVar2 = (com.five_corp.ad.f) eVar.i;
            if (fVar2.v != null) {
                fVar2.o();
                if (zBooleanValue) {
                    fVar2.d.post(new com.five_corp.ad.b(fVar2));
                }
            }
        } catch (java.lang.Throwable th) {
            this.n.a(th);
        }
    }

    public final void c(android.view.View view) {
        try {
            ((com.five_corp.ad.f) ((com.five_corp.ad.internal.fullscreen.e) this.m).i).r();
        } catch (java.lang.Throwable th) {
            this.n.a(th);
        }
    }

    @Override // com.five_corp.ad.internal.layouter.d
    public final void d() {
        ((com.five_corp.ad.f) ((com.five_corp.ad.internal.fullscreen.e) this.m).i).r();
    }

    @Override // com.five_corp.ad.internal.layouter.d
    public final void e() {
        ((com.five_corp.ad.f) ((com.five_corp.ad.internal.fullscreen.e) this.m).i).k();
    }

    @Override // com.five_corp.ad.internal.layouter.d
    public final void f() {
        com.five_corp.ad.f fVar;
        com.five_corp.ad.internal.fullscreen.e eVar;
        com.five_corp.ad.internal.fullscreen.e eVar2 = (com.five_corp.ad.internal.fullscreen.e) this.m;
        if (eVar2.m.get() || (eVar = (fVar = (com.five_corp.ad.f) eVar2.i).v) == null) {
            return;
        }
        eVar.c();
        int currentPositionMs = fVar.h.getCurrentPositionMs();
        fVar.h.f();
        fVar.o.r(currentPositionMs, fVar.t);
    }

    @Override // com.five_corp.ad.internal.layouter.d
    public final void g() {
        com.five_corp.ad.internal.layouter.f fVar = this.m;
        boolean zBooleanValue = this.c.f1942a.booleanValue();
        com.five_corp.ad.internal.fullscreen.e eVar = (com.five_corp.ad.internal.fullscreen.e) fVar;
        eVar.f.a(4, "PLAY_IN_FULLSCREEN feature is currently not supported (ResizableFullScreen).");
        if (eVar.m.get()) {
            return;
        }
        com.five_corp.ad.f fVar2 = (com.five_corp.ad.f) eVar.i;
        if (fVar2.v != null) {
            fVar2.o();
            if (zBooleanValue) {
                fVar2.d.post(new com.five_corp.ad.b(fVar2));
            }
        }
    }

    public final void h() {
        android.widget.FrameLayout frameLayout;
        android.view.View view;
        if (this.k == null || this.c.d == null) {
            return;
        }
        if (this.o.f) {
            com.five_corp.ad.internal.view.M.a(this.j);
            android.view.View view2 = this.i;
            if (view2 == null || view2.getParent() != null) {
                return;
            }
            frameLayout = this.k;
            view = this.i;
        } else {
            com.five_corp.ad.internal.view.M.a(this.i);
            android.view.View view3 = this.j;
            if (view3 == null || view3.getParent() != null) {
                return;
            }
            frameLayout = this.k;
            view = this.j;
        }
        frameLayout.addView(view, this.l);
    }

    @Override // com.five_corp.ad.internal.layouter.d
    public final void c() {
        ((com.five_corp.ad.f) ((com.five_corp.ad.internal.fullscreen.e) this.m).i).h.g();
    }

    public static android.view.View a(android.app.Activity activity, com.five_corp.ad.internal.cache.f fVar, com.five_corp.ad.internal.ad.fullscreen.a aVar) {
        com.five_corp.ad.internal.ad.w wVar;
        int iA = com.five_corp.ad.e.a(aVar.f1813a);
        if (iA != 0) {
            if (iA == 1 && (wVar = aVar.c) != null) {
                return fVar.a(activity, wVar);
            }
            return null;
        }
        com.five_corp.ad.internal.ad.fullscreen.e eVar = aVar.b;
        if (eVar == null) {
            return null;
        }
        android.widget.TextView textView = new android.widget.TextView(activity);
        textView.setText(eVar.b);
        textView.setTextColor(com.five_corp.ad.internal.view.M.a(eVar.c));
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setColor(com.five_corp.ad.internal.view.M.a(eVar.f1815a));
        gradientDrawable.setCornerRadius(5.0f);
        gradientDrawable.setStroke(1, com.five_corp.ad.internal.view.M.a(eVar.c));
        com.five_corp.ad.internal.view.M.a(textView, gradientDrawable);
        textView.setGravity(17);
        return textView;
    }

    public final android.widget.FrameLayout.LayoutParams a(int i, int i2) {
        com.five_corp.ad.internal.ad.custom_layout.d customLayoutConfig = this.g.getCustomLayoutConfig();
        if (customLayoutConfig == null) {
            return new android.widget.FrameLayout.LayoutParams(0, 0);
        }
        return customLayoutConfig.b * i < customLayoutConfig.f1800a * i2 ? new android.widget.FrameLayout.LayoutParams(i, (customLayoutConfig.b * i) / customLayoutConfig.f1800a, 17) : new android.widget.FrameLayout.LayoutParams((customLayoutConfig.f1800a * i2) / customLayoutConfig.b, i2, 17);
    }

    @Override // com.five_corp.ad.internal.layouter.d
    public final void b() {
        ((com.five_corp.ad.f) ((com.five_corp.ad.internal.fullscreen.e) this.m).i).j();
    }

    public final void a(android.view.View view) {
        try {
            ((com.five_corp.ad.f) ((com.five_corp.ad.internal.fullscreen.e) this.m).i).j();
        } catch (java.lang.Throwable th) {
            this.n.a(th);
        }
    }

    public final void b(int i, int i2) {
        android.view.View viewA;
        android.view.View viewA2;
        java.util.Iterator it = this.f.iterator();
        while (it.hasNext()) {
            com.five_corp.ad.internal.view.M.a((android.view.View) it.next());
        }
        this.f.clear();
        com.five_corp.ad.internal.ad.fullscreen.f fVar = this.c.b;
        if (fVar != null && (viewA2 = a(this.b, this.e, fVar.c)) != null) {
            viewA2.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.five_corp.ad.internal.layouter.h$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    this.f$0.a(view);
                }
            });
            a(viewA2, fVar.b, fVar.f1816a, i);
        }
        com.five_corp.ad.internal.ad.fullscreen.o oVar = this.c.c;
        if (oVar != null && (viewA = a(this.b, this.e, oVar.c)) != null) {
            viewA.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.five_corp.ad.internal.layouter.h$$ExternalSyntheticLambda1
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    this.f$0.b(view);
                }
            });
            a(viewA, oVar.b, oVar.f1822a, i);
        }
        com.five_corp.ad.internal.ad.fullscreen.p pVar = this.c.d;
        if (pVar != null) {
            this.i = a(this.b, this.e, pVar.c);
            this.j = a(this.b, this.e, pVar.d);
            this.k = new android.widget.FrameLayout(this.b);
            h();
            this.k.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.five_corp.ad.internal.layouter.h$$ExternalSyntheticLambda2
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    this.f$0.c(view);
                }
            });
            a(this.k, pVar.b, pVar.f1823a, i);
        }
    }

    @Override // com.five_corp.ad.internal.layouter.d
    public final void a(java.lang.String str) {
        ((com.five_corp.ad.f) ((com.five_corp.ad.internal.fullscreen.e) this.m).i).b(str);
    }

    @Override // com.five_corp.ad.internal.layouter.d
    public final void a() {
        com.five_corp.ad.internal.layouter.f fVar = this.m;
        boolean zBooleanValue = this.c.f1942a.booleanValue();
        com.five_corp.ad.internal.fullscreen.e eVar = (com.five_corp.ad.internal.fullscreen.e) fVar;
        if (eVar.m.get()) {
            return;
        }
        com.five_corp.ad.f fVar2 = (com.five_corp.ad.f) eVar.i;
        if (fVar2.v != null) {
            fVar2.o();
            if (zBooleanValue) {
                fVar2.d.post(new com.five_corp.ad.b(fVar2));
            }
        }
    }

    @Override // com.five_corp.ad.internal.layouter.d
    public final void a(com.five_corp.ad.internal.s sVar) {
        com.five_corp.ad.f fVar = (com.five_corp.ad.f) ((com.five_corp.ad.internal.fullscreen.e) this.m).i;
        fVar.a(fVar.h.getCurrentPositionMs(), sVar);
    }

    @Override // com.five_corp.ad.internal.layouter.j
    public final void a(com.five_corp.ad.internal.layouter.i iVar) {
        this.o = iVar;
        h();
    }
}
