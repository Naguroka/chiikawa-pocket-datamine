package com.google.android.gms.nearby.messages.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzai extends com.google.android.gms.common.internal.GmsClient<com.google.android.gms.nearby.messages.internal.zzs> {
    private final com.google.android.gms.internal.nearby.zzhu<com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey, android.os.IBinder> zze;
    private final com.google.android.gms.nearby.messages.internal.ClientAppContext zzf;
    private final int zzg;

    zzai(android.content.Context context, android.os.Looper looper, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener, com.google.android.gms.common.internal.ClientSettings clientSettings, com.google.android.gms.nearby.messages.MessagesOptions messagesOptions) {
        super(context, looper, 62, clientSettings, connectionCallbacks, onConnectionFailedListener);
        this.zze = new com.google.android.gms.internal.nearby.zzhu<>();
        java.lang.String realClientPackageName = clientSettings.getRealClientPackageName();
        int iZzp = zzp(context);
        if (messagesOptions != null) {
            this.zzf = new com.google.android.gms.nearby.messages.internal.ClientAppContext(1, realClientPackageName, null, false, iZzp, null);
            this.zzg = messagesOptions.zzc;
        } else {
            this.zzf = new com.google.android.gms.nearby.messages.internal.ClientAppContext(1, realClientPackageName, null, false, iZzp, null);
            this.zzg = -1;
        }
        if (iZzp == 1 && com.google.android.gms.common.util.PlatformVersion.isAtLeastIceCreamSandwich()) {
            android.app.Activity activity = (android.app.Activity) context;
            if (android.util.Log.isLoggable("NearbyMessagesClient", 2)) {
                android.util.Log.v("NearbyMessagesClient", java.lang.String.format("Registering ClientLifecycleSafetyNet's ActivityLifecycleCallbacks for %s", activity.getPackageName()));
            }
            activity.getApplication().registerActivityLifecycleCallbacks(new com.google.android.gms.nearby.messages.internal.zzah(activity, this, null));
        }
    }

    static int zzp(android.content.Context context) {
        if (context instanceof android.app.Activity) {
            return 1;
        }
        if (context instanceof android.app.Application) {
            return 2;
        }
        return context instanceof android.app.Service ? 3 : 0;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final /* bridge */ /* synthetic */ android.os.IInterface createServiceInterface(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
        return iInterfaceQueryLocalInterface instanceof com.google.android.gms.nearby.messages.internal.zzs ? (com.google.android.gms.nearby.messages.internal.zzs) iInterfaceQueryLocalInterface : new com.google.android.gms.nearby.messages.internal.zzs(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final void disconnect() {
        try {
            zzB(2);
        } catch (android.os.RemoteException e) {
            if (android.util.Log.isLoggable("NearbyMessagesClient", 2)) {
                android.util.Log.v("NearbyMessagesClient", java.lang.String.format("Failed to emit CLIENT_DISCONNECTED from override of GmsClient#disconnect(): %s", e));
            }
        }
        this.zze.zze();
        super.disconnect();
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final android.os.Bundle getGetServiceRequestExtraArgs() {
        android.os.Bundle getServiceRequestExtraArgs = super.getGetServiceRequestExtraArgs();
        getServiceRequestExtraArgs.putInt("NearbyPermissions", this.zzg);
        getServiceRequestExtraArgs.putParcelable("ClientAppContext", this.zzf);
        return getServiceRequestExtraArgs;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final java.lang.String getServiceDescriptor() {
        return "com.google.android.gms.nearby.messages.internal.INearbyMessagesService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final java.lang.String getStartServiceAction() {
        return "com.google.android.gms.nearby.messages.service.NearbyMessagesService.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final boolean requiresGooglePlayServices() {
        return com.google.android.gms.nearby.Nearby.zza(getContext());
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean usesClientTelemetry() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final void zzA(com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.common.api.Status>> listenerHolder, com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.nearby.messages.StatusCallback> listenerHolder2) throws android.os.RemoteException {
        com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey<com.google.android.gms.nearby.messages.StatusCallback> listenerKey = listenerHolder2.getListenerKey();
        if (listenerKey == null) {
            return;
        }
        com.google.android.gms.internal.nearby.zzhq zzhqVar = new com.google.android.gms.internal.nearby.zzhq(listenerHolder);
        if (!this.zze.zza(listenerKey)) {
            zzhqVar.zzd(new com.google.android.gms.common.api.Status(0));
            return;
        }
        com.google.android.gms.nearby.messages.internal.zzca zzcaVar = new com.google.android.gms.nearby.messages.internal.zzca(zzhqVar, this.zze.zzc(listenerKey));
        zzcaVar.zzd = false;
        ((com.google.android.gms.nearby.messages.internal.zzs) getService()).zzi(zzcaVar);
        this.zze.zzd(listenerKey);
    }

    /* JADX WARN: Multi-variable type inference failed */
    final void zzB(int i) throws android.os.RemoteException {
        java.lang.String str = i != 1 ? "CLIENT_DISCONNECTED" : "ACTIVITY_STOPPED";
        if (!isConnected()) {
            if (android.util.Log.isLoggable("NearbyMessagesClient", 3)) {
                android.util.Log.d("NearbyMessagesClient", java.lang.String.format("Failed to emit client lifecycle event %s due to GmsClient being disconnected", str));
            }
        } else {
            com.google.android.gms.nearby.messages.internal.zzj zzjVar = new com.google.android.gms.nearby.messages.internal.zzj(1, null, i);
            if (android.util.Log.isLoggable("NearbyMessagesClient", 3)) {
                android.util.Log.d("NearbyMessagesClient", java.lang.String.format("Emitting client lifecycle event %s", str));
            }
            ((com.google.android.gms.nearby.messages.internal.zzs) getService()).zzj(zzjVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    final void zzq(com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.common.api.Status>> listenerHolder, com.google.android.gms.nearby.messages.internal.zzae zzaeVar, com.google.android.gms.nearby.messages.internal.zzu zzuVar, com.google.android.gms.nearby.messages.PublishOptions publishOptions, int i) throws android.os.RemoteException {
        ((com.google.android.gms.nearby.messages.internal.zzs) getService()).zzd(new com.google.android.gms.nearby.messages.internal.zzby(2, zzaeVar, publishOptions.getStrategy(), new com.google.android.gms.internal.nearby.zzhq(listenerHolder), null, null, false, zzuVar, false, null, i));
    }

    @java.lang.Deprecated
    final void zzr(com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.common.api.Status>> listenerHolder, com.google.android.gms.nearby.messages.internal.zzae zzaeVar, com.google.android.gms.nearby.messages.internal.zzu zzuVar, com.google.android.gms.nearby.messages.PublishOptions publishOptions) throws android.os.RemoteException {
        zzq(listenerHolder, zzaeVar, zzuVar, publishOptions, this.zzf.zze);
    }

    /* JADX WARN: Multi-variable type inference failed */
    final void zzs(com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.common.api.Status>> listenerHolder, com.google.android.gms.nearby.messages.internal.zzae zzaeVar) throws android.os.RemoteException {
        ((com.google.android.gms.nearby.messages.internal.zzs) getService()).zze(new com.google.android.gms.nearby.messages.internal.zzcd(1, zzaeVar, new com.google.android.gms.internal.nearby.zzhq(listenerHolder), null, null, false, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    final void zzt(com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.common.api.Status>> listenerHolder, com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.nearby.messages.MessageListener> listenerHolder2, com.google.android.gms.nearby.messages.internal.zzaa zzaaVar, com.google.android.gms.nearby.messages.SubscribeOptions subscribeOptions, byte[] bArr, int i) throws android.os.RemoteException {
        com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey<com.google.android.gms.nearby.messages.MessageListener> listenerKey = listenerHolder2.getListenerKey();
        if (listenerKey == null) {
            return;
        }
        if (!this.zze.zza(listenerKey)) {
            this.zze.zzb(listenerKey, new com.google.android.gms.internal.nearby.zzho(listenerHolder2));
        }
        android.os.IBinder iBinderZzc = this.zze.zzc(listenerKey);
        com.google.android.gms.nearby.messages.Strategy strategy = subscribeOptions.getStrategy();
        com.google.android.gms.internal.nearby.zzhq zzhqVar = new com.google.android.gms.internal.nearby.zzhq(listenerHolder);
        com.google.android.gms.nearby.messages.MessageFilter filter = subscribeOptions.getFilter();
        boolean z = subscribeOptions.zza;
        ((com.google.android.gms.nearby.messages.internal.zzs) getService()).zzf(new com.google.android.gms.nearby.messages.internal.SubscribeRequest(iBinderZzc, strategy, zzhqVar, filter, null, null, zzaaVar, false, 0, i));
    }

    @java.lang.Deprecated
    final void zzu(com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.common.api.Status>> listenerHolder, com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.nearby.messages.MessageListener> listenerHolder2, com.google.android.gms.nearby.messages.internal.zzaa zzaaVar, com.google.android.gms.nearby.messages.SubscribeOptions subscribeOptions, byte[] bArr) throws android.os.RemoteException {
        zzt(listenerHolder, listenerHolder2, zzaaVar, subscribeOptions, null, this.zzf.zze);
    }

    /* JADX WARN: Multi-variable type inference failed */
    final void zzv(com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.common.api.Status>> listenerHolder, android.app.PendingIntent pendingIntent, com.google.android.gms.nearby.messages.internal.zzaa zzaaVar, com.google.android.gms.nearby.messages.SubscribeOptions subscribeOptions, int i) throws android.os.RemoteException {
        com.google.android.gms.nearby.messages.Strategy strategy = subscribeOptions.getStrategy();
        com.google.android.gms.internal.nearby.zzhq zzhqVar = new com.google.android.gms.internal.nearby.zzhq(listenerHolder);
        com.google.android.gms.nearby.messages.MessageFilter filter = subscribeOptions.getFilter();
        boolean z = subscribeOptions.zza;
        int i2 = subscribeOptions.zzb;
        ((com.google.android.gms.nearby.messages.internal.zzs) getService()).zzf(new com.google.android.gms.nearby.messages.internal.SubscribeRequest(null, strategy, zzhqVar, filter, pendingIntent, null, zzaaVar, false, 0, this.zzf.zze));
    }

    @java.lang.Deprecated
    final void zzw(com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.common.api.Status>> listenerHolder, android.app.PendingIntent pendingIntent, com.google.android.gms.nearby.messages.internal.zzaa zzaaVar, com.google.android.gms.nearby.messages.SubscribeOptions subscribeOptions) throws android.os.RemoteException {
        zzv(listenerHolder, pendingIntent, zzaaVar, subscribeOptions, this.zzf.zze);
    }

    /* JADX WARN: Multi-variable type inference failed */
    final void zzx(com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.common.api.Status>> listenerHolder, com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.nearby.messages.MessageListener> listenerHolder2) throws android.os.RemoteException {
        com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey<com.google.android.gms.nearby.messages.MessageListener> listenerKey = listenerHolder2.getListenerKey();
        if (listenerKey == null) {
            return;
        }
        com.google.android.gms.internal.nearby.zzhq zzhqVar = new com.google.android.gms.internal.nearby.zzhq(listenerHolder);
        if (!this.zze.zza(listenerKey)) {
            zzhqVar.zzd(new com.google.android.gms.common.api.Status(0));
            return;
        }
        ((com.google.android.gms.nearby.messages.internal.zzs) getService()).zzg(new com.google.android.gms.nearby.messages.internal.zzcf(this.zze.zzc(listenerKey), zzhqVar, null));
        this.zze.zzd(listenerKey);
    }

    /* JADX WARN: Multi-variable type inference failed */
    final void zzy(com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.common.api.Status>> listenerHolder, android.app.PendingIntent pendingIntent) throws android.os.RemoteException {
        ((com.google.android.gms.nearby.messages.internal.zzs) getService()).zzg(new com.google.android.gms.nearby.messages.internal.zzcf(null, new com.google.android.gms.internal.nearby.zzhq(listenerHolder), pendingIntent));
    }

    /* JADX WARN: Multi-variable type inference failed */
    final void zzz(com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.common.api.Status>> listenerHolder, com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.nearby.messages.StatusCallback> listenerHolder2) throws android.os.RemoteException {
        com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey<com.google.android.gms.nearby.messages.StatusCallback> listenerKey = listenerHolder2.getListenerKey();
        if (listenerKey == null) {
            return;
        }
        if (!this.zze.zza(listenerKey)) {
            this.zze.zzb(listenerKey, new com.google.android.gms.internal.nearby.zzht(listenerHolder2));
        }
        com.google.android.gms.nearby.messages.internal.zzca zzcaVar = new com.google.android.gms.nearby.messages.internal.zzca(new com.google.android.gms.internal.nearby.zzhq(listenerHolder), this.zze.zzc(listenerKey));
        zzcaVar.zzd = true;
        ((com.google.android.gms.nearby.messages.internal.zzs) getService()).zzi(zzcaVar);
    }
}
