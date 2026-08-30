package com.google.android.gms.nearby.messages.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzba implements android.app.Application.ActivityLifecycleCallbacks {
    private final android.app.Activity zza;
    private final com.google.android.gms.nearby.messages.internal.zzbg zzb;

    /* synthetic */ zzba(android.app.Activity activity, com.google.android.gms.nearby.messages.internal.zzbg zzbgVar, com.google.android.gms.nearby.messages.internal.zzav zzavVar) {
        this.zza = activity;
        this.zzb = zzbgVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(android.app.Activity activity) {
        if (activity == this.zza) {
            android.util.Log.v("NearbyMessages", java.lang.String.format("Unregistering ClientLifecycleSafetyNet's ActivityLifecycleCallbacks for %s", activity.getPackageName()));
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
            com.google.android.gms.nearby.messages.internal.zzbg.zzg(this.zzb, 1);
        }
    }
}
