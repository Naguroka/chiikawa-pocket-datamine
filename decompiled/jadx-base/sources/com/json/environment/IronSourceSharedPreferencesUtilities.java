package com.json.environment;

/* JADX INFO: loaded from: classes5.dex */
public class IronSourceSharedPreferencesUtilities {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.lang.String f2622a = "_preferences";

    static int a(android.content.Context context, java.lang.String str, java.lang.String str2, int i) {
        return context == null ? i : context.getSharedPreferences(str, 0).getInt(str2, i);
    }

    static void a(android.content.Context context, java.lang.String str, java.lang.String str2, boolean z) {
        if (context == null) {
            return;
        }
        android.content.SharedPreferences.Editor editorEdit = context.getSharedPreferences(str, 0).edit();
        editorEdit.putBoolean(str2, z);
        editorEdit.apply();
    }

    public static boolean getBooleanFromSharedPrefs(android.content.Context context, java.lang.String str, java.lang.String str2, boolean z) {
        return context == null ? z : context.getSharedPreferences(str, 0).getBoolean(str2, z);
    }

    public static java.lang.String getDefaultSharedPrefName(android.content.Context context, java.lang.String str) {
        return context == null ? str : context.getPackageName() + f2622a;
    }

    public static int getIntFromDefaultSharedPrefs(android.content.Context context, java.lang.String str, int i) {
        return a(context, getDefaultSharedPrefName(context, ""), str, i);
    }

    public static java.lang.String getStringFromDefaultSharedPrefs(android.content.Context context, java.lang.String str, java.lang.String str2) {
        return getStringFromSharedPrefs(context, getDefaultSharedPrefName(context, ""), str, str2);
    }

    public static java.lang.String getStringFromSharedPrefs(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return context == null ? str3 : context.getSharedPreferences(str, 0).getString(str2, str3);
    }

    public static void saveIntToSharedPrefs(android.content.Context context, java.lang.String str, java.lang.String str2, int i) {
        if (context == null) {
            return;
        }
        android.content.SharedPreferences.Editor editorEdit = context.getSharedPreferences(str, 0).edit();
        editorEdit.putInt(str2, i);
        editorEdit.apply();
    }

    public static void saveStringToSharedPrefs(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (context == null) {
            return;
        }
        android.content.SharedPreferences.Editor editorEdit = context.getSharedPreferences(str, 0).edit();
        editorEdit.putString(str2, str3);
        editorEdit.apply();
    }
}
