package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class yj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.zj f1545a;
    private final java.lang.String b;
    private final java.lang.String c;
    private final java.lang.String d;
    private final com.applovin.mediation.MaxError e;
    private final long f;
    private final long g;
    private final boolean h;

    public interface a {
        void a(com.applovin.impl.yj yjVar);
    }

    public long b() {
        return this.g;
    }

    public boolean g() {
        return this.h;
    }

    public static com.applovin.impl.yj a(com.applovin.impl.zj zjVar, com.applovin.impl.mediation.g gVar, com.applovin.mediation.MaxError maxError, long j, long j2) {
        if (zjVar != null) {
            return new com.applovin.impl.yj(zjVar, gVar, null, maxError, j, j2);
        }
        throw new java.lang.IllegalArgumentException("No spec specified");
    }

    private yj(com.applovin.impl.zj zjVar, com.applovin.impl.mediation.g gVar, java.lang.String str, com.applovin.mediation.MaxError maxError, long j, long j2) {
        this(zjVar, str, maxError, j, j2, gVar != null ? gVar.i() : null, gVar != null ? gVar.b() : null, false);
    }

    public com.applovin.impl.zj f() {
        return this.f1545a;
    }

    public java.lang.String d() {
        return this.b;
    }

    public static com.applovin.impl.yj a(com.applovin.impl.zj zjVar, com.applovin.mediation.MaxError maxError) {
        return a(zjVar, (com.applovin.impl.mediation.g) null, maxError, -1L, -1L);
    }

    public java.lang.String e() {
        return this.d;
    }

    public com.applovin.mediation.MaxError c() {
        return this.e;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sbAppend = new java.lang.StringBuilder("SignalCollectionResult{mSignalProviderSpec=").append(this.f1545a).append(", mSdkVersion='").append(this.b).append("', mAdapterVersion='").append(this.c).append("', mSignalDataLength='");
        java.lang.String str = this.d;
        java.lang.StringBuilder sbAppend2 = sbAppend.append(str != null ? str.length() : 0).append("', mErrorMessage=");
        com.applovin.mediation.MaxError maxError = this.e;
        return sbAppend2.append(maxError != null ? maxError.getMessage() : "").append('}').toString();
    }

    public static com.applovin.impl.yj a(com.applovin.impl.zj zjVar, com.applovin.impl.mediation.g gVar, java.lang.String str, long j, long j2) {
        if (zjVar == null) {
            throw new java.lang.IllegalArgumentException("No spec specified");
        }
        if (gVar != null) {
            return new com.applovin.impl.yj(zjVar, gVar, str, null, j, j2);
        }
        throw new java.lang.IllegalArgumentException("No adapterWrapper specified");
    }

    private yj(com.applovin.impl.zj zjVar, java.lang.String str, com.applovin.mediation.MaxError maxError, long j, long j2, java.lang.String str2, java.lang.String str3, boolean z) {
        this.f1545a = zjVar;
        this.d = str;
        this.e = maxError;
        this.f = j;
        this.g = j2;
        this.b = str2;
        this.c = str3;
        this.h = z;
    }

    public java.lang.String a() {
        return this.c;
    }

    public static com.applovin.impl.yj a(com.applovin.impl.yj yjVar) {
        return new com.applovin.impl.yj(yjVar.f(), yjVar.e(), yjVar.c(), yjVar.f, yjVar.g, yjVar.d(), yjVar.a(), true);
    }
}
