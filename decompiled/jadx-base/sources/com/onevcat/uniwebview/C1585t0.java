package com.onevcat.uniwebview;

/* JADX INFO: renamed from: com.onevcat.uniwebview.t0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C1585t0 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final com.onevcat.uniwebview.C1585t0 f3758a = new com.onevcat.uniwebview.C1585t0();

    public C1585t0() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(java.lang.Object obj) {
        com.onevcat.uniwebview.N it = (com.onevcat.uniwebview.N) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return it.p.getUserAgent();
    }
}
