package com.google.android.gms.internal.location;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzt extends com.google.android.gms.internal.location.zzx {
    final /* synthetic */ com.google.android.gms.location.LocationRequest zza;
    final /* synthetic */ com.google.android.gms.location.LocationCallback zzb;
    final /* synthetic */ android.os.Looper zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzt(com.google.android.gms.internal.location.zzz zzzVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.location.LocationRequest locationRequest, com.google.android.gms.location.LocationCallback locationCallback, android.os.Looper looper) {
        super(googleApiClient);
        this.zza = locationRequest;
        this.zzb = locationCallback;
        this.zzc = looper;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* bridge */ /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient anyClient) throws android.os.RemoteException {
        ((com.google.android.gms.internal.location.zzaz) anyClient).zzB(com.google.android.gms.internal.location.zzba.zza(null, this.zza), com.google.android.gms.common.api.internal.ListenerHolders.createListenerHolder(this.zzb, com.google.android.gms.internal.location.zzbj.zza(this.zzc), "LocationCallback"), new com.google.android.gms.internal.location.zzy(this));
    }
}
