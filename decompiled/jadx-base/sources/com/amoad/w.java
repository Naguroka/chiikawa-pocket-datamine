package com.amoad;

/* JADX INFO: loaded from: classes3.dex */
class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.lang.String f348a = "w";

    private w() {
    }

    static java.lang.String a(android.content.Context context) {
        try {
            android.net.NetworkInfo activeNetworkInfo = ((android.net.ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return "no_service";
            }
            int type = activeNetworkInfo.getType();
            if (type == 9) {
                return com.json.u8.e;
            }
            if (type == 17) {
                return "vpn";
            }
            switch (type) {
                case 0:
                case 2:
                case 3:
                case 4:
                case 5:
                    return "mobile";
                case 1:
                    return com.json.u8.b;
                case 6:
                    return "wimax";
                case 7:
                    return com.json.u8.d;
                default:
                    return null;
            }
        } catch (java.lang.SecurityException e) {
            com.amoad.Logger.w(f348a, e);
            return null;
        }
    }
}
