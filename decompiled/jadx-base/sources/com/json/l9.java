package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class l9 {
    private static final java.lang.String k = "1.0.6";
    public static java.lang.String l = "";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.json.Cif f2878a;
    private java.lang.String b;
    private java.lang.String c;
    private java.lang.String d;
    private java.lang.String e;
    private com.json.environment.ContextProvider f;
    public java.lang.Thread.UncaughtExceptionHandler g;
    public java.lang.String h;
    private java.lang.String i;
    private boolean j;

    class a implements com.json.b {
        a() {
        }

        @Override // com.json.b
        public void a() {
            java.util.Map<java.lang.Thread, java.lang.StackTraceElement[]> allStackTraces = java.lang.Thread.getAllStackTraces();
            java.lang.StringBuilder sb = new java.lang.StringBuilder(128);
            for (java.lang.Thread thread : allStackTraces.keySet()) {
                java.lang.StackTraceElement[] stackTrace = thread.getStackTrace();
                if (stackTrace != null && stackTrace.length > 0) {
                    sb.append("*** Thread Name ").append(thread.getName()).append(" Thread ID ").append(thread.getId()).append(" (").append(thread.getState().toString()).append(") ***\n");
                    for (java.lang.StackTraceElement stackTraceElement : stackTrace) {
                        sb.append(stackTraceElement.toString()).append(" ").append(thread.getState().toString()).append("\n");
                    }
                }
            }
            com.json.l9.l = sb.toString();
        }

        @Override // com.json.b
        public void b() {
        }
    }

    class b implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.content.Context f2880a;
        final /* synthetic */ java.lang.String b;

        b(android.content.Context context, java.lang.String str) {
            this.f2880a = context;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                java.lang.String strP = com.json.l9.this.f2878a.p(this.f2880a);
                if (!android.text.TextUtils.isEmpty(strP)) {
                    com.json.l9.this.c = strP;
                }
                java.lang.String strA = com.json.l9.this.f2878a.a(this.f2880a);
                if (!android.text.TextUtils.isEmpty(strA)) {
                    com.json.l9.this.e = strA;
                }
                android.content.SharedPreferences.Editor editorEdit = this.f2880a.getSharedPreferences("CRep", 0).edit();
                editorEdit.putString("String1", com.json.l9.this.c);
                editorEdit.putString("sId", this.b);
                editorEdit.apply();
            } catch (java.lang.Exception e) {
                com.json.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
            }
        }
    }

    class c extends com.json.m9 {
        c(org.json.JSONObject jSONObject) {
            super(jSONObject);
        }
    }

    private static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static volatile com.json.l9 f2881a = new com.json.l9(null);

        private d() {
        }
    }

    private l9() {
        this.j = false;
        this.f2878a = com.json.im.S().f();
        this.f = com.json.environment.ContextProvider.getInstance();
        java.lang.Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = java.lang.Thread.getDefaultUncaughtExceptionHandler();
        this.g = defaultUncaughtExceptionHandler;
        this.i = " ";
        this.h = "https://o-crash.mediation.unity3d.com/reporter";
        java.lang.Thread.setDefaultUncaughtExceptionHandler(new com.json.j9(defaultUncaughtExceptionHandler));
    }

    /* synthetic */ l9(com.ironsource.l9.a aVar) {
        this();
    }

    private java.lang.String a(android.content.Context context) {
        android.net.ConnectivityManager connectivityManager;
        if (context == null || (connectivityManager = (android.net.ConnectivityManager) context.getSystemService("connectivity")) == null) {
            return "none";
        }
        try {
            android.net.NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            if (networkCapabilities == null) {
                return "none";
            }
            if (networkCapabilities.hasTransport(1)) {
                return com.json.u8.b;
            }
            return networkCapabilities.hasTransport(0) ? com.json.u8.g : "none";
        } catch (java.lang.Exception e) {
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
            return "none";
        }
    }

    private void a(android.content.Context context, java.util.HashSet<java.lang.String> hashSet) {
        java.lang.String strA = a(a());
        if (strA.equals("none")) {
            return;
        }
        android.content.SharedPreferences sharedPreferences = context.getSharedPreferences("CRep", 0);
        java.lang.String string = sharedPreferences.getString("String1", this.c);
        java.lang.String string2 = sharedPreferences.getString("sId", this.d);
        java.util.List<com.json.ic> listB = com.json.ca.b();
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose("reportList size " + listB.size());
        for (com.json.ic icVar : listB) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            java.lang.String strB = icVar.b();
            java.lang.String strE = icVar.e();
            java.lang.String strD = icVar.d();
            java.lang.String packageName = context.getPackageName();
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("crashDate", strB);
                jSONObject2.put("stacktraceCrash", strE);
                jSONObject2.put("crashType", strD);
                jSONObject2.put("CrashReporterVersion", k);
                jSONObject2.put(com.ironsource.y8.i.q, "8.6.1");
                jSONObject2.put(com.ironsource.y8.i.x, this.f2878a.b(context));
                jSONObject2.put(com.ironsource.y8.i.W, com.json.z3.b(context, packageName));
                jSONObject2.put(com.ironsource.y8.i.n, this.f2878a.o());
                jSONObject2.put("network", strA);
                jSONObject2.put(com.ironsource.y8.i.p, this.f2878a.k());
                jSONObject2.put(com.ironsource.y8.i.l, this.f2878a.e());
                jSONObject2.put("deviceOS", this.f2878a.l());
                jSONObject2.put("advertisingId", string);
                jSONObject2.put(com.ironsource.y8.i.k, this.f2878a.g());
                jSONObject2.put("systemProperties", java.lang.System.getProperties());
                jSONObject2.put("bundleId", packageName);
                jSONObject2.put("sId", string2);
                if (!android.text.TextUtils.isEmpty(this.e)) {
                    jSONObject2.put(com.ironsource.y8.i.M, java.lang.Boolean.parseBoolean(this.e));
                }
                if (hashSet == null || hashSet.isEmpty()) {
                    jSONObject = jSONObject2;
                } else {
                    for (java.lang.String str : hashSet) {
                        try {
                            if (jSONObject2.has(str)) {
                                jSONObject.put(str, jSONObject2.opt(str));
                            }
                        } catch (java.lang.Exception e) {
                            com.json.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
                        }
                    }
                }
            } catch (java.lang.Exception unused) {
            }
            if (jSONObject.length() == 0) {
                android.util.Log.d("ISCrashReport", " Is Empty");
            } else {
                new java.lang.Thread(new com.ironsource.l9.c(jSONObject)).start();
            }
        }
        com.json.ca.a();
    }

    static java.util.List<com.json.ic> c() {
        return null;
    }

    public static com.json.l9 d() {
        return com.ironsource.l9.d.f2881a;
    }

    android.content.Context a() {
        return this.f.getApplicationContext();
    }

    public void a(java.lang.Throwable th) {
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose("isInitialized=" + this.j);
        if (!this.j || th == null) {
            return;
        }
        new com.json.ic(new com.json.k9(th).getStackTrace(), "" + java.lang.System.currentTimeMillis(), "Caught_IS_Crash").a();
    }

    public void a(java.util.HashSet<java.lang.String> hashSet, java.lang.String str, java.lang.String str2, boolean z, java.lang.String str3, int i, boolean z2) {
        android.content.Context applicationContext = this.f.getApplicationContext();
        if (applicationContext != null) {
            android.util.Log.d("automation_log", "init ISCrashReporter");
            if (!android.text.TextUtils.isEmpty(str2)) {
                this.i = str2;
            }
            if (!android.text.TextUtils.isEmpty(str)) {
                this.h = str;
            }
            this.d = str3;
            if (z) {
                new com.json.a(i).a(z2).b(true).a(new com.ironsource.l9.a()).start();
            }
            a(applicationContext, hashSet);
            new java.lang.Thread(new com.ironsource.l9.b(applicationContext, str3)).start();
        }
        this.j = true;
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose("initialized");
    }

    public java.lang.String b() {
        return k;
    }

    java.lang.String e() {
        return this.i;
    }
}
