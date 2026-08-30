package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class sr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static android.webkit.WebView f1342a;
    private static java.lang.String b;
    private static int e;
    private static java.lang.String f;
    private static java.lang.String g;
    private static final java.lang.Object c = new java.lang.Object();
    private static final java.util.concurrent.atomic.AtomicBoolean d = new java.util.concurrent.atomic.AtomicBoolean();
    private static final java.util.concurrent.atomic.AtomicBoolean h = new java.util.concurrent.atomic.AtomicBoolean();

    static {
        if (e()) {
            b = (java.lang.String) com.applovin.impl.vj.a(com.applovin.impl.uj.K, "", com.applovin.impl.sdk.j.m());
            return;
        }
        b = "";
        com.applovin.impl.vj.b(com.applovin.impl.uj.K, (java.lang.Object) null, com.applovin.impl.sdk.j.m());
        com.applovin.impl.vj.b(com.applovin.impl.uj.L, (java.lang.Object) null, com.applovin.impl.sdk.j.m());
    }

    public static void a(final com.applovin.impl.sdk.j jVar) {
        if (d.getAndSet(true)) {
            return;
        }
        if (((java.lang.Boolean) jVar.a(com.applovin.impl.sj.c4)).booleanValue() && e()) {
            return;
        }
        if (com.applovin.impl.z3.d()) {
            com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(new java.lang.Runnable() { // from class: com.applovin.impl.sr$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.applovin.impl.sr.d(jVar);
                }
            });
        } else {
            com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(new java.lang.Runnable() { // from class: com.applovin.impl.sr$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    com.applovin.impl.sr.e(jVar);
                }
            });
        }
    }

    public static java.lang.String b() {
        return g;
    }

    public static java.lang.String c() {
        return f;
    }

    public static int d() {
        return e;
    }

    public static void f(com.applovin.impl.sdk.j jVar) {
    }

    public static void b(com.applovin.impl.sdk.j jVar) {
        if (h.getAndSet(true)) {
            return;
        }
        android.content.pm.PackageInfo packageInfoC = c(jVar);
        if (packageInfoC != null) {
            e = packageInfoC.versionCode;
            f = packageInfoC.versionName;
            g = packageInfoC.packageName;
        } else {
            jVar.I();
            if (com.applovin.impl.sdk.n.a()) {
                jVar.I().b("WebViewDataCollector", "Failed to get WebView package info");
            }
        }
    }

    private static android.content.pm.PackageInfo c(com.applovin.impl.sdk.j jVar) {
        android.content.pm.PackageManager packageManager = com.applovin.impl.sdk.j.m().getPackageManager();
        if (com.applovin.impl.z3.i()) {
            return android.webkit.WebView.getCurrentWebViewPackage();
        }
        java.util.Iterator it = jVar.c(com.applovin.impl.sj.q4).iterator();
        while (it.hasNext()) {
            try {
                return packageManager.getPackageInfo((java.lang.String) it.next(), 0);
            } catch (java.lang.Throwable unused) {
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(com.applovin.impl.sdk.j jVar) {
        try {
            synchronized (c) {
                try {
                    b = android.webkit.WebSettings.getDefaultUserAgent(com.applovin.impl.sdk.j.m());
                    com.applovin.impl.vj.b(com.applovin.impl.uj.K, b, com.applovin.impl.sdk.j.m());
                    com.applovin.impl.vj.b(com.applovin.impl.uj.L, android.os.Build.VERSION.RELEASE, com.applovin.impl.sdk.j.m());
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        } catch (java.lang.Throwable th2) {
            jVar.I();
            if (com.applovin.impl.sdk.n.a()) {
                jVar.I().a("WebViewDataCollector", "Failed to collect user agent", th2);
            }
            jVar.D().a("WebViewDataCollector", "collectUserAgent", th2);
        }
    }

    public static java.lang.String a() {
        java.lang.String str;
        synchronized (c) {
            str = b;
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e(com.applovin.impl.sdk.j jVar) {
        try {
            f(jVar);
            synchronized (c) {
                try {
                    b = f1342a.getSettings().getUserAgentString();
                    com.applovin.impl.vj.b(com.applovin.impl.uj.K, b, com.applovin.impl.sdk.j.m());
                    com.applovin.impl.vj.b(com.applovin.impl.uj.L, android.os.Build.VERSION.RELEASE, com.applovin.impl.sdk.j.m());
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        } catch (java.lang.Throwable th2) {
            jVar.I();
            if (com.applovin.impl.sdk.n.a()) {
                jVar.I().a("WebViewDataCollector", "Failed to collect user agent", th2);
            }
            jVar.D().a("WebViewDataCollector", "collectUserAgent", th2);
        }
    }

    public static boolean e() {
        boolean zEquals;
        synchronized (c) {
            zEquals = android.os.Build.VERSION.RELEASE.equals((java.lang.String) com.applovin.impl.vj.a(com.applovin.impl.uj.L, "", com.applovin.impl.sdk.j.m()));
        }
        return zEquals;
    }
}
