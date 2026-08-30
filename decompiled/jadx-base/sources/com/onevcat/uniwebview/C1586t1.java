package com.onevcat.uniwebview;

/* JADX INFO: renamed from: com.onevcat.uniwebview.t1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C1586t1 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3759a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1586t1(int i, int i2, int i3, int i4) {
        super(1);
        this.f3759a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(java.lang.Object obj) {
        com.onevcat.uniwebview.N it = (com.onevcat.uniwebview.N) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        it.a(this.f3759a, this.b, this.c, this.d);
        return kotlin.Unit.INSTANCE;
    }
}
