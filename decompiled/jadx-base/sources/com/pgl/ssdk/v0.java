package com.pgl.ssdk;

/* JADX INFO: loaded from: classes3.dex */
public class v0 {
    public static java.lang.String a(java.lang.String str) {
        try {
            return (java.lang.String) java.lang.Class.forName("android.os.SystemProperties").getDeclaredMethod("get", java.lang.String.class).invoke(null, str);
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }
}
