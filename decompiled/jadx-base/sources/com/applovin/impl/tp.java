package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class tp {
    public static boolean b(android.net.Uri uri) {
        return uri != null && "applovin".equalsIgnoreCase(uri.getScheme()) && com.google.ads.mediation.applovin.AppLovinMediationAdapter.APPLOVIN_SDK_ERROR_DOMAIN.equalsIgnoreCase(uri.getHost()) && "/adservice/deeplink".equals(uri.getPath());
    }

    class a extends com.applovin.impl.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f1375a;
        final /* synthetic */ com.applovin.impl.adview.a b;
        final /* synthetic */ com.applovin.impl.sdk.j c;

        a(java.lang.String str, com.applovin.impl.adview.a aVar, com.applovin.impl.sdk.j jVar) {
            this.f1375a = str;
            this.b = aVar;
            this.c = jVar;
        }

        @Override // com.applovin.impl.p, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
            if (activity instanceof com.applovin.sdk.AppLovinWebViewActivity) {
                ((com.applovin.sdk.AppLovinWebViewActivity) activity).loadUrl(this.f1375a, null);
                com.applovin.impl.fc.c(this.b.e(), this.b.i(), this.b.k());
            }
        }

        @Override // com.applovin.impl.p, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(android.app.Activity activity) {
            if (activity instanceof com.applovin.sdk.AppLovinWebViewActivity) {
                com.applovin.impl.fc.a(this.b.e(), this.b.i(), this.b.k());
                this.c.e().b(this);
            }
        }
    }

    public static void a(android.net.Uri uri, com.applovin.impl.sdk.ad.b bVar, com.applovin.impl.sdk.j jVar) {
        java.lang.String queryParameter = uri.getQueryParameter(com.json.zb.q);
        if (android.webkit.URLUtil.isValidUrl(queryParameter)) {
            jVar.W().e(com.applovin.impl.sdk.network.d.b().d(com.applovin.impl.sdk.utils.StringUtils.appendQueryParameter(queryParameter, "clcode", bVar.getClCode())).a(false).b(java.lang.Boolean.parseBoolean(uri.getQueryParameter("fire_from_webview"))).a());
        } else {
            jVar.I();
            if (com.applovin.impl.sdk.n.a()) {
                jVar.I().b("UriUtils", "Could not find postback url to fire from query in original uri: " + uri);
            }
        }
    }

    public static void b(android.net.Uri uri, com.applovin.impl.sdk.ad.b bVar, com.applovin.impl.sdk.j jVar) {
        java.lang.String strEmptyIfNull = com.applovin.impl.sdk.utils.StringUtils.emptyIfNull(uri.getQueryParameter("error"));
        java.lang.String strEmptyIfNull2 = com.applovin.impl.sdk.utils.StringUtils.emptyIfNull(uri.getQueryParameter("exception"));
        java.lang.String strEmptyIfNull3 = com.applovin.impl.sdk.utils.StringUtils.emptyIfNull(uri.getQueryParameter("details"));
        java.util.HashMap<java.lang.String, java.lang.String> mapHashMap = com.applovin.impl.sdk.utils.CollectionUtils.hashMap("source", strEmptyIfNull);
        com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid("top_main_method", strEmptyIfNull2, mapHashMap);
        com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid("details", strEmptyIfNull3, mapHashMap);
        if (bVar != null) {
            mapHashMap.putAll(com.applovin.impl.la.a(bVar, true, jVar));
        }
        jVar.D().a(com.applovin.impl.ka.b0, (java.util.Map) mapHashMap);
    }

    public static android.os.Bundle a(android.net.Uri uri) {
        android.os.Bundle bundle = new android.os.Bundle();
        for (java.lang.String str : uri.getQueryParameterNames()) {
            bundle.putString(str, uri.getQueryParameter(str));
        }
        return bundle;
    }

    public static java.lang.Boolean a(android.content.Context context) {
        try {
            android.content.pm.PackageManager packageManager = context.getPackageManager();
            boolean z = true;
            packageManager.getPackageInfo("com.android.vending", 1);
            int applicationEnabledSetting = packageManager.getApplicationEnabledSetting("com.android.vending");
            if (applicationEnabledSetting != 2 && applicationEnabledSetting != 3) {
                z = false;
            }
            return java.lang.Boolean.valueOf(z);
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            return java.lang.Boolean.TRUE;
        } catch (java.lang.Throwable unused2) {
            return null;
        }
    }

    public static void a(android.net.Uri uri, com.applovin.impl.adview.a aVar, com.applovin.impl.sdk.j jVar) {
        com.applovin.impl.adview.b bVarG = aVar.g();
        java.lang.String queryParameter = uri.getQueryParameter(com.json.zb.q);
        if (android.text.TextUtils.isEmpty(queryParameter)) {
            jVar.I();
            if (com.applovin.impl.sdk.n.a()) {
                jVar.I().b("UriUtils", "Could not find url to load from query in original uri");
                return;
            }
            return;
        }
        java.lang.String queryParameter2 = uri.getQueryParameter("load_type");
        if (com.json.y3.e.equalsIgnoreCase(queryParameter2)) {
            jVar.I();
            if (com.applovin.impl.sdk.n.a()) {
                jVar.I().a("UriUtils", "Loading new page externally: " + queryParameter);
            }
            a(queryParameter, aVar, jVar);
            return;
        }
        if ("internal".equalsIgnoreCase(queryParameter2)) {
            jVar.I();
            if (com.applovin.impl.sdk.n.a()) {
                jVar.I().a("UriUtils", "Loading new page in WebView: " + queryParameter);
            }
            bVarG.loadUrl(queryParameter);
            java.lang.String queryParameter3 = uri.getQueryParameter("bg_color");
            if (com.applovin.impl.sdk.utils.StringUtils.isValidString(queryParameter3)) {
                bVarG.setBackgroundColor(android.graphics.Color.parseColor(queryParameter3));
                return;
            }
            return;
        }
        if ("in_app".equalsIgnoreCase(queryParameter2)) {
            jVar.I();
            if (com.applovin.impl.sdk.n.a()) {
                jVar.I().a("UriUtils", "Loading new page in slide-up webview: " + queryParameter);
            }
            jVar.e().a(new com.applovin.impl.tp.a(queryParameter, aVar, jVar));
            android.content.Intent intent = new android.content.Intent(com.applovin.impl.sdk.j.m(), (java.lang.Class<?>) com.applovin.sdk.AppLovinWebViewActivity.class);
            intent.putExtra(com.applovin.sdk.AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, jVar.a0());
            intent.setFlags(268435456);
            com.applovin.impl.sdk.j.m().startActivity(intent);
            return;
        }
        if ("in_app_v2".equalsIgnoreCase(queryParameter2)) {
            aVar.a(aVar.i(), aVar.k(), (android.net.Uri) null, bVarG.getAndClearLastClickEvent(), (android.os.Bundle) null);
            if (aVar.j() != null) {
                jVar.I();
                if (com.applovin.impl.sdk.n.a()) {
                    jVar.I().a("UriUtils", "Loading new page in Custom Tabs: " + queryParameter);
                }
                jVar.w().a(queryParameter, aVar, jVar.m0());
                return;
            }
            jVar.I();
            if (com.applovin.impl.sdk.n.a()) {
                jVar.I().a("UriUtils", "Custom Tabs not supported, loading new page externally: " + queryParameter);
            }
            a(queryParameter, aVar, jVar);
            return;
        }
        jVar.I();
        if (com.applovin.impl.sdk.n.a()) {
            jVar.I().b("UriUtils", "Could not find load type in original uri");
        }
    }

    public static boolean a(android.net.Uri uri, android.content.Context context, com.applovin.impl.sdk.j jVar) {
        boolean z = false;
        if (uri == null) {
            return false;
        }
        try {
            jVar.I();
            if (com.applovin.impl.sdk.n.a()) {
                jVar.I().d("UriUtils", "Opening URI: " + uri);
            }
            android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", uri);
            if (!(context instanceof android.app.Activity)) {
                intent.setFlags(268435456);
            }
            if ("market".equals(intent.getScheme()) || "play.google.com".equals(uri.getHost())) {
                java.lang.Boolean boolA = a(context);
                if (((java.lang.Boolean) jVar.a(com.applovin.impl.sj.k6)).booleanValue() && (boolA == null || boolA.booleanValue())) {
                    intent.setPackage(null);
                } else {
                    intent.setPackage("com.android.vending");
                }
            }
            jVar.e0().pauseForClick();
            context.startActivity(intent);
            z = true;
        } catch (java.lang.Throwable th) {
            jVar.I();
            if (com.applovin.impl.sdk.n.a()) {
                jVar.I().a("UriUtils", "Unable to open \"" + uri + "\".", th);
            }
            java.util.HashMap<java.lang.String, java.lang.String> mapHashMap = com.applovin.impl.sdk.utils.CollectionUtils.hashMap("url", uri.toString());
            if ("play.google.com".equals(uri.getHost())) {
                com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid("details", (java.lang.String) jVar.x().H().get("ps_version"), mapHashMap);
            }
            jVar.D().a("UriUtils", "openUri", th, mapHashMap);
        }
        if (!z) {
            jVar.e0().resumeForClick();
        }
        return z;
    }

    private static void a(java.lang.String str, com.applovin.impl.adview.a aVar, com.applovin.impl.sdk.j jVar) {
        a(android.net.Uri.parse(str), aVar.g().getContext(), jVar);
        com.applovin.impl.fc.b(aVar.e(), aVar.i(), aVar.k());
    }
}
