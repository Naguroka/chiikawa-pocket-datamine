package com.pgl.ssdk;

/* JADX INFO: loaded from: classes3.dex */
public class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static java.util.List<java.lang.String> f3808a = new java.util.ArrayList();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f3809a;
        public java.lang.String b;

        public a(int i, java.lang.String... strArr) {
            this.f3809a = i;
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            for (java.lang.String str : strArr) {
                jSONArray.put(str);
            }
            this.b = jSONArray.toString();
        }
    }

    private static java.io.File a(android.content.Context context) {
        if (context == null || context.getFilesDir() == null) {
            return null;
        }
        java.io.File file = new java.io.File(context.getFilesDir(), "libso");
        if (!file.exists()) {
            com.pgl.ssdk.p0.a(file.getAbsolutePath());
        }
        return file;
    }

    public static synchronized com.pgl.ssdk.t0.a b(android.content.Context context, java.lang.String str) {
        if (f3808a.contains(str)) {
            return null;
        }
        try {
            java.lang.System.loadLibrary(str);
            f3808a.add(str);
        } catch (java.lang.UnsatisfiedLinkError e) {
            java.io.File fileA = a(context, str);
            if (fileA == null) {
                return new com.pgl.ssdk.t0.a(3, e.getMessage(), "output null");
            }
            if (fileA.exists()) {
                fileA.delete();
            }
            com.pgl.ssdk.t0.a aVarA = a(context, str, fileA);
            if (aVarA != null) {
                return aVarA;
            }
            try {
                java.lang.System.load(fileA.getAbsolutePath());
                f3808a.add(str);
            } catch (java.lang.Throwable th) {
                return new com.pgl.ssdk.t0.a(3, e.getMessage(), th.getMessage());
            }
        } catch (java.lang.Throwable th2) {
            return new com.pgl.ssdk.t0.a(3, th2.getMessage());
        }
        return null;
    }

    private static java.io.File a(android.content.Context context, java.lang.String str) {
        java.lang.String strMapLibraryName = java.lang.System.mapLibraryName(str);
        java.io.File fileA = a(context);
        if (fileA != null) {
            return new java.io.File(fileA, strMapLibraryName);
        }
        return null;
    }

    private static com.pgl.ssdk.t0.a a(android.content.Context context, java.lang.String str, java.io.File file) {
        java.io.InputStream inputStream;
        java.io.FileOutputStream fileOutputStream;
        java.util.zip.ZipFile zipFile = null;
        try {
            java.util.zip.ZipFile zipFile2 = new java.util.zip.ZipFile(new java.io.File(context.getApplicationInfo().sourceDir), 1);
            try {
                java.util.zip.ZipEntry zipEntryA = a(zipFile2, android.os.Build.CPU_ABI, str);
                if (zipEntryA == null) {
                    try {
                        zipEntryA = a(zipFile2, android.os.Build.CPU_ABI2, str);
                    } catch (java.lang.Throwable th) {
                        th = th;
                        inputStream = null;
                        fileOutputStream = null;
                        zipFile = zipFile2;
                        try {
                            return new com.pgl.ssdk.t0.a(3, th.getMessage());
                        } finally {
                            com.pgl.ssdk.p0.a(fileOutputStream);
                            com.pgl.ssdk.p0.a(inputStream);
                            com.pgl.ssdk.p0.a(zipFile);
                        }
                    }
                }
                if (zipEntryA != null) {
                    file.createNewFile();
                    java.io.InputStream inputStream2 = zipFile2.getInputStream(zipEntryA);
                    try {
                        java.io.FileOutputStream fileOutputStream2 = new java.io.FileOutputStream(file);
                        try {
                            byte[] bArr = new byte[16384];
                            while (true) {
                                int i = inputStream2.read(bArr);
                                if (i > 0) {
                                    fileOutputStream2.write(bArr, 0, i);
                                } else {
                                    com.pgl.ssdk.p0.a(file.getAbsolutePath(), 493);
                                    com.pgl.ssdk.p0.a(fileOutputStream2);
                                    com.pgl.ssdk.p0.a(inputStream2);
                                    com.pgl.ssdk.p0.a(zipFile2);
                                    return null;
                                }
                            }
                        } catch (java.lang.Throwable th2) {
                            zipFile = zipFile2;
                            inputStream = inputStream2;
                            th = th2;
                            fileOutputStream = fileOutputStream2;
                            return new com.pgl.ssdk.t0.a(3, th.getMessage());
                        }
                    } catch (java.lang.Throwable th3) {
                        inputStream = inputStream2;
                        th = th3;
                        fileOutputStream = null;
                        zipFile = zipFile2;
                        return new com.pgl.ssdk.t0.a(3, th.getMessage());
                    }
                } else {
                    com.pgl.ssdk.t0.a aVar = new com.pgl.ssdk.t0.a(2, a(zipFile2, str));
                    com.pgl.ssdk.p0.a((java.io.Closeable) null);
                    com.pgl.ssdk.p0.a((java.io.Closeable) null);
                    com.pgl.ssdk.p0.a(zipFile2);
                    return aVar;
                }
            } catch (java.lang.Throwable th4) {
                th = th4;
                inputStream = null;
            }
        } catch (java.lang.Throwable th5) {
            th = th5;
            inputStream = null;
            fileOutputStream = null;
        }
    }

    private static java.lang.String a(java.util.zip.ZipFile zipFile, java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String[] strArr = {"armeabi-v7a", "arm64-v8a", "x86", "x86_64", "armeabi"};
        for (int i = 0; i < 5; i++) {
            java.lang.String str2 = strArr[i];
            if (a(zipFile, str2, str) != null) {
                arrayList.add(str2);
            }
        }
        java.util.List listAsList = java.util.Arrays.asList(android.os.Build.SUPPORTED_ABIS);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.String str3 = android.os.Build.CPU_ABI;
        if (!android.text.TextUtils.isEmpty(str3)) {
            arrayList2.add(str3);
        }
        java.lang.String str4 = android.os.Build.CPU_ABI2;
        if (!android.text.TextUtils.isEmpty(str4)) {
            arrayList2.add(str4);
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("supportedABIS", listAsList);
            jSONObject.put("curABIs", arrayList2);
            jSONObject.put("apkABIS", arrayList);
            return jSONObject.toString();
        } catch (org.json.JSONException unused) {
            return "";
        }
    }

    private static java.util.zip.ZipEntry a(java.util.zip.ZipFile zipFile, java.lang.String str, java.lang.String str2) {
        java.util.zip.ZipEntry entry = zipFile.getEntry("lib/" + str + "/" + java.lang.System.mapLibraryName(str2));
        if (entry != null) {
            return entry;
        }
        int iIndexOf = str.indexOf(45);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("lib/");
        if (iIndexOf <= 0) {
            iIndexOf = str.length();
        }
        return zipFile.getEntry(sb.append(str.substring(0, iIndexOf)).append("/").append(java.lang.System.mapLibraryName(str2)).toString());
    }
}
