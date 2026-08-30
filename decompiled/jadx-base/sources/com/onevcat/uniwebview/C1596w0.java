package com.onevcat.uniwebview;

/* JADX INFO: renamed from: com.onevcat.uniwebview.w0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C1596w0 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final com.onevcat.uniwebview.C1596w0 f3766a = new com.onevcat.uniwebview.C1596w0();

    public C1596w0() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(java.lang.Object obj) {
        com.onevcat.uniwebview.N it = (com.onevcat.uniwebview.N) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        com.onevcat.uniwebview.C1593w c1593w = it.p;
        com.onevcat.uniwebview.C1593w c1593w2 = c1593w.d.i;
        if (c1593w2 != null) {
            if (c1593w2.canGoForward()) {
                c1593w2.goForward();
            }
        } else if (c1593w.canGoForward()) {
            c1593w.goForward();
        }
        return kotlin.Unit.INSTANCE;
    }
}
