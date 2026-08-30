package com.onevcat.uniwebview;

/* JADX INFO: loaded from: classes5.dex */
public final class M1 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f3676a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M1(float f) {
        super(1);
        this.f3676a = f;
    }

    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(java.lang.Object obj) {
        com.onevcat.uniwebview.N it = (com.onevcat.uniwebview.N) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        it.a(this.f3676a);
        return kotlin.Unit.INSTANCE;
    }
}
