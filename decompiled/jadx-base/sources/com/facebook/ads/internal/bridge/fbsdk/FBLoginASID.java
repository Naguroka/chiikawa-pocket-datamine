package com.facebook.ads.internal.bridge.fbsdk;

/* JADX INFO: loaded from: classes4.dex */
public class FBLoginASID {
    public static java.lang.String getFBLoginASID() {
        try {
            java.lang.Object objInvoke = java.lang.Class.forName("com.facebook.AccessToken").getDeclaredMethod("getCurrentAccessToken", new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
            if (objInvoke != null) {
                return (java.lang.String) java.lang.Class.forName("com.facebook.AccessToken").getDeclaredMethod("getUserId", new java.lang.Class[0]).invoke(objInvoke, new java.lang.Object[0]);
            }
        } catch (java.lang.Throwable unused) {
        }
        return null;
    }
}
