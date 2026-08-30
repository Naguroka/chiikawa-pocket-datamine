package com.pgl.ssdk.ces;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile com.pgl.ssdk.ces.b f3782a = null;
    private static boolean b = false;
    public static boolean c = false;
    private static java.util.Map<java.lang.String, java.lang.Object> d = null;
    private static int e = 1;
    private static com.pgl.ssdk.t0.a f;
    public android.content.Context h;
    private java.lang.String i;
    private int j;
    private java.lang.String k;
    private java.lang.String p;
    public boolean g = false;
    private java.lang.String l = null;
    private java.lang.String m = null;
    private java.lang.String n = null;
    private java.lang.String o = null;
    private boolean q = false;

    static class a implements java.lang.Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.pgl.ssdk.x.b(com.pgl.ssdk.x.b());
        }
    }

    /* JADX INFO: renamed from: com.pgl.ssdk.ces.b$b, reason: collision with other inner class name */
    class RunnableC0254b implements java.lang.Runnable {
        RunnableC0254b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.pgl.ssdk.j0.a(com.pgl.ssdk.ces.b.this.h).a();
            com.pgl.ssdk.i0.a(com.pgl.ssdk.ces.b.this.h).a();
        }
    }

    class c implements java.lang.Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.pgl.ssdk.z.b(com.pgl.ssdk.ces.b.this.h);
        }
    }

    private b(android.content.Context context, java.lang.String str) {
        this.h = context;
        this.i = str;
    }

    public static com.pgl.ssdk.ces.b a(android.content.Context context, java.lang.String str, int i, int i2, java.lang.String str2) {
        if (f3782a == null) {
            synchronized (com.pgl.ssdk.ces.b.class) {
                if (f3782a == null) {
                    if (context == null) {
                        context = com.pgl.ssdk.z.a().getApplicationContext();
                    }
                    if (context == null) {
                        e = 4;
                        return null;
                    }
                    a(i);
                    com.pgl.ssdk.t0.a aVarB = com.pgl.ssdk.t0.b(context, "nms");
                    if (aVarB != null) {
                        e = aVarB.f3809a;
                        f = aVarB;
                        return null;
                    }
                    com.pgl.ssdk.ces.b bVar = new com.pgl.ssdk.ces.b(context, str);
                    f3782a = bVar;
                    bVar.j = i2;
                    f3782a.k = str2;
                    f3782a.b(context);
                    f3782a.c(a(context));
                    com.pgl.ssdk.x.c(context);
                    e = 0;
                    com.pgl.ssdk.o0.b(new com.pgl.ssdk.ces.b.a());
                }
            }
        }
        return f3782a;
    }

    private void c(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        this.p = str;
        com.pgl.ssdk.ces.a.meta(104, null, str);
    }

    public static java.lang.String e() {
        if (h() != null) {
            return h().l;
        }
        return null;
    }

    public static int g() {
        return e;
    }

    public static com.pgl.ssdk.ces.b h() {
        return f3782a;
    }

    public static com.pgl.ssdk.t0.a i() {
        return f;
    }

    private void l() {
        com.pgl.ssdk.b1.a(this.h, this.i);
    }

    public void b() {
        java.util.Map<java.lang.String, java.lang.Object> map = d;
        if (map != null) {
            java.lang.Object obj = map.get(com.pgl.ssdk.ces.out.PglSSConfig.CUSTOMINFO_KEY_CHECKCLAZZ);
            if (obj instanceof java.lang.String) {
                java.lang.String strA = com.pgl.ssdk.g0.a((java.lang.String) obj);
                if (android.text.TextUtils.isEmpty(strA)) {
                    return;
                }
                com.pgl.ssdk.ces.a.meta(org.objectweb.asm.Opcodes.IF_ICMPEQ, null, strA);
            }
        }
    }

    public synchronized void d(java.lang.String str) {
        if (!android.text.TextUtils.isEmpty(str) && !str.equals(this.n)) {
            com.pgl.ssdk.ces.a.meta(112, null, str);
            this.n = str;
            com.pgl.ssdk.b1.c();
        }
    }

    public long f() {
        return com.pgl.ssdk.x.a(this.h);
    }

    public java.lang.String j() {
        return com.pgl.ssdk.x.c();
    }

    public java.lang.String k() {
        return com.pgl.ssdk.b1.b();
    }

    public void m() {
        this.q = true;
        com.pgl.ssdk.n0.b();
        l();
        a("CZL-L1st", (java.util.Map<java.lang.String, java.lang.Object>) null);
    }

    public void c() {
        com.pgl.ssdk.o0.b(new com.pgl.ssdk.ces.b.c());
    }

    public static java.lang.String d() {
        if (h() != null) {
            return h().i;
        }
        return null;
    }

    private void b(android.content.Context context) {
        if (context == null || b) {
            return;
        }
        try {
            com.pgl.ssdk.ces.a.meta(101, null, "1");
            com.pgl.ssdk.ces.a.meta(102, null, this.i);
            com.pgl.ssdk.ces.a.meta(114, null, java.lang.Integer.valueOf(this.j));
            com.pgl.ssdk.ces.a.meta(105, null, new java.lang.StringBuilder().append(com.pgl.ssdk.z.g(context)).toString());
            com.pgl.ssdk.ces.a.meta(106, null, com.pgl.ssdk.z.e(context));
            com.pgl.ssdk.ces.a.meta(107, null, com.pgl.ssdk.z.d(context));
            com.pgl.ssdk.ces.a.meta(108, null, com.pgl.ssdk.z.c(context));
            com.pgl.ssdk.ces.a.meta(109, null, com.pgl.ssdk.z.c());
            com.pgl.ssdk.ces.a.meta(110, null, com.pgl.ssdk.z.b());
            com.pgl.ssdk.ces.a.meta(115, null, this.k);
            b = true;
        } catch (java.lang.Throwable unused) {
        }
    }

    public synchronized void b(java.lang.String str) {
        if (!android.text.TextUtils.isEmpty(str) && !str.equals(this.o)) {
            com.pgl.ssdk.ces.a.meta(111, null, str);
            this.o = str;
            com.pgl.ssdk.b1.c();
        }
    }

    private static java.lang.String a(android.content.Context context) {
        java.lang.String strA = com.pgl.ssdk.u0.a(context, "iid");
        if (!android.text.TextUtils.isEmpty(strA)) {
            return strA;
        }
        java.lang.String string = java.util.UUID.randomUUID().toString();
        com.pgl.ssdk.u0.b(context, "iid", string);
        return string;
    }

    public synchronized void a(java.lang.String str) {
        if (!android.text.TextUtils.isEmpty(str) && !str.equals(this.l)) {
            com.pgl.ssdk.ces.a.meta(103, null, str);
            com.pgl.ssdk.b1.c();
            this.l = str;
        }
    }

    public void a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        this.l = str2;
        this.n = str3;
        this.m = str;
        com.pgl.ssdk.ces.a.meta(113, null, str);
        com.pgl.ssdk.ces.a.meta(112, null, str3);
        com.pgl.ssdk.ces.a.meta(103, null, str2);
        com.pgl.ssdk.ces.a.meta(111, null, str4);
        try {
            m();
        } catch (java.lang.Throwable unused) {
        }
    }

    public static void a(int i) {
        com.pgl.ssdk.l0.a(i);
    }

    public java.util.Map<java.lang.String, java.lang.String> a(java.lang.String str, byte[] bArr) {
        java.util.HashMap map = new java.util.HashMap();
        java.lang.Object[] objArr = new java.lang.Object[2];
        if (str == null) {
            str = "";
        }
        objArr[0] = str;
        if (bArr == null) {
            bArr = new byte[0];
        }
        objArr[1] = bArr;
        java.lang.String str2 = (java.lang.String) com.pgl.ssdk.ces.a.meta(224, this.h, objArr);
        if (!android.text.TextUtils.isEmpty(str2)) {
            map.put("X-Armors", str2);
        }
        return map;
    }

    public void a(java.lang.String str, java.util.Map<java.lang.String, java.lang.Object> map) {
        try {
            long j = "CZL-L1st".equals(str) ? 10000L : 0L;
            android.os.Handler handlerB = com.pgl.ssdk.o0.b();
            if (handlerB != null) {
                handlerB.postDelayed(new com.pgl.ssdk.ces.c(this.h, str, map), j);
            }
            a();
            com.pgl.ssdk.x.a();
        } catch (java.lang.Throwable unused) {
        }
    }

    public java.lang.Object a(int i, java.lang.Object obj) {
        if (i == 123) {
            return com.pgl.ssdk.d0.a(this.h);
        }
        if (i == 121) {
            return com.pgl.ssdk.b0.a();
        }
        if (i == 122) {
            return com.pgl.ssdk.b0.b();
        }
        if (i == 126) {
            return com.pgl.ssdk.b0.b(this.h);
        }
        if (i == 128) {
            return com.pgl.ssdk.b0.c(this.h);
        }
        if (i == 120) {
            return com.pgl.ssdk.a0.c();
        }
        if (i == 124) {
            return com.pgl.ssdk.e0.c(this.h);
        }
        if (i == 130) {
            return com.pgl.ssdk.e0.a(this.h);
        }
        if (i == 145) {
            return com.pgl.ssdk.f0.b(this.h);
        }
        if (i == 125) {
            return com.pgl.ssdk.e0.b(this.h);
        }
        if (i == 129) {
            return com.pgl.ssdk.c0.e(this.h);
        }
        if (i == 141) {
            return com.pgl.ssdk.c0.d(this.h);
        }
        if (i == 131) {
            return com.pgl.ssdk.b1.a();
        }
        if (i == 134) {
            return com.pgl.ssdk.j0.a(this.h).b();
        }
        if (i == 140) {
            return com.pgl.ssdk.i0.a(this.h).e();
        }
        if (i == 144) {
            return com.pgl.ssdk.i0.a(this.h).d();
        }
        java.lang.String string = null;
        if (i == 133) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry : d.entrySet()) {
                    if (entry.getValue() == null) {
                        jSONObject.put(entry.getKey(), "");
                    } else {
                        jSONObject.put(entry.getKey(), entry.getValue());
                    }
                }
                string = jSONObject.toString();
            } catch (java.lang.Throwable unused) {
            }
            return string == null ? com.applovin.impl.sdk.utils.JsonUtils.EMPTY_JSON : string.trim();
        }
        if (i == 135) {
            return com.pgl.ssdk.t.f();
        }
        if (i == 201) {
            return com.pgl.ssdk.b0.a(this.h);
        }
        if (i == 202) {
            return com.pgl.ssdk.b0.c();
        }
        if (i == 236) {
            return com.pgl.ssdk.v0.a((java.lang.String) obj);
        }
        if (i == 142) {
            return com.pgl.ssdk.z.f(this.h);
        }
        if (i == 143) {
            return com.pgl.ssdk.f0.a(this.h);
        }
        if (i == 146) {
            try {
                return com.pgl.ssdk.t.b();
            } catch (java.lang.Throwable unused2) {
                return null;
            }
        }
        if (i == 147) {
            return java.lang.Boolean.valueOf(com.pgl.ssdk.z.h(this.h));
        }
        if (i == 148) {
            return com.pgl.ssdk.s.b(this.h);
        }
        if (i == 149) {
            return com.pgl.ssdk.u.a(this.h);
        }
        if (i == 150) {
            return java.lang.Integer.valueOf(com.pgl.ssdk.v.a());
        }
        if (i == 151) {
            return com.pgl.ssdk.u.c();
        }
        if (i == 161) {
            return java.lang.Boolean.valueOf(com.pgl.ssdk.t.g());
        }
        if (i == 163) {
            return com.pgl.ssdk.h0.a();
        }
        return null;
    }

    public void a(android.view.MotionEvent motionEvent) {
        com.pgl.ssdk.w.a(motionEvent, this.h);
    }

    public void a(java.util.Map<java.lang.String, java.lang.Object> map) {
        if (map != null) {
            d = map;
        }
    }

    public void a() {
        com.pgl.ssdk.o0.b(new com.pgl.ssdk.ces.b.RunnableC0254b());
    }
}
