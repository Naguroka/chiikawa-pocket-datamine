package com.onevcat.uniwebview;

/* JADX INFO: loaded from: classes5.dex */
public final class Q0 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f3685a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q0(java.lang.String str) {
        super(0);
        this.f3685a = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final java.lang.Object invoke() {
        com.onevcat.uniwebview.C1569o c1569o = com.onevcat.uniwebview.C1569o.b;
        java.lang.String name = this.f3685a;
        c1569o.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        com.onevcat.uniwebview.b2 b2Var = (com.onevcat.uniwebview.b2) c1569o.f3745a.get(name);
        if (b2Var != null) {
            androidx.browser.customtabs.CustomTabsClient customTabsClient = b2Var.e;
            if (customTabsClient == null) {
                b2Var.h = true;
            } else {
                if (b2Var.f == null) {
                    b2Var.f = customTabsClient.newSession(new com.onevcat.uniwebview.a2(b2Var));
                }
                androidx.browser.customtabs.CustomTabsIntent.Builder builder = new androidx.browser.customtabs.CustomTabsIntent.Builder(b2Var.f);
                java.lang.Integer num = b2Var.g;
                if (num != null) {
                    builder.setToolbarColor(num.intValue());
                }
                builder.build().launchUrl(b2Var.f3709a, android.net.Uri.parse(b2Var.c));
            }
        }
        return kotlin.Unit.INSTANCE;
    }
}
