package com.bytedance.sdk.openadsdk.core.theme;

/* JADX INFO: loaded from: classes4.dex */
public class ThemeStatusBroadcastReceiver extends android.content.BroadcastReceiver {
    private java.lang.ref.WeakReference<java.lang.Object> bg;

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        if (intent == null) {
            return;
        }
        intent.getIntExtra("theme_status_change", 0);
        java.lang.ref.WeakReference<java.lang.Object> weakReference = this.bg;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.bg.get();
    }
}
