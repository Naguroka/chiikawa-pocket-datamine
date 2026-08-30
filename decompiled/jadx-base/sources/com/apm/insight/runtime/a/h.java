package com.apm.insight.runtime.a;

/* JADX INFO: compiled from: DartCrashAssembly.java */
/* JADX INFO: loaded from: classes3.dex */
final class h extends com.apm.insight.runtime.a.c {
    h(android.content.Context context, com.apm.insight.runtime.a.b bVar, com.apm.insight.runtime.a.d dVar) {
        super(com.apm.insight.CrashType.DART, context, bVar, dVar);
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
        com.apm.insight.a.a(aVarA, headerA, this.f468a);
        return aVarA;
    }
}
