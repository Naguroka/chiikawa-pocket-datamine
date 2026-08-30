package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
abstract class zzar extends com.google.android.gms.internal.drive.zzau<com.google.android.gms.drive.DriveApi.MetadataBufferResult> {
    zzar(com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        super(googleApiClient);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public /* synthetic */ com.google.android.gms.common.api.Result createFailedResult(com.google.android.gms.common.api.Status status) {
        return new com.google.android.gms.internal.drive.zzaq(status, null, false);
    }
}
