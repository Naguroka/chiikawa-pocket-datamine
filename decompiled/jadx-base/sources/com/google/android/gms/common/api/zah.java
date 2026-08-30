package com.google.android.gms.common.api;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zah<R extends com.google.android.gms.common.api.Result> extends com.google.android.gms.common.api.internal.BasePendingResult<R> {
    public zah(com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        super(googleApiClient);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final R createFailedResult(com.google.android.gms.common.api.Status status) {
        throw new java.lang.UnsupportedOperationException("Creating failed results is not supported");
    }
}
