package com.apm.insight.k;

/* JADX INFO: compiled from: ApmConfigFetcher.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static java.lang.Runnable f416a = new java.lang.Runnable() { // from class: com.apm.insight.k.a.1
        @Override // java.lang.Runnable
        public final void run() {
            if (com.apm.insight.l.k.b(com.apm.insight.e.g())) {
                com.apm.insight.k.a.i();
            }
            if (com.apm.insight.k.a.b > 0) {
                if (com.apm.insight.l.a.c(com.apm.insight.e.g())) {
                    com.apm.insight.runtime.n.a().a(com.apm.insight.k.a.f416a, androidx.media3.common.C.DEFAULT_SEEK_FORWARD_INCREMENT_MS);
                } else {
                    com.apm.insight.runtime.n.a().a(com.apm.insight.k.a.f416a, 60000L);
                }
            }
        }
    };
    private static int b = 0;

    public static boolean c() {
        return false;
    }

    public static void d() {
    }

    public static void a() {
        b = 40;
        com.apm.insight.runtime.n.a().a(f416a);
    }

    public static void b() {
        if (!com.apm.insight.k.j.b()) {
            com.apm.insight.k.j.c();
        }
        if (com.apm.insight.l.k.b(com.apm.insight.e.g()) && com.apm.insight.k.j.g()) {
            i();
        }
    }

    private static byte[] h() {
        try {
            return com.apm.insight.k.e.a(com.apm.insight.e.i().getConfigUrl(), com.apm.insight.entity.b.a().toString().getBytes());
        } catch (java.lang.Throwable th) {
            com.apm.insight.a.a(th);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void i() {
        int i = b;
        if (i > 0) {
            b = i - 1;
        }
        com.apm.insight.a.a((java.lang.Object) "try fetchApmConfig");
        if (com.apm.insight.l.a.c(com.apm.insight.e.g())) {
            org.json.JSONArray jSONArrayOptJSONArray = null;
            try {
                byte[] bArrH = h();
                if (bArrH != null) {
                    jSONArrayOptJSONArray = new org.json.JSONObject(new java.lang.String(bArrH)).optJSONArray("data");
                }
            } catch (java.lang.Throwable th) {
                if (com.apm.insight.e.i().isDebugMode()) {
                    android.util.Log.e("npth", "npth NPTH Catch Error", th);
                }
            }
            com.apm.insight.a.a((java.lang.Object) "after fetchApmConfig net ".concat(java.lang.String.valueOf(jSONArrayOptJSONArray)));
            if (jSONArrayOptJSONArray != null) {
                com.apm.insight.runtime.a.a(jSONArrayOptJSONArray, true);
                b = 0;
                return;
            } else {
                b -= 10;
                return;
            }
        }
        com.apm.insight.k.j.c();
        if (com.apm.insight.k.j.a()) {
            b = 0;
        }
    }
}
