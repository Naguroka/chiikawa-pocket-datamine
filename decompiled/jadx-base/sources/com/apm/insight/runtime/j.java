package com.apm.insight.runtime;

/* JADX INFO: compiled from: LooperMessageManager.java */
/* JADX INFO: loaded from: classes3.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static com.apm.insight.runtime.j f483a;
    private long b = -1;
    private final java.util.List<android.util.Printer> c = new java.util.ArrayList();
    private final java.util.List<android.util.Printer> d = new java.util.ArrayList();
    private boolean e = false;

    static /* synthetic */ android.util.Printer c() {
        return null;
    }

    static {
        new android.util.Printer() { // from class: com.apm.insight.runtime.j.1
            @Override // android.util.Printer
            public final void println(java.lang.String str) {
                if (str == null) {
                    return;
                }
                if (str.charAt(0) == '>') {
                    com.apm.insight.runtime.j.a().a(str);
                } else if (str.charAt(0) == '<') {
                    com.apm.insight.runtime.j.a().b(str);
                }
                com.apm.insight.runtime.j.c();
            }
        };
    }

    private j() {
    }

    public static com.apm.insight.runtime.j a() {
        if (f483a == null) {
            synchronized (com.apm.insight.runtime.j.class) {
                if (f483a == null) {
                    f483a = new com.apm.insight.runtime.j();
                }
            }
        }
        return f483a;
    }

    public final boolean b() {
        return this.b != -1 && android.os.SystemClock.uptimeMillis() - this.b > 5000;
    }

    final void a(java.lang.String str) {
        this.b = -1L;
        try {
            a(this.c, str);
        } catch (java.lang.Exception e) {
            com.apm.insight.a.a((java.lang.Throwable) e);
        }
    }

    final void b(java.lang.String str) {
        this.b = android.os.SystemClock.uptimeMillis();
        try {
            a(this.d, str);
        } catch (java.lang.Exception e) {
            com.apm.insight.a.b((java.lang.Throwable) e);
        }
    }

    private static void a(java.util.List<? extends android.util.Printer> list, java.lang.String str) {
        if (list == null || list.isEmpty()) {
            return;
        }
        try {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                android.util.Printer printer = list.get(i);
                if (printer == null) {
                    return;
                }
                printer.println(str);
            }
        } catch (java.lang.Throwable th) {
            com.apm.insight.a.a(th);
        }
    }
}
