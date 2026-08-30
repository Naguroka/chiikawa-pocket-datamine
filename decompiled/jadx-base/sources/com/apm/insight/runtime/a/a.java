package com.apm.insight.runtime.a;

/* JADX INFO: compiled from: ANRAssembly.java */
/* JADX INFO: loaded from: classes3.dex */
final class a extends com.apm.insight.runtime.a.c {
    a(android.content.Context context, com.apm.insight.runtime.a.b bVar, com.apm.insight.runtime.a.d dVar) {
        super(com.apm.insight.CrashType.ANR, context, bVar, dVar);
    }

    @Override // com.apm.insight.runtime.a.c
    public final com.apm.insight.entity.a a(com.apm.insight.entity.a aVar) {
        com.apm.insight.entity.a aVarA = super.a(aVar);
        com.apm.insight.entity.Header headerA = com.apm.insight.entity.Header.a(this.b);
        com.apm.insight.entity.Header.a(headerA);
        com.apm.insight.entity.Header.b(headerA);
        headerA.c();
        headerA.d();
        headerA.e();
        aVarA.a(headerA);
        aVarA.a("process_name", (java.lang.Object) com.apm.insight.l.a.d(this.b));
        com.apm.insight.a.a(aVarA, headerA, this.f468a);
        return aVarA;
    }
}
