package com.onevcat.uniwebview;

/* JADX INFO: loaded from: classes5.dex */
public final class Z1 extends androidx.browser.customtabs.CustomTabsServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.onevcat.uniwebview.b2 f3703a;

    public Z1(com.onevcat.uniwebview.b2 b2Var) {
        this.f3703a = b2Var;
    }

    @Override // androidx.browser.customtabs.CustomTabsServiceConnection
    public final void onCustomTabsServiceConnected(android.content.ComponentName name, androidx.browser.customtabs.CustomTabsClient client) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(client, "client");
        com.onevcat.uniwebview.b2 b2Var = this.f3703a;
        b2Var.e = client;
        if (b2Var.h) {
            if (client == null) {
                b2Var.h = true;
                return;
            }
            if (b2Var.f == null) {
                b2Var.f = client.newSession(new com.onevcat.uniwebview.a2(b2Var));
            }
            androidx.browser.customtabs.CustomTabsIntent.Builder builder = new androidx.browser.customtabs.CustomTabsIntent.Builder(b2Var.f);
            java.lang.Integer num = b2Var.g;
            if (num != null) {
                builder.setToolbarColor(num.intValue());
            }
            builder.build().launchUrl(b2Var.f3709a, android.net.Uri.parse(b2Var.c));
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        this.f3703a.e = null;
    }
}
