package com.google.android.gms.location;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public class SettingsClient extends com.google.android.gms.common.api.GoogleApi<com.google.android.gms.common.api.Api.ApiOptions.NoOptions> {
    public static final /* synthetic */ int zza = 0;

    public SettingsClient(android.app.Activity activity) {
        super(activity, com.google.android.gms.location.LocationServices.API, com.google.android.gms.common.api.Api.ApiOptions.NO_OPTIONS, com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    public com.google.android.gms.tasks.Task<com.google.android.gms.location.LocationSettingsResponse> checkLocationSettings(final com.google.android.gms.location.LocationSettingsRequest locationSettingsRequest) {
        return doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall(locationSettingsRequest) { // from class: com.google.android.gms.location.zzbs
            private final com.google.android.gms.location.LocationSettingsRequest zza;

            {
                this.zza = locationSettingsRequest;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(java.lang.Object obj, java.lang.Object obj2) throws android.os.RemoteException {
                com.google.android.gms.location.LocationSettingsRequest locationSettingsRequest2 = this.zza;
                int i = com.google.android.gms.location.SettingsClient.zza;
                ((com.google.android.gms.internal.location.zzaz) obj).zzL(locationSettingsRequest2, new com.google.android.gms.location.zzbt((com.google.android.gms.tasks.TaskCompletionSource) obj2), null);
            }
        }).setMethodKey(2426).build());
    }

    public SettingsClient(android.content.Context context) {
        super(context, com.google.android.gms.location.LocationServices.API, com.google.android.gms.common.api.Api.ApiOptions.NO_OPTIONS, com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS);
    }
}
