package com.pgl.ssdk;

/* JADX INFO: loaded from: classes3.dex */
public class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f3797a = -1;

    public static void a(int i) {
        f3797a = i;
    }

    public static java.lang.String b() {
        int i = f3797a;
        if (i != 0) {
            return i != 1 ? "" : "https://ssdk-va.pangle.io/ssdk/sd/token";
        }
        return "https://ssdk-sg.pangle.io/ssdk/sd/token";
    }

    public static java.lang.String a() {
        int i = f3797a;
        if (i != 0) {
            return i != 1 ? "" : "https://ssdk-va.pangle.io/ssdk/v2/r";
        }
        return "https://ssdk-sg.pangle.io/ssdk/v2/r";
    }
}
