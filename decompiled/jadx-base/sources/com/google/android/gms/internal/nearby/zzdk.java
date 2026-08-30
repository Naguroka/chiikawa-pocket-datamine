package com.google.android.gms.internal.nearby;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
abstract class zzdk extends com.google.android.gms.internal.nearby.zzdi<com.google.android.gms.nearby.connection.Connections.StartAdvertisingResult> {
    /* synthetic */ zzdk(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.internal.nearby.zzcy zzcyVar) {
        super(googleApiClient);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ com.google.android.gms.common.api.Result createFailedResult(com.google.android.gms.common.api.Status status) {
        return new com.google.android.gms.internal.nearby.zzdj(this, status);
    }
}
