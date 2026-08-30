package com.google.android.gms.internal.appset;

/* JADX INFO: compiled from: com.google.android.gms:play-services-appset@@16.0.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzl implements com.google.android.gms.appset.AppSetIdClient {
    private static com.google.android.gms.appset.AppSetIdClient zza;
    private final android.content.Context zzb;
    private boolean zzc;
    private final java.util.concurrent.ScheduledExecutorService zzd;
    private final java.util.concurrent.ExecutorService zze;

    zzl(android.content.Context context) {
        this.zzc = false;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = java.util.concurrent.Executors.newSingleThreadScheduledExecutor();
        this.zzd = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
        this.zze = java.util.concurrent.Executors.newSingleThreadExecutor();
        this.zzb = context;
        if (this.zzc) {
            return;
        }
        scheduledExecutorServiceNewSingleThreadScheduledExecutor.scheduleAtFixedRate(new com.google.android.gms.internal.appset.zzj(this, null), 0L, 86400L, java.util.concurrent.TimeUnit.SECONDS);
        this.zzc = true;
    }

    static synchronized com.google.android.gms.appset.AppSetIdClient zzc(android.content.Context context) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context, "Context must not be null");
        if (zza == null) {
            zza = new com.google.android.gms.internal.appset.zzl(context.getApplicationContext());
        }
        return zza;
    }

    protected static final void zze(android.content.Context context) {
        if (!zzf(context).edit().remove("app_set_id").commit()) {
            java.lang.String strValueOf = java.lang.String.valueOf(context.getPackageName());
            android.util.Log.e("AppSet", strValueOf.length() != 0 ? "Failed to clear app set ID generated for App ".concat(strValueOf) : new java.lang.String("Failed to clear app set ID generated for App "));
        }
        if (zzf(context).edit().remove("app_set_id_last_used_time").commit()) {
            return;
        }
        java.lang.String strValueOf2 = java.lang.String.valueOf(context.getPackageName());
        android.util.Log.e("AppSet", strValueOf2.length() != 0 ? "Failed to clear app set ID last used time for App ".concat(strValueOf2) : new java.lang.String("Failed to clear app set ID last used time for App "));
    }

    private static final android.content.SharedPreferences zzf(android.content.Context context) {
        return context.getSharedPreferences("app_set_id_storage", 0);
    }

    private static final void zzg(android.content.Context context) throws com.google.android.gms.internal.appset.zzk {
        if (zzf(context).edit().putLong("app_set_id_last_used_time", com.google.android.gms.common.util.DefaultClock.getInstance().currentTimeMillis()).commit()) {
            return;
        }
        java.lang.String strValueOf = java.lang.String.valueOf(context.getPackageName());
        android.util.Log.e("AppSet", strValueOf.length() != 0 ? "Failed to store app set ID last used time for App ".concat(strValueOf) : new java.lang.String("Failed to store app set ID last used time for App "));
        throw new com.google.android.gms.internal.appset.zzk("Failed to store the app set ID last used time.");
    }

    @Override // com.google.android.gms.appset.AppSetIdClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.appset.AppSetIdInfo> getAppSetIdInfo() {
        final com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = new com.google.android.gms.tasks.TaskCompletionSource();
        this.zze.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.appset.zzh
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzd(taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    protected final long zza() {
        long j = zzf(this.zzb).getLong("app_set_id_last_used_time", -1L);
        if (j != -1) {
            return j + 33696000000L;
        }
        return -1L;
    }

    final /* synthetic */ void zzd(com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        java.lang.String string = zzf(this.zzb).getString("app_set_id", null);
        long jZza = zza();
        if (string == null || com.google.android.gms.common.util.DefaultClock.getInstance().currentTimeMillis() > jZza) {
            string = java.util.UUID.randomUUID().toString();
            try {
                android.content.Context context = this.zzb;
                if (!zzf(context).edit().putString("app_set_id", string).commit()) {
                    java.lang.String strValueOf = java.lang.String.valueOf(context.getPackageName());
                    android.util.Log.e("AppSet", strValueOf.length() != 0 ? "Failed to store app set ID generated for App ".concat(strValueOf) : new java.lang.String("Failed to store app set ID generated for App "));
                    throw new com.google.android.gms.internal.appset.zzk("Failed to store the app set ID.");
                }
                zzg(context);
                android.content.Context context2 = this.zzb;
                if (!zzf(context2).edit().putLong("app_set_id_creation_time", com.google.android.gms.common.util.DefaultClock.getInstance().currentTimeMillis()).commit()) {
                    java.lang.String strValueOf2 = java.lang.String.valueOf(context2.getPackageName());
                    android.util.Log.e("AppSet", strValueOf2.length() != 0 ? "Failed to store app set ID creation time for App ".concat(strValueOf2) : new java.lang.String("Failed to store app set ID creation time for App "));
                    throw new com.google.android.gms.internal.appset.zzk("Failed to store the app set ID creation time.");
                }
            } catch (com.google.android.gms.internal.appset.zzk e) {
                taskCompletionSource.setException(e);
                return;
            }
        } else {
            try {
                zzg(this.zzb);
            } catch (com.google.android.gms.internal.appset.zzk e2) {
                taskCompletionSource.setException(e2);
                return;
            }
        }
        taskCompletionSource.setResult(new com.google.android.gms.appset.AppSetIdInfo(string, 1));
    }
}
