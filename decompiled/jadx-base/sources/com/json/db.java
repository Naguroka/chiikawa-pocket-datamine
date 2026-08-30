package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class db implements com.json.jf {
    private static final int e = 5;
    private static com.json.db f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.json.cb f2580a;
    private final org.json.JSONObject b;
    private java.lang.Thread c;
    private final java.lang.String d;

    private db(java.lang.String str, com.json.cg cgVar, org.json.JSONObject jSONObject) {
        this.d = str;
        this.f2580a = new com.json.cb(cgVar.a());
        this.b = jSONObject;
        com.json.sdk.utils.IronSourceStorageUtils.deleteFolder(b());
        com.json.sdk.utils.IronSourceStorageUtils.makeDir(b());
    }

    public static synchronized com.json.db a(java.lang.String str, com.json.cg cgVar, org.json.JSONObject jSONObject) {
        if (f == null) {
            f = new com.json.db(str, cgVar, jSONObject);
        }
        return f;
    }

    private java.lang.Thread a(com.json.ab abVar, android.os.Handler handler) {
        return new java.lang.Thread(new com.json.lt(abVar, handler));
    }

    private java.lang.String b() {
        return com.json.sdk.utils.IronSourceStorageUtils.buildAbsolutePathToDirInCache(this.d, com.json.a9.D);
    }

    private java.lang.Thread b(com.json.ih ihVar, java.lang.String str, int i, int i2, android.os.Handler handler) {
        if (i <= 0) {
            i = this.b.optInt("connectionTimeout", 5);
        }
        if (i2 <= 0) {
            i2 = this.b.optInt("readTimeout", 5);
        }
        boolean zOptBoolean = this.b.optBoolean(com.json.a9.H, false);
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
        return a(new com.json.ab(ihVar, str, (int) timeUnit.toMillis(i), (int) timeUnit.toMillis(i2), zOptBoolean, b()), handler);
    }

    public java.lang.String a() {
        return this.d;
    }

    @Override // com.json.jf
    public void a(com.json.ih ihVar, java.lang.String str) {
        int iOptInt = this.b.optInt("connectionTimeout", 5);
        int iOptInt2 = this.b.optInt("readTimeout", 5);
        boolean zOptBoolean = this.b.optBoolean(com.json.a9.H, false);
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
        java.lang.Thread threadA = a(new com.json.ab(ihVar, str, (int) timeUnit.toMillis(iOptInt), (int) timeUnit.toMillis(iOptInt2), zOptBoolean, b()), this.f2580a);
        this.c = threadA;
        threadA.start();
    }

    @Override // com.json.jf
    public void a(com.json.ih ihVar, java.lang.String str, int i, int i2) {
        b(ihVar, str, i, i2, this.f2580a).start();
    }

    @Override // com.json.jf
    public void a(com.json.ih ihVar, java.lang.String str, int i, int i2, android.os.Handler handler) {
        b(ihVar, str, i, i2, handler).start();
    }

    @Override // com.json.jf
    public void a(com.json.lo loVar) {
        this.f2580a.a(loVar);
    }

    public boolean c() {
        java.lang.Thread thread = this.c;
        return thread != null && thread.isAlive();
    }

    public synchronized void d() {
        f = null;
        com.json.cb cbVar = this.f2580a;
        if (cbVar != null) {
            cbVar.a();
            this.f2580a = null;
        }
    }
}
