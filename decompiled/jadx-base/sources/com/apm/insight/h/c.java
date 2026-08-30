package com.apm.insight.h;

/* JADX INFO: compiled from: SafelyLibraryLoader.java */
/* JADX INFO: loaded from: classes3.dex */
public class c {
    static {
        new java.util.ArrayList();
    }

    public static java.lang.String a(android.content.Context context, java.lang.String str, java.io.File file) {
        android.content.pm.ApplicationInfo applicationInfo = context.getApplicationInfo();
        java.lang.String strA = a(applicationInfo.sourceDir, str, file);
        if (strA == null) {
            return null;
        }
        for (java.lang.String str2 : applicationInfo.splitSourceDirs) {
            strA = a(str2, str, file);
            if (strA == null) {
                return null;
            }
        }
        try {
            java.lang.ClassLoader classLoader = com.apm.insight.h.c.class.getClassLoader();
            while (!(classLoader instanceof dalvik.system.BaseDexClassLoader) && classLoader.getParent() != null) {
                classLoader = classLoader.getParent();
            }
            if (!(classLoader instanceof dalvik.system.BaseDexClassLoader)) {
                return strA;
            }
            java.lang.reflect.Field declaredField = dalvik.system.BaseDexClassLoader.class.getDeclaredField("pathList");
            declaredField.setAccessible(true);
            java.lang.Object obj = declaredField.get(classLoader);
            java.lang.reflect.Field declaredField2 = obj.getClass().getDeclaredField("nativeLibraryDirectories");
            declaredField2.setAccessible(true);
            for (java.lang.String str3 : (java.lang.String[]) declaredField2.get(obj)) {
                java.io.File file2 = new java.io.File(str3, java.lang.System.mapLibraryName(str));
                if (file2.exists()) {
                    com.apm.insight.l.f.a(file2, file);
                    com.apm.insight.a.a(file.getAbsolutePath());
                    return null;
                }
            }
            return "not_found";
        } catch (java.lang.Throwable th) {
            return th.getMessage();
        }
    }

    private static java.lang.String a(java.lang.String str, java.lang.String str2, java.io.File file) {
        java.io.InputStream inputStream;
        java.util.zip.ZipFile zipFile;
        java.lang.String message;
        java.io.FileOutputStream fileOutputStream = null;
        try {
            zipFile = new java.util.zip.ZipFile(new java.io.File(str), 1);
            try {
                java.util.zip.ZipEntry entry = zipFile.getEntry("lib/" + android.os.Build.CPU_ABI + "/" + java.lang.System.mapLibraryName(str2));
                if (entry == null) {
                    int iIndexOf = android.os.Build.CPU_ABI.indexOf(45);
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("lib/");
                    java.lang.String str3 = android.os.Build.CPU_ABI;
                    if (iIndexOf <= 0) {
                        iIndexOf = android.os.Build.CPU_ABI.length();
                    }
                    java.lang.String string = sb.append(str3.substring(0, iIndexOf)).append("/").append(java.lang.System.mapLibraryName(str2)).toString();
                    java.util.zip.ZipEntry entry2 = zipFile.getEntry(string);
                    if (entry2 == null) {
                        message = "Library entry not found:".concat(java.lang.String.valueOf(string));
                        com.apm.insight.a.a((java.io.Closeable) null);
                        com.apm.insight.a.a((java.io.Closeable) null);
                        return message;
                    }
                    entry = entry2;
                }
                file.createNewFile();
                java.io.InputStream inputStream2 = zipFile.getInputStream(entry);
                try {
                    java.io.FileOutputStream fileOutputStream2 = new java.io.FileOutputStream(file);
                    try {
                        byte[] bArr = new byte[4096];
                        while (true) {
                            int i = inputStream2.read(bArr);
                            if (i <= 0) {
                                com.apm.insight.a.a(file.getAbsolutePath());
                                com.apm.insight.a.a((java.io.Closeable) fileOutputStream2);
                                com.apm.insight.a.a((java.io.Closeable) inputStream2);
                                com.apm.insight.a.a(zipFile);
                                return null;
                            }
                            fileOutputStream2.write(bArr, 0, i);
                        }
                    } catch (java.lang.Throwable th) {
                        fileOutputStream = fileOutputStream2;
                        inputStream = inputStream2;
                        th = th;
                        try {
                            message = th.getMessage();
                            com.apm.insight.a.a((java.io.Closeable) fileOutputStream);
                            com.apm.insight.a.a((java.io.Closeable) inputStream);
                            return message;
                        } finally {
                            com.apm.insight.a.a((java.io.Closeable) fileOutputStream);
                            com.apm.insight.a.a((java.io.Closeable) inputStream);
                            com.apm.insight.a.a(zipFile);
                        }
                    }
                } catch (java.lang.Throwable th2) {
                    inputStream = inputStream2;
                    th = th2;
                }
            } catch (java.lang.Throwable th3) {
                th = th3;
                inputStream = null;
            }
        } catch (java.lang.Throwable th4) {
            th = th4;
            inputStream = null;
            zipFile = null;
        }
    }
}
