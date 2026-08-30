package com.apm.insight.runtime;

/* JADX INFO: compiled from: NpthHandlerThread.java */
/* JADX INFO: loaded from: classes3.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile com.apm.insight.runtime.r f490a;
    private static volatile android.os.Handler b;

    private static android.os.HandlerThread b() {
        if (f490a == null) {
            synchronized (com.apm.insight.runtime.n.class) {
                if (f490a == null) {
                    com.apm.insight.runtime.r rVar = new com.apm.insight.runtime.r("default_npth_thread");
                    f490a = rVar;
                    rVar.b();
                }
            }
        }
        return f490a.c();
    }

    public static com.apm.insight.runtime.r a() {
        if (f490a == null) {
            b();
        }
        return f490a;
    }
}
