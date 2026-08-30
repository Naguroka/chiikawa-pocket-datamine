package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzavs implements android.app.Application.ActivityLifecycleCallbacks {
    private final android.app.Application zza;
    private final java.lang.ref.WeakReference zzb;
    private boolean zzc = false;

    public zzavs(android.app.Application application, android.app.Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.zzb = new java.lang.ref.WeakReference(activityLifecycleCallbacks);
        this.zza = application;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        zza(new com.google.android.gms.internal.ads.zzavk(this, activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(android.app.Activity activity) {
        zza(new com.google.android.gms.internal.ads.zzavq(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(android.app.Activity activity) {
        zza(new com.google.android.gms.internal.ads.zzavn(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(android.app.Activity activity) {
        zza(new com.google.android.gms.internal.ads.zzavm(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
        zza(new com.google.android.gms.internal.ads.zzavp(this, activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(android.app.Activity activity) {
        zza(new com.google.android.gms.internal.ads.zzavl(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(android.app.Activity activity) {
        zza(new com.google.android.gms.internal.ads.zzavo(this, activity));
    }

    protected final void zza(com.google.android.gms.internal.ads.zzavr zzavrVar) {
        try {
            android.app.Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (android.app.Application.ActivityLifecycleCallbacks) this.zzb.get();
            if (activityLifecycleCallbacks != null) {
                zzavrVar.zza(activityLifecycleCallbacks);
            } else {
                if (this.zzc) {
                    return;
                }
                this.zza.unregisterActivityLifecycleCallbacks(this);
                this.zzc = true;
            }
        } catch (java.lang.Exception unused) {
        }
    }
}
