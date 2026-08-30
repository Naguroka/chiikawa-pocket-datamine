package com.apm.insight.runtime;

/* JADX INFO: compiled from: ProcessCpuTracker.java */
/* JADX INFO: loaded from: classes3.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static long f491a = -1;

    /* JADX INFO: compiled from: ProcessCpuTracker.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static long f492a = -1;

        public static long a() {
            if (com.apm.insight.runtime.o.f491a == -1) {
                long jSysconf = f492a;
                if (jSysconf <= 0) {
                    jSysconf = android.system.Os.sysconf(android.system.OsConstants._SC_CLK_TCK);
                    if (jSysconf <= 0) {
                        jSysconf = 100;
                    }
                    f492a = jSysconf;
                }
                long unused = com.apm.insight.runtime.o.f491a = 1000 / jSysconf;
            }
            return com.apm.insight.runtime.o.f491a;
        }

        private static long a(java.lang.String str) {
            try {
                int i = java.lang.Class.forName("libcore.io.OsConstants").getField(str).getInt(null);
                java.lang.Class<?> cls = java.lang.Class.forName("libcore.io.Libcore");
                java.lang.Class<?> cls2 = java.lang.Class.forName("libcore.io.Os");
                return ((java.lang.Long) cls2.getMethod("sysconf", java.lang.Integer.TYPE).invoke(cls.getField(com.json.ce.y).get(null), java.lang.Integer.valueOf(i))).longValue();
            } catch (java.lang.Throwable th) {
                th.printStackTrace();
                return 100L;
            }
        }
    }
}
