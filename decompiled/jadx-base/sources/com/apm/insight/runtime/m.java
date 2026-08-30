package com.apm.insight.runtime;

/* JADX INFO: compiled from: NpthCore.java */
/* JADX INFO: loaded from: classes3.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f486a = false;
    private static boolean b = false;
    private static boolean c = false;
    private static boolean d = false;
    private static boolean e = false;
    private static com.apm.insight.runtime.c f = new com.apm.insight.runtime.c();
    private static volatile boolean g = false;
    private static boolean h = false;

    static /* synthetic */ boolean r() {
        g = true;
        return true;
    }

    public static com.apm.insight.runtime.c a() {
        return f;
    }

    public static boolean b() {
        return b;
    }

    public static boolean c() {
        return c;
    }

    public static boolean d() {
        return d;
    }

    public static boolean e() {
        return f486a;
    }

    public static void f() {
        if (!f486a || b) {
            return;
        }
        android.content.Context contextG = com.apm.insight.e.g();
        com.apm.insight.g.a aVarA = com.apm.insight.g.a.a();
        aVarA.a(new com.apm.insight.i.b(contextG));
        aVarA.b(new com.apm.insight.g.d(contextG));
    }

    public static void g() {
        if (f486a) {
            com.apm.insight.b.f.a(com.apm.insight.e.g()).c();
            c = true;
        }
    }

    public static boolean h() {
        if (f486a && !d) {
            boolean zA = com.apm.insight.nativecrash.NativeImpl.a(com.apm.insight.e.g());
            d = zA;
            if (!zA) {
                e = true;
            }
        }
        return d;
    }

    public static synchronized void a(android.content.Context context) {
        android.app.Application applicationH;
        if (com.apm.insight.e.h() != null) {
            applicationH = com.apm.insight.e.h();
        } else if (context instanceof android.app.Application) {
            applicationH = (android.app.Application) context;
            if (applicationH.getBaseContext() == null) {
                throw new java.lang.IllegalArgumentException("The Application passed in when init has not been attached, please pass a attachBaseContext as param and call Npth.setApplication(Application) before init.");
            }
        } else {
            try {
                applicationH = (android.app.Application) context.getApplicationContext();
                if (applicationH == null) {
                    throw new java.lang.IllegalArgumentException("Can not get the Application instance since a baseContext was passed in when init, please call Npth.setApplication(Application) before init.");
                }
                if (applicationH.getBaseContext() != null) {
                    context = applicationH.getBaseContext();
                }
            } catch (java.lang.Throwable unused) {
                throw new java.lang.IllegalArgumentException("Can not get the Application instance since a baseContext was passed in when init, please call Npth.setApplication(Application) before init.");
            }
        }
        a(applicationH, context);
    }

    public static synchronized void a(android.app.Application application, android.content.Context context) {
        long jUptimeMillis = android.os.SystemClock.uptimeMillis();
        if (f486a) {
            return;
        }
        f486a = true;
        if (context == null || application == null) {
            throw new java.lang.IllegalArgumentException("context or Application must be not null.");
        }
        com.apm.insight.e.a(application, context);
        if (com.apm.insight.e.u() && (b(application) || c(application))) {
            android.util.Log.e("apminsight", "Inner npth checked.");
            return;
        }
        com.apm.insight.g.a aVarA = com.apm.insight.g.a.a();
        aVarA.a(new com.apm.insight.i.b(context));
        aVarA.b(new com.apm.insight.g.d(context));
        b = true;
        com.apm.insight.nativecrash.NativeImpl.a();
        boolean zA = com.apm.insight.nativecrash.NativeImpl.a(context);
        d = zA;
        if (!zA) {
            e = true;
        }
        if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
            g = true;
            com.apm.insight.nativecrash.NativeImpl.i();
        }
        com.apm.insight.runtime.n.a().a(new java.lang.Runnable() { // from class: com.apm.insight.runtime.m.2

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private /* synthetic */ boolean f488a = true;

            @Override // java.lang.Runnable
            public final void run() {
                if (!com.apm.insight.runtime.m.g) {
                    new android.os.Handler(android.os.Looper.getMainLooper()).post(new java.lang.Runnable() { // from class: com.apm.insight.runtime.m.2.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.apm.insight.runtime.m.r();
                            com.apm.insight.nativecrash.NativeImpl.i();
                        }
                    });
                }
                com.apm.insight.runtime.m.e(this.f488a);
            }
        }, 0L);
        com.apm.insight.a.a((java.lang.Object) ("Npth.init takes " + (android.os.SystemClock.uptimeMillis() - jUptimeMillis) + " ms."));
    }

    public static void a(final java.lang.String str, final com.apm.insight.b.h.a aVar) {
        com.apm.insight.runtime.n.a().a(new java.lang.Runnable() { // from class: com.apm.insight.runtime.m.1
            @Override // java.lang.Runnable
            public final void run() {
                if (com.apm.insight.l.a.c(com.apm.insight.e.g())) {
                    com.apm.insight.b.d.a(str, aVar);
                }
            }
        });
    }

    public static void a(com.apm.insight.b.h.a aVar) {
        com.apm.insight.runtime.i.a(aVar);
    }

    public static boolean i() {
        return com.apm.insight.b.c.c();
    }

    public static void a(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        com.apm.insight.d.a.a(str);
    }

    public static void a(java.lang.String str, java.util.Map<? extends java.lang.String, ? extends java.lang.String> map, java.util.Map<java.lang.String, java.lang.String> map2, com.apm.insight.b.h.a aVar) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        com.apm.insight.d.a.a(str, map, map2, aVar);
    }

    public static void a(java.lang.String str, java.util.Map<? extends java.lang.String, ? extends java.lang.String> map, java.util.Map<java.lang.String, java.lang.String> map2, java.util.Map<java.lang.String, java.lang.String> map3, com.apm.insight.b.h.a aVar) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        com.apm.insight.d.a.a(str, map, map2, map3, aVar);
    }

    @java.lang.Deprecated
    public static void a(java.lang.Throwable th) {
        if (com.apm.insight.e.i().isReportErrorEnable()) {
            com.apm.insight.g.a.a(th);
        }
    }

    @java.lang.Deprecated
    public static void b(java.lang.String str) {
        if (com.apm.insight.e.i().isReportErrorEnable()) {
            com.apm.insight.g.a.c(str);
        }
    }

    public static void j() {
        if (f486a) {
            com.apm.insight.b.f.a(com.apm.insight.e.g()).d();
            c = false;
        }
    }

    public static void b(com.apm.insight.b.h.a aVar) {
        com.apm.insight.k.e.a(aVar);
    }

    public static void a(java.lang.String str, com.apm.insight.b.i.a aVar, com.apm.insight.b.i.a aVar2) {
        if (android.text.TextUtils.isEmpty(str) || !new java.io.File(str).exists()) {
            return;
        }
        com.apm.insight.a.a.a().a(str, aVar, aVar2);
    }

    public static void k() {
        com.apm.insight.nativecrash.NativeImpl.c();
    }

    public static void a(long j) {
        com.apm.insight.nativecrash.NativeImpl.a(j);
    }

    public static void b(long j) {
        com.apm.insight.nativecrash.NativeImpl.b(j);
    }

    public static boolean l() {
        return com.apm.insight.g.a.b() || com.apm.insight.nativecrash.NativeImpl.e();
    }

    public static boolean m() {
        return com.apm.insight.g.a.c() || com.apm.insight.nativecrash.NativeImpl.e();
    }

    public static boolean n() {
        return com.apm.insight.g.a.b();
    }

    public static void c(java.lang.String str) {
        com.apm.insight.nativecrash.NativeImpl.b(str);
    }

    public static void a(com.apm.insight.b.i.a aVar) {
        com.apm.insight.e.i().setEncryptImpl$22f2d42e(aVar);
    }

    public static boolean o() {
        return h;
    }

    public static void p() {
        h = true;
    }

    public static void a(boolean z) {
        com.apm.insight.e.a(z);
    }

    public static void b(boolean z) {
        com.apm.insight.e.b(z);
    }

    public static void c(boolean z) {
        com.apm.insight.e.c(z);
    }

    public static void d(boolean z) {
        com.apm.insight.e.d(z);
    }

    private static boolean b(android.content.Context context) {
        try {
            return new java.io.File(com.apm.insight.l.j.j(context), "npth").exists();
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }

    private static boolean c(android.content.Context context) {
        try {
            return new java.io.File(context.getApplicationInfo().nativeLibraryDir, "libnpth.so").exists();
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }

    public static void a(com.apm.insight.ICrashCallback iCrashCallback, com.apm.insight.CrashType crashType) {
        f.a(iCrashCallback, crashType);
    }

    public static void a(com.apm.insight.IOOMCallback iOOMCallback) {
        f.a(iOOMCallback);
    }

    public static void b(com.apm.insight.ICrashCallback iCrashCallback, com.apm.insight.CrashType crashType) {
        f.b(iCrashCallback, crashType);
    }

    public static void b(com.apm.insight.IOOMCallback iOOMCallback) {
        f.b(iOOMCallback);
    }

    static /* synthetic */ void e(boolean z) {
        android.content.Context contextG = com.apm.insight.e.g();
        com.apm.insight.runtime.a.f.a();
        com.apm.insight.runtime.k.a();
        int iB = com.apm.insight.nativecrash.NativeImpl.b();
        com.apm.insight.nativecrash.NativeImpl.d();
        if (e) {
            com.apm.insight.c.a();
            com.apm.insight.b.a.a("NativeLibraryLoad faild");
        } else if (iB < 0) {
            com.apm.insight.c.a();
            com.apm.insight.b.a.a("createCallbackThread faild");
        }
        com.apm.insight.e.a.a().a(contextG);
        com.apm.insight.c.a();
        com.apm.insight.k.h.a(contextG);
        if (z) {
            com.apm.insight.b.f.a(contextG).c();
            c = z;
        }
        com.apm.insight.k.g.a().b();
        com.apm.insight.nativecrash.NativeImpl.g();
        com.apm.insight.k.j.d();
        com.apm.insight.nativecrash.NativeImpl.k();
        com.apm.insight.runtime.p.a("afterNpthInitAsync", "noValue");
    }
}
