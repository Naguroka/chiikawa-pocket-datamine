package com.bytedance.sdk.openadsdk.utils;

/* JADX INFO: loaded from: classes4.dex */
public class Uw {
    private static java.lang.String IL = null;
    private static java.lang.String bX = null;
    private static java.lang.String bg = null;
    private static volatile boolean eqN = true;

    /* JADX INFO: Access modifiers changed from: private */
    public static void zx() {
        java.lang.String simOperatorName;
        java.lang.String simOperator;
        java.lang.String strSubstring;
        if (com.bytedance.sdk.openadsdk.core.VzQ.bg() == null) {
            return;
        }
        eqN = true;
        try {
            android.telephony.TelephonyManager telephonyManager = (android.telephony.TelephonyManager) com.bytedance.sdk.openadsdk.core.VzQ.bg().getSystemService("phone");
            try {
                int simState = telephonyManager.getSimState();
                if (simState == 0 || simState == 1) {
                    eqN = false;
                }
                com.bytedance.sdk.component.utils.PX.bg("MCC", eqN ? "Have SIM card" : "No SIM card");
            } catch (java.lang.Throwable th) {
                com.bytedance.sdk.component.utils.PX.bg("SimUtils", th.getMessage());
            }
            java.lang.String str = null;
            try {
                simOperatorName = telephonyManager.getSimOperatorName();
            } catch (java.lang.Throwable unused) {
                simOperatorName = null;
            }
            try {
                simOperator = telephonyManager.getNetworkOperator();
            } catch (java.lang.Throwable unused2) {
                simOperator = null;
            }
            if (simOperator == null || simOperator.length() < 5) {
                try {
                    simOperator = telephonyManager.getSimOperator();
                } catch (java.lang.Throwable unused3) {
                }
            }
            if (android.text.TextUtils.isEmpty(simOperator) || simOperator.length() <= 4) {
                strSubstring = null;
            } else {
                java.lang.String strSubstring2 = simOperator.substring(0, 3);
                strSubstring = simOperator.substring(3);
                str = strSubstring2;
            }
            if (!android.text.TextUtils.isEmpty(simOperatorName)) {
                bg = simOperatorName;
            }
            if (!android.text.TextUtils.isEmpty(str)) {
                IL = str;
            }
            if (android.text.TextUtils.isEmpty(strSubstring)) {
                return;
            }
            bX = strSubstring;
        } catch (java.lang.Throwable unused4) {
        }
    }

    public static java.lang.String bg() {
        com.bytedance.sdk.openadsdk.utils.Uw.bg.bg();
        return bg;
    }

    public static java.lang.String IL() {
        try {
            com.bytedance.sdk.openadsdk.utils.Uw.bg.bg();
            if (!eqN) {
                com.bytedance.sdk.component.utils.PX.bg("MCC", "getMCC" + (eqN ? "Have SIM card" : "No SIM card, MCC returns null"));
                return null;
            }
            android.content.res.Configuration configuration = com.bytedance.sdk.openadsdk.core.VzQ.bg().getResources().getConfiguration();
            java.lang.String strValueOf = configuration.mcc != 0 ? java.lang.String.valueOf(configuration.mcc) : IL;
            com.bytedance.sdk.component.utils.PX.bg("MCC", "config=" + configuration.mcc + ",sMCC=" + IL);
            return strValueOf;
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.component.utils.PX.bg("SimUtils", th.getMessage());
            return null;
        }
    }

    public static java.lang.String bX() {
        com.bytedance.sdk.openadsdk.utils.Uw.bg.bg();
        return bX;
    }

    public static class bg extends com.bytedance.sdk.component.Kg.Kg {
        public static java.util.concurrent.atomic.AtomicBoolean bg = new java.util.concurrent.atomic.AtomicBoolean(false);
        private static final java.util.concurrent.atomic.AtomicLong IL = new java.util.concurrent.atomic.AtomicLong(0);

        public bg(java.lang.String str, int i) {
            super(str, i);
        }

        public static void bg() {
            if (bg.get()) {
                return;
            }
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            java.util.concurrent.atomic.AtomicLong atomicLong = IL;
            if (jCurrentTimeMillis - atomicLong.get() < com.bytedance.sdk.openadsdk.TTAdConstant.AD_MAX_EVENT_TIME) {
                return;
            }
            atomicLong.set(jCurrentTimeMillis);
            com.bytedance.sdk.openadsdk.utils.VJ.IL((com.bytedance.sdk.component.Kg.Kg) new com.bytedance.sdk.openadsdk.utils.Uw.bg("UpdateSimStatusTask", 5));
        }

        @Override // java.lang.Runnable
        public void run() {
            bg.set(true);
            com.bytedance.sdk.openadsdk.utils.Uw.zx();
            bg.set(false);
        }
    }
}
