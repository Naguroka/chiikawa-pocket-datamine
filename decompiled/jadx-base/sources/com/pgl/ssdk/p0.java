package com.pgl.ssdk;

/* JADX INFO: loaded from: classes3.dex */
public class p0 {
    public static boolean a(java.lang.String str) {
        return new java.io.File(str).mkdirs();
    }

    public static void a(java.lang.String str, int i) {
        com.pgl.ssdk.q0.a("android.os.FileUtils", str, java.lang.Integer.valueOf(i), -1, -1);
    }

    public static void a(java.io.Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (java.io.IOException unused) {
        }
    }

    public static void a(java.util.zip.ZipFile zipFile) {
        if (zipFile == null) {
            return;
        }
        try {
            zipFile.close();
        } catch (java.io.IOException unused) {
        }
    }
}
