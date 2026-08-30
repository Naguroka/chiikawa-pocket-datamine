package com.adjust.sdk;

/* JADX INFO: loaded from: classes3.dex */
public class AdjustReferrerReceiver extends android.content.BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        java.lang.String stringExtra = intent.getStringExtra(com.adjust.sdk.Constants.REFERRER);
        if (stringExtra == null) {
            return;
        }
        com.adjust.sdk.Adjust.getDefaultInstance().sendReferrer(stringExtra, context);
    }
}
