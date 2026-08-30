package com.google.android.gms.location;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
@java.lang.Deprecated
public interface FusedLocationProviderApi {

    @java.lang.Deprecated
    public static final java.lang.String KEY_LOCATION_CHANGED = "com.google.android.location.LOCATION";
    public static final java.lang.String KEY_MOCK_LOCATION = "mockLocation";

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> flushLocations(com.google.android.gms.common.api.GoogleApiClient googleApiClient);

    android.location.Location getLastLocation(com.google.android.gms.common.api.GoogleApiClient googleApiClient);

    com.google.android.gms.location.LocationAvailability getLocationAvailability(com.google.android.gms.common.api.GoogleApiClient googleApiClient);

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> removeLocationUpdates(com.google.android.gms.common.api.GoogleApiClient googleApiClient, android.app.PendingIntent pendingIntent);

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> removeLocationUpdates(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.location.LocationCallback locationCallback);

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> removeLocationUpdates(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.location.LocationListener locationListener);

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> requestLocationUpdates(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.location.LocationRequest locationRequest, android.app.PendingIntent pendingIntent);

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> requestLocationUpdates(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.location.LocationRequest locationRequest, com.google.android.gms.location.LocationCallback locationCallback, android.os.Looper looper);

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> requestLocationUpdates(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.location.LocationRequest locationRequest, com.google.android.gms.location.LocationListener locationListener);

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> requestLocationUpdates(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.location.LocationRequest locationRequest, com.google.android.gms.location.LocationListener locationListener, android.os.Looper looper);

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> setMockLocation(com.google.android.gms.common.api.GoogleApiClient googleApiClient, android.location.Location location);

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> setMockMode(com.google.android.gms.common.api.GoogleApiClient googleApiClient, boolean z);
}
