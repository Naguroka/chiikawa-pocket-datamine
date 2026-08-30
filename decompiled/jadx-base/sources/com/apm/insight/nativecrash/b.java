package com.apm.insight.nativecrash;

/* JADX INFO: compiled from: NativeFileParser.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private android.content.Context f459a;
    private com.apm.insight.ICommonParams b;
    private com.apm.insight.ICommonParams c;

    /* JADX INFO: compiled from: NativeFileParser.java */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected java.io.File f460a;
        protected java.lang.String b;
        protected java.lang.String c;
        protected int d;

        public c(java.io.File file) {
            this.f460a = file;
        }

        public final int a() {
            int i;
            java.lang.Throwable th;
            if (!this.f460a.exists() || !this.f460a.isFile()) {
                return -1;
            }
            java.io.BufferedReader bufferedReader = null;
            try {
                java.io.BufferedReader bufferedReader2 = new java.io.BufferedReader(new java.io.FileReader(this.f460a));
                int iA = -1;
                do {
                    try {
                        java.lang.String line = bufferedReader2.readLine();
                        if (line == null) {
                            break;
                        }
                        iA = a(line);
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        i = iA;
                        bufferedReader = bufferedReader2;
                        try {
                            com.apm.insight.c.a();
                            com.apm.insight.runtime.k.a(th, "NPTH_CATCH");
                            return i;
                        } finally {
                            if (bufferedReader != null) {
                                com.apm.insight.a.a((java.io.Closeable) bufferedReader);
                            }
                        }
                    }
                } while (iA == -1);
                com.apm.insight.a.a((java.io.Closeable) bufferedReader2);
                return iA;
            } catch (java.lang.Throwable th3) {
                i = -1;
                th = th3;
            }
        }

        private int a(java.lang.String str) {
            int i = this.d;
            if (!str.startsWith(this.b)) {
                return i;
            }
            try {
                i = java.lang.Integer.parseInt(str.split(this.c)[1].trim());
            } catch (java.lang.NumberFormatException e) {
                com.apm.insight.c.a();
                com.apm.insight.runtime.k.a(e, "NPTH_CATCH");
            }
            if (i < 0) {
                return -2;
            }
            return i;
        }
    }

    /* JADX INFO: renamed from: com.apm.insight.nativecrash.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: NativeFileParser.java */
    public static class C0021b extends com.apm.insight.nativecrash.b.c {
        C0021b(java.io.File file) {
            super(file);
            this.b = "VmSize:";
            this.c = "\\s+";
            this.d = -1;
        }
    }

    /* JADX INFO: compiled from: NativeFileParser.java */
    public static class f extends com.apm.insight.nativecrash.b.c {
        f(java.io.File file) {
            super(file);
            this.b = "Total Threads Count:";
            this.c = ":";
            this.d = -2;
        }
    }

    /* JADX INFO: compiled from: NativeFileParser.java */
    public static class a extends com.apm.insight.nativecrash.b.c {
        a(java.io.File file) {
            super(file);
            this.b = "Total FD Count:";
            this.c = ":";
            this.d = -2;
        }
    }

    /* JADX INFO: compiled from: NativeFileParser.java */
    public static class d extends com.apm.insight.nativecrash.b.c {
        d(java.io.File file) {
            super(file);
        }

        public final java.util.HashMap<java.lang.String, java.util.List<java.lang.String>> b() {
            java.util.HashMap<java.lang.String, java.util.List<java.lang.String>> map = new java.util.HashMap<>();
            try {
                org.json.JSONArray jSONArrayA = com.apm.insight.l.f.a(this.f460a.getAbsolutePath());
                if (jSONArrayA == null) {
                    return map;
                }
                for (int i = 0; i < jSONArrayA.length(); i++) {
                    java.lang.String strOptString = jSONArrayA.optString(i);
                    if (!android.text.TextUtils.isEmpty(strOptString) && strOptString.startsWith("[tid:0") && strOptString.endsWith("sigstack:0x0]")) {
                        int iIndexOf = strOptString.indexOf("[routine:0x");
                        int i2 = iIndexOf + 11;
                        java.lang.String strSubstring = iIndexOf > 0 ? strOptString.substring(i2, strOptString.indexOf(93, i2)) : "unknown addr";
                        java.util.List<java.lang.String> arrayList = map.get(strSubstring);
                        if (arrayList == null) {
                            arrayList = new java.util.ArrayList<>();
                            map.put(strSubstring, arrayList);
                        }
                        arrayList.add(strOptString);
                    }
                }
            } catch (java.io.IOException unused) {
            } catch (java.lang.Throwable th) {
                com.apm.insight.c.a();
                com.apm.insight.runtime.k.a(th, "NPTH_CATCH");
            }
            return map;
        }
    }

    /* JADX INFO: compiled from: NativeFileParser.java */
    public static class e extends com.apm.insight.nativecrash.b.c {
        e(java.io.File file) {
            super(file);
        }

        public final org.json.JSONArray a(java.util.HashMap<java.lang.String, java.util.List<java.lang.String>> map) {
            int iIndexOf;
            java.util.List<java.lang.String> list;
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            if (map.isEmpty()) {
                return jSONArray;
            }
            try {
                org.json.JSONArray jSONArrayA = com.apm.insight.l.f.a(this.f460a.getAbsolutePath());
                if (jSONArrayA == null) {
                    return jSONArray;
                }
                for (int i = 0; i < jSONArrayA.length(); i++) {
                    java.lang.String strOptString = jSONArrayA.optString(i);
                    if (!android.text.TextUtils.isEmpty(strOptString) && (iIndexOf = strOptString.indexOf(":")) > 2) {
                        java.lang.String strSubstring = strOptString.substring(2, iIndexOf);
                        if (map.containsKey(strSubstring) && (list = map.get(strSubstring)) != null) {
                            java.util.Iterator<java.lang.String> it = list.iterator();
                            while (it.hasNext()) {
                                jSONArray.put(it.next() + " " + strOptString);
                            }
                            map.remove(strSubstring);
                        }
                    }
                }
                java.util.Iterator<java.util.List<java.lang.String>> it2 = map.values().iterator();
                while (it2.hasNext()) {
                    java.util.Iterator<java.lang.String> it3 = it2.next().iterator();
                    while (it3.hasNext()) {
                        jSONArray.put(it3.next() + "  0x000000:unknown");
                    }
                }
            } catch (java.io.IOException unused) {
            } catch (java.lang.Throwable th) {
                com.apm.insight.c.a();
                com.apm.insight.runtime.k.a(th, "NPTH_CATCH");
            }
            return jSONArray;
        }
    }

    public static org.json.JSONArray a(java.io.File file, java.io.File file2) {
        return new com.apm.insight.nativecrash.b.e(file2).a(new com.apm.insight.nativecrash.b.d(file).b());
    }

    public static int a(java.lang.String str) {
        return new com.apm.insight.nativecrash.b.a(com.apm.insight.l.j.b(str)).a();
    }

    public static int b(java.lang.String str) {
        return new com.apm.insight.nativecrash.b.f(com.apm.insight.l.j.c(str)).a();
    }

    public static int c(java.lang.String str) {
        return new com.apm.insight.nativecrash.b.C0021b(com.apm.insight.l.j.d(str)).a();
    }

    public b(android.content.Context context, com.apm.insight.ICommonParams iCommonParams) {
        this(context, iCommonParams, null);
    }

    public b(android.content.Context context, com.apm.insight.ICommonParams iCommonParams, com.apm.insight.nativecrash.b bVar) {
        this.f459a = context;
        this.b = iCommonParams;
        this.c = bVar == null ? null : bVar.b;
    }

    public final java.util.Map<java.lang.String, java.lang.Object> a() {
        java.lang.Object obj;
        java.util.Map<java.lang.String, java.lang.Object> mapB = b();
        if (((mapB == null || (obj = mapB.get(com.json.tk.SESSION_HISTORY_KEY_AD_ID)) == null) ? null : java.lang.String.valueOf(obj)) == null) {
            mapB.put(com.json.tk.SESSION_HISTORY_KEY_AD_ID, 4444);
        }
        return mapB;
    }

    public final java.util.Map<java.lang.String, java.lang.Object> b() {
        java.util.Map<java.lang.String, java.lang.Object> map;
        java.lang.Throwable th;
        java.util.Map<java.lang.String, java.lang.Object> map2;
        try {
            com.apm.insight.ICommonParams iCommonParams = this.c;
            if (iCommonParams != null) {
                map2 = iCommonParams.getCommonParams();
            } else {
                map2 = new java.util.HashMap<>();
            }
            try {
                map2.putAll(this.b.getCommonParams());
                th = null;
            } catch (java.lang.Throwable th2) {
                map = map2;
                th = th2;
                java.util.Map<java.lang.String, java.lang.Object> map3 = map;
                th = th;
                map2 = map3;
            }
        } catch (java.lang.Throwable th3) {
            th = th3;
            map = null;
        }
        if (map2 == null) {
            map2 = new java.util.HashMap<>(4);
            if (th != null) {
                try {
                    map2.put("err_info", com.apm.insight.l.m.a(th));
                } catch (java.lang.Throwable unused) {
                }
            }
        }
        if (a(map2)) {
            try {
                android.content.pm.PackageInfo packageInfo = this.f459a.getPackageManager().getPackageInfo(this.f459a.getPackageName(), 128);
                map2.put("version_name", packageInfo.versionName);
                map2.put("version_code", java.lang.Integer.valueOf(packageInfo.versionCode));
                if (map2.get("update_version_code") == null) {
                    java.lang.Object obj = packageInfo.applicationInfo.metaData != null ? packageInfo.applicationInfo.metaData.get("UPDATE_VERSION_CODE") : null;
                    if (obj == null) {
                        obj = map2.get("version_code");
                    }
                    map2.put("update_version_code", obj);
                }
            } catch (java.lang.Throwable unused2) {
                map2.put("version_name", com.apm.insight.l.a.e(this.f459a));
                map2.put("version_code", java.lang.Integer.valueOf(com.apm.insight.l.a.f(this.f459a)));
                if (map2.get("update_version_code") == null) {
                    map2.put("update_version_code", map2.get("version_code"));
                }
            }
        } else {
            try {
                java.lang.String str = this.f459a.getPackageManager().getPackageInfo(this.f459a.getPackageName(), 128).versionName;
                java.lang.String str2 = (java.lang.String) java.lang.Class.forName(this.f459a.getPackageName() + ".BuildConfig").getDeclaredField("VERSION_NAME").get(null);
                if (str != null && !str.equals(str2)) {
                    map2.put("manifest_version", str);
                }
            } catch (java.lang.Throwable unused3) {
            }
        }
        return map2;
    }

    public static boolean a(java.util.Map<java.lang.String, java.lang.Object> map) {
        if (map == null || map.isEmpty()) {
            return true;
        }
        return ((map.containsKey("app_version") || map.containsKey("version_name")) && map.containsKey("version_code") && map.containsKey("update_version_code")) ? false : true;
    }

    public final com.apm.insight.ICommonParams c() {
        return this.b;
    }

    public final java.lang.String d() {
        try {
            return this.b.getDeviceId();
        } catch (java.lang.Throwable unused) {
            return "";
        }
    }

    public final java.lang.String e() {
        try {
            return java.lang.String.valueOf(this.b.getCommonParams().get(com.json.tk.SESSION_HISTORY_KEY_AD_ID));
        } catch (java.lang.Throwable unused) {
            return "4444";
        }
    }

    public final long f() {
        try {
            return this.b.getUserId();
        } catch (java.lang.Throwable unused) {
            return 0L;
        }
    }
}
