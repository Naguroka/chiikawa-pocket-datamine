package com.apm.insight.b;

/* JADX INFO: compiled from: CrashANRHandler.java */
/* JADX INFO: loaded from: classes3.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile com.apm.insight.b.f f369a;
    private static com.apm.insight.b.g c;
    private final com.apm.insight.b.b b;

    public static com.apm.insight.b.f a(android.content.Context context) {
        if (f369a == null) {
            synchronized (com.apm.insight.b.f.class) {
                if (f369a == null) {
                    f369a = new com.apm.insight.b.f(context);
                }
            }
        }
        return f369a;
    }

    private f(android.content.Context context) {
        this.b = new com.apm.insight.b.b(context);
        com.apm.insight.b.g gVar = new com.apm.insight.b.g();
        c = gVar;
        gVar.a();
    }

    public final com.apm.insight.b.b a() {
        return this.b;
    }

    public static com.apm.insight.b.g b() {
        return c;
    }

    public final void c() {
        this.b.a();
    }

    public final void d() {
        this.b.b();
    }
}
