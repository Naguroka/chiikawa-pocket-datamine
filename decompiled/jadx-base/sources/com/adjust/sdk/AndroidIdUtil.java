package com.adjust.sdk;

/* JADX INFO: loaded from: classes3.dex */
public class AndroidIdUtil {
    public static java.lang.String getAndroidId(android.content.Context context) {
        return android.provider.Settings.Secure.getString(context.getContentResolver(), "android_id");
    }
}
