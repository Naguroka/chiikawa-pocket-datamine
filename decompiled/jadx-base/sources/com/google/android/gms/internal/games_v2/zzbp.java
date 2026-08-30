package com.google.android.gms.internal.games_v2;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzbp implements com.google.android.gms.internal.games_v2.zzbm {
    private final android.app.Application zza;
    private final com.google.android.gms.games.internal.zzg zzb;
    private final com.google.android.gms.internal.games_v2.zzaw zzc;

    zzbp(android.app.Application application, com.google.android.gms.games.internal.zzg zzgVar, com.google.android.gms.internal.games_v2.zzaw zzawVar, byte[] bArr) {
        this.zza = application;
        this.zzb = zzgVar;
        this.zzc = zzawVar;
    }

    private final com.google.android.gms.internal.games_v2.zzs zzc() {
        android.app.Activity activityZza = this.zzb.zza();
        if (activityZza != null) {
            return com.google.android.gms.internal.games_v2.zzr.zza(activityZza, this.zzc.zzb);
        }
        com.google.android.gms.internal.games_v2.zzaw zzawVar = this.zzc;
        return com.google.android.gms.internal.games_v2.zzr.zza(zzawVar.zza, zzawVar.zzb);
    }

    @Override // com.google.android.gms.internal.games_v2.zzbm
    public final com.google.android.gms.tasks.Task zza(final com.google.android.gms.internal.games_v2.zzy zzyVar) {
        final boolean z = false;
        if (zzyVar.zza() == 0 && !com.google.android.gms.common.wrappers.InstantApps.isInstantApp(this.zza)) {
            z = true;
        }
        com.google.android.gms.tasks.Task taskZza = zzc().zza(zzyVar, z);
        final com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = new com.google.android.gms.tasks.TaskCompletionSource();
        taskZza.continueWithTask(com.google.android.gms.internal.games_v2.zzfe.zza(), new com.google.android.gms.tasks.Continuation() { // from class: com.google.android.gms.internal.games_v2.zzbn
            @Override // com.google.android.gms.tasks.Continuation
            public final java.lang.Object then(com.google.android.gms.tasks.Task task) {
                return this.zza.zzb(zzyVar, z, task);
            }
        }).addOnCompleteListener(com.google.android.gms.internal.games_v2.zzfe.zza(), new com.google.android.gms.tasks.OnCompleteListener() { // from class: com.google.android.gms.internal.games_v2.zzbo
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(com.google.android.gms.tasks.Task task) {
                com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                if (task.isSuccessful()) {
                    taskCompletionSource2.trySetResult(com.google.android.gms.internal.games_v2.zzbq.zzc(((com.google.android.gms.internal.games_v2.zzaa) task.getResult()).zza()));
                    return;
                }
                java.lang.Exception exception = task.getException();
                if (exception instanceof com.google.android.gms.common.api.ApiException) {
                    taskCompletionSource2.trySetResult(com.google.android.gms.internal.games_v2.zzbq.zzb(((com.google.android.gms.common.api.ApiException) exception).getStatus()));
                } else {
                    com.google.android.gms.internal.games_v2.zzfb.zza(exception);
                    taskCompletionSource2.trySetException(exception);
                }
            }
        });
        return taskCompletionSource.getTask();
    }

    final /* synthetic */ com.google.android.gms.tasks.Task zzb(com.google.android.gms.internal.games_v2.zzy zzyVar, boolean z, com.google.android.gms.tasks.Task task) throws java.lang.Exception {
        if (task.isSuccessful()) {
            return task;
        }
        java.lang.Exception exception = task.getException();
        if (!(exception instanceof com.google.android.gms.common.api.ApiException) || ((com.google.android.gms.common.api.ApiException) exception).getStatusCode() != 20) {
            return task;
        }
        com.google.android.gms.internal.games_v2.zzez.zza("GamesAuthenticator", "Service connection suspended during the first sign-in attempt. Trying again.");
        return zzc().zza(zzyVar, z);
    }
}
