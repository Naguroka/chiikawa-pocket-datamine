package com.google.android.gms.location;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public class FusedLocationProviderClient extends com.google.android.gms.common.api.GoogleApi<com.google.android.gms.common.api.Api.ApiOptions.NoOptions> {
    public static final java.lang.String KEY_MOCK_LOCATION = "mockLocation";
    public static final java.lang.String KEY_VERTICAL_ACCURACY = "verticalAccuracy";

    public FusedLocationProviderClient(android.app.Activity activity) {
        super(activity, com.google.android.gms.location.LocationServices.API, com.google.android.gms.common.api.Api.ApiOptions.NO_OPTIONS, (com.google.android.gms.common.api.internal.StatusExceptionMapper) new com.google.android.gms.common.api.internal.ApiExceptionMapper());
    }

    private final com.google.android.gms.tasks.Task<java.lang.Void> zze(final com.google.android.gms.internal.location.zzba zzbaVar, final com.google.android.gms.location.LocationCallback locationCallback, android.os.Looper looper, final com.google.android.gms.location.zzan zzanVar, int i) {
        final com.google.android.gms.common.api.internal.ListenerHolder listenerHolderCreateListenerHolder = com.google.android.gms.common.api.internal.ListenerHolders.createListenerHolder(locationCallback, com.google.android.gms.internal.location.zzbj.zza(looper), "LocationCallback");
        final com.google.android.gms.location.zzak zzakVar = new com.google.android.gms.location.zzak(this, listenerHolderCreateListenerHolder);
        return doRegisterEventListener(com.google.android.gms.common.api.internal.RegistrationMethods.builder().register(new com.google.android.gms.common.api.internal.RemoteCall(this, zzakVar, locationCallback, zzanVar, zzbaVar, listenerHolderCreateListenerHolder) { // from class: com.google.android.gms.location.zzae
            private final com.google.android.gms.location.FusedLocationProviderClient zza;
            private final com.google.android.gms.location.zzap zzb;
            private final com.google.android.gms.location.LocationCallback zzc;
            private final com.google.android.gms.location.zzan zzd;
            private final com.google.android.gms.internal.location.zzba zze;
            private final com.google.android.gms.common.api.internal.ListenerHolder zzf;

            {
                this.zza = this;
                this.zzb = zzakVar;
                this.zzc = locationCallback;
                this.zzd = zzanVar;
                this.zze = zzbaVar;
                this.zzf = listenerHolderCreateListenerHolder;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(java.lang.Object obj, java.lang.Object obj2) throws android.os.RemoteException {
                this.zza.zzb(this.zzb, this.zzc, this.zzd, this.zze, this.zzf, (com.google.android.gms.internal.location.zzaz) obj, (com.google.android.gms.tasks.TaskCompletionSource) obj2);
            }
        }).unregister(zzakVar).withHolder(listenerHolderCreateListenerHolder).setMethodKey(i).build());
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> flushLocations() {
        return doWrite(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(com.google.android.gms.location.zzw.zza).setMethodKey(2422).build());
    }

    public com.google.android.gms.tasks.Task<android.location.Location> getCurrentLocation(int i, final com.google.android.gms.tasks.CancellationToken cancellationToken) {
        com.google.android.gms.location.LocationRequest locationRequestCreate = com.google.android.gms.location.LocationRequest.create();
        locationRequestCreate.setPriority(i);
        locationRequestCreate.setInterval(0L);
        locationRequestCreate.setFastestInterval(0L);
        locationRequestCreate.setExpirationDuration(30000L);
        final com.google.android.gms.internal.location.zzba zzbaVarZza = com.google.android.gms.internal.location.zzba.zza(null, locationRequestCreate);
        zzbaVarZza.zzd(true);
        zzbaVarZza.zzb(10000L);
        com.google.android.gms.tasks.Task taskDoRead = doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall(this, cancellationToken, zzbaVarZza) { // from class: com.google.android.gms.location.zzab
            private final com.google.android.gms.location.FusedLocationProviderClient zza;
            private final com.google.android.gms.tasks.CancellationToken zzb;
            private final com.google.android.gms.internal.location.zzba zzc;

            {
                this.zza = this;
                this.zzb = cancellationToken;
                this.zzc = zzbaVarZza;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(java.lang.Object obj, java.lang.Object obj2) throws android.os.RemoteException {
                this.zza.zzc(this.zzb, this.zzc, (com.google.android.gms.internal.location.zzaz) obj, (com.google.android.gms.tasks.TaskCompletionSource) obj2);
            }
        }).setFeatures(com.google.android.gms.location.zzu.zzd).setMethodKey(2415).build());
        if (cancellationToken == null) {
            return taskDoRead;
        }
        final com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = new com.google.android.gms.tasks.TaskCompletionSource(cancellationToken);
        taskDoRead.continueWithTask(new com.google.android.gms.tasks.Continuation(taskCompletionSource) { // from class: com.google.android.gms.location.zzac
            private final com.google.android.gms.tasks.TaskCompletionSource zza;

            {
                this.zza = taskCompletionSource;
            }

            @Override // com.google.android.gms.tasks.Continuation
            public final java.lang.Object then(com.google.android.gms.tasks.Task task) {
                com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource2 = this.zza;
                java.lang.String str = com.google.android.gms.location.FusedLocationProviderClient.KEY_MOCK_LOCATION;
                if (task.isSuccessful()) {
                    taskCompletionSource2.trySetResult((android.location.Location) task.getResult());
                } else {
                    java.lang.Exception exception = task.getException();
                    if (exception != null) {
                        taskCompletionSource2.setException(exception);
                    }
                }
                return taskCompletionSource2.getTask();
            }
        });
        return taskCompletionSource.getTask();
    }

    public com.google.android.gms.tasks.Task<android.location.Location> getLastLocation() {
        return doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall(this) { // from class: com.google.android.gms.location.zzv
            private final com.google.android.gms.location.FusedLocationProviderClient zza;

            {
                this.zza = this;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(java.lang.Object obj, java.lang.Object obj2) throws android.os.RemoteException {
                this.zza.zzd((com.google.android.gms.internal.location.zzaz) obj, (com.google.android.gms.tasks.TaskCompletionSource) obj2);
            }
        }).setMethodKey(2414).build());
    }

    public com.google.android.gms.tasks.Task<com.google.android.gms.location.LocationAvailability> getLocationAvailability() {
        return doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(com.google.android.gms.location.zzad.zza).setMethodKey(2416).build());
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> removeLocationUpdates(final android.app.PendingIntent pendingIntent) {
        return doWrite(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall(pendingIntent) { // from class: com.google.android.gms.location.zzag
            private final android.app.PendingIntent zza;

            {
                this.zza = pendingIntent;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(java.lang.Object obj, java.lang.Object obj2) throws android.os.RemoteException {
                ((com.google.android.gms.internal.location.zzaz) obj).zzG(this.zza, new com.google.android.gms.location.zzao((com.google.android.gms.tasks.TaskCompletionSource) obj2));
            }
        }).setMethodKey(2418).build());
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> requestLocationUpdates(com.google.android.gms.location.LocationRequest locationRequest, final android.app.PendingIntent pendingIntent) {
        final com.google.android.gms.internal.location.zzba zzbaVarZza = com.google.android.gms.internal.location.zzba.zza(null, locationRequest);
        return doWrite(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall(this, zzbaVarZza, pendingIntent) { // from class: com.google.android.gms.location.zzaf
            private final com.google.android.gms.location.FusedLocationProviderClient zza;
            private final com.google.android.gms.internal.location.zzba zzb;
            private final android.app.PendingIntent zzc;

            {
                this.zza = this;
                this.zzb = zzbaVarZza;
                this.zzc = pendingIntent;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(java.lang.Object obj, java.lang.Object obj2) throws android.os.RemoteException {
                this.zza.zza(this.zzb, this.zzc, (com.google.android.gms.internal.location.zzaz) obj, (com.google.android.gms.tasks.TaskCompletionSource) obj2);
            }
        }).setMethodKey(2417).build());
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> setMockLocation(final android.location.Location location) {
        return doWrite(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall(location) { // from class: com.google.android.gms.location.zzai
            private final android.location.Location zza;

            {
                this.zza = location;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(java.lang.Object obj, java.lang.Object obj2) throws android.os.RemoteException {
                android.location.Location location2 = this.zza;
                java.lang.String str = com.google.android.gms.location.FusedLocationProviderClient.KEY_MOCK_LOCATION;
                ((com.google.android.gms.internal.location.zzaz) obj).zzJ(location2);
                ((com.google.android.gms.tasks.TaskCompletionSource) obj2).setResult(null);
            }
        }).setMethodKey(2421).build());
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> setMockMode(final boolean z) {
        return doWrite(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall(z) { // from class: com.google.android.gms.location.zzah
            private final boolean zza;

            {
                this.zza = z;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(java.lang.Object obj, java.lang.Object obj2) throws android.os.RemoteException {
                boolean z2 = this.zza;
                java.lang.String str = com.google.android.gms.location.FusedLocationProviderClient.KEY_MOCK_LOCATION;
                ((com.google.android.gms.internal.location.zzaz) obj).zzI(z2);
                ((com.google.android.gms.tasks.TaskCompletionSource) obj2).setResult(null);
            }
        }).setMethodKey(2420).build());
    }

    final /* synthetic */ void zza(com.google.android.gms.internal.location.zzba zzbaVar, android.app.PendingIntent pendingIntent, com.google.android.gms.internal.location.zzaz zzazVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) throws android.os.RemoteException {
        com.google.android.gms.location.zzao zzaoVar = new com.google.android.gms.location.zzao(taskCompletionSource);
        zzbaVar.zzc(getContextAttributionTag());
        zzazVar.zzD(zzbaVar, pendingIntent, zzaoVar);
    }

    final /* synthetic */ void zzb(final com.google.android.gms.location.zzap zzapVar, final com.google.android.gms.location.LocationCallback locationCallback, final com.google.android.gms.location.zzan zzanVar, com.google.android.gms.internal.location.zzba zzbaVar, com.google.android.gms.common.api.internal.ListenerHolder listenerHolder, com.google.android.gms.internal.location.zzaz zzazVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) throws android.os.RemoteException {
        com.google.android.gms.location.zzam zzamVar = new com.google.android.gms.location.zzam(taskCompletionSource, new com.google.android.gms.location.zzan(this, zzapVar, locationCallback, zzanVar) { // from class: com.google.android.gms.location.zzx
            private final com.google.android.gms.location.FusedLocationProviderClient zza;
            private final com.google.android.gms.location.zzap zzb;
            private final com.google.android.gms.location.LocationCallback zzc;
            private final com.google.android.gms.location.zzan zzd;

            {
                this.zza = this;
                this.zzb = zzapVar;
                this.zzc = locationCallback;
                this.zzd = zzanVar;
            }

            @Override // com.google.android.gms.location.zzan
            public final void zza() {
                com.google.android.gms.location.FusedLocationProviderClient fusedLocationProviderClient = this.zza;
                com.google.android.gms.location.zzap zzapVar2 = this.zzb;
                com.google.android.gms.location.LocationCallback locationCallback2 = this.zzc;
                com.google.android.gms.location.zzan zzanVar2 = this.zzd;
                zzapVar2.zzb(false);
                fusedLocationProviderClient.removeLocationUpdates(locationCallback2);
                if (zzanVar2 != null) {
                    zzanVar2.zza();
                }
            }
        });
        zzbaVar.zzc(getContextAttributionTag());
        zzazVar.zzB(zzbaVar, listenerHolder, zzamVar);
    }

    final /* synthetic */ void zzc(com.google.android.gms.tasks.CancellationToken cancellationToken, com.google.android.gms.internal.location.zzba zzbaVar, com.google.android.gms.internal.location.zzaz zzazVar, final com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) throws android.os.RemoteException {
        final com.google.android.gms.location.zzaj zzajVar = new com.google.android.gms.location.zzaj(this, taskCompletionSource);
        if (cancellationToken != null) {
            cancellationToken.onCanceledRequested(new com.google.android.gms.tasks.OnTokenCanceledListener(this, zzajVar) { // from class: com.google.android.gms.location.zzy
                private final com.google.android.gms.location.FusedLocationProviderClient zza;
                private final com.google.android.gms.location.LocationCallback zzb;

                {
                    this.zza = this;
                    this.zzb = zzajVar;
                }

                @Override // com.google.android.gms.tasks.OnTokenCanceledListener
                public final void onCanceled() {
                    this.zza.removeLocationUpdates(this.zzb);
                }
            });
        }
        zze(zzbaVar, zzajVar, android.os.Looper.getMainLooper(), new com.google.android.gms.location.zzan(taskCompletionSource) { // from class: com.google.android.gms.location.zzz
            private final com.google.android.gms.tasks.TaskCompletionSource zza;

            {
                this.zza = taskCompletionSource;
            }

            @Override // com.google.android.gms.location.zzan
            public final void zza() {
                com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource2 = this.zza;
                java.lang.String str = com.google.android.gms.location.FusedLocationProviderClient.KEY_MOCK_LOCATION;
                taskCompletionSource2.trySetResult(null);
            }
        }, 2437).continueWithTask(new com.google.android.gms.tasks.Continuation(taskCompletionSource) { // from class: com.google.android.gms.location.zzaa
            private final com.google.android.gms.tasks.TaskCompletionSource zza;

            {
                this.zza = taskCompletionSource;
            }

            @Override // com.google.android.gms.tasks.Continuation
            public final java.lang.Object then(com.google.android.gms.tasks.Task task) {
                com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource2 = this.zza;
                java.lang.String str = com.google.android.gms.location.FusedLocationProviderClient.KEY_MOCK_LOCATION;
                if (!task.isSuccessful()) {
                    if (task.getException() != null) {
                        java.lang.Exception exception = task.getException();
                        if (exception != null) {
                            taskCompletionSource2.setException(exception);
                        }
                    } else {
                        taskCompletionSource2.trySetResult(null);
                    }
                }
                return taskCompletionSource2.getTask();
            }
        });
    }

    final /* synthetic */ void zzd(com.google.android.gms.internal.location.zzaz zzazVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) throws android.os.RemoteException {
        taskCompletionSource.setResult(zzazVar.zzz(getContextAttributionTag()));
    }

    public FusedLocationProviderClient(android.content.Context context) {
        super(context, com.google.android.gms.location.LocationServices.API, com.google.android.gms.common.api.Api.ApiOptions.NO_OPTIONS, new com.google.android.gms.common.api.internal.ApiExceptionMapper());
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> removeLocationUpdates(com.google.android.gms.location.LocationCallback locationCallback) {
        return com.google.android.gms.common.api.internal.TaskUtil.toVoidTaskThatFailsOnFalse(doUnregisterEventListener(com.google.android.gms.common.api.internal.ListenerHolders.createListenerKey(locationCallback, "LocationCallback")));
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> requestLocationUpdates(com.google.android.gms.location.LocationRequest locationRequest, com.google.android.gms.location.LocationCallback locationCallback, android.os.Looper looper) {
        return zze(com.google.android.gms.internal.location.zzba.zza(null, locationRequest), locationCallback, looper, null, 2436);
    }
}
