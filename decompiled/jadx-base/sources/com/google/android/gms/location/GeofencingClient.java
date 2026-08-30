package com.google.android.gms.location;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public class GeofencingClient extends com.google.android.gms.common.api.GoogleApi<com.google.android.gms.common.api.Api.ApiOptions.NoOptions> {
    public static final /* synthetic */ int zza = 0;

    public GeofencingClient(android.app.Activity activity) {
        super(activity, com.google.android.gms.location.LocationServices.API, com.google.android.gms.common.api.Api.ApiOptions.NO_OPTIONS, com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> addGeofences(com.google.android.gms.location.GeofencingRequest geofencingRequest, final android.app.PendingIntent pendingIntent) {
        final com.google.android.gms.location.GeofencingRequest geofencingRequestZza = geofencingRequest.zza(getContextAttributionTag());
        return doWrite(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall(geofencingRequestZza, pendingIntent) { // from class: com.google.android.gms.location.zzaq
            private final com.google.android.gms.location.GeofencingRequest zza;
            private final android.app.PendingIntent zzb;

            {
                this.zza = geofencingRequestZza;
                this.zzb = pendingIntent;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(java.lang.Object obj, java.lang.Object obj2) throws android.os.RemoteException {
                com.google.android.gms.location.GeofencingRequest geofencingRequest2 = this.zza;
                android.app.PendingIntent pendingIntent2 = this.zzb;
                int i = com.google.android.gms.location.GeofencingClient.zza;
                ((com.google.android.gms.internal.location.zzaz) obj).zzv(geofencingRequest2, pendingIntent2, new com.google.android.gms.location.zzat((com.google.android.gms.tasks.TaskCompletionSource) obj2));
            }
        }).setMethodKey(2424).build());
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> removeGeofences(final android.app.PendingIntent pendingIntent) {
        return doWrite(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall(pendingIntent) { // from class: com.google.android.gms.location.zzar
            private final android.app.PendingIntent zza;

            {
                this.zza = pendingIntent;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(java.lang.Object obj, java.lang.Object obj2) throws android.os.RemoteException {
                android.app.PendingIntent pendingIntent2 = this.zza;
                int i = com.google.android.gms.location.GeofencingClient.zza;
                ((com.google.android.gms.internal.location.zzaz) obj).zzx(pendingIntent2, new com.google.android.gms.location.zzat((com.google.android.gms.tasks.TaskCompletionSource) obj2));
            }
        }).setMethodKey(2425).build());
    }

    public GeofencingClient(android.content.Context context) {
        super(context, com.google.android.gms.location.LocationServices.API, com.google.android.gms.common.api.Api.ApiOptions.NO_OPTIONS, com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> removeGeofences(final java.util.List<java.lang.String> list) {
        return doWrite(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall(list) { // from class: com.google.android.gms.location.zzas
            private final java.util.List zza;

            {
                this.zza = list;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(java.lang.Object obj, java.lang.Object obj2) throws android.os.RemoteException {
                java.util.List<java.lang.String> list2 = this.zza;
                int i = com.google.android.gms.location.GeofencingClient.zza;
                ((com.google.android.gms.internal.location.zzaz) obj).zzy(list2, new com.google.android.gms.location.zzat((com.google.android.gms.tasks.TaskCompletionSource) obj2));
            }
        }).setMethodKey(2425).build());
    }
}
