package com.onevcat.uniwebview;

/* JADX INFO: loaded from: classes5.dex */
public final class T1 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final com.onevcat.uniwebview.T1 f3692a = new com.onevcat.uniwebview.T1();

    public T1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(java.lang.Object obj) throws java.io.IOException {
        com.onevcat.uniwebview.N it = (com.onevcat.uniwebview.N) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        java.io.ByteArrayOutputStream byteArrayOutputStream = it.m;
        if (byteArrayOutputStream != null) {
            byteArrayOutputStream.close();
        }
        it.m = null;
        it.n = null;
        return kotlin.Unit.INSTANCE;
    }
}
