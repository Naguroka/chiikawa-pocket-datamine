package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ko {
    public static void a(java.lang.String str) {
        if (com.applovin.impl.xp.f1515a >= 18) {
            b(str);
        }
    }

    public static void a() {
        if (com.applovin.impl.xp.f1515a >= 18) {
            b();
        }
    }

    private static void b(java.lang.String str) {
        android.os.Trace.beginSection(str);
    }

    private static void b() {
        android.os.Trace.endSection();
    }
}
