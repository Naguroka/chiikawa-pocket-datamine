package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
abstract class zzcg extends com.google.android.gms.internal.drive.zzau<com.google.android.gms.drive.DrivePreferencesApi.FileUploadPreferencesResult> {
    private final /* synthetic */ com.google.android.gms.internal.drive.zzcb zzfk;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcg(com.google.android.gms.internal.drive.zzcb zzcbVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        super(googleApiClient);
        this.zzfk = zzcbVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected /* synthetic */ com.google.android.gms.common.api.Result createFailedResult(com.google.android.gms.common.api.Status status) {
        return new com.google.android.gms.internal.drive.zzcf(this.zzfk, status, null, 0 == true ? 1 : 0);
    }
}
