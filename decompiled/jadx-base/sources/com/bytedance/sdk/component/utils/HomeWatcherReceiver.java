package com.bytedance.sdk.component.utils;

/* JADX INFO: loaded from: classes3.dex */
public class HomeWatcherReceiver extends android.content.BroadcastReceiver {
    private com.bytedance.sdk.component.utils.HomeWatcherReceiver.bg bg;

    public interface bg {
        void IL();

        void bg();
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            java.lang.String action = intent.getAction();
            android.util.Log.i("HomeReceiver", "onReceive: action: ".concat(java.lang.String.valueOf(action)));
            if ("android.intent.action.CLOSE_SYSTEM_DIALOGS".equals(action)) {
                java.lang.String stringExtra = intent.getStringExtra("reason");
                android.util.Log.i("HomeReceiver", "reason: ".concat(java.lang.String.valueOf(stringExtra)));
                if ("homekey".equals(stringExtra)) {
                    android.util.Log.i("HomeReceiver", "homekey");
                    com.bytedance.sdk.component.utils.HomeWatcherReceiver.bg bgVar = this.bg;
                    if (bgVar != null) {
                        bgVar.bg();
                        return;
                    }
                    return;
                }
                if ("recentapps".equals(stringExtra)) {
                    android.util.Log.i("HomeReceiver", "long press home key or activity switch");
                    com.bytedance.sdk.component.utils.HomeWatcherReceiver.bg bgVar2 = this.bg;
                    if (bgVar2 != null) {
                        bgVar2.IL();
                        return;
                    }
                    return;
                }
                if ("assist".equals(stringExtra)) {
                    android.util.Log.i("HomeReceiver", "assist");
                }
            }
        } catch (java.lang.Throwable unused) {
            com.bytedance.sdk.component.utils.PX.bg("HomeReceiver", "ACTION_CLOSE_SYSTEM_DIALOGS throw");
        }
    }

    public void bg(com.bytedance.sdk.component.utils.HomeWatcherReceiver.bg bgVar) {
        this.bg = bgVar;
    }
}
