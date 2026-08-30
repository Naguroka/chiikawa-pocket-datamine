package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
final class zzcf implements com.google.android.gms.drive.DrivePreferencesApi.FileUploadPreferencesResult {
    private final com.google.android.gms.common.api.Status zzdy;
    private final com.google.android.gms.drive.FileUploadPreferences zzfm;

    private zzcf(com.google.android.gms.internal.drive.zzcb zzcbVar, com.google.android.gms.common.api.Status status, com.google.android.gms.drive.FileUploadPreferences fileUploadPreferences) {
        this.zzdy = status;
        this.zzfm = fileUploadPreferences;
    }

    @Override // com.google.android.gms.drive.DrivePreferencesApi.FileUploadPreferencesResult
    public final com.google.android.gms.drive.FileUploadPreferences getFileUploadPreferences() {
        return this.zzfm;
    }

    @Override // com.google.android.gms.common.api.Result
    public final com.google.android.gms.common.api.Status getStatus() {
        return this.zzdy;
    }

    /* synthetic */ zzcf(com.google.android.gms.internal.drive.zzcb zzcbVar, com.google.android.gms.common.api.Status status, com.google.android.gms.drive.FileUploadPreferences fileUploadPreferences, com.google.android.gms.internal.drive.zzcc zzccVar) {
        this(zzcbVar, status, fileUploadPreferences);
    }
}
