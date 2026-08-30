package com.facebook.ads.internal.api;

/* JADX INFO: loaded from: classes4.dex */
public class BuildConfigApi {
    static final java.lang.String UNITY_SHARED_PREFERENCES_SUFIX = ".v2.playerprefs";
    static final java.lang.String UNITY_TAG = "an_isUnitySDK";
    static final java.lang.String UNITY_VERSION_SUFIX = "-unity";

    public static java.lang.String getVersionName(android.content.Context context) {
        if (isUnity(context)) {
            return com.facebook.ads.BuildConfig.VERSION_NAME + UNITY_VERSION_SUFIX;
        }
        return com.facebook.ads.BuildConfig.VERSION_NAME;
    }

    private static boolean isUnity(android.content.Context context) {
        return context.getSharedPreferences(new java.lang.StringBuilder().append(context.getPackageName()).append(UNITY_SHARED_PREFERENCES_SUFIX).toString(), 0).contains(UNITY_TAG) || context.getSharedPreferences(context.getPackageName(), 0).contains(UNITY_TAG);
    }

    public static boolean isDebug() {
        return com.facebook.ads.BuildConfig.DEBUG;
    }
}
