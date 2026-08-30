package com.bytedance.sdk.openadsdk.core.settings;

/* JADX INFO: loaded from: classes4.dex */
public class PX {
    private static final java.util.concurrent.atomic.AtomicInteger bg = new java.util.concurrent.atomic.AtomicInteger(1);

    public static boolean bg() {
        return bg.get() == 1;
    }

    protected static void bg(int i) {
        boolean z = true;
        if (i == 1 || i == 2) {
            try {
                java.util.concurrent.atomic.AtomicInteger atomicInteger = bg;
                if (atomicInteger.get() != i) {
                    try {
                        atomicInteger.set(i);
                    } catch (java.lang.Throwable th) {
                        th = th;
                        com.bytedance.sdk.component.utils.PX.bg("SdkSwitch", th.getMessage());
                    }
                } else {
                    z = false;
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
                z = false;
            }
            if (z) {
                android.util.Log.e("SdkSwitch", "switch status changed: " + bg());
                if (bg()) {
                    com.bytedance.sdk.openadsdk.eqN.bg.eqN.IL();
                } else {
                    com.bytedance.sdk.openadsdk.eqN.bg.eqN.bX();
                }
            }
        }
    }
}
