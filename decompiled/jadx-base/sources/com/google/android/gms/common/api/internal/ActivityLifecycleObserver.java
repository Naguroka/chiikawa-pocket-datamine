package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class ActivityLifecycleObserver {
    public static final com.google.android.gms.common.api.internal.ActivityLifecycleObserver of(android.app.Activity activity) {
        return new com.google.android.gms.common.api.internal.zab(com.google.android.gms.common.api.internal.zaa.zaa(activity));
    }

    public abstract com.google.android.gms.common.api.internal.ActivityLifecycleObserver onStopCallOnce(java.lang.Runnable runnable);
}
