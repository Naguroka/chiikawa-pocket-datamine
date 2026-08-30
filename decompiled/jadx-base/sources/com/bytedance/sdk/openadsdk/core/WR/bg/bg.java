package com.bytedance.sdk.openadsdk.core.WR.bg;

/* JADX INFO: loaded from: classes4.dex */
public class bg implements android.app.Application.ActivityLifecycleCallbacks {
    private static volatile com.bytedance.sdk.openadsdk.core.WR.bg.bg bg;
    private final com.bytedance.sdk.openadsdk.core.WR.bg.IL IL;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
    }

    private bg(android.app.Application application) {
        this.IL = com.bytedance.sdk.openadsdk.core.WR.bg.IL.bg(application);
    }

    public static com.bytedance.sdk.openadsdk.core.WR.bg.bg bg(android.app.Application application) {
        if (bg == null) {
            synchronized (com.bytedance.sdk.openadsdk.core.WR.bg.bg.class) {
                if (bg == null) {
                    bg = new com.bytedance.sdk.openadsdk.core.WR.bg.bg(application);
                    application.registerActivityLifecycleCallbacks(bg);
                }
            }
        }
        return bg;
    }

    public java.lang.String bg(java.lang.String str, long j, int i) {
        com.bytedance.sdk.openadsdk.core.WR.bg.IL il = this.IL;
        return il != null ? il.bg(str, j, i) : "null";
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(android.app.Activity activity) {
        com.bytedance.sdk.openadsdk.core.WR.bg.IL il = this.IL;
        if (il != null) {
            il.bg(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity activity) {
        com.bytedance.sdk.openadsdk.core.WR.bg.IL il = this.IL;
        if (il != null) {
            il.IL(activity);
        }
    }
}
