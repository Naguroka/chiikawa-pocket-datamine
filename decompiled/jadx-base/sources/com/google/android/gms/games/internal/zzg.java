package com.google.android.gms.games.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzg {
    private static final java.util.concurrent.atomic.AtomicReference zza = new java.util.concurrent.atomic.AtomicReference();
    private final android.app.Application zzb;
    private java.lang.ref.WeakReference zzf;
    private final android.app.Application.ActivityLifecycleCallbacks zzc = new com.google.android.gms.games.internal.zzf(this, null);
    private final java.lang.Object zzd = new java.lang.Object();
    private final java.util.Set zze = java.util.Collections.newSetFromMap(new java.util.WeakHashMap());
    private boolean zzg = false;

    public zzg(android.app.Application application) {
        this.zzb = application;
    }

    public static com.google.android.gms.games.internal.zzg zzb(android.app.Application application) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(application);
        java.util.concurrent.atomic.AtomicReference atomicReference = zza;
        com.google.android.gms.games.internal.zzg zzgVar = (com.google.android.gms.games.internal.zzg) atomicReference.get();
        if (zzgVar != null) {
            return zzgVar;
        }
        com.google.android.gms.games.internal.zzg zzgVar2 = new com.google.android.gms.games.internal.zzg(application);
        while (!kotlin.UByte$$ExternalSyntheticBackport0.m(atomicReference, null, zzgVar2) && atomicReference.get() == null) {
        }
        return (com.google.android.gms.games.internal.zzg) zza.get();
    }

    public static com.google.android.gms.games.internal.zzg zzc(android.content.Context context) {
        return zzb((android.app.Application) context.getApplicationContext());
    }

    static /* bridge */ /* synthetic */ void zzd(com.google.android.gms.games.internal.zzg zzgVar, android.app.Activity activity) {
        synchronized (zzgVar.zzd) {
            java.lang.ref.WeakReference weakReference = zzgVar.zzf;
            if (weakReference == null) {
                return;
            }
            if (weakReference.get() == activity) {
                zzgVar.zzf = null;
            }
        }
    }

    static /* bridge */ /* synthetic */ void zze(com.google.android.gms.games.internal.zzg zzgVar, android.app.Activity activity) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(activity);
        synchronized (zzgVar.zzd) {
            if (zzgVar.zza() == activity) {
                return;
            }
            zzgVar.zzf = new java.lang.ref.WeakReference(activity);
            java.util.Iterator it = zzgVar.zze.iterator();
            while (it.hasNext()) {
                ((com.google.android.gms.games.internal.zzd) it.next()).zza(activity);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzi, reason: merged with bridge method [inline-methods] */
    public final void zzg(com.google.android.gms.games.internal.zzd zzdVar) {
        android.app.Activity activityZza = zza();
        if (activityZza == null) {
            return;
        }
        zzdVar.zza(activityZza);
    }

    public final android.app.Activity zza() {
        android.app.Activity activity;
        synchronized (this.zzd) {
            java.lang.ref.WeakReference weakReference = this.zzf;
            activity = weakReference == null ? null : (android.app.Activity) weakReference.get();
        }
        return activity;
    }

    public final void zzf(final com.google.android.gms.games.internal.zzd zzdVar) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzdVar);
        synchronized (this.zzd) {
            this.zze.add(zzdVar);
        }
        if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
            zzg(zzdVar);
        } else {
            com.google.android.gms.tasks.TaskExecutors.MAIN_THREAD.execute(new java.lang.Runnable() { // from class: com.google.android.gms.games.internal.zzc
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzg(zzdVar);
                }
            });
        }
    }

    public final void zzh() {
        synchronized (this.zzd) {
            if (!this.zzg) {
                this.zzb.registerActivityLifecycleCallbacks(this.zzc);
                this.zzg = true;
            }
        }
    }
}
