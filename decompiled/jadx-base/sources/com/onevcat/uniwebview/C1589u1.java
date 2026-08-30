package com.onevcat.uniwebview;

/* JADX INFO: renamed from: com.onevcat.uniwebview.u1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C1589u1 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f3761a;
    public final /* synthetic */ java.lang.String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1589u1(java.lang.String str, java.lang.String str2) {
        super(1);
        this.f3761a = str;
        this.b = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(java.lang.Object obj) {
        com.onevcat.uniwebview.N it = (com.onevcat.uniwebview.N) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        com.onevcat.uniwebview.C1593w c1593w = it.p;
        java.lang.String key = this.f3761a;
        java.lang.String str = this.b;
        c1593w.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        if (kotlin.text.StringsKt.isBlank(key)) {
            com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
            c1560l.getClass();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("Trying to set null or empty key for header field. Please check you have set correct key.", com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE);
            c1560l.a(com.onevcat.uniwebview.EnumC1557k.CRITICAL, "Trying to set null or empty key for header field. Please check you have set correct key.");
        } else if (str == null) {
            c1593w.e.g.remove(key);
        } else {
            c1593w.e.g.put(key, str);
        }
        return kotlin.Unit.INSTANCE;
    }
}
