package com.onevcat.uniwebview;

/* JADX INFO: renamed from: com.onevcat.uniwebview.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C1566n extends android.view.animation.Animation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.view.View f3742a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;

    public C1566n(com.onevcat.uniwebview.X view, int i, int i2, int i3, int i4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        this.f3742a = view;
        this.b = i;
        this.c = i3;
        this.d = i2 - i;
        this.e = i4 - i3;
        this.f = view.getWidth();
        this.g = view.getHeight();
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, android.view.animation.Transformation transformation) {
        if (f != 1.0f || isFillEnabled()) {
            if (this.e != 0) {
                this.f3742a.getLayoutParams().height = (int) ((this.e * f) + this.c);
            }
            if (this.d != 0) {
                this.f3742a.getLayoutParams().width = (int) ((this.d * f) + this.b);
            }
        } else {
            this.f3742a.getLayoutParams().height = this.g;
            this.f3742a.getLayoutParams().width = this.f;
        }
        this.f3742a.requestLayout();
    }
}
