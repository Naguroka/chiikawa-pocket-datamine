package com.iab.omid.library.bytedance2.utils;

/* JADX INFO: loaded from: classes5.dex */
public final class d {
    public static void a(java.lang.String str) {
        if (!com.iab.omid.library.bytedance2.a.f2383a.booleanValue() || android.text.TextUtils.isEmpty(str)) {
            return;
        }
        android.util.Log.i("OMIDLIB", str);
    }

    public static void a(java.lang.String str, java.lang.Exception exc) {
        if ((!com.iab.omid.library.bytedance2.a.f2383a.booleanValue() || android.text.TextUtils.isEmpty(str)) && exc == null) {
            return;
        }
        android.util.Log.e("OMIDLIB", str, exc);
    }

    public static void b(java.lang.String str) {
        if (!com.iab.omid.library.bytedance2.a.f2383a.booleanValue() || android.text.TextUtils.isEmpty(str)) {
            return;
        }
        android.util.Log.w("OMIDLIB", str);
    }
}
