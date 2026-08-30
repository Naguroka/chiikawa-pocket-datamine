package com.onevcat.uniwebview;

/* JADX INFO: renamed from: com.onevcat.uniwebview.b1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C1532b1 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f3708a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1532b1(float f, float f2, float f3, float f4) {
        super(1);
        this.f3708a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(java.lang.Object obj) {
        com.onevcat.uniwebview.N it = (com.onevcat.uniwebview.N) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        float f = this.f3708a;
        float f2 = this.b;
        float f3 = this.c;
        float f4 = this.d;
        it.getClass();
        float f5 = 255;
        int iArgb = android.graphics.Color.argb((int) (f4 * f5), (int) (f * f5), (int) (f2 * f5), (int) (f3 * f5));
        it.p.setBackgroundColor(iArgb);
        android.widget.FrameLayout frameLayout = com.onevcat.uniwebview.N.s;
        if (frameLayout != null) {
            frameLayout.setBackgroundColor(iArgb);
        }
        return kotlin.Unit.INSTANCE;
    }
}
