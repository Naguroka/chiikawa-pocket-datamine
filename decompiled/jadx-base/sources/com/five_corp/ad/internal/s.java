package com.five_corp.ad.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.five_corp.ad.internal.t f2045a;
    public final java.lang.String b;
    public final java.lang.Throwable c;
    public final com.five_corp.ad.internal.s d;

    public s(com.five_corp.ad.internal.t tVar, java.lang.String str, java.lang.Throwable th, com.five_corp.ad.internal.s sVar) {
        this.f2045a = tVar;
        this.b = str;
        this.c = th;
        this.d = sVar;
    }

    public final com.five_corp.ad.FiveAdErrorCode a() {
        com.five_corp.ad.internal.s sVar = this.d;
        return sVar != null ? sVar.a() : this.f2045a.b;
    }

    public final java.lang.String b() {
        com.five_corp.ad.internal.s sVar = this.d;
        java.lang.String strB = sVar != null ? sVar.b() : "null";
        return "DetailedErrorCode: " + this.f2045a.name() + ", information: " + java.lang.String.valueOf(this.b) + ", exception: " + android.util.Log.getStackTraceString(this.c) + ", cause: " + strB;
    }
}
