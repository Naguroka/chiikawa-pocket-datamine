package com.google.android.gms.common.util;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public class SharedPreferencesUtils {
    private SharedPreferencesUtils() {
    }

    @java.lang.Deprecated
    public static void publishWorldReadableSharedPreferences(android.content.Context context, android.content.SharedPreferences.Editor editor, java.lang.String str) {
        throw new java.lang.IllegalStateException("world-readable shared preferences should only be used by apk");
    }
}
