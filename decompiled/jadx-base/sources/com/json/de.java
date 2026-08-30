package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class de {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.json.Cif f2582a;
    private final java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object> b;
    private final java.util.concurrent.atomic.AtomicBoolean c;
    private final java.util.concurrent.atomic.AtomicBoolean d;

    class a implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.content.Context f2583a;

        a(android.content.Context context) {
            this.f2583a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                com.json.de.this.e(this.f2583a);
            } catch (java.lang.Exception e) {
                com.json.l9.d().a(e);
                com.json.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
            }
            com.json.de.this.c.set(false);
        }
    }

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static volatile com.json.de f2584a = new com.json.de(null);

        private b() {
        }
    }

    private de() {
        this.c = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.d = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f2582a = com.json.im.S().f();
        this.b = new java.util.concurrent.ConcurrentHashMap<>();
    }

    /* synthetic */ de(com.ironsource.de.a aVar) {
        this();
    }

    private java.util.Map<java.lang.String, java.lang.Object> a() {
        java.util.HashMap map = new java.util.HashMap();
        java.util.HashMap map2 = new java.util.HashMap();
        com.json.vh vhVarK = com.json.im.S().k();
        map2.put(com.json.ce.y0, java.lang.Integer.valueOf(vhVarK.a(com.unity3d.mediation.LevelPlay.AdFormat.INTERSTITIAL)));
        map.put("interstitial", map2);
        java.util.HashMap map3 = new java.util.HashMap();
        map3.put(com.json.ce.y0, java.lang.Integer.valueOf(vhVarK.a(com.unity3d.mediation.LevelPlay.AdFormat.REWARDED)));
        map.put(com.json.ce.v0, map3);
        java.util.HashMap map4 = new java.util.HashMap();
        map4.put(com.json.ce.y0, java.lang.Integer.valueOf(vhVarK.a(com.unity3d.mediation.LevelPlay.AdFormat.BANNER)));
        map.put("banner", map4);
        java.util.HashMap map5 = new java.util.HashMap();
        map5.put(com.json.ce.y0, java.lang.Integer.valueOf(vhVarK.a(com.unity3d.mediation.LevelPlay.AdFormat.NATIVE_AD)));
        map.put("nativeAd", map5);
        return map;
    }

    private void a(android.content.Context context) {
        if (this.c.get()) {
            return;
        }
        try {
            this.c.set(true);
            com.json.environment.thread.IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new com.ironsource.de.a(context));
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
            this.c.set(false);
        }
    }

    private void a(java.lang.String str, java.lang.Object obj) {
        if (str == null || obj == null) {
            return;
        }
        try {
            if (obj instanceof java.lang.Boolean) {
                obj = java.lang.Integer.valueOf(((java.lang.Boolean) obj).booleanValue() ? 1 : 0);
            }
            this.b.put(str, obj);
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
        }
    }

    private boolean a(java.lang.String str) {
        if (str == null) {
            return false;
        }
        try {
            return this.b.containsKey(str);
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
            return false;
        }
    }

    static com.json.de b() {
        return com.ironsource.de.b.f2584a;
    }

    private void d(android.content.Context context) {
        if (context == null || this.d.getAndSet(true)) {
            return;
        }
        a("auid", this.f2582a.s(context));
        a(com.json.ce.v, this.f2582a.e());
        a(com.json.ce.r, this.f2582a.g());
        a(com.json.ce.y, this.f2582a.l());
        java.lang.String strO = this.f2582a.o();
        if (strO != null) {
            a(com.json.ce.z, strO.replaceAll("[^0-9/.]", ""));
            a(com.json.ce.C, strO);
        }
        a(com.json.ce.f2557a, java.lang.String.valueOf(this.f2582a.k()));
        java.lang.String strJ = this.f2582a.j(context);
        if (!android.text.TextUtils.isEmpty(strJ)) {
            a(com.json.ce.F0, strJ);
        }
        java.lang.String strE = com.json.z3.e(context);
        if (!android.text.TextUtils.isEmpty(strE)) {
            a(com.json.ce.o, strE);
        }
        java.lang.String strI = this.f2582a.i(context);
        if (!android.text.TextUtils.isEmpty(strI)) {
            a(com.json.ce.l0, strI);
        }
        a(com.json.ce.f, context.getPackageName());
        a(com.json.ce.t, java.lang.String.valueOf(this.f2582a.h(context)));
        a(com.json.ce.S, com.json.ce.Z);
        a(com.json.ce.T, java.lang.Long.valueOf(com.json.z3.f(context)));
        a(com.json.ce.R, java.lang.Long.valueOf(com.json.z3.d(context)));
        a(com.json.ce.d, com.json.z3.b(context));
        a(com.json.ce.F, java.lang.Integer.valueOf(com.json.u8.f(context)));
        a(com.json.ce.P, com.json.u8.g(context));
        a("stid", com.json.zo.c(context));
        a(com.json.ce.A, "android");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(android.content.Context context) {
        if (context == null) {
            return;
        }
        try {
            java.lang.String strP = this.f2582a.p(context);
            if (!android.text.TextUtils.isEmpty(strP)) {
                a(com.json.ce.K0, strP);
            }
            java.lang.String strA = this.f2582a.a(context);
            if (android.text.TextUtils.isEmpty(strA)) {
                return;
            }
            a(com.json.ce.q, java.lang.Boolean.valueOf(java.lang.Boolean.parseBoolean(strA)));
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
        }
    }

    private void f(android.content.Context context) {
        if (context == null) {
            return;
        }
        a(context);
        java.lang.String strE = this.f2582a.E(context);
        if (!android.text.TextUtils.isEmpty(strE)) {
            a(com.json.ce.A0, strE);
        } else if (a(com.json.ce.A0)) {
            b(com.json.ce.A0);
        }
        a("idfi", this.f2582a.v(context));
        java.lang.String strB = this.f2582a.b(context);
        if (!android.text.TextUtils.isEmpty(strB)) {
            a(com.json.ce.p, strB.toUpperCase(java.util.Locale.getDefault()));
        }
        java.lang.String strB2 = this.f2582a.b();
        if (!android.text.TextUtils.isEmpty(strB2)) {
            a("tz", strB2);
        }
        java.lang.String strB3 = com.json.v8.b(context);
        if (!android.text.TextUtils.isEmpty(strB3) && !strB3.equals("none")) {
            a(com.json.ce.j, strB3);
        }
        java.lang.String strD = com.json.v8.d(context);
        if (!android.text.TextUtils.isEmpty(strD)) {
            a(com.json.ce.k, strD);
        }
        a("vpn", java.lang.Boolean.valueOf(com.json.v8.e(context)));
        java.lang.String strN = this.f2582a.n(context);
        if (!android.text.TextUtils.isEmpty(strN)) {
            a("icc", strN);
        }
        int iZ = this.f2582a.z(context);
        if (iZ >= 0) {
            a(com.json.ce.Z0, java.lang.Integer.valueOf(iZ));
        }
        a(com.json.ce.a1, this.f2582a.B(context));
        a(com.json.ce.b1, this.f2582a.I(context));
        a(com.json.ce.X, java.lang.Float.valueOf(this.f2582a.m(context)));
        a(com.json.ce.m, java.lang.String.valueOf(this.f2582a.n()));
        a(com.json.ce.I, java.lang.Integer.valueOf(this.f2582a.d()));
        a(com.json.ce.H, java.lang.Integer.valueOf(this.f2582a.j()));
        a(com.json.ce.N0, java.lang.String.valueOf(this.f2582a.i()));
        a(com.json.ce.W0, java.lang.String.valueOf(this.f2582a.p()));
        a("mcc", java.lang.Integer.valueOf(com.json.u8.b(context)));
        a("mnc", java.lang.Integer.valueOf(com.json.u8.c(context)));
        a(com.json.ce.K, java.lang.Boolean.valueOf(this.f2582a.c()));
        a(com.json.ce.g, java.lang.Boolean.valueOf(this.f2582a.H(context)));
        a(com.json.ce.h, java.lang.Integer.valueOf(this.f2582a.l(context)));
        a(com.json.ce.b, java.lang.Boolean.valueOf(this.f2582a.c(context)));
        a(com.json.ce.D, java.lang.Boolean.valueOf(this.f2582a.d(context)));
        a("rt", java.lang.Boolean.valueOf(this.f2582a.f()));
        a(com.json.ce.Q, java.lang.String.valueOf(this.f2582a.h()));
        a(com.json.ce.e, java.lang.Integer.valueOf(this.f2582a.x(context)));
        a(com.json.ce.O0, java.lang.Boolean.valueOf(this.f2582a.q(context)));
        a(com.json.ce.c, this.f2582a.f(context));
        a(com.json.ce.U, this.f2582a.s());
        a(com.json.ce.t0, a());
    }

    protected void a(java.lang.String str, org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            java.lang.Object obj = this.b.get(str);
            if (!(obj instanceof org.json.JSONObject)) {
                a(str, (java.lang.Object) jSONObject);
                return;
            }
            org.json.JSONObject jSONObject2 = (org.json.JSONObject) obj;
            java.util.Iterator<java.lang.String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                java.lang.String next = itKeys.next();
                jSONObject2.putOpt(next, jSONObject.opt(next));
            }
            a(str, (java.lang.Object) jSONObject2);
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
        }
    }

    protected void a(java.util.Map<java.lang.String, java.lang.Object> map) {
        if (map == null) {
            return;
        }
        try {
            for (java.lang.String str : map.keySet()) {
                if (map.containsKey(str)) {
                    a(str, map.get(str));
                }
            }
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
        }
    }

    protected org.json.JSONObject b(android.content.Context context) throws org.json.JSONException {
        f(context);
        return new org.json.JSONObject(com.json.fe.a(this.b));
    }

    protected void b(java.lang.String str) {
        if (str == null) {
            return;
        }
        try {
            this.b.remove(str);
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
        }
    }

    protected void b(java.lang.String str, java.lang.Object obj) {
        a(str, obj);
    }

    protected void c(android.content.Context context) {
        try {
            d(context);
            f(context);
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
        }
    }
}
