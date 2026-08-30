package com.google.android.gms.nearby.messages.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzbh extends com.google.android.gms.nearby.messages.internal.zzbt {
    final /* synthetic */ com.google.android.gms.common.api.internal.ListenerHolder zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzbh(com.google.android.gms.nearby.messages.internal.zzbw zzbwVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.common.api.internal.ListenerHolder listenerHolder) {
        super(googleApiClient);
        this.zza = listenerHolder;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* bridge */ /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient anyClient) throws android.os.RemoteException {
        ((com.google.android.gms.nearby.messages.internal.zzai) anyClient).zzA(zza(), this.zza);
    }
}
