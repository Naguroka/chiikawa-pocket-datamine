package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.util.regex.Pattern f1580a = java.util.regex.Pattern.compile("^NOTE([ \t].*)?$");

    public static boolean a(com.applovin.impl.ah ahVar) {
        java.lang.String strL = ahVar.l();
        return strL != null && strL.startsWith("WEBVTT");
    }

    public static long b(java.lang.String str) {
        java.lang.String[] strArrB = com.applovin.impl.xp.b(str, "\\.");
        long j = 0;
        for (java.lang.String str2 : com.applovin.impl.xp.a(strArrB[0], ":")) {
            j = (j * 60) + java.lang.Long.parseLong(str2);
        }
        long j2 = j * 1000;
        if (strArrB.length == 2) {
            j2 += java.lang.Long.parseLong(strArrB[1]);
        }
        return j2 * 1000;
    }

    public static void b(com.applovin.impl.ah ahVar) throws com.applovin.impl.ch {
        int iD = ahVar.d();
        if (a(ahVar)) {
            return;
        }
        ahVar.f(iD);
        throw com.applovin.impl.ch.a("Expected WEBVTT. Got " + ahVar.l(), null);
    }

    public static float a(java.lang.String str) {
        if (str.endsWith("%")) {
            return java.lang.Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new java.lang.NumberFormatException("Percentages must end with %");
    }
}
