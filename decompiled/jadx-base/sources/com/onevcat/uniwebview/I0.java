package com.onevcat.uniwebview;

/* JADX INFO: loaded from: classes5.dex */
public final class I0 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final com.onevcat.uniwebview.I0 f3664a = new com.onevcat.uniwebview.I0();

    public I0() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(java.lang.Object obj) {
        com.onevcat.uniwebview.N it = (com.onevcat.uniwebview.N) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        it.p.reload();
        return kotlin.Unit.INSTANCE;
    }
}
