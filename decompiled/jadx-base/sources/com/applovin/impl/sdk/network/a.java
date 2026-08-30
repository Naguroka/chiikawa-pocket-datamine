package com.applovin.impl.sdk.network;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.lang.String f1316a;
    private java.lang.String b;
    private java.util.Map c;
    private java.util.Map d;
    private final org.json.JSONObject e;
    private java.lang.String f;
    private final java.lang.Object g;
    private final int h;
    private int i;
    private final int j;
    private final int k;
    private final boolean l;
    private final boolean m;
    private final boolean n;
    private final boolean o;
    private final com.applovin.impl.vi.a p;
    private final boolean q;
    private final boolean r;

    /* JADX INFO: renamed from: com.applovin.impl.sdk.network.a$a, reason: collision with other inner class name */
    public static class C0055a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        java.lang.String f1317a;
        java.lang.String b;
        java.lang.String c;
        java.util.Map e;
        org.json.JSONObject f;
        java.lang.Object g;
        int i;
        int j;
        boolean k;
        boolean m;
        boolean n;
        boolean o;
        boolean p;
        com.applovin.impl.vi.a q;
        int h = 1;
        boolean l = true;
        java.util.Map d = new java.util.HashMap();

        public C0055a(com.applovin.impl.sdk.j jVar) {
            this.i = ((java.lang.Integer) jVar.a(com.applovin.impl.sj.U2)).intValue();
            this.j = ((java.lang.Integer) jVar.a(com.applovin.impl.sj.T2)).intValue();
            this.m = ((java.lang.Boolean) jVar.a(com.applovin.impl.sj.r3)).booleanValue();
            this.n = ((java.lang.Boolean) jVar.a(com.applovin.impl.sj.a5)).booleanValue();
            this.q = com.applovin.impl.vi.a.a(((java.lang.Integer) jVar.a(com.applovin.impl.sj.b5)).intValue());
            this.p = ((java.lang.Boolean) jVar.a(com.applovin.impl.sj.y5)).booleanValue();
        }

        public com.applovin.impl.sdk.network.a.C0055a b(java.lang.String str) {
            this.b = str;
            return this;
        }

        public com.applovin.impl.sdk.network.a.C0055a c(java.lang.String str) {
            this.f1317a = str;
            return this;
        }

        public com.applovin.impl.sdk.network.a.C0055a d(boolean z) {
            this.l = z;
            return this;
        }

        public com.applovin.impl.sdk.network.a.C0055a e(boolean z) {
            this.m = z;
            return this;
        }

        public com.applovin.impl.sdk.network.a.C0055a f(boolean z) {
            this.o = z;
            return this;
        }

        public com.applovin.impl.sdk.network.a.C0055a b(java.util.Map map) {
            this.d = map;
            return this;
        }

        public com.applovin.impl.sdk.network.a.C0055a c(int i) {
            this.i = i;
            return this;
        }

        public com.applovin.impl.sdk.network.a.C0055a b(int i) {
            this.j = i;
            return this;
        }

        public com.applovin.impl.sdk.network.a.C0055a c(boolean z) {
            this.k = z;
            return this;
        }

        public com.applovin.impl.sdk.network.a.C0055a b(boolean z) {
            this.p = z;
            return this;
        }

        public com.applovin.impl.sdk.network.a.C0055a a(com.applovin.impl.vi.a aVar) {
            this.q = aVar;
            return this;
        }

        public com.applovin.impl.sdk.network.a.C0055a a(java.util.Map map) {
            this.e = map;
            return this;
        }

        public com.applovin.impl.sdk.network.a.C0055a a(org.json.JSONObject jSONObject) {
            this.f = jSONObject;
            return this;
        }

        public com.applovin.impl.sdk.network.a.C0055a a(java.lang.String str) {
            this.c = str;
            return this;
        }

        public com.applovin.impl.sdk.network.a.C0055a a(java.lang.Object obj) {
            this.g = obj;
            return this;
        }

        public com.applovin.impl.sdk.network.a.C0055a a(int i) {
            this.h = i;
            return this;
        }

        public com.applovin.impl.sdk.network.a.C0055a a(boolean z) {
            this.n = z;
            return this;
        }

        public com.applovin.impl.sdk.network.a a() {
            return new com.applovin.impl.sdk.network.a(this);
        }
    }

    protected a(com.applovin.impl.sdk.network.a.C0055a c0055a) {
        this.f1316a = c0055a.b;
        this.b = c0055a.f1317a;
        this.c = c0055a.d;
        this.d = c0055a.e;
        this.e = c0055a.f;
        this.f = c0055a.c;
        this.g = c0055a.g;
        int i = c0055a.h;
        this.h = i;
        this.i = i;
        this.j = c0055a.i;
        this.k = c0055a.j;
        this.l = c0055a.k;
        this.m = c0055a.l;
        this.n = c0055a.m;
        this.o = c0055a.n;
        this.p = c0055a.q;
        this.q = c0055a.o;
        this.r = c0055a.p;
    }

    public void a(java.lang.String str) {
        this.f1316a = str;
    }

    public void b(java.lang.String str) {
        this.b = str;
    }

    public int c() {
        return this.h - this.i;
    }

    public java.lang.Object d() {
        return this.g;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.applovin.impl.sdk.network.a)) {
            return false;
        }
        com.applovin.impl.sdk.network.a aVar = (com.applovin.impl.sdk.network.a) obj;
        java.lang.String str = this.f1316a;
        if (str == null ? aVar.f1316a != null : !str.equals(aVar.f1316a)) {
            return false;
        }
        java.util.Map map = this.c;
        if (map == null ? aVar.c != null : !map.equals(aVar.c)) {
            return false;
        }
        java.util.Map map2 = this.d;
        if (map2 == null ? aVar.d != null : !map2.equals(aVar.d)) {
            return false;
        }
        java.lang.String str2 = this.f;
        if (str2 == null ? aVar.f != null : !str2.equals(aVar.f)) {
            return false;
        }
        java.lang.String str3 = this.b;
        if (str3 == null ? aVar.b != null : !str3.equals(aVar.b)) {
            return false;
        }
        org.json.JSONObject jSONObject = this.e;
        if (jSONObject == null ? aVar.e != null : !jSONObject.equals(aVar.e)) {
            return false;
        }
        java.lang.Object obj2 = this.g;
        if (obj2 == null ? aVar.g == null : obj2.equals(aVar.g)) {
            return this.h == aVar.h && this.i == aVar.i && this.j == aVar.j && this.k == aVar.k && this.l == aVar.l && this.m == aVar.m && this.n == aVar.n && this.o == aVar.o && this.p == aVar.p && this.q == aVar.q && this.r == aVar.r;
        }
        return false;
    }

    public java.lang.String f() {
        return this.f1316a;
    }

    public java.util.Map g() {
        return this.d;
    }

    public java.lang.String h() {
        return this.b;
    }

    public int hashCode() {
        int iHashCode = super.hashCode() * 31;
        java.lang.String str = this.f1316a;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        java.lang.String str2 = this.f;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        java.lang.String str3 = this.b;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        java.lang.Object obj = this.g;
        int iHashCode5 = ((((((((((((((((((((((iHashCode4 + (obj != null ? obj.hashCode() : 0)) * 31) + this.h) * 31) + this.i) * 31) + this.j) * 31) + this.k) * 31) + (this.l ? 1 : 0)) * 31) + (this.m ? 1 : 0)) * 31) + (this.n ? 1 : 0)) * 31) + (this.o ? 1 : 0)) * 31) + this.p.b()) * 31) + (this.q ? 1 : 0)) * 31) + (this.r ? 1 : 0);
        java.util.Map map = this.c;
        if (map != null) {
            iHashCode5 = (iHashCode5 * 31) + map.hashCode();
        }
        java.util.Map map2 = this.d;
        if (map2 != null) {
            iHashCode5 = (iHashCode5 * 31) + map2.hashCode();
        }
        org.json.JSONObject jSONObject = this.e;
        if (jSONObject == null) {
            return iHashCode5;
        }
        char[] charArray = jSONObject.toString().toCharArray();
        java.util.Arrays.sort(charArray);
        return (iHashCode5 * 31) + new java.lang.String(charArray).hashCode();
    }

    public java.util.Map i() {
        return this.c;
    }

    public int j() {
        return this.i;
    }

    public int k() {
        return this.k;
    }

    public int l() {
        return this.j;
    }

    public boolean m() {
        return this.o;
    }

    public boolean n() {
        return this.l;
    }

    public boolean o() {
        return this.r;
    }

    public boolean p() {
        return this.m;
    }

    public boolean q() {
        return this.n;
    }

    public boolean r() {
        return this.q;
    }

    public java.lang.String toString() {
        return "HttpRequest {endpoint=" + this.f1316a + ", backupEndpoint=" + this.f + ", httpMethod=" + this.b + ", httpHeaders=" + this.d + ", body=" + this.e + ", emptyResponse=" + this.g + ", initialRetryAttempts=" + this.h + ", retryAttemptsLeft=" + this.i + ", timeoutMillis=" + this.j + ", retryDelayMillis=" + this.k + ", exponentialRetries=" + this.l + ", retryOnAllErrors=" + this.m + ", retryOnNoConnection=" + this.n + ", encodingEnabled=" + this.o + ", encodingType=" + this.p + ", trackConnectionSpeed=" + this.q + ", gzipBodyEncoding=" + this.r + '}';
    }

    public java.lang.String a() {
        return this.f;
    }

    public org.json.JSONObject b() {
        return this.e;
    }

    public void a(int i) {
        this.i = i;
    }

    public static com.applovin.impl.sdk.network.a.C0055a a(com.applovin.impl.sdk.j jVar) {
        return new com.applovin.impl.sdk.network.a.C0055a(jVar);
    }

    public com.applovin.impl.vi.a e() {
        return this.p;
    }
}
