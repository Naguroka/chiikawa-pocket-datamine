package com.apm.insight.b;

/* JADX INFO: compiled from: LooperPrinterUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f378a = 5;
    private static com.apm.insight.b.i.b b;
    private static boolean c;
    private static android.util.Printer d;

    /* JADX INFO: compiled from: LooperPrinterUtils.java */
    public interface a {
    }

    static /* synthetic */ com.apm.insight.b.i.a b() {
        return null;
    }

    /* JADX INFO: compiled from: LooperPrinterUtils.java */
    static class b implements android.util.Printer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        java.util.List<android.util.Printer> f379a = new java.util.ArrayList();
        private java.util.List<android.util.Printer> d = new java.util.ArrayList();
        java.util.List<android.util.Printer> b = new java.util.ArrayList();
        private boolean e = false;
        boolean c = false;

        b() {
        }

        @Override // android.util.Printer
        public final void println(java.lang.String str) {
            if (android.text.TextUtils.isEmpty(str)) {
                return;
            }
            com.apm.insight.b.i.b();
            if (str.charAt(0) == '>' && this.c) {
                for (android.util.Printer printer : this.b) {
                    if (!this.f379a.contains(printer)) {
                        this.f379a.add(printer);
                    }
                }
                this.b.clear();
                this.c = false;
            }
            if (this.f379a.size() > com.apm.insight.b.i.f378a) {
                android.util.Log.e("LooperPrinterUtils", "wrapper contains too many printer,please check if the useless printer have been removed");
            }
            for (android.util.Printer printer2 : this.f379a) {
                if (printer2 != null) {
                    printer2.println(str);
                }
            }
            str.charAt(0);
            com.apm.insight.b.i.b();
        }
    }

    public static void a() {
        if (c) {
            return;
        }
        c = true;
        b = new com.apm.insight.b.i.b();
        android.util.Printer printerD = d();
        d = printerD;
        if (printerD != null) {
            b.f379a.add(d);
        }
        if (com.apm.insight.e.s()) {
            android.os.Looper.getMainLooper().setMessageLogging(b);
        }
    }

    public static void a(android.util.Printer printer) {
        if (printer == null || b.b.contains(printer)) {
            return;
        }
        b.b.add(printer);
        b.c = true;
    }

    private static android.util.Printer d() {
        try {
            java.lang.reflect.Field declaredField = java.lang.Class.forName("android.os.Looper").getDeclaredField("mLogging");
            declaredField.setAccessible(true);
            return (android.util.Printer) declaredField.get(android.os.Looper.getMainLooper());
        } catch (java.lang.Exception unused) {
            return null;
        }
    }
}
