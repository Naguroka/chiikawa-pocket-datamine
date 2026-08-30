package com.google.android.gms.internal.nearby;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzaz extends com.google.android.gms.internal.nearby.zzaw<com.google.android.gms.nearby.connection.PayloadCallback> {
    final /* synthetic */ java.lang.String zza;
    final /* synthetic */ com.google.android.gms.nearby.connection.PayloadTransferUpdate zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzaz(com.google.android.gms.internal.nearby.zzbb zzbbVar, java.lang.String str, com.google.android.gms.nearby.connection.PayloadTransferUpdate payloadTransferUpdate) {
        super(null);
        this.zza = str;
        this.zzb = payloadTransferUpdate;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* bridge */ /* synthetic */ void notifyListener(java.lang.Object obj) {
        java.lang.String str = this.zza;
        com.google.android.gms.nearby.connection.PayloadTransferUpdate.Builder builder = new com.google.android.gms.nearby.connection.PayloadTransferUpdate.Builder(this.zzb);
        builder.setStatus(2);
        ((com.google.android.gms.nearby.connection.PayloadCallback) obj).onPayloadTransferUpdate(str, builder.build());
    }
}
