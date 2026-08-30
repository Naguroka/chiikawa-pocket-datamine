package com.apm.insight;

/* JADX INFO: compiled from: AppDataCenter.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.util.Map<com.apm.insight.CrashType, java.util.List<com.apm.insight.AttachUserData>> f357a = new java.util.HashMap();
    private java.util.Map<com.apm.insight.CrashType, java.util.List<com.apm.insight.AttachUserData>> b = new java.util.HashMap();
    private java.util.Map<java.lang.String, java.lang.String> c = new java.util.HashMap();
    private com.apm.insight.ICrashFilter d = null;

    final void a(com.apm.insight.AttachUserData attachUserData, com.apm.insight.CrashType crashType) {
        if (crashType == com.apm.insight.CrashType.ALL) {
            c(com.apm.insight.CrashType.LAUNCH, attachUserData);
            c(com.apm.insight.CrashType.JAVA, attachUserData);
            c(com.apm.insight.CrashType.CUSTOM_JAVA, attachUserData);
            c(com.apm.insight.CrashType.NATIVE, attachUserData);
            c(com.apm.insight.CrashType.ANR, attachUserData);
            c(com.apm.insight.CrashType.DART, attachUserData);
            return;
        }
        c(crashType, attachUserData);
    }

    final void b(com.apm.insight.AttachUserData attachUserData, com.apm.insight.CrashType crashType) {
        if (crashType == com.apm.insight.CrashType.ALL) {
            d(com.apm.insight.CrashType.LAUNCH, attachUserData);
            d(com.apm.insight.CrashType.JAVA, attachUserData);
            d(com.apm.insight.CrashType.CUSTOM_JAVA, attachUserData);
            d(com.apm.insight.CrashType.NATIVE, attachUserData);
            d(com.apm.insight.CrashType.ANR, attachUserData);
            d(com.apm.insight.CrashType.DART, attachUserData);
            return;
        }
        d(crashType, attachUserData);
    }

    final void a(com.apm.insight.CrashType crashType, com.apm.insight.AttachUserData attachUserData) {
        if (crashType == com.apm.insight.CrashType.ALL) {
            e(com.apm.insight.CrashType.LAUNCH, attachUserData);
            e(com.apm.insight.CrashType.JAVA, attachUserData);
            e(com.apm.insight.CrashType.CUSTOM_JAVA, attachUserData);
            e(com.apm.insight.CrashType.NATIVE, attachUserData);
            e(com.apm.insight.CrashType.ANR, attachUserData);
            e(com.apm.insight.CrashType.DART, attachUserData);
            return;
        }
        e(crashType, attachUserData);
    }

    final void b(com.apm.insight.CrashType crashType, com.apm.insight.AttachUserData attachUserData) {
        if (crashType == com.apm.insight.CrashType.ALL) {
            f(com.apm.insight.CrashType.LAUNCH, attachUserData);
            f(com.apm.insight.CrashType.JAVA, attachUserData);
            f(com.apm.insight.CrashType.CUSTOM_JAVA, attachUserData);
            f(com.apm.insight.CrashType.NATIVE, attachUserData);
            f(com.apm.insight.CrashType.ANR, attachUserData);
            f(com.apm.insight.CrashType.DART, attachUserData);
            return;
        }
        f(crashType, attachUserData);
    }

    private void c(com.apm.insight.CrashType crashType, com.apm.insight.AttachUserData attachUserData) {
        java.util.List<com.apm.insight.AttachUserData> arrayList;
        if (this.f357a.get(crashType) == null) {
            arrayList = new java.util.ArrayList<>();
            this.f357a.put(crashType, arrayList);
        } else {
            arrayList = this.f357a.get(crashType);
        }
        arrayList.add(attachUserData);
    }

    private void d(com.apm.insight.CrashType crashType, com.apm.insight.AttachUserData attachUserData) {
        java.util.List<com.apm.insight.AttachUserData> arrayList;
        if (this.b.get(crashType) == null) {
            arrayList = new java.util.ArrayList<>();
            this.b.put(crashType, arrayList);
        } else {
            arrayList = this.b.get(crashType);
        }
        arrayList.add(attachUserData);
    }

    private void e(com.apm.insight.CrashType crashType, com.apm.insight.AttachUserData attachUserData) {
        java.util.List<com.apm.insight.AttachUserData> list = this.f357a.get(crashType);
        if (list != null) {
            list.remove(attachUserData);
        }
    }

    private void f(com.apm.insight.CrashType crashType, com.apm.insight.AttachUserData attachUserData) {
        java.util.List<com.apm.insight.AttachUserData> list = this.b.get(crashType);
        if (list != null) {
            list.remove(attachUserData);
        }
    }

    public final java.util.List<com.apm.insight.AttachUserData> a(com.apm.insight.CrashType crashType) {
        return this.f357a.get(crashType);
    }

    public final java.util.List<com.apm.insight.AttachUserData> b(com.apm.insight.CrashType crashType) {
        return this.b.get(crashType);
    }

    final void a(java.util.Map<? extends java.lang.String, ? extends java.lang.String> map) {
        this.c.putAll(map);
    }

    public final java.util.Map<java.lang.String, java.lang.String> a() {
        return this.c;
    }

    final void a(com.apm.insight.ICrashFilter iCrashFilter) {
        this.d = iCrashFilter;
    }

    public final com.apm.insight.ICrashFilter b() {
        return this.d;
    }

    public static void c() {
        java.io.File[] fileArrListFiles;
        java.io.File file = new java.io.File(com.apm.insight.e.g().getFilesDir(), "apminsight/crashCommand");
        if (file.exists() && (fileArrListFiles = file.listFiles()) != null) {
            for (java.io.File file2 : fileArrListFiles) {
                try {
                    file2.getName().split("_")[0].equals("0");
                    file2.delete();
                } catch (java.lang.Throwable th) {
                    com.apm.insight.c.a();
                    com.apm.insight.runtime.k.a(th, "NPTH_CATCH");
                    try {
                        file2.delete();
                    } catch (java.lang.Throwable unused) {
                    }
                }
            }
        }
    }

    public static void d() {
        try {
            a(com.apm.insight.e.f(), com.apm.insight.e.i().getLogcatDumpCount(), com.apm.insight.e.i().getLogcatLevel());
            if (com.apm.insight.e.v()) {
                g();
                i();
                h();
                j();
            }
        } catch (java.lang.Throwable unused) {
        }
    }

    private static java.io.File g() {
        java.io.File file = new java.io.File(com.apm.insight.l.j.e(com.apm.insight.e.g()), "maps.txt");
        if (file.exists()) {
            return file;
        }
        file.getParentFile().mkdirs();
        try {
            file.createNewFile();
        } catch (java.io.IOException unused) {
        }
        com.apm.insight.nativecrash.NativeImpl.f(file.getAbsolutePath());
        return file;
    }

    public static java.io.File a(java.lang.String str, int i, int i2) {
        java.io.File file = new java.io.File(com.apm.insight.l.j.a(com.apm.insight.e.g(), str), "logcat.txt");
        if (file.exists() && file.length() > 0) {
            return file;
        }
        file.getParentFile().mkdirs();
        try {
            file.createNewFile();
        } catch (java.io.IOException unused) {
        }
        com.apm.insight.nativecrash.NativeImpl.a(file.getAbsolutePath(), java.lang.String.valueOf(i), java.lang.String.valueOf(i2));
        return file;
    }

    private static java.io.File h() {
        java.io.File file = new java.io.File(com.apm.insight.l.j.e(com.apm.insight.e.g()), "meminfo.txt");
        if (file.exists()) {
            return file;
        }
        file.getParentFile().mkdirs();
        try {
            file.createNewFile();
        } catch (java.io.IOException unused) {
        }
        com.apm.insight.nativecrash.NativeImpl.d(file.getAbsolutePath());
        return file;
    }

    private static java.io.File i() {
        java.io.File file = new java.io.File(com.apm.insight.l.j.e(com.apm.insight.e.g()), "fds.txt");
        if (file.exists()) {
            return file;
        }
        file.getParentFile().mkdirs();
        try {
            file.createNewFile();
        } catch (java.io.IOException unused) {
        }
        com.apm.insight.nativecrash.NativeImpl.e(file.getAbsolutePath());
        return file;
    }

    private static java.io.File j() {
        java.io.File file = new java.io.File(com.apm.insight.l.j.e(com.apm.insight.e.g()), "threads.txt");
        if (file.exists()) {
            return file;
        }
        file.getParentFile().mkdirs();
        try {
            file.createNewFile();
        } catch (java.io.IOException unused) {
        }
        com.apm.insight.nativecrash.NativeImpl.g(file.getAbsolutePath());
        return file;
    }

    public static java.io.File e() throws java.lang.Throwable {
        java.io.BufferedWriter bufferedWriter;
        java.io.File file = new java.io.File(com.apm.insight.l.j.e(com.apm.insight.e.g()), "anr_trace.txt");
        if (file.exists() || !com.apm.insight.runtime.a.e()) {
            return file;
        }
        java.io.File file2 = new java.io.File("/data/anr/traces.txt");
        if (!file2.exists()) {
            return file;
        }
        java.io.BufferedReader bufferedReader = null;
        try {
            file.getParentFile().mkdirs();
            java.io.BufferedReader bufferedReader2 = new java.io.BufferedReader(new java.io.FileReader(file2));
            try {
                bufferedWriter = new java.io.BufferedWriter(new java.io.FileWriter(file));
                int length = 0;
                do {
                    try {
                        java.lang.String line = bufferedReader2.readLine();
                        if (line == null) {
                            break;
                        }
                        bufferedWriter.write(line);
                        bufferedWriter.write(10);
                        length += line.length();
                    } catch (java.io.IOException unused) {
                        bufferedReader = bufferedReader2;
                        a((java.io.Closeable) bufferedReader);
                    } catch (java.lang.Throwable th) {
                        th = th;
                        bufferedReader = bufferedReader2;
                        a((java.io.Closeable) bufferedReader);
                        a((java.io.Closeable) bufferedWriter);
                        throw th;
                    }
                } while (length < 1048576);
                a((java.io.Closeable) bufferedReader2);
            } catch (java.io.IOException unused2) {
                bufferedWriter = null;
            } catch (java.lang.Throwable th2) {
                th = th2;
                bufferedWriter = null;
            }
        } catch (java.io.IOException unused3) {
            bufferedWriter = null;
        } catch (java.lang.Throwable th3) {
            th = th3;
            bufferedWriter = null;
        }
        a((java.io.Closeable) bufferedWriter);
        return file;
    }

    public static int f() {
        try {
            return new java.io.File("/proc/" + android.os.Process.myPid() + "/fd").listFiles().length;
        } catch (java.lang.Throwable unused) {
            return -1;
        }
    }

    public static void a(java.io.Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (java.lang.Throwable unused) {
            }
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

    public static void a(java.lang.String str) {
        com.apm.insight.h.a.a("android.os.FileUtils", "setPermissions", str, 493, -1, -1);
    }

    public static boolean a(org.json.JSONObject jSONObject) {
        return jSONObject == null || jSONObject.length() == 0;
    }

    public static boolean a(org.json.JSONArray jSONArray) {
        return jSONArray == null || jSONArray.length() == 0;
    }

    public static org.json.JSONArray b(org.json.JSONArray jSONArray) {
        int i;
        if (jSONArray.length() <= 384) {
            return jSONArray;
        }
        org.json.JSONArray jSONArray2 = new org.json.JSONArray();
        int i2 = 0;
        while (true) {
            if (i2 >= 256) {
                break;
            }
            jSONArray2.put(jSONArray.opt(i2));
            i2++;
        }
        for (i = 256; i < 384; i++) {
            jSONArray2.put(jSONArray.opt(jSONArray.length() - (384 - i)));
        }
        return jSONArray2;
    }

    public static java.lang.String a(org.json.JSONObject jSONObject, java.lang.String... strArr) {
        org.json.JSONObject jSONObjectB = b(jSONObject, strArr);
        if (jSONObjectB == null) {
            return null;
        }
        java.lang.String strOptString = jSONObjectB.optString(strArr[1]);
        a("ApmConfig", "normal get configArray: " + strArr[1] + " : " + strOptString);
        return strOptString;
    }

    public static org.json.JSONObject b(org.json.JSONObject jSONObject, java.lang.String... strArr) {
        if (jSONObject == null) {
            a("JSONUtil", "err get JsonFromParent: null json", new java.lang.RuntimeException());
            return null;
        }
        for (int i = 0; i < strArr.length - 1; i++) {
            jSONObject = jSONObject.optJSONObject(strArr[i]);
            if (jSONObject == null) {
                a("JSONUtil", "err get json: not found node:" + strArr[i]);
                return null;
            }
        }
        return jSONObject;
    }

    public static int a(org.json.JSONObject jSONObject, int i, java.lang.String... strArr) {
        org.json.JSONObject jSONObjectB = b(jSONObject, strArr);
        if (jSONObjectB == null) {
            return i;
        }
        int iOptInt = jSONObjectB.optInt(strArr[strArr.length - 1], i);
        a("JSONUtil", "normal get jsonInt: " + strArr[strArr.length - 1] + " : " + iOptInt);
        return iOptInt;
    }

    public static boolean a(org.json.JSONObject jSONObject, java.lang.String str) {
        return a(jSONObject) || a(jSONObject.optJSONArray(str));
    }

    public static void a(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2) {
        java.util.Iterator<java.lang.String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            try {
                java.lang.String next = itKeys.next();
                if (!jSONObject.has(next)) {
                    jSONObject.put(next, jSONObject2.opt(next));
                }
            } catch (java.lang.Throwable unused) {
                return;
            }
        }
    }

    public static org.json.JSONArray a(java.lang.String[] strArr) {
        if (strArr == null) {
            return null;
        }
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        for (java.lang.String str : strArr) {
            jSONArray.put(str);
        }
        return jSONArray;
    }

    public static void a(java.lang.Object obj) {
        if (com.apm.insight.e.i().isDebugMode()) {
            android.util.Log.i("npth", java.lang.String.valueOf(obj));
        }
    }

    public static void b(java.lang.Object obj) {
        if (com.apm.insight.e.i().isDebugMode()) {
            android.util.Log.d("npth", java.lang.String.valueOf(obj));
        }
    }

    public static void a(java.lang.Throwable th) {
        if (com.apm.insight.e.i().isDebugMode()) {
            android.util.Log.e("npth", "NPTH Catch Error", th);
        }
    }

    private static void a(java.lang.String str, java.lang.Object obj, java.lang.Throwable th) {
        if (com.apm.insight.e.i().isDebugMode()) {
            android.util.Log.e("npth", str + " " + obj, th);
        }
    }

    public static void a(java.lang.String str, java.lang.Object obj) {
        if (com.apm.insight.e.i().isDebugMode()) {
            android.util.Log.i("npth", str + " " + obj);
        }
    }

    public static void b(java.lang.Throwable th) {
        if (com.apm.insight.e.i().isDebugMode()) {
            android.util.Log.w("npth", "NPTH Catch Error", th);
        }
    }

    public static void a(com.apm.insight.entity.a aVar, com.apm.insight.entity.Header header, com.apm.insight.CrashType crashType) {
        org.json.JSONObject jSONObjectC;
        if (aVar == null || (jSONObjectC = aVar.c()) == null || crashType == null) {
            return;
        }
        long jOptLong = jSONObjectC.optLong("crash_time");
        java.lang.String strA = com.apm.insight.e.c().a();
        if (jOptLong <= 0 || android.text.TextUtils.isEmpty(crashType.getName())) {
            return;
        }
        try {
            java.lang.String str = "android__" + strA + "_" + jOptLong + "_" + crashType;
            if (header != null) {
                org.json.JSONObject jSONObjectF = header.f();
                if (jSONObjectF != null) {
                    jSONObjectF.put("unique_key", str);
                    return;
                }
                return;
            }
            jSONObjectC.put("unique_key", str);
        } catch (org.json.JSONException e) {
            e.printStackTrace();
        }
    }

    public static boolean b(java.lang.String str) {
        try {
            java.lang.System.loadLibrary(str);
            return true;
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }
}
