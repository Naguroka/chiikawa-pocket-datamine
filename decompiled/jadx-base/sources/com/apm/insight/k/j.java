package com.apm.insight.k;

/* JADX INFO: compiled from: NpthConfigFetcher.java */
/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static java.io.File f437a = null;
    private static boolean b = false;
    private static boolean c = false;
    private static java.util.Map<java.lang.String, java.lang.String> d;

    static boolean a() {
        return b;
    }

    static boolean b() {
        return c;
    }

    static void c() {
        if (b) {
            return;
        }
        c = true;
        java.io.File file = new java.io.File(com.apm.insight.l.j.j(com.apm.insight.e.g()), "apminsight/configCrash/configFile");
        if (file.exists()) {
            try {
                com.apm.insight.runtime.a.a(new org.json.JSONArray(com.apm.insight.l.f.a(file, "\n")), false);
                b = true;
            } catch (java.lang.Throwable unused) {
                com.apm.insight.runtime.a.a((org.json.JSONArray) null, false);
            }
        }
    }

    public static void d() {
        c();
        if (g()) {
            com.apm.insight.k.a.a();
        }
    }

    public static void e() {
        com.apm.insight.runtime.n.a().a(new java.lang.Runnable() { // from class: com.apm.insight.k.j.1
            @Override // java.lang.Runnable
            public final void run() {
                if (com.apm.insight.k.j.g()) {
                    com.apm.insight.k.a.a();
                }
            }
        });
    }

    private static java.io.File h() {
        if (f437a == null) {
            f437a = new java.io.File(com.apm.insight.l.j.j(com.apm.insight.e.g()), "apminsight/configCrash/configInvalid");
        }
        return f437a;
    }

    public static void a(org.json.JSONArray jSONArray) {
        try {
            com.apm.insight.l.f.a(new java.io.File(com.apm.insight.l.j.j(com.apm.insight.e.g()), "apminsight/configCrash/configFile"), jSONArray);
        } catch (java.io.IOException unused) {
        }
        try {
            com.apm.insight.l.f.a(h(), d);
        } catch (java.lang.Throwable unused2) {
        }
    }

    public static void f() {
        java.util.Map<java.lang.String, java.lang.String> map = d;
        if (map != null) {
            map.clear();
        }
    }

    public static void a(java.lang.String str) {
        if (d == null) {
            d = new java.util.HashMap();
        }
        d.put(str, java.lang.String.valueOf(java.lang.System.currentTimeMillis()));
    }

    static boolean g() {
        java.io.File fileH = h();
        try {
            java.util.Map<java.lang.String, java.lang.String> mapC = d;
            if (mapC == null) {
                mapC = com.apm.insight.l.f.c(fileH);
            }
            d = mapC;
            if (mapC == null) {
                d = new java.util.HashMap();
                return true;
            }
            if (mapC.size() < com.apm.insight.entity.b.c()) {
                return true;
            }
            java.util.Iterator<java.lang.String> it = com.apm.insight.entity.b.d().iterator();
            while (it.hasNext()) {
                if (!d.containsKey(it.next())) {
                    return true;
                }
            }
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            boolean z = false;
            for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : d.entrySet()) {
                try {
                    if (jCurrentTimeMillis - java.lang.Long.decode(entry.getValue()).longValue() > com.apm.insight.runtime.d.d(entry.getKey())) {
                        z = true;
                    }
                } catch (java.lang.Throwable th) {
                    com.apm.insight.a.a(th);
                }
            }
            if (z) {
                com.apm.insight.a.a((java.lang.Object) "config should be updated");
            } else {
                com.apm.insight.a.a((java.lang.Object) "config should not be updated");
            }
            return z;
        } catch (java.lang.Throwable th2) {
            android.util.Log.e("npth", androidx.core.app.NotificationCompat.CATEGORY_ERROR, th2);
            return true;
        }
    }
}
