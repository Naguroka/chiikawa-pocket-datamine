package com.apm.insight.f;

/* JADX INFO: compiled from: EnsureReporter.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.lang.String f396a;
    private org.json.JSONObject b;
    private java.lang.String c;
    private boolean d;
    private java.lang.String e;
    private java.lang.String f;
    private java.lang.String g;
    private java.util.List<java.lang.String> h;

    public static void a(final java.lang.Throwable th, final java.lang.String str, final java.lang.String str2) {
        try {
            com.apm.insight.runtime.n.a().a(new java.lang.Runnable() { // from class: com.apm.insight.f.b.1
                private /* synthetic */ boolean c = true;
                private /* synthetic */ java.util.Map d = null;

                @Override // java.lang.Runnable
                public final void run() {
                    com.apm.insight.f.b.a(null, th, str, this.c, null, "EnsureNotReachHere", str2);
                }
            });
        } catch (java.lang.Throwable unused) {
        }
    }

    public static void a(final java.lang.Object obj, final java.lang.Throwable th, final java.lang.String str, final java.lang.String str2, final java.lang.String str3) {
        try {
            com.apm.insight.runtime.n.a().a(new java.lang.Runnable() { // from class: com.apm.insight.f.b.2
                private /* synthetic */ boolean d = true;
                private /* synthetic */ java.util.Map e = null;

                @Override // java.lang.Runnable
                public final void run() {
                    com.apm.insight.f.b.a(obj, th, str, this.d, null, str2, str3);
                }
            });
        } catch (java.lang.Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(java.lang.Object obj, java.lang.Throwable th, java.lang.String str, boolean z, java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str2, java.lang.String str3) {
        if (th == null) {
            return;
        }
        try {
            java.lang.StackTraceElement[] stackTrace = th.getStackTrace();
            java.lang.StackTraceElement stackTraceElement = stackTrace[0];
            if (stackTraceElement == null) {
                return;
            }
            java.lang.String strA = com.apm.insight.l.m.a(th);
            if (android.text.TextUtils.isEmpty(strA)) {
                return;
            }
            com.apm.insight.entity.c cVarA = com.apm.insight.entity.c.a(stackTraceElement, strA, str, java.lang.Thread.currentThread().getName(), z, str2, str3);
            if (obj != null) {
                cVarA.a("exception_line_num", (java.lang.Object) com.apm.insight.entity.b.a(obj, th, stackTrace));
            }
            a(null, cVarA);
            com.apm.insight.runtime.a.f.a().a(com.apm.insight.CrashType.ENSURE, cVarA);
            com.apm.insight.k.g.a(obj, cVarA);
            com.apm.insight.a.b((java.lang.Object) "[reportException] ".concat(java.lang.String.valueOf(str)));
        } catch (java.lang.Throwable th2) {
            com.apm.insight.a.b(th2);
        }
    }

    public static void a(final java.lang.StackTraceElement[] stackTraceElementArr, final java.lang.String str, final java.lang.String str2) {
        try {
            com.apm.insight.runtime.n.a().a(new java.lang.Runnable() { // from class: com.apm.insight.f.b.3
                private /* synthetic */ int b = 5;
                private /* synthetic */ java.util.Map e = null;

                @Override // java.lang.Runnable
                public final void run() {
                    com.apm.insight.f.b.a(stackTraceElementArr, this.b, str, str2, "core_exception_monitor", (java.util.Map) null);
                }
            });
        } catch (java.lang.Throwable unused) {
        }
    }

    private static void a(java.util.Map<java.lang.String, java.lang.String> map, com.apm.insight.entity.c cVar) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            if (map != null) {
                for (java.lang.String str : map.keySet()) {
                    jSONObject.put(str, map.get(str));
                }
                cVar.a("custom", jSONObject);
            }
        } catch (java.lang.Throwable unused) {
        }
    }

    static /* synthetic */ void a(java.lang.StackTraceElement[] stackTraceElementArr, int i, java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.Map map) {
        java.lang.StackTraceElement stackTraceElement;
        java.lang.String string;
        if (stackTraceElementArr != null) {
            try {
                if (stackTraceElementArr.length > i + 1 && (stackTraceElement = stackTraceElementArr[i]) != null) {
                    if (stackTraceElementArr == null || stackTraceElementArr.length <= 0) {
                        string = null;
                    } else {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        while (i < stackTraceElementArr.length) {
                            com.apm.insight.l.m.a(stackTraceElementArr[i], sb);
                            i++;
                        }
                        string = sb.toString();
                    }
                    if (android.text.TextUtils.isEmpty(string)) {
                        return;
                    }
                    com.apm.insight.entity.c cVarA = com.apm.insight.entity.c.a(stackTraceElement, string, str, java.lang.Thread.currentThread().getName(), true, str2, str3);
                    a(null, cVarA);
                    com.apm.insight.runtime.a.f.a().a(com.apm.insight.CrashType.ENSURE, cVarA);
                    com.apm.insight.k.g.a(cVarA);
                    com.apm.insight.a.b((java.lang.Object) "[report] ".concat(java.lang.String.valueOf(str)));
                }
            } catch (java.lang.Throwable th) {
                com.apm.insight.a.b(th);
            }
        }
    }

    public final java.lang.String a() {
        return this.f396a;
    }

    public final void a(java.lang.String str) {
        this.f396a = str;
    }

    public final org.json.JSONObject b() {
        return this.b;
    }

    public final void a(org.json.JSONObject jSONObject) {
        this.b = jSONObject;
    }

    public final java.lang.String c() {
        return this.c;
    }

    public final void b(java.lang.String str) {
        this.c = str;
    }

    public final void a(boolean z) {
        this.d = z;
    }

    public final java.lang.String d() {
        return this.e;
    }

    public final void c(java.lang.String str) {
        this.e = str;
    }

    public final java.lang.String e() {
        return this.f;
    }

    public final void d(java.lang.String str) {
        this.f = str;
    }

    public final java.lang.String f() {
        return this.g;
    }

    public final void e(java.lang.String str) {
        this.g = str;
    }

    public final java.util.List<java.lang.String> g() {
        return this.h;
    }

    public final void a(java.util.List<java.lang.String> list) {
        this.h = list;
    }
}
