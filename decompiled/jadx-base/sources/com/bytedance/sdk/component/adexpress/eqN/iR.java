package com.bytedance.sdk.component.adexpress.eqN;

/* JADX INFO: loaded from: classes3.dex */
public class iR {
    public static boolean bg(java.lang.String str) {
        return android.text.TextUtils.equals(str, "fullscreen_interstitial_ad") || android.text.TextUtils.equals(str, "rewarded_video");
    }

    public static boolean IL(java.lang.String str) {
        return com.bytedance.sdk.component.adexpress.eqN.IL() && bg(str);
    }
}
