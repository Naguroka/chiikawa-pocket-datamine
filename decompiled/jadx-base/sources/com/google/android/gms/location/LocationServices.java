package com.google.android.gms.location;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public class LocationServices {
    public static final com.google.android.gms.common.api.Api<com.google.android.gms.common.api.Api.ApiOptions.NoOptions> API;

    @java.lang.Deprecated
    public static final com.google.android.gms.location.FusedLocationProviderApi FusedLocationApi;

    @java.lang.Deprecated
    public static final com.google.android.gms.location.GeofencingApi GeofencingApi;

    @java.lang.Deprecated
    public static final com.google.android.gms.location.SettingsApi SettingsApi;
    private static final com.google.android.gms.common.api.Api.ClientKey<com.google.android.gms.internal.location.zzaz> zza;
    private static final com.google.android.gms.common.api.Api.AbstractClientBuilder<com.google.android.gms.internal.location.zzaz, com.google.android.gms.common.api.Api.ApiOptions.NoOptions> zzb;

    static {
        com.google.android.gms.common.api.Api.ClientKey<com.google.android.gms.internal.location.zzaz> clientKey = new com.google.android.gms.common.api.Api.ClientKey<>();
        zza = clientKey;
        com.google.android.gms.location.zzbh zzbhVar = new com.google.android.gms.location.zzbh();
        zzb = zzbhVar;
        API = new com.google.android.gms.common.api.Api<>("LocationServices.API", zzbhVar, clientKey);
        FusedLocationApi = new com.google.android.gms.internal.location.zzz();
        GeofencingApi = new com.google.android.gms.internal.location.zzaf();
        SettingsApi = new com.google.android.gms.internal.location.zzbi();
    }

    private LocationServices() {
    }

    public static com.google.android.gms.location.FusedLocationProviderClient getFusedLocationProviderClient(android.app.Activity activity) {
        return new com.google.android.gms.location.FusedLocationProviderClient(activity);
    }

    public static com.google.android.gms.location.GeofencingClient getGeofencingClient(android.app.Activity activity) {
        return new com.google.android.gms.location.GeofencingClient(activity);
    }

    public static com.google.android.gms.location.SettingsClient getSettingsClient(android.app.Activity activity) {
        return new com.google.android.gms.location.SettingsClient(activity);
    }

    public static com.google.android.gms.internal.location.zzaz zza(com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        com.google.android.gms.common.internal.Preconditions.checkArgument(googleApiClient != null, "GoogleApiClient parameter is required.");
        com.google.android.gms.internal.location.zzaz zzazVar = (com.google.android.gms.internal.location.zzaz) googleApiClient.getClient(zza);
        com.google.android.gms.common.internal.Preconditions.checkState(zzazVar != null, "GoogleApiClient is not configured to use the LocationServices.API Api. Pass thisinto GoogleApiClient.Builder#addApi() to use this feature.");
        return zzazVar;
    }

    public static com.google.android.gms.location.FusedLocationProviderClient getFusedLocationProviderClient(android.content.Context context) {
        return new com.google.android.gms.location.FusedLocationProviderClient(context);
    }

    public static com.google.android.gms.location.GeofencingClient getGeofencingClient(android.content.Context context) {
        return new com.google.android.gms.location.GeofencingClient(context);
    }

    public static com.google.android.gms.location.SettingsClient getSettingsClient(android.content.Context context) {
        return new com.google.android.gms.location.SettingsClient(context);
    }
}
