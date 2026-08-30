package com.apm.insight.runtime.a;

/* JADX INFO: compiled from: JavaCrashAssembly.java */
/* JADX INFO: loaded from: classes3.dex */
final class j extends com.apm.insight.runtime.a.c {
    j(android.content.Context context, com.apm.insight.runtime.a.b bVar, com.apm.insight.runtime.a.d dVar) {
        super(com.apm.insight.CrashType.JAVA, context, bVar, dVar);
    }

    @Override // com.apm.insight.runtime.a.c
    public final com.apm.insight.entity.a a(int i, com.apm.insight.entity.a aVar) {
        com.apm.insight.entity.a aVarA = super.a(i, aVar);
        if (i == 0) {
            aVarA.a("app_count", (java.lang.Object) 1);
            aVarA.a("magic_tag", "ss_app_log");
            com.apm.insight.entity.Header headerA = com.apm.insight.entity.Header.a(this.b);
            headerA.c();
            aVarA.a(headerA);
            com.apm.insight.a.a(aVarA, headerA, this.f468a);
        } else if (i == 1) {
            com.apm.insight.entity.Header headerD = aVarA.d();
            headerD.d();
            headerD.e();
        } else if (i == 2) {
            com.apm.insight.entity.Header.a(aVarA.d());
        } else if (i == 5) {
            com.apm.insight.entity.Header.b(aVarA.d());
        }
        return aVarA;
    }
}
