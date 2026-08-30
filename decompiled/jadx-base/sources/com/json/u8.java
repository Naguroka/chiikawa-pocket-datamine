package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class u8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.lang.String f3464a = "3g";
    public static final java.lang.String b = "wifi";
    public static final java.lang.String c = "none";
    public static final java.lang.String d = "bluetooth";
    public static final java.lang.String e = "ethernet";
    public static final java.lang.String f = "vpn";
    public static final java.lang.String g = "cellular";
    public static final java.lang.String h = "wifiAware";
    public static final java.lang.String i = "lowpan";

    public static java.lang.String a(android.content.Context context) {
        android.net.ConnectivityManager connectivityManager;
        java.lang.String str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (context != null && (connectivityManager = (android.net.ConnectivityManager) context.getSystemService("connectivity")) != null) {
            try {
                android.net.NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                    java.lang.String typeName = activeNetworkInfo.getTypeName();
                    int type = activeNetworkInfo.getType();
                    if (type == 0) {
                        str = f3464a;
                    } else if (type == 1) {
                        str = b;
                    } else {
                        sb.append(typeName);
                    }
                    sb.append(str);
                }
            } catch (java.lang.Exception e2) {
                com.json.l9.d().a(e2);
                com.json.mediationsdk.logger.IronLog.INTERNAL.error(e2.toString());
            }
        }
        return sb.toString();
    }

    public static int b(android.content.Context context) {
        if (context == null) {
            return -1;
        }
        try {
            return context.getResources().getConfiguration().mcc;
        } catch (java.lang.Exception e2) {
            com.json.l9.d().a(e2);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(e2.toString());
            return -1;
        }
    }

    public static int c(android.content.Context context) {
        if (context == null) {
            return -1;
        }
        try {
            return context.getResources().getConfiguration().mnc;
        } catch (java.lang.Exception e2) {
            com.json.l9.d().a(e2);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(e2.toString());
            return -1;
        }
    }

    public static java.lang.String d(android.content.Context context) {
        if (context == null) {
            return "";
        }
        try {
            return ((android.telephony.TelephonyManager) context.getSystemService("phone")).getNetworkOperator();
        } catch (java.lang.Exception e2) {
            com.json.l9.d().a(e2);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(e2.toString());
            return "";
        }
    }

    public static int e(android.content.Context context) {
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        try {
            android.telephony.TelephonyManager telephonyManager = (android.telephony.TelephonyManager) context.getSystemService("phone");
            if (packageManager.checkPermission("android.permission.READ_PHONE_STATE", context.getPackageName()) == 0 || packageManager.checkPermission("android.permission.READ_BASIC_PHONE_STATE", context.getPackageName()) == 0) {
                return telephonyManager.getDataNetworkType();
            }
        } catch (java.lang.Exception e2) {
            com.json.l9.d().a(e2);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(e2.toString());
        }
        return -1;
    }

    public static int f(android.content.Context context) {
        if (context != null) {
            try {
                return ((android.telephony.TelephonyManager) context.getSystemService("phone")).getPhoneType();
            } catch (java.lang.Exception e2) {
                com.json.l9.d().a(e2);
                com.json.mediationsdk.logger.IronLog.INTERNAL.error(e2.toString());
            }
        }
        return -1;
    }

    public static java.lang.String g(android.content.Context context) {
        if (context == null) {
            return "";
        }
        try {
            android.telephony.TelephonyManager telephonyManager = (android.telephony.TelephonyManager) context.getSystemService("phone");
            return telephonyManager != null ? telephonyManager.getSimOperator() : "";
        } catch (java.lang.Exception e2) {
            com.json.l9.d().a(e2);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(e2.toString());
            return "";
        }
    }

    public static boolean h(android.content.Context context) {
        android.net.ConnectivityManager connectivityManager;
        if (context == null || (connectivityManager = (android.net.ConnectivityManager) context.getSystemService("connectivity")) == null) {
            return false;
        }
        try {
            android.net.NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isConnected();
        } catch (java.lang.Exception e2) {
            com.json.l9.d().a(e2);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(e2.toString());
            return false;
        }
    }

    public static boolean i(android.content.Context context) {
        android.net.ConnectivityManager connectivityManager;
        android.net.NetworkInfo networkInfo;
        return (context == null || (connectivityManager = (android.net.ConnectivityManager) context.getSystemService("connectivity")) == null || (networkInfo = connectivityManager.getNetworkInfo(0)) == null || !networkInfo.isConnected()) ? false : true;
    }

    public static boolean j(android.content.Context context) {
        android.net.ConnectivityManager connectivityManager;
        android.net.NetworkInfo networkInfo;
        return (context == null || (connectivityManager = (android.net.ConnectivityManager) context.getSystemService("connectivity")) == null || (networkInfo = connectivityManager.getNetworkInfo(1)) == null || !networkInfo.isConnected()) ? false : true;
    }
}
