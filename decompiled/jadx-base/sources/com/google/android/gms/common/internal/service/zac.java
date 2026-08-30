package com.google.android.gms.common.internal.service;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zac extends com.google.android.gms.common.internal.service.zaf {
    zac(com.google.android.gms.common.internal.service.zae zaeVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        super(googleApiClient);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* bridge */ /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient anyClient) throws android.os.RemoteException {
        ((com.google.android.gms.common.internal.service.zal) ((com.google.android.gms.common.internal.service.zah) anyClient).getService()).zae(new com.google.android.gms.common.internal.service.zad(this));
    }
}
