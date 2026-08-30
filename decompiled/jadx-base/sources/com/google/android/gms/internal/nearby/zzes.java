package com.google.android.gms.internal.nearby;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzes implements android.app.Application.ActivityLifecycleCallbacks {
    final /* synthetic */ com.google.android.gms.internal.nearby.zzet zza;
    private final java.lang.ref.WeakReference<android.app.Activity> zzb;

    zzes(com.google.android.gms.internal.nearby.zzet zzetVar, java.lang.ref.WeakReference<android.app.Activity> weakReference) {
        this.zza = zzetVar;
        this.zzb = weakReference;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(android.app.Activity activity) {
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
        if (activity == this.zzb.get()) {
            this.zza.zze = true;
            android.util.Log.d("NearbyConnections", "Activity is visible.");
            this.zza.zzg();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(android.app.Activity activity) {
        if (activity == this.zzb.get()) {
            this.zza.zze = false;
            android.util.Log.d("NearbyConnections", "Activity is hidden.");
            this.zza.zzg();
        }
    }
}
