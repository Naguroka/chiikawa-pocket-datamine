package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class L4 {
    public static android.content.Intent A00(android.content.Context context, android.content.BroadcastReceiver broadcastReceiver, android.content.IntentFilter intentFilter) {
        return context.registerReceiver(broadcastReceiver, intentFilter);
    }
}
