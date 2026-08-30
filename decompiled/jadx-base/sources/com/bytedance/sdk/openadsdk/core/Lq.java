package com.bytedance.sdk.openadsdk.core;

/* JADX INFO: loaded from: classes4.dex */
public class Lq {
    private boolean IL;
    private final com.bytedance.sdk.openadsdk.utils.bg bg = new com.bytedance.sdk.openadsdk.utils.bg();

    public static com.bytedance.sdk.openadsdk.core.Lq bg() {
        return com.bytedance.sdk.openadsdk.core.Lq.bg.bg;
    }

    private static class bg {
        private static final com.bytedance.sdk.openadsdk.core.Lq bg = new com.bytedance.sdk.openadsdk.core.Lq();
    }

    public void IL() {
        try {
            android.content.Context contextBg = com.bytedance.sdk.openadsdk.core.VzQ.bg();
            if (contextBg instanceof android.app.Application) {
                ((android.app.Application) contextBg).registerActivityLifecycleCallbacks(this.bg);
                this.IL = true;
            } else {
                if (contextBg == null || contextBg.getApplicationContext() == null) {
                    return;
                }
                ((android.app.Application) contextBg.getApplicationContext()).registerActivityLifecycleCallbacks(this.bg);
                this.IL = true;
            }
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.openadsdk.ApmHelper.reportCustomError("registerActivityLifecycleError", "registerActivityLifecycle", th);
        }
    }

    public boolean bX() {
        return this.IL;
    }

    public boolean eqN() {
        return this.bg.bg();
    }

    public boolean bg(boolean z) {
        return this.bg.bg(z);
    }

    public com.bytedance.sdk.openadsdk.utils.bg zx() {
        return this.bg;
    }
}
