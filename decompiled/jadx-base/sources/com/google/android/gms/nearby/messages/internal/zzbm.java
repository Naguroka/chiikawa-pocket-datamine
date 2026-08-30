package com.google.android.gms.nearby.messages.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzbm extends com.google.android.gms.nearby.messages.internal.zzbt {
    final /* synthetic */ android.app.PendingIntent zza;
    final /* synthetic */ com.google.android.gms.nearby.messages.internal.zzbv zzb;
    final /* synthetic */ com.google.android.gms.nearby.messages.SubscribeOptions zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzbm(com.google.android.gms.nearby.messages.internal.zzbw zzbwVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient, android.app.PendingIntent pendingIntent, com.google.android.gms.nearby.messages.internal.zzbv zzbvVar, com.google.android.gms.nearby.messages.SubscribeOptions subscribeOptions) {
        super(googleApiClient);
        this.zza = pendingIntent;
        this.zzb = zzbvVar;
        this.zzc = subscribeOptions;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* bridge */ /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient anyClient) throws android.os.RemoteException {
        ((com.google.android.gms.nearby.messages.internal.zzai) anyClient).zzw(zza(), this.zza, this.zzb, this.zzc);
    }
}
