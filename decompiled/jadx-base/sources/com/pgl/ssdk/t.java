package com.pgl.ssdk;

/* JADX INFO: loaded from: classes3.dex */
public class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile java.lang.String f3807a = null;
    private static volatile java.lang.String b = null;
    private static volatile boolean c = false;
    private static java.lang.String d = null;
    private static java.lang.String e = null;
    private static java.lang.String f = null;
    private static int g = -1;
    private static long h = 0;
    private static long i = 0;
    private static volatile long j = -1;

    public static void a(java.io.File file, boolean z) throws java.lang.Throwable {
        com.pgl.ssdk.e eVarA;
        java.io.RandomAccessFile randomAccessFile = null;
        try {
            try {
                java.io.RandomAccessFile randomAccessFile2 = new java.io.RandomAccessFile(file, com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ);
                try {
                    if (android.text.TextUtils.isEmpty(f3807a) && (eVarA = a(file)) != null) {
                        f3807a = a(eVarA.a());
                        d = eVarA.b();
                        if (z) {
                            a();
                            try {
                                randomAccessFile2.close();
                                return;
                            } catch (java.io.IOException unused) {
                                return;
                            }
                        }
                    }
                    if (android.text.TextUtils.isEmpty(e)) {
                        e = a(randomAccessFile2);
                    }
                    if (h == 0) {
                        h = randomAccessFile2.length() / 1024;
                    }
                    if (i == 0) {
                        i = b(file);
                    }
                    randomAccessFile2.close();
                } catch (java.io.FileNotFoundException unused2) {
                    randomAccessFile = randomAccessFile2;
                    if (randomAccessFile != null) {
                        randomAccessFile.close();
                    }
                } catch (java.io.IOException unused3) {
                    randomAccessFile = randomAccessFile2;
                    if (randomAccessFile != null) {
                        randomAccessFile.close();
                    }
                } catch (java.lang.Throwable th) {
                    th = th;
                    randomAccessFile = randomAccessFile2;
                    if (randomAccessFile != null) {
                        try {
                            randomAccessFile.close();
                        } catch (java.io.IOException unused4) {
                        }
                    }
                    throw th;
                }
            } catch (java.io.IOException unused5) {
            }
        } catch (java.io.FileNotFoundException unused6) {
        } catch (java.io.IOException unused7) {
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    public static java.lang.String b() throws java.lang.Throwable {
        java.lang.String string;
        java.lang.String string2;
        java.lang.String string3;
        java.lang.String string4;
        int i2;
        long j2;
        long j3;
        if (android.text.TextUtils.isEmpty(f3807a) || android.text.TextUtils.isEmpty(e) || g == -1) {
            android.content.SharedPreferences sharedPreferencesA = com.pgl.ssdk.u0.a(com.pgl.ssdk.x.b());
            long j4 = -1;
            if (sharedPreferencesA != null) {
                j4 = sharedPreferencesA.getLong(com.json.ce.P0, -1L);
                string2 = sharedPreferencesA.getString("sa", null);
                string3 = sharedPreferencesA.getString("sj", null);
                string4 = sharedPreferencesA.getString("md5", null);
                j2 = sharedPreferencesA.getLong("as", 0L);
                j3 = sharedPreferencesA.getLong("ds", 0L);
                i2 = sharedPreferencesA.getInt("cpc", -1);
                string = sharedPreferencesA.getString(com.json.tk.SESSION_HISTORY_KEY_AD_PROVIDER, null);
            } else {
                string = null;
                string2 = null;
                string3 = null;
                string4 = null;
                i2 = 0;
                j2 = 0;
                j3 = 0;
            }
            java.lang.String strC = c();
            if (strC == null) {
                return null;
            }
            java.io.File file = new java.io.File(strC);
            java.lang.Object[] objArr = (java.lang.Object[]) com.pgl.ssdk.ces.a.meta(158, com.pgl.ssdk.x.b(), strC);
            java.lang.Integer num = (java.lang.Integer) objArr[0];
            java.lang.String str = (java.lang.String) objArr[1];
            long jLastModified = file.lastModified();
            if (jLastModified != j4 || string2 == null || i2 == -1) {
                j = jLastModified;
                if (str != null) {
                    f = str;
                }
                if (num != null) {
                    g = num.intValue();
                }
                a(file, false);
                a();
            } else {
                f3807a = string2;
                d = string3;
                h = j2;
                i = j3;
                e = string4;
                g = i2;
                f = string;
            }
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            if (!android.text.TextUtils.isEmpty(f3807a)) {
                jSONObject.put("sign", f3807a);
            }
            if (!android.text.TextUtils.isEmpty(d)) {
                jSONObject.put("subject", d);
            }
            if (!android.text.TextUtils.isEmpty(e)) {
                jSONObject.put("md5", e);
            }
            if (!android.text.TextUtils.isEmpty(f)) {
                jSONObject.put("path", f);
            }
            long j5 = h;
            if (j5 != 0) {
                jSONObject.put("apkSize", j5);
            }
            long j6 = i;
            if (j6 != 0) {
                jSONObject.put("dexSize", j6);
            }
            int i3 = g;
            if (i3 != -1) {
                jSONObject.put("code", i3);
            }
            f();
            jSONObject.put("signpm", b);
            if (!android.text.TextUtils.isEmpty(b) && !android.text.TextUtils.isEmpty(f3807a)) {
                if (!b.equals(f3807a)) {
                    c = true;
                }
                jSONObject.put("rebud", c);
            }
            return jSONObject.toString();
        } catch (org.json.JSONException unused) {
            return null;
        }
    }

    public static java.lang.String c() {
        if (com.pgl.ssdk.x.b() == null) {
            return null;
        }
        java.lang.String packageCodePath = com.pgl.ssdk.x.b().getPackageCodePath();
        if (android.text.TextUtils.isEmpty(packageCodePath)) {
            return null;
        }
        java.io.File file = new java.io.File(packageCodePath);
        if (file.exists() && file.canRead()) {
            return packageCodePath;
        }
        return null;
    }

    public static void d() throws java.lang.Throwable {
        if (android.text.TextUtils.isEmpty(f3807a)) {
            android.content.SharedPreferences sharedPreferencesA = com.pgl.ssdk.u0.a(com.pgl.ssdk.x.b());
            java.lang.String string = null;
            long j2 = -1;
            if (sharedPreferencesA != null) {
                j2 = sharedPreferencesA.getLong(com.json.ce.P0, -1L);
                string = sharedPreferencesA.getString("sa", null);
            }
            java.lang.String strC = c();
            if (android.text.TextUtils.isEmpty(strC)) {
                return;
            }
            java.io.File file = new java.io.File(strC);
            long jLastModified = file.lastModified();
            if (jLastModified != j2 || string == null) {
                j = jLastModified;
                a(file, true);
                a();
            } else {
                f3807a = string;
            }
        }
        f();
        if (android.text.TextUtils.isEmpty(b) || android.text.TextUtils.isEmpty(f3807a) || b.equals(f3807a)) {
            return;
        }
        c = true;
    }

    public static java.lang.String e() throws java.lang.Throwable {
        d();
        return f3807a;
    }

    public static java.lang.String f() {
        if (!android.text.TextUtils.isEmpty(b)) {
            return b;
        }
        try {
            java.lang.String strA = a(com.pgl.ssdk.x.b().getPackageManager().getPackageInfo(com.pgl.ssdk.x.b().getPackageName(), 64).signatures[0].toByteArray());
            b = strA;
            return strA;
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    public static boolean g() throws java.lang.Throwable {
        d();
        return c;
    }

    public static void a() {
        android.content.SharedPreferences sharedPreferencesA = com.pgl.ssdk.u0.a(com.pgl.ssdk.x.b());
        if (sharedPreferencesA != null) {
            if (!android.text.TextUtils.isEmpty(f3807a)) {
                sharedPreferencesA.edit().putString("sa", f3807a).apply();
            }
            if (!android.text.TextUtils.isEmpty(e)) {
                sharedPreferencesA.edit().putString("md5", e).apply();
            }
            if (!android.text.TextUtils.isEmpty(d)) {
                sharedPreferencesA.edit().putString("sj", d).apply();
            }
            if (h != 0) {
                sharedPreferencesA.edit().putLong("as", h).apply();
            }
            if (i != 0) {
                sharedPreferencesA.edit().putLong("ds", i).apply();
            }
            if (j != -1) {
                sharedPreferencesA.edit().putLong(com.json.ce.P0, j).apply();
            }
            if (g != -1) {
                sharedPreferencesA.edit().putInt("cpc", g).apply();
            }
            if (android.text.TextUtils.isEmpty(f)) {
                return;
            }
            sharedPreferencesA.edit().putString(com.json.tk.SESSION_HISTORY_KEY_AD_PROVIDER, f).apply();
        }
    }

    public static long b(java.io.File file) throws java.lang.Throwable {
        java.lang.String str;
        java.util.zip.ZipFile zipFile = null;
        try {
            try {
                java.util.zip.ZipFile zipFile2 = new java.util.zip.ZipFile(file);
                int i2 = 0;
                int size = 0;
                while (true) {
                    if (i2 == 0) {
                        str = "classes.dex";
                    } else {
                        str = java.lang.String.format(java.util.Locale.getDefault(), "classes%d.dex", java.lang.Integer.valueOf(i2));
                    }
                    try {
                        java.util.zip.ZipEntry entry = zipFile2.getEntry(str);
                        if (entry == null) {
                            break;
                        }
                        size = (int) (((long) size) + entry.getSize());
                        i2++;
                    } catch (java.util.zip.ZipException unused) {
                        zipFile = zipFile2;
                        if (zipFile == null) {
                            return 0L;
                        }
                        zipFile.close();
                        return 0L;
                    } catch (java.io.IOException unused2) {
                        zipFile = zipFile2;
                        if (zipFile == null) {
                            return 0L;
                        }
                        zipFile.close();
                        return 0L;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        zipFile = zipFile2;
                        if (zipFile != null) {
                            try {
                                zipFile.close();
                            } catch (java.io.IOException unused3) {
                            }
                        }
                        throw th;
                    }
                }
                long j2 = size / 1000;
                try {
                    zipFile2.close();
                } catch (java.io.IOException unused4) {
                }
                return j2;
            } catch (java.io.IOException unused5) {
                return 0L;
            }
        } catch (java.util.zip.ZipException unused6) {
        } catch (java.io.IOException unused7) {
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    public static java.lang.String a(byte[] bArr) {
        try {
            byte[] bArrDigest = java.security.MessageDigest.getInstance("SHA1").digest(bArr);
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            for (byte b2 : bArrDigest) {
                sb.append(java.lang.Integer.toHexString((b2 & 255) | 256).substring(1, 3).toUpperCase());
                sb.append(":");
            }
            return sb.substring(0, sb.length() - 1);
        } catch (java.security.NoSuchAlgorithmException unused) {
            return null;
        }
    }

    @com.pgl.ssdk.ces.out.DungeonFlag
    private static com.pgl.ssdk.e a(java.io.File file) throws java.lang.Throwable {
        java.io.RandomAccessFile randomAccessFile;
        java.util.List<com.pgl.ssdk.e> listA;
        try {
            try {
                randomAccessFile = new java.io.RandomAccessFile(file, com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ);
                try {
                    com.pgl.ssdk.o oVarA = com.pgl.ssdk.p.a(randomAccessFile, 0L, randomAccessFile.length());
                    listA = com.pgl.ssdk.k.a(oVarA, com.pgl.ssdk.c.a(oVarA));
                    try {
                        randomAccessFile.close();
                    } catch (java.io.IOException unused) {
                    }
                } catch (com.pgl.ssdk.f.a unused2) {
                    if (randomAccessFile != null) {
                        randomAccessFile.close();
                    }
                    listA = null;
                } catch (java.lang.Throwable unused3) {
                    if (randomAccessFile != null) {
                        randomAccessFile.close();
                    }
                    listA = null;
                }
            } catch (java.io.IOException unused4) {
                listA = null;
            }
        } catch (com.pgl.ssdk.f.a unused5) {
            randomAccessFile = null;
        } catch (java.lang.Throwable unused6) {
            randomAccessFile = null;
        }
        if (listA == null || listA.isEmpty()) {
            listA = com.pgl.ssdk.j.a(file);
        }
        if (listA == null || listA.isEmpty()) {
            return null;
        }
        return listA.get(0);
    }

    public static java.lang.String a(java.io.RandomAccessFile randomAccessFile) {
        try {
            java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("MD5");
            byte[] bArr = new byte[1048576];
            while (true) {
                int i2 = randomAccessFile.read(bArr);
                if (i2 == -1) {
                    break;
                }
                messageDigest.update(bArr, 0, i2);
            }
            java.lang.String string = new java.math.BigInteger(1, messageDigest.digest()).toString(16);
            while (string.length() < 32) {
                string = "0".concat(java.lang.String.valueOf(string));
            }
            return string;
        } catch (java.io.FileNotFoundException | java.io.IOException | java.security.NoSuchAlgorithmException unused) {
            return "";
        }
    }
}
