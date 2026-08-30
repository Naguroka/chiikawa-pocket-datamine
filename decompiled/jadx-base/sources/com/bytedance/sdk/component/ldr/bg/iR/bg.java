package com.bytedance.sdk.component.ldr.bg.iR;

/* JADX INFO: loaded from: classes3.dex */
public class bg {
    private static volatile android.os.Handler IL = null;
    private static int bX = 3000;
    private static volatile android.os.HandlerThread bg;

    static {
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("csj_ad_log", 10);
        bg = handlerThread;
        handlerThread.start();
    }

    public static android.os.Handler bg() {
        if (bg == null || !bg.isAlive()) {
            synchronized (com.bytedance.sdk.component.ldr.bg.iR.bg.class) {
                if (bg == null || !bg.isAlive()) {
                    android.os.HandlerThread handlerThread = new android.os.HandlerThread("csj_init_handle", -1);
                    bg = handlerThread;
                    handlerThread.start();
                    IL = new android.os.Handler(bg.getLooper());
                }
            }
        } else if (IL == null) {
            synchronized (com.bytedance.sdk.component.ldr.bg.iR.bg.class) {
                if (IL == null) {
                    IL = new android.os.Handler(bg.getLooper());
                }
            }
        }
        return IL;
    }

    public static int IL() {
        if (bX <= 0) {
            bX = 3000;
        }
        return bX;
    }
}
