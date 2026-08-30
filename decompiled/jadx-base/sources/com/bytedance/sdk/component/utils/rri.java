package com.bytedance.sdk.component.utils;

/* JADX INFO: loaded from: classes3.dex */
public class rri {
    private static final java.lang.Object bg = new java.lang.Object();
    private static final java.util.Map<com.bytedance.sdk.component.utils.rri.bg, java.lang.Object> IL = new java.util.concurrent.ConcurrentHashMap();
    private static java.util.concurrent.atomic.AtomicBoolean bX = new java.util.concurrent.atomic.AtomicBoolean(false);
    private static volatile int eqN = -1;
    private static volatile long zx = 0;
    private static volatile int ldr = 60000;
    private static com.bytedance.sdk.component.utils.xxp iR = null;
    private static final java.util.concurrent.atomic.AtomicBoolean Kg = new java.util.concurrent.atomic.AtomicBoolean(false);

    public interface bg {
        void bg(android.content.Context context, android.content.Intent intent, boolean z, int i);
    }

    public static int bg(android.content.Context context, long j) {
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        if (zx + j <= jElapsedRealtime) {
            return IL(context);
        }
        if (eqN == -1) {
            return IL(context);
        }
        if (jElapsedRealtime - zx >= ldr) {
            IL(context, (android.content.Intent) null, false, false);
        }
        return eqN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void IL(final android.content.Context context, final android.content.Intent intent, final boolean z, final boolean z2) {
        if (!z && z2) {
            eqN = 0;
        } else if (Kg.compareAndSet(false, true)) {
            com.bytedance.sdk.component.Kg.ldr.IL(new com.bytedance.sdk.component.Kg.Kg("getNetworkType") { // from class: com.bytedance.sdk.component.utils.rri.1
                @Override // java.lang.Runnable
                public void run() {
                    int unused = com.bytedance.sdk.component.utils.rri.eqN = z2 ? 0 : com.bytedance.sdk.component.utils.rri.IL(context);
                    com.bytedance.sdk.component.utils.rri.Kg.set(false);
                    if (z) {
                        com.bytedance.sdk.component.utils.rri.IL(context, intent, com.bytedance.sdk.component.utils.rri.eqN, z2);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void IL(android.content.Context context, android.content.Intent intent, int i, boolean z) {
        java.util.Map<com.bytedance.sdk.component.utils.rri.bg, java.lang.Object> map = IL;
        if (map == null || map.size() <= 0) {
            return;
        }
        for (com.bytedance.sdk.component.utils.rri.bg bgVar : map.keySet()) {
            if (bgVar != null) {
                bgVar.bg(context, intent, !z, i);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int IL(android.content.Context context) {
        eqN = bX(context);
        zx = android.os.SystemClock.elapsedRealtime();
        return eqN;
    }

    private static int bX(android.content.Context context) {
        try {
            android.net.NetworkInfo activeNetworkInfo = ((android.net.ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isAvailable()) {
                int type = activeNetworkInfo.getType();
                if (type != 0) {
                    return type != 1 ? 1 : 4;
                }
                android.telephony.TelephonyManager telephonyManager = (android.telephony.TelephonyManager) context.getSystemService("phone");
                switch (activeNetworkInfo.getSubtype()) {
                    case 1:
                    case 2:
                    case 4:
                    case 7:
                    case 11:
                    case 16:
                        return 2;
                    case 3:
                    case 5:
                    case 6:
                    case 8:
                    case 9:
                    case 10:
                    case 12:
                    case 14:
                    case 15:
                    case 17:
                        return 3;
                    case 13:
                    case 18:
                    case 19:
                        com.bytedance.sdk.component.utils.xxp xxpVar = iR;
                        return (xxpVar == null || !xxpVar.bg(context, telephonyManager)) ? 5 : 6;
                    case 20:
                        return 6;
                    default:
                        java.lang.String subtypeName = activeNetworkInfo.getSubtypeName();
                        return (android.text.TextUtils.isEmpty(subtypeName) || !(subtypeName.equalsIgnoreCase("TD-SCDMA") || subtypeName.equalsIgnoreCase("WCDMA") || subtypeName.equalsIgnoreCase("CDMA2000"))) ? 1 : 3;
                }
            }
            return 0;
        } catch (java.lang.Throwable unused) {
            return 1;
        }
    }

    public static void bg(com.bytedance.sdk.component.utils.rri.bg bgVar, android.content.Context context) {
        if (bgVar == null) {
            return;
        }
        if (!bX.get()) {
            try {
                context.registerReceiver(new com.bytedance.sdk.component.utils.rri.IL(), new android.content.IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                bX.set(true);
            } catch (java.lang.Throwable unused) {
            }
        }
        IL.put(bgVar, bg);
    }

    public static void bg(com.bytedance.sdk.component.utils.rri.bg bgVar) {
        if (bgVar == null) {
            return;
        }
        IL.remove(bgVar);
    }

    private static class IL extends android.content.BroadcastReceiver {
        private IL() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context context, android.content.Intent intent) {
            boolean z = false;
            boolean booleanExtra = intent.getBooleanExtra("noConnectivity", false);
            if (com.bytedance.sdk.component.utils.rri.IL != null && com.bytedance.sdk.component.utils.rri.IL.size() > 0) {
                z = true;
            }
            com.bytedance.sdk.component.utils.rri.IL(context, intent, z, booleanExtra);
        }
    }
}
