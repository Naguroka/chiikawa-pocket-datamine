package com.google.android.gms.location;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
@java.lang.Deprecated
public interface ActivityRecognitionApi {
    com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> removeActivityUpdates(com.google.android.gms.common.api.GoogleApiClient googleApiClient, android.app.PendingIntent pendingIntent);

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> requestActivityUpdates(com.google.android.gms.common.api.GoogleApiClient googleApiClient, long j, android.app.PendingIntent pendingIntent);
}
