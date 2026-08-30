package com.apm.insight.runtime.a;

/* JADX INFO: compiled from: CrashContextAssembly.java */
/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile com.apm.insight.runtime.a.f f472a;
    private android.content.Context b;
    private java.util.Map<com.apm.insight.CrashType, com.apm.insight.runtime.a.c> c = new java.util.HashMap();
    private com.apm.insight.runtime.a.b d;
    private com.apm.insight.runtime.a.d e;

    private f(android.content.Context context) {
        this.b = context;
        try {
            this.d = com.apm.insight.runtime.a.b.d();
            this.e = new com.apm.insight.runtime.a.d(this.b);
        } catch (java.lang.Throwable th) {
            com.apm.insight.c.a();
            com.apm.insight.runtime.k.a(th, "NPTH_CATCH");
        }
    }

    public static com.apm.insight.runtime.a.f a() {
        if (f472a == null) {
            android.content.Context contextG = com.apm.insight.e.g();
            if (contextG == null) {
                throw new java.lang.IllegalArgumentException("NpthBus not init");
            }
            f472a = new com.apm.insight.runtime.a.f(contextG);
        }
        return f472a;
    }

    private com.apm.insight.runtime.a.c a(com.apm.insight.CrashType crashType) {
        com.apm.insight.runtime.a.c jVar = this.c.get(crashType);
        if (jVar != null) {
            return jVar;
        }
        switch (com.apm.insight.runtime.a.f.AnonymousClass1.f473a[crashType.ordinal()]) {
            case 1:
                jVar = new com.apm.insight.runtime.a.j(this.b, this.d, this.e);
                break;
            case 2:
                jVar = new com.apm.insight.runtime.a.k(this.b, this.d, this.e);
                break;
            case 3:
                jVar = new com.apm.insight.runtime.a.l(this.b, this.d, this.e);
                break;
            case 4:
                jVar = new com.apm.insight.runtime.a.a(this.b, this.d, this.e);
                break;
            case 5:
                jVar = new com.apm.insight.runtime.a.h(this.b, this.d, this.e);
                break;
            case 6:
                jVar = new com.apm.insight.runtime.a.g(this.b, this.d, this.e);
                break;
            case 7:
                jVar = new com.apm.insight.runtime.a.e(this.b, this.d, this.e);
                break;
            case 8:
                jVar = new com.apm.insight.runtime.a.i(this.b, this.d, this.e);
                break;
        }
        if (jVar != null) {
            this.c.put(crashType, jVar);
        }
        return jVar;
    }

    /* JADX INFO: renamed from: com.apm.insight.runtime.a.f$1, reason: invalid class name */
    /* JADX INFO: compiled from: CrashContextAssembly.java */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f473a;

        static {
            int[] iArr = new int[com.apm.insight.CrashType.values().length];
            f473a = iArr;
            try {
                iArr[com.apm.insight.CrashType.JAVA.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f473a[com.apm.insight.CrashType.LAUNCH.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f473a[com.apm.insight.CrashType.NATIVE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                f473a[com.apm.insight.CrashType.ANR.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                f473a[com.apm.insight.CrashType.DART.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                f473a[com.apm.insight.CrashType.CUSTOM_JAVA.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                f473a[com.apm.insight.CrashType.BLOCK.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                f473a[com.apm.insight.CrashType.ENSURE.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
        }
    }

    public final com.apm.insight.entity.a a(com.apm.insight.CrashType crashType, com.apm.insight.runtime.a.c.a aVar) {
        com.apm.insight.runtime.a.c cVarA;
        if (crashType == null || (cVarA = a(crashType)) == null) {
            return null;
        }
        return cVarA.a(null, aVar, true);
    }

    public final com.apm.insight.entity.a a(com.apm.insight.CrashType crashType, com.apm.insight.entity.a aVar) {
        com.apm.insight.runtime.a.c cVarA;
        return (crashType == null || (cVarA = a(crashType)) == null) ? aVar : cVarA.a(aVar, null, false);
    }

    public final com.apm.insight.entity.a a(java.util.List<com.apm.insight.entity.a> list, org.json.JSONArray jSONArray) {
        if (list.isEmpty()) {
            return null;
        }
        com.apm.insight.entity.a aVar = new com.apm.insight.entity.a();
        org.json.JSONArray jSONArray2 = new org.json.JSONArray();
        java.util.Iterator<com.apm.insight.entity.a> it = list.iterator();
        while (it.hasNext()) {
            jSONArray2.put(it.next().c());
        }
        aVar.a("data", (java.lang.Object) jSONArray2);
        aVar.a("all_data", (java.lang.Object) jSONArray);
        com.apm.insight.entity.Header headerA = com.apm.insight.entity.Header.a(this.b);
        com.apm.insight.entity.Header.a(headerA);
        headerA.c();
        headerA.d();
        headerA.e();
        com.apm.insight.entity.Header.b(headerA);
        aVar.a(headerA);
        return aVar;
    }
}
