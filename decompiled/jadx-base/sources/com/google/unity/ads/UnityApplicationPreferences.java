package com.google.unity.ads;

/* JADX INFO: loaded from: classes5.dex */
public final class UnityApplicationPreferences {
    private final android.content.SharedPreferences defaultSharedPreferences;

    public UnityApplicationPreferences(final android.app.Activity activity) {
        this.defaultSharedPreferences = android.preference.PreferenceManager.getDefaultSharedPreferences(activity);
    }

    public void setInt(java.lang.String key, int value) {
        android.content.SharedPreferences.Editor editorEdit = this.defaultSharedPreferences.edit();
        editorEdit.putInt(key, value);
        editorEdit.apply();
    }

    public void setString(java.lang.String key, java.lang.String value) {
        android.content.SharedPreferences.Editor editorEdit = this.defaultSharedPreferences.edit();
        editorEdit.putString(key, value);
        editorEdit.apply();
    }

    public int getInt(java.lang.String key) {
        return this.defaultSharedPreferences.getInt(key, 0);
    }

    public java.lang.String getString(java.lang.String key) {
        return this.defaultSharedPreferences.getString(key, null);
    }
}
