package com.bykv.vk.openvk.preload.geckox.utils;

/* JADX INFO: compiled from: NetUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public final class e {
    public static java.lang.String a(android.content.Context context) {
        android.net.NetworkInfo activeNetworkInfo;
        android.net.NetworkInfo.State state;
        try {
            android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null && activeNetworkInfo.isAvailable()) {
                android.net.NetworkInfo networkInfo = connectivityManager.getNetworkInfo(1);
                if (networkInfo != null && (state = networkInfo.getState()) != null && (state == android.net.NetworkInfo.State.CONNECTED || state == android.net.NetworkInfo.State.CONNECTING)) {
                    return "WIFI";
                }
                switch (((android.telephony.TelephonyManager) context.getSystemService("phone")).getNetworkType()) {
                    case 1:
                    case 2:
                    case 4:
                    case 7:
                    case 11:
                        return "2G";
                    case 3:
                    case 5:
                    case 6:
                    case 8:
                    case 9:
                    case 10:
                    case 12:
                    case 14:
                    case 15:
                        return "3G";
                    case 13:
                        return "4G";
                    default:
                        return "unknow";
                }
            }
            return "unknow";
        } catch (java.lang.Throwable th) {
            com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger.w("gecko-debug-tag", "getNetworkState:", th);
            return "null";
        }
    }
}
