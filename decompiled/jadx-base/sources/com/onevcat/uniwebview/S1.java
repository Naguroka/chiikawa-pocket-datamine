package com.onevcat.uniwebview;

/* JADX INFO: loaded from: classes5.dex */
public final class S1 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final com.onevcat.uniwebview.S1 f3690a = new com.onevcat.uniwebview.S1();

    public S1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(java.lang.Object obj) {
        com.onevcat.uniwebview.N it = (com.onevcat.uniwebview.N) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        it.p.stopLoading();
        return kotlin.Unit.INSTANCE;
    }
}
