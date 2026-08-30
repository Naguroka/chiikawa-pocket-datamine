package com.apm.insight.c;

/* JADX INFO: compiled from: CommandWriter.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static java.util.concurrent.atomic.AtomicBoolean f382a = new java.util.concurrent.atomic.AtomicBoolean(false);

    public static boolean a() {
        synchronized (f382a) {
            if (f382a.get()) {
                return false;
            }
            f382a.set(true);
            return b();
        }
    }

    public static boolean b() {
        if (!com.apm.insight.runtime.a.g()) {
            return false;
        }
        try {
            java.io.File file = new java.io.File(com.apm.insight.e.h().getFilesDir(), "apminsight/crashCommand");
            file.mkdirs();
            new java.io.File(file, "0_" + java.lang.System.currentTimeMillis()).createNewFile();
            return true;
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }
}
