package com.bytedance.sdk.openadsdk.rri.bg;

/* JADX INFO: loaded from: classes4.dex */
public class iR {
    private static android.os.HandlerThread IL;
    private static com.bytedance.sdk.openadsdk.rri.bg.iR.bg bg;

    public static void bg() {
    }

    public static void bg(com.bytedance.sdk.openadsdk.rri.bg.IL il) {
        if (il == null) {
            return;
        }
        IL();
        com.bytedance.sdk.openadsdk.rri.bg.iR.bg bgVar = bg;
        if (bgVar != null) {
            bgVar.bg(il);
        }
    }

    public static void IL(com.bytedance.sdk.openadsdk.rri.bg.IL il) {
        if (il == null || bg == null) {
            return;
        }
        try {
            int iIntValue = il.VB().intValue();
            if (bg.hasMessages(iIntValue)) {
                bg.removeMessages(iIntValue);
            }
        } catch (java.lang.Exception unused) {
        }
    }

    public static void IL() {
        if (bg != null) {
            return;
        }
        try {
            android.os.HandlerThread handlerThread = IL;
            if (handlerThread != null && handlerThread.isAlive()) {
                return;
            }
            synchronized (com.bytedance.sdk.openadsdk.rri.bg.iR.class) {
                android.os.HandlerThread handlerThread2 = IL;
                if (handlerThread2 == null || !handlerThread2.isAlive()) {
                    android.os.HandlerThread handlerThread3 = new android.os.HandlerThread("csj_MRC");
                    IL = handlerThread3;
                    handlerThread3.start();
                    bg = new com.bytedance.sdk.openadsdk.rri.bg.iR.bg(IL.getLooper());
                }
            }
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.component.utils.PX.bg("MRC", th.getMessage());
        }
    }

    private static class bg extends android.os.Handler {
        public bg(android.os.Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message message) {
            com.bytedance.sdk.openadsdk.rri.bg.IL il = (com.bytedance.sdk.openadsdk.rri.bg.IL) message.obj;
            if (il == null) {
                return;
            }
            int iIL = il.IL();
            if (iIL == 1) {
                il.iR();
            } else if (iIL == 2) {
                il.Kg();
            } else {
                com.bytedance.sdk.openadsdk.rri.bg.zx.IL(il.VB());
                return;
            }
            if (il.WR()) {
                com.bytedance.sdk.openadsdk.rri.bg.zx.IL(il.VB());
            } else if (il.PX()) {
                bg(il);
            }
        }

        public void bg(com.bytedance.sdk.openadsdk.rri.bg.IL il) {
            if (il == null) {
                return;
            }
            int iIntValue = il.VB().intValue();
            if (hasMessages(iIntValue)) {
                return;
            }
            android.os.Message messageObtain = android.os.Message.obtain();
            messageObtain.what = iIntValue;
            messageObtain.obj = il;
            sendMessageDelayed(messageObtain, il.ldr());
        }
    }
}
