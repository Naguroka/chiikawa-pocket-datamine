package com.bytedance.sdk.component.utils;

/* JADX INFO: loaded from: classes3.dex */
public class WR {
    private static android.content.Context bg;

    public static void bg(android.content.Context context, java.lang.String str, java.lang.String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        try {
            bg = context.createConfigurationContext(IL(context, str, str2));
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.component.utils.PX.IL(th.getMessage());
        }
        com.bytedance.sdk.component.utils.Fy.bg(bg);
    }

    private static android.content.res.Configuration IL(android.content.Context context, java.lang.String str, java.lang.String str2) {
        android.content.res.Configuration configuration = new android.content.res.Configuration(context.getResources().getConfiguration());
        configuration.setLocale(new java.util.Locale(str, str2));
        return configuration;
    }
}
