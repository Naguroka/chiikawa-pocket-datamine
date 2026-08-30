package com.bytedance.sdk.openadsdk.eqN;

/* JADX INFO: loaded from: classes4.dex */
public class PX {
    private static volatile com.bytedance.sdk.openadsdk.eqN.PX bg;
    private android.os.HandlerThread IL;
    private final android.os.Handler bX;
    private java.util.Map<java.lang.String, java.lang.Object> ldr;
    private final java.util.concurrent.Executor eqN = java.util.concurrent.Executors.newCachedThreadPool();
    private com.bytedance.sdk.openadsdk.eqN.PX.IL zx = com.bytedance.sdk.openadsdk.eqN.PX.IL.bg();

    public static com.bytedance.sdk.openadsdk.eqN.PX bg() {
        if (bg == null) {
            synchronized (com.bytedance.sdk.openadsdk.eqN.PX.class) {
                if (bg == null) {
                    bg = new com.bytedance.sdk.openadsdk.eqN.PX();
                }
            }
        }
        return bg;
    }

    public com.bytedance.sdk.openadsdk.eqN.PX bg(java.util.Map<java.lang.String, java.lang.Object> map) {
        this.ldr = map;
        return bg();
    }

    private PX() {
        if (this.IL == null) {
            android.os.HandlerThread handlerThread = new android.os.HandlerThread("OpenAppSuccEvent_HandlerThread", 10);
            this.IL = handlerThread;
            handlerThread.start();
        }
        this.bX = new android.os.Handler(this.IL.getLooper(), new android.os.Handler.Callback() { // from class: com.bytedance.sdk.openadsdk.eqN.PX.1
            @Override // android.os.Handler.Callback
            public boolean handleMessage(android.os.Message message) {
                if (message.what != 100) {
                    return true;
                }
                com.bytedance.sdk.openadsdk.eqN.PX.bg bgVar = (message.obj == null || !(message.obj instanceof com.bytedance.sdk.openadsdk.eqN.PX.bg)) ? null : (com.bytedance.sdk.openadsdk.eqN.PX.bg) message.obj;
                if (bgVar == null) {
                    return true;
                }
                com.bytedance.sdk.openadsdk.eqN.PX.this.IL(bgVar);
                return true;
            }
        });
    }

    public void bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv, java.lang.String str) {
        android.os.Message messageObtainMessage = this.bX.obtainMessage();
        messageObtainMessage.what = 100;
        messageObtainMessage.obj = com.bytedance.sdk.openadsdk.eqN.PX.bg.bg(tuv, str, this.ldr);
        messageObtainMessage.sendToTarget();
    }

    private void bg(com.bytedance.sdk.openadsdk.eqN.PX.bg bgVar) {
        if (bgVar == null) {
            return;
        }
        bgVar.IL();
        if (bgVar.bg() * this.zx.bg > this.zx.IL) {
            bX(bgVar.bg(false));
            return;
        }
        android.os.Message messageObtainMessage = this.bX.obtainMessage();
        messageObtainMessage.what = 100;
        messageObtainMessage.obj = bgVar;
        this.bX.sendMessageDelayed(messageObtainMessage, this.zx.bg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void IL(com.bytedance.sdk.openadsdk.eqN.PX.bg bgVar) {
        if (bgVar == null) {
            return;
        }
        boolean zEqN = com.bytedance.sdk.openadsdk.core.Lq.bg().eqN();
        boolean zBg = com.bytedance.sdk.openadsdk.core.Lq.bg().bg(true);
        if (zEqN || !zBg) {
            if (bgVar.zx == null) {
                bgVar.zx = new java.util.HashMap();
            }
            bgVar.zx.put("is_background", java.lang.Boolean.valueOf(zEqN));
            bgVar.zx.put("has_focus", java.lang.Boolean.valueOf(zBg));
            bX(bgVar.bg(true));
            return;
        }
        bg(bgVar);
    }

    private void bX(com.bytedance.sdk.openadsdk.eqN.PX.bg bgVar) {
        if (bgVar == null) {
            return;
        }
        this.eqN.execute(bgVar);
    }

    private static class bg implements java.io.Serializable, java.lang.Runnable {
        public com.bytedance.sdk.openadsdk.core.model.tuV bX;
        public java.lang.String eqN;
        public java.util.Map<java.lang.String, java.lang.Object> zx;
        public final java.util.concurrent.atomic.AtomicInteger bg = new java.util.concurrent.atomic.AtomicInteger(0);
        public final java.util.concurrent.atomic.AtomicBoolean IL = new java.util.concurrent.atomic.AtomicBoolean(false);

        public static com.bytedance.sdk.openadsdk.eqN.PX.bg bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv, java.lang.String str, java.util.Map<java.lang.String, java.lang.Object> map) {
            return new com.bytedance.sdk.openadsdk.eqN.PX.bg(tuv, str, map);
        }

        public bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv, java.lang.String str, java.util.Map<java.lang.String, java.lang.Object> map) {
            this.bX = tuv;
            this.eqN = str;
            this.zx = map;
        }

        public com.bytedance.sdk.openadsdk.eqN.PX.bg bg(boolean z) {
            this.IL.set(z);
            return this;
        }

        public int bg() {
            return this.bg.get();
        }

        public void IL() {
            this.bg.incrementAndGet();
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.bX == null || android.text.TextUtils.isEmpty(this.eqN)) {
                return;
            }
            java.lang.String str = this.IL.get() ? "dpl_success" : "dpl_failed";
            if (this.zx == null) {
                this.zx = new java.util.HashMap();
            }
            com.bytedance.sdk.openadsdk.core.model.tuV tuv = this.bX;
            if (tuv != null && tuv.OLh() == 0) {
                java.util.Map<java.lang.String, java.lang.Object> map = this.zx;
                com.bytedance.sdk.openadsdk.core.model.tuV tuv2 = this.bX;
                map.put("auto_click", java.lang.Boolean.valueOf((tuv2 == null || tuv2.eqN()) ? false : true));
            }
            this.zx.put("lifeCycleInit", java.lang.Boolean.valueOf(com.bytedance.sdk.openadsdk.core.Lq.bg().bX()));
            com.bytedance.sdk.openadsdk.eqN.bX.bg(this.bX, this.eqN, str, this.zx);
        }
    }

    private static class IL {
        public int bg = com.google.android.gms.nearby.messages.Strategy.TTL_SECONDS_DEFAULT;
        public int IL = androidx.media3.common.PlaybackException.ERROR_CODE_DRM_UNSPECIFIED;

        private IL() {
        }

        public static com.bytedance.sdk.openadsdk.eqN.PX.IL bg() {
            return new com.bytedance.sdk.openadsdk.eqN.PX.IL();
        }
    }
}
