package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzazc implements android.app.Application.ActivityLifecycleCallbacks {
    private android.app.Activity zza;
    private android.content.Context zzb;
    private java.lang.Runnable zzh;
    private long zzj;
    private final java.lang.Object zzc = new java.lang.Object();
    private boolean zzd = true;
    private boolean zze = false;
    private final java.util.List zzf = new java.util.ArrayList();
    private final java.util.List zzg = new java.util.ArrayList();
    private boolean zzi = false;

    zzazc() {
    }

    private final void zzk(android.app.Activity activity) {
        synchronized (this.zzc) {
            if (!activity.getClass().getName().startsWith(com.google.android.gms.ads.MobileAds.ERROR_DOMAIN)) {
                this.zza = activity;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(android.app.Activity activity) {
        zzk(activity);
        synchronized (this.zzc) {
            java.util.Iterator it = this.zzg.iterator();
            while (it.hasNext()) {
                try {
                    ((com.google.android.gms.internal.ads.zzazr) it.next()).zzb();
                } catch (java.lang.Exception e) {
                    com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "AppActivityTracker.ActivityListener.onActivityPaused");
                    com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
                }
            }
        }
        this.zze = true;
        if (this.zzh != null) {
            com.google.android.gms.ads.internal.util.zzs.zza.removeCallbacks(this.zzh);
        }
        com.google.android.gms.internal.ads.zzfqw zzfqwVar = com.google.android.gms.ads.internal.util.zzs.zza;
        com.google.android.gms.internal.ads.zzazb zzazbVar = new com.google.android.gms.internal.ads.zzazb(this);
        this.zzh = zzazbVar;
        zzfqwVar.postDelayed(zzazbVar, this.zzj);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(android.app.Activity activity) {
        zzk(activity);
        this.zze = false;
        boolean z = !this.zzd;
        this.zzd = true;
        if (this.zzh != null) {
            com.google.android.gms.ads.internal.util.zzs.zza.removeCallbacks(this.zzh);
        }
        synchronized (this.zzc) {
            java.util.Iterator it = this.zzg.iterator();
            while (it.hasNext()) {
                try {
                    ((com.google.android.gms.internal.ads.zzazr) it.next()).zzc();
                } catch (java.lang.Exception e) {
                    com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "AppActivityTracker.ActivityListener.onActivityResumed");
                    com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
                }
            }
            if (z) {
                java.util.Iterator it2 = this.zzf.iterator();
                while (it2.hasNext()) {
                    try {
                        ((com.google.android.gms.internal.ads.zzazd) it2.next()).zza(true);
                    } catch (java.lang.Exception e2) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzh("", e2);
                    }
                }
            } else {
                com.google.android.gms.ads.internal.util.client.zzo.zze("App is still foreground.");
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(android.app.Activity activity) {
        zzk(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(android.app.Activity activity) {
    }

    public final android.app.Activity zza() {
        return this.zza;
    }

    public final android.content.Context zzb() {
        return this.zzb;
    }

    public final void zzf(com.google.android.gms.internal.ads.zzazd zzazdVar) {
        synchronized (this.zzc) {
            this.zzf.add(zzazdVar);
        }
    }

    public final void zzg(android.app.Application application, android.content.Context context) {
        if (this.zzi) {
            return;
        }
        application.registerActivityLifecycleCallbacks(this);
        if (context instanceof android.app.Activity) {
            zzk((android.app.Activity) context);
        }
        this.zzb = application;
        this.zzj = ((java.lang.Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzbc)).longValue();
        this.zzi = true;
    }

    public final void zzh(com.google.android.gms.internal.ads.zzazd zzazdVar) {
        synchronized (this.zzc) {
            this.zzf.remove(zzazdVar);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(android.app.Activity activity) {
        synchronized (this.zzc) {
            android.app.Activity activity2 = this.zza;
            if (activity2 == null) {
                return;
            }
            if (activity2.equals(activity)) {
                this.zza = null;
            }
            java.util.Iterator it = this.zzg.iterator();
            while (it.hasNext()) {
                try {
                    if (((com.google.android.gms.internal.ads.zzazr) it.next()).zza()) {
                        it.remove();
                    }
                } catch (java.lang.Exception e) {
                    com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "AppActivityTracker.ActivityListener.onActivityDestroyed");
                    com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
                }
            }
        }
    }
}
