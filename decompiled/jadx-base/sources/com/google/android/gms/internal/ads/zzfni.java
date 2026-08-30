package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfni {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzf = 1;
    private final android.content.Context zzb;
    private final java.util.concurrent.Executor zzc;
    private final com.google.android.gms.tasks.Task zzd;
    private final boolean zze;

    public zzfni(android.content.Context context, java.util.concurrent.Executor executor, com.google.android.gms.tasks.Task task, boolean z) {
        this.zzb = context;
        this.zzc = executor;
        this.zzd = task;
        this.zze = z;
    }

    public static com.google.android.gms.internal.ads.zzfni zza(final android.content.Context context, java.util.concurrent.Executor executor, boolean z) {
        final com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = new com.google.android.gms.tasks.TaskCompletionSource();
        if (z) {
            executor.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzfng
                @Override // java.lang.Runnable
                public final void run() {
                    taskCompletionSource.setResult(com.google.android.gms.internal.ads.zzfpk.zzb(context, "GLAS", null));
                }
            });
        } else {
            executor.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzfnh
                @Override // java.lang.Runnable
                public final void run() {
                    taskCompletionSource.setResult(com.google.android.gms.internal.ads.zzfpk.zzc());
                }
            });
        }
        return new com.google.android.gms.internal.ads.zzfni(context, executor, taskCompletionSource.getTask(), z);
    }

    static void zzg(int i) {
        zzf = i;
    }

    private final com.google.android.gms.tasks.Task zzh(final int i, long j, java.lang.Exception exc, java.lang.String str, java.util.Map map, java.lang.String str2) {
        if (!this.zze) {
            return this.zzd.continueWith(this.zzc, new com.google.android.gms.tasks.Continuation() { // from class: com.google.android.gms.internal.ads.zzfne
                @Override // com.google.android.gms.tasks.Continuation
                public final java.lang.Object then(com.google.android.gms.tasks.Task task) {
                    return java.lang.Boolean.valueOf(task.isSuccessful());
                }
            });
        }
        android.content.Context context = this.zzb;
        final com.google.android.gms.internal.ads.zzari zzariVarZza = com.google.android.gms.internal.ads.zzarm.zza();
        zzariVarZza.zza(context.getPackageName());
        zzariVarZza.zze(j);
        zzariVarZza.zzg(zzf);
        if (exc != null) {
            java.io.StringWriter stringWriter = new java.io.StringWriter();
            exc.printStackTrace(new java.io.PrintWriter(stringWriter));
            zzariVarZza.zzf(stringWriter.toString());
            zzariVarZza.zzd(exc.getClass().getName());
        }
        if (str2 != null) {
            zzariVarZza.zzb(str2);
        }
        if (str != null) {
            zzariVarZza.zzc(str);
        }
        return this.zzd.continueWith(this.zzc, new com.google.android.gms.tasks.Continuation() { // from class: com.google.android.gms.internal.ads.zzfnf
            @Override // com.google.android.gms.tasks.Continuation
            public final java.lang.Object then(com.google.android.gms.tasks.Task task) {
                int i2 = com.google.android.gms.internal.ads.zzfni.zza;
                if (!task.isSuccessful()) {
                    return false;
                }
                int i3 = i;
                com.google.android.gms.internal.ads.zzfpi zzfpiVarZza = ((com.google.android.gms.internal.ads.zzfpk) task.getResult()).zza(((com.google.android.gms.internal.ads.zzarm) zzariVarZza.zzbn()).zzaV());
                zzfpiVarZza.zza(i3);
                zzfpiVarZza.zzc();
                return true;
            }
        });
    }

    public final com.google.android.gms.tasks.Task zzb(int i, java.lang.String str) {
        return zzh(i, 0L, null, null, null, str);
    }

    public final com.google.android.gms.tasks.Task zzc(int i, long j, java.lang.Exception exc) {
        return zzh(i, j, exc, null, null, null);
    }

    public final com.google.android.gms.tasks.Task zzd(int i, long j) {
        return zzh(i, j, null, null, null, null);
    }

    public final com.google.android.gms.tasks.Task zze(int i, long j, java.lang.String str) {
        return zzh(i, j, null, null, null, str);
    }

    public final com.google.android.gms.tasks.Task zzf(int i, long j, java.lang.String str, java.util.Map map) {
        return zzh(i, j, null, str, null, null);
    }
}
