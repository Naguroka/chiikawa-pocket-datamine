package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.lang.String f748a = "ExoPlayerLib/2.15.1 (Linux; Android " + android.os.Build.VERSION.RELEASE + ") ExoPlayerLib/2.15.1";
    private static final java.util.HashSet b = new java.util.HashSet();
    private static java.lang.String c = "goog.exo.core";

    public static synchronized java.lang.String a() {
        return c;
    }

    public static synchronized void a(java.lang.String str) {
        if (b.add(str)) {
            c += ", " + str;
        }
    }
}
