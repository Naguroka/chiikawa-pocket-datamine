package com.apm.insight.b;

/* JADX INFO: compiled from: ANRThread.java */
/* JADX INFO: loaded from: classes3.dex */
public final class c {
    private static long b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.apm.insight.b.b f364a;
    private boolean c = false;
    private final java.lang.Runnable d;

    c(com.apm.insight.b.b bVar) {
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.apm.insight.b.c.1
            @Override // java.lang.Runnable
            public final void run() throws java.lang.Throwable {
                if (com.apm.insight.b.c.this.c) {
                    return;
                }
                com.apm.insight.b.c.this.f364a.d();
                long unused = com.apm.insight.b.c.b = android.os.SystemClock.uptimeMillis();
                if (com.apm.insight.runtime.j.a().b()) {
                    com.apm.insight.runtime.n.a().a(com.apm.insight.b.c.this.d, 500L);
                } else {
                    com.apm.insight.runtime.n.a().a(com.apm.insight.b.c.this.d, 500L);
                }
                com.apm.insight.runtime.b.a(com.apm.insight.b.c.b);
            }
        };
        this.d = runnable;
        this.f364a = bVar;
        com.apm.insight.runtime.n.a().a(runnable, 5000L);
    }

    public final void a() {
        if (this.c) {
            return;
        }
        com.apm.insight.runtime.n.a().a(this.d, 5000L);
    }

    public final void b() {
        this.c = true;
    }

    public static boolean c() {
        return android.os.SystemClock.uptimeMillis() - b <= androidx.media3.common.C.DEFAULT_SEEK_FORWARD_INCREMENT_MS;
    }
}
