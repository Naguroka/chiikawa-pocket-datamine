package com.apm.insight.l;

/* JADX INFO: compiled from: Net.java */
/* JADX INFO: loaded from: classes3.dex */
public final class k {
    public static java.lang.String a(android.content.Context context) {
        return a(c(context));
    }

    /* JADX INFO: renamed from: com.apm.insight.l.k$1, reason: invalid class name */
    /* JADX INFO: compiled from: Net.java */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f450a;

        static {
            int[] iArr = new int[com.apm.insight.k.e.b.values().length];
            f450a = iArr;
            try {
                iArr[com.apm.insight.k.e.b.WIFI.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f450a[com.apm.insight.k.e.b.MOBILE_2G.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f450a[com.apm.insight.k.e.b.MOBILE_3G.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                f450a[com.apm.insight.k.e.b.MOBILE_4G.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                f450a[com.apm.insight.k.e.b.MOBILE.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                f450a[com.apm.insight.k.e.b.MOBILE_5G.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
        }
    }

    private static java.lang.String a(com.apm.insight.k.e.b bVar) {
        try {
            switch (com.apm.insight.l.k.AnonymousClass1.f450a[bVar.ordinal()]) {
                case 1:
                    return com.json.u8.b;
                case 2:
                    return "2g";
                case 3:
                    return com.json.u8.f3464a;
                case 4:
                    return "4g";
                case 5:
                    return "mobile";
                case 6:
                    return "5g";
                default:
                    return "";
            }
        } catch (java.lang.Exception unused) {
            return "";
        }
    }

    private static com.apm.insight.k.e.b c(android.content.Context context) {
        try {
            android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                return com.apm.insight.k.e.b.NONE;
            }
            android.net.NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isAvailable()) {
                int type = activeNetworkInfo.getType();
                if (1 == type) {
                    return com.apm.insight.k.e.b.WIFI;
                }
                if (type == 0) {
                    int networkType = ((android.telephony.TelephonyManager) context.getSystemService("phone")).getNetworkType();
                    if (networkType != 3) {
                        if (networkType == 20) {
                            return com.apm.insight.k.e.b.MOBILE_5G;
                        }
                        if (networkType != 5 && networkType != 6) {
                            switch (networkType) {
                                case 8:
                                case 9:
                                case 10:
                                    break;
                                default:
                                    switch (networkType) {
                                        case 12:
                                        case 14:
                                        case 15:
                                            break;
                                        case 13:
                                            return com.apm.insight.k.e.b.MOBILE_4G;
                                        default:
                                            return com.apm.insight.k.e.b.MOBILE;
                                    }
                                    break;
                            }
                        }
                    }
                    return com.apm.insight.k.e.b.MOBILE_3G;
                }
                return com.apm.insight.k.e.b.MOBILE;
            }
            return com.apm.insight.k.e.b.NONE;
        } catch (java.lang.Throwable unused) {
            return com.apm.insight.k.e.b.MOBILE;
        }
    }

    public static boolean b(android.content.Context context) {
        android.net.NetworkInfo activeNetworkInfo;
        try {
            android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) context.getSystemService("connectivity");
            return (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isAvailable()) ? false : true;
        } catch (java.lang.Exception unused) {
        }
    }
}
