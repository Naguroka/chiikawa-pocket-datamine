package com.apm.insight.runtime;

/* JADX INFO: compiled from: LogcatDump.java */
/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static com.apm.insight.b.h.a f482a;

    public static void a(com.apm.insight.b.h.a aVar) {
        f482a = aVar;
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x004b: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:25:0x004b */
    private static org.json.JSONArray b(java.lang.String str) throws java.lang.Throwable {
        java.io.Closeable closeable;
        java.io.BufferedReader bufferedReader;
        java.io.Closeable closeable2 = null;
        try {
            if (android.text.TextUtils.isEmpty(str)) {
                return null;
            }
            try {
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                bufferedReader = new java.io.BufferedReader(new java.io.FileReader(str));
                try {
                    java.io.File file = new java.io.File(str);
                    if (file.length() > 512000) {
                        bufferedReader.skip(file.length() - 512000);
                    }
                    while (true) {
                        java.lang.String line = bufferedReader.readLine();
                        if (line != null) {
                            jSONArray.put(line);
                        } else {
                            com.apm.insight.a.a((java.io.Closeable) bufferedReader);
                            return jSONArray;
                        }
                    }
                } catch (java.io.IOException e) {
                    e = e;
                    e.printStackTrace();
                    com.apm.insight.a.a((java.io.Closeable) bufferedReader);
                    return null;
                }
            } catch (java.io.IOException e2) {
                e = e2;
                bufferedReader = null;
            } catch (java.lang.Throwable th) {
                th = th;
                com.apm.insight.a.a(closeable2);
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            closeable2 = closeable;
        }
    }

    public static org.json.JSONArray a(java.lang.String str) {
        if (f482a != null && com.apm.insight.e.f().equals(str)) {
            try {
                return b(f482a.b());
            } catch (java.lang.Throwable th) {
                com.apm.insight.c.a();
                com.apm.insight.runtime.k.a(th, "NPTH_CATCH");
            }
        }
        try {
            return b(com.apm.insight.a.a(str, com.apm.insight.e.i().getLogcatDumpCount(), com.apm.insight.e.i().getLogcatLevel()).getAbsolutePath());
        } catch (java.lang.Throwable th2) {
            com.apm.insight.c.a();
            com.apm.insight.runtime.k.a(th2, "NPTH_CATCH");
            return null;
        }
    }
}
