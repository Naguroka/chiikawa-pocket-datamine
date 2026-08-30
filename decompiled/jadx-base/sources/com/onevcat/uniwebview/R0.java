package com.onevcat.uniwebview;

/* JADX INFO: loaded from: classes5.dex */
public final class R0 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3687a;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R0(int i, int i2, boolean z) {
        super(1);
        this.f3687a = i;
        this.b = i2;
        this.c = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(java.lang.Object obj) {
        com.onevcat.uniwebview.N it = (com.onevcat.uniwebview.N) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        it.p.a(this.f3687a, this.b, this.c);
        return kotlin.Unit.INSTANCE;
    }
}
