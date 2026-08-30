package com.google.android.gms.internal.nearby;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzcn extends com.google.android.gms.common.api.GoogleApi<com.google.android.gms.nearby.connection.ConnectionsOptions> implements com.google.android.gms.nearby.connection.ConnectionsClient {
    public static final /* synthetic */ int zza = 0;
    private static final com.google.android.gms.common.api.Api.ClientKey<com.google.android.gms.internal.nearby.zzbf> zzb;
    private static final com.google.android.gms.common.api.Api.AbstractClientBuilder<com.google.android.gms.internal.nearby.zzbf, com.google.android.gms.nearby.connection.ConnectionsOptions> zzc;
    private static final com.google.android.gms.common.api.Api<com.google.android.gms.nearby.connection.ConnectionsOptions> zzd;
    private final com.google.android.gms.internal.nearby.zzo zze;
    private final com.google.android.gms.internal.nearby.zzet zzf;

    static {
        com.google.android.gms.common.api.Api.ClientKey<com.google.android.gms.internal.nearby.zzbf> clientKey = new com.google.android.gms.common.api.Api.ClientKey<>();
        zzb = clientKey;
        com.google.android.gms.internal.nearby.zzce zzceVar = new com.google.android.gms.internal.nearby.zzce();
        zzc = zzceVar;
        zzd = new com.google.android.gms.common.api.Api<>("Nearby.CONNECTIONS_API", zzceVar, clientKey);
    }

    public zzcn(android.app.Activity activity, com.google.android.gms.nearby.connection.ConnectionsOptions connectionsOptions) {
        super(activity, (com.google.android.gms.common.api.Api<com.google.android.gms.common.api.Api.ApiOptions>) zzd, (com.google.android.gms.common.api.Api.ApiOptions) null, com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS);
        this.zze = com.google.android.gms.internal.nearby.zzo.zza(this, null);
        this.zzf = com.google.android.gms.internal.nearby.zzet.zza(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzf(java.lang.String str) {
        this.zze.zze(this, com.google.android.gms.common.api.internal.RegistrationMethods.builder().withHolder(this.zze.zzc(this, str, "connection")).register(com.google.android.gms.internal.nearby.zzbt.zza).unregister(com.google.android.gms.internal.nearby.zzbu.zza).setMethodKey(1268).build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzg(java.lang.String str) {
        com.google.android.gms.internal.nearby.zzo zzoVar = this.zze;
        zzoVar.zzf(this, zzoVar.zzd(str, "connection"));
    }

    private final com.google.android.gms.tasks.Task<java.lang.Void> zzh(final com.google.android.gms.internal.nearby.zzcj zzcjVar) {
        return doWrite(com.google.android.gms.common.api.internal.TaskApiCall.builder().setMethodKey(1229).run(new com.google.android.gms.common.api.internal.RemoteCall(this, zzcjVar) { // from class: com.google.android.gms.internal.nearby.zzbv
            private final com.google.android.gms.internal.nearby.zzcn zza;
            private final com.google.android.gms.internal.nearby.zzcj zzb;

            {
                this.zza = this;
                this.zzb = zzcjVar;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(java.lang.Object obj, java.lang.Object obj2) throws android.os.RemoteException {
                this.zzb.zza((com.google.android.gms.internal.nearby.zzbf) obj, new com.google.android.gms.internal.nearby.zzcl(this.zza, (com.google.android.gms.tasks.TaskCompletionSource) obj2));
            }
        }).build());
    }

    private final com.google.android.gms.tasks.Task<java.lang.Void> zzi(final com.google.android.gms.internal.nearby.zzcm zzcmVar) {
        return doWrite(com.google.android.gms.common.api.internal.TaskApiCall.builder().setMethodKey(1229).run(new com.google.android.gms.common.api.internal.RemoteCall(zzcmVar) { // from class: com.google.android.gms.internal.nearby.zzbw
            private final com.google.android.gms.internal.nearby.zzcm zza;

            {
                this.zza = zzcmVar;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(java.lang.Object obj, java.lang.Object obj2) throws android.os.RemoteException {
                int i = com.google.android.gms.internal.nearby.zzcn.zza;
                this.zza.zza((com.google.android.gms.internal.nearby.zzbf) obj);
                ((com.google.android.gms.tasks.TaskCompletionSource) obj2).setResult(null);
            }
        }).build());
    }

    @Override // com.google.android.gms.nearby.connection.ConnectionsClient
    public final com.google.android.gms.tasks.Task<java.lang.Void> acceptConnection(final java.lang.String str, com.google.android.gms.nearby.connection.PayloadCallback payloadCallback) {
        final com.google.android.gms.common.api.internal.ListenerHolder<L> listenerHolderRegisterListener = registerListener(payloadCallback, com.google.android.gms.nearby.connection.PayloadCallback.class.getName());
        return doWrite(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall(this, str, listenerHolderRegisterListener) { // from class: com.google.android.gms.internal.nearby.zzbk
            private final com.google.android.gms.internal.nearby.zzcn zza;
            private final java.lang.String zzb;
            private final com.google.android.gms.common.api.internal.ListenerHolder zzc;

            {
                this.zza = this;
                this.zzb = str;
                this.zzc = listenerHolderRegisterListener;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(java.lang.Object obj, java.lang.Object obj2) throws android.os.RemoteException {
                com.google.android.gms.internal.nearby.zzcn zzcnVar = this.zza;
                ((com.google.android.gms.internal.nearby.zzbf) obj).zzy(new com.google.android.gms.internal.nearby.zzcl(zzcnVar, (com.google.android.gms.tasks.TaskCompletionSource) obj2), this.zzb, this.zzc);
            }
        }).setMethodKey(1227).build());
    }

    @Override // com.google.android.gms.nearby.connection.ConnectionsClient
    public final com.google.android.gms.tasks.Task<java.lang.Void> cancelPayload(final long j) {
        return zzh(new com.google.android.gms.internal.nearby.zzcj(j) { // from class: com.google.android.gms.internal.nearby.zzbo
            private final long zza;

            {
                this.zza = j;
            }

            @Override // com.google.android.gms.internal.nearby.zzcj
            public final void zza(com.google.android.gms.internal.nearby.zzbf zzbfVar, com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultHolder) throws android.os.RemoteException {
                long j2 = this.zza;
                int i = com.google.android.gms.internal.nearby.zzcn.zza;
                zzbfVar.zzB(resultHolder, j2);
            }
        });
    }

    @Override // com.google.android.gms.nearby.connection.ConnectionsClient
    public final void disconnectFromEndpoint(final java.lang.String str) {
        zzi(new com.google.android.gms.internal.nearby.zzcm(str) { // from class: com.google.android.gms.internal.nearby.zzbp
            private final java.lang.String zza;

            {
                this.zza = str;
            }

            @Override // com.google.android.gms.internal.nearby.zzcm
            public final void zza(com.google.android.gms.internal.nearby.zzbf zzbfVar) throws android.os.RemoteException {
                java.lang.String str2 = this.zza;
                int i = com.google.android.gms.internal.nearby.zzcn.zza;
                zzbfVar.zzC(str2);
            }
        });
        zzg(str);
    }

    @Override // com.google.android.gms.nearby.connection.ConnectionsClient
    public final com.google.android.gms.tasks.Task<java.lang.Void> rejectConnection(final java.lang.String str) {
        return zzh(new com.google.android.gms.internal.nearby.zzcj(str) { // from class: com.google.android.gms.internal.nearby.zzbl
            private final java.lang.String zza;

            {
                this.zza = str;
            }

            @Override // com.google.android.gms.internal.nearby.zzcj
            public final void zza(com.google.android.gms.internal.nearby.zzbf zzbfVar, com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultHolder) throws android.os.RemoteException {
                java.lang.String str2 = this.zza;
                int i = com.google.android.gms.internal.nearby.zzcn.zza;
                zzbfVar.zzz(resultHolder, str2);
            }
        });
    }

    @Override // com.google.android.gms.nearby.connection.ConnectionsClient
    public final com.google.android.gms.tasks.Task<java.lang.Void> requestConnection(final java.lang.String str, final java.lang.String str2, com.google.android.gms.nearby.connection.ConnectionLifecycleCallback connectionLifecycleCallback) {
        final com.google.android.gms.common.api.internal.ListenerHolder<L> listenerHolderRegisterListener = registerListener(new com.google.android.gms.internal.nearby.zzck(this, connectionLifecycleCallback), com.google.android.gms.nearby.connection.ConnectionLifecycleCallback.class.getName());
        zzf(str2);
        return doWrite(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall(this, str, str2, listenerHolderRegisterListener) { // from class: com.google.android.gms.internal.nearby.zzbj
            private final com.google.android.gms.internal.nearby.zzcn zza;
            private final java.lang.String zzb;
            private final java.lang.String zzc;
            private final com.google.android.gms.common.api.internal.ListenerHolder zzd;

            {
                this.zza = this;
                this.zzb = str;
                this.zzc = str2;
                this.zzd = listenerHolderRegisterListener;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(java.lang.Object obj, java.lang.Object obj2) throws android.os.RemoteException {
                com.google.android.gms.internal.nearby.zzcn zzcnVar = this.zza;
                ((com.google.android.gms.internal.nearby.zzbf) obj).zzx(new com.google.android.gms.internal.nearby.zzcl(zzcnVar, (com.google.android.gms.tasks.TaskCompletionSource) obj2), this.zzb, this.zzc, this.zzd);
            }
        }).setMethodKey(1226).build()).addOnFailureListener(new com.google.android.gms.internal.nearby.zzci(this, str2));
    }

    @Override // com.google.android.gms.nearby.connection.ConnectionsClient
    public final com.google.android.gms.tasks.Task<java.lang.Void> sendPayload(final java.lang.String str, final com.google.android.gms.nearby.connection.Payload payload) {
        return doWrite(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall(this, str, payload) { // from class: com.google.android.gms.internal.nearby.zzbm
            private final com.google.android.gms.internal.nearby.zzcn zza;
            private final java.lang.String zzb;
            private final com.google.android.gms.nearby.connection.Payload zzc;

            {
                this.zza = this;
                this.zzb = str;
                this.zzc = payload;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(java.lang.Object obj, java.lang.Object obj2) throws android.os.RemoteException {
                com.google.android.gms.internal.nearby.zzcn zzcnVar = this.zza;
                java.lang.String str2 = this.zzb;
                ((com.google.android.gms.internal.nearby.zzbf) obj).zzA(new com.google.android.gms.internal.nearby.zzcl(zzcnVar, (com.google.android.gms.tasks.TaskCompletionSource) obj2), new java.lang.String[]{str2}, this.zzc, false);
            }
        }).setMethodKey(1228).build());
    }

    @Override // com.google.android.gms.nearby.connection.ConnectionsClient
    public final com.google.android.gms.tasks.Task<java.lang.Void> startAdvertising(final java.lang.String str, final java.lang.String str2, com.google.android.gms.nearby.connection.ConnectionLifecycleCallback connectionLifecycleCallback, final com.google.android.gms.nearby.connection.AdvertisingOptions advertisingOptions) {
        final com.google.android.gms.common.api.internal.ListenerHolder<L> listenerHolderRegisterListener = registerListener(new com.google.android.gms.internal.nearby.zzck(this, connectionLifecycleCallback), com.google.android.gms.nearby.connection.ConnectionLifecycleCallback.class.getName());
        return this.zze.zze(this, com.google.android.gms.common.api.internal.RegistrationMethods.builder().withHolder(this.zze.zzb(this, new java.lang.Object(), "advertising")).register(new com.google.android.gms.common.api.internal.RemoteCall(this, str, str2, listenerHolderRegisterListener, advertisingOptions) { // from class: com.google.android.gms.internal.nearby.zzcb
            private final com.google.android.gms.internal.nearby.zzcn zza;
            private final java.lang.String zzb;
            private final java.lang.String zzc;
            private final com.google.android.gms.common.api.internal.ListenerHolder zzd;
            private final com.google.android.gms.nearby.connection.AdvertisingOptions zze;

            {
                this.zza = this;
                this.zzb = str;
                this.zzc = str2;
                this.zzd = listenerHolderRegisterListener;
                this.zze = advertisingOptions;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(java.lang.Object obj, java.lang.Object obj2) throws android.os.RemoteException {
                com.google.android.gms.internal.nearby.zzcn zzcnVar = this.zza;
                ((com.google.android.gms.internal.nearby.zzbf) obj).zzt(new com.google.android.gms.internal.nearby.zzcl(zzcnVar, (com.google.android.gms.tasks.TaskCompletionSource) obj2), this.zzb, this.zzc, this.zzd, this.zze);
            }
        }).unregister(com.google.android.gms.internal.nearby.zzcc.zza).setMethodKey(1266).build());
    }

    @Override // com.google.android.gms.nearby.connection.ConnectionsClient
    public final com.google.android.gms.tasks.Task<java.lang.Void> startDiscovery(final java.lang.String str, com.google.android.gms.nearby.connection.EndpointDiscoveryCallback endpointDiscoveryCallback, final com.google.android.gms.nearby.connection.DiscoveryOptions discoveryOptions) {
        final com.google.android.gms.common.api.internal.ListenerHolder listenerHolderZzb = this.zze.zzb(this, endpointDiscoveryCallback, "discovery");
        return this.zze.zze(this, com.google.android.gms.common.api.internal.RegistrationMethods.builder().withHolder(listenerHolderZzb).register(new com.google.android.gms.common.api.internal.RemoteCall(this, str, listenerHolderZzb, discoveryOptions) { // from class: com.google.android.gms.internal.nearby.zzcd
            private final com.google.android.gms.internal.nearby.zzcn zza;
            private final java.lang.String zzb;
            private final com.google.android.gms.common.api.internal.ListenerHolder zzc;
            private final com.google.android.gms.nearby.connection.DiscoveryOptions zzd;

            {
                this.zza = this;
                this.zzb = str;
                this.zzc = listenerHolderZzb;
                this.zzd = discoveryOptions;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(java.lang.Object obj, java.lang.Object obj2) throws android.os.RemoteException {
                com.google.android.gms.internal.nearby.zzcn zzcnVar = this.zza;
                ((com.google.android.gms.internal.nearby.zzbf) obj).zzv(new com.google.android.gms.internal.nearby.zzcl(zzcnVar, (com.google.android.gms.tasks.TaskCompletionSource) obj2), this.zzb, this.zzc, this.zzd);
            }
        }).unregister(com.google.android.gms.internal.nearby.zzbg.zza).setMethodKey(1267).build()).addOnSuccessListener(new com.google.android.gms.tasks.OnSuccessListener(this, discoveryOptions) { // from class: com.google.android.gms.internal.nearby.zzbh
            private final com.google.android.gms.internal.nearby.zzcn zza;
            private final com.google.android.gms.nearby.connection.DiscoveryOptions zzb;

            {
                this.zza = this;
                this.zzb = discoveryOptions;
            }

            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(java.lang.Object obj) {
                this.zza.zzc(this.zzb, (java.lang.Void) obj);
            }
        });
    }

    @Override // com.google.android.gms.nearby.connection.ConnectionsClient
    public final void stopAdvertising() {
        this.zze.zzg(this, "advertising");
    }

    @Override // com.google.android.gms.nearby.connection.ConnectionsClient
    public final void stopAllEndpoints() {
        this.zze.zzg(this, "advertising");
        this.zze.zzg(this, "discovery").addOnSuccessListener(new com.google.android.gms.internal.nearby.zzbi(this));
        zzi(com.google.android.gms.internal.nearby.zzbr.zza).addOnCompleteListener(new com.google.android.gms.tasks.OnCompleteListener(this) { // from class: com.google.android.gms.internal.nearby.zzbs
            private final com.google.android.gms.internal.nearby.zzcn zza;

            {
                this.zza = this;
            }

            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(com.google.android.gms.tasks.Task task) {
                this.zza.zza(task);
            }
        });
    }

    @Override // com.google.android.gms.nearby.connection.ConnectionsClient
    public final void stopDiscovery() {
        this.zze.zzg(this, "discovery").addOnSuccessListener(new com.google.android.gms.internal.nearby.zzbi(this));
    }

    final /* synthetic */ void zza(com.google.android.gms.tasks.Task task) {
        this.zze.zzg(this, "connection");
        disconnectService();
    }

    final /* synthetic */ void zzb(java.lang.Void r1) {
        com.google.android.gms.internal.nearby.zzet zzetVar = this.zzf;
        if (zzetVar != null) {
            zzetVar.zzc();
        }
    }

    final /* synthetic */ void zzc(com.google.android.gms.nearby.connection.DiscoveryOptions discoveryOptions, java.lang.Void r2) {
        if (discoveryOptions.zza()) {
            com.google.android.gms.internal.nearby.zzet zzetVar = this.zzf;
            if (zzetVar == null) {
                android.util.Log.d("NearbyConnections", "Discovery started with NFC requested, but there is no NfcDispatcher available. Discovery will continue over other mediums instead. To use NFC discovery, pass in an Activity when calling Nearby.getConnectionsClient().");
            } else {
                zzetVar.zzb();
            }
        }
    }

    public zzcn(android.content.Context context, com.google.android.gms.nearby.connection.ConnectionsOptions connectionsOptions) {
        super(context, zzd, (com.google.android.gms.common.api.Api.ApiOptions) null, com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS);
        this.zze = com.google.android.gms.internal.nearby.zzo.zza(this, null);
        this.zzf = null;
    }

    @Override // com.google.android.gms.nearby.connection.ConnectionsClient
    public final com.google.android.gms.tasks.Task<java.lang.Void> sendPayload(final java.util.List<java.lang.String> list, final com.google.android.gms.nearby.connection.Payload payload) {
        return doWrite(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall(this, list, payload) { // from class: com.google.android.gms.internal.nearby.zzbn
            private final com.google.android.gms.internal.nearby.zzcn zza;
            private final java.util.List zzb;
            private final com.google.android.gms.nearby.connection.Payload zzc;

            {
                this.zza = this;
                this.zzb = list;
                this.zzc = payload;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(java.lang.Object obj, java.lang.Object obj2) throws android.os.RemoteException {
                com.google.android.gms.internal.nearby.zzcn zzcnVar = this.zza;
                java.util.List list2 = this.zzb;
                ((com.google.android.gms.internal.nearby.zzbf) obj).zzA(new com.google.android.gms.internal.nearby.zzcl(zzcnVar, (com.google.android.gms.tasks.TaskCompletionSource) obj2), (java.lang.String[]) list2.toArray(new java.lang.String[0]), this.zzc, false);
            }
        }).setMethodKey(1228).build());
    }

    @Override // com.google.android.gms.nearby.connection.ConnectionsClient
    public final com.google.android.gms.tasks.Task<java.lang.Void> requestConnection(final java.lang.String str, final java.lang.String str2, com.google.android.gms.nearby.connection.ConnectionLifecycleCallback connectionLifecycleCallback, final com.google.android.gms.nearby.connection.ConnectionOptions connectionOptions) {
        final com.google.android.gms.common.api.internal.ListenerHolder<L> listenerHolderRegisterListener = registerListener(new com.google.android.gms.internal.nearby.zzck(this, connectionLifecycleCallback), com.google.android.gms.nearby.connection.ConnectionLifecycleCallback.class.getName());
        zzf(str2);
        return doWrite(com.google.android.gms.common.api.internal.TaskApiCall.builder().setFeatures(com.google.android.gms.nearby.zza.zze).run(new com.google.android.gms.common.api.internal.RemoteCall(this, str, str2, listenerHolderRegisterListener, connectionOptions) { // from class: com.google.android.gms.internal.nearby.zzbq
            private final com.google.android.gms.internal.nearby.zzcn zza;
            private final java.lang.String zzb;
            private final java.lang.String zzc;
            private final com.google.android.gms.common.api.internal.ListenerHolder zzd;
            private final com.google.android.gms.nearby.connection.ConnectionOptions zze;

            {
                this.zza = this;
                this.zzb = str;
                this.zzc = str2;
                this.zzd = listenerHolderRegisterListener;
                this.zze = connectionOptions;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(java.lang.Object obj, java.lang.Object obj2) throws android.os.RemoteException {
                com.google.android.gms.internal.nearby.zzcn zzcnVar = this.zza;
                ((com.google.android.gms.internal.nearby.zzbf) obj).zzp(new com.google.android.gms.internal.nearby.zzcl(zzcnVar, (com.google.android.gms.tasks.TaskCompletionSource) obj2), this.zzb, this.zzc, this.zzd, this.zze);
            }
        }).setMethodKey(1226).build()).addOnFailureListener(new com.google.android.gms.internal.nearby.zzcf(this, str2));
    }

    @Override // com.google.android.gms.nearby.connection.ConnectionsClient
    public final com.google.android.gms.tasks.Task<java.lang.Void> startAdvertising(final byte[] bArr, final java.lang.String str, com.google.android.gms.nearby.connection.ConnectionLifecycleCallback connectionLifecycleCallback, final com.google.android.gms.nearby.connection.AdvertisingOptions advertisingOptions) {
        final com.google.android.gms.common.api.internal.ListenerHolder<L> listenerHolderRegisterListener = registerListener(new com.google.android.gms.internal.nearby.zzck(this, connectionLifecycleCallback), com.google.android.gms.nearby.connection.ConnectionLifecycleCallback.class.getName());
        return this.zze.zze(this, com.google.android.gms.common.api.internal.RegistrationMethods.builder().withHolder(this.zze.zzb(this, new java.lang.Object(), "advertising")).setFeatures(com.google.android.gms.nearby.zza.zze).register(new com.google.android.gms.common.api.internal.RemoteCall(this, bArr, str, listenerHolderRegisterListener, advertisingOptions) { // from class: com.google.android.gms.internal.nearby.zzby
            private final com.google.android.gms.internal.nearby.zzcn zza;
            private final byte[] zzb;
            private final java.lang.String zzc;
            private final com.google.android.gms.common.api.internal.ListenerHolder zzd;
            private final com.google.android.gms.nearby.connection.AdvertisingOptions zze;

            {
                this.zza = this;
                this.zzb = bArr;
                this.zzc = str;
                this.zzd = listenerHolderRegisterListener;
                this.zze = advertisingOptions;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(java.lang.Object obj, java.lang.Object obj2) throws android.os.RemoteException {
                com.google.android.gms.internal.nearby.zzcn zzcnVar = this.zza;
                ((com.google.android.gms.internal.nearby.zzbf) obj).zzr(new com.google.android.gms.internal.nearby.zzcl(zzcnVar, (com.google.android.gms.tasks.TaskCompletionSource) obj2), this.zzb, this.zzc, this.zzd, this.zze);
            }
        }).unregister(com.google.android.gms.internal.nearby.zzbz.zza).setMethodKey(1266).build());
    }

    @Override // com.google.android.gms.nearby.connection.ConnectionsClient
    public final com.google.android.gms.tasks.Task<java.lang.Void> requestConnection(final byte[] bArr, final java.lang.String str, com.google.android.gms.nearby.connection.ConnectionLifecycleCallback connectionLifecycleCallback) {
        final com.google.android.gms.common.api.internal.ListenerHolder<L> listenerHolderRegisterListener = registerListener(new com.google.android.gms.internal.nearby.zzck(this, connectionLifecycleCallback), com.google.android.gms.nearby.connection.ConnectionLifecycleCallback.class.getName());
        zzf(str);
        return doWrite(com.google.android.gms.common.api.internal.TaskApiCall.builder().setFeatures(com.google.android.gms.nearby.zza.zze).run(new com.google.android.gms.common.api.internal.RemoteCall(this, bArr, str, listenerHolderRegisterListener) { // from class: com.google.android.gms.internal.nearby.zzca
            private final com.google.android.gms.internal.nearby.zzcn zza;
            private final byte[] zzb;
            private final java.lang.String zzc;
            private final com.google.android.gms.common.api.internal.ListenerHolder zzd;

            {
                this.zza = this;
                this.zzb = bArr;
                this.zzc = str;
                this.zzd = listenerHolderRegisterListener;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(java.lang.Object obj, java.lang.Object obj2) throws android.os.RemoteException {
                com.google.android.gms.internal.nearby.zzcn zzcnVar = this.zza;
                ((com.google.android.gms.internal.nearby.zzbf) obj).zzs(new com.google.android.gms.internal.nearby.zzcl(zzcnVar, (com.google.android.gms.tasks.TaskCompletionSource) obj2), this.zzb, this.zzc, this.zzd);
            }
        }).setMethodKey(1226).build()).addOnFailureListener(new com.google.android.gms.internal.nearby.zzch(this, str));
    }

    @Override // com.google.android.gms.nearby.connection.ConnectionsClient
    public final com.google.android.gms.tasks.Task<java.lang.Void> requestConnection(final byte[] bArr, final java.lang.String str, com.google.android.gms.nearby.connection.ConnectionLifecycleCallback connectionLifecycleCallback, final com.google.android.gms.nearby.connection.ConnectionOptions connectionOptions) {
        final com.google.android.gms.common.api.internal.ListenerHolder<L> listenerHolderRegisterListener = registerListener(new com.google.android.gms.internal.nearby.zzck(this, connectionLifecycleCallback), com.google.android.gms.nearby.connection.ConnectionLifecycleCallback.class.getName());
        zzf(str);
        return doWrite(com.google.android.gms.common.api.internal.TaskApiCall.builder().setFeatures(com.google.android.gms.nearby.zza.zze).run(new com.google.android.gms.common.api.internal.RemoteCall(this, bArr, str, listenerHolderRegisterListener, connectionOptions) { // from class: com.google.android.gms.internal.nearby.zzbx
            private final com.google.android.gms.internal.nearby.zzcn zza;
            private final byte[] zzb;
            private final java.lang.String zzc;
            private final com.google.android.gms.common.api.internal.ListenerHolder zzd;
            private final com.google.android.gms.nearby.connection.ConnectionOptions zze;

            {
                this.zza = this;
                this.zzb = bArr;
                this.zzc = str;
                this.zzd = listenerHolderRegisterListener;
                this.zze = connectionOptions;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(java.lang.Object obj, java.lang.Object obj2) throws android.os.RemoteException {
                com.google.android.gms.internal.nearby.zzcn zzcnVar = this.zza;
                ((com.google.android.gms.internal.nearby.zzbf) obj).zzq(new com.google.android.gms.internal.nearby.zzcl(zzcnVar, (com.google.android.gms.tasks.TaskCompletionSource) obj2), this.zzb, this.zzc, this.zzd, this.zze);
            }
        }).setMethodKey(1226).build()).addOnFailureListener(new com.google.android.gms.internal.nearby.zzcg(this, str));
    }
}
