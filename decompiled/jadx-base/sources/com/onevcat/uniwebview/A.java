package com.onevcat.uniwebview;

/* JADX INFO: loaded from: classes5.dex */
public final class A implements com.onevcat.uniwebview.InterfaceC1601y {
    public final android.app.Activity b;
    public final java.lang.String c;
    public final java.lang.String d;
    public final java.lang.String e;
    public final com.onevcat.uniwebview.c2 f;
    public java.lang.String g;
    public com.onevcat.uniwebview.UniWebViewProxyActivity h;
    public boolean i;
    public boolean j;

    public A(android.app.Activity activity, java.lang.String name, java.lang.String url, java.lang.String callbackURLScheme, com.onevcat.uniwebview.C1542f messageSender) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callbackURLScheme, "callbackURLScheme");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messageSender, "messageSender");
        this.b = activity;
        this.c = name;
        this.d = url;
        this.e = callbackURLScheme;
        this.f = messageSender;
        com.onevcat.uniwebview.C1536d c1536d = com.onevcat.uniwebview.C1536d.b;
        c1536d.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this, "session");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        c1560l.a(com.onevcat.uniwebview.EnumC1557k.DEBUG, com.onevcat.uniwebview.AbstractC1575q.a("Adding auth session to manager: ", name, c1560l, com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE));
        c1536d.f3713a.put(name, this);
    }

    @Override // com.onevcat.uniwebview.InterfaceC1601y
    public final void a() {
        android.app.Activity activity = this.b;
        android.content.Intent intent = new android.content.Intent(activity, activity.getClass());
        intent.setFlags(603979776);
        this.b.startActivity(intent);
    }

    @Override // com.onevcat.uniwebview.InterfaceC1601y
    public final void b() {
        com.onevcat.uniwebview.C1598x c1598x = com.onevcat.uniwebview.InterfaceC1601y.f3771a;
        java.lang.String id = this.g;
        if (id == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("handlerId");
            id = null;
        }
        c1598x.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "id");
        com.onevcat.uniwebview.C1598x.b.remove(id);
        com.onevcat.uniwebview.C1536d c1536d = com.onevcat.uniwebview.C1536d.b;
        java.lang.String name = this.c;
        c1536d.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        c1560l.a(com.onevcat.uniwebview.EnumC1557k.DEBUG, com.onevcat.uniwebview.AbstractC1575q.a("Removing auth session from manager: ", name, c1560l, com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE));
        c1536d.f3713a.remove(name);
        if (this.j) {
            return;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("Seems that user cancelled the auth task.", com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE);
        c1560l.a(com.onevcat.uniwebview.EnumC1557k.INFO, "Seems that user cancelled the auth task.");
        this.f.a(this.c, com.onevcat.uniwebview.d2.AuthErrorReceived, new com.onevcat.uniwebview.Y1("", "-999", "user cancelled", null));
    }

    @Override // com.onevcat.uniwebview.InterfaceC1601y
    public final void a(com.onevcat.uniwebview.UniWebViewProxyActivity activity, int i, int i2, android.content.Intent intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        activity.finish();
    }

    @Override // com.onevcat.uniwebview.InterfaceC1601y
    public final void a(com.onevcat.uniwebview.UniWebViewProxyActivity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        java.lang.String message = "UniWebViewAuthenticationSession.onCreate. Proxy activity: " + activity;
        c1560l.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        com.onevcat.uniwebview.EnumC1557k enumC1557k = com.onevcat.uniwebview.EnumC1557k.DEBUG;
        c1560l.a(enumC1557k, message);
        this.h = activity;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("UniWebViewAuthenticationSession.startAuthSession. Trying to build custom tab intent...", com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE);
        c1560l.a(enumC1557k, "UniWebViewAuthenticationSession.startAuthSession. Trying to build custom tab intent...");
        androidx.browser.customtabs.CustomTabsIntent customTabsIntentBuild = new androidx.browser.customtabs.CustomTabsIntent.Builder().build();
        if (this.i) {
            customTabsIntentBuild.intent.putExtra("com.google.android.apps.chrome.EXTRA_OPEN_NEW_INCOGNITO_TAB", true);
        }
        customTabsIntentBuild.intent.setData(android.net.Uri.parse(this.d));
        java.lang.String message2 = "UniWebViewAuthenticationSession.startAuthSession. startActivityForResult, Tab Intent: " + customTabsIntentBuild + ", Internal Intent: " + customTabsIntentBuild.intent + ", Uri: " + customTabsIntentBuild.intent.getData();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message2, "message");
        c1560l.a(enumC1557k, message2);
        com.onevcat.uniwebview.UniWebViewProxyActivity uniWebViewProxyActivity = this.h;
        if (uniWebViewProxyActivity == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("proxyActivity");
            uniWebViewProxyActivity = null;
        }
        uniWebViewProxyActivity.startActivityForResult(customTabsIntentBuild.intent, 12947761);
    }

    @Override // com.onevcat.uniwebview.InterfaceC1601y
    public final void a(android.content.Intent intent) {
        if (this.j) {
            com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
            java.lang.String message = "An intent is already handled. Ignore this one..." + intent;
            c1560l.getClass();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
            c1560l.a(com.onevcat.uniwebview.EnumC1557k.CRITICAL, message);
            return;
        }
        this.j = true;
        if (intent == null) {
            com.onevcat.uniwebview.C1560l c1560l2 = com.onevcat.uniwebview.C1560l.b;
            c1560l2.getClass();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("Auth session receives null intent.", com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE);
            c1560l2.a(com.onevcat.uniwebview.EnumC1557k.CRITICAL, "Auth session receives null intent.");
            this.f.a(this.c, com.onevcat.uniwebview.d2.AuthErrorReceived, new com.onevcat.uniwebview.Y1("", "1001", "null intent", null));
            return;
        }
        com.onevcat.uniwebview.C1560l c1560l3 = com.onevcat.uniwebview.C1560l.b;
        java.lang.String message2 = "Auth session receives intent: " + intent + ". data: " + intent.getData();
        c1560l3.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message2, "message");
        com.onevcat.uniwebview.EnumC1557k enumC1557k = com.onevcat.uniwebview.EnumC1557k.INFO;
        c1560l3.a(enumC1557k, message2);
        android.net.Uri data = intent.getData();
        if (data == null) {
            return;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(this.e, "intent") && !kotlin.jvm.internal.Intrinsics.areEqual(data.getScheme(), this.e)) {
            java.lang.String message3 = "Auth session receives uri " + data + ". But its scheme does not match the expected one: " + this.e;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message3, "message");
            c1560l3.a(com.onevcat.uniwebview.EnumC1557k.CRITICAL, message3);
            this.f.a(this.c, com.onevcat.uniwebview.d2.AuthErrorReceived, new com.onevcat.uniwebview.Y1("", "1002", java.lang.String.valueOf(data), null));
            return;
        }
        java.lang.String message4 = "Auth session got result from service provider. " + intent.getDataString();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message4, "message");
        c1560l3.a(enumC1557k, message4);
        com.onevcat.uniwebview.c2 c2Var = this.f;
        java.lang.String str = this.c;
        com.onevcat.uniwebview.d2 d2Var = com.onevcat.uniwebview.d2.AuthFinished;
        java.lang.String dataString = intent.getDataString();
        if (dataString == null) {
            dataString = java.lang.String.valueOf(data);
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(dataString, "intent.dataString ?: \"$uri\"");
        c2Var.a(str, d2Var, dataString);
    }
}
