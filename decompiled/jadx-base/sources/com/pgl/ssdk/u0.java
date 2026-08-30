package com.pgl.ssdk;

/* JADX INFO: loaded from: classes3.dex */
public class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static android.content.SharedPreferences f3811a;

    public static java.lang.String a(android.content.Context context, java.lang.String str) {
        return a(context, str, "");
    }

    public static void b(android.content.Context context, java.lang.String str, java.lang.String str2) {
        android.content.SharedPreferences sharedPreferencesA = a(context);
        if (sharedPreferencesA != null) {
            sharedPreferencesA.edit().putString(str, str2).apply();
        }
    }

    public static java.lang.String a(android.content.Context context, java.lang.String str, java.lang.String str2) {
        android.content.SharedPreferences sharedPreferencesA = a(context);
        return sharedPreferencesA != null ? sharedPreferencesA.getString(str, str2) : str2;
    }

    public static void b(android.content.Context context, java.lang.String str, int i) {
        android.content.SharedPreferences sharedPreferencesA = a(context);
        if (sharedPreferencesA != null) {
            sharedPreferencesA.edit().putInt(str, i).apply();
        }
    }

    public static int a(android.content.Context context, java.lang.String str, int i) {
        android.content.SharedPreferences sharedPreferencesA = a(context);
        return sharedPreferencesA != null ? sharedPreferencesA.getInt(str, i) : i;
    }

    public static android.content.SharedPreferences a(android.content.Context context) {
        if (f3811a == null) {
            f3811a = context.getSharedPreferences("ss_config", 0);
        }
        return f3811a;
    }
}
