package com.google.android.gms.stats;

/* JADX INFO: compiled from: com.google.android.gms:play-services-stats@@17.0.1 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class GCoreWakefulBroadcastReceiver extends androidx.legacy.content.WakefulBroadcastReceiver {
    public static boolean completeWakefulIntent(android.content.Context context, android.content.Intent intent) {
        if (intent == null) {
            return false;
        }
        return androidx.legacy.content.WakefulBroadcastReceiver.completeWakefulIntent(intent);
    }
}
