package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public class zzflm implements android.app.Application.ActivityLifecycleCallbacks {
    protected boolean zza;
    private boolean zzb;
    private com.google.android.gms.internal.ads.zzfll zzc;

    private final void zza(boolean z) {
        if (this.zza != z) {
            this.zza = z;
            if (this.zzb) {
                zzb(z);
                com.google.android.gms.internal.ads.zzfll zzfllVar = this.zzc;
                if (zzfllVar != null) {
                    zzfllVar.zzc(z);
                }
            }
        }
    }

    private final boolean zzh() {
        android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new android.app.ActivityManager.RunningAppProcessInfo();
        android.app.ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return runningAppProcessInfo.importance == 100 || zzc();
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
        zza(true);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(android.app.Activity activity) {
        zza(zzh());
    }

    protected void zzb(boolean z) {
    }

    protected boolean zzc() {
        return false;
    }

    public final void zzd(android.content.Context context) {
        if (context instanceof android.app.Application) {
            ((android.app.Application) context).registerActivityLifecycleCallbacks(this);
        }
    }

    public final void zze(com.google.android.gms.internal.ads.zzfll zzfllVar) {
        this.zzc = zzfllVar;
    }

    public final void zzf() {
        this.zzb = true;
        boolean zZzh = zzh();
        this.zza = zZzh;
        zzb(zZzh);
    }

    public final void zzg() {
        this.zzb = false;
        this.zzc = null;
    }
}
