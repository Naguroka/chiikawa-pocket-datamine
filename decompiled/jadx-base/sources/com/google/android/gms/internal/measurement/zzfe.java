package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzfe implements android.app.Application.ActivityLifecycleCallbacks {
    final /* synthetic */ com.google.android.gms.internal.measurement.zzff zza;

    zzfe(com.google.android.gms.internal.measurement.zzff zzffVar) {
        this.zza = zzffVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        this.zza.zzW(new com.google.android.gms.internal.measurement.zzex(this, bundle, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(android.app.Activity activity) {
        this.zza.zzW(new com.google.android.gms.internal.measurement.zzfd(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(android.app.Activity activity) {
        this.zza.zzW(new com.google.android.gms.internal.measurement.zzfa(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(android.app.Activity activity) {
        this.zza.zzW(new com.google.android.gms.internal.measurement.zzez(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
        com.google.android.gms.internal.measurement.zzcs zzcsVar = new com.google.android.gms.internal.measurement.zzcs();
        this.zza.zzW(new com.google.android.gms.internal.measurement.zzfc(this, activity, zzcsVar));
        android.os.Bundle bundleZzb = zzcsVar.zzb(50L);
        if (bundleZzb != null) {
            bundle.putAll(bundleZzb);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(android.app.Activity activity) {
        this.zza.zzW(new com.google.android.gms.internal.measurement.zzey(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(android.app.Activity activity) {
        this.zza.zzW(new com.google.android.gms.internal.measurement.zzfb(this, activity));
    }
}
