package com.apm.insight.entity;

/* JADX INFO: compiled from: EventBody.java */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends com.apm.insight.entity.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.lang.String f393a;

    private c(java.lang.String str) {
        this.f393a = str;
    }

    public static com.apm.insight.entity.c a(java.lang.StackTraceElement stackTraceElement, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, java.lang.String str4, java.lang.String str5) {
        com.apm.insight.entity.c cVar = new com.apm.insight.entity.c(str5);
        java.lang.String className = stackTraceElement.getClassName();
        java.lang.String methodName = stackTraceElement.getMethodName();
        int lineNumber = stackTraceElement.getLineNumber();
        cVar.a("event_type", (java.lang.Object) "exception");
        cVar.a("log_type", (java.lang.Object) str5);
        cVar.a(com.ironsource.aa.a.d, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        cVar.a("crash_time", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        cVar.a("class_ref", (java.lang.Object) className);
        cVar.a("method", (java.lang.Object) methodName);
        cVar.a("line_num", java.lang.Integer.valueOf(lineNumber));
        cVar.a("stack", (java.lang.Object) str);
        cVar.a("exception_type", (java.lang.Object) 1);
        cVar.a("ensure_type", (java.lang.Object) str4);
        cVar.a("is_core", java.lang.Integer.valueOf(z ? 1 : 0));
        cVar.a(com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE, (java.lang.Object) str2);
        cVar.a("process_name", (java.lang.Object) com.apm.insight.l.a.d(com.apm.insight.e.g()));
        cVar.a("crash_thread_name", (java.lang.Object) str3);
        com.apm.insight.entity.d.b(cVar.c());
        return cVar;
    }
}
