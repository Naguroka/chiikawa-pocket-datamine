package com.apm.insight.runtime;

/* JADX INFO: compiled from: ConfigPropGetter.java */
/* JADX INFO: loaded from: classes3.dex */
public class e {
    private static final com.apm.insight.runtime.e b = new com.apm.insight.runtime.e() { // from class: com.apm.insight.runtime.e.1

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private com.apm.insight.entity.Header f479a = null;

        @Override // com.apm.insight.runtime.e
        public final java.lang.Object b(java.lang.String str) {
            if (this.f479a == null) {
                this.f479a = com.apm.insight.entity.Header.b(com.apm.insight.e.g());
            }
            return this.f479a.f().opt(str);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.apm.insight.runtime.e f478a;

    e() {
        this(b);
    }

    private e(com.apm.insight.runtime.e eVar) {
        this.f478a = eVar;
    }

    public java.lang.Object b(java.lang.String str) {
        com.apm.insight.runtime.e eVar = this.f478a;
        if (eVar != null) {
            return eVar.b(str);
        }
        return null;
    }

    public java.lang.Object a(java.lang.String str) {
        com.apm.insight.runtime.e eVar = this.f478a;
        if (eVar != null) {
            return eVar.a(str);
        }
        return null;
    }
}
