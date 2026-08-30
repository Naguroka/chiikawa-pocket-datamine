package com.onevcat.uniwebview;

/* JADX INFO: loaded from: classes5.dex */
public final class P0 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f3682a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P0(java.lang.String str, float f, float f2, float f3) {
        super(0);
        this.f3682a = str;
        this.b = f;
        this.c = f2;
        this.d = f3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final java.lang.Object invoke() {
        com.onevcat.uniwebview.C1569o c1569o = com.onevcat.uniwebview.C1569o.b;
        java.lang.String name = this.f3682a;
        c1569o.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        com.onevcat.uniwebview.b2 b2Var = (com.onevcat.uniwebview.b2) c1569o.f3745a.get(name);
        if (b2Var != null) {
            float f = 255;
            b2Var.g = java.lang.Integer.valueOf(android.graphics.Color.rgb((int) (this.b * f), (int) (this.c * f), (int) (this.d * f)));
        }
        return kotlin.Unit.INSTANCE;
    }
}
