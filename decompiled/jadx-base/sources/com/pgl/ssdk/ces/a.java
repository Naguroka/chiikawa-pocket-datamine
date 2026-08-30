package com.pgl.ssdk.ces;

/* JADX INFO: loaded from: classes3.dex */
public final class a {
    public static native java.lang.Object meta(int i, android.content.Context context, java.lang.Object obj);

    public static java.lang.Object njss(int i, java.lang.Object obj) {
        try {
            com.pgl.ssdk.ces.b bVarH = com.pgl.ssdk.ces.b.h();
            if (bVarH != null) {
                return bVarH.a(i, obj);
            }
            return null;
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }
}
