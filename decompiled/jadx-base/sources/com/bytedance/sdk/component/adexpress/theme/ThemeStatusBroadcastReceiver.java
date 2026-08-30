package com.bytedance.sdk.component.adexpress.theme;

/* JADX INFO: loaded from: classes3.dex */
public class ThemeStatusBroadcastReceiver extends android.content.BroadcastReceiver {
    private java.lang.ref.WeakReference<com.bytedance.sdk.component.adexpress.theme.bg> bg;

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        if (intent == null) {
            return;
        }
        int intExtra = intent.getIntExtra("theme_status_change", 0);
        java.lang.ref.WeakReference<com.bytedance.sdk.component.adexpress.theme.bg> weakReference = this.bg;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.bg.get().onThemeChanged(intExtra);
    }

    public void bg(com.bytedance.sdk.component.adexpress.theme.bg bgVar) {
        this.bg = new java.lang.ref.WeakReference<>(bgVar);
    }
}
