package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaw extends com.google.android.gms.common.internal.GmsClient<com.google.android.gms.internal.drive.zzeo> {
    private final java.lang.String zzeb;
    protected final boolean zzec;
    private volatile com.google.android.gms.drive.DriveId zzed;
    private volatile com.google.android.gms.drive.DriveId zzee;
    private volatile boolean zzef;
    private final java.util.Map<com.google.android.gms.drive.DriveId, java.util.Map<com.google.android.gms.drive.events.ChangeListener, com.google.android.gms.internal.drive.zzee>> zzeg;
    private final java.util.Map<com.google.android.gms.drive.events.zzd, com.google.android.gms.internal.drive.zzee> zzeh;
    private final java.util.Map<com.google.android.gms.drive.DriveId, java.util.Map<com.google.android.gms.drive.events.zzl, com.google.android.gms.internal.drive.zzee>> zzei;
    private final java.util.Map<com.google.android.gms.drive.DriveId, java.util.Map<com.google.android.gms.drive.events.zzl, com.google.android.gms.internal.drive.zzee>> zzej;
    private final android.os.Bundle zzz;

    public zzaw(android.content.Context context, android.os.Looper looper, com.google.android.gms.common.internal.ClientSettings clientSettings, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener, android.os.Bundle bundle) {
        super(context, looper, 11, clientSettings, connectionCallbacks, onConnectionFailedListener);
        this.zzef = false;
        this.zzeg = new java.util.HashMap();
        this.zzeh = new java.util.HashMap();
        this.zzei = new java.util.HashMap();
        this.zzej = new java.util.HashMap();
        this.zzeb = clientSettings.getRealClientPackageName();
        this.zzz = bundle;
        android.content.Intent intent = new android.content.Intent(com.google.android.gms.drive.events.DriveEventService.ACTION_HANDLE_EVENT);
        intent.setPackage(context.getPackageName());
        java.util.List<android.content.pm.ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
        int size = listQueryIntentServices.size();
        if (size == 0) {
            this.zzec = false;
            return;
        }
        if (size != 1) {
            java.lang.String action = intent.getAction();
            throw new java.lang.IllegalStateException(new java.lang.StringBuilder(java.lang.String.valueOf(action).length() + 72).append("AndroidManifest.xml can only define one service that handles the ").append(action).append(" action").toString());
        }
        android.content.pm.ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
        if (serviceInfo.exported) {
            this.zzec = true;
        } else {
            java.lang.String str = serviceInfo.name;
            throw new java.lang.IllegalStateException(new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 60).append("Drive event service ").append(str).append(" must be exported in AndroidManifest.xml").toString());
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final java.lang.String getServiceDescriptor() {
        return "com.google.android.gms.drive.internal.IDriveService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final java.lang.String getStartServiceAction() {
        return "com.google.android.gms.drive.ApiService.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final boolean requiresAccount() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final boolean requiresSignIn() {
        return (getContext().getPackageName().equals(this.zzeb) && com.google.android.gms.common.util.UidVerifier.isGooglePlayServicesUid(getContext(), android.os.Process.myUid())) ? false : true;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final android.os.Bundle getGetServiceRequestExtraArgs() {
        java.lang.String packageName = getContext().getPackageName();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(packageName);
        com.google.android.gms.common.internal.Preconditions.checkState(!getClientSettings().getAllRequestedScopes().isEmpty());
        android.os.Bundle bundle = new android.os.Bundle();
        if (!packageName.equals(this.zzeb)) {
            bundle.putString("proxy_package_name", this.zzeb);
        }
        bundle.putAll(this.zzz);
        return bundle;
    }

    public final com.google.android.gms.drive.DriveId zzae() {
        return this.zzed;
    }

    public final com.google.android.gms.drive.DriveId zzaf() {
        return this.zzee;
    }

    public final boolean zzag() {
        return this.zzef;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final void disconnect() {
        if (isConnected()) {
            try {
                ((com.google.android.gms.internal.drive.zzeo) getService()).zza(new com.google.android.gms.internal.drive.zzad());
            } catch (android.os.RemoteException unused) {
            }
        }
        super.disconnect();
        synchronized (this.zzeg) {
            this.zzeg.clear();
        }
        synchronized (this.zzeh) {
            this.zzeh.clear();
        }
        synchronized (this.zzei) {
            this.zzei.clear();
        }
        synchronized (this.zzej) {
            this.zzej.clear();
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final void onPostInitHandler(int i, android.os.IBinder iBinder, android.os.Bundle bundle, int i2) {
        if (bundle != null) {
            bundle.setClassLoader(getClass().getClassLoader());
            this.zzed = (com.google.android.gms.drive.DriveId) bundle.getParcelable("com.google.android.gms.drive.root_id");
            this.zzee = (com.google.android.gms.drive.DriveId) bundle.getParcelable("com.google.android.gms.drive.appdata_id");
            this.zzef = true;
        }
        super.onPostInitHandler(i, iBinder, bundle, i2);
    }

    public final boolean zzah() {
        return this.zzec;
    }

    final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> zza(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.drive.DriveId driveId, com.google.android.gms.drive.events.ChangeListener changeListener) {
        com.google.android.gms.common.internal.Preconditions.checkArgument(com.google.android.gms.drive.events.zzj.zza(1, driveId));
        com.google.android.gms.common.internal.Preconditions.checkNotNull(changeListener, com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        com.google.android.gms.common.internal.Preconditions.checkState(isConnected(), "Client must be connected");
        synchronized (this.zzeg) {
            java.util.Map<com.google.android.gms.drive.events.ChangeListener, com.google.android.gms.internal.drive.zzee> map = this.zzeg.get(driveId);
            if (map == null) {
                map = new java.util.HashMap<>();
                this.zzeg.put(driveId, map);
            }
            com.google.android.gms.internal.drive.zzee zzeeVar = map.get(changeListener);
            if (zzeeVar == null) {
                zzeeVar = new com.google.android.gms.internal.drive.zzee(getLooper(), getContext(), 1, changeListener);
                map.put(changeListener, zzeeVar);
            } else if (zzeeVar.zzg(1)) {
                return new com.google.android.gms.internal.drive.zzat(googleApiClient, com.google.android.gms.common.api.Status.RESULT_SUCCESS);
            }
            zzeeVar.zzf(1);
            return googleApiClient.execute(new com.google.android.gms.internal.drive.zzax(this, googleApiClient, new com.google.android.gms.internal.drive.zzj(1, driveId), zzeeVar));
        }
    }

    final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> zzb(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.drive.DriveId driveId, com.google.android.gms.drive.events.ChangeListener changeListener) {
        com.google.android.gms.common.internal.Preconditions.checkArgument(com.google.android.gms.drive.events.zzj.zza(1, driveId));
        com.google.android.gms.common.internal.Preconditions.checkState(isConnected(), "Client must be connected");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(changeListener, com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        synchronized (this.zzeg) {
            java.util.Map<com.google.android.gms.drive.events.ChangeListener, com.google.android.gms.internal.drive.zzee> map = this.zzeg.get(driveId);
            if (map == null) {
                return new com.google.android.gms.internal.drive.zzat(googleApiClient, com.google.android.gms.common.api.Status.RESULT_SUCCESS);
            }
            com.google.android.gms.internal.drive.zzee zzeeVarRemove = map.remove(changeListener);
            if (zzeeVarRemove == null) {
                return new com.google.android.gms.internal.drive.zzat(googleApiClient, com.google.android.gms.common.api.Status.RESULT_SUCCESS);
            }
            if (map.isEmpty()) {
                this.zzeg.remove(driveId);
            }
            return googleApiClient.execute(new com.google.android.gms.internal.drive.zzay(this, googleApiClient, new com.google.android.gms.internal.drive.zzgs(driveId, 1), zzeeVarRemove));
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final /* synthetic */ android.os.IInterface createServiceInterface(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.drive.internal.IDriveService");
        if (iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.drive.zzeo) {
            return (com.google.android.gms.internal.drive.zzeo) iInterfaceQueryLocalInterface;
        }
        return new com.google.android.gms.internal.drive.zzep(iBinder);
    }
}
