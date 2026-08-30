package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class j9 implements java.lang.Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.lang.Thread.UncaughtExceptionHandler f2815a;

    j9(java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f2815a = uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(java.lang.Thread thread, java.lang.Throwable th) {
        com.json.k9 k9Var = new com.json.k9(th);
        if (k9Var.getIsIronsourceCrash()) {
            new com.json.ic(k9Var.getStackTrace(), "" + java.lang.System.currentTimeMillis(), "Crash").a();
        }
        this.f2815a.uncaughtException(thread, th);
    }
}
