package com.onevcat.uniwebview;

/* JADX INFO: loaded from: classes5.dex */
public final class L0 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f3673a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L0(java.lang.String str) {
        super(1);
        this.f3673a = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(java.lang.Object obj) {
        com.onevcat.uniwebview.N it = (com.onevcat.uniwebview.N) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        com.onevcat.uniwebview.C1593w c1593w = it.p;
        java.lang.String scheme = this.f3673a;
        c1593w.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scheme, "scheme");
        com.onevcat.uniwebview.C1578r c1578r = c1593w.e.h;
        c1578r.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scheme, "scheme");
        c1578r.d.remove(scheme);
        return kotlin.Unit.INSTANCE;
    }
}
