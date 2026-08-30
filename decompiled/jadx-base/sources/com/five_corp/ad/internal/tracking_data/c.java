package com.five_corp.ad.internal.tracking_data;

/* JADX INFO: loaded from: classes4.dex */
public abstract class c {
    public static java.lang.String a(android.content.Context context) {
        android.content.SharedPreferences defaultSharedPreferences = androidx.preference.PreferenceManager.getDefaultSharedPreferences(context);
        try {
            java.lang.String string = defaultSharedPreferences.getString("com.five_corp.ad.user.id", null);
            if (string != null) {
                return string;
            }
        } catch (java.lang.ClassCastException unused) {
        }
        java.lang.String string2 = java.util.UUID.randomUUID().toString();
        android.content.SharedPreferences.Editor editorEdit = defaultSharedPreferences.edit();
        editorEdit.putString("com.five_corp.ad.user.id", string2);
        editorEdit.apply();
        return string2;
    }
}
