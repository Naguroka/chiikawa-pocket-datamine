package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@3.1.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzav implements android.app.Application.ActivityLifecycleCallbacks {
    final /* synthetic */ com.google.android.gms.internal.consent_sdk.zzay zza;
    private final android.app.Activity zzb;

    public zzav(com.google.android.gms.internal.consent_sdk.zzay zzayVar, android.app.Activity activity) {
        this.zza = zzayVar;
        this.zzb = activity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzb() {
        this.zza.zzb.unregisterActivityLifecycleCallbacks(this);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        com.google.android.gms.internal.consent_sdk.zzay zzayVar = this.zza;
        if (zzayVar.zzg == null || !zzayVar.zza) {
            return;
        }
        zzayVar.zzg.setOwnerActivity(activity);
        com.google.android.gms.internal.consent_sdk.zzay zzayVar2 = this.zza;
        if (zzayVar2.zzc != null) {
            zzayVar2.zzc.zza(activity);
        }
        com.google.android.gms.internal.consent_sdk.zzav zzavVar = (com.google.android.gms.internal.consent_sdk.zzav) this.zza.zzl.getAndSet(null);
        if (zzavVar != null) {
            zzavVar.zzb();
            com.google.android.gms.internal.consent_sdk.zzay zzayVar3 = this.zza;
            com.google.android.gms.internal.consent_sdk.zzav zzavVar2 = new com.google.android.gms.internal.consent_sdk.zzav(zzayVar3, activity);
            zzayVar3.zzb.registerActivityLifecycleCallbacks(zzavVar2);
            this.zza.zzl.set(zzavVar2);
        }
        com.google.android.gms.internal.consent_sdk.zzay zzayVar4 = this.zza;
        if (zzayVar4.zzg != null) {
            zzayVar4.zzg.show();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(android.app.Activity activity) {
        if (activity != this.zzb) {
            return;
        }
        if (activity.isChangingConfigurations()) {
            com.google.android.gms.internal.consent_sdk.zzay zzayVar = this.zza;
            if (zzayVar.zza && zzayVar.zzg != null) {
                zzayVar.zzg.dismiss();
                return;
            }
        }
        this.zza.zzh(new com.google.android.gms.internal.consent_sdk.zzg(3, "Activity is destroyed."));
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
    }
}
