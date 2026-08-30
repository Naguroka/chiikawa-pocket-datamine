package com.onevcat.uniwebview;

/* JADX INFO: renamed from: com.onevcat.uniwebview.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C1567n0 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final com.onevcat.uniwebview.C1567n0 f3743a = new com.onevcat.uniwebview.C1567n0();

    public C1567n0() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(java.lang.Object obj) {
        com.onevcat.uniwebview.N it = (com.onevcat.uniwebview.N) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        it.p.clearCache(true);
        return kotlin.Unit.INSTANCE;
    }
}
