package com.google.android.gms.internal.location;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzz implements com.google.android.gms.location.FusedLocationProviderApi {
    @Override // com.google.android.gms.location.FusedLocationProviderApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> flushLocations(com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        return googleApiClient.execute(new com.google.android.gms.internal.location.zzq(this, googleApiClient));
    }

    @Override // com.google.android.gms.location.FusedLocationProviderApi
    public final android.location.Location getLastLocation(com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        java.lang.String str;
        com.google.android.gms.internal.location.zzaz zzazVarZza = com.google.android.gms.location.LocationServices.zza(googleApiClient);
        android.content.Context context = googleApiClient.getContext();
        if (android.os.Build.VERSION.SDK_INT < 30 || context == null) {
            str = null;
        } else {
            try {
                str = (java.lang.String) android.content.Context.class.getMethod("getAttributionTag", new java.lang.Class[0]).invoke(context, new java.lang.Object[0]);
            } catch (java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException unused) {
                str = null;
            }
        }
        try {
            return zzazVarZza.zzz(str);
        } catch (java.lang.Exception unused2) {
            return null;
        }
    }

    @Override // com.google.android.gms.location.FusedLocationProviderApi
    public final com.google.android.gms.location.LocationAvailability getLocationAvailability(com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        try {
            return com.google.android.gms.location.LocationServices.zza(googleApiClient).zzA();
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.location.FusedLocationProviderApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> removeLocationUpdates(com.google.android.gms.common.api.GoogleApiClient googleApiClient, android.app.PendingIntent pendingIntent) {
        return googleApiClient.execute(new com.google.android.gms.internal.location.zzw(this, googleApiClient, pendingIntent));
    }

    @Override // com.google.android.gms.location.FusedLocationProviderApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> requestLocationUpdates(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.location.LocationRequest locationRequest, android.app.PendingIntent pendingIntent) {
        return googleApiClient.execute(new com.google.android.gms.internal.location.zzu(this, googleApiClient, locationRequest, pendingIntent));
    }

    @Override // com.google.android.gms.location.FusedLocationProviderApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> setMockLocation(com.google.android.gms.common.api.GoogleApiClient googleApiClient, android.location.Location location) {
        return googleApiClient.execute(new com.google.android.gms.internal.location.zzp(this, googleApiClient, location));
    }

    @Override // com.google.android.gms.location.FusedLocationProviderApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> setMockMode(com.google.android.gms.common.api.GoogleApiClient googleApiClient, boolean z) {
        return googleApiClient.execute(new com.google.android.gms.internal.location.zzo(this, googleApiClient, z));
    }

    @Override // com.google.android.gms.location.FusedLocationProviderApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> removeLocationUpdates(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.location.LocationCallback locationCallback) {
        return googleApiClient.execute(new com.google.android.gms.internal.location.zzn(this, googleApiClient, locationCallback));
    }

    @Override // com.google.android.gms.location.FusedLocationProviderApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> requestLocationUpdates(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.location.LocationRequest locationRequest, com.google.android.gms.location.LocationCallback locationCallback, android.os.Looper looper) {
        return googleApiClient.execute(new com.google.android.gms.internal.location.zzt(this, googleApiClient, locationRequest, locationCallback, looper));
    }

    @Override // com.google.android.gms.location.FusedLocationProviderApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> removeLocationUpdates(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.location.LocationListener locationListener) {
        return googleApiClient.execute(new com.google.android.gms.internal.location.zzv(this, googleApiClient, locationListener));
    }

    @Override // com.google.android.gms.location.FusedLocationProviderApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> requestLocationUpdates(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.location.LocationRequest locationRequest, com.google.android.gms.location.LocationListener locationListener) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(android.os.Looper.myLooper(), "Calling thread must be a prepared Looper thread.");
        return googleApiClient.execute(new com.google.android.gms.internal.location.zzr(this, googleApiClient, locationRequest, locationListener));
    }

    @Override // com.google.android.gms.location.FusedLocationProviderApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> requestLocationUpdates(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.location.LocationRequest locationRequest, com.google.android.gms.location.LocationListener locationListener, android.os.Looper looper) {
        return googleApiClient.execute(new com.google.android.gms.internal.location.zzs(this, googleApiClient, locationRequest, locationListener, looper));
    }
}
