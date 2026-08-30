package com.google.firebase.analytics;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-api@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zza extends java.util.concurrent.ThreadPoolExecutor {
    zza(com.google.firebase.analytics.FirebaseAnalytics firebaseAnalytics, int i, int i2, long j, java.util.concurrent.TimeUnit timeUnit, java.util.concurrent.BlockingQueue blockingQueue) {
        super(0, 1, 30L, timeUnit, blockingQueue);
    }
}
