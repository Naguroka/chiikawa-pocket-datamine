package com.apm.insight.l;

/* JADX INFO: compiled from: FileUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f444a;
    private java.lang.String b;
    private org.json.JSONObject c;
    private byte[] d;

    public static void a(java.io.File file, java.lang.String str, boolean z) throws java.lang.Throwable {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        file.getParentFile().mkdirs();
        java.io.FileOutputStream fileOutputStream = null;
        try {
            java.io.FileOutputStream fileOutputStream2 = new java.io.FileOutputStream(file, z);
            try {
                fileOutputStream2.write(str.getBytes());
                fileOutputStream2.flush();
                com.apm.insight.a.a((java.io.Closeable) fileOutputStream2);
            } catch (java.lang.Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                com.apm.insight.a.a((java.io.Closeable) fileOutputStream);
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    public static void a(java.io.File file, org.json.JSONObject jSONObject) throws java.io.IOException {
        java.io.BufferedWriter bufferedWriter;
        if (jSONObject == null) {
            return;
        }
        file.getParentFile().mkdirs();
        try {
            bufferedWriter = new java.io.BufferedWriter(new java.io.FileWriter(file));
            try {
                com.apm.insight.l.h.a(jSONObject, bufferedWriter);
                com.apm.insight.a.a((java.io.Closeable) bufferedWriter);
            } catch (java.lang.Throwable unused) {
                com.apm.insight.a.a((java.io.Closeable) bufferedWriter);
            }
        } catch (java.lang.Throwable unused2) {
            bufferedWriter = null;
        }
    }

    public static void a(java.io.File file, org.json.JSONArray jSONArray) throws java.io.IOException {
        java.io.BufferedWriter bufferedWriter;
        if (jSONArray == null) {
            return;
        }
        file.getParentFile().mkdirs();
        try {
            bufferedWriter = new java.io.BufferedWriter(new java.io.FileWriter(file));
            try {
                com.apm.insight.l.h.a(jSONArray, bufferedWriter);
                com.apm.insight.a.a((java.io.Closeable) bufferedWriter);
            } catch (java.lang.Throwable unused) {
                com.apm.insight.a.a((java.io.Closeable) bufferedWriter);
            }
        } catch (java.lang.Throwable unused2) {
            bufferedWriter = null;
        }
    }

    public static boolean a(java.io.File file) {
        boolean zA;
        boolean z = true;
        if (!file.exists()) {
            return true;
        }
        if (!file.canWrite()) {
            return false;
        }
        if (file.isFile()) {
            return file.delete();
        }
        if (!file.isDirectory()) {
            return true;
        }
        java.io.File[] fileArrListFiles = file.listFiles();
        for (int i = 0; fileArrListFiles != null && i < fileArrListFiles.length; i++) {
            if (fileArrListFiles[i].isFile()) {
                if (fileArrListFiles[i].canWrite()) {
                    zA = fileArrListFiles[i].delete();
                } else {
                    z = false;
                }
            } else {
                zA = a(fileArrListFiles[i]);
            }
            z &= zA;
        }
        return z & file.delete();
    }

    public static java.lang.String a(java.lang.String str, java.lang.String str2) throws java.io.IOException {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        return b(new java.io.File(str), str2);
    }

    public static java.lang.String a(java.io.File file, java.lang.String str) throws java.io.IOException {
        return b(file, str);
    }

    private static java.lang.String b(java.io.File file, java.lang.String str) throws java.lang.Throwable {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.io.BufferedReader bufferedReader = null;
        try {
            java.io.BufferedReader bufferedReader2 = new java.io.BufferedReader(new java.io.FileReader(file));
            while (true) {
                try {
                    java.lang.String line = bufferedReader2.readLine();
                    if (line != null) {
                        if (sb.length() != 0 && str != null) {
                            sb.append(str);
                        }
                        sb.append(line);
                    } else {
                        com.apm.insight.a.a((java.io.Closeable) bufferedReader2);
                        return sb.toString();
                    }
                } catch (java.lang.Throwable th) {
                    th = th;
                    bufferedReader = bufferedReader2;
                    com.apm.insight.a.a((java.io.Closeable) bufferedReader);
                    throw th;
                }
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    public static org.json.JSONArray a(java.lang.String str) throws java.io.IOException {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        return a(new java.io.File(str), -1L);
    }

    public static org.json.JSONArray a(java.io.File file, long j) throws java.lang.Throwable {
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.io.BufferedReader bufferedReader = null;
        try {
            java.io.BufferedReader bufferedReader2 = new java.io.BufferedReader(new java.io.FileReader(file));
            if (j > 0) {
                try {
                    bufferedReader2.skip(j);
                    bufferedReader2.readLine();
                } catch (java.lang.Throwable th) {
                    th = th;
                    bufferedReader = bufferedReader2;
                    com.apm.insight.a.a((java.io.Closeable) bufferedReader);
                    throw th;
                }
            }
            while (true) {
                java.lang.String line = bufferedReader2.readLine();
                if (line != null) {
                    jSONArray.put(line);
                } else {
                    com.apm.insight.a.a((java.io.Closeable) bufferedReader2);
                    return jSONArray;
                }
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    public static boolean b(java.io.File file) {
        java.lang.String[] list = file.list();
        return list == null || list.length == 0;
    }

    private static com.apm.insight.entity.a f(java.io.File file) {
        com.apm.insight.entity.a aVarA = a(new java.io.File(file, "logEventStack"), file.getName().contains("oom"));
        boolean z = false;
        for (int i = 0; i < 6; i++) {
            java.io.File fileA = com.apm.insight.l.j.a(file, ".".concat(java.lang.String.valueOf(i)));
            if (fileA.exists()) {
                try {
                    aVarA.c(new org.json.JSONObject(a(fileA.getAbsolutePath(), "\n")));
                    z = true;
                } catch (java.lang.Throwable unused) {
                }
            }
        }
        aVarA.a("crash_type", z ? "step" : androidx.room.FtsOptions.TOKENIZER_SIMPLE);
        org.json.JSONObject jSONObjectOptJSONObject = aVarA.c().optJSONObject("header");
        com.apm.insight.e.g();
        org.json.JSONObject jSONObjectF = com.apm.insight.entity.Header.a(aVarA.c().optLong("crash_time", 0L)).f();
        if (jSONObjectOptJSONObject == null) {
            aVarA.a(jSONObjectF);
        } else {
            com.apm.insight.a.a(jSONObjectOptJSONObject, jSONObjectF);
        }
        return aVarA;
    }

    public static com.apm.insight.f.b a(java.io.File file, com.apm.insight.CrashType crashType) {
        java.lang.String strC;
        com.apm.insight.entity.a aVarF = f(file);
        java.lang.String name = file.getName();
        java.lang.String strSubstring = name.substring(name.lastIndexOf(95) + 1);
        org.json.JSONObject jSONObjectOptJSONObject = aVarF.c().optJSONObject("header");
        if (jSONObjectOptJSONObject.optString("unique_key", null) == null) {
            try {
                jSONObjectOptJSONObject.put("unique_key", "android_" + com.apm.insight.e.c().a() + "_" + strSubstring + "_" + com.apm.insight.CrashType.LAUNCH);
            } catch (java.lang.Throwable th) {
                th.printStackTrace();
            }
        }
        com.apm.insight.f.b bVar = new com.apm.insight.f.b();
        if (crashType == com.apm.insight.CrashType.LAUNCH) {
            strC = com.apm.insight.k.e.e();
        } else {
            strC = com.apm.insight.k.e.c();
        }
        bVar.a(strC);
        bVar.a(aVarF.c());
        bVar.a(com.apm.insight.k.e.a());
        return bVar;
    }

    /* JADX WARN: Code duplicated, block: B:72:0x0124  */
    private static com.apm.insight.entity.a a(java.io.File file, boolean z) {
        java.lang.String strA;
        java.lang.String str;
        java.lang.String str2;
        com.apm.insight.entity.a aVar = new com.apm.insight.entity.a();
        java.lang.String string = "InvalidStack.NoStackAvailable: Catch a OOM Exception without stack.\n";
        if (file.exists()) {
            try {
                strA = a(file.getAbsolutePath(), "\n");
            } catch (java.io.IOException unused) {
                strA = null;
            }
            if (android.text.TextUtils.isEmpty(strA)) {
                if (!z) {
                    string = "InvalidStack.NoStackAvailable: Catch a crash not OOM without stack.\n";
                }
                str2 = null;
                str = null;
            } else {
                java.lang.String[] strArrSplit = strA.split("\n");
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                boolean z2 = false;
                boolean z3 = false;
                for (java.lang.String str3 : strArrSplit) {
                    if (!z2 && str3.startsWith("stack:")) {
                        z2 = true;
                    } else if (!z3 && str3.startsWith("err:")) {
                        z3 = true;
                    } else if (z3) {
                        sb2.append(str3).append("\n");
                    } else if (z2) {
                        sb.append(str3).append("\n");
                    } else {
                        arrayList.add(str3);
                    }
                }
                java.lang.String str4 = arrayList.size() > 0 ? (java.lang.String) arrayList.get(0) : null;
                java.lang.String str5 = arrayList.size() >= 2 ? (java.lang.String) arrayList.get(1) : null;
                java.lang.String str6 = arrayList.size() >= 3 ? (java.lang.String) arrayList.get(2) : null;
                java.lang.String str7 = arrayList.size() >= 4 ? (java.lang.String) arrayList.get(3) : null;
                if (z2 && sb.length() > 0) {
                    string = sb.toString();
                } else if (str6 != null) {
                    string = str6 + "\nCaused by: " + (z ? "InvalidStack.NoStackAvailable: Catch a OOM Exception without stack.\n" : "InvalidStack.NoStackAvailable: Catch a crash not OOM without stack.\n");
                } else if (str5 != null) {
                    string = str5 + "\nCaused by: " + (z ? "InvalidStack.NoStackAvailable: Catch a OOM Exception without stack.\n" : "InvalidStack.NoStackAvailable: Catch a crash not OOM without stack.\n");
                } else if (!z) {
                    string = "InvalidStack.NoStackAvailable: Catch a crash not OOM without stack.\n";
                }
                if (z3 && sb2.length() > 0) {
                    string = string + "\nCaused by: InvalidStack.CrashWhenWriteStack: Npth error when dumpping the stack:\n" + ((java.lang.Object) sb2);
                }
                str = str4;
                str2 = str7;
            }
        } else {
            if (!z) {
                string = "InvalidStack.NoStackAvailable: Catch a crash not OOM without stack.\n";
            }
            str2 = null;
            str = null;
        }
        aVar.a("data", (java.lang.Object) string);
        aVar.a("process_name", (java.lang.Object) str);
        aVar.a("crash_thread_name", (java.lang.Object) str2);
        aVar.a("isOOM", java.lang.Boolean.valueOf(z));
        return aVar;
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0041: MOVE (r0 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:21:0x0041 */
    public static java.util.Map<java.lang.String, java.lang.String> c(java.io.File file) throws java.lang.Throwable {
        java.io.FileInputStream fileInputStream;
        java.io.Closeable closeable;
        java.io.Closeable closeable2 = null;
        try {
            try {
                java.util.Properties properties = new java.util.Properties();
                fileInputStream = new java.io.FileInputStream(file);
                try {
                    properties.load(fileInputStream);
                    java.util.Set<java.lang.String> setStringPropertyNames = properties.stringPropertyNames();
                    java.util.HashMap map = new java.util.HashMap();
                    for (java.lang.String str : setStringPropertyNames) {
                        map.put(str, properties.getProperty(str));
                    }
                    com.apm.insight.a.a((java.io.Closeable) fileInputStream);
                    return map;
                } catch (java.io.IOException e) {
                    e = e;
                    com.apm.insight.a.b((java.lang.Throwable) e);
                    com.apm.insight.a.a((java.io.Closeable) fileInputStream);
                    return null;
                }
            } catch (java.lang.Throwable th) {
                th = th;
                closeable2 = closeable;
                com.apm.insight.a.a(closeable2);
                throw th;
            }
        } catch (java.io.IOException e2) {
            e = e2;
            fileInputStream = null;
        } catch (java.lang.Throwable th2) {
            th = th2;
            com.apm.insight.a.a(closeable2);
            throw th;
        }
    }

    public static void a(java.io.File file, java.util.Map<java.lang.String, java.lang.String> map) throws java.lang.Throwable {
        if (map == null || map.isEmpty()) {
            return;
        }
        java.io.FileOutputStream fileOutputStream = null;
        try {
            try {
                java.util.Properties properties = new java.util.Properties();
                java.io.FileOutputStream fileOutputStream2 = new java.io.FileOutputStream(file);
                try {
                    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
                        properties.setProperty(entry.getKey(), entry.getValue());
                    }
                    properties.store(fileOutputStream2, "no");
                    com.apm.insight.a.a((java.io.Closeable) fileOutputStream2);
                } catch (java.io.IOException e) {
                    e = e;
                    fileOutputStream = fileOutputStream2;
                    com.apm.insight.a.b((java.lang.Throwable) e);
                    com.apm.insight.a.a((java.io.Closeable) fileOutputStream);
                } catch (java.lang.Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    com.apm.insight.a.a((java.io.Closeable) fileOutputStream);
                    throw th;
                }
            } catch (java.io.IOException e2) {
                e = e2;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    public static java.lang.String a(java.io.File file, java.lang.String str, java.lang.String str2, org.json.JSONObject jSONObject, boolean z) {
        return b(file, str, str2, jSONObject, z);
    }

    private static java.lang.String b(java.io.File file, java.lang.String str, java.lang.String str2, org.json.JSONObject jSONObject, boolean z) {
        if (!file.exists()) {
            file.mkdirs();
        }
        java.io.File file2 = new java.io.File(file, str);
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put("url", str2);
            jSONObject2.put("body", jSONObject);
            jSONObject2.put("dump_file", "");
            jSONObject2.put("encrypt", z);
            a(file2, jSONObject2);
        } catch (java.io.IOException e) {
            e.printStackTrace();
        } catch (org.json.JSONException e2) {
            e2.printStackTrace();
        }
        return file2.getAbsolutePath();
    }

    public static void a(java.io.File file, java.io.File file2) throws java.lang.Throwable {
        java.io.FileOutputStream fileOutputStream;
        if (file2 == null) {
            return;
        }
        java.io.FileInputStream fileInputStream = null;
        try {
            file2.getParentFile().mkdirs();
            java.io.FileInputStream fileInputStream2 = new java.io.FileInputStream(file);
            try {
                fileOutputStream = new java.io.FileOutputStream(file2);
                try {
                    byte[] bArr = new byte[8192];
                    while (true) {
                        int i = fileInputStream2.read(bArr);
                        if (i <= 0) {
                            break;
                        } else {
                            fileOutputStream.write(bArr, 0, i);
                        }
                    }
                    com.apm.insight.a.a((java.io.Closeable) fileInputStream2);
                } catch (java.lang.Exception e) {
                    e = e;
                    fileInputStream = fileInputStream2;
                    try {
                        e.printStackTrace();
                        com.apm.insight.a.a((java.io.Closeable) fileInputStream);
                    } catch (java.lang.Throwable th) {
                        th = th;
                        com.apm.insight.a.a((java.io.Closeable) fileInputStream);
                        com.apm.insight.a.a((java.io.Closeable) fileOutputStream);
                        throw th;
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    fileInputStream = fileInputStream2;
                    com.apm.insight.a.a((java.io.Closeable) fileInputStream);
                    com.apm.insight.a.a((java.io.Closeable) fileOutputStream);
                    throw th;
                }
            } catch (java.lang.Exception e2) {
                e = e2;
                fileOutputStream = null;
            } catch (java.lang.Throwable th3) {
                th = th3;
                fileOutputStream = null;
            }
        } catch (java.lang.Exception e3) {
            e = e3;
            fileOutputStream = null;
        } catch (java.lang.Throwable th4) {
            th = th4;
            fileOutputStream = null;
        }
        com.apm.insight.a.a((java.io.Closeable) fileOutputStream);
    }

    public static void b(java.lang.String str, java.lang.String str2) throws java.lang.Exception {
        java.util.zip.ZipOutputStream zipOutputStream;
        java.lang.Throwable th;
        java.io.File file = new java.io.File(str);
        try {
            new java.io.File(str2).getParentFile().mkdirs();
            zipOutputStream = new java.util.zip.ZipOutputStream(new java.io.FileOutputStream(str2));
            try {
                a(zipOutputStream, file, "");
                com.apm.insight.a.a((java.io.Closeable) zipOutputStream);
            } catch (java.lang.Throwable th2) {
                th = th2;
                com.apm.insight.a.a((java.io.Closeable) zipOutputStream);
                throw th;
            }
        } catch (java.lang.Throwable th3) {
            zipOutputStream = null;
            th = th3;
        }
    }

    public static void a(java.io.OutputStream outputStream, java.io.File... fileArr) throws java.io.IOException {
        java.util.zip.ZipOutputStream zipOutputStream = null;
        try {
            java.util.zip.ZipOutputStream zipOutputStream2 = new java.util.zip.ZipOutputStream(outputStream);
            try {
                zipOutputStream2.putNextEntry(new java.util.zip.ZipEntry("/"));
                for (java.io.File file : fileArr) {
                    a(zipOutputStream2, file);
                }
                com.apm.insight.a.a((java.io.Closeable) zipOutputStream2);
            } catch (java.lang.Throwable th) {
                th = th;
                zipOutputStream = zipOutputStream2;
                com.apm.insight.a.a((java.io.Closeable) zipOutputStream);
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    private static void a(java.util.zip.ZipOutputStream zipOutputStream, java.io.File file) throws java.lang.Throwable {
        if (file == null || !file.exists()) {
            return;
        }
        java.io.File[] fileArrListFiles = file.isDirectory() ? file.listFiles() : new java.io.File[]{file};
        if (fileArrListFiles == null) {
            return;
        }
        for (java.io.File file2 : fileArrListFiles) {
            a(zipOutputStream, file2, file2.getName());
        }
    }

    private static void a(java.util.zip.ZipOutputStream zipOutputStream, java.io.File file, java.lang.String str) throws java.lang.Throwable {
        if (file == null || !file.exists()) {
            return;
        }
        if (file.isDirectory()) {
            java.io.File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                return;
            }
            zipOutputStream.putNextEntry(new java.util.zip.ZipEntry(str + "/"));
            java.lang.String str2 = str.length() == 0 ? "" : str + "/";
            for (int i = 0; i < fileArrListFiles.length; i++) {
                a(zipOutputStream, fileArrListFiles[i], str2 + fileArrListFiles[i].getName());
            }
            return;
        }
        zipOutputStream.putNextEntry(new java.util.zip.ZipEntry(str));
        java.io.FileInputStream fileInputStream = null;
        try {
            java.io.FileInputStream fileInputStream2 = new java.io.FileInputStream(file);
            try {
                byte[] bArr = new byte[4096];
                while (true) {
                    int i2 = fileInputStream2.read(bArr);
                    if (-1 != i2) {
                        zipOutputStream.write(bArr, 0, i2);
                    } else {
                        com.apm.insight.a.a((java.io.Closeable) fileInputStream2);
                        return;
                    }
                }
            } catch (java.lang.Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                com.apm.insight.a.a((java.io.Closeable) fileInputStream);
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    public static void d(java.io.File file) {
        java.io.File file2 = new java.io.File(file, "lock");
        try {
            file2.createNewFile();
            com.apm.insight.nativecrash.NativeImpl.c(file2.getAbsolutePath());
        } catch (java.lang.Throwable th) {
            com.apm.insight.c.a();
            com.apm.insight.runtime.k.a(th, "NPTH_CATCH");
        }
    }

    public static boolean e(java.io.File file) {
        if (!file.isFile()) {
            file = new java.io.File(file, "lock");
        }
        if (!file.exists()) {
            return false;
        }
        try {
            int iC = com.apm.insight.nativecrash.NativeImpl.c(file.getAbsolutePath());
            if (iC > 0) {
                com.apm.insight.nativecrash.NativeImpl.a(iC);
                return false;
            }
            if (iC < 0) {
                return true;
            }
        } catch (java.lang.Throwable th) {
            com.apm.insight.c.a();
            com.apm.insight.runtime.k.a(th, "NPTH_CATCH");
        }
        return false;
    }

    public static com.apm.insight.f.b b(java.lang.String str) {
        try {
            java.lang.String strA = a(str, "\n");
            if (strA == null) {
                return null;
            }
            org.json.JSONObject jSONObject = new org.json.JSONObject(strA);
            com.apm.insight.f.b bVar = new com.apm.insight.f.b();
            bVar.a(jSONObject.optString("url"));
            bVar.a(jSONObject.optJSONObject("body"));
            bVar.b(jSONObject.optString("dump_file"));
            bVar.a(jSONObject.optBoolean("encrypt", false));
            return bVar;
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    public static com.apm.insight.f.b c(java.lang.String str) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(a(str, "\n"));
            com.apm.insight.f.b bVar = new com.apm.insight.f.b();
            bVar.d(jSONObject.optString(com.json.tk.SESSION_HISTORY_KEY_AD_ID));
            bVar.c(jSONObject.optString("did"));
            bVar.e(jSONObject.optString("processName"));
            java.util.ArrayList arrayList = new java.util.ArrayList();
            org.json.JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("alogFiles");
            if (jSONArrayOptJSONArray != null) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    arrayList.add(jSONArrayOptJSONArray.getString(i));
                }
                bVar.a(arrayList);
            }
            return bVar;
        } catch (java.io.IOException e) {
            e.printStackTrace();
            return null;
        } catch (org.json.JSONException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public f(int i) {
        this.f444a = i;
    }

    public f(byte[] bArr) {
        this.f444a = 204;
        this.d = bArr;
    }

    public f(int i, java.lang.Throwable th) {
        this.f444a = i;
        this.b = th.getMessage();
    }

    public f(java.lang.String str) {
        this.f444a = com.ironsource.g3.c.b.g;
        this.b = str;
    }

    public f(org.json.JSONObject jSONObject) {
        this.f444a = 0;
        this.c = jSONObject;
    }

    public final boolean a() {
        return this.f444a != 207;
    }

    public final byte[] b() {
        return this.d;
    }
}
