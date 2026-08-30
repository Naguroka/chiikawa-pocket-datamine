package com.google.android.gms.nearby.messages.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzbp extends com.google.android.gms.nearby.messages.internal.zzbt {
    zzbp(com.google.android.gms.nearby.messages.internal.zzbw zzbwVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        super(googleApiClient);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* bridge */ /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient anyClient) throws android.os.RemoteException {
        ((com.google.android.gms.nearby.messages.internal.zzs) ((com.google.android.gms.nearby.messages.internal.zzai) anyClient).getService()).zzh(new com.google.android.gms.nearby.messages.internal.zzh(1, new com.google.android.gms.internal.nearby.zzhq(zza()), null, null));
    }
}
