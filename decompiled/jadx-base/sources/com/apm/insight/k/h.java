package com.apm.insight.k;

/* JADX INFO: compiled from: LaunchScanner.java */
/* JADX INFO: loaded from: classes3.dex */
public final class h implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private android.content.Context f435a;

    private h(android.content.Context context) {
        this.f435a = context;
    }

    public static boolean a() {
        return com.apm.insight.k.b.a().c() || !com.apm.insight.l.a.c(com.apm.insight.e.g());
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            com.apm.insight.b.f.a(this.f435a).a().f();
        } catch (java.lang.Throwable unused) {
        }
        try {
            if (com.apm.insight.l.a.c(this.f435a)) {
                com.apm.insight.k.b.a().a(com.apm.insight.l.k.b(this.f435a));
            } else {
                com.apm.insight.nativecrash.NativeImpl.j();
            }
            com.apm.insight.runtime.q.a().a(com.apm.insight.e.a().b(), com.apm.insight.entity.b.b());
            if (com.apm.insight.runtime.n.a().a() == null) {
            }
        } catch (java.lang.Throwable th) {
            try {
                com.apm.insight.a.b(th);
            } finally {
                com.apm.insight.runtime.q.a().a(com.apm.insight.e.a().b(), com.apm.insight.entity.b.b());
                if (com.apm.insight.runtime.n.a().a() != null) {
                    com.apm.insight.j.d.a(com.apm.insight.runtime.n.a().a(), this.f435a).a();
                }
            }
        }
    }

    public static void a(android.content.Context context) {
        com.apm.insight.runtime.n.a().a(new com.apm.insight.k.h(context), 0L);
    }
}
