package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class xj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.j f1509a;
    private final java.util.Map b = new java.util.HashMap();
    private final java.lang.Object c = new java.lang.Object();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f1510a;

        static {
            int[] iArr = new int[com.applovin.impl.xj.b.values().length];
            f1510a = iArr;
            try {
                iArr[com.applovin.impl.xj.b.AD_FORMAT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f1510a[com.applovin.impl.xj.b.AD_UNIT_ID.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f1510a[com.applovin.impl.xj.b.ALL.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    public enum b {
        AD_FORMAT,
        AD_UNIT_ID,
        ALL
    }

    public xj(com.applovin.impl.sdk.j jVar) {
        this.f1509a = jVar;
    }

    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.applovin.impl.yj f1512a;
        private final long b;
        private final long c;

        /* JADX INFO: Access modifiers changed from: private */
        public boolean d() {
            return android.os.SystemClock.elapsedRealtime() - this.c > this.b;
        }

        public java.lang.String toString() {
            return "SignalCacheManager.SignalWrapper(signal=" + c() + ", expirationTimeMillis=" + b() + ", cacheTimestampMillis=" + a() + ")";
        }

        public boolean equals(java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof com.applovin.impl.xj.c)) {
                return false;
            }
            com.applovin.impl.xj.c cVar = (com.applovin.impl.xj.c) obj;
            if (!cVar.a((java.lang.Object) this) || b() != cVar.b() || a() != cVar.a()) {
                return false;
            }
            com.applovin.impl.yj yjVarC = c();
            com.applovin.impl.yj yjVarC2 = cVar.c();
            return yjVarC != null ? yjVarC.equals(yjVarC2) : yjVarC2 == null;
        }

        public int hashCode() {
            long jB = b();
            long jA = a();
            com.applovin.impl.yj yjVarC = c();
            return ((((((int) (jB ^ (jB >>> 32))) + 59) * 59) + ((int) ((jA >>> 32) ^ jA))) * 59) + (yjVarC == null ? 43 : yjVarC.hashCode());
        }

        public com.applovin.impl.yj c() {
            return this.f1512a;
        }

        private c(com.applovin.impl.yj yjVar, long j) {
            this.f1512a = yjVar;
            this.b = j;
            this.c = android.os.SystemClock.elapsedRealtime();
        }

        protected boolean a(java.lang.Object obj) {
            return obj instanceof com.applovin.impl.xj.c;
        }

        public long b() {
            return this.b;
        }

        /* synthetic */ c(com.applovin.impl.yj yjVar, long j, com.applovin.impl.xj.a aVar) {
            this(yjVar, j);
        }

        public long a() {
            return this.c;
        }
    }

    public com.applovin.impl.yj b(com.applovin.impl.zj zjVar, java.lang.String str, com.applovin.mediation.MaxAdFormat maxAdFormat) {
        java.lang.String strA = a(zjVar, str, maxAdFormat);
        synchronized (this.c) {
            com.applovin.impl.xj.c cVar = (com.applovin.impl.xj.c) this.b.get(strA);
            if (cVar == null) {
                return null;
            }
            if (cVar.d()) {
                this.b.remove(strA);
                return null;
            }
            this.f1509a.I();
            if (com.applovin.impl.sdk.n.a()) {
                this.f1509a.I().a("SignalCacheManager", "Returning cached signal for: " + zjVar);
            }
            return cVar.f1512a;
        }
    }

    private java.lang.String a(com.applovin.impl.zj zjVar, java.lang.String str, com.applovin.mediation.MaxAdFormat maxAdFormat) {
        java.lang.String strC = zjVar.c();
        int i = com.applovin.impl.xj.a.f1510a[zjVar.t().ordinal()];
        if (i != 1) {
            return i != 2 ? strC : strC + "_" + str;
        }
        return strC + "_" + maxAdFormat.getLabel();
    }

    public void a(com.applovin.impl.yj yjVar, com.applovin.impl.zj zjVar, java.lang.String str, com.applovin.mediation.MaxAdFormat maxAdFormat) {
        if (yjVar == null) {
            return;
        }
        long jU = zjVar.u();
        if (jU <= 0) {
            return;
        }
        this.f1509a.I();
        if (com.applovin.impl.sdk.n.a()) {
            this.f1509a.I().a("SignalCacheManager", "Caching signal for: " + zjVar);
        }
        java.lang.String strA = a(zjVar, str, maxAdFormat);
        com.applovin.impl.xj.c cVar = new com.applovin.impl.xj.c(yjVar, jU, null);
        synchronized (this.c) {
            this.b.put(strA, cVar);
        }
    }
}
