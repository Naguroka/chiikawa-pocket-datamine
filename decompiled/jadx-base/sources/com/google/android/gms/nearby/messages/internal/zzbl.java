package com.google.android.gms.nearby.messages.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzbl extends com.google.android.gms.nearby.messages.internal.zzbt {
    final /* synthetic */ com.google.android.gms.common.api.internal.ListenerHolder zza;
    final /* synthetic */ com.google.android.gms.nearby.messages.internal.zzbv zzb;
    final /* synthetic */ com.google.android.gms.nearby.messages.SubscribeOptions zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzbl(com.google.android.gms.nearby.messages.internal.zzbw zzbwVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.common.api.internal.ListenerHolder listenerHolder, com.google.android.gms.nearby.messages.internal.zzbv zzbvVar, com.google.android.gms.nearby.messages.SubscribeOptions subscribeOptions) {
        super(googleApiClient);
        this.zza = listenerHolder;
        this.zzb = zzbvVar;
        this.zzc = subscribeOptions;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* bridge */ /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient anyClient) throws android.os.RemoteException {
        ((com.google.android.gms.nearby.messages.internal.zzai) anyClient).zzu(zza(), this.zza, this.zzb, this.zzc, null);
    }
}
