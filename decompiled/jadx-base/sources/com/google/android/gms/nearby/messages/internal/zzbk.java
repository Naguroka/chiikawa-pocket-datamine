package com.google.android.gms.nearby.messages.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzbk extends com.google.android.gms.nearby.messages.internal.zzbt {
    final /* synthetic */ com.google.android.gms.nearby.messages.Message zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzbk(com.google.android.gms.nearby.messages.internal.zzbw zzbwVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.nearby.messages.Message message) {
        super(googleApiClient);
        this.zza = message;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* bridge */ /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient anyClient) throws android.os.RemoteException {
        ((com.google.android.gms.nearby.messages.internal.zzai) anyClient).zzs(zza(), com.google.android.gms.nearby.messages.internal.zzae.zza(this.zza));
    }
}
