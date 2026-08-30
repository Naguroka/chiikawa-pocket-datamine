package com.onevcat.uniwebview;

/* JADX INFO: loaded from: classes5.dex */
public final class R1 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f3688a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R1(java.lang.String str) {
        super(1);
        this.f3688a = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(java.lang.Object obj) {
        com.onevcat.uniwebview.N it = (com.onevcat.uniwebview.N) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        java.lang.String str = this.f3688a;
        java.io.ByteArrayOutputStream byteArrayOutputStream = it.m;
        if (byteArrayOutputStream != null) {
            try {
                byteArrayOutputStream.close();
            } catch (java.lang.Exception e) {
                com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
                com.onevcat.uniwebview.C1560l c1560l2 = com.onevcat.uniwebview.C1560l.b;
                java.lang.String message = "Snapshot buffer close exception: " + e;
                c1560l2.getClass();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
                c1560l2.a(com.onevcat.uniwebview.EnumC1557k.CRITICAL, message);
            }
        }
        it.m = new java.io.ByteArrayOutputStream();
        if (it.e.getHeight() > 0 && it.e.getWidth() > 0) {
            it.n = it.a((android.graphics.Rect) null);
            if (str != null) {
                it.c.a(it.b, com.onevcat.uniwebview.d2.SnapshotRenderingStarted, str);
            }
        }
        return kotlin.Unit.INSTANCE;
    }
}
