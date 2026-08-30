package com.apm.insight;

/* JADX INFO: compiled from: NpthBus.java */
/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static android.content.Context f387a = null;
    private static android.app.Application b = null;
    private static long c = 0;
    private static java.lang.String d = "default";
    private static boolean e = false;
    private static com.apm.insight.nativecrash.b f;
    private static volatile java.util.concurrent.ConcurrentHashMap<java.lang.Integer, java.lang.String> i;
    private static volatile java.lang.String n;
    private static com.apm.insight.runtime.ConfigManager g = new com.apm.insight.runtime.ConfigManager();
    private static com.apm.insight.a h = new com.apm.insight.a();
    private static com.apm.insight.runtime.h j = null;
    private static volatile java.lang.String k = null;
    private static java.lang.Object l = new java.lang.Object();
    private static volatile int m = 0;
    private static int o = 0;
    private static boolean p = true;
    private static boolean q = true;
    private static boolean r = false;
    private static boolean s = true;

    public static com.apm.insight.nativecrash.b a() {
        if (f == null) {
            f = com.apm.insight.runtime.h.a(f387a);
        }
        return f;
    }

    public static void a(com.apm.insight.nativecrash.b bVar) {
        f = bVar;
    }

    public static com.apm.insight.a b() {
        return h;
    }

    public static com.apm.insight.runtime.h c() {
        if (j == null) {
            synchronized (com.apm.insight.e.class) {
                j = new com.apm.insight.runtime.h();
            }
        }
        return j;
    }

    public static void a(android.app.Application application) {
        if (application != null) {
            b = application;
        }
    }

    public static void a(android.app.Application application, android.content.Context context) {
        if (b == null) {
            c = java.lang.System.currentTimeMillis();
            f387a = context;
            b = application;
            k = java.lang.Long.toHexString(new java.util.Random().nextLong()) + com.google.android.gms.ads.RequestConfiguration.MAX_AD_CONTENT_RATING_G;
        }
    }

    static void a(android.app.Application application, android.content.Context context, com.apm.insight.ICommonParams iCommonParams) {
        a(application, context);
        f = new com.apm.insight.nativecrash.b(f387a, iCommonParams, a());
    }

    public static java.lang.String e() {
        return f() + '_' + java.lang.Long.toHexString(new java.util.Random().nextLong()) + com.google.android.gms.ads.RequestConfiguration.MAX_AD_CONTENT_RATING_G;
    }

    public static java.lang.String a(long j2, com.apm.insight.CrashType crashType, boolean z, boolean z2) {
        return j2 + "_" + crashType.getName() + '_' + f() + '_' + (z ? "oom_" : "normal_") + c + '_' + (z2 ? "ignore_" : "normal_") + java.lang.Long.toHexString(new java.util.Random().nextLong()) + com.google.android.gms.ads.RequestConfiguration.MAX_AD_CONTENT_RATING_G;
    }

    public static java.lang.String f() {
        if (k == null) {
            synchronized (l) {
                if (k == null) {
                    k = java.lang.Long.toHexString(new java.util.Random().nextLong()) + "U";
                }
            }
        }
        return k;
    }

    public static android.content.Context g() {
        return f387a;
    }

    public static android.app.Application h() {
        return b;
    }

    public static com.apm.insight.runtime.ConfigManager i() {
        return g;
    }

    public static long j() {
        return c;
    }

    public static java.lang.String k() {
        return d;
    }

    static void a(java.lang.String str) {
        d = str;
    }

    public static void l() {
        o = 1;
    }

    public static int m() {
        return o;
    }

    public static boolean n() {
        return e;
    }

    static void o() {
        e = true;
    }

    static void a(int i2, java.lang.String str) {
        if (i == null) {
            synchronized (com.apm.insight.e.class) {
                if (i == null) {
                    i = new java.util.concurrent.ConcurrentHashMap<>();
                }
            }
        }
        i.put(java.lang.Integer.valueOf(i2), str);
    }

    public static java.util.concurrent.ConcurrentHashMap<java.lang.Integer, java.lang.String> p() {
        return i;
    }

    static void b(int i2, java.lang.String str) {
        m = i2;
        n = str;
    }

    public static int q() {
        return m;
    }

    public static java.lang.String r() {
        return n;
    }

    public static void a(boolean z) {
        p = z;
    }

    public static void b(boolean z) {
        q = z;
    }

    public static void c(boolean z) {
        r = z;
    }

    public static void d(boolean z) {
        s = z;
    }

    public static boolean s() {
        return p;
    }

    public static boolean t() {
        return q;
    }

    public static boolean u() {
        return r;
    }

    public static boolean v() {
        return s;
    }

    public static boolean d() {
        if (!g.isDebugMode()) {
            return false;
        }
        java.lang.Object obj = a().a().get("channel");
        return (obj == null ? "unknown" : java.lang.String.valueOf(obj)).contains("local_test");
    }
}
