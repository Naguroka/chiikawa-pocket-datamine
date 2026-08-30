package com.onevcat.uniwebview;

/* JADX INFO: loaded from: classes5.dex */
public final class L implements android.view.animation.Animation.AnimationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.onevcat.uniwebview.N f3672a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ java.lang.String c;

    public L(com.onevcat.uniwebview.N n, boolean z, java.lang.String str) {
        this.f3672a = n;
        this.b = z;
        this.c = str;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(android.view.animation.Animation animation) {
        com.onevcat.uniwebview.c2 c2Var;
        java.lang.String name;
        com.onevcat.uniwebview.d2 d2Var;
        com.onevcat.uniwebview.N n = this.f3672a;
        n.j = null;
        boolean z = this.b;
        java.lang.String str = this.c;
        if (z) {
            c2Var = n.c;
            name = n.p.getName();
            d2Var = com.onevcat.uniwebview.d2.ShowTransitionFinished;
        } else {
            n.e.setVisibility(4);
            c2Var = n.c;
            name = n.p.getName();
            d2Var = com.onevcat.uniwebview.d2.HideTransitionFinished;
        }
        c2Var.a(name, d2Var, str);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(android.view.animation.Animation animation) {
    }
}
