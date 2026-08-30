package com.google.android.gms.nearby.messages.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzah implements android.app.Application.ActivityLifecycleCallbacks {
    private final android.app.Activity zza;
    private final com.google.android.gms.nearby.messages.internal.zzai zzb;

    /* synthetic */ zzah(android.app.Activity activity, com.google.android.gms.nearby.messages.internal.zzai zzaiVar, com.google.android.gms.nearby.messages.internal.zzag zzagVar) {
        this.zza = activity;
        this.zzb = zzaiVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(android.app.Activity activity) {
        if (activity == this.zza) {
            if (android.util.Log.isLoggable("NearbyMessagesClient", 2)) {
                android.util.Log.v("NearbyMessagesClient", java.lang.String.format("Unregistering ClientLifecycleSafetyNet's ActivityLifecycleCallbacks for %s", activity.getPackageName()));
            }
            activity.getApplication().unregisterActivityLifecycleCallbacks(this);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(android.app.Activity activity) {
        if (activity == this.zza) {
            try {
                this.zzb.zzB(1);
            } catch (android.os.RemoteException e) {
                if (android.util.Log.isLoggable("NearbyMessagesClient", 2)) {
                    android.util.Log.v("NearbyMessagesClient", java.lang.String.format("Failed to emit ACTIVITY_STOPPED from ClientLifecycleSafetyNet for Activity %s: %s", activity.getPackageName(), e));
                }
            }
        }
    }
}
