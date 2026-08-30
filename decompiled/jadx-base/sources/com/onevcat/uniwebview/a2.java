package com.onevcat.uniwebview;

/* JADX INFO: loaded from: classes5.dex */
public final class a2 extends androidx.browser.customtabs.CustomTabsCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.onevcat.uniwebview.b2 f3705a;

    public a2(com.onevcat.uniwebview.b2 b2Var) {
        this.f3705a = b2Var;
    }

    @Override // androidx.browser.customtabs.CustomTabsCallback
    public final void onNavigationEvent(int i, android.os.Bundle bundle) {
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        java.lang.String message = "onNavigationEvent: " + i;
        c1560l.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        c1560l.a(com.onevcat.uniwebview.EnumC1557k.INFO, message);
        if (i == 6) {
            com.onevcat.uniwebview.b2 b2Var = this.f3705a;
            b2Var.getClass();
            com.onevcat.uniwebview.C1569o c1569o = com.onevcat.uniwebview.C1569o.b;
            java.lang.String name = b2Var.b;
            c1569o.getClass();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
            java.lang.String message2 = "Removing safe browsing from manager: " + name;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message2, "message");
            c1560l.a(com.onevcat.uniwebview.EnumC1557k.DEBUG, message2);
            c1569o.f3745a.remove(name);
            com.onevcat.uniwebview.b2 b2Var2 = this.f3705a;
            b2Var2.d.a(b2Var2.b, com.onevcat.uniwebview.d2.SafeBrowsingFinished, "");
        }
    }
}
