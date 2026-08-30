package com.google.android.gms.internal.location;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzg implements com.google.android.gms.location.ActivityRecognitionApi {
    @Override // com.google.android.gms.location.ActivityRecognitionApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> removeActivityUpdates(com.google.android.gms.common.api.GoogleApiClient googleApiClient, android.app.PendingIntent pendingIntent) {
        return googleApiClient.execute(new com.google.android.gms.internal.location.zze(this, googleApiClient, pendingIntent));
    }

    @Override // com.google.android.gms.location.ActivityRecognitionApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> requestActivityUpdates(com.google.android.gms.common.api.GoogleApiClient googleApiClient, long j, android.app.PendingIntent pendingIntent) {
        return googleApiClient.execute(new com.google.android.gms.internal.location.zzd(this, googleApiClient, j, pendingIntent));
    }
}
