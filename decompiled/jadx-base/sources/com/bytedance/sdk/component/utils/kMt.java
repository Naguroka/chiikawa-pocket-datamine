package com.bytedance.sdk.component.utils;

/* JADX INFO: loaded from: classes3.dex */
public class kMt {
    public static java.lang.reflect.Method bg(java.lang.String str, java.lang.String str2, java.lang.Class<?>... clsArr) {
        if (android.text.TextUtils.isEmpty(str) || android.text.TextUtils.isEmpty(str2)) {
            return null;
        }
        try {
            java.lang.Class<?> clsBg = bg(str);
            if (clsBg != null) {
                return clsBg.getMethod(str2, clsArr);
            }
            return null;
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    public static java.lang.Class<?> bg(java.lang.String str) {
        try {
            try {
                try {
                    return java.lang.Class.forName(str, true, bg());
                } catch (java.lang.ClassNotFoundException unused) {
                    return java.lang.Class.forName(str);
                }
            } catch (java.lang.ClassNotFoundException unused2) {
                return null;
            }
        } catch (java.lang.ClassNotFoundException unused3) {
            return java.lang.Class.forName(str, true, com.bytedance.sdk.component.utils.kMt.class.getClassLoader());
        }
    }

    private static java.lang.ClassLoader bg() {
        java.lang.ClassLoader contextClassLoader = java.lang.Thread.currentThread().getContextClassLoader();
        return contextClassLoader == null ? com.bytedance.sdk.component.utils.kMt.class.getClassLoader() : contextClassLoader;
    }
}
