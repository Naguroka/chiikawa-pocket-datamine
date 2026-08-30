package com.google.android.gms.internal.nearby;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzbf extends com.google.android.gms.common.internal.GmsClient<com.google.android.gms.internal.nearby.zzeh> {
    private final long zze;
    private final java.util.Set<com.google.android.gms.internal.nearby.zzap> zzf;
    private final java.util.Set<com.google.android.gms.internal.nearby.zzbb> zzg;
    private final java.util.Set<com.google.android.gms.internal.nearby.zzag> zzh;
    private com.google.android.gms.internal.nearby.zzfx zzi;

    public zzbf(android.content.Context context, android.os.Looper looper, com.google.android.gms.common.internal.ClientSettings clientSettings, com.google.android.gms.nearby.connection.ConnectionsOptions connectionsOptions, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 54, clientSettings, connectionCallbacks, onConnectionFailedListener);
        this.zzf = new androidx.collection.ArraySet();
        this.zzg = new androidx.collection.ArraySet();
        this.zzh = new androidx.collection.ArraySet();
        this.zze = hashCode();
        com.google.android.gms.internal.nearby.zzgf.zzb(context.getCacheDir());
    }

    private final void zzF() {
        java.util.Iterator<com.google.android.gms.internal.nearby.zzap> it = this.zzf.iterator();
        while (it.hasNext()) {
            it.next().zze();
        }
        java.util.Iterator<com.google.android.gms.internal.nearby.zzbb> it2 = this.zzg.iterator();
        while (it2.hasNext()) {
            it2.next().zzd();
        }
        java.util.Iterator<com.google.android.gms.internal.nearby.zzag> it3 = this.zzh.iterator();
        while (it3.hasNext()) {
            it3.next().zzf();
        }
        this.zzf.clear();
        this.zzg.clear();
        this.zzh.clear();
        com.google.android.gms.internal.nearby.zzfx zzfxVar = this.zzi;
        if (zzfxVar != null) {
            zzfxVar.zzc();
            this.zzi = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.android.gms.common.api.Status zzG(int i) {
        return new com.google.android.gms.common.api.Status(i, com.google.android.gms.nearby.connection.ConnectionsStatusCodes.getStatusCodeString(i));
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final /* bridge */ /* synthetic */ android.os.IInterface createServiceInterface(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
        return iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.nearby.zzeh ? (com.google.android.gms.internal.nearby.zzeh) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.nearby.zzeh(iBinder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final void disconnect() {
        if (isConnected()) {
            try {
                ((com.google.android.gms.internal.nearby.zzeh) getService()).zzn(new com.google.android.gms.internal.nearby.zzx());
            } catch (android.os.RemoteException e) {
                android.util.Log.w("NearbyConnectionsClient", "Failed to notify client disconnect.", e);
            }
        }
        zzF();
        super.disconnect();
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final com.google.android.gms.common.Feature[] getApiFeatures() {
        return new com.google.android.gms.common.Feature[]{com.google.android.gms.nearby.zza.zze, com.google.android.gms.nearby.zza.zzr};
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final android.os.Bundle getGetServiceRequestExtraArgs() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putLong("clientId", this.zze);
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final java.lang.String getServiceDescriptor() {
        return "com.google.android.gms.nearby.internal.connection.INearbyConnectionService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final java.lang.String getStartServiceAction() {
        return "com.google.android.gms.nearby.connection.service.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final /* bridge */ /* synthetic */ void onConnectedLocked(android.os.IInterface iInterface) {
        super.onConnectedLocked((com.google.android.gms.internal.nearby.zzeh) iInterface);
        this.zzi = new com.google.android.gms.internal.nearby.zzfx();
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final void onConnectionSuspended(int i) {
        if (i == 1) {
            zzF();
            i = 1;
        }
        super.onConnectionSuspended(i);
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
    public final void zzA(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.common.api.Status> resultHolder, java.lang.String[] strArr, com.google.android.gms.nearby.connection.Payload payload, boolean z) throws android.os.RemoteException {
        android.util.Pair pairCreate;
        try {
            int type = payload.getType();
            if (type == 1) {
                com.google.android.gms.internal.nearby.zzgc zzgcVar = new com.google.android.gms.internal.nearby.zzgc();
                zzgcVar.zza(payload.getId());
                zzgcVar.zzb(payload.getType());
                zzgcVar.zzc(payload.asBytes());
                pairCreate = android.util.Pair.create(zzgcVar.zzj(), com.google.android.gms.internal.nearby.zzhy.zzc());
            } else if (type == 2) {
                com.google.android.gms.nearby.connection.Payload.File fileAsFile = payload.asFile();
                com.google.android.gms.internal.nearby.zzhz.zza(fileAsFile, "File cannot be null for Payload.Type.FILE");
                java.io.File fileAsJavaFile = fileAsFile.asJavaFile();
                java.lang.String absolutePath = fileAsJavaFile == null ? null : fileAsJavaFile.getAbsolutePath();
                com.google.android.gms.internal.nearby.zzgc zzgcVar2 = new com.google.android.gms.internal.nearby.zzgc();
                zzgcVar2.zza(payload.getId());
                zzgcVar2.zzb(payload.getType());
                zzgcVar2.zzd(fileAsFile.asParcelFileDescriptor());
                zzgcVar2.zze(absolutePath);
                zzgcVar2.zzf(fileAsFile.getSize());
                zzgcVar2.zzh(payload.getOffset());
                zzgcVar2.zzi(payload.zzd());
                pairCreate = android.util.Pair.create(zzgcVar2.zzj(), com.google.android.gms.internal.nearby.zzhy.zzc());
            } else {
                if (type != 3) {
                    java.lang.IllegalArgumentException illegalArgumentException = new java.lang.IllegalArgumentException(java.lang.String.format("Outgoing Payload %d has unknown type %d", java.lang.Long.valueOf(payload.getId()), java.lang.Integer.valueOf(payload.getType())));
                    android.util.Log.wtf("NearbyConnections", "Unknown payload type!", illegalArgumentException);
                    throw illegalArgumentException;
                }
                try {
                    android.os.ParcelFileDescriptor[] parcelFileDescriptorArrCreatePipe = android.os.ParcelFileDescriptor.createPipe();
                    android.os.ParcelFileDescriptor[] parcelFileDescriptorArrCreatePipe2 = android.os.ParcelFileDescriptor.createPipe();
                    com.google.android.gms.internal.nearby.zzgc zzgcVar3 = new com.google.android.gms.internal.nearby.zzgc();
                    zzgcVar3.zza(payload.getId());
                    zzgcVar3.zzb(payload.getType());
                    zzgcVar3.zzd(parcelFileDescriptorArrCreatePipe[0]);
                    zzgcVar3.zzg(parcelFileDescriptorArrCreatePipe2[0]);
                    zzgcVar3.zzh(payload.getOffset());
                    pairCreate = android.util.Pair.create(zzgcVar3.zzj(), com.google.android.gms.internal.nearby.zzhy.zzd(android.util.Pair.create(parcelFileDescriptorArrCreatePipe[1], parcelFileDescriptorArrCreatePipe2[1])));
                } catch (java.io.IOException e) {
                    android.util.Log.e("NearbyConnections", java.lang.String.format("Unable to create PFD pipe for streaming payload %d from client to service.", java.lang.Long.valueOf(payload.getId())), e);
                    throw e;
                }
            }
            com.google.android.gms.internal.nearby.zzeh zzehVar = (com.google.android.gms.internal.nearby.zzeh) getService();
            com.google.android.gms.internal.nearby.zzgp zzgpVar = new com.google.android.gms.internal.nearby.zzgp();
            zzgpVar.zza(new com.google.android.gms.internal.nearby.zzbc(resultHolder));
            zzgpVar.zzb(strArr);
            zzgpVar.zzc((com.google.android.gms.internal.nearby.zzgd) pairCreate.first);
            zzehVar.zzk(zzgpVar.zzd());
            if (((com.google.android.gms.internal.nearby.zzhy) pairCreate.second).zza()) {
                android.util.Pair pair = (android.util.Pair) ((com.google.android.gms.internal.nearby.zzhy) pairCreate.second).zzb();
                this.zzi.zza(payload.asStream().asInputStream(), new android.os.ParcelFileDescriptor.AutoCloseOutputStream((android.os.ParcelFileDescriptor) pair.first), new android.os.ParcelFileDescriptor.AutoCloseOutputStream((android.os.ParcelFileDescriptor) pair.second), (com.google.android.gms.internal.nearby.zzgd) pairCreate.first, payload.getId());
            }
        } catch (java.io.IOException e2) {
            android.util.Log.w("NearbyConnectionsClient", "Failed to create a Parcelable Payload.", e2);
            resultHolder.setResult(zzG(com.google.android.gms.nearby.connection.ConnectionsStatusCodes.STATUS_PAYLOAD_IO_ERROR));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzB(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.common.api.Status> resultHolder, long j) throws android.os.RemoteException {
        com.google.android.gms.internal.nearby.zzeh zzehVar = (com.google.android.gms.internal.nearby.zzeh) getService();
        com.google.android.gms.internal.nearby.zzu zzuVar = new com.google.android.gms.internal.nearby.zzu();
        zzuVar.zza(new com.google.android.gms.internal.nearby.zzbc(resultHolder));
        zzuVar.zzb(j);
        zzehVar.zzo(zzuVar.zzc());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzC(java.lang.String str) throws android.os.RemoteException {
        com.google.android.gms.internal.nearby.zzeh zzehVar = (com.google.android.gms.internal.nearby.zzeh) getService();
        com.google.android.gms.internal.nearby.zzdo zzdoVar = new com.google.android.gms.internal.nearby.zzdo();
        zzdoVar.zza(str);
        zzehVar.zzl(zzdoVar.zzb());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzD() throws android.os.RemoteException {
        ((com.google.android.gms.internal.nearby.zzeh) getService()).zzm(new com.google.android.gms.internal.nearby.zzhc());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzp(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.common.api.Status> resultHolder, java.lang.String str, java.lang.String str2, com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.nearby.connection.ConnectionLifecycleCallback> listenerHolder, com.google.android.gms.nearby.connection.ConnectionOptions connectionOptions) throws android.os.RemoteException {
        com.google.android.gms.internal.nearby.zzag zzagVar = new com.google.android.gms.internal.nearby.zzag(listenerHolder);
        this.zzh.add(zzagVar);
        com.google.android.gms.internal.nearby.zzeh zzehVar = (com.google.android.gms.internal.nearby.zzeh) getService();
        com.google.android.gms.internal.nearby.zzgl zzglVar = new com.google.android.gms.internal.nearby.zzgl();
        zzglVar.zza(new com.google.android.gms.internal.nearby.zzbc(resultHolder));
        zzglVar.zzd(str);
        zzglVar.zze(str2);
        zzglVar.zzg(zzagVar);
        zzglVar.zzi(connectionOptions);
        zzehVar.zzh(zzglVar.zzj());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzq(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.common.api.Status> resultHolder, byte[] bArr, java.lang.String str, com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.nearby.connection.ConnectionLifecycleCallback> listenerHolder, com.google.android.gms.nearby.connection.ConnectionOptions connectionOptions) throws android.os.RemoteException {
        com.google.android.gms.internal.nearby.zzag zzagVar = new com.google.android.gms.internal.nearby.zzag(listenerHolder);
        this.zzh.add(zzagVar);
        com.google.android.gms.internal.nearby.zzeh zzehVar = (com.google.android.gms.internal.nearby.zzeh) getService();
        com.google.android.gms.internal.nearby.zzgl zzglVar = new com.google.android.gms.internal.nearby.zzgl();
        zzglVar.zza(new com.google.android.gms.internal.nearby.zzbc(resultHolder));
        zzglVar.zzh(bArr);
        zzglVar.zze(str);
        zzglVar.zzg(zzagVar);
        zzglVar.zzi(connectionOptions);
        zzehVar.zzh(zzglVar.zzj());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzr(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.nearby.connection.Connections.StartAdvertisingResult> resultHolder, byte[] bArr, java.lang.String str, com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.nearby.connection.ConnectionLifecycleCallback> listenerHolder, com.google.android.gms.nearby.connection.AdvertisingOptions advertisingOptions) throws android.os.RemoteException {
        com.google.android.gms.internal.nearby.zzag zzagVar = new com.google.android.gms.internal.nearby.zzag(listenerHolder);
        this.zzh.add(zzagVar);
        com.google.android.gms.internal.nearby.zzeh zzehVar = (com.google.android.gms.internal.nearby.zzeh) getService();
        com.google.android.gms.internal.nearby.zzgt zzgtVar = new com.google.android.gms.internal.nearby.zzgt();
        zzgtVar.zza(new com.google.android.gms.internal.nearby.zzbe(resultHolder));
        zzgtVar.zzh(bArr);
        zzgtVar.zzd(str);
        zzgtVar.zzf(advertisingOptions);
        zzgtVar.zzg(zzagVar);
        zzehVar.zzd(zzgtVar.zzi());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzs(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.common.api.Status> resultHolder, byte[] bArr, java.lang.String str, com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.nearby.connection.ConnectionLifecycleCallback> listenerHolder) throws android.os.RemoteException {
        com.google.android.gms.internal.nearby.zzag zzagVar = new com.google.android.gms.internal.nearby.zzag(listenerHolder);
        this.zzh.add(zzagVar);
        com.google.android.gms.internal.nearby.zzeh zzehVar = (com.google.android.gms.internal.nearby.zzeh) getService();
        com.google.android.gms.internal.nearby.zzgl zzglVar = new com.google.android.gms.internal.nearby.zzgl();
        zzglVar.zza(new com.google.android.gms.internal.nearby.zzbc(resultHolder));
        zzglVar.zzh(bArr);
        zzglVar.zze(str);
        zzglVar.zzg(zzagVar);
        zzehVar.zzh(zzglVar.zzj());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzt(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.nearby.connection.Connections.StartAdvertisingResult> resultHolder, java.lang.String str, java.lang.String str2, com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.nearby.connection.ConnectionLifecycleCallback> listenerHolder, com.google.android.gms.nearby.connection.AdvertisingOptions advertisingOptions) throws android.os.RemoteException {
        com.google.android.gms.internal.nearby.zzag zzagVar = new com.google.android.gms.internal.nearby.zzag(listenerHolder);
        this.zzh.add(zzagVar);
        com.google.android.gms.internal.nearby.zzeh zzehVar = (com.google.android.gms.internal.nearby.zzeh) getService();
        com.google.android.gms.internal.nearby.zzgt zzgtVar = new com.google.android.gms.internal.nearby.zzgt();
        zzgtVar.zza(new com.google.android.gms.internal.nearby.zzbe(resultHolder));
        zzgtVar.zzc(str);
        zzgtVar.zzd(str2);
        zzgtVar.zzf(advertisingOptions);
        zzgtVar.zzg(zzagVar);
        zzehVar.zzd(zzgtVar.zzi());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzu() throws android.os.RemoteException {
        ((com.google.android.gms.internal.nearby.zzeh) getService()).zze(new com.google.android.gms.internal.nearby.zzha());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzv(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.common.api.Status> resultHolder, java.lang.String str, com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.nearby.connection.EndpointDiscoveryCallback> listenerHolder, com.google.android.gms.nearby.connection.DiscoveryOptions discoveryOptions) throws android.os.RemoteException {
        com.google.android.gms.internal.nearby.zzap zzapVar = new com.google.android.gms.internal.nearby.zzap(listenerHolder);
        this.zzf.add(zzapVar);
        com.google.android.gms.internal.nearby.zzeh zzehVar = (com.google.android.gms.internal.nearby.zzeh) getService();
        com.google.android.gms.internal.nearby.zzgx zzgxVar = new com.google.android.gms.internal.nearby.zzgx();
        zzgxVar.zza(new com.google.android.gms.internal.nearby.zzbc(resultHolder));
        zzgxVar.zzb(str);
        zzgxVar.zzd(discoveryOptions);
        zzgxVar.zze(zzapVar);
        zzehVar.zzf(zzgxVar.zzf());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzw() throws android.os.RemoteException {
        ((com.google.android.gms.internal.nearby.zzeh) getService()).zzg(new com.google.android.gms.internal.nearby.zzhe());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzx(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.common.api.Status> resultHolder, java.lang.String str, java.lang.String str2, com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.nearby.connection.ConnectionLifecycleCallback> listenerHolder) throws android.os.RemoteException {
        com.google.android.gms.internal.nearby.zzag zzagVar = new com.google.android.gms.internal.nearby.zzag(listenerHolder);
        this.zzh.add(zzagVar);
        com.google.android.gms.internal.nearby.zzeh zzehVar = (com.google.android.gms.internal.nearby.zzeh) getService();
        com.google.android.gms.internal.nearby.zzgl zzglVar = new com.google.android.gms.internal.nearby.zzgl();
        zzglVar.zza(new com.google.android.gms.internal.nearby.zzbc(resultHolder));
        zzglVar.zzd(str);
        zzglVar.zze(str2);
        zzglVar.zzg(zzagVar);
        zzehVar.zzh(zzglVar.zzj());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzy(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.common.api.Status> resultHolder, java.lang.String str, com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.nearby.connection.PayloadCallback> listenerHolder) throws android.os.RemoteException {
        com.google.android.gms.internal.nearby.zzbb zzbbVar = new com.google.android.gms.internal.nearby.zzbb(getContext(), listenerHolder, this.zzi);
        this.zzg.add(zzbbVar);
        com.google.android.gms.internal.nearby.zzeh zzehVar = (com.google.android.gms.internal.nearby.zzeh) getService();
        com.google.android.gms.internal.nearby.zzq zzqVar = new com.google.android.gms.internal.nearby.zzq();
        zzqVar.zza(new com.google.android.gms.internal.nearby.zzbc(resultHolder));
        zzqVar.zzc(str);
        zzqVar.zze(zzbbVar);
        zzehVar.zzi(zzqVar.zzf());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzz(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.common.api.Status> resultHolder, java.lang.String str) throws android.os.RemoteException {
        com.google.android.gms.internal.nearby.zzeh zzehVar = (com.google.android.gms.internal.nearby.zzeh) getService();
        com.google.android.gms.internal.nearby.zzgh zzghVar = new com.google.android.gms.internal.nearby.zzgh();
        zzghVar.zza(new com.google.android.gms.internal.nearby.zzbc(resultHolder));
        zzghVar.zzb(str);
        zzehVar.zzj(zzghVar.zzc());
    }
}
