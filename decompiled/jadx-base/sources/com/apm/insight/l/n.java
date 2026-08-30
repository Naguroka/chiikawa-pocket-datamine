package com.apm.insight.l;

/* JADX INFO: compiled from: Storage.java */
/* JADX INFO: loaded from: classes3.dex */
public final class n {
    public static org.json.JSONObject a() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("inner_free", b());
            jSONObject.put("inner_total", c());
            jSONObject.put("sdcard_free", f());
            jSONObject.put("sdcard_total", g());
            jSONObject.put("inner_free_real", d());
            jSONObject.put("inner_total_real", e());
        } catch (java.lang.Throwable unused) {
        }
        return jSONObject;
    }

    private static long b() {
        try {
            return b(android.os.Environment.getRootDirectory());
        } catch (java.lang.Throwable unused) {
            return 0L;
        }
    }

    private static long c() {
        try {
            return a(android.os.Environment.getRootDirectory());
        } catch (java.lang.Throwable unused) {
            return 0L;
        }
    }

    private static long d() {
        try {
            return b(com.apm.insight.e.g().getFilesDir());
        } catch (java.lang.Throwable unused) {
            return 0L;
        }
    }

    private static long e() {
        try {
            return a(com.apm.insight.e.g().getFilesDir());
        } catch (java.lang.Throwable unused) {
            return 0L;
        }
    }

    private static long f() {
        try {
            if (h()) {
                return android.os.Environment.getExternalStorageDirectory().getFreeSpace();
            }
            return 0L;
        } catch (java.lang.Throwable unused) {
            return 0L;
        }
    }

    private static long g() {
        try {
            if (h()) {
                return android.os.Environment.getExternalStorageDirectory().getTotalSpace();
            }
            return 0L;
        } catch (java.lang.Throwable unused) {
            return 0L;
        }
    }

    private static boolean h() {
        return "mounted".equals(android.os.Environment.getExternalStorageState());
    }

    private static long a(java.io.File file) {
        try {
            return new android.os.StatFs(file.getPath()).getTotalBytes();
        } catch (java.lang.Throwable unused) {
            return 0L;
        }
    }

    private static long b(java.io.File file) {
        try {
            return new android.os.StatFs(file.getPath()).getFreeBytes();
        } catch (java.lang.Throwable unused) {
            return 0L;
        }
    }
}
