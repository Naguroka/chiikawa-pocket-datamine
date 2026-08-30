package com.bytedance.sdk.component.iR.eqN;

/* JADX INFO: loaded from: classes3.dex */
public class zx {
    public static boolean bg(android.content.Context context) {
        android.net.NetworkInfo[] allNetworkInfo;
        try {
            android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager != null && (allNetworkInfo = connectivityManager.getAllNetworkInfo()) != null) {
                for (android.net.NetworkInfo networkInfo : allNetworkInfo) {
                    if (networkInfo.getState() == android.net.NetworkInfo.State.CONNECTED || networkInfo.getState() == android.net.NetworkInfo.State.CONNECTING) {
                        return true;
                    }
                }
            }
        } catch (java.lang.Throwable th) {
            android.util.Log.e("ignored", th.toString());
        }
        return false;
    }
}
