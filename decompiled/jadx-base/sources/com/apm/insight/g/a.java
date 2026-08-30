package com.apm.insight.g;

/* JADX INFO: compiled from: CrashCatchDispatcher.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements java.lang.Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static com.apm.insight.g.a f400a = null;
    private static volatile boolean i = false;
    private static volatile java.lang.ThreadLocal<java.lang.Boolean> j = new java.lang.ThreadLocal<>();
    private static java.util.ArrayList<com.apm.insight.g.b> l = new java.util.ArrayList<>();
    private java.lang.Thread.UncaughtExceptionHandler b;
    private com.apm.insight.g.c c;
    private com.apm.insight.g.c d;
    private volatile int e = 0;
    private volatile int f = 0;
    private java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object> g = new java.util.concurrent.ConcurrentHashMap<>();
    private java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object> h = new java.util.concurrent.ConcurrentHashMap<>();
    private org.json.JSONArray k;

    private a() {
        java.lang.Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = java.lang.Thread.getDefaultUncaughtExceptionHandler();
        if (defaultUncaughtExceptionHandler != this) {
            this.b = defaultUncaughtExceptionHandler;
            java.lang.Thread.setDefaultUncaughtExceptionHandler(this);
        }
    }

    public static com.apm.insight.g.a a() {
        if (f400a == null) {
            f400a = new com.apm.insight.g.a();
        }
        return f400a;
    }

    public final void a(com.apm.insight.g.c cVar) {
        this.c = cVar;
    }

    public final void b(com.apm.insight.g.c cVar) {
        this.d = cVar;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(java.lang.Thread thread, java.lang.Throwable th) {
        do {
            th = a(thread, th);
        } while (th != null);
    }

    /* JADX WARN: Code duplicated, block: B:110:0x01d9 A[Catch: all -> 0x0206, TRY_LEAVE, TryCatch #4 {all -> 0x0206, blocks: (B:108:0x01d3, B:110:0x01d9), top: B:154:0x01d3 }] */
    /* JADX WARN: Code duplicated, block: B:112:0x01de  */
    /* JADX WARN: Code duplicated, block: B:113:0x01e0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:119:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:150:0x01f3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:173:0x01ae A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x0067  */
    /* JADX WARN: Code duplicated, block: B:86:0x0194  */
    /* JADX WARN: Code duplicated, block: B:93:0x01ad  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [int] */
    /* JADX WARN: Type inference failed for: r0v20, types: [int] */
    /* JADX WARN: Type inference failed for: r0v24, types: [int] */
    /* JADX WARN: Type inference failed for: r0v26, types: [int] */
    /* JADX WARN: Type inference failed for: r0v41, types: [int] */
    /* JADX WARN: Type inference failed for: r0v43, types: [int] */
    /* JADX WARN: Type inference failed for: r20v0, types: [com.apm.insight.g.a] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v20, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [int] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23, types: [int] */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [long] */
    /* JADX WARN: Type inference failed for: r5v10, types: [long] */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13, types: [long] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [long] */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.apm.insight.g.c] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private java.lang.Throwable a(java.lang.Thread thread, java.lang.Throwable th) {
        boolean zC;
        boolean z;
        com.apm.insight.CrashType crashType;
        ?? r2;
        ?? r5;
        ?? r4;
        boolean z2;
        ?? ValueOf;
        ?? r6;
        com.apm.insight.CrashType crashType2;
        java.lang.String strA;
        com.apm.insight.g.c cVar;
        boolean z3;
        if (this.e >= 3) {
            return null;
        }
        this.e++;
        this.f++;
        if (i) {
            j.set(java.lang.Boolean.TRUE);
        }
        i = true;
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        boolean z4 = false;
        boolean z5 = (com.apm.insight.runtime.a.b.c() == -1 || jCurrentTimeMillis - com.apm.insight.runtime.a.b.c() <= com.apm.insight.e.i().getLaunchCrashInterval()) && !(com.apm.insight.e.n() && com.apm.insight.e.q() == 0);
        try {
            zC = com.apm.insight.l.m.c(th);
            if (zC) {
                try {
                    if (com.apm.insight.l.m.d(th)) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                } catch (java.lang.Throwable unused) {
                    z = false;
                }
            } else {
                z3 = false;
            }
            z = z3;
        } catch (java.lang.Throwable unused2) {
            zC = false;
        }
        try {
            if (z5) {
                try {
                    crashType = com.apm.insight.CrashType.LAUNCH;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    z2 = false;
                    r2 = z;
                    r5 = jCurrentTimeMillis;
                    r4 = 1;
                    try {
                        if (!com.apm.insight.l.m.c(th)) {
                            com.apm.insight.a.a(th);
                        }
                        if (z4) {
                            synchronized (this) {
                                this.f -= r4;
                                this.e -= r4;
                                return g();
                            }
                        }
                        if (r2 != 0) {
                            a(thread, th, z5, r5);
                        }
                        e();
                        d();
                        c(thread, th);
                        return null;
                    } catch (java.lang.Throwable th3) {
                        if (z4) {
                            synchronized (this) {
                                this.f -= r4;
                                this.e -= r4;
                                return g();
                            }
                        }
                        if (r2 != 0 && !z2) {
                            try {
                                a(thread, th, z5, r5);
                            } catch (java.lang.Throwable unused3) {
                                throw th3;
                            }
                        }
                        e();
                        d();
                        c(thread, th);
                        throw th3;
                    }
                }
            } else {
                try {
                    crashType = com.apm.insight.CrashType.JAVA;
                } catch (java.lang.Throwable th4) {
                    th = th4;
                    r2 = z;
                    r5 = jCurrentTimeMillis;
                    r4 = 1;
                    z2 = false;
                    if (!com.apm.insight.l.m.c(th)) {
                        com.apm.insight.a.a(th);
                    }
                    if (z4) {
                        synchronized (this) {
                            this.f -= r4;
                            this.e -= r4;
                            return g();
                        }
                    }
                    if (r2 != 0) {
                        a(thread, th, z5, r5);
                    }
                    e();
                    d();
                    c(thread, th);
                    return null;
                }
            }
            java.lang.String strA2 = com.apm.insight.e.a(jCurrentTimeMillis, crashType, zC, false);
            java.io.File file = new java.io.File(com.apm.insight.l.j.a(com.apm.insight.e.g()), strA2);
            ?? r7 = "logEventStack";
            java.lang.String strA3 = a(new java.io.File(file, "logEventStack"), th, thread, z);
            boolean z6 = (f() & 1) != 0 || (strA3 != null && com.apm.insight.e.i().isCrashIgnored(strA3));
            try {
                org.json.JSONArray jSONArrayA = com.apm.insight.entity.b.a(th, thread, file);
                this.k = jSONArrayA;
                boolean z7 = jSONArrayA == null;
                if (z7 || z6) {
                    if (z5) {
                        try {
                            crashType2 = com.apm.insight.CrashType.LAUNCH;
                        } catch (java.lang.Throwable th5) {
                            th = th5;
                            z2 = false;
                            ValueOf = z;
                            r7 = jCurrentTimeMillis;
                            r6 = 1;
                            z4 = z6;
                            r2 = ValueOf;
                            r4 = r6;
                            r5 = r7;
                            if (!com.apm.insight.l.m.c(th)) {
                                com.apm.insight.a.a(th);
                            }
                            if (z4) {
                                synchronized (this) {
                                    this.f -= r4;
                                    this.e -= r4;
                                    return g();
                                }
                            }
                            if (r2 != 0) {
                                a(thread, th, z5, r5);
                            }
                            e();
                            d();
                            c(thread, th);
                            return null;
                        }
                    } else {
                        crashType2 = com.apm.insight.CrashType.JAVA;
                    }
                    strA = com.apm.insight.e.a(jCurrentTimeMillis, crashType2, zC, true);
                    java.io.File file2 = new java.io.File(com.apm.insight.l.j.a(com.apm.insight.e.g()), strA);
                    file.renameTo(file2);
                    new java.io.File(file2, "logEventStack");
                    r6 = "logEventStack";
                } else {
                    strA = strA2;
                    r6 = z7;
                }
                com.apm.insight.a.d();
                com.apm.insight.k.b.a().b();
                z2 = com.apm.insight.runtime.a.a("exception_modules", "oom_callback") == 1;
                if (z && z2) {
                    r6 = z5;
                    r7 = jCurrentTimeMillis;
                    try {
                        a(thread, th, r6, r7);
                    } catch (java.lang.Throwable th6) {
                        th = th6;
                        ValueOf = z;
                        r7 = jCurrentTimeMillis;
                        r6 = 1;
                        z4 = z6;
                        r2 = ValueOf;
                        r4 = r6;
                        r5 = r7;
                        if (!com.apm.insight.l.m.c(th)) {
                            com.apm.insight.a.a(th);
                        }
                        if (z4) {
                            synchronized (this) {
                                this.f -= r4;
                                this.e -= r4;
                            }
                            return g();
                        }
                        if (r2 != 0 && !z2) {
                            a(thread, th, z5, r5);
                        }
                        e();
                        d();
                        c(thread, th);
                        return null;
                    }
                }
                if (z5) {
                    com.apm.insight.CrashType crashType3 = com.apm.insight.CrashType.LAUNCH;
                } else {
                    com.apm.insight.CrashType crashType4 = com.apm.insight.CrashType.JAVA;
                }
                ValueOf = java.lang.String.valueOf(z5);
                com.apm.insight.a.a((java.lang.Object) "[uncaughtException] isLaunchCrash=".concat(ValueOf));
                com.apm.insight.a.a.a();
                boolean zB = b(thread, th);
                try {
                    if (!zB || (cVar = this.c) == null || !z5) {
                        ValueOf = z;
                        r7 = jCurrentTimeMillis;
                        r6 = 1;
                        if (zB) {
                            ?? r8 = this.d;
                            if (r8 != 0) {
                                ValueOf = ValueOf;
                                r6 = r6;
                                r7 = r7;
                                r8.a(r7, thread, th, strA, strA3, z6);
                                com.apm.insight.a.a((java.lang.Object) ("[uncaughtException] mLaunchCrashDisposer " + th.toString()));
                                ValueOf = ValueOf;
                                r6 = r6;
                                r7 = r7;
                            }
                        }
                        if (!z6) {
                            synchronized (this) {
                                this.f -= r6;
                                this.e -= r6;
                            }
                            return g();
                        }
                        if (ValueOf != 0 && !z2) {
                            a(thread, th, z5, r7);
                        }
                        e();
                        d();
                        c(thread, th);
                        return null;
                    }
                    ValueOf = z;
                    r7 = jCurrentTimeMillis;
                    r6 = 1;
                    cVar.a(jCurrentTimeMillis, thread, th, strA, strA3, z6);
                    com.apm.insight.a.a((java.lang.Object) ("[uncaughtException] mLaunchCrashDisposer " + th.toString()));
                    ValueOf = ValueOf;
                    r6 = r6;
                    r7 = r7;
                    if (!z6) {
                        synchronized (this) {
                            this.f -= r6;
                            this.e -= r6;
                            return g();
                        }
                    }
                    if (ValueOf != 0) {
                        a(thread, th, z5, r7);
                    }
                    e();
                    d();
                    c(thread, th);
                    return null;
                } catch (java.lang.Throwable th7) {
                    th = th7;
                    z4 = z6;
                    r2 = ValueOf;
                    r4 = r6;
                    r5 = r7;
                    if (!com.apm.insight.l.m.c(th)) {
                        com.apm.insight.a.a(th);
                    }
                    if (z4) {
                        synchronized (this) {
                            this.f -= r4;
                            this.e -= r4;
                            return g();
                        }
                    }
                    if (r2 != 0) {
                        a(thread, th, z5, r5);
                    }
                    e();
                }
            } catch (java.lang.Throwable th8) {
                th = th8;
                ValueOf = z;
                r7 = jCurrentTimeMillis;
                r6 = 1;
                z2 = false;
            }
        } catch (java.lang.Throwable unused4) {
        }
    }

    private void d() {
        synchronized (this) {
            this.f--;
        }
        long jUptimeMillis = android.os.SystemClock.uptimeMillis();
        while (this.f != 0 && android.os.SystemClock.uptimeMillis() - jUptimeMillis < 10000) {
            android.os.SystemClock.sleep(50L);
        }
    }

    private static void e() {
        java.io.File fileA = com.apm.insight.l.j.a(com.apm.insight.e.g());
        java.io.File fileA2 = com.apm.insight.l.j.a();
        if (com.apm.insight.l.f.b(fileA) && com.apm.insight.l.f.b(fileA2)) {
            return;
        }
        long jUptimeMillis = android.os.SystemClock.uptimeMillis();
        while (!com.apm.insight.k.h.a() && android.os.SystemClock.uptimeMillis() - jUptimeMillis < 10000) {
            try {
                android.os.SystemClock.sleep(500L);
            } catch (java.lang.Throwable unused) {
            }
        }
    }

    private java.lang.String a(java.io.File file, java.lang.Throwable th, java.lang.Thread thread, boolean z) {
        java.lang.String absolutePath = file.getAbsolutePath();
        this.h.put(file.getName(), file);
        try {
            file.getParentFile().mkdirs();
            file.createNewFile();
            com.apm.insight.nativecrash.NativeImpl.c(absolutePath);
        } catch (java.lang.Throwable unused) {
        }
        java.lang.String strA = null;
        if (z) {
            int iH = com.apm.insight.nativecrash.NativeImpl.h(absolutePath);
            if (iH > 0) {
                try {
                    com.apm.insight.nativecrash.NativeImpl.a(iH, com.apm.insight.l.a.d(com.apm.insight.e.g()));
                    com.apm.insight.nativecrash.NativeImpl.a(iH, "\n");
                    com.apm.insight.nativecrash.NativeImpl.a(iH, th.getMessage());
                    com.apm.insight.nativecrash.NativeImpl.a(iH, "\n");
                    com.apm.insight.nativecrash.NativeImpl.a(iH, th.getClass().getName());
                    if (th.getMessage() != null) {
                        com.apm.insight.nativecrash.NativeImpl.a(iH, ": ");
                        com.apm.insight.nativecrash.NativeImpl.a(iH, th.getMessage());
                    }
                    com.apm.insight.nativecrash.NativeImpl.a(iH, "\n");
                    com.apm.insight.nativecrash.NativeImpl.a(iH, thread.getName());
                    com.apm.insight.nativecrash.NativeImpl.a(iH, "\n");
                } catch (java.lang.Throwable unused2) {
                }
                try {
                    com.apm.insight.nativecrash.NativeImpl.a(iH, "stack:");
                    com.apm.insight.nativecrash.NativeImpl.a(iH, "\n");
                } catch (java.lang.Throwable unused3) {
                }
                com.apm.insight.l.m.a(th, iH);
                com.apm.insight.nativecrash.NativeImpl.b(iH);
            }
        } else {
            try {
                java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file, true);
                try {
                    fileOutputStream.write((com.apm.insight.l.a.d(com.apm.insight.e.g()) + "\n").getBytes());
                    fileOutputStream.write((th.getMessage() + "\n").getBytes());
                    fileOutputStream.write((th + "\n").getBytes());
                    fileOutputStream.write((thread.getName() + "\n").getBytes());
                } catch (java.lang.Throwable unused4) {
                }
                try {
                    fileOutputStream.write("stack:\n".getBytes());
                } catch (java.lang.Throwable unused5) {
                }
                try {
                    strA = com.apm.insight.l.m.a(th, new java.io.PrintStream(fileOutputStream), android.os.Looper.getMainLooper() == android.os.Looper.myLooper() ? new com.apm.insight.l.e.a() { // from class: com.apm.insight.g.a.1

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        private boolean f401a = false;

                        @Override // com.apm.insight.l.e.a
                        public final boolean a(java.lang.String str) {
                            if (!this.f401a && str.contains("android.os.Looper.loop")) {
                                this.f401a = true;
                            }
                            return !this.f401a;
                        }
                    } : new com.apm.insight.l.e.a());
                    com.apm.insight.a.a((java.io.Closeable) fileOutputStream);
                } catch (java.lang.Throwable th2) {
                    try {
                        th.printStackTrace(new java.io.PrintStream(fileOutputStream));
                    } catch (java.lang.Throwable th3) {
                        try {
                            fileOutputStream.write("err:\n".getBytes());
                            fileOutputStream.write((th2 + "\n").getBytes());
                            fileOutputStream.write((th3 + "\n").getBytes());
                        } catch (java.lang.Throwable unused6) {
                        }
                    }
                }
                com.apm.insight.a.a((java.io.Closeable) fileOutputStream);
            } catch (java.lang.Throwable unused7) {
            }
        }
        return strA;
    }

    private static boolean b(java.lang.Thread thread, java.lang.Throwable th) {
        com.apm.insight.ICrashFilter iCrashFilterB = com.apm.insight.e.b().b();
        if (iCrashFilterB != null) {
            try {
                if (!iCrashFilterB.onJavaCrashFilter(th, thread)) {
                    return false;
                }
            } catch (java.lang.Throwable unused) {
            }
        }
        return true;
    }

    public final void a(java.lang.Thread thread, java.lang.Throwable th, boolean z, com.apm.insight.entity.a aVar) {
        java.util.List<com.apm.insight.ICrashCallback> listC;
        com.apm.insight.CrashType crashType;
        if (z) {
            listC = com.apm.insight.runtime.m.a().b();
            crashType = com.apm.insight.CrashType.LAUNCH;
        } else {
            listC = com.apm.insight.runtime.m.a().c();
            crashType = com.apm.insight.CrashType.JAVA;
        }
        for (com.apm.insight.ICrashCallback iCrashCallback : listC) {
            long jUptimeMillis = android.os.SystemClock.uptimeMillis();
            try {
                if (iCrashCallback instanceof com.apm.insight.b) {
                    ((com.apm.insight.b) iCrashCallback).a(crashType, com.apm.insight.l.m.a(th), thread, this.k);
                } else {
                    iCrashCallback.onCrash(crashType, com.apm.insight.l.m.a(th), thread);
                }
                aVar.b("callback_cost_" + iCrashCallback.getClass().getName(), java.lang.String.valueOf(android.os.SystemClock.uptimeMillis() - jUptimeMillis));
            } catch (java.lang.Throwable th2) {
                com.apm.insight.a.b(th2);
                aVar.b("callback_err_" + iCrashCallback.getClass().getName(), java.lang.String.valueOf(android.os.SystemClock.uptimeMillis() - jUptimeMillis));
            }
        }
    }

    private void a(java.lang.Thread thread, java.lang.Throwable th, boolean z, long j2) {
        java.util.List<com.apm.insight.IOOMCallback> listA = com.apm.insight.runtime.m.a().a();
        com.apm.insight.CrashType crashType = z ? com.apm.insight.CrashType.LAUNCH : com.apm.insight.CrashType.JAVA;
        for (com.apm.insight.IOOMCallback iOOMCallback : listA) {
            try {
                if (iOOMCallback instanceof com.apm.insight.b) {
                    ((com.apm.insight.b) iOOMCallback).a(crashType, th, thread, j2, this.k);
                } else {
                    iOOMCallback.onCrash(crashType, th, thread, j2);
                }
            } catch (java.lang.Throwable th2) {
                com.apm.insight.a.b(th2);
            }
        }
    }

    private void c(java.lang.Thread thread, java.lang.Throwable th) {
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.b;
        if (uncaughtExceptionHandler == null || uncaughtExceptionHandler == this) {
            return;
        }
        uncaughtExceptionHandler.uncaughtException(thread, th);
    }

    public final void a(java.lang.String str) {
        this.g.put(str, new java.lang.Object());
    }

    public final boolean b(java.lang.String str) {
        return this.g.containsKey(str);
    }

    public static void a(final java.lang.Throwable th) {
        if (th == null) {
            return;
        }
        try {
            com.apm.insight.runtime.n.a().a(new java.lang.Runnable() { // from class: com.apm.insight.g.a.2
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        com.apm.insight.entity.a aVarA = com.apm.insight.entity.a.a(java.lang.System.currentTimeMillis(), com.apm.insight.e.g(), th);
                        aVarA.a("userdefine", (java.lang.Object) 1);
                        com.apm.insight.entity.a aVarA2 = com.apm.insight.runtime.a.f.a().a(com.apm.insight.CrashType.CUSTOM_JAVA, aVarA);
                        if (aVarA2 != null) {
                            com.apm.insight.k.d.a().c(aVarA2.c());
                        }
                    } catch (java.lang.Throwable unused) {
                    }
                }
            });
        } catch (java.lang.Throwable unused) {
        }
    }

    public static void c(final java.lang.String str) {
        if (str == null) {
            return;
        }
        try {
            com.apm.insight.runtime.n.a().a(new java.lang.Runnable() { // from class: com.apm.insight.g.a.3
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        com.apm.insight.entity.a aVar = new com.apm.insight.entity.a();
                        aVar.a("data", (java.lang.Object) str);
                        aVar.a("userdefine", (java.lang.Object) 1);
                        com.apm.insight.entity.a aVarA = com.apm.insight.runtime.a.f.a().a(com.apm.insight.CrashType.CUSTOM_JAVA, aVar);
                        if (aVarA != null) {
                            com.apm.insight.k.d.a().c(aVarA.c());
                        }
                    } catch (java.lang.Throwable unused) {
                    }
                }
            });
        } catch (java.lang.Throwable unused) {
        }
    }

    public static boolean b() {
        return i;
    }

    public static boolean c() {
        java.lang.Boolean bool = j.get();
        return bool != null && bool.booleanValue();
    }

    private static int f() {
        int iA = 0;
        for (int i2 = 0; i2 < l.size(); i2++) {
            try {
                try {
                    iA |= l.get(i2).a();
                } catch (java.lang.Throwable th) {
                    com.apm.insight.c.a();
                    com.apm.insight.runtime.k.a(th, "NPTH_CATCH");
                }
            } catch (java.lang.Throwable unused) {
            }
        }
        return iA;
    }

    private static java.lang.Throwable g() {
        for (int i2 = 0; i2 < l.size(); i2++) {
            try {
                l.get(i2);
            } catch (java.lang.Throwable unused) {
            }
        }
        if (android.os.Looper.getMainLooper() != android.os.Looper.myLooper()) {
            return null;
        }
        try {
            android.os.Looper.loop();
            return null;
        } catch (java.lang.Throwable th) {
            return th;
        }
    }
}
