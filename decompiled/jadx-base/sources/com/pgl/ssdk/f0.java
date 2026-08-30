package com.pgl.ssdk;

/* JADX INFO: loaded from: classes3.dex */
public class f0 {
    private static void a(android.net.LinkProperties linkProperties, org.json.JSONArray jSONArray) {
        for (java.net.InetAddress inetAddress : linkProperties.getDnsServers()) {
            if (inetAddress != null) {
                jSONArray.put(inetAddress.getHostAddress());
            }
        }
    }

    private static void b(android.net.LinkProperties linkProperties, org.json.JSONArray jSONArray) {
        java.net.InetAddress gateway;
        for (android.net.RouteInfo routeInfo : linkProperties.getRoutes()) {
            if (routeInfo != null && routeInfo.isDefaultRoute() && (gateway = routeInfo.getGateway()) != null && (!(gateway instanceof java.net.Inet6Address) || !"::".equals(gateway.getHostAddress()))) {
                jSONArray.put(gateway.getHostAddress());
            }
        }
    }

    private static void c(android.net.LinkProperties linkProperties, org.json.JSONArray jSONArray) {
        for (android.net.LinkAddress linkAddress : linkProperties.getLinkAddresses()) {
            if (linkAddress != null && linkAddress.getAddress() != null && !linkAddress.getAddress().isLoopbackAddress()) {
                jSONArray.put(linkAddress.getAddress().getHostAddress());
            }
        }
    }

    public static java.lang.String[] a(android.content.Context context) {
        android.net.Network[] allNetworks;
        android.net.NetworkInfo networkInfo;
        android.net.LinkProperties linkProperties;
        int type;
        java.lang.String[] strArr = new java.lang.String[5];
        android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager != null && (allNetworks = connectivityManager.getAllNetworks()) != null) {
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            org.json.JSONArray jSONArray2 = new org.json.JSONArray();
            org.json.JSONArray jSONArray3 = new org.json.JSONArray();
            org.json.JSONArray jSONArray4 = new org.json.JSONArray();
            org.json.JSONArray jSONArray5 = new org.json.JSONArray();
            for (android.net.Network network : allNetworks) {
                if (network != null && (networkInfo = connectivityManager.getNetworkInfo(network)) != null && networkInfo.getState() == android.net.NetworkInfo.State.CONNECTED && (linkProperties = connectivityManager.getLinkProperties(network)) != null && ((type = networkInfo.getType()) == 0 || type == 1)) {
                    a(linkProperties, jSONArray5);
                    if (type == 0) {
                        c(linkProperties, jSONArray);
                        b(linkProperties, jSONArray2);
                    } else {
                        c(linkProperties, jSONArray3);
                        b(linkProperties, jSONArray4);
                    }
                }
            }
            strArr[0] = jSONArray3.toString();
            strArr[1] = jSONArray4.toString();
            strArr[2] = jSONArray.toString();
            strArr[3] = jSONArray2.toString();
            strArr[4] = jSONArray5.toString();
        }
        return strArr;
    }

    public static java.lang.String b(android.content.Context context) {
        android.net.wifi.WifiManager wifiManager = (android.net.wifi.WifiManager) context.getApplicationContext().getSystemService(com.json.u8.b);
        java.lang.String str = (wifiManager == null || !wifiManager.isWifiEnabled()) ? "0" : "1";
        android.telephony.TelephonyManager telephonyManager = (android.telephony.TelephonyManager) context.getSystemService("phone");
        if (telephonyManager != null) {
            return str + (telephonyManager.getSimState() != 5 ? "0" : "1");
        }
        return str + "0";
    }
}
