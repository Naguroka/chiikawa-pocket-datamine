package com.bytedance.sdk.component.Kg.bg;

/* JADX INFO: loaded from: classes3.dex */
public class bg {
    private android.os.Handler IL;
    private final com.bytedance.sdk.component.Kg.bg.eqN<com.bytedance.sdk.component.Kg.bg.IL> bg;

    private bg() {
        this.bg = com.bytedance.sdk.component.Kg.bg.eqN.bg(2);
    }

    public static com.bytedance.sdk.component.Kg.bg.bg bg() {
        return com.bytedance.sdk.component.Kg.bg.bg.C0100bg.bg;
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.component.Kg.bg.bg$bg, reason: collision with other inner class name */
    private static class C0100bg {
        private static final com.bytedance.sdk.component.Kg.bg.bg bg = new com.bytedance.sdk.component.Kg.bg.bg();
    }

    public android.os.Handler IL() {
        if (this.IL == null) {
            synchronized (com.bytedance.sdk.component.Kg.bg.bg.class) {
                if (this.IL == null) {
                    this.IL = bg("csj_io_handler");
                }
            }
        }
        return this.IL;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bg(final android.os.Handler handler, final android.os.Handler handler2) {
        if (handler.getLooper().getQueue().isIdle()) {
            handler.removeCallbacksAndMessages(null);
            handler.getLooper().quit();
        } else {
            handler2.postDelayed(new java.lang.Runnable() { // from class: com.bytedance.sdk.component.Kg.bg.bg.1
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.component.Kg.bg.bg.this.bg(handler, handler2);
                }
            }, 1000L);
        }
    }

    public com.bytedance.sdk.component.utils.JAA bg(com.bytedance.sdk.component.utils.JAA.bg bgVar, final java.lang.String str) {
        com.bytedance.sdk.component.Kg.bg.IL il = (com.bytedance.sdk.component.Kg.bg.IL) this.bg.bg();
        if (il != null) {
            il.bg(bgVar);
            il.post(new java.lang.Runnable() { // from class: com.bytedance.sdk.component.Kg.bg.bg.2
                @Override // java.lang.Runnable
                public void run() {
                    java.lang.Thread.currentThread().setName(str);
                }
            });
            return il;
        }
        return IL(bgVar, str);
    }

    public com.bytedance.sdk.component.utils.JAA bg(java.lang.String str) {
        return bg((com.bytedance.sdk.component.utils.JAA.bg) null, str);
    }

    private com.bytedance.sdk.component.Kg.bg.IL IL(com.bytedance.sdk.component.utils.JAA.bg bgVar, java.lang.String str) {
        android.os.HandlerThread handlerThread = new android.os.HandlerThread(str);
        handlerThread.start();
        return new com.bytedance.sdk.component.Kg.bg.IL(handlerThread, bgVar);
    }

    public boolean bg(com.bytedance.sdk.component.utils.JAA jaa) {
        if (!(jaa instanceof com.bytedance.sdk.component.Kg.bg.IL)) {
            return false;
        }
        com.bytedance.sdk.component.Kg.bg.IL il = (com.bytedance.sdk.component.Kg.bg.IL) jaa;
        if (this.bg.bg(il)) {
            return true;
        }
        il.IL();
        return true;
    }
}
