package com.iab.omid.library.ironsrc.utils;

/* JADX INFO: loaded from: classes5.dex */
public final class d {
    public static void a(java.lang.String str) {
        if (!com.iab.omid.library.ironsrc.a.f2418a.booleanValue() || android.text.TextUtils.isEmpty(str)) {
            return;
        }
        android.util.Log.i("OMIDLIB", str);
    }

    public static void a(java.lang.String str, java.lang.Exception exc) {
        if ((!com.iab.omid.library.ironsrc.a.f2418a.booleanValue() || android.text.TextUtils.isEmpty(str)) && exc == null) {
            return;
        }
        android.util.Log.e("OMIDLIB", str, exc);
    }
}
