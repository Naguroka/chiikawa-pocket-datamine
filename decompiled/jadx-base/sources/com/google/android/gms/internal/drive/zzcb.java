package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
@java.lang.Deprecated
public final class zzcb implements com.google.android.gms.drive.DrivePreferencesApi {
    @Override // com.google.android.gms.drive.DrivePreferencesApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.drive.DrivePreferencesApi.FileUploadPreferencesResult> getFileUploadPreferences(com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        return googleApiClient.enqueue(new com.google.android.gms.internal.drive.zzcc(this, googleApiClient));
    }

    @Override // com.google.android.gms.drive.DrivePreferencesApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> setFileUploadPreferences(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.drive.FileUploadPreferences fileUploadPreferences) {
        if (!(fileUploadPreferences instanceof com.google.android.gms.internal.drive.zzei)) {
            throw new java.lang.IllegalArgumentException("Invalid preference value");
        }
        return googleApiClient.execute(new com.google.android.gms.internal.drive.zzcd(this, googleApiClient, (com.google.android.gms.internal.drive.zzei) fileUploadPreferences));
    }
}
