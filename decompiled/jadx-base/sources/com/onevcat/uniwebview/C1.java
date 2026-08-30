package com.onevcat.uniwebview;

/* JADX INFO: loaded from: classes5.dex */
public final class C1 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3649a;
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1(int i, int i2) {
        super(1);
        this.f3649a = i;
        this.b = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(java.lang.Object obj) {
        com.onevcat.uniwebview.N it = (com.onevcat.uniwebview.N) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        int i = this.f3649a;
        int i2 = this.b;
        it.getClass();
        int iMax = java.lang.Math.max(0, i);
        int iMax2 = java.lang.Math.max(0, i2);
        android.view.ViewGroup.LayoutParams layoutParams = it.e.getLayoutParams();
        if (layoutParams == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) layoutParams;
        layoutParams2.width = iMax;
        layoutParams2.height = iMax2;
        layoutParams2.gravity = 51;
        it.e.setLayoutParams(layoutParams2);
        com.onevcat.uniwebview.C1530b c1530b = it.o;
        if (c1530b != null) {
            c1530b.g = iMax2;
        }
        return kotlin.Unit.INSTANCE;
    }
}
