package com.onevcat.uniwebview;

/* JADX INFO: loaded from: classes5.dex */
public final class D1 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f3652a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D1(java.lang.String str) {
        super(1);
        this.f3652a = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(java.lang.Object obj) {
        com.onevcat.uniwebview.N it = (com.onevcat.uniwebview.N) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        it.g = this.f3652a;
        return kotlin.Unit.INSTANCE;
    }
}
