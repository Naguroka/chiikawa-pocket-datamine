package com.onevcat.uniwebview;

/* JADX INFO: loaded from: classes5.dex */
public final class E0 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f3654a;
    public final /* synthetic */ java.lang.String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E0(java.lang.String str, java.lang.String str2) {
        super(1);
        this.f3654a = str;
        this.b = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(java.lang.Object obj) {
        com.onevcat.uniwebview.N it = (com.onevcat.uniwebview.N) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        com.onevcat.uniwebview.C1593w c1593w = it.p;
        java.lang.String str = this.f3654a;
        java.lang.String str2 = this.b;
        c1593w.getClass();
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        c1560l.a(com.onevcat.uniwebview.EnumC1557k.INFO, com.onevcat.uniwebview.AbstractC1575q.a("UniWebView will load HTML string with base url: ", str2, c1560l, com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE));
        java.lang.String message = "Input HTML content: \n" + str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        c1560l.a(com.onevcat.uniwebview.EnumC1557k.VERBOSE, message);
        com.onevcat.uniwebview.J j = c1593w.e;
        j.f = 200;
        j.d = true;
        j.c = false;
        j.e = false;
        if (str == null) {
            str = "";
        }
        c1593w.loadDataWithBaseURL(str2, str, "text/html", com.adjust.sdk.Constants.ENCODING, null);
        return kotlin.Unit.INSTANCE;
    }
}
