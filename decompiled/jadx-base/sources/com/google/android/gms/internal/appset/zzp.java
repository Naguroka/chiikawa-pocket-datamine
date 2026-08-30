package com.google.android.gms.internal.appset;

/* JADX INFO: compiled from: com.google.android.gms:play-services-appset@@16.0.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzp extends com.google.android.gms.common.api.GoogleApi<com.google.android.gms.common.api.Api.ApiOptions.NoOptions> implements com.google.android.gms.appset.AppSetIdClient {
    private static final com.google.android.gms.common.api.Api.ClientKey<com.google.android.gms.internal.appset.zzd> zza;
    private static final com.google.android.gms.common.api.Api.AbstractClientBuilder<com.google.android.gms.internal.appset.zzd, com.google.android.gms.common.api.Api.ApiOptions.NoOptions> zzb;
    private static final com.google.android.gms.common.api.Api<com.google.android.gms.common.api.Api.ApiOptions.NoOptions> zzc;
    private final android.content.Context zzd;
    private final com.google.android.gms.common.GoogleApiAvailabilityLight zze;

    static {
        com.google.android.gms.common.api.Api.ClientKey<com.google.android.gms.internal.appset.zzd> clientKey = new com.google.android.gms.common.api.Api.ClientKey<>();
        zza = clientKey;
        com.google.android.gms.internal.appset.zzn zznVar = new com.google.android.gms.internal.appset.zzn();
        zzb = zznVar;
        zzc = new com.google.android.gms.common.api.Api<>("AppSet.API", zznVar, clientKey);
    }

    zzp(android.content.Context context, com.google.android.gms.common.GoogleApiAvailabilityLight googleApiAvailabilityLight) {
        super(context, zzc, com.google.android.gms.common.api.Api.ApiOptions.NO_OPTIONS, com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS);
        this.zzd = context;
        this.zze = googleApiAvailabilityLight;
    }

    @Override // com.google.android.gms.appset.AppSetIdClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.appset.AppSetIdInfo> getAppSetIdInfo() {
        return this.zze.isGooglePlayServicesAvailable(this.zzd, 212800000) == 0 ? doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().setFeatures(com.google.android.gms.appset.zze.zza).run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.appset.zzm
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(java.lang.Object obj, java.lang.Object obj2) throws android.os.RemoteException {
                ((com.google.android.gms.internal.appset.zzg) ((com.google.android.gms.internal.appset.zzd) obj).getService()).zzc(new com.google.android.gms.appset.zza(null, null), new com.google.android.gms.internal.appset.zzo(this.zza, (com.google.android.gms.tasks.TaskCompletionSource) obj2));
            }
        }).setAutoResolveMissingFeatures(false).setMethodKey(27601).build()) : com.google.android.gms.tasks.Tasks.forException(new com.google.android.gms.common.api.ApiException(new com.google.android.gms.common.api.Status(17)));
    }
}
