package com.apm.insight.runtime.a;

/* JADX INFO: compiled from: BlockAssembly.java */
/* JADX INFO: loaded from: classes3.dex */
public final class e extends com.apm.insight.runtime.a.c {
    @Override // com.apm.insight.runtime.a.c
    protected final boolean b() {
        return true;
    }

    @Override // com.apm.insight.runtime.a.c
    protected final boolean c() {
        return false;
    }

    e(android.content.Context context, com.apm.insight.runtime.a.b bVar, com.apm.insight.runtime.a.d dVar) {
        super(com.apm.insight.CrashType.BLOCK, context, bVar, dVar);
    }

    @Override // com.apm.insight.runtime.a.c
    public final com.apm.insight.entity.a a(com.apm.insight.entity.a aVar) {
        com.apm.insight.entity.a aVarA = super.a(aVar);
        com.apm.insight.a.a(aVarA, (com.apm.insight.entity.Header) null, this.f468a);
        return aVarA;
    }
}
