package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class i5 extends java.io.IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f874a;

    public static boolean a(java.io.IOException iOException) {
        for (java.lang.Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if ((cause instanceof com.applovin.impl.i5) && ((com.applovin.impl.i5) cause).f874a == 2008) {
                return true;
            }
        }
        return false;
    }

    public i5(int i) {
        this.f874a = i;
    }

    public i5(java.lang.String str, int i) {
        super(str);
        this.f874a = i;
    }

    public i5(java.lang.String str, java.lang.Throwable th, int i) {
        super(str, th);
        this.f874a = i;
    }

    public i5(java.lang.Throwable th, int i) {
        super(th);
        this.f874a = i;
    }
}
