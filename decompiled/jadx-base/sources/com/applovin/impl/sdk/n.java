package com.applovin.impl.sdk;

/* JADX INFO: loaded from: classes3.dex */
public class n {
    private static boolean b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.j f1305a;

    n(com.applovin.impl.sdk.j jVar) {
        this.f1305a = jVar;
        a("SDK Session Begin");
    }

    public static void a(boolean z) {
        b = z;
    }

    public static void c(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        if (!b || a()) {
            android.util.Log.e("AppLovinSdk", com.ironsource.y8.i.d + str + "] " + str2, th);
        }
    }

    public static void e(java.lang.String str, java.lang.String str2) {
        g(str, str2);
    }

    public static void g(java.lang.String str, java.lang.String str2) {
        if (!b || a()) {
            android.util.Log.d("AppLovinSdk", com.ironsource.y8.i.d + str + "] " + str2);
        }
    }

    public static void h(java.lang.String str, java.lang.String str2) {
        c(str, str2, null);
    }

    public static void i(java.lang.String str, java.lang.String str2) {
        if (!b || a()) {
            android.util.Log.i("AppLovinSdk", com.ironsource.y8.i.d + str + "] " + str2);
        }
    }

    public static void j(java.lang.String str, java.lang.String str2) {
        if (!b || a()) {
            android.util.Log.w("AppLovinSdk", com.ironsource.y8.i.d + str + "] " + str2);
        }
    }

    public static void l(java.lang.String str, java.lang.String str2) {
        com.applovin.impl.sdk.j jVar = com.applovin.impl.sdk.j.u0;
        if (jVar == null) {
            return;
        }
        jVar.I();
        if (a()) {
            com.applovin.impl.sdk.j.u0.I().k(str, str2);
        }
    }

    public void b(java.lang.String str, java.lang.String str2) {
        a(str, str2, null);
    }

    public void d(java.lang.String str, java.lang.String str2) {
        android.util.Log.i("AppLovinSdk", com.ironsource.y8.i.d + str + "] " + str2);
    }

    public void f(java.lang.String str, java.lang.String str2) {
        int iIntValue;
        if (a(this.f1305a) && !android.text.TextUtils.isEmpty(str2) && (iIntValue = ((java.lang.Integer) this.f1305a.a(com.applovin.impl.sj.t)).intValue()) > 0) {
            int length = str2.length();
            int i = ((length + iIntValue) - 1) / iIntValue;
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = i2 * iIntValue;
                a(str, str2.substring(i3, java.lang.Math.min(length, i3 + iIntValue)));
            }
        }
    }

    public void k(java.lang.String str, java.lang.String str2) {
        d(str, str2, null);
    }

    private void a(java.lang.String str) {
        com.applovin.impl.pc pcVar = new com.applovin.impl.pc();
        pcVar.a().a(str).a();
        g("AppLovinSdk", pcVar.toString());
    }

    public static void b(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        com.applovin.impl.sdk.j jVar = com.applovin.impl.sdk.j.u0;
        if (jVar == null) {
            return;
        }
        jVar.I();
        if (a()) {
            com.applovin.impl.sdk.j.u0.I().a(str, str2, th);
        }
    }

    public void d(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        android.util.Log.w("AppLovinSdk", com.ironsource.y8.i.d + str + "] " + str2, th);
    }

    public static void c(java.lang.String str, java.lang.String str2) {
        b(str, str2, null);
    }

    public void a(java.lang.String str, java.lang.Throwable th) {
        if (com.applovin.impl.z3.e()) {
            for (java.lang.Throwable th2 : th.getSuppressed()) {
                b(str, th2.toString());
            }
        }
    }

    public void a(java.lang.String str, java.lang.String str2) {
        android.util.Log.d("AppLovinSdk", com.ironsource.y8.i.d + str + "] " + str2);
    }

    public void a(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        android.util.Log.e("AppLovinSdk", com.ironsource.y8.i.d + str + "] " + str2, th);
    }

    public static boolean a() {
        return a(com.applovin.impl.sdk.j.u0);
    }

    public static boolean a(com.applovin.impl.sdk.j jVar) {
        return jVar != null && jVar.g0().c();
    }
}
