package com.google.android.gms.internal.games_v2;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzbl implements com.google.android.gms.internal.games_v2.zzav {
    private final java.util.concurrent.atomic.AtomicReference zza = new java.util.concurrent.atomic.AtomicReference(com.google.android.gms.internal.games_v2.zzbi.UNINITIALIZED);
    private final java.util.concurrent.atomic.AtomicReference zzb = new java.util.concurrent.atomic.AtomicReference(com.google.android.gms.internal.games_v2.zzbh.AUTOMATIC);
    private final java.util.Queue zzc = new java.util.ArrayDeque();
    private final java.util.concurrent.atomic.AtomicReference zzd = new java.util.concurrent.atomic.AtomicReference();
    private final java.util.concurrent.atomic.AtomicReference zze = new java.util.concurrent.atomic.AtomicReference();
    private final android.app.Application zzf;
    private final com.google.android.gms.games.internal.zzg zzg;
    private final com.google.android.gms.internal.games_v2.zzbm zzh;
    private final com.google.android.gms.games.internal.v2.resolution.zzb zzi;

    zzbl(android.app.Application application, com.google.android.gms.games.internal.zzg zzgVar, com.google.android.gms.games.internal.v2.resolution.zzb zzbVar, com.google.android.gms.internal.games_v2.zzbm zzbmVar, byte[] bArr) {
        this.zzf = application;
        this.zzg = zzgVar;
        this.zzi = zzbVar;
        this.zzh = zzbmVar;
    }

    private static com.google.android.gms.common.api.ApiException zzj() {
        return new com.google.android.gms.common.api.ApiException(new com.google.android.gms.common.api.Status(4));
    }

    private static com.google.android.gms.tasks.Task zzk(java.util.concurrent.atomic.AtomicReference atomicReference, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        com.google.android.gms.internal.games_v2.zzbi zzbiVar = com.google.android.gms.internal.games_v2.zzbi.UNINITIALIZED;
        int iOrdinal = ((com.google.android.gms.internal.games_v2.zzbi) atomicReference.get()).ordinal();
        if (iOrdinal == 0) {
            return com.google.android.gms.tasks.Tasks.forException(new com.google.android.gms.common.api.ApiException(new com.google.android.gms.common.api.Status(10)));
        }
        if (iOrdinal == 2) {
            return com.google.android.gms.tasks.Tasks.forResult(com.google.android.gms.games.AuthenticationResult.zza);
        }
        if (iOrdinal == 3) {
            return com.google.android.gms.tasks.Tasks.forResult(com.google.android.gms.games.AuthenticationResult.zzb);
        }
        if (taskCompletionSource == null) {
            return com.google.android.gms.tasks.Tasks.forResult(com.google.android.gms.games.AuthenticationResult.zzb);
        }
        com.google.android.gms.tasks.Task task = taskCompletionSource.getTask();
        if (task.isSuccessful()) {
            return ((java.lang.Boolean) task.getResult()).booleanValue() ? com.google.android.gms.tasks.Tasks.forResult(com.google.android.gms.games.AuthenticationResult.zza) : com.google.android.gms.tasks.Tasks.forResult(com.google.android.gms.games.AuthenticationResult.zzb);
        }
        final com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource2 = new com.google.android.gms.tasks.TaskCompletionSource();
        task.addOnCompleteListener(com.google.android.gms.internal.games_v2.zzfe.zza(), new com.google.android.gms.tasks.OnCompleteListener() { // from class: com.google.android.gms.internal.games_v2.zzbb
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(com.google.android.gms.tasks.Task task2) {
                com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource3 = taskCompletionSource2;
                if (task2.isSuccessful() && ((java.lang.Boolean) task2.getResult()).booleanValue()) {
                    taskCompletionSource3.trySetResult(com.google.android.gms.games.AuthenticationResult.zza);
                } else {
                    taskCompletionSource3.trySetResult(com.google.android.gms.games.AuthenticationResult.zzb);
                }
            }
        });
        return taskCompletionSource2.getTask();
    }

    private static com.google.android.gms.tasks.Task zzl(final com.google.android.gms.internal.games_v2.zzff zzffVar) {
        if (zzp()) {
            return (com.google.android.gms.tasks.Task) zzffVar.zza();
        }
        final com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = new com.google.android.gms.tasks.TaskCompletionSource();
        com.google.android.gms.tasks.TaskExecutors.MAIN_THREAD.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.games_v2.zzbe
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.gms.internal.games_v2.zzff zzffVar2 = zzffVar;
                final com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                ((com.google.android.gms.tasks.Task) zzffVar2.zza()).addOnCompleteListener(new com.google.android.gms.tasks.OnCompleteListener() { // from class: com.google.android.gms.internal.games_v2.zzbc
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(com.google.android.gms.tasks.Task task) {
                        com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource3 = taskCompletionSource2;
                        if (task.isSuccessful()) {
                            taskCompletionSource3.trySetResult(task.getResult());
                            return;
                        }
                        java.lang.Exception exception = task.getException();
                        com.google.android.gms.internal.games_v2.zzfb.zza(exception);
                        taskCompletionSource3.trySetException(exception);
                    }
                });
            }
        });
        return taskCompletionSource.getTask();
    }

    private final void zzm(final com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource, final com.google.android.gms.internal.games_v2.zzy zzyVar) {
        com.google.android.gms.internal.games_v2.zzez.zza("GamesApiManager", "Attempting authentication: ".concat(zzyVar.toString()));
        this.zzh.zza(zzyVar).addOnCompleteListener(com.google.android.gms.tasks.TaskExecutors.MAIN_THREAD, new com.google.android.gms.tasks.OnCompleteListener() { // from class: com.google.android.gms.internal.games_v2.zzba
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(com.google.android.gms.tasks.Task task) {
                this.zza.zzg(taskCompletionSource, zzyVar, task);
            }
        });
    }

    private final void zzn(final com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource, final int i, android.app.PendingIntent pendingIntent, boolean z, boolean z2) {
        android.app.Activity activityZza;
        com.google.android.gms.common.internal.Preconditions.checkMainThread("Must be called on the main thread.");
        if (z && pendingIntent != null && (activityZza = this.zzg.zza()) != null) {
            com.google.android.gms.games.internal.v2.resolution.zzb.zzb(activityZza, pendingIntent).addOnCompleteListener(com.google.android.gms.tasks.TaskExecutors.MAIN_THREAD, new com.google.android.gms.tasks.OnCompleteListener() { // from class: com.google.android.gms.internal.games_v2.zzaz
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(com.google.android.gms.tasks.Task task) {
                    this.zza.zzh(taskCompletionSource, i, task);
                }
            });
            com.google.android.gms.internal.games_v2.zzez.zza("GamesApiManager", "Resolution triggered");
            return;
        }
        boolean zZza = com.google.android.gms.internal.games_v2.zzay.zza(this.zzb, com.google.android.gms.internal.games_v2.zzbh.AUTOMATIC_PENDING_EXPLICIT, com.google.android.gms.internal.games_v2.zzbh.EXPLICIT);
        if (!z2 && zZza) {
            com.google.android.gms.internal.games_v2.zzez.zza("GamesApiManager", "Consumed pending explicit sign-in. Attempting explicit sign-in");
            zzm(taskCompletionSource, com.google.android.gms.internal.games_v2.zzy.zzb(0));
            return;
        }
        taskCompletionSource.trySetResult(false);
        this.zza.set(com.google.android.gms.internal.games_v2.zzbi.AUTHENTICATION_FAILED);
        java.util.Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.internal.games_v2.zzbk) it.next()).zzc(zzj());
            it.remove();
        }
    }

    private final void zzo(int i) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(56);
        sb.append("startAuthenticationIfNecessary() signInType: ");
        sb.append(i);
        com.google.android.gms.internal.games_v2.zzez.zza("GamesApiManager", sb.toString());
        com.google.android.gms.common.internal.Preconditions.checkMainThread("Must be called on the main thread.");
        if (com.google.android.gms.internal.games_v2.zzay.zza(this.zza, com.google.android.gms.internal.games_v2.zzbi.UNINITIALIZED, com.google.android.gms.internal.games_v2.zzbi.AUTHENTICATING) || com.google.android.gms.internal.games_v2.zzay.zza(this.zza, com.google.android.gms.internal.games_v2.zzbi.AUTHENTICATION_FAILED, com.google.android.gms.internal.games_v2.zzbi.AUTHENTICATING)) {
            com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = (com.google.android.gms.tasks.TaskCompletionSource) this.zzd.get();
            if (taskCompletionSource != null) {
                taskCompletionSource.trySetException(new java.lang.IllegalStateException("New authentication attempt in progress"));
            }
            com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource2 = new com.google.android.gms.tasks.TaskCompletionSource();
            this.zzd.set(taskCompletionSource2);
            this.zzb.set(i == 0 ? com.google.android.gms.internal.games_v2.zzbh.EXPLICIT : com.google.android.gms.internal.games_v2.zzbh.AUTOMATIC);
            zzm(taskCompletionSource2, com.google.android.gms.internal.games_v2.zzy.zzb(i));
            return;
        }
        if (i == 0) {
            boolean zZza = com.google.android.gms.internal.games_v2.zzay.zza(this.zzb, com.google.android.gms.internal.games_v2.zzbh.AUTOMATIC, com.google.android.gms.internal.games_v2.zzbh.AUTOMATIC_PENDING_EXPLICIT);
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(88);
            sb2.append("Explicit sign-in during existing authentication. Marking pending explicit sign-in: ");
            sb2.append(zZza);
            com.google.android.gms.internal.games_v2.zzez.zza("GamesApiManager", sb2.toString());
        }
        java.lang.String strValueOf = java.lang.String.valueOf(this.zza.get());
        java.lang.String.valueOf(strValueOf).length();
        com.google.android.gms.internal.games_v2.zzez.zza("GamesApiManager", "Authentication attempt skipped. Already authenticated or authenticating. State: ".concat(java.lang.String.valueOf(strValueOf)));
    }

    private static boolean zzp() {
        return android.os.Looper.myLooper() == android.os.Looper.getMainLooper();
    }

    @Override // com.google.android.gms.internal.games_v2.zzav
    public final com.google.android.gms.tasks.Task zza() {
        return zzl(new com.google.android.gms.internal.games_v2.zzff() { // from class: com.google.android.gms.internal.games_v2.zzbf
            @Override // com.google.android.gms.internal.games_v2.zzff
            public final java.lang.Object zza() {
                return this.zza.zze();
            }
        });
    }

    @Override // com.google.android.gms.internal.games_v2.zzav
    public final com.google.android.gms.tasks.Task zzb() {
        return zzl(new com.google.android.gms.internal.games_v2.zzff() { // from class: com.google.android.gms.internal.games_v2.zzbg
            @Override // com.google.android.gms.internal.games_v2.zzff
            public final java.lang.Object zza() {
                return this.zza.zzf();
            }
        });
    }

    @Override // com.google.android.gms.internal.games_v2.zzav
    public final com.google.android.gms.tasks.Task zzc() {
        return zzk(this.zza, (com.google.android.gms.tasks.TaskCompletionSource) this.zzd.get());
    }

    @Override // com.google.android.gms.internal.games_v2.zzav
    public final com.google.android.gms.tasks.Task zzd(com.google.android.gms.internal.games_v2.zzap zzapVar) {
        com.google.android.gms.internal.games_v2.zzbi zzbiVar = (com.google.android.gms.internal.games_v2.zzbi) this.zza.get();
        java.lang.String strValueOf = java.lang.String.valueOf(zzbiVar);
        java.lang.String.valueOf(strValueOf).length();
        com.google.android.gms.internal.games_v2.zzez.zzf("GamesApiManager", "Executing API call with authentication state: ".concat(java.lang.String.valueOf(strValueOf)));
        if (zzbiVar == com.google.android.gms.internal.games_v2.zzbi.AUTHENTICATED) {
            return zzapVar.zza((com.google.android.gms.common.api.GoogleApi) this.zze.get());
        }
        if (zzbiVar == com.google.android.gms.internal.games_v2.zzbi.AUTHENTICATION_FAILED) {
            return com.google.android.gms.tasks.Tasks.forException(zzj());
        }
        if (zzbiVar == com.google.android.gms.internal.games_v2.zzbi.UNINITIALIZED) {
            return com.google.android.gms.tasks.Tasks.forException(new com.google.android.gms.common.api.ApiException(new com.google.android.gms.common.api.Status(10)));
        }
        com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = new com.google.android.gms.tasks.TaskCompletionSource();
        final com.google.android.gms.internal.games_v2.zzbk zzbkVar = new com.google.android.gms.internal.games_v2.zzbk(zzapVar, taskCompletionSource, null);
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.google.android.gms.internal.games_v2.zzbd
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzi(zzbkVar);
            }
        };
        if (zzp()) {
            runnable.run();
        } else {
            com.google.android.gms.tasks.TaskExecutors.MAIN_THREAD.execute(runnable);
        }
        return taskCompletionSource.getTask();
    }

    final /* synthetic */ com.google.android.gms.tasks.Task zze() {
        zzo(1);
        return zzk(this.zza, (com.google.android.gms.tasks.TaskCompletionSource) this.zzd.get());
    }

    final /* synthetic */ com.google.android.gms.tasks.Task zzf() {
        zzo(0);
        return zzk(this.zza, (com.google.android.gms.tasks.TaskCompletionSource) this.zzd.get());
    }

    final /* synthetic */ void zzg(com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource, com.google.android.gms.internal.games_v2.zzy zzyVar, com.google.android.gms.tasks.Task task) {
        if (!task.isSuccessful()) {
            java.lang.Exception exception = task.getException();
            com.google.android.gms.internal.games_v2.zzfb.zza(exception);
            com.google.android.gms.internal.games_v2.zzez.zzb("GamesApiManager", "Authentication task failed", exception);
            zzn(taskCompletionSource, zzyVar.zza(), null, false, !zzyVar.zzd());
            return;
        }
        com.google.android.gms.internal.games_v2.zzbq zzbqVar = (com.google.android.gms.internal.games_v2.zzbq) task.getResult();
        if (!zzbqVar.zze()) {
            java.lang.String strValueOf = java.lang.String.valueOf(zzbqVar);
            java.lang.String.valueOf(strValueOf).length();
            com.google.android.gms.internal.games_v2.zzez.zza("GamesApiManager", "Failed to authenticate: ".concat(java.lang.String.valueOf(strValueOf)));
            zzn(taskCompletionSource, zzyVar.zza(), zzbqVar.zza(), true, !zzyVar.zzd());
            return;
        }
        java.lang.String strZzd = zzbqVar.zzd();
        if (strZzd == null) {
            com.google.android.gms.internal.games_v2.zzez.zzg("GamesApiManager", "Unexpected state: game run token absent");
            zzn(taskCompletionSource, zzyVar.zza(), null, false, !zzyVar.zzd());
            return;
        }
        com.google.android.gms.internal.games_v2.zzez.zza("GamesApiManager", "Successfully authenticated");
        com.google.android.gms.common.internal.Preconditions.checkMainThread("Must be called on the main thread.");
        com.google.android.gms.games.zzl zzlVarZzb = com.google.android.gms.games.zzn.zzb();
        zzlVarZzb.zzd(2101523);
        zzlVarZzb.zzc(com.google.android.gms.auth.api.signin.GoogleSignInAccount.createDefault());
        zzlVarZzb.zza(strZzd);
        com.google.android.gms.games.internal.zzj zzjVarZza = com.google.android.gms.games.internal.zzl.zza();
        zzjVarZza.zzb(true);
        zzjVarZza.zzc(true);
        zzjVarZza.zza(true);
        zzlVarZzb.zzb(zzjVarZza.zzd());
        com.google.android.gms.internal.games_v2.zze zzeVar = new com.google.android.gms.internal.games_v2.zze(this.zzf, zzlVarZzb.zze());
        this.zze.set(zzeVar);
        this.zza.set(com.google.android.gms.internal.games_v2.zzbi.AUTHENTICATED);
        taskCompletionSource.trySetResult(true);
        java.util.Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.internal.games_v2.zzbk) it.next()).zza(zzeVar);
            it.remove();
        }
    }

    final /* synthetic */ void zzh(com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource, int i, com.google.android.gms.tasks.Task task) {
        if (!task.isSuccessful()) {
            java.lang.Exception exception = task.getException();
            com.google.android.gms.internal.games_v2.zzfb.zza(exception);
            com.google.android.gms.internal.games_v2.zzez.zzh("GamesApiManager", "Resolution failed", exception);
            zzn(taskCompletionSource, i, null, false, true);
            return;
        }
        com.google.android.gms.games.internal.v2.resolution.zzc zzcVar = (com.google.android.gms.games.internal.v2.resolution.zzc) task.getResult();
        if (zzcVar.zzd()) {
            com.google.android.gms.internal.games_v2.zzez.zza("GamesApiManager", "Resolution successful");
            zzm(taskCompletionSource, com.google.android.gms.internal.games_v2.zzy.zzc(i, com.google.android.gms.internal.games_v2.zzaf.zza(zzcVar.zza())));
        } else {
            com.google.android.gms.internal.games_v2.zzez.zza("GamesApiManager", "Resolution attempt was canceled");
            zzn(taskCompletionSource, i, null, false, true);
        }
    }

    final /* synthetic */ void zzi(com.google.android.gms.internal.games_v2.zzbk zzbkVar) {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("Must be called on the main thread.");
        com.google.android.gms.internal.games_v2.zzbi zzbiVar = (com.google.android.gms.internal.games_v2.zzbi) this.zza.get();
        if (zzbiVar == com.google.android.gms.internal.games_v2.zzbi.AUTHENTICATED) {
            zzbkVar.zza((com.google.android.gms.common.api.GoogleApi) this.zze.get());
        } else if (zzbiVar == com.google.android.gms.internal.games_v2.zzbi.AUTHENTICATION_FAILED) {
            zzbkVar.zzc(zzj());
        } else {
            this.zzc.add(zzbkVar);
        }
    }
}
