package com.apm.insight.k;

/* JADX INFO: compiled from: CrashFileCollector.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b {
    private static volatile com.apm.insight.k.b b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private android.content.Context f417a;
    private com.apm.insight.k.b.C0019b f;
    private java.util.HashMap<java.lang.String, com.apm.insight.k.b.C0019b> g;
    private java.util.List<java.io.File> c = new java.util.ArrayList();
    private java.util.List<java.io.File> d = new java.util.ArrayList();
    private int e = -1;
    private volatile boolean h = false;
    private java.lang.Runnable i = new java.lang.Runnable() { // from class: com.apm.insight.k.b.1
        @Override // java.lang.Runnable
        public final void run() throws java.lang.Throwable {
            com.apm.insight.k.b.this.f();
        }
    };
    private java.lang.Runnable j = new java.lang.Runnable() { // from class: com.apm.insight.k.b.2
        @Override // java.lang.Runnable
        public final void run() throws java.lang.Throwable {
            com.apm.insight.k.b.this.d();
        }
    };

    private b(android.content.Context context) {
        this.f417a = context;
    }

    public static com.apm.insight.k.b a() {
        if (b == null) {
            synchronized (com.apm.insight.k.b.class) {
                if (b == null) {
                    b = new com.apm.insight.k.b(com.apm.insight.e.g());
                }
            }
        }
        return b;
    }

    /* JADX INFO: renamed from: com.apm.insight.k.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CrashFileCollector.java */
    static class C0019b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        java.lang.String f423a;
        com.apm.insight.k.b.a d;
        com.apm.insight.k.b.a e;
        java.util.List<com.apm.insight.k.b.a> b = new java.util.ArrayList();
        java.util.List<com.apm.insight.k.b.a> c = new java.util.ArrayList();
        boolean f = false;
        int g = 0;

        C0019b(java.lang.String str) {
            this.f423a = str;
        }
    }

    /* JADX INFO: compiled from: CrashFileCollector.java */
    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        java.io.File f422a;
        long b;
        long c;
        com.apm.insight.CrashType d;
        java.lang.String e;

        a(java.io.File file, com.apm.insight.CrashType crashType) {
            this.b = -1L;
            this.c = -1L;
            this.f422a = file;
            this.d = crashType;
            this.e = file.getName();
        }

        a(java.io.File file, long j, com.apm.insight.CrashType crashType) {
            this.c = -1L;
            this.f422a = file;
            this.b = j;
            this.d = crashType;
            this.e = file.getName();
        }
    }

    public final void a(boolean z) throws java.lang.Throwable {
        if (!com.apm.insight.Npth.isStopUpload() && z) {
            if (this.f == null) {
                this.f = new com.apm.insight.k.b.C0019b("old_uuid");
                java.util.HashMap<java.lang.String, com.apm.insight.k.b.C0019b> map = new java.util.HashMap<>();
                this.g = map;
                a(map);
                a(this.g, this.f);
                com.apm.insight.l.f.a(com.apm.insight.l.j.b(this.f417a));
                b(this.g);
                b(this.f, true, null);
                a(this.f, true, null);
                this.f = null;
                if (this.g.isEmpty()) {
                    e();
                } else {
                    f();
                }
            }
            g();
            com.apm.insight.a.c();
        }
    }

    public final void b() {
        try {
            if (!this.h && com.apm.insight.l.a.c(com.apm.insight.e.g())) {
                com.apm.insight.runtime.n.a().a(this.j);
            }
        } catch (java.lang.Throwable unused) {
        }
    }

    public final boolean c() {
        return this.h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() throws java.lang.Throwable {
        if (this.h || this.g == null) {
            return;
        }
        if (!com.apm.insight.l.k.b(this.f417a)) {
            e();
        }
        if (this.e == -1) {
            if (com.apm.insight.runtime.a.a() && com.apm.insight.runtime.a.f()) {
                this.e = 1;
            } else {
                this.e = 0;
            }
        }
        boolean z = this.e == 1;
        com.apm.insight.runtime.g gVar = new com.apm.insight.runtime.g(this.f417a);
        java.util.Iterator<com.apm.insight.k.b.C0019b> it = this.g.values().iterator();
        while (it.hasNext()) {
            b(it.next(), z, gVar);
        }
        java.util.Iterator<com.apm.insight.k.b.C0019b> it2 = this.g.values().iterator();
        while (it2.hasNext()) {
            a(it2.next(), z, gVar);
        }
        java.util.Iterator<com.apm.insight.k.b.C0019b> it3 = this.g.values().iterator();
        while (it3.hasNext()) {
            com.apm.insight.l.f.a(com.apm.insight.l.j.a(this.f417a, it3.next().f423a));
        }
        gVar.a();
        com.apm.insight.runtime.b.a();
        e();
    }

    private void e() {
        this.h = true;
        this.g = null;
        com.apm.insight.nativecrash.NativeImpl.j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() throws java.lang.Throwable {
        if (this.h) {
            return;
        }
        if (com.apm.insight.l.k.b(this.f417a) && (java.lang.System.currentTimeMillis() - com.apm.insight.e.j() > 5000 || !com.apm.insight.e.i().isApmExists() || com.apm.insight.Npth.hasCrash())) {
            d();
        } else {
            com.apm.insight.runtime.n.a().a(this.i, 5000L);
        }
    }

    private void a(java.util.HashMap<java.lang.String, com.apm.insight.k.b.C0019b> map) {
        java.io.File[] fileArrListFiles = com.apm.insight.l.j.f(this.f417a).listFiles();
        if (fileArrListFiles == null || fileArrListFiles.length == 0) {
            return;
        }
        for (int i = 0; i < fileArrListFiles.length && i < 5; i++) {
            java.io.File file = fileArrListFiles[i];
            try {
                if (!file.isDirectory()) {
                    com.apm.insight.l.f.a(file);
                } else if (file.getName().endsWith(com.google.android.gms.ads.RequestConfiguration.MAX_AD_CONTENT_RATING_G)) {
                    java.lang.String name = file.getName();
                    com.apm.insight.k.b.C0019b c0019b = map.get(name);
                    if (c0019b == null) {
                        c0019b = new com.apm.insight.k.b.C0019b(name);
                        map.put(name, c0019b);
                    }
                    org.json.JSONArray jSONArrayA = com.apm.insight.nativecrash.b.a(com.apm.insight.l.j.l(file), com.apm.insight.l.j.m(file));
                    c0019b.g = jSONArrayA.length();
                    if (c0019b.g > 0) {
                        try {
                            com.apm.insight.l.f.a(com.apm.insight.l.j.n(file), jSONArrayA);
                        } catch (java.lang.Throwable unused) {
                        }
                    }
                } else {
                    com.apm.insight.l.f.a(file);
                }
            } catch (java.lang.Throwable th) {
                com.apm.insight.c.a();
                com.apm.insight.runtime.k.a(th, "NPTH_CATCH");
                com.apm.insight.l.f.a(file);
            }
        }
    }

    private void b(java.util.HashMap<java.lang.String, com.apm.insight.k.b.C0019b> map) {
        java.io.File[] fileArrListFiles = com.apm.insight.l.j.d(this.f417a).listFiles();
        if (fileArrListFiles == null || fileArrListFiles.length == 0) {
            return;
        }
        for (int i = 0; i < fileArrListFiles.length && i < 5; i++) {
            java.io.File file = fileArrListFiles[i];
            try {
                if (!file.isDirectory()) {
                    com.apm.insight.l.f.a(file);
                } else if (file.getName().endsWith(com.google.android.gms.ads.RequestConfiguration.MAX_AD_CONTENT_RATING_G)) {
                    java.lang.String name = file.getName();
                    com.apm.insight.k.b.C0019b c0019b = map.get(name);
                    if (c0019b == null) {
                        c0019b = new com.apm.insight.k.b.C0019b(name);
                        map.put(name, c0019b);
                    }
                    c0019b.c.add(new com.apm.insight.k.b.a(file, com.apm.insight.CrashType.NATIVE));
                } else {
                    com.apm.insight.l.f.a(file);
                }
            } catch (java.lang.Throwable th) {
                com.apm.insight.c.a();
                com.apm.insight.runtime.k.a(th, "NPTH_CATCH");
                com.apm.insight.l.f.a(file);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00c1  */
    private void a(java.util.HashMap<java.lang.String, com.apm.insight.k.b.C0019b> map, com.apm.insight.k.b.C0019b c0019b) {
        byte b2;
        com.apm.insight.CrashType crashType;
        java.io.File[] fileArrListFiles = com.apm.insight.l.j.a(this.f417a).listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        java.util.Arrays.sort(fileArrListFiles, java.util.Collections.reverseOrder());
        char c = 0;
        int i = 0;
        while (i < fileArrListFiles.length) {
            java.io.File file = fileArrListFiles[i];
            try {
                if (com.apm.insight.e.a.a().a(file.getAbsolutePath())) {
                    com.apm.insight.l.f.a(file);
                } else if (!com.apm.insight.l.f.e(file) && !com.apm.insight.g.a.a().b(file.getName())) {
                    if (file.isFile()) {
                        com.apm.insight.l.f.a(file);
                    } else {
                        java.lang.String name = file.getName();
                        if (name.endsWith(com.google.android.gms.ads.RequestConfiguration.MAX_AD_CONTENT_RATING_G)) {
                            java.lang.String[] strArrSplit = name.split("_");
                            if (strArrSplit.length < 5) {
                                c0019b.b.add(new com.apm.insight.k.b.a(file, null));
                            } else {
                                try {
                                    long j = java.lang.Long.parseLong(strArrSplit[c]);
                                    long j2 = java.lang.Long.parseLong(strArrSplit[4]);
                                    java.lang.String str = strArrSplit[2];
                                    java.lang.String str2 = strArrSplit[1];
                                    int iHashCode = str2.hashCode();
                                    if (iHashCode != -1109843021) {
                                        if (iHashCode != 96741) {
                                            if (iHashCode == 3254818 && str2.equals("java")) {
                                                b2 = 1;
                                            } else {
                                                b2 = -1;
                                            }
                                        } else if (str2.equals("anr")) {
                                            b2 = 2;
                                        } else {
                                            b2 = -1;
                                        }
                                    } else if (str2.equals("launch")) {
                                        b2 = 0;
                                    } else {
                                        b2 = -1;
                                    }
                                    if (b2 == 0) {
                                        crashType = com.apm.insight.CrashType.LAUNCH;
                                    } else if (b2 == 1) {
                                        crashType = com.apm.insight.CrashType.JAVA;
                                    } else {
                                        crashType = b2 != 2 ? null : com.apm.insight.CrashType.ANR;
                                    }
                                    com.apm.insight.k.b.C0019b c0019b2 = map.get(str);
                                    if (c0019b2 == null) {
                                        c0019b2 = new com.apm.insight.k.b.C0019b(str);
                                        map.put(str, c0019b2);
                                    }
                                    com.apm.insight.k.b.a aVar = new com.apm.insight.k.b.a(file, j, crashType);
                                    aVar.c = j2;
                                    if ((c0019b2.d == null || c0019b2.d.b > aVar.b) && crashType != null && crashType != com.apm.insight.CrashType.ANR && !name.contains("ignore")) {
                                        c0019b2.d = aVar;
                                    }
                                    c0019b2.b.add(aVar);
                                } catch (java.lang.Throwable unused) {
                                    c0019b.b.add(new com.apm.insight.k.b.a(file, null));
                                    com.apm.insight.c.a();
                                    com.apm.insight.runtime.k.a(new java.lang.RuntimeException("err format crashTime:".concat(java.lang.String.valueOf(name))), "NPTH_CATCH");
                                }
                            }
                        } else {
                            com.apm.insight.l.f.a(file);
                        }
                    }
                }
            } catch (java.lang.Throwable th) {
                com.apm.insight.c.a();
                com.apm.insight.runtime.k.a(th, "NPTH_CATCH");
            }
            i++;
            c = 0;
        }
    }

    private static org.json.JSONObject a(com.apm.insight.nativecrash.a aVar) {
        org.json.JSONObject jSONObjectB = aVar.b();
        if (jSONObjectB != null && jSONObjectB.length() != 0) {
            return jSONObjectB;
        }
        if (com.apm.insight.e.d()) {
            aVar.j();
        }
        if (!aVar.a()) {
            aVar.i();
            return null;
        }
        if (!aVar.d()) {
            aVar.i();
            return null;
        }
        if (aVar.e()) {
            aVar.i();
            return null;
        }
        aVar.c();
        return aVar.h();
    }

    private void a(final com.apm.insight.k.b.C0019b c0019b, boolean z, com.apm.insight.runtime.g gVar) {
        java.util.Iterator<com.apm.insight.k.b.a> it;
        final java.io.File file;
        com.apm.insight.CrashType crashType;
        if (c0019b.b.isEmpty()) {
            return;
        }
        if (c0019b.e == null) {
            c0019b.e = c0019b.d;
        }
        for (java.util.Iterator<com.apm.insight.k.b.a> it2 = c0019b.b.iterator(); it2.hasNext(); it2 = it) {
            com.apm.insight.k.b.a next = it2.next();
            try {
                java.io.File file2 = next.f422a;
                com.apm.insight.CrashType crashType2 = next.d;
                it = it2;
                try {
                    final com.apm.insight.f.b bVarA = a(file2, crashType2, c0019b.f423a, next.b, next.c);
                    if (bVarA == null) {
                        com.apm.insight.l.f.a(file2);
                    } else {
                        org.json.JSONObject jSONObjectB = bVarA.b();
                        if (jSONObjectB == null) {
                            com.apm.insight.l.f.a(file2);
                        } else {
                            org.json.JSONObject jSONObjectOptJSONObject = jSONObjectB.optJSONObject("header");
                            if (jSONObjectOptJSONObject == null) {
                                com.apm.insight.l.f.a(file2);
                            } else {
                                if (crashType2 == null) {
                                    file = file2;
                                    if (new java.io.File(file, file2.getName()).exists() || file.getName().split("_").length < 5) {
                                        if (com.apm.insight.k.e.b(bVarA.a(), jSONObjectB.toString()).a()) {
                                            com.apm.insight.l.f.a(file);
                                        }
                                    }
                                } else {
                                    file = file2;
                                }
                                java.io.File fileA = com.apm.insight.entity.b.a(file);
                                if (!fileA.exists()) {
                                    com.apm.insight.l.f.a(file);
                                } else {
                                    try {
                                        org.json.JSONArray jSONArray = new org.json.JSONArray(com.apm.insight.l.f.a(fileA, "\n"));
                                        org.json.JSONObject jSONObjectOptJSONObject2 = crashType2 == com.apm.insight.CrashType.LAUNCH ? ((org.json.JSONArray) jSONObjectB.opt("data")).optJSONObject(0) : jSONObjectB;
                                        if ((!z && c0019b.e != next) || next.e.contains("ignore")) {
                                            try {
                                                com.apm.insight.entity.a.a(jSONObjectOptJSONObject2, "filters", com.json.tk.SESSION_HISTORY_KEY_AD_ID, java.lang.String.valueOf(java.lang.String.valueOf(jSONObjectOptJSONObject.opt(com.json.tk.SESSION_HISTORY_KEY_AD_ID))));
                                                crashType = crashType2;
                                                try {
                                                    com.apm.insight.entity.a.a(jSONObjectOptJSONObject2, "filters", "has_ignore", java.lang.String.valueOf(next.e.contains("ignore")));
                                                    jSONObjectOptJSONObject.put(com.json.tk.SESSION_HISTORY_KEY_AD_ID, com.json.mediationsdk.logger.IronSourceError.ERROR_OLD_INIT_API_APP_KEY_IS_NULL);
                                                } catch (java.lang.Throwable th) {
                                                    th = th;
                                                    com.apm.insight.c.a();
                                                    com.apm.insight.runtime.k.a(th, "NPTH_CATCH");
                                                }
                                            } catch (java.lang.Throwable th2) {
                                                th = th2;
                                                crashType = crashType2;
                                            }
                                        } else {
                                            crashType = crashType2;
                                            if (gVar != null && !gVar.a(jSONObjectOptJSONObject2.optString("crash_md5", "default"))) {
                                                com.apm.insight.l.f.a(next.f422a);
                                            }
                                        }
                                        com.apm.insight.entity.a.a(jSONObjectOptJSONObject2, "filters", "start_uuid", c0019b.f423a);
                                        com.apm.insight.entity.a.a(jSONObjectOptJSONObject2, "filters", "leak_threads_count", java.lang.String.valueOf(c0019b.g));
                                        com.apm.insight.entity.a.a(jSONObjectOptJSONObject2, "filters", "crash_thread_name", jSONObjectOptJSONObject2.optString("crash_thread_name", "unknown"));
                                        try {
                                            com.apm.insight.entity.b.a(jSONObjectB, jSONArray, new com.apm.insight.entity.b.a() { // from class: com.apm.insight.k.b.3
                                                @Override // com.apm.insight.entity.b.a
                                                public final void a(org.json.JSONObject jSONObject) {
                                                    com.apm.insight.k.e.a(bVarA.a(), jSONObject.toString(), new java.io.File(file, "logZip"), com.apm.insight.l.j.a(com.apm.insight.k.b.this.f417a, c0019b.f423a));
                                                }
                                            });
                                            if (!com.apm.insight.l.f.a(file)) {
                                                com.apm.insight.e.a.a().a(com.apm.insight.d.a.b(file.getAbsolutePath()));
                                            }
                                            com.apm.insight.k.c.a(crashType, jSONObjectB);
                                        } catch (java.lang.Throwable th3) {
                                            th = th3;
                                            com.apm.insight.c.a();
                                            com.apm.insight.runtime.k.a(th, "NPTH_CATCH");
                                            com.apm.insight.l.f.a(next.f422a);
                                        }
                                    } catch (java.lang.Throwable unused) {
                                    }
                                }
                            }
                        }
                    }
                } catch (java.lang.Throwable th4) {
                    th = th4;
                    com.apm.insight.c.a();
                    com.apm.insight.runtime.k.a(th, "NPTH_CATCH");
                    com.apm.insight.l.f.a(next.f422a);
                }
            } catch (java.lang.Throwable th5) {
                th = th5;
                it = it2;
            }
        }
    }

    private void b(final com.apm.insight.k.b.C0019b c0019b, boolean z, com.apm.insight.runtime.g gVar) {
        boolean z2;
        if (c0019b.c.size() <= 1 && c0019b.c.isEmpty()) {
            c0019b.e = c0019b.d;
            return;
        }
        boolean zB = com.apm.insight.l.k.b(this.f417a);
        c0019b.e = c0019b.d;
        com.apm.insight.nativecrash.a aVar = new com.apm.insight.nativecrash.a(this.f417a);
        for (com.apm.insight.k.b.a aVar2 : c0019b.c) {
            final java.io.File file = aVar2.f422a;
            try {
                aVar.a(file);
                org.json.JSONObject jSONObjectA = a(aVar);
                if (jSONObjectA == null || jSONObjectA.length() == 0) {
                    z2 = zB;
                    aVar.i();
                } else if (jSONObjectA.length() != 0) {
                    try {
                        if (!z) {
                            long jOptLong = jSONObjectA.optLong("crash_time");
                            try {
                                if (c0019b.e == null) {
                                    c0019b.e = aVar2;
                                    c0019b.f = true;
                                    if (gVar == null || gVar.a("default")) {
                                        z2 = zB;
                                    } else {
                                        aVar.i();
                                    }
                                } else {
                                    if (c0019b.f) {
                                        z2 = zB;
                                    } else {
                                        z2 = zB;
                                        try {
                                            if (jOptLong < c0019b.e.b) {
                                                c0019b.e = aVar2;
                                                if (gVar != null && !gVar.a("default")) {
                                                    aVar.i();
                                                    zB = z2;
                                                } else {
                                                    a(file);
                                                    c0019b.f = true;
                                                }
                                            }
                                        } catch (java.lang.Throwable th) {
                                            th = th;
                                            com.apm.insight.c.a();
                                            com.apm.insight.runtime.k.a(th, "NPTH_CATCH");
                                            com.apm.insight.l.f.a(file);
                                            zB = z2;
                                        }
                                    }
                                    com.apm.insight.entity.a.a(jSONObjectA, "filters", com.json.tk.SESSION_HISTORY_KEY_AD_ID, java.lang.String.valueOf(jSONObjectA.optJSONObject("header").opt(com.json.tk.SESSION_HISTORY_KEY_AD_ID)));
                                    jSONObjectA.optJSONObject("header").put(com.json.tk.SESSION_HISTORY_KEY_AD_ID, com.json.mediationsdk.logger.IronSourceError.ERROR_OLD_INIT_API_APP_KEY_IS_NULL);
                                }
                            } catch (java.lang.Throwable th2) {
                                th = th2;
                                z2 = zB;
                            }
                        } else {
                            z2 = zB;
                            if (gVar != null && !gVar.a("default")) {
                                aVar.i();
                            }
                        }
                        com.apm.insight.entity.a.a(jSONObjectA, "filters", "start_uuid", c0019b.f423a);
                        com.apm.insight.entity.a.a(jSONObjectA, "filters", "crash_thread_name", jSONObjectA.optString("crash_thread_name", "unknown"));
                        if (z2) {
                            com.apm.insight.k.c.a aVar3 = new com.apm.insight.k.c.a(jSONObjectA, com.apm.insight.CrashType.NATIVE);
                            com.apm.insight.entity.b.a(jSONObjectA, com.apm.insight.entity.b.a(aVar3.c(), aVar3.a(), com.apm.insight.runtime.q.a().b(aVar3.b() == -1 ? java.lang.System.currentTimeMillis() : aVar3.b())), new com.apm.insight.entity.b.a() { // from class: com.apm.insight.k.b.4
                                @Override // com.apm.insight.entity.b.a
                                public final void a(org.json.JSONObject jSONObject) {
                                    com.apm.insight.k.d.a();
                                    com.apm.insight.k.d.a(jSONObject, file, com.apm.insight.l.j.a(com.apm.insight.k.b.this.f417a, c0019b.f423a));
                                }
                            });
                            if (!aVar.i()) {
                                aVar.f();
                            }
                        }
                        com.apm.insight.k.c.a(com.apm.insight.CrashType.NATIVE, jSONObjectA);
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                        com.apm.insight.c.a();
                        com.apm.insight.runtime.k.a(th, "NPTH_CATCH");
                        com.apm.insight.l.f.a(file);
                    }
                } else {
                    z2 = zB;
                }
            } catch (java.lang.Throwable th4) {
                th = th4;
                z2 = zB;
            }
            zB = z2;
        }
    }

    private static boolean a(java.io.File file) {
        java.lang.String[] list = file.list();
        if (list == null) {
            return false;
        }
        for (java.lang.String str : list) {
            if (!android.text.TextUtils.isEmpty(str) && str.endsWith("")) {
                return true;
            }
        }
        return false;
    }

    private com.apm.insight.f.b a(java.io.File file, com.apm.insight.CrashType crashType, java.lang.String str, long j, long j2) {
        com.apm.insight.f.b bVar;
        try {
            try {
                if (file.isFile()) {
                    com.apm.insight.l.f.a(file);
                    return null;
                }
                boolean z = crashType == com.apm.insight.CrashType.LAUNCH;
                if (crashType == null) {
                    try {
                        return com.apm.insight.l.f.b(new java.io.File(file, file.getName()).getAbsolutePath());
                    } catch (java.lang.Throwable th) {
                        th = th;
                        bVar = null;
                        com.apm.insight.l.f.a(file);
                        com.apm.insight.c.a();
                        com.apm.insight.runtime.k.a(th, "NPTH_CATCH");
                        return bVar;
                    }
                }
                com.apm.insight.f.b bVarA = com.apm.insight.l.f.a(file, crashType);
                try {
                    org.json.JSONObject jSONObjectB = bVarA.b();
                    if (bVarA.b() != null) {
                        if (crashType == com.apm.insight.CrashType.ANR) {
                            return bVarA;
                        }
                        jSONObjectB.put("crash_time", j);
                        jSONObjectB.put("app_start_time", j2);
                        org.json.JSONObject jSONObjectOptJSONObject = jSONObjectB.optJSONObject("header");
                        if (jSONObjectOptJSONObject == null) {
                            jSONObjectOptJSONObject = com.apm.insight.entity.Header.a(j).f();
                        } else if (z) {
                            jSONObjectB.remove("header");
                        }
                        java.lang.String strOptString = jSONObjectOptJSONObject.optString("sdk_version_name", null);
                        if (strOptString == null) {
                            strOptString = "1.3.8.nourl-rc.1";
                        }
                        com.apm.insight.entity.a.a(jSONObjectB, "filters", "sdk_version", strOptString);
                        org.json.JSONArray jSONArrayOptJSONArray = jSONObjectB.optJSONArray("logcat");
                        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() == 0) {
                            jSONObjectB.put("logcat", com.apm.insight.runtime.i.a(str));
                        }
                        com.apm.insight.entity.a.a(jSONObjectB, "filters", "has_dump", com.json.mediationsdk.metadata.a.g);
                        com.apm.insight.entity.a.a(jSONObjectB, "filters", "has_logcat", java.lang.String.valueOf(!com.apm.insight.a.a(jSONObjectB, "logcat")));
                        com.apm.insight.entity.a.a(jSONObjectB, "filters", "memory_leak", java.lang.String.valueOf(com.apm.insight.entity.a.a(str)));
                        com.apm.insight.entity.a.a(jSONObjectB, "filters", "fd_leak", java.lang.String.valueOf(com.apm.insight.entity.a.b(str)));
                        com.apm.insight.entity.a.a(jSONObjectB, "filters", "threads_leak", java.lang.String.valueOf(com.apm.insight.entity.a.c(str)));
                        com.apm.insight.entity.a.a(jSONObjectB, "filters", "is_64_devices", java.lang.String.valueOf(com.apm.insight.entity.Header.a()));
                        com.apm.insight.entity.a.a(jSONObjectB, "filters", "is_64_runtime", java.lang.String.valueOf(com.apm.insight.nativecrash.NativeImpl.f()));
                        com.apm.insight.entity.a.a(jSONObjectB, "filters", "is_x86_devices", java.lang.String.valueOf(com.apm.insight.entity.Header.b()));
                        com.apm.insight.entity.a.a(jSONObjectB, "filters", "has_meminfo_file", java.lang.String.valueOf(com.apm.insight.l.j.d(str).exists()));
                        com.apm.insight.entity.a.a(jSONObjectB, "filters", "is_root", java.lang.String.valueOf(com.apm.insight.nativecrash.a.k()));
                        jSONObjectB.put("launch_did", com.apm.insight.i.a.a(this.f417a));
                        jSONObjectB.put("crash_uuid", file.getName());
                        jSONObjectB.put("jiffy", com.apm.insight.runtime.o.a.a());
                        try {
                            long j3 = java.lang.Long.parseLong(com.apm.insight.runtime.b.a(j, str));
                            com.apm.insight.entity.a.a(jSONObjectB, "filters", "lastAliveTime", java.lang.Math.abs(j3 - j) < 60000 ? "< 60s" : "> 60s");
                            jSONObjectB.put("lastAliveTime", java.lang.String.valueOf(j3));
                        } catch (java.lang.Throwable unused) {
                            jSONObjectB.put("lastAliveTime", "unknown");
                            com.apm.insight.entity.a.a(jSONObjectB, "filters", "lastAliveTime", "unknown");
                        }
                        jSONObjectB.put("has_dump", com.json.mediationsdk.metadata.a.g);
                        if (jSONObjectB.opt(com.ironsource.y8.a.k) == null) {
                            com.apm.insight.e.g();
                            com.apm.insight.entity.a.a(jSONObjectB, com.apm.insight.l.n.a());
                        }
                        if (com.apm.insight.entity.Header.b(jSONObjectOptJSONObject)) {
                            com.apm.insight.entity.a.a(jSONObjectB, "filters", "unauthentic_version", "unauthentic_version");
                        }
                        com.apm.insight.entity.d.b(jSONObjectB);
                        bVarA.b().put("upload_scene", "launch_scan");
                        if (z) {
                            org.json.JSONObject jSONObject = new org.json.JSONObject();
                            jSONObjectB.put("event_type", "start_crash");
                            jSONObjectB.put("stack", jSONObjectB.remove("data"));
                            jSONObject.put("data", new org.json.JSONArray().put(jSONObjectB));
                            jSONObject.put("header", jSONObjectOptJSONObject);
                            bVarA.a(jSONObject);
                        } else {
                            jSONObjectB.put("isJava", 1);
                        }
                    } else {
                        com.apm.insight.l.f.a(file);
                    }
                    return bVarA;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    bVar = bVarA;
                }
            } catch (java.lang.Throwable th3) {
                th = th3;
            }
        } catch (java.lang.Throwable th4) {
            th = th4;
            bVar = null;
        }
        com.apm.insight.l.f.a(file);
        com.apm.insight.c.a();
        com.apm.insight.runtime.k.a(th, "NPTH_CATCH");
        return bVar;
    }

    private void g() {
        java.io.File[] fileArrListFiles = com.apm.insight.l.j.i(this.f417a).listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        for (int i = 0; i < fileArrListFiles.length && i < 5; i++) {
            java.io.File file = fileArrListFiles[i];
            if (file.getName().endsWith(".atmp")) {
                com.apm.insight.a.a.a();
                file.getAbsolutePath();
            } else {
                try {
                    com.apm.insight.f.b bVarC = com.apm.insight.l.f.c(file.getAbsolutePath());
                    if (bVarC != null) {
                        if (bVarC.b() != null) {
                            bVarC.b().put("upload_scene", "launch_scan");
                        }
                        if (com.apm.insight.k.e.a(com.apm.insight.k.e.d(), bVarC.e(), bVarC.d(), bVarC.f(), bVarC.g())) {
                            com.apm.insight.l.f.a(file);
                            java.lang.String strC = bVarC.c();
                            if (!android.text.TextUtils.isEmpty(strC)) {
                                com.apm.insight.l.f.a(new java.io.File(strC));
                            }
                        }
                    } else {
                        com.apm.insight.l.f.a(file);
                    }
                } catch (java.lang.Throwable th) {
                    com.apm.insight.c.a();
                    com.apm.insight.runtime.k.a(th, "NPTH_CATCH");
                }
            }
        }
    }
}
