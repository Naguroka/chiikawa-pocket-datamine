package com.onevcat.uniwebview;

/* JADX INFO: renamed from: com.onevcat.uniwebview.p0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C1573p0 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final com.onevcat.uniwebview.C1573p0 f3748a = new com.onevcat.uniwebview.C1573p0();

    public C1573p0() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(java.lang.Object obj) throws java.io.IOException {
        com.onevcat.uniwebview.N it = (com.onevcat.uniwebview.N) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        android.view.ViewParent parent = it.e.getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(it.e);
        }
        it.b();
        java.io.ByteArrayOutputStream byteArrayOutputStream = it.m;
        if (byteArrayOutputStream != null) {
            byteArrayOutputStream.close();
        }
        it.m = null;
        it.n = null;
        it.p.destroy();
        com.onevcat.uniwebview.C1539e c1539e = com.onevcat.uniwebview.C1539e.b;
        java.lang.String name = it.b;
        c1539e.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        c1560l.a(com.onevcat.uniwebview.EnumC1557k.DEBUG, com.onevcat.uniwebview.AbstractC1575q.a("Removing web view container from manager: ", name, c1560l, com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE));
        c1539e.f3717a.remove(name);
        com.onevcat.uniwebview.P.b();
        return kotlin.Unit.INSTANCE;
    }
}
