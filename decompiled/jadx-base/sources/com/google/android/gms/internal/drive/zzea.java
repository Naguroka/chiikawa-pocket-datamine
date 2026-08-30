package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
abstract class zzea extends com.google.android.gms.internal.drive.zzau<com.google.android.gms.drive.DriveResource.MetadataResult> {
    private zzea(com.google.android.gms.internal.drive.zzdp zzdpVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        super(googleApiClient);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public /* synthetic */ com.google.android.gms.common.api.Result createFailedResult(com.google.android.gms.common.api.Status status) {
        return new com.google.android.gms.internal.drive.zzdz(status, null);
    }

    /* synthetic */ zzea(com.google.android.gms.internal.drive.zzdp zzdpVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.internal.drive.zzdq zzdqVar) {
        this(zzdpVar, googleApiClient);
    }
}
