package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class v8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.lang.String f3488a = "NETWORK_TYPE_WIFI";
    public static final java.lang.String b = "NETWORK_TYPE_UNKNOWN";
    public static final java.lang.String c = "NETWORK_TYPE_GPRS";
    public static final java.lang.String d = "NETWORK_TYPE_EDGE";
    public static final java.lang.String e = "NETWORK_TYPE_UMTS";
    public static final java.lang.String f = "NETWORK_TYPE_CDMA";
    public static final java.lang.String g = "NETWORK_TYPE_EVDO_0";
    public static final java.lang.String h = "NETWORK_TYPE_EVDO_A";
    public static final java.lang.String i = "NETWORK_TYPE_1xRTT";
    public static final java.lang.String j = "NETWORK_TYPE_HSDPA";
    public static final java.lang.String k = "NETWORK_TYPE_HSUPA";
    public static final java.lang.String l = "NETWORK_TYPE_HSPA";
    public static final java.lang.String m = "NETWORK_TYPE_IDEN";
    public static final java.lang.String n = "NETWORK_TYPE_EVDO_B";
    public static final java.lang.String o = "NETWORK_TYPE_LTE";
    public static final java.lang.String p = "NETWORK_TYPE_EHRPD";
    public static final java.lang.String q = "NETWORK_TYPE_HSPAP";
    public static final java.lang.String r = "NETWORK_TYPE_GSM";
    public static final java.lang.String s = "NETWORK_TYPE_TD_SCDMA";
    public static final java.lang.String t = "NETWORK_TYPE_IWLAN";
    public static final java.lang.String u = "NETWORK_TYPE_LTE_CA";
    public static final java.lang.String v = "NETWORK_TYPE_NR";

    public static android.net.Network a(android.content.Context context) {
        if (context == null) {
            return null;
        }
        return a((android.net.ConnectivityManager) context.getSystemService("connectivity"));
    }

    private static android.net.Network a(android.net.ConnectivityManager connectivityManager) {
        try {
            return connectivityManager.getActiveNetwork();
        } catch (java.lang.Throwable th) {
            com.json.l9.d().a(th);
            return null;
        }
    }

    private static java.lang.String a(int i2) {
        switch (i2) {
            case 1:
                return c;
            case 2:
                return d;
            case 3:
                return e;
            case 4:
                return f;
            case 5:
                return g;
            case 6:
                return h;
            case 7:
                return i;
            case 8:
                return j;
            case 9:
                return k;
            case 10:
                return l;
            case 11:
                return m;
            case 12:
                return n;
            case 13:
                return o;
            case 14:
                return p;
            case 15:
                return q;
            case 16:
                return r;
            case 17:
                return s;
            case 18:
                return t;
            case 19:
                return u;
            case 20:
                return v;
            default:
                return b;
        }
    }

    public static java.lang.String a(android.net.Network network, android.content.Context context) {
        java.lang.String strC;
        if (context == null) {
            return "none";
        }
        android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) context.getSystemService("connectivity");
        if (network == null || connectivityManager == null) {
            return "none";
        }
        try {
            android.net.NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
            if (networkCapabilities == null) {
                return c(context);
            }
            if (networkCapabilities.hasTransport(1)) {
                strC = com.json.u8.b;
            } else {
                strC = networkCapabilities.hasTransport(0) ? com.json.u8.f3464a : c(context);
            }
            return strC;
        } catch (java.lang.Exception e2) {
            com.json.l9.d().a(e2);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(e2.toString());
            return "none";
        }
    }

    public static org.json.JSONObject a(android.content.Context context, android.net.Network network) {
        android.net.NetworkCapabilities networkCapabilities;
        if (context == null) {
            return new org.json.JSONObject();
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (network != null) {
            try {
                android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(network)) != null) {
                    jSONObject.put("networkCapabilities", networkCapabilities.toString());
                    jSONObject.put("downloadSpeed", networkCapabilities.getLinkDownstreamBandwidthKbps());
                    jSONObject.put("uploadSpeed", networkCapabilities.getLinkUpstreamBandwidthKbps());
                    jSONObject.put(com.ironsource.y8.i.v, e(context));
                }
            } catch (java.lang.Exception e2) {
                com.json.l9.d().a(e2);
                com.json.mediationsdk.logger.IronLog.INTERNAL.error(e2.toString());
            }
        }
        return jSONObject;
    }

    public static java.lang.String b(android.content.Context context) {
        return a(a(context), context);
    }

    private static java.lang.String b(android.content.Context context, android.net.Network network) {
        android.net.NetworkCapabilities networkCapabilities;
        if (network != null && context != null) {
            try {
                android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(network)) == null) {
                    return "";
                }
                if (networkCapabilities.hasTransport(1)) {
                    return com.json.u8.b;
                }
                if (networkCapabilities.hasTransport(0)) {
                    return com.json.u8.g;
                }
                if (networkCapabilities.hasTransport(4)) {
                    return "vpn";
                }
                if (networkCapabilities.hasTransport(3)) {
                    return com.json.u8.e;
                }
                if (networkCapabilities.hasTransport(5)) {
                    return com.json.u8.h;
                }
                if (networkCapabilities.hasTransport(6)) {
                    return com.json.u8.i;
                }
                if (networkCapabilities.hasTransport(2)) {
                    return com.json.u8.d;
                }
            } catch (java.lang.Exception e2) {
                com.json.l9.d().a(e2);
                com.json.mediationsdk.logger.IronLog.INTERNAL.error(e2.toString());
            }
        }
        return "";
    }

    private static java.lang.String c(android.content.Context context) {
        java.lang.String strA = com.json.u8.a(context);
        return android.text.TextUtils.isEmpty(strA) ? "none" : strA;
    }

    public static java.lang.String d(android.content.Context context) {
        android.net.ConnectivityManager connectivityManager;
        android.net.Network networkA;
        android.net.NetworkInfo activeNetworkInfo;
        if (context == null || (connectivityManager = (android.net.ConnectivityManager) context.getSystemService("connectivity")) == null || (networkA = a(connectivityManager)) == null) {
            return b;
        }
        try {
            android.net.NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(networkA);
            if (networkCapabilities == null) {
                return b;
            }
            if (networkCapabilities.hasTransport(1)) {
                return f3488a;
            }
            if (networkCapabilities.hasTransport(0) && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null) {
                return a(activeNetworkInfo.getSubtype());
            }
        } catch (java.lang.Throwable th) {
            com.json.l9.d().a(th);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error("Error getting network capabilities: " + th);
        }
        return b;
    }

    public static boolean e(android.content.Context context) {
        return b(context, a(context)).equals("vpn");
    }
}
