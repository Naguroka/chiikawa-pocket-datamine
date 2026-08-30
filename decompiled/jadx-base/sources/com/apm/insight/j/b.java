package com.apm.insight.j;

/* JADX INFO: compiled from: CommonParamsTask.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends com.apm.insight.j.a {
    private static java.lang.Runnable b = new java.lang.Runnable() { // from class: com.apm.insight.j.b.1
        @Override // java.lang.Runnable
        public final void run() {
            com.apm.insight.runtime.n.a().a().removeCallbacks(this);
            com.apm.insight.runtime.n.a().a(new com.apm.insight.j.b(com.apm.insight.runtime.n.a().a(), com.apm.insight.e.g()));
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private android.content.Context f414a;

    public b(android.os.Handler handler, android.content.Context context) {
        super(handler, 30000L);
        this.f414a = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.Map<java.lang.String, java.lang.Object> commonParams;
        try {
            commonParams = com.apm.insight.e.a().c().getCommonParams();
        } catch (java.lang.Throwable unused) {
            commonParams = null;
        }
        if (commonParams != null) {
            try {
                if (com.apm.insight.nativecrash.b.a(commonParams)) {
                    a(b());
                    return;
                }
            } catch (java.lang.Throwable unused2) {
                return;
            }
        }
        com.apm.insight.runtime.q.a().a(commonParams, com.apm.insight.entity.b.b());
    }

    public static void c() {
        com.apm.insight.runtime.n.a().a(b, 100L);
    }
}
