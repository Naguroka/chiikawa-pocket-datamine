package com.apm.insight.runtime.a;

/* JADX INFO: compiled from: ActivityDataManager.java */
/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f465a = true;
    private static boolean b = false;
    private static boolean c = false;
    private static int d = 1;
    private static boolean e = false;
    private static long f = -1;
    private static volatile com.apm.insight.runtime.a.b z;
    private int B;
    private android.app.Application g;
    private android.content.Context h;
    private java.lang.String n;
    private long o;
    private java.lang.String p;
    private long q;
    private java.lang.String r;
    private long s;
    private java.lang.String t;
    private long u;
    private java.lang.String v;
    private long w;
    private java.util.List<java.lang.String> i = new java.util.ArrayList();
    private java.util.List<java.lang.Long> j = new java.util.ArrayList();
    private java.util.List<java.lang.String> k = new java.util.ArrayList();
    private java.util.List<java.lang.Long> l = new java.util.ArrayList();
    private java.util.LinkedList<com.apm.insight.runtime.a.b.a> m = new java.util.LinkedList<>();
    private boolean x = false;
    private long y = -1;
    private int A = 50;

    static /* synthetic */ int g(com.apm.insight.runtime.a.b bVar) {
        int i = bVar.B;
        bVar.B = i + 1;
        return i;
    }

    static /* synthetic */ boolean k() {
        f465a = false;
        return false;
    }

    static /* synthetic */ int l(com.apm.insight.runtime.a.b bVar) {
        int i = bVar.B;
        bVar.B = i - 1;
        return i;
    }

    static /* synthetic */ int n(com.apm.insight.runtime.a.b bVar) {
        bVar.B = 0;
        return 0;
    }

    private b(android.app.Application application) {
        this.h = application;
        this.g = application;
        try {
            if (this.g != null) {
                this.g.registerActivityLifecycleCallbacks(new android.app.Application.ActivityLifecycleCallbacks() { // from class: com.apm.insight.runtime.a.b.1
                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
                        com.apm.insight.runtime.a.b.this.n = activity.getClass().getName();
                        com.apm.insight.runtime.a.b.this.o = java.lang.System.currentTimeMillis();
                        boolean unused = com.apm.insight.runtime.a.b.b = bundle != null;
                        boolean unused2 = com.apm.insight.runtime.a.b.c = true;
                        com.apm.insight.runtime.a.b.this.i.add(com.apm.insight.runtime.a.b.this.n);
                        com.apm.insight.runtime.a.b.this.j.add(java.lang.Long.valueOf(com.apm.insight.runtime.a.b.this.o));
                        com.apm.insight.runtime.a.b bVar = com.apm.insight.runtime.a.b.this;
                        com.apm.insight.runtime.a.b.a(bVar, bVar.n, com.apm.insight.runtime.a.b.this.o, "onCreate");
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityStarted(android.app.Activity activity) {
                        com.apm.insight.runtime.a.b.this.p = activity.getClass().getName();
                        com.apm.insight.runtime.a.b.this.q = java.lang.System.currentTimeMillis();
                        com.apm.insight.runtime.a.b bVar = com.apm.insight.runtime.a.b.this;
                        com.apm.insight.runtime.a.b.a(bVar, bVar.p, com.apm.insight.runtime.a.b.this.q, "onStart");
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityResumed(android.app.Activity activity) {
                        com.apm.insight.runtime.a.b.this.r = activity.getClass().getName();
                        com.apm.insight.runtime.a.b.this.s = java.lang.System.currentTimeMillis();
                        com.apm.insight.runtime.a.b.g(com.apm.insight.runtime.a.b.this);
                        if (!com.apm.insight.runtime.a.b.this.x) {
                            if (com.apm.insight.runtime.a.b.f465a) {
                                com.apm.insight.runtime.a.b.k();
                                int unused = com.apm.insight.runtime.a.b.d = 1;
                                long unused2 = com.apm.insight.runtime.a.b.f = com.apm.insight.runtime.a.b.this.s;
                            }
                            if (!com.apm.insight.runtime.a.b.this.r.equals(com.apm.insight.runtime.a.b.this.t)) {
                                return;
                            }
                            if (!com.apm.insight.runtime.a.b.c || com.apm.insight.runtime.a.b.b) {
                                if (!com.apm.insight.runtime.a.b.c) {
                                    int unused3 = com.apm.insight.runtime.a.b.d = 3;
                                    long unused4 = com.apm.insight.runtime.a.b.f = com.apm.insight.runtime.a.b.this.s;
                                    return;
                                }
                            } else {
                                int unused5 = com.apm.insight.runtime.a.b.d = 4;
                                long unused6 = com.apm.insight.runtime.a.b.f = com.apm.insight.runtime.a.b.this.s;
                                return;
                            }
                        }
                        com.apm.insight.runtime.a.b.this.x = true;
                        com.apm.insight.runtime.a.b bVar = com.apm.insight.runtime.a.b.this;
                        com.apm.insight.runtime.a.b.a(bVar, bVar.r, com.apm.insight.runtime.a.b.this.s, com.ironsource.y8.h.u0);
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityPaused(android.app.Activity activity) {
                        com.apm.insight.runtime.a.b.this.t = activity.getClass().getName();
                        com.apm.insight.runtime.a.b.this.u = java.lang.System.currentTimeMillis();
                        com.apm.insight.runtime.a.b.l(com.apm.insight.runtime.a.b.this);
                        if (com.apm.insight.runtime.a.b.this.B == 0) {
                            com.apm.insight.runtime.a.b.this.x = false;
                            boolean unused = com.apm.insight.runtime.a.b.c = false;
                            com.apm.insight.runtime.a.b.this.y = android.os.SystemClock.uptimeMillis();
                        } else if (com.apm.insight.runtime.a.b.this.B < 0) {
                            com.apm.insight.runtime.a.b.n(com.apm.insight.runtime.a.b.this);
                            com.apm.insight.runtime.a.b.this.x = false;
                            boolean unused2 = com.apm.insight.runtime.a.b.c = false;
                            com.apm.insight.runtime.a.b.this.y = android.os.SystemClock.uptimeMillis();
                        }
                        com.apm.insight.runtime.a.b bVar = com.apm.insight.runtime.a.b.this;
                        com.apm.insight.runtime.a.b.a(bVar, bVar.t, com.apm.insight.runtime.a.b.this.u, com.ironsource.y8.h.t0);
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityStopped(android.app.Activity activity) {
                        com.apm.insight.runtime.a.b.this.v = activity.getClass().getName();
                        com.apm.insight.runtime.a.b.this.w = java.lang.System.currentTimeMillis();
                        com.apm.insight.runtime.a.b bVar = com.apm.insight.runtime.a.b.this;
                        com.apm.insight.runtime.a.b.a(bVar, bVar.v, com.apm.insight.runtime.a.b.this.w, "onStop");
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityDestroyed(android.app.Activity activity) {
                        java.lang.String name = activity.getClass().getName();
                        int iIndexOf = com.apm.insight.runtime.a.b.this.i.indexOf(name);
                        if (iIndexOf >= 0 && iIndexOf < com.apm.insight.runtime.a.b.this.i.size()) {
                            com.apm.insight.runtime.a.b.this.i.remove(iIndexOf);
                            com.apm.insight.runtime.a.b.this.j.remove(iIndexOf);
                        }
                        com.apm.insight.runtime.a.b.this.k.add(name);
                        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                        com.apm.insight.runtime.a.b.this.l.add(java.lang.Long.valueOf(jCurrentTimeMillis));
                        com.apm.insight.runtime.a.b.a(com.apm.insight.runtime.a.b.this, name, jCurrentTimeMillis, "onDestroy");
                    }
                });
            }
        } catch (java.lang.Throwable unused) {
        }
    }

    public static void a() {
        e = true;
    }

    public static int b() {
        int i = d;
        if (i == 1) {
            return e ? 2 : 1;
        }
        return i;
    }

    public static long c() {
        return f;
    }

    public static com.apm.insight.runtime.a.b d() {
        if (z == null) {
            synchronized (com.apm.insight.runtime.a.b.class) {
                if (z == null) {
                    z = new com.apm.insight.runtime.a.b(com.apm.insight.e.h());
                }
            }
        }
        return z;
    }

    public final long e() {
        return android.os.SystemClock.uptimeMillis() - this.y;
    }

    public final boolean f() {
        return this.x;
    }

    private org.json.JSONArray n() {
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.List<java.lang.String> list = this.i;
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < this.i.size(); i++) {
                try {
                    jSONArray.put(a(this.i.get(i), this.j.get(i).longValue()));
                } catch (java.lang.Throwable unused) {
                }
            }
        }
        return jSONArray;
    }

    private org.json.JSONArray o() {
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.List<java.lang.String> list = this.k;
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < this.k.size(); i++) {
                try {
                    jSONArray.put(a(this.k.get(i), this.l.get(i).longValue()));
                } catch (java.lang.Throwable unused) {
                }
            }
        }
        return jSONArray;
    }

    private static org.json.JSONObject a(java.lang.String str, long j) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("name", str);
            jSONObject.put("time", j);
        } catch (org.json.JSONException unused) {
        }
        return jSONObject;
    }

    public final org.json.JSONObject g() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("last_create_activity", a(this.n, this.o));
            jSONObject.put("last_start_activity", a(this.p, this.q));
            jSONObject.put("last_resume_activity", a(this.r, this.s));
            jSONObject.put("last_pause_activity", a(this.t, this.u));
            jSONObject.put("last_stop_activity", a(this.v, this.w));
            jSONObject.put("alive_activities", n());
            jSONObject.put("finish_activities", o());
        } catch (org.json.JSONException unused) {
        }
        return jSONObject;
    }

    public final java.lang.String h() {
        return java.lang.String.valueOf(this.r);
    }

    public final org.json.JSONArray i() {
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.Iterator it = new java.util.ArrayList(this.m).iterator();
        while (it.hasNext()) {
            jSONArray.put(((com.apm.insight.runtime.a.b.a) it.next()).toString());
        }
        return jSONArray;
    }

    /* JADX INFO: compiled from: ActivityDataManager.java */
    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        java.lang.String f467a;
        java.lang.String b;
        long c;

        a(java.lang.String str, java.lang.String str2, long j) {
            this.b = str2;
            this.c = j;
            this.f467a = str;
        }

        public final java.lang.String toString() {
            return com.apm.insight.l.b.a().format(new java.util.Date(this.c)) + " : " + this.f467a + ' ' + this.b;
        }
    }

    static /* synthetic */ void a(com.apm.insight.runtime.a.b bVar, java.lang.String str, long j, java.lang.String str2) {
        com.apm.insight.runtime.a.b.a aVar;
        try {
            if (bVar.m.size() >= bVar.A) {
                aVar = bVar.m.poll();
                if (aVar != null) {
                    bVar.m.add(aVar);
                }
            } else {
                aVar = null;
            }
            if (aVar == null) {
                aVar = new com.apm.insight.runtime.a.b.a(str, str2, j);
                bVar.m.add(aVar);
            }
            aVar.b = str2;
            aVar.f467a = str;
            aVar.c = j;
        } catch (java.lang.Throwable unused) {
        }
    }
}
