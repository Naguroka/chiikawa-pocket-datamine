package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class wh {
    public static boolean a(android.content.Context context) {
        return com.applovin.impl.z3.a("android.permission.ACCESS_ADSERVICES_AD_ID", context);
    }

    public static boolean b(android.content.Context context) {
        return com.applovin.impl.z3.a("android.permission.ACCESS_ADSERVICES_ATTRIBUTION", context);
    }

    public static boolean c(android.content.Context context) {
        return com.applovin.impl.z3.a("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE", context);
    }

    public static boolean d(android.content.Context context) {
        return com.applovin.impl.z3.a("android.permission.ACCESS_ADSERVICES_TOPICS", context);
    }

    public static boolean f(android.content.Context context) {
        return com.applovin.impl.z3.c() && !com.applovin.sdk.AppLovinSdkUtils.isFireOS(context);
    }

    public static boolean e(android.content.Context context) {
        return f(context) && android.adservices.AdServicesState.isAdServicesStateEnabled();
    }
}
