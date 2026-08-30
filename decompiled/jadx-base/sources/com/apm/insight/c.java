package com.apm.insight;

/* JADX INFO: compiled from: Ensure.java */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static com.apm.insight.b.a f381a = new com.apm.insight.b.a();

    public static com.apm.insight.b.a a() {
        return f381a;
    }

    public static void a(java.lang.Throwable th, java.lang.String str) {
        if (com.apm.insight.e.i().isEnsureEnable() && !com.apm.insight.l.g.a(th)) {
            com.apm.insight.f.b.a(th, str, "core_exception_monitor");
        }
    }
}
