package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class BackgroundDetector implements android.app.Application.ActivityLifecycleCallbacks, android.content.ComponentCallbacks2 {
    private static final com.google.android.gms.common.api.internal.BackgroundDetector zza = new com.google.android.gms.common.api.internal.BackgroundDetector();
    private final java.util.concurrent.atomic.AtomicBoolean zzb = new java.util.concurrent.atomic.AtomicBoolean();
    private final java.util.concurrent.atomic.AtomicBoolean zzc = new java.util.concurrent.atomic.AtomicBoolean();
    private final java.util.ArrayList zzd = new java.util.ArrayList();
    private boolean zze = false;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
    public interface BackgroundStateChangeListener {
        void onBackgroundStateChanged(boolean z);
    }

    private BackgroundDetector() {
    }

    public static com.google.android.gms.common.api.internal.BackgroundDetector getInstance() {
        return zza;
    }

    public static void initialize(android.app.Application application) {
        com.google.android.gms.common.api.internal.BackgroundDetector backgroundDetector = zza;
        synchronized (backgroundDetector) {
            if (!backgroundDetector.zze) {
                application.registerActivityLifecycleCallbacks(backgroundDetector);
                application.registerComponentCallbacks(backgroundDetector);
                backgroundDetector.zze = true;
            }
        }
    }

    private final void zza(boolean z) {
        synchronized (zza) {
            java.util.Iterator it = this.zzd.iterator();
            while (it.hasNext()) {
                ((com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener) it.next()).onBackgroundStateChanged(z);
            }
        }
    }

    public void addListener(com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener backgroundStateChangeListener) {
        synchronized (zza) {
            this.zzd.add(backgroundStateChangeListener);
        }
    }

    public boolean isInBackground() {
        return this.zzb.get();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = this.zzc;
        boolean zCompareAndSet = this.zzb.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (zCompareAndSet) {
            zza(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(android.app.Activity activity) {
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = this.zzc;
        boolean zCompareAndSet = this.zzb.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (zCompareAndSet) {
            zza(false);
        }
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

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        if (i == 20 && this.zzb.compareAndSet(false, true)) {
            this.zzc.set(true);
            zza(true);
        }
    }

    public boolean readCurrentStateIfPossible(boolean z) {
        if (!this.zzc.get()) {
            if (com.google.android.gms.common.util.ProcessUtils.zza()) {
                return z;
            }
            android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new android.app.ActivityManager.RunningAppProcessInfo();
            android.app.ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!this.zzc.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.zzb.set(true);
            }
        }
        return isInBackground();
    }
}
