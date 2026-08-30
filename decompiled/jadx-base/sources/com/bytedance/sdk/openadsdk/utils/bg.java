package com.bytedance.sdk.openadsdk.utils;

/* JADX INFO: loaded from: classes4.dex */
public class bg implements android.app.Application.ActivityLifecycleCallbacks {
    public static long IL = 0;
    public static long bX = 0;
    public static boolean bg = false;
    private volatile java.lang.ref.WeakReference<android.app.Activity> Ta;
    private final java.util.concurrent.atomic.AtomicBoolean eqN = new java.util.concurrent.atomic.AtomicBoolean(false);
    private final com.bytedance.sdk.openadsdk.utils.bg.RunnableC0167bg zx = new com.bytedance.sdk.openadsdk.utils.bg.RunnableC0167bg();
    private final com.bytedance.sdk.openadsdk.utils.bg.eqN ldr = new com.bytedance.sdk.openadsdk.utils.bg.eqN();
    private final com.bytedance.sdk.openadsdk.utils.bg.bX iR = new com.bytedance.sdk.openadsdk.utils.bg.bX();
    private final com.bytedance.sdk.openadsdk.utils.bg.IL Kg = new com.bytedance.sdk.openadsdk.utils.bg.IL();
    private int WR = 0;
    private volatile java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<com.bytedance.sdk.component.adexpress.bg>> eo = new java.util.concurrent.CopyOnWriteArrayList<>();
    private android.os.HandlerThread VB = null;
    private android.os.Handler PX = null;
    private final java.util.LinkedList<android.app.Activity> yDt = new java.util.LinkedList<>();

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
    }

    public bg() {
        bX();
    }

    private void bX() {
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("lifecycle", 10);
        this.VB = handlerThread;
        handlerThread.start();
        this.PX = new android.os.Handler(this.VB.getLooper());
    }

    private void bg(java.lang.Runnable runnable) {
        if (!this.VB.isAlive()) {
            bX();
        }
        this.PX.postDelayed(runnable, 1000L);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        this.yDt.addFirst(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(android.app.Activity activity) {
        this.WR++;
        this.PX.removeCallbacks(this.Kg);
        if (this.eqN.get()) {
            bg(this.Kg);
        }
        this.eqN.set(false);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity activity) {
        bg(this.ldr);
        if (!bg) {
            IL = java.lang.System.currentTimeMillis();
            bg = true;
        }
        this.Ta = new java.lang.ref.WeakReference<>(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity activity) {
        int i = this.WR - 1;
        this.WR = i;
        if (i < 0) {
            this.WR = 0;
        }
        if (com.bytedance.sdk.openadsdk.ApmHelper.isIsInit()) {
            bg(this.iR);
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.utils.bg$bg, reason: collision with other inner class name */
    static class RunnableC0167bg implements java.lang.Runnable {
        RunnableC0167bg() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.bytedance.sdk.openadsdk.utils.VJ.bX(new com.bytedance.sdk.component.Kg.Kg("reportPvFromBackGround") { // from class: com.bytedance.sdk.openadsdk.utils.bg.bg.1
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.openadsdk.ApmHelper.reportPvFromBackGround();
                }
            });
        }
    }

    class eqN implements java.lang.Runnable {
        eqN() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.bytedance.sdk.openadsdk.core.yDt.IL().removeMessages(1001);
            if (com.bytedance.sdk.openadsdk.core.VzQ.bg() == null) {
                return;
            }
            com.bytedance.sdk.openadsdk.core.eo.bg.IL();
        }
    }

    class bX implements java.lang.Runnable {
        bX() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.bytedance.sdk.openadsdk.ApmHelper.isIsInit()) {
                android.os.Handler handlerIL = com.bytedance.sdk.openadsdk.core.yDt.IL();
                android.os.Message messageObtain = android.os.Message.obtain(handlerIL, com.bytedance.sdk.openadsdk.utils.bg.this.zx);
                messageObtain.what = 1001;
                handlerIL.sendMessageDelayed(messageObtain, 30000L);
            }
        }
    }

    private static class IL implements java.lang.Runnable {
        private IL() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.bytedance.sdk.openadsdk.ldr.IL.bg().IL();
            com.bytedance.sdk.openadsdk.eqN.bg.yDt ydtZyO = com.bytedance.sdk.openadsdk.core.settings.xxp.zU().ZyO();
            if (ydtZyO == null || ydtZyO.bg() || !com.bytedance.sdk.component.utils.Lq.Kg(com.bytedance.sdk.openadsdk.core.VzQ.bg())) {
                return;
            }
            com.bytedance.sdk.openadsdk.eqN.bg.eqN.bg(com.bytedance.sdk.openadsdk.core.PX.bg(com.bytedance.sdk.openadsdk.core.VzQ.bg()));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity activity) {
        if (this.WR <= 0) {
            this.eqN.set(true);
        }
        if (bg()) {
            bg = false;
            com.bytedance.sdk.openadsdk.core.yDt.IL.set(false);
            bX = java.lang.System.currentTimeMillis();
            bg(this.Kg);
        }
        bg(new com.bytedance.sdk.openadsdk.utils.bg.zx(IL, bX, bg()));
    }

    public class zx implements java.lang.Runnable {
        private long IL;
        private long bX;
        private boolean eqN;

        public zx(long j, long j2, boolean z) {
            this.IL = j;
            this.bX = j2;
            this.eqN = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.eqN) {
                com.bytedance.sdk.openadsdk.yDt.bX.bg().bg(this.IL / 1000, this.bX / 1000);
            }
            com.bytedance.sdk.openadsdk.utils.bg.this.eqN();
        }
    }

    public void bg(com.bytedance.sdk.component.adexpress.bg bgVar) {
        this.eo.add(new java.lang.ref.WeakReference<>(bgVar));
    }

    public boolean IL(com.bytedance.sdk.component.adexpress.bg bgVar) {
        return this.eo.remove(new java.lang.ref.WeakReference(bgVar));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
        if (this.eo != null && this.eo.size() > 0) {
            for (java.lang.ref.WeakReference<com.bytedance.sdk.component.adexpress.bg> weakReference : this.eo) {
                if (weakReference != null && weakReference.get() != null) {
                    try {
                        weakReference.get().bg(activity);
                    } catch (java.lang.Throwable unused) {
                    }
                }
            }
        }
        if (this.Ta != null && this.Ta.get() == activity) {
            this.Ta = null;
        }
        this.yDt.remove(activity);
    }

    public boolean bg() {
        return this.eqN.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void eqN() {
        com.bytedance.sdk.openadsdk.eqN.bg.bg.bg();
    }

    public boolean bg(boolean z) {
        android.app.Activity activity;
        android.view.Window window;
        return (this.Ta == null || (activity = this.Ta.get()) == null || (window = activity.getWindow()) == null) ? z : window.getDecorView().hasWindowFocus();
    }

    public android.app.Activity IL() {
        if (this.yDt.isEmpty()) {
            return null;
        }
        return this.yDt.getFirst();
    }
}
