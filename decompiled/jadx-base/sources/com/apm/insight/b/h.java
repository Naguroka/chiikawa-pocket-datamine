package com.apm.insight.b;

/* JADX INFO: compiled from: LooperMonitor.java */
/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile boolean f377a;
    private static android.util.Printer b;
    private static final java.util.concurrent.CopyOnWriteArrayList<com.apm.insight.b.e> c = new java.util.concurrent.CopyOnWriteArrayList<>();
    private static volatile boolean d = false;

    /* JADX INFO: compiled from: LooperMonitor.java */
    public interface a {
        java.lang.String a();

        java.lang.String b();

        java.lang.String c();
    }

    public static void a() {
        if (f377a) {
            return;
        }
        f377a = true;
        b = new android.util.Printer() { // from class: com.apm.insight.b.h.1
            @Override // android.util.Printer
            public final void println(java.lang.String str) {
                if (android.text.TextUtils.isEmpty(str)) {
                    return;
                }
                if (str.charAt(0) == '>') {
                    com.apm.insight.b.h.a(true, str);
                } else if (str.charAt(0) == '<') {
                    com.apm.insight.b.h.a(false, str);
                }
            }
        };
        com.apm.insight.b.i.a();
        com.apm.insight.b.i.a(b);
    }

    public static void a(com.apm.insight.b.e eVar) {
        java.util.concurrent.CopyOnWriteArrayList<com.apm.insight.b.e> copyOnWriteArrayList = c;
        synchronized (copyOnWriteArrayList) {
            copyOnWriteArrayList.add(eVar);
        }
    }

    public static void a(boolean z, java.lang.String str) {
        com.apm.insight.b.e.f368a = java.lang.System.nanoTime() / 1000000;
        com.apm.insight.b.e.b = android.os.SystemClock.currentThreadTimeMillis();
        java.util.concurrent.CopyOnWriteArrayList<com.apm.insight.b.e> copyOnWriteArrayList = c;
        for (int i = 0; i < copyOnWriteArrayList.size(); i++) {
            com.apm.insight.b.e eVar = copyOnWriteArrayList.get(i);
            if (eVar == null || !eVar.a()) {
                if (!z && eVar.c) {
                    eVar.b("");
                }
            } else if (z) {
                if (!eVar.c) {
                    eVar.a(str);
                }
            } else if (eVar.c) {
                eVar.b(str);
            }
        }
    }
}
