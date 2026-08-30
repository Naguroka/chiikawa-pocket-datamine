package com.onevcat.uniwebview;

/* JADX INFO: loaded from: classes5.dex */
public abstract class P {
    public static void a() {
        final android.webkit.CookieManager cookieManager = android.webkit.CookieManager.getInstance();
        cookieManager.removeAllCookies(new android.webkit.ValueCallback() { // from class: com.onevcat.uniwebview.P$$ExternalSyntheticLambda0
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(java.lang.Object obj) {
                com.onevcat.uniwebview.P.a(cookieManager, (java.lang.Boolean) obj);
            }
        });
    }

    public static void b() {
        android.webkit.CookieManager.getInstance().flush();
    }

    public static final void a(android.webkit.CookieManager cookieManager, java.lang.Boolean bool) {
        cookieManager.flush();
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        com.onevcat.uniwebview.C1560l c1560l2 = com.onevcat.uniwebview.C1560l.b;
        c1560l2.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("Cookie manager flush done.", com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE);
        c1560l2.a(com.onevcat.uniwebview.EnumC1557k.VERBOSE, "Cookie manager flush done.");
    }

    public static void b(java.lang.String url, java.lang.String cookie) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cookie, "cookie");
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        java.lang.String message = com.onevcat.uniwebview.O.a("Cookie set for url: ", url, ", cookie: ", cookie, c1560l);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        com.onevcat.uniwebview.EnumC1557k enumC1557k = com.onevcat.uniwebview.EnumC1557k.VERBOSE;
        c1560l.a(enumC1557k, message);
        android.webkit.CookieManager cookieManager = android.webkit.CookieManager.getInstance();
        cookieManager.setCookie(url, cookie);
        cookieManager.flush();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("Cookie manager flush done.", com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE);
        c1560l.a(enumC1557k, "Cookie manager flush done.");
    }

    public static void a(java.lang.String url, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        java.lang.String message = com.onevcat.uniwebview.O.a("Cookie remove for url: ", url, ", key: ", str, c1560l);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        com.onevcat.uniwebview.EnumC1557k enumC1557k = com.onevcat.uniwebview.EnumC1557k.VERBOSE;
        c1560l.a(enumC1557k, message);
        android.webkit.CookieManager cookieManager = android.webkit.CookieManager.getInstance();
        java.lang.String cookie = cookieManager.getCookie(url);
        if (cookie == null) {
            java.lang.String message2 = "The content for given url '" + url + "' is not found in cookie manager.";
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message2, "message");
            c1560l.a(com.onevcat.uniwebview.EnumC1557k.DEBUG, message2);
            return;
        }
        java.lang.String message3 = "Cookie string is found: '" + cookie + "', for url: " + url;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message3, "message");
        c1560l.a(enumC1557k, message3);
        java.util.Iterator<java.lang.String> it = new kotlin.text.Regex(";").split(cookie, 0).iterator();
        while (it.hasNext()) {
            java.util.List<java.lang.String> listSplit = new kotlin.text.Regex(com.ironsource.y8.i.b).split(kotlin.text.StringsKt.trim((java.lang.CharSequence) it.next()).toString(), 0);
            if (listSplit.size() >= 2 && (str == null || kotlin.jvm.internal.Intrinsics.areEqual(str, listSplit.get(0)))) {
                cookieManager.setCookie(url, listSplit.get(0) + '=');
            }
        }
    }
}
