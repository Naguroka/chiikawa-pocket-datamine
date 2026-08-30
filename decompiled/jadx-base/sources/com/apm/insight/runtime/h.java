package com.apm.insight.runtime;

/* JADX INFO: compiled from: DefaultCommonParams.java */
/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.lang.String f481a = null;
    private int b = -1;

    public static com.apm.insight.nativecrash.b a(android.content.Context context) {
        return new com.apm.insight.nativecrash.b(context, new com.apm.insight.ICommonParams() { // from class: com.apm.insight.runtime.h.1
            @Override // com.apm.insight.ICommonParams
            public final java.lang.String getDeviceId() {
                return null;
            }

            @Override // com.apm.insight.ICommonParams
            public final java.util.List<java.lang.String> getPatchInfo() {
                return null;
            }

            @Override // com.apm.insight.ICommonParams
            public final java.util.Map<java.lang.String, java.lang.Integer> getPluginInfo() {
                return null;
            }

            @Override // com.apm.insight.ICommonParams
            public final java.lang.String getSessionId() {
                return null;
            }

            @Override // com.apm.insight.ICommonParams
            public final long getUserId() {
                return 0L;
            }

            @Override // com.apm.insight.ICommonParams
            public final java.util.Map<java.lang.String, java.lang.Object> getCommonParams() {
                return new java.util.HashMap();
            }
        });
    }

    public final void a(java.lang.String str) {
        this.f481a = str;
        com.apm.insight.runtime.q.a().a(str);
    }

    public final java.lang.String a() {
        if (!android.text.TextUtils.isEmpty(this.f481a) && !"0".equals(this.f481a)) {
            return this.f481a;
        }
        java.lang.String strD = com.apm.insight.e.a().d();
        this.f481a = strD;
        if (android.text.TextUtils.isEmpty(strD) || "0".equals(this.f481a)) {
            java.lang.String strB = com.apm.insight.runtime.q.a().b();
            this.f481a = strB;
            return strB;
        }
        return this.f481a;
    }

    public final boolean b() {
        return this.f481a != null;
    }
}
