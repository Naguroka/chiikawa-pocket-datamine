package com.google.android.gms.internal.location;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzn extends com.google.android.gms.internal.location.zzx {
    final /* synthetic */ com.google.android.gms.location.LocationCallback zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzn(com.google.android.gms.internal.location.zzz zzzVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.location.LocationCallback locationCallback) {
        super(googleApiClient);
        this.zza = locationCallback;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* bridge */ /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient anyClient) throws android.os.RemoteException {
        ((com.google.android.gms.internal.location.zzaz) anyClient).zzH(com.google.android.gms.common.api.internal.ListenerHolders.createListenerKey(this.zza, "LocationCallback"), new com.google.android.gms.internal.location.zzy(this));
    }
}
