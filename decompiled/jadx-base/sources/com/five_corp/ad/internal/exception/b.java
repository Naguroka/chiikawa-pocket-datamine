package com.five_corp.ad.internal.exception;

/* JADX INFO: loaded from: classes4.dex */
public class b extends java.lang.Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.five_corp.ad.internal.t f1899a;

    public b(com.five_corp.ad.internal.t tVar, java.lang.String str) {
        super(str, null);
        this.f1899a = tVar;
    }

    @Override // java.lang.Throwable
    public final java.lang.String toString() {
        return super.toString() + this.f1899a.toString() + (getCause() == null ? "" : getCause().toString());
    }
}
