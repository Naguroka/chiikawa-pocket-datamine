package com.bytedance.sdk.component;

/* JADX INFO: loaded from: classes3.dex */
public class bX {
    private static volatile android.os.Handler IL;
    private static final java.lang.Object bg = new java.lang.Object();
    private static final java.util.LinkedList<java.lang.Runnable> bX = new java.util.LinkedList<>();
    private static java.lang.Object eqN = new java.lang.Object();

    public static void bg(java.lang.Runnable runnable, boolean z) {
        try {
            android.os.Handler handlerIL = IL();
            synchronized (bg) {
                bX.add(runnable);
                if (z) {
                    handlerIL.sendEmptyMessageDelayed(1, 100L);
                } else {
                    handlerIL.sendEmptyMessage(1);
                }
            }
        } catch (java.lang.OutOfMemoryError unused) {
        }
    }

    private static android.os.Handler IL() {
        android.os.Handler handler;
        if (IL == null) {
            synchronized (bg) {
                if (IL == null) {
                    android.os.HandlerThread handlerThread = new android.os.HandlerThread("queued-work-looper", -2);
                    handlerThread.start();
                    IL = new com.bytedance.sdk.component.bX.bg(handlerThread.getLooper());
                }
                handler = IL;
            }
            return handler;
        }
        return IL;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void bX() {
        java.util.LinkedList linkedList;
        synchronized (eqN) {
            synchronized (bg) {
                java.util.LinkedList<java.lang.Runnable> linkedList2 = bX;
                linkedList = (java.util.LinkedList) linkedList2.clone();
                linkedList2.clear();
                IL().removeMessages(1);
            }
            if (linkedList.size() > 0) {
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    ((java.lang.Runnable) it.next()).run();
                }
            }
        }
    }

    private static class bg extends android.os.Handler {
        bg(android.os.Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message message) {
            if (message.what == 1) {
                try {
                    com.bytedance.sdk.component.bX.bX();
                } catch (java.lang.OutOfMemoryError unused) {
                }
            }
        }
    }
}
