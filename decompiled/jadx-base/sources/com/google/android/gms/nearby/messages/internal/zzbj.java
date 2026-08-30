package com.google.android.gms.nearby.messages.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzbj extends com.google.android.gms.nearby.messages.internal.zzbt {
    final /* synthetic */ com.google.android.gms.nearby.messages.Message zza;
    final /* synthetic */ com.google.android.gms.nearby.messages.internal.zzbs zzb;
    final /* synthetic */ com.google.android.gms.nearby.messages.PublishOptions zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzbj(com.google.android.gms.nearby.messages.internal.zzbw zzbwVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.nearby.messages.Message message, com.google.android.gms.nearby.messages.internal.zzbs zzbsVar, com.google.android.gms.nearby.messages.PublishOptions publishOptions) {
        super(googleApiClient);
        this.zza = message;
        this.zzb = zzbsVar;
        this.zzc = publishOptions;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* bridge */ /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient anyClient) throws android.os.RemoteException {
        ((com.google.android.gms.nearby.messages.internal.zzai) anyClient).zzr(zza(), com.google.android.gms.nearby.messages.internal.zzae.zza(this.zza), this.zzb, this.zzc);
    }
}
