package com.adjust.sdk;

/* JADX INFO: loaded from: classes3.dex */
public class AdjustPreinstallReferrerReceiver extends android.content.BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        java.lang.String stringExtra;
        if (intent == null || (stringExtra = intent.getStringExtra(com.adjust.sdk.Constants.EXTRA_SYSTEM_INSTALLER_REFERRER)) == null) {
            return;
        }
        com.adjust.sdk.Adjust.getDefaultInstance().sendPreinstallReferrer(stringExtra, context);
    }
}
