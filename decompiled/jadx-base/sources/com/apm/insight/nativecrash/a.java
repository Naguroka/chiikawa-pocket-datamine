package com.apm.insight.nativecrash;

/* JADX INFO: compiled from: NativeCrashFileManager.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a {
    private static java.lang.Boolean d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f456a;
    private org.json.JSONObject b = null;
    private com.apm.insight.nativecrash.a.b c;

    public a(android.content.Context context) {
        this.f456a = context;
    }

    public final void a(java.io.File file) {
        this.c = new com.apm.insight.nativecrash.a.b(file);
    }

    /* JADX INFO: compiled from: NativeCrashFileManager.java */
    class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.apm.insight.nativecrash.c f457a;
        private final com.apm.insight.h.b b;
        private final java.io.File c;
        private final java.io.File d;

        public b(java.io.File file) {
            this.c = file;
            this.d = com.apm.insight.l.j.a(com.apm.insight.e.g(), file.getName());
            com.apm.insight.h.b bVar = new com.apm.insight.h.b(file);
            this.b = bVar;
            com.apm.insight.nativecrash.c cVar = new com.apm.insight.nativecrash.c(file);
            this.f457a = cVar;
            if (bVar.d() && cVar.a() == null) {
                cVar.a(file);
            }
        }

        /* JADX WARN: Code duplicated, block: B:11:0x001c A[Catch: all -> 0x0017, TRY_LEAVE, TryCatch #0 {all -> 0x0017, blocks: (B:4:0x0008, B:6:0x000e, B:11:0x001c), top: B:16:0x0008 }] */
        /* JADX WARN: Code duplicated, block: B:9:0x0019  */
        public final long a() {
            java.lang.String str;
            java.util.Map<java.lang.String, java.lang.String> mapF = this.b.f();
            if (mapF != null) {
                try {
                    if (mapF.isEmpty()) {
                        str = null;
                    } else {
                        str = mapF.get("start_time");
                    }
                    if (str != null) {
                        return java.lang.Long.parseLong(str);
                    }
                } catch (java.lang.Throwable th) {
                    com.apm.insight.c.a();
                    com.apm.insight.runtime.k.a(th, "NPTH_CATCH");
                }
            } else {
                str = null;
                if (str != null) {
                    return java.lang.Long.parseLong(str);
                }
            }
            return java.lang.System.currentTimeMillis();
        }

        public final java.io.File b() {
            return this.c;
        }

        public final boolean c() {
            return this.b.d();
        }
    }

    private java.lang.String l() {
        com.apm.insight.nativecrash.a.b bVar = this.c;
        if (bVar == null) {
            return null;
        }
        java.lang.String strC = bVar.f457a.c();
        return (strC == null || strC.isEmpty()) ? this.c.b.e() : strC;
    }

    public final boolean a() {
        com.apm.insight.nativecrash.a.b bVar = this.c;
        if (bVar != null) {
            return bVar.c();
        }
        return false;
    }

    public final org.json.JSONObject b() {
        java.io.File fileF = com.apm.insight.l.j.f(this.c.b());
        if (!fileF.exists()) {
            return null;
        }
        try {
            java.lang.String strA = com.apm.insight.l.f.a(fileF.getAbsolutePath(), "\n");
            if (strA != null && !strA.isEmpty()) {
                return new org.json.JSONObject(strA);
            }
        } catch (java.lang.Throwable th) {
            com.apm.insight.c.a();
            com.apm.insight.runtime.k.a(th, "NPTH_CATCH");
        }
        return null;
    }

    public final void c() {
        java.io.BufferedWriter bufferedWriter;
        java.lang.Throwable th;
        try {
            java.io.File fileE = com.apm.insight.l.j.e(this.c.b());
            java.io.File file = new java.io.File(fileE.getAbsolutePath() + ".tmp'");
            if (file.exists()) {
                file.delete();
            }
            int i = 0;
            if (fileE.exists()) {
                while (i < com.apm.insight.nativecrash.NativeCrashCollector.a()) {
                    java.io.File file2 = new java.io.File(fileE.getAbsolutePath() + '.' + i);
                    if (file2.exists()) {
                        file2.delete();
                    }
                    i++;
                }
                return;
            }
            com.apm.insight.entity.a aVar = new com.apm.insight.entity.a();
            for (int i2 = 0; i2 < com.apm.insight.nativecrash.NativeCrashCollector.a(); i2++) {
                java.io.File file3 = new java.io.File(fileE.getAbsolutePath() + '.' + i2);
                if (file3.exists()) {
                    try {
                        java.lang.String strA = com.apm.insight.l.f.a(file3.getAbsolutePath(), "\n");
                        if (!android.text.TextUtils.isEmpty(strA)) {
                            org.json.JSONObject jSONObject = new org.json.JSONObject(strA);
                            if (jSONObject.length() > 0) {
                                aVar.c(jSONObject);
                            }
                        }
                    } catch (org.json.JSONException e2) {
                        com.apm.insight.c.a();
                        com.apm.insight.runtime.k.a(e2, "NPTH_CATCH");
                    }
                }
            }
            org.json.JSONObject jSONObjectC = aVar.c();
            try {
                if (jSONObjectC.length() != 0 && jSONObjectC.opt(com.ironsource.y8.a.k) == null) {
                    com.apm.insight.e.g();
                    com.apm.insight.entity.a.a(jSONObjectC, com.apm.insight.l.n.a());
                }
            } catch (java.lang.Throwable unused) {
            }
            if (jSONObjectC.length() != 0) {
                this.b = jSONObjectC;
                if (jSONObjectC != null) {
                    file.getParentFile().mkdirs();
                    try {
                        bufferedWriter = new java.io.BufferedWriter(new java.io.FileWriter(file));
                        try {
                            com.apm.insight.l.h.a(jSONObjectC, bufferedWriter);
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            try {
                                try {
                                    jSONObjectC.put("err_write", th.toString());
                                    com.apm.insight.entity.a.a(jSONObjectC, "filters", "err_write", th.getLocalizedMessage());
                                } catch (java.lang.Throwable th3) {
                                    com.apm.insight.a.a((java.io.Closeable) bufferedWriter);
                                    throw th3;
                                }
                            } catch (org.json.JSONException unused2) {
                            }
                            com.apm.insight.c.a();
                            com.apm.insight.runtime.k.a(th, "NPTH_CATCH");
                        }
                    } catch (java.lang.Throwable th4) {
                        bufferedWriter = null;
                        th = th4;
                    }
                    com.apm.insight.a.a((java.io.Closeable) bufferedWriter);
                }
                if (file.renameTo(fileE)) {
                    while (i < com.apm.insight.nativecrash.NativeCrashCollector.a()) {
                        java.io.File file4 = new java.io.File(fileE.getAbsolutePath() + '.' + i);
                        if (file4.exists()) {
                            file4.delete();
                        }
                        i++;
                    }
                }
            }
        } catch (java.io.IOException e3) {
            com.apm.insight.c.a();
            com.apm.insight.runtime.k.a(e3, "NPTH_CATCH");
        }
    }

    public final boolean d() {
        com.apm.insight.ICrashFilter iCrashFilterB = com.apm.insight.e.b().b();
        if (iCrashFilterB == null) {
            return true;
        }
        try {
            return iCrashFilterB.onNativeCrashFilter(l(), "");
        } catch (java.lang.Throwable th) {
            com.apm.insight.c.a();
            com.apm.insight.runtime.k.a(th, "NPTH_CATCH");
            return true;
        }
    }

    public final boolean e() {
        return com.apm.insight.e.a.a().a(com.apm.insight.l.j.f(this.c.b()).getAbsolutePath());
    }

    public final void f() {
        com.apm.insight.e.a.a().a(com.apm.insight.d.a.b(com.apm.insight.l.j.f(this.c.b()).getAbsolutePath()));
    }

    public static long g() {
        if (com.apm.insight.nativecrash.NativeImpl.f()) {
            return Long.MAX_VALUE;
        }
        return com.apm.insight.entity.Header.a() ? 3891200L : 2867200L;
    }

    /* JADX INFO: renamed from: com.apm.insight.nativecrash.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: NativeCrashFileManager.java */
    static class C0020a {
        /* JADX INFO: Access modifiers changed from: private */
        public static java.lang.String b(java.io.File file) {
            java.io.BufferedReader bufferedReader = null;
            try {
                java.io.BufferedReader bufferedReader2 = new java.io.BufferedReader(new java.io.FileReader(file));
                try {
                    java.lang.String line = bufferedReader2.readLine();
                    if (line != null) {
                        if (line.startsWith("[FATAL:jni_android.cc") && line.contains("Please include Java exception stack in crash report ttwebview:")) {
                            java.lang.StringBuilder sb = new java.lang.StringBuilder();
                            int iIndexOf = line.indexOf(" ttwebview:");
                            sb.append("Caused by: ");
                            sb.append("Please include Java exception stack in crash report");
                            sb.append("\n");
                            sb.append(line.substring(iIndexOf + 11));
                            sb.append("\n");
                            while (true) {
                                java.lang.String line2 = bufferedReader2.readLine();
                                if (line2 != null) {
                                    sb.append(line2);
                                    sb.append("\n");
                                } else {
                                    java.lang.String string = sb.toString();
                                    com.apm.insight.a.a((java.io.Closeable) bufferedReader2);
                                    return string;
                                }
                            }
                        } else {
                            com.apm.insight.a.a((java.io.Closeable) bufferedReader2);
                        }
                    } else {
                        com.apm.insight.a.a((java.io.Closeable) bufferedReader2);
                        return "";
                    }
                } catch (java.lang.Throwable th) {
                    th = th;
                    bufferedReader = bufferedReader2;
                    try {
                        com.apm.insight.c.a();
                        com.apm.insight.runtime.k.a(th, "NPTH_CATCH");
                    } finally {
                        com.apm.insight.a.a((java.io.Closeable) bufferedReader);
                    }
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
            }
            return "";
        }
    }

    private void a(com.apm.insight.entity.a aVar) {
        java.io.File fileA = com.apm.insight.l.j.a(this.c.b());
        if (fileA.exists()) {
            try {
                java.lang.String strA = com.apm.insight.l.f.a(fileA.getAbsolutePath(), "\n");
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                if (strA != null) {
                    for (java.lang.String str : strA.split("\n")) {
                        jSONArray.put(str);
                    }
                }
                aVar.a("native_log", (java.lang.Object) jSONArray);
            } catch (java.lang.Throwable th) {
                com.apm.insight.c.a();
                com.apm.insight.runtime.k.a(th, "NPTH_CATCH");
            }
        }
    }

    private void b(com.apm.insight.entity.a aVar) {
        java.io.BufferedReader bufferedReader;
        java.io.File fileH = com.apm.insight.l.j.h(this.c.b());
        if (!fileH.exists()) {
            com.apm.insight.nativecrash.NativeImpl.a(fileH.getAbsolutePath(), java.lang.String.valueOf(com.apm.insight.e.i().getLogcatDumpCount()), java.lang.String.valueOf(com.apm.insight.e.i().getLogcatLevel()));
        }
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.lang.String str = " " + this.c.b.f().get("pid") + " ";
        try {
            bufferedReader = new java.io.BufferedReader(new java.io.FileReader(fileH));
            try {
                if (fileH.length() > 512000) {
                    bufferedReader.skip(fileH.length() - 512000);
                }
                while (true) {
                    java.lang.String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    if ((line.length() > 32 ? line.substring(0, 31) : line).contains(str)) {
                        jSONArray.put(line);
                    }
                }
            } catch (java.lang.Throwable unused) {
            }
        } catch (java.lang.Throwable unused2) {
            bufferedReader = null;
        }
        com.apm.insight.a.a((java.io.Closeable) bufferedReader);
        aVar.a("logcat", (java.lang.Object) jSONArray);
    }

    public final org.json.JSONObject h() {
        try {
            com.apm.insight.entity.a aVar = new com.apm.insight.entity.a();
            com.apm.insight.entity.Header header = new com.apm.insight.entity.Header(this.f456a);
            org.json.JSONObject jSONObjectA = com.apm.insight.runtime.q.a().a(this.c.a());
            if (jSONObjectA != null) {
                header.a(jSONObjectA);
                header.d();
                header.e();
            }
            com.apm.insight.entity.Header.b(header);
            aVar.a(header);
            boolean z = true;
            aVar.a("is_native_crash", (java.lang.Object) 1);
            aVar.a("repack_time", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            aVar.a("crash_uuid", this.c.b().getName());
            aVar.a("jiffy", java.lang.Long.valueOf(com.apm.insight.runtime.o.a.a()));
            com.apm.insight.nativecrash.a.b bVar = this.c;
            java.util.Map<java.lang.String, java.lang.String> mapF = bVar != null ? bVar.b.f() : null;
            if (mapF != null) {
                java.lang.Object obj = (java.lang.String) mapF.get("process_name");
                if (obj != null) {
                    aVar.a("process_name", obj);
                }
                java.lang.String str = mapF.get("start_time");
                if (str != null) {
                    try {
                        aVar.a(java.lang.Long.decode(str).longValue());
                    } catch (java.lang.Throwable th) {
                        com.apm.insight.c.a();
                        com.apm.insight.runtime.k.a(th, "NPTH_CATCH");
                    }
                }
                java.lang.String str2 = mapF.get("pid");
                if (str2 != null) {
                    try {
                        aVar.a("pid", java.lang.Long.decode(str2));
                    } catch (java.lang.Throwable th2) {
                        com.apm.insight.c.a();
                        com.apm.insight.runtime.k.a(th2, "NPTH_CATCH");
                    }
                }
                java.lang.Object obj2 = (java.lang.String) mapF.get("crash_thread_name");
                if (obj2 != null) {
                    aVar.a("crash_thread_name", obj2);
                }
                java.lang.String str3 = mapF.get("crash_time");
                if (str3 != null) {
                    try {
                        aVar.a("crash_time", java.lang.Long.decode(str3));
                    } catch (java.lang.Throwable th3) {
                        com.apm.insight.c.a();
                        com.apm.insight.runtime.k.a(th3, "NPTH_CATCH");
                    }
                }
                aVar.a("data", l());
            }
            java.util.Map<java.lang.String, java.lang.String> mapB = this.c.f457a.b();
            if (!mapB.isEmpty()) {
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                for (java.lang.String str4 : mapB.keySet()) {
                    java.lang.String strA = a(mapB.get(str4));
                    try {
                        org.json.JSONObject jSONObject = new org.json.JSONObject();
                        jSONObject.put("lib_name", str4);
                        jSONObject.put("lib_uuid", strA);
                        jSONArray.put(jSONObject);
                    } catch (org.json.JSONException e2) {
                        com.apm.insight.c.a();
                        com.apm.insight.runtime.k.a(e2, "NPTH_CATCH");
                    }
                }
                aVar.a("crash_lib_uuid", (java.lang.Object) jSONArray);
            }
            java.io.File fileE = com.apm.insight.l.j.e(this.c.b());
            if (!fileE.exists() && this.b == null) {
                com.apm.insight.e.g();
                aVar.b(com.apm.insight.l.n.a());
                aVar.a("has_callback", "false");
            } else {
                try {
                    org.json.JSONObject jSONObject2 = this.b;
                    if (jSONObject2 == null) {
                        jSONObject2 = new org.json.JSONObject(com.apm.insight.l.f.a(fileE.getAbsolutePath(), "\n"));
                    }
                    aVar.c(jSONObject2);
                    aVar.a("has_callback", com.json.mediationsdk.metadata.a.g);
                    if (aVar.c().opt(com.ironsource.y8.a.k) == null) {
                        com.apm.insight.e.g();
                        aVar.b(com.apm.insight.l.n.a());
                    }
                    com.apm.insight.a.a(aVar, aVar.d(), com.apm.insight.CrashType.NATIVE);
                } catch (java.lang.Throwable th4) {
                    com.apm.insight.c.a();
                    com.apm.insight.runtime.k.a(th4, "NPTH_CATCH");
                }
                long j = -1;
                long jOptLong = aVar.c().optLong("crash_time", -1L);
                long jOptLong2 = aVar.c().optLong("java_end", -1L);
                if (jOptLong2 != -1 && jOptLong != -1) {
                    j = jOptLong2 - jOptLong;
                }
                try {
                    aVar.b("total_cost", java.lang.String.valueOf(j));
                    aVar.a("total_cost", java.lang.String.valueOf(j / 1000));
                } catch (java.lang.Throwable unused) {
                }
            }
            java.io.File fileG = com.apm.insight.l.j.g(this.c.b());
            java.lang.String strA2 = "";
            if (fileG.exists()) {
                try {
                    strA2 = com.apm.insight.l.m.a(fileG.getAbsolutePath());
                } catch (java.lang.Throwable th5) {
                    com.apm.insight.c.a();
                    com.apm.insight.runtime.k.a(th5, "NPTH_CATCH");
                }
            }
            java.io.File fileO = com.apm.insight.l.j.o(this.c.b());
            if (fileO.exists()) {
                java.lang.String strB = com.apm.insight.nativecrash.a.C0020a.b(fileO);
                strA2 = !strA2.isEmpty() ? strA2 + "\n" + strB : strB;
            }
            try {
                if (!strA2.isEmpty()) {
                    aVar.a("java_data", (java.lang.Object) strA2);
                }
            } catch (java.lang.Throwable th6) {
                com.apm.insight.c.a();
                com.apm.insight.runtime.k.a(th6, "NPTH_CATCH");
            }
            b(aVar);
            a(aVar);
            com.apm.insight.entity.d.b(aVar.c());
            java.util.Map<? extends java.lang.String, ? extends java.lang.String> map = new java.util.HashMap<>();
            if (k()) {
                map.put("is_root", com.json.mediationsdk.metadata.a.g);
                aVar.a("is_root", com.json.mediationsdk.metadata.a.g);
            } else {
                map.put("is_root", "false");
                aVar.a("is_root", "false");
            }
            map.put("has_fds_file", com.apm.insight.l.j.i(this.c.b()).exists() ? com.json.mediationsdk.metadata.a.g : "false");
            java.io.File fileH = com.apm.insight.l.j.h(this.c.b());
            map.put("has_logcat_file", (!fileH.exists() || fileH.length() <= 128) ? "false" : com.json.mediationsdk.metadata.a.g);
            map.put("has_maps_file", com.apm.insight.l.j.d(this.c.b()).exists() ? com.json.mediationsdk.metadata.a.g : "false");
            map.put("has_tombstone_file", com.apm.insight.l.j.b(this.c.b()).exists() ? com.json.mediationsdk.metadata.a.g : "false");
            map.put("has_meminfo_file", com.apm.insight.l.j.k(this.c.b()).exists() ? com.json.mediationsdk.metadata.a.g : "false");
            map.put("has_threads_file", com.apm.insight.l.j.j(this.c.b()).exists() ? com.json.mediationsdk.metadata.a.g : "false");
            int iA = new com.apm.insight.nativecrash.a.c().a();
            if (iA > 0) {
                if (iA > 960) {
                    map.put("fd_leak", com.json.mediationsdk.metadata.a.g);
                } else {
                    map.put("fd_leak", "false");
                }
                aVar.a("fd_count", java.lang.Integer.valueOf(iA));
            }
            int iA2 = new com.apm.insight.nativecrash.a.f().a();
            if (iA2 > 0) {
                if (iA2 > 350) {
                    map.put("threads_leak", com.json.mediationsdk.metadata.a.g);
                } else {
                    map.put("threads_leak", "false");
                }
                aVar.a("threads_count", java.lang.Integer.valueOf(iA2));
            }
            int iA3 = new com.apm.insight.nativecrash.a.d().a();
            if (iA3 > 0) {
                if (iA3 > g()) {
                    map.put("memory_leak", com.json.mediationsdk.metadata.a.g);
                } else {
                    map.put("memory_leak", "false");
                }
                aVar.a("memory_size", java.lang.Integer.valueOf(iA3));
            }
            map.put("sdk_version", "1.3.8.nourl-rc.1");
            if (aVar.c().opt("java_data") == null) {
                z = false;
            }
            map.put("has_java_stack", java.lang.String.valueOf(z));
            org.json.JSONArray jSONArrayA = com.apm.insight.nativecrash.b.a(com.apm.insight.l.j.l(this.c.c), com.apm.insight.l.j.m(this.c.c));
            map.put("leak_threads_count", java.lang.String.valueOf(jSONArrayA.length()));
            if (jSONArrayA.length() > 0) {
                try {
                    com.apm.insight.l.f.a(com.apm.insight.l.j.n(this.c.c), jSONArrayA);
                } catch (java.lang.Throwable unused2) {
                }
            }
            aVar.b();
            aVar.a("is_64_devices", java.lang.String.valueOf(com.apm.insight.entity.Header.a()));
            aVar.a("is_64_runtime", java.lang.String.valueOf(com.apm.insight.nativecrash.NativeImpl.f()));
            aVar.a("is_x86_devices", java.lang.String.valueOf(com.apm.insight.entity.Header.b()));
            aVar.c(map);
            java.io.File fileF = com.apm.insight.l.j.f(this.c.b());
            org.json.JSONObject jSONObjectC = aVar.c();
            com.apm.insight.l.f.a(fileF, jSONObjectC);
            return jSONObjectC;
        } catch (java.lang.Throwable th7) {
            com.apm.insight.c.a();
            com.apm.insight.runtime.k.a(th7, "NPTH_CATCH");
            return null;
        }
    }

    private static java.lang.String a(java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        try {
            if (str.length() < 16) {
                sb.append(str);
            } else {
                sb.append(str.charAt(6));
                sb.append(str.charAt(7));
                sb.append(str.charAt(4));
                sb.append(str.charAt(5));
                sb.append(str.charAt(2));
                sb.append(str.charAt(3));
                sb.append(str.charAt(0));
                sb.append(str.charAt(1));
                sb.append(str.charAt(10));
                sb.append(str.charAt(11));
                sb.append(str.charAt(8));
                sb.append(str.charAt(9));
                sb.append(str.charAt(14));
                sb.append(str.charAt(15));
                sb.append(str.charAt(12));
                sb.append(str.charAt(13));
                if (str.length() >= 32) {
                    sb.append((java.lang.CharSequence) str, 16, 32);
                    sb.append('0');
                }
            }
        } catch (java.lang.Throwable th) {
            com.apm.insight.c.a();
            com.apm.insight.runtime.k.a(th, "NPTH_CATCH");
        }
        return sb.toString().toUpperCase();
    }

    public final boolean i() {
        return com.apm.insight.l.f.a(this.c.b());
    }

    public final void j() {
        try {
            com.apm.insight.l.f.b(this.c.b().getAbsolutePath(), android.os.Environment.getExternalStorageDirectory().getAbsolutePath() + "/localDebug/" + com.apm.insight.e.g().getPackageName() + "/" + this.c.b().getName() + ".zip");
        } catch (java.lang.Throwable th) {
            com.apm.insight.c.a();
            com.apm.insight.runtime.k.a(th, "NPTH_CATCH");
        }
    }

    public static boolean k() {
        java.lang.Boolean bool = d;
        if (bool != null) {
            return bool.booleanValue();
        }
        java.lang.String[] strArr = {"/data/local/su", "/data/local/bin/su", "/data/local/xbin/su", "/system/xbin/su", "/system/bin/su", "/system/bin/.ext/su", "/system/bin/failsafe/su", "/system/sd/xbin/su", "/system/usr/we-need-root/su", "/sbin/su", "/su/bin/su"};
        for (int i = 0; i < 11; i++) {
            try {
                if (new java.io.File(strArr[i]).exists()) {
                    java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
                    d = bool2;
                    return bool2.booleanValue();
                }
                continue;
            } catch (java.lang.Throwable th) {
                com.apm.insight.c.a();
                com.apm.insight.runtime.k.a(th, "NPTH_CATCH");
            }
        }
        java.lang.Boolean bool3 = java.lang.Boolean.FALSE;
        d = bool3;
        return bool3.booleanValue();
    }

    /* JADX INFO: compiled from: NativeCrashFileManager.java */
    public class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected java.io.File f458a;
        protected java.lang.String b;
        protected java.lang.String c;
        protected int d;

        public e() {
        }

        public final int a() {
            int i;
            java.lang.Throwable th;
            if (!this.f458a.exists() || !this.f458a.isFile()) {
                return -1;
            }
            java.io.BufferedReader bufferedReader = null;
            try {
                java.io.BufferedReader bufferedReader2 = new java.io.BufferedReader(new java.io.FileReader(this.f458a));
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

    /* JADX INFO: compiled from: NativeCrashFileManager.java */
    public class d extends com.apm.insight.nativecrash.a.e {
        d() {
            super();
            this.b = "VmSize:";
            this.f458a = com.apm.insight.l.j.k(com.apm.insight.nativecrash.a.this.c.b());
            this.c = "\\s+";
            this.d = -1;
        }
    }

    /* JADX INFO: compiled from: NativeCrashFileManager.java */
    public class f extends com.apm.insight.nativecrash.a.e {
        f() {
            super();
            this.b = "Total Threads Count:";
            this.f458a = com.apm.insight.l.j.j(com.apm.insight.nativecrash.a.this.c.b());
            this.c = ":";
            this.d = -2;
        }
    }

    /* JADX INFO: compiled from: NativeCrashFileManager.java */
    public class c extends com.apm.insight.nativecrash.a.e {
        c() {
            super();
            this.b = "Total FD Count:";
            this.f458a = com.apm.insight.l.j.i(com.apm.insight.nativecrash.a.this.c.b());
            this.c = ":";
            this.d = -2;
        }
    }
}
