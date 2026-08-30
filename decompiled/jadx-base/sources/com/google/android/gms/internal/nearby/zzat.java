package com.google.android.gms.internal.nearby;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzat extends com.google.android.gms.internal.nearby.zzaw<com.google.android.gms.nearby.connection.Connections.MessageListener> {
    final /* synthetic */ com.google.android.gms.internal.nearby.zzfm zza;
    final /* synthetic */ com.google.android.gms.internal.nearby.zzav zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzat(com.google.android.gms.internal.nearby.zzav zzavVar, com.google.android.gms.internal.nearby.zzfm zzfmVar) {
        super(null);
        this.zzb = zzavVar;
        this.zza = zzfmVar;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* bridge */ /* synthetic */ void notifyListener(java.lang.Object obj) {
        com.google.android.gms.nearby.connection.Connections.MessageListener messageListener = (com.google.android.gms.nearby.connection.Connections.MessageListener) obj;
        com.google.android.gms.nearby.connection.Payload payloadZza = com.google.android.gms.internal.nearby.zzgf.zza(this.zzb.zza, this.zza.zzb());
        if (payloadZza == null) {
            android.util.Log.w("NearbyConnectionsClient", java.lang.String.format("Failed to convert incoming ParcelablePayload %d to Payload.", java.lang.Long.valueOf(this.zza.zzb().zza())));
        } else {
            if (payloadZza.getType() != 1) {
                return;
            }
            messageListener.onMessageReceived(this.zza.zza(), payloadZza.asBytes(), this.zza.zzc());
        }
    }
}
