package com.google.android.gms.internal.nearby;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
abstract class zzdl extends com.google.android.gms.internal.nearby.zzdi<com.google.android.gms.common.api.Status> {
    /* synthetic */ zzdl(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.internal.nearby.zzcy zzcyVar) {
        super(googleApiClient);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ com.google.android.gms.common.api.Result createFailedResult(com.google.android.gms.common.api.Status status) {
        return status;
    }
}
