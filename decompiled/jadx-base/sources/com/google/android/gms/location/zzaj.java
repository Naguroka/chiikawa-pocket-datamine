package com.google.android.gms.location;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzaj extends com.google.android.gms.location.LocationCallback {
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource zza;
    final /* synthetic */ com.google.android.gms.location.FusedLocationProviderClient zzb;

    zzaj(com.google.android.gms.location.FusedLocationProviderClient fusedLocationProviderClient, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        this.zzb = fusedLocationProviderClient;
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.location.LocationCallback
    public final void onLocationAvailability(com.google.android.gms.location.LocationAvailability locationAvailability) {
    }

    @Override // com.google.android.gms.location.LocationCallback
    public final void onLocationResult(com.google.android.gms.location.LocationResult locationResult) {
        this.zza.trySetResult(locationResult.getLastLocation());
        this.zzb.removeLocationUpdates(this);
    }
}
