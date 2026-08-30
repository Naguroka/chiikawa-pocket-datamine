package com.applovin.impl.sdk;

/* JADX INFO: loaded from: classes3.dex */
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.n f1322a;
    private final java.util.Map b = new java.util.HashMap(5);
    private final java.lang.Object c = new java.lang.Object();
    private final java.util.Map d = java.util.Collections.synchronizedMap(new java.util.HashMap(5));
    private final java.util.Map e = java.util.Collections.synchronizedMap(new java.util.HashMap(5));

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.lang.String f1323a;
        private final java.lang.String b;
        private final java.lang.String c;
        private java.lang.String d;
        private java.lang.String e;

        public a(java.lang.String str, java.lang.String str2, java.lang.String str3) {
            this.f1323a = str;
            this.b = str2;
            this.c = str3;
        }

        protected boolean a(java.lang.Object obj) {
            return obj instanceof com.applovin.impl.sdk.o.a;
        }

        public java.lang.String c() {
            return this.c;
        }

        public java.lang.String d() {
            return this.d;
        }

        public java.lang.String e() {
            return this.e;
        }

        public boolean equals(java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof com.applovin.impl.sdk.o.a)) {
                return false;
            }
            com.applovin.impl.sdk.o.a aVar = (com.applovin.impl.sdk.o.a) obj;
            if (!aVar.a(this)) {
                return false;
            }
            java.lang.String strB = b();
            java.lang.String strB2 = aVar.b();
            if (strB != null ? !strB.equals(strB2) : strB2 != null) {
                return false;
            }
            java.lang.String strA = a();
            java.lang.String strA2 = aVar.a();
            if (strA != null ? !strA.equals(strA2) : strA2 != null) {
                return false;
            }
            java.lang.String strC = c();
            java.lang.String strC2 = aVar.c();
            if (strC != null ? !strC.equals(strC2) : strC2 != null) {
                return false;
            }
            java.lang.String strD = d();
            java.lang.String strD2 = aVar.d();
            if (strD != null ? !strD.equals(strD2) : strD2 != null) {
                return false;
            }
            java.lang.String strE = e();
            java.lang.String strE2 = aVar.e();
            return strE != null ? strE.equals(strE2) : strE2 == null;
        }

        public int hashCode() {
            java.lang.String strB = b();
            int iHashCode = strB == null ? 43 : strB.hashCode();
            java.lang.String strA = a();
            int iHashCode2 = ((iHashCode + 59) * 59) + (strA == null ? 43 : strA.hashCode());
            java.lang.String strC = c();
            int iHashCode3 = (iHashCode2 * 59) + (strC == null ? 43 : strC.hashCode());
            java.lang.String strD = d();
            int iHashCode4 = (iHashCode3 * 59) + (strD == null ? 43 : strD.hashCode());
            java.lang.String strE = e();
            return (iHashCode4 * 59) + (strE != null ? strE.hashCode() : 43);
        }

        public java.lang.String toString() {
            return "MediationWaterfallWinnerTracker.WinningAd(bCode=" + b() + ", adapterName=" + a() + ", networkName=" + c() + ", secondWinnerAdapterName=" + d() + ", secondWinnerNetworkName=" + e() + ")";
        }

        public java.lang.String b() {
            return this.f1323a;
        }

        public java.lang.String a() {
            return this.b;
        }
    }

    o(com.applovin.impl.sdk.j jVar) {
        this.f1322a = jVar.I();
    }

    public void c(com.applovin.impl.fe feVar) {
        a(feVar, null);
    }

    public com.applovin.impl.sdk.o.a c(java.lang.String str) {
        com.applovin.impl.sdk.o.a aVar;
        synchronized (this.c) {
            aVar = (com.applovin.impl.sdk.o.a) this.b.get(str);
        }
        return aVar;
    }

    public void b(com.applovin.impl.fe feVar) {
        this.d.put(feVar.getAdUnitId(), feVar.R());
    }

    public java.lang.String b(java.lang.String str) {
        return (java.lang.String) this.d.get(str);
    }

    public void a(com.applovin.impl.fe feVar) {
        synchronized (this.c) {
            java.lang.String adUnitId = feVar.getAdUnitId();
            com.applovin.impl.sdk.o.a aVar = (com.applovin.impl.sdk.o.a) this.b.get(adUnitId);
            if (aVar == null) {
                if (com.applovin.impl.sdk.n.a()) {
                    this.f1322a.a("MediationWaterfallWinnerTracker", "No previous winner to clear.");
                }
                return;
            }
            if (feVar.B().equals(aVar.b())) {
                if (com.applovin.impl.sdk.n.a()) {
                    this.f1322a.a("MediationWaterfallWinnerTracker", "Clearing previous winning ad: " + aVar);
                }
                this.b.remove(adUnitId);
            } else if (com.applovin.impl.sdk.n.a()) {
                this.f1322a.a("MediationWaterfallWinnerTracker", "Previous winner not cleared for ad: " + feVar + " , since it could have already been updated with a new ad: " + aVar);
            }
        }
    }

    public void a(com.applovin.impl.fe feVar, com.applovin.impl.fe feVar2) {
        synchronized (this.c) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f1322a.a("MediationWaterfallWinnerTracker", "Tracking winning ad: " + feVar);
            }
            com.applovin.impl.sdk.o.a aVar = new com.applovin.impl.sdk.o.a(feVar.B(), feVar.c(), feVar.getNetworkName());
            if (feVar2 != null) {
                aVar.d = feVar2.c();
                aVar.e = feVar2.getNetworkName();
            }
            this.b.put(feVar.getAdUnitId(), aVar);
        }
        this.e.put(feVar.getAdUnitId(), feVar.R());
    }

    public java.lang.String a(java.lang.String str) {
        return (java.lang.String) this.e.get(str);
    }
}
