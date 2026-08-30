package com.google.android.gms.internal.location;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzaz extends com.google.android.gms.internal.location.zzi {
    private final com.google.android.gms.internal.location.zzav zzf;

    public zzaz(android.content.Context context, android.os.Looper looper, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener, java.lang.String str, com.google.android.gms.common.internal.ClientSettings clientSettings) {
        super(context, looper, connectionCallbacks, onConnectionFailedListener, str, clientSettings);
        this.zzf = new com.google.android.gms.internal.location.zzav(context, this.zze);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final void disconnect() {
        synchronized (this.zzf) {
            if (isConnected()) {
                try {
                    this.zzf.zzn();
                    this.zzf.zzo();
                } catch (java.lang.Exception e) {
                    android.util.Log.e("LocationClientImpl", "Client disconnected before listeners could be cleaned up", e);
                }
                super.disconnect();
            } else {
                super.disconnect();
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean usesClientTelemetry() {
        return true;
    }

    public final com.google.android.gms.location.LocationAvailability zzA() throws android.os.RemoteException {
        return this.zzf.zzc();
    }

    public final void zzB(com.google.android.gms.internal.location.zzba zzbaVar, com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.location.LocationCallback> listenerHolder, com.google.android.gms.internal.location.zzai zzaiVar) throws android.os.RemoteException {
        synchronized (this.zzf) {
            this.zzf.zze(zzbaVar, listenerHolder, zzaiVar);
        }
    }

    public final void zzC(com.google.android.gms.location.LocationRequest locationRequest, com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.location.LocationListener> listenerHolder, com.google.android.gms.internal.location.zzai zzaiVar) throws android.os.RemoteException {
        synchronized (this.zzf) {
            this.zzf.zzd(locationRequest, listenerHolder, zzaiVar);
        }
    }

    public final void zzD(com.google.android.gms.internal.location.zzba zzbaVar, android.app.PendingIntent pendingIntent, com.google.android.gms.internal.location.zzai zzaiVar) throws android.os.RemoteException {
        this.zzf.zzf(zzbaVar, pendingIntent, zzaiVar);
    }

    public final void zzE(com.google.android.gms.location.LocationRequest locationRequest, android.app.PendingIntent pendingIntent, com.google.android.gms.internal.location.zzai zzaiVar) throws android.os.RemoteException {
        this.zzf.zzg(locationRequest, pendingIntent, zzaiVar);
    }

    public final void zzF(com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey<com.google.android.gms.location.LocationListener> listenerKey, com.google.android.gms.internal.location.zzai zzaiVar) throws android.os.RemoteException {
        this.zzf.zzh(listenerKey, zzaiVar);
    }

    public final void zzG(android.app.PendingIntent pendingIntent, com.google.android.gms.internal.location.zzai zzaiVar) throws android.os.RemoteException {
        this.zzf.zzj(pendingIntent, zzaiVar);
    }

    public final void zzH(com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey<com.google.android.gms.location.LocationCallback> listenerKey, com.google.android.gms.internal.location.zzai zzaiVar) throws android.os.RemoteException {
        this.zzf.zzi(listenerKey, zzaiVar);
    }

    public final void zzI(boolean z) throws android.os.RemoteException {
        this.zzf.zzk(z);
    }

    public final void zzJ(android.location.Location location) throws android.os.RemoteException {
        this.zzf.zzl(location);
    }

    public final void zzK(com.google.android.gms.internal.location.zzai zzaiVar) throws android.os.RemoteException {
        this.zzf.zzm(zzaiVar);
    }

    public final void zzL(com.google.android.gms.location.LocationSettingsRequest locationSettingsRequest, com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.location.LocationSettingsResult> resultHolder, java.lang.String str) throws android.os.RemoteException {
        checkConnected();
        com.google.android.gms.common.internal.Preconditions.checkArgument(locationSettingsRequest != null, "locationSettingsRequest can't be null nor empty.");
        com.google.android.gms.common.internal.Preconditions.checkArgument(resultHolder != null, "listener can't be null.");
        ((com.google.android.gms.internal.location.zzam) getService()).zzt(locationSettingsRequest, new com.google.android.gms.internal.location.zzay(resultHolder), null);
    }

    public final void zzq(long j, android.app.PendingIntent pendingIntent) throws android.os.RemoteException {
        checkConnected();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(pendingIntent);
        com.google.android.gms.common.internal.Preconditions.checkArgument(j >= 0, "detectionIntervalMillis must be >= 0");
        ((com.google.android.gms.internal.location.zzam) getService()).zzh(j, true, pendingIntent);
    }

    public final void zzr(com.google.android.gms.location.ActivityTransitionRequest activityTransitionRequest, android.app.PendingIntent pendingIntent, com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.common.api.Status> resultHolder) throws android.os.RemoteException {
        checkConnected();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(activityTransitionRequest, "activityTransitionRequest must be specified.");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(pendingIntent, "PendingIntent must be specified.");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(resultHolder, "ResultHolder not provided.");
        ((com.google.android.gms.internal.location.zzam) getService()).zzi(activityTransitionRequest, pendingIntent, new com.google.android.gms.common.api.internal.StatusCallback(resultHolder));
    }

    public final void zzs(android.app.PendingIntent pendingIntent, com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.common.api.Status> resultHolder) throws android.os.RemoteException {
        checkConnected();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(resultHolder, "ResultHolder not provided.");
        ((com.google.android.gms.internal.location.zzam) getService()).zzj(pendingIntent, new com.google.android.gms.common.api.internal.StatusCallback(resultHolder));
    }

    public final void zzt(android.app.PendingIntent pendingIntent) throws android.os.RemoteException {
        checkConnected();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(pendingIntent);
        ((com.google.android.gms.internal.location.zzam) getService()).zzk(pendingIntent);
    }

    public final void zzu(android.app.PendingIntent pendingIntent, com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.common.api.Status> resultHolder) throws android.os.RemoteException {
        checkConnected();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(pendingIntent, "PendingIntent must be specified.");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(resultHolder, "ResultHolder not provided.");
        ((com.google.android.gms.internal.location.zzam) getService()).zzl(pendingIntent, new com.google.android.gms.common.api.internal.StatusCallback(resultHolder));
    }

    public final void zzv(com.google.android.gms.location.GeofencingRequest geofencingRequest, android.app.PendingIntent pendingIntent, com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.common.api.Status> resultHolder) throws android.os.RemoteException {
        checkConnected();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(geofencingRequest, "geofencingRequest can't be null.");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(pendingIntent, "PendingIntent must be specified.");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(resultHolder, "ResultHolder not provided.");
        ((com.google.android.gms.internal.location.zzam) getService()).zzd(geofencingRequest, pendingIntent, new com.google.android.gms.internal.location.zzaw(resultHolder));
    }

    public final void zzw(com.google.android.gms.location.zzbq zzbqVar, com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.common.api.Status> resultHolder) throws android.os.RemoteException {
        checkConnected();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzbqVar, "removeGeofencingRequest can't be null.");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(resultHolder, "ResultHolder not provided.");
        ((com.google.android.gms.internal.location.zzam) getService()).zzg(zzbqVar, new com.google.android.gms.internal.location.zzax(resultHolder));
    }

    public final void zzx(android.app.PendingIntent pendingIntent, com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.common.api.Status> resultHolder) throws android.os.RemoteException {
        checkConnected();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(pendingIntent, "PendingIntent must be specified.");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(resultHolder, "ResultHolder not provided.");
        ((com.google.android.gms.internal.location.zzam) getService()).zze(pendingIntent, new com.google.android.gms.internal.location.zzax(resultHolder), getContext().getPackageName());
    }

    public final void zzy(java.util.List<java.lang.String> list, com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.common.api.Status> resultHolder) throws android.os.RemoteException {
        checkConnected();
        com.google.android.gms.common.internal.Preconditions.checkArgument(list != null && list.size() > 0, "geofenceRequestIds can't be null nor empty.");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(resultHolder, "ResultHolder not provided.");
        ((com.google.android.gms.internal.location.zzam) getService()).zzf((java.lang.String[]) list.toArray(new java.lang.String[0]), new com.google.android.gms.internal.location.zzax(resultHolder), getContext().getPackageName());
    }

    public final android.location.Location zzz(java.lang.String str) throws android.os.RemoteException {
        return com.google.android.gms.common.util.ArrayUtils.contains(getAvailableFeatures(), com.google.android.gms.location.zzu.zzc) ? this.zzf.zza(str) : this.zzf.zzb();
    }
}
