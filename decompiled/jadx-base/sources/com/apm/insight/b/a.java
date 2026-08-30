package com.apm.insight.b;

/* JADX INFO: compiled from: ANRInfoHelper.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a {
    public a() {
        com.apm.insight.f.a.a();
    }

    public static void a(java.lang.String str) {
        if (com.apm.insight.e.i().isEnsureEnable()) {
            com.apm.insight.f.b.a(java.lang.Thread.currentThread().getStackTrace(), str, "EnsureNotReachHere");
        }
    }
}
