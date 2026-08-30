package com.onevcat.uniwebview;

/* JADX INFO: loaded from: classes5.dex */
public final class b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.app.Activity f3709a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final com.onevcat.uniwebview.c2 d;
    public androidx.browser.customtabs.CustomTabsClient e;
    public androidx.browser.customtabs.CustomTabsSession f;
    public java.lang.Integer g;
    public boolean h;

    public b2(android.app.Activity activity, java.lang.String name, java.lang.String url, com.onevcat.uniwebview.C1542f messageSender) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messageSender, "messageSender");
        this.f3709a = activity;
        this.b = name;
        this.c = url;
        this.d = messageSender;
        com.onevcat.uniwebview.C1569o c1569o = com.onevcat.uniwebview.C1569o.b;
        c1569o.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this, "browsing");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        java.lang.String strA = com.onevcat.uniwebview.AbstractC1575q.a("Adding safe browsing to manager: ", name, c1560l, com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE);
        com.onevcat.uniwebview.EnumC1557k enumC1557k = com.onevcat.uniwebview.EnumC1557k.DEBUG;
        c1560l.a(enumC1557k, strA);
        c1569o.f3745a.put(name, this);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        c1560l.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("Checking CustomTabsService resolve info.", com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE);
        c1560l.a(enumC1557k, "Checking CustomTabsService resolve info.");
        java.util.List<android.content.pm.ResolveInfo> listQueryIntentServices = activity.getPackageManager().queryIntentServices(new android.content.Intent(androidx.browser.customtabs.CustomTabsService.ACTION_CUSTOM_TABS_CONNECTION), 0);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(listQueryIntentServices, "activity.packageManager.…ervices(serviceIntent, 0)");
        java.lang.String message = "Resolved information: " + listQueryIntentServices;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        c1560l.a(enumC1557k, message);
        android.content.pm.ResolveInfo resolveInfo = (android.content.pm.ResolveInfo) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) listQueryIntentServices);
        if (resolveInfo == null || androidx.browser.customtabs.CustomTabsClient.bindCustomTabsService(activity, resolveInfo.serviceInfo.packageName, new com.onevcat.uniwebview.Z1(this))) {
            return;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("Custom Tabs didn't bind to a tab service. Something goes wrong. Trying to show the browser without a session.", com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE);
        c1560l.a(com.onevcat.uniwebview.EnumC1557k.CRITICAL, "Custom Tabs didn't bind to a tab service. Something goes wrong. Trying to show the browser without a session.");
        androidx.browser.customtabs.CustomTabsIntent.Builder builder = new androidx.browser.customtabs.CustomTabsIntent.Builder();
        java.lang.Integer num = this.g;
        if (num != null) {
            builder.setToolbarColor(num.intValue());
        }
        builder.build().launchUrl(activity, android.net.Uri.parse(url));
    }
}
