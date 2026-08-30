package com.onevcat.uniwebview;

/* JADX INFO: renamed from: com.onevcat.uniwebview.z1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C1606z1 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3775a;
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1606z1(int i, int i2) {
        super(1);
        this.f3775a = i;
        this.b = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(java.lang.Object obj) {
        com.onevcat.uniwebview.N it = (com.onevcat.uniwebview.N) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        it.a(this.f3775a, this.b);
        return kotlin.Unit.INSTANCE;
    }
}
