package com.onevcat.uniwebview;

/* JADX INFO: loaded from: classes5.dex */
public final class K implements android.view.animation.Animation.AnimationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.onevcat.uniwebview.N f3669a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ java.lang.String f;

    public K(com.onevcat.uniwebview.N n, int i, int i2, int i3, int i4, java.lang.String str) {
        this.f3669a = n;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = str;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(android.view.animation.Animation animation) {
        com.onevcat.uniwebview.N n = this.f3669a;
        n.j = null;
        n.a(this.b, this.c, this.d, this.e);
        com.onevcat.uniwebview.N n2 = this.f3669a;
        n2.c.a(n2.p.getName(), com.onevcat.uniwebview.d2.AnimateToFinished, this.f);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(android.view.animation.Animation animation) {
    }
}
